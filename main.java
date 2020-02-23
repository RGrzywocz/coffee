package machine;
import java.util.*;
class Machine{
    int milk=540;
    int water=400;
    int coffeeBeans=120;
    int cups=9;
    int money=550;
    
    void setWater(int water){
        this.water=water;
    }
    void setMilk(int milk){
        this.milk=milk;
    }
    void setCoffeeBeans(int coffeeBeans){
        this.coffeeBeans=coffeeBeans;
    }
     void setMoney(int money){
        this.money=money;
    }
     void setCups(int cups){
        this.cups=cups;
    }
    int getCups(){
        return this.cups;
    }
    int getMoney(){
        return this.money;
    }
    int getWater(){
        return this.water;
    }
    int getMilk(){
        return this.milk;
    }
    int getCoffeeBeans(){
        return this.coffeeBeans;
    }
    void take(){
        System.out.println("I gave you $"+money);
        money=0;
    }
    void fill(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Write how many ml of water do you want to add: ");
        water+=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Write how many ml of milk do you want to add: ");
        milk+=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Write how many grams of coffee beans do you want to add: ");
        coffeeBeans+=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Write how many disposable cups of coffee do you want to add: ");
        cups+=scanner.nextInt();
        scanner.nextLine();
        scanner.close();
    }
    void displayStatus(){
        System.out.println("The coffee machine has:");
        System.out.println(this.getWater()+" of water");
        System.out.println(this.getMilk()+" of milk");
        System.out.println(this.getCoffeeBeans()+" of coffee beans");
        System.out.println(this.getCups()+" of disposable cups");
        System.out.println(this.getMoney()+" of money");
    }
    void buy(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        int choose=0;
        if(scanner.hasNextInt()){
        choose=scanner.nextInt();
        }
        String other=scanner.nextLine();
        
        switch(choose){
           
            case 1:
                if(water<250){
                    System.out.println("Sorry, not enough water!");
                    break;
                }
                this.water-=250;
                this.coffeeBeans-=16;
                this.money+=4;
                cups-=1;
                System.out.println("I have enough resources, making you a coffee!");
                break;
            case 2:
                if(water<350){
                    System.out.println("Sorry, not enough water!");
                    break;
                }
                this.water-=350;
                this.milk-=75;
                this.coffeeBeans-=20;
                this.money+=7;
                cups-=1;
                System.out.println("I have enough resources, making you a coffee!");
                break;
            case 3:
                 if(water<200){
                    System.out.println("Sorry, not enough water!");
                    break;
                }
                this.water-=200;
                this.milk-=100;
                this.coffeeBeans-=12;
                this.money+=6;
                cups-=1;
                System.out.println("I have enough resources, making you a coffee!");
                break;
            default:
            break;
        }
        }
   
    int howManyCoffeeCanProduce(){
        int min=Integer.MAX_VALUE;
        if(getMilk()/50<min)min=getMilk()/50;
        if(getWater()/200<min)min=getWater()/200;
        if(getCoffeeBeans()/15<min)min=getCoffeeBeans()/15;
        return min;
    }
} 
public class CoffeeMachine {
    public static void main(String[] args) {
        Machine machine=new Machine();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        String input;
        boolean program=true;
        while(program){
        input=scanner.nextLine();
        switch(input){
            case "buy":
                machine.buy();
                break;
            case "fill":
                machine.fill();
                break;
            case "take":
                machine.take();
                break;
            case "remaining":
                machine.displayStatus();
                break;
            case "exit":
                program=false;
        }
        }
        
        }
     
    }


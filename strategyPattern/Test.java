public class Test{
    public static void main(String[] args) {
        CoffeMaker cm = new CoffeMaker();
        CoffeMaker capuM = new CappuccinoMaker();
        
        cm.setCoffee(new Cappuccino());
        cm.makeCoffee();
        cm.setCoffee(new FlatWhite());
        cm.makeCoffee();
        capuM.makeCoffee();
    }
}
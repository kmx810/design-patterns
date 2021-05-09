public class CoffeMaker {
    
    private Preparable p;

    public CoffeMaker(){

    }

    public void setCoffee(Preparable coffee){
        p = coffee;
    }

    public void makeCoffee(){
        p.prepare();
    }
}

package inheritanceDemo;

public class BMW extends Cars {
    public BMW (int startSpeed){
        super(startSpeed);
    }

    @Override
    public void increaseSpeed (){
        System.out.println("Increasing speed BMW");
    }

    public void headUpNav(){
        System.out.println("BMW unique");
    }
}

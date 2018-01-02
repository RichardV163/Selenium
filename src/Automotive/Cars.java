package inheritanceDemo;

public class Cars {

    int speed;
    String brand;

    public Cars(int startSpeed){
        speed = startSpeed;
    }

    public void increaseSpeed(){
        speed++;
        System.out.println("Increase Speed");
    }

    public void decreaseSpeed(){
        speed--;
        System.out.println("Decrease speed");
    }
}

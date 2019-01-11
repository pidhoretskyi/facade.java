/**
 * Created by pidho on 12.04.2018.
 */
public class Grass {
    public Grass() {

        System.out.print("Grass: Created\n");
    }

    public void update() {
        System.out.print("Grass: Update\n");
    }

    public void stop() {
        System.out.print("Grass: Stop\n");
    }
    public void reset() {
        System.out.print("Grass: Reset\n");
    }

    public void onRestart() {
        System.out.print("Grass: onRestart\n");
    }

    public void start(){
        System.out.print("Grass: Start\n");
    }

    public String getPosition(){
        return "Grass";
    }
}

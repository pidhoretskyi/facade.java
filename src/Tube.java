/**
 * Created by pidho on 12.04.2018.
 */
public class Tube {


    public Tube(){
        System.out.print("Tube: Created\n");
    }

    public String getPossition(){
        return "Tube";
    }
    public void update() {
        System.out.print("Tube: Update\n");
    }

    public void stop() {
        System.out.print("Tube: Stop\n");
    }
    public void reset() {
        System.out.print("Tube: Reset\n");
    }

    public void onRestart() {
        System.out.print("Tube: onRestart\n");
    }

    public void start(){
        System.out.print("Tube: Start\n");
    }

}

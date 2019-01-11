/**
 * Created by pidho on 12.04.2018.
 */
public class Handler {
    private Grass frontGrass, backGrass;
    private Tube tube1, tube2, tube3;

    public Handler(){
        this.frontGrass = new Grass();
        this.backGrass = new Grass();
        this.tube1 = new Tube();
        this.tube2 = new Tube();
        this.tube3 = new Tube();
        System.out.print("Facade: Created");
    }

    public void start(){
        this.frontGrass.start();
        this.backGrass.start();
        this.tube1.start();
        this.tube2.start();
        this.tube3.start();
    }

    public void stop(){
        this.frontGrass.stop();
        this.backGrass.stop();
        this.tube1.stop();
        this.tube2.stop();
        this.tube3.stop();
    }

    public void update(){
        this.frontGrass.update();
        this.backGrass.update();
        this.tube1.update();
        this.tube2.update();
        this.tube3.update();
    }

    public void onRestart(){
        this.frontGrass.onRestart();
        this.backGrass.onRestart();
        this.tube1.onRestart();
        this.tube2.onRestart();
        this.tube3.onRestart();
    }

    public void reset(){
        this.frontGrass.reset();
        this.backGrass.reset();
        this.tube1.reset();
        this.tube2.reset();
        this.tube3.reset();
    }

    public void help(){
        System.out.print("Operation:\n");
        System.out.print("update - to update all obj animation\n");
        System.out.print("stop - to stop all obj animation\n");
        System.out.print("start - to start all obj animation\n");
        System.out.print("onRestart - to restart all obj position\n");
        System.out.print("reset - to reset all obj data\n");
        System.out.print("help - to print all commands\n");
    }
}

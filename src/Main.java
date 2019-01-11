import java.util.Scanner;

/**
 * Created by pidho on 12.04.2018.
 */
public class Main {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Creating Facade:\n");
        Handler facade= new Handler();
        facade.help();
        do{
            System.out.print("What you want to do?\n");
            String choise = in.nextLine();
            if(choise.compareTo("update")==0) {
                facade.update();
            }
            else if(choise.compareTo("start")==0){
                facade.start();

            }
            else if(choise.compareTo("stop")==0){
                facade.stop();
            }
            else if(choise.compareTo("onRestart")==0){
                facade.onRestart();
            }
            else if(choise.compareTo("reset")==0){
                facade.reset();
            }
            else if(choise.compareTo("help")==0){
                facade.help();
            }
            else {
                System.out.print("Unknown command\n");
                facade.help();
            }
            System.out.print("Do you want to try again? (y-yes, n-no): ");
            choise = in.nextLine();
            if(choise.compareTo("y")!=0) break;

        }while(true);
    }
}

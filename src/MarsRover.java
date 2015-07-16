/**
 * Created by darahul on 16/07/15.
 */
public class MarsRover {
    int limitX;
    int limitY;
    int x;
    int y;
    char dir;
    public MarsRover(int lX,int lY,int rX,int rY,char rD){
        limitX=lX;
        limitY=lY;
        x=rX;
        y=rY;
        dir=rD;
    }
    public MarsRover(){}
    int move(){
        switch(dir){
            case 'N': y++;break;
            case 'S': y--;break;
            case 'E': x++;break;
            case 'W': x--;break;
            default: System.out.println("Wrong Direction input");
        }
        if(x>limitX || y >limitY|| x<0 || y<0){
            System.out.println("Rover is out of bounds!!");
            return 0;
        }
        return 1;
    }
    void turn(char d){
        if(d=='L'){
            switch(dir){
                case 'N': dir='W';break;
                case 'S': dir='E';break;
                case 'E': dir='N';break;
                case 'W': dir='S';break;
                default: System.out.println("Wrong Turn Input");
            }
        }
        else if(d=='R'){
            switch(dir){
                case 'N': dir='E';break;
                case 'S': dir='W';break;
                case 'E': dir='S';break;
                case 'W': dir='N';break;
                default: System.out.println("Wrong Turn Input");
            }
        }
    }
    void roverPosition(){
        System.out.println(x + " " + y + " " + dir);
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by darahul on 16/07/15.
 */
public class MarsRoverDriver {
    public static void main(String[] args){
        //int inp;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String[] plateauSize = br.readLine().split(" ");
            String roverPosition=null;
            String instructions=null;
            while((roverPosition=br.readLine()) != null){
                String[] roverPositionTokens = roverPosition.split(" ");
                MarsRover rover = new MarsRover(Integer.parseInt(plateauSize[0]),Integer.parseInt(plateauSize[1]),Integer.parseInt(roverPositionTokens[0]),Integer.parseInt(roverPositionTokens[1]),roverPositionTokens[2].charAt(0));
                instructions=br.readLine();
                for(int i=0;i<instructions.length();i++){
                    switch(instructions.charAt(i)){
                        case 'L':rover.turn('L');break;
                        case 'R':rover.turn('R');break;
                        case 'M':rover.move();break;
                    }
                }
                rover.roverPosition();
            }
        } catch (NumberFormatException ex) {
            System.out.println("Invalid Input");
        } catch (IOException ex) {
            System.out.println("IO Error");
        }
    }
}

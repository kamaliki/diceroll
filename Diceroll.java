
package diceroll;
//declare the class of dice roll
public class Diceroll {
    //declare a main method for the class
    public static void main(String[] args) {
        //declare and initialize the six faces
        double face_one = 0;
        double face_two = 0;
        double face_three = 0;
        double face_four = 0;
        double face_five = 0;
        double face_six = 0;
        //declare an integer to hold the number of rolls
        int roll;
        for(roll=1; roll<=1000; roll++){    //loop through each roll 1 to 1000 times
            //declare a random number generator inside the loop
            double random_ = Math.random();
            
            if(random_ < 1. / 6.){
                face_one++;         //increment each face value by one if generated
            }else if(random_ < 2. / 6.){
                face_two++;
            }else if(random_ < 3. / 6.){
                face_three++;
            }else if(random_ < 4. / 6.){
                face_four++;        
            }else if(random_ < 5. / 6.){
                face_five++;
            }else if(random_ < 6. / 6.){
                face_six++;
            }
        }//close the for loop
        // print out the results with appropriate formatting
        System.out.printf("%s\t%s\t%s\n", "Face","Frequency","Percentage");
        System.out.printf("1:\t%.0f\t\t%.1f%%\n", face_one, face_one/10);
        System.out.printf("2:\t%.0f\t\t%.1f%%\n", face_two, face_two/10);
        System.out.printf("3:\t%.0f\t\t%.1f%%\n", face_three, face_three/10);
        System.out.printf("4:\t%.0f\t\t%.1f%%\n", face_four, face_four/10);
        System.out.printf("5:\t%.0f\t\t%.1f%%\n", face_five, face_five/10);
        System.out.printf("6:\t%.0f\t\t%.1f%%\n", face_six, face_six/10);
        
        //calculate total frequency and percentage
        double totalFrequency = face_one+face_two+face_three+face_four+face_five+face_six;
        double totalPercentage = totalFrequency / 10;
        //print them out    
        System.out.printf("Total:\t%.0f\t\t%.1f%%\n",totalFrequency,totalPercentage);
            
        }
    }
    


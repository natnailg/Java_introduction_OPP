/** this program is an introduction to java opp, on classes and objects as well as members (feilds && methods)
**/
public class Main {
    public static void main(String[] args){
//
        //creating sportsBicycle object
        Bicycle sportsBicycle = new Bicycle();

        //creating touringBicycle object
        Bicycle touringBicycle = new Bicycle();


        //access feilds and methods
        int gear = sportsBicycle.gear;

        //output it
        System.out.println("Bike gear : " + gear);

//        sportsBicycle.gear;
        sportsBicycle.braking();


    }
}

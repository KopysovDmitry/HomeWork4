public class Main {
    public static void main(String[] args) {

        //1 task//
        int user = 17;
        if (user >= 18) {System.out.println("поздавляем с совершеннолетием!");}
        if (user < 18) {System.out.println("Нужно немного подождать");}
        //2 task//
        int child = 127;
        if (child >= 7) {System.out.println("Go to chool");}
        if (child >=18) {System.out.println("Go to university");}
        if (child >= 24) {System.out.println("Go to work");}
        //3 task//
        int pasangers = 102;
        int wagonVoliume =102;
        int seat = 60;
        int StaySeat = wagonVoliume-seat;
        if (pasangers <= 60) {System.out.println("Wagon have a available seats and staySeats");}
        if (pasangers >=60) {System.out.println ("All seats is closed, only " + StaySeat + " stayseats is available");}
        if (pasangers >=102) {System.out.println("All seats is closed");}
        //4 task//
        int user1 = 19;
        if (user1 >= 18) {System.out.println("поздавляем с совершеннолетием!");}
        else {System.out.println("Нужно немного подождать");}
        //5 task//
        int child1 = 127;
        if (child1 >=18) {System.out.println("Go to university");}
        if (child1 >= 24) {System.out.println("Go to work");}
        else {System.out.println("Go to chool");}
        //6 task//
        int pasangers1 = 100;
        int wagonVoliume1 =102;
        int seatPlace1 = 60;
        int StayPlace1 = wagonVoliume-seat;
        if (pasangers >=102) {System.out.println("All seats and stayPlaces is closed");}
        else {System.out.println ("All seats is closed, only " + StayPlace1 + " standingPlaces is available");}
        if (pasangers <= 60) {System.out.println("Wagon have a available seats and stayPlaces");}
        //8 task//
        int man = 20;
        if (man >= 2 && man<=6) {System.out.println("Go to lowschool");}
        if (man >= 7 && man<=18) {System.out.println("Go to school");}
        if (man >= 18 && man<=24) {System.out.println("Go to university");}
        if (man >= 24) {System.out.println("Go to work");}
        //9 task//
        int boy = 20;
        if (boy<=6) {System.out.println("The attraction is denied");}
        if (boy >= 5 && boy<=14) {System.out.println("The attraction is accepted only with an adult");}
        if (boy >= 14) {System.out.println("The attraction is accepted");}
        //10 task//
        int one =1;
        int two = 2;
        int fhree =3;
        if (one>two && one>fhree) {System.out.println("the biggest number is: one");}
        else {System.out.println("one is not the biggest number");}
        if (two>one && two>fhree) {System.out.println("two is the biggest number");}
        else {System.out.println("two is not the biggest number");}
        if (fhree>one && fhree>two) {System.out.println("fhree is the biggest number");}
        else {System.out.println("fhree is not the biggest number");}
        //10 task Vrrshion 1.1//
        int one1 =1;
        int two1 = 2;
        int fhree1 =3;
        int biggestNumber = 0;
        if (one1>two1 && one1>fhree1){biggestNumber = one1;} else if (two1>one1 && two1>fhree1) {biggestNumber = two1;} else if (fhree1>one1 && fhree1>two1) {biggestNumber = fhree1;}
        System.out.println("biggest number is " + biggestNumber);






    }
}

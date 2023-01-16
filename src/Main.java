public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        char color = 'r';
        switch (color) {
            case 'r':
                System.out.println("Red ! You can't go !");
                break;
            case 'y':
                System.out.println("Yellow warning !");
                break;
            case 'g':
                System.out.println("Green, you can go.");
                break;
            case 'l':
                System.out.println("Turn left.");
                break;
            default:
                System.out.println("The traffic light is broken !");
        }
        task1();
        task2();
        task3();
        task4();
        task5();

        }
    public static void task1 () {
        System.out.println("Task 1:");
        int OS = 14;
        switch (OS) {
            case 1:
                System.out.println("Install the IOS version from the link.");
                break;
            case 0 :
                System.out.println("Install the Android version from the link.");
                break;
            default:
                System.out.println("I can't recognize your OS correctly, folow the other instructions.");
        }
}

    public static void task2 () {
        System.out.println("Task 2:");
        int OS = 14;
        int phoneAge = 2016;

        if (phoneAge < 2015) {
            System.out.println("You should install the light IOS version.");
        } else {
            System.out.println("You should install the light Android version.");
        }

        switch (OS) {
            case 1:
                System.out.println("Install the IOS version from the link.");
                break;
            case 0 :
                System.out.println("Install the Android version from the link.");
                break;
            default:
                System.out.println("I can't recognize your OS correctly, folow the other instructions.");
        }
    }

    public static void task3 () {
        System.out.println("Task 3:");
                int year = 1680;
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    System.out.println(year + " is a bisextil year.");
                } else {
                    System.out.println(year + " is not a bisextil year.");
                }
            }

    public static void task4 () {
        System.out.println("Task 4:");
        var deliveryDistance = 2;
        if (deliveryDistance < 20) {
            System.out.println("The delivery should take 1 day");
        }if (deliveryDistance < 60 && deliveryDistance > 20) {
            System.out.println("The delivery should take 2 days.");
        }if (deliveryDistance < 100 && deliveryDistance > 60) {
            System.out.println("The delivery should take 3 days.");
        }if (deliveryDistance > 100){
            System.out.println("We are sorry but we don't deserve your location yet !");
        }

    }

    public static void task5 () {
        int monthNumber = 12;
        if (monthNumber > 12) {
            System.out.println("The number of the moth is incorect !");
            return;
        }
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Automn");
                break;
            default:
                System.out.println("The number of the moth is incorect !");
                break;
        }
    }
}






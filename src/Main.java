import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    private static List<String> currentlist = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int menuitem = -1;
        while (menuitem != 0) {
            menuitem = menu();
            switch (menuitem) {
                case 1:
                    showlist();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    removeItem();
                    break;
                case 0:
                    System.out.println("program exited");
                    break;
                default:
                    System.out.println("enter a valid number");
            }
        }
    }

    public static int menu() {
        System.out.println("\n\nTO DO list");
        System.out.println("---------");
        System.out.println("MAIN MENU");
        System.out.println("______________");
        System.out.println("USE NUMERIC PAD TO MAKE A CHOICE");
        System.out.println("0-EXIT");
        System.out.println("1- Display list");
        System.out.println("2-Add an item");
        System.out.println("3-Remove an item");
        System.out.println();
        ;
        System.out.println("ENTER CHOICE (0 to 3)");
        int choice = scanner.nextInt();
        return choice;
    }

    public static void showlist() {
        System.out.println();
        System.out.println("  CURRENT List");
        System.out.println();
        System.out.println("__________");
        int number = 0;
        for (String item : currentlist) {
            System.out.println(++number + "  " + item);}
            if (currentlist.size()==0)
                System.out.println("LIST IS CURRENTLY EMPTY.  ADD tasks");

    }

    public static void addItem(){
        System.out.println("ADD ITEM");
        System.out.println("_____");
        System.out.println("ENTER TASK");

        String item=scanner.nextLine();
        item=scanner.nextLine();
        currentlist.add(item);
        showlist();
    }

    public static void removeItem(){
        System.out.println("REMOVE AN ITEM");
        System.out.println();
        System.out.println("select which item you want to remove");
        int num=scanner.nextInt();
        while (num<=0|| num>currentlist.size()) {
            System.out.println("enter a valid number");
            num = scanner.nextInt();
        }
        currentlist.remove(num-1);
        System.out.println("------");
    }
}

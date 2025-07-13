import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("\n--- TO-DO LIST MENU ---");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Delete Task");
            System.out.println("4. Edit Task");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            option = scanner.nextInt();
            scanner.nextLine(); // consume newLine

            switch (option) {
                case 1:
                System.out.print("Enter your task: ");
                String task = scanner.nextLine();
                tasks.add(task);
                System.out.println("Task added.");
                break;
                case 2:
                System.out.println("\n Your Tasks:");
                if (tasks.isEmpty()) {
                    System.out.println("No tasks yet. ");
                } else {
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println((i + 1)+ "." + tasks.get(i));
                    }
                }
                break;
                case 3:
                if (tasks.isEmpty()) {
                    System.out.println("No tasks to delete.");
                } else{
                    System.out.println("\n Select the number of the task to delete:");
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println((i + 1) + "." + tasks.get(i));
                    }
                    System.out.print("Enter task number: ");
                    int deleteIndex = scanner.nextInt();
                    scanner.nextLine(); // consume newline

                    if (deleteIndex > 0 && deleteIndex<= tasks.size()) {
                        String removedTask = tasks.remove(deleteIndex - 1);
                        System.out.println(" Task deleted: " + removedTask);
                    } else{
                        System.out.println("Invalid task number.");
            
                    }
                    
                }
                break;
                case 4:
                if (tasks.isEmpty()) {
                    System.out.println("No tasks to edit.");
                } else{
                    System.out.println("\n Select the number of the task to edit:");
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println((i + 1) + "."+ tasks.get(i));
                    }
                    System.out.print("Enter task number: ");
                    int editIndex = scanner.nextInt();
                    scanner.nextLine(); // consume newline

                    if (editIndex > 0 && editIndex <= tasks.size()) {
                        System.out.print("Enter new task text: ");
                        String newTask = scanner.nextLine();
                        tasks.set(editIndex - 1, newTask);
                        System.out.println(" Task updated.");
                    } else{
                        System.out.println("Invalid task number.");
                    }
                }
                break;
                default:
                    System.out.println("Invalid option.");
                    break;
            }
        } while (option != 5);
        System.out.println("Exiting...");
        scanner.close();
    }
}
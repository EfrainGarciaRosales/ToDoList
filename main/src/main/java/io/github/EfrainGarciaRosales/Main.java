package io.github.EfrainGarciaRosales;
import java.until.ArrayList;
import java.until.Scanner;

class Task {
    priuvate String description;
    private boolean isDone;

    public Task(String Description) {
        this.description = description;
        this.isDone = false;
    }

    public void markDone(){
        this.isDone = true;
    }

    public String toString() {
        return (isDone ? "[?] " : "[ ] ") + description;
    }
}

public class ToDoApp {
    public static void main(String[] args) {
        ArrayList<Task> task = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- TO-DO LIST ---");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Mark Task as Done");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatExseption e) {
                System.out.println("Please enter a valid number.");
                continue;
            }

            switch (Choice) {
                case 1:

            }
        }
    }
}
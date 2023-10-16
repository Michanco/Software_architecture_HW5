package calculatorHW5.calculator;


import calculatorHW5.view.ExampleVew;
import calculatorHW5.view.InputData;

import java.util.Scanner;


public class Calculator {
    Double result;

    public void run (){
        InputData input = new InputData();
        Scanner scanner = new Scanner(System.in);
        ExampleVew exampleVew = new ExampleVew();
        System.out.println("Введите");
        String inputData = scanner.nextLine().toLowerCase();
        if (input.checkDouble(inputData)) {
            System.out.println("Это  аргумент");
            exampleVew.add(inputData);
            // Использует ввод в качестве аргумента
        }
        else if (input.checkActions(inputData)) {
            System.out.println("Это действие");
            exampleVew.add(inputData);
            // Использует ввод в качестве действия
        }
        else System.out.println("Это не то что надо");

    }


}

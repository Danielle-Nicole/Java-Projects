{\rtf1\ansi\ansicpg1252\cocoartf2511
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 /*\
 * To change this license header, choose License Headers in Project Properties.\
 * To change this template file, choose Tools | Templates\
 * and open the template in the editor.\
 */\
package atmsimdoloop;\
\
import java.text.DecimalFormat;\
import java.util.Scanner;\
\
/**\
 *\
 * @author danielleaiello\
 */\
public class AtmSimDoLoop \{\
\
    /**\
     * @param args the command line arguments\
     */\
    public static void main(String[] args) \{\
        String choiceBalance = "1";\
        String choiceDeposit = "2";\
        String choiceWithdrawl = "3";\
        String choiceQuit = "4";\
\
        double balance = 300.00;\
        double deposit ;\
        deposit = 0;\
        double withdrawl;\
        withdrawl = 0;\
        \
        String userInput;\
      \
            \
      \
        DecimalFormat twoPlaces = new DecimalFormat("#0.00");   \
        Scanner input = new Scanner(System.in);\
        \
        \
        // telling program to check outputs from users\
         do \{\
            \
        System.out.println("1 Balance\\n2 Deposit\\n3 Withdrawl\\n4 Quit");\
        System.out.println("Please enter the desired transaction you want: ");\
        userInput = input.nextLine();\
        if (userInput.equals(choiceBalance))\{\
            System.out.println("You're current balance is $" + twoPlaces.format(balance)+ ".");    \
        \} else if (userInput.equals(choiceDeposit)) \{\
            System.out.print("How much would you like to deposit? ");\
            deposit = input.nextDouble();\
            balance = balance + deposit;\
            System.out.println("You're new balance is $" + twoPlaces.format(balance)+ ".");\
\
        \} else if (userInput.equals(choiceWithdrawl)) \{\
            System.out.print("How much would you like to withdrawl? ");\
            withdrawl = input.nextDouble();\
            if (balance < withdrawl)\{\
                System.out.println("Insufficient funds.");\
                System.out.println("You're current balance is $" + twoPlaces.format(balance)+ ".");\
            \} else \{\
                balance = balance - withdrawl;\
                System.out.println("You're new balance is $" + twoPlaces.format(balance)+ ".");\
            \} \
        \} else if (userInput.equals(choiceQuit)) \{\
            System.out.println("Good-bye");\
        \} \
        \} while (!userInput.equals(choiceQuit));\
    \}\
    \
\}\
}
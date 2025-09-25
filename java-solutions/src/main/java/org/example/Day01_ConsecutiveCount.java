package org.example;

public class Day01_ConsecutiveCount {
        public static void main(String[] args) {
            String input = "AABBBBCCCDDAA";
            //String input = "";
            int count = 1;
            if (input == null || input.isEmpty()) {
                System.out.println("Input is empty.");
                return;
            }
            for(int i=0;i<input.length()-1;i++){
                if(input.charAt(i)==input.charAt(i+1)){
                    count++;
                }
                else {
                    System.out.println(count + " "+input.charAt(i));
                    count = 1;

                }
            }
            System.out.println(count + " "+input.charAt(input.length()-1));
        }
}

import java.util.*;
import java.io.*;

public class AdaAndQueue {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder result = new StringBuilder();
        StringTokenizer input = new StringTokenizer(br.readLine());
        Stack<Integer> stack = new Stack<Integer>();

        int test = Integer.parseInt(input.nextToken());
        int number = -1;
        boolean flag = true;
        char firstChar;
        while(test-- > 0) {
            input = new StringTokenizer(br.readLine());
            firstChar = input.nextToken().charAt(0);

            if (flag) {
                switch (firstChar) {
                    case 't': {
                        number = Integer.parseInt(input.nextToken());
                        stack.add(0, number);
                        break;
                    }
                    case 'p': {
                        number = Integer.parseInt(input.nextToken());
                        stack.add(number);
                        break;
                    } 
                    case 'f': {
                        if (stack.empty()) {
                            result.append("No job for Ada?\n");
                            // result.append(stack.toString() + "\n");
                        } else {
                            result.append(stack.firstElement() + "\n");
                            stack.remove(stack.get(0));
                            // result.append(stack.toString() + "\n");   
                        }
                        break;
                    }
                    case 'b': {
                        if (stack.empty()) {
                            result.append("No job for Ada?\n");
                            // result.append(stack.toString() + "\n");
                
                        } else {
                            result.append(stack.pop() + "\n");
                            // result.append(stack.toString() + "\n");
                        }
                        break;
                    }
                    default: {
                        flag = !flag;
                    }
                    
                }
            } else {
                switch (firstChar) {
                    case 'p': {
                        number = Integer.parseInt(input.nextToken());
                        stack.add(0, number);
                        break;
                    }
                    case 't': {
                        number = Integer.parseInt(input.nextToken());
                        stack.add(number);
                        break;
                    } 
                    case 'b': {
                        if (stack.empty()) {
                            result.append("No job for Ada?\n");
                            // result.append(stack.toString() + "\n");
                        } else {
                            result.append(stack.firstElement() + "\n");
                            stack.remove(stack.get(0));
                            // result.append(stack.toString() + "\n");   
                        }
                        break;
                    }
                    case 'f': {
                        if (stack.empty()) {
                            result.append("No job for Ada?\n");
                            // result.append(stack.toString() + "\n");
                
                        } else {
                            result.append(stack.pop() + "\n");
                            // result.append(stack.toString() + "\n");
                        }
                        break;
                    }
                    default: {
                        flag = !flag;
                    }
                    
                }
            }
            
        }
            
        bw.write(result + "");
        br.close();
        bw.close();
        
    }
}

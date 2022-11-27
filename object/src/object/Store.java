package object;

import java.util.HashMap;

public class Store {
    public static void main(String[] args) {

        HashMap<Integer, Product> map;
        map = new HashMap<Integer, Product>();

        map.put(1, new Product(1,"Notebook", 1500.00));
        map.put(2, new Product(2,"Mouse", 30.00));
        map.put(3, new Product(3,"Keyboard", 80.00));
        map.put(4, new Product(4,"Screen", 400.00));
        map.put(5, new Product(5,"Printer", 650.00));

        int codeSearch = 7;

        Product p = map.get(codeSearch);

        if(p != null){
            System.out.println("I found: " + p);
        }else{
            System.out.println("Not found");
        }
    }
}
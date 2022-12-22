package com.driver;

public class Main {

    public static class Product {

        public int product(int x, int y) {
            return (x * y);
        }

        public int product(int x, int y, int z) {
            return (x * y * z);
        }

        public double product(double x, double y) {
            return (x * y);
        }
    }
    public static void main(String[] args){
    Product obj1=new Product();
    obj1.product(1,2);
    Product obj2=new Product();
    obj.product(1,2,3);
    Product obj3=new Product();
    obj3.product(2.0,3.0);
    }
}

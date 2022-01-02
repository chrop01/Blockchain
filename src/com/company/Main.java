package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        String statement = "Hello";
        int hashvalue = statement.hashCode();

        ArrayList<Block> blockchain = new ArrayList<Block>();
        String[] initialvalues = {"$700, $550"};
        Block firstblock = new Block(initialvalues, 0);
    }
}

package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        String statement = "Hello";
        int hashvalue = statement.hashCode();

        ArrayList<Block> blockchain = new ArrayList<Block>();


        String[] initialvalues = {"$700, $550"};
        Block firstblock = new Block(initialvalues, 0);
        blockchain.add(firstblock);

        System.out.println("First block: " + firstblock.toString());
        System.out.println("Chain: " + blockchain .toString());

        String[] Send = {"$50, $10"};
        Block secondblock = new Block(Send, firstblock.getBlockHash());
        blockchain.add(secondblock);


        System.out.println("Second block: " + secondblock.toString());
        System.out.println("Chain: " + blockchain .toString());
    }
}

package com.company;

import java.util.Arrays;

public class Block {

    private String[] transcactions; //external
    private int blockHash;
    private int previousBlockHash; //external


    public Block(String[] transcactions, int previousBlockHash) {
        super();
        this.transcactions = transcactions;
        this.previousBlockHash = previousBlockHash;
        //1 -> hash from the array of transactions | 2-> previous hash
        this.blockHash = Arrays.hashCode(new int[] {Arrays.hashCode(transcactions),this.previousBlockHash});

    }

    public String[] getTranscactions() {
        return transcactions;
    }

    public void setTranscactions(String[] transcactions) {
        this.transcactions = transcactions;
    }

    public int getBlockHash() {
        return blockHash;
    }

    public void setBlockHash(int blockHash) {
        this.blockHash = blockHash;
    }

    public int getPreviousBlockHash() {
        return previousBlockHash;
    }

    public void setPreviousBlockHash(int previousBlockHash) {
        this.previousBlockHash = previousBlockHash;
    }

    @Override
    public String toString() {
        return "Block{" +
                "transcactions=" + Arrays.toString(transcactions) +
                ", blockHash=" + blockHash +
                ", previousBlockHash=" + previousBlockHash +
                '}';
    }
}

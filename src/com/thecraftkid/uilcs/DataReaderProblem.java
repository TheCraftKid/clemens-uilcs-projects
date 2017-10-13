package com.thecraftkid.uilcs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class DataReaderProblem {

    private String filename;

    protected DataReaderProblem(String filename) {
        this.filename = filename;
    }

    public List<Integer> readData() {
        Scanner scanner = new Scanner(filename);
        List<Integer> numbers = new ArrayList<>();
        while (scanner.hasNext()) {
            numbers.add(scanner.nextInt());
        }
        return numbers;
    }
}

package br.edu.ifpb.report.controller;

public abstract class Report{

     public void generate() {
        createDatabaseConnection();
        executeQuery();
        convert();
    }

    public void createDatabaseConnection() {
        System.out.println("Creating Database Connection...");
        connector.createConnection();
    }

    public void executeQuery() {
        System.out.println("Executing Query...");
        String query = "SELECT * FROM expenses";
        connector.runQuery(query);
    }

    public void convert() {
        System.out.println("Converting...");
        String arq = converter(arq);
        
    }
}
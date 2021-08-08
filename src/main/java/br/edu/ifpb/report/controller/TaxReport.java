package br.edu.ifpb.report.controller;

import br.edu.ifpb.report.database.MysqlDatabaseConnector;

public class TaxReport {

    private MysqlDatabaseConnector connector = new MysqlDatabaseConnector();

    // public void generate() {
    //     createDatabaseConnection();
    //     executeMySQLQuery();
    //     convertToPDF();
    // }

    // public void createDatabaseConnection() {
    //     System.out.println("Creating Database Connection...");
    //     connector.openConnection();
    // }

    // public void executeQuery() {
    //     System.out.println("Executing MySQL Query...");
    //     String query = "SELECT * FROM taxes";
    //     connector.executeQuery(query);
    // }

    // public void convert() {
    //     System.out.println("Converting To PDF...");
    //     String arq = converter(arq);
    // }

    public void converter(String arq){
        System.out.println("Arquivo convertido para PDF");
    }
}

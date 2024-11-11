package org.factoriaf5.computerstore;

public class Computers {

    private int computerId;
    private String computerBrand;
    private int memorySize;
    private String processor;
    private String operativeSystem;
    private double price;


    public Computers(int id, String computerBrand, int memorySize, String processor, String operativeSystem, double price) {
        this.computerId = id;
        this.computerBrand = computerBrand;
        this.memorySize = memorySize;
        this.processor = processor;
        this.operativeSystem = operativeSystem;
        this.price = price;
    }

    public Computers() {
        
    }
    
    public int getComputerId() {
        return computerId;
    }
    public void setComputerId(int computerId) {
        this.computerId = computerId;
    }
    public String getComputerBrand() {
        return computerBrand;
    }
    public void setComputerBrand(String computerBrand) {
        this.computerBrand = computerBrand;
    }
    public int getMemorySize() {
        return memorySize;
    }
    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }
    public String getProcessor() {
        return processor;
    }
    public void setProcessor(String processor) {
        this.processor = processor;
    }
    public String getOperativeSystem() {
        return operativeSystem;
    }
    public void setOperativeSystem(String operativeSystem) {
        this.operativeSystem = operativeSystem;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}

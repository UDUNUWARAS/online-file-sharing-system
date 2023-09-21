package com.mycompany.server1;




public class myFile {
    
    private int id;
    private String name;
    private  byte[] data;
    private String flieExtension;

    public myFile(int id, String name, byte[] data, String flieExtension) {
        this.id = id;
        this.name = name;
        this.data = data;
        this.flieExtension = flieExtension;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    public void setFlieExtension(String flieExtension) {
        this.flieExtension = flieExtension;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public byte[] getData() {
        return data;
    }

    public String getFlieExtension() {
        return flieExtension;
    }
    
    
    
}

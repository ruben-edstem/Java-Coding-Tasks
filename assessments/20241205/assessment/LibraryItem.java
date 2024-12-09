package com.edstem.ecld.assessment;

abstract class LibraryItem {
    private String id;
    private String title;
    private boolean available;

    public LibraryItem(String id, String title) {
        this.id = id;
        this.title = title;
        this.available = true;
    }

    public abstract double calculateLateFee(int daysLate);
    public String getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public boolean isAvailable() {
        return available;
    }
    public void setAvailable(boolean available) {
        this.available = available;
    }
}
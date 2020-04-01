package com.example.practice10_braford;

public class Comment {
    private long id;
    private String comment;
    private String rating;

    //public Comment(long id, String comment){
        //this.id = id;
        //this.comment = comment;
    //}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getRating(){
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    // Will be used by the ArrayAdapter in the ListView
    @Override
    public String toString() {
        return comment + ", Rating: " + rating;
    }
}


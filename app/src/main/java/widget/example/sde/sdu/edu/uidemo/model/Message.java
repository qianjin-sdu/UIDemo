package widget.example.sde.sdu.edu.uidemo.model;

/**
 * description:
 * DwAndroidCourseDemo : 44:
 * Created by chengz on 2016/9/18.
 * Copyright (c) 2016.DareWay  Inc. All rights reserved.
 */
public class Message {
    int id;
    private String title, content, date;

    public Message() {

    }

    public Message(int id, String title, String content, String date) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}

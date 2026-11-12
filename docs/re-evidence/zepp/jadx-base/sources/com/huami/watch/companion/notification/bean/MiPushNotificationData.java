package com.huami.watch.companion.notification.bean;

/* JADX INFO: loaded from: classes16.dex */
public class MiPushNotificationData {
    private int id;
    private String text;
    private String title;

    public int getId() {
        return this.id;
    }

    public String getText() {
        return this.text;
    }

    public String getTitle() {
        return this.title;
    }

    public void setId(int i) {
        this.id = i;
    }

    public void setText(String str) {
        this.text = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public String toString() {
        return "id=" + this.id + ",title=" + this.title + ",text=" + this.text;
    }
}

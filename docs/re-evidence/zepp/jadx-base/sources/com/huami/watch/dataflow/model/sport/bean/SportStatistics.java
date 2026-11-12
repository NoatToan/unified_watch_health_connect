package com.huami.watch.dataflow.model.sport.bean;

import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes16.dex */
public class SportStatistics {
    private double calorie;
    private int count;
    private String date;
    private double dis;
    private int runtime;

    public double getCalorie() {
        return this.calorie;
    }

    public int getCount() {
        return this.count;
    }

    public String getDate() {
        return this.date;
    }

    public double getDis() {
        return this.dis;
    }

    public int getRuntime() {
        return this.runtime;
    }

    public void setCalorie(double d) {
        this.calorie = d;
    }

    public void setCount(int i) {
        this.count = i;
    }

    public void setDate(String str) {
        this.date = str;
    }

    public void setDis(double d) {
        this.dis = d;
    }

    public void setRuntime(int i) {
        this.runtime = i;
    }

    public String toString() {
        return "<Runtime : " + this.runtime + ", Calories : " + this.calorie + ", Distances : " + this.dis + ", Count : " + this.count + SearchCriteria.GT;
    }
}

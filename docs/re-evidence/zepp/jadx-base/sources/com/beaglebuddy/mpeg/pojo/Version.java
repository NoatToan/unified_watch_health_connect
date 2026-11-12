package com.beaglebuddy.mpeg.pojo;

/* JADX INFO: loaded from: classes2.dex */
public class Version {
    private int a;
    private int b;
    private char c;

    public Version(int i, int i2, char c) {
        this.a = i;
        this.b = i2;
        this.c = c;
    }

    public char getFlag() {
        return this.c;
    }

    public int getMajor() {
        return this.a;
    }

    public int getMinor() {
        return this.b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(this.a);
        sb.append(".");
        sb.append(this.b);
        char c = this.c;
        sb.append(c == ' ' ? Character.valueOf(c) : "");
        return sb.toString();
    }
}

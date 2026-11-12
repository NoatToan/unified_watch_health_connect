package com.xiaomi.hm.health.bodyfat.model;

/* JADX INFO: loaded from: classes19.dex */
public class ScoreParamsObject {
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private int f;
    private int g;
    private int h;
    private float i;
    private int j;
    private int k;
    private int l;
    private float m;
    private int n;
    private String o;

    public int getAge() {
        return this.j;
    }

    public int getColorState() {
        return this.f;
    }

    public int getHeight() {
        return this.k;
    }

    public String getHintInfo() {
        return this.e;
    }

    public String getLevel() {
        return this.d;
    }

    public String getParamsName() {
        return this.a;
    }

    public String getParamsValue() {
        return this.b;
    }

    public int getSex() {
        return this.l;
    }

    public int getType() {
        return this.g;
    }

    public String getUid() {
        return this.o;
    }

    public int getUnit() {
        return this.n;
    }

    public String getUnitValue() {
        return this.c;
    }

    public float getWeight() {
        return this.m;
    }

    public int getWfType() {
        return this.h;
    }

    public float getWfValue() {
        return this.i;
    }

    public void setAge(int i) {
        this.j = i;
    }

    public void setColorState(int i) {
        this.f = i;
    }

    public void setHeight(int i) {
        this.k = i;
    }

    public void setHintInfo(String str) {
        this.e = str;
    }

    public void setLevel(String str) {
        this.d = str;
    }

    public void setParamsName(String str) {
        this.a = str;
    }

    public void setParamsValue(String str) {
        this.b = str;
    }

    public void setSex(int i) {
        this.l = i;
    }

    public void setType(int i) {
        this.g = i;
    }

    public void setUid(String str) {
        this.o = str;
    }

    public void setUnit(int i) {
        this.n = i;
    }

    public void setUnitValue(String str) {
        this.c = str;
    }

    public void setWeight(float f) {
        this.m = f;
    }

    public void setWfType(int i) {
        this.h = i;
    }

    public void setWfValue(float f) {
        this.i = f;
    }

    public String toString() {
        return "\n<\nparamsName:" + this.a + "\ntype:" + this.g + "\nlevel:" + this.d + "\nparamsValue:" + this.b + "\ncolorState:" + this.f + "\nhintInfo:" + this.e + "\n>\n";
    }
}

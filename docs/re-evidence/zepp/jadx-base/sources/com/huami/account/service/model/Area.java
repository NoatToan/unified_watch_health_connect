package com.huami.account.service.model;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public class Area implements Serializable {
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private SubArea g;
    private boolean h = false;

    public Area(String str, String str2, String str3, String str4, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    public boolean equals(Object obj) {
        return (obj instanceof Area) && this.c.equals(((Area) obj).getValue());
    }

    public String getAlliance() {
        return this.e;
    }

    public String getCode() {
        return this.f;
    }

    public String getKey() {
        return this.a;
    }

    public String getLanguage() {
        return this.d;
    }

    public String getName() {
        return this.b;
    }

    public SubArea getSubArea() {
        return this.g;
    }

    public String getSubAreaValue() {
        SubArea subArea = this.g;
        if (subArea == null) {
            return null;
        }
        return subArea.getValue();
    }

    public String getValue() {
        return this.c;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public void setSubArea(SubArea subArea) {
        this.g = subArea;
    }

    public String toString() {
        return "key:" + this.a + ";name=" + this.b + ";value=" + this.c + ";language:" + this.d;
    }
}

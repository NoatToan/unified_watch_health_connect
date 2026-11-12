package com.xiaomi.hm.health.databases.model;

/* JADX INFO: loaded from: classes20.dex */
public class ShoesData {
    private Integer a;
    private Integer b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private byte[] i;
    private Integer j;

    public ShoesData(Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, byte[] bArr, Integer num3) {
        this.a = num;
        this.b = num2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = bArr;
        this.j = num3;
    }

    public byte[] getData() {
        return this.i;
    }

    public String getDate() {
        return this.g;
    }

    public String getDeviceid() {
        return this.d;
    }

    public String getMac() {
        return this.c;
    }

    public String getShoesid() {
        return this.f;
    }

    public String getSn() {
        return this.e;
    }

    public Integer getSource() {
        return this.b;
    }

    public String getSummary() {
        return this.h;
    }

    public Integer getSynced() {
        return this.j;
    }

    public Integer getType() {
        return this.a;
    }

    public void setData(byte[] bArr) {
        this.i = bArr;
    }

    public void setDate(String str) {
        this.g = str;
    }

    public void setDeviceid(String str) {
        this.d = str;
    }

    public void setMac(String str) {
        this.c = str;
    }

    public void setShoesid(String str) {
        this.f = str;
    }

    public void setSn(String str) {
        this.e = str;
    }

    public void setSource(Integer num) {
        this.b = num;
    }

    public void setSummary(String str) {
        this.h = str;
    }

    public void setSynced(Integer num) {
        this.j = num;
    }

    public void setType(Integer num) {
        this.a = num;
    }

    public ShoesData() {
    }
}

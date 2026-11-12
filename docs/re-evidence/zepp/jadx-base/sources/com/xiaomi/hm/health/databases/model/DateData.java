package com.xiaomi.hm.health.databases.model;

/* JADX INFO: loaded from: classes20.dex */
public class DateData {
    private Integer a;
    private Integer b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private byte[] h;
    private String i;
    private Integer j;
    private Integer k;
    private Integer l;
    private String m;
    private String n;

    public DateData(Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, byte[] bArr, String str6, Integer num3, Integer num4, Integer num5, String str7, String str8) {
        this.a = num;
        this.b = num2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = bArr;
        this.i = str6;
        this.j = num3;
        this.k = num4;
        this.l = num5;
        this.m = str7;
        this.n = str8;
    }

    public String getData() {
        return this.g;
    }

    public byte[] getData_hr() {
        return this.h;
    }

    public String getDate() {
        return this.c;
    }

    public String getDevice_id() {
        return this.m;
    }

    public String getIndexs() {
        return this.f;
    }

    public Integer getSource() {
        return this.b;
    }

    public String getStageStepsSummary() {
        return this.n;
    }

    public String getSummary() {
        return this.d;
    }

    public String getSummary_hr() {
        return this.i;
    }

    public Integer getSync() {
        return this.j;
    }

    public Integer getSync_qqhealth() {
        return this.k;
    }

    public Integer getTime_zone() {
        return this.l;
    }

    public Integer getType() {
        return this.a;
    }

    public String getUserSummary() {
        return this.e;
    }

    public void setData(String str) {
        this.g = str;
    }

    public void setData_hr(byte[] bArr) {
        this.h = bArr;
    }

    public void setDate(String str) {
        this.c = str;
    }

    public void setDevice_id(String str) {
        this.m = str;
    }

    public void setIndexs(String str) {
        this.f = str;
    }

    public void setSource(Integer num) {
        this.b = num;
    }

    public void setStageStepsSummary(String str) {
        this.n = str;
    }

    public void setSummary(String str) {
        this.d = str;
    }

    public void setSummary_hr(String str) {
        this.i = str;
    }

    public void setSync(Integer num) {
        this.j = num;
    }

    public void setSync_qqhealth(Integer num) {
        this.k = num;
    }

    public void setTime_zone(Integer num) {
        this.l = num;
    }

    public void setType(Integer num) {
        this.a = num;
    }

    public void setUserSummary(String str) {
        this.e = str;
    }

    public DateData() {
    }
}

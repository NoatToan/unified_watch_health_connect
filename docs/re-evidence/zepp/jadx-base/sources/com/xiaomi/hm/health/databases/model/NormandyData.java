package com.xiaomi.hm.health.databases.model;

/* JADX INFO: loaded from: classes20.dex */
@Deprecated
public class NormandyData {
    private Integer a;
    private Integer b;
    private String c;
    private String d;
    private byte[] e;
    private Integer f;
    private Integer g;
    private String h;

    public NormandyData(Integer num, Integer num2, String str, String str2, byte[] bArr, Integer num3, Integer num4, String str3) {
        this.a = num;
        this.b = num2;
        this.c = str;
        this.d = str2;
        this.e = bArr;
        this.f = num3;
        this.g = num4;
        this.h = str3;
    }

    public byte[] getData() {
        return this.e;
    }

    public String getDate() {
        return this.c;
    }

    public String getDevice_id() {
        return this.h;
    }

    public Integer getSource() {
        return this.b;
    }

    public String getSummary() {
        return this.d;
    }

    public Integer getSync() {
        return this.f;
    }

    public Integer getTime_zone() {
        return this.g;
    }

    public Integer getType() {
        return this.a;
    }

    public void setData(byte[] bArr) {
        this.e = bArr;
    }

    public void setDate(String str) {
        this.c = str;
    }

    public void setDevice_id(String str) {
        this.h = str;
    }

    public void setSource(Integer num) {
        this.b = num;
    }

    public void setSummary(String str) {
        this.d = str;
    }

    public void setSync(Integer num) {
        this.f = num;
    }

    public void setTime_zone(Integer num) {
        this.g = num;
    }

    public void setType(Integer num) {
        this.a = num;
    }

    public NormandyData() {
    }
}

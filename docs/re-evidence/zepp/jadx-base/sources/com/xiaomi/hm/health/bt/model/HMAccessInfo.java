package com.xiaomi.hm.health.bt.model;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes19.dex */
public class HMAccessInfo implements Serializable {
    private static final long serialVersionUID = 1;
    public int a;
    public byte[] b;
    private int c;
    private String d;

    public HMAccessInfo() {
        this.a = 0;
        this.b = null;
        this.c = 2;
        this.d = null;
    }

    public byte[] getAid() {
        return this.b;
    }

    public int getAidLen() {
        return this.a;
    }

    public int getCardType() {
        return this.c;
    }

    public String getName() {
        return this.d;
    }

    public void setAid(byte[] aid) {
        this.b = aid;
    }

    public void setAidLen(int aidLen) {
        this.a = aidLen;
    }

    public void setCardType(int cardType) {
        this.c = cardType;
    }

    public void setName(String name) {
        this.d = name;
    }

    public String toString() {
        return "HMAccessInfo{name='" + this.d + "', aidLen=" + this.a + ", aid=" + Arrays.toString(this.b) + ", type=" + this.c + '}';
    }

    public HMAccessInfo(String name, int aidLen, byte[] aid) {
        this.a = 0;
        this.b = null;
        this.c = 2;
        this.d = null;
        this.d = name;
        this.a = aidLen;
        this.b = aid;
    }
}

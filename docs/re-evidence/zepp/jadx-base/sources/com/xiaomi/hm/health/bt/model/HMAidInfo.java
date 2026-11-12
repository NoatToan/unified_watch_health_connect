package com.xiaomi.hm.health.bt.model;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes19.dex */
public class HMAidInfo implements Serializable {
    public static final int OP_ACTIVATE = 1;
    public static final int OP_DELETE = 2;
    public static final int OP_SWITCH = 3;
    public static final int TYPE_ACCESS = 2;
    public static final int TYPE_BUS = 1;
    public static final int TYPE_JAC = 7;
    public static final int TYPE_MASTERCARD = 3;
    public static final int TYPE_UNIONPAY = 4;
    public static final int TYPE_XIAOPENG = 6;
    private static final long serialVersionUID = 1;
    public int a;
    public int b;
    public int c;
    public byte[] d;

    public HMAidInfo(int type, int aidLen, byte[] aid) {
        this.a = 1;
        this.b = 1;
        this.c = 0;
        this.d = null;
        this.b = type;
        this.c = aidLen;
        this.d = aid;
    }

    public byte[] getAid() {
        return this.d;
    }

    public int getAidLen() {
        return this.c;
    }

    public int getOp() {
        return this.a;
    }

    public int getType() {
        return this.b;
    }

    public void setAid(byte[] aid) {
        this.d = aid;
    }

    public void setAidLen(int aidLen) {
        this.c = aidLen;
    }

    public void setOp(int op) {
        this.a = op;
    }

    public void setType(int type) {
        this.b = type;
    }

    public String toString() {
        return "HMAidInfo{op=" + this.a + ", type=" + this.b + ", aidLen=" + this.c + ", aid=" + Arrays.toString(this.d) + '}';
    }

    public HMAidInfo(int op, int type, int aidLen, byte[] aid) {
        this.a = 1;
        this.b = 1;
        this.c = 0;
        this.d = null;
        this.a = op;
        this.b = type;
        this.c = aidLen;
        this.d = aid;
    }
}

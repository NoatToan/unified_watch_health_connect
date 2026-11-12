package com.xiaomi.hm.health.bt.model;

import java.io.Serializable;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes11.dex */
public class HMAidInfo implements Serializable {
    public static final int OP_ACTIVATE = 1;
    public static final int OP_DELETE = 2;
    public static final int OP_SWITCH = 3;
    public static final int TYPE_ACCESS = 2;
    public static final int TYPE_BUS = 1;
    public static final int TYPE_JAC = 7;
    public static final int TYPE_MASTERCARD = 3;
    public static final int TYPE_UNIONPAY = 4;
    public static final int TYPE_VISA = 8;
    public static final int TYPE_XIAOPENG = 6;
    private static final long serialVersionUID = 1;
    public byte[] aid;
    public int aidLen;
    public int op;
    public int type;

    public HMAidInfo(int i, int i2, byte[] bArr) {
        this.op = 1;
        this.type = i;
        this.aidLen = i2;
        this.aid = bArr;
    }

    public byte[] getAid() {
        return this.aid;
    }

    public int getAidLen() {
        return this.aidLen;
    }

    public int getOp() {
        return this.op;
    }

    public int getType() {
        return this.type;
    }

    public void setAid(byte[] bArr) {
        this.aid = bArr;
    }

    public void setAidLen(int i) {
        this.aidLen = i;
    }

    public void setOp(int i) {
        this.op = i;
    }

    public void setType(int i) {
        this.type = i;
    }

    public String toString() {
        return "HMAidInfo{op=" + this.op + ", type=" + this.type + ", aidLen=" + this.aidLen + ", aid=" + Arrays.toString(this.aid) + AbstractJsonLexerKt.END_OBJ;
    }

    public HMAidInfo(int i, int i2, int i3, byte[] bArr) {
        this.op = i;
        this.type = i2;
        this.aidLen = i3;
        this.aid = bArr;
    }
}

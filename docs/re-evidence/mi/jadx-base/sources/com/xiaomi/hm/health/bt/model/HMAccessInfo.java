package com.xiaomi.hm.health.bt.model;

import java.io.Serializable;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes11.dex */
public class HMAccessInfo implements Serializable {
    private static final long serialVersionUID = 1;
    public byte[] aid;
    public int aidLen;
    private int cardType;
    private String name;

    public HMAccessInfo() {
        this.aidLen = 0;
        this.aid = null;
        this.cardType = 2;
        this.name = null;
    }

    public byte[] getAid() {
        return this.aid;
    }

    public int getAidLen() {
        return this.aidLen;
    }

    public int getCardType() {
        return this.cardType;
    }

    public String getName() {
        return this.name;
    }

    public void setAid(byte[] bArr) {
        this.aid = bArr;
    }

    public void setAidLen(int i) {
        this.aidLen = i;
    }

    public void setCardType(int i) {
        this.cardType = i;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String toString() {
        return "HMAccessInfo{name='" + this.name + "', aidLen=" + this.aidLen + ", aid=" + Arrays.toString(this.aid) + ", type=" + this.cardType + AbstractJsonLexerKt.END_OBJ;
    }

    public HMAccessInfo(String str, int i, byte[] bArr) {
        this.cardType = 2;
        this.name = str;
        this.aidLen = i;
        this.aid = bArr;
    }
}

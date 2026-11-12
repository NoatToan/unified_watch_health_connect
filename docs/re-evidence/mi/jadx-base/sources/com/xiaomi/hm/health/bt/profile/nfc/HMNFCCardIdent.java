package com.xiaomi.hm.health.bt.profile.nfc;

import android.text.TextUtils;
import defpackage.tet;
import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes11.dex */
public class HMNFCCardIdent implements Serializable {
    private static final long serialVersionUID = 1;
    private String aid;
    private int aidLen;
    private HMNFCCardType type;

    public HMNFCCardIdent() {
        this.type = HMNFCCardType.BUS;
        this.aidLen = 0;
        this.aid = "";
    }

    public String getAid() {
        return this.aid;
    }

    public int getAidLen() {
        return this.aidLen;
    }

    public byte[] getBytes() {
        byte[] bArrY;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(this.type.getValue());
        byteArrayOutputStream.write(this.aidLen);
        if (this.aidLen > 0 && !TextUtils.isEmpty(this.aid) && (bArrY = tet.y(this.aid)) != null && bArrY.length > 0) {
            byteArrayOutputStream.write(bArrY, 0, bArrY.length);
        }
        return byteArrayOutputStream.toByteArray();
    }

    public HMNFCCardType getType() {
        return this.type;
    }

    public void setAid(String str) {
        this.aid = str;
    }

    public void setAidLen(int i) {
        this.aidLen = i;
    }

    public void setType(HMNFCCardType hMNFCCardType) {
        this.type = hMNFCCardType;
    }

    public String toString() {
        return "HMNFCCardIdent{type=" + this.type + ", aidLen=" + this.aidLen + ", aid='" + this.aid + '\'' + AbstractJsonLexerKt.END_OBJ;
    }

    public HMNFCCardIdent(HMNFCCardType hMNFCCardType, int i, String str) {
        HMNFCCardType hMNFCCardType2 = HMNFCCardType.UNKNOWN;
        this.type = hMNFCCardType;
        this.aidLen = i;
        this.aid = str;
    }
}

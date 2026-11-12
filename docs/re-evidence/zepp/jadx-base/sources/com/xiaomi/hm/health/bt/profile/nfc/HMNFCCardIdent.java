package com.xiaomi.hm.health.bt.profile.nfc;

import android.text.TextUtils;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import java.io.ByteArrayOutputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes18.dex */
public class HMNFCCardIdent implements Serializable {
    private static final long serialVersionUID = 1;
    private HMNFCCardType a;
    private int b;
    private String c;

    public HMNFCCardIdent() {
        this.a = HMNFCCardType.BUS;
        this.b = 0;
        this.c = "";
    }

    public String getAid() {
        return this.c;
    }

    public int getAidLen() {
        return this.b;
    }

    public byte[] getBytes() {
        byte[] bArrHexStringToBytes;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(this.a.getValue());
        byteArrayOutputStream.write(this.b);
        if (this.b > 0 && !TextUtils.isEmpty(this.c) && (bArrHexStringToBytes = GattUtils.hexStringToBytes(this.c)) != null && bArrHexStringToBytes.length > 0) {
            byteArrayOutputStream.write(bArrHexStringToBytes, 0, bArrHexStringToBytes.length);
        }
        return byteArrayOutputStream.toByteArray();
    }

    public HMNFCCardType getType() {
        return this.a;
    }

    public void setAid(String aid) {
        this.c = aid;
    }

    public void setAidLen(int aidLen) {
        this.b = aidLen;
    }

    public void setType(HMNFCCardType type) {
        this.a = type;
    }

    public String toString() {
        return "HMNFCCardIdent{type=" + this.a + ", aidLen=" + this.b + ", aid='" + this.c + "'}";
    }

    public HMNFCCardIdent(HMNFCCardType type, int aidLen, String aid) {
        this.a = HMNFCCardType.BUS;
        this.b = 0;
        this.c = "";
        this.a = type;
        this.b = aidLen;
        this.c = aid;
    }
}

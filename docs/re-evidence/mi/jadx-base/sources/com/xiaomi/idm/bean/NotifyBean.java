package com.xiaomi.idm.bean;

import java.io.Serializable;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes11.dex */
public class NotifyBean implements Serializable {
    private byte[] adv;
    private int discType;
    private byte[] idhash;
    private String mac;
    private String name;
    private int rssi;
    private int verifyStatus;

    public byte[] getAdv() {
        return this.adv;
    }

    public int getDisctype() {
        return this.discType;
    }

    public byte[] getIdhash() {
        return this.idhash;
    }

    public String getMac() {
        return this.mac;
    }

    public String getName() {
        return this.name;
    }

    public int getRssi() {
        return this.rssi;
    }

    public int getVerifyStatus() {
        return this.verifyStatus;
    }

    public void setAdv(byte[] bArr) {
        this.adv = bArr;
    }

    public void setDiscType(int i) {
        this.discType = i;
    }

    public void setIdhash(byte[] bArr) {
        this.idhash = bArr;
    }

    public void setMac(String str) {
        this.mac = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setRssi(int i) {
        this.rssi = i;
    }

    public void setVerifyStatus(int i) {
        this.verifyStatus = i;
    }

    public String toString() {
        return "NotifyBean{mac='" + this.mac + "', name='" + this.name + "', disctype=" + this.discType + ", rssi=" + this.rssi + ", verifystatus=" + this.verifyStatus + ", adv=" + Arrays.toString(this.adv) + ", idhash=" + Arrays.toString(this.idhash) + AbstractJsonLexerKt.END_OBJ;
    }
}

package com.xiaomi.hm.health.bt.profile.nfc;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes18.dex */
public class HMNFCBlockInfo implements Serializable {
    private static final long serialVersionUID = 1;
    private int a = 141;
    private int b = 255;
    private int c;
    private byte[] d;

    public byte[] getData() {
        return this.d;
    }

    public int getFlag() {
        return this.b;
    }

    public int getHeader() {
        return this.a;
    }

    public int getIndex() {
        return this.c;
    }

    public void setData(byte[] data) {
        this.d = data;
    }

    public void setFlag(int flag) {
        this.b = flag;
    }

    public void setHeader(int header) {
        this.a = header;
    }

    public void setIndex(int index) {
        this.c = index;
    }

    public String toString() {
        return "{header=" + this.a + ", flag=" + this.b + ", index=" + this.c + ", data=" + Arrays.toString(this.d) + '}';
    }
}

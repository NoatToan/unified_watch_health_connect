package com.xiaomi.hm.health.bt.profile.nfc;

import java.io.Serializable;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes11.dex */
public class HMNFCBlockInfo implements Serializable {
    private static final long serialVersionUID = 1;
    private byte[] data;
    private int index;
    private int header = 141;
    private int flag = 255;

    public byte[] getData() {
        return this.data;
    }

    public int getFlag() {
        return this.flag;
    }

    public int getHeader() {
        return this.header;
    }

    public int getIndex() {
        return this.index;
    }

    public void setData(byte[] bArr) {
        this.data = bArr;
    }

    public void setFlag(int i) {
        this.flag = i;
    }

    public void setHeader(int i) {
        this.header = i;
    }

    public void setIndex(int i) {
        this.index = i;
    }

    public String toString() {
        return "{header=" + this.header + ", flag=" + this.flag + ", index=" + this.index + ", data=" + Arrays.toString(this.data) + AbstractJsonLexerKt.END_OBJ;
    }
}

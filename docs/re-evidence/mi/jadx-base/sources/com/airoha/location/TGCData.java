package com.airoha.location;

/* JADX INFO: loaded from: classes.dex */
public class TGCData {
    final int TGC_DATA_LENGTH = 96;
    byte[] data;

    public byte[] getData() {
        return this.data;
    }

    public void setData(byte[] bArr) {
        if (bArr.length == 96) {
            this.data = bArr;
            return;
        }
        throw new IllegalArgumentException("TGC data should be 96 bytes, got: " + bArr.length);
    }
}

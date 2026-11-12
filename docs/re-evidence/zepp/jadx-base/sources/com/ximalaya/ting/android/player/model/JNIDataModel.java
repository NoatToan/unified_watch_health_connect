package com.ximalaya.ting.android.player.model;

/* JADX INFO: loaded from: classes22.dex */
public class JNIDataModel {
    public byte[] buf;
    public int bufSize;
    public String filePath;
    public long fileSize;
    public int status;

    public JNIDataModel(String str, long j, byte[] bArr, int i, int i2) {
        this.fileSize = 0L;
        this.bufSize = 0;
        this.filePath = str;
        this.fileSize = j;
        this.buf = bArr;
        this.bufSize = i;
        this.status = i2;
    }

    public JNIDataModel(byte[] bArr, int i, int i2) {
        this.fileSize = 0L;
        this.bufSize = 0;
        this.buf = bArr;
        this.bufSize = i;
        this.status = i2;
    }

    public JNIDataModel() {
        this.fileSize = 0L;
        this.bufSize = 0;
    }
}

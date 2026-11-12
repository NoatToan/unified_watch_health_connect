package com.ximalaya.ting.android.player.soundtouch;

/* JADX INFO: loaded from: classes22.dex */
public class SoundTouchDataModel {
    public byte[] inputDataBuf;
    public int inputDataLen;
    public byte[] outputDataBuf;
    public int outputDatalen;

    public SoundTouchDataModel(byte[] bArr, int i) {
        this.inputDataLen = 0;
        this.outputDatalen = 0;
        this.inputDataBuf = bArr;
        this.inputDataLen = i;
    }

    public SoundTouchDataModel() {
        this.inputDataLen = 0;
        this.outputDatalen = 0;
    }
}

package com.huami.watch.companion.xiaomiai.alexa.resample;

/* JADX INFO: loaded from: classes16.dex */
public class ReSample {
    public static void loadLibrary() {
        System.loadLibrary("resample");
    }

    public native byte[] reSample(byte[] bArr, int i, int i2, int i3);
}

package com.mi.fitness.ecg.mi;

/* JADX INFO: loaded from: classes5.dex */
public class MiEcgAlgoNative {
    static {
        System.loadLibrary("jni_mi_ecg_algo");
    }

    public static native int ecg_midev(float[] fArr, float[] fArr2, int i, int i2, int i3, int i4);
}

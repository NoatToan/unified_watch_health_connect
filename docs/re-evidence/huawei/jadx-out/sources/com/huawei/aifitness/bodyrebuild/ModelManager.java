package com.huawei.aifitness.bodyrebuild;

import android.util.Log;

/* JADX INFO: loaded from: classes4.dex */
public class ModelManager {
    public static native short algCloseAR();

    public static native short algDataCollect(float[] fArr, int i, short s);

    public static native int algGetResultAR();

    public static native short algInitAR();

    static {
        try {
            System.loadLibrary("neck");
        } catch (UnsatisfiedLinkError e) {
            Log.e("CameraFeature", "failed to load native library: " + e.getMessage());
        }
    }
}

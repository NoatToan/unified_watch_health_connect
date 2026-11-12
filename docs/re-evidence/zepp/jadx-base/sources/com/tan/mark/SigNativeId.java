package com.tan.mark;

/* JADX INFO: loaded from: classes18.dex */
public class SigNativeId {
    static {
        System.loadLibrary("sig_native");
    }

    public static native byte[] getBootFromJNI();

    public static native String getUpdateFromJNI();
}

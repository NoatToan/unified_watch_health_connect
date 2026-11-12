package com.huawei.emotion.alg;

/* JADX INFO: loaded from: classes23.dex */
public class EmotionAlg {
    public static native String EmotionAdviceInterface(String str);

    public static native String GetEmotionHealthVersion();

    static {
        System.loadLibrary("emotionalg");
    }
}

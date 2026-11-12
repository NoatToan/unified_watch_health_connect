package com.huawei.health.breathtrain;

import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes25.dex */
public class BreatheDataProvider {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f6221c = "BreatheDataProvider";

    public static native float[] getBreatheResultFromAlgorithm(int i, int i2, int[] iArr, int[] iArr2, int i3);

    static {
        try {
            System.loadLibrary("JanusBreathJni");
            LogUtil.a("BreatheDataProvider", "load .so success");
        } catch (UnsatisfiedLinkError e) {
            LogUtil.e(f6221c, "load .so fail" + e.getMessage());
        }
    }
}

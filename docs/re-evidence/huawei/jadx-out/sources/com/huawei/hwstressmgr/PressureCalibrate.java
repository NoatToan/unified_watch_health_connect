package com.huawei.hwstressmgr;

import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes11.dex */
public class PressureCalibrate {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static PressureCalibrate f17744b;

    public native float[] libPressureCalibrate(float[] fArr, int i, int i2, int[] iArr, int[] iArr2);

    static {
        try {
            System.loadLibrary("JanusStressJni");
            LogUtil.a("PressureCalibrate", "load .so success");
        } catch (UnsatisfiedLinkError e) {
            LogUtil.e("PressureCalibrate", "load .so fail" + e.getMessage());
        }
    }

    private PressureCalibrate() {
    }

    public static PressureCalibrate e() {
        PressureCalibrate pressureCalibrate;
        synchronized (PressureCalibrate.class) {
            if (f17744b == null) {
                f17744b = new PressureCalibrate();
            }
            pressureCalibrate = f17744b;
        }
        return pressureCalibrate;
    }
}

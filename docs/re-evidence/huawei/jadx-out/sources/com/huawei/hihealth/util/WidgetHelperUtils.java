package com.huawei.hihealth.util;

import com.huawei.hihealth.data.listener.FitnessListener;
import health.compact.a.util.LogUtil;

/* JADX INFO: loaded from: classes2.dex */
public class WidgetHelperUtils {
    private static volatile WidgetHelperUtils d;
    private static final Object e = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private FitnessListener f12340b;

    public static WidgetHelperUtils a() {
        if (d == null) {
            synchronized (e) {
                if (d == null) {
                    d = new WidgetHelperUtils();
                }
            }
        }
        return d;
    }

    public void c(FitnessListener fitnessListener) {
        this.f12340b = fitnessListener;
    }

    public void d(String str) {
        LogUtil.a("WidgetHelperUtils", "enter insertFitnessData");
        FitnessListener fitnessListener = this.f12340b;
        if (fitnessListener != null) {
            fitnessListener.onResult(str);
        }
    }
}

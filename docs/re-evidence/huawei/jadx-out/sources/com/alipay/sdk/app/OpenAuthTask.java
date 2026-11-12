package com.alipay.sdk.app;

import android.os.Bundle;
import defpackage.oq;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes21.dex */
public final class OpenAuthTask {
    public static final Map<String, Callback> d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static long f2068b = -1;

    public enum BizType {
        Invoice("20000920"),
        AccountAuth("20000067"),
        Deduct("60000157");

        private String appId;

        BizType(String str) {
            this.appId = str;
        }
    }

    public interface Callback {
        void onResult(int i, String str, Bundle bundle);
    }

    public static void c(String str, int i, String str2, Bundle bundle) {
        Callback callbackRemove = d.remove(str);
        if (callbackRemove != null) {
            try {
                callbackRemove.onResult(i, str2, bundle);
            } catch (Throwable th) {
                oq.c(th);
            }
        }
    }
}

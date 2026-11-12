package com.alipay.sdk.app;

import android.os.Bundle;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class OpenAuthTask {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map<String, Callback> f5802b = new ConcurrentHashMap();
    public static long c = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Callback f5803a;

    /* JADX INFO: renamed from: com.alipay.sdk.app.OpenAuthTask$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5804a;

        static {
            int[] iArr = new int[BizType.values().length];
            f5804a = iArr;
            try {
                iArr[BizType.Deduct.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5804a[BizType.AccountAuth.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5804a[BizType.Invoice.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

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
        void a(int i, String str, Bundle bundle);
    }

    public final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f5805a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f5806b;
        public final Bundle c;
        public final /* synthetic */ OpenAuthTask d;

        @Override // java.lang.Runnable
        public void run() {
            if (this.d.f5803a != null) {
                this.d.f5803a.a(this.f5805a, this.f5806b, this.c);
            }
        }
    }

    public static void b(String str, int i, String str2, Bundle bundle) {
        Callback callbackRemove = f5802b.remove(str);
        if (callbackRemove != null) {
            try {
                callbackRemove.a(i, str2, bundle);
            } catch (Throwable th) {
                com.alipay.sdk.util.c.d(th);
            }
        }
    }
}

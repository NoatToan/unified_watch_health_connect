package defpackage;

import com.xiaomi.yrn.env.trace.YRNTraceEvent;

/* JADX INFO: loaded from: classes2.dex */
public class xur implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f39491a;

    public xur(String str) {
        this.f39491a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        zxr.a("YRN_YRNV3_SDK", "YRNBundleUncaughtExceptionHandler.uncaughtException:" + Thread.currentThread().getName() + "\n" + th.getMessage());
        ezr.c().f(YRNTraceEvent.newEvent(this.f39491a, 1000, "uncaughtException: " + th.getMessage(), null, null));
    }
}

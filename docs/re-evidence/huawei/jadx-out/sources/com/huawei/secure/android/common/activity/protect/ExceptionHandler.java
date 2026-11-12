package com.huawei.secure.android.common.activity.protect;

/* JADX INFO: loaded from: classes42.dex */
public abstract class ExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f22740a = "ExceptionHandler";

    final void a(Throwable th) {
        com.huawei.secure.android.common.activity.a.b(f22740a, "bandageExceptionHappened ");
        try {
            onBandageExceptionHappened(th);
        } catch (Throwable unused) {
            com.huawei.secure.android.common.activity.a.a(f22740a, "bandageExceptionHappened");
        }
    }

    protected abstract void onBandageExceptionHappened(Throwable th);

    protected abstract void onUncaughtExceptionHappened(Thread thread, Throwable th);

    public final void uncaughtExceptionHappened(Thread thread, Throwable th) {
        com.huawei.secure.android.common.activity.a.b(f22740a, "uncaughtExceptionHappened ");
        try {
            onUncaughtExceptionHappened(thread, th);
        } catch (Throwable unused) {
            com.huawei.secure.android.common.activity.a.a(f22740a, "uncaughtExceptionHappened");
        }
    }
}

package com.huawei.watchface;

import com.huawei.watchface.api.HwWatchFaceApi;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.utils.HwLog;

/* JADX INFO: loaded from: classes20.dex */
public class d2 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile d2 f30116b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Thread.UncaughtExceptionHandler f30117a;

    public static d2 a() {
        if (f30116b == null) {
            synchronized (d2.class) {
                if (f30116b == null) {
                    f30116b = new d2();
                }
            }
        }
        return f30116b;
    }

    public void b() {
        if (this.f30117a == null) {
            this.f30117a = Thread.getDefaultUncaughtExceptionHandler();
        }
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        if (th != null) {
            HwLog.e("ThemeManagerCrashHandler", "CrashException" + HwLog.printException(th));
            HwWatchFaceApi.getInstance(Environment.getApplicationContext()).reportInterceptedCrash(th, Boolean.TRUE);
        }
        this.f30117a.uncaughtException(thread, th);
    }
}

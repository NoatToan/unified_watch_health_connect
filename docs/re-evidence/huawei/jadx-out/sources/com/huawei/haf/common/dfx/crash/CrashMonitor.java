package com.huawei.haf.common.dfx.crash;

import android.os.Process;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;

/* JADX INFO: loaded from: classes.dex */
public final class CrashMonitor implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Thread.UncaughtExceptionHandler f5872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Thread.UncaughtExceptionHandler f5873c;
    private final CrashCallback e;

    private CrashMonitor(CrashCallback crashCallback) {
        this.e = crashCallback == null ? new DefaultCrashHandler("HAF_CrashMonitor") : crashCallback;
    }

    public static void d(CrashCallback crashCallback) {
        f5873c = Thread.getDefaultUncaughtExceptionHandler();
        CrashMonitor crashMonitor = new CrashMonitor(crashCallback);
        f5872b = crashMonitor;
        Thread.setDefaultUncaughtExceptionHandler(crashMonitor);
    }

    public static void b() {
        if (Thread.getDefaultUncaughtExceptionHandler() == f5872b) {
            Thread.setDefaultUncaughtExceptionHandler(f5873c);
        }
        f5872b = null;
        f5873c = null;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        try {
            if (!b(thread, th)) {
                return;
            }
        } catch (Throwable th2) {
            LogUtil.d("HAF_CrashMonitor", "uncaughtException, ex=", LogUtil.c(th2));
        }
        ReleaseLogUtil.c("HAF_CrashMonitor", "exit by app crash kill self");
        Process.killProcess(Process.myPid());
    }

    private boolean b(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        ReleaseLogUtil.c("HAF_CrashMonitor", "## handleException()");
        this.e.handleCrash(thread, th);
        if (this.e.isAllowRethrow() && (uncaughtExceptionHandler = f5873c) != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
            return false;
        }
        return this.e.isAllowSelfKill();
    }
}

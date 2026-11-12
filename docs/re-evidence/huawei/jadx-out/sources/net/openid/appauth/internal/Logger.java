package net.openid.appauth.internal;

import android.util.Log;
import defpackage.zre;

/* JADX INFO: loaded from: classes20.dex */
public final class Logger {
    private static Logger d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f43049a;
    private final LogWrapper e;

    public interface LogWrapper {
        String getStackTraceString(Throwable th);

        boolean isLoggable(String str, int i);

        void println(int i, String str, String str2);
    }

    public static Logger a() {
        Logger logger;
        synchronized (Logger.class) {
            if (d == null) {
                d = new Logger(b.f43050a);
            }
            logger = d;
        }
        return logger;
    }

    Logger(LogWrapper logWrapper) {
        this.e = (LogWrapper) zre.c(logWrapper);
        int i = 7;
        while (i >= 2 && this.e.isLoggable("AppAuth", i)) {
            i--;
        }
        this.f43049a = i + 1;
    }

    public static void d(String str, Object... objArr) {
        a().c(3, null, str, objArr);
    }

    public static void a(Throwable th, String str, Object... objArr) {
        a().c(3, th, str, objArr);
    }

    public static void c(String str, Object... objArr) {
        a().c(5, null, str, objArr);
    }

    public static void a(String str, Object... objArr) {
        a().c(6, null, str, objArr);
    }

    public static void e(Throwable th, String str, Object... objArr) {
        a().c(6, th, str, objArr);
    }

    public void c(int i, Throwable th, String str, Object... objArr) {
        if (this.f43049a > i) {
            return;
        }
        if (objArr != null && objArr.length >= 1) {
            str = String.format(str, objArr);
        }
        if (th != null) {
            str = str + "\n" + this.e.getStackTraceString(th);
        }
        this.e.println(i, "AppAuth", str);
    }

    static final class b implements LogWrapper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final b f43050a = new b();

        private b() {
        }

        @Override // net.openid.appauth.internal.Logger.LogWrapper
        public void println(int i, String str, String str2) {
            Log.println(i, str, str2);
        }

        @Override // net.openid.appauth.internal.Logger.LogWrapper
        public boolean isLoggable(String str, int i) {
            return Log.isLoggable(str, i);
        }

        @Override // net.openid.appauth.internal.Logger.LogWrapper
        public String getStackTraceString(Throwable th) {
            return Log.getStackTraceString(th);
        }
    }
}

package com.amap.api.col.p0003sl;

import defpackage.g7t;
import defpackage.m2t;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class j1 extends g7t {
    public static Thread.UncaughtExceptionHandler d = new a();
    public static j1 e = new j1(new h1.b().d(d).c("amap-global-threadPool").h());

    public class a implements Thread.UncaughtExceptionHandler {
        @Override // java.lang.Thread.UncaughtExceptionHandler
        public final void uncaughtException(Thread thread, Throwable th) {
            m2t.r(th, "TPool", "ThreadPool");
        }
    }

    public j1(h1 h1Var) {
        try {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(h1Var.a(), h1Var.b(), h1Var.d(), TimeUnit.SECONDS, h1Var.c(), h1Var);
            this.f18699a = threadPoolExecutor;
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        } catch (Throwable th) {
            m2t.r(th, "TPool", "ThreadPool");
            th.printStackTrace();
        }
    }

    public static j1 h() {
        return e;
    }

    public static j1 i(h1 h1Var) {
        return new j1(h1Var);
    }

    @Deprecated
    public static synchronized j1 j() {
        try {
            if (e == null) {
                e = new j1(new h1.b().d(d).h());
            }
        } catch (Throwable th) {
            throw th;
        }
        return e;
    }

    @Deprecated
    public static j1 k() {
        return new j1(new h1.b().d(d).h());
    }
}

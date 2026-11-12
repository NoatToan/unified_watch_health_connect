package com.huami.tools.analytics;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import defpackage.ur4;

/* JADX INFO: loaded from: classes15.dex */
class p {
    private static volatile Logger a;

    @NonNull
    public static Logger b() {
        if (a == null) {
            synchronized (p.class) {
                a = new Logger() { // from class: com.huami.tools.analytics.o
                    @Override // com.huami.tools.analytics.Logger
                    public /* synthetic */ void d(String str, Object obj) {
                        ur4.a(this, str, obj);
                    }

                    @Override // com.huami.tools.analytics.Logger
                    public /* synthetic */ void e(String str, Object obj) {
                        ur4.b(this, str, obj);
                    }

                    @Override // com.huami.tools.analytics.Logger
                    public /* synthetic */ void e(String str, Throwable th) {
                        ur4.c(this, str, th);
                    }

                    @Override // com.huami.tools.analytics.Logger
                    public /* synthetic */ void e(String str, Throwable th, Object obj) {
                        ur4.d(this, str, th, obj);
                    }

                    @Override // com.huami.tools.analytics.Logger
                    public /* synthetic */ void i(String str, Object obj) {
                        ur4.e(this, str, obj);
                    }

                    @Override // com.huami.tools.analytics.Logger
                    public final void log(int i, String str, Throwable th, Object obj) {
                        p.c(i, str, th, obj);
                    }

                    @Override // com.huami.tools.analytics.Logger
                    public /* synthetic */ void v(String str, Object obj) {
                        ur4.f(this, str, obj);
                    }

                    @Override // com.huami.tools.analytics.Logger
                    public /* synthetic */ void w(String str, Object obj) {
                        ur4.g(this, str, obj);
                    }

                    @Override // com.huami.tools.analytics.Logger
                    public /* synthetic */ void w(String str, Throwable th) {
                        ur4.h(this, str, th);
                    }

                    @Override // com.huami.tools.analytics.Logger
                    public /* synthetic */ void w(String str, Throwable th, Object obj) {
                        ur4.i(this, str, th, obj);
                    }

                    @Override // com.huami.tools.analytics.Logger
                    public /* synthetic */ void wtf(String str, Object obj) {
                        ur4.j(this, str, obj);
                    }

                    @Override // com.huami.tools.analytics.Logger
                    public /* synthetic */ void wtf(String str, Throwable th) {
                        ur4.k(this, str, th);
                    }

                    @Override // com.huami.tools.analytics.Logger
                    public /* synthetic */ void wtf(String str, Throwable th, Object obj) {
                        ur4.l(this, str, th, obj);
                    }
                };
            }
        }
        return a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(int i, String str, Throwable th, Object obj) {
    }

    public static void d(@Nullable Logger logger) {
        synchronized (p.class) {
            a = logger;
        }
    }
}

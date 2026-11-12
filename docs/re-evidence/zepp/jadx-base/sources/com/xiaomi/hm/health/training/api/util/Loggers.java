package com.xiaomi.hm.health.training.api.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.xiaomi.hm.health.training.api.function.Supplier;
import com.xiaomi.hm.health.training.api.util.Loggers;

/* JADX INFO: loaded from: classes21.dex */
public class Loggers {
    private static volatile Logger a;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(int i, String str, Throwable th, Supplier supplier) {
    }

    @NonNull
    public static Logger getLogger() {
        if (a == null) {
            synchronized (Loggers.class) {
                if (a == null) {
                    a = new Logger() { // from class: xr4
                        @Override // com.xiaomi.hm.health.training.api.util.Logger
                        public /* synthetic */ void d(String str, Supplier supplier) {
                            vr4.a(this, str, supplier);
                        }

                        @Override // com.xiaomi.hm.health.training.api.util.Logger
                        public /* synthetic */ void e(String str, Supplier supplier) {
                            vr4.b(this, str, supplier);
                        }

                        @Override // com.xiaomi.hm.health.training.api.util.Logger
                        public /* synthetic */ void e(String str, Throwable th) {
                            vr4.c(this, str, th);
                        }

                        @Override // com.xiaomi.hm.health.training.api.util.Logger
                        public /* synthetic */ void e(String str, Throwable th, Supplier supplier) {
                            vr4.d(this, str, th, supplier);
                        }

                        @Override // com.xiaomi.hm.health.training.api.util.Logger
                        public /* synthetic */ void i(String str, Supplier supplier) {
                            vr4.e(this, str, supplier);
                        }

                        @Override // com.xiaomi.hm.health.training.api.util.Logger
                        public final void log(int i, String str, Throwable th, Supplier supplier) {
                            Loggers.b(i, str, th, supplier);
                        }

                        @Override // com.xiaomi.hm.health.training.api.util.Logger
                        public /* synthetic */ void v(String str, Supplier supplier) {
                            vr4.f(this, str, supplier);
                        }

                        @Override // com.xiaomi.hm.health.training.api.util.Logger
                        public /* synthetic */ void w(String str, Supplier supplier) {
                            vr4.g(this, str, supplier);
                        }

                        @Override // com.xiaomi.hm.health.training.api.util.Logger
                        public /* synthetic */ void w(String str, Throwable th) {
                            vr4.h(this, str, th);
                        }

                        @Override // com.xiaomi.hm.health.training.api.util.Logger
                        public /* synthetic */ void w(String str, Throwable th, Supplier supplier) {
                            vr4.i(this, str, th, supplier);
                        }

                        @Override // com.xiaomi.hm.health.training.api.util.Logger
                        public /* synthetic */ void wtf(String str, Supplier supplier) {
                            vr4.j(this, str, supplier);
                        }

                        @Override // com.xiaomi.hm.health.training.api.util.Logger
                        public /* synthetic */ void wtf(String str, Throwable th) {
                            vr4.k(this, str, th);
                        }

                        @Override // com.xiaomi.hm.health.training.api.util.Logger
                        public /* synthetic */ void wtf(String str, Throwable th, Supplier supplier) {
                            vr4.l(this, str, th, supplier);
                        }
                    };
                }
            }
        }
        return a;
    }

    public static void setLogger(@Nullable Logger logger) {
        synchronized (Loggers.class) {
            a = logger;
        }
    }
}

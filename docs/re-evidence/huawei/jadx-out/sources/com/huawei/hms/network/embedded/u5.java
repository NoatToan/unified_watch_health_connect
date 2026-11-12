package com.huawei.hms.network.embedded;

import android.text.TextUtils;
import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.PackageManagerCompat;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes34.dex */
public class u5 extends v5 {
    public static final String h = "HttpDetectQuery";
    public static final String i = "DETECT_APP_ID";
    public String f;
    public String e = "";
    public Callable<d5> g = new a();

    /* JADX WARN: Code duplicated, block: B:24:0x00b7 A[PHI: r4
      0x00b7: PHI (r4v7 java.util.concurrent.Future) = (r4v4 java.util.concurrent.Future), (r4v5 java.util.concurrent.Future), (r4v8 java.util.concurrent.Future) binds: [B:21:0x00aa, B:23:0x00b5, B:15:0x0099] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.huawei.hms.network.embedded.v5
    public w5 b(i5 i5Var) {
        Logger.v(h, "the http detect is coming!");
        i5Var.b(1);
        this.e = PackageManagerCompat.getMetaDataFromApp(ContextHolder.getAppContext(), i, "");
        Logger.v(h, "the obtain appId is:" + this.e);
        if (TextUtils.isEmpty(this.e)) {
            i5Var.a(b6.d.f14611b);
            this.f15490a.a(false);
        } else {
            String strA = c6.a(ContextHolder.getResourceContext());
            this.f = strA;
            if (!TextUtils.isEmpty(strA)) {
                Logger.v(h, "the detectDomainName is :" + this.f);
                Future futureSubmit = null;
                try {
                    try {
                        futureSubmit = this.f15491b.submit(this.g);
                        d5 d5Var = (d5) futureSubmit.get(5000L, TimeUnit.MILLISECONDS);
                        if (d5Var.a() == 404) {
                            this.f15490a.a(false);
                        }
                        i5Var.a(d5Var.a(), this.f);
                        if (futureSubmit != null) {
                            futureSubmit.cancel(true);
                        }
                    } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException unused) {
                        Logger.w(h, "the connect is overTime");
                        i5Var.a(b6.d.f14610a, this.f);
                        if (futureSubmit != null) {
                            futureSubmit.cancel(true);
                        }
                    } catch (RejectedExecutionException unused2) {
                        Logger.w(h, "executorService submit is RejectedExecutionException");
                        i5Var.a(b6.d.f14610a, this.f);
                        if (futureSubmit != null) {
                            futureSubmit.cancel(true);
                        }
                    }
                    return this.f15490a;
                } catch (Throwable th) {
                    if (futureSubmit != null) {
                        futureSubmit.cancel(true);
                    }
                    throw th;
                }
            }
            i5Var.a(b6.d.f14612c);
        }
        return this.f15490a;
    }

    public class a implements Callable<d5> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public d5 call() {
            return c6.a(ContextHolder.getAppContext(), u5.this.f + b6.e.f14613a, u5.this.e);
        }

        public a() {
        }
    }

    public u5(ExecutorService executorService) {
        this.f15491b = executorService;
    }
}

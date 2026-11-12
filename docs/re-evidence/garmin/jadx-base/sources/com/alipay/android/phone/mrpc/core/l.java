package com.alipay.android.phone.mrpc.core;

import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public final class l implements ab {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static l f28298b;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ThreadFactory f28299i = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f28300a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ThreadPoolExecutor f28301c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b f28302d = b.a("android");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f28303e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f28304f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f28305g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f28306h;

    public l(Context context) {
        this.f28300a = context;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(10, 11, 3L, TimeUnit.SECONDS, new ArrayBlockingQueue(20), f28299i, new ThreadPoolExecutor.CallerRunsPolicy());
        this.f28301c = threadPoolExecutor;
        try {
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        } catch (Exception unused) {
        }
        CookieSyncManager.createInstance(this.f28300a);
        CookieManager.getInstance().setAcceptCookie(true);
    }

    public static final synchronized l b(Context context) {
        l lVar = f28298b;
        if (lVar != null) {
            return lVar;
        }
        l lVar2 = new l(context);
        f28298b = lVar2;
        return lVar2;
    }

    @Override // com.alipay.android.phone.mrpc.core.ab
    public final Future<u> a(t tVar) {
        if (s.a(this.f28300a)) {
            String str = "HttpManager" + hashCode() + ": Active Task = %d, Completed Task = %d, All Task = %d,Avarage Speed = %d KB/S, Connetct Time = %d ms, All data size = %d bytes, All enqueueConnect time = %d ms, All socket time = %d ms, All request times = %d times";
            Integer numValueOf = Integer.valueOf(this.f28301c.getActiveCount());
            Long lValueOf = Long.valueOf(this.f28301c.getCompletedTaskCount());
            Long lValueOf2 = Long.valueOf(this.f28301c.getTaskCount());
            long j8 = this.f28305g;
            Long lValueOf3 = Long.valueOf(j8 == 0 ? 0L : ((this.f28303e * 1000) / j8) >> 10);
            int i14 = this.f28306h;
            String.format(str, numValueOf, lValueOf, lValueOf2, lValueOf3, Long.valueOf(i14 != 0 ? this.f28304f / ((long) i14) : 0L), Long.valueOf(this.f28303e), Long.valueOf(this.f28304f), Long.valueOf(this.f28305g), Integer.valueOf(this.f28306h));
        }
        q qVar = new q(this, (o) tVar);
        m mVar = new m(this, qVar, qVar);
        this.f28301c.execute(mVar);
        return mVar;
    }

    public final void c(long j8) {
        this.f28305g += j8;
    }

    public final void b(long j8) {
        this.f28304f += j8;
        this.f28306h++;
    }

    public static final l a(Context context) {
        l lVar = f28298b;
        return lVar != null ? lVar : b(context);
    }

    public final b a() {
        return this.f28302d;
    }

    public final void a(long j8) {
        this.f28303e += j8;
    }
}

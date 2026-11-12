package com.alipay.android.phone.mrpc.core;

import android.content.Context;
import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.huawei.openalliance.ad.constant.OsType;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class l implements ad {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static l f1999b;
    private static final ThreadFactory i = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f2000a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ThreadPoolExecutor f2001c;
    private b d;
    private long e;
    private long f;
    private long g;
    private int h;

    public String d() {
        return String.format("HttpManager" + hashCode() + ": Active Task = %d, Completed Task = %d, All Task = %d,Avarage Speed = %d KB/S, Connetct Time = %d ms, All data size = %d bytes, All enqueueConnect time = %d ms, All socket time = %d ms, All request times = %d times", Integer.valueOf(this.f2001c.getActiveCount()), Long.valueOf(this.f2001c.getCompletedTaskCount()), Long.valueOf(this.f2001c.getTaskCount()), Long.valueOf(b()), Long.valueOf(c()), Long.valueOf(this.e), Long.valueOf(this.f), Long.valueOf(this.g), Integer.valueOf(this.h));
    }

    public void c(long j) {
        this.g += j;
    }

    public long c() {
        int i2 = this.h;
        if (i2 == 0) {
            return 0L;
        }
        return this.f / ((long) i2);
    }

    public void b(long j) {
        this.f += j;
        this.h++;
    }

    public long b() {
        long j = this.g;
        if (j == 0) {
            return 0L;
        }
        return ((this.e * 1000) / j) >> 10;
    }

    public void a(long j) {
        this.e += j;
    }

    @Override // com.alipay.android.phone.mrpc.core.ad
    public Future<v> a(u uVar) {
        if (!(uVar instanceof o)) {
            throw new RuntimeException("request send error.");
        }
        if (s.a(this.f2000a)) {
            Log.i("HttpManager", d());
        }
        FutureTask<v> futureTaskA = a(a((o) uVar));
        this.f2001c.execute(futureTaskA);
        return futureTaskA;
    }

    public q a(o oVar) {
        return new q(this, oVar);
    }

    public b a() {
        return this.d;
    }

    private void e() {
        this.d = b.a(OsType.ANDROID);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(10, 11, 3L, TimeUnit.SECONDS, new ArrayBlockingQueue(20), i, new ThreadPoolExecutor.CallerRunsPolicy());
        this.f2001c = threadPoolExecutor;
        try {
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        } catch (Exception unused) {
        }
        CookieSyncManager.createInstance(this.f2000a);
        CookieManager.getInstance().setAcceptCookie(true);
    }

    private static final l b(Context context) {
        synchronized (l.class) {
            l lVar = f1999b;
            if (lVar != null) {
                return lVar;
            }
            l lVar2 = new l(context);
            f1999b = lVar2;
            return lVar2;
        }
    }

    private FutureTask<v> a(q qVar) {
        return new m(this, qVar, qVar);
    }

    public static final l a(Context context) {
        l lVar = f1999b;
        return lVar != null ? lVar : b(context);
    }

    public l(Context context) {
        this.f2000a = context;
        e();
    }
}

package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.openalliance.ad.beans.metadata.App;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes12.dex */
public class nf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final nf f19711a = new nf();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ReentrantReadWriteLock f19712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ReentrantReadWriteLock.ReadLock f19713c;
    private static final ReentrantReadWriteLock.WriteLock d;
    private volatile ne e;
    private volatile long f = -1;

    public List<App> a(Context context) {
        hw.b("UninstalledAppCacheManager", "getUninstalledAppFromCache");
        if (context == null || !com.huawei.openalliance.ad.utils.m.a().a(context)) {
            return null;
        }
        ReentrantReadWriteLock.ReadLock readLock = f19713c;
        if (readLock.tryLock()) {
            hw.a("UninstalledAppCacheManager", "get lock");
            try {
                try {
                    if (this.e != null) {
                        c(context);
                        List<App> listA = this.e.a();
                        readLock.unlock();
                        return listA;
                    }
                    b(context);
                    readLock.unlock();
                } finally {
                    f19713c.unlock();
                }
            } catch (Throwable unused) {
                hw.c("UninstalledAppCacheManager", "get cache failed");
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final Context context) {
        String str;
        try {
            hw.b("UninstalledAppCacheManager", "asyncUpdateCache");
            final long jCurrentTimeMillis = System.currentTimeMillis();
            if (this.e == null) {
                str = "cache is null";
            } else {
                this.f = ((long) (fp.b(context).g() * 60)) * 1000;
                if (jCurrentTimeMillis - this.e.b() >= this.f) {
                    com.huawei.openalliance.ad.utils.o.a(new Runnable() { // from class: com.huawei.openalliance.ad.nf.2
                        @Override // java.lang.Runnable
                        public void run() {
                            nf.this.a(context, jCurrentTimeMillis);
                        }
                    });
                    return;
                }
                str = "still in query interval";
            }
            hw.b("UninstalledAppCacheManager", str);
        } catch (Throwable unused) {
            hw.c("UninstalledAppCacheManager", "sync update occurs exception");
        }
    }

    private void b(final Context context) {
        hw.b("UninstalledAppCacheManager", "getCacheFromSp");
        if (context == null) {
            hw.c("UninstalledAppCacheManager", "context is null");
        }
        com.huawei.openalliance.ad.utils.o.a(new Runnable() { // from class: com.huawei.openalliance.ad.nf.1
            @Override // java.lang.Runnable
            public void run() {
                nf.d.lock();
                try {
                    try {
                        String strCD = fp.b(context).cD();
                        if (strCD != null) {
                            hw.a("UninstalledAppCacheManager", "convert json to cache");
                            nf.this.e = (ne) com.huawei.openalliance.ad.utils.bk.a(strCD, ne.class, new Class[0]);
                        }
                        if (nf.this.e == null) {
                            nf.this.e = new ne();
                        }
                        nf.this.c(context);
                    } finally {
                        nf.d.unlock();
                    }
                } catch (Throwable unused) {
                    hw.c("UninstalledAppCacheManager", "get cache from sp failed");
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, long j) {
        hw.b("UninstalledAppCacheManager", "try to update cache");
        List<App> listB = com.huawei.openalliance.ad.utils.m.a().b(context);
        hw.a("UninstalledAppCacheManager", "get result size:%s", Integer.valueOf(listB == null ? 0 : listB.size()));
        ReentrantReadWriteLock.WriteLock writeLock = d;
        writeLock.lock();
        try {
            try {
                this.e.a(j);
                this.e.a(listB);
                fp.b(context).y(com.huawei.openalliance.ad.utils.bk.a(this.e));
                writeLock.unlock();
            } catch (Throwable unused) {
                hw.c("UninstalledAppCacheManager", "update cache failed");
            }
        } finally {
            d.unlock();
        }
    }

    public static nf a() {
        return f19711a;
    }

    static {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        f19712b = reentrantReadWriteLock;
        f19713c = reentrantReadWriteLock.readLock();
        d = reentrantReadWriteLock.writeLock();
    }
}

package com.huawei.hms.stats;

import android.os.Handler;
import android.os.Looper;
import com.huawei.hms.support.hianalytics.HiAnalyticsUtils;
import com.huawei.hms.support.log.HMSLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class a {
    private static final a f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f16469a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f16470b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<Runnable> f16471c = new ArrayList();
    private final Handler d = new Handler(Looper.getMainLooper());
    private final Runnable e = new RunnableC0172a();

    /* JADX INFO: renamed from: com.huawei.hms.stats.a$a, reason: collision with other inner class name */
    class RunnableC0172a implements Runnable {
        RunnableC0172a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            HMSLog.i("AnalyticsCacheManager", "Timeout execCacheBi.");
            if (HiAnalyticsUtils.getInstance().getInitFlag()) {
                a.this.b();
            } else {
                a.this.a();
            }
        }
    }

    private a() {
    }

    public static a c() {
        return f;
    }

    public void a(Runnable runnable) {
        synchronized (this.f16469a) {
            try {
                if (runnable == null) {
                    return;
                }
                if (this.f16470b) {
                    return;
                }
                if (this.f16471c.size() >= 60) {
                    return;
                }
                this.f16471c.add(runnable);
                this.d.removeCallbacks(this.e);
                this.d.postDelayed(this.e, 10000L);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b() {
        synchronized (this.f16469a) {
            HMSLog.i("AnalyticsCacheManager", "execCacheBi: cache size: " + this.f16471c.size());
            this.f16470b = true;
            try {
                Iterator<Runnable> it = this.f16471c.iterator();
                while (it.hasNext()) {
                    it.next().run();
                    it.remove();
                }
            } catch (Throwable th) {
                HMSLog.e("AnalyticsCacheManager", "<execCacheBi> failed. " + th.getMessage());
                a();
            }
            this.f16470b = false;
        }
    }

    public void a() {
        synchronized (this.f16469a) {
            HMSLog.i("AnalyticsCacheManager", "clear AnalyticsCache.");
            this.f16471c.clear();
        }
    }
}

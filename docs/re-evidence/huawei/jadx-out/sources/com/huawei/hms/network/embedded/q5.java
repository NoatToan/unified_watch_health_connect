package com.huawei.hms.network.embedded;

import com.huawei.hms.framework.common.ExecutorsUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.ThreadPoolExcutorEnhance;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.hms.framework.common.hianalytics.HianalyticsHelper;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes34.dex */
public class q5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f15232c = "ThreadManager";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RejectedExecutionHandler f15233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ThreadPoolExecutor f15234b;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final q5 f15235a = new q5();
    }

    public void a(Runnable runnable) {
        try {
            this.f15234b.execute(new c(runnable));
        } catch (Throwable th) {
            Logger.e(f15232c, "task exception!", th);
            HianalyticsHelper.getInstance().reportException(th, CrashHianalyticsData.EVENT_ID_CRASH);
        }
    }

    public static class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Runnable f15236a;

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f15236a.run();
            } catch (Throwable th) {
                Logger.e(q5.f15232c, "task exception!", th);
                HianalyticsHelper.getInstance().reportException(th, CrashHianalyticsData.EVENT_ID_CRASH);
            }
        }

        public c(Runnable runnable) {
            this.f15236a = runnable;
        }
    }

    public static q5 a() {
        return b.f15235a;
    }

    public q5() {
        this.f15233a = new ThreadPoolExecutor.DiscardOldestPolicy();
        ThreadPoolExcutorEnhance threadPoolExcutorEnhance = new ThreadPoolExcutorEnhance(1, 1, 300, TimeUnit.SECONDS, new LinkedBlockingQueue(48), ExecutorsUtils.createThreadFactory("NetworkKit_Netdiag"), this.f15233a);
        this.f15234b = threadPoolExcutorEnhance;
        threadPoolExcutorEnhance.allowCoreThreadTimeOut(true);
    }
}

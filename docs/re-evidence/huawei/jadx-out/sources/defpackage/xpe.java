package defpackage;

import com.huawei.wear.oversea.overseamanger.QueryReviewResultCallback;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes46.dex */
public class xpe {
    private ScheduledFuture<?> e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f53270c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f53269b = false;

    public xpe(final QueryReviewResultCallback queryReviewResultCallback) {
        xnd.d("QueryReviewResultScheduleTask", "QueryReviewResultScheduleTask");
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        this.e = scheduledExecutorServiceNewSingleThreadScheduledExecutor.scheduleAtFixedRate(new Runnable() { // from class: xpg
            @Override // java.lang.Runnable
            public final void run() {
                this.d.e(queryReviewResultCallback, countDownLatch);
            }
        }, 2000L, 2000L, TimeUnit.MILLISECONDS);
        try {
            boolean zAwait = countDownLatch.await(62000L, TimeUnit.MILLISECONDS);
            if (!zAwait) {
                d(queryReviewResultCallback, "1", this.e);
            }
            xnd.b("QueryReviewResultScheduleTask", "awaitResult=" + zAwait, true);
        } catch (InterruptedException unused) {
            xnd.d("QueryReviewResultScheduleTask", "InterruptedException");
        }
    }

    /* synthetic */ void e(QueryReviewResultCallback queryReviewResultCallback, CountDownLatch countDownLatch) {
        this.f53270c++;
        xnd.d("QueryReviewResultScheduleTask", "retryTimes:" + this.f53270c);
        if (queryReviewResultCallback.checkReviewResult()) {
            d(queryReviewResultCallback, "2", this.e);
        } else {
            if (this.f53270c >= 30) {
                xnd.d("QueryReviewResultScheduleTask", "max times");
                countDownLatch.countDown();
                d(queryReviewResultCallback, "1", this.e);
                return;
            }
            xnd.d("QueryReviewResultScheduleTask", "checkReviewResult again");
        }
    }

    private void d(QueryReviewResultCallback queryReviewResultCallback, String str, ScheduledFuture<?> scheduledFuture) {
        synchronized (this) {
            if (!this.f53269b) {
                this.f53269b = true;
                scheduledFuture.cancel(true);
                queryReviewResultCallback.onQueryReviewResultCallback(str);
            }
        }
    }
}

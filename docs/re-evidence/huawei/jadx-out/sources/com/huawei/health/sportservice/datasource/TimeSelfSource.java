package com.huawei.health.sportservice.datasource;

import com.huawei.health.sportservice.SportLifecycle;
import com.huawei.health.sportservice.manager.BaseSportManager;
import com.huawei.health.sportservice.template.ComponentName;
import com.huawei.health.sportservice.template.SportComponentType;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes31.dex */
@SportComponentType(classify = 3, name = ComponentName.TIME_SELF_SOURCE)
public class TimeSelfSource extends BaseSource<Integer> implements SportLifecycle {
    private static final String TAG = "SportService_TimeDataSource";
    private static final int TIME_INCREMENT_DEFAULT = 1000;
    private ScheduledExecutorService mExecutor;
    private long mSportDuration = 0;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.health.sportservice.datasource.BaseSource
    public void generateData(Integer num) {
    }

    static /* synthetic */ long access$014(TimeSelfSource timeSelfSource, long j) {
        long j2 = timeSelfSource.mSportDuration + j;
        timeSelfSource.mSportDuration = j2;
        return j2;
    }

    @Override // com.huawei.health.sportservice.datasource.BaseSource
    protected void updateSourceData() {
        BaseSportManager.getInstance().updateSourceData(getLogTag(), "TIME_ONE_SECOND_DURATION", Long.valueOf(this.mSportDuration));
    }

    @Override // com.huawei.health.sportservice.datasource.BaseSource
    protected String getLogTag() {
        return TAG;
    }

    class TimeRunner implements Runnable {
        private TimeRunner() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (BaseSportManager.getInstance().getStatus() != 1) {
                    return;
                }
                TimeSelfSource.access$014(TimeSelfSource.this, 1000L);
                LogUtil.a(TimeSelfSource.TAG, "mSportDuration", Long.valueOf(TimeSelfSource.this.mSportDuration));
                TimeSelfSource.this.updateSourceData();
            } catch (Exception unused) {
                ReleaseLogUtil.b(TimeSelfSource.TAG, "TimeRunner Exception");
            }
        }
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onStartSport() {
        if (this.mExecutor == null) {
            ReleaseLogUtil.c(TAG, "onStartSport");
            ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
            this.mExecutor = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
            scheduledExecutorServiceNewSingleThreadScheduledExecutor.scheduleAtFixedRate(new TimeRunner(), 0L, 1000L, TimeUnit.MILLISECONDS);
        }
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    /* JADX INFO: renamed from: onStopSport */
    public void m825x32b3e3a1() {
        shutdown();
    }

    private void shutdown() {
        ScheduledExecutorService scheduledExecutorService = this.mExecutor;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
            this.mExecutor = null;
        }
    }

    @Override // com.huawei.health.sportservice.datasource.BaseSource
    public void recoveryData() {
        Object data = BaseSportManager.getInstance().getData("TIME_ONE_SECOND_DURATION");
        if (data instanceof Long) {
            long jLongValue = ((Long) data).longValue();
            this.mSportDuration = jLongValue;
            LogUtil.a(TAG, "recoveryData() mSportDuration: ", Long.valueOf(jLongValue));
        }
    }

    @Override // com.huawei.health.sportservice.datasource.BaseSource
    public void destroy() {
        super.destroy();
        shutdown();
    }
}

package com.huawei.health.sportservice.manager;

import com.huawei.health.sportservice.template.ComponentName;
import com.huawei.health.sportservice.template.SportComponentType;
import com.huawei.healthcloud.plugintrack.PluginSportTrackAdapter;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.gzx;
import defpackage.ive;
import defpackage.jbj;
import defpackage.jbw;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes31.dex */
@SportComponentType(classify = 1, name = ComponentName.INTENSITY_MANAGER)
public class BaseIntensityManager implements ManagerComponent {
    private static final String TAG = "SportService_BaseIntensityManager";
    private float mLastMinuteCalorie;
    private ScheduledExecutorService mSoftTimer;
    protected List<jbw> mTrackPointData = new ArrayList(16);
    protected List<jbj> mIntensityList = new ArrayList(16);
    private PluginSportTrackAdapter mPluginTrackAdapter = ive.c().a();

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onStartSport() {
        LogUtil.a(TAG, "onStartSport()");
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
        this.mSoftTimer = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(new SoftTimerTick(), 0L, 1L, TimeUnit.SECONDS);
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    /* JADX INFO: renamed from: onStopSport */
    public void m825x32b3e3a1() {
        LogUtil.a(TAG, "onStopSport()");
        ScheduledExecutorService scheduledExecutorService = this.mSoftTimer;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdown();
            this.mSoftTimer = null;
        }
        savePointData();
    }

    protected void savePointData() {
        PluginSportTrackAdapter pluginSportTrackAdapter = this.mPluginTrackAdapter;
        if (pluginSportTrackAdapter != null) {
            pluginSportTrackAdapter.saveTrackPointData(this.mTrackPointData, BaseSportManager.getInstance().getSportType());
            this.mPluginTrackAdapter.insertIntensityData(this.mIntensityList);
        } else {
            ReleaseLogUtil.a(TAG, "savePointData failed with null mPluginTrackAdapter, pls check.");
        }
    }

    protected void updatePointData() {
        Object data = BaseSportManager.getInstance().getData("CALORIES_DATA");
        float fFloatValue = gzx.e(data) ? ((Float) data).floatValue() : 0.0f;
        float f = this.mLastMinuteCalorie;
        long jCurrentTimeMillis = (System.currentTimeMillis() / TimeUnit.MINUTES.toMillis(1L)) * TimeUnit.MINUTES.toMillis(1L);
        jbw jbwVar = new jbw();
        jbwVar.c(jCurrentTimeMillis - TimeUnit.MINUTES.toMillis(1L));
        jbwVar.d(jCurrentTimeMillis);
        jbwVar.b((fFloatValue - f) * 1000.0f);
        this.mTrackPointData.add(jbwVar);
        this.mLastMinuteCalorie = fFloatValue;
        jbj jbjVar = new jbj();
        jbjVar.b(jCurrentTimeMillis - TimeUnit.MINUTES.toMillis(1L));
        jbjVar.e(jCurrentTimeMillis);
        jbjVar.d(8);
        this.mIntensityList.add(jbjVar);
    }

    class SoftTimerTick implements Runnable {
        private long mStart = System.currentTimeMillis() / TimeUnit.MINUTES.toMillis(1);

        SoftTimerTick() {
        }

        @Override // java.lang.Runnable
        public void run() {
            long jCurrentTimeMillis = System.currentTimeMillis() / TimeUnit.MINUTES.toMillis(1L);
            long j = this.mStart;
            if (j != jCurrentTimeMillis) {
                LogUtil.a(BaseIntensityManager.TAG, "Time Changed old ", Long.valueOf(j), " new ", Long.valueOf(jCurrentTimeMillis));
                BaseIntensityManager.this.updatePointData();
                this.mStart = jCurrentTimeMillis;
            }
        }
    }
}

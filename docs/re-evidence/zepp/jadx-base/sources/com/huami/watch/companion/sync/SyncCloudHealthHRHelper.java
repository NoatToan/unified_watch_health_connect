package com.huami.watch.companion.sync;

import android.content.Context;
import com.huami.watch.companion.dataflow.HealthData;
import com.huami.watch.dataflow.cloud.api.HealthDataAPI;
import com.huami.watch.dataflow.event.HealthDataUpdatedEvent;
import com.huami.watch.dataflow.model.health.HRDataManager;
import com.huami.watch.util.Box;
import com.huami.watch.util.Log;
import com.huami.watch.util.Rx;
import com.huami.watch.util.RxBus;

/* JADX INFO: loaded from: classes16.dex */
public class SyncCloudHealthHRHelper extends BaseSyncHelper {
    public static final int LIMIT_SIZE = 20;
    private static final String e = "SyncCloud-HealthHRData";

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            HealthDataUpdatedEvent healthDataUpdatedEvent = new HealthDataUpdatedEvent();
            healthDataUpdatedEvent.onlyUpdateHR = true;
            RxBus.get().post(healthDataUpdatedEvent);
        }
    }

    private boolean a(Context context) {
        boolean z;
        Log.d(e, "Init Sync Hr Start..", new Object[0]);
        long lastWatchHRDataTime = Box.getLastWatchHRDataTime();
        HealthDataAPI.HealthDataHRResult heartRate = HealthDataAPI.getHeartRate(context, lastWatchHRDataTime, System.currentTimeMillis() / 1000, lastWatchHRDataTime == 0 ? 20 : Integer.MAX_VALUE);
        if (heartRate.success) {
            if (!heartRate.dataItems.isEmpty()) {
                HRDataManager.getManager().saveAll(heartRate.dataItems);
                HealthData.clearCacheHR();
                Box.putLastWatchHRTime(heartRate.dataItems.get(0).getTimestamp() + 1);
            }
            z = true;
        } else {
            z = false;
        }
        Log.d(e, "Init Sync Hr End : " + z, new Object[0]);
        return z;
    }

    public static SyncCloudHealthHRHelper getHelper(Context context) {
        return (SyncCloudHealthHRHelper) BaseSyncHelper.getHelper(context, null, SyncCloudHealthHRHelper.class);
    }

    @Override // com.huami.watch.companion.sync.BaseSyncHelper
    public boolean onStart() {
        boolean zA = a(this.mContext);
        if (!zA) {
            Log.w(e, "Initial Sync Fail!!", new Object[0]);
            return false;
        }
        if (zA) {
            Rx.mainThread(new a());
        }
        return zA;
    }

    @Override // com.huami.watch.companion.sync.BaseSyncHelper
    public String tag() {
        return e;
    }
}

package com.xiaomi.hm.health.bt.profile.gdsp.yuyuedevice;

import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.profile.base.HMBaseTask;
import com.xiaomi.hm.health.bt.profile.bloodpressure.YYBloodPressureProfile;
import java.util.Calendar;

/* JADX INFO: loaded from: classes18.dex */
public class HMSyncYYPressureDataTask extends HMBaseTask {
    private final String b = "HMSyncYYPressureDataTask";
    private YYBloodPressureProfile c;
    private Calendar d;
    private HMCallback<BPData> e;
    private HMDeviceSource f;

    public HMSyncYYPressureDataTask(YYBloodPressureProfile profile, Calendar time, HMCallback<BPData> callback, HMDeviceSource source) {
        this.c = profile;
        this.d = time;
        this.e = callback;
        this.f = source;
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.HMBaseTask
    public void doWork() {
        this.e.onStart();
        Calendar calendar = this.d;
        this.c.setBpSyncDataTime(calendar != null ? calendar.getTimeInMillis() : 0L);
        if (this.c.writeCharCp(this.f == HMDeviceSource.OMRON_J750L ? new byte[]{2} : new byte[]{1, 1})) {
            return;
        }
        Debug.fi("HMSyncYYPressureDataTask", "HMSyncYYPressureDataTask write char cp error");
        this.e.onFinish(false);
    }
}

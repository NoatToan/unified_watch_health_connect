package com.xiaomi.hm.health.bt.profile.gdsp.discrete;

import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.error.HMDeviceSyncDataError;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.profile.base.HMBaseTask;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.ActivityData;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.ActivityDataFragment;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.DataHeader;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.IDiscreteDataListener;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.IHMActivityDataCallback;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import java.util.ArrayList;
import java.util.Calendar;

/* JADX INFO: loaded from: classes18.dex */
public class HMProSyncDiscreteDataTask extends HMBaseTask {
    private static final String j = "HMProSyncDiscreteDataTask";
    private HMProSyncDiscreteDataProfile b;
    private IHMActivityDataCallback c;
    private Calendar d;
    private int e = 0;
    private int f = 0;
    private ArrayList<ActivityDataFragment> g = new ArrayList<>();
    private ActivityDataFragment h = null;
    private HMDeviceSource i;

    public class a implements IDiscreteDataListener {
        public a() {
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.activity.IDiscreteDataListener
        public void onDataFinished(boolean ret) {
            Debug.i(HMProSyncDiscreteDataTask.j, "onDataFinished:" + ret);
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.activity.IDiscreteDataListener
        public void onDataHeaderReceived(DataHeader header) {
            Debug.i(HMProSyncDiscreteDataTask.j, "onDataHeaderReceived:" + header);
            ActivityDataFragment activityDataFragment = new ActivityDataFragment(header.calendar, header.size);
            HMProSyncDiscreteDataTask.this.g.add(activityDataFragment);
            HMProSyncDiscreteDataTask.this.h = activityDataFragment;
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.activity.IDiscreteDataListener
        public void onDataReceived(ArrayList<ActivityData> list) {
            Debug.i(HMProSyncDiscreteDataTask.j, "onDataReceived size:" + list.size());
            HMProSyncDiscreteDataTask.this.h.addAll(list);
            HMProSyncDiscreteDataTask.e(HMProSyncDiscreteDataTask.this, list.size());
            Debug.i(HMProSyncDiscreteDataTask.j, "mTotalSize:" + HMProSyncDiscreteDataTask.this.e + ",mReceivedSize:" + HMProSyncDiscreteDataTask.this.f);
            HMProSyncDiscreteDataTask.this.c.onSyncProgress(new Progress(HMProSyncDiscreteDataTask.this.e, HMProSyncDiscreteDataTask.this.f));
        }
    }

    public HMProSyncDiscreteDataTask(GattPeripheral gattPeripheral, HMDeviceSource source, Calendar calendar, IHMActivityDataCallback callBack) {
        this.b = null;
        this.c = null;
        this.d = null;
        this.i = HMDeviceSource.SHOES_MARS;
        this.b = new HMProSyncDiscreteDataProfile(gattPeripheral);
        this.c = callBack;
        this.d = calendar;
        this.i = source;
    }

    public static /* synthetic */ int e(HMProSyncDiscreteDataTask hMProSyncDiscreteDataTask, int i) {
        int i2 = hMProSyncDiscreteDataTask.f + i;
        hMProSyncDiscreteDataTask.f = i2;
        return i2;
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.HMBaseTask
    public void doWork() {
        this.c.onSyncStart();
        if (!this.b.init()) {
            this.c.onSyncFinish(new HMDeviceSyncDataError(2));
            return;
        }
        this.e = this.b.config();
        Debug.i(j, "total data size:" + this.e);
        int i = this.e;
        if (i < 0) {
            this.b.stopTransfer();
            this.b.deInit();
            this.c.onSyncFinish(new HMDeviceSyncDataError(2));
            return;
        }
        if (i == 0) {
            this.b.stopTransfer();
            this.b.deInit();
            this.c.onSyncFinish(new HMDeviceSyncDataError(0));
        } else if (!this.b.fetchData(new a(), this.i)) {
            Debug.i(j, "start failed!!!");
            this.b.deInit();
            this.c.onSyncFinish(new HMDeviceSyncDataError(2));
        } else {
            this.b.stopTransfer();
            this.b.deInit();
            this.c.onSyncStop(this.g);
            this.c.onSyncFinish(new HMDeviceSyncDataError(this.e != this.f ? 100 : 0));
        }
    }
}

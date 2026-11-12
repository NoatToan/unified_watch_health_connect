package com.xiaomi.hm.health.bt.profile.gdsp.weight;

import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.model.WeightAdvData;
import com.xiaomi.hm.health.bt.model.WeightSyncResult;
import com.xiaomi.hm.health.bt.profile.base.BleCallBack;
import com.xiaomi.hm.health.bt.profile.base.HMBaseTask;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class HMWeightSyncDataTask extends HMBaseTask {
    private static final String e = "HMWeightSyncDataTask";
    private HMWeightSyncDataProfile b;
    private BleCallBack c;
    private long d;

    public HMWeightSyncDataTask(GattPeripheral gattPeripheral, long uid, BleCallBack callBack) {
        this.b = null;
        this.c = null;
        this.d = 0L;
        this.b = new HMWeightSyncDataProfile(gattPeripheral);
        this.c = callBack;
        this.d = uid;
    }

    private boolean a(long timestamp) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(timestamp);
        if (calendar.get(1) < 2014) {
            Debug.fi(e, "year less than 2014!!!");
            return false;
        }
        if (timestamp <= Calendar.getInstance().getTimeInMillis() + 86400000) {
            return true;
        }
        Debug.fi(e, "timestamp large than current!!!");
        return false;
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.HMBaseTask
    public void doWork() {
        this.c.onStart();
        if (!this.b.init()) {
            Debug.fi(e, "HMWeightSyncDataProfile init failed!!!");
            this.c.onFinish(new WeightSyncResult());
            return;
        }
        int dataSize = this.b.getDataSize(this.d);
        Debug.i(e, "weight data size : " + dataSize);
        if (dataSize <= 0) {
            this.c.onFinish(new WeightSyncResult());
            this.b.deInit();
            return;
        }
        List<WeightAdvData> weightDatas = this.b.getWeightDatas(this.d, dataSize);
        this.b.deInit();
        if (weightDatas == null || weightDatas.size() == 0) {
            this.c.onFinish(new WeightSyncResult());
            return;
        }
        WeightSyncResult weightSyncResult = new WeightSyncResult();
        for (WeightAdvData weightAdvData : weightDatas) {
            long timestamp = weightAdvData.getTimestamp();
            if (weightAdvData.getValue() == 0.0f) {
                weightSyncResult.rebootCount++;
                Debug.fi(e, "wrong weight data value as reboot:" + weightAdvData + "<DROP>!!!");
            } else if (a(timestamp)) {
                weightSyncResult.add(weightAdvData);
                long j = weightSyncResult.startTs;
                if (j == -1 || j > timestamp) {
                    weightSyncResult.startTs = timestamp;
                }
                long j2 = weightSyncResult.stopTs;
                if (j2 == -1) {
                    weightSyncResult.stopTs = timestamp;
                } else if (j2 < timestamp) {
                    weightSyncResult.stopTs = timestamp;
                }
            } else {
                Debug.fi(e, "wrong weight data timestamp:" + new Date(timestamp).toString() + "<DROP>!!!");
            }
        }
        this.c.onFinish(weightSyncResult);
    }
}

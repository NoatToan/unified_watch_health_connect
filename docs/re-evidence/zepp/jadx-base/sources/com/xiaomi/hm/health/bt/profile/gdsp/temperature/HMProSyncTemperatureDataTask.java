package com.xiaomi.hm.health.bt.profile.gdsp.temperature;

import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.error.HMDeviceError;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.profile.base.HMBaseTask;
import com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.DataHeader;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataProfile;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.ITemperatureDataListener;
import java.util.ArrayList;
import java.util.Calendar;

/* JADX INFO: loaded from: classes18.dex */
public class HMProSyncTemperatureDataTask extends HMBaseTask {
    private static final String e = "HMProSyncTemperatureDataTask";
    private Calendar b;
    private HMProSyncDataProfile c;
    private IHMDataCallback d;

    public HMProSyncTemperatureDataTask(GattPeripheral gattPeripheral, Calendar startTime, IHMDataCallback callback) {
        this.b = null;
        this.c = null;
        this.d = null;
        this.b = startTime;
        this.c = new HMProSyncDataProfile(gattPeripheral);
        this.d = callback;
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.HMBaseTask
    public void doWork() {
        this.d.onStart();
        if (!this.c.init()) {
            Debug.i(e, "init failed!!!");
            this.d.onStop(null, new HMDeviceError(2));
            return;
        }
        Debug.i(e, "start sync time :" + this.b);
        DataHeader dataHeader = this.c.getDataHeader(this.b, (byte) 4);
        if (dataHeader == null) {
            Debug.i(e, "get header failed!!!");
            this.c.stopTransfer();
            this.c.deInit();
            this.d.onStop(null, new HMDeviceError(2));
            return;
        }
        if (dataHeader.size <= 0) {
            Debug.i(e, "size is 0 !!!");
            this.c.stopTransfer();
            this.c.deInit();
            this.d.onStop(null, new HMDeviceError(0));
            return;
        }
        final ArrayList arrayList = new ArrayList();
        this.c.fetchTemperatureData(new ITemperatureDataListener() { // from class: hd3
            @Override // com.xiaomi.hm.health.bt.profile.gdsp.activity.ITemperatureDataListener
            public final void onDataReceived(ArrayList arrayList2) {
                arrayList.addAll(arrayList2);
            }
        });
        this.c.stopTransfer();
        this.c.deInit();
        this.d.onStop(arrayList, new HMDeviceError(0));
    }
}

package com.xiaomi.hm.health.bt.profile.gdsp.hr;

import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.profile.base.HMBaseTask;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.DataHeader;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataProfile;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.IHrDataListener;
import java.util.ArrayList;
import java.util.Calendar;

/* JADX INFO: loaded from: classes18.dex */
public class HMProSyncHrDataTask extends HMBaseTask {
    private static final String e = "HMProSyncHrDataTask";
    private Calendar b;
    private HMProSyncDataProfile c;
    private IHMHrDataCallback d;

    public HMProSyncHrDataTask(GattPeripheral gattPeripheral, Calendar startTime, IHMHrDataCallback callback) {
        this.b = null;
        this.c = null;
        this.d = null;
        this.b = startTime;
        this.c = new HMProSyncDataProfile(gattPeripheral);
        this.d = callback;
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.HMBaseTask
    public void doWork() {
        this.d.onHrStart();
        if (!this.c.init()) {
            Debug.i(e, "init failed!!!");
            this.d.onHrStop(false);
            return;
        }
        Debug.i(e, "hr start sync time :" + this.b.getTime());
        DataHeader dataHeader = this.c.getDataHeader(this.b, (byte) 2);
        if (dataHeader == null) {
            Debug.i(e, "get header failed!!!");
            this.c.stopTransfer();
            this.c.deInit();
            this.d.onHrStop(false);
            return;
        }
        if (dataHeader.size <= 0) {
            Debug.i(e, "size is 0 !!!");
            this.c.stopTransfer();
            this.c.deInit();
            this.d.onHrStop(true);
            return;
        }
        final ArrayList<HMHrData> arrayList = new ArrayList<>();
        this.c.fetchHrData(new IHrDataListener() { // from class: gd3
            @Override // com.xiaomi.hm.health.bt.profile.gdsp.activity.IHrDataListener
            public final void onDataReceived(ArrayList arrayList2) {
                arrayList.addAll(arrayList2);
            }
        });
        this.c.stopTransfer();
        this.c.deInit();
        this.d.onHrData(arrayList);
        this.d.onHrStop(true);
    }
}

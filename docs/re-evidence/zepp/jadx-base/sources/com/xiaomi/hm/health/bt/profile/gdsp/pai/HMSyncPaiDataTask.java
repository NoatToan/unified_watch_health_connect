package com.xiaomi.hm.health.bt.profile.gdsp.pai;

import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.error.HMDeviceError;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.profile.base.HMBaseTask;
import com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.DataHeader;
import java.util.ArrayList;
import java.util.Calendar;

/* JADX INFO: loaded from: classes18.dex */
public class HMSyncPaiDataTask extends HMBaseTask {
    private static final String e = "HMSyncPaiDataTask";
    private Calendar b;
    private HMSyncPaiProfile c;
    private IHMDataCallback d;

    public HMSyncPaiDataTask(GattPeripheral gattPeripheral, Calendar startTime, IHMDataCallback callback) {
        this.b = startTime;
        this.c = new HMSyncPaiProfile(gattPeripheral);
        this.d = callback;
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.HMBaseTask
    public void doWork() {
        this.d.onStart();
        int i = 2;
        if (!this.c.init()) {
            Debug.i(e, "init failed!!!");
            this.d.onStop(null, new HMDeviceError(2));
            return;
        }
        Debug.i(e, "start sync time :" + this.b.getTime());
        ArrayList arrayList = new ArrayList();
        while (true) {
            DataHeader dataHeader = this.c.getDataHeader(this.b, (byte) 13);
            if (dataHeader == null) {
                Debug.fi(e, "get header failed!!!");
            } else {
                if (dataHeader.size <= 0) {
                    Debug.fi(e, "return as size is 0 !!!");
                    break;
                }
                HMPaiData hMPaiDataFetchData = this.c.fetchData();
                Debug.i(e, "HMPaiData:" + hMPaiDataFetchData);
                if (hMPaiDataFetchData == null) {
                    Debug.fi(e, "return as pai data is null!!!");
                    i = 100;
                } else {
                    arrayList.add(hMPaiDataFetchData);
                    if (hMPaiDataFetchData.getType() == 1) {
                        Debug.fi(e, "return as realtime pai data!!!");
                        break;
                    }
                    this.b.setTimeInMillis(hMPaiDataFetchData.getTime() + 60000);
                }
            }
            this.c.stopTransfer();
            this.c.deInit();
            this.d.onStop(arrayList, new HMDeviceError(i));
        }
        i = 0;
        this.c.stopTransfer();
        this.c.deInit();
        this.d.onStop(arrayList, new HMDeviceError(i));
    }
}

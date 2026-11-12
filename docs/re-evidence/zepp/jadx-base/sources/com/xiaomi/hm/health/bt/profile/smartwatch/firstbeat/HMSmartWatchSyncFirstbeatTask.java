package com.xiaomi.hm.health.bt.profile.smartwatch.firstbeat;

import com.huami.watch.util.Log;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.profile.base.HMBaseTask;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.DataHeader;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import java.util.ArrayList;
import java.util.Calendar;

/* JADX INFO: loaded from: classes18.dex */
public class HMSmartWatchSyncFirstbeatTask extends HMBaseTask {
    private static final String f = "SmartWatch-SyncFirstbeatTask";
    private e b;
    private IHMFirstbeatDataCallback c;
    private Calendar d;
    private Calendar e;

    public HMSmartWatchSyncFirstbeatTask(GattPeripheral gattPeripheral, Calendar startTime, Calendar endTime, IHMFirstbeatDataCallback callback) {
        this.b = new e(gattPeripheral);
        this.c = callback;
        this.d = startTime;
        this.e = endTime;
    }

    private static void a(int dayId, Calendar calendar) {
        calendar.setTimeInMillis(0L);
        calendar.set(1970, 0, 1, 0, 0, 0);
        calendar.add(6, dayId);
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.HMBaseTask
    public void doWork() {
        boolean z;
        int i;
        this.c.onStart();
        boolean z2 = false;
        if (!this.b.init()) {
            Log.w(f, "Init Firstbeat Profile Fail!!", new Object[0]);
            this.c.onFinish(false);
            return;
        }
        Calendar calendar = this.d;
        Log.i(f, "Start Sync StartTime: " + calendar.getTime() + ", EndTime: " + this.e.getTime(), new Object[0]);
        ArrayList arrayList = new ArrayList();
        int i2 = 30;
        while (true) {
            int i3 = i2 - 1;
            z = true;
            if (i2 <= 0) {
                break;
            }
            DataHeader dataHeaderV = this.b.v(calendar);
            Log.d(f, "Firstbeat Header: " + dataHeaderV, new Object[0]);
            if (dataHeaderV != null) {
                int i4 = dataHeaderV.size;
                if (i4 == 0) {
                    break;
                }
                BleFirstbeat bleFirstbeatT = this.b.t(i4);
                if (bleFirstbeatT != null) {
                    Log.d(f, "BleFirstbeat: " + bleFirstbeatT, new Object[0]);
                    if (bleFirstbeatT.dayId != 0 && bleFirstbeatT.updateTime != 0) {
                        arrayList.add(bleFirstbeatT);
                    }
                    if (calendar.get(1) == this.e.get(1) && calendar.get(2) == this.e.get(2) && calendar.get(5) == this.e.get(5)) {
                        Log.d(f, "Reach EndTime, Break!!", new Object[0]);
                        break;
                    }
                    short s = bleFirstbeatT.dayId;
                    if (s == 0) {
                        calendar = dataHeaderV.calendar;
                    } else {
                        a(s, calendar);
                    }
                    calendar.add(6, 1);
                    Log.d(f, "Update Sync StartTime: " + calendar.getTime(), new Object[0]);
                    i2 = i3;
                }
            }
            z = false;
            break;
        }
        Log.i(f, "Start Sync FirstbeatConfig...", new Object[0]);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(0L);
        DataHeader dataHeaderU = this.b.u(calendar2);
        Log.d(f, "FirstbeatConfig Header: " + dataHeaderU, new Object[0]);
        BleFirstbeat.Config configS = null;
        if (dataHeaderU != null && (i = dataHeaderU.size) != 0) {
            configS = this.b.s(i);
            Log.d(f, "BleFirstbeatConfig: " + configS, new Object[0]);
            if (configS != null) {
                z2 = z;
            }
        }
        this.b.stopTransfer();
        this.b.deInit();
        this.c.onProgress(new Progress(100, 100));
        BleFirstbeatData bleFirstbeatData = new BleFirstbeatData();
        bleFirstbeatData.firstbeatList = arrayList;
        bleFirstbeatData.firstbeatConfig = configS;
        this.c.onFirstbeatData(bleFirstbeatData);
        this.c.onFinish(z2);
    }
}

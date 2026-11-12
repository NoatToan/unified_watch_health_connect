package com.xiaomi.hm.health.bt.profile.smartwatch.firstbeat;

import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import defpackage.f4s;
import defpackage.i7t;
import defpackage.jet;
import defpackage.lk;
import java.util.ArrayList;
import java.util.Calendar;

/* JADX INFO: loaded from: classes11.dex */
public class b extends i7t {
    public a t;
    public IHMFirstbeatDataCallback u;
    public Calendar v;
    public Calendar w;

    public b(jet jetVar, Calendar calendar, Calendar calendar2, IHMFirstbeatDataCallback iHMFirstbeatDataCallback) {
        this.t = new a(jetVar);
        this.u = iHMFirstbeatDataCallback;
        this.v = calendar;
        this.w = calendar2;
    }

    public static void a(int i, Calendar calendar) {
        calendar.setTimeInMillis(0L);
        calendar.set(1970, 0, 1, 0, 0, 0);
        calendar.add(6, i);
    }

    @Override // defpackage.i7t
    public void doWork() {
        boolean z;
        BleFirstbeat.Config configC;
        int i;
        this.u.onStart();
        boolean z2 = false;
        if (!this.t.init()) {
            lk.e("SmartWatch-SyncFirstbeatTask", "Init Firstbeat Profile Fail!!", new Object[0]);
            this.u.onFinish(false);
            return;
        }
        Calendar calendar = this.v;
        lk.c("SmartWatch-SyncFirstbeatTask", "Start Sync StartTime: " + calendar.getTime() + ", EndTime: " + this.w.getTime(), new Object[0]);
        ArrayList arrayList = new ArrayList();
        int i2 = 30;
        while (true) {
            int i3 = i2 - 1;
            z = true;
            if (i2 <= 0) {
                break;
            }
            f4s f4sVarB = this.t.b(calendar);
            lk.b("SmartWatch-SyncFirstbeatTask", "Firstbeat Header: " + f4sVarB, new Object[0]);
            if (f4sVarB != null) {
                int i4 = f4sVarB.f17407b;
                if (i4 == 0) {
                    break;
                }
                BleFirstbeat bleFirstbeatD = this.t.d(i4);
                if (bleFirstbeatD != null) {
                    lk.b("SmartWatch-SyncFirstbeatTask", "BleFirstbeat: " + bleFirstbeatD, new Object[0]);
                    if (bleFirstbeatD.dayId != 0 && bleFirstbeatD.updateTime != 0) {
                        arrayList.add(bleFirstbeatD);
                    }
                    if (calendar.get(1) == this.w.get(1) && calendar.get(2) == this.w.get(2) && calendar.get(5) == this.w.get(5)) {
                        lk.b("SmartWatch-SyncFirstbeatTask", "Reach EndTime, Break!!", new Object[0]);
                        break;
                    }
                    short s = bleFirstbeatD.dayId;
                    if (s == 0) {
                        calendar = f4sVarB.f17406a;
                    } else {
                        a(s, calendar);
                    }
                    calendar.add(6, 1);
                    lk.b("SmartWatch-SyncFirstbeatTask", "Update Sync StartTime: " + calendar.getTime(), new Object[0]);
                    i2 = i3;
                }
            }
            z = false;
            break;
        }
        lk.c("SmartWatch-SyncFirstbeatTask", "Start Sync FirstbeatConfig...", new Object[0]);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(0L);
        f4s f4sVarA = this.t.a(calendar2);
        lk.b("SmartWatch-SyncFirstbeatTask", "FirstbeatConfig Header: " + f4sVarA, new Object[0]);
        if (f4sVarA == null || (i = f4sVarA.f17407b) == 0) {
            configC = null;
        } else {
            configC = this.t.c(i);
            lk.b("SmartWatch-SyncFirstbeatTask", "BleFirstbeatConfig: " + configC, new Object[0]);
            if (configC != null) {
                z2 = z;
            }
        }
        this.t.stopTransfer();
        this.t.deInit();
        this.u.onProgress(new Progress(100, 100));
        BleFirstbeatData bleFirstbeatData = new BleFirstbeatData();
        bleFirstbeatData.firstbeatList = arrayList;
        bleFirstbeatData.firstbeatConfig = configC;
        this.u.onFirstbeatData(bleFirstbeatData);
        this.u.onFinish(z2);
    }
}

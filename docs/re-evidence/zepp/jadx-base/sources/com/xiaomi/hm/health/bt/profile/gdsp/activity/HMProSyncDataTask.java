package com.xiaomi.hm.health.bt.profile.gdsp.activity;

import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.error.HMDeviceSyncDataError;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.base.HMBaseTask;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes14.dex */
public class HMProSyncDataTask extends HMBaseTask {
    private static final String k = "HMProSyncDataTask";
    private static final int l = 2;
    private Calendar b;
    private IHMActivityDataCallback c;
    private HMProSyncDataProfile d;
    private DeviceInfo i;
    private ArrayList<ActivityDataFragment> e = new ArrayList<>();
    private ActivityDataFragment f = null;
    private int g = -1;
    private int h = 0;
    private boolean j = false;

    public class a implements IDataListener {
        public final /* synthetic */ AtomicBoolean a;

        public a(final AtomicBoolean val$missingData) {
            this.a = val$missingData;
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.activity.IDataListener
        public void onDataMissing() {
            Debug.fi(HMProSyncDataTask.k, "onDataMissing!!!");
            this.a.set(true);
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.activity.IDataListener
        public void onDataReceived(ArrayList<ActivityData> list) {
            HMProSyncDataTask.this.f.addAll(list);
            HMProSyncDataTask.c(HMProSyncDataTask.this, list.size());
            HMProSyncDataTask.this.c.onSyncProgress(new Progress(HMProSyncDataTask.this.g, HMProSyncDataTask.this.h));
        }
    }

    public HMProSyncDataTask(GattPeripheral gattPeripheral, DeviceInfo deviceInfo, Calendar startTime, IHMActivityDataCallback callBack) {
        this.d = new HMProSyncDataProfile(gattPeripheral);
        this.b = startTime;
        this.c = callBack;
        this.i = deviceInfo;
    }

    public static /* synthetic */ int c(HMProSyncDataTask hMProSyncDataTask, int i) {
        int i2 = hMProSyncDataTask.h + i;
        hMProSyncDataTask.h = i2;
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0147 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0149  */
    /* JADX WARN: Code duplicated, block: B:73:0x0183 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:35:0x0149, please report this as an issue */
    @Override // com.xiaomi.hm.health.bt.profile.base.HMBaseTask
    public void doWork() {
        HMDeviceSyncDataError hMDeviceSyncDataError;
        int i;
        this.c.onSyncStart();
        if (!this.d.init()) {
            Debug.i(k, "init failed!!!");
            this.c.onSyncFinish(new HMDeviceSyncDataError(2));
            return;
        }
        Debug.fi(k, "source:" + this.i.getDeviceSource() + "\nstart time:" + this.b.getTime());
        Calendar calendar = (Calendar) this.b.clone();
        DataHeader dataHeader = null;
        boolean z = false;
        int i2 = 0;
        while (!this.j && (dataHeader = this.d.getDataHeader(this.b)) != null) {
            this.h = 0;
            this.g = dataHeader.size;
            if (dataHeader.getErrorCode() != 1) {
                Debug.fi(k, "return as cmd error:" + dataHeader.getErrorCode());
                break;
            }
            int i3 = this.g;
            if (i3 > 129600) {
                calendar = Calendar.getInstance();
                Debug.fi(k, "return as wrong data size:" + this.g);
                break;
            }
            if (i3 <= 0) {
                Debug.fi(k, "return as no data size:" + this.g);
                break;
            }
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            this.f = new ActivityDataFragment(dataHeader.calendar, dataHeader.size);
            if (!this.d.fetchData(new a(atomicBoolean), this.i.getDeviceSource(), this.i.getDeviceFeature())) {
                Debug.fi(k, "fetchData failed!!!");
            }
            if (atomicBoolean.get()) {
                z = true;
            }
            this.d.stopTransfer();
            Debug.fi(k, "mReceivedSize:" + this.h + ",header size:" + dataHeader.size);
            if (this.j) {
                break;
            }
            this.b = (Calendar) dataHeader.calendar.clone();
            if (!atomicBoolean.get()) {
                int i4 = this.h;
                i = dataHeader.size;
                if (i4 >= i) {
                    this.e.add(this.f);
                    i2 = 0;
                } else {
                    if (i2 < 2) {
                        Debug.fi(k, "sync data fail, retry " + i2 + " times, stop!!!");
                        break;
                    }
                    Debug.fi(k, "retry:" + i2);
                    i2++;
                    i = 0;
                }
            } else {
                if (i2 < 2) {
                    Debug.fi(k, "sync data fail, retry " + i2 + " times, stop!!!");
                    break;
                }
                Debug.fi(k, "retry:" + i2);
                i2++;
                i = 0;
            }
            this.b.add(12, i);
            Debug.fi(k, "update start time:" + this.b.getTime());
        }
        this.d.stopTransfer();
        this.d.deInit();
        if (dataHeader != null && dataHeader.getErrorCode() == 1 && dataHeader.size == 0) {
            calendar = (Calendar) dataHeader.calendar.clone();
        }
        Debug.fi(k, "stop time:" + calendar.getTime());
        this.e.add(new ActivityDataFragment(calendar, true));
        this.c.onSyncStop(this.g == this.h ? this.e : null);
        if (dataHeader != null && dataHeader.getErrorCode() == 7) {
            hMDeviceSyncDataError = new HMDeviceSyncDataError(5);
        } else if (dataHeader != null && dataHeader.getErrorCode() == 48) {
            hMDeviceSyncDataError = new HMDeviceSyncDataError(6);
        } else if (dataHeader != null && dataHeader.getErrorCode() == 49) {
            hMDeviceSyncDataError = new HMDeviceSyncDataError(7);
        } else if (this.g == this.h) {
            hMDeviceSyncDataError = new HMDeviceSyncDataError(0);
        } else {
            hMDeviceSyncDataError = new HMDeviceSyncDataError(100);
            hMDeviceSyncDataError.setLosePackageHappened(z);
        }
        this.c.onSyncFinish(hMDeviceSyncDataError);
    }

    public void stop() {
        Debug.fi(k, "user cancel sync activity data");
        this.j = true;
        this.d.stopFetch();
    }
}

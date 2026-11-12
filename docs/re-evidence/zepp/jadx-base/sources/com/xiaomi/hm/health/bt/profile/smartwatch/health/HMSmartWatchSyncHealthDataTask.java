package com.xiaomi.hm.health.bt.profile.smartwatch.health;

import com.huami.watch.util.Log;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.error.HMDeviceSyncDataError;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.base.HMBaseTask;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.ActivityData;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.ActivityDataFragment;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.DataHeader;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.IDataListener;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes18.dex */
public class HMSmartWatchSyncHealthDataTask extends HMBaseTask {
    private static final String k = "SmartWatch-SyncHealthDataTask";
    private static final int l = 2;
    private Calendar b;
    private IHMHealthDataCallback c;
    private c d;
    private List<BleHealthSummary> e = new ArrayList();
    private ArrayList<ActivityDataFragment> f = new ArrayList<>();
    private ActivityDataFragment g = null;
    private int h = -1;
    private int i = 0;
    private DeviceInfo j;

    public class a implements IDataListener {
        public final /* synthetic */ AtomicBoolean a;

        public a(final AtomicBoolean val$missingData) {
            this.a = val$missingData;
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.activity.IDataListener
        public void onDataMissing() {
            Debug.fi(HMSmartWatchSyncHealthDataTask.k, "onDataMissing!!!");
            this.a.set(true);
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.activity.IDataListener
        public void onDataReceived(ArrayList<ActivityData> list) {
            HMSmartWatchSyncHealthDataTask.this.g.addAll(list);
            HMSmartWatchSyncHealthDataTask.c(HMSmartWatchSyncHealthDataTask.this, list.size());
            HMSmartWatchSyncHealthDataTask.this.c.onSyncProgress(new Progress(HMSmartWatchSyncHealthDataTask.this.h, HMSmartWatchSyncHealthDataTask.this.i));
        }
    }

    public HMSmartWatchSyncHealthDataTask(GattPeripheral gattPeripheral, DeviceInfo deviceInfo, Calendar startTime, IHMHealthDataCallback callBack) {
        this.j = null;
        this.d = new c(gattPeripheral);
        this.b = startTime;
        this.c = callBack;
        this.j = deviceInfo;
    }

    public static /* synthetic */ int c(HMSmartWatchSyncHealthDataTask hMSmartWatchSyncHealthDataTask, int i) {
        int i2 = hMSmartWatchSyncHealthDataTask.i + i;
        hMSmartWatchSyncHealthDataTask.i = i2;
        return i2;
    }

    private int f() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.d.testLeParams();
        int iCurrentTimeMillis = (int) ((System.currentTimeMillis() - jCurrentTimeMillis) / 2);
        int timeInMillis = (int) (jCurrentTimeMillis - this.b.getTimeInMillis());
        return (iCurrentTimeMillis >= 300 ? 25 - (timeInMillis < 60000 ? 5 : 0) : 5) + (((timeInMillis / 960000) * iCurrentTimeMillis) / 1000);
    }

    private BleHealthSummary g(Calendar startTime) {
        int i;
        BleHealthSummary bleHealthSummaryP;
        DataHeader summaryHeader = this.d.getSummaryHeader(startTime);
        Log.d(k, "HealthSummary Header: " + summaryHeader, new Object[0]);
        if (summaryHeader == null || (i = summaryHeader.size) == 0 || (bleHealthSummaryP = this.d.P(i)) == null) {
            return null;
        }
        bleHealthSummaryP.timestamp = (Calendar) summaryHeader.calendar.clone();
        Log.d(k, "Fetch BleHealthSummary: " + bleHealthSummaryP, new Object[0]);
        return bleHealthSummaryP;
    }

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
        Debug.fi(k, "source:" + this.j.getDeviceSource() + "\nstart time:" + this.b.getTime());
        Calendar calendar = (Calendar) this.b.clone();
        int i2 = 30;
        DataHeader dataHeader = null;
        boolean z = false;
        int i3 = 0;
        while (true) {
            int i4 = i2 - 1;
            if (i2 > 0) {
                BleHealthSummary bleHealthSummaryG = g(this.b);
                if (bleHealthSummaryG != null) {
                    this.e.add(bleHealthSummaryG);
                }
                dataHeader = this.d.getDataHeader(this.b);
                Log.d(k, "HealthDetail Header: " + dataHeader, new Object[0]);
                if (dataHeader != null) {
                    this.i = 0;
                    int i5 = dataHeader.size;
                    this.h = i5;
                    if (i5 == 0) {
                        break;
                    }
                    if (dataHeader.getErrorCode() != 1) {
                        Debug.fi(k, "return as cmd error:" + dataHeader.getErrorCode());
                        break;
                    }
                    int i6 = this.h;
                    if (i6 > 129600) {
                        calendar = Calendar.getInstance();
                        Debug.fi(k, "return as wrong data size:" + this.h);
                        break;
                    }
                    if (i6 <= 0) {
                        Debug.fi(k, "return as no data size:" + this.h);
                        break;
                    }
                    AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                    this.g = new ActivityDataFragment((Calendar) dataHeader.calendar.clone(), dataHeader.size);
                    if (!this.d.fetchData(new a(atomicBoolean), this.j.getDeviceSource(), this.j.getDeviceFeature())) {
                        Debug.fi(k, "fetchData failed!!!");
                    }
                    if (atomicBoolean.get()) {
                        z = true;
                    }
                    this.d.stopTransfer();
                    Debug.fi(k, "mReceivedSize:" + this.i + ",header size:" + dataHeader.size);
                    this.b = (Calendar) dataHeader.calendar.clone();
                    if ((atomicBoolean.get() || this.i < dataHeader.size) && i3 < 2) {
                        Debug.fi(k, "retry:" + i3);
                        i3++;
                        i = 0;
                    } else {
                        i = dataHeader.size;
                        this.f.add(this.g);
                        i3 = 0;
                    }
                    this.b.add(12, i);
                    Debug.fi(k, "update start time:" + this.b.getTime());
                    i2 = i4;
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        this.d.stopTransfer();
        this.d.deInit();
        if (dataHeader != null && dataHeader.getErrorCode() == 1 && dataHeader.size == 0) {
            calendar = (Calendar) dataHeader.calendar.clone();
        }
        Debug.fi(k, "stop time:" + calendar.getTime());
        this.f.add(new ActivityDataFragment(calendar, true));
        BleHealthData bleHealthData = new BleHealthData();
        bleHealthData.summaryList = this.e;
        bleHealthData.detailList = this.h == this.i ? this.f : null;
        this.c.onSyncStop(bleHealthData);
        if (dataHeader != null && dataHeader.getErrorCode() == 7) {
            hMDeviceSyncDataError = new HMDeviceSyncDataError(5);
        } else if (dataHeader != null && dataHeader.getErrorCode() == 48) {
            hMDeviceSyncDataError = new HMDeviceSyncDataError(6);
        } else if (dataHeader != null && dataHeader.getErrorCode() == 49) {
            hMDeviceSyncDataError = new HMDeviceSyncDataError(7);
        } else if (this.h == this.i) {
            hMDeviceSyncDataError = new HMDeviceSyncDataError(0);
        } else {
            hMDeviceSyncDataError = new HMDeviceSyncDataError(100);
            hMDeviceSyncDataError.setLosePackageHappened(z);
        }
        this.c.onSyncFinish(hMDeviceSyncDataError);
    }
}

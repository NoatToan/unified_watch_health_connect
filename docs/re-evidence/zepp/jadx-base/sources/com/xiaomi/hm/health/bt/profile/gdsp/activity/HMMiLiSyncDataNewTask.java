package com.xiaomi.hm.health.bt.profile.gdsp.activity;

import com.facebook.login.widget.ToolTipPopup;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.error.HMDeviceSyncDataError;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.gatt.IGattCallback;
import com.xiaomi.hm.health.bt.profile.base.HMBaseTask;
import com.xiaomi.hm.health.bt.profile.mili.MiLiProfile;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes14.dex */
public class HMMiLiSyncDataNewTask extends HMBaseTask {
    private static final String l = "HMMiLiSyncDataNewTask";
    public final byte MODE_REGULAR_DATA_LEN_BYTE = 0;
    private final byte b = 1;
    private final int c = 3;
    private final Progress d = new Progress();
    private boolean e;
    private IHMActivityDataCallback f;
    private MiLiProfile g;
    private boolean h;
    private Calendar i;
    private ActivityDataFragment j;
    private int k;

    public class a implements IGattCallback.INotifyCallback {
        public final /* synthetic */ AtomicBoolean a;
        public final /* synthetic */ List b;
        public final /* synthetic */ b c;

        public a(final AtomicBoolean val$needStop, final List val$fragments, final b val$entry) {
            this.a = val$needStop;
            this.b = val$fragments;
            this.c = val$entry;
        }

        @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
        public synchronized void notify(byte[] value) {
            Debug.fi(HMMiLiSyncDataNewTask.l, "getActivities:" + GattUtils.bytesToHexString(value));
            this.a.getAndSet(false);
            if (value.length == 11) {
                ActivityDataFragment activityDataFragmentO = HMMiLiSyncDataNewTask.this.o(value);
                Debug.fi(HMMiLiSyncDataNewTask.l, "head coming:" + activityDataFragmentO);
                this.b.add(activityDataFragmentO);
                if (activityDataFragmentO.isEnd()) {
                    Debug.fi(HMMiLiSyncDataNewTask.l, "data end...");
                    HMMiLiSyncDataNewTask.this.j = null;
                    this.a.getAndSet(true);
                    synchronized (this.b) {
                        this.b.notify();
                    }
                } else {
                    HMMiLiSyncDataNewTask.this.j = activityDataFragmentO;
                    this.c.c = activityDataFragmentO.getTotalLen();
                }
                HMMiLiSyncDataNewTask.this.k = -1;
            } else if (HMMiLiSyncDataNewTask.this.j == null) {
                Debug.fi(HMMiLiSyncDataNewTask.l, "head not coming but data coming...");
                this.c.b = 1;
            } else {
                Debug.fi(HMMiLiSyncDataNewTask.l, "data coming...");
                int i = value[0] & 255;
                HMMiLiSyncDataNewTask hMMiLiSyncDataNewTask = HMMiLiSyncDataNewTask.this;
                int iP = hMMiLiSyncDataNewTask.p(i, hMMiLiSyncDataNewTask.k);
                if (iP > 0) {
                    Debug.fi(HMMiLiSyncDataNewTask.l, "missing " + iP + " package!!!");
                    List listQ = HMMiLiSyncDataNewTask.this.q(iP);
                    HMMiLiSyncDataNewTask.this.j.addAll(listQ);
                    Progress progress = HMMiLiSyncDataNewTask.this.d;
                    progress.progress = progress.progress + (listQ.size() * HMMiLiSyncDataNewTask.this.l());
                    this.c.b = 1;
                    b.d(this.c, listQ.size() * HMMiLiSyncDataNewTask.this.l());
                } else if (iP < 0) {
                    Debug.fi(HMMiLiSyncDataNewTask.l, "wrong package order!!!");
                    this.c.b = 1;
                    return;
                }
                List listN = HMMiLiSyncDataNewTask.this.n(value);
                HMMiLiSyncDataNewTask.this.j.addAll(listN);
                b.f(this.c, listN.size() * HMMiLiSyncDataNewTask.this.l());
                HMMiLiSyncDataNewTask.this.d.total = HMMiLiSyncDataNewTask.this.j.getTotalLen();
                HMMiLiSyncDataNewTask.this.d.progress += listN.size() * HMMiLiSyncDataNewTask.this.l();
                Debug.i(HMMiLiSyncDataNewTask.l, "progress:" + HMMiLiSyncDataNewTask.this.d);
                HMMiLiSyncDataNewTask.this.f.onSyncProgress(HMMiLiSyncDataNewTask.this.d);
                HMMiLiSyncDataNewTask.this.k = i;
            }
        }
    }

    public static class b {
        private List<ActivityDataFragment> a = null;
        private int b = 0;
        private int c = 0;
        private int d = 0;
        private int e = 0;

        public static /* synthetic */ int d(b bVar, int i) {
            int i2 = bVar.e + i;
            bVar.e = i2;
            return i2;
        }

        public static /* synthetic */ int f(b bVar, int i) {
            int i2 = bVar.d + i;
            bVar.d = i2;
            return i2;
        }

        public String toString() {
            return "ActivityDataFragmentEntry{fragments=" + this.a + ", error=" + this.b + ", dataHeaderTotalSize=" + this.c + ", originDataSize=" + this.d + ", paddingDataSize=" + this.e + '}';
        }
    }

    public HMMiLiSyncDataNewTask(MiLiProfile mp, HMDeviceSource source, Calendar calendar, IHMActivityDataCallback cb) {
        this.e = false;
        this.f = null;
        this.g = null;
        this.h = false;
        Calendar calendar2 = Calendar.getInstance();
        this.i = calendar2;
        this.j = null;
        this.k = -1;
        this.g = mp;
        this.f = cb;
        calendar2.setTimeInMillis(calendar.getTimeInMillis());
        this.e = source == HMDeviceSource.MILI_1S;
        this.h = source == HMDeviceSource.MILI_AMAZFIT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int l() {
        return this.e ? 4 : 3;
    }

    private b m() {
        Debug.fi(l, "getActivities");
        b bVar = new b();
        ArrayList arrayList = new ArrayList();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.d.reset();
        this.g.registerDataCallback(new a(atomicBoolean, arrayList, bVar));
        if (this.h ? this.g.sendFetchDataCmdFrom(this.i) : this.g.sendFetchDataCmd()) {
            while (!atomicBoolean.get()) {
                atomicBoolean.getAndSet(true);
                synchronized (arrayList) {
                    try {
                        arrayList.wait(10000L);
                    } catch (Exception e) {
                        Debug.i(l, "Exception:" + e.getMessage());
                    }
                }
            }
        } else {
            bVar.b = 2;
            Debug.fi(l, "fetch data command failed!!!");
        }
        this.g.unRegisterDataCallback();
        bVar.a = arrayList;
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<ActivityData> n(byte[] value) {
        int length = value.length;
        int i = this.e ? 4 : 3;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 1; i2 < length; i2 += i) {
            if (this.e) {
                arrayList.add(new ActivityHrData(value[i2 + 1], value[i2 + 2], value[i2], value[i2 + 3]));
            } else {
                arrayList.add(new ActivityData(value[i2 + 1], value[i2 + 2], value[i2]));
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ActivityDataFragment o(byte[] value) {
        byte b2 = value[0];
        int i = value[1] + 2000;
        byte b3 = value[2];
        byte b4 = value[3];
        byte b5 = value[4];
        byte b6 = value[5];
        byte b7 = value[6];
        byte b8 = value[7];
        byte b9 = value[8];
        int iL = (b8 & 255) | ((b9 & 255) << 8);
        int iL2 = ((value[10] & 255) << 8) | (value[9] & 255);
        if (b2 == 1) {
            iL *= l();
            iL2 *= l();
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(i, b3, b4, b5, b6, b7);
        ActivityDataFragment activityDataFragment = iL2 == 0 ? new ActivityDataFragment((Calendar) gregorianCalendar, true) : new ActivityDataFragment(gregorianCalendar, iL2);
        activityDataFragment.setTotalLen(iL);
        return activityDataFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int p(int currentIndex, int lastIndex) {
        Debug.fi(l, "data index:" + currentIndex + ",last index:" + lastIndex);
        if ((lastIndex == 255 && currentIndex == 0) || lastIndex + 1 == currentIndex) {
            return 0;
        }
        return (currentIndex - lastIndex) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<ActivityData> q(int packets) {
        Debug.fi(l, "missing packets count:" + packets);
        ArrayList arrayList = new ArrayList();
        boolean z = this.e;
        int i = packets * (z ? 4 : 6);
        Object activityHrData = z ? new ActivityHrData((byte) 0, (byte) 0, (byte) 126, (byte) -1) : new ActivityData((byte) 0, (byte) 0, (byte) 126);
        Debug.fi(l, "missing activity data count:" + i);
        while (true) {
            int i2 = i - 1;
            if (i <= 0) {
                return arrayList;
            }
            arrayList.add(activityHrData);
            i = i2;
        }
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.HMBaseTask
    public void doWork() {
        Debug.fi(l, ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        Debug.fi(l, "===========================start sync data================================");
        Debug.fi(l, ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        this.f.onSyncStart();
        if (this.g == null) {
            Debug.fi(l, "return as gattPeripheral is null!!!");
            return;
        }
        List<ActivityDataFragment> list = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        while (true) {
            int i3 = i + 1;
            if (i >= 3) {
                break;
            }
            b bVarM = m();
            List<ActivityDataFragment> list2 = bVarM.a;
            Debug.fi(l, "ActivityDataFragmentEntry:" + bVarM);
            i2 = bVarM.b;
            if (bVarM.b == 0) {
                list = list2;
                break;
            }
            if (bVarM.b == 1) {
                z = true;
            }
            Debug.fi(l, "stopGetActivities:" + this.g.stopGetActivities());
            try {
                Thread.sleep(ToolTipPopup.DEFAULT_POPUP_DISPLAY_TIME);
            } catch (Exception unused) {
            }
            list = list2;
            i = i3;
        }
        this.f.onSyncStop(list);
        this.g.confirmActivityDataTransferComplete(Calendar.getInstance(), 0);
        Debug.fi(l, "<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        Debug.fi(l, "============================stop sync data================================");
        Debug.fi(l, "<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        HMDeviceSyncDataError hMDeviceSyncDataError = new HMDeviceSyncDataError(i2);
        hMDeviceSyncDataError.setLosePackageHappened(z);
        this.f.onSyncFinish(hMDeviceSyncDataError);
    }
}

package com.xiaomi.hm.health.bt.profile.gdsp.activity;

import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.error.HMDeviceSyncDataError;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.gatt.IGattCallback;
import com.xiaomi.hm.health.bt.profile.base.HMBaseTask;
import com.xiaomi.hm.health.bt.profile.mili.MiLiProfile;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes14.dex */
public class HMMiLiSyncDataTask extends HMBaseTask implements IGattCallback.INotifyCallback {
    private static final String x = "HMMiLiSyncDataTask";
    private boolean r;
    private IHMActivityDataCallback t;
    private MiLiProfile u;
    private boolean v;
    private Calendar w;
    public final byte MODE_REGULAR_DATA_LEN_BYTE = 0;
    private final int b = 12000;
    private final int c = 5000;
    private final byte d = 1;
    private final int e = 1;
    private final Progress f = new Progress();
    private Timer g = null;
    private TimerTask h = null;
    private boolean i = false;
    private boolean j = false;
    private int k = -1;
    private int l = -1;
    private int m = 0;
    private int n = 0;
    private Calendar o = null;
    private PipedInputStream p = null;
    private PipedOutputStream q = null;
    private volatile boolean s = false;

    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            Debug.fi(HMMiLiSyncDataTask.x, "run stopGetActivities!!!");
            HMMiLiSyncDataTask.this.s = true;
            HMMiLiSyncDataTask.this.p();
        }
    }

    public HMMiLiSyncDataTask(MiLiProfile mp, HMDeviceSource source, Calendar calendar, IHMActivityDataCallback cb) {
        this.r = false;
        this.t = null;
        this.u = null;
        this.v = false;
        Calendar calendar2 = Calendar.getInstance();
        this.w = calendar2;
        this.u = mp;
        this.t = cb;
        calendar2.setTimeInMillis(calendar.getTimeInMillis());
        this.r = source == HMDeviceSource.MILI_1S;
        this.v = source == HMDeviceSource.MILI_AMAZFIT;
    }

    private List<ActivityDataFragment> c() {
        ActivityDataFragment activityDataFragmentN;
        Debug.fi(x, "getActivities");
        l();
        ArrayList arrayList = new ArrayList();
        try {
            this.p = new PipedInputStream();
            PipedOutputStream pipedOutputStream = new PipedOutputStream();
            this.q = pipedOutputStream;
            this.p.connect(pipedOutputStream);
            this.u.registerDataCallback(this);
            boolean zSendFetchDataCmdFrom = this.v ? this.u.sendFetchDataCmdFrom(this.w) : this.u.sendFetchDataCmd();
            Debug.assertTrue(zSendFetchDataCmdFrom);
            if (!zSendFetchDataCmdFrom) {
                i("Write sync command failed!!!");
                m();
                this.u.unRegisterDataCallback();
                return null;
            }
            h();
            Progress progress = this.f;
            progress.total = -1;
            progress.progress = 0;
            do {
                try {
                    activityDataFragmentN = n();
                    arrayList.add(activityDataFragmentN);
                } catch (Exception e) {
                    i(e.getMessage());
                }
            } while (activityDataFragmentN.data.size() != 0);
            m();
            this.u.unRegisterDataCallback();
            try {
                PipedInputStream pipedInputStream = this.p;
                if (pipedInputStream != null) {
                    pipedInputStream.close();
                    this.p = null;
                }
                PipedOutputStream pipedOutputStream2 = this.q;
                if (pipedOutputStream2 != null) {
                    pipedOutputStream2.close();
                    this.q = null;
                }
            } catch (Exception unused) {
            }
            return arrayList;
        } catch (IOException e2) {
            i(e2.getMessage());
            m();
            e2.printStackTrace();
            return null;
        }
    }

    private boolean d(int dataLen) {
        if (!this.j) {
            Debug.fi(x, "get data before get head!!!");
            j();
            return false;
        }
        this.n += dataLen;
        Debug.fi(x, "currentDataLen: " + this.n + ",currentDataTotalLen:" + this.m);
        if (dataLen == 20 || this.n == this.m) {
            return true;
        }
        Debug.fi(x, "package lenght != 20 and current currentDataLen != currentDataTotalLen!!!");
        j();
        return false;
    }

    private void e(int currentTotalLen, int totalLen, Calendar timestamp) {
        this.j = true;
        this.m = currentTotalLen;
        this.n = 0;
        this.o = timestamp;
        Debug.fi(x, "currentDataLen: " + this.n + ",currentDataTotalLen:" + this.m);
        StringBuilder sb = new StringBuilder();
        sb.append("timestamp: ");
        sb.append(this.o.getTime().toString());
        Debug.fi(x, sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("totalLen: ");
        sb2.append(totalLen / (this.r ? 4 : 3));
        sb2.append(" minute(s)");
        Debug.fi(x, sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append("current: ");
        sb3.append(this.m / (this.r ? 4 : 3));
        sb3.append(" minute(s)");
        Debug.fi(x, sb3.toString());
    }

    private void f() {
        this.i = false;
        this.j = false;
        this.k = -1;
        this.l = -1;
        this.m = 0;
        this.n = 0;
        this.o = null;
    }

    private synchronized void g(boolean isEnd) {
        Debug.fi(x, "getActivities onBleNotify:" + isEnd);
        q();
        if (!isEnd) {
            o(5000);
        }
    }

    private synchronized void h() {
        Debug.fi(x, "getActivities onCommand");
        q();
        o(12000);
    }

    private void i(String error) {
        Debug.fi(x, "getActivities onError:" + error);
    }

    private synchronized void j() {
        Debug.fi(x, "getActivities onMissData");
        this.s = true;
        q();
        p();
    }

    private void k(Progress progress) {
        Debug.i(x, "getActivities onProgress:" + progress);
        this.t.onSyncProgress(progress);
    }

    private void l() {
        Debug.fi(x, "getActivities onStart");
    }

    private synchronized void m() {
        Debug.fi(x, "getActivities onStop");
        q();
        this.t.onSyncProgress(this.f);
    }

    private ActivityDataFragment n() throws IOException {
        int i;
        Debug.trace();
        byte b = (byte) this.p.read();
        GregorianCalendar gregorianCalendar = new GregorianCalendar(this.p.read() + 2000, this.p.read(), this.p.read(), this.p.read(), this.p.read(), this.p.read());
        Debug.i(x, "timestamp: " + DateFormat.getDateTimeInstance().format(gregorianCalendar.getTime()));
        int i2 = (this.p.read() & 255) | ((this.p.read() & 255) << 8);
        Debug.i(x, "totalLen: " + i2 + " minute(s)");
        if (b == 1) {
            i2 *= this.r ? 4 : 3;
        }
        this.f.total = i2;
        int i3 = (this.p.read() & 255) | ((this.p.read() & 255) << 8);
        Debug.i(x, "len: " + i3 + " minute(s)");
        if (b == 1) {
            i = (this.r ? 4 : 3) * i3;
        } else {
            i = i3;
        }
        ArrayList arrayList = new ArrayList(i / 3);
        while (i > 0) {
            byte b2 = (byte) this.p.read();
            byte b3 = (byte) this.p.read();
            byte b4 = (byte) this.p.read();
            if (this.r) {
                arrayList.add(new ActivityData(b3, b4, b2, (byte) this.p.read()));
                i -= 4;
                this.f.progress += 4;
            } else {
                arrayList.add(new ActivityData(b3, b4, b2));
                i -= 3;
                this.f.progress += 3;
            }
            k(this.f);
        }
        return i3 == 0 ? new ActivityDataFragment((Calendar) gregorianCalendar, true) : new ActivityDataFragment(gregorianCalendar, arrayList);
    }

    private void o(int timeout) {
        this.g = new Timer();
        a aVar = new a();
        this.h = aVar;
        this.g.schedule(aVar, timeout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        Debug.fi(x, "stopGetActivities");
        try {
            PipedInputStream pipedInputStream = this.p;
            if (pipedInputStream != null) {
                pipedInputStream.close();
                this.p = null;
            }
            PipedOutputStream pipedOutputStream = this.q;
            if (pipedOutputStream != null) {
                pipedOutputStream.close();
                this.q = null;
            }
        } catch (Exception unused) {
        }
        this.u.stopGetActivities();
    }

    private void q() {
        Timer timer = this.g;
        if (timer != null) {
            timer.cancel();
            this.g.purge();
            this.g = null;
        }
        TimerTask timerTask = this.h;
        if (timerTask != null) {
            timerTask.cancel();
            this.h = null;
        }
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.HMBaseTask
    public void doWork() {
        HMDeviceSyncDataError hMDeviceSyncDataError;
        Debug.fi(x, ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        Debug.fi(x, "===========================start sync data================================");
        Debug.fi(x, ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        this.t.onSyncStart();
        if (this.u == null) {
            Debug.fi(x, "return as gattPeripheral is null!!!");
            return;
        }
        List<ActivityDataFragment> listC = null;
        int i = 0;
        boolean z = false;
        while (i <= 1) {
            f();
            this.s = false;
            listC = c();
            if (!this.s) {
                break;
            }
            i++;
            try {
                Thread.sleep(5000L);
            } catch (Exception unused) {
            }
            z = true;
        }
        if (listC == null) {
            Debug.fi(x, "getActivities return null, now finish!");
        }
        this.t.onSyncStop(listC);
        this.u.confirmActivityDataTransferComplete(Calendar.getInstance(), 0);
        Debug.fi(x, "<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        Debug.fi(x, "============================stop sync data================================");
        Debug.fi(x, "<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        if (listC != null) {
            hMDeviceSyncDataError = new HMDeviceSyncDataError(0);
        } else {
            hMDeviceSyncDataError = new HMDeviceSyncDataError(100);
            hMDeviceSyncDataError.setLosePackageHappened(z);
        }
        this.t.onSyncFinish(hMDeviceSyncDataError);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00a8 A[Catch: Exception -> 0x00b5, TryCatch #0 {Exception -> 0x00b5, blocks: (B:3:0x0004, B:6:0x000d, B:8:0x003f, B:12:0x0046, B:16:0x004f, B:17:0x0051, B:19:0x005b, B:23:0x0068, B:39:0x009f, B:41:0x00a8, B:42:0x00b1, B:25:0x006f, B:27:0x0073, B:29:0x0077, B:34:0x0084, B:35:0x0088, B:36:0x0092, B:38:0x0099), top: B:47:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00b1 A[Catch: Exception -> 0x00b5, TRY_LEAVE, TryCatch #0 {Exception -> 0x00b5, blocks: (B:3:0x0004, B:6:0x000d, B:8:0x003f, B:12:0x0046, B:16:0x004f, B:17:0x0051, B:19:0x005b, B:23:0x0068, B:39:0x009f, B:41:0x00a8, B:42:0x00b1, B:25:0x006f, B:27:0x0073, B:29:0x0077, B:34:0x0084, B:35:0x0088, B:36:0x0092, B:38:0x0099), top: B:47:0x0004 }] */
    @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
    public void notify(byte[] value) {
        boolean zD;
        boolean z;
        boolean z2;
        try {
            if (value.length == 11) {
                byte b = value[0];
                int i = value[1] + 2000;
                byte b2 = value[2];
                byte b3 = value[3];
                byte b4 = value[4];
                byte b5 = value[5];
                byte b6 = value[6];
                byte b7 = value[7];
                int i2 = ((value[8] & 255) << 8) | (b7 & 255);
                int i3 = (value[9] & 255) | ((value[10] & 255) << 8);
                if (b == 1) {
                    boolean z3 = this.r;
                    i2 *= z3 ? 4 : 3;
                    i3 *= z3 ? 4 : 3;
                }
                GregorianCalendar gregorianCalendar = new GregorianCalendar(i, b2, b3, b4, b5, b6);
                if (!this.i) {
                    this.i = true;
                    this.k = b;
                    this.l = i2;
                    z2 = i3 == 0;
                    e(i3, i2, gregorianCalendar);
                } else if (b != this.k || i2 != this.l) {
                    zD = d(value.length);
                } else if (this.n == this.m) {
                    z2 = i3 == 0;
                    e(i3, i2, gregorianCalendar);
                } else {
                    Debug.fi(x, "get data not complete but head coming!!!");
                    j();
                    zD = false;
                }
                z = z2;
                zD = true;
                Debug.i(x, GattUtils.bytesToHexString(value));
                if (zD) {
                    g(true);
                } else {
                    this.q.write(value);
                    g(z);
                }
            }
            zD = d(value.length);
            z = false;
            Debug.i(x, GattUtils.bytesToHexString(value));
            if (zD) {
                g(true);
            } else {
                this.q.write(value);
                g(z);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

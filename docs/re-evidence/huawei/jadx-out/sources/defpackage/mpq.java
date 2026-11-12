package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.huawei.appgallery.agd.api.AgdConstant;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hms.network.embedded.k;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.constant.WatchFaceConstant;
import com.huawei.hwdevice.phoneprocess.binder.ParserInterface;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import health.compact.a.LocalBroadcast;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class mpq implements ParserInterface {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private mpm f42140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f42141c;
    private int f;
    private int g;
    private int h;
    private ThreadPoolManager i;
    private long j;
    private List<mqi> k;
    private List<mqe> l;
    private int m;
    private e n;
    private Handler o;
    private int p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private List<mqm> u;
    private int v;
    private List<mqh> w;
    private long x;
    private long y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f42139a = new Object();
    private static final Object e = new Object();
    private static Map<Integer, List<IBaseResponseCallback>> d = new HashMap(1);

    private mpq() {
        this.l = new ArrayList(1);
        this.w = new ArrayList(1);
        this.u = new ArrayList(1);
        this.k = new ArrayList(10);
        this.o = null;
        this.t = false;
        this.s = false;
        this.q = true;
        this.m = 0;
        this.g = 0;
        this.p = 0;
        this.h = 0;
        this.v = 0;
        this.f = 0;
        this.y = 0L;
        this.j = 0L;
        LogUtil.a("05", 1, "HwBasicAw70Manager", "HwFitnessAw70Manager.");
        this.f42141c = BaseApplication.getContext();
        this.f42140b = mpm.d();
        ThreadPoolManager threadPoolManagerB = ThreadPoolManager.b(5, 5, "HwBasicAw70Manager");
        this.i = threadPoolManagerB;
        threadPoolManagerB.execute(new Runnable() { // from class: mpq.3
            @Override // java.lang.Runnable
            public void run() {
                mpq.this.f42140b.e();
            }
        });
        this.n = new e(this, BaseApplication.getContext().getMainLooper());
        HandlerThread handlerThread = new HandlerThread("HwBasicAw70Manager");
        handlerThread.start();
        this.o = new b(handlerThread.getLooper());
    }

    private static Map<Integer, List<IBaseResponseCallback>> h() {
        Map<Integer, List<IBaseResponseCallback>> map;
        synchronized (mpq.class) {
            map = d;
        }
        return map;
    }

    public boolean b() {
        return this.t;
    }

    public static mpq c() {
        return d.e;
    }

    private void b(byte[] bArr) {
        LogUtil.a("HwBasicAw70Manager", "btDataCallbackResponseSwitchFirst.");
        if (bArr == null || bArr.length < 3) {
            LogUtil.j("HwBasicAw70Manager", "dataInfos is null or length is 3.");
            return;
        }
        byte b2 = bArr[1];
        if (b2 == 3) {
            f(bArr);
            return;
        }
        if (b2 == 10) {
            g(bArr);
        } else if (b2 == 11) {
            i(bArr);
        } else {
            d(bArr);
        }
    }

    private void d(byte[] bArr) {
        LogUtil.a("HwBasicAw70Manager", "btDataCallbackResponseSwitchSecond.");
        byte b2 = bArr[1];
        if (b2 == 31) {
            e(bArr);
            return;
        }
        if (b2 != 32) {
            switch (b2) {
                case 12:
                    h(bArr);
                    break;
                case 13:
                    j(bArr);
                    break;
                case 14:
                    b(bArr, 14);
                    break;
                case 15:
                    c(bArr);
                    break;
                default:
                    LogUtil.j("HwBasicAw70Manager", "btDataCallbackResponseSwitchSecond, default.");
                    break;
            }
            return;
        }
        a(bArr);
    }

    private void d(int i, IBaseResponseCallback iBaseResponseCallback) {
        synchronized (h()) {
            if (iBaseResponseCallback != null) {
                List<IBaseResponseCallback> arrayList = d.get(Integer.valueOf(i));
                if (arrayList == null) {
                    arrayList = new ArrayList<>(1);
                    d.put(Integer.valueOf(i), arrayList);
                }
                arrayList.add(iBaseResponseCallback);
            }
        }
    }

    private void b(int i, int i2, Object obj) {
        LogUtil.a("05", 1, "HwBasicAw70Manager", "processCallback callback cmd: ", Integer.valueOf(i), " errorCode: ", Integer.valueOf(i2));
        synchronized (h()) {
            List<IBaseResponseCallback> list = d.get(Integer.valueOf(i));
            int i3 = 0;
            if (list == null) {
                LogUtil.j("HwBasicAw70Manager", "processCallback, callbackList is null.");
                return;
            }
            while (list.size() > 0) {
                IBaseResponseCallback iBaseResponseCallback = list.get(i3);
                if (iBaseResponseCallback != null) {
                    iBaseResponseCallback.a(i2, obj);
                    list.remove(i3);
                    break;
                } else {
                    list.remove(i3);
                    i3++;
                }
            }
        }
    }

    private void k() {
        LogUtil.a("05", 1, "HwBasicAw70Manager", "sendDetailSyncSuccessBroadcastToHealth.");
        Intent intent = new Intent("com.huawei.health.fitness_detail_sync_success");
        intent.setPackage(BaseApplication.getContext().getPackageName());
        this.f42141c.sendBroadcast(intent, LocalBroadcast.f36595c);
        Intent intent2 = new Intent("com.huawei.health.action.AW70_FITNESS_DETAIL_SYNC_SUCCESS_ACTION");
        intent2.setPackage(BaseApplication.getContext().getPackageName());
        this.f42141c.sendBroadcast(intent2);
    }

    private void l() {
        LogUtil.a("05", 1, "HwBasicAw70Manager", "sendTodaySyncSuccessBroadcast.");
        Intent intent = new Intent("com.huawei.bone.action.FITNESS_DATA_TODAY_SYNC");
        intent.setPackage(BaseApplication.getContext().getPackageName());
        this.f42141c.sendBroadcast(intent, LocalBroadcast.f36595c);
    }

    private void i() {
        LogUtil.a("05", 1, "HwBasicAw70Manager", "saveFitnessDate.");
        boolean zCheckHiHealthServiceExist = HiHealthManager.d(this.f42141c).checkHiHealthServiceExist();
        LogUtil.a("05", 1, "HwBasicAw70Manager", "saveFitnessDate, isExistHiHealthService: ", Boolean.valueOf(zCheckHiHealthServiceExist));
        if (zCheckHiHealthServiceExist) {
            a(5, 120000L);
            this.s = true;
            d();
            this.f42140b.c(this.w, this.u);
            this.w.clear();
            this.u.clear();
            return;
        }
        a(300001);
    }

    @Override // com.huawei.hwdevice.phoneprocess.binder.ParserInterface
    public void getResult(DeviceInfo deviceInfo, byte[] bArr) {
        cpl.d("HwBasicAw70Manager", bArr, "getResult(): ");
        if (bArr == null || bArr.length < 2) {
            LogUtil.j("HwBasicAw70Manager", "processResult data is null.");
        } else {
            b(bArr);
        }
    }

    public void e(int i) {
        LogUtil.a("05", 1, "HwBasicAw70Manager", "doDetailSyncComplete, errorCode: ", Integer.valueOf(i));
        a(i);
    }

    public void a(int i) {
        LogUtil.a("05", 1, "HwBasicAw70Manager", "processDetailSyncComplete errorCode: ", Integer.valueOf(i));
        d(5);
        this.t = false;
        this.s = false;
        this.i.execute(new a(this, i, j()));
        a(true, "processDetailSyncComplete");
    }

    public void e() {
        synchronized (f42139a) {
            LogUtil.a("HwBasicAw70Manager", "mStartTime: ", Long.valueOf(this.y), ", mEndTime: ", Long.valueOf(this.j));
            d();
            mpl.e(this.y, this.j, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i, boolean z) {
        LogUtil.a("05", 1, "HwBasicAw70Manager", "syncCompleteRun, isNeedSyncWork: ", Boolean.valueOf(z));
        synchronized (e) {
            b(10009, i, null);
            a("false");
            n();
            k();
            if (z) {
                mpj.a();
            }
        }
    }

    static class a implements Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f42150c;
        private int d;
        WeakReference<mpq> e;

        a(mpq mpqVar, int i, boolean z) {
            LogUtil.a("05", 1, "HwBasicAw70Manager", "SyncCompleteRunRunnable, isNeedSyncWork: ", Boolean.valueOf(z));
            this.e = new WeakReference<>(mpqVar);
            this.d = i;
            this.f42150c = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            mpq mpqVar = this.e.get();
            if (mpqVar != null) {
                mpqVar.e(this.d, this.f42150c);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        LogUtil.a("05", 1, "HwBasicAw70Manager", "notifyDetailSyncComplete, errorCode: ", Integer.valueOf(i));
        d(0);
        if (i == 0) {
            i();
            i(100000);
            return;
        }
        this.t = false;
        a(true, "notifyDetailSyncComplete");
        a("false");
        n();
        b(10009, i, null);
    }

    private void e(byte[] bArr) {
        LogUtil.a("HwBasicAw70Manager", "parseIntensiveFrameCount.");
        this.m = 0;
        this.g = 0;
        this.k.clear();
        try {
            if (bArr[2] == 127) {
                int iD = mix.d(bArr);
                LogUtil.j("HwBasicAw70Manager", "parseIntensiveFrameCount return errorCode: ", Integer.valueOf(iD));
                a(iD);
                return;
            }
            int iA = mpv.a(bArr);
            this.m = iA;
            LogUtil.a("HwBasicAw70Manager", "parseIntensiveFrameCount get sample frame count: ", Integer.valueOf(iA));
            int i = this.m;
            if (i > 0) {
                LogUtil.a("HwBasicAw70Manager", "parseIntensiveFrameCount get sample frame index: ", Integer.valueOf(this.h), "mIntensiveDataFrameCount: ", Integer.valueOf(i));
                mpl.c(this.g);
                this.g++;
            } else {
                LogUtil.a("HwBasicAw70Manager", "mIntensiveDataFrameCount: ", Integer.valueOf(i));
                this.f42140b.a();
                a(0);
            }
        } catch (eeu e2) {
            LogUtil.e("HwBasicAw70Manager", "parseIntensiveFrameCount Exception : ", ExceptionUtils.c(e2));
        }
    }

    private void a(byte[] bArr) {
        try {
            if (bArr[2] == 127) {
                return;
            }
            this.k.add(mpv.d(bArr));
        } catch (eeu e2) {
            LogUtil.e("HwBasicAw70Manager", "parseIntensiveData Exception : ", ExceptionUtils.c(e2));
        }
        int i = this.g;
        if (i < this.m) {
            mpl.c(i);
            this.g++;
        } else {
            this.s = true;
            this.f42140b.b(this.k);
        }
    }

    private void b(byte[] bArr, int i) {
        LogUtil.a("05", 1, "HwBasicAw70Manager", "processSetCmdResult Complete command: ", Integer.valueOf(i));
        int iD = 201000;
        try {
            if (bArr[2] == 127) {
                iD = mix.d(bArr);
                LogUtil.j("HwBasicAw70Manager", "processSetCmdResult return errorCode: ", Integer.valueOf(iD));
            }
        } catch (eeu e2) {
            LogUtil.e("HwBasicAw70Manager", "processSetCmdResult Exception : ", ExceptionUtils.c(e2));
        }
        b(i, iD, null);
    }

    private void c(byte[] bArr) {
        int iA;
        LogUtil.a("HwBasicAw70Manager", "processDeviceDataReport.");
        try {
            iA = mjb.a(bArr);
        } catch (eeu e2) {
            LogUtil.e("HwBasicAw70Manager", "processDeviceDataReport Exception : ", ExceptionUtils.c(e2));
            iA = 0;
        }
        LogUtil.a("HwBasicAw70Manager", "processDeviceDataReport action: ", Integer.valueOf(iA));
        if (iA == 1) {
            e(new IBaseResponseCallback() { // from class: mpq.1
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    LogUtil.a("HwBasicAw70Manager", "processDeviceDataReport, syncTotal onResponse errorCode: ", Integer.valueOf(i));
                }
            });
            return;
        }
        if (iA == 2) {
            d(new IBaseResponseCallback() { // from class: mpq.4
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    LogUtil.a("HwBasicAw70Manager", "processDeviceDataReport, syncDetail onResponse errorCode: ", Integer.valueOf(i));
                }
            }, false);
            return;
        }
        if (iA == 3) {
            d(new IBaseResponseCallback() { // from class: mpq.2
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    LogUtil.a("HwBasicAw70Manager", "processDeviceDataReport, syncDetail onResponse errorCode: ", Integer.valueOf(i));
                }
            }, false);
        } else {
            if (iA == 8) {
                LogUtil.a("HwBasicAw70Manager", "5.7.15 notify to sync workout data.");
                e(new IBaseResponseCallback() { // from class: mpq.5
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public void a(int i, Object obj) {
                        LogUtil.a("HwBasicAw70Manager", "processDeviceDataReport, syncTotal onResponse errorCode: ", Integer.valueOf(i));
                    }
                });
                mpj.e();
                return;
            }
            LogUtil.j("HwBasicAw70Manager", "processDeviceDataReport, nothing to do.");
        }
    }

    private void g(byte[] bArr) {
        LogUtil.a("05", 1, "HwBasicAw70Manager", "processGetSamplePointFrameCount.");
        this.p = 0;
        this.h = 0;
        try {
            if (bArr[2] == 127) {
                int iD = mix.d(bArr);
                lng.c(iD);
                LogUtil.j("HwBasicAw70Manager", "processGetSamplePointFrameCount, return errorCode: ", Integer.valueOf(iD));
                a(300007);
                i(iD);
                return;
            }
            int iF = mpv.f(bArr);
            this.p = iF;
            ReleaseLogUtil.d("Step_HwBasicAw70Manager", "aw70 7-10 count : ", Integer.valueOf(iF));
            if (this.p > 0) {
                LogUtil.a("05", 1, "HwBasicAw70Manager", "processGetSamplePointFrameCount, get sample frame index: ", Integer.valueOf(this.h));
                mpl.b(this.h);
                this.h++;
                return;
            }
            m();
        } catch (eeu e2) {
            LogUtil.e("HwBasicAw70Manager", "processGetSamplePointFrameCount Exception : ", ExceptionUtils.c(e2));
            lng.c(WatchFaceConstant.WATCH_FACE_SIGN_FAILED_ERROR_100007);
            i(-1);
        }
    }

    private void i(byte[] bArr) {
        LogUtil.a("05", 1, "HwBasicAw70Manager", "processGetSamplePointFrame.");
        try {
            if (bArr[2] == 127) {
                int iD = mix.d(bArr);
                lng.c(iD);
                LogUtil.a("HwBasicAw70Manager", "processGetSamplePointFrame, return errorCode: ", Integer.valueOf(iD));
                a(300007);
                i(iD);
                return;
            }
            this.w.add(mpv.j(bArr));
            int i = this.h;
            if (i < this.p) {
                mpl.b(i);
                this.h++;
            } else {
                m();
            }
        } catch (eeu e2) {
            LogUtil.e("HwBasicAw70Manager", "processGetSamplePointFrame Exception : ", ExceptionUtils.c(e2));
            lng.c(WatchFaceConstant.WATCH_FACE_SIGN_FAILED_ERROR_100007);
            i(-1);
        }
    }

    private void m() {
        LogUtil.a("HwBasicAw70Manager", "syncStatusPoint.");
        long jC = mpo.c();
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        if (jCurrentTimeMillis - jC > k.b.l || jC == 0) {
            jC = b(jCurrentTimeMillis - k.b.l);
            mpo.a(jC);
        } else if (jC >= jCurrentTimeMillis && jC - jCurrentTimeMillis <= 300) {
            LogUtil.a("HwBasicAw70Manager", "syncStatusPoint, lastStatusTime is not correct.");
            jC = jCurrentTimeMillis - 61;
        } else if (jC - jCurrentTimeMillis > 300) {
            LogUtil.a("HwBasicAw70Manager", "syncStatusPoint, lastStatusTime is not correct and need write back.");
            jC = jCurrentTimeMillis - 61;
            mpo.a(jC);
        } else {
            LogUtil.j("HwBasicAw70Manager", "syncStatusPoint, nothing to do.");
        }
        mpl.b(jC, jCurrentTimeMillis);
    }

    private void h(byte[] bArr) {
        LogUtil.a("HwBasicAw70Manager", "processGetStatusFrameCount.");
        this.v = 0;
        this.f = 0;
        try {
            if (bArr[2] == 127) {
                int iD = mix.d(bArr);
                lng.c(iD);
                LogUtil.a("HwBasicAw70Manager", "processGetStatusFrameCount, return errorCode: ", Integer.valueOf(iD));
                a(300007);
                i(iD);
                return;
            }
            int i = mpv.i(bArr);
            this.v = i;
            ReleaseLogUtil.d("Step_HwBasicAw70Manager", "aw70 7-12 count : ", Integer.valueOf(i));
            if (this.v > 0) {
                mpl.d(this.f);
                this.f++;
            } else {
                b(0);
            }
        } catch (eeu e2) {
            LogUtil.e("HwBasicAw70Manager", "processGetStatusFrameCount Exception : ", ExceptionUtils.c(e2));
            lng.c(WatchFaceConstant.WATCH_FACE_SIGN_FAILED_ERROR_100007);
            i(-1);
        }
    }

    private void j(byte[] bArr) {
        int i;
        LogUtil.a("HwBasicAw70Manager", "processGetStatusFrame.");
        try {
            i = 0;
            if (bArr[2] == 127) {
                int iD = mix.d(bArr);
                lng.c(iD);
                LogUtil.a("HwBasicAw70Manager", "processGetStatusFrame, return errorCode: ", Integer.valueOf(iD));
                a(300007);
                i(iD);
                return;
            }
            this.u.add(mpv.h(bArr));
            int i2 = this.f;
            if (i2 < this.v) {
                mpl.d(i2);
                this.f++;
            } else {
                b(i);
            }
        } catch (eeu e2) {
            LogUtil.e("HwBasicAw70Manager", "processGetStatusFrame Exception : ", ExceptionUtils.c(e2));
            lng.c(WatchFaceConstant.WATCH_FACE_SIGN_FAILED_ERROR_100007);
            i(-1);
            i = 201000;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i) {
        LogUtil.a("05", 1, "HwBasicAw70Manager", "doSyncTodayComplete, errorCode: ", Integer.valueOf(i));
        b(10008, i, null);
        l();
    }

    private void f(byte[] bArr) {
        int i;
        LogUtil.a("05", 1, "HwBasicAw70Manager", "processGetTodayFitnessData.");
        d(4);
        int iD = 201000;
        try {
            i = 0;
            if (bArr[2] == 127) {
                iD = mix.d(bArr);
                lng.c(iD);
                LogUtil.a("HwBasicAw70Manager", "processGetTodayFitnessData, return errorCode:", Integer.valueOf(iD));
                i(iD);
                i = iD;
            } else {
                this.f42140b.b(d.e, mpv.b(bArr));
            }
        } catch (eeu e2) {
            LogUtil.e("HwBasicAw70Manager", "processGetTodayFitnessData Exception : ", ExceptionUtils.c(e2));
            lng.c(WatchFaceConstant.WATCH_FACE_SIGN_FAILED_ERROR_100007);
            i(-1);
        }
        c(i);
    }

    private void a(int i, long j) {
        e eVar = this.n;
        if (eVar != null) {
            eVar.sendEmptyMessageDelayed(i, j);
        } else {
            LogUtil.j("HwBasicAw70Manager", "fitnessMgrSendMsgDelay, mHwFitnessMgrHandler is null.");
        }
    }

    private void d(int i) {
        e eVar = this.n;
        if (eVar == null) {
            LogUtil.j("HwBasicAw70Manager", "fitnessMgrRemoveMsg, mHwFitnessMgrHandler is null.");
        } else if (eVar.hasMessages(i)) {
            this.n.removeMessages(i);
        }
    }

    static class e extends Handler {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        WeakReference<mpq> f42154c;

        e(mpq mpqVar, Looper looper) {
            super(looper);
            this.f42154c = new WeakReference<>(mpqVar);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                return;
            }
            super.handleMessage(message);
            mpq mpqVar = this.f42154c.get();
            if (mpqVar == null) {
                LogUtil.a("HwBasicAw70Manager", "HwFitnessMgrHandler, hwFitnessAw70Mgr is null.");
                return;
            }
            LogUtil.a("HwBasicAw70Manager", "HwFitnessMgrHandler, handleMessage msg: ", Integer.valueOf(message.what));
            int i = message.what;
            if (i == 0) {
                LogUtil.a("HwBasicAw70Manager", "HwFitnessMgrHandler, sync detail timeout.");
                mpqVar.b(300001);
                mpqVar.i(0);
                return;
            }
            if (i == 1) {
                LogUtil.a("HwBasicAw70Manager", "HwFitnessMgrHandler, get frame count timeout.");
                return;
            }
            if (i == 2) {
                LogUtil.a("HwBasicAw70Manager", "HwFitnessMgrHandler, get frame timeout.");
                return;
            }
            if (i == 3) {
                LogUtil.a("HwBasicAw70Manager", "HwFitnessMgrHandler, Sync Complete msg.");
                mpqVar.a(0);
            } else if (i == 4) {
                LogUtil.a("HwBasicAw70Manager", "HwFitnessMgrHandler, Sync today timeout msg.");
                mpqVar.c(300001);
                mpqVar.i(4);
            } else if (i != 5) {
                LogUtil.j("HwBasicAw70Manager", "HwFitnessMgrHandler, unknown msg type.");
            } else {
                LogUtil.a("HwBasicAw70Manager", "HwFitnessMgrHandler, Save fitness data timeout msg.");
                mpqVar.a(300001);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(IBaseResponseCallback iBaseResponseCallback) {
        synchronized (f42139a) {
            DeviceInfo deviceInfoA = mpz.a("HwBasicAw70Manager");
            if (deviceInfoA != null && deviceInfoA.getDeviceConnectState() == 2) {
                a(4, 40000L);
                d(10008, iBaseResponseCallback);
                LogUtil.a("HwBasicAw70Manager", "syncFitnessTodayDataRun, enter thread.");
                mpl.a();
                return;
            }
            LogUtil.j("HwBasicAw70Manager", "syncFitnessTodayDataRun, get device info error.");
            if (iBaseResponseCallback != null) {
                iBaseResponseCallback.a(300004, null);
            }
        }
    }

    public void e(IBaseResponseCallback iBaseResponseCallback) {
        this.i.execute(new h(this, iBaseResponseCallback));
    }

    static class h implements Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        WeakReference<mpq> f42155c;
        IBaseResponseCallback d;

        h(mpq mpqVar, IBaseResponseCallback iBaseResponseCallback) {
            this.f42155c = new WeakReference<>(mpqVar);
            this.d = iBaseResponseCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            mpq mpqVar = this.f42155c.get();
            if (mpqVar != null) {
                mpqVar.d(this.d);
            }
        }
    }

    public void d() {
        LogUtil.a("05", 1, "HwBasicAw70Manager", "registerDeviceToHiHealth.");
        final DeviceInfo deviceInfoA = mpz.a("HwBasicAw70Manager");
        if (deviceInfoA != null) {
            this.i.execute(new Runnable() { // from class: mpq.8
                @Override // java.lang.Runnable
                public void run() {
                    myo.a(deviceInfoA);
                }
            });
        } else {
            LogUtil.j("HwBasicAw70Manager", "registerDeviceToHiHealth, deviceInfo is null.");
        }
    }

    public void c(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.j("HwBasicAw70Manager", "handleDeviceConnection, deviceInfo is null.");
            return;
        }
        int deviceConnectState = deviceInfo.getDeviceConnectState();
        LogUtil.a("HwBasicAw70Manager", "handleDeviceConnection, device Connect state: ", Integer.valueOf(deviceConnectState));
        if (deviceConnectState == 2) {
            LogUtil.a("HwBasicAw70Manager", "handleDeviceConnection.");
            mpz.c(deviceInfo);
            mhs.a().getSwitchSetting("custom.activity_reminder", new IBaseResponseCallback() { // from class: mpq.10
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    Message messageObtainMessage = mpq.this.o.obtainMessage();
                    messageObtainMessage.obj = obj;
                    messageObtainMessage.what = 10001;
                    mpq.this.o.sendMessage(messageObtainMessage);
                }
            });
            return;
        }
        if (deviceConnectState == 3) {
            synchronized (h()) {
                d.clear();
            }
            if (!this.s) {
                LogUtil.a("HwBasicAw70Manager", "handleDeviceConnection, Data sync bt bt disconnect.");
                this.t = false;
                a("false");
                n();
                a(300004);
                Intent intent = new Intent("com.huawei.health.fitness_detail_sync_fail");
                intent.setPackage(BaseApplication.getContext().getPackageName());
                this.f42141c.sendBroadcast(intent, LocalBroadcast.f36595c);
            }
            i(300004);
            return;
        }
        LogUtil.j("HwBasicAw70Manager", "handleDeviceConnection, nothing to do.");
    }

    private long b(long j) {
        String str = new SimpleDateFormat("yyyyMMdd", Locale.ENGLISH).format(new Date(j * 1000));
        try {
            return new SimpleDateFormat("yyyyMMddhhmm", Locale.ENGLISH).parse(str + AgdConstant.INSTALL_TYPE_DEFAULT).getTime() / 1000;
        } catch (ParseException e2) {
            LogUtil.e("HwBasicAw70Manager", "getBeginOfDate Exception : ", ExceptionUtils.c(e2));
            return j;
        }
    }

    private void f() {
        this.l.clear();
        this.w.clear();
        this.u.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(IBaseResponseCallback iBaseResponseCallback, boolean z) {
        synchronized (f42139a) {
            LogUtil.a("05", 1, "HwBasicAw70Manager", "syncFitnessDetailDataRun, thread isNeedSyncWork: ", Boolean.valueOf(z));
            DeviceInfo deviceInfoA = mpz.a("HwBasicAw70Manager");
            if (deviceInfoA != null && deviceInfoA.getDeviceConnectState() == 2) {
                if (this.t) {
                    LogUtil.a("05", 1, "HwBasicAw70Manager", "syncFitnessDetailData, data syncing.");
                    iBaseResponseCallback.a(300002, null);
                    return;
                }
                this.t = true;
                a(z, "syncFitnessDetailDataRun");
                a("true");
                a(0, 240000L);
                d(10009, iBaseResponseCallback);
                f();
                this.y = g();
                long jCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                this.j = jCurrentTimeMillis;
                long j = this.y;
                if (jCurrentTimeMillis - j > k.b.l || j == 0) {
                    long jB = b(jCurrentTimeMillis - k.b.l);
                    this.y = jB;
                    c(jB);
                } else if (j >= jCurrentTimeMillis && j - jCurrentTimeMillis <= 300) {
                    LogUtil.a("05", 1, "HwBasicAw70Manager", "syncFitnessDetailData, lastSync time is not correct.");
                    this.y = this.j - 61;
                } else if (j - jCurrentTimeMillis > 300) {
                    LogUtil.a("05", 1, "HwBasicAw70Manager", "syncFitnessDetailData, lastSync time is not correct and need write back.");
                    long j2 = this.j - 61;
                    this.y = j2;
                    c(j2);
                } else {
                    LogUtil.j("05", 1, "HwBasicAw70Manager", "syncFitnessDetailDataRun, nothing to do.");
                }
                mpl.a(this.y, this.j);
                return;
            }
            LogUtil.j("05", 1, "HwBasicAw70Manager", "syncFitnessDetailDataRun, get device info error.");
            iBaseResponseCallback.a(300004, null);
        }
    }

    public void d(final IBaseResponseCallback iBaseResponseCallback, final boolean z) {
        Log.i("HwBasicAw70Manager", "syncFitnessDetailData.");
        this.x = System.currentTimeMillis();
        this.r = z;
        e(new IBaseResponseCallback() { // from class: mpq.7
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("05", 1, "HwBasicAw70Manager", "syncFitnessDetailData, today total finish need detail errorCode: ", Integer.valueOf(i));
                mpq mpqVar = mpq.this;
                if (mpqVar.a(mpqVar.x, mpq.this.g(), z)) {
                    mpq.this.t = false;
                } else {
                    mpq.this.i.execute(new c(mpq.this, iBaseResponseCallback, true));
                }
            }
        });
    }

    public boolean a(long j, long j2, boolean z) {
        long j3 = j2 * 1000;
        LogUtil.a("HwBasicAw70Manager", "syncFitnessDetailData startTime:", Long.valueOf(j), " getLastSyncTime:", Long.valueOf(j3), " isManual:", Boolean.valueOf(z));
        return z && j > j3 && j - j3 < 60000;
    }

    static class c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        IBaseResponseCallback f42152b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f42153c;
        WeakReference<mpq> d;

        c(mpq mpqVar, IBaseResponseCallback iBaseResponseCallback, boolean z) {
            LogUtil.a("05", 1, "HwBasicAw70Manager", " SyncFitnessDetailDataRunnable: ", Boolean.valueOf(z));
            this.d = new WeakReference<>(mpqVar);
            this.f42152b = iBaseResponseCallback;
            this.f42153c = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            mpq mpqVar = this.d.get();
            if (mpqVar != null) {
                mpqVar.b(this.f42152b, this.f42153c);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long g() {
        LogUtil.a("05", 1, "HwBasicAw70Manager", "getLastSyncTime.");
        return new mpp().e();
    }

    public void c(long j) {
        LogUtil.a("05", 1, "HwBasicAw70Manager", "setLastSyncTime time: ", Long.valueOf(j));
        mpp mppVar = new mpp();
        mqg mqgVar = new mqg();
        mqgVar.e(j);
        mppVar.d(mqgVar);
    }

    public static String a() {
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        return accountInfo == null ? "" : accountInfo;
    }

    private void a(String str) {
        SharedPreferenceManager.e(this.f42141c, String.valueOf(10008), "KEY_SYNCHRONIZING_DATA_FLAG", str, null);
    }

    private void n() {
        LogUtil.a("HwBasicAw70Manager", "sendDialogDismissBroadcast.");
        Intent intent = new Intent("com.huawei.bone.action.ACTION_DIALOG_DISMISS");
        intent.setPackage(BaseApplication.getContext().getPackageName());
        this.f42141c.sendBroadcast(intent, LocalBroadcast.f36595c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(final int i) {
        LogUtil.a("HwBasicAw70Manager", "sendAw70FitnessSyncEvent, result: ", Integer.valueOf(i));
        ThreadPoolManager.c().execute(new Runnable() { // from class: mpq.6
            @Override // java.lang.Runnable
            public void run() {
                mie.d(i, mpq.this.r, mpq.this.x, mpz.a("HwBasicAw70Manager"));
            }
        });
    }

    private boolean j() {
        return this.q;
    }

    private void a(boolean z, String str) {
        this.q = z;
        LogUtil.a("HwBasicAw70Manager", "setNeedWorkout, mIsNeedWorkout: ", Boolean.valueOf(z), ", from: ", str);
    }

    class b extends Handler {
        b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                LogUtil.j("HwBasicAw70Manager", "MyHandle, message is null.");
                return;
            }
            super.handleMessage(message);
            int i = message.what;
            if (i == 1) {
                LogUtil.a("HwBasicAw70Manager", " handleMessage, BasicCommandId.COMMAND_FITNESS_SET_MOTION_GOAL.");
            } else if (i != 10001) {
                LogUtil.j("HwBasicAw70Manager", "MyHandle, nothing to do.");
            } else {
                LogUtil.a("HwBasicAw70Manager", " handleMessage, BasicCommandId.GET_FITNESS_GET_ACTIVITY_REMINDER.");
                mpq.this.o();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        LogUtil.a("HwBasicAw70Manager", "setDefaultDeviceReportThreshold.");
        DeviceInfo deviceInfoA = mpz.a("HwBasicAw70Manager");
        if (deviceInfoA == null) {
            LogUtil.j("HwBasicAw70Manager", "setDefaultDeviceReportThreshold, deviceInfo is null.");
            return;
        }
        DeviceCapability deviceCapabilityC = mpz.c(deviceInfoA.getDeviceIdentify());
        if (deviceCapabilityC == null) {
            LogUtil.j("HwBasicAw70Manager", "setDefaultDeviceReportThreshold, deviceCapability is null.");
        } else if (!deviceCapabilityC.isSupportThreshold()) {
            LogUtil.j("HwBasicAw70Manager", "setDefaultDeviceReportThreshold, is not support.");
        } else {
            mpl.d(mhl.d(1));
        }
    }

    static class d {
        private static final mpq e = new mpq();
    }
}

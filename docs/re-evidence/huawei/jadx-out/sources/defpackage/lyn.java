package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huawei.appgallery.agd.api.AgdConstant;
import com.huawei.callback.BluetoothDataReceiveCallback;
import com.huawei.datatype.FitnessUserInfo;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.healthdatamgr.api.HealthDataMgrApi;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hms.network.embedded.k;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.fitnessdatatype.ActivityReminder;
import com.huawei.hwcommonmodel.fitnessdatatype.MotionGoal;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.constant.WatchFaceConstant;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.up.model.UserInfomation;
import health.compact.a.LocalBroadcast;
import health.compact.a.Services;
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

/* JADX INFO: loaded from: classes10.dex */
public class lyn implements BluetoothDataReceiveCallback {
    private static lyn e;
    private Context i;
    private lyw l;
    private Handler n;
    private ThreadPoolManager o;
    private c p;
    private lvb r;
    private boolean y;
    private long z;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f41132c = new Object();
    private static final Object d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f41130a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Map<Integer, List<IBaseResponseCallback>> f41131b = new HashMap(1);
    private List<lxy> q = new ArrayList(1);
    private List<lyk> aa = new ArrayList(1);
    private List<lyi> ac = new ArrayList(1);
    private List<lyh> t = new ArrayList(10);
    private boolean w = false;
    private boolean u = false;
    private boolean x = true;
    private int s = 0;
    private int k = 0;
    private int v = 0;
    private int j = 0;
    private int ab = 0;
    private int h = 0;
    private long ad = 0;
    private long m = 0;
    private IBaseResponseCallback f = new AnonymousClass5();
    private IBaseResponseCallback g = new IBaseResponseCallback() { // from class: lyn.2
        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            LogUtil.a("HwFitnessAw70Manager", "mCallback, errorCode: ", Integer.valueOf(i), ", reason: ", obj);
            Intent intent = new Intent("com.huawei.phoneservice.sync_workout_broadcast_action");
            intent.setPackage(BaseApplication.getContext().getPackageName());
            lyn.this.i.sendBroadcast(intent, LocalBroadcast.f36595c);
        }
    };
    private IBaseResponseCallback ae = new IBaseResponseCallback() { // from class: lyn.7
        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            LogUtil.a("HwFitnessAw70Manager", "mWorkoutCallbackConnect, errorCode: ", Integer.valueOf(i), ", reason:", obj);
            Intent intent = new Intent("com.huawei.bone.action.FITNESS_DATA_DETAIL_SYNC");
            intent.setPackage(BaseApplication.getContext().getPackageName());
            lyn.this.i.sendBroadcast(intent, LocalBroadcast.f36595c);
        }
    };

    public boolean e() {
        return false;
    }

    /* JADX INFO: renamed from: lyn$5, reason: invalid class name */
    class AnonymousClass5 implements IBaseResponseCallback {
        AnonymousClass5() {
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            if (obj instanceof FitnessUserInfo) {
                long time = ((FitnessUserInfo) obj).getTime();
                LogUtil.a("HwFitnessAw70Manager", "mBaseResponseCallback enter");
                final long j = time * 1000;
                LoginInit.getInstance(lyn.this.i).getUserInfoFromDb(new IBaseResponseCallback() { // from class: lyq
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public final void a(int i2, Object obj2) {
                        this.f41153a.b(j, i2, obj2);
                    }
                });
            }
        }

        /* synthetic */ void b(long j, int i, Object obj) {
            if (i != 0 || !(obj instanceof UserInfomation)) {
                LogUtil.a("HwFitnessAw70Manager", "mBaseResponseCallback userInfo is null");
                return;
            }
            UserInfomation userInfomation = (UserInfomation) obj;
            LogUtil.a("HwFitnessAw70Manager", "mBaseResponseCallback, SetTime: ", Long.valueOf(userInfomation.getSetTime()), " deviceTime: ", Long.valueOf(j));
            if (userInfomation.getSetTime() > j) {
                lyn.this.a(userInfomation);
            } else {
                LogUtil.a("HwFitnessAw70Manager", "mBaseResponseCallback others");
            }
        }
    }

    private lyn(Context context) {
        this.n = null;
        LogUtil.a("05", 1, "HwFitnessAw70Manager", "HwFitnessAw70Manager.");
        this.i = context;
        lvb lvbVarE = lvb.e();
        this.r = lvbVarE;
        if (lvbVarE == null) {
            LogUtil.j("05", 1, "HwFitnessAw70Manager", "mHwDeviceConfigManager is null.");
            return;
        }
        lvbVarE.d(WatchFaceConstant.WATCH_FACE_SIGN_FAILED_ERROR_100007, this);
        this.l = lyw.b();
        ThreadPoolManager threadPoolManagerB = ThreadPoolManager.b(5, 5, "HwFitnessAw70Manager");
        this.o = threadPoolManagerB;
        threadPoolManagerB.execute(new Runnable() { // from class: lyn.8
            @Override // java.lang.Runnable
            public void run() {
                lyn.this.l.a();
            }
        });
        n();
        this.p = new c(this, BaseApplication.getContext().getMainLooper());
        HandlerThread handlerThread = new HandlerThread("HWFitnessMgr");
        handlerThread.start();
        this.n = new d(handlerThread.getLooper());
    }

    private static Map<Integer, List<IBaseResponseCallback>> h() {
        Map<Integer, List<IBaseResponseCallback>> map;
        synchronized (lyn.class) {
            map = f41131b;
        }
        return map;
    }

    public boolean a() {
        return this.w;
    }

    public static lyn c(Context context) {
        lyn lynVar;
        synchronized (d) {
            if (e == null) {
                e = new lyn(context);
            }
            lynVar = e;
        }
        return lynVar;
    }

    private void d(byte[] bArr) {
        LogUtil.a("HwFitnessAw70Manager", "btDataCallbackResponseSwitchFirst.");
        if (bArr == null || bArr.length < 3) {
            LogUtil.j("HwFitnessAw70Manager", "dataInfos is null or length is 3.");
            return;
        }
        switch (bArr[1]) {
            case 1:
                a(bArr, 1);
                break;
            case 2:
            case 9:
                a(bArr, 10002);
                break;
            case 3:
                l(bArr);
                break;
            case 4:
            case 5:
            case 8:
            default:
                e(bArr);
                break;
            case 6:
                m();
                break;
            case 7:
                a(bArr, 7);
                break;
            case 10:
                f(bArr);
                break;
            case 11:
                g(bArr);
                break;
        }
    }

    private void e(byte[] bArr) {
        LogUtil.a("HwFitnessAw70Manager", "btDataCallbackResponseSwitchSecond.");
        byte b2 = bArr[1];
        if (b2 == 21) {
            h(bArr);
            return;
        }
        if (b2 == 31) {
            c(bArr);
            return;
        }
        if (b2 != 32) {
            switch (b2) {
                case 12:
                    i(bArr);
                    break;
                case 13:
                    j(bArr);
                    break;
                case 14:
                    a(bArr, 14);
                    break;
                case 15:
                    b(bArr);
                    break;
                case 16:
                    a(bArr, 16);
                    break;
                default:
                    LogUtil.j("HwFitnessAw70Manager", "btDataCallbackResponseSwitchSecond, default.");
                    break;
            }
            return;
        }
        a(bArr);
    }

    private void b(int i, IBaseResponseCallback iBaseResponseCallback) {
        synchronized (h()) {
            if (iBaseResponseCallback != null) {
                List<IBaseResponseCallback> arrayList = f41131b.get(Integer.valueOf(i));
                if (arrayList == null) {
                    arrayList = new ArrayList<>(1);
                    f41131b.put(Integer.valueOf(i), arrayList);
                }
                arrayList.add(iBaseResponseCallback);
            }
        }
    }

    private void a(int i, int i2, Object obj) {
        LogUtil.a("05", 1, "HwFitnessAw70Manager", "processCallback callback cmd: ", Integer.valueOf(i), " errorCode: ", Integer.valueOf(i2));
        synchronized (h()) {
            List<IBaseResponseCallback> list = f41131b.get(Integer.valueOf(i));
            int i3 = 0;
            if (list == null) {
                LogUtil.j("HwFitnessAw70Manager", "processCallback, callbackList is null.");
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

    private void s() {
        LogUtil.a("05", 1, "HwFitnessAw70Manager", "sendDetailSyncSuccessBroadcastToHealth.");
        Intent intent = new Intent("com.huawei.health.fitness_detail_sync_success");
        intent.setPackage(BaseApplication.getContext().getPackageName());
        this.i.sendBroadcast(intent, LocalBroadcast.f36595c);
        Intent intent2 = new Intent("com.huawei.health.action.AW70_FITNESS_DETAIL_SYNC_SUCCESS_ACTION");
        intent2.setPackage(BaseApplication.getContext().getPackageName());
        this.i.sendBroadcast(intent2);
    }

    private void r() {
        LogUtil.a("05", 1, "HwFitnessAw70Manager", "sendTodaySyncSuccessBroadcast.");
        Intent intent = new Intent("com.huawei.bone.action.FITNESS_DATA_TODAY_SYNC");
        intent.setPackage(BaseApplication.getContext().getPackageName());
        this.i.sendBroadcast(intent, LocalBroadcast.f36595c);
    }

    private void l() {
        LogUtil.a("05", 1, "HwFitnessAw70Manager", "saveFitnessDate.");
        boolean zCheckHiHealthServiceExist = HiHealthManager.d(this.i).checkHiHealthServiceExist();
        LogUtil.a("05", 1, "HwFitnessAw70Manager", "saveFitnessDate, isExistHiHealthService: ", Boolean.valueOf(zCheckHiHealthServiceExist));
        if (zCheckHiHealthServiceExist) {
            b(5, 120000L);
            this.u = true;
            b();
            this.l.a(this.aa, this.ac);
            this.aa.clear();
            this.ac.clear();
            return;
        }
        e(300001);
    }

    public void c() {
        LogUtil.a("05", 1, "HwFitnessAw70Manager", "setDeviceFitnessGoal.");
        qgq.c(new MotionGoal(), new IBaseResponseCallback() { // from class: lyn.6
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                lyn.this.o.execute(new b(i, obj));
            }
        });
    }

    @Override // com.huawei.callback.BluetoothDataReceiveCallback
    public void onDataReceived(int i, DeviceInfo deviceInfo, byte[] bArr) {
        if (i != 0) {
            LogUtil.j("HwFitnessAw70Manager", "mBluetoothDataCallback, onDataReceived errorCode: ", Integer.valueOf(i));
        } else {
            LogUtil.a("HwFitnessAw70Manager", "mBluetoothDataCallback, onDataReceived dataInfos: ", eeq.e(bArr));
            d(bArr);
        }
    }

    static class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f41147a;
        private Object e;

        b(int i, Object obj) {
            this.f41147a = i;
            this.e = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            LogUtil.a("HwFitnessAw70Manager", "SetDeviceFitnessGoalResponseRunnable, onResponse object: ", this.e);
            if (this.f41147a == 0) {
                Object obj = this.e;
                if (obj instanceof MotionGoal) {
                    ArrayList arrayList = new ArrayList(1);
                    arrayList.add((MotionGoal) obj);
                    lyv.a(arrayList);
                }
            }
        }
    }

    public void b(int i) {
        LogUtil.a("05", 1, "HwFitnessAw70Manager", "doDetailSyncComplete, errorCode: ", Integer.valueOf(i));
        e(i);
    }

    public void e(int i) {
        LogUtil.a("05", 1, "HwFitnessAw70Manager", "processDetailSyncComplete errorCode: ", Integer.valueOf(i));
        a(5);
        this.w = false;
        this.u = false;
        this.o.execute(new a(this, i, o()));
        d(true, "processDetailSyncComplete");
    }

    public void g() {
        synchronized (f41132c) {
            LogUtil.a("HwFitnessAw70Manager", "mStartTime: ", Long.valueOf(this.ad), ", mEndTime: ", Long.valueOf(this.m));
            b();
            lyv.b(this.ad, this.m, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i, boolean z) {
        LogUtil.a("05", 1, "HwFitnessAw70Manager", "syncCompleteRun, isNeedSyncWork: ", Boolean.valueOf(z));
        synchronized (f41130a) {
            a(10009, i, (Object) null);
            c("false");
            q();
            s();
            if (z) {
                this.r.a(this.ae);
            }
        }
    }

    static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f41144a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f41145b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        WeakReference<lyn> f41146c;

        a(lyn lynVar, int i, boolean z) {
            LogUtil.a("05", 1, "HwFitnessAw70Manager", "SyncCompleteRunRunnable, isNeedSyncWork: ", Boolean.valueOf(z));
            this.f41146c = new WeakReference<>(lynVar);
            this.f41144a = i;
            this.f41145b = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            lyn lynVar = this.f41146c.get();
            if (lynVar != null) {
                lynVar.b(this.f41144a, this.f41145b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i) {
        LogUtil.a("05", 1, "HwFitnessAw70Manager", "notifyDetailSyncComplete, errorCode: ", Integer.valueOf(i));
        a(0);
        if (i == 0) {
            l();
            g(100000);
            return;
        }
        this.w = false;
        d(true, "notifyDetailSyncComplete");
        c("false");
        q();
        a(10009, i, (Object) null);
    }

    private void c(byte[] bArr) {
        LogUtil.a("HwFitnessAw70Manager", "parseIntensiveFrameCount.");
        this.s = 0;
        this.k = 0;
        this.t.clear();
        try {
            if (bArr[2] == 127) {
                int iD = mix.d(bArr);
                LogUtil.j("HwFitnessAw70Manager", "parseIntensiveFrameCount return errorCode: ", Integer.valueOf(iD));
                e(iD);
                return;
            }
            int iA = lxx.a(bArr);
            this.s = iA;
            LogUtil.a("HwFitnessAw70Manager", "parseIntensiveFrameCount get sample frame count: ", Integer.valueOf(iA));
            int i = this.s;
            if (i > 0) {
                LogUtil.a("HwFitnessAw70Manager", "parseIntensiveFrameCount get sample frame index: ", Integer.valueOf(this.j), "mIntensiveDataFrameCount: ", Integer.valueOf(i));
                lyv.c(this.k);
                this.k++;
            } else {
                LogUtil.a("HwFitnessAw70Manager", "mIntensiveDataFrameCount: ", Integer.valueOf(i));
                this.l.e();
                e(0);
            }
        } catch (eeu e2) {
            LogUtil.e("HwFitnessAw70Manager", "parseIntensiveFrameCount Exception : ", ExceptionUtils.c(e2));
        }
    }

    private void a(byte[] bArr) {
        try {
            if (bArr[2] == 127) {
                return;
            }
            this.t.add(lxx.b(bArr));
        } catch (eeu e2) {
            LogUtil.e("HwFitnessAw70Manager", "parseIntensiveData Exception : ", ExceptionUtils.c(e2));
        }
        int i = this.k;
        if (i < this.s) {
            lyv.c(i);
            this.k++;
        } else {
            this.u = true;
            this.l.d(this.t);
        }
    }

    private void a(byte[] bArr, int i) {
        LogUtil.a("05", 1, "HwFitnessAw70Manager", "processSetCmdResult Complete command: ", Integer.valueOf(i));
        int iD = 201000;
        try {
            if (bArr[2] == 127) {
                iD = mix.d(bArr);
                LogUtil.j("HwFitnessAw70Manager", "processSetCmdResult return errorCode: ", Integer.valueOf(iD));
            }
        } catch (eeu e2) {
            LogUtil.e("HwFitnessAw70Manager", "processSetCmdResult Exception : ", ExceptionUtils.c(e2));
        }
        a(i, iD, (Object) null);
    }

    private void b(byte[] bArr) {
        int iA;
        LogUtil.a("HwFitnessAw70Manager", "processDeviceDataReport.");
        try {
            iA = mjb.a(bArr);
        } catch (eeu e2) {
            LogUtil.e("HwFitnessAw70Manager", "processDeviceDataReport Exception : ", ExceptionUtils.c(e2));
            iA = 0;
        }
        LogUtil.a("HwFitnessAw70Manager", "processDeviceDataReport action: ", Integer.valueOf(iA));
        if (iA == 1) {
            b(new IBaseResponseCallback() { // from class: lyn.9
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    LogUtil.a("HwFitnessAw70Manager", "processDeviceDataReport, syncTotal onResponse errorCode: ", Integer.valueOf(i));
                }
            });
            return;
        }
        if (iA == 2) {
            e(new IBaseResponseCallback() { // from class: lyn.10
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    LogUtil.a("HwFitnessAw70Manager", "processDeviceDataReport, syncDetail onResponse errorCode: ", Integer.valueOf(i));
                }
            }, false);
            return;
        }
        if (iA == 3) {
            e(new IBaseResponseCallback() { // from class: lyn.11
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    LogUtil.a("HwFitnessAw70Manager", "processDeviceDataReport, syncDetail onResponse errorCode: ", Integer.valueOf(i));
                }
            }, false);
        } else if (iA == 8) {
            LogUtil.a("HwFitnessAw70Manager", "5.7.15 notify to sync workout data.");
            k();
        } else {
            LogUtil.j("HwFitnessAw70Manager", "processDeviceDataReport, nothing to do.");
        }
    }

    private void f(byte[] bArr) {
        LogUtil.a("05", 1, "HwFitnessAw70Manager", "processGetSamplePointFrameCount.");
        this.v = 0;
        this.j = 0;
        try {
            if (bArr[2] == 127) {
                int iD = mix.d(bArr);
                lng.c(iD);
                LogUtil.j("HwFitnessAw70Manager", "processGetSamplePointFrameCount, return errorCode: ", Integer.valueOf(iD));
                e(300007);
                g(iD);
                return;
            }
            int iG = lxx.g(bArr);
            this.v = iG;
            ReleaseLogUtil.d("Step_HwFitnessManager", "aw70 7-10 count : ", Integer.valueOf(iG));
            if (this.v > 0) {
                LogUtil.a("05", 1, "HwFitnessAw70Manager", "processGetSamplePointFrameCount, get sample frame index: ", Integer.valueOf(this.j));
                lyv.d(this.j);
                this.j++;
                return;
            }
            t();
        } catch (cpy | eeu e2) {
            LogUtil.e("HwFitnessAw70Manager", "processGetSamplePointFrameCount Exception : ", ExceptionUtils.c(e2));
            lng.c(WatchFaceConstant.WATCH_FACE_SIGN_FAILED_ERROR_100007);
            g(-1);
        }
    }

    private void g(byte[] bArr) {
        LogUtil.a("05", 1, "HwFitnessAw70Manager", "processGetSamplePointFrame.");
        try {
            if (bArr[2] == 127) {
                int iD = mix.d(bArr);
                lng.c(iD);
                LogUtil.a("HwFitnessAw70Manager", "processGetSamplePointFrame, return errorCode: ", Integer.valueOf(iD));
                e(300007);
                g(iD);
                return;
            }
            this.aa.add(lxx.j(bArr));
            int i = this.j;
            if (i < this.v) {
                lyv.d(i);
                this.j++;
            } else {
                t();
            }
        } catch (cpy | eeu e2) {
            LogUtil.e("HwFitnessAw70Manager", "processGetSamplePointFrame Exception : ", ExceptionUtils.c(e2));
            lng.c(WatchFaceConstant.WATCH_FACE_SIGN_FAILED_ERROR_100007);
            g(-1);
        }
    }

    private void t() {
        LogUtil.a("HwFitnessAw70Manager", "syncStatusPoint.");
        long jA = lyo.a();
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        if (jCurrentTimeMillis - jA > k.b.l || jA == 0) {
            jA = a(jCurrentTimeMillis - k.b.l);
            lyo.d(jA);
        } else if (jA >= jCurrentTimeMillis && jA - jCurrentTimeMillis <= 300) {
            LogUtil.a("HwFitnessAw70Manager", "syncStatusPoint, lastStatusTime is not correct.");
            jA = jCurrentTimeMillis - 61;
        } else if (jA - jCurrentTimeMillis > 300) {
            LogUtil.a("HwFitnessAw70Manager", "syncStatusPoint, lastStatusTime is not correct and need write back.");
            jA = jCurrentTimeMillis - 61;
            lyo.d(jA);
        } else {
            LogUtil.j("HwFitnessAw70Manager", "syncStatusPoint, nothing to do.");
        }
        lyv.a(jA, jCurrentTimeMillis);
    }

    private void i(byte[] bArr) {
        LogUtil.a("HwFitnessAw70Manager", "processGetStatusFrameCount.");
        this.ab = 0;
        this.h = 0;
        try {
            if (bArr[2] == 127) {
                int iD = mix.d(bArr);
                lng.c(iD);
                LogUtil.a("HwFitnessAw70Manager", "processGetStatusFrameCount, return errorCode: ", Integer.valueOf(iD));
                e(300007);
                g(iD);
                return;
            }
            int iK = lxx.k(bArr);
            this.ab = iK;
            ReleaseLogUtil.d("Step_HwFitnessManager", "aw70 7-12 count : ", Integer.valueOf(iK));
            if (this.ab > 0) {
                lyv.a(this.h);
                this.h++;
            } else {
                d(0);
            }
        } catch (cpy | eeu e2) {
            LogUtil.e("HwFitnessAw70Manager", "processGetStatusFrameCount Exception : ", ExceptionUtils.c(e2));
            lng.c(WatchFaceConstant.WATCH_FACE_SIGN_FAILED_ERROR_100007);
            g(-1);
        }
    }

    private void j(byte[] bArr) {
        int i;
        LogUtil.a("HwFitnessAw70Manager", "processGetStatusFrame.");
        try {
            i = 0;
            if (bArr[2] == 127) {
                int iD = mix.d(bArr);
                lng.c(iD);
                LogUtil.a("HwFitnessAw70Manager", "processGetStatusFrame, return errorCode: ", Integer.valueOf(iD));
                e(300007);
                g(iD);
                return;
            }
            this.ac.add(lxx.i(bArr));
            int i2 = this.h;
            if (i2 < this.ab) {
                lyv.a(i2);
                this.h++;
            } else {
                d(i);
            }
        } catch (cpy | eeu e2) {
            LogUtil.e("HwFitnessAw70Manager", "processGetStatusFrame Exception : ", ExceptionUtils.c(e2));
            lng.c(WatchFaceConstant.WATCH_FACE_SIGN_FAILED_ERROR_100007);
            g(-1);
            i = 201000;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i) {
        LogUtil.a("05", 1, "HwFitnessAw70Manager", "doSyncTodayComplete, errorCode: ", Integer.valueOf(i));
        a(10008, i, (Object) null);
        r();
    }

    private void l(byte[] bArr) {
        int i;
        LogUtil.a("05", 1, "HwFitnessAw70Manager", "processGetTodayFitnessData.");
        a(4);
        int iD = 201000;
        try {
            i = 0;
            if (bArr[2] == 127) {
                iD = mix.d(bArr);
                lng.c(iD);
                LogUtil.a("HwFitnessAw70Manager", "processGetTodayFitnessData, return errorCode:", Integer.valueOf(iD));
                g(iD);
                i = iD;
            } else {
                this.l.a(this, lxx.d(bArr));
            }
        } catch (eeu e2) {
            LogUtil.e("HwFitnessAw70Manager", "processGetTodayFitnessData Exception : ", ExceptionUtils.c(e2));
            lng.c(WatchFaceConstant.WATCH_FACE_SIGN_FAILED_ERROR_100007);
            g(-1);
        }
        c(i);
    }

    private void b(int i, long j) {
        c cVar = this.p;
        if (cVar != null) {
            cVar.sendEmptyMessageDelayed(i, j);
        } else {
            LogUtil.j("HwFitnessAw70Manager", "fitnessMgrSendMsgDelay, mHwFitnessMgrHandler is null.");
        }
    }

    private void a(int i) {
        c cVar = this.p;
        if (cVar == null) {
            LogUtil.j("HwFitnessAw70Manager", "fitnessMgrRemoveMsg, mHwFitnessMgrHandler is null.");
        } else if (cVar.hasMessages(i)) {
            this.p.removeMessages(i);
        }
    }

    static class c extends Handler {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        WeakReference<lyn> f41148b;

        c(lyn lynVar, Looper looper) {
            super(looper);
            this.f41148b = new WeakReference<>(lynVar);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                return;
            }
            super.handleMessage(message);
            lyn lynVar = this.f41148b.get();
            if (lynVar == null) {
                LogUtil.a("HwFitnessAw70Manager", "HwFitnessMgrHandler, hwFitnessAw70Mgr is null.");
                return;
            }
            LogUtil.a("HwFitnessAw70Manager", "HwFitnessMgrHandler, handleMessage msg: ", Integer.valueOf(message.what));
            int i = message.what;
            if (i == 0) {
                LogUtil.a("HwFitnessAw70Manager", "HwFitnessMgrHandler, sync detail timeout.");
                lynVar.d(300001);
                lynVar.g(0);
                return;
            }
            if (i == 1) {
                LogUtil.a("HwFitnessAw70Manager", "HwFitnessMgrHandler, get frame count timeout.");
                return;
            }
            if (i == 2) {
                LogUtil.a("HwFitnessAw70Manager", "HwFitnessMgrHandler, get frame timeout.");
                return;
            }
            if (i == 3) {
                LogUtil.a("HwFitnessAw70Manager", "HwFitnessMgrHandler, Sync Complete msg.");
                lynVar.e(0);
            } else if (i == 4) {
                LogUtil.a("HwFitnessAw70Manager", "HwFitnessMgrHandler, Sync today timeout msg.");
                lynVar.c(300001);
                lynVar.g(4);
            } else if (i != 5) {
                LogUtil.j("HwFitnessAw70Manager", "HwFitnessMgrHandler, unknown msg type.");
            } else {
                LogUtil.a("HwFitnessAw70Manager", "HwFitnessMgrHandler, Save fitness data timeout msg.");
                lynVar.e(300001);
            }
        }
    }

    private void m() {
        LogUtil.a("05", 1, "HwFitnessAw70Manager", "processGetActivityReminder, do not process.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(IBaseResponseCallback iBaseResponseCallback) {
        synchronized (f41132c) {
            DeviceInfo deviceInfoC = mgi.c("HwFitnessAw70Manager");
            if (deviceInfoC != null && deviceInfoC.getDeviceConnectState() == 2) {
                b(4, 40000L);
                b(10008, iBaseResponseCallback);
                LogUtil.a("HwFitnessAw70Manager", "syncFitnessTodayDataRun, enter thread.");
                lyv.b();
                return;
            }
            LogUtil.j("HwFitnessAw70Manager", "syncFitnessTodayDataRun, get device info error.");
            if (iBaseResponseCallback != null) {
                iBaseResponseCallback.a(300004, null);
            }
        }
    }

    public void b(IBaseResponseCallback iBaseResponseCallback) {
        this.o.execute(new h(this, iBaseResponseCallback));
    }

    static class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        WeakReference<lyn> f41152a;
        IBaseResponseCallback d;

        h(lyn lynVar, IBaseResponseCallback iBaseResponseCallback) {
            this.f41152a = new WeakReference<>(lynVar);
            this.d = iBaseResponseCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            lyn lynVar = this.f41152a.get();
            if (lynVar != null) {
                lynVar.a(this.d);
            }
        }
    }

    private void n() {
        LogUtil.a("05", 1, "HwFitnessAw70Manager", "handleUserLogin.");
        this.l.c();
    }

    public void b() {
        LogUtil.a("05", 1, "HwFitnessAw70Manager", "registerDeviceToHiHealth.");
        if (this.r == null) {
            LogUtil.j("HwFitnessAw70Manager", "registerDeviceToHiHealth, mHWDeviceConfigManager is null.");
            return;
        }
        final DeviceInfo deviceInfoC = mgi.c("HwFitnessAw70Manager");
        if (deviceInfoC != null) {
            this.o.execute(new Runnable() { // from class: lyn.12
                @Override // java.lang.Runnable
                public void run() {
                    mga.h(deviceInfoC);
                }
            });
        } else {
            LogUtil.j("HwFitnessAw70Manager", "registerDeviceToHiHealth, deviceInfo is null.");
        }
    }

    private void j() {
        LogUtil.a("HwFitnessAw70Manager", "AW70 handleGetUserInfo enter");
        LoginInit.getInstance(this.i).getUserInfoFromDb(new IBaseResponseCallback() { // from class: lyp
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.d.d(i, obj);
            }
        });
    }

    /* synthetic */ void d(int i, Object obj) {
        if (i != 0 || !(obj instanceof UserInfomation)) {
            LogUtil.a("HwFitnessAw70Manager", "handleGetUserInfo userInfo is null");
        } else {
            LogUtil.a("HwFitnessAw70Manager", "AW70 handleGetUserInfo getUserInfo onResponse userInfomation");
            c((UserInfomation) obj, this.f);
        }
    }

    public void c(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.j("HwFitnessAw70Manager", "handleDeviceConnection, deviceInfo is null.");
            return;
        }
        int deviceConnectState = deviceInfo.getDeviceConnectState();
        LogUtil.a("HwFitnessAw70Manager", "handleDeviceConnection, device Connect state: ", Integer.valueOf(deviceConnectState));
        if (deviceConnectState == 2) {
            LogUtil.a("HwFitnessAw70Manager", "handleDeviceConnection.");
            mga.h(deviceInfo);
            mhs.a().getSwitchSetting("custom.activity_reminder", new IBaseResponseCallback() { // from class: lyn.3
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    Message messageObtainMessage = lyn.this.n.obtainMessage();
                    messageObtainMessage.obj = obj;
                    messageObtainMessage.what = 10001;
                    lyn.this.n.sendMessage(messageObtainMessage);
                }
            });
            j();
            c();
            return;
        }
        if (deviceConnectState == 3) {
            synchronized (h()) {
                f41131b.clear();
            }
            return;
        }
        LogUtil.j("HwFitnessAw70Manager", "handleDeviceConnection, nothing to do.");
    }

    private long a(long j) {
        String str = new SimpleDateFormat("yyyyMMdd", Locale.ENGLISH).format(new Date(j * 1000));
        try {
            return new SimpleDateFormat("yyyyMMddhhmm", Locale.ENGLISH).parse(str + AgdConstant.INSTALL_TYPE_DEFAULT).getTime() / 1000;
        } catch (ParseException e2) {
            LogUtil.e("HwFitnessAw70Manager", "getBeginOfDate Exception : ", ExceptionUtils.c(e2));
            return j;
        }
    }

    private void i() {
        this.q.clear();
        this.aa.clear();
        this.ac.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(IBaseResponseCallback iBaseResponseCallback, boolean z) {
        synchronized (f41132c) {
            LogUtil.a("05", 1, "HwFitnessAw70Manager", "syncFitnessDetailDataRun, thread isNeedSyncWork: ", Boolean.valueOf(z));
            DeviceInfo deviceInfoC = mgi.c("HwFitnessAw70Manager");
            if (deviceInfoC != null && deviceInfoC.getDeviceConnectState() == 2) {
                if (this.w) {
                    LogUtil.a("05", 1, "HwFitnessAw70Manager", "syncFitnessDetailData, data syncing.");
                    iBaseResponseCallback.a(300002, null);
                    return;
                }
                this.w = true;
                d(z, "syncFitnessDetailDataRun");
                c("true");
                b(0, 240000L);
                b(10009, iBaseResponseCallback);
                i();
                this.ad = f();
                long jCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                this.m = jCurrentTimeMillis;
                long j = this.ad;
                if (jCurrentTimeMillis - j > k.b.l || j == 0) {
                    long jA = a(jCurrentTimeMillis - k.b.l);
                    this.ad = jA;
                    b(jA);
                } else if (j >= jCurrentTimeMillis && j - jCurrentTimeMillis <= 300) {
                    LogUtil.a("05", 1, "HwFitnessAw70Manager", "syncFitnessDetailData, lastSync time is not correct.");
                    this.ad = this.m - 61;
                } else if (j - jCurrentTimeMillis > 300) {
                    LogUtil.a("05", 1, "HwFitnessAw70Manager", "syncFitnessDetailData, lastSync time is not correct and need write back.");
                    long j2 = this.m - 61;
                    this.ad = j2;
                    b(j2);
                } else {
                    LogUtil.j("05", 1, "HwFitnessAw70Manager", "syncFitnessDetailDataRun, nothing to do.");
                }
                lyv.d(this.ad, this.m);
                return;
            }
            LogUtil.j("05", 1, "HwFitnessAw70Manager", "syncFitnessDetailDataRun, get device info error.");
            iBaseResponseCallback.a(300004, null);
        }
    }

    public void e(final IBaseResponseCallback iBaseResponseCallback, final boolean z) {
        Log.i("HwFitnessAw70Manager", "syncFitnessDetailData.");
        this.z = System.currentTimeMillis();
        this.y = z;
        b(new IBaseResponseCallback() { // from class: lyn.1
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("05", 1, "HwFitnessAw70Manager", "syncFitnessDetailData, today total finish need detail errorCode: ", Integer.valueOf(i));
                lyn lynVar = lyn.this;
                if (lynVar.b(lynVar.z, lyn.this.f(), z)) {
                    lyn.this.w = false;
                } else {
                    lyn.this.o.execute(new e(lyn.this, iBaseResponseCallback, true));
                }
            }
        });
    }

    public boolean b(long j, long j2, boolean z) {
        long j3 = j2 * 1000;
        LogUtil.a("HwFitnessAw70Manager", "syncFitnessDetailData startTime:", Long.valueOf(j), " getLastSyncTime:", Long.valueOf(j3), " isManual:", Boolean.valueOf(z));
        return z && j > j3 && j - j3 < 60000;
    }

    static class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        WeakReference<lyn> f41150a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        IBaseResponseCallback f41151c;
        boolean d;

        e(lyn lynVar, IBaseResponseCallback iBaseResponseCallback, boolean z) {
            LogUtil.a("05", 1, "HwFitnessAw70Manager", " SyncFitnessDetailDataRunnable: ", Boolean.valueOf(z));
            this.f41150a = new WeakReference<>(lynVar);
            this.f41151c = iBaseResponseCallback;
            this.d = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            lyn lynVar = this.f41150a.get();
            if (lynVar != null) {
                lynVar.a(this.f41151c, this.d);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long f() {
        LogUtil.a("05", 1, "HwFitnessAw70Manager", "getLastSyncTime.");
        return new lyt().b();
    }

    public void b(long j) {
        LogUtil.a("05", 1, "HwFitnessAw70Manager", "setLastSyncTime time: ", Long.valueOf(j));
        lyt lytVar = new lyt();
        lyl lylVar = new lyl();
        lylVar.b(j);
        lytVar.c(lylVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final UserInfomation userInfomation) {
        LogUtil.a("HwFitnessAw70Manager", "setDeviceUserInfo.");
        ((HealthDataMgrApi) Services.d("HWHealthDataMgr", HealthDataMgrApi.class)).getLastVo2maxForMaxMet(new IBaseResponseCallback() { // from class: lyn.4
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (!(obj instanceof String)) {
                    lyv.c(userInfomation);
                    LogUtil.j("HwFitnessAw70Manager", "getLastVo2maxForMaxMet is null.");
                    return;
                }
                String str = (String) obj;
                if (!str.contains(Constants.LINK)) {
                    lyv.c(userInfomation);
                    LogUtil.a("HwFitnessAw70Manager", "getLastVo2maxForMaxMet not contains split symbol.");
                    return;
                }
                String[] strArrSplit = str.split(Constants.LINK);
                if (strArrSplit.length >= 2) {
                    try {
                        userInfomation.setMaxVo2(Integer.parseInt(strArrSplit[1]));
                        userInfomation.setVo2Time(Long.parseLong(strArrSplit[0]) / 1000);
                    } catch (NumberFormatException e2) {
                        LogUtil.e("HwFitnessAw70Manager", "setDeviceUserInfo Exception : ", ExceptionUtils.c(e2));
                    }
                }
                lyv.c(userInfomation);
            }
        });
    }

    public void c(UserInfomation userInfomation, IBaseResponseCallback iBaseResponseCallback) {
        DeviceInfo deviceInfoC = mgi.c("HwFitnessAw70Manager");
        if (deviceInfoC == null) {
            LogUtil.j("05", 1, "HwFitnessAw70Manager", "getUserInfo, current device is null.");
            return;
        }
        DeviceCapability deviceCapabilityA = eej.a(deviceInfoC.getDeviceIdentify());
        if (deviceCapabilityA == null) {
            LogUtil.j("05", 1, "HwFitnessAw70Manager", "getUserInfo, deviceCapability is null.");
            return;
        }
        if (deviceCapabilityA.isSupportGetUserInfo()) {
            LogUtil.a("05", 1, "HwFitnessAw70Manager", "getUserInfo, support get user info.");
            b(21, iBaseResponseCallback);
            lyv.d();
        } else {
            LogUtil.a("05", 1, "HwFitnessAw70Manager", "getUserInfo, not support get user info.");
            a(userInfomation);
        }
    }

    private void h(byte[] bArr) {
        int i;
        LogUtil.a("05", 1, "HwFitnessAw70Manager", "processGetUserInfoData Complete command: ", 21);
        int iD = 201000;
        FitnessUserInfo fitnessUserInfoO = null;
        try {
            i = 0;
            if (bArr[2] == 127) {
                iD = mix.d(bArr);
                LogUtil.j("HwFitnessAw70Manager", "processSetCmdResult return errorCode: ", Integer.valueOf(iD));
                i = iD;
            } else {
                try {
                    fitnessUserInfoO = lxx.o(bArr);
                } catch (eeu e2) {
                    e = e2;
                    iD = 0;
                    LogUtil.e("HwFitnessAw70Manager", "processGetUserInfoData Exception : ", ExceptionUtils.c(e));
                    i = iD;
                }
            }
        } catch (eeu e3) {
            e = e3;
        }
        a(21, i, fitnessUserInfoO);
    }

    public static String d() {
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        return accountInfo == null ? "" : accountInfo;
    }

    private void c(String str) {
        SharedPreferenceManager.e(this.i, String.valueOf(10008), "KEY_SYNCHRONIZING_DATA_FLAG", str, null);
    }

    private void q() {
        LogUtil.a("HwFitnessAw70Manager", "sendDialogDismissBroadcast.");
        Intent intent = new Intent("com.huawei.bone.action.ACTION_DIALOG_DISMISS");
        intent.setPackage(BaseApplication.getContext().getPackageName());
        this.i.sendBroadcast(intent, LocalBroadcast.f36595c);
    }

    class d extends Handler {
        d(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                LogUtil.j("HwFitnessAw70Manager", "MyHandle, message is null.");
                return;
            }
            super.handleMessage(message);
            int i = message.what;
            if (i == 1) {
                LogUtil.a("HwFitnessAw70Manager", " handleMessage, FitnessCommandId.COMMAND_FITNESS_SET_MOTION_GOAL.");
            } else {
                if (i != 10001) {
                    LogUtil.j("HwFitnessAw70Manager", "MyHandle, nothing to do.");
                    return;
                }
                LogUtil.a("HwFitnessAw70Manager", " handleMessage, FitnessCommandId.GET_FITNESS_GET_ACTIVITY_REMINDER.");
                lyn.this.a(message);
                lyn.this.p();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Message message) {
        JsonSyntaxException e2;
        if (mgi.d("HwFitnessAw70Manager") != null) {
            ActivityReminder activityReminder = new ActivityReminder();
            if (message.obj != null && (message.obj instanceof String)) {
                try {
                    String strReplaceAll = (String) message.obj;
                    if (strReplaceAll.contains(k.g)) {
                        LogUtil.a("HwFitnessAw70Manager", "processActivityRemind data contains enable");
                        strReplaceAll = strReplaceAll.replaceAll(k.g, "isEnable");
                    }
                    ActivityReminder activityReminder2 = (ActivityReminder) new Gson().fromJson(strReplaceAll, ActivityReminder.class);
                    try {
                        if (activityReminder2.getEndTime() == 5120) {
                            LogUtil.a("HwFitnessAw70Manager", "processActivityRemind set new end time");
                            activityReminder2.setEndTime(5376);
                        }
                        activityReminder = activityReminder2;
                    } catch (JsonSyntaxException e3) {
                        e2 = e3;
                        activityReminder = activityReminder2;
                        LogUtil.e("HwFitnessAw70Manager", "processActivityRemind Exception : ", ExceptionUtils.c(e2));
                    }
                } catch (JsonSyntaxException e4) {
                    e2 = e4;
                }
            }
            LogUtil.a("03", 1, "HwFitnessAw70Manager", "processActivityRemind Aw70 reminder = ", activityReminder);
            mhs.a().sendSetSwitchSettingCmd(lxp.c(activityReminder), lyv.a(), 7, 7);
            return;
        }
        LogUtil.j("HwFitnessAw70Manager", "sendSetSwitchSettingCmd HwGetAw70DeviceInfoUtil.getConnectDeviceInfo is null");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        LogUtil.a("05", 1, "HwFitnessAw70Manager", "setDefaultDeviceReportThreshold.");
        DeviceInfo deviceInfoC = mgi.c("HwFitnessAw70Manager");
        if (deviceInfoC == null) {
            LogUtil.j("HwFitnessAw70Manager", "setDefaultDeviceReportThreshold, deviceInfo is null.");
            return;
        }
        DeviceCapability deviceCapabilityA = eej.a(deviceInfoC.getDeviceIdentify());
        if (deviceCapabilityA == null) {
            LogUtil.j("HwFitnessAw70Manager", "setDefaultDeviceReportThreshold, deviceCapability is null.");
        } else if (!deviceCapabilityA.isSupportThreshold()) {
            LogUtil.j("HwFitnessAw70Manager", "setDefaultDeviceReportThreshold, is not support.");
        } else {
            lyv.b(lyg.e(1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(int i) {
        LogUtil.a("HwFitnessAw70Manager", "sendAw70FitnessSyncEvent, result: ", Integer.valueOf(i));
        mie.d(i, this.y, this.z, mgi.c("HwFitnessAw70Manager"));
    }

    private void k() {
        LogUtil.a("HwFitnessAw70Manager", "notifyToSyncWorkoutData.");
        this.r.a(this.g);
    }

    private boolean o() {
        return this.x;
    }

    private void d(boolean z, String str) {
        this.x = z;
        LogUtil.a("HwFitnessAw70Manager", "setNeedWorkout, mIsNeedWorkout: ", Boolean.valueOf(z), ", from: ", str);
    }
}

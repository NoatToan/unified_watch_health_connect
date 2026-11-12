package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.huawei.haf.application.BroadcastManager;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hms.network.embedded.k;
import com.huawei.hwbasemgr.HwBaseManager;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.ThermalCallback;
import com.huawei.hwdevice.phoneprocess.binder.ParserInterface;
import com.huawei.hwdevice.phoneprocess.mgr.hwdevicestatusmgr.HwDeviceStatusNotificationUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.utils.Utils;
import com.huawei.watchface.api.HwWatchFaceApi;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class mpg extends HwBaseManager implements ParserInterface {
    private static String ai = "";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Map<Integer, List<IBaseResponseCallback>> f42116a;
    protected int ab;
    protected long ac;
    protected mpd ad;
    private Handler ae;
    private BroadcastReceiver af;
    private HandlerThread ag;
    private Context ah;
    private boolean aj;
    private long ak;
    private List<mqe> al;
    private boolean am;
    private long an;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected mpb f42117b;
    protected int d;
    protected List<mqi> f;
    protected int g;
    protected int h;
    protected int i;
    protected long j;
    protected int k;
    protected int l;
    protected mpz.d m;
    public mpe n;
    protected mpq o;
    protected Map<String, Boolean> p;
    protected boolean q;
    protected int r;
    protected boolean s;
    protected boolean t;
    protected List<mqh> u;
    protected int v;
    protected List<Integer> w;
    protected long x;
    protected mqc y;
    protected List<mqm> z;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected static final Object f42115c = new Object();
    protected static final Object e = new Object();
    private static final Object aa = new Object();

    public mpg() {
        super(BaseApplication.getContext());
        this.f = new ArrayList(16);
        this.u = new ArrayList(16);
        this.z = new ArrayList(16);
        this.p = new HashMap(16);
        this.f42116a = new HashMap(16);
        this.g = 0;
        this.d = 0;
        this.l = 0;
        this.k = 0;
        this.v = 0;
        this.i = 0;
        this.ab = 0;
        this.h = 0;
        this.t = false;
        this.s = false;
        this.q = true;
        this.r = 1;
        this.x = 0L;
        this.ac = 0L;
        this.j = 0L;
        this.al = new ArrayList(16);
        this.ag = null;
        this.ae = null;
        this.aj = false;
        this.af = new BroadcastReceiver() { // from class: mpg.5
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                if (intent == null) {
                    LogUtil.j("HwBasicSyncManager", "mForegroundStatusChangeReceiver: intent is null");
                } else if (HwWatchFaceApi.ACTION_FOREGROUND_STATUS.equals(intent.getAction())) {
                    mpg.this.c(intent);
                }
            }
        };
        this.ah = BaseApplication.getContext();
        this.n = new mpe(this);
        this.f42117b = mpb.b();
        this.o = mpq.c();
        this.ad = new mpd();
        this.m = new mpz.d(this, BaseApplication.getContext().getMainLooper());
        BroadcastManager.d(this.af);
        HandlerThread handlerThread = new HandlerThread("HwBasicSyncManager");
        this.ag = handlerThread;
        handlerThread.start();
        this.ae = new b(this.ag.getLooper());
        mit.b("HwBasicSyncManager", new Runnable() { // from class: mpg.1
            @Override // java.lang.Runnable
            public void run() {
                mpg.this.f42117b.b(mpg.d());
                DeviceInfo deviceInfoE = mpz.e("HwBasicSyncManager");
                if (deviceInfoE != null && mpt.b(deviceInfoE.getDeviceIdentify()) != 0) {
                    LogUtil.a("HwBasicSyncManager", "deviceInfo auto Sync");
                    mpg.this.d(deviceInfoE);
                }
                DeviceInfo deviceInfoB = mpz.b("HwBasicSyncManager");
                if (deviceInfoB == null || mpt.b(deviceInfoB.getDeviceIdentify()) == 0) {
                    return;
                }
                LogUtil.a("HwBasicSyncManager", "deviceAw70Info auto Sync");
                mpg.this.d(deviceInfoB);
            }
        });
    }

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public Integer getModuleId() {
        return 7;
    }

    public static String b() {
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        ai = accountInfo;
        if (accountInfo == null) {
            ai = "";
        }
        return ai;
    }

    public static mpg d() {
        return d.d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.j("HwBasicSyncManager", "automaticSynchronizeFitnessDetailData deviceInfo is null");
        } else {
            e(deviceInfo);
        }
    }

    public void b(DeviceInfo deviceInfo) {
        if (eel.d(deviceInfo.getProductType())) {
            mpq mpqVar = this.o;
            if (mpqVar != null) {
                mpqVar.c(deviceInfo);
            }
        } else {
            if (!c(deviceInfo)) {
                return;
            }
            if (!mpu.d(deviceInfo.getDeviceIdentify())) {
                LogUtil.j("HwBasicSyncManager", "removeMessages");
                this.m.sendMessageDelayed(g(deviceInfo), 600000L);
                return;
            }
            mpu.e(deviceInfo.getDeviceIdentify());
        }
        a(false, deviceInfo, (IBaseResponseCallback) null);
    }

    private Message g(DeviceInfo deviceInfo) {
        Message messageObtain = Message.obtain();
        messageObtain.obj = deviceInfo;
        messageObtain.what = 1003;
        this.m.removeMessages(messageObtain.what);
        return messageObtain;
    }

    private void e(DeviceInfo deviceInfo) {
        if (!eel.d(deviceInfo.getProductType())) {
            if (!c(deviceInfo)) {
                deviceInfo = null;
            }
        } else {
            mpq mpqVar = this.o;
            if (mpqVar != null) {
                mpqVar.c(deviceInfo);
            }
        }
        a(false, deviceInfo, (IBaseResponseCallback) null);
    }

    private boolean c(DeviceInfo deviceInfo) {
        int deviceConnectState = deviceInfo.getDeviceConnectState();
        LogUtil.a("HwBasicSyncManager", "handleDeviceConnection connectState :", Integer.valueOf(deviceConnectState));
        if (deviceConnectState == 2) {
            mpz.c(deviceInfo);
            return true;
        }
        if (deviceConnectState == 3) {
            return false;
        }
        synchronized (f42115c) {
            this.f42116a.clear();
        }
        this.p.remove(deviceInfo.getDeviceIdentify());
        this.s = false;
        c(300004, deviceInfo);
        if (!this.t) {
            LogUtil.a("HwBasicSyncManager", "Data sync bluetooth disconnect.");
            b(300004, deviceInfo);
            mpz.g("com.huawei.health.fitness_detail_sync_fail");
        }
        LogUtil.j("HwBasicSyncManager", "handleDeviceConnection connectState is error.");
        return false;
    }

    @Override // com.huawei.hwdevice.phoneprocess.binder.ParserInterface
    public void getResult(DeviceInfo deviceInfo, byte[] bArr) {
        if (bArr == null || bArr.length < 2) {
            LogUtil.j("HwBasicSyncManager", "processResult data is null.");
        } else {
            this.n.a(bArr, deviceInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Intent intent) {
        boolean booleanExtra = intent.getBooleanExtra("isForeground", false);
        boolean zA = mpz.a();
        LogUtil.a("HwBasicSyncManager", "mForegroundStatusChangeReceiver() sIsForeground: ", Boolean.valueOf(booleanExtra), ",isSyncData:", Boolean.valueOf(zA));
        if (this.ae == null) {
            HandlerThread handlerThread = new HandlerThread("HwBasicSyncManager");
            handlerThread.start();
            this.ae = new b(handlerThread.getLooper());
        }
        if (booleanExtra && zA) {
            ThermalCallback.getInstance();
            this.ae.postDelayed(new Runnable() { // from class: mpg.4
                @Override // java.lang.Runnable
                public void run() {
                    mpg.this.a(true, (DeviceInfo) null, (IBaseResponseCallback) null);
                }
            }, 1000L);
        }
    }

    public void d(final IBaseResponseCallback iBaseResponseCallback, final DeviceInfo deviceInfo) {
        LogUtil.j("HwBasicSyncManager", "syncFitnessTodayData enter.");
        if (!myo.e(deviceInfo)) {
            iBaseResponseCallback.a(-1, "");
            return;
        }
        mit.b("HwBasicSyncManager", new Runnable() { // from class: mpg.7
            @Override // java.lang.Runnable
            public void run() {
                synchronized (mpg.e) {
                    mpg.this.d(deviceInfo, iBaseResponseCallback);
                }
            }
        });
        mpq mpqVar = this.o;
        if (mpqVar != null) {
            mpqVar.e(new IBaseResponseCallback() { // from class: mpg.8
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    LogUtil.a("HwBasicSyncManager", "mAw70BaseResponseCallback errorCode :", Integer.valueOf(i), ", objectData :", obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(DeviceInfo deviceInfo, IBaseResponseCallback iBaseResponseCallback) {
        if (deviceInfo == null || deviceInfo.getDeviceConnectState() != 2) {
            ReleaseLogUtil.e("R_HwBasicSyncManager", "syncFitnessTodayDataRun get device info error.");
            iBaseResponseCallback.a(300004, null);
            return;
        }
        if (b(deviceInfo.getDeviceIdentify())) {
            ReleaseLogUtil.d("R_HwBasicSyncManager", "syncFitnessTodayDataRun data syncing.");
            iBaseResponseCallback.a(0, null);
            return;
        }
        this.n.a(4, 40000L, deviceInfo);
        this.p.put(deviceInfo.getDeviceIdentify(), true);
        c(10008, iBaseResponseCallback);
        ReleaseLogUtil.d("R_HwBasicSyncManager", "syncFitnessTodayData enter thread.");
        mpr.a(deviceInfo);
        mpz.b("_" + deviceInfo.getDeviceIdentify(), System.currentTimeMillis());
    }

    public void a(boolean z, DeviceInfo deviceInfo, IBaseResponseCallback iBaseResponseCallback) {
        boolean zD;
        LogUtil.a("HwBasicSyncManager", "syncFitnessDetailData is enter,is manualSync:", Boolean.valueOf(z));
        mzj.b().e(z);
        if (!ThermalCallback.getInstance().isTriggerTask()) {
            ReleaseLogUtil.e("R_HwBasicSyncManager", "syncFitnessDetailData does not have the conditions to trigger the task.");
            mpz.a(true);
            a(300008, iBaseResponseCallback);
            return;
        }
        mpz.a(false);
        if (z) {
            zD = b(true, false, iBaseResponseCallback);
        } else {
            zD = d(deviceInfo, false, iBaseResponseCallback);
        }
        if (!zD) {
            mpz.g("com.huawei.health.fitness_detail_sync_success");
        }
        if (zD) {
            HwDeviceStatusNotificationUtil.d();
        }
    }

    private boolean b(boolean z, boolean z2, IBaseResponseCallback iBaseResponseCallback) {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_DEVICES, null, "HwBasicSyncManager");
        if (deviceList != null && !deviceList.isEmpty()) {
            for (int i = 0; i < deviceList.size(); i++) {
                DeviceInfo deviceInfo = deviceList.get(i);
                if (deviceInfo == null) {
                    LogUtil.j("HwBasicSyncManager", "currentInfo is null");
                } else {
                    boolean zD = d(deviceInfo, z, iBaseResponseCallback);
                    if (!z2) {
                        z2 = zD;
                    }
                }
            }
        }
        return z2;
    }

    private boolean d(DeviceInfo deviceInfo, boolean z, IBaseResponseCallback iBaseResponseCallback) {
        if (deviceInfo == null) {
            LogUtil.j("HwBasicSyncManager", "syncDeviceFitnessData deviceInfo is null");
            a(300008, iBaseResponseCallback);
            return false;
        }
        ReleaseLogUtil.d("R_HwBasicSyncManager", "syncDeviceFitnessData isManualSync:", Boolean.valueOf(z));
        String deviceIdentify = deviceInfo.getDeviceIdentify();
        Map<String, DeviceCapability> mapQueryDeviceCapability = mkf.e(BaseApplication.getContext()).queryDeviceCapability(1, deviceIdentify, "HwBasicSyncManager");
        if (mapQueryDeviceCapability == null || mapQueryDeviceCapability.isEmpty()) {
            LogUtil.j("HwBasicSyncManager", "syncDeviceFitnessData deviceCapabilityHashMaps is null or empty");
            a(300008, iBaseResponseCallback);
            return false;
        }
        DeviceCapability deviceCapability = mapQueryDeviceCapability.get(deviceIdentify);
        if (deviceCapability == null || !deviceCapability.isSupportSportTotal()) {
            LogUtil.j("HwBasicSyncManager", "syncDeviceFitnessData deviceCapability error");
            xjt.x("syncDeviceFitnessData deviceCapability error");
            a(300008, iBaseResponseCallback);
            a(-1, deviceInfo);
            a(deviceInfo);
            c(0, deviceInfo);
            return false;
        }
        Boolean bool = this.p.get(deviceIdentify);
        if (bool != null && bool.booleanValue()) {
            ReleaseLogUtil.d("R_HwBasicSyncManager", "syncDeviceFitnessData data syncing");
            if (iBaseResponseCallback != null) {
                this.aj = true;
            }
            a(300008, iBaseResponseCallback);
            return false;
        }
        if (eel.d(deviceInfo.getProductType()) && this.o.b()) {
            ReleaseLogUtil.d("R_HwBasicSyncManager", "syncDeviceFitnessData aw70 data syncing.");
            a(300008, iBaseResponseCallback);
            this.aj = false;
            return false;
        }
        a(deviceInfo, z, iBaseResponseCallback);
        return true;
    }

    private void a(final DeviceInfo deviceInfo, boolean z, final IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("HwBasicSyncManager", "syncTodayCountData isManualSyn: ", Boolean.valueOf(z));
        if (iBaseResponseCallback != null) {
            this.q = false;
        } else {
            this.q = true;
        }
        final Message messageObtain = Message.obtain();
        messageObtain.what = 0;
        d(new IBaseResponseCallback() { // from class: mpg.10
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                ReleaseLogUtil.d("R_HwBasicSyncManager", "syncFitnessDetailData errorCode:", Integer.valueOf(i), ", mIsSyncCloud:", Boolean.valueOf(mpg.this.aj));
                if (mpg.this.m != null) {
                    LogUtil.a("HwBasicSyncManager", "mHwBasicHandler is not null:");
                    if (mpg.this.m.hasMessages(messageObtain.what)) {
                        LogUtil.a("HwBasicSyncManager", "mHwBasicHandler removeMessages:", Integer.valueOf(messageObtain.what));
                        mpg.this.m.removeMessages(messageObtain.what);
                    }
                }
                if (i != 0) {
                    mpg.this.aj = false;
                    mpg.this.a(300008, iBaseResponseCallback);
                    mpg.this.a(300001, deviceInfo);
                    mpg.this.c(0, deviceInfo);
                    mpz.g("com.huawei.health.fitness_detail_sync_fail");
                } else {
                    mpg.this.a(0, iBaseResponseCallback);
                    if (mpg.this.aj) {
                        Utils.syncCloudAfterInsert();
                        mpg.this.aj = false;
                    }
                }
                ReleaseLogUtil.d("R_HwBasicSyncManager", "syncFitnessDetailData end mIsSyncCloud:", Boolean.valueOf(mpg.this.aj));
            }
        }, z, deviceInfo);
        this.m.sendMessageDelayed(messageObtain, 30000L);
    }

    public void d(final IBaseResponseCallback iBaseResponseCallback, boolean z, final DeviceInfo deviceInfo) {
        if (deviceInfo != null) {
            LogUtil.a("HwBasicSyncManager", "syncFitnessDetailData updateSyncStatus");
            mpt.d(deviceInfo.getDeviceIdentify(), 0);
        }
        if (mpz.b(deviceInfo)) {
            if (!myo.e(deviceInfo)) {
                ReleaseLogUtil.e("R_HwBasicSyncManager", "deviceInfo checkHiHealthType fail.");
                xjt.x("deviceInfo checkHiHealthType fail");
                iBaseResponseCallback.a(-1, null);
                return;
            }
            this.am = z;
            ReleaseLogUtil.d("R_HwBasicSyncManager", "begin sync data.");
            LogUtil.a("HwBasicSyncManager", "start syncFitnessDetailData.");
            d(System.currentTimeMillis());
            this.an = System.currentTimeMillis();
            if (this.o == null) {
                this.o = mpq.c();
            }
            if (eel.d(deviceInfo.getProductType())) {
                LogUtil.j("HwBasicSyncManager", "mHwFitnessAw70Manager syncFitnessDetailData");
                this.o.d(iBaseResponseCallback, z);
            } else {
                d(new IBaseResponseCallback() { // from class: mpg.6
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public void a(int i, Object obj) {
                        mpg.this.c(i, deviceInfo, iBaseResponseCallback);
                    }
                }, deviceInfo);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i, DeviceInfo deviceInfo, IBaseResponseCallback iBaseResponseCallback) {
        ReleaseLogUtil.d("R_HwBasicSyncManager", " today total finish need detail errorCode :", Integer.valueOf(i));
        if (this.o.a(this.an, mpz.a(d()), this.am)) {
            if (b(deviceInfo.getDeviceIdentify())) {
                this.p.remove(deviceInfo.getDeviceIdentify());
            }
            LogUtil.j("HwBasicSyncManager", "syncTodayDataResult not SyncFitnessDetailData.");
            iBaseResponseCallback.a(-1, "");
            return;
        }
        if (i != 0) {
            LogUtil.j("HwBasicSyncManager", "syncTodayDataResult error");
            iBaseResponseCallback.a(-1, null);
        } else {
            c(iBaseResponseCallback, deviceInfo);
        }
    }

    private void c(final IBaseResponseCallback iBaseResponseCallback, final DeviceInfo deviceInfo) {
        mit.b("HwBasicSyncManager", new Runnable() { // from class: mpg.9
            @Override // java.lang.Runnable
            public void run() {
                mpg.this.n.e(iBaseResponseCallback, true, deviceInfo);
            }
        });
    }

    protected void a(int i, DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.j("HwBasicSyncManager", "notifyDetailSyncComplete deviceInfo is null");
            return;
        }
        if (i == 300001) {
            this.p.remove(deviceInfo.getDeviceIdentify());
        }
        LogUtil.a("HwBasicSyncManager", "notifyDetailSyncComplete errorCode :", Integer.valueOf(i), ", currentStage :", Integer.valueOf(this.ad.b()));
        if (this.ad.b() == 2) {
            e(0);
            if (i == 0) {
                j(2, deviceInfo);
            } else {
                this.p.remove(deviceInfo.getDeviceIdentify());
                a(10009, i);
            }
        }
        if (this.ad.b() == 1) {
            if (i == 0) {
                j(1, deviceInfo);
                c(100000, deviceInfo);
            } else {
                a(deviceInfo);
            }
        }
    }

    private void a(DeviceInfo deviceInfo) {
        if (CommonUtil.ap()) {
            xjt.d("fitnessDataSync Complete,Sync duration: " + (System.currentTimeMillis() - this.an));
        }
        ReleaseLogUtil.d("R_HwBasicSyncManager", "afterFitnessDataSync enter.");
        myv.b().d(deviceInfo);
        myt.e().b(deviceInfo);
        LogUtil.a("HwBasicSyncManager", "afterFitnessDataSync mIsSyncWorkout: ", Boolean.valueOf(this.q));
        if (this.q && CommonUtil.bu()) {
            mpj.e();
        }
    }

    private void j(final int i, final DeviceInfo deviceInfo) {
        LogUtil.a("HwBasicSyncManager", "saveFitnessDate.");
        boolean zCheckHiHealthServiceExist = HiHealthManager.d(this.ah).checkHiHealthServiceExist();
        LogUtil.a("HwBasicSyncManager", "saveFitnessDate isExistHiHealthService :", Boolean.valueOf(zCheckHiHealthServiceExist));
        if (zCheckHiHealthServiceExist) {
            this.n.a(5, 120000L, deviceInfo);
            this.t = true;
            mpz.c(deviceInfo);
            final ArrayList arrayList = new ArrayList(16);
            final ArrayList arrayList2 = new ArrayList(16);
            arrayList.addAll(this.u);
            arrayList2.addAll(this.z);
            this.u.clear();
            this.z.clear();
            final ArrayList arrayList3 = new ArrayList(16);
            arrayList3.addAll(this.al);
            this.al.clear();
            final int iD = mpz.d(deviceInfo);
            mit.b("HwBasicSyncManager", new Runnable() { // from class: mpg.11
                @Override // java.lang.Runnable
                public void run() {
                    if (iD == 3) {
                        mpg.this.f42117b.e(mpg.d(), arrayList, arrayList2, i, deviceInfo);
                    } else {
                        mpg.this.f42117b.c(mpg.d(), arrayList3, i, deviceInfo);
                    }
                }
            });
            return;
        }
        b(300001, deviceInfo);
    }

    public void d(int i, DeviceInfo deviceInfo) {
        LogUtil.a("HwBasicSyncManager", "doDetailSyncComplete errorCode :", Integer.valueOf(i));
        b(i, deviceInfo);
    }

    public void b(final int i, final DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.j("HwBasicSyncManager", "processDetailSyncComplete deviceInfo is null");
        } else {
            LogUtil.a("HwBasicSyncManager", "processDetailSyncComplete errorCode :", Integer.valueOf(i));
            mit.b("HwBasicSyncManager", new Runnable() { // from class: mpg.3
                @Override // java.lang.Runnable
                public void run() {
                    mpg.this.i(i, deviceInfo);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(int i, DeviceInfo deviceInfo) {
        LogUtil.a("HwBasicSyncManager", "syncCompleteRun errorCode :", Integer.valueOf(i));
        DeviceCapability deviceCapabilityC = mpz.c(deviceInfo.getDeviceIdentify());
        synchronized (aa) {
            a(10009, i);
            if (this.ad.b() == 1) {
                e(5);
                if (deviceCapabilityC == null || !deviceCapabilityC.isSupportGetHighAndMiddleSport()) {
                    LogUtil.j("HwBasicSyncManager", "syncCompleteRun not support highAndMiddleSport.");
                    f(deviceInfo);
                } else {
                    this.n.b(1, deviceInfo);
                }
                mpz.g("com.huawei.health.fitness_detail_sync_success");
                ReleaseLogUtil.d("R_HwBasicSyncManager", "startSyncAlarm");
                a(deviceInfo);
            } else {
                if (deviceCapabilityC == null || !deviceCapabilityC.isSupportGetHighAndMiddleSport()) {
                    LogUtil.j("HwBasicSyncManager", "syncCompleteRun not support high and middle sport.");
                } else {
                    LogUtil.a("HwBasicSyncManager", "syncCompleteRun syncSecondStageFitnessDetail");
                    this.n.b(7, deviceInfo);
                }
                e(5);
                this.p.remove(deviceInfo.getDeviceIdentify());
                this.t = false;
            }
        }
    }

    private void f(DeviceInfo deviceInfo) {
        synchronized (e) {
            this.ad.c(2);
            if (mpz.d(deviceInfo) != 3 && deviceInfo != null) {
                LogUtil.a("HwBasicSyncManager", "syncSecondStageFitnessDetail not separated data.");
                this.p.remove(deviceInfo.getDeviceIdentify());
                return;
            }
            long jA = this.ad.a(d());
            long jCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            LogUtil.a("HwBasicSyncManager", "lastSecondStageTime:", Long.valueOf(jA), ",endSecondStageTime:", Long.valueOf(jCurrentTimeMillis));
            if (jA >= mpz.c(jCurrentTimeMillis)) {
                LogUtil.a("HwBasicSyncManager", "syncSecondStageFitnessDetail sync sample second stage already ok.");
                this.n.b(deviceInfo);
            } else {
                if (jCurrentTimeMillis - jA > k.b.l) {
                    jA = mpz.c(jCurrentTimeMillis - k.b.l);
                }
                this.x = jCurrentTimeMillis;
                mpr.c(jA, jCurrentTimeMillis);
            }
        }
    }

    protected void b(mqc mqcVar, DeviceInfo deviceInfo) {
        LogUtil.a("HwBasicSyncManager", "getRealtimeDataByFrame Enter.");
        this.w = mqcVar.c();
        int iE = mqcVar.e();
        this.l = iE;
        this.k = 0;
        List<Integer> list = this.w;
        if (list != null && iE > 0) {
            LogUtil.a("HwBasicSyncManager", "getRealtimeDataByFrame get frame index :", list.get(0));
            mpz.a(this.w.get(this.k).intValue(), deviceInfo);
        } else {
            a(0, deviceInfo);
        }
    }

    private void e(int i) {
        mpz.d dVar = this.m;
        if (dVar == null || !dVar.hasMessages(i)) {
            return;
        }
        this.m.removeMessages(i);
    }

    public void e(int i, DeviceInfo deviceInfo) {
        LogUtil.a("HwBasicSyncManager", "processIntensiveSyncComplete errorCode: ", Integer.valueOf(i), ", intensiveFlag: ", Integer.valueOf(this.r));
        this.s = false;
        if (this.r == 1) {
            f(deviceInfo);
        }
    }

    protected void c(int i, IBaseResponseCallback iBaseResponseCallback) {
        synchronized (f42115c) {
            if (iBaseResponseCallback != null) {
                d(i, iBaseResponseCallback);
            }
        }
    }

    private void d(int i, IBaseResponseCallback iBaseResponseCallback) {
        List<IBaseResponseCallback> arrayList = this.f42116a.get(Integer.valueOf(i));
        if (arrayList == null) {
            arrayList = new ArrayList<>(16);
            this.f42116a.put(Integer.valueOf(i), arrayList);
        } else {
            for (IBaseResponseCallback iBaseResponseCallback2 : arrayList) {
                if (iBaseResponseCallback2 != null && iBaseResponseCallback2.equals(iBaseResponseCallback)) {
                    return;
                }
            }
        }
        arrayList.add(iBaseResponseCallback);
    }

    private void a(int i, int i2) {
        LogUtil.a("HwBasicSyncManager", "processCallback callback commandId :", Integer.valueOf(i), ", errorCode :", Integer.valueOf(i2));
        synchronized (f42115c) {
            c(i, i2);
        }
    }

    private void c(int i, int i2) {
        List<IBaseResponseCallback> list = this.f42116a.get(Integer.valueOf(i));
        if (list != null) {
            int i3 = 0;
            while (list.size() > 0) {
                IBaseResponseCallback iBaseResponseCallback = list.get(i3);
                if (iBaseResponseCallback != null) {
                    list.remove(i3);
                    iBaseResponseCallback.a(i2, null);
                    return;
                } else {
                    list.remove(i3);
                    i3++;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback != null) {
            iBaseResponseCallback.a(i, "");
        }
    }

    public boolean c() {
        return this.am;
    }

    public void d(long j) {
        this.ak = j;
    }

    protected void e(mqe mqeVar) {
        LogUtil.a("HwBasicSyncManager", "saveRealtimeDataFrame enter.");
        this.al.add(mqeVar);
    }

    protected void a() {
        this.al.clear();
        this.u.clear();
        this.z.clear();
    }

    private boolean b(String str) {
        Boolean bool = false;
        if (this.p.containsKey(str)) {
            bool = this.p.get(str);
        }
        return bool != null && bool.booleanValue();
    }

    protected void c(final int i, final DeviceInfo deviceInfo) {
        LogUtil.a("HwBasicSyncManager", "sendFitnessSyncEvent result :", Integer.valueOf(i));
        ThreadPoolManager.c().a("HwBasicSyncManager", new Runnable() { // from class: mpg.2
            @Override // java.lang.Runnable
            public void run() {
                mie.d(i, mpg.this.am, mpg.this.an, deviceInfo);
            }
        });
    }

    class b extends Handler {
        b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
        }
    }

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public void onDestroy() {
        super.onDestroy();
        this.ag.quit();
        this.ag = null;
        BroadcastManager.n(this.af);
    }

    static class d {
        private static final mpg d = new mpg();
    }
}

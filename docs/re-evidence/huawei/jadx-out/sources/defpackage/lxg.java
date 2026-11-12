package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.text.TextUtils;
import com.huawei.callback.BluetoothDataReceiveCallback;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.healthdatamgr.api.HealthDataMgrApi;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiSubscribeListener;
import com.huawei.hihealth.data.listener.HiUnSubscribeListener;
import com.huawei.hms.network.embedded.k;
import com.huawei.hwbasemgr.HwBaseManager;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.fitnessdatatype.HeartZoneConf;
import com.huawei.hwcommonmodel.fitnessdatatype.MotionGoal;
import com.huawei.hwcommonmodel.fitnessdatatype.StudentHeartRateZoneMgr;
import com.huawei.hwcommonmodel.utils.ThermalCallback;
import com.huawei.hwdevice.mainprocess.mgr.hwfitnessmgr.SportGoalMgr;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.up.model.UserInfomation;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class lxg extends HwBaseManager implements BluetoothDataReceiveCallback {
    private static String aj = "";
    private static boolean ak = false;
    private static lxg al;
    private static DeviceInfo am;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected IBaseResponseCallback f41040a;
    protected List<lyk> aa;
    protected lyd ab;
    protected long ac;
    protected long ad;
    protected int ae;
    protected lyu ag;
    protected List<lyi> ah;
    private BroadcastReceiver ao;
    private HandlerThread ap;
    private Context aq;
    private HandlerThread ar;
    private BroadcastReceiver as;
    private List<Integer> at;
    private BroadcastReceiver au;
    private HiUnSubscribeListener av;
    private List<lxy> aw;
    private List<Integer> ax;
    private boolean ay;
    private boolean az;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int f41041b;
    private boolean ba;
    private long bb;
    private lyn bc;
    private lxo bd;
    private SportGoalMgr be;
    private HiSubscribeListener bf;
    private BroadcastReceiver bg;
    private long bh;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Map<Integer, List<IBaseResponseCallback>> f41042c;
    protected int f;
    protected int g;
    protected int h;
    protected int i;
    protected int j;
    protected int k;
    protected long l;
    protected lxi m;
    protected List<lyh> n;
    protected int o;
    protected lxl.e p;
    protected int q;
    protected Handler r;
    protected lvb s;
    protected int t;
    protected List<Integer> u;
    protected Map<String, Boolean> v;
    protected lxh w;
    protected boolean x;
    protected boolean y;
    protected int z;
    protected static final Object e = new Object();
    protected static final Object d = new Object();
    private static final Object af = new Object();
    private static final Object ai = new Object();
    private static final Object an = new Object();

    private lxg(Context context) {
        super(context);
        this.f41042c = new HashMap(16);
        this.x = false;
        this.j = 0;
        this.r = null;
        this.k = 0;
        this.q = 0;
        this.ae = 0;
        this.i = 0;
        this.ad = 0L;
        this.ah = new ArrayList(16);
        this.f41041b = 0;
        this.g = 0;
        this.z = 0;
        this.f = 0;
        this.aa = new ArrayList(16);
        this.o = 0;
        this.h = 0;
        this.n = new ArrayList(16);
        this.v = new HashMap(16);
        this.y = false;
        this.t = 1;
        this.ac = 0L;
        this.l = 0L;
        this.f41040a = new IBaseResponseCallback() { // from class: lxg.4
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("HwFitnessManager", "mBaseResponseCallback errorCode :", Integer.valueOf(i), ", objectData :", obj);
                Intent intent = new Intent("com.huawei.phoneservice.sync_workout_broadcast_action");
                intent.setPackage(BaseApplication.getContext().getPackageName());
                lxg.this.aq.sendBroadcast(intent, LocalBroadcast.f36595c);
            }
        };
        this.ba = true;
        this.ap = null;
        this.ar = null;
        this.ay = false;
        this.aw = new ArrayList(16);
        this.at = new ArrayList(16);
        this.ax = null;
        this.be = new SportGoalMgr(BaseApplication.getContext());
        this.bd = new lxo();
        this.as = new BroadcastReceiver() { // from class: lxg.10
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                String action;
                if (intent == null) {
                    LogUtil.j("HwFitnessManager", "mBroadcastReceiver onReceive intent is null.");
                    return;
                }
                try {
                    action = intent.getAction();
                } catch (Exception e2) {
                    LogUtil.e("HwFitnessManager", "mBroadcastReceiver getAction exception : ", ExceptionUtils.c(e2));
                    action = null;
                }
                LogUtil.a("05", 1, "HwFitnessManager", "mBroadcastReceiver onReceive action is :", action);
                if (action == null) {
                    LogUtil.j("HwFitnessManager", "mBroadcastReceiver onReceive action is null.");
                    return;
                }
                if ("com.huawei.plugin.account.login".equals(action)) {
                    lxg.this.k();
                    return;
                }
                if ("com.huawei.bone.action.FITNESS_USERINFO_UPDATED".equals(action)) {
                    lxl.d();
                    lxg.this.l();
                } else if (!"com.huawei.bone.action.STUDENT_INFO_UPDATE".equals(action)) {
                    LogUtil.j("HwFitnessManager", "mBroadcastReceiver onReceive action is error.");
                } else {
                    lxl.c();
                }
            }
        };
        this.bg = new BroadcastReceiver() { // from class: lxg.7
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                if (intent == null) {
                    LogUtil.j("HwFitnessManager", "mCoreSleepStatusReceiver onReceive intent is null.");
                    return;
                }
                String action = intent.getAction();
                if (action == null) {
                    return;
                }
                LogUtil.a("05", 1, "HwFitnessManager", "mCoreSleepStatusReceiver onReceive action :", action);
                if ("action_change_core_sleep_button".equals(action)) {
                    String stringExtra = intent.getStringExtra("status");
                    LogUtil.a("HwFitnessManager", "mCoreSleepStatusReceiver onReceive status :", stringExtra);
                    if (stringExtra != null) {
                        if ("1".equalsIgnoreCase(stringExtra)) {
                            lxl.b(true, lxg.this.aq);
                            return;
                        } else {
                            lxl.b(false, lxg.this.aq);
                            return;
                        }
                    }
                    return;
                }
                if ("com.huawei.health.ACTION_SEND_SPORT_GOAL".equals(action)) {
                    LogUtil.a("HwFitnessManager", "onReceive ACTION_SEND_SPORT_GOAL");
                    String stringExtra2 = intent.getStringExtra("configId");
                    if (lxl.i()) {
                        lxg.this.be.d(stringExtra2);
                    } else if (lxl.a()) {
                        lxg.this.bd.b(stringExtra2);
                    }
                }
            }
        };
        this.ao = new BroadcastReceiver() { // from class: lxg.13
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                if (intent == null) {
                    LogUtil.j("HwFitnessManager", "mDeviceStatusReceiver onReceive intent is null.");
                    return;
                }
                String action = intent.getAction();
                if (action == null) {
                    LogUtil.j("HwFitnessManager", "mDeviceStatusReceiver onReceive action is null");
                    return;
                }
                LogUtil.a("05", 1, "HwFitnessManager", "mDeviceStatusReceiver onReceive action :", action);
                if ("com.huawei.bone.action.CONNECTION_STATE_CHANGED".equals(action)) {
                    try {
                        Parcelable parcelableExtra = intent.getParcelableExtra("deviceinfo");
                        DeviceInfo deviceInfo = parcelableExtra instanceof DeviceInfo ? (DeviceInfo) parcelableExtra : null;
                        if (deviceInfo != null) {
                            lxg.this.b(deviceInfo);
                        } else {
                            LogUtil.j("05", 1, "HwFitnessManager", "mDeviceStatusReceiver deviceInfo is null.");
                        }
                    } catch (ClassCastException e2) {
                        LogUtil.e("HwFitnessManager", "mDeviceStatusReceiver Exception : ", ExceptionUtils.c(e2));
                    }
                }
            }
        };
        this.au = new BroadcastReceiver() { // from class: lxg.12
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                String action;
                if (intent == null || (action = intent.getAction()) == null) {
                    return;
                }
                LogUtil.a("05", 1, "HwFitnessManager", "mHiHealthDataSyncReceiver onReceive action :", action);
                if ("com.huawei.hihealth.action_user_goal_change".equals(action)) {
                    lxg.this.h();
                }
            }
        };
        this.bf = new HiSubscribeListener() { // from class: lxg.14
            @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
            public void onResult(List<Integer> list, List<Integer> list2) {
                ReleaseLogUtil.d("Step_HwFitnessManager", "mSubscribeListener onResult");
                if (list == null || list.size() <= 0) {
                    lxg.this.ay = false;
                } else {
                    ReleaseLogUtil.d("Step_HwFitnessManager", "successList size ", Integer.valueOf(list.size()));
                    lxg.this.ax = list;
                }
                if (list2 != null) {
                    LogUtil.a("HwFitnessManager", "failList size ", Integer.valueOf(list2.size()));
                }
            }

            @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
            public void onChange(int i, HiHealthClient hiHealthClient, String str, HiHealthData hiHealthData, long j) {
                ReleaseLogUtil.d("Step_HwFitnessManager", "mSubscribeListener changeKey ", str, " type is ", Integer.valueOf(i));
                if (i == 102 && "custom.UserPreference_RunningPaceZone_Config".equals(str)) {
                    lxl.j();
                } else {
                    ReleaseLogUtil.e("Step_HwFitnessManager", "mSubscribeListener unkonwn changeKey");
                }
            }
        };
        this.av = new HiUnSubscribeListener() { // from class: lxg.15
            @Override // com.huawei.hihealth.data.listener.HiUnSubscribeListener
            public void onResult(boolean z) {
                LogUtil.a("HwFitnessManager", "mHiUnSubscribeListener onResult result: ", Boolean.valueOf(z));
            }
        };
        LogUtil.a("05", 1, "HwFitnessManager", "HwFitnessManager Constructor.");
        this.aq = context;
        this.w = new lxh(context, this);
        lvb lvbVarE = lvb.e();
        this.s = lvbVarE;
        if (lvbVarE == null) {
            LogUtil.j("05", 1, "HwFitnessManager", "mHwDeviceConfigManager is null.");
            return;
        }
        lvbVarE.d(7, this);
        this.m = lxi.d();
        this.ag = new lyu();
        k();
        this.p = new lxl.e(this, BaseApplication.getContext().getMainLooper());
        registerBroadcast(this.as, "com.huawei.plugin.account.login");
        registerBroadcast(this.as, "com.huawei.bone.action.FITNESS_USERINFO_UPDATED");
        registerBroadcast(this.as, "com.huawei.bone.action.STUDENT_INFO_UPDATE");
        n();
        HandlerThread handlerThread = new HandlerThread("HwFitnessManager");
        this.ar = handlerThread;
        handlerThread.start();
        this.r = new b(this.ar.getLooper());
        this.bc = lyn.c(BaseApplication.getContext());
        l();
        mit.b("HwFitnessManager", new Runnable() { // from class: lxg.11
            @Override // java.lang.Runnable
            public void run() {
                lxg.this.m.a(lxg.this);
                DeviceInfo deviceInfoD = mgg.d("HwFitnessManager");
                if (deviceInfoD != null && mja.b(deviceInfoD.getDeviceIdentify()) != 0) {
                    LogUtil.a("HwFitnessManager", "deviceInfo auto Sync");
                    lxg.this.d(deviceInfoD);
                }
                DeviceInfo deviceInfoD2 = mgi.d("HwFitnessManager");
                if (deviceInfoD2 == null || mja.b(deviceInfoD2.getDeviceIdentify()) == 0) {
                    return;
                }
                LogUtil.a("HwFitnessManager", "deviceAw70Info auto Sync");
                lxg.this.d(deviceInfoD2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        ReleaseLogUtil.d("Step_HwFitnessManager", "subscribeHiHealth enter");
        if (TextUtils.isEmpty(e()) || this.ay) {
            return;
        }
        ReleaseLogUtil.d("Step_HwFitnessManager", "user id is not empty");
        this.ay = true;
        this.at.add(102);
        HiHealthNativeApi.a(this.aq).subscribeHiHealthData(this.at, this.bf);
    }

    public boolean c() {
        DeviceInfo deviceInfoD = mgg.d("HwFitnessManager");
        if (deviceInfoD != null) {
            return mgb.d(deviceInfoD.getDeviceIdentify()) == 2;
        }
        LogUtil.j("HwFitnessManager", "isFamilyMode deviceInfo is null");
        return false;
    }

    private void h(DeviceInfo deviceInfo) {
        if (!eel.d(deviceInfo.getProductType())) {
            if (e(deviceInfo)) {
                return;
            }
            LogUtil.j("HwFitnessManager", "initDeviceInfo handleDeviceConnection is not connected");
        } else {
            lyn lynVar = this.bc;
            if (lynVar != null) {
                lynVar.c(deviceInfo);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(DeviceInfo deviceInfo) {
        if (eel.d(deviceInfo.getProductType())) {
            lyn lynVar = this.bc;
            if (lynVar != null) {
                lynVar.c(deviceInfo);
                return;
            }
            return;
        }
        if (e(deviceInfo)) {
            return;
        }
        LogUtil.j("HwFitnessManager", "changeDeviceInfo handleDeviceConnection is not connected");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.j("HwFitnessManager", "automaticSynchronizeFitnessDetailData deviceInfo is null");
        } else {
            h(deviceInfo);
        }
    }

    public static lxg c(Context context) {
        lxg lxgVar;
        synchronized (af) {
            if (al == null) {
                al = new lxg(BaseApplication.getContext());
            }
            lxgVar = al;
        }
        return lxgVar;
    }

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public Integer getModuleId() {
        return 7;
    }

    public boolean g() {
        return this.az;
    }

    protected void c(int i, IBaseResponseCallback iBaseResponseCallback) {
        synchronized (d) {
            if (iBaseResponseCallback != null) {
                List<IBaseResponseCallback> arrayList = this.f41042c.get(Integer.valueOf(i));
                if (arrayList == null) {
                    arrayList = new ArrayList<>(16);
                    this.f41042c.put(Integer.valueOf(i), arrayList);
                } else {
                    for (IBaseResponseCallback iBaseResponseCallback2 : arrayList) {
                        if (iBaseResponseCallback2 != null && iBaseResponseCallback2.equals(iBaseResponseCallback)) {
                            return;
                        }
                    }
                }
                arrayList.add(iBaseResponseCallback);
            }
        }
    }

    private void a(int i, int i2, Object obj) {
        LogUtil.a("05", 1, "HwFitnessManager", "processCallback callback commandId :", Integer.valueOf(i), ", errorCode :", Integer.valueOf(i2));
        synchronized (d) {
            List<IBaseResponseCallback> list = this.f41042c.get(Integer.valueOf(i));
            if (list != null) {
                int i3 = 0;
                while (list.size() > 0) {
                    IBaseResponseCallback iBaseResponseCallback = list.get(i3);
                    if (iBaseResponseCallback != null) {
                        LogUtil.a("05", 1, "HwFitnessManager", "processCallback errorCode :", Integer.valueOf(i2));
                        list.remove(i3);
                        iBaseResponseCallback.a(i2, obj);
                        break;
                    }
                    list.remove(i3);
                    i3++;
                }
            }
        }
    }

    private void n() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.bone.action.CONNECTION_STATE_CHANGED");
        intentFilter.addAction("com.huawei.bone.action.DEVICE_LIST_CHANGED");
        BroadcastManagerUtil.c(this.aq, this.ao, intentFilter, LocalBroadcast.f36595c, null);
        IntentFilter intentFilter2 = new IntentFilter("com.huawei.hihealth.action_user_goal_change");
        intentFilter2.addAction("com.huawei.hihealth.action_receive_push");
        BroadcastManagerUtil.b(this.aq, this.au, intentFilter2);
        IntentFilter intentFilter3 = new IntentFilter();
        intentFilter3.addAction("action_change_core_sleep_button");
        intentFilter3.addAction("com.huawei.health.ACTION_SEND_SPORT_GOAL");
        BroadcastManagerUtil.d(this.aq, this.bg, intentFilter3);
    }

    private void j(final int i, final DeviceInfo deviceInfo) {
        LogUtil.a("HwFitnessManager", "saveFitnessDate.");
        boolean zCheckHiHealthServiceExist = HiHealthManager.d(this.aq).checkHiHealthServiceExist();
        LogUtil.a("05", 1, "HwFitnessManager", "saveFitnessDate isExistHiHealthService :", Boolean.valueOf(zCheckHiHealthServiceExist));
        if (zCheckHiHealthServiceExist) {
            this.w.b(5, 120000L, deviceInfo);
            this.x = true;
            lxl.j(deviceInfo);
            final ArrayList arrayList = new ArrayList(16);
            final ArrayList arrayList2 = new ArrayList(16);
            arrayList.addAll(this.aa);
            arrayList2.addAll(this.ah);
            this.aa.clear();
            this.ah.clear();
            final ArrayList arrayList3 = new ArrayList(16);
            arrayList3.addAll(this.aw);
            this.aw.clear();
            final int iE = lxl.e();
            mit.b("HwFitnessManager", new Runnable() { // from class: lxg.16
                @Override // java.lang.Runnable
                public void run() {
                    if (iE == 3) {
                        lxg.this.m.c(lxg.al, arrayList, arrayList2, i, deviceInfo);
                    } else {
                        lxg.this.m.a(lxg.al, arrayList3, i, deviceInfo);
                    }
                }
            });
            return;
        }
        d(300001, deviceInfo);
    }

    public void h() {
        DeviceInfo deviceInfoD = mgg.d("HwFitnessManager");
        boolean zB = lxl.b(deviceInfoD);
        boolean zA = lxl.a(deviceInfoD);
        LogUtil.a("HwFitnessManager", "setDeviceFitnessGoal enter isSupportSportGoalDataSync ", Boolean.valueOf(zB), " isSupportSyncGoalList ", Boolean.valueOf(zA));
        if (zB) {
            this.be.c();
        } else if (zA) {
            this.bd.d();
        } else {
            i(deviceInfoD);
        }
    }

    private void i(DeviceInfo deviceInfo) {
        lyn lynVar;
        LogUtil.a("05", 1, "HwFitnessManager", "setDeviceFitnessGoal enter.");
        if (deviceInfo != null) {
            qgq.c(new MotionGoal(), new IBaseResponseCallback() { // from class: lxg.2
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    mit.b("HwFitnessManager", new lxl.a(i, obj));
                }
            });
        }
        if (mgi.d("HwFitnessManager") == null || (lynVar = this.bc) == null) {
            return;
        }
        lynVar.c();
    }

    @Override // com.huawei.callback.BluetoothDataReceiveCallback
    public void onDataReceived(int i, DeviceInfo deviceInfo, byte[] bArr) {
        LogUtil.a("HwFitnessManager", "onDataReceived errorCode :", Integer.valueOf(i));
        if (i != 0 || bArr == null) {
            return;
        }
        this.w.a((Object) bArr, deviceInfo);
    }

    public void c(int i, DeviceInfo deviceInfo) {
        LogUtil.a("05", 1, "HwFitnessManager", "doDetailSyncComplete errorCode :", Integer.valueOf(i));
        d(i, deviceInfo);
    }

    public void d(int i, DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.j("HwFitnessManager", "processDetailSyncComplete deviceInfo is null");
            return;
        }
        LogUtil.a("05", 1, "HwFitnessManager", "processDetailSyncComplete errorCode :", Integer.valueOf(i));
        mit.b("HwFitnessManager", new a(this, i, i(), deviceInfo));
        a(true, "processDetailSyncComplete");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i, boolean z, DeviceInfo deviceInfo) {
        LogUtil.a("05", 1, "HwFitnessManager", "syncCompleteRun isNeedSync :", Boolean.valueOf(z));
        DeviceCapability deviceCapabilityA = eej.a(deviceInfo.getDeviceIdentify());
        synchronized (an) {
            a(10009, i, (Object) null);
            if (this.ag.c() == 1) {
                a(5);
                if (deviceCapabilityA == null || !deviceCapabilityA.isSupportGetHighAndMiddleSport()) {
                    LogUtil.j("HwFitnessManager", "syncCompleteRun not support highAndMiddleSport.");
                    j(deviceInfo);
                } else {
                    this.w.d(1, deviceInfo);
                }
                lxl.c(this.aq);
                ReleaseLogUtil.d("R_HeartRate_HwFitnessManager", "startSyncAlarm");
                qec.d().startSyncHeartRateAlarm(deviceInfo);
                qec.d().startSyncLowSpo2Alarm(deviceInfo);
                j();
            } else {
                if (deviceCapabilityA == null || !deviceCapabilityA.isSupportGetHighAndMiddleSport()) {
                    LogUtil.j("HwFitnessManager", "syncCompleteRun not support high and middle sport.");
                } else {
                    LogUtil.a("HwFitnessManager", "syncCompleteRun syncSecondStageFitnessDetail");
                    this.w.d(7, deviceInfo);
                }
                a(5);
                this.v.remove(deviceInfo.getDeviceIdentify());
                this.x = false;
            }
        }
    }

    static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<lxg> f41061a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f41062b;
        private boolean d;
        private DeviceInfo e;

        a(lxg lxgVar, int i, boolean z, DeviceInfo deviceInfo) {
            this.f41062b = 0;
            this.d = true;
            LogUtil.a("05", 1, "HwFitnessManager", "SyncCompleteRunnable isNeedSyncWork :", Boolean.valueOf(z));
            this.f41061a = new WeakReference<>(lxgVar);
            this.f41062b = i;
            this.d = z;
            this.e = deviceInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            lxg lxgVar = this.f41061a.get();
            if (lxgVar != null) {
                lxgVar.b(this.f41062b, this.d, this.e);
            }
        }
    }

    protected void e(int i, DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.j("HwFitnessManager", "notifyDetailSyncComplete deviceInfo is null");
            return;
        }
        if (i == 300001) {
            this.v.remove(deviceInfo.getDeviceIdentify());
        }
        LogUtil.a("05", 1, "HwFitnessManager", "notifyDetailSyncComplete errorCode :", Integer.valueOf(i), ", currentStage :", Integer.valueOf(this.ag.c()));
        if (this.ag.c() == 2) {
            a(0);
            if (i == 0) {
                j(2, deviceInfo);
            } else {
                this.v.remove(deviceInfo.getDeviceIdentify());
                a(10009, i, (Object) null);
            }
        }
        if (this.ag.c() == 1) {
            if (i == 0) {
                j(1, deviceInfo);
                b(100000, deviceInfo);
            } else {
                c(deviceInfo);
            }
        }
    }

    private void c(DeviceInfo deviceInfo) {
        ReleaseLogUtil.d("R_HeartRate_HwFitnessManager", "afterFitnessDataSync enter.");
        a(true, "notifyDetailSyncComplete");
        qec.d().startSyncHeartRateAlarm(deviceInfo);
        qec.d().startSyncLowSpo2Alarm(deviceInfo);
        j();
    }

    protected void d(lxy lxyVar) {
        LogUtil.a("HwFitnessManager", "saveRealtimeDataFrame enter.");
        this.aw.add(lxyVar);
    }

    protected void c(lyd lydVar, DeviceInfo deviceInfo) {
        LogUtil.a("05", 1, "HwFitnessManager", "getRealtimeDataByFrame Enter.");
        this.u = lydVar.e();
        int iD = lydVar.d();
        this.k = iD;
        this.q = 0;
        List<Integer> list = this.u;
        if (list != null && iD > 0) {
            LogUtil.a("HwFitnessManager", "getRealtimeDataByFrame get frame index :", list.get(0));
            lxl.d(this.u.get(this.q).intValue(), deviceInfo);
        } else {
            e(0, deviceInfo);
        }
    }

    private void a(int i) {
        lxl.e eVar = this.p;
        if (eVar == null || !eVar.hasMessages(i)) {
            return;
        }
        this.p.removeMessages(i);
    }

    public static void a(boolean z) {
        ak = z;
    }

    public void a(IBaseResponseCallback iBaseResponseCallback, DeviceInfo deviceInfo) {
        synchronized (e) {
            if (deviceInfo != null) {
                if (deviceInfo.getDeviceConnectState() == 2) {
                    if (b(deviceInfo.getDeviceIdentify())) {
                        ReleaseLogUtil.d("Step_HwFitnessManager", "syncFitnessTodayDataRun data syncing.");
                        iBaseResponseCallback.a(0, null);
                        return;
                    }
                    this.v.put(deviceInfo.getDeviceIdentify(), true);
                    this.w.b(4, 40000L, deviceInfo);
                    c(10008, iBaseResponseCallback);
                    ReleaseLogUtil.d("Step_HwFitnessManager", "syncFitnessTodayDataRun enter thread.");
                    lxw.c(deviceInfo);
                    return;
                }
            }
            ReleaseLogUtil.e("Step_HwFitnessManager", "syncFitnessTodayDataRun get device info error.");
            iBaseResponseCallback.a(300004, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(String str) {
        Boolean bool = false;
        if (this.v.containsKey(str)) {
            bool = this.v.get(str);
        }
        return bool != null && bool.booleanValue();
    }

    public void c(IBaseResponseCallback iBaseResponseCallback, DeviceInfo deviceInfo) {
        if (!mga.a(deviceInfo)) {
            LogUtil.j("HwFitnessManager", "syncFitnessTodayData checkHiHealthType fail.");
            iBaseResponseCallback.a(-1, "");
            return;
        }
        mit.b("HwFitnessManager", new lxl.j(this, iBaseResponseCallback, deviceInfo));
        lyn lynVar = this.bc;
        if (lynVar != null) {
            lynVar.b((IBaseResponseCallback) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        LogUtil.a("05", 1, "HwFitnessManager", "handleUserLogin enter.");
        this.m.c(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final DeviceInfo deviceInfo) {
        LogUtil.a("HwFitnessManager", "hwfinessManager handleGetUserInfo enter");
        LoginInit.getInstance(this.aq).getUserInfoFromDb(new IBaseResponseCallback() { // from class: lxn
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.e.d(deviceInfo, i, obj);
            }
        });
    }

    /* synthetic */ void d(DeviceInfo deviceInfo, int i, Object obj) {
        if (i != 0 || !(obj instanceof UserInfomation)) {
            LogUtil.a("HwFitnessManager", "processGetUserInfoSuccess userInfo is null");
            return;
        }
        this.w.b(deviceInfo, (UserInfomation) obj);
        LogUtil.a("HwFitnessManager", "handleDeviceConnection setRunPaceZone");
        lxl.h();
    }

    private boolean e(DeviceInfo deviceInfo) {
        int deviceConnectState = deviceInfo.getDeviceConnectState();
        LogUtil.a("05", 1, "HwFitnessManager", "handleDeviceConnection connectState :", Integer.valueOf(deviceConnectState));
        if (deviceConnectState != 2) {
            if (deviceConnectState == 3) {
                return false;
            }
            LogUtil.j("HwFitnessManager", "handleDeviceConnection connectState is error.");
            return false;
        }
        am = deviceInfo;
        if (ak) {
            f();
            return true;
        }
        lug.b(this.aq, null);
        this.p.sendEmptyMessageDelayed(6, 2000L);
        return true;
    }

    public void f() {
        if (am == null) {
            LogUtil.j("HwFitnessManager", "startDataSync sDeviceInfo is null.");
        } else {
            ThreadPoolManager.c().a("startDataSync", new Runnable() { // from class: lxg.3
                @Override // java.lang.Runnable
                public void run() {
                    mga.h(lxg.am);
                    lxg.this.a(lxg.am);
                    lxl.c(lxg.am);
                    mev.d().b(lxg.am);
                }
            });
        }
    }

    protected void a() {
        this.aw.clear();
        this.aa.clear();
        this.ah.clear();
    }

    private void j(DeviceInfo deviceInfo) {
        mja.b();
        synchronized (e) {
            this.ag.d(2);
            if (lxl.e() != 3 && deviceInfo != null) {
                LogUtil.a("HwFitnessManager", "syncSecondStageFitnessDetail not separated data.");
                this.v.remove(deviceInfo.getDeviceIdentify());
                return;
            }
            long jA = this.ag.a(this);
            long jCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            LogUtil.a("HwFitnessManager", "lastSecondStageTime:", Long.valueOf(jA), ",endSecondStageTime:", Long.valueOf(jCurrentTimeMillis));
            if (jA >= lxl.d(jCurrentTimeMillis)) {
                LogUtil.a("HwFitnessManager", "syncSecondStageFitnessDetail sync sample second stage already ok.");
                this.w.b(deviceInfo);
            } else {
                if (jCurrentTimeMillis - jA > k.b.l) {
                    jA = lxl.d(jCurrentTimeMillis - k.b.l);
                }
                this.ad = jCurrentTimeMillis;
                lxw.b(jA, jCurrentTimeMillis);
            }
        }
    }

    public void a(boolean z, DeviceInfo deviceInfo, IBaseResponseCallback iBaseResponseCallback) {
        boolean zC;
        ReleaseLogUtil.d("HwFitnessManager", "syncFitnessDetailData is enter, isManualSync: ", Boolean.valueOf(z));
        if (!ThermalCallback.getInstance().isTriggerTask()) {
            LogUtil.j("HwFitnessManager", "syncFitnessDetailData does not have the conditions to trigger the task.");
            lxl.b(true);
            a(300008, iBaseResponseCallback);
            return;
        }
        lxl.b(false);
        if (z) {
            List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_DEVICES, null, "HwFitnessManager");
            if (deviceList != null && !deviceList.isEmpty()) {
                zC = false;
                for (int i = 0; i < deviceList.size(); i++) {
                    DeviceInfo deviceInfo2 = deviceList.get(i);
                    if (deviceInfo2 == null) {
                        LogUtil.j("HwFitnessManager", "currentInfo is null");
                    } else {
                        boolean zC2 = c(deviceInfo2, z, iBaseResponseCallback);
                        if (!zC) {
                            zC = zC2;
                        }
                    }
                }
            }
            lxl.c(this.aq);
        }
        zC = c(deviceInfo, z, iBaseResponseCallback);
        if (zC) {
            return;
        }
        lxl.c(this.aq);
    }

    private boolean c(DeviceInfo deviceInfo, boolean z, IBaseResponseCallback iBaseResponseCallback) {
        if (deviceInfo == null) {
            LogUtil.j("HwFitnessManager", "syncDeviceFitnessData deviceInfo is null");
            a(300008, iBaseResponseCallback);
            return false;
        }
        String deviceIdentify = deviceInfo.getDeviceIdentify();
        if (mgb.d(deviceIdentify) == 2) {
            LogUtil.j("HwFitnessManager", "syncDeviceFitnessData mode is FAMILY_PAIR_MODE");
            a(300008, iBaseResponseCallback);
            return false;
        }
        Map<String, DeviceCapability> mapD = lvb.e().d(1, deviceIdentify, "HwFitnessManager");
        if (mapD == null || mapD.isEmpty()) {
            LogUtil.j("HwFitnessManager", "syncDeviceFitnessData deviceCapabilityHashMaps is null or empty");
            a(300008, iBaseResponseCallback);
            return false;
        }
        DeviceCapability deviceCapability = mapD.get(deviceIdentify);
        if (deviceCapability == null || !deviceCapability.isSupportSportTotal()) {
            LogUtil.j("HwFitnessManager", "syncDeviceFitnessData deviceCapability error");
            a(300008, iBaseResponseCallback);
            c(deviceInfo);
            b(0, deviceInfo);
            return false;
        }
        Boolean bool = this.v.get(deviceIdentify);
        if (bool != null && bool.booleanValue()) {
            LogUtil.a("HwFitnessManager", "syncDeviceFitnessData data syncing");
            a(300008, iBaseResponseCallback);
            return false;
        }
        if (eel.d(deviceInfo.getProductType()) && this.bc.a()) {
            LogUtil.a("HwFitnessManager", "syncDeviceFitnessData aw70 data syncing.");
            a(300008, iBaseResponseCallback);
            return false;
        }
        a(deviceInfo, z, iBaseResponseCallback);
        return true;
    }

    private void a(final DeviceInfo deviceInfo, boolean z, final IBaseResponseCallback iBaseResponseCallback) {
        final Message messageObtain = Message.obtain();
        messageObtain.what = 0;
        a(new IBaseResponseCallback() { // from class: lxg.5
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                ReleaseLogUtil.d("Step_HwFitnessManager", "syncFitnessDetailData errorCode:", Integer.valueOf(i));
                if (lxg.this.p != null && lxg.this.p.hasMessages(messageObtain.what)) {
                    lxg.this.p.removeMessages(messageObtain.what);
                }
                if (i != 0) {
                    lxg.this.a(300008, iBaseResponseCallback);
                    lxg.this.e(300001, deviceInfo);
                    lxg.this.b(0, deviceInfo);
                    lxl.b(lxg.this.aq);
                    return;
                }
                lxg.this.a(0, iBaseResponseCallback);
            }
        }, z, deviceInfo);
        this.p.sendMessageDelayed(messageObtain, 30000L);
    }

    public void a(final IBaseResponseCallback iBaseResponseCallback, boolean z, final DeviceInfo deviceInfo) {
        if (deviceInfo != null) {
            LogUtil.a("HwFitnessManager", "syncFitnessDetailData updateSyncStatus");
            mja.b(deviceInfo.getDeviceIdentify(), 0);
        }
        if (lxl.c(deviceInfo, this.aq)) {
            if (!mga.a(deviceInfo)) {
                LogUtil.j("HwFitnessManager", "deviceInfo checkHiHealthType fail.");
                iBaseResponseCallback.a(-1, "");
                return;
            }
            this.az = z;
            ReleaseLogUtil.d("R_HeartRate_HwFitnessManager", "begin start syncFitnessDetailData.");
            e(System.currentTimeMillis());
            this.bh = System.currentTimeMillis();
            if (this.bc == null) {
                this.bc = lyn.c(BaseApplication.getContext());
            }
            if (!eel.d(deviceInfo.getProductType())) {
                c(new IBaseResponseCallback() { // from class: lxg.1
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public void a(int i, Object obj) {
                        ReleaseLogUtil.d("Step_HwFitnessManager", " today total finish need detail errorCode :", Integer.valueOf(i));
                        if (lxg.this.bc.b(lxg.this.bh, lxl.a(lxg.this), lxg.this.az)) {
                            if (lxg.this.b(deviceInfo.getDeviceIdentify())) {
                                lxg.this.v.remove(deviceInfo.getDeviceIdentify());
                            }
                            LogUtil.j("HwFitnessManager", "syncFitnessTodayData success not SyncFitnessDetailData.");
                            iBaseResponseCallback.a(-1, "");
                            return;
                        }
                        if (i != 0) {
                            LogUtil.j("HwFitnessManager", "syncFitnessTodayData error");
                            iBaseResponseCallback.a(-1, "");
                        } else {
                            mit.b("HwFitnessManager", new lxl.c(lxg.this, iBaseResponseCallback, true, deviceInfo));
                        }
                    }
                }, deviceInfo);
            } else {
                this.bc.e(iBaseResponseCallback, z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback != null) {
            iBaseResponseCallback.a(i, "");
        }
    }

    public static String e() {
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        aj = accountInfo;
        if (accountInfo == null) {
            aj = "";
        }
        return aj;
    }

    public void d(IBaseResponseCallback iBaseResponseCallback, boolean z) {
        mit.b("HwFitnessManager", new d(iBaseResponseCallback, z));
    }

    /* JADX INFO: loaded from: classes38.dex */
    class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f41064a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private IBaseResponseCallback f41065c;

        d(IBaseResponseCallback iBaseResponseCallback, boolean z) {
            this.f41065c = iBaseResponseCallback;
            this.f41064a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            DeviceInfo deviceInfoD;
            HeartZoneConf heartZoneConf = ((HealthDataMgrApi) Services.d("HWHealthDataMgr", HealthDataMgrApi.class)).getHeartZoneConf();
            LogUtil.a("05", 1, "HwFitnessManager", "setHeartZoneConfig heartZoneConf :", heartZoneConf);
            DeviceCapability deviceCapabilityC = eej.c();
            if (deviceCapabilityC == null || !deviceCapabilityC.isSupportHeartRateZone()) {
                LogUtil.j("HwFitnessManager", "setHeartZoneConfig deviceCapability is null or not support.");
                return;
            }
            if (this.f41064a) {
                lxg.this.c(19, this.f41065c);
            } else {
                this.f41065c.a(0, null);
            }
            if (lxc.e() && (deviceInfoD = mgg.d("HwFitnessManager")) != null && lxc.a(deviceInfoD.getDeviceIdentify())) {
                LogUtil.j("HwFitnessManager", "setHeartZoneConfig Device is family mode");
            } else {
                lxw.b(heartZoneConf, (StudentHeartRateZoneMgr) null, false);
            }
        }
    }

    public void c(boolean z) {
        LogUtil.a("DEVMGR_SETTING", "HwFitnessManager", "changeHeartRateBtValue isEnabled :", Boolean.valueOf(z));
        if (c()) {
            LogUtil.a("HwFitnessManager", "isFamilyMode changeHeartRateBtValue isEnabled is:", Boolean.valueOf(z));
            if (z) {
                SharedPreferenceManager.e(this.aq, "102", "heart_rate_button", "1", null);
            } else {
                SharedPreferenceManager.e(this.aq, "102", "heart_rate_button", "0", null);
            }
            mfd.a().c();
            return;
        }
        lxl.a(z ? 1 : 0, new IBaseResponseCallback() { // from class: lxg.9
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (i == 0) {
                    LogUtil.a("HwFitnessManager", "changeHeartRateBtValue saveHeartRateButton success.");
                    mfd.a().c();
                }
            }
        }, this.aq);
    }

    public void c(int i) {
        LogUtil.a("HwFitnessManager", "changeContinueMeasureHeartRateStatus status :", Integer.valueOf(i));
        if (c()) {
            lxw.a(i);
            SharedPreferenceManager.e(this.aq, "101", "continue_heart_rate", Integer.toString(i), null);
        } else {
            lxf.c(i);
        }
    }

    public void d(int i) {
        LogUtil.a("HwFitnessManager", " enter changeCycleMeasureHeartRateStatus status :", Integer.valueOf(i));
        if (c()) {
            lxw.e(i);
            SharedPreferenceManager.e(this.aq, "102", "heart_rate_button", Integer.toString(i), null);
        } else {
            lxf.a(i);
        }
    }

    public void a(int i, int i2, boolean z) {
        LogUtil.a("HwFitnessManager", "heartRateRaiseRemind enable :", Integer.valueOf(i), "heartRateValue :", Integer.valueOf(i2));
        DeviceCapability deviceCapabilityC = eej.c();
        if (deviceCapabilityC == null || !deviceCapabilityC.isSupportHeartRateRaiseAlarm()) {
            LogUtil.j("HwFitnessManager", "heartRateRaiseRemind deviceCapability is null or deviceCapability is not support");
            return;
        }
        if (!c()) {
            if (i == 0 && !z) {
                lxw.c(i, i2);
                return;
            } else {
                lxf.c(i, i2);
                return;
            }
        }
        lxw.c(i, i2);
        if (i > 0) {
            SharedPreferenceManager.e(this.aq, "104", "custom.heart_rate_raise_remind", Integer.toString(i2), null);
        }
        if (i == 0 && !z) {
            LogUtil.a("HwFitnessManager", "familyMode heartRateRaiseRemind not save enable status");
        } else if (i > 0) {
            SharedPreferenceManager.e(this.aq, "102", "heart_rate_button", "1", null);
        } else {
            SharedPreferenceManager.e(this.aq, "102", "heart_rate_button", "0", null);
        }
    }

    public void c(int i, int i2, boolean z) {
        LogUtil.a("HwFitnessManager", "heartRateDownRemind enable :", Integer.valueOf(i), "heartRateValue :", Integer.valueOf(i2));
        DeviceCapability deviceCapabilityC = eej.c();
        if (deviceCapabilityC == null || !deviceCapabilityC.isSupportHeartRateDownAlarm()) {
            LogUtil.j("HwFitnessManager", "heartRateDownRemind deviceCapability is null or deviceCapability is not support");
            return;
        }
        if (!c()) {
            if (i == 0 && !z) {
                lxw.a(i, i2);
                return;
            } else {
                lxf.a(i, i2);
                return;
            }
        }
        lxw.a(i, i2);
        if (i > 0) {
            SharedPreferenceManager.e(this.aq, "105", "custom.heart_rate_down_remind", Integer.toString(i2), null);
        }
        if (i == 0 && !z) {
            LogUtil.a("HwFitnessManager", "familyMode heartRateDownRemind not save enable status");
        } else if (i > 0) {
            SharedPreferenceManager.e(this.aq, "102", "heart_rate_button", "1", null);
        } else {
            SharedPreferenceManager.e(this.aq, "102", "heart_rate_button", "0", null);
        }
    }

    public void b(int i) {
        LogUtil.a("HwFitnessManager", "setBloodOxygenSwitchStatus status: ", Integer.valueOf(i));
        DeviceCapability deviceCapabilityC = eej.c();
        if (deviceCapabilityC == null || !deviceCapabilityC.isSupportCycleBloodOxygenSwitch()) {
            LogUtil.j("HwFitnessManager", "deviceCapability is null or deviceCapability is not support");
        } else if (c()) {
            lxw.b(i);
            SharedPreferenceManager.e(this.aq, "100", "custom.blood.oxygen.switch", Integer.toString(i), null);
        } else {
            lxf.e(i);
        }
    }

    public void d(int i, int i2, boolean z) {
        LogUtil.a("HwFitnessManager", "bloodOxygenDownRemind enable: ", Integer.valueOf(i), " bloodOxygenValue: ", Integer.valueOf(i2));
        DeviceCapability deviceCapabilityC = eej.c();
        if (deviceCapabilityC == null || !deviceCapabilityC.isSupportBloodOxygenDownRemind()) {
            LogUtil.j("HwFitnessManager", "deviceCapability is null or deviceCapability is not support");
            return;
        }
        if (!c()) {
            if (i == 0 && !z) {
                lxw.b(i, i2);
                return;
            } else {
                lxf.e(i, i2);
                return;
            }
        }
        LogUtil.a("HwFitnessManager", "setBloodOxygenDownRemind isFamilyMode");
        lxw.b(i, i2);
        if (i > 0) {
            SharedPreferenceManager.e(this.aq, "100", "custom.blood.oxygen.switch", "1", null);
            SharedPreferenceManager.e(this.aq, "103", "custom.blood.oxygen.remind", Integer.toString(i2), null);
        } else {
            SharedPreferenceManager.e(this.aq, "100", "custom.blood.oxygen.switch", "0", null);
        }
    }

    public void d(int i, int i2, int i3) {
        LogUtil.a("HwFitnessManager", "changeContinueMeasureHeartRateStatus status: ", Integer.valueOf(i2), " ,switchType: ", Integer.valueOf(i));
        if (i == 1) {
            lxf.b(i2);
        } else if (i == 2) {
            lxf.b(i2, i3);
        } else {
            if (i != 3) {
                return;
            }
            lxf.d(i2, i3);
        }
    }

    class b extends Handler {
        b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            lxg.this.w.c(message);
        }
    }

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public void onDestroy() {
        super.onDestroy();
        HandlerThread handlerThread = this.ar;
        if (handlerThread != null) {
            handlerThread.quit();
            this.ar = null;
        }
        HandlerThread handlerThread2 = this.ap;
        if (handlerThread2 != null) {
            handlerThread2.quit();
            this.ap = null;
        }
        BroadcastReceiver broadcastReceiver = this.as;
        if (broadcastReceiver != null) {
            unregisterBroadcast(broadcastReceiver);
            this.as = null;
        }
        BroadcastReceiver broadcastReceiver2 = this.au;
        if (broadcastReceiver2 != null) {
            BroadcastManagerUtil.b(this.aq, broadcastReceiver2);
            this.au = null;
        }
        BroadcastReceiver broadcastReceiver3 = this.bg;
        if (broadcastReceiver3 != null) {
            BroadcastManagerUtil.d(this.aq, broadcastReceiver3);
            this.bg = null;
        }
        if (this.ax != null && this.ay) {
            HiHealthManager.d(this.aq).unSubscribeHiHealthData(this.ax, this.av);
            this.at = null;
            this.ax = null;
            this.ay = false;
        }
        this.be.a();
        this.bd.b();
    }

    protected void j() {
        LogUtil.a("HwFitnessManager", "notifyToSyncWorkoutData sending broadcast to sync workout data.");
        ThreadPoolManager.c().a("HwFitnessManager", new Runnable() { // from class: lxg.6
            @Override // java.lang.Runnable
            public void run() {
                synchronized (lxg.e) {
                    lxg.this.s.a(lxg.this.f41040a);
                }
            }
        });
    }

    public boolean i() {
        return this.ba;
    }

    protected void a(boolean z, String str) {
        LogUtil.a("HwFitnessManager", "Enter setNeedWorkout isNeedWorkout: ", Boolean.valueOf(z), " isFrom: ", str);
        this.ba = z;
    }

    public void e(long j) {
        this.bb = j;
    }

    protected void b(final int i, final DeviceInfo deviceInfo) {
        LogUtil.a("HwFitnessManager", "sendFitnessSyncEvent result :", Integer.valueOf(i));
        ThreadPoolManager.c().a("HwFitnessManager", new Runnable() { // from class: lxg.8
            @Override // java.lang.Runnable
            public void run() {
                mie.d(i, lxg.this.az, lxg.this.bh, deviceInfo);
            }
        });
    }

    public void a(int i, DeviceInfo deviceInfo) {
        LogUtil.a("05", 1, "HwFitnessManager", "processIntensiveSyncComplete errorCode: ", Integer.valueOf(i), ", intensiveFlag: ", Integer.valueOf(this.t));
        this.y = false;
        if (this.t == 1) {
            j(deviceInfo);
        }
    }
}

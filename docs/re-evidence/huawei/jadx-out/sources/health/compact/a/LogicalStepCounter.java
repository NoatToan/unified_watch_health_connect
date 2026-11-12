package health.compact.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.core.content.ContextCompat;
import androidx.media3.common.C;
import com.huawei.haf.application.BroadcastManager;
import com.huawei.haf.common.dfx.memory.MemoryMonitor;
import com.huawei.haf.common.utils.ScreenUtil;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.health.connectivity.StepCounterManager;
import com.huawei.health.connectivity.extendstepcounter.ExtendStepCounter;
import com.huawei.health.connectivity.extendstepcounter.ExtendStepDataManager;
import com.huawei.health.connectivity.extendstepcounter.MidwareStepCounter;
import com.huawei.health.connectivity.standstepcounter.StandStepDataManager;
import com.huawei.health.icommon.HwHealthSensorEventListener;
import com.huawei.health.icommon.ISimpleResultCallback;
import com.huawei.health.icommon.IStepReport;
import com.huawei.health.icommon.LocalStepDataReport;
import com.huawei.health.icommon.SportIntensity;
import com.huawei.health.manager.LogicalStepCounter$ExtendStepMsg;
import com.huawei.health.manager.LogicalStepCounter$FlushDbMsg;
import com.huawei.health.manager.LogicalStepCounter$ReadStaticDealCallback;
import com.huawei.health.manager.MockStepHelper;
import com.huawei.health.manager.ScreenOnStatisticsUtil;
import com.huawei.health.manager.common.FlushableStepDataCache;
import com.huawei.health.manager.receiver.DaemonBrowseModeReceiver;
import com.huawei.health.manager.receiver.DaemonDynamicBroadcastReceiver;
import com.huawei.health.manager.util.Consts;
import com.huawei.health.manager.util.DeviceClassWatchDog;
import com.huawei.health.manager.util.GoalValue;
import com.huawei.health.manager.util.HiHealthHelper;
import com.huawei.health.manager.util.HuaweiServerTokenNotification;
import com.huawei.health.manager.util.SleepDataDbUtil;
import com.huawei.health.manager.util.TimeUtil;
import com.huawei.health.manager.util.TotalDetailStepsCacheBean;
import com.huawei.health.manager.util.UploadUtil;
import com.huawei.health.manager.util.UserInfo;
import com.huawei.health.provider.HealthFaDataExtendHelper;
import com.huawei.health.ui.notification.uihandlers.HealthStepsNotificationHelper;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiUserInfo;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiCommonListener;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.data.listener.HiSubscribeListener;
import com.huawei.hihealth.data.listener.HiUnSubscribeListener;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import com.huawei.thirdloginbasemodule.ThirdLoginDataStorageUtil;
import com.huawei.threecircle.ThreeCircleConfigUtil;
import com.huawei.threecircle.manager.WheelChairStateManager;
import com.huawei.utils.FoundationCommonUtil;
import com.huawei.watchface.api.HwWatchFaceApi;
import defpackage.ijx;
import defpackage.ikx;
import defpackage.ipa;
import defpackage.ipb;
import defpackage.lsb;
import defpackage.lsl;
import defpackage.njy;
import defpackage.npt;
import defpackage.qgm;
import defpackage.qgr;
import defpackage.qhb;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.LogicalStepCounter;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class LogicalStepCounter implements StandStepDataManager.IGetCacheTodaySteps {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static LogicalStepCounter f36613b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f36614c = false;
    private static volatile boolean e = false;
    private static long f;
    private static long h;
    private HealthStepsNotificationHelper ab;
    private boolean ah;
    private ProcessAliveMonitor ar;
    private StepsRecordManager bj;
    private ArrayList<Integer> bl;
    private DaemonBrowseModeReceiver l;
    private DaemonDynamicBroadcastReceiver o;
    private Context s;
    private GoalValue y;
    private static final Object d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f36612a = new Object();
    private static long g = System.currentTimeMillis();
    private StandStepCounter be = null;
    private StandStepDataManager bg = null;
    private StepCounterManager bf = null;
    private ExtendStepCounter x = null;
    private ExtendStepDataManager v = null;
    private DistanceManager p = null;
    private CaloriesManager m = null;
    private boolean ak = false;
    private int bq = 0;
    private int az = 0;
    private int k = 0;
    private int an = 0;
    private int bh = 0;
    private int bc = 0;
    private int ax = 0;
    private int at = 0;
    private int av = 0;
    private int ay = 0;
    private int aw = 0;
    private int bo = 0;
    private double j = 0.0d;
    private UserInfo bn = null;
    private String q = "unKnown";
    private int ap = 0;
    private boolean ai = true;
    private boolean aj = false;
    private boolean aa = false;
    private HandlerThread br = new HandlerThread("DaemonLogicStepCounter");
    private volatile Handler bp = null;
    private int bb = 0;
    private int as = 0;
    private long t = 0;
    private ISimpleResultCallback ad = null;
    private DeviceClassWatchDog n = null;
    private UploadUtil bm = null;
    private long bi = System.currentTimeMillis();
    private long ao = 0;
    private long r = 0;
    private long bd = 0;
    private boolean al = false;
    private boolean ag = false;
    private AtomicBoolean i = new AtomicBoolean(false);
    private long am = -1;
    private ArrayList<IStepReport> au = new ArrayList<>(16);
    private AtomicBoolean af = new AtomicBoolean(false);
    private List<Integer> ba = null;
    private boolean ac = false;
    private boolean w = false;
    private List<Integer> bk = null;
    private boolean aq = false;
    private boolean z = AuthorizationUtils.c(BaseApplication.getContext());
    private final boolean ae = CommonUtil.bg();
    private BroadcastReceiver u = new BroadcastReceiver() { // from class: com.huawei.health.manager.LogicalStepCounter$1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null && HwWatchFaceApi.ACTION_FOREGROUND_STATUS.equals(intent.getAction())) {
                boolean booleanExtra = intent.getBooleanExtra("isForeground", false);
                LogUtil.a("Step_LSC", "mForegroundStatusChangeReceiver() isForeground: ", Boolean.valueOf(booleanExtra));
                if (this.d.ah == booleanExtra) {
                    return;
                }
                this.d.ah = booleanExtra;
                if (this.d.ah) {
                    ReleaseLogUtil.d("Step_LSC", "mIsForeground = true");
                    this.d.au();
                    if (this.d.bp != null) {
                        this.d.bp.sendEmptyMessageDelayed(1021, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
                    }
                    if (!qgr.b(this.d.s)) {
                        this.d.a(false);
                    }
                    boolean zD = ScreenUtil.d();
                    LogUtil.a("Step_LSC", "isScreenOn", Boolean.valueOf(zD));
                    if (this.d.aq && zD) {
                        this.d.al();
                        return;
                    }
                    return;
                }
                LogicalStepCounter logicalStepCounter = this.d;
                logicalStepCounter.a((List<Integer>) logicalStepCounter.ba);
            }
        }
    };

    private LogicalStepCounter(Context context) {
        this.bj = null;
        this.y = null;
        this.s = null;
        if (context == null) {
            health.compact.a.hwlogsmodel.ReleaseLogUtil.e("Step_LSC", "LogicalStepCounter context is null.");
            this.s = BaseApplication.getContext();
        } else {
            this.s = context;
        }
        this.y = new GoalValue(this.s);
        StepsRecordManager stepsRecordManager = new StepsRecordManager();
        this.bj = stepsRecordManager;
        stepsRecordManager.d();
    }

    public static LogicalStepCounter d(Context context) {
        LogicalStepCounter logicalStepCounter;
        synchronized (d) {
            if (f36613b == null) {
                f36613b = new LogicalStepCounter(context);
            }
            logicalStepCounter = f36613b;
        }
        return logicalStepCounter;
    }

    private void as() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.TIME_TICK");
        intentFilter.addAction("android.intent.action.TIME_SET");
        intentFilter.addAction("com.huawei.health.WIDGET_ENABLE");
        intentFilter.addAction("com.huawei.health.WIDGET_DISABLE");
        intentFilter.addAction("com.huawei.health.WIDGET_FORCE_UPDATE");
        intentFilter.addAction("com.huawei.health.SERVER_TOKEN_INVALIDE");
        intentFilter.addAction("com.huawei.health.start_step_counter");
        intentFilter.addAction("com.huawei.health.check_sensor_state");
        intentFilter.addAction("com.huawei.health.action.ACTION_WEAR_DEVICE_CAPABILITY");
        intentFilter.addAction("com.huawei.health.AUTHORIZATION_CHANGED");
        intentFilter.addAction("com.huawei.health.SYNC_DB_FOR_DEVICE_CHANGE");
        this.o = new DaemonDynamicBroadcastReceiver(this);
        com.huawei.hwlogsmodel.LogUtil.a("Step_LSC", "registerDynamicBroadcastReceiver");
        Context context = this.s;
        if (context != null) {
            BroadcastManagerUtil.d(context, this.o, intentFilter, Consts.d, null);
            e = true;
        }
    }

    private void ay() {
        if (this.s == null || this.o == null || !e) {
            return;
        }
        try {
            this.s.unregisterReceiver(this.o);
        } catch (IllegalArgumentException e2) {
            health.compact.a.hwlogsmodel.ReleaseLogUtil.a("Step_LSC", "Receiver already unregistered ", LogAnonymous.b(e2));
        } finally {
            this.o = null;
            e = false;
        }
    }

    public void b(Intent intent) {
        if (this.bp != null && intent != null) {
            Message messageObtainMessage = this.bp.obtainMessage(1007);
            messageObtainMessage.obj = intent.clone();
            this.bp.sendMessage(messageObtainMessage);
        } else {
            if (!CommonUtil.bu()) {
                ipb.a(2);
            }
            health.compact.a.hwlogsmodel.ReleaseLogUtil.e("Step_LSC", "dealLogicalBroadcastEvent mWorkerHandler null");
        }
    }

    public void e(boolean z) {
        com.huawei.hwlogsmodel.LogUtil.a("Step_LSC", "refreshBrowseModeStatus", Boolean.valueOf(z));
        this.aa = z;
        SharedPerferenceUtils.a(this.s, z);
        if (z) {
            this.bo = 0;
        } else {
            WheelChairStateManager.a().i();
            WheelChairStateManager.a().c();
        }
    }

    public boolean g() {
        return SharedPerferenceUtils.p(this.s);
    }

    public void e(int i) {
        this.as = i;
    }

    public void c(ISimpleResultCallback iSimpleResultCallback) {
        HandlerThread handlerThread = this.br;
        String string = handlerThread == null ? "" : handlerThread.getState().toString();
        health.compact.a.hwlogsmodel.ReleaseLogUtil.e("Step_LSC", "init mWorkThread state:", string);
        try {
            HandlerThread handlerThread2 = this.br;
            if (handlerThread2 == null) {
                health.compact.a.hwlogsmodel.ReleaseLogUtil.e("Step_LSC", "init mWorkThread == null true");
                HandlerThread handlerThread3 = new HandlerThread("DaemonLogicStepCounter");
                this.br = handlerThread3;
                handlerThread3.start();
                ipb.e(1, string);
            } else if (handlerThread2.getState() == Thread.State.NEW) {
                health.compact.a.hwlogsmodel.ReleaseLogUtil.d("Step_LSC", "init mWorkThread state new");
                this.br.start();
            } else if (!this.br.isAlive()) {
                health.compact.a.hwlogsmodel.ReleaseLogUtil.d("Step_LSC", "init mWorkThread state no isAlive");
                HandlerThread handlerThread4 = new HandlerThread("DaemonLogicStepCounter");
                this.br = handlerThread4;
                handlerThread4.start();
                ipb.e(4, string);
            } else {
                ipb.e(6, string);
                health.compact.a.hwlogsmodel.ReleaseLogUtil.d("Step_LSC", "init mWorkThread isAlive state");
                return;
            }
        } catch (IllegalThreadStateException e2) {
            ipb.e(3, string);
            health.compact.a.hwlogsmodel.ReleaseLogUtil.e("Step_LSC", "WorkThread.start illegalThreadStateException:", string, LogAnonymous.b(e2));
        }
        Looper looper = this.br.getLooper();
        if (looper == null) {
            health.compact.a.hwlogsmodel.ReleaseLogUtil.e("Step_LSC", "init looper == null", string);
            ipb.e(5, string);
        }
        final Looper looper2 = (Looper) Objects.requireNonNull(looper);
        this.bp = new Handler(looper2) { // from class: com.huawei.health.manager.LogicalStepCounter$2
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (this.d.e(message)) {
                    return;
                }
                super.handleMessage(message);
            }
        };
        Message messageObtainMessage = this.bp.obtainMessage();
        messageObtainMessage.what = 1018;
        messageObtainMessage.obj = iSimpleResultCallback;
        this.bp.sendMessage(messageObtainMessage);
    }

    private void f(Message message) {
        this.ar = ProcessAliveMonitor.c(this.s);
        if (!(message.obj instanceof ISimpleResultCallback)) {
            health.compact.a.hwlogsmodel.ReleaseLogUtil.e("Step_LSC", "processInit ", "msg.obj invalid type");
            return;
        }
        ISimpleResultCallback iSimpleResultCallback = (ISimpleResultCallback) message.obj;
        Context context = this.s;
        if (context != null) {
            this.am = SharedPerferenceUtils.o(context);
            com.huawei.hwlogsmodel.LogUtil.a("Step_LSC", "init ....", iSimpleResultCallback);
            this.ad = iSimpleResultCallback;
            UserInfo.d(this.s);
            this.bn = UserInfo.a();
        }
        this.bm = new UploadUtil(this.s, this.q, this.bp);
        u();
        this.aa = Utils.i();
        f36614c = StepCounterSupport.a(this.s);
        SharedPerferenceUtils.a(this.s, this.aa);
        health.compact.a.hwlogsmodel.ReleaseLogUtil.d("Step_LSC", "init mIsBrowseMode", Boolean.valueOf(this.aa), " sIsRemoveReduceClass ", Boolean.valueOf(f36614c));
        as();
        ap();
        if (AuthorizationUtils.c(this.s) && CommonUtil.q(BaseApplication.getContext())) {
            au();
        } else {
            health.compact.a.hwlogsmodel.ReleaseLogUtil.e("Step_LSC", "subscribeSportData hasAuth or appOnForeground false");
        }
        BroadcastManager.d(this.u);
        boolean zX = x();
        DistanceManager distanceManagerA = DistanceManager.a(this.s);
        this.p = distanceManagerA;
        this.m = CaloriesManager.b(this.s, distanceManagerA, this.v);
        TotalDetailStepsCacheBean totalDetailStepsCacheBeanU = SharedPerferenceUtils.u(this.s);
        if (totalDetailStepsCacheBeanU != null && lsl.c(totalDetailStepsCacheBeanU.h(), System.currentTimeMillis())) {
            this.ay = totalDetailStepsCacheBeanU.d();
            this.aw = totalDetailStepsCacheBeanU.a();
        }
        if (this.bp != null) {
            this.bp.sendEmptyMessage(1008);
        }
        if (!zX) {
            health.compact.a.hwlogsmodel.ReleaseLogUtil.d("Step_LSC", "isInitStepCounterStatus false");
            return;
        }
        ijx.a().e();
        ijx.a().c();
        if (this.bp != null) {
            this.bp.sendEmptyMessage(1006);
            this.bp.sendEmptyMessageDelayed(101010, 10000L);
        }
    }

    private void u() {
        String[] strArrI;
        Context context = this.s;
        if (context == null || (strArrI = SharedPerferenceUtils.i(context)) == null) {
            return;
        }
        try {
            if (strArrI.length < 2 || !lsl.c(System.currentTimeMillis(), Long.parseLong(strArrI[0]))) {
                return;
            }
            this.j = Double.parseDouble(strArrI[1]);
        } catch (NumberFormatException e2) {
            com.huawei.hwlogsmodel.LogUtil.j("Step_LSC", "initDiffAltitudefromFile ", e2.getMessage());
        }
    }

    private void b(int i) {
        Context context = this.s;
        if (context != null) {
            this.j += (double) (i - this.av);
            SharedPerferenceUtils.e(context, System.currentTimeMillis(), this.j);
            com.huawei.hwlogsmodel.LogUtil.a("Step_LSC", "saveDiffAltitudeToFile total db", LogAnonymous.d(i), " mAltitudeDiff ", LogAnonymous.d((int) this.j));
        }
    }

    private boolean x() {
        MockStepHelper mockStepHelper;
        this.bf = new StepCounterManager(this.s);
        boolean zC = MockStepHelper.c(this.s);
        com.huawei.hwlogsmodel.LogUtil.a("Step_LSC", "initStepCounter isSupportMockStepCounter = ", Boolean.valueOf(zC));
        if (zC) {
            mockStepHelper = new MockStepHelper(this.s);
            mockStepHelper.b();
            this.be = this.bf.b(true);
            ExtendStepCounter extendStepCounterE = this.bf.e(true);
            this.x = extendStepCounterE;
            mockStepHelper.c(this.be, extendStepCounterE);
        } else {
            this.be = this.bf.a();
            this.x = this.bf.e(false);
            mockStepHelper = null;
        }
        if (StepCounterSupport.j(this.s)) {
            this.aj = true;
            this.v = new ExtendStepDataManager(this.s);
            this.n = new DeviceClassWatchDog(this.s);
            this.x.init(this.ad);
        } else if (mockStepHelper != null) {
            if (mockStepHelper.c()) {
                this.ad.onSuccess(null);
            }
        } else if (StepCounterSupport.i(this.s)) {
            this.ad.onSuccess(null);
        } else {
            com.huawei.hwlogsmodel.LogUtil.a("Step_LSC", "do nothing");
        }
        StandStepDataManager standStepDataManager = new StandStepDataManager();
        this.bg = standStepDataManager;
        standStepDataManager.d(this.as);
        return this.be != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(Message message) {
        if (message == null) {
            return false;
        }
        boolean zA = a(message);
        return !zA ? b(message) : zA;
    }

    private boolean a(Message message) {
        int i = message.what;
        if (i == 1000) {
            n(message);
            return true;
        }
        if (i == 1001) {
            c(message);
            return true;
        }
        if (i == 1003) {
            ah();
            return true;
        }
        if (i == 1004) {
            d(message);
            return true;
        }
        if (i == 1010) {
            ah();
            return true;
        }
        if (i == 1016) {
            i(message);
            return true;
        }
        if (i != 1018) {
            return false;
        }
        f(message);
        return true;
    }

    private boolean b(Message message) {
        int i = message.what;
        if (i == 1017) {
            h(message);
            return true;
        }
        if (i != 101010) {
            switch (i) {
                case 1005:
                    l(message);
                    return true;
                case 1006:
                    j(message);
                    return true;
                case 1007:
                    if (!(message.obj instanceof Intent)) {
                        return false;
                    }
                    a((Intent) message.obj);
                    return true;
                case 1008:
                    v();
                    return true;
                default:
                    switch (i) {
                        case 1011:
                            ag();
                            return true;
                        case 1012:
                            com.huawei.hwlogsmodel.LogUtil.a("Step_LSC", "sync with db");
                            e(new ISimpleResultCallback(this) { // from class: com.huawei.health.manager.LogicalStepCounter$FlushCallbackInter

                                /* JADX INFO: renamed from: c, reason: collision with root package name */
                                private WeakReference<LogicalStepCounter> f8055c;

                                {
                                    this.f8055c = null;
                                    this.f8055c = new WeakReference<>(this);
                                }

                                @Override // com.huawei.health.icommon.ISimpleResultCallback
                                public void onSuccess(Bundle bundle) {
                                    LogicalStepCounter logicalStepCounter;
                                    LogUtil.a("Step_LSC", "FlushCallbackInter onSuccess.");
                                    WeakReference<LogicalStepCounter> weakReference = this.f8055c;
                                    if (weakReference == null || (logicalStepCounter = weakReference.get()) == null) {
                                        return;
                                    }
                                    logicalStepCounter.r();
                                }

                                @Override // com.huawei.health.icommon.ISimpleResultCallback
                                public void onFailed(Bundle bundle) {
                                    LogicalStepCounter logicalStepCounter;
                                    ReleaseLogUtil.e("Step_LSC", "FlushCallbackInter onFailed, continue work");
                                    WeakReference<LogicalStepCounter> weakReference = this.f8055c;
                                    if (weakReference == null || (logicalStepCounter = weakReference.get()) == null) {
                                        return;
                                    }
                                    logicalStepCounter.r();
                                }
                            }, false, false);
                            return true;
                        case 1013:
                            al();
                            return true;
                        default:
                            switch (i) {
                                case 1019:
                                    aj();
                                    return true;
                                case 1020:
                                    g(message);
                                    return true;
                                case 1021:
                                    am();
                                    return true;
                                case 1022:
                                    d(message.arg1, message.arg2, ((Long) message.obj).longValue());
                                    return true;
                                default:
                                    return false;
                            }
                    }
            }
        }
        ijx.a().d();
        return true;
    }

    private void aj() {
        com.huawei.hwlogsmodel.LogUtil.a("Step_LSC", " processSportIntensity ");
        SportIntensity.a(this.s).b(3);
    }

    private void i(Message message) {
        com.huawei.hwlogsmodel.LogUtil.a("Step_LSC", "user info change");
        Object obj = message.obj;
        Bundle bundle = obj instanceof Bundle ? (Bundle) obj : null;
        if (bundle == null) {
            health.compact.a.hwlogsmodel.ReleaseLogUtil.e("Step_LSC", "processSetUserInfoByMessage userInfo is null.");
            return;
        }
        c(false);
        e((ISimpleResultCallback) null, false, true);
        this.bn.b(bundle.get("weight") != null ? ((Float) bundle.get("weight")).floatValue() : this.bn.j(), bundle.get("height") != null ? ((Float) bundle.get("height")).floatValue() : this.bn.c(), bundle.get("ownerId") != null ? ((Integer) bundle.get("ownerId")).intValue() : this.bn.d(), bundle.get(CommonConstant.KEY_GENDER) != null ? ((Integer) bundle.get(CommonConstant.KEY_GENDER)).intValue() : this.bn.b(), bundle.get("age") != null ? ((Integer) bundle.get("age")).intValue() : this.bn.e());
    }

    public HwHealthSensorEventListener c() {
        return this.be;
    }

    private void n(Message message) {
        if (this.i.get()) {
            health.compact.a.hwlogsmodel.ReleaseLogUtil.e("Step_LSC", "onStandStepChanged phone shutdown, return");
            return;
        }
        if (message.obj == null) {
            health.compact.a.hwlogsmodel.ReleaseLogUtil.e("Step_LSC", "processStandDealStepDate msg.obj is null.");
            return;
        }
        long jLongValue = ((Long) message.obj).longValue();
        int i = message.arg1;
        int i2 = message.arg2;
        d(i);
        c(i);
        this.bh = i;
        if (!this.af.get()) {
            Object obj = f36612a;
            synchronized (obj) {
                this.af.set(true);
                obj.notifyAll();
            }
        }
        isProcessNewDayReport(false);
        long jA = com.huawei.hwlogsmodel.LogUtil.a(5000, f);
        if (jA != -1) {
            health.compact.a.hwlogsmodel.ReleaseLogUtil.d("Step_LSC", npt.d("onSStepChgd ", Integer.valueOf(i), " se ", Integer.valueOf(i2)));
            f = jA;
        }
        j(i);
        a(i);
        g(i);
        if (this.bm.b(i)) {
            com.huawei.hwlogsmodel.LogUtil.a("Step_LSC", "flushTempCacheToDB by stand");
            b((ISimpleResultCallback) null);
        }
        StandStepDataManager standStepDataManager = this.bg;
        if (standStepDataManager != null) {
            standStepDataManager.e(jLongValue, i);
            com.huawei.hwlogsmodel.LogUtil.d("Step_LSC", "mPreDaemonSteps :", Integer.valueOf(this.as));
            if (this.bg.a() > 0) {
                this.bg.d(0);
            }
        }
        if (this.bp != null) {
            this.bp.sendEmptyMessageDelayed(1006, 300L);
        }
    }

    private void j(int i) {
        if (System.currentTimeMillis() - g > 86400000) {
            f36614c = StepCounterSupport.a(this.s);
            g = System.currentTimeMillis();
        }
        if (f36614c) {
            return;
        }
        long jA = com.huawei.hwlogsmodel.LogUtil.a(2000, h);
        if (jA != -1) {
            h(i);
            h = jA;
        }
    }

    private void d(int i) {
        int i2;
        if (this.ac || (i2 = this.bh) == 0 || i <= i2) {
            return;
        }
        health.compact.a.hwlogsmodel.ReleaseLogUtil.d("Step_LSC", "processStandDealStepDate initModule enter ");
        SportIntensity.a(this.s).a();
        HiHealthNativeApi.a(this.s).subscribeHiHealthData(4, new HiSubscribeListener(this) { // from class: com.huawei.health.manager.LogicalStepCounter$SportIntensityCallback

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private WeakReference<LogicalStepCounter> f8059b;

            {
                this.f8059b = null;
                this.f8059b = new WeakReference<>(this);
            }

            @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
            public void onResult(List<Integer> list, List<Integer> list2) {
                LogicalStepCounter logicalStepCounter = this.f8059b.get();
                if (logicalStepCounter == null) {
                    LogUtil.e("Step_LSC", "logicalStepCounter == null");
                } else if (njy.b(list)) {
                    logicalStepCounter.bk = list;
                }
            }

            @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
            public void onChange(int i3, HiHealthClient hiHealthClient, String str, HiHealthData hiHealthData, long j) {
                ReleaseLogUtil.d("Step_LSC", "SportIntensityCallback ");
                WeakReference<LogicalStepCounter> weakReference = this.f8059b;
                if (weakReference != null) {
                    LogicalStepCounter logicalStepCounter = weakReference.get();
                    if (logicalStepCounter == null || logicalStepCounter.bp == null) {
                        return;
                    }
                    logicalStepCounter.bp.sendEmptyMessage(1019);
                    return;
                }
                ReleaseLogUtil.e("Step_LSC", "mLogicalStepCounterRef == null");
            }
        });
        this.ac = true;
    }

    private void c(int i) {
        int i2;
        if (this.w || (i2 = this.bh) == 0 || i <= i2) {
            return;
        }
        health.compact.a.hwlogsmodel.ReleaseLogUtil.d("Step_LSC", "processStandDealStepDate refreshMotion enter ");
        a(false);
        this.w = true;
    }

    private void d(Message message) {
        Object obj = message.obj;
        LogicalStepCounter$ExtendStepMsg logicalStepCounter$ExtendStepMsg = obj instanceof LogicalStepCounter$ExtendStepMsg ? (LogicalStepCounter$ExtendStepMsg) obj : null;
        if (logicalStepCounter$ExtendStepMsg != null && this.v != null) {
            new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒 E ").format(new Date(logicalStepCounter$ExtendStepMsg.f8052a));
            this.v.c(this.bn.d(), logicalStepCounter$ExtendStepMsg.f8052a, logicalStepCounter$ExtendStepMsg.f8053b, logicalStepCounter$ExtendStepMsg.d, logicalStepCounter$ExtendStepMsg.f8054c);
        }
        if (this.bp == null || this.bp.hasMessages(1006)) {
            return;
        }
        this.bp.sendEmptyMessageDelayed(1006, 300L);
    }

    private void ah() {
        ExtendStepDataManager extendStepDataManager = this.v;
        if (extendStepDataManager != null) {
            extendStepDataManager.e();
        }
    }

    private void l(Message message) {
        if (message.arg1 == 100) {
            ax();
        } else if (message.arg1 == 101) {
            aw();
        } else {
            health.compact.a.hwlogsmodel.ReleaseLogUtil.e("Step_LSC", "processStepCounterSateChange default.");
        }
    }

    private void c(Message message) {
        StandStepDataManager standStepDataManager = this.bg;
        if (standStepDataManager != null && standStepDataManager.e() < getCacheTodaySteps()) {
            r();
        } else {
            c(false);
        }
        if (message.obj instanceof LogicalStepCounter$FlushDbMsg) {
            e(((LogicalStepCounter$FlushDbMsg) message.obj).f8056b, false, false);
        } else {
            e((ISimpleResultCallback) null, false, false);
        }
    }

    public void d(Map<String, Object> map) {
        SleepDataDbUtil.b(this.s, map);
    }

    public void r() {
        if (this.bp != null && ScreenUtil.d()) {
            com.huawei.hwlogsmodel.LogUtil.a("Step_LSC", "ScreenON ,MSG_SYNC_WITH_DB");
            ar();
            this.bp.sendEmptyMessage(1013);
            this.am = -1L;
            SharedPerferenceUtils.b(this.s, -1L);
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.am = jCurrentTimeMillis;
        SharedPerferenceUtils.b(this.s, jCurrentTimeMillis);
        com.huawei.hwlogsmodel.LogUtil.a("Step_LSC", "ScreenOFF ,drop this time MSG_SYNC_WITH_DB");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void al() {
        this.aq = false;
        ExtendStepCounter extendStepCounter = this.x;
        if ((extendStepCounter instanceof MidwareStepCounter) && !((MidwareStepCounter) extendStepCounter).e() && this.bp != null) {
            this.bp.sendEmptyMessageDelayed(1013, 500L);
            return;
        }
        com.huawei.hwlogsmodel.LogUtil.a("Step_LSC", "processSyncStepsWithHiHealth times check");
        HiHealthNativeApi.a(this.s).aggregateHiHealthData(HiHealthHelper.c(), new LogicalStepCounter$ReadStaticDealCallback(this, 1017));
        if (!CommonUtil.bh()) {
            w();
        }
        this.y.a();
    }

    private void w() {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        long jCurrentTimeMillis = System.currentTimeMillis();
        hiDataReadOption.setTimeInterval(lsl.r(jCurrentTimeMillis), lsl.c(jCurrentTimeMillis));
        hiDataReadOption.setType(new int[]{901});
        HiHealthNativeApi.a(this.s).readHiHealthData(hiDataReadOption, new HiDataReadResultListener(this) { // from class: com.huawei.health.manager.LogicalStepCounter$ReadDeviceStepCallback

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private WeakReference<LogicalStepCounter> f8057b;

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
            }

            {
                this.f8057b = null;
                this.f8057b = new WeakReference<>(this);
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                LogUtil.a("Step_LSC", "getStepCounterDetails, errorCode = ", Integer.valueOf(i), " data ", obj != null ? obj.toString() : null);
                if (i != 0) {
                    LogUtil.e("Step_LSC", "Error query step counter, errorCode = ", Integer.valueOf(i));
                    return;
                }
                List<HiHealthData> list = (List) ((SparseArray) obj).get(901);
                if (njy.e(list)) {
                    ReleaseLogUtil.d("Step_LSC", "ReadDeviceStepCallback hiHealthDataList isEmpty");
                    e(0);
                    return;
                }
                for (HiHealthData hiHealthData : list) {
                    if (hiHealthData != null && ipa.e(hiHealthData.getString("device_uniquecode"))) {
                        e((int) hiHealthData.getFloatValue());
                    }
                }
            }

            private void e(int i) {
                LogicalStepCounter logicalStepCounter = this.f8057b.get();
                if (logicalStepCounter == null || logicalStepCounter.bg == null) {
                    return;
                }
                logicalStepCounter.bg.e(i);
            }
        });
    }

    private void e(int i, int i2, long j) {
        c(false);
        StandStepDataManager standStepDataManager = this.bg;
        if (standStepDataManager != null) {
            if (standStepDataManager.e() == i) {
                if (this.bg.c(i)) {
                    ar();
                    return;
                }
                return;
            }
            if (this.be != null && !this.ae && i > this.bg.e() && this.bp != null) {
                this.be.b();
                if (this.bp.hasMessages(1022)) {
                    this.bp.removeMessages(1022);
                }
                health.compact.a.hwlogsmodel.ReleaseLogUtil.d("Step_LSC", "syncWithHiHealth send message MSG_SYNC_DIFF_DATA_DELAY");
                Message messageObtainMessage = this.bp.obtainMessage(1022);
                messageObtainMessage.arg1 = i;
                messageObtainMessage.arg2 = i2;
                messageObtainMessage.obj = Long.valueOf(j);
                this.bp.sendMessageDelayed(messageObtainMessage, 500L);
                return;
            }
            if (!lsl.c(j, System.currentTimeMillis())) {
                health.compact.a.hwlogsmodel.ReleaseLogUtil.d("Step_LSC", "syncWithHiHealth data not same day,return dataStartTime:", Long.valueOf(j));
            } else if (this.bg.c(i)) {
                this.az = i2;
            } else {
                health.compact.a.hwlogsmodel.ReleaseLogUtil.d("Step_LSC", "syncWithHiHealth localTotalSteps > dBTotalSteps");
                p();
            }
        }
    }

    private void d(int i, int i2, long j) {
        if (!lsl.c(j, System.currentTimeMillis())) {
            health.compact.a.hwlogsmodel.ReleaseLogUtil.d("Step_LSC", "calculateDiffForDb data not same day,return dataStartTime:", Long.valueOf(j));
            return;
        }
        StandStepDataManager standStepDataManager = this.bg;
        if (standStepDataManager == null || !standStepDataManager.c(i)) {
            return;
        }
        this.az = i2;
        isProcessNewDayReport(false);
    }

    private void a(Intent intent) {
        if (intent != null) {
            try {
                String action = intent.getAction();
                com.huawei.hwlogsmodel.LogUtil.a("Step_LSC", "processHandleBroadcastAction action:", action);
                if ("android.intent.action.SCREEN_ON".equals(action)) {
                    aa();
                    return;
                }
                if ("android.intent.action.TIME_TICK".equals(action)) {
                    health.compact.a.hwlogsmodel.ReleaseLogUtil.d("Step_LSC", "ACTION_TIME_TICK");
                    ad();
                    return;
                }
                if ("android.intent.action.ACTION_SHUTDOWN".equals(action)) {
                    health.compact.a.hwlogsmodel.ReleaseLogUtil.d("Step_LSC", "ACTION_SHUTDOWN");
                    af();
                    return;
                }
                if ("com.huawei.health.WIDGET_FORCE_UPDATE".equals(action)) {
                    health.compact.a.hwlogsmodel.ReleaseLogUtil.d("Step_LSC", "ACTION_HEALTH_WIDGET_FORCE_UPDATE");
                    ac();
                    return;
                }
                if ("com.huawei.hihealth.action_today_sport_data_refresh".equals(action)) {
                    e(intent);
                    return;
                }
                if ("android.intent.action.TIME_SET".equals(action)) {
                    an();
                    return;
                }
                if ("com.huawei.health.action.UPLOAD_STATICS".equals(action)) {
                    health.compact.a.hwlogsmodel.ReleaseLogUtil.d("Step_LSC", "ACTION_RESTART_SENSOR_MSG");
                    c(intent);
                    return;
                }
                if ("com.huawei.health.SERVER_TOKEN_INVALIDE".equals(action)) {
                    health.compact.a.hwlogsmodel.ReleaseLogUtil.d("Step_LSC", "ACTION_HEALTH_SERVER_TOKEN_INVALIDE");
                    HuaweiServerTokenNotification.d(this.s);
                    return;
                }
                if ("event_manual_ui".equals(action)) {
                    SportIntensity.a(this.s).b(4);
                    return;
                }
                if ("com.huawei.health.action.ACTION_WEAR_DEVICE_CAPABILITY".equals(action)) {
                    health.compact.a.hwlogsmodel.ReleaseLogUtil.d("Step_LSC", "ACTION_WEAR_DEVICE_CAPABILITY");
                    d(intent);
                    return;
                }
                if ("com.huawei.health.start_step_counter".equals(action)) {
                    health.compact.a.hwlogsmodel.ReleaseLogUtil.d("Step_LSC", "START_STEP_COUNTER");
                    lsb.d().e(20220112);
                    if (StepCounterSupportUtils.g(this.s)) {
                        n();
                        return;
                    } else {
                        ak();
                        return;
                    }
                }
                if ("com.huawei.health.check_sensor_state".equals(action)) {
                    health.compact.a.hwlogsmodel.ReleaseLogUtil.d("Step_LSC", "CHECK_SENSOR_STATE");
                    s();
                    return;
                }
                if ("com.huawei.health.AUTHORIZATION_CHANGED".equals(action)) {
                    z();
                    return;
                }
                if (!"com.huawei.health.SYNC_DB_FOR_DEVICE_CHANGE".equals(action)) {
                    com.huawei.hwlogsmodel.LogUtil.j("Step_LSC", "processHandleBroadcastAction intent does not match");
                } else if (this.ah && ScreenUtil.d()) {
                    al();
                } else {
                    this.aq = true;
                }
            } catch (BadParcelableException e2) {
                com.huawei.hwlogsmodel.LogUtil.j("Step_LSC", e2.getMessage());
            }
        }
    }

    private void z() {
        boolean zC = AuthorizationUtils.c(this.s);
        this.z = zC;
        health.compact.a.hwlogsmodel.ReleaseLogUtil.d("Step_LSC", "processAuthChanged AuthorizationStatus = ", Boolean.valueOf(zC));
        if (zC) {
            if (StepCounterSupportUtils.d(this.s)) {
                n();
                StepCounterSupport.e(this.s, -1);
            }
            v();
            a(this.ba);
            au();
            WheelChairStateManager.a().i();
            WheelChairStateManager.a().c();
            return;
        }
        if (StepCounterSupportUtils.d(this.s)) {
            t();
        }
    }

    public boolean b() {
        return this.z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void au() {
        ArrayList<Integer> arrayList = new ArrayList<>(16);
        this.bl = arrayList;
        arrayList.add(1);
        if (!qgr.b(this.s)) {
            this.bl.add(Integer.valueOf(DicDataTypeUtil.DataType.ACTIVE_HOUR.value()));
            this.bl.add(103);
        }
        com.huawei.hwlogsmodel.LogUtil.a("Step_LSC", "mTypeList is ", this.bl);
        HiHealthNativeApi.a(this.s).subscribeHiHealthData(this.bl, new HiSubscribeListener(this) { // from class: com.huawei.health.manager.LogicalStepCounter$SportDataCallback

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private WeakReference<LogicalStepCounter> f8058b;

            {
                this.f8058b = new WeakReference<>(this);
            }

            @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
            public void onResult(List<Integer> list, List<Integer> list2) {
                LogicalStepCounter logicalStepCounter = this.f8058b.get();
                if (logicalStepCounter == null) {
                    LogUtil.j("Step_LSC", "onResult logicalStepCounter == null");
                } else {
                    if (njy.e(list)) {
                        return;
                    }
                    ReleaseLogUtil.d("Step_LSC", "SportDataCallback success");
                    logicalStepCounter.ba = list;
                }
            }

            @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
            public void onChange(int i, HiHealthClient hiHealthClient, String str, HiHealthData hiHealthData, long j) {
                LogUtil.a("Step_LSC", "SportIntensityCallback ", hiHealthData == null ? null : hiHealthData.toString(), " type ", Integer.valueOf(i), " client ", hiHealthClient != null ? hiHealthClient.getHuid() : null, "changeKey ", str, " time ", Long.valueOf(j));
                if (i == 1) {
                    LogicalStepCounter logicalStepCounter = this.f8058b.get();
                    if (logicalStepCounter != null) {
                        if (logicalStepCounter.bp.hasMessages(1021)) {
                            return;
                        }
                        logicalStepCounter.bp.sendEmptyMessageDelayed(1021, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
                        return;
                    }
                    LogUtil.j("Step_LSC", "logicalStepCounter == null");
                    return;
                }
                if (i == DicDataTypeUtil.DataType.ACTIVE_HOUR.value()) {
                    LogicalStepCounter logicalStepCounter2 = this.f8058b.get();
                    if (logicalStepCounter2 != null) {
                        logicalStepCounter2.am();
                        return;
                    } else {
                        LogUtil.j("Step_LSC", "logicalStepCounter == null");
                        return;
                    }
                }
                if (i == 103) {
                    LogicalStepCounter logicalStepCounter3 = this.f8058b.get();
                    if (logicalStepCounter3 == null) {
                        LogUtil.j("Step_LSC", "logicalStepCounter is null");
                        return;
                    }
                    if ("900200006".equals(str) || "900200008".equals(str) || "900200009".equals(str) || "900200007".equals(str)) {
                        logicalStepCounter3.o();
                        logicalStepCounter3.a(true);
                        logicalStepCounter3.a(str);
                    } else if ("900200004".equals(str) || "900200010".equals(str) || "900200011".equals(str)) {
                        logicalStepCounter3.a(str);
                        logicalStepCounter3.e(str);
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str) {
        if ("900200004".equals(str)) {
            SharedPreferenceManager.a("fitness_step_module_id", "active_hours_set_alert_toggle", "1".equals(ikx.a(str)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void am() {
        HiHealthNativeApi.a(this.s).aggregateHiHealthData(HiHealthHelper.c(), new LogicalStepCounter$ReadStaticDealCallback(this, 1020));
    }

    private void aa() {
        ae();
        ThirdLoginDataStorageUtil.getAccessTokenFromDb();
        av();
        ScreenOnStatisticsUtil.b(this.s);
    }

    private void ad() {
        ai();
        if (isProcessNewDayReport(false)) {
            SportIntensityUtil.c();
        }
        ab();
        q();
        ao();
    }

    private void ao() {
        if (System.currentTimeMillis() - SharedPreferenceManager.d("MODULE_DEAMON_SERVER", "KEY_BI_STEP_NOTIFICATION", 0L) <= 86400000) {
            return;
        }
        SharedPreferenceManager.c("MODULE_DEAMON_SERVER", "KEY_BI_STEP_NOTIFICATION", System.currentTimeMillis());
        ipb.d(SharedPerferenceUtils.r(this.s));
    }

    private void ak() {
        if (!StepCounterSupportUtils.b(this.s)) {
            health.compact.a.hwlogsmodel.ReleaseLogUtil.d("Step_LSC", " processStartStepCounter failed with cant step counter.");
            return;
        }
        StandStepCounter standStepCounter = this.be;
        if (standStepCounter != null) {
            standStepCounter.a();
        }
    }

    private void c(Intent intent) {
        String stringExtra = intent.getStringExtra("extra_user_intent");
        if (stringExtra != null) {
            com.huawei.hwlogsmodel.LogUtil.a("Step_LSC", "ACTION_RESTART_SENSOR_MSG userIntent:", stringExtra);
            StandStepCounter standStepCounter = this.be;
            if (standStepCounter != null) {
                standStepCounter.b();
            }
            if ("extra_user_intent_pre_alarm".equals(stringExtra)) {
                p();
            }
        }
    }

    private void d(Intent intent) {
        boolean booleanExtra = intent.getBooleanExtra("WEAR_DEVICE_CAPBILITY", false);
        String[] strArrAc = SharedPerferenceUtils.ac(this.s);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (strArrAc != null) {
            try {
                if (strArrAc.length <= 0 || lsl.c(jCurrentTimeMillis, Long.parseLong(strArrAc[0]))) {
                    return;
                }
                com.huawei.hwlogsmodel.LogUtil.a("Step_LSC", "processWearDeviceCapability wearDeviceCapability ", strArrAc);
                SharedPerferenceUtils.a(this.s, booleanExtra, jCurrentTimeMillis);
            } catch (NumberFormatException e2) {
                com.huawei.hwlogsmodel.LogUtil.j("Step_LSC", "processWearDeviceCapability Exception = ", e2.getMessage());
            }
        }
    }

    private void ac() {
        if (this.bp != null) {
            this.bp.sendMessage(this.bp.obtainMessage(1006));
        }
    }

    private void e(Intent intent) {
        int intExtra = intent.getIntExtra("refresh_type", 0);
        com.huawei.hwlogsmodel.LogUtil.a("Step_LSC", "ACTION_SYNC_WITH_DB refreshType", Integer.valueOf(intExtra));
        if (intExtra == 0) {
            if (this.bp != null) {
                this.bp.sendMessage(this.bp.obtainMessage(1012));
                y();
                return;
            }
            return;
        }
        if (intExtra == 2) {
            if (this.bp != null) {
                this.bp.sendMessage(this.bp.obtainMessage(1012));
                return;
            }
            return;
        }
        if (intExtra == 5) {
            if (this.bp != null) {
                y();
            }
        } else {
            if (intExtra == 7) {
                Intent intent2 = new Intent("DaemonService_LocalBroadcast");
                intent2.setPackage(this.s.getPackageName());
                intent2.putExtra("refresh_type", 7);
                LocalBroadcastManager.getInstance().sendBroadcast(intent2);
                return;
            }
            com.huawei.hwlogsmodel.LogUtil.j("Step_LSC", "ACTION_SYNC_WITH_DB no refreshType");
        }
    }

    private void an() {
        if (lsl.c(this.bi, System.currentTimeMillis())) {
            return;
        }
        e((ISimpleResultCallback) null, true, false);
        ExtendStepDataManager extendStepDataManager = this.v;
        if (extendStepDataManager != null) {
            extendStepDataManager.d();
        }
        isProcessNewDayReport(true);
        r();
    }

    private void ae() {
        StandStepCounter standStepCounter = this.be;
        if (standStepCounter != null) {
            standStepCounter.e();
        }
        com.huawei.hwlogsmodel.LogUtil.a("Step_LSC", "processScreenOn :", Long.valueOf(this.am), Long.valueOf(System.currentTimeMillis()));
        long j = this.am;
        if (j != -1 && j <= System.currentTimeMillis() && this.bp != null) {
            this.am = -1L;
            if (this.bp.hasMessages(1012)) {
                this.bp.removeMessages(1012);
            }
            this.bp.sendEmptyMessageDelayed(1012, 1000L);
        }
        if (!isProcessNewDayReport(false) && this.bp != null) {
            Message messageObtainMessage = this.bp.obtainMessage(1006);
            messageObtainMessage.arg1 = 200;
            messageObtainMessage.arg2 = 201;
            this.bp.sendMessage(messageObtainMessage);
        }
        HealthFaDataExtendHelper.d().b();
        s();
    }

    private void s() {
        if (StepCounterSupportUtils.g(this.s)) {
            if (StandStepCounter.d() || MidwareStepCounter.d()) {
                return;
            }
            boolean z = ContextCompat.checkSelfPermission(this.s, "android.permission.ACTIVITY_RECOGNITION") == 0;
            health.compact.a.hwlogsmodel.ReleaseLogUtil.d("Step_LSC", " isModelControlledByPermission permission is granted ", Boolean.valueOf(z));
            if (z) {
                n();
                return;
            }
            return;
        }
        if (StandStepCounter.d()) {
            com.huawei.hwlogsmodel.LogUtil.a("Step_LSC", "sensor register successfully");
            return;
        }
        try {
            boolean z2 = ContextCompat.checkSelfPermission(this.s, "android.permission.ACTIVITY_RECOGNITION") == 0;
            com.huawei.hwlogsmodel.LogUtil.a("Step_LSC", " permission is granted ", Boolean.valueOf(z2));
            if (z2) {
                ak();
            }
        } catch (SecurityException unused) {
            com.huawei.hwlogsmodel.LogUtil.j("Step_LSC", "checkRegisterSensor SecurityException ");
        }
    }

    private void af() {
        this.i.set(true);
        if (this.bp != null) {
            this.bp.sendEmptyMessage(1003);
            this.bp.sendEmptyMessage(1012);
        }
        StandStepDataManager standStepDataManager = this.bg;
        if (standStepDataManager != null) {
            standStepDataManager.d(this.bq, this.az, this.k, this.ay, this.aw);
        }
    }

    private void h(Message message) {
        if (!njy.b(message.obj, HiHealthData.class)) {
            health.compact.a.hwlogsmodel.ReleaseLogUtil.e("Step_LSC", "processReadCallback ", "msg.obj invalid type");
            return;
        }
        List list = (List) message.obj;
        if (list.size() == 0) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        HiHealthData hiHealthData = (HiHealthData) list.get(0);
        long startTime = hiHealthData.getStartTime();
        if (!lsl.c(startTime, jCurrentTimeMillis)) {
            health.compact.a.hwlogsmodel.ReleaseLogUtil.e("Step_LSC", "data not same day,return dataStartTime:", Long.valueOf(startTime));
            return;
        }
        int i = hiHealthData.getInt("run_step");
        int i2 = hiHealthData.getInt(ParsedFieldTag.STEP_SUM);
        int i3 = hiHealthData.getInt("calorie_sum");
        int i4 = hiHealthData.getInt("altitude_sum");
        int i5 = hiHealthData.getInt("distance_sum");
        int i6 = hiHealthData.getInt("intensity_time");
        int i7 = hiHealthData.getInt("active_hours");
        int i8 = hiHealthData.getInt("wheel_chair");
        if (this.bg != null) {
            health.compact.a.hwlogsmodel.ReleaseLogUtil.d("Step_LSC", "procRCallback ", Integer.valueOf(i2), " insity ", Integer.valueOf(i6), " ActHs ", Integer.valueOf(i7), "totalCalories ", Integer.valueOf(i3), "wc:", Integer.valueOf(i8));
            e(i2, i, startTime);
            this.p.a(i2, i5);
            this.m.d(jCurrentTimeMillis, i2, i3);
            this.ay = i6;
            this.aw = Math.min(i7, 24);
            this.bo = i8;
            b(i4);
            ar();
            this.bg.d(System.currentTimeMillis());
        }
    }

    private void g(Message message) {
        if (!njy.b(message.obj, HiHealthData.class)) {
            health.compact.a.hwlogsmodel.ReleaseLogUtil.e("Step_LSC", "processReadCallback ", "msg.obj invalid type");
            return;
        }
        List list = (List) message.obj;
        if (list.size() == 0) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        HiHealthData hiHealthData = (HiHealthData) list.get(0);
        if (!lsl.c(hiHealthData.getStartTime(), jCurrentTimeMillis)) {
            health.compact.a.hwlogsmodel.ReleaseLogUtil.e("Step_LSC", "data not same day,return");
            return;
        }
        int i = hiHealthData.getInt(ParsedFieldTag.STEP_SUM);
        hiHealthData.getInt("calorie_sum");
        int i2 = hiHealthData.getInt("intensity_time");
        int i3 = hiHealthData.getInt("active_hours");
        int i4 = hiHealthData.getInt("wheel_chair");
        this.ay = i2;
        this.aw = Math.min(i3, 24);
        this.bo = i4;
        com.huawei.hwlogsmodel.LogUtil.a("Step_LSC", "processSportDataCallback ", Integer.valueOf(i), " totalIntensity ", Integer.valueOf(i2), " totalActiveHours ", Integer.valueOf(i3), "wheelChair ", Integer.valueOf(i4));
        c(true);
        StandStepDataManager standStepDataManager = this.bg;
        if (standStepDataManager != null) {
            standStepDataManager.d(System.currentTimeMillis());
        }
    }

    private void ai() {
        if (!AuthorizationUtils.c(this.s)) {
            health.compact.a.hwlogsmodel.ReleaseLogUtil.e("Step_LSC", "processMemoryCheck hasAuth false");
            return;
        }
        String strC = KeyValDbManager.d(this.s).c("already_sport");
        com.huawei.hwlogsmodel.LogUtil.a("Step_LSC", "alreadySport", strC);
        MemoryMonitor.d(!String.valueOf(true).equals(strC));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ar() {
        if (this.bp != null) {
            Message messageObtainMessage = this.bp.obtainMessage(1006);
            messageObtainMessage.arg1 = 200;
            this.bp.sendMessage(messageObtainMessage);
        }
    }

    private void j(Message message) {
        if (this.bp != null) {
            this.bp.removeMessages(1006);
        }
        boolean z = message.arg2 != 201 ? message.arg1 == 200 : true;
        StandStepDataManager standStepDataManager = this.bg;
        if (standStepDataManager == null || standStepDataManager.e() < 0) {
            health.compact.a.hwlogsmodel.ReleaseLogUtil.e("Step_LSC", "MSG_REPORT_STEP_DATA dropreport ");
            this.bc = 0;
            this.ax = 0;
            this.at = 0;
            this.av = 0;
            return;
        }
        c(z);
    }

    public void e(LocalStepDataReport localStepDataReport) {
        if (localStepDataReport != null) {
            this.bj.d(localStepDataReport);
        }
    }

    public void d(boolean z) {
        this.aj = z;
    }

    public StandStepDataManager.d j() {
        StandStepDataManager standStepDataManager = this.bg;
        if (standStepDataManager != null) {
            return standStepDataManager.i();
        }
        return new StandStepDataManager.d();
    }

    public void k() {
        StandStepCounter standStepCounter = this.be;
        if (standStepCounter != null) {
            standStepCounter.b();
        }
    }

    private void c(int i, long j) {
        if (lsl.c(j, ((long) i) * 60000)) {
            return;
        }
        com.huawei.hwlogsmodel.LogUtil.a("Step_LSC", "refreshCheckNewDay: new day, detailDataTimestamp is ", Long.valueOf(j));
        isProcessNewDayReport(false);
    }

    private void c(boolean z) {
        long jI;
        if (this.bg == null) {
            health.compact.a.hwlogsmodel.ReleaseLogUtil.a("Step_LSC", "refreshReportData: mStandStepDataManager == null");
            return;
        }
        if (!z && isProcessNewDayReport(false)) {
            health.compact.a.hwlogsmodel.ReleaseLogUtil.e("Step_LSC", "isNextDay, not refresh ");
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iE = (int) TimeUtil.e(jCurrentTimeMillis);
        String[] strArrX = SharedPerferenceUtils.x(this.s);
        TotalDetailStepsCacheBean totalDetailStepsCacheBeanU = SharedPerferenceUtils.u(this.s);
        if (totalDetailStepsCacheBeanU != null) {
            jI = totalDetailStepsCacheBeanU.h();
        } else {
            jI = strArrX != null ? CommonUtil.i(strArrX[0]) : 0L;
        }
        c(iE, jI);
        this.bc = this.bg.e();
        this.bb = iE;
        b(iE - 1, strArrX);
        this.at = this.p.d(this.bc);
        this.ax = this.m.d(jCurrentTimeMillis, this.bc);
        if (this.aj) {
            this.av = (int) this.v.c();
        } else {
            this.av = 0;
        }
        this.av = (int) (((double) this.av) + this.j);
        StepsRecord stepsRecord = new StepsRecord();
        stepsRecord.f = this.bc;
        stepsRecord.f36648b = this.bg.g();
        stepsRecord.f36649c = this.ax;
        stepsRecord.f36647a = this.at;
        stepsRecord.e = this.av;
        stepsRecord.h = this.y.d();
        stepsRecord.g = this.ay;
        stepsRecord.d = this.aw;
        stepsRecord.j = this.bo;
        this.bm.a(stepsRecord);
        this.bj.a(-1L, stepsRecord);
        this.bj.b(z);
        b(stepsRecord);
        aq();
    }

    private void aq() {
        if (this.bc > 0) {
            DaemonServiceSpUtils.m();
            long jH = DaemonServiceSpUtils.h();
            if (jH <= 0) {
                return;
            }
            DaemonServiceSpUtils.a(0L);
            ipb.a(jH, this.bc);
        }
    }

    private void b(StepsRecord stepsRecord) {
        if (stepsRecord.d == 0 && stepsRecord.g == 0 && stepsRecord.f36649c == 0) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("activeHourType", stepsRecord.d);
        bundle.putInt("intensityType", stepsRecord.g);
        bundle.putInt("caloriesType", stepsRecord.f36649c);
        ijx.a().b("TodayAchievement", bundle);
    }

    @Override // com.huawei.health.connectivity.standstepcounter.StandStepDataManager.IGetCacheTodaySteps
    public boolean isProcessNewDayReport(boolean z) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        StandStepDataManager standStepDataManager = this.bg;
        if (standStepDataManager == null || !standStepDataManager.c(jCurrentTimeMillis, z)) {
            return false;
        }
        this.bm.d(this.bg.b());
        if (this.be != null && SharedPerferenceUtils.p(this.s)) {
            this.be.b();
        }
        ExtendStepDataManager extendStepDataManager = this.v;
        if (extendStepDataManager != null) {
            extendStepDataManager.b();
            this.v.d();
        }
        this.bi = jCurrentTimeMillis;
        this.w = false;
        this.bq = 0;
        this.az = 0;
        this.k = 0;
        this.j = 0.0d;
        this.p.e();
        this.m.a(jCurrentTimeMillis);
        this.ax = 0;
        this.av = 0;
        this.at = 0;
        this.ay = 0;
        this.aw = 0;
        this.bo = 0;
        SharedPerferenceUtils.e(this.s, System.currentTimeMillis(), 0.0d);
        SharedPerferenceUtils.a(this.s, System.currentTimeMillis(), 0.0d);
        SharedPerferenceUtils.d(this.s, System.currentTimeMillis(), 0.0d);
        SharedPerferenceUtils.c(this.s, System.currentTimeMillis(), 0);
        if (this.bp != null) {
            Message messageObtainMessage = this.bp.obtainMessage(1006);
            messageObtainMessage.arg1 = 200;
            messageObtainMessage.arg2 = 201;
            this.bp.sendMessage(messageObtainMessage);
        }
        Bundle bundle = new Bundle();
        bundle.putInt("activeHourType", 0);
        bundle.putInt("intensityType", 0);
        bundle.putInt("caloriesType", 0);
        ijx.a().b("TodayAchievement", bundle);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final boolean z) {
        health.compact.a.hwlogsmodel.ReleaseLogUtil.e("Step_LSC", "insertSportAchievementGoalVal isGoalChange:", Boolean.valueOf(z));
        ArrayList arrayList = new ArrayList(4);
        arrayList.add("900200006");
        arrayList.add("900200008");
        arrayList.add("900200009");
        arrayList.add("900200007");
        qgm.a(arrayList, new IBaseResponseCallback() { // from class: com.huawei.health.manager.LogicalStepCounter$3
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            public void onResponse(int i, Object obj) {
                if (!(obj instanceof HashMap)) {
                    ReleaseLogUtil.e("Step_LSC", "insertSportAchievementGoalVal objData is not instanceof HashMap");
                    return;
                }
                HashMap map = (HashMap) obj;
                int iD = qgm.d(map, "900200006", this.e.y.d());
                int iD2 = qgm.d(map, "900200008", 25);
                int iD3 = qgm.d(map, "900200009", 12);
                int iD4 = qgm.d(map, "900200007", 270000);
                ReleaseLogUtil.d("Step_LSC", npt.d("insertSportAchievementGoalVal stepValue is ", Integer.valueOf(iD), " intensityValue is ", Integer.valueOf(iD2), " standValue is ", Integer.valueOf(iD3), " calorieGoalValue is ", Integer.valueOf(iD4)));
                this.e.a(iD, iD2, iD3, iD4);
                if (z) {
                    this.e.b(iD, iD2, iD3, iD4);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i, int i2, int i3, int i4) {
        HashMap<Integer, Integer> map = new HashMap<>(16);
        map.put(Integer.valueOf(DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_STEP_GOAL_STATE.value()), Integer.valueOf(HiHealthHelper.b(i, this.bc)));
        map.put(Integer.valueOf(DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_DURATION_GOAL_STATE.value()), Integer.valueOf(HiHealthHelper.b(i2, this.ay)));
        map.put(Integer.valueOf(DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_ACTIVE_GOAL_STATE.value()), Integer.valueOf(HiHealthHelper.b(i3, this.aw)));
        map.put(Integer.valueOf(DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_CALORIE_GOAL_STATE.value()), Integer.valueOf(HiHealthHelper.b(i4, this.ax)));
        qhb.c().c(this.s, map, System.currentTimeMillis(), new IBaseResponseCallback() { // from class: com.huawei.health.manager.LogicalStepCounter$4
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            public void onResponse(int i5, Object obj) {
                LogUtil.a("Step_LSC", "saveAchieveStatus errorCode ", Integer.valueOf(i5));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        Intent intent = new Intent("com.huawei.health.ACTION_SEND_SPORT_GOAL");
        intent.putExtra("configId", str);
        BroadcastManagerUtil.e(this.s, intent);
    }

    private void e(HashMap<Integer, Integer> map) {
        if (ThreeCircleConfigUtil.a(ThreeCircleConfigUtil.ThreeCircleConfig.CALORIE)) {
            map.put(Integer.valueOf(DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_CALORIE_IS_RING_NEW.value()), 1);
        }
        if (ThreeCircleConfigUtil.a(ThreeCircleConfigUtil.ThreeCircleConfig.ACTIVE_HOUR)) {
            map.put(Integer.valueOf(DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_ACTIVE_IS_RING.value()), 1);
        }
        if (ThreeCircleConfigUtil.a(ThreeCircleConfigUtil.ThreeCircleConfig.STEP)) {
            map.put(Integer.valueOf(DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_STEP_IS_RING.value()), 1);
        }
        if (ThreeCircleConfigUtil.a(ThreeCircleConfigUtil.ThreeCircleConfig.INTENSITY)) {
            map.put(Integer.valueOf(DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_DURATION_IS_RING.value()), 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, int i2, int i3, int i4) {
        HashMap<Integer, Integer> map = new HashMap<>(16);
        map.put(Integer.valueOf(DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_STEP_GOAL_VALUE.value()), Integer.valueOf(i));
        map.put(Integer.valueOf(DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_DURATION_GOAL_VALUE.value()), Integer.valueOf(i2));
        map.put(Integer.valueOf(DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_ACTIVE_GOAL_VALUE.value()), Integer.valueOf(i3));
        map.put(Integer.valueOf(DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_CALORIE_GOAL_VALUE.value()), Integer.valueOf(i4));
        e(map);
        qhb.c().c(this.s, map, System.currentTimeMillis(), new IBaseResponseCallback() { // from class: com.huawei.health.manager.LogicalStepCounter$5
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            public void onResponse(int i5, Object obj) {
                ReleaseLogUtil.d("Step_LSC", "new day saveSportGoalAchievementData errorCode ", Integer.valueOf(i5));
                if (i5 == 0) {
                    BroadcastManagerUtil.e(BaseApplication.getContext(), new Intent("UPDATE_THREE_GOAL"));
                }
            }
        });
    }

    private void ab() {
        ProcessAliveMonitor processAliveMonitor = this.ar;
        if (processAliveMonitor == null) {
            com.huawei.hwlogsmodel.LogUtil.j("Step_LSC", "processAliveMonitorCheck mProcessAliveMonitor == null");
        } else {
            processAliveMonitor.c();
        }
    }

    private void aw() {
        StandStepCounter standStepCounter = this.be;
        if (standStepCounter != null) {
            standStepCounter.c();
            com.huawei.hwlogsmodel.LogUtil.a("Step_LSC", "stopStepCounterInter stand");
        }
        ExtendStepCounter extendStepCounter = this.x;
        if (extendStepCounter != null) {
            extendStepCounter.stopStepCounter();
            com.huawei.hwlogsmodel.LogUtil.a("Step_LSC", "stopStepCounterInter extend");
        }
        this.ak = false;
    }

    private void ax() {
        com.huawei.hwlogsmodel.LogUtil.a("Step_LSC", "startStepCounterInter mStandStepCounter = ", this.be);
        StandStepCounter standStepCounter = this.be;
        if (standStepCounter != null) {
            standStepCounter.a();
            com.huawei.hwlogsmodel.LogUtil.a("Step_LSC", "startStepCounterInter stand");
        }
        ExtendStepCounter extendStepCounter = this.x;
        if (extendStepCounter != null) {
            extendStepCounter.startStepCounter();
            com.huawei.hwlogsmodel.LogUtil.a("Step_LSC", "startStepCounterInter extend");
        }
        this.ak = true;
    }

    public void b(ISimpleResultCallback iSimpleResultCallback) {
        d(iSimpleResultCallback, false);
    }

    public void d(ISimpleResultCallback iSimpleResultCallback, boolean z) {
        com.huawei.hwlogsmodel.LogUtil.d("Step_LSC", "flushTempCacheToDb enter... callback:", iSimpleResultCallback, " flushByUI:", Boolean.valueOf(z));
        if (this.bp != null) {
            Message messageObtainMessage = this.bp.obtainMessage(1001);
            LogicalStepCounter$FlushDbMsg logicalStepCounter$FlushDbMsg = new LogicalStepCounter$FlushDbMsg();
            logicalStepCounter$FlushDbMsg.f8056b = iSimpleResultCallback;
            messageObtainMessage.obj = logicalStepCounter$FlushDbMsg;
            this.bp.sendMessage(messageObtainMessage);
        }
    }

    public Bundle f() {
        StepsRecordManager stepsRecordManager = this.bj;
        if (stepsRecordManager == null) {
            return null;
        }
        com.huawei.hwlogsmodel.LogUtil.a("Step_LSC", "getTodaySportData mStepsRecordManager=", stepsRecordManager);
        return this.bj.b().a();
    }

    public Bundle e() {
        StepsRecord stepsRecordB;
        StepsRecordManager stepsRecordManager = this.bj;
        if (stepsRecordManager == null || (stepsRecordB = stepsRecordManager.b()) == null) {
            return null;
        }
        Bundle bundleA = stepsRecordB.a();
        bundleA.putInt("cacheTotalSteps", getCacheTodaySteps());
        String strS = SharedPerferenceUtils.s(this.s);
        if (!TextUtils.isEmpty(strS)) {
            bundleA.putString("serviceRestartRecord", strS);
        }
        Map<String, Object> mapD = this.bg.d();
        if (mapD != null) {
            bundleA.putInt("standardBase", ((Integer) mapD.get("standardBase")).intValue());
            bundleA.putInt("restartSteps", ((Integer) mapD.get("restartSteps")).intValue());
            bundleA.putInt("otherSteps", ((Integer) mapD.get("otherSteps")).intValue());
            bundleA.putInt("UIShowSteps", ((Integer) mapD.get("UIShowSteps")).intValue());
        }
        return bundleA;
    }

    public boolean h() {
        ProcessAliveMonitor processAliveMonitor = this.ar;
        if (processAliveMonitor == null) {
            com.huawei.hwlogsmodel.LogUtil.j("Step_LSC", "isNeedPromptKeepAlive mProcessAliveMonitor is null.");
            return false;
        }
        return processAliveMonitor.d();
    }

    public void m() {
        ProcessAliveMonitor processAliveMonitor = this.ar;
        if (processAliveMonitor == null) {
            com.huawei.hwlogsmodel.LogUtil.j("Step_LSC", "makePromptNoSense processAliveMonitor null,failed,return");
        } else {
            processAliveMonitor.b();
        }
    }

    private void v() {
        if (!AuthorizationUtils.c(this.s)) {
            health.compact.a.hwlogsmodel.ReleaseLogUtil.e("Step_LSC", "getDeviceId fail, authorization not admitted");
            return;
        }
        String androidId = FoundationCommonUtil.getAndroidId(this.s);
        this.q = androidId;
        this.bm.b(androidId);
        ExtendStepDataManager extendStepDataManager = this.v;
        if (extendStepDataManager != null) {
            extendStepDataManager.d(this.q);
        }
    }

    private void y() {
        HiHealthManager.d(this.s).fetchUserData(new HiCommonListener() { // from class: com.huawei.health.manager.LogicalStepCounter$6
            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onSuccess(int i, Object obj) {
                List<HiUserInfo> list;
                LogUtil.d("Step_LSC", "getUserInfoFromDb");
                if (obj == null) {
                    ReleaseLogUtil.e("Step_LSC", "getUserInfoFromDb, data is null.");
                    return;
                }
                try {
                    list = (List) obj;
                } catch (ClassCastException e2) {
                    LogUtil.j("Step_LSC", e2.getMessage());
                    list = null;
                }
                if (list == null || list.size() == 0) {
                    ReleaseLogUtil.e("Step_LSC", "getUserInfoFromDb userInfoLists is null or userInfoList.size() == 0");
                    return;
                }
                for (HiUserInfo hiUserInfo : list) {
                    if (hiUserInfo.getRelateType() == 0) {
                        LogUtil.a("Step_LSC", "setUserInfo sync");
                        Bundle bundle = new Bundle();
                        bundle.putFloat("weight", hiUserInfo.getWeightOrDefaultValue());
                        bundle.putFloat("height", hiUserInfo.getHeightOrDefaultValue());
                        bundle.putInt("ownerId", hiUserInfo.getOwnerId());
                        bundle.putString("huid", hiUserInfo.getHuid());
                        bundle.putInt(CommonConstant.KEY_GENDER, hiUserInfo.getGenderOrDefaultValue());
                        bundle.putInt("age", hiUserInfo.getAgeOrDefaultValue());
                        Message messageObtain = Message.obtain();
                        messageObtain.what = 1016;
                        messageObtain.obj = bundle;
                        this.e.bp.sendMessage(messageObtain);
                    }
                }
            }

            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onFailure(int i, Object obj) {
                LogUtil.e("Step_LSC", "getUserInfo onFailure = ", obj);
            }
        });
    }

    public void e(Bundle bundle) {
        com.huawei.hwlogsmodel.LogUtil.a("Step_LSC", "setUserInfo userSet ignore!!! from db refresh");
    }

    public void o() {
        com.huawei.hwlogsmodel.LogUtil.a("Step_LSC", "setStepsTarget");
        this.y.a();
        if (this.bp != null) {
            this.bp.sendMessage(this.bp.obtainMessage(1006));
        }
        Context context = this.s;
        if (context != null) {
            SharedPerferenceUtils.d(context, this.y.d());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(ISimpleResultCallback iSimpleResultCallback) {
        if (iSimpleResultCallback != null) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("result", true);
            iSimpleResultCallback.onSuccess(bundle);
        }
    }

    private void ap() {
        com.huawei.hwlogsmodel.LogUtil.a("Step_LSC", "registerBrowseBroadcastReceiver");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.plugin.account.login");
        intentFilter.addAction("com.huawei.plugin.account.logout");
        intentFilter.addAction("com.huawei.bone.action.CONNECTION_STATE_CHANGED");
        DaemonBrowseModeReceiver daemonBrowseModeReceiver = new DaemonBrowseModeReceiver(this);
        this.l = daemonBrowseModeReceiver;
        Context context = this.s;
        if (context != null) {
            BroadcastManagerUtil.c(context, daemonBrowseModeReceiver, intentFilter, LocalBroadcast.f36595c, null);
        }
    }

    private void at() {
        Context context;
        DaemonBrowseModeReceiver daemonBrowseModeReceiver = this.l;
        if (daemonBrowseModeReceiver == null || (context = this.s) == null) {
            return;
        }
        context.unregisterReceiver(daemonBrowseModeReceiver);
        this.l = null;
    }

    private void e(final ISimpleResultCallback iSimpleResultCallback, boolean z, boolean z2) {
        if (this.aa) {
            com.huawei.hwlogsmodel.LogUtil.e("Step_LSC", "browse mode not support write to db");
            return;
        }
        if (!this.aj) {
            com.huawei.hwlogsmodel.LogUtil.a("Step_LSC", "not support calss1,then uploadstaticdata");
            p();
            d(iSimpleResultCallback);
            return;
        }
        if (this.bg != null && !z && (this.bc != this.an || z2)) {
            p();
            this.an = this.bc;
        }
        this.v.a(new FlushableStepDataCache.MyFlushCallback() { // from class: com.huawei.health.manager.LogicalStepCounter$7
            @Override // com.huawei.health.manager.common.FlushableStepDataCache.MyFlushCallback
            public void onSuccess() {
                if (this.e.bp != null) {
                    this.e.bp.sendEmptyMessage(1003);
                    Message messageObtainMessage = this.e.bp.obtainMessage(1006);
                    messageObtainMessage.arg1 = 200;
                    this.e.bp.sendMessage(messageObtainMessage);
                }
                this.e.v.b();
                this.e.d(iSimpleResultCallback);
                LogUtil.a("Step_LSC", "flush2DB result success");
            }

            @Override // com.huawei.health.manager.common.FlushableStepDataCache.MyFlushCallback
            public void onFailed() {
                LogUtil.a("Step_LSC", "flush2DB result error");
            }
        });
    }

    public void d() {
        health.compact.a.hwlogsmodel.ReleaseLogUtil.d("R_Step_LSC", "destroy.");
        if (this.bp != null) {
            this.bp.removeMessages(1000);
            this.bp.removeMessages(1001);
            this.bp.removeMessages(1006);
            this.bp.removeMessages(1003);
            this.bp.removeMessages(1011);
        }
        HandlerThread handlerThread = this.br;
        if (handlerThread != null) {
            handlerThread.quit();
            this.br = null;
        }
        SportIntensity.a(this.s).d();
        ay();
        at();
        BroadcastManager.n(this.u);
        a(this.bk);
        ijx.a().b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<Integer> list) {
        if (njy.b(list)) {
            com.huawei.hwlogsmodel.LogUtil.a("Step_LSC", "unSubscribeSportData");
            HiHealthNativeApi.a(this.s).unSubscribeHiHealthData(list, new HiUnSubscribeListener() { // from class: com.huawei.health.manager.LogicalStepCounter$8
                @Override // com.huawei.hihealth.data.listener.HiUnSubscribeListener
                public void onResult(boolean z) {
                    ReleaseLogUtil.d("Step_LSC", "unSubscribeSportData isSuccess = ", Boolean.valueOf(z));
                }
            });
        }
    }

    public void c(LocalStepDataReport localStepDataReport) {
        e(localStepDataReport);
        if (this.bp != null) {
            this.bp.sendEmptyMessage(1006);
        }
    }

    public void e(long j, int i, int i2, int i3) {
        com.huawei.hwlogsmodel.LogUtil.a("Step_LSC", "setBaseData mWorkerHandler ", this.bp, " steps ", LogAnonymous.d(i));
    }

    public void n() {
        com.huawei.hwlogsmodel.LogUtil.a("Step_LSC", "startStepCounter enter...");
        if (!StepCounterSupportUtils.b(this.s)) {
            health.compact.a.hwlogsmodel.ReleaseLogUtil.d("Step_LSC", " processStartStepCounter failed with cant step counter.");
            return;
        }
        SharedPerferenceUtils.c(this.s, true);
        if (this.bp != null) {
            Message messageObtainMessage = this.bp.obtainMessage(1005);
            messageObtainMessage.arg1 = 100;
            this.bp.sendMessage(messageObtainMessage);
        }
    }

    public void t() {
        com.huawei.hwlogsmodel.LogUtil.a("Step_LSC", "stopStepCounter");
        SharedPerferenceUtils.c(this.s, false);
        if (this.bp != null) {
            Message messageObtainMessage = this.bp.obtainMessage(1005);
            messageObtainMessage.arg1 = 101;
            this.bp.sendMessage(messageObtainMessage);
        }
    }

    public boolean l() {
        return this.ak;
    }

    public void d(long j, int i, int i2) {
        if (this.bp != null) {
            Message messageObtainMessage = this.bp.obtainMessage(1000);
            messageObtainMessage.arg1 = i;
            messageObtainMessage.obj = Long.valueOf(j);
            messageObtainMessage.arg2 = i2;
            this.bp.sendMessage(messageObtainMessage);
        }
    }

    public int a() {
        if (this.af.get()) {
            return this.bh;
        }
        Object obj = f36612a;
        synchronized (obj) {
            if (!this.af.get()) {
                try {
                    obj.wait(C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
                    health.compact.a.hwlogsmodel.ReleaseLogUtil.e("Step_LSC", "getStandSteps timeout");
                    ipb.g();
                } catch (InterruptedException unused) {
                    com.huawei.hwlogsmodel.LogUtil.e("Step_LSC", "getStandSteps exception");
                }
            }
        }
        return this.bh;
    }

    public boolean i() {
        return this.af.get();
    }

    private void h(int i) {
        DeviceClassWatchDog deviceClassWatchDog = this.n;
        if (deviceClassWatchDog == null || !deviceClassWatchDog.e() || !this.n.c(i) || this.bp == null) {
            return;
        }
        health.compact.a.hwlogsmodel.ReleaseLogUtil.d("Step_LSC", "reduce class");
        this.bp.sendEmptyMessage(1011);
    }

    private void g(int i) {
        if (this.ai) {
            this.ap = i;
            this.ai = false;
        }
        int i2 = i - this.ap;
        if (i2 > 100) {
            com.huawei.hwlogsmodel.LogUtil.a("Step_LSC", "standStepCounter report 100 steps,write fe");
            if (this.bp != null) {
                this.bp.sendMessage(this.bp.obtainMessage(1003));
            }
            this.ai = true;
            return;
        }
        if (i2 > 0) {
            if (this.bp != null) {
                this.bp.removeMessages(1010);
                this.bp.sendEmptyMessageDelayed(1010, 30000L);
                return;
            }
            return;
        }
        com.huawei.hwlogsmodel.LogUtil.j("Step_LSC", "tryToRecordStepsToFileCache default.");
    }

    public void a(long j, int i, int i2, int i3) {
        long jD = j;
        if (this.i.get()) {
            health.compact.a.hwlogsmodel.ReleaseLogUtil.e("Step_LSC", "onExtendStepChanged phone shutdown, return");
            return;
        }
        this.r = jD;
        if (this.ao != jD) {
            this.ag = false;
            this.ao = jD;
            this.bd = System.currentTimeMillis();
        } else if (this.al) {
            this.ag = true;
        } else if (!this.ag && System.currentTimeMillis() - this.bd >= 60000) {
            this.ag = true;
        }
        if (this.ag) {
            com.huawei.hwlogsmodel.LogUtil.d("Step_LSC", "mIsCalibrateTime true,timestamp before:", Long.valueOf(j));
            jD = (TimeUtil.d(System.currentTimeMillis()) * 1000) + 7;
            com.huawei.hwlogsmodel.LogUtil.d("Step_LSC", "mIsCalibrateTime after,timestamp before:", Long.valueOf(jD));
        }
        long j2 = jD;
        com.huawei.hwlogsmodel.LogUtil.d("Step_LSC", "onExtend:", Long.valueOf(j2), " ", Integer.valueOf(i), " ", Integer.valueOf(i2), " ", Integer.valueOf(i3));
        long j3 = this.t;
        if (j2 < j3) {
            com.huawei.hwlogsmodel.LogUtil.a("Step_LSC", "timestamp back,mExtendReportTimestamp = ", Long.valueOf(j3));
            this.al = true;
        } else {
            this.al = false;
        }
        this.t = j2;
        DeviceClassWatchDog deviceClassWatchDog = this.n;
        if (deviceClassWatchDog != null) {
            deviceClassWatchDog.d();
        }
        b(i, i2, i3, j2);
    }

    private void b(int i, int i2, int i3, long j) {
        int i4 = i2 > 0 ? 6 : i3;
        c(j, i, i2, i3);
        LogicalStepCounter$ExtendStepMsg logicalStepCounter$ExtendStepMsg = new LogicalStepCounter$ExtendStepMsg(j, i, i2 * 30, i4);
        if (this.bp != null) {
            Message messageObtainMessage = this.bp.obtainMessage();
            messageObtainMessage.what = 1004;
            messageObtainMessage.obj = logicalStepCounter$ExtendStepMsg;
            this.bp.sendMessage(messageObtainMessage);
        }
        UploadUtil uploadUtil = this.bm;
        if (uploadUtil != null && uploadUtil.c(i)) {
            com.huawei.hwlogsmodel.LogUtil.a("Step_LSC", "flushTempCacheToDb by ext");
            b((ISimpleResultCallback) null);
        }
        long j2 = this.am;
        if (j2 == -1 || j2 > j || this.bp == null) {
            return;
        }
        if (com.huawei.hwlogsmodel.LogUtil.a(60000, this.am) == -1) {
            health.compact.a.hwlogsmodel.ReleaseLogUtil.e("Step_LSC", "send MSG_FLUSH_AND_SYNC_WITH_DB updateFrequency fast");
            return;
        }
        com.huawei.hwlogsmodel.LogUtil.a("Step_LSC", "send MSG_FLUSH_AND_SYNC_WITH_DB message", Long.valueOf(this.am), Long.valueOf(j));
        this.am = -1L;
        this.bp.sendMessage(this.bp.obtainMessage(1012));
    }

    private void b(int i, String[] strArr) {
        c(i, strArr);
        ExtendStepDataManager extendStepDataManager = this.v;
        OneMinuteStepData oneMinuteStepDataE = extendStepDataManager != null ? extendStepDataManager.e(i) : null;
        if (oneMinuteStepDataE != null) {
            int iC = oneMinuteStepDataE.c();
            if (iC == 20003) {
                this.az += oneMinuteStepDataE.b();
            } else if (iC == 20004) {
                this.k += oneMinuteStepDataE.b();
            } else {
                this.bq += oneMinuteStepDataE.b();
            }
        }
        TotalDetailStepsCacheBean.Builder builder = new TotalDetailStepsCacheBean.Builder();
        builder.b(((long) i) * 60000);
        builder.c(this.bg.e());
        builder.f(this.bq);
        builder.b(this.az);
        builder.a(this.k);
        builder.e(SystemClock.elapsedRealtime());
        builder.d(this.ay);
        builder.e(this.aw);
        SharedPerferenceUtils.d(this.s, builder.e());
    }

    private void c(int i, String[] strArr) {
        if (strArr == null) {
            return;
        }
        try {
            long j = Long.parseLong(strArr[0]);
            int i2 = Integer.parseInt(strArr[2]);
            int i3 = Integer.parseInt(strArr[3]);
            int i4 = Integer.parseInt(strArr[4]);
            if (lsl.c(j, ((long) i) * 60000)) {
                this.bq = i2;
                this.az = i3;
                this.k = i4;
            }
        } catch (NumberFormatException e2) {
            com.huawei.hwlogsmodel.LogUtil.j("Step_LSC", "stepsDetailCalculation Exception", e2.getMessage());
        }
    }

    @Override // com.huawei.health.connectivity.standstepcounter.StandStepDataManager.IGetCacheTodaySteps
    public int getCacheTodaySteps() {
        ExtendStepDataManager extendStepDataManager = this.v;
        if (extendStepDataManager != null) {
            return extendStepDataManager.f();
        }
        return 0;
    }

    private void ag() {
        com.huawei.hwlogsmodel.LogUtil.a("Step_LSC", "CLASS1 change to CLASS2");
        StepCounterSupport.e(this.s, 2);
        this.aj = false;
        this.bf.b();
        this.x.stopStepCounter();
        ExtendStepCounter extendStepCounterD = this.bf.d();
        this.x = extendStepCounterD;
        extendStepCounterD.startStepCounter();
        this.p.reduceClass();
        this.m.reduceClass();
    }

    public void p() {
        if (this.bg != null) {
            if (isProcessNewDayReport(false)) {
                health.compact.a.hwlogsmodel.ReleaseLogUtil.d("Step_LSC", "uploadStaticsToDb is new day");
            } else if (this.bg.h() && this.bg.e() == 0) {
                com.huawei.hwlogsmodel.LogUtil.a("Step_LSC", "today has no steps report");
            } else {
                this.bm.b(this.bg.e(), this.bg.g(), this.ax, this.av, this.at);
            }
        }
    }

    public void c(IStepReport iStepReport) {
        if (this.au != null) {
            synchronized (d) {
                this.au.add(iStepReport);
            }
        }
    }

    public void b(IStepReport iStepReport) {
        ArrayList<IStepReport> arrayList = this.au;
        if (arrayList == null || !arrayList.contains(iStepReport)) {
            return;
        }
        synchronized (d) {
            this.au.remove(iStepReport);
        }
    }

    private void c(long j, int i, int i2, int i3) {
        if (njy.e(this.au)) {
            return;
        }
        synchronized (d) {
            for (IStepReport iStepReport : this.au) {
                if (iStepReport != null) {
                    iStepReport.onExtendStepChanged(j, i, i2, i3);
                }
            }
        }
    }

    private void a(int i) {
        ArrayList<IStepReport> arrayList = this.au;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        synchronized (d) {
            for (IStepReport iStepReport : this.au) {
                if (iStepReport != null) {
                    iStepReport.onStandStepChanged(i);
                }
            }
        }
    }

    public void q() {
        Context context;
        if (!ScreenUtil.d() || (context = this.s) == null) {
            return;
        }
        if (!Boolean.TRUE.toString().equals(SharedPerferenceUtils.r(context))) {
            com.huawei.hwlogsmodel.LogUtil.j("Step_LSC", "updateStepNotifyLayout StepsNotification switch is close or unset");
            return;
        }
        av();
        StepsRecordManager stepsRecordManager = this.bj;
        if (stepsRecordManager == null || this.ab == null) {
            health.compact.a.hwlogsmodel.ReleaseLogUtil.e("Step_LSC", "updateStepNotifyLayout data null");
            return;
        }
        StepsRecord stepsRecordB = stepsRecordManager.b();
        if (stepsRecordB == null) {
            health.compact.a.hwlogsmodel.ReleaseLogUtil.e("Step_LSC", "updateStepNotifyLayout stepsRecord == null");
        } else {
            this.ab.a(stepsRecordB.f, stepsRecordB.f36649c, stepsRecordB.h, stepsRecordB.d);
        }
    }

    private void av() {
        if (this.ab == null) {
            this.ab = HealthStepsNotificationHelper.c(this.s);
        }
        this.ab.d(NotificationUtil.i());
        this.ab.a(NotificationUtil.j());
    }
}

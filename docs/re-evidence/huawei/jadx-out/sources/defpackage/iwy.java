package defpackage;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.amap.api.location.AMapLocation;
import com.amap.api.services.geocoder.GeocodeSearch;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.utils.ScreenUtil;
import com.huawei.haf.handler.BaseHandlerCallback;
import com.huawei.haf.handler.ExtendHandler;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.api.IndoorEquipManagerApi;
import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader;
import com.huawei.health.sport.ITargetUpdateListener;
import com.huawei.health.sport.model.CourseEnvParams;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.health.sportservice.SportComponent;
import com.huawei.health.sportservice.SportVoiceEnableListener;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.healthcloud.plugintrack.PluginSportTrackAdapter;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.manager.SportLinkageManager;
import com.huawei.healthcloud.plugintrack.manager.TrackAltitudeMgr;
import com.huawei.healthcloud.plugintrack.manager.TrackDisDataMgr;
import com.huawei.healthcloud.plugintrack.manager.TrackPauseDataMgr;
import com.huawei.healthcloud.plugintrack.manager.config.TrackDevelopConfig;
import com.huawei.healthcloud.plugintrack.manager.inteface.IMapDrawingUpdater;
import com.huawei.healthcloud.plugintrack.manager.inteface.IMapViewListener;
import com.huawei.healthcloud.plugintrack.manager.inteface.ISportDataFragmentListener;
import com.huawei.healthcloud.plugintrack.manager.inteface.ISportDistanceTimeCallback;
import com.huawei.healthcloud.plugintrack.manager.inteface.ISportStateChangeListener;
import com.huawei.healthcloud.plugintrack.manager.inteface.IStepRateUpdater;
import com.huawei.healthcloud.plugintrack.manager.inteface.ITrackPointDataUpdater;
import com.huawei.healthcloud.plugintrack.manager.inteface.ITreadmillStyleCallback;
import com.huawei.healthcloud.plugintrack.manager.inteface.IUpGpsStatusListener;
import com.huawei.healthcloud.plugintrack.manager.inteface.LoadHotTrackCallBack;
import com.huawei.healthcloud.plugintrack.manager.inteface.TrackRealDataListener;
import com.huawei.healthcloud.plugintrack.model.IRidePostureDataCallback;
import com.huawei.healthcloud.plugintrack.model.IStepRateCallback;
import com.huawei.healthcloud.plugintrack.model.MotionData;
import com.huawei.healthcloud.plugintrack.model.SportBeat;
import com.huawei.healthcloud.plugintrack.model.TimeUpdater;
import com.huawei.healthcloud.plugintrack.notification.HealthSportingNotificationHelper;
import com.huawei.healthcloud.plugintrack.sportmusic.SportMusicController;
import com.huawei.healthcloud.plugintrack.sportmusic.SportMusicInteratorService;
import com.huawei.healthcloud.plugintrack.ui.activity.TrackMainMapActivity;
import com.huawei.healthcloud.plugintrack.ui.sporttypeconfig.bean.HwSportTypeInfo;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.hwfoundationmodel.trackmodel.ISportDataCallback;
import com.huawei.hwfoundationmodel.trackmodel.MotionPath;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwfoundationmodel.trackmodel.StepRateData;
import com.huawei.hwfoundationmodel.trackmodel.TrackDistanceData;
import com.huawei.hwfoundationmodel.trackmodel.TrackPauseData;
import com.huawei.hwlocationmgr.model.IGpsStatusCallback;
import com.huawei.hwlocationmgr.model.ILoactionCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.OpAnalyticsConstants;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import com.huawei.operation.ble.BleConstants;
import com.huawei.pluginachievement.manager.model.MedalConstants;
import com.huawei.up.model.UserInfomation;
import health.compact.a.CommonUtil;
import health.compact.a.CommonUtils;
import health.compact.a.KeyValDbManager;
import health.compact.a.LanguageUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.utils.StringUtils;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.security.SecureRandom;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public class iwy implements TimeUpdater, ITrackPointDataUpdater, IStepRateUpdater, IUpGpsStatusListener, ITargetUpdateListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile iwy f38155c = null;
    private static volatile PluginSportTrackAdapter f = null;
    private static boolean j = true;
    private iwj aa;
    private dea ad;
    private ExtendHandler ao;
    private ScheduledExecutorService aq;
    private izp ax;
    private boolean bk;
    private boolean bl;
    private boolean bp;
    private boolean ci;
    private boolean cl;
    private boolean cr;
    private long cz;
    private UserInfomation dh;
    private IMapDrawingUpdater dm;
    private String dp;
    private String ds;
    private String dw;
    private iyz dz;
    private def eq;
    private ixn es;
    private SportLinkageManager et;
    private ITargetUpdateListener ff;
    private StorageParams fi;
    private String fn;
    private fla fv;
    private TrackDevelopConfig fy;
    private ivm ga;
    private fkw gc;
    private jaq ge;
    private UserInfomation gi;
    private iyd o;
    private String p;
    private String q;
    private Context x;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f38154b = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f38153a = new Object();
    private static final Object d = new Object();
    private static final Object e = new Object();
    private static List<ISportDataFragmentListener> h = new CopyOnWriteArrayList();
    private volatile boolean bc = false;
    private boolean cc = false;
    private MotionPath dl = null;
    private volatile MotionPathSimplify dt = null;
    private List<jpi> ap = new ArrayList(16);

    /* JADX INFO: renamed from: do, reason: not valid java name */
    private Map<Long, double[]> f6do = new TreeMap();
    private boolean ce = false;
    private int ep = 0;
    private volatile int df = 0;
    private String eo = null;
    private jpg ai = null;
    private jpg dd = null;
    private long af = 0;
    private boolean fq = true;
    private String ab = "";
    private IRidePostureDataCallback eh = new IRidePostureDataCallback() { // from class: iwy.5
        @Override // com.huawei.healthcloud.plugintrack.model.IRidePostureDataCallback
        public void onResult() {
        }

        @Override // com.huawei.healthcloud.plugintrack.model.IRidePostureDataCallback
        public void onChange(gzr gzrVar) {
            if (gzrVar == null) {
                return;
            }
            LogUtil.a("Track_SportManager", "ridePostureData.getSumCircle()", Long.valueOf(gzrVar.d()));
            iwy.this.j((int) gzrVar.d());
        }
    };
    private float fx = 0.0f;
    private float an = 0.0f;
    private float fp = 0.0f;
    private fku cv = null;
    private float ft = 0.0f;
    private float fr = 0.0f;
    private float fu = 0.0f;
    private float bh = 0.0f;
    private long en = 0;
    private long eu = 0;
    private long ar = 0;
    private int ew = 0;
    private int fb = 0;
    private int dr = 0;
    private int aw = 0;
    private int em = 0;
    private int v = 0;
    private List<IMapViewListener> dn = new CopyOnWriteArrayList();
    private int gj = 0;
    private boolean bi = false;
    private volatile boolean bw = false;
    private boolean cq = false;
    private boolean br = false;
    private ixy gf = null;
    private int w = 0;
    private int ay = 1;
    private npg bf = null;
    private iwh z = null;
    private boolean cg = false;
    private boolean bz = true;
    private long cy = 0;
    private long cw = 0;
    private int fa = 5000;
    private long m = 0;
    private long ae = 0;
    private final DecimalFormat y = new DecimalFormat("0.0");
    private long au = 0;
    private long at = 0;
    private long bm = 60;
    private long du = TimeUnit.MINUTES.toMillis(this.bm);
    private long n = -1;
    private StringBuilder dg = new StringBuilder(16);
    private StringBuilder ef = new StringBuilder(16);
    private StringBuilder av = new StringBuilder(16);
    private StringBuilder fd = new StringBuilder(16);
    private boolean cd = false;
    private boolean cf = false;
    private Map<Long, double[]> fj = new TreeMap();
    private HealthSportingNotificationHelper ev = null;
    private boolean co = false;
    private boolean bv = true;
    private boolean bs = true;
    private boolean ca = false;
    private int eb = 0;
    private int di = 0;
    private int dj = 0;
    private double db = 0.0d;
    private double dk = 0.0d;
    private List<jpi> k = new ArrayList(16);
    private boolean cs = false;
    private boolean cj = true;
    private List<ISportStateChangeListener> er = new CopyOnWriteArrayList();
    private boolean cb = false;
    private int gp = 1;
    private float cu = 0.0f;
    private int ey = -1;
    private int ea = 0;
    private int de = 0;
    private int am = 0;
    private int dc = 0;
    private int ah = 0;
    private float aj = 0.5f;
    private float gq = 0.5f;
    private float s = 2.88f;
    private boolean by = false;
    private iwd l = null;
    private float fw = 0.0f;
    private List<jbu> ek = new CopyOnWriteArrayList();
    private boolean cn = true;
    private Handler gk = null;
    private LinkedList<fku> ee = null;
    private ISportDistanceTimeCallback dy = null;
    private long fs = 0;
    private long fo = 0;
    private int dq = -1;
    private ixr fc = null;
    private int as = 0;
    private int ac = 0;
    private ixu gd = null;
    private long t = -1;
    private long r = -1;
    private boolean bj = true;
    private boolean bo = true;
    private iya gl = null;
    private int dx = 0;
    private long dv = 0;
    private long cx = 0;
    private boolean bu = true;
    private boolean bt = true;
    private int g = 0;
    private boolean cp = false;
    private int fk = 0;
    private long fl = 0;
    private long fm = 0;
    private boolean bx = false;
    private boolean bn = false;
    private int gm = 1;
    private nsp ei = new nsp();
    private nsp ej = new nsp();
    private TrackAltitudeMgr fz = null;
    private TrackPauseDataMgr gh = null;
    private TrackDisDataMgr gb = null;
    private boolean ck = false;
    private double ez = 0.0d;
    private int ag = 0;
    private gyv fh = new gyv();
    private boolean ch = false;
    private int ct = -1;
    private int[] ba = new int[6];
    private long da = 0;
    private ize ed = new ize();
    private volatile boolean cm = false;
    private volatile boolean bq = false;
    private String ak = null;
    private String ec = null;
    private String fg = null;
    private boolean bb = false;
    private volatile boolean i = true;
    private ixa el = new ixa();
    private iwr bd = new iwr();
    private long bg = -1;
    private Map<String, SportVoiceEnableListener> go = Collections.synchronizedMap(new LinkedHashMap());
    private TrackRealDataListener gg = null;
    private jbb ex = new jbb();
    private final IBaseResponseCallback al = new IBaseResponseCallback() { // from class: ixh
        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public final void a(int i, Object obj) {
            this.f38164c.b(i, obj);
        }
    };
    private iwp be = new iwp();
    private StringBuffer fe = new StringBuffer();
    private int az = 0;
    private String eg = "";
    private final iyc u = new iyc();

    private int n(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 0;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(int i, Object obj) {
        LogUtil.a("Track_SportManager", "mDeviceStepRateAlgorithmCallback errorCode: ", Integer.valueOf(i));
        if (obj.toString().equals("true") || obj.toString().equals("false")) {
            n(Boolean.parseBoolean(obj.toString()));
            r(true);
        } else {
            LogUtil.j("Track_SportManager", "mDeviceStepRateAlgorithmCallback ", "objData =", obj.toString());
            r(false);
        }
    }

    private iwy(Context context) {
        this.x = null;
        this.bl = true;
        this.gc = null;
        this.fv = null;
        this.dz = null;
        this.x = context;
        dh();
        this.ge = new jaq(this.x, this.fi, this.dp);
        this.fn = this.x.getResources().getString(R.string.IDS_motiontrack_show_map_goal_finish);
        TrackDevelopConfig trackDevelopConfig = new TrackDevelopConfig(this.x);
        this.fy = trackDevelopConfig;
        this.fv = trackDevelopConfig.b();
        this.gc = new fkw(this.fv, this.dg, 1);
        eq();
        this.et = new SportLinkageManager(context);
        eu();
        this.bl = CommonUtil.au();
        this.dz = new iyz();
        this.ga = ivm.e();
    }

    public void g(boolean z) {
        this.cc = z;
    }

    public boolean ay() {
        return this.co;
    }

    public void a(boolean z) {
        this.co = z;
    }

    public int p() {
        return this.gj;
    }

    public int e() {
        return this.et.e();
    }

    public nsp i() {
        nsp nspVar;
        synchronized (f38153a) {
            nspVar = this.ei;
        }
        return nspVar;
    }

    public void b(nsp nspVar) {
        synchronized (f38153a) {
            this.ej = nspVar;
            if (nspVar != null) {
                LogUtil.a("Track_SportManager", "registerReportDataListener onChange time", Long.valueOf(nspVar.m()));
                fi();
            }
        }
    }

    public boolean w() {
        return this.bk;
    }

    public CopyOnWriteArrayList<njt> f() {
        ize izeVar = this.ed;
        if (izeVar != null) {
            return izeVar.e();
        }
        return null;
    }

    public CopyOnWriteArrayList<gzv> b() {
        return this.et.a();
    }

    public static void c(ISportDataFragmentListener iSportDataFragmentListener) {
        if (iSportDataFragmentListener == null || h.contains(iSportDataFragmentListener)) {
            return;
        }
        h.add(iSportDataFragmentListener);
        LogUtil.a("Track_SportManager", "addSportDataFragmentListener thread: ", Integer.valueOf(Thread.currentThread().hashCode()), " listener: ", iSportDataFragmentListener);
    }

    public static void b(ISportDataFragmentListener iSportDataFragmentListener) {
        if (iSportDataFragmentListener != null) {
            try {
                if (h.contains(iSportDataFragmentListener)) {
                    h.remove(iSportDataFragmentListener);
                    ReleaseLogUtil.d("Track_SportManager", "complete remove listener");
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
                LogUtil.j("Track_SportManager", "removeSportDataFragmentListener thread: ", Integer.valueOf(Thread.currentThread().hashCode()), " listener: ", iSportDataFragmentListener);
            }
        }
    }

    public void e(IMapDrawingUpdater iMapDrawingUpdater) {
        this.dm = iMapDrawingUpdater;
    }

    private static void en() {
        synchronized (e) {
            f38155c = null;
        }
    }

    public static iwy a(Context context) {
        if (f38155c == null) {
            synchronized (e) {
                if (f38155c == null) {
                    if (context == null) {
                        f38155c = new iwy(BaseApplication.getContext());
                    } else {
                        f38155c = new iwy(context.getApplicationContext());
                    }
                    LogUtil.a("Track_SportManager", "SportManager instance hashcode: ", Integer.valueOf(f38155c.hashCode()));
                }
                if (f == null) {
                    f = ive.c().a();
                }
            }
        }
        return f38155c;
    }

    public void c(String str, LoadHotTrackCallBack loadHotTrackCallBack) {
        this.bd.c(str, loadHotTrackCallBack);
    }

    public boolean ar() {
        return f == null;
    }

    public boolean ax() {
        return this.cd;
    }

    public boolean au() {
        iwj iwjVar = this.aa;
        if (iwjVar != null) {
            return iwjVar.a();
        }
        return false;
    }

    public boolean as() {
        iwj iwjVar = this.aa;
        if (iwjVar != null) {
            return iwjVar.c();
        }
        return false;
    }

    public jpg v() {
        return this.ai;
    }

    public void d(IMapViewListener iMapViewListener) {
        if (this.dn.contains(iMapViewListener)) {
            return;
        }
        this.dn.add(iMapViewListener);
    }

    public void c(IMapViewListener iMapViewListener) {
        this.dn.remove(iMapViewListener);
    }

    public void c(ISportStateChangeListener iSportStateChangeListener) {
        if (iSportStateChangeListener != null && !this.er.contains(iSportStateChangeListener)) {
            this.er.add(iSportStateChangeListener);
        }
        LogUtil.a("Track_SportManager", "registerSportStateChangeListener size=", Integer.valueOf(this.er.size()));
    }

    public void b(ISportStateChangeListener iSportStateChangeListener) {
        if (iSportStateChangeListener != null && this.er.contains(iSportStateChangeListener)) {
            this.er.remove(iSportStateChangeListener);
        }
        LogUtil.a("Track_SportManager", "unregisterSportStateChangeListener size=", Integer.valueOf(this.er.size()));
    }

    private void dh() {
        this.fi = new StorageParams();
        this.dp = Integer.toString(20002);
    }

    private void dj() {
        long jCurrentTimeMillis = this.eu;
        if (this.bp) {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        this.u.d(this.gi, jCurrentTimeMillis, this.ew);
    }

    public int o() {
        return this.ep;
    }

    private void d(jpg jpgVar, long j2) {
        if (this.dd == null) {
            ReleaseLogUtil.a("Track_SportManager", " mLastSportLocation == null");
            return;
        }
        LogUtil.d("Track_SportManager", "isHiGeoEnable:" + this.be.h());
        if (this.be.c()) {
            this.an = this.be.e() - this.az;
        } else {
            this.an = izt.a(this.dd, jpgVar);
        }
        if (this.an > 0.0f) {
            if (this.cg) {
                long jCa = this.en + ca();
                this.en = jCa;
                this.dz.c(jCa);
            }
            if (this.cb) {
                ReleaseLogUtil.d("R_Track_SportManager", "countSportDistance recovery from gps lost");
                LogUtil.a("Track_SportManager", "recovery from gps lost(mTotalSportDistance ?= mGpsTotalDistance) ", LogAnonymous.a((long) this.fx), " ?= ", LogAnonymous.d(((int) this.cu) + ((int) this.an)));
                float f2 = this.fx;
                float f3 = this.cu + this.an;
                if (f2 < f3) {
                    this.fx = f3;
                    this.an = f3 - f2;
                } else {
                    this.an = 0.0f;
                }
                this.cu = this.fx;
                t(false);
            } else {
                float f4 = this.fx;
                float f5 = this.an;
                this.fx = f4 + f5;
                this.fp += f5;
            }
            ISportDistanceTimeCallback iSportDistanceTimeCallback = this.dy;
            if (iSportDistanceTimeCallback != null) {
                iSportDistanceTimeCallback.onDistanceChange((int) this.fx, j2 + this.fo, this.f6do.size());
            }
            if (this.be.c()) {
                this.az = this.be.e();
            }
        }
    }

    private void a(int i, int i2, float f2) {
        if (i >= i2 || i == 0) {
            return;
        }
        m(this.ag);
        int i3 = i2 - i;
        float f3 = i3;
        float f4 = f2 * f3;
        this.an = f4;
        if (this.ew == 264) {
            this.bh = f3;
            float fB = iym.b(i3, ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).getUserInfo(), 5, 0);
            this.an = fB;
            LogUtil.a("Track_SportManager", "estimateSportDistanceBySteps before calibration distance: ", Float.valueOf(f4), " after calibration distance : ", Float.valueOf(fB), " , step is :", Integer.valueOf(i3));
        }
        if (this.an > 0.0f) {
            this.n = System.currentTimeMillis();
            float f5 = this.fx + this.an;
            this.fx = f5;
            LogUtil.a("Track_SportManager", "estimateSportDistanceBySteps curDistance : ", Float.valueOf(f5), " lastGpsDistance : ", Float.valueOf(this.cu));
            ReleaseLogUtil.d("R_Track_SportManager", "estimateSportDistanceBySteps current distance");
            if (this.dy == null || this.cs) {
                return;
            }
            if (!dr() || this.em >= 5) {
                this.em = 0;
                LogUtil.d("Track_SportManager", "System.currentTimeMillis() + mTimeDiffBetweenGpsAndSystem = ", Long.valueOf(System.currentTimeMillis() + this.fs));
                bm();
            }
        }
    }

    private void m(int i) {
        if (this.fb == 3) {
            ive.c().a().updateStepPoint(i, System.currentTimeMillis());
        }
    }

    public void bm() {
        if (this.dy == null) {
            LogUtil.e("Track_SportManager", "mPaceCallback is null");
            return;
        }
        iyz iyzVar = this.dz;
        if (iyzVar == null || !iyzVar.b(this.cg)) {
            return;
        }
        ISportDistanceTimeCallback iSportDistanceTimeCallback = this.dy;
        int i = (int) this.fx;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j2 = this.fs;
        iSportDistanceTimeCallback.onDistanceChange(i, jCurrentTimeMillis + j2 + this.fo, this.f6do.size());
    }

    public float j() {
        return this.fx;
    }

    public float g() {
        if (UnitUtil.f()) {
            return (float) UnitUtil.e((((int) this.fx) * 1.0f) / 1000.0f, 3);
        }
        return (((int) this.fx) * 1.0f) / 1000.0f;
    }

    public float c() {
        gyv gyvVar = this.fh;
        if (gyvVar != null) {
            return gyvVar.c();
        }
        return 0.0f;
    }

    public int l() {
        if (dt()) {
            return this.fh.b().i();
        }
        return -1;
    }

    public int h() {
        gyv gyvVar = this.fh;
        if (gyvVar != null) {
            return Math.round(gyvVar.e() * 100.0f);
        }
        return 0;
    }

    public boolean az() {
        return this.fx >= 10.0f;
    }

    private boolean dn() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j2 = this.n;
        if (j2 != -1) {
            return b(jCurrentTimeMillis - j2);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Location location) {
        Bundle extras;
        if (location != null && (extras = location.getExtras()) != null) {
            this.be.c(extras.getInt("fitDistance", -1) != -1);
            if (this.be.h()) {
                this.be.c(extras);
            }
        }
        jal.a().b(location, this.ew);
        d(location);
        d(location, true);
        if (this.bv && m1949do()) {
            return;
        }
        d(location, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void et() {
        if (this.bf == null || !this.i) {
            return;
        }
        int i = this.ew;
        String str = (i == 258 || i == 257) ? "FitEnableMode:1029" : "";
        if (i == 259) {
            str = "FitEnableMode:1030";
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.bf.a(GeocodeSearch.GPS, str, null);
        this.i = false;
        this.be.c(false);
        this.be.b(0L);
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    private boolean m1949do() {
        if (this.dd == null || !ba() || !this.bl || this.gp != 5) {
            return false;
        }
        ReleaseLogUtil.d("Track_SportManager", "User stops moving, don't report location");
        return true;
    }

    private void d(Location location, boolean z) {
        if (this.ao == null) {
            if (this.ep != 1) {
                ReleaseLogUtil.a("Track_SportManager", "mExtendHandler == null");
                return;
            } else {
                dc();
                ReleaseLogUtil.d("Track_SportManager", "mExtendHandler == null so init it");
            }
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = z ? 103 : 102;
        Bundle bundle = new Bundle();
        bundle.putParcelable("Location", location);
        messageObtain.setData(bundle);
        this.ao.sendMessage(messageObtain);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Location location) {
        jpi jpiVar;
        if (this.dg.length() > 0) {
            StringBuilder sb = this.dg;
            sb.delete(0, sb.length());
        }
        if (this.ef.length() > 0) {
            StringBuilder sb2 = this.ef;
            sb2.delete(0, sb2.length());
        }
        if (location == null) {
            ReleaseLogUtil.a("Track_SportManager", "processLocation: aLocation is null");
            return;
        }
        this.db = location.getLatitude() + ((double) this.dj);
        double longitude = location.getLongitude() + ((double) this.di);
        this.dk = longitude;
        if (longitude > 180.0d) {
            this.dk = longitude - 360.0d;
        } else if (longitude < -180.0d) {
            this.dk = longitude + 360.0d;
        }
        double[] dArrA = LogAnonymous.a(this.dk, this.db);
        this.dk = dArrA[0];
        this.db = dArrA[1];
        e(location);
        dd();
        jpg jpgVarB = this.z.b(location);
        jpi jpiVar2 = new jpi(jpgVarB.d, jpgVarB.f38787a, location.getAccuracy(), location.getSpeed(), (float) location.getAltitude(), location.getBearing(), location.getTime(), location.getProvider());
        TrackAltitudeMgr trackAltitudeMgr = this.fz;
        if (trackAltitudeMgr != null) {
            jpiVar = jpiVar2;
            jpiVar.b(trackAltitudeMgr.d());
            StringBuilder sb3 = this.dg;
            sb3.append(",A10=");
            sb3.append(this.fz.d());
        } else {
            jpiVar = jpiVar2;
        }
        if (izn.e(jpgVarB.d, 0.0d) && izn.e(jpgVarB.f38787a, 0.0d)) {
            this.dg.append(" similar(0)>>>Filter");
            LogUtil.a("Track_SportManager", this.dg.toString());
            this.ef.append(" similar(0)>>>Filter");
            ReleaseLogUtil.d("Track_SportManager", this.ef.toString());
            return;
        }
        if ("network".equals(jpiVar.g())) {
            i(jpiVar);
            return;
        }
        c(location);
        this.ex.e(location);
        c(jpiVar);
        LogUtil.a("Track_SportManager", "processLocation mLogStringBuilder.toString():", this.dg.toString());
        ReleaseLogUtil.d("R_Track_SportManager", "processLocation point");
        StringBuilder sb4 = this.dg;
        sb4.delete(0, sb4.length());
        ReleaseLogUtil.d("Track_SportManager", this.ef.toString());
        StringBuilder sb5 = this.ef;
        sb5.delete(0, sb5.length());
    }

    private void e(Location location) {
        StringBuilder sb = this.dg;
        sb.append("dispatchLocationChanged");
        sb.append(",A01=");
        sb.append(System.currentTimeMillis());
        sb.append(",A02=");
        sb.append(this.db);
        sb.append(",A03=");
        sb.append(this.dk);
        sb.append(",A04=");
        sb.append(location.getAccuracy());
        sb.append(",A05=");
        sb.append(location.getSpeed());
        sb.append(",A06=");
        sb.append(location.getAltitude());
        sb.append(",A07=");
        sb.append(location.getBearing());
        sb.append(",A08=");
        sb.append(location.getProvider());
        sb.append(",A09=");
        sb.append(location.getTime());
        StringBuilder sb2 = this.ef;
        sb2.append("dispatchLocationChanged");
        sb2.append(",A01=");
        sb2.append(System.currentTimeMillis());
        sb2.append(",A02=");
        sb2.append(this.db);
        sb2.append(",A03=");
        sb2.append(this.dk);
        sb2.append(",A04=");
        sb2.append(location.getAccuracy());
        sb2.append(",A05=");
        sb2.append(location.getSpeed());
    }

    private void i(jpi jpiVar) {
        jpiVar.d(true);
        this.dg.append(">>>network");
        LogUtil.a("Track_SportManager", this.dg.toString());
        StringBuilder sb = this.dg;
        sb.delete(0, sb.length());
        this.ef.append(">>>network");
        ReleaseLogUtil.d("Track_SportManager", this.ef.toString());
        StringBuilder sb2 = this.ef;
        sb2.delete(0, sb2.length());
        h(jpiVar);
    }

    private void c(jpi jpiVar) {
        if (this.gc.a(k(jpiVar)) > 0) {
            LinkedList<fku> linkedListE = this.gc.e();
            this.ee = linkedListE;
            for (fku fkuVar : linkedListE) {
                h(new jpi(fkuVar.f(), fkuVar.i(), fkuVar.c(), fkuVar.d(), fkuVar.a(), fkuVar.b(), fkuVar.g(), fkuVar.j()));
            }
            this.gc.c();
            return;
        }
        if (this.gc.g()) {
            jpi jpiVar2 = new jpi(jpiVar);
            jpiVar2.d(true);
            this.dg.append(">>>is finding start");
            h(jpiVar2);
        }
    }

    private void h(jpi jpiVar) {
        jal.a().a(jpiVar, this.cg, this.ce);
        Message messageObtain = Message.obtain();
        messageObtain.what = 202;
        Bundle bundle = new Bundle();
        bundle.putSerializable("PointProcessed", jpiVar);
        messageObtain.setData(bundle);
        Handler handler = this.gk;
        if (handler != null) {
            handler.sendMessage(messageObtain);
        } else {
            ReleaseLogUtil.a("Track_SportManager", "mUiHandler == null");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(jpi jpiVar) {
        if (jpiVar == null) {
            ReleaseLogUtil.a("Track_SportManager", "drawPoint : bp is null");
            return;
        }
        if (this.cc) {
            LogUtil.a("Track_SportManager", " mIsReadingFlag>>>Filter");
            return;
        }
        if (this.cs) {
            LogUtil.a("Track_SportManager", " mIsWritingFlag>>>Filter");
            return;
        }
        jpg jpgVarB = izy.b(jpiVar);
        if (jpiVar.j()) {
            if (this.bz && this.dd == null) {
                c(jpiVar, 0);
                if ("network".equals(jpiVar.g())) {
                    e(jpgVarB);
                    return;
                }
                e(b(jpgVarB));
                b(jpiVar, false);
                this.bz = false;
                return;
            }
            return;
        }
        e(jpiVar, jpgVarB);
    }

    private void e(jpi jpiVar, jpg jpgVar) {
        int i = this.ep;
        if (i != 0) {
            if (i != 1) {
                return;
            }
            g(jpiVar);
        } else {
            this.ai = jpgVar;
            IMapDrawingUpdater iMapDrawingUpdater = this.dm;
            if (iMapDrawingUpdater != null) {
                iMapDrawingUpdater.addEndMarker(jpgVar);
            }
        }
    }

    private jpg b(jpg jpgVar) {
        return npl.c(jpgVar.d, jpgVar.f38787a) == 3 ? izt.a(jpgVar, this.ab, jaa.b()) : jpgVar;
    }

    private void j(jpi jpiVar) {
        if (npl.c(jpiVar.i(), jpiVar.h()) == 3) {
            jpg jpgVarA = izt.a(new jpg(jpiVar.i(), jpiVar.h()), this.ab, jaa.b());
            jpiVar.b(jpgVarA.d);
            jpiVar.c(jpgVarA.f38787a);
        }
    }

    private void g(jpi jpiVar) {
        jpi jpiVar2 = new jpi(jpiVar);
        j(jpiVar);
        if (this.ce) {
            this.ap.clear();
        }
        if (this.cg) {
            if (this.ce) {
                b(jpiVar);
                this.ce = false;
                ReleaseLogUtil.d("Track_SportManager", npt.d("Recovery ResumeSport TotalSportDistance=", Float.valueOf(this.fx)));
            } else {
                f(jpiVar);
                d(izy.b(jpiVar), jpiVar.f());
                this.ft += fkx.e(this.cv, k(jpiVar));
                ReleaseLogUtil.d("Track_SportManager", npt.d(" Recovery TotalSportDistance=", Float.valueOf(this.fx)));
            }
            this.cg = false;
        } else if (this.ce) {
            jal.a().a(jal.a().c(), this.ce);
            b(jpiVar, true);
            b(jpiVar);
            this.ce = false;
            ReleaseLogUtil.d("Track_SportManager", npt.d(" ResumeSport TotalSportDistance=", Float.valueOf(this.fx)));
        } else {
            b(jpiVar, true);
            long jF = jpiVar.f() - System.currentTimeMillis();
            this.fs = jF;
            this.ge.b(jF);
            d(izy.b(jpiVar), jpiVar.f());
            this.ft += fkx.e(this.cv, k(jpiVar));
            LogUtil.a("Track_SportManager", "GpsTime=", Long.valueOf(jpiVar.f()), ", TotalSportDistance=", Float.valueOf(this.fx), ", Total3DSportDistance=", Float.valueOf(this.ft));
        }
        d(jpiVar2);
        this.as = 0;
        t(false);
        if (!this.by) {
            this.by = true;
        }
        if (!this.cg && !this.ce) {
            this.ap.add(jpiVar);
            cj();
        }
        ff();
        ef();
    }

    private void c(jpi jpiVar, int i) {
        if (i == 0) {
            if (this.bo) {
                this.bo = false;
                this.t = this.en;
                this.p = jpiVar.g();
                return;
            }
            return;
        }
        if (i == 1) {
            if (this.bj) {
                this.bj = false;
                this.r = this.en;
                String strG = jpiVar.g();
                this.q = strG;
                if (this.t < 0) {
                    this.t = this.r;
                }
                if (this.p == null) {
                    this.p = strG;
                    return;
                }
                return;
            }
            return;
        }
        if (i != 2) {
            LogUtil.a("Track_SportManager", "startPointBi wrong type");
            return;
        }
        if (this.cb) {
            ReleaseLogUtil.d("Track_SportManager", "Not starting point BI when GPS lost");
            return;
        }
        LogUtil.a("Track_SportManager", "start point BI");
        HashMap map = new HashMap(9);
        d(this.en, map);
        lmf.d().c(this.x, AnalyticsValue.BI_TRACK_SPORT_START_LOCATION_UPDATA.value(), map, 0);
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(8);
        linkedHashMap.put(OpAnalyticsConstants.ORIENTATE_DURATION_MS, String.valueOf(this.en));
        d(linkedHashMap);
        OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_GPS_90020001.value(), linkedHashMap);
    }

    private void d(LinkedHashMap<String, String> linkedHashMap) {
        linkedHashMap.put(BleConstants.SPORT_TYPE, String.valueOf(this.ew));
        if (TimeUnit.MILLISECONDS.toMinutes(this.t) <= 3) {
            linkedHashMap.put("isLocationOverTimeLimit", String.valueOf(false));
        } else {
            linkedHashMap.put("isLocationOverTimeLimit", String.valueOf(true));
        }
        linkedHashMap.put("locationPointProvider", this.p);
        linkedHashMap.put("startPointProvider", this.q);
        linkedHashMap.put("startPointGPSstatus", String.valueOf(this.aw));
    }

    private void d(long j2, Map<String, Object> map) {
        map.put(BleConstants.SPORT_TYPE, Integer.valueOf(this.ew));
        if (TimeUnit.MILLISECONDS.toMinutes(this.t) <= 3 && TimeUnit.MILLISECONDS.toMinutes(this.r) <= 3) {
            map.put("isLocationOverTimeLimit", false);
            map.put("isStartOverTimeLimit", false);
            map.put("locationPointTime", Long.valueOf(this.t));
            map.put("startPointTime", Long.valueOf(this.r));
            map.put("trueStartTime", Long.valueOf(j2));
        } else if (TimeUnit.MILLISECONDS.toMinutes(this.t) <= 3 && TimeUnit.MILLISECONDS.toMinutes(this.r) > 3) {
            map.put("isLocationOverTimeLimit", false);
            map.put("isStartOverTimeLimit", true);
        } else {
            map.put("isLocationOverTimeLimit", true);
            map.put("isStartOverTimeLimit", true);
        }
        map.put("locationPointProvider", this.p);
        map.put("startPointProvider", this.q);
        map.put("startPointGPSstatus", Integer.valueOf(this.aw));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fe() {
        ixr ixrVar = this.fc;
        this.u.c(this.an, this.en, y() / 3.6f, ixrVar != null ? ixrVar.f() / 60.0f : 0.0f);
    }

    private void b(jpi jpiVar, boolean z) {
        Map<Long, double[]> map = this.f6do;
        if (map == null) {
            ReleaseLogUtil.e("Track_SportManager", "drawFirstStartMarker mMotionPathPointsBuffer is null");
            return;
        }
        int i = this.gj;
        ReleaseLogUtil.d("Track_SportManager", "mTrackType: ", Integer.valueOf(i), "mMapUpdater: ", this.dm, "mMotionPathPointsBuffer: ", Integer.valueOf(map.size()));
        if (this.f6do.size() == 0) {
            c(jpiVar, 1);
            if (z) {
                bq().b();
                a(jpiVar);
                c(jpiVar, 2);
            }
            IMapDrawingUpdater iMapDrawingUpdater = this.dm;
            if (iMapDrawingUpdater != null) {
                iMapDrawingUpdater.addStartMarker(izy.b(jpiVar));
            }
        }
    }

    private void a(jpi jpiVar) {
        long jCurrentTimeMillis = System.currentTimeMillis() - jpiVar.f();
        if (Math.abs(jCurrentTimeMillis) > TimeUnit.SECONDS.toMillis(20L)) {
            this.fo = jCurrentTimeMillis;
            this.ge.d(jCurrentTimeMillis);
        }
        ReleaseLogUtil.d("Track_SportManager", "mTimeOnceDiff is ", Long.valueOf(this.fo));
    }

    private void e(jpg jpgVar) {
        IMapDrawingUpdater iMapDrawingUpdater = this.dm;
        if (iMapDrawingUpdater != null) {
            iMapDrawingUpdater.drawFirstLocation(jpgVar);
        }
    }

    private void f(jpi jpiVar) {
        IMapDrawingUpdater iMapDrawingUpdater;
        if (this.gj == 1 || (iMapDrawingUpdater = this.dm) == null) {
            ReleaseLogUtil.a("Track_SportManager", "drawRecoveryLine params invalid!");
        } else {
            iMapDrawingUpdater.drawRecoveryLine(this.dd, izy.b(jpiVar));
        }
    }

    private void b(jpi jpiVar) {
        IMapDrawingUpdater iMapDrawingUpdater = this.dm;
        if (iMapDrawingUpdater == null) {
            return;
        }
        iMapDrawingUpdater.drawPauseLine(this.dd, izy.b(jpiVar));
    }

    private void ef() {
        Map<Long, double[]> map = this.f6do;
        if (map == null) {
            LogUtil.e("Track_SportManager", "saveLocationPoints mMotionPathPointsBuffer is null !");
            return;
        }
        int size = map.size();
        if (size == 0) {
            LogUtil.j("Track_SportManager", "saveLocationPoints mMotionPathPointsBuffer size is 0 !");
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (size % 8 != 0) {
            if (size <= 8) {
                return;
            }
            if (jElapsedRealtime - this.ae <= TimeUnit.SECONDS.toMillis(30L)) {
                return;
            }
        }
        ej();
        this.ae = jElapsedRealtime;
    }

    @Override // com.huawei.healthcloud.plugintrack.model.TimeUpdater
    public long getSportDuration() {
        return this.en;
    }

    @Override // com.huawei.healthcloud.plugintrack.model.TimeUpdater
    public long getSportDurationBySecond() {
        return this.en / 1000;
    }

    @Override // com.huawei.healthcloud.plugintrack.model.TimeUpdater
    public String getFormattedTime() {
        return UnitUtil.e(Math.round(this.en / 1000.0f));
    }

    public int k() {
        return this.ew;
    }

    public boolean aq() {
        return this.gj == 1;
    }

    public void d(int i) {
        this.ew = i;
    }

    public void bk() {
        pqm.a().e("Track_SportManager", new IBaseResponseCallback() { // from class: ixg
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                LogUtil.a("Track_SportManager", "S-TAG Wear Abnormal Status is false");
            }
        });
    }

    public void bv() {
        pqm.a().d("Track_SportManager");
    }

    public void bw() {
        ivm ivmVar;
        ISportDistanceTimeCallback iSportDistanceTimeCallback;
        this.ex.a();
        this.cn = jaa.g();
        if (!aq()) {
            SportMusicInteratorService.d();
            ixs.a().g();
            if (du()) {
                SportMusicController.c().e(this.ew);
            }
        }
        cw();
        this.dz.a(this.be);
        this.el.onStartSport();
        if (this.ew != 264) {
            this.ax = new izp();
        } else if (izn.b(this.x)) {
            this.fb = 1;
        }
        bx();
        t(false);
        a(this.dz);
        c(this.dz);
        if (!this.bp && (iSportDistanceTimeCallback = this.dy) != null) {
            iSportDistanceTimeCallback.onDistanceChange(0, System.currentTimeMillis(), 0);
        }
        if (this.bp && this.dq == 4 && this.aa == null) {
            iwj iwjVar = new iwj();
            this.aa = iwjVar;
            iwjVar.e((MotionPathSimplify) null);
        }
        di();
        ReleaseLogUtil.d("R_Track_SportManager", "startSport begin");
        LogAnonymous.c();
        ee();
        cz();
        j = this.et.d(this.gj, this.ew, cm(), this.eh);
        dg();
        dj();
        ed();
        em();
        jal.a().g();
        if (!this.bk) {
            dk();
        }
        if (f != null) {
            this.ey = f.getCurrentSteps();
            if (!at() && !this.cl) {
                this.ea = 0;
            }
        }
        this.cm = false;
        this.bq = false;
        ec();
        ReleaseLogUtil.d("Track_SportManager", "startSport reportSportDataToListener");
        f(ah());
        if (this.bp) {
            d(jac.a(this.x), jac.e(this.x));
        }
        if (this.er.size() > 0) {
            for (ISportStateChangeListener iSportStateChangeListener : this.er) {
                if (iSportStateChangeListener != null) {
                    iSportStateChangeListener.onStartSport();
                }
            }
        }
        if (this.gf == null) {
            this.gf = new ixy(this, this.ew);
        }
        if (!aq() && (ivmVar = this.ga) != null) {
            ivmVar.c(this.x);
            i(true);
        }
        HealthSportingNotificationHelper healthSportingNotificationHelper = new HealthSportingNotificationHelper(this.x, this.ew, true, false, true);
        this.ev = healthSportingNotificationHelper;
        c(healthSportingNotificationHelper);
        iyn.e();
        bk();
        izn.d(this.ew);
        cx();
        cu();
        i(1);
        this.eg = String.valueOf(this.eu);
    }

    private void ec() {
        pqm.a().b(this.al);
    }

    private void n(boolean z) {
        LogUtil.a("Track_SportManager", "checkDevicesIsSupportNewStep = ", Boolean.valueOf(z));
        if (f38155c == null) {
            LogUtil.j("Track_SportManager", "checkDevicesIsSupportNewStep mInstance == null");
        } else {
            f38155c.cm = z;
        }
    }

    private void r(boolean z) {
        LogUtil.a("Track_SportManager", "isDeliverStepRate = ", Boolean.valueOf(z));
        this.bq = z;
    }

    private void i(int i) {
        int i2 = this.gj;
        if (i2 == 1) {
            LogUtil.j("Track_SportManager", "Sport Track Type ", Integer.valueOf(i2));
            return;
        }
        int i3 = this.ew;
        if (i3 != 257 && i3 != 258 && i3 != 264 && i3 != 282 && i3 != 260) {
            LogUtil.j("Track_SportManager", "mSportType  ", Integer.valueOf(i3));
            return;
        }
        if (!CommonUtil.bg()) {
            LogUtil.j("Track_SportManager", " is not emui ");
            return;
        }
        try {
            Class<?> cls = Class.forName("com.huawei.android.os.PowerManagerEx");
            cls.getMethod("setSportState", Integer.TYPE).invoke(cls, Integer.valueOf(i));
            LogUtil.a("Track_SportManager", " sportState ", Integer.valueOf(i));
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            LogUtil.j("Track_SportManager", "ClassNotFoundException or NoSuchMethodException");
        }
    }

    private void cx() {
        lsy.a(new Runnable() { // from class: iwx
            @Override // java.lang.Runnable
            public final void run() {
                this.d.dy();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void dy() {
        HiUserPreference userPreference = HiHealthManager.d(BaseApplication.getContext()).getUserPreference("custom.UserPreference_RunningPaceZone_Config");
        if (userPreference != null) {
            String value = userPreference.getValue();
            this.dw = value;
            LogUtil.a("Track_SportManager", "mPaceZoneConfig:", value);
        }
    }

    private void cu() {
        lsy.a(new Runnable() { // from class: ixk
            @Override // java.lang.Runnable
            public final void run() {
                this.e.ds();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ds() {
        gzz.a();
        int[] iArrD = gzz.d(this.w, this.dh, this.ay);
        this.ba = iArrD;
        LogUtil.a("Track_SportManager", "mHRZoneConfig :", Arrays.toString(iArrD));
    }

    private boolean du() {
        return CommonUtil.bh() && jaa.c(this.x) && izn.a(this.x) == 0 && !au() && !aq();
    }

    private void di() {
        if (this.gd == null) {
            this.gd = new ixu();
        }
        this.gd.d(this.x, this.bp);
        this.gd.e(this);
    }

    private void cw() {
        o(true);
        this.g = 0;
        this.bu = true;
        this.bt = true;
        this.bn = false;
        df();
        db();
        if (this.eo == null) {
            this.eo = jaa.d();
        }
        if (this.eu == 0) {
            this.eu = System.currentTimeMillis();
        }
        j = false;
        this.df = this.ep;
        this.ep = 1;
        this.n = System.currentTimeMillis();
    }

    private void o(boolean z) {
        this.co = z;
        KeyValDbManager.d(this.x).b("already_sport", String.valueOf(z));
    }

    private void db() {
        dea deaVar = new dea();
        this.ad = deaVar;
        deaVar.b(new CourseEnvParams.OnInitCompleteListener() { // from class: ixc
            @Override // com.huawei.health.sport.model.CourseEnvParams.OnInitCompleteListener
            public final void onInitComplete() {
                this.e.dv();
            }
        });
        this.ad.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void dv() {
        this.bb = true;
        LogUtil.a("Track_SportManager", "initConfigParams mHasInitConfig: true");
    }

    private void ee() {
        if (this.ew != 264) {
            npg npgVarBq = bq();
            if (npn.c(this.x)) {
                if (npgVarBq.a()) {
                    l(npgVarBq.e());
                } else {
                    l(3);
                }
            }
            c("sportTrackLocation");
            a("sportTrackLocation");
            ea();
            npgVarBq.e("sportTrackTempLocation");
            return;
        }
        l(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(int i) {
        if (i < this.dc) {
            LogUtil.e("Track_SportManager", "estimateDistanceByLaps laps back");
            return;
        }
        int i2 = this.ah;
        this.dc = i2;
        this.ah = i;
        if (i - i2 > 10) {
            LogUtil.e("Track_SportManager", "laps is too much");
            return;
        }
        if (this.cb) {
            if (this.cr) {
                this.cr = false;
                return;
            }
            LogUtil.a("Track_SportManager", "mCurrentTotalLaps", Integer.valueOf(i), "mLastTotalLaps", Integer.valueOf(i2));
            j(this.ah, this.dc);
            Handler handler = this.gk;
            if (handler != null) {
                handler.sendEmptyMessage(301);
            }
        }
    }

    private void j(int i, int i2) {
        this.v++;
        int i3 = i - i2;
        if (i3 == 0) {
            LogUtil.e("Track_SportManager", "laps no more");
            return;
        }
        float f2 = i3 * this.s;
        this.an = f2;
        if (f2 > 0.0f) {
            float f3 = this.fx + f2;
            this.fx = f3;
            LogUtil.a("Track_SportManager", "estimateDistanceByLaps curDistance : ", Float.valueOf(f3), " lastGpsDistance : ", Float.valueOf(this.cu));
            ReleaseLogUtil.d("R_Track_SportManager", "estimateDistanceByLaps current distance");
            if (this.dy == null || this.cs || this.v < 5) {
                return;
            }
            this.v = 0;
            LogUtil.a("Track_SportManager", "System.currentTimeMillis() + mTimeDiffBetweenGpsAndSystem = ", Long.valueOf(System.currentTimeMillis() + this.fs));
            this.dy.onDistanceChange((int) this.fx, System.currentTimeMillis() + this.fs + this.fo, this.f6do.size());
        }
    }

    private void dk() {
        if (!UnitUtil.f() && !aq()) {
            iya iyaVar = new iya(this.ew, this.dq);
            this.gl = iyaVar;
            iyaVar.a(this.en, (int) this.fx);
            if (dt()) {
                gze gzeVarB = this.fh.b();
                this.gl.a(gzeVarB.i(), this.fx, u() * 1000.0f, this.en, gzeVarB.h() + gzeVarB.d());
                if (gzeVarB.i() == 1) {
                    this.gl.b(gzeVarB.h(), this.fx);
                }
            }
        }
        if (at() || this.gl == null) {
            return;
        }
        if (!au()) {
            this.gl.j();
        }
        this.ch = true;
    }

    public boolean ai() {
        return this.ch;
    }

    private void ea() {
        LogUtil.a("Track_SportManager", "requestOriginalGpsStatus");
        if (this.ax == null) {
            ReleaseLogUtil.e("Track_SportManager", "requestOriginalGpsStatus mGpsPointBiUtil is null");
        } else {
            bq().c(this.ax, "sportTrackLocation");
        }
    }

    private void cc() {
        LogUtil.a("Track_SportManager", "cancelOriginalGpsStatus");
        bq().b("sportTrackLocation");
    }

    private void ed() {
        if (ba()) {
            es();
            er();
            ixr ixrVar = this.fc;
            if (ixrVar == null) {
                this.fc = new ixr(f, this);
            } else {
                ixrVar.b(f);
                this.fc.a(this);
            }
            if (f != null) {
                f.setStepInterval(this.cj);
            }
            this.fc.e(this.fb);
            return;
        }
        this.fc = null;
        ReleaseLogUtil.d("Track_SportManager", "Don't registerRealStepListener when not supported");
    }

    public boolean at() {
        return this.bp;
    }

    private void cz() {
        switch (this.ew) {
            case 257:
                this.gc.e(0);
                break;
            case 258:
                this.gc.e(1);
                break;
            case 259:
                this.gc.e(2);
                break;
            default:
                this.gc.e(1);
                break;
        }
    }

    private void er() {
        this.em = 0;
        if (f == null) {
            ReleaseLogUtil.a("Track_SportManager", "startGetStepRateData mPluginTrackAdapter is null!");
            return;
        }
        int i = this.fb == 1 ? 1000 : 5000;
        this.fa = i;
        LogUtil.a("Track_SportManager", "startGetStepRateData regStepRateListener!");
        f.regStepRateListener(new IStepRateCallback() { // from class: iwy.1
            @Override // com.huawei.healthcloud.plugintrack.model.IStepRateCallback
            public void report(int i2, int i3) {
                iwy iwyVar = iwy.this;
                iwyVar.b(i2, iwyVar.fa);
                if (iwy.this.fb == 2 || iwy.this.fb == 3) {
                    i2 = iwt.d().b();
                }
                StringBuilder sb = iwy.this.fd;
                sb.append("step: ");
                sb.append(i2);
                sb.append(" motion: ");
                sb.append(i3);
                sb.append(" stepType: ");
                sb.append(iwy.this.fb);
                sb.append(" ");
                long jA = LogUtil.a(5000, iwy.this.da);
                if (jA != -1) {
                    ReleaseLogUtil.d("Track_SportManager", npt.d(iwy.this.fd.toString()));
                    iwy.this.fd.delete(0, iwy.this.fd.length());
                    iwy.this.da = jA;
                }
                iwy.this.f(i2, i3);
            }
        }, i, this.fb);
    }

    private void ex() {
        if (ba()) {
            int i = this.fb;
            if (i == 2 || i == 3) {
                this.fb = this.dr;
                this.dr = 0;
                ixr ixrVar = this.fc;
                if (ixrVar != null) {
                    ixrVar.d(0);
                }
                LogUtil.a("Track_SportManager", "stopLinkageWearStep switch from SPORT_LINKAGE_WEAR_STEP to ", Integer.valueOf(this.fb));
            }
            iwt.d().a();
            this.bi = false;
            this.cq = false;
        }
    }

    private boolean cg() {
        List<ivo.d> listB;
        if (!this.cq) {
            if (!this.br && (listB = ivo.a().b(this.ew)) != null && listB.size() > 0) {
                this.br = true;
            }
            if ((eej.c() == null || !eej.c().isSupportWorkout()) && !this.br) {
                ReleaseLogUtil.d("Track_SportManager", "checkStepStrategy device not support Workout! ConnectedSensor = false");
                return false;
            }
            if (this.bi) {
                return false;
            }
            if (izn.c(this.x)) {
                ReleaseLogUtil.d("Track_SportManager", "checkStepStrategy AutoPause is open, not support Linkage Wear Step!");
                OpAnalyticsUtil.getInstance().setEventOneErrorCode(OperationKey.HEALTH_APP_STEP_COUNT_85070014.value(), 1002);
                this.bi = true;
                return false;
            }
            int i = this.ew;
            if (i != 264) {
                ReleaseLogUtil.d("Track_SportManager", "checkStepStrategy mSportType is ", Integer.valueOf(i), ", not TREADMILL");
                return false;
            }
            this.cq = true;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i, int i2) {
        if (cg()) {
            if (this.br) {
                if (this.fb == 3) {
                    return;
                }
            } else if (this.fb == 2) {
                return;
            }
            int i3 = this.ep;
            if (i3 != 1) {
                ReleaseLogUtil.d("Track_SportManager", "checkStepStrategy mSportStatus is ", Integer.valueOf(i3), ", not SPORTING");
                return;
            }
            if (this.cw != 0 && System.currentTimeMillis() - this.cw < 10000) {
                ReleaseLogUtil.d("Track_SportManager", "checkStepStrategy just paused!");
                return;
            }
            if (this.fc == null || iwt.d() == null) {
                ReleaseLogUtil.d("Track_SportManager", "checkStepStrategy null mStepRateUtils ", this.fc);
                return;
            }
            if (System.currentTimeMillis() - iwt.d().d(20) > f.getDefaultDelayInterval() * 4) {
                if (System.currentTimeMillis() - iwt.d().d(10) > f.getDefaultDelayInterval() * 10) {
                    ReleaseLogUtil.d("Track_SportManager", "checkStepStrategy wear step report not continuous! wearLastUpdateTime = ", Long.valueOf(iwt.d().d(20)), " sensorLastUpdateTime", Long.valueOf(iwt.d().d(10)));
                    return;
                }
            }
            int defaultDelayInterval = 10000 / f.getDefaultDelayInterval();
            if (!iwt.d().g(defaultDelayInterval + 1)) {
                ReleaseLogUtil.d("Track_SportManager", "checkStepStrategy linkage wear step array not enough!");
                return;
            }
            int i4 = i2 != 0 ? 10000 / i2 : 2;
            if (this.fb == 2) {
                int iB = iwt.d().b(20);
                if (iB >= i4) {
                    int i5 = iB - i4;
                    if (this.am == iwt.d().b(20, i5)) {
                        iwt.d().b(20, i5);
                        e(this.am, defaultDelayInterval);
                    }
                }
            } else if (this.fc.i() >= i4) {
                ixr ixrVar = this.fc;
                if (i == ixrVar.a(ixrVar.i() - i4)) {
                    e(i, defaultDelayInterval);
                }
            }
            ReleaseLogUtil.d("Track_SportManager", "checkStepStrategy not satisfy ");
        }
    }

    private void e(int i, int i2) {
        if (this.fb == 2 || !d(i, i2, 20, 2)) {
            d(i, i2 / 5, 10, 3);
        }
    }

    private boolean d(int i, int i2, int i3, int i4) {
        if (iwt.d().c(i2, i3) == 0) {
            return false;
        }
        this.dr = this.fb;
        this.fb = i4;
        ixr ixrVar = this.fc;
        if (ixrVar != null) {
            ixrVar.d(i4);
        }
        iwt.d().j(i3);
        iwt.d().c(i);
        ReleaseLogUtil.d("Track_SportManager", "startLinkageWearStep switch from ", Integer.valueOf(this.dr), " to ", Integer.valueOf(this.fb));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(int i, int i2) {
        g(i2);
        this.gp = i2;
        int i3 = this.am;
        this.de = i3;
        this.am = i;
        a(i3, i);
        if (dr()) {
            this.em++;
        }
        if (this.ew == 264 && this.ep == 1) {
            if (!this.bu) {
                a(this.de, this.am, this.gq * izu.e(this.am - this.de));
                Handler handler = this.gk;
                if (handler != null) {
                    handler.sendEmptyMessage(301);
                }
            }
            this.bu = false;
            return;
        }
        int i4 = this.am - this.de;
        if (i4 > 30) {
            LogUtil.j("Track_SportManager", "Steps in 5s is to large don't estimateSportDistanceBySteps");
            return;
        }
        if (!this.cb && this.ep == 1) {
            this.as += i4;
        }
        if (h(i2)) {
            int i5 = this.de;
            int i6 = this.as;
            int i7 = i5 - i6;
            if (i7 > 0 && i6 < 150) {
                i5 = i7;
            }
            this.as = 0;
            a(i5, this.am, this.gq);
            Handler handler2 = this.gk;
            if (handler2 != null) {
                handler2.sendEmptyMessage(301);
            }
        }
    }

    private void g(int i) {
        if (i == 5) {
            if (this.bx) {
                return;
            }
            ReleaseLogUtil.d("Track_SportManager", "User stop moving");
            this.bx = true;
            this.fm = System.currentTimeMillis();
            return;
        }
        if (this.bx) {
            ReleaseLogUtil.d("Track_SportManager", "User resume moving");
            this.fl += System.currentTimeMillis() - this.fm;
            this.fk++;
            this.bx = false;
        }
    }

    private boolean h(int i) {
        return i != 5 && this.ep == 1 && this.bs && this.cb;
    }

    private boolean dr() {
        return this.fb == 1 || this.dr == 1;
    }

    private void a(int i, int i2) {
        if (this.bt) {
            LogUtil.a("Track_SportManager", "developIndoorRunningInfo,mIsDevelopFirstIndoorRun=true");
            this.bt = false;
            return;
        }
        this.ez = this.fc.c(i2, (this.fb == 1 || this.dr == 1) ? 6 : 1);
        if (i >= i2 || i == 0) {
            return;
        }
        if (this.ep != 1) {
            LogUtil.a("Track_SportManager", "developIndoorRunningInfo, mSportStatus != MapTrackingConstants.SPORTS_STATUS_SPORTING");
            return;
        }
        int i3 = i2 - i;
        float f2 = this.aj;
        float fE = izu.e(i3);
        this.ag += i3;
        this.fr += i3 * f2 * fE;
        this.fu += iym.b(i3, ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).getUserInfo(), 5, 0);
    }

    private void ce() {
        this.em = 0;
        if (f == null) {
            LogUtil.e("Track_SportManager", "cancelGetStepRateData mPluginTrackAdapter is null!");
            return;
        }
        int i = this.fb;
        if (i == 2 || i == 3) {
            f.unregStepRateListener(this.dr);
        } else {
            f.unregStepRateListener(this.fb);
        }
    }

    private void bx() {
        if (this.eq == null) {
            this.eq = new def(this.ew);
        }
        this.eq.a();
    }

    private void fd() {
        if (this.eq == null) {
            this.eq = new def(this.ew);
        }
        this.eq.c();
    }

    public void bf() {
        LogUtil.a("Track_SportManager", "pauseFromStopSport");
        this.cf = true;
        bd();
        this.cf = false;
    }

    public void bd() {
        this.ex.e(this.dl, this.dt);
        this.n = -1L;
        this.ep = 2;
        this.el.onPauseSport();
        this.ar = cn();
        List<jpi> list = this.ap;
        if (list != null && !list.isEmpty()) {
            ch();
        }
        t();
        if (du() && this.ge.h(this.ew) == 1) {
            SportMusicController.c().a(1, (String) null);
        }
        ReleaseLogUtil.d("Track_SportManager", "pauseSport", " begin");
        unregisterGps();
        jal.a().h();
        ixr ixrVar = this.fc;
        if (ixrVar != null) {
            ixrVar.n();
        }
        iya iyaVar = this.gl;
        if (iyaVar != null && !this.cf) {
            iyaVar.a();
        }
        IMapDrawingUpdater iMapDrawingUpdater = this.dm;
        if (iMapDrawingUpdater != null) {
            iMapDrawingUpdater.pauseSportClear();
        }
        if (this.er.size() > 0) {
            for (ISportStateChangeListener iSportStateChangeListener : this.er) {
                if (iSportStateChangeListener != null) {
                    iSportStateChangeListener.onPauseSport();
                }
            }
        }
        ReleaseLogUtil.d("Track_SportManager", "pauseSport reportSportDataToListener");
        f(ah());
        fc();
        fd();
        cb();
        ej();
        ivm ivmVar = this.ga;
        if (ivmVar != null) {
            ivmVar.b(this.x);
        }
        izp izpVar = this.ax;
        if (izpVar != null) {
            izpVar.d();
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.cx = jCurrentTimeMillis;
        this.u.e(jCurrentTimeMillis, -1);
        e(2);
        i(0);
        c(1, ive.c().h());
    }

    public void c(int i, int i2) {
        LogUtil.a("Track_SportManager", "doSportStatusBi event:", Integer.valueOf(i), " statusSource:", Integer.valueOf(i2));
        if (this.aa != null) {
            idy.c(i, ive.c().h() == 1, this.aa.e());
        }
    }

    private void cb() {
        if (this.f6do == null) {
            return;
        }
        long jCt = ct();
        if (jCt > 0) {
            double[] dArr = this.f6do.get(Long.valueOf(jCt - 1));
            if (dArr == null || dArr.length < 2 || !izt.d(dArr[0], dArr[1])) {
                double[] dArr2 = {90.0d, -80.0d, 0.0d, System.currentTimeMillis()};
                this.f6do.put(Long.valueOf(jCt), dArr2);
                synchronized (f38154b) {
                    this.fj.put(Long.valueOf(jCt), dArr2);
                }
            }
        }
    }

    private void fc() {
        this.v = 0;
        this.et.h();
    }

    private void ch() {
        IMapDrawingUpdater iMapDrawingUpdater = this.dm;
        if (iMapDrawingUpdater != null) {
            iMapDrawingUpdater.forceDrawLineToMap();
        }
    }

    public void bl() {
        bx();
        this.n = System.currentTimeMillis();
        this.cy = SystemClock.elapsedRealtime();
        this.cw = System.currentTimeMillis();
        this.ep = 1;
        this.el.onResumeSport();
        this.ce = true;
        this.cr = true;
        this.bu = true;
        this.bt = true;
        ixr ixrVar = this.fc;
        if (ixrVar != null) {
            ixrVar.l();
        }
        ReleaseLogUtil.d("Track_SportManager", "resumeSport", "begin");
        registerGps();
        if (du() && this.ge.h(this.ew) == 1 && !SportMusicController.c().d()) {
            SportMusicController.c().a(2, (String) null);
        }
        iya iyaVar = this.gl;
        if (iyaVar != null) {
            iyaVar.f();
        }
        this.et.c(this.ew, this.eh);
        int i = this.am;
        this.ey = i;
        ReleaseLogUtil.d("Track_SportManager", "resumeSport reportSportDataToListener ", Integer.valueOf(i));
        f(ah());
        if (this.er.size() > 0) {
            for (ISportStateChangeListener iSportStateChangeListener : this.er) {
                if (iSportStateChangeListener != null) {
                    iSportStateChangeListener.onResumeSport();
                }
            }
        }
        jal.a().f();
        ivm ivmVar = this.ga;
        if (ivmVar != null) {
            ivmVar.c(this.x);
        }
        izp izpVar = this.ax;
        if (izpVar != null) {
            izpVar.b();
        }
        this.dx++;
        this.dv += System.currentTimeMillis() - this.cx;
        this.u.e(System.currentTimeMillis(), this.ew);
        e(1);
        i(1);
        c(2, ive.c().h());
    }

    public void bs() {
        if (this.o != null || this.bk) {
            if (!this.bk && this.l != null) {
                StringBuilder sb = new StringBuilder(16);
                sb.append("stopBackgroundTrack time ");
                sb.append(this.en);
                sb.append(" dis ");
                sb.append(this.fx);
                e(sb.toString());
                this.l.a(true);
            }
            TrackMainMapActivity.e(BaseApplication.getContext());
            bt();
            ixr ixrVar = this.fc;
            if (ixrVar != null) {
                ixrVar.c(true);
            }
            bn();
        }
    }

    public void l(boolean z) {
        TrackMainMapActivity.e(BaseApplication.getContext());
        m(z);
        bh();
    }

    public void m(boolean z) {
        int i;
        if (z && (i = this.ep) == 3) {
            ReleaseLogUtil.e("Track_SportManager", "stopSport failed with mSportStatus is:", Integer.valueOf(i));
            return;
        }
        this.el.m825x32b3e3a1();
        s(z);
        d(this.dz);
        b(this.dz);
        d(false);
        fh();
        if (this.gl != null && z) {
            if (LanguageUtil.o(this.x)) {
                this.gl.o();
            } else {
                this.gl.i();
            }
        }
        eh();
        this.ep = 3;
        eb();
        this.az = 0;
        LogAnonymous.e();
        if (this.f6do == null) {
            LogUtil.e("Track_SportManager", "stopSport() mMotionPathPointsBuffer is null!");
            return;
        }
        fm();
        ReleaseLogUtil.d("Track_SportManager", "stopSport reportSportDataToListener");
        da();
        this.et.j();
        q(z && this.fq);
        ek();
        jal.a().c(this.en, this.gj, this.dt, z);
        this.f6do.clear();
        this.ge.e(0L);
        this.ge.d(0L);
        this.fo = 0L;
        this.fq = true;
        iwd iwdVar = this.l;
        if (iwdVar != null) {
            iwdVar.d(z, this.eu, cn(), g());
        }
        bu();
        ixu ixuVar = this.gd;
        if (ixuVar != null) {
            ixuVar.b();
        }
        iwj iwjVar = this.aa;
        if (iwjVar != null) {
            iwjVar.d();
        }
        cd();
        ex();
        bv();
        ck();
        i(0);
        fd();
        if (z) {
            c(3, ive.c().h());
        } else {
            c(6, ive.c().h());
        }
        this.ao.sendEmptyMessage(402);
    }

    private void s(boolean z) {
        ixr ixrVar;
        SportMusicController.c().a(false);
        if (this.ew == 264 && this.gm == 1 && (ixrVar = this.fc) != null) {
            ixrVar.a();
            this.ez = 0.0d;
        }
        o(false);
        ReleaseLogUtil.d("Track_SportManager", "stopSport() start, toSaveData ", Boolean.valueOf(z));
        this.ar = cn();
        ivm ivmVar = this.ga;
        if (ivmVar != null) {
            ivmVar.b(this.x);
        }
        ixu ixuVar = this.gd;
        if (ixuVar != null) {
            ixuVar.d();
        }
    }

    private void fh() {
        if (ba()) {
            ce();
            ixr ixrVar = this.fc;
            if (ixrVar != null) {
                ixrVar.c(true);
                this.fc.k();
            }
            fb();
            return;
        }
        LogUtil.a("Track_SportManager", "Don't unregisterRealStepListener when not supported");
    }

    private void eb() {
        cc();
        g("sportTrackLocation");
        ev();
    }

    private void ev() {
        ew();
        TrackPauseDataMgr trackPauseDataMgr = this.gh;
        if (trackPauseDataMgr != null) {
            trackPauseDataMgr.b();
            b(this.gh);
        }
        TrackDisDataMgr trackDisDataMgr = this.gb;
        if (trackDisDataMgr != null) {
            trackDisDataMgr.b();
        }
    }

    private void da() {
        f(ah());
    }

    private void cd() {
        LogUtil.j("Track_SportManager", "clear restart sp cache");
        ive.c().d();
    }

    private void fm() {
        if (this.er.size() > 0) {
            for (ISportStateChangeListener iSportStateChangeListener : this.er) {
                if (iSportStateChangeListener != null) {
                    iSportStateChangeListener.m825x32b3e3a1();
                }
            }
        }
    }

    void d(boolean z) {
        if (this.bn) {
            return;
        }
        Map<Long, double[]> map = this.f6do;
        if (map != null && map.size() > 0) {
            this.dz.a((int) this.fx, this.f6do.size() - 1, z);
        } else {
            this.dz.a((int) this.fx, 0, z);
        }
    }

    private void q(boolean z) {
        if (z) {
            long jCt = ct();
            if (jCt > 0) {
                long j2 = jCt - 1;
                this.f6do.remove(Long.valueOf(j2));
                synchronized (f38154b) {
                    this.fj.remove(Long.valueOf(j2));
                }
            } else {
                LogUtil.e("Track_SportManager", "stopSport() mMotionPathPointsBuffer size is 0!");
            }
            this.ar = cn();
            c(false);
            eo();
            fk();
            if (this.ci) {
                this.ci = false;
                bh();
            }
            fj();
            return;
        }
        i(false);
        fk();
        c("action_stop_play_sport_music", (Bundle) null, 0);
        this.bd.destroy();
    }

    private boolean cl() {
        return !"false".equals(SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(20002), "dev_abnormal_track"));
    }

    public void bi() {
        o(false);
        LogUtil.a("Track_SportManager", "saveLastSportData() start !");
        eh();
        this.ep = 3;
        if (this.f6do == null) {
            ReleaseLogUtil.a("Track_SportManager", "saveLastSportData() mMotionPathPointsBuffer is null!");
            return;
        }
        long jCt = ct();
        if (jCt > 0) {
            this.dz.a((int) this.fx, this.f6do.size(), false);
            long j2 = jCt - 1;
            this.f6do.remove(Long.valueOf(j2));
            synchronized (f38154b) {
                this.fj.remove(Long.valueOf(j2));
            }
        } else {
            LogUtil.e("Track_SportManager", "saveLastSportData() mMotionPathPointsBuffer size is 0!");
        }
        c(false);
        eo();
        bh();
        this.f6do.clear();
    }

    public float y() {
        return this.dz.a();
    }

    public void ap() {
        if (this.bw) {
            LogUtil.j("Track_SportManager", "inited already");
            return;
        }
        if (!aq()) {
            f(am());
        }
        de();
        dd();
        if (this.aq == null) {
            ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
            this.aq = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
            scheduledExecutorServiceNewSingleThreadScheduledExecutor.scheduleAtFixedRate(new e(), 0L, 1000L, TimeUnit.MILLISECONDS);
        } else {
            LogUtil.a("Track_SportManager", "timer init timer has initialized");
        }
        ixn ixnVar = new ixn();
        this.es = ixnVar;
        a("SportServiceHelper", ixnVar);
        this.el.init();
        this.es.onPreSport();
        this.bw = true;
    }

    public void b(SportBeat sportBeat) {
        ixn ixnVar = this.es;
        if (ixnVar != null) {
            ixnVar.c(sportBeat);
        }
    }

    private void dd() {
        if (this.z == null) {
            this.z = new iwh(this.x, this.ac);
        }
    }

    private void df() {
        if (this.dq == 4) {
            this.w = 1;
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: iwy.4
                @Override // java.lang.Runnable
                public void run() {
                    HwSportTypeInfo hwSportTypeInfoB = jry.a(BaseApplication.getContext()).b(iwy.this.ew);
                    iwy.this.ay = hwSportTypeInfoB == null ? 1 : hwSportTypeInfoB.getHeartPostureType();
                    iwy iwyVar = iwy.this;
                    iwyVar.w = gzz.d(iwyVar.ay);
                    LogUtil.a("Track_SportManager", "mHeartRatePosture", Integer.valueOf(iwy.this.ay), "mClassifyMethod ", Integer.valueOf(iwy.this.w));
                }
            });
        }
    }

    private void e(String str) {
        iyd iydVar = this.o;
        if (iydVar == null || str == null || !iydVar.j()) {
            return;
        }
        izn.c(this.x, str);
    }

    public void ao() {
        TrackDevelopConfig trackDevelopConfig = this.fy;
        if (trackDevelopConfig == null) {
            return;
        }
        trackDevelopConfig.d();
        this.bv = this.fy.e();
        this.bs = this.fy.c();
        this.bm = this.fy.b("auto_close_track_time", 60L);
        this.du = TimeUnit.MINUTES.toMillis(this.bm);
        this.ac = this.fy.b("correct_location_shifting_enable", 0);
        boolean zC = this.fy.c("indoor_running_developer_running", false);
        this.ca = zC;
        LogUtil.a("Track_SportManager", "mIsDiscardWhenStationary :", Boolean.valueOf(this.bv), " -- mIsEstimateDistanceBySteps :", Boolean.valueOf(this.bs), "-- mIntervalTime :", Long.valueOf(this.bm), "-- mConvertMode ", Integer.valueOf(this.ac), " -- mIsOpenIndoorRunningInfo :", Boolean.valueOf(zC));
    }

    public void a(int i, iyd iydVar, boolean z) {
        h(z);
        this.ew = i;
        b(-1, -1.0f);
        List<jpi> list = this.k;
        if (list != null) {
            list.clear();
        }
        izn.b(this.x, "motion_path2.txt");
        izn.b(this.x, "simplemotion.txt");
        izn.b(this.x, "motion_cadence.txt");
        this.o = iydVar;
        c(1);
        e("initAutoTrack");
    }

    public void c(int i) {
        this.gj = i;
    }

    public void b(int i) {
        this.ew = i;
        this.bk = true;
        b(-1, -1.0f);
    }

    public void f(int i) {
        this.fq = i == 1;
    }

    private void eh() {
        ScheduledExecutorService scheduledExecutorService = this.aq;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
            this.aq = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(int i) {
        int iD = nps.d(i);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.dn.size() != 0 && this.aw != i && jCurrentTimeMillis - this.au >= 2000) {
            StringBuilder sb = this.av;
            sb.append(jaa.b(jCurrentTimeMillis));
            sb.append(":");
            sb.append(iD);
            sb.append(";");
            this.aw = i;
            this.au = jCurrentTimeMillis;
            Iterator<IMapViewListener> it = this.dn.iterator();
            while (it.hasNext()) {
                it.next().updateGpsStatus(iD);
            }
            k(iD);
            if (this.at == 0) {
                this.at = jCurrentTimeMillis;
            }
        }
        if (jCurrentTimeMillis - this.at < 60000 || this.av.length() <= 0) {
            return;
        }
        LogUtil.a("Track_SportManager", "gps-s ", this.av.toString());
        this.av.setLength(0);
        this.at = jCurrentTimeMillis;
    }

    private void eo() {
        ixr ixrVar;
        MotionPath motionPathE = jac.e(this.x, this.ew);
        if (motionPathE == null) {
            return;
        }
        this.dl = motionPathE;
        this.dt = cy();
        this.dt.printReleaseSimplifyLog("Track_SportManager");
        b(this.dl);
        e("motion_path2.txt", false);
        int i = this.ew;
        if ((i != 258 && i != 257 && i != 264 && i != 282 && i != 260) || (ixrVar = this.fc) == null) {
            e((ArrayList<StepRateData>) null);
        } else {
            e(ixrVar.j());
        }
        eg();
    }

    ixr an() {
        return this.fc;
    }

    int ag() {
        return this.ea;
    }

    void e(String str, boolean z) {
        this.et.a(str, z);
    }

    private void b(MotionPath motionPath) {
        boolean z;
        if (this.cs) {
            return;
        }
        Map<Integer, Float> mapD = this.dz.d(false);
        boolean z2 = true;
        if (mapD == null || mapD.size() <= 0) {
            z = false;
        } else {
            LogUtil.a("Track_SportManager", "saveCacheData：save remain pace ", mapD);
            motionPath.requestPaceMap().putAll(mapD);
            z = true;
        }
        Map<Integer, Float> mapA = this.dz.a(false);
        if (mapA != null && mapA.size() > 0) {
            LogUtil.a("Track_SportManager", "saveCacheData：save remain britishpace ", mapA);
            motionPath.requestBritishPaceMap().putAll(mapA);
            z = true;
        }
        List<njj> listC = this.dz.c(false);
        if (njy.b(listC)) {
            LogUtil.a("Track_SportManager", "saveCacheData：save remain paceV2 ", listC);
            motionPath.requestPaceList().addAll(listC);
            z = true;
        }
        List<njj> listE = this.dz.e(false);
        if (njy.b(listE)) {
            LogUtil.a("Track_SportManager", "saveCacheData：save remain british paceV2 ", listE);
            motionPath.requestBritishPaceList().addAll(listE);
        } else {
            z2 = z;
        }
        if (c(motionPath, z2)) {
            ej();
        }
    }

    private boolean c(MotionPath motionPath, boolean z) {
        if (this.fc != null) {
            z = e(motionPath, z);
        }
        boolean zE = this.et.e(motionPath, z);
        if (this.fz != null) {
            zE = b(motionPath, zE);
        }
        ize izeVar = this.ed;
        if (izeVar != null) {
            ArrayList<njt> arrayListE = izeVar.e(false);
            if (njy.b(arrayListE)) {
                motionPath.saveSpeedList(arrayListE);
                zE = true;
            }
        }
        TrackPauseDataMgr trackPauseDataMgr = this.gh;
        if (trackPauseDataMgr != null) {
            ArrayList<TrackPauseData> arrayListC = trackPauseDataMgr.c(false);
            if (njy.b(arrayListC)) {
                LogUtil.a("Track_SportManager", "saveCacheData：save remain pauseData ", arrayListC);
                motionPath.requestPauseList().addAll(arrayListC);
                zE = true;
            }
        }
        TrackDisDataMgr trackDisDataMgr = this.gb;
        if (trackDisDataMgr != null) {
            ArrayList<TrackDistanceData> arrayListA = trackDisDataMgr.a(false);
            if (njy.b(arrayListA)) {
                LogUtil.a("Track_SportManager", "saveCacheData：save remain distanceData ", arrayListA);
                motionPath.requestDistanceList().addAll(arrayListA);
                zE = true;
            }
        }
        jan.e().d(motionPath, this.dt);
        if (this.dl.isValidSlopeInfoList()) {
            return true;
        }
        return zE;
    }

    private boolean e(MotionPath motionPath, boolean z) {
        ArrayList<StepRateData> arrayListB = this.fc.b(false);
        if (!njy.b(arrayListB)) {
            return z;
        }
        LogUtil.a("Track_SportManager", "saveCacheData：save remain StepRateList ", arrayListB);
        motionPath.requestStepRateList().addAll(arrayListB);
        return true;
    }

    private boolean b(MotionPath motionPath, boolean z) {
        ArrayList<njm> arrayListD = this.fz.d(false);
        if (!njy.b(arrayListD)) {
            return z;
        }
        LogUtil.a("Track_SportManager", "saveCacheData：save remain tmpAltitudeList ", Integer.valueOf(arrayListD.size()));
        motionPath.requestAltitudeList().addAll(arrayListD);
        return true;
    }

    private void eg() {
        i(false);
        if (f == null) {
            f = ive.c().a();
        }
        final PluginSportTrackAdapter pluginSportTrackAdapter = f;
        ixu ixuVar = this.gd;
        if (ixuVar != null && this.g == 0) {
            pluginSportTrackAdapter.saveTrackPointData(ixuVar.e(), this.ew);
        }
        gze gzeVarB = this.fh.b();
        if (this.gj == 1) {
            jaf.a(this.x, "motion_path2.txt", "auto_detect_motion_path.txt");
            new Thread(new Runnable() { // from class: ixf
                @Override // java.lang.Runnable
                public final void run() {
                    this.f38162a.e(pluginSportTrackAdapter);
                }
            }).start();
            return;
        }
        if (gzeVarB != null && ixs.a().d() && gzeVarB.i() == 1 && Math.round((this.fx - gzeVarB.h()) / 10.0f) >= 1) {
            a(pluginSportTrackAdapter, 60);
            return;
        }
        iwj iwjVar = this.aa;
        if (iwjVar != null && iwjVar.i()) {
            this.aa.b(this.dt, this.dl);
        }
        j(this.dt);
        new Thread(new Runnable() { // from class: ixd
            @Override // java.lang.Runnable
            public final void run() {
                this.e.a(pluginSportTrackAdapter);
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(PluginSportTrackAdapter pluginSportTrackAdapter) {
        ReleaseLogUtil.d("Track_SportManager", "mPluginTrackAdapter is null,", Boolean.valueOf(pluginSportTrackAdapter == null));
        if (pluginSportTrackAdapter != null) {
            LogUtil.a("Track_SportManager", "mPluginTrackAdapter.saveTrackData is not null");
            pluginSportTrackAdapter.saveTrackData(this.dt, "auto_detect_motion_path.txt");
        }
        this.bc = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(PluginSportTrackAdapter pluginSportTrackAdapter) {
        ReleaseLogUtil.d("Track_SportManager", "mPluginTrackAdapter is null,", Boolean.valueOf(pluginSportTrackAdapter == null));
        b(this.dl, this.dt);
        if (pluginSportTrackAdapter != null) {
            LogUtil.a("Track_SportManager", "mPluginTrackAdapter.saveTrackData is not null");
            pluginSportTrackAdapter.saveTrackData(this.dt, "motion_path2.txt");
            jan.e().e(this.dl, this.dt, this.fq);
        }
        this.bc = true;
    }

    private void a(final PluginSportTrackAdapter pluginSportTrackAdapter, final int i) {
        ExtendHandler extendHandler;
        ReleaseLogUtil.d("Track_SportManager", "saveTargetData:", Boolean.valueOf(ixs.a().b()));
        if (!ixs.a().b() && i > 0 && (extendHandler = this.ao) != null) {
            extendHandler.postTask(new Runnable() { // from class: ixi
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.e(pluginSportTrackAdapter, i);
                }
            }, 50L);
            return;
        }
        ReleaseLogUtil.d("Track_SportManager", "showTrackMap wait time:", Long.valueOf(((long) (60 - i)) * 50));
        final MotionPathSimplify motionPathSimplifyA = jac.a(this.x, "target_motion_simplify.txt");
        ReleaseLogUtil.d("Track_SportManager", "saveDataToDb motionPathSimplify:", Boolean.valueOf(motionPathSimplifyA == null));
        c(motionPathSimplifyA);
        iwj iwjVar = this.aa;
        if (iwjVar != null && iwjVar.i()) {
            this.aa.b(motionPathSimplifyA, this.dl);
        }
        j(motionPathSimplifyA);
        new Thread(new Runnable() { // from class: ixl
            @Override // java.lang.Runnable
            public final void run() {
                this.f38167b.e(motionPathSimplifyA, pluginSportTrackAdapter);
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(PluginSportTrackAdapter pluginSportTrackAdapter, int i) {
        a(pluginSportTrackAdapter, i - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(MotionPathSimplify motionPathSimplify, PluginSportTrackAdapter pluginSportTrackAdapter) {
        b(this.dl, motionPathSimplify);
        ReleaseLogUtil.d("Track_SportManager", "saveTargetData mPluginTrackAdapter is null,", Boolean.valueOf(pluginSportTrackAdapter == null));
        if (pluginSportTrackAdapter != null) {
            pluginSportTrackAdapter.saveTrackData(motionPathSimplify, "target_motion_path.txt");
            jaf.c(this.x, motionPathSimplify, "target_motion_simplify.txt");
        }
        this.bc = true;
    }

    private void b(MotionPath motionPath, MotionPathSimplify motionPathSimplify) {
        this.bg = this.bd.a(motionPath, motionPathSimplify, this.g == 0);
        this.bd.destroy();
    }

    private void j(MotionPathSimplify motionPathSimplify) {
        if (motionPathSimplify == null) {
            LogUtil.j("Track_SportManager", "saveSportTrainPoint motionPathSimplify == null");
            return;
        }
        int i = this.ew;
        if (i == 264 || i == 258 || i == 280) {
            int iC = deu.c(this.dl, this.ad, motionPathSimplify.requestStartTime());
            motionPathSimplify.addExtendDataMap(HwExerciseConstants.JSON_NAME_TRAINING_POINTS, String.valueOf(iC));
            LogUtil.a("Track_SportManager", "saveSportTrainPoint trainPoint:", Integer.valueOf(iC), "mHasInitConfig:", Boolean.valueOf(this.bb));
        }
    }

    public void c(MotionPathSimplify motionPathSimplify) {
        if (motionPathSimplify == null) {
            LogUtil.e("Track_SportManager", "correctTotalTime motionPathSimplify is null");
        } else {
            motionPathSimplify.correctTotalTime("Track_SportManager");
        }
    }

    public MotionPath z() {
        return this.dl;
    }

    public long ab() {
        return this.bg;
    }

    public MotionPathSimplify ae() {
        return this.dt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MotionPathSimplify cy() {
        MotionPathSimplify motionPathSimplify = new MotionPathSimplify();
        e(motionPathSimplify);
        TrackAltitudeMgr trackAltitudeMgr = this.fz;
        if (trackAltitudeMgr != null) {
            motionPathSimplify.saveCreepingWave(((float) trackAltitudeMgr.c()) * 10.0f);
            motionPathSimplify.saveTotalDescent(((float) this.fz.a()) * 10.0f);
        }
        jaa.d(this.x);
        g(motionPathSimplify);
        int iC = jaa.c();
        if (iC == 1) {
            motionPathSimplify.saveMapType(1);
        } else if (iC == 2) {
            motionPathSimplify.saveMapType(2);
        } else {
            motionPathSimplify.saveMapType(3);
        }
        if (!TextUtils.isEmpty(this.ab)) {
            motionPathSimplify.saveMapCoordinate(this.ab);
        }
        this.ex.b(motionPathSimplify);
        motionPathSimplify.saveIsNewCoordinate(true);
        if (this.ew == 264 || this.f6do.isEmpty()) {
            motionPathSimplify.saveHasTrackPoint(false);
        } else {
            motionPathSimplify.saveHasTrackPoint(true);
        }
        d(motionPathSimplify, this.dl, false);
        MotionPath motionPath = this.dl;
        if (motionPath != null && motionPath.isValidHeartRateList()) {
            motionPathSimplify.saveAvgHeartRate(izn.d(this.dl.requestHeartRateList()));
            motionPathSimplify.saveMaxHeartRate(izn.b(this.dl.requestHeartRateList()));
            h(motionPathSimplify);
        }
        MotionPath motionPath2 = this.dl;
        if (motionPath2 != null && motionPath2.isValidStepRateList()) {
            int[] iArrE = izn.e(this.dl.requestStepRateList(), this.en);
            try {
                motionPathSimplify.saveBestStepRate(iArrE[1]);
                motionPathSimplify.saveAvgStepRate(iArrE[0]);
                motionPathSimplify.saveTotalSteps(iArrE[2]);
            } catch (IndexOutOfBoundsException e2) {
                LogUtil.j("Track_SportManager", "indexOutOfBoundsException ", e2.getMessage());
            }
        }
        this.et.e(motionPathSimplify);
        iwj iwjVar = this.aa;
        if (iwjVar != null) {
            iwjVar.c(motionPathSimplify);
        }
        motionPathSimplify.saveStartSteps(this.ey);
        motionPathSimplify.saveRealTimeSteps(this.ea);
        motionPathSimplify.saveDeviceType(32);
        iwr iwrVar = this.bd;
        if (iwrVar != null) {
            iwrVar.d(motionPathSimplify);
        }
        return motionPathSimplify;
    }

    private void h(MotionPathSimplify motionPathSimplify) {
        int[] iArrB = new int[5];
        if (!gzz.a(this.ba)) {
            LogUtil.a("Track_SportManager", "hrZoneConfig is valid");
            iArrB = gzz.b(this.dl.requestHeartRateList(), this.ba, this.en, null);
            motionPathSimplify.addExtendDataMap("hrZoneConfig", Arrays.toString(this.ba));
        }
        if (gzz.a(iArrB)) {
            LogUtil.a("Track_SportManager", "timeArea invalid:", Arrays.toString(iArrB));
            return;
        }
        motionPathSimplify.addExtendDataMap("hrZ1", Integer.toString(iArrB[0]));
        motionPathSimplify.addExtendDataMap("hrZ2", Integer.toString(iArrB[1]));
        motionPathSimplify.addExtendDataMap("hrZ3", Integer.toString(iArrB[2]));
        motionPathSimplify.addExtendDataMap("hrZ4", Integer.toString(iArrB[3]));
        motionPathSimplify.addExtendDataMap("hrZ5", Integer.toString(iArrB[4]));
        LogUtil.a("Track_SportManager", "save heartRate timeArea:", Arrays.toString(iArrB));
    }

    private void c(Location location) {
        if (TextUtils.isEmpty(this.ab) && location != null) {
            if (npl.c(location.getLatitude(), location.getLongitude()) == 1) {
                this.ab = AMapLocation.COORD_TYPE_GCJ02;
            } else {
                this.ab = AMapLocation.COORD_TYPE_WGS84;
            }
        }
    }

    private void g(MotionPathSimplify motionPathSimplify) {
        String str = this.ak;
        if ((str == null && this.ec == null) || (this.ep == 3 && TextUtils.isEmpty(str) && TextUtils.isEmpty(this.ec))) {
            jxq.c(motionPathSimplify);
            this.ak = motionPathSimplify.getExtendDataString("localDeviceId", "");
            this.ec = motionPathSimplify.getExtendDataString("localProdId", "");
            String extendDataString = motionPathSimplify.getExtendDataString("localSubProdId", "");
            this.fg = extendDataString;
            LogUtil.a("Track_SportManager", "saveShareLocalDevice mDeviceId ", this.ak, " mProdId ", this.ec, " mSubProdId", extendDataString);
            return;
        }
        motionPathSimplify.addExtendDataMap("localDeviceId", this.ak);
        motionPathSimplify.addExtendDataMap("localProdId", this.ec);
        motionPathSimplify.addExtendDataMap("localSubProdId", this.fg);
    }

    private void e(MotionPathSimplify motionPathSimplify) {
        motionPathSimplify.saveStartTime(this.eu);
        motionPathSimplify.saveEndTime(this.ar);
        motionPathSimplify.saveTotalCalories(Math.round(u()) * 1000);
        motionPathSimplify.saveActiveCalories(Math.round(getActiveCalorie()) * 1000);
        motionPathSimplify.saveTotalDistance((int) this.fx);
        motionPathSimplify.saveSportId(this.eo);
        motionPathSimplify.saveSportType(this.ew);
        motionPathSimplify.saveTrackType(this.gj);
        motionPathSimplify.saveAvgPace(x());
        motionPathSimplify.saveTotalTime(this.en);
        motionPathSimplify.saveSportDataSource(ac());
        motionPathSimplify.saveHeartRateZoneType(this.w);
        motionPathSimplify.addExtendDataMap("sportHeartPosture", String.valueOf(this.ay));
        int i = this.ew;
        if ((i == 264 || i == 258 || i == 280) && !TextUtils.isEmpty(this.dw)) {
            HashMap map = new HashMap(1);
            String strC = jqb.c(this.dw);
            this.dw = strC;
            map.put("runPaceZoneConfig", strC);
            motionPathSimplify.saveExtendDataMap(map);
        }
    }

    public int ac() {
        return cm() > 0 ? 4 : 0;
    }

    void d(MotionPathSimplify motionPathSimplify, MotionPath motionPath, boolean z) {
        synchronized (this) {
            try {
                if (z) {
                    motionPathSimplify.savePaceMap(this.dz.o());
                    motionPathSimplify.saveBritishPaceMap(this.dz.l());
                    motionPathSimplify.savePaceV2(this.dz.m());
                    motionPathSimplify.saveBriPaceV2(this.dz.k());
                } else {
                    motionPathSimplify.savePaceMap(this.dz.i());
                    motionPathSimplify.saveBritishPaceMap(this.dz.d());
                    motionPathSimplify.savePaceV2(this.dz.h());
                    motionPathSimplify.saveBriPaceV2(this.dz.e());
                }
                motionPathSimplify.savePartTimeMap(this.dz.f());
                motionPathSimplify.saveBritishPartTimeMap(this.dz.b());
                if (motionPath != null && motionPath.isValidPaceMap()) {
                    if (this.bn) {
                        motionPathSimplify.saveBestPace(njv.b(njv.d(this.dz.h()))[0].floatValue());
                    } else {
                        motionPathSimplify.savePaceMap(motionPath.requestPaceMap());
                        motionPathSimplify.savePaceV2(motionPath.getPacesV2());
                        motionPathSimplify.saveBestPace(njv.b(njv.d(motionPath.getPacesV2()))[0].floatValue());
                    }
                    motionPathSimplify.saveAbnormalTrack(this.g);
                }
                motionPathSimplify.addExtendDataMap("STEP_STATICS_EXCEPTION", this.cp ? "1" : "0");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public float x() {
        float f2 = this.fx;
        if (f2 <= 0.0f) {
            return 0.0f;
        }
        return ((this.en * 1.0f) / 1000.0f) / ((((int) f2) * 1.0f) / 1000.0f);
    }

    private float cq() {
        float fX = x();
        if (fX == 0.0f) {
            return 0.0f;
        }
        return 3600.0f / fX;
    }

    private float cv() {
        ize izeVar = this.ed;
        if (izeVar == null) {
            return 0.0f;
        }
        return izeVar.c();
    }

    public void a(MotionData motionData) {
        this.f6do.clear();
        if (motionData == null) {
            ReleaseLogUtil.a("Track_SportManager", "motionData is null");
            return;
        }
        Map<Long, double[]> lbsDataMap = motionData.getLbsDataMap();
        synchronized (lbsDataMap) {
            if (lbsDataMap.size() > 0) {
                for (Map.Entry<Long, double[]> entry : lbsDataMap.entrySet()) {
                    if (entry instanceof Map.Entry) {
                        Map.Entry<Long, double[]> entry2 = entry;
                        if (entry2.getValue().length >= 2) {
                            jpg jpgVar = new jpg(entry2.getValue()[0], entry2.getValue()[1]);
                            if (izn.e(jpgVar.d, 90.0d) && izn.e(jpgVar.f38787a, -80.0d)) {
                                this.ce = true;
                            } else {
                                this.dd = jpgVar;
                                this.ai = jpgVar;
                                this.ce = false;
                            }
                        }
                    }
                }
            }
        }
        this.f6do = lbsDataMap;
        LogUtil.a("Track_SportManager", " setMotionPath mMotionPathPointsBuffer size:", Integer.valueOf(lbsDataMap.size()));
        b(motionData);
        this.et.a(motionData, this.ew);
        if (this.fc == null) {
            this.fc = new ixr(f, this);
        }
        this.fc.a(motionData.getStepRateList());
        this.ed.c(motionData.requestRealTimeSpeedList());
        LogUtil.a("Track_SportManager", "Recovery steplist ", Integer.valueOf(this.fc.j().size()));
        c(motionData);
        this.ea = motionData.getRealTimeSteps();
        this.ag = motionData.getRealTimeSteps();
    }

    private void c(MotionData motionData) {
        if (this.fz == null) {
            this.fz = new TrackAltitudeMgr(this.x);
        }
        this.fz.a(motionData.requestAltitudeList());
        if (this.gh == null) {
            this.gh = new TrackPauseDataMgr(this.x);
        }
        this.gh.b(motionData.requestPauseList());
        if (this.gb == null) {
            this.gb = new TrackDisDataMgr(this.x);
        }
        this.gb.d(motionData.requestDistanceList());
    }

    private void b(MotionData motionData) {
        float totalDistance = motionData.getTotalDistance();
        this.fx = totalDistance;
        this.fu = totalDistance;
        this.fp = totalDistance;
        this.u.c((motionData.getTotalCalories() * 1.0f) / 1000.0f);
        this.en = motionData.getTotalTime();
        this.n = System.currentTimeMillis();
    }

    private void dg() {
        UserProfileMgrApi userProfileMgrApi = (UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class);
        this.dh = userProfileMgrApi.getLocalUserInfo();
        UserInfomation userInfo = userProfileMgrApi.getUserInfo();
        this.gi = userInfo;
        if (userInfo != null) {
            int heightOrDefaultValue = userInfo.getHeightOrDefaultValue();
            if (heightOrDefaultValue == 0) {
                this.gq = 0.714f;
            } else {
                this.gq = ((heightOrDefaultValue * 1.0f) / 100.0f) * 0.42f;
            }
            izu.c(this.gi, this.ge.d("calibrate_distance_indoor_running_data_duration"), this.ge.d("calibrate_distance_indoor_running_data_step"), this.ge.d("calibrate_distance_indoor_running_data_actual_distance"));
            this.aj = izu.d(heightOrDefaultValue);
            if (this.ew == 264) {
                this.gq = izu.d(heightOrDefaultValue);
            }
        } else {
            LogUtil.j("Track_SportManager", "accountInfo is null");
        }
        if (this.ew == 259) {
            this.s = izn.d(this.x);
        }
    }

    public boolean bg() {
        return jac.d(this.x) && this.fx >= 100.0f;
    }

    public String ak() {
        return this.eo;
    }

    public void s() {
        synchronized (d) {
            HealthSportingNotificationHelper healthSportingNotificationHelper = this.ev;
            if (healthSportingNotificationHelper != null) {
                b(healthSportingNotificationHelper);
                this.ev.e();
                this.ev = null;
                ReleaseLogUtil.d("Track_SportManager", "complete clear Notification");
            } else {
                ReleaseLogUtil.e("Track_SportManager", "clearNotification is fail");
            }
        }
    }

    public void bh() {
        ReleaseLogUtil.d("Track_SportManager", "SportManager onDestroy");
        en();
        this.ab = "";
        this.ex.d();
        this.el.destroy();
        this.go.clear();
        i(0);
        s();
        fb();
        cf();
        eh();
        ez();
        f = null;
        ixu ixuVar = this.gd;
        if (ixuVar != null) {
            ixuVar.d();
        }
        SportMusicInteratorService.a();
        ixy ixyVar = this.gf;
        if (ixyVar != null) {
            ixyVar.e();
        }
        d("Track_SportManagerTargetUpdate");
        fa();
        TrackAltitudeMgr trackAltitudeMgr = this.fz;
        if (trackAltitudeMgr != null && trackAltitudeMgr.b()) {
            LogUtil.a("Track_SportManager", "onDestary Track_TrackAltitudeMgr");
            this.fz.f();
        }
        iyn.d();
    }

    private void fa() {
        ExtendHandler extendHandler = this.ao;
        if (extendHandler == null) {
            LogUtil.j("Track_SportManager", "unregisterDataReports mExtendHandler is null!");
        } else {
            extendHandler.postTask(new Runnable() { // from class: ixe
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.dz();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void dz() {
        ey();
        this.et.c();
        HandlerExecutor.c(new Runnable() { // from class: ixj
            @Override // java.lang.Runnable
            public final void run() {
                this.d.dw();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void dw() {
        this.fc = null;
        if (this.dm != null) {
            this.dm = null;
        }
        if (this.aa != null) {
            this.aa = null;
        }
        if (this.ad != null) {
            this.ad = null;
        }
    }

    private void cf() {
        h.clear();
        this.dn.clear();
        this.er.clear();
        this.ek.clear();
        this.gg = null;
    }

    public int ad() {
        return this.aw;
    }

    public void t() {
        Bundle bundle = new Bundle();
        bundle.putString("duration", getFormattedTime());
        bundle.putLong("duration_digital", this.en);
        d(bundle);
        bundle.putInt(BleConstants.SPORT_TYPE, this.ew);
        h(bundle);
        this.et.c(bundle);
        bundle.putString("calorie", String.valueOf(u()));
        if (getActiveCalorie() > 0.0f) {
            bundle.putString(HwExerciseConstants.JSON_NAME_ACTIVECALORIE, String.valueOf(getActiveCalorie()));
        }
        bundle.putString("stepRate", "");
        i(bundle);
        l(bundle);
        if (this.ew == 264) {
            int i = this.ag;
            bundle.putString(MedalConstants.EVENT_STEPS, i > 0 ? String.valueOf(i) : "");
            double d2 = this.ez;
            if (d2 < 250.0d) {
                bundle.putString("stepRate", String.valueOf(Math.round(d2)));
            } else {
                bundle.putString("stepRate", izn.e(BaseApplication.getContext()));
            }
        } else if (!bundle.containsKey(MedalConstants.EVENT_STEPS)) {
            int i2 = this.ea;
            bundle.putString(MedalConstants.EVENT_STEPS, i2 > 0 ? String.valueOf(i2) : "");
        }
        bundle.putString("indoor_run_distance", String.valueOf(this.fr));
        bundle.putString("indoor_run_normal_distance", String.valueOf(this.fu));
        bundle.putString("indoor_run_step", String.valueOf(this.bh));
        bundle.putString("indoor_running_number_data", String.valueOf(izu.a()));
        bundle.putString("climb_3d_dis", String.valueOf(this.ft));
        bundle.putString("climb_2d_dis", String.valueOf(this.fx));
        bundle.putInt("ihealth_free_indoor_running_style", this.gm);
        j(bundle);
        ReleaseLogUtil.d("Track_SportManager", npt.d("countdownSportDefaultFragment ", qqt.b(bundle)));
        m(bundle);
        try {
            for (ISportDataFragmentListener iSportDataFragmentListener : h) {
                if (iSportDataFragmentListener != null) {
                    iSportDataFragmentListener.updateSportViewFragment(bundle);
                }
            }
        } catch (NumberFormatException e2) {
            LogUtil.j("Track_SportManager", "countdownSportDefaultFragment ", e2.getMessage());
        }
    }

    private void j(Bundle bundle) {
        ixr ixrVar;
        int i = this.fb;
        if ((i == 2 || i == 3) && this.gm == 1) {
            bundle.putInt("ihealth_free_indoor_running_style", 2);
        }
        TrackAltitudeMgr trackAltitudeMgr = this.fz;
        if (trackAltitudeMgr != null) {
            bundle.putString("climb_3d_pressure", String.valueOf(trackAltitudeMgr.d()));
        }
        if (!izn.e(this.ew) || (ixrVar = this.fc) == null) {
            return;
        }
        int iF = ixrVar.f();
        if (iF > 0) {
            bundle.putString("stepRate", String.valueOf(Math.round(iF)));
        } else {
            bundle.putString("stepRate", "--");
        }
    }

    private void d(Bundle bundle) {
        if (this.ew == 261) {
            bundle.putString("distance", "0.00");
        } else {
            bundle.putString("distance", String.valueOf(g()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(long j2) {
        this.dz.c();
        this.ed.e(Math.round(j2 / 1000.0f), y());
    }

    private void h(Bundle bundle) {
        float fY = y();
        if (fY <= 0.0f || fY >= 200.0f || this.fx < 10.0f) {
            bundle.putString("speed", "--");
        } else {
            int iRound = Math.round((((fY * 1.0f) * 1000.0f) * 10.0f) / 3600.0f);
            bundle.putString("speed", jaa.d((((UnitUtil.f() ? (float) UnitUtil.e(iRound, 3) : iRound) * 1.0f) * 3600.0f) / 10000.0f, 2));
        }
        g(bundle);
        int i = 0;
        if (az() && fY > 1.0E-4f) {
            int seconds = (int) (TimeUnit.HOURS.toSeconds(1L) / fY);
            if (UnitUtil.f()) {
                seconds = (int) UnitUtil.c(seconds, 3);
            }
            i = seconds < 6000 ? seconds : 0;
            bundle.putString("pace", String.valueOf(i));
        } else {
            bundle.putString("pace", "--");
        }
        if (this.ew != 258 || i <= 0 || !jem.f() || jem.h()) {
            return;
        }
        jeh.e().e.add(Integer.valueOf(i / 60));
    }

    private void g(Bundle bundle) {
        if (cq() > 0.0f) {
            float fCq = cq();
            float fCv = cv();
            if (UnitUtil.f()) {
                float fE = (float) UnitUtil.e(fCq, 3);
                fCv = (float) UnitUtil.e(fCv, 3);
                fCq = fE;
            }
            bundle.putString("avgSpeed", jaa.d(fCq, 2));
            bundle.putString("maxSpeed", jaa.d(fCv, 2));
        }
    }

    private void i(Bundle bundle) {
        if (dt()) {
            gze gzeVarB = this.fh.b();
            float fB = gzeVarB.b() * 100.0f;
            if (gzeVarB.i() == 0) {
                bundle.putString("countdownValue", cr());
                bundle.putFloat("progreeRate", fB);
            } else if (gzeVarB.i() == 1) {
                bundle.putString("countdownValue", co());
                bundle.putFloat("progreeRate", fB);
            } else if (gzeVarB.i() == 2) {
                bundle.putString("countdownValue", cp());
                bundle.putFloat("progreeRate", fB);
            } else if (gzeVarB.i() == 5 || gzeVarB.i() == 4) {
                bundle.putFloat("progreeRate", fB);
            } else if (gzeVarB.i() == 200) {
                bundle.putFloat("progreeRate", 100.0f);
            } else {
                bundle.putString("countdownValue", "");
            }
            int i = this.dq;
            if (i == 3 || i == 4) {
                bundle.putString("planProgress", d(gzeVarB.c(), gzeVarB.j() - 1));
                bundle.putInt("sport_target_type_sportting", gzeVarB.i());
            }
            bundle.putBoolean("planIsLastTarget", gzeVarB.c() == gzeVarB.j());
            bundle.putString("extroInfo", gzeVarB.f());
            bundle.putInt(WorkoutRecord.Extend.COURSE_TARGET_TYPE, gzeVarB.i());
            bundle.putFloat(WorkoutRecord.Extend.COURSE_TARGET_VALUE, gzeVarB.h());
            hcc.d(gzeVarB, bundle);
        }
    }

    private boolean dt() {
        gyv gyvVar = this.fh;
        return (gyvVar == null || gyvVar.b() == null) ? false : true;
    }

    private static String d(int i, int i2) {
        if (i > i2) {
            return "";
        }
        return BaseApplication.getContext().getString(R.string.IDS_hwh_motiontrack_target_progress, Integer.valueOf(i), Integer.valueOf(i2));
    }

    private String co() {
        gze gzeVarB = this.fh.b();
        if (gzeVarB.b() < 1.0f) {
            try {
                return jaa.d(((1.0f - gzeVarB.b()) * gzeVarB.h()) / 1000.0f, 2);
            } catch (NumberFormatException e2) {
                ReleaseLogUtil.a("Track_SportManager", "getCountdownDistance error ", ExceptionUtils.c(e2));
                return "";
            }
        }
        return this.fn;
    }

    public void b(int i, float f2) {
        gze gzeVar = new gze("", i, jaa.a(i, f2));
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(gzeVar);
        this.fh.e(arrayList);
    }

    private String cr() {
        gze gzeVarB = this.fh.b();
        if (gzeVarB.b() >= 1.0f) {
            ReleaseLogUtil.d("Track_SportManager", "Time goal done");
            return this.fn;
        }
        float fB = (1.0f - gzeVarB.b()) * gzeVarB.h();
        return jaa.e((int) ((fB / 3600000.0f) % 100.0f)) + ":" + jaa.e((int) ((fB / 60000.0f) % 60.0f)) + ":" + jaa.e((int) ((fB / 1000.0f) % 60.0f));
    }

    private String cp() {
        String str;
        gze gzeVarB = this.fh.b();
        if (gzeVarB.b() >= 1.0f) {
            ReleaseLogUtil.d("Track_SportManager", "Calorie goal done");
            return this.fn;
        }
        synchronized (this.y) {
            str = this.y.format((((1.0f - gzeVarB.b()) * gzeVarB.h()) * 1.0f) / 1000.0f);
        }
        return str;
    }

    public boolean am() {
        if (this.gj == 1) {
            LogUtil.a("Track_SportManager", "getVoiceEnable() is false");
            return false;
        }
        if (jaq.c() == 0) {
            LogUtil.a("Track_SportManager", "getVoiceEnable() is false");
            return false;
        }
        LogUtil.a("Track_SportManager", "getVoiceEnable() is true ");
        return true;
    }

    public void f(boolean z) {
        LogUtil.a("Track_SportManager", "setVoiceEnable() ", Boolean.valueOf(z));
        if (z) {
            jaq.e(1);
        } else {
            jaq.e(0);
        }
        b(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dx() {
        Map<Double, Double> treeMap;
        if (this.gl != null) {
            iyz iyzVar = this.dz;
            long jD = iyzVar != null ? iyzVar.d((int) this.fx) : -1L;
            if (jD != 1000 || this.ck) {
                this.ck = false;
            } else {
                this.ck = true;
            }
            int iFloor = dt() ? (int) Math.floor(this.fh.b().b() * 100.0f) : 0;
            if (!this.ck) {
                int iE = this.ct;
                if (e() != -1) {
                    iE = e();
                    this.ct = iE;
                }
                this.gl.a(this.en, (int) this.fx, jD, iE);
                iyz iyzVar2 = this.dz;
                if (iyzVar2 != null) {
                    treeMap = iyzVar2.f();
                } else {
                    treeMap = new TreeMap<>();
                }
                if (!this.cd && LanguageUtil.o(this.x)) {
                    this.gl.c(this.fx, iFloor, treeMap);
                }
            }
            if (this.gl.c(iFloor) && !this.cd) {
                this.gl.c();
                this.gl.a(true);
            }
            if (LanguageUtil.o(this.x)) {
                this.gl.b(this.et.f());
            }
        }
    }

    private void d(jpi jpiVar) {
        if (jpiVar == null) {
            return;
        }
        if (this.f6do == null) {
            ReleaseLogUtil.a("Track_SportManager", " doAddPoint mMotionPathPointsBuffer is null!");
            return;
        }
        jpi jpiVar2 = new jpi(jpiVar);
        j(jpiVar);
        this.cz = System.currentTimeMillis();
        this.n = System.currentTimeMillis();
        this.af = jpiVar.f();
        this.ai = izy.b(jpiVar);
        this.dd = izy.b(jpiVar);
        this.cv = k(jpiVar);
        this.fs = this.af - this.cz;
        long jCt = ct();
        jpg jpgVarB = izy.b(jpiVar2);
        synchronized (f38154b) {
            this.fj.put(Long.valueOf(jCt), new double[]{jpgVarB.d, jpgVarB.f38787a, jpiVar2.e(), this.af});
        }
        this.f6do.put(Long.valueOf(jCt), new double[]{jpgVarB.d, jpgVarB.f38787a, jpiVar2.e(), this.af});
    }

    private long ct() {
        if (this.f6do.size() == 0) {
            return 0L;
        }
        return ((Long) ((TreeMap) this.f6do).lastKey()).longValue() + 1;
    }

    private void cj() {
        IMapDrawingUpdater iMapDrawingUpdater = this.dm;
        if (iMapDrawingUpdater != null) {
            iMapDrawingUpdater.drawLineToMap(this.ap);
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.model.TimeUpdater
    public void increaseOrDecreaseSportDuration() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = this.cy;
        long j3 = jElapsedRealtime - j2;
        this.m = j3;
        if (j2 == 0) {
            this.en += 1000;
        } else {
            this.en += j3;
        }
        this.cy = jElapsedRealtime;
        if (jem.f()) {
            jeh.e().c(this.en);
        }
    }

    private void eq() {
        LogUtil.a("Track_SportManager", "startHandlerThread() enter");
        if (this.ao == null) {
            dc();
        }
    }

    private void dc() {
        this.ao = HandlerCenter.b(new c(this), "SportManagerHandlerThread");
    }

    private void ey() {
        LogUtil.a("Track_SportManager", "stopHandlerThread() enter");
        ExtendHandler extendHandler = this.ao;
        if (extendHandler != null) {
            extendHandler.removeTasksAndMessages();
            this.ao.quit(true);
        }
    }

    public void a(int i) {
        this.dq = i;
    }

    public npg aa() {
        return bq();
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.inteface.IUpGpsStatusListener
    public void registerGps() {
        if (this.ew != 264) {
            npg npgVarBq = bq();
            Map<Long, double[]> map = this.f6do;
            if (map != null && map.size() != 0) {
                npgVarBq.b();
                npgVarBq.e(true);
            }
            c("sportTrackLocation");
            a("sportTrackLocation");
            ea();
            jal.a().f();
        }
    }

    public void a(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (this.fc == null) {
            this.fc = new ixr(f, this);
        }
        this.fc.d(bundle.getParcelableArrayList("autoTrackStepList"));
        float f2 = bundle.getInt("autoTrackDistance", 0);
        this.fx = f2;
        this.fu = f2;
        this.fp = f2;
        this.u.d(bundle.getFloat("autoTrackCalories", 0.0f));
        this.u.b(bundle.getFloat("autoTrackActiveCalories", 0.0f));
        this.en = bundle.getLong("autoTrackTime");
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.ar = jCurrentTimeMillis;
        this.eu = jCurrentTimeMillis - this.en;
        this.ea = bundle.getInt("autoTrackStep");
        this.ag = bundle.getInt("autoTrackStep");
        this.cl = true;
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.inteface.IUpGpsStatusListener
    public void unregisterGps() {
        g("sportTrackLocation");
        jal.a().h();
    }

    @Override // com.huawei.health.sport.ITargetUpdateListener
    public void onTargetDataUpdate(gze gzeVar) {
        ITargetUpdateListener iTargetUpdateListener = this.ff;
        if (iTargetUpdateListener != null) {
            iTargetUpdateListener.onTargetDataUpdate(gzeVar);
        }
    }

    @Override // com.huawei.health.sport.ITargetUpdateListener
    public void onStateUpdate(int i, String str) {
        iya iyaVar;
        if (i == 200 && (iyaVar = this.gl) != null) {
            iyaVar.c();
            this.gl.a(true);
        }
        ITargetUpdateListener iTargetUpdateListener = this.ff;
        if (iTargetUpdateListener != null) {
            iTargetUpdateListener.onStateUpdate(i, str);
        }
    }

    public void r() {
        this.fh.a();
    }

    public void bo() {
        this.ep = 6;
    }

    public void d(ITargetUpdateListener iTargetUpdateListener) {
        this.ff = iTargetUpdateListener;
    }

    public void b(String str, ITargetUpdateListener iTargetUpdateListener) {
        gyv gyvVar = this.fh;
        if (gyvVar == null) {
            return;
        }
        gyvVar.e(str, iTargetUpdateListener);
    }

    public void d(String str) {
        gyv gyvVar = this.fh;
        if (gyvVar == null) {
            return;
        }
        gyvVar.d(str);
    }

    static class a extends Handler {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<iwy> f38158b;

        a(Looper looper, iwy iwyVar) {
            super(looper);
            this.f38158b = new WeakReference<>(iwyVar);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            iwy iwyVar = this.f38158b.get();
            if (iwyVar == null) {
                LogUtil.a("Track_SportManager", "UIHandler()  manager is null");
                return;
            }
            if (message == null) {
                return;
            }
            int i = message.what;
            if (i == 4) {
                LogUtil.a("Track_SportManager", "handleMessage() enter, command = pauseSport");
                iwyVar.o(2);
            } else if (i == 5) {
                LogUtil.a("Track_SportManager", "handleMessage() enter, command = resumeSport");
                iwyVar.o(1);
            } else if (i == 6) {
                LogUtil.a("Track_SportManager", "handleMessage() enter, command = stopSport");
                iwyVar.o(3);
            } else if (i == 202) {
                Serializable serializable = message.getData().getSerializable("PointProcessed");
                if (serializable instanceof jpi) {
                    iwyVar.e((jpi) serializable);
                }
            } else if (i == 301) {
                iwyVar.ej();
            }
            super.handleMessage(message);
        }
    }

    private void eu() {
        LogUtil.a("Track_SportManager", "startUiHandlerThread() enter");
        if (this.gk == null) {
            LogUtil.a("Track_SportManager", "startUiHandlerThread() mUiHandler is null");
            this.gk = new a(Looper.getMainLooper(), this);
        }
    }

    private void ez() {
        LogUtil.a("Track_SportManager", "stopUiHandlerThread() enter");
        Handler handler = this.gk;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.gk = null;
        }
    }

    private void ek() {
        LogUtil.a("Track_SportManager", "showTrackMap mMapViewListenerList.size = ", Integer.valueOf(this.dn.size()));
        if (this.dn.size() > 0) {
            for (IMapViewListener iMapViewListener : this.dn) {
                if (iMapViewListener != null) {
                    if (bg()) {
                        iMapViewListener.stopSport(true);
                        LogUtil.a("Track_SportManager", "showTrackMap hava SportData");
                    } else {
                        iMapViewListener.stopSport(false);
                        LogUtil.a("Track_SportManager", "showTrackMap no isValidSportData");
                    }
                }
            }
        }
    }

    private void e(ArrayList<StepRateData> arrayList) {
        if (arrayList != null && arrayList.size() > 0) {
            int iM = this.fc.m();
            this.dt.saveTotalSteps(iM);
            this.dt.saveBestStepRate(this.fc.g());
            this.dt.saveAvgStepRate(this.fc.c(this.en));
            m(iM);
            return;
        }
        this.dt.saveTotalSteps(0);
    }

    private boolean b(long j2) {
        boolean z = false;
        if (j2 < this.du || this.bm == 0) {
            return false;
        }
        boolean zBg = bg();
        if (this.gj != 1) {
            z = zBg;
        } else if (zBg && this.l.d()) {
            z = true;
        }
        m(z);
        return true;
    }

    public void b(boolean z, nsp nspVar) {
        if (z) {
            if (this.fz == null) {
                this.fz = new TrackAltitudeMgr(this.x);
            }
            if (this.fz.b()) {
                return;
            }
            this.fz.e(nspVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ej() {
        LogUtil.a("Track_SportManager", "saveDataToFile ");
        ExtendHandler extendHandler = this.ao;
        if (extendHandler == null) {
            ReleaseLogUtil.a("Track_SportManager", "saveDataToFile mExtendHandler is null!");
        } else {
            this.cs = true;
            extendHandler.postTask(new Runnable() { // from class: iwy.2
                @Override // java.lang.Runnable
                public void run() {
                    if (iwy.this.dq()) {
                        if (iwy.this.fz != null) {
                            iwy.this.fz.i();
                        }
                        MotionPath motionPathE = jac.e(iwy.this.x, iwy.this.ew);
                        if (motionPathE != null) {
                            iwy.this.dl = motionPathE;
                        }
                    }
                    MotionPathSimplify motionPathSimplifyCy = iwy.this.cy();
                    jaf.c(iwy.this.x, motionPathSimplifyCy, "simplemotion_temp.txt");
                    if (iwy.this.fj == null) {
                        LogUtil.e("Track_SportManager", "saveDataToFile mTempNewPointsBuffer is null!");
                        jaf.c(iwy.this.x, motionPathSimplifyCy, "simplemotion.txt");
                        iwy.this.cs = false;
                    } else {
                        iwy.this.b(motionPathSimplifyCy, iwy.this.fc != null ? iwy.this.fc.b(true) : null, iwy.this.fz != null ? iwy.this.fz.d(true) : null, iwy.this.ed != null ? iwy.this.ed.e(true) : null);
                        if (iwy.this.fh.b() != null) {
                            ixs.a().e(iwy.this.x, iwy.this.fh.b().i(), iwy.this.fh.b().h(), iwy.this.fx);
                        }
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean dq() {
        return this.fh.b() != null && this.fh.b().i() == 1 && !ixs.a().e() && this.fx > this.fh.b().h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(MotionPathSimplify motionPathSimplify, ArrayList<StepRateData> arrayList, ArrayList<njm> arrayList2, ArrayList<njt> arrayList3) {
        MotionPath motionPathC = jaa.c(this.fj, arrayList, this.dz.d(true), this.dz.a(true), arrayList2, this.dz.c(true), this.dz.e(true));
        if (arrayList3 != null) {
            motionPathC.saveSpeedList(arrayList3);
        }
        TrackPauseDataMgr trackPauseDataMgr = this.gh;
        if (trackPauseDataMgr != null) {
            motionPathC.savePauseList(trackPauseDataMgr.c(true));
        }
        TrackDisDataMgr trackDisDataMgr = this.gb;
        if (trackDisDataMgr != null) {
            motionPathC.saveDistanceList(trackDisDataMgr.a(true));
        }
        MotionPath motionPath = this.dl;
        if (motionPath != null && motionPath.isValidSlopeInfoList()) {
            motionPathC.saveSlopeInfoList(this.dl.requestSlopeInfoList());
        }
        this.et.a(motionPathC);
        boolean zE = jaf.e(this.x, motionPathC, "motion_path2.txt");
        jaf.c(this.x, motionPathSimplify, "simplemotion.txt");
        if (zE) {
            synchronized (f38154b) {
                this.fj.clear();
            }
            this.et.d();
        }
        this.cs = false;
    }

    public MotionData e(boolean z) {
        LogUtil.a("Track_SportManager", "obtainMotionPathForFile");
        MotionPath motionPathA = jac.a(this.x);
        MotionPathSimplify motionPathSimplifyE = jac.e(this.x);
        if (motionPathA == null || motionPathSimplifyE == null) {
            ReleaseLogUtil.e("Track_SportManager", "obtainMotionPathForFile motionPath or motionPathSimplify empty");
            return null;
        }
        LogUtil.a("Track_SportManager", "motionPathSimplify.requestEndTime() = ", Long.valueOf(motionPathSimplifyE.requestEndTime()), " System.currentTimeMillis() == ", Long.valueOf(System.currentTimeMillis()));
        d(motionPathSimplifyE);
        a(motionPathSimplifyE);
        b(motionPathSimplifyE);
        this.ex.c(motionPathSimplifyE);
        this.fs = this.ge.n();
        if (!z && motionPathSimplifyE.requestTrackType() == 1) {
            i(false);
            LogUtil.d("Track_SportManager", "obtainMotionPathForFile is AUTO_TRACK, no need to recovery!");
            this.eu = 0L;
            this.ar = 0L;
            this.fs = 0L;
            return null;
        }
        MotionData motionDataC = izl.c(motionPathA, motionPathSimplifyE);
        if (motionDataC == null || motionDataC.getLbsDataMap() == null) {
            ReleaseLogUtil.e("Track_SportManager", "motionData or motionData.getLbsDataMap is null or empty");
            this.eu = 0L;
            this.ar = 0L;
            this.fs = 0L;
            return null;
        }
        MotionData motionDataA = a(motionDataC, motionPathSimplifyE.requestMapCoordinate());
        this.fo = this.ge.g();
        this.by = true;
        this.cg = true;
        if (this.dz == null) {
            this.dz = new iyz();
        }
        c(motionPathSimplifyE, motionPathA);
        a(motionDataA);
        return motionDataA;
    }

    private MotionData a(MotionData motionData, String str) {
        double[] dArr;
        if (motionData == null || (dArr = motionData.getLbsDataMap().get(0L)) == null || dArr.length < 2) {
            return motionData;
        }
        jpg jpgVar = new jpg(dArr[0], dArr[1]);
        if (AMapLocation.COORD_TYPE_GCJ02.equals(str)) {
            jpgVar = izy.b(jpgVar);
        }
        return npl.c(jpgVar.d, jpgVar.f38787a) == 3 ? izt.b(motionData, jaa.b()) : motionData;
    }

    public gdm be() {
        return jac.d(this.x, "hotPathDetailInfo.txt");
    }

    public void e(gdm gdmVar) {
        this.bd.d(gdmVar);
    }

    private void b(MotionPathSimplify motionPathSimplify) {
        iwr iwrVar = this.bd;
        if (iwrVar != null) {
            iwrVar.e(motionPathSimplify);
        }
    }

    private void l(Bundle bundle) {
        iwr iwrVar = this.bd;
        if (iwrVar != null) {
            iwrVar.a(bundle);
        }
    }

    private void d(Location location) {
        iwr iwrVar = this.bd;
        if (iwrVar != null) {
            iwrVar.c(location);
        }
    }

    private void ff() {
        iwr iwrVar;
        IMapDrawingUpdater iMapDrawingUpdater = this.dm;
        if (iMapDrawingUpdater == null || (iwrVar = this.bd) == null) {
            return;
        }
        iMapDrawingUpdater.updateCpMarker(iwrVar.c());
    }

    public boolean aw() {
        iwr iwrVar = this.bd;
        return iwrVar != null && iwrVar.a();
    }

    private void d(MotionPathSimplify motionPathSimplify) {
        this.eu = motionPathSimplify.requestStartTime();
        this.ar = motionPathSimplify.requestEndTime();
        int iRequestSportType = motionPathSimplify.requestSportType();
        this.ew = iRequestSportType;
        if (iRequestSportType == 264 && izn.b(this.x)) {
            this.fb = 1;
        }
        int iRequestActiveCalories = motionPathSimplify.requestActiveCalories();
        if (iRequestActiveCalories > 0) {
            this.u.a((iRequestActiveCalories * 1.0f) / 1000.0f);
        }
    }

    private void a(MotionPathSimplify motionPathSimplify) {
        if (this.aa == null && this.dq == 4) {
            this.aa = new iwj();
        }
        iwj iwjVar = this.aa;
        if (iwjVar != null) {
            iwjVar.e(motionPathSimplify);
        }
        if (this.ad == null) {
            db();
        }
    }

    private int cm() {
        iwj iwjVar = this.aa;
        if (iwjVar != null) {
            return iwjVar.b();
        }
        return 0;
    }

    private void d(MotionPath motionPath, MotionPathSimplify motionPathSimplify) {
        if (f == null || motionPath == null || motionPathSimplify == null) {
            return;
        }
        Iterator<StepRateData> it = motionPath.requestStepRateList().iterator();
        int iAcquireStepRate = 0;
        while (it.hasNext()) {
            iAcquireStepRate += it.next().acquireStepRate();
        }
        int i = this.ea;
        double dRequestTotalTime = ((motionPathSimplify.requestTotalTime() / 1000) % 60) * 1.0d;
        f.recoveryStep((int) dRequestTotalTime, dRequestTotalTime, i - iAcquireStepRate);
    }

    private void c(MotionPathSimplify motionPathSimplify, MotionPath motionPath) {
        if (motionPath != null) {
            this.dz.c(motionPath.getPacesV2(), motionPath.getBriPaceV2());
            this.dz.a(motionPath.requestPaceMap(), motionPath.requestBritishPaceMap());
        }
        if (motionPathSimplify != null) {
            this.dz.c(motionPathSimplify.requestTotalTime());
            this.dz.d(motionPathSimplify.requestPartTimeMap(), motionPathSimplify.requestBritishPartTimeMap());
        }
    }

    public void b(boolean z, int i) {
        if (this.ao == null) {
            ReleaseLogUtil.a("Track_SportManager", "sendPauseSportMsgWhenLockScreen mExtendHandler is null!");
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 4;
        if (i == 2) {
            this.cf = z;
        }
        this.ao.sendMessage(messageObtain);
    }

    public void bp() {
        if (this.ao == null) {
            ReleaseLogUtil.a("Track_SportManager", "sendResumeSportMsgWhenLockScreen mExtendHandler is null!");
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 5;
        this.ao.sendMessage(messageObtain);
    }

    public void br() {
        if (this.ao == null) {
            ReleaseLogUtil.a("Track_SportManager", "sendStopSportMsgWhenLockScreen mExtendHandler is null!");
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 6;
        this.ao.sendMessage(messageObtain);
    }

    public npg bq() {
        if (this.bf == null) {
            this.bf = npg.d();
        }
        return this.bf;
    }

    public void bt() {
        npg npgVarBq = bq();
        npgVarBq.b("sportTrackLocation");
        npgVarBq.e("sportTrackLocation");
        npgVarBq.c("sportTrackLocation");
        this.bf = null;
    }

    public void b(Bundle bundle) {
        if (bundle.getParcelable("runCourseDetail") != null) {
            if (this.aa == null) {
                this.aa = new iwj();
            }
            this.aa.d(bundle);
        }
    }

    public void b(List<gze> list) {
        this.fh.e(list);
        this.cd = true;
        b("Track_SportManagerTargetUpdate", this);
    }

    public List<gze> n() {
        return this.fh.d();
    }

    public void j(boolean z) {
        LogUtil.a("Track_SportManager", "setScreenOnOrForegrand() : ", Boolean.valueOf(z));
        this.cj = z;
        if (f != null) {
            f.setStepInterval(this.cj);
        }
    }

    static class c extends BaseHandlerCallback<iwy> {
        public c(iwy iwyVar) {
            super(iwyVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandlerCallback
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public boolean handleMessageWhenReferenceNotNull(iwy iwyVar, Message message) {
            LogUtil.a("Track_SportManager", "InnerCallback()  handleMessage ", Integer.valueOf(message.what));
            int i = message.what;
            if (i == 4 || i == 5 || i == 6) {
                if (iwyVar.gk == null) {
                    return true;
                }
                iwyVar.gk.sendEmptyMessage(message.what);
                return true;
            }
            if (i == 102) {
                iwyVar.a((Location) message.getData().getParcelable("Location"));
                return true;
            }
            if (i == 103) {
                if (iwyVar.ax == null) {
                    return true;
                }
                iwyVar.ax.b((Location) message.getData().getParcelable("Location"));
                return true;
            }
            if (i == 401) {
                iwyVar.et();
                return true;
            }
            if (i != 402) {
                return false;
            }
            jar.b(iwyVar.eg, iwyVar.fe.toString(), iwyVar.x);
            iwyVar.fe = new StringBuffer();
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(int i) {
        if (this.gj == 1 || this.bk) {
            ReleaseLogUtil.d("Track_SportManager", "LockScreen and AutoTrack, to pause/resume sport ", Integer.valueOf(i));
            if (i == 1) {
                bl();
            } else if (i == 2) {
                bd();
            } else if (i == 3) {
                m(bg());
                bh();
            } else {
                LogUtil.j("Track_SportManager", "Wrong Command");
            }
        }
        if (this.dn.size() != 0) {
            LogUtil.a("Track_SportManager", "updateSportStatusWhenLockScreen, to pause/resume sport ", Integer.valueOf(i));
            for (IMapViewListener iMapViewListener : this.dn) {
                if (iMapViewListener != null) {
                    iMapViewListener.updateSportStatusWhenLockScreen(i);
                }
            }
        }
    }

    class e implements Runnable {
        private e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (iwy.f38155c == null) {
                    return;
                }
                if (iwy.f38155c.ep == 1) {
                    iwy iwyVar = iwy.this;
                    iwyVar.ar = iwyVar.cn();
                    iwy.this.dx();
                    if (iwy.this.dm()) {
                        iwy iwyVar2 = iwy.this;
                        iwyVar2.b(iwyVar2.fx);
                    }
                    iwy.f38155c.increaseOrDecreaseSportDuration();
                    iwy.f38155c.c(iwy.this.ah());
                    iwy.this.fh.e(iwy.this.fx, iwy.this.en, iwy.this.u(), iwy.this.e());
                    iwy iwyVar3 = iwy.this;
                    iwyVar3.c(iwyVar3.en);
                    iwy.this.fg();
                    iwy.this.fe();
                    if (iwy.this.gb != null) {
                        iwy.this.gb.d(iwy.this.en, (int) iwy.this.fx);
                    }
                }
                if (iwy.this.gj == 1 && iwy.this.l != null && iwy.this.l.d(iwy.this.fp, iwy.this.am)) {
                    iwy.this.bs();
                }
                iwy.this.ei();
                if (iwy.this.dl() && iwy.f38155c.ep == 1) {
                    iwy.this.t();
                }
            } catch (Exception unused) {
                LogUtil.e("Track_SportManager", "TimeRunner Exception");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ei() {
        if ((!CommonUtil.ap() && !CommonUtil.ao()) || this.dz == null || this.be == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str = new SimpleDateFormat("YYYY-MM-dd-HH-mm-ss", Locale.ENGLISH).format(new Date());
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.fe.append(str);
        this.fe.append(",");
        this.fe.append(jCurrentTimeMillis);
        this.fe.append(",");
        float fJ = this.dz.j();
        this.fe.append(fJ == 0.0f ? 0 : (int) (3600.0f / fJ));
        this.fe.append(",");
        this.fe.append(fJ);
        this.fe.append(",");
        this.fe.append(this.fx);
        this.fe.append(",");
        this.fe.append(this.be.d());
        this.fe.append(",");
        this.fe.append(this.dz.g());
        this.fe.append(",");
        this.fe.append(this.be.e());
        this.fe.append(System.lineSeparator());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fg() {
        int i;
        if (f != null) {
            int currentSteps = f.getCurrentSteps();
            if (currentSteps < 0) {
                return;
            }
            int i2 = this.ey;
            if (i2 > 0 && (i = currentSteps - i2) > 0) {
                this.ea += i;
            }
            ixr ixrVar = this.fc;
            if (ixrVar != null) {
                ixrVar.b(this.ea);
                this.fc.e();
            }
            if (currentSteps > this.ey || System.currentTimeMillis() - this.cw > 1000) {
                this.ey = currentSteps;
            }
            LogUtil.a("Track_SportManager", "updateRealTimeSteps mRealTimeTotalSteps:", Integer.valueOf(this.ea), " currentSteps:", Integer.valueOf(currentSteps), "  mStartTotalSteps ", Integer.valueOf(this.ey));
        }
        ReleaseLogUtil.d("Track_SportManager", "updateRealTimeSteps mRealTimeTotalSteps");
    }

    public boolean bc() {
        return this.ep == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean dl() {
        boolean z = this.ep == 1;
        if (z && dn()) {
            return false;
        }
        ivm ivmVar = this.ga;
        if (ivmVar != null) {
            ivmVar.d();
        }
        if (z) {
            bx();
        }
        if (z) {
            this.et.i();
        }
        if (this.cj) {
            return true;
        }
        if (!ScreenUtil.d()) {
            return false;
        }
        this.cj = true;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(float f2) {
        this.cb = true;
        this.cu = f2;
        int iD = nps.d(this.aw);
        k(iD);
        if (this.dn.size() != 0) {
            for (IMapViewListener iMapViewListener : this.dn) {
                if (iMapViewListener != null) {
                    iMapViewListener.updateGpsStatus(iD);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean dm() {
        if (this.cb || this.ew == 264) {
            return false;
        }
        if (this.dd == null) {
            int iD = nps.d(4);
            if (this.aw <= iD && this.en > TimeUnit.SECONDS.toMillis(10L)) {
                int i = this.aw;
                LogUtil.a("Track_SportManager", "mGpsState is ", Integer.valueOf(i), " ,mSportDuration is ", LogAnonymous.a(this.en), ", isGPSPointLost is true");
                return true;
            }
            if (this.aw > iD && this.en > TimeUnit.SECONDS.toMillis(20L)) {
                int i2 = this.aw;
                LogUtil.a("Track_SportManager", "mGpsState is ", Integer.valueOf(i2), " ,mSportDuration is ", LogAnonymous.a(this.en), ", isGPSPointLost is true");
                return true;
            }
        } else if (System.currentTimeMillis() - this.cz > TimeUnit.SECONDS.toMillis(20L)) {
            ReleaseLogUtil.d("R_Track_SportManager", "isStartEstimateStepState the GPS signal is lost");
            return true;
        }
        return false;
    }

    private void t(boolean z) {
        this.cb = z;
    }

    public String aj() {
        return String.valueOf(this.eu);
    }

    public boolean al() {
        if (this.ge == null) {
            ReleaseLogUtil.a("Track_SportManager", "getTrackCrashState mTrackSharedPreferenceUtil is null!");
            return false;
        }
        boolean zE = jaq.e();
        this.bp = zE;
        LogUtil.a("Track_SportManager", "getTrackCrashState crash =", Boolean.valueOf(zE));
        return this.bp;
    }

    public void i(boolean z) {
        if (this.ge == null) {
            LogUtil.e("Track_SportManager", "setTrackCrashState mTrackSharedPreferenceUtil is null!");
            return;
        }
        ReleaseLogUtil.d("Track_SportManager", "setTrackCrashState crash =", Boolean.valueOf(z));
        jaq.c(z);
        if (!z) {
            this.ge.i("");
        }
        this.bp = z;
        if (z) {
            return;
        }
        cd();
    }

    private String cs() {
        jaq jaqVar = this.ge;
        if (jaqVar == null) {
            LogUtil.e("Track_SportManager", "getLogOffset mTrackSharedPreferenceUtil is null!");
            return "";
        }
        return jaqVar.y();
    }

    private void h(String str) {
        jaq jaqVar = this.ge;
        if (jaqVar == null) {
            LogUtil.e("Track_SportManager", "setLogOffset mTrackSharedPreferenceUtil is null!");
        } else {
            jaqVar.i(str);
        }
    }

    public void bj() {
        if (this.l != null) {
            float f2 = this.fx;
            this.fw = f2;
            LogUtil.a("Track_SportManager", "mTotalSnapshotSportDistance is ", LogAnonymous.d((int) f2));
            iyd iydVar = this.o;
            if (iydVar == null || this.fx < iydVar.a()) {
                return;
            }
            this.l.b(true);
            this.ar = cn();
            ej();
        }
    }

    public void q() {
        synchronized (f38154b) {
            this.fj.clear();
        }
        this.et.b();
        ixr ixrVar = this.fc;
        if (ixrVar != null) {
            ixrVar.b(true);
        }
        ize izeVar = this.ed;
        if (izeVar != null) {
            izeVar.e(true);
        }
        this.dz.d(true);
        this.dz.c(true);
        this.dz.a(true);
        this.dz.e(true);
        this.f6do.clear();
    }

    private boolean dp() {
        iyd iydVar = this.o;
        if (iydVar == null) {
            return false;
        }
        if (this.fx >= iydVar.a()) {
            return true;
        }
        LogUtil.a("Track_SportManager", "isNeedSaveAutoTrack() ,", LogAnonymous.d((int) this.fw), " less than ", Float.valueOf(this.o.a()), ", do not need to save this track");
        return false;
    }

    public void a(StepRateData stepRateData) {
        ixr ixrVar;
        if (stepRateData == null || (ixrVar = this.fc) == null) {
            return;
        }
        ixrVar.b(stepRateData);
        LogUtil.a("Track_SportManager", "recoveryAutoTrackSnapshotInfo() save current step success");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long cn() {
        if (this.l == null || this.dt == null) {
            return System.currentTimeMillis();
        }
        if (this.l.e()) {
            return this.dt.requestEndTime();
        }
        return System.currentTimeMillis();
    }

    private void de() {
        TrackDevelopConfig trackDevelopConfig = this.fy;
        if (trackDevelopConfig == null || trackDevelopConfig.a()) {
            String strCs = cs();
            this.ds = strCs;
            if (strCs == null || "".equals(strCs)) {
                int iNextInt = new SecureRandom().nextInt(70);
                this.eb = iNextInt;
                String strValueOf = String.valueOf(iNextInt);
                this.ds = strValueOf;
                h(strValueOf);
            } else {
                try {
                    try {
                        this.eb = Integer.parseInt(this.ds);
                    } catch (NumberFormatException unused) {
                        LogUtil.e("Track_SportManager", "initLogOffset exception");
                    }
                } catch (NumberFormatException unused2) {
                    this.eb = (int) Double.parseDouble(this.ds);
                }
            }
            this.di = this.eb + 20;
            this.dj = 17;
        } else {
            this.di = 0;
            this.dj = 0;
        }
        ReleaseLogUtil.d("R_Track_SportManager", "lonOffset ", Integer.valueOf(this.di), " latOffset ", Integer.valueOf(this.dj));
    }

    public boolean ba() {
        if (!this.cn) {
            return false;
        }
        int i = this.ew;
        return i == 258 || i == 257 || i == 264 || i == 282 || i == 260;
    }

    public int e(ISportDataCallback iSportDataCallback, long j2) {
        if (iSportDataCallback == null || b(iSportDataCallback) != null) {
            LogUtil.j("Track_SportManager", "registerSportDataCallback failed ", Integer.valueOf(this.ek.size()));
            return 5;
        }
        this.ek.add(new jbu(iSportDataCallback, j2));
        LogUtil.a("Track_SportManager", "registerSportDataCallback success ", iSportDataCallback, " ", Integer.valueOf(this.ek.size()));
        return 0;
    }

    public int a(ISportDataCallback iSportDataCallback) {
        if (iSportDataCallback == null) {
            LogUtil.j("Track_SportManager", "unregisterSportDataCallback failed, cb is null");
            return 5;
        }
        jbu jbuVarB = b(iSportDataCallback);
        if (jbuVarB == null) {
            ReleaseLogUtil.e("Track_SportManager", "unregisterSportDataCallback failed, the proxy is not exist");
            return 5;
        }
        this.ek.remove(jbuVarB);
        LogUtil.a("Track_SportManager", "unregisterSportDataCallback success ", iSportDataCallback);
        return 0;
    }

    public jbu b(ISportDataCallback iSportDataCallback) {
        List<jbu> list = this.ek;
        if (list == null || list.size() == 0) {
            return null;
        }
        for (jbu jbuVar : this.ek) {
            if (jbuVar.d() == iSportDataCallback) {
                return jbuVar;
            }
        }
        return null;
    }

    public Bundle ah() {
        Bundle bundle;
        nsp nspVar;
        synchronized (f38153a) {
            if (this.ei != null && (nspVar = this.ej) != null) {
                this.ei = nspVar;
                c(nspVar);
            }
            bundle = new Bundle();
            bundle.putInt(GeocodeSearch.GPS, nps.d(this.ep));
            this.et.a(bundle);
            nsp nspVar2 = this.ei;
            if (nspVar2 != null) {
                bundle.putInt(MedalConstants.EVENT_STEPS, nspVar2.u());
                bundle.putInt("distance", this.ei.k());
                bundle.putInt("duration", this.ei.n());
                bundle.putInt("calorie", this.ei.b());
                bundle.putInt(HwExerciseConstants.JSON_NAME_ACTIVECALORIE, this.ei.e());
                bundle.putInt("pace", this.ei.g());
                bundle.putFloat("speed", this.ei.h());
                bundle.putFloat("avgSpeed", cq() * 100.0f);
                bundle.putFloat("maxSpeed", cv() * 100.0f);
                if (!j) {
                    ReleaseLogUtil.e("Track_SportManager", " getSportDataBundle SportStatus is ", Integer.valueOf(this.df));
                    bundle.putInt("sportState", this.df);
                } else {
                    bundle.putInt("sportState", this.ei.r());
                }
                bundle.putInt("altitude", this.ei.c());
            }
            k(bundle);
            if (dt()) {
                e(bundle);
            }
            bundle.putInt("origintarget", this.dq);
            bundle.putInt(BleConstants.SPORT_TYPE, this.ew);
            bundle.putInt("trackType", this.gj);
            n(bundle);
        }
        return bundle;
    }

    private void k(Bundle bundle) {
        nsp nspVar;
        if (!this.et.g() || (nspVar = this.ei) == null) {
            return;
        }
        bundle.putInt(IndoorEquipManagerApi.KEY_HEART_RATE, nspVar.j());
        bundle.putInt("stepRate", this.ei.q());
        bundle.putInt("totalCreep", this.ei.t());
        bundle.putInt(BleConstants.TOTAL_DESCENT, this.ei.s());
        bundle.putInt("aerobicExercise", this.ei.a());
        bundle.putInt("anaerobicExercise", this.ei.d());
        bundle.putInt("performanceIndicator", this.ei.l());
        bundle.putInt("linkType", this.ei.i());
        bundle.putInt("heartZone", this.ei.f());
        bundle.putLong("sportStartTime", this.ei.p());
        if (izn.e(this.ew) && this.fc != null && this.bq) {
            int iF = this.fc.f();
            if (!this.cm) {
                iF = Math.round(iF / 12.0f);
            }
            bundle.putInt("stepRate", iF);
        }
    }

    private void e(Bundle bundle) {
        gze gzeVarB = this.fh.b();
        int i = gzeVarB.i();
        float fD = gzeVarB.d() + gzeVarB.h();
        bundle.putInt(WorkoutRecord.Extend.COURSE_TARGET_TYPE, i);
        bundle.putFloat(WorkoutRecord.Extend.COURSE_TARGET_VALUE, fD);
        if (this.dq == 4) {
            bundle.putInt("runningCourseVersion", 1);
            bundle.putInt("runningActionIndex", gzeVarB.c());
            bundle.putInt("runningCourseNumber", gzeVarB.j());
            bundle.putString("runningActionId", gzeVarB.e());
            bundle.putInt("goalType", n(i));
            bundle.putInt("goalGapValue", d(fD, i));
        }
    }

    private int d(float f2, int i) {
        if (i == 0) {
            return Math.round((f2 - this.en) / 1000.0f);
        }
        if (i == 1) {
            return Math.round(f2 - this.fx);
        }
        LogUtil.d("Track_SportManager", "getGoalGapValue other targetType");
        return 0;
    }

    private void n(Bundle bundle) {
        if (dt()) {
            gze gzeVarB = this.fh.b();
            float fD = gzeVarB.d() + gzeVarB.h();
            int i = gzeVarB.i();
            if (i == -1) {
                bundle.putInt("distanceTarget", (int) fD);
                return;
            }
            if (i == 0) {
                bundle.putInt("timeTarget", ((int) fD) / 1000);
                return;
            }
            if (i == 1) {
                bundle.putInt("distanceTarget", (int) fD);
                return;
            }
            if (i == 2) {
                bundle.putInt("calorieTarget", (int) fD);
            } else if (i == 3 || i == 4) {
                bundle.putInt("distanceTarget", (int) fD);
            } else {
                bundle.putInt("distanceTarget", (int) fD);
            }
        }
    }

    public void c(Bundle bundle) {
        for (jbu jbuVar : this.ek) {
            if (jbuVar != null) {
                jbuVar.e(bundle);
            }
        }
    }

    private void f(Bundle bundle) {
        for (jbu jbuVar : this.ek) {
            if (jbuVar != null) {
                jbuVar.c(bundle);
            }
        }
    }

    private void fk() {
        LogUtil.a("Track_SportManager", "updateSportDataSummaryToListener enter");
        if (this.dt == null) {
            LogUtil.j("Track_SportManager", " updateSportDataSummaryToListener mMotionPathSimplify is null");
        }
        for (jbu jbuVar : this.ek) {
            if (jbuVar != null) {
                jbuVar.c(this.dt);
            }
        }
    }

    public void bn() {
        boolean zDp = dp();
        if (this.bk) {
            zDp = bg();
        }
        l(zDp);
    }

    private void c(String str) {
        npg npgVarBq = bq();
        boolean z = this.cg;
        if (z) {
            npgVarBq.e(z);
        }
        npgVarBq.b(new IGpsStatusCallback() { // from class: iwy.3
            @Override // com.huawei.hwlocationmgr.model.IGpsStatusCallback
            public void updateGpsStatus(int i) {
                iwy.this.l(i);
            }
        }, str);
    }

    private void a(String str) {
        bq().a(new ILoactionCallback() { // from class: iwy.10
            @Override // com.huawei.hwlocationmgr.model.ILoactionCallback
            public void dispatchLocationChanged(Location location) {
                iwy.this.b(location);
            }
        }, str);
        this.ao.sendEmptyMessage(401, 500L);
    }

    private void g(String str) {
        npg npgVarBq = bq();
        if (this.be.h() && npgVarBq != null) {
            npgVarBq.a(GeocodeSearch.GPS, "FitEnableMode:-1", null);
            this.i = true;
        }
        npgVarBq.c(str);
        npgVarBq.e(str);
        npgVarBq.b(str);
        npgVarBq.e("sportTrackTempLocation");
    }

    public void h(boolean z) {
        if (this.l == null) {
            LogUtil.a("Track_SportManager", "init mAutoTrackManager, isClassOne is ", Boolean.valueOf(z));
            this.l = new iwd(this.x, z);
        }
    }

    public void bu() {
        iwd iwdVar = this.l;
        if (iwdVar != null) {
            iwdVar.b();
            this.l = null;
        }
    }

    public int a(ISportDistanceTimeCallback iSportDistanceTimeCallback) {
        if (iSportDistanceTimeCallback == null) {
            return 5;
        }
        this.dy = iSportDistanceTimeCallback;
        return 0;
    }

    private void d(ISportDistanceTimeCallback iSportDistanceTimeCallback) {
        if (iSportDistanceTimeCallback != null) {
            this.dy = null;
        }
    }

    private long ca() {
        long jCurrentTimeMillis = (System.currentTimeMillis() - this.eu) - this.en;
        long jX = (long) (this.an * x());
        return (jCurrentTimeMillis >= 0 && jCurrentTimeMillis < jX) ? jCurrentTimeMillis : jX;
    }

    public float u() {
        return this.u.a();
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.inteface.ITrackPointDataUpdater
    public float getActiveCalorie() {
        return this.u.d();
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.inteface.ITrackPointDataUpdater
    public float getDistance() {
        return this.fx;
    }

    public void b(String str) {
        if (str == null) {
            ReleaseLogUtil.e("Track_SportManager", "distance is null");
            return;
        }
        float f2 = CommonUtils.f(str) * 1000.0f;
        this.bn = true;
        if (UnitUtil.f()) {
            f2 = (float) UnitUtil.c(f2, 3);
        }
        iyz iyzVar = this.dz;
        if (iyzVar != null) {
            iyzVar.a((int) this.fx, 0, false);
            Map<Integer, Float> mapA = izu.a(this.dz.i(), this.fx, f2);
            double d2 = f2;
            Map<Integer, Float> mapA2 = izu.a(this.dz.d(), (float) UnitUtil.e(this.fx, 3), (float) UnitUtil.e(d2, 3));
            this.dz.d(mapA);
            this.dz.e(mapA2);
            this.dz.a(izu.d(mapA, false));
            this.dz.c(izu.d(mapA2, true));
            List<njj> listB = izu.b(this.dz.h(), this.fx, f2);
            List<njj> listB2 = izu.b(this.dz.e(), (float) UnitUtil.e(this.fx, 3), (float) UnitUtil.e(d2, 3));
            this.dz.e(listB);
            this.dz.c(listB2);
        }
        float f3 = f2 / this.fx;
        ReleaseLogUtil.d("Track_SportManager", "changeDistance:", Float.valueOf(f3), ", originDistance is ", LogAnonymous.d((int) f2), ", mTotalSportDistance is ", LogAnonymous.d((int) this.fx));
        this.fx = f2;
        this.u.e(f3);
        e(f3);
    }

    private void e(float f2) {
        ixu ixuVar = this.gd;
        if (ixuVar != null) {
            ixuVar.e(f2);
        } else {
            LogUtil.j("Track_SportManager", "changeTrackPointDataByRatio mTrackPointDataUtils is null");
        }
    }

    private void ck() {
        izp izpVar = this.ax;
        if (izpVar != null) {
            izpVar.e(this.x);
        }
        if (this.gc != null) {
            HashMap map = new HashMap(1);
            map.putAll(this.gc.d());
            LogUtil.a("Track_SportManager", "doEndBi ", map);
            lmf.d().c(this.x, AnalyticsValue.BI_TRACK_SPORT_ALGO_FILTER.value(), map, 0);
        }
        if (!Utils.o()) {
            HashMap map2 = new HashMap(4);
            map2.put("userPauseDuration", Long.valueOf(this.dv));
            map2.put("userPauseTimes", Integer.valueOf(this.dx));
            map2.put("userStaticDuration", Long.valueOf(this.fl));
            map2.put("userStaticTimes", Integer.valueOf(this.fk));
            LogUtil.a("Track_SportManager", "doEndBi ", map2);
            lmf.d().c(this.x, AnalyticsValue.BI_TRACK_SPORT_USER_BEHAVIOR.value(), map2, 0);
        }
        int iA = izn.a(this.ew);
        if (iA != 0) {
            OpAnalyticsUtil.getInstance().setEventWithActionType(iA, OperationKey.HEALTH_APP_RUN_END_2050006.value());
        }
        ci();
    }

    private void ci() {
        iwr iwrVar = this.bd;
        if (iwrVar == null) {
            return;
        }
        String strE = iwrVar.e();
        if (TextUtils.isEmpty(strE)) {
            return;
        }
        lmn lmnVar = new lmn();
        HashMap map = new HashMap(5);
        map.put("event", 1);
        map.put(FunctionSetBeanReader.BI_ELEMENT, "c6");
        map.put("action", 0);
        map.put("moduleName", "motion_control");
        map.put(BleConstants.SPORT_TYPE, Integer.valueOf(this.ew));
        lmnVar.e(map);
        HashMap map2 = new HashMap(2);
        map2.put("map_area", strE);
        map2.put("distance", Float.valueOf(getDistance()));
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(map2);
        lmnVar.d(arrayList);
        lmf.d().a(BaseApplication.getContext(), AnalyticsValue.BI_TRACK_SPORT_START_SPORT_KEY.value(), lmnVar, 0);
    }

    public int m() {
        ixr ixrVar = this.fc;
        if (ixrVar == null) {
            return 0;
        }
        return ixrVar.m() + this.fc.b();
    }

    public boolean d() {
        return this.ca;
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.inteface.IStepRateUpdater
    public void updateStepRate(StepRateData stepRateData) {
        if (stepRateData == null) {
            c("action_send_steprate_to_hwmusic", (Bundle) null, 0);
        } else {
            c("action_send_steprate_to_hwmusic", (Bundle) null, stepRateData.acquireStepRate());
        }
    }

    private void c(String str, Bundle bundle, int i) {
        if (!jaa.f(this.x)) {
            LogUtil.a("Track_SportManager", "not supportMusic");
            return;
        }
        Intent intent = new Intent(str);
        if (bundle != null) {
            intent.putExtra("extroInfo", bundle);
        }
        intent.putExtra("stepRate", i);
        iyb.a(this.x, intent);
    }

    private void fj() {
        LogUtil.a("Track_SportManager", "updateSportDataToMusic enter");
        if (this.dt == null) {
            LogUtil.j("Track_SportManager", " updateSportDataToMusic mMotionPathSimplify is null");
            c("action_stop_play_sport_music", (Bundle) null, 0);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("duration", this.dt.requestTotalTime());
        bundle.putInt("stepRate", this.dt.requestAvgStepRate());
        bundle.putInt(MedalConstants.EVENT_STEPS, this.dt.requestTotalSteps());
        c("action_stop_play_sport_music", bundle, 0);
    }

    public void e(int i) {
        ixy ixyVar = this.gf;
        if (ixyVar != null) {
            ixyVar.a(i);
        } else {
            LogUtil.a("Track_SportManager", "notifyUserOperateSportState is null");
        }
    }

    public void k(boolean z) {
        ixy ixyVar = this.gf;
        if (ixyVar == null) {
            LogUtil.a("Track_SportManager", "updateBikeAutoPauseStrategy mTrackStrategyManager is null");
        } else {
            ixyVar.b(z);
        }
    }

    private void em() {
        el();
        if (this.gh == null) {
            this.gh = new TrackPauseDataMgr(this.x);
        }
        this.gh.c();
        c(this.gh);
        if (this.gb == null) {
            this.gb = new TrackDisDataMgr(this.x);
        }
        this.gb.d();
    }

    private void el() {
        if (bb()) {
            if (this.fz == null) {
                this.fz = new TrackAltitudeMgr(this.x);
            }
            this.fz.e();
            c(this.fz);
        }
    }

    public boolean bb() {
        int i = this.ew;
        return i == 259 || i == 258 || i == 257 || i == 282 || i == 260;
    }

    private void ew() {
        TrackAltitudeMgr trackAltitudeMgr = this.fz;
        if (trackAltitudeMgr != null) {
            trackAltitudeMgr.f();
        }
        b(this.fz);
    }

    public void by() {
        fkw fkwVar = this.gc;
        if (fkwVar != null) {
            fkwVar.h();
        }
    }

    public void c(boolean z) {
        if (cl()) {
            awr awrVar = new awr();
            awrVar.b(this.dz.f());
            awrVar.e(this.ew);
            if (z) {
                awrVar.d(this.dz.o());
                awrVar.a(this.dz.m());
            } else {
                awrVar.d(this.dz.i());
                awrVar.a(this.dz.h());
            }
            awrVar.c(x());
            awrVar.c((int) this.fx);
            awrVar.b(getSportDurationBySecond());
            ixr ixrVar = this.fc;
            int iM = ixrVar != null ? ixrVar.m() : 0;
            if (iM == 0) {
                iM = this.ea;
            }
            awrVar.b(iM);
            awrVar.a(awy.a(this.x));
            awrVar.a(this.gj);
            this.g = awy.c(awrVar);
            this.cp = awy.a(awrVar);
            if (!z) {
                OpAnalyticsUtil.getInstance().setEventOneErrorCode(OperationKey.HEALTH_APP_ABNORMAL_TRAJECTORY_85070016.value(), this.g);
            }
            LogUtil.a("Track_SportManager", "mAbnormalTrack:", Integer.valueOf(this.g), ", abnormalData", awrVar.toString(), " mIsStepAbnormal ", Boolean.valueOf(this.cp));
        }
    }

    private void c(nsp nspVar) {
        nspVar.k(Math.round((this.en * 1.0f) / 1000.0f));
        nspVar.j((int) this.fx);
        LogUtil.d("Track_SportManager", "old distance:" + this.fx);
        nspVar.e(Math.round(u()) * 1000);
        nspVar.c(Math.round(getActiveCalorie()) * 1000);
        nspVar.h(e());
        float fY = y();
        if (fY <= 0.0f || fY >= 200.0f || this.fx < 10.0f) {
            nspVar.b(0.0f);
        } else {
            nspVar.b((y() * 1000.0f) / 3600.0f);
        }
        if (az() && fY > 1.0E-4f) {
            int i = (int) (3600.0f / fY);
            nspVar.g(i < 6000 ? i : 0);
        } else {
            nspVar.g(0);
        }
        nspVar.b(this.eu);
        nspVar.p(this.ea);
        LogUtil.a("Track_SportManager", "saveAndSetReportData mRealTimeTotalSteps:", Integer.valueOf(this.ea));
        nspVar.n(this.ep);
        TrackAltitudeMgr trackAltitudeMgr = this.fz;
        if (trackAltitudeMgr == null || Math.abs(trackAltitudeMgr.d()) <= 1.0E-6d) {
            return;
        }
        nspVar.d(((int) this.fz.d()) * 10);
        nspVar.l(((int) this.fz.c()) * 10);
        nspVar.m(((int) this.fz.a()) * 10);
    }

    private void es() {
        LogUtil.a("Track_SportManager", "startTreadmillStep");
        if (f == null || this.fb != 1) {
            return;
        }
        f.startTreadmillStep();
        ep();
    }

    private void fb() {
        LogUtil.a("Track_SportManager", "stopTreadmillStep");
        if (f != null) {
            if (this.fb == 1 || this.dr == 1) {
                f.unregisterFreeIndoorRunningStyle();
                f.stopTreadmillStep();
                LogUtil.a("Track_SportManager", "stopTreadmillStep sucess");
            }
        }
    }

    public iyz af() {
        return this.dz;
    }

    private void ep() {
        if (f == null) {
            ReleaseLogUtil.a("Track_SportManager", "startTreadmillStyle mPluginTrackAdapter is null!");
        } else {
            LogUtil.a("Track_SportManager", "startTreadmillStyle");
            f.registerFreeIndoorRunningStyle(new ITreadmillStyleCallback() { // from class: iwy.6
                @Override // com.huawei.healthcloud.plugintrack.manager.inteface.ITreadmillStyleCallback
                public void onTreadmillStyleChange(int i, long j2) {
                    LogUtil.a("Track_SportManager", "onTreadmillStyleChange style is ", Integer.valueOf(i), " , time is ", Long.valueOf(j2));
                    iwy.this.gm = i;
                }
            });
        }
    }

    private fku k(jpi jpiVar) {
        return new fku(jpiVar.i(), jpiVar.h(), jpiVar.b(), jpiVar.d(), jpiVar.e(), jpiVar.c(), jpiVar.f(), jpiVar.g());
    }

    public boolean av() {
        return this.bc;
    }

    public void a(String str, SportComponent sportComponent) {
        this.el.b(str, sportComponent);
    }

    public void e(String str, SportVoiceEnableListener sportVoiceEnableListener) {
        if (StringUtils.j(str) && sportVoiceEnableListener != null) {
            this.go.put(str, sportVoiceEnableListener);
            ReleaseLogUtil.d("Track_SportManager", "addVoiceEnableListener tag:", str, " listener:", sportVoiceEnableListener, " component size:", Integer.valueOf(this.go.size()));
        } else {
            ReleaseLogUtil.e("Track_SportManager", "addVoiceEnableListener failed with error params. tag:", str, " listener:", sportVoiceEnableListener);
        }
    }

    public void b(boolean z) {
        LogUtil.a("Track_SportManager", "dispachVoiceEnableChange() begin. enabled:", Boolean.valueOf(z));
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.go);
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((SportVoiceEnableListener) it.next()).onChange(z);
        }
        LogUtil.a("Track_SportManager", "dispachVoiceEnableChange() finished. listeners:", linkedHashMap.keySet());
    }

    public void c(TrackRealDataListener trackRealDataListener) {
        this.gg = trackRealDataListener;
    }

    public void bz() {
        this.gg = null;
    }

    private void k(int i) {
        TrackRealDataListener trackRealDataListener = this.gg;
        if (trackRealDataListener == null) {
            return;
        }
        trackRealDataListener.updateGpsState(i);
    }

    private void m(Bundle bundle) {
        TrackRealDataListener trackRealDataListener = this.gg;
        if (trackRealDataListener == null) {
            return;
        }
        trackRealDataListener.updateSportData(bundle);
    }

    private void fi() {
        TrackRealDataListener trackRealDataListener = this.gg;
        if (trackRealDataListener == null) {
            return;
        }
        trackRealDataListener.updateLinkStart();
    }
}

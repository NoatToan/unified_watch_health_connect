package com.huawei.ui.homehealth.knit;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import com.huawei.haf.common.security.SecurityConstant;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.healthmodel.bean.HealthLifeTaskBean;
import com.huawei.health.knit.data.BaseKnitDataProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.health.marketing.api.MarketingApi;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.ResourceResultInfo;
import com.huawei.healthcloud.plugintrack.callback.CommonSingleCallback;
import com.huawei.hihealth.motion.HealthOpenSDK;
import com.huawei.hihealth.motion.IFlushResult;
import com.huawei.hihealth.util.HiBroadcastUtil;
import com.huawei.hwadpaterhealthmgr.PluginAchieveAdapterImpl;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.utils.OperationUtils;
import com.huawei.threecircle.manager.WheelChairStateManager;
import com.huawei.ui.homehealth.stepscard.AchieveTaskHandler;
import com.huawei.ui.homehealth.threecirclecard.model.StepsViewModel;
import com.huawei.ui.main.stories.me.util.StepCounterSupportUtil;
import defpackage.da;
import defpackage.ffv;
import defpackage.fga;
import defpackage.fsb;
import defpackage.lmf;
import defpackage.lrd;
import defpackage.lsl;
import defpackage.njy;
import defpackage.npt;
import defpackage.qgm;
import defpackage.tau;
import defpackage.tbc;
import defpackage.tbd;
import defpackage.tbe;
import defpackage.tdy;
import defpackage.uin;
import defpackage.ujq;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes17.dex */
public class ModelCardProvider extends BaseKnitDataProvider implements WheelChairStateManager.SwitchStateListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static long f25612c;
    private int ad;
    private ThreeLeafCardProvider af;
    private tbc ag;
    private ThreeCircleCardProvider ah;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected boolean f25614b;
    public Context d;
    private ResourceResultInfo f;
    private int g;
    private StepsViewModel j;
    private ExecutorService l;
    private Handler n;
    private long p;
    private CommonSingleCallback<Boolean> x;
    private SectionBean z;
    private HashMap<String, Object> y = new HashMap<>();
    private boolean r = true;
    protected AchieveTaskHandler e = new AchieveTaskHandler();
    private Observer<Bundle> ac = new Observer() { // from class: com.huawei.ui.homehealth.knit.ModelCardProvider$$ExternalSyntheticLambda16
        @Override // androidx.lifecycle.Observer
        /* JADX INFO: renamed from: onChanged */
        public final void b(Object obj) {
            this.f25615b.c((Bundle) obj);
        }
    };
    private Observer<HashMap<String, Integer>> o = new Observer() { // from class: com.huawei.ui.homehealth.knit.ModelCardProvider$$ExternalSyntheticLambda17
        @Override // androidx.lifecycle.Observer
        /* JADX INFO: renamed from: onChanged */
        public final void b(Object obj) {
            this.f25616c.e((HashMap<String, Integer>) obj);
        }
    };
    private Observer<ResourceResultInfo> v = new Observer() { // from class: com.huawei.ui.homehealth.knit.ModelCardProvider$$ExternalSyntheticLambda18
        @Override // androidx.lifecycle.Observer
        /* JADX INFO: renamed from: onChanged */
        public final void b(Object obj) {
            this.e.a((ResourceResultInfo) obj);
        }
    };
    private e aa = new e(this);
    private tbe w = null;
    private boolean q = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f25613a = true;
    private boolean i = true;
    private boolean t = false;
    private int s = 0;
    private final int[] m = {270, 25, 12, 10000};
    private final int[] h = {0, 0, 0, 0, 0, 0, 0};
    private HealthOpenSDK k = null;
    private final b ae = new b(this);
    private com.huawei.haf.design.pattern.Observer ab = new com.huawei.haf.design.pattern.Observer() { // from class: com.huawei.ui.homehealth.knit.ModelCardProvider.2
        @Override // com.huawei.haf.design.pattern.Observer
        public void notify(String str, Object... objArr) {
            LogUtil.a("SCUI_ModelCardProvider", "mSwitchModelObserver notify");
            if ("cloverLife".equals(str)) {
                if ("threeLeafCard".equals(fsb.b())) {
                    LogUtil.a("SCUI_ModelCardProvider", "show three leaf already");
                } else if ("threeCircleCard".equals(fsb.b())) {
                    ModelCardProvider.this.k();
                    ModelCardProvider.this.y.put("NOTIFY_MODEL_CHANGED", false);
                    ModelCardProvider.this.x();
                }
            }
        }
    };
    private final com.huawei.haf.design.pattern.Observer u = new com.huawei.haf.design.pattern.Observer() { // from class: spv
        @Override // com.huawei.haf.design.pattern.Observer
        public final void notify(String str, Object[] objArr) {
            this.f48504a.b(str, objArr);
        }
    };

    public static class a extends BaseHandler<ModelCardProvider> {
        public a(ModelCardProvider modelCardProvider) {
            super(modelCardProvider);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(ModelCardProvider modelCardProvider, Message message) {
            if (message == null) {
                ReleaseLogUtil.d("SCUI_ModelCardProvider", "msg == null");
                return;
            }
            int i = message.what;
            if (i == 1) {
                modelCardProvider.w();
            } else if (i == 10) {
                modelCardProvider.h();
            } else {
                if (i != 11) {
                    return;
                }
                modelCardProvider.s();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0038  */
    public /* synthetic */ void b(String str, final Object[] objArr) {
        byte b2;
        str.hashCode();
        int iHashCode = str.hashCode();
        if (iHashCode != 59925378) {
            if (iHashCode != 1178094076) {
                if (iHashCode == 1991442356 && str.equals("HEALTH_LIFE_DAY_RECORD")) {
                    b2 = 2;
                } else {
                    b2 = -1;
                }
            } else if (str.equals("HOME_FRAGMENT_IS_VISIBLE_TO_USER")) {
                b2 = 1;
            } else {
                b2 = -1;
            }
        } else if (str.equals("NOTIFY_STEP_CARD_CHANGED")) {
            b2 = 0;
        } else {
            b2 = -1;
        }
        if (b2 == 0) {
            LogUtil.a("SCUI_ModelCardProvider", "switch card", str);
            HandlerExecutor.b(new Runnable() { // from class: spx
                @Override // java.lang.Runnable
                public final void run() {
                    this.f48506a.b(objArr);
                }
            });
            return;
        }
        if (b2 != 1) {
            if (b2 != 2) {
                LogUtil.j("SCUI_ModelCardProvider", "mObserver label ", str, " objects ", objArr);
                return;
            } else if (objArr == null) {
                ReleaseLogUtil.d("R_SCUI_ModelCardProvider", "mObserver objects ", null);
                return;
            } else {
                e(objArr);
                return;
            }
        }
        if (objArr == null || objArr.length <= 0) {
            ReleaseLogUtil.d("R_SCUI_ModelCardProvider", "mObserver objects ", objArr);
            return;
        }
        Object obj = objArr[0];
        if (!(obj instanceof Boolean)) {
            ReleaseLogUtil.d("R_SCUI_ModelCardProvider", "mObserver object ", obj);
            return;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        this.f25614b = zBooleanValue;
        LogUtil.a("SCUI_ModelCardProvider", "mObserver isHomeFragmentVisible = ", Boolean.valueOf(zBooleanValue));
        ThreeLeafCardProvider threeLeafCardProvider = this.af;
        if (threeLeafCardProvider != null) {
            threeLeafCardProvider.a(this.f25614b);
        }
    }

    public /* synthetic */ void b(Object[] objArr) {
        onResume();
        if (objArr == null || objArr.length <= 0) {
            LogUtil.j("SCUI_ModelCardProvider", "switch card objects is empty");
            this.ad = 0;
            return;
        }
        Object obj = objArr[0];
        if (obj instanceof String) {
            String str = (String) obj;
            ThreeCircleCardProvider threeCircleCardProvider = this.ah;
            if (threeCircleCardProvider != null) {
                threeCircleCardProvider.c(str, this.ad);
            }
            ThreeLeafCardProvider threeLeafCardProvider = this.af;
            if (threeLeafCardProvider != null) {
                threeLeafCardProvider.c(str, this.ad);
            }
        }
        this.ad = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        if (this.f25613a) {
            this.y.clear();
            this.f25613a = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        HandlerExecutor.b(new Runnable() { // from class: spu
            @Override // java.lang.Runnable
            public final void run() {
                this.f48503c.a();
            }
        });
    }

    public /* synthetic */ void a() {
        ThreeLeafCardProvider threeLeafCardProvider = this.af;
        if (threeLeafCardProvider != null) {
            threeLeafCardProvider.d(UnitUtil.e(1.0d, 1, 0));
            this.af.a(0);
        }
    }

    private void e(final Object[] objArr) {
        HandlerExecutor.b(new Runnable() { // from class: spr
            @Override // java.lang.Runnable
            public final void run() {
                this.d.d(objArr);
            }
        });
    }

    public /* synthetic */ void d(Object[] objArr) {
        if (njy.e(objArr, 0)) {
            LogUtil.j("SCUI_ModelCardProvider", "observerForHealthLife objects ", objArr);
            return;
        }
        if (this.ah == null) {
            LogUtil.j("SCUI_ModelCardProvider", "mThreeCircleCardData is null");
            return;
        }
        Object obj = objArr[0];
        int iD = njy.b(obj, HealthLifeTaskBean.class) ? d((List<HealthLifeTaskBean>) obj) : 0;
        int iD2 = d(ffv.h());
        LogUtil.a("SCUI_ModelCardProvider", "observerForHealthLife completeCount:", Integer.valueOf(iD), " lastCompleteCount:", Integer.valueOf(iD2));
        if (iD > iD2) {
            int i = iD - iD2;
            this.ad = i;
            ThreeCircleCardProvider threeCircleCardProvider = this.ah;
            if (threeCircleCardProvider != null) {
                threeCircleCardProvider.d(UnitUtil.e(i, 1, 0));
                this.ah.a(0);
            }
            HashMap map = new HashMap(2);
            map.put("click", 1);
            map.put("reminderNum", Integer.valueOf(this.ad));
            lmf.d().c(this.d, AnalyticsValue.HEALTH_LIFE_TASK_COMPLETE_2119095.value(), map, 0);
            return;
        }
        this.ad = 0;
        ThreeCircleCardProvider threeCircleCardProvider2 = this.ah;
        if (threeCircleCardProvider2 != null) {
            threeCircleCardProvider2.a(8);
        }
    }

    private int d(List<HealthLifeTaskBean> list) {
        int i = 0;
        if (njy.e(list)) {
            return 0;
        }
        for (HealthLifeTaskBean healthLifeTaskBean : list) {
            if (healthLifeTaskBean != null && healthLifeTaskBean.getComplete() > 0) {
                i++;
            }
        }
        return i;
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: loadData */
    public void b(Context context, SectionBean sectionBean) {
        this.d = context;
        this.z = sectionBean;
        if (this.r) {
            this.n = new a(this);
            tdy.e(this.h);
            tdy.c(this.m);
            t();
            r();
            ThreeCircleCardProvider threeCircleCardProvider = new ThreeCircleCardProvider(context);
            this.ah = threeCircleCardProvider;
            threeCircleCardProvider.e(this.k);
            ThreeLeafCardProvider threeLeafCardProvider = new ThreeLeafCardProvider(context, this.e);
            this.af = threeLeafCardProvider;
            threeLeafCardProvider.e(this.k);
            ObserverManagerUtil.d(this.ab, "cloverLife");
            e();
            ObserverManagerUtil.d(this.aa, "showFitnessDataOriginDialog");
            ObserverManagerUtil.d(this.u, "NOTIFY_STEP_CARD_CHANGED");
            ObserverManagerUtil.d(this.u, "HOME_FRAGMENT_IS_VISIBLE_TO_USER");
            ObserverManagerUtil.d(this.u, "HEALTH_LIFE_DAY_RECORD");
            lrd.c(this.ae);
            ThreadPoolManager.c().execute(new Runnable() { // from class: spt
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.d();
                }
            });
            HiBroadcastUtil.h(this.d);
            b();
            this.r = false;
        }
        f();
        this.ah.b(context, sectionBean);
        this.af.b(context, sectionBean);
    }

    public /* synthetic */ void d() {
        tbd.e(this.d);
        tbd.c(this.d);
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void parseParams(Context context, HashMap map, Object obj) {
        LogUtil.a("SCUI_ModelCardProvider", "parseParams");
        map.clear();
        ThreeLeafCardProvider threeLeafCardProvider = this.af;
        if (threeLeafCardProvider != null) {
            threeLeafCardProvider.parseParams(context, map, obj);
        }
        ThreeCircleCardProvider threeCircleCardProvider = this.ah;
        if (threeCircleCardProvider != null) {
            threeCircleCardProvider.parseParams(context, map, obj);
        }
        map.putAll(this.y);
        this.f25613a = true;
        this.i = true;
    }

    private void t() {
        if (this.j == null) {
            this.j = (StepsViewModel) new ViewModelProvider((ViewModelStoreOwner) this.d).get(StepsViewModel.class);
        }
        this.k = fga.d(this.d).e();
        this.j.c((LifecycleOwner) this.d, this.ac);
        this.j.d((LifecycleOwner) this.d, this.o);
        this.j.a((LifecycleOwner) this.d, this.v);
        this.j.d(this.k);
    }

    protected void b() {
        StepCounterSupportUtil.a(new StepCounterSupportUtil.StepCounterClassCallback() { // from class: com.huawei.ui.homehealth.knit.ModelCardProvider.4
            @Override // com.huawei.ui.main.stories.me.util.StepCounterSupportUtil.StepCounterClassCallback
            public void getDeviceClass(int i) {
                ModelCardProvider.this.f();
            }
        });
        WheelChairStateManager.a().b((WheelChairStateManager.SwitchStateListener) this);
    }

    public void f() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: spn
            @Override // java.lang.Runnable
            public final void run() {
                this.f48497c.i();
            }
        });
    }

    public /* synthetic */ void i() {
        v();
        m();
    }

    private void v() {
        long jA = LogUtil.a(2000, f25612c);
        if (jA != -1) {
            int[] iArr = this.h;
            ReleaseLogUtil.c("SCUI_ModelCardProvider", npt.d("onResume updateStepsAndCalories steps=", Integer.valueOf(iArr[3]), " floor=", Integer.valueOf(iArr[5]), " calories=", Integer.valueOf(iArr[0]), " distance=", Integer.valueOf(iArr[4]), " intensity ", Integer.valueOf(iArr[1]), " activityHour ", Integer.valueOf(iArr[2]), " wheel ", Integer.valueOf(iArr[6])));
            f25612c = jA;
        }
        boolean zIsRunningForeground = BaseApplication.isRunningForeground();
        if ((this.q && zIsRunningForeground) || this.h[3] == 0) {
            this.n.sendMessage(this.n.obtainMessage(1));
        }
    }

    protected void m() {
        LogUtil.a("SCUI_ModelCardProvider", "updateFitnessDataOrigin start ");
        if (this.x == null) {
            this.x = new CommonSingleCallback() { // from class: spm
                @Override // com.huawei.healthcloud.plugintrack.callback.CommonSingleCallback
                public final void callback(Object obj) {
                    this.f48496c.b((Boolean) obj);
                }
            };
            uin.e().a(this.x);
        }
        uin.e().b();
    }

    public /* synthetic */ void b(Boolean bool) {
        LogUtil.a("SCUI_ModelCardProvider", "updateFitnessDataOrigin result ");
        this.n.sendMessage(this.n.obtainMessage(10));
    }

    protected void h() {
        ThreeCircleCardProvider threeCircleCardProvider = this.ah;
        if (threeCircleCardProvider != null) {
            threeCircleCardProvider.h();
        }
        ThreeLeafCardProvider threeLeafCardProvider = this.af;
        if (threeLeafCardProvider != null) {
            threeLeafCardProvider.h();
        }
    }

    private void r() {
        tbc tbcVar;
        tbc tbcVar2 = new tbc();
        this.ag = tbcVar2;
        tbcVar2.e(new IBaseResponseCallback() { // from class: spy
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f48508c.b(i, obj);
            }
        });
        if (!Utils.o() || (tbcVar = this.ag) == null) {
            return;
        }
        tbcVar.c();
    }

    public /* synthetic */ void b(int i, final Object obj) {
        if (i == 0 || i == 3) {
            o();
            if (i != 3 || this.af == null) {
                return;
            }
            LogUtil.a("SCUI_ModelCardProvider", "initSyncHelper EVENT_GOAL_UPDATE");
            ThreadPoolManager.c().execute(new Runnable() { // from class: sps
                @Override // java.lang.Runnable
                public final void run() {
                    this.f48502b.c(obj);
                }
            });
            return;
        }
        if (i != 1) {
            if (i == 2) {
                this.t = false;
                return;
            }
            return;
        }
        int i2 = this.s;
        int i3 = this.h[3];
        if (i2 == i3) {
            LogUtil.a("SCUI_ModelCardProvider", "processOriginListData mLastShowTipsStep == mSteps");
        } else {
            this.s = i3;
            tdy.a(this.d, i3);
        }
    }

    public /* synthetic */ void c(Object obj) {
        this.af.c((String) obj);
    }

    private void o() {
        LogUtil.a("SCUI_ModelCardProvider", "acquireGoalSteps");
        StepsViewModel stepsViewModel = this.j;
        if (stepsViewModel != null) {
            stepsViewModel.a();
        }
    }

    private void l() {
        if (Utils.o()) {
            LogUtil.j("SCUI_ModelCardProvider", "acquireMarketingData isOversea, return");
        } else if (lrd.d()) {
            LogUtil.j("SCUI_ModelCardProvider", "acquireMarketingData isTouchExplorationEnabled is true, return");
        } else {
            LogUtil.a("SCUI_ModelCardProvider", "acquireMarketingData");
            ThreadPoolManager.c().execute(new Runnable() { // from class: spq
                @Override // java.lang.Runnable
                public final void run() {
                    this.f48500a.c();
                }
            });
        }
    }

    public /* synthetic */ void c() {
        if (lsl.aa(this.p)) {
            LogUtil.a("SCUI_ModelCardProvider", "acquireMarketingData mLastReqMarketingResTime:", Long.valueOf(this.p));
            return;
        }
        StepsViewModel stepsViewModel = this.j;
        if (stepsViewModel != null) {
            stepsViewModel.d();
            this.p = System.currentTimeMillis();
        }
    }

    protected void e() {
        if (!Utils.o() || OperationUtils.isOperation(LoginInit.getInstance(this.d).getCountryCode(null))) {
            if (this.w == null) {
                this.w = tbe.e(this.d);
            }
            if (this.l == null) {
                this.l = Executors.newSingleThreadExecutor();
            }
            this.w.e(this.l);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Bundle bundle) {
        if (bundle != null) {
            int i = bundle.getInt("carior", -1);
            int i2 = bundle.getInt("intensityTime", -1);
            int i3 = bundle.getInt("activeCount", -1);
            final int i4 = bundle.getInt("step", -1);
            int i5 = bundle.getInt("distance", -1);
            int i6 = bundle.getInt("floor", -1);
            int i7 = bundle.getInt("wheelChair", 0);
            this.g = i;
            this.h[0] = (int) UnitUtil.d(((double) i) / 1000.0d, 0);
            int[] iArr = this.h;
            iArr[1] = i2;
            iArr[2] = i3;
            iArr[3] = i4;
            iArr[4] = i5;
            iArr[5] = i6;
            iArr[6] = i7;
            u();
            tdy.d(this.h);
            boolean zIsRunningForeground = BaseApplication.isRunningForeground();
            LogUtil.a("SCUI_ModelCardProvider", "report step=", Integer.valueOf(i4), " calories=", Integer.valueOf(i), " floor=", Integer.valueOf(i6), " distance=", Integer.valueOf(i5), " intensity=", Integer.valueOf(i2), " mActiveHours=", Integer.valueOf(i3), "  app isRunningForeground=", Boolean.valueOf(zIsRunningForeground));
            if ((this.q && zIsRunningForeground) || i4 == 0) {
                w();
                b(i, i2, i3, i4);
                ThreadPoolManager.c().execute(new Runnable() { // from class: spo
                    @Override // java.lang.Runnable
                    public final void run() {
                        PluginAchieveAdapterImpl.d(i4);
                    }
                });
                tau.d(i4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        ThreeCircleCardProvider threeCircleCardProvider = this.ah;
        if (threeCircleCardProvider != null) {
            threeCircleCardProvider.c(this.g, this.h, this.m);
        }
        ThreeLeafCardProvider threeLeafCardProvider = this.af;
        if (threeLeafCardProvider != null) {
            threeLeafCardProvider.c(this.g, this.h, this.m);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(HashMap<String, Integer> map) {
        LogUtil.a("SCUI_ModelCardProvider", "processGoalData goal value is ", map);
        b(map, "900200007", this.m[0] * 1000, 0);
        b(map, "900200008", this.m[1], 1);
        b(map, "900200009", this.m[2], 2);
        b(map, "900200006", this.m[3], 3);
        if (p()) {
            LogUtil.j("SCUI_ModelCardProvider", "updateAchieveProgress goal value is error");
            return;
        }
        LogUtil.a("SCUI_ModelCardProvider", "processGoalData mGoalValue is ", Arrays.toString(this.m));
        w();
        tdy.b(this.m);
        this.t = true;
        int i = this.g;
        int[] iArr = this.h;
        b(i, iArr[1], iArr[2], iArr[3]);
        u();
    }

    private boolean p() {
        for (int i : this.m) {
            if (i == 0) {
                return true;
            }
        }
        return false;
    }

    private void b(HashMap<String, Integer> map, String str, int i, int i2) {
        int iD = qgm.d(map, str, i);
        if (i2 == 0) {
            iD /= 1000;
        }
        int i3 = this.m[i2];
        if (iD != i3) {
            LogUtil.a("SCUI_ModelCardProvider", "insert updateGoalValueByOne spKey is ", str, " mGoalValue ", Integer.valueOf(i3), " goal ", Integer.valueOf(iD));
            this.m[i2] = iD;
        }
    }

    private void b(int i, int i2, int i3, int i4) {
        if (!this.t) {
            LogUtil.j("SCUI_ModelCardProvider", "updateAchieveAnimation not get goal success");
            return;
        }
        Context context = this.d;
        if (context == null || context != com.huawei.haf.application.BaseApplication.j()) {
            LogUtil.j("SCUI_ModelCardProvider", "updateAchieveAnimation mainActivity is not show");
            return;
        }
        int[] iArr = this.m;
        if (iArr[0] <= 0 || iArr[1] <= 0 || iArr[2] <= 0) {
            return;
        }
        a(i, i2, i3, i4);
    }

    private void a(int i, int i2, int i3, int i4) {
        Handler handler;
        if (!this.q) {
            ReleaseLogUtil.d("SCUI_ModelCardProvider", " updateAchieveDialogAnimation failed. current activity is on pause.");
            return;
        }
        int[] iArr = this.m;
        boolean z = i >= iArr[0] * 1000;
        boolean z2 = i2 >= iArr[1];
        boolean z3 = i3 >= iArr[2];
        LogUtil.a("SCUI_ModelCardProvider", "isHeatAchieved=", Boolean.valueOf(z), " isIntensityAchieved=", Boolean.valueOf(z2), " isActiveAchieved=", Boolean.valueOf(z3), " isStepAchieved=", Boolean.valueOf(i4 >= iArr[3]));
        if (z3 && z2 && z) {
            if (!"threeCircleCard".equals(fsb.b())) {
                String strE = SharedPreferenceManager.e(this.d, String.valueOf(10000), "SP_PERFECT_RED_POINT");
                if ((TextUtils.isEmpty(strE) || !strE.equals(String.valueOf(DateFormatUtil.a(System.currentTimeMillis())))) && (handler = this.n) != null) {
                    this.n.sendMessage(handler.obtainMessage(11));
                    return;
                }
                return;
            }
            ThreeLeafCardProvider threeLeafCardProvider = this.af;
            if (threeLeafCardProvider != null) {
                threeLeafCardProvider.a(8);
                SharedPreferenceManager.e(this.d, String.valueOf(10000), "SP_PERFECT_RED_POINT", String.valueOf(DateFormatUtil.a(System.currentTimeMillis())), new StorageParams());
                return;
            }
            return;
        }
        ThreeLeafCardProvider threeLeafCardProvider2 = this.af;
        if (threeLeafCardProvider2 != null) {
            threeLeafCardProvider2.a(8);
            SharedPreferenceManager.e(this.d, String.valueOf(10000), "SP_PERFECT_RED_POINT", "", new StorageParams());
        }
    }

    private void u() {
        if (this.t) {
            int[] iArr = this.h;
            int i = iArr[0];
            int[] iArr2 = this.m;
            PluginAchieveAdapterImpl.b(i, iArr2[0], iArr[1], iArr2[1]);
        }
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.IKnitLifeCycle
    public void onPause() {
        this.q = false;
        ThreeLeafCardProvider threeLeafCardProvider = this.af;
        if (threeLeafCardProvider != null) {
            threeLeafCardProvider.a(this.f25614b);
        }
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.IKnitLifeCycle
    public void onResume() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        super.onResume();
        this.q = true;
        ThreeCircleCardProvider threeCircleCardProvider = this.ah;
        if (threeCircleCardProvider != null) {
            threeCircleCardProvider.onResume();
        }
        ThreeLeafCardProvider threeLeafCardProvider = this.af;
        if (threeLeafCardProvider != null) {
            threeLeafCardProvider.a(this.f25614b);
            this.af.onResume();
        }
        o();
        l();
        n();
        f();
        ReleaseLogUtil.c("SCUI_ModelCardProvider", "onResume finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
    }

    private void n() {
        Intent intent = new Intent();
        intent.setPackage(this.d.getPackageName());
        intent.setAction("com.huawei.health.check_sensor_state");
        this.d.sendBroadcast(intent, SecurityConstant.f5920a);
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.IKnitLifeCycle
    public void onDestroy() {
        super.onDestroy();
        ThreeCircleCardProvider threeCircleCardProvider = this.ah;
        if (threeCircleCardProvider != null) {
            threeCircleCardProvider.onDestroy();
        }
        ThreeLeafCardProvider threeLeafCardProvider = this.af;
        if (threeLeafCardProvider != null) {
            threeLeafCardProvider.onDestroy();
        }
        ObserverManagerUtil.c(this.ab);
        ObserverManagerUtil.c(this.aa);
        ObserverManagerUtil.c(this.u);
        k();
        this.y.put("ON_DESTROY", true);
        x();
        ExecutorService executorService = this.l;
        if (executorService != null && tbe.d(executorService)) {
            this.l = null;
        }
        if (this.w != null) {
            ReleaseLogUtil.c("SCUI_ModelCardProvider", "mNotificationInteractors closeMessageObserver");
            this.w.d();
        }
        if (this.x != null) {
            uin.e().d(this.x);
            this.x = null;
        }
        tbc tbcVar = this.ag;
        if (tbcVar != null) {
            tbcVar.a();
        }
        WheelChairStateManager.a().c((WheelChairStateManager.SwitchStateListener) this);
        this.j.d(this.ac);
        this.j.e(this.o);
        this.j.c(this.v);
        lrd.b(this.ae);
        this.n.removeCallbacksAndMessages(null);
    }

    protected void j() {
        LogUtil.a("SCUI_ModelCardProvider", "showFitnessDataOriginDialog()");
        if ("".equals(SharedPreferenceManager.e(this.d, String.valueOf(10000), "data_origin_icon_red_dot"))) {
            SharedPreferenceManager.e(this.d, String.valueOf(10000), "data_origin_icon_red_dot", "false", new StorageParams());
        }
        ThreeCircleCardProvider threeCircleCardProvider = this.ah;
        if (threeCircleCardProvider != null) {
            threeCircleCardProvider.a();
        }
        ThreeLeafCardProvider threeLeafCardProvider = this.af;
        if (threeLeafCardProvider != null) {
            threeLeafCardProvider.a();
        }
        uin.e().a(this.d, q());
    }

    private int q() {
        if ("threeCircleCard".equals(fsb.b())) {
            return 1;
        }
        return "threeLeafCard".equals(fsb.b()) ? 2 : 0;
    }

    public View.OnClickListener a(AchieveTaskHandler.AchieveAniType achieveAniType) {
        if (AchieveTaskHandler.AchieveAniType.SINGLE_CIRCLE_ACTIVE.equals(achieveAniType)) {
            return new View.OnClickListener() { // from class: spw
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f48505a.d(view);
                }
            };
        }
        if (AchieveTaskHandler.AchieveAniType.SINGLE_CIRCLE_WALK.equals(achieveAniType)) {
            return new View.OnClickListener() { // from class: sqa
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f48513b.e(view);
                }
            };
        }
        if (AchieveTaskHandler.AchieveAniType.SINGLE_CIRCLE_CALORIE.equals(achieveAniType)) {
            return new View.OnClickListener() { // from class: spz
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f48509b.a(view);
                }
            };
        }
        if (AchieveTaskHandler.AchieveAniType.SINGLE_CIRCLE_INTENSITY.equals(achieveAniType)) {
            return new View.OnClickListener() { // from class: sqf
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f48524b.b(view);
                }
            };
        }
        if (AchieveTaskHandler.AchieveAniType.THREE_CIRCLE.equals(achieveAniType)) {
            return new View.OnClickListener() { // from class: spp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f48499a.c(view);
                }
            };
        }
        return null;
    }

    public /* synthetic */ void d(View view) {
        tdy.e(this.d);
        ujq.d(1);
    }

    public /* synthetic */ void e(View view) {
        ujq.b(1);
        HealthOpenSDK healthOpenSDK = this.k;
        Context context = this.d;
        int[] iArr = this.h;
        tdy.d(healthOpenSDK, context, iArr[3], iArr[4]);
        ujq.d(5);
    }

    public /* synthetic */ void a(View view) {
        tdy.a(this.k, this.d, this.h[0]);
        ujq.d(3);
    }

    public /* synthetic */ void b(View view) {
        g();
        ujq.d(2);
    }

    public /* synthetic */ void c(View view) {
        tdy.a(this.d, this.g, this.h, this.m, "7");
        ujq.d(4);
    }

    protected void g() {
        HealthOpenSDK healthOpenSDK = this.k;
        if (healthOpenSDK != null) {
            healthOpenSDK.e((IFlushResult) null);
        }
        tdy.b(this.k, this.d, this.h[1]);
    }

    public static class e implements com.huawei.haf.design.pattern.Observer {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<ModelCardProvider> f25619b;

        e(ModelCardProvider modelCardProvider) {
            this.f25619b = new WeakReference<>(modelCardProvider);
        }

        @Override // com.huawei.haf.design.pattern.Observer
        public void notify(String str, Object... objArr) {
            ModelCardProvider modelCardProvider;
            if (!"showFitnessDataOriginDialog".equals(str) || (modelCardProvider = this.f25619b.get()) == null) {
                return;
            }
            modelCardProvider.j();
        }
    }

    @Override // com.huawei.threecircle.manager.WheelChairStateManager.SwitchStateListener
    public void onSwitchStateChanged(boolean z) {
        ReleaseLogUtil.c("SCUI_ModelCardProvider", "initViewControl isOn:", Boolean.valueOf(z));
        f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ResourceResultInfo resourceResultInfo) {
        ResourceBriefInfo next;
        if (resourceResultInfo == null) {
            y();
            return;
        }
        List<ResourceBriefInfo> resources = resourceResultInfo.getResources();
        if (njy.e(resources)) {
            y();
            return;
        }
        ResourceResultInfo resourceResultInfo2 = this.f;
        if (resourceResultInfo2 != null && resourceResultInfo2.equals(resourceResultInfo)) {
            ReleaseLogUtil.c("SCUI_ModelCardProvider", "same overlay resource");
            return;
        }
        this.f = resourceResultInfo;
        Iterator<ResourceBriefInfo> it = resources.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (next.getContentType() != 138);
        if (next == null) {
            y();
            return;
        }
        LogUtil.a("SCUI_ModelCardProvider", "overlayBriefInfo: ", next.toString());
        resources.clear();
        resources.add(next);
        HashMap map = new HashMap(1);
        map.put(2052, resourceResultInfo);
        List<View> marketingViewList = ((MarketingApi) Services.b("FeatureMarketing", MarketingApi.class)).getMarketingViewList(this.d, map);
        if (njy.e(marketingViewList)) {
            LogUtil.j("SCUI_ModelCardProvider", "processMarketingData viewList is empty");
            y();
        } else {
            k();
            this.y.put("SHOW_MARKETING_LAYOUT", marketingViewList.get(0));
            x();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        k();
        this.y.put("REMOVE_MARKETING_LAYOUT", true);
        x();
        this.f = null;
        da.d(BaseApplication.getContext());
    }

    static class b implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<ModelCardProvider> f25618a;

        b(ModelCardProvider modelCardProvider) {
            this.f25618a = new WeakReference<>(modelCardProvider);
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean z) {
            ModelCardProvider modelCardProvider = this.f25618a.get();
            if (modelCardProvider == null) {
                ReleaseLogUtil.d("SCUI_ModelCardProvider", "onTouchExplorationStateChanged cardProvider is null");
                return;
            }
            LogUtil.a("SCUI_ModelCardProvider", "onTouchExplorationStateChanged enabled ", Boolean.valueOf(z));
            if (z) {
                modelCardProvider.y();
                modelCardProvider.p = 0L;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        LogUtil.a("SCUI_ModelCardProvider", "operation card refreshSection");
        if (this.i) {
            this.z.c(new Object());
            this.i = false;
        }
    }
}

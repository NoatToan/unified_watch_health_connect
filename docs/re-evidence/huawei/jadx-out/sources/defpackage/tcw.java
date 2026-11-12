package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.haf.common.security.SecurityConstant;
import com.huawei.haf.design.pattern.ObserveLabels;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.healthmodel.bean.HealthLifeTaskBean;
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
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.stepscard.AchieveTaskHandler;
import com.huawei.ui.homehealth.stepscard.EmptyStepsCardData;
import com.huawei.ui.homehealth.threecirclecard.ThreeCircleCardData;
import com.huawei.ui.homehealth.threecirclecard.ThreeLeafCardData;
import com.huawei.ui.homehealth.threecirclecard.TwoModelCardViewHolder;
import com.huawei.ui.homehealth.threecirclecard.model.StepsViewModel;
import com.huawei.ui.main.stories.me.util.StepCounterSupportUtil;
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
public class tcw extends EmptyStepsCardData implements WheelChairStateManager.SwitchStateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f48978a;
    private String aa;
    private final a ab;
    private ThreeCircleCardData ac;
    private tbc ad;
    private TwoModelCardViewHolder ah;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected AchieveTaskHandler f48979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ResourceResultInfo f48980c;
    private int d;
    protected boolean e;
    private ExecutorService f;
    private final int[] g;
    private StepsViewModel h;
    private Observer<HashMap<String, Integer>> i;
    private final int[] j;
    private Handler k;
    private HealthOpenSDK l;
    private boolean m;
    private boolean n;
    private long o;
    private Observer<ResourceResultInfo> p;
    private final com.huawei.haf.design.pattern.Observer q;
    private int r;
    private tbe s;
    private CommonSingleCallback<Boolean> t;
    private int u;
    private com.huawei.haf.design.pattern.Observer v;
    private Observer<Bundle> w;
    private tbf x;
    private e y;
    private ThreeLeafCardData z;

    public static class b extends BaseHandler<tcw> {
        public b(tcw tcwVar) {
            super(tcwVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(tcw tcwVar, Message message) {
            if (message == null) {
                ReleaseLogUtil.d("SCUI_TwoModelCardData", "msg == null");
                return;
            }
            int i = message.what;
            if (i == 1) {
                if (tcwVar.ac != null) {
                    tcwVar.ac.b(tcwVar.d, tcwVar.g, tcwVar.j);
                }
                if (tcwVar.z != null) {
                    tcwVar.z.b(tcwVar.d, tcwVar.g, tcwVar.j);
                    return;
                }
                return;
            }
            if (i == 10) {
                tcwVar.f();
            } else {
                if (i != 11) {
                    return;
                }
                tcwVar.p();
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x003b  */
    /* synthetic */ void d(String str, final Object[] objArr) {
        byte b2;
        str.hashCode();
        switch (str) {
            case "NOTIFY_STEP_CARD_CHANGED":
                b2 = 0;
                break;
            case "HOME_FRAGMENT_IS_VISIBLE_TO_USER":
                b2 = 1;
                break;
            case "HEALTH_LIFE_QUERY_SCHEDULES_RESP":
                b2 = 2;
                break;
            case "HEALTH_LIFE_DAY_RECORD":
                b2 = 3;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            LogUtil.a("SCUI_TwoModelCardData", "switch card", str);
            HandlerExecutor.b(new Runnable() { // from class: tdk
                @Override // java.lang.Runnable
                public final void run() {
                    this.f48993b.a(objArr);
                }
            });
            return;
        }
        if (b2 != 1) {
            if (b2 == 2) {
                c(objArr);
                return;
            } else if (b2 == 3) {
                e(objArr);
                return;
            } else {
                LogUtil.j("SCUI_TwoModelCardData", "mObserver label ", str, " objects ", objArr);
                return;
            }
        }
        if (objArr == null || objArr.length <= 0) {
            ReleaseLogUtil.d("R_SCUI_TwoModelCardData", "mObserver objects ", objArr);
            return;
        }
        Object obj = objArr[0];
        if (!(obj instanceof Boolean)) {
            ReleaseLogUtil.d("R_SCUI_TwoModelCardData", "mObserver object ", obj);
            return;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        this.e = zBooleanValue;
        LogUtil.a("SCUI_TwoModelCardData", "mObserver isHomeFragmentVisible = ", Boolean.valueOf(zBooleanValue));
        ThreeLeafCardData threeLeafCardData = this.z;
        if (threeLeafCardData != null) {
            threeLeafCardData.c(this.e);
        }
    }

    /* synthetic */ void a(Object[] objArr) {
        onResume();
        if (objArr == null || objArr.length <= 0) {
            LogUtil.j("SCUI_TwoModelCardData", "switch card objects is empty");
            this.u = 0;
            return;
        }
        Object obj = objArr[0];
        if (obj instanceof String) {
            String str = (String) obj;
            ThreeCircleCardData threeCircleCardData = this.ac;
            if (threeCircleCardData != null) {
                threeCircleCardData.b(str, this.u);
            }
            ThreeLeafCardData threeLeafCardData = this.z;
            if (threeLeafCardData != null) {
                threeLeafCardData.b(str, this.u);
            }
        }
        this.u = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        HandlerExecutor.b(new Runnable() { // from class: tdl
            @Override // java.lang.Runnable
            public final void run() {
                this.f48994b.i();
            }
        });
    }

    /* synthetic */ void i() {
        ThreeLeafCardData threeLeafCardData = this.z;
        if (threeLeafCardData != null) {
            threeLeafCardData.e(UnitUtil.e(1.0d, 1, 0));
            this.z.b(0);
        }
    }

    private void e(final Object[] objArr) {
        if (ffv.l()) {
            return;
        }
        HandlerExecutor.b(new Runnable() { // from class: tda
            @Override // java.lang.Runnable
            public final void run() {
                this.e.d(objArr);
            }
        });
    }

    /* synthetic */ void d(Object[] objArr) {
        if (njy.e(objArr, 0)) {
            LogUtil.j("SCUI_TwoModelCardData", "observerForHealthLife objects ", objArr);
            return;
        }
        if (this.ac == null) {
            LogUtil.j("SCUI_TwoModelCardData", "mThreeCircleCardData is null");
            return;
        }
        Object obj = objArr[0];
        int iC = njy.b(obj, HealthLifeTaskBean.class) ? c((List<HealthLifeTaskBean>) obj) : 0;
        int iC2 = c(ffv.h());
        LogUtil.a("SCUI_TwoModelCardData", "observerForHealthLife completeCount:", Integer.valueOf(iC), " lastCompleteCount:", Integer.valueOf(iC2));
        if (iC > iC2) {
            int i = iC - iC2;
            this.u = i;
            ThreeCircleCardData threeCircleCardData = this.ac;
            if (threeCircleCardData != null) {
                threeCircleCardData.e(UnitUtil.e(i, 1, 0));
                this.ac.b(0);
            }
            HashMap map = new HashMap(2);
            map.put("click", 1);
            map.put("reminderNum", Integer.valueOf(this.u));
            lmf.d().c(this.mContext, AnalyticsValue.HEALTH_LIFE_TASK_COMPLETE_2119095.value(), map, 0);
            return;
        }
        this.u = 0;
        ThreeCircleCardData threeCircleCardData2 = this.ac;
        if (threeCircleCardData2 != null) {
            threeCircleCardData2.b(8);
        }
    }

    private int c(List<HealthLifeTaskBean> list) {
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

    private void c(final Object[] objArr) {
        if (ffv.l()) {
            HandlerExecutor.b(new Runnable() { // from class: tdo
                @Override // java.lang.Runnable
                public final void run() {
                    this.f48996a.b(objArr);
                }
            });
        }
    }

    /* synthetic */ void b(Object[] objArr) {
        int iA;
        if (njy.e(objArr, 0)) {
            LogUtil.j("SCUI_TwoModelCardData", "observerByHealthLife objects ", objArr);
            return;
        }
        if (this.ac == null) {
            LogUtil.j("SCUI_TwoModelCardData", "observerByHealthLife mThreeCircleCardData is null");
            return;
        }
        Object obj = objArr[0];
        if (obj instanceof qfj) {
            qfj qfjVar = (qfj) obj;
            iA = qfjVar.a(sqw.c(qfjVar));
        } else {
            iA = 0;
        }
        qfj qfjVarF = ffv.f();
        int iA2 = qfjVarF != null ? qfjVarF.a(sqw.c(qfjVarF)) : 0;
        LogUtil.a("SCUI_TwoModelCardData", "observerByHealthLife completeCount ", Integer.valueOf(iA), " lastCompleteCount ", Integer.valueOf(iA2));
        if (iA > iA2) {
            int i = iA - iA2;
            this.u = i;
            ThreeCircleCardData threeCircleCardData = this.ac;
            if (threeCircleCardData != null) {
                threeCircleCardData.e(UnitUtil.e(i, 1, 0));
                this.ac.b(0);
                return;
            }
            return;
        }
        this.u = 0;
        ThreeCircleCardData threeCircleCardData2 = this.ac;
        if (threeCircleCardData2 != null) {
            threeCircleCardData2.b(8);
        }
    }

    public tcw(Context context, String str, tbf tbfVar) {
        super(context);
        this.f48979b = new AchieveTaskHandler();
        this.w = new Observer() { // from class: com.huawei.ui.homehealth.threecirclecard.TwoModelCardData$$ExternalSyntheticLambda14
            @Override // androidx.lifecycle.Observer
            /* JADX INFO: renamed from: onChanged */
            public final void b(Object obj) {
                this.f26124a.e((Bundle) obj);
            }
        };
        this.i = new Observer() { // from class: com.huawei.ui.homehealth.threecirclecard.TwoModelCardData$$ExternalSyntheticLambda15
            @Override // androidx.lifecycle.Observer
            /* JADX INFO: renamed from: onChanged */
            public final void b(Object obj) {
                this.f26125c.b((HashMap<String, Integer>) obj);
            }
        };
        this.p = new Observer() { // from class: com.huawei.ui.homehealth.threecirclecard.TwoModelCardData$$ExternalSyntheticLambda16
            @Override // androidx.lifecycle.Observer
            /* JADX INFO: renamed from: onChanged */
            public final void b(Object obj) {
                this.d.c((ResourceResultInfo) obj);
            }
        };
        this.y = new e(this);
        this.s = null;
        this.m = true;
        this.n = false;
        this.r = 0;
        int[] iArr = {270, 25, 12, 10000};
        this.j = iArr;
        int[] iArr2 = {0, 0, 0, 0, 0, 0, 0};
        this.g = iArr2;
        this.l = null;
        a aVar = new a(this);
        this.ab = aVar;
        this.v = new com.huawei.haf.design.pattern.Observer() { // from class: tcw.3
            @Override // com.huawei.haf.design.pattern.Observer
            public void notify(String str2, Object... objArr) {
                LogUtil.a("SCUI_TwoModelCardData", "mSwitchModelObserver notify");
                if ("cloverLife".equals(str2)) {
                    if ("threeLeafCard".equals(tbf.e())) {
                        LogUtil.a("SCUI_TwoModelCardData", "show three leaf already");
                    } else if ("threeCircleCard".equals(tbf.e())) {
                        tcw.this.x.a("threeCircleCard", false);
                    }
                }
            }
        };
        com.huawei.haf.design.pattern.Observer observer = new com.huawei.haf.design.pattern.Observer() { // from class: tdg
            @Override // com.huawei.haf.design.pattern.Observer
            public final void notify(String str2, Object[] objArr) {
                this.e.d(str2, objArr);
            }
        };
        this.q = observer;
        this.mPositionTag = -2;
        this.k = new b(this);
        tdy.e(iArr2);
        tdy.c(iArr);
        s();
        t();
        ThreeCircleCardData threeCircleCardData = new ThreeCircleCardData(context);
        this.ac = threeCircleCardData;
        threeCircleCardData.e(tbfVar);
        this.ac.a(this.l);
        ThreeLeafCardData threeLeafCardData = new ThreeLeafCardData(context, this.f48979b);
        this.z = threeLeafCardData;
        threeLeafCardData.e(tbfVar);
        this.z.a(this.l);
        this.aa = str;
        this.x = tbfVar;
        ObserverManagerUtil.d(this.v, "cloverLife");
        d();
        ObserverManagerUtil.d(this.y, "showFitnessDataOriginDialog");
        ObserverManagerUtil.d(observer, "NOTIFY_STEP_CARD_CHANGED");
        ObserverManagerUtil.d(observer, "HOME_FRAGMENT_IS_VISIBLE_TO_USER");
        ObserverManagerUtil.d(observer, "HEALTH_LIFE_DAY_RECORD");
        ObserverManagerUtil.d(observer, ObserveLabels.HEALTH_LIFE_QUERY_SCHEDULES_RESP);
        lrd.c(aVar);
        ThreadPoolManager.c().execute(new Runnable() { // from class: tdd
            @Override // java.lang.Runnable
            public final void run() {
                this.f48989b.j();
            }
        });
        this.f48979b.e(this);
        HiBroadcastUtil.h(this.mContext);
        c();
    }

    /* synthetic */ void j() {
        tbd.e(this.mContext);
        tbd.c(this.mContext);
    }

    private void s() {
        if (this.h == null) {
            this.h = (StepsViewModel) new ViewModelProvider((ViewModelStoreOwner) this.mContext).get(StepsViewModel.class);
        }
        this.l = fga.d(this.mContext).e();
        this.h.c((LifecycleOwner) this.mContext, this.w);
        this.h.d((LifecycleOwner) this.mContext, this.i);
        this.h.a((LifecycleOwner) this.mContext, this.p);
        this.h.d(this.l);
    }

    @Override // com.huawei.ui.homehealth.stepscard.EmptyStepsCardData, com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData
    public RecyclerView.ViewHolder getCardViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        if (layoutInflater == null) {
            LogUtil.e("SCUI_TwoModelCardData", "getCardViewHolder layoutInflater == null");
            layoutInflater = LayoutInflater.from(BaseApplication.getContext());
        }
        LayoutInflater layoutInflater2 = layoutInflater;
        LogUtil.a("SCUI_TwoModelCardData", "getCardViewHolder start");
        this.ah = new TwoModelCardViewHolder(layoutInflater2.inflate(R.layout.layout_two_model_card_container, viewGroup, false), this.mContext, false, this.aa, this.ac, this.z, layoutInflater2);
        ac();
        LogUtil.a("SCUI_TwoModelCardData", "getCardViewHolder end");
        return this.ah;
    }

    protected void c() {
        StepCounterSupportUtil.a(new StepCounterSupportUtil.StepCounterClassCallback() { // from class: tcw.4
            @Override // com.huawei.ui.main.stories.me.util.StepCounterSupportUtil.StepCounterClassCallback
            public void getDeviceClass(int i) {
                tcw.this.ac();
            }
        });
        WheelChairStateManager.a().b((WheelChairStateManager.SwitchStateListener) this);
    }

    @Override // com.huawei.ui.homehealth.stepscard.EmptyStepsCardData, com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData
    public void refreshCardData() {
        ThreeCircleCardData threeCircleCardData = this.ac;
        if (threeCircleCardData != null) {
            threeCircleCardData.refreshCardData();
        }
        ThreeLeafCardData threeLeafCardData = this.z;
        if (threeLeafCardData != null) {
            threeLeafCardData.refreshCardData();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ac() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: tcz
            @Override // java.lang.Runnable
            public final void run() {
                this.e.h();
            }
        });
    }

    /* synthetic */ void h() {
        aa();
        o();
    }

    private void aa() {
        long jA = LogUtil.a(2000, f48978a);
        if (jA != -1) {
            int[] iArr = this.g;
            health.compact.a.hwlogsmodel.ReleaseLogUtil.d("SCUI_TwoModelCardData", npt.d("onResume updateStepsAndCalories steps=", Integer.valueOf(iArr[3]), " floor=", Integer.valueOf(iArr[5]), " calories=", Integer.valueOf(iArr[0]), " distance=", Integer.valueOf(iArr[4]), " intensity ", Integer.valueOf(iArr[1]), " activityHour ", Integer.valueOf(iArr[2]), " wheel ", Integer.valueOf(iArr[6])));
            f48978a = jA;
        }
        boolean zH = com.huawei.haf.application.BaseApplication.h();
        if ((this.m && zH) || this.g[3] == 0) {
            this.k.sendMessage(this.k.obtainMessage(1));
        }
    }

    protected void o() {
        LogUtil.a("SCUI_TwoModelCardData", "updateFitnessDataOrigin start ");
        if (this.t == null) {
            this.t = new CommonSingleCallback() { // from class: tdh
                @Override // com.huawei.healthcloud.plugintrack.callback.CommonSingleCallback
                public final void callback(Object obj) {
                    this.f48991a.a((Boolean) obj);
                }
            };
            uin.e().a(this.t);
        }
        uin.e().b();
    }

    /* synthetic */ void a(Boolean bool) {
        LogUtil.a("SCUI_TwoModelCardData", "updateFitnessDataOrigin result ");
        this.k.sendMessage(this.k.obtainMessage(10));
    }

    protected void f() {
        ThreeCircleCardData threeCircleCardData = this.ac;
        if (threeCircleCardData != null) {
            threeCircleCardData.f_();
        }
        ThreeLeafCardData threeLeafCardData = this.z;
        if (threeLeafCardData != null) {
            threeLeafCardData.f_();
        }
    }

    private void t() {
        tbc tbcVar;
        tbc tbcVar2 = new tbc();
        this.ad = tbcVar2;
        tbcVar2.e(new IBaseResponseCallback() { // from class: tcy
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.e.a(i, obj);
            }
        });
        if (!Utils.o() || (tbcVar = this.ad) == null) {
            return;
        }
        tbcVar.c();
    }

    /* synthetic */ void a(int i, final Object obj) {
        if (i == 0 || i == 3) {
            m();
            if (i != 3 || this.z == null) {
                return;
            }
            LogUtil.a("SCUI_TwoModelCardData", "initSyncHelper EVENT_GOAL_UPDATE");
            ThreadPoolManager.c().execute(new Runnable() { // from class: tdf
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.b(obj);
                }
            });
            return;
        }
        if (i != 1) {
            if (i == 2) {
                this.n = false;
                return;
            }
            return;
        }
        int i2 = this.r;
        int i3 = this.g[3];
        if (i2 == i3) {
            LogUtil.a("SCUI_TwoModelCardData", "processOriginListData mLastShowTipsStep == mSteps");
        } else {
            this.r = i3;
            tdy.a(this.mContext, this.g[3]);
        }
    }

    /* synthetic */ void b(Object obj) {
        this.z.d((String) obj);
    }

    private void m() {
        LogUtil.a("SCUI_TwoModelCardData", "acquireGoalSteps");
        StepsViewModel stepsViewModel = this.h;
        if (stepsViewModel != null) {
            stepsViewModel.a();
        }
    }

    private void k() {
        if (Utils.o()) {
            LogUtil.j("SCUI_TwoModelCardData", "acquireMarketingData isOversea, return");
        } else if (lrd.d()) {
            LogUtil.j("SCUI_TwoModelCardData", "acquireMarketingData isTouchExplorationEnabled is true, return");
        } else {
            LogUtil.a("SCUI_TwoModelCardData", "acquireMarketingData");
            ThreadPoolManager.c().execute(new Runnable() { // from class: tdn
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.e();
                }
            });
        }
    }

    /* synthetic */ void e() {
        if (lsl.aa(this.o)) {
            LogUtil.a("SCUI_TwoModelCardData", "acquireMarketingData mLastReqMarketingResTime:", Long.valueOf(this.o));
            return;
        }
        StepsViewModel stepsViewModel = this.h;
        if (stepsViewModel != null) {
            stepsViewModel.d();
            this.o = System.currentTimeMillis();
        }
    }

    protected void d() {
        if (!Utils.o() || OperationUtils.isOperation(LoginInit.getInstance(this.mContext).getCountryCode(null))) {
            if (this.s == null) {
                this.s = tbe.e(this.mContext);
            }
            if (this.f == null) {
                this.f = Executors.newSingleThreadExecutor();
            }
            this.s.e(this.f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Bundle bundle) {
        if (bundle != null) {
            int i = bundle.getInt("carior", -1);
            int i2 = bundle.getInt("intensityTime", -1);
            int i3 = bundle.getInt("activeCount", -1);
            final int i4 = bundle.getInt("step", -1);
            int i5 = bundle.getInt("distance", -1);
            int i6 = bundle.getInt("floor", -1);
            int i7 = bundle.getInt("wheelChair", 0);
            this.d = i;
            this.g[0] = (int) UnitUtil.d(((double) i) / 1000.0d, 0);
            int[] iArr = this.g;
            iArr[1] = i2;
            iArr[2] = i3;
            iArr[3] = i4;
            iArr[4] = i5;
            iArr[5] = i6;
            iArr[6] = i7;
            y();
            tdy.d(this.g);
            boolean zIsRunningForeground = BaseApplication.isRunningForeground();
            LogUtil.a("SCUI_TwoModelCardData", "report step=", Integer.valueOf(i4), " calories=", Integer.valueOf(i), " floor=", Integer.valueOf(i6), " distance=", Integer.valueOf(i5), " intensity=", Integer.valueOf(i2), " mActiveHours=", Integer.valueOf(i3), "  app isRunningForeground=", Boolean.valueOf(zIsRunningForeground));
            if ((this.m && zIsRunningForeground) || i4 == 0) {
                ThreeCircleCardData threeCircleCardData = this.ac;
                if (threeCircleCardData != null) {
                    threeCircleCardData.b(this.d, this.g, this.j);
                }
                ThreeLeafCardData threeLeafCardData = this.z;
                if (threeLeafCardData != null) {
                    threeLeafCardData.b(this.d, this.g, this.j);
                }
                d(i, i2, i3, i4);
                ThreadPoolManager.c().execute(new Runnable() { // from class: tdb
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
    public void b(HashMap<String, Integer> map) {
        LogUtil.a("SCUI_TwoModelCardData", "processGoalData goal value is ", map);
        a(map, "900200007", this.j[0] * 1000, 0);
        a(map, "900200008", this.j[1], 1);
        a(map, "900200009", this.j[2], 2);
        a(map, "900200006", this.j[3], 3);
        if (q()) {
            LogUtil.j("SCUI_TwoModelCardData", "updateAchieveProgress goal value is error");
            return;
        }
        LogUtil.a("SCUI_TwoModelCardData", "processGoalData mGoalValue is ", Arrays.toString(this.j));
        ThreeCircleCardData threeCircleCardData = this.ac;
        if (threeCircleCardData != null) {
            threeCircleCardData.b(this.d, this.g, this.j);
        }
        ThreeLeafCardData threeLeafCardData = this.z;
        if (threeLeafCardData != null) {
            threeLeafCardData.b(this.d, this.g, this.j);
        }
        tdy.b(this.j);
        this.n = true;
        int i = this.d;
        int[] iArr = this.g;
        d(i, iArr[1], iArr[2], iArr[3]);
        y();
    }

    private boolean q() {
        for (int i : this.j) {
            if (i == 0) {
                return true;
            }
        }
        return false;
    }

    private void a(HashMap<String, Integer> map, String str, int i, int i2) {
        int iD = qgm.d(map, str, i);
        if (i2 == 0) {
            iD /= 1000;
        }
        int i3 = this.j[i2];
        if (iD != i3) {
            LogUtil.a("SCUI_TwoModelCardData", "insert updateGoalValueByOne spKey is ", str, " mGoalValue ", Integer.valueOf(i3), " goal ", Integer.valueOf(iD));
            this.j[i2] = iD;
        }
    }

    private void d(int i, int i2, int i3, int i4) {
        if (!this.n) {
            LogUtil.j("SCUI_TwoModelCardData", "updateAchieveAnimation not get goal success");
            return;
        }
        if (this.mContext == null || this.mContext != com.huawei.haf.application.BaseApplication.j()) {
            LogUtil.j("SCUI_TwoModelCardData", "updateAchieveAnimation mainActivity is not show");
            return;
        }
        int[] iArr = this.j;
        if (iArr[0] <= 0 || iArr[1] <= 0 || iArr[2] <= 0) {
            return;
        }
        c(i, i2, i3, i4);
    }

    private void c(int i, int i2, int i3, int i4) {
        Handler handler;
        if (!this.m) {
            ReleaseLogUtil.d("SCUI_TwoModelCardData", " updateAchieveDialogAnimation failed. current activity is on pause.");
            return;
        }
        int[] iArr = this.j;
        boolean z = i >= iArr[0] * 1000;
        boolean z2 = i2 >= iArr[1];
        boolean z3 = i3 >= iArr[2];
        LogUtil.a("SCUI_TwoModelCardData", "isHeatAchieved=", Boolean.valueOf(z), " isIntensityAchieved=", Boolean.valueOf(z2), " isActiveAchieved=", Boolean.valueOf(z3), " isStepAchieved=", Boolean.valueOf(i4 >= iArr[3]));
        if (z3 && z2 && z) {
            if (!"threeCircleCard".equals(tbf.e())) {
                String strE = SharedPreferenceManager.e(this.mContext, String.valueOf(10000), "SP_PERFECT_RED_POINT");
                if ((TextUtils.isEmpty(strE) || !strE.equals(String.valueOf(DateFormatUtil.a(System.currentTimeMillis())))) && (handler = this.k) != null) {
                    this.k.sendMessage(handler.obtainMessage(11));
                    return;
                }
                return;
            }
            ThreeLeafCardData threeLeafCardData = this.z;
            if (threeLeafCardData != null) {
                threeLeafCardData.b(8);
                SharedPreferenceManager.e(this.mContext, String.valueOf(10000), "SP_PERFECT_RED_POINT", String.valueOf(DateFormatUtil.a(System.currentTimeMillis())), new StorageParams());
                return;
            }
            return;
        }
        ThreeLeafCardData threeLeafCardData2 = this.z;
        if (threeLeafCardData2 != null) {
            threeLeafCardData2.b(8);
            SharedPreferenceManager.e(this.mContext, String.valueOf(10000), "SP_PERFECT_RED_POINT", "", new StorageParams());
        }
    }

    private void y() {
        if (this.n) {
            int[] iArr = this.g;
            int i = iArr[0];
            int[] iArr2 = this.j;
            PluginAchieveAdapterImpl.b(i, iArr2[0], iArr[1], iArr2[1]);
        }
    }

    @Override // com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData
    public String getCardName() {
        return "SCUI_TwoModelCardData";
    }

    public TwoModelCardViewHolder b() {
        return this.ah;
    }

    public ThreeCircleCardData a() {
        return this.ac;
    }

    public void e(final String str, final boolean z) {
        if (!HandlerExecutor.d()) {
            LogUtil.a("SCUI_TwoModelCardData", "notifyModelChanged, not in ui thread");
            HandlerExecutor.c(new Runnable() { // from class: tcw.1
                @Override // java.lang.Runnable
                public void run() {
                    tcw.this.e(str, z);
                }
            });
            return;
        }
        LogUtil.a("SCUI_TwoModelCardData", "notifyModelChanged, targetType: ", str);
        this.aa = str;
        if (z) {
            u();
        }
        TwoModelCardViewHolder twoModelCardViewHolder = this.ah;
        if (twoModelCardViewHolder != null) {
            twoModelCardViewHolder.a(str);
        }
        if ("threeLeafCard".equals(str)) {
            this.x.e("threeLeafCard");
        } else {
            this.x.e("threeCircleCard");
        }
        w();
    }

    private void u() {
        if ("threeCircleCard".equals(this.aa)) {
            this.ac.f();
        } else {
            this.z.h();
        }
    }

    private void w() {
        LogUtil.a("SCUI_TwoModelCardData", "refreshUiForVisible");
        if ("threeCircleCard".equals(this.aa)) {
            this.ac.i();
        } else {
            this.z.f();
            LogUtil.a("SCUI_TwoModelCardData", "refreshUiForVisible end");
        }
    }

    public void n() {
        LogUtil.a("SCUI_TwoModelCardData", "startAnimator");
        if ("threeLeafCard".equals(this.aa)) {
            this.z.o();
        }
        b().c(this.aa);
    }

    @Override // com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TwoModelCardViewHolder twoModelCardViewHolder = this.ah;
        if (twoModelCardViewHolder != null) {
            twoModelCardViewHolder.b();
        }
        ThreeCircleCardData threeCircleCardData = this.ac;
        if (threeCircleCardData != null) {
            threeCircleCardData.onConfigurationChanged(configuration);
        }
        ThreeLeafCardData threeLeafCardData = this.z;
        if (threeLeafCardData != null) {
            threeLeafCardData.onConfigurationChanged(configuration);
        }
        this.f48979b.c(configuration);
    }

    @Override // com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData
    public void onPause() {
        this.m = false;
        ThreeLeafCardData threeLeafCardData = this.z;
        if (threeLeafCardData != null) {
            threeLeafCardData.c(this.e);
        }
    }

    @Override // com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData
    public void onResume() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        super.onResume();
        this.m = true;
        ThreeCircleCardData threeCircleCardData = this.ac;
        if (threeCircleCardData != null) {
            threeCircleCardData.onResume();
        }
        ThreeLeafCardData threeLeafCardData = this.z;
        if (threeLeafCardData != null) {
            threeLeafCardData.c(this.e);
            this.z.onResume();
        }
        m();
        k();
        r();
        ac();
        ReleaseLogUtil.c("SCUI_TwoModelCardData", "onResume finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
    }

    private void r() {
        Intent intent = new Intent();
        intent.setPackage(this.mContext.getPackageName());
        intent.setAction("com.huawei.health.check_sensor_state");
        this.mContext.sendBroadcast(intent, SecurityConstant.f5920a);
    }

    @Override // com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData
    public void onDestroy() {
        super.onDestroy();
        ThreeCircleCardData threeCircleCardData = this.ac;
        if (threeCircleCardData != null) {
            threeCircleCardData.onDestroy();
        }
        ThreeLeafCardData threeLeafCardData = this.z;
        if (threeLeafCardData != null) {
            threeLeafCardData.onDestroy();
        }
        ObserverManagerUtil.c(this.v);
        ObserverManagerUtil.c(this.q);
        TwoModelCardViewHolder twoModelCardViewHolder = this.ah;
        if (twoModelCardViewHolder != null) {
            twoModelCardViewHolder.d();
        }
        ExecutorService executorService = this.f;
        if (executorService != null && tbe.d(executorService)) {
            this.f = null;
        }
        if (this.s != null) {
            ReleaseLogUtil.c("SCUI_TwoModelCardData", "mNotificationInteractors closeMessageObserver");
            this.s.d();
        }
        if (this.t != null) {
            uin.e().d(this.t);
            this.t = null;
        }
        tbc tbcVar = this.ad;
        if (tbcVar != null) {
            tbcVar.a();
        }
        WheelChairStateManager.a().c((WheelChairStateManager.SwitchStateListener) this);
        this.h.d(this.w);
        this.h.e(this.i);
        this.h.c(this.p);
        lrd.b(this.ab);
    }

    public void c(RecyclerView.ViewHolder viewHolder, int i) {
        ThreeLeafCardData threeLeafCardData = this.z;
        if (threeLeafCardData != null) {
            threeLeafCardData.d(viewHolder, i);
        }
    }

    protected void g() {
        LogUtil.a("SCUI_TwoModelCardData", "showFitnessDataOriginDialog()");
        if (b() == null) {
            LogUtil.e("SCUI_TwoModelCardData", "showFitnessDataOriginDialog mStepsCardViewHolder == null");
            return;
        }
        if ("".equals(SharedPreferenceManager.e(this.mContext, String.valueOf(10000), "data_origin_icon_red_dot"))) {
            SharedPreferenceManager.e(this.mContext, String.valueOf(10000), "data_origin_icon_red_dot", "false", new StorageParams());
        }
        ThreeCircleCardData threeCircleCardData = this.ac;
        if (threeCircleCardData != null) {
            threeCircleCardData.n();
        }
        ThreeLeafCardData threeLeafCardData = this.z;
        if (threeLeafCardData != null) {
            threeLeafCardData.n();
        }
        uin.e().a(this.mContext, x());
    }

    private int x() {
        if ("threeCircleCard".equals(tbf.e())) {
            return 1;
        }
        return "threeLeafCard".equals(tbf.e()) ? 2 : 0;
    }

    public View.OnClickListener d(AchieveTaskHandler.AchieveAniType achieveAniType) {
        if (AchieveTaskHandler.AchieveAniType.SINGLE_CIRCLE_ACTIVE.equals(achieveAniType)) {
            return new View.OnClickListener() { // from class: tdc
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.d.b(view);
                }
            };
        }
        if (AchieveTaskHandler.AchieveAniType.SINGLE_CIRCLE_WALK.equals(achieveAniType)) {
            return new View.OnClickListener() { // from class: tde
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.d.c(view);
                }
            };
        }
        if (AchieveTaskHandler.AchieveAniType.SINGLE_CIRCLE_CALORIE.equals(achieveAniType)) {
            return new View.OnClickListener() { // from class: tdm
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f48995c.e(view);
                }
            };
        }
        if (AchieveTaskHandler.AchieveAniType.SINGLE_CIRCLE_INTENSITY.equals(achieveAniType)) {
            return new View.OnClickListener() { // from class: tdi
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.d.d(view);
                }
            };
        }
        if (AchieveTaskHandler.AchieveAniType.THREE_CIRCLE.equals(achieveAniType)) {
            return new View.OnClickListener() { // from class: tdj
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f48992a.a(view);
                }
            };
        }
        return null;
    }

    /* synthetic */ void b(View view) {
        tdy.e(this.mContext);
        ujq.d(1);
    }

    /* synthetic */ void c(View view) {
        ujq.b(1);
        HealthOpenSDK healthOpenSDK = this.l;
        Context context = this.mContext;
        int[] iArr = this.g;
        tdy.d(healthOpenSDK, context, iArr[3], iArr[4]);
        ujq.d(5);
    }

    /* synthetic */ void e(View view) {
        tdy.a(this.l, this.mContext, this.g[0]);
        ujq.d(3);
    }

    /* synthetic */ void d(View view) {
        l();
        ujq.d(2);
    }

    /* synthetic */ void a(View view) {
        tdy.a(this.mContext, this.d, this.g, this.j, "7");
        ujq.d(4);
    }

    protected void l() {
        HealthOpenSDK healthOpenSDK = this.l;
        if (healthOpenSDK != null) {
            healthOpenSDK.e((IFlushResult) null);
        }
        tdy.b(this.l, this.mContext, this.g[1]);
    }

    public static class e implements com.huawei.haf.design.pattern.Observer {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<tcw> f48985c;

        e(tcw tcwVar) {
            this.f48985c = new WeakReference<>(tcwVar);
        }

        @Override // com.huawei.haf.design.pattern.Observer
        public void notify(String str, Object... objArr) {
            tcw tcwVar;
            if (!"showFitnessDataOriginDialog".equals(str) || (tcwVar = this.f48985c.get()) == null) {
                return;
            }
            tcwVar.g();
        }
    }

    @Override // com.huawei.threecircle.manager.WheelChairStateManager.SwitchStateListener
    public void onSwitchStateChanged(boolean z) {
        ReleaseLogUtil.c("SCUI_TwoModelCardData", "initViewControl isOn:", Boolean.valueOf(z));
        ac();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(ResourceResultInfo resourceResultInfo) {
        ResourceBriefInfo next;
        if (b() == null) {
            ReleaseLogUtil.d("SCUI_TwoModelCardData", "processMarketingData mViewHolder is null");
            return;
        }
        if (resourceResultInfo == null) {
            v();
            return;
        }
        List<ResourceBriefInfo> resources = resourceResultInfo.getResources();
        if (njy.e(resources)) {
            v();
            return;
        }
        ResourceResultInfo resourceResultInfo2 = this.f48980c;
        if (resourceResultInfo2 != null && resourceResultInfo2.equals(resourceResultInfo)) {
            ReleaseLogUtil.c("SCUI_TwoModelCardData", "same overlay resource");
            return;
        }
        this.f48980c = resourceResultInfo;
        Iterator<ResourceBriefInfo> it = resources.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (next.getContentType() != 138);
        if (next == null) {
            v();
            return;
        }
        LogUtil.a("SCUI_TwoModelCardData", "overlayBriefInfo: ", next.toString());
        resources.clear();
        resources.add(next);
        HashMap map = new HashMap(1);
        map.put(2052, resourceResultInfo);
        List<View> marketingViewList = ((MarketingApi) Services.b("FeatureMarketing", MarketingApi.class)).getMarketingViewList(this.mContext, map);
        if (njy.e(marketingViewList)) {
            LogUtil.j("SCUI_TwoModelCardData", "processMarketingData viewList is empty");
            v();
        } else {
            b().e(marketingViewList.get(0), this.aa, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        b().e(null, this.aa, false);
        this.f48980c = null;
        da.d(BaseApplication.getContext());
    }

    static class a implements AccessibilityManager.TouchExplorationStateChangeListener {
        private final WeakReference<tcw> e;

        a(tcw tcwVar) {
            this.e = new WeakReference<>(tcwVar);
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean z) {
            tcw tcwVar = this.e.get();
            if (tcwVar == null) {
                ReleaseLogUtil.d("SCUI_TwoModelCardData", "onTouchExplorationStateChanged cardData is null");
                return;
            }
            if (tcwVar.b() == null) {
                LogUtil.j("SCUI_TwoModelCardData", "onTouchExplorationStateChanged getViewHolder is null");
                return;
            }
            LogUtil.a("SCUI_TwoModelCardData", "onTouchExplorationStateChanged enabled ", Boolean.valueOf(z));
            if (z) {
                tcwVar.v();
                tcwVar.o = 0L;
            }
        }
    }
}

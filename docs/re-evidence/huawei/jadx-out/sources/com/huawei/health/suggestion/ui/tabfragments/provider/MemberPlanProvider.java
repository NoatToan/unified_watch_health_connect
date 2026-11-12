package com.huawei.health.suggestion.ui.tabfragments.provider;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import com.amap.api.maps.model.MyLocationStyle;
import com.huawei.basefitnessadvice.callback.OnFitnessStatusChangeCallback;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.basefitnessadvice.model.intplan.IntAction;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.basefitnessadvice.model.intplan.RecordData;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.router.AppRouter;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.knit.data.BaseKnitDataProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.health.marketrouter.api.MarketRouterApi;
import com.huawei.health.plan.api.PlanApi;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.tabfragments.provider.MemberPlanProvider;
import com.huawei.health.suggestion.util.JumpUtil;
import com.huawei.health.vip.api.VipApi;
import com.huawei.health.vip.api.VipCallback;
import com.huawei.health.vip.datatypes.UserMemberInfo;
import com.huawei.health.weight.WeightApi;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiSubscribeListener;
import com.huawei.hihealth.data.listener.HiUnSubscribeListener;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.WebViewHelp;
import defpackage.btq;
import defpackage.btw;
import defpackage.ddv;
import defpackage.fcn;
import defpackage.gzx;
import defpackage.hcz;
import defpackage.hdc;
import defpackage.hdf;
import defpackage.hdh;
import defpackage.hdp;
import defpackage.hvu;
import defpackage.hvv;
import defpackage.ibx;
import defpackage.idy;
import defpackage.ift;
import defpackage.irz;
import defpackage.iun;
import defpackage.iup;
import defpackage.lsy;
import defpackage.njy;
import defpackage.peh;
import defpackage.vfy;
import defpackage.vgo;
import defpackage.vgw;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Services;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes31.dex */
public class MemberPlanProvider extends BaseKnitDataProvider<ibx> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f10075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IntPlan f10076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private vgo f10077c;
    private Context d;
    private final Observer g;
    private String i;
    private vfy j;
    private hdf k;
    private List<Integer> m;
    private hdf o;
    private WeakReference<SectionBean> h = new WeakReference<>(null);
    private OnFitnessStatusChangeCallback f = new OnFitnessStatusChangeCallback() { // from class: com.huawei.health.suggestion.ui.tabfragments.provider.MemberPlanProvider.5
        @Override // com.huawei.basefitnessadvice.callback.OnFitnessStatusChangeCallback
        public void onUpdate() {
            if (MemberPlanProvider.this.d == null || MemberPlanProvider.this.h.get() == null) {
                LogUtil.j("Suggestion_MemberPlanProvider", "context null.", Boolean.valueOf(MemberPlanProvider.this.d == null), Boolean.valueOf(MemberPlanProvider.this.h.get() == null));
            } else {
                MemberPlanProvider memberPlanProvider = MemberPlanProvider.this;
                memberPlanProvider.b(memberPlanProvider.d, (SectionBean) MemberPlanProvider.this.h.get());
            }
        }
    };
    private Map<String, Object> l = new HashMap();
    private boolean e = true;

    private boolean a(int i, int i2, int i3) {
        if (i >= i3) {
            return i == i3 && i2 == 0;
        }
        return true;
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public boolean isActive(Context context) {
        return true;
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public /* synthetic */ void parseParams(Context context, HashMap map, Object obj) {
        b(context, (HashMap<String, Object>) map, (ibx) obj);
    }

    public /* synthetic */ void a(String str, Object[] objArr) {
        IntPlan intPlan;
        if ("MEMBER_PAGE_IS_VISIBLE_TO_USER".equals(str)) {
            Object obj = objArr[0];
            if (!(obj instanceof Boolean)) {
                LogUtil.j("Suggestion_MemberPlanProvider", "mObserver object ", obj);
                return;
            }
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            this.e = zBooleanValue;
            LogUtil.a("Suggestion_MemberPlanProvider", "mIsVisibleToUser:", Boolean.valueOf(zBooleanValue), " size:", Integer.valueOf(this.l.size()));
            if (this.e && this.l.size() != 0) {
                idy.a(0, this.l);
            }
            if (!this.e || (intPlan = this.f10076b) == null) {
                return;
            }
            b(intPlan);
            d(this.f10076b);
        }
    }

    public MemberPlanProvider() {
        Observer observer = new Observer() { // from class: ick
            @Override // com.huawei.haf.design.pattern.Observer
            public final void notify(String str, Object[] objArr) {
                this.f37486b.a(str, objArr);
            }
        };
        this.g = observer;
        LogUtil.a("Suggestion_MemberPlanProvider", "MemberPlanProvider create.");
        ArrayList arrayList = new ArrayList();
        arrayList.add(40003);
        arrayList.add(Integer.valueOf(DicDataTypeUtil.DataType.RESTING_METABOLISM_SET.value()));
        arrayList.add(Integer.valueOf(DicDataTypeUtil.DataType.CURRENT_BASAL_METABOLISM_SET.value()));
        arrayList.add(Integer.valueOf(DicDataTypeUtil.DataType.BASAL_METABOLISM_AFTER_EXERCISE_SET.value()));
        HiHealthNativeApi.a(BaseApplication.b()).subscribeHiHealthData(arrayList, new d());
        btq.e().c(this.f, "PLAN_DELETE");
        btq.e().c(this.f, "PLAN_UPDATE");
        ObserverManagerUtil.d(observer, "MEMBER_PAGE_IS_VISIBLE_TO_USER");
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.IKnitLifeCycle
    public void onDestroy() {
        super.onDestroy();
        LogUtil.a("Suggestion_MemberPlanProvider", "on destroy.");
        if (njy.b(this.m)) {
            HiHealthNativeApi.a(BaseApplication.b()).unSubscribeHiHealthData(this.m, new HiUnSubscribeListener() { // from class: ich
                @Override // com.huawei.hihealth.data.listener.HiUnSubscribeListener
                public final void onResult(boolean z) {
                    ReleaseLogUtil.c("Suggestion_MemberPlanProvider", "onDestroy unSubscribeHiHealthData isSuccess ", Boolean.valueOf(z));
                }
            });
        }
        btq.e().d(this.f, "PLAN_DELETE");
        btq.e().d(this.f, "PLAN_UPDATE");
        ObserverManagerUtil.c(this.g);
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: loadData */
    public void b(final Context context, final SectionBean sectionBean) {
        super.b(context, sectionBean);
        if (HandlerExecutor.c()) {
            lsy.a(new Runnable() { // from class: com.huawei.health.suggestion.ui.tabfragments.provider.MemberPlanProvider.4
                @Override // java.lang.Runnable
                public void run() {
                    MemberPlanProvider.this.b(context, sectionBean);
                }
            });
            return;
        }
        if (this.d == null) {
            this.d = context;
        }
        if (this.h.get() == null) {
            this.h = new WeakReference<>(sectionBean);
        }
        d(new ibx(), sectionBean, new CountDownLatch(4));
    }

    public void b(Context context, HashMap<String, Object> map, ibx ibxVar) {
        super.parseParams(context, map, ibxVar);
        map.put("DOING_PLAN_FLAG", Boolean.valueOf(ibxVar.l()));
        map.put("INT_PLAN_TYPE", Integer.valueOf(ibxVar.f()));
        map.put("PLAN_NAME", ibxVar.g());
        map.put("REPORT_PLAN_TEXT", ibxVar.n());
        map.put("IS_SHOW_RED_DOT", Boolean.valueOf(ibxVar.m()));
        map.put("DIET_CALORIE_OVERVIEW", ibxVar.e());
        map.put("BEGIN_DATE", Long.valueOf(ibxVar.c()));
        map.put("TOTAL_DAY", Integer.valueOf(ibxVar.k()));
        map.put("FINISH_RATE", Float.valueOf(ibxVar.j()));
        map.put("IS_VIP_EXPIRED", Boolean.valueOf(ibxVar.o()));
        map.put("GO_TO_SPORT_TIP", ibxVar.h());
        map.put("DIET_TIP", ibxVar.d());
        map.put("RECIPE_TIP", ibxVar.i());
        map.put("FASTING_LITE_TYPE", Integer.valueOf(ibxVar.a()));
        map.put("FASTING_LITE_VALUE", Long.valueOf(ibxVar.b()));
        d(context, map, ibxVar);
        if (this.e) {
            idy.a(0, this.l);
            IntPlan intPlan = this.f10076b;
            if (intPlan != null) {
                b(intPlan);
                d(this.f10076b);
            }
        }
    }

    private void d(final Context context, HashMap<String, Object> map, final ibx ibxVar) {
        map.put("GO_TO_PLAN_CLICK", new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.tabfragments.provider.MemberPlanProvider$$ExternalSyntheticLambda10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MemberPlanProvider.d(context, view);
            }
        });
        map.put("GO_TO_REPORT_CLICK", new View.OnClickListener() { // from class: ice
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f37476a.e(ibxVar, view);
            }
        });
        map.put("CREATE_AI_FITNESS_CLICK", new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.tabfragments.provider.MemberPlanProvider$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MemberPlanProvider.b(context, view);
            }
        });
        map.put("GO_TO_DIETARY_INSTRUCT", new View.OnClickListener() { // from class: icd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MemberPlanProvider.b(view);
            }
        });
        c(context, map, ibxVar);
    }

    static /* synthetic */ void d(Context context, View view) {
        LogUtil.a("Suggestion_MemberPlanProvider", "go to plan click.");
        JumpUtil.a(context);
        fcn.k();
    }

    public /* synthetic */ void e(ibx ibxVar, View view) {
        LogUtil.a("Suggestion_MemberPlanProvider", "go to report click.");
        JumpUtil.d(1, this.d, ibxVar.f(), this.i);
        idy.b(1, ibxVar.g(), 1, (int) ibxVar.j());
        fcn.k();
    }

    static /* synthetic */ void b(Context context, View view) {
        LogUtil.a("Suggestion_MemberPlanProvider", "create ai fitness plan click.");
        JumpUtil.e(IntPlan.PlanType.AI_FITNESS_PLAN.getType(), "JZ001", "", context);
        fcn.k();
    }

    public static /* synthetic */ void b(View view) {
        LogUtil.a("Suggestion_MemberPlanProvider", "setClickListener GO_TO_DIETARY_INSTRUCT");
        JumpUtil.c();
        fcn.k();
    }

    private void c(final Context context, HashMap<String, Object> map, final ibx ibxVar) {
        map.put("GO_TO_SPORT_CLICK", new View.OnClickListener() { // from class: icf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.e(ibxVar, context, view);
            }
        });
        map.put("DIET_CLICK", new View.OnClickListener() { // from class: icm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f37488b.d(ibxVar, view);
            }
        });
        map.put("RECIPE_CLICK", new View.OnClickListener() { // from class: icl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.d(ibxVar, context, view);
            }
        });
        map.put("FASTING_LITE_CLICK", new View.OnClickListener() { // from class: icj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f37484b.a(ibxVar, view);
            }
        });
    }

    public /* synthetic */ void e(ibx ibxVar, Context context, View view) {
        LogUtil.a("Suggestion_MemberPlanProvider", "Go to sport click.");
        if (ibxVar.o() && ibxVar.f() == IntPlan.PlanType.AI_FITNESS_PLAN.getType()) {
            a();
            idy.b(3, ibxVar.g(), 3, (int) ibxVar.j());
        } else {
            JumpUtil.a(context);
            idy.b(1, ibxVar.g(), 2, (int) ibxVar.j());
        }
        idy.a(1, this.l);
        fcn.k();
    }

    public /* synthetic */ void d(ibx ibxVar, View view) {
        LogUtil.a("Suggestion_MemberPlanProvider", "goToDietDiaryFastRecord.");
        iun.i("Suggestion_MemberPlanProvider");
        idy.b(1, ibxVar.g(), 4, (int) ibxVar.j());
        idy.a(1, this.l);
        fcn.k();
    }

    public /* synthetic */ void d(ibx ibxVar, Context context, View view) {
        if (ibxVar.o()) {
            a();
            idy.b(3, ibxVar.g(), 6, (int) ibxVar.j());
            return;
        }
        LogUtil.a("Suggestion_MemberPlanProvider", "Go to recipe click.");
        H5ProLaunchOption.Builder builder = new H5ProLaunchOption.Builder();
        builder.addGlobalBiParam(WebViewHelp.BI_KEY_PULL_FROM, "opening_page_plan");
        ddv.b().loadH5ProApp(context, "com.huawei.health.h5.custom-recipe", builder);
        idy.b(1, ibxVar.g(), 5, (int) ibxVar.j());
        idy.a(1, this.l);
        idy.a(1);
        fcn.k();
    }

    public /* synthetic */ void a(ibx ibxVar, View view) {
        LogUtil.a("Suggestion_MemberPlanProvider", "Go to fasting lite click.");
        fcn.k();
        MarketRouterApi marketRouterApi = (MarketRouterApi) Services.d("FeatureMarketing", MarketRouterApi.class);
        if (marketRouterApi == null) {
            LogUtil.a("Suggestion_MemberPlanProvider", "marketRouterApi == null");
            return;
        }
        marketRouterApi.router("huaweihealth://huaweihealth.app/openwith?address=com.huawei.health.h5.fasting-lite?healthType=2&pageType=10&pullFrom=4009&h5pro=true&urlType=4&pName=com.huawei.health&path=plan_setting");
        idy.b(1, ibxVar.g(), 7, (int) ibxVar.j());
        idy.a(1, this.l);
    }

    private void a() {
        LogUtil.a("Suggestion_MemberPlanProvider", "jumpToMemberSelect.");
        AppRouter.c("/OperationBundle/MemberTypeSelectActivity").a(R.anim.left_enter_short_for_sleep, R.anim.activity_no_animation_short).i();
    }

    private void d(ibx ibxVar, SectionBean sectionBean, CountDownLatch countDownLatch) {
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            LogUtil.e("Suggestion_MemberPlanProvider", "getCurrentPlan intPlanApi is null.");
        } else {
            planApi.e(new AnonymousClass2(ibxVar, sectionBean, countDownLatch));
        }
    }

    /* JADX INFO: renamed from: com.huawei.health.suggestion.ui.tabfragments.provider.MemberPlanProvider$2, reason: invalid class name */
    public class AnonymousClass2 extends UiCallback<IntPlan> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ibx f10081a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SectionBean f10082c;
        final /* synthetic */ CountDownLatch d;

        AnonymousClass2(ibx ibxVar, SectionBean sectionBean, CountDownLatch countDownLatch) {
            this.f10081a = ibxVar;
            this.f10082c = sectionBean;
            this.d = countDownLatch;
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            LogUtil.e("Suggestion_MemberPlanProvider", "getCurrentPlan onFailure", Integer.valueOf(i), str);
            this.f10081a.d(false);
            SectionBean sectionBean = this.f10082c;
            if (sectionBean == null) {
                LogUtil.j("Suggestion_MemberPlanProvider", "getCurrentPlan onFailure sectionBean == null");
            } else {
                sectionBean.c(this.f10081a);
            }
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onSuccess(final IntPlan intPlan) {
            LogUtil.a("Suggestion_MemberPlanProvider", "getCurrentIntPlan onSuccess.");
            if (intPlan != null) {
                MemberPlanProvider.this.f10076b = intPlan;
                MemberPlanProvider.this.i = intPlan.getPlanId();
                this.f10081a.d(true);
                this.f10081a.b(intPlan.getPlanType().getType());
                if (intPlan.getPlanType().equals(IntPlan.PlanType.AI_FITNESS_PLAN) || intPlan.getPlanType().equals(IntPlan.PlanType.AI_RUN_PLAN)) {
                    MemberPlanProvider.this.d(this.f10081a, intPlan);
                }
                MemberPlanProvider.this.e(this.f10081a, intPlan);
                ThreadPoolManager threadPoolManagerC = ThreadPoolManager.c();
                final ibx ibxVar = this.f10081a;
                final SectionBean sectionBean = this.f10082c;
                final CountDownLatch countDownLatch = this.d;
                threadPoolManagerC.execute(new Runnable() { // from class: icp
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f37492a.e(ibxVar, intPlan, sectionBean, countDownLatch);
                    }
                });
                return;
            }
            LogUtil.e("Suggestion_MemberPlanProvider", "plan data is null.");
            this.f10081a.d(false);
            SectionBean sectionBean2 = this.f10082c;
            if (sectionBean2 == null) {
                LogUtil.e("Suggestion_MemberPlanProvider", "plan null sectionBean == null.");
            } else {
                sectionBean2.c(this.f10081a);
            }
        }

        public /* synthetic */ void e(ibx ibxVar, IntPlan intPlan, SectionBean sectionBean, CountDownLatch countDownLatch) {
            MemberPlanProvider.this.d(ibxVar, intPlan, sectionBean, countDownLatch);
            MemberPlanProvider.this.e(ibxVar, intPlan, sectionBean, countDownLatch);
        }
    }

    private void b(IntPlan intPlan) {
        if (intPlan.getPlanType().equals(IntPlan.PlanType.AI_FITNESS_PLAN)) {
            btw.e(intPlan, "7", 7, 2, 1);
        } else {
            btw.e(intPlan, "7", new int[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(ibx ibxVar, IntPlan intPlan) {
        LogUtil.a("Suggestion_MemberPlanProvider", "isOverdue:", Boolean.valueOf(hvu.u(intPlan)), " isVipExpired:", Boolean.valueOf(hvu.r(intPlan)));
        if (hvu.u(intPlan) || hvu.r(intPlan)) {
            ibxVar.b("");
            ibxVar.b(false);
        } else if (intPlan.getPlanType().equals(IntPlan.PlanType.AI_RUN_PLAN)) {
            a(ibxVar, intPlan);
        } else if (intPlan.getPlanType().equals(IntPlan.PlanType.AI_FITNESS_PLAN)) {
            c(ibxVar, intPlan);
        } else {
            ibxVar.b("");
            ibxVar.b(false);
        }
    }

    private void c(ibx ibxVar, IntPlan intPlan) {
        if (hvu.w(intPlan)) {
            ibxVar.b(gzx.c(com.huawei.hwcommonmodel.application.BaseApplication.getContext(), R.string.IDS_plan_this_week_report, new Object[0]));
            if (hvu.a()) {
                ibxVar.b(true);
                return;
            } else {
                ibxVar.b(false);
                return;
            }
        }
        a(ibxVar, intPlan);
    }

    private void a(ibx ibxVar, IntPlan intPlan) {
        if (hvu.x(intPlan)) {
            ibxVar.b(gzx.c(com.huawei.hwcommonmodel.application.BaseApplication.getContext(), R.string.IDS_plan_last_week_report, new Object[0]));
            if (hvu.e()) {
                ibxVar.b(true);
                return;
            } else {
                ibxVar.b(false);
                return;
            }
        }
        ibxVar.b("");
        ibxVar.b(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(ibx ibxVar, IntPlan intPlan) {
        if (intPlan.getMetaInfo() == null) {
            LogUtil.e("Suggestion_MemberPlanProvider", "setCompletedDaysAndRate meta info is null.");
            return;
        }
        ibxVar.a(intPlan.getMetaInfo().getName());
        if (intPlan.getStat("progress") != null) {
            ibxVar.a(((Float) intPlan.getStat("progress").getValue()).floatValue());
        } else {
            ibxVar.a(0.0f);
        }
        ibxVar.d(intPlan.getPlanTimeInfo().getBeginDate());
        ibxVar.c(intPlan.getMetaInfo().getDayCount());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final ibx ibxVar, final IntPlan intPlan, final SectionBean sectionBean, final CountDownLatch countDownLatch) {
        LogUtil.a("Suggestion_MemberPlanProvider", "checkIsVipExpired default:", Integer.valueOf(intPlan.getTransactionStatus()));
        VipApi vipApi = (VipApi) Services.d("vip", VipApi.class);
        if (vipApi == null) {
            LogUtil.j("Suggestion_MemberPlanProvider", "refreshVipStateData VipApi is null");
            ibxVar.a(hvu.r(intPlan));
            a(ibxVar, intPlan, sectionBean, countDownLatch);
            return;
        }
        vipApi.getVipInfo(new VipCallback() { // from class: com.huawei.health.suggestion.ui.tabfragments.provider.MemberPlanProvider.3
            @Override // com.huawei.health.vip.api.VipCallback
            public void onSuccess(Object obj) {
                LogUtil.a("Suggestion_MemberPlanProvider", "getVipInfo success.");
                if (obj == null) {
                    LogUtil.a("Suggestion_MemberPlanProvider", "getVipInfo onSuccess result is null");
                    ibxVar.a(hvu.r(intPlan));
                    MemberPlanProvider.this.a(ibxVar, intPlan, sectionBean, countDownLatch);
                    return;
                }
                UserMemberInfo userMemberInfo = obj instanceof UserMemberInfo ? (UserMemberInfo) obj : null;
                if (userMemberInfo == null || userMemberInfo.getMemberFlag() != 1 || irz.d(userMemberInfo)) {
                    LogUtil.j("Suggestion_MemberPlanProvider", "TradeViewApi memberInfo == null or != VipConstants.MEMBER_FLAG_VIP");
                    ibxVar.a(true);
                } else {
                    ibxVar.a(false);
                }
                MemberPlanProvider.this.a(ibxVar, intPlan, sectionBean, countDownLatch);
            }

            @Override // com.huawei.health.vip.api.VipCallback
            public void onFailure(int i, String str) {
                LogUtil.j("Suggestion_MemberPlanProvider", "getVipInfo errorCode=", Integer.valueOf(i), " errMsg=", str);
                MemberPlanProvider.this.a(ibxVar, intPlan, sectionBean, countDownLatch);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(ibx ibxVar, IntPlan intPlan, SectionBean sectionBean, CountDownLatch countDownLatch) {
        Calendar calendar = Calendar.getInstance();
        long timeInMillis = calendar.getTimeInMillis();
        int iA = DateFormatUtil.a(timeInMillis);
        calendar.add(6, 1);
        long timeInMillis2 = calendar.getTimeInMillis();
        ReleaseLogUtil.c("Suggestion_MemberPlanProvider", "getTodayDietRecord dayFormat ", Integer.valueOf(iA));
        iun.c(iA, iA, new c(this, ibxVar, intPlan, sectionBean, timeInMillis, timeInMillis2, countDownLatch));
    }

    static class c implements ResponseCallback<List<vgo>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ibx f10088a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final CountDownLatch f10089b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f10090c;
        private final IntPlan d;
        private final SectionBean e;
        private final long h;
        private final WeakReference<MemberPlanProvider> j;

        c(MemberPlanProvider memberPlanProvider, ibx ibxVar, IntPlan intPlan, SectionBean sectionBean, long j, long j2, CountDownLatch countDownLatch) {
            this.j = new WeakReference<>(memberPlanProvider);
            this.f10088a = ibxVar;
            this.d = intPlan;
            this.e = sectionBean;
            this.f10090c = j;
            this.h = j2;
            this.f10089b = countDownLatch;
        }

        @Override // com.huawei.hwbasemgr.ResponseCallback
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onResponse(int i, List<vgo> list) {
            MemberPlanProvider memberPlanProvider = this.j.get();
            if (memberPlanProvider == null) {
                ReleaseLogUtil.d("Suggestion_MemberPlanProvider", "InnerDietDiaryCbk provider is null list ", list);
                return;
            }
            LogUtil.a("Suggestion_MemberPlanProvider", "InnerDietDiaryCbk errorCode ", Integer.valueOf(i), " list ", list);
            if (njy.e(list)) {
                memberPlanProvider.b(this.f10088a, this.d, this.e, this.f10090c, this.h, this.f10089b);
                memberPlanProvider.a(this.f10088a, this.d, this.e, this.f10089b);
                return;
            }
            vgo vgoVar = list.get(0);
            if (vgoVar == null) {
                memberPlanProvider.b(this.f10088a, this.d, this.e, this.f10090c, this.h, this.f10089b);
                memberPlanProvider.a(this.f10088a, this.d, this.e, this.f10089b);
                return;
            }
            memberPlanProvider.f10077c = vgoVar;
            memberPlanProvider.j = vgoVar.d();
            memberPlanProvider.b(this.f10088a, this.d, this.e, this.f10090c, this.h, this.f10089b);
            ibx ibxVar = this.f10088a;
            if (ibxVar != null) {
                ibxVar.c(memberPlanProvider.j);
            }
            memberPlanProvider.a(this.f10088a, this.d, this.e, this.f10089b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(ibx ibxVar, IntPlan intPlan, SectionBean sectionBean, long j, long j2, CountDownLatch countDownLatch) {
        LogUtil.a("Suggestion_MemberPlanProvider", "getTwoDayRecipe:", Long.valueOf(j), " ", Long.valueOf(j2));
        c(ibxVar, intPlan, j, false, sectionBean, countDownLatch);
        c(ibxVar, intPlan, j2, true, sectionBean, countDownLatch);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void a(final ibx ibxVar, final IntPlan intPlan, final SectionBean sectionBean, final CountDownLatch countDownLatch) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: ici
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.a(ibxVar, intPlan, sectionBean, countDownLatch);
                }
            });
            return;
        }
        countDownLatch.countDown();
        if (countDownLatch.getCount() > 0) {
            LogUtil.j("Suggestion_MemberPlanProvider", "not finish request.", Long.valueOf(countDownLatch.getCount()));
            return;
        }
        LogUtil.a("Suggestion_MemberPlanProvider", "setTodaySuggestion:", Long.valueOf(countDownLatch.getCount()));
        this.l.put("planName", intPlan.getMetaInfo().getName());
        b(ibxVar, intPlan);
        a(ibxVar);
        e(ibxVar);
        b(ibxVar);
        if (sectionBean == null) {
            ReleaseLogUtil.d("Suggestion_MemberPlanProvider", "setTodaySuggestion sectionBean is null");
        } else {
            sectionBean.c(ibxVar);
        }
    }

    private void b(ibx ibxVar, IntPlan intPlan) {
        int i;
        int i2 = 0;
        if (ibxVar.f() == IntPlan.PlanType.AI_FITNESS_PLAN.getType() && ibxVar.o()) {
            ibxVar.d(com.huawei.hwcommonmodel.application.BaseApplication.getContext().getString(R.string.IDS_renew_member_unlock));
            this.l.put("fitnessStatus", 0);
            return;
        }
        List<IntAction> listA = hvv.a(intPlan);
        if (njy.b(listA)) {
            Iterator<IntAction> it = listA.iterator();
            while (it.hasNext()) {
                if (it.next().getPunchFlag() == 0) {
                    i2++;
                }
            }
            i = i2;
            i2 = 1;
        } else {
            i = 0;
        }
        if (i2 == 0) {
            ibxVar.d(com.huawei.hwcommonmodel.application.BaseApplication.getContext().getResources().getString(R.string.IDS_suggest_you_rest_today));
            this.l.put("fitnessStatus", 4);
        } else if (i == 0) {
            ibxVar.d(com.huawei.hwcommonmodel.application.BaseApplication.getContext().getString(R.string.IDS_sport_task_finished));
            this.l.put("fitnessStatus", 3);
        } else if (i < listA.size()) {
            ibxVar.d(com.huawei.hwcommonmodel.application.BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_today_remain_course, i, Integer.valueOf(i)));
            this.l.put("fitnessStatus", 2);
        } else {
            ibxVar.d(com.huawei.hwcommonmodel.application.BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_sport_task_prepare, i, Integer.valueOf(i)));
            this.l.put("fitnessStatus", 1);
        }
    }

    private void d(IntPlan intPlan) {
        final List<IntAction> listA = hvv.a(intPlan);
        int iH = btw.h(intPlan);
        int iB = ift.b(Calendar.getInstance().get(7));
        listA.addAll(hvv.e(intPlan, iH, iB));
        Iterator<IntAction> it = listA.iterator();
        final int i = 0;
        while (it.hasNext()) {
            if (it.next().getPunchFlag() == 1) {
                i++;
            }
        }
        btw.a(this.f10076b, iH, iB, new IBaseResponseCallback() { // from class: icg
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i2, Object obj) {
                this.f37479a.b(listA, i, i2, obj);
            }
        });
    }

    public /* synthetic */ void b(List list, int i, int i2, Object obj) {
        idy.b(list.size(), i, c((List<RecordData>) obj), this.f10075a);
    }

    private List<Integer> c(List<RecordData> list) {
        ArrayList arrayList = new ArrayList();
        if (njy.b(list)) {
            for (RecordData recordData : list) {
                if (recordData != null && recordData.getSportType() > 0 && recordData.getIsInPlan() != 1) {
                    arrayList.add(Integer.valueOf(recordData.getSportType()));
                }
            }
        }
        return arrayList;
    }

    private void a(ibx ibxVar) {
        vfy vfyVar = this.j;
        if (vfyVar == null) {
            LogUtil.e("Suggestion_MemberPlanProvider", "overview is null.");
            ibxVar.e("");
            return;
        }
        int iRound = Math.round(vfyVar.h());
        int iRound2 = Math.round(this.j.e());
        int iRound3 = Math.round(this.j.a());
        int i = Calendar.getInstance().get(11);
        if (iRound == 0) {
            ibxVar.e(com.huawei.hwcommonmodel.application.BaseApplication.getContext().getString(R.string.IDS_has_intake_calories, com.huawei.hwcommonmodel.application.BaseApplication.getContext().getString(R.string.IDS_workout_recommend_heat, String.valueOf(iRound), String.valueOf(iRound2))));
            this.l.put("dietStatus", 0);
        } else if (i >= 18) {
            ibxVar.e(com.huawei.hwcommonmodel.application.BaseApplication.getContext().getString(R.string.IDS_checkout_diet_analysis));
            this.l.put("dietStatus", 3);
        } else if (iRound <= (iRound3 + iRound2) * 1.1f) {
            ibxVar.e(com.huawei.hwcommonmodel.application.BaseApplication.getContext().getString(R.string.IDS_has_intake_calories, com.huawei.hwcommonmodel.application.BaseApplication.getContext().getString(R.string.IDS_workout_recommend_heat, String.valueOf(iRound), String.valueOf(iRound2))));
            this.l.put("dietStatus", 1);
        } else {
            ibxVar.e(com.huawei.hwcommonmodel.application.BaseApplication.getContext().getString(R.string.IDS_exceeded_calories, com.huawei.hwcommonmodel.application.BaseApplication.getContext().getString(R.string.IDS_workout_recommend_heat, String.valueOf(iRound), String.valueOf(iRound2))));
            this.l.put("dietStatus", 2);
        }
    }

    private void b(ibx ibxVar) {
        WeightApi weightApi = (WeightApi) Services.d("Main", WeightApi.class);
        if (weightApi == null) {
            LogUtil.e("Suggestion_MemberPlanProvider", "setTodayFastLiteTip weightApi == null.");
            return;
        }
        String fastingLiteStatus = weightApi.getFastingLiteStatus();
        if (fastingLiteStatus.equals("0") || fastingLiteStatus.equals("1")) {
            LogUtil.a("Suggestion_MemberPlanProvider", "getFastingLiteStatus:", fastingLiteStatus);
            this.l.put("fastingStatus", 0);
            return;
        }
        String fastingLiteViewData = weightApi.getFastingLiteViewData();
        if (TextUtils.isEmpty(fastingLiteViewData)) {
            LogUtil.j("Suggestion_MemberPlanProvider", "getFastingLiteViewData null.");
            this.l.put("fastingStatus", 0);
        } else {
            LogUtil.a("Suggestion_MemberPlanProvider", "FastingLiteViewData:", fastingLiteViewData);
            b(ibxVar, fastingLiteViewData);
        }
    }

    private void b(ibx ibxVar, String str) {
        iup iupVar = (iup) HiJsonUtil.d(str, iup.class);
        if (iupVar != null) {
            int iC = iupVar.c();
            if (iC == 0) {
                ibxVar.a(R.string.IDS_fast_remain_time);
                ibxVar.a(d(iupVar));
                this.l.put("fastingStatus", 1);
            } else if (iC == 1) {
                ibxVar.a(R.string.IDS_diet_remain_time);
                ibxVar.a(d(iupVar));
                this.l.put("fastingStatus", 2);
            } else {
                if (iC == 2) {
                    ibxVar.a(R.string.IDS_no_diet_today);
                    ibxVar.a(0L);
                    this.l.put("fastingStatus", 0);
                    return;
                }
                LogUtil.e("Suggestion_MemberPlanProvider", "un know type.");
            }
        }
    }

    private long d(iup iupVar) {
        long jA = iupVar.a() - System.currentTimeMillis();
        if (jA < 0) {
            return 0L;
        }
        return jA;
    }

    private void e(ibx ibxVar) {
        if (ibxVar.o()) {
            ibxVar.c(com.huawei.hwcommonmodel.application.BaseApplication.getContext().getString(R.string.IDS_renew_member_unlock));
            this.l.put("recipeStatus", 0);
        } else if (d().equals("0") && ibxVar.f() != IntPlan.PlanType.AI_FITNESS_PLAN.getType()) {
            ibxVar.c(com.huawei.hwcommonmodel.application.BaseApplication.getContext().getString(R.string.IDS_see_custom_recipe));
            this.l.put("recipeStatus", 1);
        } else if (this.f10077c == null || this.o == null) {
            ibxVar.c("");
        } else {
            c(ibxVar);
        }
    }

    private void c(ibx ibxVar) {
        int i = Calendar.getInstance().get(11);
        int i2 = Calendar.getInstance().get(12);
        if (a(i, i2, 10)) {
            if (a(10)) {
                ibxVar.c(b(20, this.o.a()));
                this.l.put("recipeStatus", 3);
                return;
            } else {
                ibxVar.c(b(10, this.o.c()));
                this.l.put("recipeStatus", 2);
                return;
            }
        }
        if (a(i, i2, 15)) {
            if (a(20)) {
                ibxVar.c(b(30, this.o.b()));
                this.l.put("recipeStatus", 4);
                return;
            } else {
                ibxVar.c(b(20, this.o.a()));
                this.l.put("recipeStatus", 3);
                return;
            }
        }
        if (a(30)) {
            int iD = d(this.k);
            ibxVar.c(com.huawei.hwcommonmodel.application.BaseApplication.getContext().getString(R.string.IDS_tomorrow_recipe, com.huawei.hwcommonmodel.application.BaseApplication.getContext().getResources().getQuantityString(R.plurals.sug_chart_kcals, iD, Integer.valueOf(iD))));
            this.l.put("recipeStatus", 5);
        } else {
            ibxVar.c(b(30, this.o.b()));
            this.l.put("recipeStatus", 4);
        }
    }

    private void c(final ibx ibxVar, final IntPlan intPlan, long j, final boolean z, final SectionBean sectionBean, final CountDownLatch countDownLatch) {
        hcz hczVar = new hcz();
        String string = Integer.toString(1000);
        vfy vfyVar = this.j;
        if (vfyVar != null) {
            string = Integer.toString(Math.min(Math.max(1000, Math.round(vfyVar.e())), 10000));
        }
        String str = string;
        hczVar.c(str);
        if (intPlan.getPlanType().equals(IntPlan.PlanType.AI_FITNESS_PLAN)) {
            hczVar.e("1");
        } else {
            hczVar.e(d());
        }
        hczVar.a(this.j);
        String strI = ift.i(j);
        LogUtil.a("Suggestion_MemberPlanProvider", "energy:", str, " date:", strI, " isTomorrow:", Boolean.valueOf(z));
        new hdp().getFoodRecommendDetail(intPlan.getPlanId(), strI, hczVar, new UiCallback<hdh>() { // from class: com.huawei.health.suggestion.ui.tabfragments.provider.MemberPlanProvider.1
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str2) {
                LogUtil.e("Suggestion_MemberPlanProvider", "errorCode:", Integer.valueOf(i), MyLocationStyle.ERROR_INFO, str2);
                MemberPlanProvider.this.a(ibxVar, intPlan, sectionBean, countDownLatch);
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onSuccess(hdh hdhVar) {
                LogUtil.a("Suggestion_MemberPlanProvider", "getRecommendFoods recipeResponse ", HiJsonUtil.d(hdhVar));
                MemberPlanProvider.this.b(hdhVar, z);
                MemberPlanProvider.this.a(ibxVar, intPlan, sectionBean, countDownLatch);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(hdh hdhVar, boolean z) {
        if (hdhVar == null) {
            return;
        }
        if (z) {
            this.k = hdhVar.d();
        } else {
            this.o = hdhVar.d();
        }
    }

    private String d() {
        HiUserPreference userPreference = HiHealthManager.d(com.huawei.hwcommonmodel.application.BaseApplication.getContext()).getUserPreference("custom.custom_recipes");
        if (userPreference == null || TextUtils.isEmpty(userPreference.getValue())) {
            LogUtil.j("Suggestion_MemberPlanProvider", "getUserPreferenceValue is null or value valid fail", "0");
            return "0";
        }
        String value = userPreference.getValue();
        LogUtil.a("Suggestion_MemberPlanProvider", "getUserPreferenceValue ", value);
        Map<String, String> mapB = peh.b(value);
        if (mapB == null || mapB.get("nutrient_goal") == null) {
            return value;
        }
        LogUtil.a("Suggestion_MemberPlanProvider", "nutrient_goal:", mapB.get("nutrient_goal"));
        return mapB.get("nutrient_goal");
    }

    private boolean a(int i) {
        vgw next;
        vgo vgoVar = this.f10077c;
        if (vgoVar == null) {
            LogUtil.e("Suggestion_MemberPlanProvider", "mDietRecord == null || foods == null.");
            return false;
        }
        Iterator<vgw> it = vgoVar.a().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (next.i() != i);
        if (next == null) {
            return false;
        }
        LogUtil.a("Suggestion_MemberPlanProvider", "mealType:", Integer.valueOf(i), " kcal:", Float.valueOf(next.e()));
        return next.e() > 0.0f;
    }

    private String b(int i, List<hdc> list) {
        if (njy.e(list)) {
            return "";
        }
        Iterator<hdc> it = list.iterator();
        float fH = 0.0f;
        while (it.hasNext()) {
            fH += it.next().h();
        }
        if (i == 10) {
            int i2 = (int) fH;
            return com.huawei.hwcommonmodel.application.BaseApplication.getContext().getString(R.string.IDS_recommend_breakfast, com.huawei.hwcommonmodel.application.BaseApplication.getContext().getResources().getQuantityString(R.plurals.sug_chart_kcals, i2, Integer.valueOf(i2)));
        }
        if (i == 20) {
            int i3 = (int) fH;
            return com.huawei.hwcommonmodel.application.BaseApplication.getContext().getString(R.string.IDS_recommend_launch, com.huawei.hwcommonmodel.application.BaseApplication.getContext().getResources().getQuantityString(R.plurals.sug_chart_kcals, i3, Integer.valueOf(i3)));
        }
        if (i != 30) {
            return "";
        }
        int i4 = (int) fH;
        return com.huawei.hwcommonmodel.application.BaseApplication.getContext().getString(R.string.IDS_recommend_dinner, com.huawei.hwcommonmodel.application.BaseApplication.getContext().getResources().getQuantityString(R.plurals.sug_chart_kcals, i4, Integer.valueOf(i4)));
    }

    private int d(hdf hdfVar) {
        int iH = 0;
        if (hdfVar == null) {
            LogUtil.e("Suggestion_MemberPlanProvider", "getTotalRecipeHeat recipes null.");
            return 0;
        }
        if (hdfVar.c() != null) {
            Iterator<hdc> it = hdfVar.c().iterator();
            while (it.hasNext()) {
                iH = (int) (iH + it.next().h());
            }
        }
        if (hdfVar.a() != null) {
            Iterator<hdc> it2 = hdfVar.a().iterator();
            while (it2.hasNext()) {
                iH = (int) (iH + it2.next().h());
            }
        }
        if (hdfVar.b() != null) {
            Iterator<hdc> it3 = hdfVar.b().iterator();
            while (it3.hasNext()) {
                iH = (int) (iH + it3.next().h());
            }
        }
        return iH;
    }

    static class d implements HiSubscribeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<MemberPlanProvider> f10091a;

        private d(MemberPlanProvider memberPlanProvider) {
            this.f10091a = new WeakReference<>(memberPlanProvider);
        }

        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onResult(List<Integer> list, List<Integer> list2) {
            MemberPlanProvider memberPlanProvider = this.f10091a.get();
            if (memberPlanProvider != null) {
                memberPlanProvider.m = list;
            } else {
                ReleaseLogUtil.d("Suggestion_MemberPlanProvider", "InnerHiSubscribeListener onResult provider is null");
            }
        }

        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onChange(int i, HiHealthClient hiHealthClient, String str, HiHealthData hiHealthData, long j) {
            ReleaseLogUtil.c("Suggestion_MemberPlanProvider", "InnerHiSubscribeListener onChange type ", Integer.valueOf(i), " changeKey ", str, " time ", Long.valueOf(j));
            MemberPlanProvider memberPlanProvider = this.f10091a.get();
            if (memberPlanProvider != null) {
                SectionBean sectionBean = (SectionBean) memberPlanProvider.h.get();
                if (sectionBean != null) {
                    memberPlanProvider.b(memberPlanProvider.d, sectionBean);
                    return;
                } else {
                    ReleaseLogUtil.d("Suggestion_MemberPlanProvider", "InnerHiSubscribeListener onChange sectionBean is null");
                    return;
                }
            }
            ReleaseLogUtil.d("Suggestion_MemberPlanProvider", "InnerHiSubscribeListener onChange provider is null");
        }
    }
}

package com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.huawei.basefitnessadvice.callback.OnFitnessStatusChangeCallback;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.basefitnessadvice.model.PlanInfo;
import com.huawei.basefitnessadvice.model.intplan.IntAction;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.health.plan.api.PlanApi;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.callback.JudgeCallback;
import com.huawei.health.suggestion.util.ClickEventUtils;
import com.huawei.health.suggestion.util.JumpUtil;
import com.huawei.health.suggestion.util.ResourceJudgeUtil;
import com.huawei.health.weight.WeightApi;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.pluginfitnessadvice.FitnessPackageInfo;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.main.stories.health.weight.callback.WeightCallback;
import defpackage.btq;
import defpackage.btw;
import defpackage.gzx;
import defpackage.hvu;
import defpackage.hvv;
import defpackage.idy;
import defpackage.ift;
import defpackage.ltc;
import defpackage.njy;
import defpackage.vfv;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes31.dex */
public abstract class FitnessPlanProvider extends FitnessEntranceProvider<List<Object>> {
    private static final double DEFAULT_BFR = 20.0d;
    private static final double DEFAULT_WEIGHT = 65.0d;
    protected static final int MSG_UPDATE_MY_PLAN = 0;
    protected static final int MSG_UPDATE_RECOMMENDED_PLAN = 1;
    private static final int START_TEXT_DEFAULT_COLOR = ContextCompat.getColor(BaseApplication.getContext(), R.color.common_color_white);
    private static final int START_TEXT_FINISH_COLOR = ContextCompat.getColor(BaseApplication.getContext(), R.color.common_white_40alpha);
    private static final String TAG = "Suggestion_FitnessPlanProvider";
    public Context mContext;
    private float mFinishRate;
    private String mPlanComplete;
    private final OnFitnessStatusChangeCallback mPlanRefreshCallback;
    private String mPlanStatus;
    private String mPlanSummary;
    private String mStartText;
    private String mTodayTask;
    private String mVipExpiredContent;
    protected WeakReference<SectionBean> mSectionBeanRef = new WeakReference<>(null);
    protected boolean mIsJump2VipView = false;
    protected double mLastWeight = DEFAULT_WEIGHT;
    protected double mLastBodyFat = DEFAULT_BFR;
    protected boolean hasWeight = false;
    protected boolean vipStop = false;
    public Handler mHandler = new Handler(Looper.getMainLooper()) { // from class: com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessPlanProvider.4
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                return;
            }
            super.handleMessage(message);
            SectionBean sectionBean = FitnessPlanProvider.this.mSectionBeanRef.get();
            if (sectionBean == null) {
                ReleaseLogUtil.a(FitnessPlanProvider.TAG, "handle message failed, cause sectionBean is null!");
                return;
            }
            if (message.what == 0) {
                sectionBean.c(message.obj);
                FitnessPlanProvider.this.setFitnessPlansData((IntPlan) ((List) message.obj).get(0));
            } else if (message.what == 1) {
                sectionBean.c(message.obj);
            } else {
                LogUtil.j(FitnessPlanProvider.this.getLogTag(), "msg not handle.", Integer.valueOf(message.what));
            }
        }
    };
    private int mStartTextColor = START_TEXT_DEFAULT_COLOR;

    public abstract void getRecommendedPlanList();

    public abstract void onClickTitleEvent(Context context);

    public abstract void setMyPlanClickListener(Context context, List<IntPlan> list, Map<String, Object> map);

    public abstract void updateMyPlans(IntPlan intPlan);

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider, com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public /* bridge */ /* synthetic */ void parseParams(Context context, HashMap map, Object obj) {
        parseParams(context, (HashMap<String, Object>) map, (List<Object>) obj);
    }

    public FitnessPlanProvider() {
        e eVar = new e(this);
        this.mPlanRefreshCallback = eVar;
        btq.e().c(eVar, "PLAN_DELETE");
        btq.e().c(eVar, "PLAN_CREATE");
        btq.e().c(eVar, "PLAN_UPDATE");
        btq.e().c(eVar, "PLAN_SWITCH");
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider
    public boolean isCustomActive(Context context) {
        return !CommonUtil.ca();
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider, com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadData(Context context, SectionBean sectionBean) {
        LogUtil.a(getLogTag(), "loadData");
        this.mContext = context;
        this.mSectionBeanRef = new WeakReference<>(sectionBean);
        getPlanInfo();
    }

    public void parseParams(Context context, HashMap<String, Object> map, List<Object> list) {
        setData(context, map, list);
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.IKnitLifeCycle
    public void onDestroy() {
        btq.e().d(this.mPlanRefreshCallback, "PLAN_DELETE");
        btq.e().d(this.mPlanRefreshCallback, "PLAN_CREATE");
        btq.e().d(this.mPlanRefreshCallback, "PLAN_UPDATE");
        btq.e().d(this.mPlanRefreshCallback, "PLAN_SWITCH");
    }

    private void setData(Context context, HashMap<String, Object> map, List<Object> list) {
        map.put("TITLE", getSubViewTitle());
        if (njy.b((Object) list, PlanInfo.class)) {
            map.put("IS_LOAD_DEFAULT_VIEW", true);
            addRecommendPlanToMap(list, map);
            setRecommendPlanClickListener(context, list, map);
        } else {
            map.put("IS_LOAD_DEFAULT_VIEW", false);
            addMyPlanToMap(list, map);
            setMyPlanClickListener(context, list, map);
        }
    }

    private void addRecommendPlanToMap(List<FitnessPackageInfo> list, Map<String, Object> map) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (FitnessPackageInfo fitnessPackageInfo : list) {
            if (fitnessPackageInfo != null) {
                arrayList.add(fitnessPackageInfo.acquireCardPicture());
                arrayList2.add(fitnessPackageInfo.acquireName());
                if (TextUtils.isEmpty(fitnessPackageInfo.acquireDescription())) {
                    LogUtil.a(getLogTag(), "workoutPlanInfo:", fitnessPackageInfo.acquireName(), fitnessPackageInfo.acquirePlanTempId());
                } else {
                    arrayList3.add(fitnessPackageInfo.acquireDescription().trim());
                }
                arrayList4.add(fitnessPackageInfo.getPriceTagBeanList());
            }
        }
        map.put("BACKGROUND_IMAGE", arrayList);
        map.put("NAME", arrayList2);
        map.put("DESCRIPTION", arrayList3);
        map.put("CORNER_VIEW", arrayList4);
    }

    private void addMyPlanToMap(List<IntPlan> list, Map<String, Object> map) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        Iterator<IntPlan> it = list.iterator();
        while (it.hasNext()) {
            IntPlan next = it.next();
            if (next.getIntroduction() != null && !TextUtils.isEmpty(next.getIntroduction().acquirePreviewImgUrl())) {
                arrayList.add(next.getIntroduction().acquirePreviewImgUrl());
            } else if (!TextUtils.isEmpty(next.getMetaInfo().getCardImage())) {
                arrayList.add(next.getMetaInfo().getCardImage());
            } else {
                arrayList.add(next.getMetaInfo().getPicture());
            }
            if (TextUtils.isEmpty(this.mVipExpiredContent)) {
                arrayList2.add(next.getMetaInfo().getName());
            } else {
                arrayList2.add(this.mVipExpiredContent);
            }
            arrayList3.add(this.mPlanComplete);
            arrayList4.add(this.mTodayTask);
            ArrayList arrayList11 = arrayList3;
            ArrayList arrayList12 = arrayList4;
            Iterator<IntPlan> it2 = it;
            arrayList5.add(gzx.c(BaseApplication.getContext(), R.string.sug_home_finishpercent, ltc.c(this.mFinishRate, 2, 1)));
            arrayList8.add(Integer.valueOf((int) this.mFinishRate));
            String str = this.mPlanSummary;
            if (str != null) {
                arrayList9.add(str);
            }
            String str2 = this.mStartText;
            if (str2 != null) {
                arrayList6.add(str2);
                arrayList7.add(Integer.valueOf(this.mStartTextColor));
            }
            String str3 = this.mPlanStatus;
            if (str3 != null) {
                arrayList10.add(str3);
            }
            it = it2;
            arrayList3 = arrayList11;
            arrayList4 = arrayList12;
        }
        map.put("BACKGROUND_IMAGE", arrayList);
        map.put("NAME", arrayList2);
        map.put("COMPLETE_SITUATION", arrayList3);
        map.put("TODAY_TASK", arrayList4);
        map.put("FINISH_RATE", arrayList5);
        map.put("SUMMARY_TEXT", arrayList9);
        map.put(CommonConstant.RETKEY.STATUS, arrayList10);
        map.put("BUTTON_TEXT", arrayList6);
        map.put("BUTTON_TEXT_COLOR", arrayList7);
        map.put("PROGRESS_VALUE", arrayList8);
    }

    private void setRecommendPlanClickListener(final Context context, final List<FitnessPackageInfo> list, Map<String, Object> map) {
        map.put("CLICK_EVENT_LISTENER", new OnClickSectionListener() { // from class: com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessPlanProvider.3
            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i, int i2) {
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i, String str) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(String str) {
                if ("MORE_CLICK_EVENT".equals(str)) {
                    FitnessPlanProvider.this.onClickTitleEvent(context);
                }
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i) {
                if (njy.e(list, i)) {
                    LogUtil.e(FitnessPlanProvider.this.getLogTag(), "position is out of bounds");
                    return;
                }
                FitnessPackageInfo fitnessPackageInfo = (FitnessPackageInfo) list.get(i);
                if (fitnessPackageInfo == null) {
                    LogUtil.e(FitnessPlanProvider.this.getLogTag(), "workoutPlanInfo is null");
                    return;
                }
                IntPlan.PlanType planType = IntPlan.PlanType.getPlanType(fitnessPackageInfo.getPlanType());
                String strAcquirePlanTempId = fitnessPackageInfo.acquirePlanTempId();
                int iAcquireDisplayStyle = fitnessPackageInfo.acquireDisplayStyle();
                if (planType != null) {
                    if (planType.equals(IntPlan.PlanType.AI_FITNESS_PLAN)) {
                        FitnessPlanProvider.this.goToCreateAiFitnessPlan(planType, strAcquirePlanTempId);
                    } else if (planType.equals(IntPlan.PlanType.AI_RUN_PLAN)) {
                        ClickEventUtils.c(ClickEventUtils.ClickEventType.AI_RUN_COURSE, null);
                    } else {
                        JumpUtil.b(planType.getType(), strAcquirePlanTempId, iAcquireDisplayStyle, FitnessPlanProvider.this.mContext);
                        FitnessPlanProvider.this.reportGeneralPlanBi(fitnessPackageInfo);
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportGeneralPlanBi(FitnessPackageInfo fitnessPackageInfo) {
        HashMap map = new HashMap(5);
        map.put("click", 1);
        map.put("type", 3);
        map.put("planType", Integer.valueOf(fitnessPackageInfo.getPlanType()));
        map.put("planName", fitnessPackageInfo.acquireName());
        if (btw.d(fitnessPackageInfo)) {
            map.put("enter", "0");
        } else {
            map.put("enter", "1");
        }
        idy.b(AnalyticsValue.HEALTH_HOME_TRAINING_PROGRAM_PIC_2010036.value(), map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void goToCreateAiFitnessPlan(IntPlan.PlanType planType, String str) {
        LoginInit.getInstance(BaseApplication.getContext()).browsingToLogin(new a(planType.getType(), str, this), "");
    }

    static class a implements IBaseResponseCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f10144a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f10145b;
        private WeakReference<FitnessPlanProvider> d;

        a(int i, String str, FitnessPlanProvider fitnessPlanProvider) {
            this.f10145b = i;
            this.f10144a = str;
            this.d = new WeakReference<>(fitnessPlanProvider);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            FitnessPlanProvider fitnessPlanProvider = this.d.get();
            if (fitnessPlanProvider == null) {
                LogUtil.e(FitnessPlanProvider.TAG, "fitnessPlanProvider is null");
            } else if (i == 0) {
                JumpUtil.d(this.f10145b, this.f10144a, 0, "fitness", "", fitnessPlanProvider.mContext);
            } else {
                LogUtil.a(fitnessPlanProvider.getLogTag(), "LoginInit is not success", Integer.valueOf(i));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFitnessPlansData(IntPlan intPlan) {
        boolean z;
        List<IntAction> listA = hvv.a(intPlan);
        IntAction intAction = null;
        boolean z2 = false;
        if (njy.b(listA)) {
            int i = 0;
            for (IntAction intAction2 : listA) {
                if (intAction2 != null && intAction2.getPunchFlag() == 0) {
                    if (intAction == null) {
                        intAction = intAction2;
                    }
                    i++;
                }
            }
            z = true;
            if (listA.size() <= 1 || i >= listA.size()) {
                z = false;
                z2 = true;
            } else {
                z2 = true;
            }
        } else {
            z = false;
        }
        setHolderPlanStart(intPlan);
        if (!hvu.n(intPlan)) {
            showVipExpiredView(intPlan);
            return;
        }
        boolean zA = btw.a(intPlan, btw.h(intPlan), ift.b(Calendar.getInstance().get(7)));
        if (!z2) {
            showRestAndCompletionDayLayout(intPlan, zA);
        } else if (intAction == null) {
            this.mTodayTask = this.mContext.getString(R.string.IDS_plan_run_today_completed);
            this.mStartText = this.mContext.getString(R.string.IDS_sug_reco_trained);
            this.mStartTextColor = START_TEXT_FINISH_COLOR;
        } else {
            clickStartIntPlanCourse(intAction, z);
        }
        SectionBean sectionBean = this.mSectionBeanRef.get();
        if (sectionBean == null) {
            ReleaseLogUtil.a(TAG, "setFitnessPlansData failed, cause sectionBean is null!");
        } else {
            sectionBean.c(sectionBean.d());
            showVipExpiredView(intPlan);
        }
    }

    private void showRestAndCompletionDayLayout(IntPlan intPlan, boolean z) {
        if (z) {
            this.mTodayTask = this.mContext.getString(R.string.IDS_completion_day);
        } else {
            this.mTodayTask = this.mContext.getString(R.string.sug_home_restday);
        }
        this.mStartText = null;
        if (intPlan.getPlanType() == IntPlan.PlanType.AI_RUN_PLAN && btw.h(intPlan) > 1) {
            this.mStartText = this.mContext.getString(R.string.IDS_plan_report_for_last_week);
        }
        this.mStartTextColor = START_TEXT_DEFAULT_COLOR;
        if (intPlan.getPlanType() != IntPlan.PlanType.AI_FITNESS_PLAN || this.vipStop) {
            return;
        }
        initRestDayWeight();
    }

    private void setHolderPlanStart(IntPlan intPlan) {
        if (intPlan.getStat("progress") != null) {
            this.mFinishRate = ((Float) intPlan.getStat("progress").getValue()).floatValue();
        }
        int iC = hvu.c(intPlan);
        if (iC > intPlan.getMetaInfo().getDayCount()) {
            this.mPlanStatus = BaseApplication.getContext().getString(R.string.sug_home_overdueplan);
        } else if (iC <= 0) {
            this.mPlanStatus = this.mContext.getResources().getString(R.string.IDS_fitness_plan_start_date, DateUtils.formatDateTime(this.mContext, intPlan.getPlanTimeInfo().getBeginDate() * 1000, 24));
        } else {
            this.mPlanComplete = gzx.b(this.mContext, iC, intPlan.getMetaInfo().getDayCount(), 0);
            this.mPlanStatus = null;
        }
        SectionBean sectionBean = this.mSectionBeanRef.get();
        if (sectionBean == null) {
            ReleaseLogUtil.a(TAG, "setHolderPlanStart failed, cause sectionBean is null!");
        } else {
            sectionBean.c(sectionBean.d());
        }
    }

    private void clickStartIntPlanCourse(IntAction intAction, boolean z) {
        if (z) {
            this.mStartText = BaseApplication.getContext().getString(R.string.IDS_plan_run_continue);
        } else {
            this.mStartText = BaseApplication.getContext().getString(R.string.sug_start_train);
        }
        this.mStartTextColor = START_TEXT_DEFAULT_COLOR;
        if (intAction.getActionInfo() != null) {
            this.mTodayTask = intAction.getActionInfo().b();
            SectionBean sectionBean = this.mSectionBeanRef.get();
            if (sectionBean == null) {
                ReleaseLogUtil.a(TAG, "clickStartIntPlanCourse failed, cause sectionBean is null!");
            } else {
                sectionBean.c(sectionBean.d());
            }
        }
    }

    private void showVipExpiredView(IntPlan intPlan) {
        int i;
        this.mVipExpiredContent = "";
        this.mIsJump2VipView = false;
        if (intPlan == null) {
            return;
        }
        String planTempId = intPlan.getPlanTempId();
        if (intPlan.getPlanType().getType() == IntPlan.PlanType.AI_RUN_PLAN.getType()) {
            planTempId = String.valueOf(intPlan.getPlanType());
            i = 5;
        } else {
            i = 2;
        }
        ResourceJudgeUtil.c(i, planTempId, intPlan.getTransactionStatus(), (JudgeCallback<Integer>) new JudgeCallback() { // from class: ida
            @Override // com.huawei.health.suggestion.callback.JudgeCallback
            public final void onJudgeCallback(Object obj) {
                this.d.m1239xa84cbf20((Integer) obj);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$showVipExpiredView$0$com-huawei-health-suggestion-ui-tabfragments-provider-abstractproviders-FitnessPlanProvider, reason: not valid java name */
    public /* synthetic */ void m1239xa84cbf20(Integer num) {
        if (num.equals(2) || num.equals(3)) {
            this.vipStop = true;
            setVipExpiredData();
        } else {
            this.vipStop = false;
        }
        SectionBean sectionBean = this.mSectionBeanRef.get();
        if (sectionBean == null) {
            ReleaseLogUtil.a(TAG, "showVipExpiredView failed, cause sectionBean is null!");
        } else {
            sectionBean.c(sectionBean.d());
        }
    }

    private void setVipExpiredData() {
        this.mIsJump2VipView = true;
        this.mTodayTask = BaseApplication.getContext().getResources().getString(R.string.IDS_run_plan_member_expired);
        this.mVipExpiredContent = BaseApplication.getContext().getResources().getString(R.string.IDS_run_plan_member_continue);
        this.mStartText = BaseApplication.getContext().getResources().getString(R.string.IDS_user_vip_renew);
        this.mStartTextColor = START_TEXT_DEFAULT_COLOR;
    }

    private void initRestDayWeight() {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setTimeRange(ift.a(System.currentTimeMillis()), System.currentTimeMillis());
        hiAggregateOption.setAggregateType(4);
        hiAggregateOption.setGroupUnitType(0);
        hiAggregateOption.setCount(1);
        WeightApi weightApi = (WeightApi) Services.d("Main", WeightApi.class);
        if (weightApi != null) {
            weightApi.getWeightData(hiAggregateOption, new c(this));
        } else {
            LogUtil.j(getLogTag(), "weightApi is null.");
        }
        SectionBean sectionBean = this.mSectionBeanRef.get();
        if (sectionBean == null) {
            ReleaseLogUtil.a(TAG, "initRestDayWeight failed, cause sectionBean is null!");
        } else {
            sectionBean.c(sectionBean.d());
        }
    }

    public static class c implements WeightCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<FitnessPlanProvider> f10147a;

        c(FitnessPlanProvider fitnessPlanProvider) {
            this.f10147a = new WeakReference<>(fitnessPlanProvider);
        }

        @Override // com.huawei.ui.main.stories.health.weight.callback.WeightCallback
        public void getWeight(final ArrayList<vfv> arrayList) {
            WeakReference<FitnessPlanProvider> weakReference = this.f10147a;
            if (weakReference == null || weakReference.get() == null) {
                LogUtil.j(FitnessPlanProvider.TAG, "mProviderReference is destroyed.");
            } else {
                final FitnessPlanProvider fitnessPlanProvider = this.f10147a.get();
                HandlerExecutor.b(new Runnable() { // from class: icz
                    @Override // java.lang.Runnable
                    public final void run() {
                        fitnessPlanProvider.processLatestWeight(arrayList);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processLatestWeight(ArrayList<vfv> arrayList) {
        if (arrayList.size() == 0) {
            LogUtil.a(getLogTag(), "processLatestWeight has no record");
            this.mStartText = this.mContext.getString(R.string.IDS_measure_weight);
        } else {
            vfv vfvVar = arrayList.get(0);
            LogUtil.a(getLogTag(), "processLatestWeight has record ", Double.valueOf(vfvVar.d()));
            if (vfvVar.d() > 0.0d) {
                this.mPlanSummary = gzx.c(this.mContext, R.string.IDS_fitness_plan_today_weight, ltc.c(vfvVar.d(), 1, 1));
                this.hasWeight = true;
                this.mLastWeight = vfvVar.d();
                this.mLastBodyFat = vfvVar.c();
            }
        }
        SectionBean sectionBean = this.mSectionBeanRef.get();
        if (sectionBean == null) {
            ReleaseLogUtil.a(TAG, "processLatestWeight failed, cause sectionBean is null!");
        } else {
            sectionBean.c(sectionBean.d());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getPlanInfo() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessPlanProvider.2
            @Override // java.lang.Runnable
            public void run() {
                PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
                if (planApi == null) {
                    LogUtil.j(FitnessPlanProvider.this.getLogTag(), "getMyPlanInfo : planApi is null.");
                } else {
                    planApi.getCurrentIntPlan(new b(FitnessPlanProvider.this));
                }
            }
        });
    }

    static class b extends UiCallback<IntPlan> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        WeakReference<FitnessPlanProvider> f10146a;

        b(FitnessPlanProvider fitnessPlanProvider) {
            this.f10146a = new WeakReference<>(fitnessPlanProvider);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            WeakReference<FitnessPlanProvider> weakReference = this.f10146a;
            if (weakReference == null) {
                LogUtil.j(FitnessPlanProvider.TAG, "GetMyPlanCallback onFailure mReference is null.");
                return;
            }
            FitnessPlanProvider fitnessPlanProvider = weakReference.get();
            if (fitnessPlanProvider != null) {
                LogUtil.j(fitnessPlanProvider.getLogTag(), "errorCode = ", Integer.valueOf(i), " errorInfo = ", str);
                fitnessPlanProvider.getRecommendedPlanList();
            }
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onSuccess(IntPlan intPlan) {
            WeakReference<FitnessPlanProvider> weakReference = this.f10146a;
            if (weakReference == null) {
                LogUtil.j(FitnessPlanProvider.TAG, "GetMyPlanCallback onSuccess mReference is null.");
                return;
            }
            FitnessPlanProvider fitnessPlanProvider = weakReference.get();
            if (fitnessPlanProvider != null) {
                fitnessPlanProvider.updateMyPlans(intPlan);
            }
        }
    }

    static class e implements OnFitnessStatusChangeCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        WeakReference<FitnessPlanProvider> f10148b;

        e(FitnessPlanProvider fitnessPlanProvider) {
            this.f10148b = new WeakReference<>(fitnessPlanProvider);
        }

        @Override // com.huawei.basefitnessadvice.callback.OnFitnessStatusChangeCallback
        public void onUpdate() {
            FitnessPlanProvider fitnessPlanProvider = this.f10148b.get();
            if (fitnessPlanProvider != null) {
                fitnessPlanProvider.getPlanInfo();
            } else {
                LogUtil.j(FitnessPlanProvider.TAG, "OnFitnessStatusChangeCallback provider == null");
            }
        }
    }
}

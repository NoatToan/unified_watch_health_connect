package com.huawei.health.suggestion.ui.tabfragments.provider;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.huawei.basefitnessadvice.callback.OnFitnessStatusChangeCallback;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.basefitnessadvice.model.Plan;
import com.huawei.basefitnessadvice.model.PlanInfo;
import com.huawei.basefitnessadvice.model.PlanRecord;
import com.huawei.basefitnessadvice.model.PlanWorkout;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.health.course.api.CourseApi;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.health.plan.api.PlanApi;
import com.huawei.health.suggestion.FitnessExternalUtils;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.tabfragments.provider.AiRunPlanProvider;
import com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider;
import com.huawei.health.suggestion.util.ClickEventUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.pluginfitnessadvice.Workout;
import com.huawei.pluginfitnessadvice.plandata.CourseDataBean;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import defpackage.btq;
import defpackage.btt;
import defpackage.btw;
import defpackage.gzx;
import defpackage.hwo;
import defpackage.idy;
import defpackage.ieb;
import defpackage.ift;
import defpackage.ltc;
import defpackage.njy;
import defpackage.pcp;
import defpackage.pdt;
import defpackage.pea;
import defpackage.qpx;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.Services;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.utils.StringUtils;
import java.lang.ref.WeakReference;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes31.dex */
public class AiRunPlanProvider extends FitnessEntranceProvider<List<Object>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f10051a = ContextCompat.getColor(BaseApplication.getContext(), R.color.common_color_white);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f10052b = ContextCompat.getColor(BaseApplication.getContext(), R.color.common_white_40alpha);
    private FitWorkout e;
    private Observer f;
    private PlanWorkout l;
    private String k = BaseApplication.getContext().getString(R.string.sug_string_default);
    private String j = BaseApplication.getContext().getString(R.string.sug_string_default);
    private String r = BaseApplication.getContext().getString(R.string.sug_string_default);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Float f10053c = Float.valueOf(0.0f);
    private String o = BaseApplication.getContext().getString(R.string.sug_start_train);
    private int q = f10051a;
    private boolean i = true;
    private boolean h = false;
    private boolean g = false;
    private WeakReference<SectionBean> n = new WeakReference<>(null);
    private OnFitnessStatusChangeCallback m = new OnFitnessStatusChangeCallback() { // from class: ibw
        @Override // com.huawei.basefitnessadvice.callback.OnFitnessStatusChangeCallback
        public final void onUpdate() {
            this.f37467b.a();
        }
    };
    private final Handler d = new Handler(Looper.getMainLooper()) { // from class: com.huawei.health.suggestion.ui.tabfragments.provider.AiRunPlanProvider.3
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                return;
            }
            super.handleMessage(message);
            int i = message.what;
            if (i == 0) {
                if (njy.b(message.obj, Plan.class)) {
                    AiRunPlanProvider.this.e(message.obj);
                    Plan plan = (Plan) ((List) message.obj).get(0);
                    AiRunPlanProvider.this.c(plan);
                    AiRunPlanProvider.this.d(plan);
                    if (plan.getPlanCategory() == 0) {
                        AiRunPlanProvider.this.b(plan);
                        return;
                    } else if (plan.getTransactionStatus() == 3) {
                        AiRunPlanProvider.this.h();
                        return;
                    } else {
                        AiRunPlanProvider.this.e(plan);
                        return;
                    }
                }
                return;
            }
            if (i == 1 && njy.b(message.obj, PlanInfo.class)) {
                AiRunPlanProvider.this.e(message.obj);
            }
        }
    };

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider
    public int getCourseCategory() {
        return 258;
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider
    public int getPageType() {
        return 4;
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider
    public String getSubViewTitle() {
        return null;
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider
    public int getType() {
        return 0;
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider, com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public /* synthetic */ void parseParams(Context context, HashMap map, Object obj) {
        d(context, (HashMap<String, Object>) map, (List<Object>) obj);
    }

    public /* synthetic */ void a() {
        LogUtil.a("Track_Provider_Track_AiRunPlanProvider", "OnFitnessStatusChangeCallback, mPlanRefreshCallback");
        j();
    }

    public AiRunPlanProvider() {
        btq.e().c(this.m, "PLAN_DELETE");
        btq.e().c(this.m, "PLAN_CREATE");
        btq.e().c(this.m, "PLAN_UPDATE");
        btq.e().c(this.m, "PLAN_SWITCH");
        Observer observer = new Observer() { // from class: ibv
            @Override // com.huawei.haf.design.pattern.Observer
            public final void notify(String str, Object[] objArr) {
                this.f37466a.e(str, objArr);
            }
        };
        this.f = observer;
        ObserverManagerUtil.d(observer, "RUN_PLAN_UPDATE_HELLO_TIME");
    }

    public /* synthetic */ void e(String str, Object[] objArr) {
        e("AiRunPlanProvider");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Object obj) {
        SectionBean sectionBean = this.n.get();
        if (sectionBean == null) {
            LogUtil.j("Track_Provider_Track_AiRunPlanProvider", "setSectionBean sectionBean == null");
        } else {
            sectionBean.c(obj);
        }
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider
    public boolean isCustomActive(Context context) {
        return LoginInit.getInstance(context).getIsLogined() && FitnessExternalUtils.b() && !FitnessExternalUtils.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str) {
        SectionBean sectionBean = this.n.get();
        if (sectionBean == null) {
            ReleaseLogUtil.e("Track_Provider_Track_AiRunPlanProvider", "setSectionBeanData sectionBean == null tag:", str);
        } else {
            sectionBean.c(sectionBean.d());
        }
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider, com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: loadData */
    public void b(Context context, SectionBean sectionBean) {
        LogUtil.a("Track_Provider_Track_AiRunPlanProvider", "loadData");
        this.n = new WeakReference<>(sectionBean);
        this.h = false;
        if (isActive(context)) {
            j();
        }
    }

    public void d(Context context, HashMap<String, Object> map, List<Object> list) {
        LogUtil.a("Track_Provider_Track_AiRunPlanProvider", "parseParams");
        d(map, list);
    }

    private void d(HashMap<String, Object> map, List<Object> list) {
        map.put("TITLE", c());
        if (njy.b((Object) list, Plan.class)) {
            map.put("IS_LOAD_DEFAULT_VIEW", false);
            c((List<Plan>) list, (Map<String, Object>) map);
            d((List<Plan>) list, (Map<String, Object>) map);
        } else if (njy.b((Object) list, pcp.class)) {
            map.put("IS_LOAD_DEFAULT_VIEW", true);
            b(map);
            e((List<pcp>) list, (Map<String, Object>) map);
        }
    }

    protected String c() {
        return BaseApplication.getContext().getResources().getString(R.string.IDS_sug_ai_run_plan);
    }

    private void c(List<Plan> list, Map<String, Object> map) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        for (Iterator<Plan> it = list.iterator(); it.hasNext(); it = it) {
            Plan next = it.next();
            if (next.getPlanCategory() == 0) {
                arrayList.add(Integer.valueOf(R.drawable.old_plan_bg));
            } else {
                arrayList.add(next.getPicture());
            }
            arrayList2.add(this.k);
            String str = this.j;
            if (str != null) {
                arrayList3.add(str);
            }
            String str2 = this.r;
            if (str2 != null) {
                arrayList4.add(str2);
            }
            String str3 = this.o;
            if (str3 != null) {
                arrayList6.add(str3);
                arrayList7.add(Integer.valueOf(this.q));
            }
            if (this.i && this.f10053c != null) {
                arrayList5.add(gzx.c(BaseApplication.getContext(), R.string.IDS_plan_finish_percent, ltc.c(this.f10053c.floatValue(), 2, 1)));
                arrayList8.add(Integer.valueOf(this.f10053c.intValue()));
            }
        }
        map.put("BACKGROUND_IMAGE", arrayList);
        map.put("NAME", arrayList2);
        map.put("COMPLETE_SITUATION", arrayList3);
        map.put("TODAY_TASK", arrayList4);
        map.put("FINISH_RATE", arrayList5);
        map.put("BUTTON_TEXT", arrayList6);
        map.put("BUTTON_TEXT_COLOR", arrayList7);
        map.put("PROGRESS_VALUE", arrayList8);
        LogUtil.a("Track_Provider_Track_AiRunPlanProvider", map);
    }

    private void d(final List<Plan> list, Map<String, Object> map) {
        map.put("CLICK_EVENT_LISTENER", new OnClickSectionListener() { // from class: com.huawei.health.suggestion.ui.tabfragments.provider.AiRunPlanProvider.1
            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i, int i2) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(String str) {
                AiRunPlanProvider.this.c(str, (List<Plan>) list);
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i) {
                AiRunPlanProvider.this.d(i, (List<Plan>) list);
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i, String str) {
                AiRunPlanProvider.this.a(i, str, list);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str, List<Plan> list) {
        Plan plan;
        if ("MORE_CLICK_EVENT".equals(str)) {
            if (njy.c(list, 0) && (plan = list.get(0)) != null && plan.getPlanCategory() == 0) {
                f(plan);
            } else {
                ClickEventUtils.c(ClickEventUtils.ClickEventType.AI_RUN_COURSE, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i, List<Plan> list) {
        if (njy.e(list, i)) {
            LogUtil.e("Track_Provider_Track_AiRunPlanProvider", "position is out of bounds");
            return;
        }
        if (qrs.r()) {
            LogUtil.e("Track_Provider_Track_AiRunPlanProvider", " isFastClick");
            return;
        }
        Plan plan = list.get(i);
        if (plan == null) {
            LogUtil.e("Track_Provider_Track_AiRunPlanProvider", "runPlanInfo is null");
        } else if (plan.getPlanCategory() == 0) {
            f(plan);
        } else {
            ClickEventUtils.c(ClickEventUtils.ClickEventType.PLAN_TAB, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, String str, List<Plan> list) {
        if ("BUTTON_CLICK_EVENT".equals(str)) {
            if (qrs.r()) {
                LogUtil.e("Track_Provider_Track_AiRunPlanProvider", " isFastClick");
                return;
            }
            if (this.h) {
                ClickEventUtils.c(ClickEventUtils.ClickEventType.JUMP_VIP, null);
                return;
            }
            if (njy.e(list, i)) {
                LogUtil.e("Track_Provider_Track_AiRunPlanProvider", "position is out of bounds");
                return;
            }
            if (this.g) {
                HashMap map = new HashMap();
                map.put("currentPlan", list.get(i));
                ClickEventUtils.c(ClickEventUtils.ClickEventType.AI_RUN_PLAN_REPORT, map);
                return;
            }
            if (this.l != null) {
                Plan plan = list.get(i);
                if (plan == null) {
                    LogUtil.e("Track_Provider_Track_AiRunPlanProvider", "runPlanInfo is null");
                    return;
                } else {
                    if (plan.getPlanCategory() == 0) {
                        f(plan);
                        return;
                    }
                    return;
                }
            }
            if (this.e != null) {
                HashMap map2 = new HashMap();
                map2.put("currentPlan", list.get(i));
                map2.put("planWorkout", this.e);
                ClickEventUtils.c(ClickEventUtils.ClickEventType.START_AI_RUN_PLAN, map2);
            }
        }
    }

    private void b(Map<String, Object> map) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        if (Utils.o()) {
            arrayList.add(Integer.valueOf(R.drawable.plan_enter_bg_oversea));
        } else {
            arrayList.add(Integer.valueOf(R.drawable.plan_enter_bg));
        }
        arrayList2.add(ieb.b());
        arrayList3.add(ieb.e());
        arrayList4.add(BaseApplication.getContext().getString(R.string.IDS_sug_start_plan));
        map.put("BACKGROUND_IMAGE", arrayList);
        map.put("NAME", arrayList2);
        map.put("DESCRIPTION", arrayList3);
        map.put("BUTTON_TEXT", arrayList4);
    }

    private void e(final List<pcp> list, Map<String, Object> map) {
        map.put("CLICK_EVENT_LISTENER", new OnClickSectionListener() { // from class: com.huawei.health.suggestion.ui.tabfragments.provider.AiRunPlanProvider.4
            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i, int i2) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(String str) {
                if ("MORE_CLICK_EVENT".equals(str)) {
                    ClickEventUtils.c(ClickEventUtils.ClickEventType.AI_RUN_COURSE, null);
                }
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i) {
                if (njy.e(list, i)) {
                    LogUtil.e("Track_Provider_Track_AiRunPlanProvider", "position is out of bounds");
                    return;
                }
                if (qrs.r()) {
                    LogUtil.e("Track_Provider_Track_AiRunPlanProvider", "mRunPlanTitle click too fast");
                } else if (((pcp) list.get(i)) == null) {
                    LogUtil.e("Track_Provider_Track_AiRunPlanProvider", "runPlanInfo is null");
                } else {
                    ClickEventUtils.c(ClickEventUtils.ClickEventType.AI_RUN_COURSE, null);
                }
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i, String str) {
                if ("BUTTON_CLICK_EVENT".equals(str)) {
                    ClickEventUtils.c(ClickEventUtils.ClickEventType.AI_RUN_COURSE, null);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:14:0x004c  */
    /* JADX WARN: Code duplicated, block: B:15:0x006d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x006f  */
    /* JADX WARN: Code duplicated, block: B:17:0x0096  */
    public void c(Plan plan) {
        long time;
        int days;
        int i;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        long jCurrentTimeMillis = System.currentTimeMillis() / 86400000;
        String strAcquireStartDate = plan.acquireStartDate();
        String endDate = plan.getEndDate();
        if (strAcquireStartDate == null || endDate == null) {
            LogUtil.j("Track_Provider_Track_AiRunPlanProvider", "startDate or endDate == null");
        } else {
            try {
                time = simpleDateFormat.parse(strAcquireStartDate).getTime() / 86400000;
            } catch (ParseException e) {
                LogUtil.e("Track_Provider_Track_AiRunPlanProvider", "exception = ", LogAnonymous.b(e));
                time = 0;
            }
            days = plan.getDays();
            i = (int) (jCurrentTimeMillis - time);
            if (i > days) {
                this.o = null;
                this.r = BaseApplication.getContext().getString(R.string.sug_home_overdueplan);
                this.k = plan.acquireName();
                this.j = gzx.b(BaseApplication.getContext(), days, days, 0);
                this.i = false;
                return;
            }
            if (i <= 0) {
                this.j = null;
                this.k = plan.acquireName();
                this.r = BaseApplication.getContext().getResources().getString(R.string.IDS_fitness_plan_start_date, btw.c(BaseApplication.getContext(), plan));
                this.i = false;
                return;
            }
            this.k = plan.acquireName();
            this.j = gzx.b(BaseApplication.getContext(), i, days, 0);
        }
        time = 0;
        days = plan.getDays();
        i = (int) (jCurrentTimeMillis - time);
        if (i > days) {
            this.o = null;
            this.r = BaseApplication.getContext().getString(R.string.sug_home_overdueplan);
            this.k = plan.acquireName();
            this.j = gzx.b(BaseApplication.getContext(), days, days, 0);
            this.i = false;
            return;
        }
        if (i <= 0) {
            this.j = null;
            this.k = plan.acquireName();
            this.r = BaseApplication.getContext().getResources().getString(R.string.IDS_fitness_plan_start_date, btw.c(BaseApplication.getContext(), plan));
            this.i = false;
            return;
        }
        this.k = plan.acquireName();
        this.j = gzx.b(BaseApplication.getContext(), i, days, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final Plan plan) {
        LogUtil.a("Track_Provider_Track_AiRunPlanProvider", "getCurrentPlanRecord");
        final PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            LogUtil.j("Track_Provider_Track_AiRunPlanProvider", "getCurrentPlanRecord planApi is null");
        } else {
            final UiCallback<PlanRecord> uiCallback = new UiCallback<PlanRecord>() { // from class: com.huawei.health.suggestion.ui.tabfragments.provider.AiRunPlanProvider.2
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str) {
                    LogUtil.j("Track_Provider_Track_AiRunPlanProvider", "getCurrentPlanRecord fail errCode:", Integer.valueOf(i), " errorInfo:", str);
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public void onSuccess(PlanRecord planRecord) {
                    if (planRecord == null) {
                        LogUtil.j("Track_Provider_Track_AiRunPlanProvider", "getCurrentPlanRecord success but data is null");
                        return;
                    }
                    LogUtil.a("Track_Provider_Track_AiRunPlanProvider", "finishRate is ", Float.valueOf(planRecord.acquireFinishRate()));
                    AiRunPlanProvider.this.f10053c = Float.valueOf(planRecord.acquireFinishRate());
                    AiRunPlanProvider.this.e("getCurrentPlanRecord");
                }
            };
            btt.d().c(new Runnable() { // from class: icc
                @Override // java.lang.Runnable
                public final void run() {
                    AiRunPlanProvider.e(planApi, plan, uiCallback);
                }
            });
        }
    }

    public static /* synthetic */ void e(PlanApi planApi, Plan plan, UiCallback uiCallback) {
        planApi.setPlanType(0);
        if (plan != null) {
            planApi.getPlanProgress(plan.acquireId(), (UiCallback<PlanRecord>) uiCallback);
        } else {
            LogUtil.e("Track_Provider_Track_AiRunPlanProvider", "getCurrentPlanRecord have no current plan");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Plan plan) {
        List<PlanWorkout> listA = a(plan, new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
        if (njy.c(listA, 0)) {
            this.l = listA.get(0);
        } else {
            this.l = null;
        }
        if (this.l == null) {
            this.r = BaseApplication.getContext().getString(R.string.sug_home_restday);
            this.k = plan.acquireName();
            this.f10053c = null;
            this.o = null;
            return;
        }
        CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        if (courseApi == null) {
            LogUtil.j("Track_Provider_Track_AiRunPlanProvider", "getRunWorkout, run: courseApi is null.");
            return;
        }
        this.o = BaseApplication.getContext().getResources().getString(courseApi.hasDoneTodayRunTask(plan) ? R.string.sug_home_repeat_workout : R.string.sug_start_train);
        this.q = f10051a;
        String strPopName = this.l.popName();
        if (!TextUtils.isEmpty(strPopName)) {
            this.k = strPopName;
        }
        this.r = plan.acquireName();
    }

    private List<PlanWorkout> a(Plan plan, String str) {
        List<PlanWorkout> listAcquireWorkouts = plan.acquireWorkouts();
        ArrayList arrayList = new ArrayList();
        if (njy.e(listAcquireWorkouts)) {
            LogUtil.j("Track_Provider_Track_AiRunPlanProvider", "CollectionUtils.isEmpty(planWorkouts)");
            return arrayList;
        }
        for (PlanWorkout planWorkout : listAcquireWorkouts) {
            if (planWorkout != null && str.equals(planWorkout.popDayInfo().acquireDate())) {
                if (planWorkout.popWorkoutId() != null) {
                    arrayList.add(planWorkout);
                }
                int size = arrayList.size();
                LogUtil.d("Track_Provider_Track_AiRunPlanProvider", Integer.valueOf(size), "==today have workouts: ", planWorkout.popName());
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        this.h = true;
        this.r = BaseApplication.getContext().getResources().getString(R.string.IDS_run_plan_member_expired);
        this.k = BaseApplication.getContext().getResources().getString(R.string.IDS_run_plan_member_continue);
        this.o = BaseApplication.getContext().getResources().getString(R.string.IDS_user_vip_renew);
        this.q = f10051a;
        e("showVipExpiredView");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Plan plan) {
        String strE;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(new Date().getTime());
        int i = calendar.get(7);
        int iB = ift.b(i);
        int iB2 = btw.b(plan);
        LogUtil.d("Track_Provider_Track_AiRunPlanProvider", "PLAN = ", plan.toString());
        List<CourseDataBean> listE = hwo.e(plan, iB2, iB);
        pdt pdtVarB = btw.b(plan, iB, iB2);
        d(pdtVarB, listE, plan);
        List<CourseDataBean> listA = pdtVarB.a();
        boolean z = false;
        boolean z2 = btw.a(plan, iB2, i) && njy.e(listA);
        if (njy.e(listA)) {
            this.k = plan.acquireName();
            a(iB2, z2);
            return;
        }
        for (CourseDataBean courseDataBean : listA) {
            if (courseDataBean != null && courseDataBean.a()) {
                z = true;
            }
        }
        Iterator<CourseDataBean> it = listA.iterator();
        while (true) {
            if (!it.hasNext()) {
                strE = "";
                break;
            }
            CourseDataBean next = it.next();
            if (next != null && !next.a()) {
                strE = next.e();
                break;
            }
        }
        if ("Race".equals(strE)) {
            a(iB2);
        } else {
            d(strE, z);
        }
    }

    private void a(int i) {
        LogUtil.a("Track_Provider_Track_AiRunPlanProvider", "raceDayView");
        this.o = null;
        this.r = BaseApplication.getContext().getString(R.string.IDS_completion_day);
        b(i);
    }

    private void a(int i, boolean z) {
        this.o = null;
        b(i);
        if (z) {
            this.r = BaseApplication.getContext().getString(R.string.IDS_completion_day);
        } else if (this.i) {
            this.r = BaseApplication.getContext().getString(R.string.sug_home_restday);
        }
        LogUtil.j("Track_Provider_Track_AiRunPlanProvider", "courseDataBeanList is null isShowCompletionView：", Boolean.valueOf(z));
    }

    private void b(int i) {
        if (i > 1) {
            this.g = true;
            this.o = BaseApplication.getContext().getResources().getString(R.string.IDS_plan_report_for_last_week);
            this.q = f10051a;
        }
    }

    private void d(String str, final boolean z) {
        ((CourseApi) Services.d("CoursePlanService", CourseApi.class)).getCourseById(str, null, null, new UiCallback<Workout>() { // from class: com.huawei.health.suggestion.ui.tabfragments.provider.AiRunPlanProvider.5
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str2) {
                LogUtil.j("Track_Provider_Track_AiRunPlanProvider", "getCourseById", str2, Integer.valueOf(i));
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onSuccess(Workout workout) {
                LogUtil.a("Track_Provider_Track_AiRunPlanProvider", "getCourseById onSuccess");
                if (workout == null) {
                    return;
                }
                if (z) {
                    AiRunPlanProvider.this.o = BaseApplication.getContext().getResources().getString(R.string.IDS_plan_run_continue);
                } else {
                    AiRunPlanProvider.this.o = BaseApplication.getContext().getResources().getString(R.string.sug_start_train);
                }
                AiRunPlanProvider.this.q = AiRunPlanProvider.f10051a;
                AiRunPlanProvider.this.e = pea.d(workout);
                AiRunPlanProvider aiRunPlanProvider = AiRunPlanProvider.this;
                aiRunPlanProvider.r = aiRunPlanProvider.e.acquireName();
            }
        });
    }

    private void d(pdt pdtVar, List<CourseDataBean> list, Plan plan) {
        if (pdtVar.c()) {
            this.r = BaseApplication.getContext().getString(R.string.IDS_plan_run_today_completed);
            this.k = plan.acquireName();
            this.o = BaseApplication.getContext().getString(R.string.IDS_sug_reco_trained);
            this.q = f10052b;
            return;
        }
        if (njy.e(list)) {
            LogUtil.e("Track_Provider_Track_AiRunPlanProvider", "courseDataBeanList is empty");
            return;
        }
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        for (CourseDataBean courseDataBean : list) {
            if (courseDataBean == null) {
                LogUtil.e("Track_Provider_Track_AiRunPlanProvider", "planCourseData is null");
                return;
            } else if (!courseDataBean.a() && courseDataBean.b() == 1) {
                planApi.getWorkoutById(courseDataBean.e(), CommonUtil.a(com.huawei.haf.application.BaseApplication.b()), Locale.getDefault().getCountry(), new c(this));
                return;
            }
        }
        for (CourseDataBean courseDataBean2 : list) {
            if (courseDataBean2 == null) {
                LogUtil.e("Track_Provider_Track_AiRunPlanProvider", "planCourseData is null");
                return;
            } else if (!courseDataBean2.a() && courseDataBean2.b() == 2) {
                planApi.getWorkoutById(courseDataBean2.e(), CommonUtil.a(com.huawei.haf.application.BaseApplication.b()), Locale.getDefault().getCountry(), new c(this));
                return;
            }
        }
    }

    private void f(final Plan plan) {
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(BaseApplication.getActivity());
        builder.b(R.string.IDS_sug_oversea_run_plan_offline);
        builder.a(R.string.sug_dialog_yes, new View.OnClickListener() { // from class: ibz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f37471a.d(plan, view);
            }
        });
        builder.c(R.string.IDS_sug_ai_run_plan_finish, new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.tabfragments.provider.AiRunPlanProvider.8
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("Track_Provider_Track_AiRunPlanProvider", "showOfflineDialog start ai run plan");
                AiRunPlanProvider.this.a(plan);
            }
        });
        final NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        BaseApplication.getActivity().runOnUiThread(new Runnable() { // from class: icb
            @Override // java.lang.Runnable
            public final void run() {
                AiRunPlanProvider.c(noTitleCustomAlertDialogC);
            }
        });
    }

    public /* synthetic */ void d(Plan plan, View view) {
        LogUtil.a("Track_Provider_Track_AiRunPlanProvider", "showOfflineDialog ok");
        a(plan);
    }

    public static /* synthetic */ void c(NoTitleCustomAlertDialog noTitleCustomAlertDialog) {
        if (noTitleCustomAlertDialog != null) {
            noTitleCustomAlertDialog.show();
        }
    }

    public void a(Plan plan) {
        if (plan == null) {
            LogUtil.j("Track_Provider_Track_AiRunPlanProvider", "finishPlan currentPlan is null");
            return;
        }
        String strAcquireId = plan.acquireId();
        if (strAcquireId != null) {
            PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
            if (planApi == null) {
                LogUtil.e("Track_Provider_Track_AiRunPlanProvider", "finishPlan, getCurrentPlan : planApi is null.");
            } else {
                planApi.setPlanType(0);
                planApi.finishPlan(0, strAcquireId, new UiCallback<String>() { // from class: com.huawei.health.suggestion.ui.tabfragments.provider.AiRunPlanProvider.6
                    @Override // com.huawei.basefitnessadvice.callback.UiCallback
                    public void onFailure(int i, String str) {
                        LogUtil.e("Track_Provider_Track_AiRunPlanProvider", "finish  plan failed  ", str);
                        qpx.e(BaseApplication.getActivity(), str);
                    }

                    @Override // com.huawei.basefitnessadvice.callback.UiCallback
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public void onSuccess(String str) {
                        LogUtil.a("Track_Provider_Track_AiRunPlanProvider", "finish  plan onSuccess  ", str);
                        ClickEventUtils.c(ClickEventUtils.ClickEventType.AI_RUN_COURSE, null);
                        AiRunPlanProvider.this.e();
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        HashMap map = new HashMap(2);
        map.put("click", "1");
        map.put("enter", "3");
        idy.b("1120019", map);
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider, com.huawei.health.knit.data.BaseKnitDataProvider
    public String getLogTag() {
        return "Track_Provider_Track_AiRunPlanProvider";
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.IKnitLifeCycle
    public void onDestroy() {
        btq.e().d(this.m, "PLAN_DELETE");
        btq.e().d(this.m, "PLAN_CREATE");
        btq.e().d(this.m, "PLAN_UPDATE");
        btq.e().d(this.m, "PLAN_SWITCH");
        ObserverManagerUtil.a(this.f, "RUN_PLAN_UPDATE_HELLO_TIME");
    }

    private void j() {
        LogUtil.a("Track_Provider_Track_AiRunPlanProvider", "getPlanInfo sectionBean == null:", Boolean.valueOf(this.n.get() == null));
        if (isActive(BaseApplication.getContext())) {
            btt.d().c(new Runnable() { // from class: ica
                @Override // java.lang.Runnable
                public final void run() {
                    this.f37472a.d();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            LogUtil.j("Track_Provider_Track_AiRunPlanProvider", "getMyPlanInfo : planApi is null.");
        } else {
            planApi.e(new d(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<Plan> list) {
        if (!njy.e(list)) {
            d(list, 0);
        } else {
            f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new pcp());
        d(arrayList, 1);
    }

    private void d(Object obj, int i) {
        Message messageObtainMessage = this.d.obtainMessage(i);
        messageObtainMessage.obj = obj;
        this.d.sendMessage(messageObtainMessage);
    }

    static class d extends UiCallback<IntPlan> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        WeakReference<AiRunPlanProvider> f10060b;
        AiRunPlanProvider d;

        d(AiRunPlanProvider aiRunPlanProvider) {
            WeakReference<AiRunPlanProvider> weakReference = new WeakReference<>(aiRunPlanProvider);
            this.f10060b = weakReference;
            this.d = weakReference.get();
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            LogUtil.j("Track_Provider_Track_AiRunPlanProvider", "errorCode = ", Integer.valueOf(i), " errorInfo = ", str);
            AiRunPlanProvider aiRunPlanProvider = this.d;
            if (aiRunPlanProvider != null) {
                aiRunPlanProvider.f();
            }
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onSuccess(IntPlan intPlan) {
            if (this.d == null) {
                LogUtil.j("Track_Provider_Track_AiRunPlanProvider", "mRunPlanProvider == null");
                return;
            }
            ArrayList arrayList = new ArrayList();
            if (intPlan != null && intPlan.getCompatiblePlan() != null && (intPlan.getPlanType().equals(IntPlan.PlanType.AI_RUN_PLAN) || intPlan.getPlanType().equals(IntPlan.PlanType.RUN_PLAN))) {
                arrayList.add(intPlan.getCompatiblePlan());
            }
            this.d.a(arrayList);
        }
    }

    static class c extends UiCallback<FitWorkout> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        WeakReference<AiRunPlanProvider> f10059c;
        AiRunPlanProvider d;

        c(AiRunPlanProvider aiRunPlanProvider) {
            WeakReference<AiRunPlanProvider> weakReference = new WeakReference<>(aiRunPlanProvider);
            this.f10059c = weakReference;
            this.d = weakReference.get();
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            LogUtil.e("Track_Provider_Track_AiRunPlanProvider", "FitWorkoutUiCallBack errorCode = ", Integer.valueOf(i), ", errorInfo = ", str);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onSuccess(FitWorkout fitWorkout) {
            if (fitWorkout == null || this.d == null) {
                LogUtil.e("Track_Provider_Track_AiRunPlanProvider", "FitWorkoutUiCallBack onSuccess data is null. mAiRunPlanProvider:", Boolean.valueOf(this.d == null));
                return;
            }
            if (StringUtils.g(fitWorkout.acquireName())) {
                this.d.r = null;
            } else if ("Race".equals(fitWorkout.acquireId())) {
                this.d.r = BaseApplication.getContext().getString(R.string.IDS_completion_day);
            } else {
                this.d.r = fitWorkout.acquireName();
            }
            SectionBean sectionBean = (SectionBean) this.d.n.get();
            if (sectionBean != null) {
                sectionBean.c(sectionBean.d());
            }
        }
    }
}

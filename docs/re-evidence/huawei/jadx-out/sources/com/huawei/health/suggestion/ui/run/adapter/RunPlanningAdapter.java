package com.huawei.health.suggestion.ui.run.adapter;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.Gson;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.basefitnessadvice.model.Plan;
import com.huawei.basefitnessadvice.model.PlanRecord;
import com.huawei.basefitnessadvice.model.PlanWorkout;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.health.course.api.CourseApi;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.plan.api.PlanApi;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.plan.activity.AiPlanActivity;
import com.huawei.health.suggestion.ui.run.adapter.RunPlanningAdapter;
import com.huawei.health.suggestion.ui.run.listener.RunPlanRefreshCallback;
import com.huawei.health.suggestion.util.JumpUtil;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.ble.BleConstants;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.pluginfitnessadvice.Workout;
import com.huawei.pluginfitnessadvice.plandata.CourseDataBean;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.columnlayout.HealthColumnLinearLayout;
import com.huawei.ui.commonui.columnlayout.HealthColumnRelativeLayout;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import defpackage.btt;
import defpackage.btw;
import defpackage.ddv;
import defpackage.gzm;
import defpackage.gzx;
import defpackage.hcg;
import defpackage.hwo;
import defpackage.idy;
import defpackage.ien;
import defpackage.ift;
import defpackage.iov;
import defpackage.ltc;
import defpackage.njy;
import defpackage.pdt;
import defpackage.pea;
import defpackage.qqf;
import defpackage.qqz;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.Services;
import health.compact.a.utils.StringUtils;
import java.lang.ref.WeakReference;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
public class RunPlanningAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<Plan> f9975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Handler f9976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f9977c;
    private boolean d;
    private RunPlanRefreshCallback g;
    private boolean j;
    private CustomViewDialog e = null;
    private boolean h = true;
    private PlanWorkout f = null;

    public RunPlanningAdapter(Context context, List<Plan> list) {
        this.f9975a = new ArrayList();
        this.f9976b = null;
        this.f9977c = context;
        this.f9976b = new b(this.f9977c);
        if (njy.e(list)) {
            LogUtil.j("Suggestion_RunPlanningAdapter", "RunPlanningAdapter planList is null");
        } else {
            this.f9975a = list;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(this.f9977c).inflate(R.layout.sug_item_run_planning, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        if (njy.e(this.f9975a, 0)) {
            LogUtil.j("Suggestion_RunPlanningAdapter", "mCurrentPlansList is null");
        } else {
            this.d = false;
            e(viewHolder, this.f9975a.get(0));
        }
    }

    private void e(ViewHolder viewHolder, Plan plan) {
        if (plan == null) {
            LogUtil.j("Suggestion_RunPlanningAdapter", "onBindViewHolder plan is invalid.");
            return;
        }
        viewHolder.f9991a.setVisibility(0);
        viewHolder.f9992b.setVisibility(0);
        viewHolder.h.setVisibility(0);
        viewHolder.d.setVisibility(0);
        viewHolder.f9993c.setVisibility(0);
        e(plan);
        b(viewHolder, plan);
        b(plan, viewHolder);
        c(plan, viewHolder);
        if (plan.getPlanCategory() == 0) {
            a(viewHolder, plan);
        } else if (plan.getTransactionStatus() == 3) {
            e(viewHolder);
        } else {
            d(viewHolder, plan);
        }
    }

    private void b(ViewHolder viewHolder, Plan plan) {
        if (plan.acquireType() == 3) {
            d(plan, viewHolder);
            b(viewHolder.e);
        } else if (plan.getPlanCategory() == 0 && plan.acquireType() == 0) {
            a(viewHolder);
            d(viewHolder.e);
        } else {
            d(plan, viewHolder);
            b(viewHolder.e);
        }
    }

    private void d(ImageView imageView) {
        if (imageView == null) {
            return;
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.run.adapter.RunPlanningAdapter.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (!qrs.r()) {
                    if (RunPlanningAdapter.this.f9977c instanceof Activity) {
                        ((Activity) RunPlanningAdapter.this.f9977c).runOnUiThread(new Runnable() { // from class: com.huawei.health.suggestion.ui.run.adapter.RunPlanningAdapter.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                if (RunPlanningAdapter.this.e != null) {
                                    RunPlanningAdapter.this.e.show();
                                }
                            }
                        });
                        return;
                    } else {
                        LogUtil.e("Suggestion_RunPlanningAdapter", "mContext is not instanceof Activity");
                        return;
                    }
                }
                LogUtil.e("Suggestion_RunPlanningAdapter", " isFastClick");
            }
        });
    }

    private void b(ImageView imageView) {
        if (imageView == null) {
            return;
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.run.adapter.RunPlanningAdapter.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (view == null) {
                    LogUtil.j("Suggestion_RunPlanningAdapter", "mBackgroundPlanning view is null.");
                } else if (!qrs.r()) {
                    JumpUtil.a(RunPlanningAdapter.this.f9977c);
                } else {
                    LogUtil.e("Suggestion_RunPlanningAdapter", " isFastClick");
                }
            }
        });
    }

    private void d(Plan plan, ViewHolder viewHolder) {
        qqf.b(plan.getPicture(), viewHolder.e, qqf.d);
    }

    private void a(ViewHolder viewHolder) {
        if (!LanguageUtil.ba(this.f9977c)) {
            qqf.a(viewHolder.e, com.huawei.health.servicesui.R.drawable.old_plan_bg, qqf.d, 0, 0);
        } else {
            c(viewHolder.e);
        }
    }

    private void c(ImageView imageView) {
        qqf.e(qqz.e(this.f9977c, com.huawei.health.servicesui.R.drawable.old_plan_bg), imageView, qqf.d);
    }

    private void e(final Plan plan) {
        View viewInflate = LayoutInflater.from(this.f9977c).inflate(R.layout.run_plan_tips_layout, (ViewGroup) null);
        ((HealthTextView) viewInflate.findViewById(R.id.run_plan_feature1)).setText(this.f9977c.getResources().getString(R.string.IDS_sug_ai_run_plan_feature1));
        ((HealthTextView) viewInflate.findViewById(R.id.run_plan_feature2)).setText(this.f9977c.getResources().getString(R.string.IDS_sug_ai_run_plan_feature2));
        ((HealthTextView) viewInflate.findViewById(R.id.run_plan_join)).setText(this.f9977c.getResources().getString(R.string.IDS_sug_ai_run_plan_join));
        this.e = new CustomViewDialog.Builder(this.f9977c).a(this.f9977c.getResources().getString(R.string.IDS_sug_ai_run_plan_recommend)).d(viewInflate).a(this.f9977c.getResources().getString(R.string.IDS_sug_ai_run_plan_finish), new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.run.adapter.RunPlanningAdapter.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                RunPlanningAdapter.this.b(plan);
            }
        }).c(this.f9977c.getResources().getString(R.string.IDS_sug_ai_run_plan_continue), new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.run.adapter.RunPlanningAdapter.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setFlags(268435456);
                intent.setClassName(RunPlanningAdapter.this.f9977c, "com.huawei.health.suggestion.ui.run.activity.ShowPlanActivity");
                intent.putExtra("planDetail", new Gson().toJson(plan));
                LogUtil.d("Suggestion_RunPlanningAdapter", "initDialog ShowPlanActivity.");
                RunPlanningAdapter.this.e(intent);
            }
        }).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Intent intent) {
        if (intent == null) {
            LogUtil.j("Suggestion_RunPlanningAdapter", "startActivity intent is null.");
            return;
        }
        try {
            this.f9977c.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("Suggestion_RunPlanningAdapter", " ActivityNotFoundException.");
        }
    }

    public void b(Plan plan) {
        LogUtil.a("Suggestion_RunPlanningAdapter", "finish_plan");
        if (plan == null) {
            LogUtil.j("Suggestion_RunPlanningAdapter", "finishPlan currentPlan is null");
            return;
        }
        String strAcquireId = plan.acquireId();
        if (strAcquireId != null) {
            PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
            if (planApi == null) {
                LogUtil.e("Suggestion_RunPlanningAdapter", "finishPlan, getCurrentPlan : planApi is null.");
                return;
            } else {
                planApi.setPlanType(0);
                planApi.finishPlan(1, strAcquireId, new UiCallback<String>() { // from class: com.huawei.health.suggestion.ui.run.adapter.RunPlanningAdapter.8
                    @Override // com.huawei.basefitnessadvice.callback.UiCallback
                    public void onFailure(int i, String str) {
                        LogUtil.e("Suggestion_RunPlanningAdapter", "finish  plan failed  ", str);
                    }

                    @Override // com.huawei.basefitnessadvice.callback.UiCallback
                    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                    public void onSuccess(String str) {
                        LogUtil.a("Suggestion_RunPlanningAdapter", "finish  plan onSuccess  ", str);
                        Intent intent = new Intent(RunPlanningAdapter.this.f9977c, (Class<?>) AiPlanActivity.class);
                        intent.putExtra("plantype", 2);
                        iov.d(RunPlanningAdapter.this.f9977c, intent);
                        RunPlanningAdapter.this.a();
                    }
                });
                return;
            }
        }
        LogUtil.a("Suggestion_RunPlanningAdapter", "finish  plan  id is null ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        HashMap map = new HashMap(2);
        map.put("click", "1");
        map.put("enter", "3");
        idy.b("1120019", map);
    }

    private void a(final ViewHolder viewHolder, final Plan plan) {
        List<PlanWorkout> listE = e(plan, new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
        if (njy.c(listE, 0)) {
            this.f = listE.get(0);
        } else {
            this.f = null;
        }
        if (this.f == null) {
            viewHolder.f.setText(this.f9977c.getString(R.string.sug_home_restday));
            viewHolder.j.setText(plan.acquireName());
            viewHolder.h.setVisibility(8);
            viewHolder.d.setVisibility(8);
            viewHolder.f9993c.setVisibility(8);
            return;
        }
        viewHolder.h.setVisibility(0);
        viewHolder.d.setVisibility(0);
        viewHolder.f9993c.setVisibility(0);
        btt.d().c(new Runnable() { // from class: com.huawei.health.suggestion.ui.run.adapter.RunPlanningAdapter.6
            @Override // java.lang.Runnable
            public void run() {
                RunPlanningAdapter.this.a(plan, viewHolder);
            }
        });
        String strPopName = this.f.popName();
        if (!TextUtils.isEmpty(strPopName)) {
            viewHolder.j.setText(strPopName);
        }
        viewHolder.f.setText(plan.acquireName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final Plan plan, final ViewHolder viewHolder) {
        CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        if (courseApi == null) {
            LogUtil.j("Suggestion_RunPlanningAdapter", "setRunWorkout, run: courseApi is null.");
            return;
        }
        final int i = courseApi.hasDoneTodayRunTask(plan) ? R.string.sug_home_repeat_workout : R.string.sug_start_train;
        Handler handler = this.f9976b;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.huawei.health.suggestion.ui.run.adapter.RunPlanningAdapter.7
                @Override // java.lang.Runnable
                public void run() {
                    viewHolder.d.setText(RunPlanningAdapter.this.f9977c.getResources().getString(i));
                }
            });
        }
        viewHolder.d.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.run.adapter.RunPlanningAdapter.11
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (!qrs.r()) {
                    RunPlanningAdapter.this.d(plan);
                } else {
                    LogUtil.e("Suggestion_RunPlanningAdapter", "mBtnPlanning isFastClick");
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Plan plan) {
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            LogUtil.j("Suggestion_RunPlanningAdapter", "startRunPlan : planApi is null.");
            return;
        }
        planApi.setPlanType(0);
        if (hcg.e().d()) {
            gzm.c(this.f);
            HashMap map = new HashMap(16);
            map.put("click", 1);
            map.put(BleConstants.SPORT_TYPE, 1);
            idy.b(AnalyticsValue.HEALTH_HOME_START_TRAIN_BTN_2010037.value(), map);
        }
    }

    private List<PlanWorkout> e(Plan plan, String str) {
        List<PlanWorkout> listAcquireWorkouts = plan.acquireWorkouts();
        ArrayList arrayList = new ArrayList();
        if (njy.e(listAcquireWorkouts)) {
            LogUtil.j("Suggestion_RunPlanningAdapter", "CollectionUtils.isEmpty(planWorkouts)");
            return arrayList;
        }
        for (PlanWorkout planWorkout : listAcquireWorkouts) {
            if (planWorkout != null && str.equals(planWorkout.popDayInfo().acquireDate())) {
                if (planWorkout.popWorkoutId() != null) {
                    arrayList.add(planWorkout);
                }
                int size = arrayList.size();
                LogUtil.d("Suggestion_RunPlanningAdapter", Integer.valueOf(size), "==today have workouts: ", planWorkout.popName());
            }
        }
        return arrayList;
    }

    private void d(ViewHolder viewHolder, Plan plan) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(new Date().getTime());
        int i = calendar.get(7);
        int iB = ift.b(i);
        int iB2 = btw.b(plan);
        LogUtil.d("Suggestion_RunPlanningAdapter", "PLAN = ", plan.toString());
        List<CourseDataBean> listE = hwo.e(plan, iB2, iB);
        pdt pdtVarB = btw.b(plan, iB, iB2);
        b(pdtVarB, listE, viewHolder, plan);
        List<CourseDataBean> listA = pdtVarB.a();
        if (btw.a(plan, iB2, i) && njy.e(listA)) {
            LogUtil.j("Suggestion_RunPlanningAdapter", "isLastPlanDay true && courseList is empty");
            a(viewHolder, plan, iB2);
        } else if (njy.e(listA)) {
            e(viewHolder, plan, iB2, false);
            LogUtil.j("Suggestion_RunPlanningAdapter", "courseDataBeanList is null");
        } else {
            b(viewHolder, plan, listA, iB2);
        }
    }

    private void e(ViewHolder viewHolder, Plan plan, int i, boolean z) {
        if (i > 1) {
            viewHolder.d.setVisibility(0);
            viewHolder.f9993c.setVisibility(0);
            viewHolder.d.setText(R.string.IDS_plan_report_for_last_week);
            c(viewHolder, plan);
        } else {
            viewHolder.d.setVisibility(4);
            viewHolder.f9993c.setVisibility(4);
        }
        viewHolder.j.setText(plan.acquireName());
        if (z) {
            viewHolder.f.setText(R.string.IDS_completion_day);
        } else if (this.h) {
            viewHolder.f.setText(R.string.sug_home_restday);
        }
        if (this.j) {
            viewHolder.d.setVisibility(8);
            viewHolder.f9993c.setVisibility(8);
        }
    }

    private void a(ViewHolder viewHolder, Plan plan, int i) {
        if (viewHolder == null || viewHolder.f == null || viewHolder.d == null || viewHolder.f9993c == null) {
            LogUtil.j("Suggestion_RunPlanningAdapter", "showRaceView view null");
        } else {
            e(viewHolder, plan, i, true);
        }
    }

    private void b(final ViewHolder viewHolder, final Plan plan, List<CourseDataBean> list, int i) {
        String strE = "";
        boolean z = false;
        boolean z2 = false;
        for (CourseDataBean courseDataBean : list) {
            if (courseDataBean != null) {
                if (!courseDataBean.a() && TextUtils.isEmpty(strE)) {
                    strE = courseDataBean.e();
                }
                if (courseDataBean.a()) {
                    z2 = true;
                }
                if ("Race".equals(strE)) {
                    z = true;
                    break;
                }
            }
        }
        if (z) {
            a(viewHolder, plan, i);
            return;
        }
        if (z2) {
            viewHolder.d.setText(this.f9977c.getResources().getString(R.string.IDS_plan_run_continue));
        } else {
            viewHolder.d.setText(this.f9977c.getResources().getString(R.string.sug_start_train));
        }
        ((CourseApi) Services.d("CoursePlanService", CourseApi.class)).getCourseById(strE, null, null, new UiCallback<Workout>() { // from class: com.huawei.health.suggestion.ui.run.adapter.RunPlanningAdapter.13
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i2, String str) {
                LogUtil.j("Suggestion_RunPlanningAdapter", "getCourseById", str, Integer.valueOf(i2));
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(Workout workout) {
                LogUtil.a("Suggestion_RunPlanningAdapter", "getCourseById onSuccess");
                if (workout == null) {
                    return;
                }
                RunPlanningAdapter.this.a(workout, viewHolder, plan);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Workout workout, ViewHolder viewHolder, final Plan plan) {
        final FitWorkout fitWorkoutD = pea.d(workout);
        viewHolder.d.setVisibility(0);
        viewHolder.f9993c.setVisibility(0);
        viewHolder.f.setText(fitWorkoutD.acquireName());
        viewHolder.d.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.run.adapter.RunPlanningAdapter.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (RunPlanningAdapter.this.d) {
                    RunPlanningAdapter.this.d();
                    return;
                }
                PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
                if (planApi == null) {
                    LogUtil.j("Suggestion_RunPlanningAdapter", "startRunPlan : planApi is null.");
                    return;
                }
                planApi.setPlanType(0);
                ien.b(RunPlanningAdapter.this.f9977c, fitWorkoutD, plan, System.currentTimeMillis());
                HashMap map = new HashMap(16);
                map.put("click", 1);
                map.put(BleConstants.SPORT_TYPE, 1);
                idy.b(AnalyticsValue.HEALTH_HOME_START_TRAIN_BTN_2010037.value(), map);
            }
        });
    }

    private void c(ViewHolder viewHolder, final Plan plan) {
        viewHolder.d.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.run.adapter.RunPlanningAdapter.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (qrs.r()) {
                    LogUtil.e("Suggestion_RunPlanningAdapter", "setBtnClickListener is click fast ");
                } else {
                    JumpUtil.d(1, RunPlanningAdapter.this.f9977c, IntPlan.PlanType.AI_RUN_PLAN.getType(), plan.acquireId());
                }
            }
        });
    }

    private void e(ViewHolder viewHolder) {
        RunPlanRefreshCallback runPlanRefreshCallback = this.g;
        if (runPlanRefreshCallback != null) {
            runPlanRefreshCallback.setRefreshState();
        }
        viewHolder.f9991a.setVisibility(8);
        viewHolder.f9992b.setVisibility(8);
        viewHolder.h.setVisibility(8);
        viewHolder.f.setVisibility(0);
        viewHolder.f.setText(this.f9977c.getResources().getString(R.string.IDS_run_plan_member_expired));
        viewHolder.j.setVisibility(0);
        viewHolder.j.setText(this.f9977c.getResources().getString(R.string.IDS_run_plan_member_continue));
        viewHolder.d.setVisibility(0);
        viewHolder.f9993c.setVisibility(0);
        viewHolder.d.setPaddingRelative((int) this.f9977c.getResources().getDimension(R.dimen.emui_dimens_text_margin_fourth), 0, (int) this.f9977c.getResources().getDimension(R.dimen.emui_dimens_text_margin_fourth), 0);
        viewHolder.d.setText(this.f9977c.getResources().getString(R.string.IDS_user_vip_renew));
        this.d = true;
        viewHolder.d.setOnClickListener(new View.OnClickListener() { // from class: ibg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f37441c.a(view);
            }
        });
    }

    public /* synthetic */ void a(View view) {
        if (view == null) {
            LogUtil.j("Suggestion_RunPlanningAdapter", "mBtnPlanning view is null.");
        } else if (qrs.r()) {
            LogUtil.e("Suggestion_RunPlanningAdapter", " isFastClick");
        } else {
            d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        H5ProLaunchOption.Builder builder = new H5ProLaunchOption.Builder();
        builder.addPath("#/PrivilegeDetail?functionId=1");
        ddv.b().loadH5ProApp(this.f9977c, "com.huawei.health.h5.vip", builder);
    }

    private void c(final Plan plan, final ViewHolder viewHolder) {
        final PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            LogUtil.j("Suggestion_RunPlanningAdapter", "getCurrentPlanRecord planApi is null");
        } else {
            final UiCallback<PlanRecord> uiCallback = new UiCallback<PlanRecord>() { // from class: com.huawei.health.suggestion.ui.run.adapter.RunPlanningAdapter.5
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str) {
                    LogUtil.j("Suggestion_RunPlanningAdapter", "getCurrentPlanRecord fail errCode:", Integer.valueOf(i), " errorInfo:", str);
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public void onSuccess(PlanRecord planRecord) {
                    if (planRecord == null) {
                        LogUtil.j("Suggestion_RunPlanningAdapter", "getCurrentPlanRecord success but data is null");
                        return;
                    }
                    LogUtil.a("Suggestion_RunPlanningAdapter", "finishRate is ", Float.valueOf(planRecord.acquireFinishRate()));
                    viewHolder.h.setProgress(Math.round(planRecord.acquireFinishRate()));
                    viewHolder.f9992b.setText(gzx.c(RunPlanningAdapter.this.f9977c, R.string.IDS_plan_finish_percent, ltc.c(planRecord.acquireFinishRate(), 2, 1)));
                }
            };
            btt.d().c(new Runnable() { // from class: ibc
                @Override // java.lang.Runnable
                public final void run() {
                    RunPlanningAdapter.d(planApi, plan, uiCallback);
                }
            });
        }
    }

    public static /* synthetic */ void d(PlanApi planApi, Plan plan, UiCallback uiCallback) {
        planApi.setPlanType(0);
        if (plan != null) {
            planApi.getPlanProgress(plan.acquireId(), (UiCallback<PlanRecord>) uiCallback);
        } else {
            LogUtil.e("Suggestion_RunPlanningAdapter", "getCurrentPlanRecord have no current plan");
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004c  */
    /* JADX WARN: Code duplicated, block: B:15:0x006c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x006e  */
    /* JADX WARN: Code duplicated, block: B:17:0x0096  */
    private void b(Plan plan, ViewHolder viewHolder) {
        long time;
        int days;
        int i;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        long jCurrentTimeMillis = System.currentTimeMillis() / 86400000;
        String strAcquireStartDate = plan.acquireStartDate();
        String endDate = plan.getEndDate();
        if (strAcquireStartDate == null || endDate == null) {
            LogUtil.j("Suggestion_RunPlanningAdapter", "startDate or endDate == null");
        } else {
            try {
                time = simpleDateFormat.parse(strAcquireStartDate).getTime() / 86400000;
            } catch (ParseException e) {
                LogUtil.e("Suggestion_RunPlanningAdapter", "exception = ", LogAnonymous.b(e));
                time = 0;
            }
            days = plan.getDays();
            i = (int) (jCurrentTimeMillis - time);
            if (i > days) {
                viewHolder.d.setVisibility(8);
                viewHolder.f9993c.setVisibility(8);
                viewHolder.f.setText(R.string.sug_home_overdueplan);
                viewHolder.j.setText(plan.acquireName());
                b(viewHolder, true, false);
                return;
            }
            if (i <= 0) {
                viewHolder.j.setText(plan.acquireName());
                viewHolder.f.setText(this.f9977c.getResources().getString(R.string.IDS_fitness_plan_start_date, btw.c(this.f9977c, plan)));
                b(viewHolder, true, false);
                return;
            }
            viewHolder.j.setText(plan.acquireName());
            viewHolder.f9991a.setText(gzx.b(this.f9977c, i, days, 0));
            b(viewHolder, false, true);
        }
        time = 0;
        days = plan.getDays();
        i = (int) (jCurrentTimeMillis - time);
        if (i > days) {
            viewHolder.d.setVisibility(8);
            viewHolder.f9993c.setVisibility(8);
            viewHolder.f.setText(R.string.sug_home_overdueplan);
            viewHolder.j.setText(plan.acquireName());
            b(viewHolder, true, false);
            return;
        }
        if (i <= 0) {
            viewHolder.j.setText(plan.acquireName());
            viewHolder.f.setText(this.f9977c.getResources().getString(R.string.IDS_fitness_plan_start_date, btw.c(this.f9977c, plan)));
            b(viewHolder, true, false);
            return;
        }
        viewHolder.j.setText(plan.acquireName());
        viewHolder.f9991a.setText(gzx.b(this.f9977c, i, days, 0));
        b(viewHolder, false, true);
    }

    private void b(ViewHolder viewHolder, boolean z, boolean z2) {
        if (z) {
            viewHolder.i.setVisibility(0);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) viewHolder.i.getLayoutParams();
            layoutParams.weight = 0.0f;
            layoutParams.topMargin = this.f9977c.getResources().getDimensionPixelSize(R.dimen.health_common_32dp);
            viewHolder.i.setLayoutParams(layoutParams);
        } else {
            viewHolder.i.setVisibility(8);
        }
        if (z2) {
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.topMargin = (int) this.f9977c.getResources().getDimension(R.dimen.elementsMarginVerticalM);
            viewHolder.g.setLayoutParams(layoutParams2);
            viewHolder.f9991a.setVisibility(0);
            viewHolder.f9992b.setVisibility(0);
            viewHolder.h.setVisibility(0);
            String accountInfo = LoginInit.getInstance(BaseApplication.b()).getAccountInfo(1014);
            if (accountInfo == null || !accountInfo.equals("RU")) {
                return;
            }
            viewHolder.g.setOrientation(1);
            return;
        }
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.topMargin = (int) this.f9977c.getResources().getDimension(R.dimen.textMarginVertical);
        viewHolder.g.setLayoutParams(layoutParams3);
        viewHolder.f9991a.setVisibility(8);
        viewHolder.f9992b.setVisibility(8);
        viewHolder.h.setVisibility(8);
        this.j = true;
        this.h = false;
    }

    private void b(pdt pdtVar, List<CourseDataBean> list, ViewHolder viewHolder, Plan plan) {
        if (pdtVar.c()) {
            viewHolder.f.setText(this.f9977c.getResources().getText(R.string.IDS_plan_run_today_completed));
            viewHolder.j.setText(plan.acquireName());
            viewHolder.d.setVisibility(8);
            viewHolder.f9993c.setVisibility(8);
            return;
        }
        if (njy.e(list)) {
            LogUtil.e("Suggestion_RunPlanningAdapter", "courseDataBeanList is empty");
            return;
        }
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        for (CourseDataBean courseDataBean : list) {
            if (courseDataBean == null) {
                LogUtil.e("Suggestion_RunPlanningAdapter", "planCourseData is null");
                return;
            } else if (!courseDataBean.a() && courseDataBean.b() == 1) {
                planApi.getWorkoutById(courseDataBean.e(), CommonUtil.a(BaseApplication.b()), Locale.getDefault().getCountry(), new a(viewHolder));
                return;
            }
        }
        for (CourseDataBean courseDataBean2 : list) {
            if (courseDataBean2 == null) {
                LogUtil.e("Suggestion_RunPlanningAdapter", "planCourseData is null");
                return;
            } else if (!courseDataBean2.a() && courseDataBean2.b() == 2) {
                planApi.getWorkoutById(courseDataBean2.e(), CommonUtil.a(BaseApplication.b()), Locale.getDefault().getCountry(), new a(viewHolder));
                viewHolder.d.setVisibility(0);
                viewHolder.f9993c.setVisibility(0);
                viewHolder.d.setText(R.string.IDS_plan_run_continue);
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f9975a.size();
    }

    public void a(List<Plan> list) {
        if (njy.e(list)) {
            LogUtil.j("Suggestion_RunPlanningAdapter", "clearAndAddAll planList is null");
            return;
        }
        this.f9975a.clear();
        this.f9975a.addAll(list);
        notifyDataSetChanged();
        LogUtil.a("Suggestion_RunPlanningAdapter", "clearAndAddAll()");
    }

    public void a(RunPlanRefreshCallback runPlanRefreshCallback) {
        LogUtil.a("Suggestion_RunPlanningAdapter", "RunPlan setDataRefreshCallback");
        this.g = runPlanRefreshCallback;
    }

    class a extends UiCallback<FitWorkout> {
        WeakReference<ViewHolder> e;

        a(ViewHolder viewHolder) {
            this.e = new WeakReference<>(viewHolder);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            LogUtil.e("Suggestion_RunPlanningAdapter", "FitWorkoutUiCallBack errorCode = ", Integer.valueOf(i), ", errorInfo = ", str);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onSuccess(FitWorkout fitWorkout) {
            if (fitWorkout == null) {
                LogUtil.e("Suggestion_RunPlanningAdapter", "FitWorkoutUiCallBack onSuccess data is null.");
            } else {
                LogUtil.a("Suggestion_RunPlanningAdapter", "data = ", fitWorkout.toString());
                RunPlanningAdapter.this.a(this.e, fitWorkout);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(WeakReference<ViewHolder> weakReference, FitWorkout fitWorkout) {
        ViewHolder viewHolder = weakReference.get();
        if (viewHolder == null) {
            LogUtil.e("Suggestion_RunPlanningAdapter", "ViewHolder = null");
            return;
        }
        if (StringUtils.g(fitWorkout.acquireName())) {
            viewHolder.f.setVisibility(8);
        } else if ("Race".equals(fitWorkout.acquireId())) {
            viewHolder.f.setText(R.string.IDS_completion_day);
        } else {
            viewHolder.f.setText(fitWorkout.acquireName());
        }
    }

    public static class b extends BaseHandler {
        @Override // com.huawei.haf.handler.BaseHandler
        public void handleMessageWhenReferenceNotNull(Object obj, Message message) {
        }

        public b(Object obj) {
            super(obj);
        }
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        HealthTextView f9991a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        HealthTextView f9992b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        HealthColumnRelativeLayout f9993c;
        HealthButton d;
        ImageView e;
        HealthTextView f;
        HealthColumnLinearLayout g;
        HealthProgressBar h;
        Space i;
        HealthTextView j;

        ViewHolder(View view) {
            super(view);
            this.e = (ImageView) view.findViewById(R.id.run_planning_bg);
            this.f = (HealthTextView) view.findViewById(R.id.run_planning_name);
            this.j = (HealthTextView) view.findViewById(R.id.description_run_planning);
            this.f9991a = (HealthTextView) view.findViewById(R.id.run_planning_completion);
            this.f9992b = (HealthTextView) view.findViewById(R.id.run_planning_completion_rate);
            this.d = (HealthButton) view.findViewById(R.id.btn_start_training);
            this.h = (HealthProgressBar) view.findViewById(R.id.progressbar_run_planning);
            this.i = (Space) view.findViewById(R.id.space_top);
            this.g = (HealthColumnLinearLayout) view.findViewById(R.id.desc_layout);
            this.f9993c = (HealthColumnRelativeLayout) view.findViewById(R.id.layout_btn);
        }
    }
}

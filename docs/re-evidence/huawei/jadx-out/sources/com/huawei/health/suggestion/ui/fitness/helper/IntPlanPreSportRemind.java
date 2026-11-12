package com.huawei.health.suggestion.ui.fitness.helper;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.basefitnessadvice.model.intplan.IntAction;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.course.api.CourseApi;
import com.huawei.health.plan.api.PlanApi;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.util.JumpUtil;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.btw;
import defpackage.gzl;
import defpackage.gzx;
import defpackage.hvu;
import defpackage.hvv;
import defpackage.ibn;
import defpackage.iec;
import defpackage.iek;
import defpackage.ift;
import defpackage.lmf;
import defpackage.pea;
import defpackage.qqf;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class IntPlanPreSportRemind {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private NoTitleCustomAlertDialog f9312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f9313c;
    private CustomAlertDialog d;
    private boolean e = false;

    public interface Action {
        void execute();
    }

    public IntPlanPreSportRemind(Context context) {
        this.f9313c = context;
    }

    public void c(final String str, final Action action) {
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            LogUtil.j("Suggestion_IntPlanPreSportRemind", "TrainDetail PlanApi is null.");
            c(action);
        } else if (this.e) {
            LogUtil.a("Suggestion_IntPlanPreSportRemind", "planTrainRemindCheck mIsIgnorePlan true");
            c(action);
        } else {
            planApi.e(new UiCallback<IntPlan>() { // from class: com.huawei.health.suggestion.ui.fitness.helper.IntPlanPreSportRemind.5
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str2) {
                    LogUtil.j("Suggestion_IntPlanPreSportRemind", "getCurrentIntPlan : onFailure.");
                    IntPlanPreSportRemind.this.c(action);
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public void onSuccess(IntPlan intPlan) {
                    if (intPlan == null || intPlan.getPlanType().equals(IntPlan.PlanType.FIT_PLAN) || hvu.r(intPlan)) {
                        LogUtil.j("Suggestion_IntPlanPreSportRemind", "Skip check course in plan");
                        IntPlanPreSportRemind.this.c(action);
                        return;
                    }
                    List<IntAction> listB = hvv.b(intPlan);
                    if (listB.size() == 0 || hvu.l(intPlan)) {
                        IntPlanPreSportRemind.this.c(action);
                        return;
                    }
                    for (IntAction intAction : listB) {
                        if (intAction.getActionId() != null && intAction.getActionId().equals(str)) {
                            if (btw.n(intPlan)) {
                                IntPlanPreSportRemind.this.c();
                                return;
                            } else {
                                IntPlanPreSportRemind.this.c(action);
                                return;
                            }
                        }
                    }
                    IntPlanPreSportRemind.this.b(listB, intPlan, action);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.huawei.health.suggestion.ui.fitness.helper.IntPlanPreSportRemind$4, reason: invalid class name */
    public class AnonymousClass4 implements Runnable {
        AnonymousClass4() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (IntPlanPreSportRemind.this.f9312b != null && IntPlanPreSportRemind.this.f9312b.isShowing()) {
                LogUtil.j("Suggestion_IntPlanPreSportRemind", "mPlanUpdateDialog has show.");
                return;
            }
            IntPlanPreSportRemind intPlanPreSportRemind = IntPlanPreSportRemind.this;
            intPlanPreSportRemind.f9312b = new NoTitleCustomAlertDialog.Builder(intPlanPreSportRemind.f9313c).b(R.string.IDS_sug_plan_update_remind).c(R.string.IDS_FitnessAdvice_go_and_see, new View.OnClickListener() { // from class: hjz
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.e.d(view);
                }
            }).c();
            IntPlanPreSportRemind.this.f9312b.setCancelable(false);
            IntPlanPreSportRemind.this.f9312b.show();
        }

        public /* synthetic */ void d(View view) {
            JumpUtil.a(IntPlanPreSportRemind.this.f9313c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        HandlerExecutor.b(new AnonymousClass4());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(List<IntAction> list, final IntPlan intPlan, final Action action) {
        LogUtil.a("Suggestion_IntPlanPreSportRemind", "unfinishedCourseList size:", Integer.valueOf(list.size()));
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<IntAction> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new gzl.a(it.next().getActionId()).c());
        }
        CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        if (courseApi == null) {
            LogUtil.j("Suggestion_IntPlanPreSportRemind", "getCourseList : courseApi is null.");
        } else {
            courseApi.getCourseByIds(arrayList, false, new UiCallback<List<FitWorkout>>() { // from class: com.huawei.health.suggestion.ui.fitness.helper.IntPlanPreSportRemind.1
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str) {
                    LogUtil.j("Suggestion_IntPlanPreSportRemind", "getCourseById : getCourseById onFailure.");
                    IntPlanPreSportRemind.this.c(action);
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public void onSuccess(List<FitWorkout> list2) {
                    LogUtil.a("Suggestion_IntPlanPreSportRemind", "getCourseById : getCourseById onSuccess.");
                    if (list2 == null) {
                        return;
                    }
                    int size = list2.size();
                    LogUtil.a("Suggestion_IntPlanPreSportRemind", "FitWorkout amount:", Integer.valueOf(size));
                    ArrayList arrayList2 = new ArrayList(size);
                    Iterator<FitWorkout> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(pea.d(it2.next()));
                    }
                    IntPlanPreSportRemind.this.a(arrayList2, intPlan, action);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<FitWorkout> list, IntPlan intPlan, final Action action) {
        View viewA;
        CustomAlertDialog customAlertDialog = this.d;
        if (customAlertDialog != null && customAlertDialog.isShowing()) {
            LogUtil.j("Suggestion_IntPlanPreSportRemind", "PlanRemindDialog has show.");
            return;
        }
        HashMap map = new HashMap(1);
        map.put("popup", 1);
        lmf.d().c(this.f9313c, AnalyticsValue.INT_PLAN_1120042.value(), map, 0);
        LinearLayout linearLayout = new LinearLayout(this.f9313c);
        linearLayout.setOrientation(1);
        CustomAlertDialog.Builder builder = new CustomAlertDialog.Builder(this.f9313c);
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                LogUtil.a("Suggestion_IntPlanPreSportRemind", "index ", Integer.valueOf(i), ", get the view of the last course.");
                viewA = a(list.get(i), 1, intPlan);
            } else {
                LogUtil.a("Suggestion_IntPlanPreSportRemind", "index ", Integer.valueOf(i), ", get the view of a course.");
                viewA = a(list.get(i), 0, intPlan);
            }
            linearLayout.addView(viewA);
        }
        builder.d(R.string.sug_remind_existing_course).a(linearLayout).d(R.string.IDS_track_ignore_plans, new DialogInterface.OnClickListener() { // from class: hjw
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                this.d.e(action, dialogInterface, i2);
            }
        });
        CustomAlertDialog customAlertDialogB = builder.b();
        this.d = customAlertDialogB;
        customAlertDialogB.show();
    }

    public /* synthetic */ void e(Action action, DialogInterface dialogInterface, int i) {
        this.e = true;
        CustomAlertDialog customAlertDialog = this.d;
        if (customAlertDialog != null) {
            customAlertDialog.dismiss();
        }
        HashMap map = new HashMap(1);
        map.put("click", 1);
        lmf.d().c(this.f9313c, AnalyticsValue.INT_PLAN_1120043.value(), map, 0);
        c(action);
    }

    private View a(final FitWorkout fitWorkout, int i, final IntPlan intPlan) {
        View viewInflate = LayoutInflater.from(this.f9313c).inflate(R.layout.course_unfinished_card_view, (ViewGroup) null);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.plan_course_item_background);
        if (intPlan.getPlanType() == IntPlan.PlanType.AI_RUN_PLAN) {
            qqf.b(imageView, fitWorkout.acquireMidPicture(), qqf.e, 0, com.huawei.ui.commonui.R.color.common_ui_custom_dialog_transparent_bg);
        } else {
            qqf.b(imageView, fitWorkout.getTopicPreviewPicUrl(), qqf.e, 0, com.huawei.ui.commonui.R.color.common_ui_custom_dialog_transparent_bg);
        }
        HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.course_name);
        String strAcquireName = fitWorkout.acquireName();
        LogUtil.a("Suggestion_IntPlanPreSportRemind", "getUnfinishedCourseView courseName: ", strAcquireName);
        healthTextView.setText(strAcquireName);
        ((HealthTextView) viewInflate.findViewById(R.id.course_difficulty)).setText(gzx.c(this.f9313c, "L[1-4]{1}", iec.c(fitWorkout.acquireDifficulty()), R.style.sug_card_nomsize, R.style.sug_card_nomsize));
        ((HealthTextView) viewInflate.findViewById(R.id.course_time)).setText(iek.b(this.f9313c, fitWorkout.acquireDuration()));
        ((HealthButton) viewInflate.findViewById(R.id.start_training_button)).setOnClickListener(new View.OnClickListener() { // from class: hju
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.c(fitWorkout, intPlan, view);
            }
        });
        if (i == 1) {
            viewInflate.findViewById(R.id.course_item_interval).setVisibility(8);
            return viewInflate;
        }
        viewInflate.findViewById(R.id.course_item_interval).setVisibility(0);
        return viewInflate;
    }

    public /* synthetic */ void c(FitWorkout fitWorkout, IntPlan intPlan, View view) {
        this.d.dismiss();
        if (fitWorkout.isRunModelCourse()) {
            a(fitWorkout, intPlan);
        } else {
            c(fitWorkout, intPlan);
        }
    }

    private void c(FitWorkout fitWorkout, IntPlan intPlan) {
        int iH = btw.h(intPlan);
        int iB = ift.b(Calendar.getInstance().get(7));
        long jE = btw.e(intPlan, iH, iB);
        ibn.c(this.f9313c, fitWorkout, intPlan, jE);
        ReleaseLogUtil.d("Suggestion_IntPlanPreSportRemind", "startFitnessCourse ", Integer.valueOf(iH), " ", Integer.valueOf(iB), Long.valueOf(jE));
    }

    private void a(FitWorkout fitWorkout, IntPlan intPlan) {
        int iH = btw.h(intPlan);
        int iB = ift.b(Calendar.getInstance().get(7));
        long jE = btw.e(intPlan, iH, iB);
        ibn.d(this.f9313c, fitWorkout, intPlan, jE);
        ReleaseLogUtil.d("Suggestion_IntPlanPreSportRemind", "startRunCourse ", Integer.valueOf(iH), " ", Integer.valueOf(iB), Long.valueOf(jE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final Action action) {
        HandlerExecutor.b(new Runnable() { // from class: com.huawei.health.suggestion.ui.fitness.helper.IntPlanPreSportRemind.2
            @Override // java.lang.Runnable
            public void run() {
                Action action2 = action;
                if (action2 != null) {
                    action2.execute();
                }
            }
        });
    }
}

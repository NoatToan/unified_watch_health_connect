package com.huawei.health.suggestion.ui.tabfragments.provider;

import android.content.Context;
import android.os.Message;
import android.view.View;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.basefitnessadvice.model.Plan;
import com.huawei.basefitnessadvice.model.intplan.IntAction;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.health.course.api.CourseApi;
import com.huawei.health.plan.api.PlanApi;
import com.huawei.health.suggestion.FitnessExternalUtils;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.tabfragments.provider.RunPlanProvider;
import com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessPlanProvider;
import com.huawei.health.suggestion.util.ClickEventUtils;
import com.huawei.health.suggestion.util.JumpUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.pluginfitnessadvice.FitnessPackageInfo;
import com.huawei.pluginfitnessadvice.Workout;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import defpackage.btw;
import defpackage.hcg;
import defpackage.hvu;
import defpackage.hvv;
import defpackage.ibn;
import defpackage.njy;
import defpackage.pea;
import defpackage.qpx;
import health.compact.a.Services;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes31.dex */
public class RunPlanProvider extends FitnessPlanProvider {
    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider
    public int getCourseCategory() {
        return 258;
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider
    public int getPageType() {
        return 4;
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider
    public int getType() {
        return 258;
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessPlanProvider, com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider
    public boolean isCustomActive(Context context) {
        return LoginInit.getInstance(context).getIsLogined() && FitnessExternalUtils.d();
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessPlanProvider
    public void updateMyPlans(IntPlan intPlan) {
        ArrayList arrayList = new ArrayList(1);
        if (btw.r(intPlan)) {
            Message messageObtainMessage = this.mHandler.obtainMessage(0);
            arrayList.add(intPlan);
            messageObtainMessage.obj = arrayList;
            this.mHandler.sendMessage(messageObtainMessage);
            return;
        }
        getRecommendedPlanList();
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessPlanProvider
    public void getRecommendedPlanList() {
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            LogUtil.j("Track_Provider_Suggestion_RunPlanProvider", "refreshFitnessPlan, getRecommendPlans : planApi is null.");
        } else {
            planApi.getAllFitnessPackage(-1, new UiCallback<List<FitnessPackageInfo>>() { // from class: com.huawei.health.suggestion.ui.tabfragments.provider.RunPlanProvider.5
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str) {
                    LogUtil.j("Track_Provider_Suggestion_RunPlanProvider", "onFailure errorCode = ", Integer.valueOf(i), " errorInfo = ", str);
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public void onSuccess(List<FitnessPackageInfo> list) {
                    LogUtil.a("Track_Provider_Suggestion_RunPlanProvider", "onSuccess invoke");
                    Message messageObtainMessage = RunPlanProvider.this.mHandler.obtainMessage(1);
                    ArrayList arrayList = new ArrayList();
                    for (FitnessPackageInfo fitnessPackageInfo : list) {
                        if (btw.e(fitnessPackageInfo)) {
                            arrayList.add(fitnessPackageInfo);
                        }
                    }
                    messageObtainMessage.obj = arrayList;
                    RunPlanProvider.this.mHandler.sendMessage(messageObtainMessage);
                }
            });
        }
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessPlanProvider
    public void onClickTitleEvent(Context context) {
        HashMap map = new HashMap();
        map.put("target", Integer.toString(IntPlan.PlanType.AI_RUN_PLAN.getType()));
        JumpUtil.a(context, map);
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessPlanProvider
    public void setMyPlanClickListener(final Context context, final List<IntPlan> list, Map<String, Object> map) {
        map.put("CLICK_EVENT_LISTENER", new OnClickSectionListener() { // from class: com.huawei.health.suggestion.ui.tabfragments.provider.RunPlanProvider.3
            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i, int i2) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(String str) {
                if ("MORE_CLICK_EVENT".equals(str)) {
                    RunPlanProvider.this.onClickTitleEvent(context);
                }
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i) {
                if (njy.e(list, i)) {
                    LogUtil.e("Track_Provider_Suggestion_RunPlanProvider", "position is out of bounds");
                    return;
                }
                IntPlan intPlan = (IntPlan) list.get(i);
                if (intPlan == null) {
                    LogUtil.e("Track_Provider_Suggestion_RunPlanProvider", "workoutPlanInfo is null");
                    return;
                }
                if (hcg.e().d()) {
                    if (intPlan.getCompatiblePlan() == null || !intPlan.getPlanType().equals(IntPlan.PlanType.RUN_PLAN)) {
                        JumpUtil.a(RunPlanProvider.this.mContext);
                        btw.e(intPlan, "2", new int[0]);
                    } else {
                        RunPlanProvider.this.a(intPlan.getCompatiblePlan());
                    }
                }
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i, String str) {
                int i2;
                if (njy.e(list, i)) {
                    return;
                }
                IntPlan intPlan = (IntPlan) list.get(i);
                if (intPlan.getPlanType().equals(IntPlan.PlanType.RUN_PLAN)) {
                    LogUtil.j("Track_Provider_Suggestion_RunPlanProvider", "is old run plan.");
                    RunPlanProvider.this.a(intPlan.getCompatiblePlan());
                    return;
                }
                List<IntAction> listA = hvv.a(intPlan);
                IntAction intAction = null;
                boolean z = false;
                int i3 = 0;
                if (listA.size() > 0) {
                    for (IntAction intAction2 : listA) {
                        i3++;
                        if (intAction2.getPunchFlag() == 0) {
                            intAction = intAction2;
                            break;
                        }
                    }
                    int i4 = i3;
                    z = true;
                    i2 = i4;
                } else {
                    i2 = 0;
                }
                if (hvu.n(intPlan) && str.equals("BUTTON_CLICK_EVENT")) {
                    RunPlanProvider.this.e(intPlan, intAction, z, i2);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final IntPlan intPlan, IntAction intAction, boolean z, final int i) {
        CourseApi courseApi;
        if (this.mIsJump2VipView) {
            ClickEventUtils.c(ClickEventUtils.ClickEventType.JUMP_VIP, null);
            return;
        }
        if (!z && btw.h(intPlan) > 1) {
            JumpUtil.d(1, this.mContext, IntPlan.PlanType.AI_RUN_PLAN.getType(), intPlan.getCompatiblePlan().acquireId());
        } else {
            if (!z || intAction == null || (courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class)) == null) {
                return;
            }
            courseApi.getCourseById(intAction.getActionId(), null, null, new UiCallback<Workout>() { // from class: com.huawei.health.suggestion.ui.tabfragments.provider.RunPlanProvider.4
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i2, String str) {
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public void onSuccess(Workout workout) {
                    FitWorkout fitWorkoutD = pea.d(workout);
                    if (fitWorkoutD == null) {
                        return;
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (fitWorkoutD.isRunModelCourse()) {
                        ibn.d(RunPlanProvider.this.mContext, fitWorkoutD, intPlan, jCurrentTimeMillis, i);
                    } else {
                        ibn.a(RunPlanProvider.this.mContext, fitWorkoutD, intPlan, i, jCurrentTimeMillis);
                    }
                }
            });
        }
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider, com.huawei.health.knit.data.BaseKnitDataProvider
    public String getLogTag() {
        return "Track_Provider_Suggestion_RunPlanProvider";
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider
    public String getSubViewTitle() {
        return BaseApplication.getContext().getResources().getString(R.string.sug_home_my_run_plans);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final Plan plan) {
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(BaseApplication.getActivity());
        builder.b(R.string.IDS_sug_oversea_run_plan_offline);
        builder.a(R.string.sug_dialog_yes, new View.OnClickListener() { // from class: icw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f37500b.e(plan, view);
            }
        });
        builder.c(R.string.IDS_sug_ai_run_plan_finish, new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.tabfragments.provider.RunPlanProvider.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("Track_Provider_Suggestion_RunPlanProvider", "showOfflineDialog start ai run plan");
                RunPlanProvider.this.c(plan);
            }
        });
        final NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        BaseApplication.getActivity().runOnUiThread(new Runnable() { // from class: icu
            @Override // java.lang.Runnable
            public final void run() {
                RunPlanProvider.e(noTitleCustomAlertDialogC);
            }
        });
    }

    public /* synthetic */ void e(Plan plan, View view) {
        LogUtil.a("Track_Provider_Suggestion_RunPlanProvider", "showOfflineDialog ok");
        c(plan);
    }

    public static /* synthetic */ void e(NoTitleCustomAlertDialog noTitleCustomAlertDialog) {
        if (noTitleCustomAlertDialog != null) {
            noTitleCustomAlertDialog.show();
        }
    }

    public void c(Plan plan) {
        if (plan == null) {
            LogUtil.j("Track_Provider_Suggestion_RunPlanProvider", "finishPlan currentPlan is null");
            return;
        }
        String strAcquireId = plan.acquireId();
        if (strAcquireId != null) {
            PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
            if (planApi == null) {
                LogUtil.e("Track_Provider_Suggestion_RunPlanProvider", "finishPlan, getCurrentPlan : planApi is null.");
            } else {
                planApi.setPlanType(0);
                planApi.finishPlan(0, strAcquireId, new UiCallback<String>() { // from class: com.huawei.health.suggestion.ui.tabfragments.provider.RunPlanProvider.2
                    @Override // com.huawei.basefitnessadvice.callback.UiCallback
                    public void onFailure(int i, String str) {
                        LogUtil.e("Track_Provider_Suggestion_RunPlanProvider", "finish  plan failed  ", str);
                        qpx.e(BaseApplication.getActivity(), str);
                    }

                    @Override // com.huawei.basefitnessadvice.callback.UiCallback
                    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                    public void onSuccess(String str) {
                        LogUtil.a("Track_Provider_Suggestion_RunPlanProvider", "finish  plan onSuccess  ", str);
                        RunPlanProvider.this.onClickTitleEvent(BaseApplication.getContext());
                    }
                });
            }
        }
    }
}

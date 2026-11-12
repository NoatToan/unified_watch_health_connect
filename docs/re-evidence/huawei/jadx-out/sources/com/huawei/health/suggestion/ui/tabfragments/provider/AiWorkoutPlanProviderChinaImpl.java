package com.huawei.health.suggestion.ui.tabfragments.provider;

import android.content.Context;
import android.os.Message;
import android.view.View;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.basefitnessadvice.model.intplan.IntAction;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.health.course.api.CourseApi;
import com.huawei.health.plan.api.PlanApi;
import com.huawei.health.sport.utils.SportSupportUtil;
import com.huawei.health.suggestion.FitnessExternalUtils;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessPlanProvider;
import com.huawei.health.suggestion.util.ClickEventUtils;
import com.huawei.health.suggestion.util.JumpUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.pluginfitnessadvice.FitnessPackageInfo;
import com.huawei.pluginfitnessadvice.Workout;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import defpackage.btw;
import defpackage.hcg;
import defpackage.hvu;
import defpackage.hvv;
import defpackage.ibn;
import defpackage.iep;
import defpackage.lmf;
import defpackage.njy;
import defpackage.pea;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes31.dex */
public class AiWorkoutPlanProviderChinaImpl extends FitnessPlanProvider {
    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider
    public int getCourseCategory() {
        return 0;
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider
    public int getPageType() {
        return 10001;
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider
    public int getType() {
        return 10001;
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessPlanProvider, com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider
    public boolean isCustomActive(Context context) {
        return (!FitnessExternalUtils.e() || CommonUtil.ca() || SportSupportUtil.h()) ? false : true;
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessPlanProvider
    public void updateMyPlans(IntPlan intPlan) {
        ArrayList arrayList = new ArrayList(1);
        if (intPlan != null && (intPlan.getPlanType().equals(IntPlan.PlanType.AI_FITNESS_PLAN) || btw.j(intPlan))) {
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
            LogUtil.j(getLogTag(), "refreshFitnessPlan, getRecommendPlans : planApi is null.");
        } else {
            planApi.getAllFitnessPackage(-1, new UiCallback<List<FitnessPackageInfo>>() { // from class: com.huawei.health.suggestion.ui.tabfragments.provider.AiWorkoutPlanProviderChinaImpl.3
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str) {
                    LogUtil.j(AiWorkoutPlanProviderChinaImpl.this.getLogTag(), "onFailure errorCode = ", Integer.valueOf(i), " errorInfo = ", str);
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public void onSuccess(List<FitnessPackageInfo> list) {
                    LogUtil.a(AiWorkoutPlanProviderChinaImpl.this.getLogTag(), "onSuccess invoke");
                    Message messageObtainMessage = AiWorkoutPlanProviderChinaImpl.this.mHandler.obtainMessage(1);
                    ArrayList arrayList = new ArrayList();
                    for (FitnessPackageInfo fitnessPackageInfo : list) {
                        if (fitnessPackageInfo.getPlanType() == IntPlan.PlanType.AI_FITNESS_PLAN.getType() || btw.d(fitnessPackageInfo)) {
                            arrayList.add(fitnessPackageInfo);
                        }
                    }
                    messageObtainMessage.obj = arrayList;
                    AiWorkoutPlanProviderChinaImpl.this.mHandler.sendMessage(messageObtainMessage);
                }
            });
        }
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessPlanProvider
    public void onClickTitleEvent(Context context) {
        HashMap map = new HashMap(2);
        if (FitnessExternalUtils.e()) {
            map.clear();
            map.put("click", 1);
            map.put("type", 3);
            lmf.d().c(this.mContext, AnalyticsValue.INT_PLAN_2030075.value(), map, 0);
            HashMap map2 = new HashMap();
            map2.put("target", Integer.toString(IntPlan.PlanType.FIT_PLAN.getType()));
            JumpUtil.a(context, map2);
        }
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessPlanProvider
    public void setMyPlanClickListener(final Context context, final List<IntPlan> list, Map<String, Object> map) {
        map.put("CLICK_EVENT_LISTENER", new OnClickSectionListener() { // from class: com.huawei.health.suggestion.ui.tabfragments.provider.AiWorkoutPlanProviderChinaImpl.2
            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i, int i2) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(String str) {
                if ("MORE_CLICK_EVENT".equals(str)) {
                    AiWorkoutPlanProviderChinaImpl.this.onClickTitleEvent(context);
                }
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i) {
                if (njy.e(list, i)) {
                    LogUtil.e("Suggestion_CommonWorkoutPlanProvider", "position is out of bounds");
                    return;
                }
                IntPlan intPlan = (IntPlan) list.get(i);
                if (intPlan == null) {
                    LogUtil.e("Suggestion_CommonWorkoutPlanProvider", "workoutPlanInfo is null");
                } else if (hcg.e().d()) {
                    JumpUtil.a(AiWorkoutPlanProviderChinaImpl.this.mContext);
                    btw.e(intPlan, "3", intPlan.getPlanType().equals(IntPlan.PlanType.AI_FITNESS_PLAN) ? new int[]{3, 1, 1} : null);
                }
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i, String str) {
                AiWorkoutPlanProviderChinaImpl.this.a(list, i, str);
            }
        });
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider, com.huawei.health.knit.data.BaseKnitDataProvider
    public String getLogTag() {
        return "Suggestion_CommonWorkoutPlanProvider";
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider
    public String getSubViewTitle() {
        return BaseApplication.getContext().getResources().getString(R.string.IDS_header_fitness_plan);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<IntPlan> list, int i, String str) {
        IntAction next;
        int i2;
        if (njy.e(list, i)) {
            return;
        }
        IntPlan intPlan = list.get(i);
        List<IntAction> listA = hvv.a(intPlan);
        int i3 = 0;
        if (listA.size() > 0) {
            Iterator<IntAction> it = listA.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    i3++;
                }
            } while (next.getPunchFlag() != 0);
            int i4 = i3;
            i3 = 1;
            i2 = i4;
        } else {
            next = null;
            i2 = 0;
        }
        if (hvu.n(intPlan) && str.equals("BUTTON_CLICK_EVENT")) {
            if (this.mIsJump2VipView) {
                ClickEventUtils.c(ClickEventUtils.ClickEventType.JUMP_VIP, null);
                return;
            }
            if (i3 != 0) {
                if (next != null) {
                    e(i2, next, intPlan);
                }
            } else {
                if (this.hasWeight || !intPlan.getPlanType().equals(IntPlan.PlanType.AI_FITNESS_PLAN)) {
                    return;
                }
                iep.a(this.mContext, this.mLastWeight, this.mLastBodyFat);
            }
        }
    }

    private void e(int i, IntAction intAction, IntPlan intPlan) {
        CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        if (courseApi != null) {
            courseApi.getCourseById(intAction.getActionId(), null, null, new b(intPlan, i, this.mContext));
        }
    }

    static class b extends UiCallback<Workout> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<Context> f10064a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f10065c;
        private final IntPlan e;

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
        }

        public b(IntPlan intPlan, int i, Context context) {
            this.e = intPlan;
            this.f10065c = i;
            this.f10064a = new WeakReference<>(context);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Workout workout) {
            Context context = this.f10064a.get();
            if (context == null) {
                LogUtil.j("Suggestion_CommonWorkoutPlanProvider", "WorkoutUiCallback context null");
                return;
            }
            FitWorkout fitWorkoutD = pea.d(workout);
            if (fitWorkoutD == null) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (fitWorkoutD.isRunModelCourse()) {
                ibn.d(context, fitWorkoutD, this.e, jCurrentTimeMillis, this.f10065c);
            } else {
                ibn.a(context, fitWorkoutD, this.e, this.f10065c, jCurrentTimeMillis);
            }
        }
    }
}

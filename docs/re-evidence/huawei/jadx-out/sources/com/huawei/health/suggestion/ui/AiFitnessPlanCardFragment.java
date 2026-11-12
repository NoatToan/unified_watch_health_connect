package com.huawei.health.suggestion.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.plan.api.PlanApi;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.plan.viewholder.IntCurrentPlanViewHolder;
import com.huawei.health.suggestion.ui.plan.viewholder.IntPlanListViewHolder;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.FitnessPackageInfo;
import com.huawei.ui.commonui.base.BaseFragment;
import health.compact.a.Services;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public class AiFitnessPlanCardFragment extends BaseFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LinearLayout f8953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LinearLayout f8954c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f8952a = false;
    private IBaseResponseCallback e = new IBaseResponseCallback() { // from class: heg
        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public final void a(int i, Object obj) {
            this.f36684a.d(i, obj);
        }
    };

    public /* synthetic */ void d(int i, Object obj) {
        LogUtil.a("Suggestion_AiFitnessPlanCard", "user info update.", Boolean.valueOf(isResumed()), Boolean.valueOf(isVisible()));
        if (isVisible()) {
            b();
        }
    }

    public static AiFitnessPlanCardFragment e() {
        return new AiFitnessPlanCardFragment();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (layoutInflater == null) {
            return null;
        }
        View viewInflate = View.inflate(BaseApplication.b(), R.layout.ai_fitness_plan_card, null);
        this.f8953b = (LinearLayout) viewInflate.findViewById(R.id.intplan_recommend);
        this.f8954c = (LinearLayout) viewInflate.findViewById(R.id.intplan_progress);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        UserProfileMgrApi userProfileMgrApi = (UserProfileMgrApi) Services.d("HWUserProfileMgr", UserProfileMgrApi.class);
        if (userProfileMgrApi != null) {
            userProfileMgrApi.registerModifyCallback(this.e);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        LogUtil.a("Suggestion_AiFitnessPlanCard", "onResume.");
        super.onResume();
        this.f8952a = false;
        b();
    }

    private void b() {
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            LogUtil.j("Suggestion_AiFitnessPlanCard", "getCurrentPlan intPlanApi is null.");
        } else {
            planApi.getCurrentIntPlan(new AnonymousClass5());
        }
    }

    /* JADX INFO: renamed from: com.huawei.health.suggestion.ui.AiFitnessPlanCardFragment$5, reason: invalid class name */
    public class AnonymousClass5 extends UiCallback<IntPlan> {
        AnonymousClass5() {
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            LogUtil.e("Suggestion_AiFitnessPlanCard", "getCurrentPlan onFailure");
            HandlerExecutor.b(new Runnable() { // from class: com.huawei.health.suggestion.ui.AiFitnessPlanCardFragment.5.2
                @Override // java.lang.Runnable
                public void run() {
                    AiFitnessPlanCardFragment.this.f8953b.setVisibility(8);
                    AiFitnessPlanCardFragment.this.f8954c.setVisibility(8);
                }
            });
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onSuccess(final IntPlan intPlan) {
            if (AiFitnessPlanCardFragment.this.f8952a) {
                return;
            }
            HandlerExecutor.b(new Runnable() { // from class: hee
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.a(intPlan);
                }
            });
        }

        public /* synthetic */ void a(IntPlan intPlan) {
            if (!AiFitnessPlanCardFragment.this.isResumed() || !AiFitnessPlanCardFragment.this.isVisible()) {
                LogUtil.j("Suggestion_AiFitnessPlanCard", "isResume:", Boolean.valueOf(AiFitnessPlanCardFragment.this.isResumed()), "isVisible:", Boolean.valueOf(AiFitnessPlanCardFragment.this.isVisible()));
            } else {
                if (intPlan != null && intPlan.getPlanType().equals(IntPlan.PlanType.AI_FITNESS_PLAN)) {
                    LogUtil.a("Suggestion_AiFitnessPlanCard", "loadIntPlanProgressLayout.");
                    AiFitnessPlanCardFragment.this.f8953b.setVisibility(8);
                    AiFitnessPlanCardFragment.this.f8954c.setVisibility(0);
                    AiFitnessPlanCardFragment aiFitnessPlanCardFragment = AiFitnessPlanCardFragment.this;
                    aiFitnessPlanCardFragment.a(aiFitnessPlanCardFragment.f8954c, intPlan);
                    return;
                }
                LogUtil.a("Suggestion_AiFitnessPlanCard", "loadIntPlanRecommendLayout.");
                AiFitnessPlanCardFragment.this.f8953b.setVisibility(0);
                AiFitnessPlanCardFragment.this.f8954c.setVisibility(8);
                AiFitnessPlanCardFragment aiFitnessPlanCardFragment2 = AiFitnessPlanCardFragment.this;
                aiFitnessPlanCardFragment2.e(aiFitnessPlanCardFragment2.f8953b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final View view) {
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            LogUtil.j("Suggestion_AiFitnessPlanCard", "loadIntPlanRecommendLayout intPlanApi is null.");
        } else {
            planApi.getAllFitnessPackage(-1, new UiCallback<List<FitnessPackageInfo>>() { // from class: com.huawei.health.suggestion.ui.AiFitnessPlanCardFragment.2
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str) {
                    LogUtil.j("Suggestion_AiFitnessPlanCard", "loadRecommendPlanList onFailure.");
                    AiFitnessPlanCardFragment.this.f8953b.setVisibility(8);
                    AiFitnessPlanCardFragment.this.f8954c.setVisibility(8);
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public void onSuccess(List<FitnessPackageInfo> list) {
                    for (FitnessPackageInfo fitnessPackageInfo : list) {
                        if (fitnessPackageInfo.getPlanType() == IntPlan.PlanType.AI_FITNESS_PLAN.getType() && !AiFitnessPlanCardFragment.this.f8952a) {
                            new IntPlanListViewHolder(view, "weight").init(fitnessPackageInfo);
                            return;
                        }
                    }
                    AiFitnessPlanCardFragment.this.f8953b.setVisibility(8);
                    AiFitnessPlanCardFragment.this.f8954c.setVisibility(8);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(View view, IntPlan intPlan) {
        new IntCurrentPlanViewHolder(view, 1).init(intPlan);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.f8952a = true;
        UserProfileMgrApi userProfileMgrApi = (UserProfileMgrApi) Services.d("HWUserProfileMgr", UserProfileMgrApi.class);
        if (userProfileMgrApi != null) {
            userProfileMgrApi.unRegisterModifyCallback(this.e);
        }
    }
}

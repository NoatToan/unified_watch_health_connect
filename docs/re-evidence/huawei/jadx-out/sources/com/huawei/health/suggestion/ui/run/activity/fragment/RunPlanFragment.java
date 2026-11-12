package com.huawei.health.suggestion.ui.run.activity.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.basefitnessadvice.callback.OnFitnessStatusChangeCallback;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.basefitnessadvice.model.Plan;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.health.plan.api.PlanApi;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.plan.activity.AiPlanActivity;
import com.huawei.health.suggestion.ui.run.adapter.RunPlanningAdapter;
import com.huawei.health.suggestion.ui.run.listener.RunPlanRefreshCallback;
import com.huawei.health.vip.api.VipApi;
import com.huawei.health.vip.api.VipCallback;
import com.huawei.health.vip.datatypes.UserMemberInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import defpackage.btq;
import defpackage.btt;
import defpackage.idy;
import defpackage.ieb;
import defpackage.ien;
import defpackage.irz;
import defpackage.njy;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public class RunPlanFragment extends BaseFragment implements View.OnClickListener, RunPlanRefreshCallback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthCardView f9871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Observer f9872c;
    private Context d;
    private HealthButton e;
    private HealthTextView f;
    private LinearLayout g;
    private HealthSubHeader h;
    private PlanApi i;
    private OnFitnessStatusChangeCallback j;
    private RunPlanningAdapter k;
    private HealthTextView l;
    private RelativeLayout m;
    private HealthRecycleView o;
    private List<Plan> n = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f9870a = false;

    public static RunPlanFragment d() {
        return new RunPlanFragment();
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        this.d = getActivity();
        super.onCreate(bundle);
        CommonUtil.ab(this.d);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.sug_fragment_plan_recommend, viewGroup, false);
        d(viewInflate);
        this.j = new OnFitnessStatusChangeCallback() { // from class: iaa
            @Override // com.huawei.basefitnessadvice.callback.OnFitnessStatusChangeCallback
            public final void onUpdate() {
                this.f37399a.c();
            }
        };
        btq.e().c(this.j, "PLAN_DELETE");
        BaseActivity.setViewSafeRegion(false, viewInflate);
        return viewInflate;
    }

    public /* synthetic */ void c() {
        btt.d().c(new d(this));
    }

    private void d(View view) {
        if (view == null) {
            LogUtil.j("Suggestion_RunPlanFragment", "initLayout view is null.");
            return;
        }
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.plan_recommend_fragment_layout);
        this.g = linearLayout;
        linearLayout.setVisibility(8);
        this.h = (HealthSubHeader) view.findViewById(R.id.plan_title);
        c(view);
        HealthCardView healthCardView = (HealthCardView) view.findViewById(R.id.join_plan_layout);
        this.f9871b = healthCardView;
        healthCardView.setOnClickListener(this);
        HealthButton healthButton = (HealthButton) view.findViewById(R.id.btn_join_training);
        this.e = healthButton;
        healthButton.setOnClickListener(this);
        HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.ai_run_plan_describe);
        this.f = healthTextView;
        healthTextView.setText(ieb.e());
        HealthTextView healthTextView2 = (HealthTextView) view.findViewById(R.id.time_good);
        this.l = healthTextView2;
        healthTextView2.setText(ieb.b());
        this.o = (HealthRecycleView) view.findViewById(R.id.my_plan_recycler_view);
        this.m = (RelativeLayout) view.findViewById(R.id.my_plan_ryt);
        b();
        ien.b(this.d, this.o, false);
        Observer observer = new Observer() { // from class: com.huawei.health.suggestion.ui.run.activity.fragment.RunPlanFragment.5
            @Override // com.huawei.haf.design.pattern.Observer
            public void notify(String str, Object... objArr) {
                if (RunPlanFragment.this.l != null) {
                    LogUtil.a("Suggestion_RunPlanFragment", "notify mTimeGood label", str);
                    RunPlanFragment.this.l.setText(ieb.b());
                }
                if (RunPlanFragment.this.f != null) {
                    RunPlanFragment.this.f.setText(ieb.e());
                }
            }
        };
        this.f9872c = observer;
        ObserverManagerUtil.d(observer, "RUN_PLAN_UPDATE_HELLO_TIME");
    }

    private void c(View view) {
        if (view == null) {
            LogUtil.j("Suggestion_RunPlanFragment", "setPlanTitle view is null");
            return;
        }
        if (LanguageUtil.bb(this.d) || LanguageUtil.bi(this.d)) {
            this.h.setSubHeaderTitleScaleTextSize(0.75f);
        }
        this.g.setVisibility(8);
        this.h.setMoreTextVisibility(0);
        this.h.setSubHeaderBackgroundColor(ContextCompat.getColor(view.getContext(), R.color.common_transparent));
        this.h.setMoreViewClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.run.activity.fragment.RunPlanFragment.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                if (view2 == null) {
                    return;
                }
                if (!qrs.r()) {
                    RunPlanFragment.this.a();
                    Intent intent = new Intent(RunPlanFragment.this.d, (Class<?>) AiPlanActivity.class);
                    intent.putExtra("plantype", 2);
                    RunPlanFragment.this.startActivity(intent);
                    return;
                }
                LogUtil.e("Suggestion_RunPlanFragment", "mRunPlanTitle click too fast");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        HashMap map = new HashMap(2);
        map.put("click", "1");
        map.put("enter", "1");
        idy.b("1120019", map);
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment
    public void initViewTahiti() {
        super.initViewTahiti();
        b();
    }

    private void b() {
        e();
    }

    private void e() {
        ien.d(this.d, this.o, false, false);
        RunPlanningAdapter runPlanningAdapter = new RunPlanningAdapter(this.d, this.n);
        this.k = runPlanningAdapter;
        runPlanningAdapter.a(this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.d);
        linearLayoutManager.setOrientation(1);
        this.o.setLayoutManager(linearLayoutManager);
        this.o.setNestedScrollingEnabled(false);
        this.o.b(false);
        this.o.setAdapter(this.k);
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        btt.d().c(new d(this));
        if (this.f9870a) {
            f();
        }
    }

    private void f() {
        this.f9870a = false;
        VipApi vipApi = (VipApi) Services.d("vip", VipApi.class);
        if (vipApi == null) {
            LogUtil.j("Suggestion_RunPlanFragment", "refreshVipStateData VipApi is null");
        } else {
            vipApi.getVipInfo(new VipCallback() { // from class: com.huawei.health.suggestion.ui.run.activity.fragment.RunPlanFragment.3
                @Override // com.huawei.health.vip.api.VipCallback
                public void onSuccess(Object obj) {
                    if (obj == null) {
                        LogUtil.a("Suggestion_RunPlanFragment", "getVipInfo onSuccess result is null");
                        return;
                    }
                    UserMemberInfo userMemberInfo = obj instanceof UserMemberInfo ? (UserMemberInfo) obj : null;
                    if (userMemberInfo == null || userMemberInfo.getMemberFlag() != 1) {
                        LogUtil.j("Suggestion_RunPlanFragment", "TradeViewApi memberInfo == null or != VipConstants.MEMBER_FLAG_VIP");
                    } else {
                        if (irz.d(userMemberInfo)) {
                            return;
                        }
                        if (RunPlanFragment.this.i != null) {
                            RunPlanFragment.this.i.setNeedUpdateCurrentPlan();
                        }
                        btq.e().e("PLAN_DELETE");
                    }
                }

                @Override // com.huawei.health.vip.api.VipCallback
                public void onFailure(int i, String str) {
                    LogUtil.j("Suggestion_RunPlanFragment", "getVipInfo errorCode=", Integer.valueOf(i), " errMsg=", str);
                }
            });
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        if (this.j != null) {
            btq.e().d(this.j, "PLAN_DELETE");
        }
        ObserverManagerUtil.a(this.f9872c, "RUN_PLAN_UPDATE_HELLO_TIME");
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == null) {
            return;
        }
        if (qrs.r()) {
            LogUtil.e("Suggestion_RunPlanFragment", "click too fast");
            return;
        }
        if (view.getId() == R.id.btn_join_training || view.getId() == R.id.join_plan_layout) {
            a();
            Intent intent = new Intent(this.d, (Class<?>) AiPlanActivity.class);
            intent.putExtra("plantype", 2);
            startActivity(intent);
        }
    }

    @Override // com.huawei.health.suggestion.ui.run.listener.RunPlanRefreshCallback
    public void setRefreshState() {
        this.f9870a = true;
    }

    static class d implements Runnable {
        WeakReference<RunPlanFragment> e;

        d(RunPlanFragment runPlanFragment) {
            this.e = new WeakReference<>(runPlanFragment);
        }

        @Override // java.lang.Runnable
        public void run() {
            RunPlanFragment runPlanFragment = this.e.get();
            if (runPlanFragment == null) {
                LogUtil.j("Suggestion_RunPlanFragment", "GetMyPlanInfoRunnable run fragment is null");
                return;
            }
            if (LoginInit.getInstance(BaseApplication.getContext()).getUsetId() != null) {
                runPlanFragment.i = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
                if (runPlanFragment.i != null) {
                    runPlanFragment.i.e(new e(runPlanFragment));
                    return;
                } else {
                    LogUtil.j("Suggestion_RunPlanFragment", "RunPlanningRunnable run planApi is null.");
                    return;
                }
            }
            LogUtil.j("Suggestion_RunPlanFragment", "RunPlanningRunnable run loginInfo is null.");
        }
    }

    static class e extends UiCallback<IntPlan> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        RunPlanFragment f9876a;
        WeakReference<RunPlanFragment> d;

        e(RunPlanFragment runPlanFragment) {
            WeakReference<RunPlanFragment> weakReference = new WeakReference<>(runPlanFragment);
            this.d = weakReference;
            this.f9876a = weakReference.get();
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            LogUtil.e("Suggestion_RunPlanFragment", "CurrentPlanUiCallback errorCode = ", Integer.valueOf(i), ", errorInfo = ", str);
            RunPlanFragment runPlanFragment = this.f9876a;
            if (runPlanFragment != null) {
                runPlanFragment.i();
            } else {
                LogUtil.e("Suggestion_RunPlanFragment", "mFragment is null.");
            }
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onSuccess(IntPlan intPlan) {
            if (this.f9876a == null) {
                LogUtil.e("Suggestion_RunPlanFragment", "CurrentPlanUiCallback onSuccess mFragment is null.");
                return;
            }
            if (intPlan == null) {
                LogUtil.e("Suggestion_RunPlanFragment", "CurrentPlanUiCallback onSuccess data is null.");
                this.f9876a.i();
                return;
            }
            LogUtil.a("Suggestion_RunPlanFragment", "plan id = ", intPlan.getPlanId());
            this.f9876a.n.clear();
            if ((intPlan.getPlanType().equals(IntPlan.PlanType.AI_RUN_PLAN) || intPlan.getPlanType().equals(IntPlan.PlanType.RUN_PLAN)) && intPlan.getCompatiblePlan() != null) {
                this.f9876a.n.add(intPlan.getCompatiblePlan());
            }
            if (!njy.e(this.f9876a.n)) {
                this.f9876a.j();
            } else {
                LogUtil.e("Suggestion_RunPlanFragment", "CurrentPlanUiCallback onSuccess mRunPlanning is null.");
                this.f9876a.i();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        if (njy.e(this.n)) {
            LogUtil.e("Suggestion_RunPlanFragment", "showRunPlanning mRunPlanning is null.");
            return;
        }
        FragmentActivity activity = getActivity();
        if (activity == null) {
            LogUtil.j("Suggestion_RunPlanFragment", "showRunPlanning activity is null.");
        } else if (this.k == null) {
            LogUtil.j("Suggestion_RunPlanFragment", "showRunPlanning mRunPlanningAdapter is null.");
        } else {
            activity.runOnUiThread(new Runnable() { // from class: com.huawei.health.suggestion.ui.run.activity.fragment.RunPlanFragment.1
                @Override // java.lang.Runnable
                public void run() {
                    RunPlanFragment.this.k.a(RunPlanFragment.this.n);
                    RunPlanFragment.this.g.setVisibility(0);
                    RunPlanFragment.this.m.setVisibility(0);
                    RunPlanFragment.this.f9871b.setVisibility(8);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        if (getActivity() != null) {
            getActivity().runOnUiThread(new Runnable() { // from class: com.huawei.health.suggestion.ui.run.activity.fragment.RunPlanFragment.4
                @Override // java.lang.Runnable
                public void run() {
                    RunPlanFragment.this.l.setText(ieb.b());
                    RunPlanFragment.this.f.setText(ieb.e());
                    RunPlanFragment.this.g.setVisibility(0);
                    RunPlanFragment.this.f9871b.setVisibility(0);
                    RunPlanFragment.this.m.setVisibility(8);
                }
            });
        }
    }
}

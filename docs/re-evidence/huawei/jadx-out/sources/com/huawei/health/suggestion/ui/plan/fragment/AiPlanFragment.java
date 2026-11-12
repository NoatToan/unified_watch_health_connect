package com.huawei.health.suggestion.ui.plan.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.huawei.basefitnessadvice.callback.OnFitnessStatusChangeCallback;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.plan.adapter.PlanTabAdapter;
import com.huawei.health.suggestion.ui.plan.viewmodel.PlanTabDataModel;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.recycleview.HealthLinearLayoutManager;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import defpackage.btq;
import defpackage.ibk;
import defpackage.qpx;
import health.compact.a.CommonUtil;

/* JADX INFO: loaded from: classes9.dex */
public class AiPlanFragment extends BaseFragment {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f9674c;
    public View e;
    private PlanTabDataModel f;
    private HealthRecycleView h;
    private PlanTabAdapter j;
    private HealthButton k;
    private View o;
    private int g = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f9673b = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Observer<ibk> f9672a = new Observer() { // from class: com.huawei.health.suggestion.ui.plan.fragment.AiPlanFragment$$ExternalSyntheticLambda0
        @Override // androidx.lifecycle.Observer
        /* JADX INFO: renamed from: onChanged */
        public final void b(Object obj) {
            this.f9675c.d((ibk) obj);
        }
    };
    private boolean d = true;
    private OnFitnessStatusChangeCallback i = new OnFitnessStatusChangeCallback() { // from class: com.huawei.health.suggestion.ui.plan.fragment.AiPlanFragment.2
        @Override // com.huawei.basefitnessadvice.callback.OnFitnessStatusChangeCallback
        public void onUpdate() {
            AiPlanFragment.this.d = true;
        }
    };

    public static AiPlanFragment a(int i) {
        AiPlanFragment aiPlanFragment = new AiPlanFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("plantype", i);
        aiPlanFragment.setArguments(bundle);
        LogUtil.a("Suggestion_AiPlanFragment", "AiPlanFragment newInstance type = ", Integer.valueOf(i));
        return aiPlanFragment;
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f9674c = getActivity();
        if (arguments != null) {
            this.g = arguments.getInt("plantype");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LogUtil.a("Suggestion_AiPlanFragment", "Enter onCreateView()");
        View viewInflate = layoutInflater.inflate(R.layout.sug_fragment_ai_paln, viewGroup, false);
        this.o = viewInflate;
        d(viewInflate);
        b();
        c();
        BaseActivity.setViewSafeRegion(false, viewInflate);
        btq.e().c(this.i, "PLAN_UPDATE");
        return viewInflate;
    }

    private void d(View view) {
        LogUtil.a("Suggestion_AiPlanFragment", "enter, initView");
        this.f9673b = true;
        this.e = view.findViewById(R.id.loading_layout);
        this.h = (HealthRecycleView) view.findViewById(R.id.plan_recycle_view);
        this.j = new PlanTabAdapter(this.f9674c);
        this.h.setLayoutManager(new HealthLinearLayoutManager(this.f9674c));
        this.h.setAdapter(this.j);
        this.h.setNestedScrollingEnabled(false);
        a();
    }

    private void e() {
        if (this.f9673b) {
            this.f9673b = false;
            this.e.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(ibk ibkVar) {
        if (ibkVar == null) {
            LogUtil.j("Suggestion_AiPlanFragment", "notifyNewItemData itemData is null");
            return;
        }
        LogUtil.a("Suggestion_AiPlanFragment", "notifyNewItemData viewId: ", Integer.valueOf(ibkVar.a()), " viewType: ", Integer.valueOf(ibkVar.b()));
        PlanTabAdapter planTabAdapter = this.j;
        if (planTabAdapter != null) {
            planTabAdapter.e(ibkVar);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        LogUtil.a("Suggestion_AiPlanFragment", BaseDialog.LIFE_CYCLE_ON_RESUME);
        if (!CommonUtil.ab(this.f9674c)) {
            qpx.e(this.f9674c, R.string.sug_haveno_network);
        } else {
            if (this.f == null || !this.d) {
                return;
            }
            d();
        }
    }

    private void d() {
        LogUtil.a("Suggestion_AiPlanFragment", "refreshMyPlanData enter");
        this.f.a(this.g);
        if (!this.f.d(this.g)) {
            this.j.e(0);
        }
        if (this.f.e(this.g)) {
            this.f.c(this.g);
        } else {
            this.j.e(1);
        }
        this.d = false;
    }

    private void a() {
        HealthButton healthButton = (HealthButton) this.o.findViewById(R.id.btn_set_network);
        this.k = healthButton;
        healthButton.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.plan.fragment.AiPlanFragment.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CommonUtil.t(AiPlanFragment.this.f9674c);
            }
        });
    }

    private void b() {
        PlanTabDataModel planTabDataModel = (PlanTabDataModel) new ViewModelProvider(this).get(PlanTabDataModel.class);
        this.f = planTabDataModel;
        planTabDataModel.d(this.f9672a);
    }

    private void c() {
        LogUtil.a("Suggestion_AiPlanFragment", "initData");
        this.f.b(this.g);
        e();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        PlanTabDataModel planTabDataModel = this.f;
        if (planTabDataModel != null) {
            planTabDataModel.d(this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        LogUtil.a("Suggestion_AiPlanFragment", "onDestroyView() enter!");
        if (this.j != null) {
            this.j = null;
            LogUtil.a("Suggestion_AiPlanFragment", "DestroyView unregisterCallback");
            btq.e().d(this.i, "PLAN_UPDATE");
        }
        this.i = null;
        super.onDestroyView();
    }
}

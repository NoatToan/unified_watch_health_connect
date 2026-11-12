package com.huawei.health.suggestion.ui.run.activity.fragment.runplan;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.fragment.app.FragmentActivity;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.run.activity.RunPlanCreateActivity;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.columnlayout.HealthColumnLinearLayout;
import com.huawei.ui.commonui.columnlayout.HealthColumnRelativeLayout;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.numberpicker.HealthNumberPicker;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import defpackage.gzx;
import defpackage.ibe;
import defpackage.ibl;
import defpackage.qrs;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class PlanDurationFragment extends BaseFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f9893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private RelativeLayout f9894b;
    private HealthButton d;
    private HealthColumnLinearLayout f;
    private RunPlanCreateActivity.OnNextPageListener g;
    private ImageView h;
    private HealthNumberPicker i;
    private HealthTextView j;
    private HealthProgressBar o;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<View> f9895c = new ArrayList();
    private List<View> e = new ArrayList();

    public static PlanDurationFragment b() {
        return new PlanDurationFragment();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f9893a = getContext();
        View viewInflate = layoutInflater.inflate(R.layout.sug_frag_set_duration, viewGroup, false);
        e(viewInflate);
        return viewInflate;
    }

    private void e(View view) {
        if (view == null) {
            LogUtil.e("Suggestion_SetPlanDurationFragment", "initView view is null.");
            return;
        }
        HealthColumnRelativeLayout healthColumnRelativeLayout = (HealthColumnRelativeLayout) view.findViewById(R.id.layout_tips);
        this.f9894b = (RelativeLayout) healthColumnRelativeLayout.findViewById(R.id.layout_bubbles);
        this.o = (HealthProgressBar) healthColumnRelativeLayout.findViewById(R.id.tips_image_progress);
        this.h = (ImageView) healthColumnRelativeLayout.findViewById(R.id.tips_image);
        HealthTextView healthTextView = (HealthTextView) healthColumnRelativeLayout.findViewById(R.id.tips_question);
        healthTextView.setText(getString(R.string.IDS_plan_to_continue));
        this.f9895c.add(healthTextView);
        this.f = (HealthColumnLinearLayout) healthColumnRelativeLayout.findViewById(R.id.layout_summary);
        this.j = (HealthTextView) healthColumnRelativeLayout.findViewById(R.id.tips_summary);
        HealthNumberPicker healthNumberPicker = (HealthNumberPicker) view.findViewById(R.id.set_duration_num_picker);
        this.i = healthNumberPicker;
        BaseActivity.setViewSafeRegion(true, healthNumberPicker);
        this.f9895c.add(this.i);
        this.e.add(this.i);
        HealthButton healthButton = (HealthButton) view.findViewById(R.id.sug_btn_next);
        this.d = healthButton;
        this.f9895c.add(healthButton);
        this.e.add(this.d);
        a();
        ibe.a(true, this.f9895c);
        ibl.a(this.f9893a, 60, this.o, this.h);
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (z) {
            LogUtil.a("Suggestion_SetPlanDurationFragment", "isHidden fragment.");
        } else {
            this.f9894b.setVisibility(0);
            ibe.a(true, this.f9895c);
        }
    }

    private void a() {
        ArrayList arrayList = new ArrayList();
        for (int i = 4; i < 17; i++) {
            arrayList.add(gzx.d(R.plurals.IDS_string_plan_week, i, UnitUtil.e(i, 1, 0)));
        }
        this.i.setDisplayedValues((String[]) arrayList.toArray(new String[0]));
        this.i.setMinValue(0);
        this.i.setMaxValue(arrayList.size() - 1);
        this.i.setValue(4);
        this.i.setWrapSelectorWheel(false);
        this.d.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.run.activity.fragment.runplan.PlanDurationFragment.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                FragmentActivity activity = PlanDurationFragment.this.getActivity();
                if (activity != null && !qrs.c(500)) {
                    if (PlanDurationFragment.this.g != null) {
                        PlanDurationFragment.this.g.backLock();
                        ibe.a(false, PlanDurationFragment.this.e);
                        PlanDurationFragment.this.d();
                        ibe.a(PlanDurationFragment.this.f9894b, PlanDurationFragment.this.f, PlanDurationFragment.this.g, true);
                        return;
                    }
                    activity.finish();
                    return;
                }
                LogUtil.j("Suggestion_SetPlanDurationFragment", "mBtnNext onClick activity is null or click too fast.");
            }
        });
    }

    public int c() {
        return this.i.getValue() + 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        this.j.setText(gzx.d(R.plurals.IDS_fitness_plan_week, c(), Integer.valueOf(c())));
    }

    public void b(RunPlanCreateActivity.OnNextPageListener onNextPageListener) {
        this.g = onNextPageListener;
    }
}

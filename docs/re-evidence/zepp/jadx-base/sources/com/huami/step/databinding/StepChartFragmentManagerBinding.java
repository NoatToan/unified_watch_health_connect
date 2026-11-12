package com.huami.step.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.step.R;

/* JADX INFO: loaded from: classes14.dex */
public final class StepChartFragmentManagerBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final FragmentContainerView fragmentContainerChart;

    @NonNull
    public final FragmentContainerView fragmentContainerOther;

    private StepChartFragmentManagerBinding(@NonNull LinearLayout linearLayout, @NonNull FragmentContainerView fragmentContainerView, @NonNull FragmentContainerView fragmentContainerView2) {
        this.a = linearLayout;
        this.fragmentContainerChart = fragmentContainerView;
        this.fragmentContainerOther = fragmentContainerView2;
    }

    @NonNull
    public static StepChartFragmentManagerBinding bind(@NonNull View view) {
        int i = R.id.fragment_container_chart;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
        if (fragmentContainerView != null) {
            i = R.id.fragment_container_other;
            FragmentContainerView fragmentContainerView2 = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
            if (fragmentContainerView2 != null) {
                return new StepChartFragmentManagerBinding((LinearLayout) view, fragmentContainerView, fragmentContainerView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static StepChartFragmentManagerBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static StepChartFragmentManagerBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.step_chart_fragment_manager, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.a;
    }
}

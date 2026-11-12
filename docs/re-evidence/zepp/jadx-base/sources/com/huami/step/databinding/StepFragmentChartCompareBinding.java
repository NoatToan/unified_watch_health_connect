package com.huami.step.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.hmchartui.ui.view.CommonCardView;
import com.huami.step.R;

/* JADX INFO: loaded from: classes14.dex */
public final class StepFragmentChartCompareBinding implements ViewBinding {

    @NonNull
    private final CommonCardView a;

    @NonNull
    public final FragmentContainerView fragmentContainerChartCompare;

    @NonNull
    public final CommonCardView layoutCompare;

    private StepFragmentChartCompareBinding(@NonNull CommonCardView commonCardView, @NonNull FragmentContainerView fragmentContainerView, @NonNull CommonCardView commonCardView2) {
        this.a = commonCardView;
        this.fragmentContainerChartCompare = fragmentContainerView;
        this.layoutCompare = commonCardView2;
    }

    @NonNull
    public static StepFragmentChartCompareBinding bind(@NonNull View view) {
        int i = R.id.fragment_container_chart_compare;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
        if (fragmentContainerView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        }
        CommonCardView commonCardView = (CommonCardView) view;
        return new StepFragmentChartCompareBinding(commonCardView, fragmentContainerView, commonCardView);
    }

    @NonNull
    public static StepFragmentChartCompareBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static StepFragmentChartCompareBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.step_fragment_chart_compare, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CommonCardView getRoot() {
        return this.a;
    }
}

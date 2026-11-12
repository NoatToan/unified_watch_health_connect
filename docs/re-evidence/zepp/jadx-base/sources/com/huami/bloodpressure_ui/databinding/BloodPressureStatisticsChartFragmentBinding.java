package com.huami.bloodpressure_ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.bloodpressure_ui.R;

/* JADX INFO: loaded from: classes6.dex */
public final class BloodPressureStatisticsChartFragmentBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final FrameLayout containerChart;

    @NonNull
    public final FragmentContainerView containerChartInfo;

    @NonNull
    public final ChartEmptyStatuFragmentBinding containerStatus;

    private BloodPressureStatisticsChartFragmentBinding(@NonNull ConstraintLayout constraintLayout, @NonNull FrameLayout frameLayout, @NonNull FragmentContainerView fragmentContainerView, @NonNull ChartEmptyStatuFragmentBinding chartEmptyStatuFragmentBinding) {
        this.a = constraintLayout;
        this.containerChart = frameLayout;
        this.containerChartInfo = fragmentContainerView;
        this.containerStatus = chartEmptyStatuFragmentBinding;
    }

    @NonNull
    public static BloodPressureStatisticsChartFragmentBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        int i = R.id.container_chart;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = R.id.container_chart_info;
            FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
            if (fragmentContainerView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.container_status))) != null) {
                return new BloodPressureStatisticsChartFragmentBinding((ConstraintLayout) view, frameLayout, fragmentContainerView, ChartEmptyStatuFragmentBinding.bind(viewFindChildViewById));
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static BloodPressureStatisticsChartFragmentBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static BloodPressureStatisticsChartFragmentBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.blood_pressure_statistics_chart_fragment, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.a;
    }
}

package com.huami.bloodpressure_ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.bloodpressure_ui.R;
import com.huami.lib.rainbow.ListTile;

/* JADX INFO: loaded from: classes6.dex */
public final class FragmentBloodPressureDayBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final FragmentContainerView containerAnalyse;

    @NonNull
    public final FragmentContainerView containerChart;

    @NonNull
    public final FragmentContainerView containerInfo;

    @NonNull
    public final FragmentContainerView containerResearch;

    @NonNull
    public final ListTile ltvAdd;

    @NonNull
    public final ListTile ltvHistory;

    private FragmentBloodPressureDayBinding(@NonNull ConstraintLayout constraintLayout, @NonNull FragmentContainerView fragmentContainerView, @NonNull FragmentContainerView fragmentContainerView2, @NonNull FragmentContainerView fragmentContainerView3, @NonNull FragmentContainerView fragmentContainerView4, @NonNull ListTile listTile, @NonNull ListTile listTile2) {
        this.a = constraintLayout;
        this.containerAnalyse = fragmentContainerView;
        this.containerChart = fragmentContainerView2;
        this.containerInfo = fragmentContainerView3;
        this.containerResearch = fragmentContainerView4;
        this.ltvAdd = listTile;
        this.ltvHistory = listTile2;
    }

    @NonNull
    public static FragmentBloodPressureDayBinding bind(@NonNull View view) {
        int i = R.id.container_analyse;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
        if (fragmentContainerView != null) {
            i = R.id.container_chart;
            FragmentContainerView fragmentContainerView2 = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
            if (fragmentContainerView2 != null) {
                i = R.id.container_info;
                FragmentContainerView fragmentContainerView3 = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
                if (fragmentContainerView3 != null) {
                    i = R.id.container_research;
                    FragmentContainerView fragmentContainerView4 = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
                    if (fragmentContainerView4 != null) {
                        i = R.id.ltv_add;
                        ListTile listTile = (ListTile) ViewBindings.findChildViewById(view, i);
                        if (listTile != null) {
                            i = R.id.ltv_history;
                            ListTile listTile2 = (ListTile) ViewBindings.findChildViewById(view, i);
                            if (listTile2 != null) {
                                return new FragmentBloodPressureDayBinding((ConstraintLayout) view, fragmentContainerView, fragmentContainerView2, fragmentContainerView3, fragmentContainerView4, listTile, listTile2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentBloodPressureDayBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentBloodPressureDayBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_blood_pressure_day, viewGroup, false);
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

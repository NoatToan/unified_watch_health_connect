package com.huami.heartrate.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.heartrate.R;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: loaded from: classes9.dex */
public final class HeartRateFragmentMeasureListBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final TextView noData;

    @NonNull
    public final RecyclerView rvMeasureHr;

    @NonNull
    public final SmartRefreshLayout smartRefreshLayout;

    private HeartRateFragmentMeasureListBinding(@NonNull ConstraintLayout rootView, @NonNull TextView noData, @NonNull RecyclerView rvMeasureHr, @NonNull SmartRefreshLayout smartRefreshLayout) {
        this.a = rootView;
        this.noData = noData;
        this.rvMeasureHr = rvMeasureHr;
        this.smartRefreshLayout = smartRefreshLayout;
    }

    @NonNull
    public static HeartRateFragmentMeasureListBinding bind(@NonNull View rootView) {
        int i = R.id.no_data;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
        if (textView != null) {
            i = R.id.rvMeasureHr;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, i);
            if (recyclerView != null) {
                i = R.id.smart_refresh_layout;
                SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) ViewBindings.findChildViewById(rootView, i);
                if (smartRefreshLayout != null) {
                    return new HeartRateFragmentMeasureListBinding((ConstraintLayout) rootView, textView, recyclerView, smartRefreshLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static HeartRateFragmentMeasureListBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static HeartRateFragmentMeasureListBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.heart_rate_fragment_measure_list, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.a;
    }
}

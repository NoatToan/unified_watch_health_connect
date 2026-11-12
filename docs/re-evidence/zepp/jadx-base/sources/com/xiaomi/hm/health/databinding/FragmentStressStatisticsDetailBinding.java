package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watch.hmwatchmanager.R;
import com.huami.widget.typeface.TypefaceTextView;

/* JADX INFO: loaded from: classes20.dex */
public final class FragmentStressStatisticsDetailBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final View divider;

    @NonNull
    public final ConstraintLayout head;

    @NonNull
    public final FrameLayout statisticsChart;

    @NonNull
    public final TypefaceTextView time;

    @NonNull
    public final TypefaceTextView value;

    @NonNull
    public final ConstraintLayout valueContainer;

    private FragmentStressStatisticsDetailBinding(@NonNull LinearLayout rootView, @NonNull View divider, @NonNull ConstraintLayout head, @NonNull FrameLayout statisticsChart, @NonNull TypefaceTextView time, @NonNull TypefaceTextView value, @NonNull ConstraintLayout valueContainer) {
        this.a = rootView;
        this.divider = divider;
        this.head = head;
        this.statisticsChart = statisticsChart;
        this.time = time;
        this.value = value;
        this.valueContainer = valueContainer;
    }

    @NonNull
    public static FragmentStressStatisticsDetailBinding bind(@NonNull View rootView) {
        int i = R.id.divider;
        View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.divider);
        if (viewFindChildViewById != null) {
            i = R.id.head;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.head);
            if (constraintLayout != null) {
                i = R.id.statistics_chart;
                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.statistics_chart);
                if (frameLayout != null) {
                    i = R.id.time;
                    TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.time);
                    if (typefaceTextView != null) {
                        i = R.id.value;
                        TypefaceTextView typefaceTextView2 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.value);
                        if (typefaceTextView2 != null) {
                            i = R.id.value_container;
                            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.value_container);
                            if (constraintLayout2 != null) {
                                return new FragmentStressStatisticsDetailBinding((LinearLayout) rootView, viewFindChildViewById, constraintLayout, frameLayout, typefaceTextView, typefaceTextView2, constraintLayout2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentStressStatisticsDetailBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentStressStatisticsDetailBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_stress_statistics_detail, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.a;
    }
}

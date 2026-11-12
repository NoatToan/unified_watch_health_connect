package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watch.hmwatchmanager.R;

/* JADX INFO: loaded from: classes20.dex */
public final class FragmentExerciseChartBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final FrameLayout chartContainer;

    @NonNull
    public final TextView chartMessage;

    private FragmentExerciseChartBinding(@NonNull RelativeLayout rootView, @NonNull FrameLayout chartContainer, @NonNull TextView chartMessage) {
        this.a = rootView;
        this.chartContainer = chartContainer;
        this.chartMessage = chartMessage;
    }

    @NonNull
    public static FragmentExerciseChartBinding bind(@NonNull View rootView) {
        int i = R.id.chart_container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.chart_container);
        if (frameLayout != null) {
            i = R.id.chart_message;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.chart_message);
            if (textView != null) {
                return new FragmentExerciseChartBinding((RelativeLayout) rootView, frameLayout, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentExerciseChartBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentExerciseChartBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_exercise_chart, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.a;
    }
}

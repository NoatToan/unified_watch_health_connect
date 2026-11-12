package com.huami.sleep.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.sleep.R;
import com.huami.sleep.sleepstatefeel.view.SleepStateFeelChart;

/* JADX INFO: loaded from: classes13.dex */
public final class FragmentWeekStateFeelLayoutBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final LinearLayout feelLayout;

    @NonNull
    public final SleepStateFeelChart sleepFeelView;

    @NonNull
    public final SleepStateFeelChart sleepStateView;

    @NonNull
    public final LinearLayout stateLayout;

    private FragmentWeekStateFeelLayoutBinding(@NonNull ConstraintLayout rootView, @NonNull LinearLayout feelLayout, @NonNull SleepStateFeelChart sleepFeelView, @NonNull SleepStateFeelChart sleepStateView, @NonNull LinearLayout stateLayout) {
        this.a = rootView;
        this.feelLayout = feelLayout;
        this.sleepFeelView = sleepFeelView;
        this.sleepStateView = sleepStateView;
        this.stateLayout = stateLayout;
    }

    @NonNull
    public static FragmentWeekStateFeelLayoutBinding bind(@NonNull View rootView) {
        int i = R.id.feelLayout;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, i);
        if (linearLayout != null) {
            i = R.id.sleepFeelView;
            SleepStateFeelChart sleepStateFeelChart = (SleepStateFeelChart) ViewBindings.findChildViewById(rootView, i);
            if (sleepStateFeelChart != null) {
                i = R.id.sleepStateView;
                SleepStateFeelChart sleepStateFeelChart2 = (SleepStateFeelChart) ViewBindings.findChildViewById(rootView, i);
                if (sleepStateFeelChart2 != null) {
                    i = R.id.stateLayout;
                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, i);
                    if (linearLayout2 != null) {
                        return new FragmentWeekStateFeelLayoutBinding((ConstraintLayout) rootView, linearLayout, sleepStateFeelChart, sleepStateFeelChart2, linearLayout2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentWeekStateFeelLayoutBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentWeekStateFeelLayoutBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_week_state_feel_layout, parent, false);
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

package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.huami.watch.hmwatchmanager.R;

/* JADX INFO: loaded from: classes20.dex */
public final class ActivityExerciseHistoryBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final LinearLayout queryByAll;

    @NonNull
    public final LinearLayout queryByMonth;

    @NonNull
    public final LinearLayout queryByWeek;

    @NonNull
    public final LinearLayout queryByYear;

    @NonNull
    public final ViewPager viewPager;

    private ActivityExerciseHistoryBinding(@NonNull LinearLayout rootView, @NonNull LinearLayout queryByAll, @NonNull LinearLayout queryByMonth, @NonNull LinearLayout queryByWeek, @NonNull LinearLayout queryByYear, @NonNull ViewPager viewPager) {
        this.a = rootView;
        this.queryByAll = queryByAll;
        this.queryByMonth = queryByMonth;
        this.queryByWeek = queryByWeek;
        this.queryByYear = queryByYear;
        this.viewPager = viewPager;
    }

    @NonNull
    public static ActivityExerciseHistoryBinding bind(@NonNull View rootView) {
        int i = R.id.query_by_all;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.query_by_all);
        if (linearLayout != null) {
            i = R.id.query_by_month;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.query_by_month);
            if (linearLayout2 != null) {
                i = R.id.query_by_week;
                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.query_by_week);
                if (linearLayout3 != null) {
                    i = R.id.query_by_year;
                    LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.query_by_year);
                    if (linearLayout4 != null) {
                        i = R.id.view_pager;
                        ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(rootView, R.id.view_pager);
                        if (viewPager != null) {
                            return new ActivityExerciseHistoryBinding((LinearLayout) rootView, linearLayout, linearLayout2, linearLayout3, linearLayout4, viewPager);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityExerciseHistoryBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityExerciseHistoryBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_exercise_history, parent, false);
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

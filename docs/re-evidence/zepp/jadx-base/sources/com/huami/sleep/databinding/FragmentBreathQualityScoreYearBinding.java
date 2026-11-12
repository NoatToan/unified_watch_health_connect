package com.huami.sleep.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.sleep.R;
import com.huami.sleep.view.SleepPosCircleView;

/* JADX INFO: loaded from: classes13.dex */
public final class FragmentBreathQualityScoreYearBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final RelativeLayout chartRL;

    @NonNull
    public final TextView emptyTv;

    @NonNull
    public final AppCompatTextView highDayTv;

    @NonNull
    public final AppCompatTextView lowDayTv;

    @NonNull
    public final AppCompatTextView mediumDayTv;

    @NonNull
    public final AppCompatTextView normalDayTv;

    @NonNull
    public final SleepPosCircleView riskChart;

    @NonNull
    public final TextView yearTv;

    private FragmentBreathQualityScoreYearBinding(@NonNull RelativeLayout rootView, @NonNull RelativeLayout chartRL, @NonNull TextView emptyTv, @NonNull AppCompatTextView highDayTv, @NonNull AppCompatTextView lowDayTv, @NonNull AppCompatTextView mediumDayTv, @NonNull AppCompatTextView normalDayTv, @NonNull SleepPosCircleView riskChart, @NonNull TextView yearTv) {
        this.a = rootView;
        this.chartRL = chartRL;
        this.emptyTv = emptyTv;
        this.highDayTv = highDayTv;
        this.lowDayTv = lowDayTv;
        this.mediumDayTv = mediumDayTv;
        this.normalDayTv = normalDayTv;
        this.riskChart = riskChart;
        this.yearTv = yearTv;
    }

    @NonNull
    public static FragmentBreathQualityScoreYearBinding bind(@NonNull View rootView) {
        int i = R.id.chartRL;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, i);
        if (relativeLayout != null) {
            i = R.id.emptyTv;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
            if (textView != null) {
                i = R.id.highDayTv;
                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(rootView, i);
                if (appCompatTextView != null) {
                    i = R.id.lowDayTv;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(rootView, i);
                    if (appCompatTextView2 != null) {
                        i = R.id.mediumDayTv;
                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(rootView, i);
                        if (appCompatTextView3 != null) {
                            i = R.id.normalDayTv;
                            AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(rootView, i);
                            if (appCompatTextView4 != null) {
                                i = R.id.riskChart;
                                SleepPosCircleView sleepPosCircleView = (SleepPosCircleView) ViewBindings.findChildViewById(rootView, i);
                                if (sleepPosCircleView != null) {
                                    i = R.id.yearTv;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                    if (textView2 != null) {
                                        return new FragmentBreathQualityScoreYearBinding((RelativeLayout) rootView, relativeLayout, textView, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4, sleepPosCircleView, textView2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentBreathQualityScoreYearBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentBreathQualityScoreYearBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_breath_quality_score_year, parent, false);
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

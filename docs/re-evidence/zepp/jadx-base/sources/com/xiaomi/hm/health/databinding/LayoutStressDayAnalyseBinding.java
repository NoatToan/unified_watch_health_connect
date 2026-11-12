package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watch.hmwatchmanager.R;
import com.huami.widget.piechart.PieChart;
import com.huami.widget.typeface.TypefaceTextView;
import com.xiaomi.hm.health.training.ui.widget.UpDownTextItem;

/* JADX INFO: loaded from: classes20.dex */
public final class LayoutStressDayAnalyseBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final Guideline centerGuideLine;

    @NonNull
    public final UpDownTextItem dayAvg;

    @NonNull
    public final UpDownTextItem dayMax;

    @NonNull
    public final UpDownTextItem dayMin;

    @NonNull
    public final View divider;

    @NonNull
    public final TypefaceTextView emptyPie;

    @NonNull
    public final PieChart pieChart;

    @NonNull
    public final TypefaceTextView stressTodayAnalysis;

    @NonNull
    public final TypefaceTextView tvStressLevelValueHigh;

    @NonNull
    public final TypefaceTextView tvStressLevelValueMedium;

    @NonNull
    public final TypefaceTextView tvStressLevelValueNormal;

    @NonNull
    public final TypefaceTextView tvStressLevelValueRelax;

    private LayoutStressDayAnalyseBinding(@NonNull ConstraintLayout rootView, @NonNull Guideline centerGuideLine, @NonNull UpDownTextItem dayAvg, @NonNull UpDownTextItem dayMax, @NonNull UpDownTextItem dayMin, @NonNull View divider, @NonNull TypefaceTextView emptyPie, @NonNull PieChart pieChart, @NonNull TypefaceTextView stressTodayAnalysis, @NonNull TypefaceTextView tvStressLevelValueHigh, @NonNull TypefaceTextView tvStressLevelValueMedium, @NonNull TypefaceTextView tvStressLevelValueNormal, @NonNull TypefaceTextView tvStressLevelValueRelax) {
        this.a = rootView;
        this.centerGuideLine = centerGuideLine;
        this.dayAvg = dayAvg;
        this.dayMax = dayMax;
        this.dayMin = dayMin;
        this.divider = divider;
        this.emptyPie = emptyPie;
        this.pieChart = pieChart;
        this.stressTodayAnalysis = stressTodayAnalysis;
        this.tvStressLevelValueHigh = tvStressLevelValueHigh;
        this.tvStressLevelValueMedium = tvStressLevelValueMedium;
        this.tvStressLevelValueNormal = tvStressLevelValueNormal;
        this.tvStressLevelValueRelax = tvStressLevelValueRelax;
    }

    @NonNull
    public static LayoutStressDayAnalyseBinding bind(@NonNull View rootView) {
        int i = R.id.center_guide_line;
        Guideline guideline = (Guideline) ViewBindings.findChildViewById(rootView, R.id.center_guide_line);
        if (guideline != null) {
            i = R.id.day_avg;
            UpDownTextItem upDownTextItem = (UpDownTextItem) ViewBindings.findChildViewById(rootView, R.id.day_avg);
            if (upDownTextItem != null) {
                i = R.id.day_max;
                UpDownTextItem upDownTextItem2 = (UpDownTextItem) ViewBindings.findChildViewById(rootView, R.id.day_max);
                if (upDownTextItem2 != null) {
                    i = R.id.day_min;
                    UpDownTextItem upDownTextItem3 = (UpDownTextItem) ViewBindings.findChildViewById(rootView, R.id.day_min);
                    if (upDownTextItem3 != null) {
                        i = R.id.divider;
                        View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.divider);
                        if (viewFindChildViewById != null) {
                            i = R.id.empty_pie;
                            TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.empty_pie);
                            if (typefaceTextView != null) {
                                i = R.id.pieChart;
                                PieChart pieChart = (PieChart) ViewBindings.findChildViewById(rootView, R.id.pieChart);
                                if (pieChart != null) {
                                    i = R.id.stress_today_analysis;
                                    TypefaceTextView typefaceTextView2 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.stress_today_analysis);
                                    if (typefaceTextView2 != null) {
                                        i = R.id.tv_stress_level_value_high;
                                        TypefaceTextView typefaceTextView3 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.tv_stress_level_value_high);
                                        if (typefaceTextView3 != null) {
                                            i = R.id.tv_stress_level_value_medium;
                                            TypefaceTextView typefaceTextView4 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.tv_stress_level_value_medium);
                                            if (typefaceTextView4 != null) {
                                                i = R.id.tv_stress_level_value_normal;
                                                TypefaceTextView typefaceTextView5 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.tv_stress_level_value_normal);
                                                if (typefaceTextView5 != null) {
                                                    i = R.id.tv_stress_level_value_relax;
                                                    TypefaceTextView typefaceTextView6 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.tv_stress_level_value_relax);
                                                    if (typefaceTextView6 != null) {
                                                        return new LayoutStressDayAnalyseBinding((ConstraintLayout) rootView, guideline, upDownTextItem, upDownTextItem2, upDownTextItem3, viewFindChildViewById, typefaceTextView, pieChart, typefaceTextView2, typefaceTextView3, typefaceTextView4, typefaceTextView5, typefaceTextView6);
                                                    }
                                                }
                                            }
                                        }
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
    public static LayoutStressDayAnalyseBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static LayoutStressDayAnalyseBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.layout_stress_day_analyse, parent, false);
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

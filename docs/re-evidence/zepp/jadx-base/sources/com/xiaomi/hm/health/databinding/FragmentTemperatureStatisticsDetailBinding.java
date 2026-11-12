package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watch.hmwatchmanager.R;
import com.huami.widget.typeface.TypefaceTextView;

/* JADX INFO: loaded from: classes20.dex */
public final class FragmentTemperatureStatisticsDetailBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final FrameLayout chartContainer;

    @NonNull
    public final View divider1;

    @NonNull
    public final View divider2;

    @NonNull
    public final View divider3;

    @NonNull
    public final View dividerLine;

    @NonNull
    public final ConstraintLayout head;

    @NonNull
    public final TypefaceTextView maxTitle;

    @NonNull
    public final TypefaceTextView minTitle;

    @NonNull
    public final TypefaceTextView normalLogo;

    @NonNull
    public final TypefaceTextView statisticsAvg;

    @NonNull
    public final ConstraintLayout statisticsContainer;

    @NonNull
    public final TypefaceTextView statisticsMax;

    @NonNull
    public final TypefaceTextView statisticsMin;

    @NonNull
    public final TypefaceTextView statisticsTitle;

    @NonNull
    public final TypefaceTextView time;

    @NonNull
    public final TypefaceTextView unit;

    @NonNull
    public final TypefaceTextView value;

    @NonNull
    public final ConstraintLayout valueContainer;

    private FragmentTemperatureStatisticsDetailBinding(@NonNull ConstraintLayout rootView, @NonNull FrameLayout chartContainer, @NonNull View divider1, @NonNull View divider2, @NonNull View divider3, @NonNull View dividerLine, @NonNull ConstraintLayout head, @NonNull TypefaceTextView maxTitle, @NonNull TypefaceTextView minTitle, @NonNull TypefaceTextView normalLogo, @NonNull TypefaceTextView statisticsAvg, @NonNull ConstraintLayout statisticsContainer, @NonNull TypefaceTextView statisticsMax, @NonNull TypefaceTextView statisticsMin, @NonNull TypefaceTextView statisticsTitle, @NonNull TypefaceTextView time, @NonNull TypefaceTextView unit, @NonNull TypefaceTextView value, @NonNull ConstraintLayout valueContainer) {
        this.a = rootView;
        this.chartContainer = chartContainer;
        this.divider1 = divider1;
        this.divider2 = divider2;
        this.divider3 = divider3;
        this.dividerLine = dividerLine;
        this.head = head;
        this.maxTitle = maxTitle;
        this.minTitle = minTitle;
        this.normalLogo = normalLogo;
        this.statisticsAvg = statisticsAvg;
        this.statisticsContainer = statisticsContainer;
        this.statisticsMax = statisticsMax;
        this.statisticsMin = statisticsMin;
        this.statisticsTitle = statisticsTitle;
        this.time = time;
        this.unit = unit;
        this.value = value;
        this.valueContainer = valueContainer;
    }

    @NonNull
    public static FragmentTemperatureStatisticsDetailBinding bind(@NonNull View rootView) {
        int i = R.id.chart_container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.chart_container);
        if (frameLayout != null) {
            i = R.id.divider_1;
            View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.divider_1);
            if (viewFindChildViewById != null) {
                i = R.id.divider_2;
                View viewFindChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.divider_2);
                if (viewFindChildViewById2 != null) {
                    i = R.id.divider_3;
                    View viewFindChildViewById3 = ViewBindings.findChildViewById(rootView, R.id.divider_3);
                    if (viewFindChildViewById3 != null) {
                        i = R.id.divider_line;
                        View viewFindChildViewById4 = ViewBindings.findChildViewById(rootView, R.id.divider_line);
                        if (viewFindChildViewById4 != null) {
                            i = R.id.head;
                            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.head);
                            if (constraintLayout != null) {
                                i = R.id.max_title;
                                TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.max_title);
                                if (typefaceTextView != null) {
                                    i = R.id.min_title;
                                    TypefaceTextView typefaceTextView2 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.min_title);
                                    if (typefaceTextView2 != null) {
                                        i = R.id.normal_logo;
                                        TypefaceTextView typefaceTextView3 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.normal_logo);
                                        if (typefaceTextView3 != null) {
                                            i = R.id.statistics_avg;
                                            TypefaceTextView typefaceTextView4 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.statistics_avg);
                                            if (typefaceTextView4 != null) {
                                                i = R.id.statistics_container;
                                                ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.statistics_container);
                                                if (constraintLayout2 != null) {
                                                    i = R.id.statistics_max;
                                                    TypefaceTextView typefaceTextView5 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.statistics_max);
                                                    if (typefaceTextView5 != null) {
                                                        i = R.id.statistics_min;
                                                        TypefaceTextView typefaceTextView6 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.statistics_min);
                                                        if (typefaceTextView6 != null) {
                                                            i = R.id.statistics_title;
                                                            TypefaceTextView typefaceTextView7 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.statistics_title);
                                                            if (typefaceTextView7 != null) {
                                                                i = R.id.time;
                                                                TypefaceTextView typefaceTextView8 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.time);
                                                                if (typefaceTextView8 != null) {
                                                                    i = R.id.unit;
                                                                    TypefaceTextView typefaceTextView9 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.unit);
                                                                    if (typefaceTextView9 != null) {
                                                                        i = R.id.value;
                                                                        TypefaceTextView typefaceTextView10 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.value);
                                                                        if (typefaceTextView10 != null) {
                                                                            i = R.id.value_container;
                                                                            ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.value_container);
                                                                            if (constraintLayout3 != null) {
                                                                                return new FragmentTemperatureStatisticsDetailBinding((ConstraintLayout) rootView, frameLayout, viewFindChildViewById, viewFindChildViewById2, viewFindChildViewById3, viewFindChildViewById4, constraintLayout, typefaceTextView, typefaceTextView2, typefaceTextView3, typefaceTextView4, constraintLayout2, typefaceTextView5, typefaceTextView6, typefaceTextView7, typefaceTextView8, typefaceTextView9, typefaceTextView10, constraintLayout3);
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
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentTemperatureStatisticsDetailBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentTemperatureStatisticsDetailBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_temperature_statistics_detail, parent, false);
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

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
import com.xiaomi.hm.health.training.ui.widget.UpDownTextItem;

/* JADX INFO: loaded from: classes20.dex */
public final class FragmentTemperatureDailyDetailBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final TypefaceTextView addData;

    @NonNull
    public final FrameLayout chartContainer;

    @NonNull
    public final View dividerLine;

    @NonNull
    public final View dividerLineStatistic;

    @NonNull
    public final ConstraintLayout head;

    @NonNull
    public final TypefaceTextView historyData;

    @NonNull
    public final ConstraintLayout intro;

    @NonNull
    public final TypefaceTextView introContent;

    @NonNull
    public final TypefaceTextView normalLogo;

    @NonNull
    public final UpDownTextItem statisticsAvg;

    @NonNull
    public final UpDownTextItem statisticsMax;

    @NonNull
    public final UpDownTextItem statisticsMin;

    @NonNull
    public final LinearLayout statisticsZone;

    @NonNull
    public final TypefaceTextView time;

    @NonNull
    public final TypefaceTextView title;

    @NonNull
    public final TypefaceTextView unit;

    @NonNull
    public final TypefaceTextView value;

    @NonNull
    public final ConstraintLayout valueContainer;

    private FragmentTemperatureDailyDetailBinding(@NonNull ConstraintLayout rootView, @NonNull TypefaceTextView addData, @NonNull FrameLayout chartContainer, @NonNull View dividerLine, @NonNull View dividerLineStatistic, @NonNull ConstraintLayout head, @NonNull TypefaceTextView historyData, @NonNull ConstraintLayout intro, @NonNull TypefaceTextView introContent, @NonNull TypefaceTextView normalLogo, @NonNull UpDownTextItem statisticsAvg, @NonNull UpDownTextItem statisticsMax, @NonNull UpDownTextItem statisticsMin, @NonNull LinearLayout statisticsZone, @NonNull TypefaceTextView time, @NonNull TypefaceTextView title, @NonNull TypefaceTextView unit, @NonNull TypefaceTextView value, @NonNull ConstraintLayout valueContainer) {
        this.a = rootView;
        this.addData = addData;
        this.chartContainer = chartContainer;
        this.dividerLine = dividerLine;
        this.dividerLineStatistic = dividerLineStatistic;
        this.head = head;
        this.historyData = historyData;
        this.intro = intro;
        this.introContent = introContent;
        this.normalLogo = normalLogo;
        this.statisticsAvg = statisticsAvg;
        this.statisticsMax = statisticsMax;
        this.statisticsMin = statisticsMin;
        this.statisticsZone = statisticsZone;
        this.time = time;
        this.title = title;
        this.unit = unit;
        this.value = value;
        this.valueContainer = valueContainer;
    }

    @NonNull
    public static FragmentTemperatureDailyDetailBinding bind(@NonNull View rootView) {
        int i = R.id.add_data;
        TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.add_data);
        if (typefaceTextView != null) {
            i = R.id.chart_container;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.chart_container);
            if (frameLayout != null) {
                i = R.id.divider_line;
                View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.divider_line);
                if (viewFindChildViewById != null) {
                    i = R.id.divider_line_statistic;
                    View viewFindChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.divider_line_statistic);
                    if (viewFindChildViewById2 != null) {
                        i = R.id.head;
                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.head);
                        if (constraintLayout != null) {
                            i = R.id.history_data;
                            TypefaceTextView typefaceTextView2 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.history_data);
                            if (typefaceTextView2 != null) {
                                i = R.id.intro;
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.intro);
                                if (constraintLayout2 != null) {
                                    i = R.id.intro_content;
                                    TypefaceTextView typefaceTextView3 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.intro_content);
                                    if (typefaceTextView3 != null) {
                                        i = R.id.normal_logo;
                                        TypefaceTextView typefaceTextView4 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.normal_logo);
                                        if (typefaceTextView4 != null) {
                                            i = R.id.statistics_avg;
                                            UpDownTextItem upDownTextItem = (UpDownTextItem) ViewBindings.findChildViewById(rootView, R.id.statistics_avg);
                                            if (upDownTextItem != null) {
                                                i = R.id.statistics_max;
                                                UpDownTextItem upDownTextItem2 = (UpDownTextItem) ViewBindings.findChildViewById(rootView, R.id.statistics_max);
                                                if (upDownTextItem2 != null) {
                                                    i = R.id.statistics_min;
                                                    UpDownTextItem upDownTextItem3 = (UpDownTextItem) ViewBindings.findChildViewById(rootView, R.id.statistics_min);
                                                    if (upDownTextItem3 != null) {
                                                        i = R.id.statistics_zone;
                                                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.statistics_zone);
                                                        if (linearLayout != null) {
                                                            i = R.id.time;
                                                            TypefaceTextView typefaceTextView5 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.time);
                                                            if (typefaceTextView5 != null) {
                                                                i = R.id.title;
                                                                TypefaceTextView typefaceTextView6 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.title);
                                                                if (typefaceTextView6 != null) {
                                                                    i = R.id.unit;
                                                                    TypefaceTextView typefaceTextView7 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.unit);
                                                                    if (typefaceTextView7 != null) {
                                                                        i = R.id.value;
                                                                        TypefaceTextView typefaceTextView8 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.value);
                                                                        if (typefaceTextView8 != null) {
                                                                            i = R.id.value_container;
                                                                            ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.value_container);
                                                                            if (constraintLayout3 != null) {
                                                                                return new FragmentTemperatureDailyDetailBinding((ConstraintLayout) rootView, typefaceTextView, frameLayout, viewFindChildViewById, viewFindChildViewById2, constraintLayout, typefaceTextView2, constraintLayout2, typefaceTextView3, typefaceTextView4, upDownTextItem, upDownTextItem2, upDownTextItem3, linearLayout, typefaceTextView5, typefaceTextView6, typefaceTextView7, typefaceTextView8, constraintLayout3);
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
    public static FragmentTemperatureDailyDetailBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentTemperatureDailyDetailBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_temperature_daily_detail, parent, false);
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

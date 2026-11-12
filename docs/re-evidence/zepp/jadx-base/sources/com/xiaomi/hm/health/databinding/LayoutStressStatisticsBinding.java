package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watch.hmwatchmanager.R;
import com.huami.widget.typeface.TypefaceTextView;
import com.xiaomi.hm.health.training.ui.widget.UpDownTextItem;

/* JADX INFO: loaded from: classes20.dex */
public final class LayoutStressStatisticsBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final View dividerBottom;

    @NonNull
    public final View dividerMiddle;

    @NonNull
    public final View dividerTop;

    @NonNull
    public final UpDownTextItem statisticsAvg;

    @NonNull
    public final UpDownTextItem statisticsMax;

    @NonNull
    public final UpDownTextItem statisticsMin;

    @NonNull
    public final UpDownTextItem statisticsSingleTimes;

    @NonNull
    public final TypefaceTextView statisticsTitle;

    private LayoutStressStatisticsBinding(@NonNull ConstraintLayout rootView, @NonNull View dividerBottom, @NonNull View dividerMiddle, @NonNull View dividerTop, @NonNull UpDownTextItem statisticsAvg, @NonNull UpDownTextItem statisticsMax, @NonNull UpDownTextItem statisticsMin, @NonNull UpDownTextItem statisticsSingleTimes, @NonNull TypefaceTextView statisticsTitle) {
        this.a = rootView;
        this.dividerBottom = dividerBottom;
        this.dividerMiddle = dividerMiddle;
        this.dividerTop = dividerTop;
        this.statisticsAvg = statisticsAvg;
        this.statisticsMax = statisticsMax;
        this.statisticsMin = statisticsMin;
        this.statisticsSingleTimes = statisticsSingleTimes;
        this.statisticsTitle = statisticsTitle;
    }

    @NonNull
    public static LayoutStressStatisticsBinding bind(@NonNull View rootView) {
        int i = R.id.divider_bottom;
        View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.divider_bottom);
        if (viewFindChildViewById != null) {
            i = R.id.divider_middle;
            View viewFindChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.divider_middle);
            if (viewFindChildViewById2 != null) {
                i = R.id.divider_top;
                View viewFindChildViewById3 = ViewBindings.findChildViewById(rootView, R.id.divider_top);
                if (viewFindChildViewById3 != null) {
                    i = R.id.statistics_avg;
                    UpDownTextItem upDownTextItem = (UpDownTextItem) ViewBindings.findChildViewById(rootView, R.id.statistics_avg);
                    if (upDownTextItem != null) {
                        i = R.id.statistics_max;
                        UpDownTextItem upDownTextItem2 = (UpDownTextItem) ViewBindings.findChildViewById(rootView, R.id.statistics_max);
                        if (upDownTextItem2 != null) {
                            i = R.id.statistics_min;
                            UpDownTextItem upDownTextItem3 = (UpDownTextItem) ViewBindings.findChildViewById(rootView, R.id.statistics_min);
                            if (upDownTextItem3 != null) {
                                i = R.id.statistics_single_times;
                                UpDownTextItem upDownTextItem4 = (UpDownTextItem) ViewBindings.findChildViewById(rootView, R.id.statistics_single_times);
                                if (upDownTextItem4 != null) {
                                    i = R.id.statistics_title;
                                    TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.statistics_title);
                                    if (typefaceTextView != null) {
                                        return new LayoutStressStatisticsBinding((ConstraintLayout) rootView, viewFindChildViewById, viewFindChildViewById2, viewFindChildViewById3, upDownTextItem, upDownTextItem2, upDownTextItem3, upDownTextItem4, typefaceTextView);
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
    public static LayoutStressStatisticsBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static LayoutStressStatisticsBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.layout_stress_statistics, parent, false);
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

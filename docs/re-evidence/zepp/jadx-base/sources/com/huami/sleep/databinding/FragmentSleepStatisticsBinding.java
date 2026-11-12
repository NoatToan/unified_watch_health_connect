package com.huami.sleep.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.sleep.R;
import com.huami.sleep.daysleep.quotient.view.SleepQuotientView;
import com.huami.sleep.statistic.breath.BreathQualityViewForYMW;
import com.huami.sleep.view.UnitTextView;
import com.huami.sleep.view.VerticalScrollView;
import com.huami.widget.typeface.TypefaceTextView;

/* JADX INFO: loaded from: classes13.dex */
public final class FragmentSleepStatisticsBinding implements ViewBinding {

    @NonNull
    private final VerticalScrollView a;

    @NonNull
    public final UnitTextView activeDailyAverage;

    @NonNull
    public final View chartBottomLine;

    @NonNull
    public final FrameLayout chartContainer;

    @NonNull
    public final FrameLayout contentLayout;

    @NonNull
    public final TextView noDataView;

    @NonNull
    public final TextView regularTile;

    @NonNull
    public final TextView regularTipTv;

    @NonNull
    public final Space regularTopV;

    @NonNull
    public final BreathQualityViewForYMW sleepBreathYMW;

    @NonNull
    public final SleepQuotientView sleepQuotientInfo;

    @NonNull
    public final FrameLayout sleepRegular;

    @NonNull
    public final LayoutSleepStatisticsChartIntroBinding sleepStatisticsChartIntro;

    @NonNull
    public final TypefaceTextView sleepTime;

    @NonNull
    public final TypefaceTextView sleepTimeLable;

    @NonNull
    public final FrameLayout slpAnalysisContent;

    @NonNull
    public final ConstraintLayout slpRegularLayout;

    @NonNull
    public final LinearLayout tipLayout;

    @NonNull
    public final TextView wakeTv;

    private FragmentSleepStatisticsBinding(@NonNull VerticalScrollView rootView, @NonNull UnitTextView activeDailyAverage, @NonNull View chartBottomLine, @NonNull FrameLayout chartContainer, @NonNull FrameLayout contentLayout, @NonNull TextView noDataView, @NonNull TextView regularTile, @NonNull TextView regularTipTv, @NonNull Space regularTopV, @NonNull BreathQualityViewForYMW sleepBreathYMW, @NonNull SleepQuotientView sleepQuotientInfo, @NonNull FrameLayout sleepRegular, @NonNull LayoutSleepStatisticsChartIntroBinding sleepStatisticsChartIntro, @NonNull TypefaceTextView sleepTime, @NonNull TypefaceTextView sleepTimeLable, @NonNull FrameLayout slpAnalysisContent, @NonNull ConstraintLayout slpRegularLayout, @NonNull LinearLayout tipLayout, @NonNull TextView wakeTv) {
        this.a = rootView;
        this.activeDailyAverage = activeDailyAverage;
        this.chartBottomLine = chartBottomLine;
        this.chartContainer = chartContainer;
        this.contentLayout = contentLayout;
        this.noDataView = noDataView;
        this.regularTile = regularTile;
        this.regularTipTv = regularTipTv;
        this.regularTopV = regularTopV;
        this.sleepBreathYMW = sleepBreathYMW;
        this.sleepQuotientInfo = sleepQuotientInfo;
        this.sleepRegular = sleepRegular;
        this.sleepStatisticsChartIntro = sleepStatisticsChartIntro;
        this.sleepTime = sleepTime;
        this.sleepTimeLable = sleepTimeLable;
        this.slpAnalysisContent = slpAnalysisContent;
        this.slpRegularLayout = slpRegularLayout;
        this.tipLayout = tipLayout;
        this.wakeTv = wakeTv;
    }

    @NonNull
    public static FragmentSleepStatisticsBinding bind(@NonNull View rootView) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i = R.id.active_daily_average;
        UnitTextView unitTextView = (UnitTextView) ViewBindings.findChildViewById(rootView, i);
        if (unitTextView != null && (viewFindChildViewById = ViewBindings.findChildViewById(rootView, (i = R.id.chart_bottom_line))) != null) {
            i = R.id.chart_container;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, i);
            if (frameLayout != null) {
                i = R.id.contentLayout;
                FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(rootView, i);
                if (frameLayout2 != null) {
                    i = R.id.noDataView;
                    TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
                    if (textView != null) {
                        i = R.id.regularTile;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, i);
                        if (textView2 != null) {
                            i = R.id.regularTipTv;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, i);
                            if (textView3 != null) {
                                i = R.id.regularTopV;
                                Space space = (Space) ViewBindings.findChildViewById(rootView, i);
                                if (space != null) {
                                    i = R.id.sleepBreathYMW;
                                    BreathQualityViewForYMW breathQualityViewForYMW = (BreathQualityViewForYMW) ViewBindings.findChildViewById(rootView, i);
                                    if (breathQualityViewForYMW != null) {
                                        i = R.id.sleep_quotient_info;
                                        SleepQuotientView sleepQuotientView = (SleepQuotientView) ViewBindings.findChildViewById(rootView, i);
                                        if (sleepQuotientView != null) {
                                            i = R.id.sleepRegular;
                                            FrameLayout frameLayout3 = (FrameLayout) ViewBindings.findChildViewById(rootView, i);
                                            if (frameLayout3 != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(rootView, (i = R.id.sleep_statistics_chart_intro))) != null) {
                                                LayoutSleepStatisticsChartIntroBinding layoutSleepStatisticsChartIntroBindingBind = LayoutSleepStatisticsChartIntroBinding.bind(viewFindChildViewById2);
                                                i = R.id.sleep_time;
                                                TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(rootView, i);
                                                if (typefaceTextView != null) {
                                                    i = R.id.sleep_time_lable;
                                                    TypefaceTextView typefaceTextView2 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, i);
                                                    if (typefaceTextView2 != null) {
                                                        i = R.id.slpAnalysisContent;
                                                        FrameLayout frameLayout4 = (FrameLayout) ViewBindings.findChildViewById(rootView, i);
                                                        if (frameLayout4 != null) {
                                                            i = R.id.slpRegularLayout;
                                                            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, i);
                                                            if (constraintLayout != null) {
                                                                i = R.id.tipLayout;
                                                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, i);
                                                                if (linearLayout != null) {
                                                                    i = R.id.wakeTv;
                                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                                                    if (textView4 != null) {
                                                                        return new FragmentSleepStatisticsBinding((VerticalScrollView) rootView, unitTextView, viewFindChildViewById, frameLayout, frameLayout2, textView, textView2, textView3, space, breathQualityViewForYMW, sleepQuotientView, frameLayout3, layoutSleepStatisticsChartIntroBindingBind, typefaceTextView, typefaceTextView2, frameLayout4, constraintLayout, linearLayout, textView4);
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
    public static FragmentSleepStatisticsBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentSleepStatisticsBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_sleep_statistics, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public VerticalScrollView getRoot() {
        return this.a;
    }
}

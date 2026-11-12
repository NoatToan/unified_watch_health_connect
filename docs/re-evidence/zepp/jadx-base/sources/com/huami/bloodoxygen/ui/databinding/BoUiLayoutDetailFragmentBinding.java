package com.huami.bloodoxygen.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.bloodoxygen.ui.R;
import com.huami.bloodoxygen.ui.view.BloodOxygenCardView;
import com.huami.bloodoxygen.ui.view.BloodOxygenIntroView;
import com.huami.bloodoxygen.ui.view.BloodOxygenStatisticsView;
import com.huami.bloodoxygen.ui.view.chart.StatisticsBarChart;
import com.huami.widget.typeface.TypefaceTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class BoUiLayoutDetailFragmentBinding implements ViewBinding {

    @NonNull
    private final NestedScrollView a;

    @NonNull
    public final BloodOxygenCardView addData;

    @NonNull
    public final StatisticsBarChart chart;

    @NonNull
    public final TextView date;

    @NonNull
    public final RelativeLayout dateTimeLayout;

    @NonNull
    public final ConstraintLayout head;

    @NonNull
    public final BloodOxygenCardView historyData;

    @NonNull
    public final BloodOxygenIntroView intro;

    @NonNull
    public final ConstraintLayout middle;

    @NonNull
    public final TypefaceTextView rangeEnd;

    @NonNull
    public final TypefaceTextView rangeSign;

    @NonNull
    public final TypefaceTextView rangeStart;

    @NonNull
    public final TextView split;

    @NonNull
    public final BloodOxygenStatisticsView statisticsView;

    @NonNull
    public final TextView timeEnd;

    @NonNull
    public final RelativeLayout timeLayout;

    @NonNull
    public final TextView timeStart;

    @NonNull
    public final ConstraintLayout valueContainer;

    private BoUiLayoutDetailFragmentBinding(@NonNull NestedScrollView nestedScrollView, @NonNull BloodOxygenCardView bloodOxygenCardView, @NonNull StatisticsBarChart statisticsBarChart, @NonNull TextView textView, @NonNull RelativeLayout relativeLayout, @NonNull ConstraintLayout constraintLayout, @NonNull BloodOxygenCardView bloodOxygenCardView2, @NonNull BloodOxygenIntroView bloodOxygenIntroView, @NonNull ConstraintLayout constraintLayout2, @NonNull TypefaceTextView typefaceTextView, @NonNull TypefaceTextView typefaceTextView2, @NonNull TypefaceTextView typefaceTextView3, @NonNull TextView textView2, @NonNull BloodOxygenStatisticsView bloodOxygenStatisticsView, @NonNull TextView textView3, @NonNull RelativeLayout relativeLayout2, @NonNull TextView textView4, @NonNull ConstraintLayout constraintLayout3) {
        this.a = nestedScrollView;
        this.addData = bloodOxygenCardView;
        this.chart = statisticsBarChart;
        this.date = textView;
        this.dateTimeLayout = relativeLayout;
        this.head = constraintLayout;
        this.historyData = bloodOxygenCardView2;
        this.intro = bloodOxygenIntroView;
        this.middle = constraintLayout2;
        this.rangeEnd = typefaceTextView;
        this.rangeSign = typefaceTextView2;
        this.rangeStart = typefaceTextView3;
        this.split = textView2;
        this.statisticsView = bloodOxygenStatisticsView;
        this.timeEnd = textView3;
        this.timeLayout = relativeLayout2;
        this.timeStart = textView4;
        this.valueContainer = constraintLayout3;
    }

    @NonNull
    public static BoUiLayoutDetailFragmentBinding bind(@NonNull View view) {
        int i = R.id.add_data;
        BloodOxygenCardView bloodOxygenCardView = (BloodOxygenCardView) ViewBindings.findChildViewById(view, i);
        if (bloodOxygenCardView != null) {
            i = R.id.chart;
            StatisticsBarChart statisticsBarChart = (StatisticsBarChart) ViewBindings.findChildViewById(view, i);
            if (statisticsBarChart != null) {
                i = R.id.date;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = R.id.date_time_layout;
                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                    if (relativeLayout != null) {
                        i = R.id.head;
                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                        if (constraintLayout != null) {
                            i = R.id.history_data;
                            BloodOxygenCardView bloodOxygenCardView2 = (BloodOxygenCardView) ViewBindings.findChildViewById(view, i);
                            if (bloodOxygenCardView2 != null) {
                                i = R.id.intro;
                                BloodOxygenIntroView bloodOxygenIntroView = (BloodOxygenIntroView) ViewBindings.findChildViewById(view, i);
                                if (bloodOxygenIntroView != null) {
                                    i = R.id.middle;
                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                    if (constraintLayout2 != null) {
                                        i = R.id.range_end;
                                        TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                                        if (typefaceTextView != null) {
                                            i = R.id.range_sign;
                                            TypefaceTextView typefaceTextView2 = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                                            if (typefaceTextView2 != null) {
                                                i = R.id.range_start;
                                                TypefaceTextView typefaceTextView3 = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                                                if (typefaceTextView3 != null) {
                                                    i = R.id.split;
                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView2 != null) {
                                                        i = R.id.statistics_view;
                                                        BloodOxygenStatisticsView bloodOxygenStatisticsView = (BloodOxygenStatisticsView) ViewBindings.findChildViewById(view, i);
                                                        if (bloodOxygenStatisticsView != null) {
                                                            i = R.id.time_end;
                                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                                            if (textView3 != null) {
                                                                i = R.id.time_layout;
                                                                RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                                                if (relativeLayout2 != null) {
                                                                    i = R.id.time_start;
                                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                    if (textView4 != null) {
                                                                        i = R.id.value_container;
                                                                        ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                                        if (constraintLayout3 != null) {
                                                                            return new BoUiLayoutDetailFragmentBinding((NestedScrollView) view, bloodOxygenCardView, statisticsBarChart, textView, relativeLayout, constraintLayout, bloodOxygenCardView2, bloodOxygenIntroView, constraintLayout2, typefaceTextView, typefaceTextView2, typefaceTextView3, textView2, bloodOxygenStatisticsView, textView3, relativeLayout2, textView4, constraintLayout3);
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
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static BoUiLayoutDetailFragmentBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static BoUiLayoutDetailFragmentBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.bo_ui_layout_detail_fragment, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.a;
    }
}

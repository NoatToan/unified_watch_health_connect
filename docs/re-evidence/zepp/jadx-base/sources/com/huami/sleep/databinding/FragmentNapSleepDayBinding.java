package com.huami.sleep.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.sleep.R;
import com.huami.sleep.daysleep.sleepstagechart.ui.view.SleepStageInfoView;
import com.huami.sleep.napsleep.view.SleepDayChartView;
import com.huami.sleep.view.UnitTextView;
import com.huami.widget.typeface.TypefaceTextView;

/* JADX INFO: loaded from: classes13.dex */
public final class FragmentNapSleepDayBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final View belowChartLine;

    @NonNull
    public final View belowTipLine;

    @NonNull
    public final TextView date;

    @NonNull
    public final SleepDayChartView dayChart;

    @NonNull
    public final UnitTextView duration;

    @NonNull
    public final TextView endDate;

    @NonNull
    public final ConstraintLayout head;

    @NonNull
    public final View line;

    @NonNull
    public final TextView napDeepRatio;

    @NonNull
    public final TextView napLightRatio;

    @NonNull
    public final LinearLayout rationLL;

    @NonNull
    public final RecyclerView rcvRecord;

    @NonNull
    public final LinearLayout selectInfoLL;

    @NonNull
    public final SleepStageInfoView sleepDuration;

    @NonNull
    public final ConstraintLayout sleepRecord;

    @NonNull
    public final TypefaceTextView sleepRecordTitle;

    @NonNull
    public final TextView sleepType;

    @NonNull
    public final TextView startDate;

    @NonNull
    public final RelativeLayout timeLayout;

    @NonNull
    public final TypefaceTextView tips1;

    @NonNull
    public final TypefaceTextView tipsTitle;

    private FragmentNapSleepDayBinding(@NonNull ConstraintLayout rootView, @NonNull View belowChartLine, @NonNull View belowTipLine, @NonNull TextView date, @NonNull SleepDayChartView dayChart, @NonNull UnitTextView duration, @NonNull TextView endDate, @NonNull ConstraintLayout head, @NonNull View line, @NonNull TextView napDeepRatio, @NonNull TextView napLightRatio, @NonNull LinearLayout rationLL, @NonNull RecyclerView rcvRecord, @NonNull LinearLayout selectInfoLL, @NonNull SleepStageInfoView sleepDuration, @NonNull ConstraintLayout sleepRecord, @NonNull TypefaceTextView sleepRecordTitle, @NonNull TextView sleepType, @NonNull TextView startDate, @NonNull RelativeLayout timeLayout, @NonNull TypefaceTextView tips1, @NonNull TypefaceTextView tipsTitle) {
        this.a = rootView;
        this.belowChartLine = belowChartLine;
        this.belowTipLine = belowTipLine;
        this.date = date;
        this.dayChart = dayChart;
        this.duration = duration;
        this.endDate = endDate;
        this.head = head;
        this.line = line;
        this.napDeepRatio = napDeepRatio;
        this.napLightRatio = napLightRatio;
        this.rationLL = rationLL;
        this.rcvRecord = rcvRecord;
        this.selectInfoLL = selectInfoLL;
        this.sleepDuration = sleepDuration;
        this.sleepRecord = sleepRecord;
        this.sleepRecordTitle = sleepRecordTitle;
        this.sleepType = sleepType;
        this.startDate = startDate;
        this.timeLayout = timeLayout;
        this.tips1 = tips1;
        this.tipsTitle = tipsTitle;
    }

    @NonNull
    public static FragmentNapSleepDayBinding bind(@NonNull View rootView) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i = R.id.belowChartLine;
        View viewFindChildViewById3 = ViewBindings.findChildViewById(rootView, i);
        if (viewFindChildViewById3 != null && (viewFindChildViewById = ViewBindings.findChildViewById(rootView, (i = R.id.belowTipLine))) != null) {
            i = R.id.date;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
            if (textView != null) {
                i = R.id.day_chart;
                SleepDayChartView sleepDayChartView = (SleepDayChartView) ViewBindings.findChildViewById(rootView, i);
                if (sleepDayChartView != null) {
                    i = R.id.duration;
                    UnitTextView unitTextView = (UnitTextView) ViewBindings.findChildViewById(rootView, i);
                    if (unitTextView != null) {
                        i = R.id.end_date;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, i);
                        if (textView2 != null) {
                            i = R.id.head;
                            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, i);
                            if (constraintLayout != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(rootView, (i = R.id.line))) != null) {
                                i = R.id.nap_deep_ratio;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                if (textView3 != null) {
                                    i = R.id.nap_light_ratio;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                    if (textView4 != null) {
                                        i = R.id.rationLL;
                                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, i);
                                        if (linearLayout != null) {
                                            i = R.id.rcv_record;
                                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, i);
                                            if (recyclerView != null) {
                                                i = R.id.selectInfoLL;
                                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, i);
                                                if (linearLayout2 != null) {
                                                    i = R.id.sleep_duration;
                                                    SleepStageInfoView sleepStageInfoView = (SleepStageInfoView) ViewBindings.findChildViewById(rootView, i);
                                                    if (sleepStageInfoView != null) {
                                                        i = R.id.sleep_record;
                                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, i);
                                                        if (constraintLayout2 != null) {
                                                            i = R.id.sleep_record_title;
                                                            TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(rootView, i);
                                                            if (typefaceTextView != null) {
                                                                i = R.id.sleepType;
                                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                                                if (textView5 != null) {
                                                                    i = R.id.start_date;
                                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                                                    if (textView6 != null) {
                                                                        i = R.id.timeLayout;
                                                                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, i);
                                                                        if (relativeLayout != null) {
                                                                            i = R.id.tips_1;
                                                                            TypefaceTextView typefaceTextView2 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, i);
                                                                            if (typefaceTextView2 != null) {
                                                                                i = R.id.tips_title;
                                                                                TypefaceTextView typefaceTextView3 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, i);
                                                                                if (typefaceTextView3 != null) {
                                                                                    return new FragmentNapSleepDayBinding((ConstraintLayout) rootView, viewFindChildViewById3, viewFindChildViewById, textView, sleepDayChartView, unitTextView, textView2, constraintLayout, viewFindChildViewById2, textView3, textView4, linearLayout, recyclerView, linearLayout2, sleepStageInfoView, constraintLayout2, typefaceTextView, textView5, textView6, relativeLayout, typefaceTextView2, typefaceTextView3);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentNapSleepDayBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentNapSleepDayBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_nap_sleep_day, parent, false);
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

package com.huami.sleep.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.sleep.R;
import com.huami.sleep.daysleep.breath.BreathQualityViewForDay;
import com.huami.sleep.daysleep.breath.BreathQualityViewForDayForeign;
import com.huami.sleep.daysleep.quotient.view.SleepQuotientView;
import com.huami.sleep.view.SleepPosCircleView;
import com.huami.sleep.view.UnitTextView;
import com.huami.sleep.view.VerticalScrollView;
import com.huami.widget.typeface.TypefaceTextView;

/* JADX INFO: loaded from: classes13.dex */
public final class FragmentDaySlpChartBinding implements ViewBinding {

    @NonNull
    private final VerticalScrollView a;

    @NonNull
    public final FrameLayout chartContainer;

    @NonNull
    public final RelativeLayout deepSlpChart;

    @NonNull
    public final View dividerBetweenCompare;

    @NonNull
    public final LinearLayout fragmentSleepDetailPartLawId;

    @NonNull
    public final LinearLayout fragmentSleepDetailPartQaId;

    @NonNull
    public final RelativeLayout intoSlpChart;

    @NonNull
    public final TypefaceTextView napDuration;

    @NonNull
    public final ConstraintLayout napSleep;

    @NonNull
    public final TextView sleepAnalysisMainTv;

    @NonNull
    public final TextView sleepAnalysisSubTv;

    @NonNull
    public final TypefaceTextView sleepAvgHr;

    @NonNull
    public final ImageView sleepBackDot;

    @NonNull
    public final TextView sleepBackName;

    @NonNull
    public final TextView sleepBackTime;

    @NonNull
    public final UnitTextView sleepBestDate;

    @NonNull
    public final BreathQualityViewForDay sleepBreathDay;

    @NonNull
    public final BreathQualityViewForDayForeign sleepBreathDayForeign;

    @NonNull
    public final LinearLayout sleepDetailPartLawBestWorst;

    @NonNull
    public final LinearLayout sleepDetailPartLawCompare;

    @NonNull
    public final TypefaceTextView sleepDetailPartLawDeepTitle;

    @NonNull
    public final TextView sleepDetailPartLawEarlyWakeTitle;

    @NonNull
    public final TextView sleepDetailPartLawLateSleepTitle;

    @NonNull
    public final TextView sleepDetailPartLawSleepTimeTitle;

    @NonNull
    public final ConstraintLayout sleepHrContent;

    @NonNull
    public final ImageView sleepLeftDot;

    @NonNull
    public final TextView sleepLeftName;

    @NonNull
    public final TextView sleepLeftTime;

    @NonNull
    public final TextView sleepMostPos;

    @NonNull
    public final TextView sleepMostPosPercent;

    @NonNull
    public final TextView sleepMostTip;

    @NonNull
    public final TextView sleepMostTipTitle;

    @NonNull
    public final SleepPosCircleView sleepPosChart;

    @NonNull
    public final LinearLayout sleepPosContent;

    @NonNull
    public final ImageView sleepPosImg;

    @NonNull
    public final SleepQuotientView sleepQuotientInfo;

    @NonNull
    public final ImageView sleepRightDot;

    @NonNull
    public final TextView sleepRightName;

    @NonNull
    public final TextView sleepRightTime;

    @NonNull
    public final ImageView sleepStomachDot;

    @NonNull
    public final TextView sleepStomachName;

    @NonNull
    public final TextView sleepStomachTime;

    @NonNull
    public final FrameLayout sleepTonalityViewFrame;

    @NonNull
    public final UnitTextView sleepWorstDate;

    @NonNull
    public final FrameLayout slpBehFeelLayout;

    @NonNull
    public final TextView slpDeepCompare;

    @NonNull
    public final TextView slpIntoCompare;

    @NonNull
    public final ConstraintLayout snoreLayout;

    @NonNull
    public final TypefaceTextView snoreNum;

    @NonNull
    public final ImageView snoreTip;

    @NonNull
    public final TypefaceTextView snoreTitle;

    @NonNull
    public final RelativeLayout stomachRL;

    @NonNull
    public final TextView turnOverTimes;

    private FragmentDaySlpChartBinding(@NonNull VerticalScrollView rootView, @NonNull FrameLayout chartContainer, @NonNull RelativeLayout deepSlpChart, @NonNull View dividerBetweenCompare, @NonNull LinearLayout fragmentSleepDetailPartLawId, @NonNull LinearLayout fragmentSleepDetailPartQaId, @NonNull RelativeLayout intoSlpChart, @NonNull TypefaceTextView napDuration, @NonNull ConstraintLayout napSleep, @NonNull TextView sleepAnalysisMainTv, @NonNull TextView sleepAnalysisSubTv, @NonNull TypefaceTextView sleepAvgHr, @NonNull ImageView sleepBackDot, @NonNull TextView sleepBackName, @NonNull TextView sleepBackTime, @NonNull UnitTextView sleepBestDate, @NonNull BreathQualityViewForDay sleepBreathDay, @NonNull BreathQualityViewForDayForeign sleepBreathDayForeign, @NonNull LinearLayout sleepDetailPartLawBestWorst, @NonNull LinearLayout sleepDetailPartLawCompare, @NonNull TypefaceTextView sleepDetailPartLawDeepTitle, @NonNull TextView sleepDetailPartLawEarlyWakeTitle, @NonNull TextView sleepDetailPartLawLateSleepTitle, @NonNull TextView sleepDetailPartLawSleepTimeTitle, @NonNull ConstraintLayout sleepHrContent, @NonNull ImageView sleepLeftDot, @NonNull TextView sleepLeftName, @NonNull TextView sleepLeftTime, @NonNull TextView sleepMostPos, @NonNull TextView sleepMostPosPercent, @NonNull TextView sleepMostTip, @NonNull TextView sleepMostTipTitle, @NonNull SleepPosCircleView sleepPosChart, @NonNull LinearLayout sleepPosContent, @NonNull ImageView sleepPosImg, @NonNull SleepQuotientView sleepQuotientInfo, @NonNull ImageView sleepRightDot, @NonNull TextView sleepRightName, @NonNull TextView sleepRightTime, @NonNull ImageView sleepStomachDot, @NonNull TextView sleepStomachName, @NonNull TextView sleepStomachTime, @NonNull FrameLayout sleepTonalityViewFrame, @NonNull UnitTextView sleepWorstDate, @NonNull FrameLayout slpBehFeelLayout, @NonNull TextView slpDeepCompare, @NonNull TextView slpIntoCompare, @NonNull ConstraintLayout snoreLayout, @NonNull TypefaceTextView snoreNum, @NonNull ImageView snoreTip, @NonNull TypefaceTextView snoreTitle, @NonNull RelativeLayout stomachRL, @NonNull TextView turnOverTimes) {
        this.a = rootView;
        this.chartContainer = chartContainer;
        this.deepSlpChart = deepSlpChart;
        this.dividerBetweenCompare = dividerBetweenCompare;
        this.fragmentSleepDetailPartLawId = fragmentSleepDetailPartLawId;
        this.fragmentSleepDetailPartQaId = fragmentSleepDetailPartQaId;
        this.intoSlpChart = intoSlpChart;
        this.napDuration = napDuration;
        this.napSleep = napSleep;
        this.sleepAnalysisMainTv = sleepAnalysisMainTv;
        this.sleepAnalysisSubTv = sleepAnalysisSubTv;
        this.sleepAvgHr = sleepAvgHr;
        this.sleepBackDot = sleepBackDot;
        this.sleepBackName = sleepBackName;
        this.sleepBackTime = sleepBackTime;
        this.sleepBestDate = sleepBestDate;
        this.sleepBreathDay = sleepBreathDay;
        this.sleepBreathDayForeign = sleepBreathDayForeign;
        this.sleepDetailPartLawBestWorst = sleepDetailPartLawBestWorst;
        this.sleepDetailPartLawCompare = sleepDetailPartLawCompare;
        this.sleepDetailPartLawDeepTitle = sleepDetailPartLawDeepTitle;
        this.sleepDetailPartLawEarlyWakeTitle = sleepDetailPartLawEarlyWakeTitle;
        this.sleepDetailPartLawLateSleepTitle = sleepDetailPartLawLateSleepTitle;
        this.sleepDetailPartLawSleepTimeTitle = sleepDetailPartLawSleepTimeTitle;
        this.sleepHrContent = sleepHrContent;
        this.sleepLeftDot = sleepLeftDot;
        this.sleepLeftName = sleepLeftName;
        this.sleepLeftTime = sleepLeftTime;
        this.sleepMostPos = sleepMostPos;
        this.sleepMostPosPercent = sleepMostPosPercent;
        this.sleepMostTip = sleepMostTip;
        this.sleepMostTipTitle = sleepMostTipTitle;
        this.sleepPosChart = sleepPosChart;
        this.sleepPosContent = sleepPosContent;
        this.sleepPosImg = sleepPosImg;
        this.sleepQuotientInfo = sleepQuotientInfo;
        this.sleepRightDot = sleepRightDot;
        this.sleepRightName = sleepRightName;
        this.sleepRightTime = sleepRightTime;
        this.sleepStomachDot = sleepStomachDot;
        this.sleepStomachName = sleepStomachName;
        this.sleepStomachTime = sleepStomachTime;
        this.sleepTonalityViewFrame = sleepTonalityViewFrame;
        this.sleepWorstDate = sleepWorstDate;
        this.slpBehFeelLayout = slpBehFeelLayout;
        this.slpDeepCompare = slpDeepCompare;
        this.slpIntoCompare = slpIntoCompare;
        this.snoreLayout = snoreLayout;
        this.snoreNum = snoreNum;
        this.snoreTip = snoreTip;
        this.snoreTitle = snoreTitle;
        this.stomachRL = stomachRL;
        this.turnOverTimes = turnOverTimes;
    }

    @NonNull
    public static FragmentDaySlpChartBinding bind(@NonNull View rootView) {
        View viewFindChildViewById;
        int i = R.id.chart_container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, i);
        if (frameLayout != null) {
            i = R.id.deep_slp_chart;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, i);
            if (relativeLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(rootView, (i = R.id.divider_between_compare))) != null) {
                i = R.id.fragment_sleep_detail_part_law_id;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, i);
                if (linearLayout != null) {
                    i = R.id.fragment_sleep_detail_part_qa_id;
                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, i);
                    if (linearLayout2 != null) {
                        i = R.id.into_slp_chart;
                        RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(rootView, i);
                        if (relativeLayout2 != null) {
                            i = R.id.nap_duration;
                            TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(rootView, i);
                            if (typefaceTextView != null) {
                                i = R.id.nap_sleep;
                                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, i);
                                if (constraintLayout != null) {
                                    i = R.id.sleepAnalysisMainTv;
                                    TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
                                    if (textView != null) {
                                        i = R.id.sleepAnalysisSubTv;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                        if (textView2 != null) {
                                            i = R.id.sleep_avg_hr;
                                            TypefaceTextView typefaceTextView2 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, i);
                                            if (typefaceTextView2 != null) {
                                                i = R.id.sleep_back_dot;
                                                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, i);
                                                if (imageView != null) {
                                                    i = R.id.sleep_back_name;
                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                                    if (textView3 != null) {
                                                        i = R.id.sleep_back_time;
                                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                                        if (textView4 != null) {
                                                            i = R.id.sleep_best_date;
                                                            UnitTextView unitTextView = (UnitTextView) ViewBindings.findChildViewById(rootView, i);
                                                            if (unitTextView != null) {
                                                                i = R.id.sleepBreathDay;
                                                                BreathQualityViewForDay breathQualityViewForDay = (BreathQualityViewForDay) ViewBindings.findChildViewById(rootView, i);
                                                                if (breathQualityViewForDay != null) {
                                                                    i = R.id.sleepBreathDayForeign;
                                                                    BreathQualityViewForDayForeign breathQualityViewForDayForeign = (BreathQualityViewForDayForeign) ViewBindings.findChildViewById(rootView, i);
                                                                    if (breathQualityViewForDayForeign != null) {
                                                                        i = R.id.sleep_detail_part_law_best_worst;
                                                                        LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(rootView, i);
                                                                        if (linearLayout3 != null) {
                                                                            i = R.id.sleep_detail_part_law_compare;
                                                                            LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(rootView, i);
                                                                            if (linearLayout4 != null) {
                                                                                i = R.id.sleep_detail_part_law_deep_title;
                                                                                TypefaceTextView typefaceTextView3 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, i);
                                                                                if (typefaceTextView3 != null) {
                                                                                    i = R.id.sleep_detail_part_law_early_wake_title;
                                                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                                                                    if (textView5 != null) {
                                                                                        i = R.id.sleep_detail_part_law_late_sleep_title;
                                                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                                                                        if (textView6 != null) {
                                                                                            i = R.id.sleep_detail_part_law_sleep_time_title;
                                                                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                                                                            if (textView7 != null) {
                                                                                                i = R.id.sleep_hr_content;
                                                                                                ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, i);
                                                                                                if (constraintLayout2 != null) {
                                                                                                    i = R.id.sleep_left_dot;
                                                                                                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, i);
                                                                                                    if (imageView2 != null) {
                                                                                                        i = R.id.sleep_left_name;
                                                                                                        TextView textView8 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                                                                                        if (textView8 != null) {
                                                                                                            i = R.id.sleep_left_time;
                                                                                                            TextView textView9 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                                                                                            if (textView9 != null) {
                                                                                                                i = R.id.sleep_most_pos;
                                                                                                                TextView textView10 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                                                                                                if (textView10 != null) {
                                                                                                                    i = R.id.sleep_most_pos_percent;
                                                                                                                    TextView textView11 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                                                                                                    if (textView11 != null) {
                                                                                                                        i = R.id.sleep_most_tip;
                                                                                                                        TextView textView12 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                                                                                                        if (textView12 != null) {
                                                                                                                            i = R.id.sleep_most_tip_title;
                                                                                                                            TextView textView13 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                                                                                                            if (textView13 != null) {
                                                                                                                                i = R.id.sleep_pos_chart;
                                                                                                                                SleepPosCircleView sleepPosCircleView = (SleepPosCircleView) ViewBindings.findChildViewById(rootView, i);
                                                                                                                                if (sleepPosCircleView != null) {
                                                                                                                                    i = R.id.sleep_pos_content;
                                                                                                                                    LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(rootView, i);
                                                                                                                                    if (linearLayout5 != null) {
                                                                                                                                        i = R.id.sleep_pos_img;
                                                                                                                                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, i);
                                                                                                                                        if (imageView3 != null) {
                                                                                                                                            i = R.id.sleep_quotient_info;
                                                                                                                                            SleepQuotientView sleepQuotientView = (SleepQuotientView) ViewBindings.findChildViewById(rootView, i);
                                                                                                                                            if (sleepQuotientView != null) {
                                                                                                                                                i = R.id.sleep_right_dot;
                                                                                                                                                ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(rootView, i);
                                                                                                                                                if (imageView4 != null) {
                                                                                                                                                    i = R.id.sleep_right_name;
                                                                                                                                                    TextView textView14 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                                                                                                                                    if (textView14 != null) {
                                                                                                                                                        i = R.id.sleep_right_time;
                                                                                                                                                        TextView textView15 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                                                                                                                                        if (textView15 != null) {
                                                                                                                                                            i = R.id.sleep_stomach_dot;
                                                                                                                                                            ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(rootView, i);
                                                                                                                                                            if (imageView5 != null) {
                                                                                                                                                                i = R.id.sleep_stomach_name;
                                                                                                                                                                TextView textView16 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                                                                                                                                                if (textView16 != null) {
                                                                                                                                                                    i = R.id.sleep_stomach_time;
                                                                                                                                                                    TextView textView17 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                                                                                                                                                    if (textView17 != null) {
                                                                                                                                                                        i = R.id.sleepTonalityViewFrame;
                                                                                                                                                                        FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(rootView, i);
                                                                                                                                                                        if (frameLayout2 != null) {
                                                                                                                                                                            i = R.id.sleep_worst_date;
                                                                                                                                                                            UnitTextView unitTextView2 = (UnitTextView) ViewBindings.findChildViewById(rootView, i);
                                                                                                                                                                            if (unitTextView2 != null) {
                                                                                                                                                                                i = R.id.slp_beh_feel_layout;
                                                                                                                                                                                FrameLayout frameLayout3 = (FrameLayout) ViewBindings.findChildViewById(rootView, i);
                                                                                                                                                                                if (frameLayout3 != null) {
                                                                                                                                                                                    i = R.id.slp_deep_compare;
                                                                                                                                                                                    TextView textView18 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                                                                                                                                                                    if (textView18 != null) {
                                                                                                                                                                                        i = R.id.slp_into_compare;
                                                                                                                                                                                        TextView textView19 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                                                                                                                                                                        if (textView19 != null) {
                                                                                                                                                                                            i = R.id.snoreLayout;
                                                                                                                                                                                            ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, i);
                                                                                                                                                                                            if (constraintLayout3 != null) {
                                                                                                                                                                                                i = R.id.snore_num;
                                                                                                                                                                                                TypefaceTextView typefaceTextView4 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, i);
                                                                                                                                                                                                if (typefaceTextView4 != null) {
                                                                                                                                                                                                    i = R.id.snore_tip;
                                                                                                                                                                                                    ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(rootView, i);
                                                                                                                                                                                                    if (imageView6 != null) {
                                                                                                                                                                                                        i = R.id.snore_title;
                                                                                                                                                                                                        TypefaceTextView typefaceTextView5 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, i);
                                                                                                                                                                                                        if (typefaceTextView5 != null) {
                                                                                                                                                                                                            i = R.id.stomachRL;
                                                                                                                                                                                                            RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(rootView, i);
                                                                                                                                                                                                            if (relativeLayout3 != null) {
                                                                                                                                                                                                                i = R.id.turn_over_times;
                                                                                                                                                                                                                TextView textView20 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                                                                                                                                                                                                if (textView20 != null) {
                                                                                                                                                                                                                    return new FragmentDaySlpChartBinding((VerticalScrollView) rootView, frameLayout, relativeLayout, viewFindChildViewById, linearLayout, linearLayout2, relativeLayout2, typefaceTextView, constraintLayout, textView, textView2, typefaceTextView2, imageView, textView3, textView4, unitTextView, breathQualityViewForDay, breathQualityViewForDayForeign, linearLayout3, linearLayout4, typefaceTextView3, textView5, textView6, textView7, constraintLayout2, imageView2, textView8, textView9, textView10, textView11, textView12, textView13, sleepPosCircleView, linearLayout5, imageView3, sleepQuotientView, imageView4, textView14, textView15, imageView5, textView16, textView17, frameLayout2, unitTextView2, frameLayout3, textView18, textView19, constraintLayout3, typefaceTextView4, imageView6, typefaceTextView5, relativeLayout3, textView20);
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
    public static FragmentDaySlpChartBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentDaySlpChartBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_day_slp_chart, parent, false);
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

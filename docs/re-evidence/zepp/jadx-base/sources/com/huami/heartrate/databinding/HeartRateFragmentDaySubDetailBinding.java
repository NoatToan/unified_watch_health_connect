package com.huami.heartrate.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.heartrate.R;
import com.huami.heartrate.ui.StatisticsView;
import com.huami.heartrate.view.HeartRateSectionView;
import com.huami.widget.colorbar.ColorBarView;
import com.huami.widget.typeface.TypefaceTextView;

/* JADX INFO: loaded from: classes9.dex */
public final class HeartRateFragmentDaySubDetailBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final ConstraintLayout abnormalHeartBeatLayout;

    @NonNull
    public final ConstraintLayout heartRateExplainLayout;

    @NonNull
    public final ConstraintLayout heartRateInfoLayout;

    @NonNull
    public final ConstraintLayout heartRateRestLayout;

    @NonNull
    public final FrameLayout heartRateValuesInfoLayout;

    @NonNull
    public final HeartRateSectionView hrSection;

    @NonNull
    public final TypefaceTextView hrWholeDayRest;

    @NonNull
    public final TextView hrWholeDayRestInfo;

    @NonNull
    public final ColorBarView hrWholeDaySection;

    @NonNull
    public final ConstraintLayout measureResultLayout;

    @NonNull
    public final StatisticsView statisticsView;

    @NonNull
    public final TypefaceTextView textHeartRateRange;

    @NonNull
    public final TypefaceTextView tvAbnormalHeartBeat;

    @NonNull
    public final TextView tvAbnormalHeartBeatInfo;

    @NonNull
    public final TextView tvDeviceSupportDesc;

    @NonNull
    public final TypefaceTextView tvHeartRateExplainTitle;

    @NonNull
    public final TypefaceTextView tvMeasureResultInfo;

    private HeartRateFragmentDaySubDetailBinding(@NonNull ConstraintLayout rootView, @NonNull ConstraintLayout abnormalHeartBeatLayout, @NonNull ConstraintLayout heartRateExplainLayout, @NonNull ConstraintLayout heartRateInfoLayout, @NonNull ConstraintLayout heartRateRestLayout, @NonNull FrameLayout heartRateValuesInfoLayout, @NonNull HeartRateSectionView hrSection, @NonNull TypefaceTextView hrWholeDayRest, @NonNull TextView hrWholeDayRestInfo, @NonNull ColorBarView hrWholeDaySection, @NonNull ConstraintLayout measureResultLayout, @NonNull StatisticsView statisticsView, @NonNull TypefaceTextView textHeartRateRange, @NonNull TypefaceTextView tvAbnormalHeartBeat, @NonNull TextView tvAbnormalHeartBeatInfo, @NonNull TextView tvDeviceSupportDesc, @NonNull TypefaceTextView tvHeartRateExplainTitle, @NonNull TypefaceTextView tvMeasureResultInfo) {
        this.a = rootView;
        this.abnormalHeartBeatLayout = abnormalHeartBeatLayout;
        this.heartRateExplainLayout = heartRateExplainLayout;
        this.heartRateInfoLayout = heartRateInfoLayout;
        this.heartRateRestLayout = heartRateRestLayout;
        this.heartRateValuesInfoLayout = heartRateValuesInfoLayout;
        this.hrSection = hrSection;
        this.hrWholeDayRest = hrWholeDayRest;
        this.hrWholeDayRestInfo = hrWholeDayRestInfo;
        this.hrWholeDaySection = hrWholeDaySection;
        this.measureResultLayout = measureResultLayout;
        this.statisticsView = statisticsView;
        this.textHeartRateRange = textHeartRateRange;
        this.tvAbnormalHeartBeat = tvAbnormalHeartBeat;
        this.tvAbnormalHeartBeatInfo = tvAbnormalHeartBeatInfo;
        this.tvDeviceSupportDesc = tvDeviceSupportDesc;
        this.tvHeartRateExplainTitle = tvHeartRateExplainTitle;
        this.tvMeasureResultInfo = tvMeasureResultInfo;
    }

    @NonNull
    public static HeartRateFragmentDaySubDetailBinding bind(@NonNull View rootView) {
        int i = R.id.abnormalHeartBeatLayout;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, i);
        if (constraintLayout != null) {
            i = R.id.heartRateExplainLayout;
            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, i);
            if (constraintLayout2 != null) {
                i = R.id.heartRateInfoLayout;
                ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, i);
                if (constraintLayout3 != null) {
                    i = R.id.heartRateRestLayout;
                    ConstraintLayout constraintLayout4 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, i);
                    if (constraintLayout4 != null) {
                        i = R.id.heartRateValuesInfoLayout;
                        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, i);
                        if (frameLayout != null) {
                            i = R.id.hr_section;
                            HeartRateSectionView heartRateSectionView = (HeartRateSectionView) ViewBindings.findChildViewById(rootView, i);
                            if (heartRateSectionView != null) {
                                i = R.id.hr_whole_day_rest;
                                TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(rootView, i);
                                if (typefaceTextView != null) {
                                    i = R.id.hr_whole_day_rest_info;
                                    TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
                                    if (textView != null) {
                                        i = R.id.hr_whole_day_section;
                                        ColorBarView colorBarView = (ColorBarView) ViewBindings.findChildViewById(rootView, i);
                                        if (colorBarView != null) {
                                            i = R.id.measureResultLayout;
                                            ConstraintLayout constraintLayout5 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, i);
                                            if (constraintLayout5 != null) {
                                                i = R.id.statisticsView;
                                                StatisticsView statisticsView = (StatisticsView) ViewBindings.findChildViewById(rootView, i);
                                                if (statisticsView != null) {
                                                    i = R.id.textHeartRateRange;
                                                    TypefaceTextView typefaceTextView2 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, i);
                                                    if (typefaceTextView2 != null) {
                                                        i = R.id.tvAbnormalHeartBeat;
                                                        TypefaceTextView typefaceTextView3 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, i);
                                                        if (typefaceTextView3 != null) {
                                                            i = R.id.tvAbnormalHeartBeatInfo;
                                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                                            if (textView2 != null) {
                                                                i = R.id.tvDeviceSupportDesc;
                                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                                                if (textView3 != null) {
                                                                    i = R.id.tvHeartRateExplainTitle;
                                                                    TypefaceTextView typefaceTextView4 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, i);
                                                                    if (typefaceTextView4 != null) {
                                                                        i = R.id.tvMeasureResultInfo;
                                                                        TypefaceTextView typefaceTextView5 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, i);
                                                                        if (typefaceTextView5 != null) {
                                                                            return new HeartRateFragmentDaySubDetailBinding((ConstraintLayout) rootView, constraintLayout, constraintLayout2, constraintLayout3, constraintLayout4, frameLayout, heartRateSectionView, typefaceTextView, textView, colorBarView, constraintLayout5, statisticsView, typefaceTextView2, typefaceTextView3, textView2, textView3, typefaceTextView4, typefaceTextView5);
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
    public static HeartRateFragmentDaySubDetailBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static HeartRateFragmentDaySubDetailBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.heart_rate_fragment_day_sub_detail, parent, false);
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

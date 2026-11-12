package com.huami.moving.sport.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.chart.chart.HMPieChart;
import com.huami.moving.sport.ui.R;

/* JADX INFO: loaded from: classes11.dex */
public final class CardSlopeDistributionBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final TextView lableDownhill;

    @NonNull
    public final TextView lableFlatGround;

    @NonNull
    public final TextView lableUphill;

    @NonNull
    public final Guideline movingUiGuideline;

    @NonNull
    public final TextView slopeDistribution;

    @NonNull
    public final HMPieChart sportSlopeDistribution;

    @NonNull
    public final TextView tvDownhillPercent;

    @NonNull
    public final TextView tvDownhillTime;

    @NonNull
    public final TextView tvFatGroundPercent;

    @NonNull
    public final TextView tvFatGroundTime;

    @NonNull
    public final TextView tvUphillPercent;

    @NonNull
    public final TextView tvUphillTime;

    private CardSlopeDistributionBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull Guideline guideline, @NonNull TextView textView4, @NonNull HMPieChart hMPieChart, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull TextView textView9, @NonNull TextView textView10) {
        this.a = constraintLayout;
        this.lableDownhill = textView;
        this.lableFlatGround = textView2;
        this.lableUphill = textView3;
        this.movingUiGuideline = guideline;
        this.slopeDistribution = textView4;
        this.sportSlopeDistribution = hMPieChart;
        this.tvDownhillPercent = textView5;
        this.tvDownhillTime = textView6;
        this.tvFatGroundPercent = textView7;
        this.tvFatGroundTime = textView8;
        this.tvUphillPercent = textView9;
        this.tvUphillTime = textView10;
    }

    @NonNull
    public static CardSlopeDistributionBinding bind(@NonNull View view) {
        int i = R.id.lable_downhill;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.lable_flat_ground;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null) {
                i = R.id.lable_uphill;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView3 != null) {
                    i = R.id.moving_ui_guideline;
                    Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
                    if (guideline != null) {
                        i = R.id.slope_distribution;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView4 != null) {
                            i = R.id.sport_slope_distribution;
                            HMPieChart hMPieChart = (HMPieChart) ViewBindings.findChildViewById(view, i);
                            if (hMPieChart != null) {
                                i = R.id.tv_downhill_percent;
                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView5 != null) {
                                    i = R.id.tv_downhill_time;
                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView6 != null) {
                                        i = R.id.tv_fat_ground_percent;
                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView7 != null) {
                                            i = R.id.tv_fat_ground_time;
                                            TextView textView8 = (TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView8 != null) {
                                                i = R.id.tv_uphill_percent;
                                                TextView textView9 = (TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView9 != null) {
                                                    i = R.id.tv_uphill_time;
                                                    TextView textView10 = (TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView10 != null) {
                                                        return new CardSlopeDistributionBinding((ConstraintLayout) view, textView, textView2, textView3, guideline, textView4, hMPieChart, textView5, textView6, textView7, textView8, textView9, textView10);
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
    public static CardSlopeDistributionBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static CardSlopeDistributionBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.card_slope_distribution, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.a;
    }
}

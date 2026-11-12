package com.huami.moving.sport.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.chart.chart.HMSpeedDialChart;
import com.huami.moving.sport.ui.R;

/* JADX INFO: loaded from: classes11.dex */
public final class MovingUiCardTrainingEffectBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final HMSpeedDialChart chartAerobic;

    @NonNull
    public final HMSpeedDialChart chartAnaerobic;

    @NonNull
    public final TextView line;

    @NonNull
    public final TextView trainingEffect;

    @NonNull
    public final TextView tvAerobic;

    @NonNull
    public final TextView tvAerobicScore;

    @NonNull
    public final TextView tvAerobicState;

    @NonNull
    public final TextView tvAnaerobic;

    @NonNull
    public final TextView tvAnaerobicScore;

    @NonNull
    public final TextView tvAnaerobicState;

    private MovingUiCardTrainingEffectBinding(@NonNull ConstraintLayout constraintLayout, @NonNull HMSpeedDialChart hMSpeedDialChart, @NonNull HMSpeedDialChart hMSpeedDialChart2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8) {
        this.a = constraintLayout;
        this.chartAerobic = hMSpeedDialChart;
        this.chartAnaerobic = hMSpeedDialChart2;
        this.line = textView;
        this.trainingEffect = textView2;
        this.tvAerobic = textView3;
        this.tvAerobicScore = textView4;
        this.tvAerobicState = textView5;
        this.tvAnaerobic = textView6;
        this.tvAnaerobicScore = textView7;
        this.tvAnaerobicState = textView8;
    }

    @NonNull
    public static MovingUiCardTrainingEffectBinding bind(@NonNull View view) {
        int i = R.id.chart_aerobic;
        HMSpeedDialChart hMSpeedDialChart = (HMSpeedDialChart) ViewBindings.findChildViewById(view, i);
        if (hMSpeedDialChart != null) {
            i = R.id.chart_anaerobic;
            HMSpeedDialChart hMSpeedDialChart2 = (HMSpeedDialChart) ViewBindings.findChildViewById(view, i);
            if (hMSpeedDialChart2 != null) {
                i = R.id.line;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = R.id.training_effect;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        i = R.id.tv_aerobic;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView3 != null) {
                            i = R.id.tv_aerobic_score;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView4 != null) {
                                i = R.id.tv_aerobic_state;
                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView5 != null) {
                                    i = R.id.tv_anaerobic;
                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView6 != null) {
                                        i = R.id.tv_anaerobic_score;
                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView7 != null) {
                                            i = R.id.tv_anaerobic_state;
                                            TextView textView8 = (TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView8 != null) {
                                                return new MovingUiCardTrainingEffectBinding((ConstraintLayout) view, hMSpeedDialChart, hMSpeedDialChart2, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8);
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
    public static MovingUiCardTrainingEffectBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static MovingUiCardTrainingEffectBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.moving_ui_card_training_effect, viewGroup, false);
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

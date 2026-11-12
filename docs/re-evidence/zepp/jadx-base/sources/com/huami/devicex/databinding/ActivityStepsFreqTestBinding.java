package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.huami.widget.typeface.TypefaceTextView;
import com.xiaomi.hm.health.bodyfat.view.WeightChartView;

/* JADX INFO: loaded from: classes7.dex */
public final class ActivityStepsFreqTestBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final TextView countDownTv;

    @NonNull
    public final FrameLayout labMainSport;

    @NonNull
    public final WeightChartView sportProgressState;

    @NonNull
    public final TypefaceTextView sportRating;

    @NonNull
    public final TextView stepFreqTipsTv;

    private ActivityStepsFreqTestBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull FrameLayout frameLayout, @NonNull WeightChartView weightChartView, @NonNull TypefaceTextView typefaceTextView, @NonNull TextView textView2) {
        this.a = relativeLayout;
        this.countDownTv = textView;
        this.labMainSport = frameLayout;
        this.sportProgressState = weightChartView;
        this.sportRating = typefaceTextView;
        this.stepFreqTipsTv = textView2;
    }

    @NonNull
    public static ActivityStepsFreqTestBinding bind(@NonNull View view) {
        int i = R.id.count_down_tv;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.lab_main_sport;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                i = R.id.sport_progress_state;
                WeightChartView weightChartView = (WeightChartView) ViewBindings.findChildViewById(view, i);
                if (weightChartView != null) {
                    i = R.id.sport_rating;
                    TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                    if (typefaceTextView != null) {
                        i = R.id.step_freq_tips_tv;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView2 != null) {
                            return new ActivityStepsFreqTestBinding((RelativeLayout) view, textView, frameLayout, weightChartView, typefaceTextView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityStepsFreqTestBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityStepsFreqTestBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_steps_freq_test, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.a;
    }
}

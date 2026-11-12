package com.xiaomi.hm.health.bodyfat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.widget.typeface.TypefaceTextView;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.view.FatMeasuringView;
import com.xiaomi.hm.health.bodyfat.view.WeightChartView;

/* JADX INFO: loaded from: classes19.dex */
public final class ViewWeightingDynamicBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final TextView bmiNumber;

    @NonNull
    public final TextView bmiStandard;

    @NonNull
    public final TextView bmiText;

    @NonNull
    public final FatMeasuringView bodyfatView;

    @NonNull
    public final TypefaceTextView number;

    @NonNull
    public final TextView numberUnit;

    @NonNull
    public final TextView tips;

    @NonNull
    public final RelativeLayout weightBmiTips;

    @NonNull
    public final WeightChartView weightChart;

    @NonNull
    public final LinearLayout weightContentAll;

    @NonNull
    public final ImageView weightLowPower;

    @NonNull
    public final LinearLayout weightNumberLayout;

    @NonNull
    public final ImageView weightOverweight;

    private ViewWeightingDynamicBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull FatMeasuringView fatMeasuringView, @NonNull TypefaceTextView typefaceTextView, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull RelativeLayout relativeLayout2, @NonNull WeightChartView weightChartView, @NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout2, @NonNull ImageView imageView2) {
        this.a = relativeLayout;
        this.bmiNumber = textView;
        this.bmiStandard = textView2;
        this.bmiText = textView3;
        this.bodyfatView = fatMeasuringView;
        this.number = typefaceTextView;
        this.numberUnit = textView4;
        this.tips = textView5;
        this.weightBmiTips = relativeLayout2;
        this.weightChart = weightChartView;
        this.weightContentAll = linearLayout;
        this.weightLowPower = imageView;
        this.weightNumberLayout = linearLayout2;
        this.weightOverweight = imageView2;
    }

    @NonNull
    public static ViewWeightingDynamicBinding bind(@NonNull View view) {
        int i = R.id.bmi_number;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.bmi_standard;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null) {
                i = R.id.bmi_text;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView3 != null) {
                    i = R.id.bodyfat_view;
                    FatMeasuringView fatMeasuringView = (FatMeasuringView) ViewBindings.findChildViewById(view, i);
                    if (fatMeasuringView != null) {
                        i = R.id.number;
                        TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                        if (typefaceTextView != null) {
                            i = R.id.number_unit;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView4 != null) {
                                i = R.id.tips;
                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView5 != null) {
                                    i = R.id.weight_bmi_tips;
                                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                    if (relativeLayout != null) {
                                        i = R.id.weight_chart;
                                        WeightChartView weightChartView = (WeightChartView) ViewBindings.findChildViewById(view, i);
                                        if (weightChartView != null) {
                                            i = R.id.weight_content_all;
                                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                            if (linearLayout != null) {
                                                i = R.id.weight_low_power;
                                                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                                                if (imageView != null) {
                                                    i = R.id.weight_number_layout;
                                                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                    if (linearLayout2 != null) {
                                                        i = R.id.weight_overweight;
                                                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                        if (imageView2 != null) {
                                                            return new ViewWeightingDynamicBinding((RelativeLayout) view, textView, textView2, textView3, fatMeasuringView, typefaceTextView, textView4, textView5, relativeLayout, weightChartView, linearLayout, imageView, linearLayout2, imageView2);
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
    public static ViewWeightingDynamicBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ViewWeightingDynamicBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.view_weighting_dynamic, viewGroup, false);
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

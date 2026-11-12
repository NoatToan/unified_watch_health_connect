package com.xiaomi.hm.health.bodyfat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.widget.typeface.TypefaceTextView;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.view.FatMeasuringView;
import com.xiaomi.hm.health.bodyfat.view.WeightChartView;
import java.util.Objects;

/* JADX INFO: loaded from: classes19.dex */
public final class LayoutWeightTitleAndViewBinding implements ViewBinding {

    @NonNull
    private final View a;

    @NonNull
    public final FatMeasuringView bodyfatView;

    @NonNull
    public final RelativeLayout layoutWeight;

    @NonNull
    public final TypefaceTextView number;

    @NonNull
    public final TextView numberUnit;

    @NonNull
    public final TextView title;

    @NonNull
    public final WeightChartView weightChart;

    @NonNull
    public final LinearLayout weightNumberLayout;

    private LayoutWeightTitleAndViewBinding(@NonNull View view, @NonNull FatMeasuringView fatMeasuringView, @NonNull RelativeLayout relativeLayout, @NonNull TypefaceTextView typefaceTextView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull WeightChartView weightChartView, @NonNull LinearLayout linearLayout) {
        this.a = view;
        this.bodyfatView = fatMeasuringView;
        this.layoutWeight = relativeLayout;
        this.number = typefaceTextView;
        this.numberUnit = textView;
        this.title = textView2;
        this.weightChart = weightChartView;
        this.weightNumberLayout = linearLayout;
    }

    @NonNull
    public static LayoutWeightTitleAndViewBinding bind(@NonNull View view) {
        int i = R.id.bodyfat_view;
        FatMeasuringView fatMeasuringView = (FatMeasuringView) ViewBindings.findChildViewById(view, i);
        if (fatMeasuringView != null) {
            i = R.id.layout_weight;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
            if (relativeLayout != null) {
                i = R.id.number;
                TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                if (typefaceTextView != null) {
                    i = R.id.number_unit;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        i = R.id.title;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView2 != null) {
                            i = R.id.weight_chart;
                            WeightChartView weightChartView = (WeightChartView) ViewBindings.findChildViewById(view, i);
                            if (weightChartView != null) {
                                i = R.id.weight_number_layout;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                if (linearLayout != null) {
                                    return new LayoutWeightTitleAndViewBinding(view, fatMeasuringView, relativeLayout, typefaceTextView, textView, textView2, weightChartView, linearLayout);
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
    public static LayoutWeightTitleAndViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        Objects.requireNonNull(viewGroup, "parent");
        layoutInflater.inflate(R.layout.layout_weight_title_and_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.a;
    }
}

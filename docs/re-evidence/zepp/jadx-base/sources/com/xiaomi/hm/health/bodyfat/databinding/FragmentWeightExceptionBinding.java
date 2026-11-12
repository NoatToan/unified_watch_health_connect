package com.xiaomi.hm.health.bodyfat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.widget.typeface.TypefaceTextView;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.view.WeightChartView;

/* JADX INFO: loaded from: classes19.dex */
public final class FragmentWeightExceptionBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final ImageView imgFlag;

    @NonNull
    public final TypefaceTextView number;

    @NonNull
    public final TextView tips;

    @NonNull
    public final WeightChartView weightChart;

    @NonNull
    public final LinearLayout weightNumberLayout;

    @NonNull
    public final TextView weightTitle;

    private FragmentWeightExceptionBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull TypefaceTextView typefaceTextView, @NonNull TextView textView, @NonNull WeightChartView weightChartView, @NonNull LinearLayout linearLayout2, @NonNull TextView textView2) {
        this.a = linearLayout;
        this.imgFlag = imageView;
        this.number = typefaceTextView;
        this.tips = textView;
        this.weightChart = weightChartView;
        this.weightNumberLayout = linearLayout2;
        this.weightTitle = textView2;
    }

    @NonNull
    public static FragmentWeightExceptionBinding bind(@NonNull View view) {
        int i = R.id.img_flag;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.number;
            TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
            if (typefaceTextView != null) {
                i = R.id.tips;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = R.id.weight_chart;
                    WeightChartView weightChartView = (WeightChartView) ViewBindings.findChildViewById(view, i);
                    if (weightChartView != null) {
                        i = R.id.weight_number_layout;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout != null) {
                            i = R.id.weight_title;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView2 != null) {
                                return new FragmentWeightExceptionBinding((LinearLayout) view, imageView, typefaceTextView, textView, weightChartView, linearLayout, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentWeightExceptionBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentWeightExceptionBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_weight_exception, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.a;
    }
}

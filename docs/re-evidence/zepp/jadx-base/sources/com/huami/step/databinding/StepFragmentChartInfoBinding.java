package com.huami.step.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.step.R;
import com.huami.widget.typeface.TypefaceTextView;

/* JADX INFO: loaded from: classes14.dex */
public final class StepFragmentChartInfoBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final TypefaceTextView labelAmountCal;

    @NonNull
    public final LinearLayout layoutTotalCal;

    @NonNull
    public final TypefaceTextView textCal;

    @NonNull
    public final TypefaceTextView textDistance;

    @NonNull
    public final TypefaceTextView textDuration;

    private StepFragmentChartInfoBinding(@NonNull LinearLayout linearLayout, @NonNull TypefaceTextView typefaceTextView, @NonNull LinearLayout linearLayout2, @NonNull TypefaceTextView typefaceTextView2, @NonNull TypefaceTextView typefaceTextView3, @NonNull TypefaceTextView typefaceTextView4) {
        this.a = linearLayout;
        this.labelAmountCal = typefaceTextView;
        this.layoutTotalCal = linearLayout2;
        this.textCal = typefaceTextView2;
        this.textDistance = typefaceTextView3;
        this.textDuration = typefaceTextView4;
    }

    @NonNull
    public static StepFragmentChartInfoBinding bind(@NonNull View view) {
        int i = R.id.label_amount_cal;
        TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
        if (typefaceTextView != null) {
            i = R.id.layout_total_cal;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = R.id.text_cal;
                TypefaceTextView typefaceTextView2 = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                if (typefaceTextView2 != null) {
                    i = R.id.text_distance;
                    TypefaceTextView typefaceTextView3 = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                    if (typefaceTextView3 != null) {
                        i = R.id.text_duration;
                        TypefaceTextView typefaceTextView4 = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                        if (typefaceTextView4 != null) {
                            return new StepFragmentChartInfoBinding((LinearLayout) view, typefaceTextView, linearLayout, typefaceTextView2, typefaceTextView3, typefaceTextView4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static StepFragmentChartInfoBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static StepFragmentChartInfoBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.step_fragment_chart_info, viewGroup, false);
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

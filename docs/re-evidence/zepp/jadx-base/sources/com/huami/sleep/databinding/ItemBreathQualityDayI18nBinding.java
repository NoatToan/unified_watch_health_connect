package com.huami.sleep.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.sleep.R;
import com.huami.sleep.view.PiecewiseLineView;

/* JADX INFO: loaded from: classes13.dex */
public final class ItemBreathQualityDayI18nBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final TextView breathDayAdviceForeign;

    @NonNull
    public final TextView breathDayName;

    @NonNull
    public final TextView breathDayStatusForeign;

    @NonNull
    public final ImageView imgBetaSign;

    @NonNull
    public final PiecewiseLineView piecewiseView;

    private ItemBreathQualityDayI18nBinding(@NonNull ConstraintLayout rootView, @NonNull TextView breathDayAdviceForeign, @NonNull TextView breathDayName, @NonNull TextView breathDayStatusForeign, @NonNull ImageView imgBetaSign, @NonNull PiecewiseLineView piecewiseView) {
        this.a = rootView;
        this.breathDayAdviceForeign = breathDayAdviceForeign;
        this.breathDayName = breathDayName;
        this.breathDayStatusForeign = breathDayStatusForeign;
        this.imgBetaSign = imgBetaSign;
        this.piecewiseView = piecewiseView;
    }

    @NonNull
    public static ItemBreathQualityDayI18nBinding bind(@NonNull View rootView) {
        int i = R.id.breathDayAdviceForeign;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
        if (textView != null) {
            i = R.id.breathDayName;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, i);
            if (textView2 != null) {
                i = R.id.breathDayStatusForeign;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, i);
                if (textView3 != null) {
                    i = R.id.imgBetaSign;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, i);
                    if (imageView != null) {
                        i = R.id.piecewiseView;
                        PiecewiseLineView piecewiseLineView = (PiecewiseLineView) ViewBindings.findChildViewById(rootView, i);
                        if (piecewiseLineView != null) {
                            return new ItemBreathQualityDayI18nBinding((ConstraintLayout) rootView, textView, textView2, textView3, imageView, piecewiseLineView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemBreathQualityDayI18nBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemBreathQualityDayI18nBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_breath_quality_day_i18n, parent, false);
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

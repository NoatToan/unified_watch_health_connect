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
public final class ItemBreathQualityDayBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final TextView breathDayAdvice;

    @NonNull
    public final View breathDayDivide;

    @NonNull
    public final ImageView breathDayEmo;

    @NonNull
    public final TextView breathDayName;

    @NonNull
    public final TextView breathDayScore;

    @NonNull
    public final TextView breathDayStatus;

    @NonNull
    public final ImageView imgBetaSign;

    @NonNull
    public final PiecewiseLineView piecewiseView;

    private ItemBreathQualityDayBinding(@NonNull ConstraintLayout rootView, @NonNull TextView breathDayAdvice, @NonNull View breathDayDivide, @NonNull ImageView breathDayEmo, @NonNull TextView breathDayName, @NonNull TextView breathDayScore, @NonNull TextView breathDayStatus, @NonNull ImageView imgBetaSign, @NonNull PiecewiseLineView piecewiseView) {
        this.a = rootView;
        this.breathDayAdvice = breathDayAdvice;
        this.breathDayDivide = breathDayDivide;
        this.breathDayEmo = breathDayEmo;
        this.breathDayName = breathDayName;
        this.breathDayScore = breathDayScore;
        this.breathDayStatus = breathDayStatus;
        this.imgBetaSign = imgBetaSign;
        this.piecewiseView = piecewiseView;
    }

    @NonNull
    public static ItemBreathQualityDayBinding bind(@NonNull View rootView) {
        View viewFindChildViewById;
        int i = R.id.breathDayAdvice;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
        if (textView != null && (viewFindChildViewById = ViewBindings.findChildViewById(rootView, (i = R.id.breathDayDivide))) != null) {
            i = R.id.breathDayEmo;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, i);
            if (imageView != null) {
                i = R.id.breathDayName;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, i);
                if (textView2 != null) {
                    i = R.id.breathDayScore;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, i);
                    if (textView3 != null) {
                        i = R.id.breathDayStatus;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, i);
                        if (textView4 != null) {
                            i = R.id.imgBetaSign;
                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, i);
                            if (imageView2 != null) {
                                i = R.id.piecewiseView;
                                PiecewiseLineView piecewiseLineView = (PiecewiseLineView) ViewBindings.findChildViewById(rootView, i);
                                if (piecewiseLineView != null) {
                                    return new ItemBreathQualityDayBinding((ConstraintLayout) rootView, textView, viewFindChildViewById, imageView, textView2, textView3, textView4, imageView2, piecewiseLineView);
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
    public static ItemBreathQualityDayBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemBreathQualityDayBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_breath_quality_day, parent, false);
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

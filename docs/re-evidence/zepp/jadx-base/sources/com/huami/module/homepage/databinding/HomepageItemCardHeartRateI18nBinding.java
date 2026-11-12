package com.huami.module.homepage.databinding;

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
import com.airbnb.lottie.LottieAnimationView;
import com.huami.module.homepage.R;
import com.huami.module.homepage.cards.business.heartrate.HeartRateChartView;
import com.huami.module.homepage.cards.cardui.BackgroundTextView;
import com.huami.module.homepage.cards.cardui.CardTitleBarView;
import com.huami.module.homepage.cards.cardui.GradientLineView;

/* JADX INFO: loaded from: classes11.dex */
public final class HomepageItemCardHeartRateI18nBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final HeartRateChartView detail;

    @NonNull
    public final LottieAnimationView heart;

    @NonNull
    public final TextView heartRate;

    @NonNull
    public final CardTitleBarView heartRateBar;

    @NonNull
    public final GradientLineView heartRateLine;

    @NonNull
    public final TextView heartRateState;

    @NonNull
    public final BackgroundTextView noHrData;

    @NonNull
    public final Guideline rateGuideline;

    private HomepageItemCardHeartRateI18nBinding(@NonNull ConstraintLayout rootView, @NonNull HeartRateChartView detail, @NonNull LottieAnimationView heart, @NonNull TextView heartRate, @NonNull CardTitleBarView heartRateBar, @NonNull GradientLineView heartRateLine, @NonNull TextView heartRateState, @NonNull BackgroundTextView noHrData, @NonNull Guideline rateGuideline) {
        this.a = rootView;
        this.detail = detail;
        this.heart = heart;
        this.heartRate = heartRate;
        this.heartRateBar = heartRateBar;
        this.heartRateLine = heartRateLine;
        this.heartRateState = heartRateState;
        this.noHrData = noHrData;
        this.rateGuideline = rateGuideline;
    }

    @NonNull
    public static HomepageItemCardHeartRateI18nBinding bind(@NonNull View rootView) {
        int i = R.id.detail;
        HeartRateChartView heartRateChartView = (HeartRateChartView) ViewBindings.findChildViewById(rootView, i);
        if (heartRateChartView != null) {
            i = R.id.heart;
            LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(rootView, i);
            if (lottieAnimationView != null) {
                i = R.id.heart_rate;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
                if (textView != null) {
                    i = R.id.heart_rate_bar;
                    CardTitleBarView cardTitleBarView = (CardTitleBarView) ViewBindings.findChildViewById(rootView, i);
                    if (cardTitleBarView != null) {
                        i = R.id.heart_rate_line;
                        GradientLineView gradientLineView = (GradientLineView) ViewBindings.findChildViewById(rootView, i);
                        if (gradientLineView != null) {
                            i = R.id.heart_rate_state;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, i);
                            if (textView2 != null) {
                                i = R.id.no_hr_data;
                                BackgroundTextView backgroundTextView = (BackgroundTextView) ViewBindings.findChildViewById(rootView, i);
                                if (backgroundTextView != null) {
                                    i = R.id.rate_guideline;
                                    Guideline guideline = (Guideline) ViewBindings.findChildViewById(rootView, i);
                                    if (guideline != null) {
                                        return new HomepageItemCardHeartRateI18nBinding((ConstraintLayout) rootView, heartRateChartView, lottieAnimationView, textView, cardTitleBarView, gradientLineView, textView2, backgroundTextView, guideline);
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
    public static HomepageItemCardHeartRateI18nBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static HomepageItemCardHeartRateI18nBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.homepage_item_card_heart_rate_i18n, parent, false);
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

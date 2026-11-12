package com.huami.module.homepage.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.huami.module.homepage.R;
import com.huami.module.homepage.cards.business.heartrate.HeartRateChartView;
import com.huami.module.homepage.cards.cardui.BackgroundTextView;
import com.huami.module.homepage.cards.cardui.CardTitleBarView;
import com.huami.module.homepage.cards.cardui.GradientArcView;

/* JADX INFO: loaded from: classes11.dex */
public final class HomepageItemCardHeartRateBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final HeartRateChartView detail;

    @NonNull
    public final CardTitleBarView heartRateBar;

    @NonNull
    public final TextView maxHr;

    @NonNull
    public final TextView maxHrTitle;

    @NonNull
    public final TextView minHr;

    @NonNull
    public final TextView minHrTitle;

    @NonNull
    public final BackgroundTextView noHrData;

    @NonNull
    public final LottieAnimationView redHeart;

    @NonNull
    public final TextView restHr;

    @NonNull
    public final TextView restHrTitle;

    @NonNull
    public final GradientArcView ring;

    @NonNull
    public final RelativeLayout ringRl;

    private HomepageItemCardHeartRateBinding(@NonNull ConstraintLayout rootView, @NonNull HeartRateChartView detail, @NonNull CardTitleBarView heartRateBar, @NonNull TextView maxHr, @NonNull TextView maxHrTitle, @NonNull TextView minHr, @NonNull TextView minHrTitle, @NonNull BackgroundTextView noHrData, @NonNull LottieAnimationView redHeart, @NonNull TextView restHr, @NonNull TextView restHrTitle, @NonNull GradientArcView ring, @NonNull RelativeLayout ringRl) {
        this.a = rootView;
        this.detail = detail;
        this.heartRateBar = heartRateBar;
        this.maxHr = maxHr;
        this.maxHrTitle = maxHrTitle;
        this.minHr = minHr;
        this.minHrTitle = minHrTitle;
        this.noHrData = noHrData;
        this.redHeart = redHeart;
        this.restHr = restHr;
        this.restHrTitle = restHrTitle;
        this.ring = ring;
        this.ringRl = ringRl;
    }

    @NonNull
    public static HomepageItemCardHeartRateBinding bind(@NonNull View rootView) {
        int i = R.id.detail;
        HeartRateChartView heartRateChartView = (HeartRateChartView) ViewBindings.findChildViewById(rootView, i);
        if (heartRateChartView != null) {
            i = R.id.heart_rate_bar;
            CardTitleBarView cardTitleBarView = (CardTitleBarView) ViewBindings.findChildViewById(rootView, i);
            if (cardTitleBarView != null) {
                i = R.id.max_hr;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
                if (textView != null) {
                    i = R.id.max_hr_title;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, i);
                    if (textView2 != null) {
                        i = R.id.min_hr;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, i);
                        if (textView3 != null) {
                            i = R.id.min_hr_title;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, i);
                            if (textView4 != null) {
                                i = R.id.no_hr_data;
                                BackgroundTextView backgroundTextView = (BackgroundTextView) ViewBindings.findChildViewById(rootView, i);
                                if (backgroundTextView != null) {
                                    i = R.id.red_heart;
                                    LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(rootView, i);
                                    if (lottieAnimationView != null) {
                                        i = R.id.rest_hr;
                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                        if (textView5 != null) {
                                            i = R.id.rest_hr_title;
                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                            if (textView6 != null) {
                                                i = R.id.ring;
                                                GradientArcView gradientArcView = (GradientArcView) ViewBindings.findChildViewById(rootView, i);
                                                if (gradientArcView != null) {
                                                    i = R.id.ring_rl;
                                                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, i);
                                                    if (relativeLayout != null) {
                                                        return new HomepageItemCardHeartRateBinding((ConstraintLayout) rootView, heartRateChartView, cardTitleBarView, textView, textView2, textView3, textView4, backgroundTextView, lottieAnimationView, textView5, textView6, gradientArcView, relativeLayout);
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
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static HomepageItemCardHeartRateBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static HomepageItemCardHeartRateBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.homepage_item_card_heart_rate, parent, false);
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

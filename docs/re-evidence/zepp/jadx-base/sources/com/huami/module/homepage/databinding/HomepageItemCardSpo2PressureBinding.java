package com.huami.module.homepage.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.module.homepage.R;
import com.huami.module.homepage.cards.business.stressAndspo2.RoundLottieAnimationView;
import com.huami.module.homepage.cards.cardui.BackgroundTextView;
import com.huami.module.homepage.cards.cardui.CardTitleBarView;

/* JADX INFO: loaded from: classes11.dex */
public final class HomepageItemCardSpo2PressureBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final View middleLine;

    @NonNull
    public final TextView noPressureTip;

    @NonNull
    public final TextView noSpo2Tip;

    @NonNull
    public final TextView pressureDesc;

    @NonNull
    public final BackgroundTextView pressureMask;

    @NonNull
    public final AppCompatImageView pressureScaleIv;

    @NonNull
    public final TextView pressureValue;

    @NonNull
    public final TextView spo2Desc;

    @NonNull
    public final RoundLottieAnimationView spo2Lottie;

    @NonNull
    public final BackgroundTextView spo2Mask;

    @NonNull
    public final TextView spo2Value;

    @NonNull
    public final CardTitleBarView titleBar;

    private HomepageItemCardSpo2PressureBinding(@NonNull ConstraintLayout rootView, @NonNull View middleLine, @NonNull TextView noPressureTip, @NonNull TextView noSpo2Tip, @NonNull TextView pressureDesc, @NonNull BackgroundTextView pressureMask, @NonNull AppCompatImageView pressureScaleIv, @NonNull TextView pressureValue, @NonNull TextView spo2Desc, @NonNull RoundLottieAnimationView spo2Lottie, @NonNull BackgroundTextView spo2Mask, @NonNull TextView spo2Value, @NonNull CardTitleBarView titleBar) {
        this.a = rootView;
        this.middleLine = middleLine;
        this.noPressureTip = noPressureTip;
        this.noSpo2Tip = noSpo2Tip;
        this.pressureDesc = pressureDesc;
        this.pressureMask = pressureMask;
        this.pressureScaleIv = pressureScaleIv;
        this.pressureValue = pressureValue;
        this.spo2Desc = spo2Desc;
        this.spo2Lottie = spo2Lottie;
        this.spo2Mask = spo2Mask;
        this.spo2Value = spo2Value;
        this.titleBar = titleBar;
    }

    @NonNull
    public static HomepageItemCardSpo2PressureBinding bind(@NonNull View rootView) {
        int i = R.id.middle_line;
        View viewFindChildViewById = ViewBindings.findChildViewById(rootView, i);
        if (viewFindChildViewById != null) {
            i = R.id.no_pressure_tip;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
            if (textView != null) {
                i = R.id.no_spo2_tip;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, i);
                if (textView2 != null) {
                    i = R.id.pressure_desc;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, i);
                    if (textView3 != null) {
                        i = R.id.pressure_mask;
                        BackgroundTextView backgroundTextView = (BackgroundTextView) ViewBindings.findChildViewById(rootView, i);
                        if (backgroundTextView != null) {
                            i = R.id.pressure_scale_iv;
                            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(rootView, i);
                            if (appCompatImageView != null) {
                                i = R.id.pressure_value;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                if (textView4 != null) {
                                    i = R.id.spo2_desc;
                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                    if (textView5 != null) {
                                        i = R.id.spo2_lottie;
                                        RoundLottieAnimationView roundLottieAnimationView = (RoundLottieAnimationView) ViewBindings.findChildViewById(rootView, i);
                                        if (roundLottieAnimationView != null) {
                                            i = R.id.spo2_mask;
                                            BackgroundTextView backgroundTextView2 = (BackgroundTextView) ViewBindings.findChildViewById(rootView, i);
                                            if (backgroundTextView2 != null) {
                                                i = R.id.spo2_value;
                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                                if (textView6 != null) {
                                                    i = R.id.title_bar;
                                                    CardTitleBarView cardTitleBarView = (CardTitleBarView) ViewBindings.findChildViewById(rootView, i);
                                                    if (cardTitleBarView != null) {
                                                        return new HomepageItemCardSpo2PressureBinding((ConstraintLayout) rootView, viewFindChildViewById, textView, textView2, textView3, backgroundTextView, appCompatImageView, textView4, textView5, roundLottieAnimationView, backgroundTextView2, textView6, cardTitleBarView);
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
    public static HomepageItemCardSpo2PressureBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static HomepageItemCardSpo2PressureBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.homepage_item_card_spo2_pressure, parent, false);
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

package com.huami.module.homepage.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.huami.module.homepage.R;
import com.huami.module.homepage.cards.business.pai.PaiExtView;
import com.huami.module.homepage.cards.business.pai.PaiStraightGraphView;
import com.huami.module.homepage.cards.cardui.BackgroundTextView;
import com.huami.module.homepage.cards.cardui.CardTitleBarView;
import com.huami.module.homepage.cards.cardui.I18nNumberView;

/* JADX INFO: loaded from: classes11.dex */
public final class HomepageItemCardPaiBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final TextView allPai;

    @NonNull
    public final ConstraintLayout detail;

    @NonNull
    public final ConstraintLayout heartHead;

    @NonNull
    public final Guideline homepageGuidelineAnimation;

    @NonNull
    public final Guideline homepageGuidelineLeft;

    @NonNull
    public final Guideline homepageGuidelineMiddle;

    @NonNull
    public final Button openHrDetectButton;

    @NonNull
    public final LottieAnimationView paiAnimation;

    @NonNull
    public final CardTitleBarView paiBar;

    @NonNull
    public final PaiStraightGraphView paiContainer;

    @NonNull
    public final PaiExtView paiExtView;

    @NonNull
    public final TextView paiLatestSeven;

    @NonNull
    public final I18nNumberView paiSevenGoal;

    @NonNull
    public final BackgroundTextView paiSevenNone;

    private HomepageItemCardPaiBinding(@NonNull ConstraintLayout rootView, @NonNull TextView allPai, @NonNull ConstraintLayout detail, @NonNull ConstraintLayout heartHead, @NonNull Guideline homepageGuidelineAnimation, @NonNull Guideline homepageGuidelineLeft, @NonNull Guideline homepageGuidelineMiddle, @NonNull Button openHrDetectButton, @NonNull LottieAnimationView paiAnimation, @NonNull CardTitleBarView paiBar, @NonNull PaiStraightGraphView paiContainer, @NonNull PaiExtView paiExtView, @NonNull TextView paiLatestSeven, @NonNull I18nNumberView paiSevenGoal, @NonNull BackgroundTextView paiSevenNone) {
        this.a = rootView;
        this.allPai = allPai;
        this.detail = detail;
        this.heartHead = heartHead;
        this.homepageGuidelineAnimation = homepageGuidelineAnimation;
        this.homepageGuidelineLeft = homepageGuidelineLeft;
        this.homepageGuidelineMiddle = homepageGuidelineMiddle;
        this.openHrDetectButton = openHrDetectButton;
        this.paiAnimation = paiAnimation;
        this.paiBar = paiBar;
        this.paiContainer = paiContainer;
        this.paiExtView = paiExtView;
        this.paiLatestSeven = paiLatestSeven;
        this.paiSevenGoal = paiSevenGoal;
        this.paiSevenNone = paiSevenNone;
    }

    @NonNull
    public static HomepageItemCardPaiBinding bind(@NonNull View rootView) {
        int i = R.id.all_pai;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
        if (textView != null) {
            i = R.id.detail;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, i);
            if (constraintLayout != null) {
                i = R.id.heart_head;
                ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, i);
                if (constraintLayout2 != null) {
                    i = R.id.homepage_guideline_animation;
                    Guideline guideline = (Guideline) ViewBindings.findChildViewById(rootView, i);
                    if (guideline != null) {
                        i = R.id.homepage_guideline_left;
                        Guideline guideline2 = (Guideline) ViewBindings.findChildViewById(rootView, i);
                        if (guideline2 != null) {
                            i = R.id.homepage_guideline_middle;
                            Guideline guideline3 = (Guideline) ViewBindings.findChildViewById(rootView, i);
                            if (guideline3 != null) {
                                i = R.id.open_hr_detect_button;
                                Button button = (Button) ViewBindings.findChildViewById(rootView, i);
                                if (button != null) {
                                    i = R.id.pai_animation;
                                    LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(rootView, i);
                                    if (lottieAnimationView != null) {
                                        i = R.id.pai_bar;
                                        CardTitleBarView cardTitleBarView = (CardTitleBarView) ViewBindings.findChildViewById(rootView, i);
                                        if (cardTitleBarView != null) {
                                            i = R.id.pai_container;
                                            PaiStraightGraphView paiStraightGraphView = (PaiStraightGraphView) ViewBindings.findChildViewById(rootView, i);
                                            if (paiStraightGraphView != null) {
                                                i = R.id.pai_ext_view;
                                                PaiExtView paiExtView = (PaiExtView) ViewBindings.findChildViewById(rootView, i);
                                                if (paiExtView != null) {
                                                    i = R.id.pai_latest_seven;
                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                                    if (textView2 != null) {
                                                        i = R.id.pai_seven_goal;
                                                        I18nNumberView i18nNumberView = (I18nNumberView) ViewBindings.findChildViewById(rootView, i);
                                                        if (i18nNumberView != null) {
                                                            i = R.id.pai_seven_none;
                                                            BackgroundTextView backgroundTextView = (BackgroundTextView) ViewBindings.findChildViewById(rootView, i);
                                                            if (backgroundTextView != null) {
                                                                return new HomepageItemCardPaiBinding((ConstraintLayout) rootView, textView, constraintLayout, constraintLayout2, guideline, guideline2, guideline3, button, lottieAnimationView, cardTitleBarView, paiStraightGraphView, paiExtView, textView2, i18nNumberView, backgroundTextView);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static HomepageItemCardPaiBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static HomepageItemCardPaiBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.homepage_item_card_pai, parent, false);
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

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
import com.huami.module.homepage.cards.cardui.CardTitleBarView;
import com.huami.module.homepage.cards.cardui.PiecewiseArcView;

/* JADX INFO: loaded from: classes11.dex */
public final class HomepageItemCardWeightAnalysisBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final TextView bmiContent;

    @NonNull
    public final LottieAnimationView bodyAnimation;

    @NonNull
    public final PiecewiseArcView bodyArc;

    @NonNull
    public final TextView bodyContent;

    @NonNull
    public final Guideline middleLine;

    @NonNull
    public final PiecewiseArcView weightArc;

    @NonNull
    public final CardTitleBarView weightBar;

    @NonNull
    public final TextView weightContent;

    private HomepageItemCardWeightAnalysisBinding(@NonNull ConstraintLayout rootView, @NonNull TextView bmiContent, @NonNull LottieAnimationView bodyAnimation, @NonNull PiecewiseArcView bodyArc, @NonNull TextView bodyContent, @NonNull Guideline middleLine, @NonNull PiecewiseArcView weightArc, @NonNull CardTitleBarView weightBar, @NonNull TextView weightContent) {
        this.a = rootView;
        this.bmiContent = bmiContent;
        this.bodyAnimation = bodyAnimation;
        this.bodyArc = bodyArc;
        this.bodyContent = bodyContent;
        this.middleLine = middleLine;
        this.weightArc = weightArc;
        this.weightBar = weightBar;
        this.weightContent = weightContent;
    }

    @NonNull
    public static HomepageItemCardWeightAnalysisBinding bind(@NonNull View rootView) {
        int i = R.id.bmi_content;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
        if (textView != null) {
            i = R.id.body_animation;
            LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(rootView, i);
            if (lottieAnimationView != null) {
                i = R.id.body_arc;
                PiecewiseArcView piecewiseArcView = (PiecewiseArcView) ViewBindings.findChildViewById(rootView, i);
                if (piecewiseArcView != null) {
                    i = R.id.body_content;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, i);
                    if (textView2 != null) {
                        i = R.id.middle_line;
                        Guideline guideline = (Guideline) ViewBindings.findChildViewById(rootView, i);
                        if (guideline != null) {
                            i = R.id.weight_arc;
                            PiecewiseArcView piecewiseArcView2 = (PiecewiseArcView) ViewBindings.findChildViewById(rootView, i);
                            if (piecewiseArcView2 != null) {
                                i = R.id.weight_bar;
                                CardTitleBarView cardTitleBarView = (CardTitleBarView) ViewBindings.findChildViewById(rootView, i);
                                if (cardTitleBarView != null) {
                                    i = R.id.weight_content;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                    if (textView3 != null) {
                                        return new HomepageItemCardWeightAnalysisBinding((ConstraintLayout) rootView, textView, lottieAnimationView, piecewiseArcView, textView2, guideline, piecewiseArcView2, cardTitleBarView, textView3);
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
    public static HomepageItemCardWeightAnalysisBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static HomepageItemCardWeightAnalysisBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.homepage_item_card_weight_analysis, parent, false);
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

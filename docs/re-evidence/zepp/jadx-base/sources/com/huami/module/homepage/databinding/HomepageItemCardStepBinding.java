package com.huami.module.homepage.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.module.homepage.R;
import com.huami.module.homepage.cards.cardui.CardTitleBarView;
import com.huami.module.homepage.cards.cardui.ProgressRingView;

/* JADX INFO: loaded from: classes11.dex */
public final class HomepageItemCardStepBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final FrameLayout chartContainer;

    @NonNull
    public final ConstraintLayout detail;

    @NonNull
    public final ProgressRingView ring;

    @NonNull
    public final Space spaceBelowRing;

    @NonNull
    public final TextView stepAvgStepLast7days;

    @NonNull
    public final CardTitleBarView stepBar;

    @NonNull
    public final TextView stepConsumeTitle;

    @NonNull
    public final TextView stepDistanceTitle;

    @NonNull
    public final AppCompatTextView stepValue;

    private HomepageItemCardStepBinding(@NonNull ConstraintLayout rootView, @NonNull FrameLayout chartContainer, @NonNull ConstraintLayout detail, @NonNull ProgressRingView ring, @NonNull Space spaceBelowRing, @NonNull TextView stepAvgStepLast7days, @NonNull CardTitleBarView stepBar, @NonNull TextView stepConsumeTitle, @NonNull TextView stepDistanceTitle, @NonNull AppCompatTextView stepValue) {
        this.a = rootView;
        this.chartContainer = chartContainer;
        this.detail = detail;
        this.ring = ring;
        this.spaceBelowRing = spaceBelowRing;
        this.stepAvgStepLast7days = stepAvgStepLast7days;
        this.stepBar = stepBar;
        this.stepConsumeTitle = stepConsumeTitle;
        this.stepDistanceTitle = stepDistanceTitle;
        this.stepValue = stepValue;
    }

    @NonNull
    public static HomepageItemCardStepBinding bind(@NonNull View rootView) {
        int i = R.id.chart_container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, i);
        if (frameLayout != null) {
            i = R.id.detail;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, i);
            if (constraintLayout != null) {
                i = R.id.ring;
                ProgressRingView progressRingView = (ProgressRingView) ViewBindings.findChildViewById(rootView, i);
                if (progressRingView != null) {
                    i = R.id.spaceBelowRing;
                    Space space = (Space) ViewBindings.findChildViewById(rootView, i);
                    if (space != null) {
                        i = R.id.step_avg_step_last_7days;
                        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
                        if (textView != null) {
                            i = R.id.step_bar;
                            CardTitleBarView cardTitleBarView = (CardTitleBarView) ViewBindings.findChildViewById(rootView, i);
                            if (cardTitleBarView != null) {
                                i = R.id.step_consume_title;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                if (textView2 != null) {
                                    i = R.id.step_distance_title;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                    if (textView3 != null) {
                                        i = R.id.step_value;
                                        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(rootView, i);
                                        if (appCompatTextView != null) {
                                            return new HomepageItemCardStepBinding((ConstraintLayout) rootView, frameLayout, constraintLayout, progressRingView, space, textView, cardTitleBarView, textView2, textView3, appCompatTextView);
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
    public static HomepageItemCardStepBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static HomepageItemCardStepBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.homepage_item_card_step, parent, false);
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

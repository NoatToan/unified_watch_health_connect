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
import com.huami.module.homepage.cards.cardui.I18nNumberView;
import com.huami.module.homepage.cards.cardui.PiecewiseLineView;
import com.huami.module.homepage.cards.cardui.ProgressRingView;

/* JADX INFO: loaded from: classes11.dex */
public final class HomepageItemCardCalorieBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final TextView activityConsume;

    @NonNull
    public final CardTitleBarView calorieBar;

    @NonNull
    public final AppCompatTextView calorieValue;

    @NonNull
    public final FrameLayout chartContainer;

    @NonNull
    public final ConstraintLayout detail;

    @NonNull
    public final I18nNumberView percent15;

    @NonNull
    public final I18nNumberView percent30;

    @NonNull
    public final PiecewiseLineView progressBar;

    @NonNull
    public final ProgressRingView ring;

    @NonNull
    public final Space spaceAboveDetail;

    @NonNull
    public final TextView stepAvgStepLast7days;

    private HomepageItemCardCalorieBinding(@NonNull ConstraintLayout rootView, @NonNull TextView activityConsume, @NonNull CardTitleBarView calorieBar, @NonNull AppCompatTextView calorieValue, @NonNull FrameLayout chartContainer, @NonNull ConstraintLayout detail, @NonNull I18nNumberView percent15, @NonNull I18nNumberView percent30, @NonNull PiecewiseLineView progressBar, @NonNull ProgressRingView ring, @NonNull Space spaceAboveDetail, @NonNull TextView stepAvgStepLast7days) {
        this.a = rootView;
        this.activityConsume = activityConsume;
        this.calorieBar = calorieBar;
        this.calorieValue = calorieValue;
        this.chartContainer = chartContainer;
        this.detail = detail;
        this.percent15 = percent15;
        this.percent30 = percent30;
        this.progressBar = progressBar;
        this.ring = ring;
        this.spaceAboveDetail = spaceAboveDetail;
        this.stepAvgStepLast7days = stepAvgStepLast7days;
    }

    @NonNull
    public static HomepageItemCardCalorieBinding bind(@NonNull View rootView) {
        int i = R.id.activity_consume;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
        if (textView != null) {
            i = R.id.calorie_bar;
            CardTitleBarView cardTitleBarView = (CardTitleBarView) ViewBindings.findChildViewById(rootView, i);
            if (cardTitleBarView != null) {
                i = R.id.calorie_value;
                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(rootView, i);
                if (appCompatTextView != null) {
                    i = R.id.chart_container;
                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, i);
                    if (frameLayout != null) {
                        i = R.id.detail;
                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, i);
                        if (constraintLayout != null) {
                            i = R.id.percent_15;
                            I18nNumberView i18nNumberView = (I18nNumberView) ViewBindings.findChildViewById(rootView, i);
                            if (i18nNumberView != null) {
                                i = R.id.percent_30;
                                I18nNumberView i18nNumberView2 = (I18nNumberView) ViewBindings.findChildViewById(rootView, i);
                                if (i18nNumberView2 != null) {
                                    i = R.id.progressBar;
                                    PiecewiseLineView piecewiseLineView = (PiecewiseLineView) ViewBindings.findChildViewById(rootView, i);
                                    if (piecewiseLineView != null) {
                                        i = R.id.ring;
                                        ProgressRingView progressRingView = (ProgressRingView) ViewBindings.findChildViewById(rootView, i);
                                        if (progressRingView != null) {
                                            i = R.id.space_above_detail;
                                            Space space = (Space) ViewBindings.findChildViewById(rootView, i);
                                            if (space != null) {
                                                i = R.id.step_avg_step_last_7days;
                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                                if (textView2 != null) {
                                                    return new HomepageItemCardCalorieBinding((ConstraintLayout) rootView, textView, cardTitleBarView, appCompatTextView, frameLayout, constraintLayout, i18nNumberView, i18nNumberView2, piecewiseLineView, progressRingView, space, textView2);
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
    public static HomepageItemCardCalorieBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static HomepageItemCardCalorieBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.homepage_item_card_calorie, parent, false);
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

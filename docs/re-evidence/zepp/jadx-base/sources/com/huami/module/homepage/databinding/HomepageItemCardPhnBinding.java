package com.huami.module.homepage.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.module.homepage.R;
import com.huami.module.homepage.cards.cardui.BackgroundTextView;
import com.huami.module.homepage.cards.cardui.CardTitleBarView;
import com.huami.module.homepage.cards.cardui.PiecewiseArcView;

/* JADX INFO: loaded from: classes11.dex */
public final class HomepageItemCardPhnBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final TextView phn100;

    @NonNull
    public final PiecewiseArcView phnArc;

    @NonNull
    public final TextView phnContent;

    @NonNull
    public final ProgressBar phnLine;

    @NonNull
    public final BackgroundTextView phnMask;

    @NonNull
    public final AppCompatTextView phnNoPlan;

    @NonNull
    public final AppCompatButton phnPlanButton;

    @NonNull
    public final CardTitleBarView phnTitle;

    @NonNull
    public final AppCompatTextView phnTodayProgress;

    @NonNull
    public final TextView phnZero;

    private HomepageItemCardPhnBinding(@NonNull ConstraintLayout rootView, @NonNull TextView phn100, @NonNull PiecewiseArcView phnArc, @NonNull TextView phnContent, @NonNull ProgressBar phnLine, @NonNull BackgroundTextView phnMask, @NonNull AppCompatTextView phnNoPlan, @NonNull AppCompatButton phnPlanButton, @NonNull CardTitleBarView phnTitle, @NonNull AppCompatTextView phnTodayProgress, @NonNull TextView phnZero) {
        this.a = rootView;
        this.phn100 = phn100;
        this.phnArc = phnArc;
        this.phnContent = phnContent;
        this.phnLine = phnLine;
        this.phnMask = phnMask;
        this.phnNoPlan = phnNoPlan;
        this.phnPlanButton = phnPlanButton;
        this.phnTitle = phnTitle;
        this.phnTodayProgress = phnTodayProgress;
        this.phnZero = phnZero;
    }

    @NonNull
    public static HomepageItemCardPhnBinding bind(@NonNull View rootView) {
        int i = R.id.phn_100;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
        if (textView != null) {
            i = R.id.phn_arc;
            PiecewiseArcView piecewiseArcView = (PiecewiseArcView) ViewBindings.findChildViewById(rootView, i);
            if (piecewiseArcView != null) {
                i = R.id.phn_content;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, i);
                if (textView2 != null) {
                    i = R.id.phn_line;
                    ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, i);
                    if (progressBar != null) {
                        i = R.id.phn_mask;
                        BackgroundTextView backgroundTextView = (BackgroundTextView) ViewBindings.findChildViewById(rootView, i);
                        if (backgroundTextView != null) {
                            i = R.id.phn_no_plan;
                            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(rootView, i);
                            if (appCompatTextView != null) {
                                i = R.id.phn_plan_button;
                                AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, i);
                                if (appCompatButton != null) {
                                    i = R.id.phn_title;
                                    CardTitleBarView cardTitleBarView = (CardTitleBarView) ViewBindings.findChildViewById(rootView, i);
                                    if (cardTitleBarView != null) {
                                        i = R.id.phn_today_progress;
                                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(rootView, i);
                                        if (appCompatTextView2 != null) {
                                            i = R.id.phn_zero;
                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                            if (textView3 != null) {
                                                return new HomepageItemCardPhnBinding((ConstraintLayout) rootView, textView, piecewiseArcView, textView2, progressBar, backgroundTextView, appCompatTextView, appCompatButton, cardTitleBarView, appCompatTextView2, textView3);
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
    public static HomepageItemCardPhnBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static HomepageItemCardPhnBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.homepage_item_card_phn, parent, false);
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

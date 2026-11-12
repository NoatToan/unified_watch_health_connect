package com.huami.module.homepage.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.module.homepage.R;
import com.huami.module.homepage.cards.cardui.BackgroundTextView;
import com.huami.module.homepage.cards.cardui.CardTitleBarView;
import com.huami.module.homepage.cards.cardui.PiecewiseLineView;

/* JADX INFO: loaded from: classes11.dex */
public final class HomepageItemCardBreathEqualityI18nBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final TextView badBreathTimes;

    @NonNull
    public final Space bottomSpace;

    @NonNull
    public final FrameLayout chartContainer;

    @NonNull
    public final TextView desc;

    @NonNull
    public final ConstraintLayout detail;

    @NonNull
    public final TextView endTime;

    @NonNull
    public final BackgroundTextView noSleepBreathData;

    @NonNull
    public final CardTitleBarView sleepBreathBar;

    @NonNull
    public final TextView startTime;

    @NonNull
    public final TextView state;

    @NonNull
    public final PiecewiseLineView stateBar;

    private HomepageItemCardBreathEqualityI18nBinding(@NonNull ConstraintLayout rootView, @NonNull TextView badBreathTimes, @NonNull Space bottomSpace, @NonNull FrameLayout chartContainer, @NonNull TextView desc, @NonNull ConstraintLayout detail, @NonNull TextView endTime, @NonNull BackgroundTextView noSleepBreathData, @NonNull CardTitleBarView sleepBreathBar, @NonNull TextView startTime, @NonNull TextView state, @NonNull PiecewiseLineView stateBar) {
        this.a = rootView;
        this.badBreathTimes = badBreathTimes;
        this.bottomSpace = bottomSpace;
        this.chartContainer = chartContainer;
        this.desc = desc;
        this.detail = detail;
        this.endTime = endTime;
        this.noSleepBreathData = noSleepBreathData;
        this.sleepBreathBar = sleepBreathBar;
        this.startTime = startTime;
        this.state = state;
        this.stateBar = stateBar;
    }

    @NonNull
    public static HomepageItemCardBreathEqualityI18nBinding bind(@NonNull View rootView) {
        int i = R.id.bad_breath_times;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
        if (textView != null) {
            i = R.id.bottom_space;
            Space space = (Space) ViewBindings.findChildViewById(rootView, i);
            if (space != null) {
                i = R.id.chart_container;
                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, i);
                if (frameLayout != null) {
                    i = R.id.desc;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, i);
                    if (textView2 != null) {
                        i = R.id.detail;
                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, i);
                        if (constraintLayout != null) {
                            i = R.id.end_time;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, i);
                            if (textView3 != null) {
                                i = R.id.no_sleep_breath_data;
                                BackgroundTextView backgroundTextView = (BackgroundTextView) ViewBindings.findChildViewById(rootView, i);
                                if (backgroundTextView != null) {
                                    i = R.id.sleep_breath_bar;
                                    CardTitleBarView cardTitleBarView = (CardTitleBarView) ViewBindings.findChildViewById(rootView, i);
                                    if (cardTitleBarView != null) {
                                        i = R.id.start_time;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                        if (textView4 != null) {
                                            i = R.id.state;
                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                            if (textView5 != null) {
                                                i = R.id.stateBar;
                                                PiecewiseLineView piecewiseLineView = (PiecewiseLineView) ViewBindings.findChildViewById(rootView, i);
                                                if (piecewiseLineView != null) {
                                                    return new HomepageItemCardBreathEqualityI18nBinding((ConstraintLayout) rootView, textView, space, frameLayout, textView2, constraintLayout, textView3, backgroundTextView, cardTitleBarView, textView4, textView5, piecewiseLineView);
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
    public static HomepageItemCardBreathEqualityI18nBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static HomepageItemCardBreathEqualityI18nBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.homepage_item_card_breath_equality_i18n, parent, false);
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

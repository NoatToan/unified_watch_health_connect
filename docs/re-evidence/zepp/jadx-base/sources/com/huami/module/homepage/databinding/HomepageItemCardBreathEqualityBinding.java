package com.huami.module.homepage.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
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
public final class HomepageItemCardBreathEqualityBinding implements ViewBinding {

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
    public final TextView descUnderScore;

    @NonNull
    public final ConstraintLayout detail;

    @NonNull
    public final TextView endTime;

    @NonNull
    public final ImageView icon;

    @NonNull
    public final View lineRightOfState;

    @NonNull
    public final BackgroundTextView noSleepBreathData;

    @NonNull
    public final TextView score;

    @NonNull
    public final CardTitleBarView sleepBreathBar;

    @NonNull
    public final TextView startTime;

    @NonNull
    public final TextView state;

    @NonNull
    public final PiecewiseLineView stateBar;

    private HomepageItemCardBreathEqualityBinding(@NonNull ConstraintLayout rootView, @NonNull TextView badBreathTimes, @NonNull Space bottomSpace, @NonNull FrameLayout chartContainer, @NonNull TextView desc, @NonNull TextView descUnderScore, @NonNull ConstraintLayout detail, @NonNull TextView endTime, @NonNull ImageView icon, @NonNull View lineRightOfState, @NonNull BackgroundTextView noSleepBreathData, @NonNull TextView score, @NonNull CardTitleBarView sleepBreathBar, @NonNull TextView startTime, @NonNull TextView state, @NonNull PiecewiseLineView stateBar) {
        this.a = rootView;
        this.badBreathTimes = badBreathTimes;
        this.bottomSpace = bottomSpace;
        this.chartContainer = chartContainer;
        this.desc = desc;
        this.descUnderScore = descUnderScore;
        this.detail = detail;
        this.endTime = endTime;
        this.icon = icon;
        this.lineRightOfState = lineRightOfState;
        this.noSleepBreathData = noSleepBreathData;
        this.score = score;
        this.sleepBreathBar = sleepBreathBar;
        this.startTime = startTime;
        this.state = state;
        this.stateBar = stateBar;
    }

    @NonNull
    public static HomepageItemCardBreathEqualityBinding bind(@NonNull View rootView) {
        View viewFindChildViewById;
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
                        i = R.id.descUnderScore;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, i);
                        if (textView3 != null) {
                            i = R.id.detail;
                            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, i);
                            if (constraintLayout != null) {
                                i = R.id.end_time;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                if (textView4 != null) {
                                    i = R.id.icon;
                                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, i);
                                    if (imageView != null && (viewFindChildViewById = ViewBindings.findChildViewById(rootView, (i = R.id.lineRightOfState))) != null) {
                                        i = R.id.no_sleep_breath_data;
                                        BackgroundTextView backgroundTextView = (BackgroundTextView) ViewBindings.findChildViewById(rootView, i);
                                        if (backgroundTextView != null) {
                                            i = R.id.score;
                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                            if (textView5 != null) {
                                                i = R.id.sleep_breath_bar;
                                                CardTitleBarView cardTitleBarView = (CardTitleBarView) ViewBindings.findChildViewById(rootView, i);
                                                if (cardTitleBarView != null) {
                                                    i = R.id.start_time;
                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                                    if (textView6 != null) {
                                                        i = R.id.state;
                                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                                        if (textView7 != null) {
                                                            i = R.id.stateBar;
                                                            PiecewiseLineView piecewiseLineView = (PiecewiseLineView) ViewBindings.findChildViewById(rootView, i);
                                                            if (piecewiseLineView != null) {
                                                                return new HomepageItemCardBreathEqualityBinding((ConstraintLayout) rootView, textView, space, frameLayout, textView2, textView3, constraintLayout, textView4, imageView, viewFindChildViewById, backgroundTextView, textView5, cardTitleBarView, textView6, textView7, piecewiseLineView);
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
    public static HomepageItemCardBreathEqualityBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static HomepageItemCardBreathEqualityBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.homepage_item_card_breath_equality, parent, false);
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

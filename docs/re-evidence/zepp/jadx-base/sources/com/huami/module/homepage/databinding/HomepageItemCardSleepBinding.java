package com.huami.module.homepage.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.huami.module.homepage.R;
import com.huami.module.homepage.cards.cardui.BackgroundTextView;
import com.huami.module.homepage.cards.cardui.CardTitleBarView;

/* JADX INFO: loaded from: classes11.dex */
public final class HomepageItemCardSleepBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final FrameLayout avgSleepChartContainer;

    @NonNull
    public final TextView avgSleepTitle;

    @NonNull
    public final TextView deepSleepDuration;

    @NonNull
    public final TextView deepSleepDurationTitle;

    @NonNull
    public final ConstraintLayout detail;

    @NonNull
    public final Group homepageNormalSleepGroup;

    @NonNull
    public final FrameLayout hrChartLayout;

    @NonNull
    public final View leftVerticalLine;

    @NonNull
    public final TextView napSleepState;

    @NonNull
    public final TextView napSleepTime;

    @NonNull
    public final BackgroundTextView noSleepData;

    @NonNull
    public final View rightVerticalLine;

    @NonNull
    public final CardTitleBarView sleepBar;

    @NonNull
    public final FrameLayout sleepChartContainer;

    @NonNull
    public final TextView sleepDuration;

    @NonNull
    public final TextView sleepDurationTitle;

    @NonNull
    public final TextView sleepEndTime;

    @NonNull
    public final TextView sleepScore;

    @NonNull
    public final TextView sleepScoreTitle;

    @NonNull
    public final LottieAnimationView sleepSmile;

    @NonNull
    public final TextView sleepStartTime;

    private HomepageItemCardSleepBinding(@NonNull ConstraintLayout rootView, @NonNull FrameLayout avgSleepChartContainer, @NonNull TextView avgSleepTitle, @NonNull TextView deepSleepDuration, @NonNull TextView deepSleepDurationTitle, @NonNull ConstraintLayout detail, @NonNull Group homepageNormalSleepGroup, @NonNull FrameLayout hrChartLayout, @NonNull View leftVerticalLine, @NonNull TextView napSleepState, @NonNull TextView napSleepTime, @NonNull BackgroundTextView noSleepData, @NonNull View rightVerticalLine, @NonNull CardTitleBarView sleepBar, @NonNull FrameLayout sleepChartContainer, @NonNull TextView sleepDuration, @NonNull TextView sleepDurationTitle, @NonNull TextView sleepEndTime, @NonNull TextView sleepScore, @NonNull TextView sleepScoreTitle, @NonNull LottieAnimationView sleepSmile, @NonNull TextView sleepStartTime) {
        this.a = rootView;
        this.avgSleepChartContainer = avgSleepChartContainer;
        this.avgSleepTitle = avgSleepTitle;
        this.deepSleepDuration = deepSleepDuration;
        this.deepSleepDurationTitle = deepSleepDurationTitle;
        this.detail = detail;
        this.homepageNormalSleepGroup = homepageNormalSleepGroup;
        this.hrChartLayout = hrChartLayout;
        this.leftVerticalLine = leftVerticalLine;
        this.napSleepState = napSleepState;
        this.napSleepTime = napSleepTime;
        this.noSleepData = noSleepData;
        this.rightVerticalLine = rightVerticalLine;
        this.sleepBar = sleepBar;
        this.sleepChartContainer = sleepChartContainer;
        this.sleepDuration = sleepDuration;
        this.sleepDurationTitle = sleepDurationTitle;
        this.sleepEndTime = sleepEndTime;
        this.sleepScore = sleepScore;
        this.sleepScoreTitle = sleepScoreTitle;
        this.sleepSmile = sleepSmile;
        this.sleepStartTime = sleepStartTime;
    }

    @NonNull
    public static HomepageItemCardSleepBinding bind(@NonNull View rootView) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i = R.id.avg_sleep_chart_container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, i);
        if (frameLayout != null) {
            i = R.id.avg_sleep_title;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
            if (textView != null) {
                i = R.id.deep_sleep_duration;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, i);
                if (textView2 != null) {
                    i = R.id.deep_sleep_duration_title;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, i);
                    if (textView3 != null) {
                        i = R.id.detail;
                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, i);
                        if (constraintLayout != null) {
                            i = R.id.homepage_normal_sleep_group;
                            Group group = (Group) ViewBindings.findChildViewById(rootView, i);
                            if (group != null) {
                                i = R.id.hrChartLayout;
                                FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(rootView, i);
                                if (frameLayout2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(rootView, (i = R.id.left_vertical_line))) != null) {
                                    i = R.id.nap_sleep_state;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                    if (textView4 != null) {
                                        i = R.id.nap_sleep_time;
                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                        if (textView5 != null) {
                                            i = R.id.no_sleep_data;
                                            BackgroundTextView backgroundTextView = (BackgroundTextView) ViewBindings.findChildViewById(rootView, i);
                                            if (backgroundTextView != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(rootView, (i = R.id.right_vertical_line))) != null) {
                                                i = R.id.sleep_bar;
                                                CardTitleBarView cardTitleBarView = (CardTitleBarView) ViewBindings.findChildViewById(rootView, i);
                                                if (cardTitleBarView != null) {
                                                    i = R.id.sleep_chart_container;
                                                    FrameLayout frameLayout3 = (FrameLayout) ViewBindings.findChildViewById(rootView, i);
                                                    if (frameLayout3 != null) {
                                                        i = R.id.sleep_duration;
                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                                        if (textView6 != null) {
                                                            i = R.id.sleep_duration_title;
                                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                                            if (textView7 != null) {
                                                                i = R.id.sleep_end_time;
                                                                TextView textView8 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                                                if (textView8 != null) {
                                                                    i = R.id.sleep_score;
                                                                    TextView textView9 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                                                    if (textView9 != null) {
                                                                        i = R.id.sleep_score_title;
                                                                        TextView textView10 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                                                        if (textView10 != null) {
                                                                            i = R.id.sleep_smile;
                                                                            LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(rootView, i);
                                                                            if (lottieAnimationView != null) {
                                                                                i = R.id.sleep_start_time;
                                                                                TextView textView11 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                                                                if (textView11 != null) {
                                                                                    return new HomepageItemCardSleepBinding((ConstraintLayout) rootView, frameLayout, textView, textView2, textView3, constraintLayout, group, frameLayout2, viewFindChildViewById, textView4, textView5, backgroundTextView, viewFindChildViewById2, cardTitleBarView, frameLayout3, textView6, textView7, textView8, textView9, textView10, lottieAnimationView, textView11);
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
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static HomepageItemCardSleepBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static HomepageItemCardSleepBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.homepage_item_card_sleep, parent, false);
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

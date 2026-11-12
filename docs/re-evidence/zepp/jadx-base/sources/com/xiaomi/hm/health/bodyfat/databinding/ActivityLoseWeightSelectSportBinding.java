package com.xiaomi.hm.health.bodyfat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.view.CustomGridView;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityLoseWeightSelectSportBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final CustomGridView gridviewBallSport;

    @NonNull
    public final CustomGridView gridviewBasicSport;

    @NonNull
    public final CustomGridView gridviewOtherSport;

    @NonNull
    public final ScrollView slSelectSport;

    @NonNull
    public final TextView tvLoseWeightGoal;

    @NonNull
    public final TextView tvLoseWeightGoalUnit;

    @NonNull
    public final TextView tvLoseWeightPeriod;

    @NonNull
    public final AppCompatTextView tvLoseWeightSportConfirm;

    @NonNull
    public final TextView tvLoseWeightSportDetail;

    @NonNull
    public final TextView tvTitleSelectSport;

    private ActivityLoseWeightSelectSportBinding(@NonNull LinearLayout linearLayout, @NonNull CustomGridView customGridView, @NonNull CustomGridView customGridView2, @NonNull CustomGridView customGridView3, @NonNull ScrollView scrollView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull AppCompatTextView appCompatTextView, @NonNull TextView textView4, @NonNull TextView textView5) {
        this.a = linearLayout;
        this.gridviewBallSport = customGridView;
        this.gridviewBasicSport = customGridView2;
        this.gridviewOtherSport = customGridView3;
        this.slSelectSport = scrollView;
        this.tvLoseWeightGoal = textView;
        this.tvLoseWeightGoalUnit = textView2;
        this.tvLoseWeightPeriod = textView3;
        this.tvLoseWeightSportConfirm = appCompatTextView;
        this.tvLoseWeightSportDetail = textView4;
        this.tvTitleSelectSport = textView5;
    }

    @NonNull
    public static ActivityLoseWeightSelectSportBinding bind(@NonNull View view) {
        int i = R.id.gridview_ball_sport;
        CustomGridView customGridView = (CustomGridView) ViewBindings.findChildViewById(view, i);
        if (customGridView != null) {
            i = R.id.gridview_basic_sport;
            CustomGridView customGridView2 = (CustomGridView) ViewBindings.findChildViewById(view, i);
            if (customGridView2 != null) {
                i = R.id.gridview_other_sport;
                CustomGridView customGridView3 = (CustomGridView) ViewBindings.findChildViewById(view, i);
                if (customGridView3 != null) {
                    i = R.id.sl_select_sport;
                    ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, i);
                    if (scrollView != null) {
                        i = R.id.tv_lose_weight_goal;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            i = R.id.tv_lose_weight_goal_unit;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView2 != null) {
                                i = R.id.tv_lose_weight_period;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView3 != null) {
                                    i = R.id.tv_lose_weight_sport_confirm;
                                    AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                    if (appCompatTextView != null) {
                                        i = R.id.tv_lose_weight_sport_detail;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView4 != null) {
                                            i = R.id.tv_title_select_sport;
                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView5 != null) {
                                                return new ActivityLoseWeightSelectSportBinding((LinearLayout) view, customGridView, customGridView2, customGridView3, scrollView, textView, textView2, textView3, appCompatTextView, textView4, textView5);
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
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityLoseWeightSelectSportBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityLoseWeightSelectSportBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_lose_weight_select_sport, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.a;
    }
}

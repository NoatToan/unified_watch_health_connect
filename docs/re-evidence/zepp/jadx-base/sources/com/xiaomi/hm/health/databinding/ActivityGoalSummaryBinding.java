package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watch.hmwatchmanager.R;

/* JADX INFO: loaded from: classes20.dex */
public final class ActivityGoalSummaryBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final LinearLayout layoutGoalConsume;

    @NonNull
    public final LinearLayout layoutGoalSleep;

    @NonNull
    public final LinearLayout layoutGoalStep;

    @NonNull
    public final LinearLayout layoutGoalWeight;

    @NonNull
    public final TextView tvGoalConsume;

    @NonNull
    public final TextView tvGoalSleep;

    @NonNull
    public final TextView tvGoalStep;

    @NonNull
    public final TextView tvGoalWeight;

    private ActivityGoalSummaryBinding(@NonNull LinearLayout rootView, @NonNull LinearLayout layoutGoalConsume, @NonNull LinearLayout layoutGoalSleep, @NonNull LinearLayout layoutGoalStep, @NonNull LinearLayout layoutGoalWeight, @NonNull TextView tvGoalConsume, @NonNull TextView tvGoalSleep, @NonNull TextView tvGoalStep, @NonNull TextView tvGoalWeight) {
        this.a = rootView;
        this.layoutGoalConsume = layoutGoalConsume;
        this.layoutGoalSleep = layoutGoalSleep;
        this.layoutGoalStep = layoutGoalStep;
        this.layoutGoalWeight = layoutGoalWeight;
        this.tvGoalConsume = tvGoalConsume;
        this.tvGoalSleep = tvGoalSleep;
        this.tvGoalStep = tvGoalStep;
        this.tvGoalWeight = tvGoalWeight;
    }

    @NonNull
    public static ActivityGoalSummaryBinding bind(@NonNull View rootView) {
        int i = R.id.layout_goal_consume;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.layout_goal_consume);
        if (linearLayout != null) {
            i = R.id.layout_goal_sleep;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.layout_goal_sleep);
            if (linearLayout2 != null) {
                i = R.id.layout_goal_step;
                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.layout_goal_step);
                if (linearLayout3 != null) {
                    i = R.id.layout_goal_weight;
                    LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.layout_goal_weight);
                    if (linearLayout4 != null) {
                        i = R.id.tv_goal_consume;
                        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_goal_consume);
                        if (textView != null) {
                            i = R.id.tv_goal_sleep;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_goal_sleep);
                            if (textView2 != null) {
                                i = R.id.tv_goal_step;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_goal_step);
                                if (textView3 != null) {
                                    i = R.id.tv_goal_weight;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_goal_weight);
                                    if (textView4 != null) {
                                        return new ActivityGoalSummaryBinding((LinearLayout) rootView, linearLayout, linearLayout2, linearLayout3, linearLayout4, textView, textView2, textView3, textView4);
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
    public static ActivityGoalSummaryBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityGoalSummaryBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_goal_summary, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.a;
    }
}

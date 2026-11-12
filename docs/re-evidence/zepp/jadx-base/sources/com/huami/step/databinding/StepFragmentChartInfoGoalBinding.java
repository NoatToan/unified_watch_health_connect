package com.huami.step.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.hmchartui.ui.view.CommonCardView;
import com.huami.step.R;

/* JADX INFO: loaded from: classes14.dex */
public final class StepFragmentChartInfoGoalBinding implements ViewBinding {

    @NonNull
    private final CommonCardView a;

    @NonNull
    public final TextView stepGoalAllCountNum;

    @NonNull
    public final TextView stepGoalContinueCountNum;

    @NonNull
    public final LinearLayout stepStageContent;

    private StepFragmentChartInfoGoalBinding(@NonNull CommonCardView commonCardView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull LinearLayout linearLayout) {
        this.a = commonCardView;
        this.stepGoalAllCountNum = textView;
        this.stepGoalContinueCountNum = textView2;
        this.stepStageContent = linearLayout;
    }

    @NonNull
    public static StepFragmentChartInfoGoalBinding bind(@NonNull View view) {
        int i = R.id.step_goal_all_count_num;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.step_goal_continue_count_num;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null) {
                i = R.id.step_stage_content;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    return new StepFragmentChartInfoGoalBinding((CommonCardView) view, textView, textView2, linearLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static StepFragmentChartInfoGoalBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static StepFragmentChartInfoGoalBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.step_fragment_chart_info_goal, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CommonCardView getRoot() {
        return this.a;
    }
}

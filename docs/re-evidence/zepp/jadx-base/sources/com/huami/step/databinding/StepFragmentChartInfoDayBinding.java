package com.huami.step.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.hmchartui.ui.view.CommonCardView;
import com.huami.step.R;
import com.huami.widget.typeface.TypefaceTextView;

/* JADX INFO: loaded from: classes14.dex */
public final class StepFragmentChartInfoDayBinding implements ViewBinding {

    @NonNull
    private final CommonCardView a;

    @NonNull
    public final RelativeLayout checkAllRl;

    @NonNull
    public final ListView listView;

    @NonNull
    public final LinearLayout stepStageContent;

    @NonNull
    public final TypefaceTextView tvCheckAllStatus;

    private StepFragmentChartInfoDayBinding(@NonNull CommonCardView commonCardView, @NonNull RelativeLayout relativeLayout, @NonNull ListView listView, @NonNull LinearLayout linearLayout, @NonNull TypefaceTextView typefaceTextView) {
        this.a = commonCardView;
        this.checkAllRl = relativeLayout;
        this.listView = listView;
        this.stepStageContent = linearLayout;
        this.tvCheckAllStatus = typefaceTextView;
    }

    @NonNull
    public static StepFragmentChartInfoDayBinding bind(@NonNull View view) {
        int i = R.id.check_all_rl;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
        if (relativeLayout != null) {
            i = R.id.list_view;
            ListView listView = (ListView) ViewBindings.findChildViewById(view, i);
            if (listView != null) {
                i = R.id.step_stage_content;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    i = R.id.tv_check_all_status;
                    TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                    if (typefaceTextView != null) {
                        return new StepFragmentChartInfoDayBinding((CommonCardView) view, relativeLayout, listView, linearLayout, typefaceTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static StepFragmentChartInfoDayBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static StepFragmentChartInfoDayBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.step_fragment_chart_info_day, viewGroup, false);
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

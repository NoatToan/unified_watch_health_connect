package com.huami.sleep.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.sleep.R;
import com.huami.sleep.view.UnitTextView;

/* JADX INFO: loaded from: classes13.dex */
public final class LayoutSleepStageChartIntroBinding implements ViewBinding {

    @NonNull
    private final View a;

    @NonNull
    public final UnitTextView dpDurationTv;

    @Nullable
    public final LinearLayout dpLayout;

    @Nullable
    public final Guideline gCenterY;

    @NonNull
    public final UnitTextView lightDurationTv;

    @Nullable
    public final LinearLayout lightLayout;

    @NonNull
    public final UnitTextView remDurationTv;

    @NonNull
    public final LinearLayout remLayout;

    @NonNull
    public final TextView titleTv;

    @NonNull
    public final UnitTextView wakeDurationTv;

    @Nullable
    public final LinearLayout wakeLayout;

    private LayoutSleepStageChartIntroBinding(@NonNull View rootView, @NonNull UnitTextView dpDurationTv, @Nullable LinearLayout dpLayout, @Nullable Guideline gCenterY, @NonNull UnitTextView lightDurationTv, @Nullable LinearLayout lightLayout, @NonNull UnitTextView remDurationTv, @NonNull LinearLayout remLayout, @NonNull TextView titleTv, @NonNull UnitTextView wakeDurationTv, @Nullable LinearLayout wakeLayout) {
        this.a = rootView;
        this.dpDurationTv = dpDurationTv;
        this.dpLayout = dpLayout;
        this.gCenterY = gCenterY;
        this.lightDurationTv = lightDurationTv;
        this.lightLayout = lightLayout;
        this.remDurationTv = remDurationTv;
        this.remLayout = remLayout;
        this.titleTv = titleTv;
        this.wakeDurationTv = wakeDurationTv;
        this.wakeLayout = wakeLayout;
    }

    @NonNull
    public static LayoutSleepStageChartIntroBinding bind(@NonNull View rootView) {
        int i = R.id.dpDurationTv;
        UnitTextView unitTextView = (UnitTextView) ViewBindings.findChildViewById(rootView, i);
        if (unitTextView != null) {
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.dpLayout);
            Guideline guideline = (Guideline) ViewBindings.findChildViewById(rootView, R.id.g_center_y);
            i = R.id.lightDurationTv;
            UnitTextView unitTextView2 = (UnitTextView) ViewBindings.findChildViewById(rootView, i);
            if (unitTextView2 != null) {
                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.lightLayout);
                i = R.id.remDurationTv;
                UnitTextView unitTextView3 = (UnitTextView) ViewBindings.findChildViewById(rootView, i);
                if (unitTextView3 != null) {
                    i = R.id.remLayout;
                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(rootView, i);
                    if (linearLayout3 != null) {
                        i = R.id.titleTv;
                        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
                        if (textView != null) {
                            i = R.id.wakeDurationTv;
                            UnitTextView unitTextView4 = (UnitTextView) ViewBindings.findChildViewById(rootView, i);
                            if (unitTextView4 != null) {
                                return new LayoutSleepStageChartIntroBinding(rootView, unitTextView, linearLayout, guideline, unitTextView2, linearLayout2, unitTextView3, linearLayout3, textView, unitTextView4, (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.wakeLayout));
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static LayoutSleepStageChartIntroBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.a;
    }

    @NonNull
    public static LayoutSleepStageChartIntroBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.layout_sleep_stage_chart_intro, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }
}

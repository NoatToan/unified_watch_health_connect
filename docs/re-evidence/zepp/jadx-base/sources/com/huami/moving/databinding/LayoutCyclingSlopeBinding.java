package com.huami.moving.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.moving.R;
import com.huami.moving.ui.view.SlopePieChartView;

/* JADX INFO: loaded from: classes11.dex */
public final class LayoutCyclingSlopeBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final LinearLayout downUpTitle;

    @NonNull
    public final LinearLayout flatUpTitle;

    @NonNull
    public final LinearLayout normalSlopeDataContainer;

    @NonNull
    public final LinearLayout pieChartLabel;

    @NonNull
    public final TextView slopeDownPercent;

    @NonNull
    public final TextView slopeDownTime;

    @NonNull
    public final TextView slopeFlatPercent;

    @NonNull
    public final TextView slopeFlatTime;

    @NonNull
    public final SlopePieChartView slopePieChart;

    @NonNull
    public final TextView slopeUpPercent;

    @NonNull
    public final TextView slopeUpTime;

    @NonNull
    public final LinearLayout slopeUpTitle;

    private LayoutCyclingSlopeBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull LinearLayout linearLayout5, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull SlopePieChartView slopePieChartView, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull LinearLayout linearLayout6) {
        this.a = linearLayout;
        this.downUpTitle = linearLayout2;
        this.flatUpTitle = linearLayout3;
        this.normalSlopeDataContainer = linearLayout4;
        this.pieChartLabel = linearLayout5;
        this.slopeDownPercent = textView;
        this.slopeDownTime = textView2;
        this.slopeFlatPercent = textView3;
        this.slopeFlatTime = textView4;
        this.slopePieChart = slopePieChartView;
        this.slopeUpPercent = textView5;
        this.slopeUpTime = textView6;
        this.slopeUpTitle = linearLayout6;
    }

    @NonNull
    public static LayoutCyclingSlopeBinding bind(@NonNull View view) {
        int i = R.id.down_up_title;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.flat_up_title;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout2 != null) {
                LinearLayout linearLayout3 = (LinearLayout) view;
                i = R.id.pieChartLabel;
                LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout4 != null) {
                    i = R.id.slopeDownPercent;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        i = R.id.slopeDownTime;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView2 != null) {
                            i = R.id.slopeFlatPercent;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView3 != null) {
                                i = R.id.slopeFlatTime;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView4 != null) {
                                    i = R.id.slopePieChart;
                                    SlopePieChartView slopePieChartView = (SlopePieChartView) ViewBindings.findChildViewById(view, i);
                                    if (slopePieChartView != null) {
                                        i = R.id.slopeUpPercent;
                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView5 != null) {
                                            i = R.id.slopeUpTime;
                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView6 != null) {
                                                i = R.id.slope_up_title;
                                                LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                if (linearLayout5 != null) {
                                                    return new LayoutCyclingSlopeBinding(linearLayout3, linearLayout, linearLayout2, linearLayout3, linearLayout4, textView, textView2, textView3, textView4, slopePieChartView, textView5, textView6, linearLayout5);
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
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static LayoutCyclingSlopeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static LayoutCyclingSlopeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_cycling_slope, viewGroup, false);
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

package com.xiaomi.hm.health.bodyfat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.lib.view.dim.DimPanelBottomBar;
import com.huami.view.weightfigure.WeightFigureView;
import com.huami.widget.typeface.TypefaceTextView;
import com.xiaomi.hm.health.bodyfat.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityWeightGoalsSettingBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final DimPanelBottomBar bottomBar;

    @NonNull
    public final TextView confirmBtn;

    @NonNull
    public final TextView tipTv;

    @NonNull
    public final WeightFigureView weightFigureView;

    @NonNull
    public final TextView weightUnitTv;

    @NonNull
    public final LinearLayout weightValueLl;

    @NonNull
    public final TypefaceTextView weightValueTv;

    private ActivityWeightGoalsSettingBinding(@NonNull LinearLayout linearLayout, @NonNull DimPanelBottomBar dimPanelBottomBar, @NonNull TextView textView, @NonNull TextView textView2, @NonNull WeightFigureView weightFigureView, @NonNull TextView textView3, @NonNull LinearLayout linearLayout2, @NonNull TypefaceTextView typefaceTextView) {
        this.a = linearLayout;
        this.bottomBar = dimPanelBottomBar;
        this.confirmBtn = textView;
        this.tipTv = textView2;
        this.weightFigureView = weightFigureView;
        this.weightUnitTv = textView3;
        this.weightValueLl = linearLayout2;
        this.weightValueTv = typefaceTextView;
    }

    @NonNull
    public static ActivityWeightGoalsSettingBinding bind(@NonNull View view) {
        int i = R.id.bottom_bar;
        DimPanelBottomBar dimPanelBottomBar = (DimPanelBottomBar) ViewBindings.findChildViewById(view, i);
        if (dimPanelBottomBar != null) {
            i = R.id.confirm_btn;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R.id.tip_tv;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    i = R.id.weight_figure_view;
                    WeightFigureView weightFigureView = (WeightFigureView) ViewBindings.findChildViewById(view, i);
                    if (weightFigureView != null) {
                        i = R.id.weight_unit_tv;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView3 != null) {
                            i = R.id.weight_value_ll;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                            if (linearLayout != null) {
                                i = R.id.weight_value_tv;
                                TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                                if (typefaceTextView != null) {
                                    return new ActivityWeightGoalsSettingBinding((LinearLayout) view, dimPanelBottomBar, textView, textView2, weightFigureView, textView3, linearLayout, typefaceTextView);
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
    public static ActivityWeightGoalsSettingBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityWeightGoalsSettingBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_weight_goals_setting, viewGroup, false);
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

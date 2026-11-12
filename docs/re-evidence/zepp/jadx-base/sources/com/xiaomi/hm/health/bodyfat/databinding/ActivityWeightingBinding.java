package com.xiaomi.hm.health.bodyfat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.view.WeightingDynamicWeightView;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityWeightingBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final TextView smallWeightTips;

    @NonNull
    public final WeightingDynamicWeightView weightDynamicView;

    @NonNull
    public final TextView weightingTitleId;

    private ActivityWeightingBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull WeightingDynamicWeightView weightingDynamicWeightView, @NonNull TextView textView2) {
        this.a = relativeLayout;
        this.smallWeightTips = textView;
        this.weightDynamicView = weightingDynamicWeightView;
        this.weightingTitleId = textView2;
    }

    @NonNull
    public static ActivityWeightingBinding bind(@NonNull View view) {
        int i = R.id.small_weight_tips;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.weight_dynamic_view;
            WeightingDynamicWeightView weightingDynamicWeightView = (WeightingDynamicWeightView) ViewBindings.findChildViewById(view, i);
            if (weightingDynamicWeightView != null) {
                i = R.id.weighting_title_id;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    return new ActivityWeightingBinding((RelativeLayout) view, textView, weightingDynamicWeightView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityWeightingBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityWeightingBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_weighting, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.a;
    }
}

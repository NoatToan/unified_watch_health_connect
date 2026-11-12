package com.xiaomi.hm.health.bodyfat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.view.WeightingDynamicWeightView;

/* JADX INFO: loaded from: classes19.dex */
public final class FragmentOneFootBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final FrameLayout familyContainer;

    @NonNull
    public final WeightingDynamicWeightView weightDynamicView;

    @NonNull
    public final TextView weightingTitleId;

    private FragmentOneFootBinding(@NonNull RelativeLayout relativeLayout, @NonNull FrameLayout frameLayout, @NonNull WeightingDynamicWeightView weightingDynamicWeightView, @NonNull TextView textView) {
        this.a = relativeLayout;
        this.familyContainer = frameLayout;
        this.weightDynamicView = weightingDynamicWeightView;
        this.weightingTitleId = textView;
    }

    @NonNull
    public static FragmentOneFootBinding bind(@NonNull View view) {
        int i = R.id.family_container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = R.id.weight_dynamic_view;
            WeightingDynamicWeightView weightingDynamicWeightView = (WeightingDynamicWeightView) ViewBindings.findChildViewById(view, i);
            if (weightingDynamicWeightView != null) {
                i = R.id.weighting_title_id;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    return new FragmentOneFootBinding((RelativeLayout) view, frameLayout, weightingDynamicWeightView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOneFootBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneFootBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_one_foot, viewGroup, false);
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

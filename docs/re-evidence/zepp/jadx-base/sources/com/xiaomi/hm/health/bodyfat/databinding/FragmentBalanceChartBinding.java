package com.xiaomi.hm.health.bodyfat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.view.WeightUserQuickPicker;

/* JADX INFO: loaded from: classes19.dex */
public final class FragmentBalanceChartBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final RelativeLayout chartContainer;

    @NonNull
    public final WeightUserQuickPicker userPicker;

    private FragmentBalanceChartBinding(@NonNull LinearLayout linearLayout, @NonNull RelativeLayout relativeLayout, @NonNull WeightUserQuickPicker weightUserQuickPicker) {
        this.a = linearLayout;
        this.chartContainer = relativeLayout;
        this.userPicker = weightUserQuickPicker;
    }

    @NonNull
    public static FragmentBalanceChartBinding bind(@NonNull View view) {
        int i = R.id.chart_container;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
        if (relativeLayout != null) {
            i = R.id.user_picker;
            WeightUserQuickPicker weightUserQuickPicker = (WeightUserQuickPicker) ViewBindings.findChildViewById(view, i);
            if (weightUserQuickPicker != null) {
                return new FragmentBalanceChartBinding((LinearLayout) view, relativeLayout, weightUserQuickPicker);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentBalanceChartBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentBalanceChartBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_balance_chart, viewGroup, false);
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

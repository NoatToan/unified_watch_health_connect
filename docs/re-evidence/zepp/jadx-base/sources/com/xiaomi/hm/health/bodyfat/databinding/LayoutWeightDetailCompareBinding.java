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

/* JADX INFO: loaded from: classes19.dex */
public final class LayoutWeightDetailCompareBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final TextView tvCompareSubtitle;

    @NonNull
    public final TextView tvCompareTitle;

    @NonNull
    public final RelativeLayout weightCompareChart;

    @NonNull
    public final TextView weightCompareTitle;

    private LayoutWeightDetailCompareBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull RelativeLayout relativeLayout2, @NonNull TextView textView3) {
        this.a = relativeLayout;
        this.tvCompareSubtitle = textView;
        this.tvCompareTitle = textView2;
        this.weightCompareChart = relativeLayout2;
        this.weightCompareTitle = textView3;
    }

    @NonNull
    public static LayoutWeightDetailCompareBinding bind(@NonNull View view) {
        int i = R.id.tv_compare_subtitle;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.tv_compare_title;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null) {
                i = R.id.weight_compare_chart;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                if (relativeLayout != null) {
                    i = R.id.weight_compare_title;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView3 != null) {
                        return new LayoutWeightDetailCompareBinding((RelativeLayout) view, textView, textView2, relativeLayout, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static LayoutWeightDetailCompareBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static LayoutWeightDetailCompareBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_weight_detail_compare, viewGroup, false);
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

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
public final class WeightingFatMeasureFailOpBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final TextView weightingBfAbandon;

    @NonNull
    public final TextView weightingBfHelp;

    @NonNull
    public final TextView weightingBfSave;

    @NonNull
    public final RelativeLayout weightingResultOpRl;

    private WeightingFatMeasureFailOpBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull RelativeLayout relativeLayout2) {
        this.a = relativeLayout;
        this.weightingBfAbandon = textView;
        this.weightingBfHelp = textView2;
        this.weightingBfSave = textView3;
        this.weightingResultOpRl = relativeLayout2;
    }

    @NonNull
    public static WeightingFatMeasureFailOpBinding bind(@NonNull View view) {
        int i = R.id.weighting_bf_abandon;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.weighting_bf_help;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null) {
                i = R.id.weighting_bf_save;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView3 != null) {
                    RelativeLayout relativeLayout = (RelativeLayout) view;
                    return new WeightingFatMeasureFailOpBinding(relativeLayout, textView, textView2, textView3, relativeLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static WeightingFatMeasureFailOpBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static WeightingFatMeasureFailOpBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.weighting_fat_measure_fail_op, viewGroup, false);
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

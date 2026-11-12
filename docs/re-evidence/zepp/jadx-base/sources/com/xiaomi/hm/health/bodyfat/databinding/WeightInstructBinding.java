package com.xiaomi.hm.health.bodyfat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.xiaomi.hm.health.bodyfat.R;

/* JADX INFO: loaded from: classes19.dex */
public final class WeightInstructBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final ImageView instructionWeightFlatwise;

    @NonNull
    public final RelativeLayout instructionWeightPage6;

    @NonNull
    public final LinearLayout instructionWeightPage6Tips1;

    @NonNull
    public final RelativeLayout instructionWeightPage6Tips2;

    @NonNull
    public final LinearLayout instructionWeightPage6Tips3;

    private WeightInstructBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull RelativeLayout relativeLayout, @NonNull LinearLayout linearLayout, @NonNull RelativeLayout relativeLayout2, @NonNull LinearLayout linearLayout2) {
        this.a = constraintLayout;
        this.instructionWeightFlatwise = imageView;
        this.instructionWeightPage6 = relativeLayout;
        this.instructionWeightPage6Tips1 = linearLayout;
        this.instructionWeightPage6Tips2 = relativeLayout2;
        this.instructionWeightPage6Tips3 = linearLayout2;
    }

    @NonNull
    public static WeightInstructBinding bind(@NonNull View view) {
        int i = R.id.instruction_weight_flatwise;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.instruction_weight_page_6;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
            if (relativeLayout != null) {
                i = R.id.instruction_weight_page6_tips1;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    i = R.id.instruction_weight_page6_tips2;
                    RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                    if (relativeLayout2 != null) {
                        i = R.id.instruction_weight_page6_tips3;
                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout2 != null) {
                            return new WeightInstructBinding((ConstraintLayout) view, imageView, relativeLayout, linearLayout, relativeLayout2, linearLayout2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static WeightInstructBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static WeightInstructBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.weight_instruct, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.a;
    }
}

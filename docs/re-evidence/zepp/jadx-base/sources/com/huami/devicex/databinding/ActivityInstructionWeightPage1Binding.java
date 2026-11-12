package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.huami.devicex.R;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class ActivityInstructionWeightPage1Binding implements ViewBinding {

    @NonNull
    private final FrameLayout a;

    private ActivityInstructionWeightPage1Binding(@NonNull FrameLayout frameLayout) {
        this.a = frameLayout;
    }

    @NonNull
    public static ActivityInstructionWeightPage1Binding bind(@NonNull View view) {
        Objects.requireNonNull(view, "rootView");
        return new ActivityInstructionWeightPage1Binding((FrameLayout) view);
    }

    @NonNull
    public static ActivityInstructionWeightPage1Binding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityInstructionWeightPage1Binding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_instruction_weight_page_1, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.a;
    }
}

package com.xiaomi.hm.health.bodyfat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.xiaomi.hm.health.bodyfat.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityMeasureBalanceScoreBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final FrameLayout fragmentContainer;

    private ActivityMeasureBalanceScoreBinding(@NonNull ConstraintLayout constraintLayout, @NonNull FrameLayout frameLayout) {
        this.a = constraintLayout;
        this.fragmentContainer = frameLayout;
    }

    @NonNull
    public static ActivityMeasureBalanceScoreBinding bind(@NonNull View view) {
        int i = R.id.fragment_container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            return new ActivityMeasureBalanceScoreBinding((ConstraintLayout) view, frameLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityMeasureBalanceScoreBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityMeasureBalanceScoreBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_measure_balance_score, viewGroup, false);
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

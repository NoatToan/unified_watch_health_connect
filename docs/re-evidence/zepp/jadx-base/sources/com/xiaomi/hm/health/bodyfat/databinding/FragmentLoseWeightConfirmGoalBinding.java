package com.xiaomi.hm.health.bodyfat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.view.RulerView;

/* JADX INFO: loaded from: classes19.dex */
public final class FragmentLoseWeightConfirmGoalBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final AppCompatTextView loseWeightGoalConfirm;

    @NonNull
    public final TextView loseWeightGoalTitle;

    @NonNull
    public final RulerView loseWeightRulerView;

    private FragmentLoseWeightConfirmGoalBinding(@NonNull ConstraintLayout constraintLayout, @NonNull AppCompatTextView appCompatTextView, @NonNull TextView textView, @NonNull RulerView rulerView) {
        this.a = constraintLayout;
        this.loseWeightGoalConfirm = appCompatTextView;
        this.loseWeightGoalTitle = textView;
        this.loseWeightRulerView = rulerView;
    }

    @NonNull
    public static FragmentLoseWeightConfirmGoalBinding bind(@NonNull View view) {
        int i = R.id.lose_weight_goal_confirm;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
        if (appCompatTextView != null) {
            i = R.id.lose_weight_goal_title;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R.id.lose_weight_rulerView;
                RulerView rulerView = (RulerView) ViewBindings.findChildViewById(view, i);
                if (rulerView != null) {
                    return new FragmentLoseWeightConfirmGoalBinding((ConstraintLayout) view, appCompatTextView, textView, rulerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentLoseWeightConfirmGoalBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentLoseWeightConfirmGoalBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_lose_weight_confirm_goal, viewGroup, false);
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

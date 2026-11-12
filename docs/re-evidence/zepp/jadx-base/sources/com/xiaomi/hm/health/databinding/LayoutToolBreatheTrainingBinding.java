package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watch.hmwatchmanager.R;

/* JADX INFO: loaded from: classes20.dex */
public final class LayoutToolBreatheTrainingBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final AppCompatTextView toolBreatheTraining;

    @NonNull
    public final AppCompatTextView toolBreatheTrainingSleep;

    @NonNull
    public final AppCompatTextView toolBreatheTrainingStress;

    private LayoutToolBreatheTrainingBinding(@NonNull ConstraintLayout rootView, @NonNull AppCompatTextView toolBreatheTraining, @NonNull AppCompatTextView toolBreatheTrainingSleep, @NonNull AppCompatTextView toolBreatheTrainingStress) {
        this.a = rootView;
        this.toolBreatheTraining = toolBreatheTraining;
        this.toolBreatheTrainingSleep = toolBreatheTrainingSleep;
        this.toolBreatheTrainingStress = toolBreatheTrainingStress;
    }

    @NonNull
    public static LayoutToolBreatheTrainingBinding bind(@NonNull View rootView) {
        int i = R.id.tool_breathe_training;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.tool_breathe_training);
        if (appCompatTextView != null) {
            i = R.id.tool_breathe_training_sleep;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.tool_breathe_training_sleep);
            if (appCompatTextView2 != null) {
                i = R.id.tool_breathe_training_stress;
                AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.tool_breathe_training_stress);
                if (appCompatTextView3 != null) {
                    return new LayoutToolBreatheTrainingBinding((ConstraintLayout) rootView, appCompatTextView, appCompatTextView2, appCompatTextView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static LayoutToolBreatheTrainingBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static LayoutToolBreatheTrainingBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.layout_tool_breathe_training, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.a;
    }
}

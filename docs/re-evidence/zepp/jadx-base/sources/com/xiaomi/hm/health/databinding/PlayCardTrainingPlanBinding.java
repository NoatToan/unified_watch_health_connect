package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watch.hmwatchmanager.R;
import com.huami.widget.typeface.TypefaceTextView;

/* JADX INFO: loaded from: classes20.dex */
public final class PlayCardTrainingPlanBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final TypefaceTextView tvTrainingPlan;

    @NonNull
    public final TypefaceTextView tvTrainingPlanStart;

    @NonNull
    public final TypefaceTextView tvTrainingPlanTitle;

    private PlayCardTrainingPlanBinding(@NonNull ConstraintLayout rootView, @NonNull TypefaceTextView tvTrainingPlan, @NonNull TypefaceTextView tvTrainingPlanStart, @NonNull TypefaceTextView tvTrainingPlanTitle) {
        this.a = rootView;
        this.tvTrainingPlan = tvTrainingPlan;
        this.tvTrainingPlanStart = tvTrainingPlanStart;
        this.tvTrainingPlanTitle = tvTrainingPlanTitle;
    }

    @NonNull
    public static PlayCardTrainingPlanBinding bind(@NonNull View rootView) {
        int i = R.id.tv_training_plan;
        TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.tv_training_plan);
        if (typefaceTextView != null) {
            i = R.id.tv_training_plan_start;
            TypefaceTextView typefaceTextView2 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.tv_training_plan_start);
            if (typefaceTextView2 != null) {
                i = R.id.tv_training_plan_title;
                TypefaceTextView typefaceTextView3 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.tv_training_plan_title);
                if (typefaceTextView3 != null) {
                    return new PlayCardTrainingPlanBinding((ConstraintLayout) rootView, typefaceTextView, typefaceTextView2, typefaceTextView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static PlayCardTrainingPlanBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static PlayCardTrainingPlanBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.play_card_training_plan, parent, false);
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

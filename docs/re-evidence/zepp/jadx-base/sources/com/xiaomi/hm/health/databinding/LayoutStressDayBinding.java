package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watch.hmwatchmanager.R;
import com.huami.widget.typeface.TypefaceTextView;

/* JADX INFO: loaded from: classes20.dex */
public final class LayoutStressDayBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final LinearLayout cardManualResult;

    @NonNull
    public final TypefaceTextView manualResultDate;

    @NonNull
    public final RecyclerView rcvManualResult;

    @NonNull
    public final AppCompatImageView stressArrowRight;

    @NonNull
    public final TypefaceTextView stressBreatheTraining;

    @NonNull
    public final ConstraintLayout stressBreatheTrainingLayout;

    private LayoutStressDayBinding(@NonNull LinearLayout rootView, @NonNull LinearLayout cardManualResult, @NonNull TypefaceTextView manualResultDate, @NonNull RecyclerView rcvManualResult, @NonNull AppCompatImageView stressArrowRight, @NonNull TypefaceTextView stressBreatheTraining, @NonNull ConstraintLayout stressBreatheTrainingLayout) {
        this.a = rootView;
        this.cardManualResult = cardManualResult;
        this.manualResultDate = manualResultDate;
        this.rcvManualResult = rcvManualResult;
        this.stressArrowRight = stressArrowRight;
        this.stressBreatheTraining = stressBreatheTraining;
        this.stressBreatheTrainingLayout = stressBreatheTrainingLayout;
    }

    @NonNull
    public static LayoutStressDayBinding bind(@NonNull View rootView) {
        int i = R.id.card_manual_result;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.card_manual_result);
        if (linearLayout != null) {
            i = R.id.manual_result_date;
            TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.manual_result_date);
            if (typefaceTextView != null) {
                i = R.id.rcv_manual_result;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.rcv_manual_result);
                if (recyclerView != null) {
                    i = R.id.stress_arrow_right;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.stress_arrow_right);
                    if (appCompatImageView != null) {
                        i = R.id.stress_breathe_training;
                        TypefaceTextView typefaceTextView2 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.stress_breathe_training);
                        if (typefaceTextView2 != null) {
                            i = R.id.stress_breathe_training_layout;
                            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.stress_breathe_training_layout);
                            if (constraintLayout != null) {
                                return new LayoutStressDayBinding((LinearLayout) rootView, linearLayout, typefaceTextView, recyclerView, appCompatImageView, typefaceTextView2, constraintLayout);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static LayoutStressDayBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static LayoutStressDayBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.layout_stress_day, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.a;
    }
}

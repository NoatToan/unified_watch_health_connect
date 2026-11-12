package com.huami.step.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.step.R;

/* JADX INFO: loaded from: classes14.dex */
public final class StepFragementNoSlideBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final FragmentContainerView fgvStepCompareDay;

    @NonNull
    public final FragmentContainerView fgvStepCompareMonth;

    @NonNull
    public final FragmentContainerView fgvStepCompareWeek;

    @NonNull
    public final FragmentContainerView fgvStepGoal;

    @NonNull
    public final FragmentContainerView frgStepGame;

    private StepFragementNoSlideBinding(@NonNull LinearLayout linearLayout, @NonNull FragmentContainerView fragmentContainerView, @NonNull FragmentContainerView fragmentContainerView2, @NonNull FragmentContainerView fragmentContainerView3, @NonNull FragmentContainerView fragmentContainerView4, @NonNull FragmentContainerView fragmentContainerView5) {
        this.a = linearLayout;
        this.fgvStepCompareDay = fragmentContainerView;
        this.fgvStepCompareMonth = fragmentContainerView2;
        this.fgvStepCompareWeek = fragmentContainerView3;
        this.fgvStepGoal = fragmentContainerView4;
        this.frgStepGame = fragmentContainerView5;
    }

    @NonNull
    public static StepFragementNoSlideBinding bind(@NonNull View view) {
        int i = R.id.fgv_step_compare_day;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
        if (fragmentContainerView != null) {
            i = R.id.fgv_step_compare_month;
            FragmentContainerView fragmentContainerView2 = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
            if (fragmentContainerView2 != null) {
                i = R.id.fgv_step_compare_week;
                FragmentContainerView fragmentContainerView3 = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
                if (fragmentContainerView3 != null) {
                    i = R.id.fgv_step_goal;
                    FragmentContainerView fragmentContainerView4 = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
                    if (fragmentContainerView4 != null) {
                        i = R.id.frgStepGame;
                        FragmentContainerView fragmentContainerView5 = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
                        if (fragmentContainerView5 != null) {
                            return new StepFragementNoSlideBinding((LinearLayout) view, fragmentContainerView, fragmentContainerView2, fragmentContainerView3, fragmentContainerView4, fragmentContainerView5);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static StepFragementNoSlideBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static StepFragementNoSlideBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.step_fragement_no_slide, viewGroup, false);
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

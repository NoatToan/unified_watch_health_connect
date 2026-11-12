package com.huami.sky.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.sky.ui.R;

/* JADX INFO: loaded from: classes13.dex */
public final class FragmentWeekPlanEndBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final ConstraintLayout baseContent;

    @NonNull
    public final AppCompatTextView btnWeekplanEnd;

    @NonNull
    public final AppCompatTextView btnWeekplanStart;

    @NonNull
    public final Guideline glBaseEnd;

    @NonNull
    public final Guideline glBaseMid;

    @NonNull
    public final Guideline glBaseStart;

    @NonNull
    public final AppCompatImageView ivWeekplan;

    @NonNull
    public final AppCompatImageView ivWeekplanClose;

    @NonNull
    public final AppCompatTextView tvWeekplanHint;

    private FragmentWeekPlanEndBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull AppCompatTextView appCompatTextView, @NonNull AppCompatTextView appCompatTextView2, @NonNull Guideline guideline, @NonNull Guideline guideline2, @NonNull Guideline guideline3, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatImageView appCompatImageView2, @NonNull AppCompatTextView appCompatTextView3) {
        this.a = constraintLayout;
        this.baseContent = constraintLayout2;
        this.btnWeekplanEnd = appCompatTextView;
        this.btnWeekplanStart = appCompatTextView2;
        this.glBaseEnd = guideline;
        this.glBaseMid = guideline2;
        this.glBaseStart = guideline3;
        this.ivWeekplan = appCompatImageView;
        this.ivWeekplanClose = appCompatImageView2;
        this.tvWeekplanHint = appCompatTextView3;
    }

    @NonNull
    public static FragmentWeekPlanEndBinding bind(@NonNull View view) {
        int i = R.id.base_content;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = R.id.btn_weekplan_end;
            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
            if (appCompatTextView != null) {
                i = R.id.btn_weekplan_start;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                if (appCompatTextView2 != null) {
                    i = R.id.gl_base_end;
                    Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
                    if (guideline != null) {
                        i = R.id.gl_base_mid;
                        Guideline guideline2 = (Guideline) ViewBindings.findChildViewById(view, i);
                        if (guideline2 != null) {
                            i = R.id.gl_base_start;
                            Guideline guideline3 = (Guideline) ViewBindings.findChildViewById(view, i);
                            if (guideline3 != null) {
                                i = R.id.iv_weekplan;
                                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                                if (appCompatImageView != null) {
                                    i = R.id.iv_weekplan_close;
                                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                                    if (appCompatImageView2 != null) {
                                        i = R.id.tv_weekplan_hint;
                                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                        if (appCompatTextView3 != null) {
                                            return new FragmentWeekPlanEndBinding((ConstraintLayout) view, constraintLayout, appCompatTextView, appCompatTextView2, guideline, guideline2, guideline3, appCompatImageView, appCompatImageView2, appCompatTextView3);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentWeekPlanEndBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentWeekPlanEndBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_week_plan_end, viewGroup, false);
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

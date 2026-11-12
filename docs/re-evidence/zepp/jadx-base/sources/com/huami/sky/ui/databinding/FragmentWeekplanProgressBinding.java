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
import com.huami.sky.ui.view.WeekPlanProcessView;

/* JADX INFO: loaded from: classes13.dex */
public final class FragmentWeekplanProgressBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final ConstraintLayout baseContent;

    @NonNull
    public final Guideline glBaseEnd;

    @NonNull
    public final Guideline glBaseStart;

    @NonNull
    public final AppCompatImageView ivWeekplan;

    @NonNull
    public final AppCompatImageView ivWeekplanClose;

    @NonNull
    public final WeekPlanProcessView progressWeekplan;

    @NonNull
    public final AppCompatTextView tvWeekplanHint;

    private FragmentWeekplanProgressBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull Guideline guideline, @NonNull Guideline guideline2, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatImageView appCompatImageView2, @NonNull WeekPlanProcessView weekPlanProcessView, @NonNull AppCompatTextView appCompatTextView) {
        this.a = constraintLayout;
        this.baseContent = constraintLayout2;
        this.glBaseEnd = guideline;
        this.glBaseStart = guideline2;
        this.ivWeekplan = appCompatImageView;
        this.ivWeekplanClose = appCompatImageView2;
        this.progressWeekplan = weekPlanProcessView;
        this.tvWeekplanHint = appCompatTextView;
    }

    @NonNull
    public static FragmentWeekplanProgressBinding bind(@NonNull View view) {
        int i = R.id.base_content;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = R.id.gl_base_end;
            Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
            if (guideline != null) {
                i = R.id.gl_base_start;
                Guideline guideline2 = (Guideline) ViewBindings.findChildViewById(view, i);
                if (guideline2 != null) {
                    i = R.id.iv_weekplan;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                    if (appCompatImageView != null) {
                        i = R.id.iv_weekplan_close;
                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                        if (appCompatImageView2 != null) {
                            i = R.id.progress_weekplan;
                            WeekPlanProcessView weekPlanProcessView = (WeekPlanProcessView) ViewBindings.findChildViewById(view, i);
                            if (weekPlanProcessView != null) {
                                i = R.id.tv_weekplan_hint;
                                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                if (appCompatTextView != null) {
                                    return new FragmentWeekplanProgressBinding((ConstraintLayout) view, constraintLayout, guideline, guideline2, appCompatImageView, appCompatImageView2, weekPlanProcessView, appCompatTextView);
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
    public static FragmentWeekplanProgressBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentWeekplanProgressBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_weekplan_progress, viewGroup, false);
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

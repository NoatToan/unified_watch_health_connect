package com.huami.sky.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.sky.ui.R;

/* JADX INFO: loaded from: classes13.dex */
public final class FragmentRecommendElementBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final ConstraintLayout containerElements;

    @NonNull
    public final ConstraintLayout containerResthrElement;

    @NonNull
    public final ConstraintLayout containerSleepElement;

    @NonNull
    public final ConstraintLayout containerStepElement;

    @NonNull
    public final ConstraintLayout containerWakeupElement;

    @NonNull
    public final Space spaceEnd;

    @NonNull
    public final Space spaceStart;

    @NonNull
    public final AppCompatTextView tvRecommondTitle;

    @NonNull
    public final AppCompatTextView tvResthrElementTitle;

    @NonNull
    public final AppCompatTextView tvResthrElementValue;

    @NonNull
    public final AppCompatTextView tvSleepElementTitle;

    @NonNull
    public final AppCompatTextView tvSleepElementValue;

    @NonNull
    public final AppCompatTextView tvStepElementTitle;

    @NonNull
    public final AppCompatTextView tvStepElementValue;

    @NonNull
    public final AppCompatTextView tvWakeupElementTitle;

    @NonNull
    public final AppCompatTextView tvWakeupElementValue;

    private FragmentRecommendElementBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull ConstraintLayout constraintLayout3, @NonNull ConstraintLayout constraintLayout4, @NonNull ConstraintLayout constraintLayout5, @NonNull ConstraintLayout constraintLayout6, @NonNull Space space, @NonNull Space space2, @NonNull AppCompatTextView appCompatTextView, @NonNull AppCompatTextView appCompatTextView2, @NonNull AppCompatTextView appCompatTextView3, @NonNull AppCompatTextView appCompatTextView4, @NonNull AppCompatTextView appCompatTextView5, @NonNull AppCompatTextView appCompatTextView6, @NonNull AppCompatTextView appCompatTextView7, @NonNull AppCompatTextView appCompatTextView8, @NonNull AppCompatTextView appCompatTextView9) {
        this.a = constraintLayout;
        this.containerElements = constraintLayout2;
        this.containerResthrElement = constraintLayout3;
        this.containerSleepElement = constraintLayout4;
        this.containerStepElement = constraintLayout5;
        this.containerWakeupElement = constraintLayout6;
        this.spaceEnd = space;
        this.spaceStart = space2;
        this.tvRecommondTitle = appCompatTextView;
        this.tvResthrElementTitle = appCompatTextView2;
        this.tvResthrElementValue = appCompatTextView3;
        this.tvSleepElementTitle = appCompatTextView4;
        this.tvSleepElementValue = appCompatTextView5;
        this.tvStepElementTitle = appCompatTextView6;
        this.tvStepElementValue = appCompatTextView7;
        this.tvWakeupElementTitle = appCompatTextView8;
        this.tvWakeupElementValue = appCompatTextView9;
    }

    @NonNull
    public static FragmentRecommendElementBinding bind(@NonNull View view) {
        int i = R.id.container_elements;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = R.id.container_resthr_element;
            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout2 != null) {
                i = R.id.container_sleep_element;
                ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                if (constraintLayout3 != null) {
                    i = R.id.container_step_element;
                    ConstraintLayout constraintLayout4 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                    if (constraintLayout4 != null) {
                        i = R.id.container_wakeup_element;
                        ConstraintLayout constraintLayout5 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                        if (constraintLayout5 != null) {
                            i = R.id.space_end;
                            Space space = (Space) ViewBindings.findChildViewById(view, i);
                            if (space != null) {
                                i = R.id.space_start;
                                Space space2 = (Space) ViewBindings.findChildViewById(view, i);
                                if (space2 != null) {
                                    i = R.id.tv_recommond_title;
                                    AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                    if (appCompatTextView != null) {
                                        i = R.id.tv_resthr_element_title;
                                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                        if (appCompatTextView2 != null) {
                                            i = R.id.tv_resthr_element_value;
                                            AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                            if (appCompatTextView3 != null) {
                                                i = R.id.tv_sleep_element_title;
                                                AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                if (appCompatTextView4 != null) {
                                                    i = R.id.tv_sleep_element_value;
                                                    AppCompatTextView appCompatTextView5 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                    if (appCompatTextView5 != null) {
                                                        i = R.id.tv_step_element_title;
                                                        AppCompatTextView appCompatTextView6 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                        if (appCompatTextView6 != null) {
                                                            i = R.id.tv_step_element_value;
                                                            AppCompatTextView appCompatTextView7 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                            if (appCompatTextView7 != null) {
                                                                i = R.id.tv_wakeup_element_title;
                                                                AppCompatTextView appCompatTextView8 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                if (appCompatTextView8 != null) {
                                                                    i = R.id.tv_wakeup_element_value;
                                                                    AppCompatTextView appCompatTextView9 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                    if (appCompatTextView9 != null) {
                                                                        return new FragmentRecommendElementBinding((ConstraintLayout) view, constraintLayout, constraintLayout2, constraintLayout3, constraintLayout4, constraintLayout5, space, space2, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4, appCompatTextView5, appCompatTextView6, appCompatTextView7, appCompatTextView8, appCompatTextView9);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
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
    public static FragmentRecommendElementBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentRecommendElementBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_recommend_element, viewGroup, false);
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

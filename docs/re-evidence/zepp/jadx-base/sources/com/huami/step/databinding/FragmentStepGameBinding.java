package com.huami.step.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.hmchartui.ui.view.CommonCardView;
import com.huami.step.R;
import com.huami.widget.typeface.TypefaceTextView;

/* JADX INFO: loaded from: classes14.dex */
public final class FragmentStepGameBinding implements ViewBinding {

    @NonNull
    private final CommonCardView a;

    @NonNull
    public final Barrier barrier;

    @NonNull
    public final ConstraintLayout cardStepGame;

    @NonNull
    public final CommonCardView rootStepGame;

    @NonNull
    public final ProgressBar stepPb;

    @NonNull
    public final ConstraintLayout stepPbContainer;

    @NonNull
    public final TypefaceTextView stepPbDesc;

    @NonNull
    public final TypefaceTextView stepSubTitle;

    @NonNull
    public final TypefaceTextView stepTvBtn;

    @NonNull
    public final TypefaceTextView stepTvTitle;

    private FragmentStepGameBinding(@NonNull CommonCardView commonCardView, @NonNull Barrier barrier, @NonNull ConstraintLayout constraintLayout, @NonNull CommonCardView commonCardView2, @NonNull ProgressBar progressBar, @NonNull ConstraintLayout constraintLayout2, @NonNull TypefaceTextView typefaceTextView, @NonNull TypefaceTextView typefaceTextView2, @NonNull TypefaceTextView typefaceTextView3, @NonNull TypefaceTextView typefaceTextView4) {
        this.a = commonCardView;
        this.barrier = barrier;
        this.cardStepGame = constraintLayout;
        this.rootStepGame = commonCardView2;
        this.stepPb = progressBar;
        this.stepPbContainer = constraintLayout2;
        this.stepPbDesc = typefaceTextView;
        this.stepSubTitle = typefaceTextView2;
        this.stepTvBtn = typefaceTextView3;
        this.stepTvTitle = typefaceTextView4;
    }

    @NonNull
    public static FragmentStepGameBinding bind(@NonNull View view) {
        int i = R.id.barrier;
        Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i);
        if (barrier != null) {
            i = R.id.card_step_game;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout != null) {
                CommonCardView commonCardView = (CommonCardView) view;
                i = R.id.step_pb;
                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, i);
                if (progressBar != null) {
                    i = R.id.step_pb_container;
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                    if (constraintLayout2 != null) {
                        i = R.id.step_pb_desc;
                        TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                        if (typefaceTextView != null) {
                            i = R.id.step_sub_title;
                            TypefaceTextView typefaceTextView2 = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                            if (typefaceTextView2 != null) {
                                i = R.id.step_tv_btn;
                                TypefaceTextView typefaceTextView3 = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                                if (typefaceTextView3 != null) {
                                    i = R.id.step_tv_title;
                                    TypefaceTextView typefaceTextView4 = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                                    if (typefaceTextView4 != null) {
                                        return new FragmentStepGameBinding(commonCardView, barrier, constraintLayout, commonCardView, progressBar, constraintLayout2, typefaceTextView, typefaceTextView2, typefaceTextView3, typefaceTextView4);
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
    public static FragmentStepGameBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentStepGameBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_step_game, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CommonCardView getRoot() {
        return this.a;
    }
}

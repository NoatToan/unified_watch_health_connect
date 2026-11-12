package com.huami.step.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.hmchartui.ui.view.CommonCardView;
import com.huami.step.R;
import com.huami.widget.typeface.TypefaceTextView;

/* JADX INFO: loaded from: classes14.dex */
public final class FragmentStepGameV2Binding implements ViewBinding {

    @NonNull
    private final CommonCardView a;

    @NonNull
    public final ConstraintLayout bgGameContent;

    @NonNull
    public final ImageView imgBackground;

    @NonNull
    public final CommonCardView rootStepGame;

    @NonNull
    public final ProgressBar stepPb;

    @NonNull
    public final ConstraintLayout stepPbContainer;

    @NonNull
    public final TypefaceTextView stepSubTitle;

    @NonNull
    public final TypefaceTextView stepTvBtn;

    @NonNull
    public final TypefaceTextView stepTvTitle;

    private FragmentStepGameV2Binding(@NonNull CommonCardView commonCardView, @NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull CommonCardView commonCardView2, @NonNull ProgressBar progressBar, @NonNull ConstraintLayout constraintLayout2, @NonNull TypefaceTextView typefaceTextView, @NonNull TypefaceTextView typefaceTextView2, @NonNull TypefaceTextView typefaceTextView3) {
        this.a = commonCardView;
        this.bgGameContent = constraintLayout;
        this.imgBackground = imageView;
        this.rootStepGame = commonCardView2;
        this.stepPb = progressBar;
        this.stepPbContainer = constraintLayout2;
        this.stepSubTitle = typefaceTextView;
        this.stepTvBtn = typefaceTextView2;
        this.stepTvTitle = typefaceTextView3;
    }

    @NonNull
    public static FragmentStepGameV2Binding bind(@NonNull View view) {
        int i = R.id.bg_game_content;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = R.id.img_background;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                CommonCardView commonCardView = (CommonCardView) view;
                i = R.id.step_pb;
                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, i);
                if (progressBar != null) {
                    i = R.id.step_pb_container;
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                    if (constraintLayout2 != null) {
                        i = R.id.step_sub_title;
                        TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                        if (typefaceTextView != null) {
                            i = R.id.step_tv_btn;
                            TypefaceTextView typefaceTextView2 = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                            if (typefaceTextView2 != null) {
                                i = R.id.step_tv_title;
                                TypefaceTextView typefaceTextView3 = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                                if (typefaceTextView3 != null) {
                                    return new FragmentStepGameV2Binding(commonCardView, constraintLayout, imageView, commonCardView, progressBar, constraintLayout2, typefaceTextView, typefaceTextView2, typefaceTextView3);
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
    public static FragmentStepGameV2Binding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentStepGameV2Binding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_step_game_v2, viewGroup, false);
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

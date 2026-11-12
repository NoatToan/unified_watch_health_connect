package com.huami.sky.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.huami.sky.ui.R;
import com.huami.sky.ui.view.SkyPlayView;

/* JADX INFO: loaded from: classes13.dex */
public final class SkyItemPreferenceBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final TextView content;

    @NonNull
    public final AppCompatImageView desc;

    @NonNull
    public final View divider;

    @NonNull
    public final LottieAnimationView dividerAnim;

    @NonNull
    public final LottieAnimationView playAnim;

    @NonNull
    public final SkyPlayView playView;

    @NonNull
    public final LottieAnimationView selected;

    private SkyItemPreferenceBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull AppCompatImageView appCompatImageView, @NonNull View view, @NonNull LottieAnimationView lottieAnimationView, @NonNull LottieAnimationView lottieAnimationView2, @NonNull SkyPlayView skyPlayView, @NonNull LottieAnimationView lottieAnimationView3) {
        this.a = constraintLayout;
        this.content = textView;
        this.desc = appCompatImageView;
        this.divider = view;
        this.dividerAnim = lottieAnimationView;
        this.playAnim = lottieAnimationView2;
        this.playView = skyPlayView;
        this.selected = lottieAnimationView3;
    }

    @NonNull
    public static SkyItemPreferenceBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        int i = R.id.content;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.desc;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.divider))) != null) {
                i = R.id.divider_anim;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
                if (lottieAnimationView != null) {
                    i = R.id.play_anim;
                    LottieAnimationView lottieAnimationView2 = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
                    if (lottieAnimationView2 != null) {
                        i = R.id.playView;
                        SkyPlayView skyPlayView = (SkyPlayView) ViewBindings.findChildViewById(view, i);
                        if (skyPlayView != null) {
                            i = R.id.selected;
                            LottieAnimationView lottieAnimationView3 = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
                            if (lottieAnimationView3 != null) {
                                return new SkyItemPreferenceBinding((ConstraintLayout) view, textView, appCompatImageView, viewFindChildViewById, lottieAnimationView, lottieAnimationView2, skyPlayView, lottieAnimationView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static SkyItemPreferenceBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static SkyItemPreferenceBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.sky_item_preference, viewGroup, false);
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

package com.huami.module.homepage.databinding;

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
import com.google.android.material.imageview.ShapeableImageView;
import com.huami.module.homepage.R;

/* JADX INFO: loaded from: classes11.dex */
public final class HomepageItemCardStarSkyBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final TextView homepageBeta;

    @NonNull
    public final TextView homepageFree;

    @NonNull
    public final ShapeableImageView homepageLike;

    @NonNull
    public final LottieAnimationView homepageLoading;

    @NonNull
    public final LottieAnimationView homepageLottieMain;

    @NonNull
    public final AppCompatImageView homepagePlayBg;

    @NonNull
    public final AppCompatImageView homepagePlayState;

    @NonNull
    public final TextView homepageTitle;

    @NonNull
    public final ShapeableImageView homepageUnlike;

    private HomepageItemCardStarSkyBinding(@NonNull ConstraintLayout rootView, @NonNull TextView homepageBeta, @NonNull TextView homepageFree, @NonNull ShapeableImageView homepageLike, @NonNull LottieAnimationView homepageLoading, @NonNull LottieAnimationView homepageLottieMain, @NonNull AppCompatImageView homepagePlayBg, @NonNull AppCompatImageView homepagePlayState, @NonNull TextView homepageTitle, @NonNull ShapeableImageView homepageUnlike) {
        this.a = rootView;
        this.homepageBeta = homepageBeta;
        this.homepageFree = homepageFree;
        this.homepageLike = homepageLike;
        this.homepageLoading = homepageLoading;
        this.homepageLottieMain = homepageLottieMain;
        this.homepagePlayBg = homepagePlayBg;
        this.homepagePlayState = homepagePlayState;
        this.homepageTitle = homepageTitle;
        this.homepageUnlike = homepageUnlike;
    }

    @NonNull
    public static HomepageItemCardStarSkyBinding bind(@NonNull View rootView) {
        int i = R.id.homepage_beta;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
        if (textView != null) {
            i = R.id.homepage_free;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, i);
            if (textView2 != null) {
                i = R.id.homepage_like;
                ShapeableImageView shapeableImageView = (ShapeableImageView) ViewBindings.findChildViewById(rootView, i);
                if (shapeableImageView != null) {
                    i = R.id.homepage_loading;
                    LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(rootView, i);
                    if (lottieAnimationView != null) {
                        i = R.id.homepage_lottie_main;
                        LottieAnimationView lottieAnimationView2 = (LottieAnimationView) ViewBindings.findChildViewById(rootView, i);
                        if (lottieAnimationView2 != null) {
                            i = R.id.homepage_play_bg;
                            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(rootView, i);
                            if (appCompatImageView != null) {
                                i = R.id.homepage_play_state;
                                AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(rootView, i);
                                if (appCompatImageView2 != null) {
                                    i = R.id.homepage_title;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                    if (textView3 != null) {
                                        i = R.id.homepage_unlike;
                                        ShapeableImageView shapeableImageView2 = (ShapeableImageView) ViewBindings.findChildViewById(rootView, i);
                                        if (shapeableImageView2 != null) {
                                            return new HomepageItemCardStarSkyBinding((ConstraintLayout) rootView, textView, textView2, shapeableImageView, lottieAnimationView, lottieAnimationView2, appCompatImageView, appCompatImageView2, textView3, shapeableImageView2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static HomepageItemCardStarSkyBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static HomepageItemCardStarSkyBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.homepage_item_card_star_sky, parent, false);
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

package com.huami.sky.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.huami.sky.ui.R;
import com.huami.sky.ui.view.SkyCircularProgressView;
import java.util.Objects;

/* JADX INFO: loaded from: classes13.dex */
public final class SkyLayoutPlayViewBinding implements ViewBinding {

    @NonNull
    private final View a;

    @NonNull
    public final SkyCircularProgressView countTimeProgressView;

    @NonNull
    public final LottieAnimationView loading;

    @NonNull
    public final AppCompatImageView play;

    private SkyLayoutPlayViewBinding(@NonNull View view, @NonNull SkyCircularProgressView skyCircularProgressView, @NonNull LottieAnimationView lottieAnimationView, @NonNull AppCompatImageView appCompatImageView) {
        this.a = view;
        this.countTimeProgressView = skyCircularProgressView;
        this.loading = lottieAnimationView;
        this.play = appCompatImageView;
    }

    @NonNull
    public static SkyLayoutPlayViewBinding bind(@NonNull View view) {
        int i = R.id.countTimeProgressView;
        SkyCircularProgressView skyCircularProgressView = (SkyCircularProgressView) ViewBindings.findChildViewById(view, i);
        if (skyCircularProgressView != null) {
            i = R.id.loading;
            LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
            if (lottieAnimationView != null) {
                i = R.id.play;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                if (appCompatImageView != null) {
                    return new SkyLayoutPlayViewBinding(view, skyCircularProgressView, lottieAnimationView, appCompatImageView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static SkyLayoutPlayViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        Objects.requireNonNull(viewGroup, "parent");
        layoutInflater.inflate(R.layout.sky_layout_play_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.a;
    }
}

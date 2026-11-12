package com.huami.healthlabel.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.huami.healthlabel.R;
import java.util.Objects;

/* JADX INFO: loaded from: classes9.dex */
public final class HealthLabelAnimationBinding implements ViewBinding {

    @NonNull
    private final LottieAnimationView a;

    @NonNull
    public final LottieAnimationView healthLabelLottie;

    private HealthLabelAnimationBinding(@NonNull LottieAnimationView rootView, @NonNull LottieAnimationView healthLabelLottie) {
        this.a = rootView;
        this.healthLabelLottie = healthLabelLottie;
    }

    @NonNull
    public static HealthLabelAnimationBinding bind(@NonNull View rootView) {
        Objects.requireNonNull(rootView, "rootView");
        LottieAnimationView lottieAnimationView = (LottieAnimationView) rootView;
        return new HealthLabelAnimationBinding(lottieAnimationView, lottieAnimationView);
    }

    @NonNull
    public static HealthLabelAnimationBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static HealthLabelAnimationBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.health_label_animation, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LottieAnimationView getRoot() {
        return this.a;
    }
}

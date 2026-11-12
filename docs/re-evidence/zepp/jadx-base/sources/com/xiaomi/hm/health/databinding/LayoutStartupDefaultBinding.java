package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.huami.watch.hmwatchmanager.R;

/* JADX INFO: loaded from: classes20.dex */
public final class LayoutStartupDefaultBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final LottieAnimationView startAnimation;

    private LayoutStartupDefaultBinding(@NonNull ConstraintLayout rootView, @NonNull LottieAnimationView startAnimation) {
        this.a = rootView;
        this.startAnimation = startAnimation;
    }

    @NonNull
    public static LayoutStartupDefaultBinding bind(@NonNull View rootView) {
        LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(rootView, R.id.start_animation);
        if (lottieAnimationView != null) {
            return new LayoutStartupDefaultBinding((ConstraintLayout) rootView, lottieAnimationView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.start_animation)));
    }

    @NonNull
    public static LayoutStartupDefaultBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static LayoutStartupDefaultBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.layout_startup_default, parent, false);
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

package com.huami.sky.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.huami.devicestylepower.DeviceImageView;
import com.huami.sky.ui.R;

/* JADX INFO: loaded from: classes13.dex */
public final class FragmentSkyDeviceStatusBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final LottieAnimationView connectingView;

    @NonNull
    public final DeviceImageView deviceImage;

    @NonNull
    public final AppCompatImageView failView;

    private FragmentSkyDeviceStatusBinding(@NonNull ConstraintLayout constraintLayout, @NonNull LottieAnimationView lottieAnimationView, @NonNull DeviceImageView deviceImageView, @NonNull AppCompatImageView appCompatImageView) {
        this.a = constraintLayout;
        this.connectingView = lottieAnimationView;
        this.deviceImage = deviceImageView;
        this.failView = appCompatImageView;
    }

    @NonNull
    public static FragmentSkyDeviceStatusBinding bind(@NonNull View view) {
        int i = R.id.connectingView;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
        if (lottieAnimationView != null) {
            i = R.id.deviceImage;
            DeviceImageView deviceImageView = (DeviceImageView) ViewBindings.findChildViewById(view, i);
            if (deviceImageView != null) {
                i = R.id.failView;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                if (appCompatImageView != null) {
                    return new FragmentSkyDeviceStatusBinding((ConstraintLayout) view, lottieAnimationView, deviceImageView, appCompatImageView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentSkyDeviceStatusBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentSkyDeviceStatusBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_sky_device_status, viewGroup, false);
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

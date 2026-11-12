package com.huami.module.homepage.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.huami.devicestylepower.DeviceImageView;
import com.huami.module.homepage.R;

/* JADX INFO: loaded from: classes11.dex */
public final class HomepageFragmentHomeRefreshBinding implements ViewBinding {

    @NonNull
    private final FrameLayout a;

    @NonNull
    public final LottieAnimationView homepageConnectFailIcon;

    @NonNull
    public final LottieAnimationView homepageConnectSuccessIcon;

    @NonNull
    public final LottieAnimationView homepageConnectingIcon;

    @NonNull
    public final AppCompatImageView homepageDeviceBind;

    @NonNull
    public final DeviceImageView homepageDeviceIcon;

    private HomepageFragmentHomeRefreshBinding(@NonNull FrameLayout rootView, @NonNull LottieAnimationView homepageConnectFailIcon, @NonNull LottieAnimationView homepageConnectSuccessIcon, @NonNull LottieAnimationView homepageConnectingIcon, @NonNull AppCompatImageView homepageDeviceBind, @NonNull DeviceImageView homepageDeviceIcon) {
        this.a = rootView;
        this.homepageConnectFailIcon = homepageConnectFailIcon;
        this.homepageConnectSuccessIcon = homepageConnectSuccessIcon;
        this.homepageConnectingIcon = homepageConnectingIcon;
        this.homepageDeviceBind = homepageDeviceBind;
        this.homepageDeviceIcon = homepageDeviceIcon;
    }

    @NonNull
    public static HomepageFragmentHomeRefreshBinding bind(@NonNull View rootView) {
        int i = R.id.homepage_connect_fail_icon;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(rootView, i);
        if (lottieAnimationView != null) {
            i = R.id.homepage_connect_success_icon;
            LottieAnimationView lottieAnimationView2 = (LottieAnimationView) ViewBindings.findChildViewById(rootView, i);
            if (lottieAnimationView2 != null) {
                i = R.id.homepage_connecting_icon;
                LottieAnimationView lottieAnimationView3 = (LottieAnimationView) ViewBindings.findChildViewById(rootView, i);
                if (lottieAnimationView3 != null) {
                    i = R.id.homepage_device_bind;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(rootView, i);
                    if (appCompatImageView != null) {
                        i = R.id.homepage_device_icon;
                        DeviceImageView deviceImageView = (DeviceImageView) ViewBindings.findChildViewById(rootView, i);
                        if (deviceImageView != null) {
                            return new HomepageFragmentHomeRefreshBinding((FrameLayout) rootView, lottieAnimationView, lottieAnimationView2, lottieAnimationView3, appCompatImageView, deviceImageView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static HomepageFragmentHomeRefreshBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static HomepageFragmentHomeRefreshBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.homepage_fragment_home_refresh, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.a;
    }
}

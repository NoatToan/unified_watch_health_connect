package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.button.MaterialButton;
import com.huami.devicex.R;

/* JADX INFO: loaded from: classes7.dex */
public final class LayoutHeadsetCervicalProtectionNotificationBinding implements ViewBinding {

    @NonNull
    private final FrameLayout a;

    @NonNull
    public final LottieAnimationView animationView;

    @NonNull
    public final ImageView bindHeadsetDeviceCancel;

    @NonNull
    public final MaterialButton cervicalProtectionAudition;

    @NonNull
    public final TextView cervicalProtectionCalibrationHint;

    @NonNull
    public final View headsetLoading;

    private LayoutHeadsetCervicalProtectionNotificationBinding(@NonNull FrameLayout frameLayout, @NonNull LottieAnimationView lottieAnimationView, @NonNull ImageView imageView, @NonNull MaterialButton materialButton, @NonNull TextView textView, @NonNull View view) {
        this.a = frameLayout;
        this.animationView = lottieAnimationView;
        this.bindHeadsetDeviceCancel = imageView;
        this.cervicalProtectionAudition = materialButton;
        this.cervicalProtectionCalibrationHint = textView;
        this.headsetLoading = view;
    }

    @NonNull
    public static LayoutHeadsetCervicalProtectionNotificationBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        int i = R.id.animation_view;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
        if (lottieAnimationView != null) {
            i = R.id.bind_headset_device_cancel;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.cervical_protection_audition;
                MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, i);
                if (materialButton != null) {
                    i = R.id.cervical_protection_calibration_hint;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.headset_loading))) != null) {
                        return new LayoutHeadsetCervicalProtectionNotificationBinding((FrameLayout) view, lottieAnimationView, imageView, materialButton, textView, viewFindChildViewById);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static LayoutHeadsetCervicalProtectionNotificationBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static LayoutHeadsetCervicalProtectionNotificationBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_headset_cervical_protection_notification, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.a;
    }
}

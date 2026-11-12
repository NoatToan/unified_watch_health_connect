package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.ui.smartplay.customvibrate.ui.CustomVibrateIndicator;

/* JADX INFO: loaded from: classes20.dex */
public final class ActivityCustomVibrateBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final CustomVibrateIndicator customIndicator;

    @NonNull
    public final ImageView deviceImg;

    @NonNull
    public final ImageView leftVibrateImg;

    @NonNull
    public final FrameLayout recordContainer;

    @NonNull
    public final ImageView rightVibrateImg;

    @NonNull
    public final TextView stopBtn;

    @NonNull
    public final ImageView vibrateImg;

    @NonNull
    public final RelativeLayout vibrateImgGt;

    @NonNull
    public final TextView vibrateOnDeviceBtn;

    @NonNull
    public final TextView vibrateTooLongTv;

    private ActivityCustomVibrateBinding(@NonNull LinearLayout rootView, @NonNull CustomVibrateIndicator customIndicator, @NonNull ImageView deviceImg, @NonNull ImageView leftVibrateImg, @NonNull FrameLayout recordContainer, @NonNull ImageView rightVibrateImg, @NonNull TextView stopBtn, @NonNull ImageView vibrateImg, @NonNull RelativeLayout vibrateImgGt, @NonNull TextView vibrateOnDeviceBtn, @NonNull TextView vibrateTooLongTv) {
        this.a = rootView;
        this.customIndicator = customIndicator;
        this.deviceImg = deviceImg;
        this.leftVibrateImg = leftVibrateImg;
        this.recordContainer = recordContainer;
        this.rightVibrateImg = rightVibrateImg;
        this.stopBtn = stopBtn;
        this.vibrateImg = vibrateImg;
        this.vibrateImgGt = vibrateImgGt;
        this.vibrateOnDeviceBtn = vibrateOnDeviceBtn;
        this.vibrateTooLongTv = vibrateTooLongTv;
    }

    @NonNull
    public static ActivityCustomVibrateBinding bind(@NonNull View rootView) {
        int i = R.id.custom_indicator;
        CustomVibrateIndicator customVibrateIndicator = (CustomVibrateIndicator) ViewBindings.findChildViewById(rootView, R.id.custom_indicator);
        if (customVibrateIndicator != null) {
            i = R.id.device_img;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.device_img);
            if (imageView != null) {
                i = R.id.left_vibrate_img;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.left_vibrate_img);
                if (imageView2 != null) {
                    i = R.id.record_container;
                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.record_container);
                    if (frameLayout != null) {
                        i = R.id.right_vibrate_img;
                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.right_vibrate_img);
                        if (imageView3 != null) {
                            i = R.id.stop_btn;
                            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.stop_btn);
                            if (textView != null) {
                                i = R.id.vibrate_img;
                                ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.vibrate_img);
                                if (imageView4 != null) {
                                    i = R.id.vibrate_img_gt;
                                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.vibrate_img_gt);
                                    if (relativeLayout != null) {
                                        i = R.id.vibrate_on_device_btn;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.vibrate_on_device_btn);
                                        if (textView2 != null) {
                                            i = R.id.vibrate_too_long_tv;
                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.vibrate_too_long_tv);
                                            if (textView3 != null) {
                                                return new ActivityCustomVibrateBinding((LinearLayout) rootView, customVibrateIndicator, imageView, imageView2, frameLayout, imageView3, textView, imageView4, relativeLayout, textView2, textView3);
                                            }
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
    public static ActivityCustomVibrateBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityCustomVibrateBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_custom_vibrate, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.a;
    }
}

package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.xiaomi.hm.health.device.view.HMLoadingView;
import com.xiaomi.hm.health.device.view.VerifyCodeView;

/* JADX INFO: loaded from: classes7.dex */
public final class ActivityResetDeviceBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final RelativeLayout deviceResetBle;

    @NonNull
    public final RelativeLayout deviceResetConnect;

    @NonNull
    public final RelativeLayout deviceResetInput;

    @NonNull
    public final TextView deviceResetSub;

    @NonNull
    public final TextView deviceResetTitle;

    @NonNull
    public final VerifyCodeView inputNumber;

    @NonNull
    public final HMLoadingView loadingView;

    @NonNull
    public final ImageView vibrateImg;

    private ActivityResetDeviceBinding(@NonNull RelativeLayout relativeLayout, @NonNull RelativeLayout relativeLayout2, @NonNull RelativeLayout relativeLayout3, @NonNull RelativeLayout relativeLayout4, @NonNull TextView textView, @NonNull TextView textView2, @NonNull VerifyCodeView verifyCodeView, @NonNull HMLoadingView hMLoadingView, @NonNull ImageView imageView) {
        this.a = relativeLayout;
        this.deviceResetBle = relativeLayout2;
        this.deviceResetConnect = relativeLayout3;
        this.deviceResetInput = relativeLayout4;
        this.deviceResetSub = textView;
        this.deviceResetTitle = textView2;
        this.inputNumber = verifyCodeView;
        this.loadingView = hMLoadingView;
        this.vibrateImg = imageView;
    }

    @NonNull
    public static ActivityResetDeviceBinding bind(@NonNull View view) {
        int i = R.id.device_reset_ble;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
        if (relativeLayout != null) {
            i = R.id.device_reset_connect;
            RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
            if (relativeLayout2 != null) {
                i = R.id.device_reset_input;
                RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                if (relativeLayout3 != null) {
                    i = R.id.device_reset_sub;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        i = R.id.device_reset_title;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView2 != null) {
                            i = R.id.input_number;
                            VerifyCodeView verifyCodeView = (VerifyCodeView) ViewBindings.findChildViewById(view, i);
                            if (verifyCodeView != null) {
                                i = R.id.loading_view;
                                HMLoadingView hMLoadingView = (HMLoadingView) ViewBindings.findChildViewById(view, i);
                                if (hMLoadingView != null) {
                                    i = R.id.vibrate_img;
                                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                                    if (imageView != null) {
                                        return new ActivityResetDeviceBinding((RelativeLayout) view, relativeLayout, relativeLayout2, relativeLayout3, textView, textView2, verifyCodeView, hMLoadingView, imageView);
                                    }
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
    public static ActivityResetDeviceBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityResetDeviceBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_reset_device, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.a;
    }
}

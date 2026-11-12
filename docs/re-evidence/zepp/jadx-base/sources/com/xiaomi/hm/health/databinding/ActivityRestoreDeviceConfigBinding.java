package com.xiaomi.hm.health.databinding;

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
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.device.view.HMLoadingView;

/* JADX INFO: loaded from: classes20.dex */
public final class ActivityRestoreDeviceConfigBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final ImageView deviceImg;

    @NonNull
    public final HMLoadingView restoreLoadingView;

    @NonNull
    public final TextView restoreTitleTv;

    @NonNull
    public final RelativeLayout workRl;

    private ActivityRestoreDeviceConfigBinding(@NonNull RelativeLayout rootView, @NonNull ImageView deviceImg, @NonNull HMLoadingView restoreLoadingView, @NonNull TextView restoreTitleTv, @NonNull RelativeLayout workRl) {
        this.a = rootView;
        this.deviceImg = deviceImg;
        this.restoreLoadingView = restoreLoadingView;
        this.restoreTitleTv = restoreTitleTv;
        this.workRl = workRl;
    }

    @NonNull
    public static ActivityRestoreDeviceConfigBinding bind(@NonNull View rootView) {
        int i = R.id.device_img;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.device_img);
        if (imageView != null) {
            i = R.id.restore_loading_view;
            HMLoadingView hMLoadingView = (HMLoadingView) ViewBindings.findChildViewById(rootView, R.id.restore_loading_view);
            if (hMLoadingView != null) {
                i = R.id.restore_title_tv;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.restore_title_tv);
                if (textView != null) {
                    i = R.id.work_rl;
                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.work_rl);
                    if (relativeLayout != null) {
                        return new ActivityRestoreDeviceConfigBinding((RelativeLayout) rootView, imageView, hMLoadingView, textView, relativeLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityRestoreDeviceConfigBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityRestoreDeviceConfigBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_restore_device_config, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.a;
    }
}

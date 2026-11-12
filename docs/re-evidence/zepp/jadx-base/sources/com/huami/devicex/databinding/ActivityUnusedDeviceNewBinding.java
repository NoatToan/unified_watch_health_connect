package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.huami.lib.rainbow.ListTile;

/* JADX INFO: loaded from: classes7.dex */
public final class ActivityUnusedDeviceNewBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final ListTile firmwareVersion;

    @NonNull
    public final ConstraintLayout flWatchPicture;

    @NonNull
    public final AppCompatImageView ivDefaultDevice;

    @NonNull
    public final AppCompatImageView ivDeviceShadow;

    @NonNull
    public final AppCompatImageView ivDeviceTransparent;

    @NonNull
    public final AppCompatImageView ivDial;

    @NonNull
    public final AppCompatImageView ivSkin;

    @NonNull
    public final ListTile macAddress;

    @NonNull
    public final Guideline unUsedVerticalLine1;

    @NonNull
    public final Guideline unUsedVerticalLine2;

    @NonNull
    public final AppCompatButton unusedUnbindTv;

    @NonNull
    public final AppCompatButton useDevice;

    private ActivityUnusedDeviceNewBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ListTile listTile, @NonNull ConstraintLayout constraintLayout2, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatImageView appCompatImageView2, @NonNull AppCompatImageView appCompatImageView3, @NonNull AppCompatImageView appCompatImageView4, @NonNull AppCompatImageView appCompatImageView5, @NonNull ListTile listTile2, @NonNull Guideline guideline, @NonNull Guideline guideline2, @NonNull AppCompatButton appCompatButton, @NonNull AppCompatButton appCompatButton2) {
        this.a = constraintLayout;
        this.firmwareVersion = listTile;
        this.flWatchPicture = constraintLayout2;
        this.ivDefaultDevice = appCompatImageView;
        this.ivDeviceShadow = appCompatImageView2;
        this.ivDeviceTransparent = appCompatImageView3;
        this.ivDial = appCompatImageView4;
        this.ivSkin = appCompatImageView5;
        this.macAddress = listTile2;
        this.unUsedVerticalLine1 = guideline;
        this.unUsedVerticalLine2 = guideline2;
        this.unusedUnbindTv = appCompatButton;
        this.useDevice = appCompatButton2;
    }

    @NonNull
    public static ActivityUnusedDeviceNewBinding bind(@NonNull View view) {
        int i = R.id.firmware_version;
        ListTile listTile = (ListTile) ViewBindings.findChildViewById(view, i);
        if (listTile != null) {
            i = R.id.fl_watch_picture;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout != null) {
                i = R.id.iv_default_device;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                if (appCompatImageView != null) {
                    i = R.id.iv_device_shadow;
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                    if (appCompatImageView2 != null) {
                        i = R.id.iv_device_transparent;
                        AppCompatImageView appCompatImageView3 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                        if (appCompatImageView3 != null) {
                            i = R.id.iv_dial;
                            AppCompatImageView appCompatImageView4 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                            if (appCompatImageView4 != null) {
                                i = R.id.iv_skin;
                                AppCompatImageView appCompatImageView5 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                                if (appCompatImageView5 != null) {
                                    i = R.id.mac_address;
                                    ListTile listTile2 = (ListTile) ViewBindings.findChildViewById(view, i);
                                    if (listTile2 != null) {
                                        i = R.id.un_used_vertical_line_1;
                                        Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
                                        if (guideline != null) {
                                            i = R.id.un_used_vertical_line_2;
                                            Guideline guideline2 = (Guideline) ViewBindings.findChildViewById(view, i);
                                            if (guideline2 != null) {
                                                i = R.id.unused_unbind_tv;
                                                AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(view, i);
                                                if (appCompatButton != null) {
                                                    i = R.id.use_device;
                                                    AppCompatButton appCompatButton2 = (AppCompatButton) ViewBindings.findChildViewById(view, i);
                                                    if (appCompatButton2 != null) {
                                                        return new ActivityUnusedDeviceNewBinding((ConstraintLayout) view, listTile, constraintLayout, appCompatImageView, appCompatImageView2, appCompatImageView3, appCompatImageView4, appCompatImageView5, listTile2, guideline, guideline2, appCompatButton, appCompatButton2);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityUnusedDeviceNewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityUnusedDeviceNewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_unused_device_new, viewGroup, false);
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

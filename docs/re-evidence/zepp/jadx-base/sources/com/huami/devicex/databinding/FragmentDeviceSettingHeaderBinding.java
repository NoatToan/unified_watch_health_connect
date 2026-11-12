package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;

/* JADX INFO: loaded from: classes7.dex */
public final class FragmentDeviceSettingHeaderBinding implements ViewBinding {

    @NonNull
    public final ConstraintLayout Root;

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final ConstraintLayout flWatchPicture;

    @NonNull
    public final Group groupBatteryInfo;

    @NonNull
    public final AppCompatImageView iconState;

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
    public final AppCompatTextView retryConnectTv;

    @NonNull
    public final Guideline topLine;

    @NonNull
    public final AppCompatTextView tvBatteryLevel;

    @NonNull
    public final AppCompatTextView tvCharging;

    @NonNull
    public final AppCompatTextView tvDeviceStatus;

    @NonNull
    public final AppCompatTextView tvLastCharge;

    @NonNull
    public final AppCompatTextView tvPercent;

    @NonNull
    public final Guideline verticalLine;

    private FragmentDeviceSettingHeaderBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull ConstraintLayout constraintLayout3, @NonNull Group group, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatImageView appCompatImageView2, @NonNull AppCompatImageView appCompatImageView3, @NonNull AppCompatImageView appCompatImageView4, @NonNull AppCompatImageView appCompatImageView5, @NonNull AppCompatImageView appCompatImageView6, @NonNull AppCompatTextView appCompatTextView, @NonNull Guideline guideline, @NonNull AppCompatTextView appCompatTextView2, @NonNull AppCompatTextView appCompatTextView3, @NonNull AppCompatTextView appCompatTextView4, @NonNull AppCompatTextView appCompatTextView5, @NonNull AppCompatTextView appCompatTextView6, @NonNull Guideline guideline2) {
        this.a = constraintLayout;
        this.Root = constraintLayout2;
        this.flWatchPicture = constraintLayout3;
        this.groupBatteryInfo = group;
        this.iconState = appCompatImageView;
        this.ivDefaultDevice = appCompatImageView2;
        this.ivDeviceShadow = appCompatImageView3;
        this.ivDeviceTransparent = appCompatImageView4;
        this.ivDial = appCompatImageView5;
        this.ivSkin = appCompatImageView6;
        this.retryConnectTv = appCompatTextView;
        this.topLine = guideline;
        this.tvBatteryLevel = appCompatTextView2;
        this.tvCharging = appCompatTextView3;
        this.tvDeviceStatus = appCompatTextView4;
        this.tvLastCharge = appCompatTextView5;
        this.tvPercent = appCompatTextView6;
        this.verticalLine = guideline2;
    }

    @NonNull
    public static FragmentDeviceSettingHeaderBinding bind(@NonNull View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = R.id.fl_watch_picture;
        ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout2 != null) {
            i = R.id.group_battery_info;
            Group group = (Group) ViewBindings.findChildViewById(view, i);
            if (group != null) {
                i = R.id.icon_state;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                if (appCompatImageView != null) {
                    i = R.id.iv_default_device;
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                    if (appCompatImageView2 != null) {
                        i = R.id.iv_device_shadow;
                        AppCompatImageView appCompatImageView3 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                        if (appCompatImageView3 != null) {
                            i = R.id.iv_device_transparent;
                            AppCompatImageView appCompatImageView4 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                            if (appCompatImageView4 != null) {
                                i = R.id.iv_dial;
                                AppCompatImageView appCompatImageView5 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                                if (appCompatImageView5 != null) {
                                    i = R.id.iv_skin;
                                    AppCompatImageView appCompatImageView6 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                                    if (appCompatImageView6 != null) {
                                        i = R.id.retry_connect_tv;
                                        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                        if (appCompatTextView != null) {
                                            i = R.id.top_line;
                                            Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
                                            if (guideline != null) {
                                                i = R.id.tv_battery_level;
                                                AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                if (appCompatTextView2 != null) {
                                                    i = R.id.tv_charging;
                                                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                    if (appCompatTextView3 != null) {
                                                        i = R.id.tv_device_status;
                                                        AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                        if (appCompatTextView4 != null) {
                                                            i = R.id.tv_last_charge;
                                                            AppCompatTextView appCompatTextView5 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                            if (appCompatTextView5 != null) {
                                                                i = R.id.tv_percent;
                                                                AppCompatTextView appCompatTextView6 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                if (appCompatTextView6 != null) {
                                                                    i = R.id.vertical_line;
                                                                    Guideline guideline2 = (Guideline) ViewBindings.findChildViewById(view, i);
                                                                    if (guideline2 != null) {
                                                                        return new FragmentDeviceSettingHeaderBinding(constraintLayout, constraintLayout, constraintLayout2, group, appCompatImageView, appCompatImageView2, appCompatImageView3, appCompatImageView4, appCompatImageView5, appCompatImageView6, appCompatTextView, guideline, appCompatTextView2, appCompatTextView3, appCompatTextView4, appCompatTextView5, appCompatTextView6, guideline2);
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
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentDeviceSettingHeaderBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentDeviceSettingHeaderBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_device_setting_header, viewGroup, false);
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

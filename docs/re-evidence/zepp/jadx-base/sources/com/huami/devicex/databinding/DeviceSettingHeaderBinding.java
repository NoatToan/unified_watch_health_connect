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
public final class DeviceSettingHeaderBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final Guideline batteryLine;

    @NonNull
    public final Group groupBatteryInfo;

    @NonNull
    public final Group groupDeviceStatus;

    @NonNull
    public final Guideline horizontalLine;

    @NonNull
    public final AppCompatImageView iconState;

    @NonNull
    public final Guideline topLine;

    @NonNull
    public final AppCompatTextView tvBatteryLevel;

    @NonNull
    public final AppCompatTextView tvDeviceStatus;

    @NonNull
    public final AppCompatTextView tvDeviceStatusTips;

    @NonNull
    public final AppCompatTextView tvLowBattery;

    @NonNull
    public final AppCompatTextView tvPercent;

    @NonNull
    public final Guideline verticalLine;

    @NonNull
    public final AppCompatImageView weightSettingChart;

    private DeviceSettingHeaderBinding(@NonNull ConstraintLayout constraintLayout, @NonNull Guideline guideline, @NonNull Group group, @NonNull Group group2, @NonNull Guideline guideline2, @NonNull AppCompatImageView appCompatImageView, @NonNull Guideline guideline3, @NonNull AppCompatTextView appCompatTextView, @NonNull AppCompatTextView appCompatTextView2, @NonNull AppCompatTextView appCompatTextView3, @NonNull AppCompatTextView appCompatTextView4, @NonNull AppCompatTextView appCompatTextView5, @NonNull Guideline guideline4, @NonNull AppCompatImageView appCompatImageView2) {
        this.a = constraintLayout;
        this.batteryLine = guideline;
        this.groupBatteryInfo = group;
        this.groupDeviceStatus = group2;
        this.horizontalLine = guideline2;
        this.iconState = appCompatImageView;
        this.topLine = guideline3;
        this.tvBatteryLevel = appCompatTextView;
        this.tvDeviceStatus = appCompatTextView2;
        this.tvDeviceStatusTips = appCompatTextView3;
        this.tvLowBattery = appCompatTextView4;
        this.tvPercent = appCompatTextView5;
        this.verticalLine = guideline4;
        this.weightSettingChart = appCompatImageView2;
    }

    @NonNull
    public static DeviceSettingHeaderBinding bind(@NonNull View view) {
        int i = R.id.battery_line;
        Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
        if (guideline != null) {
            i = R.id.group_battery_info;
            Group group = (Group) ViewBindings.findChildViewById(view, i);
            if (group != null) {
                i = R.id.group_device_status;
                Group group2 = (Group) ViewBindings.findChildViewById(view, i);
                if (group2 != null) {
                    i = R.id.horizontal_line;
                    Guideline guideline2 = (Guideline) ViewBindings.findChildViewById(view, i);
                    if (guideline2 != null) {
                        i = R.id.icon_state;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                        if (appCompatImageView != null) {
                            i = R.id.top_line;
                            Guideline guideline3 = (Guideline) ViewBindings.findChildViewById(view, i);
                            if (guideline3 != null) {
                                i = R.id.tv_battery_level;
                                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                if (appCompatTextView != null) {
                                    i = R.id.tv_device_status;
                                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                    if (appCompatTextView2 != null) {
                                        i = R.id.tv_device_status_tips;
                                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                        if (appCompatTextView3 != null) {
                                            i = R.id.tv_low_battery;
                                            AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                            if (appCompatTextView4 != null) {
                                                i = R.id.tv_percent;
                                                AppCompatTextView appCompatTextView5 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                if (appCompatTextView5 != null) {
                                                    i = R.id.vertical_line;
                                                    Guideline guideline4 = (Guideline) ViewBindings.findChildViewById(view, i);
                                                    if (guideline4 != null) {
                                                        i = R.id.weight_setting_chart;
                                                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                                                        if (appCompatImageView2 != null) {
                                                            return new DeviceSettingHeaderBinding((ConstraintLayout) view, guideline, group, group2, guideline2, appCompatImageView, guideline3, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4, appCompatTextView5, guideline4, appCompatImageView2);
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
    public static DeviceSettingHeaderBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static DeviceSettingHeaderBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.device_setting_header, viewGroup, false);
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

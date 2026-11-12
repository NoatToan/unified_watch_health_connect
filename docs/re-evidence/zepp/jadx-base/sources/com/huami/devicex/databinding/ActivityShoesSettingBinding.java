package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.huami.lib.view.ItemView;
import com.huami.lib.view.scroll.HMExpandHeadView;
import com.huami.lib.view.scroll.HMScrollView;

/* JADX INFO: loaded from: classes7.dex */
public final class ActivityShoesSettingBinding implements ViewBinding {

    @NonNull
    private final HMScrollView a;

    @NonNull
    public final FrameLayout container;

    @NonNull
    public final ItemView macAddress;

    @NonNull
    public final ItemView shoesSettingCalibrate;

    @NonNull
    public final ImageView shoesSettingChart;

    @NonNull
    public final ItemView shoesSettingDistance;

    @NonNull
    public final ItemView shoesSettingFirmwareUpgradeCheck;

    @NonNull
    public final ItemView shoesSettingFirmwareVersion;

    @NonNull
    public final HMExpandHeadView shoesSettingIconRl;

    @NonNull
    public final HMScrollView shoesSettingScroll;

    @NonNull
    public final ItemView shoesSettingStepFreq;

    @NonNull
    public final Button shoesSettingUnbind;

    private ActivityShoesSettingBinding(@NonNull HMScrollView hMScrollView, @NonNull FrameLayout frameLayout, @NonNull ItemView itemView, @NonNull ItemView itemView2, @NonNull ImageView imageView, @NonNull ItemView itemView3, @NonNull ItemView itemView4, @NonNull ItemView itemView5, @NonNull HMExpandHeadView hMExpandHeadView, @NonNull HMScrollView hMScrollView2, @NonNull ItemView itemView6, @NonNull Button button) {
        this.a = hMScrollView;
        this.container = frameLayout;
        this.macAddress = itemView;
        this.shoesSettingCalibrate = itemView2;
        this.shoesSettingChart = imageView;
        this.shoesSettingDistance = itemView3;
        this.shoesSettingFirmwareUpgradeCheck = itemView4;
        this.shoesSettingFirmwareVersion = itemView5;
        this.shoesSettingIconRl = hMExpandHeadView;
        this.shoesSettingScroll = hMScrollView2;
        this.shoesSettingStepFreq = itemView6;
        this.shoesSettingUnbind = button;
    }

    @NonNull
    public static ActivityShoesSettingBinding bind(@NonNull View view) {
        int i = R.id.container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = R.id.mac_address;
            ItemView itemView = (ItemView) ViewBindings.findChildViewById(view, i);
            if (itemView != null) {
                i = R.id.shoes_setting_calibrate;
                ItemView itemView2 = (ItemView) ViewBindings.findChildViewById(view, i);
                if (itemView2 != null) {
                    i = R.id.shoes_setting_chart;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = R.id.shoes_setting_distance;
                        ItemView itemView3 = (ItemView) ViewBindings.findChildViewById(view, i);
                        if (itemView3 != null) {
                            i = R.id.shoes_setting_firmware_upgrade_check;
                            ItemView itemView4 = (ItemView) ViewBindings.findChildViewById(view, i);
                            if (itemView4 != null) {
                                i = R.id.shoes_setting_firmware_version;
                                ItemView itemView5 = (ItemView) ViewBindings.findChildViewById(view, i);
                                if (itemView5 != null) {
                                    i = R.id.shoes_setting_icon_rl;
                                    HMExpandHeadView hMExpandHeadView = (HMExpandHeadView) ViewBindings.findChildViewById(view, i);
                                    if (hMExpandHeadView != null) {
                                        HMScrollView hMScrollView = (HMScrollView) view;
                                        i = R.id.shoes_setting_step_freq;
                                        ItemView itemView6 = (ItemView) ViewBindings.findChildViewById(view, i);
                                        if (itemView6 != null) {
                                            i = R.id.shoes_setting_unbind;
                                            Button button = (Button) ViewBindings.findChildViewById(view, i);
                                            if (button != null) {
                                                return new ActivityShoesSettingBinding(hMScrollView, frameLayout, itemView, itemView2, imageView, itemView3, itemView4, itemView5, hMExpandHeadView, hMScrollView, itemView6, button);
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
    public static ActivityShoesSettingBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityShoesSettingBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_shoes_setting, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public HMScrollView getRoot() {
        return this.a;
    }
}

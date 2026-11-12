package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.huami.lib.view.ItemView;
import com.huami.lib.view.scroll.HMExpandHeadView;
import com.huami.lib.view.scroll.HMScrollView;

/* JADX INFO: loaded from: classes7.dex */
public final class ActivityNormandySettingBinding implements ViewBinding {

    @NonNull
    private final HMScrollView a;

    @NonNull
    public final FrameLayout container;

    @NonNull
    public final LinearLayout contentContainer;

    @NonNull
    public final ItemView macAddress;

    @NonNull
    public final ItemView marsMileage;

    @NonNull
    public final ItemView marsPlaceMode;

    @NonNull
    public final ItemView marsSettingCalibrate;

    @NonNull
    public final ImageView normandySettingChart;

    @NonNull
    public final ItemView normandySettingFirmwareVersion;

    @NonNull
    public final HMExpandHeadView normandySettingIconRl;

    @NonNull
    public final TextView normandySettingLowBatteryTips;

    @NonNull
    public final HMScrollView normandySettingScroll;

    @NonNull
    public final Button normandySettingUnbind;

    private ActivityNormandySettingBinding(@NonNull HMScrollView hMScrollView, @NonNull FrameLayout frameLayout, @NonNull LinearLayout linearLayout, @NonNull ItemView itemView, @NonNull ItemView itemView2, @NonNull ItemView itemView3, @NonNull ItemView itemView4, @NonNull ImageView imageView, @NonNull ItemView itemView5, @NonNull HMExpandHeadView hMExpandHeadView, @NonNull TextView textView, @NonNull HMScrollView hMScrollView2, @NonNull Button button) {
        this.a = hMScrollView;
        this.container = frameLayout;
        this.contentContainer = linearLayout;
        this.macAddress = itemView;
        this.marsMileage = itemView2;
        this.marsPlaceMode = itemView3;
        this.marsSettingCalibrate = itemView4;
        this.normandySettingChart = imageView;
        this.normandySettingFirmwareVersion = itemView5;
        this.normandySettingIconRl = hMExpandHeadView;
        this.normandySettingLowBatteryTips = textView;
        this.normandySettingScroll = hMScrollView2;
        this.normandySettingUnbind = button;
    }

    @NonNull
    public static ActivityNormandySettingBinding bind(@NonNull View view) {
        int i = R.id.container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = R.id.content_container;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = R.id.mac_address;
                ItemView itemView = (ItemView) ViewBindings.findChildViewById(view, i);
                if (itemView != null) {
                    i = R.id.mars_mileage;
                    ItemView itemView2 = (ItemView) ViewBindings.findChildViewById(view, i);
                    if (itemView2 != null) {
                        i = R.id.mars_place_mode;
                        ItemView itemView3 = (ItemView) ViewBindings.findChildViewById(view, i);
                        if (itemView3 != null) {
                            i = R.id.mars_setting_calibrate;
                            ItemView itemView4 = (ItemView) ViewBindings.findChildViewById(view, i);
                            if (itemView4 != null) {
                                i = R.id.normandy_setting_chart;
                                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                                if (imageView != null) {
                                    i = R.id.normandy_setting_firmware_version;
                                    ItemView itemView5 = (ItemView) ViewBindings.findChildViewById(view, i);
                                    if (itemView5 != null) {
                                        i = R.id.normandy_setting_icon_rl;
                                        HMExpandHeadView hMExpandHeadView = (HMExpandHeadView) ViewBindings.findChildViewById(view, i);
                                        if (hMExpandHeadView != null) {
                                            i = R.id.normandy_setting_low_battery_tips;
                                            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView != null) {
                                                HMScrollView hMScrollView = (HMScrollView) view;
                                                i = R.id.normandy_setting_unbind;
                                                Button button = (Button) ViewBindings.findChildViewById(view, i);
                                                if (button != null) {
                                                    return new ActivityNormandySettingBinding(hMScrollView, frameLayout, linearLayout, itemView, itemView2, itemView3, itemView4, imageView, itemView5, hMExpandHeadView, textView, hMScrollView, button);
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
    public static ActivityNormandySettingBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityNormandySettingBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_normandy_setting, viewGroup, false);
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

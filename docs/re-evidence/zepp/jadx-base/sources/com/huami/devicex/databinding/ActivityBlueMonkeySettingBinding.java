package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.huami.lib.view.scroll.HMExpandHeadView;
import com.huami.lib.view.scroll.HMScrollView;
import com.huami.widget.typeface.TypefaceTextView;
import com.xiaomi.hm.health.baseui.widget.ItemView;

/* JADX INFO: loaded from: classes7.dex */
public final class ActivityBlueMonkeySettingBinding implements ViewBinding {

    @NonNull
    private final HMScrollView a;

    @NonNull
    public final ImageView batteryImg;

    @NonNull
    public final TypefaceTextView batteryLevel;

    @NonNull
    public final TextView batteryTips;

    @NonNull
    public final RelativeLayout blueMonkeySettingBatteryChartRl;

    @NonNull
    public final HMExpandHeadView blueMonkeySettingBatteryRl;

    @NonNull
    public final HMScrollView blueMonkeySettingScrollview;

    @NonNull
    public final ItemView bmSettingFirmwareUpgrade;

    @NonNull
    public final FrameLayout container;

    @NonNull
    public final ImageView disconnectedImg;

    @NonNull
    public final ItemView fwVersion;

    @NonNull
    public final LinearLayout itemLayout;

    @NonNull
    public final TextView lowBatteryTips;

    @NonNull
    public final ItemView macAddress;

    @NonNull
    public final Button unbindBtn;

    private ActivityBlueMonkeySettingBinding(@NonNull HMScrollView hMScrollView, @NonNull ImageView imageView, @NonNull TypefaceTextView typefaceTextView, @NonNull TextView textView, @NonNull RelativeLayout relativeLayout, @NonNull HMExpandHeadView hMExpandHeadView, @NonNull HMScrollView hMScrollView2, @NonNull ItemView itemView, @NonNull FrameLayout frameLayout, @NonNull ImageView imageView2, @NonNull ItemView itemView2, @NonNull LinearLayout linearLayout, @NonNull TextView textView2, @NonNull ItemView itemView3, @NonNull Button button) {
        this.a = hMScrollView;
        this.batteryImg = imageView;
        this.batteryLevel = typefaceTextView;
        this.batteryTips = textView;
        this.blueMonkeySettingBatteryChartRl = relativeLayout;
        this.blueMonkeySettingBatteryRl = hMExpandHeadView;
        this.blueMonkeySettingScrollview = hMScrollView2;
        this.bmSettingFirmwareUpgrade = itemView;
        this.container = frameLayout;
        this.disconnectedImg = imageView2;
        this.fwVersion = itemView2;
        this.itemLayout = linearLayout;
        this.lowBatteryTips = textView2;
        this.macAddress = itemView3;
        this.unbindBtn = button;
    }

    @NonNull
    public static ActivityBlueMonkeySettingBinding bind(@NonNull View view) {
        int i = R.id.battery_img;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.battery_level;
            TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
            if (typefaceTextView != null) {
                i = R.id.battery_tips;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = R.id.blue_monkey_setting_battery_chart_rl;
                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                    if (relativeLayout != null) {
                        i = R.id.blue_monkey_setting_battery_rl;
                        HMExpandHeadView hMExpandHeadView = (HMExpandHeadView) ViewBindings.findChildViewById(view, i);
                        if (hMExpandHeadView != null) {
                            HMScrollView hMScrollView = (HMScrollView) view;
                            i = R.id.bm_setting_firmware_upgrade;
                            ItemView itemView = (ItemView) ViewBindings.findChildViewById(view, i);
                            if (itemView != null) {
                                i = R.id.container;
                                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                if (frameLayout != null) {
                                    i = R.id.disconnected_img;
                                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                                    if (imageView2 != null) {
                                        i = R.id.fw_version;
                                        ItemView itemView2 = (ItemView) ViewBindings.findChildViewById(view, i);
                                        if (itemView2 != null) {
                                            i = R.id.item_layout;
                                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                            if (linearLayout != null) {
                                                i = R.id.low_battery_tips;
                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView2 != null) {
                                                    i = R.id.mac_address;
                                                    ItemView itemView3 = (ItemView) ViewBindings.findChildViewById(view, i);
                                                    if (itemView3 != null) {
                                                        i = R.id.unbind_btn;
                                                        Button button = (Button) ViewBindings.findChildViewById(view, i);
                                                        if (button != null) {
                                                            return new ActivityBlueMonkeySettingBinding(hMScrollView, imageView, typefaceTextView, textView, relativeLayout, hMExpandHeadView, hMScrollView, itemView, frameLayout, imageView2, itemView2, linearLayout, textView2, itemView3, button);
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
    public static ActivityBlueMonkeySettingBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityBlueMonkeySettingBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_blue_monkey_setting, viewGroup, false);
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

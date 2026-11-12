package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.huami.lib.rainbow.ListTile;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.lib.view.scroll.HMScrollView;
import com.huami.widget.typeface.TypefaceTextView;

/* JADX INFO: loaded from: classes7.dex */
public final class ActivityEarbudSettingBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final ListTile alarm;

    @NonNull
    public final RelativeLayout batteryContainer;

    @NonNull
    public final ListTile checkUpdate;

    @NonNull
    public final ListTile fwVersion;

    @NonNull
    public final ListTile help;

    @NonNull
    public final ImageView iconView;

    @NonNull
    public final AppCompatImageView ivDisconnect;

    @NonNull
    public final ListTile macAddress;

    @NonNull
    public final LinearLayout mainContent;

    @NonNull
    public final ListTile notify;

    @NonNull
    public final ListTile operation;

    @NonNull
    public final ListTile playDevice;

    @NonNull
    public final ListTile playTime;

    @NonNull
    public final ListTile reset;

    @NonNull
    public final HMScrollView scrollView;

    @NonNull
    public final Button settingUnbind;

    @NonNull
    public final FrameLayout statusContent;

    @NonNull
    public final TypefaceTextView tvLeftBattery;

    @NonNull
    public final TypefaceTextView tvLeftBatteryPercent;

    @NonNull
    public final TypefaceTextView tvRightBattery;

    @NonNull
    public final TypefaceTextView tvRightBatteryPercent;

    @NonNull
    public final RainbowTitleBar tvTitleBar;

    private ActivityEarbudSettingBinding(@NonNull RelativeLayout relativeLayout, @NonNull ListTile listTile, @NonNull RelativeLayout relativeLayout2, @NonNull ListTile listTile2, @NonNull ListTile listTile3, @NonNull ListTile listTile4, @NonNull ImageView imageView, @NonNull AppCompatImageView appCompatImageView, @NonNull ListTile listTile5, @NonNull LinearLayout linearLayout, @NonNull ListTile listTile6, @NonNull ListTile listTile7, @NonNull ListTile listTile8, @NonNull ListTile listTile9, @NonNull ListTile listTile10, @NonNull HMScrollView hMScrollView, @NonNull Button button, @NonNull FrameLayout frameLayout, @NonNull TypefaceTextView typefaceTextView, @NonNull TypefaceTextView typefaceTextView2, @NonNull TypefaceTextView typefaceTextView3, @NonNull TypefaceTextView typefaceTextView4, @NonNull RainbowTitleBar rainbowTitleBar) {
        this.a = relativeLayout;
        this.alarm = listTile;
        this.batteryContainer = relativeLayout2;
        this.checkUpdate = listTile2;
        this.fwVersion = listTile3;
        this.help = listTile4;
        this.iconView = imageView;
        this.ivDisconnect = appCompatImageView;
        this.macAddress = listTile5;
        this.mainContent = linearLayout;
        this.notify = listTile6;
        this.operation = listTile7;
        this.playDevice = listTile8;
        this.playTime = listTile9;
        this.reset = listTile10;
        this.scrollView = hMScrollView;
        this.settingUnbind = button;
        this.statusContent = frameLayout;
        this.tvLeftBattery = typefaceTextView;
        this.tvLeftBatteryPercent = typefaceTextView2;
        this.tvRightBattery = typefaceTextView3;
        this.tvRightBatteryPercent = typefaceTextView4;
        this.tvTitleBar = rainbowTitleBar;
    }

    @NonNull
    public static ActivityEarbudSettingBinding bind(@NonNull View view) {
        int i = R.id.alarm;
        ListTile listTile = (ListTile) ViewBindings.findChildViewById(view, i);
        if (listTile != null) {
            i = R.id.battery_container;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
            if (relativeLayout != null) {
                i = R.id.check_update;
                ListTile listTile2 = (ListTile) ViewBindings.findChildViewById(view, i);
                if (listTile2 != null) {
                    i = R.id.fw_version;
                    ListTile listTile3 = (ListTile) ViewBindings.findChildViewById(view, i);
                    if (listTile3 != null) {
                        i = R.id.help;
                        ListTile listTile4 = (ListTile) ViewBindings.findChildViewById(view, i);
                        if (listTile4 != null) {
                            i = R.id.icon_view;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView != null) {
                                i = R.id.iv_disconnect;
                                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                                if (appCompatImageView != null) {
                                    i = R.id.mac_address;
                                    ListTile listTile5 = (ListTile) ViewBindings.findChildViewById(view, i);
                                    if (listTile5 != null) {
                                        i = R.id.main_content;
                                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                        if (linearLayout != null) {
                                            i = R.id.notify;
                                            ListTile listTile6 = (ListTile) ViewBindings.findChildViewById(view, i);
                                            if (listTile6 != null) {
                                                i = R.id.operation;
                                                ListTile listTile7 = (ListTile) ViewBindings.findChildViewById(view, i);
                                                if (listTile7 != null) {
                                                    i = R.id.play_device;
                                                    ListTile listTile8 = (ListTile) ViewBindings.findChildViewById(view, i);
                                                    if (listTile8 != null) {
                                                        i = R.id.play_time;
                                                        ListTile listTile9 = (ListTile) ViewBindings.findChildViewById(view, i);
                                                        if (listTile9 != null) {
                                                            i = R.id.reset;
                                                            ListTile listTile10 = (ListTile) ViewBindings.findChildViewById(view, i);
                                                            if (listTile10 != null) {
                                                                i = R.id.scroll_view;
                                                                HMScrollView hMScrollView = (HMScrollView) ViewBindings.findChildViewById(view, i);
                                                                if (hMScrollView != null) {
                                                                    i = R.id.setting_unbind;
                                                                    Button button = (Button) ViewBindings.findChildViewById(view, i);
                                                                    if (button != null) {
                                                                        i = R.id.status_content;
                                                                        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                                                        if (frameLayout != null) {
                                                                            i = R.id.tv_left_battery;
                                                                            TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                                                                            if (typefaceTextView != null) {
                                                                                i = R.id.tv_left_battery_percent;
                                                                                TypefaceTextView typefaceTextView2 = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                                                                                if (typefaceTextView2 != null) {
                                                                                    i = R.id.tv_right_battery;
                                                                                    TypefaceTextView typefaceTextView3 = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                                                                                    if (typefaceTextView3 != null) {
                                                                                        i = R.id.tv_right_battery_percent;
                                                                                        TypefaceTextView typefaceTextView4 = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                                                                                        if (typefaceTextView4 != null) {
                                                                                            i = R.id.tv_title_bar;
                                                                                            RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) ViewBindings.findChildViewById(view, i);
                                                                                            if (rainbowTitleBar != null) {
                                                                                                return new ActivityEarbudSettingBinding((RelativeLayout) view, listTile, relativeLayout, listTile2, listTile3, listTile4, imageView, appCompatImageView, listTile5, linearLayout, listTile6, listTile7, listTile8, listTile9, listTile10, hMScrollView, button, frameLayout, typefaceTextView, typefaceTextView2, typefaceTextView3, typefaceTextView4, rainbowTitleBar);
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
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityEarbudSettingBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityEarbudSettingBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_earbud_setting, viewGroup, false);
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

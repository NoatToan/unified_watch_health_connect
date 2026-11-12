package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watch.hmwatchmanager.R;

/* JADX INFO: loaded from: classes20.dex */
public final class ActivityKeepAliveBinding implements ViewBinding {

    @NonNull
    private final ScrollView a;

    @NonNull
    public final RelativeLayout keepAliveChange;

    @NonNull
    public final TextView keepAliveCurrentPhone;

    @NonNull
    public final TextView keepAliveCurrentPhonePre;

    @NonNull
    public final TextView keepAliveSettingAppLock;

    @NonNull
    public final TextView keepAliveSettingAppLockRom;

    @NonNull
    public final Button keepAliveSettingAppLockSetting;

    @NonNull
    public final TextView keepAliveSettingAutoStart;

    @NonNull
    public final TextView keepAliveSettingAutoStartRom;

    @NonNull
    public final Button keepAliveSettingAutoStartSetting;

    @NonNull
    public final TextView keepAliveSettingOther;

    @NonNull
    public final TextView keepAliveSettingPowerManager;

    @NonNull
    public final TextView keepAliveSettingPowerManagerRom;

    @NonNull
    public final Button keepAliveSettingPowerManagerSetting;

    @NonNull
    public final TextView keepAliveSettingTitle;

    private ActivityKeepAliveBinding(@NonNull ScrollView rootView, @NonNull RelativeLayout keepAliveChange, @NonNull TextView keepAliveCurrentPhone, @NonNull TextView keepAliveCurrentPhonePre, @NonNull TextView keepAliveSettingAppLock, @NonNull TextView keepAliveSettingAppLockRom, @NonNull Button keepAliveSettingAppLockSetting, @NonNull TextView keepAliveSettingAutoStart, @NonNull TextView keepAliveSettingAutoStartRom, @NonNull Button keepAliveSettingAutoStartSetting, @NonNull TextView keepAliveSettingOther, @NonNull TextView keepAliveSettingPowerManager, @NonNull TextView keepAliveSettingPowerManagerRom, @NonNull Button keepAliveSettingPowerManagerSetting, @NonNull TextView keepAliveSettingTitle) {
        this.a = rootView;
        this.keepAliveChange = keepAliveChange;
        this.keepAliveCurrentPhone = keepAliveCurrentPhone;
        this.keepAliveCurrentPhonePre = keepAliveCurrentPhonePre;
        this.keepAliveSettingAppLock = keepAliveSettingAppLock;
        this.keepAliveSettingAppLockRom = keepAliveSettingAppLockRom;
        this.keepAliveSettingAppLockSetting = keepAliveSettingAppLockSetting;
        this.keepAliveSettingAutoStart = keepAliveSettingAutoStart;
        this.keepAliveSettingAutoStartRom = keepAliveSettingAutoStartRom;
        this.keepAliveSettingAutoStartSetting = keepAliveSettingAutoStartSetting;
        this.keepAliveSettingOther = keepAliveSettingOther;
        this.keepAliveSettingPowerManager = keepAliveSettingPowerManager;
        this.keepAliveSettingPowerManagerRom = keepAliveSettingPowerManagerRom;
        this.keepAliveSettingPowerManagerSetting = keepAliveSettingPowerManagerSetting;
        this.keepAliveSettingTitle = keepAliveSettingTitle;
    }

    @NonNull
    public static ActivityKeepAliveBinding bind(@NonNull View rootView) {
        int i = R.id.keep_alive_change;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.keep_alive_change);
        if (relativeLayout != null) {
            i = R.id.keep_alive_current_phone;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.keep_alive_current_phone);
            if (textView != null) {
                i = R.id.keep_alive_current_phone_pre;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.keep_alive_current_phone_pre);
                if (textView2 != null) {
                    i = R.id.keep_alive_setting_app_lock;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.keep_alive_setting_app_lock);
                    if (textView3 != null) {
                        i = R.id.keep_alive_setting_app_lock_rom;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.keep_alive_setting_app_lock_rom);
                        if (textView4 != null) {
                            i = R.id.keep_alive_setting_app_lock_setting;
                            Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.keep_alive_setting_app_lock_setting);
                            if (button != null) {
                                i = R.id.keep_alive_setting_auto_start;
                                TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.keep_alive_setting_auto_start);
                                if (textView5 != null) {
                                    i = R.id.keep_alive_setting_auto_start_rom;
                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.keep_alive_setting_auto_start_rom);
                                    if (textView6 != null) {
                                        i = R.id.keep_alive_setting_auto_start_setting;
                                        Button button2 = (Button) ViewBindings.findChildViewById(rootView, R.id.keep_alive_setting_auto_start_setting);
                                        if (button2 != null) {
                                            i = R.id.keep_alive_setting_other;
                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.keep_alive_setting_other);
                                            if (textView7 != null) {
                                                i = R.id.keep_alive_setting_power_manager;
                                                TextView textView8 = (TextView) ViewBindings.findChildViewById(rootView, R.id.keep_alive_setting_power_manager);
                                                if (textView8 != null) {
                                                    i = R.id.keep_alive_setting_power_manager_rom;
                                                    TextView textView9 = (TextView) ViewBindings.findChildViewById(rootView, R.id.keep_alive_setting_power_manager_rom);
                                                    if (textView9 != null) {
                                                        i = R.id.keep_alive_setting_power_manager_setting;
                                                        Button button3 = (Button) ViewBindings.findChildViewById(rootView, R.id.keep_alive_setting_power_manager_setting);
                                                        if (button3 != null) {
                                                            i = R.id.keep_alive_setting_title;
                                                            TextView textView10 = (TextView) ViewBindings.findChildViewById(rootView, R.id.keep_alive_setting_title);
                                                            if (textView10 != null) {
                                                                return new ActivityKeepAliveBinding((ScrollView) rootView, relativeLayout, textView, textView2, textView3, textView4, button, textView5, textView6, button2, textView7, textView8, textView9, button3, textView10);
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
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityKeepAliveBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityKeepAliveBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_keep_alive, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ScrollView getRoot() {
        return this.a;
    }
}

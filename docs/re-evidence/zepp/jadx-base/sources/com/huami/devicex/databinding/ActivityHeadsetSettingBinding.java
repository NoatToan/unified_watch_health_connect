package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.huami.lib.rainbow.ListTile;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.lib.view.scroll.HMScrollView;

/* JADX INFO: loaded from: classes7.dex */
public final class ActivityHeadsetSettingBinding implements ViewBinding {

    @NonNull
    private final LinearLayoutCompat a;

    @NonNull
    public final CardView container;

    @NonNull
    public final FrameLayout headerContainer;

    @NonNull
    public final ListTile itemCheckFirmware;

    @NonNull
    public final ListTile itemFaq;

    @NonNull
    public final ListTile itemFwVersion;

    @NonNull
    public final ListTile itemHeadsetAlarm;

    @NonNull
    public final ListTile itemHeadsetSettingsAction;

    @NonNull
    public final ListTile itemHeadsetSettingsCervicalProtection;

    @NonNull
    public final ListTile itemHeadsetSettingsEqualizer;

    @NonNull
    public final ListTile itemHeadsetSettingsHearingHealth;

    @NonNull
    public final ListTile itemHeadsetSettingsPlay;

    @NonNull
    public final ListTile itemHeadsetSettingsSideListen;

    @NonNull
    public final ListTile itemHeadsetSettingsSport;

    @NonNull
    public final ListTile itemHeadsetSettingsVoiceControl;

    @NonNull
    public final ListTile itemHeadsetSettingsWearInduction;

    @NonNull
    public final ListTile itemHeadsetSmartPlayMusic;

    @NonNull
    public final ListTile itemMacAddress;

    @NonNull
    public final ListTile itemReset;

    @NonNull
    public final ListTile itemSkySleepRelax;

    @NonNull
    public final AppCompatImageView ivDisconnect;

    @NonNull
    public final RainbowTitleBar rainbowTitleBar;

    @NonNull
    public final HMScrollView scrollContainer;

    @NonNull
    public final Button settingUnbind;

    @NonNull
    public final ViewStub viewstudHeadsetNoise;

    @NonNull
    public final ViewStub viewstudHeadsetSport;

    private ActivityHeadsetSettingBinding(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull CardView cardView, @NonNull FrameLayout frameLayout, @NonNull ListTile listTile, @NonNull ListTile listTile2, @NonNull ListTile listTile3, @NonNull ListTile listTile4, @NonNull ListTile listTile5, @NonNull ListTile listTile6, @NonNull ListTile listTile7, @NonNull ListTile listTile8, @NonNull ListTile listTile9, @NonNull ListTile listTile10, @NonNull ListTile listTile11, @NonNull ListTile listTile12, @NonNull ListTile listTile13, @NonNull ListTile listTile14, @NonNull ListTile listTile15, @NonNull ListTile listTile16, @NonNull ListTile listTile17, @NonNull AppCompatImageView appCompatImageView, @NonNull RainbowTitleBar rainbowTitleBar, @NonNull HMScrollView hMScrollView, @NonNull Button button, @NonNull ViewStub viewStub, @NonNull ViewStub viewStub2) {
        this.a = linearLayoutCompat;
        this.container = cardView;
        this.headerContainer = frameLayout;
        this.itemCheckFirmware = listTile;
        this.itemFaq = listTile2;
        this.itemFwVersion = listTile3;
        this.itemHeadsetAlarm = listTile4;
        this.itemHeadsetSettingsAction = listTile5;
        this.itemHeadsetSettingsCervicalProtection = listTile6;
        this.itemHeadsetSettingsEqualizer = listTile7;
        this.itemHeadsetSettingsHearingHealth = listTile8;
        this.itemHeadsetSettingsPlay = listTile9;
        this.itemHeadsetSettingsSideListen = listTile10;
        this.itemHeadsetSettingsSport = listTile11;
        this.itemHeadsetSettingsVoiceControl = listTile12;
        this.itemHeadsetSettingsWearInduction = listTile13;
        this.itemHeadsetSmartPlayMusic = listTile14;
        this.itemMacAddress = listTile15;
        this.itemReset = listTile16;
        this.itemSkySleepRelax = listTile17;
        this.ivDisconnect = appCompatImageView;
        this.rainbowTitleBar = rainbowTitleBar;
        this.scrollContainer = hMScrollView;
        this.settingUnbind = button;
        this.viewstudHeadsetNoise = viewStub;
        this.viewstudHeadsetSport = viewStub2;
    }

    @NonNull
    public static ActivityHeadsetSettingBinding bind(@NonNull View view) {
        int i = R.id.container;
        CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
        if (cardView != null) {
            i = R.id.header_container;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                i = R.id.item_check_firmware;
                ListTile listTile = (ListTile) ViewBindings.findChildViewById(view, i);
                if (listTile != null) {
                    i = R.id.item_faq;
                    ListTile listTile2 = (ListTile) ViewBindings.findChildViewById(view, i);
                    if (listTile2 != null) {
                        i = R.id.item_fw_version;
                        ListTile listTile3 = (ListTile) ViewBindings.findChildViewById(view, i);
                        if (listTile3 != null) {
                            i = R.id.item_headset_alarm;
                            ListTile listTile4 = (ListTile) ViewBindings.findChildViewById(view, i);
                            if (listTile4 != null) {
                                i = R.id.item_headset_settings_action;
                                ListTile listTile5 = (ListTile) ViewBindings.findChildViewById(view, i);
                                if (listTile5 != null) {
                                    i = R.id.item_headset_settings_cervical_protection;
                                    ListTile listTile6 = (ListTile) ViewBindings.findChildViewById(view, i);
                                    if (listTile6 != null) {
                                        i = R.id.item_headset_settings_equalizer;
                                        ListTile listTile7 = (ListTile) ViewBindings.findChildViewById(view, i);
                                        if (listTile7 != null) {
                                            i = R.id.item_headset_settings_hearing_health;
                                            ListTile listTile8 = (ListTile) ViewBindings.findChildViewById(view, i);
                                            if (listTile8 != null) {
                                                i = R.id.item_headset_settings_play;
                                                ListTile listTile9 = (ListTile) ViewBindings.findChildViewById(view, i);
                                                if (listTile9 != null) {
                                                    i = R.id.item_headset_settings_side_listen;
                                                    ListTile listTile10 = (ListTile) ViewBindings.findChildViewById(view, i);
                                                    if (listTile10 != null) {
                                                        i = R.id.item_headset_settings_sport;
                                                        ListTile listTile11 = (ListTile) ViewBindings.findChildViewById(view, i);
                                                        if (listTile11 != null) {
                                                            i = R.id.item_headset_settings_voice_control;
                                                            ListTile listTile12 = (ListTile) ViewBindings.findChildViewById(view, i);
                                                            if (listTile12 != null) {
                                                                i = R.id.item_headset_settings_wear_induction;
                                                                ListTile listTile13 = (ListTile) ViewBindings.findChildViewById(view, i);
                                                                if (listTile13 != null) {
                                                                    i = R.id.item_headset_smart_play_music;
                                                                    ListTile listTile14 = (ListTile) ViewBindings.findChildViewById(view, i);
                                                                    if (listTile14 != null) {
                                                                        i = R.id.item_mac_address;
                                                                        ListTile listTile15 = (ListTile) ViewBindings.findChildViewById(view, i);
                                                                        if (listTile15 != null) {
                                                                            i = R.id.item_reset;
                                                                            ListTile listTile16 = (ListTile) ViewBindings.findChildViewById(view, i);
                                                                            if (listTile16 != null) {
                                                                                i = R.id.item_sky_sleep_relax;
                                                                                ListTile listTile17 = (ListTile) ViewBindings.findChildViewById(view, i);
                                                                                if (listTile17 != null) {
                                                                                    i = R.id.iv_disconnect;
                                                                                    AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                                                                                    if (appCompatImageView != null) {
                                                                                        i = R.id.rainbow_title_bar;
                                                                                        RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) ViewBindings.findChildViewById(view, i);
                                                                                        if (rainbowTitleBar != null) {
                                                                                            i = R.id.scroll_container;
                                                                                            HMScrollView hMScrollView = (HMScrollView) ViewBindings.findChildViewById(view, i);
                                                                                            if (hMScrollView != null) {
                                                                                                i = R.id.setting_unbind;
                                                                                                Button button = (Button) ViewBindings.findChildViewById(view, i);
                                                                                                if (button != null) {
                                                                                                    i = R.id.viewstud_headset_noise;
                                                                                                    ViewStub viewStub = (ViewStub) ViewBindings.findChildViewById(view, i);
                                                                                                    if (viewStub != null) {
                                                                                                        i = R.id.viewstud_headset_sport;
                                                                                                        ViewStub viewStub2 = (ViewStub) ViewBindings.findChildViewById(view, i);
                                                                                                        if (viewStub2 != null) {
                                                                                                            return new ActivityHeadsetSettingBinding((LinearLayoutCompat) view, cardView, frameLayout, listTile, listTile2, listTile3, listTile4, listTile5, listTile6, listTile7, listTile8, listTile9, listTile10, listTile11, listTile12, listTile13, listTile14, listTile15, listTile16, listTile17, appCompatImageView, rainbowTitleBar, hMScrollView, button, viewStub, viewStub2);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityHeadsetSettingBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityHeadsetSettingBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_headset_setting, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayoutCompat getRoot() {
        return this.a;
    }
}

package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.huami.lib.rainbow.ListTile;

/* JADX INFO: loaded from: classes7.dex */
public final class FragmentWatchSettingBinding implements ViewBinding {

    @NonNull
    private final LinearLayoutCompat a;

    @NonNull
    public final AppCompatImageView btnBack;

    @NonNull
    public final FrameLayout container;

    @NonNull
    public final ListTile deviceGesture;

    @NonNull
    public final ListTile deviceLanguage;

    @NonNull
    public final ListTile deviceMorningGreeting;

    @NonNull
    public final ListTile deviceSettingDnd;

    @NonNull
    public final ListTile deviceSettingOfflineVoiceWakeupMethod;

    @NonNull
    public final ListTile deviceSettingSleepMode;

    @NonNull
    public final ListTile deviceSettingSoundVibration;

    @NonNull
    public final ListTile deviceSettingSport;

    @NonNull
    public final ListTile dsAppSort;

    @NonNull
    public final ListTile dsControlCenterEdit;

    @NonNull
    public final ListTile dsOffWistSetting;

    @NonNull
    public final ListTile dsQuickStart;

    @NonNull
    public final ListTile dsQuickStartClickDown;

    @NonNull
    public final ListTile dsQuickStartLongPressSide;

    @NonNull
    public final ListTile dsQuickStartLongPressUp;

    @NonNull
    public final ListTile dsScreenEdit;

    @NonNull
    public final ListTile dsShortCut;

    @NonNull
    public final ListTile dsWearingMethod;

    @NonNull
    public final ListTile itemDisplayBrightness;

    @NonNull
    public final View maskView;

    @NonNull
    public final ListTile nightMode;

    @NonNull
    public final Toolbar toolbar;

    @NonNull
    public final TextView watchSetting;

    private FragmentWatchSettingBinding(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull AppCompatImageView appCompatImageView, @NonNull FrameLayout frameLayout, @NonNull ListTile listTile, @NonNull ListTile listTile2, @NonNull ListTile listTile3, @NonNull ListTile listTile4, @NonNull ListTile listTile5, @NonNull ListTile listTile6, @NonNull ListTile listTile7, @NonNull ListTile listTile8, @NonNull ListTile listTile9, @NonNull ListTile listTile10, @NonNull ListTile listTile11, @NonNull ListTile listTile12, @NonNull ListTile listTile13, @NonNull ListTile listTile14, @NonNull ListTile listTile15, @NonNull ListTile listTile16, @NonNull ListTile listTile17, @NonNull ListTile listTile18, @NonNull ListTile listTile19, @NonNull View view, @NonNull ListTile listTile20, @NonNull Toolbar toolbar, @NonNull TextView textView) {
        this.a = linearLayoutCompat;
        this.btnBack = appCompatImageView;
        this.container = frameLayout;
        this.deviceGesture = listTile;
        this.deviceLanguage = listTile2;
        this.deviceMorningGreeting = listTile3;
        this.deviceSettingDnd = listTile4;
        this.deviceSettingOfflineVoiceWakeupMethod = listTile5;
        this.deviceSettingSleepMode = listTile6;
        this.deviceSettingSoundVibration = listTile7;
        this.deviceSettingSport = listTile8;
        this.dsAppSort = listTile9;
        this.dsControlCenterEdit = listTile10;
        this.dsOffWistSetting = listTile11;
        this.dsQuickStart = listTile12;
        this.dsQuickStartClickDown = listTile13;
        this.dsQuickStartLongPressSide = listTile14;
        this.dsQuickStartLongPressUp = listTile15;
        this.dsScreenEdit = listTile16;
        this.dsShortCut = listTile17;
        this.dsWearingMethod = listTile18;
        this.itemDisplayBrightness = listTile19;
        this.maskView = view;
        this.nightMode = listTile20;
        this.toolbar = toolbar;
        this.watchSetting = textView;
    }

    @NonNull
    public static FragmentWatchSettingBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        int i = R.id.btn_back;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = R.id.container;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                i = R.id.device_gesture;
                ListTile listTile = (ListTile) ViewBindings.findChildViewById(view, i);
                if (listTile != null) {
                    i = R.id.device_language;
                    ListTile listTile2 = (ListTile) ViewBindings.findChildViewById(view, i);
                    if (listTile2 != null) {
                        i = R.id.device_morning_greeting;
                        ListTile listTile3 = (ListTile) ViewBindings.findChildViewById(view, i);
                        if (listTile3 != null) {
                            i = R.id.device_setting_dnd;
                            ListTile listTile4 = (ListTile) ViewBindings.findChildViewById(view, i);
                            if (listTile4 != null) {
                                i = R.id.device_setting_offline_voice_wakeup_method;
                                ListTile listTile5 = (ListTile) ViewBindings.findChildViewById(view, i);
                                if (listTile5 != null) {
                                    i = R.id.device_setting_sleep_mode;
                                    ListTile listTile6 = (ListTile) ViewBindings.findChildViewById(view, i);
                                    if (listTile6 != null) {
                                        i = R.id.device_setting_sound_vibration;
                                        ListTile listTile7 = (ListTile) ViewBindings.findChildViewById(view, i);
                                        if (listTile7 != null) {
                                            i = R.id.device_setting_sport;
                                            ListTile listTile8 = (ListTile) ViewBindings.findChildViewById(view, i);
                                            if (listTile8 != null) {
                                                i = R.id.ds_app_sort;
                                                ListTile listTile9 = (ListTile) ViewBindings.findChildViewById(view, i);
                                                if (listTile9 != null) {
                                                    i = R.id.ds_control_center_edit;
                                                    ListTile listTile10 = (ListTile) ViewBindings.findChildViewById(view, i);
                                                    if (listTile10 != null) {
                                                        i = R.id.ds_offWist_setting;
                                                        ListTile listTile11 = (ListTile) ViewBindings.findChildViewById(view, i);
                                                        if (listTile11 != null) {
                                                            i = R.id.ds_quick_start;
                                                            ListTile listTile12 = (ListTile) ViewBindings.findChildViewById(view, i);
                                                            if (listTile12 != null) {
                                                                i = R.id.ds_quick_start_click_down;
                                                                ListTile listTile13 = (ListTile) ViewBindings.findChildViewById(view, i);
                                                                if (listTile13 != null) {
                                                                    i = R.id.ds_quick_start_long_press_side;
                                                                    ListTile listTile14 = (ListTile) ViewBindings.findChildViewById(view, i);
                                                                    if (listTile14 != null) {
                                                                        i = R.id.ds_quick_start_long_press_up;
                                                                        ListTile listTile15 = (ListTile) ViewBindings.findChildViewById(view, i);
                                                                        if (listTile15 != null) {
                                                                            i = R.id.ds_screen_edit;
                                                                            ListTile listTile16 = (ListTile) ViewBindings.findChildViewById(view, i);
                                                                            if (listTile16 != null) {
                                                                                i = R.id.ds_short_cut;
                                                                                ListTile listTile17 = (ListTile) ViewBindings.findChildViewById(view, i);
                                                                                if (listTile17 != null) {
                                                                                    i = R.id.ds_wearing_method;
                                                                                    ListTile listTile18 = (ListTile) ViewBindings.findChildViewById(view, i);
                                                                                    if (listTile18 != null) {
                                                                                        i = R.id.item_display_brightness;
                                                                                        ListTile listTile19 = (ListTile) ViewBindings.findChildViewById(view, i);
                                                                                        if (listTile19 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.mask_view))) != null) {
                                                                                            i = R.id.night_mode;
                                                                                            ListTile listTile20 = (ListTile) ViewBindings.findChildViewById(view, i);
                                                                                            if (listTile20 != null) {
                                                                                                i = R.id.toolbar;
                                                                                                Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(view, i);
                                                                                                if (toolbar != null) {
                                                                                                    i = R.id.watch_setting;
                                                                                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                    if (textView != null) {
                                                                                                        return new FragmentWatchSettingBinding((LinearLayoutCompat) view, appCompatImageView, frameLayout, listTile, listTile2, listTile3, listTile4, listTile5, listTile6, listTile7, listTile8, listTile9, listTile10, listTile11, listTile12, listTile13, listTile14, listTile15, listTile16, listTile17, listTile18, listTile19, viewFindChildViewById, listTile20, toolbar, textView);
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
    public static FragmentWatchSettingBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentWatchSettingBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_watch_setting, viewGroup, false);
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

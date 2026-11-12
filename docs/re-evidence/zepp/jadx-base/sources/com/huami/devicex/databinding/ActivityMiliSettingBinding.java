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
import com.huami.lib.rainbow.ListTile;
import com.huami.lib.view.scroll.HMExpandHeadView;
import com.huami.lib.view.scroll.HMScrollView;
import com.huami.widget.typeface.TypefaceTextView;

/* JADX INFO: loaded from: classes7.dex */
public final class ActivityMiliSettingBinding implements ViewBinding {

    @NonNull
    private final HMScrollView a;

    @NonNull
    public final ListTile avoidSpiteBindingItem;

    @NonNull
    public final FrameLayout container;

    @NonNull
    public final ImageView disconnectedImg;

    @NonNull
    public final View funcMoreMask;

    @NonNull
    public final ListTile healthDetectItem;

    @NonNull
    public final ListTile itemAppNotify;

    @NonNull
    public final ListTile itemBandAlarm;

    @NonNull
    public final ListTile itemBroadcast;

    @NonNull
    public final ListTile itemCallAlert;

    @NonNull
    public final ListTile itemEventRemind;

    @NonNull
    public final ListTile itemKeepAlive;

    @NonNull
    public final LinearLayout itemLayout;

    @NonNull
    public final ListTile itemLongSitAlert;

    @NonNull
    public final RelativeLayout itemMore;

    @NonNull
    public final ListTile itemUnlock;

    @NonNull
    public final ListTile itemWallet;

    @NonNull
    public final ListTile itemWatchSkin;

    @NonNull
    public final ListTile macAddress;

    @NonNull
    public final ListTile miband2Reset;

    @NonNull
    public final ListTile miliSettingAlexaAuthorize;

    @NonNull
    public final ListTile miliSettingAppsItem;

    @NonNull
    public final RelativeLayout miliSettingBatteryChartRl;

    @NonNull
    public final ImageView miliSettingBatteryImg;

    @NonNull
    public final TypefaceTextView miliSettingBatteryLevel;

    @NonNull
    public final HMExpandHeadView miliSettingBatteryRl;

    @NonNull
    public final TextView miliSettingBatteryTips;

    @NonNull
    public final ListTile miliSettingBeepSetting;

    @NonNull
    public final ListTile miliSettingDisplayItemLl;

    @NonNull
    public final ListTile miliSettingEnableLockScreen;

    @NonNull
    public final ListTile miliSettingEsimCard;

    @NonNull
    public final ListTile miliSettingFaqItem;

    @NonNull
    public final ListTile miliSettingFindBracelet;

    @NonNull
    public final ListTile miliSettingFirmwareUpgrade;

    @NonNull
    public final ListTile miliSettingFirmwareVersion;

    @NonNull
    public final ListTile miliSettingFlipWristFl;

    @NonNull
    public final ListTile miliSettingGesScreenLl;

    @NonNull
    public final ListTile miliSettingHrDetectItem;

    @NonNull
    public final ListTile miliSettingHrFirmwareVersion;

    @NonNull
    public final ListTile miliSettingInstructionItem;

    @NonNull
    public final ListTile miliSettingLibrary;

    @NonNull
    public final ListTile miliSettingLightColor;

    @NonNull
    public final ListTile miliSettingLongPressItem;

    @NonNull
    public final TextView miliSettingLowBatteryTips;

    @NonNull
    public final ListTile miliSettingMessagePreview;

    @NonNull
    public final ListTile miliSettingNightModeItem;

    @NonNull
    public final ListTile miliSettingNowTime;

    @NonNull
    public final ListTile miliSettingOffWristLockLl;

    @NonNull
    public final ListTile miliSettingPassword;

    @NonNull
    public final ListTile miliSettingPlaychItem;

    @NonNull
    public final ListTile miliSettingRingTypeItem;

    @NonNull
    public final HMScrollView miliSettingScrollview;

    @NonNull
    public final ListTile miliSettingSetLanguage;

    @NonNull
    public final ListTile miliSettingSetWear;

    @NonNull
    public final ListTile miliSettingShotcutAppsItem;

    @NonNull
    public final ListTile miliSettingSleepAssist;

    @NonNull
    public final ListTile miliSettingSport;

    @NonNull
    public final ListTile miliSettingSportSort;

    @NonNull
    public final Button miliSettingUnbind;

    @NonNull
    public final ListTile miliSettingVibrateItem;

    @NonNull
    public final ListTile miliSettingVibrateNotify;

    @NonNull
    public final DeviceSettingViewSpaceBinding miliSettingWatchDivider;

    @NonNull
    public final DeviceSettingViewSpaceBinding miliSettingWeatherDivider;

    @NonNull
    public final ListTile miliSettingWeatherItem;

    @NonNull
    public final ListTile miliSettingWorldClock;

    @NonNull
    public final ListTile miliSettingXiaoaiMijiaAuthorize;

    @NonNull
    public final ListTile miliTimeDisplayItemLl;

    @NonNull
    public final ListTile otherCalendarItem;

    @NonNull
    public final ListTile playMiband2;

    @NonNull
    public final ListTile realTimeData;

    @NonNull
    public final ListTile sportHrBroadcast;

    @NonNull
    public final ListTile startDayOfWeekItem;

    private ActivityMiliSettingBinding(@NonNull HMScrollView hMScrollView, @NonNull ListTile listTile, @NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull View view, @NonNull ListTile listTile2, @NonNull ListTile listTile3, @NonNull ListTile listTile4, @NonNull ListTile listTile5, @NonNull ListTile listTile6, @NonNull ListTile listTile7, @NonNull ListTile listTile8, @NonNull LinearLayout linearLayout, @NonNull ListTile listTile9, @NonNull RelativeLayout relativeLayout, @NonNull ListTile listTile10, @NonNull ListTile listTile11, @NonNull ListTile listTile12, @NonNull ListTile listTile13, @NonNull ListTile listTile14, @NonNull ListTile listTile15, @NonNull ListTile listTile16, @NonNull RelativeLayout relativeLayout2, @NonNull ImageView imageView2, @NonNull TypefaceTextView typefaceTextView, @NonNull HMExpandHeadView hMExpandHeadView, @NonNull TextView textView, @NonNull ListTile listTile17, @NonNull ListTile listTile18, @NonNull ListTile listTile19, @NonNull ListTile listTile20, @NonNull ListTile listTile21, @NonNull ListTile listTile22, @NonNull ListTile listTile23, @NonNull ListTile listTile24, @NonNull ListTile listTile25, @NonNull ListTile listTile26, @NonNull ListTile listTile27, @NonNull ListTile listTile28, @NonNull ListTile listTile29, @NonNull ListTile listTile30, @NonNull ListTile listTile31, @NonNull ListTile listTile32, @NonNull TextView textView2, @NonNull ListTile listTile33, @NonNull ListTile listTile34, @NonNull ListTile listTile35, @NonNull ListTile listTile36, @NonNull ListTile listTile37, @NonNull ListTile listTile38, @NonNull ListTile listTile39, @NonNull HMScrollView hMScrollView2, @NonNull ListTile listTile40, @NonNull ListTile listTile41, @NonNull ListTile listTile42, @NonNull ListTile listTile43, @NonNull ListTile listTile44, @NonNull ListTile listTile45, @NonNull Button button, @NonNull ListTile listTile46, @NonNull ListTile listTile47, @NonNull DeviceSettingViewSpaceBinding deviceSettingViewSpaceBinding, @NonNull DeviceSettingViewSpaceBinding deviceSettingViewSpaceBinding2, @NonNull ListTile listTile48, @NonNull ListTile listTile49, @NonNull ListTile listTile50, @NonNull ListTile listTile51, @NonNull ListTile listTile52, @NonNull ListTile listTile53, @NonNull ListTile listTile54, @NonNull ListTile listTile55, @NonNull ListTile listTile56) {
        this.a = hMScrollView;
        this.avoidSpiteBindingItem = listTile;
        this.container = frameLayout;
        this.disconnectedImg = imageView;
        this.funcMoreMask = view;
        this.healthDetectItem = listTile2;
        this.itemAppNotify = listTile3;
        this.itemBandAlarm = listTile4;
        this.itemBroadcast = listTile5;
        this.itemCallAlert = listTile6;
        this.itemEventRemind = listTile7;
        this.itemKeepAlive = listTile8;
        this.itemLayout = linearLayout;
        this.itemLongSitAlert = listTile9;
        this.itemMore = relativeLayout;
        this.itemUnlock = listTile10;
        this.itemWallet = listTile11;
        this.itemWatchSkin = listTile12;
        this.macAddress = listTile13;
        this.miband2Reset = listTile14;
        this.miliSettingAlexaAuthorize = listTile15;
        this.miliSettingAppsItem = listTile16;
        this.miliSettingBatteryChartRl = relativeLayout2;
        this.miliSettingBatteryImg = imageView2;
        this.miliSettingBatteryLevel = typefaceTextView;
        this.miliSettingBatteryRl = hMExpandHeadView;
        this.miliSettingBatteryTips = textView;
        this.miliSettingBeepSetting = listTile17;
        this.miliSettingDisplayItemLl = listTile18;
        this.miliSettingEnableLockScreen = listTile19;
        this.miliSettingEsimCard = listTile20;
        this.miliSettingFaqItem = listTile21;
        this.miliSettingFindBracelet = listTile22;
        this.miliSettingFirmwareUpgrade = listTile23;
        this.miliSettingFirmwareVersion = listTile24;
        this.miliSettingFlipWristFl = listTile25;
        this.miliSettingGesScreenLl = listTile26;
        this.miliSettingHrDetectItem = listTile27;
        this.miliSettingHrFirmwareVersion = listTile28;
        this.miliSettingInstructionItem = listTile29;
        this.miliSettingLibrary = listTile30;
        this.miliSettingLightColor = listTile31;
        this.miliSettingLongPressItem = listTile32;
        this.miliSettingLowBatteryTips = textView2;
        this.miliSettingMessagePreview = listTile33;
        this.miliSettingNightModeItem = listTile34;
        this.miliSettingNowTime = listTile35;
        this.miliSettingOffWristLockLl = listTile36;
        this.miliSettingPassword = listTile37;
        this.miliSettingPlaychItem = listTile38;
        this.miliSettingRingTypeItem = listTile39;
        this.miliSettingScrollview = hMScrollView2;
        this.miliSettingSetLanguage = listTile40;
        this.miliSettingSetWear = listTile41;
        this.miliSettingShotcutAppsItem = listTile42;
        this.miliSettingSleepAssist = listTile43;
        this.miliSettingSport = listTile44;
        this.miliSettingSportSort = listTile45;
        this.miliSettingUnbind = button;
        this.miliSettingVibrateItem = listTile46;
        this.miliSettingVibrateNotify = listTile47;
        this.miliSettingWatchDivider = deviceSettingViewSpaceBinding;
        this.miliSettingWeatherDivider = deviceSettingViewSpaceBinding2;
        this.miliSettingWeatherItem = listTile48;
        this.miliSettingWorldClock = listTile49;
        this.miliSettingXiaoaiMijiaAuthorize = listTile50;
        this.miliTimeDisplayItemLl = listTile51;
        this.otherCalendarItem = listTile52;
        this.playMiband2 = listTile53;
        this.realTimeData = listTile54;
        this.sportHrBroadcast = listTile55;
        this.startDayOfWeekItem = listTile56;
    }

    @NonNull
    public static ActivityMiliSettingBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i = R.id.avoid_spite_binding_item;
        ListTile listTile = (ListTile) ViewBindings.findChildViewById(view, i);
        if (listTile != null) {
            i = R.id.container;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                i = R.id.disconnected_img;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.func_more_mask))) != null) {
                    i = R.id.health_detect_item;
                    ListTile listTile2 = (ListTile) ViewBindings.findChildViewById(view, i);
                    if (listTile2 != null) {
                        i = R.id.item_app_notify;
                        ListTile listTile3 = (ListTile) ViewBindings.findChildViewById(view, i);
                        if (listTile3 != null) {
                            i = R.id.item_band_alarm;
                            ListTile listTile4 = (ListTile) ViewBindings.findChildViewById(view, i);
                            if (listTile4 != null) {
                                i = R.id.item_broadcast;
                                ListTile listTile5 = (ListTile) ViewBindings.findChildViewById(view, i);
                                if (listTile5 != null) {
                                    i = R.id.item_call_alert;
                                    ListTile listTile6 = (ListTile) ViewBindings.findChildViewById(view, i);
                                    if (listTile6 != null) {
                                        i = R.id.item_event_remind;
                                        ListTile listTile7 = (ListTile) ViewBindings.findChildViewById(view, i);
                                        if (listTile7 != null) {
                                            i = R.id.item_keep_alive;
                                            ListTile listTile8 = (ListTile) ViewBindings.findChildViewById(view, i);
                                            if (listTile8 != null) {
                                                i = R.id.item_layout;
                                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                if (linearLayout != null) {
                                                    i = R.id.item_long_sit_alert;
                                                    ListTile listTile9 = (ListTile) ViewBindings.findChildViewById(view, i);
                                                    if (listTile9 != null) {
                                                        i = R.id.item_more;
                                                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                                        if (relativeLayout != null) {
                                                            i = R.id.item_unlock;
                                                            ListTile listTile10 = (ListTile) ViewBindings.findChildViewById(view, i);
                                                            if (listTile10 != null) {
                                                                i = R.id.item_wallet;
                                                                ListTile listTile11 = (ListTile) ViewBindings.findChildViewById(view, i);
                                                                if (listTile11 != null) {
                                                                    i = R.id.item_watch_skin;
                                                                    ListTile listTile12 = (ListTile) ViewBindings.findChildViewById(view, i);
                                                                    if (listTile12 != null) {
                                                                        i = R.id.mac_address;
                                                                        ListTile listTile13 = (ListTile) ViewBindings.findChildViewById(view, i);
                                                                        if (listTile13 != null) {
                                                                            i = R.id.miband2_reset;
                                                                            ListTile listTile14 = (ListTile) ViewBindings.findChildViewById(view, i);
                                                                            if (listTile14 != null) {
                                                                                i = R.id.mili_setting_alexa_authorize;
                                                                                ListTile listTile15 = (ListTile) ViewBindings.findChildViewById(view, i);
                                                                                if (listTile15 != null) {
                                                                                    i = R.id.mili_setting_apps_item;
                                                                                    ListTile listTile16 = (ListTile) ViewBindings.findChildViewById(view, i);
                                                                                    if (listTile16 != null) {
                                                                                        i = R.id.mili_setting_battery_chart_rl;
                                                                                        RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                                                                        if (relativeLayout2 != null) {
                                                                                            i = R.id.mili_setting_battery_img;
                                                                                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                                                            if (imageView2 != null) {
                                                                                                i = R.id.mili_setting_battery_level;
                                                                                                TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                                                                                                if (typefaceTextView != null) {
                                                                                                    i = R.id.mili_setting_battery_rl;
                                                                                                    HMExpandHeadView hMExpandHeadView = (HMExpandHeadView) ViewBindings.findChildViewById(view, i);
                                                                                                    if (hMExpandHeadView != null) {
                                                                                                        i = R.id.mili_setting_battery_tips;
                                                                                                        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                        if (textView != null) {
                                                                                                            i = R.id.mili_setting_beep_setting;
                                                                                                            ListTile listTile17 = (ListTile) ViewBindings.findChildViewById(view, i);
                                                                                                            if (listTile17 != null) {
                                                                                                                i = R.id.mili_setting_display_item_ll;
                                                                                                                ListTile listTile18 = (ListTile) ViewBindings.findChildViewById(view, i);
                                                                                                                if (listTile18 != null) {
                                                                                                                    i = R.id.mili_setting_enable_lock_screen;
                                                                                                                    ListTile listTile19 = (ListTile) ViewBindings.findChildViewById(view, i);
                                                                                                                    if (listTile19 != null) {
                                                                                                                        i = R.id.mili_setting_esim_card;
                                                                                                                        ListTile listTile20 = (ListTile) ViewBindings.findChildViewById(view, i);
                                                                                                                        if (listTile20 != null) {
                                                                                                                            i = R.id.mili_setting_faq_item;
                                                                                                                            ListTile listTile21 = (ListTile) ViewBindings.findChildViewById(view, i);
                                                                                                                            if (listTile21 != null) {
                                                                                                                                i = R.id.mili_setting_find_bracelet;
                                                                                                                                ListTile listTile22 = (ListTile) ViewBindings.findChildViewById(view, i);
                                                                                                                                if (listTile22 != null) {
                                                                                                                                    i = R.id.mili_setting_firmware_upgrade;
                                                                                                                                    ListTile listTile23 = (ListTile) ViewBindings.findChildViewById(view, i);
                                                                                                                                    if (listTile23 != null) {
                                                                                                                                        i = R.id.mili_setting_firmware_version;
                                                                                                                                        ListTile listTile24 = (ListTile) ViewBindings.findChildViewById(view, i);
                                                                                                                                        if (listTile24 != null) {
                                                                                                                                            i = R.id.mili_setting_flip_wrist_fl;
                                                                                                                                            ListTile listTile25 = (ListTile) ViewBindings.findChildViewById(view, i);
                                                                                                                                            if (listTile25 != null) {
                                                                                                                                                i = R.id.mili_setting_ges_screen_ll;
                                                                                                                                                ListTile listTile26 = (ListTile) ViewBindings.findChildViewById(view, i);
                                                                                                                                                if (listTile26 != null) {
                                                                                                                                                    i = R.id.mili_setting_hr_detect_item;
                                                                                                                                                    ListTile listTile27 = (ListTile) ViewBindings.findChildViewById(view, i);
                                                                                                                                                    if (listTile27 != null) {
                                                                                                                                                        i = R.id.mili_setting_hr_firmware_version;
                                                                                                                                                        ListTile listTile28 = (ListTile) ViewBindings.findChildViewById(view, i);
                                                                                                                                                        if (listTile28 != null) {
                                                                                                                                                            i = R.id.mili_setting_instruction_item;
                                                                                                                                                            ListTile listTile29 = (ListTile) ViewBindings.findChildViewById(view, i);
                                                                                                                                                            if (listTile29 != null) {
                                                                                                                                                                i = R.id.mili_setting_library;
                                                                                                                                                                ListTile listTile30 = (ListTile) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                if (listTile30 != null) {
                                                                                                                                                                    i = R.id.mili_setting_light_color;
                                                                                                                                                                    ListTile listTile31 = (ListTile) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                    if (listTile31 != null) {
                                                                                                                                                                        i = R.id.mili_setting_long_press_item;
                                                                                                                                                                        ListTile listTile32 = (ListTile) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                        if (listTile32 != null) {
                                                                                                                                                                            i = R.id.mili_setting_low_battery_tips;
                                                                                                                                                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                            if (textView2 != null) {
                                                                                                                                                                                i = R.id.mili_setting_message_preview;
                                                                                                                                                                                ListTile listTile33 = (ListTile) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                if (listTile33 != null) {
                                                                                                                                                                                    i = R.id.mili_setting_night_mode_item;
                                                                                                                                                                                    ListTile listTile34 = (ListTile) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                    if (listTile34 != null) {
                                                                                                                                                                                        i = R.id.mili_setting_now_time;
                                                                                                                                                                                        ListTile listTile35 = (ListTile) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                        if (listTile35 != null) {
                                                                                                                                                                                            i = R.id.mili_setting_off_wrist_lock_ll;
                                                                                                                                                                                            ListTile listTile36 = (ListTile) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                            if (listTile36 != null) {
                                                                                                                                                                                                i = R.id.mili_setting_password;
                                                                                                                                                                                                ListTile listTile37 = (ListTile) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                if (listTile37 != null) {
                                                                                                                                                                                                    i = R.id.mili_setting_playch_item;
                                                                                                                                                                                                    ListTile listTile38 = (ListTile) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                    if (listTile38 != null) {
                                                                                                                                                                                                        i = R.id.mili_setting_ring_type_item;
                                                                                                                                                                                                        ListTile listTile39 = (ListTile) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                        if (listTile39 != null) {
                                                                                                                                                                                                            HMScrollView hMScrollView = (HMScrollView) view;
                                                                                                                                                                                                            i = R.id.mili_setting_set_language;
                                                                                                                                                                                                            ListTile listTile40 = (ListTile) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                            if (listTile40 != null) {
                                                                                                                                                                                                                i = R.id.mili_setting_set_wear;
                                                                                                                                                                                                                ListTile listTile41 = (ListTile) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                if (listTile41 != null) {
                                                                                                                                                                                                                    i = R.id.mili_setting_shotcut_apps_item;
                                                                                                                                                                                                                    ListTile listTile42 = (ListTile) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                    if (listTile42 != null) {
                                                                                                                                                                                                                        i = R.id.mili_setting_sleep_assist;
                                                                                                                                                                                                                        ListTile listTile43 = (ListTile) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                        if (listTile43 != null) {
                                                                                                                                                                                                                            i = R.id.mili_setting_sport;
                                                                                                                                                                                                                            ListTile listTile44 = (ListTile) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                            if (listTile44 != null) {
                                                                                                                                                                                                                                i = R.id.mili_setting_sport_sort;
                                                                                                                                                                                                                                ListTile listTile45 = (ListTile) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                                if (listTile45 != null) {
                                                                                                                                                                                                                                    i = R.id.mili_setting_unbind;
                                                                                                                                                                                                                                    Button button = (Button) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                                    if (button != null) {
                                                                                                                                                                                                                                        i = R.id.mili_setting_vibrate_item;
                                                                                                                                                                                                                                        ListTile listTile46 = (ListTile) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                                        if (listTile46 != null) {
                                                                                                                                                                                                                                            i = R.id.mili_setting_vibrate_notify;
                                                                                                                                                                                                                                            ListTile listTile47 = (ListTile) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                                            if (listTile47 != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.mili_setting_watch_divider))) != null) {
                                                                                                                                                                                                                                                DeviceSettingViewSpaceBinding deviceSettingViewSpaceBindingBind = DeviceSettingViewSpaceBinding.bind(viewFindChildViewById2);
                                                                                                                                                                                                                                                i = R.id.mili_setting_weather_divider;
                                                                                                                                                                                                                                                View viewFindChildViewById3 = ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                                                if (viewFindChildViewById3 != null) {
                                                                                                                                                                                                                                                    DeviceSettingViewSpaceBinding deviceSettingViewSpaceBindingBind2 = DeviceSettingViewSpaceBinding.bind(viewFindChildViewById3);
                                                                                                                                                                                                                                                    i = R.id.mili_setting_weather_item;
                                                                                                                                                                                                                                                    ListTile listTile48 = (ListTile) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                                                    if (listTile48 != null) {
                                                                                                                                                                                                                                                        i = R.id.mili_setting_world_clock;
                                                                                                                                                                                                                                                        ListTile listTile49 = (ListTile) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                                                        if (listTile49 != null) {
                                                                                                                                                                                                                                                            i = R.id.mili_setting_xiaoai_mijia_authorize;
                                                                                                                                                                                                                                                            ListTile listTile50 = (ListTile) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                                                            if (listTile50 != null) {
                                                                                                                                                                                                                                                                i = R.id.mili_time_display_item_ll;
                                                                                                                                                                                                                                                                ListTile listTile51 = (ListTile) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                                                                if (listTile51 != null) {
                                                                                                                                                                                                                                                                    i = R.id.other_calendar_item;
                                                                                                                                                                                                                                                                    ListTile listTile52 = (ListTile) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                                                                    if (listTile52 != null) {
                                                                                                                                                                                                                                                                        i = R.id.play_miband2;
                                                                                                                                                                                                                                                                        ListTile listTile53 = (ListTile) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                                                                        if (listTile53 != null) {
                                                                                                                                                                                                                                                                            i = R.id.real_time_data;
                                                                                                                                                                                                                                                                            ListTile listTile54 = (ListTile) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                                                                            if (listTile54 != null) {
                                                                                                                                                                                                                                                                                i = R.id.sport_hr_broadcast;
                                                                                                                                                                                                                                                                                ListTile listTile55 = (ListTile) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                                                                                if (listTile55 != null) {
                                                                                                                                                                                                                                                                                    i = R.id.start_day_of_week_item;
                                                                                                                                                                                                                                                                                    ListTile listTile56 = (ListTile) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                                                                                                                                    if (listTile56 != null) {
                                                                                                                                                                                                                                                                                        return new ActivityMiliSettingBinding(hMScrollView, listTile, frameLayout, imageView, viewFindChildViewById, listTile2, listTile3, listTile4, listTile5, listTile6, listTile7, listTile8, linearLayout, listTile9, relativeLayout, listTile10, listTile11, listTile12, listTile13, listTile14, listTile15, listTile16, relativeLayout2, imageView2, typefaceTextView, hMExpandHeadView, textView, listTile17, listTile18, listTile19, listTile20, listTile21, listTile22, listTile23, listTile24, listTile25, listTile26, listTile27, listTile28, listTile29, listTile30, listTile31, listTile32, textView2, listTile33, listTile34, listTile35, listTile36, listTile37, listTile38, listTile39, hMScrollView, listTile40, listTile41, listTile42, listTile43, listTile44, listTile45, button, listTile46, listTile47, deviceSettingViewSpaceBindingBind, deviceSettingViewSpaceBindingBind2, listTile48, listTile49, listTile50, listTile51, listTile52, listTile53, listTile54, listTile55, listTile56);
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
    public static ActivityMiliSettingBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityMiliSettingBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_mili_setting, viewGroup, false);
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

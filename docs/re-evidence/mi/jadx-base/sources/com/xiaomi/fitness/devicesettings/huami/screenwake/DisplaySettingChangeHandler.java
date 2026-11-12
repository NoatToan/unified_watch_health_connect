package com.xiaomi.fitness.devicesettings.huami.screenwake;

import com.google.gson.Gson;
import com.huami.bluetooth.profile.channel.module.settings.entity.displayandbrightness.v2.DisplayAndBrightnessV2;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Time;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.settingitem.DeviceSettingConfigKey;
import com.xiaomi.fitness.settingitem.DeviceSettingManager;
import com.xiaomi.fitness.settingitem.db.entity.SettingItemEntity;
import com.xiaomi.fitness.settingitem.settingitem.AndroidappNotifySettings;
import com.xiaomi.fitness.settingitem.settingitem.LiftWristBrightView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/screenwake/DisplaySettingChangeHandler;", "", "<init>", "()V", "TAG", "", "handleSettingChanged", "", "did", "displayAndBrightnessV2", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/displayandbrightness/v2/DisplayAndBrightnessV2;", "convertToLiftWristBrightView", "Lcom/xiaomi/fitness/settingitem/settingitem/LiftWristBrightView;", "wristConfig", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DisplaySettingChangeHandler {

    @NotNull
    public static final DisplaySettingChangeHandler INSTANCE = new DisplaySettingChangeHandler();

    @NotNull
    public static final String TAG = "DisplaySettingChangeHandler";

    private DisplaySettingChangeHandler() {
    }

    private final LiftWristBrightView convertToLiftWristBrightView(DisplayAndBrightnessV2 wristConfig) {
        LiftWristBrightView liftWristBrightView = new LiftWristBrightView();
        liftWristBrightView.setEnable(!Intrinsics.areEqual(wristConfig.getScreenOnByTurningWristMode(), new EnumData(0)));
        liftWristBrightView.setAllday(Intrinsics.areEqual(wristConfig.getScreenOnByTurningWristMode(), new EnumData(2)));
        Time screenOnByTurningWristBeginTime = wristConfig.getScreenOnByTurningWristBeginTime();
        Intrinsics.checkNotNull(screenOnByTurningWristBeginTime);
        int hour = screenOnByTurningWristBeginTime.getHour() * 60;
        Time screenOnByTurningWristBeginTime2 = wristConfig.getScreenOnByTurningWristBeginTime();
        Intrinsics.checkNotNull(screenOnByTurningWristBeginTime2);
        liftWristBrightView.setStart(hour + screenOnByTurningWristBeginTime2.getMinute());
        Time screenOnByTurningWristEndTime = wristConfig.getScreenOnByTurningWristEndTime();
        Intrinsics.checkNotNull(screenOnByTurningWristEndTime);
        int hour2 = screenOnByTurningWristEndTime.getHour() * 60;
        Time screenOnByTurningWristEndTime2 = wristConfig.getScreenOnByTurningWristEndTime();
        Intrinsics.checkNotNull(screenOnByTurningWristEndTime2);
        liftWristBrightView.setStop(hour2 + screenOnByTurningWristEndTime2.getMinute());
        EnumData screenOnByTurningWristActiveSpeed = wristConfig.getScreenOnByTurningWristActiveSpeed();
        Intrinsics.checkNotNull(screenOnByTurningWristActiveSpeed);
        liftWristBrightView.setSensitivity(screenOnByTurningWristActiveSpeed.getValue());
        return liftWristBrightView;
    }

    public final void handleSettingChanged(@NotNull String did, @NotNull DisplayAndBrightnessV2 displayAndBrightnessV2) {
        AndroidappNotifySettings androidappNotifySettings;
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(displayAndBrightnessV2, "displayAndBrightnessV2");
        Logger.i(TAG, "handleSettingChanged " + did);
        LiftWristBrightView liftWristBrightViewConvertToLiftWristBrightView = convertToLiftWristBrightView(displayAndBrightnessV2);
        DeviceSettingManager.Companion companion = DeviceSettingManager.INSTANCE;
        companion.getInstance().sendSettingItem(did, DeviceSettingConfigKey.KEY_LIFTWRISTBRIGHTVIEW, liftWristBrightViewConvertToLiftWristBrightView);
        SettingItemEntity settingItemValue = companion.getInstance().readSettingItemValue(did, DeviceSettingConfigKey.BIG_KEY_NOTIFY_SETTINGS);
        if (settingItemValue == null || (androidappNotifySettings = (AndroidappNotifySettings) new Gson().fromJson(settingItemValue.getValue(), AndroidappNotifySettings.class)) == null) {
            return;
        }
        Boolean screenOnByNewNotificationSwitch = displayAndBrightnessV2.getScreenOnByNewNotificationSwitch();
        androidappNotifySettings.setScreenOnByNewNotificationSwitch(screenOnByNewNotificationSwitch != null ? screenOnByNewNotificationSwitch.booleanValue() : false);
        companion.getInstance().sendBigSettingItem(did, DeviceSettingConfigKey.BIG_KEY_NOTIFY_SETTINGS, androidappNotifySettings);
    }
}

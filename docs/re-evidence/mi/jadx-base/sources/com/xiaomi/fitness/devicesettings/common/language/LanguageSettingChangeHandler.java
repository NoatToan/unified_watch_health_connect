package com.xiaomi.fitness.devicesettings.common.language;

import com.huami.bluetooth.profile.channel.module.settings.entity.language.v2.SettingsLanguageV2;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.common.extensions.DeviceModelExtKt;
import com.xiaomi.fitness.devicesettings.utils.LanguageHelper;
import com.xiaomi.fitness.settingitem.DeviceSettingManager;
import com.xiaomi.fitness.settingitem.settingitem.LanguageSetting;
import com.xiaomi.hm.health.bt.sdk.DeviceInfoExt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/common/language/LanguageSettingChangeHandler;", "", "<init>", "()V", "TAG", "", "handleSettingChanged", "", "did", "language", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/language/v2/SettingsLanguageV2;", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLanguageSettingChangeHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LanguageSettingChangeHandler.kt\ncom/xiaomi/fitness/devicesettings/common/language/LanguageSettingChangeHandler\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,51:1\n1#2:52\n*E\n"})
public final class LanguageSettingChangeHandler {

    @NotNull
    public static final LanguageSettingChangeHandler INSTANCE = new LanguageSettingChangeHandler();

    @NotNull
    public static final String TAG = "LanguageSettingChangeHandler";

    private LanguageSettingChangeHandler() {
    }

    public final void handleSettingChanged(@NotNull String did, @NotNull SettingsLanguageV2 language) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(language, "language");
        EnumData language2 = language.getLanguage();
        Integer numValueOf = language2 != null ? Integer.valueOf(language2.getValue()) : null;
        Logger.i(TAG, "LanguageSettingChangeHandler language " + numValueOf + " languageFollowMobilePhoneSwitch " + language.getLanguageFollowMobilePhoneSwitch());
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getDeviceModel(did);
        }
        if (wearableDeviceModel == null || !wearableDeviceModel.getIsDeviceConnected() || DeviceModelExtKt.getHuamiDevice(wearableDeviceModel) == null) {
            return;
        }
        DeviceSettingManager.Companion companion2 = DeviceSettingManager.INSTANCE;
        Object objValueToObject = companion2.getInstance().readSettingItem(did, "language").valueToObject(LanguageSetting.class);
        LanguageSetting languageSetting = objValueToObject != null ? (LanguageSetting) objValueToObject : new LanguageSetting();
        HuamiApiCaller huamiDevice = DeviceModelExtKt.getHuamiDevice(wearableDeviceModel);
        DeviceInfoExt deviceInfo = huamiDevice != null ? huamiDevice.getDeviceInfo() : null;
        Intrinsics.checkNotNull(deviceInfo);
        languageSetting.setDeviceSource(deviceInfo.getDeviceSource());
        languageSetting.setLanguageFollowMobilePhoneSwitch(Intrinsics.areEqual(language.getLanguageFollowMobilePhoneSwitch(), Boolean.TRUE));
        EnumData language3 = language.getLanguage();
        languageSetting.setDeviceLanguage(language3 != null ? language3.getValue() : LanguageHelper.INSTANCE.getHuaMiDefaultLanguage().getLanguage());
        if (languageSetting.isLanguageFollowMobilePhoneSwitch()) {
            language.setLanguage(new EnumData(languageSetting.getDeviceLanguage()));
            HuamiApiCaller huaMiApiCaller = DeviceManagerExtKt.getInstance(companion).getHuaMiApiCaller(com.xiaomi.fitness.device.manager.DeviceModelExtKt.getMac(wearableDeviceModel));
            if (huaMiApiCaller != null) {
                huaMiApiCaller.writeSettingSync(language);
            }
        }
        companion2.getInstance().sendSettingItem(did, "language", languageSetting);
    }
}

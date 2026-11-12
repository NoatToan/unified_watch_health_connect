package com.xiaomi.hm.health.bt.profile.feature;

import com.google.android.gms.common.Scopes;
import com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType;
import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.huami.bluetooth.profile.channel.module.settings.entity.deviceinformation.AGpsTypeParser;
import com.huami.bluetooth.profile.channel.module.settings.entity.deviceinformation.DeviceInformation;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Flag;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.TimeStamp;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.profile.base.AGpsDto;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.milipro.MiLiProProfile;
import com.xiaomi.hm.health.bt.proxy.ProxyContainer;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/feature/AGpsFeatureInit;", "", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "bleDevice", "Lcom/xiaomi/hm/health/bt/profile/base/AGpsDto;", "getAGpsDto", "Lcom/xiaomi/hm/health/bt/profile/milipro/MiLiProProfile;", Scopes.PROFILE, "Lcom/xiaomi/hm/health/bt/profile/base/DeviceInfo;", "deviceInfo", "", "initAGpsFeature", "<init>", "()V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class AGpsFeatureInit {

    @NotNull
    private static final String a = "AGpsFeatureInit";

    @Nullable
    public final AGpsDto getAGpsDto(@NotNull HMBaseDevice bleDevice) {
        if (!ProxyContainer.getDeviceFeature().hasFeatureGPS(bleDevice.getMDeviceSource())) {
            Debug.fi(a, "not support gps!");
            return null;
        }
        SettingsModule settingsModule = (SettingsModule) bleDevice.getChannelModule(SettingsModule.class);
        Settings settingsQueryFieldsSync = settingsModule == null ? null : settingsModule.queryFieldsSync(false, SettingsGroupType.DEVICE_INFORMATION, CollectionsKt__CollectionsKt.arrayListOf(Integer.valueOf(DeviceInformation.KEY_A_GPS_TYPE), Integer.valueOf(DeviceInformation.KEY_A_GPS_UPGRADE_TIME), Integer.valueOf(DeviceInformation.KEY_A_GPS_EXPIRATION_TIME)));
        DeviceInformation deviceInformation = settingsQueryFieldsSync instanceof DeviceInformation ? (DeviceInformation) settingsQueryFieldsSync : null;
        if (deviceInformation == null) {
            Debug.fi(a, "getAGpsDto failed");
            return null;
        }
        Debug.fi(a, "getAGpsDto success");
        Flag aGpsType = deviceInformation.getAGpsType();
        Integer numValueOf = aGpsType == null ? null : Integer.valueOf(aGpsType.getFlag());
        TimeStamp aGpsUpgradeTime = deviceInformation.getAGpsUpgradeTime();
        Long lValueOf = aGpsUpgradeTime == null ? null : Long.valueOf(aGpsUpgradeTime.getTimeStamp());
        TimeStamp aGpsExpirationTime = deviceInformation.getAGpsExpirationTime();
        return new AGpsDto(numValueOf, lValueOf, aGpsExpirationTime != null ? Long.valueOf(aGpsExpirationTime.getTimeStamp()) : null);
    }

    public final void initAGpsFeature(@NotNull MiLiProProfile profile, @Nullable DeviceInfo deviceInfo) {
        Feature deviceFeature = deviceInfo == null ? null : deviceInfo.getDeviceFeature();
        if (deviceFeature == null) {
            return;
        }
        SettingsModule settingsModule = (SettingsModule) profile.getChannelModule(SettingsModule.class);
        if (settingsModule == null) {
            Debug.fi(a, "initAGpsFeature settingsModule null");
            return;
        }
        List<SettingsGroupType> currentGroups = settingsModule.getCurrentGroups();
        Boolean boolValueOf = currentGroups == null ? null : Boolean.valueOf(currentGroups.contains(SettingsGroupType.DEVICE_INFORMATION));
        if (boolValueOf != null && boolValueOf.booleanValue()) {
            Settings settingsQueryFieldsSync = settingsModule.queryFieldsSync(false, SettingsGroupType.DEVICE_INFORMATION, CollectionsKt__CollectionsKt.arrayListOf(Integer.valueOf(DeviceInformation.KEY_A_GPS_TYPE)));
            DeviceInformation deviceInformation = settingsQueryFieldsSync instanceof DeviceInformation ? (DeviceInformation) settingsQueryFieldsSync : null;
            if (deviceInformation == null) {
                Debug.fi(a, "initAGpsFeature query null");
                return;
            }
            AGpsTypeParser aGpsTypeParser = new AGpsTypeParser(deviceInformation.getAGpsType());
            Debug.fi(a, "epo: " + aGpsTypeParser.hasFeatureEpo() + ", glonassAlmanac: " + aGpsTypeParser.hasFeatureGlonassAlmanac() + ",sonyLLE: " + aGpsTypeParser.hasFeatureSonyLLE());
            if (aGpsTypeParser.hasFeatureEpo()) {
                deviceFeature.setSw(37);
            }
            if (aGpsTypeParser.hasFeatureGlonassAlmanac()) {
                deviceFeature.setSw(8);
            }
            if (aGpsTypeParser.hasFeatureSonyLLE()) {
                deviceFeature.setSw(22);
            }
        }
    }
}

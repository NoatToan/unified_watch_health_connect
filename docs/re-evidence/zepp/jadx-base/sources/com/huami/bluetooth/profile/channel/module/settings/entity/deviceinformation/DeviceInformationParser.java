package com.huami.bluetooth.profile.channel.module.settings.entity.deviceinformation;

import com.huami.bluetooth.profile.channel.module.settings.SettingsParserKt;
import com.huami.bluetooth.profile.channel.module.settings.entity.IParser;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.BooleanData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Flag;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.IPrimaryData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.IntData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.StringData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.TimeStamp;
import com.huami.bluetooth.profile.channel.module.settings.utils.ByteBufferExtendsKt;
import com.xiaomi.hm.health.bt.debug.Debug;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u000b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/entity/deviceinformation/DeviceInformationParser;", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/IParser;", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/deviceinformation/DeviceInformation;", "Ljava/nio/ByteBuffer;", "byteBuffer", "", "groupVersion", "parse", "<init>", "()V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class DeviceInformationParser implements IParser<DeviceInformation> {

    @NotNull
    private static final String a = "DeviceInformationParser";

    @Override // com.huami.bluetooth.profile.channel.module.settings.entity.IParser
    @Nullable
    public IPrimaryData parseUnSupport(@NotNull ByteBuffer byteBuffer, boolean z, int i) {
        return IParser.DefaultImpls.parseUnSupport(this, byteBuffer, z, i);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.entity.IParser
    @Nullable
    public DeviceInformation parse(@NotNull ByteBuffer byteBuffer, int groupVersion) {
        DeviceInformation deviceInformation = new DeviceInformation();
        deviceInformation.setGroupVersion(groupVersion);
        boolean z = ByteBufferExtendsKt.getBoolean(byteBuffer);
        byte b = byteBuffer.get();
        if (b > 0) {
            int i = 0;
            do {
                i++;
                byte b2 = byteBuffer.get();
                DeviceInformation.Companion companion = DeviceInformation.INSTANCE;
                if (b2 == companion.getKEY_UPGRADE_ORDER()) {
                    IntData intDataCheckAndGetIntData = SettingsParserKt.checkAndGetIntData(byteBuffer, "upgradeOrder", z);
                    if (intDataCheckAndGetIntData == null) {
                        return null;
                    }
                    deviceInformation.setUpgradeOrder(intDataCheckAndGetIntData);
                } else if (b2 == companion.getKEY_LANGUAGE_FAMILY()) {
                    Flag flagCheckAndGetFlagData = SettingsParserKt.checkAndGetFlagData(byteBuffer, "languageFamily");
                    if (flagCheckAndGetFlagData == null) {
                        return null;
                    }
                    deviceInformation.setLanguageFamily(flagCheckAndGetFlagData);
                } else if (b2 == companion.getKEY_BASE_RESOURCE_VERSION()) {
                    StringData stringDataCheckAndGetStringData = SettingsParserKt.checkAndGetStringData(byteBuffer, "baseResourceVersion", z);
                    if (stringDataCheckAndGetStringData == null) {
                        return null;
                    }
                    deviceInformation.setBaseResourceVersion(stringDataCheckAndGetStringData);
                } else if (b2 == companion.getKEY_INCREASE_RESOURCE_VERSION()) {
                    StringData stringDataCheckAndGetStringData2 = SettingsParserKt.checkAndGetStringData(byteBuffer, "increaseResourceVersion", z);
                    if (stringDataCheckAndGetStringData2 == null) {
                        return null;
                    }
                    deviceInformation.setIncreaseResourceVersion(stringDataCheckAndGetStringData2);
                } else if (b2 == companion.getKEY_FONT_VERSION()) {
                    StringData stringDataCheckAndGetStringData3 = SettingsParserKt.checkAndGetStringData(byteBuffer, "fontVersion", z);
                    if (stringDataCheckAndGetStringData3 == null) {
                        return null;
                    }
                    deviceInformation.setFontVersion(stringDataCheckAndGetStringData3);
                } else if (b2 == companion.getKEY_EXTERNAL_RESOURCE_VERSION()) {
                    StringData stringDataCheckAndGetStringData4 = SettingsParserKt.checkAndGetStringData(byteBuffer, "externalResourceVersion", z);
                    if (stringDataCheckAndGetStringData4 == null) {
                        return null;
                    }
                    deviceInformation.setExternalResourceVersion(stringDataCheckAndGetStringData4);
                } else if (b2 == companion.getKEY_GPS_FIRMWARE_VERSION()) {
                    StringData stringDataCheckAndGetStringData5 = SettingsParserKt.checkAndGetStringData(byteBuffer, "gpsFirmwareVersion", z);
                    if (stringDataCheckAndGetStringData5 == null) {
                        return null;
                    }
                    deviceInformation.setGpsFirmwareVersion(stringDataCheckAndGetStringData5);
                } else if (b2 == DeviceInformation.KEY_A_GPS_TYPE) {
                    Flag flagCheckAndGetFlagData2 = SettingsParserKt.checkAndGetFlagData(byteBuffer, "aGpsType");
                    if (flagCheckAndGetFlagData2 == null) {
                        return null;
                    }
                    deviceInformation.setAGpsType(flagCheckAndGetFlagData2);
                } else if (b2 == DeviceInformation.KEY_A_GPS_UPGRADE_TIME) {
                    TimeStamp timeStampCheckAndGetTimeStampData = SettingsParserKt.checkAndGetTimeStampData(byteBuffer, "aGpsUpgradeTime");
                    if (timeStampCheckAndGetTimeStampData == null) {
                        return null;
                    }
                    deviceInformation.setAGpsUpgradeTime(timeStampCheckAndGetTimeStampData);
                } else if (b2 == DeviceInformation.KEY_A_GPS_EXPIRATION_TIME) {
                    TimeStamp timeStampCheckAndGetTimeStampData2 = SettingsParserKt.checkAndGetTimeStampData(byteBuffer, "aGpsExpirationTime");
                    if (timeStampCheckAndGetTimeStampData2 == null) {
                        return null;
                    }
                    deviceInformation.setAGpsExpirationTime(timeStampCheckAndGetTimeStampData2);
                } else if (b2 == companion.getKEY_DIFFERENTIAL_PACKAGE_OTA_MARK()) {
                    BooleanData booleanDataCheckAndGetBoolean = SettingsParserKt.checkAndGetBoolean(byteBuffer, "differentialPackageOtaMark");
                    if (booleanDataCheckAndGetBoolean == null) {
                        return null;
                    }
                    deviceInformation.setDifferentialPackageOtaMark(Boolean.valueOf(booleanDataCheckAndGetBoolean.getValue()));
                } else if (b2 == companion.getKEY_IS_DOMESTIC_PRODUCT()) {
                    BooleanData booleanDataCheckAndGetBoolean2 = SettingsParserKt.checkAndGetBoolean(byteBuffer, "isDomesticProduct");
                    if (booleanDataCheckAndGetBoolean2 == null) {
                        return null;
                    }
                    deviceInformation.setDomesticProduct(Boolean.valueOf(booleanDataCheckAndGetBoolean2.getValue()));
                } else if (b2 == companion.getKEY_SYSTEM_IMAGE_STATUS()) {
                    EnumData enumDataCheckAndGetEnum = SettingsParserKt.checkAndGetEnum(byteBuffer, "systemImageStatus", z);
                    if (enumDataCheckAndGetEnum == null) {
                        return null;
                    }
                    deviceInformation.setSystemImageStatus(enumDataCheckAndGetEnum);
                } else if (b2 == companion.getKEY_LOCK_STATUS()) {
                    BooleanData booleanDataCheckAndGetBoolean3 = SettingsParserKt.checkAndGetBoolean(byteBuffer, "lockStatus");
                    if (booleanDataCheckAndGetBoolean3 == null) {
                        return null;
                    }
                    deviceInformation.setLockStatus(Boolean.valueOf(booleanDataCheckAndGetBoolean3.getValue()));
                } else {
                    IPrimaryData unSupport = parseUnSupport(byteBuffer, z, b2);
                    Debug.fi(a, "[WARNING] parseDeviceInformation unknown key: " + ((int) b2) + ", position: " + byteBuffer.position() + ", parsed: " + unSupport);
                    if (unSupport == null) {
                        return null;
                    }
                }
            } while (i < b);
        }
        return deviceInformation;
    }
}

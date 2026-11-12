package com.huami.bluetooth.profile.channel.module.settings.entity.deviceinformation;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Flag;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.IntData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.StringData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.TimeStamp;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 W2\u00020\u00012\u00020\u0002:\u0001WB\u0007¢\u0006\u0004\bU\u0010VJ\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u001c\u0010\u000b\u001a\u00020\u00058\u0016@\u0016X\u0096D¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\"\u0010\u0012\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0018\u001a\u00020\u00138\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R(\u0010\u001f\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR(\u0010%\u001a\u0004\u0018\u00010 2\b\u0010\u001a\u001a\u0004\u0018\u00010 8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R(\u0010+\u001a\u0004\u0018\u00010&2\b\u0010\u001a\u001a\u0004\u0018\u00010&8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R(\u0010.\u001a\u0004\u0018\u00010&2\b\u0010\u001a\u001a\u0004\u0018\u00010&8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b,\u0010(\"\u0004\b-\u0010*R(\u00101\u001a\u0004\u0018\u00010&2\b\u0010\u001a\u001a\u0004\u0018\u00010&8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b/\u0010(\"\u0004\b0\u0010*R(\u00104\u001a\u0004\u0018\u00010&2\b\u0010\u001a\u001a\u0004\u0018\u00010&8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b2\u0010(\"\u0004\b3\u0010*R(\u00107\u001a\u0004\u0018\u00010&2\b\u0010\u001a\u001a\u0004\u0018\u00010&8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b5\u0010(\"\u0004\b6\u0010*R(\u0010:\u001a\u0004\u0018\u00010 2\b\u0010\u001a\u001a\u0004\u0018\u00010 8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b8\u0010\"\"\u0004\b9\u0010$R(\u0010@\u001a\u0004\u0018\u00010;2\b\u0010\u001a\u001a\u0004\u0018\u00010;8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R(\u0010C\u001a\u0004\u0018\u00010;2\b\u0010\u001a\u001a\u0004\u0018\u00010;8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bA\u0010=\"\u0004\bB\u0010?R(\u0010I\u001a\u0004\u0018\u00010D2\b\u0010\u001a\u001a\u0004\u0018\u00010D8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR(\u0010J\u001a\u0004\u0018\u00010D2\b\u0010\u001a\u001a\u0004\u0018\u00010D8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bJ\u0010F\"\u0004\bK\u0010HR(\u0010Q\u001a\u0004\u0018\u00010L2\b\u0010\u001a\u001a\u0004\u0018\u00010L8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR(\u0010T\u001a\u0004\u0018\u00010D2\b\u0010\u001a\u001a\u0004\u0018\u00010D8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bR\u0010F\"\u0004\bS\u0010H¨\u0006X"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/entity/deviceinformation/DeviceInformation;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;", "Ljava/io/Serializable;", "", "key", "", "keyToString", "c", "Ljava/lang/String;", "getSettingsGroupName", "()Ljava/lang/String;", "settingsGroupName", GoogleApiAvailabilityLight.a, LogUtil.I, "getGroupVersion", "()I", "setGroupVersion", "(I)V", "groupVersion", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "e", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "getGroupType", "()Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "groupType", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IntData;", "value", "getUpgradeOrder", "()Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IntData;", "setUpgradeOrder", "(Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IntData;)V", "upgradeOrder", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Flag;", "getLanguageFamily", "()Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Flag;", "setLanguageFamily", "(Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Flag;)V", "languageFamily", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/StringData;", "getBaseResourceVersion", "()Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/StringData;", "setBaseResourceVersion", "(Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/StringData;)V", "baseResourceVersion", "getIncreaseResourceVersion", "setIncreaseResourceVersion", "increaseResourceVersion", "getFontVersion", "setFontVersion", "fontVersion", "getExternalResourceVersion", "setExternalResourceVersion", "externalResourceVersion", "getGpsFirmwareVersion", "setGpsFirmwareVersion", "gpsFirmwareVersion", "getAGpsType", "setAGpsType", "aGpsType", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/TimeStamp;", "getAGpsUpgradeTime", "()Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/TimeStamp;", "setAGpsUpgradeTime", "(Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/TimeStamp;)V", "aGpsUpgradeTime", "getAGpsExpirationTime", "setAGpsExpirationTime", "aGpsExpirationTime", "", "getDifferentialPackageOtaMark", "()Ljava/lang/Boolean;", "setDifferentialPackageOtaMark", "(Ljava/lang/Boolean;)V", "differentialPackageOtaMark", "isDomesticProduct", "setDomesticProduct", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;", "getSystemImageStatus", "()Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;", "setSystemImageStatus", "(Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;)V", "systemImageStatus", "getLockStatus", "setLockStatus", "lockStatus", "<init>", "()V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class DeviceInformation extends Settings implements Serializable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int GROUP_VERSION = 1;

    @JvmField
    public static final int KEY_A_GPS_EXPIRATION_TIME;

    @JvmField
    public static final int KEY_A_GPS_TYPE;

    @JvmField
    public static final int KEY_A_GPS_UPGRADE_TIME;

    @NotNull
    private static final HashMap<Integer, String> f;
    private static final int g;
    private static final int h;
    private static final int i;
    private static final int j;
    private static final int k;
    private static final int l;
    private static final int m;
    private static final int n;
    private static final int o;
    private static final int p;
    private static final int q;
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final String settingsGroupName = "DeviceInformation";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int groupVersion = 1;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final SettingsGroupType groupType = SettingsGroupType.DEVICE_INFORMATION;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b'\u0010(R\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u0019\u0010\r\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u0004\u001a\u0004\b\u000e\u0010\u0006R\u0019\u0010\u000f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006R\u0019\u0010\u0011\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006R\u0019\u0010\u0013\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0006R\u0019\u0010\u0015\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0004\u001a\u0004\b\u0016\u0010\u0006R\u0019\u0010\u0017\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0004\u001a\u0004\b\u0018\u0010\u0006R\u0019\u0010\u0019\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0004\u001a\u0004\b\u001a\u0010\u0006R\u0016\u0010\u001b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0004R\u0016\u0010\u001c\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0004R\u0016\u0010\u001d\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0004R\u0016\u0010\u001e\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0004R2\u0010\"\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020 0\u001fj\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020 `!8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/entity/deviceinformation/DeviceInformation$Companion;", "", "", "KEY_UPGRADE_ORDER", LogUtil.I, "getKEY_UPGRADE_ORDER", "()I", "KEY_LANGUAGE_FAMILY", "getKEY_LANGUAGE_FAMILY", "KEY_BASE_RESOURCE_VERSION", "getKEY_BASE_RESOURCE_VERSION", "KEY_INCREASE_RESOURCE_VERSION", "getKEY_INCREASE_RESOURCE_VERSION", "KEY_FONT_VERSION", "getKEY_FONT_VERSION", "KEY_EXTERNAL_RESOURCE_VERSION", "getKEY_EXTERNAL_RESOURCE_VERSION", "KEY_GPS_FIRMWARE_VERSION", "getKEY_GPS_FIRMWARE_VERSION", "KEY_DIFFERENTIAL_PACKAGE_OTA_MARK", "getKEY_DIFFERENTIAL_PACKAGE_OTA_MARK", "KEY_IS_DOMESTIC_PRODUCT", "getKEY_IS_DOMESTIC_PRODUCT", "KEY_SYSTEM_IMAGE_STATUS", "getKEY_SYSTEM_IMAGE_STATUS", "KEY_LOCK_STATUS", "getKEY_LOCK_STATUS", "GROUP_VERSION", "KEY_A_GPS_EXPIRATION_TIME", "KEY_A_GPS_TYPE", "KEY_A_GPS_UPGRADE_TIME", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "hashMap", "Ljava/util/HashMap;", "", "serialVersionUID", "J", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getKEY_BASE_RESOURCE_VERSION() {
            return DeviceInformation.i;
        }

        public final int getKEY_DIFFERENTIAL_PACKAGE_OTA_MARK() {
            return DeviceInformation.n;
        }

        public final int getKEY_EXTERNAL_RESOURCE_VERSION() {
            return DeviceInformation.l;
        }

        public final int getKEY_FONT_VERSION() {
            return DeviceInformation.k;
        }

        public final int getKEY_GPS_FIRMWARE_VERSION() {
            return DeviceInformation.m;
        }

        public final int getKEY_INCREASE_RESOURCE_VERSION() {
            return DeviceInformation.j;
        }

        public final int getKEY_IS_DOMESTIC_PRODUCT() {
            return DeviceInformation.o;
        }

        public final int getKEY_LANGUAGE_FAMILY() {
            return DeviceInformation.h;
        }

        public final int getKEY_LOCK_STATUS() {
            return DeviceInformation.q;
        }

        public final int getKEY_SYSTEM_IMAGE_STATUS() {
            return DeviceInformation.p;
        }

        public final int getKEY_UPGRADE_ORDER() {
            return DeviceInformation.g;
        }
    }

    static {
        HashMap<Integer, String> map = new HashMap<>();
        f = map;
        map.put(1, "固件升级顺序");
        g = 1;
        map.put(2, "当前固件支持的语系");
        h = 2;
        map.put(3, "基础资源版本号");
        i = 3;
        map.put(4, "（增量）资源版本号");
        j = 4;
        map.put(5, "字体版本号");
        k = 5;
        map.put(6, "扩展资源版本号");
        l = 6;
        map.put(7, "GPS固件版本号");
        m = 7;
        map.put(8, "A-GPS类型");
        KEY_A_GPS_TYPE = 8;
        map.put(9, "A-GPS更新时间");
        KEY_A_GPS_UPGRADE_TIME = 9;
        map.put(10, "A-GPS过期时间");
        KEY_A_GPS_EXPIRATION_TIME = 10;
        map.put(11, "差分包升级标记");
        n = 11;
        map.put(12, "是否是国内版产品");
        o = 12;
        map.put(13, "系统镜像状态");
        p = 13;
        map.put(14, "设备锁定状态");
        q = 14;
    }

    @Nullable
    public final TimeStamp getAGpsExpirationTime() {
        return getTimeStamp(KEY_A_GPS_EXPIRATION_TIME);
    }

    @Nullable
    public final Flag getAGpsType() {
        return getFlag(KEY_A_GPS_TYPE);
    }

    @Nullable
    public final TimeStamp getAGpsUpgradeTime() {
        return getTimeStamp(KEY_A_GPS_UPGRADE_TIME);
    }

    @Nullable
    public final StringData getBaseResourceVersion() {
        return getString(i);
    }

    @Nullable
    public final Boolean getDifferentialPackageOtaMark() {
        return getBoolean(n);
    }

    @Nullable
    public final StringData getExternalResourceVersion() {
        return getString(l);
    }

    @Nullable
    public final StringData getFontVersion() {
        return getString(k);
    }

    @Nullable
    public final StringData getGpsFirmwareVersion() {
        return getString(m);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings
    @NotNull
    public SettingsGroupType getGroupType() {
        return this.groupType;
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings
    public int getGroupVersion() {
        return this.groupVersion;
    }

    @Nullable
    public final StringData getIncreaseResourceVersion() {
        return getString(j);
    }

    @Nullable
    public final Flag getLanguageFamily() {
        return getFlag(h);
    }

    @Nullable
    public final Boolean getLockStatus() {
        return getBoolean(q);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings
    @NotNull
    public String getSettingsGroupName() {
        return this.settingsGroupName;
    }

    @Nullable
    public final EnumData getSystemImageStatus() {
        return getEnum(p);
    }

    @Nullable
    public final IntData getUpgradeOrder() {
        return getInt(g);
    }

    @Nullable
    public final Boolean isDomesticProduct() {
        return getBoolean(o);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings
    @Nullable
    public String keyToString(int key) {
        return f.get(Integer.valueOf(key));
    }

    public final void setAGpsExpirationTime(@Nullable TimeStamp timeStamp) {
        setTimeStamp(timeStamp, KEY_A_GPS_EXPIRATION_TIME);
    }

    public final void setAGpsType(@Nullable Flag flag) {
        setFlag(flag, KEY_A_GPS_TYPE);
    }

    public final void setAGpsUpgradeTime(@Nullable TimeStamp timeStamp) {
        setTimeStamp(timeStamp, KEY_A_GPS_UPGRADE_TIME);
    }

    public final void setBaseResourceVersion(@Nullable StringData stringData) {
        setString(stringData, i);
    }

    public final void setDifferentialPackageOtaMark(@Nullable Boolean bool) {
        setBoolean(bool, n);
    }

    public final void setDomesticProduct(@Nullable Boolean bool) {
        setBoolean(bool, o);
    }

    public final void setExternalResourceVersion(@Nullable StringData stringData) {
        setString(stringData, l);
    }

    public final void setFontVersion(@Nullable StringData stringData) {
        setString(stringData, k);
    }

    public final void setGpsFirmwareVersion(@Nullable StringData stringData) {
        setString(stringData, m);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings
    public void setGroupVersion(int i2) {
        this.groupVersion = i2;
    }

    public final void setIncreaseResourceVersion(@Nullable StringData stringData) {
        setString(stringData, j);
    }

    public final void setLanguageFamily(@Nullable Flag flag) {
        setFlag(flag, h);
    }

    public final void setLockStatus(@Nullable Boolean bool) {
        setBoolean(bool, q);
    }

    public final void setSystemImageStatus(@Nullable EnumData enumData) {
        setEnum(enumData, p);
    }

    public final void setUpgradeOrder(@Nullable IntData intData) {
        setInt(intData, g);
    }
}

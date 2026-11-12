package com.mi.fitness.checkupdate.util;

import com.xiaomi.fitness.cache.sp.PreferenceSupport;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0014\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005J$\u0010\u0011\u001a\u00020\u00122\b\u0010\u000e\u001a\u0004\u0018\u00010\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005J\u0018\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005J\u000e\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005J\u0018\u0010\u0016\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005J\u000e\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005J\u0018\u0010\u0018\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005J\u0018\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005J\u000e\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u0005J\u0016\u0010\u001d\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u0012J\u000e\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u0005J\u0016\u0010 \u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u0012J\u0016\u0010#\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u0005J\u0016\u0010%\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u0005R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/mi/fitness/checkupdate/util/CheckUpdatePreferenceSupport;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "spName", "", "getSpName", "()Ljava/lang/String;", "KEY_OTA_UPGRADED_WITH_VERSION", "KEY_FIRMWARE_VERSION", "KEY_LATEST_FIRMWEARE_VERSION", "KEY_IGNORE_FIRMWEAR_VERSION", "setDeviceOtaUpgradedByVersion", "", "did", "from", "to", "isDeviceOtaUpgradedByVersion", "", "saveLatestVersion", "version", "getLatestVersion", "saveLatestFirmwareVersionFromNet", "getLatestFirmwareVersionFromNet", "setIgnoreFirmwareUpdate", "isIgnoreFirmwareUpdate", "KEY_SILENT_UPGRADE_SWITCH", "KEY_SILENT_DOWNLOAD_ONLY_WIFI", "isSilentUpgradeOpen", "setSilentUpgradeOpen", "open", "isSilentDownloadOnlyWifi", "setSilentDownloadOnlyWifi", "switch", CheckUpdatePreferenceSupport.KEY_SILENT_UPGRADE_PUSHED, "isSilentUpgradePushed", "firmwareVersion", "setSilentUpgradePushed", "checkupdate_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCheckUpdatePreferenceSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckUpdatePreferenceSupport.kt\ncom/mi/fitness/checkupdate/util/CheckUpdatePreferenceSupport\n+ 2 PreferenceSupport.kt\ncom/xiaomi/fitness/cache/sp/PreferenceSupport\n*L\n1#1,91:1\n346#2,8:92\n*S KotlinDebug\n*F\n+ 1 CheckUpdatePreferenceSupport.kt\ncom/mi/fitness/checkupdate/util/CheckUpdatePreferenceSupport\n*L\n26#1:92,8\n*E\n"})
public final class CheckUpdatePreferenceSupport extends PreferenceSupport {

    @NotNull
    public static final String KEY_FIRMWARE_VERSION = "key_firmware_version";

    @NotNull
    public static final String KEY_IGNORE_FIRMWEAR_VERSION = "key_ignore_firmwere_version";

    @NotNull
    public static final String KEY_LATEST_FIRMWEARE_VERSION = "key_latest_firmware_version";

    @NotNull
    private static final String KEY_OTA_UPGRADED_WITH_VERSION = "key_ota_upgraded_with_version";

    @NotNull
    public static final String KEY_SILENT_DOWNLOAD_ONLY_WIFI = "key_silent_download_only_wifi";

    @NotNull
    private static final String KEY_SILENT_UPGRADE_PUSHED = "KEY_SILENT_UPGRADE_PUSHED";

    @NotNull
    private static final String KEY_SILENT_UPGRADE_SWITCH = "key_silent_upgrade_switch";

    @NotNull
    public static final CheckUpdatePreferenceSupport INSTANCE = new CheckUpdatePreferenceSupport();

    @NotNull
    private static final String spName = "check_update";

    private CheckUpdatePreferenceSupport() {
    }

    @NotNull
    public final String getLatestFirmwareVersionFromNet(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        return (String) getValue(KEY_LATEST_FIRMWEARE_VERSION + did, "");
    }

    @NotNull
    public final String getLatestVersion(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        return (String) getValue(KEY_FIRMWARE_VERSION + did, "");
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return spName;
    }

    public final boolean isDeviceOtaUpgradedByVersion(@Nullable String did, @Nullable String from, @Nullable String to) {
        return Intrinsics.areEqual(from + "|" + to, getAndMigrateValue(Reflection.getOrCreateKotlinClass(String.class), "key_ota_upgraded_with_version+" + did, "", getSpName(), "app_pref_ble", null));
    }

    public final boolean isIgnoreFirmwareUpdate(@NotNull String did, @Nullable String version) {
        Intrinsics.checkNotNullParameter(did, "did");
        String str = (String) getValue(KEY_IGNORE_FIRMWEAR_VERSION + did, "");
        if (version == null || version.length() == 0) {
            return false;
        }
        return str.equals(version);
    }

    public final boolean isSilentDownloadOnlyWifi(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        return ((Boolean) getValue("key_silent_download_only_wifi:" + did, Boolean.TRUE)).booleanValue();
    }

    public final boolean isSilentUpgradeOpen(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        return ((Boolean) getValue("key_silent_upgrade_switch:" + did, Boolean.FALSE)).booleanValue();
    }

    public final boolean isSilentUpgradePushed(@NotNull String did, @NotNull String firmwareVersion) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(firmwareVersion, "firmwareVersion");
        return ((Boolean) getValue("KEY_SILENT_UPGRADE_PUSHED:" + did + ":" + firmwareVersion, Boolean.FALSE)).booleanValue();
    }

    public final void saveLatestFirmwareVersionFromNet(@NotNull String did, @Nullable String version) {
        Intrinsics.checkNotNullParameter(did, "did");
        String str = KEY_LATEST_FIRMWEARE_VERSION + did;
        if (version == null) {
            version = "";
        }
        putValue(str, version);
    }

    public final void saveLatestVersion(@NotNull String did, @Nullable String version) {
        Intrinsics.checkNotNullParameter(did, "did");
        String str = KEY_FIRMWARE_VERSION + did;
        if (version == null) {
            version = "";
        }
        putValue(str, version);
    }

    public final void setDeviceOtaUpgradedByVersion(@NotNull String did, @NotNull String from, @NotNull String to) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to, "to");
        putValue("key_ota_upgraded_with_version+" + did, from + "|" + to);
    }

    public final void setIgnoreFirmwareUpdate(@NotNull String did, @Nullable String version) {
        Intrinsics.checkNotNullParameter(did, "did");
        String str = KEY_IGNORE_FIRMWEAR_VERSION + did;
        if (version == null) {
            version = "";
        }
        putValue(str, version);
    }

    public final void setSilentDownloadOnlyWifi(@NotNull String did, boolean z) {
        Intrinsics.checkNotNullParameter(did, "did");
        putValue("key_silent_download_only_wifi:" + did, Boolean.valueOf(z));
    }

    public final void setSilentUpgradeOpen(@NotNull String did, boolean open) {
        Intrinsics.checkNotNullParameter(did, "did");
        putValue("key_silent_upgrade_switch:" + did, Boolean.valueOf(open));
    }

    public final void setSilentUpgradePushed(@NotNull String did, @NotNull String firmwareVersion) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(firmwareVersion, "firmwareVersion");
        putValue("KEY_SILENT_UPGRADE_PUSHED:" + did + ":" + firmwareVersion, Boolean.TRUE);
    }
}

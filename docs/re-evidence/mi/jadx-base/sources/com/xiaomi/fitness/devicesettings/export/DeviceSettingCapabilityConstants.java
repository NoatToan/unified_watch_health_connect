package com.xiaomi.fitness.devicesettings.export;

import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.RomUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/export/DeviceSettingCapabilityConstants;", "", "<init>", "()V", "SUPPORT_APP_SORT_HIDE", "", "isSupportRecorderSync", "", "device-settings-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DeviceSettingCapabilityConstants {

    @NotNull
    public static final DeviceSettingCapabilityConstants INSTANCE = new DeviceSettingCapabilityConstants();
    public static final int SUPPORT_APP_SORT_HIDE = 16;

    private DeviceSettingCapabilityConstants() {
    }

    public final boolean isSupportRecorderSync() {
        if (!RomUtils.INSTANCE.isAtLeastHyperOS2(ApplicationExtKt.getApplication())) {
            return false;
        }
        try {
            int i = ApplicationExtKt.getApplication().getPackageManager().getPackageInfo("com.android.soundrecorder", 0).versionCode;
            Logger.i("DeviceSettingsExportModule", "recorder app version " + i);
            if (AppUtil.INSTANCE.isPlayChannel()) {
                return i >= 602130;
            }
            if (i < 602090) {
                return false;
            }
            Logger.i("DeviceSettingsExportModule", "recorder app support");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}

package com.xiaomi.fitness.devicesettings.di;

import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.devicesettings.export.sync.DeviceSettingsSyncHelper;
import com.xiaomi.fitness.devicesettings.utils.DeviceSettingsPreference;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"getHuamiDeviceAlarmSyncSrc", "", "Lcom/xiaomi/fitness/devicesettings/export/sync/DeviceSettingsSyncHelper;", "did", "", "device-settings_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class DeviceSettingsSyncHelperImplKt {
    public static final int getHuamiDeviceAlarmSyncSrc(@NotNull DeviceSettingsSyncHelper deviceSettingsSyncHelper, @NotNull String did) {
        Intrinsics.checkNotNullParameter(deviceSettingsSyncHelper, "<this>");
        Intrinsics.checkNotNullParameter(did, "did");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(DeviceSettingsSyncHelperImpl.KEY_SYNC_ALARM_SRC, Arrays.copyOf(new Object[]{did}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        Number number = (Number) DeviceSettingsPreference.INSTANCE.getNonNulValue(str, 2);
        Logger.d(DeviceSettingsSyncHelperImpl.TAG, "getHuamiDeviceAlarmSyncSrc " + did + " " + number.intValue());
        return number.intValue();
    }
}

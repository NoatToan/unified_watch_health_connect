package com.xiaomi.fitness.devicesettings.export;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/export/DeviceSettingConstants;", "", "<init>", "()V", "sActionMusicSettingChange", "", "getSActionMusicSettingChange", "()Ljava/lang/String;", "device-settings-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DeviceSettingConstants {

    @NotNull
    public static final DeviceSettingConstants INSTANCE = new DeviceSettingConstants();

    @NotNull
    private static final String sActionMusicSettingChange = "com.xiaomi.wearable.device-settings.muisc.setting.change";

    private DeviceSettingConstants() {
    }

    @NotNull
    public final String getSActionMusicSettingChange() {
        return sActionMusicSettingChange;
    }
}

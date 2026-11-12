package com.xiaomi.fitness.userinfo.collect;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/userinfo/collect/DeviceInfoKey;", "", "<init>", "()V", "PHONE_HARDWARE_MODEL", "", "OS_VER", "DEVICE_SETTING", "DEVICE_ID", "user-info_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DeviceInfoKey {

    @NotNull
    public static final String DEVICE_ID = "device_id";

    @NotNull
    public static final String DEVICE_SETTING = "device_setting";

    @NotNull
    public static final DeviceInfoKey INSTANCE = new DeviceInfoKey();

    @NotNull
    public static final String OS_VER = "os_ver";

    @NotNull
    public static final String PHONE_HARDWARE_MODEL = "phone_hardware_model";

    private DeviceInfoKey() {
    }
}

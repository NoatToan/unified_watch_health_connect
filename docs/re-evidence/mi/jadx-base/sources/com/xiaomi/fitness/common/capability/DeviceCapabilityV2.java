package com.xiaomi.fitness.common.capability;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/common/capability/DeviceCapabilityV2;", "", "<init>", "()V", "DEVICE_CAPABILITY_SUPPORT_FOCUS_NOTIFICATION_V2", "", "DEVICE_CAPABILITY_SUPPORT_CTA", "DEVICE_CAPABILITY_SUPPORT_WRIST_POSTURE", "DEVICE_CAPABILITY_SUPPORT_AIVS_LLM", "DEVICE_CAPABILITY_SUPPORT_RUNNING_ROUTE", "DEVICE_CAPABILITY_SUPPORT_TEMPERATURE_REPORT", "DEVICE_CAPABILITY_SUPPORT_WIDGET_V3", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DeviceCapabilityV2 {
    public static final int DEVICE_CAPABILITY_SUPPORT_AIVS_LLM = 256;
    public static final int DEVICE_CAPABILITY_SUPPORT_CTA = 1;
    public static final int DEVICE_CAPABILITY_SUPPORT_FOCUS_NOTIFICATION_V2 = 64;
    public static final int DEVICE_CAPABILITY_SUPPORT_RUNNING_ROUTE = 4;
    public static final int DEVICE_CAPABILITY_SUPPORT_TEMPERATURE_REPORT = 65536;
    public static final int DEVICE_CAPABILITY_SUPPORT_WIDGET_V3 = 128;
    public static final int DEVICE_CAPABILITY_SUPPORT_WRIST_POSTURE = 8;

    @NotNull
    public static final DeviceCapabilityV2 INSTANCE = new DeviceCapabilityV2();

    private DeviceCapabilityV2() {
    }
}

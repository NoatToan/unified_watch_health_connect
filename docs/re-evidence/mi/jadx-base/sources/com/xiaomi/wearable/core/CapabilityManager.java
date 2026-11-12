package com.xiaomi.wearable.core;

import com.xiaomi.wearable.utils.SharedPreferencesUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\nJ\u0016\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0005J\u0016\u0010\u0010\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\nJ\u000e\u0010\u0011\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/wearable/core/CapabilityManager;", "", "<init>", "()V", "KEY_APP_CAPABILITY", "", "KEY_DEVICE_CAPABILITY", "setAppCapabilities", "", "appCapabilities", "", "getAppCapabilities", "setDeviceCapabilities", "did", "deviceCapability", "getDeviceCapabilities", "setDeviceCapabilitiesV2", "getDeviceCapabilitiesV2", "miwear-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CapabilityManager {

    @NotNull
    public static final CapabilityManager INSTANCE = new CapabilityManager();

    @NotNull
    private static final String KEY_APP_CAPABILITY = "key_app_capability";

    @NotNull
    private static final String KEY_DEVICE_CAPABILITY = "key_device_capability";

    private CapabilityManager() {
    }

    public final int getAppCapabilities() {
        return SharedPreferencesUtil.INSTANCE.getInt(KEY_APP_CAPABILITY, 0);
    }

    public final int getDeviceCapabilities(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        return SharedPreferencesUtil.INSTANCE.getInt("key_device_capability-v1-" + did, 0);
    }

    public final int getDeviceCapabilitiesV2(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        return SharedPreferencesUtil.INSTANCE.getInt("key_device_capability-v2-" + did, 0);
    }

    public final void setAppCapabilities(int appCapabilities) {
        SharedPreferencesUtil.INSTANCE.setInt(KEY_APP_CAPABILITY, appCapabilities);
    }

    public final void setDeviceCapabilities(@NotNull String did, int deviceCapability) {
        Intrinsics.checkNotNullParameter(did, "did");
        SharedPreferencesUtil.INSTANCE.setInt("key_device_capability-v1-" + did, deviceCapability);
    }

    public final void setDeviceCapabilitiesV2(@NotNull String did, int deviceCapability) {
        Intrinsics.checkNotNullParameter(did, "did");
        SharedPreferencesUtil.INSTANCE.setInt("key_device_capability-v2-" + did, deviceCapability);
    }
}

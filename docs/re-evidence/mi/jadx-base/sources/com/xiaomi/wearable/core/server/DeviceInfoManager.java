package com.xiaomi.wearable.core.server;

import com.xiaomi.wearable.utils.SharedPreferencesUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\t\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\u0005J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u0005J\b\u0010\r\u001a\u0004\u0018\u00010\u0005J\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005J\u0016\u0010\u000f\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005J\u000e\u0010\u0011\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u0005J\u0016\u0010\u0012\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u0005J\u0016\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0005J\u0006\u0010\u0019\u001a\u00020\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/wearable/core/server/DeviceInfoManager;", "", "<init>", "()V", "KEY_DEFAULT_DEVICE", "", "KEY_DEFAULT_DEVICE_MODEL", "KEY_DISCONNECT_DEVICE", "KEY_CONNECT_STATE", "getDeviceInfo", "did", "setCurrentDeviceInfo", "", "getCurrentDeviceDid", "getCurrentDeviceModel", "addDeviceInfo", "deviceInfo", "removeDeviceInfo", "setDisconnectDevice", "disconnect", "", "isDisconnectDevice", "setDeviceConnectState", "connected", "model", "getDeviceConnectState", "miwear-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DeviceInfoManager {

    @NotNull
    public static final DeviceInfoManager INSTANCE = new DeviceInfoManager();

    @NotNull
    private static final String KEY_CONNECT_STATE = "connect_state";

    @NotNull
    private static final String KEY_DEFAULT_DEVICE = "current_device";

    @NotNull
    private static final String KEY_DEFAULT_DEVICE_MODEL = "current_device_model";

    @NotNull
    private static final String KEY_DISCONNECT_DEVICE = "disconnect_device_";

    private DeviceInfoManager() {
    }

    public final void addDeviceInfo(@NotNull String did, @NotNull String deviceInfo) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        SharedPreferencesUtil.INSTANCE.setString(did, deviceInfo);
    }

    @Nullable
    public final String getCurrentDeviceDid() {
        return SharedPreferencesUtil.INSTANCE.getString(KEY_DEFAULT_DEVICE, "");
    }

    @Nullable
    public final String getCurrentDeviceModel() {
        return SharedPreferencesUtil.INSTANCE.getString(KEY_DEFAULT_DEVICE_MODEL, "");
    }

    public final boolean getDeviceConnectState() {
        return SharedPreferencesUtil.INSTANCE.getBoolean(KEY_CONNECT_STATE, false);
    }

    @Nullable
    public final String getDeviceInfo(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        return SharedPreferencesUtil.INSTANCE.getString(did, "");
    }

    public final boolean isDisconnectDevice(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        return SharedPreferencesUtil.INSTANCE.getBoolean(KEY_DISCONNECT_DEVICE + did, false);
    }

    public final void removeDeviceInfo(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        SharedPreferencesUtil.INSTANCE.removeString(did);
    }

    public final void setCurrentDeviceInfo(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        SharedPreferencesUtil.INSTANCE.setString(KEY_DEFAULT_DEVICE, did);
    }

    public final void setDeviceConnectState(boolean connected, @NotNull String model) {
        Intrinsics.checkNotNullParameter(model, "model");
        SharedPreferencesUtil sharedPreferencesUtil = SharedPreferencesUtil.INSTANCE;
        sharedPreferencesUtil.setBoolean(KEY_CONNECT_STATE, connected);
        sharedPreferencesUtil.setString(KEY_DEFAULT_DEVICE_MODEL, model);
    }

    public final void setDisconnectDevice(@NotNull String did, boolean disconnect) {
        Intrinsics.checkNotNullParameter(did, "did");
        SharedPreferencesUtil.INSTANCE.setBoolean(KEY_DISCONNECT_DEVICE + did, disconnect);
    }
}

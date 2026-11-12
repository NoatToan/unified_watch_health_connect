package com.huami.watchfacesstore.device.channel;

import androidx.p008lifecycle.MutableLiveData;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0016R\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000fR\u001f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0015\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/huami/watchfacesstore/device/channel/WFChannel;", "Lcom/huami/watchfacesstore/device/channel/IBlueToothChannel;", "", "isOpen", "", "onBleOpened", "", "status", "onDeviceConnectStatus", "isCharging", "onBatteryCharging", "Landroidx/lifecycle/MutableLiveData;", "a", "Landroidx/lifecycle/MutableLiveData;", "getBleOpenLiveData", "()Landroidx/lifecycle/MutableLiveData;", "bleOpenLiveData", "b", "getConnectLiveData", "connectLiveData", "c", "getBatteryLiveData", "batteryLiveData", "<init>", "()V", "Companion", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class WFChannel implements IBlueToothChannel {
    public static final int DEVICE_CONNECTED = 0;
    public static final int DEVICE_CONNECTING = 1;
    public static final int DEVICE_CONNECT_FAIL = 2;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> bleOpenLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Integer> connectLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> batteryLiveData = new MutableLiveData<>();

    @NotNull
    public final MutableLiveData<Boolean> getBatteryLiveData() {
        return this.batteryLiveData;
    }

    @NotNull
    public final MutableLiveData<Boolean> getBleOpenLiveData() {
        return this.bleOpenLiveData;
    }

    @NotNull
    public final MutableLiveData<Integer> getConnectLiveData() {
        return this.connectLiveData;
    }

    @Override // com.huami.watchfacesstore.device.channel.IBlueToothChannel
    public void onBatteryCharging(boolean isCharging) {
        this.batteryLiveData.setValue(Boolean.valueOf(isCharging));
    }

    @Override // com.huami.watchfacesstore.device.channel.IBlueToothChannel
    public void onBleOpened(boolean isOpen) {
        this.bleOpenLiveData.setValue(Boolean.valueOf(isOpen));
    }

    @Override // com.huami.watchfacesstore.device.channel.IBlueToothChannel
    public void onDeviceConnectStatus(int status) {
        this.connectLiveData.setValue(Integer.valueOf(status));
    }
}

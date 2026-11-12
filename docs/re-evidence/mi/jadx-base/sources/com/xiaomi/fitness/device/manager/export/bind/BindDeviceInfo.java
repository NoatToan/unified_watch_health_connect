package com.xiaomi.fitness.device.manager.export.bind;

import com.xiaomi.fitness.device.manager.export.add.DeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0012\u0010\u000e\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0010\u001a\u0004\u0018\u00010\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000b\"\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u0017X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/device/manager/export/bind/BindDeviceInfo;", "", "deviceInfo", "Lcom/xiaomi/fitness/device/manager/export/add/DeviceInfo;", "<init>", "(Lcom/xiaomi/fitness/device/manager/export/add/DeviceInfo;)V", "getDeviceInfo", "()Lcom/xiaomi/fitness/device/manager/export/add/DeviceInfo;", "bleMac", "", "getBleMac", "()Ljava/lang/String;", "model", "getModel", "bleName", "getBleName", "oob", "getOob", "nodeId", "getNodeId", "setNodeId", "(Ljava/lang/String;)V", "step", "", "getStep", "()I", "isSportMachine", "", "()Z", "isEarPhone", "device-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BindDeviceInfo {

    @NotNull
    private final DeviceInfo deviceInfo;

    @Nullable
    private String nodeId;
    private final int step;

    public BindDeviceInfo(@NotNull DeviceInfo deviceInfo) {
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        this.deviceInfo = deviceInfo;
    }

    @NotNull
    public abstract String getBleMac();

    @NotNull
    public abstract String getBleName();

    @NotNull
    public final DeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    @NotNull
    public abstract String getModel();

    @Nullable
    public final String getNodeId() {
        return this.nodeId;
    }

    @Nullable
    public abstract String getOob();

    public int getStep() {
        return this.step;
    }

    public final boolean isEarPhone() {
        return this.deviceInfo.isEarPhone();
    }

    public final boolean isSportMachine() {
        return this.deviceInfo.isSportMachine();
    }

    public final void setNodeId(@Nullable String str) {
        this.nodeId = str;
    }
}

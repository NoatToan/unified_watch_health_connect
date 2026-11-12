package com.xiaomi.fitness.device.manager.ui.bind;

import com.xiaomi.fitness.device.manager.export.add.DeviceInfo;
import com.xiaomi.fitness.device.manager.export.bind.BindDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0016\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/device/manager/ui/bind/NFCDeviceInfo;", "Lcom/xiaomi/fitness/device/manager/export/bind/BindDeviceInfo;", "deviceinfo", "Lcom/xiaomi/fitness/device/manager/export/add/DeviceInfo;", "bleMac", "", "model", "bleName", "oob", "step", "", "<init>", "(Lcom/xiaomi/fitness/device/manager/export/add/DeviceInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getDeviceinfo", "()Lcom/xiaomi/fitness/device/manager/export/add/DeviceInfo;", "getBleMac", "()Ljava/lang/String;", "setBleMac", "(Ljava/lang/String;)V", "getModel", "getBleName", "getOob", "getStep", "()I", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NFCDeviceInfo extends BindDeviceInfo {

    @NotNull
    private String bleMac;

    @NotNull
    private final String bleName;

    @NotNull
    private final DeviceInfo deviceinfo;

    @NotNull
    private final String model;

    @Nullable
    private final String oob;
    private final int step;

    public /* synthetic */ NFCDeviceInfo(DeviceInfo deviceInfo, String str, String str2, String str3, String str4, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(deviceInfo, (i2 & 2) != 0 ? "" : str, str2, str3, (i2 & 16) != 0 ? null : str4, (i2 & 32) != 0 ? 0 : i);
    }

    @Override // com.xiaomi.fitness.device.manager.export.bind.BindDeviceInfo
    @NotNull
    public String getBleMac() {
        return this.bleMac;
    }

    @Override // com.xiaomi.fitness.device.manager.export.bind.BindDeviceInfo
    @NotNull
    public String getBleName() {
        return this.bleName;
    }

    @NotNull
    public final DeviceInfo getDeviceinfo() {
        return this.deviceinfo;
    }

    @Override // com.xiaomi.fitness.device.manager.export.bind.BindDeviceInfo
    @NotNull
    public String getModel() {
        return this.model;
    }

    @Override // com.xiaomi.fitness.device.manager.export.bind.BindDeviceInfo
    @Nullable
    public String getOob() {
        return this.oob;
    }

    @Override // com.xiaomi.fitness.device.manager.export.bind.BindDeviceInfo
    public int getStep() {
        return this.step;
    }

    public void setBleMac(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.bleMac = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NFCDeviceInfo(@NotNull DeviceInfo deviceinfo, @NotNull String bleMac, @NotNull String model, @NotNull String bleName, @Nullable String str, int i) {
        super(deviceinfo);
        Intrinsics.checkNotNullParameter(deviceinfo, "deviceinfo");
        Intrinsics.checkNotNullParameter(bleMac, "bleMac");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(bleName, "bleName");
        this.deviceinfo = deviceinfo;
        this.bleMac = bleMac;
        this.model = model;
        this.bleName = bleName;
        this.oob = str;
        this.step = i;
    }
}

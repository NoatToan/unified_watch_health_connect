package com.xiaomi.fitness.rn.models;

import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.rn.export.bean.RNDevice;
import com.xiaomi.fitness.rn.export.bean.RNDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0010H\u0016J\u0010\u0010\"\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\u0003H\u0016J\u0010\u0010'\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0010H\u0016J\u0010\u0010(\u001a\u00020\u00192\u0006\u0010)\u001a\u00020\u0010H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005R\u001a\u0010\t\u001a\u00020\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0011R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0015R\u0014\u0010\u001e\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u001a\u0010$\u001a\u00020\u0010X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0011\"\u0004\b%\u0010&R\u0016\u0010#\u001a\u0004\u0018\u00010*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lcom/xiaomi/fitness/rn/models/PluginDeviceModel;", "Lcom/xiaomi/fitness/rn/models/RNDeviceModelWrapper;", "deviceInfo", "Lcom/xiaomi/fitness/rn/export/bean/RNDeviceInfo;", "<init>", "(Lcom/xiaomi/fitness/rn/export/bean/RNDeviceInfo;)V", "getDeviceInfo", "()Lcom/xiaomi/fitness/rn/export/bean/RNDeviceInfo;", "setDeviceInfo", "deviceStatus", "", "getDeviceStatus", "()I", "setDeviceStatus", "(I)V", "isDeviceConnected", "", "()Z", "did", "", "getDid", "()Ljava/lang/String;", "setDid", "(Ljava/lang/String;)V", "destroy", "", "isRemoved", "isCurrent", "alias", "getAlias", "product", "Lcom/xiaomi/fitness/device/manager/bean/Product;", "getProduct", "()Lcom/xiaomi/fitness/device/manager/bean/Product;", "initByModelDevice", "device", "isReAdded", "setReAdded", "(Z)V", "setCurrentStatus", "onBindSuccess", "rebind", "Lcom/xiaomi/fitness/rn/export/bean/RNDevice;", "getDevice", "()Lcom/xiaomi/fitness/rn/export/bean/RNDevice;", "sdk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PluginDeviceModel implements RNDeviceModelWrapper {

    @NotNull
    private RNDeviceInfo deviceInfo;
    private int deviceStatus;

    @NotNull
    private String did;
    private boolean isReAdded;

    public PluginDeviceModel(@NotNull RNDeviceInfo deviceInfo) {
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        this.deviceInfo = deviceInfo;
        this.deviceStatus = 1;
        this.did = getDeviceInfo().getDid();
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceModel
    public void destroy(boolean isRemoved) {
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceModel
    @Nullable
    public String getAlias() {
        return getDeviceInfo().getBleName();
    }

    @Override // com.xiaomi.fitness.rn.export.RNDeviceModel
    @Nullable
    public RNDevice getDevice() {
        return (RNDevice) getDeviceInfo().device;
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceModel
    public int getDeviceStatus() {
        return this.deviceStatus;
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceModel
    @NotNull
    public String getDid() {
        return this.did;
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceModel
    @NotNull
    public Product getProduct() {
        Product product = getDeviceInfo().getProduct();
        return product == null ? new Product(0, null, null, 0, null, null, null, null, null, null, null, 0, 0, 0, null, 0, 0, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 3, null) : product;
    }

    @Override // com.xiaomi.fitness.rn.models.RNDeviceModelInternal
    public void initByModelDevice(@NotNull RNDeviceInfo device) {
        Intrinsics.checkNotNullParameter(device, "device");
        setDeviceInfo(device);
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceModel
    /* JADX INFO: renamed from: isCurrent */
    public boolean getIsCurrent() {
        return false;
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceModel
    /* JADX INFO: renamed from: isDeviceConnected */
    public boolean getIsDeviceConnected() {
        return true;
    }

    @Override // com.xiaomi.fitness.rn.export.RNDeviceModel
    public boolean isOwner() {
        return RNDeviceModelWrapper.DefaultImpls.isOwner(this);
    }

    @Override // com.xiaomi.fitness.rn.models.RNDeviceModelInternal
    /* JADX INFO: renamed from: isReAdded, reason: from getter */
    public boolean getIsReAdded() {
        return this.isReAdded;
    }

    @Override // com.xiaomi.fitness.rn.models.RNDeviceModelInternal
    public void onBindSuccess(boolean rebind) {
    }

    @Override // com.xiaomi.fitness.rn.models.RNDeviceModelInternal
    public void setCurrentStatus(boolean isCurrent) {
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceModel
    public void setDeviceStatus(int i) {
        this.deviceStatus = i;
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceModel
    public void setDid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.did = str;
    }

    @Override // com.xiaomi.fitness.rn.models.RNDeviceModelInternal
    public void setReAdded(boolean z) {
        this.isReAdded = z;
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceModel
    @NotNull
    public RNDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceModel
    public void setDeviceInfo(@NotNull RNDeviceInfo rNDeviceInfo) {
        Intrinsics.checkNotNullParameter(rNDeviceInfo, "<set-?>");
        this.deviceInfo = rNDeviceInfo;
    }
}

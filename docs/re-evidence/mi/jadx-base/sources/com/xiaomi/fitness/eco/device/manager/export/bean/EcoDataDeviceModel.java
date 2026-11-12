package com.xiaomi.fitness.eco.device.manager.export.bean;

import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import defpackage.eu6;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001BU\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\b\b\u0002\u0010$\u001a\u00020\u0002\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010(\u001a\u00020'\u0012\b\b\u0002\u0010,\u001a\u00020\u0002¢\u0006\u0004\b-\u0010.J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00042\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\r\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\"\u0010\u0017\u001a\u00020\u00168\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\u001e\u001a\u00020\u001d8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010\u0014\u001a\u0004\b$\u0010\u0015R\u001c\u0010%\u001a\u0004\u0018\u00010\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010\u0018\u001a\u0004\b&\u0010\u001aR\u001a\u0010(\u001a\u00020'8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010,\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010\u0014\u001a\u0004\b,\u0010\u0015¨\u0006/"}, d2 = {"Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoDataDeviceModel;", "Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;", "", "isRemoved", "", "destroy", "(Z)V", "Leu6;", "Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoLocalInfo;", "callback", "readLocalInfo", "(Leu6;)V", "", "deviceStatus", "I", "getDeviceStatus", "()I", "setDeviceStatus", "(I)V", "isDeviceConnected", "Z", "()Z", "", "did", "Ljava/lang/String;", "getDid", "()Ljava/lang/String;", "setDid", "(Ljava/lang/String;)V", "Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoDeviceInfo;", "deviceInfo", "Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoDeviceInfo;", "getDeviceInfo", "()Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoDeviceInfo;", "setDeviceInfo", "(Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoDeviceInfo;)V", "isCurrent", "alias", "getAlias", "Lcom/xiaomi/fitness/device/manager/bean/Product;", "product", "Lcom/xiaomi/fitness/device/manager/bean/Product;", "getProduct", "()Lcom/xiaomi/fitness/device/manager/bean/Product;", "isConnectActive", "<init>", "(IZLjava/lang/String;Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoDeviceInfo;ZLjava/lang/String;Lcom/xiaomi/fitness/device/manager/bean/Product;Z)V", "eco-device-manager-export_release"}, k = 1, mv = {2, 0, 0})
public final class EcoDataDeviceModel implements EcoDeviceModel {

    @Nullable
    private final String alias;

    @NotNull
    private EcoDeviceInfo deviceInfo;
    private int deviceStatus;

    @NotNull
    private String did;
    private final boolean isConnectActive;
    private final boolean isCurrent;
    private final boolean isDeviceConnected;

    @NotNull
    private final Product product;

    public EcoDataDeviceModel(int i, boolean z, @NotNull String did, @NotNull EcoDeviceInfo deviceInfo, boolean z2, @Nullable String str, @NotNull Product product, boolean z3) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        Intrinsics.checkNotNullParameter(product, "product");
        this.deviceStatus = i;
        this.isDeviceConnected = z;
        this.did = did;
        this.deviceInfo = deviceInfo;
        this.isCurrent = z2;
        this.alias = str;
        this.product = product;
        this.isConnectActive = z3;
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceModel
    public void destroy(boolean isRemoved) {
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceModel
    @Nullable
    public String getAlias() {
        return this.alias;
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
        return this.product;
    }

    @Override // com.xiaomi.eco.server.IEcoConnectActive
    /* JADX INFO: renamed from: isConnectActive, reason: from getter */
    public boolean getIsConnectActive() {
        return this.isConnectActive;
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceModel
    /* JADX INFO: renamed from: isCurrent, reason: from getter */
    public boolean getIsCurrent() {
        return this.isCurrent;
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceModel
    /* JADX INFO: renamed from: isDeviceConnected, reason: from getter */
    public boolean getIsDeviceConnected() {
        return this.isDeviceConnected;
    }

    @Override // com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel
    public void readLocalInfo(@Nullable eu6<EcoLocalInfo> callback) {
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

    @Override // com.xiaomi.fitness.device.manager.DeviceModel
    @NotNull
    public EcoDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceModel
    public void setDeviceInfo(@NotNull EcoDeviceInfo ecoDeviceInfo) {
        Intrinsics.checkNotNullParameter(ecoDeviceInfo, "<set-?>");
        this.deviceInfo = ecoDeviceInfo;
    }

    public /* synthetic */ EcoDataDeviceModel(int i, boolean z, String str, EcoDeviceInfo ecoDeviceInfo, boolean z2, String str2, Product product, boolean z3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? -1 : i, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? "" : str, ecoDeviceInfo, (i2 & 16) != 0 ? false : z2, (i2 & 32) != 0 ? "" : str2, product, (i2 & 128) != 0 ? false : z3);
    }
}

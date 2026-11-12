package com.xiaomi.fitness.research.device;

import android.os.RemoteException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.WatchInfo;
import com.xiaomi.fitness.device.manager.export.bean.WearableDeviceInfo;
import defpackage.eu6;
import defpackage.y56;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0013¢\u0006\u0004\b3\u00104J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00042\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\"\u0010\u0019\u001a\u00020\u00138\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0015\"\u0004\b\u001c\u0010\u001dR$\u0010\"\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010\u000e\"\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R$\u0010*\u001a\u00020%2\u0006\u0010\u001e\u001a\u00020%8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010$R\u0016\u0010-\u001a\u0004\u0018\u00010\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\u0015R\u0014\u00101\u001a\u00020.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u00102\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u0010$¨\u00065"}, d2 = {"Lcom/xiaomi/fitness/research/device/DeviceModelClient;", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "", "isRemoved", "", "destroy", "(Z)V", "Leu6;", "Lcom/xiaomi/fitness/device/manager/export/bean/WatchInfo;", "callback", "readWatchInfo", "(Leu6;)V", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "Ly56;", "mRemote", "Ly56;", "did", "Ljava/lang/String;", "getDid", "setDid", "(Ljava/lang/String;)V", "value", "getDeviceStatus", "setDeviceStatus", "(I)V", "deviceStatus", "isDeviceConnected", "()Z", "Lcom/xiaomi/fitness/device/manager/export/bean/WearableDeviceInfo;", "getDeviceInfo", "()Lcom/xiaomi/fitness/device/manager/export/bean/WearableDeviceInfo;", "setDeviceInfo", "(Lcom/xiaomi/fitness/device/manager/export/bean/WearableDeviceInfo;)V", "deviceInfo", "isCurrent", "getAlias", "alias", "Lcom/xiaomi/fitness/device/manager/bean/Product;", "getProduct", "()Lcom/xiaomi/fitness/device/manager/bean/Product;", "product", "isConnectActive", "<init>", "(Ly56;Ljava/lang/String;)V", "research-support_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nDeviceModelClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceModelClient.kt\ncom/xiaomi/fitness/research/device/DeviceModelClient\n+ 2 GsonExt.kt\ncom/xiaomi/fitness/common/extensions/GsonExtKt\n*L\n1#1,77:1\n63#2:78\n53#2,7:79\n*S KotlinDebug\n*F\n+ 1 DeviceModelClient.kt\ncom/xiaomi/fitness/research/device/DeviceModelClient\n*L\n33#1:78\n33#1:79,7\n*E\n"})
public final class DeviceModelClient implements WearableDeviceModel {

    @NotNull
    private String did;

    @NotNull
    private final y56 mRemote;

    public DeviceModelClient(@NotNull y56 mRemote, @NotNull String did) {
        Intrinsics.checkNotNullParameter(mRemote, "mRemote");
        Intrinsics.checkNotNullParameter(did, "did");
        this.mRemote = mRemote;
        this.did = did;
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceModel
    public void destroy(boolean isRemoved) {
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(DeviceModelClient.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.xiaomi.fitness.research.device.DeviceModelClient");
        return Intrinsics.areEqual(getDid(), ((DeviceModelClient) other).getDid());
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceModel
    @Nullable
    public String getAlias() {
        return getProduct().getAlias();
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceModel
    public int getDeviceStatus() {
        return this.mRemote.getDeviceStatus(getDid());
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

    public int hashCode() {
        return getDid().hashCode();
    }

    @Override // com.xiaomi.fitness.device.manager.export.IConnectActive
    /* JADX INFO: renamed from: isConnectActive */
    public boolean getIsConnectActive() {
        return false;
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceModel
    /* JADX INFO: renamed from: isCurrent */
    public boolean getIsCurrent() {
        return true;
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceModel
    /* JADX INFO: renamed from: isDeviceConnected */
    public boolean getIsDeviceConnected() {
        return this.mRemote.isConnected(getDid());
    }

    @Override // com.xiaomi.fitness.device.manager.export.WearableDeviceModel
    public void readWatchInfo(@Nullable eu6<WatchInfo> callback) {
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceModel
    public void setDeviceInfo(@NotNull WearableDeviceInfo value) {
        Intrinsics.checkNotNullParameter(value, "value");
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceModel
    public void setDeviceStatus(int i) throws RemoteException {
        this.mRemote.setDeviceStatus(getDid(), i);
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceModel
    public void setDid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.did = str;
    }

    @NotNull
    public String toString() {
        return "DeviceModelClient(mRemote=" + this.mRemote + ", did='" + getDid() + "')";
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceModel
    @NotNull
    public WearableDeviceInfo getDeviceInfo() throws RemoteException {
        String deviceInfo = this.mRemote.getDeviceInfo(getDid());
        if (deviceInfo == null || deviceInfo.length() == 0) {
            return new WearableDeviceInfo();
        }
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.excludeFieldsWithModifiers(8, 128).enableComplexMapKeySerialization().serializeNulls().serializeSpecialFloatingPointValues().setLenient();
        Gson gsonCreate = gsonBuilder.create();
        Intrinsics.checkNotNullExpressionValue(gsonCreate, "create(...)");
        return (WearableDeviceInfo) gsonCreate.fromJson(deviceInfo, new TypeToken<WearableDeviceInfo>() { // from class: com.xiaomi.fitness.research.device.DeviceModelClient$special$$inlined$jsonToBean$1
        }.getType());
    }
}

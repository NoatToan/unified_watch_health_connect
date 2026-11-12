package com.xiaomi.fitness.eco.device.manager;

import android.os.RemoteException;
import com.miui.tsmclient.model.ErrorCode;
import com.xiaomi.fit.eco.device.extensions.EcoDeviceModelExtKt;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.eco.device.contact.export.EcoDeviceContact;
import com.xiaomi.fitness.eco.device.contact.export.EcoDeviceSyncExtKt;
import com.xiaomi.fitness.eco.device.contact.export.EcoSyncResult;
import com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoDeviceInfo;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoLocalInfo;
import com.xiaomi.fitness.eco.device.manager.remote.EcoDeviceModelRemote;
import defpackage.eu6;
import defpackage.ms7;
import defpackage.two;
import defpackage.u7r;
import defpackage.uxo;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\u0016¢\u0006\u0004\bA\u0010BJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00042\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001e\u0010\u0006J\u000f\u0010\u001f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001f\u0010\rR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\"\u0010#\u001a\u00020\u00168\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0018\"\u0004\b&\u0010'R$\u0010,\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020\u000f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b)\u0010\u0011\"\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R$\u00102\u001a\u00020\u00192\u0006\u0010(\u001a\u00020\u00198V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b/\u00100\"\u0004\b1\u0010\u001cR\u0014\u00103\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u0010.R\u0016\u00105\u001a\u0004\u0018\u00010\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u0010\u0018R\u0014\u00109\u001a\u0002068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0014\u0010:\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010.R\u0014\u0010>\u001a\u00020;8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R$\u0010?\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00028V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b?\u0010.\"\u0004\b@\u0010\u0006¨\u0006C"}, d2 = {"Lcom/xiaomi/fitness/eco/device/manager/EcoDeviceModelClient;", "Lms7;", "", "isRemoved", "", "destroy", "(Z)V", "Leu6;", "Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoLocalInfo;", "callback", "readLocalInfo", "(Leu6;)V", "connectDevice", "()V", "disconnectDevice", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoDeviceInfo;", "device", "initByModelDevice", "(Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoDeviceInfo;)V", "rebind", "onBindSuccess", "removeUserDevice", "Lcom/xiaomi/fitness/eco/device/manager/a;", "mRemote", "Lcom/xiaomi/fitness/eco/device/manager/a;", "did", "Ljava/lang/String;", "getDid", "setDid", "(Ljava/lang/String;)V", "value", "getDeviceStatus", "setDeviceStatus", "(I)V", "deviceStatus", "isDeviceConnected", "()Z", "getDeviceInfo", "()Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoDeviceInfo;", "setDeviceInfo", "deviceInfo", "isCurrent", "getAlias", "alias", "Lcom/xiaomi/fitness/device/manager/bean/Product;", "getProduct", "()Lcom/xiaomi/fitness/device/manager/bean/Product;", "product", "isConnectActive", "Lcom/xiaomi/fitness/eco/device/manager/remote/EcoDeviceModelRemote;", "getRemote", "()Lcom/xiaomi/fitness/eco/device/manager/remote/EcoDeviceModelRemote;", "remote", "isReAdded", "setReAdded", "<init>", "(Lcom/xiaomi/fitness/eco/device/manager/a;Ljava/lang/String;)V", "eco-device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class EcoDeviceModelClient implements ms7 {

    @NotNull
    private String did;

    @NotNull
    private final a mRemote;

    public EcoDeviceModelClient(@NotNull a mRemote, @NotNull String did) {
        Intrinsics.checkNotNullParameter(mRemote, "mRemote");
        Intrinsics.checkNotNullParameter(did, "did");
        this.mRemote = mRemote;
        this.did = did;
    }

    @Override // com.xiaomi.fitness.eco.device.model.api.EcoDeviceModelInternal
    public void connectDevice() {
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceModel
    public void destroy(boolean isRemoved) {
    }

    @Override // com.xiaomi.fitness.eco.device.model.api.EcoDeviceModelInternal
    public void disconnectDevice() throws RemoteException {
        this.mRemote.disconnectDevice(getDid());
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(EcoDeviceModelClient.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.xiaomi.fitness.eco.device.manager.EcoDeviceModelClient");
        return Intrinsics.areEqual(getDid(), ((EcoDeviceModelClient) other).getDid());
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

    @Override // com.xiaomi.fitness.eco.device.model.api.EcoDeviceModelInternal
    @NotNull
    public EcoDeviceModelRemote getRemote() {
        return new EcoDeviceModelRemote(getDid());
    }

    public int hashCode() {
        return getDid().hashCode();
    }

    @Override // com.xiaomi.fitness.eco.device.model.api.EcoDeviceModelInternal
    public void initByModelDevice(@NotNull EcoDeviceInfo device) {
        Intrinsics.checkNotNullParameter(device, "device");
    }

    @Override // com.xiaomi.eco.server.IEcoConnectActive
    /* JADX INFO: renamed from: isConnectActive */
    public boolean getIsConnectActive() {
        return this.mRemote.isConnectActive(getDid());
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceModel
    /* JADX INFO: renamed from: isCurrent */
    public boolean getIsCurrent() {
        return false;
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceModel
    /* JADX INFO: renamed from: isDeviceConnected */
    public boolean getIsDeviceConnected() {
        return this.mRemote.isConnected(getDid());
    }

    @Override // com.xiaomi.fitness.eco.device.model.api.EcoDeviceModelInternal
    public boolean isReAdded() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.xiaomi.fitness.eco.device.model.api.EcoDeviceModelInternal
    public void onBindSuccess(boolean rebind) {
    }

    @Override // com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel
    public void readLocalInfo(@Nullable final eu6<EcoLocalInfo> callback) {
        u7r u7rVar = new u7r();
        u7rVar.e = 2;
        u7rVar.f = 2;
        EcoDeviceSyncExtKt.getInstance(EcoDeviceContact.INSTANCE).call(getDid(), u7rVar, true, new OnEcoSyncCallback() { // from class: com.xiaomi.fitness.eco.device.manager.EcoDeviceModelClient.readLocalInfo.1
            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onError(String did, int type, int code) {
                eu6<EcoLocalInfo> eu6Var = callback;
                if (eu6Var != null) {
                    eu6Var.onError(code);
                }
            }

            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onSuccess(String did, int type, EcoSyncResult result) {
                u7r packet;
                uxo uxoVarU;
                two twoVarO;
                EcoDeviceModelExtKt.logi("read ble local info(" + did + "), and result is " + (result != null ? Boolean.valueOf(result.isSuccess()) : null));
                if (result == null || !result.isSuccess() || (packet = result.getPacket()) == null || (uxoVarU = packet.u()) == null || (twoVarO = uxoVarU.o()) == null) {
                    eu6<EcoLocalInfo> eu6Var = callback;
                    if (eu6Var != null) {
                        eu6Var.onError(result != null ? result.getCode() : -2);
                        return;
                    }
                    return;
                }
                eu6<EcoLocalInfo> eu6Var2 = callback;
                Intrinsics.checkNotNull(did);
                String model = twoVarO.f;
                Intrinsics.checkNotNullExpressionValue(model, "model");
                String str = twoVarO.d;
                String serialNumber = twoVarO.c;
                Intrinsics.checkNotNullExpressionValue(serialNumber, "serialNumber");
                EcoLocalInfo ecoLocalInfo = new EcoLocalInfo(did, model, str, serialNumber);
                if (eu6Var2 != null) {
                    eu6Var2.onResult(ecoLocalInfo);
                }
            }
        }, ErrorCode.ERROR_CODE_INVALID_PARAM);
    }

    @Override // com.xiaomi.fitness.eco.device.model.api.EcoDeviceModelInternal
    public void removeUserDevice() {
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

    @Override // com.xiaomi.fitness.eco.device.model.api.EcoDeviceModelInternal
    public void setReAdded(boolean z) {
    }

    @NotNull
    public String toString() {
        return "EcoDeviceModelClient(mRemote=" + this.mRemote + ", did='" + getDid() + "')";
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceModel
    @NotNull
    public EcoDeviceInfo getDeviceInfo() throws RemoteException {
        EcoDeviceInfo deviceInfo = this.mRemote.getDeviceInfo(getDid());
        return deviceInfo == null ? new EcoDeviceInfo() : deviceInfo;
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceModel
    public void setDeviceInfo(@NotNull EcoDeviceInfo value) throws RemoteException {
        Intrinsics.checkNotNullParameter(value, "value");
        this.mRemote.setDeviceInfo(value);
    }
}

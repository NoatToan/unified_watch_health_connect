package com.xiaomi.fitness.device.manager;

import android.os.RemoteException;
import com.miui.tsmclient.model.ErrorCode;
import com.xiaomi.fit.device.model.BaseDeviceModel;
import com.xiaomi.fitness.common.app.AppManager;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.bean.WatchInfo;
import com.xiaomi.fitness.device.manager.export.bean.WearableDeviceInfo;
import com.xiaomi.fitness.device.manager.remote.DeviceModelRemote;
import com.xiaomi.hm.health.bt.sdk.DeviceInfoExt;
import defpackage.eu6;
import defpackage.qa6;
import defpackage.s7r;
import defpackage.swo;
import defpackage.txo;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010-\u001a\u00020\t¢\u0006\u0004\bO\u0010PJ\u001f\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\b\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0007J\u000f\u0010\u0014\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0012J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u0018J\u001a\u0010\u001d\u001a\u00020\r2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\rH\u0016¢\u0006\u0004\b&\u0010\u0010J\u0017\u0010(\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\rH\u0016¢\u0006\u0004\b(\u0010\u0010J\u000f\u0010)\u001a\u00020\u0005H\u0016¢\u0006\u0004\b)\u0010\u0012R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\"\u0010-\u001a\u00020\t8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u0010 \"\u0004\b0\u0010\fR\"\u00101\u001a\u00020\r8V@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b1\u00103\"\u0004\b4\u0010\u0010R$\u00109\u001a\u00020\u00162\u0006\u00105\u001a\u00020\u00168V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b6\u0010\u0018\"\u0004\b7\u00108R$\u0010<\u001a\u00020\u00162\u0006\u00105\u001a\u00020\u00168V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b:\u0010\u0018\"\u0004\b;\u00108R\u0014\u0010=\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u00103R$\u0010A\u001a\u00020!2\u0006\u00105\u001a\u00020!8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b>\u0010?\"\u0004\b@\u0010$R\u0014\u0010%\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u00103R\u0016\u0010C\u001a\u0004\u0018\u00010\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010 R\u0014\u0010G\u001a\u00020D8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0014\u0010H\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u00103R\u0014\u0010L\u001a\u00020I8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010KR$\u0010M\u001a\u00020\r2\u0006\u00105\u001a\u00020\r8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bM\u00103\"\u0004\bN\u0010\u0010¨\u0006Q"}, d2 = {"Lcom/xiaomi/fitness/device/manager/DeviceModelClient;", "Lqa6;", "Leu6;", "Lcom/xiaomi/fitness/device/manager/export/bean/WatchInfo;", "callback", "", "readHuaMiWatchInfo", "(Leu6;)V", "readBleWatchInfo", "", "firmwareVersion", "setFirmwareVersion", "(Ljava/lang/String;)V", "", "isRemoved", "destroy", "(Z)V", "init", "()V", "readWatchInfo", "connectDevice", "disconnectDevice", "", "getDeviceCapability", "()I", "getDeviceCapabilityV2", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", "Lcom/xiaomi/fitness/device/manager/export/bean/WearableDeviceInfo;", "device", "update", "(Lcom/xiaomi/fitness/device/manager/export/bean/WearableDeviceInfo;)V", "isCurrent", "setCurrentStatus", "rebind", "onBindSuccess", "removeUserDevice", "Lcom/xiaomi/fitness/device/manager/c;", "mRemote", "Lcom/xiaomi/fitness/device/manager/c;", "did", "Ljava/lang/String;", "getDid", "setDid", "isAccessory", "Z", "()Z", "setAccessory", "value", "getDeviceStatus", "setDeviceStatus", "(I)V", "deviceStatus", "getAccessoryMode", "setAccessoryMode", "accessoryMode", "isDeviceConnected", "getDeviceInfo", "()Lcom/xiaomi/fitness/device/manager/export/bean/WearableDeviceInfo;", "setDeviceInfo", "deviceInfo", "getAlias", "alias", "Lcom/xiaomi/fitness/device/manager/bean/Product;", "getProduct", "()Lcom/xiaomi/fitness/device/manager/bean/Product;", "product", "isConnectActive", "Lcom/xiaomi/fitness/device/manager/remote/DeviceModelRemote;", "getRemote", "()Lcom/xiaomi/fitness/device/manager/remote/DeviceModelRemote;", "remote", "isReAdded", "setReAdded", "<init>", "(Lcom/xiaomi/fitness/device/manager/c;Ljava/lang/String;)V", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class DeviceModelClient implements qa6 {

    @NotNull
    private String did;
    private boolean isAccessory;

    @NotNull
    private final c mRemote;

    public DeviceModelClient(@NotNull c mRemote, @NotNull String did) {
        Intrinsics.checkNotNullParameter(mRemote, "mRemote");
        Intrinsics.checkNotNullParameter(did, "did");
        this.mRemote = mRemote;
        this.did = did;
    }

    private final void readBleWatchInfo(final eu6<WatchInfo> callback) {
        s7r s7rVar = new s7r();
        s7rVar.e = 2;
        s7rVar.f = 2;
        DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE).call(s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.device.manager.DeviceModelClient.readBleWatchInfo.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                eu6<WatchInfo> eu6Var = callback;
                if (eu6Var != null) {
                    eu6Var.onError(code);
                }
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) throws RemoteException {
                s7r packet;
                txo txoVarE;
                swo swoVarR;
                com.xiaomi.fit.device.extensions.DeviceModelExtKt.logi("read ble watch info(" + did + "), and result is " + (result != null ? Boolean.valueOf(result.isSuccess()) : null));
                if (result == null || !result.isSuccess() || (packet = result.getPacket()) == null || (txoVarE = packet.E()) == null || (swoVarR = txoVarE.r()) == null) {
                    eu6<WatchInfo> eu6Var = callback;
                    if (eu6Var != null) {
                        eu6Var.onError(result != null ? result.getCode() : -2);
                        return;
                    }
                    return;
                }
                DeviceModelClient deviceModelClient = this;
                eu6<WatchInfo> eu6Var2 = callback;
                Intrinsics.checkNotNull(did);
                String model = swoVarR.f;
                Intrinsics.checkNotNullExpressionValue(model, "model");
                String str = swoVarR.d;
                String serialNumber = swoVarR.c;
                Intrinsics.checkNotNullExpressionValue(serialNumber, "serialNumber");
                WatchInfo watchInfo = new WatchInfo(did, model, str, serialNumber);
                deviceModelClient.setFirmwareVersion(swoVarR.d);
                if (eu6Var2 != null) {
                    eu6Var2.onResult(watchInfo);
                }
            }
        }, ErrorCode.ERROR_CODE_INVALID_PARAM);
    }

    private final void readHuaMiWatchInfo(eu6<WatchInfo> callback) throws RemoteException {
        HuamiApiCaller huaMiApiCaller = com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getHuaMiApiCaller(DeviceModelExtKt.getMac(this));
        DeviceInfoExt deviceInfo = huaMiApiCaller != null ? huaMiApiCaller.getDeviceInfo() : null;
        if (deviceInfo == null) {
            if (callback != null) {
                callback.onResult(new WatchInfo(getDid(), DeviceModelExtKt.getModel(this), "", ""));
                return;
            }
            return;
        }
        String firmwareVersion = deviceInfo.getFirmwareVersion();
        if (firmwareVersion == null) {
            firmwareVersion = "";
        }
        String sn = deviceInfo.getSn();
        WatchInfo watchInfo = new WatchInfo(getDid(), DeviceModelExtKt.getModel(this), firmwareVersion, sn != null ? sn : "");
        setFirmwareVersion(firmwareVersion);
        if (callback != null) {
            callback.onResult(watchInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setFirmwareVersion(String firmwareVersion) throws RemoteException {
        if (firmwareVersion == null || firmwareVersion.length() == 0) {
            return;
        }
        WearableDeviceInfo deviceInfo = getDeviceInfo();
        deviceInfo.setFirmwareVersion(firmwareVersion);
        setDeviceInfo(deviceInfo);
    }

    @Override // com.xiaomi.fitness.device.model.api.DeviceModelInternal
    public void connectDevice() throws RemoteException {
        this.mRemote.connectDevice(true, AppManager.INSTANCE.getInstance().isAppForeground());
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceModel
    public void destroy(boolean isRemoved) {
    }

    @Override // com.xiaomi.fitness.device.model.api.DeviceModelInternal
    public void disconnectDevice() throws RemoteException {
        this.mRemote.disconnectDevice(getDid());
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(DeviceModelClient.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.xiaomi.fitness.device.manager.DeviceModelClient");
        return Intrinsics.areEqual(getDid(), ((DeviceModelClient) other).getDid());
    }

    @Override // com.xiaomi.fitness.device.model.api.DeviceModelInternal
    public int getAccessoryMode() {
        Integer num = AccessoryDevicePreference.INSTANCE.getACCESSORY_DEVICE().get(getDid());
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceModel
    @Nullable
    public String getAlias() {
        return getProduct().getAlias();
    }

    @Override // com.xiaomi.fitness.device.model.api.DeviceModelInternal
    public int getDeviceCapability() {
        return this.mRemote.getDeviceCapability(getDid());
    }

    @Override // com.xiaomi.fitness.device.model.api.DeviceModelInternal
    public int getDeviceCapabilityV2() {
        return this.mRemote.getDeviceCapabilityV2(getDid());
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

    @Override // com.xiaomi.fitness.device.model.api.DeviceModelInternal
    @NotNull
    public DeviceModelRemote getRemote() {
        return new DeviceModelRemote(getDid());
    }

    public int hashCode() {
        return getDid().hashCode();
    }

    @Override // com.xiaomi.fitness.device.model.api.DeviceModelInternal
    public void init() {
    }

    @Override // com.xiaomi.fitness.device.model.api.DeviceModelInternal
    public boolean isAccessory() {
        return getAccessoryMode() == 1;
    }

    @Override // com.xiaomi.fitness.device.manager.export.IConnectActive
    /* JADX INFO: renamed from: isConnectActive */
    public boolean getIsConnectActive() {
        return this.mRemote.isConnectActive(getDid());
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceModel
    /* JADX INFO: renamed from: isCurrent */
    public boolean getIsCurrent() {
        return this.mRemote.isCurrent(getDid());
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceModel
    /* JADX INFO: renamed from: isDeviceConnected */
    public boolean getIsDeviceConnected() {
        return this.mRemote.isConnected(getDid());
    }

    @Override // com.xiaomi.fitness.device.model.api.DeviceModelInternal
    /* JADX INFO: renamed from: isReAdded */
    public boolean getIsReAdded() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.xiaomi.fitness.device.model.api.DeviceModelInternal
    public void onBindSuccess(boolean rebind) {
    }

    @Override // com.xiaomi.fitness.device.manager.export.WearableDeviceModel
    public void readWatchInfo(@Nullable eu6<WatchInfo> callback) throws RemoteException {
        if (DeviceModelExtKt.isHuaMi(this)) {
            readHuaMiWatchInfo(callback);
        } else {
            readBleWatchInfo(callback);
        }
    }

    @Override // com.xiaomi.fitness.device.model.api.DeviceModelInternal
    public void removeUserDevice() {
    }

    @Override // com.xiaomi.fitness.device.model.api.DeviceModelInternal
    public void setAccessory(boolean z) {
        this.isAccessory = z;
    }

    @Override // com.xiaomi.fitness.device.model.api.DeviceModelInternal
    public void setAccessoryMode(int i) {
        AccessoryDevicePreference accessoryDevicePreference = AccessoryDevicePreference.INSTANCE;
        ConcurrentHashMap<String, Integer> accessory_device = accessoryDevicePreference.getACCESSORY_DEVICE();
        if (i == 1) {
            accessory_device.put(getDid(), Integer.valueOf(i));
        } else {
            accessory_device.remove(getDid());
        }
        accessoryDevicePreference.setACCESSORY_DEVICE(accessory_device);
        Logger.i(BaseDeviceModel.TAG, "accessoryDevice = " + accessory_device);
    }

    @Override // com.xiaomi.fitness.device.model.api.DeviceModelInternal
    public void setCurrentStatus(boolean isCurrent) {
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

    @Override // com.xiaomi.fitness.device.model.api.DeviceModelInternal
    public void setReAdded(boolean z) {
    }

    @NotNull
    public String toString() {
        return "DeviceModelClient(mRemote=" + this.mRemote + ", did='" + getDid() + "')";
    }

    @Override // com.xiaomi.fitness.device.model.api.DeviceModelInternal
    public void update(@NotNull WearableDeviceInfo device) {
        Intrinsics.checkNotNullParameter(device, "device");
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceModel
    @NotNull
    public WearableDeviceInfo getDeviceInfo() throws RemoteException {
        WearableDeviceInfo deviceInfo = this.mRemote.getDeviceInfo(getDid());
        return deviceInfo == null ? new WearableDeviceInfo() : deviceInfo;
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceModel
    public void setDeviceInfo(@NotNull WearableDeviceInfo value) throws RemoteException {
        Intrinsics.checkNotNullParameter(value, "value");
        this.mRemote.setDeviceInfo(value);
    }
}

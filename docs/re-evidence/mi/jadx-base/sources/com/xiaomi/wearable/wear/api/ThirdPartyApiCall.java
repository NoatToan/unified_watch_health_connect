package com.xiaomi.wearable.wear.api;

import com.xiaomi.accountsdk.account.data.DevInfoKeys;
import com.xiaomi.wearable.connection.Connection;
import com.xiaomi.wearable.connection.ConnectionCallback;
import com.xiaomi.wearable.connection.ConnectionFactoryKt;
import com.xiaomi.wearable.connection.ThirdPartyConnection;
import com.xiaomi.wearable.core.CapabilityCallback;
import com.xiaomi.wearable.core.CapabilityManager;
import com.xiaomi.wearable.core.CoreExtKt;
import com.xiaomi.wearable.core.DeviceInfo;
import com.xiaomi.wearable.transport.queue.ITaskQueue;
import com.xiaomi.wearable.transport.queue.Messenger;
import com.xiaomi.wearable.transport.queue.ThirdPartyTaskQueue;
import defpackage.s5f;
import defpackage.zd4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b1\u00102J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u000e\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0014¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\u0006¢\u0006\u0004\b$\u0010 J\r\u0010%\u001a\u00020\u0006¢\u0006\u0004\b%\u0010 J\u000f\u0010&\u001a\u00020\u000bH\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0004H\u0016¢\u0006\u0004\b(\u0010\nJ\u000f\u0010)\u001a\u00020\u0006H\u0016¢\u0006\u0004\b)\u0010 J\u000f\u0010*\u001a\u00020\u0006H\u0016¢\u0006\u0004\b*\u0010 J\u000f\u0010+\u001a\u00020\u0006H\u0016¢\u0006\u0004\b+\u0010 J\u0017\u0010-\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u0004H\u0016¢\u0006\u0004\b-\u0010\bR\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00063"}, d2 = {"Lcom/xiaomi/wearable/wear/api/ThirdPartyApiCall;", "Lcom/xiaomi/wearable/wear/api/WearApiCall;", "Lcom/xiaomi/wearable/connection/ThirdPartyConnection;", "Lcom/xiaomi/wearable/core/CapabilityCallback;", "", "deviceCapability", "", "setDeviceCapability", "(I)V", "getDeviceCapability", "()I", "", "fromBond", "Lzd4;", "callback", "internalConnect", "(ZLzd4;)V", "Lcom/xiaomi/wearable/core/DeviceInfo;", "deviceInfo", "onUpdate", "(Lcom/xiaomi/wearable/core/DeviceInfo;)V", "currentDevice", "setCurrent", "(Z)V", "type", "detailType", "", "path", "Ls5f;", "sendFile", "(IILjava/lang/String;Ls5f;)V", "connect", "()V", "Lcom/xiaomi/wearable/transport/queue/ITaskQueue;", "newTaskQueue", "()Lcom/xiaomi/wearable/transport/queue/ITaskQueue;", "onLinkConnected", "onLinkDisconnected", "getSpecificModel", "()Z", "getVersion", "removeBond", "disconnect", "destroy", DevInfoKeys.CAPABILITY, "onDeviceCapabilityChanged", "Lcom/xiaomi/wearable/wear/api/IDeviceApiCall;", "deviceApi", "Lcom/xiaomi/wearable/wear/api/IDeviceApiCall;", "<init>", "(Lcom/xiaomi/wearable/core/DeviceInfo;Lcom/xiaomi/wearable/wear/api/IDeviceApiCall;)V", "miwear-core_release"}, k = 1, mv = {2, 0, 0})
public final class ThirdPartyApiCall extends WearApiCall<ThirdPartyConnection> implements CapabilityCallback {

    @NotNull
    private final IDeviceApiCall deviceApi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThirdPartyApiCall(@NotNull DeviceInfo deviceInfo, @NotNull IDeviceApiCall deviceApi) {
        super(deviceInfo);
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        Intrinsics.checkNotNullParameter(deviceApi, "deviceApi");
        this.deviceApi = deviceApi;
        this.mConnection = ConnectionFactoryKt.createThirdPartyConnection(deviceInfo, this, deviceApi);
        deviceApi.getConnection().setCallback((ConnectionCallback) this.mConnection);
        deviceApi.setDeviceCapabilityCallback(this);
    }

    @Override // com.xiaomi.wearable.wear.api.IWearApiCall
    public void connect() {
        ((ThirdPartyConnection) this.mConnection).connect(true, false, 1);
    }

    @Override // com.xiaomi.wearable.wear.api.WearApiCall, com.xiaomi.wearable.wear.api.IWearApiCall
    public void destroy() {
        super.destroy();
        this.deviceApi.destroy();
    }

    @Override // com.xiaomi.wearable.wear.api.IWearApiCall
    public void disconnect() {
        Connection.DefaultImpls.disconnect$default(this.mConnection, false, 1, null);
    }

    @Override // com.xiaomi.wearable.wear.api.WearApiCall
    public int getDeviceCapability() {
        int deviceCapability = this.deviceApi.getDeviceCapability();
        String did = this.mDeviceInfo.getDid();
        if (did == null) {
            did = "";
        }
        if (deviceCapability == 0) {
            deviceCapability = CapabilityManager.INSTANCE.getDeviceCapabilities(did);
        }
        CoreExtKt.getLogger().i("WearApiCall", "getDeviceCapability() called " + deviceCapability);
        return deviceCapability;
    }

    @Override // com.xiaomi.wearable.wear.api.WearApiCall
    public boolean getSpecificModel() {
        return this.deviceApi.getSpecificModel();
    }

    @Override // com.xiaomi.wearable.wear.api.WearApiCall
    public int getVersion() {
        return 0;
    }

    @Override // com.xiaomi.wearable.wear.api.WearApiCall
    public void internalConnect(boolean fromBond, @NotNull zd4 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        CoreExtKt.getLogger().i("WearApiCall", "internalConnect() called with: callback = " + callback);
    }

    @Override // com.xiaomi.wearable.wear.api.WearApiCall
    @NotNull
    public ITaskQueue newTaskQueue() {
        return new ThirdPartyTaskQueue(this, this.deviceApi);
    }

    @Override // com.xiaomi.wearable.core.CapabilityCallback
    public void onDeviceCapabilityChanged(int capability) {
        setDeviceCapability(capability);
    }

    public final void onLinkConnected() {
        onConnected();
    }

    public final void onLinkDisconnected() {
        onDisconnected();
    }

    @Override // com.xiaomi.wearable.wear.api.WearApiCall
    public void onUpdate(@NotNull DeviceInfo deviceInfo) {
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        super.onUpdate(deviceInfo);
        this.deviceApi.onUpdate(deviceInfo);
    }

    @Override // com.xiaomi.wearable.wear.api.IWearApiCall
    public void removeBond() {
    }

    public final void sendFile(int type, int detailType, @NotNull String path, @NotNull s5f callback) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(callback, "callback");
        CoreExtKt.getLogger().i("WearApiCall", "sendFile() called with: type = " + type + ", detailType = " + detailType + ", path = " + path + ", callback = " + callback + ", messenger = " + this.deviceApi.getMessenger());
        Messenger messenger = this.deviceApi.getMessenger();
        if (messenger != null) {
            messenger.sendFile(type, detailType, path, callback);
        }
    }

    @Override // com.xiaomi.wearable.wear.api.WearApiCall, com.xiaomi.wearable.wear.api.IWearApiCall
    public void setCurrent(boolean currentDevice) {
        super.setCurrent(currentDevice);
        this.deviceApi.setCurrentDevice(currentDevice);
    }

    @Override // com.xiaomi.wearable.wear.api.WearApiCall
    public void setDeviceCapability(int deviceCapability) {
        CoreExtKt.getLogger().i("WearApiCall", "setDeviceCapability() called with: deviceCapability = " + deviceCapability);
        super.setDeviceCapability(deviceCapability);
        this.deviceApi.setDeviceCapability(deviceCapability);
        String did = this.mDeviceInfo.getDid();
        if (did != null) {
            CapabilityManager.INSTANCE.setDeviceCapabilities(did, deviceCapability);
        }
    }
}

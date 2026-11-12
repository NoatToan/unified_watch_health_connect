package com.xiaomi.wearable.connection;

import android.os.Handler;
import android.os.Looper;
import com.xiaomi.wearable.core.CoreExtKt;
import com.xiaomi.wearable.core.DeviceInfo;
import com.xiaomi.wearable.wear.api.IDeviceApiCall;
import com.xiaomi.wearable.wear.api.ThirdPartyApiCall;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0010H\u0016J\b\u0010\u0015\u001a\u00020\u0010H\u0016J\b\u0010\u0016\u001a\u00020\u0010H\u0016J\u0018\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0018\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001d\u001a\u00020\u0013H\u0016J\b\u0010\u001e\u001a\u00020\u0013H\u0016J\u0010\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010 \u001a\u00020\u0010H\u0016J\b\u0010!\u001a\u00020\u0010H\u0016J\b\u0010\"\u001a\u00020\u0013H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006#"}, d2 = {"Lcom/xiaomi/wearable/connection/ThirdPartyConnection;", "Lcom/xiaomi/wearable/connection/RealConnection;", "Lcom/xiaomi/wearable/connection/ConnectionCallback;", "deviceInfo", "Lcom/xiaomi/wearable/core/DeviceInfo;", "call", "Lcom/xiaomi/wearable/wear/api/ThirdPartyApiCall;", "deviceApi", "Lcom/xiaomi/wearable/wear/api/IDeviceApiCall;", "<init>", "(Lcom/xiaomi/wearable/core/DeviceInfo;Lcom/xiaomi/wearable/wear/api/ThirdPartyApiCall;Lcom/xiaomi/wearable/wear/api/IDeviceApiCall;)V", "getCall", "()Lcom/xiaomi/wearable/wear/api/ThirdPartyApiCall;", "getDeviceApi", "()Lcom/xiaomi/wearable/wear/api/IDeviceApiCall;", "connect", "", "disconnect", "reconnectMonitor", "", "onLinkConnected", "onLinkDisconnected", "onConnectSuccess", "onDisconnect", "status", "", "message", "", "onConnectFailure", "isConnect", "needKeepAlive", "needRetryConnect", "onBluetoothOpen", "onBluetoothClose", "isWearDevice", "miwear-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ThirdPartyConnection extends RealConnection implements ConnectionCallback {

    @NotNull
    private final ThirdPartyApiCall call;

    @NotNull
    private final IDeviceApiCall deviceApi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThirdPartyConnection(@NotNull DeviceInfo deviceInfo, @NotNull ThirdPartyApiCall call, @NotNull IDeviceApiCall deviceApi) {
        super(deviceInfo, call);
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(deviceApi, "deviceApi");
        this.call = call;
        this.deviceApi = deviceApi;
        setWorkHandler(new Handler(Looper.getMainLooper()));
    }

    @Override // com.xiaomi.wearable.connection.Connection
    public void connect() {
        CoreExtKt.getLogger().i(getTAG(), "connect() called");
        this.deviceApi.getConnection().setCallback(this);
        this.deviceApi.getConnection().connect();
    }

    @Override // com.xiaomi.wearable.connection.RealConnection, com.xiaomi.wearable.connection.Connection
    public void disconnect(boolean reconnectMonitor) {
        super.disconnect(reconnectMonitor);
        Connection.DefaultImpls.disconnect$default(this.deviceApi.getConnection(), false, 1, null);
    }

    @NotNull
    public final ThirdPartyApiCall getCall() {
        return this.call;
    }

    @NotNull
    public final IDeviceApiCall getDeviceApi() {
        return this.deviceApi;
    }

    @Override // com.xiaomi.wearable.connection.Connection
    public boolean isConnect() {
        return this.deviceApi.getConnection().isConnect();
    }

    @Override // com.xiaomi.wearable.connection.RealConnection
    public boolean isWearDevice() {
        return false;
    }

    @Override // com.xiaomi.wearable.connection.RealConnection, com.xiaomi.wearable.connection.Connection
    public boolean needKeepAlive() {
        return super.needKeepAlive() && this.deviceApi.getConnection().needKeepAlive();
    }

    @Override // com.xiaomi.wearable.connection.RealConnection, com.xiaomi.wearable.connection.Connection
    public boolean needRetryConnect(int status) {
        return this.deviceApi.getConnection().needRetryConnect(status);
    }

    @Override // com.xiaomi.wearable.connection.RealConnection, com.xiaomi.wearable.connection.Connection
    public void onBluetoothClose() {
        super.onBluetoothClose();
        this.deviceApi.getConnection().onBluetoothClose();
    }

    @Override // com.xiaomi.wearable.connection.RealConnection, com.xiaomi.wearable.connection.Connection
    public void onBluetoothOpen() {
        if (needKeepAlive()) {
            connect(true, false, 4);
        }
    }

    @Override // com.xiaomi.wearable.connection.RealConnection
    public void onConnectFailure(int status, @NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        super.onConnectFailure(status, message);
    }

    @Override // com.xiaomi.wearable.connection.RealConnection
    public void onConnectSuccess() {
        super.onConnectSuccess();
    }

    @Override // com.xiaomi.wearable.connection.RealConnection
    public void onDisconnect(int status, @NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        super.onDisconnect(status, message);
    }

    @Override // com.xiaomi.wearable.connection.ConnectionCallback
    public void onLinkConnected() {
        CoreExtKt.getLogger().i(getTAG(), "onLinkConnected() called");
        this.call.onLinkConnected();
    }

    @Override // com.xiaomi.wearable.connection.ConnectionCallback
    public void onLinkDisconnected() {
        CoreExtKt.getLogger().i(getTAG(), "onLinkDisconnected() called");
        this.call.onLinkDisconnected();
    }
}

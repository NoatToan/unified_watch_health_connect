package com.xiaomi.wearable.connection;

import android.os.Handler;
import android.os.Looper;
import com.mibi.sdk.common.CommonConstants;
import com.xiaomi.miot.core.bluetooth.BluetoothManager;
import com.xiaomi.wearable.connection.BleConnection;
import com.xiaomi.wearable.core.CoreExtKt;
import com.xiaomi.wearable.core.DeviceInfo;
import com.xiaomi.wearable.utils.ByteUtil;
import com.xiaomi.wearable.wear.api.WearApiCall;
import defpackage.b23;
import defpackage.ht2;
import defpackage.lq2;
import defpackage.me4;
import defpackage.z6r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010<\u001a\u00020;\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b=\u0010>J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\tJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u000bJ!\u0010\u0013\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\tJ\u0019\u0010\u0016\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001e\u0010\u001aR\u0017\u0010 \u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R$\u0010$\u001a\u0004\u0018\u00010\u00058F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010\u0017R\"\u0010\r\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00101\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0013\u00104\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b3\u0010'R\u0013\u00106\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b5\u0010'R\u0011\u0010:\u001a\u0002078F¢\u0006\u0006\u001a\u0004\b8\u00109¨\u0006?"}, d2 = {"Lcom/xiaomi/wearable/connection/BleConnection;", "Lcom/xiaomi/wearable/connection/RealConnection;", "Lb23;", "", "reason", "", "desc", "", "disconnectInternal", "(ILjava/lang/String;)V", "connect", "()V", "onConnectSuccess", "status", "message", "onConnectFailure", "onBluetoothClose", "mac", "connectState", "onConnectStateChanged", "(Ljava/lang/String;I)V", "onDisconnect", "onServiceDiscovered", "(Ljava/lang/String;)V", "", "isConnect", "()Z", "reconnectMonitor", "disconnect", "(Z)V", "isAppActive", "Llq2;", "bleApiCall", "Llq2;", "getBleApiCall", "()Llq2;", "userId", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "setUserId", "I", "getStatus", "()I", "setStatus", "(I)V", "Ljava/lang/Runnable;", "discoverServiceTimeoutRunnable", "Ljava/lang/Runnable;", "lastStateConnected", "Z", "getAppDeviceId", "appDeviceId", "getOob", "oob", "", "getToken", "()[B", "token", "Lcom/xiaomi/wearable/core/DeviceInfo;", "deviceInfo", "<init>", "(Lcom/xiaomi/wearable/core/DeviceInfo;Llq2;)V", "miwear-core_release"}, k = 1, mv = {2, 0, 0})
public final class BleConnection extends RealConnection implements b23 {

    @NotNull
    private final lq2 bleApiCall;

    @NotNull
    private final Runnable discoverServiceTimeoutRunnable;
    private boolean lastStateConnected;
    private volatile int status;

    @Nullable
    private String userId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BleConnection(@NotNull DeviceInfo deviceInfo, @NotNull lq2 bleApiCall) {
        super(deviceInfo, bleApiCall);
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        Intrinsics.checkNotNullParameter(bleApiCall, "bleApiCall");
        this.bleApiCall = bleApiCall;
        this.status = 1003;
        setWorkHandler(new Handler(Looper.getMainLooper()));
        CoreExtKt.getLogger().i(getTAG(), "BleConnection: bindType = " + deviceInfo.isLocalBindMode());
        if (deviceInfo.isLocalBindMode()) {
            BluetoothManager.Companion companion = BluetoothManager.INSTANCE;
            companion.get().addConnectStatusListener(deviceInfo.getAddress(), this);
            companion.get().addBluetoothStateListener(this);
        }
        this.discoverServiceTimeoutRunnable = new Runnable() { // from class: rq2
            @Override // java.lang.Runnable
            public final void run() {
                BleConnection.discoverServiceTimeoutRunnable$lambda$0(this.f32784a);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void connect$lambda$1(BleConnection this$0, int i, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CoreExtKt.getLogger().i(this$0.getTAG(), "WearAuthWrapper() called with: status = " + i + ", message = " + str + ", mac = " + this$0.getDeviceInfo().getAddress());
        this$0.status = i;
        this$0.getWorkHandler().removeCallbacks(this$0.discoverServiceTimeoutRunnable);
        if (i != -10) {
            if (i == 2001) {
                this$0.lastStateConnected = true;
            } else {
                if (i == 2004) {
                    this$0.onConnectSuccess();
                    return;
                }
                if (str == null) {
                    str = "";
                }
                this$0.onConnectFailure(i, str);
            }
        }
    }

    private final void disconnectInternal(int reason, String desc) {
        getWorkHandler().removeCallbacks(this.discoverServiceTimeoutRunnable);
        BluetoothManager.INSTANCE.get().removeConnectStatusListener(getDeviceInfo().getAddress(), this);
        this.status = 2000;
        this.lastStateConnected = false;
        onDisconnect(reason, desc);
        getApiCall().onDisconnected();
        this.bleApiCall.h().b(new ht2<Void>() { // from class: com.xiaomi.wearable.connection.BleConnection.disconnectInternal.1
            @Override // defpackage.ht2
            public void onFailed(int status) {
                CoreExtKt.getLogger().i(BleConnection.this.getTAG(), "onFailed: ble disconnect fail");
            }

            @Override // defpackage.ht2
            public void onResponse(Void data) {
                CoreExtKt.getLogger().i(BleConnection.this.getTAG(), "onResponse: ble disconnect success");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void discoverServiceTimeoutRunnable$lambda$0(BleConnection this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CoreExtKt.getLogger().i(this$0.getTAG(), "discoverServiceTimeoutRunnable: ");
        if (this$0.getIsConnecting()) {
            this$0.disconnectInternal(2016, "discover service timeout");
            this$0.bleApiCall.k();
        }
    }

    @Override // com.xiaomi.wearable.connection.Connection
    public void connect() {
        BluetoothManager.INSTANCE.get().addConnectStatusListener(getDeviceInfo().getAddress(), this);
        if (getUserId() == null) {
            onConnectFailure(108, "userId==null");
            return;
        }
        if (getDeviceInfo().getToken() == null) {
            onConnectFailure(108, "token==null");
            return;
        }
        if (getDeviceInfo().isLocalBindMode() && getAppDeviceId() == null) {
            onConnectFailure(108, "appDeviceId = " + getAppDeviceId() + " , oob = " + getOob());
            CoreExtKt.getLogger().i(getTAG(), "realConnect: returned v2 local bind , param error");
            return;
        }
        String userId = getUserId();
        Intrinsics.checkNotNull(userId);
        byte[] token = getToken();
        String appDeviceId = getAppDeviceId();
        String oob = getOob();
        boolean requestBond = getDeviceInfo().getRequestBond();
        WearApiCall<?> apiCall = getApiCall();
        Intrinsics.checkNotNull(apiCall, "null cannot be cast to non-null type com.xiaomi.wearable.wear.api.BleApiCall");
        new z6r(userId, token, appDeviceId, oob, requestBond, (lq2) apiCall, getMFrom()).c(new me4() { // from class: qq2
            @Override // defpackage.me4
            public final void b(int i, String str) {
                BleConnection.connect$lambda$1(this.f31735a, i, str);
            }
        });
    }

    @Override // com.xiaomi.wearable.connection.RealConnection, com.xiaomi.wearable.connection.Connection
    public void disconnect(boolean reconnectMonitor) {
        super.disconnect(reconnectMonitor);
        disconnectInternal(CommonConstants.Mgc.PRIVATE_KEY_NOT_EXIST, "active disconnect or switch disconnect");
        this.bleApiCall.d = false;
    }

    @Nullable
    public final String getAppDeviceId() {
        return getDeviceInfo().getAppDeviceId();
    }

    @NotNull
    public final lq2 getBleApiCall() {
        return this.bleApiCall;
    }

    @Nullable
    public final String getOob() {
        return getDeviceInfo().getOob();
    }

    public final int getStatus() {
        return this.status;
    }

    @NotNull
    public final byte[] getToken() {
        String token = getDeviceInfo().getToken();
        if (token == null) {
            token = "";
        }
        return ByteUtil.stringToBytes(token);
    }

    @Nullable
    public final String getUserId() {
        return getDeviceInfo().getUserId();
    }

    @Override // com.xiaomi.wearable.connection.RealConnection
    public boolean isAppActive() {
        CoreExtKt.getLogger().i(getTAG(), "BleConnection isAppAbandon: bindType = " + getDeviceInfo().isLocalBindMode());
        if (getDeviceInfo().isLocalBindMode()) {
            return true;
        }
        return super.isAppActive();
    }

    @Override // com.xiaomi.wearable.connection.Connection
    public boolean isConnect() {
        return this.status == 2004;
    }

    @Override // com.xiaomi.wearable.connection.RealConnection, com.xiaomi.wearable.connection.Connection
    public void onBluetoothClose() {
        super.onBluetoothClose();
        this.status = 2000;
    }

    @Override // com.xiaomi.wearable.connection.RealConnection
    public void onConnectFailure(int status, @NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        super.onConnectFailure(status, message);
        this.bleApiCall.d = false;
    }

    @Override // defpackage.b23
    public void onConnectStateChanged(@Nullable String mac, int connectState) {
        if (!Intrinsics.areEqual(getDeviceInfo().getAddress(), mac)) {
            CoreExtKt.getLogger().i(getTAG(), "onConnectStateChanged: coreId = " + getDeviceInfo().getAddress() + " , mac = " + mac);
            return;
        }
        CoreExtKt.getLogger().i(getTAG(), "onConnectStateChanged() called with: mac = " + mac + ", connectState = " + connectState + ", lastStatus = " + this.lastStateConnected);
        getWorkHandler().removeCallbacks(this.discoverServiceTimeoutRunnable);
        if (2 == connectState && !this.lastStateConnected) {
            CoreExtKt.getLogger().i(getTAG(), "onConnectStateChanged: onConnected");
            this.lastStateConnected = true;
            getWorkHandler().postDelayed(this.discoverServiceTimeoutRunnable, 20000L);
        } else {
            if (connectState != 0 || !this.lastStateConnected) {
                CoreExtKt.getLogger().i(getTAG(), "onConnectStateChanged: not handle");
                return;
            }
            CoreExtKt.getLogger().i(getTAG(), "onConnectStateChanged: onDisconnected");
            this.lastStateConnected = false;
            this.status = 2000;
            onDisconnect(connectState, "ble disconnected");
        }
    }

    @Override // com.xiaomi.wearable.connection.RealConnection
    public void onConnectSuccess() {
        super.onConnectSuccess();
        this.bleApiCall.d = true;
    }

    @Override // com.xiaomi.wearable.connection.RealConnection
    public void onDisconnect(int status, @NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        super.onDisconnect(status, message);
        this.bleApiCall.d = false;
    }

    @Override // defpackage.b23
    public void onServiceDiscovered(@Nullable String mac) {
        getWorkHandler().removeCallbacks(this.discoverServiceTimeoutRunnable);
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    public final void setUserId(@Nullable String str) {
        this.userId = str;
    }
}

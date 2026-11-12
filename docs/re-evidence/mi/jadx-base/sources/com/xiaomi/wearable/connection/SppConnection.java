package com.xiaomi.wearable.connection;

import android.os.Handler;
import android.os.Looper;
import com.mibi.sdk.common.CommonConstants;
import com.xiaomi.wearable.connection.SppConnection;
import com.xiaomi.wearable.core.CoreExtKt;
import com.xiaomi.wearable.core.DeviceInfo;
import com.xiaomi.wearable.utils.ByteUtil;
import com.xiaomi.wearable.wear.api.WearApiCall;
import defpackage.h7o;
import defpackage.me4;
import defpackage.x6o;
import defpackage.y6o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b/\u00100J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0005J\u0017\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u000fR\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\u001e\u001a\u0004\u0018\u00010\u001d8F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010%\u001a\u0004\u0018\u00010$8F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0013\u0010,\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0006\u001a\u0004\b+\u0010!¨\u00061"}, d2 = {"Lcom/xiaomi/wearable/connection/SppConnection;", "Lcom/xiaomi/wearable/connection/RealConnection;", "Lh7o;", "", "connect", "()V", "", "isConnect", "()Z", "", "status", "needRetryConnect", "(I)Z", "connected", "onConnectStatusChanged", "(Z)V", "onBluetoothClose", "reconnectMonitor", "disconnect", "Lx6o;", "sppApiCall", "Lx6o;", "getSppApiCall", "()Lx6o;", "I", "getStatus", "()I", "setStatus", "(I)V", "", "userId", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "setUserId", "(Ljava/lang/String;)V", "", "token", "[B", "getToken", "()[B", "setToken", "([B)V", "getAppDeviceId", "appDeviceId", "Lcom/xiaomi/wearable/core/DeviceInfo;", "deviceInfo", "<init>", "(Lcom/xiaomi/wearable/core/DeviceInfo;Lx6o;)V", "miwear-core_release"}, k = 1, mv = {2, 0, 0})
public final class SppConnection extends RealConnection implements h7o {

    @NotNull
    private final x6o sppApiCall;
    private int status;

    @Nullable
    private byte[] token;

    @Nullable
    private String userId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SppConnection(@NotNull DeviceInfo deviceInfo, @NotNull x6o sppApiCall) {
        super(deviceInfo, sppApiCall);
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        Intrinsics.checkNotNullParameter(sppApiCall, "sppApiCall");
        this.sppApiCall = sppApiCall;
        this.status = 1003;
        setWorkHandler(new Handler(Looper.getMainLooper()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void connect$lambda$0(SppConnection this$0, int i, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CoreExtKt.getLogger().i(this$0.getTAG(), "SppAuthWrapper() called with: status = " + i + ", message = " + str);
        this$0.status = i;
        if (i != 2001) {
            if (i == 2004) {
                this$0.onConnectSuccess();
                return;
            }
            if (i != 2014) {
                if (str == null) {
                    str = "";
                }
                this$0.onConnectFailure(i, str);
            } else {
                if (str == null) {
                    str = "";
                }
                this$0.onConnectFailure(i, str);
            }
        }
    }

    @Override // com.xiaomi.wearable.connection.Connection
    public void connect() {
        if (getUserId() == null) {
            onConnectFailure(108, "userId==null");
            return;
        }
        if (getToken() == null) {
            onConnectFailure(108, "token==null");
            return;
        }
        ACLReceiver.INSTANCE.addReceiver(getDeviceInfo().getAddress(), this);
        this.sppApiCall.d().registerStatusChangeListener(this);
        String userId = getUserId();
        Intrinsics.checkNotNull(userId);
        byte[] token = getToken();
        Intrinsics.checkNotNull(token);
        WearApiCall<?> apiCall = getApiCall();
        Intrinsics.checkNotNull(apiCall, "null cannot be cast to non-null type com.xiaomi.wearable.wear.api.SppApiCall");
        new y6o(userId, token, (x6o) apiCall, getMFrom() != 3 ? 1 : 3, getMFrom(), getAppDeviceId()).c(new me4() { // from class: i7o
            @Override // defpackage.me4
            public final void b(int i, String str) {
                SppConnection.connect$lambda$0(this.f20866a, i, str);
            }
        });
    }

    @Override // com.xiaomi.wearable.connection.RealConnection, com.xiaomi.wearable.connection.Connection
    public void disconnect(boolean reconnectMonitor) {
        super.disconnect(reconnectMonitor);
        this.sppApiCall.d().removeStatusChangeListener(this);
        this.sppApiCall.d().disconnect();
        this.status = 2000;
        onDisconnect(CommonConstants.Mgc.PRIVATE_KEY_NOT_EXIST, "active disconnect or switch device");
    }

    @Nullable
    public final String getAppDeviceId() {
        return getDeviceInfo().getAppDeviceId();
    }

    @NotNull
    public final x6o getSppApiCall() {
        return this.sppApiCall;
    }

    public final int getStatus() {
        return this.status;
    }

    @Nullable
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

    @Override // com.xiaomi.wearable.connection.Connection
    public boolean isConnect() {
        return this.status == 2004;
    }

    @Override // com.xiaomi.wearable.connection.RealConnection, com.xiaomi.wearable.connection.Connection
    public boolean needRetryConnect(int status) {
        if (status == 2011) {
            return ConnectSource.INSTANCE.isForeground();
        }
        boolean zNeedRetryConnect = super.needRetryConnect(status);
        CoreExtKt.getLogger().i(getTAG(), "needRetryConnect: " + status + " " + zNeedRetryConnect);
        return zNeedRetryConnect;
    }

    @Override // com.xiaomi.wearable.connection.RealConnection, com.xiaomi.wearable.connection.Connection
    public void onBluetoothClose() {
        super.onBluetoothClose();
        CoreExtKt.getLogger().i(getTAG(), "onBluetoothClose: ");
        if (CoreExtKt.isPlayChannel() || !com.xiaomi.wearable.CoreExtKt.isBluetoothEnabled()) {
            disconnect(true);
        }
    }

    @Override // defpackage.h7o
    public void onConnectStatusChanged(boolean connected) {
        CoreExtKt.getLogger().i(getTAG(), "onConnectStatusChanged() called with: connected = " + connected + " , currentConnected = " + isConnect());
        if (!isConnect() && connected) {
            CoreExtKt.getLogger().i(getTAG(), "onConnectStatusChanged: onConnected");
            return;
        }
        if (!isConnect() || connected) {
            CoreExtKt.getLogger().i(getTAG(), "onConnectStatusChanged: not handle");
            return;
        }
        CoreExtKt.getLogger().i(getTAG(), "onConnectStatusChanged: onDisconnected");
        this.status = 2000;
        onDisconnect(2000, "spp disconnected");
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    public final void setToken(@Nullable byte[] bArr) {
        this.token = bArr;
    }

    public final void setUserId(@Nullable String str) {
        this.userId = str;
    }
}

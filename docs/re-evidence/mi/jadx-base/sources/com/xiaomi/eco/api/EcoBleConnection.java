package com.xiaomi.eco.api;

import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import com.mibi.sdk.common.CommonConstants;
import com.xiaomi.eco.api.EcoBleConnection;
import com.xiaomi.eco.connection.BroadcastsKt;
import com.xiaomi.eco.connection.EcoRealConnection;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.miot.core.bluetooth.BluetoothManager;
import defpackage.b23;
import defpackage.eu7;
import defpackage.ht2;
import defpackage.jpc;
import defpackage.qd7;
import defpackage.qj7;
import defpackage.s33;
import defpackage.wd7;
import defpackage.x82;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0012\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002BK\u0012\u0006\u0010\u0016\u001a\u00020\u000b\u0012\b\u0010I\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010J\u001a\u00020\u0011\u0012\b\b\u0002\u0010 \u001a\u00020\t\u0012\u0006\u0010L\u001a\u00020K\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010M\u001a\u00020\u000b\u0012\u0006\u0010N\u001a\u00020\t¢\u0006\u0004\bO\u0010PJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\b\u0010\u0005J\u001f\u0010\r\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u000f\u0010\u0005J\u000f\u0010\u0010\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0010\u0010\u0005J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0018\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0017\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001a\u0010\u000eJ\u0019\u0010\u001b\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001d\u0010\u0013J\u000f\u0010\u001e\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001e\u0010\u0005J\u000f\u0010\u001f\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001f\u0010\u0013R\u0017\u0010 \u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R$\u0010'\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010\u001cR$\u0010,\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010(\u001a\u0004\b-\u0010*\"\u0004\b.\u0010\u001cR$\u0010/\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010(\u001a\u0004\b0\u0010*\"\u0004\b1\u0010\u001cR$\u00103\u001a\u0004\u0018\u0001028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u00109\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010\u0013\"\u0004\b<\u0010=R\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010!\u001a\u0004\b>\u0010#\"\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010D\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010CR\u0014\u0010E\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010CR\"\u0010F\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010:\u001a\u0004\bG\u0010\u0013\"\u0004\bH\u0010=¨\u0006Q"}, d2 = {"Lcom/xiaomi/eco/api/EcoBleConnection;", "Lcom/xiaomi/eco/connection/EcoRealConnection;", "Lb23;", "", "startFakeConnect", "()V", "stopFakeConnect", "realConnect", "onConnectSuccess", "", "status", "", "message", "onConnectFailure", "(ILjava/lang/String;)V", "onBluetoothOpen", "onBluetoothClose", "", "needKeepAlive", "()Z", "needRetryConnect", "(I)Z", "mac", "connectState", "onConnectStateChanged", "(Ljava/lang/String;I)V", "onDisconnect", "onServiceDiscovered", "(Ljava/lang/String;)V", "isConnect", "disconnect", "isAppAbandon", "bindType", "I", "getBindType", "()I", "Ljpc;", "bleManager", "Ljpc;", "userId", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "setUserId", "appDeviceId", "getAppDeviceId", "setAppDeviceId", "oob", "getOob", "setOob", "", "token", "[B", "getToken", "()[B", "setToken", "([B)V", "localSportMachineHasRetry", "Z", "getLocalSportMachineHasRetry", "setLocalSportMachineHasRetry", "(Z)V", "getStatus", "setStatus", "(I)V", "Ljava/lang/Runnable;", "mConnectTimeoutRunnable", "Ljava/lang/Runnable;", "mFakeConnectDelayRunnable", "discoverServiceTimeoutRunnable", "lastStateConnected", "getLastStateConnected", "setLastStateConnected", "did", "isDeviceOwner", "Lcom/xiaomi/eco/api/i;", "apiCall", "model", "deviceType", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZILcom/xiaomi/eco/api/i;Ljpc;Ljava/lang/String;I)V", "eco-common-connect_release"}, k = 1, mv = {2, 0, 0})
public final class EcoBleConnection extends EcoRealConnection implements b23 {

    @Nullable
    private String appDeviceId;
    private final int bindType;

    @NotNull
    private final jpc bleManager;

    @NotNull
    private final Runnable discoverServiceTimeoutRunnable;
    private boolean lastStateConnected;
    private boolean localSportMachineHasRetry;

    @NotNull
    private final Runnable mConnectTimeoutRunnable;

    @NotNull
    private final Runnable mFakeConnectDelayRunnable;

    @Nullable
    private String oob;
    private volatile int status;

    @Nullable
    private byte[] token;

    @Nullable
    private String userId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EcoBleConnection(@NotNull final String mac, @Nullable final String str, boolean z, int i, @NotNull final i apiCall, @NotNull jpc bleManager, @NotNull String model, int i2) {
        super(mac, str, z, apiCall, model, i2);
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(apiCall, "apiCall");
        Intrinsics.checkNotNullParameter(bleManager, "bleManager");
        Intrinsics.checkNotNullParameter(model, "model");
        this.bindType = i;
        this.bleManager = bleManager;
        this.status = 1003;
        setWorkHandler(new Handler(Looper.getMainLooper()));
        Logger.i(getTAG(), "BleConnection: bindType = " + i);
        if (i == 1) {
            BluetoothManager.Companion companion = BluetoothManager.INSTANCE;
            companion.get().addConnectStatusListener(mac, this);
            companion.get().addBluetoothStateListener(this);
        }
        this.mConnectTimeoutRunnable = new Runnable() { // from class: oi7
            @Override // java.lang.Runnable
            public final void run() throws RemoteException {
                EcoBleConnection.mConnectTimeoutRunnable$lambda$0(this.f29193a);
            }
        };
        this.mFakeConnectDelayRunnable = new Runnable() { // from class: pi7
            @Override // java.lang.Runnable
            public final void run() {
                EcoBleConnection.mFakeConnectDelayRunnable$lambda$1(this.f30408a, str, mac, apiCall);
            }
        };
        this.discoverServiceTimeoutRunnable = new Runnable() { // from class: qi7
            @Override // java.lang.Runnable
            public final void run() throws RemoteException {
                EcoBleConnection.discoverServiceTimeoutRunnable$lambda$2(this.f31540a, str, mac, apiCall);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void discoverServiceTimeoutRunnable$lambda$2(EcoBleConnection this$0, String str, String mac, i apiCall) throws RemoteException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(mac, "$mac");
        Intrinsics.checkNotNullParameter(apiCall, "$apiCall");
        Logger.i(this$0.getTAG(), "discoverServiceTimeoutRunnable: ");
        if (this$0.getIsConnecting()) {
            BroadcastsKt.broadcastDisconnect(str, mac, 2000, "discover service timeout", apiCall.isCurrent());
            apiCall.resetBleManager();
            if (apiCall.isCurrent()) {
                this$0.onConnectFailure(2002, "discover service timeout");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mConnectTimeoutRunnable$lambda$0(EcoBleConnection this$0) throws RemoteException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.bleManager.isConnected()) {
            return;
        }
        this$0.onConnectFailure(2002, "connect proxy connect timeout");
        this$0.getWorkHandler().postDelayed(this$0.mFakeConnectDelayRunnable, 3000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mFakeConnectDelayRunnable$lambda$1(EcoBleConnection this$0, String str, String mac, i apiCall) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(mac, "$mac");
        Intrinsics.checkNotNullParameter(apiCall, "$apiCall");
        jpc jpcVar = this$0.bleManager;
        Intrinsics.checkNotNull(jpcVar, "null cannot be cast to non-null type com.xiaomi.miot.core.bluetooth.ble.manager.BaseMIUIBleManager");
        x82 x82Var = (x82) jpcVar;
        if (x82Var.K1() || x82Var.isConnected()) {
            return;
        }
        Intrinsics.checkNotNull(str);
        BroadcastsKt.broadcastConnectStart(str, mac, apiCall.isCurrent());
        this$0.getWorkHandler().postDelayed(this$0.mConnectTimeoutRunnable, 30000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void realConnect$lambda$3(EcoBleConnection this$0, qd7 ecoAuth, int i, String str) throws RemoteException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(ecoAuth, "$ecoAuth");
        Logger.i(this$0.getTAG(), "WearAuthWrapper() called with: status = " + i + ", message = " + str + ", mac = " + this$0.getCoreId());
        this$0.status = i;
        this$0.getWorkHandler().removeCallbacks(this$0.discoverServiceTimeoutRunnable);
        this$0.setMAuthType(ecoAuth.b());
        if (i == 2001) {
            this$0.lastStateConnected = true;
            if (this$0.getIsCallback()) {
                this$0.getCallback().b(i, str);
                return;
            }
            return;
        }
        if (i == 2004) {
            ((i) this$0.getApiCall()).X5();
            this$0.onConnectSuccess();
        } else {
            if (str == null) {
                str = "";
            }
            this$0.onConnectFailure(i, str);
        }
    }

    private final void startFakeConnect() {
        stopFakeConnect();
        jpc jpcVar = this.bleManager;
        if ((jpcVar instanceof x82) && !((x82) jpcVar).K1() && s33.e()) {
            getWorkHandler().post(this.mFakeConnectDelayRunnable);
        }
    }

    private final void stopFakeConnect() {
        Logger.i(getTAG(), "stopFakeConnect: ");
        getWorkHandler().removeCallbacks(this.mFakeConnectDelayRunnable);
        getWorkHandler().removeCallbacks(this.mConnectTimeoutRunnable);
    }

    @Override // com.xiaomi.eco.connection.EcoRealConnection, com.xiaomi.eco.connection.Connection
    public void disconnect() {
        super.disconnect();
        this.localSportMachineHasRetry = false;
        stopFakeConnect();
        getWorkHandler().removeCallbacks(this.discoverServiceTimeoutRunnable);
        BluetoothManager.INSTANCE.get().removeConnectStatusListener(getCoreId(), this);
        this.status = 2000;
        this.lastStateConnected = false;
        Logger.e(getTAG(), "disconnect: ", new Exception());
        onDisconnect(CommonConstants.Mgc.PRIVATE_KEY_NOT_EXIST, "active disconnect or switch disconnect");
        getApiCall().onDisconnected();
        this.bleManager.b(new ht2<Void>() { // from class: com.xiaomi.eco.api.EcoBleConnection.disconnect.1
            @Override // defpackage.ht2
            public void onFailed(int status) {
                Logger.i(EcoBleConnection.this.getTAG(), "onFailed: ble disconnect fail");
                try {
                    EcoBleConnection.this.getCallback().onDisconnectFailure(status);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }

            @Override // defpackage.ht2
            public void onResponse(Void data) {
                Logger.i(EcoBleConnection.this.getTAG(), "onResponse: ble disconnect success");
                try {
                    EcoBleConnection.this.getCallback().onDisconnectSuccess();
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    @Nullable
    public final String getAppDeviceId() {
        return this.appDeviceId;
    }

    public final int getBindType() {
        return this.bindType;
    }

    public final boolean getLastStateConnected() {
        return this.lastStateConnected;
    }

    public final boolean getLocalSportMachineHasRetry() {
        return this.localSportMachineHasRetry;
    }

    @Nullable
    public final String getOob() {
        return this.oob;
    }

    public final int getStatus() {
        return this.status;
    }

    @Nullable
    public final byte[] getToken() {
        return this.token;
    }

    @Nullable
    public final String getUserId() {
        return this.userId;
    }

    @Override // com.xiaomi.eco.connection.EcoRealConnection
    public boolean isAppAbandon() {
        Logger.i(getTAG(), "BleConnection isAppAbandon: bindType = " + this.bindType);
        if (this.bindType == 1) {
            return false;
        }
        return super.isAppAbandon();
    }

    @Override // com.xiaomi.eco.connection.Connection
    public boolean isConnect() {
        return this.status == 2004;
    }

    @Override // com.xiaomi.eco.connection.Connection
    public boolean needKeepAlive() {
        Logger.i(getTAG(), "needKeepAlive() returned: isCurrent = " + getApiCall().isCurrent());
        return true;
    }

    @Override // com.xiaomi.eco.connection.EcoRealConnection
    public boolean needRetryConnect(int status) {
        if (this.bleManager instanceof x82) {
            return false;
        }
        return super.needRetryConnect(status);
    }

    @Override // com.xiaomi.eco.connection.EcoRealConnection
    public void onBluetoothClose() {
        super.onBluetoothClose();
        stopFakeConnect();
    }

    @Override // com.xiaomi.eco.connection.EcoRealConnection
    public void onBluetoothOpen() {
        Logger.i(getTAG(), "onBluetoothOpen: ");
        if (needKeepAlive()) {
            if (this.bleManager instanceof x82) {
                startFakeConnect();
            } else {
                connect(true, false, 4);
            }
        }
    }

    @Override // com.xiaomi.eco.connection.EcoRealConnection
    public void onConnectFailure(int status, @NotNull String message) throws RemoteException {
        Intrinsics.checkNotNullParameter(message, "message");
        Logger.i(getTAG(), "retryIfNecessary: status " + status);
        if (super.needRetryConnect(status) && !ApplicationExtKt.isBackground(AppUtil.getApp())) {
            super.onConnectFailure(status, message);
            return;
        }
        if (this.bindType != 1 || status != 2005 || this.localSportMachineHasRetry) {
            disconnect();
            return;
        }
        Logger.i(getTAG(), "连接错误，可能设备端恢复出厂导致，触发了CONNECT_STATUS_NOT_BOUND，message is " + message + " ");
        this.localSportMachineHasRetry = true;
        super.onConnectFailure(status, message);
    }

    @Override // defpackage.b23
    public void onConnectStateChanged(@Nullable String mac, int connectState) {
        if (!Intrinsics.areEqual(getCoreId(), mac)) {
            Logger.i(getTAG(), "onConnectStateChanged: coreId = " + getCoreId() + " , mac = " + mac);
            return;
        }
        Logger.i(getTAG(), "onConnectStateChanged() called with: mac = " + mac + ", connectState = " + connectState + ", lastStatus = " + this.lastStateConnected);
        getWorkHandler().removeCallbacks(this.discoverServiceTimeoutRunnable);
        if (2 == connectState && !this.lastStateConnected) {
            Logger.i(getTAG(), "onConnectStateChanged: onConnected");
            this.lastStateConnected = true;
            getWorkHandler().postDelayed(this.discoverServiceTimeoutRunnable, 20000L);
        } else {
            if (connectState != 0 || !this.lastStateConnected) {
                Logger.i(getTAG(), "onConnectStateChanged: not handle");
                return;
            }
            Logger.i(getTAG(), "onConnectStateChanged: onDisconnected");
            this.lastStateConnected = false;
            this.status = 2000;
            onDisconnect(connectState, "ble disconnected");
            if (this.bleManager instanceof x82) {
                startFakeConnect();
            }
        }
    }

    @Override // com.xiaomi.eco.connection.EcoRealConnection
    public void onConnectSuccess() {
        this.localSportMachineHasRetry = false;
        stopFakeConnect();
        super.onConnectSuccess();
    }

    @Override // com.xiaomi.eco.connection.EcoRealConnection
    public void onDisconnect(int status, @NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        super.onDisconnect(status, message);
        boolean z = this.bleManager instanceof x82;
    }

    @Override // defpackage.b23
    public void onServiceDiscovered(@Nullable String mac) {
        getWorkHandler().removeCallbacks(this.discoverServiceTimeoutRunnable);
    }

    @Override // com.xiaomi.eco.connection.EcoRealConnection
    public void realConnect() throws RemoteException {
        final qd7 wd7Var;
        String str;
        BluetoothManager.INSTANCE.get().addConnectStatusListener(getCoreId(), this);
        if (this.userId == null) {
            onConnectFailure(108, "userId==null");
            return;
        }
        if (this.token == null) {
            onConnectFailure(108, "token==null");
            return;
        }
        if (this.bindType == 1 && (str = this.appDeviceId) == null) {
            onConnectFailure(108, "appDeviceId = " + str + " , oob = " + this.oob);
            Logger.i(getTAG(), "realConnect: returned v2 local bind , param error");
            return;
        }
        if (this.bleManager instanceof x82) {
            Logger.i(getTAG(), "realConnect, bleManager is BaseMIUIBleManager");
            startFakeConnect();
        }
        Logger.i(getTAG(), "realConnect bindType : " + this.bindType);
        if (this.bindType == 1) {
            String str2 = this.userId;
            Intrinsics.checkNotNull(str2);
            byte[] bArr = this.token;
            Intrinsics.checkNotNull(bArr);
            boolean isDeviceOwner = getIsDeviceOwner();
            String str3 = this.appDeviceId;
            String str4 = this.oob;
            a<?> apiCall = getApiCall();
            Intrinsics.checkNotNull(apiCall, "null cannot be cast to non-null type com.xiaomi.eco.api.EcoBleApiCall");
            wd7Var = new eu7(str2, bArr, isDeviceOwner, str3, str4, (i) apiCall, getMFrom() == 3 ? 2 : 1);
        } else {
            String str5 = this.userId;
            Intrinsics.checkNotNull(str5);
            byte[] bArr2 = this.token;
            Intrinsics.checkNotNull(bArr2);
            boolean isDeviceOwner2 = getIsDeviceOwner();
            String str6 = this.appDeviceId;
            String str7 = this.oob;
            a<?> apiCall2 = getApiCall();
            Intrinsics.checkNotNull(apiCall2, "null cannot be cast to non-null type com.xiaomi.eco.api.EcoBleApiCall");
            wd7Var = new wd7(str5, bArr2, isDeviceOwner2, str6, str7, (i) apiCall2, getMFrom() == 3 ? 2 : 1);
        }
        wd7Var.d(new qj7() { // from class: ni7
            @Override // defpackage.qj7
            public final void b(int i, String str8) throws RemoteException {
                EcoBleConnection.realConnect$lambda$3(this.f27955a, wd7Var, i, str8);
            }
        });
    }

    public final void setAppDeviceId(@Nullable String str) {
        this.appDeviceId = str;
    }

    public final void setLastStateConnected(boolean z) {
        this.lastStateConnected = z;
    }

    public final void setLocalSportMachineHasRetry(boolean z) {
        this.localSportMachineHasRetry = z;
    }

    public final void setOob(@Nullable String str) {
        this.oob = str;
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

    public /* synthetic */ EcoBleConnection(String str, String str2, boolean z, int i, i iVar, jpc jpcVar, String str3, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, z, (i3 & 8) != 0 ? 0 : i, iVar, jpcVar, str3, i2);
    }
}

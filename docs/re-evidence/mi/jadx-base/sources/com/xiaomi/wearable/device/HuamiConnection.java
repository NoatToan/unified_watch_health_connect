package com.xiaomi.wearable.device;

import android.os.Build;
import android.os.RemoteException;
import com.mibi.sdk.common.CommonConstants;
import com.xiaomi.fitness.common.app.AppManager;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.LocationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.hm.health.bt.sdk.HuamiDevice;
import com.xiaomi.hm.health.bt.sdk.IDeviceBaseCallback;
import com.xiaomi.wearable.HuamiApiFactory;
import com.xiaomi.wearable.ScanExtKt;
import com.xiaomi.wearable.connection.Connection;
import com.xiaomi.wearable.connection.ConnectionCallback;
import com.xiaomi.wearable.core.DeviceInfo;
import com.xiaomi.wearable.device.HuamiConnection;
import com.xiaomi.wearable.hm.HuamiStepListener;
import com.xiaomi.wearable.hm.m;
import com.xiaomi.wearable.hm.n;
import com.xiaomi.wearable.huami_export.HuamiDeviceApi;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000W\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u000e*\u0001\u001a\u0018\u0000 A2\u00020\u00012\u00020\u0002:\u0001AB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ \u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020\u001fH\u0002J\b\u0010$\u001a\u00020\u001fH\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010%\u001a\u00020\u001dH\u0002J\u0006\u0010&\u001a\u00020\u001dJ\u000e\u0010'\u001a\u00020\u001d2\u0006\u0010(\u001a\u00020\u000eJ\b\u0010)\u001a\u00020\u001fH\u0016J\b\u0010*\u001a\u00020\u001fH\u0016J\u0010\u0010+\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020\u001fH\u0016J \u0010-\u001a\u00020\u001d2\u0006\u0010.\u001a\u00020\"2\u0006\u0010/\u001a\u00020\"2\u0006\u00100\u001a\u00020\"H\u0016J\u0010\u00101\u001a\u00020\u001f2\u0006\u0010.\u001a\u00020\"H\u0016J\u0018\u0010-\u001a\u00020\u001d2\u0006\u0010/\u001a\u00020\"2\u0006\u00100\u001a\u00020\"H\u0002J\u001c\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u0001042\b\u00106\u001a\u0004\u0018\u000104H\u0016J\u0010\u00107\u001a\u00020\u001d2\u0006\u00108\u001a\u00020\"H\u0016J\u0016\u00109\u001a\u00020\u001d2\u0006\u0010.\u001a\u00020\"2\u0006\u0010:\u001a\u000204J\u0016\u0010;\u001a\u00020\u001d2\u0006\u0010.\u001a\u00020\"2\u0006\u0010:\u001a\u000204J\b\u0010<\u001a\u00020\u001dH\u0002J\b\u0010=\u001a\u00020\u001dH\u0016J\u000e\u0010>\u001a\u0002042\u0006\u0010.\u001a\u00020\"J\u0016\u0010?\u001a\u0002042\u0006\u0010.\u001a\u00020\"2\u0006\u0010/\u001a\u00020\"J\u000e\u0010@\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u0004R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u000f\u001a\n \u0011*\u0004\u0018\u00010\u00100\u0010X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0010\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001bR\u000e\u00102\u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006B"}, d2 = {"Lcom/xiaomi/wearable/device/HuamiConnection;", "Lcom/xiaomi/wearable/connection/Connection;", "Lcom/xiaomi/hm/health/bt/sdk/IDeviceBaseCallback;", "deviceInfo", "Lcom/xiaomi/wearable/core/DeviceInfo;", "apiCall", "Lcom/xiaomi/wearable/huami_export/HuamiDeviceApi;", "<init>", "(Lcom/xiaomi/wearable/core/DeviceInfo;Lcom/xiaomi/wearable/huami_export/HuamiDeviceApi;)V", "getDeviceInfo", "()Lcom/xiaomi/wearable/core/DeviceInfo;", "setDeviceInfo", "(Lcom/xiaomi/wearable/core/DeviceInfo;)V", "mStepListener", "Lcom/xiaomi/wearable/hm/HuamiStepListener;", "singleThreadExecutor", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "Ljava/util/concurrent/ExecutorService;", "callback", "Lcom/xiaomi/wearable/connection/ConnectionCallback;", "getCallback", "()Lcom/xiaomi/wearable/connection/ConnectionCallback;", "setCallback", "(Lcom/xiaomi/wearable/connection/ConnectionCallback;)V", "huamiCallback", "com/xiaomi/wearable/device/HuamiConnection$huamiCallback$1", "Lcom/xiaomi/wearable/device/HuamiConnection$huamiCallback$1;", "connect", "", "reset", "", "needCallback", "from", "", "checkPermission", "checkGps", "printGPSStatus", "onConnectSuccess", "setStepListener", "stepListener", "isConnect", "needKeepAlive", "disconnect", "reconnectMonitor", "onConnectionStateChange", "status", "state", "errorCode", "needRetryConnect", "lastConnectState", "onGetSignData", "", "sha256Base64", "publicKey", "onStepChanged", "step", "onDisconnect", "message", "onConnectFailure", "disconnectHuamiDevice", "onBluetoothClose", "getReadableStatus", "getReadableState", "onUpdate", "Companion", "huami_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HuamiConnection implements Connection, IDeviceBaseCallback {

    @NotNull
    private static final String TAG = "HuamiConnection";

    @NotNull
    private final HuamiDeviceApi apiCall;

    @Nullable
    private ConnectionCallback callback;

    @NotNull
    private DeviceInfo deviceInfo;

    @NotNull
    private final HuamiConnection$huamiCallback$1 huamiCallback;
    private volatile boolean lastConnectState;

    @Nullable
    private HuamiStepListener mStepListener;
    private final ExecutorService singleThreadExecutor;

    /* JADX WARN: Type inference failed for: r2v2, types: [com.xiaomi.wearable.device.HuamiConnection$huamiCallback$1] */
    public HuamiConnection(@NotNull DeviceInfo deviceInfo, @NotNull HuamiDeviceApi apiCall) {
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        Intrinsics.checkNotNullParameter(apiCall, "apiCall");
        this.deviceInfo = deviceInfo;
        this.apiCall = apiCall;
        this.singleThreadExecutor = Executors.newSingleThreadExecutor();
        this.huamiCallback = new n.a() { // from class: com.xiaomi.wearable.device.HuamiConnection$huamiCallback$1
            @Override // com.xiaomi.wearable.hm.n
            public void onConnectionStateChange(int status, int state, int errorCode) throws RemoteException {
                this.this$0.onConnectionStateChange(status, state, errorCode);
            }

            @Override // com.xiaomi.wearable.hm.n
            public String onGetSignData(String sha256Base64, String publicKey) {
                return "";
            }

            @Override // com.xiaomi.wearable.hm.n
            public void onStepChanged(int step) {
                this.this$0.onStepChanged(step);
            }
        };
    }

    private final boolean checkGps() {
        if (Build.VERSION.SDK_INT >= 31) {
            return true;
        }
        return LocationExtKt.isGpsEnable(ApplicationExtKt.getApplication());
    }

    private final boolean checkPermission() {
        if (Build.VERSION.SDK_INT >= 31) {
            if (ApplicationExtKt.getApplication().checkSelfPermission("android.permission.BLUETOOTH_SCAN") != 0) {
                return false;
            }
        } else if (ApplicationExtKt.getApplication().checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") != 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void connect$lambda$0(m huamiDevice, HuamiConnection this$0) throws RemoteException {
        Intrinsics.checkNotNullParameter(huamiDevice, "$huamiDevice");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        huamiDevice.connect(this$0.huamiCallback);
    }

    private final void disconnectHuamiDevice() throws RemoteException {
        Logger.i(TAG, "disconnectHuamiDevice() called");
        HuamiApiFactory.Companion companion = HuamiApiFactory.INSTANCE;
        m huamiApi = companion.get().getHuamiApi(this.deviceInfo.getAddress(), null);
        huamiApi.setAutoReconnect(false);
        huamiApi.disconnect();
        huamiApi.shutdown();
        companion.get().removeHuamiApi(this.deviceInfo.getAddress());
    }

    private final void printGPSStatus() {
        try {
            if (Build.VERSION.SDK_INT < 31) {
                Logger.i(TAG, "printLocationStatus: gps is " + LocationExtKt.isGpsEnable(ApplicationExtKt.getApplication()) + ", permission = " + ApplicationExtKt.getApplication().checkSelfPermission("android.permission.ACCESS_FINE_LOCATION"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.xiaomi.wearable.connection.Connection
    public void connect(boolean reset, boolean needCallback, int from) throws RemoteException {
        if (checkPermission() && checkGps()) {
            m huamiApi = HuamiApiFactory.INSTANCE.get().getHuamiApi(this.deviceInfo.getAddress(), this.deviceInfo.getDid());
            huamiApi.setPair(false);
            huamiApi.setAutoReconnect(true);
            huamiApi.setCallback(this.huamiCallback);
            Connection.DefaultImpls.connect(this, reset, needCallback, from);
            return;
        }
        Logger.i(TAG, "connect: huami device need location permission, permission" + checkPermission() + ", gps " + checkGps());
    }

    @Override // com.xiaomi.wearable.connection.Connection
    public void disconnect(boolean reconnectMonitor) throws RemoteException {
        Logger.d(TAG, "disconnect: ");
        onDisconnect(CommonConstants.Mgc.PRIVATE_KEY_NOT_EXIST, "active disconnect or switch disconnect");
        HuamiApiFactory.Companion companion = HuamiApiFactory.INSTANCE;
        companion.get().getHuamiApi(this.deviceInfo.getAddress(), null).disconnect();
        companion.get().removeHuamiApi(this.deviceInfo.getAddress());
    }

    @Override // com.xiaomi.wearable.connection.Connection
    @Nullable
    public ConnectionCallback getCallback() {
        return this.callback;
    }

    @NotNull
    public final DeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    @NotNull
    public final String getReadableState(int status, int state) {
        if (status != HuamiDevice.CONNECT) {
            return "";
        }
        if (state == HuamiDevice.CONNECTING) {
            return "CONNECTING";
        }
        if (state == HuamiDevice.CONNECTED) {
            return "CONNECTED";
        }
        if (state == HuamiDevice.DISCONNECTED) {
            return "DISCONNECTED";
        }
        if (state == HuamiDevice.CONNECTING_TIMEOUT) {
            return "CONNECTING_TIMEOUT";
        }
        return state == HuamiDevice.SCAN_FAIL ? "SCAN_FAIL" : String.valueOf(state);
    }

    @NotNull
    public final String getReadableStatus(int status) {
        if (status == HuamiDevice.AUTH) {
            return "AUTH";
        }
        return status == HuamiDevice.CONNECT ? "CONNECT" : String.valueOf(status);
    }

    @Override // com.xiaomi.wearable.connection.Connection
    public boolean isConnect() throws RemoteException {
        m huamiApi = HuamiApiFactory.INSTANCE.get().getHuamiApi(this.deviceInfo.getAddress(), null);
        huamiApi.setPair(false);
        huamiApi.setAutoReconnect(true);
        huamiApi.setCallback(this.huamiCallback);
        boolean zIsConnected = huamiApi.isConnected();
        this.lastConnectState = zIsConnected;
        return zIsConnected;
    }

    @Override // com.xiaomi.wearable.connection.Connection
    public boolean needKeepAlive() {
        Logger.i(TAG, "needKeepAlive: isCurrent = " + this.apiCall.getCurrentDevice());
        return this.apiCall.getCurrentDevice();
    }

    @Override // com.xiaomi.wearable.connection.Connection
    public boolean needRetryConnect(int status) {
        return status != 2008;
    }

    @Override // com.xiaomi.wearable.connection.Connection
    public void onBluetoothClose() throws RemoteException {
        Connection.DefaultImpls.onBluetoothClose(this);
        onDisconnect(109, "disconnect by bluetooth close");
    }

    @Override // com.xiaomi.wearable.connection.Connection
    public void onBluetoothOpen() {
        Connection.DefaultImpls.onBluetoothOpen(this);
    }

    public final void onConnectFailure(int status, @NotNull String message) throws RemoteException {
        Intrinsics.checkNotNullParameter(message, "message");
        ConnectionCallback callback = getCallback();
        if (callback != null) {
            callback.onConnectFailure(status, message);
        }
        disconnectHuamiDevice();
    }

    public final void onConnectSuccess() {
        Logger.i(TAG, "onConnectSuccess() called " + getCallback());
        this.lastConnectState = true;
        ConnectionCallback callback = getCallback();
        if (callback != null) {
            callback.onConnectSuccess();
        }
    }

    @Override // com.xiaomi.hm.health.bt.sdk.IDeviceBaseCallback
    public void onConnectionStateChange(int status, int state, int errorCode) throws RemoteException {
        Logger.i(TAG, "onConnectionStateChange() called with: status = " + getReadableStatus(status) + ", state = " + getReadableState(status, state) + ", errorCode = " + errorCode + ", this = " + this);
        if (status != HuamiDevice.CONNECT) {
            return;
        }
        onConnectionStateChange(state, errorCode);
    }

    public final void onDisconnect(int status, @NotNull String message) throws RemoteException {
        Intrinsics.checkNotNullParameter(message, "message");
        this.lastConnectState = false;
        ConnectionCallback callback = getCallback();
        if (callback != null) {
            callback.onDisconnect(status, message);
        }
        disconnectHuamiDevice();
    }

    @Override // com.xiaomi.hm.health.bt.sdk.IDeviceBaseCallback
    @NotNull
    public String onGetSignData(@Nullable String sha256Base64, @Nullable String publicKey) {
        Logger.i(TAG, "onGetSignData() called with: sha256Base64 = " + sha256Base64 + ", publicKey = " + publicKey);
        return "";
    }

    @Override // com.xiaomi.hm.health.bt.sdk.IDeviceBaseCallback
    public void onStepChanged(int step) {
        Logger.i(TAG, "onStepChanged() called with: step = " + step);
        HuamiStepListener huamiStepListener = this.mStepListener;
        if (huamiStepListener != null) {
            huamiStepListener.onStepChanged(step);
        }
    }

    public final void onUpdate(@NotNull DeviceInfo deviceInfo) {
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        disconnectHuamiDevice();
        this.deviceInfo = deviceInfo;
        if (this.apiCall.getCurrentDevice()) {
            connect(true, false, 1);
        }
    }

    @Override // com.xiaomi.wearable.connection.Connection
    public void setCallback(@Nullable ConnectionCallback connectionCallback) {
        this.callback = connectionCallback;
    }

    public final void setDeviceInfo(@NotNull DeviceInfo deviceInfo) {
        Intrinsics.checkNotNullParameter(deviceInfo, "<set-?>");
        this.deviceInfo = deviceInfo;
    }

    public final void setStepListener(@NotNull HuamiStepListener stepListener) {
        Intrinsics.checkNotNullParameter(stepListener, "stepListener");
        Logger.i(TAG, "setStepListener() called with: stepListener = " + stepListener + ", this = " + this);
        this.mStepListener = stepListener;
    }

    private final void onConnectionStateChange(int state, int errorCode) throws RemoteException {
        if (state == HuamiDevice.SCAN_FAIL) {
            onConnectFailure(2000, "scan fail");
            return;
        }
        if (state == HuamiDevice.CONNECTING) {
            Logger.i(TAG, "onConnectionStateChangeInner: lastConnectState " + this.lastConnectState);
            if (this.lastConnectState) {
                onDisconnect(2000, "reason " + errorCode);
                return;
            }
            if (errorCode != 0) {
                onConnectFailure(2002, "connect error " + errorCode);
                return;
            }
            return;
        }
        if (state == HuamiDevice.AUTH_FAILED) {
            onConnectFailure(2000, "auth error");
            return;
        }
        if (state == HuamiDevice.CONNECTED) {
            onConnectSuccess();
        } else if (state == HuamiDevice.DISCONNECTED) {
            onDisconnect(2000, "huami disconnect");
        } else if (state == HuamiDevice.CONNECTING_TIMEOUT) {
            onConnectFailure(2002, "connect timeout");
        }
    }

    @Override // com.xiaomi.wearable.connection.Connection
    public void connect() throws RemoteException {
        final m huamiApi = HuamiApiFactory.INSTANCE.get().getHuamiApi(this.deviceInfo.getAddress(), null);
        Logger.d(TAG, "huamiDevice = " + huamiApi + ", mac " + this.deviceInfo.getAddress() + ", isAppForeground " + AppManager.INSTANCE.getInstance().isAppForeground() + ",key = " + this.deviceInfo.getToken());
        huamiApi.setAuthKey(this.deviceInfo.getToken());
        ScanExtKt.switchScanMode(huamiApi);
        this.singleThreadExecutor.submit(new Runnable() { // from class: ujc
            @Override // java.lang.Runnable
            public final void run() throws RemoteException {
                HuamiConnection.connect$lambda$0(huamiApi, this);
            }
        });
        printGPSStatus();
    }
}

package com.xiaomi.eco.connection;

import android.os.Handler;
import android.os.RemoteException;
import com.xiaomi.EcoConnectPreference;
import com.xiaomi.eco.EcoConnectTrackerKt;
import com.xiaomi.eco.api.a;
import com.xiaomi.eco.connection.EcoRealConnection;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.config.preference.ChooseAppPreference;
import com.xiaomi.fitness.main.export.ConfigPreference;
import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.miot.core.bluetooth.BluetoothManager;
import defpackage.a33;
import defpackage.s33;
import defpackage.wrc;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 a2\u00020\u00012\u00020\u0002:\u0001aB=\u0012\u0006\u0010%\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010+\u001a\u00020\u0012\u0012\n\u0010.\u001a\u0006\u0012\u0002\b\u00030-\u0012\u0006\u00102\u001a\u00020\u000b\u0012\u0006\u00104\u001a\u00020\u0003¢\u0006\u0004\b_\u0010`J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0005H&¢\u0006\u0004\b\u0011\u0010\tJ'\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0018\u0010\tJ\u001f\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001f\u0010\tJ\u000f\u0010 \u001a\u00020\u0005H\u0014¢\u0006\u0004\b \u0010\tJ\u000f\u0010!\u001a\u00020\u0005H\u0014¢\u0006\u0004\b!\u0010\tJ\u0017\u0010\"\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\"\u0010\u0007J\u000f\u0010#\u001a\u00020\u0012H\u0016¢\u0006\u0004\b#\u0010$R\u0017\u0010%\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R$\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010&\u001a\u0004\b)\u0010(\"\u0004\b*\u0010\u0010R\u0017\u0010+\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b+\u0010$R\u001b\u0010.\u001a\u0006\u0012\u0002\b\u00030-8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u00102\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b2\u0010&\u001a\u0004\b3\u0010(R\u0017\u00104\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0017\u00108\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b8\u0010&\u001a\u0004\b9\u0010(R\"\u0010:\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u00105\u001a\u0004\b;\u00107\"\u0004\b<\u0010\u0007R\"\u0010=\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010,\u001a\u0004\b=\u0010$\"\u0004\b>\u0010?R$\u0010A\u001a\u0004\u0018\u00010@8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010G\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010,\u001a\u0004\bG\u0010$\"\u0004\bH\u0010?R\u0017\u0010J\u001a\u00020I8\u0006¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\"\u0010O\u001a\u00020N8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\"\u0010U\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bU\u00105\u001a\u0004\bV\u00107\"\u0004\bW\u0010\u0007R\u0016\u0010Y\u001a\u00020X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010[\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010,R\u0014\u0010]\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^¨\u0006b"}, d2 = {"Lcom/xiaomi/eco/connection/EcoRealConnection;", "Lcom/xiaomi/eco/connection/Connection;", "La33;", "", "status", "", "retryIfNecessary", "(I)V", "resetRetryStrategy", "()V", "state", "", "getReadableState", "(I)Ljava/lang/String;", "did", "refreshDid", "(Ljava/lang/String;)V", "realConnect", "", "reset", "needCallback", "from", "connect", "(ZZI)V", "onConnectSuccess", "message", "onDisconnect", "(ILjava/lang/String;)V", "onConnectFailure", "needRetryConnect", "(I)Z", "disconnect", "onBluetoothOpen", "onBluetoothClose", "onStateChanged", "isAppAbandon", "()Z", "coreId", "Ljava/lang/String;", "getCoreId", "()Ljava/lang/String;", "getDid", "setDid", "isDeviceOwner", "Z", "Lcom/xiaomi/eco/api/a;", "apiCall", "Lcom/xiaomi/eco/api/a;", "getApiCall", "()Lcom/xiaomi/eco/api/a;", "model", "getModel", "deviceType", "I", "getDeviceType", "()I", "TAG", "getTAG", "mFrom", "getMFrom", "setMFrom", "isConnecting", "setConnecting", "(Z)V", "Lcom/xiaomi/eco/connection/RetryStrategy;", "retryStrategy", "Lcom/xiaomi/eco/connection/RetryStrategy;", "getRetryStrategy", "()Lcom/xiaomi/eco/connection/RetryStrategy;", "setRetryStrategy", "(Lcom/xiaomi/eco/connection/RetryStrategy;)V", "isCallback", "setCallback", "Lwrc;", "callback", "Lwrc;", "getCallback", "()Lwrc;", "Landroid/os/Handler;", "workHandler", "Landroid/os/Handler;", "getWorkHandler", "()Landroid/os/Handler;", "setWorkHandler", "(Landroid/os/Handler;)V", "mAuthType", "getMAuthType", "setMAuthType", "", StatConstants.PARAM_START, "J", "mForegroundTrigger", "Ljava/lang/Runnable;", "retryRunnable", "Ljava/lang/Runnable;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLcom/xiaomi/eco/api/a;Ljava/lang/String;I)V", "Companion", "eco-common-connect_release"}, k = 1, mv = {2, 0, 0})
public abstract class EcoRealConnection implements Connection, a33 {
    public static final int FROM_MIUI = 3;
    public static final int FROM_MIUI_RECONNECT = 5;
    public static final int FROM_OPEN_BLUETOOTH = 4;
    public static final int FROM_OUTSIDE = 1;
    public static final int FROM_RETRY = 2;
    public static final int TASK_MSG_CONNECT_TIMEOUT = 3;

    @NotNull
    private final String TAG;

    @NotNull
    private final a<?> apiCall;

    @NotNull
    private final wrc callback;

    @NotNull
    private final String coreId;
    private final int deviceType;

    @Nullable
    private volatile String did;
    private boolean isCallback;
    private boolean isConnecting;
    private final boolean isDeviceOwner;
    private int mAuthType;
    private boolean mForegroundTrigger;
    private int mFrom;

    @NotNull
    private final String model;

    @NotNull
    private final Runnable retryRunnable;

    @Nullable
    private RetryStrategy retryStrategy;
    private long start;
    public Handler workHandler;

    public EcoRealConnection(@NotNull String coreId, @Nullable String str, boolean z, @NotNull a<?> apiCall, @NotNull String model, int i) {
        Intrinsics.checkNotNullParameter(coreId, "coreId");
        Intrinsics.checkNotNullParameter(apiCall, "apiCall");
        Intrinsics.checkNotNullParameter(model, "model");
        this.coreId = coreId;
        this.did = str;
        this.isDeviceOwner = z;
        this.apiCall = apiCall;
        this.model = model;
        this.deviceType = i;
        this.TAG = "EcoRealConnection#" + this.did;
        wrc clientCallback = apiCall.getClientCallback();
        Intrinsics.checkNotNullExpressionValue(clientCallback, "getClientCallback(...)");
        this.callback = clientCallback;
        this.mAuthType = 1;
        this.retryRunnable = new Runnable() { // from class: dw7
            @Override // java.lang.Runnable
            public final void run() {
                EcoRealConnection.retryRunnable$lambda$2(this.f15985a);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void connect$lambda$0(EcoRealConnection this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.realConnect();
    }

    private final String getReadableState(int state) {
        return state == 12 ? "open bluetooth" : "close bluetooth";
    }

    private final void resetRetryStrategy() {
        Logger.i(this.TAG, "resetRetryStrategy: ");
        getWorkHandler().removeCallbacks(this.retryRunnable);
        RetryStrategy retryStrategy = this.retryStrategy;
        if (retryStrategy != null) {
            retryStrategy.reset();
        }
    }

    private final void retryIfNecessary(int status) {
        RetryStrategy retryStrategy = this.retryStrategy;
        if (retryStrategy != null) {
            if (isAppAbandon() || !needKeepAlive() || !needRetryConnect(status) || retryStrategy.overLimit() || !s33.d() || !s33.e() || ApplicationExtKt.isBackground(AppUtil.getApp())) {
                resetRetryStrategy();
                return;
            }
            long nextBackoff = ((long) retryStrategy.getNextBackoff()) * 1000;
            Logger.i(this.TAG, "retryIfNecessary: retry after " + (nextBackoff / ((long) 1000)) + " second");
            getWorkHandler().postDelayed(this.retryRunnable, nextBackoff);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void retryRunnable$lambda$2(EcoRealConnection this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!this$0.isAppAbandon() && s33.e() && this$0.needKeepAlive()) {
            Logger.i(this$0.TAG, "retryRunnable() connect called");
            this$0.connect(false, false, 2);
        }
    }

    @Override // com.xiaomi.eco.connection.Connection
    public synchronized void connect(boolean reset, boolean needCallback, int from) {
        Logger.i(this.TAG, "connect() called with: reset = " + reset + ", needCallback = " + needCallback + ", from = " + from);
        if (isAppAbandon()) {
            Logger.i(this.TAG, "ConnectAbandon");
            return;
        }
        if (!s33.d()) {
            Logger.w(this.TAG, "no permission connect return", new Exception());
            return;
        }
        BluetoothManager.INSTANCE.get().addBluetoothStateListener(this);
        if (isConnect()) {
            onConnectSuccess();
            Logger.i(this.TAG, "connect: returned");
            return;
        }
        if (needCallback) {
            this.isCallback = needCallback;
        }
        this.mForegroundTrigger = reset;
        if (reset) {
            resetRetryStrategy();
        }
        String str = this.did;
        Intrinsics.checkNotNull(str);
        BroadcastsKt.broadcastConnectStart(str, this.coreId, this.apiCall.isCurrent());
        EcoConnectTrackerKt.trackConnectStart();
        if (this.isConnecting) {
            Logger.i(this.TAG, "connect: connecting returned");
            return;
        }
        this.mFrom = from;
        this.isConnecting = true;
        this.start = System.currentTimeMillis();
        Logger.i(this.TAG, "realConnection start, from = " + this.mFrom);
        getWorkHandler().post(new Runnable() { // from class: cw7
            @Override // java.lang.Runnable
            public final void run() {
                EcoRealConnection.connect$lambda$0(this.f14797a);
            }
        });
    }

    @Override // com.xiaomi.eco.connection.Connection
    public void disconnect() {
        Logger.INSTANCE.v(this.TAG + " disconnect: " + this.coreId, new RuntimeException());
        resetRetryStrategy();
        BluetoothManager.INSTANCE.get().removeBluetoothStateListener(this);
    }

    @NotNull
    public final a<?> getApiCall() {
        return this.apiCall;
    }

    @NotNull
    public final wrc getCallback() {
        return this.callback;
    }

    @NotNull
    public final String getCoreId() {
        return this.coreId;
    }

    public final int getDeviceType() {
        return this.deviceType;
    }

    @Nullable
    public final String getDid() {
        return this.did;
    }

    public int getMAuthType() {
        return this.mAuthType;
    }

    public final int getMFrom() {
        return this.mFrom;
    }

    @NotNull
    public final String getModel() {
        return this.model;
    }

    @Nullable
    public final RetryStrategy getRetryStrategy() {
        return this.retryStrategy;
    }

    @NotNull
    public final String getTAG() {
        return this.TAG;
    }

    @NotNull
    public final Handler getWorkHandler() {
        Handler handler = this.workHandler;
        if (handler != null) {
            return handler;
        }
        Intrinsics.throwUninitializedPropertyAccessException("workHandler");
        return null;
    }

    public boolean isAppAbandon() {
        boolean zHasPackage = AppUtil.hasPackage(ApplicationExtKt.getApplication(), "com.xiaomi.wearable");
        boolean z = ChooseAppPreference.INSTANCE.getChooseApp() == 2;
        String str = this.TAG;
        ConfigPreference configPreference = ConfigPreference.INSTANCE;
        Logger.i(str, "isAppAbandon: isOpen " + configPreference.getIS_APP_CHOSEN_OPEN() + ", hasPackage = " + zHasPackage + ", chosenApp = " + z);
        return configPreference.getIS_APP_CHOSEN_OPEN() && zHasPackage && z;
    }

    /* JADX INFO: renamed from: isCallback, reason: from getter */
    public final boolean getIsCallback() {
        return this.isCallback;
    }

    /* JADX INFO: renamed from: isConnecting, reason: from getter */
    public final boolean getIsConnecting() {
        return this.isConnecting;
    }

    /* JADX INFO: renamed from: isDeviceOwner, reason: from getter */
    public final boolean getIsDeviceOwner() {
        return this.isDeviceOwner;
    }

    public boolean needRetryConnect(int status) {
        boolean z = (status == 2005 || status == 108 || status == 2008) ? false : true;
        Logger.i(this.TAG, "needRetryConnect() returned: " + z);
        return z;
    }

    public void onBluetoothClose() {
    }

    public void onBluetoothOpen() {
    }

    public void onConnectFailure(int status, @NotNull String message) throws RemoteException {
        int retryCount;
        Intrinsics.checkNotNullParameter(message, "message");
        Logger.i(this.TAG, "onConnectFailure() called with: status = " + status + ", message = " + message + " , cost = " + ((System.currentTimeMillis() - this.start) / 1000.0f));
        this.isConnecting = false;
        String str = this.did;
        String str2 = this.coreId;
        RetryStrategy retryStrategy = this.retryStrategy;
        BroadcastsKt.broadcastConnectFail(str, str2, status, message, retryStrategy != null ? retryStrategy.getRetryCount() : 0, this.apiCall.isCurrent());
        String str3 = this.model;
        EcoConnectPreference ecoConnectPreference = EcoConnectPreference.INSTANCE;
        String str4 = this.did;
        if (str4 == null) {
            str4 = "";
        }
        String firmwareVersion = ecoConnectPreference.getFirmwareVersion(str4);
        RetryStrategy retryStrategy2 = this.retryStrategy;
        if (retryStrategy2 == null) {
            retryCount = 1;
        } else {
            Intrinsics.checkNotNull(retryStrategy2);
            retryCount = retryStrategy2.getRetryCount() + 1;
        }
        EcoConnectTrackerKt.trackConnectError(str3, firmwareVersion, status, message, retryCount, this.mForegroundTrigger, this.deviceType);
        if (this.isCallback) {
            this.callback.b(status, message);
            this.isCallback = false;
        }
        retryIfNecessary(status);
    }

    public void onConnectSuccess() throws RemoteException {
        int retryCount;
        Logger.i(this.TAG, "onConnectSuccess() called cost = " + ((System.currentTimeMillis() - this.start) / 1000.0f));
        this.isConnecting = false;
        BroadcastsKt.broadcastConnectSuccess(this.did, this.coreId, this.apiCall.isCurrent(), 0);
        String str = this.model;
        EcoConnectPreference ecoConnectPreference = EcoConnectPreference.INSTANCE;
        String str2 = this.did;
        if (str2 == null) {
            str2 = "";
        }
        String firmwareVersion = ecoConnectPreference.getFirmwareVersion(str2);
        RetryStrategy retryStrategy = this.retryStrategy;
        if (retryStrategy == null) {
            retryCount = 1;
        } else {
            Intrinsics.checkNotNull(retryStrategy);
            retryCount = retryStrategy.getRetryCount() + 1;
        }
        EcoConnectTrackerKt.trackConnectSuccess(str, firmwareVersion, retryCount, this.mForegroundTrigger, getMAuthType(), this.mFrom, this.deviceType);
        EcoConnectTrackerKt.startTrackConnectAlive(this.did);
        if (this.isCallback) {
            this.callback.b(2004, "device ready");
            this.isCallback = false;
        }
        resetRetryStrategy();
    }

    public void onDisconnect(int status, @NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Logger.i(this.TAG, "onDisconnect() called with: status = " + status + ", message = " + message);
        this.isConnecting = false;
        this.isCallback = false;
        this.start = System.currentTimeMillis();
        RetryStrategy retryStrategy = this.retryStrategy;
        if (retryStrategy != null) {
            retryStrategy.retryStart();
        }
        BroadcastsKt.broadcastDisconnect(this.did, this.coreId, status, message, this.apiCall.isCurrent());
        String str = this.did;
        String str2 = this.model;
        EcoConnectPreference ecoConnectPreference = EcoConnectPreference.INSTANCE;
        String str3 = this.did;
        if (str3 == null) {
            str3 = "";
        }
        EcoConnectTrackerKt.endTrackConnectAlive(str, str2, status, message, ecoConnectPreference.getFirmwareVersion(str3));
        retryIfNecessary(status);
    }

    @Override // defpackage.a33
    public void onStateChanged(int state) {
        Logger.i(this.TAG, "onStateChanged() called with: state = " + getReadableState(state));
        boolean z = state == 12;
        boolean z2 = state == 10;
        if (z) {
            onBluetoothOpen();
        } else if (z2) {
            onBluetoothClose();
        } else {
            resetRetryStrategy();
        }
    }

    public abstract void realConnect();

    public final void refreshDid(@Nullable String did) {
        Logger.i(this.TAG, "refreshDid: " + did + ", this = " + this);
        this.did = did;
    }

    public final void setCallback(boolean z) {
        this.isCallback = z;
    }

    public final void setConnecting(boolean z) {
        this.isConnecting = z;
    }

    public final void setDid(@Nullable String str) {
        this.did = str;
    }

    public void setMAuthType(int i) {
        this.mAuthType = i;
    }

    public final void setMFrom(int i) {
        this.mFrom = i;
    }

    public final void setRetryStrategy(@Nullable RetryStrategy retryStrategy) {
        this.retryStrategy = retryStrategy;
    }

    public final void setWorkHandler(@NotNull Handler handler) {
        Intrinsics.checkNotNullParameter(handler, "<set-?>");
        this.workHandler = handler;
    }
}

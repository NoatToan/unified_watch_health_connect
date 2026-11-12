package com.xiaomi.wearable.connection;

import android.os.Handler;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeProgressBar;
import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.miot.core.bluetooth.BluetoothManager;
import com.xiaomi.wearable.WearMode;
import com.xiaomi.wearable.connection.RealConnection;
import com.xiaomi.wearable.core.ConnectTrackerKt;
import com.xiaomi.wearable.core.CoreExtKt;
import com.xiaomi.wearable.core.DeviceInfo;
import com.xiaomi.wearable.core.client.Logger;
import com.xiaomi.wearable.core.server.DeviceInfoManager;
import com.xiaomi.wearable.core.server.IMiWearCoreImpl;
import com.xiaomi.wearable.wear.api.WearApiCall;
import defpackage.a33;
import defpackage.s33;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000w\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001v\b&\u0018\u0000 \u007f2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u007fB\u001b\u0012\u0006\u0010;\u001a\u00020:\u0012\n\u0010I\u001a\u0006\u0012\u0002\b\u00030H¢\u0006\u0004\b}\u0010~J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001d\u0010\u0007J\u0017\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001e\u0010\u0011J\u000f\u0010\u001f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0005H\u0002¢\u0006\u0004\b!\u0010\u0007J\u0017\u0010#\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\bH\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\f2\u0006\u0010%\u001a\u00020\u0005H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b(\u0010\u001cJ\u000f\u0010)\u001a\u00020\fH\u0002¢\u0006\u0004\b)\u0010 J\u000f\u0010*\u001a\u00020\fH\u0002¢\u0006\u0004\b*\u0010 J'\u0010-\u001a\u00020\f2\u0006\u0010+\u001a\u00020\u00052\u0006\u0010,\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\fH\u0017¢\u0006\u0004\b/\u0010 J\u001f\u00100\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b0\u0010\u001aJ\u001f\u00101\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b1\u0010\u001aJ\u0017\u00102\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\bH\u0016¢\u0006\u0004\b2\u0010\u001cJ\u0017\u00104\u001a\u00020\f2\u0006\u00103\u001a\u00020\u0005H\u0016¢\u0006\u0004\b4\u0010'J\u000f\u00105\u001a\u00020\fH\u0016¢\u0006\u0004\b5\u0010 J\u000f\u00106\u001a\u00020\fH\u0016¢\u0006\u0004\b6\u0010 J\u0017\u00107\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\bH\u0016¢\u0006\u0004\b7\u0010\u0011J\u000f\u00108\u001a\u00020\u0005H\u0016¢\u0006\u0004\b8\u0010\u0007J\u000f\u00109\u001a\u00020\u0005H\u0016¢\u0006\u0004\b9\u0010\u0007J\u0015\u0010<\u001a\u00020\f2\u0006\u0010;\u001a\u00020:¢\u0006\u0004\b<\u0010=J\r\u0010>\u001a\u00020\u0005¢\u0006\u0004\b>\u0010\u0007J\u000f\u0010?\u001a\u00020\u0005H\u0016¢\u0006\u0004\b?\u0010\u0007J\u0017\u0010@\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\bH\u0016¢\u0006\u0004\b@\u0010\u0011J\u001f\u0010B\u001a\u00020\f2\u0006\u0010A\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u0005H\u0016¢\u0006\u0004\bB\u0010CR\"\u0010;\u001a\u00020:8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010=R\u001b\u0010I\u001a\u0006\u0012\u0002\b\u00030H8\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u0017\u0010M\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\"\u0010Q\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010\u0011R\"\u0010V\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bV\u0010\u0007\"\u0004\bX\u0010'R$\u0010Z\u001a\u0004\u0018\u00010Y8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R$\u0010a\u001a\u0004\u0018\u00010`8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\"\u0010h\u001a\u00020g8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bh\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR \u0010o\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\f0n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0016\u0010q\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010rR\u0016\u0010s\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010WR\u0016\u0010t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010RR\u0016\u0010u\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010WR\u0014\u0010w\u001a\u00020v8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010xR\u0016\u0010y\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010RR\u0014\u0010{\u001a\u00020z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010|¨\u0006\u0080\u0001"}, d2 = {"Lcom/xiaomi/wearable/connection/RealConnection;", "Lcom/xiaomi/wearable/connection/Connection;", "La33;", "Lcom/xiaomi/wearable/connection/PowerKeeperReceiver$OnPhoneSleepListener;", "Lcom/xiaomi/wearable/connection/ACLReceiver$OnACLReceiver;", "", "connectingExempt", "()Z", "", "scene", "", "delay", "", "connectOnScene", "(IJ)V", "from", "refreshSleepModeIfNeed", "(I)V", "result", "code", "", "message", "reportConnectResult", "(ZILjava/lang/String;)V", "status", "reportConnectAliveDuration", "(ILjava/lang/String;)V", "validErrorCode", "(I)Z", "validConnect", "retryIfNecessary", "resetRetryStrategy", "()V", "isReconnectEnable", "state", "getReadableState", "(I)Ljava/lang/String;", "connected", "recordConnectStateInPreference", "(Z)V", "isConnectionActive", "registerReceivers", "unregisterReceivers", "reset", "needCallback", "connect", "(ZZI)V", "onConnectSuccess", "onDisconnect", "onConnectFailure", "needRetryConnect", "reconnectMonitor", "disconnect", "onBluetoothOpen", "onBluetoothClose", "onStateChanged", "isAppActive", "isWearDevice", "Lcom/xiaomi/wearable/core/DeviceInfo;", "deviceInfo", "update", "(Lcom/xiaomi/wearable/core/DeviceInfo;)V", "inBinding", "needKeepAlive", "onSleepState", "mac", "onReceive", "(Ljava/lang/String;Z)V", "Lcom/xiaomi/wearable/core/DeviceInfo;", "getDeviceInfo", "()Lcom/xiaomi/wearable/core/DeviceInfo;", "setDeviceInfo", "Lcom/xiaomi/wearable/wear/api/WearApiCall;", "apiCall", "Lcom/xiaomi/wearable/wear/api/WearApiCall;", "getApiCall", "()Lcom/xiaomi/wearable/wear/api/WearApiCall;", "TAG", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "mFrom", "I", "getMFrom", "()I", "setMFrom", "isConnecting", "Z", "setConnecting", "Lcom/xiaomi/wearable/connection/RetryStrategy;", "retryStrategy", "Lcom/xiaomi/wearable/connection/RetryStrategy;", "getRetryStrategy", "()Lcom/xiaomi/wearable/connection/RetryStrategy;", "setRetryStrategy", "(Lcom/xiaomi/wearable/connection/RetryStrategy;)V", "Lcom/xiaomi/wearable/connection/ConnectionCallback;", "callback", "Lcom/xiaomi/wearable/connection/ConnectionCallback;", "getCallback", "()Lcom/xiaomi/wearable/connection/ConnectionCallback;", "setCallback", "(Lcom/xiaomi/wearable/connection/ConnectionCallback;)V", "Landroid/os/Handler;", "workHandler", "Landroid/os/Handler;", "getWorkHandler", "()Landroid/os/Handler;", "setWorkHandler", "(Landroid/os/Handler;)V", "Lkotlin/Function1;", "screenReceiver", "Lkotlin/jvm/functions/Function1;", StatConstants.PARAM_START, "J", "mForegroundTrigger", "lastConnectFailureCode", "isAclConnected", "com/xiaomi/wearable/connection/RealConnection$sceneRunnable$1", "sceneRunnable", "Lcom/xiaomi/wearable/connection/RealConnection$sceneRunnable$1;", "connectingReturnTimes", "Ljava/lang/Runnable;", "retryRunnable", "Ljava/lang/Runnable;", "<init>", "(Lcom/xiaomi/wearable/core/DeviceInfo;Lcom/xiaomi/wearable/wear/api/WearApiCall;)V", "Companion", "miwear-core_release"}, k = 1, mv = {2, 0, 0})
public abstract class RealConnection implements Connection, a33, PowerKeeperReceiver.OnPhoneSleepListener, ACLReceiver.OnACLReceiver {
    public static final int FROM_ACL_CONNECT = 6;
    public static final int FROM_MIUI = 3;
    public static final int FROM_MIUI_RECONNECT = 5;
    public static final int FROM_OPEN_BLUETOOTH = 4;
    public static final int FROM_OUTSIDE = 1;
    public static final int FROM_RETRY = 2;
    public static final int FROM_SCREEN_PRESENT = 7;
    public static final int FROM_SLEEP = 8;

    @NotNull
    private final String TAG;

    @NotNull
    private final WearApiCall<?> apiCall;

    @Nullable
    private ConnectionCallback callback;
    private int connectingReturnTimes;

    @NotNull
    private DeviceInfo deviceInfo;
    private volatile boolean isAclConnected;
    private boolean isConnecting;
    private int lastConnectFailureCode;
    private boolean mForegroundTrigger;
    private int mFrom;

    @NotNull
    private final Runnable retryRunnable;

    @Nullable
    private RetryStrategy retryStrategy;

    @NotNull
    private final RealConnection$sceneRunnable$1 sceneRunnable;

    @NotNull
    private final Function1<String, Unit> screenReceiver;
    private long start;
    public Handler workHandler;

    public RealConnection(@NotNull DeviceInfo deviceInfo, @NotNull WearApiCall<?> apiCall) {
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        Intrinsics.checkNotNullParameter(apiCall, "apiCall");
        this.deviceInfo = deviceInfo;
        this.apiCall = apiCall;
        this.TAG = "RealConnection#" + deviceInfo.getDid();
        this.screenReceiver = new Function1() { // from class: xgj
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RealConnection.screenReceiver$lambda$0(this.f39101a, (String) obj);
            }
        };
        this.sceneRunnable = new RealConnection$sceneRunnable$1(this);
        PowerKeeperReceiver.INSTANCE.addPhoneSleepState(this);
        this.retryRunnable = new Runnable() { // from class: ygj
            @Override // java.lang.Runnable
            public final void run() {
                RealConnection.retryRunnable$lambda$5(this.f40160a);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void connect$lambda$1(RealConnection this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.connect();
    }

    private final void connectOnScene(int scene, long delay) {
        if (isConnect() || !isReconnectEnable()) {
            return;
        }
        getWorkHandler().removeCallbacks(this.sceneRunnable);
        this.sceneRunnable.setScene(scene);
        getWorkHandler().postDelayed(this.sceneRunnable, delay);
    }

    private final boolean connectingExempt() {
        return this.connectingReturnTimes >= 10 && System.currentTimeMillis() - this.start >= TimeUnit.MINUTES.toMillis(5L);
    }

    private final String getReadableState(int state) {
        switch (state) {
            case 10:
                return "close bluetooth";
            case 11:
                return "turning on bluetooth";
            case 12:
                return "open bluetooth";
            case 13:
                return "turning off bluetooth";
            default:
                return "unknow";
        }
    }

    private final boolean isConnectionActive(int from) {
        boolean isConnectActive = this.deviceInfo.getIsConnectActive();
        CoreExtKt.getLogger().i(this.TAG, "isAppActive() called with: from = " + from + ", isActive = " + isConnectActive);
        return isConnectActive || from == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isReconnectEnable() {
        return isAppActive() && needKeepAlive() && com.xiaomi.wearable.CoreExtKt.isBluetoothEnabled() && !inBinding() && com.xiaomi.wearable.CoreExtKt.hasPermission();
    }

    private final void recordConnectStateInPreference(boolean connected) {
        String model;
        if (!this.apiCall.isCurrent() || (model = this.deviceInfo.getModel()) == null) {
            return;
        }
        DeviceInfoManager.INSTANCE.setDeviceConnectState(connected, model);
    }

    private final void refreshSleepModeIfNeed(int from) {
        if (from == 1) {
            PowerKeeperReceiver.INSTANCE.refreshSleepMode();
        }
    }

    private final void registerReceivers() {
        ScreenReceiver.INSTANCE.addReceiver(this.screenReceiver);
        ACLReceiver.INSTANCE.addReceiver(this.deviceInfo.getAddress(), this);
        BluetoothManager.INSTANCE.get().addBluetoothStateListener(this);
    }

    private final void reportConnectAliveDuration(final int status, final String message) {
        getWorkHandler().postDelayed(new Runnable() { // from class: ugj
            @Override // java.lang.Runnable
            public final void run() {
                RealConnection.reportConnectAliveDuration$lambda$3(this.f35742a, status, message);
            }
        }, VibrateModeProgressBar.sLongToLong);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void reportConnectAliveDuration$lambda$3(RealConnection this$0, int i, String message) {
        int i2;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(message, "$message");
        String did = this$0.deviceInfo.getDid();
        String model = this$0.deviceInfo.getModel();
        if (model == null) {
            model = "";
        }
        String str = model;
        if (s33.e()) {
            i2 = this$0.isAclConnected ? 1 : 2;
        } else {
            i2 = 3;
        }
        ConnectTrackerKt.endTrackConnectAlive(did, str, i, message, "", i2);
    }

    private final void reportConnectResult(final boolean result, final int code, final String message) {
        getWorkHandler().postDelayed(new Runnable() { // from class: wgj
            @Override // java.lang.Runnable
            public final void run() {
                RealConnection.reportConnectResult$lambda$2(this.f37947a, result, code, message);
            }
        }, VibrateModeProgressBar.sLongToLong);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void reportConnectResult$lambda$2(RealConnection this$0, boolean z, int i, String message) {
        int retryCount;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(message, "$message");
        String model = this$0.deviceInfo.getModel();
        if (model == null) {
            model = "";
        }
        String str = model;
        RetryStrategy retryStrategy = this$0.retryStrategy;
        if (retryStrategy == null) {
            retryCount = 1;
        } else {
            Intrinsics.checkNotNull(retryStrategy);
            retryCount = retryStrategy.getRetryCount() + 1;
        }
        ConnectTrackerKt.trackConnectResult(z, str, "", i, message, retryCount, 0, this$0.mForegroundTrigger, this$0.deviceInfo.getType(), this$0.isAclConnected ? true : ACLReceiver.INSTANCE.getConnectionState(this$0.deviceInfo.getAddress()), this$0.mFrom);
    }

    private final void resetRetryStrategy() {
        CoreExtKt.getLogger().i(this.TAG, "resetRetryStrategy: ");
        getWorkHandler().removeCallbacks(this.retryRunnable);
        RetryStrategy retryStrategy = this.retryStrategy;
        if (retryStrategy != null) {
            retryStrategy.reset();
        }
    }

    private final void retryIfNecessary(int status) {
        CoreExtKt.getLogger().i(this.TAG, "retryIfNecessary() called with: status = " + status);
        RetryStrategy retryStrategy = this.retryStrategy;
        if (retryStrategy != null) {
            if (!needRetryConnect(status) || retryStrategy.overLimit() || !isReconnectEnable()) {
                resetRetryStrategy();
                return;
            }
            long nextBackoff = ((long) retryStrategy.getNextBackoff()) * 1000;
            CoreExtKt.getLogger().i(this.TAG, "retryIfNecessary: retry after " + (nextBackoff / ((long) 1000)) + " second");
            getWorkHandler().postDelayed(this.retryRunnable, nextBackoff);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void retryRunnable$lambda$5(RealConnection this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.isReconnectEnable()) {
            CoreExtKt.getLogger().i(this$0.TAG, "retryRunnable() connect called");
            this$0.connect(false, false, 2);
            ConnectSource.INSTANCE.setFromMainProcess(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit screenReceiver$lambda$0(RealConnection this$0, String event) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(event, "event");
        if (Intrinsics.areEqual(event, "android.intent.action.USER_PRESENT") && !this$0.isConnect()) {
            this$0.connectOnScene(7, 3000L);
        }
        return Unit.INSTANCE;
    }

    private final void unregisterReceivers() {
        ScreenReceiver.INSTANCE.removeReceiver(this.screenReceiver);
        ACLReceiver.INSTANCE.removeReceiver(this.deviceInfo.getAddress());
        BluetoothManager.INSTANCE.get().removeBluetoothStateListener(this);
    }

    private final boolean validConnect() {
        return System.currentTimeMillis() - this.start > 1000;
    }

    private final boolean validErrorCode(int status) {
        return status == 2005 || status == 2011 || status == 2020 || status == 2021 || status == 2007 || status == 2019 || status == 2006;
    }

    @Override // com.xiaomi.wearable.connection.Connection
    public synchronized void connect(boolean reset, boolean needCallback, int from) {
        CoreExtKt.getLogger().i(this.TAG, "connect() called with: reset = " + reset + ", needCallback = " + needCallback + ", from = " + from);
        if (!isAppActive()) {
            CoreExtKt.getLogger().w(this.TAG, "connect: not active app return");
            return;
        }
        if (!isConnectionActive(from)) {
            CoreExtKt.getLogger().i(this.TAG, "connect: not active connection return");
            onConnectFailure(2020, "connection is not active");
            return;
        }
        if (!com.xiaomi.wearable.CoreExtKt.hasPermission()) {
            CoreExtKt.getLogger().w(this.TAG, "no permission connect return");
            onConnectFailure(2021, "connection no permission");
            return;
        }
        registerReceivers();
        if (isConnect()) {
            onConnectSuccess();
            CoreExtKt.getLogger().i(this.TAG, "connect: returned");
            return;
        }
        if (reset) {
            resetRetryStrategy();
        }
        ConnectStateObserver connectStateObserver = ConnectStateObserver.INSTANCE;
        String did = this.deviceInfo.getDid();
        if (did == null) {
            did = "";
        }
        boolean zIsCurrent = this.apiCall.isCurrent();
        String model = this.deviceInfo.getModel();
        if (model == null) {
            model = "";
        }
        connectStateObserver.notifyConnectStart(did, zIsCurrent, model, this.apiCall.getSpecificModel());
        if (this.isConnecting && !connectingExempt()) {
            this.connectingReturnTimes++;
            CoreExtKt.getLogger().i(this.TAG, "connect: connecting returned times: " + this.connectingReturnTimes);
            return;
        }
        refreshSleepModeIfNeed(from);
        this.mFrom = from;
        this.isConnecting = true;
        this.connectingReturnTimes = 0;
        this.start = System.currentTimeMillis();
        CoreExtKt.getLogger().i(this.TAG, "realConnection start, from = " + this.mFrom);
        ConnectTrackerKt.trackConnectStart();
        getWorkHandler().post(new Runnable() { // from class: vgj
            @Override // java.lang.Runnable
            public final void run() {
                RealConnection.connect$lambda$1(this.f36879a);
            }
        });
    }

    @Override // com.xiaomi.wearable.connection.Connection
    public void disconnect(boolean reconnectMonitor) {
        CoreExtKt.getLogger().i(this.TAG, "disconnect: " + this.deviceInfo.getAddress() + ", " + reconnectMonitor);
        resetRetryStrategy();
        if (reconnectMonitor) {
            return;
        }
        unregisterReceivers();
    }

    @NotNull
    public final WearApiCall<?> getApiCall() {
        return this.apiCall;
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

    public final int getMFrom() {
        return this.mFrom;
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

    public final boolean inBinding() {
        return IMiWearCoreImpl.INSTANCE.getInstance().getInBindingMode();
    }

    public boolean isAppActive() {
        return this.deviceInfo.getIsAppActive();
    }

    /* JADX INFO: renamed from: isConnecting, reason: from getter */
    public final boolean getIsConnecting() {
        return this.isConnecting;
    }

    public boolean isWearDevice() {
        return true;
    }

    @Override // com.xiaomi.wearable.connection.Connection
    public boolean needKeepAlive() {
        Logger logger = CoreExtKt.getLogger();
        String str = this.TAG;
        boolean zIsCurrent = this.apiCall.isCurrent();
        PowerKeeperReceiver powerKeeperReceiver = PowerKeeperReceiver.INSTANCE;
        boolean sleepModeState = powerKeeperReceiver.getSleepModeState();
        WearMode.Companion companion = WearMode.INSTANCE;
        logger.i(str, "needKeepAlive() returned: isCurrent = " + zIsCurrent + ", sleepMode " + sleepModeState + ", keepAliveMode = " + companion.keepAliveMode(this.apiCall.wearMode));
        if (powerKeeperReceiver.getSleepModeState()) {
            return false;
        }
        return this.apiCall.isCurrent() || companion.keepAliveMode(this.apiCall.wearMode);
    }

    @Override // com.xiaomi.wearable.connection.Connection
    public boolean needRetryConnect(int status) {
        return (status == 2005 || status == 108 || status == 2008 || status == 2020 || status == 2021) ? false : true;
    }

    @Override // com.xiaomi.wearable.connection.Connection
    public void onBluetoothClose() {
        this.isConnecting = false;
        getWorkHandler().removeCallbacks(this.sceneRunnable);
    }

    @Override // com.xiaomi.wearable.connection.Connection
    public void onBluetoothOpen() {
        CoreExtKt.getLogger().i(this.TAG, "onBluetoothOpen: ");
        if (needKeepAlive()) {
            connectOnScene(4, 1000L);
        }
    }

    public void onConnectFailure(int status, @NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        CoreExtKt.getLogger().i(this.TAG, "onConnectFailure() called with: status = " + status + ", message = " + message + " , cost = " + ((System.currentTimeMillis() - this.start) / 1000.0f));
        this.isConnecting = false;
        if (this.apiCall.isDestroyed()) {
            CoreExtKt.getLogger().i(this.TAG, "onDisconnect: destroyed return");
            return;
        }
        this.lastConnectFailureCode = status;
        getWorkHandler().removeCallbacks(this.sceneRunnable);
        this.apiCall.onConnectFailureInternal(status);
        if (validConnect() || validErrorCode(status)) {
            this.start = System.currentTimeMillis();
            ConnectStateObserver connectStateObserver = ConnectStateObserver.INSTANCE;
            String did = this.deviceInfo.getDid();
            String str = did == null ? "" : did;
            String model = this.deviceInfo.getModel();
            String str2 = model == null ? "" : model;
            RetryStrategy retryStrategy = this.retryStrategy;
            connectStateObserver.notifyConnectFailure(str, status, str2, message, retryStrategy != null ? retryStrategy.getRetryCount() : 0, this.apiCall.isCurrent(), this.apiCall.getSpecificModel());
            recordConnectStateInPreference(false);
            reportConnectResult(false, status, message);
        } else {
            CoreExtKt.getLogger().i(this.TAG, "onConnectFailure: invalid connect");
        }
        retryIfNecessary(status);
    }

    public void onConnectSuccess() {
        CoreExtKt.getLogger().i(this.TAG, "onConnectSuccess() called cost = " + ((System.currentTimeMillis() - this.start) / 1000.0f));
        this.isConnecting = false;
        if (this.apiCall.isDestroyed()) {
            CoreExtKt.getLogger().i(this.TAG, "onConnectSuccess: destroyed return");
            return;
        }
        this.lastConnectFailureCode = 0;
        this.deviceInfo.setConnectActive(true);
        this.apiCall.onConnectSuccessInternal();
        ConnectStateObserver connectStateObserver = ConnectStateObserver.INSTANCE;
        String did = this.deviceInfo.getDid();
        if (did == null) {
            did = "";
        }
        boolean zIsCurrent = this.apiCall.isCurrent();
        String model = this.deviceInfo.getModel();
        if (model == null) {
            model = "";
        }
        connectStateObserver.notifyConnectSuccess(did, zIsCurrent, model, this.apiCall.getSpecificModel());
        reportConnectResult(true, 0, "");
        recordConnectStateInPreference(true);
        ConnectTrackerKt.startTrackConnectAlive(this.deviceInfo.getDid());
        resetRetryStrategy();
    }

    public void onDisconnect(int status, @NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        CoreExtKt.getLogger().i(this.TAG, "onDisconnect() called with: status = " + status + ", message = " + message);
        this.isConnecting = false;
        this.start = System.currentTimeMillis();
        RetryStrategy retryStrategy = this.retryStrategy;
        if (retryStrategy != null) {
            retryStrategy.retryStart();
        }
        getWorkHandler().removeCallbacks(this.sceneRunnable);
        ConnectStateObserver connectStateObserver = ConnectStateObserver.INSTANCE;
        String did = this.deviceInfo.getDid();
        if (did == null) {
            did = "";
        }
        boolean zIsCurrent = this.apiCall.isCurrent();
        String model = this.deviceInfo.getModel();
        connectStateObserver.notifyDisconnect(did, zIsCurrent, model != null ? model : "", this.apiCall.getSpecificModel());
        recordConnectStateInPreference(false);
        reportConnectAliveDuration(status, message);
        retryIfNecessary(status);
    }

    @Override // com.xiaomi.wearable.connection.ACLReceiver.OnACLReceiver
    public void onReceive(@NotNull String mac, boolean connected) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        if (Intrinsics.areEqual(mac, this.deviceInfo.getAddress())) {
            this.isAclConnected = connected;
            CoreExtKt.getLogger().i(this.TAG, "onReceive() called with: mac = " + mac + ", connected = " + connected);
            if (!connected || isConnect()) {
                return;
            }
            connectOnScene(6, 5000L);
        }
    }

    @Override // com.xiaomi.wearable.connection.PowerKeeperReceiver.OnPhoneSleepListener
    public void onSleepState(int state) {
        if (!needKeepAlive() || isConnect()) {
            return;
        }
        if (state == 1) {
            disconnect(true);
        } else {
            if (state != 2) {
                return;
            }
            connectOnScene(8, 3000L);
        }
    }

    @Override // defpackage.a33
    public void onStateChanged(int state) {
        CoreExtKt.getLogger().i(this.TAG, "onStateChanged() called with: state = " + getReadableState(state));
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

    @Override // com.xiaomi.wearable.connection.Connection
    public void setCallback(@Nullable ConnectionCallback connectionCallback) {
        this.callback = connectionCallback;
    }

    public final void setConnecting(boolean z) {
        this.isConnecting = z;
    }

    public final void setDeviceInfo(@NotNull DeviceInfo deviceInfo) {
        Intrinsics.checkNotNullParameter(deviceInfo, "<set-?>");
        this.deviceInfo = deviceInfo;
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

    public final void update(@NotNull DeviceInfo deviceInfo) {
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        CoreExtKt.getLogger().i(this.TAG, "update() called with: deviceInfo = " + deviceInfo);
        this.deviceInfo = deviceInfo;
        this.isConnecting = false;
    }
}

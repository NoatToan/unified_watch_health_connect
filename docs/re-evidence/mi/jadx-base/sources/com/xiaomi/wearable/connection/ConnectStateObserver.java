package com.xiaomi.wearable.connection;

import android.content.IntentFilter;
import android.os.Build;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.passport.utils.LoginPreferenceConfig;
import com.xiaomi.wearable.CoreExtKt;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u000fJ\u000e\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0006J\u000e\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0006J&\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0017J&\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0017J\u000e\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001dJ@\u0010\u001e\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\f2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010 \u001a\u00020\f2\u0006\u0010!\u001a\u00020\u001d2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017J&\u0010\"\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0017J\u0006\u0010#\u001a\u00020\u000fR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/xiaomi/wearable/connection/ConnectStateObserver;", "", "<init>", "()V", "connectResultListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/xiaomi/wearable/connection/IDeviceStateListener;", "receiver", "Lcom/xiaomi/wearable/connection/ConnectionStateChangeReceiver;", "getReceiver", "()Lcom/xiaomi/wearable/connection/ConnectionStateChangeReceiver;", "CONNECT_ACTION", "", "TAG", LoginPreferenceConfig.TYPE_REGISTER, "", "unregister", "addConnectResultListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "removeConnectResultListener", "notifyConnectStart", "did", "currentDevice", "", "model", "specificModel", "notifyConnectSuccess", "notifyConnectType", "connectType", "", "notifyConnectFailure", "errorCode", Constants.EXTRA_ERROR_MESSAGE, "times", "notifyDisconnect", "clearListeners", "miwear-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ConnectStateObserver {

    @NotNull
    private static final String CONNECT_ACTION = "com.xiaomi.wearable.DEVICE_CONNECT_STATE_CHANGE";

    @NotNull
    private static final String TAG = "ConnectStateObserver";

    @NotNull
    public static final ConnectStateObserver INSTANCE = new ConnectStateObserver();

    @NotNull
    private static final CopyOnWriteArrayList<IDeviceStateListener> connectResultListeners = new CopyOnWriteArrayList<>();

    @NotNull
    private static final ConnectionStateChangeReceiver receiver = new ConnectionStateChangeReceiver();

    private ConnectStateObserver() {
    }

    public final void addConnectResultListener(@NotNull IDeviceStateListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (!CoreExtKt.isMainThread()) {
            throw new IllegalThreadStateException("register connect listener must be in main thread");
        }
        CopyOnWriteArrayList<IDeviceStateListener> copyOnWriteArrayList = connectResultListeners;
        if (copyOnWriteArrayList.contains(listener)) {
            return;
        }
        copyOnWriteArrayList.add(listener);
    }

    public final void clearListeners() {
        connectResultListeners.clear();
    }

    @NotNull
    public final ConnectionStateChangeReceiver getReceiver() {
        return receiver;
    }

    public final void notifyConnectFailure(@Nullable String did, int errorCode, @NotNull String model, @NotNull String errorMsg, int times, boolean currentDevice, boolean specificModel) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(errorMsg, "errorMsg");
        CopyOnWriteArrayList<IDeviceStateListener> copyOnWriteArrayList = connectResultListeners;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        Iterator<IDeviceStateListener> it = copyOnWriteArrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            IDeviceStateListener next = it.next();
            if (specificModel) {
                next.onSpecificDeviceConnectFailure(did, model, errorCode);
            } else {
                next.onConnectFailure(did, errorCode, times);
            }
        }
    }

    public final void notifyConnectStart(@NotNull String did, boolean currentDevice, @NotNull String model, boolean specificModel) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(model, "model");
        com.xiaomi.wearable.core.CoreExtKt.getLogger().i(TAG, "notifyConnectStart() called with: did = " + did + ", currentDevice = " + currentDevice + ", model = " + model + ", specificModel = " + specificModel);
        CopyOnWriteArrayList<IDeviceStateListener> copyOnWriteArrayList = connectResultListeners;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        Iterator<IDeviceStateListener> it = copyOnWriteArrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            IDeviceStateListener next = it.next();
            if (specificModel) {
                next.onSpecificDeviceConnectStart(did, model);
            } else {
                next.onConnectStart(did);
            }
        }
    }

    public final void notifyConnectSuccess(@NotNull String did, boolean currentDevice, @NotNull String model, boolean specificModel) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(model, "model");
        com.xiaomi.wearable.core.CoreExtKt.getLogger().i(TAG, "notifyConnectSuccess() called with: did = " + did + ", currentDevice = " + currentDevice + ", model = " + model + ", specificModel = " + specificModel);
        CopyOnWriteArrayList<IDeviceStateListener> copyOnWriteArrayList = connectResultListeners;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        Iterator<IDeviceStateListener> it = copyOnWriteArrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            IDeviceStateListener next = it.next();
            if (specificModel) {
                next.onSpecificDeviceConnectSuccess(did, model);
            } else {
                next.onDeviceFound(did);
                next.onConnectSuccess(did);
            }
        }
    }

    public final void notifyConnectType(int connectType) {
        StringBuilder sb = new StringBuilder();
        sb.append("notifyConnectType() called with: connectType = ");
        sb.append(connectType);
    }

    public final void notifyDisconnect(@NotNull String did, boolean currentDevice, @NotNull String model, boolean specificModel) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(model, "model");
        com.xiaomi.wearable.core.CoreExtKt.getLogger().i(TAG, "notifyDisconnect() called with: did = " + did + ", currentDevice = " + currentDevice + ", model = " + model + ", specificModel = " + specificModel);
        CopyOnWriteArrayList<IDeviceStateListener> copyOnWriteArrayList = connectResultListeners;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        Iterator<IDeviceStateListener> it = copyOnWriteArrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            IDeviceStateListener next = it.next();
            if (specificModel) {
                next.onSpecificDeviceDisconnected(did, model);
            } else {
                next.onDeviceLost(did);
                next.onDisconnect(did);
            }
        }
    }

    public final void register() {
        com.xiaomi.wearable.core.CoreExtKt.getLogger().i(TAG, "register() called app " + CoreExtKt.getContext());
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.xiaomi.wearable.DEVICE_CONNECT_STATE_CHANGE");
            if (Build.VERSION.SDK_INT >= 33) {
                CoreExtKt.getContext().registerReceiver(receiver, intentFilter, 4);
            } else {
                CoreExtKt.getContext().registerReceiver(receiver, intentFilter);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void removeConnectResultListener(@NotNull IDeviceStateListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (!CoreExtKt.isMainThread()) {
            throw new IllegalThreadStateException("unregister connect listener must be in main thread");
        }
        connectResultListeners.remove(listener);
    }

    public final void unregister() {
        try {
            CoreExtKt.getContext().unregisterReceiver(receiver);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

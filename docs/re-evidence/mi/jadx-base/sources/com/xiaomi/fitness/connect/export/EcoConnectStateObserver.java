package com.xiaomi.fitness.connect.export;

import android.content.IntentFilter;
import android.os.Build;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.passport.utils.LoginPreferenceConfig;
import defpackage.yrc;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b+\u0010\u0004J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u0015\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\tJ%\u0010\u0010\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0012\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0011J\u0015\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J?\u0010\u001a\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010\u001c\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u001c\u0010\u0011J\u001d\u0010\u001d\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0013¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0002¢\u0006\u0004\b\u001f\u0010\u0004R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0017\u0010$\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010)¨\u0006,"}, d2 = {"Lcom/xiaomi/fitness/connect/export/EcoConnectStateObserver;", "", "", LoginPreferenceConfig.TYPE_REGISTER, "()V", "unregister", "Lyrc;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addConnectResultListener", "(Lyrc;)V", "removeConnectResultListener", "", "did", "mac", "", "currentDevice", "notifyConnectStart", "(Ljava/lang/String;Ljava/lang/String;Z)V", "notifyConnectSuccess", "", "connectType", "notifyConnectType", "(I)V", "errorCode", Constants.EXTRA_ERROR_MESSAGE, "times", "notifyConnectFailure", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IZ)V", "notifyDisconnect", "notifyBluetoothError", "(Ljava/lang/String;I)V", "clearListeners", "", "connectResultListeners", "Ljava/util/Set;", "Lcom/xiaomi/fitness/connect/export/EcoConnectionStateChangeReceiver;", "receiver", "Lcom/xiaomi/fitness/connect/export/EcoConnectionStateChangeReceiver;", "getReceiver", "()Lcom/xiaomi/fitness/connect/export/EcoConnectionStateChangeReceiver;", "CONNECT_ACTION", "Ljava/lang/String;", "TAG", "<init>", "eco-common-connect_release"}, k = 1, mv = {2, 0, 0})
public final class EcoConnectStateObserver {

    @NotNull
    private static final String CONNECT_ACTION = "com.xiaomi.eco.DEVICE_CONNECT_STATE_CHANGE";

    @NotNull
    private static final String TAG = "EcoConnectStateObserver";

    @NotNull
    public static final EcoConnectStateObserver INSTANCE = new EcoConnectStateObserver();

    @NotNull
    private static final Set<yrc> connectResultListeners = new LinkedHashSet();

    @NotNull
    private static final EcoConnectionStateChangeReceiver receiver = new EcoConnectionStateChangeReceiver();

    private EcoConnectStateObserver() {
    }

    public final void addConnectResultListener(@NotNull yrc listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (!AppUtil.INSTANCE.isMainThread()) {
            throw new IllegalThreadStateException("register connect listener must be in main thread");
        }
        connectResultListeners.add(listener);
    }

    public final void clearListeners() {
        connectResultListeners.clear();
    }

    @NotNull
    public final EcoConnectionStateChangeReceiver getReceiver() {
        return receiver;
    }

    public final void notifyBluetoothError(@NotNull String did, int errorCode) {
        Intrinsics.checkNotNullParameter(did, "did");
        Set<yrc> set = connectResultListeners;
        if (set.isEmpty()) {
            return;
        }
        Iterator<yrc> it = set.iterator();
        while (it.hasNext()) {
            it.next().onBluetoothError(errorCode);
        }
    }

    public final void notifyConnectFailure(@Nullable String did, @NotNull String mac, int errorCode, @NotNull String errorMsg, int times, boolean currentDevice) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(errorMsg, "errorMsg");
        Set<yrc> set = connectResultListeners;
        if (set.isEmpty()) {
            return;
        }
        if (currentDevice) {
            Iterator<yrc> it = set.iterator();
            while (it.hasNext()) {
                it.next().onWearConnectFailure(errorCode, errorMsg, times);
            }
        }
        Iterator<yrc> it2 = connectResultListeners.iterator();
        while (it2.hasNext()) {
            it2.next().onConnectFailure(did, mac, errorCode, times);
        }
    }

    public final void notifyConnectStart(@NotNull String did, @NotNull String mac, boolean currentDevice) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(mac, "mac");
        Set<yrc> set = connectResultListeners;
        if (set.isEmpty()) {
            return;
        }
        if (currentDevice) {
            Iterator<yrc> it = set.iterator();
            while (it.hasNext()) {
                it.next().onWearConnectStart();
            }
        }
        Iterator<yrc> it2 = connectResultListeners.iterator();
        while (it2.hasNext()) {
            it2.next().onConnectStart(did, mac);
        }
    }

    public final void notifyConnectSuccess(@NotNull String did, @NotNull String mac, boolean currentDevice) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(mac, "mac");
        Set<yrc> set = connectResultListeners;
        if (set.isEmpty()) {
            return;
        }
        if (currentDevice) {
            Iterator<yrc> it = set.iterator();
            while (it.hasNext()) {
                it.next().onWearConnectSuccess();
            }
        }
        Iterator<yrc> it2 = connectResultListeners.iterator();
        while (it2.hasNext()) {
            it2.next().onConnectSuccess(did, mac);
        }
    }

    public final void notifyConnectType(int connectType) {
        StringBuilder sb = new StringBuilder();
        sb.append("notifyConnectType() called with: connectType = ");
        sb.append(connectType);
    }

    public final void notifyDisconnect(@NotNull String did, @NotNull String mac, boolean currentDevice) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(mac, "mac");
        Set<yrc> set = connectResultListeners;
        if (set.isEmpty()) {
            return;
        }
        if (currentDevice) {
            Iterator<yrc> it = set.iterator();
            while (it.hasNext()) {
                it.next().onWearDisconnect();
            }
        }
        Iterator<yrc> it2 = connectResultListeners.iterator();
        while (it2.hasNext()) {
            it2.next().onDisconnect(did, mac);
        }
    }

    public final void register() {
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.xiaomi.eco.DEVICE_CONNECT_STATE_CHANGE");
            if (Build.VERSION.SDK_INT >= 33) {
                ApplicationExtKt.getApplication().registerReceiver(receiver, intentFilter, 4);
            } else {
                ApplicationExtKt.getApplication().registerReceiver(receiver, intentFilter);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void removeConnectResultListener(@NotNull yrc listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (!AppUtil.INSTANCE.isMainThread()) {
            throw new IllegalThreadStateException("unregister connect listener must be in main thread");
        }
        connectResultListeners.remove(listener);
    }

    public final void unregister() {
        try {
            ApplicationExtKt.getApplication().unregisterReceiver(receiver);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

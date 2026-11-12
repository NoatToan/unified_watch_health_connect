package com.xiaomi.fit.device.bind;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005J\u000e\u0010\u000f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0005J\u000e\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\bJ\u000e\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fit/device/bind/BindStateObserver;", "", "<init>", "()V", "TAG", "", "mListeners", "", "Lcom/xiaomi/fit/device/bind/IBindResultListener;", "notifyBindSuccess", "", "bindType", "", "mac", "did", "notifyBindFail", "addBindResultListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "removeBindResultListener", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BindStateObserver {

    @NotNull
    private static final String TAG = "BindStateObserver";

    @NotNull
    public static final BindStateObserver INSTANCE = new BindStateObserver();

    @NotNull
    private static final Set<IBindResultListener> mListeners = new LinkedHashSet();

    private BindStateObserver() {
    }

    public final void addBindResultListener(@NotNull IBindResultListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (!AppUtil.INSTANCE.isMainThread()) {
            throw new IllegalThreadStateException("register listener must be in main thread");
        }
        mListeners.add(listener);
    }

    public final void notifyBindFail(@NotNull String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        try {
            Iterator<IBindResultListener> it = mListeners.iterator();
            while (it.hasNext()) {
                it.next().onBindFail(mac);
            }
        } catch (Exception e) {
            e.printStackTrace();
            Logger.e(TAG, "notify listener fail");
        }
    }

    public final void notifyBindSuccess(int bindType, @NotNull String mac, @NotNull String did) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(did, "did");
        try {
            Iterator<IBindResultListener> it = mListeners.iterator();
            while (it.hasNext()) {
                it.next().onBindSuccess(bindType, mac, did);
            }
        } catch (Exception e) {
            e.printStackTrace();
            Logger.e(TAG, "notify listener fail");
        }
    }

    public final void removeBindResultListener(@NotNull IBindResultListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (!AppUtil.INSTANCE.isMainThread()) {
            throw new IllegalThreadStateException("unregister listener must be in main thread");
        }
        mListeners.remove(listener);
    }
}

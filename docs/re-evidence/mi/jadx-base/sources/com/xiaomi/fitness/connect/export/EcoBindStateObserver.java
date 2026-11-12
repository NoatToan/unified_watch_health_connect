package com.xiaomi.fitness.connect.export;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005J\u000e\u0010\u000f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0005J\u000e\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\bJ\u000e\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/connect/export/EcoBindStateObserver;", "", "<init>", "()V", "TAG", "", "mListeners", "", "Lcom/xiaomi/fitness/connect/export/IEcoBindResultListener;", "notifyBindSuccess", "", "bindType", "", "mac", "did", "notifyBindFail", "addBindResultListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "removeBindResultListener", "eco-common-connect_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EcoBindStateObserver {

    @NotNull
    private static final String TAG = "BindStateObserver";

    @NotNull
    public static final EcoBindStateObserver INSTANCE = new EcoBindStateObserver();

    @NotNull
    private static final Set<IEcoBindResultListener> mListeners = new LinkedHashSet();

    private EcoBindStateObserver() {
    }

    public final void addBindResultListener(@NotNull IEcoBindResultListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (!AppUtil.INSTANCE.isMainThread()) {
            throw new IllegalThreadStateException("register listener must be in main thread");
        }
        mListeners.add(listener);
    }

    public final void notifyBindFail(@NotNull String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        try {
            Iterator<IEcoBindResultListener> it = mListeners.iterator();
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
            Iterator<IEcoBindResultListener> it = mListeners.iterator();
            while (it.hasNext()) {
                it.next().onBindSuccess(bindType, mac, did);
            }
        } catch (Exception e) {
            e.printStackTrace();
            Logger.e(TAG, "notify listener fail");
        }
    }

    public final void removeBindResultListener(@NotNull IEcoBindResultListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (!AppUtil.INSTANCE.isMainThread()) {
            throw new IllegalThreadStateException("unregister listener must be in main thread");
        }
        mListeners.remove(listener);
    }
}

package com.huawei.ui.thirdpartservice.syncdata.callback;

import defpackage.xcm;
import health.compact.a.LogUtil;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes20.dex */
public abstract class ReferenceCheckConnectCallback<T> implements RefreshTokenCallback {
    private static final String TAG = "ReferenceCheckConnectCallback";
    private final WeakReference<T> mWeakReference;

    protected abstract void connectResultWhenReferenceNotNull(T t, boolean z, boolean z2);

    public ReferenceCheckConnectCallback(T t) {
        this.mWeakReference = new WeakReference<>(t);
    }

    @Override // com.huawei.ui.thirdpartservice.syncdata.callback.RefreshTokenCallback
    public final void refreshResult(boolean z, boolean z2) {
        T t = this.mWeakReference.get();
        if (!xcm.c(t)) {
            LogUtil.b(TAG, "connectResult skip the result, isRequestValid = ", Boolean.valueOf(z), " isConnected = ", Boolean.valueOf(z2));
        } else {
            connectResultWhenReferenceNotNull(t, z, z2);
        }
    }
}

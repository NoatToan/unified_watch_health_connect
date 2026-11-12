package com.google.android.gms.common.api;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Result;

/* JADX INFO: loaded from: classes14.dex */
public abstract class ResultCallbacks<R extends Result> implements ResultCallback<R> {
    public abstract void onFailure(Status status);

    @Override // com.google.android.gms.common.api.ResultCallback
    @KeepForSdk
    public final void onResult(R r14) {
        Status status = r14.getStatus();
        if (status.isSuccess()) {
            onSuccess(r14);
            return;
        }
        onFailure(status);
        if (r14 instanceof Releasable) {
            try {
                ((Releasable) r14).release();
            } catch (RuntimeException unused) {
                "Unable to release ".concat(String.valueOf(r14));
            }
        }
    }

    public abstract void onSuccess(R r14);
}

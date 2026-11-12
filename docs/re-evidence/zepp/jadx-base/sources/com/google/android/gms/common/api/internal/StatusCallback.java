package com.google.android.gms.common.api.internal;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes3.dex */
@KeepForSdk
public class StatusCallback extends IStatusCallback.Stub {

    @KeepForSdk
    private final BaseImplementation.ResultHolder<Status> b;

    @KeepForSdk
    public StatusCallback(@RecentlyNonNull BaseImplementation.ResultHolder<Status> resultHolder) {
        this.b = resultHolder;
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback
    @KeepForSdk
    public void onResult(@RecentlyNonNull Status status) {
        this.b.setResult(status);
    }
}

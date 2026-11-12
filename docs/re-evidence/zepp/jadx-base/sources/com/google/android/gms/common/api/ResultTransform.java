package com.google.android.gms.common.api;

import androidx.annotation.NonNull;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.zacc;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ResultTransform<R extends Result, S extends Result> {
    @NonNull
    public final PendingResult<S> createFailedResult(@RecentlyNonNull Status status) {
        return new zacc(status);
    }

    @NonNull
    public Status onFailure(@RecentlyNonNull Status status) {
        return status;
    }

    @RecentlyNullable
    @WorkerThread
    public abstract PendingResult<S> onSuccess(@RecentlyNonNull R r);
}

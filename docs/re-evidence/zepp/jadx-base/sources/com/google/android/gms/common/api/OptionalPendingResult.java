package com.google.android.gms.common.api;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.Result;

/* JADX INFO: loaded from: classes3.dex */
public abstract class OptionalPendingResult<R extends Result> extends PendingResult<R> {
    @RecentlyNonNull
    public abstract R get();

    public abstract boolean isDone();
}

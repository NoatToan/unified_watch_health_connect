package com.google.android.gms.common.api;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class BatchResult implements Result {
    private final Status a;
    private final PendingResult<?>[] b;

    public BatchResult(Status status, PendingResult<?>[] pendingResultArr) {
        this.a = status;
        this.b = pendingResultArr;
    }

    @Override // com.google.android.gms.common.api.Result
    @RecentlyNonNull
    public final Status getStatus() {
        return this.a;
    }

    @RecentlyNonNull
    public final <R extends Result> R take(@RecentlyNonNull BatchResultToken<R> batchResultToken) {
        Preconditions.checkArgument(batchResultToken.mId < this.b.length, "The result token does not belong to this batch");
        return (R) this.b[batchResultToken.mId].await(0L, TimeUnit.MILLISECONDS);
    }
}

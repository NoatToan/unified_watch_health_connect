package com.google.android.gms.common.api;

import android.os.Looper;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.OptionalPendingResultImpl;
import com.google.android.gms.common.api.internal.StatusPendingResult;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes14.dex */
public final class PendingResults {
    private PendingResults() {
    }

    public static <R extends Result> PendingResult<R> canceledPendingResult(R r14) {
        Preconditions.checkNotNull(r14, "Result must not be null");
        Preconditions.checkArgument(r14.getStatus().getStatusCode() == 16, "Status code must be CommonStatusCodes.CANCELED");
        zaf zafVar = new zaf(r14);
        zafVar.cancel();
        return zafVar;
    }

    @KeepForSdk
    public static <R extends Result> PendingResult<R> immediateFailedResult(R r14, GoogleApiClient googleApiClient) {
        Preconditions.checkNotNull(r14, "Result must not be null");
        Preconditions.checkArgument(!r14.getStatus().isSuccess(), "Status code must not be SUCCESS");
        zag zagVar = new zag(googleApiClient, r14);
        zagVar.setResult(r14);
        return zagVar;
    }

    public static <R extends Result> OptionalPendingResult<R> immediatePendingResult(R r14) {
        Preconditions.checkNotNull(r14, "Result must not be null");
        zah zahVar = new zah(null);
        zahVar.setResult(r14);
        return new OptionalPendingResultImpl(zahVar);
    }

    @KeepForSdk
    public static <R extends Result> OptionalPendingResult<R> immediatePendingResult(R r14, GoogleApiClient googleApiClient) {
        Preconditions.checkNotNull(r14, "Result must not be null");
        zah zahVar = new zah(googleApiClient);
        zahVar.setResult(r14);
        return new OptionalPendingResultImpl(zahVar);
    }

    public static PendingResult<Status> immediatePendingResult(Status status) {
        Preconditions.checkNotNull(status, "Result must not be null");
        StatusPendingResult statusPendingResult = new StatusPendingResult(Looper.getMainLooper());
        statusPendingResult.setResult(status);
        return statusPendingResult;
    }

    @KeepForSdk
    public static PendingResult<Status> immediatePendingResult(Status status, GoogleApiClient googleApiClient) {
        Preconditions.checkNotNull(status, "Result must not be null");
        StatusPendingResult statusPendingResult = new StatusPendingResult(googleApiClient);
        statusPendingResult.setResult(status);
        return statusPendingResult;
    }

    public static PendingResult<Status> canceledPendingResult() {
        StatusPendingResult statusPendingResult = new StatusPendingResult(Looper.getMainLooper());
        statusPendingResult.cancel();
        return statusPendingResult;
    }
}

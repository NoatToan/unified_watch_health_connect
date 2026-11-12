package com.google.android.gms.common.api;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class Batch extends BasePendingResult<BatchResult> {
    private int q;
    private boolean r;
    private boolean s;
    private final PendingResult<?>[] t;
    private final Object u;

    public static final class Builder {
        private List<PendingResult<?>> a = new ArrayList();
        private GoogleApiClient b;

        public Builder(@RecentlyNonNull GoogleApiClient googleApiClient) {
            this.b = googleApiClient;
        }

        @RecentlyNonNull
        public final <R extends Result> BatchResultToken<R> add(@RecentlyNonNull PendingResult<R> pendingResult) {
            BatchResultToken<R> batchResultToken = new BatchResultToken<>(this.a.size());
            this.a.add(pendingResult);
            return batchResultToken;
        }

        @RecentlyNonNull
        public final Batch build() {
            return new Batch(this.a, this.b, null);
        }
    }

    private Batch(List<PendingResult<?>> list, GoogleApiClient googleApiClient) {
        super(googleApiClient);
        this.u = new Object();
        int size = list.size();
        this.q = size;
        PendingResult<?>[] pendingResultArr = new PendingResult[size];
        this.t = pendingResultArr;
        if (list.isEmpty()) {
            setResult(new BatchResult(Status.RESULT_SUCCESS, pendingResultArr));
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            PendingResult<?> pendingResult = list.get(i);
            this.t[i] = pendingResult;
            pendingResult.addStatusListener(new b(this));
        }
    }

    public static /* synthetic */ boolean g(Batch batch, boolean z) {
        batch.s = true;
        return true;
    }

    public static /* synthetic */ int h(Batch batch) {
        int i = batch.q;
        batch.q = i - 1;
        return i;
    }

    public static /* synthetic */ boolean i(Batch batch, boolean z) {
        batch.r = true;
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult, com.google.android.gms.common.api.PendingResult
    public final void cancel() {
        super.cancel();
        for (PendingResult<?> pendingResult : this.t) {
            pendingResult.cancel();
        }
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    @RecentlyNonNull
    public final BatchResult createFailedResult(@RecentlyNonNull Status status) {
        return new BatchResult(status, this.t);
    }

    public /* synthetic */ Batch(List list, GoogleApiClient googleApiClient, b bVar) {
        this(list, googleApiClient);
    }
}

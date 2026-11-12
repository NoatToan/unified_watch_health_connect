package com.google.android.gms.common.api;

/* JADX INFO: loaded from: classes3.dex */
final class b implements PendingResult.StatusListener {
    private final /* synthetic */ Batch a;

    public b(Batch batch) {
        this.a = batch;
    }

    @Override // com.google.android.gms.common.api.PendingResult.StatusListener
    public final void onComplete(Status status) {
        synchronized (this.a.u) {
            if (this.a.isCanceled()) {
                return;
            }
            if (status.isCanceled()) {
                Batch.g(this.a, true);
            } else if (!status.isSuccess()) {
                Batch.i(this.a, true);
            }
            Batch.h(this.a);
            if (this.a.q == 0) {
                if (this.a.s) {
                    super/*com.google.android.gms.common.api.internal.BasePendingResult*/.cancel();
                } else {
                    Status status2 = this.a.r ? new Status(13) : Status.RESULT_SUCCESS;
                    Batch batch = this.a;
                    batch.setResult(new BatchResult(status2, batch.t));
                }
            }
        }
    }
}

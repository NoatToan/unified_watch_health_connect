package com.google.common.util.concurrent;

import com.google.common.collect.ImmutableList;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53604a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f53605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f53606c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f53607d;

    public /* synthetic */ h(AggregateFuture aggregateFuture, int i14, ListenableFuture listenableFuture) {
        this.f53606c = aggregateFuture;
        this.f53605b = i14;
        this.f53607d = listenableFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f53604a) {
            case 0:
                ((AggregateFuture) this.f53606c).lambda$init$0(this.f53605b, (ListenableFuture) this.f53607d);
                break;
            default:
                Futures.InCompletionOrderState.access$600((Futures.InCompletionOrderState) this.f53606c, (ImmutableList) this.f53607d, this.f53605b);
                break;
        }
    }

    public /* synthetic */ h(Futures.InCompletionOrderState inCompletionOrderState, ImmutableList immutableList, int i14) {
        this.f53606c = inCompletionOrderState;
        this.f53607d = immutableList;
        this.f53605b = i14;
    }
}

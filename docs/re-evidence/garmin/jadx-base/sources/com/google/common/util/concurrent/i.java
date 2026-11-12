package com.google.common.util.concurrent;

import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableCollection;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f53609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f53610c;

    public /* synthetic */ i(int i14, Object obj, Object obj2) {
        this.f53608a = i14;
        this.f53609b = obj;
        this.f53610c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f53608a) {
            case 0:
                ((AggregateFuture) this.f53609b).lambda$init$1((ImmutableCollection) this.f53610c);
                break;
            default:
                Callables.lambda$threadRenaming$3((Supplier) this.f53609b, (Runnable) this.f53610c);
                break;
        }
    }
}

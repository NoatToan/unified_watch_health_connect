package com.google.android.play.core.integrity;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes14.dex */
final class bf extends bm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f53331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f53332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ bn f53333c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bf(bn bnVar, TaskCompletionSource taskCompletionSource, int i14, long j8, TaskCompletionSource taskCompletionSource2) {
        super(bnVar, taskCompletionSource);
        this.f53331a = j8;
        this.f53332b = taskCompletionSource2;
        this.f53333c = bnVar;
    }

    @Override // com.google.android.play.integrity.internal.t
    public final void b() {
        if (bn.l(this.f53333c)) {
            a(new StandardIntegrityException(-2, null));
            return;
        }
        if (bn.k(this.f53333c, 0)) {
            a(new StandardIntegrityException(-14, null));
            return;
        }
        try {
            bn bnVar = this.f53333c;
            ((com.google.android.play.integrity.internal.i) bnVar.f53353a.e()).e(bn.b(bnVar, this.f53331a, 0), new bl(this.f53333c, this.f53332b));
        } catch (RemoteException e4) {
            this.f53333c.f53354b.c(e4, "warmUpIntegrityToken(%s)", Long.valueOf(this.f53331a));
            this.f53332b.trySetException(new StandardIntegrityException(-100, e4));
        }
    }
}

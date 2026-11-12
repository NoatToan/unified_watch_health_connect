package com.google.android.play.core.integrity;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes14.dex */
final class bg extends bm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ StandardIntegrityManager.StandardIntegrityTokenRequest f53334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f53335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f53336c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f53337d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ bn f53338e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bg(bn bnVar, TaskCompletionSource taskCompletionSource, int i14, StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest, long j8, long j14, TaskCompletionSource taskCompletionSource2) {
        super(bnVar, taskCompletionSource);
        this.f53334a = standardIntegrityTokenRequest;
        this.f53335b = j8;
        this.f53336c = j14;
        this.f53337d = taskCompletionSource2;
        this.f53338e = bnVar;
    }

    @Override // com.google.android.play.integrity.internal.t
    public final void b() {
        if (bn.l(this.f53338e)) {
            a(new StandardIntegrityException(-2, null));
            return;
        }
        if (bn.k(this.f53338e, 0)) {
            a(new StandardIntegrityException(-14, null));
            return;
        }
        try {
            bn bnVar = this.f53338e;
            ((com.google.android.play.integrity.internal.i) bnVar.f53353a.e()).d(bn.a(bnVar, this.f53334a, this.f53335b, this.f53336c, 0), new bk(this.f53338e, this.f53337d, this.f53335b));
        } catch (RemoteException e4) {
            this.f53338e.f53354b.c(e4, "requestExpressIntegrityToken(%s, %s, %s)", this.f53334a.requestHash(), this.f53334a.verdictOptOut(), Long.valueOf(this.f53335b));
            this.f53337d.trySetException(new StandardIntegrityException(-100, e4));
        }
    }
}

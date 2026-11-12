package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes14.dex */
final class bh extends bm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Bundle f53339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Activity f53340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f53341c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f53342d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ bn f53343e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bh(bn bnVar, TaskCompletionSource taskCompletionSource, Bundle bundle, Activity activity, TaskCompletionSource taskCompletionSource2, int i14) {
        super(bnVar, taskCompletionSource);
        this.f53339a = bundle;
        this.f53340b = activity;
        this.f53341c = taskCompletionSource2;
        this.f53342d = i14;
        this.f53343e = bnVar;
    }

    @Override // com.google.android.play.integrity.internal.t
    public final void b() {
        if (bn.l(this.f53343e)) {
            a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            bn bnVar = this.f53343e;
            com.google.android.play.integrity.internal.ae aeVar = bnVar.f53353a;
            ((com.google.android.play.integrity.internal.i) aeVar.e()).c(this.f53339a, bnVar.f53357e.a(this.f53340b, this.f53341c, aeVar));
        } catch (RemoteException e4) {
            this.f53343e.f53354b.c(e4, "requestAndShowDialog(%s)", Integer.valueOf(this.f53342d));
            this.f53341c.trySetException(new StandardIntegrityException(-100, e4));
        }
    }
}

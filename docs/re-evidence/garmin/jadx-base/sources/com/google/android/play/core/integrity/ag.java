package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes14.dex */
final class ag extends com.google.android.play.integrity.internal.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Bundle f53282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Activity f53283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f53284c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f53285d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ aj f53286e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag(aj ajVar, TaskCompletionSource taskCompletionSource, Bundle bundle, Activity activity, TaskCompletionSource taskCompletionSource2, int i14) {
        super(taskCompletionSource);
        this.f53282a = bundle;
        this.f53283b = activity;
        this.f53284c = taskCompletionSource2;
        this.f53285d = i14;
        this.f53286e = ajVar;
    }

    @Override // com.google.android.play.integrity.internal.t
    public final void b() {
        try {
            com.google.android.play.integrity.internal.n nVar = (com.google.android.play.integrity.internal.n) this.f53286e.f53291a.e();
            Bundle bundle = this.f53282a;
            aj ajVar = this.f53286e;
            nVar.c(bundle, ajVar.f53295e.a(this.f53283b, this.f53284c, ajVar.f53291a));
        } catch (RemoteException e4) {
            this.f53286e.f53292b.c(e4, "requestAndShowDialog(%s)", Integer.valueOf(this.f53285d));
            this.f53284c.trySetException(new IntegrityServiceException(-100, e4));
        }
    }
}

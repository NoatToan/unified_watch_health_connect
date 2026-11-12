package com.google.android.play.core.integrity;

import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes14.dex */
final class af extends com.google.android.play.integrity.internal.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ byte[] f53276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Long f53277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Parcelable f53278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f53279d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ IntegrityTokenRequest f53280e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ aj f53281f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af(aj ajVar, TaskCompletionSource taskCompletionSource, byte[] bArr, Long l14, Parcelable parcelable, TaskCompletionSource taskCompletionSource2, IntegrityTokenRequest integrityTokenRequest) {
        super(taskCompletionSource);
        this.f53276a = bArr;
        this.f53277b = l14;
        this.f53278c = parcelable;
        this.f53279d = taskCompletionSource2;
        this.f53280e = integrityTokenRequest;
        this.f53281f = ajVar;
    }

    @Override // com.google.android.play.integrity.internal.t
    public final void a(Exception exc) {
        if (exc instanceof com.google.android.play.integrity.internal.af) {
            super.a(new IntegrityServiceException(-9, exc));
        } else {
            super.a(exc);
        }
    }

    @Override // com.google.android.play.integrity.internal.t
    public final void b() {
        try {
            ((com.google.android.play.integrity.internal.n) this.f53281f.f53291a.e()).d(aj.a(this.f53281f, this.f53276a, this.f53277b, this.f53278c), new ai(this.f53281f, this.f53279d));
        } catch (RemoteException e4) {
            this.f53281f.f53292b.c(e4, "requestIntegrityToken(%s)", this.f53280e);
            this.f53279d.trySetException(new IntegrityServiceException(-100, e4));
        }
    }
}

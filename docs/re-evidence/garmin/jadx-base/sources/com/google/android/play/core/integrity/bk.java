package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes14.dex */
final class bk extends bi {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ bn f53347c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.s f53348d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f53349e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bk(bn bnVar, TaskCompletionSource taskCompletionSource, long j8) {
        super(bnVar, taskCompletionSource);
        this.f53347c = bnVar;
        this.f53348d = new com.google.android.play.integrity.internal.s("OnRequestIntegrityTokenCallback");
        this.f53349e = j8;
    }

    @Override // com.google.android.play.core.integrity.bi, com.google.android.play.integrity.internal.k
    public final void c(Bundle bundle) {
        super.c(bundle);
        this.f53348d.d("onRequestExpressIntegrityToken", new Object[0]);
        ApiException apiExceptionA = this.f53347c.f53358f.a(bundle);
        if (apiExceptionA != null) {
            this.f53344a.trySetException(apiExceptionA);
            return;
        }
        bj bjVar = new bj(this, this.f53347c.f53355c, bundle.getLong("request.token.sid"));
        TaskCompletionSource taskCompletionSource = this.f53344a;
        b bVar = new b();
        bVar.b(bundle.getString("token"));
        bVar.a(bjVar);
        taskCompletionSource.trySetResult(bVar.c());
    }
}

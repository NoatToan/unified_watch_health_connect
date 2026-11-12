package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes14.dex */
final class ai extends com.google.android.play.integrity.internal.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ aj f53288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.s f53289b = new com.google.android.play.integrity.internal.s("OnRequestIntegrityTokenCallback");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TaskCompletionSource f53290c;

    public ai(aj ajVar, TaskCompletionSource taskCompletionSource) {
        this.f53288a = ajVar;
        this.f53290c = taskCompletionSource;
    }

    @Override // com.google.android.play.integrity.internal.p
    public final void b(Bundle bundle) {
        this.f53288a.f53291a.v(this.f53290c);
        this.f53289b.d("onRequestIntegrityToken", new Object[0]);
        ApiException apiExceptionA = this.f53288a.f53296f.a(bundle);
        if (apiExceptionA != null) {
            this.f53290c.trySetException(apiExceptionA);
            return;
        }
        String string = bundle.getString("token");
        if (string == null) {
            this.f53290c.trySetException(new IntegrityServiceException(-100, null));
            return;
        }
        ah ahVar = new ah(this, this.f53288a.f53293c, bundle.getLong("request.token.sid"));
        TaskCompletionSource taskCompletionSource = this.f53290c;
        a aVar = new a();
        aVar.b(string);
        aVar.a(ahVar);
        taskCompletionSource.trySetResult(aVar.c());
    }
}

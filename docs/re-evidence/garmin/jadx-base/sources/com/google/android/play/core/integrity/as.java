package com.google.android.play.core.integrity;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;

/* JADX INFO: loaded from: classes14.dex */
final class as extends com.google.android.play.integrity.internal.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final TaskCompletionSource f53309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final com.google.android.play.integrity.internal.ae f53310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.s f53311c = new com.google.android.play.integrity.internal.s("RequestDialogCallbackImpl");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f53312d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final k f53313e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Activity f53314f;

    public as(Context context, k kVar, Activity activity, TaskCompletionSource taskCompletionSource, com.google.android.play.integrity.internal.ae aeVar) {
        this.f53312d = context.getPackageName();
        this.f53313e = kVar;
        this.f53309a = taskCompletionSource;
        this.f53314f = activity;
        this.f53310b = aeVar;
    }

    @Override // com.google.android.play.integrity.internal.r
    public final void b(Bundle bundle) {
        this.f53310b.v(this.f53309a);
        this.f53311c.d("onRequestDialog(%s)", this.f53312d);
        ApiException apiExceptionA = this.f53313e.a(bundle);
        if (apiExceptionA != null) {
            this.f53309a.trySetException(apiExceptionA);
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("dialog.intent");
        if (pendingIntent == null) {
            this.f53311c.b("onRequestDialog(%s): got null dialog intent", this.f53312d);
            this.f53309a.trySetResult(0);
            return;
        }
        Intent intent = new Intent(this.f53314f, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", pendingIntent);
        intent.setFlags(536870912);
        intent.putExtra("result_receiver", new ar(this, this.f53310b.c()));
        this.f53311c.a("Starting dialog intent...", new Object[0]);
        this.f53314f.startActivityForResult(intent, 0);
    }
}

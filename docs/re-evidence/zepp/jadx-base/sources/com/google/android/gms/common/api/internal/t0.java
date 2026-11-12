package com.google.android.gms.common.api.internal;

import androidx.annotation.WorkerThread;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes3.dex */
final class t0 implements Runnable {
    private final /* synthetic */ Result a;
    private final /* synthetic */ zacn b;

    public t0(zacn zacnVar, Result result) {
        this.b = zacnVar;
        this.a = result;
    }

    @Override // java.lang.Runnable
    @WorkerThread
    public final void run() {
        try {
            try {
                ThreadLocal<Boolean> threadLocal = BasePendingResult.p;
                threadLocal.set(Boolean.TRUE);
                this.b.h.sendMessage(this.b.h.obtainMessage(0, ((ResultTransform) Preconditions.checkNotNull(this.b.a)).onSuccess(this.a)));
                threadLocal.set(Boolean.FALSE);
                zacn zacnVar = this.b;
                zacn.c(this.a);
                GoogleApiClient googleApiClient = (GoogleApiClient) this.b.g.get();
                if (googleApiClient != null) {
                    googleApiClient.zab(this.b);
                }
            } catch (RuntimeException e) {
                this.b.h.sendMessage(this.b.h.obtainMessage(1, e));
                BasePendingResult.p.set(Boolean.FALSE);
                zacn zacnVar2 = this.b;
                zacn.c(this.a);
                GoogleApiClient googleApiClient2 = (GoogleApiClient) this.b.g.get();
                if (googleApiClient2 != null) {
                    googleApiClient2.zab(this.b);
                }
            }
        } catch (Throwable th) {
            BasePendingResult.p.set(Boolean.FALSE);
            zacn zacnVar3 = this.b;
            zacn.c(this.a);
            GoogleApiClient googleApiClient3 = (GoogleApiClient) this.b.g.get();
            if (googleApiClient3 != null) {
                googleApiClient3.zab(this.b);
            }
            throw th;
        }
    }
}

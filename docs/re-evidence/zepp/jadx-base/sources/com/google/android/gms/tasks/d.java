package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
final class d implements e {
    private final CountDownLatch a = new CountDownLatch(1);

    private d() {
    }

    public final void a() throws InterruptedException {
        this.a.await();
    }

    public final boolean b(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.a.await(j, timeUnit);
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public final void onCanceled() {
        this.a.countDown();
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(@NonNull Exception exc) {
        this.a.countDown();
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        this.a.countDown();
    }

    public /* synthetic */ d(zzac zzacVar) {
    }
}

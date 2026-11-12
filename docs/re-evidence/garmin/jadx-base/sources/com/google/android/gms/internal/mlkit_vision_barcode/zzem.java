package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.room.a0;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes14.dex */
final class zzem implements zzet {
    private static final zzes zza = new zzes(zzem.class);
    private final Object zzb;

    public zzem(Object obj) {
        this.zzb = obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z14) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j8, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.zzb;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        return com.nimbusds.jose.shaded.gson.internal.a.h(super.toString(), "[status=SUCCESS, result=[", this.zzb.toString(), "]]");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzet
    public final void zzl(Runnable runnable, Executor executor) {
        zzaz.zzc(executor, "Executor was null.");
        try {
            runnable.run();
        } catch (Exception e4) {
            zza.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.ImmediateFuture", "addListener", a0.j("RuntimeException while executing runnable ", runnable.toString(), " with executor ", String.valueOf(executor)), (Throwable) e4);
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.zzb;
    }
}

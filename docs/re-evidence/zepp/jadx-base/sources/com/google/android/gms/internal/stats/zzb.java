package com.google.android.gms.internal.stats;

import androidx.annotation.Nullable;
import java.io.Closeable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzb implements Closeable {
    private static final zzb a = new zzb(false, null);

    private zzb(boolean z, @Nullable zzd zzdVar) {
    }

    public static zzb zza(boolean z, @Nullable zzc zzcVar) {
        return a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}

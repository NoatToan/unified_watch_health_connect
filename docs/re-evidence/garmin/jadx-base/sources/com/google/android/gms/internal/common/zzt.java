package com.google.android.gms.internal.common;

import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
final class zzt implements Iterable {
    final /* synthetic */ CharSequence zza;
    final /* synthetic */ zzw zzb;

    public zzt(zzw zzwVar, CharSequence charSequence) {
        this.zza = charSequence;
        Objects.requireNonNull(zzwVar);
        this.zzb = zzwVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.zzb.zze(this.zza);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append('[');
        Iterator it = iterator();
        try {
            if (it.hasNext()) {
                sb3.append(zzq.zza(it.next(), ", "));
                while (it.hasNext()) {
                    sb3.append((CharSequence) ", ");
                    sb3.append(zzq.zza(it.next(), ", "));
                }
            }
            sb3.append(']');
            return sb3.toString();
        } catch (IOException e4) {
            h.q(e4);
            return null;
        }
    }
}

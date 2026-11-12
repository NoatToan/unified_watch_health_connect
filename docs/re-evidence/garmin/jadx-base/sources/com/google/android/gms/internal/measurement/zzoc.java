package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
final class zzoc implements Iterator {
    final /* synthetic */ zzoe zza;
    private int zzb;
    private boolean zzc;
    private Iterator zzd;

    public /* synthetic */ zzoc(zzoe zzoeVar, byte[] bArr) {
        Objects.requireNonNull(zzoeVar);
        this.zza = zzoeVar;
        this.zzb = -1;
    }

    private final Iterator zza() {
        if (this.zzd == null) {
            this.zzd = this.zza.zzk().entrySet().iterator();
        }
        return this.zzd;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i14 = this.zzb + 1;
        zzoe zzoeVar = this.zza;
        if (i14 >= zzoeVar.zzj()) {
            return !zzoeVar.zzk().isEmpty() && zza().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.zzc = true;
        int i14 = this.zzb + 1;
        this.zzb = i14;
        zzoe zzoeVar = this.zza;
        return i14 < zzoeVar.zzj() ? (zzob) zzoeVar.zzi()[i14] : (Map.Entry) zza().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.zzc) {
            h.z("remove() was called before next()");
            return;
        }
        this.zzc = false;
        zzoe zzoeVar = this.zza;
        zzoeVar.zzh();
        int i14 = this.zzb;
        if (i14 >= zzoeVar.zzj()) {
            zza().remove();
        } else {
            this.zzb = i14 - 1;
            zzoeVar.zzg(i14);
        }
    }
}

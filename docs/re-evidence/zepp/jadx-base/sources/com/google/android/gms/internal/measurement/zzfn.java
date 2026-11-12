package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfn extends zzjt<zzfo, zzfn> implements zzld {
    private zzfn() {
        super(zzfo.zza);
    }

    public final int zza() {
        return ((zzfo) this.zza).zzb();
    }

    public final long zzb() {
        return ((zzfo) this.zza).zzc();
    }

    public final long zzc() {
        return ((zzfo) this.zza).zzd();
    }

    public final zzfn zzd(Iterable<? extends zzfs> iterable) {
        if (this.zzb) {
            zzaE();
            this.zzb = false;
        }
        zzfo.h((zzfo) this.zza, iterable);
        return this;
    }

    public final zzfn zze(zzfr zzfrVar) {
        if (this.zzb) {
            zzaE();
            this.zzb = false;
        }
        zzfo.g((zzfo) this.zza, zzfrVar.zzaA());
        return this;
    }

    public final zzfn zzf(zzfs zzfsVar) {
        if (this.zzb) {
            zzaE();
            this.zzb = false;
        }
        zzfo.g((zzfo) this.zza, zzfsVar);
        return this;
    }

    public final zzfn zzg() {
        if (this.zzb) {
            zzaE();
            this.zzb = false;
        }
        ((zzfo) this.zza).zzf = zzjx.zzbA();
        return this;
    }

    public final zzfn zzh(int i) {
        if (this.zzb) {
            zzaE();
            this.zzb = false;
        }
        zzfo.j((zzfo) this.zza, i);
        return this;
    }

    public final zzfn zzi(String str) {
        if (this.zzb) {
            zzaE();
            this.zzb = false;
        }
        zzfo.k((zzfo) this.zza, str);
        return this;
    }

    public final zzfn zzj(int i, zzfr zzfrVar) {
        if (this.zzb) {
            zzaE();
            this.zzb = false;
        }
        zzfo.f((zzfo) this.zza, i, zzfrVar.zzaA());
        return this;
    }

    public final zzfn zzk(int i, zzfs zzfsVar) {
        if (this.zzb) {
            zzaE();
            this.zzb = false;
        }
        zzfo.f((zzfo) this.zza, i, zzfsVar);
        return this;
    }

    public final zzfn zzl(long j) {
        if (this.zzb) {
            zzaE();
            this.zzb = false;
        }
        zzfo.m((zzfo) this.zza, j);
        return this;
    }

    public final zzfn zzm(long j) {
        if (this.zzb) {
            zzaE();
            this.zzb = false;
        }
        zzfo.l((zzfo) this.zza, j);
        return this;
    }

    public final zzfs zzn(int i) {
        return ((zzfo) this.zza).zzg(i);
    }

    public final String zzo() {
        return ((zzfo) this.zza).zzh();
    }

    public final List<zzfs> zzp() {
        return Collections.unmodifiableList(((zzfo) this.zza).zzi());
    }

    public final boolean zzq() {
        return ((zzfo) this.zza).zzu();
    }

    public /* synthetic */ zzfn(i1 i1Var) {
        super(zzfo.zza);
    }
}

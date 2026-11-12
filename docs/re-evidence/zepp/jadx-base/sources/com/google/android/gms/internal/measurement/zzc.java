package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzc {
    public final zzf a;
    public zzg b;
    public final zzab c;
    private final zzz d;

    public zzc() {
        zzf zzfVar = new zzf();
        this.a = zzfVar;
        this.b = zzfVar.b.zza();
        this.c = new zzab();
        this.d = new zzz();
        zzfVar.d.zza("internal.registerCallback", new Callable() { // from class: com.google.android.gms.internal.measurement.zza
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.a();
            }
        });
        zzfVar.d.zza("internal.eventLogger", new Callable() { // from class: com.google.android.gms.internal.measurement.zzb
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzk(this.zza.c);
            }
        });
    }

    public final /* synthetic */ zzai a() throws Exception {
        return new zzv(this.d);
    }

    public final zzab zza() {
        return this.c;
    }

    public final void zzc(zzgo zzgoVar) throws zzd {
        zzai zzaiVar;
        try {
            this.b = this.a.b.zza();
            if (this.a.zza(this.b, (zzgt[]) zzgoVar.zzc().toArray(new zzgt[0])) instanceof zzag) {
                throw new IllegalStateException("Program loading failed");
            }
            for (zzgm zzgmVar : zzgoVar.zza().zzd()) {
                List<zzgt> listZzc = zzgmVar.zzc();
                String strZzb = zzgmVar.zzb();
                Iterator<zzgt> it2 = listZzc.iterator();
                while (it2.hasNext()) {
                    zzap zzapVarZza = this.a.zza(this.b, it2.next());
                    if (!(zzapVarZza instanceof zzam)) {
                        throw new IllegalArgumentException("Invalid rule definition");
                    }
                    zzg zzgVar = this.b;
                    if (zzgVar.zzh(strZzb)) {
                        zzap zzapVarZzd = zzgVar.zzd(strZzb);
                        if (!(zzapVarZzd instanceof zzai)) {
                            String strValueOf = String.valueOf(strZzb);
                            throw new IllegalStateException(strValueOf.length() != 0 ? "Invalid function name: ".concat(strValueOf) : new String("Invalid function name: "));
                        }
                        zzaiVar = (zzai) zzapVarZzd;
                    } else {
                        zzaiVar = null;
                    }
                    if (zzaiVar == null) {
                        String strValueOf2 = String.valueOf(strZzb);
                        throw new IllegalStateException(strValueOf2.length() != 0 ? "Rule function is undefined: ".concat(strValueOf2) : new String("Rule function is undefined: "));
                    }
                    zzaiVar.zza(this.b, Collections.singletonList(zzapVarZza));
                }
            }
        } catch (Throwable th) {
            throw new zzd(th);
        }
    }

    public final void zzd(String str, Callable<? extends zzai> callable) {
        this.a.d.zza(str, callable);
    }

    public final boolean zze(zzaa zzaaVar) throws zzd {
        try {
            this.c.zzd(zzaaVar);
            this.a.c.zzg("runtime.counter", new zzah(Double.valueOf(0.0d)));
            this.d.zzb(this.b.zza(), this.c);
            return zzg() || zzf();
        } catch (Throwable th) {
            throw new zzd(th);
        }
    }

    public final boolean zzf() {
        return !this.c.zzc().isEmpty();
    }

    public final boolean zzg() {
        return !this.c.zzb().equals(this.c.zza());
    }
}

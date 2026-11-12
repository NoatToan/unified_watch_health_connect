package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfo extends zzjx<zzfo, zzfn> implements zzld {
    private static final zzfo zza;
    private int zze;
    private zzke<zzfs> zzf = zzjx.zzbA();
    private String zzg = "";
    private long zzh;
    private long zzi;
    private int zzj;

    static {
        zzfo zzfoVar = new zzfo();
        zza = zzfoVar;
        zzjx.zzbG(zzfo.class, zzfoVar);
    }

    private zzfo() {
    }

    public static /* synthetic */ void f(zzfo zzfoVar, int i, zzfs zzfsVar) {
        zzfsVar.getClass();
        zzfoVar.n();
        zzfoVar.zzf.set(i, zzfsVar);
    }

    public static /* synthetic */ void g(zzfo zzfoVar, zzfs zzfsVar) {
        zzfsVar.getClass();
        zzfoVar.n();
        zzfoVar.zzf.add(zzfsVar);
    }

    public static /* synthetic */ void h(zzfo zzfoVar, Iterable iterable) {
        zzfoVar.n();
        zzih.zzbq(iterable, zzfoVar.zzf);
    }

    public static /* synthetic */ void j(zzfo zzfoVar, int i) {
        zzfoVar.n();
        zzfoVar.zzf.remove(i);
    }

    public static /* synthetic */ void k(zzfo zzfoVar, String str) {
        str.getClass();
        zzfoVar.zze |= 1;
        zzfoVar.zzg = str;
    }

    public static /* synthetic */ void l(zzfo zzfoVar, long j) {
        zzfoVar.zze |= 2;
        zzfoVar.zzh = j;
    }

    public static /* synthetic */ void m(zzfo zzfoVar, long j) {
        zzfoVar.zze |= 4;
        zzfoVar.zzi = j;
    }

    private final void n() {
        zzke<zzfs> zzkeVar = this.zzf;
        if (zzkeVar.zzc()) {
            return;
        }
        this.zzf = zzjx.zzbB(zzkeVar);
    }

    public static zzfn zze() {
        return zza.zzbu();
    }

    public final int zza() {
        return this.zzj;
    }

    public final int zzb() {
        return this.zzf.size();
    }

    public final long zzc() {
        return this.zzi;
    }

    public final long zzd() {
        return this.zzh;
    }

    public final zzfs zzg(int i) {
        return this.zzf.get(i);
    }

    public final String zzh() {
        return this.zzg;
    }

    public final List<zzfs> zzi() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.zzjx
    public final Object zzl(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzjx.zzbF(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zze", "zzf", zzfs.class, "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new zzfo();
        }
        i1 i1Var = null;
        if (i2 == 4) {
            return new zzfn(i1Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final boolean zzs() {
        return (this.zze & 8) != 0;
    }

    public final boolean zzt() {
        return (this.zze & 4) != 0;
    }

    public final boolean zzu() {
        return (this.zze & 2) != 0;
    }
}

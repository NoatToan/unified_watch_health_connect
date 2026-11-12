package com.google.android.gms.internal.fitness;

/* JADX INFO: loaded from: classes3.dex */
public class zzhp {
    private static final zzgp d = zzgp.zzbf();
    private zzfx a;
    private volatile zzik b;
    private volatile zzfx c;

    private final zzik a(zzik zzikVar) {
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    try {
                        this.b = zzikVar;
                        this.c = zzfx.zzub;
                    } catch (zzhk unused) {
                        this.b = zzikVar;
                        this.c = zzfx.zzub;
                    }
                }
            }
        }
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzhp)) {
            return false;
        }
        zzhp zzhpVar = (zzhp) obj;
        zzik zzikVar = this.b;
        zzik zzikVar2 = zzhpVar.b;
        if (zzikVar == null && zzikVar2 == null) {
            return zzam().equals(zzhpVar.zzam());
        }
        if (zzikVar == null || zzikVar2 == null) {
            return zzikVar != null ? zzikVar.equals(zzhpVar.a(zzikVar.zzbu())) : a(zzikVar2.zzbu()).equals(zzikVar2);
        }
        return zzikVar.equals(zzikVar2);
    }

    public int hashCode() {
        return 1;
    }

    public final zzfx zzam() {
        if (this.c != null) {
            return this.c;
        }
        synchronized (this) {
            if (this.c != null) {
                return this.c;
            }
            if (this.b == null) {
                this.c = zzfx.zzub;
            } else {
                this.c = this.b.zzam();
            }
            return this.c;
        }
    }

    public final int zzbp() {
        if (this.c != null) {
            return this.c.size();
        }
        if (this.b != null) {
            return this.b.zzbp();
        }
        return 0;
    }

    public final zzik zzh(zzik zzikVar) {
        zzik zzikVar2 = this.b;
        this.a = null;
        this.c = null;
        this.b = zzikVar;
        return zzikVar2;
    }
}

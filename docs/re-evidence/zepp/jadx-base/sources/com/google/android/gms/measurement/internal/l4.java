package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzes;
import com.google.android.gms.internal.measurement.zzgh;
import com.google.android.gms.internal.measurement.zzoa;

/* JADX INFO: loaded from: classes3.dex */
final class l4 extends k4 {
    private final zzes g;
    public final /* synthetic */ m4 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4(m4 m4Var, String str, int i, zzes zzesVar) {
        super(str, i);
        this.h = m4Var;
        this.g = zzesVar;
    }

    @Override // com.google.android.gms.measurement.internal.k4
    public final int a() {
        return this.g.zza();
    }

    @Override // com.google.android.gms.measurement.internal.k4
    public final boolean b() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.k4
    public final boolean c() {
        return true;
    }

    public final boolean k(Long l, Long l2, zzgh zzghVar, boolean z) {
        zzoa.zzc();
        boolean zZzs = this.h.zzs.zzf().zzs(this.a, zzdy.zzW);
        boolean zZzg = this.g.zzg();
        boolean zZzh = this.g.zzh();
        boolean zZzi = this.g.zzi();
        boolean z2 = zZzg || zZzh || zZzi;
        Boolean boolJ = null;
        boolJ = null;
        boolJ = null;
        boolJ = null;
        boolJ = null;
        if (z && !z2) {
            this.h.zzs.zzay().zzj().zzc("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.b), this.g.zzj() ? Integer.valueOf(this.g.zza()) : null);
            return true;
        }
        com.google.android.gms.internal.measurement.zzel zzelVarZzb = this.g.zzb();
        boolean zZzg2 = zzelVarZzb.zzg();
        if (zzghVar.zzr()) {
            if (zzelVarZzb.zzi()) {
                boolJ = k4.j(k4.h(zzghVar.zzb(), zzelVarZzb.zzc()), zZzg2);
            } else {
                this.h.zzs.zzay().zzk().zzb("No number filter for long property. property", this.h.zzs.zzj().zzf(zzghVar.zzf()));
            }
        } else if (zzghVar.zzq()) {
            if (zzelVarZzb.zzi()) {
                boolJ = k4.j(k4.g(zzghVar.zza(), zzelVarZzb.zzc()), zZzg2);
            } else {
                this.h.zzs.zzay().zzk().zzb("No number filter for double property. property", this.h.zzs.zzj().zzf(zzghVar.zzf()));
            }
        } else if (!zzghVar.zzt()) {
            this.h.zzs.zzay().zzk().zzb("User property has no value, property", this.h.zzs.zzj().zzf(zzghVar.zzf()));
        } else if (zzelVarZzb.zzk()) {
            boolJ = k4.j(k4.f(zzghVar.zzg(), zzelVarZzb.zzd(), this.h.zzs.zzay()), zZzg2);
        } else if (!zzelVarZzb.zzi()) {
            this.h.zzs.zzay().zzk().zzb("No string or number filter defined. property", this.h.zzs.zzj().zzf(zzghVar.zzf()));
        } else if (zzku.E(zzghVar.zzg())) {
            boolJ = k4.j(k4.i(zzghVar.zzg(), zzelVarZzb.zzc()), zZzg2);
        } else {
            this.h.zzs.zzay().zzk().zzc("Invalid user property value for Numeric number filter. property, value", this.h.zzs.zzj().zzf(zzghVar.zzf()), zzghVar.zzg());
        }
        this.h.zzs.zzay().zzj().zzb("Property filter result", boolJ == null ? "null" : boolJ);
        if (boolJ == null) {
            return false;
        }
        this.c = Boolean.TRUE;
        if (zZzi && !boolJ.booleanValue()) {
            return true;
        }
        if (!z || this.g.zzg()) {
            this.d = boolJ;
        }
        if (boolJ.booleanValue() && z2 && zzghVar.zzs()) {
            long jZzc = zzghVar.zzc();
            if (l != null) {
                jZzc = l.longValue();
            }
            if (zZzs && this.g.zzg() && !this.g.zzh() && l2 != null) {
                jZzc = l2.longValue();
            }
            if (this.g.zzh()) {
                this.f = Long.valueOf(jZzc);
            } else {
                this.e = Long.valueOf(jZzc);
            }
        }
        return true;
    }
}

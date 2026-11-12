package com.google.android.gms.internal.wearable;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzi extends zzn<zzi> {
    private static volatile zzi[] zzgb;
    public int type = 1;
    public zzj zzgc = null;

    public static zzi[] zzi() {
        if (zzgb == null) {
            synchronized (zzr.zzhk) {
                if (zzgb == null) {
                    zzgb = new zzi[0];
                }
            }
        }
        return zzgb;
    }

    public zzi() {
        this.zzhc = null;
        this.zzhl = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzi)) {
            return false;
        }
        zzi zziVar = (zzi) obj;
        if (this.type != zziVar.type) {
            return false;
        }
        zzj zzjVar = this.zzgc;
        if (zzjVar == null) {
            if (zziVar.zzgc != null) {
                return false;
            }
        } else if (!zzjVar.equals(zziVar.zzgc)) {
            return false;
        }
        if (this.zzhc == null || this.zzhc.isEmpty()) {
            return zziVar.zzhc == null || zziVar.zzhc.isEmpty();
        }
        return this.zzhc.equals(zziVar.zzhc);
    }

    public final int hashCode() {
        int iHashCode = getClass().getName().hashCode();
        int i = this.type;
        zzj zzjVar = this.zzgc;
        int iHashCode2 = 0;
        int iHashCode3 = zzjVar == null ? 0 : zzjVar.hashCode();
        if (this.zzhc != null && !this.zzhc.isEmpty()) {
            iHashCode2 = this.zzhc.hashCode();
        }
        return ((((((iHashCode + 527) * 31) + i) * 31) + iHashCode3) * 31) + iHashCode2;
    }

    @Override // com.google.android.gms.internal.wearable.zzn, com.google.android.gms.internal.wearable.zzt
    public final void zza(zzl zzlVar) throws IOException {
        zzlVar.zzd(1, this.type);
        zzj zzjVar = this.zzgc;
        if (zzjVar != null) {
            zzlVar.zza(2, zzjVar);
        }
        super.zza(zzlVar);
    }

    @Override // com.google.android.gms.internal.wearable.zzn, com.google.android.gms.internal.wearable.zzt
    protected final int zzg() {
        int iZzg = super.zzg() + zzl.zze(1, this.type);
        zzj zzjVar = this.zzgc;
        return zzjVar != null ? iZzg + zzl.zzb(2, zzjVar) : iZzg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.wearable.zzt
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzi zza(zzk zzkVar) throws IOException {
        while (true) {
            int iZzj = zzkVar.zzj();
            if (iZzj == 0) {
                break;
            }
            if (iZzj == 8) {
                int position = zzkVar.getPosition();
                try {
                    int iZzk = zzkVar.zzk();
                    if (iZzk <= 0 || iZzk > 15) {
                        StringBuilder sb = new StringBuilder(36);
                        sb.append(iZzk);
                        sb.append(" is not a valid enum Type");
                        throw new IllegalArgumentException(sb.toString());
                    }
                    this.type = iZzk;
                } catch (IllegalArgumentException unused) {
                    zzkVar.zzg(position);
                    zza(zzkVar, iZzj);
                }
            } else if (iZzj != 18) {
                if (!super.zza(zzkVar, iZzj)) {
                    break;
                }
            } else {
                if (this.zzgc == null) {
                    this.zzgc = new zzj();
                }
                zzkVar.zza(this.zzgc);
            }
        }
        return this;
    }
}

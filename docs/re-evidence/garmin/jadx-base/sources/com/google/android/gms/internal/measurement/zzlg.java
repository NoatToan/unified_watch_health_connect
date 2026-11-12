package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes14.dex */
class zzlg extends zzlf {
    protected final byte[] zza;

    public zzlg(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzlh
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzlh) || zzc() != ((zzlh) obj).zzc()) {
            return false;
        }
        if (zzc() == 0) {
            return true;
        }
        if (!(obj instanceof zzlg)) {
            return obj.equals(this);
        }
        zzlg zzlgVar = (zzlg) obj;
        int iZzi = zzi();
        int iZzi2 = zzlgVar.zzi();
        if (iZzi != 0 && iZzi2 != 0 && iZzi != iZzi2) {
            return false;
        }
        int iZzc = zzc();
        if (iZzc > zzlgVar.zzc()) {
            int iZzc2 = zzc();
            StringBuilder sb3 = new StringBuilder(String.valueOf(iZzc).length() + 18 + String.valueOf(iZzc2).length());
            sb3.append("Length too large: ");
            sb3.append(iZzc);
            sb3.append(iZzc2);
            throw new IllegalArgumentException(sb3.toString());
        }
        if (iZzc > zzlgVar.zzc()) {
            int iZzc3 = zzlgVar.zzc();
            StringBuilder sb4 = new StringBuilder(String.valueOf(iZzc).length() + 27 + String.valueOf(iZzc3).length());
            sb4.append("Ran off end of other: 0, ");
            sb4.append(iZzc);
            sb4.append(", ");
            sb4.append(iZzc3);
            throw new IllegalArgumentException(sb4.toString());
        }
        byte[] bArr = this.zza;
        byte[] bArr2 = zzlgVar.zza;
        zzlgVar.zzd();
        int i14 = 0;
        int i15 = 0;
        while (i14 < iZzc) {
            if (bArr[i14] != bArr2[i15]) {
                return false;
            }
            i14++;
            i15++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzlh
    public byte zza(int i14) {
        return this.zza[i14];
    }

    @Override // com.google.android.gms.internal.measurement.zzlh
    public byte zzb(int i14) {
        return this.zza[i14];
    }

    @Override // com.google.android.gms.internal.measurement.zzlh
    public int zzc() {
        return this.zza.length;
    }

    public int zzd() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzlh
    public final zzlh zze(int i14, int i15) {
        int iZzj = zzlh.zzj(0, i15, zzc());
        return iZzj == 0 ? zzlh.zzb : new zzlc(this.zza, 0, iZzj);
    }

    @Override // com.google.android.gms.internal.measurement.zzlh
    public final void zzf(zzkz zzkzVar) {
        ((zzlk) zzkzVar).zzv(this.zza, 0, zzc());
    }

    @Override // com.google.android.gms.internal.measurement.zzlh
    public final int zzg(int i14, int i15, int i16) {
        return zzmp.zzc(i14, this.zza, 0, i16);
    }
}

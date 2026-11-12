package com.google.android.gms.internal.measurement;

import j20.x;

/* JADX INFO: loaded from: classes14.dex */
final class zzlc extends zzlg {
    private final int zzc;

    public zzlc(byte[] bArr, int i14, int i15) {
        super(bArr);
        zzlh.zzj(0, i15, bArr.length);
        this.zzc = i15;
    }

    @Override // com.google.android.gms.internal.measurement.zzlg, com.google.android.gms.internal.measurement.zzlh
    public final byte zza(int i14) {
        int i15 = this.zzc;
        if (((i15 - (i14 + 1)) | i14) >= 0) {
            return ((zzlg) this).zza[i14];
        }
        if (i14 < 0) {
            throw new ArrayIndexOutOfBoundsException(x.e(new StringBuilder(String.valueOf(i14).length() + 11), i14, "Index < 0: "));
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(i14).length() + 18 + String.valueOf(i15).length());
        sb3.append("Index > length: ");
        sb3.append(i14);
        sb3.append(", ");
        sb3.append(i15);
        throw new ArrayIndexOutOfBoundsException(sb3.toString());
    }

    @Override // com.google.android.gms.internal.measurement.zzlg, com.google.android.gms.internal.measurement.zzlh
    public final byte zzb(int i14) {
        return ((zzlg) this).zza[i14];
    }

    @Override // com.google.android.gms.internal.measurement.zzlg, com.google.android.gms.internal.measurement.zzlh
    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzlg
    public final int zzd() {
        return 0;
    }
}

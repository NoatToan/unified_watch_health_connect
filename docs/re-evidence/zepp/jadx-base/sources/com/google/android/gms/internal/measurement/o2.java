package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
class o2 extends n2 {
    public final byte[] d;

    public o2(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.d = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzix
    public byte a(int i) {
        return this.d[i];
    }

    @Override // com.google.android.gms.internal.measurement.zzix
    public final void b(zzin zzinVar) throws IOException {
        ((t2) zzinVar).e(this.d, 0, zzd());
    }

    public int e() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzix
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzix) || zzd() != ((zzix) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof o2)) {
            return obj.equals(this);
        }
        o2 o2Var = (o2) obj;
        int iZzk = zzk();
        int iZzk2 = o2Var.zzk();
        if (iZzk != 0 && iZzk2 != 0 && iZzk != iZzk2) {
            return false;
        }
        int iZzd = zzd();
        if (iZzd > o2Var.zzd()) {
            int iZzd2 = zzd();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(iZzd);
            sb.append(iZzd2);
            throw new IllegalArgumentException(sb.toString());
        }
        if (iZzd > o2Var.zzd()) {
            int iZzd3 = o2Var.zzd();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(iZzd);
            sb2.append(", ");
            sb2.append(iZzd3);
            throw new IllegalArgumentException(sb2.toString());
        }
        byte[] bArr = this.d;
        byte[] bArr2 = o2Var.d;
        o2Var.e();
        int i = 0;
        int i2 = 0;
        while (i < iZzd) {
            if (bArr[i] != bArr2[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzix
    public byte zza(int i) {
        return this.d[i];
    }

    @Override // com.google.android.gms.internal.measurement.zzix
    public int zzd() {
        return this.d.length;
    }

    @Override // com.google.android.gms.internal.measurement.zzix
    public final int zze(int i, int i2, int i3) {
        return zzkf.a(i, this.d, 0, i3);
    }

    @Override // com.google.android.gms.internal.measurement.zzix
    public final zzix zzf(int i, int i2) {
        int iC = zzix.c(0, i2, zzd());
        return iC == 0 ? zzix.zzb : new m2(this.d, 0, iC);
    }

    @Override // com.google.android.gms.internal.measurement.zzix
    public final String zzg(Charset charset) {
        return new String(this.d, 0, zzd(), charset);
    }

    @Override // com.google.android.gms.internal.measurement.zzix
    public final boolean zzi() {
        return b5.f(this.d, 0, zzd());
    }
}

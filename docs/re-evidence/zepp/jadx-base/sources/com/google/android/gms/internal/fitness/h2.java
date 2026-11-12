package com.google.android.gms.internal.fitness;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
class h2 extends e2 {
    public final byte[] d;

    public h2(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.d = bArr;
    }

    @Override // com.google.android.gms.internal.fitness.zzfx
    public final void b(zzfu zzfuVar) throws IOException {
        zzfuVar.zza(this.d, i(), size());
    }

    @Override // com.google.android.gms.internal.fitness.zzfx
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzfx) || size() != ((zzfx) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof h2)) {
            return obj.equals(this);
        }
        h2 h2Var = (h2) obj;
        int iZzax = zzax();
        int iZzax2 = h2Var.zzax();
        if (iZzax == 0 || iZzax2 == 0 || iZzax == iZzax2) {
            return h(h2Var, 0, size());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.fitness.zzfx
    public byte f(int i) {
        return this.d[i];
    }

    @Override // com.google.android.gms.internal.fitness.e2
    public final boolean h(zzfx zzfxVar, int i, int i2) {
        if (i2 > zzfxVar.size()) {
            int size = size();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(size);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i2 > zzfxVar.size()) {
            int size2 = zzfxVar.size();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(size2);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (!(zzfxVar instanceof h2)) {
            return zzfxVar.zzd(0, i2).equals(zzd(0, i2));
        }
        h2 h2Var = (h2) zzfxVar;
        byte[] bArr = this.d;
        byte[] bArr2 = h2Var.d;
        int i3 = i() + i2;
        int i4 = i();
        int i5 = h2Var.i();
        while (i4 < i3) {
            if (bArr[i4] != bArr2[i5]) {
                return false;
            }
            i4++;
            i5++;
        }
        return true;
    }

    public int i() {
        return 0;
    }

    @Override // com.google.android.gms.internal.fitness.zzfx
    public int size() {
        return this.d.length;
    }

    @Override // com.google.android.gms.internal.fitness.zzfx
    public final String zza(Charset charset) {
        return new String(this.d, i(), size(), charset);
    }

    @Override // com.google.android.gms.internal.fitness.zzfx
    public final boolean zzaw() {
        int i = i();
        return u4.f(this.d, i, size() + i);
    }

    @Override // com.google.android.gms.internal.fitness.zzfx
    public final int zzb(int i, int i2, int i3) {
        return zzhc.b(i, this.d, i(), i3);
    }

    @Override // com.google.android.gms.internal.fitness.zzfx
    public final zzfx zzd(int i, int i2) {
        int iE = zzfx.e(0, i2, size());
        return iE == 0 ? zzfx.zzub : new b2(this.d, i(), iE);
    }

    @Override // com.google.android.gms.internal.fitness.zzfx
    public byte zzj(int i) {
        return this.d[i];
    }
}

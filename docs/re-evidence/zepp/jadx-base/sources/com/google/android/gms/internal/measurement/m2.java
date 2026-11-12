package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
final class m2 extends o2 {
    private final int e;

    public m2(byte[] bArr, int i, int i2) {
        super(bArr);
        zzix.c(0, i2, bArr.length);
        this.e = i2;
    }

    @Override // com.google.android.gms.internal.measurement.o2, com.google.android.gms.internal.measurement.zzix
    public final byte a(int i) {
        return this.d[i];
    }

    @Override // com.google.android.gms.internal.measurement.o2
    public final int e() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.o2, com.google.android.gms.internal.measurement.zzix
    public final byte zza(int i) {
        int i2 = this.e;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.d[i];
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(22);
            sb.append("Index < 0: ");
            sb.append(i);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Index > length: ");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(i2);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    @Override // com.google.android.gms.internal.measurement.o2, com.google.android.gms.internal.measurement.zzix
    public final int zzd() {
        return this.e;
    }
}

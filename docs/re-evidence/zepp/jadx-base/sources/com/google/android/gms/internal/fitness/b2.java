package com.google.android.gms.internal.fitness;

/* JADX INFO: loaded from: classes3.dex */
final class b2 extends h2 {
    private final int e;
    private final int f;

    public b2(byte[] bArr, int i, int i2) {
        super(bArr);
        zzfx.e(i, i + i2, bArr.length);
        this.e = i;
        this.f = i2;
    }

    @Override // com.google.android.gms.internal.fitness.h2, com.google.android.gms.internal.fitness.zzfx
    public final byte f(int i) {
        return this.d[this.e + i];
    }

    @Override // com.google.android.gms.internal.fitness.h2
    public final int i() {
        return this.e;
    }

    @Override // com.google.android.gms.internal.fitness.h2, com.google.android.gms.internal.fitness.zzfx
    public final int size() {
        return this.f;
    }

    @Override // com.google.android.gms.internal.fitness.h2, com.google.android.gms.internal.fitness.zzfx
    public final byte zzj(int i) {
        int size = size();
        if (((size - (i + 1)) | i) >= 0) {
            return this.d[this.e + i];
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
        sb2.append(size);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }
}

package com.google.android.gms.internal.fitness;

/* JADX INFO: loaded from: classes3.dex */
final class j2 extends zzgj {
    private final byte[] d;
    private final boolean e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;

    private j2(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.j = Integer.MAX_VALUE;
        this.d = bArr;
        this.f = i2 + i;
        this.h = i;
        this.i = i;
        this.e = z;
    }

    @Override // com.google.android.gms.internal.fitness.zzgj
    public final int zzbb() {
        return this.h - this.i;
    }

    @Override // com.google.android.gms.internal.fitness.zzgj
    public final int zzm(int i) throws zzhk {
        if (i < 0) {
            throw new zzhk("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int iZzbb = i + zzbb();
        int i2 = this.j;
        if (iZzbb > i2) {
            throw new zzhk("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.j = iZzbb;
        int i3 = this.f + this.g;
        this.f = i3;
        int i4 = i3 - this.i;
        if (i4 > iZzbb) {
            int i5 = i4 - iZzbb;
            this.g = i5;
            this.f = i3 - i5;
        } else {
            this.g = 0;
        }
        return i2;
    }
}

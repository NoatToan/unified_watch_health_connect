package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
final class r2 extends zzja {
    private final byte[] b;
    private int c;
    private int d;
    private int e;

    public /* synthetic */ r2(byte[] bArr, int i, int i2, boolean z, q2 q2Var) {
        super(null);
        this.e = Integer.MAX_VALUE;
        this.b = bArr;
        this.c = 0;
    }

    public final int a(int i) throws zzkh {
        int i2 = this.e;
        this.e = 0;
        int i3 = this.c + this.d;
        this.c = i3;
        if (i3 > 0) {
            this.d = i3;
            this.c = 0;
        } else {
            this.d = 0;
        }
        return i2;
    }
}

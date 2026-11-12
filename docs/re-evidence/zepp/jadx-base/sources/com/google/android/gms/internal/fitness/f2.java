package com.google.android.gms.internal.fitness;

/* JADX INFO: loaded from: classes3.dex */
final class f2 {
    private final zzgk a;
    private final byte[] b;

    private f2(int i) {
        byte[] bArr = new byte[i];
        this.b = bArr;
        this.a = zzgk.zza(bArr);
    }

    public final zzfx a() {
        if (this.a.zzbc() == 0) {
            return new h2(this.b);
        }
        throw new IllegalStateException("Did not write as much data as expected.");
    }

    public final zzgk b() {
        return this.a;
    }

    public /* synthetic */ f2(int i, x1 x1Var) {
        this(i);
    }
}

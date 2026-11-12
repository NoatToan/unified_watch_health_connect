package com.google.android.gms.internal.fitness;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzgj {
    private int a;
    private int b;
    private boolean c;

    private zzgj() {
        this.a = 100;
        this.b = Integer.MAX_VALUE;
        this.c = false;
    }

    public static zzgj a(byte[] bArr, int i, int i2, boolean z) {
        j2 j2Var = new j2(bArr, i2);
        try {
            j2Var.zzm(i2);
            return j2Var;
        } catch (zzhk e) {
            throw new IllegalArgumentException(e);
        }
    }

    public abstract int zzbb();

    public abstract int zzm(int i) throws zzhk;
}

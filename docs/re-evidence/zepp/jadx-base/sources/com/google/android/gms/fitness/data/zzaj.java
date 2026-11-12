package com.google.android.gms.fitness.data;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaj {
    private final double a;
    private final double b;

    private zzaj(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public final boolean zza(double d) {
        return d >= this.a && d <= this.b;
    }
}

package com.google.android.gms.internal.fitness;

import java.util.List;

/* JADX INFO: Add missing generic type declarations: [E] */
/* JADX INFO: loaded from: classes3.dex */
final class p1<E> extends zzfc<E> {
    private final transient int c;
    private final transient int d;
    private final /* synthetic */ zzfc e;

    public p1(zzfc zzfcVar, int i, int i2) {
        this.e = zzfcVar;
        this.c = i;
        this.d = i2;
    }

    @Override // com.google.android.gms.internal.fitness.zzfd
    public final Object[] a() {
        return this.e.a();
    }

    @Override // com.google.android.gms.internal.fitness.zzfd
    public final int b() {
        return this.e.b() + this.c;
    }

    @Override // com.google.android.gms.internal.fitness.zzfd
    public final int c() {
        return this.e.b() + this.c + this.d;
    }

    @Override // com.google.android.gms.internal.fitness.zzfd
    public final boolean e() {
        return true;
    }

    @Override // java.util.List
    public final E get(int i) {
        zzez.zza(i, this.d);
        return this.e.get(i + this.c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    @Override // com.google.android.gms.internal.fitness.zzfc, java.util.List
    public final /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // com.google.android.gms.internal.fitness.zzfc
    /* JADX INFO: renamed from: zzc */
    public final zzfc<E> subList(int i, int i2) {
        zzez.zza(i, i2, this.d);
        zzfc zzfcVar = this.e;
        int i3 = this.c;
        return (zzfc) zzfcVar.subList(i + i3, i2 + i3);
    }
}

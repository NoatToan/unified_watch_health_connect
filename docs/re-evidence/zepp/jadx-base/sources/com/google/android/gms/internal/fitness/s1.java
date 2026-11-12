package com.google.android.gms.internal.fitness;

/* JADX INFO: loaded from: classes3.dex */
final class s1<E> extends zzfc<E> {
    public static final zzfc<Object> e = new s1(new Object[0], 0);
    private final transient Object[] c;
    private final transient int d;

    public s1(Object[] objArr, int i) {
        this.c = objArr;
        this.d = i;
    }

    @Override // com.google.android.gms.internal.fitness.zzfd
    public final Object[] a() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.fitness.zzfd
    public final int b() {
        return 0;
    }

    @Override // com.google.android.gms.internal.fitness.zzfd
    public final int c() {
        return this.d;
    }

    @Override // com.google.android.gms.internal.fitness.zzfd
    public final boolean e() {
        return false;
    }

    @Override // com.google.android.gms.internal.fitness.zzfc, com.google.android.gms.internal.fitness.zzfd
    public final int f(Object[] objArr, int i) {
        System.arraycopy(this.c, 0, objArr, 0, this.d);
        return this.d + 0;
    }

    @Override // java.util.List
    public final E get(int i) {
        zzez.zza(i, this.d);
        return (E) this.c[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}

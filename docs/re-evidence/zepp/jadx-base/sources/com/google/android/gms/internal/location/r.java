package com.google.android.gms.internal.location;

/* JADX INFO: loaded from: classes3.dex */
final class r<E> extends zzbs<E> {
    public static final zzbs<Object> e = new r(new Object[0], 0);
    public final transient Object[] c;
    private final transient int d;

    public r(Object[] objArr, int i) {
        this.c = objArr;
        this.d = i;
    }

    @Override // com.google.android.gms.internal.location.zzbp
    public final Object[] a() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.location.zzbp
    public final int b() {
        return 0;
    }

    @Override // com.google.android.gms.internal.location.zzbp
    public final int c() {
        return this.d;
    }

    @Override // com.google.android.gms.internal.location.zzbp
    public final boolean e() {
        return false;
    }

    @Override // com.google.android.gms.internal.location.zzbs, com.google.android.gms.internal.location.zzbp
    public final int f(Object[] objArr, int i) {
        System.arraycopy(this.c, 0, objArr, 0, this.d);
        return this.d;
    }

    @Override // java.util.List
    public final E get(int i) {
        zzbm.zza(i, this.d, "index");
        return (E) this.c[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}

package com.google.android.gms.internal.common;

/* JADX INFO: loaded from: classes3.dex */
final class d<E> extends zzag<E> {
    public static final zzag<Object> e = new d(new Object[0], 0);
    public final transient Object[] c;
    private final transient int d;

    public d(Object[] objArr, int i) {
        this.c = objArr;
        this.d = i;
    }

    @Override // com.google.android.gms.internal.common.zzag, com.google.android.gms.internal.common.zzac
    public final int a(Object[] objArr, int i) {
        System.arraycopy(this.c, 0, objArr, 0, this.d);
        return this.d;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final int b() {
        return this.d;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final int c() {
        return 0;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final boolean e() {
        return false;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final Object[] f() {
        return this.c;
    }

    @Override // java.util.List
    public final E get(int i) {
        zzs.zza(i, this.d, "index");
        E e2 = (E) this.c[i];
        e2.getClass();
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}

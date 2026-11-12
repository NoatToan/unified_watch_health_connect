package com.google.android.gms.internal.fitness;

import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
final class t1<E> extends zzfh<E> {
    public static final t1<Object> h = new t1<>(new Object[0], 0, null, 0, 0);
    private final transient Object[] c;
    private final transient Object[] d;
    private final transient int e;
    private final transient int f;
    private final transient int g;

    public t1(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.c = objArr;
        this.d = objArr2;
        this.e = i2;
        this.f = i;
        this.g = i3;
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
        return this.g;
    }

    @Override // com.google.android.gms.internal.fitness.zzfd, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@NullableDecl Object obj) {
        Object[] objArr = this.d;
        if (obj == null || objArr == null) {
            return false;
        }
        int iA = n1.a(obj.hashCode());
        while (true) {
            int i = iA & this.e;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iA = i + 1;
        }
    }

    @Override // com.google.android.gms.internal.fitness.zzfd
    public final boolean e() {
        return false;
    }

    @Override // com.google.android.gms.internal.fitness.zzfd
    public final int f(Object[] objArr, int i) {
        System.arraycopy(this.c, 0, objArr, 0, this.g);
        return this.g + 0;
    }

    @Override // com.google.android.gms.internal.fitness.zzfh
    public final boolean g() {
        return true;
    }

    @Override // com.google.android.gms.internal.fitness.zzfh
    public final zzfc<E> h() {
        return zzfc.h(this.c, this.g);
    }

    @Override // com.google.android.gms.internal.fitness.zzfh, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f;
    }

    @Override // com.google.android.gms.internal.fitness.zzfh, com.google.android.gms.internal.fitness.zzfd, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.g;
    }

    @Override // com.google.android.gms.internal.fitness.zzfd
    /* JADX INFO: renamed from: zzae */
    public final zzfm<E> iterator() {
        return (zzfm) zzaf().iterator();
    }
}

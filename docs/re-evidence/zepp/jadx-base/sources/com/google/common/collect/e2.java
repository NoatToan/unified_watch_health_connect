package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true, serializable = true)
final class e2<E> extends ImmutableSet<E> {
    public static final e2<Object> k = new e2<>(new Object[0], 0, null, 0, 0);

    @VisibleForTesting
    public final transient Object[] f;

    @VisibleForTesting
    public final transient Object[] g;
    private final transient int h;
    private final transient int i;
    private final transient int j;

    public e2(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.f = objArr;
        this.g = objArr2;
        this.h = i2;
        this.i = i;
        this.j = i3;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int a(Object[] objArr, int i) {
        System.arraycopy(this.f, 0, objArr, i, this.j);
        return i + this.j;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public Object[] b() {
        return this.f;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int c() {
        return this.j;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public boolean contains(@NullableDecl Object obj) {
        Object[] objArr = this.g;
        if (obj == null || objArr == null) {
            return false;
        }
        int iD = b1.d(obj);
        while (true) {
            int i = iD & this.h;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iD = i + 1;
        }
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int e() {
        return 0;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public boolean f() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.i;
    }

    @Override // com.google.common.collect.ImmutableSet
    public ImmutableList<E> k() {
        return ImmutableList.h(this.f, this.j);
    }

    @Override // com.google.common.collect.ImmutableSet
    public boolean m() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.j;
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public UnmodifiableIterator<E> iterator() {
        return asList().iterator();
    }
}

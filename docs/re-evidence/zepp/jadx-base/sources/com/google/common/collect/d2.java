package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true, serializable = true)
class d2<E> extends ImmutableMultiset<E> {
    public static final d2<Object> g = new d2<>(u1.c());
    public final transient u1<E> d;
    private final transient int e;

    @LazyInit
    private transient ImmutableSet<E> f;

    public final class b extends n1<E> {
        private b() {
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
        public boolean contains(@NullableDecl Object obj) {
            return d2.this.contains(obj);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean f() {
            return true;
        }

        @Override // com.google.common.collect.n1
        public E get(int i) {
            return d2.this.d.j(i);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return d2.this.d.D();
        }
    }

    @GwtIncompatible
    public static class c implements Serializable {
        private static final long serialVersionUID = 0;
        public final Object[] a;
        public final int[] b;

        public c(Multiset<?> multiset) {
            int size = multiset.entrySet().size();
            this.a = new Object[size];
            this.b = new int[size];
            int i = 0;
            for (Multiset.Entry<?> entry : multiset.entrySet()) {
                this.a[i] = entry.getElement();
                this.b[i] = entry.getCount();
                i++;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Object readResolve() {
            ImmutableMultiset.Builder builder = new ImmutableMultiset.Builder(this.a.length);
            int i = 0;
            while (true) {
                Object[] objArr = this.a;
                if (i >= objArr.length) {
                    return builder.build();
                }
                builder.addCopies(objArr[i], this.b[i]);
                i++;
            }
        }
    }

    public d2(u1<E> u1Var) {
        this.d = u1Var;
        long jL = 0;
        for (int i = 0; i < u1Var.D(); i++) {
            jL += (long) u1Var.l(i);
        }
        this.e = Ints.saturatedCast(jL);
    }

    @Override // com.google.common.collect.Multiset
    public int count(@NullableDecl Object obj) {
        return this.d.g(obj);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public boolean f() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableMultiset
    public Multiset.Entry<E> j(int i) {
        return this.d.h(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public int size() {
        return this.e;
    }

    @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection
    @GwtIncompatible
    public Object writeReplace() {
        return new c(this);
    }

    @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.Multiset
    public ImmutableSet<E> elementSet() {
        ImmutableSet<E> immutableSet = this.f;
        if (immutableSet != null) {
            return immutableSet;
        }
        b bVar = new b();
        this.f = bVar;
        return bVar;
    }
}

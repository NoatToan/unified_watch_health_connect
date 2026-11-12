package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true)
abstract class n1<E> extends ImmutableSet<E> {

    public class a extends ImmutableList<E> {
        public a() {
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean f() {
            return n1.this.f();
        }

        @Override // java.util.List
        public E get(int i) {
            return (E) n1.this.get(i);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return n1.this.size();
        }
    }

    @Override // com.google.common.collect.ImmutableCollection
    @GwtIncompatible
    public int a(Object[] objArr, int i) {
        return asList().a(objArr, i);
    }

    public abstract E get(int i);

    @Override // com.google.common.collect.ImmutableSet
    public ImmutableList<E> k() {
        return new a();
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public UnmodifiableIterator<E> iterator() {
        return asList().iterator();
    }
}

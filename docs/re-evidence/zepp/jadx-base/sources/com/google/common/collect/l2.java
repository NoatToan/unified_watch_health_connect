package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.concurrent.LazyInit;
import kotlinx.serialization.json.internal.JsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true, serializable = true)
final class l2<E> extends ImmutableSet<E> {
    public final transient E f;

    @LazyInit
    private transient int g;

    public l2(E e) {
        this.f = (E) Preconditions.checkNotNull(e);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int a(Object[] objArr, int i) {
        objArr[i] = this.f;
        return i + 1;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f.equals(obj);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public boolean f() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        int i = this.g;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.f.hashCode();
        this.g = iHashCode;
        return iHashCode;
    }

    @Override // com.google.common.collect.ImmutableSet
    public ImmutableList<E> k() {
        return ImmutableList.of((Object) this.f);
    }

    @Override // com.google.common.collect.ImmutableSet
    public boolean m() {
        return this.g != 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return JsonLexerKt.BEGIN_LIST + this.f.toString() + JsonLexerKt.END_LIST;
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public UnmodifiableIterator<E> iterator() {
        return Iterators.singletonIterator(this.f);
    }

    public l2(E e, int i) {
        this.f = e;
        this.g = i;
    }
}

package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.Serializable;
import java.lang.Enum;
import java.util.Collection;
import java.util.EnumSet;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true, serializable = true)
final class f1<E extends Enum<E>> extends ImmutableSet<E> {
    private final transient EnumSet<E> f;

    @LazyInit
    private transient int g;

    public static class b<E extends Enum<E>> implements Serializable {
        private static final long serialVersionUID = 0;
        public final EnumSet<E> a;

        public b(EnumSet<E> enumSet) {
            this.a = enumSet;
        }

        public Object readResolve() {
            return new f1(this.a.clone());
        }
    }

    public static ImmutableSet o(EnumSet enumSet) {
        int size = enumSet.size();
        if (size != 0) {
            return size != 1 ? new f1(enumSet) : ImmutableSet.of(Iterables.getOnlyElement(enumSet));
        }
        return ImmutableSet.of();
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        if (collection instanceof f1) {
            collection = ((f1) collection).f;
        }
        return this.f.containsAll(collection);
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f1) {
            obj = ((f1) obj).f;
        }
        return this.f.equals(obj);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public boolean f() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public int hashCode() {
        int i = this.g;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.f.hashCode();
        this.g = iHashCode;
        return iHashCode;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f.isEmpty();
    }

    @Override // com.google.common.collect.ImmutableSet
    public boolean m() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f.size();
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return this.f.toString();
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new b(this.f);
    }

    private f1(EnumSet<E> enumSet) {
        this.f = enumSet;
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public UnmodifiableIterator<E> iterator() {
        return Iterators.unmodifiableIterator(this.f.iterator());
    }
}

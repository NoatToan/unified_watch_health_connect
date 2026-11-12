package com.google.common.collect;

import defpackage.c6i;
import defpackage.r7d;
import defpackage.uaq;
import defpackage.y6d;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ImmutableMultiset<E> extends y6d<E> implements u<E> {
    private transient ImmutableList<E> asList;
    private transient ImmutableSet<u.a<E>> entrySet;

    public class a extends uaq<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f9050a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public E f9051b;
        public final /* synthetic */ Iterator c;

        public a(ImmutableMultiset immutableMultiset, Iterator it) {
            this.c = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f9050a > 0 || this.c.hasNext();
        }

        @Override // java.util.Iterator
        public E next() {
            if (this.f9050a <= 0) {
                u.a aVar = (u.a) this.c.next();
                this.f9051b = (E) aVar.getElement();
                this.f9050a = aVar.getCount();
            }
            this.f9050a--;
            E e = this.f9051b;
            Objects.requireNonNull(e);
            return e;
        }
    }

    public static class b<E> extends ImmutableCollection.b<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public w<E> f9052a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f9053b;
        public boolean c;

        public b() {
            this(4);
        }

        public static <T> w<T> l(Iterable<T> iterable) {
            if (iterable instanceof b0) {
                return ((b0) iterable).f9159a;
            }
            if (iterable instanceof com.google.common.collect.c) {
                return ((com.google.common.collect.c) iterable).backingMap;
            }
            return null;
        }

        @Override // com.google.common.collect.ImmutableCollection.b
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public b<E> a(E e) {
            return j(e, 1);
        }

        public b<E> g(E... eArr) {
            super.b(eArr);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b<E> h(Iterable<? extends E> iterable) {
            Objects.requireNonNull(this.f9052a);
            if (iterable instanceof u) {
                u uVarD = v.d(iterable);
                w wVarL = l(uVarD);
                if (wVarL != null) {
                    w<E> wVar = this.f9052a;
                    wVar.d(Math.max(wVar.C(), wVarL.C()));
                    for (int iE = wVarL.e(); iE >= 0; iE = wVarL.s(iE)) {
                        j(wVarL.i(iE), wVarL.k(iE));
                    }
                } else {
                    Set<u.a<E>> setEntrySet = uVarD.entrySet();
                    w<E> wVar2 = this.f9052a;
                    wVar2.d(Math.max(wVar2.C(), setEntrySet.size()));
                    for (u.a<E> aVar : uVarD.entrySet()) {
                        j(aVar.getElement(), aVar.getCount());
                    }
                }
            } else {
                super.c(iterable);
            }
            return this;
        }

        public b<E> i(Iterator<? extends E> it) {
            super.d(it);
            return this;
        }

        public b<E> j(E e, int i) {
            Objects.requireNonNull(this.f9052a);
            if (i == 0) {
                return this;
            }
            if (this.f9053b) {
                this.f9052a = new w<>(this.f9052a);
                this.c = false;
            }
            this.f9053b = false;
            c6i.o(e);
            w<E> wVar = this.f9052a;
            wVar.u(e, i + wVar.f(e));
            return this;
        }

        public ImmutableMultiset<E> k() {
            Objects.requireNonNull(this.f9052a);
            if (this.f9052a.C() == 0) {
                return ImmutableMultiset.of();
            }
            if (this.c) {
                this.f9052a = new w<>(this.f9052a);
                this.c = false;
            }
            this.f9053b = true;
            return new b0(this.f9052a);
        }

        public b(int i) {
            this.f9053b = false;
            this.c = false;
            this.f9052a = w.c(i);
        }

        public b(boolean z) {
            this.f9053b = false;
            this.c = false;
            this.f9052a = null;
        }
    }

    public final class c extends r7d<u.a<E>> {
        private static final long serialVersionUID = 0;

        public c() {
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof u.a)) {
                return false;
            }
            u.a aVar = (u.a) obj;
            return aVar.getCount() > 0 && ImmutableMultiset.this.count(aVar.getElement()) == aVar.getCount();
        }

        @Override // defpackage.r7d
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public u.a<E> get(int i) {
            return ImmutableMultiset.this.getEntry(i);
        }

        @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return ImmutableMultiset.this.hashCode();
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return ImmutableMultiset.this.isPartialView();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return ImmutableMultiset.this.elementSet().size();
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return new d(ImmutableMultiset.this);
        }

        public /* synthetic */ c(ImmutableMultiset immutableMultiset, a aVar) {
            this();
        }
    }

    public static class d<E> implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImmutableMultiset<E> f9055a;

        public d(ImmutableMultiset<E> immutableMultiset) {
            this.f9055a = immutableMultiset;
        }

        public Object readResolve() {
            return this.f9055a.entrySet();
        }
    }

    public static <E> b<E> builder() {
        return new b<>();
    }

    private static <E> ImmutableMultiset<E> copyFromElements(E... eArr) {
        return new b().g(eArr).k();
    }

    public static <E> ImmutableMultiset<E> copyFromEntries(Collection<? extends u.a<? extends E>> collection) {
        b bVar = new b(collection.size());
        for (u.a<? extends E> aVar : collection) {
            bVar.j(aVar.getElement(), aVar.getCount());
        }
        return bVar.k();
    }

    public static <E> ImmutableMultiset<E> copyOf(E[] eArr) {
        return copyFromElements(eArr);
    }

    private ImmutableSet<u.a<E>> createEntrySet() {
        return isEmpty() ? ImmutableSet.of() : new c(this, null);
    }

    public static <E> ImmutableMultiset<E> of() {
        return b0.d;
    }

    @Override // com.google.common.collect.u
    @Deprecated
    public final int add(E e, int i) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public ImmutableList<E> asList() {
        ImmutableList<E> immutableList = this.asList;
        if (immutableList != null) {
            return immutableList;
        }
        ImmutableList<E> immutableListAsList = super.asList();
        this.asList = immutableListAsList;
        return immutableListAsList;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return count(obj) > 0;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int copyIntoArray(Object[] objArr, int i) {
        uaq<u.a<E>> it = entrySet().iterator();
        while (it.hasNext()) {
            u.a<E> next = it.next();
            Arrays.fill(objArr, i, next.getCount() + i, next.getElement());
            i += next.getCount();
        }
        return i;
    }

    public abstract /* synthetic */ int count(Object obj);

    @Override // com.google.common.collect.u
    public abstract ImmutableSet<E> elementSet();

    @Override // java.util.Collection, com.google.common.collect.u
    public boolean equals(Object obj) {
        return v.f(this, obj);
    }

    public abstract u.a<E> getEntry(int i);

    @Override // java.util.Collection, com.google.common.collect.u
    public int hashCode() {
        return i0.b(entrySet());
    }

    @Override // com.google.common.collect.u
    @Deprecated
    public final int remove(Object obj, int i) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.u
    @Deprecated
    public final int setCount(E e, int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return entrySet().toString();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public abstract Object writeReplace();

    public static <E> ImmutableMultiset<E> copyOf(Iterable<? extends E> iterable) {
        if (iterable instanceof ImmutableMultiset) {
            ImmutableMultiset<E> immutableMultiset = (ImmutableMultiset) iterable;
            if (!immutableMultiset.isPartialView()) {
                return immutableMultiset;
            }
        }
        b bVar = new b(v.h(iterable));
        bVar.h(iterable);
        return bVar.k();
    }

    public static <E> ImmutableMultiset<E> of(E e) {
        return copyFromElements(e);
    }

    @Override // com.google.common.collect.u
    public ImmutableSet<u.a<E>> entrySet() {
        ImmutableSet<u.a<E>> immutableSet = this.entrySet;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet<u.a<E>> immutableSetCreateEntrySet = createEntrySet();
        this.entrySet = immutableSetCreateEntrySet;
        return immutableSetCreateEntrySet;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public uaq<E> iterator() {
        return new a(this, entrySet().iterator());
    }

    @Override // com.google.common.collect.u
    @Deprecated
    public final boolean setCount(E e, int i, int i2) {
        throw new UnsupportedOperationException();
    }

    public static <E> ImmutableMultiset<E> of(E e, E e2) {
        return copyFromElements(e, e2);
    }

    public static <E> ImmutableMultiset<E> of(E e, E e2, E e3) {
        return copyFromElements(e, e2, e3);
    }

    public static <E> ImmutableMultiset<E> of(E e, E e2, E e3, E e4) {
        return copyFromElements(e, e2, e3, e4);
    }

    public static <E> ImmutableMultiset<E> of(E e, E e2, E e3, E e4, E e5) {
        return copyFromElements(e, e2, e3, e4, e5);
    }

    public static <E> ImmutableMultiset<E> of(E e, E e2, E e3, E e4, E e5, E e6, E... eArr) {
        return new b().a(e).a(e2).a(e3).a(e4).a(e5).a(e6).g(eArr).k();
    }

    public static <E> ImmutableMultiset<E> copyOf(Iterator<? extends E> it) {
        return new b().i(it).k();
    }
}

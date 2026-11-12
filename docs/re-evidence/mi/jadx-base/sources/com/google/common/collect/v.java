package com.google.common.collect;

import defpackage.c6i;
import defpackage.d44;
import defpackage.epd;
import defpackage.j4h;
import defpackage.pyp;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public final class v {

    /* JADX INFO: Add missing generic type declarations: [E] */
    public class a<E> extends pyp<u.a<E>, E> {
        public a(Iterator it) {
            super(it);
        }

        @Override // defpackage.pyp
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public E a(u.a<E> aVar) {
            return aVar.getElement();
        }
    }

    public static abstract class b<E> implements u.a<E> {
        public boolean equals(Object obj) {
            if (!(obj instanceof u.a)) {
                return false;
            }
            u.a aVar = (u.a) obj;
            return getCount() == aVar.getCount() && j4h.a(getElement(), aVar.getElement());
        }

        public int hashCode() {
            E element = getElement();
            return (element == null ? 0 : element.hashCode()) ^ getCount();
        }

        @Override // com.google.common.collect.u.a
        public String toString() {
            String strValueOf = String.valueOf(getElement());
            int count = getCount();
            if (count == 1) {
                return strValueOf;
            }
            StringBuilder sb = new StringBuilder(strValueOf.length() + 14);
            sb.append(strValueOf);
            sb.append(" x ");
            sb.append(count);
            return sb.toString();
        }
    }

    public static abstract class c<E> extends i0.b<E> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            i().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return i().contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return i().containsAll(collection);
        }

        public abstract u<E> i();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return i().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return i().remove(obj, Integer.MAX_VALUE) > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return i().entrySet().size();
        }
    }

    public static abstract class d<E> extends i0.b<u.a<E>> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            i().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof u.a)) {
                return false;
            }
            u.a aVar = (u.a) obj;
            return aVar.getCount() > 0 && i().count(aVar.getElement()) == aVar.getCount();
        }

        public abstract u<E> i();

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (obj instanceof u.a) {
                u.a aVar = (u.a) obj;
                Object element = aVar.getElement();
                int count = aVar.getCount();
                if (count != 0) {
                    return i().setCount(element, count, 0);
                }
            }
            return false;
        }
    }

    public static class e<E> extends b<E> implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final E f9251a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f9252b;

        public e(E e, int i) {
            this.f9251a = e;
            this.f9252b = i;
            d44.b(i, "count");
        }

        @Override // com.google.common.collect.u.a
        public final int getCount() {
            return this.f9252b;
        }

        @Override // com.google.common.collect.u.a
        public final E getElement() {
            return this.f9251a;
        }
    }

    public static final class f<E> implements Iterator<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final u<E> f9253a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Iterator<u.a<E>> f9254b;
        public u.a<E> c;
        public int d;
        public int e;
        public boolean f;

        public f(u<E> uVar, Iterator<u.a<E>> it) {
            this.f9253a = uVar;
            this.f9254b = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.d > 0 || this.f9254b.hasNext();
        }

        @Override // java.util.Iterator
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            if (this.d == 0) {
                u.a<E> next = this.f9254b.next();
                this.c = next;
                int count = next.getCount();
                this.d = count;
                this.e = count;
            }
            this.d--;
            this.f = true;
            u.a<E> aVar = this.c;
            Objects.requireNonNull(aVar);
            return aVar.getElement();
        }

        @Override // java.util.Iterator
        public void remove() {
            d44.e(this.f);
            if (this.e == 1) {
                this.f9254b.remove();
            } else {
                u<E> uVar = this.f9253a;
                u.a<E> aVar = this.c;
                Objects.requireNonNull(aVar);
                uVar.remove(aVar.getElement());
            }
            this.e--;
            this.f = false;
        }
    }

    public static <E> boolean a(u<E> uVar, com.google.common.collect.c<? extends E> cVar) {
        if (cVar.isEmpty()) {
            return false;
        }
        cVar.addTo(uVar);
        return true;
    }

    public static <E> boolean b(u<E> uVar, u<? extends E> uVar2) {
        if (uVar2 instanceof com.google.common.collect.c) {
            return a(uVar, (com.google.common.collect.c) uVar2);
        }
        if (uVar2.isEmpty()) {
            return false;
        }
        for (u.a<? extends E> aVar : uVar2.entrySet()) {
            uVar.add(aVar.getElement(), aVar.getCount());
        }
        return true;
    }

    public static <E> boolean c(u<E> uVar, Collection<? extends E> collection) {
        c6i.o(uVar);
        c6i.o(collection);
        if (collection instanceof u) {
            return b(uVar, d(collection));
        }
        if (collection.isEmpty()) {
            return false;
        }
        return epd.a(uVar, collection.iterator());
    }

    public static <T> u<T> d(Iterable<T> iterable) {
        return (u) iterable;
    }

    public static <E> Iterator<E> e(Iterator<u.a<E>> it) {
        return new a(it);
    }

    public static boolean f(u<?> uVar, Object obj) {
        if (obj == uVar) {
            return true;
        }
        if (obj instanceof u) {
            u uVar2 = (u) obj;
            if (uVar.size() == uVar2.size() && uVar.entrySet().size() == uVar2.entrySet().size()) {
                for (u.a aVar : uVar2.entrySet()) {
                    if (uVar.count(aVar.getElement()) != aVar.getCount()) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static <E> u.a<E> g(E e2, int i) {
        return new e(e2, i);
    }

    public static int h(Iterable<?> iterable) {
        if (iterable instanceof u) {
            return ((u) iterable).elementSet().size();
        }
        return 11;
    }

    public static <E> Iterator<E> i(u<E> uVar) {
        return new f(uVar, uVar.entrySet().iterator());
    }

    public static boolean j(u<?> uVar, Collection<?> collection) {
        if (collection instanceof u) {
            collection = ((u) collection).elementSet();
        }
        return uVar.elementSet().removeAll(collection);
    }

    public static boolean k(u<?> uVar, Collection<?> collection) {
        c6i.o(collection);
        if (collection instanceof u) {
            collection = ((u) collection).elementSet();
        }
        return uVar.elementSet().retainAll(collection);
    }

    public static <E> int l(u<E> uVar, E e2, int i) {
        d44.b(i, "count");
        int iCount = uVar.count(e2);
        int i2 = i - iCount;
        if (i2 > 0) {
            uVar.add(e2, i2);
        } else if (i2 < 0) {
            uVar.remove(e2, -i2);
        }
        return iCount;
    }

    public static <E> boolean m(u<E> uVar, E e2, int i, int i2) {
        d44.b(i, "oldCount");
        d44.b(i2, "newCount");
        if (uVar.count(e2) != i) {
            return false;
        }
        uVar.setCount(e2, i2);
        return true;
    }
}

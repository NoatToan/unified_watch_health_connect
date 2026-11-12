package com.google.common.collect;

import defpackage.ahd;
import defpackage.c6i;
import defpackage.d44;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes5.dex */
public abstract class c<E> extends e<E> implements Serializable {
    private static final long serialVersionUID = 0;
    transient w<E> backingMap;
    transient long size;

    public class a extends c<E>.AbstractC0233c<E> {
        public a() {
            super();
        }

        @Override // com.google.common.collect.c.AbstractC0233c
        public E b(int i) {
            return c.this.backingMap.i(i);
        }
    }

    public class b extends c<E>.AbstractC0233c<u.a<E>> {
        public b() {
            super();
        }

        @Override // com.google.common.collect.c.AbstractC0233c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public u.a<E> b(int i) {
            return c.this.backingMap.g(i);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.c$c, reason: collision with other inner class name */
    public abstract class AbstractC0233c<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f9164a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f9165b = -1;
        public int c;

        public AbstractC0233c() {
            this.f9164a = c.this.backingMap.e();
            this.c = c.this.backingMap.d;
        }

        public final void a() {
            if (c.this.backingMap.d != this.c) {
                throw new ConcurrentModificationException();
            }
        }

        public abstract T b(int i);

        @Override // java.util.Iterator
        public boolean hasNext() {
            a();
            return this.f9164a >= 0;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T tB = b(this.f9164a);
            int i = this.f9164a;
            this.f9165b = i;
            this.f9164a = c.this.backingMap.s(i);
            return tB;
        }

        @Override // java.util.Iterator
        public void remove() {
            a();
            d44.e(this.f9165b != -1);
            c cVar = c.this;
            cVar.size -= (long) cVar.backingMap.x(this.f9165b);
            this.f9164a = c.this.backingMap.t(this.f9164a, this.f9165b);
            this.f9165b = -1;
            this.c = c.this.backingMap.d;
        }
    }

    public c(int i) {
        this.backingMap = newBackingMap(i);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int iH = g0.h(objectInputStream);
        this.backingMap = newBackingMap(3);
        g0.g(this, objectInputStream, iH);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        g0.k(this, objectOutputStream);
    }

    @Override // com.google.common.collect.e, com.google.common.collect.u
    public final int add(E e, int i) {
        if (i == 0) {
            return count(e);
        }
        c6i.f(i > 0, "occurrences cannot be negative: %s", i);
        int iM = this.backingMap.m(e);
        if (iM == -1) {
            this.backingMap.u(e, i);
            this.size += (long) i;
            return 0;
        }
        int iK = this.backingMap.k(iM);
        long j = i;
        long j2 = ((long) iK) + j;
        c6i.h(j2 <= 2147483647L, "too many occurrences: %s", j2);
        this.backingMap.B(iM, (int) j2);
        this.size += j;
        return iK;
    }

    public void addTo(u<? super E> uVar) {
        c6i.o(uVar);
        int iE = this.backingMap.e();
        while (iE >= 0) {
            uVar.add(this.backingMap.i(iE), this.backingMap.k(iE));
            iE = this.backingMap.s(iE);
        }
    }

    @Override // com.google.common.collect.e, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.backingMap.a();
        this.size = 0L;
    }

    @Override // com.google.common.collect.u
    public final int count(Object obj) {
        return this.backingMap.f(obj);
    }

    @Override // com.google.common.collect.e
    public final int distinctElements() {
        return this.backingMap.C();
    }

    @Override // com.google.common.collect.e
    public final Iterator<E> elementIterator() {
        return new a();
    }

    @Override // com.google.common.collect.e
    public final Iterator<u.a<E>> entryIterator() {
        return new b();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        return v.i(this);
    }

    public abstract w<E> newBackingMap(int i);

    @Override // com.google.common.collect.e, com.google.common.collect.u
    public final int remove(Object obj, int i) {
        if (i == 0) {
            return count(obj);
        }
        c6i.f(i > 0, "occurrences cannot be negative: %s", i);
        int iM = this.backingMap.m(obj);
        if (iM == -1) {
            return 0;
        }
        int iK = this.backingMap.k(iM);
        if (iK > i) {
            this.backingMap.B(iM, iK - i);
        } else {
            this.backingMap.x(iM);
            i = iK;
        }
        this.size -= (long) i;
        return iK;
    }

    @Override // com.google.common.collect.e, com.google.common.collect.u
    public final int setCount(E e, int i) {
        d44.b(i, "count");
        w<E> wVar = this.backingMap;
        int iV = i == 0 ? wVar.v(e) : wVar.u(e, i);
        this.size += (long) (i - iV);
        return iV;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.u
    public final int size() {
        return ahd.j(this.size);
    }

    @Override // com.google.common.collect.e, com.google.common.collect.u
    public final boolean setCount(E e, int i, int i2) {
        d44.b(i, "oldCount");
        d44.b(i2, "newCount");
        int iM = this.backingMap.m(e);
        if (iM == -1) {
            if (i != 0) {
                return false;
            }
            if (i2 > 0) {
                this.backingMap.u(e, i2);
                this.size += (long) i2;
            }
            return true;
        }
        if (this.backingMap.k(iM) != i) {
            return false;
        }
        if (i2 == 0) {
            this.backingMap.x(iM);
            this.size -= (long) i;
        } else {
            this.backingMap.B(iM, i2);
            this.size += (long) (i2 - i);
        }
        return true;
    }
}

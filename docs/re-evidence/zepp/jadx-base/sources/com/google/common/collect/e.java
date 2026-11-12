package com.google.common.collect;

import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true)
abstract class e<E> extends h<E> implements Serializable {

    @GwtIncompatible
    private static final long serialVersionUID = 0;
    public transient u1<E> c;
    public transient long d;

    public class a extends e<E>.c<E> {
        public a() {
            super();
        }

        @Override // com.google.common.collect.e.c
        public E b(int i) {
            return e.this.c.j(i);
        }
    }

    public class b extends e<E>.c<Multiset.Entry<E>> {
        public b() {
            super();
        }

        @Override // com.google.common.collect.e.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Multiset.Entry<E> b(int i) {
            return e.this.c.h(i);
        }
    }

    public abstract class c<T> implements Iterator<T> {
        public int a;
        public int b = -1;
        public int c;

        public c() {
            this.a = e.this.c.f();
            this.c = e.this.c.d;
        }

        private void a() {
            if (e.this.c.d != this.c) {
                throw new ConcurrentModificationException();
            }
        }

        public abstract T b(int i);

        @Override // java.util.Iterator
        public boolean hasNext() {
            a();
            return this.a >= 0;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T tB = b(this.a);
            int i = this.a;
            this.b = i;
            this.a = e.this.c.t(i);
            return tB;
        }

        @Override // java.util.Iterator
        public void remove() {
            a();
            u.e(this.b != -1);
            e eVar = e.this;
            eVar.d -= (long) eVar.c.y(this.b);
            this.a = e.this.c.u(this.a, this.b);
            this.b = -1;
            this.c = e.this.c.d;
        }
    }

    public e(int i) {
        g(i);
    }

    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int iH = k2.h(objectInputStream);
        g(3);
        k2.g(this, objectInputStream, iH);
    }

    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        k2.k(this, objectOutputStream);
    }

    @Override // com.google.common.collect.h, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public final int add(@NullableDecl E e, int i) {
        if (i == 0) {
            return count(e);
        }
        Preconditions.checkArgument(i > 0, "occurrences cannot be negative: %s", i);
        int iN = this.c.n(e);
        if (iN == -1) {
            this.c.v(e, i);
            this.d += (long) i;
            return 0;
        }
        int iL = this.c.l(iN);
        long j = i;
        long j2 = ((long) iL) + j;
        Preconditions.checkArgument(j2 <= ParserMinimalBase.MAX_INT_L, "too many occurrences: %s", j2);
        this.c.C(iN, (int) j2);
        this.d += j;
        return iL;
    }

    @Override // com.google.common.collect.h
    public final int b() {
        return this.c.D();
    }

    @Override // com.google.common.collect.h
    public final Iterator<E> c() {
        return new a();
    }

    @Override // com.google.common.collect.h, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.c.a();
        this.d = 0L;
    }

    @Override // com.google.common.collect.Multiset
    public final int count(@NullableDecl Object obj) {
        return this.c.g(obj);
    }

    @Override // com.google.common.collect.h
    public final Iterator<Multiset.Entry<E>> e() {
        return new b();
    }

    public void f(Multiset<? super E> multiset) {
        Preconditions.checkNotNull(multiset);
        int iF = this.c.f();
        while (iF >= 0) {
            multiset.add(this.c.j(iF), this.c.l(iF));
            iF = this.c.t(iF);
        }
    }

    public abstract void g(int i);

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.Multiset
    public final Iterator<E> iterator() {
        return Multisets.h(this);
    }

    @Override // com.google.common.collect.h, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public final int remove(@NullableDecl Object obj, int i) {
        if (i == 0) {
            return count(obj);
        }
        Preconditions.checkArgument(i > 0, "occurrences cannot be negative: %s", i);
        int iN = this.c.n(obj);
        if (iN == -1) {
            return 0;
        }
        int iL = this.c.l(iN);
        if (iL > i) {
            this.c.C(iN, iL - i);
        } else {
            this.c.y(iN);
            i = iL;
        }
        this.d -= (long) i;
        return iL;
    }

    @Override // com.google.common.collect.h, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public final int setCount(@NullableDecl E e, int i) {
        u.b(i, "count");
        u1<E> u1Var = this.c;
        int iW = i == 0 ? u1Var.w(e) : u1Var.v(e, i);
        this.d += (long) (i - iW);
        return iW;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public final int size() {
        return Ints.saturatedCast(this.d);
    }

    @Override // com.google.common.collect.h, com.google.common.collect.Multiset
    public final boolean setCount(@NullableDecl E e, int i, int i2) {
        u.b(i, "oldCount");
        u.b(i2, "newCount");
        int iN = this.c.n(e);
        if (iN == -1) {
            if (i != 0) {
                return false;
            }
            if (i2 > 0) {
                this.c.v(e, i2);
                this.d += (long) i2;
            }
            return true;
        }
        if (this.c.l(iN) != i) {
            return false;
        }
        if (i2 == 0) {
            this.c.y(iN);
            this.d -= (long) i;
        } else {
            this.c.C(iN, i2);
            this.d += (long) (i2 - i);
        }
        return true;
    }
}

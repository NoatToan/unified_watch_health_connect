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
import java.lang.Enum;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true)
public final class EnumMultiset<E extends Enum<E>> extends h<E> implements Serializable {

    @GwtIncompatible
    private static final long serialVersionUID = 0;
    private transient Class<E> c;
    private transient E[] d;
    private transient int[] e;
    private transient int f;
    private transient long g;

    public class a extends EnumMultiset<E>.c<E> {
        public a() {
            super();
        }

        @Override // com.google.common.collect.EnumMultiset.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public E a(int i) {
            return (E) EnumMultiset.this.d[i];
        }
    }

    public class b extends EnumMultiset<E>.c<Multiset.Entry<E>> {

        public class a extends Multisets.f<E> {
            public final /* synthetic */ int a;

            public a(int i) {
                this.a = i;
            }

            @Override // com.google.common.collect.Multiset.Entry
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public E getElement() {
                return (E) EnumMultiset.this.d[this.a];
            }

            @Override // com.google.common.collect.Multiset.Entry
            public int getCount() {
                return EnumMultiset.this.e[this.a];
            }
        }

        public b() {
            super();
        }

        @Override // com.google.common.collect.EnumMultiset.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Multiset.Entry<E> a(int i) {
            return new a(i);
        }
    }

    public abstract class c<T> implements Iterator<T> {
        public int a = 0;
        public int b = -1;

        public c() {
        }

        public abstract T a(int i);

        @Override // java.util.Iterator
        public boolean hasNext() {
            while (this.a < EnumMultiset.this.d.length) {
                int[] iArr = EnumMultiset.this.e;
                int i = this.a;
                if (iArr[i] > 0) {
                    return true;
                }
                this.a = i + 1;
            }
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T tA = a(this.a);
            int i = this.a;
            this.b = i;
            this.a = i + 1;
            return tA;
        }

        @Override // java.util.Iterator
        public void remove() {
            u.e(this.b >= 0);
            if (EnumMultiset.this.e[this.b] > 0) {
                EnumMultiset.h(EnumMultiset.this);
                EnumMultiset.this.g -= (long) EnumMultiset.this.e[this.b];
                EnumMultiset.this.e[this.b] = 0;
            }
            this.b = -1;
        }
    }

    private EnumMultiset(Class<E> cls) {
        this.c = cls;
        Preconditions.checkArgument(cls.isEnum());
        E[] enumConstants = cls.getEnumConstants();
        this.d = enumConstants;
        this.e = new int[enumConstants.length];
    }

    public static <E extends Enum<E>> EnumMultiset<E> create(Class<E> cls) {
        return new EnumMultiset<>(cls);
    }

    public static /* synthetic */ int h(EnumMultiset enumMultiset) {
        int i = enumMultiset.f;
        enumMultiset.f = i - 1;
        return i;
    }

    private boolean m(@NullableDecl Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r5 = (Enum) obj;
        int iOrdinal = r5.ordinal();
        E[] eArr = this.d;
        return iOrdinal < eArr.length && eArr[iOrdinal] == r5;
    }

    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Class<E> cls = (Class) objectInputStream.readObject();
        this.c = cls;
        E[] enumConstants = cls.getEnumConstants();
        this.d = enumConstants;
        this.e = new int[enumConstants.length];
        k2.f(this, objectInputStream);
    }

    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.c);
        k2.k(this, objectOutputStream);
    }

    @Override // com.google.common.collect.h
    public int b() {
        return this.f;
    }

    @Override // com.google.common.collect.h
    public Iterator<E> c() {
        return new a();
    }

    @Override // com.google.common.collect.h, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        Arrays.fill(this.e, 0);
        this.g = 0L;
        this.f = 0;
    }

    @Override // com.google.common.collect.h, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ boolean contains(@NullableDecl Object obj) {
        return super.contains(obj);
    }

    @Override // com.google.common.collect.Multiset
    public int count(@NullableDecl Object obj) {
        if (obj == null || !m(obj)) {
            return 0;
        }
        return this.e[((Enum) obj).ordinal()];
    }

    @Override // com.google.common.collect.h
    public Iterator<Multiset.Entry<E>> e() {
        return new b();
    }

    @Override // com.google.common.collect.h, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ Set elementSet() {
        return super.elementSet();
    }

    @Override // com.google.common.collect.h, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    @Override // com.google.common.collect.h, java.util.AbstractCollection, java.util.Collection
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.Multiset
    public Iterator<E> iterator() {
        return Multisets.h(this);
    }

    public void k(@NullableDecl Object obj) {
        Preconditions.checkNotNull(obj);
        if (m(obj)) {
            return;
        }
        throw new ClassCastException("Expected an " + this.c + " but got " + obj);
    }

    @Override // com.google.common.collect.h, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public int remove(@NullableDecl Object obj, int i) {
        if (obj == null || !m(obj)) {
            return 0;
        }
        Enum r1 = (Enum) obj;
        u.b(i, "occurrences");
        if (i == 0) {
            return count(obj);
        }
        int iOrdinal = r1.ordinal();
        int[] iArr = this.e;
        int i2 = iArr[iOrdinal];
        if (i2 == 0) {
            return 0;
        }
        if (i2 <= i) {
            iArr[iOrdinal] = 0;
            this.f--;
            this.g -= (long) i2;
        } else {
            iArr[iOrdinal] = i2 - i;
            this.g -= (long) i;
        }
        return i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public int size() {
        return Ints.saturatedCast(this.g);
    }

    public static <E extends Enum<E>> EnumMultiset<E> create(Iterable<E> iterable) {
        Iterator<E> it2 = iterable.iterator();
        Preconditions.checkArgument(it2.hasNext(), "EnumMultiset constructor passed empty Iterable");
        EnumMultiset<E> enumMultiset = new EnumMultiset<>(it2.next().getDeclaringClass());
        Iterables.addAll(enumMultiset, iterable);
        return enumMultiset;
    }

    @Override // com.google.common.collect.h, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public int add(E e, int i) {
        k(e);
        u.b(i, "occurrences");
        if (i == 0) {
            return count(e);
        }
        int iOrdinal = e.ordinal();
        int i2 = this.e[iOrdinal];
        long j = i;
        long j2 = ((long) i2) + j;
        Preconditions.checkArgument(j2 <= ParserMinimalBase.MAX_INT_L, "too many occurrences: %s", j2);
        this.e[iOrdinal] = (int) j2;
        if (i2 == 0) {
            this.f++;
        }
        this.g += j;
        return i2;
    }

    @Override // com.google.common.collect.h, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public int setCount(E e, int i) {
        k(e);
        u.b(i, "count");
        int iOrdinal = e.ordinal();
        int[] iArr = this.e;
        int i2 = iArr[iOrdinal];
        iArr[iOrdinal] = i;
        this.g += (long) (i - i2);
        if (i2 == 0 && i > 0) {
            this.f++;
        } else if (i2 > 0 && i == 0) {
            this.f--;
        }
        return i2;
    }

    public static <E extends Enum<E>> EnumMultiset<E> create(Iterable<E> iterable, Class<E> cls) {
        EnumMultiset<E> enumMultisetCreate = create(cls);
        Iterables.addAll(enumMultisetCreate, iterable);
        return enumMultisetCreate;
    }
}

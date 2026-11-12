package com.google.common.collect;

import defpackage.ahd;
import defpackage.c6i;
import defpackage.cpd;
import defpackage.d44;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.Enum;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class EnumMultiset<E extends Enum<E>> extends e<E> implements Serializable {
    private static final long serialVersionUID = 0;
    private transient int[] counts;
    private transient int distinctElements;
    private transient E[] enumConstants;
    private transient long size;
    private transient Class<E> type;

    public class a extends EnumMultiset<E>.c<E> {
        public a() {
            super();
        }

        @Override // com.google.common.collect.EnumMultiset.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public E a(int i) {
            return (E) EnumMultiset.this.enumConstants[i];
        }
    }

    public class b extends EnumMultiset<E>.c<u.a<E>> {

        public class a extends v.b<E> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f9003a;

            public a(int i) {
                this.f9003a = i;
            }

            @Override // com.google.common.collect.u.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public E getElement() {
                return (E) EnumMultiset.this.enumConstants[this.f9003a];
            }

            @Override // com.google.common.collect.u.a
            public int getCount() {
                return EnumMultiset.this.counts[this.f9003a];
            }
        }

        public b() {
            super();
        }

        @Override // com.google.common.collect.EnumMultiset.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public u.a<E> a(int i) {
            return new a(i);
        }
    }

    public abstract class c<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f9005a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f9006b = -1;

        public c() {
        }

        public abstract T a(int i);

        @Override // java.util.Iterator
        public boolean hasNext() {
            while (this.f9005a < EnumMultiset.this.enumConstants.length) {
                int[] iArr = EnumMultiset.this.counts;
                int i = this.f9005a;
                if (iArr[i] > 0) {
                    return true;
                }
                this.f9005a = i + 1;
            }
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T tA = a(this.f9005a);
            int i = this.f9005a;
            this.f9006b = i;
            this.f9005a = i + 1;
            return tA;
        }

        @Override // java.util.Iterator
        public void remove() {
            d44.e(this.f9006b >= 0);
            if (EnumMultiset.this.counts[this.f9006b] > 0) {
                EnumMultiset.access$210(EnumMultiset.this);
                EnumMultiset enumMultiset = EnumMultiset.this;
                EnumMultiset.access$322(enumMultiset, enumMultiset.counts[this.f9006b]);
                EnumMultiset.this.counts[this.f9006b] = 0;
            }
            this.f9006b = -1;
        }
    }

    private EnumMultiset(Class<E> cls) {
        this.type = cls;
        c6i.d(cls.isEnum());
        E[] enumConstants = cls.getEnumConstants();
        this.enumConstants = enumConstants;
        this.counts = new int[enumConstants.length];
    }

    public static /* synthetic */ int access$210(EnumMultiset enumMultiset) {
        int i = enumMultiset.distinctElements;
        enumMultiset.distinctElements = i - 1;
        return i;
    }

    public static /* synthetic */ long access$322(EnumMultiset enumMultiset, long j) {
        long j2 = enumMultiset.size - j;
        enumMultiset.size = j2;
        return j2;
    }

    private void checkIsE(Object obj) {
        c6i.o(obj);
        if (isActuallyE(obj)) {
            return;
        }
        String strValueOf = String.valueOf(this.type);
        String strValueOf2 = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 21 + strValueOf2.length());
        sb.append("Expected an ");
        sb.append(strValueOf);
        sb.append(" but got ");
        sb.append(strValueOf2);
        throw new ClassCastException(sb.toString());
    }

    public static <E extends Enum<E>> EnumMultiset<E> create(Class<E> cls) {
        return new EnumMultiset<>(cls);
    }

    private boolean isActuallyE(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r5 = (Enum) obj;
        int iOrdinal = r5.ordinal();
        E[] eArr = this.enumConstants;
        return iOrdinal < eArr.length && eArr[iOrdinal] == r5;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Class<E> cls = (Class) objectInputStream.readObject();
        this.type = cls;
        E[] enumConstants = cls.getEnumConstants();
        this.enumConstants = enumConstants;
        this.counts = new int[enumConstants.length];
        g0.f(this, objectInputStream);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.type);
        g0.k(this, objectOutputStream);
    }

    @Override // com.google.common.collect.e, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        Arrays.fill(this.counts, 0);
        this.size = 0L;
        this.distinctElements = 0;
    }

    @Override // com.google.common.collect.e, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.u
    public /* bridge */ /* synthetic */ boolean contains(Object obj) {
        return super.contains(obj);
    }

    @Override // com.google.common.collect.u
    public int count(Object obj) {
        if (obj == null || !isActuallyE(obj)) {
            return 0;
        }
        return this.counts[((Enum) obj).ordinal()];
    }

    @Override // com.google.common.collect.e
    public int distinctElements() {
        return this.distinctElements;
    }

    @Override // com.google.common.collect.e
    public Iterator<E> elementIterator() {
        return new a();
    }

    @Override // com.google.common.collect.e, com.google.common.collect.u
    public /* bridge */ /* synthetic */ Set elementSet() {
        return super.elementSet();
    }

    @Override // com.google.common.collect.e
    public Iterator<u.a<E>> entryIterator() {
        return new b();
    }

    @Override // com.google.common.collect.e, com.google.common.collect.u
    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    @Override // com.google.common.collect.e, java.util.AbstractCollection, java.util.Collection
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return v.i(this);
    }

    @Override // com.google.common.collect.e, com.google.common.collect.u
    public int remove(Object obj, int i) {
        if (obj == null || !isActuallyE(obj)) {
            return 0;
        }
        Enum r1 = (Enum) obj;
        d44.b(i, "occurrences");
        if (i == 0) {
            return count(obj);
        }
        int iOrdinal = r1.ordinal();
        int[] iArr = this.counts;
        int i2 = iArr[iOrdinal];
        if (i2 == 0) {
            return 0;
        }
        if (i2 <= i) {
            iArr[iOrdinal] = 0;
            this.distinctElements--;
            this.size -= (long) i2;
        } else {
            iArr[iOrdinal] = i2 - i;
            this.size -= (long) i;
        }
        return i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.u
    public int size() {
        return ahd.j(this.size);
    }

    public static <E extends Enum<E>> EnumMultiset<E> create(Iterable<E> iterable) {
        Iterator<E> it = iterable.iterator();
        c6i.e(it.hasNext(), "EnumMultiset constructor passed empty Iterable");
        EnumMultiset<E> enumMultiset = new EnumMultiset<>(it.next().getDeclaringClass());
        cpd.a(enumMultiset, iterable);
        return enumMultiset;
    }

    @Override // com.google.common.collect.e, com.google.common.collect.u
    public int add(E e, int i) {
        checkIsE(e);
        d44.b(i, "occurrences");
        if (i == 0) {
            return count(e);
        }
        int iOrdinal = e.ordinal();
        int i2 = this.counts[iOrdinal];
        long j = i;
        long j2 = ((long) i2) + j;
        c6i.h(j2 <= 2147483647L, "too many occurrences: %s", j2);
        this.counts[iOrdinal] = (int) j2;
        if (i2 == 0) {
            this.distinctElements++;
        }
        this.size += j;
        return i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.e, com.google.common.collect.u
    public /* bridge */ /* synthetic */ boolean setCount(Object obj, int i, int i2) {
        return super.setCount(obj, i, i2);
    }

    @Override // com.google.common.collect.e, com.google.common.collect.u
    public int setCount(E e, int i) {
        checkIsE(e);
        d44.b(i, "count");
        int iOrdinal = e.ordinal();
        int[] iArr = this.counts;
        int i2 = iArr[iOrdinal];
        iArr[iOrdinal] = i;
        this.size += (long) (i - i2);
        if (i2 == 0 && i > 0) {
            this.distinctElements++;
        } else if (i2 > 0 && i == 0) {
            this.distinctElements--;
        }
        return i2;
    }

    public static <E extends Enum<E>> EnumMultiset<E> create(Iterable<E> iterable, Class<E> cls) {
        EnumMultiset<E> enumMultisetCreate = create(cls);
        cpd.a(enumMultisetCreate, iterable);
        return enumMultisetCreate;
    }
}

package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import defpackage.ale;
import defpackage.ann;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.Enum;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public final class EnumMultiset<E extends Enum<E>> extends AbstractMultiset<E> implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient int f4330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient Class<E> f4331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient long f4332c;
    private transient int[] d;
    private transient E[] e;

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ boolean contains(@CheckForNull Object obj) {
        return super.contains(obj);
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset, com.google.common.collect.SortedMultiset, com.google.common.collect.SortedMultisetBridge
    public /* bridge */ /* synthetic */ Set elementSet() {
        return super.elementSet();
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ boolean setCount(@ParametricNullness Object obj, int i, int i2) {
        return super.setCount(obj, i, i2);
    }

    static /* synthetic */ long d(EnumMultiset enumMultiset, long j) {
        long j2 = enumMultiset.f4332c - j;
        enumMultiset.f4332c = j2;
        return j2;
    }

    static /* synthetic */ int e(EnumMultiset enumMultiset) {
        int i = enumMultiset.f4330a;
        enumMultiset.f4330a = i - 1;
        return i;
    }

    private boolean a(@CheckForNull Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r4 = (Enum) obj;
        int iOrdinal = r4.ordinal();
        E[] eArr = this.e;
        return iOrdinal < eArr.length && eArr[iOrdinal] == r4;
    }

    private void d(Object obj) {
        Preconditions.checkNotNull(obj);
        if (a(obj)) {
            return;
        }
        throw new ClassCastException("Expected an " + this.f4331b + " but got " + obj);
    }

    @Override // com.google.common.collect.AbstractMultiset
    int distinctElements() {
        return this.f4330a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public int size() {
        return Ints.a(this.f4332c);
    }

    @Override // com.google.common.collect.Multiset
    public int count(@CheckForNull Object obj) {
        if (obj == null || !a(obj)) {
            return 0;
        }
        return this.d[((Enum) obj).ordinal()];
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public int add(E e, int i) {
        d(e);
        ale.b(i, "occurrences");
        if (i == 0) {
            return count(e);
        }
        int iOrdinal = e.ordinal();
        int i2 = this.d[iOrdinal];
        long j = i;
        long j2 = ((long) i2) + j;
        Preconditions.checkArgument(j2 <= 2147483647L, "too many occurrences: %s", j2);
        this.d[iOrdinal] = (int) j2;
        if (i2 == 0) {
            this.f4330a++;
        }
        this.f4332c += j;
        return i2;
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public int remove(@CheckForNull Object obj, int i) {
        if (obj == null || !a(obj)) {
            return 0;
        }
        Enum r1 = (Enum) obj;
        ale.b(i, "occurrences");
        if (i == 0) {
            return count(obj);
        }
        int iOrdinal = r1.ordinal();
        int[] iArr = this.d;
        int i2 = iArr[iOrdinal];
        if (i2 == 0) {
            return 0;
        }
        if (i2 <= i) {
            iArr[iOrdinal] = 0;
            this.f4330a--;
            this.f4332c -= (long) i2;
            return i2;
        }
        iArr[iOrdinal] = i2 - i;
        this.f4332c -= (long) i;
        return i2;
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int setCount(E e, int i) {
        d(e);
        ale.b(i, "count");
        int iOrdinal = e.ordinal();
        int[] iArr = this.d;
        int i2 = iArr[iOrdinal];
        iArr[iOrdinal] = i;
        this.f4332c += (long) (i - i2);
        if (i2 == 0 && i > 0) {
            this.f4330a++;
            return i2;
        }
        if (i2 > 0 && i == 0) {
            this.f4330a--;
        }
        return i2;
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        Arrays.fill(this.d, 0);
        this.f4332c = 0L;
        this.f4330a = 0;
    }

    abstract class Itr<T> implements Iterator<T> {
        int index = 0;
        int toRemove = -1;

        abstract T output(int i);

        Itr() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            while (this.index < EnumMultiset.this.e.length) {
                int[] iArr = EnumMultiset.this.d;
                int i = this.index;
                if (iArr[i] > 0) {
                    return true;
                }
                this.index = i + 1;
            }
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T tOutput = output(this.index);
            int i = this.index;
            this.toRemove = i;
            this.index = i + 1;
            return tOutput;
        }

        @Override // java.util.Iterator
        public void remove() {
            ale.b(this.toRemove >= 0);
            if (EnumMultiset.this.d[this.toRemove] > 0) {
                EnumMultiset.e(EnumMultiset.this);
                EnumMultiset enumMultiset = EnumMultiset.this;
                EnumMultiset.d(enumMultiset, enumMultiset.d[this.toRemove]);
                EnumMultiset.this.d[this.toRemove] = 0;
            }
            this.toRemove = -1;
        }
    }

    @Override // com.google.common.collect.AbstractMultiset
    Iterator<E> elementIterator() {
        return new EnumMultiset<E>.Itr<E>() { // from class: com.google.common.collect.EnumMultiset.3
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.collect.EnumMultiset.Itr
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public E output(int i) {
                return (E) EnumMultiset.this.e[i];
            }
        };
    }

    @Override // com.google.common.collect.AbstractMultiset
    Iterator<Multiset.Entry<E>> entryIterator() {
        return new EnumMultiset<E>.Itr<Multiset.Entry<E>>() { // from class: com.google.common.collect.EnumMultiset.2
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.collect.EnumMultiset.Itr
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Multiset.Entry<E> output(final int i) {
                return new Multisets.AbstractEntry<E>() { // from class: com.google.common.collect.EnumMultiset.2.3
                    @Override // com.google.common.collect.Multiset.Entry
                    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                    public E getElement() {
                        return (E) EnumMultiset.this.e[i];
                    }

                    @Override // com.google.common.collect.Multiset.Entry
                    public int getCount() {
                        return EnumMultiset.this.d[i];
                    }
                };
            }
        };
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.Multiset
    public Iterator<E> iterator() {
        return Multisets.b(this);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f4331b);
        ann.b(this, objectOutputStream);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Class<E> cls = (Class) Objects.requireNonNull(objectInputStream.readObject());
        this.f4331b = cls;
        E[] enumConstants = cls.getEnumConstants();
        this.e = enumConstants;
        this.d = new int[enumConstants.length];
        ann.d(this, objectInputStream);
    }
}

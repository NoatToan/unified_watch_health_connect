package com.google.common.collect;

import defpackage.c6i;
import defpackage.d2h;
import defpackage.d44;
import defpackage.f10;
import defpackage.j4h;
import defpackage.qlb;
import defpackage.ri2;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class HashBiMap<K, V> extends AbstractMap<K, V> implements ri2<K, V>, Serializable {
    private static final int ABSENT = -1;
    private static final int ENDPOINT = -2;
    private transient Set<Map.Entry<K, V>> entrySet;
    private transient int firstInInsertionOrder;
    private transient int[] hashTableKToV;
    private transient int[] hashTableVToK;
    private transient ri2<V, K> inverse;
    private transient Set<K> keySet;
    transient K[] keys;
    private transient int lastInInsertionOrder;
    transient int modCount;
    private transient int[] nextInBucketKToV;
    private transient int[] nextInBucketVToK;
    private transient int[] nextInInsertionOrder;
    private transient int[] prevInInsertionOrder;
    transient int size;
    private transient Set<V> valueSet;
    transient V[] values;

    public final class a extends f10<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final K f9008a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f9009b;

        public a(int i) {
            this.f9008a = (K) d2h.a(HashBiMap.this.keys[i]);
            this.f9009b = i;
        }

        public void a() {
            int i = this.f9009b;
            if (i != -1) {
                HashBiMap hashBiMap = HashBiMap.this;
                if (i <= hashBiMap.size && j4h.a(hashBiMap.keys[i], this.f9008a)) {
                    return;
                }
            }
            this.f9009b = HashBiMap.this.findEntryByKey(this.f9008a);
        }

        @Override // defpackage.f10, java.util.Map.Entry
        public K getKey() {
            return this.f9008a;
        }

        @Override // defpackage.f10, java.util.Map.Entry
        public V getValue() {
            a();
            int i = this.f9009b;
            return i == -1 ? (V) d2h.b() : (V) d2h.a(HashBiMap.this.values[i]);
        }

        @Override // defpackage.f10, java.util.Map.Entry
        public V setValue(V v) {
            a();
            int i = this.f9009b;
            if (i == -1) {
                HashBiMap.this.put(this.f9008a, v);
                return (V) d2h.b();
            }
            V v2 = (V) d2h.a(HashBiMap.this.values[i]);
            if (j4h.a(v2, v)) {
                return v;
            }
            HashBiMap.this.replaceValueInEntry(this.f9009b, v, false);
            return v2;
        }
    }

    public static final class b<K, V> extends f10<V, K> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HashBiMap<K, V> f9010a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final V f9011b;
        public int c;

        public b(HashBiMap<K, V> hashBiMap, int i) {
            this.f9010a = hashBiMap;
            this.f9011b = (V) d2h.a(hashBiMap.values[i]);
            this.c = i;
        }

        private void a() {
            int i = this.c;
            if (i != -1) {
                HashBiMap<K, V> hashBiMap = this.f9010a;
                if (i <= hashBiMap.size && j4h.a(this.f9011b, hashBiMap.values[i])) {
                    return;
                }
            }
            this.c = this.f9010a.findEntryByValue(this.f9011b);
        }

        @Override // defpackage.f10, java.util.Map.Entry
        public V getKey() {
            return this.f9011b;
        }

        @Override // defpackage.f10, java.util.Map.Entry
        public K getValue() {
            a();
            int i = this.c;
            return i == -1 ? (K) d2h.b() : (K) d2h.a(this.f9010a.keys[i]);
        }

        @Override // defpackage.f10, java.util.Map.Entry
        public K setValue(K k2) {
            a();
            int i = this.c;
            if (i == -1) {
                this.f9010a.putInverse(this.f9011b, k2, false);
                return (K) d2h.b();
            }
            K k3 = (K) d2h.a(this.f9010a.keys[i]);
            if (j4h.a(k3, k2)) {
                return k2;
            }
            this.f9010a.replaceKeyInEntry(this.c, k2, false);
            return k3;
        }
    }

    public final class c extends h<K, V, Map.Entry<K, V>> {
        public c() {
            super(HashBiMap.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int iFindEntryByKey = HashBiMap.this.findEntryByKey(key);
            return iFindEntryByKey != -1 && j4h.a(value, HashBiMap.this.values[iFindEntryByKey]);
        }

        @Override // com.google.common.collect.HashBiMap.h
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> e(int i) {
            return new a(i);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int iD = qlb.d(key);
            int iFindEntryByKey = HashBiMap.this.findEntryByKey(key, iD);
            if (iFindEntryByKey == -1 || !j4h.a(value, HashBiMap.this.values[iFindEntryByKey])) {
                return false;
            }
            HashBiMap.this.removeEntryKeyHashKnown(iFindEntryByKey, iD);
            return true;
        }
    }

    public static class d<K, V> extends AbstractMap<V, K> implements ri2<V, K>, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HashBiMap<K, V> f9013a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public transient Set<Map.Entry<V, K>> f9014b;

        public d(HashBiMap<K, V> hashBiMap) {
            this.f9013a = hashBiMap;
        }

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            ((HashBiMap) this.f9013a).inverse = this;
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Set<K> values() {
            return this.f9013a.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            this.f9013a.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return this.f9013a.containsValue(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsValue(Object obj) {
            return this.f9013a.containsKey(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<V, K>> entrySet() {
            Set<Map.Entry<V, K>> set = this.f9014b;
            if (set != null) {
                return set;
            }
            e eVar = new e(this.f9013a);
            this.f9014b = eVar;
            return eVar;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public K get(Object obj) {
            return this.f9013a.getInverse(obj);
        }

        @Override // defpackage.ri2
        public ri2<K, V> inverse() {
            return this.f9013a;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<V> keySet() {
            return this.f9013a.values();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public K put(V v, K k2) {
            return this.f9013a.putInverse(v, k2, false);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public K remove(Object obj) {
            return this.f9013a.removeInverse(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f9013a.size;
        }
    }

    public static class e<K, V> extends h<K, V, Map.Entry<V, K>> {
        public e(HashBiMap<K, V> hashBiMap) {
            super(hashBiMap);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int iFindEntryByValue = this.f9017a.findEntryByValue(key);
            return iFindEntryByValue != -1 && j4h.a(this.f9017a.keys[iFindEntryByValue], value);
        }

        @Override // com.google.common.collect.HashBiMap.h
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Map.Entry<V, K> e(int i) {
            return new b(this.f9017a, i);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int iD = qlb.d(key);
            int iFindEntryByValue = this.f9017a.findEntryByValue(key, iD);
            if (iFindEntryByValue == -1 || !j4h.a(this.f9017a.keys[iFindEntryByValue], value)) {
                return false;
            }
            this.f9017a.removeEntryValueHashKnown(iFindEntryByValue, iD);
            return true;
        }
    }

    public final class f extends h<K, V, K> {
        public f() {
            super(HashBiMap.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return HashBiMap.this.containsKey(obj);
        }

        @Override // com.google.common.collect.HashBiMap.h
        public K e(int i) {
            return (K) d2h.a(HashBiMap.this.keys[i]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int iD = qlb.d(obj);
            int iFindEntryByKey = HashBiMap.this.findEntryByKey(obj, iD);
            if (iFindEntryByKey == -1) {
                return false;
            }
            HashBiMap.this.removeEntryKeyHashKnown(iFindEntryByKey, iD);
            return true;
        }
    }

    public final class g extends h<K, V, V> {
        public g() {
            super(HashBiMap.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return HashBiMap.this.containsValue(obj);
        }

        @Override // com.google.common.collect.HashBiMap.h
        public V e(int i) {
            return (V) d2h.a(HashBiMap.this.values[i]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int iD = qlb.d(obj);
            int iFindEntryByValue = HashBiMap.this.findEntryByValue(obj, iD);
            if (iFindEntryByValue == -1) {
                return false;
            }
            HashBiMap.this.removeEntryValueHashKnown(iFindEntryByValue, iD);
            return true;
        }
    }

    public static abstract class h<K, V, T> extends AbstractSet<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HashBiMap<K, V> f9017a;

        public class a implements Iterator<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f9018a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f9019b = -1;
            public int c;
            public int d;

            public a() {
                this.f9018a = ((HashBiMap) h.this.f9017a).firstInInsertionOrder;
                HashBiMap<K, V> hashBiMap = h.this.f9017a;
                this.c = hashBiMap.modCount;
                this.d = hashBiMap.size;
            }

            public final void a() {
                if (h.this.f9017a.modCount != this.c) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                a();
                return this.f9018a != -2 && this.d > 0;
            }

            @Override // java.util.Iterator
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                T t = (T) h.this.e(this.f9018a);
                this.f9019b = this.f9018a;
                this.f9018a = ((HashBiMap) h.this.f9017a).nextInInsertionOrder[this.f9018a];
                this.d--;
                return t;
            }

            @Override // java.util.Iterator
            public void remove() {
                a();
                d44.e(this.f9019b != -1);
                h.this.f9017a.removeEntry(this.f9019b);
                int i = this.f9018a;
                HashBiMap<K, V> hashBiMap = h.this.f9017a;
                if (i == hashBiMap.size) {
                    this.f9018a = this.f9019b;
                }
                this.f9019b = -1;
                this.c = hashBiMap.modCount;
            }
        }

        public h(HashBiMap<K, V> hashBiMap) {
            this.f9017a = hashBiMap;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.f9017a.clear();
        }

        public abstract T e(int i);

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<T> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f9017a.size;
        }
    }

    private HashBiMap(int i) {
        init(i);
    }

    private int bucket(int i) {
        return i & (this.hashTableKToV.length - 1);
    }

    public static <K, V> HashBiMap<K, V> create() {
        return create(16);
    }

    private static int[] createFilledWithAbsent(int i) {
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    private void deleteFromTableKToV(int i, int i2) {
        c6i.d(i != -1);
        int iBucket = bucket(i2);
        int[] iArr = this.hashTableKToV;
        int i3 = iArr[iBucket];
        if (i3 == i) {
            int[] iArr2 = this.nextInBucketKToV;
            iArr[iBucket] = iArr2[i];
            iArr2[i] = -1;
            return;
        }
        int i4 = this.nextInBucketKToV[i3];
        while (true) {
            int i5 = i3;
            i3 = i4;
            if (i3 == -1) {
                String strValueOf = String.valueOf(this.keys[i]);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 32);
                sb.append("Expected to find entry with key ");
                sb.append(strValueOf);
                throw new AssertionError(sb.toString());
            }
            if (i3 == i) {
                int[] iArr3 = this.nextInBucketKToV;
                iArr3[i5] = iArr3[i];
                iArr3[i] = -1;
                return;
            }
            i4 = this.nextInBucketKToV[i3];
        }
    }

    private void deleteFromTableVToK(int i, int i2) {
        c6i.d(i != -1);
        int iBucket = bucket(i2);
        int[] iArr = this.hashTableVToK;
        int i3 = iArr[iBucket];
        if (i3 == i) {
            int[] iArr2 = this.nextInBucketVToK;
            iArr[iBucket] = iArr2[i];
            iArr2[i] = -1;
            return;
        }
        int i4 = this.nextInBucketVToK[i3];
        while (true) {
            int i5 = i3;
            i3 = i4;
            if (i3 == -1) {
                String strValueOf = String.valueOf(this.values[i]);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 34);
                sb.append("Expected to find entry with value ");
                sb.append(strValueOf);
                throw new AssertionError(sb.toString());
            }
            if (i3 == i) {
                int[] iArr3 = this.nextInBucketVToK;
                iArr3[i5] = iArr3[i];
                iArr3[i] = -1;
                return;
            }
            i4 = this.nextInBucketVToK[i3];
        }
    }

    private void ensureCapacity(int i) {
        int[] iArr = this.nextInBucketKToV;
        if (iArr.length < i) {
            int iE = ImmutableCollection.b.e(iArr.length, i);
            this.keys = (K[]) Arrays.copyOf(this.keys, iE);
            this.values = (V[]) Arrays.copyOf(this.values, iE);
            this.nextInBucketKToV = expandAndFillWithAbsent(this.nextInBucketKToV, iE);
            this.nextInBucketVToK = expandAndFillWithAbsent(this.nextInBucketVToK, iE);
            this.prevInInsertionOrder = expandAndFillWithAbsent(this.prevInInsertionOrder, iE);
            this.nextInInsertionOrder = expandAndFillWithAbsent(this.nextInInsertionOrder, iE);
        }
        if (this.hashTableKToV.length < i) {
            int iA = qlb.a(i, 1.0d);
            this.hashTableKToV = createFilledWithAbsent(iA);
            this.hashTableVToK = createFilledWithAbsent(iA);
            for (int i2 = 0; i2 < this.size; i2++) {
                int iBucket = bucket(qlb.d(this.keys[i2]));
                int[] iArr2 = this.nextInBucketKToV;
                int[] iArr3 = this.hashTableKToV;
                iArr2[i2] = iArr3[iBucket];
                iArr3[iBucket] = i2;
                int iBucket2 = bucket(qlb.d(this.values[i2]));
                int[] iArr4 = this.nextInBucketVToK;
                int[] iArr5 = this.hashTableVToK;
                iArr4[i2] = iArr5[iBucket2];
                iArr5[iBucket2] = i2;
            }
        }
    }

    private static int[] expandAndFillWithAbsent(int[] iArr, int i) {
        int length = iArr.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, i);
        Arrays.fill(iArrCopyOf, length, i, -1);
        return iArrCopyOf;
    }

    private void insertIntoTableKToV(int i, int i2) {
        c6i.d(i != -1);
        int iBucket = bucket(i2);
        int[] iArr = this.nextInBucketKToV;
        int[] iArr2 = this.hashTableKToV;
        iArr[i] = iArr2[iBucket];
        iArr2[iBucket] = i;
    }

    private void insertIntoTableVToK(int i, int i2) {
        c6i.d(i != -1);
        int iBucket = bucket(i2);
        int[] iArr = this.nextInBucketVToK;
        int[] iArr2 = this.hashTableVToK;
        iArr[i] = iArr2[iBucket];
        iArr2[iBucket] = i;
    }

    private void moveEntryToIndex(int i, int i2) {
        int i3;
        int i4;
        if (i == i2) {
            return;
        }
        int i5 = this.prevInInsertionOrder[i];
        int i6 = this.nextInInsertionOrder[i];
        setSucceeds(i5, i2);
        setSucceeds(i2, i6);
        K[] kArr = this.keys;
        K k2 = kArr[i];
        V[] vArr = this.values;
        V v = vArr[i];
        kArr[i2] = k2;
        vArr[i2] = v;
        int iBucket = bucket(qlb.d(k2));
        int[] iArr = this.hashTableKToV;
        int i7 = iArr[iBucket];
        if (i7 == i) {
            iArr[iBucket] = i2;
        } else {
            int i8 = this.nextInBucketKToV[i7];
            while (true) {
                i3 = i7;
                i7 = i8;
                if (i7 == i) {
                    break;
                } else {
                    i8 = this.nextInBucketKToV[i7];
                }
            }
            this.nextInBucketKToV[i3] = i2;
        }
        int[] iArr2 = this.nextInBucketKToV;
        iArr2[i2] = iArr2[i];
        iArr2[i] = -1;
        int iBucket2 = bucket(qlb.d(v));
        int[] iArr3 = this.hashTableVToK;
        int i9 = iArr3[iBucket2];
        if (i9 == i) {
            iArr3[iBucket2] = i2;
        } else {
            int i10 = this.nextInBucketVToK[i9];
            while (true) {
                i4 = i9;
                i9 = i10;
                if (i9 == i) {
                    break;
                } else {
                    i10 = this.nextInBucketVToK[i9];
                }
            }
            this.nextInBucketVToK[i4] = i2;
        }
        int[] iArr4 = this.nextInBucketVToK;
        iArr4[i2] = iArr4[i];
        iArr4[i] = -1;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int iH = g0.h(objectInputStream);
        init(16);
        g0.c(this, objectInputStream, iH);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void replaceKeyInEntry(int i, K k2, boolean z) {
        int i2;
        c6i.d(i != -1);
        int iD = qlb.d(k2);
        int iFindEntryByKey = findEntryByKey(k2, iD);
        int i3 = this.lastInInsertionOrder;
        if (iFindEntryByKey == -1) {
            i2 = -2;
        } else {
            if (!z) {
                String strValueOf = String.valueOf(k2);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 28);
                sb.append("Key already present in map: ");
                sb.append(strValueOf);
                throw new IllegalArgumentException(sb.toString());
            }
            i3 = this.prevInInsertionOrder[iFindEntryByKey];
            i2 = this.nextInInsertionOrder[iFindEntryByKey];
            removeEntryKeyHashKnown(iFindEntryByKey, iD);
            if (i == this.size) {
                i = iFindEntryByKey;
            }
        }
        if (i3 == i) {
            i3 = this.prevInInsertionOrder[i];
        } else if (i3 == this.size) {
            i3 = iFindEntryByKey;
        }
        if (i2 == i) {
            iFindEntryByKey = this.nextInInsertionOrder[i];
        } else if (i2 != this.size) {
            iFindEntryByKey = i2;
        }
        setSucceeds(this.prevInInsertionOrder[i], this.nextInInsertionOrder[i]);
        deleteFromTableKToV(i, qlb.d(this.keys[i]));
        this.keys[i] = k2;
        insertIntoTableKToV(i, qlb.d(k2));
        setSucceeds(i3, i);
        setSucceeds(i, iFindEntryByKey);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void replaceValueInEntry(int i, V v, boolean z) {
        c6i.d(i != -1);
        int iD = qlb.d(v);
        int iFindEntryByValue = findEntryByValue(v, iD);
        if (iFindEntryByValue != -1) {
            if (!z) {
                String strValueOf = String.valueOf(v);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 30);
                sb.append("Value already present in map: ");
                sb.append(strValueOf);
                throw new IllegalArgumentException(sb.toString());
            }
            removeEntryValueHashKnown(iFindEntryByValue, iD);
            if (i == this.size) {
                i = iFindEntryByValue;
            }
        }
        deleteFromTableVToK(i, qlb.d(this.values[i]));
        this.values[i] = v;
        insertIntoTableVToK(i, iD);
    }

    private void setSucceeds(int i, int i2) {
        if (i == -2) {
            this.firstInInsertionOrder = i2;
        } else {
            this.nextInInsertionOrder[i] = i2;
        }
        if (i2 == -2) {
            this.lastInInsertionOrder = i;
        } else {
            this.prevInInsertionOrder[i2] = i;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        g0.i(this, objectOutputStream);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Arrays.fill(this.keys, 0, this.size, (Object) null);
        Arrays.fill(this.values, 0, this.size, (Object) null);
        Arrays.fill(this.hashTableKToV, -1);
        Arrays.fill(this.hashTableVToK, -1);
        Arrays.fill(this.nextInBucketKToV, 0, this.size, -1);
        Arrays.fill(this.nextInBucketVToK, 0, this.size, -1);
        Arrays.fill(this.prevInInsertionOrder, 0, this.size, -1);
        Arrays.fill(this.nextInInsertionOrder, 0, this.size, -1);
        this.size = 0;
        this.firstInInsertionOrder = -2;
        this.lastInInsertionOrder = -2;
        this.modCount++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return findEntryByKey(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        return findEntryByValue(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.entrySet;
        if (set != null) {
            return set;
        }
        c cVar = new c();
        this.entrySet = cVar;
        return cVar;
    }

    public int findEntry(Object obj, int i, int[] iArr, int[] iArr2, Object[] objArr) {
        int i2 = iArr[bucket(i)];
        while (i2 != -1) {
            if (j4h.a(objArr[i2], obj)) {
                return i2;
            }
            i2 = iArr2[i2];
        }
        return -1;
    }

    public int findEntryByKey(Object obj) {
        return findEntryByKey(obj, qlb.d(obj));
    }

    public int findEntryByValue(Object obj) {
        return findEntryByValue(obj, qlb.d(obj));
    }

    public V forcePut(K k2, V v) {
        return put(k2, v, true);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        int iFindEntryByKey = findEntryByKey(obj);
        if (iFindEntryByKey == -1) {
            return null;
        }
        return this.values[iFindEntryByKey];
    }

    public K getInverse(Object obj) {
        int iFindEntryByValue = findEntryByValue(obj);
        if (iFindEntryByValue == -1) {
            return null;
        }
        return this.keys[iFindEntryByValue];
    }

    public void init(int i) {
        d44.b(i, "expectedSize");
        int iA = qlb.a(i, 1.0d);
        this.size = 0;
        this.keys = (K[]) new Object[i];
        this.values = (V[]) new Object[i];
        this.hashTableKToV = createFilledWithAbsent(iA);
        this.hashTableVToK = createFilledWithAbsent(iA);
        this.nextInBucketKToV = createFilledWithAbsent(i);
        this.nextInBucketVToK = createFilledWithAbsent(i);
        this.firstInInsertionOrder = -2;
        this.lastInInsertionOrder = -2;
        this.prevInInsertionOrder = createFilledWithAbsent(i);
        this.nextInInsertionOrder = createFilledWithAbsent(i);
    }

    @Override // defpackage.ri2
    public ri2<V, K> inverse() {
        ri2<V, K> ri2Var = this.inverse;
        if (ri2Var != null) {
            return ri2Var;
        }
        d dVar = new d(this);
        this.inverse = dVar;
        return dVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.keySet;
        if (set != null) {
            return set;
        }
        f fVar = new f();
        this.keySet = fVar;
        return fVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k2, V v) {
        return put(k2, v, false);
    }

    public K putInverse(V v, K k2, boolean z) {
        int iD = qlb.d(v);
        int iFindEntryByValue = findEntryByValue(v, iD);
        if (iFindEntryByValue != -1) {
            K k3 = this.keys[iFindEntryByValue];
            if (j4h.a(k3, k2)) {
                return k2;
            }
            replaceKeyInEntry(iFindEntryByValue, k2, z);
            return k3;
        }
        int i = this.lastInInsertionOrder;
        int iD2 = qlb.d(k2);
        int iFindEntryByKey = findEntryByKey(k2, iD2);
        if (!z) {
            c6i.j(iFindEntryByKey == -1, "Key already present: %s", k2);
        } else if (iFindEntryByKey != -1) {
            i = this.prevInInsertionOrder[iFindEntryByKey];
            removeEntryKeyHashKnown(iFindEntryByKey, iD2);
        }
        ensureCapacity(this.size + 1);
        K[] kArr = this.keys;
        int i2 = this.size;
        kArr[i2] = k2;
        this.values[i2] = v;
        insertIntoTableKToV(i2, iD2);
        insertIntoTableVToK(this.size, iD);
        int i3 = i == -2 ? this.firstInInsertionOrder : this.nextInInsertionOrder[i];
        setSucceeds(i, this.size);
        setSucceeds(this.size, i3);
        this.size++;
        this.modCount++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        int iD = qlb.d(obj);
        int iFindEntryByKey = findEntryByKey(obj, iD);
        if (iFindEntryByKey == -1) {
            return null;
        }
        V v = this.values[iFindEntryByKey];
        removeEntryKeyHashKnown(iFindEntryByKey, iD);
        return v;
    }

    public void removeEntry(int i) {
        removeEntryKeyHashKnown(i, qlb.d(this.keys[i]));
    }

    public void removeEntryKeyHashKnown(int i, int i2) {
        removeEntry(i, i2, qlb.d(this.values[i]));
    }

    public void removeEntryValueHashKnown(int i, int i2) {
        removeEntry(i, qlb.d(this.keys[i]), i2);
    }

    public K removeInverse(Object obj) {
        int iD = qlb.d(obj);
        int iFindEntryByValue = findEntryByValue(obj, iD);
        if (iFindEntryByValue == -1) {
            return null;
        }
        K k2 = this.keys[iFindEntryByValue];
        removeEntryValueHashKnown(iFindEntryByValue, iD);
        return k2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.size;
    }

    public static <K, V> HashBiMap<K, V> create(int i) {
        return new HashBiMap<>(i);
    }

    private void removeEntry(int i, int i2, int i3) {
        c6i.d(i != -1);
        deleteFromTableKToV(i, i2);
        deleteFromTableVToK(i, i3);
        setSucceeds(this.prevInInsertionOrder[i], this.nextInInsertionOrder[i]);
        moveEntryToIndex(this.size - 1, i);
        K[] kArr = this.keys;
        int i4 = this.size;
        kArr[i4 - 1] = null;
        this.values[i4 - 1] = null;
        this.size = i4 - 1;
        this.modCount++;
    }

    public int findEntryByKey(Object obj, int i) {
        return findEntry(obj, i, this.hashTableKToV, this.nextInBucketKToV, this.keys);
    }

    public int findEntryByValue(Object obj, int i) {
        return findEntry(obj, i, this.hashTableVToK, this.nextInBucketVToK, this.values);
    }

    public V put(K k2, V v, boolean z) {
        int iD = qlb.d(k2);
        int iFindEntryByKey = findEntryByKey(k2, iD);
        if (iFindEntryByKey != -1) {
            V v2 = this.values[iFindEntryByKey];
            if (j4h.a(v2, v)) {
                return v;
            }
            replaceValueInEntry(iFindEntryByKey, v, z);
            return v2;
        }
        int iD2 = qlb.d(v);
        int iFindEntryByValue = findEntryByValue(v, iD2);
        if (!z) {
            c6i.j(iFindEntryByValue == -1, "Value already present: %s", v);
        } else if (iFindEntryByValue != -1) {
            removeEntryValueHashKnown(iFindEntryByValue, iD2);
        }
        ensureCapacity(this.size + 1);
        K[] kArr = this.keys;
        int i = this.size;
        kArr[i] = k2;
        this.values[i] = v;
        insertIntoTableKToV(i, iD);
        insertIntoTableVToK(this.size, iD2);
        setSucceeds(this.lastInInsertionOrder, this.size);
        setSucceeds(this.size, -2);
        this.size++;
        this.modCount++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<V> values() {
        Set<V> set = this.valueSet;
        if (set != null) {
            return set;
        }
        g gVar = new g();
        this.valueSet = gVar;
        return gVar;
    }

    public static <K, V> HashBiMap<K, V> create(Map<? extends K, ? extends V> map) {
        HashBiMap<K, V> hashBiMapCreate = create(map.size());
        hashBiMapCreate.putAll(map);
        return hashBiMapCreate;
    }
}

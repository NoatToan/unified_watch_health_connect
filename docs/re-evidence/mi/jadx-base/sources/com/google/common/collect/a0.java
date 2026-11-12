package com.google.common.collect;

import defpackage.c6i;
import defpackage.d44;
import defpackage.qlb;
import defpackage.uaq;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import kotlin.UShort;

/* JADX INFO: loaded from: classes5.dex */
public final class a0<K, V> extends ImmutableMap<K, V> {
    public static final ImmutableMap<Object, Object> d = new a0(null, new Object[0], 0);
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient Object f9138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient Object[] f9139b;
    public final transient int c;

    public static class a<K, V> extends ImmutableSet<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final transient ImmutableMap<K, V> f9140a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final transient Object[] f9141b;
        public final transient int c;
        public final transient int d;

        /* JADX INFO: renamed from: com.google.common.collect.a0$a$a, reason: collision with other inner class name */
        public class C0230a extends ImmutableList<Map.Entry<K, V>> {
            public C0230a() {
            }

            @Override // java.util.List
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> get(int i) {
                c6i.m(i, a.this.d);
                int i2 = i * 2;
                Object obj = a.this.f9141b[a.this.c + i2];
                Objects.requireNonNull(obj);
                Object obj2 = a.this.f9141b[i2 + (a.this.c ^ 1)];
                Objects.requireNonNull(obj2);
                return new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }

            @Override // com.google.common.collect.ImmutableCollection
            public boolean isPartialView() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return a.this.d;
            }
        }

        public a(ImmutableMap<K, V> immutableMap, Object[] objArr, int i, int i2) {
            this.f9140a = immutableMap;
            this.f9141b = objArr;
            this.c = i;
            this.d = i2;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            return value != null && value.equals(this.f9140a.get(key));
        }

        @Override // com.google.common.collect.ImmutableCollection
        public int copyIntoArray(Object[] objArr, int i) {
            return asList().copyIntoArray(objArr, i);
        }

        @Override // com.google.common.collect.ImmutableSet
        public ImmutableList<Map.Entry<K, V>> createAsList() {
            return new C0230a();
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.d;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public uaq<Map.Entry<K, V>> iterator() {
            return asList().iterator();
        }
    }

    public static final class b<K> extends ImmutableSet<K> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final transient ImmutableMap<K, ?> f9143a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final transient ImmutableList<K> f9144b;

        public b(ImmutableMap<K, ?> immutableMap, ImmutableList<K> immutableList) {
            this.f9143a = immutableMap;
            this.f9144b = immutableList;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public ImmutableList<K> asList() {
            return this.f9144b;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return this.f9143a.get(obj) != null;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public int copyIntoArray(Object[] objArr, int i) {
            return asList().copyIntoArray(objArr, i);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f9143a.size();
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public uaq<K> iterator() {
            return asList().iterator();
        }
    }

    public static final class c extends ImmutableList<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final transient Object[] f9145a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final transient int f9146b;
        public final transient int c;

        public c(Object[] objArr, int i, int i2) {
            this.f9145a = objArr;
            this.f9146b = i;
            this.c = i2;
        }

        @Override // java.util.List
        public Object get(int i) {
            c6i.m(i, this.c);
            Object obj = this.f9145a[(i * 2) + this.f9146b];
            Objects.requireNonNull(obj);
            return obj;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.c;
        }
    }

    public a0(Object obj, Object[] objArr, int i) {
        this.f9138a = obj;
        this.f9139b = objArr;
        this.c = i;
    }

    public static <K, V> a0<K, V> a(int i, Object[] objArr) {
        return b(i, objArr, null);
    }

    public static <K, V> a0<K, V> b(int i, Object[] objArr, ImmutableMap.b<K, V> bVar) {
        if (i == 0) {
            return (a0) d;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[1];
            Objects.requireNonNull(obj2);
            d44.a(obj, obj2);
            return new a0<>(null, objArr, 1);
        }
        c6i.q(i, objArr.length >> 1);
        Object objC = c(objArr, i, ImmutableSet.chooseTableSize(i), 0);
        if (objC instanceof Object[]) {
            Object[] objArr2 = (Object[]) objC;
            ImmutableMap.b.a aVar = (ImmutableMap.b.a) objArr2[2];
            if (bVar == null) {
                throw aVar.a();
            }
            bVar.e = aVar;
            Object obj3 = objArr2[0];
            int iIntValue = ((Integer) objArr2[1]).intValue();
            objArr = Arrays.copyOf(objArr, iIntValue * 2);
            objC = obj3;
            i = iIntValue;
        }
        return new a0<>(objC, objArr, i);
    }

    public static Object c(Object[] objArr, int i, int i2, int i3) {
        ImmutableMap.b.a aVar = null;
        if (i == 1) {
            Object obj = objArr[i3];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[i3 ^ 1];
            Objects.requireNonNull(obj2);
            d44.a(obj, obj2);
            return null;
        }
        int i4 = i2 - 1;
        int i5 = 0;
        if (i2 <= 128) {
            byte[] bArr = new byte[i2];
            Arrays.fill(bArr, (byte) -1);
            int i6 = 0;
            while (i5 < i) {
                int i7 = (i5 * 2) + i3;
                int i8 = (i6 * 2) + i3;
                Object obj3 = objArr[i7];
                Objects.requireNonNull(obj3);
                Object obj4 = objArr[i7 ^ 1];
                Objects.requireNonNull(obj4);
                d44.a(obj3, obj4);
                int iC = qlb.c(obj3.hashCode());
                while (true) {
                    int i9 = iC & i4;
                    int i10 = bArr[i9] & 255;
                    if (i10 == 255) {
                        bArr[i9] = (byte) i8;
                        if (i6 < i5) {
                            objArr[i8] = obj3;
                            objArr[i8 ^ 1] = obj4;
                        }
                        i6++;
                        break;
                    }
                    if (obj3.equals(objArr[i10])) {
                        int i11 = i10 ^ 1;
                        Object obj5 = objArr[i11];
                        Objects.requireNonNull(obj5);
                        aVar = new ImmutableMap.b.a(obj3, obj4, obj5);
                        objArr[i11] = obj4;
                        break;
                    }
                    iC = i9 + 1;
                }
                i5++;
            }
            return i6 == i ? bArr : new Object[]{bArr, Integer.valueOf(i6), aVar};
        }
        if (i2 <= 32768) {
            short[] sArr = new short[i2];
            Arrays.fill(sArr, (short) -1);
            int i12 = 0;
            while (i5 < i) {
                int i13 = (i5 * 2) + i3;
                int i14 = (i12 * 2) + i3;
                Object obj6 = objArr[i13];
                Objects.requireNonNull(obj6);
                Object obj7 = objArr[i13 ^ 1];
                Objects.requireNonNull(obj7);
                d44.a(obj6, obj7);
                int iC2 = qlb.c(obj6.hashCode());
                while (true) {
                    int i15 = iC2 & i4;
                    int i16 = sArr[i15] & UShort.MAX_VALUE;
                    if (i16 == 65535) {
                        sArr[i15] = (short) i14;
                        if (i12 < i5) {
                            objArr[i14] = obj6;
                            objArr[i14 ^ 1] = obj7;
                        }
                        i12++;
                        break;
                    }
                    if (obj6.equals(objArr[i16])) {
                        int i17 = i16 ^ 1;
                        Object obj8 = objArr[i17];
                        Objects.requireNonNull(obj8);
                        aVar = new ImmutableMap.b.a(obj6, obj7, obj8);
                        objArr[i17] = obj7;
                        break;
                    }
                    iC2 = i15 + 1;
                }
                i5++;
            }
            return i12 == i ? sArr : new Object[]{sArr, Integer.valueOf(i12), aVar};
        }
        int[] iArr = new int[i2];
        Arrays.fill(iArr, -1);
        int i18 = 0;
        while (i5 < i) {
            int i19 = (i5 * 2) + i3;
            int i20 = (i18 * 2) + i3;
            Object obj9 = objArr[i19];
            Objects.requireNonNull(obj9);
            Object obj10 = objArr[i19 ^ 1];
            Objects.requireNonNull(obj10);
            d44.a(obj9, obj10);
            int iC3 = qlb.c(obj9.hashCode());
            while (true) {
                int i21 = iC3 & i4;
                int i22 = iArr[i21];
                if (i22 == -1) {
                    iArr[i21] = i20;
                    if (i18 < i5) {
                        objArr[i20] = obj9;
                        objArr[i20 ^ 1] = obj10;
                    }
                    i18++;
                    break;
                }
                if (obj9.equals(objArr[i22])) {
                    int i23 = i22 ^ 1;
                    Object obj11 = objArr[i23];
                    Objects.requireNonNull(obj11);
                    aVar = new ImmutableMap.b.a(obj9, obj10, obj11);
                    objArr[i23] = obj10;
                    break;
                }
                iC3 = i21 + 1;
            }
            i5++;
        }
        return i18 == i ? iArr : new Object[]{iArr, Integer.valueOf(i18), aVar};
    }

    public static Object d(Object[] objArr, int i, int i2, int i3) {
        Object objC = c(objArr, i, i2, i3);
        if (objC instanceof Object[]) {
            throw ((ImmutableMap.b.a) ((Object[]) objC)[2]).a();
        }
        return objC;
    }

    public static Object f(Object obj, Object[] objArr, int i, int i2, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i == 1) {
            Object obj3 = objArr[i2];
            Objects.requireNonNull(obj3);
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i2 ^ 1];
            Objects.requireNonNull(obj4);
            return obj4;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length - 1;
            int iC = qlb.c(obj2.hashCode());
            while (true) {
                int i3 = iC & length;
                int i4 = bArr[i3] & 255;
                if (i4 == 255) {
                    return null;
                }
                if (obj2.equals(objArr[i4])) {
                    return objArr[i4 ^ 1];
                }
                iC = i3 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length - 1;
            int iC2 = qlb.c(obj2.hashCode());
            while (true) {
                int i5 = iC2 & length2;
                int i6 = sArr[i5] & UShort.MAX_VALUE;
                if (i6 == 65535) {
                    return null;
                }
                if (obj2.equals(objArr[i6])) {
                    return objArr[i6 ^ 1];
                }
                iC2 = i5 + 1;
            }
        } else {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length - 1;
            int iC3 = qlb.c(obj2.hashCode());
            while (true) {
                int i7 = iC3 & length3;
                int i8 = iArr[i7];
                if (i8 == -1) {
                    return null;
                }
                if (obj2.equals(objArr[i8])) {
                    return objArr[i8 ^ 1];
                }
                iC3 = i7 + 1;
            }
        }
    }

    @Override // com.google.common.collect.ImmutableMap
    public ImmutableSet<Map.Entry<K, V>> createEntrySet() {
        return new a(this, this.f9139b, 0, this.c);
    }

    @Override // com.google.common.collect.ImmutableMap
    public ImmutableSet<K> createKeySet() {
        return new b(this, new c(this.f9139b, 0, this.c));
    }

    @Override // com.google.common.collect.ImmutableMap
    public ImmutableCollection<V> createValues() {
        return new c(this.f9139b, 1, this.c);
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public V get(Object obj) {
        V v = (V) f(this.f9138a, this.f9139b, this.c, 0, obj);
        if (v == null) {
            return null;
        }
        return v;
    }

    @Override // com.google.common.collect.ImmutableMap
    public boolean isPartialView() {
        return false;
    }

    @Override // java.util.Map
    public int size() {
        return this.c;
    }
}

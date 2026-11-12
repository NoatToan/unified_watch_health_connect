package defpackage;

import com.google.common.base.Preconditions;
import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.UnmodifiableIterator;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class anb<K, V> extends ImmutableMap<K, V> {
    public static final ImmutableMap<Object, Object> e = new anb(null, new Object[0], 0);
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient int f579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @CheckForNull
    private final transient Object f580b;
    final transient Object[] d;

    @Override // com.google.common.collect.ImmutableMap
    public boolean isPartialView() {
        return false;
    }

    public static <K, V> anb<K, V> c(int i, Object[] objArr) {
        return a(i, objArr, null);
    }

    public static <K, V> anb<K, V> a(int i, Object[] objArr, ImmutableMap.b<K, V> bVar) {
        if (i == 0) {
            return (anb) e;
        }
        if (i == 1) {
            ale.d(Objects.requireNonNull(objArr[0]), Objects.requireNonNull(objArr[1]));
            return new anb<>(null, objArr, 1);
        }
        Preconditions.checkPositionIndex(i, objArr.length >> 1);
        Object objD = d(objArr, i, ImmutableSet.chooseTableSize(i), 0);
        if (objD instanceof Object[]) {
            Object[] objArr2 = (Object[]) objD;
            ImmutableMap.b.C0045b c0045b = (ImmutableMap.b.C0045b) objArr2[2];
            if (bVar == null) {
                throw c0045b.d();
            }
            bVar.d = c0045b;
            Object obj = objArr2[0];
            int iIntValue = ((Integer) objArr2[1]).intValue();
            objArr = Arrays.copyOf(objArr, iIntValue * 2);
            objD = obj;
            i = iIntValue;
        }
        return new anb<>(objD, objArr, i);
    }

    @CheckForNull
    private static Object d(Object[] objArr, int i, int i2, int i3) {
        ImmutableMap.b.C0045b c0045b = null;
        if (i == 1) {
            ale.d(Objects.requireNonNull(objArr[i3]), Objects.requireNonNull(objArr[i3 ^ 1]));
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
                Object objRequireNonNull = Objects.requireNonNull(objArr[i7]);
                Object objRequireNonNull2 = Objects.requireNonNull(objArr[i7 ^ 1]);
                ale.d(objRequireNonNull, objRequireNonNull2);
                int iE = aly.e(objRequireNonNull.hashCode());
                while (true) {
                    int i9 = iE & i4;
                    int i10 = bArr[i9] & 255;
                    if (i10 == 255) {
                        bArr[i9] = (byte) i8;
                        if (i6 < i5) {
                            objArr[i8] = objRequireNonNull;
                            objArr[i8 ^ 1] = objRequireNonNull2;
                        }
                        i6++;
                        break;
                    }
                    if (objRequireNonNull.equals(objArr[i10])) {
                        int i11 = i10 ^ 1;
                        ImmutableMap.b.C0045b c0045b2 = new ImmutableMap.b.C0045b(objRequireNonNull, objRequireNonNull2, Objects.requireNonNull(objArr[i11]));
                        objArr[i11] = objRequireNonNull2;
                        c0045b = c0045b2;
                        break;
                    }
                    iE = i9 + 1;
                }
                i5++;
            }
            return i6 == i ? bArr : new Object[]{bArr, Integer.valueOf(i6), c0045b};
        }
        if (i2 <= 32768) {
            short[] sArr = new short[i2];
            Arrays.fill(sArr, (short) -1);
            int i12 = 0;
            while (i5 < i) {
                int i13 = (i5 * 2) + i3;
                int i14 = (i12 * 2) + i3;
                Object objRequireNonNull3 = Objects.requireNonNull(objArr[i13]);
                Object objRequireNonNull4 = Objects.requireNonNull(objArr[i13 ^ 1]);
                ale.d(objRequireNonNull3, objRequireNonNull4);
                int iE2 = aly.e(objRequireNonNull3.hashCode());
                while (true) {
                    int i15 = iE2 & i4;
                    int i16 = sArr[i15] & 65535;
                    if (i16 == 65535) {
                        sArr[i15] = (short) i14;
                        if (i12 < i5) {
                            objArr[i14] = objRequireNonNull3;
                            objArr[i14 ^ 1] = objRequireNonNull4;
                        }
                        i12++;
                        break;
                    }
                    if (objRequireNonNull3.equals(objArr[i16])) {
                        int i17 = i16 ^ 1;
                        ImmutableMap.b.C0045b c0045b3 = new ImmutableMap.b.C0045b(objRequireNonNull3, objRequireNonNull4, Objects.requireNonNull(objArr[i17]));
                        objArr[i17] = objRequireNonNull4;
                        c0045b = c0045b3;
                        break;
                    }
                    iE2 = i15 + 1;
                }
                i5++;
            }
            return i12 == i ? sArr : new Object[]{sArr, Integer.valueOf(i12), c0045b};
        }
        int[] iArr = new int[i2];
        Arrays.fill(iArr, -1);
        int i18 = 0;
        while (i5 < i) {
            int i19 = (i5 * 2) + i3;
            int i20 = (i18 * 2) + i3;
            Object objRequireNonNull5 = Objects.requireNonNull(objArr[i19]);
            Object objRequireNonNull6 = Objects.requireNonNull(objArr[i19 ^ 1]);
            ale.d(objRequireNonNull5, objRequireNonNull6);
            int iE3 = aly.e(objRequireNonNull5.hashCode());
            while (true) {
                int i21 = iE3 & i4;
                int i22 = iArr[i21];
                if (i22 == -1) {
                    iArr[i21] = i20;
                    if (i18 < i5) {
                        objArr[i20] = objRequireNonNull5;
                        objArr[i20 ^ 1] = objRequireNonNull6;
                    }
                    i18++;
                    break;
                }
                if (objRequireNonNull5.equals(objArr[i22])) {
                    int i23 = i22 ^ 1;
                    ImmutableMap.b.C0045b c0045b4 = new ImmutableMap.b.C0045b(objRequireNonNull5, objRequireNonNull6, Objects.requireNonNull(objArr[i23]));
                    objArr[i23] = objRequireNonNull6;
                    c0045b = c0045b4;
                    break;
                }
                iE3 = i21 + 1;
            }
            i5++;
        }
        return i18 == i ? iArr : new Object[]{iArr, Integer.valueOf(i18), c0045b};
    }

    @CheckForNull
    static Object a(Object[] objArr, int i, int i2, int i3) {
        Object objD = d(objArr, i, i2, i3);
        if (objD instanceof Object[]) {
            throw ((ImmutableMap.b.C0045b) ((Object[]) objD)[2]).d();
        }
        return objD;
    }

    private anb(@CheckForNull Object obj, Object[] objArr, int i) {
        this.f580b = obj;
        this.d = objArr;
        this.f579a = i;
    }

    @Override // java.util.Map
    public int size() {
        return this.f579a;
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    @CheckForNull
    public V get(@CheckForNull Object obj) {
        V v = (V) a(this.f580b, this.d, this.f579a, 0, obj);
        if (v == null) {
            return null;
        }
        return v;
    }

    @CheckForNull
    static Object a(@CheckForNull Object obj, Object[] objArr, int i, int i2, @CheckForNull Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i == 1) {
            if (Objects.requireNonNull(objArr[i2]).equals(obj2)) {
                return Objects.requireNonNull(objArr[i2 ^ 1]);
            }
            return null;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            int iE = aly.e(obj2.hashCode());
            while (true) {
                int i3 = iE & (length - 1);
                int i4 = bArr[i3] & 255;
                if (i4 == 255) {
                    return null;
                }
                if (obj2.equals(objArr[i4])) {
                    return objArr[i4 ^ 1];
                }
                iE = i3 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length;
            int iE2 = aly.e(obj2.hashCode());
            while (true) {
                int i5 = iE2 & (length2 - 1);
                int i6 = sArr[i5] & 65535;
                if (i6 == 65535) {
                    return null;
                }
                if (obj2.equals(objArr[i6])) {
                    return objArr[i6 ^ 1];
                }
                iE2 = i5 + 1;
            }
        } else {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length;
            int iE3 = aly.e(obj2.hashCode());
            while (true) {
                int i7 = iE3 & (length3 - 1);
                int i8 = iArr[i7];
                if (i8 == -1) {
                    return null;
                }
                if (obj2.equals(objArr[i8])) {
                    return objArr[i8 ^ 1];
                }
                iE3 = i7 + 1;
            }
        }
    }

    @Override // com.google.common.collect.ImmutableMap
    public ImmutableSet<Map.Entry<K, V>> createEntrySet() {
        return new e(this, this.d, 0, this.f579a);
    }

    static class e<K, V> extends ImmutableSet<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final transient Object[] f584a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final transient ImmutableMap<K, V> f585c;
        private final transient int d;
        private final transient int e;

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return true;
        }

        e(ImmutableMap<K, V> immutableMap, Object[] objArr, int i, int i2) {
            this.f585c = immutableMap;
            this.f584a = objArr;
            this.e = i;
            this.d = i2;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
        public UnmodifiableIterator<Map.Entry<K, V>> iterator() {
            return asList().iterator();
        }

        @Override // com.google.common.collect.ImmutableCollection
        public int copyIntoArray(Object[] objArr, int i) {
            return asList().copyIntoArray(objArr, i);
        }

        @Override // com.google.common.collect.ImmutableSet
        public ImmutableList<Map.Entry<K, V>> createAsList() {
            return new ImmutableList<Map.Entry<K, V>>() { // from class: anb.e.4
                @Override // com.google.common.collect.ImmutableCollection
                public boolean isPartialView() {
                    return true;
                }

                @Override // java.util.List
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public Map.Entry<K, V> get(int i) {
                    Preconditions.checkElementIndex(i, e.this.d);
                    int i2 = i * 2;
                    return new AbstractMap.SimpleImmutableEntry(Objects.requireNonNull(e.this.f584a[e.this.e + i2]), Objects.requireNonNull(e.this.f584a[i2 + (e.this.e ^ 1)]));
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public int size() {
                    return e.this.d;
                }

                @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
                public Object writeReplace() {
                    return super.writeReplace();
                }
            };
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            return value != null && value.equals(this.f585c.get(key));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.d;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    @Override // com.google.common.collect.ImmutableMap
    public ImmutableSet<K> createKeySet() {
        return new d(this, new a(this.d, 0, this.f579a));
    }

    static final class a extends ImmutableList<Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final transient int f581b;
        private final transient int d;
        private final transient Object[] e;

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return true;
        }

        a(Object[] objArr, int i, int i2) {
            this.e = objArr;
            this.d = i;
            this.f581b = i2;
        }

        @Override // java.util.List
        public Object get(int i) {
            Preconditions.checkElementIndex(i, this.f581b);
            return Objects.requireNonNull(this.e[(i * 2) + this.d]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f581b;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    static final class d<K> extends ImmutableSet<K> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final transient ImmutableMap<K, ?> f582a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final transient ImmutableList<K> f583c;

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return true;
        }

        d(ImmutableMap<K, ?> immutableMap, ImmutableList<K> immutableList) {
            this.f582a = immutableMap;
            this.f583c = immutableList;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
        public UnmodifiableIterator<K> iterator() {
            return asList().iterator();
        }

        @Override // com.google.common.collect.ImmutableCollection
        public int copyIntoArray(Object[] objArr, int i) {
            return asList().copyIntoArray(objArr, i);
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public ImmutableList<K> asList() {
            return this.f583c;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            return this.f582a.get(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f582a.size();
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    @Override // com.google.common.collect.ImmutableMap
    public ImmutableCollection<V> createValues() {
        return new a(this.d, 1, this.f579a);
    }

    @Override // com.google.common.collect.ImmutableMap
    public Object writeReplace() {
        return super.writeReplace();
    }
}

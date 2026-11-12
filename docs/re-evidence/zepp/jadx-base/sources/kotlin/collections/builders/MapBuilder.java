package kotlin.collections.builders;

import com.alipay.sdk.m.u.i;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.jvm.internal.markers.KMutableMap;
import kotlin.ranges.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
public final class MapBuilder<K, V> implements Map<K, V>, Serializable, KMutableMap {

    @NotNull
    private static final a m = new a(null);

    @Deprecated
    private static final int n = -1640531527;

    @Deprecated
    private static final int o = 8;

    @Deprecated
    private static final int p = 2;

    @Deprecated
    private static final int q = -1;

    @NotNull
    private K[] a;

    @Nullable
    private V[] b;

    @NotNull
    private int[] c;

    @NotNull
    private int[] d;
    private int e;
    private int f;
    private int g;
    private int h;

    @Nullable
    private MapBuilderKeys<K> i;

    @Nullable
    private MapBuilderValues<V> j;

    @Nullable
    private MapBuilderEntries<K, V> k;
    private boolean l;

    public static final class EntriesItr<K, V> extends Itr<K, V> implements Iterator<Map.Entry<K, V>>, KMutableIterator {
        public EntriesItr(@NotNull MapBuilder<K, V> mapBuilder) {
            super(mapBuilder);
        }

        public final void nextAppendString(@NotNull StringBuilder sb) {
            if (getIndex$kotlin_stdlib() >= ((MapBuilder) getMap$kotlin_stdlib()).f) {
                throw new NoSuchElementException();
            }
            int index$kotlin_stdlib = getIndex$kotlin_stdlib();
            setIndex$kotlin_stdlib(index$kotlin_stdlib + 1);
            setLastIndex$kotlin_stdlib(index$kotlin_stdlib);
            Object obj = ((MapBuilder) getMap$kotlin_stdlib()).a[getLastIndex$kotlin_stdlib()];
            if (Intrinsics.areEqual(obj, getMap$kotlin_stdlib())) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append(com.alipay.sdk.m.n.a.h);
            Object obj2 = ((MapBuilder) getMap$kotlin_stdlib()).b[getLastIndex$kotlin_stdlib()];
            if (Intrinsics.areEqual(obj2, getMap$kotlin_stdlib())) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            initNext$kotlin_stdlib();
        }

        public final int nextHashCode$kotlin_stdlib() {
            if (getIndex$kotlin_stdlib() >= ((MapBuilder) getMap$kotlin_stdlib()).f) {
                throw new NoSuchElementException();
            }
            int index$kotlin_stdlib = getIndex$kotlin_stdlib();
            setIndex$kotlin_stdlib(index$kotlin_stdlib + 1);
            setLastIndex$kotlin_stdlib(index$kotlin_stdlib);
            Object obj = ((MapBuilder) getMap$kotlin_stdlib()).a[getLastIndex$kotlin_stdlib()];
            int iHashCode = obj == null ? 0 : obj.hashCode();
            Object obj2 = ((MapBuilder) getMap$kotlin_stdlib()).b[getLastIndex$kotlin_stdlib()];
            int iHashCode2 = iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
            initNext$kotlin_stdlib();
            return iHashCode2;
        }

        @Override // java.util.Iterator
        @NotNull
        public EntryRef<K, V> next() {
            if (getIndex$kotlin_stdlib() >= ((MapBuilder) getMap$kotlin_stdlib()).f) {
                throw new NoSuchElementException();
            }
            int index$kotlin_stdlib = getIndex$kotlin_stdlib();
            setIndex$kotlin_stdlib(index$kotlin_stdlib + 1);
            setLastIndex$kotlin_stdlib(index$kotlin_stdlib);
            EntryRef<K, V> entryRef = new EntryRef<>(getMap$kotlin_stdlib(), getLastIndex$kotlin_stdlib());
            initNext$kotlin_stdlib();
            return entryRef;
        }
    }

    public static final class EntryRef<K, V> implements Map.Entry<K, V>, KMutableMap.Entry {

        @NotNull
        private final MapBuilder<K, V> a;
        private final int b;

        public EntryRef(@NotNull MapBuilder<K, V> mapBuilder, int i) {
            this.a = mapBuilder;
            this.b = i;
        }

        @Override // java.util.Map.Entry
        public boolean equals(@Nullable Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (Intrinsics.areEqual(entry.getKey(), getKey()) && Intrinsics.areEqual(entry.getValue(), getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return (K) ((MapBuilder) this.a).a[this.b];
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return (V) ((MapBuilder) this.a).b[this.b];
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K key = getKey();
            int iHashCode = key == null ? 0 : key.hashCode();
            V value = getValue();
            return iHashCode ^ (value != null ? value.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            this.a.checkIsMutable$kotlin_stdlib();
            Object[] objArrA = this.a.a();
            int i = this.b;
            V v2 = (V) objArrA[i];
            objArrA[i] = v;
            return v2;
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append(com.alipay.sdk.m.n.a.h);
            sb.append(getValue());
            return sb.toString();
        }
    }

    public static class Itr<K, V> {

        @NotNull
        private final MapBuilder<K, V> a;
        private int b;
        private int c = -1;

        public Itr(@NotNull MapBuilder<K, V> mapBuilder) {
            this.a = mapBuilder;
            initNext$kotlin_stdlib();
        }

        public final int getIndex$kotlin_stdlib() {
            return this.b;
        }

        public final int getLastIndex$kotlin_stdlib() {
            return this.c;
        }

        @NotNull
        public final MapBuilder<K, V> getMap$kotlin_stdlib() {
            return this.a;
        }

        public final boolean hasNext() {
            return this.b < ((MapBuilder) this.a).f;
        }

        public final void initNext$kotlin_stdlib() {
            while (this.b < ((MapBuilder) this.a).f) {
                int[] iArr = ((MapBuilder) this.a).c;
                int i = this.b;
                if (iArr[i] >= 0) {
                    return;
                } else {
                    this.b = i + 1;
                }
            }
        }

        public final void remove() {
            if (!(this.c != -1)) {
                throw new IllegalStateException("Call next() before removing element from the iterator.".toString());
            }
            this.a.checkIsMutable$kotlin_stdlib();
            this.a.s(this.c);
            this.c = -1;
        }

        public final void setIndex$kotlin_stdlib(int i) {
            this.b = i;
        }

        public final void setLastIndex$kotlin_stdlib(int i) {
            this.c = i;
        }
    }

    public static final class KeysItr<K, V> extends Itr<K, V> implements Iterator<K>, KMutableIterator {
        public KeysItr(@NotNull MapBuilder<K, V> mapBuilder) {
            super(mapBuilder);
        }

        @Override // java.util.Iterator
        public K next() {
            if (getIndex$kotlin_stdlib() >= ((MapBuilder) getMap$kotlin_stdlib()).f) {
                throw new NoSuchElementException();
            }
            int index$kotlin_stdlib = getIndex$kotlin_stdlib();
            setIndex$kotlin_stdlib(index$kotlin_stdlib + 1);
            setLastIndex$kotlin_stdlib(index$kotlin_stdlib);
            K k = (K) ((MapBuilder) getMap$kotlin_stdlib()).a[getLastIndex$kotlin_stdlib()];
            initNext$kotlin_stdlib();
            return k;
        }
    }

    public static final class ValuesItr<K, V> extends Itr<K, V> implements Iterator<V>, KMutableIterator {
        public ValuesItr(@NotNull MapBuilder<K, V> mapBuilder) {
            super(mapBuilder);
        }

        @Override // java.util.Iterator
        public V next() {
            if (getIndex$kotlin_stdlib() >= ((MapBuilder) getMap$kotlin_stdlib()).f) {
                throw new NoSuchElementException();
            }
            int index$kotlin_stdlib = getIndex$kotlin_stdlib();
            setIndex$kotlin_stdlib(index$kotlin_stdlib + 1);
            setLastIndex$kotlin_stdlib(index$kotlin_stdlib);
            V v = (V) ((MapBuilder) getMap$kotlin_stdlib()).b[getLastIndex$kotlin_stdlib()];
            initNext$kotlin_stdlib();
            return v;
        }
    }

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int c(int i) {
            return Integer.highestOneBit(e.coerceAtLeast(i, 1) * 3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int d(int i) {
            return Integer.numberOfLeadingZeros(i) + 1;
        }
    }

    private MapBuilder(K[] kArr, V[] vArr, int[] iArr, int[] iArr2, int i, int i2) {
        this.a = kArr;
        this.b = vArr;
        this.c = iArr;
        this.d = iArr2;
        this.e = i;
        this.f = i2;
        this.g = m.d(k());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V[] a() {
        V[] vArr = this.b;
        if (vArr != null) {
            return vArr;
        }
        V[] vArr2 = (V[]) ListBuilderKt.arrayOfUninitializedElements(j());
        this.b = vArr2;
        return vArr2;
    }

    private final void c() {
        int i;
        V[] vArr = this.b;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f;
            if (i2 >= i) {
                break;
            }
            if (this.c[i2] >= 0) {
                K[] kArr = this.a;
                kArr[i3] = kArr[i2];
                if (vArr != null) {
                    vArr[i3] = vArr[i2];
                }
                i3++;
            }
            i2++;
        }
        ListBuilderKt.resetRange(this.a, i3, i);
        if (vArr != null) {
            ListBuilderKt.resetRange(vArr, i3, this.f);
        }
        this.f = i3;
    }

    private final boolean e(Map<?, ?> map) {
        return size() == map.size() && containsAllEntries$kotlin_stdlib(map.entrySet());
    }

    private final void f(int i) {
        if (i < 0) {
            throw new OutOfMemoryError();
        }
        if (i <= j()) {
            if ((this.f + i) - size() > j()) {
                q(k());
                return;
            }
            return;
        }
        int iJ = (j() * 3) / 2;
        if (i <= iJ) {
            i = iJ;
        }
        this.a = (K[]) ListBuilderKt.copyOfUninitializedElements(this.a, i);
        V[] vArr = this.b;
        this.b = vArr == null ? null : (V[]) ListBuilderKt.copyOfUninitializedElements(vArr, i);
        this.c = Arrays.copyOf(this.c, i);
        int iC = m.c(i);
        if (iC > k()) {
            q(iC);
        }
    }

    private final void g(int i) {
        f(this.f + i);
    }

    private final int h(K k) {
        int iM = m(k);
        int i = this.e;
        while (true) {
            int i2 = this.d[iM];
            if (i2 == 0) {
                return -1;
            }
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (Intrinsics.areEqual(this.a[i3], k)) {
                    return i3;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            iM = iM == 0 ? k() - 1 : iM - 1;
        }
    }

    private final int i(V v) {
        int i = this.f;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.c[i] >= 0 && Intrinsics.areEqual(this.b[i], v)) {
                return i;
            }
        }
    }

    private final int j() {
        return this.a.length;
    }

    private final int k() {
        return this.d.length;
    }

    private final int m(K k) {
        return ((k == null ? 0 : k.hashCode()) * n) >>> this.g;
    }

    private final boolean n(Collection<? extends Map.Entry<? extends K, ? extends V>> collection) {
        boolean z = false;
        if (collection.isEmpty()) {
            return false;
        }
        g(collection.size());
        Iterator<? extends Map.Entry<? extends K, ? extends V>> it2 = collection.iterator();
        while (it2.hasNext()) {
            if (o(it2.next())) {
                z = true;
            }
        }
        return z;
    }

    private final boolean o(Map.Entry<? extends K, ? extends V> entry) {
        int iAddKey$kotlin_stdlib = addKey$kotlin_stdlib(entry.getKey());
        V[] vArrA = a();
        if (iAddKey$kotlin_stdlib >= 0) {
            vArrA[iAddKey$kotlin_stdlib] = entry.getValue();
            return true;
        }
        int i = (-iAddKey$kotlin_stdlib) - 1;
        if (Intrinsics.areEqual(entry.getValue(), vArrA[i])) {
            return false;
        }
        vArrA[i] = entry.getValue();
        return true;
    }

    private final boolean p(int i) {
        int iM = m(this.a[i]);
        int i2 = this.e;
        while (true) {
            int[] iArr = this.d;
            if (iArr[iM] == 0) {
                iArr[iM] = i + 1;
                this.c[i] = iM;
                return true;
            }
            i2--;
            if (i2 < 0) {
                return false;
            }
            iM = iM == 0 ? k() - 1 : iM - 1;
        }
    }

    private final void q(int i) {
        if (this.f > size()) {
            c();
        }
        int i2 = 0;
        if (i != k()) {
            this.d = new int[i];
            this.g = m.d(i);
        } else {
            ArraysKt___ArraysJvmKt.fill(this.d, 0, 0, k());
        }
        while (i2 < this.f) {
            int i3 = i2 + 1;
            if (!p(i2)) {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
            i2 = i3;
        }
    }

    private final void r(int i) {
        int iCoerceAtMost = e.coerceAtMost(this.e * 2, k() / 2);
        int i2 = 0;
        int i3 = i;
        do {
            i = i == 0 ? k() - 1 : i - 1;
            i2++;
            if (i2 > this.e) {
                this.d[i3] = 0;
                return;
            }
            int[] iArr = this.d;
            int i4 = iArr[i];
            if (i4 == 0) {
                iArr[i3] = 0;
                return;
            }
            if (i4 < 0) {
                iArr[i3] = -1;
            } else {
                int i5 = i4 - 1;
                if (((m(this.a[i5]) - i) & (k() - 1)) >= i2) {
                    this.d[i3] = i4;
                    this.c[i5] = i3;
                }
                iCoerceAtMost--;
            }
            i3 = i;
            i2 = 0;
            iCoerceAtMost--;
        } while (iCoerceAtMost >= 0);
        this.d[i3] = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(int i) {
        ListBuilderKt.resetAt(this.a, i);
        r(this.c[i]);
        this.c[i] = -1;
        this.h = size() - 1;
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.l) {
            return new SerializedMap(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    public final int addKey$kotlin_stdlib(K k) {
        checkIsMutable$kotlin_stdlib();
        while (true) {
            int iM = m(k);
            int iCoerceAtMost = e.coerceAtMost(this.e * 2, k() / 2);
            int i = 0;
            while (true) {
                int i2 = this.d[iM];
                if (i2 <= 0) {
                    if (this.f >= j()) {
                        g(1);
                        break;
                    }
                    int i3 = this.f;
                    int i4 = i3 + 1;
                    this.f = i4;
                    this.a[i3] = k;
                    this.c[i3] = iM;
                    this.d[iM] = i4;
                    this.h = size() + 1;
                    if (i > this.e) {
                        this.e = i;
                    }
                    return i3;
                }
                if (Intrinsics.areEqual(this.a[i2 - 1], k)) {
                    return -i2;
                }
                i++;
                if (i > iCoerceAtMost) {
                    q(k() * 2);
                    break;
                }
                iM = iM == 0 ? k() - 1 : iM - 1;
            }
        }
    }

    @NotNull
    public final Map<K, V> build() {
        checkIsMutable$kotlin_stdlib();
        this.l = true;
        return this;
    }

    public final void checkIsMutable$kotlin_stdlib() {
        if (this.l) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public void clear() {
        checkIsMutable$kotlin_stdlib();
        int i = this.f - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                int[] iArr = this.c;
                int i4 = iArr[i2];
                if (i4 >= 0) {
                    this.d[i4] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2 = i3;
                }
            }
        }
        ListBuilderKt.resetRange(this.a, 0, this.f);
        V[] vArr = this.b;
        if (vArr != null) {
            ListBuilderKt.resetRange(vArr, 0, this.f);
        }
        this.h = 0;
        this.f = 0;
    }

    public final boolean containsAllEntries$kotlin_stdlib(@NotNull Collection<?> collection) {
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    if (!containsEntry$kotlin_stdlib((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean containsEntry$kotlin_stdlib(@NotNull Map.Entry<? extends K, ? extends V> entry) {
        int iH = h(entry.getKey());
        if (iH < 0) {
            return false;
        }
        return Intrinsics.areEqual(this.b[iH], entry.getValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return h(obj) >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return i(obj) >= 0;
    }

    @NotNull
    public final EntriesItr<K, V> entriesIterator$kotlin_stdlib() {
        return new EntriesItr<>(this);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public boolean equals(@Nullable Object obj) {
        return obj == this || ((obj instanceof Map) && e((Map) obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    @Nullable
    public V get(Object obj) {
        int iH = h(obj);
        if (iH < 0) {
            return null;
        }
        return this.b[iH];
    }

    @NotNull
    public Set<Map.Entry<K, V>> getEntries() {
        MapBuilderEntries<K, V> mapBuilderEntries = this.k;
        if (mapBuilderEntries != null) {
            return mapBuilderEntries;
        }
        MapBuilderEntries<K, V> mapBuilderEntries2 = new MapBuilderEntries<>(this);
        this.k = mapBuilderEntries2;
        return mapBuilderEntries2;
    }

    @NotNull
    public Set<K> getKeys() {
        MapBuilderKeys<K> mapBuilderKeys = this.i;
        if (mapBuilderKeys != null) {
            return mapBuilderKeys;
        }
        MapBuilderKeys<K> mapBuilderKeys2 = new MapBuilderKeys<>(this);
        this.i = mapBuilderKeys2;
        return mapBuilderKeys2;
    }

    public int getSize() {
        return this.h;
    }

    @NotNull
    public Collection<V> getValues() {
        MapBuilderValues<V> mapBuilderValues = this.j;
        if (mapBuilderValues != null) {
            return mapBuilderValues;
        }
        MapBuilderValues<V> mapBuilderValues2 = new MapBuilderValues<>(this);
        this.j = mapBuilderValues2;
        return mapBuilderValues2;
    }

    @Override // java.util.Map
    public int hashCode() {
        EntriesItr<K, V> entriesItrEntriesIterator$kotlin_stdlib = entriesIterator$kotlin_stdlib();
        int iNextHashCode$kotlin_stdlib = 0;
        while (entriesItrEntriesIterator$kotlin_stdlib.hasNext()) {
            iNextHashCode$kotlin_stdlib += entriesItrEntriesIterator$kotlin_stdlib.nextHashCode$kotlin_stdlib();
        }
        return iNextHashCode$kotlin_stdlib;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    public final boolean isReadOnly$kotlin_stdlib() {
        return this.l;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return getKeys();
    }

    @NotNull
    public final KeysItr<K, V> keysIterator$kotlin_stdlib() {
        return new KeysItr<>(this);
    }

    @Override // java.util.Map
    @Nullable
    public V put(K k, V v) {
        checkIsMutable$kotlin_stdlib();
        int iAddKey$kotlin_stdlib = addKey$kotlin_stdlib(k);
        V[] vArrA = a();
        if (iAddKey$kotlin_stdlib >= 0) {
            vArrA[iAddKey$kotlin_stdlib] = v;
            return null;
        }
        int i = (-iAddKey$kotlin_stdlib) - 1;
        V v2 = vArrA[i];
        vArrA[i] = v;
        return v2;
    }

    @Override // java.util.Map
    public void putAll(@NotNull Map<? extends K, ? extends V> map) {
        checkIsMutable$kotlin_stdlib();
        n(map.entrySet());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    @Nullable
    public V remove(Object obj) {
        int iRemoveKey$kotlin_stdlib = removeKey$kotlin_stdlib(obj);
        if (iRemoveKey$kotlin_stdlib < 0) {
            return null;
        }
        V[] vArr = this.b;
        V v = vArr[iRemoveKey$kotlin_stdlib];
        ListBuilderKt.resetAt(vArr, iRemoveKey$kotlin_stdlib);
        return v;
    }

    public final boolean removeEntry$kotlin_stdlib(@NotNull Map.Entry<? extends K, ? extends V> entry) {
        checkIsMutable$kotlin_stdlib();
        int iH = h(entry.getKey());
        if (iH < 0 || !Intrinsics.areEqual(this.b[iH], entry.getValue())) {
            return false;
        }
        s(iH);
        return true;
    }

    public final int removeKey$kotlin_stdlib(K k) {
        checkIsMutable$kotlin_stdlib();
        int iH = h(k);
        if (iH < 0) {
            return -1;
        }
        s(iH);
        return iH;
    }

    public final boolean removeValue$kotlin_stdlib(V v) {
        checkIsMutable$kotlin_stdlib();
        int i = i(v);
        if (i < 0) {
            return false;
        }
        s(i);
        return true;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder((size() * 3) + 2);
        sb.append("{");
        EntriesItr<K, V> entriesItrEntriesIterator$kotlin_stdlib = entriesIterator$kotlin_stdlib();
        int i = 0;
        while (entriesItrEntriesIterator$kotlin_stdlib.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            entriesItrEntriesIterator$kotlin_stdlib.nextAppendString(sb);
            i++;
        }
        sb.append(i.d);
        return sb.toString();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return getValues();
    }

    @NotNull
    public final ValuesItr<K, V> valuesIterator$kotlin_stdlib() {
        return new ValuesItr<>(this);
    }

    public MapBuilder() {
        this(8);
    }

    public MapBuilder(int i) {
        this(ListBuilderKt.arrayOfUninitializedElements(i), null, new int[i], new int[m.c(i)], 2, 0);
    }
}

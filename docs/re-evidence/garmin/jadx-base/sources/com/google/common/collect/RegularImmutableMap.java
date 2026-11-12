package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
final class RegularImmutableMap<K, V> extends ImmutableMap<K, V> {
    private static final byte ABSENT = -1;
    private static final int BYTE_MASK = 255;
    private static final int BYTE_MAX_SIZE = 128;
    static final ImmutableMap<Object, Object> EMPTY = new RegularImmutableMap(null, new Object[0], 0);
    private static final int SHORT_MASK = 65535;
    private static final int SHORT_MAX_SIZE = 32768;

    @J2ktIncompatible
    private static final long serialVersionUID = 0;

    @VisibleForTesting
    final transient Object[] alternatingKeysAndValues;
    private final transient Object hashTable;
    private final transient int size;

    public static class EntrySet<K, V> extends ImmutableSet<Map.Entry<K, V>> {
        private final transient Object[] alternatingKeysAndValues;
        private final transient int keyOffset;
        private final transient ImmutableMap<K, V> map;
        private final transient int size;

        public EntrySet(ImmutableMap<K, V> immutableMap, Object[] objArr, int i14, int i15) {
            this.map = immutableMap;
            this.alternatingKeysAndValues = objArr;
            this.keyOffset = i14;
            this.size = i15;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (value != null && value.equals(this.map.get(key))) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public int copyIntoArray(Object[] objArr, int i14) {
            return asList().copyIntoArray(objArr, i14);
        }

        @Override // com.google.common.collect.ImmutableSet
        public ImmutableList<Map.Entry<K, V>> createAsList() {
            return new ImmutableList<Map.Entry<K, V>>() { // from class: com.google.common.collect.RegularImmutableMap.EntrySet.1
                @Override // java.util.List
                public Map.Entry<K, V> get(int i14) {
                    Preconditions.checkElementIndex(i14, EntrySet.this.size);
                    int i15 = i14 * 2;
                    Object obj = EntrySet.this.alternatingKeysAndValues[EntrySet.this.keyOffset + i15];
                    Objects.requireNonNull(obj);
                    Object obj2 = EntrySet.this.alternatingKeysAndValues[i15 + (EntrySet.this.keyOffset ^ 1)];
                    Objects.requireNonNull(obj2);
                    return new AbstractMap.SimpleImmutableEntry(obj, obj2);
                }

                @Override // com.google.common.collect.ImmutableCollection
                public boolean isPartialView() {
                    return true;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public int size() {
                    return EntrySet.this.size;
                }

                @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
                @J2ktIncompatible
                public Object writeReplace() {
                    return super.writeReplace();
                }
            };
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return true;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
        public UnmodifiableIterator<Map.Entry<K, V>> iterator() {
            return asList().iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.size;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        @J2ktIncompatible
        @GwtIncompatible
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public static final class KeySet<K> extends ImmutableSet<K> {
        private final transient ImmutableList<K> list;
        private final transient ImmutableMap<K, ?> map;

        public KeySet(ImmutableMap<K, ?> immutableMap, ImmutableList<K> immutableList) {
            this.map = immutableMap;
            this.list = immutableList;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public ImmutableList<K> asList() {
            return this.list;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.map.get(obj) != null;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public int copyIntoArray(Object[] objArr, int i14) {
            return asList().copyIntoArray(objArr, i14);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return true;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
        public UnmodifiableIterator<K> iterator() {
            return asList().iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.map.size();
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        @J2ktIncompatible
        @GwtIncompatible
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public static final class KeysOrValuesAsList extends ImmutableList<Object> {
        private final transient Object[] alternatingKeysAndValues;
        private final transient int offset;
        private final transient int size;

        public KeysOrValuesAsList(Object[] objArr, int i14, int i15) {
            this.alternatingKeysAndValues = objArr;
            this.offset = i14;
            this.size = i15;
        }

        @Override // java.util.List
        public Object get(int i14) {
            Preconditions.checkElementIndex(i14, this.size);
            Object obj = this.alternatingKeysAndValues[(i14 * 2) + this.offset];
            Objects.requireNonNull(obj);
            return obj;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.size;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    private RegularImmutableMap(Object obj, Object[] objArr, int i14) {
        this.hashTable = obj;
        this.alternatingKeysAndValues = objArr;
        this.size = i14;
    }

    public static <K, V> RegularImmutableMap<K, V> create(int i14, Object[] objArr, ImmutableMap.Builder<K, V> builder) {
        if (i14 == 0) {
            return (RegularImmutableMap) EMPTY;
        }
        if (i14 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[1];
            Objects.requireNonNull(obj2);
            CollectPreconditions.checkEntryNotNull(obj, obj2);
            return new RegularImmutableMap<>(null, objArr, 1);
        }
        Preconditions.checkPositionIndex(i14, objArr.length >> 1);
        Object objCreateHashTable = createHashTable(objArr, i14, ImmutableSet.chooseTableSize(i14), 0);
        if (objCreateHashTable instanceof Object[]) {
            Object[] objArr2 = (Object[]) objCreateHashTable;
            ImmutableMap.Builder.DuplicateKey duplicateKey = (ImmutableMap.Builder.DuplicateKey) objArr2[2];
            if (builder == null) {
                throw duplicateKey.exception();
            }
            builder.duplicateKey = duplicateKey;
            Object obj3 = objArr2[0];
            int iIntValue = ((Integer) objArr2[1]).intValue();
            objArr = Arrays.copyOf(objArr, iIntValue * 2);
            objCreateHashTable = obj3;
            i14 = iIntValue;
        }
        return new RegularImmutableMap<>(objCreateHashTable, objArr, i14);
    }

    private static Object createHashTable(Object[] objArr, int i14, int i15, int i16) {
        int i17;
        ImmutableMap.Builder.DuplicateKey duplicateKey = null;
        int i18 = 1;
        if (i14 == 1) {
            Object obj = objArr[i16];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[i16 ^ 1];
            Objects.requireNonNull(obj2);
            CollectPreconditions.checkEntryNotNull(obj, obj2);
            return null;
        }
        int i19 = i15 - 1;
        if (i15 <= 128) {
            byte[] bArr = new byte[i15];
            Arrays.fill(bArr, (byte) -1);
            int i24 = 0;
            for (int i25 = 0; i25 < i14; i25++) {
                int i26 = (i25 * 2) + i16;
                int i27 = (i24 * 2) + i16;
                Object obj3 = objArr[i26];
                Objects.requireNonNull(obj3);
                Object obj4 = objArr[i26 ^ 1];
                Objects.requireNonNull(obj4);
                CollectPreconditions.checkEntryNotNull(obj3, obj4);
                int iSmear = Hashing.smear(obj3.hashCode());
                while (true) {
                    int i28 = iSmear & i19;
                    int i29 = bArr[i28] & 255;
                    if (i29 == 255) {
                        bArr[i28] = (byte) i27;
                        if (i24 < i25) {
                            objArr[i27] = obj3;
                            objArr[i27 ^ 1] = obj4;
                        }
                        i24++;
                        break;
                    }
                    if (obj3.equals(objArr[i29])) {
                        int i30 = i29 ^ 1;
                        Object obj5 = objArr[i30];
                        Objects.requireNonNull(obj5);
                        duplicateKey = new ImmutableMap.Builder.DuplicateKey(obj3, obj4, obj5);
                        objArr[i30] = obj4;
                        break;
                    }
                    iSmear = i28 + 1;
                }
            }
            return i24 == i14 ? bArr : new Object[]{bArr, Integer.valueOf(i24), duplicateKey};
        }
        if (i15 <= 32768) {
            short[] sArr = new short[i15];
            Arrays.fill(sArr, (short) -1);
            int i34 = 0;
            for (int i35 = 0; i35 < i14; i35++) {
                int i36 = (i35 * 2) + i16;
                int i37 = (i34 * 2) + i16;
                Object obj6 = objArr[i36];
                Objects.requireNonNull(obj6);
                Object obj7 = objArr[i36 ^ 1];
                Objects.requireNonNull(obj7);
                CollectPreconditions.checkEntryNotNull(obj6, obj7);
                int iSmear2 = Hashing.smear(obj6.hashCode());
                while (true) {
                    int i38 = iSmear2 & i19;
                    int i39 = sArr[i38] & 65535;
                    if (i39 == 65535) {
                        sArr[i38] = (short) i37;
                        if (i34 < i35) {
                            objArr[i37] = obj6;
                            objArr[i37 ^ 1] = obj7;
                        }
                        i34++;
                        break;
                    }
                    if (obj6.equals(objArr[i39])) {
                        int i44 = i39 ^ 1;
                        Object obj8 = objArr[i44];
                        Objects.requireNonNull(obj8);
                        duplicateKey = new ImmutableMap.Builder.DuplicateKey(obj6, obj7, obj8);
                        objArr[i44] = obj7;
                        break;
                    }
                    iSmear2 = i38 + 1;
                }
            }
            return i34 == i14 ? sArr : new Object[]{sArr, Integer.valueOf(i34), duplicateKey};
        }
        int[] iArr = new int[i15];
        Arrays.fill(iArr, -1);
        int i45 = 0;
        int i46 = 0;
        while (i45 < i14) {
            int i47 = (i45 * 2) + i16;
            int i48 = (i46 * 2) + i16;
            Object obj9 = objArr[i47];
            Objects.requireNonNull(obj9);
            Object obj10 = objArr[i47 ^ i18];
            Objects.requireNonNull(obj10);
            CollectPreconditions.checkEntryNotNull(obj9, obj10);
            int iSmear3 = Hashing.smear(obj9.hashCode());
            while (true) {
                int i49 = iSmear3 & i19;
                int i54 = iArr[i49];
                if (i54 == -1) {
                    iArr[i49] = i48;
                    if (i46 < i45) {
                        objArr[i48] = obj9;
                        objArr[i48 ^ 1] = obj10;
                    }
                    i46++;
                    i17 = i18;
                    break;
                }
                i17 = i18;
                if (obj9.equals(objArr[i54])) {
                    int i55 = i54 ^ 1;
                    Object obj11 = objArr[i55];
                    Objects.requireNonNull(obj11);
                    duplicateKey = new ImmutableMap.Builder.DuplicateKey(obj9, obj10, obj11);
                    objArr[i55] = obj10;
                    break;
                }
                iSmear3 = i49 + 1;
                i18 = i17;
            }
            i45++;
            i18 = i17;
        }
        int i56 = i18;
        if (i46 == i14) {
            return iArr;
        }
        Object[] objArr2 = new Object[3];
        objArr2[0] = iArr;
        objArr2[i56] = Integer.valueOf(i46);
        objArr2[2] = duplicateKey;
        return objArr2;
    }

    public static Object createHashTableOrThrow(Object[] objArr, int i14, int i15, int i16) {
        Object objCreateHashTable = createHashTable(objArr, i14, i15, i16);
        if (objCreateHashTable instanceof Object[]) {
            throw ((ImmutableMap.Builder.DuplicateKey) ((Object[]) objCreateHashTable)[2]).exception();
        }
        return objCreateHashTable;
    }

    public static Object get(Object obj, Object[] objArr, int i14, int i15, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i14 == 1) {
            Object obj3 = objArr[i15];
            Objects.requireNonNull(obj3);
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i15 ^ 1];
            Objects.requireNonNull(obj4);
            return obj4;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length - 1;
            int iSmear = Hashing.smear(obj2.hashCode());
            while (true) {
                int i16 = iSmear & length;
                int i17 = bArr[i16] & 255;
                if (i17 == 255) {
                    return null;
                }
                if (obj2.equals(objArr[i17])) {
                    return objArr[i17 ^ 1];
                }
                iSmear = i16 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length - 1;
            int iSmear2 = Hashing.smear(obj2.hashCode());
            while (true) {
                int i18 = iSmear2 & length2;
                int i19 = sArr[i18] & 65535;
                if (i19 == 65535) {
                    return null;
                }
                if (obj2.equals(objArr[i19])) {
                    return objArr[i19 ^ 1];
                }
                iSmear2 = i18 + 1;
            }
        } else {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length - 1;
            int iSmear3 = Hashing.smear(obj2.hashCode());
            while (true) {
                int i24 = iSmear3 & length3;
                int i25 = iArr[i24];
                if (i25 == -1) {
                    return null;
                }
                if (obj2.equals(objArr[i25])) {
                    return objArr[i25 ^ 1];
                }
                iSmear3 = i24 + 1;
            }
        }
    }

    @Override // com.google.common.collect.ImmutableMap
    public ImmutableSet<Map.Entry<K, V>> createEntrySet() {
        return new EntrySet(this, this.alternatingKeysAndValues, 0, this.size);
    }

    @Override // com.google.common.collect.ImmutableMap
    public ImmutableSet<K> createKeySet() {
        return new KeySet(this, new KeysOrValuesAsList(this.alternatingKeysAndValues, 0, this.size));
    }

    @Override // com.google.common.collect.ImmutableMap
    public ImmutableCollection<V> createValues() {
        return new KeysOrValuesAsList(this.alternatingKeysAndValues, 1, this.size);
    }

    @Override // com.google.common.collect.ImmutableMap
    public boolean isPartialView() {
        return false;
    }

    @Override // java.util.Map
    public int size() {
        return this.size;
    }

    @Override // com.google.common.collect.ImmutableMap
    @J2ktIncompatible
    @GwtIncompatible
    public Object writeReplace() {
        return super.writeReplace();
    }

    public static <K, V> RegularImmutableMap<K, V> create(int i14, Object[] objArr) {
        return create(i14, objArr, null);
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public V get(Object obj) {
        V v14 = (V) get(this.hashTable, this.alternatingKeysAndValues, this.size, 0, obj);
        if (v14 == null) {
            return null;
        }
        return v14;
    }
}

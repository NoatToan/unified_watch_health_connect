package defpackage;

import com.google.common.base.Preconditions;
import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMapEntrySet;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.Maps;
import com.google.common.collect.Ordering;
import com.google.common.collect.UnmodifiableIterator;
import com.huawei.pluginachievement.manager.model.MedalConstants;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Objects;
import java.util.SortedMap;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public final class amc<K, V> extends ImmutableMap<K, V> implements NavigableMap<K, V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Comparator<Comparable> f526b = Ordering.natural();
    private static final amc<Comparable, Object> d = new amc<>(ImmutableSortedSet.emptySet(Ordering.natural()), ImmutableList.of());
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient ImmutableList<V> f527a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient ani<K> f528c;

    @CheckForNull
    private transient amc<K, V> e;

    static <K, V> amc<K, V> d(Comparator<? super K> comparator) {
        if (Ordering.natural().equals(comparator)) {
            return c();
        }
        return new amc<>(ImmutableSortedSet.emptySet(comparator), ImmutableList.of());
    }

    public static <K, V> amc<K, V> c() {
        return (amc<K, V>) d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <K, V> amc<K, V> e(Comparator<? super K> comparator, K k, V v) {
        return new amc<>(new ani(ImmutableList.of(k), (Comparator) Preconditions.checkNotNull(comparator)), ImmutableList.of(v));
    }

    public static <K, V> amc<K, V> d(Map<? extends K, ? extends V> map) {
        return a(map, (Ordering) f526b);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0018  */
    private static <K, V> amc<K, V> a(Map<? extends K, ? extends V> map, Comparator<? super K> comparator) {
        boolean zEquals;
        if (map instanceof SortedMap) {
            Comparator<? super K> comparator2 = ((SortedMap) map).comparator();
            if (comparator2 != null) {
                zEquals = comparator.equals(comparator2);
            } else if (comparator == f526b) {
                zEquals = true;
            } else {
                zEquals = false;
            }
        } else {
            zEquals = false;
        }
        if (zEquals && (map instanceof amc)) {
            amc<K, V> amcVar = (amc) map;
            if (!amcVar.isPartialView()) {
                return amcVar;
            }
        }
        return b(comparator, zEquals, map.entrySet());
    }

    private static <K, V> amc<K, V> b(Comparator<? super K> comparator, boolean z, Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        Map.Entry[] entryArr = (Map.Entry[]) amn.a((Iterable) iterable, (Object[]) EMPTY_ENTRY_ARRAY);
        return b(comparator, z, entryArr, entryArr.length);
    }

    private static <K, V> amc<K, V> b(final Comparator<? super K> comparator, boolean z, Map.Entry<K, V>[] entryArr, int i) {
        if (i == 0) {
            return d((Comparator) comparator);
        }
        if (i == 1) {
            Map.Entry entry = (Map.Entry) Objects.requireNonNull(entryArr[0]);
            return e(comparator, entry.getKey(), entry.getValue());
        }
        Object[] objArr = new Object[i];
        Object[] objArr2 = new Object[i];
        if (z) {
            for (int i2 = 0; i2 < i; i2++) {
                Map.Entry entry2 = (Map.Entry) Objects.requireNonNull(entryArr[i2]);
                Object key = entry2.getKey();
                Object value = entry2.getValue();
                ale.d(key, value);
                objArr[i2] = key;
                objArr2[i2] = value;
            }
        } else {
            Arrays.sort(entryArr, 0, i, new Comparator() { // from class: amb
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return amc.d(comparator, (Map.Entry) obj, (Map.Entry) obj2);
                }
            });
            Map.Entry entry3 = (Map.Entry) Objects.requireNonNull(entryArr[0]);
            Object key2 = entry3.getKey();
            objArr[0] = key2;
            Object value2 = entry3.getValue();
            objArr2[0] = value2;
            ale.d(objArr[0], value2);
            int i3 = 1;
            while (i3 < i) {
                Map.Entry entry4 = (Map.Entry) Objects.requireNonNull(entryArr[i3 - 1]);
                Map.Entry entry5 = (Map.Entry) Objects.requireNonNull(entryArr[i3]);
                Object key3 = entry5.getKey();
                Object value3 = entry5.getValue();
                ale.d(key3, value3);
                objArr[i3] = key3;
                objArr2[i3] = value3;
                checkNoConflict(comparator.compare(key2, key3) != 0, MedalConstants.EVENT_KEY, entry4, entry5);
                i3++;
                key2 = key3;
            }
        }
        return new amc<>(new ani(ImmutableList.asImmutableList(objArr), comparator), ImmutableList.asImmutableList(objArr2));
    }

    static /* synthetic */ int d(Comparator comparator, Map.Entry entry, Map.Entry entry2) {
        Objects.requireNonNull(entry);
        Objects.requireNonNull(entry2);
        return comparator.compare(entry.getKey(), entry2.getKey());
    }

    public static class d<K, V> extends ImmutableMap.b<K, V> {
        private transient Object[] f;
        private final Comparator<? super K> i;
        private transient Object[] j;

        public d(Comparator<? super K> comparator) {
            this(comparator, 4);
        }

        private d(Comparator<? super K> comparator, int i) {
            this.i = (Comparator) Preconditions.checkNotNull(comparator);
            this.f = new Object[i];
            this.j = new Object[i];
        }

        private void a(int i) {
            Object[] objArr = this.f;
            if (i > objArr.length) {
                int iExpandedCapacity = ImmutableCollection.Builder.expandedCapacity(objArr.length, i);
                this.f = Arrays.copyOf(this.f, iExpandedCapacity);
                this.j = Arrays.copyOf(this.j, iExpandedCapacity);
            }
        }

        @Override // com.google.common.collect.ImmutableMap.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public d<K, V> c(K k, V v) {
            a(this.e + 1);
            ale.d(k, v);
            this.f[this.e] = k;
            this.j[this.e] = v;
            this.e++;
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public d<K, V> d(Map.Entry<? extends K, ? extends V> entry) {
            super.d(entry);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public d<K, V> b(Map<? extends K, ? extends V> map) {
            super.b(map);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d<K, V> d(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            super.d(iterable);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public amc<K, V> d() {
            return j();
        }

        @Override // com.google.common.collect.ImmutableMap.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public amc<K, V> j() {
            int i = this.e;
            if (i == 0) {
                return amc.d((Comparator) this.i);
            }
            if (i == 1) {
                return amc.e(this.i, Objects.requireNonNull(this.f[0]), Objects.requireNonNull(this.j[0]));
            }
            Object[] objArrCopyOf = Arrays.copyOf(this.f, this.e);
            Arrays.sort(objArrCopyOf, this.i);
            Object[] objArr = new Object[this.e];
            for (int i2 = 0; i2 < this.e; i2++) {
                if (i2 > 0) {
                    int i3 = i2 - 1;
                    if (this.i.compare(objArrCopyOf[i3], objArrCopyOf[i2]) == 0) {
                        throw new IllegalArgumentException("keys required to be distinct but compared as equal: " + objArrCopyOf[i3] + " and " + objArrCopyOf[i2]);
                    }
                }
                objArr[Arrays.binarySearch(objArrCopyOf, Objects.requireNonNull(this.f[i2]), this.i)] = Objects.requireNonNull(this.j[i2]);
            }
            return new amc<>(new ani(ImmutableList.asImmutableList(objArrCopyOf), this.i), ImmutableList.asImmutableList(objArr));
        }

        @Override // com.google.common.collect.ImmutableMap.b
        @Deprecated
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public final amc<K, V> b() {
            throw new UnsupportedOperationException("ImmutableSortedMap.Builder does not yet implement buildKeepingLast()");
        }
    }

    amc(ani<K> aniVar, ImmutableList<V> immutableList) {
        this(aniVar, immutableList, null);
    }

    amc(ani<K> aniVar, ImmutableList<V> immutableList, @CheckForNull amc<K, V> amcVar) {
        this.f528c = aniVar;
        this.f527a = immutableList;
        this.e = amcVar;
    }

    @Override // java.util.Map
    public int size() {
        return this.f527a.size();
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    @CheckForNull
    public V get(@CheckForNull Object obj) {
        int iIndexOf = this.f528c.indexOf(obj);
        if (iIndexOf == -1) {
            return null;
        }
        return this.f527a.get(iIndexOf);
    }

    @Override // com.google.common.collect.ImmutableMap
    public boolean isPartialView() {
        return this.f528c.isPartialView() || this.f527a.isPartialView();
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map, java.util.SortedMap
    public ImmutableSet<Map.Entry<K, V>> entrySet() {
        return super.entrySet();
    }

    class e extends ImmutableMapEntrySet<K, V> {
        e() {
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
        public UnmodifiableIterator<Map.Entry<K, V>> iterator() {
            return asList().iterator();
        }

        @Override // com.google.common.collect.ImmutableSet
        public ImmutableList<Map.Entry<K, V>> createAsList() {
            return new ImmutableList<Map.Entry<K, V>>() { // from class: amc.e.5
                @Override // com.google.common.collect.ImmutableCollection
                public boolean isPartialView() {
                    return true;
                }

                @Override // java.util.List
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public Map.Entry<K, V> get(int i) {
                    return new AbstractMap.SimpleImmutableEntry(amc.this.f528c.asList().get(i), amc.this.f527a.get(i));
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public int size() {
                    return amc.this.size();
                }

                @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
                public Object writeReplace() {
                    return super.writeReplace();
                }
            };
        }

        @Override // com.google.common.collect.ImmutableMapEntrySet
        public ImmutableMap<K, V> map() {
            return amc.this;
        }

        @Override // com.google.common.collect.ImmutableMapEntrySet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    @Override // com.google.common.collect.ImmutableMap
    public ImmutableSet<Map.Entry<K, V>> createEntrySet() {
        return isEmpty() ? ImmutableSet.of() : new e();
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map, java.util.SortedMap
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedSet<K> keySet() {
        return this.f528c;
    }

    @Override // com.google.common.collect.ImmutableMap
    public ImmutableSet<K> createKeySet() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map, java.util.SortedMap
    public ImmutableCollection<V> values() {
        return this.f527a;
    }

    @Override // com.google.common.collect.ImmutableMap
    public ImmutableCollection<V> createValues() {
        throw new AssertionError("should never be called");
    }

    @Override // java.util.SortedMap
    public Comparator<? super K> comparator() {
        return keySet().comparator();
    }

    @Override // java.util.SortedMap
    public K firstKey() {
        return keySet().first();
    }

    @Override // java.util.SortedMap
    public K lastKey() {
        return keySet().last();
    }

    private amc<K, V> b(int i, int i2) {
        if (i == 0 && i2 == size()) {
            return this;
        }
        if (i == i2) {
            return d((Comparator) comparator());
        }
        return new amc<>(this.f528c.a(i, i2), this.f527a.subList(i, i2));
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public amc<K, V> headMap(K k) {
        return headMap((Object) k, false);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.util.NavigableMap
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public amc<K, V> headMap(K k, boolean z) {
        return b(0, this.f528c.e((K) Preconditions.checkNotNull(k), z));
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public amc<K, V> subMap(K k, K k2) {
        return subMap(k, true, k2, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableMap
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public amc<K, V> subMap(K k, boolean z, K k2, boolean z2) {
        Preconditions.checkNotNull(k);
        Preconditions.checkNotNull(k2);
        Preconditions.checkArgument(comparator().compare(k, k2) <= 0, "expected fromKey <= toKey but %s > %s", k, k2);
        return headMap(k2, z2).tailMap(k, z);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public amc<K, V> tailMap(K k) {
        return tailMap(k, true);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.util.NavigableMap
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public amc<K, V> tailMap(K k, boolean z) {
        return b(this.f528c.d((K) Preconditions.checkNotNull(k), z), size());
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public Map.Entry<K, V> lowerEntry(K k) {
        return headMap((Object) k, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public K lowerKey(K k) {
        return (K) Maps.d(lowerEntry(k));
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public Map.Entry<K, V> floorEntry(K k) {
        return headMap((Object) k, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public K floorKey(K k) {
        return (K) Maps.d(floorEntry(k));
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public Map.Entry<K, V> ceilingEntry(K k) {
        return tailMap(k, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public K ceilingKey(K k) {
        return (K) Maps.d(ceilingEntry(k));
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public Map.Entry<K, V> higherEntry(K k) {
        return tailMap(k, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public K higherKey(K k) {
        return (K) Maps.d(higherEntry(k));
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public Map.Entry<K, V> firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return entrySet().asList().get(0);
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public Map.Entry<K, V> lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return entrySet().asList().get(size() - 1);
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    @Deprecated
    public final Map.Entry<K, V> pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    @Deprecated
    public final Map.Entry<K, V> pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableMap
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public amc<K, V> descendingMap() {
        amc<K, V> amcVar = this.e;
        if (amcVar != null) {
            return amcVar;
        }
        if (isEmpty()) {
            return d((Comparator) Ordering.from(comparator()).reverse());
        }
        return new amc<>((ani) this.f528c.descendingSet(), this.f527a.reverse(), this);
    }

    @Override // java.util.NavigableMap
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedSet<K> navigableKeySet() {
        return this.f528c;
    }

    @Override // java.util.NavigableMap
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedSet<K> descendingKeySet() {
        return this.f528c.descendingSet();
    }

    static class b<K, V> extends ImmutableMap.e<K, V> {
        private static final long serialVersionUID = 0;
        private final Comparator<? super K> e;

        b(amc<K, V> amcVar) {
            super(amcVar);
            this.e = amcVar.comparator();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ImmutableMap.e
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public d<K, V> b(int i) {
            return new d<>(this.e);
        }
    }

    @Override // com.google.common.collect.ImmutableMap
    public Object writeReplace() {
        return new b(this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }
}

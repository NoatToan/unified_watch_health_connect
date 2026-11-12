package defpackage;

import com.google.common.base.MoreObjects;
import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.Ordering;
import com.google.common.collect.SetMultimap;
import com.google.common.collect.UnmodifiableIterator;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public class amf<K, V> extends ImmutableMultimap<K, V> implements SetMultimap<K, V> {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @CheckForNull
    @LazyInit
    private transient amf<V, K> f539a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient ImmutableSet<V> f540c;

    @CheckForNull
    @LazyInit
    private transient ImmutableSet<Map.Entry<K, V>> e;

    static final class e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final ann.a<amf> f542b = ann.a(amf.class, "emptySet");
    }

    public static <K, V> amf<K, V> e() {
        return alt.f518a;
    }

    public static <K, V> d<K, V> d() {
        return new d<>();
    }

    public static final class d<K, V> extends ImmutableMultimap.c<K, V> {
        @Override // com.google.common.collect.ImmutableMultimap.c
        public Collection<V> c() {
            return amz.d();
        }

        @Override // com.google.common.collect.ImmutableMultimap.c
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public d<K, V> c(K k, V v) {
            super.c(k, v);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d<K, V> c(Map.Entry<? extends K, ? extends V> entry) {
            super.c(entry);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.c
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public d<K, V> a(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            super.a(iterable);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public amf<K, V> b() {
            Collection collectionEntrySet = this.f4375c.entrySet();
            if (this.e != null) {
                collectionEntrySet = Ordering.from(this.e).onKeys().immutableSortedCopy(collectionEntrySet);
            }
            return amf.a(collectionEntrySet, this.f4374a);
        }
    }

    static <K, V> amf<K, V> a(Collection<? extends Map.Entry<? extends K, ? extends Collection<? extends V>>> collection, @CheckForNull Comparator<? super V> comparator) {
        if (collection.isEmpty()) {
            return e();
        }
        ImmutableMap.b bVar = new ImmutableMap.b(collection.size());
        int size = 0;
        for (Map.Entry<? extends K, ? extends Collection<? extends V>> entry : collection) {
            K key = entry.getKey();
            ImmutableSet immutableSetD = d(comparator, entry.getValue());
            if (!immutableSetD.isEmpty()) {
                bVar.c(key, immutableSetD);
                size += immutableSetD.size();
            }
        }
        return new amf<>(bVar.j(), size, comparator);
    }

    public amf(ImmutableMap<K, ImmutableSet<V>> immutableMap, int i, @CheckForNull Comparator<? super V> comparator) {
        super(immutableMap, i);
        this.f540c = d(comparator);
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public ImmutableSet<V> get(K k) {
        return (ImmutableSet) MoreObjects.firstNonNull((ImmutableSet) this.map.get(k), this.f540c);
    }

    @Override // com.google.common.collect.ImmutableMultimap
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public amf<V, K> inverse() {
        amf<V, K> amfVar = this.f539a;
        if (amfVar != null) {
            return amfVar;
        }
        amf<V, K> amfVarG = g();
        this.f539a = amfVarG;
        return amfVarG;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private amf<V, K> g() {
        d dVarD = d();
        UnmodifiableIterator it = entries().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            dVarD.c(entry.getValue(), entry.getKey());
        }
        amf<V, K> amfVarB = dVarD.b();
        amfVarB.f539a = this;
        return amfVarB;
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @Deprecated
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ImmutableSet<V> removeAll(@CheckForNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @Deprecated
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final ImmutableSet<V> replaceValues(K k, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public ImmutableSet<Map.Entry<K, V>> entries() {
        ImmutableSet<Map.Entry<K, V>> immutableSet = this.e;
        if (immutableSet != null) {
            return immutableSet;
        }
        a aVar = new a(this);
        this.e = aVar;
        return aVar;
    }

    static final class a<K, V> extends ImmutableSet<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final transient amf<K, V> f541b;

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return false;
        }

        a(amf<K, V> amfVar) {
            this.f541b = amfVar;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.f541b.containsEntry(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f541b.size();
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
        public UnmodifiableIterator<Map.Entry<K, V>> iterator() {
            return this.f541b.entryIterator();
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    private static <V> ImmutableSet<V> d(@CheckForNull Comparator<? super V> comparator, Collection<? extends V> collection) {
        if (comparator == null) {
            return ImmutableSet.copyOf((Collection) collection);
        }
        return ImmutableSortedSet.copyOf((Comparator) comparator, (Collection) collection);
    }

    private static <V> ImmutableSet<V> d(@CheckForNull Comparator<? super V> comparator) {
        if (comparator == null) {
            return ImmutableSet.of();
        }
        return ImmutableSortedSet.emptySet(comparator);
    }

    private static <V> ImmutableSet.b<V> e(@CheckForNull Comparator<? super V> comparator) {
        if (comparator == null) {
            return new ImmutableSet.b<>();
        }
        return new ImmutableSortedSet.e(comparator);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(b());
        ann.e(this, objectOutputStream);
    }

    @CheckForNull
    Comparator<? super V> b() {
        ImmutableSet<V> immutableSet = this.f540c;
        if (immutableSet instanceof ImmutableSortedSet) {
            return ((ImmutableSortedSet) immutableSet).comparator();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
        int i = objectInputStream.readInt();
        if (i < 0) {
            throw new InvalidObjectException("Invalid key count " + i);
        }
        ImmutableMap.b bVarBuilder = ImmutableMap.builder();
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object objRequireNonNull = Objects.requireNonNull(objectInputStream.readObject());
            int i4 = objectInputStream.readInt();
            if (i4 <= 0) {
                throw new InvalidObjectException("Invalid value count " + i4);
            }
            ImmutableSet.b bVarE = e(comparator);
            for (int i5 = 0; i5 < i4; i5++) {
                bVarE.add(Objects.requireNonNull(objectInputStream.readObject()));
            }
            ImmutableSet immutableSetBuild = bVarE.build();
            if (immutableSetBuild.size() != i4) {
                throw new InvalidObjectException("Duplicate key-value pairs exist for key " + objRequireNonNull);
            }
            bVarBuilder.c(objRequireNonNull, immutableSetBuild);
            i2 += i4;
        }
        try {
            ImmutableMultimap.e.e.d(this, bVarBuilder.j());
            ImmutableMultimap.e.f4376b.c(this, i2);
            e.f542b.d(this, d(comparator));
        } catch (IllegalArgumentException e2) {
            throw ((InvalidObjectException) new InvalidObjectException(e2.getMessage()).initCause(e2));
        }
    }
}

package defpackage;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ListMultimap;
import com.google.common.collect.Multimap;
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

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public class ama<K, V> extends ImmutableMultimap<K, V> implements ListMultimap<K, V> {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @CheckForNull
    @LazyInit
    private transient ama<V, K> f524a;

    public static <K, V> ama<K, V> d() {
        return alm.e;
    }

    public static <K, V> ama<K, V> c(K k, V v) {
        e eVarC = c();
        eVarC.c(k, v);
        return eVarC.b();
    }

    public static <K, V> ama<K, V> e(K k, V v, K k2, V v2) {
        e eVarC = c();
        eVarC.c(k, v);
        eVarC.c(k2, v2);
        return eVarC.b();
    }

    public static <K, V> ama<K, V> e(K k, V v, K k2, V v2, K k3, V v3) {
        e eVarC = c();
        eVarC.c(k, v);
        eVarC.c(k2, v2);
        eVarC.c(k3, v3);
        return eVarC.b();
    }

    public static <K, V> ama<K, V> b(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        e eVarC = c();
        eVarC.c(k, v);
        eVarC.c(k2, v2);
        eVarC.c(k3, v3);
        eVarC.c(k4, v4);
        return eVarC.b();
    }

    public static <K, V> ama<K, V> c(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        e eVarC = c();
        eVarC.c(k, v);
        eVarC.c(k2, v2);
        eVarC.c(k3, v3);
        eVarC.c(k4, v4);
        eVarC.c(k5, v5);
        return eVarC.b();
    }

    public static <K, V> e<K, V> c() {
        return new e<>();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class e<K, V> extends ImmutableMultimap.c<K, V> {
        @Override // com.google.common.collect.ImmutableMultimap.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e<K, V> c(K k, V v) {
            super.c(k, v);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.c
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public e<K, V> c(Map.Entry<? extends K, ? extends V> entry) {
            super.c(entry);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.c
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public e<K, V> a(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            super.a(iterable);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ama<K, V> b() {
            return (ama) super.b();
        }
    }

    public static <K, V> ama<K, V> b(Multimap<? extends K, ? extends V> multimap) {
        if (multimap.isEmpty()) {
            return d();
        }
        if (multimap instanceof ama) {
            ama<K, V> amaVar = (ama) multimap;
            if (!amaVar.isPartialView()) {
                return amaVar;
            }
        }
        return d(multimap.asMap().entrySet(), (Comparator) null);
    }

    public static <K, V> ama<K, V> b(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return new e().a(iterable).b();
    }

    public static <K, V> ama<K, V> d(Collection<? extends Map.Entry<? extends K, ? extends Collection<? extends V>>> collection, @CheckForNull Comparator<? super V> comparator) {
        ImmutableList immutableListSortedCopyOf;
        if (collection.isEmpty()) {
            return d();
        }
        ImmutableMap.b bVar = new ImmutableMap.b(collection.size());
        int size = 0;
        for (Map.Entry<? extends K, ? extends Collection<? extends V>> entry : collection) {
            K key = entry.getKey();
            Collection<? extends V> value = entry.getValue();
            if (comparator == null) {
                immutableListSortedCopyOf = ImmutableList.copyOf((Collection) value);
            } else {
                immutableListSortedCopyOf = ImmutableList.sortedCopyOf(comparator, value);
            }
            if (!immutableListSortedCopyOf.isEmpty()) {
                bVar.c(key, immutableListSortedCopyOf);
                size += immutableListSortedCopyOf.size();
            }
        }
        return new ama<>(bVar.j(), size);
    }

    ama(ImmutableMap<K, ImmutableList<V>> immutableMap, int i) {
        super(immutableMap, i);
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ImmutableList<V> get(K k) {
        ImmutableList<V> immutableList = (ImmutableList) this.map.get(k);
        return immutableList == null ? ImmutableList.of() : immutableList;
    }

    @Override // com.google.common.collect.ImmutableMultimap
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ama<V, K> inverse() {
        ama<V, K> amaVar = this.f524a;
        if (amaVar != null) {
            return amaVar;
        }
        ama<V, K> amaVarE = e();
        this.f524a = amaVarE;
        return amaVarE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ama<V, K> e() {
        e eVarC = c();
        UnmodifiableIterator it = entries().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            eVarC.c(entry.getValue(), entry.getKey());
        }
        ama<V, K> amaVarB = eVarC.b();
        amaVarB.f524a = this;
        return amaVarB;
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @Deprecated
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ImmutableList<V> removeAll(@CheckForNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @Deprecated
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final ImmutableList<V> replaceValues(K k, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        ann.e(this, objectOutputStream);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
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
            ImmutableList.c cVarBuilder = ImmutableList.builder();
            for (int i5 = 0; i5 < i4; i5++) {
                cVarBuilder.add(Objects.requireNonNull(objectInputStream.readObject()));
            }
            bVarBuilder.c(objRequireNonNull, cVarBuilder.build());
            i2 += i4;
        }
        try {
            ImmutableMultimap.e.e.d(this, bVarBuilder.j());
            ImmutableMultimap.e.f4376b.c(this, i2);
        } catch (IllegalArgumentException e2) {
            throw ((InvalidObjectException) new InvalidObjectException(e2.getMessage()).initCause(e2));
        }
    }
}

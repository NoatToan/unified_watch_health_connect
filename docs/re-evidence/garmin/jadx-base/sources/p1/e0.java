package p1;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lp1/e0;", "K", "V", "", "Lp1/f1;", "parent", "<init>", "(Lp1/f1;)V", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class e0<K, V> implements Map<K, V>, f23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f1<K, V> f134706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e<K, V> f134707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public r<K, V> f134708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o1<K, V> f134709d;

    public e0(f1<K, V> f1Var) {
        f1Var.getClass();
        this.f134706a = f1Var;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final V compute(K k14, BiFunction<? super K, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final V computeIfAbsent(K k14, Function<? super K, ? extends V> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final V computeIfPresent(K k14, BiFunction<? super K, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f134706a.b(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f134706a.c(obj);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        e<K, V> eVar = this.f134707b;
        if (eVar != null) {
            return eVar;
        }
        e<K, V> eVar2 = new e<>(this.f134706a);
        this.f134707b = eVar2;
        return eVar2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f134706a.equals(((e0) obj).f134706a);
    }

    @Override // java.util.Map
    public final V get(Object obj) {
        return this.f134706a.d(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f134706a.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f134706a.e();
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        r<K, V> rVar = this.f134708c;
        if (rVar != null) {
            return rVar;
        }
        r<K, V> rVar2 = new r<>(this.f134706a);
        this.f134708c = rVar2;
        return rVar2;
    }

    @Override // java.util.Map
    public final V merge(K k14, V v14, BiFunction<? super V, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final V put(K k14, V v14) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final V putIfAbsent(K k14, V v14) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final V replace(K k14, V v14) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction<? super K, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f134706a.f134724e;
    }

    public final String toString() {
        return this.f134706a.toString();
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        o1<K, V> o1Var = this.f134709d;
        if (o1Var != null) {
            return o1Var;
        }
        o1<K, V> o1Var2 = new o1<>(this.f134706a);
        this.f134709d = o1Var2;
        return o1Var2;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean replace(K k14, V v14, V v15) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

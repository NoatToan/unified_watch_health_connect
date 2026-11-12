package l53;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ll53/d;", "K", "V", "Lp13/g;", "Li53/g$a;", "Ll53/c;", "map", "<init>", "(Ll53/c;)V", "kotlinx-collections-immutable"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d<K, V> extends p13.g<K, V> implements i53.g.a<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l53.c<K, V> f110409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f110410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f110411c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k53.f<K, l53.a<V>> f110412d;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a implements e23.p<l53.a<V>, ?, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f110413a = new a();

        @Override // e23.p
        public final Boolean invoke(Object obj, Object obj2) {
            l53.a aVar = (l53.a) obj;
            l53.a aVar2 = (l53.a) obj2;
            aVar.getClass();
            aVar2.getClass();
            return Boolean.valueOf(s.g(aVar.f110395a, aVar2.f110395a));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b implements e23.p<l53.a<V>, ?, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f110414a = new b();

        @Override // e23.p
        public final Boolean invoke(Object obj, Object obj2) {
            l53.a aVar = (l53.a) obj;
            l53.a aVar2 = (l53.a) obj2;
            aVar.getClass();
            aVar2.getClass();
            return Boolean.valueOf(s.g(aVar.f110395a, aVar2.f110395a));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class c implements e23.p<l53.a<V>, ?, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f110415a = new c();

        @Override // e23.p
        public final Boolean invoke(Object obj, Object obj2) {
            l53.a aVar = (l53.a) obj;
            aVar.getClass();
            return Boolean.valueOf(s.g(aVar.f110395a, obj2));
        }
    }

    /* JADX INFO: renamed from: l53.d$d, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C2109d implements e23.p<l53.a<V>, ?, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C2109d f110416a = new C2109d();

        @Override // e23.p
        public final Boolean invoke(Object obj, Object obj2) {
            l53.a aVar = (l53.a) obj;
            aVar.getClass();
            return Boolean.valueOf(s.g(aVar.f110395a, obj2));
        }
    }

    public d(l53.c<K, V> cVar) {
        cVar.getClass();
        this.f110409a = cVar;
        this.f110410b = cVar.f110402b;
        this.f110411c = cVar.f110403c;
        k53.d<K, l53.a<V>> dVar = cVar.f110404d;
        dVar.getClass();
        this.f110412d = new k53.f<>(dVar);
    }

    @Override // p13.g
    public final Set<Map.Entry<K, V>> a() {
        return new e(this);
    }

    @Override // p13.g
    public final Set<K> b() {
        return new g(this);
    }

    @Override // i53.g.a
    public final i53.g<K, V> build() {
        l53.c<K, V> cVar = this.f110409a;
        k53.f<K, l53.a<V>> fVar = this.f110412d;
        if (cVar != null) {
            k53.d<K, l53.a<V>> dVar = fVar.f102973a;
            return cVar;
        }
        k53.d<K, l53.a<V>> dVar2 = fVar.f102973a;
        l53.c<K, V> cVar2 = new l53.c<>(this.f110410b, this.f110411c, fVar.build());
        this.f110409a = cVar2;
        return cVar2;
    }

    @Override // p13.g
    /* JADX INFO: renamed from: c */
    public final int getF102978f() {
        return this.f110412d.getF102978f();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        k53.f<K, l53.a<V>> fVar = this.f110412d;
        if (!fVar.isEmpty()) {
            this.f110409a = null;
        }
        fVar.clear();
        n53.b bVar = n53.b.f123788a;
        this.f110410b = bVar;
        this.f110411c = bVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f110412d.containsKey(obj);
    }

    @Override // p13.g
    public final Collection<V> d() {
        return new j(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        k53.f<K, l53.a<V>> fVar = this.f110412d;
        Map map = (Map) obj;
        if (fVar.getF102978f() != map.size()) {
            return false;
        }
        if (map instanceof l53.c) {
            return fVar.f102975c.g(((l53.c) obj).f110404d.f102964b, a.f110413a);
        }
        if (map instanceof d) {
            return fVar.f102975c.g(((d) obj).f110412d.f102975c, b.f110414a);
        }
        if (map instanceof k53.d) {
            return fVar.f102975c.g(((k53.d) obj).f102964b, c.f110415a);
        }
        if (map instanceof k53.f) {
            return fVar.f102975c.g(((k53.f) obj).f102975c, C2109d.f110416a);
        }
        n53.d.f123789a.getClass();
        return n53.d.b(this, map);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        l53.a<V> aVar = this.f110412d.get(obj);
        if (aVar != null) {
            return aVar.f110395a;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        n53.d.f123789a.getClass();
        return entrySet().hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k14, V v14) {
        k53.f<K, l53.a<V>> fVar = this.f110412d;
        l53.a<V> aVar = fVar.get(k14);
        if (aVar != null) {
            V v15 = aVar.f110395a;
            if (v15 == v14) {
                return v14;
            }
            this.f110409a = null;
            fVar.put(k14, new l53.a<>(v14, aVar.f110396b, aVar.f110397c));
            return v15;
        }
        this.f110409a = null;
        if (isEmpty()) {
            this.f110410b = k14;
            this.f110411c = k14;
            fVar.put(k14, new l53.a<>(v14));
            return null;
        }
        Object obj = this.f110411c;
        l53.a<V> aVar2 = fVar.get(obj);
        aVar2.getClass();
        l53.a<V> aVar3 = aVar2;
        n53.b bVar = n53.b.f123788a;
        fVar.put((K) obj, new l53.a<>(aVar3.f110395a, aVar3.f110396b, k14));
        fVar.put(k14, new l53.a<>(v14, obj));
        this.f110411c = k14;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        k53.f<K, l53.a<V>> fVar = this.f110412d;
        l53.a<V> aVarRemove = fVar.remove(obj);
        if (aVarRemove == null) {
            return null;
        }
        Object obj2 = aVarRemove.f110397c;
        Object obj3 = aVarRemove.f110396b;
        this.f110409a = null;
        n53.b bVar = n53.b.f123788a;
        if (obj3 != bVar) {
            l53.a<V> aVar = fVar.get(obj3);
            aVar.getClass();
            l53.a<V> aVar2 = aVar;
            fVar.put((K) obj3, new l53.a<>(aVar2.f110395a, aVar2.f110396b, obj2));
        } else {
            this.f110410b = obj2;
        }
        if (obj2 != bVar) {
            l53.a<V> aVar3 = fVar.get(obj2);
            aVar3.getClass();
            l53.a<V> aVar4 = aVar3;
            fVar.put((K) obj2, new l53.a<>(aVar4.f110395a, obj3, aVar4.f110397c));
        } else {
            this.f110411c = obj3;
        }
        return aVarRemove.f110395a;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        l53.a<V> aVar = this.f110412d.get(obj);
        if (aVar == null || !s.g(aVar.f110395a, obj2)) {
            return false;
        }
        remove(obj);
        return true;
    }
}

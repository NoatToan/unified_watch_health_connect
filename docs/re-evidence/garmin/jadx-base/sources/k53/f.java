package k53;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lk53/f;", "K", "V", "Li53/g$a;", "Lp13/g;", "Lk53/d;", "map", "<init>", "(Lk53/d;)V", "kotlinx-collections-immutable"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f<K, V> extends p13.g<K, V> implements i53.g.a<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k53.d<K, V> f102973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n53.e f102974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public t<K, V> f102975c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public V f102976d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f102977e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f102978f;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a implements e23.p<V, ?, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f102979a = new a();

        @Override // e23.p
        public final Boolean invoke(Object obj, Object obj2) {
            return Boolean.valueOf(p005kotlin.jvm.internal.s.g(obj, obj2));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b implements e23.p<V, ?, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f102980a = new b();

        @Override // e23.p
        public final Boolean invoke(Object obj, Object obj2) {
            return Boolean.valueOf(p005kotlin.jvm.internal.s.g(obj, obj2));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class c implements e23.p<V, ?, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f102981a = new c();

        @Override // e23.p
        public final Boolean invoke(Object obj, Object obj2) {
            l53.a aVar = (l53.a) obj2;
            aVar.getClass();
            return Boolean.valueOf(p005kotlin.jvm.internal.s.g(obj, aVar.f110395a));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class d implements e23.p<V, ?, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f102982a = new d();

        @Override // e23.p
        public final Boolean invoke(Object obj, Object obj2) {
            l53.a aVar = (l53.a) obj2;
            aVar.getClass();
            return Boolean.valueOf(p005kotlin.jvm.internal.s.g(obj, aVar.f110395a));
        }
    }

    public f(k53.d<K, V> dVar) {
        dVar.getClass();
        this.f102973a = dVar;
        this.f102974b = new n53.e();
        this.f102975c = dVar.f102964b;
        this.f102978f = dVar.getF102965c();
    }

    @Override // p13.g
    public final Set<Map.Entry<K, V>> a() {
        return new h(this);
    }

    @Override // p13.g
    public final Set<K> b() {
        return new j(this);
    }

    @Override // p13.g
    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getF102978f() {
        return this.f102978f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        t.f102994e.getClass();
        t<K, V> tVar = t.f102995f;
        tVar.getClass();
        g(tVar);
        h(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f102975c.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // p13.g
    public final Collection<V> d() {
        return new l(this);
    }

    @Override // i53.g.a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final k53.d<K, V> build() {
        k53.d<K, V> dVar = this.f102973a;
        if (dVar != null) {
            return dVar;
        }
        k53.d<K, V> dVar2 = new k53.d<>(this.f102975c, getF102978f());
        this.f102973a = dVar2;
        this.f102974b = new n53.e();
        return dVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this.f102978f != map.size()) {
            return false;
        }
        if (map instanceof k53.d) {
            return this.f102975c.g(((k53.d) obj).f102964b, a.f102979a);
        }
        if (map instanceof f) {
            return this.f102975c.g(((f) obj).f102975c, b.f102980a);
        }
        if (map instanceof l53.c) {
            return this.f102975c.g(((l53.c) obj).f110404d.f102964b, c.f102981a);
        }
        if (map instanceof l53.d) {
            return this.f102975c.g(((l53.d) obj).f110412d.f102975c, d.f102982a);
        }
        n53.d.f123789a.getClass();
        return n53.d.b(this, map);
    }

    public final void g(t<K, V> tVar) {
        tVar.getClass();
        if (tVar != this.f102975c) {
            this.f102975c = tVar;
            this.f102973a = null;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        return (V) this.f102975c.h(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    public final void h(int i14) {
        this.f102978f = i14;
        this.f102977e++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        n53.d.f123789a.getClass();
        return entrySet().hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k14, V v14) {
        this.f102976d = null;
        g(this.f102975c.m(k14 != null ? k14.hashCode() : 0, k14, v14, 0, this));
        return this.f102976d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        map.getClass();
        if (map.isEmpty()) {
            return;
        }
        p005kotlin.jvm.internal.j jVar = null;
        k53.d<K, V> dVarBuild = map instanceof k53.d ? (k53.d) map : null;
        if (dVarBuild == null) {
            f fVar = map instanceof f ? (f) map : null;
            dVarBuild = fVar != null ? fVar.build() : null;
        }
        if (dVarBuild == null) {
            super.putAll(map);
            return;
        }
        n53.a aVar = new n53.a(0, 1, jVar);
        int f102978f = getF102978f();
        t<K, V> tVar = this.f102975c;
        t<K, V> tVar2 = dVarBuild.f102964b;
        tVar2.getClass();
        g(tVar.n(tVar2, 0, aVar, this));
        int f102965c = (dVarBuild.getF102965c() + f102978f) - aVar.f123787a;
        if (f102978f != f102965c) {
            h(f102965c);
        }
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int f102978f = getF102978f();
        t<K, V> tVarP = this.f102975c.p(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (tVarP == null) {
            t.f102994e.getClass();
            tVarP = t.f102995f;
            tVarP.getClass();
        }
        g(tVarP);
        return f102978f != getF102978f();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        this.f102976d = null;
        t<K, V> tVarO = this.f102975c.o(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (tVarO == null) {
            t.f102994e.getClass();
            tVarO = t.f102995f;
            tVarO.getClass();
        }
        g(tVarO);
        return this.f102976d;
    }
}

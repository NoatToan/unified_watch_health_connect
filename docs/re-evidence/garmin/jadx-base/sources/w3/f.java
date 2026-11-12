package w3;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0011\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lw3/f;", "K", "V", "Lu3/d$a;", "Lp13/g;", "Lw3/d;", "map", "<init>", "(Lw3/d;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class f<K, V> extends p13.g<K, V> implements u3.d.a<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d<K, V> f181792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public y3.d f181793b = new y3.d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public t<K, V> f181794c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public V f181795d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f181796e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f181797f;

    public f(d<K, V> dVar) {
        this.f181792a = dVar;
        d<K, V> dVar2 = this.f181792a;
        this.f181794c = dVar2.f181787b;
        this.f181797f = dVar2.getF181788c();
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
    public final int getF181797f() {
        return this.f181797f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        t.f181809e.getClass();
        t<K, V> tVar = t.f181810f;
        tVar.getClass();
        this.f181794c = tVar;
        g(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.f181794c.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // p13.g
    public final Collection<V> d() {
        return new l(this);
    }

    @Override // u3.d.a
    public d<K, V> e() {
        t<K, V> tVar = this.f181794c;
        d<K, V> dVar = this.f181792a;
        if (tVar != dVar.f181787b) {
            this.f181793b = new y3.d();
            dVar = new d<>(this.f181794c, getF181797f());
        }
        this.f181792a = dVar;
        return dVar;
    }

    public final void g(int i14) {
        this.f181797f = i14;
        this.f181796e++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        return (V) this.f181794c.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k14, V v14) {
        this.f181795d = null;
        this.f181794c = this.f181794c.l(k14 != null ? k14.hashCode() : 0, k14, v14, 0, this);
        return this.f181795d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        p005kotlin.jvm.internal.j jVar = null;
        d<K, V> dVarE = map instanceof d ? (d) map : null;
        if (dVarE == null) {
            f fVar = map instanceof f ? (f) map : null;
            dVarE = fVar != null ? fVar.e() : null;
        }
        if (dVarE == null) {
            super.putAll(map);
            return;
        }
        y3.a aVar = new y3.a(0, 1, jVar);
        int i14 = this.f181797f;
        t<K, V> tVar = this.f181794c;
        t<K, V> tVar2 = dVarE.f181787b;
        tVar2.getClass();
        this.f181794c = tVar.m(tVar2, 0, aVar, this);
        int i15 = (dVarE.f181788c + i14) - aVar.f194360a;
        if (i14 != i15) {
            g(i15);
        }
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int f181797f = getF181797f();
        t<K, V> tVarO = this.f181794c.o(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (tVarO == null) {
            t.f181809e.getClass();
            tVarO = t.f181810f;
            tVarO.getClass();
        }
        this.f181794c = tVarO;
        return f181797f != getF181797f();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        this.f181795d = null;
        t<K, V> tVarN = this.f181794c.n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (tVarN == null) {
            t.f181809e.getClass();
            tVarN = t.f181810f;
            tVarN.getClass();
        }
        this.f181794c = tVarN;
        return this.f181795d;
    }
}

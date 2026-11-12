package f4;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lf4/u;", "K", "V", "Lf4/g0;", "", "<init>", "()V", "a", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class u<K, V> implements g0, Map<K, V>, f23.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f68807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f68808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f68809c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p f68810d;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B)\b\u0000\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lf4/u$a;", "K", "V", "Lf4/i0;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "Lu3/d;", "map", "<init>", "(JLu3/d;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a<K, V> extends i0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public u3.d<K, ? extends V> f68811c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f68812d;

        public a(long j8, u3.d<K, ? extends V> dVar) {
            super(j8);
            this.f68811c = dVar;
        }

        @Override // f4.i0
        public final void a(i0 i0Var) {
            i0Var.getClass();
            a aVar = (a) i0Var;
            synchronized (t.f68806b) {
                this.f68811c = aVar.f68811c;
                this.f68812d = aVar.f68812d;
                Unit unit = Unit.INSTANCE;
            }
        }

        @Override // f4.i0
        public final i0 b() {
            return new a(l.i().getF68737b(), this.f68811c);
        }

        @Override // f4.i0
        public final i0 c(long j8) {
            return new a(j8, this.f68811c);
        }
    }

    public u() {
        w3.d.f181785d.getClass();
        w3.d dVar = w3.d.f181786e;
        dVar.getClass();
        f fVarI = l.i();
        a aVar = new a(fVarI.getF68737b(), dVar);
        if (!(fVarI instanceof androidx.compose.runtime.snapshots.a)) {
            aVar.f68750b = new a(1, dVar);
        }
        this.f68807a = aVar;
        this.f68808b = new m(this);
        this.f68809c = new n(this);
        this.f68810d = new p(this);
    }

    public static final boolean a(u uVar, a aVar, int i14, u3.d dVar) {
        boolean z14;
        uVar.getClass();
        synchronized (t.f68806b) {
            int i15 = aVar.f68812d;
            if (i15 == i14) {
                aVar.f68811c = dVar;
                z14 = true;
                aVar.f68812d = i15 + 1;
            } else {
                z14 = false;
            }
        }
        return z14;
    }

    public final a<K, V> b() {
        a aVar = this.f68807a;
        aVar.getClass();
        return (a) l.s(aVar, this);
    }

    @Override // java.util.Map
    public final void clear() {
        f fVarI;
        a aVar = this.f68807a;
        aVar.getClass();
        a aVar2 = (a) l.g(aVar);
        w3.d.f181785d.getClass();
        w3.d dVar = w3.d.f181786e;
        dVar.getClass();
        if (dVar != aVar2.f68811c) {
            a aVar3 = this.f68807a;
            aVar3.getClass();
            synchronized (l.f68775c) {
                f.f68735e.getClass();
                fVarI = l.i();
                a aVar4 = (a) l.v(aVar3, this, fVarI);
                synchronized (t.f68806b) {
                    aVar4.f68811c = dVar;
                    aVar4.f68812d++;
                }
            }
            l.m(fVarI, this);
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return b().f68811c.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return b().f68811c.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return this.f68808b;
    }

    @Override // java.util.Map
    public final V get(Object obj) {
        return b().f68811c.get(obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return b().f68811c.isEmpty();
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        return this.f68809c;
    }

    @Override // f4.g0
    public final i0 m() {
        return this.f68807a;
    }

    @Override // java.util.Map
    public final V put(K k14, V v14) {
        u3.d<K, ? extends V> dVar;
        int i14;
        V vPut;
        f fVarI;
        boolean zA;
        do {
            synchronized (t.f68806b) {
                a aVar = this.f68807a;
                aVar.getClass();
                a aVar2 = (a) l.g(aVar);
                dVar = aVar2.f68811c;
                i14 = aVar2.f68812d;
                Unit unit = Unit.INSTANCE;
            }
            dVar.getClass();
            u3.d.a<K, ? extends V> aVarBuilder = dVar.builder();
            vPut = aVarBuilder.put(k14, v14);
            u3.d<K, ? extends V> dVarE = aVarBuilder.e();
            if (p005kotlin.jvm.internal.s.g(dVarE, dVar)) {
                break;
            }
            a aVar3 = this.f68807a;
            aVar3.getClass();
            synchronized (l.f68775c) {
                f.f68735e.getClass();
                fVarI = l.i();
                zA = a(this, (a) l.v(aVar3, this, fVarI), i14, dVarE);
            }
            l.m(fVarI, this);
        } while (!zA);
        return vPut;
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        u3.d<K, ? extends V> dVar;
        int i14;
        f fVarI;
        boolean zA;
        do {
            synchronized (t.f68806b) {
                a aVar = this.f68807a;
                aVar.getClass();
                a aVar2 = (a) l.g(aVar);
                dVar = aVar2.f68811c;
                i14 = aVar2.f68812d;
                Unit unit = Unit.INSTANCE;
            }
            dVar.getClass();
            u3.d.a<K, ? extends V> aVarBuilder = dVar.builder();
            aVarBuilder.putAll(map);
            u3.d<K, ? extends V> dVarE = aVarBuilder.e();
            if (p005kotlin.jvm.internal.s.g(dVarE, dVar)) {
                return;
            }
            a aVar3 = this.f68807a;
            aVar3.getClass();
            synchronized (l.f68775c) {
                f.f68735e.getClass();
                fVarI = l.i();
                zA = a(this, (a) l.v(aVar3, this, fVarI), i14, dVarE);
            }
            l.m(fVarI, this);
        } while (!zA);
    }

    @Override // f4.g0
    public final void q(i0 i0Var) {
        i0Var.getClass();
        this.f68807a = (a) i0Var;
    }

    @Override // java.util.Map
    public final V remove(Object obj) {
        u3.d<K, ? extends V> dVar;
        int i14;
        V vRemove;
        f fVarI;
        boolean zA;
        do {
            synchronized (t.f68806b) {
                a aVar = this.f68807a;
                aVar.getClass();
                a aVar2 = (a) l.g(aVar);
                dVar = aVar2.f68811c;
                i14 = aVar2.f68812d;
                Unit unit = Unit.INSTANCE;
            }
            dVar.getClass();
            u3.d.a<K, ? extends V> aVarBuilder = dVar.builder();
            vRemove = aVarBuilder.remove(obj);
            u3.d<K, ? extends V> dVarE = aVarBuilder.e();
            if (p005kotlin.jvm.internal.s.g(dVarE, dVar)) {
                break;
            }
            a aVar3 = this.f68807a;
            aVar3.getClass();
            synchronized (l.f68775c) {
                f.f68735e.getClass();
                fVarI = l.i();
                zA = a(this, (a) l.v(aVar3, this, fVarI), i14, dVarE);
            }
            l.m(fVarI, this);
        } while (!zA);
        return vRemove;
    }

    @Override // java.util.Map
    public final int size() {
        return b().f68811c.size();
    }

    public final String toString() {
        a aVar = this.f68807a;
        aVar.getClass();
        return "SnapshotStateMap(value=" + ((a) l.g(aVar)).f68811c + ")@" + hashCode();
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        return this.f68810d;
    }
}

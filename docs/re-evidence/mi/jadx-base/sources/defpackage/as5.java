package defpackage;

import com.bumptech.glide.Priority;
import com.bumptech.glide.Registry;
import com.bumptech.glide.c;
import com.bumptech.glide.load.data.a;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class as5<Transcode> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<d7g.a<?>> f3405a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<pzd> f3406b = new ArrayList();
    public c c;
    public Object d;
    public int e;
    public int f;
    public Class<?> g;
    public bs5.e h;
    public cch i;
    public Map<Class<?>, lyp<?>> j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Class<Transcode> f3407k;
    public boolean l;
    public boolean m;
    public pzd n;
    public Priority o;
    public jy6 p;
    public boolean q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f3408r;

    public void a() {
        this.c = null;
        this.d = null;
        this.n = null;
        this.g = null;
        this.f3407k = null;
        this.i = null;
        this.o = null;
        this.j = null;
        this.p = null;
        this.f3405a.clear();
        this.l = false;
        this.f3406b.clear();
        this.m = false;
    }

    public nj1 b() {
        return this.c.b();
    }

    public List<pzd> c() {
        if (!this.m) {
            this.m = true;
            this.f3406b.clear();
            List<d7g.a<?>> listG = g();
            int size = listG.size();
            for (int i = 0; i < size; i++) {
                d7g.a<?> aVar = listG.get(i);
                if (!this.f3406b.contains(aVar.f15175a)) {
                    this.f3406b.add(aVar.f15175a);
                }
                for (int i2 = 0; i2 < aVar.f15176b.size(); i2++) {
                    if (!this.f3406b.contains(aVar.f15176b.get(i2))) {
                        this.f3406b.add(aVar.f15176b.get(i2));
                    }
                }
            }
        }
        return this.f3406b;
    }

    public fy6 d() {
        return this.h.getDiskCache();
    }

    public jy6 e() {
        return this.p;
    }

    public int f() {
        return this.f;
    }

    public List<d7g.a<?>> g() {
        if (!this.l) {
            this.l = true;
            this.f3405a.clear();
            List listI = this.c.i().i(this.d);
            int size = listI.size();
            for (int i = 0; i < size; i++) {
                d7g.a<?> aVarB = ((d7g) listI.get(i)).b(this.d, this.e, this.f, this.i);
                if (aVarB != null) {
                    this.f3405a.add(aVarB);
                }
            }
        }
        return this.f3405a;
    }

    public <Data> pie<Data, ?, Transcode> h(Class<Data> cls) {
        return this.c.i().h(cls, this.g, this.f3407k);
    }

    public Class<?> i() {
        return this.d.getClass();
    }

    public List<d7g<File, ?>> j(File file) throws Registry.NoModelLoaderAvailableException {
        return this.c.i().i(file);
    }

    public cch k() {
        return this.i;
    }

    public Priority l() {
        return this.o;
    }

    public List<Class<?>> m() {
        return this.c.i().j(this.d.getClass(), this.g, this.f3407k);
    }

    public <Z> xqk<Z> n(kqk<Z> kqkVar) {
        return this.c.i().k(kqkVar);
    }

    public <T> a<T> o(T t) {
        return this.c.i().l(t);
    }

    public pzd p() {
        return this.n;
    }

    public <X> x98<X> q(X x) throws Registry.NoSourceEncoderAvailableException {
        return this.c.i().m(x);
    }

    public Class<?> r() {
        return this.f3407k;
    }

    public <Z> lyp<Z> s(Class<Z> cls) {
        lyp<Z> lypVar = (lyp) this.j.get(cls);
        if (lypVar == null) {
            for (Map.Entry<Class<?>, lyp<?>> entry : this.j.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    lypVar = (lyp) entry.getValue();
                    break;
                }
            }
        }
        if (lypVar != null) {
            return lypVar;
        }
        if (!this.j.isEmpty() || !this.q) {
            return haq.c();
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }

    public int t() {
        return this.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean u(Class<?> cls) {
        return h(cls) != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <R> void v(c cVar, Object obj, pzd pzdVar, int i, int i2, jy6 jy6Var, Class<?> cls, Class<R> cls2, Priority priority, cch cchVar, Map<Class<?>, lyp<?>> map, boolean z, boolean z2, bs5.e eVar) {
        this.c = cVar;
        this.d = obj;
        this.n = pzdVar;
        this.e = i;
        this.f = i2;
        this.p = jy6Var;
        this.g = cls;
        this.h = eVar;
        this.f3407k = cls2;
        this.o = priority;
        this.i = cchVar;
        this.j = map;
        this.q = z;
        this.f3408r = z2;
    }

    public boolean w(kqk<?> kqkVar) {
        return this.c.i().n(kqkVar);
    }

    public boolean x() {
        return this.f3408r;
    }

    public boolean y(pzd pzdVar) {
        List<d7g.a<?>> listG = g();
        int size = listG.size();
        for (int i = 0; i < size; i++) {
            if (listG.get(i).f15175a.equals(pzdVar)) {
                return true;
            }
        }
        return false;
    }
}

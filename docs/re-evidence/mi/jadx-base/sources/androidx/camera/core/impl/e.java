package androidx.camera.core.impl;

import androidx.annotation.RequiresApi;
import defpackage.mag;
import defpackage.odg;
import defpackage.uzo;
import defpackage.we3;
import defpackage.ye3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class e {
    public static final Config.a<Integer> h = Config.a.a("camerax.core.captureConfig.rotation", Integer.TYPE);
    public static final Config.a<Integer> i = Config.a.a("camerax.core.captureConfig.jpegQuality", Integer.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<DeferrableSurface> f1730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Config f1731b;
    public final int c;
    public final List<we3> d;
    public final boolean e;
    public final uzo f;
    public final ye3 g;

    public interface b {
        void a(r<?> rVar, a aVar);
    }

    public e(List<DeferrableSurface> list, Config config, int i2, List<we3> list2, boolean z, uzo uzoVar, ye3 ye3Var) {
        this.f1730a = list;
        this.f1731b = config;
        this.c = i2;
        this.d = Collections.unmodifiableList(list2);
        this.e = z;
        this.f = uzoVar;
        this.g = ye3Var;
    }

    public static e a() {
        return new a().h();
    }

    public List<we3> b() {
        return this.d;
    }

    public ye3 c() {
        return this.g;
    }

    public Config d() {
        return this.f1731b;
    }

    public List<DeferrableSurface> e() {
        return Collections.unmodifiableList(this.f1730a);
    }

    public uzo f() {
        return this.f;
    }

    public int g() {
        return this.c;
    }

    public boolean h() {
        return this.e;
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set<DeferrableSurface> f1732a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public l f1733b;
        public int c;
        public List<we3> d;
        public boolean e;
        public odg f;
        public ye3 g;

        public a() {
            this.f1732a = new HashSet();
            this.f1733b = m.O();
            this.c = -1;
            this.d = new ArrayList();
            this.e = false;
            this.f = odg.f();
        }

        public static a j(r<?> rVar) {
            b bVarP = rVar.p(null);
            if (bVarP != null) {
                a aVar = new a();
                bVarP.a(rVar, aVar);
                return aVar;
            }
            throw new IllegalStateException("Implementation is missing option unpacker for " + rVar.r(rVar.toString()));
        }

        public static a k(e eVar) {
            return new a(eVar);
        }

        public void a(Collection<we3> collection) {
            Iterator<we3> it = collection.iterator();
            while (it.hasNext()) {
                c(it.next());
            }
        }

        public void b(uzo uzoVar) {
            this.f.e(uzoVar);
        }

        public void c(we3 we3Var) {
            if (this.d.contains(we3Var)) {
                return;
            }
            this.d.add(we3Var);
        }

        public <T> void d(Config.a<T> aVar, T t) {
            this.f1733b.z(aVar, t);
        }

        public void e(Config config) {
            for (Config.a<?> aVar : config.h()) {
                Object objD = this.f1733b.d(aVar, null);
                Object objA = config.a(aVar);
                if (objD instanceof mag) {
                    ((mag) objD).a(((mag) objA).c());
                } else {
                    if (objA instanceof mag) {
                        objA = ((mag) objA).clone();
                    }
                    this.f1733b.o(aVar, config.i(aVar), objA);
                }
            }
        }

        public void f(DeferrableSurface deferrableSurface) {
            this.f1732a.add(deferrableSurface);
        }

        public void g(String str, Object obj) {
            this.f.h(str, obj);
        }

        public e h() {
            return new e(new ArrayList(this.f1732a), n.M(this.f1733b), this.c, this.d, this.e, uzo.b(this.f), this.g);
        }

        public void i() {
            this.f1732a.clear();
        }

        public Set<DeferrableSurface> l() {
            return this.f1732a;
        }

        public int m() {
            return this.c;
        }

        public void n(ye3 ye3Var) {
            this.g = ye3Var;
        }

        public void o(Config config) {
            this.f1733b = m.P(config);
        }

        public void p(int i) {
            this.c = i;
        }

        public void q(boolean z) {
            this.e = z;
        }

        public a(e eVar) {
            HashSet hashSet = new HashSet();
            this.f1732a = hashSet;
            this.f1733b = m.O();
            this.c = -1;
            this.d = new ArrayList();
            this.e = false;
            this.f = odg.f();
            hashSet.addAll(eVar.f1730a);
            this.f1733b = m.P(eVar.f1731b);
            this.c = eVar.c;
            this.d.addAll(eVar.b());
            this.e = eVar.h();
            this.f = odg.g(eVar.f());
        }
    }
}

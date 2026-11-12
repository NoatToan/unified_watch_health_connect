package defpackage;

import android.util.Pair;
import com.facebook.imagepipeline.common.Priority;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes4.dex */
public abstract class tag<K, T extends Closeable> implements dbi<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<K, tag<K, T>.b> f34504a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dbi<T> f34505b;

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final K f34506a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CopyOnWriteArraySet<Pair<cg4<T>, ebi>> f34507b = i0m.a();
        public T c;
        public float d;
        public int e;
        public da2 f;
        public tag<K, T>.b.C1110b g;

        public class a extends ea2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Pair f34508a;

            public a(Pair pair) {
                this.f34508a = pair;
            }

            @Override // defpackage.ea2, defpackage.fbi
            public void a() {
                da2.i(b.this.r());
            }

            @Override // defpackage.fbi
            public void b() {
                boolean zRemove;
                List list;
                da2 da2Var;
                List listT;
                List listR;
                synchronized (b.this) {
                    try {
                        zRemove = b.this.f34507b.remove(this.f34508a);
                        list = null;
                        if (!zRemove) {
                            da2Var = null;
                            listT = null;
                        } else if (b.this.f34507b.isEmpty()) {
                            da2Var = b.this.f;
                            listT = null;
                        } else {
                            List listS = b.this.s();
                            listT = b.this.t();
                            listR = b.this.r();
                            da2Var = null;
                            list = listS;
                        }
                        listR = listT;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                da2.j(list);
                da2.k(listT);
                da2.i(listR);
                if (da2Var != null) {
                    da2Var.l();
                }
                if (zRemove) {
                    ((cg4) this.f34508a.first).a();
                }
            }

            @Override // defpackage.ea2, defpackage.fbi
            public void c() {
                da2.j(b.this.s());
            }

            @Override // defpackage.ea2, defpackage.fbi
            public void d() {
                da2.k(b.this.t());
            }
        }

        /* JADX INFO: renamed from: tag$b$b, reason: collision with other inner class name */
        public class C1110b extends e52<T> {
            public C1110b() {
            }

            @Override // defpackage.e52
            public void f() {
                try {
                    if (epa.d()) {
                        epa.a("MultiplexProducer#onCancellation");
                    }
                    b.this.m(this);
                } finally {
                    if (epa.d()) {
                        epa.b();
                    }
                }
            }

            @Override // defpackage.e52
            public void g(Throwable th) {
                try {
                    if (epa.d()) {
                        epa.a("MultiplexProducer#onFailure");
                    }
                    b.this.n(this, th);
                } finally {
                    if (epa.d()) {
                        epa.b();
                    }
                }
            }

            @Override // defpackage.e52
            public void i(float f) {
                try {
                    if (epa.d()) {
                        epa.a("MultiplexProducer#onProgressUpdate");
                    }
                    b.this.p(this, f);
                } finally {
                    if (epa.d()) {
                        epa.b();
                    }
                }
            }

            @Override // defpackage.e52
            /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
            public void h(T t, int i) {
                try {
                    if (epa.d()) {
                        epa.a("MultiplexProducer#onNewResult");
                    }
                    b.this.o(this, t, i);
                } finally {
                    if (epa.d()) {
                        epa.b();
                    }
                }
            }
        }

        public b(K k2) {
            this.f34506a = k2;
        }

        public final void g(Pair<cg4<T>, ebi> pair, ebi ebiVar) {
            ebiVar.c(new a(pair));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public boolean h(cg4<T> cg4Var, ebi ebiVar) {
            Pair<cg4<T>, ebi> pairCreate = Pair.create(cg4Var, ebiVar);
            synchronized (this) {
                try {
                    if (tag.this.h(this.f34506a) != this) {
                        return false;
                    }
                    this.f34507b.add(pairCreate);
                    List<fbi> listS = s();
                    List<fbi> listT = t();
                    List<fbi> listR = r();
                    Closeable closeableF = this.c;
                    float f = this.d;
                    int i = this.e;
                    da2.j(listS);
                    da2.k(listT);
                    da2.i(listR);
                    synchronized (pairCreate) {
                        try {
                            synchronized (this) {
                                try {
                                    if (closeableF != this.c) {
                                        closeableF = null;
                                    } else if (closeableF != null) {
                                        closeableF = tag.this.f(closeableF);
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            if (closeableF != null) {
                                if (f > 0.0f) {
                                    cg4Var.c(f);
                                }
                                cg4Var.b(closeableF, i);
                                i(closeableF);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    g(pairCreate, ebiVar);
                    return true;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        public final void i(Closeable closeable) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        public final synchronized boolean j() {
            Iterator<Pair<cg4<T>, ebi>> it = this.f34507b.iterator();
            while (it.hasNext()) {
                if (((ebi) it.next().second).d()) {
                    return true;
                }
            }
            return false;
        }

        public final synchronized boolean k() {
            Iterator<Pair<cg4<T>, ebi>> it = this.f34507b.iterator();
            while (it.hasNext()) {
                if (!((ebi) it.next().second).e()) {
                    return false;
                }
            }
            return true;
        }

        public final synchronized Priority l() {
            Priority higherPriority;
            higherPriority = Priority.LOW;
            Iterator<Pair<cg4<T>, ebi>> it = this.f34507b.iterator();
            while (it.hasNext()) {
                higherPriority = Priority.getHigherPriority(higherPriority, ((ebi) it.next().second).getPriority());
            }
            return higherPriority;
        }

        public void m(tag<K, T>.b.C1110b c1110b) {
            synchronized (this) {
                try {
                    if (this.g != c1110b) {
                        return;
                    }
                    this.g = null;
                    this.f = null;
                    i(this.c);
                    this.c = null;
                    q();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void n(tag<K, T>.b.C1110b c1110b, Throwable th) {
            synchronized (this) {
                try {
                    if (this.g != c1110b) {
                        return;
                    }
                    this.f34507b.clear();
                    tag.this.j(this.f34506a, this);
                    i(this.c);
                    this.c = null;
                    for (Pair<cg4<T>, ebi> pair : this.f34507b) {
                        synchronized (pair) {
                            ((cg4) pair.first).onFailure(th);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void o(tag<K, T>.b.C1110b c1110b, T t, int i) {
            synchronized (this) {
                try {
                    if (this.g != c1110b) {
                        return;
                    }
                    i(this.c);
                    this.c = null;
                    if (e52.e(i)) {
                        this.c = (T) tag.this.f(t);
                        this.e = i;
                    } else {
                        this.f34507b.clear();
                        tag.this.j(this.f34506a, this);
                    }
                    for (Pair<cg4<T>, ebi> pair : this.f34507b) {
                        synchronized (pair) {
                            ((cg4) pair.first).b(t, i);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void p(tag<K, T>.b.C1110b c1110b, float f) {
            synchronized (this) {
                try {
                    if (this.g != c1110b) {
                        return;
                    }
                    this.d = f;
                    for (Pair<cg4<T>, ebi> pair : this.f34507b) {
                        synchronized (pair) {
                            ((cg4) pair.first).c(f);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void q() {
            synchronized (this) {
                try {
                    b6i.b(this.f == null);
                    b6i.b(this.g == null);
                    if (this.f34507b.isEmpty()) {
                        tag.this.j(this.f34506a, this);
                        return;
                    }
                    ebi ebiVar = (ebi) this.f34507b.iterator().next().second;
                    this.f = new da2(ebiVar.b(), ebiVar.getId(), ebiVar.f(), ebiVar.a(), ebiVar.g(), k(), j(), l());
                    tag<K, T>.b.C1110b c1110b = new C1110b();
                    this.g = c1110b;
                    tag.this.f34505b.a(c1110b, this.f);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final synchronized List<fbi> r() {
            da2 da2Var = this.f;
            if (da2Var == null) {
                return null;
            }
            return da2Var.n(j());
        }

        public final synchronized List<fbi> s() {
            da2 da2Var = this.f;
            if (da2Var == null) {
                return null;
            }
            return da2Var.o(k());
        }

        public final synchronized List<fbi> t() {
            da2 da2Var = this.f;
            if (da2Var == null) {
                return null;
            }
            return da2Var.p(l());
        }
    }

    public tag(dbi<T> dbiVar) {
        this.f34505b = dbiVar;
    }

    @Override // defpackage.dbi
    public void a(cg4<T> cg4Var, ebi ebiVar) {
        tag<K, T>.b bVarH;
        boolean z;
        try {
            if (epa.d()) {
                epa.a("MultiplexProducer#produceResults");
            }
            K kI = i(ebiVar);
            do {
                synchronized (this) {
                    try {
                        bVarH = h(kI);
                        if (bVarH == null) {
                            bVarH = g(kI);
                            z = true;
                        } else {
                            z = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } while (!bVarH.h(cg4Var, ebiVar));
            if (z) {
                bVarH.q();
            }
            if (epa.d()) {
                epa.b();
            }
        } catch (Throwable th2) {
            if (epa.d()) {
                epa.b();
            }
            throw th2;
        }
    }

    public abstract T f(T t);

    public final synchronized tag<K, T>.b g(K k2) {
        tag<K, T>.b bVar;
        bVar = new b(k2);
        this.f34504a.put(k2, bVar);
        return bVar;
    }

    public final synchronized tag<K, T>.b h(K k2) {
        return this.f34504a.get(k2);
    }

    public abstract K i(ebi ebiVar);

    public final synchronized void j(K k2, tag<K, T>.b bVar) {
        if (this.f34504a.get(k2) == bVar) {
            this.f34504a.remove(k2);
        }
    }
}

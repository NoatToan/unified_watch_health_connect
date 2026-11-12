package q83;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import v83.s;
import v83.v;

/* JADX INFO: loaded from: classes11.dex */
public class m extends j83.h implements j83.o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f143432d = new c();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final y83.d.a f143433e = y83.d.f195249a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j83.h f143434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u83.b f143435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y83.c f143436c;

    public class a implements n83.d<f, j83.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j83.h.a f143437a;

        public a(m mVar, j83.h.a aVar) {
            this.f143437a = aVar;
        }

        @Override // n83.d
        public final j83.b call(f fVar) {
            try {
                return new j83.b(new l(this, fVar));
            } catch (NullPointerException e4) {
                throw e4;
            } catch (Throwable th3) {
                s.a(th3);
                int i14 = j83.b.f97744b;
                NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
                nullPointerException.initCause(th3);
                throw nullPointerException;
            }
        }
    }

    public class b extends j83.h.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicBoolean f143438a = new AtomicBoolean();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j83.h.a f143439b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ j83.f f143440c;

        public b(m mVar, j83.h.a aVar, j83.f fVar) {
            this.f143439b = aVar;
            this.f143440c = fVar;
        }

        @Override // j83.h.a
        public final j83.o a(n83.a aVar) {
            d dVar = new d(aVar);
            this.f143440c.c(dVar);
            return dVar;
        }

        @Override // j83.o
        public final boolean e() {
            return this.f143438a.get();
        }

        @Override // j83.o
        public final void f() {
            if (this.f143438a.compareAndSet(false, true)) {
                this.f143439b.f();
                this.f143440c.a();
            }
        }
    }

    public static class c implements j83.o {
        @Override // j83.o
        public final boolean e() {
            return false;
        }

        @Override // j83.o
        public final void f() {
        }
    }

    public static class d extends f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final n83.a f143441b;

        public d(n83.a aVar) {
            this.f143441b = aVar;
        }

        @Override // q83.m.f
        public final j83.o a(j83.h.a aVar, j83.d dVar) {
            return aVar.a(new e(this.f143441b, dVar));
        }
    }

    public static class e implements n83.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j83.d f143442a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final n83.a f143443b;

        public e(n83.a aVar, j83.d dVar) {
            this.f143443b = aVar;
            this.f143442a = dVar;
        }

        @Override // n83.a
        public final void d() {
            j83.d dVar = this.f143442a;
            try {
                this.f143443b.d();
            } finally {
                dVar.a();
            }
        }
    }

    public static abstract class f extends AtomicReference<j83.o> implements j83.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f143444a = 0;

        public f() {
            super(m.f143432d);
        }

        public abstract j83.o a(j83.h.a aVar, j83.d dVar);

        @Override // j83.o
        public final boolean e() {
            return get().e();
        }

        @Override // j83.o
        public final void f() {
            j83.o oVar;
            y83.d.a aVar = m.f143433e;
            do {
                oVar = get();
                if (oVar == m.f143433e) {
                    return;
                }
            } while (!compareAndSet(oVar, aVar));
            if (oVar != m.f143432d) {
                oVar.f();
            }
        }
    }

    public m(n83.d<j83.e<j83.e<j83.b>>, j83.b> dVar, j83.h hVar) {
        this.f143434a = hVar;
        x83.a aVar = new x83.a(new x83.a.b());
        this.f143435b = new u83.b(aVar);
        j83.b bVarCall = dVar.call(j83.e.e(new o83.h(aVar.f97747a, o83.m.b.f130939a)));
        bVarCall.getClass();
        y83.c cVar = new y83.c();
        j83.c cVar2 = new j83.c(bVarCall, cVar);
        try {
            j83.b.c cVar3 = bVarCall.f97745a;
            if (s.f176262g != null) {
                v.f176271f.a().getClass();
            }
            cVar3.call(cVar2);
            this.f143436c = cVar;
        } catch (NullPointerException e4) {
            throw e4;
        } catch (Throwable th3) {
            th = th3;
            m83.a.b(th);
            v83.e eVar = s.f176268m;
            th = eVar != null ? (Throwable) eVar.call(th) : th;
            s.a(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    @Override // j83.h
    public final j83.h.a createWorker() {
        j83.h.a aVarCreateWorker = this.f143434a.createWorker();
        o83.b bVarG = o83.b.g();
        u83.b bVar = new u83.b(bVarG);
        j83.e eVarE = j83.e.e(new o83.i(bVarG, new a(this, aVarCreateWorker)));
        b bVar2 = new b(this, aVarCreateWorker, bVar);
        this.f143435b.c(eVarE);
        return bVar2;
    }

    @Override // j83.o
    public final boolean e() {
        return this.f143436c.f195248a.e();
    }

    @Override // j83.o
    public final void f() {
        this.f143436c.f();
    }
}

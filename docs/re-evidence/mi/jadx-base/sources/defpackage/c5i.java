package defpackage;

import android.graphics.Bitmap;
import com.facebook.common.internal.ImmutableMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public class c5i implements dbi<w14<u14>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dbi<w14<u14>> f4949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f0i f4950b;
    public final Executor c;

    public class b extends sy5<w14<u14>, w14<u14>> {
        public final hbi c;
        public final String d;
        public final b5i e;
        public boolean f;
        public w14<u14> g;
        public int h;
        public boolean i;
        public boolean j;

        public class a extends ea2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ c5i f4952a;

            public a(c5i c5iVar) {
                this.f4952a = c5iVar;
            }

            @Override // defpackage.fbi
            public void b() {
                b.this.B();
            }
        }

        /* JADX INFO: renamed from: c5i$b$b, reason: collision with other inner class name */
        public class RunnableC0110b implements Runnable {
            public RunnableC0110b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                w14 w14Var;
                int i;
                synchronized (b.this) {
                    w14Var = b.this.g;
                    i = b.this.h;
                    b.this.g = null;
                    b.this.i = false;
                }
                if (w14.y(w14Var)) {
                    try {
                        b.this.y(w14Var, i);
                        w14.l(w14Var);
                    } catch (Throwable th) {
                        w14.l(w14Var);
                        throw th;
                    }
                }
                b.this.w();
            }
        }

        public b(cg4<w14<u14>> cg4Var, hbi hbiVar, String str, b5i b5iVar, ebi ebiVar) {
            super(cg4Var);
            this.g = null;
            this.h = 0;
            this.i = false;
            this.j = false;
            this.c = hbiVar;
            this.d = str;
            this.e = b5iVar;
            ebiVar.c(new a(c5i.this));
        }

        private boolean x() {
            synchronized (this) {
                try {
                    if (this.f) {
                        return false;
                    }
                    w14<u14> w14Var = this.g;
                    this.g = null;
                    this.f = true;
                    w14.l(w14Var);
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final synchronized boolean A() {
            return this.f;
        }

        public final void B() {
            if (x()) {
                o().a();
            }
        }

        public final void C(Throwable th) {
            if (x()) {
                o().onFailure(th);
            }
        }

        public final void D(w14<u14> w14Var, int i) {
            boolean zD = e52.d(i);
            if ((zD || A()) && !(zD && x())) {
                return;
            }
            o().b(w14Var, i);
        }

        @Override // defpackage.e52
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public void h(w14<u14> w14Var, int i) {
            if (w14.y(w14Var)) {
                J(w14Var, i);
            } else if (e52.d(i)) {
                D(null, i);
            }
        }

        public final w14<u14> F(u14 u14Var) {
            z14 z14Var = (z14) u14Var;
            w14<Bitmap> w14VarA = this.e.a(z14Var.d(), c5i.this.f4950b);
            try {
                return w14.D(new z14(w14VarA, u14Var.a(), z14Var.p(), z14Var.o()));
            } finally {
                w14.l(w14VarA);
            }
        }

        public final synchronized boolean G() {
            if (this.f || !this.i || this.j || !w14.y(this.g)) {
                return false;
            }
            this.j = true;
            return true;
        }

        public final boolean H(u14 u14Var) {
            return u14Var instanceof z14;
        }

        public final void I() {
            c5i.this.c.execute(new RunnableC0110b());
        }

        public final void J(w14<u14> w14Var, int i) {
            synchronized (this) {
                try {
                    if (this.f) {
                        return;
                    }
                    w14<u14> w14Var2 = this.g;
                    this.g = w14.d(w14Var);
                    this.h = i;
                    this.i = true;
                    boolean zG = G();
                    w14.l(w14Var2);
                    if (zG) {
                        I();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // defpackage.sy5, defpackage.e52
        public void f() {
            B();
        }

        @Override // defpackage.sy5, defpackage.e52
        public void g(Throwable th) {
            C(th);
        }

        public final void w() {
            boolean zG;
            synchronized (this) {
                this.j = false;
                zG = G();
            }
            if (zG) {
                I();
            }
        }

        public final void y(w14<u14> w14Var, int i) {
            b6i.b(w14.y(w14Var));
            if (!H(w14Var.n())) {
                D(w14Var, i);
                return;
            }
            this.c.a(this.d, "PostprocessorProducer");
            try {
                try {
                    w14<u14> w14VarF = F(w14Var.n());
                    hbi hbiVar = this.c;
                    String str = this.d;
                    hbiVar.g(str, "PostprocessorProducer", z(hbiVar, str, this.e));
                    D(w14VarF, i);
                    w14.l(w14VarF);
                } catch (Exception e) {
                    hbi hbiVar2 = this.c;
                    String str2 = this.d;
                    hbiVar2.c(str2, "PostprocessorProducer", e, z(hbiVar2, str2, this.e));
                    C(e);
                    w14.l(null);
                }
            } catch (Throwable th) {
                w14.l(null);
                throw th;
            }
        }

        public final Map<String, String> z(hbi hbiVar, String str, b5i b5iVar) {
            if (hbiVar.f(str)) {
                return ImmutableMap.of("Postprocessor", b5iVar.getName());
            }
            return null;
        }
    }

    public class c extends sy5<w14<u14>, w14<u14>> implements ykk {
        public boolean c;
        public w14<u14> d;

        public class a extends ea2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ c5i f4955a;

            public a(c5i c5iVar) {
                this.f4955a = c5iVar;
            }

            @Override // defpackage.fbi
            public void b() {
                if (c.this.q()) {
                    c.this.o().a();
                }
            }
        }

        @Override // defpackage.sy5, defpackage.e52
        public void f() {
            if (q()) {
                o().a();
            }
        }

        @Override // defpackage.sy5, defpackage.e52
        public void g(Throwable th) {
            if (q()) {
                o().onFailure(th);
            }
        }

        public final boolean q() {
            synchronized (this) {
                try {
                    if (this.c) {
                        return false;
                    }
                    w14<u14> w14Var = this.d;
                    this.d = null;
                    this.c = true;
                    w14.l(w14Var);
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // defpackage.e52
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public void h(w14<u14> w14Var, int i) {
            if (e52.e(i)) {
                return;
            }
            s(w14Var);
            t();
        }

        public final void s(w14<u14> w14Var) {
            synchronized (this) {
                try {
                    if (this.c) {
                        return;
                    }
                    w14<u14> w14Var2 = this.d;
                    this.d = w14.d(w14Var);
                    w14.l(w14Var2);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void t() {
            synchronized (this) {
                try {
                    if (this.c) {
                        return;
                    }
                    w14<u14> w14VarD = w14.d(this.d);
                    try {
                        o().b(w14VarD, 0);
                    } finally {
                        w14.l(w14VarD);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public c(b bVar, xkk xkkVar, ebi ebiVar) {
            super(bVar);
            this.c = false;
            this.d = null;
            xkkVar.c(this);
            ebiVar.c(new a(c5i.this));
        }
    }

    public class d extends sy5<w14<u14>, w14<u14>> {
        @Override // defpackage.e52
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void h(w14<u14> w14Var, int i) {
            if (e52.e(i)) {
                return;
            }
            o().b(w14Var, i);
        }

        public d(b bVar) {
            super(bVar);
        }
    }

    public c5i(dbi<w14<u14>> dbiVar, f0i f0iVar, Executor executor) {
        this.f4949a = (dbi) b6i.g(dbiVar);
        this.f4950b = f0iVar;
        this.c = (Executor) b6i.g(executor);
    }

    @Override // defpackage.dbi
    public void a(cg4<w14<u14>> cg4Var, ebi ebiVar) {
        hbi hbiVarF = ebiVar.f();
        b5i b5iVarG = ebiVar.b().g();
        b bVar = new b(cg4Var, hbiVarF, ebiVar.getId(), b5iVarG, ebiVar);
        this.f4949a.a(b5iVarG instanceof xkk ? new c(bVar, (xkk) b5iVarG, ebiVar) : new d(bVar), ebiVar);
    }
}

package defpackage;

import android.util.Log;
import com.bumptech.glide.load.DataSource;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class s4n implements kl5, kl5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final as5<?> f33290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kl5.a f33291b;
    public volatile int c;
    public volatile vk5 d;
    public volatile Object e;
    public volatile d7g.a<?> f;
    public volatile wk5 g;

    public class a implements jl5.a<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d7g.a f33292a;

        public a(d7g.a aVar) {
            this.f33292a = aVar;
        }

        @Override // jl5.a
        public void e(Object obj) {
            if (s4n.this.g(this.f33292a)) {
                s4n.this.h(this.f33292a, obj);
            }
        }

        @Override // jl5.a
        public void f(Exception exc) {
            if (s4n.this.g(this.f33292a)) {
                s4n.this.i(this.f33292a, exc);
            }
        }
    }

    public s4n(as5<?> as5Var, kl5.a aVar) {
        this.f33290a = as5Var;
        this.f33291b = aVar;
    }

    private boolean f() {
        return this.c < this.f33290a.g().size();
    }

    @Override // defpackage.kl5
    public boolean a() {
        if (this.e != null) {
            Object obj = this.e;
            this.e = null;
            try {
                if (!e(obj)) {
                    return true;
                }
            } catch (IOException unused) {
                Log.isLoggable("SourceGenerator", 3);
            }
        }
        if (this.d != null && this.d.a()) {
            return true;
        }
        this.d = null;
        this.f = null;
        boolean z = false;
        while (!z && f()) {
            List<d7g.a<?>> listG = this.f33290a.g();
            int i = this.c;
            this.c = i + 1;
            this.f = listG.get(i);
            if (this.f != null && (this.f33290a.e().c(this.f.c.d()) || this.f33290a.u(this.f.c.a()))) {
                j(this.f);
                z = true;
            }
        }
        return z;
    }

    @Override // kl5.a
    public void b(pzd pzdVar, Object obj, jl5<?> jl5Var, DataSource dataSource, pzd pzdVar2) {
        this.f33291b.b(pzdVar, obj, jl5Var, this.f.c.d(), pzdVar);
    }

    @Override // kl5.a
    public void c(pzd pzdVar, Exception exc, jl5<?> jl5Var, DataSource dataSource) {
        this.f33291b.c(pzdVar, exc, jl5Var, this.f.c.d());
    }

    @Override // defpackage.kl5
    public void cancel() {
        d7g.a<?> aVar = this.f;
        if (aVar != null) {
            aVar.c.cancel();
        }
    }

    @Override // kl5.a
    public void d() {
        throw new UnsupportedOperationException();
    }

    public final boolean e(Object obj) throws Throwable {
        long jB = epe.b();
        boolean z = false;
        try {
            com.bumptech.glide.load.data.a<T> aVarO = this.f33290a.o(obj);
            Object objA = aVarO.a();
            x98<X> x98VarQ = this.f33290a.q(objA);
            xk5 xk5Var = new xk5(x98VarQ, objA, this.f33290a.k());
            wk5 wk5Var = new wk5(this.f.f15175a, this.f33290a.p());
            fy6 fy6VarD = this.f33290a.d();
            fy6VarD.b(wk5Var, xk5Var);
            if (Log.isLoggable("SourceGenerator", 2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Finished encoding source to cache, key: ");
                sb.append(wk5Var);
                sb.append(", data: ");
                sb.append(obj);
                sb.append(", encoder: ");
                sb.append(x98VarQ);
                sb.append(", duration: ");
                sb.append(epe.a(jB));
            }
            if (fy6VarD.a(wk5Var) != null) {
                this.g = wk5Var;
                this.d = new vk5(Collections.singletonList(this.f.f15175a), this.f33290a, this);
                this.f.c.b();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Attempt to write: ");
                sb2.append(this.g);
                sb2.append(", data: ");
                sb2.append(obj);
                sb2.append(" to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly...");
            }
            try {
                this.f33291b.b(this.f.f15175a, aVarO.a(), this.f.c, this.f.c.d(), this.f.f15175a);
                return false;
            } catch (Throwable th) {
                th = th;
                z = true;
                if (!z) {
                    this.f.c.b();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public boolean g(d7g.a<?> aVar) {
        d7g.a<?> aVar2 = this.f;
        return aVar2 != null && aVar2 == aVar;
    }

    public void h(d7g.a<?> aVar, Object obj) {
        jy6 jy6VarE = this.f33290a.e();
        if (obj != null && jy6VarE.c(aVar.c.d())) {
            this.e = obj;
            this.f33291b.d();
        } else {
            kl5.a aVar2 = this.f33291b;
            pzd pzdVar = aVar.f15175a;
            jl5<?> jl5Var = aVar.c;
            aVar2.b(pzdVar, obj, jl5Var, jl5Var.d(), this.g);
        }
    }

    public void i(d7g.a<?> aVar, Exception exc) {
        kl5.a aVar2 = this.f33291b;
        wk5 wk5Var = this.g;
        jl5<?> jl5Var = aVar.c;
        aVar2.c(wk5Var, exc, jl5Var, jl5Var.d());
    }

    public final void j(d7g.a<?> aVar) {
        this.f.c.c(this.f33290a.l(), new a(aVar));
    }
}

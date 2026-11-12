package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class jo9<T> implements tpo<cp5<T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<tpo<cp5<T>>> f22970a;

    public class b extends j00<T> {
        public int g = 0;
        public cp5<T> h = null;
        public cp5<T> i = null;

        public class a implements mp5<T> {
            public a() {
            }

            @Override // defpackage.mp5
            public void onCancellation(cp5<T> cp5Var) {
            }

            @Override // defpackage.mp5
            public void onFailure(cp5<T> cp5Var) {
                b.this.y(cp5Var);
            }

            @Override // defpackage.mp5
            public void onNewResult(cp5<T> cp5Var) {
                if (cp5Var.hasResult()) {
                    b.this.z(cp5Var);
                } else if (cp5Var.a()) {
                    b.this.y(cp5Var);
                }
            }

            @Override // defpackage.mp5
            public void onProgressUpdate(cp5<T> cp5Var) {
                b.this.m(Math.max(b.this.getProgress(), cp5Var.getProgress()));
            }
        }

        public b() {
            if (B()) {
                return;
            }
            k(new RuntimeException("No data source supplier or supplier returned null."));
        }

        public final synchronized boolean A(cp5<T> cp5Var) {
            if (g()) {
                return false;
            }
            this.h = cp5Var;
            return true;
        }

        public final boolean B() {
            tpo<cp5<T>> tpoVarW = w();
            cp5<T> cp5Var = tpoVarW != null ? tpoVarW.get() : null;
            if (!A(cp5Var) || cp5Var == null) {
                u(cp5Var);
                return false;
            }
            cp5Var.c(new a(), fb3.a());
            return true;
        }

        @Override // defpackage.j00, defpackage.cp5
        public boolean close() {
            synchronized (this) {
                try {
                    if (!super.close()) {
                        return false;
                    }
                    cp5<T> cp5Var = this.h;
                    this.h = null;
                    cp5<T> cp5Var2 = this.i;
                    this.i = null;
                    u(cp5Var2);
                    u(cp5Var);
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // defpackage.j00, defpackage.cp5
        public synchronized T getResult() {
            cp5<T> cp5VarV;
            cp5VarV = v();
            return cp5VarV != null ? cp5VarV.getResult() : null;
        }

        @Override // defpackage.j00, defpackage.cp5
        public synchronized boolean hasResult() {
            cp5<T> cp5VarV;
            cp5VarV = v();
            return cp5VarV != null && cp5VarV.hasResult();
        }

        public final synchronized boolean t(cp5<T> cp5Var) {
            if (!g() && cp5Var == this.h) {
                this.h = null;
                return true;
            }
            return false;
        }

        public final void u(cp5<T> cp5Var) {
            if (cp5Var != null) {
                cp5Var.close();
            }
        }

        public final synchronized cp5<T> v() {
            return this.i;
        }

        public final synchronized tpo<cp5<T>> w() {
            if (g() || this.g >= jo9.this.f22970a.size()) {
                return null;
            }
            List list = jo9.this.f22970a;
            int i = this.g;
            this.g = i + 1;
            return (tpo) list.get(i);
        }

        public final void x(cp5<T> cp5Var, boolean z) {
            cp5<T> cp5Var2;
            synchronized (this) {
                if (cp5Var == this.h && cp5Var != (cp5Var2 = this.i)) {
                    if (cp5Var2 == null || z) {
                        this.i = cp5Var;
                    } else {
                        cp5Var2 = null;
                    }
                    u(cp5Var2);
                }
            }
        }

        public final void y(cp5<T> cp5Var) {
            if (t(cp5Var)) {
                if (cp5Var != v()) {
                    u(cp5Var);
                }
                if (B()) {
                    return;
                }
                k(cp5Var.b());
            }
        }

        public final void z(cp5<T> cp5Var) {
            x(cp5Var, cp5Var.a());
            if (cp5Var == v()) {
                o(null, cp5Var.a());
            }
        }
    }

    public jo9(List<tpo<cp5<T>>> list) {
        b6i.c(!list.isEmpty(), "List of suppliers is empty!");
        this.f22970a = list;
    }

    public static <T> jo9<T> b(List<tpo<cp5<T>>> list) {
        return new jo9<>(list);
    }

    @Override // defpackage.tpo
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public cp5<T> get() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jo9) {
            return i4h.a(this.f22970a, ((jo9) obj).f22970a);
        }
        return false;
    }

    public int hashCode() {
        return this.f22970a.hashCode();
    }

    public String toString() {
        return i4h.d(this).b("list", this.f22970a).toString();
    }
}

package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes5.dex */
public abstract class xz9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public jgj f39611a;

    public xz9(jgj jgjVar) {
        this.f39611a = jgjVar;
    }

    public final int e() {
        return this.f39611a.e();
    }

    public jgj f() {
        return this.f39611a;
    }

    public int g(OutputStream outputStream) throws IOException {
        return this.f39611a.k(outputStream);
    }

    public String toString() {
        return this.f39611a.toString();
    }

    public static abstract class a<T extends xz9> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public apr f39612a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public jgj f39613b;
        public boolean c;
        public boolean d;
        public boolean e;

        public a(apr aprVar) {
            this.f39612a = aprVar;
        }

        public T a() {
            T t;
            apr aprVarC;
            jgj jgjVarG = g();
            if (this.c) {
                if (!r()) {
                    return null;
                }
                aprVarC = apr.C(q());
                s(aprVarC);
            }
            if (jgjVarG != null) {
                jgjVarG = aprVarC;
                t = (T) o(jgjVarG);
                k(t);
            } else {
                jgjVarG = aprVarC;
                t = null;
            }
            this.f39613b = null;
            this.f39612a = null;
            return t;
        }

        public boolean b() {
            return f() || j();
        }

        public boolean c() {
            return this.d;
        }

        public boolean d() {
            return this.c;
        }

        public apr e() {
            if (this.c) {
                if (!r()) {
                    throw new RuntimeException("Table not ready to build.");
                }
                apr aprVarC = apr.C(q());
                s(aprVarC);
                return aprVarC;
            }
            jgj jgjVarG = g();
            apr aprVarC2 = apr.C(jgjVarG != null ? jgjVarG.e() : 0);
            if (jgjVarG != null) {
                jgjVarG.j(aprVarC2);
            }
            return aprVarC2;
        }

        public boolean f() {
            return this.e;
        }

        public jgj g() {
            jgj jgjVar = this.f39613b;
            return jgjVar != null ? jgjVar : this.f39612a;
        }

        public final void h(apr aprVar, boolean z) {
            this.f39612a = aprVar;
            this.f39613b = null;
            if (z) {
                this.e = true;
                p();
            }
        }

        public apr i() {
            if (this.f39612a == null) {
                jgj jgjVar = this.f39613b;
                apr aprVarC = apr.C(jgjVar == null ? 0 : jgjVar.e());
                jgj jgjVar2 = this.f39613b;
                if (jgjVar2 != null) {
                    jgjVar2.j(aprVarC);
                }
                h(aprVarC, false);
            }
            return this.f39612a;
        }

        public boolean j() {
            return d() || c();
        }

        public void k(T t) {
        }

        public boolean l() {
            return true;
        }

        public boolean m() {
            return n(true);
        }

        public boolean n(boolean z) {
            boolean z2 = this.c;
            this.c = z;
            return z2;
        }

        public abstract T o(jgj jgjVar);

        public abstract void p();

        public abstract int q();

        public abstract boolean r();

        public abstract int s(apr aprVar);

        public a(jgj jgjVar) {
            this.f39613b = jgjVar;
        }
    }
}

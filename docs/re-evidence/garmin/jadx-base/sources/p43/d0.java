package p43;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c2 f135810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set<t23.d1> f135811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v0 f135812c;

    /* JADX WARN: Multi-variable type inference failed */
    public d0(c2 c2Var, Set<? extends t23.d1> set, v0 v0Var) {
        c2Var.getClass();
        this.f135810a = c2Var;
        this.f135811b = set;
        this.f135812c = v0Var;
    }

    public v0 a() {
        return this.f135812c;
    }

    public c2 b() {
        return this.f135810a;
    }

    public Set<t23.d1> c() {
        return this.f135811b;
    }

    public d0 d(t23.d1 d1Var) {
        c2 c2VarB = b();
        Set<t23.d1> setC = c();
        return new d0(c2VarB, setC != null ? p13.c1.i(setC, d1Var) : p13.a1.b(d1Var), a());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return p005kotlin.jvm.internal.s.g(d0Var.a(), a()) && d0Var.b() == b();
    }

    public int hashCode() {
        v0 v0VarA = a();
        int iHashCode = v0VarA != null ? v0VarA.hashCode() : 0;
        return b().hashCode() + (iHashCode * 31) + iHashCode;
    }
}

package p43;

import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes3.dex */
public final class m0 implements m1, t43.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0 f135885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashSet<n0> f135886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f135887c;

    public static final class a<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f135888a;

        public a(e23.l lVar) {
            this.f135888a = lVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            n0 n0Var = (n0) t7;
            n0Var.getClass();
            e23.l lVar = this.f135888a;
            String string = lVar.invoke(n0Var).toString();
            n0 n0Var2 = (n0) t14;
            n0Var2.getClass();
            return r13.a.b(string, lVar.invoke(n0Var2).toString());
        }
    }

    public m0(Collection<? extends n0> collection) {
        collection.getClass();
        collection.isEmpty();
        LinkedHashSet<n0> linkedHashSet = new LinkedHashSet<>(collection);
        this.f135886b = linkedHashSet;
        this.f135887c = linkedHashSet.hashCode();
    }

    @Override // p43.m1
    public final boolean C() {
        return false;
    }

    public final v0 a() {
        k1.f135863b.getClass();
        k1 k1Var = k1.f135864c;
        p13.j0 j0Var = p13.j0.f134944a;
        i43.y.f91078c.getClass();
        return q0.f(k1Var, this, j0Var, false, i43.y.a.a("member scope for intersection type", this.f135886b), new l0(this));
    }

    @Override // p43.m1
    public final Collection<n0> b() {
        return this.f135886b;
    }

    public final String d(e23.l<? super n0, ? extends Object> lVar) {
        lVar.getClass();
        return p13.h0.k0(p13.h0.N0(this.f135886b, new a(lVar)), " & ", "{", StringSubstitutor.DEFAULT_VAR_END, new j0(lVar), 24);
    }

    @Override // p43.m1
    public final p005kotlin.reflect.jvm.internal.impl.builtins.d e() {
        p005kotlin.reflect.jvm.internal.impl.builtins.d dVarE = this.f135886b.iterator().next().F0().e();
        dVarE.getClass();
        return dVarE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        return p005kotlin.jvm.internal.s.g(this.f135886b, ((m0) obj).f135886b);
    }

    public final m0 f(n0 n0Var) {
        return new m0(this.f135886b, n0Var);
    }

    @Override // p43.m1
    public final List<t23.d1> getParameters() {
        return p13.j0.f134944a;
    }

    public final int hashCode() {
        return this.f135887c;
    }

    @Override // p43.m1
    public final t23.h t() {
        return null;
    }

    public final String toString() {
        return d(k0.f135862a);
    }

    private m0(Collection<? extends n0> collection, n0 n0Var) {
        this(collection);
        this.f135885a = n0Var;
    }
}

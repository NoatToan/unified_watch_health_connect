package n23;

import ch.qos.logback.core.joran.action.Action;
import java.util.Collection;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\nB\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Ln23/q3;", "Ln23/i3;", "Ljava/lang/Class;", "jClass", "<init>", "(Ljava/lang/Class;)V", "Li43/l;", "getScope", "()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", Action.SCOPE_ATTRIBUTE, "a", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q3 extends i3 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f122577f = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Class<?> f122578d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f122579e;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ln23/q3$a;", "Ln23/i3$b;", "Ln23/i3;", "<init>", "(Ln23/q3;)V", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class a extends i3.b {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ k23.l<Object>[] f122580g;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c4.a f122581c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final c4.a f122582d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Object f122583e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final c4.a f122584f;

        /* JADX INFO: renamed from: n23.q3$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"n23/q3$a$a", "Ln23/c0;", "Lt23/k;", "descriptor", "", "data", "Ln23/p0;", "visitConstructorDescriptor", "(Lorg/jetbrains/kotlin/descriptors/ConstructorDescriptor;Lkotlin/Unit;)Ln23/p0;", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C2313a extends c0 {
            public C2313a(q3 q3Var) {
                super(q3Var);
            }

            @Override // w23.q, t23.n
            public final Object l(w23.k kVar, Object obj) {
                ((Unit) obj).getClass();
                throw new IllegalStateException("No constructors should appear here: " + kVar);
            }
        }

        static {
            p005kotlin.jvm.internal.i0 i0Var = new p005kotlin.jvm.internal.i0(a.class, "kotlinClass", "getKotlinClass()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;", 0);
            p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
            f122580g = new k23.l[]{t0Var.h(i0Var), j.l(a.class, Action.SCOPE_ATTRIBUTE, "getScope()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", 0, t0Var), j.l(a.class, "members", "getMembers()Ljava/util/Collection;", 0, t0Var)};
        }

        public a(q3 q3Var) {
            super(q3Var);
            this.f122581c = new c4.a(null, new m3(q3Var));
            this.f122582d = new c4.a(null, new n3(this));
            this.f122583e = o13.m.a(o13.n.PUBLICATION, new o3(this, q3Var));
            this.f122584f = new c4.a(null, new p3(this, q3Var));
        }
    }

    public q3(Class<?> cls) {
        cls.getClass();
        this.f122578d = cls;
        this.f122579e = o13.m.a(o13.n.PUBLICATION, new k3(this));
    }

    @Override // n23.i3
    public final Collection<t23.k> H() {
        return p13.j0.f134944a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    @Override // n23.i3
    public final Collection<t23.v> I(x33.f fVar) {
        c4.a aVar = ((a) this.f122579e.getValue()).f122582d;
        k23.l<Object> lVar = a.f122580g[1];
        Object objInvoke = aVar.invoke();
        objInvoke.getClass();
        return ((i43.l) objInvoke).c(fVar, b33.b.FROM_REFLECTION);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    @Override // n23.i3
    public final t23.r0 J(int i14) {
        c4.a aVar = ((a) this.f122579e.getValue()).f122582d;
        k23.l<Object> lVar = a.f122580g[1];
        Object objInvoke = aVar.invoke();
        objInvoke.getClass();
        i43.l lVar2 = (i43.l) objInvoke;
        n43.f0 f0Var = lVar2 instanceof n43.f0 ? (n43.f0) lVar2 : null;
        if (f0Var != null) {
            l43.p pVar = f0Var.f123696b;
            s33.m mVar = f0Var.f123629h;
            z33.g.f<s33.m, List<s33.o>> fVar = v33.a.f175433l;
            fVar.getClass();
            s33.o oVar = (s33.o) u33.f.b(mVar, fVar, i14);
            if (oVar != null) {
                u33.d dVar = pVar.f110086b;
                s33.v vVar = mVar.f156742g;
                vVar.getClass();
                return (t23.r0) s4.e(this.f122578d, oVar, dVar, new u33.h(vVar), pVar.f110090f, l3.f122527a);
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, o13.l] */
    @Override // n23.i3
    public final Class<?> K() {
        Class<?> cls = (Class) ((a) this.f122579e.getValue()).f122583e.getValue();
        return cls == null ? this.f122578d : cls;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    @Override // n23.i3
    public final Collection<t23.r0> L(x33.f fVar) {
        c4.a aVar = ((a) this.f122579e.getValue()).f122582d;
        k23.l<Object> lVar = a.f122580g[1];
        Object objInvoke = aVar.invoke();
        objInvoke.getClass();
        return ((i43.l) objInvoke).a(fVar, b33.b.FROM_REFLECTION);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q3) {
            return p005kotlin.jvm.internal.s.g(this.f122578d, ((q3) obj).f122578d);
        }
        return false;
    }

    public final int hashCode() {
        return this.f122578d.hashCode();
    }

    @Override // p005kotlin.jvm.internal.g
    public final Class<?> j() {
        return this.f122578d;
    }

    public final String toString() {
        return "file class " + z23.f.a(this.f122578d).a();
    }
}

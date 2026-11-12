package m33;

import ch.qos.logback.core.CoreConstants;
import ds.e0;
import java.util.ArrayList;
import java.util.List;
import o13.p;
import o72.t;
import p13.w;
import p13.y;
import p43.c2;
import p43.g2;
import p43.k1;
import p43.m1;
import p43.n0;
import p43.q0;
import p43.s1;
import p43.t1;
import p43.v0;
import p43.v1;
import p43.w1;
import r43.k;
import r43.l;
import t23.d1;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends w1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m33.a f116444d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m33.a f116445e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f116446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s1 f116447c;

    static {
        new a(null);
        c2 c2Var = c2.COMMON;
        f116444d = gg.b.P(c2Var, false, null, 5).f(b.FLEXIBLE_LOWER_BOUND);
        f116445e = gg.b.P(c2Var, false, null, 5).f(b.FLEXIBLE_UPPER_BOUND);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(s1 s1Var) {
        f fVar = new f();
        this.f116446b = fVar;
        if (s1Var == null) {
            s1Var = new s1(fVar, null, 2, 0 == true ? 1 : 0);
        }
        this.f116447c = s1Var;
    }

    @Override // p43.w1
    public final t1 d(n0 n0Var) {
        return new v1(h(n0Var, new m33.a(c2.COMMON, null, false, false, null, null, 62, null)));
    }

    public final p<v0, Boolean> g(v0 v0Var, t23.e eVar, m33.a aVar) {
        if (v0Var.F0().getParameters().isEmpty()) {
            return new p<>(v0Var, Boolean.FALSE);
        }
        if (p005kotlin.reflect.jvm.internal.impl.builtins.d.z(v0Var)) {
            t1 t1Var = v0Var.D0().get(0);
            g2 g2VarA = t1Var.a();
            n0 type = t1Var.getType();
            type.getClass();
            return new p<>(q0.e(v0Var.E0(), v0Var.F0(), w.c(new v1(g2VarA, h(type, aVar))), v0Var.G0(), null), Boolean.FALSE);
        }
        if (t.R(v0Var)) {
            return new p<>(l.c(k.f150375n, v0Var.F0().toString()), Boolean.FALSE);
        }
        i43.l lVarT = eVar.t(this);
        lVarT.getClass();
        k1 k1VarE0 = v0Var.E0();
        m1 m1VarH = eVar.h();
        m1VarH.getClass();
        List<d1> parameters = eVar.h().getParameters();
        parameters.getClass();
        ArrayList arrayList = new ArrayList(y.r(parameters, 10));
        for (d1 d1Var : parameters) {
            d1Var.getClass();
            s1 s1Var = this.f116447c;
            arrayList.add(this.f116446b.a(d1Var, aVar, s1Var, s1Var.b(d1Var, aVar)));
        }
        return new p<>(q0.f(k1VarE0, m1VarH, arrayList, v0Var.G0(), lVarT, new g(eVar, this, v0Var, aVar)), Boolean.TRUE);
    }

    public final n0 h(n0 n0Var, m33.a aVar) {
        t23.h hVarT = n0Var.F0().t();
        if (hVarT instanceof d1) {
            aVar.getClass();
            return h(this.f116447c.b((d1) hVarT, m33.a.e(aVar, null, true, null, null, 59)), aVar);
        }
        if (!(hVarT instanceof t23.e)) {
            e0.t(hVarT, "Unexpected declaration kind: ");
            return null;
        }
        t23.h hVarT2 = oi0.c.Y(n0Var).F0().t();
        if (hVarT2 instanceof t23.e) {
            p<v0, Boolean> pVarG = g(oi0.c.Q(n0Var), (t23.e) hVarT, f116444d);
            v0 v0Var = pVarG.f128594a;
            boolean zBooleanValue = pVarG.f128595b.booleanValue();
            p<v0, Boolean> pVarG2 = g(oi0.c.Y(n0Var), (t23.e) hVarT2, f116445e);
            v0 v0Var2 = pVarG2.f128594a;
            return (zBooleanValue || pVarG2.f128595b.booleanValue()) ? new j(v0Var, v0Var2) : q0.b(v0Var, v0Var2);
        }
        throw new IllegalStateException(("For some reason declaration for upper bound is not a class but \"" + hVarT2 + "\" while for lower it's \"" + hVarT + CoreConstants.DOUBLE_QUOTE_CHAR).toString());
    }

    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ h(s1 s1Var, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : s1Var);
    }
}

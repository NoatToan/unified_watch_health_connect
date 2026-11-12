package o72;

import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import f72.kb;
import f72.oe;
import f72.z9;
import i3.i7;
import i3.mh;
import p005kotlin.Unit;
import p3.b4;
import v62.o7;
import v62.s6;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class j0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f130442a;

    public /* synthetic */ j0(int i14) {
        this.f130442a = i14;
    }

    private final Object a(Object obj, Object obj2) {
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        t0 t0Var = t0.f130592a;
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            float f14 = 8;
            g6.f.a aVar2 = g6.f.f75994b;
            h4.r rVarY = c2.l.y(aVar, f14);
            c2.j.f22691a.getClass();
            c2.j.h hVar = c2.j.f22697g;
            h4.d.f81522a.getClass();
            c2.s2 s2VarA = c2.q2.a(hVar, h4.d.a.f81534l, mVar, 54);
            int iHashCode = Long.hashCode(mVar.getU());
            p3.i2 i2VarX = mVar.x();
            h4.r rVarC = h4.k.c(rVarY, mVar);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
            if (mVar.F() == null) {
                p3.p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar3);
            } else {
                mVar.c();
            }
            b4.c(h5.g.a.f81810g, s2VarA, mVar);
            b4.c(h5.g.a.f81809f, i2VarX, mVar);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, mVar);
            c2.u2 u2Var = c2.u2.f22900a;
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            s5.x0 x0Var = j92.f.f97935l;
            mh.c("Legend", c2.l.C(aVar, 0.0f, 0.0f, f14, 0.0f, 11), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, mVar), mVar, 54, 0, 131068);
            h2.a(mVar, 0);
            mh.c("Legend", c2.l.C(aVar, f14, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, mVar), mVar, 54, 0, 131068);
            mVar.y();
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object b(Object obj, Object obj2) {
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        v0 v0Var = v0.f130623a;
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            l72.p2 p2Var = l72.p2.f111205a;
            Object objQ = mVar.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new i0(14);
                mVar.K(objQ);
            }
            p2Var.g("", null, null, null, null, false, false, (e23.a) objQ, mVar, 100663302, 254);
            Object objQ2 = mVar.q();
            if (objQ2 == c2565a) {
                objQ2 = new i0(15);
                mVar.K(objQ2);
            }
            p2Var.g("", null, null, null, null, false, false, (e23.a) objQ2, mVar, 100663302, 254);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object c(Object obj, Object obj2) {
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        v0 v0Var = v0.f130623a;
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            l72.p2.f111205a.h("Label", "Meta", null, null, null, false, false, null, null, null, null, mVar, 54, 0, 2044);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object d(Object obj, Object obj2) {
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        v0 v0Var = v0.f130623a;
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            l72.f3.a("Resting Calories", null, "33", null, null, mVar, 390, 26);
            l72.f3.a("Est. Sweat Lost", null, "185 ml", null, null, mVar, 390, 26);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object e(Object obj, Object obj2) {
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        v0 v0Var = v0.f130623a;
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            l72.f3.a("Resting Calories", null, "33", null, null, mVar, 390, 26);
            l72.f3.a("Est. Sweat Lost", null, "185 ml", null, null, mVar, 390, 26);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object f(Object obj, Object obj2) {
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        v0 v0Var = v0.f130623a;
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            s62.a.f157643a.getClass();
            u4.d dVarA = v62.u.a(t62.b.f162798a);
            long jG = fb1.c.g(d92.b.f58623a, mVar);
            h4.r.a aVar = h4.r.S;
            float f14 = 24;
            g6.f.a aVar2 = g6.f.f75994b;
            i7.b(dVarA, null, c2.x2.u(c2.x2.h(aVar, f14), f14), jG, mVar, 432, 0);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object g(Object obj, Object obj2) {
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        v0 v0Var = v0.f130623a;
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            s62.a.f157643a.getClass();
            u4.d dVarA = v62.d3.a(t62.b.f162798a);
            long jB = ds.e0.b(d92.b.f58623a, mVar);
            h4.r.a aVar = h4.r.S;
            float f14 = 20;
            g6.f.a aVar2 = g6.f.f75994b;
            i7.b(dVarA, null, c2.x2.u(c2.x2.h(aVar, f14), f14), jB, mVar, 432, 0);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f130442a;
        p3.m.a aVar = p3.m.f135153a;
        int i15 = 2;
        int i16 = 1;
        boolean z14 = false;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                k0 k0Var = k0.f130453a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    h4.r.a aVar2 = h4.r.S;
                    o4.d0.f128823b.getClass();
                    g6.f.a aVar3 = g6.f.f75994b;
                    h4.r rVarQ = c2.x2.q(u1.n.e(aVar2, o4.d0.f128829h, k2.i.f102406a), 48);
                    h4.d.f81522a.getClass();
                    f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                    int iHashCode = Long.hashCode(mVar.getU());
                    p3.i2 i2VarX = mVar.x();
                    h4.r rVarC = h4.k.c(rVarQ, mVar);
                    h5.g.V.getClass();
                    h5.e0.a aVar4 = h5.g.a.f81805b;
                    if (mVar.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar4);
                    } else {
                        mVar.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD, mVar);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar);
                    i7.a(n5.c.a(2131231969, mVar, 0), null, c2.u.f22885a.c(aVar2, h4.d.a.f81528f), com.airbnb.lottie.animation.keyframe.a.a(d92.b.f58623a, mVar), mVar, 48, 0);
                    mVar.y();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                k0 k0Var2 = k0.f130453a;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    h4.r.a aVar5 = h4.r.S;
                    d92.b.f58623a.getClass();
                    g6.f.a aVar6 = g6.f.f75994b;
                    h4.r rVarQ2 = c2.x2.q(u1.n.e(aVar5, d92.b.a(mVar2).e().g(), k2.i.f102406a), 48);
                    h4.d.f81522a.getClass();
                    f5.z0 z0VarD2 = c2.q.d(h4.d.a.f81524b, false);
                    int iHashCode2 = Long.hashCode(mVar2.getU());
                    p3.i2 i2VarX2 = mVar2.x();
                    h4.r rVarC2 = h4.k.c(rVarQ2, mVar2);
                    h5.g.V.getClass();
                    h5.e0.a aVar7 = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar7);
                    } else {
                        mVar2.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD2, mVar2);
                    b4.c(h5.g.a.f81809f, i2VarX2, mVar2);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar2, iHashCode2, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, mVar2);
                    c2.u uVar = c2.u.f22885a;
                    s62.a.f157643a.getClass();
                    i7.b(s6.a(t62.b.f162798a), null, uVar.c(aVar5, h4.d.a.f81528f), lc.u0.f(mVar2), mVar2, 48, 0);
                    mVar2.y();
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                k0 k0Var3 = k0.f130453a;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    p3.x1 x1Var3 = p3.n.f135158a;
                    l72.f0.a aVar8 = l72.f0.a.f111000a;
                    Object objQ = mVar3.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = new i0(5);
                        mVar3.K(objQ);
                    }
                    aVar8.j("Cancel", null, false, (e23.a) objQ, mVar3, 3078, 6);
                    s62.a.f157643a.getClass();
                    u4.d dVarA = s6.a(t62.b.f162798a);
                    Object objQ2 = mVar3.q();
                    if (objQ2 == c2565a) {
                        objQ2 = new i0(6);
                        mVar3.K(objQ2);
                    }
                    aVar8.c(24624, 12, (e23.a) objQ2, null, "Add Item", mVar3, dVarA, false);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 3:
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                k0 k0Var4 = k0.f130453a;
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    p3.x1 x1Var4 = p3.n.f135158a;
                    h4.r.a aVar9 = h4.r.S;
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar4, 0);
                    int iHashCode3 = Long.hashCode(mVar4.getU());
                    p3.i2 i2VarX3 = mVar4.x();
                    h4.r rVarC3 = h4.k.c(aVar9, mVar4);
                    h5.g.V.getClass();
                    h5.e0.a aVar10 = h5.g.a.f81805b;
                    if (mVar4.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar4.z();
                    if (mVar4.getT()) {
                        mVar4.M(aVar10);
                    } else {
                        mVar4.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar4);
                    b4.c(h5.g.a.f81809f, i2VarX3, mVar4);
                    h5.g.a.b bVar3 = h5.g.a.f81813j;
                    if (mVar4.getT() || !p005kotlin.jvm.internal.s.g(mVar4.q(), Integer.valueOf(iHashCode3))) {
                        v.h.z(iHashCode3, mVar4, iHashCode3, bVar3);
                    }
                    b4.c(h5.g.a.f81807d, rVarC3, mVar4);
                    c2.b0 b0Var = c2.b0.f22601a;
                    t1.b(mVar4, 0);
                    b82.n.c(null, null, "To view more activities, try adding some connections.", null, null, mVar4, 384, 27);
                    t1.b(mVar4, 0);
                    b82.n.c(null, "Nothing to see here", "To view more activities, try adding some connections.", null, null, mVar4, 432, 25);
                    t1.b(mVar4, 0);
                    s62.a.f157643a.getClass();
                    t62.c cVar = t62.c.f162799a;
                    u4.d dVarA2 = kb.a(cVar);
                    Object objQ3 = mVar4.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
                    if (objQ3 == c2565a2) {
                        objQ3 = new i0(9);
                        mVar4.K(objQ3);
                    }
                    b82.n.d(dVarA2, "Nothing to see here", "To view more activities, try adding some connections. Use the action button bellow to see more.", null, "Action 1", (e23.a) objQ3, null, null, mVar4, 221616, 200);
                    t1.b(mVar4, 0);
                    Object objQ4 = mVar4.q();
                    if (objQ4 == c2565a2) {
                        objQ4 = new i0(10);
                        mVar4.K(objQ4);
                    }
                    b82.n.d(null, "Nothing to see here", "To view more activities, try adding some connections.", null, "Action 1", (e23.a) objQ4, null, null, mVar4, 221616, 201);
                    t1.b(mVar4, 0);
                    Object objQ5 = mVar4.q();
                    if (objQ5 == c2565a2) {
                        objQ5 = new i0(11);
                        mVar4.K(objQ5);
                    }
                    e23.a aVar11 = (e23.a) objQ5;
                    Object objQ6 = mVar4.q();
                    if (objQ6 == c2565a2) {
                        objQ6 = new i0(z14 ? 1 : 0);
                        mVar4.K(objQ6);
                    }
                    b82.n.d(null, "Nothing to see here", "To view more activities, try adding some connections.", null, "Action 1", aVar11, "Action 2", (e23.a) objQ6, mVar4, 14377392, 9);
                    t1.b(mVar4, 0);
                    b82.n.c(oe.a(cVar), "Nothing to see here", "To view more activities, try adding some connections.", null, k0.f130454b, mVar4, 25008, 8);
                    t1.b(mVar4, 0);
                    u4.d dVarA3 = f72.k.a(cVar);
                    Object objQ7 = mVar4.q();
                    if (objQ7 == c2565a2) {
                        objQ7 = new i0(i16);
                        mVar4.K(objQ7);
                    }
                    e23.a aVar12 = (e23.a) objQ7;
                    Object objQ8 = mVar4.q();
                    if (objQ8 == c2565a2) {
                        objQ8 = new i0(i15);
                        mVar4.K(objQ8);
                    }
                    b82.n.d(dVarA3, "Nothing to see here", "To view more activities, try adding some connections.", null, "Action 1", aVar12, "Action 2", (e23.a) objQ8, mVar4, 14377392, 8);
                    t1.b(mVar4, 0);
                    z3.e eVar = k0.f130455c;
                    Object objQ9 = mVar4.q();
                    if (objQ9 == c2565a2) {
                        objQ9 = new i0(3);
                        mVar4.K(objQ9);
                    }
                    e23.a aVar13 = (e23.a) objQ9;
                    Object objQ10 = mVar4.q();
                    if (objQ10 == c2565a2) {
                        objQ10 = new i0(4);
                        mVar4.K(objQ10);
                    }
                    b82.n.b(eVar, "Nothing to see here", "Using a custom shield content", null, "Action 1", aVar13, "Action 2", (e23.a) objQ10, mVar4, 14377398, 8);
                    t1.b(mVar4, 0);
                    b82.n.a(k0.f130456d, "Using the new variant", "This example uses the new variant of EmptyState with custom action content.", null, k0.f130457e, mVar4, 25014, 8);
                    mVar4.y();
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 4:
                p3.m mVar5 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                l0 l0Var = l0.f130464a;
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    p3.x1 x1Var5 = p3.n.f135158a;
                    h4.r.a aVar14 = h4.r.S;
                    g6.f.a aVar15 = g6.f.f75994b;
                    h4.r rVarE = u1.n.e(c2.x2.h(c2.x2.f(aVar14, 1.0f), 80), fb1.c.z(d92.b.f58623a, mVar5), o4.m1.f128891a);
                    h4.d.f81522a.getClass();
                    f5.z0 z0VarD3 = c2.q.d(h4.d.a.f81524b, false);
                    int iHashCode4 = Long.hashCode(mVar5.getU());
                    p3.i2 i2VarX4 = mVar5.x();
                    h4.r rVarC4 = h4.k.c(rVarE, mVar5);
                    h5.g.V.getClass();
                    h5.e0.a aVar16 = h5.g.a.f81805b;
                    if (mVar5.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar5.z();
                    if (mVar5.getT()) {
                        mVar5.M(aVar16);
                    } else {
                        mVar5.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD3, mVar5);
                    b4.c(h5.g.a.f81809f, i2VarX4, mVar5);
                    h5.g.a.b bVar4 = h5.g.a.f81813j;
                    if (mVar5.getT() || !p005kotlin.jvm.internal.s.g(mVar5.q(), Integer.valueOf(iHashCode4))) {
                        v.h.z(iHashCode4, mVar5, iHashCode4, bVar4);
                    }
                    b4.c(h5.g.a.f81807d, rVarC4, mVar5);
                    c2.u uVar2 = c2.u.f22885a;
                    d92.b.f58624b.getClass();
                    mh.c("Any custom Composable", uVar2.c(aVar14, h4.d.a.f81528f), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97932i, mVar5), mVar5, 6, 0, 131068);
                    mVar5.y();
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 5:
                p3.m mVar6 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                l0 l0Var2 = l0.f130464a;
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    p3.x1 x1Var6 = p3.n.f135158a;
                    h4.r.a aVar17 = h4.r.S;
                    h4.r rVarF = c2.x2.f(aVar17, 1.0f);
                    float f14 = SyslogConstants.LOG_LOCAL4;
                    g6.f.a aVar18 = g6.f.f75994b;
                    h4.r rVarH = c2.x2.h(rVarF, f14);
                    d92.b.f58623a.getClass();
                    h4.r rVarE2 = u1.n.e(rVarH, d92.b.a(mVar6).c().g(), o4.m1.f128891a);
                    h4.d.f81522a.getClass();
                    f5.z0 z0VarD4 = c2.q.d(h4.d.a.f81524b, false);
                    int iHashCode5 = Long.hashCode(mVar6.getU());
                    p3.i2 i2VarX5 = mVar6.x();
                    h4.r rVarC5 = h4.k.c(rVarE2, mVar6);
                    h5.g.V.getClass();
                    h5.e0.a aVar19 = h5.g.a.f81805b;
                    if (mVar6.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar6.z();
                    if (mVar6.getT()) {
                        mVar6.M(aVar19);
                    } else {
                        mVar6.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD4, mVar6);
                    b4.c(h5.g.a.f81809f, i2VarX5, mVar6);
                    h5.g.a.b bVar5 = h5.g.a.f81813j;
                    if (mVar6.getT() || !p005kotlin.jvm.internal.s.g(mVar6.q(), Integer.valueOf(iHashCode5))) {
                        v.h.z(iHashCode5, mVar6, iHashCode5, bVar5);
                    }
                    b4.c(h5.g.a.f81807d, rVarC5, mVar6);
                    c2.u uVar3 = c2.u.f22885a;
                    d92.b.f58624b.getClass();
                    mh.c("Any custom Composable", uVar3.c(aVar17, h4.d.a.f81528f), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97932i, mVar6), mVar6, 6, 0, 131068);
                    mVar6.y();
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 6:
                p3.m mVar7 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                m0 m0Var = m0.f130473a;
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    p3.x1 x1Var7 = p3.n.f135158a;
                    s62.a.f157643a.getClass();
                    i7.b(o7.a(t62.b.f162798a), null, null, com.airbnb.lottie.animation.keyframe.a.a(d92.b.f58623a, mVar7), mVar7, 48, 4);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 7:
                p3.m mVar8 = (p3.m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                m0 m0Var2 = m0.f130473a;
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    p3.x1 x1Var8 = p3.n.f135158a;
                    b82.t0 t0Var = b82.t0.f16792a;
                    b82.t0.b bVar6 = b82.t0.b.WARNING;
                    g6.f.a aVar20 = g6.f.f75994b;
                    t0Var.a("Validation warning", c2.l.C(h4.r.S, 8, 0.0f, 0.0f, 0.0f, 14), bVar6, mVar8, 438, 0);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 8:
                p3.m mVar9 = (p3.m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                m0 m0Var3 = m0.f130473a;
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    p3.x1 x1Var9 = p3.n.f135158a;
                    b82.t0 t0Var2 = b82.t0.f16792a;
                    b82.t0.b bVar7 = b82.t0.b.SUCCESS;
                    g6.f.a aVar21 = g6.f.f75994b;
                    t0Var2.a("Success", c2.l.C(h4.r.S, 8, 0.0f, 0.0f, 0.0f, 14), bVar7, mVar9, 438, 0);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 9:
                p3.m mVar10 = (p3.m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                m0 m0Var4 = m0.f130473a;
                if (mVar10.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    p3.x1 x1Var10 = p3.n.f135158a;
                    b82.t0 t0Var3 = b82.t0.f16792a;
                    b82.t0.b bVar8 = b82.t0.b.ERROR;
                    g6.f.a aVar22 = g6.f.f75994b;
                    t0Var3.a("Validation error", c2.l.C(h4.r.S, 8, 0.0f, 0.0f, 0.0f, 14), bVar8, mVar10, 438, 0);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 10:
                p3.m mVar11 = (p3.m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                o0 o0Var = o0.f130507a;
                if (mVar11.n(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    p3.x1 x1Var11 = p3.n.f135158a;
                    h4.r.a aVar23 = h4.r.S;
                    g6.f.a aVar24 = g6.f.f75994b;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarQ3 = c2.x2.q(c2.l.C(aVar23, j92.b.f97899b.f97920e, 179, 0.0f, 0.0f, 12), j92.b.f97901d.f97907f);
                    long jC = d92.b.a(mVar11).c().c();
                    k2.h hVar = k2.i.f102406a;
                    h4.r rVarE3 = u1.n.e(u1.q.b(2, jC, rVarQ3, hVar), d92.b.a(mVar11).e().e(), hVar);
                    h4.d.f81522a.getClass();
                    h4.g gVar = h4.d.a.f81528f;
                    f5.z0 z0VarD5 = c2.q.d(gVar, false);
                    int iHashCode6 = Long.hashCode(mVar11.getU());
                    p3.i2 i2VarX6 = mVar11.x();
                    h4.r rVarC6 = h4.k.c(rVarE3, mVar11);
                    h5.g.V.getClass();
                    h5.e0.a aVar25 = h5.g.a.f81805b;
                    if (mVar11.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar11.z();
                    if (mVar11.getT()) {
                        mVar11.M(aVar25);
                    } else {
                        mVar11.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD5, mVar11);
                    b4.c(h5.g.a.f81809f, i2VarX6, mVar11);
                    h5.g.a.b bVar9 = h5.g.a.f81813j;
                    if (mVar11.getT() || !p005kotlin.jvm.internal.s.g(mVar11.q(), Integer.valueOf(iHashCode6))) {
                        v.h.z(iHashCode6, mVar11, iHashCode6, bVar9);
                    }
                    b4.c(h5.g.a.f81807d, rVarC6, mVar11);
                    c2.u uVar4 = c2.u.f22885a;
                    s62.a.f157643a.getClass();
                    i7.b(f72.a2.a(t62.c.f162799a), null, uVar4.c(c2.x2.q(aVar23, 32), gVar), d92.b.a(mVar11).f().f63508c, mVar11, 48, 0);
                    mVar11.y();
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 11:
                p3.m mVar12 = (p3.m) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                o0 o0Var2 = o0.f130507a;
                if (mVar12.n(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    p3.x1 x1Var12 = p3.n.f135158a;
                    h4.r.a aVar26 = h4.r.S;
                    h4.r rVarF2 = c2.x2.f(aVar26, 1.0f);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar2 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    c2.z zVarA2 = c2.y.a(kVar2, h4.d.a.f81536n, mVar12, 0);
                    int iHashCode7 = Long.hashCode(mVar12.getU());
                    p3.i2 i2VarX7 = mVar12.x();
                    h4.r rVarC7 = h4.k.c(rVarF2, mVar12);
                    h5.g.V.getClass();
                    h5.e0.a aVar27 = h5.g.a.f81805b;
                    if (mVar12.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar12.z();
                    if (mVar12.getT()) {
                        mVar12.M(aVar27);
                    } else {
                        mVar12.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA2, mVar12);
                    b4.c(h5.g.a.f81809f, i2VarX7, mVar12);
                    h5.g.a.b bVar10 = h5.g.a.f81813j;
                    if (mVar12.getT() || !p005kotlin.jvm.internal.s.g(mVar12.q(), Integer.valueOf(iHashCode7))) {
                        v.h.z(iHashCode7, mVar12, iHashCode7, bVar10);
                    }
                    b4.c(h5.g.a.f81807d, rVarC7, mVar12);
                    c2.b0 b0Var2 = c2.b0.f22601a;
                    l72.f0 f0Var = l72.f0.f110999a;
                    h4.r rVarF3 = c2.x2.f(aVar26, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarC8 = c2.l.C(rVarF3, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97918c, 7);
                    Object objQ11 = mVar12.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a3 = p3.m.a.f135155b;
                    if (objQ11 == c2565a3) {
                        objQ11 = new i0(12);
                        mVar12.K(objQ11);
                    }
                    f0Var.i("Edit", rVarC8, false, (e23.a) objQ11, mVar12, 3078, 4);
                    h4.r rVarF4 = c2.x2.f(aVar26, 1.0f);
                    Object objQ12 = mVar12.q();
                    if (objQ12 == c2565a3) {
                        objQ12 = new i0(13);
                        mVar12.K(objQ12);
                    }
                    f0Var.d(25008, 9, (e23.a) objQ12, rVarF4, "Add", mVar12, null, false);
                    mVar12.y();
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 12:
                p3.m mVar13 = (p3.m) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                p0 p0Var = p0.f130517a;
                if (mVar13.n(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    p3.x1 x1Var13 = p3.n.f135158a;
                    l72.f3.a("", null, "", null, null, mVar13, 390, 26);
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            case 13:
                p3.m mVar14 = (p3.m) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                p0 p0Var2 = p0.f130517a;
                if (mVar14.n(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    p3.x1 x1Var14 = p3.n.f135158a;
                    l72.f3.a("", null, "", null, null, mVar14, 390, 26);
                } else {
                    mVar14.e();
                }
                return Unit.INSTANCE;
            case 14:
                p3.m mVar15 = (p3.m) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                p0 p0Var3 = p0.f130517a;
                if (mVar15.n(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    p3.x1 x1Var15 = p3.n.f135158a;
                    l72.f3.a("", null, "", null, null, mVar15, 390, 26);
                } else {
                    mVar15.e();
                }
                return Unit.INSTANCE;
            case 15:
                p3.m mVar16 = (p3.m) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                s0 s0Var = s0.f130557a;
                if (mVar16.n(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    p3.x1 x1Var16 = p3.n.f135158a;
                    for (l72.d2 d2Var : l72.d2.f110971f) {
                        s62.a.f157643a.getClass();
                        u4.d dVarA4 = kb.a(t62.c.f162799a);
                        gl.c.f77766a.getClass();
                        l72.g2.b(dVarA4, null, gl.c.f77767b.f77805s, d2Var, null, "Icon indicator with style " + d2Var, mVar16, 0, 18);
                    }
                    p3.x1 x1Var17 = p3.n.f135158a;
                } else {
                    mVar16.e();
                }
                return Unit.INSTANCE;
            case 16:
                p3.m mVar17 = (p3.m) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                s0 s0Var2 = s0.f130557a;
                if (mVar17.n(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    p3.x1 x1Var18 = p3.n.f135158a;
                    for (l72.d2 d2Var2 : l72.d2.f110971f) {
                        gl.c.f77766a.getClass();
                        l72.g2.b(null, "8558", gl.c.f77767b.f77805s, d2Var2, null, "Icon indicator with style " + d2Var2, mVar17, 48, 17);
                    }
                    p3.x1 x1Var19 = p3.n.f135158a;
                } else {
                    mVar17.e();
                }
                return Unit.INSTANCE;
            case 17:
                p3.m mVar18 = (p3.m) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                s0 s0Var3 = s0.f130557a;
                if (mVar18.n(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    p3.x1 x1Var20 = p3.n.f135158a;
                    for (l72.d2 d2Var3 : l72.d2.f110971f) {
                        gl.c.f77766a.getClass();
                        l72.g2.b(null, "88", gl.c.f77767b.f77805s, d2Var3, null, "Icon indicator with style " + d2Var3, mVar18, 48, 17);
                    }
                    p3.x1 x1Var21 = p3.n.f135158a;
                } else {
                    mVar18.e();
                }
                return Unit.INSTANCE;
            case 18:
                p3.m mVar19 = (p3.m) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                s0 s0Var4 = s0.f130557a;
                if (mVar19.n(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    p3.x1 x1Var22 = p3.n.f135158a;
                    for (l72.d2 d2Var4 : l72.d2.f110971f) {
                        gl.c.f77766a.getClass();
                        l72.g2.b(null, "8", gl.c.f77767b.f77805s, d2Var4, null, "Icon indicator with style " + d2Var4, mVar19, 48, 17);
                    }
                    p3.x1 x1Var23 = p3.n.f135158a;
                } else {
                    mVar19.e();
                }
                return Unit.INSTANCE;
            case 19:
                p3.m mVar20 = (p3.m) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                s0 s0Var5 = s0.f130557a;
                if (mVar20.n(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    p3.x1 x1Var24 = p3.n.f135158a;
                    for (l72.d2 d2Var5 : l72.d2.f110971f) {
                        s62.a.f157643a.getClass();
                        u4.d dVarA5 = z9.a(t62.c.f162799a);
                        gl.c.f77766a.getClass();
                        l72.g2.b(dVarA5, "3", gl.c.f77767b.f77805s, d2Var5, null, "Icon indicator with style " + d2Var5, mVar20, 48, 16);
                    }
                    p3.x1 x1Var25 = p3.n.f135158a;
                } else {
                    mVar20.e();
                }
                return Unit.INSTANCE;
            case 20:
                return a(obj, obj2);
            case 21:
                p3.m mVar21 = (p3.m) obj;
                int iIntValue21 = ((Integer) obj2).intValue();
                t0 t0Var4 = t0.f130592a;
                if (mVar21.n(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    p3.x1 x1Var26 = p3.n.f135158a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA6 = f72.f.a(t62.c.f162799a);
                    d92.b.f58623a.getClass();
                    long jE = d92.b.a(mVar21).f().e();
                    g6.f.a aVar28 = g6.f.f75994b;
                    i7.b(dVarA6, null, c2.x2.q(h4.r.S, 16), jE, mVar21, 432, 0);
                } else {
                    mVar21.e();
                }
                return Unit.INSTANCE;
            case 22:
                p3.m mVar22 = (p3.m) obj;
                int iIntValue22 = ((Integer) obj2).intValue();
                t0 t0Var5 = t0.f130592a;
                if (mVar22.n(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    p3.x1 x1Var27 = p3.n.f135158a;
                    t4.d dVarA7 = n5.c.a(R.drawable.app_icon, mVar22, 0);
                    g6.f.a aVar29 = g6.f.f75994b;
                    u1.y0.a(dVarA7, null, c2.x2.q(h4.r.S, 16), null, null, 0.0f, null, mVar22, 432, 120);
                } else {
                    mVar22.e();
                }
                return Unit.INSTANCE;
            case 23:
                return b(obj, obj2);
            case 24:
                return c(obj, obj2);
            case 25:
                return d(obj, obj2);
            case 26:
                return e(obj, obj2);
            case 27:
                return f(obj, obj2);
            case 28:
                return g(obj, obj2);
            default:
                p3.m mVar23 = (p3.m) obj;
                int iIntValue23 = ((Integer) obj2).intValue();
                v0 v0Var = v0.f130623a;
                if (mVar23.n(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    p3.x1 x1Var28 = p3.n.f135158a;
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(FirebaseAnalytics.Param.CONTENT, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97931h, mVar23), mVar23, 6, 0, 131070);
                } else {
                    mVar23.e();
                }
                return Unit.INSTANCE;
        }
    }
}

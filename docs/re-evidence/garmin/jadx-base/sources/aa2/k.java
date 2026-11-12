package aa2;

import c2.a0;
import c2.b0;
import c2.c1;
import c2.h2;
import c2.t2;
import c2.x2;
import c2.y;
import c2.z;
import f5.z0;
import i3.ve;
import o4.m1;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.x1;
import r1.e0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class k implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z3.e f2343b;

    public /* synthetic */ k(z3.e eVar, int i14) {
        this.f2342a = i14;
        this.f2343b = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f2342a;
        z3.e eVar = this.f2343b;
        switch (i14) {
            case 0:
                h2 h2Var = (h2) obj;
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                h2Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar.B(h2Var) ? 4 : 2;
                }
                if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x1 x1Var = p3.n.f135158a;
                    ve.a(c2.l.j(c2.l.x(h4.r.S, h2Var), h2Var), null, tn.k.a(d92.b.f58623a, mVar), 0L, 0.0f, 0.0f, null, z3.f.c(1298339965, new o(eVar, null == true ? 1 : 0), mVar), mVar, 12582912, 122);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((c1) obj).getClass();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x1 x1Var2 = p3.n.f135158a;
                    eVar.invoke(an1.e.f4485a, mVar2, 6);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                Object obj4 = (e2.d) obj;
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= mVar3.B(obj4) ? 4 : 2;
                }
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    x1 x1Var3 = p3.n.f135158a;
                    eVar.invoke(obj4, 0, mVar3, Integer.valueOf(48 | (iIntValue3 & 14)));
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 3:
                p3.m mVar4 = (p3.m) obj2;
                ((Integer) obj3).getClass();
                ((e0) obj).getClass();
                x1 x1Var4 = p3.n.f135158a;
                h4.r.a aVar = h4.r.S;
                c2.j.f22691a.getClass();
                c2.j.k kVar = c2.j.f22694d;
                h4.d.f81522a.getClass();
                z zVarA = y.a(kVar, h4.d.a.f81536n, mVar4, 0);
                int iHashCode = Long.hashCode(mVar4.getU());
                i2 i2VarX = mVar4.x();
                h4.r rVarC = h4.k.c(aVar, mVar4);
                h5.g.V.getClass();
                h5.e0.a aVar2 = h5.g.a.f81805b;
                if (mVar4.F() == null) {
                    p0.l();
                    throw null;
                }
                mVar4.z();
                if (mVar4.getT()) {
                    mVar4.M(aVar2);
                } else {
                    mVar4.c();
                }
                b4.c(h5.g.a.f81810g, zVarA, mVar4);
                b4.c(h5.g.a.f81809f, i2VarX, mVar4);
                h5.g.a.b bVar = h5.g.a.f81813j;
                if (mVar4.getT() || !p005kotlin.jvm.internal.s.g(mVar4.q(), Integer.valueOf(iHashCode))) {
                    v.h.z(iHashCode, mVar4, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, mVar4);
                eVar.invoke(b0.f22601a, mVar4, 6);
                mVar4.y();
                return Unit.INSTANCE;
            case 4:
                Object obj5 = (t2) obj;
                p3.m mVar5 = (p3.m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                l72.w wVar = l72.w.f111301a;
                obj5.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= mVar5.B(obj5) ? 4 : 2;
                }
                if (mVar5.n(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    x1 x1Var5 = p3.n.f135158a;
                    eVar.invoke(obj5, mVar5, Integer.valueOf(iIntValue4 & 14));
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 5:
                Object obj6 = (e0) obj;
                int iIntValue5 = ((Integer) obj3).intValue();
                obj6.getClass();
                x1 x1Var6 = p3.n.f135158a;
                eVar.invoke(obj6, (p3.m) obj2, Integer.valueOf(iIntValue5 & 14));
                return Unit.INSTANCE;
            case 6:
                p3.m mVar6 = (p3.m) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((c2.t) obj).getClass();
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    x1 x1Var7 = p3.n.f135158a;
                    eVar.invoke(mVar6, 0);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 7:
                p3.m mVar7 = (p3.m) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((e2.d) obj).getClass();
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    x1 x1Var8 = p3.n.f135158a;
                    eVar.invoke(mVar7, 0);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 8:
                p3.m mVar8 = (p3.m) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                q80.b bVar2 = q80.b.f143300a;
                ((h2) obj).getClass();
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    x1 x1Var9 = p3.n.f135158a;
                    eVar.invoke(mVar8, 0);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 9:
                p3.m mVar9 = (p3.m) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((a0) obj).getClass();
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    x1 x1Var10 = p3.n.f135158a;
                    h4.r.a aVar3 = h4.r.S;
                    h4.r rVarD = c2.l.D(aVar3);
                    h4.d.f81522a.getClass();
                    z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                    int iHashCode2 = Long.hashCode(mVar9.getU());
                    i2 i2VarX2 = mVar9.x();
                    h4.r rVarC2 = h4.k.c(rVarD, mVar9);
                    h5.g.V.getClass();
                    h5.e0.a aVar4 = h5.g.a.f81805b;
                    if (mVar9.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar9.z();
                    if (mVar9.getT()) {
                        mVar9.M(aVar4);
                    } else {
                        mVar9.c();
                    }
                    h5.g.a.e eVar2 = h5.g.a.f81810g;
                    b4.c(eVar2, z0VarD, mVar9);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarX2, mVar9);
                    h5.g.a.b bVar3 = h5.g.a.f81813j;
                    if (mVar9.getT() || !p005kotlin.jvm.internal.s.g(mVar9.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar9, iHashCode2, bVar3);
                    }
                    h5.g.a.f fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC2, mVar9);
                    c2.u uVar = c2.u.f22885a;
                    long jA = p6.b.a(d92.b.f58623a, mVar9);
                    d92.b.f58625c.getClass();
                    float f14 = j92.b.f97899b.f97920e;
                    h4.r rVarE = u1.n.e(aVar3, jA, k2.i.c(f14, f14, 0.0f, 0.0f, 12));
                    h4.g.a aVar5 = h4.d.a.f81537o;
                    c2.j.f22691a.getClass();
                    z zVarA2 = y.a(c2.j.f22694d, aVar5, mVar9, 48);
                    int iHashCode3 = Long.hashCode(mVar9.getU());
                    i2 i2VarX3 = mVar9.x();
                    h4.r rVarC3 = h4.k.c(rVarE, mVar9);
                    if (mVar9.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar9.z();
                    if (mVar9.getT()) {
                        mVar9.M(aVar4);
                    } else {
                        mVar9.c();
                    }
                    b4.c(eVar2, zVarA2, mVar9);
                    b4.c(c1623g, i2VarX3, mVar9);
                    if (mVar9.getT() || !p005kotlin.jvm.internal.s.g(mVar9.q(), Integer.valueOf(iHashCode3))) {
                        v.h.z(iHashCode3, mVar9, iHashCode3, bVar3);
                    }
                    b4.c(fVar, rVarC3, mVar9);
                    eVar.invoke(b0.f22601a, mVar9, 6);
                    mVar9.y();
                    mVar9.y();
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 10:
                Object obj7 = (a0) obj;
                p3.m mVar10 = (p3.m) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                obj7.getClass();
                if ((iIntValue10 & 6) == 0) {
                    iIntValue10 |= mVar10.B(obj7) ? 4 : 2;
                }
                if (mVar10.n(iIntValue10 & 1, (iIntValue10 & 19) != 18)) {
                    x1 x1Var11 = p3.n.f135158a;
                    eVar.invoke(obj7, mVar10, Integer.valueOf(iIntValue10 & 14));
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 11:
                p3.m mVar11 = (p3.m) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((c2.t) obj).getClass();
                if (mVar11.n(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    x1 x1Var12 = p3.n.f135158a;
                    eVar.invoke(mVar11, 0);
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 12:
                Object obj8 = (c2.t) obj;
                p3.m mVar12 = (p3.m) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                obj8.getClass();
                if ((iIntValue12 & 6) == 0) {
                    iIntValue12 |= mVar12.B(obj8) ? 4 : 2;
                }
                if (mVar12.n(iIntValue12 & 1, (iIntValue12 & 19) != 18)) {
                    x1 x1Var13 = p3.n.f135158a;
                    eVar.invoke(obj8, mVar12, Integer.valueOf(iIntValue12 & 14));
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 13:
                Object obj9 = (c2.t) obj;
                p3.m mVar13 = (p3.m) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                obj9.getClass();
                if ((iIntValue13 & 6) == 0) {
                    iIntValue13 |= mVar13.B(obj9) ? 4 : 2;
                }
                if (mVar13.n(iIntValue13 & 1, (iIntValue13 & 19) != 18)) {
                    x1 x1Var14 = p3.n.f135158a;
                    eVar.invoke(obj9, mVar13, Integer.valueOf(iIntValue13 & 14));
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            case 14:
                p3.m mVar14 = (p3.m) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                ((c2.t) obj).getClass();
                if (mVar14.n(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    x1 x1Var15 = p3.n.f135158a;
                    eVar.invoke(mVar14, 0);
                } else {
                    mVar14.e();
                }
                return Unit.INSTANCE;
            case 15:
                Integer num = (Integer) obj;
                int iIntValue15 = num.intValue();
                p3.m mVar15 = (p3.m) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                if ((iIntValue16 & 6) == 0) {
                    iIntValue16 |= mVar15.k(iIntValue15) ? 4 : 2;
                }
                if (mVar15.n(iIntValue16 & 1, (iIntValue16 & 19) != 18)) {
                    x1 x1Var16 = p3.n.f135158a;
                    eVar.invoke(num, mVar15, Integer.valueOf(iIntValue16 & 14));
                } else {
                    mVar15.e();
                }
                return Unit.INSTANCE;
            case 16:
                p3.m mVar16 = (p3.m) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                ((a0) obj).getClass();
                if (mVar16.n(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                    x1 x1Var17 = p3.n.f135158a;
                    eVar.invoke(mVar16, 0);
                } else {
                    mVar16.e();
                }
                return Unit.INSTANCE;
            case 17:
                p3.m mVar17 = (p3.m) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                ((a0) obj).getClass();
                if (mVar17.n(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                    x1 x1Var18 = p3.n.f135158a;
                    h4.r rVarE2 = u1.n.e(h4.r.S, tn.k.a(d92.b.f58623a, mVar17), m1.f128891a);
                    d92.b.f58625c.getClass();
                    float f15 = j92.b.f97899b.f97918c;
                    h4.r rVarC4 = c2.l.C(rVarE2, f15, 0.0f, f15, f15, 2);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar2 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA3 = y.a(kVar2, h4.d.a.f81536n, mVar17, 0);
                    int iHashCode4 = Long.hashCode(mVar17.getU());
                    i2 i2VarX4 = mVar17.x();
                    h4.r rVarC5 = h4.k.c(rVarC4, mVar17);
                    h5.g.V.getClass();
                    h5.e0.a aVar6 = h5.g.a.f81805b;
                    if (mVar17.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar17.z();
                    if (mVar17.getT()) {
                        mVar17.M(aVar6);
                    } else {
                        mVar17.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA3, mVar17);
                    b4.c(h5.g.a.f81809f, i2VarX4, mVar17);
                    h5.g.a.b bVar4 = h5.g.a.f81813j;
                    if (mVar17.getT() || !p005kotlin.jvm.internal.s.g(mVar17.q(), Integer.valueOf(iHashCode4))) {
                        v.h.z(iHashCode4, mVar17, iHashCode4, bVar4);
                    }
                    b4.c(h5.g.a.f81807d, rVarC5, mVar17);
                    eVar.invoke(b0.f22601a, mVar17, 6);
                    mVar17.y();
                } else {
                    mVar17.e();
                }
                return Unit.INSTANCE;
            case 18:
                c2.w wVar2 = (c2.w) obj;
                p3.m mVar18 = (p3.m) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                wVar2.getClass();
                if ((iIntValue19 & 6) == 0) {
                    iIntValue19 |= mVar18.B(wVar2) ? 4 : 2;
                }
                if (mVar18.n(iIntValue19 & 1, (iIntValue19 & 19) != 18)) {
                    x1 x1Var19 = p3.n.f135158a;
                    float fMin = Math.min(wVar2.h(), wVar2.i());
                    g6.f.a aVar7 = g6.f.f75994b;
                    eVar.invoke(x2.q(h4.r.S, fMin), mVar18, 0);
                } else {
                    mVar18.e();
                }
                return Unit.INSTANCE;
            case 19:
                Object obj10 = (h4.r) obj;
                p3.m mVar19 = (p3.m) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                obj10.getClass();
                if ((iIntValue20 & 6) == 0) {
                    iIntValue20 |= mVar19.B(obj10) ? 4 : 2;
                }
                if (mVar19.n(iIntValue20 & 1, (iIntValue20 & 19) != 18)) {
                    x1 x1Var20 = p3.n.f135158a;
                    eVar.invoke(obj10, mVar19, Integer.valueOf(48 | (iIntValue20 & 14)));
                } else {
                    mVar19.e();
                }
                return Unit.INSTANCE;
            default:
                Object obj11 = (h4.r) obj;
                p3.m mVar20 = (p3.m) obj2;
                int iIntValue21 = ((Integer) obj3).intValue();
                obj11.getClass();
                if ((iIntValue21 & 6) == 0) {
                    iIntValue21 |= mVar20.B(obj11) ? 4 : 2;
                }
                if (mVar20.n(iIntValue21 & 1, (iIntValue21 & 19) != 18)) {
                    x1 x1Var21 = p3.n.f135158a;
                    eVar.invoke(obj11, mVar20, Integer.valueOf(48 | (iIntValue21 & 14)));
                } else {
                    mVar20.e();
                }
                return Unit.INSTANCE;
        }
    }
}

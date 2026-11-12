package b82;

import c2.x2;
import i3.fb;
import i3.mh;
import java.util.List;
import l72.n2;
import l72.p2;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class i implements e23.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16597a;

    public /* synthetic */ i(int i14) {
        this.f16597a = i14;
    }

    private final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        h4.r rVar = (h4.r) obj2;
        p3.m mVar = (p3.m) obj3;
        int iIntValue = ((Integer) obj4).intValue();
        t70.c cVar = t70.c.f162815a;
        ((c2.t) obj).getClass();
        rVar.getClass();
        if ((iIntValue & 48) == 0) {
            iIntValue |= mVar.B(rVar) ? 32 : 16;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 145) != 144)) {
            p3.x1 x1Var = p3.n.f135158a;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97917b;
            g6.f.a aVar = g6.f.f75994b;
            c2.l.f(x2.h(c2.l.y(u1.n.e(c2.l.C(rVar, 0.0f, f14, 0.0f, f14, 5), j20.x.b(mVar), k2.i.a(eVar.f97918c)), eVar.f97920e), 100), mVar);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:188:0x059f  */
    /* JADX WARN: Code duplicated, block: B:203:0x05f5  */
    /* JADX WARN: Code duplicated, block: B:218:0x064a  */
    /* JADX WARN: Code duplicated, block: B:233:0x069f  */
    /* JADX WARN: Code duplicated, block: B:266:0x0742  */
    /* JADX WARN: Code duplicated, block: B:281:0x0797  */
    /* JADX WARN: Code duplicated, block: B:323:0x08bf  */
    /* JADX WARN: Code duplicated, block: B:370:0x0b51  */
    /* JADX WARN: Code duplicated, block: B:385:0x0ba7  */
    /* JADX WARN: Code duplicated, block: B:64:0x01c9  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v30 */
    /* JADX WARN: Type inference failed for: r13v31 */
    /* JADX WARN: Type inference failed for: r13v32 */
    /* JADX WARN: Type inference failed for: r13v33 */
    /* JADX WARN: Type inference failed for: r13v34 */
    /* JADX WARN: Type inference failed for: r13v35 */
    /* JADX WARN: Type inference failed for: r13v36 */
    /* JADX WARN: Type inference failed for: r13v37 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r4v77 */
    /* JADX WARN: Type inference failed for: r4v78 */
    /* JADX WARN: Type inference failed for: r4v80 */
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
    @Override // e23.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i14 = this.f16597a;
        int i15 = 17;
        int i16 = 2;
        p3.m.a aVar = p3.m.f135153a;
        int i17 = 1;
         = 1;
        ?? r14 = 1;
         = 1;
        ?? r15 = 1;
         = 1;
        ?? r16 = 1;
         = 1;
        ?? r17 = 1;
         = 1;
        ?? r18 = 1;
         = 1;
        ?? r19 = 1;
         = 1;
        ?? r110 = 1;
        i17 = 1;
        switch (i14) {
            case 0:
                h4.r rVar = (h4.r) obj;
                String str = (String) obj2;
                p3.m mVar = (p3.m) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                j jVar = j.f16611a;
                rVar.getClass();
                str.getClass();
                mVar.C(-1984319695);
                p3.x1 x1Var = p3.n.f135158a;
                if ((((iIntValue & 112) ^ 48) <= 32 || !mVar.B(str)) && (iIntValue & 48) != 32) {
                    i17 = 0;
                }
                Object objQ = mVar.q();
                if (i17 == 0) {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new defpackage.b(str, i15);
                        mVar.K(objQ);
                    }
                } else {
                    objQ = new defpackage.b(str, i15);
                    mVar.K(objQ);
                }
                h4.r rVarC = p5.v.c((e23.l) objQ, rVar, false);
                mVar.f();
                return rVarC;
            case 1:
                h4.r rVar2 = (h4.r) obj;
                String str2 = (String) obj2;
                p3.m mVar2 = (p3.m) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                rVar2.getClass();
                str2.getClass();
                mVar2.C(126262826);
                p3.x1 x1Var2 = p3.n.f135158a;
                if ((((iIntValue2 & 112) ^ 48) <= 32 || !mVar2.B(str2)) && (iIntValue2 & 48) != 32) {
                    r110 = 0;
                }
                Object objQ2 = mVar2.q();
                if (r110 == 0) {
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new cq.t(str2, 5);
                        mVar2.K(objQ2);
                    }
                } else {
                    objQ2 = new cq.t(str2, 5);
                    mVar2.K(objQ2);
                }
                h4.r rVarB = p5.v.b(rVar2, (e23.l) objQ2);
                mVar2.f();
                return rVarB;
            case 2:
                u82.f fVar = (u82.f) obj2;
                ((Integer) obj4).getClass();
                dd1.a aVar2 = dd1.a.f59189a;
                ((c2.t) obj).getClass();
                fVar.getClass();
                p3.x1 x1Var3 = p3.n.f135158a;
                dd1.b.a((fd1.d) fVar.a(), (p3.m) obj3, 0);
                return Unit.INSTANCE;
            case 3:
                o13.p pVar = (o13.p) obj2;
                p3.m mVar3 = (p3.m) obj3;
                ((Integer) obj4).getClass();
                g02.l lVar = g02.l.f74461a;
                ((r1.l) obj).getClass();
                pVar.getClass();
                p3.x1 x1Var4 = p3.n.f135158a;
                h4.d.f81522a.getClass();
                h4.g.a aVar3 = h4.d.a.f81537o;
                c2.j.f22691a.getClass();
                c2.j.c cVar = c2.j.f22696f;
                h4.r.a aVar4 = h4.r.S;
                c2.z zVarA = c2.y.a(cVar, aVar3, mVar3, 54);
                int iHashCode = Long.hashCode(mVar3.getU());
                i2 i2VarX = mVar3.x();
                h4.r rVarC2 = h4.k.c(aVar4, mVar3);
                h5.g.V.getClass();
                h5.e0.a aVar5 = h5.g.a.f81805b;
                if (mVar3.F() == null) {
                    p3.p0.l();
                    throw null;
                }
                mVar3.z();
                if (mVar3.getT()) {
                    mVar3.M(aVar5);
                } else {
                    mVar3.c();
                }
                b4.c(h5.g.a.f81810g, zVarA, mVar3);
                b4.c(h5.g.a.f81809f, i2VarX, mVar3);
                h5.g.a.b bVar = h5.g.a.f81813j;
                if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode))) {
                    v.h.z(iHashCode, mVar3, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC2, mVar3);
                c2.b0 b0Var = c2.b0.f22601a;
                String str3 = (String) pVar.f128594a;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                j92.e eVar = j92.b.f97899b;
                h4.r rVarC3 = c2.l.C(aVar4, 0.0f, eVar.f97920e, 0.0f, 0.0f, 13);
                d92.b.f58624b.getClass();
                s5.x0 x0VarB = d92.c.b(j92.f.f97930g, mVar3);
                d6.h.f57752b.getClass();
                int i18 = d6.h.f57755e;
                mh.c(str3, rVarC3, 0L, null, 0L, null, 0L, d6.h.a(i18), 0L, 0, false, 0, 0, null, x0VarB, mVar3, 0, 0, 130044);
                mh.c((String) pVar.f128595b, c2.l.C(aVar4, 0.0f, eVar.f97918c, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, d6.h.a(i18), 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, mVar3), mVar3, 0, 0, 130044);
                mVar3.y();
                return Unit.INSTANCE;
            case 4:
                o13.p pVar2 = (o13.p) obj2;
                p3.m mVar4 = (p3.m) obj3;
                ((Integer) obj4).getClass();
                g02.m mVar5 = g02.m.f74478a;
                ((r1.l) obj).getClass();
                pVar2.getClass();
                p3.x1 x1Var5 = p3.n.f135158a;
                h4.d.f81522a.getClass();
                h4.g.a aVar6 = h4.d.a.f81537o;
                c2.j.f22691a.getClass();
                c2.j.c cVar2 = c2.j.f22696f;
                h4.r.a aVar7 = h4.r.S;
                c2.z zVarA2 = c2.y.a(cVar2, aVar6, mVar4, 54);
                int iHashCode2 = Long.hashCode(mVar4.getU());
                i2 i2VarX2 = mVar4.x();
                h4.r rVarC4 = h4.k.c(aVar7, mVar4);
                h5.g.V.getClass();
                h5.e0.a aVar8 = h5.g.a.f81805b;
                if (mVar4.F() == null) {
                    p3.p0.l();
                    throw null;
                }
                mVar4.z();
                if (mVar4.getT()) {
                    mVar4.M(aVar8);
                } else {
                    mVar4.c();
                }
                b4.c(h5.g.a.f81810g, zVarA2, mVar4);
                b4.c(h5.g.a.f81809f, i2VarX2, mVar4);
                h5.g.a.b bVar2 = h5.g.a.f81813j;
                if (mVar4.getT() || !p005kotlin.jvm.internal.s.g(mVar4.q(), Integer.valueOf(iHashCode2))) {
                    v.h.z(iHashCode2, mVar4, iHashCode2, bVar2);
                }
                b4.c(h5.g.a.f81807d, rVarC4, mVar4);
                c2.b0 b0Var2 = c2.b0.f22601a;
                String str4 = (String) pVar2.f128594a;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                j92.e eVar2 = j92.b.f97899b;
                h4.r rVarC5 = c2.l.C(aVar7, 0.0f, eVar2.f97920e, 0.0f, 0.0f, 13);
                d92.b.f58624b.getClass();
                s5.x0 x0VarB2 = d92.c.b(j92.f.f97930g, mVar4);
                d6.h.f57752b.getClass();
                int i19 = d6.h.f57755e;
                mh.c(str4, rVarC5, 0L, null, 0L, null, 0L, d6.h.a(i19), 0L, 0, false, 0, 0, null, x0VarB2, mVar4, 0, 0, 130044);
                mh.c((String) pVar2.f128595b, c2.l.C(aVar7, 0.0f, eVar2.f97918c, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, d6.h.a(i19), 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, mVar4), mVar4, 0, 0, 130044);
                mVar4.y();
                return Unit.INSTANCE;
            case 5:
                h4.r rVar3 = (h4.r) obj;
                String str5 = (String) obj2;
                p3.m mVar6 = (p3.m) obj3;
                int iIntValue3 = ((Integer) obj4).intValue();
                rVar3.getClass();
                str5.getClass();
                mVar6.C(-405459649);
                p3.x1 x1Var6 = p3.n.f135158a;
                if ((((iIntValue3 & 112) ^ 48) <= 32 || !mVar6.B(str5)) && (iIntValue3 & 48) != 32) {
                    r19 = 0;
                }
                Object objQ3 = mVar6.q();
                if (r19 == 0) {
                    aVar.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new fp0.c(str5, 20);
                        mVar6.K(objQ3);
                    }
                } else {
                    objQ3 = new fp0.c(str5, 20);
                    mVar6.K(objQ3);
                }
                h4.r rVarB2 = p5.v.b(rVar3, (e23.l) objQ3);
                mVar6.f();
                return rVarB2;
            case 6:
                h4.r rVar4 = (h4.r) obj;
                e23.a aVar9 = (e23.a) obj2;
                p3.m mVar7 = (p3.m) obj3;
                ((Integer) obj4).getClass();
                rVar4.getClass();
                aVar9.getClass();
                mVar7.C(-1258780883);
                p3.x1 x1Var7 = p3.n.f135158a;
                p5.l.f136032b.getClass();
                Object objQ4 = mVar7.q();
                aVar.getClass();
                if (objQ4 == p3.m.a.f135155b) {
                    objQ4 = tn.k.c(mVar7);
                }
                h4.r rVarB3 = u1.w.b(rVar4, (a2.j) objQ4, null, false, null, p5.l.a(0), aVar9, 12);
                mVar7.f();
                return rVarB3;
            case 7:
                u82.f fVar2 = (u82.f) obj2;
                p3.m mVar8 = (p3.m) obj3;
                int iIntValue4 = ((Integer) obj4).intValue();
                h60.a aVar10 = h60.a.f82151a;
                ((c2.t) obj).getClass();
                fVar2.getClass();
                if ((iIntValue4 & 48) == 0) {
                    iIntValue4 |= (iIntValue4 & 64) == 0 ? mVar8.B(fVar2) : mVar8.r(fVar2) ? 32 : 16;
                }
                if (mVar8.n(iIntValue4 & 1, (iIntValue4 & 145) != 144)) {
                    p3.x1 x1Var8 = p3.n.f135158a;
                    r60.a.a((g60.b) fVar2.a(), mVar8, g60.b.f76030f);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 8:
                i91.a aVar11 = i91.a.f92320a;
                ((String) obj).getClass();
                ((d91.f) obj2).getClass();
                ((List) obj3).getClass();
                return Unit.INSTANCE;
            case 9:
                i91.a aVar12 = i91.a.f92320a;
                ((String) obj).getClass();
                ((d91.f) obj2).getClass();
                return Unit.INSTANCE;
            case 10:
                h4.r rVar5 = (h4.r) obj;
                String str6 = (String) obj2;
                p3.m mVar9 = (p3.m) obj3;
                int iIntValue5 = ((Integer) obj4).intValue();
                rVar5.getClass();
                str6.getClass();
                mVar9.C(1114330794);
                p3.x1 x1Var9 = p3.n.f135158a;
                if ((((iIntValue5 & 112) ^ 48) <= 32 || !mVar9.B(str6)) && (iIntValue5 & 48) != 32) {
                    r18 = 0;
                }
                Object objQ5 = mVar9.q();
                if (r18 == 0) {
                    aVar.getClass();
                    if (objQ5 == p3.m.a.f135155b) {
                        objQ5 = new i11.g(str6, 25);
                        mVar9.K(objQ5);
                    }
                } else {
                    objQ5 = new i11.g(str6, 25);
                    mVar9.K(objQ5);
                }
                h4.r rVarC6 = p5.v.c((e23.l) objQ5, rVar5, false);
                mVar9.f();
                return rVarC6;
            case 11:
                h4.r rVar6 = (h4.r) obj;
                String str7 = (String) obj2;
                p3.m mVar10 = (p3.m) obj3;
                int iIntValue6 = ((Integer) obj4).intValue();
                rVar6.getClass();
                str7.getClass();
                mVar10.C(-1979070327);
                p3.x1 x1Var10 = p3.n.f135158a;
                ?? r111 = ((((iIntValue6 & 112) ^ 48) > 32 && mVar10.B(str7)) || (iIntValue6 & 48) == 32) ? 1 : 0;
                Object objQ6 = mVar10.q();
                if (r111 == 0) {
                    aVar.getClass();
                    if (objQ6 == p3.m.a.f135155b) {
                        objQ6 = new i11.g(str7, 29);
                        mVar10.K(objQ6);
                    }
                } else {
                    objQ6 = new i11.g(str7, 29);
                    mVar10.K(objQ6);
                }
                h4.r rVarC7 = p5.v.c((e23.l) objQ6, rVar6, true);
                mVar10.f();
                return rVarC7;
            case 12:
                u82.f fVar3 = (u82.f) obj2;
                p3.m mVar11 = (p3.m) obj3;
                int iIntValue7 = ((Integer) obj4).intValue();
                jf1.a aVar13 = jf1.a.f98696a;
                ((c2.t) obj).getClass();
                fVar3.getClass();
                if ((iIntValue7 & 48) == 0) {
                    iIntValue7 |= (iIntValue7 & 64) == 0 ? mVar11.B(fVar3) : mVar11.r(fVar3) ? 32 : 16;
                }
                if (mVar11.n(iIntValue7 & 1, (iIntValue7 & 145) != 144)) {
                    p3.x1 x1Var11 = p3.n.f135158a;
                    nf1.d.b(fVar3, mVar11, (iIntValue7 >> 3) & 14);
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 13:
                h4.r rVar7 = (h4.r) obj;
                String str8 = (String) obj2;
                p3.m mVar12 = (p3.m) obj3;
                int iIntValue8 = ((Integer) obj4).intValue();
                rVar7.getClass();
                str8.getClass();
                mVar12.C(-1626992321);
                p3.x1 x1Var12 = p3.n.f135158a;
                if ((((iIntValue8 & 112) ^ 48) <= 32 || !mVar12.B(str8)) && (iIntValue8 & 48) != 32) {
                    r17 = 0;
                }
                Object objQ7 = mVar12.q();
                if (r17 == 0) {
                    aVar.getClass();
                    if (objQ7 == p3.m.a.f135155b) {
                        objQ7 = new jl0.e(str8, 27);
                        mVar12.K(objQ7);
                    }
                } else {
                    objQ7 = new jl0.e(str8, 27);
                    mVar12.K(objQ7);
                }
                h4.r rVarC8 = p5.v.c((e23.l) objQ7, rVar7, false);
                mVar12.f();
                return rVarC8;
            case 14:
                h4.r rVar8 = (h4.r) obj;
                String str9 = (String) obj2;
                p3.m mVar13 = (p3.m) obj3;
                int iIntValue9 = ((Integer) obj4).intValue();
                p2 p2Var = p2.f111205a;
                rVar8.getClass();
                str9.getClass();
                mVar13.C(975793732);
                p3.x1 x1Var13 = p3.n.f135158a;
                if ((((iIntValue9 & 112) ^ 48) <= 32 || !mVar13.B(str9)) && (iIntValue9 & 48) != 32) {
                    r16 = 0;
                }
                Object objQ8 = mVar13.q();
                if (r16 == 0) {
                    aVar.getClass();
                    if (objQ8 == p3.m.a.f135155b) {
                        objQ8 = new jl0.e(str9, 28);
                        mVar13.K(objQ8);
                    }
                } else {
                    objQ8 = new jl0.e(str9, 28);
                    mVar13.K(objQ8);
                }
                h4.r rVarC9 = p5.v.c((e23.l) objQ8, rVar8, false);
                mVar13.f();
                return rVarC9;
            case 15:
                h4.r rVar9 = (h4.r) obj;
                String str10 = (String) obj2;
                p3.m mVar14 = (p3.m) obj3;
                int iIntValue10 = ((Integer) obj4).intValue();
                p2 p2Var2 = p2.f111205a;
                rVar9.getClass();
                str10.getClass();
                mVar14.C(413389607);
                p3.x1 x1Var14 = p3.n.f135158a;
                ?? r24 = (((iIntValue10 & 112) ^ 48) > 32 && mVar14.B(str10)) || (iIntValue10 & 48) == 32;
                Object objQ9 = mVar14.q();
                if (r24 == true) {
                    objQ9 = new n2(str10, i17);
                    mVar14.K(objQ9);
                } else {
                    aVar.getClass();
                    if (objQ9 == p3.m.a.f135155b) {
                        objQ9 = new n2(str10, i17);
                        mVar14.K(objQ9);
                    }
                }
                h4.r rVarC10 = p5.v.c((e23.l) objQ9, rVar9, false);
                mVar14.f();
                return rVarC10;
            case 16:
                h4.r rVar10 = (h4.r) obj;
                String str11 = (String) obj2;
                p3.m mVar15 = (p3.m) obj3;
                int iIntValue11 = ((Integer) obj4).intValue();
                p2 p2Var3 = p2.f111205a;
                rVar10.getClass();
                str11.getClass();
                mVar15.C(356021536);
                p3.x1 x1Var15 = p3.n.f135158a;
                if ((((iIntValue11 & 112) ^ 48) <= 32 || !mVar15.B(str11)) && (iIntValue11 & 48) != 32) {
                    r15 = 0;
                }
                Object objQ10 = mVar15.q();
                if (r15 == 0) {
                    aVar.getClass();
                    if (objQ10 == p3.m.a.f135155b) {
                        objQ10 = new n2(str11, i16);
                        mVar15.K(objQ10);
                    }
                } else {
                    objQ10 = new n2(str11, i16);
                    mVar15.K(objQ10);
                }
                h4.r rVarC11 = p5.v.c((e23.l) objQ10, rVar10, false);
                mVar15.f();
                return rVarC11;
            case 17:
                h4.r rVar11 = (h4.r) obj;
                e23.a aVar14 = (e23.a) obj2;
                p3.m mVar16 = (p3.m) obj3;
                ((Integer) obj4).getClass();
                rVar11.getClass();
                aVar14.getClass();
                mVar16.C(1860247921);
                p3.x1 x1Var16 = p3.n.f135158a;
                p5.l.f136032b.getClass();
                g6.f.a aVar15 = g6.f.f75994b;
                h4.r rVarB4 = u1.w.b(rVar11, null, fb.a(24 / 2, 4, 0L, false), false, null, p5.l.a(0), aVar14, 12);
                mVar16.f();
                return rVarB4;
            case 18:
                int iIntValue12 = ((Integer) obj2).intValue();
                p3.m mVar17 = (p3.m) obj3;
                int iIntValue13 = ((Integer) obj4).intValue();
                o72.x xVar = o72.x.f130662a;
                ((e2.d) obj).getClass();
                if ((iIntValue13 & 48) == 0) {
                    iIntValue13 |= mVar17.k(iIntValue12) ? 32 : 16;
                }
                if (mVar17.n(iIntValue13 & 1, (iIntValue13 & 145) != 144)) {
                    p3.x1 x1Var17 = p3.n.f135158a;
                    p2.f111205a.h("Item", String.valueOf(iIntValue12), null, null, null, false, false, o72.x.f130668g, null, null, null, mVar17, 12582918, 0, 1916);
                } else {
                    mVar17.e();
                }
                return Unit.INSTANCE;
            case 19:
                int iIntValue14 = ((Integer) obj2).intValue();
                p3.m mVar18 = (p3.m) obj3;
                int iIntValue15 = ((Integer) obj4).intValue();
                o72.x xVar2 = o72.x.f130662a;
                ((e2.d) obj).getClass();
                if ((iIntValue15 & 48) == 0) {
                    iIntValue15 |= mVar18.k(iIntValue14) ? 32 : 16;
                }
                if (mVar18.n(iIntValue15 & 1, (iIntValue15 & 145) != 144)) {
                    p3.x1 x1Var18 = p3.n.f135158a;
                    p2.f111205a.h("Item", String.valueOf(iIntValue14), null, null, null, false, false, o72.x.f130672k, null, null, null, mVar18, 12582918, 0, 1916);
                } else {
                    mVar18.e();
                }
                return Unit.INSTANCE;
            case 20:
                int iIntValue16 = ((Integer) obj2).intValue();
                p3.m mVar19 = (p3.m) obj3;
                int iIntValue17 = ((Integer) obj4).intValue();
                o72.x xVar3 = o72.x.f130662a;
                ((e2.d) obj).getClass();
                if ((iIntValue17 & 48) == 0) {
                    iIntValue17 |= mVar19.k(iIntValue16) ? 32 : 16;
                }
                if (mVar19.n(iIntValue17 & 1, (iIntValue17 & 145) != 144)) {
                    p3.x1 x1Var19 = p3.n.f135158a;
                    p2.f111205a.h("Item", String.valueOf(iIntValue16), null, null, null, false, false, o72.x.f130676o, null, null, null, mVar19, 12582918, 0, 1916);
                } else {
                    mVar19.e();
                }
                return Unit.INSTANCE;
            case 21:
                int iIntValue18 = ((Integer) obj2).intValue();
                p3.m mVar20 = (p3.m) obj3;
                int iIntValue19 = ((Integer) obj4).intValue();
                o72.x xVar4 = o72.x.f130662a;
                ((e2.d) obj).getClass();
                if ((iIntValue19 & 48) == 0) {
                    iIntValue19 |= mVar20.k(iIntValue18) ? 32 : 16;
                }
                if (mVar20.n(iIntValue19 & 1, (iIntValue19 & 145) != 144)) {
                    p3.x1 x1Var20 = p3.n.f135158a;
                    p2.f111205a.h("Item", String.valueOf(iIntValue18), null, null, null, false, false, o72.x.f130664c, null, null, null, mVar20, 12582918, 0, 1916);
                } else {
                    mVar20.e();
                }
                return Unit.INSTANCE;
            case 22:
                u82.f fVar4 = (u82.f) obj2;
                p3.m mVar21 = (p3.m) obj3;
                int iIntValue20 = ((Integer) obj4).intValue();
                o72.d1 d1Var = o72.d1.f130352a;
                ((c2.t) obj).getClass();
                fVar4.getClass();
                if ((iIntValue20 & 48) == 0) {
                    iIntValue20 |= (iIntValue20 & 64) == 0 ? mVar21.B(fVar4) : mVar21.r(fVar4) ? 32 : 16;
                }
                if (mVar21.n(iIntValue20 & 1, (iIntValue20 & 145) != 144)) {
                    p3.x1 x1Var21 = p3.n.f135158a;
                    if (fVar4 instanceof u82.f.b) {
                        mVar21.C(-2069450866);
                        mh.c("Loading data...", null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, mVar21, 6, 0, 262142);
                        mVar21.f();
                    } else if (fVar4 instanceof u82.f.c) {
                        mVar21.C(-2069329780);
                        h4.r rVarF = x2.f(h4.r.S, 1.0f);
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        h4.r rVarA = c2.l.A(rVarF, j92.b.f97899b.f97920e, 0.0f, 2);
                        c2.j.f22691a.getClass();
                        c2.j.k kVar = c2.j.f22694d;
                        h4.d.f81522a.getClass();
                        c2.z zVarA3 = c2.y.a(kVar, h4.d.a.f81536n, mVar21, 0);
                        int iHashCode3 = Long.hashCode(mVar21.getU());
                        i2 i2VarX3 = mVar21.x();
                        h4.r rVarC12 = h4.k.c(rVarA, mVar21);
                        h5.g.V.getClass();
                        h5.e0.a aVar16 = h5.g.a.f81805b;
                        if (mVar21.F() == null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar21.z();
                        if (mVar21.getT()) {
                            mVar21.M(aVar16);
                        } else {
                            mVar21.c();
                        }
                        b4.c(h5.g.a.f81810g, zVarA3, mVar21);
                        b4.c(h5.g.a.f81809f, i2VarX3, mVar21);
                        h5.g.a.b bVar3 = h5.g.a.f81813j;
                        if (mVar21.getT() || !p005kotlin.jvm.internal.s.g(mVar21.q(), Integer.valueOf(iHashCode3))) {
                            v.h.z(iHashCode3, mVar21, iHashCode3, bVar3);
                        }
                        b4.c(h5.g.a.f81807d, rVarC12, mVar21);
                        c2.b0 b0Var3 = c2.b0.f22601a;
                        mVar21.C(-772482012);
                        for (int i24 = 0; i24 < 50; i24++) {
                            mh.c(am.j.h(i24, "Item "), null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, mVar21, 0, 0, 262142);
                        }
                        mVar21.f();
                        mVar21.y();
                        mVar21.f();
                    } else {
                        if (!(fVar4 instanceof u82.f.a)) {
                            throw n23.j.m(mVar21, -482399834);
                        }
                        mVar21.C(-2068909110);
                        mh.c("Failed to load data", null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, mVar21, 6, 0, 262142);
                        mVar21.f();
                    }
                    p3.x1 x1Var22 = p3.n.f135158a;
                } else {
                    mVar21.e();
                }
                return Unit.INSTANCE;
            case 23:
                h4.r rVar12 = (h4.r) obj;
                e23.a aVar17 = (e23.a) obj2;
                p3.m mVar22 = (p3.m) obj3;
                int iIntValue21 = ((Integer) obj4).intValue();
                rVar12.getClass();
                aVar17.getClass();
                mVar22.C(-1926115419);
                p3.x1 x1Var23 = p3.n.f135158a;
                if ((((iIntValue21 & 112) ^ 48) <= 32 || !mVar22.B(aVar17)) && (iIntValue21 & 48) != 32) {
                    r14 = 0;
                }
                Object objQ11 = mVar22.q();
                if (r14 == 0) {
                    aVar.getClass();
                    if (objQ11 == p3.m.a.f135155b) {
                        objQ11 = new qk0.o(aVar17, 17);
                        mVar22.K(objQ11);
                    }
                } else {
                    objQ11 = new qk0.o(aVar17, 17);
                    mVar22.K(objQ11);
                }
                h4.r rVarD = u1.w.d(rVar12, false, null, null, (e23.a) objQ11, 15);
                mVar22.f();
                return rVarD;
            case 24:
                String str12 = (String) obj2;
                p3.m mVar23 = (p3.m) obj3;
                int iIntValue22 = ((Integer) obj4).intValue();
                rb0.a aVar18 = rb0.a.f151536a;
                ((r1.l) obj).getClass();
                str12.getClass();
                p3.x1 x1Var24 = p3.n.f135158a;
                h4.r rVarF2 = x2.f(h4.r.S, 1.0f);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                h4.r rVarA2 = c2.l.A(rVarF2, j92.b.f97899b.f97921f, 0.0f, 2);
                d92.b.f58624b.getClass();
                s5.x0 x0VarB3 = d92.c.b(j92.f.f97931h, mVar23);
                d6.h.f57752b.getClass();
                mh.c(str12, rVarA2, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB3, mVar23, (iIntValue22 >> 3) & 14, 0, 130044);
                return Unit.INSTANCE;
            case 25:
                h4.r rVar13 = (h4.r) obj;
                e23.l lVar2 = (e23.l) obj2;
                p3.m mVar24 = (p3.m) obj3;
                ((Integer) obj4).getClass();
                rVar13.getClass();
                lVar2.getClass();
                mVar24.C(1808342659);
                p3.x1 x1Var25 = p3.n.f135158a;
                h4.r rVarF3 = f5.g0.f(rVar13, lVar2);
                mVar24.f();
                return rVarF3;
            case 26:
                o82.g gVar = (o82.g) obj;
                p3.m mVar25 = (p3.m) obj3;
                int iIntValue23 = ((Integer) obj4).intValue();
                rx0.a aVar19 = rx0.a.f154943a;
                gVar.getClass();
                ((o82.a) obj2).getClass();
                if ((iIntValue23 & 6) == 0) {
                    iIntValue23 |= mVar25.k(gVar.ordinal()) ? 4 : 2;
                }
                if (mVar25.n(iIntValue23 & 1, (iIntValue23 & 131) != 130)) {
                    p3.x1 x1Var26 = p3.n.f135158a;
                } else {
                    mVar25.e();
                }
                return Unit.INSTANCE;
            case 27:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                e23.p pVar3 = (e23.p) obj2;
                p3.m mVar26 = (p3.m) obj3;
                int iIntValue24 = ((Integer) obj4).intValue();
                s80.a aVar20 = s80.a.f157870a;
                pVar3.getClass();
                int i25 = (iIntValue24 & 6) == 0 ? iIntValue24 | (mVar26.h(zBooleanValue) ? 4 : 2) : iIntValue24;
                if ((iIntValue24 & 48) == 0) {
                    i25 |= mVar26.r(pVar3) ? 32 : 16;
                }
                if (mVar26.n(i25 & 1, (i25 & 147) != 146)) {
                    p3.x1 x1Var27 = p3.n.f135158a;
                    g02.s0.a(null, zBooleanValue, pVar3, mVar26, (i25 << 3) & 1008, 1);
                } else {
                    mVar26.e();
                }
                return Unit.INSTANCE;
            case 28:
                return a(obj, obj2, obj3, obj4);
            default:
                h4.r rVar14 = (h4.r) obj;
                p3.m mVar27 = (p3.m) obj3;
                v.h.y(-434301484, rVar14, (Integer) obj4, mVar27);
                p3.x1 x1Var28 = p3.n.f135158a;
                h4.r rVarU = x2.u(rVar14, ((g6.f) obj2).f75997a);
                mVar27.f();
                return rVarU;
        }
    }
}

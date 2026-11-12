package as;

import am.l1;
import android.content.Context;
import b82.d2;
import b82.k1;
import c2.b0;
import c2.c1;
import c2.t2;
import c2.x2;
import c2.z;
import c22.w1;
import cf.a0;
import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import i3.fe;
import i3.mh;
import i3.uf;
import java.util.List;
import l72.p2;
import l72.v2;
import li0.p0;
import nr.e0;
import o4.d0;
import p005kotlin.Unit;
import p13.x;
import p3.b4;
import p3.i2;
import p3.p1;
import p3.x1;
import p5.v;
import s5.x0;
import w5.f0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class q implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f12671c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f12672d;

    public /* synthetic */ q(int i14, Object obj, Object obj2, int i15) {
        this.f12669a = i15;
        this.f12670b = i14;
        this.f12671c = obj;
        this.f12672d = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:125:0x033c  */
    /* JADX WARN: Code duplicated, block: B:213:0x05c0  */
    /* JADX WARN: Code duplicated, block: B:32:0x0100  */
    /* JADX WARN: Code duplicated, block: B:37:0x011d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0181  */
    /* JADX WARN: Code duplicated, block: B:87:0x022e  */
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
        String strH;
        int i14 = this.f12669a;
        int i15 = 15;
        int i16 = 10;
        int i17 = 2;
        p3.m.a aVar = p3.m.f135153a;
        int size = this.f12670b;
        Object obj4 = this.f12672d;
        Object obj5 = this.f12671c;
        switch (i14) {
            case 0:
                e0 e0Var = (e0) obj5;
                p1 p1Var = (p1) obj4;
                t2 t2Var = (t2) obj;
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                t2Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar.B(t2Var) ? 4 : 2;
                }
                if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x1 x1Var = p3.n.f135158a;
                    d2 d2Var = d2.f16532a;
                    h4.r.a aVar2 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar = j92.b.f97899b;
                    float f14 = eVar.f97920e;
                    float f15 = eVar.f97918c;
                    int i18 = iIntValue & 14;
                    d2Var.e(t2Var, t2Var.a(c2.l.B(aVar2, f14, f14, f15, f14), 1.8f, true), null, z3.f.c(-917194634, new l1(p1Var, i17, false ? (byte) 1 : (byte) 0), mVar), mVar, i18 | 3072, 2);
                    d2Var.f(t2Var, y.P(R.string.string_space_string_pattern, new Object[]{y.Q(mVar, R.string.golf_lbl_round), Integer.valueOf(size + 1)}, mVar), t2Var.a(k.e(aVar2), 3.0f, true), null, 0, 0, mVar, i18, 28);
                    d2Var.f(t2Var, e0Var.f127032a, t2Var.a(k.e(aVar2), 2.0f, true), null, 0, 0, mVar, i18, 28);
                    d2Var.f(t2Var, e0Var.f127033b, t2Var.a(k.e(aVar2), 2.0f, true), null, 0, 0, mVar, i18, 28);
                    d2Var.f(t2Var, "", t2Var.a(c2.l.B(aVar2, f15, f14, f14, f14), 2.2f, true), null, 0, 0, mVar, i18 | 48, 28);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                i53.f fVar = (i53.f) obj5;
                e23.l lVar = (e23.l) obj4;
                p3.m mVar2 = (p3.m) obj2;
                ((Integer) obj3).getClass();
                ((r1.e0) obj).getClass();
                x1 x1Var2 = p3.n.f135158a;
                h4.r rVarF = x2.f(h4.r.S, 1.0f);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                float f16 = j92.b.f97899b.f97920e;
                h4.r rVarC = c2.l.C(rVarF, f16, f16, f16, 0.0f, 8);
                boolean zB = mVar2.B(lVar);
                Object objQ = mVar2.q();
                if (zB) {
                    objQ = new ci0.f(lVar, 28);
                    mVar2.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new ci0.f(lVar, 28);
                        mVar2.K(objQ);
                    }
                }
                k1.a(fVar, this.f12670b, rVarC, null, 0.0f, (e23.l) objQ, mVar2, 3072, 16);
                return Unit.INSTANCE;
            case 2:
                e23.l lVar2 = (e23.l) obj5;
                z3.e eVar2 = (z3.e) obj4;
                Integer num = (Integer) obj;
                int iIntValue2 = num.intValue();
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= mVar3.k(iIntValue2) ? 4 : 2;
                }
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    x1 x1Var3 = p3.n.f135158a;
                    if (size != iIntValue2) {
                        lVar2.invoke(num);
                    }
                    eVar2.invoke(num, mVar3, Integer.valueOf(iIntValue3 & 14));
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 3:
                u4.d dVar = (u4.d) obj5;
                Integer num2 = (Integer) obj4;
                p3.m mVar4 = (p3.m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((c2.t) obj).getClass();
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    x1 x1Var4 = p3.n.f135158a;
                    p0.a(dVar, size, num2, mVar4, 0);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 4:
                n82.f fVar2 = (n82.f) obj5;
                e23.r rVar = (e23.r) obj4;
                int iIntValue5 = ((Integer) obj).intValue();
                p3.m mVar5 = (p3.m) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= mVar5.k(iIntValue5) ? 4 : 2;
                }
                if (mVar5.n(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    x1 x1Var5 = p3.n.f135158a;
                    int iC = fVar2.c();
                    n82.b bVar = fVar2.f124961b;
                    int i19 = size * 2;
                    i16 = i19 >= 10 ? i19 : 10;
                    int i24 = iC - i16;
                    if (iIntValue5 > iC + i16 || i24 > iIntValue5) {
                        mVar5.C(1795830590);
                        mVar5.f();
                    } else {
                        mVar5.C(1795725841);
                        o82.g gVarA = bVar.a();
                        n82.e eVar3 = bVar.f124952e;
                        rVar.invoke(gVarA, eVar3.f124959b.a(eVar3.f124958a, iIntValue5), mVar5, 0);
                        mVar5.f();
                    }
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 5:
                Context context = (Context) obj5;
                gs1.l lVar3 = (gs1.l) obj4;
                c2.t tVar = (c2.t) obj;
                p3.m mVar6 = (p3.m) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                tVar.getClass();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= mVar6.B(tVar) ? 4 : 2;
                }
                if (mVar6.n(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    x1 x1Var6 = p3.n.f135158a;
                    h4.r.a aVar3 = h4.r.S;
                    h4.r rVarD = x2.d(aVar3, 1.0f);
                    h4.d.f81522a.getClass();
                    h4.r rVarC2 = tVar.c(rVarD, h4.d.a.f81528f);
                    boolean zR = mVar6.r(context) | mVar6.r(lVar3);
                    Object objQ2 = mVar6.q();
                    if (zR) {
                        objQ2 = new o50.a(15, context, lVar3);
                        mVar6.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new o50.a(15, context, lVar3);
                            mVar6.K(objQ2);
                        }
                    }
                    h4.r rVarC3 = v.c((e23.l) objQ2, rVarC2, true);
                    c2.j.f22691a.getClass();
                    c2.j.c cVar = c2.j.f22696f;
                    h4.g.a aVar4 = h4.d.a.f81537o;
                    z zVarA = c2.y.a(cVar, aVar4, mVar6, 54);
                    int iHashCode = Long.hashCode(mVar6.getU());
                    i2 i2VarX = mVar6.x();
                    h4.r rVarC4 = h4.k.c(rVarC3, mVar6);
                    h5.g.V.getClass();
                    h5.e0.a aVar5 = h5.g.a.f81805b;
                    if (mVar6.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar6.z();
                    if (mVar6.getT()) {
                        mVar6.M(aVar5);
                    } else {
                        mVar6.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar6);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar6);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar6.getT() || !p005kotlin.jvm.internal.s.g(mVar6.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar6, iHashCode, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC4, mVar6);
                    b0 b0Var = b0.f22601a;
                    if (size > 0) {
                        mVar6.C(1659144610);
                        mVar6.f();
                        strH = String.valueOf(size);
                    } else {
                        strH = sn.a.h(mVar6, 1659145145, R.string.no_value, mVar6);
                    }
                    String str = strH;
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0VarB = d92.c.b(j92.f.f97928e, mVar6);
                    f0.f182097b.getClass();
                    f0 f0Var = f0.f182104i;
                    h4.r rVarB = b0Var.b(aVar3, aVar4);
                    Object objQ3 = mVar6.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ3 == c2565a) {
                        objQ3 = new ot1.t(17);
                        mVar6.K(objQ3);
                    }
                    mh.c(str, v.b(rVarB, (e23.l) objQ3), 0L, null, 0L, f0Var, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, mVar6, 1572864, 0, 131004);
                    x0 x0VarF = d92.c.f(j92.f.f97932i, mVar6);
                    h4.r rVarB2 = b0Var.b(aVar3, aVar4);
                    Object objQ4 = mVar6.q();
                    if (objQ4 == c2565a) {
                        objQ4 = new ot1.t(18);
                        mVar6.K(objQ4);
                    }
                    mh.c("100", v.b(rVarB2, (e23.l) objQ4), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, mVar6, 6, 0, 131068);
                    mVar6.y();
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 6:
                List list = (List) obj5;
                e23.l lVar4 = (e23.l) obj4;
                p3.m mVar7 = (p3.m) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((c2.t) obj).getClass();
                if (mVar7.n(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    x1 x1Var7 = p3.n.f135158a;
                    boolean zK = mVar7.k(size) | mVar7.r(list) | mVar7.B(lVar4);
                    Object objQ5 = mVar7.q();
                    if (zK) {
                        objQ5 = new ct2.e(list, size, lVar4, 7);
                        mVar7.K(objQ5);
                    } else {
                        aVar.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            objQ5 = new ct2.e(list, size, lVar4, 7);
                            mVar7.K(objQ5);
                        }
                    }
                    e2.c.b(null, null, null, null, null, null, false, null, (e23.l) objQ5, mVar7, 0, 511);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 7:
                i53.c cVar2 = (i53.c) obj5;
                e23.l lVar5 = (e23.l) obj4;
                p3.m mVar8 = (p3.m) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((c1) obj).getClass();
                if (mVar8.n(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    x1 x1Var8 = p3.n.f135158a;
                    if (size < 0) {
                        size = 0;
                    } else if (size >= cVar2.size()) {
                        size = cVar2.size() - 1;
                    }
                    int i25 = 0;
                    for (Object obj6 : cVar2) {
                        int i26 = i25 + 1;
                        if (i25 < 0) {
                            x.q();
                            throw null;
                        }
                        t82.a aVar6 = (t82.a) obj6;
                        boolean z14 = size == i25;
                        h4.r rVarB3 = v2.b(v2.a(h4.r.S, true, new t21.e(i15), mVar8, 6), null, new b82.i(29), mVar8, 0);
                        boolean z15 = size == i25;
                        d0.f128823b.getClass();
                        long j8 = d0.f128831j;
                        boolean zB2 = mVar8.B(lVar5) | mVar8.k(i25);
                        Object objQ6 = mVar8.q();
                        if (zB2) {
                            objQ6 = new au0.m(lVar5, i25, 16);
                            mVar8.K(objQ6);
                        } else {
                            aVar.getClass();
                            if (objQ6 == p3.m.a.f135155b) {
                                objQ6 = new au0.m(lVar5, i25, 16);
                                mVar8.K(objQ6);
                            }
                        }
                        uf.c(z15, (e23.a) objQ6, rVarB3, false, z3.f.c(-144629730, new ap2.f(z14, aVar6, 20), mVar8), j8, 0L, mVar8, 1597440, 424);
                        i25 = i26;
                        i15 = 15;
                    }
                    x1 x1Var9 = p3.n.f135158a;
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 8:
                String str2 = (String) obj5;
                e23.l lVar6 = (e23.l) obj4;
                p3.m mVar9 = (p3.m) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((e2.d) obj).getClass();
                if (mVar9.n(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    x1 x1Var10 = p3.n.f135158a;
                    p2 p2Var = p2.f111205a;
                    boolean zB3 = mVar9.B(lVar6) | mVar9.k(size);
                    Object objQ7 = mVar9.q();
                    if (zB3) {
                        objQ7 = new au0.m(lVar6, size, 17);
                        mVar9.K(objQ7);
                    } else {
                        aVar.getClass();
                        if (objQ7 == p3.m.a.f135155b) {
                            objQ7 = new au0.m(lVar6, size, 17);
                            mVar9.K(objQ7);
                        }
                    }
                    p2Var.g(str2, null, null, null, null, false, false, (e23.a) objQ7, mVar9, 0, 254);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            default:
                hl.a.b bVar3 = (hl.a.b) obj5;
                e23.a aVar7 = (e23.a) obj4;
                p3.m mVar10 = (p3.m) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((fe) obj).getClass();
                if (mVar10.n(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    x1 x1Var11 = p3.n.f135158a;
                    h4.r.a aVar8 = h4.r.S;
                    h4.r rVarD2 = x2.d(aVar8, 1.0f);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA2 = c2.y.a(kVar, h4.d.a.f81536n, mVar10, 0);
                    int iHashCode2 = Long.hashCode(mVar10.getU());
                    i2 i2VarX2 = mVar10.x();
                    h4.r rVarC5 = h4.k.c(rVarD2, mVar10);
                    h5.g.V.getClass();
                    h5.e0.a aVar9 = h5.g.a.f81805b;
                    if (mVar10.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar10.z();
                    if (mVar10.getT()) {
                        mVar10.M(aVar9);
                    } else {
                        mVar10.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA2, mVar10);
                    b4.c(h5.g.a.f81809f, i2VarX2, mVar10);
                    h5.g.a.b bVar4 = h5.g.a.f81813j;
                    if (mVar10.getT() || !p005kotlin.jvm.internal.s.g(mVar10.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar10, iHashCode2, bVar4);
                    }
                    b4.c(h5.g.a.f81807d, rVarC5, mVar10);
                    b0 b0Var2 = b0.f22601a;
                    String str3 = bVar3 != null ? bVar3.f84253c : null;
                    if (str3 == null) {
                        mVar10.C(1394344246);
                        mVar10.f();
                    } else {
                        mVar10.C(1394344247);
                        w1.a(bVar3.f84252b, str3, bVar3.f84254d, false, h4.p.b(aVar8, 1.0f), mVar10, 24576, 8);
                        mVar10.f();
                    }
                    h4.r rVarA = b0Var2.a(x2.f(aVar8, 1.0f), 1.0f, true);
                    boolean zK2 = mVar10.k(size);
                    Object objQ8 = mVar10.q();
                    if (zK2) {
                        objQ8 = new a0(size, i16);
                        mVar10.K(objQ8);
                    } else {
                        aVar.getClass();
                        if (objQ8 == p3.m.a.f135155b) {
                            objQ8 = new a0(size, i16);
                            mVar10.K(objQ8);
                        }
                    }
                    e23.l lVar7 = (e23.l) objQ8;
                    boolean zB4 = mVar10.B(aVar7);
                    Object objQ9 = mVar10.q();
                    if (zB4) {
                        objQ9 = new rx1.m(aVar7, 24);
                        mVar10.K(objQ9);
                    } else {
                        aVar.getClass();
                        if (objQ9 == p3.m.a.f135155b) {
                            objQ9 = new rx1.m(aVar7, 24);
                            mVar10.K(objQ9);
                        }
                    }
                    p002j6.c.b(lVar7, rVarA, (e23.l) objQ9, mVar10, 0, 0);
                    mVar10.y();
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ q(Object obj, int i14, Object obj2, int i15) {
        this.f12669a = i15;
        this.f12671c = obj;
        this.f12670b = i14;
        this.f12672d = obj2;
    }

    public /* synthetic */ q(Object obj, Object obj2, int i14, int i15) {
        this.f12669a = i15;
        this.f12671c = obj;
        this.f12672d = obj2;
        this.f12670b = i14;
    }
}

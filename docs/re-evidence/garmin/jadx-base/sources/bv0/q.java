package bv0;

import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import i3.fe;
import i3.mh;
import l72.p2;
import p005kotlin.Unit;
import p3.b4;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class q implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gv0.d f21360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f21361c;

    public /* synthetic */ q(gv0.d dVar, e23.a aVar, int i14) {
        this.f21359a = i14;
        this.f21360b = dVar;
        this.f21361c = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0110  */
    /* JADX WARN: Code duplicated, block: B:33:0x0119  */
    /* JADX WARN: Code duplicated, block: B:34:0x011d  */
    /* JADX WARN: Code duplicated, block: B:39:0x013a  */
    /* JADX WARN: Code duplicated, block: B:42:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:44:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:46:0x0241  */
    /* JADX WARN: Code duplicated, block: B:64:0x0294  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        p3.m.a aVar;
        h5.g.a.f fVar;
        c2.z zVarA;
        int iHashCode;
        p3.i2 i2VarX;
        h4.r rVarC;
        boolean zR;
        Object objQ;
        Boolean bool;
        int i14 = this.f21359a;
        p3.m.a aVar2 = p3.m.f135153a;
        gv0.d dVar = this.f21360b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((a.m) obj).getClass();
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    boolean zR2 = mVar.r(dVar);
                    e23.a aVar3 = this.f21361c;
                    boolean zB = zR2 | mVar.B(aVar3);
                    Object objQ2 = mVar.q();
                    if (zB) {
                        objQ2 = new r(dVar, aVar3, 1);
                        mVar.K(objQ2);
                    } else {
                        aVar2.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new r(dVar, aVar3, 1);
                            mVar.K(objQ2);
                        }
                    }
                    hv0.e.a(dVar, (e23.a) objQ2, mVar, 0);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((fe) obj).getClass();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    ou0.f fVar2 = (ou0.f) ((g3) s9.c.c(dVar.f79204w, mVar2).getF182175a()).f35301b;
                    boolean zBooleanValue = (fVar2 == null || (bool = fVar2.f133986d) == null) ? false : bool.booleanValue();
                    h4.r.a aVar4 = h4.r.S;
                    h4.r rVarD = x2.d(aVar4, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar = j92.b.f97899b;
                    float f14 = eVar.f97920e;
                    h4.r rVarC2 = c2.l.C(rVarD, 0.0f, 0.0f, 0.0f, f14, 7);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    h4.g.a aVar5 = h4.d.a.f81536n;
                    c2.z zVarA2 = c2.y.a(kVar, aVar5, mVar2, 0);
                    int iHashCode2 = Long.hashCode(mVar2.getU());
                    p3.i2 i2VarX2 = mVar2.x();
                    h4.r rVarC3 = h4.k.c(rVarC2, mVar2);
                    h5.g.V.getClass();
                    h5.e0.a aVar6 = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar6);
                    } else {
                        mVar2.c();
                    }
                    h5.g.a.e eVar2 = h5.g.a.f81810g;
                    b4.c(eVar2, zVarA2, mVar2);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarX2, mVar2);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar2.getT()) {
                        aVar = aVar2;
                    } else {
                        aVar = aVar2;
                        if (!p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                        }
                        fVar = h5.g.a.f81807d;
                        b4.c(fVar, rVarC3, mVar2);
                        h4.r rVarB = u1.a2.b(c2.b0.f22601a.a(x2.f(aVar4, 1.0f), 1.0f, true), u1.a2.a(mVar2), true);
                        zVarA = c2.y.a(kVar, aVar5, mVar2, 0);
                        iHashCode = Long.hashCode(mVar2.getU());
                        i2VarX = mVar2.x();
                        rVarC = h4.k.c(rVarB, mVar2);
                        if (mVar2.F() != null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar6);
                        } else {
                            mVar2.c();
                        }
                        b4.c(eVar2, zVarA, mVar2);
                        b4.c(c1623g, i2VarX, mVar2);
                        if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                            v.h.z(iHashCode, mVar2, iHashCode, bVar);
                        }
                        b4.c(fVar, rVarC, mVar2);
                        String strQ = gl1.y.Q(mVar2, R.string.lbl_extend_session_visibility);
                        d92.b.f58624b.getClass();
                        s5.x0 x0VarB = d92.c.b(j92.f.f97930g, mVar2);
                        d6.h.f57752b.getClass();
                        int i15 = d6.h.f57755e;
                        h4.r rVarF = x2.f(aVar4, 1.0f);
                        float f15 = eVar.f97922g;
                        float f16 = eVar.f97920e;
                        mh.c(strQ, c2.l.C(rVarF, f16, f15, f16, 0.0f, 8), 0L, null, 0L, null, 0L, d6.h.a(i15), 0L, 0, false, 0, 0, null, x0VarB, mVar2, 0, 0, 130044);
                        mh.c(gl1.y.Q(mVar2, R.string.msg_livetrack_extend_option_description), c2.l.B(x2.f(aVar4, 1.0f), f14, f14, f14, eVar.f97922g), 0L, null, 0L, null, 0L, d6.h.a(i15), 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97931h, mVar2), mVar2, 0, 0, 130044);
                        p2 p2Var = p2.f111205a;
                        String strQ2 = gl1.y.Q(mVar2, R.string.lbl_extend_session_visibility);
                        z3.e eVarC = z3.f.c(-1113893439, new j30.d(zBooleanValue, 1, (byte) 0), mVar2);
                        zR = mVar2.r(dVar) | mVar2.h(zBooleanValue);
                        objQ = mVar2.q();
                        if (zR) {
                            objQ = new b50.o(dVar, zBooleanValue, 4);
                            mVar2.K(objQ);
                        } else {
                            aVar.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new b50.o(dVar, zBooleanValue, 4);
                                mVar2.K(objQ);
                            }
                        }
                        p2Var.g(strQ2, null, null, null, eVarC, false, false, (e23.a) objQ, mVar2, 24576, 238);
                        mVar2.y();
                        l72.f0.f110999a.d(0, 9, this.f21361c, c2.l.A(x2.f(aVar4, 1.0f), f14, 0.0f, 2), gl1.y.Q(mVar2, R.string.lbl_next), mVar2, null, false);
                        mVar2.y();
                    }
                    v.h.z(iHashCode2, mVar2, iHashCode2, bVar);
                    fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC3, mVar2);
                    h4.r rVarB2 = u1.a2.b(c2.b0.f22601a.a(x2.f(aVar4, 1.0f), 1.0f, true), u1.a2.a(mVar2), true);
                    zVarA = c2.y.a(kVar, aVar5, mVar2, 0);
                    iHashCode = Long.hashCode(mVar2.getU());
                    i2VarX = mVar2.x();
                    rVarC = h4.k.c(rVarB2, mVar2);
                    if (mVar2.F() != null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar6);
                    } else {
                        mVar2.c();
                    }
                    b4.c(eVar2, zVarA, mVar2);
                    b4.c(c1623g, i2VarX, mVar2);
                    if (mVar2.getT()) {
                        v.h.z(iHashCode, mVar2, iHashCode, bVar);
                    } else {
                        v.h.z(iHashCode, mVar2, iHashCode, bVar);
                    }
                    b4.c(fVar, rVarC, mVar2);
                    String strQ3 = gl1.y.Q(mVar2, R.string.lbl_extend_session_visibility);
                    d92.b.f58624b.getClass();
                    s5.x0 x0VarB2 = d92.c.b(j92.f.f97930g, mVar2);
                    d6.h.f57752b.getClass();
                    int i16 = d6.h.f57755e;
                    h4.r rVarF2 = x2.f(aVar4, 1.0f);
                    float f17 = eVar.f97922g;
                    float f18 = eVar.f97920e;
                    mh.c(strQ3, c2.l.C(rVarF2, f18, f17, f18, 0.0f, 8), 0L, null, 0L, null, 0L, d6.h.a(i16), 0L, 0, false, 0, 0, null, x0VarB2, mVar2, 0, 0, 130044);
                    mh.c(gl1.y.Q(mVar2, R.string.msg_livetrack_extend_option_description), c2.l.B(x2.f(aVar4, 1.0f), f14, f14, f14, eVar.f97922g), 0L, null, 0L, null, 0L, d6.h.a(i16), 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97931h, mVar2), mVar2, 0, 0, 130044);
                    p2 p2Var2 = p2.f111205a;
                    String strQ4 = gl1.y.Q(mVar2, R.string.lbl_extend_session_visibility);
                    z3.e eVarC2 = z3.f.c(-1113893439, new j30.d(zBooleanValue, 1, (byte) 0), mVar2);
                    zR = mVar2.r(dVar) | mVar2.h(zBooleanValue);
                    objQ = mVar2.q();
                    if (zR) {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new b50.o(dVar, zBooleanValue, 4);
                            mVar2.K(objQ);
                        }
                    } else {
                        objQ = new b50.o(dVar, zBooleanValue, 4);
                        mVar2.K(objQ);
                    }
                    p2Var2.g(strQ4, null, null, null, eVarC2, false, false, (e23.a) objQ, mVar2, 24576, 238);
                    mVar2.y();
                    l72.f0.f110999a.d(0, 9, this.f21361c, c2.l.A(x2.f(aVar4, 1.0f), f14, 0.0f, 2), gl1.y.Q(mVar2, R.string.lbl_next), mVar2, null, false);
                    mVar2.y();
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }
}

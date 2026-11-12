package l72;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class k implements e23.q<c2.c1, p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b92.a f111098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f111099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f111100c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f111101d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f111102e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f111103f;

    public k(b92.a aVar, String str, String str2, boolean z14, String str3, String str4) {
        this.f111098a = aVar;
        this.f111099b = str;
        this.f111100c = str2;
        this.f111101d = z14;
        this.f111102e = str3;
        this.f111103f = str4;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x004e  */
    /* JADX WARN: Code duplicated, block: B:21:0x0058  */
    /* JADX WARN: Code duplicated, block: B:38:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:40:0x00fe A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0100  */
    /* JADX WARN: Code duplicated, block: B:42:0x010a  */
    /* JADX WARN: Code duplicated, block: B:46:0x0137  */
    /* JADX WARN: Code duplicated, block: B:48:0x0140  */
    /* JADX WARN: Code duplicated, block: B:49:0x0144  */
    /* JADX WARN: Code duplicated, block: B:54:0x0161  */
    /* JADX WARN: Code duplicated, block: B:56:0x0177  */
    @Override // e23.q
    public final Unit invoke(c2.c1 c1Var, p3.m mVar, Integer num) {
        b92.a aVar;
        h5.g.a.f fVar;
        boolean zB;
        Object objQ;
        b92.a aVar2;
        f5.z0 z0VarD;
        int iHashCode;
        p3.i2 i2VarX;
        h4.r rVarC;
        c2.c1 c1Var2 = c1Var;
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        c1Var2.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar2.B(c1Var2) ? 4 : 2;
        }
        if (mVar2.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            b92.a aVar3 = this.f111098a;
            boolean zB2 = mVar2.B(aVar3);
            Object objQ2 = mVar2.q();
            p3.m.a aVar4 = p3.m.f135153a;
            if (zB2) {
                if (aVar3 != null) {
                    objQ2 = l.k(aVar3, "value", "value_secondary");
                } else {
                    objQ2 = null;
                }
                mVar2.K(objQ2);
            } else {
                aVar4.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    if (aVar3 != null) {
                        objQ2 = l.k(aVar3, "value", "value_secondary");
                    } else {
                        objQ2 = null;
                    }
                    mVar2.K(objQ2);
                }
            }
            b92.a aVar5 = (b92.a) objQ2;
            h4.r.a aVar6 = h4.r.S;
            h4.r rVarA = c1Var2.a(aVar6, 1.0f, true);
            h4.d.f81522a.getClass();
            h4.g.b bVar = h4.d.a.f81533k;
            h4.r rVarC2 = c1Var2.c(rVarA, bVar);
            h4.g gVar = h4.d.a.f81529g;
            f5.z0 z0VarD2 = c2.q.d(gVar, false);
            int iHashCode2 = Long.hashCode(mVar2.getU());
            p3.i2 i2VarX2 = mVar2.x();
            h4.r rVarC3 = h4.k.c(rVarC2, mVar2);
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
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, z0VarD2, mVar2);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarX2, mVar2);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (mVar2.getT()) {
                aVar = aVar5;
            } else {
                aVar = aVar5;
                if (!p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC3, mVar2);
                c2.u uVar = c2.u.f22885a;
                l.b(0, aVar, this.f111099b, this.f111100c, mVar2, this.f111101d);
                mVar2.y();
                zB = mVar2.B(aVar3);
                objQ = mVar2.q();
                if (zB) {
                    if (aVar3 != null) {
                        objQ = l.k(aVar3, "value_2", "value_2_secondary");
                    } else {
                        objQ = null;
                    }
                    mVar2.K(objQ);
                } else {
                    aVar4.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        if (aVar3 != null) {
                            objQ = l.k(aVar3, "value_2", "value_2_secondary");
                        } else {
                            objQ = null;
                        }
                        mVar2.K(objQ);
                    }
                }
                aVar2 = (b92.a) objQ;
                h4.r rVarC4 = c1Var2.c(c1Var2.a(aVar6, 1.0f, true), bVar);
                z0VarD = c2.q.d(gVar, false);
                iHashCode = Long.hashCode(mVar2.getU());
                i2VarX = mVar2.x();
                rVarC = h4.k.c(rVarC4, mVar2);
                if (mVar2.F() != null) {
                    p3.p0.l();
                    throw null;
                }
                mVar2.z();
                if (mVar2.getT()) {
                    mVar2.M(aVar7);
                } else {
                    mVar2.c();
                }
                b4.c(eVar, z0VarD, mVar2);
                b4.c(c1623g, i2VarX, mVar2);
                if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                    v.h.z(iHashCode, mVar2, iHashCode, bVar2);
                }
                b4.c(fVar, rVarC, mVar2);
                l.b(0, aVar2, this.f111102e, this.f111103f, mVar2, this.f111101d);
                mVar2.y();
            }
            v.h.z(iHashCode2, mVar2, iHashCode2, bVar2);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC3, mVar2);
            c2.u uVar2 = c2.u.f22885a;
            l.b(0, aVar, this.f111099b, this.f111100c, mVar2, this.f111101d);
            mVar2.y();
            zB = mVar2.B(aVar3);
            objQ = mVar2.q();
            if (zB) {
                aVar4.getClass();
                if (objQ == p3.m.a.f135155b) {
                    if (aVar3 != null) {
                        objQ = l.k(aVar3, "value_2", "value_2_secondary");
                    } else {
                        objQ = null;
                    }
                    mVar2.K(objQ);
                }
            } else {
                if (aVar3 != null) {
                    objQ = l.k(aVar3, "value_2", "value_2_secondary");
                } else {
                    objQ = null;
                }
                mVar2.K(objQ);
            }
            aVar2 = (b92.a) objQ;
            h4.r rVarC5 = c1Var2.c(c1Var2.a(aVar6, 1.0f, true), bVar);
            z0VarD = c2.q.d(gVar, false);
            iHashCode = Long.hashCode(mVar2.getU());
            i2VarX = mVar2.x();
            rVarC = h4.k.c(rVarC5, mVar2);
            if (mVar2.F() != null) {
                p3.p0.l();
                throw null;
            }
            mVar2.z();
            if (mVar2.getT()) {
                mVar2.M(aVar7);
            } else {
                mVar2.c();
            }
            b4.c(eVar, z0VarD, mVar2);
            b4.c(c1623g, i2VarX, mVar2);
            if (mVar2.getT()) {
                v.h.z(iHashCode, mVar2, iHashCode, bVar2);
            } else {
                v.h.z(iHashCode, mVar2, iHashCode, bVar2);
            }
            b4.c(fVar, rVarC, mVar2);
            l.b(0, aVar2, this.f111102e, this.f111103f, mVar2, this.f111101d);
            mVar2.y();
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}

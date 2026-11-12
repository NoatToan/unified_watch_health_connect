package af0;

import c2.q;
import c2.u;
import e23.p;
import f5.z0;
import h4.k;
import h4.r;
import h5.e0;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.p0;
import p3.x1;
import p3.x3;
import wz1.i;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.a f3035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x3 f3036c;

    public /* synthetic */ c(e23.a aVar, x3 x3Var, int i14) {
        this.f3034a = i14;
        this.f3035b = aVar;
        this.f3036c = x3Var;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0042  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:55:0x0150  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f3034a;
        m.a aVar = m.f135153a;
        x3 x3Var = this.f3036c;
        e23.a aVar2 = this.f3035b;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    String str = (String) x3Var.getF182175a();
                    boolean zB = mVar.B(aVar2);
                    Object objQ = mVar.q();
                    if (zB) {
                        objQ = new defpackage.c(aVar2, 3);
                        mVar.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new defpackage.c(aVar2, 3);
                            mVar.K(objQ);
                        }
                    }
                    z02.f.c(0, 54, null, (e23.a) objQ, null, str, mVar, null);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    r rVarC = i.c(r.S, mVar2);
                    h4.d.f81522a.getClass();
                    z0 z0VarD = q.d(h4.d.a.f81524b, false);
                    int iHashCode = Long.hashCode(mVar2.getU());
                    i2 i2VarX = mVar2.x();
                    r rVarC2 = k.c(rVarC, mVar2);
                    h5.g.V.getClass();
                    e0.a aVar3 = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar3);
                    } else {
                        mVar2.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD, mVar2);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar2, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, mVar2);
                    u uVar = u.f22885a;
                    String str2 = (String) x3Var.getF182175a();
                    boolean zB2 = mVar2.B(aVar2);
                    Object objQ2 = mVar2.q();
                    if (zB2) {
                        objQ2 = new ii0.h(aVar2, 9);
                        mVar2.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == m.a.f135155b) {
                            objQ2 = new ii0.h(aVar2, 9);
                            mVar2.K(objQ2);
                        }
                    }
                    z02.f.c(0, 54, null, (e23.a) objQ2, null, str2, mVar2, null);
                    mVar2.y();
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            default:
                m mVar3 = (m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = n.f135158a;
                    String str3 = (String) x3Var.getF182175a();
                    boolean zB3 = mVar3.B(aVar2);
                    Object objQ3 = mVar3.q();
                    if (zB3) {
                        objQ3 = new ll0.a(aVar2, 6);
                        mVar3.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == m.a.f135155b) {
                            objQ3 = new ll0.a(aVar2, 6);
                            mVar3.K(objQ3);
                        }
                    }
                    z02.f.c(0, 54, null, (e23.a) objQ3, null, str3, mVar3, null);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
        }
    }
}

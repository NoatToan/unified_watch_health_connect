package qk0;

import b82.t0;
import c2.a0;
import c2.t2;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import h5.e0;
import m4.b0;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.p1;
import p3.x1;
import u1.a2;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class n implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f145115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1 f145116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b0 f145117c;

    public /* synthetic */ n(p1 p1Var, b0 b0Var) {
        this.f145115a = 1;
        this.f145116b = p1Var;
        this.f145117c = b0Var;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0088  */
    /* JADX WARN: Code duplicated, block: B:39:0x011f  */
    /* JADX WARN: Code duplicated, block: B:65:0x0201  */
    /* JADX WARN: Code duplicated, block: B:90:0x02a1  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f145115a;
        b0 b0Var = this.f145117c;
        p3.m.a aVar = p3.m.f135153a;
        p1 p1Var = this.f145116b;
        switch (i14) {
            case 0:
                t2 t2Var = (t2) obj;
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                t2Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar.B(t2Var) ? 4 : 2;
                }
                if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x1 x1Var = p3.n.f135158a;
                    t0 t0Var = t0.f16792a;
                    h4.r rVarA = t2Var.a(h4.r.S, 1.0f, true);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarA2 = m4.e.a(c2.l.C(rVarA, 0.0f, 0.0f, j92.b.f97899b.f97920e, 0.0f, 11), b0Var);
                    String str = (String) p1Var.getF182175a();
                    if (str == null) {
                        str = "";
                    }
                    String str2 = str;
                    String strQ = y.Q(mVar, R.string.search_activities);
                    boolean zB = mVar.B(p1Var);
                    Object objQ = mVar.q();
                    if (zB) {
                        objQ = new li0.w(p1Var, 24);
                        mVar.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new li0.w(p1Var, 24);
                            mVar.K(objQ);
                        }
                    }
                    t0Var.g(rVarA2, str2, strQ, null, null, 0L, (e23.p) objQ, mVar, 0, 56);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((a0) obj).getClass();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x1 x1Var2 = p3.n.f135158a;
                    h4.r.a aVar2 = h4.r.S;
                    h4.r rVarD = c2.l.D(a2.b(x2.c(aVar2, 1.0f), a2.a(mVar2), true));
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar2, 0);
                    int iHashCode = Long.hashCode(mVar2.getU());
                    i2 i2VarX = mVar2.x();
                    h4.r rVarC = h4.k.c(rVarD, mVar2);
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
                    b4.c(h5.g.a.f81810g, zVarA, mVar2);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar2, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar2);
                    c2.b0 b0Var2 = c2.b0.f22601a;
                    h4.r rVarF = x2.f(aVar2, 1.0f);
                    String str3 = (String) p1Var.getF182175a();
                    boolean zB2 = mVar2.B(p1Var);
                    Object objQ2 = mVar2.q();
                    if (zB2) {
                        objQ2 = new sk0.n(p1Var, 26);
                        mVar2.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new sk0.n(p1Var, 26);
                            mVar2.K(objQ2);
                        }
                    }
                    uk0.o.c(str3, (e23.l) objQ2, rVarF, this.f145117c, mVar2, 3456, 0);
                    mVar2.y();
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                t2 t2Var2 = (t2) obj;
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                t2Var2.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= mVar3.B(t2Var2) ? 4 : 2;
                }
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    x1 x1Var3 = p3.n.f135158a;
                    t0 t0Var2 = t0.f16792a;
                    h4.r rVarA3 = t2Var2.a(h4.r.S, 1.0f, true);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarA4 = m4.e.a(c2.l.C(rVarA3, 0.0f, 0.0f, j92.b.f97899b.f97920e, 0.0f, 11), b0Var);
                    String str4 = (String) p1Var.getF182175a();
                    String strQ2 = y.Q(mVar3, R.string.lbl_search);
                    boolean zB3 = mVar3.B(p1Var);
                    Object objQ3 = mVar3.q();
                    if (zB3) {
                        objQ3 = new sk0.c(p1Var, 7);
                        mVar3.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new sk0.c(p1Var, 7);
                            mVar3.K(objQ3);
                        }
                    }
                    t0Var2.g(rVarA4, str4, strQ2, null, null, 0L, (e23.p) objQ3, mVar3, 0, 56);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            default:
                t2 t2Var3 = (t2) obj;
                p3.m mVar4 = (p3.m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                t2Var3.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= mVar4.B(t2Var3) ? 4 : 2;
                }
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    x1 x1Var4 = p3.n.f135158a;
                    t0 t0Var3 = t0.f16792a;
                    h4.r rVarA5 = t2Var3.a(h4.r.S, 1.0f, true);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarA6 = m4.e.a(c2.l.C(rVarA5, 0.0f, 0.0f, j92.b.f97899b.f97920e, 0.0f, 11), b0Var);
                    String str5 = (String) p1Var.getF182175a();
                    String strQ3 = y.Q(mVar4, R.string.lbl_search);
                    boolean zB4 = mVar4.B(p1Var);
                    Object objQ4 = mVar4.q();
                    if (zB4) {
                        objQ4 = new sk0.c(p1Var, 8);
                        mVar4.K(objQ4);
                    } else {
                        aVar.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new sk0.c(p1Var, 8);
                            mVar4.K(objQ4);
                        }
                    }
                    t0Var3.g(rVarA6, str5, strQ3, null, null, 0L, (e23.p) objQ4, mVar4, 0, 56);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ n(b0 b0Var, p1 p1Var, int i14) {
        this.f145115a = i14;
        this.f145117c = b0Var;
        this.f145116b = p1Var;
    }
}

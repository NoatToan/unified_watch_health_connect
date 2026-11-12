package cw1;

import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import i3.i7;
import o72.a3;
import org.joda.time.DateTimeConstants;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class f1 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f56035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3.n1 f56036c;

    public /* synthetic */ f1(int i14, p3.n1 n1Var, int i15) {
        this.f56034a = i15;
        this.f56035b = i14;
        this.f56036c = n1Var;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x015f  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f56034a;
        String strH = null;
        p3.m.a aVar = p3.m.f135153a;
        int i15 = this.f56035b;
        p3.n1 n1Var = this.f56036c;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i14) {
            case 0:
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    h4.r.a aVar2 = h4.r.S;
                    h4.r rVarF = x2.f(aVar2, 1.0f);
                    h4.d.f81522a.getClass();
                    h4.g.a aVar3 = h4.d.a.f81537o;
                    c2.j.f22691a.getClass();
                    c2.z zVarA = c2.y.a(c2.j.f22694d, aVar3, mVar, 48);
                    int iHashCode = Long.hashCode(mVar.getU());
                    i2 i2VarX = mVar.x();
                    h4.r rVarC = h4.k.c(rVarF, mVar);
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
                    b4.c(h5.g.a.f81810g, zVarA, mVar);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar);
                    c2.b0 b0Var = c2.b0.f22601a;
                    h4.r rVarX = x2.x(x2.z(aVar2, null, 3), null, 3);
                    boolean zB = mVar.B(n1Var);
                    Object objQ = mVar.q();
                    if (zB) {
                        objQ = new a11.h0(n1Var, 5);
                        mVar.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new a11.h0(n1Var, 5);
                            mVar.K(objQ);
                        }
                    }
                    r82.g.g(rVarX, null, null, null, 0, DateTimeConstants.SECONDS_PER_DAY, this.f56035b, (e23.l) objQ, mVar, 6, 14);
                    mVar.y();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    boolean z14 = n1Var.getIntValue() == i15;
                    t4.d dVarA = n5.c.a(R.drawable.check, mVar, 0);
                    if (z14) {
                        strH = sn.a.h(mVar, 1689006681, R.string.lbl_selected, mVar);
                    } else {
                        mVar.C(819641193);
                        mVar.f();
                    }
                    long jA = com.nimbusds.jose.shaded.gson.internal.a.a(d92.b.f58623a, mVar);
                    h4.r.a aVar5 = h4.r.S;
                    d92.b.f58625c.getClass();
                    i7.a(dVarA, strH, l4.k.a(x2.q(aVar5, j92.b.f97901d.f97905d), z14 ? 1.0f : 0.0f), jA, mVar, 0, 0);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    String strQ = gl1.y.Q(mVar, R.string.common_feet_string);
                    String strQ2 = gl1.y.Q(mVar, R.string.common_meters_string);
                    i53.f fVarA = i53.a.a(strQ, strQ2);
                    if (i15 != 0) {
                        strQ = strQ2;
                    }
                    Object objQ2 = mVar.q();
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new a3(n1Var, 23);
                        mVar.K(objQ2);
                    }
                    r82.s.b(strQ, fVarA, (e23.l) objQ2, mVar, 384);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
        }
    }
}

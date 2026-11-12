package nf1;

import android.content.Context;
import c2.b0;
import c2.t2;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import e23.q;
import fb1.q0;
import gl1.y;
import h4.k;
import h4.r;
import h5.e0;
import i3.mh;
import l72.x0;
import ne2.t;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.p0;
import p3.x1;
import p5.v;
import w5.f0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f125887a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f125888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f125889c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f125890d;

    public /* synthetic */ c(Context context, int i14, int i15) {
        this.f125888b = context;
        this.f125889c = i14;
        this.f125890d = i15;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0073  */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String strH;
        String strH2;
        int i14 = this.f125887a;
        m.a aVar = m.f135153a;
        int i15 = this.f125890d;
        int i16 = this.f125889c;
        Context context = this.f125888b;
        switch (i14) {
            case 0:
                t2 t2Var = (t2) obj;
                m mVar = (m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                t2Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar.B(t2Var) ? 4 : 2;
                }
                int i17 = iIntValue;
                if (mVar.n(i17 & 1, (i17 & 19) != 18)) {
                    x1 x1Var = n.f135158a;
                    String strE = of1.a.e(i16, Boolean.TRUE, Boolean.FALSE, mVar);
                    mVar.C(418502117);
                    x0 x0Var = x0.f111346a;
                    String strQ = y.Q(mVar, R.string.actual_seven_day_distance);
                    String string = context.getString(i15);
                    String strQ2 = y.Q(mVar, R.string.actual_seven_day_distance);
                    Object objQ = mVar.q();
                    aVar.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new t(9);
                        mVar.K(objQ);
                    }
                    b92.a aVarA = wz1.a.a(oi0.c.B(strQ2, (l) objQ, mVar));
                    int i18 = b92.a.f16960b;
                    int i19 = x0.f111348c;
                    x0Var.a((i17 & 14) | (i19 << 24), 52, aVarA, t2Var, null, null, strE, strQ, string, null, mVar);
                    mVar.f();
                    x0Var.h(t2Var, mVar, (i17 & 14) | (i19 << 3));
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                c2.t tVar = (c2.t) obj;
                m mVar2 = (m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                tVar.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar2.B(tVar) ? 4 : 2;
                }
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x1 x1Var2 = n.f135158a;
                    r.a aVar2 = r.S;
                    r rVarD = x2.d(aVar2, 1.0f);
                    h4.d.f81522a.getClass();
                    r rVarC = tVar.c(rVarD, h4.d.a.f81528f);
                    boolean zR = mVar2.r(context) | mVar2.k(i16) | mVar2.k(i15);
                    Object objQ2 = mVar2.q();
                    if (zR) {
                        objQ2 = new q0(context, i16, i15, 1);
                        mVar2.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == m.a.f135155b) {
                            objQ2 = new q0(context, i16, i15, 1);
                            mVar2.K(objQ2);
                        }
                    }
                    r rVarC2 = v.c((l) objQ2, rVarC, true);
                    c2.j.f22691a.getClass();
                    c2.j.c cVar = c2.j.f22696f;
                    h4.g.a aVar3 = h4.d.a.f81537o;
                    z zVarA = c2.y.a(cVar, aVar3, mVar2, 54);
                    int iHashCode = Long.hashCode(mVar2.getU());
                    i2 i2VarX = mVar2.x();
                    r rVarC3 = k.c(rVarC2, mVar2);
                    h5.g.V.getClass();
                    e0.a aVar4 = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar4);
                    } else {
                        mVar2.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar2);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar2, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC3, mVar2);
                    b0 b0Var = b0.f22601a;
                    if (i16 >= 0) {
                        mVar2.C(-627976432);
                        mVar2.f();
                        strH = String.valueOf(i16);
                    } else {
                        strH = sn.a.h(mVar2, -627975897, R.string.no_value, mVar2);
                    }
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    s5.x0 x0VarB = d92.c.b(j92.f.f97928e, mVar2);
                    f0.f182097b.getClass();
                    f0 f0Var = f0.f182104i;
                    r rVarB = b0Var.b(aVar2, aVar3);
                    Object objQ3 = mVar2.q();
                    aVar.getClass();
                    m.a.C2565a c2565a = m.a.f135155b;
                    if (objQ3 == c2565a) {
                        objQ3 = new ot1.t(13);
                        mVar2.K(objQ3);
                    }
                    mh.c(strH, v.b(rVarB, (l) objQ3), 0L, null, 0L, f0Var, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, mVar2, 1572864, 0, 131004);
                    String strQ3 = y.Q(mVar2, R.string.gcm_body_battery_lbl_high);
                    s5.x0 x0Var2 = j92.f.f97932i;
                    s5.x0 x0VarF = d92.c.f(x0Var2, mVar2);
                    r rVarB2 = b0Var.b(aVar2, aVar3);
                    Object objQ4 = mVar2.q();
                    if (objQ4 == c2565a) {
                        objQ4 = new ot1.t(14);
                        mVar2.K(objQ4);
                    }
                    mh.c(strQ3, v.b(rVarB2, (l) objQ4), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, mVar2, 0, 0, 131068);
                    if (i15 >= 0) {
                        mVar2.C(-627955664);
                        mVar2.f();
                        strH2 = String.valueOf(i15);
                    } else {
                        strH2 = sn.a.h(mVar2, -627955129, R.string.no_value, mVar2);
                    }
                    String str = strH2;
                    s5.x0 x0VarB2 = d92.c.b(j92.f.f97930g, mVar2);
                    r rVarB3 = b0Var.b(aVar2, aVar3);
                    Object objQ5 = mVar2.q();
                    if (objQ5 == c2565a) {
                        objQ5 = new ot1.t(15);
                        mVar2.K(objQ5);
                    }
                    g6.f.a aVar5 = g6.f.f75994b;
                    mh.c(str, c2.l.C(v.b(rVarB3, (l) objQ5), 0.0f, 16, 0.0f, 0.0f, 13), 0L, null, 0L, f0Var, 0L, null, 0L, 0, false, 0, 0, null, x0VarB2, mVar2, 1572864, 0, 131004);
                    String strQ4 = y.Q(mVar2, R.string.gcm_body_battery_lbl_low);
                    s5.x0 x0VarF2 = d92.c.f(x0Var2, mVar2);
                    r rVarB4 = b0Var.b(aVar2, aVar3);
                    Object objQ6 = mVar2.q();
                    if (objQ6 == c2565a) {
                        objQ6 = new ot1.t(16);
                        mVar2.K(objQ6);
                    }
                    mh.c(strQ4, v.b(rVarB4, (l) objQ6), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF2, mVar2, 0, 0, 131068);
                    mVar2.y();
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ c(of1.a aVar, int i14, Context context, int i15) {
        this.f125889c = i14;
        this.f125888b = context;
        this.f125890d = i15;
    }
}

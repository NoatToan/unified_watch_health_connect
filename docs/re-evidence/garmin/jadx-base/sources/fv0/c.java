package fv0;

import android.content.Context;
import c2.j;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import gl1.y;
import h4.k;
import h4.r;
import h5.e0;
import i3.i7;
import lc.u0;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.p0;
import p3.x1;
import u1.w;
import u1.y0;
import v62.d3;
import v62.s9;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f73630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f73631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f73632c;

    public /* synthetic */ c(Context context, int i14, boolean z14) {
        this.f73630a = i14;
        this.f73631b = z14;
        this.f73632c = context;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0069  */
    /* JADX WARN: Code duplicated, block: B:44:0x0162  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        m mVar;
        int i14 = this.f73630a;
        m.a aVar = m.f135153a;
        Context context = this.f73632c;
        boolean z14 = this.f73631b;
        switch (i14) {
            case 0:
                m mVar2 = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar2.n(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    j jVar = j.f22691a;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar = j92.b.f97899b;
                    float f14 = eVar.f97920e;
                    jVar.getClass();
                    j.i iVarI = j.i(f14);
                    r.a aVar2 = r.S;
                    h4.d.f81522a.getClass();
                    s2 s2VarA = q2.a(iVarI, h4.d.a.f81533k, mVar2, 0);
                    int iHashCode = Long.hashCode(mVar2.getU());
                    i2 i2VarX = mVar2.x();
                    r rVarC = k.c(aVar2, mVar2);
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
                    b4.c(h5.g.a.f81810g, s2VarA, mVar2);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar2, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar2);
                    u2 u2Var = u2.f22900a;
                    if (z14) {
                        mVar2.C(1188291427);
                        s62.a.f157643a.getClass();
                        u4.d dVarA = s9.a(t62.b.f162798a);
                        String strQ = y.Q(mVar2, R.string.lbl_declined);
                        r rVarQ = x2.q(aVar2, eVar.f97921f);
                        boolean zR = mVar2.r(context);
                        Object objQ = mVar2.q();
                        if (zR) {
                            objQ = new cy1.a(context, 12);
                            mVar2.K(objQ);
                        } else {
                            aVar.getClass();
                            if (objQ == m.a.f135155b) {
                                objQ = new cy1.a(context, 12);
                                mVar2.K(objQ);
                            }
                        }
                        r rVarD = w.d(rVarQ, false, null, null, (e23.a) objQ, 15);
                        mVar = mVar2;
                        y0.b(dVarA, strQ, rVarD, null, mVar, 0, 120);
                        mVar.f();
                    } else {
                        mVar = mVar2;
                        mVar.C(1188948751);
                        mVar.f();
                    }
                    s62.a.f157643a.getClass();
                    m mVar3 = mVar;
                    i7.b(d3.a(t62.b.f162798a), null, null, u0.f(mVar3), mVar3, 48, 4);
                    mVar3.y();
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            default:
                m mVar4 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar4.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    if (z14) {
                        mVar4.C(1747890153);
                        s62.a.f157643a.getClass();
                        u4.d dVarA2 = s9.a(t62.b.f162798a);
                        String strQ2 = y.Q(mVar4, R.string.lbl_declined);
                        r.a aVar4 = r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        r rVarQ2 = x2.q(aVar4, j92.b.f97899b.f97921f);
                        boolean zR2 = mVar4.r(context);
                        Object objQ2 = mVar4.q();
                        if (zR2) {
                            objQ2 = new cy1.a(context, 13);
                            mVar4.K(objQ2);
                        } else {
                            aVar.getClass();
                            if (objQ2 == m.a.f135155b) {
                                objQ2 = new cy1.a(context, 13);
                                mVar4.K(objQ2);
                            }
                        }
                        y0.b(dVarA2, strQ2, w.d(rVarQ2, false, null, null, (e23.a) objQ2, 15), null, mVar4, 0, 120);
                        mVar4.f();
                    } else {
                        mVar4.C(1748547477);
                        mVar4.f();
                    }
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
        }
    }
}

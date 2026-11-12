package qb0;

import c2.a0;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import i3.i7;
import i3.mh;
import lc.u0;
import p005kotlin.Unit;
import p3.x1;
import s5.x0;
import v62.e1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class l implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f144007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d90.f f144008b;

    public /* synthetic */ l(d90.f fVar, int i14) {
        this.f144007a = i14;
        this.f144008b = fVar;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f144007a;
        d90.f fVar = this.f144008b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((a0) obj).getClass();
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = p3.n.f135158a;
                    if (fVar instanceof d90.f.d) {
                        mVar.C(-1629008024);
                        mVar.f();
                    } else {
                        mVar.C(-1629338918);
                        String strQ = y.Q(mVar, R.string.msg_occasional_software_updates);
                        h4.r rVarF = x2.f(h4.r.S, 1.0f);
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        h4.r rVarC = c2.l.C(rVarF, 0.0f, j92.b.f97899b.f97921f, 0.0f, 0.0f, 13);
                        d92.b.f58624b.getClass();
                        x0 x0VarB = d92.c.b(j92.f.f97931h, mVar);
                        d6.h.f57752b.getClass();
                        mh.c(strQ, rVarC, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB, mVar, 0, 0, 130044);
                        mVar = mVar;
                        mVar.f();
                    }
                    s62.a.f157643a.getClass();
                    u4.d dVarA = e1.a(t62.b.f162798a);
                    h4.r.a aVar = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    i7.b(dVarA, null, x2.q(c2.l.C(aVar, 0.0f, j92.b.f97899b.f97923h, 0.0f, 0.0f, 13), j92.b.f97901d.f97907f), u0.f(mVar), mVar, 48, 0);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((a0) obj).getClass();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x1 x1Var2 = p3.n.f135158a;
                    if (fVar instanceof d90.f.d) {
                        mVar2.C(-1397072958);
                        mVar2.f();
                    } else {
                        mVar2.C(-1397398086);
                        String strQ2 = y.Q(mVar2, R.string.software_update_sent_body);
                        h4.r rVarF2 = x2.f(h4.r.S, 1.0f);
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        h4.r rVarC2 = c2.l.C(rVarF2, 0.0f, j92.b.f97899b.f97921f, 0.0f, 0.0f, 13);
                        d92.b.f58624b.getClass();
                        x0 x0VarB2 = d92.c.b(j92.f.f97931h, mVar2);
                        d6.h.f57752b.getClass();
                        mh.c(strQ2, rVarC2, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB2, mVar2, 0, 0, 130044);
                        mVar2 = mVar2;
                        mVar2.f();
                    }
                    s62.a.f157643a.getClass();
                    u4.d dVarA2 = e1.a(t62.b.f162798a);
                    h4.r.a aVar2 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    i7.b(dVarA2, null, x2.q(c2.l.C(aVar2, 0.0f, j92.b.f97899b.f97923h, 0.0f, 0.0f, 13), j92.b.f97901d.f97907f), u0.f(mVar2), mVar2, 48, 0);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}

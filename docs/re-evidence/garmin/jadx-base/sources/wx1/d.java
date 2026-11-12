package wx1;

import c2.c1;
import c2.t0;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import ds.e0;
import e2.i0;
import gl1.y;
import i3.mh;
import o53.b0;
import p005kotlin.Unit;
import p3.p1;
import p3.x1;
import s5.x0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class d implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f187923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dy1.p f187924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1 f187925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b0 f187926d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i0 f187927e;

    public /* synthetic */ d(dy1.p pVar, p1 p1Var, b0 b0Var, i0 i0Var, int i14) {
        this.f187923a = i14;
        this.f187924b = pVar;
        this.f187925c = p1Var;
        this.f187926d = b0Var;
        this.f187927e = i0Var;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00cd  */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        p3.m mVar;
        switch (this.f187923a) {
            case 0:
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((e2.d) obj).getClass();
                if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = p3.n.f135158a;
                    h4.r.a aVar = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar = j92.b.f97899b;
                    h4.r rVarC = c2.l.C(c2.l.A(aVar, eVar.f97921f, 0.0f, 2), 0.0f, eVar.f97920e, 0.0f, eVar.f97918c, 5);
                    String strQ = y.Q(mVar2, R.string.lbl_stp_confirm_weekly_training_schedule);
                    d92.b.f58624b.getClass();
                    x0 x0VarB = d92.c.b(j92.f.f97931h, mVar2);
                    d6.h.f57752b.getClass();
                    mh.c(strQ, rVarC, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB, mVar2, 0, 0, 130044);
                    h4.r rVarC2 = c2.l.C(c2.l.A(x2.f(aVar, 1.0f), eVar.f97921f, 0.0f, 2), 0.0f, 0.0f, 0.0f, eVar.f97921f, 7);
                    c2.j.f22691a.getClass();
                    c2.j.c cVar = c2.j.f22696f;
                    t0.a(rVarC2, cVar, cVar, null, 0, 0, z3.f.c(406758621, new d(this.f187924b, this.f187925c, this.f187926d, this.f187927e, 1), mVar2), mVar2, 1573296, 56);
                } else {
                    mVar2.e();
                }
                break;
            default:
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((c1) obj).getClass();
                if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x1 x1Var2 = p3.n.f135158a;
                    String strB = this.f187924b.b(mVar3);
                    if (strB == null) {
                        mVar3.C(1643431707);
                        mVar3.f();
                        mVar = mVar3;
                    } else {
                        mVar3.C(1643431708);
                        h4.r.a aVar2 = h4.r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        h4.r rVarC3 = c2.l.C(aVar2, 0.0f, 0.0f, j92.b.f97899b.f97917b, 0.0f, 11);
                        String strP = y.P(R.string.lbl_stp_plan_starts_on_date, new Object[]{strB}, mVar3);
                        d92.b.f58624b.getClass();
                        x0 x0VarF = d92.c.f(j92.f.f97932i, mVar3);
                        d6.h.f57752b.getClass();
                        mh.c(strP, rVarC3, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarF, mVar3, 0, 0, 130044);
                        mVar = mVar3;
                        mVar.f();
                    }
                    h4.r.a aVar3 = h4.r.S;
                    p1 p1Var = this.f187925c;
                    boolean zB = mVar.B(p1Var);
                    b0 b0Var = this.f187926d;
                    boolean zR = zB | mVar.r(b0Var);
                    i0 i0Var = this.f187927e;
                    boolean zB2 = zR | mVar.B(i0Var);
                    Object objQ = mVar.q();
                    if (zB2) {
                        objQ = new b(b0Var, p1Var, i0Var, 0);
                        mVar.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new b(b0Var, p1Var, i0Var, 0);
                            mVar.K(objQ);
                        }
                    }
                    h4.r rVarD = u1.w.d(aVar3, false, null, null, (e23.a) objQ, 15);
                    String strQ2 = y.Q(mVar, R.string.lbl_edit_start_date);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(strQ2, rVarD, e0.e(mVar), null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, j92.f.f97932i, mVar, 0, 0, 131064);
                } else {
                    mVar3.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}

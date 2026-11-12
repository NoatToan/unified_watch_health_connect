package t70;

import c2.t2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import i3.i7;
import i3.mh;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class d0 implements e23.q<t2, p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f162831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c1 f162832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l0 f162833c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f162834d;

    public d0(float f14, c1 c1Var, l0 l0Var, int i14) {
        this.f162831a = f14;
        this.f162832b = c1Var;
        this.f162833c = l0Var;
        this.f162834d = i14;
    }

    @Override // e23.q
    public final Unit invoke(t2 t2Var, p3.m mVar, Integer num) {
        String strB;
        t2 t2Var2 = t2Var;
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        t2Var2.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar2.B(t2Var2) ? 4 : 2;
        }
        if (mVar2.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            j92.c cVar = j92.b.f97901d;
            float f14 = cVar.f97904c * this.f162831a;
            g6.f.a aVar2 = g6.f.f75994b;
            h4.r rVarQ = x2.q(aVar, f14);
            Object objQ = mVar2.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = b0.f162809a;
                mVar2.K(objQ);
            }
            h4.r rVarB = p5.v.b(rVarQ, (e23.l) objQ);
            c1 c1Var = this.f162832b;
            boolean zB = mVar2.B(c1Var);
            l0 l0Var = this.f162833c;
            boolean zR = zB | mVar2.r(l0Var);
            Object objQ2 = mVar2.q();
            if (zR || objQ2 == c2565a) {
                objQ2 = new c0(c1Var, l0Var);
                mVar2.K(objQ2);
            }
            h4.r rVarD = u1.w.d(rVarB, false, null, null, (e23.a) objQ2, 15);
            t4.d dVarA = n5.c.a(this.f162834d, mVar2, 0);
            o4.d0.f128823b.getClass();
            i7.a(dVarA, null, rVarD, o4.d0.f128832k, mVar2, 3120, 0);
            c1.b bVar = (c1.b) c1Var;
            o70.r rVar = bVar.f162822b;
            if (rVar instanceof o70.c) {
                mVar2.C(2088841177);
                o70.c cVar2 = (o70.c) rVar;
                l22.a aVarS = w2.a0.s(mVar2);
                cVar2.getClass();
                strB = gl1.y.P(R.string.lbl_activity_name_trends, new Object[]{aVarS.getString(cVar2.e())}, mVar2);
                mVar2.f();
            } else {
                mVar2.C(2089177248);
                strB = rVar.b(w2.a0.s(mVar2));
                mVar2.f();
            }
            d92.b.f58624b.getClass();
            s5.x0 x0VarB = d92.c.b(j92.f.f97931h, mVar2);
            float f15 = j92.b.f97899b.f97920e;
            mh.c(strB, t2Var2.a(c2.l.C(aVar, f15, 0.0f, f15, 0.0f, 10), 1.0f, true), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, mVar2, 0, 0, 131068);
            if (bVar.f162823c) {
                mVar2.C(2089919915);
                i7.a(n5.c.a(R.drawable.ic_drag, mVar2, 0), "", x2.q(aVar, cVar.f97904c), lc.u0.f(mVar2), mVar2, 48, 0);
                mVar2.f();
            } else {
                mVar2.C(2090419852);
                mVar2.f();
            }
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}

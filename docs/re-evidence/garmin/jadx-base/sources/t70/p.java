package t70;

import c2.t2;
import c2.x2;
import c22.g2;
import com.garmin.android.apps.connectmobile.R;
import i3.i7;
import i3.mh;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class p implements e23.q<t2, p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f162940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b1 f162941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f162942c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f162943d;

    public p(float f14, b1 b1Var, q qVar, int i14) {
        this.f162940a = f14;
        this.f162941b = b1Var;
        this.f162942c = qVar;
        this.f162943d = i14;
    }

    @Override // e23.q
    public final Unit invoke(t2 t2Var, p3.m mVar, Integer num) {
        String string;
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
            float f14 = cVar.f97904c * this.f162940a;
            g6.f.a aVar2 = g6.f.f75994b;
            h4.r rVarQ = x2.q(aVar, f14);
            Object objQ = mVar2.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = n.f162932a;
                mVar2.K(objQ);
            }
            h4.r rVarB = p5.v.b(rVarQ, (e23.l) objQ);
            b1 b1Var = this.f162941b;
            boolean zB = mVar2.B(b1Var);
            q qVar = this.f162942c;
            boolean zR = zB | mVar2.r(qVar);
            Object objQ2 = mVar2.q();
            if (zR || objQ2 == c2565a) {
                objQ2 = new o(b1Var, qVar);
                mVar2.K(objQ2);
            }
            h4.r rVarD = u1.w.d(rVarB, false, null, null, (e23.a) objQ2, 15);
            t4.d dVarA = n5.c.a(this.f162943d, mVar2, 0);
            o4.d0.f128823b.getClass();
            i7.a(dVarA, null, rVarD, o4.d0.f128832k, mVar2, 3120, 0);
            b1.a aVar3 = (b1.a) b1Var;
            o70.i iVar = aVar3.f162811b;
            l22.a aVarS = w2.a0.s(mVar2);
            o70.i.a aVar4 = o70.i.f129998f;
            iVar.getClass();
            o70.i.b bVarC = iVar.c();
            int i14 = bVarC != null ? bVarC.f130017a : iVar.f130008b;
            if (i14 == 0) {
                String str = iVar.f130010d;
                if (str != null) {
                    string = dh.b.A(aVarS.f109162a, g2.b(str));
                } else {
                    string = "";
                }
            } else {
                string = aVarS.getString(i14);
            }
            d92.b.f58624b.getClass();
            s5.x0 x0VarB = d92.c.b(j92.f.f97931h, mVar2);
            float f15 = j92.b.f97899b.f97920e;
            mh.c(string, t2Var2.a(c2.l.C(aVar, f15, 0.0f, f15, 0.0f, 10), 1.0f, true), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, mVar2, 0, 0, 131068);
            if (aVar3.f162812c) {
                mVar2.C(-1053866121);
                i7.a(n5.c.a(R.drawable.ic_drag, mVar2, 0), "", x2.q(aVar, cVar.f97904c), lc.u0.f(mVar2), mVar2, 48, 0);
                mVar2.f();
            } else {
                mVar2.C(-1053366184);
                mVar2.f();
            }
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}

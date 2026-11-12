package s70;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import p005kotlin.Metadata;
import p3.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ls70/c1;", "Lr70/r;", "Ly70/p;", "stateHolder", "Ln70/g;", "dashboardDelegate", "<init>", "(Ly70/p;Ln70/g;)V", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c1 implements r70.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y70.p f157673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n70.g f157674b;

    public c1(y70.p pVar, n70.g gVar) {
        pVar.getClass();
        gVar.getClass();
        this.f157673a = pVar;
        this.f157674b = gVar;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0088  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d1  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // r70.r
    public final void a(h4.r rVar, r70.q qVar, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0VarQ = lc.u0.q(rVar, qVar, mVar, 1121672692);
        if ((i14 & 6) == 0) {
            i15 = (o0VarQ.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarQ.r(this) ? 256 : 128;
        }
        if (o0VarQ.n(i15 & 1, (i15 & 131) != 130)) {
            p3.x1 x1Var = p3.n.f135158a;
            boolean zBooleanValue = ((Boolean) p3.p0.b((r53.i) this.f157673a.f194677b.getValue(), Boolean.FALSE, null, o0VarQ, 48, 2).getF182175a()).booleanValue();
            Context context = (Context) o0VarQ.A(AndroidCompositionLocals_androidKt.f6042b);
            if (zBooleanValue) {
                o0VarQ.C(2025234763);
                boolean zR = o0VarQ.r(this);
                Object objQ = o0VarQ.q();
                p3.m.a aVar = p3.m.f135153a;
                if (zR) {
                    objQ = new ro0.g(this, 15);
                    o0VarQ.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new ro0.g(this, 15);
                        o0VarQ.K(objQ);
                    }
                }
                e23.a aVar2 = (e23.a) objQ;
                d92.b.f58623a.getClass();
                j92.b bVar = d92.b.f58625c;
                bVar.getClass();
                j92.e eVar = j92.b.f97899b;
                float f14 = eVar.f97920e;
                bVar.getClass();
                float f15 = eVar.f97920e;
                bVar.getClass();
                h4.r rVarC = c2.l.C(rVar, f14, eVar.f97920e, f15, 0.0f, 8);
                boolean zB = o0VarQ.B(aVar2) | o0VarQ.r(this) | o0VarQ.r(context);
                Object objQ2 = o0VarQ.q();
                if (zB) {
                    objQ2 = new q42.v(aVar2, 25, this, context);
                    o0VarQ.K(objQ2);
                } else {
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new q42.v(aVar2, 25, this, context);
                        o0VarQ.K(objQ2);
                    }
                }
                d1.a(0, aVar2, u1.w.d(rVarC, false, null, null, (e23.a) objQ2, 15), o0VarQ);
                o0VarQ.g0(false);
            } else {
                o0VarQ.C(2025916112);
                o0VarQ.g0(false);
            }
        } else {
            o0VarQ.e();
        }
        p2 p2VarI0 = o0VarQ.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n(this, rVar, qVar, i14, 10);
        }
    }
}

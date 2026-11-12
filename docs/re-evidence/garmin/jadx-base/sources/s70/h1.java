package s70;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import p005kotlin.Metadata;
import p3.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ls70/h1;", "Lr70/r;", "Ly70/r;", "stateHolder", "<init>", "(Ly70/r;)V", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h1 implements r70.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y70.r f157706a;

    public h1(y70.r rVar) {
        rVar.getClass();
        this.f157706a = rVar;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00af  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // r70.r
    public final void a(h4.r rVar, r70.q qVar, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0VarQ = lc.u0.q(rVar, qVar, mVar, -1452451688);
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
            Context context = (Context) o0VarQ.A(AndroidCompositionLocals_androidKt.f6042b);
            az0.c.a aVar = (az0.c.a) s9.c.b(this.f157706a.f194679a, null, o0VarQ, 48).getF182175a();
            if (aVar == null) {
                o0VarQ.C(1807512444);
                o0VarQ.g0(false);
            } else {
                o0VarQ.C(1807512445);
                if (aVar != az0.c.a.Available) {
                    o0VarQ.C(-1743173527);
                    d92.b.f58623a.getClass();
                    j92.b bVar = d92.b.f58625c;
                    bVar.getClass();
                    j92.e eVar = j92.b.f97899b;
                    float f14 = eVar.f97920e;
                    bVar.getClass();
                    float f15 = eVar.f97920e;
                    bVar.getClass();
                    h4.r rVarC = c2.l.C(rVar, f14, eVar.f97920e, f15, 0.0f, 8);
                    boolean zR = o0VarQ.r(context);
                    Object objQ = o0VarQ.q();
                    if (zR) {
                        objQ = new r(context, 5);
                        o0VarQ.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new r(context, 5);
                            o0VarQ.K(objQ);
                        }
                    }
                    i1.a(u1.w.d(rVarC, false, null, null, (e23.a) objQ, 15), o0VarQ, 0);
                    o0VarQ.g0(false);
                } else {
                    o0VarQ.C(-1741939603);
                    o0VarQ.g0(false);
                }
                o0VarQ.g0(false);
            }
        } else {
            o0VarQ.e();
        }
        p2 p2VarI0 = o0VarQ.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n(this, rVar, qVar, i14, 12);
        }
    }
}

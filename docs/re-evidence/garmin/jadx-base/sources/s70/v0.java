package s70;

import android.app.Activity;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p3.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ls70/v0;", "Lr70/r;", "Ly70/l;", "stateHolder", "<init>", "(Ly70/l;)V", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class v0 implements r70.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y70.l f157811a;

    public v0(y70.l lVar) {
        lVar.getClass();
        this.f157811a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // r70.r
    public final void a(h4.r rVar, r70.q qVar, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0VarQ = lc.u0.q(rVar, qVar, mVar, -176574824);
        int i16 = 2;
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
            Object objQ = o0VarQ.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = (zd0.u1) KoinJavaComponent.get$default(zd0.u1.class, null, null, 6, null);
                o0VarQ.K(objQ);
            }
            zd0.u1 u1Var = (zd0.u1) objQ;
            g.h hVar = new g.h();
            boolean zR = o0VarQ.r(this);
            Object objQ2 = o0VarQ.q();
            if (zR || objQ2 == c2565a) {
                objQ2 = new b0(this, i16);
                o0VarQ.K(objQ2);
            }
            c.q qVarC = c.w.c(hVar, (e23.l) objQ2, o0VarQ, 0);
            Boolean bool = (Boolean) s9.c.b((r53.i) this.f157811a.f194669b.getValue(), null, o0VarQ, 48).getF182175a();
            if (bool == null) {
                o0VarQ.C(995014970);
                o0VarQ.g0(false);
            } else {
                o0VarQ.C(995014971);
                boolean zBooleanValue = bool.booleanValue();
                Activity activity = (Activity) o0VarQ.A(c.n.f22332a);
                if (zBooleanValue) {
                    o0VarQ.C(1571753755);
                    boolean zR2 = o0VarQ.r(this);
                    Object objQ3 = o0VarQ.q();
                    if (zR2 || objQ3 == c2565a) {
                        objQ3 = new ro0.g(this, 14);
                        o0VarQ.K(objQ3);
                    }
                    e23.a aVar = (e23.a) objQ3;
                    d92.b.f58623a.getClass();
                    j92.b bVar = d92.b.f58625c;
                    bVar.getClass();
                    j92.e eVar = j92.b.f97899b;
                    float f14 = eVar.f97920e;
                    bVar.getClass();
                    float f15 = eVar.f97920e;
                    bVar.getClass();
                    h4.r rVarC = c2.l.C(rVar, f14, eVar.f97920e, f15, 0.0f, 8);
                    boolean zR3 = o0VarQ.r(activity) | o0VarQ.r(qVarC) | o0VarQ.r(u1Var);
                    Object objQ4 = o0VarQ.q();
                    if (zR3 || objQ4 == c2565a) {
                        objQ4 = new q42.v(activity, 24, qVarC, u1Var);
                        o0VarQ.K(objQ4);
                    }
                    w0.a(0, aVar, u1.w.d(rVarC, false, null, null, (e23.a) objQ4, 15), o0VarQ);
                    o0VarQ.g0(false);
                } else {
                    o0VarQ.C(1573769933);
                    o0VarQ.g0(false);
                }
                o0VarQ.g0(false);
            }
        } else {
            o0VarQ.e();
        }
        p2 p2VarI0 = o0VarQ.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n(this, rVar, qVar, i14, 8);
        }
    }
}

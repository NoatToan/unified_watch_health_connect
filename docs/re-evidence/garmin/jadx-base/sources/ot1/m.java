package ot1;

import androidx.room.a0;
import i3.fe;
import lc.m0;
import p005kotlin.Metadata;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lot1/m;", "Lot1/a;", "<init>", "()V", "Lus1/n;", "savedTrailsFiltersState", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f133805a = new m();

    private m() {
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0042  */
    /* JADX WARN: Code duplicated, block: B:17:0x0065  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ot1.a
    public final void a(lc.v vVar, m0 m0Var, fe feVar, p3.m mVar, int i14) {
        o0 o0VarQ = a0.q(vVar, m0Var, mVar, 1704933665);
        int i15 = i14 & 1;
        int i16 = 1;
        if (o0VarQ.n(i15, i15 != 0)) {
            x1 x1Var = p3.n.f135158a;
            qt1.a aVarG0 = gl1.d.g0(o0VarQ);
            p1 p1VarC = s9.c.c(aVarG0.B, o0VarQ);
            b.u uVar = (b.u) o0VarQ.A(g02.d.f74342a);
            us1.n nVar = (us1.n) p1VarC.getF182175a();
            boolean zR = o0VarQ.r(uVar);
            Object objQ = o0VarQ.q();
            p3.m.a aVar = p3.m.f135153a;
            if (zR) {
                objQ = new ak0.i(uVar, 27);
                o0VarQ.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new ak0.i(uVar, 27);
                    o0VarQ.K(objQ);
                }
            }
            e23.a aVar2 = (e23.a) objQ;
            boolean zR2 = o0VarQ.r(aVarG0) | o0VarQ.r(uVar);
            Object objQ2 = o0VarQ.q();
            if (zR2) {
                objQ2 = new f(aVarG0, uVar, i16);
                o0VarQ.K(objQ2);
            } else {
                aVar.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new f(aVarG0, uVar, i16);
                    o0VarQ.K(objQ2);
                }
            }
            et1.h.a(nVar, false, aVar2, (e23.l) objQ2, o0VarQ, 0);
        } else {
            o0VarQ.e();
        }
        p2 p2VarI0 = o0VarQ.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i(this, vVar, m0Var, feVar, i14, 1);
        }
    }
}

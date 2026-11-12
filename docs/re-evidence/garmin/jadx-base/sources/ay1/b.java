package ay1;

import a03.g;
import a42.d;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.room.a0;
import ao1.i;
import e23.l;
import ey1.j;
import i3.fe;
import lc.m0;
import lc.v;
import p005kotlin.Metadata;
import p3.m;
import p3.n;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\n²\u0006\u000e\u0010\u0007\u001a\u0004\u0018\u00010\u00068\nX\u008a\u0084\u0002²\u0006\f\u0010\t\u001a\u00020\b8\nX\u008a\u0084\u0002"}, d2 = {"Lay1/b;", "Lzx1/a;", "", "planId", "<init>", "(J)V", "Ldy1/c;", "benchmarksState", "", "isDataLoading", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends zx1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13657a;

    public b(long j8) {
        this.f13657a = j8;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:56:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:61:0x011c  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // zx1.a
    public final void a(v vVar, m0 m0Var, fe feVar, m mVar, int i14) {
        int i15;
        o0 o0VarQ = a0.q(vVar, m0Var, mVar, -684711539);
        if ((i14 & 48) == 0) {
            i15 = (o0VarQ.r(m0Var) ? 32 : 16) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarQ.B(feVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarQ.B(this) ? 2048 : 1024;
        }
        int i16 = 0;
        int i17 = 1;
        if (o0VarQ.n(i15 & 1, (i15 & 1169) != 1168)) {
            x1 x1Var = n.f135158a;
            j jVarP = zf.b.P(this.f13657a, o0VarQ, 0);
            p1 p1VarC = s9.c.c(jVarP.F, o0VarQ);
            p1 p1VarC2 = s9.c.c(jVarP.D, o0VarQ);
            Context context = (Context) o0VarQ.A(AndroidCompositionLocals_androidKt.f6042b);
            dy1.c cVar = (dy1.c) p1VarC.getF182175a();
            if (feVar != null && cVar != null) {
                boolean zBooleanValue = ((Boolean) p1VarC2.getF182175a()).booleanValue();
                boolean zR = o0VarQ.r(context) | o0VarQ.B(cVar);
                Object objQ = o0VarQ.q();
                m.a aVar = m.f135153a;
                if (zR) {
                    objQ = new i(3, context, cVar);
                    o0VarQ.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new i(3, context, cVar);
                        o0VarQ.K(objQ);
                    }
                }
                e23.a aVar2 = (e23.a) objQ;
                boolean zR2 = ((i15 & 7168) == 2048) | o0VarQ.r(context);
                Object objQ2 = o0VarQ.q();
                if (zR2) {
                    objQ2 = new d(context, this);
                    o0VarQ.K(objQ2);
                } else {
                    aVar.getClass();
                    if (objQ2 == m.a.f135155b) {
                        objQ2 = new d(context, this);
                        o0VarQ.K(objQ2);
                    }
                }
                e23.a aVar3 = (e23.a) objQ2;
                boolean zR3 = o0VarQ.r(m0Var);
                Object objQ3 = o0VarQ.q();
                if (zR3) {
                    objQ3 = new aa2.m(m0Var, i17);
                    o0VarQ.K(objQ3);
                } else {
                    aVar.getClass();
                    if (objQ3 == m.a.f135155b) {
                        objQ3 = new aa2.m(m0Var, i17);
                        o0VarQ.K(objQ3);
                    }
                }
                e23.a aVar4 = (e23.a) objQ3;
                boolean zR4 = o0VarQ.r(jVarP);
                Object objQ4 = o0VarQ.q();
                if (zR4) {
                    objQ4 = new a(jVarP, i16);
                    o0VarQ.K(objQ4);
                } else {
                    aVar.getClass();
                    if (objQ4 == m.a.f135155b) {
                        objQ4 = new a(jVarP, i16);
                        o0VarQ.K(objQ4);
                    }
                }
                l lVar = (l) objQ4;
                boolean zR5 = o0VarQ.r(jVarP) | o0VarQ.r(m0Var);
                Object objQ5 = o0VarQ.q();
                if (zR5) {
                    objQ5 = new i(4, jVarP, m0Var);
                    o0VarQ.K(objQ5);
                } else {
                    aVar.getClass();
                    if (objQ5 == m.a.f135155b) {
                        objQ5 = new i(4, jVarP, m0Var);
                        o0VarQ.K(objQ5);
                    }
                }
                ux1.d.a(feVar, cVar, zBooleanValue, aVar2, aVar3, aVar4, lVar, (e23.a) objQ5, o0VarQ, 0);
            }
        } else {
            o0VarQ.e();
        }
        p2 p2VarI0 = o0VarQ.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g(this, vVar, m0Var, feVar, i14, 7);
        }
    }
}

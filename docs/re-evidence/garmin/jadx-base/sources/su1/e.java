package su1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.l;
import g6.f;
import h4.r;
import oz1.s;
import oz1.u;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import rz1.h;
import tz1.j;

/* JADX INFO: loaded from: classes10.dex */
public final class e {
    /* JADX WARN: Code duplicated, block: B:34:0x00c8  */
    public static final void a(r rVar, oz1.b bVar, m mVar, int i14) {
        int i15;
        h hVar;
        o0 o0VarE = mVar.E(-1298992957);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(bVar) : o0VarE.r(bVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            if (bVar != null) {
                s.a aVar = s.f134612d;
                String feedbackShort = bVar.getFeedbackShort();
                aVar.getClass();
                s sVarA = s.a.a(feedbackShort);
                u.a aVar2 = u.f134627e;
                String level = bVar.getLevel();
                aVar2.getClass();
                hVar = new h(new yz1.d(yz1.u.SUCCESS, null, false), bVar.getScore(), u.a.a(level), sVarA, bVar.getValidSleep(), null, null, null, null, 480, null);
            } else {
                hVar = new h(new yz1.d(yz1.u.SUCCESS, null, false, 4, null), null, null, null, null, null, Boolean.FALSE, null, null, 416, null);
            }
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            f.a aVar3 = f.f75994b;
            r rVarY = l.y(rVar, 0);
            boolean zR = o0VarE.r(context);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new s70.r(context, 15);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new s70.r(context, 15);
                    o0VarE.K(objQ);
                }
            }
            j.a(rVarY, hVar, (e23.a) objQ, o0VarE, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new sg0.m(rVar, bVar, i14, 5);
        }
    }
}

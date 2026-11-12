package wl;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b.u;
import e23.l;
import n82.j;
import o82.g;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.q;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import w51.n0;
import yl.f;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class a extends q implements e23.a<Unit> {
        public a(Object obj) {
            super(0, obj, u.class, "onBackPressed", "onBackPressed()V", 0);
        }

        @Override // e23.a
        public final Unit invoke() {
            ((u) this.receiver).d();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(u82.d<o82.a, f> dVar, e23.a<Unit> aVar, l<? super Long, Unit> lVar, m mVar, int i14) {
        dVar.getClass();
        aVar.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(-1024291649);
        int i15 = i14 | (o0VarE.B(dVar) ? 4 : 2) | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = i53.a.a(g.f130851d, g.f130853f);
                o0VarE.K(objQ);
            }
            i53.f fVar = (i53.f) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new n82.f.a((g) fVar.get(0), null, null, 6, null);
                o0VarE.K(objQ2);
            }
            n82.f fVarA = j.a((n82.f.a) objQ2, null, o0VarE, 2);
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = new yd1.a(context);
                o0VarE.K(objQ3);
            }
            z02.d.a(false, z3.f.c(-1020696678, new n0(aVar, 6), o0VarE), null, null, null, z3.f.c(1874137878, new sg2.g(fVar, fVarA, (yd1.a) objQ3, dVar, lVar, 29), o0VarE), o0VarE, 196656, 29);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new vx1.b(dVar, aVar, lVar, i14, 15);
        }
    }
}

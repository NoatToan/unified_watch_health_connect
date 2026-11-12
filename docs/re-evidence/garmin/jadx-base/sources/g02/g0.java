package g02;

import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p2;

/* JADX INFO: loaded from: classes10.dex */
public final class g0 {

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"g02/g0$a", "Lp3/h0;", "runtime"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements p3.h0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.lifecycle.b0 f74387a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ androidx.lifecycle.k0 f74388b;

        public a(androidx.lifecycle.b0 b0Var, androidx.lifecycle.k0 k0Var) {
            this.f74387a = b0Var;
            this.f74388b = k0Var;
        }

        @Override // p3.h0
        public final void dispose() {
            this.f74387a.d(this.f74388b);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0052  */
    public static final void a(e23.p<? super androidx.lifecycle.n0, ? super androidx.lifecycle.b0.a, Unit> pVar, p3.m mVar, int i14) {
        pVar.getClass();
        p3.o0 o0VarE = mVar.E(450525449);
        int i15 = (o0VarE.r(pVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            p3.p1 p1VarQ = p3.p0.q(pVar, o0VarE);
            p3.p1 p1VarQ2 = p3.p0.q(o0VarE.A(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner()), o0VarE);
            T f182175a = p1VarQ2.getF182175a();
            boolean zB = o0VarE.B(p1VarQ2) | o0VarE.B(p1VarQ);
            Object objQ = o0VarE.q();
            if (zB) {
                objQ = new am.c1(p1VarQ2, p1VarQ, 7);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new am.c1(p1VarQ2, p1VarQ, 7);
                    o0VarE.K(objQ);
                }
            }
            p3.l0.a(f182175a, (e23.l) objQ, o0VarE);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a3.d(pVar, i14, 15);
        }
    }
}

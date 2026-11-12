package v70;

import com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardRoute;
import com.garmin.android.apps.connectmobile.dashboard.presentation.d;
import e23.l;
import kotlin.t1;
import lc.m0;
import lc.v0;
import lc.y;
import n70.g;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.h0;
import p3.l0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import qc.h;
import r70.z;
import t70.q;
import tn2.s0;
import u70.i;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"v70/c$a", "Lp3/h0;", "runtime"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements h0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m0 f176121a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ y.c f176122b;

        public a(m0 m0Var, y.c cVar) {
            this.f176121a = m0Var;
            this.f176122b = cVar;
        }

        @Override // p3.h0
        public final void dispose() {
            m0 m0Var = this.f176121a;
            m0Var.getClass();
            y.c cVar = this.f176122b;
            cVar.getClass();
            h hVar = m0Var.f111904b;
            hVar.getClass();
            hVar.f144330q.remove(cVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:66:0x0148  */
    public static final void a(DashboardRoute dashboardRoute, d dVar, z zVar, q qVar, i iVar, g gVar, l<? super com.garmin.android.apps.connectmobile.dashboard.presentation.c, Unit> lVar, e23.a<Unit> aVar, l<? super Boolean, Unit> lVar2, m mVar, int i14) {
        m0 m0Var;
        dashboardRoute.getClass();
        dVar.getClass();
        zVar.getClass();
        qVar.getClass();
        iVar.getClass();
        gVar.getClass();
        lVar.getClass();
        aVar.getClass();
        lVar2.getClass();
        o0 o0VarE = mVar.E(-1312316938);
        int i15 = (o0VarE.r(aVar) ? 8388608 : 4194304) | i14 | (o0VarE.B(dashboardRoute) ? 4 : 2) | (o0VarE.r(dVar) ? 32 : 16) | (o0VarE.r(zVar) ? 256 : 128) | (o0VarE.r(qVar) ? 2048 : 1024) | (o0VarE.r(iVar) ? 16384 : 8192) | (o0VarE.B(gVar) ? 131072 : 65536) | (o0VarE.r(lVar) ? 1048576 : 524288);
        if (o0VarE.n(i15 & 1, (38347923 & i15) != 38347922)) {
            x1 x1Var = n.f135158a;
            w4.a aVar2 = (w4.a) o0VarE.A(t1.f91494l);
            m0 m0VarI = gl1.y.I(new v0[0], o0VarE);
            Unit unit = Unit.INSTANCE;
            boolean zR = o0VarE.r(dVar) | o0VarE.r(m0VarI);
            Object objQ = o0VarE.q();
            m.a aVar3 = m.f135153a;
            if (zR) {
                objQ = new s0(m0VarI, 12, lVar2, dVar);
                o0VarE.K(objQ);
            } else {
                aVar3.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new s0(m0VarI, 12, lVar2, dVar);
                    o0VarE.K(objQ);
                }
            }
            l0.a(unit, (l) objQ, o0VarE);
            boolean zR2 = o0VarE.r(dVar) | ((i15 & 3670016) == 1048576) | o0VarE.r(m0VarI) | o0VarE.r(iVar) | ((i15 & 29360128) == 8388608) | ((i15 & 14) == 4) | o0VarE.r(zVar) | o0VarE.r(aVar2) | o0VarE.r(qVar) | ((i15 & 458752) == 131072);
            Object objQ2 = o0VarE.q();
            if (zR2) {
                av0.c cVar = new av0.c(dVar, lVar, m0VarI, iVar, aVar, dashboardRoute, zVar, aVar2, qVar, gVar);
                m0Var = m0VarI;
                o0VarE.K(cVar);
                objQ2 = cVar;
            } else {
                aVar3.getClass();
                if (objQ2 == m.a.f135155b) {
                    av0.c cVar2 = new av0.c(dVar, lVar, m0VarI, iVar, aVar, dashboardRoute, zVar, aVar2, qVar, gVar);
                    m0Var = m0VarI;
                    o0VarE.K(cVar2);
                    objQ2 = cVar2;
                } else {
                    m0Var = m0VarI;
                }
            }
            DashboardRoute.Companion companion = DashboardRoute.INSTANCE;
            nc.y.a(m0Var, dashboardRoute, null, null, null, null, null, null, null, (l) objQ2, o0VarE, (i15 << 3) & 112, 2044);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c42.d(dashboardRoute, dVar, zVar, qVar, iVar, gVar, lVar, aVar, lVar2, i14, 21);
        }
    }
}

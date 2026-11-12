package s70;

import androidx.lifecycle.ViewModelStoreOwner;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardRoute;
import i3.fe;
import i3.yd;
import java.util.List;
import l72.i3;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p2;

/* JADX INFO: loaded from: classes8.dex */
public final class p1 {

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"s70/p1$a", "Lr70/q;", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements r70.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l<DashboardRoute, Unit> f157775a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o53.b0 f157776b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ fe f157777c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(e23.l<? super DashboardRoute, Unit> lVar, o53.b0 b0Var, fe feVar) {
            this.f157775a = lVar;
            this.f157776b = b0Var;
            this.f157777c = feVar;
        }

        @Override // r70.q
        public final void a(DashboardRoute dashboardRoute) {
            dashboardRoute.getClass();
            this.f157775a.invoke(dashboardRoute);
        }

        @Override // r70.q
        public final void b(String str, yd ydVar, qv1.l lVar) {
            str.getClass();
            ydVar.getClass();
            ge1.b.T(this.f157776b, null, null, new o1(lVar, this.f157777c, str, null, false, ydVar, null), 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(r70.x xVar, fe feVar, e23.l<? super DashboardRoute, Unit> lVar, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0VarE = mVar.E(2106651121);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(xVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(feVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(lVar) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            p3.x1 x1Var = p3.n.f135158a;
            p3.p1 p1VarC = s9.c.c(xVar.f151112b, o0VarE);
            p3.p1 p1VarB = s9.c.b(xVar.f151111a, Boolean.TRUE, o0VarE, 48);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = p3.l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ);
            }
            a aVar = new a(lVar, (o53.b0) objQ, feVar);
            h4.r rVarB = u1.a2.b(h4.r.S, u1.a2.a(o0VarE), true);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarD = x2.d(c2.l.y(rVarB, eVar.f97920e), 1.0f);
            c2.j jVar = c2.j.f22691a;
            bVar.getClass();
            float f14 = eVar.f97918c;
            jVar.getClass();
            c2.j.i iVarI = c2.j.i(f14);
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(iVarI, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarD, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            l1.a((List) p1VarC.getF182175a(), ((Boolean) p1VarB.getF182175a()).booleanValue(), aVar, o0VarE, 0);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n(xVar, feVar, lVar, i14, 14);
        }
    }

    public static final void b(r70.x xVar, e23.l lVar, e23.a aVar, e23.l lVar2, p3.m mVar, int i14) {
        r70.x xVar2;
        int i15;
        lVar.getClass();
        aVar.getClass();
        lVar2.getClass();
        p3.o0 o0VarE = mVar.E(953511588);
        int i16 = i14 | 2 | (o0VarE.r(lVar) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128) | (o0VarE.r(lVar2) ? 2048 : 1024);
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                o0VarE.L(-1614864554);
                v9.a.f176280a.getClass();
                ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(o0VarE);
                if (viewModelStoreOwnerA == null) {
                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                androidx.lifecycle.u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(p005kotlin.jvm.internal.s0.f105811a.b(r70.x.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(o0VarE, 0), null);
                o0VarE.g0(false);
                xVar2 = (r70.x) u1VarResolveViewModel;
                i15 = i16 & (-15);
            } else {
                o0VarE.e();
                i15 = i16 & (-15);
                xVar2 = xVar;
            }
            o0VarE.h0();
            p3.x1 x1Var = p3.n.f135158a;
            og.a.k(gl1.y.Q(o0VarE, R.string.lbl_at_a_glance), new i3("MenuEdit", gl1.y.Q(o0VarE, R.string.lbl_edit), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null), false, null, aVar, lVar, z3.f.c(1498583871, new ry0.g(4, xVar2, lVar2), o0VarE), o0VarE, ((i15 << 12) & 458752) | (57344 & (i15 << 6)) | 1573312, 8);
        } else {
            o0VarE.e();
            xVar2 = xVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new qy0.d((androidx.lifecycle.u1) xVar2, lVar, aVar, (o13.h) lVar2, i14, 24);
        }
    }
}

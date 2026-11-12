package com.garmin.android.apps.connectmobile.navigation.more;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import e23.l;
import lc.m0;
import lc.v0;
import lc.y;
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
import sg2.g;
import tn2.s0;
import vy0.t;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/navigation/more/c$a", "Lp3/h0;", "runtime"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements h0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m0 f39424a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ y.c f39425b;

        public a(m0 m0Var, y.c cVar) {
            this.f39424a = m0Var;
            this.f39425b = cVar;
        }

        @Override // p3.h0
        public final void dispose() {
            m0 m0Var = this.f39424a;
            m0Var.getClass();
            y.c cVar = this.f39425b;
            cVar.getClass();
            h hVar = m0Var.f111904b;
            hVar.getClass();
            hVar.f144330q.remove(cVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x007b  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e9  */
    public static final void a(ty0.b bVar, l<? super ty0.b, Unit> lVar, l<? super Boolean, Unit> lVar2, l<? super Boolean, Unit> lVar3, e23.a<Unit> aVar, m mVar, int i14) {
        m0 m0Var;
        bVar.getClass();
        lVar.getClass();
        lVar2.getClass();
        lVar3.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(1086552823);
        int i15 = i14 | (o0VarE.k(bVar.ordinal()) ? 4 : 2) | (o0VarE.r(lVar) ? 32 : 16) | (o0VarE.r(aVar) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            m0 m0VarI = gl1.y.I(new v0[0], o0VarE);
            boolean zB = o0VarE.B(context);
            Object objQ = o0VarE.q();
            m.a aVar2 = m.f135153a;
            if (zB) {
                objQ = new d(m0VarI, lVar, context);
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new d(m0VarI, lVar, context);
                    o0VarE.K(objQ);
                }
            }
            t tVar = (t) objQ;
            MoreNavigationRoute.INSTANCE.getClass();
            MoreNavigationRoute moreNavigationRouteA = MoreNavigationRoute.Companion.a(bVar);
            Unit unit = Unit.INSTANCE;
            boolean zR = o0VarE.r(m0VarI);
            Object objQ2 = o0VarE.q();
            if (zR) {
                objQ2 = new s0(m0VarI, 18, lVar2, lVar3);
                o0VarE.K(objQ2);
            } else {
                aVar2.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new s0(m0VarI, 18, lVar2, lVar3);
                    o0VarE.K(objQ2);
                }
            }
            l0.a(unit, (l) objQ2, o0VarE);
            boolean zR2 = o0VarE.r(m0VarI) | o0VarE.r(tVar) | ((57344 & i15) == 16384) | ((i15 & 14) == 4);
            Object objQ3 = o0VarE.q();
            if (zR2) {
                m0Var = m0VarI;
                t42.l lVar4 = new t42.l(m0Var, tVar, aVar, bVar, 15);
                o0VarE.K(lVar4);
                objQ3 = lVar4;
            } else {
                aVar2.getClass();
                if (objQ3 == m.a.f135155b) {
                    m0Var = m0VarI;
                    t42.l lVar5 = new t42.l(m0Var, tVar, aVar, bVar, 15);
                    o0VarE.K(lVar5);
                    objQ3 = lVar5;
                } else {
                    m0Var = m0VarI;
                }
            }
            nc.y.a(m0Var, moreNavigationRouteA, null, null, null, null, null, null, null, (l) objQ3, o0VarE, 0, 2044);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g((Object) bVar, (Object) lVar, (l) lVar2, (o13.h) lVar3, (e23.a) aVar, i14, 20);
        }
    }
}

package i11;

import a11.j0;
import a11.q;
import a11.r;
import a11.u;
import c2.b0;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import e11.p;
import h5.e0;
import l72.p2;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.x1;
import r1.c0;

/* JADX INFO: loaded from: classes9.dex */
public final class k {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final double d14, final r rVar, final e23.l<? super r, Unit> lVar, final v21.e eVar, final boolean z14, final boolean z15, final e23.l<? super Double, Unit> lVar2, p3.m mVar, final int i14) {
        p1 p1Var;
        rVar.getClass();
        lVar.getClass();
        eVar.getClass();
        lVar2.getClass();
        o0 o0VarE = mVar.E(-1190536823);
        int i15 = i14 | (o0VarE.m(d14) ? 4 : 2) | (o0VarE.k(rVar.ordinal()) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128) | (o0VarE.r(eVar) ? 2048 : 1024) | (o0VarE.h(z14) ? 16384 : 8192) | (o0VarE.h(z15) ? 131072 : 65536) | (o0VarE.r(lVar2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (o0VarE.n(i15 & 1, (599187 & i15) != 599186)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var2 = (p1) objQ;
            h4.r.a aVar = h4.r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
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
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            p2 p2Var = p2.f111205a;
            String strQ = gl1.y.Q(o0VarE, R.string.number_of_servings);
            String strH = v21.e.h(d14);
            z3.e eVarC = z3.f.c(-1533245588, new u(b0Var, z14, z15, 2), o0VarE);
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new gp.e(p1Var2, 29);
                o0VarE.K(objQ2);
            }
            p2Var.h(strQ, strH, null, null, null, false, false, null, eVarC, null, (e23.a) objQ2, o0VarE, 100663296, 6, 764);
            o0VarE = o0VarE;
            c0.c(b0Var, z14, null, null, null, null, z3.f.c(-773261865, new p(eVar, 2), o0VarE), o0VarE, 1572870 | ((i15 >> 9) & 112), 30);
            c0.c(b0Var, z15, null, null, null, null, z3.f.c(394394638, new p(eVar, 3), o0VarE), o0VarE, 1572870 | ((i15 >> 12) & 112), 30);
            o0VarE.g0(true);
            if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                o0VarE.C(560105911);
                String strQ2 = gl1.y.Q(o0VarE, R.string.number_of_servings);
                a11.i iVar = new a11.i(0, 100, v21.d.f175321y, 1, null);
                j0 j0Var = new j0(5, 3);
                boolean z16 = ((3670016 & i15) == 1048576) | ((i15 & 896) == 256);
                Object objQ3 = o0VarE.q();
                if (z16 || objQ3 == c2565a) {
                    p1Var = p1Var2;
                    objQ3 = new gw1.c(lVar, 11, lVar2, p1Var);
                    o0VarE.K(objQ3);
                } else {
                    p1Var = p1Var2;
                }
                e23.p pVar = (e23.p) objQ3;
                Object objQ4 = o0VarE.q();
                if (objQ4 == c2565a) {
                    objQ4 = new i(p1Var, 0);
                    o0VarE.K(objQ4);
                }
                int i16 = i15 << 3;
                q.a(strQ2, d14, rVar, iVar, j0Var, pVar, (e23.a) objQ4, o0VarE, (i16 & 112) | 1572864 | (i16 & 896), 0);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            } else {
                o0VarE.C(560845881);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p(d14, rVar, lVar, eVar, z14, z15, lVar2, i14) { // from class: i11.j

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ double f87090a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ r f87091b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ e23.l f87092c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ v21.e f87093d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ boolean f87094e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ boolean f87095f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ e23.l f87096g;

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p0.t(1);
                    k.a(this.f87090a, this.f87091b, this.f87092c, this.f87093d, this.f87094e, this.f87095f, this.f87096g, (p3.m) obj, iT);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}

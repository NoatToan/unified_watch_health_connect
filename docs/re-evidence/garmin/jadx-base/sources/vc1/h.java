package vc1;

import c2.l;
import c2.q;
import c2.u;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import f5.z0;
import gl1.y;
import h4.r;
import h5.e0;
import java.util.ArrayList;
import o4.m1;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import tn.k;

/* JADX INFO: loaded from: classes9.dex */
public final class h {
    public static final void a(final long j8, final long j14, final boolean z14, final long j15, final boolean z15, m mVar, final int i14) {
        o0 o0VarE = mVar.E(-1879024518);
        int i15 = i14 | (o0VarE.l(j8) ? 4 : 2) | (o0VarE.l(j14) ? 32 : 16) | (o0VarE.h(z14) ? 256 : 128) | (o0VarE.l(j15) ? 2048 : 1024) | (o0VarE.h(z15) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = n.f135158a;
            ArrayList arrayList = new ArrayList();
            if (z15) {
                o0VarE.C(-1710413321);
                arrayList.add(new j82.f(y.Q(o0VarE, R.string.label_previous), new j82.g.l(j8, null), null, 4, null));
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1710273976);
                o0VarE.g0(false);
            }
            arrayList.add(new j82.f(y.Q(o0VarE, R.string.lbl_personal_records_current_record), new j82.g.a(j8, null), null, 4, null));
            arrayList.add(new j82.f(y.Q(o0VarE, R.string.proj_rtp_projection), new j82.g.a(j14, null), null, 4, null));
            if (z14) {
                o0VarE.C(-1709949623);
                arrayList.add(new j82.f(y.Q(o0VarE, R.string.lbl_goal), new j82.g.d(z3.f.c(281016071, new d70.n(j15, 2), o0VarE)), null, 4, null));
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1709458552);
                o0VarE.g0(false);
            }
            r.a aVar = r.S;
            r rVarE = u1.n.e(x2.f(aVar, 1.0f), k.b(d92.b.f58623a, o0VarE), m1.f128891a);
            h4.d.f81522a.getClass();
            z0 z0VarD = q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarE, o0VarE);
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
            b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u uVar = u.f22885a;
            i53.c cVarE = i53.a.e(arrayList);
            r rVarF = x2.f(aVar, 1.0f);
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97918c;
            bVar2.getClass();
            j82.e.h(cVarE, l.z(rVarF, eVar.f97920e, f14), null, o0VarE, 0, 4);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p(j8, j14, z14, j15, z15, i14) { // from class: vc1.g

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ long f177075a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ long f177076b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ boolean f177077c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ long f177078d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ boolean f177079e;

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p0.t(1);
                    h.a(this.f177075a, this.f177076b, this.f177077c, this.f177078d, this.f177079e, (m) obj, iT);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}

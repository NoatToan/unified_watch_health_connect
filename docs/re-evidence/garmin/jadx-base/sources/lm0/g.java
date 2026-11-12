package lm0;

import c2.b0;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import h4.r;
import h5.e0;
import java.util.Iterator;
import java.util.List;
import l72.r1;
import o4.m1;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import v62.m9;

/* JADX INFO: loaded from: classes8.dex */
public final class g {
    public static final void a(List<km0.m> list, e23.l<? super Long, Unit> lVar, e23.l<? super Long, Unit> lVar2, e23.a<Unit> aVar, p3.m mVar, int i14) {
        list.getClass();
        lVar.getClass();
        lVar2.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(-491969866);
        int i15 = i14 | (o0VarE.r(list) ? 4 : 2) | (o0VarE.r(lVar) ? 32 : 16) | (o0VarE.r(lVar2) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            r rVarF = x2.f(u1.n.e(r.S, vb.h.f(d92.b.f58623a, o0VarE), m1.f128891a), 1.0f);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarF, o0VarE);
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
            if (list.isEmpty()) {
                o0VarE.C(1952841296);
                b(aVar, o0VarE, (i15 >> 9) & 14);
                o0VarE.g0(false);
            } else {
                o0VarE.C(1952994405);
                r1.b(gl1.y.Q(o0VarE, R.string.follower_setup_following_suggestion_header), null, o0VarE, 0, 2);
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    an0.e.a((km0.m) it.next(), lVar, lVar2, o0VarE, hi0.l.f83843k | (i15 & 112) | (i15 & 896));
                }
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f(list, lVar, lVar2, aVar, i14, 0);
        }
    }

    public static final void b(e23.a<Unit> aVar, p3.m mVar, int i14) {
        int i15;
        e23.a<Unit> aVar2;
        o0 o0VarE = mVar.E(338057794);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(aVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            s62.a.f157643a.getClass();
            aVar2 = aVar;
            b82.n.d(m9.a(t62.b.f162798a), gl1.y.Q(o0VarE, R.string.social_invite_people), gl1.y.Q(o0VarE, R.string.msg_group_invite_empty_description), null, gl1.y.Q(o0VarE, R.string.lbl_search), aVar2, null, null, o0VarE, (i15 << 15) & 458752, 200);
        } else {
            aVar2 = aVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new at1.c(aVar2, i14, 8);
        }
    }
}

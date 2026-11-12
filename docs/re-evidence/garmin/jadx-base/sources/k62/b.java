package k62;

import c2.b0;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import h4.r;
import h5.e0;
import i3.d6;
import java.util.List;
import l72.p2;
import l72.r1;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.x1;
import v62.fa;

/* JADX INFO: loaded from: classes9.dex */
public final class b {
    public static final void a(List list, k kVar, e23.a aVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(518701918);
        int i15 = i14 | (o0VarE.r(list) ? 4 : 2) | (o0VarE.r(kVar) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            r.a aVar2 = r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar2 = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar2, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(aVar2, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
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
            r1.b(gl1.y.Q(o0VarE, R.string.lbl_my_workouts), z3.f.c(1227617455, new k41.e(1, list, kVar), o0VarE), o0VarE, 48, 0);
            p2 p2Var = p2.f111205a;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            p2Var.g(gl1.y.Q(o0VarE, R.string.lbl_add_workout), c2.l.C(aVar2, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), null, null, null, false, false, aVar, o0VarE, (i15 << 18) & 234881024, 252);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new jt1.m(list, kVar, aVar, i14, 6);
        }
    }

    public static final void b(e23.a<Unit> aVar, p3.m mVar, int i14) {
        e23.a<Unit> aVar2;
        o0 o0VarE = mVar.E(-1089746484);
        int i15 = (o0VarE.r(aVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            r.a aVar3 = r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            r rVarC = c2.l.C(aVar3, 0.0f, j92.b.f97899b.f97921f, 0.0f, 0.0f, 13);
            s62.a.f157643a.getClass();
            aVar2 = aVar;
            b82.n.d(u62.a.a(t62.a.f162797a), gl1.y.Q(o0VarE, R.string.lbl_no_workouts), gl1.y.Q(o0VarE, R.string.msg_no_workouts), rVarC, gl1.y.Q(o0VarE, R.string.workout_lbl_find_workout), aVar2, null, null, o0VarE, (i15 << 15) & 458752, 192);
        } else {
            aVar2 = aVar;
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new hl1.i(aVar2, i14, 15);
        }
    }

    public static final void c(e23.a<Unit> aVar, p3.m mVar, int i14) {
        e23.a<Unit> aVar2;
        o0 o0VarE = mVar.E(141157425);
        int i15 = (o0VarE.r(aVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            r.a aVar3 = r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            r rVarC = c2.l.C(aVar3, 0.0f, j92.b.f97899b.f97921f, 0.0f, 0.0f, 13);
            s62.a.f157643a.getClass();
            aVar2 = aVar;
            b82.n.d(fa.a(t62.b.f162798a), gl1.y.Q(o0VarE, R.string.lbl_error_occurred), gl1.y.Q(o0VarE, R.string.request_error_message), rVarC, gl1.y.Q(o0VarE, R.string.lbl_try_again), aVar2, null, null, o0VarE, (i15 << 15) & 458752, 192);
        } else {
            aVar2 = aVar;
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new hl1.i(aVar2, i14, 13);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(d dVar, e23.a aVar, k kVar, fv0.d dVar2, d6 d6Var, p3.m mVar, int i14) {
        dVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(360233688);
        int i15 = i14 | (o0VarE.r(dVar) ? 4 : 2) | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.r(kVar) ? 256 : 128) | (o0VarE.r(dVar2) ? 2048 : 1024) | (o0VarE.r(d6Var) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            p1 p1VarC = s9.c.c(dVar.f103178c, o0VarE);
            z02.d.a(((c) p1VarC.getF182175a()).f103173a, z3.f.c(-1734764067, new hl1.i(aVar, 14), o0VarE), null, null, null, z3.f.c(-1243148319, new hl1.j(dVar, ((c) p1VarC.getF182175a()).f103175c, d6Var, kVar, dVar2, p1VarC), o0VarE), o0VarE, 196656, 28);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ix.h(dVar, aVar, kVar, dVar2, d6Var, i14, 6);
        }
    }
}

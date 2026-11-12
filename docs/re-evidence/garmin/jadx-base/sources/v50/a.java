package v50;

import c2.b0;
import c2.l;
import c2.q;
import c2.u;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import f5.z0;
import h4.r;
import h5.e0;
import i3.mh;
import lc.u0;
import o13.p;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import s5.x0;
import u1.y0;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: v50.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C3277a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f175742a;

        static {
            int[] iArr = new int[x50.d.values().length];
            try {
                iArr[x50.d.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[x50.d.EMPTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[x50.d.NO_FILTER_RESULTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[x50.d.TOO_MANY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f175742a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(x50.d dVar, r rVar, m mVar, int i14) {
        p pVar;
        dVar.getClass();
        o0 o0VarE = mVar.E(1009202673);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = (o0VarE.k(dVar.ordinal()) ? 4 : 2) | i14 | (o0VarE.B(rVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            int i16 = C3277a.f175742a[dVar.ordinal()];
            if (i16 == 1) {
                pVar = new p(Integer.valueOf(R.string.message_course_search_fail), 2131231916);
            } else if (i16 == 2) {
                pVar = new p(Integer.valueOf(R.string.msg_no_courses_from_search), 2131231917);
            } else if (i16 == 3) {
                pVar = new p(Integer.valueOf(R.string.message_no_results_filter), 2131231915);
            } else {
                if (i16 != 4) {
                    u0.r();
                    return;
                }
                pVar = new p(Integer.valueOf(R.string.msg_too_many_courses_from_search), 2131231918);
            }
            int iIntValue = ((Number) pVar.f128594a).intValue();
            int iIntValue2 = ((Number) pVar.f128595b).intValue();
            h4.d.f81522a.getClass();
            z0 z0VarD = q.d(h4.d.a.f81528f, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVar, o0VarE);
            h5.g.V.getClass();
            e0.a aVar = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, z0VarD, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            u uVar = u.f22885a;
            h4.g.a aVar2 = h4.d.a.f81537o;
            r.a aVar3 = r.S;
            c2.j.f22691a.getClass();
            z zVarA = y.a(c2.j.f22694d, aVar2, o0VarE, 48);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC2 = h4.k.c(aVar3, o0VarE);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, zVarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC2, o0VarE);
            b0 b0Var = b0.f22601a;
            y0.a(n5.c.a(iIntValue2, o0VarE, 0), null, null, null, null, 0.0f, null, o0VarE, 48, 124);
            String strQ = gl1.y.Q(o0VarE, iIntValue);
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            x0 x0VarB = d92.c.b(j92.f.f97931h, o0VarE);
            d6.h.f57752b.getClass();
            int i17 = d6.h.f57755e;
            d92.b.f58625c.getClass();
            mh.c(strQ, l.y(aVar3, j92.b.f97899b.f97920e), 0L, null, 0L, null, 0L, d6.h.a(i17), 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 130044);
            o0VarE = o0VarE;
            o0VarE.g0(true);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new u91.i(dVar, rVar, i14, 16);
        }
    }
}

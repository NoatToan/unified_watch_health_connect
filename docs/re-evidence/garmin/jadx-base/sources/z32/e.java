package z32;

import c2.l;
import c2.t0;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import g6.o;
import gl1.y;
import h4.r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.t1;
import m92.c0;
import m92.d0;
import n92.g;
import n92.j;
import o13.p;
import org.joda.time.DateTime;
import p13.h0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import p3.y3;
import s5.s0;
import s5.x0;
import w5.q;
import xn.t;
import yu1.h;

/* JADX INFO: loaded from: classes10.dex */
public final class e {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f202159a;

        static {
            int[] iArr = new int[q71.e.values().length];
            try {
                iArr[q71.e.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[q71.e.CYCLING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f202159a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x011e  */
    /* JADX WARN: Code duplicated, block: B:44:0x012d A[LOOP:2: B:42:0x0127->B:44:0x012d, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(r rVar, i53.d dVar, DateTime dateTime, DateTime dateTime2, float f14, float f15, int i14, float f16, m mVar, int i15) {
        float f17;
        float f18;
        int i16;
        float f19;
        ArrayList arrayList;
        Iterator<E> it;
        o0 o0VarE = mVar.E(-1851911899);
        int i17 = i15 | (o0VarE.B(rVar) ? 4 : 2) | (o0VarE.B(dVar) ? 32 : 16) | (o0VarE.r(dateTime) ? 256 : 128) | (o0VarE.r(dateTime2) ? 2048 : 1024) | 14376960;
        if (o0VarE.n(i17 & 1, (4793491 & i17) != 4793490)) {
            v32.a aVar = v32.a.f175413a;
            aVar.getClass();
            float f22 = v32.a.f175416d;
            aVar.getClass();
            float f24 = v32.a.f175417e;
            aVar.getClass();
            float f25 = v32.a.f175418f;
            x1 x1Var = n.f135158a;
            o0VarE.C(-1570858522);
            ArrayList arrayList2 = new ArrayList();
            o0VarE.C(-1570855431);
            Iterator it3 = dVar.keySet().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                q71.e eVar = (q71.e) it3.next();
                q71.c cVar = (q71.c) dVar.get(eVar);
                if (cVar == null) {
                    o0VarE.C(-1971989277);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-1971989276);
                    long jC = c(eVar, o0VarE);
                    arrayList2.add(new d0(f24, new m92.m.d(jC, null), cVar.f143233a, true, f25, o4.d0.a(jC), null, false, null, 448, null));
                    o0VarE.g0(false);
                }
            }
            o0VarE.g0(false);
            i53.f fVarJ = i53.a.j(arrayList2);
            o0VarE.g0(false);
            Collection collectionValues = dVar.values();
            ArrayList arrayList3 = new ArrayList();
            Iterator it4 = collectionValues.iterator();
            while (it4.hasNext()) {
                Float f26 = ((q71.c) it4.next()).f143237e;
                if (f26 != null) {
                    arrayList3.add(f26);
                }
            }
            float fR0 = h0.r0(arrayList3);
            boolean zB = o0VarE.B(fVarJ);
            Object objQ = o0VarE.q();
            if (zB) {
                arrayList = new ArrayList();
                it = fVarJ.iterator();
                while (it.hasNext()) {
                    p13.d0.v(arrayList, ((d0) it.next()).f117281c);
                }
                objQ = new v32.b(i53.a.e(arrayList)).e(5);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    arrayList = new ArrayList();
                    it = fVarJ.iterator();
                    while (it.hasNext()) {
                        p13.d0.v(arrayList, ((d0) it.next()).f117281c);
                    }
                    objQ = new v32.b(i53.a.e(arrayList)).e(5);
                    o0VarE.K(objQ);
                }
            }
            p pVar = (p) objQ;
            j jVar = fVarJ.isEmpty() ? null : new j(new d02.b(), (Float) pVar.f128594a, (Float) pVar.f128595b, 5);
            y3 y3Var = t1.f91493k;
            q.b bVar = (q.b) o0VarE.A(y3Var);
            y3 y3Var2 = t1.f91490h;
            g6.d dVar2 = new g6.d(((g6.c) o0VarE.A(y3Var2)).getF69050b(), 1.0f);
            y3 y3Var3 = t1.f91496n;
            s0 s0Var = new s0(bVar, dVar2, (o) o0VarE.A(y3Var3), 0, 8, null);
            d92.b.f58623a.getClass();
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            x0 x0Var = j92.f.f97935l;
            g gVar = new g(sn.a.c(o0VarE), s0Var, d92.c.f(x0Var, o0VarE), null, 8, null);
            ArrayList arrayListC = c02.a.c(dateTime, dateTime2);
            s0 s0Var2 = new s0((q.b) o0VarE.A(y3Var), new g6.d(((g6.c) o0VarE.A(y3Var2)).getF69050b(), 1.0f), (o) o0VarE.A(y3Var3), 0, 8, null);
            fVar.getClass();
            c0.b(x2.h(x2.f(r.S, 1.0f), f22).then(rVar), "", fVarJ, Float.valueOf(fR0), y.Q(o0VarE, R.string.common_no_data), null, new n92.a(jVar, null, gVar, new n92.d(arrayListC, s0Var2, d92.c.f(x0Var, o0VarE), null, null, 24, null), 2, null), z3.f.c(857421853, new yr.d(dVar, 21), o0VarE), z3.f.c(1718746552, new t(dVar, 18), o0VarE), o0VarE, 113246768, 32);
            x1 x1Var2 = n.f135158a;
            i16 = 5;
            f17 = f22;
            f18 = f24;
            f19 = f25;
        } else {
            o0VarE.e();
            f17 = f14;
            f18 = f15;
            i16 = i14;
            f19 = f16;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new bn1.g(rVar, dVar, dateTime, dateTime2, f17, f18, i16, f19, i15);
        }
    }

    public static final void b(List<? extends q71.e> list, x0 x0Var, m mVar, int i14) {
        o0 o0VarE = mVar.E(-289963105);
        int i15 = 2;
        int i16 = (o0VarE.r(list) ? 4 : 2) | i14 | (o0VarE.B(x0Var) ? 32 : 16);
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            c2.j.f22691a.getClass();
            c2.j.c cVar = c2.j.f22696f;
            r rVarF = x2.f(r.S, 1.0f);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            t0.a(l.A(rVarF, 0.0f, j92.b.f97899b.f97920e, 1), cVar, null, null, 0, 0, z3.f.c(-1968708134, new h(i15, list, x0Var), o0VarE), o0VarE, 1572912, 60);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new xm0.h(list, x0Var, i14, 28);
        }
    }

    public static final long c(q71.e eVar, m mVar) {
        x1 x1Var = n.f135158a;
        int i14 = a.f202159a[eVar.ordinal()];
        if (i14 == 1) {
            mVar.C(1161218164);
            gl.c.f77766a.getClass();
            long jB = gl.c.a(mVar).b();
            mVar.f();
            return jB;
        }
        if (i14 != 2) {
            mVar.C(1161221591);
            gl.c.f77766a.getClass();
            long jF = gl.c.a(mVar).f();
            mVar.f();
            return jF;
        }
        mVar.C(1161220085);
        gl.c.f77766a.getClass();
        long jD = gl.c.a(mVar).d();
        mVar.f();
        return jD;
    }
}

package og2;

import ch.qos.logback.core.net.SyslogConstants;
import java.util.ArrayList;
import java.util.Iterator;
import o4.u1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes11.dex */
public final class a {
    /* JADX WARN: Code duplicated, block: B:45:0x0224 A[PHI: r17
      0x0224: PHI (r17v5 java.lang.Object) = (r17v1 java.lang.Object), (r17v3 java.lang.Object) binds: [B:44:0x0222, B:50:0x0237] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1, types: [og2.d] */
    /* JADX WARN: Type inference failed for: r23v3 */
    /* JADX WARN: Type inference failed for: r27v0, types: [og2.d] */
    public static final void a(h4.r rVar, f fVar, p3.m mVar, int i14) {
        int i15;
        p005kotlin.jvm.internal.j jVar;
        Object bVar;
        ?? bVar2;
        p3.o0 o0VarE = mVar.E(-1241602135);
        int i16 = (o0VarE.B(rVar) ? 4 : 2) | i14 | (o0VarE.r(fVar) ? 32 : 16);
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            i53.c<g> cVar = fVar.f132027c;
            if (cVar == null) {
                o0VarE.C(-310658649);
                o0VarE.g0(false);
                jVar = null;
                bVar = null;
            } else {
                o0VarE.C(-310658648);
                o0VarE.C(821262977);
                ArrayList arrayList = new ArrayList(p13.y.r(cVar, 10));
                for (g gVar : cVar) {
                    arrayList.add(new o13.p(Float.valueOf(gVar.f132035a), o4.d0.a(n5.a.a(o0VarE, gVar.f132036b))));
                }
                o0VarE.g0(false);
                ArrayList arrayList2 = new ArrayList(arrayList);
                Iterator it = arrayList2.iterator();
                int i17 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i17 = -1;
                        break;
                    } else if (0.0f < ((Number) ((o13.p) it.next()).f128594a).floatValue()) {
                        break;
                    } else {
                        i17++;
                    }
                }
                if (i17 > 0) {
                    o13.p pVar = (o13.p) arrayList2.get(i17 - 1);
                    o13.p pVar2 = (o13.p) arrayList2.get(i17);
                    Object obj = pVar.f128595b;
                    Object obj2 = pVar.f128594a;
                    long j8 = ((o4.d0) obj).f128833a;
                    long j14 = ((o4.d0) pVar2.f128595b).f128833a;
                    Number number = (Number) obj2;
                    float fAbs = Math.abs(number.floatValue()) / (((Number) pVar2.f128594a).floatValue() - number.floatValue());
                    long jE = o4.f0.e(((o4.d0.i(j14) - o4.d0.i(j8)) * fAbs) + o4.d0.i(j8), ((o4.d0.h(j14) - o4.d0.h(j8)) * fAbs) + o4.d0.h(j8), ((o4.d0.f(j14) - o4.d0.f(j8)) * fAbs) + o4.d0.f(j8), ((o4.d0.e(j14) - o4.d0.e(j8)) * fAbs) + o4.d0.e(j8));
                    arrayList2.subList(0, i17).clear();
                    arrayList2.add(0, new o13.p(Float.valueOf(0.0f), o4.d0.a(jE)));
                }
                Iterator it3 = arrayList2.iterator();
                int i18 = 0;
                while (true) {
                    if (!it3.hasNext()) {
                        i15 = -1;
                        break;
                    } else {
                        if (1.0f < ((Number) ((o13.p) it3.next()).f128594a).floatValue()) {
                            i15 = i18;
                            break;
                        }
                        i18++;
                    }
                }
                if (i15 > 0) {
                    o13.p pVar3 = (o13.p) arrayList2.get(i15 - 1);
                    o13.p pVar4 = (o13.p) arrayList2.get(i15);
                    Object obj3 = pVar3.f128595b;
                    Object obj4 = pVar3.f128594a;
                    long j15 = ((o4.d0) obj3).f128833a;
                    long j16 = ((o4.d0) pVar4.f128595b).f128833a;
                    Number number2 = (Number) obj4;
                    float fFloatValue = (1 - number2.floatValue()) / (((Number) pVar4.f128594a).floatValue() - number2.floatValue());
                    long jE2 = o4.f0.e(((o4.d0.i(j16) - o4.d0.i(j15)) * fFloatValue) + o4.d0.i(j15), ((o4.d0.h(j16) - o4.d0.h(j15)) * fFloatValue) + o4.d0.h(j15), ((o4.d0.f(j16) - o4.d0.f(j15)) * fFloatValue) + o4.d0.f(j15), ((o4.d0.e(j16) - o4.d0.e(j15)) * fFloatValue) + o4.d0.e(j15));
                    arrayList2 = p13.h0.d1(p13.h0.S0(arrayList2, i15));
                    arrayList2.add(new o13.p(Float.valueOf(1.0f), o4.d0.a(jE2)));
                }
                u1.f129010b.getClass();
                jVar = null;
                d.a aVar = new d.a(arrayList2, u1.f129011c, null);
                o0VarE.g0(false);
                bVar = aVar;
            }
            if (bVar == null) {
                o4.d0 d0Var = fVar.f132028d;
                bVar = d0Var != null ? new d.b(d0Var.f128833a, jVar) : jVar;
                if (bVar != null) {
                    bVar2 = bVar;
                } else {
                    o4.d0.f128823b.getClass();
                    bVar2 = new d.b(o4.d0.f128828g, jVar);
                }
            } else {
                bVar2 = bVar;
            }
            i53.c<i53.c<j>> cVar2 = fVar.f132025a;
            ArrayList arrayList3 = new ArrayList(p13.y.r(cVar2, 10));
            for (i53.c<j> cVar3 : cVar2) {
                e.f132017a.getClass();
                arrayList3.add(new t(e.f132018b, bVar2, cVar3, false, 0.0f, null, e.f132021e, null, fVar.f132029e, fVar.f132030f, SyslogConstants.LOG_LOCAL7, null));
            }
            ArrayList arrayList4 = new ArrayList(arrayList3);
            j jVar2 = fVar.f132026b;
            if (jVar2 != null) {
                g6.f.a aVar2 = g6.f.f75994b;
                o4.d0.f128823b.getClass();
                d.b bVar3 = new d.b(o4.d0.f128831j, null);
                e.f132017a.getClass();
                arrayList4.add(new t(0, bVar3, i53.a.e(p13.w.c(jVar2)), true, e.f132019c, bVar2, null, null, fVar.f132029e, fVar.f132030f, 192, null));
            }
            s.a(rVar, i53.a.e(arrayList4), fVar.f132031g, fVar.f132032h, fVar.f132033i, o0VarE, i16 & 14);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new mw0.i(rVar, fVar, i14, 29);
        }
    }
}

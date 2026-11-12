package oo0;

import am.x0;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.j;
import c2.x2;
import c2.y;
import c2.z;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import g02.q0;
import gs1.a0;
import gs1.t;
import h4.k;
import h4.r;
import h5.e0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l72.p2;
import lc.u0;
import ns.a3;
import o4.m1;
import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;
import org.joda.time.Minutes;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.j0;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class e {
    /* JADX WARN: Code duplicated, block: B:136:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:202:0x042f  */
    /* JADX WARN: Code duplicated, block: B:205:0x0442  */
    /* JADX WARN: Code duplicated, block: B:206:0x0444  */
    /* JADX WARN: Code duplicated, block: B:209:0x0450  */
    /* JADX WARN: Code duplicated, block: B:211:0x0459  */
    /* JADX WARN: Code duplicated, block: B:249:0x0462 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v32 */
    /* JADX WARN: Type inference failed for: r11v27, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v4, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v8, types: [w00.b] */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1, types: [int] */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r3v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v43 */
    /* JADX WARN: Type inference failed for: r3v44 */
    /* JADX WARN: Type inference failed for: r6v17, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v3, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r6v6, types: [p3.o0] */
    public static final void a(DateTime dateTime, t tVar, qo0.a aVar, l<? super co0.f, Unit> lVar, m mVar, int i14) {
        ?? r14;
        ?? r15;
        ?? r16;
        DateTime dateTimeNow;
        ?? arrayList;
        ArrayList arrayList2;
        ?? r17;
        boolean z14;
        String strG;
        boolean z15;
        String string;
        String strB;
        ?? r18;
        ?? r19;
        int i15;
        Object objQ;
        ?? r24;
        List<gs1.b> listB;
        List<sn.h> listB2;
        List<sn.h> listN0;
        List<gs1.f> listB3;
        co0.f.b bVar;
        Object next;
        List<gs1.d.b> listB4;
        DateTime dateTimeNow2;
        Integer num;
        gs1.d allDayHeartRateDTO;
        aVar.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(-1914890741);
        p3.c<?> cVar = o0VarE.f135177b;
        int i16 = (i14 & 6) == 0 ? (o0VarE.r(dateTime) ? 4 : 2) | i14 : i14;
        if ((i14 & 48) == 0) {
            i16 |= (i14 & 64) == 0 ? o0VarE.B(tVar) : o0VarE.r(tVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.r(aVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= o0VarE.r(lVar) ? 2048 : 1024;
        }
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            p1 p1VarC = s9.c.c(aVar.f145921f, o0VarE);
            ?? r110 = 1;
            gs1.d.c payload = (tVar == null || (allDayHeartRateDTO = tVar.getAllDayHeartRateDTO()) == null) ? null : allDayHeartRateDTO.getPayload();
            r rVarF = x2.f(u1.n.e(r.S, vb.h.f(d92.b.f58623a, o0VarE), m1.f128891a), 1.0f);
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarF, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (cVar == null) {
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
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            g.a(dateTime, tVar, aVar, o0VarE, (i16 & 14) | (t.f78871l << 3) | (i16 & 112) | (i16 & 896));
            if (((qo0.d) p1VarC.getF182175a()).f145950d) {
                o0VarE.C(1749582250);
                if (payload == null || (dateTimeNow = payload.k()) == null) {
                    dateTimeNow = DateTime.now();
                }
                if (payload == null || (listB4 = payload.b()) == null) {
                    arrayList = j0.f134944a;
                } else {
                    dateTimeNow.getClass();
                    arrayList = new ArrayList();
                    for (gs1.d.b bVar3 : listB4) {
                        if (bVar3 == null || (dateTimeNow2 = bVar3.f78713a) == null) {
                            dateTimeNow2 = DateTime.now();
                        }
                        arrayList.add(new co0.a((bVar3 == null || (num = bVar3.f78714b) == null) ? 0 : num.intValue(), Minutes.minutesBetween(dateTimeNow, dateTimeNow2).getMinutes()));
                    }
                }
                a.a(arrayList, o0VarE, 0);
                mo0.a aVar3 = new mo0.a(context);
                r.a aVar4 = r.S;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                r rVarC2 = c2.l.C(aVar4, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13);
                j.f22691a.getClass();
                j.k kVar2 = j.f22694d;
                h4.d.f81522a.getClass();
                z zVarA2 = y.a(kVar2, h4.d.a.f81536n, o0VarE, 0);
                x1 x1Var2 = n.f135158a;
                int iHashCode2 = Long.hashCode(o0VarE.U);
                i2 i2VarA1 = o0VarE.a0();
                r rVarC3 = k.c(rVarC2, o0VarE);
                h5.g.V.getClass();
                e0.a aVar5 = h5.g.a.f81805b;
                if (cVar == null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar5);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, zVarA2, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA1, o0VarE);
                h5.g.a.b bVar4 = h5.g.a.f81813j;
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar4);
                }
                b4.c(h5.g.a.f81807d, rVarC3, o0VarE);
                b0 b0Var2 = b0.f22601a;
                if (tVar != null) {
                    arrayList2 = new ArrayList();
                    gs1.a activitiesForDayDTO = tVar.getActivitiesForDayDTO();
                    if (activitiesForDayDTO == null || (listB = activitiesForDayDTO.b()) == null) {
                        listB = j0.f134944a;
                    }
                    Iterator it = listB.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(new co0.f.a((gs1.b) it.next()));
                    }
                    gs1.g autoDetectedEventDTO = tVar.getAutoDetectedEventDTO();
                    if (autoDetectedEventDTO != null && (listB3 = autoDetectedEventDTO.b()) != null) {
                        for (gs1.f fVar : listB3) {
                            fVar.getClass();
                            LocalDateTime localDateTimeK = fVar.k();
                            LocalDateTime localDateTimeH = fVar.h();
                            if (localDateTimeK == null || localDateTimeH == null) {
                                bVar = new co0.f.b(fVar);
                            } else {
                                Iterator it3 = listB.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it3.next();
                                    gs1.b bVar5 = (gs1.b) next;
                                    LocalDateTime localDateTimeZ = bVar5.Z();
                                    if (localDateTimeZ != null) {
                                        Double duration = bVar5.getDuration();
                                        if (localDateTimeK.getMillisOfDay() < localDateTimeZ.plusSeconds(duration != null ? (int) duration.doubleValue() : 0).getMillisOfDay() && localDateTimeH.getMillisOfDay() > localDateTimeZ.getMillisOfDay()) {
                                            break;
                                        }
                                    }
                                }
                                if (((gs1.b) next) != null) {
                                    bVar = null;
                                } else {
                                    bVar = new co0.f.b(fVar);
                                }
                            }
                            if (bVar != null) {
                                arrayList2.add(bVar);
                            }
                        }
                    }
                    a0 wellnessActivitySummaries = tVar.getWellnessActivitySummaries();
                    if (wellnessActivitySummaries != null && (listB2 = wellnessActivitySummaries.b()) != null && (listN0 = h0.N0(listB2, new mo0.b())) != null) {
                        for (sn.h hVar : listN0) {
                            arrayList2.add(hVar.D() ? new co0.f.c(hVar) : new co0.f.d(hVar));
                        }
                    }
                } else {
                    arrayList2 = null;
                }
                if (arrayList2 == null) {
                    o0VarE.C(-1078328985);
                    o0VarE.g0(false);
                    r24 = o0VarE;
                    z14 = false;
                    r17 = 1;
                } else {
                    o0VarE.C(-1078328984);
                    Iterator it4 = arrayList2.iterator();
                    while (it4.hasNext()) {
                        co0.f fVar2 = (co0.f) it4.next();
                        p2 p2Var = p2.f111205a;
                        fVar2.getClass();
                        boolean z16 = fVar2 instanceof co0.f.a;
                        Context context2 = aVar3.f119868a;
                        fo0.a aVar6 = aVar3.f119869b;
                        if (z16) {
                            gs1.b bVar6 = ((co0.f.a) fVar2).f28142a;
                            x0 x0VarA = fs1.b.a(bVar6);
                            String activityName = bVar6.getActivityName();
                            if (activityName == null) {
                                activityName = "";
                            }
                            strG = zx0.m.b(context2, x0VarA, null, activityName, 0);
                        } else if (fVar2 instanceof co0.f.b) {
                            strG = zx0.m.b(context2, fs1.b.b(((co0.f.b) fVar2).f28143a), null, null, Integer.valueOf((int) r110));
                        } else if (fVar2 instanceof co0.f.d) {
                            strG = aVar6.g(context2, ((co0.f.d) fVar2).f28145a);
                        } else {
                            if (!(fVar2 instanceof co0.f.c)) {
                                u0.r();
                                return;
                            }
                            strG = aVar6.g(context2, ((co0.f.c) fVar2).f28144a);
                        }
                        if (z16) {
                            strB = aVar6.c(context2, ((co0.f.a) fVar2).f28142a);
                        } else if (fVar2 instanceof co0.f.b) {
                            Double duration2 = ((co0.f.b) fVar2).f28143a.getDuration();
                            double dDoubleValue = duration2 != null ? duration2.doubleValue() : 0.0d;
                            String str = aVar3.f119870c;
                            str.getClass();
                            l3.f23124b.getClass();
                            strB = l3.a.f1((long) (dDoubleValue * ((double) 60)), str);
                        } else {
                            boolean z17 = fVar2 instanceof co0.f.d;
                            l22.a aVar7 = aVar3.f119871d;
                            if (z17) {
                                sn.h hVar2 = ((co0.f.d) fVar2).f28145a;
                                ls.e eVar = ls.e.AVERAGE_HEART_RATE;
                                sn.g gVarM = hVar2.m();
                                strB = ss.k.b(eVar, aVar7, gVarM != null ? gVarM.getAvgValue() : null, 73);
                            } else {
                                if (!(fVar2 instanceof co0.f.c)) {
                                    u0.r();
                                    return;
                                }
                                sn.h hVar3 = ((co0.f.c) fVar2).f28144a;
                                z15 = false;
                                String strC = u00.b.c(new a3(aVar7, null, 2, null), hVar3.getCalendarDate(), 0, 6);
                                ?? bVar7 = new w00.b(aVar7);
                                sn.g gVarM2 = hVar3.m();
                                Double avgValue = gVarM2 != null ? gVarM2.getAvgValue() : null;
                                ?? r25 = r110;
                                String string2 = context2.getString(R.string.param_avg_hr, bVar7.f(avgValue, r25));
                                string2.getClass();
                                string = context2.getString(R.string.string_space_bullet_string_pattern, strC, string2);
                                string.getClass();
                                r18 = r25;
                            }
                            String str2 = string != null ? string : "";
                            z3.e eVarC = z3.f.c(-998739692, new d(fVar2), o0VarE);
                            if ((i16 & 7168) == 2048) {
                                r19 = r18;
                            } else {
                                r19 = z15;
                            }
                            i15 = r19 | (o0VarE.B(fVar2) ? 1 : 0);
                            objQ = o0VarE.q();
                            if (i15 == 0) {
                                m.f135153a.getClass();
                                if (objQ == m.a.f135155b) {
                                    objQ = new oe.j(7, lVar, fVar2);
                                    o0VarE.K(objQ);
                                }
                            } else {
                                objQ = new oe.j(7, lVar, fVar2);
                                o0VarE.K(objQ);
                            }
                            o0 o0Var = o0VarE;
                            p2Var.h(strG, str2, null, null, null, false, false, eVarC, null, null, (e23.a) objQ, o0Var, 12582912, 0, 892);
                            i16 = i16;
                            r110 = r18;
                            o0VarE = o0Var;
                            it4 = it4;
                            aVar3 = aVar3;
                        }
                        string = strB;
                        r18 = r110;
                        z15 = false;
                        if (string != null) {
                        }
                        z3.e eVarC2 = z3.f.c(-998739692, new d(fVar2), o0VarE);
                        if ((i16 & 7168) == 2048) {
                            r19 = r18;
                        } else {
                            r19 = z15;
                        }
                        i15 = r19 | (o0VarE.B(fVar2) ? 1 : 0);
                        objQ = o0VarE.q();
                        if (i15 == 0) {
                            m.f135153a.getClass();
                            if (objQ == m.a.f135155b) {
                                objQ = new oe.j(7, lVar, fVar2);
                                o0VarE.K(objQ);
                            }
                        } else {
                            objQ = new oe.j(7, lVar, fVar2);
                            o0VarE.K(objQ);
                        }
                        o0 o0Var2 = o0VarE;
                        p2Var.h(strG, str2, null, null, null, false, false, eVarC2, null, null, (e23.a) objQ, o0Var2, 12582912, 0, 892);
                        i16 = i16;
                        r110 = r18;
                        o0VarE = o0Var2;
                        it4 = it4;
                        aVar3 = aVar3;
                    }
                    o0 o0Var3 = o0VarE;
                    r17 = r110;
                    z14 = false;
                    o0Var3.g0(false);
                    Unit unit = Unit.INSTANCE;
                    r24 = o0Var3;
                }
                r24.g0(r17);
                r24.g0(z14);
                r15 = r17;
                r16 = r24;
            } else {
                o0 o0Var4 = o0VarE;
                r15 = 1;
                o0Var4.C(1750384685);
                o0Var4.g0(false);
                r16 = o0Var4;
            }
            r16.g0(r15);
            x1 x1Var3 = n.f135158a;
            r14 = r16;
        } else {
            o0 o0Var5 = o0VarE;
            o0Var5.e();
            r14 = o0Var5;
        }
        p3.p2 p2VarI0 = r14.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new q0(dateTime, tVar, aVar, lVar, i14, 27);
        }
    }
}

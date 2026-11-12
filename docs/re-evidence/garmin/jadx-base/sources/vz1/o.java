package vz1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b63.u;
import com.garmin.android.apps.connectmobile.R;
import f72.nb;
import gl1.y;
import i3.mc;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import o53.b0;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p13.t0;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;
import p3.y3;
import sz1.t;

/* JADX INFO: loaded from: classes10.dex */
public final class o {
    /* JADX WARN: Code duplicated, block: B:114:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ed  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(DateTime dateTime, DateTime dateTime2, t tVar, mc mcVar, b0 b0Var, oz1.a aVar, p3.m mVar, int i14) {
        o0 o0Var;
        o82.a aVar2;
        p1 p1VarC;
        u82.f fVar;
        int i15;
        ArrayList arrayList;
        o13.p pVar;
        zm1.b bVar;
        mm1.b bVar2;
        b0Var.getClass();
        aVar.getClass();
        int i16 = aVar.f134492c;
        o0 o0VarE = mVar.E(-1847023801);
        int i17 = (i14 & 6) == 0 ? (o0VarE.r(dateTime) ? 4 : 2) | i14 : i14;
        if ((i14 & 48) == 0) {
            i17 |= o0VarE.r(dateTime2) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i17 |= o0VarE.r(tVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i17 |= o0VarE.B(mcVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i17 |= o0VarE.r(b0Var) ? 16384 : 8192;
        }
        if ((i14 & 196608) == 0) {
            i17 |= (262144 & i14) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 131072 : 65536;
        }
        int i18 = i17;
        if (o0VarE.n(i18 & 1, (74899 & i18) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            oz1.l.f134573c.getClass();
            String strQ = y.Q(o0VarE, oz1.l.a.a(i16).f134582a);
            String strQ2 = y.Q(o0VarE, oz1.l.a.a(i16).f134583b);
            y3 y3Var = AndroidCompositionLocals_androidKt.f6042b;
            pi0.e eVar = new pi0.e((Context) o0VarE.A(y3Var));
            if (dateTime2 != null) {
                u uVarZ = g22.k.z(dateTime2);
                if (dateTime != null) {
                    aVar2 = new o82.a(g22.k.z(dateTime).b(), uVarZ.b());
                } else {
                    aVar2 = null;
                }
            } else {
                aVar2 = null;
            }
            if (aVar2 == null) {
                o0VarE.C(-1859182962);
                o0VarE.g0(false);
                fVar = null;
            } else {
                o0VarE.C(-1859182961);
                u82.a aVar3 = tVar != null ? tVar.f161580g : null;
                if (aVar3 == null) {
                    o0VarE.C(831271136);
                    o0VarE.g0(false);
                    p1VarC = null;
                } else {
                    o0VarE.C(-943016127);
                    p1VarC = aVar3.c(aVar2, o0VarE);
                    o0VarE.g0(false);
                }
                fVar = p1VarC != null ? (u82.f) p1VarC.getF182175a() : null;
                o0VarE.g0(false);
            }
            List<mm1.c> listB = (fVar == null || (bVar2 = (mm1.b) fVar.a()) == null) ? null : bVar2.b();
            ArrayList arrayListI = listB != null ? vm1.a.i(listB) : null;
            ArrayList arrayListI2 = listB != null ? vm1.a.i(listB) : null;
            ArrayList arrayListD = listB != null ? vm1.a.d(listB) : null;
            ArrayList arrayListA = listB != null ? vm1.a.a(listB) : null;
            ArrayList arrayListE = listB != null ? vm1.a.e(listB) : null;
            ArrayList arrayListB = listB != null ? vm1.a.b(listB) : null;
            ArrayList arrayListC = listB != null ? vm1.a.c(listB) : null;
            if (listB != null) {
                ArrayList arrayList2 = new ArrayList();
                for (mm1.c cVar : listB) {
                    if (cVar.getCalendarDate() == null) {
                        cVar = null;
                    } else {
                        mm1.c.a values = cVar.getValues();
                        if ((values != null ? values.getHrvStatus() : null) == null || cVar.getValues().getHrv7dAverage() == null) {
                            cVar = null;
                        }
                    }
                    if (cVar != null) {
                        LocalDate localDateA = mm1.d.a(cVar);
                        mm1.c.a values2 = cVar.getValues();
                        Double hrv7dAverage = values2 != null ? values2.getHrv7dAverage() : null;
                        mm1.c.a values3 = cVar.getValues();
                        bVar = new zm1.b(localDateA, hrv7dAverage, values3 != null ? values3.getHrvStatus() : null);
                    } else {
                        i16 = i16;
                        bVar = null;
                    }
                    if (bVar != null) {
                        arrayList2.add(bVar);
                    }
                    i16 = i16;
                }
                i15 = i16;
                if (arrayList2.isEmpty()) {
                    arrayList2 = null;
                }
                arrayList = arrayList2;
            } else {
                i15 = i16;
                arrayList = null;
            }
            zm1.s sVar = new zm1.s(arrayListI2, arrayListD, null, arrayListA, arrayListE, arrayListB, arrayListC, arrayList, 4, null);
            DateTime dateTimeMinusDays = dateTime2 != null ? dateTime2.minusDays(1) : null;
            DateTime dateTimeMinusDays2 = dateTime2 != null ? dateTime2.minusDays(2) : null;
            if (arrayListI != null) {
                int iA = t0.a(p13.y.r(arrayListI, 10));
                LinkedHashMap linkedHashMap = new LinkedHashMap(iA >= 16 ? iA : 16);
                for (Object obj : arrayListI) {
                    LocalDate localDate = ((zm1.q) obj).f205329a;
                    linkedHashMap.put(localDate != null ? localDate.toDateTimeAtStartOfDay() : null, obj);
                }
                pVar = new o13.p((zm1.q) linkedHashMap.get(dateTimeMinusDays), (zm1.q) linkedHashMap.get(dateTimeMinusDays2));
            } else {
                pVar = new o13.p(null, null);
            }
            zm1.q qVar = (zm1.q) pVar.f128594a;
            zm1.q qVar2 = (zm1.q) pVar.f128595b;
            oz1.l.f134573c.getClass();
            if (oz1.l.a.a(i15) != oz1.l.NONE) {
                o0VarE.C(-1857790906);
                int i19 = i18 >> 6;
                i.a(R.string.tr_factor_recent_sleep_score, mcVar, b0Var, strQ, strQ2, z3.f.c(-193565857, new n(dateTime, dateTime2, sVar, qVar2, qVar, eVar, 1), o0VarE), o0VarE, (i19 & 112) | 196608 | (i19 & 896));
                o0Var = o0VarE;
                o0Var.g0(false);
            } else {
                o0Var = o0VarE;
                o0Var.C(-1854086406);
                s62.a.f157643a.getClass();
                u4.d dVarA = nb.a(t62.c.f162799a);
                Object objQ = o0Var.q();
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new vv0.u(22);
                    o0Var.K(objQ);
                }
                e23.a aVar4 = (e23.a) objQ;
                int i24 = i18 >> 9;
                l.a(mcVar, b0Var, R.string.tr_factor_recent_sleep_score, dVarA, R.string.msg_not_enough_data, null, R.string.tr_feedback_sleep_history_no_data, aVar4, o0Var, (i24 & 14) | 12779520 | (i24 & 112));
                o0Var.g0(false);
            }
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a(dateTime, dateTime2, tVar, mcVar, b0Var, aVar, i14, 1);
        }
    }
}

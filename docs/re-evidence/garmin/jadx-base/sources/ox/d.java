package ox;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import gs1.l;
import gs1.t;
import gs1.z;
import h4.r;
import ix.j;
import java.util.ArrayList;
import java.util.List;
import l72.j0;
import m92.o;
import o4.m1;
import org.joda.time.DateTime;
import p3.m;
import p3.n;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;
import tn.k;

/* JADX INFO: loaded from: classes7.dex */
public final class d {
    /* JADX WARN: Code duplicated, block: B:46:0x008a  */
    /* JADX WARN: Code duplicated, block: B:51:0x0098  */
    /* JADX WARN: Code duplicated, block: B:53:0x009b  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:77:0x00df  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:91:0x0101  */
    /* JADX WARN: Code duplicated, block: B:92:0x0103  */
    /* JADX WARN: Code duplicated, block: B:94:0x0106  */
    /* JADX WARN: Code duplicated, block: B:95:0x0108  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(DateTime dateTime, j jVar, t tVar, m mVar, int i14) {
        o0 o0Var;
        l payload;
        gs1.e.c payload2;
        String calendarDate;
        int iIntValue;
        int iIntValue2;
        boolean z14;
        boolean z15;
        int iIntValue3;
        int iIntValue4;
        Integer bodyBatteryLowestValue;
        Integer bodyBatteryHighestValue;
        Integer bodyBatteryDrainedValue;
        Integer bodyBatteryChargedValue;
        z userDailySummary;
        gs1.e allDayStressDTO;
        String strJ;
        jVar.getClass();
        o0 o0VarE = mVar.E(-1743314304);
        int i15 = (i14 & 6) == 0 ? (o0VarE.r(dateTime) ? 4 : 2) | i14 : i14;
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(jVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= (i14 & 512) == 0 ? o0VarE.B(tVar) : o0VarE.r(tVar) ? 256 : 128;
        }
        boolean z16 = true;
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            p1 p1VarC = s9.c.c(jVar.f95628h, o0VarE);
            boolean z17 = (i15 & 896) == 256 || ((i15 & 512) != 0 && o0VarE.B(tVar));
            Object objQ = o0VarE.q();
            if (z17) {
                payload = null;
                if (tVar != null) {
                    payload2 = null;
                } else {
                    payload2 = null;
                }
                if (payload2 != null) {
                    calendarDate = payload2.getCalendarDate();
                } else {
                    calendarDate = null;
                }
                if (calendarDate != null) {
                    if (tVar != null) {
                        payload = userDailySummary.getPayload();
                    }
                    iIntValue = -1;
                    if (payload != null) {
                        iIntValue2 = -1;
                    } else {
                        iIntValue2 = -1;
                    }
                    if (iIntValue2 >= 0) {
                        z14 = true;
                    } else {
                        if (payload != null) {
                            iIntValue3 = -1;
                        } else {
                            iIntValue3 = -1;
                        }
                        if (iIntValue3 >= 0) {
                            z14 = true;
                        } else {
                            if (payload != null) {
                                iIntValue4 = -1;
                            } else {
                                iIntValue4 = -1;
                            }
                            if (iIntValue4 >= 0) {
                                z14 = true;
                            } else {
                                if (payload != null) {
                                    iIntValue = bodyBatteryLowestValue.intValue();
                                }
                                if (iIntValue >= 0) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                            }
                        }
                    }
                    if (z14) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                } else {
                    z15 = false;
                }
                objQ = hb.a.n(z15, o0VarE);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    payload = null;
                    if (tVar != null || (allDayStressDTO = tVar.getAllDayStressDTO()) == null) {
                        payload2 = null;
                    } else {
                        payload2 = allDayStressDTO.getPayload();
                    }
                    if (payload2 != null) {
                        calendarDate = payload2.getCalendarDate();
                    } else {
                        calendarDate = null;
                    }
                    if (calendarDate != null || tVar.getSleepTimesDTO() == null || payload2.b().isEmpty()) {
                        if (tVar != null && (userDailySummary = tVar.getUserDailySummary()) != null) {
                            payload = userDailySummary.getPayload();
                        }
                        iIntValue = -1;
                        if (payload != null || (bodyBatteryChargedValue = payload.getBodyBatteryChargedValue()) == null) {
                            iIntValue2 = -1;
                        } else {
                            iIntValue2 = bodyBatteryChargedValue.intValue();
                        }
                        if (iIntValue2 >= 0) {
                            z14 = true;
                        } else {
                            if (payload != null || (bodyBatteryDrainedValue = payload.getBodyBatteryDrainedValue()) == null) {
                                iIntValue3 = -1;
                            } else {
                                iIntValue3 = bodyBatteryDrainedValue.intValue();
                            }
                            if (iIntValue3 >= 0) {
                                z14 = true;
                            } else {
                                if (payload != null || (bodyBatteryHighestValue = payload.getBodyBatteryHighestValue()) == null) {
                                    iIntValue4 = -1;
                                } else {
                                    iIntValue4 = bodyBatteryHighestValue.intValue();
                                }
                                if (iIntValue4 >= 0) {
                                    z14 = true;
                                } else {
                                    if (payload != null && (bodyBatteryLowestValue = payload.getBodyBatteryLowestValue()) != null) {
                                        iIntValue = bodyBatteryLowestValue.intValue();
                                    }
                                    if (iIntValue >= 0) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                }
                            }
                        }
                        if (z14) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                    } else {
                        z15 = false;
                    }
                    objQ = hb.a.n(z15, o0VarE);
                }
            }
            p1 p1Var = (p1) objQ;
            pi0.e eVar = new pi0.e((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b));
            String strQ = y.Q(o0VarE, ((ix.l) p1VarC.getF182175a()).f95667g ? R.string.msg_press_hold_chart_for_more : R.string.msg_double_tap_to_enable_functions);
            if (((ix.l) p1VarC.getF182175a()).f95667g) {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -331147105, R.string.lbl_daily_timeline, o0VarE, false);
            } else {
                o0VarE.C(-331073201);
                o0VarE.g0(false);
                strJ = eVar.j(dateTime, pi0.d.DATE_SHORT_MONTH_FOR_PAST_YEAR_SHOW_TODAY);
            }
            String str = strJ;
            jx.a aVar = new jx.a(tVar, null, null, 6, null);
            gt.a aVar2 = new gt.a(tVar, null, null, 6, null);
            boolean zA = jx.b.a(aVar);
            boolean zA2 = gt.b.a(aVar2);
            if (!gt.b.b(aVar2) && !gt.b.c(aVar2)) {
                z16 = false;
            }
            ArrayList<jx.c> arrayListY4 = j.y4(zA, z16, zA2);
            List<jx.c> list = ((ix.l) p1VarC.getF182175a()).f95669i;
            o0VarE.C(-287753512);
            ArrayList arrayList = new ArrayList(p13.y.r(arrayListY4, 10));
            for (jx.c cVar : arrayListY4) {
                arrayList.add(new j0(y.Q(o0VarE, cVar.f101393b), null, null, false, list.contains(cVar), 14, null));
            }
            o0VarE.g0(false);
            o0Var = o0VarE;
            o.a(c2.l.l(u1.n.e(r.S, k.b(d92.b.f58623a, o0VarE), m1.f128891a)), str, null, null, z3.f.c(-2023864576, new dd1.d(dateTime, jVar, p1Var, strQ, tVar, p1VarC, aVar, aVar2, 16), o0VarE), z3.f.c(613994463, new b(i53.a.e(arrayList), jVar, arrayListY4, 0), o0VarE), null, o0Var, 221184, 76);
            x1 x1Var2 = n.f135158a;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new mx.h(dateTime, jVar, tVar, i14, 7);
        }
    }
}

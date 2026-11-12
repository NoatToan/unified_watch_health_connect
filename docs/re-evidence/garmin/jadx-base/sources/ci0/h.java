package ci0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b63.o;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import e23.l;
import gl1.y;
import gs1.t;
import gs1.z;
import h4.r;
import java.util.Iterator;
import java.util.List;
import o4.m1;
import org.joda.time.DateTime;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;
import tn.k;

/* JADX INFO: loaded from: classes8.dex */
public final class h {
    /* JADX WARN: Code duplicated, block: B:117:0x015c  */
    /* JADX WARN: Code duplicated, block: B:126:0x0176  */
    /* JADX WARN: Code duplicated, block: B:141:0x019c  */
    /* JADX WARN: Code duplicated, block: B:94:0x0115 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:95:0x0117  */
    public static final void a(DateTime dateTime, sh0.d dVar, boolean z14, boolean z15, tf0.i iVar, l<? super Boolean, Unit> lVar, l<? super o, Unit> lVar2, l<? super Boolean, Unit> lVar3, l<? super Boolean, Unit> lVar4, m mVar, int i14) {
        int i15;
        l<? super o, Unit> lVar5;
        l<? super Boolean, Unit> lVar6;
        l<? super Boolean, Unit> lVar7;
        o0 o0Var;
        boolean z16;
        t tVar;
        sh0.c cVar;
        double dDoubleValue;
        sh0.c.d dVar2;
        double dDoubleValue2;
        z userDailySummary;
        gs1.l payload;
        Double floorsDescended;
        z userDailySummary2;
        gs1.l payload2;
        Double floorsAscended;
        List<sh0.c.d> listD;
        Object obj;
        String strJ;
        iVar.getClass();
        lVar.getClass();
        lVar2.getClass();
        lVar3.getClass();
        lVar4.getClass();
        o0 o0VarE = mVar.E(521894902);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(dateTime) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(dVar) : o0VarE.r(dVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.h(z14) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.h(z15) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= (32768 & i14) == 0 ? o0VarE.B(iVar) : o0VarE.r(iVar) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.r(lVar) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            lVar5 = lVar2;
            i15 |= o0VarE.r(lVar5) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        } else {
            lVar5 = lVar2;
        }
        if ((12582912 & i14) == 0) {
            lVar6 = lVar3;
            i15 |= o0VarE.r(lVar6) ? 8388608 : 4194304;
        } else {
            lVar6 = lVar3;
        }
        if ((100663296 & i14) == 0) {
            lVar7 = lVar4;
            i15 |= o0VarE.r(lVar7) ? 67108864 : 33554432;
        } else {
            lVar7 = lVar4;
        }
        if (o0VarE.n(i15 & 1, (38347923 & i15) != 38347922)) {
            x1 x1Var = n.f135158a;
            boolean z17 = (i15 & 112) == 32 || ((i15 & 64) != 0 && o0VarE.B(dVar));
            Object objQ = o0VarE.q();
            if (z17) {
                if (dVar != null) {
                    tVar = dVar.f159293b;
                    cVar = dVar.f159292a;
                    dDoubleValue = -1.0d;
                    if (cVar != null) {
                        dVar2 = null;
                    } else {
                        dVar2 = null;
                    }
                    if (tVar != null) {
                        dDoubleValue2 = -1.0d;
                    } else {
                        dDoubleValue2 = -1.0d;
                    }
                    if (tVar != null) {
                        dDoubleValue = floorsDescended.doubleValue();
                    }
                    if (dVar2 == null) {
                        z16 = false;
                    } else {
                        z16 = false;
                    }
                } else {
                    z16 = false;
                }
                objQ = hb.a.n(z16, o0VarE);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    if (dVar != null) {
                        tVar = dVar.f159293b;
                        cVar = dVar.f159292a;
                        dDoubleValue = -1.0d;
                        if (cVar != null || (listD = cVar.d()) == null) {
                            dVar2 = null;
                        } else {
                            Iterator<T> it = listD.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    obj = null;
                                    break;
                                }
                                Object next = it.next();
                                sh0.c.d dVar3 = (sh0.c.d) next;
                                Double d14 = dVar3.f159290c;
                                if ((d14 != null ? d14.doubleValue() : -1.0d) < 0.0d) {
                                    Double d15 = dVar3.f159291d;
                                    if ((d15 != null ? d15.doubleValue() : -1.0d) >= 0.0d) {
                                    }
                                }
                                obj = next;
                                break;
                            }
                            dVar2 = (sh0.c.d) obj;
                        }
                        if (tVar != null || (userDailySummary2 = tVar.getUserDailySummary()) == null || (payload2 = userDailySummary2.getPayload()) == null || (floorsAscended = payload2.getFloorsAscended()) == null) {
                            dDoubleValue2 = -1.0d;
                        } else {
                            dDoubleValue2 = floorsAscended.doubleValue();
                        }
                        if (tVar != null && (userDailySummary = tVar.getUserDailySummary()) != null && (payload = userDailySummary.getPayload()) != null && (floorsDescended = payload.getFloorsDescended()) != null) {
                            dDoubleValue = floorsDescended.doubleValue();
                        }
                        if (dVar2 == null || (dDoubleValue2 < 0.0d && dDoubleValue < 0.0d)) {
                            z16 = false;
                        } else {
                            z16 = true;
                        }
                    } else {
                        z16 = false;
                    }
                    objQ = hb.a.n(z16, o0VarE);
                }
            }
            p1 p1Var = (p1) objQ;
            if (z15) {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -10053084, R.string.lbl_daily_timeline, o0VarE, false);
            } else {
                o0VarE.C(-9973600);
                strJ = new pi0.e((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b)).j(dateTime, pi0.d.DATE_SHORT_MONTH_FOR_PAST_YEAR_SHOW_TODAY);
                o0VarE.g0(false);
            }
            String str = strJ;
            String strQ = y.Q(o0VarE, z15 ? R.string.msg_press_hold_chart_for_more : R.string.msg_double_tap_to_enable_functions);
            r rVarL = c2.l.l(u1.n.e(r.S, k.b(d92.b.f58623a, o0VarE), m1.f128891a));
            z3.e eVarC = z3.f.c(-489928842, new g(dateTime, iVar, lVar5, lVar, p1Var, dVar, z14, strQ, lVar6, lVar7, 0), o0VarE);
            o0Var = o0VarE;
            m92.o.a(rVarL, str, null, null, eVarC, null, null, o0Var, 24576, 108);
            x1 x1Var2 = n.f135158a;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c(dateTime, dVar, z14, z15, iVar, lVar, lVar2, lVar3, lVar4, i14, 1);
        }
    }
}

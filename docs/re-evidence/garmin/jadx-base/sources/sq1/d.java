package sq1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import cw1.o1;
import e23.l;
import g6.f;
import gl1.y;
import h4.r;
import java.util.List;
import jq1.g;
import m92.o;
import o4.m1;
import org.joda.time.DateTime;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;
import tf0.i;
import tn.k;

/* JADX INFO: loaded from: classes10.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f160533a;

    static {
        f.a aVar = f.f75994b;
        f160533a = 290;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x012a  */
    /* JADX WARN: Code duplicated, block: B:103:0x0135  */
    /* JADX WARN: Code duplicated, block: B:104:0x013a  */
    /* JADX WARN: Code duplicated, block: B:106:0x013d  */
    /* JADX WARN: Code duplicated, block: B:107:0x013f  */
    /* JADX WARN: Code duplicated, block: B:112:0x0147  */
    /* JADX WARN: Code duplicated, block: B:117:0x0154  */
    /* JADX WARN: Code duplicated, block: B:119:0x0157  */
    /* JADX WARN: Code duplicated, block: B:120:0x0159  */
    /* JADX WARN: Code duplicated, block: B:137:0x0142 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:? A[LOOP:0: B:99:0x0124->B:140:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x0117 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x0119  */
    /* JADX WARN: Code duplicated, block: B:98:0x0120  */
    public static final void a(DateTime dateTime, g gVar, i iVar, boolean z14, boolean z15, l<? super Boolean, Unit> lVar, l<? super DateTime, Unit> lVar2, l<? super Boolean, Unit> lVar3, l<? super Boolean, Unit> lVar4, m mVar, int i14) {
        l<? super Boolean, Unit> lVar5;
        l<? super DateTime, Unit> lVar6;
        l<? super Boolean, Unit> lVar7;
        l<? super Boolean, Unit> lVar8;
        o0 o0Var;
        boolean z16;
        List<jq1.f> list;
        Object obj;
        jq1.b bVar;
        int iIntValue;
        Integer num;
        Integer num2;
        int iIntValue2;
        boolean z17;
        String strJ;
        iVar.getClass();
        lVar.getClass();
        lVar2.getClass();
        lVar3.getClass();
        lVar4.getClass();
        o0 o0VarE = mVar.E(-2500486);
        int i15 = (i14 & 6) == 0 ? (o0VarE.r(dateTime) ? 4 : 2) | i14 : i14;
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(gVar) : o0VarE.r(gVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= (i14 & 512) == 0 ? o0VarE.B(iVar) : o0VarE.r(iVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.h(z14) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.h(z15) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            lVar5 = lVar;
            i15 |= o0VarE.r(lVar5) ? 131072 : 65536;
        } else {
            lVar5 = lVar;
        }
        if ((1572864 & i14) == 0) {
            lVar6 = lVar2;
            i15 |= o0VarE.r(lVar6) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        } else {
            lVar6 = lVar2;
        }
        if ((12582912 & i14) == 0) {
            lVar7 = lVar3;
            i15 |= o0VarE.r(lVar7) ? 8388608 : 4194304;
        } else {
            lVar7 = lVar3;
        }
        if ((100663296 & i14) == 0) {
            lVar8 = lVar4;
            i15 |= o0VarE.r(lVar8) ? 67108864 : 33554432;
        } else {
            lVar8 = lVar4;
        }
        if (o0VarE.n(i15 & 1, (38347923 & i15) != 38347922)) {
            x1 x1Var = n.f135158a;
            boolean z18 = (i15 & 112) == 32 || ((i15 & 64) != 0 && o0VarE.B(gVar));
            Object objQ = o0VarE.q();
            if (z18) {
                if (gVar != null) {
                    List<Long> list2 = pq1.i.f139597a;
                    list = gVar.f100010b;
                    obj = null;
                    if (list != null) {
                        for (Object obj2 : list) {
                            num2 = ((jq1.f) obj2).f100004c;
                            if (num2 != null) {
                                iIntValue2 = num2.intValue();
                            } else {
                                iIntValue2 = 0;
                            }
                            if (iIntValue2 > 0) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            if (z17) {
                                obj = obj2;
                                break;
                            }
                        }
                        obj = (jq1.f) obj;
                    }
                    if (obj != null) {
                        z16 = false;
                    } else {
                        bVar = gVar.f100009a;
                        if (bVar != null) {
                            iIntValue = 0;
                        } else {
                            iIntValue = 0;
                        }
                        if (iIntValue > 0) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                    }
                } else {
                    z16 = false;
                }
                objQ = hb.a.n(z16, o0VarE);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    if (gVar != null) {
                        List<Long> list3 = pq1.i.f139597a;
                        list = gVar.f100010b;
                        obj = null;
                        if (list != null) {
                            while (r0.hasNext()) {
                                num2 = ((jq1.f) obj2).f100004c;
                                if (num2 != null) {
                                    iIntValue2 = num2.intValue();
                                } else {
                                    iIntValue2 = 0;
                                }
                                if (iIntValue2 > 0) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                if (z17) {
                                    obj = obj2;
                                    break;
                                }
                            }
                            obj = (jq1.f) obj;
                        }
                        if (obj != null) {
                            z16 = false;
                        } else {
                            bVar = gVar.f100009a;
                            if (bVar != null || (num = bVar.f99981c) == null) {
                                iIntValue = 0;
                            } else {
                                iIntValue = num.intValue();
                            }
                            if (iIntValue > 0) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                        }
                    } else {
                        z16 = false;
                    }
                    objQ = hb.a.n(z16, o0VarE);
                }
            }
            p1 p1Var = (p1) objQ;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            if (z15) {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1476992512, R.string.lbl_daily_timeline, o0VarE, false);
            } else {
                o0VarE.C(-1476913431);
                o0VarE.g0(false);
                strJ = new pi0.e(context).j(dateTime, pi0.d.DATE_SHORT_MONTH_FOR_PAST_YEAR_SHOW_TODAY);
            }
            String str = strJ;
            String strQ = y.Q(o0VarE, z15 ? R.string.msg_press_hold_chart_for_more : R.string.msg_double_tap_to_enable_functions);
            r rVarL = c2.l.l(u1.n.e(r.S, k.b(d92.b.f58623a, o0VarE), m1.f128891a));
            z3.e eVarC = z3.f.c(1455186938, new ci0.g(dateTime, iVar, lVar6, lVar5, p1Var, gVar, z14, strQ, lVar7, lVar8, 9), o0VarE);
            o0Var = o0VarE;
            o.a(rVarL, str, null, null, eVarC, null, null, o0Var, 24576, 108);
            x1 x1Var2 = n.f135158a;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o1(dateTime, gVar, iVar, z14, z15, lVar, lVar2, lVar3, lVar4, i14, 4);
        }
    }
}

package kb0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.room.a0;
import b63.v;
import c22.j0;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import gl1.y;
import i3.bi;
import i3.e9;
import i3.mc;
import i3.si;
import java.time.LocalTime;
import java.util.List;
import l72.c1;
import l72.w;
import o53.b0;
import p005kotlin.Unit;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class m {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final boolean z14, final v vVar, final v vVar2, final List list, final boolean z15, final mb0.h hVar, final e23.l lVar, final e23.l lVar2, final e23.l lVar3, final e23.a aVar, final e23.l lVar4, final e23.a aVar2, final e23.a aVar3, final e23.a aVar4, p3.m mVar, final int i14, final int i15) {
        int i16;
        v vVar3;
        List list2;
        int i17;
        o0 o0Var;
        boolean z16;
        boolean z17;
        int i18;
        int i19;
        list.getClass();
        lVar.getClass();
        lVar2.getClass();
        lVar3.getClass();
        aVar.getClass();
        o0 o0VarP = a0.p(lVar4, aVar2, mVar, 484734235);
        if ((i14 & 6) == 0) {
            i16 = (o0VarP.h(z14) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarP.r(vVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            vVar3 = vVar2;
            i16 |= o0VarP.r(vVar3) ? 256 : 128;
        } else {
            vVar3 = vVar2;
        }
        if ((i14 & 3072) == 0) {
            list2 = list;
            i16 |= o0VarP.r(list2) ? 2048 : 1024;
        } else {
            list2 = list;
        }
        if ((i14 & 24576) == 0) {
            i16 |= o0VarP.h(z15) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i16 |= o0VarP.k(hVar == null ? -1 : hVar.ordinal()) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i16 |= o0VarP.r(lVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i14 & 12582912) == 0) {
            i16 |= o0VarP.r(lVar2) ? 8388608 : 4194304;
        }
        if ((i14 & 100663296) == 0) {
            i16 |= o0VarP.r(lVar3) ? 67108864 : 33554432;
        }
        if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
            i16 |= o0VarP.r(aVar) ? 536870912 : 268435456;
        }
        if ((i15 & 6) == 0) {
            i17 = i15 | (o0VarP.r(lVar4) ? 4 : 2);
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= o0VarP.r(aVar2) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i17 |= o0VarP.r(aVar3) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i17 |= o0VarP.r(aVar4) ? 2048 : 1024;
        }
        int i24 = i17;
        if (o0VarP.n(i16 & 1, ((i16 & 306783379) == 306783378 && (i24 & 1171) == 1170) ? false : true)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarP.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarP.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = l0.j(t13.h.f161748a, o0VarP);
                o0VarP.K(objQ);
            }
            b0 b0Var = (b0) objQ;
            int i25 = i16;
            mc mcVarF = e9.f(false, null, o0VarP, 6, 2);
            Object objQ2 = o0VarP.q();
            if (objQ2 == c2565a) {
                objQ2 = p0.n(mb0.g.NONE);
                o0VarP.K(objQ2);
            }
            p1 p1Var = (p1) objQ2;
            if (z14) {
                o0VarP.C(1038570378);
                w wVar = w.f111301a;
                z3.e eVarC = z3.f.c(454761168, new ak0.p(aVar4, 13), o0VarP);
                z3.e eVarC2 = z3.f.c(-622969513, new hl1.i(aVar3, 17), o0VarP);
                boolean zR = ((i24 & 7168) == 2048) | o0VarP.r(b0Var) | o0VarP.B(mcVarF);
                Object objQ3 = o0VarP.q();
                if (zR || objQ3 == c2565a) {
                    objQ3 = new eu.b(b0Var, mcVarF, aVar4, 4);
                    o0VarP.K(objQ3);
                }
                wVar.e(eVarC, eVarC2, (e23.a) objQ3, mcVarF, false, null, z3.f.c(951949057, new ak0.h(context, (Object) vVar, (Object) vVar3, (Object) list2, (Object) lVar3, p1Var, 13), o0VarP), o0VarP, 12607542, 96);
                o0Var = o0VarP;
                if (((mb0.g) p1Var.getF182175a()) != mb0.g.NONE) {
                    o0Var.C(1042143159);
                    boolean z18 = ((mb0.g) p1Var.getF182175a()) == mb0.g.BED_TIME;
                    LocalTime localTime = (z18 ? vVar : vVar2).f16219a;
                    if (z18) {
                        i18 = 1042282938;
                        i19 = R.string.sleep_lbl_start_time;
                        z17 = false;
                    } else {
                        z17 = false;
                        i18 = 1042365243;
                        i19 = R.string.sleep_lbl_wake_time;
                    }
                    String strJ = com.airbnb.lottie.animation.keyframe.a.j(o0Var, i18, i19, o0Var, z17);
                    int hour = localTime.getHour();
                    int minute = localTime.getMinute();
                    j0.f23099a.getClass();
                    si siVarZ = bi.z(hour, minute, j0.D(), o0Var, 0, 0);
                    String strQ = y.Q(o0Var, R.string.lbl_ok);
                    String strQ2 = y.Q(o0Var, R.string.lbl_cancel);
                    Object objQ4 = o0Var.q();
                    if (objQ4 == c2565a) {
                        objQ4 = new k(p1Var, 2);
                        o0Var.K(objQ4);
                    }
                    e23.a aVar5 = (e23.a) objQ4;
                    boolean zH = o0Var.h(z18) | ((i25 & 3670016) == 1048576) | ((i25 & 29360128) == 8388608);
                    Object objQ5 = o0Var.q();
                    if (zH || objQ5 == c2565a) {
                        objQ5 = new b(z18, lVar, lVar2, p1Var, 1);
                        o0Var.K(objQ5);
                    }
                    g82.e.a(strJ, siVarZ, true, strQ2, aVar5, strQ, (e23.p) objQ5, o0Var, 24960);
                    o0Var.g0(false);
                } else {
                    o0Var.C(1043296359);
                    o0Var.g0(false);
                }
                if (z15) {
                    o0Var.C(1043353337);
                    c1.f110940a.a(false, y.Q(o0Var, R.string.overlapping_schedules_title), y.Q(o0Var, R.string.overlapping_schedules_message), null, null, y.Q(o0Var, R.string.lbl_ok), false, false, aVar, null, aVar, o0Var, ((i25 >> 3) & 234881024) | 6, (i25 >> 27) & 14, 728);
                    o0Var.g0(false);
                } else {
                    o0Var.C(1043797319);
                    o0Var.g0(false);
                }
                if (hVar != null) {
                    o0Var.C(1043881329);
                    c1 c1Var = c1.f110940a;
                    String strQ3 = y.Q(o0Var, R.string.edit_previously_scheduled_day_title);
                    String strQ4 = y.Q(o0Var, R.string.edit_previously_scheduled_day_message);
                    String strQ5 = y.Q(o0Var, R.string.lbl_change);
                    String strQ6 = y.Q(o0Var, R.string.common_cancel);
                    boolean z19 = ((i24 & 14) == 4) | ((i25 & 458752) == 131072);
                    Object objQ6 = o0Var.q();
                    if (z19 || objQ6 == c2565a) {
                        objQ6 = new k11.h(5, lVar4, hVar);
                        o0Var.K(objQ6);
                    }
                    c1Var.a(false, strQ3, strQ4, null, null, strQ5, false, false, (e23.a) objQ6, strQ6, aVar2, o0Var, 6, (i24 >> 3) & 14, 216);
                    z16 = false;
                    o0Var.g0(false);
                } else {
                    z16 = false;
                    o0Var.C(1044404423);
                    o0Var.g0(false);
                }
                o0Var.g0(z16);
            } else {
                o0Var = o0VarP;
                o0Var.C(1044410375);
                o0Var.g0(false);
            }
        } else {
            o0Var = o0VarP;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: kb0.j
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p0.t(i14 | 1);
                    int iT2 = p0.t(i15);
                    m.a(z14, vVar, vVar2, list, z15, hVar, lVar, lVar2, lVar3, aVar, lVar4, aVar2, aVar3, aVar4, (p3.m) obj, iT, iT2);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}

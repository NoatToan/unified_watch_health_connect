package e52;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import cw1.o1;
import e23.l;
import java.util.List;
import m92.o;
import org.joda.time.DateTime;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;
import tf0.i;

/* JADX INFO: loaded from: classes10.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f63088a;

    static {
        g6.f.a aVar = g6.f.f75994b;
        f63088a = 290;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0137  */
    public static final void a(z42.g gVar, DateTime dateTime, i iVar, boolean z14, boolean z15, l<? super Boolean, Unit> lVar, l<? super DateTime, Unit> lVar2, e23.a<Unit> aVar, l<? super Boolean, Unit> lVar3, m mVar, int i14) {
        l<? super DateTime, Unit> lVar4;
        o0 o0Var;
        String strJ;
        boolean z16;
        Integer pushes;
        iVar.getClass();
        lVar.getClass();
        lVar2.getClass();
        aVar.getClass();
        lVar3.getClass();
        o0 o0VarE = mVar.E(-2089056711);
        int i15 = (i14 & 6) == 0 ? (o0VarE.r(gVar) ? 4 : 2) | i14 : i14;
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(dateTime) ? 32 : 16;
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
            i15 |= o0VarE.r(lVar) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            lVar4 = lVar2;
            i15 |= o0VarE.r(lVar4) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        } else {
            lVar4 = lVar2;
        }
        if ((12582912 & i14) == 0) {
            i15 |= o0VarE.r(aVar) ? 8388608 : 4194304;
        }
        if ((100663296 & i14) == 0) {
            i15 |= o0VarE.r(lVar3) ? 67108864 : 33554432;
        }
        if (o0VarE.n(i15 & 1, (38347923 & i15) != 38347922)) {
            x1 x1Var = n.f135158a;
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            if (objQ == m.a.f135155b) {
                if (gVar != null) {
                    List<z42.f> list = gVar.f202397b;
                    Object obj = null;
                    if (list != null) {
                        for (Object obj2 : list) {
                            Integer pushes2 = ((z42.f) obj2).getPushes();
                            if ((pushes2 != null ? pushes2.intValue() : 0) > 0) {
                                obj = obj2;
                                break;
                            }
                        }
                        obj = (z42.f) obj;
                    }
                    if (obj == null) {
                        z42.b bVar = gVar.f202396a;
                        z16 = ((bVar == null || (pushes = bVar.getPushes()) == null) ? 0 : pushes.intValue()) > 0;
                    }
                }
                objQ = hb.a.n(z16, o0VarE);
            }
            p1 p1Var = (p1) objQ;
            String strJ2 = z15 ? com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1011861770, R.string.msg_press_hold_chart_for_more, o0VarE, false) : com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1011773327, R.string.msg_double_tap_to_enable_functions, o0VarE, false);
            if (z15) {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1011639903, R.string.lbl_daily_timeline, o0VarE, false);
            } else {
                o0VarE.C(-1011560419);
                strJ = new pi0.e((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b)).j(dateTime, pi0.d.DATE_SHORT_MONTH_FOR_PAST_YEAR_SHOW_TODAY);
                o0VarE.g0(false);
            }
            o0Var = o0VarE;
            o.a(null, strJ, null, null, z3.f.c(584749497, new ci0.g(dateTime, iVar, lVar4, lVar, p1Var, gVar, z14, strJ2, aVar, lVar3), o0VarE), null, null, o0Var, 24576, 109);
            x1 x1Var2 = n.f135158a;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o1(gVar, dateTime, iVar, z14, z15, lVar, lVar2, aVar, lVar3, i14);
        }
    }
}

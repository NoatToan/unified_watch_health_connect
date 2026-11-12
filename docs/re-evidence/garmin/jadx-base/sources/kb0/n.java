package kb0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b63.v;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import gl1.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p13.d0;
import p13.h0;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class n {
    /* JADX WARN: Code duplicated, block: B:89:0x01a5  */
    public static final void a(mb0.f fVar, boolean z14, e23.l lVar, e23.l lVar2, e23.l lVar3, e23.l lVar4, e23.a aVar, e23.a aVar2, e23.a aVar3, e23.l lVar5, e23.a aVar4, e23.a aVar5, p3.m mVar, int i14) {
        o0 o0Var;
        int i15;
        int i16;
        int i17;
        String strJ;
        fVar.getClass();
        mb0.a aVar6 = fVar.f117731b;
        mb0.d dVar = fVar.f117732c;
        lVar.getClass();
        lVar2.getClass();
        lVar3.getClass();
        lVar4.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        lVar5.getClass();
        aVar4.getClass();
        o0 o0VarE = mVar.E(811795280);
        int i18 = i14 | (o0VarE.r(fVar) ? 4 : 2) | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128) | (o0VarE.r(lVar2) ? 2048 : 1024) | (o0VarE.r(lVar3) ? 16384 : 8192) | (o0VarE.r(lVar4) ? 131072 : 65536) | (o0VarE.r(aVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.r(aVar2) ? 8388608 : 4194304) | (o0VarE.r(aVar3) ? 67108864 : 33554432) | (o0VarE.r(lVar5) ? 536870912 : 268435456);
        int i19 = (o0VarE.r(aVar4) ? 4 : 2) | (o0VarE.r(aVar5) ? 32 : 16);
        if (o0VarE.n(i18 & 1, ((i18 & 306783379) == 306783378 && (i19 & 19) == 18) ? false : true)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            List<z80.j> list = aVar6.f117712c;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                d0.v(arrayList, ((z80.j) it.next()).f203062a);
                i18 = i18;
            }
            int i24 = i18;
            boolean z15 = h0.g1(arrayList).size() < mb0.h.f117748m.getF134973e();
            if (z15) {
                i15 = R.string.edit_or_add_schedules_sleep_windows_title;
            } else {
                i15 = z14 ? R.string.returning_user_sleep_schedule_title : R.string.review_sleep_windows_title;
            }
            String strQ = y.Q(o0VarE, i15);
            if (z15) {
                o0VarE.C(-1548750728);
                strJ = y.P(R.string.missing_sleep_schedule_sleep_windows_text, new Object[]{y.Q(o0VarE, R.string.lbl_next)}, o0VarE);
                o0VarE.g0(false);
                strQ = strQ;
            } else {
                if (z14) {
                    i16 = -1548745557;
                    i17 = R.string.returning_user_sleep_schedule_text;
                } else {
                    i16 = -1548743134;
                    i17 = R.string.review_sleep_windows_text;
                }
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, i16, i17, o0VarE, false);
            }
            String strQ2 = y.Q(o0VarE, R.string.lbl_next);
            boolean z16 = (i19 & 112) == 32;
            Object objQ = o0VarE.q();
            if (z16) {
                objQ = new j22.d(aVar5, 27);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new j22.d(aVar5, 27);
                    o0VarE.K(objQ);
                }
            }
            o0Var = o0VarE;
            da0.p.b("user_profile_review_sleep_schedules_screen", strQ, null, strJ, null, strQ2, (e23.a) objQ, false, null, null, false, null, null, false, false, null, null, null, null, null, null, z3.f.c(975120464, new gw1.e(fVar, 18, lVar, context), o0VarE), o0Var, 6, 0, 384, 4194196);
            boolean z17 = dVar.f117723a != null;
            v vVarA = dVar.f117725c;
            if (vVarA == null) {
                v.INSTANCE.getClass();
                vVarA = v.Companion.a(79200);
            }
            v vVar = vVarA;
            v vVarA2 = dVar.f117726d;
            if (vVarA2 == null) {
                v.INSTANCE.getClass();
                vVarA2 = v.Companion.a(21600);
            }
            int i25 = i24 >> 12;
            m.a(z17, vVar, vVarA2, dVar.f117724b, aVar6.f117714e, dVar.f117727e, lVar2, lVar3, lVar4, aVar3, lVar5, aVar4, aVar, aVar2, o0Var, ((i24 << 9) & 267911168) | ((i24 << 3) & 1879048192), ((i24 >> 27) & 14) | ((i19 << 3) & 112) | (i25 & 896) | (i25 & 7168));
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ck0.i(fVar, z14, lVar, lVar2, lVar3, lVar4, aVar, aVar2, aVar3, lVar5, aVar4, aVar5, i14);
        }
    }
}

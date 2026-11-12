package r11;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b63.v;
import c2.n0;
import c2.n3;
import c2.x2;
import c22.c3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.nutrition.presentation.NutritionActivity;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import ds.e0;
import e23.p;
import gl1.y;
import h4.r;
import i3.d5;
import i3.fe;
import i3.mh;
import i3.w4;
import java.util.List;
import l72.c1;
import p005kotlin.Unit;
import p3.l0;
import p3.n;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;
import qk0.o;

/* JADX INFO: loaded from: classes9.dex */
public final class j {
    /* JADX WARN: Code duplicated, block: B:96:0x0174  */
    public static final void a(v21.e eVar, s11.d dVar, fe feVar, e23.l lVar, e23.l lVar2, e23.l lVar3, e23.l lVar4, e23.l lVar5, e23.a aVar, NutritionActivity.g gVar, e23.a aVar2, e23.a aVar3, p3.m mVar, int i14) {
        int i15;
        e23.l lVar6;
        e23.l lVar7;
        o0 o0Var;
        eVar.getClass();
        dVar.getClass();
        long j8 = dVar.f155893o;
        feVar.getClass();
        lVar.getClass();
        lVar2.getClass();
        lVar3.getClass();
        lVar4.getClass();
        lVar5.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        o0 o0VarE = mVar.E(-931226938);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(eVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(dVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(feVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            lVar6 = lVar;
            i15 |= o0VarE.r(lVar6) ? 2048 : 1024;
        } else {
            lVar6 = lVar;
        }
        if ((i14 & 24576) == 0) {
            lVar7 = lVar2;
            i15 |= o0VarE.r(lVar7) ? 16384 : 8192;
        } else {
            lVar7 = lVar2;
        }
        if ((i14 & 196608) == 0) {
            i15 |= o0VarE.r(lVar3) ? 131072 : 65536;
        }
        if ((i14 & 1572864) == 0) {
            i15 |= o0VarE.r(lVar4) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i14 & 12582912) == 0) {
            i15 |= o0VarE.r(lVar5) ? 8388608 : 4194304;
        }
        if ((100663296 & i14) == 0) {
            i15 |= o0VarE.r(aVar) ? 67108864 : 33554432;
        }
        if ((805306368 & i14) == 0) {
            i15 |= o0VarE.r(gVar) ? 536870912 : 268435456;
        }
        int i16 = (o0VarE.r(aVar2) ? (char) 4 : (char) 2) | (o0VarE.r(aVar3) ? ' ' : (char) 16);
        if (o0VarE.n(i15 & 1, ((i15 & 306783379) == 306783378 && (i16 & 19) == 18) ? false : true)) {
            x1 x1Var = n.f135158a;
            d5 d5VarE = w4.e(Long.valueOf(j8), dVar.f155894p, null, dVar.f155882d, 0, dVar.f155881c, o0VarE, 0, 20);
            Long lValueOf = Long.valueOf(j8);
            Long l14 = dVar.f155894p;
            boolean zB = o0VarE.B(d5VarE) | o0VarE.r(dVar);
            Object objQ = o0VarE.q();
            p3.m.a aVar4 = p3.m.f135153a;
            if (zB) {
                objQ = new h(d5VarE, dVar, null);
                o0VarE.K(objQ);
            } else {
                aVar4.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new h(d5VarE, dVar, null);
                    o0VarE.K(objQ);
                }
            }
            l0.f(lValueOf, l14, (p) objQ, o0VarE);
            Object[] objArr = new Object[0];
            Object objQ2 = o0VarE.q();
            aVar4.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ2 == c2565a) {
                objQ2 = new qy0.a(12);
                o0VarE.K(objQ2);
            }
            p1 p1Var = (p1) d4.a.e(objArr, (e23.a) objQ2, o0VarE, 48);
            if (dVar.f155889k) {
                o0VarE.C(-986798433);
                c1 c1Var = c1.f110940a;
                String strQ = y.Q(o0VarE, R.string.lbl_error_occurred);
                String strQ2 = y.Q(o0VarE, R.string.msg_sorry_something_went_wrong);
                String strQ3 = y.Q(o0VarE, R.string.lbl_cancel);
                String strQ4 = y.Q(o0VarE, R.string.lbl_try_again);
                int i17 = i16 & 112;
                boolean z14 = (i17 == 32) | ((i16 & 14) == 4);
                Object objQ3 = o0VarE.q();
                if (z14 || objQ3 == c2565a) {
                    objQ3 = new at1.e(aVar3, aVar2, 8);
                    o0VarE.K(objQ3);
                }
                e23.a<Unit> aVar5 = (e23.a) objQ3;
                boolean z15 = i17 == 32;
                Object objQ4 = o0VarE.q();
                if (z15 || objQ4 == c2565a) {
                    objQ4 = new o(aVar3, 8);
                    o0VarE.K(objQ4);
                }
                c1Var.a(false, strQ, strQ2, null, null, strQ4, false, false, aVar5, strQ3, (e23.a) objQ4, o0VarE, 0, 0, 217);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-986303332);
                o0VarE.g0(false);
            }
            boolean z16 = dVar.f155888j;
            z3.e eVarC = z3.f.c(111156555, new pp.g(dVar, 13, gVar, aVar), o0VarE);
            z3.e eVarC2 = z3.f.c(-1604442036, new p21.b(feVar, 8), o0VarE);
            n0 n0Var = n3.f22788a;
            o0Var = o0VarE;
            z02.d.a(z16, eVarC, eVarC2, null, new n0(0, 0, 0, 0), z3.f.c(1838696783, new c42.d(dVar, p1Var, lVar5, lVar7, eVar, lVar6, d5VarE, lVar3, lVar4), o0Var), o0Var, 197040, 8);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ll.a(eVar, dVar, feVar, lVar, lVar2, lVar3, lVar4, lVar5, aVar, gVar, aVar2, aVar3, i14);
        }
    }

    public static final void b(boolean z14, v21.e eVar, v vVar, List<b11.l> list, Long l14, e23.l<? super b11.l, Unit> lVar, e23.a<Unit> aVar, c3 c3Var, p3.m mVar, int i14) {
        float f14;
        r.a aVar2;
        boolean z15;
        j92.e eVar2;
        int i15;
        o0 o0VarE = mVar.E(665907724);
        int i16 = i14 | (o0VarE.h(z14) ? 4 : 2) | (o0VarE.r(eVar) ? 32 : 16) | (o0VarE.r(vVar) ? 256 : 128) | (o0VarE.r(list) ? 2048 : 1024) | (o0VarE.B(l14) ? 16384 : 8192) | (o0VarE.r(lVar) ? 131072 : 65536) | (o0VarE.r(aVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.r(c3Var) ? 8388608 : 4194304);
        if (o0VarE.n(i16 & 1, (4793491 & i16) != 4793490)) {
            x1 x1Var = n.f135158a;
            boolean z16 = c3Var != null;
            r.a aVar3 = r.S;
            r rVarF = x2.f(aVar3, 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar3 = j92.b.f97899b;
            float f15 = eVar3.f97920e;
            if (z16) {
                f14 = 0;
                g6.f.a aVar4 = g6.f.f75994b;
            } else {
                bVar.getClass();
                f14 = eVar3.f97920e;
            }
            r rVarC = c2.l.C(rVarF, 0.0f, f15, 0.0f, f14, 5);
            if (z14) {
                o0VarE.C(-396299069);
                int i17 = ((i16 << 6) & 234881024) | 1597440;
                aVar2 = aVar3;
                eVar2 = eVar3;
                z15 = false;
                i15 = 1;
                l72.p2.f111205a.g(y.Q(o0VarE, R.string.lbl_time), rVarC, null, null, z3.f.c(-1049245902, new q72.f(14, eVar, vVar), o0VarE), false, true, aVar, o0VarE, i17, TsExtractor.TS_STREAM_TYPE_AC4);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            } else {
                aVar2 = aVar3;
                z15 = false;
                eVar2 = eVar3;
                i15 = 1;
                o0VarE.C(-395893992);
                y01.p.a(rVarC, list, l14, lVar, false, o0VarE, (i16 >> 6) & 8176, 16);
                o0VarE.g0(false);
            }
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            if (c3Var == null) {
                o0VarE.C(-395627982);
                o0VarE.g0(z15);
            } else {
                r rVarA = c2.l.A(e0.g(o0VarE, -395627981, aVar2, 1.0f, bVar), 0.0f, eVar2.f97917b, i15);
                String strA = dh.b.A(context, c3Var);
                d92.b.f58624b.getClass();
                o0 o0Var = o0VarE;
                mh.c(strA, rVarA, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0VarE), o0Var, 0, 0, 131068);
                o0VarE = o0Var;
                o0VarE.g0(z15);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e11.n(z14, eVar, vVar, list, l14, lVar, aVar, c3Var, i14);
        }
    }
}

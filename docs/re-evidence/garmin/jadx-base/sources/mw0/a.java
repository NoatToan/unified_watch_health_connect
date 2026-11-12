package mw0;

import android.content.Context;
import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import p005kotlin.Unit;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class a {
    /* JADX WARN: Code duplicated, block: B:51:0x0092  */
    /* JADX WARN: Code duplicated, block: B:52:0x0094  */
    /* JADX WARN: Code duplicated, block: B:55:0x009d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x009f  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    public static final <T extends View> void a(String str, boolean z14, e23.l<? super Context, ? extends T> lVar, e23.l<? super T, Unit> lVar2, e23.p<? super p3.m, ? super Integer, Unit> pVar, e23.p<? super p3.m, ? super Integer, Unit> pVar2, p3.m mVar, int i14, int i15) {
        int i16;
        e23.p<? super p3.m, ? super Integer, Unit> pVar3;
        boolean z15;
        p2 p2VarI0;
        e23.p<? super p3.m, ? super Integer, Unit> pVar4;
        int i17;
        str.getClass();
        lVar.getClass();
        lVar2.getClass();
        o0 o0VarE = mVar.E(294844293);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(str) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.h(z14) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.r(lVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= o0VarE.r(lVar2) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i16 |= o0VarE.r(pVar) ? 16384 : 8192;
        }
        int i18 = i15 & 32;
        if (i18 == 0) {
            if ((196608 & i14) == 0) {
                pVar3 = pVar2;
                i16 |= o0VarE.r(pVar3) ? 131072 : 65536;
            }
            if ((74899 & i16) != 74898) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (o0VarE.n(i16 & 1, z15)) {
                if (i18 != 0) {
                    pVar4 = null;
                } else {
                    pVar4 = pVar3;
                }
                x1 x1Var = p3.n.f135158a;
                h4.r.a aVar = h4.r.S;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                h4.r rVarC = c2.l.C(aVar, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13);
                if (z14) {
                    i17 = R.string.lbl_daily_averages;
                } else {
                    i17 = R.string.lbl_weekly_averages;
                }
                m92.o.a(rVarC, str, y.Q(o0VarE, i17), null, z3.f.c(1268972549, new lb0.a(lVar, 27, lVar2, pVar), o0VarE), pVar4, null, o0VarE, ((i16 << 3) & 112) | 24576 | (i16 & 458752), 72);
                pVar3 = pVar4;
            } else {
                o0VarE.e();
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new d62.o(str, z14, lVar, lVar2, pVar, pVar3, i14, i15);
            }
        }
        i16 |= 196608;
        pVar3 = pVar2;
        if ((74899 & i16) != 74898) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (o0VarE.n(i16 & 1, z15)) {
            if (i18 != 0) {
                pVar4 = null;
            } else {
                pVar4 = pVar3;
            }
            x1 x1Var2 = p3.n.f135158a;
            h4.r.a aVar2 = h4.r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarC2 = c2.l.C(aVar2, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13);
            if (z14) {
                i17 = R.string.lbl_daily_averages;
            } else {
                i17 = R.string.lbl_weekly_averages;
            }
            m92.o.a(rVarC2, str, y.Q(o0VarE, i17), null, z3.f.c(1268972549, new lb0.a(lVar, 27, lVar2, pVar), o0VarE), pVar4, null, o0VarE, ((i16 << 3) & 112) | 24576 | (i16 & 458752), 72);
            pVar3 = pVar4;
        } else {
            o0VarE.e();
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d62.o(str, z14, lVar, lVar2, pVar, pVar3, i14, i15);
        }
    }
}

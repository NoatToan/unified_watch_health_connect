package wq0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.t2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import i3.i7;
import i3.mh;
import j02.h0;
import l72.r1;
import o4.d0;
import p3.o0;
import p3.p2;
import p3.x1;
import s5.x0;
import w52.k0;

/* JADX INFO: loaded from: classes8.dex */
public final class b0 {
    /* JADX WARN: Code duplicated, block: B:31:0x009a  */
    public static final void a(t2 t2Var, a0.b bVar, l lVar, int i14, p3.m mVar, int i15) {
        o0 o0VarE = mVar.E(-1521551355);
        int i16 = i15 | (o0VarE.r(bVar) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128) | (o0VarE.k(i14) ? 2048 : 1024);
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            tq0.a aVar = bVar.f186583c;
            tq0.f fVar = bVar.f186582b;
            String str = aVar.f166038c;
            if (str == null) {
                str = "";
            }
            String strP = oi0.c.P(p13.x.k(gl1.y.Q(o0VarE, fVar.f166056b ? R.string.lbl_remove : R.string.lbl_add), str));
            h4.r.a aVar2 = h4.r.S;
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.c cVar = j92.b.f97901d;
            h4.r rVarQ = x2.q(aVar2, cVar.f97904c);
            boolean zR = o0VarE.r(lVar) | o0VarE.r(bVar);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new b(lVar, bVar, 2);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new b(lVar, bVar, 2);
                    o0VarE.K(objQ);
                }
            }
            h4.r rVarD = u1.w.d(rVarQ, false, null, null, (e23.a) objQ, 15);
            t4.d dVarA = n5.c.a(i14, o0VarE, (i16 >> 9) & 14);
            d0.f128823b.getClass();
            i7.a(dVarA, strP, rVarD, d0.f128832k, o0VarE, 3072, 0);
            d92.b.f58624b.getClass();
            x0 x0VarB = d92.c.b(j92.f.f97931h, o0VarE);
            bVar2.getClass();
            mh.c(str, t2Var.a(c2.l.A(aVar2, j92.b.f97899b.f97920e, 0.0f, 2), 1.0f, true), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 131068);
            o0VarE = o0VarE;
            if (fVar.f166056b) {
                o0VarE.C(549446259);
                bVar2.getClass();
                i7.a(n5.c.a(R.drawable.reorder, o0VarE, 0), gl1.y.Q(o0VarE, R.string.lbl_reorder), x2.q(aVar2, cVar.f97904c), sn.a.y(o0VarE), o0VarE, 0, 0);
                o0VarE.g0(false);
            } else {
                o0VarE.C(549738589);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k0(t2Var, bVar, lVar, i14, i15);
        }
    }

    public static final void b(e2.d dVar, a0 a0Var, h0 h0Var, l lVar, p3.m mVar, int i14) {
        int i15;
        h0 h0Var2;
        dVar.getClass();
        a0Var.getClass();
        h0Var.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(997700929);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(dVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(a0Var) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            h0Var2 = h0Var;
            i15 |= o0VarE.B(h0Var2) ? 256 : 128;
        } else {
            h0Var2 = h0Var;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(lVar) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            if (a0Var instanceof a0.a) {
                o0VarE.C(1334938063);
                r1.b(gl1.y.Q(o0VarE, ((a0.a) a0Var).f186580b), null, o0VarE, 0, 2);
                o0VarE.g0(false);
            } else {
                if (!(a0Var instanceof a0.b)) {
                    throw kg.f.h(o0VarE, 1012893369, false);
                }
                o0VarE.C(1335097124);
                boolean z14 = ((a0.b) a0Var).f186582b.f166056b;
                j02.d0.a(dVar, h0Var2, a0Var.f186579a, null, z14, null, z3.f.c(917204678, new m82.b(a0Var, context, lVar, z14 ? R.drawable.ic_remove_red : R.drawable.ic_add_round), o0VarE), o0VarE, (i15 & 14) | 1572864 | ((i15 >> 3) & 112), 20);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ug0.c(dVar, a0Var, h0Var, lVar, i14, 17);
        }
    }
}

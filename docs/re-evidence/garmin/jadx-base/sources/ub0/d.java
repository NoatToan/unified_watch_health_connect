package ub0;

import androidx.room.a0;
import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import o4.d0;
import p3.o0;
import p3.p2;
import p3.x1;
import v62.fa;

/* JADX INFO: loaded from: classes8.dex */
public final class d {
    /* JADX WARN: Code duplicated, block: B:49:0x00e2  */
    public static final void a(String str, o90.a aVar, e23.l lVar, e23.a aVar2, p3.m mVar, int i14) {
        int i15;
        o0 o0Var;
        String strJ;
        o0 o0VarP = a0.p(lVar, aVar2, mVar, 1622545705);
        if ((i14 & 6) == 0) {
            i15 = (o0VarP.B(str) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        int i16 = i15 | (o0VarP.B(aVar) ? 32 : 16);
        if ((i14 & 384) == 0) {
            i16 |= o0VarP.r(lVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= o0VarP.r(aVar2) ? 2048 : 1024;
        }
        if (o0VarP.n(i16 & 1, (i16 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            if (str == null) {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarP, 193300844, R.string.lbl_device, o0VarP, false);
            } else {
                o0VarP.C(193300410);
                o0VarP.g0(false);
                strJ = str;
            }
            o90.a aVar3 = aVar == null ? new o90.a((String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 255, (p005kotlin.jvm.internal.j) null) : aVar;
            s62.a.f157643a.getClass();
            u4.d dVarA = fa.a(t62.b.f162798a);
            d92.b.f58623a.getClass();
            long jF = d92.b.a(o0VarP).f().f();
            String strQ = y.Q(o0VarP, R.string.pregnancy_something_went_wrong);
            String strQ2 = y.Q(o0VarP, R.string.lbl_retry);
            String strQ3 = y.Q(o0VarP, R.string.lbl_skip_button);
            d0 d0VarA = d0.a(jF);
            boolean z14 = (i16 & 7168) == 2048;
            Object objQ = o0VarP.q();
            if (z14) {
                objQ = new u11.b(aVar2, 8);
                o0VarP.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new u11.b(aVar2, 8);
                    o0VarP.K(objQ);
                }
            }
            c.f169719a.getClass();
            o0Var = o0VarP;
            da0.p.c(null, strJ, aVar3, strQ, false, dVarA, null, d0VarA, strQ2, null, false, strQ3, (e23.a) objQ, false, null, null, false, false, null, lVar, null, null, c.f169720b, o0Var, 0, (i16 << 21) & 1879048192, 3072, 7857745);
        } else {
            o0Var = o0VarP;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ot1.i(str, aVar, lVar, aVar2, i14, 29);
        }
    }
}

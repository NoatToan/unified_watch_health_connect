package ux1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import e23.l;
import i3.fe;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import rx1.s;
import ta0.g0;

/* JADX INFO: loaded from: classes10.dex */
public final class d {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(fe feVar, dy1.c cVar, boolean z14, e23.a<Unit> aVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3, l<? super dy1.d, Unit> lVar, e23.a<Unit> aVar4, m mVar, int i14) {
        feVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        lVar.getClass();
        aVar4.getClass();
        o0 o0VarE = mVar.E(873756490);
        int i15 = i14 | (o0VarE.B(feVar) ? 4 : 2) | (o0VarE.B(cVar) ? 32 : 16) | (o0VarE.h(z14) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024) | (o0VarE.r(aVar2) ? 16384 : 8192) | (o0VarE.r(aVar3) ? 131072 : 65536) | (o0VarE.r(lVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.r(aVar4) ? 8388608 : 4194304);
        if (o0VarE.n(i15 & 1, (4793491 & i15) != 4793490)) {
            x1 x1Var = n.f135158a;
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p0.n(null);
                o0VarE.K(objQ2);
            }
            p1 p1Var2 = (p1) objQ2;
            mx1.a.C2299a c2299a = mx1.a.f121347g;
            String str = (String) p1Var2.getF182175a();
            c2299a.getClass();
            mx1.a aVarA = mx1.a.C2299a.a(str);
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = p0.n(null);
                o0VarE.K(objQ3);
            }
            p1 p1Var3 = (p1) objQ3;
            z02.d.a(z14, z3.f.c(91926095, new nw0.l(aVar3, aVar, 17), o0VarE), z3.f.c(-1327397936, new p21.b(feVar, 17), o0VarE), null, null, z3.f.c(-1290402733, new g0(7, aVar4, cVar, (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b), p1Var3, p1Var2, p1Var), o0VarE), o0VarE, ((i15 >> 6) & 14) | 197040, 24);
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                o0VarE.C(-1710265815);
                boolean z15 = (i15 & 3670016) == 1048576;
                Object objQ4 = o0VarE.q();
                if (z15 || objQ4 == c2565a) {
                    objQ4 = new ta0.j(lVar, 15);
                    o0VarE.K(objQ4);
                }
                l lVar2 = (l) objQ4;
                Object objQ5 = o0VarE.q();
                if (objQ5 == c2565a) {
                    objQ5 = new tn.h(p1Var, 17);
                    o0VarE.K(objQ5);
                }
                s.a(p1Var3, aVarA, false, lVar2, aVar2, (e23.a) objQ5, o0VarE, (i15 & 57344) | 196998);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1709851624);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e11.n(feVar, cVar, z14, aVar, aVar2, aVar3, lVar, aVar4, i14);
        }
    }

    public static final String b(double d14, Context context, boolean z14) {
        String str;
        if (Double.isNaN(d14) || d14 < 0.0d) {
            str = "";
        } else {
            l3.f23124b.getClass();
            str = l3.f23130h.format(d14);
            str.getClass();
        }
        String string = context.getString(R.string.string_space_string_pattern, str, context.getString(z14 ? R.string.lbl_kg : R.string.lbl_lbs));
        string.getClass();
        return string;
    }
}

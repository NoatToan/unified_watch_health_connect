package l72;

import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.audio.WavUtil;
import i3.mh;
import java.util.Arrays;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final class v1 {
    /* JADX WARN: Code duplicated, block: B:26:0x00b7  */
    public static final void a(int i14, e23.a aVar, String str, p3.m mVar) {
        p3.o0 o0Var;
        p3.o0 o0VarL = vb.h.l(-549240539, aVar, str, mVar);
        int i15 = (o0VarL.B(str) ? 4 : 2) | i14 | (o0VarL.r(aVar) ? 32 : 16);
        if (o0VarL.n(i15 & 1, (i15 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            s5.c.b bVarH = yc.l2.h(o0VarL, 460822630, 0, 1, null);
            bVarH.h("URL", str);
            d92.b.f58623a.getClass();
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            s5.x0 x0Var = j92.f.f97932i;
            int iJ = bVarH.j(s5.i0.a(x0Var.f157322a, d92.b.a(o0VarL).k().a(), WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE));
            try {
                bVarH.b(str);
                Unit unit = Unit.INSTANCE;
                bVarH.f(iJ);
                bVarH.e();
                s5.c cVarK = bVarH.k();
                o0VarL.g0(false);
                h4.r rVarA = u1.m0.a(h4.r.S, true, null);
                p5.l.f136032b.getClass();
                g6.f.a aVar2 = g6.f.f75994b;
                h4.r rVarA2 = c2.l.A(u1.w.d(rVarA, false, null, p5.l.a(0), aVar, 11), 16, 0.0f, 2);
                boolean z14 = (i15 & 14) == 4;
                Object objQ = o0VarL.q();
                if (z14) {
                    objQ = new jl0.e(str, 26);
                    o0VarL.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new jl0.e(str, 26);
                        o0VarL.K(objQ);
                    }
                }
                h4.r rVarC = p5.v.c((e23.l) objQ, rVarA2, false);
                fVar.getClass();
                o0Var = o0VarL;
                mh.d(cVarK, rVarC, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, d92.c.f(x0Var, o0VarL), o0Var, 0, 0, 262140);
            } catch (Throwable th3) {
                bVarH.f(iJ);
                throw th3;
            }
        } else {
            o0Var = o0VarL;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ao1.g(str, aVar, i14, 19);
        }
    }

    public static final s5.c b(String str, String[] strArr, p3.m mVar) {
        str.getClass();
        p3.x1 x1Var = p3.n.f135158a;
        return d(str, com.nimbusds.jose.shaded.gson.internal.a.a(d92.b.f58623a, mVar), true, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final s5.c c(String str, String[] strArr, p3.m mVar) {
        str.getClass();
        p3.x1 x1Var = p3.n.f135158a;
        return d(str, n5.a.a(mVar, R.color.gcm3_text_lightening_yellow), false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final s5.c d(String str, long j8, boolean z14, String[] strArr) {
        s5.i0 i0Var;
        p3.x1 x1Var = p3.n.f135158a;
        s5.c.b bVar = new s5.c.b(0, 1, null);
        bVar.b(str);
        int length = 0;
        for (String str2 : strArr) {
            int iH = d53.w.H(str, str2, length, false, 4);
            if (z14) {
                w5.f0.f182097b.getClass();
                i0Var = new s5.i0(j8, 0L, w5.f0.f182104i, (w5.b0) null, (w5.c0) null, (w5.q) null, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (d6.i) null, (o4.q1) null, (s5.b0) null, (q4.g) null, 65530, (p005kotlin.jvm.internal.j) null);
            } else {
                i0Var = new s5.i0(j8, 0L, (w5.f0) null, (w5.b0) null, (w5.c0) null, (w5.q) null, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (d6.i) null, (o4.q1) null, (s5.b0) null, (q4.g) null, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE, (p005kotlin.jvm.internal.j) null);
            }
            bVar.a(i0Var, iH, str2.length() + iH);
            length = iH + str2.length();
        }
        s5.c cVarK = bVar.k();
        p3.x1 x1Var2 = p3.n.f135158a;
        return cVarK;
    }
}

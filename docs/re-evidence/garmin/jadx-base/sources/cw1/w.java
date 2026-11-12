package cw1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import i3.e5;
import java.util.Arrays;
import java.util.Locale;
import l72.p2;
import org.apache.commons.lang3.StringUtils;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class w {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f56240a;

        static {
            int[] iArr = new int[b82.t0.a.values().length];
            try {
                iArr[b82.t0.a.ON_FOCUS_LOST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b82.t0.a.ON_FOCUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f56240a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0109  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(h4.r rVar, String str, i53.c cVar, e23.l lVar, String str2, e23.a aVar, e23.l lVar2, int i14, p3.m mVar, int i15) {
        h4.r rVar2;
        String strG;
        String str3;
        str.getClass();
        cVar.getClass();
        lVar.getClass();
        str2.getClass();
        aVar.getClass();
        lVar2.getClass();
        p3.o0 o0VarE = mVar.E(113829951);
        int i16 = i15 | 6 | (o0VarE.B(str) ? 32 : 16) | (o0VarE.B(cVar) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024) | (o0VarE.B(str2) ? 16384 : 8192) | (o0VarE.r(aVar) ? 131072 : 65536) | (o0VarE.r(lVar2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | 905969664;
        if (o0VarE.n(i16 & 1, (306783379 & i16) != 306783378)) {
            h4.r.a aVar2 = h4.r.S;
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p3.p1 p1Var = (p3.p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p3.p0.n(Boolean.TRUE);
                o0VarE.K(objQ2);
            }
            p3.p1 p1Var2 = (p3.p1) objQ2;
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                strG = str;
            } else {
                bg0.a.f17827a.getClass();
                String strA = bg0.a.C0255a.c(str2).a(context);
                Double dF = d53.s.f(str);
                if (dF != null) {
                    double dDoubleValue = dF.doubleValue();
                    p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
                    str3 = String.format(Locale.getDefault(), "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(dDoubleValue)}, 1));
                } else {
                    str3 = null;
                }
                if (g22.n.d(str3)) {
                    strG = e5.g(str3, StringUtils.SPACE, strA);
                } else {
                    strG = str;
                }
            }
            p2 p2Var = p2.f111205a;
            e23.p pVarO = gg.b.o(((Boolean) p1Var.getF182175a()).booleanValue(), z3.f.c(-1911699288, new v(str2, cVar, lVar2, 0, (byte) 0), o0VarE), o0VarE);
            z3.e eVarC = z3.f.c(-1919988035, new a11.g0(p1Var2, str, aVar, strG, lVar, i14, p1Var), o0VarE);
            f.f56032a.getClass();
            p2Var.b(aVar2, eVarC, pVarO, f.f56033b, o0VarE, 3126, 0);
            rVar2 = aVar2;
        } else {
            o0VarE.e();
            rVar2 = rVar;
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cn1.o(rVar2, str, cVar, lVar, str2, aVar, lVar2, i14, i15);
        }
    }
}

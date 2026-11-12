package fx0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import h4.r;
import o4.d0;
import o70.t;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import yz1.y;
import yz1.z;

/* JADX INFO: loaded from: classes9.dex */
public final class m {
    /* JADX WARN: Code duplicated, block: B:84:0x0110  */
    public static final void a(r rVar, yz1.d dVar, String str, u4.d dVar2, d0 d0Var, String str2, int i14, p3.m mVar, int i15, int i16) {
        r rVar2;
        int i17;
        d0 d0VarA;
        o0 o0Var;
        d0 d0Var2;
        o0 o0VarE = mVar.E(361296642);
        if ((i15 & 6) == 0) {
            rVar2 = rVar;
            i17 = (o0VarE.B(rVar2) ? 4 : 2) | i15;
        } else {
            rVar2 = rVar;
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= (i15 & 64) == 0 ? o0VarE.B(dVar) : o0VarE.r(dVar) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i17 |= o0VarE.B(str) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i17 |= o0VarE.B(dVar2) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            if ((i16 & 16) == 0) {
                d0VarA = d0Var;
                int i18 = o0VarE.B(d0VarA) ? 16384 : 8192;
                i17 |= i18;
            } else {
                d0VarA = d0Var;
            }
            i17 |= i18;
        } else {
            d0VarA = d0Var;
        }
        if ((196608 & i15) == 0) {
            i17 |= o0VarE.B(str2) ? 131072 : 65536;
        }
        if ((i15 & 1572864) == 0) {
            i17 |= o0VarE.k(i14) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (o0VarE.n(i17 & 1, (599187 & i17) != 599186)) {
            o0VarE.G0();
            if ((i15 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
                if ((i16 & 16) != 0) {
                    i17 &= -57345;
                }
            } else if ((i16 & 16) != 0) {
                t.a aVar = t.f130062f;
                t.b bVar = t.b.f130093h;
                aVar.getClass();
                d0VarA = d0.a(t.a.b(bVar, o0VarE));
                i17 &= -57345;
            }
            d0 d0Var3 = d0VarA;
            int i19 = i17;
            d0Var2 = d0Var3;
            o0VarE.h0();
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            boolean zR = o0VarE.r(context);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new cy1.a(context, 17);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new cy1.a(context, 17);
                    o0VarE.K(objQ);
                }
            }
            e23.a aVar2 = (e23.a) objQ;
            int i24 = i19 << 3;
            o0Var = o0VarE;
            y.c(rVar2, dVar, str, null, dVar2, d0Var2, 0.0f, 0, null, 0.0f, null, null, null, null, null, aVar2, z.EMPTY, str2, gl1.y.Q(o0VarE, i14), aVar2, o0Var, (i19 & 1022) | (57344 & i24) | (i24 & 458752), ((i19 << 6) & 29360128) | 1572864, 32712);
        } else {
            o0Var = o0VarE;
            o0Var.e();
            d0Var2 = d0VarA;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new l(rVar, dVar, str, dVar2, d0Var2, str2, i14, i15, i16);
        }
    }
}

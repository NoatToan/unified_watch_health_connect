package ds;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b21.l0;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import nr.p0;
import p005kotlin.Unit;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final class v {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(qr.t tVar, p0 p0Var, Bitmap bitmap, e23.a<Unit> aVar, n4.d dVar, e23.l<? super n4.d, Unit> lVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        o0 o0Var;
        tVar.getClass();
        aVar.getClass();
        dVar.getClass();
        lVar.getClass();
        aVar2.getClass();
        o0 o0VarE = mVar.E(-1492663244);
        int i15 = i14 | (o0VarE.r(tVar) ? 4 : 2) | (o0VarE.r(p0Var) ? 32 : 16) | (o0VarE.r(bitmap) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024) | (o0VarE.B(dVar) ? 16384 : 8192) | (o0VarE.r(lVar) ? 131072 : 65536) | (o0VarE.r(aVar2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (o0VarE.n(i15 & 1, (599187 & i15) != 599186)) {
            x1 x1Var = p3.n.f135158a;
            p1 p1VarC = s9.c.c(tVar.f146503a2, o0VarE);
            p1 p1VarC2 = s9.c.c(tVar.f146521g2, o0VarE);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            p1 p1VarC3 = s9.c.c(tVar.f146515e2, o0VarE);
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            int i16 = ((n) p1VarC.getF182175a()) == n.f61012i ? 32 : 0;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p3.p0.n(k0.Hidden);
                o0VarE.K(objQ2);
            }
            o0Var = o0VarE;
            z02.b.a(false, null, null, null, false, z3.f.c(1615000638, new u(tVar, dVar, aVar2, p0Var, bitmap, lVar, p1Var, p1VarC3, p1VarC, i16, aVar, (p1) objQ2, context, p1VarC2), o0VarE), o0Var, 196608, 31);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new l0(i14, 8, tVar, p0Var, bitmap, aVar, dVar, lVar, aVar2);
        }
    }
}

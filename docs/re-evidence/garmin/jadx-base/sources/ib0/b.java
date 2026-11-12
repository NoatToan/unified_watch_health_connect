package ib0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import i3.mc;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class b {
    public static final void a(int i14, e23.a aVar, e23.l lVar, mc mcVar, i53.c cVar, p3.m mVar) {
        cVar.getClass();
        lVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(110563359);
        int i15 = (o0VarE.B(cVar) ? 4 : 2) | i14 | (o0VarE.B(mcVar) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            l72.w wVar = l72.w.f111301a;
            c.f92455a.getClass();
            wVar.c(c.f92456b, z3.f.c(768637832, new hl1.i(aVar, 5), o0VarE), aVar, mcVar, null, null, z3.f.c(-128123363, new fb0.b((Object) cVar, (Object) context, lVar, aVar, 11), o0VarE), o0VarE, ((i15 >> 3) & 896) | 1572918 | ((i15 << 6) & 7168), 48);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a(cVar, mcVar, lVar, aVar, i14);
        }
    }
}

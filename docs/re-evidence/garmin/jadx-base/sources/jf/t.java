package jf;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final class t {
    public static final void a(Object obj, String str, h4.r rVar, h4.d dVar, f5.k kVar, e23.q qVar, p3.m mVar, int i14, int i15) {
        h4.d dVar2;
        f5.k kVar2;
        h4.r rVar2 = (i15 & 4) != 0 ? h4.r.S : rVar;
        d.f98614r.getClass();
        j02.r rVar3 = d.f98615t;
        if ((i15 & 32) != 0) {
            h4.d.f81522a.getClass();
            dVar2 = h4.d.a.f81528f;
        } else {
            dVar2 = dVar;
        }
        if ((i15 & 64) != 0) {
            f5.k.f68985a.getClass();
            kVar2 = f5.k.a.f68988c;
        } else {
            kVar2 = kVar;
        }
        q4.f.f142555o0.getClass();
        int i16 = q4.f.a.f142558c;
        x1 x1Var = p3.n.f135158a;
        int i17 = i14 << 3;
        int i18 = (i14 & 126) | (i17 & 7168) | (i17 & 57344) | (i17 & 458752) | (i17 & 3670016) | (i17 & 29360128) | (i17 & 234881024) | (i17 & 1879048192);
        int i19 = i18 >> 3;
        v.a(new kf.b(obj, (c) mVar.A(o.f98676a), hf.v.a((Context) mVar.A(AndroidCompositionLocals_androidKt.f6042b))), str, rVar2, rVar3, dVar2, kVar2, i16, qVar, mVar, (i18 & 112) | (i19 & 896) | (i19 & 7168) | (i19 & 57344) | (i19 & 458752) | (i19 & 3670016) | (i19 & 29360128) | (i19 & 234881024) | (((((i14 >> 27) & 14) | 384) << 27) & 1879048192), 48);
    }
}

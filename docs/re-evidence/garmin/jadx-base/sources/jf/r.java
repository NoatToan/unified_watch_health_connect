package jf;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import o4.e0;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final class r {
    public static final void a(Object obj, String str, h4.r rVar, e23.l lVar, h4.d dVar, f5.k kVar, o4.r rVar2, p3.m mVar, int i14, int i15) {
        h4.d dVar2;
        f5.k kVar2;
        h4.r rVar3 = (i15 & 4) != 0 ? h4.r.S : rVar;
        d.f98614r.getClass();
        j02.r rVar4 = d.f98615t;
        e23.l lVar2 = (i15 & 16) != 0 ? null : lVar;
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
        o4.r rVar5 = (i15 & 256) != 0 ? null : rVar2;
        q4.f.f142555o0.getClass();
        int i16 = q4.f.a.f142558c;
        x1 x1Var = p3.n.f135158a;
        int i17 = i14 << 3;
        int i18 = (i14 & 126) | (i17 & 7168) | (i17 & 57344) | (i17 & 458752) | (i17 & 3670016) | (i17 & 29360128) | (i17 & 234881024) | (i17 & 1879048192);
        int i19 = i18 >> 3;
        b.a(new kf.b(obj, (c) mVar.A(o.f98676a), hf.v.a((Context) mVar.A(AndroidCompositionLocals_androidKt.f6042b))), str, rVar3, rVar4, lVar2, dVar2, kVar2, 1.0f, rVar5, i16, true, mVar, (i18 & 112) | (i19 & 896) | (i19 & 7168) | (i19 & 57344) | (i19 & 458752) | (i19 & 3670016) | (i19 & 29360128) | (i19 & 234881024) | ((((i14 >> 27) & 14) << 27) & 1879048192), 0);
    }

    public static final void b(Object obj, String str, h4.r rVar, t4.d dVar, t4.d dVar2, t4.d dVar3, e23.l lVar, e23.l lVar2, e23.l lVar3, h4.d dVar4, f5.k kVar, e0 e0Var, p3.m mVar, int i14, int i15, int i16) {
        h4.d dVar5;
        f5.k kVar2;
        h4.r rVar2 = (i16 & 4) != 0 ? h4.r.S : rVar;
        t4.d dVar6 = (i16 & 8) != 0 ? null : dVar;
        t4.d dVar7 = (i16 & 16) != 0 ? null : dVar2;
        t4.d dVar8 = (i16 & 32) != 0 ? dVar7 : dVar3;
        e23.l lVar4 = (i16 & 64) != 0 ? null : lVar;
        e23.l lVar5 = (i16 & 128) != 0 ? null : lVar2;
        e23.l lVar6 = (i16 & 256) != 0 ? null : lVar3;
        if ((i16 & 512) != 0) {
            h4.d.f81522a.getClass();
            dVar5 = h4.d.a.f81528f;
        } else {
            dVar5 = dVar4;
        }
        if ((i16 & 1024) != 0) {
            f5.k.f68985a.getClass();
            kVar2 = f5.k.a.f68988c;
        } else {
            kVar2 = kVar;
        }
        e0 e0Var2 = (i16 & 4096) != 0 ? null : e0Var;
        q4.f.f142555o0.getClass();
        int i17 = q4.f.a.f142558c;
        x1 x1Var = p3.n.f135158a;
        int i18 = i14 << 3;
        b.b(obj, str, hf.v.a((Context) mVar.A(AndroidCompositionLocals_androidKt.f6042b)), rVar2, dVar6, dVar7, dVar8, lVar4, lVar5, lVar6, dVar5, kVar2, e0Var2, i17, mVar, (i14 & 126) | (i18 & 7168) | (57344 & i18) | (458752 & i18) | (3670016 & i18) | (29360128 & i18) | (234881024 & i18) | (i18 & 1879048192), ((i14 >> 27) & 14) | ((i15 << 3) & 112), 0);
    }
}

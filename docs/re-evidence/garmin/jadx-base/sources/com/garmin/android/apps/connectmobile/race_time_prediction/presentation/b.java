package com.garmin.android.apps.connectmobile.race_time_prediction.presentation;

import fg0.k;
import ka0.e;
import lc.y;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import s9.c;
import ta0.g0;
import uc1.f;

/* JADX INFO: loaded from: classes9.dex */
public final class b {
    public static final void a(f fVar, k kVar, y yVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, m mVar, int i14) {
        int i15;
        Object obj;
        e23.a<Unit> aVar3;
        fVar.getClass();
        kVar.getClass();
        yVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        o0 o0VarE = mVar.E(-574808888);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(fVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(kVar) : o0VarE.r(kVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(yVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            obj = aVar;
            i15 |= o0VarE.r(obj) ? 2048 : 1024;
        } else {
            obj = aVar;
        }
        if ((i14 & 24576) == 0) {
            aVar3 = aVar2;
            i15 |= o0VarE.r(aVar3) ? 16384 : 8192;
        } else {
            aVar3 = aVar2;
        }
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = n.f135158a;
            z02.b.a(false, null, null, null, false, z3.f.c(1231614290, new g0(5, aVar3, c.c(fVar.f169984b, o0VarE), yVar, fVar, kVar, obj), o0VarE), o0VarE, 196608, 31);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e(fVar, kVar, yVar, aVar, aVar2, i14, 24);
        }
    }
}

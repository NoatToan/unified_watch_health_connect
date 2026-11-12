package com.garmin.android.apps.connectmobile.running_tolerance.presentation;

import hv0.d;
import lc.y;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import r1.c0;
import z3.f;

/* JADX INFO: loaded from: classes9.dex */
public final class a {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(y yVar, jf1.b bVar, m mVar, int i14) {
        yVar.getClass();
        bVar.getClass();
        o0 o0VarE = mVar.E(-58335355);
        int i15 = 16;
        int i16 = (o0VarE.r(yVar) ? 4 : 2) | i14 | (o0VarE.r(bVar) ? 32 : 16);
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            c0.e(((Boolean) bVar.f98700c.getF182175a()).booleanValue(), null, null, null, null, f.c(1764364717, new d(9, bVar, yVar), o0VarE), o0VarE, 196608, 30);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i20.b(yVar, bVar, i14, i15);
        }
    }
}

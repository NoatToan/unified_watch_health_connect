package com.garmin.android.apps.connectmobile.fitness_age.presentation;

import ih0.p;
import ih0.s;
import lc.y;
import o82.g;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import z3.f;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.fitness_age.presentation.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C0605a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f35223a;

        static {
            int[] iArr = new int[g.values().length];
            try {
                iArr[g.f130853f.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g.f130851d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[g.f130849b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[g.f130856i.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f35223a = iArr;
        }
    }

    public static final void a(s sVar, y yVar, e23.a<Unit> aVar, m mVar, int i14) {
        sVar.getClass();
        yVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(-1984164963);
        int i15 = (o0VarE.r(sVar) ? 4 : 2) | i14 | (o0VarE.r(yVar) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            z02.b.a(false, null, null, null, false, f.c(-42262445, new p(sVar, aVar, yVar), o0VarE), o0VarE, 196608, 31);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p(sVar, yVar, aVar, i14);
        }
    }
}

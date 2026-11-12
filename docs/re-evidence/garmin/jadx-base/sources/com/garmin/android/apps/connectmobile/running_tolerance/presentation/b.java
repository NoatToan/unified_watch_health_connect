package com.garmin.android.apps.connectmobile.running_tolerance.presentation;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import ix.h;
import lc.y;
import o82.g;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import z3.f;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f41167a;

        static {
            int[] iArr = new int[g.values().length];
            try {
                iArr[g.f130849b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g.f130854g.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[g.f130856i.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f41167a = iArr;
        }
    }

    public static final void a(jf1.b bVar, y yVar, e23.a<Unit> aVar, m mVar, int i14) {
        bVar.getClass();
        yVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(642894493);
        int i15 = (o0VarE.r(bVar) ? 4 : 2) | i14 | (o0VarE.r(yVar) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            of1.a aVar2 = new of1.a((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b));
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            if (objQ == m.a.f135155b) {
                objQ = p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            z02.b.a(false, null, null, null, false, f.c(-848585389, new h(1, aVar, yVar, bVar, aVar2, (p1) objQ), o0VarE), o0VarE, 196608, 31);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new gw1.c(bVar, yVar, aVar, i14, 24);
        }
    }
}

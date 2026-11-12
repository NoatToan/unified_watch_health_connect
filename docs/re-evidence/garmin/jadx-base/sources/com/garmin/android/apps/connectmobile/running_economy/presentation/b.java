package com.garmin.android.apps.connectmobile.running_economy.presentation;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
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
import we1.d;
import z3.f;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f41160a;

        static {
            int[] iArr = new int[g.values().length];
            try {
                iArr[g.f130849b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g.f130853f.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[g.f130854g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[g.f130856i.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f41160a = iArr;
        }
    }

    @SuppressLint({"StateFlowValueCalledInComposition"})
    public static final void a(d dVar, y yVar, e23.a<Unit> aVar, Boolean bool, m mVar, int i14) {
        dVar.getClass();
        yVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(-379414828);
        int i15 = (o0VarE.r(dVar) ? 4 : 2) | i14 | (o0VarE.r(yVar) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128) | (o0VarE.B(bool) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new yd1.a(context);
                o0VarE.K(objQ);
            }
            yd1.a aVar2 = (yd1.a) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p0.n(bool);
                o0VarE.K(objQ2);
            }
            z02.b.a(false, null, null, null, false, f.c(1923989086, new sg2.g((e23.a) aVar, (Object) yVar, (Object) dVar, (p1) objQ2, (Object) aVar2, 28), o0VarE), o0VarE, 196608, 31);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new w21.d(dVar, yVar, aVar, bool, i14, 6);
        }
    }
}

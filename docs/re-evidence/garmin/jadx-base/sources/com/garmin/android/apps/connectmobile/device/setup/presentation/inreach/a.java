package com.garmin.android.apps.connectmobile.device.setup.presentation.inreach;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c.w;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import da0.p;
import g.h;
import gl1.y;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import t62.b;
import u4.d;
import v62.l2;
import vc0.v;
import w51.j;
import w52.j0;
import wa0.c;
import z3.f;
import zd0.u1;

/* JADX INFO: loaded from: classes8.dex */
public final class a {
    /* JADX WARN: Type inference failed for: r0v21, types: [T, java.lang.String] */
    public static final void a(c cVar, String str, String str2, long j8, e23.a<Unit> aVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3, m mVar, int i14) {
        str.getClass();
        str2.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        o0 o0VarE = mVar.E(-727851341);
        int i15 = i14 | (o0VarE.r(cVar) ? 4 : 2) | (o0VarE.B(str) ? 32 : 16) | (o0VarE.B(str2) ? 256 : 128) | (o0VarE.l(j8) ? 2048 : 1024) | (o0VarE.r(aVar) ? 16384 : 8192) | (o0VarE.r(aVar2) ? 131072 : 65536) | (o0VarE.r(aVar3) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (o0VarE.n(i15 & 1, (599187 & i15) != 599186)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            r0 r0Var = new r0();
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                o0VarE.K(null);
                objQ = null;
            }
            r0Var.f105810a = (String) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = (u1) KoinJavaComponent.get$default(u1.class, null, null, 6, null);
                o0VarE.K(objQ2);
            }
            c42.c cVar2 = new c42.c(r0Var, w.c(new h(), new bn0.h(r0Var, cVar, j8, aVar, 11), o0VarE, 0), (u1) objQ2, context, j8);
            boolean z14 = (458752 & i15) == 131072;
            Object objQ3 = o0VarE.q();
            if (z14 || objQ3 == c2565a) {
                objQ3 = new j(aVar2, 11);
                o0VarE.K(objQ3);
            }
            b(str, str2, cVar2, (e23.a) objQ3, aVar3, o0VarE, ((i15 >> 3) & 126) | (57344 & (i15 >> 6)));
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new es.a(cVar, str, str2, j8, aVar, aVar2, aVar3, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:70:0x00f3  */
    public static final void b(String str, String str2, c42.c cVar, e23.a aVar, e23.a aVar2, m mVar, int i14) {
        String str3;
        int i15;
        o0 o0Var;
        o0 o0VarE = mVar.E(-1864437415);
        if ((i14 & 6) == 0) {
            str3 = str;
            i15 = (o0VarE.B(str3) ? 4 : 2) | i14;
        } else {
            str3 = str;
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(str2) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(cVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(aVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(aVar2) ? 16384 : 8192;
        }
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = n.f135158a;
            s62.a.f157643a.getClass();
            b.f162798a.getClass();
            d dVarA = x62.b.a(l2.f175943a);
            String strQ = y.Q(o0VarE, R.string.lbl_select_plan);
            boolean z14 = (i15 & 896) == 256;
            Object objQ = o0VarE.q();
            m.a aVar3 = m.f135153a;
            if (z14) {
                objQ = new v(cVar, 28);
                o0VarE.K(objQ);
            } else {
                aVar3.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new v(cVar, 28);
                    o0VarE.K(objQ);
                }
            }
            e23.a aVar4 = (e23.a) objQ;
            String strQ2 = y.Q(o0VarE, R.string.lbl_skip_for_now);
            boolean z15 = (i15 & 7168) == 2048;
            Object objQ2 = o0VarE.q();
            if (z15) {
                objQ2 = new j(aVar, 12);
                o0VarE.K(objQ2);
            } else {
                aVar3.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new j(aVar, 12);
                    o0VarE.K(objQ2);
                }
            }
            e23.a aVar5 = (e23.a) objQ2;
            boolean z16 = (57344 & i15) == 16384;
            Object objQ3 = o0VarE.q();
            if (z16) {
                objQ3 = new j(aVar2, 13);
                o0VarE.K(objQ3);
            } else {
                aVar3.getClass();
                if (objQ3 == m.a.f135155b) {
                    objQ3 = new j(aVar2, 13);
                    o0VarE.K(objQ3);
                }
            }
            o0Var = o0VarE;
            p.b(null, str3, dVarA, null, null, strQ, aVar4, false, strQ2, aVar5, false, null, null, false, false, (e23.a) objQ3, null, null, null, null, null, f.c(-611472295, new j21.p(str2, 25), o0VarE), o0Var, (i15 << 3) & 112, 0, 384, 4160665);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new j0(str, str2, cVar, aVar, aVar2, i14, 1);
        }
    }
}

package com.garmin.android.apps.connectmobile.workouts.presentation.edit;

import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import et1.a2;
import l72.c1;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import w52.s0;
import w52.y1;

/* JADX INFO: loaded from: classes9.dex */
public final class g0 {
    public static final void a(String str, e23.l lVar, boolean z14, com.garmin.android.apps.connectmobile.workouts.data.model.a aVar, String str2, e23.q qVar, e23.p pVar, WorkoutEditNotesActivity.d dVar, p3.m mVar, int i14) {
        int i15;
        e23.q qVar2;
        boolean z15;
        lVar.getClass();
        str2.getClass();
        o0 o0VarE = mVar.E(1641703929);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(str) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(lVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.h(z14) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= (i14 & 4096) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.B(str2) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.r(qVar) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i15 |= o0VarE.r(pVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i14) == 0) {
            i15 |= o0VarE.r(dVar) ? 8388608 : 4194304;
        }
        if (o0VarE.n(i15 & 1, (4793491 & i15) != 4793490)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar2 = h4.r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar2, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            y1.a(i15 & 1022, 0, lVar, str, o0VarE, z14);
            if (aVar != null) {
                o0VarE.C(1520403756);
                int i16 = i15 >> 9;
                z15 = false;
                qVar2 = qVar;
                s0.c(aVar, str2, qVar2, pVar, o0VarE, com.garmin.android.apps.connectmobile.workouts.data.model.a.f48070d | (i16 & 14) | (i16 & 112) | (i16 & 896) | (i16 & 7168));
                o0VarE.g0(false);
            } else {
                qVar2 = qVar;
                z15 = false;
                o0VarE.C(1520502739);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(null);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            boolean zR = o0VarE.r(dVar);
            Object objQ2 = o0VarE.q();
            if (zR || objQ2 == c2565a) {
                objQ2 = new f0(dVar, p1Var, null);
                o0VarE.K(objQ2);
            }
            l0.e((e23.p) objQ2, dVar, o0VarE);
            h0.a.C0958a c0958a = (h0.a.C0958a) p1Var.getF182175a();
            if (c0958a == null) {
                o0VarE.C(1210167359);
                o0VarE.g0(z15);
            } else {
                o0VarE.C(1210167360);
                c1 c1Var = c1.f110940a;
                String strQ = gl1.y.Q(o0VarE, R.string.audio_note_failed_to_download_alert_title);
                String strQ2 = gl1.y.Q(o0VarE, R.string.audio_note_failed_to_download_alert_message);
                String strQ3 = gl1.y.Q(o0VarE, R.string.lbl_retry);
                boolean zB = o0VarE.B(c0958a) | ((i15 & 458752) != 131072 ? z15 : true);
                Object objQ3 = o0VarE.q();
                if (zB || objQ3 == c2565a) {
                    objQ3 = new cw1.g0(qVar2, c0958a, p1Var, 25);
                    o0VarE.K(objQ3);
                }
                e23.a<Unit> aVar4 = (e23.a) objQ3;
                String strQ4 = gl1.y.Q(o0VarE, R.string.lbl_cancel);
                Object objQ4 = o0VarE.q();
                if (objQ4 == c2565a) {
                    objQ4 = new a2(p1Var, 9);
                    o0VarE.K(objQ4);
                }
                c1Var.a(false, strQ, strQ2, null, null, strQ3, false, false, aVar4, strQ4, (e23.a) objQ4, o0VarE, 0, 6, 217);
                o0VarE = o0VarE;
                o0VarE.g0(z15);
            }
        } else {
            qVar2 = qVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e52.d(str, lVar, z14, aVar, str2, qVar2, pVar, dVar, i14);
        }
    }
}

package e62;

import android.os.Bundle;
import b21.l0;
import cn1.o;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import lc.q0;
import m63.m0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import r1.q2;
import w52.v0;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001¨\u0006\u0002"}, d2 = {"e62/d$a", "Llc/q0;", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends q0<Integer> {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ n63.b f63197s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(n63.b bVar) {
            super(true);
            this.f63197s = bVar;
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Integer, java.lang.Object] */
        @Override // lc.q0
        public final Integer a(Bundle bundle, String str) {
            String strI = q2.i(str, str, bundle);
            if (strI == null) {
                return null;
            }
            n63.b bVar = this.f63197s;
            bVar.getClass();
            return bVar.c(m0.f116981a, strI);
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Integer, java.lang.Object] */
        @Override // lc.q0
        /* JADX INFO: renamed from: d */
        public final Integer h(String str) {
            str.getClass();
            n63.b bVar = this.f63197s;
            bVar.getClass();
            return bVar.c(m0.f116981a, str);
        }

        @Override // lc.q0
        public final void e(Bundle bundle, String str, Integer num) {
            str.getClass();
            n63.b bVar = this.f63197s;
            bVar.getClass();
            bundle.putString(str, bVar.b(j63.a.d(m0.f116981a), num));
        }

        @Override // lc.q0
        public final String f(Integer num) {
            n63.b bVar = this.f63197s;
            bVar.getClass();
            return q2.j(bVar, j63.a.d(m0.f116981a), num);
        }
    }

    public static final void a(v0 v0Var, com.garmin.android.apps.connectmobile.workouts.presentation.details.f fVar, lc.m0 m0Var, c cVar, e23.l<? super com.garmin.android.apps.connectmobile.workouts.presentation.details.d, Unit> lVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, m mVar, int i14) {
        int i15;
        com.garmin.android.apps.connectmobile.workouts.presentation.details.f fVar2;
        lc.m0 m0Var2;
        c cVar2;
        e23.l<? super com.garmin.android.apps.connectmobile.workouts.presentation.details.d, Unit> lVar2;
        o0 o0Var;
        v0Var.getClass();
        fVar.getClass();
        m0Var.getClass();
        cVar.getClass();
        lVar.getClass();
        o0 o0VarP = fb1.c.p(aVar, aVar2, mVar, -4107558);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarP.B(v0Var) : o0VarP.r(v0Var) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            fVar2 = fVar;
            i15 |= o0VarP.r(fVar2) ? 32 : 16;
        } else {
            fVar2 = fVar;
        }
        if ((i14 & 384) == 0) {
            m0Var2 = m0Var;
            i15 |= o0VarP.r(m0Var2) ? 256 : 128;
        } else {
            m0Var2 = m0Var;
        }
        if ((i14 & 3072) == 0) {
            cVar2 = cVar;
            i15 |= o0VarP.B(cVar2) ? 2048 : 1024;
        } else {
            cVar2 = cVar;
        }
        if ((i14 & 24576) == 0) {
            lVar2 = lVar;
            i15 |= o0VarP.r(lVar2) ? 16384 : 8192;
        } else {
            lVar2 = lVar;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarP.r(aVar) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i15 |= o0VarP.r(aVar2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (o0VarP.n(i15 & 1, (599187 & i15) != 599186)) {
            x1 x1Var = n.f135158a;
            o0Var = o0VarP;
            z02.b.a(false, null, null, null, false, z3.f.c(1202585956, new l0(m0Var2, (Object) cVar2, (Object) v0Var, (Object) fVar2, (Object) aVar2, (Object) lVar2, (Object) aVar, 9), o0VarP), o0Var, 196608, 31);
        } else {
            o0Var = o0VarP;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o(v0Var, fVar, m0Var, cVar, lVar, aVar, aVar2, i14, 6);
        }
    }
}

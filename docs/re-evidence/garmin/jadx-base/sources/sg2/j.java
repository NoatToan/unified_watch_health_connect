package sg2;

import android.app.Activity;
import androidx.lifecycle.n0;
import c.w;
import c2.b0;
import c2.u;
import c2.x2;
import c2.y;
import c2.z;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.RememberLottieCompositionKt;
import com.garmin.android.apps.connectmobile.R;
import f5.z0;
import h5.e0;
import i3.mh;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import yg2.h0;

/* JADX INFO: loaded from: classes11.dex */
public final class j {
    /* JADX WARN: Code duplicated, block: B:32:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d9  */
    public static final void a(h4.r rVar, yg2.o oVar, h0 h0Var, e23.a aVar, e23.a aVar2, p3.m mVar, int i14) {
        h4.r rVar2;
        String str;
        boolean z14;
        h4.r.a aVar3;
        boolean z15;
        oVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        o0 o0VarE = mVar.E(774583458);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = i14 | 6 | (o0VarE.r(oVar) ? 32 : 16) | (o0VarE.r(h0Var) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024) | (o0VarE.r(aVar2) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            h4.r.a aVar4 = h4.r.S;
            x1 x1Var = p3.n.f135158a;
            Activity activity = (Activity) o0VarE.A(c.n.f22332a);
            LottieCompositionResult lottieCompositionResultRememberLottieComposition = RememberLottieCompositionKt.rememberLottieComposition(LottieCompositionSpec.RawRes.m40boximpl(LottieCompositionSpec.RawRes.m41constructorimpl(R.raw.breathwork_lottie_animation)), null, null, null, null, null, o0VarE, 0, 62);
            n0 n0Var = (n0) o0VarE.A(s9.j.f158018a);
            Unit unit = Unit.INSTANCE;
            boolean zR = o0VarE.r(n0Var) | ((i15 & 7168) == 2048);
            Object objQ = o0VarE.q();
            p3.m.a aVar5 = p3.m.f135153a;
            if (zR) {
                objQ = new h(n0Var, aVar, null);
                o0VarE.K(objQ);
            } else {
                aVar5.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new h(n0Var, aVar, null);
                    o0VarE.K(objQ);
                }
            }
            l0.e((e23.p) objQ, unit, o0VarE);
            boolean zR2 = o0VarE.r(activity);
            Object objQ2 = o0VarE.q();
            if (zR2) {
                objQ2 = new pg2.d(activity, 2);
                o0VarE.K(objQ2);
            } else {
                aVar5.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new pg2.d(activity, 2);
                    o0VarE.K(objQ2);
                }
            }
            l0.a(activity, (e23.l) objQ2, o0VarE);
            w.a((i15 >> 9) & 112, 1, aVar2, o0VarE, false);
            h4.r rVarD = x2.d(aVar4, 1.0f);
            h4.d.f81522a.getClass();
            z0 z0VarD = c2.q.d(h4.d.a.f81528f, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarD, o0VarE);
            h5.g.V.getClass();
            e0.a aVar6 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar6);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, z0VarD, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            u uVar = u.f22885a;
            h4.g.a aVar7 = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            z zVarA = y.a(c2.j.f22694d, aVar7, o0VarE, 48);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(aVar4, o0VarE);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar6);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, zVarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC2, o0VarE);
            b0 b0Var = b0.f22601a;
            LottieComposition f182175a = lottieCompositionResultRememberLottieComposition.getF182175a();
            e.f159224c.getClass();
            d.a(f182175a, e.a.a(h0Var), o0VarE, 0);
            if (h0Var == null) {
                o0VarE.C(-1227073308);
                o0VarE.g0(false);
                str = null;
            } else {
                o0VarE.C(-1147961667);
                String strB = h0Var.b(o0VarE);
                o0VarE.g0(false);
                str = strB;
            }
            if (str == null) {
                o0VarE.C(-1227041316);
                o0VarE.g0(false);
                z14 = false;
                aVar3 = aVar4;
                z15 = true;
            } else {
                o0VarE.C(-1227041315);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                c2.l.f(x2.k(aVar4, j92.b.f97899b.f97919d), o0VarE);
                d92.b.f58624b.getClass();
                z14 = false;
                aVar3 = aVar4;
                z15 = true;
                mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97929f, o0VarE), o0VarE, 0, 0, 131070);
                o0VarE.g0(false);
            }
            if (h0Var == null) {
                o0VarE = o0VarE;
                o0VarE.C(-1226756426);
                o0VarE.g0(z14);
            } else {
                o0VarE = o0VarE;
                o0VarE.C(-1226756425);
                yg2.a aVarF = fg2.h0.f(h0Var, oVar);
                if (aVarF == null) {
                    o0VarE.C(-1072759547);
                    o0VarE.g0(z14);
                } else {
                    o0VarE.C(-1072759546);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    c2.l.f(x2.k(aVar3, j92.b.f97899b.f97920e), o0VarE);
                    s5.c cVarE = fg2.h0.e(aVarF, oVar, h0Var, o0VarE);
                    d92.b.f58624b.getClass();
                    o0 o0Var = o0VarE;
                    mh.d(cVarE, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, d92.c.b(j92.f.f97930g, o0VarE), o0Var, 0, 0, 262142);
                    o0VarE = o0Var;
                    o0VarE.g0(z14);
                }
                o0VarE.g0(z14);
            }
            o0VarE.g0(z15);
            o0VarE.g0(z15);
            rVar2 = aVar3;
        } else {
            o0VarE.e();
            rVar2 = rVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g(rVar2, oVar, h0Var, aVar, aVar2, i14, 0);
        }
    }
}

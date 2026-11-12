package sg2;

import c2.b0;
import c2.x2;
import c2.y;
import c2.z;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.RememberLottieCompositionKt;
import com.garmin.android.apps.connectmobile.R;
import fg2.a0;
import h5.e0;
import i3.mh;
import java.util.List;
import java.util.Map;
import l72.y2;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import u1.w;
import yg2.h0;

/* JADX INFO: loaded from: classes11.dex */
public final class b {
    public static final void a(h4.r rVar, yg2.o oVar, h0 h0Var, Map map, fg2.c cVar, e23.a aVar, p3.m mVar, int i14) {
        oVar.getClass();
        map.getClass();
        cVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(-1926378192);
        int i15 = i14 | (o0VarE.r(oVar) ? 32 : 16) | (o0VarE.r(h0Var) ? 256 : 128) | (o0VarE.r(map) ? 2048 : 1024) | (o0VarE.B(cVar) ? 16384 : 8192) | (o0VarE.r(aVar) ? 131072 : 65536);
        boolean z14 = false;
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            LottieCompositionResult lottieCompositionResultRememberLottieComposition = RememberLottieCompositionKt.rememberLottieComposition(LottieCompositionSpec.RawRes.m40boximpl(LottieCompositionSpec.RawRes.m41constructorimpl(R.raw.breathwork_lottie_animation)), null, null, null, null, null, o0VarE, 0, 62);
            if (h0Var != null && h0Var.p()) {
                z14 = true;
            }
            Boolean boolValueOf = Boolean.valueOf(z14);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new se0.a(3);
                o0VarE.K(objQ);
            }
            z3.e eVarC = z3.f.c(-426728461, new ca0.e(h0Var, rVar, aVar, cVar, oVar, map, lottieCompositionResultRememberLottieComposition, 4), o0VarE);
            o0VarE = o0VarE;
            r1.b.a(boolValueOf, null, (e23.l) objQ, null, null, null, eVarC, o0VarE, 1573248, 58);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new oy0.b(rVar, oVar, h0Var, map, cVar, aVar, i14, 19);
        }
    }

    public static final void b(h4.r rVar, LottieComposition lottieComposition, e23.a aVar, h0 h0Var, String str, s5.c cVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-595864113);
        int i15 = i14 | (o0VarE.B(rVar) ? 4 : 2) | (o0VarE.r(lottieComposition) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128) | (o0VarE.r(h0Var) ? 2048 : 1024) | (o0VarE.B(str) ? 16384 : 8192) | (o0VarE.B(cVar) ? 131072 : 65536);
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            f.a(x2.f(w.d(rVar, false, null, null, aVar, 15), 1.0f), am.j.B(d92.b.f58623a, o0VarE), z3.f.c(-1196037157, new mw0.h(lottieComposition, h0Var, str, cVar, 19), o0VarE), o0VarE, 384, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new oy0.b(rVar, lottieComposition, aVar, h0Var, str, cVar, i14, 20);
        }
    }

    public static final void c(h4.r rVar, List list, e23.l lVar, float f14, p3.m mVar, int i14) {
        String str;
        o0 o0VarE = mVar.E(723272041);
        int i15 = i14 | (o0VarE.B(rVar) ? 4 : 2) | (o0VarE.r(list) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128) | (o0VarE.i(f14) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            int size = list.size();
            int i16 = (int) (size * f14);
            int i17 = size - 1;
            if (i16 > i17) {
                i16 = i17;
            }
            a0 a0Var = (a0) p13.h0.e0(i16, list);
            if (a0Var == null) {
                a0Var = new a0("", null);
            }
            h4.r rVarD = x2.d(rVar, 1.0f);
            h4.d.f81522a.getClass();
            h4.g.a aVar = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            z zVarA = y.a(c2.j.f22694d, aVar, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarD, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
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
            b0 b0Var = b0.f22601a;
            h4.r.a aVar3 = h4.r.S;
            c2.l.f(b0Var.a(aVar3, 1.0f, true), o0VarE);
            String str2 = a0Var.f71404b;
            if (str2 == null || (str = (String) lVar.invoke(str2)) == null) {
                str = a0Var.f71403a;
            }
            String str3 = str;
            d6.h.f57752b.getClass();
            d6.h hVarA = d6.h.a(d6.h.f57755e);
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            mh.c(str3, null, 0L, null, 0L, null, 0L, hVarA, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, o0VarE), o0VarE, 0, 0, 130046);
            o0VarE = o0VarE;
            c2.l.f(b0Var.a(aVar3, 1.0f, true), o0VarE);
            y2 y2Var = y2.f111386a;
            h4.r rVarF = x2.f(aVar3, 1.0f);
            gl.c.f77766a.getClass();
            y2Var.a(f14, 0.0f, 0, ((i15 >> 9) & 14) | 48, 116, gl.c.a(o0VarE).b(), 0L, rVarF, o0VarE);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new hz0.w(rVar, list, lVar, f14, i14);
        }
    }
}

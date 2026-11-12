package sg2;

import android.app.Activity;
import c.w;
import c2.b0;
import c2.x2;
import c2.y;
import c2.z;
import com.airbnb.lottie.compose.LottieAnimationKt;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.RememberLottieCompositionKt;
import com.garmin.android.apps.connectmobile.R;
import h5.e0;
import java.util.Map;
import l72.y2;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;
import p3.h0;
import p3.i2;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import rx1.u;

/* JADX INFO: loaded from: classes11.dex */
public final class k {

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"sg2/k$a", "Lp3/h0;", "runtime"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements h0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Integer f159246a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Activity f159247b;

        public a(Integer num, Activity activity) {
            this.f159246a = num;
            this.f159247b = activity;
        }

        @Override // p3.h0
        public final void dispose() {
            Integer num = this.f159246a;
            if (num != null) {
                this.f159247b.setRequestedOrientation(num.intValue());
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00be  */
    public static final void a(Map<ag2.c.a, ah2.e> map, yg2.h0 h0Var, e23.a<Unit> aVar, p3.m mVar, int i14) {
        o0 o0Var;
        Float f14;
        Float f15;
        Float fValueOf;
        lt2.a duration;
        map.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(-1949536384);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.r(map) ? 4 : 2) | (o0VarE.r(h0Var) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            Activity activity = (Activity) o0VarE.A(c.n.f22332a);
            LottieCompositionResult lottieCompositionResultRememberLottieComposition = RememberLottieCompositionKt.rememberLottieComposition(LottieCompositionSpec.RawRes.m40boximpl(LottieCompositionSpec.RawRes.m41constructorimpl(R.raw.meditation_lottie_animation)), null, null, null, null, null, o0VarE, 0, 62);
            ah2.e eVar = map.get(ag2.c.a.TIMER);
            if (eVar == null || (f15 = eVar.f3290b) == null) {
                f14 = null;
            } else {
                float fFloatValue = f15.floatValue();
                if (h0Var == null || (duration = h0Var.getDuration()) == null) {
                    fValueOf = null;
                } else {
                    float f16 = (float) duration.f114867b;
                    fValueOf = Float.valueOf((f16 - fFloatValue) / f16);
                }
                f14 = fValueOf;
            }
            boolean zR = o0VarE.r(activity);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new pg2.d(activity, 3);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new pg2.d(activity, 3);
                    o0VarE.K(objQ);
                }
            }
            l0.a(activity, (e23.l) objQ, o0VarE);
            w.a((i15 >> 3) & 112, 1, aVar, o0VarE, false);
            h4.r.a aVar2 = h4.r.S;
            h4.r rVarD = x2.d(aVar2, 1.0f);
            h4.d.f81522a.getClass();
            h4.g.a aVar3 = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            z zVarA = y.a(kVar, aVar3, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarD, o0VarE);
            h5.g.V.getClass();
            e0.a aVar4 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            c2.l.f(b0Var.a(aVar2, 1.0f, true), o0VarE);
            LottieAnimationKt.LottieAnimation(lottieCompositionResultRememberLottieComposition.getF182175a(), null, false, false, null, 0.0f, Integer.MAX_VALUE, false, false, false, null, false, false, null, null, null, true, false, null, false, null, o0VarE, 1572864, 1572864, 0, 2031550);
            o0Var = o0VarE;
            h4.r rVarA = b0Var.a(aVar2, 1.0f, true);
            z zVarA2 = y.a(kVar, h4.d.a.f81536n, o0Var, 0);
            int iHashCode2 = Long.hashCode(o0Var.U);
            i2 i2VarA1 = o0Var.a0();
            h4.r rVarC2 = h4.k.c(rVarA, o0Var);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0Var.z();
            if (o0Var.T) {
                o0Var.M(aVar4);
            } else {
                o0Var.c();
            }
            b4.c(eVar2, zVarA2, o0Var);
            b4.c(c1623g, i2VarA1, o0Var);
            if (o0Var.T || !p005kotlin.jvm.internal.s.g(o0Var.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0Var, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC2, o0Var);
            if (f14 == null) {
                o0Var.C(-1275825009);
                o0Var.g0(false);
            } else {
                o0Var.C(-1275825008);
                float fFloatValue2 = f14.floatValue();
                g6.f.a aVar5 = g6.f.f75994b;
                c2.l.f(x2.h(aVar2, 40), o0Var);
                y2 y2Var = y2.f111386a;
                mg2.w.f118432a.getClass();
                h4.r rVarP = x2.p(aVar2, mg2.w.f118445n);
                gl.c.f77766a.getClass();
                y2Var.a(fFloatValue2, 0.0f, 0, 48, 116, gl.c.a(o0Var).b(), 0L, rVarP, o0Var);
                o0Var = o0Var;
                Unit unit = Unit.INSTANCE;
                o0Var.g0(false);
            }
            o0Var.g0(true);
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new u(map, h0Var, aVar, i14, 12);
        }
    }
}

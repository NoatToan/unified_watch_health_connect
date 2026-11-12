package j21;

import c2.y;
import c2.z;
import c22.c3;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.AnimateLottieCompositionAsStateKt;
import com.airbnb.lottie.compose.LottieAnimationKt;
import com.airbnb.lottie.compose.LottieAnimationState;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.RememberLottieCompositionKt;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import ew1.u1;
import h5.e0;
import java.util.Set;
import kotlin.t1;
import l72.l2;
import o53.b0;
import p005kotlin.Unit;
import p13.a1;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f96672a;

    static {
        e53.c.a aVar = e53.c.f63094b;
        f96672a = e53.e.e(2, e53.f.SECONDS);
    }

    public static final void a(h4.r rVar, String str, String str2, b92.a aVar, String str3, boolean z14, boolean z15, e23.a aVar2, e23.a aVar3, p3.m mVar, int i14) {
        h4.r rVar2;
        o0 o0VarE = mVar.E(916284604);
        int i15 = i14 | 6 | (o0VarE.B(str) ? 32 : 16) | (o0VarE.B(str2) ? 256 : 128) | (o0VarE.B(aVar) ? 2048 : 1024) | (o0VarE.B(str3) ? 16384 : 8192) | (o0VarE.h(z14) ? 131072 : 65536) | (o0VarE.h(z15) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.r(aVar2) ? 8388608 : 4194304) | (o0VarE.r(aVar3) ? 67108864 : 33554432);
        if (o0VarE.n(i15 & 1, (38347923 & i15) != 38347922)) {
            h4.r.a aVar4 = h4.r.S;
            x1 x1Var = p3.n.f135158a;
            w4.a aVar5 = (w4.a) o0VarE.A(t1.f91494l);
            Object[] objArr = new Object[0];
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new f(0);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) d4.a.e(objArr, (e23.a) objQ, o0VarE, 48);
            int i16 = b92.a.f16960b;
            d.a(aVar4, str, str2, aVar, false, z3.f.c(2102053512, new fv1.b(str3, 10), o0VarE), z3.f.c(-1291845849, new u1(z14, z15, p1Var, aVar5, aVar3, 7), o0VarE), aVar2, o0VarE, (i15 & 112) | 113246214 | (i15 & 896) | ((i15 << 3) & 57344), (i15 >> 21) & 14);
            rVar2 = aVar4;
        } else {
            o0VarE.e();
            rVar2 = rVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g(rVar2, str, str2, aVar, str3, z14, z15, aVar2, aVar3, i14);
        }
    }

    public static final void b(final h4.r rVar, final String str, final String str2, final b92.a aVar, final String str3, final boolean z14, boolean z15, final boolean z16, final c3 c3Var, final c3 c3Var2, final e23.a aVar2, final e23.a aVar3, final e23.a aVar4, p3.m mVar, final int i14) {
        final boolean z17;
        boolean z18;
        str.getClass();
        o0 o0VarE = mVar.E(-1602118534);
        int i15 = i14 | (o0VarE.B(rVar) ? 4 : 2) | (o0VarE.B(str) ? 32 : 16) | (o0VarE.B(str2) ? 256 : 128) | (o0VarE.B(aVar) ? 2048 : 1024) | (o0VarE.B(str3) ? 16384 : 8192) | (o0VarE.h(z14) ? 131072 : 65536) | 1572864 | (o0VarE.h(z16) ? 8388608 : 4194304) | (o0VarE.r(c3Var) ? 67108864 : 33554432) | (o0VarE.r(c3Var2) ? 536870912 : 268435456);
        if (o0VarE.n(i15 & 1, ((306783379 & i15) == 306783378 && ((((o0VarE.r(aVar2) ? (char) 4 : (char) 2) | (o0VarE.r(aVar3) ? ' ' : (char) 16)) | (o0VarE.r(aVar4) ? (char) 256 : (char) 128)) & 147) == 146) ? false : true)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                z18 = true;
            } else {
                o0VarE.e();
                z18 = z15;
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ);
            }
            b0 b0Var = (b0) objQ;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVar, o0VarE);
            h5.g.V.getClass();
            e0.a aVar5 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
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
            c2.b0 b0Var2 = c2.b0.f22601a;
            Set setB = a1.b(new c92.b.a(c92.a.DELETE, gl1.y.Q(o0VarE, R.string.lbl_delete)));
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new ik2.b(29);
                o0VarE.K(objQ2);
            }
            l2.a(setB, b0Var, z16, null, (e23.a) objQ2, z3.f.c(357292653, new e11.l(str, str2, aVar, str3, z14, z18, aVar2, aVar3), o0VarE), z3.f.c(-1307135732, new gw1.e(c3Var, 15, c3Var2, aVar4), o0VarE), o0VarE, 1794048 | ((i15 >> 15) & 896), 8);
            o0VarE.g0(true);
            z17 = z18;
        } else {
            o0VarE.e();
            z17 = z15;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p(str, str2, aVar, str3, z14, z17, z16, c3Var, c3Var2, aVar2, aVar3, aVar4, i14) { // from class: j21.e

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ String f96643b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ String f96644c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ b92.a f96645d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ String f96646e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ boolean f96647f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ boolean f96648g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public final /* synthetic */ boolean f96649h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public final /* synthetic */ c3 f96650i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public final /* synthetic */ c3 f96651j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                public final /* synthetic */ e23.a f96652k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                public final /* synthetic */ e23.a f96653l;

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                public final /* synthetic */ e23.a f96654m;

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p0.t(1);
                    j.b(this.f96642a, this.f96643b, this.f96644c, this.f96645d, this.f96646e, this.f96647f, this.f96648g, this.f96649h, this.f96650i, this.f96651j, this.f96652k, this.f96653l, this.f96654m, (p3.m) obj, iT);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:42:0x013a  */
    /* JADX WARN: Code duplicated, block: B:54:0x0169  */
    public static final void c(int i14, e23.a aVar, h4.r rVar, p3.m mVar, boolean z14) {
        boolean z15;
        o0 o0VarE = mVar.E(186689142);
        int i15 = i14 | (o0VarE.B(rVar) ? 4 : 2) | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            d92.b.f58623a.getClass();
            LottieCompositionResult lottieCompositionResultRememberLottieComposition = RememberLottieCompositionKt.rememberLottieComposition(LottieCompositionSpec.RawRes.m40boximpl(LottieCompositionSpec.RawRes.m41constructorimpl(d92.b.d(o0VarE) ? R.raw.log_food_feedback_animation_dark_mode : R.raw.log_food_feedback_animation_light_mode)), null, null, null, null, null, o0VarE, 0, 62);
            int i16 = i15 & 112;
            LottieAnimationState lottieAnimationStateAnimateLottieCompositionAsState = AnimateLottieCompositionAsStateKt.animateLottieCompositionAsState(lottieCompositionResultRememberLottieComposition.getF182175a(), z14, false, false, null, 0.0f, 1, null, false, false, o0VarE, 1572864 | i16, 956);
            LottieComposition f182175a = lottieCompositionResultRememberLottieComposition.getF182175a();
            boolean zB = o0VarE.B(lottieAnimationStateAnimateLottieCompositionAsState);
            Object objQ = o0VarE.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (zB) {
                objQ = new fx0.e(lottieAnimationStateAnimateLottieCompositionAsState, 1);
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new fx0.e(lottieAnimationStateAnimateLottieCompositionAsState, 1);
                    o0VarE.K(objQ);
                }
            }
            z15 = z14;
            LottieAnimationKt.LottieAnimation(f182175a, (e23.a) objQ, rVar, false, false, false, null, false, null, null, null, false, false, null, null, false, o0VarE, (i15 << 6) & 896, 0, 65528);
            o0VarE = o0VarE;
            Boolean boolValueOf = Boolean.valueOf(z15);
            Boolean boolValueOf2 = Boolean.valueOf(lottieAnimationStateAnimateLottieCompositionAsState.isAtEnd());
            int i17 = i15 & 896;
            boolean zB2 = (i16 == 32) | o0VarE.B(lottieAnimationStateAnimateLottieCompositionAsState) | (i17 == 256);
            Object objQ2 = o0VarE.q();
            if (zB2) {
                objQ2 = new h(z15, lottieAnimationStateAnimateLottieCompositionAsState, aVar, null);
                o0VarE.K(objQ2);
            } else {
                aVar2.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new h(z15, lottieAnimationStateAnimateLottieCompositionAsState, aVar, null);
                    o0VarE.K(objQ2);
                }
            }
            l0.f(boolValueOf, boolValueOf2, (e23.p) objQ2, o0VarE);
            Boolean boolValueOf3 = Boolean.valueOf(z15);
            boolean z16 = (i16 == 32) | (i17 == 256);
            Object objQ3 = o0VarE.q();
            if (z16) {
                objQ3 = new i(z15, aVar, null);
                o0VarE.K(objQ3);
            } else {
                aVar2.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = new i(z15, aVar, null);
                    o0VarE.K(objQ3);
                }
            }
            l0.e((e23.p) objQ3, boolValueOf3, o0VarE);
        } else {
            z15 = z14;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d50.n(rVar, z15, aVar, i14, 3);
        }
    }
}

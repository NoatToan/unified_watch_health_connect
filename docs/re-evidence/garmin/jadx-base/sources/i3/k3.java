package i3;

import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class k3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c2.l2 f88661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f88662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f88663c;

    static {
        float f14 = 8;
        g6.f.a aVar = g6.f.f75994b;
        f88661a = c2.l.e(0.0f, 0.0f, 6, f14, 3);
        f88662b = f14;
        f88663c = 12;
    }

    public static final void a(final e23.a aVar, final z3.e eVar, h4.r rVar, final e23.p pVar, o4.r1 r1Var, float f14, final b3 b3Var, p004k6.u uVar, final z3.e eVar2, p3.m mVar, final int i14) {
        int i15;
        z3.e eVar3;
        final h4.r rVar2;
        final float f15;
        final p004k6.u uVar2;
        final o4.r1 r1Var2;
        float f16;
        int i16;
        h4.r rVar3;
        p004k6.u uVar3;
        o4.r1 r1Var3;
        p3.o0 o0VarE = mVar.E(219718641);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(aVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            eVar3 = eVar;
            i15 |= o0VarE.r(eVar3) ? 32 : 16;
        } else {
            eVar3 = eVar;
        }
        int i17 = i15 | 384;
        if ((i14 & 3072) == 0) {
            i17 |= o0VarE.r(pVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i17 |= 8192;
        }
        int i18 = i17 | 196608;
        if ((1572864 & i14) == 0) {
            i18 |= o0VarE.B(b3Var) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        int i19 = i18 | 12582912;
        if ((100663296 & i14) == 0) {
            i19 |= o0VarE.r(eVar2) ? 67108864 : 33554432;
        }
        if (o0VarE.n(i19 & 1, (38347923 & i19) != 38347922)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                h4.r.a aVar2 = h4.r.S;
                d3 d3Var = d3.f87817a;
                d3Var.getClass();
                p3.x1 x1Var = p3.n.f135158a;
                n3.n.f123126a.getClass();
                o4.r1 r1VarC = fc.c(n3.n.f123129d, o0VarE);
                d3Var.getClass();
                f16 = d3.f87819c;
                i16 = i19 & (-57345);
                rVar3 = aVar2;
                uVar3 = new p004k6.u(false, false, false, 3, (p005kotlin.jvm.internal.j) null);
                r1Var3 = r1VarC;
            } else {
                o0VarE.e();
                r1Var3 = r1Var;
                f16 = f14;
                uVar3 = uVar;
                i16 = i19 & (-57345);
                rVar3 = rVar;
            }
            o0VarE.h0();
            p3.x1 x1Var2 = p3.n.f135158a;
            l.d(aVar, c2.x2.x(rVar3, null, 3), uVar3, z3.f.c(1108953335, new j3(r1Var3, b3Var, f16, eVar2, pVar, eVar3), o0VarE), o0VarE, ((i16 >> 15) & 896) | (i16 & 14) | 3072, 0);
            uVar2 = uVar3;
            f15 = f16;
            rVar2 = rVar3;
            r1Var2 = r1Var3;
        } else {
            o0VarE.e();
            rVar2 = rVar;
            f15 = f14;
            uVar2 = uVar;
            r1Var2 = r1Var;
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: i3.f3
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    k3.a(aVar, eVar, rVar2, pVar, r1Var2, f15, b3Var, uVar2, eVar2, (p3.m) obj, p3.p0.t(i14 | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }
}

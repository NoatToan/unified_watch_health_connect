package is;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.u;
import c2.x2;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import f5.z0;
import gs.t;
import h5.e0;
import nr.p0;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final class h {
    public static final void a(h4.r rVar, ds.n nVar, Bitmap bitmap, int i14, p0 p0Var, boolean z14, e23.a<Unit> aVar, p3.m mVar, int i15, int i16) {
        h4.r rVar2;
        int i17;
        nVar.getClass();
        bitmap.getClass();
        p0Var.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(1628738032);
        int i18 = i16 & 1;
        if (i18 != 0) {
            i17 = i15 | 6;
            rVar2 = rVar;
        } else {
            rVar2 = rVar;
            i17 = i15 | (o0VarE.B(rVar2) ? 4 : 2);
        }
        int i19 = i17 | (o0VarE.k(nVar.ordinal()) ? 32 : 16) | (o0VarE.r(bitmap) ? 256 : 128) | (o0VarE.k(i14) ? 2048 : 1024) | (o0VarE.r(p0Var) ? 16384 : 8192) | (o0VarE.r(aVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (o0VarE.n(i19 & 1, (599187 & i19) != 599186)) {
            h4.r rVar3 = i18 != 0 ? h4.r.S : rVar2;
            x1 x1Var = p3.n.f135158a;
            lg.d.d(true, null, null, z3.f.c(20434456, new j21.n(nVar, rVar3, bitmap.getConfig() == Bitmap.Config.HARDWARE ? bitmap.copy(Bitmap.Config.ARGB_8888, false) : bitmap, p0Var, z14, 1 - ((i14 * 2.0f) / ((Configuration) o0VarE.A(AndroidCompositionLocals_androidKt.f6041a)).screenWidthDp), aVar), o0VarE), o0VarE, 3078, 6);
            rVar2 = rVar3;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d62.o(rVar2, nVar, bitmap, i14, p0Var, z14, aVar, i15, i16);
        }
    }

    public static final void b(final h4.r rVar, final p0 p0Var, final ds.n nVar, final boolean z14, final e23.a aVar, final e23.a aVar2, final e23.a aVar3, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(499417799);
        int i15 = i14 | (o0VarE.B(rVar) ? 4 : 2) | (o0VarE.r(p0Var) ? 32 : 16) | (o0VarE.k(nVar.ordinal()) ? 256 : 128) | (o0VarE.h(z14) ? 2048 : 1024) | (o0VarE.r(aVar) ? 16384 : 8192) | (o0VarE.r(aVar2) ? 131072 : 65536) | (o0VarE.r(aVar3) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (o0VarE.n(i15 & 1, (599187 & i15) != 599186)) {
            x1 x1Var = p3.n.f135158a;
            final float f14 = 1 - (128.0f / ((Configuration) o0VarE.A(AndroidCompositionLocals_androidKt.f6041a)).screenWidthDp);
            lg.d.d(true, null, null, z3.f.c(-2112227937, new e23.p() { // from class: is.e
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    p3.m mVar2 = (p3.m) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                        x1 x1Var2 = p3.n.f135158a;
                        h4.r rVarF = x2.f(h4.r.S, 1.0f);
                        ds.n nVar2 = nVar;
                        h4.r rVarG = c2.l.g(rVarF, nVar2.f61018b);
                        h4.d.f81522a.getClass();
                        z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                        int iHashCode = Long.hashCode(mVar2.getU());
                        i2 i2VarX = mVar2.x();
                        h4.r rVarC = h4.k.c(rVarG, mVar2);
                        h5.g.V.getClass();
                        e0.a aVar4 = h5.g.a.f81805b;
                        if (mVar2.F() == null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar4);
                        } else {
                            mVar2.c();
                        }
                        b4.c(h5.g.a.f81810g, z0VarD, mVar2);
                        b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                        h5.g.a.b bVar = h5.g.a.f81813j;
                        if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                            v.h.z(iHashCode, mVar2, iHashCode, bVar);
                        }
                        b4.c(h5.g.a.f81807d, rVarC, mVar2);
                        u uVar = u.f22885a;
                        p0 p0Var2 = p0Var;
                        p0.a aVar5 = p0Var2.f127286e;
                        boolean zEquals = aVar5.equals(p0.a.C2447a.f127287a);
                        h4.r rVar2 = rVar;
                        float f15 = f14;
                        if (zEquals) {
                            mVar2.C(1937980791);
                            gs.c.a(rVar2, p0Var2, f15, nVar2, mVar2, 0);
                            mVar2.f();
                        } else {
                            boolean z15 = aVar5 instanceof p0.a.h;
                            e23.a aVar6 = aVar;
                            e23.a aVar7 = aVar3;
                            if (z15) {
                                mVar2.C(1937985865);
                                t.a(rVar2, p0Var2, z14, f15, nVar2, aVar6, aVar7, mVar2, 0, 0);
                                mVar2 = mVar2;
                                mVar2.f();
                            } else if (aVar5 instanceof p0.a.d) {
                                mVar2.C(1937998611);
                                gs.g.a(rVar2, p0Var2, f15, nVar2, mVar2, 0);
                                mVar2.f();
                            } else if (aVar5 instanceof p0.a.e) {
                                mVar2.C(1938002905);
                                gs.j.a(rVar2, p0Var2, f15, nVar2, mVar2, 0);
                                mVar2.f();
                            } else if (aVar5 instanceof p0.a.g) {
                                mVar2.C(1938007319);
                                gs.n.d(rVar2, p0Var2, f15, nVar2, mVar2, 0);
                                mVar2.f();
                            } else if (aVar5 instanceof p0.a.f) {
                                mVar2.C(1938011605);
                                gs.l.c(rVar2, p0Var2, f15, nVar2, mVar2, 0);
                                mVar2.f();
                            } else if (aVar5 instanceof p0.a.i) {
                                mVar2.C(1938016962);
                                gs.p.a(rVar2, p0Var2, f15, nVar2, aVar6, aVar7, mVar2, 0);
                                mVar2 = mVar2;
                                mVar2.f();
                            } else if (aVar5 instanceof p0.a.b) {
                                mVar2.C(-50614746);
                                gs.u.a(rVar2, aVar2, ((p0.a.b) p0Var2.f127286e).f127288a, nVar2, mVar2, 0);
                                mVar2.f();
                            } else {
                                mVar2.C(-50333669);
                                mVar2.f();
                            }
                        }
                        mVar2.y();
                    } else {
                        mVar2.e();
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE), o0VarE, 3078, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new defpackage.d(rVar, p0Var, nVar, z14, aVar, aVar2, aVar3, i14);
        }
    }
}

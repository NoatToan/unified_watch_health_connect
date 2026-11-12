package bn1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.l;
import c2.v;
import c2.w;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import e23.p;
import e23.q;
import f5.g0;
import h4.r;
import h5.e0;
import i3.mh;
import jf.s;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import u1.y0;

/* JADX INFO: loaded from: classes10.dex */
public final class c {
    public static final void a(final float f14, final float f15, final float f16, final String str, final float f17, final long j8, m mVar, final int i14) {
        int i15;
        float f18;
        String str2;
        o0 o0VarE = mVar.E(-200438840);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.i(f14) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.i(f15) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.i(0.0f) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            f18 = f16;
            i15 |= o0VarE.i(f18) ? 2048 : 1024;
        } else {
            f18 = f16;
        }
        if ((i14 & 24576) == 0) {
            str2 = str;
            i15 |= o0VarE.B(str2) ? 16384 : 8192;
        } else {
            str2 = str;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.i(f17) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i15 |= o0VarE.l(j8) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (o0VarE.n(i15 & 1, (599187 & i15) != 599186)) {
            x1 x1Var = n.f135158a;
            final Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            boolean z14 = f14 > f15;
            boolean z15 = z14;
            final float f19 = z14 ? f15 : f14;
            final float f22 = z15 ? f14 : f15;
            final jf.d dVarA = s.a(a7.b.getDrawable(context, z15 ? R.drawable.rounded_rectangle : R.drawable.rounded_rectangle_outline), null, o0VarE, 0, 30);
            r rVarF = x2.f(l.A(r.S, f17, 0.0f, 2), 1.0f);
            h4.d.f81522a.getClass();
            final float f24 = f18;
            final String str3 = str2;
            v.a(rVarF, h4.d.a.f81524b, false, z3.f.c(1834299550, new q() { // from class: bn1.a
                /* JADX WARN: Multi-variable type inference failed */
                @Override // e23.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    w wVar = (w) obj;
                    m mVar2 = (m) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    wVar.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= mVar2.B(wVar) ? 4 : 2;
                    }
                    if (mVar2.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                        x1 x1Var2 = n.f135158a;
                        Object objQ = mVar2.q();
                        m.f135153a.getClass();
                        m.a.C2565a c2565a = m.a.f135155b;
                        if (objQ == c2565a) {
                            objQ = p0.n(g6.f.a(0));
                            mVar2.K(objQ);
                        }
                        p1 p1Var = (p1) objQ;
                        Object objQ2 = mVar2.q();
                        if (objQ2 == c2565a) {
                            objQ2 = p0.n(g6.f.a(0));
                            mVar2.K(objQ2);
                        }
                        p1 p1Var2 = (p1) objQ2;
                        g6.f fVarA = g6.f.a((((g6.f) p1Var2.getF182175a()).f75997a - ((g6.f) p1Var.getF182175a()).f75997a) / 2);
                        float f25 = 0;
                        if (g6.f.b(fVarA.f75997a, f25) <= 0) {
                            fVarA = null;
                        }
                        if (fVarA != null) {
                            f25 = fVarA.f75997a;
                        }
                        float fJ = wVar.j();
                        float f26 = f19;
                        float f27 = f24;
                        r.a aVar = r.S;
                        r rVarV = l.v(aVar, ((f26 / f27) * fJ) - f25, 0.0f, 2);
                        h4.d.f81522a.getClass();
                        h4.g.a aVar2 = h4.d.a.f81537o;
                        c2.j.f22691a.getClass();
                        z zVarA = y.a(c2.j.f22694d, aVar2, mVar2, 48);
                        int iHashCode = Long.hashCode(mVar2.getU());
                        i2 i2VarX = mVar2.x();
                        r rVarC = h4.k.c(rVarV, mVar2);
                        h5.g.V.getClass();
                        e0.a aVar3 = h5.g.a.f81805b;
                        if (mVar2.F() == null) {
                            p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar3);
                        } else {
                            mVar2.c();
                        }
                        b4.c(h5.g.a.f81810g, zVarA, mVar2);
                        b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                        h5.g.a.b bVar = h5.g.a.f81813j;
                        if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                            v.h.z(iHashCode, mVar2, iHashCode, bVar);
                        }
                        b4.c(h5.g.a.f81807d, rVarC, mVar2);
                        b0 b0Var = b0.f22601a;
                        r rVarH = x2.h(x2.f(aVar, (f22 - f26) / (f27 - 0.0f)), 8);
                        Context context2 = context;
                        boolean zR = mVar2.r(context2);
                        Object objQ3 = mVar2.q();
                        if (zR || objQ3 == c2565a) {
                            objQ3 = new as.d(context2, p1Var, 5);
                            mVar2.K(objQ3);
                        }
                        y0.a(dVarA, "", g0.f(rVarH, (e23.l) objQ3), null, null, 0.0f, o4.e0.a.a(o4.e0.f128843b, j8), mVar2, 48, 56);
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        r rVarY = x2.y(l.C(aVar, 0.0f, j92.b.f97899b.f97917b, 0.0f, 0.0f, 13), null, 3);
                        boolean zR2 = mVar2.r(context2);
                        Object objQ4 = mVar2.q();
                        if (zR2 || objQ4 == c2565a) {
                            objQ4 = new as.d(context2, p1Var2, 6);
                            mVar2.K(objQ4);
                        }
                        r rVarF2 = g0.f(rVarY, (e23.l) objQ4);
                        d92.b.f58624b.getClass();
                        mh.c(str3, rVarF2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar2), mVar2, 0, 0, 131068);
                        mVar2.y();
                    } else {
                        mVar2.e();
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE), o0VarE, 3120, 4);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p() { // from class: bn1.b
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    c.a(f14, f15, f16, str, f17, j8, (m) obj, p0.t(i14 | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }
}

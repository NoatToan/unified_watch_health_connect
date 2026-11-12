package bn1;

import b71.o;
import c2.b0;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import e23.q;
import h4.r;
import h5.e0;
import j23.t;
import kotlin.t1;
import o13.p;
import o4.d0;
import o4.w;
import o4.z0;
import org.slf4j.Marker;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p5.v;
import w2.a0;

/* JADX INFO: loaded from: classes10.dex */
public final class k {
    public static final void a(final int i14, final int i15, final r rVar, final boolean z14, int i16, int i17, float f14, m mVar, final int i18) {
        final int i19;
        final int i24;
        final float f15;
        int i25;
        int i26;
        float f16;
        int i27;
        float f17;
        boolean z15;
        int i28;
        boolean z16;
        o0 o0VarE = mVar.E(-1372427029);
        int i29 = i18 | (o0VarE.k(i14) ? 4 : 2) | (o0VarE.k(i15) ? 32 : 16) | (o0VarE.B(rVar) ? 256 : 128) | (o0VarE.h(z14) ? 2048 : 1024) | 1662976;
        if (o0VarE.n(i29 & 1, (599187 & i29) != 599186)) {
            o0VarE.G0();
            if ((i18 & 1) == 0 || o0VarE.o0()) {
                if (i14 == 0 && i15 == 0) {
                    i25 = 630;
                } else {
                    i25 = i14 > i15 ? i14 : i15;
                }
                g6.f.a aVar = g6.f.f75994b;
                i26 = i25;
                f16 = 72;
                i27 = 360;
            } else {
                o0VarE.e();
                i27 = i16;
                i26 = i17;
                f16 = f14;
            }
            o0VarE.h0();
            x1 x1Var = n.f135158a;
            gl.c.f77766a.getClass();
            long jC = gl.c.a(o0VarE).c();
            d0.f128823b.getClass();
            long j8 = d0.f128831j;
            g6.f.a aVar2 = g6.f.f75994b;
            float f18 = 2;
            float fS0 = ((g6.c) o0VarE.A(t1.f91490h)).s0(3) / f18;
            float f19 = f18 * fS0;
            float f22 = fS0 / f19;
            w.a aVar3 = w.f129023a;
            p[] pVarArr = {new p(Float.valueOf(f22), d0.a(j8)), new p(Float.valueOf(f22), d0.a(jC))};
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
            n4.c.a aVar4 = n4.c.f123541b;
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f19)) << 32) | (((long) Float.floatToRawIntBits(f19)) & 4294967295L);
            o4.x1.f129034b.getClass();
            int i30 = o4.x1.f129035c;
            aVar3.getClass();
            z0 z0VarD = w.a.d(pVarArr, jFloatToRawIntBits, jFloatToRawIntBits2, i30);
            long jH = gl.c.a(o0VarE).h();
            final float f24 = i26 - i27;
            float fD = t.d(i14 - i27, 0.0f, f24);
            final float fD2 = t.d(i15 - i27, 0.0f, f24);
            boolean z17 = fD == fD2;
            final boolean z18 = !z17;
            final u00.a aVar5 = new u00.a(a0.s(o0VarE));
            r rVarF = x2.f(rVar, 1.0f);
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            if (objQ == m.a.f135155b) {
                objQ = new o(24);
                o0VarE.K(objQ);
            }
            r rVarC = v.c((l) objQ, rVarF, true);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC2 = h4.k.c(rVarC, o0VarE);
            h5.g.V.getClass();
            e0.a aVar6 = h5.g.a.f81805b;
            final float f25 = fD;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar6);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            b0 b0Var = b0.f22601a;
            e.a(f25 / f24, z0VarD, f16, z3.f.c(1899255991, new q() { // from class: bn1.i
                @Override // e23.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    h4.d.b bVar2;
                    h4.d.b bVar3;
                    h hVar = (h) obj;
                    m mVar2 = (m) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    hVar.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= mVar2.B(hVar) ? 4 : 2;
                    }
                    if (mVar2.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                        x1 x1Var2 = n.f135158a;
                        int i34 = (iIntValue << 9) & 7168;
                        hVar.a(0.0f, null, null, mVar2, i34 | 6, 6);
                        float f26 = f25;
                        float f27 = f24;
                        float f28 = f26 / f27;
                        int i35 = i14 * 60;
                        int i36 = u00.a.f167335c;
                        u00.a aVar7 = aVar5;
                        String strC = aVar7.c(i35);
                        float f29 = fD2;
                        if (f26 < f29) {
                            h4.d.f81522a.getClass();
                            bVar2 = h4.d.a.f81538p;
                        } else if (f26 > f29) {
                            h4.d.f81522a.getClass();
                            bVar2 = h4.d.a.f81536n;
                        } else {
                            h4.d.f81522a.getClass();
                            bVar2 = h4.d.a.f81537o;
                        }
                        hVar.b(f28, strC, bVar2, mVar2, i34);
                        if (z18) {
                            mVar2.C(-1163291703);
                            float f34 = f29 / f27;
                            String strC2 = aVar7.c(i15 * 60);
                            if (f29 < f26) {
                                h4.d.f81522a.getClass();
                                bVar3 = h4.d.a.f81538p;
                            } else {
                                h4.d.f81522a.getClass();
                                bVar3 = h4.d.a.f81536n;
                            }
                            hVar.a(f34, strC2, bVar3, mVar2, i34, 0);
                            mVar2.f();
                        } else {
                            mVar2.C(-1162890005);
                            mVar2.f();
                        }
                    } else {
                        mVar2.e();
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE), o0VarE, 3456);
            r.a aVar7 = r.S;
            c2.l.f(x2.h(x2.f(aVar7, 1.0f), 8), o0VarE);
            if (z17) {
                f17 = fD2;
                z15 = false;
                i28 = 24;
                z16 = true;
                o0VarE.C(-201808991);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-202572986);
                f17 = fD2;
                z15 = false;
                z16 = true;
                i28 = 24;
                c.a(f25, f17, f24, (f25 > fD2 ? Marker.ANY_NON_NULL_MARKER : "-").concat(aVar5.c(Math.abs(i14 - i15) * 60)), f16, gl.c.a(o0VarE).h(), o0VarE, 196992);
                f25 = f25;
                o0VarE = o0VarE;
                o0VarE.g0(false);
            }
            c2.l.f(x2.h(x2.f(aVar7, 1.0f), i28), o0VarE);
            String strQ = gl1.y.Q(o0VarE, z14 ? R.string.lbl_current_sleep_need : R.string.lbl_sleep_need);
            if (z17) {
                o0VarE.C(-201074043);
                zf.b.d(strQ, z0VarD, null, null, null, o0VarE, 0, 28);
                o0VarE.g0(z15);
            } else {
                o0VarE.C(-201515359);
                boolean z19 = f25 > f17 ? z16 : z15;
                zf.b.d(strQ, z0VarD, gl1.y.P(R.string.lbl_change_from_baseline_with_sign, new Object[]{z19 ? Marker.ANY_NON_NULL_MARKER : "-"}, o0VarE), d0.a(jH), Boolean.valueOf(z19), o0VarE, 0, 0);
                o0VarE.g0(z15);
            }
            o0VarE.g0(z16);
            f15 = f16;
            i19 = i27;
            i24 = i26;
        } else {
            o0VarE.e();
            i19 = i16;
            i24 = i17;
            f15 = f14;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p(i14, i15, rVar, z14, i19, i24, f15, i18) { // from class: bn1.j

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f19071a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ int f19072b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ r f19073c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ boolean f19074d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ int f19075e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ int f19076f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ float f19077g;

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p0.t(1);
                    k.a(this.f19071a, this.f19072b, this.f19073c, this.f19074d, this.f19075e, this.f19076f, this.f19077g, (m) obj, iT);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}

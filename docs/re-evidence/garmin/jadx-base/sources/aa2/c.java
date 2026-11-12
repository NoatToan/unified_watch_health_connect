package aa2;

import c2.b0;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import h5.e0;
import i3.i7;
import i3.mh;
import l72.f0;
import o4.m1;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import s5.x0;
import u1.a2;
import v62.e1;

/* JADX INFO: loaded from: classes7.dex */
public final class c {
    public static final void a(final h4.r rVar, final u4.d dVar, final long j8, final long j14, final float f14, float f15, e23.l lVar, p3.m mVar, final int i14) {
        final float f16;
        final e23.l lVar2;
        float f17;
        int i15;
        e23.l lVar3;
        o0 o0VarE = mVar.E(687033916);
        int i16 = i14 | (o0VarE.B(rVar) ? 4 : 2) | (o0VarE.B(dVar) ? 32 : 16) | (o0VarE.l(j8) ? 256 : 128) | (o0VarE.l(j14) ? 2048 : 1024) | (o0VarE.i(f14) ? 16384 : 8192) | 1638400;
        if (o0VarE.n(i16 & 1, (599187 & i16) != 599186)) {
            o0VarE.G0();
            int i17 = i14 & 1;
            p3.m.a aVar = p3.m.f135153a;
            if (i17 == 0 || o0VarE.o0()) {
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                f17 = j92.b.f97899b.f97918c;
                int i18 = i16 & (-458753);
                Object objQ = o0VarE.q();
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new a81.m(13);
                    o0VarE.K(objQ);
                }
                e23.l lVar4 = (e23.l) objQ;
                i15 = i18;
                lVar3 = lVar4;
            } else {
                o0VarE.e();
                f17 = f15;
                i15 = i16 & (-458753);
                lVar3 = lVar;
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            h4.r rVarE = u1.n.e(l4.k.b(rVar, k2.i.f102406a), j14, m1.f128891a);
            Object objQ2 = o0VarE.q();
            aVar.getClass();
            if (objQ2 == p3.m.a.f135155b) {
                objQ2 = new a12.a(lVar3, 2);
                o0VarE.K(objQ2);
            }
            i7.b(dVar, null, c2.l.y(x2.q(l4.k.d(rVarE, (e23.l) objQ2), f14), f17), j8, o0VarE, ((i15 >> 3) & 14) | 48 | ((i15 << 3) & 7168), 0);
            lVar2 = lVar3;
            f16 = f17;
        } else {
            o0VarE.e();
            f16 = f15;
            lVar2 = lVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p(dVar, j8, j14, f14, f16, lVar2, i14) { // from class: aa2.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ u4.d f2305b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ long f2306c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ long f2307d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ float f2308e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ float f2309f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ e23.l f2310g;

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p0.t(1);
                    c.a(this.f2304a, this.f2305b, this.f2306c, this.f2307d, this.f2308e, this.f2309f, this.f2310g, (p3.m) obj, iT);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0056  */
    /* JADX WARN: Code duplicated, block: B:41:0x01ca  */
    public static final void b(String str, e23.l<? super Integer, Unit> lVar, p3.m mVar, int i14) {
        e23.l<? super Integer, Unit> lVar2;
        str.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(1376227302);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.r(lVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            int i16 = i15 & 112;
            boolean z14 = i16 == 32;
            Object objQ = o0VarE.q();
            p3.m.a aVar = p3.m.f135153a;
            if (z14) {
                objQ = new a40.a(lVar, 1);
                o0VarE.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new a40.a(lVar, 1);
                    o0VarE.K(objQ);
                }
            }
            c.w.a(0, 1, (e23.a) objQ, o0VarE, false);
            h4.r.a aVar2 = h4.r.S;
            h4.r rVarE = u1.n.e(aVar2, tn.k.b(d92.b.f58623a, o0VarE), m1.f128891a);
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarB = a2.b(x2.d(c2.l.y(rVarE, eVar.f97920e), 1.0f), a2.a(o0VarE), true);
            c2.j jVar = c2.j.f22691a;
            bVar.getClass();
            float f14 = eVar.f97920e;
            jVar.getClass();
            c2.j.i iVarI = c2.j.i(f14);
            h4.d.f81522a.getClass();
            z zVarA = y.a(iVarI, h4.d.a.f81537o, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarB, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
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
            b4.a(o0VarE, Integer.valueOf(iHashCode), h5.g.a.f81813j);
            b4.b(h5.g.a.f81814k, o0VarE);
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            bVar.getClass();
            h4.r rVarC2 = c2.l.C(aVar2, 0.0f, eVar.f97922g, 0.0f, 0.0f, 13);
            s62.a.f157643a.getClass();
            u4.d dVarA = e1.a(t62.b.f162798a);
            long jD = am.j.d(o0VarE);
            long jA = d92.b.a(o0VarE).f().a();
            bVar.getClass();
            a(rVarC2, dVarA, jD, jA, j92.b.f97901d.f97907f, 0.0f, null, o0VarE, 0);
            h4.r rVarF = x2.f(aVar2, 1.0f);
            bVar.getClass();
            h4.r rVarY = c2.l.y(rVarF, eVar.f97918c);
            d92.b.f58624b.getClass();
            x0 x0VarB = d92.c.b(j92.f.f97930g, o0VarE);
            d6.h.f57752b.getClass();
            mh.c(str, rVarY, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB, o0VarE, i15 & 14, 0, 130044);
            o0VarE = o0VarE;
            c2.l.f(b0Var.a(aVar2, 1.0f, true), o0VarE);
            f0 f0Var = f0.f110999a;
            h4.r rVarF2 = x2.f(aVar2, 1.0f);
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_done);
            boolean z15 = i16 == 32;
            Object objQ2 = o0VarE.q();
            if (z15) {
                lVar2 = lVar;
                objQ2 = new a40.a(lVar2, 2);
                o0VarE.K(objQ2);
            } else {
                aVar.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    lVar2 = lVar;
                    objQ2 = new a40.a(lVar2, 2);
                    o0VarE.K(objQ2);
                } else {
                    lVar2 = lVar;
                }
            }
            f0Var.d(384, 9, (e23.a) objQ2, rVarF2, strQ, o0VarE, null, false);
            o0VarE.g0(true);
        } else {
            lVar2 = lVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b(str, lVar2, i14, 0);
        }
    }
}

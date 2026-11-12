package u61;

import aq.p3;
import c2.b0;
import c2.l;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import gl1.y;
import h4.k;
import h4.r;
import h5.e0;
import i3.e5;
import i3.mh;
import java.util.ArrayList;
import l72.r1;
import o4.m1;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class h {
    public static final void a(final int i14, final int i15, final int i16, final double d14, m mVar, final int i17) {
        o0 o0VarE = mVar.E(-1676909925);
        int i18 = (o0VarE.k(i14) ? 4 : 2) | i17 | (o0VarE.k(i15) ? 32 : 16) | (o0VarE.k(i16) ? 256 : 128) | (o0VarE.m(d14) ? 2048 : 1024);
        if (o0VarE.n(i18 & 1, (i18 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            r1.b(y.Q(o0VarE, i14), z3.f.c(-1210984458, new p() { // from class: u61.f
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    m mVar2 = (m) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                        x1 x1Var2 = n.f135158a;
                        r.a aVar = r.S;
                        r rVarE = u1.n.e(aVar, p6.b.a(d92.b.f58623a, mVar2), m1.f128891a);
                        float f14 = 16;
                        g6.f.a aVar2 = g6.f.f75994b;
                        r rVarC = l.C(rVarE, f14, f14, f14, 0.0f, 8);
                        c2.j.f22691a.getClass();
                        c2.j.k kVar = c2.j.f22694d;
                        h4.d.f81522a.getClass();
                        z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar2, 0);
                        int iHashCode = Long.hashCode(mVar2.getU());
                        i2 i2VarX = mVar2.x();
                        r rVarC2 = k.c(rVarC, mVar2);
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
                        if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                            v.h.z(iHashCode, mVar2, iHashCode, bVar);
                        }
                        b4.c(h5.g.a.f81807d, rVarC2, mVar2);
                        b0 b0Var = b0.f22601a;
                        float f15 = 8;
                        r rVarC3 = l.C(aVar, 0.0f, 0.0f, 0.0f, f15, 7);
                        String strQ = y.Q(mVar2, i15);
                        d92.b.f58624b.getClass();
                        mh.c(strQ, rVarC3, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar2), mVar2, 48, 0, 131068);
                        p3[] p3VarArrValues = p3.values();
                        ArrayList arrayList = new ArrayList(p3VarArrValues.length);
                        int length = p3VarArrValues.length;
                        for (int iD = 0; iD < length; iD = e5.d(p3VarArrValues[iD].f12159b, iD, arrayList, 1)) {
                        }
                        i53.f fVarJ = i53.a.j(h0.G0(arrayList));
                        float f16 = (float) d14;
                        g02.m1.b(R.color.gcm_surface_1, fVarJ, f16, null, null, 0.0f, 0.0f, 0.0f, 0.0f, String.valueOf(f16), null, mVar2, 3072, 0, 1520);
                        r rVarC4 = l.C(r.S, 0.0f, f15, 0.0f, f14, 5);
                        String strQ2 = y.Q(mVar2, i16);
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        mh.c(strQ2, rVarC4, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, mVar2), mVar2, 48, 0, 131068);
                        mVar2.y();
                        x1 x1Var3 = n.f135158a;
                    } else {
                        mVar2.e();
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE), o0VarE, 48, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p(i14, i15, i16, d14, i17) { // from class: u61.g

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f168881a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ int f168882b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ int f168883c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ double f168884d;

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p0.t(1);
                    h.a(this.f168881a, this.f168882b, this.f168883c, this.f168884d, (m) obj, iT);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}

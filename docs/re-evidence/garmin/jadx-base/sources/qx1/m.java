package qx1;

import c2.b0;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import h4.r;
import h5.e0;
import i3.i7;
import i3.mh;
import l72.v2;
import o4.m1;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class m {
    /* JADX WARN: Code duplicated, block: B:71:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:73:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:74:0x01af  */
    /* JADX WARN: Code duplicated, block: B:79:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:82:0x0209  */
    /* JADX WARN: Code duplicated, block: B:83:0x0213  */
    /* JADX WARN: Code duplicated, block: B:86:0x0255  */
    /* JADX WARN: Code duplicated, block: B:87:0x027d  */
    /* JADX WARN: Code duplicated, block: B:89:0x029f  */
    public static final void a(final String str, final boolean z14, r rVar, boolean z15, String str2, boolean z16, boolean z17, final e23.l<? super Boolean, Unit> lVar, p3.m mVar, final int i14, final int i15) {
        boolean z18;
        int i16;
        String str3;
        int i17;
        boolean z19;
        int i18;
        final boolean z24;
        final boolean z25;
        final String str4;
        final r rVar2;
        final boolean z26;
        long jE;
        boolean z27;
        h5.g.a.f fVar;
        z zVarA;
        boolean z28;
        int iHashCode;
        i2 i2VarA0;
        r rVarC;
        j92.f fVar2;
        str.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(58913273);
        p3.c<?> cVar = o0VarE.f135177b;
        int i19 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.h(z14) ? 32 : 16);
        int i24 = i19 | 384;
        int i25 = i15 & 8;
        if (i25 != 0) {
            i16 = i19 | 3456;
            z18 = z15;
        } else {
            z18 = z15;
            i16 = i24 | (o0VarE.h(z18) ? 2048 : 1024);
        }
        int i26 = i15 & 16;
        if (i26 != 0) {
            i17 = i16 | 24576;
            str3 = str2;
        } else {
            str3 = str2;
            i17 = i16 | (o0VarE.B(str3) ? 16384 : 8192);
        }
        int i27 = 196608 | i17;
        int i28 = i15 & 64;
        if (i28 != 0) {
            i18 = i17 | 1769472;
            z19 = z17;
        } else {
            z19 = z17;
            i18 = i27 | (o0VarE.h(z19) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        }
        int i29 = i18 | (o0VarE.r(lVar) ? 8388608 : 4194304);
        if (o0VarE.n(i29 & 1, (4793491 & i29) != 4793490)) {
            r.a aVar = r.S;
            if (i25 != 0) {
                z18 = true;
            }
            if (i26 != 0) {
                str3 = null;
            }
            if (i28 != 0) {
                z19 = false;
            }
            x1 x1Var = p3.n.f135158a;
            r rVarA = v2.a(v2.a(aVar, z19, new k(lVar, z18, z14, 0), o0VarE, ((i29 >> 15) & 112) | 6), !z19, new k(z14, z18, lVar), o0VarE, 0);
            if (z14) {
                o0VarE.C(781112289);
                jE = com.nimbusds.jose.shaded.gson.internal.a.b(d92.b.f58623a, o0VarE, false);
            } else {
                o0VarE.C(781113473);
                d92.b.f58623a.getClass();
                jE = d92.b.a(o0VarE).c().e();
                o0VarE.g0(false);
            }
            r rVarA2 = v2.a(u1.n.e(rVarA, jE, m1.f128891a), !z18, new qk0.a(8), o0VarE, 0);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            r rVarY = c2.l.y(rVarA2, eVar.f97920e);
            h4.d.f81522a.getClass();
            h4.g.b bVar2 = h4.d.a.f81534l;
            c2.j jVar = c2.j.f22691a;
            bVar.getClass();
            s2 s2VarF = hb.a.f(jVar, eVar.f97920e, bVar2, o0VarE, 48);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC2 = h4.k.c(rVarY, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, s2VarF, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA1, o0VarE);
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (o0VarE.T) {
                z27 = z18;
            } else {
                z27 = z18;
                if (!s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC2, o0VarE);
                r rVarA3 = u2.f22900a.a(aVar, 1.0f, true);
                zVarA = y.a(c2.j.f22694d, h4.d.a.f81536n, o0VarE, 0);
                z28 = z19;
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarA3, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar2, zVarA, o0VarE);
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
                }
                b4.c(fVar, rVarC, o0VarE);
                b0 b0Var = b0.f22601a;
                fVar2 = d92.b.f58624b;
                fVar2.getClass();
                mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, o0VarE), o0VarE, i29 & 14, 0, 131070);
                o0VarE = o0VarE;
                if (str3 == null) {
                    o0VarE.C(-148659732);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-148659731);
                    fVar2.getClass();
                    mh.c(str3, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0VarE), o0VarE, (i29 >> 12) & 14, 0, 131070);
                    o0VarE = o0VarE;
                    Unit unit = Unit.INSTANCE;
                    o0VarE.g0(false);
                }
                o0VarE.g0(true);
                if (z14) {
                    o0VarE.C(492594415);
                    bVar.getClass();
                    i7.a(n5.c.a(R.drawable.ic_chackmark, o0VarE, 0), null, x2.q(aVar, j92.b.f97901d.f97904c), hb.a.s(o0VarE), o0VarE, 48, 0);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(492849018);
                    bVar.getClass();
                    c2.q.a(x2.q(aVar, j92.b.f97901d.f97904c), o0VarE, 0);
                    o0VarE.g0(false);
                }
                o0VarE.g0(true);
                z24 = z27;
                z25 = z28;
                rVar2 = aVar;
                str4 = str3;
                z26 = true;
            }
            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar3);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC2, o0VarE);
            r rVarA4 = u2.f22900a.a(aVar, 1.0f, true);
            zVarA = y.a(c2.j.f22694d, h4.d.a.f81536n, o0VarE, 0);
            z28 = z19;
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarA4, o0VarE);
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, zVarA, o0VarE);
            b4.c(c1623g, i2VarA0, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            b4.c(fVar, rVarC, o0VarE);
            b0 b0Var2 = b0.f22601a;
            fVar2 = d92.b.f58624b;
            fVar2.getClass();
            mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, o0VarE), o0VarE, i29 & 14, 0, 131070);
            o0VarE = o0VarE;
            if (str3 == null) {
                o0VarE.C(-148659732);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-148659731);
                fVar2.getClass();
                mh.c(str3, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0VarE), o0VarE, (i29 >> 12) & 14, 0, 131070);
                o0VarE = o0VarE;
                Unit unit2 = Unit.INSTANCE;
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
            if (z14) {
                o0VarE.C(492594415);
                bVar.getClass();
                i7.a(n5.c.a(R.drawable.ic_chackmark, o0VarE, 0), null, x2.q(aVar, j92.b.f97901d.f97904c), hb.a.s(o0VarE), o0VarE, 48, 0);
                o0VarE.g0(false);
            } else {
                o0VarE.C(492849018);
                bVar.getClass();
                c2.q.a(x2.q(aVar, j92.b.f97901d.f97904c), o0VarE, 0);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
            z24 = z27;
            z25 = z28;
            rVar2 = aVar;
            str4 = str3;
            z26 = true;
        } else {
            o0VarE.e();
            z24 = z18;
            z25 = z19;
            str4 = str3;
            rVar2 = rVar;
            z26 = z16;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p(str, z14, rVar2, z24, str4, z26, z25, lVar, i14, i15) { // from class: qx1.l

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ String f148435a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ boolean f148436b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ r f148437c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ boolean f148438d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ String f148439e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ boolean f148440f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ boolean f148441g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public final /* synthetic */ e23.l f148442h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public final /* synthetic */ int f148443i;

                {
                    this.f148443i = i15;
                }

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p0.t(1);
                    m.a(this.f148435a, this.f148436b, this.f148437c, this.f148438d, this.f148439e, this.f148440f, this.f148441g, this.f148442h, (p3.m) obj, iT, this.f148443i);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}

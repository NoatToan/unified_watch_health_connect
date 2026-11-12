package dt1;

import c2.b0;
import c2.j;
import c2.q;
import c2.u;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.library.mapsdkadapter.i;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import e23.l;
import e23.r;
import f5.z0;
import h4.k;
import h5.e0;
import i3.h7;
import o4.m1;
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
import r1.c0;
import r1.u0;

/* JADX INFO: loaded from: classes10.dex */
public final class f {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f61132a;

        static {
            int[] iArr = new int[i.d.values().length];
            try {
                iArr[i.d.GOOGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f61132a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:66:0x010d  */
    /* JADX WARN: Code duplicated, block: B:86:0x0162  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(pt1.d dVar, boolean z14, boolean z15, je2.b bVar, l lVar, r rVar, l lVar2, m mVar, int i14) {
        int i15;
        l lVar3;
        r rVar2;
        l lVar4;
        dVar.getClass();
        lVar.getClass();
        rVar.getClass();
        lVar2.getClass();
        o0 o0VarE = mVar.E(-2109459857);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(dVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.h(z14) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.h(z15) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(bVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            lVar3 = lVar;
            i15 |= o0VarE.r(lVar3) ? 16384 : 8192;
        } else {
            lVar3 = lVar;
        }
        if ((196608 & i14) == 0) {
            rVar2 = rVar;
            i15 |= o0VarE.r(rVar2) ? 131072 : 65536;
        } else {
            rVar2 = rVar;
        }
        if ((1572864 & i14) == 0) {
            lVar4 = lVar2;
            i15 |= o0VarE.r(lVar4) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        } else {
            lVar4 = lVar2;
        }
        int i16 = i15;
        if (o0VarE.n(i16 & 1, (599187 & i16) != 599186)) {
            x1 x1Var = n.f135158a;
            ke2.b bVar2 = dVar.f140825a;
            i53.c<le2.d> cVar = dVar.f140831g;
            i53.c<le2.c> cVar2 = dVar.f140832h;
            boolean z16 = dVar.f140833i;
            boolean z17 = dVar.f140834j;
            ie2.l lVar5 = new ie2.l(dVar.f140830f, false, null, 0.0f, null, null, null, Boolean.FALSE, null, null, null, null, 3966, null);
            boolean zB = o0VarE.B(bVar2) | o0VarE.B(cVar) | o0VarE.B(cVar2) | o0VarE.h(z16);
            Object objQ = o0VarE.q();
            m.a aVar = m.f135153a;
            if (zB) {
                objQ = new le2.b(bVar2, cVar, cVar2, new an1.i(z16, 15));
                o0VarE.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new le2.b(bVar2, cVar, cVar2, new an1.i(z16, 15));
                    o0VarE.K(objQ);
                }
            }
            le2.b bVar3 = (le2.b) objQ;
            h4.r rVarD = x2.d(h4.r.S, 1.0f);
            boolean zH = ((i16 & 14) == 4) | o0VarE.h(z16) | ((i16 & 7168) == 2048 || o0VarE.r(bVar)) | ((i16 & 57344) == 16384);
            Object objQ2 = o0VarE.q();
            if (zH) {
                d dVar2 = new d(dVar, z16, bVar, lVar3, 0);
                o0VarE.K(dVar2);
                objQ2 = dVar2;
            } else {
                aVar.getClass();
                if (objQ2 == m.a.f135155b) {
                    d dVar3 = new d(dVar, z16, bVar, lVar3, 0);
                    o0VarE.K(dVar3);
                    objQ2 = dVar3;
                }
            }
            int i17 = i16 << 6;
            bVar.a(rVarD, lVar5, bVar3, z14, z15, z17, (l) objQ2, rVar2, lVar4, o0VarE, (ie2.l.f93135m << 3) | 6 | (i17 & 7168) | (i17 & 57344) | (29360128 & i17) | (i17 & 234881024) | 1073741824 | ((i16 << 18) & 1879048192), 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c82.c(dVar, z14, z15, bVar, lVar, rVar, lVar2, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0127  */
    /* JADX WARN: Code duplicated, block: B:63:0x012e  */
    /* JADX WARN: Code duplicated, block: B:64:0x0132  */
    /* JADX WARN: Code duplicated, block: B:69:0x014d  */
    /* JADX WARN: Code duplicated, block: B:72:0x018b  */
    /* JADX WARN: Code duplicated, block: B:74:0x0192  */
    /* JADX WARN: Code duplicated, block: B:75:0x0196  */
    /* JADX WARN: Code duplicated, block: B:80:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:83:0x0228  */
    /* JADX WARN: Code duplicated, block: B:84:0x022a  */
    /* JADX WARN: Code duplicated, block: B:86:0x0258  */
    /* JADX WARN: Code duplicated, block: B:88:0x025e  */
    public static final void b(h4.r rVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3, float f14, m mVar, int i14) {
        int i15;
        int i16;
        h5.g.a.f fVar;
        b0 b0Var;
        h4.r.a aVar4;
        j92.b bVar;
        float f15;
        z0 z0VarD;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        m1.a aVar5;
        z zVarA;
        int iHashCode2;
        i2 i2VarA1;
        h4.r rVarC2;
        boolean z14;
        e23.a<Unit> aVar6 = aVar3;
        float f16 = f14;
        rVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar6.getClass();
        o0 o0VarE = mVar.E(-1672761682);
        p3.c<?> cVar = o0VarE.f135177b;
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(aVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(aVar2) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(aVar6) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.i(f16) ? 16384 : 8192;
        }
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = n.f135158a;
            h4.d.f81522a.getClass();
            h4.g.a aVar7 = h4.d.a.f81537o;
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            z zVarA2 = y.a(kVar, aVar7, o0VarE, 48);
            int iHashCode3 = Long.hashCode(o0VarE.U);
            i2 i2VarA2 = o0VarE.a0();
            h4.r rVarC3 = k.c(rVar, o0VarE);
            h5.g.V.getClass();
            e0.a aVar8 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar8);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA2, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA2, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T) {
                i16 = i15;
            } else {
                i16 = i15;
                if (!s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC3, o0VarE);
                b0Var = b0.f22601a;
                aVar4 = h4.r.S;
                d92.b.f58623a.getClass();
                bVar = d92.b.f58625c;
                bVar.getClass();
                j92.d dVar = j92.b.f97900c;
                float f17 = dVar.f97911c;
                f15 = dVar.f97911c;
                h4.r rVarB = l4.k.b(aVar4, k2.i.a(f17));
                z0VarD = q.d(h4.d.a.f81524b, false);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = k.c(rVarB, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar8);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, z0VarD, o0VarE);
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                }
                b4.c(fVar, rVarC, o0VarE);
                u uVar = u.f22885a;
                bVar.getClass();
                bVar.getClass();
                h4.r rVarB2 = l4.k.b(aVar4, k2.i.c(f15, f15, 0.0f, 0.0f, 12));
                long jA = n5.a.a(o0VarE, R.color.secondary_action);
                aVar5 = m1.f128891a;
                h4.r rVarE = u1.n.e(rVarB2, jA, aVar5);
                zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
                iHashCode2 = Long.hashCode(o0VarE.U);
                i2VarA1 = o0VarE.a0();
                rVarC2 = k.c(rVarE, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar8);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, zVarA, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
                }
                b4.c(fVar, rVarC2, o0VarE);
                h4.r rVarB3 = b0Var.b(u1.n.e(aVar4, n5.a.a(o0VarE, R.color.gray_white_static), aVar5), aVar7);
                dt1.a.f61111a.getClass();
                h7.a(aVar2, rVarB3, false, null, null, dt1.a.f61112b, o0VarE, ((i16 >> 6) & 14) | 1572864, 60);
                g6.f.a aVar9 = g6.f.f75994b;
                c2.l.f(u1.n.e(x2.h(aVar4, 1), d92.b.a(o0VarE).f().b(), aVar5), o0VarE);
                h7.a(aVar, b0Var.b(u1.n.e(aVar4, n5.a.a(o0VarE, R.color.gray_white_static), aVar5), aVar7), false, null, null, dt1.a.f61113c, o0VarE, ((i16 >> 3) & 14) | 1572864, 60);
                o0VarE.g0(true);
                o0VarE.g0(true);
                if (f14 == 0.0f) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                aVar6 = aVar3;
                f16 = f14;
                c0.c(b0Var, !z14, null, u0.d(null, 3), u0.e(null, 3), null, z3.f.c(-2095488864, new b(aVar6, f16, b0Var, 0), o0VarE), o0VarE, 1600518, 18);
                o0VarE = o0VarE;
                o0VarE.g0(true);
            }
            v.h.A(iHashCode3, o0VarE, iHashCode3, bVar2);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC3, o0VarE);
            b0Var = b0.f22601a;
            aVar4 = h4.r.S;
            d92.b.f58623a.getClass();
            bVar = d92.b.f58625c;
            bVar.getClass();
            j92.d dVar2 = j92.b.f97900c;
            float f18 = dVar2.f97911c;
            f15 = dVar2.f97911c;
            h4.r rVarB4 = l4.k.b(aVar4, k2.i.a(f18));
            z0VarD = q.d(h4.d.a.f81524b, false);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = k.c(rVarB4, o0VarE);
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar8);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, z0VarD, o0VarE);
            b4.c(c1623g, i2VarA0, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(fVar, rVarC, o0VarE);
            u uVar2 = u.f22885a;
            bVar.getClass();
            bVar.getClass();
            h4.r rVarB5 = l4.k.b(aVar4, k2.i.c(f15, f15, 0.0f, 0.0f, 12));
            long jA2 = n5.a.a(o0VarE, R.color.secondary_action);
            aVar5 = m1.f128891a;
            h4.r rVarE2 = u1.n.e(rVarB5, jA2, aVar5);
            zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            iHashCode2 = Long.hashCode(o0VarE.U);
            i2VarA1 = o0VarE.a0();
            rVarC2 = k.c(rVarE2, o0VarE);
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar8);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, zVarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            } else {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            }
            b4.c(fVar, rVarC2, o0VarE);
            h4.r rVarB6 = b0Var.b(u1.n.e(aVar4, n5.a.a(o0VarE, R.color.gray_white_static), aVar5), aVar7);
            dt1.a.f61111a.getClass();
            h7.a(aVar2, rVarB6, false, null, null, dt1.a.f61112b, o0VarE, ((i16 >> 6) & 14) | 1572864, 60);
            g6.f.a aVar10 = g6.f.f75994b;
            c2.l.f(u1.n.e(x2.h(aVar4, 1), d92.b.a(o0VarE).f().b(), aVar5), o0VarE);
            h7.a(aVar, b0Var.b(u1.n.e(aVar4, n5.a.a(o0VarE, R.color.gray_white_static), aVar5), aVar7), false, null, null, dt1.a.f61113c, o0VarE, ((i16 >> 3) & 14) | 1572864, 60);
            o0VarE.g0(true);
            o0VarE.g0(true);
            if (f14 == 0.0f) {
                z14 = true;
            } else {
                z14 = false;
            }
            aVar6 = aVar3;
            f16 = f14;
            c0.c(b0Var, !z14, null, u0.d(null, 3), u0.e(null, 3), null, z3.f.c(-2095488864, new b(aVar6, f16, b0Var, 0), o0VarE), o0VarE, 1600518, 18);
            o0VarE = o0VarE;
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c(rVar, aVar, aVar2, aVar6, f16, i14);
        }
    }
}

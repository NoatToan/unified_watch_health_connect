package et1;

import android.app.Activity;
import android.view.Window;
import c2.s2;
import c2.u2;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.common.base.Ascii;
import i3.fe;
import i3.p7;
import i3.pc;
import kotlin.w2;
import kotlin.x2;
import p005kotlin.Unit;
import p3.b4;
import p3.y3;

/* JADX INFO: loaded from: classes10.dex */
public final class w1 {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f65931a;

        static {
            int[] iArr = new int[kt1.a.values().length];
            try {
                iArr[kt1.a.SINGLE_TRAIL_PREVIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[kt1.a.MULTIPLE_TRAIL_PREVIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[kt1.a.NEARBY_TRAILS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[kt1.a.ALL_NEARBY_TRAILS_FILTERED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[kt1.a.BOUNDING_BOX_TOO_LARGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[kt1.a.MAP_TYPE_SELECTION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[kt1.a.LOADING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f65931a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:63:0x0152  */
    /* JADX WARN: Code duplicated, block: B:65:0x0193  */
    /* JADX WARN: Code duplicated, block: B:67:0x019a  */
    /* JADX WARN: Code duplicated, block: B:68:0x019e  */
    /* JADX WARN: Code duplicated, block: B:73:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:75:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:77:0x01ed  */
    public static final void a(pt1.d dVar, je2.b bVar, boolean z14, boolean z15, e23.l lVar, e23.a aVar, e23.a aVar2, e23.a aVar3, e23.r rVar, e23.l lVar2, p3.m mVar, int i14) {
        h5.g.a.e eVar;
        h5.g.a.f fVar;
        c2.u uVar;
        int i15;
        h5.g.a.e eVar2;
        boolean z16;
        c2.z zVarA;
        int iHashCode;
        p3.i2 i2VarA0;
        h4.r rVarC;
        p3.o0 o0VarE = mVar.E(128790401);
        p3.c<?> cVar = o0VarE.f135177b;
        int i16 = (o0VarE.r(lVar2) ? 536870912 : 268435456) | i14 | (o0VarE.B(dVar) ? 4 : 2) | (o0VarE.r(bVar) ? 32 : 16) | (o0VarE.h(z14) ? 256 : 128) | (o0VarE.h(z15) ? 2048 : 1024) | (o0VarE.r(lVar) ? 16384 : 8192) | (o0VarE.r(aVar) ? 131072 : 65536) | (o0VarE.r(aVar2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.r(aVar3) ? 8388608 : 4194304) | (o0VarE.r(rVar) ? 67108864 : 33554432);
        if (o0VarE.n(i16 & 1, (306783379 & i16) != 306783378)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r.a aVar4 = h4.r.S;
            h4.d.f81522a.getClass();
            f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(aVar4, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar5 = h5.g.a.f81805b;
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar3 = h5.g.a.f81810g;
            b4.c(eVar3, z0VarD, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA1, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T) {
                eVar = eVar3;
            } else {
                eVar = eVar3;
                if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC2, o0VarE);
                uVar = c2.u.f22885a;
                int i17 = i16 >> 3;
                int i18 = (i16 & 14) | (i17 & 112) | (i17 & 896) | 4096 | ((i16 << 6) & 7168) | (57344 & i16);
                i15 = i16 >> 9;
                eVar2 = eVar;
                dt1.f.a(dVar, z14, z15, bVar, lVar, rVar, lVar2, o0VarE, i18 | (i15 & 458752) | (i15 & 3670016));
                if (z14) {
                    z16 = true;
                    o0VarE.C(2009708571);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(2009081038);
                    h4.r rVarC3 = uVar.c(aVar4, h4.d.a.f81526d);
                    d92.b.f58623a.getClass();
                    j92.b bVar3 = d92.b.f58625c;
                    bVar3.getClass();
                    j92.e eVar4 = j92.b.f97899b;
                    float f14 = eVar4.f97920e;
                    bVar3.getClass();
                    h4.r rVarZ = c2.l.z(rVarC3, eVar4.f97918c, f14);
                    c2.j.f22691a.getClass();
                    zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, o0VarE, 0);
                    iHashCode = Long.hashCode(o0VarE.U);
                    i2VarA0 = o0VarE.a0();
                    rVarC = h4.k.c(rVarZ, o0VarE);
                    if (cVar != null) {
                        p3.p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar5);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(eVar2, zVarA, o0VarE);
                    b4.c(c1623g, i2VarA0, o0VarE);
                    if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                    }
                    b4.c(fVar, rVarC, o0VarE);
                    c2.b0 b0Var = c2.b0.f22601a;
                    dt1.f.b(aVar4, aVar2, aVar, aVar3, dVar.f140837m, o0VarE, ((i16 >> 15) & 112) | 6 | (i15 & 896) | ((i16 >> 12) & 7168));
                    o0VarE = o0VarE;
                    z16 = true;
                    o0VarE.g0(true);
                    o0VarE.g0(false);
                }
                o0VarE.g0(z16);
            }
            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC2, o0VarE);
            uVar = c2.u.f22885a;
            int i19 = i16 >> 3;
            int i110 = (i16 & 14) | (i19 & 112) | (i19 & 896) | 4096 | ((i16 << 6) & 7168) | (57344 & i16);
            i15 = i16 >> 9;
            eVar2 = eVar;
            dt1.f.a(dVar, z14, z15, bVar, lVar, rVar, lVar2, o0VarE, i110 | (i15 & 458752) | (i15 & 3670016));
            if (z14) {
                o0VarE.C(2009081038);
                h4.r rVarC4 = uVar.c(aVar4, h4.d.a.f81526d);
                d92.b.f58623a.getClass();
                j92.b bVar4 = d92.b.f58625c;
                bVar4.getClass();
                j92.e eVar5 = j92.b.f97899b;
                float f15 = eVar5.f97920e;
                bVar4.getClass();
                h4.r rVarZ2 = c2.l.z(rVarC4, eVar5.f97918c, f15);
                c2.j.f22691a.getClass();
                zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, o0VarE, 0);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarZ2, o0VarE);
                if (cVar != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar5);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar2, zVarA, o0VarE);
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                } else {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                }
                b4.c(fVar, rVarC, o0VarE);
                c2.b0 b0Var2 = c2.b0.f22601a;
                dt1.f.b(aVar4, aVar2, aVar, aVar3, dVar.f140837m, o0VarE, ((i16 >> 15) & 112) | 6 | (i15 & 896) | ((i16 >> 12) & 7168));
                o0VarE = o0VarE;
                z16 = true;
                o0VarE.g0(true);
                o0VarE.g0(false);
            } else {
                z16 = true;
                o0VarE.C(2009708571);
                o0VarE.g0(false);
            }
            o0VarE.g0(z16);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new m1(dVar, bVar, z14, z15, lVar, aVar, aVar2, aVar3, rVar, lVar2, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0146  */
    public static final void b(String str, boolean z14, String str2, e23.p<? super String, ? super Boolean, Unit> pVar, e23.l<? super m4.g0, Unit> lVar, e23.a<Unit> aVar, p3.m mVar, int i14) {
        str.getClass();
        str2.getClass();
        pVar.getClass();
        lVar.getClass();
        aVar.getClass();
        p3.o0 o0VarE = mVar.E(-511372147);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.B(str2) ? 256 : 128) | (o0VarE.r(pVar) ? 2048 : 1024) | (o0VarE.r(lVar) ? 16384 : 8192) | (o0VarE.r(aVar) ? 131072 : 65536);
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r.a aVar2 = h4.r.S;
            h4.r rVarE = u1.n.e(aVar2, tn.k.b(d92.b.f58623a, o0VarE), o4.m1.f128891a);
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            bVar.getClass();
            float f15 = eVar.f97918c;
            bVar.getClass();
            h4.r rVarC = c2.l.C(rVarE, f14, 0.0f, f15, eVar.f97920e, 2);
            c2.j jVar = c2.j.f22691a;
            bVar.getClass();
            float f16 = eVar.f97918c;
            jVar.getClass();
            c2.j.i iVarI = c2.j.i(f16);
            h4.d.f81522a.getClass();
            s2 s2VarA = c2.q2.a(iVarI, h4.d.a.f81534l, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarC, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            u2 u2Var = u2.f22900a;
            b82.t0 t0Var = b82.t0.f16792a;
            h4.r rVarB = m4.e.b(u2Var.a(aVar2, 1.0f, true), lVar);
            long jA = n5.a.a(o0VarE, R.color.default_text_inverted);
            boolean z15 = (i15 & 7168) == 2048;
            Object objQ = o0VarE.q();
            if (z15) {
                objQ = new a3.d(pVar, 12);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new a3.d(pVar, 12);
                    o0VarE.K(objQ);
                }
            }
            t0Var.g(rVarB, str, str2, null, null, jA, (e23.p) objQ, o0VarE, ((i15 << 3) & 112) | (i15 & 896), 24);
            y3 y3Var = p7.f89282d;
            g6.f.f75994b.getClass();
            p3.v.a(y3Var.c(g6.f.a(g6.f.f75996d)), z3.f.c(-1787835927, new a42.e(z14, aVar), o0VarE), o0VarE, 56);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ck0.h(str, z14, str2, pVar, lVar, aVar, i14, 6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:153:0x0239  */
    /* JADX WARN: Code duplicated, block: B:172:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:174:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:177:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:179:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:188:0x0320  */
    /* JADX WARN: Code duplicated, block: B:194:0x032c  */
    /* JADX WARN: Code duplicated, block: B:197:0x0347  */
    /* JADX WARN: Code duplicated, block: B:206:0x037f  */
    /* JADX WARN: Code duplicated, block: B:210:0x0394  */
    /* JADX WARN: Code duplicated, block: B:219:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:222:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:223:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:226:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:227:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:233:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:236:0x0485  */
    /* JADX WARN: Code duplicated, block: B:239:0x048a  */
    /* JADX WARN: Code duplicated, block: B:243:0x04be A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:244:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:250:0x0522 A[ORIG_RETURN, RETURN] */
    public static final void c(pt1.c cVar, final fe feVar, final e23.a aVar, final e23.l lVar, final e23.a aVar2, final e23.a aVar3, final e23.l lVar2, final e23.l lVar3, final e23.p pVar, final e23.l lVar4, final e23.a aVar4, final e23.a aVar5, final e23.l lVar5, final e23.a aVar6, final e23.l lVar6, final e23.l lVar7, final e23.l lVar8, final e23.a aVar7, final e23.r rVar, final e23.l lVar9, final e23.l lVar10, final e23.l lVar11, final e23.l lVar12, p3.m mVar, final int i14) {
        int i15;
        p3.o0 o0Var;
        e23.p<? super p3.m, ? super Integer, Unit> pVar2;
        p3.p2 p2Var;
        final int i16;
        com.garmin.android.library.mapsdkadapter.i.d dVar;
        final je2.b<?> bVarE;
        Object objQ;
        p3.m.a.C2565a c2565a;
        o53.b0 b0Var;
        boolean z14;
        Object objQ2;
        Object objQ3;
        final p3.o1 o1Var;
        final pt1.a aVar8;
        final i3.a1 a1VarD;
        boolean z15;
        boolean zB;
        Object objQ4;
        e23.l lVar13;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        Object objQ5;
        o53.b0 b0Var2;
        e23.l lVar14;
        final o53.b0 b0Var3;
        e23.l lVar15;
        boolean zR;
        Object objQ6;
        p3.m.a.C2565a c2565a2;
        boolean zB2;
        Object objQ7;
        p3.p2 p2VarI0;
        final pt1.c cVar2 = cVar;
        cVar2.getClass();
        aVar.getClass();
        lVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        lVar2.getClass();
        lVar3.getClass();
        pVar.getClass();
        lVar4.getClass();
        aVar4.getClass();
        aVar5.getClass();
        lVar5.getClass();
        aVar6.getClass();
        lVar6.getClass();
        lVar7.getClass();
        lVar8.getClass();
        aVar7.getClass();
        rVar.getClass();
        lVar9.getClass();
        lVar10.getClass();
        lVar11.getClass();
        lVar12.getClass();
        p3.o0 o0VarE = mVar.E(1173379449);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(cVar2) : o0VarE.r(cVar2) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(feVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(aVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(lVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(aVar2) ? 16384 : 8192;
        }
        int i17 = i14 & 196608;
        char c14 = Ascii.MIN;
        if (i17 == 0) {
            i15 |= o0VarE.r(aVar3) ? 131072 : 65536;
        }
        int i18 = i14 & 1572864;
        char c15 = Ascii.MIN;
        if (i18 == 0) {
            i15 |= o0VarE.r(lVar2) ? 1048576 : 524288;
        }
        int i19 = i14 & 12582912;
        char c16 = Ascii.MIN;
        if (i19 == 0) {
            i15 |= o0VarE.r(lVar3) ? 8388608 : 4194304;
        }
        int i24 = i14 & 100663296;
        char c17 = Ascii.MIN;
        if (i24 == 0) {
            i15 |= o0VarE.r(pVar) ? 67108864 : 33554432;
        }
        int i25 = i14 & C.ENCODING_PCM_32BIT;
        char c18 = Ascii.MIN;
        if (i25 == 0) {
            i15 |= o0VarE.r(lVar4) ? 536870912 : 268435456;
        }
        int i26 = (o0VarE.r(aVar4) ? (char) 4 : (char) 2) | (o0VarE.r(aVar5) ? ' ' : (char) 16) | (o0VarE.r(lVar5) ? 256 : 128) | (o0VarE.r(aVar6) ? 2048 : 1024) | (o0VarE.r(lVar6) ? (char) 16384 : (char) 8192);
        if (o0VarE.r(lVar7)) {
            c14 = 0;
        }
        int i27 = i26 | c14;
        if (o0VarE.r(lVar8)) {
            c15 = 0;
        }
        int i28 = i27 | c15;
        if (o0VarE.r(aVar7)) {
            c16 = 0;
        }
        int i29 = i28 | c16;
        if (o0VarE.r(rVar)) {
            c17 = Ascii.MIN;
        }
        int i30 = i29 | c17;
        if (o0VarE.r(lVar9)) {
            c18 = 0;
        }
        if (o0VarE.n(i15 & 1, ((i15 & 306783379) == 306783378 && ((i30 | c18) & 306783379) == 306783378 && ((((o0VarE.r(lVar10) ? (char) 4 : (char) 2) | (o0VarE.r(lVar11) ? ' ' : (char) 16)) | (o0VarE.r(lVar12) ? (char) 256 : (char) 128)) & 147) == 146) ? false : true)) {
            p3.x1 x1Var = p3.n.f135158a;
            Activity activity = (Activity) o0VarE.A(c.n.f22332a);
            Window window = activity != null ? activity.getWindow() : null;
            Object[] objArr = new Object[0];
            int i34 = i15 & 14;
            boolean z24 = i34 == 4 || ((i15 & 8) != 0 && o0VarE.r(cVar2));
            Object objQ8 = o0VarE.q();
            p3.m.a aVar9 = p3.m.f135153a;
            if (z24) {
                i16 = 0;
                objQ8 = new e23.a() { // from class: et1.d1
                    @Override // e23.a
                    public final Object invoke() {
                        switch (i16) {
                            case 0:
                                return p3.p0.n(cVar2.f140819d.f140835k);
                            default:
                                return p3.p0.n(cVar2.f140821f.f140867a);
                        }
                    }
                };
                o0VarE.K(objQ8);
            } else {
                aVar9.getClass();
                if (objQ8 == p3.m.a.f135155b) {
                    i16 = 0;
                    objQ8 = new e23.a() { // from class: et1.d1
                        @Override // e23.a
                        public final Object invoke() {
                            switch (i16) {
                                case 0:
                                    return p3.p0.n(cVar2.f140819d.f140835k);
                                default:
                                    return p3.p0.n(cVar2.f140821f.f140867a);
                            }
                        }
                    };
                    o0VarE.K(objQ8);
                } else {
                    i16 = 0;
                }
            }
            p3.p1 p1Var = (p3.p1) d4.a.e(objArr, (e23.a) objQ8, o0VarE, i16);
            ie2.n.f93149a.getClass();
            com.garmin.android.library.mapsdkadapter.k kVarA = ie2.n.a();
            pt1.d dVar2 = cVar2.f140819d;
            Window window2 = window;
            com.garmin.android.library.mapsdkadapter.i.d dVar3 = dVar2.f140835k;
            ke2.b bVar = dVar2.f140825a;
            boolean zB3 = (i34 == 4 || ((i15 & 8) != 0 && o0VarE.r(cVar2))) | o0VarE.B(p1Var);
            Object objQ9 = o0VarE.q();
            if (!zB3) {
                aVar9.getClass();
                dVar = dVar3;
                if (objQ9 == p3.m.a.f135155b) {
                }
                bVarE = ((com.garmin.android.library.mapsdkadapter.r) kVarA).e(dVar, bVar, (e23.a) objQ9, o0VarE, ke2.b.f104550d << 3);
                if (bVarE == null) {
                    p2VarI0 = o0VarE.i0();
                    if (p2VarI0 != null) {
                        return;
                    }
                    final int i35 = 0;
                    pVar2 = new e23.p() { // from class: et1.e1
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            p3.m mVar2 = (p3.m) obj;
                            switch (i35) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    w1.c(cVar2, feVar, aVar, lVar, aVar2, aVar3, lVar2, lVar3, pVar, lVar4, aVar4, aVar5, lVar5, aVar6, lVar6, lVar7, lVar8, aVar7, rVar, lVar9, lVar10, lVar11, lVar12, mVar2, p3.p0.t(i14 | 1));
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    w1.c(cVar2, feVar, aVar, lVar, aVar2, aVar3, lVar2, lVar3, pVar, lVar4, aVar4, aVar5, lVar5, aVar6, lVar6, lVar7, lVar8, aVar7, rVar, lVar9, lVar10, lVar11, lVar12, mVar2, p3.p0.t(i14 | 1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    p2Var = p2VarI0;
                } else {
                    objQ = o0VarE.q();
                    aVar9.getClass();
                    c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = p3.l0.j(t13.h.f161748a, o0VarE);
                        o0VarE.K(objQ);
                    }
                    b0Var = (o53.b0) objQ;
                    final w2 w2VarE = x2.e(o0VarE);
                    final m4.q qVar = (m4.q) o0VarE.A(kotlin.t1.f91491i);
                    Object[] objArr2 = {cVar2.f140821f.f140867a};
                    if (i34 != 4 || ((i15 & 8) != 0 && o0VarE.r(cVar2))) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objQ2 = o0VarE.q();
                    if (z14 || objQ2 == c2565a) {
                        final int i36 = 1;
                        objQ2 = new e23.a() { // from class: et1.d1
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i36) {
                                    case 0:
                                        return p3.p0.n(cVar2.f140819d.f140835k);
                                    default:
                                        return p3.p0.n(cVar2.f140821f.f140867a);
                                }
                            }
                        };
                        o0VarE.K(objQ2);
                    }
                    p3.p1 p1Var2 = (p3.p1) d4.a.e(objArr2, (e23.a) objQ2, o0VarE, 0);
                    Object[] objArr3 = new Object[0];
                    objQ3 = o0VarE.q();
                    if (objQ3 == c2565a) {
                        objQ3 = new e51.c(23);
                        o0VarE.K(objQ3);
                    }
                    o1Var = (p3.o1) d4.a.e(objArr3, (e23.a) objQ3, o0VarE, 48);
                    aVar8 = cVar2.f140820e;
                    a1VarD = i3.z0.d(i3.z0.e(pc.Hidden, o0VarE, 390, 2), feVar, o0VarE, i15 & 112, 0);
                    if (i34 != 4 || ((i15 & 8) != 0 && o0VarE.r(cVar2))) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    zB = z15 | o0VarE.B(a1VarD) | o0VarE.B(aVar8);
                    objQ4 = o0VarE.q();
                    if (zB || objQ4 == c2565a) {
                        objQ4 = new t1(cVar2, a1VarD, aVar8, null);
                        o0VarE.K(objQ4);
                    }
                    lVar13 = (e23.l) objQ4;
                    if (i34 != 4 || ((i15 & 8) != 0 && o0VarE.r(cVar2))) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if ((i15 & 7168) == 2048) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    boolean zR2 = z16 | z17 | o0VarE.r(b0Var) | o0VarE.r(lVar13);
                    if ((234881024 & i15) == 67108864) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = zR2 | z18;
                    objQ5 = o0VarE.q();
                    if (!z19 || objQ5 == c2565a) {
                        et.p pVar3 = new et.p(cVar2, lVar, b0Var, pVar, lVar13, 2);
                        b0Var2 = b0Var;
                        lVar14 = lVar13;
                        o0VarE.K(pVar3);
                        objQ5 = pVar3;
                    } else {
                        b0Var2 = b0Var;
                        lVar14 = lVar13;
                    }
                    final e23.p pVar4 = (e23.p) objQ5;
                    boolean z25 = cVar2.f140816a;
                    z3.e eVarC = z3.f.c(799096958, new b21.l0(aVar5, cVar2, aVar6, lVar6, p1Var2, pVar4, aVar7, 10), o0VarE);
                    cVar2 = cVar;
                    b0Var3 = b0Var2;
                    lVar15 = lVar14;
                    z02.d.a(z25, eVarC, null, null, null, z3.f.c(-522692990, new e23.p() { // from class: et1.f1
                        /* JADX WARN: Code duplicated, block: B:14:0x006c  */
                        /* JADX WARN: Code duplicated, block: B:48:0x022c  */
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            o4.r1 r1VarB;
                            int i37;
                            p3.m mVar2 = (p3.m) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                p3.x1 x1Var2 = p3.n.f135158a;
                                final pt1.c cVar3 = cVar2;
                                boolean zR3 = mVar2.r(cVar3);
                                final i3.a1 a1Var = a1VarD;
                                boolean zB4 = zR3 | mVar2.B(a1Var);
                                final o53.b0 b0Var4 = b0Var3;
                                boolean zR4 = zB4 | mVar2.r(b0Var4);
                                m4.q qVar2 = qVar;
                                boolean zR5 = zR4 | mVar2.r(qVar2);
                                e23.a aVar10 = aVar5;
                                boolean zB5 = zR5 | mVar2.B(aVar10);
                                final e23.l lVar16 = lVar;
                                boolean zB6 = zB5 | mVar2.B(lVar16);
                                final je2.b bVar2 = bVarE;
                                boolean zR6 = zB6 | mVar2.r(bVar2);
                                e23.p pVar5 = pVar4;
                                boolean zB7 = zR6 | mVar2.B(pVar5);
                                Object objQ10 = mVar2.q();
                                p3.m.a aVar11 = p3.m.f135153a;
                                if (zB7) {
                                    av0.d dVar4 = new av0.d(cVar3, a1Var, b0Var4, qVar2, aVar10, pVar5, lVar16, bVar2);
                                    mVar2.K(dVar4);
                                    objQ10 = dVar4;
                                } else {
                                    aVar11.getClass();
                                    if (objQ10 == p3.m.a.f135155b) {
                                        av0.d dVar5 = new av0.d(cVar3, a1Var, b0Var4, qVar2, aVar10, pVar5, lVar16, bVar2);
                                        mVar2.K(dVar5);
                                        objQ10 = dVar5;
                                    }
                                }
                                c.w.a(0, 1, (e23.a) objQ10, mVar2, false);
                                h4.r.a aVar12 = h4.r.S;
                                h4.d.f81522a.getClass();
                                f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                                int iHashCode = Long.hashCode(mVar2.getU());
                                p3.i2 i2VarX = mVar2.x();
                                h4.r rVarC = h4.k.c(aVar12, mVar2);
                                h5.g.V.getClass();
                                h5.e0.a aVar13 = h5.g.a.f81805b;
                                if (mVar2.F() == null) {
                                    p3.p0.l();
                                    throw null;
                                }
                                mVar2.z();
                                if (mVar2.getT()) {
                                    mVar2.M(aVar13);
                                } else {
                                    mVar2.c();
                                }
                                b4.c(h5.g.a.f81810g, z0VarD, mVar2);
                                b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                                h5.g.a.b bVar3 = h5.g.a.f81813j;
                                if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                                    v.h.z(iHashCode, mVar2, iHashCode, bVar3);
                                }
                                b4.c(h5.g.a.f81807d, rVarC, mVar2);
                                c2.u uVar = c2.u.f22885a;
                                float f75992b = ((g6.c) mVar2.A(kotlin.t1.f91490h)).getF75992b();
                                final e2.i0 i0VarA = e2.k0.a(0, 0, 3, mVar2);
                                final float f14 = 75 * f75992b;
                                g6.f.a aVar14 = g6.f.f75994b;
                                final a5.a aVar15 = w2VarE;
                                h4.r rVarA = a5.f.a(aVar12, aVar15, null);
                                final pt1.a aVar16 = aVar8;
                                kt1.a aVar17 = aVar16.f140798a;
                                kt1.a aVar18 = kt1.a.NEARBY_TRAILS;
                                boolean z26 = aVar17 == aVar18 && !(i0VarA.f62442i.a() && i0VarA.e());
                                if (((pc) a1Var.f87409a.f88996e.f109326h.getF182175a()) == pc.Expanded && aVar16.f140798a == aVar18) {
                                    r1VarB = o4.m1.f128891a;
                                } else {
                                    d92.b.f58623a.getClass();
                                    d92.b.f58625c.getClass();
                                    float f15 = j92.b.f97900c.f97912d;
                                    float f16 = 0;
                                    r1VarB = k2.i.b(f15, f15, f16, f16);
                                }
                                long jE = vb.h.e(d92.b.f58623a, mVar2);
                                final p3.o1 o1Var2 = o1Var;
                                final e23.l lVar17 = lVar5;
                                final e23.l lVar18 = lVar8;
                                final e23.l lVar19 = lVar7;
                                final e23.a aVar19 = aVar3;
                                final e23.l lVar20 = lVar2;
                                final e23.l lVar21 = lVar10;
                                final e23.l lVar22 = lVar11;
                                i3.z0.a(z3.f.c(1336417815, new e23.q() { // from class: et1.h1
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // e23.q
                                    public final Object invoke(Object obj3, Object obj4, Object obj5) throws Throwable {
                                        p3.m mVar3;
                                        c2.a0 a0Var = (c2.a0) obj3;
                                        p3.m mVar4 = (p3.m) obj4;
                                        int iIntValue2 = ((Integer) obj5).intValue();
                                        a0Var.getClass();
                                        if ((iIntValue2 & 6) == 0) {
                                            iIntValue2 |= mVar4.B(a0Var) ? 4 : 2;
                                        }
                                        if (mVar4.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                            p3.x1 x1Var3 = p3.n.f135158a;
                                            pt1.a aVar20 = aVar16;
                                            int i38 = w1.a.f65931a[aVar20.f140798a.ordinal()];
                                            a5.a aVar21 = aVar15;
                                            e23.l lVar23 = lVar17;
                                            e23.l lVar24 = lVar19;
                                            float f17 = f14;
                                            e23.l lVar25 = lVar16;
                                            je2.b bVar4 = bVar2;
                                            p3.m.a aVar22 = p3.m.f135153a;
                                            switch (i38) {
                                                case 1:
                                                    mVar4.C(-1123524570);
                                                    c2.v.a(null, null, false, z3.f.c(1603370249, new j1(aVar20, lVar25, bVar4, lVar23, lVar24, 0), mVar4), mVar4, 3072, 7);
                                                    mVar4.f();
                                                    break;
                                                case 2:
                                                    mVar4.C(-1122191043);
                                                    c2.v.a(null, null, false, z3.f.c(43639232, new ak0.j(aVar21, aVar20, lVar23, lVar25, bVar4, 17), mVar4), mVar4, 3072, 7);
                                                    mVar4.f();
                                                    break;
                                                case 3:
                                                    mVar4.C(-1121296662);
                                                    Object objQ11 = mVar4.q();
                                                    aVar22.getClass();
                                                    p3.m.a.C2565a c2565a3 = p3.m.a.f135155b;
                                                    if (objQ11 == c2565a3) {
                                                        objQ11 = p3.p0.n(Boolean.FALSE);
                                                        mVar4.K(objQ11);
                                                    }
                                                    p3.p1 p1Var3 = (p3.p1) objQ11;
                                                    i3.a1 a1Var2 = a1Var;
                                                    Boolean boolValueOf = Boolean.valueOf(a1Var2.f87409a.f88996e.f());
                                                    boolean zB8 = mVar4.B(a1Var2);
                                                    Object objQ12 = mVar4.q();
                                                    if (zB8 || objQ12 == c2565a3) {
                                                        objQ12 = new n1(a1Var2, p1Var3, null);
                                                        mVar4.K(objQ12);
                                                    }
                                                    p3.l0.e((e23.p) objQ12, boolValueOf, mVar4);
                                                    if (((Boolean) p1Var3.getF182175a()).booleanValue()) {
                                                        mVar4.C(-1120665099);
                                                        h4.r rVarA2 = a5.f.a(h4.r.S, aVar21, null);
                                                        p3.o1 o1Var3 = o1Var2;
                                                        boolean zB9 = mVar4.B(o1Var3) | mVar4.B(lVar23);
                                                        Object objQ13 = mVar4.q();
                                                        if (zB9 || objQ13 == c2565a3) {
                                                            objQ13 = new e52.b(6, o1Var3, lVar23);
                                                            mVar4.K(objQ13);
                                                        }
                                                        e23.l lVar26 = (e23.l) objQ13;
                                                        o53.b0 b0Var5 = b0Var4;
                                                        boolean zR7 = mVar4.r(b0Var5) | mVar4.B(a1Var2);
                                                        Object objQ14 = mVar4.q();
                                                        if (zR7 || objQ14 == c2565a3) {
                                                            objQ14 = new k1(b0Var5, a1Var2, 0);
                                                            mVar4.K(objQ14);
                                                        }
                                                        zs1.s.a(rVarA2, aVar20, a1Var2, i0VarA, lVar26, lVar18, lVar24, (e23.a) objQ14, mVar4, 0);
                                                        p3.m mVar5 = mVar4;
                                                        mVar5.f();
                                                        mVar3 = mVar5;
                                                    } else {
                                                        mVar4.C(-1119273602);
                                                        c2.q.a(u1.n.e(c2.x2.h(c2.x2.f(h4.r.S, 1.0f), f17), p6.b.a(d92.b.f58623a, mVar4), o4.m1.f128891a), mVar4, 0);
                                                        mVar4.f();
                                                        mVar3 = mVar4;
                                                    }
                                                    mVar3.f();
                                                    break;
                                                case 4:
                                                    mVar4.C(-1118810927);
                                                    zs1.c.a(c2.x2.j(h4.r.S, f17, 0.0f, 2), false, true, mVar4, 384, 2);
                                                    mVar4.f();
                                                    break;
                                                case 5:
                                                    mVar4.C(-1118488403);
                                                    zs1.c.a(c2.x2.j(h4.r.S, f17, 0.0f, 2), true, false, mVar4, 48, 4);
                                                    mVar4.f();
                                                    break;
                                                case 6:
                                                    mVar4.C(-1118125610);
                                                    c2.v.a(null, null, false, z3.f.c(-1717030972, new ak0.j(aVar19, (Object) cVar3, (o13.h) lVar20, (o13.h) lVar21, (Object) lVar22, 18), mVar4), mVar4, 3072, 7);
                                                    mVar4.f();
                                                    break;
                                                case 7:
                                                    mVar4.C(-1116540859);
                                                    Object objQ15 = mVar4.q();
                                                    aVar22.getClass();
                                                    Object obj6 = objQ15;
                                                    if (objQ15 == p3.m.a.f135155b) {
                                                        s1.t0 t0Var = new s1.t0(Boolean.FALSE);
                                                        t0Var.f(Boolean.TRUE);
                                                        mVar4.K(t0Var);
                                                        obj6 = t0Var;
                                                    }
                                                    r1.v1 v1VarD = r1.u0.d(s1.l.d(300, 0, s1.e0.f155563d, 2), 2);
                                                    r1.w1.f149304a.getClass();
                                                    r1.c0.b(a0Var, (s1.t0) obj6, null, v1VarD, r1.w1.f149305b, null, z3.f.c(1219781251, new a3.a1(f17, 2), mVar4), mVar4, (iIntValue2 & 14) | 1572864, 18);
                                                    mVar4.f();
                                                    break;
                                                default:
                                                    mVar4.C(102560000);
                                                    zs1.c.a(c2.x2.j(h4.r.S, f17, 0.0f, 2), false, false, mVar4, 0, 6);
                                                    mVar4.f();
                                                    break;
                                            }
                                        } else {
                                            mVar4.e();
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, mVar2), rVarA, a1Var, f14, 0.0f, r1VarB, jE, 0L, 0.0f, 0.0f, null, z26, z3.f.c(865979135, new v(feVar, 2), mVar2), 0L, 0L, z3.f.c(386820717, new a11.l(cVar3, bVar2, lVar3, aVar2, lVar12, b0Var4, lVar9, rVar, aVar, aVar4), mVar2), mVar2, 6, 1575942, 54160);
                                if (cVar3.f140821f.f140869c.isEmpty()) {
                                    mVar2.C(2132360122);
                                    mVar2.f();
                                } else {
                                    mVar2.C(2132001669);
                                    i53.c<pt1.i> cVar4 = cVar3.f140821f.f140869c;
                                    h4.r rVarC2 = uVar.c(aVar12, h4.d.a.f81525c);
                                    boolean zR7 = mVar2.r(qVar2);
                                    e23.l lVar23 = lVar4;
                                    boolean zB8 = zR7 | mVar2.B(lVar23);
                                    Object objQ11 = mVar2.q();
                                    if (zB8) {
                                        i37 = 0;
                                        objQ11 = new i1(qVar2, lVar23, 0);
                                        mVar2.K(objQ11);
                                    } else {
                                        aVar11.getClass();
                                        if (objQ11 == p3.m.a.f135155b) {
                                            i37 = 0;
                                            objQ11 = new i1(qVar2, lVar23, 0);
                                            mVar2.K(objQ11);
                                        } else {
                                            i37 = 0;
                                        }
                                    }
                                    ys1.e.a(i37, (e23.l) objQ11, rVarC2, cVar4, mVar2);
                                    mVar2.f();
                                }
                                mVar2.y();
                            } else {
                                mVar2.e();
                            }
                            return Unit.INSTANCE;
                        }
                    }, o0VarE), o0VarE, 196656, 28);
                    o0Var = o0VarE;
                    Unit unit = Unit.INSTANCE;
                    zR = o0Var.r(window2);
                    objQ6 = o0Var.q();
                    if (zR) {
                        c2565a2 = c2565a;
                    } else {
                        c2565a2 = c2565a;
                        if (objQ6 == c2565a2) {
                        }
                        p3.l0.a(unit, (e23.l) objQ6, o0Var);
                        kt1.a aVar10 = aVar8.f140798a;
                        Boolean boolValueOf = Boolean.valueOf(cVar2.f140817b);
                        zB2 = o0Var.B(o1Var) | o0Var.r(b0Var3) | o0Var.B(a1VarD) | o0Var.r(lVar15);
                        objQ7 = o0Var.q();
                        if (zB2 || objQ7 == c2565a2) {
                            objQ7 = new s1(o1Var, b0Var3, lVar15, a1VarD, null);
                            o0Var.K(objQ7);
                        }
                        p3.l0.f(aVar10, boolValueOf, (e23.p) objQ7, o0Var);
                        p3.x1 x1Var2 = p3.n.f135158a;
                    }
                    objQ6 = new ds0.g(window2, 12);
                    o0Var.K(objQ6);
                    p3.l0.a(unit, (e23.l) objQ6, o0Var);
                    kt1.a aVar11 = aVar8.f140798a;
                    Boolean boolValueOf2 = Boolean.valueOf(cVar2.f140817b);
                    zB2 = o0Var.B(o1Var) | o0Var.r(b0Var3) | o0Var.B(a1VarD) | o0Var.r(lVar15);
                    objQ7 = o0Var.q();
                    if (zB2) {
                        objQ7 = new s1(o1Var, b0Var3, lVar15, a1VarD, null);
                        o0Var.K(objQ7);
                    } else {
                        objQ7 = new s1(o1Var, b0Var3, lVar15, a1VarD, null);
                        o0Var.K(objQ7);
                    }
                    p3.l0.f(aVar11, boolValueOf2, (e23.p) objQ7, o0Var);
                    p3.x1 x1Var3 = p3.n.f135158a;
                }
                p2Var.f135219d = pVar2;
            }
            dVar = dVar3;
            objQ9 = new dl0.g(18, cVar2, p1Var);
            o0VarE.K(objQ9);
            bVarE = ((com.garmin.android.library.mapsdkadapter.r) kVarA).e(dVar, bVar, (e23.a) objQ9, o0VarE, ke2.b.f104550d << 3);
            if (bVarE == null) {
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    return;
                }
                final int i37 = 0;
                pVar2 = new e23.p() { // from class: et1.e1
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        p3.m mVar2 = (p3.m) obj;
                        switch (i37) {
                            case 0:
                                ((Integer) obj2).getClass();
                                w1.c(cVar2, feVar, aVar, lVar, aVar2, aVar3, lVar2, lVar3, pVar, lVar4, aVar4, aVar5, lVar5, aVar6, lVar6, lVar7, lVar8, aVar7, rVar, lVar9, lVar10, lVar11, lVar12, mVar2, p3.p0.t(i14 | 1));
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                w1.c(cVar2, feVar, aVar, lVar, aVar2, aVar3, lVar2, lVar3, pVar, lVar4, aVar4, aVar5, lVar5, aVar6, lVar6, lVar7, lVar8, aVar7, rVar, lVar9, lVar10, lVar11, lVar12, mVar2, p3.p0.t(i14 | 1));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                p2Var = p2VarI0;
            } else {
                objQ = o0VarE.q();
                aVar9.getClass();
                c2565a = p3.m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = p3.l0.j(t13.h.f161748a, o0VarE);
                    o0VarE.K(objQ);
                }
                b0Var = (o53.b0) objQ;
                final w2 w2VarE2 = x2.e(o0VarE);
                final m4.q qVar2 = (m4.q) o0VarE.A(kotlin.t1.f91491i);
                Object[] objArr4 = {cVar2.f140821f.f140867a};
                if (i34 != 4) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                objQ2 = o0VarE.q();
                if (z14) {
                    final int i38 = 1;
                    objQ2 = new e23.a() { // from class: et1.d1
                        @Override // e23.a
                        public final Object invoke() {
                            switch (i38) {
                                case 0:
                                    return p3.p0.n(cVar2.f140819d.f140835k);
                                default:
                                    return p3.p0.n(cVar2.f140821f.f140867a);
                            }
                        }
                    };
                    o0VarE.K(objQ2);
                } else {
                    final int i39 = 1;
                    objQ2 = new e23.a() { // from class: et1.d1
                        @Override // e23.a
                        public final Object invoke() {
                            switch (i39) {
                                case 0:
                                    return p3.p0.n(cVar2.f140819d.f140835k);
                                default:
                                    return p3.p0.n(cVar2.f140821f.f140867a);
                            }
                        }
                    };
                    o0VarE.K(objQ2);
                }
                p3.p1 p1Var3 = (p3.p1) d4.a.e(objArr4, (e23.a) objQ2, o0VarE, 0);
                Object[] objArr5 = new Object[0];
                objQ3 = o0VarE.q();
                if (objQ3 == c2565a) {
                    objQ3 = new e51.c(23);
                    o0VarE.K(objQ3);
                }
                o1Var = (p3.o1) d4.a.e(objArr5, (e23.a) objQ3, o0VarE, 48);
                aVar8 = cVar2.f140820e;
                a1VarD = i3.z0.d(i3.z0.e(pc.Hidden, o0VarE, 390, 2), feVar, o0VarE, i15 & 112, 0);
                if (i34 != 4) {
                    z15 = true;
                } else {
                    z15 = true;
                }
                zB = z15 | o0VarE.B(a1VarD) | o0VarE.B(aVar8);
                objQ4 = o0VarE.q();
                if (zB) {
                    objQ4 = new t1(cVar2, a1VarD, aVar8, null);
                    o0VarE.K(objQ4);
                } else {
                    objQ4 = new t1(cVar2, a1VarD, aVar8, null);
                    o0VarE.K(objQ4);
                }
                lVar13 = (e23.l) objQ4;
                if (i34 != 4) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                if ((i15 & 7168) == 2048) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                boolean zR3 = z16 | z17 | o0VarE.r(b0Var) | o0VarE.r(lVar13);
                if ((234881024 & i15) == 67108864) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = zR3 | z18;
                objQ5 = o0VarE.q();
                if (z19) {
                    et.p pVar5 = new et.p(cVar2, lVar, b0Var, pVar, lVar13, 2);
                    b0Var2 = b0Var;
                    lVar14 = lVar13;
                    o0VarE.K(pVar5);
                    objQ5 = pVar5;
                } else {
                    et.p pVar6 = new et.p(cVar2, lVar, b0Var, pVar, lVar13, 2);
                    b0Var2 = b0Var;
                    lVar14 = lVar13;
                    o0VarE.K(pVar6);
                    objQ5 = pVar6;
                }
                final e23.p pVar7 = (e23.p) objQ5;
                boolean z26 = cVar2.f140816a;
                z3.e eVarC2 = z3.f.c(799096958, new b21.l0(aVar5, cVar2, aVar6, lVar6, p1Var3, pVar7, aVar7, 10), o0VarE);
                cVar2 = cVar;
                b0Var3 = b0Var2;
                lVar15 = lVar14;
                z02.d.a(z26, eVarC2, null, null, null, z3.f.c(-522692990, new e23.p() { // from class: et1.f1
                    /* JADX WARN: Code duplicated, block: B:14:0x006c  */
                    /* JADX WARN: Code duplicated, block: B:48:0x022c  */
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        o4.r1 r1VarB;
                        int i310;
                        p3.m mVar2 = (p3.m) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                            p3.x1 x1Var4 = p3.n.f135158a;
                            final pt1.c cVar3 = cVar2;
                            boolean zR4 = mVar2.r(cVar3);
                            final i3.a1 a1Var = a1VarD;
                            boolean zB4 = zR4 | mVar2.B(a1Var);
                            final o53.b0 b0Var4 = b0Var3;
                            boolean zR5 = zB4 | mVar2.r(b0Var4);
                            m4.q qVar3 = qVar2;
                            boolean zR6 = zR5 | mVar2.r(qVar3);
                            e23.a aVar12 = aVar5;
                            boolean zB5 = zR6 | mVar2.B(aVar12);
                            final e23.l lVar16 = lVar;
                            boolean zB6 = zB5 | mVar2.B(lVar16);
                            final je2.b bVar2 = bVarE;
                            boolean zR7 = zB6 | mVar2.r(bVar2);
                            e23.p pVar8 = pVar7;
                            boolean zB7 = zR7 | mVar2.B(pVar8);
                            Object objQ10 = mVar2.q();
                            p3.m.a aVar13 = p3.m.f135153a;
                            if (zB7) {
                                av0.d dVar5 = new av0.d(cVar3, a1Var, b0Var4, qVar3, aVar12, pVar8, lVar16, bVar2);
                                mVar2.K(dVar5);
                                objQ10 = dVar5;
                            } else {
                                aVar13.getClass();
                                if (objQ10 == p3.m.a.f135155b) {
                                    av0.d dVar6 = new av0.d(cVar3, a1Var, b0Var4, qVar3, aVar12, pVar8, lVar16, bVar2);
                                    mVar2.K(dVar6);
                                    objQ10 = dVar6;
                                }
                            }
                            c.w.a(0, 1, (e23.a) objQ10, mVar2, false);
                            h4.r.a aVar14 = h4.r.S;
                            h4.d.f81522a.getClass();
                            f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                            int iHashCode = Long.hashCode(mVar2.getU());
                            p3.i2 i2VarX = mVar2.x();
                            h4.r rVarC = h4.k.c(aVar14, mVar2);
                            h5.g.V.getClass();
                            h5.e0.a aVar15 = h5.g.a.f81805b;
                            if (mVar2.F() == null) {
                                p3.p0.l();
                                throw null;
                            }
                            mVar2.z();
                            if (mVar2.getT()) {
                                mVar2.M(aVar15);
                            } else {
                                mVar2.c();
                            }
                            b4.c(h5.g.a.f81810g, z0VarD, mVar2);
                            b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                            h5.g.a.b bVar3 = h5.g.a.f81813j;
                            if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                                v.h.z(iHashCode, mVar2, iHashCode, bVar3);
                            }
                            b4.c(h5.g.a.f81807d, rVarC, mVar2);
                            c2.u uVar = c2.u.f22885a;
                            float f75992b = ((g6.c) mVar2.A(kotlin.t1.f91490h)).getF75992b();
                            final e2.i0 i0VarA = e2.k0.a(0, 0, 3, mVar2);
                            final float f14 = 75 * f75992b;
                            g6.f.a aVar16 = g6.f.f75994b;
                            final a5.a aVar17 = w2VarE2;
                            h4.r rVarA = a5.f.a(aVar14, aVar17, null);
                            final pt1.a aVar18 = aVar8;
                            kt1.a aVar19 = aVar18.f140798a;
                            kt1.a aVar110 = kt1.a.NEARBY_TRAILS;
                            boolean z27 = aVar19 == aVar110 && !(i0VarA.f62442i.a() && i0VarA.e());
                            if (((pc) a1Var.f87409a.f88996e.f109326h.getF182175a()) == pc.Expanded && aVar18.f140798a == aVar110) {
                                r1VarB = o4.m1.f128891a;
                            } else {
                                d92.b.f58623a.getClass();
                                d92.b.f58625c.getClass();
                                float f15 = j92.b.f97900c.f97912d;
                                float f16 = 0;
                                r1VarB = k2.i.b(f15, f15, f16, f16);
                            }
                            long jE = vb.h.e(d92.b.f58623a, mVar2);
                            final p3.o1 o1Var2 = o1Var;
                            final e23.l lVar17 = lVar5;
                            final e23.l lVar18 = lVar8;
                            final e23.l lVar19 = lVar7;
                            final e23.a aVar111 = aVar3;
                            final e23.l lVar20 = lVar2;
                            final e23.l lVar21 = lVar10;
                            final e23.l lVar22 = lVar11;
                            i3.z0.a(z3.f.c(1336417815, new e23.q() { // from class: et1.h1
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // e23.q
                                public final Object invoke(Object obj3, Object obj4, Object obj5) throws Throwable {
                                    p3.m mVar3;
                                    c2.a0 a0Var = (c2.a0) obj3;
                                    p3.m mVar4 = (p3.m) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    a0Var.getClass();
                                    if ((iIntValue2 & 6) == 0) {
                                        iIntValue2 |= mVar4.B(a0Var) ? 4 : 2;
                                    }
                                    if (mVar4.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                        p3.x1 x1Var5 = p3.n.f135158a;
                                        pt1.a aVar20 = aVar18;
                                        int i311 = w1.a.f65931a[aVar20.f140798a.ordinal()];
                                        a5.a aVar21 = aVar17;
                                        e23.l lVar23 = lVar17;
                                        e23.l lVar24 = lVar19;
                                        float f17 = f14;
                                        e23.l lVar25 = lVar16;
                                        je2.b bVar4 = bVar2;
                                        p3.m.a aVar22 = p3.m.f135153a;
                                        switch (i311) {
                                            case 1:
                                                mVar4.C(-1123524570);
                                                c2.v.a(null, null, false, z3.f.c(1603370249, new j1(aVar20, lVar25, bVar4, lVar23, lVar24, 0), mVar4), mVar4, 3072, 7);
                                                mVar4.f();
                                                break;
                                            case 2:
                                                mVar4.C(-1122191043);
                                                c2.v.a(null, null, false, z3.f.c(43639232, new ak0.j(aVar21, aVar20, lVar23, lVar25, bVar4, 17), mVar4), mVar4, 3072, 7);
                                                mVar4.f();
                                                break;
                                            case 3:
                                                mVar4.C(-1121296662);
                                                Object objQ11 = mVar4.q();
                                                aVar22.getClass();
                                                p3.m.a.C2565a c2565a3 = p3.m.a.f135155b;
                                                if (objQ11 == c2565a3) {
                                                    objQ11 = p3.p0.n(Boolean.FALSE);
                                                    mVar4.K(objQ11);
                                                }
                                                p3.p1 p1Var4 = (p3.p1) objQ11;
                                                i3.a1 a1Var2 = a1Var;
                                                Boolean boolValueOf3 = Boolean.valueOf(a1Var2.f87409a.f88996e.f());
                                                boolean zB8 = mVar4.B(a1Var2);
                                                Object objQ12 = mVar4.q();
                                                if (zB8 || objQ12 == c2565a3) {
                                                    objQ12 = new n1(a1Var2, p1Var4, null);
                                                    mVar4.K(objQ12);
                                                }
                                                p3.l0.e((e23.p) objQ12, boolValueOf3, mVar4);
                                                if (((Boolean) p1Var4.getF182175a()).booleanValue()) {
                                                    mVar4.C(-1120665099);
                                                    h4.r rVarA2 = a5.f.a(h4.r.S, aVar21, null);
                                                    p3.o1 o1Var3 = o1Var2;
                                                    boolean zB9 = mVar4.B(o1Var3) | mVar4.B(lVar23);
                                                    Object objQ13 = mVar4.q();
                                                    if (zB9 || objQ13 == c2565a3) {
                                                        objQ13 = new e52.b(6, o1Var3, lVar23);
                                                        mVar4.K(objQ13);
                                                    }
                                                    e23.l lVar26 = (e23.l) objQ13;
                                                    o53.b0 b0Var5 = b0Var4;
                                                    boolean zR8 = mVar4.r(b0Var5) | mVar4.B(a1Var2);
                                                    Object objQ14 = mVar4.q();
                                                    if (zR8 || objQ14 == c2565a3) {
                                                        objQ14 = new k1(b0Var5, a1Var2, 0);
                                                        mVar4.K(objQ14);
                                                    }
                                                    zs1.s.a(rVarA2, aVar20, a1Var2, i0VarA, lVar26, lVar18, lVar24, (e23.a) objQ14, mVar4, 0);
                                                    p3.m mVar5 = mVar4;
                                                    mVar5.f();
                                                    mVar3 = mVar5;
                                                } else {
                                                    mVar4.C(-1119273602);
                                                    c2.q.a(u1.n.e(c2.x2.h(c2.x2.f(h4.r.S, 1.0f), f17), p6.b.a(d92.b.f58623a, mVar4), o4.m1.f128891a), mVar4, 0);
                                                    mVar4.f();
                                                    mVar3 = mVar4;
                                                }
                                                mVar3.f();
                                                break;
                                            case 4:
                                                mVar4.C(-1118810927);
                                                zs1.c.a(c2.x2.j(h4.r.S, f17, 0.0f, 2), false, true, mVar4, 384, 2);
                                                mVar4.f();
                                                break;
                                            case 5:
                                                mVar4.C(-1118488403);
                                                zs1.c.a(c2.x2.j(h4.r.S, f17, 0.0f, 2), true, false, mVar4, 48, 4);
                                                mVar4.f();
                                                break;
                                            case 6:
                                                mVar4.C(-1118125610);
                                                c2.v.a(null, null, false, z3.f.c(-1717030972, new ak0.j(aVar111, (Object) cVar3, (o13.h) lVar20, (o13.h) lVar21, (Object) lVar22, 18), mVar4), mVar4, 3072, 7);
                                                mVar4.f();
                                                break;
                                            case 7:
                                                mVar4.C(-1116540859);
                                                Object objQ15 = mVar4.q();
                                                aVar22.getClass();
                                                Object obj6 = objQ15;
                                                if (objQ15 == p3.m.a.f135155b) {
                                                    s1.t0 t0Var = new s1.t0(Boolean.FALSE);
                                                    t0Var.f(Boolean.TRUE);
                                                    mVar4.K(t0Var);
                                                    obj6 = t0Var;
                                                }
                                                r1.v1 v1VarD = r1.u0.d(s1.l.d(300, 0, s1.e0.f155563d, 2), 2);
                                                r1.w1.f149304a.getClass();
                                                r1.c0.b(a0Var, (s1.t0) obj6, null, v1VarD, r1.w1.f149305b, null, z3.f.c(1219781251, new a3.a1(f17, 2), mVar4), mVar4, (iIntValue2 & 14) | 1572864, 18);
                                                mVar4.f();
                                                break;
                                            default:
                                                mVar4.C(102560000);
                                                zs1.c.a(c2.x2.j(h4.r.S, f17, 0.0f, 2), false, false, mVar4, 0, 6);
                                                mVar4.f();
                                                break;
                                        }
                                    } else {
                                        mVar4.e();
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, mVar2), rVarA, a1Var, f14, 0.0f, r1VarB, jE, 0L, 0.0f, 0.0f, null, z27, z3.f.c(865979135, new v(feVar, 2), mVar2), 0L, 0L, z3.f.c(386820717, new a11.l(cVar3, bVar2, lVar3, aVar2, lVar12, b0Var4, lVar9, rVar, aVar, aVar4), mVar2), mVar2, 6, 1575942, 54160);
                            if (cVar3.f140821f.f140869c.isEmpty()) {
                                mVar2.C(2132360122);
                                mVar2.f();
                            } else {
                                mVar2.C(2132001669);
                                i53.c<pt1.i> cVar4 = cVar3.f140821f.f140869c;
                                h4.r rVarC2 = uVar.c(aVar14, h4.d.a.f81525c);
                                boolean zR8 = mVar2.r(qVar3);
                                e23.l lVar23 = lVar4;
                                boolean zB8 = zR8 | mVar2.B(lVar23);
                                Object objQ11 = mVar2.q();
                                if (zB8) {
                                    i310 = 0;
                                    objQ11 = new i1(qVar3, lVar23, 0);
                                    mVar2.K(objQ11);
                                } else {
                                    aVar13.getClass();
                                    if (objQ11 == p3.m.a.f135155b) {
                                        i310 = 0;
                                        objQ11 = new i1(qVar3, lVar23, 0);
                                        mVar2.K(objQ11);
                                    } else {
                                        i310 = 0;
                                    }
                                }
                                ys1.e.a(i310, (e23.l) objQ11, rVarC2, cVar4, mVar2);
                                mVar2.f();
                            }
                            mVar2.y();
                        } else {
                            mVar2.e();
                        }
                        return Unit.INSTANCE;
                    }
                }, o0VarE), o0VarE, 196656, 28);
                o0Var = o0VarE;
                Unit unit2 = Unit.INSTANCE;
                zR = o0Var.r(window2);
                objQ6 = o0Var.q();
                if (zR) {
                    c2565a2 = c2565a;
                    if (objQ6 == c2565a2) {
                    }
                    p3.l0.a(unit2, (e23.l) objQ6, o0Var);
                    kt1.a aVar12 = aVar8.f140798a;
                    Boolean boolValueOf3 = Boolean.valueOf(cVar2.f140817b);
                    zB2 = o0Var.B(o1Var) | o0Var.r(b0Var3) | o0Var.B(a1VarD) | o0Var.r(lVar15);
                    objQ7 = o0Var.q();
                    if (zB2) {
                        objQ7 = new s1(o1Var, b0Var3, lVar15, a1VarD, null);
                        o0Var.K(objQ7);
                    } else {
                        objQ7 = new s1(o1Var, b0Var3, lVar15, a1VarD, null);
                        o0Var.K(objQ7);
                    }
                    p3.l0.f(aVar12, boolValueOf3, (e23.p) objQ7, o0Var);
                    p3.x1 x1Var4 = p3.n.f135158a;
                } else {
                    c2565a2 = c2565a;
                }
                objQ6 = new ds0.g(window2, 12);
                o0Var.K(objQ6);
                p3.l0.a(unit2, (e23.l) objQ6, o0Var);
                kt1.a aVar13 = aVar8.f140798a;
                Boolean boolValueOf4 = Boolean.valueOf(cVar2.f140817b);
                zB2 = o0Var.B(o1Var) | o0Var.r(b0Var3) | o0Var.B(a1VarD) | o0Var.r(lVar15);
                objQ7 = o0Var.q();
                if (zB2) {
                    objQ7 = new s1(o1Var, b0Var3, lVar15, a1VarD, null);
                    o0Var.K(objQ7);
                } else {
                    objQ7 = new s1(o1Var, b0Var3, lVar15, a1VarD, null);
                    o0Var.K(objQ7);
                }
                p3.l0.f(aVar13, boolValueOf4, (e23.p) objQ7, o0Var);
                p3.x1 x1Var5 = p3.n.f135158a;
            }
            p2Var.f135219d = pVar2;
        }
        o0Var = o0VarE;
        o0Var.e();
        p3.p2 p2VarI1 = o0Var.i0();
        if (p2VarI1 != null) {
            final int i44 = 1;
            pVar2 = new e23.p() { // from class: et1.e1
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    p3.m mVar2 = (p3.m) obj;
                    switch (i44) {
                        case 0:
                            ((Integer) obj2).getClass();
                            w1.c(cVar2, feVar, aVar, lVar, aVar2, aVar3, lVar2, lVar3, pVar, lVar4, aVar4, aVar5, lVar5, aVar6, lVar6, lVar7, lVar8, aVar7, rVar, lVar9, lVar10, lVar11, lVar12, mVar2, p3.p0.t(i14 | 1));
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            w1.c(cVar2, feVar, aVar, lVar, aVar2, aVar3, lVar2, lVar3, pVar, lVar4, aVar4, aVar5, lVar5, aVar6, lVar6, lVar7, lVar8, aVar7, rVar, lVar9, lVar10, lVar11, lVar12, mVar2, p3.p0.t(i14 | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            p2Var = p2VarI1;
            p2Var.f135219d = pVar2;
        }
    }

    public static final void d(int i14, e23.a aVar, h4.r rVar, p3.m mVar, boolean z14) {
        e23.a aVar2;
        p3.o0 o0VarE = mVar.E(-1001917554);
        int i15 = (o0VarE.B(rVar) ? 4 : 2) | i14 | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.h(z14) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            p3.x1 x1Var = p3.n.f135158a;
            i53.f fVarA = i53.a.a(Integer.valueOf(R.string.trails_welcome_title), Integer.valueOf(R.string.trails_welcome_list_curate_title));
            if (!z14) {
                fVarA = fVarA.add(Integer.valueOf(R.string.trails_welcome_offline_title));
            }
            i53.f fVarA2 = i53.a.a(Integer.valueOf(R.string.trails_welcome_caption), Integer.valueOf(R.string.trails_welcome_list_curate_caption));
            if (!z14) {
                fVarA2 = fVarA2.add(Integer.valueOf(R.string.trails_welcome_offline_caption));
            }
            i53.f fVar = fVarA2;
            h4.d.f81522a.getClass();
            f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVar, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.u uVar = c2.u.f22885a;
            aVar2 = aVar;
            ys1.h.a(fVarA.size(), fVarA, fVar, aVar2, o0VarE, (i15 << 6) & 7168, 0);
            o0VarE.g0(true);
        } else {
            aVar2 = aVar;
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d50.n(rVar, aVar2, z14, i14);
        }
    }
}

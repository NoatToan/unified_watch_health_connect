package vc1;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import c2.b0;
import c2.j;
import c2.l;
import c2.u;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import e23.q;
import f5.z0;
import gl1.y;
import h4.k;
import h4.r;
import h5.e0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.t1;
import m92.c0;
import m92.m0;
import m92.n0;
import n92.n;
import n92.o;
import n92.p;
import o4.d0;
import o4.g1;
import o4.u1;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.j0;
import p13.w;
import p13.x;
import p3.b4;
import p3.c2;
import p3.i2;
import p3.m;
import p3.m1;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import s5.q0;
import s5.s0;
import s5.v0;
import s5.x0;

/* JADX INFO: loaded from: classes9.dex */
public final class c {
    /* JADX WARN: Code duplicated, block: B:101:0x0202  */
    /* JADX WARN: Code duplicated, block: B:104:0x020a  */
    /* JADX WARN: Code duplicated, block: B:105:0x0225  */
    /* JADX WARN: Code duplicated, block: B:110:0x0234  */
    /* JADX WARN: Code duplicated, block: B:113:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:115:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:116:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:119:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:122:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:126:0x032d  */
    /* JADX WARN: Code duplicated, block: B:128:0x0336  */
    /* JADX WARN: Code duplicated, block: B:129:0x033a  */
    /* JADX WARN: Code duplicated, block: B:132:0x0347  */
    /* JADX WARN: Code duplicated, block: B:134:0x0355  */
    /* JADX WARN: Code duplicated, block: B:137:0x0378  */
    /* JADX WARN: Code duplicated, block: B:139:0x037f  */
    /* JADX WARN: Code duplicated, block: B:140:0x0383  */
    /* JADX WARN: Code duplicated, block: B:143:0x0390  */
    /* JADX WARN: Code duplicated, block: B:145:0x039e  */
    /* JADX WARN: Code duplicated, block: B:148:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:149:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:152:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:154:0x03df  */
    /* JADX WARN: Code duplicated, block: B:156:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:159:0x03fa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:160:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:161:0x040c  */
    /* JADX WARN: Code duplicated, block: B:163:0x0418  */
    /* JADX WARN: Code duplicated, block: B:165:0x042c  */
    /* JADX WARN: Code duplicated, block: B:168:0x0454  */
    /* JADX WARN: Code duplicated, block: B:169:0x0456  */
    /* JADX WARN: Code duplicated, block: B:172:0x0475  */
    /* JADX WARN: Code duplicated, block: B:176:0x047e  */
    /* JADX WARN: Code duplicated, block: B:179:0x0498  */
    /* JADX WARN: Code duplicated, block: B:180:0x049a  */
    /* JADX WARN: Code duplicated, block: B:183:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:184:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:187:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:188:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:191:0x04fa A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:194:0x0504  */
    /* JADX WARN: Code duplicated, block: B:197:0x053f  */
    /* JADX WARN: Code duplicated, block: B:199:0x054e  */
    /* JADX WARN: Code duplicated, block: B:200:0x0558  */
    /* JADX WARN: Code duplicated, block: B:202:0x0566  */
    /* JADX WARN: Code duplicated, block: B:203:0x0570  */
    /* JADX WARN: Code duplicated, block: B:206:0x0593  */
    /* JADX WARN: Code duplicated, block: B:208:0x05a7  */
    /* JADX WARN: Code duplicated, block: B:210:0x05ad  */
    /* JADX WARN: Code duplicated, block: B:212:0x05b3  */
    /* JADX WARN: Code duplicated, block: B:74:0x012a  */
    /* JADX WARN: Code duplicated, block: B:75:0x016b  */
    /* JADX WARN: Code duplicated, block: B:77:0x017b  */
    /* JADX WARN: Code duplicated, block: B:78:0x017e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x0180  */
    /* JADX WARN: Code duplicated, block: B:80:0x0183  */
    /* JADX WARN: Code duplicated, block: B:82:0x0187  */
    /* JADX WARN: Code duplicated, block: B:84:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:92:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:95:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:98:0x01f1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r15v21, types: [p3.m] */
    /* JADX WARN: Type inference failed for: r1v1, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v2, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r1v35, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r1v36, types: [p3.m, p3.o0] */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v49 */
    /* JADX WARN: Type inference failed for: r1v50 */
    /* JADX WARN: Type inference failed for: r1v51 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r7v1, types: [p3.m, p3.o0] */
    public static final void a(r rVar, final ArrayList arrayList, final ArrayList arrayList2, final ArrayList arrayList3, final ArrayList arrayList4, final ArrayList arrayList5, final Float f14, String str, final Float f15, final Float f16, final n nVar, o oVar, final p pVar, q qVar, m mVar, int i14) {
        String str2;
        ?? r14;
        String strQ;
        int i15;
        s0 s0Var;
        s0 s0Var2;
        x0 x0VarF;
        boolean z14;
        final q0 q0VarA;
        String str3;
        int i16;
        boolean z15;
        Object objQ;
        m.a.C2565a c2565a;
        Object obj;
        p1 p1Var;
        Object objQ2;
        Object obj2;
        final p1 p1Var2;
        Object objQ3;
        Object objO;
        final m1 m1Var;
        float f17;
        List listA;
        final long jE;
        final long jF;
        final long jB;
        m92.m.b bVar;
        final float f18;
        j.k kVar;
        h4.g.a aVar;
        z zVarA;
        int iHashCode;
        i2 i2VarA0;
        r rVarC;
        e0.a aVar2;
        h5.g.a.e eVar;
        h5.g.a.C1623g c1623g;
        h5.g.a.b bVar2;
        m92.m.b bVar3;
        h5.g.a.f fVar;
        b0 b0Var;
        r.a aVar3;
        final List list;
        z0 z0VarD;
        final boolean z16;
        int iHashCode2;
        i2 i2VarA1;
        r rVarC2;
        z zVarA2;
        int iHashCode3;
        i2 i2VarA2;
        r rVarC3;
        Object objQ4;
        p1 p1Var3;
        Object obj3;
        ?? r15;
        float fX;
        float fX2;
        float fX3;
        ?? r16;
        ?? r17;
        char c14;
        final m92.m.b bVar4;
        int i17;
        int i18;
        boolean z17;
        Object obj4;
        float f19;
        ?? r18;
        Map map;
        n4.c cVar;
        ?? E = mVar.E(972604396);
        p3.c<?> cVar2 = E.f135177b;
        int i19 = i14 | (E.B(rVar) ? 4 : 2) | (E.r(arrayList) ? 256 : 128) | (E.r(arrayList2) ? 2048 : 1024) | (E.r(arrayList3) ? 16384 : 8192) | (E.r(arrayList4) ? 131072 : 65536) | (E.r(arrayList5) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (E.B(f14) ? 8388608 : 4194304) | 33554432 | (E.B(f15) ? 536870912 : 268435456);
        int i24 = 25152 | (E.B(f16) ? (char) 4 : (char) 2) | (E.r(nVar) ? 32 : 16) | (E.r(oVar) ? (char) 256 : (char) 128) | (E.B(pVar) ? (char) 2048 : (char) 1024);
        if (E.n(i19 & 1, ((i19 & 306783379) == 306783378 && (i24 & 9363) == 9362) ? false : true)) {
            E.G0();
            if ((i14 & 1) == 0 || E.o0()) {
                strQ = y.Q(E, R.string.msg_no_data_available);
                i15 = i19 & (-234881025);
            } else {
                E.e();
                i15 = i19 & (-234881025);
                strQ = str;
            }
            E.h0();
            x1 x1Var = p3.n.f135158a;
            g6.f.a aVar4 = g6.f.f75994b;
            final float fG = w02.b0.g(0.0f / 4, E);
            if (nVar != null) {
                s0Var = nVar.f125091a;
            } else {
                if (pVar != null) {
                    s0Var = pVar.f125097a;
                } else {
                    s0Var = null;
                }
                if (s0Var == null) {
                    E.C(-1630019423);
                    s0 s0Var3 = new s0((w5.q.b) E.A(t1.f91493k), new g6.d(((g6.c) E.A(t1.f91490h)).getF75991a(), 1.0f), (g6.o) E.A(t1.f91496n), 0, 8, null);
                    E.g0(false);
                    s0Var2 = s0Var3;
                } else {
                    E.C(-1630021345);
                    E.g0(false);
                    s0Var2 = s0Var;
                }
                if (nVar != null) {
                    x0VarF = nVar.f125092b;
                } else if (pVar != null) {
                    x0VarF = pVar.f125098b;
                } else {
                    x0VarF = null;
                }
                if (x0VarF == null) {
                    E.C(-1630009444);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0VarF = d92.c.f(j92.f.f97935l, E);
                    z14 = false;
                } else {
                    z14 = false;
                    E.C(-1630011397);
                }
                E.g0(z14);
                q0VarA = s0.a(s0Var2, strQ, x0VarF, 0L, 1020);
                str3 = strQ;
                i16 = (int) (q0VarA.f157282c & 4294967295L);
                if (!arrayList4.isEmpty() && arrayList3.isEmpty() && arrayList5.isEmpty()) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                objQ = E.q();
                m.f135153a.getClass();
                c2565a = m.a.f135155b;
                obj = objQ;
                if (objQ == c2565a) {
                    c2 c2VarN = p0.n(null);
                    E.K(c2VarN);
                    obj = c2VarN;
                }
                p1Var = (p1) obj;
                objQ2 = E.q();
                obj2 = objQ2;
                if (objQ2 == c2565a) {
                    c2 c2VarN2 = p0.n(null);
                    E.K(c2VarN2);
                    obj2 = c2VarN2;
                }
                p1Var2 = (p1) obj2;
                objQ3 = E.q();
                objO = objQ3;
                if (objQ3 == c2565a) {
                    objO = n23.j.o(fG, E);
                }
                m1Var = (m1) objO;
                if (nVar != null) {
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    f17 = (2 * i16) + j92.b.f97899b.f97918c;
                } else {
                    f17 = 0.0f;
                }
                if (oVar != null || (listA = oVar.a()) == null) {
                    listA = j0.f134944a;
                }
                gl.c.f77766a.getClass();
                jE = gl.c.a(E).e();
                jF = gl.c.a(E).f();
                jB = gl.c.a(E).b();
                f18 = f17;
                List listK = x.k(new o13.p(Float.valueOf(0.0f), d0.a(d0.c(0.25f, jB, 14))), new o13.p(Float.valueOf((float) r0), d0.a(d0.c(0.6f, jB, 14))));
                u1.f129010b.getClass();
                bVar = new m92.m.b(listK, u1.f129011c, null);
                j.f22691a.getClass();
                kVar = j.f22694d;
                h4.d.f81522a.getClass();
                aVar = h4.d.a.f81536n;
                zVarA = c2.y.a(kVar, aVar, E, 0);
                iHashCode = Long.hashCode(E.U);
                i2VarA0 = E.a0();
                rVarC = k.c(rVar, E);
                h5.g.V.getClass();
                aVar2 = h5.g.a.f81805b;
                if (cVar2 != null) {
                    p0.l();
                    throw null;
                }
                E.z();
                if (E.T) {
                    E.M(aVar2);
                } else {
                    E.c();
                }
                eVar = h5.g.a.f81810g;
                b4.c(eVar, zVarA, E);
                c1623g = h5.g.a.f81809f;
                b4.c(c1623g, i2VarA0, E);
                bVar2 = h5.g.a.f81813j;
                if (E.T) {
                    bVar3 = bVar;
                } else {
                    bVar3 = bVar;
                    if (!s.g(E.q(), Integer.valueOf(iHashCode))) {
                    }
                    fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC, E);
                    b0Var = b0.f22601a;
                    aVar3 = r.S;
                    list = listA;
                    r rVarA = b0Var.a(aVar3, 1.0f, true);
                    z0VarD = c2.q.d(h4.d.a.f81524b, false);
                    z16 = z15;
                    iHashCode2 = Long.hashCode(E.U);
                    i2VarA1 = E.a0();
                    rVarC2 = k.c(rVarA, E);
                    if (cVar2 != null) {
                        p0.l();
                        throw null;
                    }
                    E.z();
                    if (E.T) {
                        E.M(aVar2);
                    } else {
                        E.c();
                    }
                    b4.c(eVar, z0VarD, E);
                    b4.c(c1623g, i2VarA1, E);
                    if (E.T || !s.g(E.q(), Integer.valueOf(iHashCode2))) {
                        v.h.A(iHashCode2, E, iHashCode2, bVar2);
                    }
                    b4.c(fVar, rVarC2, E);
                    u uVar = u.f22885a;
                    r rVarD = x2.d(aVar3, 1.0f);
                    zVarA2 = c2.y.a(kVar, aVar, E, 0);
                    iHashCode3 = Long.hashCode(E.U);
                    i2VarA2 = E.a0();
                    rVarC3 = k.c(rVarD, E);
                    if (cVar2 != null) {
                        p0.l();
                        throw null;
                    }
                    E.z();
                    if (E.T) {
                        E.M(aVar2);
                    } else {
                        E.c();
                    }
                    b4.c(eVar, zVarA2, E);
                    b4.c(c1623g, i2VarA2, E);
                    if (E.T || !s.g(E.q(), Integer.valueOf(iHashCode3))) {
                        v.h.A(iHashCode3, E, iHashCode3, bVar2);
                    }
                    b4.c(fVar, rVarC3, E);
                    r rVarA2 = b0Var.a(x2.f(aVar3, 1.0f), 1.0f, true);
                    Unit unit = Unit.INSTANCE;
                    objQ4 = E.q();
                    if (objQ4 == c2565a) {
                        p1Var3 = p1Var;
                        b bVar5 = new b(p1Var3);
                        E.K(bVar5);
                        obj3 = bVar5;
                    } else {
                        p1Var3 = p1Var;
                        obj3 = objQ4;
                    }
                    r rVarB = b5.s0.b(rVarA2, unit, (PointerInputEventHandler) obj3);
                    if (pVar != null) {
                        E.C(1128507362);
                        fX = w02.b0.x(E, i16 / 2);
                        r15 = 0;
                        E.g0(false);
                    } else {
                        r15 = 0;
                        E.C(1128507868);
                        E.g0(false);
                        fX = 0;
                    }
                    float f22 = fX;
                    if (pVar != null) {
                        E.C(624074052);
                        E.g0(r15);
                    } else {
                        if (nVar != null) {
                            E.C(624175267);
                            fX2 = w02.b0.x(E, i16 / 2);
                            E.g0(r15);
                        } else {
                            E.C(624280388);
                            E.g0(r15);
                        }
                        float f24 = fX2;
                        if (nVar != null) {
                            E.C(1128521794);
                            fX3 = w02.b0.x(E, i16 / 2);
                            E.g0(r15);
                        } else {
                            E.C(1128522300);
                            E.g0(r15);
                            fX3 = (float) r15;
                        }
                        r rVarC4 = l.C(rVarB, f24, f22, fX3, 0.0f, 8);
                        int i25 = (E.h(z16) ? 1 : 0) | (E.r(q0VarA) ? 1 : 0);
                        if ((i24 & 7168) != 2048) {
                            r16 = r15;
                        } else {
                            r16 = 1;
                        }
                        int i26 = ((((i25 | r16) == true ? 1 : 0) | (E.r(list) ? 1 : 0)) | (E.i(f18) ? 1 : 0) ? 1 : 0) | (E.i(fG) ? 1 : 0);
                        if ((i24 & 112) != 32 || E.r(nVar)) {
                            r17 = 1;
                        } else {
                            r17 = r15;
                        }
                        boolean z18 = ((i26 | r17) == true ? 1 : 0) | (E.l(jE) ? 1 : 0) | (E.r(arrayList) ? 1 : 0);
                        if ((i15 & 29360128) == 8388608) {
                            c14 = 1;
                        } else {
                            c14 = 0;
                        }
                        int i27 = (z18 ? 1 : 0) | c14 | (E.r(arrayList3) ? 1 : 0);
                        bVar4 = bVar3;
                        int i28 = (i27 == true ? 1 : 0) | (E.r(bVar4) ? 1 : 0);
                        if ((i15 & 1879048192) == 536870912) {
                            i17 = 1;
                        } else {
                            i17 = 0;
                        }
                        int i29 = i28 | i17;
                        if ((i24 & 14) == 4) {
                            i18 = 1;
                        } else {
                            i18 = 0;
                        }
                        z17 = (((((i29 | i18) | (E.r(arrayList5) ? 1 : 0)) == true ? 1 : 0) | (E.l(jB) ? 1 : 0)) | (E.r(arrayList4) ? 1 : 0) ? 1 : 0) | (E.l(jF) ? 1 : 0) | (E.r(arrayList2) ? 1 : 0);
                        Object objQ5 = E.q();
                        if (!z17 || objQ5 == c2565a) {
                            ?? r19 = E;
                            obj4 = new e23.l() { // from class: vc1.a
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // e23.l
                                public final Object invoke(Object obj5) throws Throwable {
                                    q4.f fVar2;
                                    float f25;
                                    float f26;
                                    q0 q0Var = q0VarA;
                                    long j8 = q0Var.f157282c;
                                    long j14 = jE;
                                    ArrayList arrayList6 = arrayList;
                                    Float f27 = f14;
                                    ArrayList arrayList7 = arrayList3;
                                    m92.m.b bVar6 = bVar4;
                                    Float f28 = f15;
                                    Float f29 = f16;
                                    ArrayList arrayList8 = arrayList5;
                                    long j15 = jB;
                                    ArrayList arrayList9 = arrayList4;
                                    long j16 = jF;
                                    ArrayList arrayList10 = arrayList2;
                                    p1 p1Var4 = p1Var2;
                                    q4.f fVar3 = (q4.f) obj5;
                                    fVar3.getClass();
                                    if (z16) {
                                        float fIntBitsToFloat = Float.intBitsToFloat((int) (n4.h.b(fVar3.b()) >> 32)) - (((int) (j8 >> 32)) / 2);
                                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (n4.h.b(fVar3.b()) & 4294967295L)) - (((int) (j8 & 4294967295L)) / 2);
                                        long jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
                                        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L;
                                        n4.c.a aVar5 = n4.c.f123541b;
                                        v0.b(fVar3, q0Var, 0L, jFloatToRawIntBits2 | (jFloatToRawIntBits << 32), 250);
                                    } else {
                                        p pVar2 = pVar;
                                        List<o13.p<Float, String>> list2 = list;
                                        float f34 = f18;
                                        float f35 = fG;
                                        m1 m1Var2 = m1Var;
                                        if (pVar2 != null) {
                                            float f36 = pVar2.a(fVar3, list2, j0.f134944a, f34).f125077a + f35;
                                            d92.b.f58623a.getClass();
                                            d92.b.f58625c.getClass();
                                            m1Var2.i(f36 + j92.b.f97899b.f97921f);
                                        }
                                        n nVar2 = nVar;
                                        if (nVar2 != null) {
                                            float floatValue = m1Var2.getFloatValue();
                                            fVar3.getF142543b().f142550a.e(floatValue, 0.0f, f35, 0.0f);
                                            try {
                                                nVar2.a(fVar3, f34);
                                                fVar3.getF142543b().f142550a.e(-floatValue, -0.0f, -f35, -0.0f);
                                            } catch (Throwable th3) {
                                                fVar3.getF142543b().f142550a.e(-floatValue, -0.0f, -f35, -0.0f);
                                                throw th3;
                                            }
                                        }
                                        float floatValue2 = m1Var2.getFloatValue();
                                        fVar3.getF142543b().f142550a.e(floatValue2, 0.0f, f35, f34);
                                        float f37 = 1;
                                        try {
                                            g6.f.a aVar6 = g6.f.f75994b;
                                            o13.p pVar3 = (o13.p) h0.d0(list2);
                                            Float f38 = pVar3 != null ? (Float) pVar3.f128594a : null;
                                            o13.p pVar4 = (o13.p) h0.n0(list2);
                                            Float f39 = pVar4 != null ? (Float) pVar4.f128594a : null;
                                            m92.m.d dVar = new m92.m.d(j14, null);
                                            m92.e0 e0Var = m92.e0.LINEAR;
                                            g1.f128855a.getClass();
                                            f25 = f35;
                                            f26 = f34;
                                            try {
                                                c0.e(fVar3, f37, dVar, false, 0.0f, null, null, arrayList6, f27, null, null, f38, f39, e0Var, true, g1.a.a(0.0f, new float[]{8.0f, 8.0f}), 824);
                                                fVar2 = fVar3;
                                                try {
                                                    m0 m0Var = new m0(i53.a.e(arrayList7), (d0) null, bVar6, (g6.f) null, 10, (p005kotlin.jvm.internal.j) null);
                                                    o13.p pVar5 = (o13.p) h0.d0(list2);
                                                    Float f44 = pVar5 != null ? (Float) pVar5.f128594a : null;
                                                    o13.p pVar6 = (o13.p) h0.n0(list2);
                                                    n0.d(fVar2, m0Var, null, f28, f29, f44, pVar6 != null ? (Float) pVar6.f128594a : null, null, 194);
                                                    m0 m0Var2 = new m0(i53.a.e(arrayList8), (d0) null, bVar6, (g6.f) null, 10, (p005kotlin.jvm.internal.j) null);
                                                    o13.p pVar7 = (o13.p) h0.d0(list2);
                                                    Float f45 = pVar7 != null ? (Float) pVar7.f128594a : null;
                                                    o13.p pVar8 = (o13.p) h0.n0(list2);
                                                    n0.d(fVar2, m0Var2, null, f28, f29, f45, pVar8 != null ? (Float) pVar8.f128594a : null, null, 194);
                                                    o13.p pVar9 = (o13.p) h0.d0(list2);
                                                    Float f46 = pVar9 != null ? (Float) pVar9.f128594a : null;
                                                    o13.p pVar10 = (o13.p) h0.n0(list2);
                                                    c0.e(fVar2, f37, new m92.m.d(j15, null), false, 0.0f, null, null, arrayList9, f27, null, null, f46, pVar10 != null ? (Float) pVar10.f128594a : null, e0Var, false, null, 17208);
                                                    o13.p pVar11 = (o13.p) h0.d0(list2);
                                                    Float f47 = pVar11 != null ? (Float) pVar11.f128594a : null;
                                                    o13.p pVar12 = (o13.p) h0.n0(list2);
                                                    p1Var4.setValue(c0.e(fVar2, f37, new m92.m.d(j16, null), false, 0, null, null, arrayList10, f27, null, null, f47, pVar12 != null ? (Float) pVar12.f128594a : null, e0Var, true, null, 17200));
                                                    List listC = w.c(h0.m0(arrayList10));
                                                    o13.p pVar13 = (o13.p) h0.d0(list2);
                                                    Float f48 = pVar13 != null ? (Float) pVar13.f128594a : null;
                                                    o13.p pVar14 = (o13.p) h0.n0(list2);
                                                    c0.e(fVar2, f37, new m92.m.d(j16, null), true, 4, null, d0.a(j16), listC, f27, null, null, f48, pVar14 != null ? (Float) pVar14.f128594a : null, e0Var, true, null, 17168);
                                                    fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, -f25, -f26);
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, -f25, -f26);
                                                    throw th;
                                                }
                                            } catch (Throwable th5) {
                                                th = th5;
                                                fVar2 = fVar3;
                                            }
                                        } catch (Throwable th6) {
                                            th = th6;
                                            fVar2 = fVar3;
                                            f25 = f35;
                                            f26 = f34;
                                        }
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            f19 = f18;
                            m1Var = m1Var;
                            r19.K(obj4);
                            r18 = r19;
                        } else {
                            obj4 = objQ5;
                            r18 = E;
                            f19 = f18;
                        }
                        u1.n.b(rVarC4, (e23.l) obj4, r18, 0);
                        r18.g0(true);
                        if (qVar != null) {
                            r18.C(-1465602610);
                            map = (Map) p1Var2.getF182175a();
                            if (map == null) {
                                r18.C(1810959347);
                                r18.g0(false);
                            } else {
                                r18.C(1810959348);
                                cVar = (n4.c) p1Var3.getF182175a();
                                if (cVar == null) {
                                    r18.C(1673296997);
                                    r18.g0(false);
                                } else {
                                    r18.C(1673296998);
                                    m92.y.c(map, cVar.f123544a, m1Var.getFloatValue(), f19, qVar, null, r18, 24576, 32);
                                    r18.g0(false);
                                }
                                r18.g0(false);
                            }
                            r18.g0(false);
                        } else {
                            r18.C(1811186578);
                            r18.g0(false);
                        }
                        r18.g0(true);
                        r18.g0(true);
                        x1 x1Var2 = p3.n.f135158a;
                        str2 = str3;
                        r14 = r18;
                    }
                    fX2 = (float) r15;
                    float f25 = fX2;
                    if (nVar != null) {
                        E.C(1128521794);
                        fX3 = w02.b0.x(E, i16 / 2);
                        E.g0(r15);
                    } else {
                        E.C(1128522300);
                        E.g0(r15);
                        fX3 = (float) r15;
                    }
                    r rVarC5 = l.C(rVarB, f25, f22, fX3, 0.0f, 8);
                    int i210 = (E.h(z16) ? 1 : 0) | (E.r(q0VarA) ? 1 : 0);
                    if ((i24 & 7168) != 2048) {
                        r16 = r15;
                    } else {
                        r16 = 1;
                    }
                    int i211 = ((((i210 | r16) == true ? 1 : 0) | (E.r(list) ? 1 : 0)) | (E.i(f18) ? 1 : 0) ? 1 : 0) | (E.i(fG) ? 1 : 0);
                    if ((i24 & 112) != 32) {
                        r17 = 1;
                    } else {
                        r17 = 1;
                    }
                    boolean z19 = ((i211 | r17) == true ? 1 : 0) | (E.l(jE) ? 1 : 0) | (E.r(arrayList) ? 1 : 0);
                    if ((i15 & 29360128) == 8388608) {
                        c14 = 1;
                    } else {
                        c14 = 0;
                    }
                    int i212 = (z19 ? 1 : 0) | c14 | (E.r(arrayList3) ? 1 : 0);
                    bVar4 = bVar3;
                    int i213 = (i212 == true ? 1 : 0) | (E.r(bVar4) ? 1 : 0);
                    if ((i15 & 1879048192) == 536870912) {
                        i17 = 1;
                    } else {
                        i17 = 0;
                    }
                    int i214 = i213 | i17;
                    if ((i24 & 14) == 4) {
                        i18 = 1;
                    } else {
                        i18 = 0;
                    }
                    z17 = (((((i214 | i18) | (E.r(arrayList5) ? 1 : 0)) == true ? 1 : 0) | (E.l(jB) ? 1 : 0)) | (E.r(arrayList4) ? 1 : 0) ? 1 : 0) | (E.l(jF) ? 1 : 0) | (E.r(arrayList2) ? 1 : 0);
                    Object objQ6 = E.q();
                    if (z17) {
                        ?? r110 = E;
                        obj4 = new e23.l() { // from class: vc1.a
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // e23.l
                            public final Object invoke(Object obj5) throws Throwable {
                                q4.f fVar2;
                                float f26;
                                float f27;
                                q0 q0Var = q0VarA;
                                long j8 = q0Var.f157282c;
                                long j14 = jE;
                                ArrayList arrayList6 = arrayList;
                                Float f28 = f14;
                                ArrayList arrayList7 = arrayList3;
                                m92.m.b bVar6 = bVar4;
                                Float f29 = f15;
                                Float f210 = f16;
                                ArrayList arrayList8 = arrayList5;
                                long j15 = jB;
                                ArrayList arrayList9 = arrayList4;
                                long j16 = jF;
                                ArrayList arrayList10 = arrayList2;
                                p1 p1Var4 = p1Var2;
                                q4.f fVar3 = (q4.f) obj5;
                                fVar3.getClass();
                                if (z16) {
                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (n4.h.b(fVar3.b()) >> 32)) - (((int) (j8 >> 32)) / 2);
                                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (n4.h.b(fVar3.b()) & 4294967295L)) - (((int) (j8 & 4294967295L)) / 2);
                                    long jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
                                    long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L;
                                    n4.c.a aVar5 = n4.c.f123541b;
                                    v0.b(fVar3, q0Var, 0L, jFloatToRawIntBits2 | (jFloatToRawIntBits << 32), 250);
                                } else {
                                    p pVar2 = pVar;
                                    List<o13.p<Float, String>> list2 = list;
                                    float f34 = f18;
                                    float f35 = fG;
                                    m1 m1Var2 = m1Var;
                                    if (pVar2 != null) {
                                        float f36 = pVar2.a(fVar3, list2, j0.f134944a, f34).f125077a + f35;
                                        d92.b.f58623a.getClass();
                                        d92.b.f58625c.getClass();
                                        m1Var2.i(f36 + j92.b.f97899b.f97921f);
                                    }
                                    n nVar2 = nVar;
                                    if (nVar2 != null) {
                                        float floatValue = m1Var2.getFloatValue();
                                        fVar3.getF142543b().f142550a.e(floatValue, 0.0f, f35, 0.0f);
                                        try {
                                            nVar2.a(fVar3, f34);
                                            fVar3.getF142543b().f142550a.e(-floatValue, -0.0f, -f35, -0.0f);
                                        } catch (Throwable th3) {
                                            fVar3.getF142543b().f142550a.e(-floatValue, -0.0f, -f35, -0.0f);
                                            throw th3;
                                        }
                                    }
                                    float floatValue2 = m1Var2.getFloatValue();
                                    fVar3.getF142543b().f142550a.e(floatValue2, 0.0f, f35, f34);
                                    float f37 = 1;
                                    try {
                                        g6.f.a aVar6 = g6.f.f75994b;
                                        o13.p pVar3 = (o13.p) h0.d0(list2);
                                        Float f38 = pVar3 != null ? (Float) pVar3.f128594a : null;
                                        o13.p pVar4 = (o13.p) h0.n0(list2);
                                        Float f39 = pVar4 != null ? (Float) pVar4.f128594a : null;
                                        m92.m.d dVar = new m92.m.d(j14, null);
                                        m92.e0 e0Var = m92.e0.LINEAR;
                                        g1.f128855a.getClass();
                                        f26 = f35;
                                        f27 = f34;
                                        try {
                                            c0.e(fVar3, f37, dVar, false, 0.0f, null, null, arrayList6, f28, null, null, f38, f39, e0Var, true, g1.a.a(0.0f, new float[]{8.0f, 8.0f}), 824);
                                            fVar2 = fVar3;
                                            try {
                                                m0 m0Var = new m0(i53.a.e(arrayList7), (d0) null, bVar6, (g6.f) null, 10, (p005kotlin.jvm.internal.j) null);
                                                o13.p pVar5 = (o13.p) h0.d0(list2);
                                                Float f44 = pVar5 != null ? (Float) pVar5.f128594a : null;
                                                o13.p pVar6 = (o13.p) h0.n0(list2);
                                                n0.d(fVar2, m0Var, null, f29, f210, f44, pVar6 != null ? (Float) pVar6.f128594a : null, null, 194);
                                                m0 m0Var2 = new m0(i53.a.e(arrayList8), (d0) null, bVar6, (g6.f) null, 10, (p005kotlin.jvm.internal.j) null);
                                                o13.p pVar7 = (o13.p) h0.d0(list2);
                                                Float f45 = pVar7 != null ? (Float) pVar7.f128594a : null;
                                                o13.p pVar8 = (o13.p) h0.n0(list2);
                                                n0.d(fVar2, m0Var2, null, f29, f210, f45, pVar8 != null ? (Float) pVar8.f128594a : null, null, 194);
                                                o13.p pVar9 = (o13.p) h0.d0(list2);
                                                Float f46 = pVar9 != null ? (Float) pVar9.f128594a : null;
                                                o13.p pVar10 = (o13.p) h0.n0(list2);
                                                c0.e(fVar2, f37, new m92.m.d(j15, null), false, 0.0f, null, null, arrayList9, f28, null, null, f46, pVar10 != null ? (Float) pVar10.f128594a : null, e0Var, false, null, 17208);
                                                o13.p pVar11 = (o13.p) h0.d0(list2);
                                                Float f47 = pVar11 != null ? (Float) pVar11.f128594a : null;
                                                o13.p pVar12 = (o13.p) h0.n0(list2);
                                                p1Var4.setValue(c0.e(fVar2, f37, new m92.m.d(j16, null), false, 0, null, null, arrayList10, f28, null, null, f47, pVar12 != null ? (Float) pVar12.f128594a : null, e0Var, true, null, 17200));
                                                List listC = w.c(h0.m0(arrayList10));
                                                o13.p pVar13 = (o13.p) h0.d0(list2);
                                                Float f48 = pVar13 != null ? (Float) pVar13.f128594a : null;
                                                o13.p pVar14 = (o13.p) h0.n0(list2);
                                                c0.e(fVar2, f37, new m92.m.d(j16, null), true, 4, null, d0.a(j16), listC, f28, null, null, f48, pVar14 != null ? (Float) pVar14.f128594a : null, e0Var, true, null, 17168);
                                                fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, -f26, -f27);
                                            } catch (Throwable th4) {
                                                th = th4;
                                                fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, -f26, -f27);
                                                throw th;
                                            }
                                        } catch (Throwable th5) {
                                            th = th5;
                                            fVar2 = fVar3;
                                        }
                                    } catch (Throwable th6) {
                                        th = th6;
                                        fVar2 = fVar3;
                                        f26 = f35;
                                        f27 = f34;
                                    }
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        f19 = f18;
                        m1Var = m1Var;
                        r110.K(obj4);
                        r18 = r110;
                    } else {
                        ?? r111 = E;
                        obj4 = new e23.l() { // from class: vc1.a
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // e23.l
                            public final Object invoke(Object obj5) throws Throwable {
                                q4.f fVar2;
                                float f26;
                                float f27;
                                q0 q0Var = q0VarA;
                                long j8 = q0Var.f157282c;
                                long j14 = jE;
                                ArrayList arrayList6 = arrayList;
                                Float f28 = f14;
                                ArrayList arrayList7 = arrayList3;
                                m92.m.b bVar6 = bVar4;
                                Float f29 = f15;
                                Float f210 = f16;
                                ArrayList arrayList8 = arrayList5;
                                long j15 = jB;
                                ArrayList arrayList9 = arrayList4;
                                long j16 = jF;
                                ArrayList arrayList10 = arrayList2;
                                p1 p1Var4 = p1Var2;
                                q4.f fVar3 = (q4.f) obj5;
                                fVar3.getClass();
                                if (z16) {
                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (n4.h.b(fVar3.b()) >> 32)) - (((int) (j8 >> 32)) / 2);
                                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (n4.h.b(fVar3.b()) & 4294967295L)) - (((int) (j8 & 4294967295L)) / 2);
                                    long jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
                                    long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L;
                                    n4.c.a aVar5 = n4.c.f123541b;
                                    v0.b(fVar3, q0Var, 0L, jFloatToRawIntBits2 | (jFloatToRawIntBits << 32), 250);
                                } else {
                                    p pVar2 = pVar;
                                    List<o13.p<Float, String>> list2 = list;
                                    float f34 = f18;
                                    float f35 = fG;
                                    m1 m1Var2 = m1Var;
                                    if (pVar2 != null) {
                                        float f36 = pVar2.a(fVar3, list2, j0.f134944a, f34).f125077a + f35;
                                        d92.b.f58623a.getClass();
                                        d92.b.f58625c.getClass();
                                        m1Var2.i(f36 + j92.b.f97899b.f97921f);
                                    }
                                    n nVar2 = nVar;
                                    if (nVar2 != null) {
                                        float floatValue = m1Var2.getFloatValue();
                                        fVar3.getF142543b().f142550a.e(floatValue, 0.0f, f35, 0.0f);
                                        try {
                                            nVar2.a(fVar3, f34);
                                            fVar3.getF142543b().f142550a.e(-floatValue, -0.0f, -f35, -0.0f);
                                        } catch (Throwable th3) {
                                            fVar3.getF142543b().f142550a.e(-floatValue, -0.0f, -f35, -0.0f);
                                            throw th3;
                                        }
                                    }
                                    float floatValue2 = m1Var2.getFloatValue();
                                    fVar3.getF142543b().f142550a.e(floatValue2, 0.0f, f35, f34);
                                    float f37 = 1;
                                    try {
                                        g6.f.a aVar6 = g6.f.f75994b;
                                        o13.p pVar3 = (o13.p) h0.d0(list2);
                                        Float f38 = pVar3 != null ? (Float) pVar3.f128594a : null;
                                        o13.p pVar4 = (o13.p) h0.n0(list2);
                                        Float f39 = pVar4 != null ? (Float) pVar4.f128594a : null;
                                        m92.m.d dVar = new m92.m.d(j14, null);
                                        m92.e0 e0Var = m92.e0.LINEAR;
                                        g1.f128855a.getClass();
                                        f26 = f35;
                                        f27 = f34;
                                        try {
                                            c0.e(fVar3, f37, dVar, false, 0.0f, null, null, arrayList6, f28, null, null, f38, f39, e0Var, true, g1.a.a(0.0f, new float[]{8.0f, 8.0f}), 824);
                                            fVar2 = fVar3;
                                            try {
                                                m0 m0Var = new m0(i53.a.e(arrayList7), (d0) null, bVar6, (g6.f) null, 10, (p005kotlin.jvm.internal.j) null);
                                                o13.p pVar5 = (o13.p) h0.d0(list2);
                                                Float f44 = pVar5 != null ? (Float) pVar5.f128594a : null;
                                                o13.p pVar6 = (o13.p) h0.n0(list2);
                                                n0.d(fVar2, m0Var, null, f29, f210, f44, pVar6 != null ? (Float) pVar6.f128594a : null, null, 194);
                                                m0 m0Var2 = new m0(i53.a.e(arrayList8), (d0) null, bVar6, (g6.f) null, 10, (p005kotlin.jvm.internal.j) null);
                                                o13.p pVar7 = (o13.p) h0.d0(list2);
                                                Float f45 = pVar7 != null ? (Float) pVar7.f128594a : null;
                                                o13.p pVar8 = (o13.p) h0.n0(list2);
                                                n0.d(fVar2, m0Var2, null, f29, f210, f45, pVar8 != null ? (Float) pVar8.f128594a : null, null, 194);
                                                o13.p pVar9 = (o13.p) h0.d0(list2);
                                                Float f46 = pVar9 != null ? (Float) pVar9.f128594a : null;
                                                o13.p pVar10 = (o13.p) h0.n0(list2);
                                                c0.e(fVar2, f37, new m92.m.d(j15, null), false, 0.0f, null, null, arrayList9, f28, null, null, f46, pVar10 != null ? (Float) pVar10.f128594a : null, e0Var, false, null, 17208);
                                                o13.p pVar11 = (o13.p) h0.d0(list2);
                                                Float f47 = pVar11 != null ? (Float) pVar11.f128594a : null;
                                                o13.p pVar12 = (o13.p) h0.n0(list2);
                                                p1Var4.setValue(c0.e(fVar2, f37, new m92.m.d(j16, null), false, 0, null, null, arrayList10, f28, null, null, f47, pVar12 != null ? (Float) pVar12.f128594a : null, e0Var, true, null, 17200));
                                                List listC = w.c(h0.m0(arrayList10));
                                                o13.p pVar13 = (o13.p) h0.d0(list2);
                                                Float f48 = pVar13 != null ? (Float) pVar13.f128594a : null;
                                                o13.p pVar14 = (o13.p) h0.n0(list2);
                                                c0.e(fVar2, f37, new m92.m.d(j16, null), true, 4, null, d0.a(j16), listC, f28, null, null, f48, pVar14 != null ? (Float) pVar14.f128594a : null, e0Var, true, null, 17168);
                                                fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, -f26, -f27);
                                            } catch (Throwable th4) {
                                                th = th4;
                                                fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, -f26, -f27);
                                                throw th;
                                            }
                                        } catch (Throwable th5) {
                                            th = th5;
                                            fVar2 = fVar3;
                                        }
                                    } catch (Throwable th6) {
                                        th = th6;
                                        fVar2 = fVar3;
                                        f26 = f35;
                                        f27 = f34;
                                    }
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        f19 = f18;
                        m1Var = m1Var;
                        r111.K(obj4);
                        r18 = r111;
                    }
                    u1.n.b(rVarC5, (e23.l) obj4, r18, 0);
                    r18.g0(true);
                    if (qVar != null) {
                        r18.C(-1465602610);
                        map = (Map) p1Var2.getF182175a();
                        if (map == null) {
                            r18.C(1810959347);
                            r18.g0(false);
                        } else {
                            r18.C(1810959348);
                            cVar = (n4.c) p1Var3.getF182175a();
                            if (cVar == null) {
                                r18.C(1673296997);
                                r18.g0(false);
                            } else {
                                r18.C(1673296998);
                                m92.y.c(map, cVar.f123544a, m1Var.getFloatValue(), f19, qVar, null, r18, 24576, 32);
                                r18.g0(false);
                            }
                            r18.g0(false);
                        }
                        r18.g0(false);
                    } else {
                        r18.C(1811186578);
                        r18.g0(false);
                    }
                    r18.g0(true);
                    r18.g0(true);
                    x1 x1Var3 = p3.n.f135158a;
                    str2 = str3;
                    r14 = r18;
                }
                v.h.A(iHashCode, E, iHashCode, bVar2);
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC, E);
                b0Var = b0.f22601a;
                aVar3 = r.S;
                list = listA;
                r rVarA3 = b0Var.a(aVar3, 1.0f, true);
                z0VarD = c2.q.d(h4.d.a.f81524b, false);
                z16 = z15;
                iHashCode2 = Long.hashCode(E.U);
                i2VarA1 = E.a0();
                rVarC2 = k.c(rVarA3, E);
                if (cVar2 != null) {
                    p0.l();
                    throw null;
                }
                E.z();
                if (E.T) {
                    E.M(aVar2);
                } else {
                    E.c();
                }
                b4.c(eVar, z0VarD, E);
                b4.c(c1623g, i2VarA1, E);
                if (E.T) {
                    v.h.A(iHashCode2, E, iHashCode2, bVar2);
                } else {
                    v.h.A(iHashCode2, E, iHashCode2, bVar2);
                }
                b4.c(fVar, rVarC2, E);
                u uVar2 = u.f22885a;
                r rVarD2 = x2.d(aVar3, 1.0f);
                zVarA2 = c2.y.a(kVar, aVar, E, 0);
                iHashCode3 = Long.hashCode(E.U);
                i2VarA2 = E.a0();
                rVarC3 = k.c(rVarD2, E);
                if (cVar2 != null) {
                    p0.l();
                    throw null;
                }
                E.z();
                if (E.T) {
                    E.M(aVar2);
                } else {
                    E.c();
                }
                b4.c(eVar, zVarA2, E);
                b4.c(c1623g, i2VarA2, E);
                if (E.T) {
                    v.h.A(iHashCode3, E, iHashCode3, bVar2);
                } else {
                    v.h.A(iHashCode3, E, iHashCode3, bVar2);
                }
                b4.c(fVar, rVarC3, E);
                r rVarA4 = b0Var.a(x2.f(aVar3, 1.0f), 1.0f, true);
                Unit unit2 = Unit.INSTANCE;
                objQ4 = E.q();
                if (objQ4 == c2565a) {
                    p1Var3 = p1Var;
                    b bVar6 = new b(p1Var3);
                    E.K(bVar6);
                    obj3 = bVar6;
                } else {
                    p1Var3 = p1Var;
                    obj3 = objQ4;
                }
                r rVarB2 = b5.s0.b(rVarA4, unit2, (PointerInputEventHandler) obj3);
                if (pVar != null) {
                    E.C(1128507362);
                    fX = w02.b0.x(E, i16 / 2);
                    r15 = 0;
                    E.g0(false);
                } else {
                    r15 = 0;
                    E.C(1128507868);
                    E.g0(false);
                    fX = 0;
                }
                float f26 = fX;
                if (pVar != null) {
                    E.C(624074052);
                    E.g0(r15);
                } else {
                    if (nVar != null) {
                        E.C(624175267);
                        fX2 = w02.b0.x(E, i16 / 2);
                        E.g0(r15);
                    } else {
                        E.C(624280388);
                        E.g0(r15);
                    }
                    float f27 = fX2;
                    if (nVar != null) {
                        E.C(1128521794);
                        fX3 = w02.b0.x(E, i16 / 2);
                        E.g0(r15);
                    } else {
                        E.C(1128522300);
                        E.g0(r15);
                        fX3 = (float) r15;
                    }
                    r rVarC6 = l.C(rVarB2, f27, f26, fX3, 0.0f, 8);
                    int i215 = (E.h(z16) ? 1 : 0) | (E.r(q0VarA) ? 1 : 0);
                    if ((i24 & 7168) != 2048) {
                        r16 = r15;
                    } else {
                        r16 = 1;
                    }
                    int i216 = ((((i215 | r16) == true ? 1 : 0) | (E.r(list) ? 1 : 0)) | (E.i(f18) ? 1 : 0) ? 1 : 0) | (E.i(fG) ? 1 : 0);
                    if ((i24 & 112) != 32) {
                        r17 = 1;
                    } else {
                        r17 = 1;
                    }
                    boolean z110 = ((i216 | r17) == true ? 1 : 0) | (E.l(jE) ? 1 : 0) | (E.r(arrayList) ? 1 : 0);
                    if ((i15 & 29360128) == 8388608) {
                        c14 = 1;
                    } else {
                        c14 = 0;
                    }
                    int i217 = (z110 ? 1 : 0) | c14 | (E.r(arrayList3) ? 1 : 0);
                    bVar4 = bVar3;
                    int i218 = (i217 == true ? 1 : 0) | (E.r(bVar4) ? 1 : 0);
                    if ((i15 & 1879048192) == 536870912) {
                        i17 = 1;
                    } else {
                        i17 = 0;
                    }
                    int i219 = i218 | i17;
                    if ((i24 & 14) == 4) {
                        i18 = 1;
                    } else {
                        i18 = 0;
                    }
                    z17 = (((((i219 | i18) | (E.r(arrayList5) ? 1 : 0)) == true ? 1 : 0) | (E.l(jB) ? 1 : 0)) | (E.r(arrayList4) ? 1 : 0) ? 1 : 0) | (E.l(jF) ? 1 : 0) | (E.r(arrayList2) ? 1 : 0);
                    Object objQ7 = E.q();
                    if (z17) {
                        ?? r112 = E;
                        obj4 = new e23.l() { // from class: vc1.a
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // e23.l
                            public final Object invoke(Object obj5) throws Throwable {
                                q4.f fVar2;
                                float f28;
                                float f29;
                                q0 q0Var = q0VarA;
                                long j8 = q0Var.f157282c;
                                long j14 = jE;
                                ArrayList arrayList6 = arrayList;
                                Float f210 = f14;
                                ArrayList arrayList7 = arrayList3;
                                m92.m.b bVar7 = bVar4;
                                Float f211 = f15;
                                Float f212 = f16;
                                ArrayList arrayList8 = arrayList5;
                                long j15 = jB;
                                ArrayList arrayList9 = arrayList4;
                                long j16 = jF;
                                ArrayList arrayList10 = arrayList2;
                                p1 p1Var4 = p1Var2;
                                q4.f fVar3 = (q4.f) obj5;
                                fVar3.getClass();
                                if (z16) {
                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (n4.h.b(fVar3.b()) >> 32)) - (((int) (j8 >> 32)) / 2);
                                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (n4.h.b(fVar3.b()) & 4294967295L)) - (((int) (j8 & 4294967295L)) / 2);
                                    long jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
                                    long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L;
                                    n4.c.a aVar5 = n4.c.f123541b;
                                    v0.b(fVar3, q0Var, 0L, jFloatToRawIntBits2 | (jFloatToRawIntBits << 32), 250);
                                } else {
                                    p pVar2 = pVar;
                                    List<o13.p<Float, String>> list2 = list;
                                    float f34 = f18;
                                    float f35 = fG;
                                    m1 m1Var2 = m1Var;
                                    if (pVar2 != null) {
                                        float f36 = pVar2.a(fVar3, list2, j0.f134944a, f34).f125077a + f35;
                                        d92.b.f58623a.getClass();
                                        d92.b.f58625c.getClass();
                                        m1Var2.i(f36 + j92.b.f97899b.f97921f);
                                    }
                                    n nVar2 = nVar;
                                    if (nVar2 != null) {
                                        float floatValue = m1Var2.getFloatValue();
                                        fVar3.getF142543b().f142550a.e(floatValue, 0.0f, f35, 0.0f);
                                        try {
                                            nVar2.a(fVar3, f34);
                                            fVar3.getF142543b().f142550a.e(-floatValue, -0.0f, -f35, -0.0f);
                                        } catch (Throwable th3) {
                                            fVar3.getF142543b().f142550a.e(-floatValue, -0.0f, -f35, -0.0f);
                                            throw th3;
                                        }
                                    }
                                    float floatValue2 = m1Var2.getFloatValue();
                                    fVar3.getF142543b().f142550a.e(floatValue2, 0.0f, f35, f34);
                                    float f37 = 1;
                                    try {
                                        g6.f.a aVar6 = g6.f.f75994b;
                                        o13.p pVar3 = (o13.p) h0.d0(list2);
                                        Float f38 = pVar3 != null ? (Float) pVar3.f128594a : null;
                                        o13.p pVar4 = (o13.p) h0.n0(list2);
                                        Float f39 = pVar4 != null ? (Float) pVar4.f128594a : null;
                                        m92.m.d dVar = new m92.m.d(j14, null);
                                        m92.e0 e0Var = m92.e0.LINEAR;
                                        g1.f128855a.getClass();
                                        f28 = f35;
                                        f29 = f34;
                                        try {
                                            c0.e(fVar3, f37, dVar, false, 0.0f, null, null, arrayList6, f210, null, null, f38, f39, e0Var, true, g1.a.a(0.0f, new float[]{8.0f, 8.0f}), 824);
                                            fVar2 = fVar3;
                                            try {
                                                m0 m0Var = new m0(i53.a.e(arrayList7), (d0) null, bVar7, (g6.f) null, 10, (p005kotlin.jvm.internal.j) null);
                                                o13.p pVar5 = (o13.p) h0.d0(list2);
                                                Float f44 = pVar5 != null ? (Float) pVar5.f128594a : null;
                                                o13.p pVar6 = (o13.p) h0.n0(list2);
                                                n0.d(fVar2, m0Var, null, f211, f212, f44, pVar6 != null ? (Float) pVar6.f128594a : null, null, 194);
                                                m0 m0Var2 = new m0(i53.a.e(arrayList8), (d0) null, bVar7, (g6.f) null, 10, (p005kotlin.jvm.internal.j) null);
                                                o13.p pVar7 = (o13.p) h0.d0(list2);
                                                Float f45 = pVar7 != null ? (Float) pVar7.f128594a : null;
                                                o13.p pVar8 = (o13.p) h0.n0(list2);
                                                n0.d(fVar2, m0Var2, null, f211, f212, f45, pVar8 != null ? (Float) pVar8.f128594a : null, null, 194);
                                                o13.p pVar9 = (o13.p) h0.d0(list2);
                                                Float f46 = pVar9 != null ? (Float) pVar9.f128594a : null;
                                                o13.p pVar10 = (o13.p) h0.n0(list2);
                                                c0.e(fVar2, f37, new m92.m.d(j15, null), false, 0.0f, null, null, arrayList9, f210, null, null, f46, pVar10 != null ? (Float) pVar10.f128594a : null, e0Var, false, null, 17208);
                                                o13.p pVar11 = (o13.p) h0.d0(list2);
                                                Float f47 = pVar11 != null ? (Float) pVar11.f128594a : null;
                                                o13.p pVar12 = (o13.p) h0.n0(list2);
                                                p1Var4.setValue(c0.e(fVar2, f37, new m92.m.d(j16, null), false, 0, null, null, arrayList10, f210, null, null, f47, pVar12 != null ? (Float) pVar12.f128594a : null, e0Var, true, null, 17200));
                                                List listC = w.c(h0.m0(arrayList10));
                                                o13.p pVar13 = (o13.p) h0.d0(list2);
                                                Float f48 = pVar13 != null ? (Float) pVar13.f128594a : null;
                                                o13.p pVar14 = (o13.p) h0.n0(list2);
                                                c0.e(fVar2, f37, new m92.m.d(j16, null), true, 4, null, d0.a(j16), listC, f210, null, null, f48, pVar14 != null ? (Float) pVar14.f128594a : null, e0Var, true, null, 17168);
                                                fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, -f28, -f29);
                                            } catch (Throwable th4) {
                                                th = th4;
                                                fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, -f28, -f29);
                                                throw th;
                                            }
                                        } catch (Throwable th5) {
                                            th = th5;
                                            fVar2 = fVar3;
                                        }
                                    } catch (Throwable th6) {
                                        th = th6;
                                        fVar2 = fVar3;
                                        f28 = f35;
                                        f29 = f34;
                                    }
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        f19 = f18;
                        m1Var = m1Var;
                        r112.K(obj4);
                        r18 = r112;
                    } else {
                        ?? r113 = E;
                        obj4 = new e23.l() { // from class: vc1.a
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // e23.l
                            public final Object invoke(Object obj5) throws Throwable {
                                q4.f fVar2;
                                float f28;
                                float f29;
                                q0 q0Var = q0VarA;
                                long j8 = q0Var.f157282c;
                                long j14 = jE;
                                ArrayList arrayList6 = arrayList;
                                Float f210 = f14;
                                ArrayList arrayList7 = arrayList3;
                                m92.m.b bVar7 = bVar4;
                                Float f211 = f15;
                                Float f212 = f16;
                                ArrayList arrayList8 = arrayList5;
                                long j15 = jB;
                                ArrayList arrayList9 = arrayList4;
                                long j16 = jF;
                                ArrayList arrayList10 = arrayList2;
                                p1 p1Var4 = p1Var2;
                                q4.f fVar3 = (q4.f) obj5;
                                fVar3.getClass();
                                if (z16) {
                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (n4.h.b(fVar3.b()) >> 32)) - (((int) (j8 >> 32)) / 2);
                                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (n4.h.b(fVar3.b()) & 4294967295L)) - (((int) (j8 & 4294967295L)) / 2);
                                    long jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
                                    long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L;
                                    n4.c.a aVar5 = n4.c.f123541b;
                                    v0.b(fVar3, q0Var, 0L, jFloatToRawIntBits2 | (jFloatToRawIntBits << 32), 250);
                                } else {
                                    p pVar2 = pVar;
                                    List<o13.p<Float, String>> list2 = list;
                                    float f34 = f18;
                                    float f35 = fG;
                                    m1 m1Var2 = m1Var;
                                    if (pVar2 != null) {
                                        float f36 = pVar2.a(fVar3, list2, j0.f134944a, f34).f125077a + f35;
                                        d92.b.f58623a.getClass();
                                        d92.b.f58625c.getClass();
                                        m1Var2.i(f36 + j92.b.f97899b.f97921f);
                                    }
                                    n nVar2 = nVar;
                                    if (nVar2 != null) {
                                        float floatValue = m1Var2.getFloatValue();
                                        fVar3.getF142543b().f142550a.e(floatValue, 0.0f, f35, 0.0f);
                                        try {
                                            nVar2.a(fVar3, f34);
                                            fVar3.getF142543b().f142550a.e(-floatValue, -0.0f, -f35, -0.0f);
                                        } catch (Throwable th3) {
                                            fVar3.getF142543b().f142550a.e(-floatValue, -0.0f, -f35, -0.0f);
                                            throw th3;
                                        }
                                    }
                                    float floatValue2 = m1Var2.getFloatValue();
                                    fVar3.getF142543b().f142550a.e(floatValue2, 0.0f, f35, f34);
                                    float f37 = 1;
                                    try {
                                        g6.f.a aVar6 = g6.f.f75994b;
                                        o13.p pVar3 = (o13.p) h0.d0(list2);
                                        Float f38 = pVar3 != null ? (Float) pVar3.f128594a : null;
                                        o13.p pVar4 = (o13.p) h0.n0(list2);
                                        Float f39 = pVar4 != null ? (Float) pVar4.f128594a : null;
                                        m92.m.d dVar = new m92.m.d(j14, null);
                                        m92.e0 e0Var = m92.e0.LINEAR;
                                        g1.f128855a.getClass();
                                        f28 = f35;
                                        f29 = f34;
                                        try {
                                            c0.e(fVar3, f37, dVar, false, 0.0f, null, null, arrayList6, f210, null, null, f38, f39, e0Var, true, g1.a.a(0.0f, new float[]{8.0f, 8.0f}), 824);
                                            fVar2 = fVar3;
                                            try {
                                                m0 m0Var = new m0(i53.a.e(arrayList7), (d0) null, bVar7, (g6.f) null, 10, (p005kotlin.jvm.internal.j) null);
                                                o13.p pVar5 = (o13.p) h0.d0(list2);
                                                Float f44 = pVar5 != null ? (Float) pVar5.f128594a : null;
                                                o13.p pVar6 = (o13.p) h0.n0(list2);
                                                n0.d(fVar2, m0Var, null, f211, f212, f44, pVar6 != null ? (Float) pVar6.f128594a : null, null, 194);
                                                m0 m0Var2 = new m0(i53.a.e(arrayList8), (d0) null, bVar7, (g6.f) null, 10, (p005kotlin.jvm.internal.j) null);
                                                o13.p pVar7 = (o13.p) h0.d0(list2);
                                                Float f45 = pVar7 != null ? (Float) pVar7.f128594a : null;
                                                o13.p pVar8 = (o13.p) h0.n0(list2);
                                                n0.d(fVar2, m0Var2, null, f211, f212, f45, pVar8 != null ? (Float) pVar8.f128594a : null, null, 194);
                                                o13.p pVar9 = (o13.p) h0.d0(list2);
                                                Float f46 = pVar9 != null ? (Float) pVar9.f128594a : null;
                                                o13.p pVar10 = (o13.p) h0.n0(list2);
                                                c0.e(fVar2, f37, new m92.m.d(j15, null), false, 0.0f, null, null, arrayList9, f210, null, null, f46, pVar10 != null ? (Float) pVar10.f128594a : null, e0Var, false, null, 17208);
                                                o13.p pVar11 = (o13.p) h0.d0(list2);
                                                Float f47 = pVar11 != null ? (Float) pVar11.f128594a : null;
                                                o13.p pVar12 = (o13.p) h0.n0(list2);
                                                p1Var4.setValue(c0.e(fVar2, f37, new m92.m.d(j16, null), false, 0, null, null, arrayList10, f210, null, null, f47, pVar12 != null ? (Float) pVar12.f128594a : null, e0Var, true, null, 17200));
                                                List listC = w.c(h0.m0(arrayList10));
                                                o13.p pVar13 = (o13.p) h0.d0(list2);
                                                Float f48 = pVar13 != null ? (Float) pVar13.f128594a : null;
                                                o13.p pVar14 = (o13.p) h0.n0(list2);
                                                c0.e(fVar2, f37, new m92.m.d(j16, null), true, 4, null, d0.a(j16), listC, f210, null, null, f48, pVar14 != null ? (Float) pVar14.f128594a : null, e0Var, true, null, 17168);
                                                fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, -f28, -f29);
                                            } catch (Throwable th4) {
                                                th = th4;
                                                fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, -f28, -f29);
                                                throw th;
                                            }
                                        } catch (Throwable th5) {
                                            th = th5;
                                            fVar2 = fVar3;
                                        }
                                    } catch (Throwable th6) {
                                        th = th6;
                                        fVar2 = fVar3;
                                        f28 = f35;
                                        f29 = f34;
                                    }
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        f19 = f18;
                        m1Var = m1Var;
                        r113.K(obj4);
                        r18 = r113;
                    }
                    u1.n.b(rVarC6, (e23.l) obj4, r18, 0);
                    r18.g0(true);
                    if (qVar != null) {
                        r18.C(-1465602610);
                        map = (Map) p1Var2.getF182175a();
                        if (map == null) {
                            r18.C(1810959347);
                            r18.g0(false);
                        } else {
                            r18.C(1810959348);
                            cVar = (n4.c) p1Var3.getF182175a();
                            if (cVar == null) {
                                r18.C(1673296997);
                                r18.g0(false);
                            } else {
                                r18.C(1673296998);
                                m92.y.c(map, cVar.f123544a, m1Var.getFloatValue(), f19, qVar, null, r18, 24576, 32);
                                r18.g0(false);
                            }
                            r18.g0(false);
                        }
                        r18.g0(false);
                    } else {
                        r18.C(1811186578);
                        r18.g0(false);
                    }
                    r18.g0(true);
                    r18.g0(true);
                    x1 x1Var4 = p3.n.f135158a;
                    str2 = str3;
                    r14 = r18;
                }
                fX2 = (float) r15;
                float f28 = fX2;
                if (nVar != null) {
                    E.C(1128521794);
                    fX3 = w02.b0.x(E, i16 / 2);
                    E.g0(r15);
                } else {
                    E.C(1128522300);
                    E.g0(r15);
                    fX3 = (float) r15;
                }
                r rVarC7 = l.C(rVarB2, f28, f26, fX3, 0.0f, 8);
                int i2110 = (E.h(z16) ? 1 : 0) | (E.r(q0VarA) ? 1 : 0);
                if ((i24 & 7168) != 2048) {
                    r16 = r15;
                } else {
                    r16 = 1;
                }
                int i2111 = ((((i2110 | r16) == true ? 1 : 0) | (E.r(list) ? 1 : 0)) | (E.i(f18) ? 1 : 0) ? 1 : 0) | (E.i(fG) ? 1 : 0);
                if ((i24 & 112) != 32) {
                    r17 = 1;
                } else {
                    r17 = 1;
                }
                boolean z111 = ((i2111 | r17) == true ? 1 : 0) | (E.l(jE) ? 1 : 0) | (E.r(arrayList) ? 1 : 0);
                if ((i15 & 29360128) == 8388608) {
                    c14 = 1;
                } else {
                    c14 = 0;
                }
                int i2112 = (z111 ? 1 : 0) | c14 | (E.r(arrayList3) ? 1 : 0);
                bVar4 = bVar3;
                int i2113 = (i2112 == true ? 1 : 0) | (E.r(bVar4) ? 1 : 0);
                if ((i15 & 1879048192) == 536870912) {
                    i17 = 1;
                } else {
                    i17 = 0;
                }
                int i2114 = i2113 | i17;
                if ((i24 & 14) == 4) {
                    i18 = 1;
                } else {
                    i18 = 0;
                }
                z17 = (((((i2114 | i18) | (E.r(arrayList5) ? 1 : 0)) == true ? 1 : 0) | (E.l(jB) ? 1 : 0)) | (E.r(arrayList4) ? 1 : 0) ? 1 : 0) | (E.l(jF) ? 1 : 0) | (E.r(arrayList2) ? 1 : 0);
                Object objQ8 = E.q();
                if (z17) {
                    ?? r114 = E;
                    obj4 = new e23.l() { // from class: vc1.a
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // e23.l
                        public final Object invoke(Object obj5) throws Throwable {
                            q4.f fVar2;
                            float f29;
                            float f210;
                            q0 q0Var = q0VarA;
                            long j8 = q0Var.f157282c;
                            long j14 = jE;
                            ArrayList arrayList6 = arrayList;
                            Float f211 = f14;
                            ArrayList arrayList7 = arrayList3;
                            m92.m.b bVar7 = bVar4;
                            Float f212 = f15;
                            Float f213 = f16;
                            ArrayList arrayList8 = arrayList5;
                            long j15 = jB;
                            ArrayList arrayList9 = arrayList4;
                            long j16 = jF;
                            ArrayList arrayList10 = arrayList2;
                            p1 p1Var4 = p1Var2;
                            q4.f fVar3 = (q4.f) obj5;
                            fVar3.getClass();
                            if (z16) {
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (n4.h.b(fVar3.b()) >> 32)) - (((int) (j8 >> 32)) / 2);
                                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (n4.h.b(fVar3.b()) & 4294967295L)) - (((int) (j8 & 4294967295L)) / 2);
                                long jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
                                long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L;
                                n4.c.a aVar5 = n4.c.f123541b;
                                v0.b(fVar3, q0Var, 0L, jFloatToRawIntBits2 | (jFloatToRawIntBits << 32), 250);
                            } else {
                                p pVar2 = pVar;
                                List<o13.p<Float, String>> list2 = list;
                                float f34 = f18;
                                float f35 = fG;
                                m1 m1Var2 = m1Var;
                                if (pVar2 != null) {
                                    float f36 = pVar2.a(fVar3, list2, j0.f134944a, f34).f125077a + f35;
                                    d92.b.f58623a.getClass();
                                    d92.b.f58625c.getClass();
                                    m1Var2.i(f36 + j92.b.f97899b.f97921f);
                                }
                                n nVar2 = nVar;
                                if (nVar2 != null) {
                                    float floatValue = m1Var2.getFloatValue();
                                    fVar3.getF142543b().f142550a.e(floatValue, 0.0f, f35, 0.0f);
                                    try {
                                        nVar2.a(fVar3, f34);
                                        fVar3.getF142543b().f142550a.e(-floatValue, -0.0f, -f35, -0.0f);
                                    } catch (Throwable th3) {
                                        fVar3.getF142543b().f142550a.e(-floatValue, -0.0f, -f35, -0.0f);
                                        throw th3;
                                    }
                                }
                                float floatValue2 = m1Var2.getFloatValue();
                                fVar3.getF142543b().f142550a.e(floatValue2, 0.0f, f35, f34);
                                float f37 = 1;
                                try {
                                    g6.f.a aVar6 = g6.f.f75994b;
                                    o13.p pVar3 = (o13.p) h0.d0(list2);
                                    Float f38 = pVar3 != null ? (Float) pVar3.f128594a : null;
                                    o13.p pVar4 = (o13.p) h0.n0(list2);
                                    Float f39 = pVar4 != null ? (Float) pVar4.f128594a : null;
                                    m92.m.d dVar = new m92.m.d(j14, null);
                                    m92.e0 e0Var = m92.e0.LINEAR;
                                    g1.f128855a.getClass();
                                    f29 = f35;
                                    f210 = f34;
                                    try {
                                        c0.e(fVar3, f37, dVar, false, 0.0f, null, null, arrayList6, f211, null, null, f38, f39, e0Var, true, g1.a.a(0.0f, new float[]{8.0f, 8.0f}), 824);
                                        fVar2 = fVar3;
                                        try {
                                            m0 m0Var = new m0(i53.a.e(arrayList7), (d0) null, bVar7, (g6.f) null, 10, (p005kotlin.jvm.internal.j) null);
                                            o13.p pVar5 = (o13.p) h0.d0(list2);
                                            Float f44 = pVar5 != null ? (Float) pVar5.f128594a : null;
                                            o13.p pVar6 = (o13.p) h0.n0(list2);
                                            n0.d(fVar2, m0Var, null, f212, f213, f44, pVar6 != null ? (Float) pVar6.f128594a : null, null, 194);
                                            m0 m0Var2 = new m0(i53.a.e(arrayList8), (d0) null, bVar7, (g6.f) null, 10, (p005kotlin.jvm.internal.j) null);
                                            o13.p pVar7 = (o13.p) h0.d0(list2);
                                            Float f45 = pVar7 != null ? (Float) pVar7.f128594a : null;
                                            o13.p pVar8 = (o13.p) h0.n0(list2);
                                            n0.d(fVar2, m0Var2, null, f212, f213, f45, pVar8 != null ? (Float) pVar8.f128594a : null, null, 194);
                                            o13.p pVar9 = (o13.p) h0.d0(list2);
                                            Float f46 = pVar9 != null ? (Float) pVar9.f128594a : null;
                                            o13.p pVar10 = (o13.p) h0.n0(list2);
                                            c0.e(fVar2, f37, new m92.m.d(j15, null), false, 0.0f, null, null, arrayList9, f211, null, null, f46, pVar10 != null ? (Float) pVar10.f128594a : null, e0Var, false, null, 17208);
                                            o13.p pVar11 = (o13.p) h0.d0(list2);
                                            Float f47 = pVar11 != null ? (Float) pVar11.f128594a : null;
                                            o13.p pVar12 = (o13.p) h0.n0(list2);
                                            p1Var4.setValue(c0.e(fVar2, f37, new m92.m.d(j16, null), false, 0, null, null, arrayList10, f211, null, null, f47, pVar12 != null ? (Float) pVar12.f128594a : null, e0Var, true, null, 17200));
                                            List listC = w.c(h0.m0(arrayList10));
                                            o13.p pVar13 = (o13.p) h0.d0(list2);
                                            Float f48 = pVar13 != null ? (Float) pVar13.f128594a : null;
                                            o13.p pVar14 = (o13.p) h0.n0(list2);
                                            c0.e(fVar2, f37, new m92.m.d(j16, null), true, 4, null, d0.a(j16), listC, f211, null, null, f48, pVar14 != null ? (Float) pVar14.f128594a : null, e0Var, true, null, 17168);
                                            fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, -f29, -f210);
                                        } catch (Throwable th4) {
                                            th = th4;
                                            fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, -f29, -f210);
                                            throw th;
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        fVar2 = fVar3;
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    fVar2 = fVar3;
                                    f29 = f35;
                                    f210 = f34;
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    f19 = f18;
                    m1Var = m1Var;
                    r114.K(obj4);
                    r18 = r114;
                } else {
                    ?? r115 = E;
                    obj4 = new e23.l() { // from class: vc1.a
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // e23.l
                        public final Object invoke(Object obj5) throws Throwable {
                            q4.f fVar2;
                            float f29;
                            float f210;
                            q0 q0Var = q0VarA;
                            long j8 = q0Var.f157282c;
                            long j14 = jE;
                            ArrayList arrayList6 = arrayList;
                            Float f211 = f14;
                            ArrayList arrayList7 = arrayList3;
                            m92.m.b bVar7 = bVar4;
                            Float f212 = f15;
                            Float f213 = f16;
                            ArrayList arrayList8 = arrayList5;
                            long j15 = jB;
                            ArrayList arrayList9 = arrayList4;
                            long j16 = jF;
                            ArrayList arrayList10 = arrayList2;
                            p1 p1Var4 = p1Var2;
                            q4.f fVar3 = (q4.f) obj5;
                            fVar3.getClass();
                            if (z16) {
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (n4.h.b(fVar3.b()) >> 32)) - (((int) (j8 >> 32)) / 2);
                                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (n4.h.b(fVar3.b()) & 4294967295L)) - (((int) (j8 & 4294967295L)) / 2);
                                long jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
                                long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L;
                                n4.c.a aVar5 = n4.c.f123541b;
                                v0.b(fVar3, q0Var, 0L, jFloatToRawIntBits2 | (jFloatToRawIntBits << 32), 250);
                            } else {
                                p pVar2 = pVar;
                                List<o13.p<Float, String>> list2 = list;
                                float f34 = f18;
                                float f35 = fG;
                                m1 m1Var2 = m1Var;
                                if (pVar2 != null) {
                                    float f36 = pVar2.a(fVar3, list2, j0.f134944a, f34).f125077a + f35;
                                    d92.b.f58623a.getClass();
                                    d92.b.f58625c.getClass();
                                    m1Var2.i(f36 + j92.b.f97899b.f97921f);
                                }
                                n nVar2 = nVar;
                                if (nVar2 != null) {
                                    float floatValue = m1Var2.getFloatValue();
                                    fVar3.getF142543b().f142550a.e(floatValue, 0.0f, f35, 0.0f);
                                    try {
                                        nVar2.a(fVar3, f34);
                                        fVar3.getF142543b().f142550a.e(-floatValue, -0.0f, -f35, -0.0f);
                                    } catch (Throwable th3) {
                                        fVar3.getF142543b().f142550a.e(-floatValue, -0.0f, -f35, -0.0f);
                                        throw th3;
                                    }
                                }
                                float floatValue2 = m1Var2.getFloatValue();
                                fVar3.getF142543b().f142550a.e(floatValue2, 0.0f, f35, f34);
                                float f37 = 1;
                                try {
                                    g6.f.a aVar6 = g6.f.f75994b;
                                    o13.p pVar3 = (o13.p) h0.d0(list2);
                                    Float f38 = pVar3 != null ? (Float) pVar3.f128594a : null;
                                    o13.p pVar4 = (o13.p) h0.n0(list2);
                                    Float f39 = pVar4 != null ? (Float) pVar4.f128594a : null;
                                    m92.m.d dVar = new m92.m.d(j14, null);
                                    m92.e0 e0Var = m92.e0.LINEAR;
                                    g1.f128855a.getClass();
                                    f29 = f35;
                                    f210 = f34;
                                    try {
                                        c0.e(fVar3, f37, dVar, false, 0.0f, null, null, arrayList6, f211, null, null, f38, f39, e0Var, true, g1.a.a(0.0f, new float[]{8.0f, 8.0f}), 824);
                                        fVar2 = fVar3;
                                        try {
                                            m0 m0Var = new m0(i53.a.e(arrayList7), (d0) null, bVar7, (g6.f) null, 10, (p005kotlin.jvm.internal.j) null);
                                            o13.p pVar5 = (o13.p) h0.d0(list2);
                                            Float f44 = pVar5 != null ? (Float) pVar5.f128594a : null;
                                            o13.p pVar6 = (o13.p) h0.n0(list2);
                                            n0.d(fVar2, m0Var, null, f212, f213, f44, pVar6 != null ? (Float) pVar6.f128594a : null, null, 194);
                                            m0 m0Var2 = new m0(i53.a.e(arrayList8), (d0) null, bVar7, (g6.f) null, 10, (p005kotlin.jvm.internal.j) null);
                                            o13.p pVar7 = (o13.p) h0.d0(list2);
                                            Float f45 = pVar7 != null ? (Float) pVar7.f128594a : null;
                                            o13.p pVar8 = (o13.p) h0.n0(list2);
                                            n0.d(fVar2, m0Var2, null, f212, f213, f45, pVar8 != null ? (Float) pVar8.f128594a : null, null, 194);
                                            o13.p pVar9 = (o13.p) h0.d0(list2);
                                            Float f46 = pVar9 != null ? (Float) pVar9.f128594a : null;
                                            o13.p pVar10 = (o13.p) h0.n0(list2);
                                            c0.e(fVar2, f37, new m92.m.d(j15, null), false, 0.0f, null, null, arrayList9, f211, null, null, f46, pVar10 != null ? (Float) pVar10.f128594a : null, e0Var, false, null, 17208);
                                            o13.p pVar11 = (o13.p) h0.d0(list2);
                                            Float f47 = pVar11 != null ? (Float) pVar11.f128594a : null;
                                            o13.p pVar12 = (o13.p) h0.n0(list2);
                                            p1Var4.setValue(c0.e(fVar2, f37, new m92.m.d(j16, null), false, 0, null, null, arrayList10, f211, null, null, f47, pVar12 != null ? (Float) pVar12.f128594a : null, e0Var, true, null, 17200));
                                            List listC = w.c(h0.m0(arrayList10));
                                            o13.p pVar13 = (o13.p) h0.d0(list2);
                                            Float f48 = pVar13 != null ? (Float) pVar13.f128594a : null;
                                            o13.p pVar14 = (o13.p) h0.n0(list2);
                                            c0.e(fVar2, f37, new m92.m.d(j16, null), true, 4, null, d0.a(j16), listC, f211, null, null, f48, pVar14 != null ? (Float) pVar14.f128594a : null, e0Var, true, null, 17168);
                                            fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, -f29, -f210);
                                        } catch (Throwable th4) {
                                            th = th4;
                                            fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, -f29, -f210);
                                            throw th;
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        fVar2 = fVar3;
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    fVar2 = fVar3;
                                    f29 = f35;
                                    f210 = f34;
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    f19 = f18;
                    m1Var = m1Var;
                    r115.K(obj4);
                    r18 = r115;
                }
                u1.n.b(rVarC7, (e23.l) obj4, r18, 0);
                r18.g0(true);
                if (qVar != null) {
                    r18.C(-1465602610);
                    map = (Map) p1Var2.getF182175a();
                    if (map == null) {
                        r18.C(1810959347);
                        r18.g0(false);
                    } else {
                        r18.C(1810959348);
                        cVar = (n4.c) p1Var3.getF182175a();
                        if (cVar == null) {
                            r18.C(1673296997);
                            r18.g0(false);
                        } else {
                            r18.C(1673296998);
                            m92.y.c(map, cVar.f123544a, m1Var.getFloatValue(), f19, qVar, null, r18, 24576, 32);
                            r18.g0(false);
                        }
                        r18.g0(false);
                    }
                    r18.g0(false);
                } else {
                    r18.C(1811186578);
                    r18.g0(false);
                }
                r18.g0(true);
                r18.g0(true);
                x1 x1Var5 = p3.n.f135158a;
                str2 = str3;
                r14 = r18;
            }
            if (s0Var == null) {
                E.C(-1630019423);
                s0 s0Var4 = new s0((w5.q.b) E.A(t1.f91493k), new g6.d(((g6.c) E.A(t1.f91490h)).getF75991a(), 1.0f), (g6.o) E.A(t1.f91496n), 0, 8, null);
                E.g0(false);
                s0Var2 = s0Var4;
            } else {
                E.C(-1630021345);
                E.g0(false);
                s0Var2 = s0Var;
            }
            if (nVar != null) {
                x0VarF = nVar.f125092b;
            } else if (pVar != null) {
                x0VarF = pVar.f125098b;
            } else {
                x0VarF = null;
            }
            if (x0VarF == null) {
                E.C(-1630009444);
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                x0VarF = d92.c.f(j92.f.f97935l, E);
                z14 = false;
            } else {
                z14 = false;
                E.C(-1630011397);
            }
            E.g0(z14);
            q0VarA = s0.a(s0Var2, strQ, x0VarF, 0L, 1020);
            str3 = strQ;
            i16 = (int) (q0VarA.f157282c & 4294967295L);
            if (!arrayList4.isEmpty()) {
                z15 = false;
            } else {
                z15 = false;
            }
            objQ = E.q();
            m.f135153a.getClass();
            c2565a = m.a.f135155b;
            obj = objQ;
            if (objQ == c2565a) {
                c2 c2VarN3 = p0.n(null);
                E.K(c2VarN3);
                obj = c2VarN3;
            }
            p1Var = (p1) obj;
            objQ2 = E.q();
            obj2 = objQ2;
            if (objQ2 == c2565a) {
                c2 c2VarN4 = p0.n(null);
                E.K(c2VarN4);
                obj2 = c2VarN4;
            }
            p1Var2 = (p1) obj2;
            objQ3 = E.q();
            objO = objQ3;
            if (objQ3 == c2565a) {
                objO = n23.j.o(fG, E);
            }
            m1Var = (m1) objO;
            if (nVar != null) {
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                f17 = (2 * i16) + j92.b.f97899b.f97918c;
            } else {
                f17 = 0.0f;
            }
            if (oVar != null) {
                listA = j0.f134944a;
            } else {
                listA = j0.f134944a;
            }
            gl.c.f77766a.getClass();
            jE = gl.c.a(E).e();
            jF = gl.c.a(E).f();
            jB = gl.c.a(E).b();
            f18 = f17;
            List listK2 = x.k(new o13.p(Float.valueOf(0.0f), d0.a(d0.c(0.25f, jB, 14))), new o13.p(Float.valueOf((float) r0), d0.a(d0.c(0.6f, jB, 14))));
            u1.f129010b.getClass();
            bVar = new m92.m.b(listK2, u1.f129011c, null);
            j.f22691a.getClass();
            kVar = j.f22694d;
            h4.d.f81522a.getClass();
            aVar = h4.d.a.f81536n;
            zVarA = c2.y.a(kVar, aVar, E, 0);
            iHashCode = Long.hashCode(E.U);
            i2VarA0 = E.a0();
            rVarC = k.c(rVar, E);
            h5.g.V.getClass();
            aVar2 = h5.g.a.f81805b;
            if (cVar2 != null) {
                p0.l();
                throw null;
            }
            E.z();
            if (E.T) {
                E.M(aVar2);
            } else {
                E.c();
            }
            eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA, E);
            c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, E);
            bVar2 = h5.g.a.f81813j;
            if (E.T) {
                bVar3 = bVar;
                if (!s.g(E.q(), Integer.valueOf(iHashCode))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC, E);
                b0Var = b0.f22601a;
                aVar3 = r.S;
                list = listA;
                r rVarA5 = b0Var.a(aVar3, 1.0f, true);
                z0VarD = c2.q.d(h4.d.a.f81524b, false);
                z16 = z15;
                iHashCode2 = Long.hashCode(E.U);
                i2VarA1 = E.a0();
                rVarC2 = k.c(rVarA5, E);
                if (cVar2 != null) {
                    p0.l();
                    throw null;
                }
                E.z();
                if (E.T) {
                    E.M(aVar2);
                } else {
                    E.c();
                }
                b4.c(eVar, z0VarD, E);
                b4.c(c1623g, i2VarA1, E);
                if (E.T) {
                    v.h.A(iHashCode2, E, iHashCode2, bVar2);
                } else {
                    v.h.A(iHashCode2, E, iHashCode2, bVar2);
                }
                b4.c(fVar, rVarC2, E);
                u uVar3 = u.f22885a;
                r rVarD3 = x2.d(aVar3, 1.0f);
                zVarA2 = c2.y.a(kVar, aVar, E, 0);
                iHashCode3 = Long.hashCode(E.U);
                i2VarA2 = E.a0();
                rVarC3 = k.c(rVarD3, E);
                if (cVar2 != null) {
                    p0.l();
                    throw null;
                }
                E.z();
                if (E.T) {
                    E.M(aVar2);
                } else {
                    E.c();
                }
                b4.c(eVar, zVarA2, E);
                b4.c(c1623g, i2VarA2, E);
                if (E.T) {
                    v.h.A(iHashCode3, E, iHashCode3, bVar2);
                } else {
                    v.h.A(iHashCode3, E, iHashCode3, bVar2);
                }
                b4.c(fVar, rVarC3, E);
                r rVarA6 = b0Var.a(x2.f(aVar3, 1.0f), 1.0f, true);
                Unit unit3 = Unit.INSTANCE;
                objQ4 = E.q();
                if (objQ4 == c2565a) {
                    p1Var3 = p1Var;
                    b bVar7 = new b(p1Var3);
                    E.K(bVar7);
                    obj3 = bVar7;
                } else {
                    p1Var3 = p1Var;
                    obj3 = objQ4;
                }
                r rVarB3 = b5.s0.b(rVarA6, unit3, (PointerInputEventHandler) obj3);
                if (pVar != null) {
                    E.C(1128507362);
                    fX = w02.b0.x(E, i16 / 2);
                    r15 = 0;
                    E.g0(false);
                } else {
                    r15 = 0;
                    E.C(1128507868);
                    E.g0(false);
                    fX = 0;
                }
                float f29 = fX;
                if (pVar != null) {
                    E.C(624074052);
                    E.g0(r15);
                } else {
                    if (nVar != null) {
                        E.C(624175267);
                        fX2 = w02.b0.x(E, i16 / 2);
                        E.g0(r15);
                    } else {
                        E.C(624280388);
                        E.g0(r15);
                    }
                    float f210 = fX2;
                    if (nVar != null) {
                        E.C(1128521794);
                        fX3 = w02.b0.x(E, i16 / 2);
                        E.g0(r15);
                    } else {
                        E.C(1128522300);
                        E.g0(r15);
                        fX3 = (float) r15;
                    }
                    r rVarC8 = l.C(rVarB3, f210, f29, fX3, 0.0f, 8);
                    int i2115 = (E.h(z16) ? 1 : 0) | (E.r(q0VarA) ? 1 : 0);
                    if ((i24 & 7168) != 2048) {
                        r16 = r15;
                    } else {
                        r16 = 1;
                    }
                    int i2116 = ((((i2115 | r16) == true ? 1 : 0) | (E.r(list) ? 1 : 0)) | (E.i(f18) ? 1 : 0) ? 1 : 0) | (E.i(fG) ? 1 : 0);
                    if ((i24 & 112) != 32) {
                        r17 = 1;
                    } else {
                        r17 = 1;
                    }
                    boolean z112 = ((i2116 | r17) == true ? 1 : 0) | (E.l(jE) ? 1 : 0) | (E.r(arrayList) ? 1 : 0);
                    if ((i15 & 29360128) == 8388608) {
                        c14 = 1;
                    } else {
                        c14 = 0;
                    }
                    int i2117 = (z112 ? 1 : 0) | c14 | (E.r(arrayList3) ? 1 : 0);
                    bVar4 = bVar3;
                    int i2118 = (i2117 == true ? 1 : 0) | (E.r(bVar4) ? 1 : 0);
                    if ((i15 & 1879048192) == 536870912) {
                        i17 = 1;
                    } else {
                        i17 = 0;
                    }
                    int i2119 = i2118 | i17;
                    if ((i24 & 14) == 4) {
                        i18 = 1;
                    } else {
                        i18 = 0;
                    }
                    z17 = (((((i2119 | i18) | (E.r(arrayList5) ? 1 : 0)) == true ? 1 : 0) | (E.l(jB) ? 1 : 0)) | (E.r(arrayList4) ? 1 : 0) ? 1 : 0) | (E.l(jF) ? 1 : 0) | (E.r(arrayList2) ? 1 : 0);
                    Object objQ9 = E.q();
                    if (z17) {
                        ?? r116 = E;
                        obj4 = new e23.l() { // from class: vc1.a
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // e23.l
                            public final Object invoke(Object obj5) throws Throwable {
                                q4.f fVar2;
                                float f211;
                                float f212;
                                q0 q0Var = q0VarA;
                                long j8 = q0Var.f157282c;
                                long j14 = jE;
                                ArrayList arrayList6 = arrayList;
                                Float f213 = f14;
                                ArrayList arrayList7 = arrayList3;
                                m92.m.b bVar8 = bVar4;
                                Float f214 = f15;
                                Float f215 = f16;
                                ArrayList arrayList8 = arrayList5;
                                long j15 = jB;
                                ArrayList arrayList9 = arrayList4;
                                long j16 = jF;
                                ArrayList arrayList10 = arrayList2;
                                p1 p1Var4 = p1Var2;
                                q4.f fVar3 = (q4.f) obj5;
                                fVar3.getClass();
                                if (z16) {
                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (n4.h.b(fVar3.b()) >> 32)) - (((int) (j8 >> 32)) / 2);
                                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (n4.h.b(fVar3.b()) & 4294967295L)) - (((int) (j8 & 4294967295L)) / 2);
                                    long jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
                                    long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L;
                                    n4.c.a aVar5 = n4.c.f123541b;
                                    v0.b(fVar3, q0Var, 0L, jFloatToRawIntBits2 | (jFloatToRawIntBits << 32), 250);
                                } else {
                                    p pVar2 = pVar;
                                    List<o13.p<Float, String>> list2 = list;
                                    float f34 = f18;
                                    float f35 = fG;
                                    m1 m1Var2 = m1Var;
                                    if (pVar2 != null) {
                                        float f36 = pVar2.a(fVar3, list2, j0.f134944a, f34).f125077a + f35;
                                        d92.b.f58623a.getClass();
                                        d92.b.f58625c.getClass();
                                        m1Var2.i(f36 + j92.b.f97899b.f97921f);
                                    }
                                    n nVar2 = nVar;
                                    if (nVar2 != null) {
                                        float floatValue = m1Var2.getFloatValue();
                                        fVar3.getF142543b().f142550a.e(floatValue, 0.0f, f35, 0.0f);
                                        try {
                                            nVar2.a(fVar3, f34);
                                            fVar3.getF142543b().f142550a.e(-floatValue, -0.0f, -f35, -0.0f);
                                        } catch (Throwable th3) {
                                            fVar3.getF142543b().f142550a.e(-floatValue, -0.0f, -f35, -0.0f);
                                            throw th3;
                                        }
                                    }
                                    float floatValue2 = m1Var2.getFloatValue();
                                    fVar3.getF142543b().f142550a.e(floatValue2, 0.0f, f35, f34);
                                    float f37 = 1;
                                    try {
                                        g6.f.a aVar6 = g6.f.f75994b;
                                        o13.p pVar3 = (o13.p) h0.d0(list2);
                                        Float f38 = pVar3 != null ? (Float) pVar3.f128594a : null;
                                        o13.p pVar4 = (o13.p) h0.n0(list2);
                                        Float f39 = pVar4 != null ? (Float) pVar4.f128594a : null;
                                        m92.m.d dVar = new m92.m.d(j14, null);
                                        m92.e0 e0Var = m92.e0.LINEAR;
                                        g1.f128855a.getClass();
                                        f211 = f35;
                                        f212 = f34;
                                        try {
                                            c0.e(fVar3, f37, dVar, false, 0.0f, null, null, arrayList6, f213, null, null, f38, f39, e0Var, true, g1.a.a(0.0f, new float[]{8.0f, 8.0f}), 824);
                                            fVar2 = fVar3;
                                            try {
                                                m0 m0Var = new m0(i53.a.e(arrayList7), (d0) null, bVar8, (g6.f) null, 10, (p005kotlin.jvm.internal.j) null);
                                                o13.p pVar5 = (o13.p) h0.d0(list2);
                                                Float f44 = pVar5 != null ? (Float) pVar5.f128594a : null;
                                                o13.p pVar6 = (o13.p) h0.n0(list2);
                                                n0.d(fVar2, m0Var, null, f214, f215, f44, pVar6 != null ? (Float) pVar6.f128594a : null, null, 194);
                                                m0 m0Var2 = new m0(i53.a.e(arrayList8), (d0) null, bVar8, (g6.f) null, 10, (p005kotlin.jvm.internal.j) null);
                                                o13.p pVar7 = (o13.p) h0.d0(list2);
                                                Float f45 = pVar7 != null ? (Float) pVar7.f128594a : null;
                                                o13.p pVar8 = (o13.p) h0.n0(list2);
                                                n0.d(fVar2, m0Var2, null, f214, f215, f45, pVar8 != null ? (Float) pVar8.f128594a : null, null, 194);
                                                o13.p pVar9 = (o13.p) h0.d0(list2);
                                                Float f46 = pVar9 != null ? (Float) pVar9.f128594a : null;
                                                o13.p pVar10 = (o13.p) h0.n0(list2);
                                                c0.e(fVar2, f37, new m92.m.d(j15, null), false, 0.0f, null, null, arrayList9, f213, null, null, f46, pVar10 != null ? (Float) pVar10.f128594a : null, e0Var, false, null, 17208);
                                                o13.p pVar11 = (o13.p) h0.d0(list2);
                                                Float f47 = pVar11 != null ? (Float) pVar11.f128594a : null;
                                                o13.p pVar12 = (o13.p) h0.n0(list2);
                                                p1Var4.setValue(c0.e(fVar2, f37, new m92.m.d(j16, null), false, 0, null, null, arrayList10, f213, null, null, f47, pVar12 != null ? (Float) pVar12.f128594a : null, e0Var, true, null, 17200));
                                                List listC = w.c(h0.m0(arrayList10));
                                                o13.p pVar13 = (o13.p) h0.d0(list2);
                                                Float f48 = pVar13 != null ? (Float) pVar13.f128594a : null;
                                                o13.p pVar14 = (o13.p) h0.n0(list2);
                                                c0.e(fVar2, f37, new m92.m.d(j16, null), true, 4, null, d0.a(j16), listC, f213, null, null, f48, pVar14 != null ? (Float) pVar14.f128594a : null, e0Var, true, null, 17168);
                                                fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, -f211, -f212);
                                            } catch (Throwable th4) {
                                                th = th4;
                                                fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, -f211, -f212);
                                                throw th;
                                            }
                                        } catch (Throwable th5) {
                                            th = th5;
                                            fVar2 = fVar3;
                                        }
                                    } catch (Throwable th6) {
                                        th = th6;
                                        fVar2 = fVar3;
                                        f211 = f35;
                                        f212 = f34;
                                    }
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        f19 = f18;
                        m1Var = m1Var;
                        r116.K(obj4);
                        r18 = r116;
                    } else {
                        ?? r117 = E;
                        obj4 = new e23.l() { // from class: vc1.a
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // e23.l
                            public final Object invoke(Object obj5) throws Throwable {
                                q4.f fVar2;
                                float f211;
                                float f212;
                                q0 q0Var = q0VarA;
                                long j8 = q0Var.f157282c;
                                long j14 = jE;
                                ArrayList arrayList6 = arrayList;
                                Float f213 = f14;
                                ArrayList arrayList7 = arrayList3;
                                m92.m.b bVar8 = bVar4;
                                Float f214 = f15;
                                Float f215 = f16;
                                ArrayList arrayList8 = arrayList5;
                                long j15 = jB;
                                ArrayList arrayList9 = arrayList4;
                                long j16 = jF;
                                ArrayList arrayList10 = arrayList2;
                                p1 p1Var4 = p1Var2;
                                q4.f fVar3 = (q4.f) obj5;
                                fVar3.getClass();
                                if (z16) {
                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (n4.h.b(fVar3.b()) >> 32)) - (((int) (j8 >> 32)) / 2);
                                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (n4.h.b(fVar3.b()) & 4294967295L)) - (((int) (j8 & 4294967295L)) / 2);
                                    long jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
                                    long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L;
                                    n4.c.a aVar5 = n4.c.f123541b;
                                    v0.b(fVar3, q0Var, 0L, jFloatToRawIntBits2 | (jFloatToRawIntBits << 32), 250);
                                } else {
                                    p pVar2 = pVar;
                                    List<o13.p<Float, String>> list2 = list;
                                    float f34 = f18;
                                    float f35 = fG;
                                    m1 m1Var2 = m1Var;
                                    if (pVar2 != null) {
                                        float f36 = pVar2.a(fVar3, list2, j0.f134944a, f34).f125077a + f35;
                                        d92.b.f58623a.getClass();
                                        d92.b.f58625c.getClass();
                                        m1Var2.i(f36 + j92.b.f97899b.f97921f);
                                    }
                                    n nVar2 = nVar;
                                    if (nVar2 != null) {
                                        float floatValue = m1Var2.getFloatValue();
                                        fVar3.getF142543b().f142550a.e(floatValue, 0.0f, f35, 0.0f);
                                        try {
                                            nVar2.a(fVar3, f34);
                                            fVar3.getF142543b().f142550a.e(-floatValue, -0.0f, -f35, -0.0f);
                                        } catch (Throwable th3) {
                                            fVar3.getF142543b().f142550a.e(-floatValue, -0.0f, -f35, -0.0f);
                                            throw th3;
                                        }
                                    }
                                    float floatValue2 = m1Var2.getFloatValue();
                                    fVar3.getF142543b().f142550a.e(floatValue2, 0.0f, f35, f34);
                                    float f37 = 1;
                                    try {
                                        g6.f.a aVar6 = g6.f.f75994b;
                                        o13.p pVar3 = (o13.p) h0.d0(list2);
                                        Float f38 = pVar3 != null ? (Float) pVar3.f128594a : null;
                                        o13.p pVar4 = (o13.p) h0.n0(list2);
                                        Float f39 = pVar4 != null ? (Float) pVar4.f128594a : null;
                                        m92.m.d dVar = new m92.m.d(j14, null);
                                        m92.e0 e0Var = m92.e0.LINEAR;
                                        g1.f128855a.getClass();
                                        f211 = f35;
                                        f212 = f34;
                                        try {
                                            c0.e(fVar3, f37, dVar, false, 0.0f, null, null, arrayList6, f213, null, null, f38, f39, e0Var, true, g1.a.a(0.0f, new float[]{8.0f, 8.0f}), 824);
                                            fVar2 = fVar3;
                                            try {
                                                m0 m0Var = new m0(i53.a.e(arrayList7), (d0) null, bVar8, (g6.f) null, 10, (p005kotlin.jvm.internal.j) null);
                                                o13.p pVar5 = (o13.p) h0.d0(list2);
                                                Float f44 = pVar5 != null ? (Float) pVar5.f128594a : null;
                                                o13.p pVar6 = (o13.p) h0.n0(list2);
                                                n0.d(fVar2, m0Var, null, f214, f215, f44, pVar6 != null ? (Float) pVar6.f128594a : null, null, 194);
                                                m0 m0Var2 = new m0(i53.a.e(arrayList8), (d0) null, bVar8, (g6.f) null, 10, (p005kotlin.jvm.internal.j) null);
                                                o13.p pVar7 = (o13.p) h0.d0(list2);
                                                Float f45 = pVar7 != null ? (Float) pVar7.f128594a : null;
                                                o13.p pVar8 = (o13.p) h0.n0(list2);
                                                n0.d(fVar2, m0Var2, null, f214, f215, f45, pVar8 != null ? (Float) pVar8.f128594a : null, null, 194);
                                                o13.p pVar9 = (o13.p) h0.d0(list2);
                                                Float f46 = pVar9 != null ? (Float) pVar9.f128594a : null;
                                                o13.p pVar10 = (o13.p) h0.n0(list2);
                                                c0.e(fVar2, f37, new m92.m.d(j15, null), false, 0.0f, null, null, arrayList9, f213, null, null, f46, pVar10 != null ? (Float) pVar10.f128594a : null, e0Var, false, null, 17208);
                                                o13.p pVar11 = (o13.p) h0.d0(list2);
                                                Float f47 = pVar11 != null ? (Float) pVar11.f128594a : null;
                                                o13.p pVar12 = (o13.p) h0.n0(list2);
                                                p1Var4.setValue(c0.e(fVar2, f37, new m92.m.d(j16, null), false, 0, null, null, arrayList10, f213, null, null, f47, pVar12 != null ? (Float) pVar12.f128594a : null, e0Var, true, null, 17200));
                                                List listC = w.c(h0.m0(arrayList10));
                                                o13.p pVar13 = (o13.p) h0.d0(list2);
                                                Float f48 = pVar13 != null ? (Float) pVar13.f128594a : null;
                                                o13.p pVar14 = (o13.p) h0.n0(list2);
                                                c0.e(fVar2, f37, new m92.m.d(j16, null), true, 4, null, d0.a(j16), listC, f213, null, null, f48, pVar14 != null ? (Float) pVar14.f128594a : null, e0Var, true, null, 17168);
                                                fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, -f211, -f212);
                                            } catch (Throwable th4) {
                                                th = th4;
                                                fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, -f211, -f212);
                                                throw th;
                                            }
                                        } catch (Throwable th5) {
                                            th = th5;
                                            fVar2 = fVar3;
                                        }
                                    } catch (Throwable th6) {
                                        th = th6;
                                        fVar2 = fVar3;
                                        f211 = f35;
                                        f212 = f34;
                                    }
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        f19 = f18;
                        m1Var = m1Var;
                        r117.K(obj4);
                        r18 = r117;
                    }
                    u1.n.b(rVarC8, (e23.l) obj4, r18, 0);
                    r18.g0(true);
                    if (qVar != null) {
                        r18.C(-1465602610);
                        map = (Map) p1Var2.getF182175a();
                        if (map == null) {
                            r18.C(1810959347);
                            r18.g0(false);
                        } else {
                            r18.C(1810959348);
                            cVar = (n4.c) p1Var3.getF182175a();
                            if (cVar == null) {
                                r18.C(1673296997);
                                r18.g0(false);
                            } else {
                                r18.C(1673296998);
                                m92.y.c(map, cVar.f123544a, m1Var.getFloatValue(), f19, qVar, null, r18, 24576, 32);
                                r18.g0(false);
                            }
                            r18.g0(false);
                        }
                        r18.g0(false);
                    } else {
                        r18.C(1811186578);
                        r18.g0(false);
                    }
                    r18.g0(true);
                    r18.g0(true);
                    x1 x1Var6 = p3.n.f135158a;
                    str2 = str3;
                    r14 = r18;
                }
                fX2 = (float) r15;
                float f211 = fX2;
                if (nVar != null) {
                    E.C(1128521794);
                    fX3 = w02.b0.x(E, i16 / 2);
                    E.g0(r15);
                } else {
                    E.C(1128522300);
                    E.g0(r15);
                    fX3 = (float) r15;
                }
                r rVarC9 = l.C(rVarB3, f211, f29, fX3, 0.0f, 8);
                int i21110 = (E.h(z16) ? 1 : 0) | (E.r(q0VarA) ? 1 : 0);
                if ((i24 & 7168) != 2048) {
                    r16 = r15;
                } else {
                    r16 = 1;
                }
                int i21111 = ((((i21110 | r16) == true ? 1 : 0) | (E.r(list) ? 1 : 0)) | (E.i(f18) ? 1 : 0) ? 1 : 0) | (E.i(fG) ? 1 : 0);
                if ((i24 & 112) != 32) {
                    r17 = 1;
                } else {
                    r17 = 1;
                }
                boolean z113 = ((i21111 | r17) == true ? 1 : 0) | (E.l(jE) ? 1 : 0) | (E.r(arrayList) ? 1 : 0);
                if ((i15 & 29360128) == 8388608) {
                    c14 = 1;
                } else {
                    c14 = 0;
                }
                int i21112 = (z113 ? 1 : 0) | c14 | (E.r(arrayList3) ? 1 : 0);
                bVar4 = bVar3;
                int i21113 = (i21112 == true ? 1 : 0) | (E.r(bVar4) ? 1 : 0);
                if ((i15 & 1879048192) == 536870912) {
                    i17 = 1;
                } else {
                    i17 = 0;
                }
                int i21114 = i21113 | i17;
                if ((i24 & 14) == 4) {
                    i18 = 1;
                } else {
                    i18 = 0;
                }
                z17 = (((((i21114 | i18) | (E.r(arrayList5) ? 1 : 0)) == true ? 1 : 0) | (E.l(jB) ? 1 : 0)) | (E.r(arrayList4) ? 1 : 0) ? 1 : 0) | (E.l(jF) ? 1 : 0) | (E.r(arrayList2) ? 1 : 0);
                Object objQ10 = E.q();
                if (z17) {
                    ?? r118 = E;
                    obj4 = new e23.l() { // from class: vc1.a
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // e23.l
                        public final Object invoke(Object obj5) throws Throwable {
                            q4.f fVar2;
                            float f212;
                            float f213;
                            q0 q0Var = q0VarA;
                            long j8 = q0Var.f157282c;
                            long j14 = jE;
                            ArrayList arrayList6 = arrayList;
                            Float f214 = f14;
                            ArrayList arrayList7 = arrayList3;
                            m92.m.b bVar8 = bVar4;
                            Float f215 = f15;
                            Float f216 = f16;
                            ArrayList arrayList8 = arrayList5;
                            long j15 = jB;
                            ArrayList arrayList9 = arrayList4;
                            long j16 = jF;
                            ArrayList arrayList10 = arrayList2;
                            p1 p1Var4 = p1Var2;
                            q4.f fVar3 = (q4.f) obj5;
                            fVar3.getClass();
                            if (z16) {
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (n4.h.b(fVar3.b()) >> 32)) - (((int) (j8 >> 32)) / 2);
                                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (n4.h.b(fVar3.b()) & 4294967295L)) - (((int) (j8 & 4294967295L)) / 2);
                                long jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
                                long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L;
                                n4.c.a aVar5 = n4.c.f123541b;
                                v0.b(fVar3, q0Var, 0L, jFloatToRawIntBits2 | (jFloatToRawIntBits << 32), 250);
                            } else {
                                p pVar2 = pVar;
                                List<o13.p<Float, String>> list2 = list;
                                float f34 = f18;
                                float f35 = fG;
                                m1 m1Var2 = m1Var;
                                if (pVar2 != null) {
                                    float f36 = pVar2.a(fVar3, list2, j0.f134944a, f34).f125077a + f35;
                                    d92.b.f58623a.getClass();
                                    d92.b.f58625c.getClass();
                                    m1Var2.i(f36 + j92.b.f97899b.f97921f);
                                }
                                n nVar2 = nVar;
                                if (nVar2 != null) {
                                    float floatValue = m1Var2.getFloatValue();
                                    fVar3.getF142543b().f142550a.e(floatValue, 0.0f, f35, 0.0f);
                                    try {
                                        nVar2.a(fVar3, f34);
                                        fVar3.getF142543b().f142550a.e(-floatValue, -0.0f, -f35, -0.0f);
                                    } catch (Throwable th3) {
                                        fVar3.getF142543b().f142550a.e(-floatValue, -0.0f, -f35, -0.0f);
                                        throw th3;
                                    }
                                }
                                float floatValue2 = m1Var2.getFloatValue();
                                fVar3.getF142543b().f142550a.e(floatValue2, 0.0f, f35, f34);
                                float f37 = 1;
                                try {
                                    g6.f.a aVar6 = g6.f.f75994b;
                                    o13.p pVar3 = (o13.p) h0.d0(list2);
                                    Float f38 = pVar3 != null ? (Float) pVar3.f128594a : null;
                                    o13.p pVar4 = (o13.p) h0.n0(list2);
                                    Float f39 = pVar4 != null ? (Float) pVar4.f128594a : null;
                                    m92.m.d dVar = new m92.m.d(j14, null);
                                    m92.e0 e0Var = m92.e0.LINEAR;
                                    g1.f128855a.getClass();
                                    f212 = f35;
                                    f213 = f34;
                                    try {
                                        c0.e(fVar3, f37, dVar, false, 0.0f, null, null, arrayList6, f214, null, null, f38, f39, e0Var, true, g1.a.a(0.0f, new float[]{8.0f, 8.0f}), 824);
                                        fVar2 = fVar3;
                                        try {
                                            m0 m0Var = new m0(i53.a.e(arrayList7), (d0) null, bVar8, (g6.f) null, 10, (p005kotlin.jvm.internal.j) null);
                                            o13.p pVar5 = (o13.p) h0.d0(list2);
                                            Float f44 = pVar5 != null ? (Float) pVar5.f128594a : null;
                                            o13.p pVar6 = (o13.p) h0.n0(list2);
                                            n0.d(fVar2, m0Var, null, f215, f216, f44, pVar6 != null ? (Float) pVar6.f128594a : null, null, 194);
                                            m0 m0Var2 = new m0(i53.a.e(arrayList8), (d0) null, bVar8, (g6.f) null, 10, (p005kotlin.jvm.internal.j) null);
                                            o13.p pVar7 = (o13.p) h0.d0(list2);
                                            Float f45 = pVar7 != null ? (Float) pVar7.f128594a : null;
                                            o13.p pVar8 = (o13.p) h0.n0(list2);
                                            n0.d(fVar2, m0Var2, null, f215, f216, f45, pVar8 != null ? (Float) pVar8.f128594a : null, null, 194);
                                            o13.p pVar9 = (o13.p) h0.d0(list2);
                                            Float f46 = pVar9 != null ? (Float) pVar9.f128594a : null;
                                            o13.p pVar10 = (o13.p) h0.n0(list2);
                                            c0.e(fVar2, f37, new m92.m.d(j15, null), false, 0.0f, null, null, arrayList9, f214, null, null, f46, pVar10 != null ? (Float) pVar10.f128594a : null, e0Var, false, null, 17208);
                                            o13.p pVar11 = (o13.p) h0.d0(list2);
                                            Float f47 = pVar11 != null ? (Float) pVar11.f128594a : null;
                                            o13.p pVar12 = (o13.p) h0.n0(list2);
                                            p1Var4.setValue(c0.e(fVar2, f37, new m92.m.d(j16, null), false, 0, null, null, arrayList10, f214, null, null, f47, pVar12 != null ? (Float) pVar12.f128594a : null, e0Var, true, null, 17200));
                                            List listC = w.c(h0.m0(arrayList10));
                                            o13.p pVar13 = (o13.p) h0.d0(list2);
                                            Float f48 = pVar13 != null ? (Float) pVar13.f128594a : null;
                                            o13.p pVar14 = (o13.p) h0.n0(list2);
                                            c0.e(fVar2, f37, new m92.m.d(j16, null), true, 4, null, d0.a(j16), listC, f214, null, null, f48, pVar14 != null ? (Float) pVar14.f128594a : null, e0Var, true, null, 17168);
                                            fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, -f212, -f213);
                                        } catch (Throwable th4) {
                                            th = th4;
                                            fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, -f212, -f213);
                                            throw th;
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        fVar2 = fVar3;
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    fVar2 = fVar3;
                                    f212 = f35;
                                    f213 = f34;
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    f19 = f18;
                    m1Var = m1Var;
                    r118.K(obj4);
                    r18 = r118;
                } else {
                    ?? r119 = E;
                    obj4 = new e23.l() { // from class: vc1.a
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // e23.l
                        public final Object invoke(Object obj5) throws Throwable {
                            q4.f fVar2;
                            float f212;
                            float f213;
                            q0 q0Var = q0VarA;
                            long j8 = q0Var.f157282c;
                            long j14 = jE;
                            ArrayList arrayList6 = arrayList;
                            Float f214 = f14;
                            ArrayList arrayList7 = arrayList3;
                            m92.m.b bVar8 = bVar4;
                            Float f215 = f15;
                            Float f216 = f16;
                            ArrayList arrayList8 = arrayList5;
                            long j15 = jB;
                            ArrayList arrayList9 = arrayList4;
                            long j16 = jF;
                            ArrayList arrayList10 = arrayList2;
                            p1 p1Var4 = p1Var2;
                            q4.f fVar3 = (q4.f) obj5;
                            fVar3.getClass();
                            if (z16) {
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (n4.h.b(fVar3.b()) >> 32)) - (((int) (j8 >> 32)) / 2);
                                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (n4.h.b(fVar3.b()) & 4294967295L)) - (((int) (j8 & 4294967295L)) / 2);
                                long jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
                                long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L;
                                n4.c.a aVar5 = n4.c.f123541b;
                                v0.b(fVar3, q0Var, 0L, jFloatToRawIntBits2 | (jFloatToRawIntBits << 32), 250);
                            } else {
                                p pVar2 = pVar;
                                List<o13.p<Float, String>> list2 = list;
                                float f34 = f18;
                                float f35 = fG;
                                m1 m1Var2 = m1Var;
                                if (pVar2 != null) {
                                    float f36 = pVar2.a(fVar3, list2, j0.f134944a, f34).f125077a + f35;
                                    d92.b.f58623a.getClass();
                                    d92.b.f58625c.getClass();
                                    m1Var2.i(f36 + j92.b.f97899b.f97921f);
                                }
                                n nVar2 = nVar;
                                if (nVar2 != null) {
                                    float floatValue = m1Var2.getFloatValue();
                                    fVar3.getF142543b().f142550a.e(floatValue, 0.0f, f35, 0.0f);
                                    try {
                                        nVar2.a(fVar3, f34);
                                        fVar3.getF142543b().f142550a.e(-floatValue, -0.0f, -f35, -0.0f);
                                    } catch (Throwable th3) {
                                        fVar3.getF142543b().f142550a.e(-floatValue, -0.0f, -f35, -0.0f);
                                        throw th3;
                                    }
                                }
                                float floatValue2 = m1Var2.getFloatValue();
                                fVar3.getF142543b().f142550a.e(floatValue2, 0.0f, f35, f34);
                                float f37 = 1;
                                try {
                                    g6.f.a aVar6 = g6.f.f75994b;
                                    o13.p pVar3 = (o13.p) h0.d0(list2);
                                    Float f38 = pVar3 != null ? (Float) pVar3.f128594a : null;
                                    o13.p pVar4 = (o13.p) h0.n0(list2);
                                    Float f39 = pVar4 != null ? (Float) pVar4.f128594a : null;
                                    m92.m.d dVar = new m92.m.d(j14, null);
                                    m92.e0 e0Var = m92.e0.LINEAR;
                                    g1.f128855a.getClass();
                                    f212 = f35;
                                    f213 = f34;
                                    try {
                                        c0.e(fVar3, f37, dVar, false, 0.0f, null, null, arrayList6, f214, null, null, f38, f39, e0Var, true, g1.a.a(0.0f, new float[]{8.0f, 8.0f}), 824);
                                        fVar2 = fVar3;
                                        try {
                                            m0 m0Var = new m0(i53.a.e(arrayList7), (d0) null, bVar8, (g6.f) null, 10, (p005kotlin.jvm.internal.j) null);
                                            o13.p pVar5 = (o13.p) h0.d0(list2);
                                            Float f44 = pVar5 != null ? (Float) pVar5.f128594a : null;
                                            o13.p pVar6 = (o13.p) h0.n0(list2);
                                            n0.d(fVar2, m0Var, null, f215, f216, f44, pVar6 != null ? (Float) pVar6.f128594a : null, null, 194);
                                            m0 m0Var2 = new m0(i53.a.e(arrayList8), (d0) null, bVar8, (g6.f) null, 10, (p005kotlin.jvm.internal.j) null);
                                            o13.p pVar7 = (o13.p) h0.d0(list2);
                                            Float f45 = pVar7 != null ? (Float) pVar7.f128594a : null;
                                            o13.p pVar8 = (o13.p) h0.n0(list2);
                                            n0.d(fVar2, m0Var2, null, f215, f216, f45, pVar8 != null ? (Float) pVar8.f128594a : null, null, 194);
                                            o13.p pVar9 = (o13.p) h0.d0(list2);
                                            Float f46 = pVar9 != null ? (Float) pVar9.f128594a : null;
                                            o13.p pVar10 = (o13.p) h0.n0(list2);
                                            c0.e(fVar2, f37, new m92.m.d(j15, null), false, 0.0f, null, null, arrayList9, f214, null, null, f46, pVar10 != null ? (Float) pVar10.f128594a : null, e0Var, false, null, 17208);
                                            o13.p pVar11 = (o13.p) h0.d0(list2);
                                            Float f47 = pVar11 != null ? (Float) pVar11.f128594a : null;
                                            o13.p pVar12 = (o13.p) h0.n0(list2);
                                            p1Var4.setValue(c0.e(fVar2, f37, new m92.m.d(j16, null), false, 0, null, null, arrayList10, f214, null, null, f47, pVar12 != null ? (Float) pVar12.f128594a : null, e0Var, true, null, 17200));
                                            List listC = w.c(h0.m0(arrayList10));
                                            o13.p pVar13 = (o13.p) h0.d0(list2);
                                            Float f48 = pVar13 != null ? (Float) pVar13.f128594a : null;
                                            o13.p pVar14 = (o13.p) h0.n0(list2);
                                            c0.e(fVar2, f37, new m92.m.d(j16, null), true, 4, null, d0.a(j16), listC, f214, null, null, f48, pVar14 != null ? (Float) pVar14.f128594a : null, e0Var, true, null, 17168);
                                            fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, -f212, -f213);
                                        } catch (Throwable th4) {
                                            th = th4;
                                            fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, -f212, -f213);
                                            throw th;
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        fVar2 = fVar3;
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    fVar2 = fVar3;
                                    f212 = f35;
                                    f213 = f34;
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    f19 = f18;
                    m1Var = m1Var;
                    r119.K(obj4);
                    r18 = r119;
                }
                u1.n.b(rVarC9, (e23.l) obj4, r18, 0);
                r18.g0(true);
                if (qVar != null) {
                    r18.C(-1465602610);
                    map = (Map) p1Var2.getF182175a();
                    if (map == null) {
                        r18.C(1810959347);
                        r18.g0(false);
                    } else {
                        r18.C(1810959348);
                        cVar = (n4.c) p1Var3.getF182175a();
                        if (cVar == null) {
                            r18.C(1673296997);
                            r18.g0(false);
                        } else {
                            r18.C(1673296998);
                            m92.y.c(map, cVar.f123544a, m1Var.getFloatValue(), f19, qVar, null, r18, 24576, 32);
                            r18.g0(false);
                        }
                        r18.g0(false);
                    }
                    r18.g0(false);
                } else {
                    r18.C(1811186578);
                    r18.g0(false);
                }
                r18.g0(true);
                r18.g0(true);
                x1 x1Var7 = p3.n.f135158a;
                str2 = str3;
                r14 = r18;
            } else {
                bVar3 = bVar;
            }
            v.h.A(iHashCode, E, iHashCode, bVar2);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, E);
            b0Var = b0.f22601a;
            aVar3 = r.S;
            list = listA;
            r rVarA7 = b0Var.a(aVar3, 1.0f, true);
            z0VarD = c2.q.d(h4.d.a.f81524b, false);
            z16 = z15;
            iHashCode2 = Long.hashCode(E.U);
            i2VarA1 = E.a0();
            rVarC2 = k.c(rVarA7, E);
            if (cVar2 != null) {
                p0.l();
                throw null;
            }
            E.z();
            if (E.T) {
                E.M(aVar2);
            } else {
                E.c();
            }
            b4.c(eVar, z0VarD, E);
            b4.c(c1623g, i2VarA1, E);
            if (E.T) {
                v.h.A(iHashCode2, E, iHashCode2, bVar2);
            } else {
                v.h.A(iHashCode2, E, iHashCode2, bVar2);
            }
            b4.c(fVar, rVarC2, E);
            u uVar4 = u.f22885a;
            r rVarD4 = x2.d(aVar3, 1.0f);
            zVarA2 = c2.y.a(kVar, aVar, E, 0);
            iHashCode3 = Long.hashCode(E.U);
            i2VarA2 = E.a0();
            rVarC3 = k.c(rVarD4, E);
            if (cVar2 != null) {
                p0.l();
                throw null;
            }
            E.z();
            if (E.T) {
                E.M(aVar2);
            } else {
                E.c();
            }
            b4.c(eVar, zVarA2, E);
            b4.c(c1623g, i2VarA2, E);
            if (E.T) {
                v.h.A(iHashCode3, E, iHashCode3, bVar2);
            } else {
                v.h.A(iHashCode3, E, iHashCode3, bVar2);
            }
            b4.c(fVar, rVarC3, E);
            r rVarA8 = b0Var.a(x2.f(aVar3, 1.0f), 1.0f, true);
            Unit unit4 = Unit.INSTANCE;
            objQ4 = E.q();
            if (objQ4 == c2565a) {
                p1Var3 = p1Var;
                b bVar8 = new b(p1Var3);
                E.K(bVar8);
                obj3 = bVar8;
            } else {
                p1Var3 = p1Var;
                obj3 = objQ4;
            }
            r rVarB4 = b5.s0.b(rVarA8, unit4, (PointerInputEventHandler) obj3);
            if (pVar != null) {
                E.C(1128507362);
                fX = w02.b0.x(E, i16 / 2);
                r15 = 0;
                E.g0(false);
            } else {
                r15 = 0;
                E.C(1128507868);
                E.g0(false);
                fX = 0;
            }
            float f212 = fX;
            if (pVar != null) {
                E.C(624074052);
                E.g0(r15);
            } else {
                if (nVar != null) {
                    E.C(624175267);
                    fX2 = w02.b0.x(E, i16 / 2);
                    E.g0(r15);
                } else {
                    E.C(624280388);
                    E.g0(r15);
                }
                float f213 = fX2;
                if (nVar != null) {
                    E.C(1128521794);
                    fX3 = w02.b0.x(E, i16 / 2);
                    E.g0(r15);
                } else {
                    E.C(1128522300);
                    E.g0(r15);
                    fX3 = (float) r15;
                }
                r rVarC10 = l.C(rVarB4, f213, f212, fX3, 0.0f, 8);
                int i21115 = (E.h(z16) ? 1 : 0) | (E.r(q0VarA) ? 1 : 0);
                if ((i24 & 7168) != 2048) {
                    r16 = r15;
                } else {
                    r16 = 1;
                }
                int i21116 = ((((i21115 | r16) == true ? 1 : 0) | (E.r(list) ? 1 : 0)) | (E.i(f18) ? 1 : 0) ? 1 : 0) | (E.i(fG) ? 1 : 0);
                if ((i24 & 112) != 32) {
                    r17 = 1;
                } else {
                    r17 = 1;
                }
                boolean z114 = ((i21116 | r17) == true ? 1 : 0) | (E.l(jE) ? 1 : 0) | (E.r(arrayList) ? 1 : 0);
                if ((i15 & 29360128) == 8388608) {
                    c14 = 1;
                } else {
                    c14 = 0;
                }
                int i21117 = (z114 ? 1 : 0) | c14 | (E.r(arrayList3) ? 1 : 0);
                bVar4 = bVar3;
                int i21118 = (i21117 == true ? 1 : 0) | (E.r(bVar4) ? 1 : 0);
                if ((i15 & 1879048192) == 536870912) {
                    i17 = 1;
                } else {
                    i17 = 0;
                }
                int i21119 = i21118 | i17;
                if ((i24 & 14) == 4) {
                    i18 = 1;
                } else {
                    i18 = 0;
                }
                z17 = (((((i21119 | i18) | (E.r(arrayList5) ? 1 : 0)) == true ? 1 : 0) | (E.l(jB) ? 1 : 0)) | (E.r(arrayList4) ? 1 : 0) ? 1 : 0) | (E.l(jF) ? 1 : 0) | (E.r(arrayList2) ? 1 : 0);
                Object objQ11 = E.q();
                if (z17) {
                    ?? r1110 = E;
                    obj4 = new e23.l() { // from class: vc1.a
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // e23.l
                        public final Object invoke(Object obj5) throws Throwable {
                            q4.f fVar2;
                            float f214;
                            float f215;
                            q0 q0Var = q0VarA;
                            long j8 = q0Var.f157282c;
                            long j14 = jE;
                            ArrayList arrayList6 = arrayList;
                            Float f216 = f14;
                            ArrayList arrayList7 = arrayList3;
                            m92.m.b bVar9 = bVar4;
                            Float f217 = f15;
                            Float f218 = f16;
                            ArrayList arrayList8 = arrayList5;
                            long j15 = jB;
                            ArrayList arrayList9 = arrayList4;
                            long j16 = jF;
                            ArrayList arrayList10 = arrayList2;
                            p1 p1Var4 = p1Var2;
                            q4.f fVar3 = (q4.f) obj5;
                            fVar3.getClass();
                            if (z16) {
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (n4.h.b(fVar3.b()) >> 32)) - (((int) (j8 >> 32)) / 2);
                                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (n4.h.b(fVar3.b()) & 4294967295L)) - (((int) (j8 & 4294967295L)) / 2);
                                long jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
                                long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L;
                                n4.c.a aVar5 = n4.c.f123541b;
                                v0.b(fVar3, q0Var, 0L, jFloatToRawIntBits2 | (jFloatToRawIntBits << 32), 250);
                            } else {
                                p pVar2 = pVar;
                                List<o13.p<Float, String>> list2 = list;
                                float f34 = f18;
                                float f35 = fG;
                                m1 m1Var2 = m1Var;
                                if (pVar2 != null) {
                                    float f36 = pVar2.a(fVar3, list2, j0.f134944a, f34).f125077a + f35;
                                    d92.b.f58623a.getClass();
                                    d92.b.f58625c.getClass();
                                    m1Var2.i(f36 + j92.b.f97899b.f97921f);
                                }
                                n nVar2 = nVar;
                                if (nVar2 != null) {
                                    float floatValue = m1Var2.getFloatValue();
                                    fVar3.getF142543b().f142550a.e(floatValue, 0.0f, f35, 0.0f);
                                    try {
                                        nVar2.a(fVar3, f34);
                                        fVar3.getF142543b().f142550a.e(-floatValue, -0.0f, -f35, -0.0f);
                                    } catch (Throwable th3) {
                                        fVar3.getF142543b().f142550a.e(-floatValue, -0.0f, -f35, -0.0f);
                                        throw th3;
                                    }
                                }
                                float floatValue2 = m1Var2.getFloatValue();
                                fVar3.getF142543b().f142550a.e(floatValue2, 0.0f, f35, f34);
                                float f37 = 1;
                                try {
                                    g6.f.a aVar6 = g6.f.f75994b;
                                    o13.p pVar3 = (o13.p) h0.d0(list2);
                                    Float f38 = pVar3 != null ? (Float) pVar3.f128594a : null;
                                    o13.p pVar4 = (o13.p) h0.n0(list2);
                                    Float f39 = pVar4 != null ? (Float) pVar4.f128594a : null;
                                    m92.m.d dVar = new m92.m.d(j14, null);
                                    m92.e0 e0Var = m92.e0.LINEAR;
                                    g1.f128855a.getClass();
                                    f214 = f35;
                                    f215 = f34;
                                    try {
                                        c0.e(fVar3, f37, dVar, false, 0.0f, null, null, arrayList6, f216, null, null, f38, f39, e0Var, true, g1.a.a(0.0f, new float[]{8.0f, 8.0f}), 824);
                                        fVar2 = fVar3;
                                        try {
                                            m0 m0Var = new m0(i53.a.e(arrayList7), (d0) null, bVar9, (g6.f) null, 10, (p005kotlin.jvm.internal.j) null);
                                            o13.p pVar5 = (o13.p) h0.d0(list2);
                                            Float f44 = pVar5 != null ? (Float) pVar5.f128594a : null;
                                            o13.p pVar6 = (o13.p) h0.n0(list2);
                                            n0.d(fVar2, m0Var, null, f217, f218, f44, pVar6 != null ? (Float) pVar6.f128594a : null, null, 194);
                                            m0 m0Var2 = new m0(i53.a.e(arrayList8), (d0) null, bVar9, (g6.f) null, 10, (p005kotlin.jvm.internal.j) null);
                                            o13.p pVar7 = (o13.p) h0.d0(list2);
                                            Float f45 = pVar7 != null ? (Float) pVar7.f128594a : null;
                                            o13.p pVar8 = (o13.p) h0.n0(list2);
                                            n0.d(fVar2, m0Var2, null, f217, f218, f45, pVar8 != null ? (Float) pVar8.f128594a : null, null, 194);
                                            o13.p pVar9 = (o13.p) h0.d0(list2);
                                            Float f46 = pVar9 != null ? (Float) pVar9.f128594a : null;
                                            o13.p pVar10 = (o13.p) h0.n0(list2);
                                            c0.e(fVar2, f37, new m92.m.d(j15, null), false, 0.0f, null, null, arrayList9, f216, null, null, f46, pVar10 != null ? (Float) pVar10.f128594a : null, e0Var, false, null, 17208);
                                            o13.p pVar11 = (o13.p) h0.d0(list2);
                                            Float f47 = pVar11 != null ? (Float) pVar11.f128594a : null;
                                            o13.p pVar12 = (o13.p) h0.n0(list2);
                                            p1Var4.setValue(c0.e(fVar2, f37, new m92.m.d(j16, null), false, 0, null, null, arrayList10, f216, null, null, f47, pVar12 != null ? (Float) pVar12.f128594a : null, e0Var, true, null, 17200));
                                            List listC = w.c(h0.m0(arrayList10));
                                            o13.p pVar13 = (o13.p) h0.d0(list2);
                                            Float f48 = pVar13 != null ? (Float) pVar13.f128594a : null;
                                            o13.p pVar14 = (o13.p) h0.n0(list2);
                                            c0.e(fVar2, f37, new m92.m.d(j16, null), true, 4, null, d0.a(j16), listC, f216, null, null, f48, pVar14 != null ? (Float) pVar14.f128594a : null, e0Var, true, null, 17168);
                                            fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, -f214, -f215);
                                        } catch (Throwable th4) {
                                            th = th4;
                                            fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, -f214, -f215);
                                            throw th;
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        fVar2 = fVar3;
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    fVar2 = fVar3;
                                    f214 = f35;
                                    f215 = f34;
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    f19 = f18;
                    m1Var = m1Var;
                    r1110.K(obj4);
                    r18 = r1110;
                } else {
                    ?? r1111 = E;
                    obj4 = new e23.l() { // from class: vc1.a
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // e23.l
                        public final Object invoke(Object obj5) throws Throwable {
                            q4.f fVar2;
                            float f214;
                            float f215;
                            q0 q0Var = q0VarA;
                            long j8 = q0Var.f157282c;
                            long j14 = jE;
                            ArrayList arrayList6 = arrayList;
                            Float f216 = f14;
                            ArrayList arrayList7 = arrayList3;
                            m92.m.b bVar9 = bVar4;
                            Float f217 = f15;
                            Float f218 = f16;
                            ArrayList arrayList8 = arrayList5;
                            long j15 = jB;
                            ArrayList arrayList9 = arrayList4;
                            long j16 = jF;
                            ArrayList arrayList10 = arrayList2;
                            p1 p1Var4 = p1Var2;
                            q4.f fVar3 = (q4.f) obj5;
                            fVar3.getClass();
                            if (z16) {
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (n4.h.b(fVar3.b()) >> 32)) - (((int) (j8 >> 32)) / 2);
                                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (n4.h.b(fVar3.b()) & 4294967295L)) - (((int) (j8 & 4294967295L)) / 2);
                                long jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
                                long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L;
                                n4.c.a aVar5 = n4.c.f123541b;
                                v0.b(fVar3, q0Var, 0L, jFloatToRawIntBits2 | (jFloatToRawIntBits << 32), 250);
                            } else {
                                p pVar2 = pVar;
                                List<o13.p<Float, String>> list2 = list;
                                float f34 = f18;
                                float f35 = fG;
                                m1 m1Var2 = m1Var;
                                if (pVar2 != null) {
                                    float f36 = pVar2.a(fVar3, list2, j0.f134944a, f34).f125077a + f35;
                                    d92.b.f58623a.getClass();
                                    d92.b.f58625c.getClass();
                                    m1Var2.i(f36 + j92.b.f97899b.f97921f);
                                }
                                n nVar2 = nVar;
                                if (nVar2 != null) {
                                    float floatValue = m1Var2.getFloatValue();
                                    fVar3.getF142543b().f142550a.e(floatValue, 0.0f, f35, 0.0f);
                                    try {
                                        nVar2.a(fVar3, f34);
                                        fVar3.getF142543b().f142550a.e(-floatValue, -0.0f, -f35, -0.0f);
                                    } catch (Throwable th3) {
                                        fVar3.getF142543b().f142550a.e(-floatValue, -0.0f, -f35, -0.0f);
                                        throw th3;
                                    }
                                }
                                float floatValue2 = m1Var2.getFloatValue();
                                fVar3.getF142543b().f142550a.e(floatValue2, 0.0f, f35, f34);
                                float f37 = 1;
                                try {
                                    g6.f.a aVar6 = g6.f.f75994b;
                                    o13.p pVar3 = (o13.p) h0.d0(list2);
                                    Float f38 = pVar3 != null ? (Float) pVar3.f128594a : null;
                                    o13.p pVar4 = (o13.p) h0.n0(list2);
                                    Float f39 = pVar4 != null ? (Float) pVar4.f128594a : null;
                                    m92.m.d dVar = new m92.m.d(j14, null);
                                    m92.e0 e0Var = m92.e0.LINEAR;
                                    g1.f128855a.getClass();
                                    f214 = f35;
                                    f215 = f34;
                                    try {
                                        c0.e(fVar3, f37, dVar, false, 0.0f, null, null, arrayList6, f216, null, null, f38, f39, e0Var, true, g1.a.a(0.0f, new float[]{8.0f, 8.0f}), 824);
                                        fVar2 = fVar3;
                                        try {
                                            m0 m0Var = new m0(i53.a.e(arrayList7), (d0) null, bVar9, (g6.f) null, 10, (p005kotlin.jvm.internal.j) null);
                                            o13.p pVar5 = (o13.p) h0.d0(list2);
                                            Float f44 = pVar5 != null ? (Float) pVar5.f128594a : null;
                                            o13.p pVar6 = (o13.p) h0.n0(list2);
                                            n0.d(fVar2, m0Var, null, f217, f218, f44, pVar6 != null ? (Float) pVar6.f128594a : null, null, 194);
                                            m0 m0Var2 = new m0(i53.a.e(arrayList8), (d0) null, bVar9, (g6.f) null, 10, (p005kotlin.jvm.internal.j) null);
                                            o13.p pVar7 = (o13.p) h0.d0(list2);
                                            Float f45 = pVar7 != null ? (Float) pVar7.f128594a : null;
                                            o13.p pVar8 = (o13.p) h0.n0(list2);
                                            n0.d(fVar2, m0Var2, null, f217, f218, f45, pVar8 != null ? (Float) pVar8.f128594a : null, null, 194);
                                            o13.p pVar9 = (o13.p) h0.d0(list2);
                                            Float f46 = pVar9 != null ? (Float) pVar9.f128594a : null;
                                            o13.p pVar10 = (o13.p) h0.n0(list2);
                                            c0.e(fVar2, f37, new m92.m.d(j15, null), false, 0.0f, null, null, arrayList9, f216, null, null, f46, pVar10 != null ? (Float) pVar10.f128594a : null, e0Var, false, null, 17208);
                                            o13.p pVar11 = (o13.p) h0.d0(list2);
                                            Float f47 = pVar11 != null ? (Float) pVar11.f128594a : null;
                                            o13.p pVar12 = (o13.p) h0.n0(list2);
                                            p1Var4.setValue(c0.e(fVar2, f37, new m92.m.d(j16, null), false, 0, null, null, arrayList10, f216, null, null, f47, pVar12 != null ? (Float) pVar12.f128594a : null, e0Var, true, null, 17200));
                                            List listC = w.c(h0.m0(arrayList10));
                                            o13.p pVar13 = (o13.p) h0.d0(list2);
                                            Float f48 = pVar13 != null ? (Float) pVar13.f128594a : null;
                                            o13.p pVar14 = (o13.p) h0.n0(list2);
                                            c0.e(fVar2, f37, new m92.m.d(j16, null), true, 4, null, d0.a(j16), listC, f216, null, null, f48, pVar14 != null ? (Float) pVar14.f128594a : null, e0Var, true, null, 17168);
                                            fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, -f214, -f215);
                                        } catch (Throwable th4) {
                                            th = th4;
                                            fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, -f214, -f215);
                                            throw th;
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        fVar2 = fVar3;
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    fVar2 = fVar3;
                                    f214 = f35;
                                    f215 = f34;
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    f19 = f18;
                    m1Var = m1Var;
                    r1111.K(obj4);
                    r18 = r1111;
                }
                u1.n.b(rVarC10, (e23.l) obj4, r18, 0);
                r18.g0(true);
                if (qVar != null) {
                    r18.C(-1465602610);
                    map = (Map) p1Var2.getF182175a();
                    if (map == null) {
                        r18.C(1810959347);
                        r18.g0(false);
                    } else {
                        r18.C(1810959348);
                        cVar = (n4.c) p1Var3.getF182175a();
                        if (cVar == null) {
                            r18.C(1673296997);
                            r18.g0(false);
                        } else {
                            r18.C(1673296998);
                            m92.y.c(map, cVar.f123544a, m1Var.getFloatValue(), f19, qVar, null, r18, 24576, 32);
                            r18.g0(false);
                        }
                        r18.g0(false);
                    }
                    r18.g0(false);
                } else {
                    r18.C(1811186578);
                    r18.g0(false);
                }
                r18.g0(true);
                r18.g0(true);
                x1 x1Var8 = p3.n.f135158a;
                str2 = str3;
                r14 = r18;
            }
            fX2 = (float) r15;
            float f214 = fX2;
            if (nVar != null) {
                E.C(1128521794);
                fX3 = w02.b0.x(E, i16 / 2);
                E.g0(r15);
            } else {
                E.C(1128522300);
                E.g0(r15);
                fX3 = (float) r15;
            }
            r rVarC11 = l.C(rVarB4, f214, f212, fX3, 0.0f, 8);
            int i211110 = (E.h(z16) ? 1 : 0) | (E.r(q0VarA) ? 1 : 0);
            if ((i24 & 7168) != 2048) {
                r16 = r15;
            } else {
                r16 = 1;
            }
            int i211111 = ((((i211110 | r16) == true ? 1 : 0) | (E.r(list) ? 1 : 0)) | (E.i(f18) ? 1 : 0) ? 1 : 0) | (E.i(fG) ? 1 : 0);
            if ((i24 & 112) != 32) {
                r17 = 1;
            } else {
                r17 = 1;
            }
            boolean z115 = ((i211111 | r17) == true ? 1 : 0) | (E.l(jE) ? 1 : 0) | (E.r(arrayList) ? 1 : 0);
            if ((i15 & 29360128) == 8388608) {
                c14 = 1;
            } else {
                c14 = 0;
            }
            int i211112 = (z115 ? 1 : 0) | c14 | (E.r(arrayList3) ? 1 : 0);
            bVar4 = bVar3;
            int i211113 = (i211112 == true ? 1 : 0) | (E.r(bVar4) ? 1 : 0);
            if ((i15 & 1879048192) == 536870912) {
                i17 = 1;
            } else {
                i17 = 0;
            }
            int i211114 = i211113 | i17;
            if ((i24 & 14) == 4) {
                i18 = 1;
            } else {
                i18 = 0;
            }
            z17 = (((((i211114 | i18) | (E.r(arrayList5) ? 1 : 0)) == true ? 1 : 0) | (E.l(jB) ? 1 : 0)) | (E.r(arrayList4) ? 1 : 0) ? 1 : 0) | (E.l(jF) ? 1 : 0) | (E.r(arrayList2) ? 1 : 0);
            Object objQ12 = E.q();
            if (z17) {
                ?? r1112 = E;
                obj4 = new e23.l() { // from class: vc1.a
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // e23.l
                    public final Object invoke(Object obj5) throws Throwable {
                        q4.f fVar2;
                        float f215;
                        float f216;
                        q0 q0Var = q0VarA;
                        long j8 = q0Var.f157282c;
                        long j14 = jE;
                        ArrayList arrayList6 = arrayList;
                        Float f217 = f14;
                        ArrayList arrayList7 = arrayList3;
                        m92.m.b bVar9 = bVar4;
                        Float f218 = f15;
                        Float f219 = f16;
                        ArrayList arrayList8 = arrayList5;
                        long j15 = jB;
                        ArrayList arrayList9 = arrayList4;
                        long j16 = jF;
                        ArrayList arrayList10 = arrayList2;
                        p1 p1Var4 = p1Var2;
                        q4.f fVar3 = (q4.f) obj5;
                        fVar3.getClass();
                        if (z16) {
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (n4.h.b(fVar3.b()) >> 32)) - (((int) (j8 >> 32)) / 2);
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (n4.h.b(fVar3.b()) & 4294967295L)) - (((int) (j8 & 4294967295L)) / 2);
                            long jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
                            long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L;
                            n4.c.a aVar5 = n4.c.f123541b;
                            v0.b(fVar3, q0Var, 0L, jFloatToRawIntBits2 | (jFloatToRawIntBits << 32), 250);
                        } else {
                            p pVar2 = pVar;
                            List<o13.p<Float, String>> list2 = list;
                            float f34 = f18;
                            float f35 = fG;
                            m1 m1Var2 = m1Var;
                            if (pVar2 != null) {
                                float f36 = pVar2.a(fVar3, list2, j0.f134944a, f34).f125077a + f35;
                                d92.b.f58623a.getClass();
                                d92.b.f58625c.getClass();
                                m1Var2.i(f36 + j92.b.f97899b.f97921f);
                            }
                            n nVar2 = nVar;
                            if (nVar2 != null) {
                                float floatValue = m1Var2.getFloatValue();
                                fVar3.getF142543b().f142550a.e(floatValue, 0.0f, f35, 0.0f);
                                try {
                                    nVar2.a(fVar3, f34);
                                    fVar3.getF142543b().f142550a.e(-floatValue, -0.0f, -f35, -0.0f);
                                } catch (Throwable th3) {
                                    fVar3.getF142543b().f142550a.e(-floatValue, -0.0f, -f35, -0.0f);
                                    throw th3;
                                }
                            }
                            float floatValue2 = m1Var2.getFloatValue();
                            fVar3.getF142543b().f142550a.e(floatValue2, 0.0f, f35, f34);
                            float f37 = 1;
                            try {
                                g6.f.a aVar6 = g6.f.f75994b;
                                o13.p pVar3 = (o13.p) h0.d0(list2);
                                Float f38 = pVar3 != null ? (Float) pVar3.f128594a : null;
                                o13.p pVar4 = (o13.p) h0.n0(list2);
                                Float f39 = pVar4 != null ? (Float) pVar4.f128594a : null;
                                m92.m.d dVar = new m92.m.d(j14, null);
                                m92.e0 e0Var = m92.e0.LINEAR;
                                g1.f128855a.getClass();
                                f215 = f35;
                                f216 = f34;
                                try {
                                    c0.e(fVar3, f37, dVar, false, 0.0f, null, null, arrayList6, f217, null, null, f38, f39, e0Var, true, g1.a.a(0.0f, new float[]{8.0f, 8.0f}), 824);
                                    fVar2 = fVar3;
                                    try {
                                        m0 m0Var = new m0(i53.a.e(arrayList7), (d0) null, bVar9, (g6.f) null, 10, (p005kotlin.jvm.internal.j) null);
                                        o13.p pVar5 = (o13.p) h0.d0(list2);
                                        Float f44 = pVar5 != null ? (Float) pVar5.f128594a : null;
                                        o13.p pVar6 = (o13.p) h0.n0(list2);
                                        n0.d(fVar2, m0Var, null, f218, f219, f44, pVar6 != null ? (Float) pVar6.f128594a : null, null, 194);
                                        m0 m0Var2 = new m0(i53.a.e(arrayList8), (d0) null, bVar9, (g6.f) null, 10, (p005kotlin.jvm.internal.j) null);
                                        o13.p pVar7 = (o13.p) h0.d0(list2);
                                        Float f45 = pVar7 != null ? (Float) pVar7.f128594a : null;
                                        o13.p pVar8 = (o13.p) h0.n0(list2);
                                        n0.d(fVar2, m0Var2, null, f218, f219, f45, pVar8 != null ? (Float) pVar8.f128594a : null, null, 194);
                                        o13.p pVar9 = (o13.p) h0.d0(list2);
                                        Float f46 = pVar9 != null ? (Float) pVar9.f128594a : null;
                                        o13.p pVar10 = (o13.p) h0.n0(list2);
                                        c0.e(fVar2, f37, new m92.m.d(j15, null), false, 0.0f, null, null, arrayList9, f217, null, null, f46, pVar10 != null ? (Float) pVar10.f128594a : null, e0Var, false, null, 17208);
                                        o13.p pVar11 = (o13.p) h0.d0(list2);
                                        Float f47 = pVar11 != null ? (Float) pVar11.f128594a : null;
                                        o13.p pVar12 = (o13.p) h0.n0(list2);
                                        p1Var4.setValue(c0.e(fVar2, f37, new m92.m.d(j16, null), false, 0, null, null, arrayList10, f217, null, null, f47, pVar12 != null ? (Float) pVar12.f128594a : null, e0Var, true, null, 17200));
                                        List listC = w.c(h0.m0(arrayList10));
                                        o13.p pVar13 = (o13.p) h0.d0(list2);
                                        Float f48 = pVar13 != null ? (Float) pVar13.f128594a : null;
                                        o13.p pVar14 = (o13.p) h0.n0(list2);
                                        c0.e(fVar2, f37, new m92.m.d(j16, null), true, 4, null, d0.a(j16), listC, f217, null, null, f48, pVar14 != null ? (Float) pVar14.f128594a : null, e0Var, true, null, 17168);
                                        fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, -f215, -f216);
                                    } catch (Throwable th4) {
                                        th = th4;
                                        fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, -f215, -f216);
                                        throw th;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    fVar2 = fVar3;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                fVar2 = fVar3;
                                f215 = f35;
                                f216 = f34;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                };
                f19 = f18;
                m1Var = m1Var;
                r1112.K(obj4);
                r18 = r1112;
            } else {
                ?? r1113 = E;
                obj4 = new e23.l() { // from class: vc1.a
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // e23.l
                    public final Object invoke(Object obj5) throws Throwable {
                        q4.f fVar2;
                        float f215;
                        float f216;
                        q0 q0Var = q0VarA;
                        long j8 = q0Var.f157282c;
                        long j14 = jE;
                        ArrayList arrayList6 = arrayList;
                        Float f217 = f14;
                        ArrayList arrayList7 = arrayList3;
                        m92.m.b bVar9 = bVar4;
                        Float f218 = f15;
                        Float f219 = f16;
                        ArrayList arrayList8 = arrayList5;
                        long j15 = jB;
                        ArrayList arrayList9 = arrayList4;
                        long j16 = jF;
                        ArrayList arrayList10 = arrayList2;
                        p1 p1Var4 = p1Var2;
                        q4.f fVar3 = (q4.f) obj5;
                        fVar3.getClass();
                        if (z16) {
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (n4.h.b(fVar3.b()) >> 32)) - (((int) (j8 >> 32)) / 2);
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (n4.h.b(fVar3.b()) & 4294967295L)) - (((int) (j8 & 4294967295L)) / 2);
                            long jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
                            long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L;
                            n4.c.a aVar5 = n4.c.f123541b;
                            v0.b(fVar3, q0Var, 0L, jFloatToRawIntBits2 | (jFloatToRawIntBits << 32), 250);
                        } else {
                            p pVar2 = pVar;
                            List<o13.p<Float, String>> list2 = list;
                            float f34 = f18;
                            float f35 = fG;
                            m1 m1Var2 = m1Var;
                            if (pVar2 != null) {
                                float f36 = pVar2.a(fVar3, list2, j0.f134944a, f34).f125077a + f35;
                                d92.b.f58623a.getClass();
                                d92.b.f58625c.getClass();
                                m1Var2.i(f36 + j92.b.f97899b.f97921f);
                            }
                            n nVar2 = nVar;
                            if (nVar2 != null) {
                                float floatValue = m1Var2.getFloatValue();
                                fVar3.getF142543b().f142550a.e(floatValue, 0.0f, f35, 0.0f);
                                try {
                                    nVar2.a(fVar3, f34);
                                    fVar3.getF142543b().f142550a.e(-floatValue, -0.0f, -f35, -0.0f);
                                } catch (Throwable th3) {
                                    fVar3.getF142543b().f142550a.e(-floatValue, -0.0f, -f35, -0.0f);
                                    throw th3;
                                }
                            }
                            float floatValue2 = m1Var2.getFloatValue();
                            fVar3.getF142543b().f142550a.e(floatValue2, 0.0f, f35, f34);
                            float f37 = 1;
                            try {
                                g6.f.a aVar6 = g6.f.f75994b;
                                o13.p pVar3 = (o13.p) h0.d0(list2);
                                Float f38 = pVar3 != null ? (Float) pVar3.f128594a : null;
                                o13.p pVar4 = (o13.p) h0.n0(list2);
                                Float f39 = pVar4 != null ? (Float) pVar4.f128594a : null;
                                m92.m.d dVar = new m92.m.d(j14, null);
                                m92.e0 e0Var = m92.e0.LINEAR;
                                g1.f128855a.getClass();
                                f215 = f35;
                                f216 = f34;
                                try {
                                    c0.e(fVar3, f37, dVar, false, 0.0f, null, null, arrayList6, f217, null, null, f38, f39, e0Var, true, g1.a.a(0.0f, new float[]{8.0f, 8.0f}), 824);
                                    fVar2 = fVar3;
                                    try {
                                        m0 m0Var = new m0(i53.a.e(arrayList7), (d0) null, bVar9, (g6.f) null, 10, (p005kotlin.jvm.internal.j) null);
                                        o13.p pVar5 = (o13.p) h0.d0(list2);
                                        Float f44 = pVar5 != null ? (Float) pVar5.f128594a : null;
                                        o13.p pVar6 = (o13.p) h0.n0(list2);
                                        n0.d(fVar2, m0Var, null, f218, f219, f44, pVar6 != null ? (Float) pVar6.f128594a : null, null, 194);
                                        m0 m0Var2 = new m0(i53.a.e(arrayList8), (d0) null, bVar9, (g6.f) null, 10, (p005kotlin.jvm.internal.j) null);
                                        o13.p pVar7 = (o13.p) h0.d0(list2);
                                        Float f45 = pVar7 != null ? (Float) pVar7.f128594a : null;
                                        o13.p pVar8 = (o13.p) h0.n0(list2);
                                        n0.d(fVar2, m0Var2, null, f218, f219, f45, pVar8 != null ? (Float) pVar8.f128594a : null, null, 194);
                                        o13.p pVar9 = (o13.p) h0.d0(list2);
                                        Float f46 = pVar9 != null ? (Float) pVar9.f128594a : null;
                                        o13.p pVar10 = (o13.p) h0.n0(list2);
                                        c0.e(fVar2, f37, new m92.m.d(j15, null), false, 0.0f, null, null, arrayList9, f217, null, null, f46, pVar10 != null ? (Float) pVar10.f128594a : null, e0Var, false, null, 17208);
                                        o13.p pVar11 = (o13.p) h0.d0(list2);
                                        Float f47 = pVar11 != null ? (Float) pVar11.f128594a : null;
                                        o13.p pVar12 = (o13.p) h0.n0(list2);
                                        p1Var4.setValue(c0.e(fVar2, f37, new m92.m.d(j16, null), false, 0, null, null, arrayList10, f217, null, null, f47, pVar12 != null ? (Float) pVar12.f128594a : null, e0Var, true, null, 17200));
                                        List listC = w.c(h0.m0(arrayList10));
                                        o13.p pVar13 = (o13.p) h0.d0(list2);
                                        Float f48 = pVar13 != null ? (Float) pVar13.f128594a : null;
                                        o13.p pVar14 = (o13.p) h0.n0(list2);
                                        c0.e(fVar2, f37, new m92.m.d(j16, null), true, 4, null, d0.a(j16), listC, f217, null, null, f48, pVar14 != null ? (Float) pVar14.f128594a : null, e0Var, true, null, 17168);
                                        fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, -f215, -f216);
                                    } catch (Throwable th4) {
                                        th = th4;
                                        fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, -f215, -f216);
                                        throw th;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    fVar2 = fVar3;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                fVar2 = fVar3;
                                f215 = f35;
                                f216 = f34;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                };
                f19 = f18;
                m1Var = m1Var;
                r1113.K(obj4);
                r18 = r1113;
            }
            u1.n.b(rVarC11, (e23.l) obj4, r18, 0);
            r18.g0(true);
            if (qVar != null) {
                r18.C(-1465602610);
                map = (Map) p1Var2.getF182175a();
                if (map == null) {
                    r18.C(1810959347);
                    r18.g0(false);
                } else {
                    r18.C(1810959348);
                    cVar = (n4.c) p1Var3.getF182175a();
                    if (cVar == null) {
                        r18.C(1673296997);
                        r18.g0(false);
                    } else {
                        r18.C(1673296998);
                        m92.y.c(map, cVar.f123544a, m1Var.getFloatValue(), f19, qVar, null, r18, 24576, 32);
                        r18.g0(false);
                    }
                    r18.g0(false);
                }
                r18.g0(false);
            } else {
                r18.C(1811186578);
                r18.g0(false);
            }
            r18.g0(true);
            r18.g0(true);
            x1 x1Var9 = p3.n.f135158a;
            str2 = str3;
            r14 = r18;
        } else {
            ?? r24 = E;
            r24.e();
            str2 = str;
            r14 = r24;
        }
        p2 p2VarI0 = r14.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o50.b(rVar, arrayList, arrayList2, arrayList3, arrayList4, arrayList5, f14, str2, f15, f16, nVar, oVar, pVar, qVar, i14, 2);
        }
    }
}

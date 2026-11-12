package kf1;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import c2.b0;
import c2.l;
import c2.u;
import c2.x2;
import c2.y;
import c2.z;
import c22.t;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import e23.q;
import f5.z0;
import h4.k;
import h4.r;
import h5.e0;
import i3.mh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.t1;
import m92.c0;
import m92.i0;
import m92.l0;
import n92.n;
import n92.o;
import n92.p;
import o4.d0;
import o4.f1;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.j0;
import p13.k0;
import p3.b4;
import p3.c2;
import p3.i2;
import p3.m;
import p3.m1;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import s5.q0;
import s5.s0;
import s5.v0;
import s5.x0;

/* JADX INFO: loaded from: classes9.dex */
public final class d {
    /* JADX WARN: Code duplicated, block: B:156:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:158:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:159:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:164:0x030d  */
    /* JADX WARN: Code duplicated, block: B:167:0x0330  */
    /* JADX WARN: Code duplicated, block: B:169:0x0337  */
    /* JADX WARN: Code duplicated, block: B:170:0x033b  */
    /* JADX WARN: Code duplicated, block: B:175:0x0356  */
    /* JADX WARN: Code duplicated, block: B:178:0x035e  */
    /* JADX WARN: Code duplicated, block: B:180:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:183:0x041d  */
    /* JADX WARN: Code duplicated, block: B:184:0x042a  */
    /* JADX WARN: Code duplicated, block: B:187:0x0436  */
    /* JADX WARN: Code duplicated, block: B:189:0x0447  */
    /* JADX WARN: Code duplicated, block: B:191:0x0454  */
    /* JADX WARN: Code duplicated, block: B:194:0x0460 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:195:0x0462  */
    /* JADX WARN: Code duplicated, block: B:196:0x0472  */
    /* JADX WARN: Code duplicated, block: B:198:0x047e  */
    /* JADX WARN: Code duplicated, block: B:200:0x048f  */
    /* JADX WARN: Code duplicated, block: B:203:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:205:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:208:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:209:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:212:0x04d7  */
    /* JADX WARN: Code duplicated, block: B:213:0x04da  */
    /* JADX WARN: Code duplicated, block: B:216:0x04e3  */
    /* JADX WARN: Code duplicated, block: B:217:0x04e6  */
    /* JADX WARN: Code duplicated, block: B:220:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:221:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:224:0x04fb  */
    /* JADX WARN: Code duplicated, block: B:225:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:228:0x0508  */
    /* JADX WARN: Code duplicated, block: B:229:0x050b  */
    /* JADX WARN: Code duplicated, block: B:232:0x0514  */
    /* JADX WARN: Code duplicated, block: B:233:0x0517  */
    /* JADX WARN: Code duplicated, block: B:236:0x051f  */
    /* JADX WARN: Code duplicated, block: B:237:0x0521  */
    /* JADX WARN: Code duplicated, block: B:240:0x0531 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:241:0x0533  */
    /* JADX WARN: Code duplicated, block: B:246:0x057c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:256:0x05d5  */
    /* JADX WARN: Code duplicated, block: B:259:0x05e7  */
    /* JADX WARN: Code duplicated, block: B:261:0x05f1  */
    /* JADX WARN: Code duplicated, block: B:263:0x0606  */
    /* JADX WARN: Code duplicated, block: B:265:0x060a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r10v31 */
    /* JADX WARN: Type inference failed for: r10v34 */
    /* JADX WARN: Type inference failed for: r10v35 */
    /* JADX WARN: Type inference failed for: r10v42 */
    /* JADX WARN: Type inference failed for: r10v43 */
    /* JADX WARN: Type inference failed for: r10v44 */
    /* JADX WARN: Type inference failed for: r10v45 */
    /* JADX WARN: Type inference failed for: r10v46 */
    /* JADX WARN: Type inference failed for: r10v47 */
    /* JADX WARN: Type inference failed for: r10v48 */
    /* JADX WARN: Type inference failed for: r10v49 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r15v1, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v3, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.lang.Object, p3.o0] */
    /* JADX WARN: Type inference failed for: r15v5, types: [p3.m, p3.o0] */
    /* JADX WARN: Type inference failed for: r15v6, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v8, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r1v9, types: [p3.m, p3.o0] */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r25v0, types: [s5.x0] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v5, types: [p3.m, p3.o0] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v36 */
    public static final void a(final r rVar, final String str, final float f14, final long j8, final long j14, final o82.g gVar, final if1.b bVar, final boolean z14, final Float f15, final String str2, final o oVar, final p pVar, final n nVar, final e23.p pVar2, final q qVar, m mVar, final int i14) throws Throwable {
        int i15;
        int i16;
        ?? r15;
        s0 s0Var;
        Throwable th3;
        s0 s0Var2;
        Object obj;
        x0 x0Var;
        Object objF;
        float f16;
        List listA;
        float f17;
        h5.g.a.f fVar;
        b0 b0Var;
        r.a aVar;
        int i17;
        z0 z0VarD;
        int iHashCode;
        i2 i2VarA0;
        r rVarC;
        z zVarA;
        int iHashCode2;
        i2 i2VarA1;
        r rVarC2;
        r.a aVar2;
        q0 q0Var;
        ?? r14;
        int i18;
        ?? r16;
        Object objQ;
        p1 p1Var;
        p1 p1Var2;
        Object obj2;
        float fX;
        float fX2;
        float fX3;
        ?? r17;
        boolean z15;
        final float f18;
        int i19;
        ?? r18;
        ?? r19;
        ?? r110;
        ?? r111;
        ?? r112;
        ?? r113;
        ?? r114;
        ?? r115;
        final q0 q0Var2;
        int i24;
        Object objQ2;
        final p1 p1Var3;
        final m1 m1Var;
        ?? r24;
        boolean z16;
        ?? r116;
        ?? r117;
        ?? r118;
        x0 x0Var2;
        gVar.getClass();
        o0 o0VarE = mVar.E(63745294);
        p3.c<?> cVar = o0VarE.f135177b;
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(str) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.i(f14) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 = i15 | (o0VarE.l(j8) ? 2048 : 1024);
        } else {
            i16 = i15;
        }
        if ((i14 & 24576) == 0) {
            i16 |= o0VarE.l(j14) ? 16384 : 8192;
        }
        if ((i14 & 196608) == 0) {
            i16 |= o0VarE.k(gVar.ordinal()) ? 131072 : 65536;
        }
        if ((i14 & 1572864) == 0) {
            i16 |= o0VarE.B(bVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i14 & 12582912) == 0) {
            i16 |= o0VarE.h(z14) ? 8388608 : 4194304;
        }
        if ((i14 & 100663296) == 0) {
            i16 |= o0VarE.B(f15) ? 67108864 : 33554432;
        }
        if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
            i16 |= o0VarE.B(str2) ? 536870912 : 268435456;
        }
        int i25 = 27656 | (o0VarE.r(oVar) ? (char) 4 : (char) 2) | (o0VarE.B(pVar) ? ' ' : (char) 16) | (o0VarE.B(nVar) ? (char) 256 : (char) 128);
        if (o0VarE.n(i16 & 1, ((306783379 & i16) == 306783378 && (i25 & 9363) == 9362) ? false : true)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            g6.f.a aVar3 = g6.f.f75994b;
            float fG = w02.b0.g(f14 / 5, o0VarE);
            if (nVar != null) {
                s0Var = nVar.f125091a;
            } else {
                s0Var = pVar != null ? pVar.f125097a : null;
            }
            if (s0Var == null) {
                o0VarE.C(1129709859);
                th3 = null;
                s0 s0Var3 = new s0((w5.q.b) o0VarE.A(t1.f91493k), new g6.d(((g6.c) o0VarE.A(t1.f91490h)).getF75991a(), 1.0f), (g6.o) o0VarE.A(t1.f91496n), 0, 8, null);
                o0VarE.g0(false);
                s0Var2 = s0Var3;
            } else {
                th3 = null;
                o0VarE.C(1129707937);
                o0VarE.g0(false);
                s0Var2 = s0Var;
            }
            if (nVar != null) {
                x0Var2 = nVar.f125092b;
            } else if (pVar != null) {
                x0Var = pVar.f125098b;
            } else {
                obj = th3;
            }
            if (obj == null) {
                obj = x0Var;
                obj = x0Var2;
                o0VarE.C(1129719806);
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                objF = d92.c.f(j92.f.f97935l, o0VarE);
            } else {
                obj = x0Var;
                obj = x0Var2;
                o0VarE.C(1129717853);
                objF = obj;
            }
            o0VarE.g0(false);
            q0 q0VarA = s0.a(s0Var2, str2, objF, 0L, 1020);
            int i26 = (int) (q0VarA.f157282c & 4294967295L);
            Object objQ3 = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            Object obj3 = objQ3;
            if (objQ3 == c2565a) {
                c2 c2VarN = p0.n(th3);
                o0VarE.K(c2VarN);
                obj3 = c2VarN;
            }
            p1 p1Var4 = (p1) obj3;
            Object objQ4 = o0VarE.q();
            Object obj4 = objQ4;
            if (objQ4 == c2565a) {
                c2 c2VarN2 = p0.n(Boolean.FALSE);
                o0VarE.K(c2VarN2);
                obj4 = c2VarN2;
            }
            p1 p1Var5 = (p1) obj4;
            Object objQ5 = o0VarE.q();
            Object obj5 = objQ5;
            if (objQ5 == c2565a) {
                c2 c2VarN3 = p0.n(th3);
                o0VarE.K(c2VarN3);
                obj5 = c2VarN3;
            }
            p1 p1Var6 = (p1) obj5;
            Object objQ6 = o0VarE.q();
            Object objO = objQ6;
            if (objQ6 == c2565a) {
                objO = n23.j.o(fG, o0VarE);
            }
            m1 m1Var2 = (m1) objO;
            if (nVar != null) {
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                f16 = (i26 * 2) + j92.b.f97899b.f97918c;
            } else {
                f16 = 0.0f;
            }
            final float f19 = f16;
            if (oVar == null || (listA = oVar.a()) == null) {
                listA = j0.f134944a;
            }
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            h4.g.a aVar4 = h4.d.a.f81536n;
            z zVarA2 = y.a(kVar, aVar4, o0VarE, 0);
            final List list = listA;
            int iHashCode3 = Long.hashCode(o0VarE.U);
            i2 i2VarA2 = o0VarE.a0();
            r rVarC3 = k.c(rVar, o0VarE);
            h5.g.V.getClass();
            e0.a aVar5 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw th3;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA2, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA2, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T) {
                f17 = fG;
            } else {
                f17 = fG;
                if (!s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC3, o0VarE);
                b0Var = b0.f22601a;
                aVar = r.S;
                i17 = i16;
                r rVarA = b0Var.a(aVar, 1.0f, true);
                z0VarD = c2.q.d(h4.d.a.f81524b, false);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = k.c(rVarA, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw th3;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar5);
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
                r rVarD = x2.d(aVar, 1.0f);
                zVarA = y.a(kVar, aVar4, o0VarE, 0);
                iHashCode2 = Long.hashCode(o0VarE.U);
                i2VarA1 = o0VarE.a0();
                rVarC2 = k.c(rVarD, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw th3;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar5);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, zVarA, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
                }
                b4.c(fVar, rVarC2, o0VarE);
                if (str != null) {
                    o0VarE.C(-18468146);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0VarB = d92.c.b(j92.f.f97931h, o0VarE);
                    j92.b bVar3 = d92.b.f58625c;
                    bVar3.getClass();
                    j92.e eVar2 = j92.b.f97899b;
                    float f22 = eVar2.f97920e;
                    bVar3.getClass();
                    r14 = 0;
                    i18 = i17;
                    q0Var = q0VarA;
                    aVar2 = aVar;
                    mh.c(str, l.C(aVar, 0.0f, f22, 0.0f, eVar2.f97922g, 5), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0VarE, (i17 >> 3) & 14, 0, 131068);
                    o0 o0Var = o0VarE;
                    o0Var.g0(false);
                    r16 = o0Var;
                } else {
                    aVar2 = aVar;
                    q0Var = q0VarA;
                    r14 = 0;
                    o0 o0Var2 = o0VarE;
                    i18 = i17;
                    o0Var2.C(-18211962);
                    o0Var2.g0(false);
                    r16 = o0Var2;
                }
                r rVarA2 = b0Var.a(x2.f(aVar2, 1.0f), 1.0f, true);
                Unit unit = Unit.INSTANCE;
                objQ = r16.q();
                if (objQ == c2565a) {
                    p1Var = p1Var4;
                    p1Var2 = p1Var5;
                    c cVar2 = new c(p1Var, p1Var2);
                    r16.K(cVar2);
                    obj2 = cVar2;
                } else {
                    p1Var = r32;
                    p1Var2 = r43;
                    obj2 = objQ;
                }
                r rVarB = b5.s0.b(rVarA2, unit, (PointerInputEventHandler) obj2);
                if (pVar != null) {
                    r16.C(-1386024636);
                    fX = w02.b0.x(r16, i26 / 2);
                    r16.g0(r14);
                } else {
                    r16.C(-1386024130);
                    r16.g0(r14);
                    fX = (float) r14;
                }
                float f24 = fX;
                if (pVar != null) {
                    r16.C(-17002342);
                    r16.g0(r14);
                } else {
                    if (nVar != null) {
                        r16.C(-16893191);
                        fX2 = w02.b0.x(r16, i26 / 2);
                        r16.g0(r14);
                    } else {
                        r16.C(-16780134);
                        r16.g0(r14);
                    }
                    float f25 = fX2;
                    if (nVar != null) {
                        r16.C(-1386009180);
                        fX3 = w02.b0.x(r16, i26 / 2);
                        r16.g0(r14);
                    } else {
                        r16.C(-1386008674);
                        r16.g0(r14);
                        fX3 = (float) r14;
                    }
                    r rVarC4 = l.C(rVarB, f25, f24, fX3, 0.0f, 8);
                    if ((i25 & 112) != 32) {
                        r17 = r14;
                        z15 = true;
                    } else {
                        r17 = 1;
                        z15 = true;
                    }
                    f18 = f17;
                    int i27 = (((r17 | (r16.r(list) ? 1 : 0)) | (r16.i(f19) ? 1 : 0)) == true ? 1 : 0) | (r16.i(f18) ? 1 : 0);
                    i19 = i18;
                    if ((i19 & 896) == 256) {
                        r18 = z15;
                    } else {
                        r18 = r14;
                    }
                    ?? r25 = i27 | r18;
                    if ((i19 & 7168) == 2048) {
                        r19 = z15;
                    } else {
                        r19 = r14;
                    }
                    int i28 = (r25 == true ? 1 : 0) | r19;
                    if ((3670016 & i19) == 1048576) {
                        r110 = z15;
                    } else {
                        r110 = r14;
                    }
                    ?? r26 = i28 | r110;
                    if ((234881024 & i19) == 67108864) {
                        r111 = z15;
                    } else {
                        r111 = r14;
                    }
                    int i29 = (r26 == true ? 1 : 0) | r111;
                    if ((458752 & i19) == 131072) {
                        r112 = z15;
                    } else {
                        r112 = r14;
                    }
                    ?? r27 = i29 | r112;
                    if ((57344 & i19) == 16384) {
                        r113 = z15;
                    } else {
                        r113 = r14;
                    }
                    int i30 = (r27 == true ? 1 : 0) | r113;
                    if ((29360128 & i19) == 8388608) {
                        r114 = z15;
                    } else {
                        r114 = r14;
                    }
                    ?? r28 = i30 | r114;
                    if ((i25 & 896) != 256) {
                        r115 = r14;
                    } else {
                        r115 = z15;
                    }
                    q0Var2 = q0Var;
                    i24 = (r28 == true ? 1 : 0) | r115 | (r16.r(q0Var2) ? 1 : 0);
                    objQ2 = r16.q();
                    if (i24 == 0 || objQ2 == c2565a) {
                        ?? r29 = r16;
                        p1Var3 = p1Var6;
                        m1Var = m1Var2;
                        e23.l lVar = new e23.l() { // from class: kf1.a
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // e23.l
                            public final Object invoke(Object obj6) throws Throwable {
                                Float f26;
                                float f27;
                                float floatValue;
                                float f28;
                                float f29;
                                if1.b bVar4 = bVar;
                                ArrayList arrayList = bVar4.f93200p;
                                q0 q0Var3 = q0Var2;
                                long j15 = q0Var3.f157282c;
                                float f34 = f14;
                                long j16 = j8;
                                Float f35 = f15;
                                p1 p1Var7 = p1Var3;
                                long j17 = j14;
                                q4.f fVar2 = (q4.f) obj6;
                                fVar2.getClass();
                                p pVar3 = pVar;
                                List<o13.p<Float, String>> list2 = list;
                                float f36 = f19;
                                float f37 = f18;
                                m1 m1Var3 = m1Var;
                                if (pVar3 != null) {
                                    float f38 = pVar3.a(fVar2, list2, j0.f134944a, f36).f125077a + f37;
                                    d92.b.f58623a.getClass();
                                    d92.b.f58625c.getClass();
                                    m1Var3.i(f38 + j92.b.f97899b.f97918c);
                                }
                                float floatValue2 = m1Var3.getFloatValue();
                                fVar2.getF142543b().f142550a.e(floatValue2, 0.0f, f37, f36);
                                try {
                                    long j18 = bVar4.f93188d.f93184d;
                                    o13.p pVar4 = (o13.p) h0.d0(list2);
                                    Float f39 = pVar4 != null ? (Float) pVar4.f128594a : null;
                                    o13.p pVar5 = (o13.p) h0.n0(list2);
                                    if (pVar5 != null) {
                                        f26 = (Float) pVar5.f128594a;
                                        f27 = -0.0f;
                                    } else {
                                        f26 = null;
                                        f27 = -0.0f;
                                    }
                                    try {
                                        p1Var7.setValue(d.b(fVar2, f34, j16, arrayList, f35, f39, f26));
                                        float f44 = -f37;
                                        float f45 = -f36;
                                        fVar2.getF142543b().f142550a.e(-floatValue2, f27, f44, f45);
                                        o82.g gVar2 = o82.g.f130854g;
                                        o82.g gVar3 = gVar;
                                        if (gVar3 == gVar2) {
                                            d92.b.f58623a.getClass();
                                            d92.b.f58625c.getClass();
                                            floatValue = j92.b.f97899b.f97921f;
                                        } else {
                                            floatValue = m1Var3.getFloatValue();
                                        }
                                        if (gVar3 == gVar2) {
                                            d92.b.f58623a.getClass();
                                            d92.b.f58625c.getClass();
                                            f28 = j92.b.f97899b.f97923h + f37;
                                        } else {
                                            f28 = f37;
                                        }
                                        fVar2.getF142543b().f142550a.e(floatValue, 0.0f, f28, f36);
                                        float f46 = 2;
                                        try {
                                            g6.f.a aVar6 = g6.f.f75994b;
                                            ArrayList arrayList2 = bVar4.f93201q;
                                            try {
                                                o13.p pVar6 = (o13.p) h0.d0(list2);
                                                Float f47 = pVar6 != null ? (Float) pVar6.f128594a : null;
                                                o13.p pVar7 = (o13.p) h0.n0(list2);
                                                try {
                                                    c0.e(fVar2, f46, new m92.m.d(j17, null), false, 0.0f, null, null, arrayList2, f35, null, null, f47, pVar7 != null ? (Float) pVar7.f128594a : null, gVar3 == gVar2 ? m92.e0.STEP : m92.e0.LINEAR, true, null, 17208);
                                                    fVar2.getF142543b().f142550a.e(-floatValue, -0.0f, -f28, f45);
                                                    if (z14) {
                                                        float floatValue3 = m1Var3.getFloatValue();
                                                        fVar2.getF142543b().f142550a.e(floatValue3, 0.0f, f37, f36);
                                                        boolean z17 = gVar3 == gVar2;
                                                        try {
                                                            m92.m.d dVar = new m92.m.d(j18, null);
                                                            float f48 = 3;
                                                            ArrayList arrayList3 = bVar4.f93202r;
                                                            o13.p pVar8 = (o13.p) h0.d0(list2);
                                                            Float f49 = pVar8 != null ? (Float) pVar8.f128594a : null;
                                                            o13.p pVar9 = (o13.p) h0.n0(list2);
                                                            c0.e(fVar2, f46, dVar, z17, f48, null, d0.a(j18), arrayList3, f35, null, null, f49, pVar9 != null ? (Float) pVar9.f128594a : null, null, true, null, 21264);
                                                            f29 = f44;
                                                            fVar2.getF142543b().f142550a.e(-floatValue3, -0.0f, f29, f45);
                                                        } catch (Throwable th4) {
                                                            fVar2.getF142543b().f142550a.e(-floatValue3, -0.0f, f44, f45);
                                                            throw th4;
                                                        }
                                                    } else {
                                                        f29 = f44;
                                                    }
                                                    n nVar2 = nVar;
                                                    if (nVar2 != null) {
                                                        float floatValue4 = m1Var3.getFloatValue();
                                                        fVar2.getF142543b().f142550a.e(floatValue4, 0.0f, f37, 0.0f);
                                                        try {
                                                            nVar2.a(fVar2, f36);
                                                            fVar2.getF142543b().f142550a.e(-floatValue4, -0.0f, f29, -0.0f);
                                                        } catch (Throwable th5) {
                                                            fVar2.getF142543b().f142550a.e(-floatValue4, -0.0f, f29, -0.0f);
                                                            throw th5;
                                                        }
                                                    }
                                                    if (arrayList.isEmpty()) {
                                                        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (n4.h.b(fVar2.b()) >> 32)) - (((int) (j15 >> 32)) / 2))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (n4.h.b(fVar2.b()) & 4294967295L)) - (((int) (j15 & 4294967295L)) / 2))) & 4294967295L);
                                                        n4.c.a aVar7 = n4.c.f123541b;
                                                        v0.b(fVar2, q0Var3, 0L, jFloatToRawIntBits, 250);
                                                    }
                                                    return Unit.INSTANCE;
                                                } catch (Throwable th6) {
                                                    th = th6;
                                                    fVar2 = fVar2;
                                                    fVar2.getF142543b().f142550a.e(-floatValue, -0.0f, -f28, f45);
                                                    throw th;
                                                }
                                            } catch (Throwable th7) {
                                                th = th7;
                                                fVar2 = fVar2;
                                            }
                                        } catch (Throwable th8) {
                                            th = th8;
                                        }
                                    } catch (Throwable th9) {
                                        th = th9;
                                        fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, -f37, -f36);
                                        throw th;
                                    }
                                } catch (Throwable th10) {
                                    th = th10;
                                    floatValue2 = floatValue2;
                                }
                            }
                        };
                        r29.K(lVar);
                        objQ2 = lVar;
                        r24 = r29;
                    } else {
                        r24 = r16;
                        p1Var3 = p1Var6;
                        m1Var = m1Var2;
                    }
                    u1.n.b(rVarC4, (e23.l) objQ2, r24, 0);
                    r24.g0(true);
                    if (((Boolean) p1Var2.getF182175a()).booleanValue() || qVar == null) {
                        ?? r119 = r24;
                        z16 = false;
                        r119.C(1395428592);
                        r119.g0(false);
                        r116 = r119;
                    } else {
                        r24.C(599195824);
                        Map map = (Map) p1Var3.getF182175a();
                        if (map == null) {
                            r24.C(1395201361);
                            z16 = false;
                            r24.g0(false);
                            r118 = r24;
                        } else {
                            z16 = false;
                            r24.C(1395201362);
                            n4.c cVar3 = (n4.c) p1Var.getF182175a();
                            if (cVar3 == null) {
                                r24.C(938196227);
                                r24.g0(false);
                                r117 = r24;
                            } else {
                                r24.C(938196228);
                                ?? r120 = r24;
                                m92.y.c(map, cVar3.f123544a, m1Var.getFloatValue(), f19, qVar, null, r120, 24576, 32);
                                r120.g0(false);
                                r117 = r120;
                            }
                            r117.g0(false);
                            r118 = r117;
                        }
                        r118.g0(z16);
                        r116 = r118;
                    }
                    r116.g0(true);
                    if (pVar2 == null) {
                        r116.C(998429281);
                    } else {
                        r116.C(-106339936);
                        pVar2.invoke(r116, 6);
                    }
                    r116.g0(z16);
                    r116.g0(true);
                    x1 x1Var2 = p3.n.f135158a;
                    r15 = r116;
                }
                fX2 = (float) r14;
                float f26 = fX2;
                if (nVar != null) {
                    r16.C(-1386009180);
                    fX3 = w02.b0.x(r16, i26 / 2);
                    r16.g0(r14);
                } else {
                    r16.C(-1386008674);
                    r16.g0(r14);
                    fX3 = (float) r14;
                }
                r rVarC5 = l.C(rVarB, f26, f24, fX3, 0.0f, 8);
                if ((i25 & 112) != 32) {
                    r17 = r14;
                    z15 = true;
                } else {
                    r17 = 1;
                    z15 = true;
                }
                f18 = f17;
                int i210 = (((r17 | (r16.r(list) ? 1 : 0)) | (r16.i(f19) ? 1 : 0)) == true ? 1 : 0) | (r16.i(f18) ? 1 : 0);
                i19 = i18;
                if ((i19 & 896) == 256) {
                    r18 = z15;
                } else {
                    r18 = r14;
                }
                ?? r210 = i210 | r18;
                if ((i19 & 7168) == 2048) {
                    r19 = z15;
                } else {
                    r19 = r14;
                }
                int i211 = (r210 == true ? 1 : 0) | r19;
                if ((3670016 & i19) == 1048576) {
                    r110 = z15;
                } else {
                    r110 = r14;
                }
                ?? r211 = i211 | r110;
                if ((234881024 & i19) == 67108864) {
                    r111 = z15;
                } else {
                    r111 = r14;
                }
                int i212 = (r211 == true ? 1 : 0) | r111;
                if ((458752 & i19) == 131072) {
                    r112 = z15;
                } else {
                    r112 = r14;
                }
                ?? r212 = i212 | r112;
                if ((57344 & i19) == 16384) {
                    r113 = z15;
                } else {
                    r113 = r14;
                }
                int i34 = (r212 == true ? 1 : 0) | r113;
                if ((29360128 & i19) == 8388608) {
                    r114 = z15;
                } else {
                    r114 = r14;
                }
                ?? r213 = i34 | r114;
                if ((i25 & 896) != 256) {
                    r115 = r14;
                } else {
                    r115 = z15;
                }
                q0Var2 = q0Var;
                i24 = (r213 == true ? 1 : 0) | r115 | (r16.r(q0Var2) ? 1 : 0);
                objQ2 = r16.q();
                if (i24 == 0) {
                    ?? r214 = r16;
                    p1Var3 = p1Var6;
                    m1Var = m1Var2;
                    e23.l lVar2 = new e23.l() { // from class: kf1.a
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // e23.l
                        public final Object invoke(Object obj6) throws Throwable {
                            Float f27;
                            float f28;
                            float floatValue;
                            float f29;
                            float f210;
                            if1.b bVar4 = bVar;
                            ArrayList arrayList = bVar4.f93200p;
                            q0 q0Var3 = q0Var2;
                            long j15 = q0Var3.f157282c;
                            float f34 = f14;
                            long j16 = j8;
                            Float f35 = f15;
                            p1 p1Var7 = p1Var3;
                            long j17 = j14;
                            q4.f fVar2 = (q4.f) obj6;
                            fVar2.getClass();
                            p pVar3 = pVar;
                            List<o13.p<Float, String>> list2 = list;
                            float f36 = f19;
                            float f37 = f18;
                            m1 m1Var3 = m1Var;
                            if (pVar3 != null) {
                                float f38 = pVar3.a(fVar2, list2, j0.f134944a, f36).f125077a + f37;
                                d92.b.f58623a.getClass();
                                d92.b.f58625c.getClass();
                                m1Var3.i(f38 + j92.b.f97899b.f97918c);
                            }
                            float floatValue2 = m1Var3.getFloatValue();
                            fVar2.getF142543b().f142550a.e(floatValue2, 0.0f, f37, f36);
                            try {
                                long j18 = bVar4.f93188d.f93184d;
                                o13.p pVar4 = (o13.p) h0.d0(list2);
                                Float f39 = pVar4 != null ? (Float) pVar4.f128594a : null;
                                o13.p pVar5 = (o13.p) h0.n0(list2);
                                if (pVar5 != null) {
                                    f27 = (Float) pVar5.f128594a;
                                    f28 = -0.0f;
                                } else {
                                    f27 = null;
                                    f28 = -0.0f;
                                }
                                try {
                                    p1Var7.setValue(d.b(fVar2, f34, j16, arrayList, f35, f39, f27));
                                    float f44 = -f37;
                                    float f45 = -f36;
                                    fVar2.getF142543b().f142550a.e(-floatValue2, f28, f44, f45);
                                    o82.g gVar2 = o82.g.f130854g;
                                    o82.g gVar3 = gVar;
                                    if (gVar3 == gVar2) {
                                        d92.b.f58623a.getClass();
                                        d92.b.f58625c.getClass();
                                        floatValue = j92.b.f97899b.f97921f;
                                    } else {
                                        floatValue = m1Var3.getFloatValue();
                                    }
                                    if (gVar3 == gVar2) {
                                        d92.b.f58623a.getClass();
                                        d92.b.f58625c.getClass();
                                        f29 = j92.b.f97899b.f97923h + f37;
                                    } else {
                                        f29 = f37;
                                    }
                                    fVar2.getF142543b().f142550a.e(floatValue, 0.0f, f29, f36);
                                    float f46 = 2;
                                    try {
                                        g6.f.a aVar6 = g6.f.f75994b;
                                        ArrayList arrayList2 = bVar4.f93201q;
                                        try {
                                            o13.p pVar6 = (o13.p) h0.d0(list2);
                                            Float f47 = pVar6 != null ? (Float) pVar6.f128594a : null;
                                            o13.p pVar7 = (o13.p) h0.n0(list2);
                                            try {
                                                c0.e(fVar2, f46, new m92.m.d(j17, null), false, 0.0f, null, null, arrayList2, f35, null, null, f47, pVar7 != null ? (Float) pVar7.f128594a : null, gVar3 == gVar2 ? m92.e0.STEP : m92.e0.LINEAR, true, null, 17208);
                                                fVar2.getF142543b().f142550a.e(-floatValue, -0.0f, -f29, f45);
                                                if (z14) {
                                                    float floatValue3 = m1Var3.getFloatValue();
                                                    fVar2.getF142543b().f142550a.e(floatValue3, 0.0f, f37, f36);
                                                    boolean z17 = gVar3 == gVar2;
                                                    try {
                                                        m92.m.d dVar = new m92.m.d(j18, null);
                                                        float f48 = 3;
                                                        ArrayList arrayList3 = bVar4.f93202r;
                                                        o13.p pVar8 = (o13.p) h0.d0(list2);
                                                        Float f49 = pVar8 != null ? (Float) pVar8.f128594a : null;
                                                        o13.p pVar9 = (o13.p) h0.n0(list2);
                                                        c0.e(fVar2, f46, dVar, z17, f48, null, d0.a(j18), arrayList3, f35, null, null, f49, pVar9 != null ? (Float) pVar9.f128594a : null, null, true, null, 21264);
                                                        f210 = f44;
                                                        fVar2.getF142543b().f142550a.e(-floatValue3, -0.0f, f210, f45);
                                                    } catch (Throwable th4) {
                                                        fVar2.getF142543b().f142550a.e(-floatValue3, -0.0f, f44, f45);
                                                        throw th4;
                                                    }
                                                } else {
                                                    f210 = f44;
                                                }
                                                n nVar2 = nVar;
                                                if (nVar2 != null) {
                                                    float floatValue4 = m1Var3.getFloatValue();
                                                    fVar2.getF142543b().f142550a.e(floatValue4, 0.0f, f37, 0.0f);
                                                    try {
                                                        nVar2.a(fVar2, f36);
                                                        fVar2.getF142543b().f142550a.e(-floatValue4, -0.0f, f210, -0.0f);
                                                    } catch (Throwable th5) {
                                                        fVar2.getF142543b().f142550a.e(-floatValue4, -0.0f, f210, -0.0f);
                                                        throw th5;
                                                    }
                                                }
                                                if (arrayList.isEmpty()) {
                                                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (n4.h.b(fVar2.b()) >> 32)) - (((int) (j15 >> 32)) / 2))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (n4.h.b(fVar2.b()) & 4294967295L)) - (((int) (j15 & 4294967295L)) / 2))) & 4294967295L);
                                                    n4.c.a aVar7 = n4.c.f123541b;
                                                    v0.b(fVar2, q0Var3, 0L, jFloatToRawIntBits, 250);
                                                }
                                                return Unit.INSTANCE;
                                            } catch (Throwable th6) {
                                                th = th6;
                                                fVar2 = fVar2;
                                                fVar2.getF142543b().f142550a.e(-floatValue, -0.0f, -f29, f45);
                                                throw th;
                                            }
                                        } catch (Throwable th7) {
                                            th = th7;
                                            fVar2 = fVar2;
                                        }
                                    } catch (Throwable th8) {
                                        th = th8;
                                    }
                                } catch (Throwable th9) {
                                    th = th9;
                                    fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, -f37, -f36);
                                    throw th;
                                }
                            } catch (Throwable th10) {
                                th = th10;
                                floatValue2 = floatValue2;
                            }
                        }
                    };
                    r214.K(lVar2);
                    objQ2 = lVar2;
                    r24 = r214;
                } else {
                    ?? r215 = r16;
                    p1Var3 = p1Var6;
                    m1Var = m1Var2;
                    e23.l lVar3 = new e23.l() { // from class: kf1.a
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // e23.l
                        public final Object invoke(Object obj6) throws Throwable {
                            Float f27;
                            float f28;
                            float floatValue;
                            float f29;
                            float f210;
                            if1.b bVar4 = bVar;
                            ArrayList arrayList = bVar4.f93200p;
                            q0 q0Var3 = q0Var2;
                            long j15 = q0Var3.f157282c;
                            float f34 = f14;
                            long j16 = j8;
                            Float f35 = f15;
                            p1 p1Var7 = p1Var3;
                            long j17 = j14;
                            q4.f fVar2 = (q4.f) obj6;
                            fVar2.getClass();
                            p pVar3 = pVar;
                            List<o13.p<Float, String>> list2 = list;
                            float f36 = f19;
                            float f37 = f18;
                            m1 m1Var3 = m1Var;
                            if (pVar3 != null) {
                                float f38 = pVar3.a(fVar2, list2, j0.f134944a, f36).f125077a + f37;
                                d92.b.f58623a.getClass();
                                d92.b.f58625c.getClass();
                                m1Var3.i(f38 + j92.b.f97899b.f97918c);
                            }
                            float floatValue2 = m1Var3.getFloatValue();
                            fVar2.getF142543b().f142550a.e(floatValue2, 0.0f, f37, f36);
                            try {
                                long j18 = bVar4.f93188d.f93184d;
                                o13.p pVar4 = (o13.p) h0.d0(list2);
                                Float f39 = pVar4 != null ? (Float) pVar4.f128594a : null;
                                o13.p pVar5 = (o13.p) h0.n0(list2);
                                if (pVar5 != null) {
                                    f27 = (Float) pVar5.f128594a;
                                    f28 = -0.0f;
                                } else {
                                    f27 = null;
                                    f28 = -0.0f;
                                }
                                try {
                                    p1Var7.setValue(d.b(fVar2, f34, j16, arrayList, f35, f39, f27));
                                    float f44 = -f37;
                                    float f45 = -f36;
                                    fVar2.getF142543b().f142550a.e(-floatValue2, f28, f44, f45);
                                    o82.g gVar2 = o82.g.f130854g;
                                    o82.g gVar3 = gVar;
                                    if (gVar3 == gVar2) {
                                        d92.b.f58623a.getClass();
                                        d92.b.f58625c.getClass();
                                        floatValue = j92.b.f97899b.f97921f;
                                    } else {
                                        floatValue = m1Var3.getFloatValue();
                                    }
                                    if (gVar3 == gVar2) {
                                        d92.b.f58623a.getClass();
                                        d92.b.f58625c.getClass();
                                        f29 = j92.b.f97899b.f97923h + f37;
                                    } else {
                                        f29 = f37;
                                    }
                                    fVar2.getF142543b().f142550a.e(floatValue, 0.0f, f29, f36);
                                    float f46 = 2;
                                    try {
                                        g6.f.a aVar6 = g6.f.f75994b;
                                        ArrayList arrayList2 = bVar4.f93201q;
                                        try {
                                            o13.p pVar6 = (o13.p) h0.d0(list2);
                                            Float f47 = pVar6 != null ? (Float) pVar6.f128594a : null;
                                            o13.p pVar7 = (o13.p) h0.n0(list2);
                                            try {
                                                c0.e(fVar2, f46, new m92.m.d(j17, null), false, 0.0f, null, null, arrayList2, f35, null, null, f47, pVar7 != null ? (Float) pVar7.f128594a : null, gVar3 == gVar2 ? m92.e0.STEP : m92.e0.LINEAR, true, null, 17208);
                                                fVar2.getF142543b().f142550a.e(-floatValue, -0.0f, -f29, f45);
                                                if (z14) {
                                                    float floatValue3 = m1Var3.getFloatValue();
                                                    fVar2.getF142543b().f142550a.e(floatValue3, 0.0f, f37, f36);
                                                    boolean z17 = gVar3 == gVar2;
                                                    try {
                                                        m92.m.d dVar = new m92.m.d(j18, null);
                                                        float f48 = 3;
                                                        ArrayList arrayList3 = bVar4.f93202r;
                                                        o13.p pVar8 = (o13.p) h0.d0(list2);
                                                        Float f49 = pVar8 != null ? (Float) pVar8.f128594a : null;
                                                        o13.p pVar9 = (o13.p) h0.n0(list2);
                                                        c0.e(fVar2, f46, dVar, z17, f48, null, d0.a(j18), arrayList3, f35, null, null, f49, pVar9 != null ? (Float) pVar9.f128594a : null, null, true, null, 21264);
                                                        f210 = f44;
                                                        fVar2.getF142543b().f142550a.e(-floatValue3, -0.0f, f210, f45);
                                                    } catch (Throwable th4) {
                                                        fVar2.getF142543b().f142550a.e(-floatValue3, -0.0f, f44, f45);
                                                        throw th4;
                                                    }
                                                } else {
                                                    f210 = f44;
                                                }
                                                n nVar2 = nVar;
                                                if (nVar2 != null) {
                                                    float floatValue4 = m1Var3.getFloatValue();
                                                    fVar2.getF142543b().f142550a.e(floatValue4, 0.0f, f37, 0.0f);
                                                    try {
                                                        nVar2.a(fVar2, f36);
                                                        fVar2.getF142543b().f142550a.e(-floatValue4, -0.0f, f210, -0.0f);
                                                    } catch (Throwable th5) {
                                                        fVar2.getF142543b().f142550a.e(-floatValue4, -0.0f, f210, -0.0f);
                                                        throw th5;
                                                    }
                                                }
                                                if (arrayList.isEmpty()) {
                                                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (n4.h.b(fVar2.b()) >> 32)) - (((int) (j15 >> 32)) / 2))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (n4.h.b(fVar2.b()) & 4294967295L)) - (((int) (j15 & 4294967295L)) / 2))) & 4294967295L);
                                                    n4.c.a aVar7 = n4.c.f123541b;
                                                    v0.b(fVar2, q0Var3, 0L, jFloatToRawIntBits, 250);
                                                }
                                                return Unit.INSTANCE;
                                            } catch (Throwable th6) {
                                                th = th6;
                                                fVar2 = fVar2;
                                                fVar2.getF142543b().f142550a.e(-floatValue, -0.0f, -f29, f45);
                                                throw th;
                                            }
                                        } catch (Throwable th7) {
                                            th = th7;
                                            fVar2 = fVar2;
                                        }
                                    } catch (Throwable th8) {
                                        th = th8;
                                    }
                                } catch (Throwable th9) {
                                    th = th9;
                                    fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, -f37, -f36);
                                    throw th;
                                }
                            } catch (Throwable th10) {
                                th = th10;
                                floatValue2 = floatValue2;
                            }
                        }
                    };
                    r215.K(lVar3);
                    objQ2 = lVar3;
                    r24 = r215;
                }
                u1.n.b(rVarC5, (e23.l) objQ2, r24, 0);
                r24.g0(true);
                if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                    ?? r1110 = r24;
                    z16 = false;
                    r1110.C(1395428592);
                    r1110.g0(false);
                    r116 = r1110;
                } else {
                    ?? r1111 = r24;
                    z16 = false;
                    r1111.C(1395428592);
                    r1111.g0(false);
                    r116 = r1111;
                }
                r116.g0(true);
                if (pVar2 == null) {
                    r116.C(998429281);
                } else {
                    r116.C(-106339936);
                    pVar2.invoke(r116, 6);
                }
                r116.g0(z16);
                r116.g0(true);
                x1 x1Var3 = p3.n.f135158a;
                r15 = r116;
            }
            v.h.A(iHashCode3, o0VarE, iHashCode3, bVar2);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC3, o0VarE);
            b0Var = b0.f22601a;
            aVar = r.S;
            i17 = i16;
            r rVarA3 = b0Var.a(aVar, 1.0f, true);
            z0VarD = c2.q.d(h4.d.a.f81524b, false);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = k.c(rVarA3, o0VarE);
            if (cVar != null) {
                p0.l();
                throw th3;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
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
            r rVarD2 = x2.d(aVar, 1.0f);
            zVarA = y.a(kVar, aVar4, o0VarE, 0);
            iHashCode2 = Long.hashCode(o0VarE.U);
            i2VarA1 = o0VarE.a0();
            rVarC2 = k.c(rVarD2, o0VarE);
            if (cVar != null) {
                p0.l();
                throw th3;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
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
            if (str != null) {
                o0VarE.C(-18468146);
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                x0 x0VarB2 = d92.c.b(j92.f.f97931h, o0VarE);
                j92.b bVar4 = d92.b.f58625c;
                bVar4.getClass();
                j92.e eVar3 = j92.b.f97899b;
                float f27 = eVar3.f97920e;
                bVar4.getClass();
                r14 = 0;
                i18 = i17;
                q0Var = q0VarA;
                aVar2 = aVar;
                mh.c(str, l.C(aVar, 0.0f, f27, 0.0f, eVar3.f97922g, 5), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB2, o0VarE, (i17 >> 3) & 14, 0, 131068);
                o0 o0Var3 = o0VarE;
                o0Var3.g0(false);
                r16 = o0Var3;
            } else {
                aVar2 = aVar;
                q0Var = q0VarA;
                r14 = 0;
                o0 o0Var4 = o0VarE;
                i18 = i17;
                o0Var4.C(-18211962);
                o0Var4.g0(false);
                r16 = o0Var4;
            }
            r rVarA4 = b0Var.a(x2.f(aVar2, 1.0f), 1.0f, true);
            Unit unit2 = Unit.INSTANCE;
            objQ = r16.q();
            if (objQ == c2565a) {
                p1Var = p1Var4;
                p1Var2 = p1Var5;
                c cVar4 = new c(p1Var, p1Var2);
                r16.K(cVar4);
                obj2 = cVar4;
            } else {
                p1Var = r32;
                p1Var2 = r43;
                obj2 = objQ;
            }
            r rVarB2 = b5.s0.b(rVarA4, unit2, (PointerInputEventHandler) obj2);
            if (pVar != null) {
                r16.C(-1386024636);
                fX = w02.b0.x(r16, i26 / 2);
                r16.g0(r14);
            } else {
                r16.C(-1386024130);
                r16.g0(r14);
                fX = (float) r14;
            }
            float f28 = fX;
            if (pVar != null) {
                r16.C(-17002342);
                r16.g0(r14);
            } else {
                if (nVar != null) {
                    r16.C(-16893191);
                    fX2 = w02.b0.x(r16, i26 / 2);
                    r16.g0(r14);
                } else {
                    r16.C(-16780134);
                    r16.g0(r14);
                }
                float f29 = fX2;
                if (nVar != null) {
                    r16.C(-1386009180);
                    fX3 = w02.b0.x(r16, i26 / 2);
                    r16.g0(r14);
                } else {
                    r16.C(-1386008674);
                    r16.g0(r14);
                    fX3 = (float) r14;
                }
                r rVarC6 = l.C(rVarB2, f29, f28, fX3, 0.0f, 8);
                if ((i25 & 112) != 32) {
                    r17 = r14;
                    z15 = true;
                } else {
                    r17 = 1;
                    z15 = true;
                }
                f18 = f17;
                int i213 = (((r17 | (r16.r(list) ? 1 : 0)) | (r16.i(f19) ? 1 : 0)) == true ? 1 : 0) | (r16.i(f18) ? 1 : 0);
                i19 = i18;
                if ((i19 & 896) == 256) {
                    r18 = z15;
                } else {
                    r18 = r14;
                }
                ?? r216 = i213 | r18;
                if ((i19 & 7168) == 2048) {
                    r19 = z15;
                } else {
                    r19 = r14;
                }
                int i214 = (r216 == true ? 1 : 0) | r19;
                if ((3670016 & i19) == 1048576) {
                    r110 = z15;
                } else {
                    r110 = r14;
                }
                ?? r217 = i214 | r110;
                if ((234881024 & i19) == 67108864) {
                    r111 = z15;
                } else {
                    r111 = r14;
                }
                int i215 = (r217 == true ? 1 : 0) | r111;
                if ((458752 & i19) == 131072) {
                    r112 = z15;
                } else {
                    r112 = r14;
                }
                ?? r218 = i215 | r112;
                if ((57344 & i19) == 16384) {
                    r113 = z15;
                } else {
                    r113 = r14;
                }
                int i35 = (r218 == true ? 1 : 0) | r113;
                if ((29360128 & i19) == 8388608) {
                    r114 = z15;
                } else {
                    r114 = r14;
                }
                ?? r219 = i35 | r114;
                if ((i25 & 896) != 256) {
                    r115 = r14;
                } else {
                    r115 = z15;
                }
                q0Var2 = q0Var;
                i24 = (r219 == true ? 1 : 0) | r115 | (r16.r(q0Var2) ? 1 : 0);
                objQ2 = r16.q();
                if (i24 == 0) {
                    ?? r2110 = r16;
                    p1Var3 = p1Var6;
                    m1Var = m1Var2;
                    e23.l lVar4 = new e23.l() { // from class: kf1.a
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // e23.l
                        public final Object invoke(Object obj6) throws Throwable {
                            Float f210;
                            float f211;
                            float floatValue;
                            float f212;
                            float f213;
                            if1.b bVar5 = bVar;
                            ArrayList arrayList = bVar5.f93200p;
                            q0 q0Var3 = q0Var2;
                            long j15 = q0Var3.f157282c;
                            float f34 = f14;
                            long j16 = j8;
                            Float f35 = f15;
                            p1 p1Var7 = p1Var3;
                            long j17 = j14;
                            q4.f fVar2 = (q4.f) obj6;
                            fVar2.getClass();
                            p pVar3 = pVar;
                            List<o13.p<Float, String>> list2 = list;
                            float f36 = f19;
                            float f37 = f18;
                            m1 m1Var3 = m1Var;
                            if (pVar3 != null) {
                                float f38 = pVar3.a(fVar2, list2, j0.f134944a, f36).f125077a + f37;
                                d92.b.f58623a.getClass();
                                d92.b.f58625c.getClass();
                                m1Var3.i(f38 + j92.b.f97899b.f97918c);
                            }
                            float floatValue2 = m1Var3.getFloatValue();
                            fVar2.getF142543b().f142550a.e(floatValue2, 0.0f, f37, f36);
                            try {
                                long j18 = bVar5.f93188d.f93184d;
                                o13.p pVar4 = (o13.p) h0.d0(list2);
                                Float f39 = pVar4 != null ? (Float) pVar4.f128594a : null;
                                o13.p pVar5 = (o13.p) h0.n0(list2);
                                if (pVar5 != null) {
                                    f210 = (Float) pVar5.f128594a;
                                    f211 = -0.0f;
                                } else {
                                    f210 = null;
                                    f211 = -0.0f;
                                }
                                try {
                                    p1Var7.setValue(d.b(fVar2, f34, j16, arrayList, f35, f39, f210));
                                    float f44 = -f37;
                                    float f45 = -f36;
                                    fVar2.getF142543b().f142550a.e(-floatValue2, f211, f44, f45);
                                    o82.g gVar2 = o82.g.f130854g;
                                    o82.g gVar3 = gVar;
                                    if (gVar3 == gVar2) {
                                        d92.b.f58623a.getClass();
                                        d92.b.f58625c.getClass();
                                        floatValue = j92.b.f97899b.f97921f;
                                    } else {
                                        floatValue = m1Var3.getFloatValue();
                                    }
                                    if (gVar3 == gVar2) {
                                        d92.b.f58623a.getClass();
                                        d92.b.f58625c.getClass();
                                        f212 = j92.b.f97899b.f97923h + f37;
                                    } else {
                                        f212 = f37;
                                    }
                                    fVar2.getF142543b().f142550a.e(floatValue, 0.0f, f212, f36);
                                    float f46 = 2;
                                    try {
                                        g6.f.a aVar6 = g6.f.f75994b;
                                        ArrayList arrayList2 = bVar5.f93201q;
                                        try {
                                            o13.p pVar6 = (o13.p) h0.d0(list2);
                                            Float f47 = pVar6 != null ? (Float) pVar6.f128594a : null;
                                            o13.p pVar7 = (o13.p) h0.n0(list2);
                                            try {
                                                c0.e(fVar2, f46, new m92.m.d(j17, null), false, 0.0f, null, null, arrayList2, f35, null, null, f47, pVar7 != null ? (Float) pVar7.f128594a : null, gVar3 == gVar2 ? m92.e0.STEP : m92.e0.LINEAR, true, null, 17208);
                                                fVar2.getF142543b().f142550a.e(-floatValue, -0.0f, -f212, f45);
                                                if (z14) {
                                                    float floatValue3 = m1Var3.getFloatValue();
                                                    fVar2.getF142543b().f142550a.e(floatValue3, 0.0f, f37, f36);
                                                    boolean z17 = gVar3 == gVar2;
                                                    try {
                                                        m92.m.d dVar = new m92.m.d(j18, null);
                                                        float f48 = 3;
                                                        ArrayList arrayList3 = bVar5.f93202r;
                                                        o13.p pVar8 = (o13.p) h0.d0(list2);
                                                        Float f49 = pVar8 != null ? (Float) pVar8.f128594a : null;
                                                        o13.p pVar9 = (o13.p) h0.n0(list2);
                                                        c0.e(fVar2, f46, dVar, z17, f48, null, d0.a(j18), arrayList3, f35, null, null, f49, pVar9 != null ? (Float) pVar9.f128594a : null, null, true, null, 21264);
                                                        f213 = f44;
                                                        fVar2.getF142543b().f142550a.e(-floatValue3, -0.0f, f213, f45);
                                                    } catch (Throwable th4) {
                                                        fVar2.getF142543b().f142550a.e(-floatValue3, -0.0f, f44, f45);
                                                        throw th4;
                                                    }
                                                } else {
                                                    f213 = f44;
                                                }
                                                n nVar2 = nVar;
                                                if (nVar2 != null) {
                                                    float floatValue4 = m1Var3.getFloatValue();
                                                    fVar2.getF142543b().f142550a.e(floatValue4, 0.0f, f37, 0.0f);
                                                    try {
                                                        nVar2.a(fVar2, f36);
                                                        fVar2.getF142543b().f142550a.e(-floatValue4, -0.0f, f213, -0.0f);
                                                    } catch (Throwable th5) {
                                                        fVar2.getF142543b().f142550a.e(-floatValue4, -0.0f, f213, -0.0f);
                                                        throw th5;
                                                    }
                                                }
                                                if (arrayList.isEmpty()) {
                                                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (n4.h.b(fVar2.b()) >> 32)) - (((int) (j15 >> 32)) / 2))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (n4.h.b(fVar2.b()) & 4294967295L)) - (((int) (j15 & 4294967295L)) / 2))) & 4294967295L);
                                                    n4.c.a aVar7 = n4.c.f123541b;
                                                    v0.b(fVar2, q0Var3, 0L, jFloatToRawIntBits, 250);
                                                }
                                                return Unit.INSTANCE;
                                            } catch (Throwable th6) {
                                                th = th6;
                                                fVar2 = fVar2;
                                                fVar2.getF142543b().f142550a.e(-floatValue, -0.0f, -f212, f45);
                                                throw th;
                                            }
                                        } catch (Throwable th7) {
                                            th = th7;
                                            fVar2 = fVar2;
                                        }
                                    } catch (Throwable th8) {
                                        th = th8;
                                    }
                                } catch (Throwable th9) {
                                    th = th9;
                                    fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, -f37, -f36);
                                    throw th;
                                }
                            } catch (Throwable th10) {
                                th = th10;
                                floatValue2 = floatValue2;
                            }
                        }
                    };
                    r2110.K(lVar4);
                    objQ2 = lVar4;
                    r24 = r2110;
                } else {
                    ?? r2111 = r16;
                    p1Var3 = p1Var6;
                    m1Var = m1Var2;
                    e23.l lVar5 = new e23.l() { // from class: kf1.a
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // e23.l
                        public final Object invoke(Object obj6) throws Throwable {
                            Float f210;
                            float f211;
                            float floatValue;
                            float f212;
                            float f213;
                            if1.b bVar5 = bVar;
                            ArrayList arrayList = bVar5.f93200p;
                            q0 q0Var3 = q0Var2;
                            long j15 = q0Var3.f157282c;
                            float f34 = f14;
                            long j16 = j8;
                            Float f35 = f15;
                            p1 p1Var7 = p1Var3;
                            long j17 = j14;
                            q4.f fVar2 = (q4.f) obj6;
                            fVar2.getClass();
                            p pVar3 = pVar;
                            List<o13.p<Float, String>> list2 = list;
                            float f36 = f19;
                            float f37 = f18;
                            m1 m1Var3 = m1Var;
                            if (pVar3 != null) {
                                float f38 = pVar3.a(fVar2, list2, j0.f134944a, f36).f125077a + f37;
                                d92.b.f58623a.getClass();
                                d92.b.f58625c.getClass();
                                m1Var3.i(f38 + j92.b.f97899b.f97918c);
                            }
                            float floatValue2 = m1Var3.getFloatValue();
                            fVar2.getF142543b().f142550a.e(floatValue2, 0.0f, f37, f36);
                            try {
                                long j18 = bVar5.f93188d.f93184d;
                                o13.p pVar4 = (o13.p) h0.d0(list2);
                                Float f39 = pVar4 != null ? (Float) pVar4.f128594a : null;
                                o13.p pVar5 = (o13.p) h0.n0(list2);
                                if (pVar5 != null) {
                                    f210 = (Float) pVar5.f128594a;
                                    f211 = -0.0f;
                                } else {
                                    f210 = null;
                                    f211 = -0.0f;
                                }
                                try {
                                    p1Var7.setValue(d.b(fVar2, f34, j16, arrayList, f35, f39, f210));
                                    float f44 = -f37;
                                    float f45 = -f36;
                                    fVar2.getF142543b().f142550a.e(-floatValue2, f211, f44, f45);
                                    o82.g gVar2 = o82.g.f130854g;
                                    o82.g gVar3 = gVar;
                                    if (gVar3 == gVar2) {
                                        d92.b.f58623a.getClass();
                                        d92.b.f58625c.getClass();
                                        floatValue = j92.b.f97899b.f97921f;
                                    } else {
                                        floatValue = m1Var3.getFloatValue();
                                    }
                                    if (gVar3 == gVar2) {
                                        d92.b.f58623a.getClass();
                                        d92.b.f58625c.getClass();
                                        f212 = j92.b.f97899b.f97923h + f37;
                                    } else {
                                        f212 = f37;
                                    }
                                    fVar2.getF142543b().f142550a.e(floatValue, 0.0f, f212, f36);
                                    float f46 = 2;
                                    try {
                                        g6.f.a aVar6 = g6.f.f75994b;
                                        ArrayList arrayList2 = bVar5.f93201q;
                                        try {
                                            o13.p pVar6 = (o13.p) h0.d0(list2);
                                            Float f47 = pVar6 != null ? (Float) pVar6.f128594a : null;
                                            o13.p pVar7 = (o13.p) h0.n0(list2);
                                            try {
                                                c0.e(fVar2, f46, new m92.m.d(j17, null), false, 0.0f, null, null, arrayList2, f35, null, null, f47, pVar7 != null ? (Float) pVar7.f128594a : null, gVar3 == gVar2 ? m92.e0.STEP : m92.e0.LINEAR, true, null, 17208);
                                                fVar2.getF142543b().f142550a.e(-floatValue, -0.0f, -f212, f45);
                                                if (z14) {
                                                    float floatValue3 = m1Var3.getFloatValue();
                                                    fVar2.getF142543b().f142550a.e(floatValue3, 0.0f, f37, f36);
                                                    boolean z17 = gVar3 == gVar2;
                                                    try {
                                                        m92.m.d dVar = new m92.m.d(j18, null);
                                                        float f48 = 3;
                                                        ArrayList arrayList3 = bVar5.f93202r;
                                                        o13.p pVar8 = (o13.p) h0.d0(list2);
                                                        Float f49 = pVar8 != null ? (Float) pVar8.f128594a : null;
                                                        o13.p pVar9 = (o13.p) h0.n0(list2);
                                                        c0.e(fVar2, f46, dVar, z17, f48, null, d0.a(j18), arrayList3, f35, null, null, f49, pVar9 != null ? (Float) pVar9.f128594a : null, null, true, null, 21264);
                                                        f213 = f44;
                                                        fVar2.getF142543b().f142550a.e(-floatValue3, -0.0f, f213, f45);
                                                    } catch (Throwable th4) {
                                                        fVar2.getF142543b().f142550a.e(-floatValue3, -0.0f, f44, f45);
                                                        throw th4;
                                                    }
                                                } else {
                                                    f213 = f44;
                                                }
                                                n nVar2 = nVar;
                                                if (nVar2 != null) {
                                                    float floatValue4 = m1Var3.getFloatValue();
                                                    fVar2.getF142543b().f142550a.e(floatValue4, 0.0f, f37, 0.0f);
                                                    try {
                                                        nVar2.a(fVar2, f36);
                                                        fVar2.getF142543b().f142550a.e(-floatValue4, -0.0f, f213, -0.0f);
                                                    } catch (Throwable th5) {
                                                        fVar2.getF142543b().f142550a.e(-floatValue4, -0.0f, f213, -0.0f);
                                                        throw th5;
                                                    }
                                                }
                                                if (arrayList.isEmpty()) {
                                                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (n4.h.b(fVar2.b()) >> 32)) - (((int) (j15 >> 32)) / 2))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (n4.h.b(fVar2.b()) & 4294967295L)) - (((int) (j15 & 4294967295L)) / 2))) & 4294967295L);
                                                    n4.c.a aVar7 = n4.c.f123541b;
                                                    v0.b(fVar2, q0Var3, 0L, jFloatToRawIntBits, 250);
                                                }
                                                return Unit.INSTANCE;
                                            } catch (Throwable th6) {
                                                th = th6;
                                                fVar2 = fVar2;
                                                fVar2.getF142543b().f142550a.e(-floatValue, -0.0f, -f212, f45);
                                                throw th;
                                            }
                                        } catch (Throwable th7) {
                                            th = th7;
                                            fVar2 = fVar2;
                                        }
                                    } catch (Throwable th8) {
                                        th = th8;
                                    }
                                } catch (Throwable th9) {
                                    th = th9;
                                    fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, -f37, -f36);
                                    throw th;
                                }
                            } catch (Throwable th10) {
                                th = th10;
                                floatValue2 = floatValue2;
                            }
                        }
                    };
                    r2111.K(lVar5);
                    objQ2 = lVar5;
                    r24 = r2111;
                }
                u1.n.b(rVarC6, (e23.l) objQ2, r24, 0);
                r24.g0(true);
                if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                    ?? r1112 = r24;
                    z16 = false;
                    r1112.C(1395428592);
                    r1112.g0(false);
                    r116 = r1112;
                } else {
                    ?? r1113 = r24;
                    z16 = false;
                    r1113.C(1395428592);
                    r1113.g0(false);
                    r116 = r1113;
                }
                r116.g0(true);
                if (pVar2 == null) {
                    r116.C(998429281);
                } else {
                    r116.C(-106339936);
                    pVar2.invoke(r116, 6);
                }
                r116.g0(z16);
                r116.g0(true);
                x1 x1Var4 = p3.n.f135158a;
                r15 = r116;
            }
            fX2 = (float) r14;
            float f210 = fX2;
            if (nVar != null) {
                r16.C(-1386009180);
                fX3 = w02.b0.x(r16, i26 / 2);
                r16.g0(r14);
            } else {
                r16.C(-1386008674);
                r16.g0(r14);
                fX3 = (float) r14;
            }
            r rVarC7 = l.C(rVarB2, f210, f28, fX3, 0.0f, 8);
            if ((i25 & 112) != 32) {
                r17 = r14;
                z15 = true;
            } else {
                r17 = 1;
                z15 = true;
            }
            f18 = f17;
            int i216 = (((r17 | (r16.r(list) ? 1 : 0)) | (r16.i(f19) ? 1 : 0)) == true ? 1 : 0) | (r16.i(f18) ? 1 : 0);
            i19 = i18;
            if ((i19 & 896) == 256) {
                r18 = z15;
            } else {
                r18 = r14;
            }
            ?? r2112 = i216 | r18;
            if ((i19 & 7168) == 2048) {
                r19 = z15;
            } else {
                r19 = r14;
            }
            int i217 = (r2112 == true ? 1 : 0) | r19;
            if ((3670016 & i19) == 1048576) {
                r110 = z15;
            } else {
                r110 = r14;
            }
            ?? r2113 = i217 | r110;
            if ((234881024 & i19) == 67108864) {
                r111 = z15;
            } else {
                r111 = r14;
            }
            int i218 = (r2113 == true ? 1 : 0) | r111;
            if ((458752 & i19) == 131072) {
                r112 = z15;
            } else {
                r112 = r14;
            }
            ?? r2114 = i218 | r112;
            if ((57344 & i19) == 16384) {
                r113 = z15;
            } else {
                r113 = r14;
            }
            int i36 = (r2114 == true ? 1 : 0) | r113;
            if ((29360128 & i19) == 8388608) {
                r114 = z15;
            } else {
                r114 = r14;
            }
            ?? r2115 = i36 | r114;
            if ((i25 & 896) != 256) {
                r115 = r14;
            } else {
                r115 = z15;
            }
            q0Var2 = q0Var;
            i24 = (r2115 == true ? 1 : 0) | r115 | (r16.r(q0Var2) ? 1 : 0);
            objQ2 = r16.q();
            if (i24 == 0) {
                ?? r2116 = r16;
                p1Var3 = p1Var6;
                m1Var = m1Var2;
                e23.l lVar6 = new e23.l() { // from class: kf1.a
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // e23.l
                    public final Object invoke(Object obj6) throws Throwable {
                        Float f211;
                        float f212;
                        float floatValue;
                        float f213;
                        float f214;
                        if1.b bVar5 = bVar;
                        ArrayList arrayList = bVar5.f93200p;
                        q0 q0Var3 = q0Var2;
                        long j15 = q0Var3.f157282c;
                        float f34 = f14;
                        long j16 = j8;
                        Float f35 = f15;
                        p1 p1Var7 = p1Var3;
                        long j17 = j14;
                        q4.f fVar2 = (q4.f) obj6;
                        fVar2.getClass();
                        p pVar3 = pVar;
                        List<o13.p<Float, String>> list2 = list;
                        float f36 = f19;
                        float f37 = f18;
                        m1 m1Var3 = m1Var;
                        if (pVar3 != null) {
                            float f38 = pVar3.a(fVar2, list2, j0.f134944a, f36).f125077a + f37;
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            m1Var3.i(f38 + j92.b.f97899b.f97918c);
                        }
                        float floatValue2 = m1Var3.getFloatValue();
                        fVar2.getF142543b().f142550a.e(floatValue2, 0.0f, f37, f36);
                        try {
                            long j18 = bVar5.f93188d.f93184d;
                            o13.p pVar4 = (o13.p) h0.d0(list2);
                            Float f39 = pVar4 != null ? (Float) pVar4.f128594a : null;
                            o13.p pVar5 = (o13.p) h0.n0(list2);
                            if (pVar5 != null) {
                                f211 = (Float) pVar5.f128594a;
                                f212 = -0.0f;
                            } else {
                                f211 = null;
                                f212 = -0.0f;
                            }
                            try {
                                p1Var7.setValue(d.b(fVar2, f34, j16, arrayList, f35, f39, f211));
                                float f44 = -f37;
                                float f45 = -f36;
                                fVar2.getF142543b().f142550a.e(-floatValue2, f212, f44, f45);
                                o82.g gVar2 = o82.g.f130854g;
                                o82.g gVar3 = gVar;
                                if (gVar3 == gVar2) {
                                    d92.b.f58623a.getClass();
                                    d92.b.f58625c.getClass();
                                    floatValue = j92.b.f97899b.f97921f;
                                } else {
                                    floatValue = m1Var3.getFloatValue();
                                }
                                if (gVar3 == gVar2) {
                                    d92.b.f58623a.getClass();
                                    d92.b.f58625c.getClass();
                                    f213 = j92.b.f97899b.f97923h + f37;
                                } else {
                                    f213 = f37;
                                }
                                fVar2.getF142543b().f142550a.e(floatValue, 0.0f, f213, f36);
                                float f46 = 2;
                                try {
                                    g6.f.a aVar6 = g6.f.f75994b;
                                    ArrayList arrayList2 = bVar5.f93201q;
                                    try {
                                        o13.p pVar6 = (o13.p) h0.d0(list2);
                                        Float f47 = pVar6 != null ? (Float) pVar6.f128594a : null;
                                        o13.p pVar7 = (o13.p) h0.n0(list2);
                                        try {
                                            c0.e(fVar2, f46, new m92.m.d(j17, null), false, 0.0f, null, null, arrayList2, f35, null, null, f47, pVar7 != null ? (Float) pVar7.f128594a : null, gVar3 == gVar2 ? m92.e0.STEP : m92.e0.LINEAR, true, null, 17208);
                                            fVar2.getF142543b().f142550a.e(-floatValue, -0.0f, -f213, f45);
                                            if (z14) {
                                                float floatValue3 = m1Var3.getFloatValue();
                                                fVar2.getF142543b().f142550a.e(floatValue3, 0.0f, f37, f36);
                                                boolean z17 = gVar3 == gVar2;
                                                try {
                                                    m92.m.d dVar = new m92.m.d(j18, null);
                                                    float f48 = 3;
                                                    ArrayList arrayList3 = bVar5.f93202r;
                                                    o13.p pVar8 = (o13.p) h0.d0(list2);
                                                    Float f49 = pVar8 != null ? (Float) pVar8.f128594a : null;
                                                    o13.p pVar9 = (o13.p) h0.n0(list2);
                                                    c0.e(fVar2, f46, dVar, z17, f48, null, d0.a(j18), arrayList3, f35, null, null, f49, pVar9 != null ? (Float) pVar9.f128594a : null, null, true, null, 21264);
                                                    f214 = f44;
                                                    fVar2.getF142543b().f142550a.e(-floatValue3, -0.0f, f214, f45);
                                                } catch (Throwable th4) {
                                                    fVar2.getF142543b().f142550a.e(-floatValue3, -0.0f, f44, f45);
                                                    throw th4;
                                                }
                                            } else {
                                                f214 = f44;
                                            }
                                            n nVar2 = nVar;
                                            if (nVar2 != null) {
                                                float floatValue4 = m1Var3.getFloatValue();
                                                fVar2.getF142543b().f142550a.e(floatValue4, 0.0f, f37, 0.0f);
                                                try {
                                                    nVar2.a(fVar2, f36);
                                                    fVar2.getF142543b().f142550a.e(-floatValue4, -0.0f, f214, -0.0f);
                                                } catch (Throwable th5) {
                                                    fVar2.getF142543b().f142550a.e(-floatValue4, -0.0f, f214, -0.0f);
                                                    throw th5;
                                                }
                                            }
                                            if (arrayList.isEmpty()) {
                                                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (n4.h.b(fVar2.b()) >> 32)) - (((int) (j15 >> 32)) / 2))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (n4.h.b(fVar2.b()) & 4294967295L)) - (((int) (j15 & 4294967295L)) / 2))) & 4294967295L);
                                                n4.c.a aVar7 = n4.c.f123541b;
                                                v0.b(fVar2, q0Var3, 0L, jFloatToRawIntBits, 250);
                                            }
                                            return Unit.INSTANCE;
                                        } catch (Throwable th6) {
                                            th = th6;
                                            fVar2 = fVar2;
                                            fVar2.getF142543b().f142550a.e(-floatValue, -0.0f, -f213, f45);
                                            throw th;
                                        }
                                    } catch (Throwable th7) {
                                        th = th7;
                                        fVar2 = fVar2;
                                    }
                                } catch (Throwable th8) {
                                    th = th8;
                                }
                            } catch (Throwable th9) {
                                th = th9;
                                fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, -f37, -f36);
                                throw th;
                            }
                        } catch (Throwable th10) {
                            th = th10;
                            floatValue2 = floatValue2;
                        }
                    }
                };
                r2116.K(lVar6);
                objQ2 = lVar6;
                r24 = r2116;
            } else {
                ?? r2117 = r16;
                p1Var3 = p1Var6;
                m1Var = m1Var2;
                e23.l lVar7 = new e23.l() { // from class: kf1.a
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // e23.l
                    public final Object invoke(Object obj6) throws Throwable {
                        Float f211;
                        float f212;
                        float floatValue;
                        float f213;
                        float f214;
                        if1.b bVar5 = bVar;
                        ArrayList arrayList = bVar5.f93200p;
                        q0 q0Var3 = q0Var2;
                        long j15 = q0Var3.f157282c;
                        float f34 = f14;
                        long j16 = j8;
                        Float f35 = f15;
                        p1 p1Var7 = p1Var3;
                        long j17 = j14;
                        q4.f fVar2 = (q4.f) obj6;
                        fVar2.getClass();
                        p pVar3 = pVar;
                        List<o13.p<Float, String>> list2 = list;
                        float f36 = f19;
                        float f37 = f18;
                        m1 m1Var3 = m1Var;
                        if (pVar3 != null) {
                            float f38 = pVar3.a(fVar2, list2, j0.f134944a, f36).f125077a + f37;
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            m1Var3.i(f38 + j92.b.f97899b.f97918c);
                        }
                        float floatValue2 = m1Var3.getFloatValue();
                        fVar2.getF142543b().f142550a.e(floatValue2, 0.0f, f37, f36);
                        try {
                            long j18 = bVar5.f93188d.f93184d;
                            o13.p pVar4 = (o13.p) h0.d0(list2);
                            Float f39 = pVar4 != null ? (Float) pVar4.f128594a : null;
                            o13.p pVar5 = (o13.p) h0.n0(list2);
                            if (pVar5 != null) {
                                f211 = (Float) pVar5.f128594a;
                                f212 = -0.0f;
                            } else {
                                f211 = null;
                                f212 = -0.0f;
                            }
                            try {
                                p1Var7.setValue(d.b(fVar2, f34, j16, arrayList, f35, f39, f211));
                                float f44 = -f37;
                                float f45 = -f36;
                                fVar2.getF142543b().f142550a.e(-floatValue2, f212, f44, f45);
                                o82.g gVar2 = o82.g.f130854g;
                                o82.g gVar3 = gVar;
                                if (gVar3 == gVar2) {
                                    d92.b.f58623a.getClass();
                                    d92.b.f58625c.getClass();
                                    floatValue = j92.b.f97899b.f97921f;
                                } else {
                                    floatValue = m1Var3.getFloatValue();
                                }
                                if (gVar3 == gVar2) {
                                    d92.b.f58623a.getClass();
                                    d92.b.f58625c.getClass();
                                    f213 = j92.b.f97899b.f97923h + f37;
                                } else {
                                    f213 = f37;
                                }
                                fVar2.getF142543b().f142550a.e(floatValue, 0.0f, f213, f36);
                                float f46 = 2;
                                try {
                                    g6.f.a aVar6 = g6.f.f75994b;
                                    ArrayList arrayList2 = bVar5.f93201q;
                                    try {
                                        o13.p pVar6 = (o13.p) h0.d0(list2);
                                        Float f47 = pVar6 != null ? (Float) pVar6.f128594a : null;
                                        o13.p pVar7 = (o13.p) h0.n0(list2);
                                        try {
                                            c0.e(fVar2, f46, new m92.m.d(j17, null), false, 0.0f, null, null, arrayList2, f35, null, null, f47, pVar7 != null ? (Float) pVar7.f128594a : null, gVar3 == gVar2 ? m92.e0.STEP : m92.e0.LINEAR, true, null, 17208);
                                            fVar2.getF142543b().f142550a.e(-floatValue, -0.0f, -f213, f45);
                                            if (z14) {
                                                float floatValue3 = m1Var3.getFloatValue();
                                                fVar2.getF142543b().f142550a.e(floatValue3, 0.0f, f37, f36);
                                                boolean z17 = gVar3 == gVar2;
                                                try {
                                                    m92.m.d dVar = new m92.m.d(j18, null);
                                                    float f48 = 3;
                                                    ArrayList arrayList3 = bVar5.f93202r;
                                                    o13.p pVar8 = (o13.p) h0.d0(list2);
                                                    Float f49 = pVar8 != null ? (Float) pVar8.f128594a : null;
                                                    o13.p pVar9 = (o13.p) h0.n0(list2);
                                                    c0.e(fVar2, f46, dVar, z17, f48, null, d0.a(j18), arrayList3, f35, null, null, f49, pVar9 != null ? (Float) pVar9.f128594a : null, null, true, null, 21264);
                                                    f214 = f44;
                                                    fVar2.getF142543b().f142550a.e(-floatValue3, -0.0f, f214, f45);
                                                } catch (Throwable th4) {
                                                    fVar2.getF142543b().f142550a.e(-floatValue3, -0.0f, f44, f45);
                                                    throw th4;
                                                }
                                            } else {
                                                f214 = f44;
                                            }
                                            n nVar2 = nVar;
                                            if (nVar2 != null) {
                                                float floatValue4 = m1Var3.getFloatValue();
                                                fVar2.getF142543b().f142550a.e(floatValue4, 0.0f, f37, 0.0f);
                                                try {
                                                    nVar2.a(fVar2, f36);
                                                    fVar2.getF142543b().f142550a.e(-floatValue4, -0.0f, f214, -0.0f);
                                                } catch (Throwable th5) {
                                                    fVar2.getF142543b().f142550a.e(-floatValue4, -0.0f, f214, -0.0f);
                                                    throw th5;
                                                }
                                            }
                                            if (arrayList.isEmpty()) {
                                                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (n4.h.b(fVar2.b()) >> 32)) - (((int) (j15 >> 32)) / 2))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (n4.h.b(fVar2.b()) & 4294967295L)) - (((int) (j15 & 4294967295L)) / 2))) & 4294967295L);
                                                n4.c.a aVar7 = n4.c.f123541b;
                                                v0.b(fVar2, q0Var3, 0L, jFloatToRawIntBits, 250);
                                            }
                                            return Unit.INSTANCE;
                                        } catch (Throwable th6) {
                                            th = th6;
                                            fVar2 = fVar2;
                                            fVar2.getF142543b().f142550a.e(-floatValue, -0.0f, -f213, f45);
                                            throw th;
                                        }
                                    } catch (Throwable th7) {
                                        th = th7;
                                        fVar2 = fVar2;
                                    }
                                } catch (Throwable th8) {
                                    th = th8;
                                }
                            } catch (Throwable th9) {
                                th = th9;
                                fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, -f37, -f36);
                                throw th;
                            }
                        } catch (Throwable th10) {
                            th = th10;
                            floatValue2 = floatValue2;
                        }
                    }
                };
                r2117.K(lVar7);
                objQ2 = lVar7;
                r24 = r2117;
            }
            u1.n.b(rVarC7, (e23.l) objQ2, r24, 0);
            r24.g0(true);
            if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                ?? r1114 = r24;
                z16 = false;
                r1114.C(1395428592);
                r1114.g0(false);
                r116 = r1114;
            } else {
                ?? r1115 = r24;
                z16 = false;
                r1115.C(1395428592);
                r1115.g0(false);
                r116 = r1115;
            }
            r116.g0(true);
            if (pVar2 == null) {
                r116.C(998429281);
            } else {
                r116.C(-106339936);
                pVar2.invoke(r116, 6);
            }
            r116.g0(z16);
            r116.g0(true);
            x1 x1Var5 = p3.n.f135158a;
            r15 = r116;
        } else {
            o0VarE.e();
            r15 = o0VarE;
        }
        p2 p2VarI0 = r15.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: kf1.b
                @Override // e23.p
                public final Object invoke(Object obj6, Object obj7) throws Throwable {
                    ((Integer) obj7).getClass();
                    int iT = p0.t(i14 | 1);
                    d.a(rVar, str, f14, j8, j14, gVar, bVar, z14, f15, str2, oVar, pVar, nVar, pVar2, qVar, (m) obj6, iT);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0273  */
    /* JADX WARN: Code duplicated, block: B:107:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:114:0x0311  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:62:0x0101 A[LOOP:3: B:60:0x00fb->B:62:0x0101, LOOP_END] */
    public static final Map b(q4.f fVar, float f14, long j8, ArrayList arrayList, Float f15, Float f16, Float f17) {
        float fFloatValue;
        float fFloatValue2;
        Iterator it;
        float f18;
        long j14;
        float fIntBitsToFloat;
        float f19;
        float f22;
        float f24;
        float f25;
        float f26;
        float f27;
        char c14;
        long j15;
        long j16;
        float f28;
        if (arrayList.isEmpty()) {
            k0 k0Var = k0.f134949a;
            k0Var.getClass();
            return k0Var;
        }
        ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList2.add(((l0) it3.next()).f117398a);
        }
        if (f15 != null) {
            fFloatValue = f15.floatValue() - 1;
        } else {
            Iterator it4 = arrayList2.iterator();
            if (!it4.hasNext()) {
                t.g();
                return null;
            }
            float fC = i0.c((m92.h0) it4.next());
            while (it4.hasNext()) {
                fC = Math.max(fC, i0.c((m92.h0) it4.next()));
            }
            fFloatValue = fC;
        }
        float f29 = 0.0f;
        if (f17 != null) {
            fFloatValue2 = f17.floatValue();
        } else {
            Iterator it5 = arrayList2.iterator();
            if (!it5.hasNext()) {
                t.g();
                return null;
            }
            m92.h0 h0Var = (m92.h0) it5.next();
            float fE = h0Var instanceof m92.h0.e ? i0.e((m92.h0.e) h0Var) : h0Var instanceof m92.h0.d ? i0.g((m92.h0.d) h0Var) : 0.0f;
            while (it5.hasNext()) {
                m92.h0 h0Var2 = (m92.h0) it5.next();
                fE = Math.max(fE, h0Var2 instanceof m92.h0.e ? i0.e((m92.h0.e) h0Var2) : h0Var2 instanceof m92.h0.d ? i0.g((m92.h0.d) h0Var2) : 0.0f);
            }
            fFloatValue2 = fE;
        }
        if (arrayList.isEmpty()) {
            it = arrayList.iterator();
            if (it.hasNext()) {
                t.g();
                return null;
            }
            f18 = i0.f(((l0) it.next()).f117398a);
            while (it.hasNext()) {
                f18 = Math.min(f18, i0.f(((l0) it.next()).f117398a));
            }
        } else {
            Iterator it6 = arrayList.iterator();
            while (true) {
                if (it6.hasNext()) {
                    l0 l0Var = (l0) it6.next();
                    if (!l0Var.f117399b || !l0Var.f117400c) {
                        f18 = f16 != null ? f16.floatValue() : 0.0f;
                    }
                } else {
                    it = arrayList.iterator();
                    if (it.hasNext()) {
                        t.g();
                        return null;
                    }
                    f18 = i0.f(((l0) it.next()).f117398a);
                    while (it.hasNext()) {
                        f18 = Math.min(f18, i0.f(((l0) it.next()).f117398a));
                    }
                }
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Iterator it7 = arrayList.iterator(); it7.hasNext(); it7 = it7) {
            l0 l0Var2 = (l0) it7.next();
            m92.h0 h0Var3 = l0Var2.f117398a;
            float fH = i0.h(i0.c(h0Var3), f29, fFloatValue, f29, Float.intBitsToFloat((int) (fVar.b() >> 32)));
            linkedHashMap.put(Float.valueOf(fH), Float.valueOf(i0.c(h0Var3)));
            float fH2 = i0.h(i0.f(h0Var3), f18, fFloatValue2, Float.intBitsToFloat((int) (fVar.b() & 4294967295L)), f29);
            if (h0Var3 instanceof m92.h0.e) {
                j14 = 4294967295L;
                fIntBitsToFloat = Float.intBitsToFloat((int) (fVar.b() & 4294967295L)) - fH2;
                f19 = f29;
            } else {
                j14 = 4294967295L;
                if (h0Var3 instanceof m92.h0.d) {
                    float fH3 = i0.h(i0.g((m92.h0.d) h0Var3), f29, fFloatValue2, Float.intBitsToFloat((int) (fVar.b() & 4294967295L)), f29);
                    f19 = (f14 / 2) + fH3;
                    fIntBitsToFloat = fH3 - fH2;
                } else {
                    fIntBitsToFloat = f29;
                    f19 = fIntBitsToFloat;
                }
            }
            boolean z14 = l0Var2.f117399b;
            boolean z15 = l0Var2.f117400c;
            if (z14 && z15) {
                f24 = fH2 - (f14 / 2);
                if (f24 > f19) {
                    f25 = fIntBitsToFloat + f14;
                    f22 = f29;
                } else {
                    f25 = f29;
                    f22 = f25;
                }
            } else {
                if (z14) {
                    f26 = f14 / 2;
                    f27 = fH2 + f26;
                } else if (z15) {
                    f26 = f14 / 2;
                    f27 = fH2 - f26;
                } else {
                    f22 = f29;
                    f24 = fH2;
                    f25 = fIntBitsToFloat;
                }
                float f34 = f27;
                f25 = fIntBitsToFloat - f26;
                f24 = f34;
                f22 = f29;
            }
            if (h0Var3 instanceof m92.h0.e.c) {
                c14 = ' ';
                j16 = ((m92.h0.e.c) h0Var3).f117351b;
            } else {
                c14 = ' ';
                if (h0Var3 instanceof m92.h0.d.a) {
                    j16 = ((m92.h0.d.a) h0Var3).f117342b;
                } else {
                    j15 = j8;
                }
                if (fIntBitsToFloat < f14 || !(z14 ^ z15)) {
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fH - (f14 / 2))) << c14) | (((long) Float.floatToRawIntBits(f24)) & j14);
                    n4.c.a aVar = n4.c.f123541b;
                    long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f14)) << c14) | (((long) Float.floatToRawIntBits(f25)) & j14);
                    n4.g.a aVar2 = n4.g.f123559b;
                    q4.f.A0(fVar, j15, jFloatToRawIntBits, jFloatToRawIntBits2, 0.0f, null, null, 120);
                } else {
                    o4.j jVarA = o4.m.a();
                    float f35 = f14 / 2;
                    long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(fH - f35)) << c14) | (((long) Float.floatToRawIntBits(fH2)) & j14);
                    n4.c.a aVar3 = n4.c.f123541b;
                    long jFloatToRawIntBits4 = (((long) Float.floatToRawIntBits(f14)) << c14) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j14);
                    n4.g.a aVar4 = n4.g.f123559b;
                    n4.d dVarG = g8.i.g(jFloatToRawIntBits3, jFloatToRawIntBits4);
                    long jFloatToRawIntBits5 = (((long) Float.floatToRawIntBits(f35)) << c14) | (((long) Float.floatToRawIntBits(f35)) & j14);
                    n4.a.C2318a c2318a = n4.a.f123535b;
                    jVarA.k(n4.f.b(dVarG, jFloatToRawIntBits5, (((long) Float.floatToRawIntBits(f35)) << c14) | (((long) Float.floatToRawIntBits(f35)) & j14), 0L, 0L, 24), f1.b.CounterClockwise);
                    long j17 = j15;
                    q4.f.L(fVar, jVarA, j17, 0.0f, null, 60);
                    j15 = j17;
                }
                if (i0.f(h0Var3) > f22 && z14) {
                    f28 = f14 / 2;
                    if (f25 < f28 || z15) {
                        q4.f.o0(fVar, j15, f28, (((long) Float.floatToRawIntBits(fH)) << c14) | (((long) Float.floatToRawIntBits(f24)) & j14), null, 0, 120);
                    }
                }
                if (!z15 && f24 > f19) {
                    q4.f.o0(fVar, j15, f14 / 2, (((long) Float.floatToRawIntBits(fH)) << c14) | (((long) Float.floatToRawIntBits(f19)) & j14), null, 0, 120);
                }
                fFloatValue = fFloatValue;
                f29 = f22;
                fFloatValue2 = fFloatValue2;
                f18 = f18;
            }
            j15 = j16;
            if (fIntBitsToFloat < f14) {
                long jFloatToRawIntBits6 = (((long) Float.floatToRawIntBits(fH - (f14 / 2))) << c14) | (((long) Float.floatToRawIntBits(f24)) & j14);
                n4.c.a aVar5 = n4.c.f123541b;
                long jFloatToRawIntBits7 = (((long) Float.floatToRawIntBits(f14)) << c14) | (((long) Float.floatToRawIntBits(f25)) & j14);
                n4.g.a aVar6 = n4.g.f123559b;
                q4.f.A0(fVar, j15, jFloatToRawIntBits6, jFloatToRawIntBits7, 0.0f, null, null, 120);
            } else {
                long jFloatToRawIntBits8 = (((long) Float.floatToRawIntBits(fH - (f14 / 2))) << c14) | (((long) Float.floatToRawIntBits(f24)) & j14);
                n4.c.a aVar7 = n4.c.f123541b;
                long jFloatToRawIntBits9 = (((long) Float.floatToRawIntBits(f14)) << c14) | (((long) Float.floatToRawIntBits(f25)) & j14);
                n4.g.a aVar8 = n4.g.f123559b;
                q4.f.A0(fVar, j15, jFloatToRawIntBits8, jFloatToRawIntBits9, 0.0f, null, null, 120);
            }
            if (i0.f(h0Var3) > f22) {
                f28 = f14 / 2;
                if (f25 < f28) {
                    q4.f.o0(fVar, j15, f28, (((long) Float.floatToRawIntBits(fH)) << c14) | (((long) Float.floatToRawIntBits(f24)) & j14), null, 0, 120);
                } else {
                    q4.f.o0(fVar, j15, f28, (((long) Float.floatToRawIntBits(fH)) << c14) | (((long) Float.floatToRawIntBits(f24)) & j14), null, 0, 120);
                }
            }
            if (!z15) {
            }
            fFloatValue = fFloatValue;
            f29 = f22;
            fFloatValue2 = fFloatValue2;
            f18 = f18;
        }
        return linkedHashMap;
    }
}

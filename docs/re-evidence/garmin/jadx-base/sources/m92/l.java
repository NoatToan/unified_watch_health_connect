package m92;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import c2.x2;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import f5.z0;
import i3.e5;
import java.util.Map;
import kotlin.t1;
import l72.v2;
import okhttp3.internal.http2.Http2Connection;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.m1;
import p3.n1;
import p3.p1;
import p3.p2;
import p3.x1;
import s5.s0;
import s5.v0;
import s5.x0;

/* JADX INFO: loaded from: classes9.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f117397a = 0;

    static {
        g6.f.a aVar = g6.f.f75994b;
    }

    /* JADX WARN: Code duplicated, block: B:128:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:133:0x01cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:134:0x01cf  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final h4.r rVar, final e23.p pVar, final g6.f fVar, final String str, final boolean z14, final float f14, final float f15, final n92.a aVar, e23.p pVar2, final e23.q qVar, final e23.l lVar, p3.m mVar, final int i14, final int i15) {
        int i16;
        String str2;
        boolean z15;
        int i17;
        final e23.p pVar3;
        p3.o0 o0Var;
        s0 s0Var;
        n92.p pVar4;
        x0 x0Var;
        n92.p pVar5;
        x0 x0Var2;
        n92.n nVar;
        float f16;
        i53.f<o13.p<Float, String>> fVarB;
        i53.f<o13.p<Float, String>> fVarB2;
        float f17;
        h4.r rVarH;
        n1 n1Var;
        h4.r rVarF;
        boolean z16;
        n92.o oVar;
        n92.o oVar2;
        n92.n nVar2;
        str.getClass();
        p3.o0 o0VarE = mVar.E(-1979581937);
        p3.c<?> cVar = o0VarE.f135177b;
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.r(pVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.B(fVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            str2 = str;
            i16 |= o0VarE.B(str2) ? 2048 : 1024;
        } else {
            str2 = str;
        }
        if ((i14 & 24576) == 0) {
            z15 = z14;
            i16 |= o0VarE.h(z15) ? 16384 : 8192;
        } else {
            z15 = z14;
        }
        if ((i14 & 196608) == 0) {
            i16 |= o0VarE.i(f14) ? 131072 : 65536;
        }
        if ((i14 & 1572864) == 0) {
            i16 |= o0VarE.i(f15) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i14 & 12582912) == 0) {
            i16 |= (i14 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 8388608 : 4194304;
        }
        if ((i14 & 100663296) == 0) {
            i16 |= o0VarE.r(pVar2) ? 67108864 : 33554432;
        }
        if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
            i16 |= o0VarE.r(qVar) ? 536870912 : 268435456;
        }
        if ((i15 & 6) == 0) {
            i17 = i15 | (o0VarE.r(lVar) ? 4 : 2);
        } else {
            i17 = i15;
        }
        if (o0VarE.n(i16 & 1, ((i16 & 306783379) == 306783378 && (i17 & 3) == 2) ? false : true)) {
            x1 x1Var = p3.n.f135158a;
            if (aVar == null || (nVar2 = aVar.f125059d) == null) {
                s0Var = (aVar == null || (pVar4 = aVar.f125058c) == null) ? null : pVar4.f125097a;
            } else {
                s0Var = nVar2.f125091a;
            }
            if (s0Var == null) {
                o0VarE.C(292290195);
                s0 s0Var2 = new s0((w5.q.b) o0VarE.A(t1.f91493k), new g6.d(((g6.c) o0VarE.A(t1.f91490h)).getF75991a(), 1.0f), (g6.o) o0VarE.A(t1.f91496n), 0, 8, null);
                o0VarE.g0(false);
                s0Var = s0Var2;
            } else {
                o0VarE.C(292287033);
                o0VarE.g0(false);
            }
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            x0 x0VarF = d92.c.f(j92.f.f97935l, o0VarE);
            boolean z17 = ((i16 & 7168) == 2048) | ((29360128 & i16) == 8388608 || ((i16 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 && o0VarE.B(aVar)));
            Object objQ = o0VarE.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (z17) {
                if (aVar != null) {
                    if (aVar != null) {
                    }
                    x0Var = x0VarF;
                } else {
                    if (aVar != null) {
                    }
                    x0Var = x0VarF;
                }
                objQ = p3.p0.n(s0.a(s0Var, str2, x0Var, 0L, 1020));
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    if (aVar != null || (nVar = aVar.f125059d) == null) {
                        if (aVar != null || (pVar5 = aVar.f125058c) == null) {
                            x0Var = x0VarF;
                        } else {
                            x0Var2 = pVar5.f125098b;
                        }
                        objQ = p3.p0.n(s0.a(s0Var, str2, x0Var, 0L, 1020));
                        o0VarE.K(objQ);
                    } else {
                        x0Var2 = nVar.f125092b;
                    }
                    x0Var = x0Var2;
                    objQ = p3.p0.n(s0.a(s0Var, str2, x0Var, 0L, 1020));
                    o0VarE.K(objQ);
                }
            }
            final p1 p1Var = (p1) objQ;
            int i18 = i16;
            final int i19 = (int) (((s5.q0) p1Var.getF182175a()).f157282c & 4294967295L);
            Object objQ2 = o0VarE.q();
            aVar2.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ2 == c2565a) {
                objQ2 = p3.p0.n(null);
                o0VarE.K(objQ2);
            }
            final p1 p1Var2 = (p1) objQ2;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ3);
            }
            final p1 p1Var3 = (p1) objQ3;
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = p3.p0.n(null);
                o0VarE.K(objQ4);
            }
            final p1 p1Var4 = (p1) objQ4;
            Object objQ5 = o0VarE.q();
            if (objQ5 == c2565a) {
                objQ5 = n23.j.o(f14, o0VarE);
            }
            final m1 m1Var = (m1) objQ5;
            Object objQ6 = o0VarE.q();
            if (objQ6 == c2565a) {
                objQ6 = n23.j.o(f14, o0VarE);
            }
            final m1 m1Var2 = (m1) objQ6;
            if ((aVar != null ? aVar.f125059d : null) != null) {
                aVar.f125059d.getClass();
                d92.b.f58625c.getClass();
                f16 = (i19 * 2) + f15 + j92.b.f97899b.f97918c;
            } else {
                f16 = f15;
            }
            if (aVar == null || (oVar2 = aVar.f125056a) == null || (fVarB = oVar2.a()) == null) {
                fVarB = j53.l.b();
            }
            final i53.f<o13.p<Float, String>> fVar2 = fVarB;
            if (aVar == null || (oVar = aVar.f125057b) == null || (fVarB2 = oVar.a()) == null) {
                fVarB2 = j53.l.b();
            }
            final i53.f<o13.p<Float, String>> fVar3 = fVarB2;
            Object objQ7 = o0VarE.q();
            if (objQ7 == c2565a) {
                objQ7 = e5.o(0, o0VarE);
            }
            n1 n1Var2 = (n1) objQ7;
            final float f18 = f16;
            final boolean z18 = z15;
            o0Var = o0VarE;
            z3.e eVarC = z3.f.c(1310261782, new e23.q() { // from class: m92.h
                /* JADX WARN: Code duplicated, block: B:53:0x0151  */
                @Override // e23.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    h4.r rVarB;
                    float fC;
                    float fC2;
                    float fC3;
                    h4.r rVar2 = (h4.r) obj;
                    p3.m mVar2 = (p3.m) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    rVar2.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= mVar2.B(rVar2) ? 4 : 2;
                    }
                    if (mVar2.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                        x1 x1Var2 = p3.n.f135158a;
                        e23.q qVar2 = qVar;
                        p3.m.a aVar3 = p3.m.f135153a;
                        if (qVar2 != null) {
                            mVar2.C(1346106224);
                            h4.r.a aVar4 = h4.r.S;
                            Unit unit = Unit.INSTANCE;
                            Object objQ8 = mVar2.q();
                            aVar3.getClass();
                            if (objQ8 == p3.m.a.f135155b) {
                                objQ8 = new k(p1Var2, p1Var3);
                                mVar2.K(objQ8);
                            }
                            rVarB = b5.s0.b(aVar4, unit, (PointerInputEventHandler) objQ8);
                            mVar2.f();
                        } else {
                            mVar2.C(1346417588);
                            mVar2.f();
                            rVarB = h4.r.S;
                        }
                        h4.r rVarThen = rVar2.then(rVarB);
                        final n92.a aVar5 = aVar;
                        n92.p pVar6 = aVar5 != null ? aVar5.f125058c : null;
                        int i24 = i19;
                        if (pVar6 != null) {
                            mVar2.C(736175678);
                            fC = o92.c.c(mVar2, i24 / 2);
                            mVar2.f();
                        } else {
                            mVar2.C(736176184);
                            mVar2.f();
                            fC = 0;
                            g6.f.a aVar6 = g6.f.f75994b;
                        }
                        float f19 = fC;
                        if ((aVar5 != null ? aVar5.f125058c : null) != null) {
                            mVar2.C(1346697208);
                            mVar2.f();
                            fC2 = 0;
                            g6.f.a aVar7 = g6.f.f75994b;
                        } else {
                            if ((aVar5 != null ? aVar5.f125059d : null) != null) {
                                mVar2.C(1346794455);
                                fC2 = o92.c.c(mVar2, i24 / 2);
                                mVar2.f();
                            } else {
                                mVar2.C(1346883704);
                                mVar2.f();
                                fC2 = 0;
                                g6.f.a aVar8 = g6.f.f75994b;
                            }
                        }
                        float f22 = fC2;
                        if ((aVar5 != null ? aVar5.f125059d : null) != null) {
                            mVar2.C(736189214);
                            fC3 = o92.c.c(mVar2, i24 / 2);
                            mVar2.f();
                        } else {
                            mVar2.C(736189720);
                            mVar2.f();
                            fC3 = 0;
                            g6.f.a aVar9 = g6.f.f75994b;
                        }
                        h4.r rVarC = c2.l.C(rVarThen, f22, f19, fC3, 0.0f, 8);
                        boolean zR = mVar2.r(aVar5);
                        final i53.f fVar4 = fVar2;
                        boolean zB = zR | mVar2.B(fVar4);
                        final i53.f fVar5 = fVar3;
                        boolean zB2 = zB | mVar2.B(fVar5);
                        final float f24 = f18;
                        boolean zI = zB2 | mVar2.i(f24);
                        final float f25 = f14;
                        boolean zI2 = zI | mVar2.i(f25);
                        final e23.l lVar2 = lVar;
                        boolean zB3 = zI2 | mVar2.B(lVar2);
                        final float f26 = f15;
                        boolean zI3 = zB3 | mVar2.i(f26);
                        final boolean z19 = z18;
                        boolean zH = zI3 | mVar2.h(z19);
                        final p1 p1Var5 = p1Var;
                        boolean zB4 = zH | mVar2.B(p1Var5);
                        Object objQ9 = mVar2.q();
                        if (zB4) {
                            final m1 m1Var3 = m1Var2;
                            final m1 m1Var4 = m1Var;
                            final p1 p1Var6 = p1Var4;
                            e23.l lVar3 = new e23.l() { // from class: m92.j
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // e23.l
                                public final Object invoke(Object obj4) {
                                    x xVar;
                                    x xVar2;
                                    e23.l lVar4 = lVar2;
                                    p1 p1Var7 = p1Var6;
                                    float f27 = f26;
                                    q4.f fVar6 = (q4.f) obj4;
                                    fVar6.getClass();
                                    n92.a aVar10 = aVar5;
                                    n92.p pVar7 = aVar10 != null ? aVar10.f125058c : null;
                                    float f28 = f24;
                                    m1 m1Var5 = m1Var3;
                                    m1 m1Var6 = m1Var4;
                                    if (pVar7 != null) {
                                        n92.f fVarA = aVar10.f125058c.a(fVar6, fVar4, fVar5, f28);
                                        float f29 = fVarA.f125078b;
                                        Float fValueOf = Float.valueOf(f29);
                                        if (f29 <= 0.0f) {
                                            fValueOf = null;
                                        }
                                        float fFloatValue = fValueOf != null ? fValueOf.floatValue() : 0.0f;
                                        float f34 = f25;
                                        m1Var5.i(fFloatValue + f34);
                                        float f35 = fVarA.f125077a + f34;
                                        d92.b.f58623a.getClass();
                                        d92.b.f58625c.getClass();
                                        m1Var6.i(f35 + j92.b.f97899b.f97918c);
                                    }
                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (fVar6.b() >> 32));
                                    float floatValue = m1Var6.getFloatValue();
                                    float floatValue2 = m1Var5.getFloatValue();
                                    if (fIntBitsToFloat < 0.0f) {
                                        fIntBitsToFloat = 0.0f;
                                    }
                                    if (fIntBitsToFloat == 0.0f) {
                                        xVar2 = new x(0.0f, 0.0f);
                                    } else {
                                        float f36 = floatValue + floatValue2;
                                        if (f36 < 0.0f) {
                                            f36 = 0.0f;
                                        }
                                        if (f36 <= fIntBitsToFloat) {
                                            float fD = j23.t.d(floatValue, 0.0f, fIntBitsToFloat);
                                            xVar = new x(fD, j23.t.d(floatValue2, 0.0f, fIntBitsToFloat - fD));
                                        } else {
                                            float f37 = fIntBitsToFloat / f36;
                                            float fD2 = j23.t.d(floatValue * f37, 0.0f, fIntBitsToFloat);
                                            xVar = new x(fD2, j23.t.d(floatValue2 * f37, 0.0f, fIntBitsToFloat - fD2));
                                        }
                                        xVar2 = xVar;
                                    }
                                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fVar6.b() & 4294967295L));
                                    if (f28 <= fIntBitsToFloat2) {
                                        fIntBitsToFloat2 = f28;
                                    }
                                    q4.b bVar = fVar6.getF142543b().f142550a;
                                    float f38 = xVar2.f117454a;
                                    float f39 = xVar2.f117455b;
                                    bVar.e(f38, 0.0f, f39, fIntBitsToFloat2);
                                    try {
                                        p1Var7.setValue((Map) lVar4.invoke(fVar6));
                                        float f44 = -f38;
                                        float f45 = -f39;
                                        fVar6.getF142543b().f142550a.e(f44, -0.0f, f45, -fIntBitsToFloat2);
                                        if ((aVar10 != null ? aVar10.f125059d : null) != null) {
                                            fVar6.getF142543b().f142550a.e(f38, 0.0f, f39, 0.0f);
                                            try {
                                                aVar10.f125059d.a(fVar6, f28 - f27);
                                                fVar6.getF142543b().f142550a.e(f44, -0.0f, f45, -0.0f);
                                            } catch (Throwable th3) {
                                                fVar6.getF142543b().f142550a.e(f44, -0.0f, f45, -0.0f);
                                                throw th3;
                                            }
                                        }
                                        if (z19) {
                                            float fIntBitsToFloat3 = Float.intBitsToFloat((int) (n4.h.b(fVar6.b()) >> 32));
                                            p1 p1Var8 = p1Var5;
                                            float f46 = fIntBitsToFloat3 - (((int) (((s5.q0) p1Var8.getF182175a()).f157282c >> 32)) / 2);
                                            float fIntBitsToFloat4 = Float.intBitsToFloat((int) (n4.h.b(fVar6.b()) & 4294967295L)) - (((int) (((s5.q0) p1Var8.getF182175a()).f157282c & 4294967295L)) / 2);
                                            s5.q0 q0Var = (s5.q0) p1Var8.getF182175a();
                                            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f46)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat4)) & 4294967295L);
                                            n4.c.a aVar11 = n4.c.f123541b;
                                            v0.b(fVar6, q0Var, 0L, jFloatToRawIntBits, 250);
                                        }
                                        return Unit.INSTANCE;
                                    } catch (Throwable th4) {
                                        fVar6.getF142543b().f142550a.e(-f38, -0.0f, -f39, -fIntBitsToFloat2);
                                        throw th4;
                                    }
                                }
                            };
                            mVar2.K(lVar3);
                            objQ9 = lVar3;
                        } else {
                            aVar3.getClass();
                            if (objQ9 == p3.m.a.f135155b) {
                                final m1 m1Var5 = m1Var2;
                                final m1 m1Var6 = m1Var;
                                final p1 p1Var7 = p1Var4;
                                e23.l lVar4 = new e23.l() { // from class: m92.j
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // e23.l
                                    public final Object invoke(Object obj4) {
                                        x xVar;
                                        x xVar2;
                                        e23.l lVar5 = lVar2;
                                        p1 p1Var8 = p1Var7;
                                        float f27 = f26;
                                        q4.f fVar6 = (q4.f) obj4;
                                        fVar6.getClass();
                                        n92.a aVar10 = aVar5;
                                        n92.p pVar7 = aVar10 != null ? aVar10.f125058c : null;
                                        float f28 = f24;
                                        m1 m1Var7 = m1Var5;
                                        m1 m1Var8 = m1Var6;
                                        if (pVar7 != null) {
                                            n92.f fVarA = aVar10.f125058c.a(fVar6, fVar4, fVar5, f28);
                                            float f29 = fVarA.f125078b;
                                            Float fValueOf = Float.valueOf(f29);
                                            if (f29 <= 0.0f) {
                                                fValueOf = null;
                                            }
                                            float fFloatValue = fValueOf != null ? fValueOf.floatValue() : 0.0f;
                                            float f34 = f25;
                                            m1Var7.i(fFloatValue + f34);
                                            float f35 = fVarA.f125077a + f34;
                                            d92.b.f58623a.getClass();
                                            d92.b.f58625c.getClass();
                                            m1Var8.i(f35 + j92.b.f97899b.f97918c);
                                        }
                                        float fIntBitsToFloat = Float.intBitsToFloat((int) (fVar6.b() >> 32));
                                        float floatValue = m1Var8.getFloatValue();
                                        float floatValue2 = m1Var7.getFloatValue();
                                        if (fIntBitsToFloat < 0.0f) {
                                            fIntBitsToFloat = 0.0f;
                                        }
                                        if (fIntBitsToFloat == 0.0f) {
                                            xVar2 = new x(0.0f, 0.0f);
                                        } else {
                                            float f36 = floatValue + floatValue2;
                                            if (f36 < 0.0f) {
                                                f36 = 0.0f;
                                            }
                                            if (f36 <= fIntBitsToFloat) {
                                                float fD = j23.t.d(floatValue, 0.0f, fIntBitsToFloat);
                                                xVar = new x(fD, j23.t.d(floatValue2, 0.0f, fIntBitsToFloat - fD));
                                            } else {
                                                float f37 = fIntBitsToFloat / f36;
                                                float fD2 = j23.t.d(floatValue * f37, 0.0f, fIntBitsToFloat);
                                                xVar = new x(fD2, j23.t.d(floatValue2 * f37, 0.0f, fIntBitsToFloat - fD2));
                                            }
                                            xVar2 = xVar;
                                        }
                                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fVar6.b() & 4294967295L));
                                        if (f28 <= fIntBitsToFloat2) {
                                            fIntBitsToFloat2 = f28;
                                        }
                                        q4.b bVar = fVar6.getF142543b().f142550a;
                                        float f38 = xVar2.f117454a;
                                        float f39 = xVar2.f117455b;
                                        bVar.e(f38, 0.0f, f39, fIntBitsToFloat2);
                                        try {
                                            p1Var8.setValue((Map) lVar5.invoke(fVar6));
                                            float f44 = -f38;
                                            float f45 = -f39;
                                            fVar6.getF142543b().f142550a.e(f44, -0.0f, f45, -fIntBitsToFloat2);
                                            if ((aVar10 != null ? aVar10.f125059d : null) != null) {
                                                fVar6.getF142543b().f142550a.e(f38, 0.0f, f39, 0.0f);
                                                try {
                                                    aVar10.f125059d.a(fVar6, f28 - f27);
                                                    fVar6.getF142543b().f142550a.e(f44, -0.0f, f45, -0.0f);
                                                } catch (Throwable th3) {
                                                    fVar6.getF142543b().f142550a.e(f44, -0.0f, f45, -0.0f);
                                                    throw th3;
                                                }
                                            }
                                            if (z19) {
                                                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (n4.h.b(fVar6.b()) >> 32));
                                                p1 p1Var9 = p1Var5;
                                                float f46 = fIntBitsToFloat3 - (((int) (((s5.q0) p1Var9.getF182175a()).f157282c >> 32)) / 2);
                                                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (n4.h.b(fVar6.b()) & 4294967295L)) - (((int) (((s5.q0) p1Var9.getF182175a()).f157282c & 4294967295L)) / 2);
                                                s5.q0 q0Var = (s5.q0) p1Var9.getF182175a();
                                                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f46)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat4)) & 4294967295L);
                                                n4.c.a aVar11 = n4.c.f123541b;
                                                v0.b(fVar6, q0Var, 0L, jFloatToRawIntBits, 250);
                                            }
                                            return Unit.INSTANCE;
                                        } catch (Throwable th4) {
                                            fVar6.getF142543b().f142550a.e(-f38, -0.0f, -f39, -fIntBitsToFloat2);
                                            throw th4;
                                        }
                                    }
                                };
                                mVar2.K(lVar4);
                                objQ9 = lVar4;
                            }
                        }
                        u1.n.b(rVarC, (e23.l) objQ9, mVar2, 0);
                    } else {
                        mVar2.e();
                    }
                    return Unit.INSTANCE;
                }
            }, o0Var);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0Var, 0);
            int iHashCode = Long.hashCode(o0Var.U);
            i2 i2VarA0 = o0Var.a0();
            h4.r rVarC = h4.k.c(rVar, o0Var);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0Var.z();
            if (o0Var.T) {
                o0Var.M(aVar3);
            } else {
                o0Var.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA, o0Var);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0Var);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0Var.T || !p005kotlin.jvm.internal.s.g(o0Var.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0Var, iHashCode, bVar);
            }
            h5.g.a.f fVar4 = h5.g.a.f81807d;
            b4.c(fVar4, rVarC, o0Var);
            c2.b0 b0Var = c2.b0.f22601a;
            h4.r.a aVar4 = h4.r.S;
            h4.r rVarA = v2.a(x2.f(aVar4, 1.0f), fVar == null, new kh0.d(b0Var, 26), o0Var, 6);
            if (fVar == null) {
                f17 = 1.0f;
                rVarH = b0Var.a(x2.f(aVar4, 1.0f), 1.0f, true);
            } else {
                f17 = 1.0f;
                rVarH = x2.h(x2.f(aVar4, 1.0f), fVar.f75997a);
            }
            h4.r rVar2 = rVarH;
            if (fVar == null) {
                o0Var.C(340633039);
                o0Var.g0(false);
                rVarF = x2.d(aVar4, f17);
                n1Var = n1Var2;
            } else {
                o0Var.C(340689273);
                h4.r rVarF2 = x2.f(aVar4, f17);
                Object objQ8 = o0Var.q();
                if (objQ8 == c2565a) {
                    n1Var = n1Var2;
                    objQ8 = new a11.h0(n1Var, 27);
                    o0Var.K(objQ8);
                } else {
                    n1Var = n1Var2;
                }
                rVarF = f5.g0.f(rVarF2, (e23.l) objQ8);
                o0Var.g0(false);
            }
            n1 n1Var3 = n1Var;
            z3.e eVarC2 = z3.f.c(1808851327, new fb0.b(rVarF, pVar, eVarC, rVar2, 29), o0Var);
            x1 x1Var2 = p3.n.f135158a;
            Object objQ9 = o0Var.q();
            if (objQ9 == c2565a) {
                objQ9 = new a11.h0(n1Var3, 28);
                o0Var.K(objQ9);
            }
            h4.r rVarF3 = f5.g0.f(rVarA, (e23.l) objQ9);
            z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode2 = Long.hashCode(o0Var.U);
            i2 i2VarA1 = o0Var.a0();
            h4.r rVarC2 = h4.k.c(rVarF3, o0Var);
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0Var.z();
            if (o0Var.T) {
                o0Var.M(aVar3);
            } else {
                o0Var.c();
            }
            b4.c(eVar, z0VarD, o0Var);
            b4.c(c1623g, i2VarA1, o0Var);
            if (o0Var.T || !p005kotlin.jvm.internal.s.g(o0Var.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0Var, iHashCode2, bVar);
            }
            b4.c(fVar4, rVarC2, o0Var);
            eVarC2.invoke(c2.u.f22885a, o0Var, 54);
            if (!((Boolean) p1Var3.getF182175a()).booleanValue() || qVar == null) {
                z16 = false;
                o0Var.C(737648503);
                o0Var.g0(false);
            } else {
                o0Var.C(-2054431716);
                Map map = (Map) p1Var4.getF182175a();
                if (map == null) {
                    o0Var.C(737126245);
                    z16 = false;
                    o0Var.g0(false);
                } else {
                    z16 = false;
                    o0Var.C(737126246);
                    n4.c cVar2 = (n4.c) p1Var2.getF182175a();
                    if (cVar2 == null) {
                        o0Var.C(-1310427305);
                        o0Var.g0(false);
                    } else {
                        o0Var.C(-1310427304);
                        y.c(map, cVar2.f123544a, m1Var.getFloatValue(), f18, qVar, x2.h(aVar4, o92.c.c(o0Var, n1Var3.getIntValue())), o0Var, 0, 0);
                        z16 = false;
                        o0Var.g0(false);
                    }
                    o0Var.g0(z16);
                }
                o0Var.g0(z16);
            }
            o0Var.g0(true);
            if (pVar2 == null) {
                o0Var.C(341154644);
                o0Var.g0(z16);
                pVar3 = pVar2;
            } else {
                o0Var.C(565194317);
                pVar3 = pVar2;
                e5.q((i18 >> 24) & 14, pVar3, o0Var, z16);
                Unit unit = Unit.INSTANCE;
            }
            o0Var.g0(true);
        } else {
            pVar3 = pVar2;
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: m92.i
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    l.a(rVar, pVar, fVar, str, z14, f14, f15, aVar, pVar3, qVar, lVar, (p3.m) obj, p3.p0.t(i14 | 1), p3.p0.t(i15));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x0099  */
    /* JADX WARN: Code duplicated, block: B:56:0x009e  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:78:0x00db  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:92:0x0100 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:93:0x0102  */
    /* JADX WARN: Code duplicated, block: B:94:0x0105  */
    /* JADX WARN: Code duplicated, block: B:96:0x014c  */
    /* JADX WARN: Code duplicated, block: B:99:0x0156  */
    public static final void b(final h4.r rVar, final String str, final g6.f fVar, final String str2, final boolean z14, float f14, final n92.a aVar, final e23.p pVar, final e23.q qVar, final e23.l lVar, p3.m mVar, final int i14, final int i15) {
        h4.r rVar2;
        int i16;
        g6.f fVar2;
        float f15;
        int i17;
        e23.p pVar2;
        int i18;
        boolean z15;
        final float f16;
        p2 p2VarI0;
        float f17;
        int i19;
        int i24;
        boolean zR;
        int i25;
        str2.getClass();
        p3.o0 o0VarE = mVar.E(222092215);
        if ((i14 & 6) == 0) {
            rVar2 = rVar;
            i16 = (o0VarE.B(rVar2) ? 4 : 2) | i14;
        } else {
            rVar2 = rVar;
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.B(str) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            fVar2 = fVar;
            i16 |= o0VarE.B(fVar2) ? 256 : 128;
        } else {
            fVar2 = fVar;
        }
        if ((i14 & 3072) == 0) {
            i16 |= o0VarE.B(str2) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i16 |= o0VarE.h(z14) ? 16384 : 8192;
        }
        int i26 = i15 & 32;
        if (i26 == 0) {
            if ((196608 & i14) == 0) {
                f15 = f14;
                i16 |= o0VarE.i(f15) ? 131072 : 65536;
            }
            i17 = i16 | 1572864;
            if ((12582912 & i14) == 0) {
                if ((16777216 & i14) == 0) {
                    zR = o0VarE.B(aVar);
                } else {
                    zR = o0VarE.r(aVar);
                }
                if (zR) {
                    i25 = 8388608;
                } else {
                    i25 = 4194304;
                }
                i17 |= i25;
            }
            if ((100663296 & i14) == 0) {
                pVar2 = pVar;
                if (o0VarE.r(pVar2)) {
                    i24 = 67108864;
                } else {
                    i24 = 33554432;
                }
                i17 |= i24;
            } else {
                pVar2 = pVar;
            }
            if ((805306368 & i14) != 0) {
                if (o0VarE.r(qVar)) {
                    i19 = 536870912;
                } else {
                    i19 = 268435456;
                }
                i17 |= i19;
            }
            i18 = o0VarE.r(lVar) ? 4 : 2;
            if ((306783379 & i17) == 306783378 || (i18 & 3) != 2) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (o0VarE.n(i17 & 1, z15)) {
                if (i26 != 0) {
                    f17 = 0.0f;
                } else {
                    f17 = f15;
                }
                x1 x1Var = p3.n.f135158a;
                a(rVar2, z3.f.c(1792601737, new fv1.b(str, 22), o0VarE), fVar2, str2, z14, f17, 0.0f, aVar, pVar2, qVar, lVar, o0VarE, (i17 & 14) | 48 | (i17 & 896) | (i17 & 7168) | (57344 & i17) | (458752 & i17) | (3670016 & i17) | (29360128 & i17) | (234881024 & i17) | (i17 & 1879048192), i18 & 14);
                f16 = f17;
            } else {
                o0VarE.e();
                f16 = f15;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e23.p() { // from class: m92.g
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        l.b(rVar, str, fVar, str2, z14, f16, aVar, pVar, qVar, lVar, (p3.m) obj, p3.p0.t(i14 | 1), i15);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i16 |= 196608;
        f15 = f14;
        i17 = i16 | 1572864;
        if ((12582912 & i14) == 0) {
            if ((16777216 & i14) == 0) {
                zR = o0VarE.B(aVar);
            } else {
                zR = o0VarE.r(aVar);
            }
            if (zR) {
                i25 = 8388608;
            } else {
                i25 = 4194304;
            }
            i17 |= i25;
        }
        if ((100663296 & i14) == 0) {
            pVar2 = pVar;
            if (o0VarE.r(pVar2)) {
                i24 = 67108864;
            } else {
                i24 = 33554432;
            }
            i17 |= i24;
        } else {
            pVar2 = pVar;
        }
        if ((805306368 & i14) != 0) {
            if (o0VarE.r(qVar)) {
                i19 = 536870912;
            } else {
                i19 = 268435456;
            }
            i17 |= i19;
        }
        if (o0VarE.r(lVar)) {
        }
        if ((306783379 & i17) == 306783378) {
            z15 = true;
        } else {
            z15 = true;
        }
        if (o0VarE.n(i17 & 1, z15)) {
            if (i26 != 0) {
                f17 = 0.0f;
            } else {
                f17 = f15;
            }
            x1 x1Var2 = p3.n.f135158a;
            a(rVar2, z3.f.c(1792601737, new fv1.b(str, 22), o0VarE), fVar2, str2, z14, f17, 0.0f, aVar, pVar2, qVar, lVar, o0VarE, (i17 & 14) | 48 | (i17 & 896) | (i17 & 7168) | (57344 & i17) | (458752 & i17) | (3670016 & i17) | (29360128 & i17) | (234881024 & i17) | (i17 & 1879048192), i18 & 14);
            f16 = f17;
        } else {
            o0VarE.e();
            f16 = f15;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: m92.g
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    l.b(rVar, str, fVar, str2, z14, f16, aVar, pVar, qVar, lVar, (p3.m) obj, p3.p0.t(i14 | 1), i15);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}

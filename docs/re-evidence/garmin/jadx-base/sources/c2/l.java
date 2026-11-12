package c2;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.List;
import kotlin.v3;
import p005kotlin.Unit;
import p3.b4;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bb1.a f22730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final bb1.a f22731b;

    static {
        byte b14 = 0;
        f22730a = new bb1.a(b14, 24);
        f22731b = new bb1.a(b14, 25);
    }

    public static h4.r A(h4.r rVar, float f14, float f15, int i14) {
        if ((i14 & 1) != 0) {
            f14 = 0;
            g6.f.a aVar = g6.f.f75994b;
        }
        if ((i14 & 2) != 0) {
            f15 = 0;
            g6.f.a aVar2 = g6.f.f75994b;
        }
        return z(rVar, f14, f15);
    }

    public static final h4.r B(h4.r rVar, final float f14, final float f15, final float f16, final float f17) {
        return rVar.then(new e2(f14, f15, f16, f17, true, new e23.l() { // from class: c2.f2
            @Override // e23.l
            public final Object invoke(Object obj) {
                kotlin.m2 m2Var = (kotlin.m2) obj;
                m2Var.f91341a = "padding";
                v3 v3Var = m2Var.f91343c;
                v3Var.c(g6.f.a(f14), TtmlNode.START);
                v3Var.c(g6.f.a(f15), "top");
                v3Var.c(g6.f.a(f16), TtmlNode.END);
                v3Var.c(g6.f.a(f17), "bottom");
                return Unit.INSTANCE;
            }
        }, null));
    }

    public static h4.r C(h4.r rVar, float f14, float f15, float f16, float f17, int i14) {
        if ((i14 & 1) != 0) {
            f14 = 0;
            g6.f.a aVar = g6.f.f75994b;
        }
        if ((i14 & 2) != 0) {
            f15 = 0;
            g6.f.a aVar2 = g6.f.f75994b;
        }
        if ((i14 & 4) != 0) {
            f16 = 0;
            g6.f.a aVar3 = g6.f.f75994b;
        }
        if ((i14 & 8) != 0) {
            f17 = 0;
            g6.f.a aVar4 = g6.f.f75994b;
        }
        return B(rVar, f14, f15, f16, f17);
    }

    public static final h4.r D(h4.r rVar) {
        return H(rVar, kotlin.k2.f91249a, new o3(3));
    }

    public static final h4.r E(h4.r rVar, q1 q1Var) {
        return rVar.then(new s1(q1Var, true, kotlin.k2.f91249a));
    }

    public static final h4.r F(h4.r rVar, k3 k3Var) {
        return rVar.then(new g0(k3Var, kotlin.k2.f91249a, f22731b));
    }

    public static final h4.r G(h4.r rVar, k3 k3Var) {
        return rVar.then(new j1(k3Var, kotlin.k2.f91249a));
    }

    public static final h4.r H(h4.r rVar, e23.l lVar, e23.l lVar2) {
        return rVar.then(new a3(lVar, lVar2));
    }

    public static final h4.r I(h4.r rVar, g gVar) {
        return rVar.then(new g0(gVar, kotlin.k2.f91249a, f22730a));
    }

    public static final l2 a(float f14) {
        return new l2(f14, f14, f14, f14, null);
    }

    public static final l2 b(float f14, float f15) {
        return new l2(f14, f15, f14, f15, null);
    }

    public static l2 c(float f14, float f15, int i14) {
        if ((i14 & 1) != 0) {
            f14 = 0;
            g6.f.a aVar = g6.f.f75994b;
        }
        if ((i14 & 2) != 0) {
            f15 = 0;
            g6.f.a aVar2 = g6.f.f75994b;
        }
        return b(f14, f15);
    }

    public static final l2 d(float f14, float f15, float f16, float f17) {
        return new l2(f14, f15, f16, f17, null);
    }

    public static l2 e(float f14, float f15, float f16, float f17, int i14) {
        if ((i14 & 1) != 0) {
            f14 = 0;
            g6.f.a aVar = g6.f.f75994b;
        }
        if ((i14 & 2) != 0) {
            f15 = 0;
            g6.f.a aVar2 = g6.f.f75994b;
        }
        if ((i14 & 4) != 0) {
            f16 = 0;
            g6.f.a aVar3 = g6.f.f75994b;
        }
        if ((i14 & 8) != 0) {
            f17 = 0;
            g6.f.a aVar4 = g6.f.f75994b;
        }
        return d(f14, f15, f16, f17);
    }

    public static final void f(h4.r rVar, p3.m mVar) {
        p3.x1 x1Var = p3.n.f135158a;
        z2 z2Var = z2.f22964a;
        int iHashCode = Long.hashCode(mVar.getU());
        h4.r rVarC = h4.k.c(rVar, mVar);
        p3.i2 i2VarX = mVar.x();
        h5.g.V.getClass();
        h5.e0.a aVar = h5.g.a.f81805b;
        if (mVar.F() == null) {
            p3.p0.l();
            throw null;
        }
        mVar.z();
        if (mVar.getT()) {
            mVar.M(aVar);
        } else {
            mVar.c();
        }
        b4.c(h5.g.a.f81810g, z2Var, mVar);
        b4.c(h5.g.a.f81809f, i2VarX, mVar);
        b4.b(h5.g.a.f81814k, mVar);
        b4.c(h5.g.a.f81807d, rVarC, mVar);
        b4.a(mVar, Integer.valueOf(iHashCode), h5.g.a.f81813j);
        mVar.y();
    }

    public static h4.r g(h4.r rVar, float f14) {
        return rVar.then(new k(f14, false, kotlin.k2.f91249a));
    }

    public static final float h(h2 h2Var, g6.o oVar) {
        return oVar == g6.o.Ltr ? h2Var.c(oVar) : h2Var.b(oVar);
    }

    public static final float i(h2 h2Var, g6.o oVar) {
        return oVar == g6.o.Ltr ? h2Var.b(oVar) : h2Var.c(oVar);
    }

    public static final h4.r j(h4.r rVar, h2 h2Var) {
        return rVar.then(new i2(h2Var, kotlin.k2.f91249a));
    }

    public static final h4.r k(h4.r rVar, k3 k3Var) {
        return rVar.then(new d3(k3Var, kotlin.k2.f91249a));
    }

    public static final h4.r l(h4.r rVar) {
        return H(rVar, kotlin.k2.f91249a, new o3(1));
    }

    public static final p2 m(f5.w wVar) {
        Object f81969t = wVar.getF81969t();
        if (f81969t instanceof p2) {
            return (p2) f81969t;
        }
        return null;
    }

    public static final float n(p2 p2Var) {
        if (p2Var != null) {
            return p2Var.f22811a;
        }
        return 0.0f;
    }

    public static final h4.r o(h4.r rVar, q1 q1Var) {
        return rVar.then(new n1(q1Var, true, kotlin.k2.f91249a));
    }

    public static final h4.r p(h4.r rVar) {
        return H(rVar, kotlin.k2.f91249a, new o3(2));
    }

    public static final boolean q(int i14, int i15, long j8) {
        int iL = g6.a.l(j8);
        if (i14 > g6.a.j(j8) || iL > i14) {
            return false;
        }
        return i15 <= g6.a.i(j8) && g6.a.k(j8) <= i15;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0049  */
    public static final f5.a1 r(o2 o2Var, int i14, int i15, int i16, int i17, int i18, f5.b1 b1Var, List list, f5.v1[] v1VarArr, int i19, int i24, int[] iArr, int i25) {
        o2 o2Var2;
        int i26;
        int i27;
        int i28;
        long j8;
        o2 o2Var3;
        int i29;
        p0 p0Var;
        int iMax;
        int iMax2;
        o2 o2Var4;
        int i30;
        p0 p0Var2;
        int i34 = i17;
        long j14 = i18;
        int i35 = i24 - i19;
        int[] iArr2 = new int[i35];
        int i36 = i19;
        int i37 = 0;
        int i38 = 0;
        int i39 = 0;
        boolean z14 = false;
        int i44 = 0;
        float f14 = 0.0f;
        while (true) {
            Integer numValueOf = null;
            if (i36 >= i24) {
                break;
            }
            f5.y0 y0Var = (f5.y0) list.get(i36);
            p2 p2VarM = m(y0Var);
            float fN = n(p2VarM);
            if (z14) {
                z14 = true;
            } else {
                f0 f0Var = p2VarM != null ? p2VarM.f22813c : null;
                if (f0Var != null ? f0Var instanceof f0.a : false) {
                    z14 = true;
                } else {
                    z14 = false;
                }
            }
            if (fN > 0.0f) {
                f14 += fN;
                i39++;
                i36 = i36;
                i30 = i38;
                j14 = j14;
            } else {
                if (i34 != Integer.MAX_VALUE && p2VarM != null && (p0Var2 = p2VarM.f22814d) != null) {
                    numValueOf = Integer.valueOf(Math.round(p0Var2.f22809a * i34));
                }
                int i45 = i16 - i44;
                f5.v1 v1VarQ = v1VarArr[i36];
                if (v1VarQ == null) {
                    o2Var4 = o2Var;
                    v1VarQ = y0Var.Q(o2Var.d(0, numValueOf != null ? numValueOf.intValue() : 0, i16 != Integer.MAX_VALUE ? i45 < 0 ? 0 : i45 : Integer.MAX_VALUE, numValueOf != null ? numValueOf.intValue() : i34, false));
                } else {
                    o2Var4 = o2Var;
                }
                int iB = o2Var4.b(v1VarQ);
                int iA = o2Var4.a(v1VarQ);
                iArr2[i36 - i19] = iB;
                int i46 = i45 - iB;
                if (i46 < 0) {
                    i46 = 0;
                }
                int iMin = Math.min(i18, i46);
                int iMax3 = Math.max(i38, iA);
                v1VarArr[i36] = v1VarQ;
                i44 = iB + iMin + i44;
                i30 = iMax3;
                i37 = iMin;
            }
            i36++;
            i38 = i30;
            j14 = j14;
        }
        long j15 = j14;
        int i47 = i38;
        o2 o2Var5 = o2Var;
        if (i39 == 0) {
            i44 -= i37;
            o2Var2 = o2Var5;
            i28 = i47;
            i27 = 0;
            i26 = 0;
        } else {
            long j16 = j15 * ((long) (i39 - 1));
            long jRound = ((long) ((i16 != Integer.MAX_VALUE ? i16 : i14) - i44)) - j16;
            if (jRound < 0) {
                jRound = 0;
            }
            float f15 = jRound / f14;
            for (int i48 = i19; i48 < i24; i48++) {
                jRound -= (long) Math.round(n(m((f5.y0) list.get(i48))) * f15);
            }
            int i49 = i19;
            int iMax4 = i47;
            int i54 = 0;
            while (i49 < i24) {
                if (v1VarArr[i49] == null) {
                    f5.y0 y0Var2 = (f5.y0) list.get(i49);
                    p2 p2VarM2 = m(y0Var2);
                    float fN2 = n(p2VarM2);
                    long j17 = jRound;
                    Integer numValueOf2 = (i34 == Integer.MAX_VALUE || p2VarM2 == null || (p0Var = p2VarM2.f22814d) == null) ? null : Integer.valueOf(Math.round(p0Var.f22809a * i34));
                    if (!(fN2 > 0.0f)) {
                        d2.a.b("All weights <= 0 should have placeables");
                    }
                    int iSignum = Long.signum(j17);
                    int i55 = iMax4;
                    j8 = j17 - ((long) iSignum);
                    int iRound = Math.round(fN2 * f15) + iSignum;
                    int i56 = 0;
                    int iMax5 = Math.max(0, iRound);
                    if ((p2VarM2 != null ? p2VarM2.f22812b : true) && iMax5 != Integer.MAX_VALUE) {
                        i56 = iMax5;
                    }
                    int iIntValue = numValueOf2 != null ? numValueOf2.intValue() : 0;
                    i29 = i49;
                    int iIntValue2 = numValueOf2 != null ? numValueOf2.intValue() : i34;
                    o2Var3 = o2Var;
                    f5.v1 v1VarQ2 = y0Var2.Q(o2Var3.d(i56, iIntValue, iMax5, iIntValue2, true));
                    int iB2 = o2Var3.b(v1VarQ2);
                    int iA2 = o2Var3.a(v1VarQ2);
                    iArr2[i29 - i19] = iB2;
                    i54 += iB2;
                    iMax4 = Math.max(i55, iA2);
                    v1VarArr[i29] = v1VarQ2;
                } else {
                    j8 = jRound;
                    o2Var3 = o2Var5;
                    i29 = i49;
                }
                i49 = i29 + 1;
                i34 = i17;
                o2Var5 = o2Var3;
                jRound = j8;
            }
            int i57 = iMax4;
            o2Var2 = o2Var5;
            i26 = 0;
            i27 = (int) (((long) i54) + j16);
            int i58 = i16 - i44;
            if (i27 < 0) {
                i27 = 0;
            }
            if (i27 > i58) {
                i27 = i58;
            }
            i28 = i57;
        }
        if (z14) {
            iMax = i26;
            iMax2 = iMax;
            for (int i59 = i19; i59 < i24; i59++) {
                f5.v1 v1Var = v1VarArr[i59];
                v1Var.getClass();
                Object f81969t = v1Var.getF81969t();
                p2 p2Var = f81969t instanceof p2 ? (p2) f81969t : null;
                f0 f0Var2 = p2Var != null ? p2Var.f22813c : null;
                Integer numB = f0Var2 != null ? f0Var2.b(v1Var) : null;
                if (numB != null) {
                    int iIntValue3 = numB.intValue();
                    int iA3 = o2Var2.a(v1Var);
                    iMax = Math.max(iMax, iIntValue3 != Integer.MIN_VALUE ? numB.intValue() : i26);
                    if (iIntValue3 == Integer.MIN_VALUE) {
                        iIntValue3 = iA3;
                    }
                    iMax2 = Math.max(iMax2, iA3 - iIntValue3);
                }
            }
        } else {
            iMax = i26;
            iMax2 = iMax;
        }
        int i64 = i44 + i27;
        if (i64 < 0) {
            i64 = i26;
        }
        int iMax6 = Math.max(i64, i14);
        int iMax7 = Math.max(i28, Math.max(i15, iMax2 + iMax));
        int[] iArr3 = new int[i35];
        o2Var2.j(iMax6, iArr2, iArr3, b1Var);
        return o2Var2.e(v1VarArr, b1Var, iMax, iArr3, iMax6, iMax7, iArr, i25, i19, i24);
    }

    public static final h4.r s(h4.r rVar) {
        return H(rVar, kotlin.k2.f91249a, new o3(0));
    }

    public static final h4.r t(h4.r rVar, e23.l lVar) {
        return rVar.then(new b2(lVar, true, new a12.a(lVar, 15)));
    }

    public static final h4.r u(h4.r rVar, float f14, float f15) {
        return rVar.then(new y1(f14, f15, true, new z1(f14, f15, 0), null));
    }

    public static h4.r v(h4.r rVar, float f14, float f15, int i14) {
        if ((i14 & 1) != 0) {
            f14 = 0;
            g6.f.a aVar = g6.f.f75994b;
        }
        if ((i14 & 2) != 0) {
            f15 = 0;
            g6.f.a aVar2 = g6.f.f75994b;
        }
        return u(rVar, f14, f15);
    }

    public static final h4.r w(h4.r rVar, e23.l lVar) {
        return rVar.then(new c0(lVar, kotlin.k2.f91249a));
    }

    public static final h4.r x(h4.r rVar, h2 h2Var) {
        return rVar.then(new k2(h2Var, new b41.a(h2Var, 12)));
    }

    public static final h4.r y(h4.r rVar, float f14) {
        return rVar.then(new e2(f14, f14, f14, f14, true, new a81.d(f14, 2), null));
    }

    public static final h4.r z(h4.r rVar, float f14, float f15) {
        return rVar.then(new e2(f14, f15, f14, f15, true, new z1(f14, f15, 1), null));
    }
}

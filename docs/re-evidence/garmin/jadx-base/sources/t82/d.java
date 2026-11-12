package t82;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b82.h;
import c2.j;
import c2.l;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import f5.p;
import h4.k;
import h4.r;
import h5.e0;
import h5.g;
import i3.d8;
import i3.mh;
import i3.p7;
import l72.b2;
import l72.f0;
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
import p3.y3;
import t70.a1;

/* JADX INFO: loaded from: classes9.dex */
public final class d {
    /* JADX WARN: Code duplicated, block: B:40:0x009e  */
    /* JADX WARN: Code duplicated, block: B:53:0x00dc  */
    public static final void a(boolean z14, boolean z15, b92.a aVar, e23.a<Unit> aVar2, m mVar, int i14) {
        boolean z16;
        o0 o0VarE = mVar.E(584726733);
        int i15 = i14 | (o0VarE.h(z14) ? 4 : 2) | (o0VarE.B(aVar) ? 256 : 128) | (o0VarE.r(aVar2) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            b2 b2Var = b2.XSMALL;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            float f14 = j92.b.f97899b.f97920e;
            if (z14) {
                o0VarE.C(-792985279);
                String str = aVar.f16961a.get(z15 ? "chevron_left" : "chevron_right");
                m.a aVar3 = m.f135153a;
                if (z15) {
                    o0VarE.C(-792838990);
                    f0 f0Var = f0.f110999a;
                    r rVarA = l.A(r.S, f14, 0.0f, 2);
                    String str2 = str == null ? "" : str;
                    boolean z17 = (i15 & 7168) == 2048;
                    Object objQ = o0VarE.q();
                    if (z17) {
                        objQ = new a1(aVar2, 3);
                        o0VarE.K(objQ);
                    } else {
                        aVar3.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new a1(aVar2, 3);
                            o0VarE.K(objQ);
                        }
                    }
                    h.a(f0Var, rVarA, b2Var, str2, (e23.a) objQ, o0VarE, 384, 0);
                    o0VarE.g0(false);
                    z16 = false;
                } else {
                    o0VarE.C(-792576079);
                    f0 f0Var2 = f0.f110999a;
                    r rVarA2 = l.A(r.S, f14, 0.0f, 2);
                    if (str == null) {
                        str = "";
                    }
                    boolean z18 = (i15 & 7168) == 2048;
                    Object objQ2 = o0VarE.q();
                    if (z18) {
                        objQ2 = new a1(aVar2, 4);
                        o0VarE.K(objQ2);
                    } else {
                        aVar3.getClass();
                        if (objQ2 == m.a.f135155b) {
                            objQ2 = new a1(aVar2, 4);
                            o0VarE.K(objQ2);
                        }
                    }
                    h.b(f0Var2, rVarA2, b2Var, str, (e23.a) objQ2, o0VarE, 384, 0);
                    z16 = false;
                    o0VarE.g0(false);
                }
                o0VarE.g0(z16);
            } else {
                o0VarE.C(-792307154);
                r rVarA3 = l.A(r.S, f14, 0.0f, 2);
                p pVar = p7.f89279a;
                l.f(x2.u(rVarA3.then(d8.f87832a), b2Var.a()), o0VarE);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ha0.e(i14, 8, aVar, aVar2, z14, z15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:81:0x018f  */
    /* JADX WARN: Code duplicated, block: B:89:0x022f  */
    public static final void b(r rVar, String str, e eVar, b92.a aVar, e23.l lVar, m mVar, int i14) {
        int i15;
        b92.a aVarB;
        b92.a aVarB2;
        str.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(1555520730);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(str) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(eVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= (i14 & 4096) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(lVar) ? 16384 : 8192;
        }
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = n.f135158a;
            j.f22691a.getClass();
            j.g gVar = j.f22698h;
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(gVar, h4.d.a.f81534l, o0VarE, 54);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVar, o0VarE);
            g.V.getClass();
            e0.a aVar2 = g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(g.a.f81810g, s2VarA, o0VarE);
            b4.c(g.a.f81809f, i2VarA0, o0VarE);
            g.a.b bVar = g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(g.a.f81807d, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            boolean z14 = eVar.f163167a;
            boolean z15 = eVar.f163168b;
            y3 y3Var = AndroidCompositionLocals_androidKt.f6042b;
            String string = ((Context) o0VarE.A(y3Var)).getString(R.string.gak_lbl_previous);
            string.getClass();
            String string2 = ((Context) o0VarE.A(y3Var)).getString(R.string.gak_lbl_next);
            string2.getClass();
            int i16 = i15;
            if (aVar == null) {
                b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
                c0235a.f16962a.put("chevron_left", string);
                aVarB = c0235a.b();
            } else {
                aVarB = aVar;
            }
            if (aVar == null) {
                b92.a.C0235a c0235a2 = new b92.a.C0235a(null, 1, null);
                c0235a2.f16962a.put("chevron_right", string2);
                aVarB2 = c0235a2.b();
            } else {
                aVarB2 = aVar;
            }
            if (aVarB.f16961a.get("chevron_left") == null) {
                b92.a.C0235a c0235a3 = new b92.a.C0235a(aVar);
                c0235a3.f16962a.put("chevron_left", string);
                aVarB = c0235a3.b();
            }
            if (aVarB2.f16961a.get("chevron_right") == null) {
                b92.a.C0235a c0235a4 = new b92.a.C0235a(aVar);
                c0235a4.f16962a.put("chevron_right", string2);
                aVarB2 = c0235a4.b();
            }
            int i17 = i16 & 57344;
            boolean z16 = i17 == 16384;
            Object objQ = o0VarE.q();
            m.a aVar3 = m.f135153a;
            if (z16) {
                objQ = new sq1.e(lVar, 20);
                o0VarE.K(objQ);
            } else {
                aVar3.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new sq1.e(lVar, 20);
                    o0VarE.K(objQ);
                }
            }
            int i18 = b92.a.f16960b;
            a(z14, true, aVarB, (e23.a) objQ, o0VarE, 48);
            r.a aVar4 = r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            r rVarA = u2Var.a(l.y(aVar4, j92.b.f97899b.f97920e), 1.0f, true);
            d6.h.f57752b.getClass();
            d6.h hVarA = d6.h.a(d6.h.f57755e);
            d92.b.f58624b.getClass();
            b92.a aVar5 = aVarB2;
            mh.c(str, rVarA, 0L, null, 0L, null, 0L, hVarA, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97932i), o0VarE), o0VarE, (i16 >> 3) & 14, 0, 130044);
            o0VarE = o0VarE;
            boolean z17 = i17 == 16384;
            Object objQ2 = o0VarE.q();
            if (z17) {
                objQ2 = new sq1.e(lVar, 21);
                o0VarE.K(objQ2);
            } else {
                aVar3.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new sq1.e(lVar, 21);
                    o0VarE.K(objQ2);
                }
            }
            a(z15, false, aVar5, (e23.a) objQ2, o0VarE, 48);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ka0.e((Object) rVar, (Object) str, (Object) eVar, (Object) aVar, lVar, i14, 17);
        }
    }
}

package sg0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import i3.mh;
import java.util.Locale;
import o72.h3;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p1;
import p3.p2;
import p3.x1;
import v62.d3;

/* JADX INFO: loaded from: classes8.dex */
public final class r {
    /* JADX WARN: Code duplicated, block: B:45:0x011b  */
    public static final void a(ue0.l lVar, e23.a<Unit> aVar, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0VarE = mVar.E(-1120962340);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(lVar) : o0VarE.r(lVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(aVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar2 = h4.r.S;
            h4.r rVarF = x2.f(aVar2, 1.0f);
            h4.d.f81522a.getClass();
            h4.g.a aVar3 = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            c2.z zVarA = c2.y.a(c2.j.f22694d, aVar3, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarF, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar4 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            f1.a(null, lVar.getFullName(), lVar.f170208m, lVar.A1(), lVar.getUserLevel(), o0VarE, com.garmin.android.apps.connectmobile.userprofile.model.l.f46892e << 6, 1);
            l72.f0.a aVar5 = l72.f0.a.f111000a;
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            bVar2.getClass();
            h4.r rVarC2 = c2.l.C(aVar2, 0.0f, f14, 0.0f, eVar.f97920e, 5);
            s62.a.f157643a.getClass();
            u4.d dVarA = d3.a(t62.b.f162798a);
            String strQ = gl1.y.Q(o0VarE, R.string.view_account);
            boolean z14 = (i15 & 112) == 32;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new rk0.y(aVar, 27);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new rk0.y(aVar, 27);
                    o0VarE.K(objQ);
                }
            }
            aVar5.h(3072, 0, (e23.a) objQ, rVarC2, strQ, o0VarE, dVarA, true);
            o0VarE = o0VarE;
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new m(lVar, aVar, i14, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(f0 f0Var, s0 s0Var, s0 s0Var2, o0 o0Var, o0 o0Var2, s0 s0Var3, s0 s0Var4, s0 s0Var5, rk0.a1 a1Var, o0 o0Var3, p0 p0Var, p0 p0Var2, s0 s0Var6, q0 q0Var, p3.m mVar, int i14) {
        p3.o0 o0Var4;
        Object qVar;
        p1 p1Var;
        Context context;
        p1 p1Var2;
        p1 p1Var3;
        p3.o0 o0VarE = mVar.E(-583720877);
        int i15 = i14 | (o0VarE.r(f0Var) ? 4 : 2) | (o0VarE.r(s0Var) ? 32 : 16) | (o0VarE.r(s0Var2) ? 256 : 128) | (o0VarE.r(o0Var) ? 2048 : 1024) | (o0VarE.r(o0Var2) ? 16384 : 8192) | (o0VarE.r(o0Var3) ? 536870912 : 268435456);
        int i16 = (o0VarE.r(p0Var) ? (char) 4 : (char) 2) | (o0VarE.r(p0Var2) ? ' ' : (char) 16) | (o0VarE.r(s0Var6) ? 256 : 128) | (o0VarE.r(q0Var) ? (char) 2048 : (char) 1024);
        if (o0VarE.n(i15 & 1, ((268444819 & i15) == 268444818 && (i16 & 1171) == 1170) ? false : true)) {
            x1 x1Var = p3.n.f135158a;
            p1 p1VarC = s9.c.c(r53.s.d(f0Var.f159087f), o0VarE);
            p1 p1VarC2 = s9.c.c(f0Var.f159088g, o0VarE);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var4 = (p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ2);
            }
            p1 p1Var5 = (p1) objQ2;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ3);
            }
            p1 p1Var6 = (p1) objQ3;
            Context context2 = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            String str = ((u) p1VarC.getF182175a()).f159162g;
            boolean zB = o0VarE.B(p1VarC) | o0VarE.r(context2);
            Object objQ4 = o0VarE.q();
            if (zB || objQ4 == c2565a) {
                objQ4 = new o(context2, p1VarC, null);
                o0VarE.K(objQ4);
            }
            p3.l0.e((e23.p) objQ4, str, o0VarE);
            Boolean boolValueOf = Boolean.valueOf(((u) p1VarC.getF182175a()).f159166k);
            boolean zB2 = o0VarE.B(p1VarC) | ((i16 & 896) == 256);
            Object objQ5 = o0VarE.q();
            if (zB2 || objQ5 == c2565a) {
                objQ5 = new p(p1VarC, s0Var6, null);
                o0VarE.K(objQ5);
            }
            p3.l0.e((e23.p) objQ5, boolValueOf, o0VarE);
            fw.m mVar2 = (fw.m) p1VarC2.getF182175a();
            boolean zB3 = o0VarE.B(p1VarC2) | o0VarE.r(f0Var) | o0VarE.r(context2);
            Object objQ6 = o0VarE.q();
            if (zB3 || objQ6 == c2565a) {
                p1Var = p1VarC;
                context = context2;
                p1Var2 = p1Var6;
                p1Var3 = p1Var5;
                qVar = new q(f0Var, p1VarC2, context, p1Var3, p1Var2, null);
                o0VarE.K(qVar);
            } else {
                p1Var = p1VarC;
                context = context2;
                qVar = objQ6;
                p1Var2 = p1Var6;
                p1Var3 = p1Var5;
            }
            fw.m.a aVar = fw.m.f73767e;
            p3.l0.e((e23.p) qVar, mVar2, o0VarE);
            o0Var4 = o0VarE;
            z02.d.a(((u) p1Var.getF182175a()).f159161f, z3.f.c(598540440, new s5.a(q0Var, 8), o0VarE), null, null, null, z3.f.c(-688851044, new e11.t(p1Var, f0Var, o0Var2, o0Var, s0Var2, s0Var, o0Var3, context, p0Var, p0Var2, p1Var4, p1Var3, p1Var2, 4), o0VarE), o0Var4, 196656, 28);
        } else {
            o0Var4 = o0VarE;
            o0Var4.e();
        }
        p2 p2VarI0 = o0Var4.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o50.b(f0Var, s0Var, s0Var2, o0Var, o0Var2, s0Var3, s0Var4, s0Var5, a1Var, o0Var3, p0Var, p0Var2, s0Var6, q0Var, i14, 1);
        }
    }

    public static final void c(c2.a0 a0Var, p0 p0Var, p0 p0Var2, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(659183422);
        int i15 = (o0VarE.r(p0Var) ? 32 : 16) | i14 | (o0VarE.r(p0Var2) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 145) != 144)) {
            x1 x1Var = p3.n.f135158a;
            f(gl1.y.Q(o0VarE, R.string.lbl_legal), o0VarE, 0);
            d(gl1.y.Q(o0VarE, R.string.legal_page_eula), null, p0Var, o0VarE, (i15 << 6) & 7168, 6);
            d(gl1.y.Q(o0VarE, R.string.legal_page_privacy_policy), null, p0Var2, o0VarE, (i15 << 3) & 7168, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new rx1.u(a0Var, p0Var, p0Var2, i14, 10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0042  */
    /* JADX WARN: Code duplicated, block: B:25:0x0048  */
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:31:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x0060 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0062  */
    /* JADX WARN: Code duplicated, block: B:39:0x0077  */
    /* JADX WARN: Code duplicated, block: B:42:0x007e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0087  */
    /* JADX WARN: Code duplicated, block: B:46:0x00af  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:51:? A[RETURN, SYNTHETIC] */
    public static final void d(String str, e23.p pVar, e23.a aVar, p3.m mVar, int i14, int i15) {
        int i16;
        e23.p pVar2;
        boolean z14;
        e23.p pVar3;
        p2 p2VarI0;
        boolean z15;
        Object objQ;
        int i17;
        p3.o0 o0VarE = mVar.E(965024948);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(str) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        int i18 = i16 | 48;
        int i19 = i15 & 4;
        if (i19 == 0) {
            if ((i14 & 384) == 0) {
                pVar2 = pVar;
                i18 |= o0VarE.r(pVar2) ? 256 : 128;
            }
            if ((i14 & 3072) == 0) {
                if (o0VarE.r(aVar)) {
                    i17 = 2048;
                } else {
                    i17 = 1024;
                }
                i18 |= i17;
            }
            if ((i18 & 1171) != 1170) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i18 & 1, z14)) {
                if (i19 != 0) {
                    pVar2 = null;
                }
                e23.p pVar4 = pVar2;
                z15 = true;
                x1 x1Var = p3.n.f135158a;
                o0VarE.C(-1452675986);
                l72.p2 p2Var = l72.p2.f111205a;
                if ((i18 & 7168) != 2048) {
                    z15 = false;
                }
                objQ = o0VarE.q();
                if (z15) {
                    objQ = new rk0.y(aVar, 28);
                    o0VarE.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new rk0.y(aVar, 28);
                        o0VarE.K(objQ);
                    }
                }
                p2Var.g(str, null, null, null, pVar4, false, false, (e23.a) objQ, o0VarE, (i18 & 14) | ((i18 << 6) & 57344), 238);
                o0VarE.g0(false);
                pVar3 = pVar4;
            } else {
                o0VarE.e();
                pVar3 = pVar2;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new n(str, pVar3, aVar, i14, i15);
            }
        }
        i18 = i16 | 432;
        pVar2 = pVar;
        if ((i14 & 3072) == 0) {
            if (o0VarE.r(aVar)) {
                i17 = 2048;
            } else {
                i17 = 1024;
            }
            i18 |= i17;
        }
        if ((i18 & 1171) != 1170) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i18 & 1, z14)) {
            if (i19 != 0) {
                pVar2 = null;
            }
            e23.p pVar5 = pVar2;
            z15 = true;
            x1 x1Var2 = p3.n.f135158a;
            o0VarE.C(-1452675986);
            l72.p2 p2Var2 = l72.p2.f111205a;
            if ((i18 & 7168) != 2048) {
                z15 = false;
            }
            objQ = o0VarE.q();
            if (z15) {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new rk0.y(aVar, 28);
                    o0VarE.K(objQ);
                }
            } else {
                objQ = new rk0.y(aVar, 28);
                o0VarE.K(objQ);
            }
            p2Var2.g(str, null, null, null, pVar5, false, false, (e23.a) objQ, o0VarE, (i18 & 14) | ((i18 << 6) & 57344), 238);
            o0VarE.g0(false);
            pVar3 = pVar5;
        } else {
            o0VarE.e();
            pVar3 = pVar2;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n(str, pVar3, aVar, i14, i15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0067  */
    public static final void e(c2.a0 a0Var, String str, Context context, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(-80985213);
        int i15 = (o0VarE.B(str) ? 32 : 16) | i14 | (o0VarE.r(context) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 145) != 144)) {
            x1 x1Var = p3.n.f135158a;
            f(gl1.y.Q(o0VarE, R.string.lbl_manage_account), o0VarE, 0);
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_account_administration);
            v.f159171a.getClass();
            z3.e eVar = v.f159172b;
            boolean zR = o0VarE.r(context) | ((i15 & 112) == 32);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new ry0.a(context, str, 1);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new ry0.a(context, str, 1);
                    o0VarE.K(objQ);
                }
            }
            d(strQ, eVar, (e23.a) objQ, o0VarE, 384, 2);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new rx1.u(a0Var, str, context, i14, 11);
        }
    }

    public static final void f(String str, p3.m mVar, int i14) {
        p3.o0 o0Var;
        p3.o0 o0VarE = mVar.E(-72688049);
        int i15 = (o0VarE.B(str) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            String upperCase = str.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            s5.x0 x0VarF = d92.c.f(j92.f.f97934k, o0VarE);
            h4.r.a aVar = h4.r.S;
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97921f;
            float f15 = eVar.f97920e;
            bVar.getClass();
            bVar.getClass();
            bVar.getClass();
            o0Var = o0VarE;
            mh.c(upperCase, c2.l.B(aVar, f15, f14, f15, eVar.f97917b), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0Var, 0, 0, 131068);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h3(str, i14, 20);
        }
    }
}

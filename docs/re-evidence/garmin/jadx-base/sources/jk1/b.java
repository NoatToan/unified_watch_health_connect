package jk1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.l;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import d53.u;
import ew1.f2;
import h4.k;
import h5.e0;
import hk1.r;
import l72.f0;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class b {
    /* JADX WARN: Code duplicated, block: B:59:0x0148  */
    /* JADX WARN: Code duplicated, block: B:71:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:82:0x0267  */
    public static final void a(r rVar, hk1.c cVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, m mVar, int i14) {
        String strV;
        String strV2;
        Context context;
        String str;
        float f14;
        boolean z14;
        h4.r.a aVar3;
        boolean z15;
        o0 o0VarE = mVar.E(-2143965425);
        int i15 = i14 | (o0VarE.r(rVar) ? 4 : 2) | (o0VarE.B(cVar) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128) | (o0VarE.r(aVar2) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            Context context2 = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            String applicationName = rVar.getApplicationName();
            String privacyPolicyUrl = rVar.getPrivacyPolicyUrl();
            String str2 = cVar.f84130d;
            if (str2 != null) {
                strV = u.v(str2, "[APP]", applicationName == null ? "" : applicationName, false);
            } else {
                strV = null;
            }
            String str3 = cVar.f84131e;
            if (str3 != null) {
                strV2 = u.v(str3, "[APP]", applicationName == null ? "" : applicationName, false);
            } else {
                strV2 = null;
            }
            h4.r.a aVar4 = h4.r.S;
            h4.r rVarF = x2.f(aVar4, 1.0f);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            String str4 = strV;
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = k.c(rVarF, o0VarE);
            h5.g.V.getClass();
            e0.a aVar5 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            m.a aVar6 = m.f135153a;
            if (str4 != null) {
                o0VarE.C(-1892839528);
                f0 f0Var = f0.f110999a;
                h4.r rVarF2 = x2.f(aVar4, 1.0f);
                d92.b.f58623a.getClass();
                j92.b bVar2 = d92.b.f58625c;
                bVar2.getClass();
                j92.e eVar = j92.b.f97899b;
                h4.r rVarC2 = l.C(rVarF2, 0.0f, eVar.f97918c, 0.0f, 0.0f, 13);
                bVar2.getClass();
                h4.r rVarA = l.A(rVarC2, eVar.f97920e, 0.0f, 2);
                boolean z16 = (i15 & 896) == 256;
                Object objQ = o0VarE.q();
                if (z16) {
                    objQ = new j22.d(aVar, 5);
                    o0VarE.K(objQ);
                } else {
                    aVar6.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new j22.d(aVar, 5);
                        o0VarE.K(objQ);
                    }
                }
                aVar3 = aVar4;
                str = applicationName;
                context = context2;
                f14 = 1.0f;
                z14 = false;
                f0Var.d(0, 9, (e23.a) objQ, rVarA, str4, o0VarE, null, false);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            } else {
                context = context2;
                str = applicationName;
                f14 = 1.0f;
                z14 = false;
                aVar3 = aVar4;
                o0VarE.C(-1892515671);
                o0VarE.g0(false);
            }
            if (strV2 != 0) {
                o0VarE.C(-1892467497);
                f0 f0Var2 = f0.f110999a;
                h4.r rVarF3 = x2.f(aVar3, f14);
                d92.b.f58623a.getClass();
                j92.b bVar3 = d92.b.f58625c;
                bVar3.getClass();
                j92.e eVar2 = j92.b.f97899b;
                h4.r rVarC3 = l.C(rVarF3, 0.0f, eVar2.f97918c, 0.0f, 0.0f, 13);
                bVar3.getClass();
                h4.r rVarA2 = l.A(rVarC3, eVar2.f97920e, 0.0f, 2);
                boolean z17 = (i15 & 7168) == 2048 ? true : z14;
                Object objQ2 = o0VarE.q();
                if (z17) {
                    objQ2 = new j22.d(aVar2, 6);
                    o0VarE.K(objQ2);
                } else {
                    aVar6.getClass();
                    if (objQ2 == m.a.f135155b) {
                        objQ2 = new j22.d(aVar2, 6);
                        o0VarE.K(objQ2);
                    }
                }
                f0Var2.i(strV2, rVarA2, false, (e23.a) objQ2, o0VarE, 0, 4);
                o0VarE.g0(z14);
            } else {
                o0VarE.C(-1892142679);
                o0VarE.g0(z14);
            }
            if (str == null || privacyPolicyUrl == 0) {
                z15 = true;
                o0VarE.C(-1891585175);
                o0VarE.g0(z14);
            } else {
                o0VarE.C(-1892060870);
                f0 f0Var3 = f0.f110999a;
                String strP = gl1.y.P(R.string.string_space_string_pattern, new Object[]{str, gl1.y.Q(o0VarE, R.string.txt_privacy_policy)}, o0VarE);
                h4.r rVarF4 = x2.f(aVar3, f14);
                d92.b.f58623a.getClass();
                j92.b bVar4 = d92.b.f58625c;
                bVar4.getClass();
                j92.e eVar3 = j92.b.f97899b;
                h4.r rVarC4 = l.C(rVarF4, 0.0f, eVar3.f97918c, 0.0f, 0.0f, 13);
                bVar4.getClass();
                h4.r rVarA3 = l.A(rVarC4, eVar3.f97920e, 0.0f, 2);
                boolean zR = o0VarE.r(context) | o0VarE.B(str) | o0VarE.B(privacyPolicyUrl);
                Object objQ3 = o0VarE.q();
                if (zR) {
                    z15 = true;
                    objQ3 = new id2.n(context, 1, str, privacyPolicyUrl);
                    o0VarE.K(objQ3);
                } else {
                    aVar6.getClass();
                    if (objQ3 == m.a.f135155b) {
                        z15 = true;
                        objQ3 = new id2.n(context, 1, str, privacyPolicyUrl);
                        o0VarE.K(objQ3);
                    } else {
                        z15 = true;
                    }
                }
                f0Var3.k(strP, rVarA3, false, (e23.a) objQ3, o0VarE, 0, 4);
                o0VarE.g0(z14);
            }
            o0VarE.g0(z15);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new jj2.c(rVar, cVar, aVar, aVar2, i14, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(String str, f fVar, e23.a<Unit> aVar, m mVar, int i14) {
        fVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(1336236562);
        int i15 = (o0VarE.B(str) ? 4 : 2) | i14 | (o0VarE.r(fVar) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128);
        int i16 = 1;
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            p1 p1VarC = s9.c.c(fVar.f99407k, o0VarE);
            z02.d.a(((e) p1VarC.getF182175a()).f99387a, z3.f.c(-572104467, new f2(aVar, p1VarC, i16), o0VarE), null, null, null, z3.f.c(-685835159, new gw1.c(fVar, 26, p1VarC, str), o0VarE), o0VarE, 196656, 28);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new gw1.c(str, fVar, aVar, i14, 27);
        }
    }
}

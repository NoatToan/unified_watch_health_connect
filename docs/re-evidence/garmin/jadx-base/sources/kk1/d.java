package kk1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.u1;
import c2.b0;
import c2.l;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import d53.u;
import h4.k;
import h4.r;
import h5.e0;
import hk1.a0;
import kb0.p;
import kd0.h6;
import l72.c1;
import l72.f0;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f105141a;

    static {
        g6.f.a aVar = g6.f.f75994b;
        f105141a = 100;
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0138  */
    /* JADX WARN: Code duplicated, block: B:78:0x01e7  */
    public static final void a(hk1.c cVar, a0 a0Var, e23.a<Unit> aVar, m mVar, int i14) {
        int i15;
        String strV;
        Context context;
        r.a aVar2;
        float f14;
        String str;
        o0 o0VarE = mVar.E(1312330560);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(cVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(a0Var) : o0VarE.r(a0Var) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(aVar) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            Context context2 = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            if (cVar == null || (str = cVar.f84130d) == null) {
                strV = null;
            } else {
                String strO = a0Var.o();
                strO.getClass();
                strV = u.v(str, "[APP]", strO, false);
            }
            r.a aVar3 = r.S;
            r rVarF = x2.f(aVar3, 1.0f);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarF, o0VarE);
            h5.g.V.getClass();
            e0.a aVar4 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
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
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            boolean zD = g22.n.d(strV);
            m.a aVar5 = m.f135153a;
            if (zD) {
                o0VarE.C(1664040294);
                f0 f0Var = f0.f110999a;
                r rVarF2 = x2.f(aVar3, 1.0f);
                d92.b.f58623a.getClass();
                j92.b bVar2 = d92.b.f58625c;
                bVar2.getClass();
                j92.e eVar = j92.b.f97899b;
                r rVarC2 = l.C(rVarF2, 0.0f, eVar.f97918c, 0.0f, 0.0f, 13);
                bVar2.getClass();
                r rVarA = l.A(rVarC2, eVar.f97920e, 0.0f, 2);
                boolean z14 = (i15 & 896) == 256;
                Object objQ = o0VarE.q();
                if (z14) {
                    objQ = new p(aVar, 8);
                    o0VarE.K(objQ);
                } else {
                    aVar5.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new p(aVar, 8);
                        o0VarE.K(objQ);
                    }
                }
                e23.a<Unit> aVar6 = (e23.a) objQ;
                f14 = 1.0f;
                context = context2;
                aVar2 = aVar3;
                f0Var.b(strV, rVarA, false, aVar6, o0VarE, 0, 4);
                o0VarE.g0(false);
            } else {
                context = context2;
                aVar2 = aVar3;
                f14 = 1.0f;
                o0VarE.C(1664384332);
                o0VarE.g0(false);
            }
            if (g22.n.d(a0Var.s())) {
                o0VarE.C(1664465459);
                f0 f0Var2 = f0.f110999a;
                String strP = gl1.y.P(R.string.string_space_string_pattern, new Object[]{a0Var.o(), gl1.y.Q(o0VarE, R.string.txt_privacy_policy)}, o0VarE);
                r rVarF3 = x2.f(aVar2, f14);
                d92.b.f58623a.getClass();
                j92.b bVar3 = d92.b.f58625c;
                bVar3.getClass();
                j92.e eVar2 = j92.b.f97899b;
                r rVarC3 = l.C(rVarF3, 0.0f, eVar2.f97918c, 0.0f, 0.0f, 13);
                bVar3.getClass();
                r rVarA2 = l.A(rVarC3, eVar2.f97920e, 0.0f, 2);
                boolean zR = o0VarE.r(context) | ((i15 & 112) == 32 || ((i15 & 64) != 0 && o0VarE.r(a0Var)));
                Object objQ2 = o0VarE.q();
                if (zR) {
                    objQ2 = new k11.h(11, context, a0Var);
                    o0VarE.K(objQ2);
                } else {
                    aVar5.getClass();
                    if (objQ2 == m.a.f135155b) {
                        objQ2 = new k11.h(11, context, a0Var);
                        o0VarE.K(objQ2);
                    }
                }
                f0Var2.k(strP, rVarA2, false, (e23.a) objQ2, o0VarE, 0, 4);
                o0VarE.g0(false);
            } else {
                o0VarE.C(1664981516);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h6(cVar, a0Var, aVar, i14, 9);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(g gVar, e23.a aVar, e23.a aVar2, m mVar, int i14) {
        g gVar2;
        g gVar3;
        int i15;
        a0 a0Var;
        p1 p1Var;
        p1 p1Var2;
        boolean z14;
        o0 o0VarP = fb1.c.p(aVar, aVar2, mVar, -366882041);
        int i16 = i14 | 2 | (o0VarP.r(aVar) ? 32 : 16) | (o0VarP.r(aVar2) ? 256 : 128);
        int i17 = 0;
        if (o0VarP.n(i16 & 1, (i16 & 147) != 146)) {
            o0VarP.G0();
            if ((i14 & 1) == 0 || o0VarP.o0()) {
                o0VarP.L(-1614864554);
                v9.a.f176280a.getClass();
                ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(o0VarP);
                if (viewModelStoreOwnerA == null) {
                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(s0.f105811a.b(g.class), viewModelStoreOwnerA.getF185700a(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(o0VarP, 0), null);
                o0VarP.g0(false);
                gVar3 = (g) u1VarResolveViewModel;
                i15 = i16 & (-15);
            } else {
                o0VarP.e();
                i15 = i16 & (-15);
                gVar3 = gVar;
            }
            o0VarP.h0();
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarP.A(AndroidCompositionLocals_androidKt.f6042b);
            a0 a0Var2 = gVar3.f105153g;
            p1 p1VarC = s9.c.c(gVar3.f105155i, o0VarP);
            Object objQ = o0VarP.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.FALSE);
                o0VarP.K(objQ);
            }
            p1 p1Var3 = (p1) objQ;
            Boolean boolValueOf = Boolean.valueOf(((j) p1VarC.getF182175a()).f105170f);
            boolean zB = ((i15 & 112) == 32) | o0VarP.B(p1VarC) | ((i15 & 896) == 256);
            Object objQ2 = o0VarP.q();
            if (zB || objQ2 == c2565a) {
                objQ2 = new b(aVar, aVar2, p1VarC, null);
                o0VarP.K(objQ2);
            }
            l0.e((e23.p) objQ2, boolValueOf, o0VarP);
            Boolean boolValueOf2 = Boolean.valueOf(((j) p1VarC.getF182175a()).f105166b);
            boolean zB2 = o0VarP.B(p1VarC) | o0VarP.r(context);
            Object objQ3 = o0VarP.q();
            if (zB2 || objQ3 == c2565a) {
                objQ3 = new c(context, p1VarC, null);
                o0VarP.K(objQ3);
            }
            l0.e((e23.p) objQ3, boolValueOf2, o0VarP);
            if (((Boolean) p1Var3.getF182175a()).booleanValue()) {
                o0VarP.C(-386295740);
                if (((j) p1VarC.getF182175a()).f105169e == null) {
                    o0VarP.C(909733949);
                    o0VarP.g0(false);
                    z14 = false;
                    a0Var = a0Var2;
                    p1Var = p1VarC;
                    p1Var2 = p1Var3;
                } else {
                    o0VarP.C(909733950);
                    c1 c1Var = c1.f110940a;
                    String strP = gl1.y.P(R.string.settings_disconnect_from_app_question, new Object[]{a0Var2.o()}, o0VarP);
                    String strP2 = gl1.y.P(R.string.settings_data_sharing_disconnect_effect, new Object[]{a0Var2.o()}, o0VarP);
                    String strQ = gl1.y.Q(o0VarP, R.string.common_disconnect);
                    String strQ2 = gl1.y.Q(o0VarP, R.string.lbl_cancel);
                    boolean zR = o0VarP.r(gVar3) | o0VarP.r(a0Var2);
                    Object objQ4 = o0VarP.q();
                    if (zR || objQ4 == c2565a) {
                        objQ4 = new a(gVar3, i17, a0Var2, p1Var3);
                        o0VarP.K(objQ4);
                    }
                    e23.a<Unit> aVar3 = (e23.a) objQ4;
                    Object objQ5 = o0VarP.q();
                    if (objQ5 == c2565a) {
                        objQ5 = new kb0.k(p1Var3, 12);
                        o0VarP.K(objQ5);
                    }
                    p1Var2 = p1Var3;
                    a0Var = a0Var2;
                    z14 = false;
                    p1Var = p1VarC;
                    c1Var.a(false, strP, strP2, null, null, strQ, false, false, aVar3, strQ2, (e23.a) objQ5, o0VarP, 6, 6, 216);
                    o0VarP = o0VarP;
                    o0VarP.g0(false);
                }
                o0VarP.g0(z14);
            } else {
                gVar3 = gVar3;
                a0Var = a0Var2;
                p1Var = p1VarC;
                p1Var2 = p1Var3;
                o0VarP.C(910577243);
                o0VarP.g0(false);
            }
            g gVar4 = gVar3;
            z02.d.a(((j) p1Var.getF182175a()).f105165a, z3.f.c(727620172, new k41.e(13, a0Var, aVar2), o0VarP), null, null, null, z3.f.c(1305771344, new jj2.c(a0Var, gVar4, p1Var, p1Var2, 13), o0VarP), o0VarP, 196656, 28);
            gVar2 = gVar4;
        } else {
            o0VarP.e();
            gVar2 = gVar;
        }
        p2 p2VarI0 = o0VarP.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new jt1.m(gVar2, aVar, false, aVar2, i14, 15);
        }
    }
}

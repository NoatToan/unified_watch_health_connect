package d81;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import cw1.k0;
import f72.n0;
import i3.e5;
import l72.x0;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class v {
    /* JADX WARN: Code duplicated, block: B:40:0x0107  */
    public static final void a(g81.a0 a0Var, int i14, b63.o oVar, b63.o oVar2, p3.m mVar, int i15) {
        o0 o0Var;
        j92.e eVar;
        oVar.getClass();
        oVar2.getClass();
        o0 o0VarE = mVar.E(239051421);
        int i16 = i15 | (o0VarE.B(a0Var) ? 4 : 2) | (o0VarE.r(oVar) ? 256 : 128) | (o0VarE.r(oVar2) ? 2048 : 1024);
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            h4.r rVarF = x2.f(aVar, 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar2 = j92.b.f97899b;
            h4.r rVarA = c2.l.A(rVarF, eVar2.f97920e, 0.0f, 2);
            c2.j jVar = c2.j.f22691a;
            bVar.getClass();
            float f14 = eVar2.f97919d;
            jVar.getClass();
            c2.j.i iVarI = c2.j.i(f14);
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(iVarI, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarA, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            Unit unit = null;
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
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            if (a0Var == null) {
                o0VarE.C(1752563142);
                o0VarE.g0(false);
                o0Var = o0VarE;
                eVar = eVar2;
            } else {
                o0VarE.C(1752563143);
                boolean zR = o0VarE.r(a0Var) | o0VarE.r(oVar) | o0VarE.r(oVar2);
                Object objQ = o0VarE.q();
                p3.m.a aVar3 = p3.m.f135153a;
                if (zR) {
                    k0 k0Var = new k0(a0Var, oVar, oVar2, i14, 2);
                    o0VarE.K(k0Var);
                    objQ = k0Var;
                } else {
                    aVar3.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        k0 k0Var2 = new k0(a0Var, oVar, oVar2, i14, 2);
                        o0VarE.K(k0Var2);
                        objQ = k0Var2;
                    }
                }
                g6.f.a aVar4 = g6.f.f75994b;
                o0Var = o0VarE;
                p002j6.c.b((e23.l) objQ, x2.h(x2.f(aVar, 1.0f), 300), null, o0Var, 48, 4);
                String strG = e5.g(a0Var.f76264a, StringUtils.SPACE, gl1.y.Q(o0Var, R.string.lbl_hill_score_avg_score));
                Context context = (Context) o0Var.A(AndroidCompositionLocals_androidKt.f6042b);
                Object objQ2 = o0Var.q();
                aVar3.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new t(1);
                    o0Var.K(objQ2);
                }
                String strA = oi0.c.A(context, (e23.l) objQ2, strG);
                x0 x0Var = x0.f111346a;
                bVar.getClass();
                eVar = eVar2;
                x0Var.e(c2.l.C(aVar, 0.0f, 0.0f, 0.0f, eVar2.f97920e, 7), z3.f.c(1385967649, new aa2.f(27, a0Var, strA), o0Var), o0Var, (x0.f111348c << 6) | 48, 0);
                o0Var.g0(false);
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                h4.r rVarC2 = c2.l.C(ds.e0.g(o0Var, 1754934085, aVar, 1.0f, bVar), 0.0f, eVar.f97921f, 0.0f, 0.0f, 13);
                s62.a.f157643a.getClass();
                o0 o0Var2 = o0Var;
                b82.n.c(n0.a(t62.c.f162799a), gl1.y.Q(o0Var, R.string.common_no_data), gl1.y.Q(o0Var, R.string.msg_endurance_score_sync_device), rVarC2, null, o0Var2, 0, 16);
                o0Var = o0Var2;
                o0Var.g0(false);
            } else {
                o0Var.C(195081694);
                o0Var.g0(false);
            }
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cn1.p(a0Var, i14, oVar, oVar2, i15, 16);
        }
    }
}

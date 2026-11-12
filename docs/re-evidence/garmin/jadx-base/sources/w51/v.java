package w51;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.c3;
import com.garmin.android.apps.connectmobile.k1;
import i3.fe;
import i3.mh;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Set;
import l72.l2;
import p3.b4;
import p3.i2;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class v {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(h0 h0Var, ky0.w wVar, e23.a aVar, p3.m mVar, int i14) {
        h0Var.getClass();
        aVar.getClass();
        p3.o0 o0VarE = mVar.E(1353351635);
        int i15 = i14 | (o0VarE.r(h0Var) ? 4 : 2) | (o0VarE.r(wVar) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            p1 p1VarC = s9.c.c(r53.s.d(h0Var.f182267b), o0VarE);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = com.nimbusds.jose.shaded.gson.internal.a.f(o0VarE);
            }
            fe feVar = (fe) objQ;
            Object obj = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            obj.getClass();
            c3 c3Var = (c3) obj;
            Object[] objArr = new Object[0];
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new w11.b(12);
                o0VarE.K(objQ2);
            }
            p1 p1Var = (p1) d4.a.e(objArr, (e23.a) objQ2, o0VarE, 48);
            boolean zR = ((i15 & 896) == 256) | o0VarE.r(h0Var) | o0VarE.r(obj);
            Object objQ3 = o0VarE.q();
            if (zR || objQ3 == c2565a) {
                objQ3 = new ug2.b0(h0Var, 15, obj, aVar);
                o0VarE.K(objQ3);
            }
            e23.a aVar2 = (e23.a) objQ3;
            boolean zB = o0VarE.B(aVar2);
            Object objQ4 = o0VarE.q();
            if (zB || objQ4 == c2565a) {
                objQ4 = new j(aVar2, 0);
                o0VarE.K(objQ4);
            }
            c.w.a(0, 1, (e23.a) objQ4, o0VarE, false);
            f fVar = ((w) p1VarC.getF182175a()).f182448d;
            boolean zB2 = o0VarE.B(p1VarC) | o0VarE.r(h0Var);
            Object objQ5 = o0VarE.q();
            if (zB2 || objQ5 == c2565a) {
                objQ5 = new n(p1VarC, feVar, h0Var, null);
                o0VarE.K(objQ5);
            }
            p3.l0.e((e23.p) objQ5, fVar, o0VarE);
            z02.d.a(((w) p1VarC.getF182175a()).f182446b, z3.f.c(-1678591698, new sg2.g(aVar2, (Object) h0Var, obj, p1Var, (Object) p1VarC, 25), o0VarE), z3.f.c(-2112555379, new k(feVar, c3Var, 0), o0VarE), null, null, z3.f.c(880520874, new sg2.g(h0Var, p1Var, p1VarC, obj, wVar, 26), o0VarE), o0VarE, 197040, 24);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new vx1.b(h0Var, wVar, aVar, i14, 11);
        }
    }

    public static final void b(z51.h hVar, h4.r rVar, e23.l lVar, e23.l lVar2, e23.l lVar3, p3.m mVar, int i14) {
        p3.o0 o0Var;
        String strT;
        String strP;
        p3.o0 o0VarE = mVar.E(916355080);
        int i15 = i14 | ((i14 & 8) == 0 ? o0VarE.B(hVar) : o0VarE.r(hVar) ? 4 : 2) | (o0VarE.B(rVar) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128) | (o0VarE.r(lVar2) ? 2048 : 1024) | (o0VarE.r(lVar3) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p3.l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ);
            }
            o53.b0 b0Var = (o53.b0) objQ;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            l22.a aVar = new l22.a(context);
            w00.b bVar = new w00.b(aVar);
            String strE = w2.a0.e(hVar);
            Double d14 = hVar.f202510f;
            am.x0 x0VarM = strE != null ? am.z0.m(strE) : null;
            if (x0VarM == null) {
                o0VarE.C(322631877);
                o0VarE.g0(false);
                strT = null;
            } else {
                o0VarE.C(322631878);
                strT = gl1.d.T(x0VarM.f4360c, o0VarE, 0);
                o0VarE.g0(false);
            }
            if (strT == null) {
                o0VarE.C(322729527);
                o0VarE.g0(false);
                strP = null;
            } else {
                o0VarE.C(322729528);
                strP = gl1.y.P(R.string.lbl_maybe_with_category, new Object[]{strT}, o0VarE);
                o0VarE.g0(false);
            }
            if (strP == null) {
                strP = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 148962173, R.string.activity_type_timed_activity, o0VarE, false);
            } else {
                o0VarE.C(148957430);
                o0VarE.g0(false);
            }
            double dA = c1.a(hVar);
            String strB = gm.b.b(context, dA);
            String strB2 = ss.k.b(ls.e.TIME, aVar, Double.valueOf(dA), 32);
            String strF = bVar.f(d14, true);
            String strC = bVar.c(Double.valueOf(d14 != null ? d14.doubleValue() : 0.0d));
            String strC2 = u00.b.c(new ns.h(aVar, null, 2, null), hVar.f202511g, 80, 4);
            b63.u uVar = hVar.f202512h;
            String strQ = uVar != null ? zf.b.q(context, g22.l.j(uVar)) : null;
            if (strQ == null) {
                strQ = "";
            }
            String str = strQ;
            bv.b.f21239a.getClass();
            bv.b.a();
            boolean zL0 = k1.f37122a.l0();
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarB = l4.k.b(rVar, k2.i.a(j92.b.f97900c.f97911c));
            h4.d.f81522a.getClass();
            f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            String str2 = strP;
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarB, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.u uVar2 = c2.u.f22885a;
            Set setB = p13.a1.b(new c92.b.a(c92.a.DELETE, gl1.y.Q(o0VarE, R.string.lbl_delete)));
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new w11.b(11);
                o0VarE.K(objQ2);
            }
            o0Var = o0VarE;
            l2.a(setB, b0Var, false, null, (e23.a) objQ2, z3.f.c(-341984443, new ck0.i(x0VarM, zL0, strB, str, str2, strF, strC2, strB2, strC, lVar3, hVar, lVar), o0VarE), z3.f.c(1739023174, new vv0.e(9, lVar2, hVar), o0VarE), o0Var, 1794048, 12);
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ka0.e((Object) hVar, (Object) rVar, (Object) lVar, (Object) lVar2, (Object) lVar3, i14, 28);
        }
    }

    public static final void c(b63.o oVar, p3.m mVar, int i14) {
        p3.o0 o0Var;
        int i15;
        String string;
        p3.o0 o0VarE = mVar.E(-712422227);
        int i16 = (o0VarE.r(oVar) ? 4 : 2) | i14;
        if (o0VarE.n(i16 & 1, (i16 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            b63.o.Companion companion = b63.o.INSTANCE;
            if (p005kotlin.jvm.internal.s.g(oVar, g22.l.d(companion))) {
                string = context.getString(R.string.mct_lbl_today);
            } else {
                b63.o oVarD = g22.l.d(companion);
                b63.i.INSTANCE.getClass();
                if (p005kotlin.jvm.internal.s.g(oVar, b63.q.c(oVarD, 1, b63.i.f16190d))) {
                    string = context.getString(R.string.social_elapsed_time_yesterday);
                } else {
                    oVar.getClass();
                    string = DateTimeFormatter.ofPattern("EEEE, MMM d").format(oVar.f16206a);
                    string.getClass();
                }
            }
            string.getClass();
            String upperCase = string.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            s5.x0 x0VarF = d92.c.f(j92.f.f97933j, o0VarE);
            h4.r.a aVar = h4.r.S;
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97918c;
            bVar.getClass();
            float f15 = eVar.f97918c;
            bVar.getClass();
            o0Var = o0VarE;
            i15 = 2;
            mh.c(upperCase, c2.l.C(aVar, f14, eVar.f97921f, f15, 0.0f, 8), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0Var, 0, 0, 131068);
        } else {
            o0Var = o0VarE;
            i15 = 2;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new qn0.b(oVar, i14, i15);
        }
    }

    public static final void d(int i14, e23.a aVar, h4.r rVar, p3.m mVar, z3.e eVar, boolean z14) {
        p3.o0 o0VarE = mVar.E(549788081);
        int i15 = 16;
        int i16 = (o0VarE.h(z14) ? 4 : 2) | i14 | (o0VarE.B(rVar) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128);
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            m3.s sVarE = m3.l.e(o0VarE);
            m3.l.b(z14, aVar, rVar, sVarE, null, z3.f.c(-1497481142, new p003ji0.e(z14, sVarE, i15), o0VarE), z3.f.c(791995275, new aa2.k(eVar, 14), o0VarE), o0VarE, (i16 & 14) | 1769472 | ((i16 >> 3) & 112) | ((i16 << 3) & 896), 16);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new li0.y(z14, rVar, aVar, eVar, i14, 24);
        }
    }
}

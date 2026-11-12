package c42;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c22.g2;
import c22.x0;
import com.garmin.android.apps.connectmobile.R;
import i3.mh;
import java.util.List;
import l72.c1;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class h {
    public static final void a(String str, String str2, p3.m mVar, int i14) {
        String str3;
        o0 o0Var;
        o0 o0VarE = mVar.E(1564172463);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.B(str2) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarC = c2.l.C(aVar, 0.0f, 0.0f, 0.0f, eVar.f97920e, 7);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarC, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
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
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97931h), o0VarE), o0VarE, i15 & 14, 0, 131070);
            bVar.getClass();
            h4.r rVarC3 = c2.l.C(aVar, 0.0f, eVar.f97920e, 0.0f, 0.0f, 13);
            fVar.getClass();
            str3 = str2;
            mh.c(str3, rVarC3, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97932i, o0VarE), o0VarE, (i15 >> 3) & 14, 0, 131068);
            o0Var = o0VarE;
            o0Var.g0(true);
        } else {
            str3 = str2;
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b82.o(str, str3, i14, 2);
        }
    }

    public static final void b(String str, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(790422962);
        int i15 = (o0VarE.B(str) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
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
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            x0.f23314a.getClass();
            List listK = p13.x.k(g2.b(x0.f23709xb), g2.b(x0.f23726yb), g2.b(x0.f23743zb));
            o0VarE.C(596972403);
            int i16 = 0;
            for (Object obj : listK) {
                int i17 = i16 + 1;
                if (i16 < 0) {
                    p13.x.q();
                    throw null;
                }
                a(gl1.y.P(R.string.step_x, new Object[]{Integer.valueOf(i17)}, o0VarE), gl1.d.V(((g2) obj).f23059a, new Object[]{str}), o0VarE, 0);
                i16 = i17;
            }
            o0VarE.g0(false);
            o0VarE.g0(true);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new as.p(str, i14, 7);
        }
    }

    public static final void c(e23.a<Unit> aVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-1467748183);
        int i15 = i14 | (o0VarE.r(aVar) ? 4 : 2) | (o0VarE.r(aVar2) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            c1.f110940a.a(false, gl1.y.Q(o0VarE, R.string.lbl_location_permissions_needed), gl1.y.Q(o0VarE, R.string.msg_location_permissions_needed_to_use_feature), null, null, gl1.y.Q(o0VarE, R.string.lbl_settings), false, false, aVar, gl1.y.Q(o0VarE, R.string.lbl_cancel), aVar2, o0VarE, ((i15 << 24) & 234881024) | 6, (i15 >> 3) & 14, 216);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new at1.f(aVar, aVar2, i14, 5);
        }
    }

    public static final void d(e23.a<Unit> aVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-958025256);
        int i15 = i14 | (o0VarE.r(aVar) ? 4 : 2) | (o0VarE.r(aVar2) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            c1.f110940a.a(false, gl1.y.Q(o0VarE, R.string.notification_title_location_services_disabled), gl1.y.Q(o0VarE, R.string.msg_location_services_needed_to_use_feature), null, null, gl1.y.Q(o0VarE, R.string.lbl_settings), false, false, aVar, gl1.y.Q(o0VarE, R.string.lbl_cancel), aVar2, o0VarE, ((i15 << 24) & 234881024) | 6, (i15 >> 3) & 14, 216);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new at1.f(aVar, aVar2, i14, 6);
        }
    }

    public static final void e(long j8, String str, gl1.b bVar, e23.a aVar, ug2.x xVar, p3.m mVar, int i14) {
        o0 o0Var;
        String strJ;
        p1 p1Var;
        p1 p1Var2;
        aVar.getClass();
        o0 o0VarE = mVar.E(-1448817059);
        int i15 = i14 | (o0VarE.l(j8) ? 4 : 2) | (o0VarE.B(str) ? 32 : 16) | (o0VarE.r(bVar) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024) | (o0VarE.r(xVar) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            String strK = ((zy0.l) KoinJavaComponent.get$default(zy0.l.class, null, null, 6, null)).k(ez0.c.GC_WEB_URL);
            if (str == null) {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -743777248, R.string.lbl_device, o0VarE, false);
            } else {
                o0VarE.C(-743777682);
                o0VarE.g0(false);
                strJ = str;
            }
            Object[] objArr = new Object[0];
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new bv0.b(20);
                o0VarE.K(objQ);
            }
            p1 p1Var3 = (p1) d4.a.e(objArr, (e23.a) objQ, o0VarE, 48);
            Object[] objArr2 = new Object[0];
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new bv0.b(21);
                o0VarE.K(objQ2);
            }
            p1 p1Var4 = (p1) d4.a.e(objArr2, (e23.a) objQ2, o0VarE, 48);
            boolean zR = ((i15 & 896) == 256) | o0VarE.r(context) | o0VarE.B(p1Var4) | ((i15 & 14) == 4) | o0VarE.B(p1Var3);
            Object objQ3 = o0VarE.q();
            if (zR || objQ3 == c2565a) {
                p1Var = p1Var4;
                p1Var2 = p1Var3;
                c cVar = new c(context, bVar, j8, p1Var, p1Var2);
                o0VarE.K(cVar);
                objQ3 = cVar;
            } else {
                p1Var2 = p1Var3;
                p1Var = p1Var4;
            }
            e23.a aVar2 = (e23.a) objQ3;
            g.h hVar = new g.h();
            boolean zB = o0VarE.B(aVar2);
            Object objQ4 = o0VarE.q();
            if (zB || objQ4 == c2565a) {
                objQ4 = new a03.h0(aVar2, 10);
                o0VarE.K(objQ4);
            }
            String str2 = strJ;
            o0Var = o0VarE;
            z02.d.a(false, z3.f.c(-401997790, new a51.g(aVar, 25), o0VarE), null, null, null, z3.f.c(-405666522, new d(strK, aVar2, p1Var2, context, c.w.c(hVar, (e23.l) objQ4, o0VarE, 0), aVar, p1Var, str2, xVar), o0VarE), o0Var, 196656, 29);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e(j8, str, bVar, aVar, xVar, i14, 0);
        }
    }
}

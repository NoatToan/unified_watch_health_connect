package na0;

import am.c1;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.u1;
import b82.k0;
import c.w;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import ew1.v1;
import gl1.y;
import java.util.ArrayList;
import java.util.List;
import kotlin.t1;
import m4.b0;
import mt0.s1;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p006l2.z1;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import r53.a2;
import s5.w0;
import s5.x0;
import u62.t;
import x5.f0;
import x5.v;

/* JADX INFO: loaded from: classes8.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f125123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f125124b;

    static {
        g6.f.a aVar = g6.f.f75994b;
        f125123a = 50;
        f125124b = 230;
    }

    public static final void a(i iVar, boolean z14, List<b0> list, e23.p<? super Integer, ? super String, Unit> pVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        boolean z15;
        e23.a<Unit> aVar3;
        o0 o0Var;
        o0 o0VarE = mVar.E(-438819745);
        int i15 = (o0VarE.r(iVar) ? 4 : 2) | i14;
        if ((i14 & 48) == 0) {
            z15 = z14;
            i15 |= o0VarE.h(z15) ? 32 : 16;
        } else {
            z15 = z14;
        }
        int i16 = i15 | (o0VarE.r(list) ? 256 : 128);
        if ((i14 & 3072) == 0) {
            i16 |= o0VarE.r(pVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i16 |= o0VarE.r(aVar) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            aVar3 = aVar2;
            i16 |= o0VarE.r(aVar3) ? 131072 : 65536;
        } else {
            aVar3 = aVar2;
        }
        if (o0VarE.n(i16 & 1, (74899 & i16) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            String strQ = y.Q(o0VarE, R.string.lbl_startup_wheel_circumference_question);
            String strQ2 = y.Q(o0VarE, R.string.msg_circumference_estimation_info);
            s62.a.f157643a.getClass();
            o0Var = o0VarE;
            da0.p.b("bike_wheel_circumference_estimation_screen", strQ, t.a(t62.a.f162797a), strQ2, null, y.Q(o0VarE, R.string.lbl_next), aVar, iVar.f125128d, null, null, false, null, null, false, z15, aVar3, null, null, null, null, null, z3.f.c(-275494561, new gw1.e(iVar, 28, pVar, list), o0VarE), o0Var, ((i16 << 6) & 3670016) | 6, ((i16 << 9) & 57344) | (i16 & 458752), 384, 4144912);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a82.b(iVar, z14, list, pVar, aVar, aVar2, i14);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(q qVar, j jVar, e23.l lVar, e23.a aVar, e23.a aVar2, e23.p pVar, p3.m mVar, int i14) {
        j jVar2;
        int i15;
        qVar.getClass();
        lVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        pVar.getClass();
        o0 o0VarE = mVar.E(-1329643127);
        int i16 = i14 | (o0VarE.r(qVar) ? 4 : 2) | 16 | (o0VarE.r(lVar) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024) | (o0VarE.r(aVar2) ? 16384 : 8192) | (o0VarE.r(pVar) ? 131072 : 65536);
        if (o0VarE.n(i16 & 1, (74899 & i16) != 74898)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                o0VarE.L(-1614864554);
                v9.a.f176280a.getClass();
                ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(o0VarE);
                if (viewModelStoreOwnerA == null) {
                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(s0.f105811a.b(j.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(o0VarE, 0), null);
                o0VarE.g0(false);
                jVar2 = (j) u1VarResolveViewModel;
                i15 = i16 & (-113);
            } else {
                o0VarE.e();
                i15 = i16 & (-113);
                jVar2 = jVar;
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            p1 p1VarC = s9.c.c(jVar2.f125132b, o0VarE);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            Object obj = objQ;
            if (objQ == p3.m.a.f135155b) {
                ArrayList arrayList = new ArrayList(5);
                int i17 = 0;
                for (int i18 = 5; i17 < i18; i18 = 5) {
                    arrayList.add(new b0());
                    i17++;
                }
                o0VarE.K(arrayList);
                obj = arrayList;
            }
            List list = (List) obj;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            int i19 = 458752 & i15;
            boolean zB = (i19 == 131072) | o0VarE.B(p1VarC);
            Object objQ2 = o0VarE.q();
            if (zB || objQ2 == p3.m.a.f135155b) {
                objQ2 = new s1(10, pVar, p1VarC);
                o0VarE.K(objQ2);
            }
            w.a(0, 1, (e23.a) objQ2, o0VarE, false);
            List<String> list2 = qVar.f125172d;
            boolean zR = o0VarE.r(jVar2) | o0VarE.r(qVar);
            Object objQ3 = o0VarE.q();
            if (zR || objQ3 == p3.m.a.f135155b) {
                objQ3 = new b(jVar2, qVar, null);
                o0VarE.K(objQ3);
            }
            l0.e((e23.p) objQ3, list2, o0VarE);
            a2 a2Var = jVar2.f125134d;
            boolean zR2 = o0VarE.r(jVar2) | o0VarE.r(list);
            Object objQ4 = o0VarE.q();
            if (zR2 || objQ4 == p3.m.a.f135155b) {
                objQ4 = new c(jVar2, list, null);
                o0VarE.K(objQ4);
            }
            l0.e((e23.p) objQ4, a2Var, o0VarE);
            Boolean boolValueOf = Boolean.valueOf(qVar.f125170b);
            boolean zR3 = o0VarE.r(qVar) | ((57344 & i15) == 16384);
            Object objQ5 = o0VarE.q();
            if (zR3 || objQ5 == p3.m.a.f135155b) {
                objQ5 = new d(qVar, aVar2, null);
                o0VarE.K(objQ5);
            }
            l0.e((e23.p) objQ5, boolValueOf, o0VarE);
            Integer num = qVar.f125171c;
            boolean zR4 = o0VarE.r(qVar) | o0VarE.r(context) | ((i15 & 7168) == 2048);
            Object objQ6 = o0VarE.q();
            if (zR4 || objQ6 == p3.m.a.f135155b) {
                objQ6 = new e(qVar, context, aVar, null);
                o0VarE.K(objQ6);
            }
            l0.e((e23.p) objQ6, num, o0VarE);
            i iVar = (i) p1VarC.getF182175a();
            boolean z14 = qVar.f125169a;
            boolean zR5 = o0VarE.r(jVar2);
            Object objQ7 = o0VarE.q();
            if (zR5 || objQ7 == p3.m.a.f135155b) {
                objQ7 = new f(jVar2);
                o0VarE.K(objQ7);
            }
            e23.p pVar2 = (e23.p) ((k23.g) objQ7);
            boolean zB2 = ((i15 & 896) == 256) | o0VarE.B(p1VarC);
            Object objQ8 = o0VarE.q();
            if (zB2 || objQ8 == p3.m.a.f135155b) {
                objQ8 = new v1(lVar, p1VarC, 15);
                o0VarE.K(objQ8);
            }
            e23.a aVar3 = (e23.a) objQ8;
            boolean zB3 = o0VarE.B(p1VarC) | (i19 == 131072);
            Object objQ9 = o0VarE.q();
            if (zB3 || objQ9 == p3.m.a.f135155b) {
                objQ9 = new hl1.s(pVar, p1VarC, 1);
                o0VarE.K(objQ9);
            }
            a(iVar, z14, list, pVar2, aVar3, (e23.a) objQ9, o0VarE, 0);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
            jVar2 = jVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new hl1.j((Object) qVar, (u1) jVar2, lVar, aVar, aVar2, (o13.h) pVar, i14, 24);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(String str, e23.l lVar, b0 b0Var, h4.r rVar, p3.m mVar, int i14) {
        o0 o0Var;
        m4.q qVar;
        long jB;
        o0 o0VarE = mVar.E(-1467691642);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.r(lVar) ? 32 : 16) | (o0VarE.B(b0Var) ? 256 : 128) | (o0VarE.B(rVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            m4.q qVar2 = (m4.q) o0VarE.A(t1.f91491i);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                int length = str.length();
                qVar = qVar2;
                objQ2 = p0.n(new x5.l0(str, og.a.l(length, length), (w0) null, 4, (p005kotlin.jvm.internal.j) null));
                o0VarE.K(objQ2);
            } else {
                qVar = qVar2;
            }
            p1 p1Var2 = (p1) objQ2;
            boolean z14 = (i15 & 14) == 4;
            Object objQ3 = o0VarE.q();
            if (z14 || objQ3 == c2565a) {
                objQ3 = new g(str, p1Var2, null);
                o0VarE.K(objQ3);
            }
            l0.e((e23.p) objQ3, str, o0VarE);
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                o0VarE.C(-1702372850);
                d92.b.f58623a.getClass();
                jB = d92.b.a(o0VarE).j().e();
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1702371666);
                jB = com.nimbusds.jose.shaded.gson.internal.a.b(d92.b.f58623a, o0VarE, false);
            }
            x5.l0 l0Var = (x5.l0) p1Var2.getF182175a();
            boolean zR = o0VarE.r(qVar);
            Object objQ4 = o0VarE.q();
            if (zR || objQ4 == c2565a) {
                objQ4 = new k0(qVar, 9);
                o0VarE.K(objQ4);
            }
            z1 z1Var = new z1((e23.l) objQ4, null, null, null, null, null, 62, null);
            h4.r rVarA = m4.e.a(c2.l.g(x2.u(rVar, f125123a), 0.6666667f), b0Var);
            Object objQ5 = o0VarE.q();
            if (objQ5 == c2565a) {
                objQ5 = new c1(p1Var, p1Var2, 20);
                o0VarE.K(objQ5);
            }
            h4.r rVarB = m4.e.b(rVarA, (e23.l) objQ5);
            long jA = am.j.A(d92.b.f58623a, o0VarE);
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.d dVar = j92.b.f97900c;
            h4.r rVarE = u1.n.e(rVarB, jA, k2.i.a(dVar.f97911c));
            g6.f.a aVar = g6.f.f75994b;
            bVar.getClass();
            h4.r rVarB2 = u1.q.b(1, jB, rVarE, k2.i.a(dVar.f97911c));
            v.f188954b.getClass();
            p006l2.a2 a2Var = new p006l2.a2(0, (Boolean) null, v.f188957e, 0, (f0) null, (Boolean) null, (z5.c) null, 123, (p005kotlin.jvm.internal.j) null);
            o4.t1 t1Var = new o4.t1(com.nimbusds.jose.shaded.gson.internal.a.d(o0VarE), null);
            d92.b.f58624b.getClass();
            x0 x0VarB = d92.c.b(j92.f.f97927d, o0VarE);
            w5.f0.f182097b.getClass();
            w5.f0 f0Var = w5.f0.f182102g;
            d6.h.f57752b.getClass();
            x0 x0VarA = x0.a(x0VarB, 0L, 0L, f0Var, null, 0L, null, null, d6.h.f57755e, 0L, null, null, 16744443);
            boolean z15 = (i15 & 112) == 32;
            Object objQ6 = o0VarE.q();
            if (z15 || objQ6 == c2565a) {
                objQ6 = new a11.b0(lVar, p1Var2, 27);
                o0VarE.K(objQ6);
            }
            s.f125195a.getClass();
            o0Var = o0VarE;
            p006l2.r.c(l0Var, (e23.l) objQ6, rVarB2, false, false, x0VarA, a2Var, z1Var, true, 0, 0, null, null, null, t1Var, s.f125196b, o0Var, 102236160, 196608, 15896);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a(str, lVar, b0Var, rVar, i14, 0);
        }
    }
}

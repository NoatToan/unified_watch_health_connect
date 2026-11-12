package si1;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import h5.e0;
import i3.i7;
import i3.mh;
import o4.d0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import rk0.a1;
import s5.x0;
import s70.j1;
import u1.y0;

/* JADX INFO: loaded from: classes10.dex */
public final class h {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.settings.lte.cwsactivation.composables.InReachFlowSetupEndScreenKt$InReachFlowSetupEndScreen$2$1$1", f = "InReachFlowSetupEndScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ti1.b f159378a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ti1.b bVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f159378a = bVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f159378a, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            ti1.b bVar = this.f159378a;
            if (!bVar.f164584b) {
                ht.a aVar2 = ht.a.f85464a;
                Bundle bundleA = h7.c.a(new o13.p("Screen", "InReachOpenMessengerApp"), new o13.p("Type", "CWS"), new o13.p("IsFreeTrial", Boolean.valueOf(bVar.f164588f)), new o13.p("FromPlanSetupFlow", Boolean.valueOf(bVar.f164586d)));
                aVar2.getClass();
                ht.a.a(bundleA, "PageView");
            }
            return Unit.INSTANCE;
        }
    }

    public static final void a(boolean z14, e23.a<Unit> aVar, e23.q<? super c2.t, ? super p3.m, ? super Integer, Unit> qVar, p3.m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(-1672601881);
        int i16 = 4;
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.h(z14) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(aVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            b.f159364a.getClass();
            z02.d.a(z14, b.f159365b, null, null, null, z3.f.c(-1484847042, new r11.l(z14, aVar, qVar, i16), o0VarE), o0VarE, (i15 & 14) | 196656, 28);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new at.b(z14, aVar, qVar, i14, 21);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005b  */
    public static final void b(ti1.b bVar, e23.a<Unit> aVar, p3.m mVar, int i14) {
        bVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(-651753580);
        int i15 = (o0VarE.B(bVar) ? 4 : 2) | i14 | (o0VarE.r(aVar) ? 32 : 16);
        int i16 = 1;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            int i17 = i15 & 112;
            c.w.a(i17, 1, aVar, o0VarE, false);
            boolean z14 = bVar.f164584b;
            boolean z15 = ((i15 & 14) == 4) | (i17 == 32);
            Object objQ = o0VarE.q();
            if (z15) {
                objQ = new j1(7, bVar, aVar);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new j1(7, bVar, aVar);
                    o0VarE.K(objQ);
                }
            }
            a(z14, (e23.a) objQ, z3.f.c(1323509742, new g(bVar, i16), o0VarE), o0VarE, 384);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ri1.e(bVar, aVar, i14, 1);
        }
    }

    public static final void c(h4.r rVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-932065827);
        int i15 = i14 | (o0VarE.k(R.string.msg_get_inreach_direct_activation) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVar, o0VarE);
            h5.g.V.getClass();
            e0.a aVar = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
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
            t4.d dVarA = n5.c.a(R.drawable.messenger_app_icon, o0VarE, 0);
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_garmin_messenger_app_name);
            d0.f128823b.getClass();
            long j8 = d0.f128832k;
            h4.r.a aVar2 = h4.r.S;
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarA = c2.l.A(aVar2, 0.0f, eVar.f97921f, 1);
            bVar2.getClass();
            h4.r rVarB = l4.k.b(rVarA, k2.i.a(eVar.f97919d));
            h4.g.a aVar3 = h4.d.a.f81537o;
            h4.r rVarB2 = b0Var.b(rVarB, aVar3);
            bVar2.getClass();
            i7.a(dVarA, strQ, x2.q(rVarB2, j92.b.f97901d.f97907f), j8, o0VarE, 3072, 0);
            String strQ2 = gl1.y.Q(o0VarE, R.string.lbl_garmin_messenger_app_name);
            h4.r rVarB3 = b0Var.b(aVar2, aVar3);
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            x0 x0VarE = d92.c.e(d92.c.b(j92.f.f97930g, o0VarE));
            d6.h.f57752b.getClass();
            int i16 = d6.h.f57755e;
            mh.c(strQ2, rVarB3, 0L, null, 0L, null, 0L, d6.h.a(i16), 0L, 0, false, 0, 0, null, x0VarE, o0VarE, 0, 0, 130044);
            bVar2.getClass();
            h4.r rVarB4 = b0Var.b(c2.l.A(aVar2, eVar.f97921f, 0.0f, 2), aVar3);
            String strQ3 = gl1.y.Q(o0VarE, R.string.lbl_messenger_connections_description);
            fVar.getClass();
            mh.c(strQ3, rVarB4, 0L, null, 0L, null, 0L, d6.h.a(i16), 0L, 0, false, 0, 0, null, d92.c.e(d92.c.b(j92.f.f97931h, o0VarE)), o0VarE, 0, 0, 130044);
            String strQ4 = gl1.y.Q(o0VarE, R.string.msg_get_inreach_direct_activation);
            bVar2.getClass();
            h4.r rVarB5 = b0Var.b(c2.l.C(aVar2, 0.0f, eVar.f97921f, 0.0f, 0.0f, 13), aVar3);
            d6.h hVarA = d6.h.a(i16);
            fVar.getClass();
            mh.c(strQ4, rVarB5, 0L, null, 0L, null, 0L, hVarA, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, o0VarE), o0VarE, 0, 0, 130044);
            o0VarE = o0VarE;
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b82.y(rVar, i14, 19);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0062  */
    public static final void d(ti1.b bVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-1985954795);
        int i15 = (o0VarE.B(bVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h4.r rVarD = x2.d(h4.r.S, 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarY = c2.l.y(rVarD, eVar.f97921f);
            c2.j jVar = c2.j.f22691a;
            bVar2.getClass();
            float f14 = eVar.f97920e;
            jVar.getClass();
            c2.j.i iVarI = c2.j.i(f14);
            boolean z14 = (i15 & 14) == 4;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new s70.b0(bVar, 9);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new s70.b0(bVar, 9);
                    o0VarE.K(objQ);
                }
            }
            e2.c.b(rVarY, null, null, iVarI, null, null, false, null, (e23.l) objQ, o0VarE, 0, 494);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new s5.a(bVar, i14, 13);
        }
    }

    public static final void e(h4.r rVar, ti1.b bVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(1643676429);
        int i15 = (o0VarE.B(bVar) ? 32 : 16) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            u uVar = new u();
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new se0.a(6);
                o0VarE.K(objQ);
            }
            c.q qVarC = c.w.c(uVar, (e23.l) objQ, o0VarE, 48);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVar, o0VarE);
            h5.g.V.getClass();
            e0.a aVar = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
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
            t4.d dVarA = n5.c.a(2131231126, o0VarE, 0);
            h4.r.a aVar2 = h4.r.S;
            d92.b.f58623a.getClass();
            j92.b bVar3 = d92.b.f58625c;
            bVar3.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97923h;
            bVar3.getClass();
            h4.r rVarB = b0Var.b(c2.l.C(aVar2, 0.0f, f14, 0.0f, eVar.f97920e, 5), h4.d.a.f81537o);
            boolean zR = o0VarE.r(context) | ((i15 & 112) == 32) | o0VarE.r(qVarC);
            Object objQ2 = o0VarE.q();
            if (zR || objQ2 == c2565a) {
                objQ2 = new sg0.j(bVar, 4, context, qVarC);
                o0VarE.K(objQ2);
            }
            y0.a(dVarA, null, u1.w.d(rVarB, false, null, null, (e23.a) objQ2, 15), null, null, 0.0f, null, o0VarE, 48, 120);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a1(rVar, bVar, i14, 19);
        }
    }
}

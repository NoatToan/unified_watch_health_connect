package oa0;

import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import da0.u;
import e23.l;
import e23.p;
import gl1.y;
import h4.k;
import h5.e0;
import i3.i7;
import l72.v2;
import o13.r;
import o53.b0;
import o72.i1;
import o72.i3;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
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
import v62.m2;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.customization.displayprefernces.ButtonDirectionScreenKt$ButtonDirectionScreen$1$1", f = "ButtonDirectionScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l<j90.c, Unit> f131042a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p1<j90.c> f131043b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(l<? super j90.c, Unit> lVar, p1<j90.c> p1Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f131042a = lVar;
            this.f131043b = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f131042a, this.f131043b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            this.f131042a.invoke(this.f131043b.getF182175a());
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(h90.b bVar, j90.c cVar, e23.a<Unit> aVar, l<? super j90.c, Unit> lVar, l<? super Float, Unit> lVar2, e23.a<Unit> aVar2, m mVar, int i14) {
        o0 o0Var;
        o0 o0VarE = mVar.E(929223500);
        int i15 = i14 | (o0VarE.B(bVar) ? 4 : 2) | (o0VarE.k(cVar.ordinal()) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024) | (o0VarE.r(lVar2) ? 16384 : 8192) | (o0VarE.r(aVar2) ? 131072 : 65536);
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = n.f135158a;
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(cVar);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new i3(p1Var, 2);
                o0VarE.K(objQ2);
            }
            l lVar3 = (l) objQ2;
            j90.c cVar2 = (j90.c) p1Var.getF182175a();
            boolean z14 = (i15 & 7168) == 2048;
            Object objQ3 = o0VarE.q();
            if (z14 || objQ3 == c2565a) {
                objQ3 = new a(lVar, p1Var, null);
                o0VarE.K(objQ3);
            }
            l0.e((p) objQ3, cVar2, o0VarE);
            String strQ = y.Q(o0VarE, R.string.startup_customize_button_direction);
            s62.a.f157643a.getClass();
            o0Var = o0VarE;
            da0.p.b("device_customization_button_direction_screen", strQ, m2.a(t62.b.f162798a), null, null, y.Q(o0VarE, R.string.lbl_next), aVar, false, null, null, false, null, null, false, false, aVar2, null, null, null, null, null, z3.f.c(1391654988, new mw0.h(lVar2, bVar, lVar3, p1Var, 3), o0VarE), o0Var, ((i15 << 12) & 3670016) | 6, i15 & 458752, 384, 4161432);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new oa0.a(bVar, cVar, aVar, lVar, lVar2, aVar2, i14, 1);
        }
    }

    public static final void b(h90.b bVar, j90.c cVar, e23.a<Unit> aVar, l<? super j90.c, Unit> lVar, l<? super Float, Unit> lVar2, e23.a<Unit> aVar2, m mVar, int i14) {
        bVar.getClass();
        cVar.getClass();
        aVar.getClass();
        lVar.getClass();
        lVar2.getClass();
        aVar2.getClass();
        o0 o0VarE = mVar.E(1124751551);
        int i15 = i14 | (o0VarE.B(bVar) ? 4 : 2) | (o0VarE.k(cVar.ordinal()) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024) | (o0VarE.r(lVar2) ? 16384 : 8192) | (o0VarE.r(aVar2) ? 131072 : 65536);
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = n.f135158a;
            a(bVar, cVar, aVar, lVar, lVar2, aVar2, o0VarE, i15 & 524286);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new oa0.a(bVar, cVar, aVar, lVar, lVar2, aVar2, i14, 0);
        }
    }

    public static final void c(h4.r rVar, int i14, int i15, boolean z14, e23.a<Unit> aVar, m mVar, int i16) {
        o0 o0VarE = mVar.E(-245879729);
        int i17 = i16 | (o0VarE.B(rVar) ? 4 : 2) | (o0VarE.k(i14) ? 32 : 16) | (o0VarE.h(z14) ? 2048 : 1024);
        if (o0VarE.n(i17 & 1, (i17 & 9363) != 9362)) {
            x1 x1Var = n.f135158a;
            c2.j.f22691a.getClass();
            c2.j.h hVar = c2.j.f22697g;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(hVar, h4.d.a.f81536n, o0VarE, 6);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = k.c(rVar, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
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
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            t4.d dVarA = n5.c.a(i14, o0VarE, (i17 >> 3) & 14);
            String strQ = y.Q(o0VarE, i15);
            h4.r rVarA = v2.a(x2.f(h4.r.S, 1.0f), !z14, new i1(4), o0VarE, 6);
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            i7.a(dVarA, strQ, c2.l.A(rVarA, 0.0f, eVar.f97923h, 1), am.j.d(o0VarE), o0VarE, 0, 0);
            String strQ2 = y.Q(o0VarE, i15);
            bVar2.getClass();
            u.a(null, z14, strQ2, null, k2.i.a(eVar.f97918c), aVar, o0VarE, ((i17 >> 6) & 112) | 196608, 9);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cn1.a(rVar, i14, i15, z14, aVar, i16);
        }
    }
}

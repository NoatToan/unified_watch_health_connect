package lm0;

import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import ew1.u1;
import h5.e0;
import i3.mh;
import o13.r;
import o4.m1;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.c2;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import s5.w0;
import x5.l0;

/* JADX INFO: loaded from: classes8.dex */
public final class n {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.group.create.page.GroupNamePageScreenKt$GroupNamePageScreen$1$1", f = "GroupNamePageScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f113580a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m4.b0 f113581b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z14, m4.b0 b0Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f113580a = z14;
            this.f113581b = b0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f113580a, this.f113581b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            if (this.f113580a) {
                m4.b0.a(this.f113581b);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0094  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(String str, boolean z14, e23.a<Unit> aVar, e23.l<? super String, Unit> lVar, p3.m mVar, int i14) {
        o0 o0Var;
        p3.m.a.C2565a c2565a;
        int i15;
        boolean z15;
        boolean z16;
        str.getClass();
        aVar.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(512420948);
        int i16 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.r(lVar) ? 2048 : 1024);
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
            if (objQ == c2565a2) {
                i15 = 0;
                c2 c2VarN = p0.n(new l0(str, 0L, (w0) null, 6, (p005kotlin.jvm.internal.j) null));
                o0VarE.K(c2VarN);
                c2565a = c2565a2;
                objQ = c2VarN;
            } else {
                c2565a = c2565a2;
                i15 = 0;
            }
            p1 p1Var = (p1) objQ;
            if (str.length() > 0) {
                jm0.e.f99565a.getClass();
                if (g22.n.c(str) < 2) {
                    z15 = 1;
                } else {
                    z15 = i15;
                }
            } else {
                z15 = i15;
            }
            jm0.e.f99565a.getClass();
            boolean z17 = str.length() > 128 ? 1 : i15;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = kg.f.j(o0VarE);
            }
            m4.b0 b0Var = (m4.b0) objQ2;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ3);
            }
            p1 p1Var2 = (p1) objQ3;
            boolean zL = jm0.e.l(((Boolean) p1Var2.getF182175a()).booleanValue(), (z15 == 0 && z17 == 0) ? i15 : 1, o0VarE);
            Unit unit = Unit.INSTANCE;
            int i17 = i16 & 112;
            int i18 = i17 == 32 ? 1 : i15;
            Object objQ4 = o0VarE.q();
            if (i18 != 0 || objQ4 == c2565a) {
                objQ4 = new a(z14, b0Var, null);
                o0VarE.K(objQ4);
            }
            p3.l0.e((e23.p) objQ4, unit, o0VarE);
            h4.r.a aVar2 = h4.r.S;
            h4.r rVarF = x2.f(u1.n.e(aVar2, vb.h.f(d92.b.f58623a, o0VarE), m1.f128891a), 1.0f);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, i15);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarF, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
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
            c2.b0 b0Var2 = c2.b0.f22601a;
            l0 l0Var = (l0) p1Var.getF182175a();
            h4.r rVarA = m4.e.a(aVar2, b0Var);
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_enter_group_name);
            boolean z18 = z15;
            boolean z19 = z17;
            z3.e eVarC = z3.f.c(-1871104357, new u1(lVar, z15, z17, p1Var2, p1Var), o0VarE);
            boolean z24 = i17 == 32;
            Object objQ5 = o0VarE.q();
            if (z24 || objQ5 == c2565a) {
                objQ5 = new m(0, aVar, p1Var2, z14);
                o0VarE.K(objQ5);
            }
            e23.l lVar2 = (e23.l) objQ5;
            boolean z25 = (i16 & 7168) == 2048;
            Object objQ6 = o0VarE.q();
            if (z25 || objQ6 == c2565a) {
                objQ6 = new a11.b0(lVar, p1Var, 22);
                o0VarE.K(objQ6);
            }
            l72.p1.b(l0Var, rVarA, strQ, null, false, false, null, 0L, null, eVarC, null, null, null, lVar2, (e23.l) objQ6, o0VarE, 805330944, 0, 7656);
            o0Var = o0VarE;
            if (zL) {
                o0Var.C(691597748);
                if (z18) {
                    o0Var.C(691615945);
                    String strP = gl1.y.P(R.string.msg_error_group_name_too_short, new Object[]{2}, o0Var);
                    j92.b bVar2 = d92.b.f58625c;
                    bVar2.getClass();
                    j92.e eVar = j92.b.f97899b;
                    float f14 = eVar.f97920e;
                    bVar2.getClass();
                    h4.r rVarZ = c2.l.z(aVar2, f14, eVar.f97917b);
                    long jG = vb.h.g(o0Var);
                    d92.b.f58624b.getClass();
                    mh.c(strP, rVarZ, jG, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, j92.f.f97933j, o0Var, 0, 0, 131064);
                    o0Var.g0(false);
                } else {
                    o0Var.C(691999384);
                    o0Var.g0(false);
                }
                if (z19) {
                    o0Var.C(692041420);
                    String strQ2 = gl1.y.Q(o0Var, R.string.msg_error_group_name_too_long);
                    j92.b bVar3 = d92.b.f58625c;
                    bVar3.getClass();
                    j92.e eVar2 = j92.b.f97899b;
                    float f15 = eVar2.f97920e;
                    bVar3.getClass();
                    h4.r rVarZ2 = c2.l.z(aVar2, f15, eVar2.f97917b);
                    long jG2 = vb.h.g(o0Var);
                    d92.b.f58624b.getClass();
                    mh.c(strQ2, rVarZ2, jG2, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, j92.f.f97933j, o0Var, 0, 0, 131064);
                    z16 = false;
                    o0Var.g0(false);
                } else {
                    z16 = false;
                    o0Var.C(692391224);
                    o0Var.g0(false);
                }
                o0Var.g0(z16);
            } else {
                o0Var.C(692401144);
                o0Var.g0(false);
            }
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new li0.y(str, z14, (Object) aVar, (o13.h) lVar, i14, 1);
        }
    }
}

package a11;

import c2.x2;
import i3.ba;
import i3.na;
import i3.sg;
import o4.m1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p006l2.a2;
import p006l2.z1;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import s5.w0;
import s5.x0;
import x5.l0;
import z2.t2;

/* JADX INFO: loaded from: classes9.dex */
public final class g {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.common.composable.dialog.DecimalTextInputKt$DecimalTextInput$1$1", f = "DecimalTextInput.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m4.b0 f297a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m4.b0 b0Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f297a = b0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f297a, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            m4.b0.a(this.f297a);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final double d14, final int i14, final int i15, final m4.b0 b0Var, final e23.l<? super Double, Unit> lVar, final e23.a<Unit> aVar, p3.m mVar, final int i16) {
        o0 o0Var;
        boolean z14;
        b0Var.getClass();
        lVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(363892292);
        int i17 = i16 | (o0VarE.m(d14) ? 4 : 2) | (o0VarE.k(i14) ? 32 : 16) | (o0VarE.k(i15) ? 256 : 128) | (o0VarE.r(lVar) ? 16384 : 8192) | (o0VarE.r(aVar) ? 131072 : 65536);
        if (o0VarE.n(i17 & 1, (74899 & i17) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                String strValueOf = String.valueOf(d14);
                objQ = p0.n(new l0(strValueOf, og.a.l(0, strValueOf.length()), (w0) null, 4, (p005kotlin.jvm.internal.j) null));
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            Unit unit = Unit.INSTANCE;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new a(b0Var, null);
                o0VarE.K(objQ2);
            }
            p3.l0.e((e23.p) objQ2, unit, o0VarE);
            h4.d.f81522a.getClass();
            h4.g.a aVar2 = h4.d.a.f81537o;
            h4.r.a aVar3 = h4.r.S;
            c2.j.f22691a.getClass();
            c2.z zVarA = c2.y.a(c2.j.f22694d, aVar2, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar3, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar4 = h5.g.a.f81805b;
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
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var2 = c2.b0.f22601a;
            l0 l0Var = (l0) p1Var.getF182175a();
            h4.r rVarA = m4.e.a(x2.x(aVar3, null, 3), b0Var);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarW = x2.w(rVarA, j92.b.f97899b.f97922g, 0.0f, 2);
            x5.v.f188954b.getClass();
            int i18 = x5.v.f188963k;
            x5.p.f188918b.getClass();
            a2 a2Var = new a2(0, (Boolean) null, i18, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
            boolean z15 = (i17 & 458752) == 131072;
            Object objQ3 = o0VarE.q();
            if (z15 || objQ3 == c2565a) {
                z14 = true;
                objQ3 = new a03.h0(aVar, 1);
                o0VarE.K(objQ3);
            } else {
                z14 = true;
            }
            z1 z1Var = new z1((e23.l) objQ3, null, null, null, null, null, 62, null);
            d92.b.f58624b.getClass();
            x0 x0Var = j92.f.f97929f;
            d6.h.f57752b.getClass();
            x0 x0VarA = x0.a(x0Var, 0L, 0L, null, null, 0L, null, null, d6.h.f57755e, 0L, null, null, 16744447);
            m1.a aVar5 = m1.f128891a;
            ba baVar = ba.f87580a;
            long jA = d92.b.a(o0VarE).j().a();
            long jY = sn.a.y(o0VarE);
            long jE = d92.b.a(o0VarE).e().e();
            baVar.getClass();
            sg sgVarC = ba.c(0L, 0L, 0L, 0L, 0L, jE, null, jA, jY, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, o0VarE, 2147477247);
            sg sgVarA = sgVarC.a(sgVarC.f89675a, sgVarC.f89676b, sgVarC.f89677c, sgVarC.f89678d, sgVarC.f89679e, sgVarC.f89680f, sgVarC.f89681g, sgVarC.f89682h, sgVarC.f89683i, sgVarC.f89684j, new t2(com.nimbusds.jose.shaded.gson.internal.a.d(o0VarE), o4.d0.c(0.4f, d92.b.a(o0VarE).k().b(), 14), null), sgVarC.f89686l, sgVarC.f89687m, sgVarC.f89688n, sgVarC.f89689o, sgVarC.f89690p, sgVarC.f89691q, sgVarC.f89692r, sgVarC.f89693s, sgVarC.f89694t, sgVarC.f89695u, sgVarC.f89696v, sgVarC.f89697w, sgVarC.f89698x, sgVarC.f89699y, sgVarC.f89700z, sgVarC.A, sgVarC.B, sgVarC.C, sgVarC.D, sgVarC.E, sgVarC.F, sgVarC.G, sgVarC.H, sgVarC.I, sgVarC.J, sgVarC.K, sgVarC.L, sgVarC.M, sgVarC.N, sgVarC.O, sgVarC.P, sgVarC.Q);
            boolean z16 = ((i17 & 896) == 256) | ((i17 & 112) == 32) | ((i17 & 57344) == 16384);
            Object objQ4 = o0VarE.q();
            if (z16 || objQ4 == c2565a) {
                objQ4 = new e(i14, i15, lVar, p1Var);
                o0VarE.K(objQ4);
            }
            na.b(l0Var, (e23.l) objQ4, rVarW, false, x0VarA, null, null, null, false, null, a2Var, z1Var, true, 0, 0, aVar5, sgVarA, o0VarE, 0, 12779520, 48, 1867736);
            o0Var = o0VarE;
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p(d14, i14, i15, b0Var, lVar, aVar, i16) { // from class: a11.f

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ double f288a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ int f289b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ int f290c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ m4.b0 f291d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ e23.l f292e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ e23.a f293f;

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p0.t(3073);
                    g.a(this.f288a, this.f289b, this.f290c, this.f291d, this.f292e, this.f293f, (p3.m) obj, iT);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}

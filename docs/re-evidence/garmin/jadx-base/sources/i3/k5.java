package i3;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Li3/k5;", "Li3/sc;", "<init>", "()V", "Lo4/d0;", "targetColor", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class k5 implements sc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k5 f88664a = new k5();

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements PointerInputEventHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f88665a = new a();

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(b5.h0 h0Var, t13.d<? super Unit> dVar) {
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class b implements e23.p<p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ tc f88666a;

        public b(tc tcVar) {
            this.f88666a = tcVar;
        }

        @Override // e23.p
        public final Unit invoke(p3.m mVar, Integer num) {
            p3.m mVar2 = mVar;
            int iIntValue = num.intValue();
            if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                p3.x1 x1Var = p3.n.f135158a;
                c2.j.f22691a.getClass();
                c2.j.d dVar = c2.j.f22693c;
                h4.d.f81522a.getClass();
                h4.g.b bVar = h4.d.a.f81534l;
                e23.q<c2.t2, p3.m, Integer, Unit> qVar = this.f88666a.f89796h;
                h4.r.a aVar = h4.r.S;
                c2.s2 s2VarA = c2.q2.a(dVar, bVar, mVar2, 54);
                int iP = mVar2.P();
                p3.i2 i2VarX = mVar2.x();
                h4.r rVarC = h4.k.c(aVar, mVar2);
                h5.g.V.getClass();
                h5.e0.a aVar2 = h5.g.a.f81805b;
                if (mVar2.F() == null) {
                    p3.p0.l();
                    throw null;
                }
                mVar2.z();
                if (mVar2.getT()) {
                    mVar2.M(aVar2);
                } else {
                    mVar2.c();
                }
                p3.b4.c(h5.g.a.f81810g, s2VarA, mVar2);
                p3.b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                h5.g.a.b bVar2 = h5.g.a.f81813j;
                if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iP))) {
                    v.h.z(iP, mVar2, iP, bVar2);
                }
                p3.b4.c(h5.g.a.f81807d, rVarC, mVar2);
                qVar.invoke(c2.u2.f22900a, mVar2, 6);
                mVar2.y();
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class c implements e23.a<o4.d0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ tc f88667a;

        public c(tc tcVar) {
            this.f88667a = tcVar;
        }

        @Override // e23.a
        public final o4.d0 invoke() {
            tc tcVar = this.f88667a;
            tcVar.getClass();
            mj mjVar = tcVar.f89799k;
            return o4.d0.a(o4.f0.h(mjVar.f89026a, mjVar.f89027b, s1.e0.f155562c.a(0.0f)));
        }
    }

    private k5() {
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005b  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a9  */
    @Override // i3.sc
    public final void a(tc tcVar, p3.m mVar, int i14) {
        float f14 = tcVar.f89797i;
        p3.o0 o0VarE = mVar.E(2137486921);
        int i15 = (o0VarE.B(tcVar) ? 4 : 2) | i14;
        int i16 = 0;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            mj mjVar = tcVar.f89799k;
            if (Float.isNaN(f14) || (Float.floatToRawIntBits(f14) & Integer.MAX_VALUE) >= 2139095040) {
                vb.h.s("The expandedHeight is expected to be specified and finite");
                return;
            }
            boolean zB = o0VarE.B(mjVar) | o0VarE.B(null);
            Object objQ = o0VarE.q();
            p3.m.a aVar = p3.m.f135153a;
            if (zB) {
                objQ = p3.p0.f(new c(tcVar));
                o0VarE.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = p3.p0.f(new c(tcVar));
                    o0VarE.K(objQ);
                }
            }
            p3.x3 x3VarA = r1.f2.a(((o4.d0) ((p3.x3) objQ).getF182175a()).f128833a, k9.b(n3.h0.DefaultEffects, o0VarE), o0VarE);
            z3.e eVarC = z3.f.c(-1658896622, new b(tcVar), o0VarE);
            o0VarE.C(690108113);
            o0VarE.g0(false);
            h4.r.a aVar2 = h4.r.S;
            h4.r rVarThen = tcVar.f89789a.then(aVar2);
            boolean zB2 = o0VarE.B(x3VarA);
            Object objQ2 = o0VarE.q();
            if (zB2) {
                objQ2 = new i5(x3VarA, i16);
                o0VarE.K(objQ2);
            } else {
                aVar.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new i5(x3VarA, i16);
                    o0VarE.K(objQ2);
                }
            }
            h4.r rVarD = l4.k.d(rVarThen, (e23.l) objQ2);
            Object objQ3 = o0VarE.q();
            aVar.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ3 == c2565a) {
                objQ3 = new i11.f(17);
                o0VarE.K(objQ3);
            }
            h4.r rVarC = p5.v.c((e23.l) objQ3, rVarD, false);
            Unit unit = Unit.INSTANCE;
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = a.f88665a;
                o0VarE.K(objQ4);
            }
            h4.r rVarB = b5.s0.b(rVarC, unit, (PointerInputEventHandler) objQ4);
            h4.d.f81522a.getClass();
            f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iP = o0VarE.P();
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarB, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            p3.b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            p3.b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iP))) {
                v.h.A(iP, o0VarE, iP, bVar);
            }
            p3.b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            c2.u uVar = c2.u.f22885a;
            h4.r rVarC3 = l4.k.c(c2.l.G(aVar2, tcVar.f89798j));
            float f15 = y.f90376a;
            i16 = (i15 & 14) == 4 ? 1 : 0;
            Object objQ5 = o0VarE.q();
            if (i16 != 0 || objQ5 == c2565a) {
                objQ5 = new j5();
                o0VarE.K(objQ5);
            }
            l3.x0 x0Var = (l3.x0) objQ5;
            long j8 = mjVar.f89028c;
            long j14 = mjVar.f89029d;
            long j15 = mjVar.f89030e;
            long j16 = mjVar.f89031f;
            e23.p<p3.m, Integer, Unit> pVar = tcVar.f89790b;
            s5.x0 x0Var2 = tcVar.f89791c;
            e23.p<p3.m, Integer, Unit> pVar2 = tcVar.f89792d;
            s5.x0 x0Var3 = tcVar.f89793e;
            c2.j.f22691a.getClass();
            c2.j.c cVar = c2.j.f22696f;
            h4.d.b bVar2 = tcVar.f89794f;
            e23.p<p3.m, Integer, Unit> pVar3 = tcVar.f89795g;
            float f16 = tcVar.f89797i;
            Object objQ6 = o0VarE.q();
            if (objQ6 == c2565a) {
                objQ6 = new i01.j(16);
                o0VarE.K(objQ6);
            }
            y.c(rVarC3, x0Var, j8, j14, j16, j15, pVar, x0Var2, pVar2, x0Var3, (e23.a) objQ6, cVar, bVar2, pVar3, eVarC, f16, o0VarE, 0);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i20.b(this, tcVar, i14, 3);
        }
    }
}

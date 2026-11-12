package mg2;

import c2.x2;
import f5.z0;
import h5.e0;
import i3.ua;
import o4.d0;
import o4.u1;
import o53.b0;
import o53.m0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import u1.y0;
import v62.e1;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.livesessionview.ui.composable.ActivitySavedGaugeKt$ActivitySavedGauge$1$1", f = "ActivitySavedGauge.kt", l = {27}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f118381a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f118382b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e23.a<Unit> aVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f118382b = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f118382b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f118381a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f118381a = 1;
                if (m0.b(3000L, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            this.f118382b.invoke();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0047  */
    public static final void a(e23.a<Unit> aVar, p3.m mVar, int i14) {
        o0 o0Var;
        aVar.getClass();
        o0 o0VarE = mVar.E(-1313289744);
        int i15 = (o0VarE.r(aVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            Unit unit = Unit.INSTANCE;
            boolean z14 = (i15 & 14) == 4;
            Object objQ = o0VarE.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (z14) {
                objQ = new a(aVar, null);
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new a(aVar, null);
                    o0VarE.K(objQ);
                }
            }
            l0.e((e23.p) objQ, unit, o0VarE);
            h4.d.f81522a.getClass();
            h4.g gVar = h4.d.a.f81528f;
            h4.r.a aVar3 = h4.r.S;
            z0 z0VarD = c2.q.d(gVar, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar3, o0VarE);
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
            b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.u uVar = c2.u.f22885a;
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.c cVar = j92.b.f97901d;
            h4.r rVarQ = x2.q(aVar3, cVar.f97908g);
            long jF = d92.b.a(o0VarE).j().f();
            d0.f128823b.getClass();
            long j8 = d0.f128831j;
            u1.f129010b.getClass();
            int i16 = u1.f129012d;
            float f14 = 0;
            g6.f.a aVar5 = g6.f.f75994b;
            bVar2.getClass();
            float f15 = j92.b.f97899b.f97917b;
            Object objQ2 = o0VarE.q();
            aVar2.getClass();
            if (objQ2 == p3.m.a.f135155b) {
                objQ2 = new g01.q(27);
                o0VarE.K(objQ2);
            }
            o0Var = o0VarE;
            ua.b((e23.a) objQ2, rVarQ, jF, f15, j8, i16, f14, o0Var, 1597446, 0);
            s62.a.f157643a.getClass();
            u4.d dVarA = e1.a(t62.b.f162798a);
            bVar2.getClass();
            y0.b(dVarA, null, x2.q(aVar3, cVar.f97907f), o4.e0.a.a(o4.e0.f128843b, d92.b.a(o0Var).j().f()), o0Var, 48, 56);
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ll1.g(aVar, i14, 8);
        }
    }
}

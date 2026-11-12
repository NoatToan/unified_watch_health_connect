package s70;

import c2.x2;
import i3.e5;
import java.util.List;
import n70.i6;
import n70.j6;
import n70.k6;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ls70/d0;", "Lr70/r;", "Ly70/e;", "stateHolder", "<init>", "(Ly70/e;)V", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d0 implements r70.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y70.e f157681a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.presentation.component.DeviceLinkComposable$DashboardItem$1$1", f = "DeviceLinkComposable.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.lifecycle.n0 f157682a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d0 f157683b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.lifecycle.n0 n0Var, d0 d0Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f157682a = n0Var;
            this.f157683b = d0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f157682a, this.f157683b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            this.f157682a.getF158016a().a(new androidx.lifecycle.a0(this.f157683b, 11));
            return Unit.INSTANCE;
        }
    }

    public d0(y70.e eVar) {
        eVar.getClass();
        this.f157681a = eVar;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x007a  */
    @Override // r70.r
    public final void a(h4.r rVar, r70.q qVar, p3.m mVar, int i14) {
        p3.o0 o0VarQ = lc.u0.q(rVar, qVar, mVar, 839845848);
        int i15 = (i14 & 6) == 0 ? (o0VarQ.B(rVar) ? 4 : 2) | i14 : i14;
        if ((i14 & 48) == 0) {
            i15 |= o0VarQ.r(qVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarQ.r(this) ? 256 : 128;
        }
        if (o0VarQ.n(i15 & 1, (i15 & 147) != 146)) {
            p3.x1 x1Var = p3.n.f135158a;
            androidx.lifecycle.n0 n0Var = (androidx.lifecycle.n0) o0VarQ.A(s9.j.f158018a);
            androidx.lifecycle.b0 f158016a = n0Var.getF158016a();
            boolean zR = o0VarQ.r(n0Var) | o0VarQ.r(this);
            Object objQ = o0VarQ.q();
            p3.m.a aVar = p3.m.f135153a;
            if (zR) {
                objQ = new a(n0Var, this, null);
                o0VarQ.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new a(n0Var, this, null);
                    o0VarQ.K(objQ);
                }
            }
            p3.l0.e((e23.p) objQ, f158016a, o0VarQ);
            Object objQ2 = o0VarQ.q();
            aVar.getClass();
            if (objQ2 == p3.m.a.f135155b) {
                i6 i6Var = this.f157681a.f194655a;
                r53.b bVarF = r53.s.f(new j6(i6Var, null));
                ed0.a.f63825a.getClass();
                objQ2 = r53.s.l(bVarF, ed0.a.f63833i, i6Var.f124290c, new k6(i6Var, null));
                o0VarQ.K(objQ2);
            }
            List<n80.a> list = (List) s9.c.b((r53.i) objQ2, null, o0VarQ, 48).getF182175a();
            if (list == null) {
                o0VarQ.C(1663817970);
                o0VarQ.g0(false);
            } else {
                o0VarQ.C(1663817971);
                int i16 = 3;
                h4.r rVarX = x2.x(x2.f(rVar, 1.0f), null, 3);
                d92.b.f58623a.getClass();
                j92.b bVar = d92.b.f58625c;
                bVar.getClass();
                j92.e eVar = j92.b.f97899b;
                float f14 = eVar.f97920e;
                bVar.getClass();
                h4.r rVarC = c2.l.C(rVarX, f14, 0.0f, eVar.f97920e, 0.0f, 10);
                c2.j.f22691a.getClass();
                c2.j.k kVar = c2.j.f22694d;
                h4.d.f81522a.getClass();
                c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarQ, 0);
                int iHashCode = Long.hashCode(o0VarQ.U);
                i2 i2VarA0 = o0VarQ.a0();
                h4.r rVarC2 = h4.k.c(rVarC, o0VarQ);
                h5.g.V.getClass();
                h5.e0.a aVar2 = h5.g.a.f81805b;
                if (o0VarQ.f135177b == null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarQ.z();
                if (o0VarQ.T) {
                    o0VarQ.M(aVar2);
                } else {
                    o0VarQ.c();
                }
                b4.c(h5.g.a.f81810g, zVarA, o0VarQ);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarQ);
                h5.g.a.b bVar2 = h5.g.a.f81813j;
                if (o0VarQ.T || !p005kotlin.jvm.internal.s.g(o0VarQ.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarQ, iHashCode, bVar2);
                }
                b4.c(h5.g.a.f81807d, rVarC2, o0VarQ);
                c2.b0 b0Var = c2.b0.f22601a;
                o0VarQ.C(-1684430695);
                for (n80.a aVar3 : list) {
                    h4.r rVarX2 = x2.x(x2.f(h4.r.S, 1.0f), null, i16);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarC3 = c2.l.C(rVarX2, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13);
                    boolean zR2 = o0VarQ.r(qVar) | o0VarQ.r(aVar3);
                    Object objQ3 = o0VarQ.q();
                    if (zR2 || objQ3 == p3.m.a.f135155b) {
                        objQ3 = new rk0.g(23, qVar, aVar3);
                        o0VarQ.K(objQ3);
                    }
                    e23.l lVar = (e23.l) objQ3;
                    boolean zR3 = o0VarQ.r(this) | o0VarQ.r(aVar3);
                    Object objQ4 = o0VarQ.q();
                    if (zR3 || objQ4 == p3.m.a.f135155b) {
                        objQ4 = new rk0.f(23, this, aVar3);
                        o0VarQ.K(objQ4);
                    }
                    p80.a.a(aVar3, lVar, rVarC3, (e23.a) objQ4, o0VarQ, n80.a.f124926e, 0);
                    i16 = i16;
                }
                e5.u(o0VarQ, false, true, false);
            }
            p3.x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarQ.e();
        }
        p2 p2VarI0 = o0VarQ.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n(this, rVar, qVar, i14, 3);
        }
    }
}

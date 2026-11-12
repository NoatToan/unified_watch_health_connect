package s70;

import android.net.Uri;
import android.os.Bundle;
import com.garmin.android.apps.connectmobile.R;
import n70.d3;
import n70.f3;
import n70.g3;
import n70.h3;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p2;
import v62.b5;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ls70/k1;", "Lr70/r;", "Ly70/m;", "stateHolder", "<init>", "(Ly70/m;)V", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k1 implements r70.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y70.m f157720a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.presentation.component.RemainingInReachSubscriptionComposable$DashboardItem$1$1", f = "RemainingInReachSubscriptionComposable.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.lifecycle.n0 f157721a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ k1 f157722b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.lifecycle.n0 n0Var, k1 k1Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f157721a = n0Var;
            this.f157722b = k1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f157721a, this.f157722b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            this.f157721a.getF158016a().a(new androidx.lifecycle.a0(this.f157722b, 13));
            return Unit.INSTANCE;
        }
    }

    public k1(y70.m mVar) {
        mVar.getClass();
        this.f157720a = mVar;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0060  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // r70.r
    public final void a(h4.r rVar, r70.q qVar, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0VarQ = lc.u0.q(rVar, qVar, mVar, 2130741880);
        if ((i14 & 6) == 0) {
            i15 = (o0VarQ.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarQ.r(this) ? 256 : 128;
        }
        if (o0VarQ.n(i15 & 1, (i15 & 131) != 130)) {
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
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ2 == c2565a) {
                d3 d3Var = this.f157720a.f194670a;
                objQ2 = r53.s.l(new r53.c2(new f3(d3Var, null)), r53.s.f(new g3(d3Var, null)), d3Var.f124137c, new h3(d3Var, null));
                o0VarQ.K(objQ2);
            }
            vb0.a aVar2 = (vb0.a) s9.c.b((r53.i) objQ2, null, o0VarQ, 48).getF182175a();
            Uri uri = aVar2 != null ? aVar2.f176834b : null;
            if (uri == null) {
                o0VarQ.C(1610335550);
                o0VarQ.g0(false);
            } else {
                o0VarQ.C(1610335551);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                h4.r rVarY = c2.l.y(rVar, j92.b.f97899b.f97920e);
                boolean zR2 = o0VarQ.r(this) | o0VarQ.r(aVar2);
                Object objQ3 = o0VarQ.q();
                if (zR2 || objQ3 == c2565a) {
                    objQ3 = new rk0.f(29, this, aVar2);
                    o0VarQ.K(objQ3);
                }
                b(rVarY, uri, (e23.a) objQ3, o0VarQ, (i15 << 3) & 7168);
                ht.a aVar3 = ht.a.f85464a;
                Bundle bundleA = h7.c.a(new o13.p("Screen", "Home"), new o13.p("Type", "InReachSubscriptionBanner"));
                aVar3.getClass();
                ht.a.a(bundleA, "PageView");
                o0VarQ.g0(false);
            }
        } else {
            o0VarQ.e();
        }
        p2 p2VarI0 = o0VarQ.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n(this, rVar, qVar, i14, 13);
        }
    }

    public final void b(h4.r rVar, Uri uri, e23.a<Unit> aVar, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0Var;
        rVar.getClass();
        aVar.getClass();
        p3.o0 o0VarE = mVar.E(-911106119);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(uri) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(aVar) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            p3.x1 x1Var = p3.n.f135158a;
            g.h hVar = new g.h();
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new s5.e0(20);
                o0VarE.K(objQ);
            }
            c.q qVarC = c.w.c(hVar, (e23.l) objQ, o0VarE, 48);
            l72.s sVar = l72.s.f111232a;
            g6.f.a aVar2 = g6.f.f75994b;
            h4.r rVarE = u1.n.e(l4.k.b(rVar, k2.i.a(8)), am.j.B(d92.b.f58623a, o0VarE), o4.m1.f128891a);
            s62.a.f157643a.getClass();
            u4.d dVarA = b5.a(t62.b.f162798a);
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_active_inreach_plan);
            String strQ2 = gl1.y.Q(o0VarE, R.string.msg_removed_device_with_active_inreach_plan);
            String strQ3 = gl1.y.Q(o0VarE, R.string.manage_subscription);
            boolean zR = o0VarE.r(uri) | o0VarE.r(qVarC);
            Object objQ2 = o0VarE.q();
            if (zR || objQ2 == c2565a) {
                objQ2 = new j1(0, qVarC, uri);
                o0VarE.K(objQ2);
            }
            o0Var = o0VarE;
            sVar.c(rVarE, dVarA, null, null, strQ, strQ2, strQ3, false, aVar, (e23.a) objQ2, o0Var, (i15 << 21) & 1879048192, 0, 396);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ot1.i(this, rVar, uri, aVar, i14, 15);
        }
    }
}

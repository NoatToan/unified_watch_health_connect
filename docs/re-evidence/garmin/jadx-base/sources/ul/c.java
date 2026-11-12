package ul;

import android.annotation.SuppressLint;
import android.app.Activity;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.u1;
import e23.l;
import e23.p;
import gl1.y;
import lc.h0;
import lc.m0;
import lc.v;
import lc.v0;
import o13.r;
import o53.b0;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.q;
import p005kotlin.jvm.internal.s0;
import p3.l0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p1;
import p3.x1;
import p3.x3;
import r53.p2;
import t13.d;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class a extends q implements l<Long, Unit> {
        public a(Object obj) {
            super(1, obj, zl.b.class, "setSelectedTimestamp", "setSelectedTimestamp(Ljava/lang/Long;)V", 0);
        }

        @Override // e23.l
        public final Unit invoke(Long l14) {
            Object value;
            Long l15 = l14;
            p2 p2Var = ((zl.b) this.receiver).f205174f;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, l15));
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.acclimation.reports.presentation.composables.navigation.PulseOxAcclimationNavHostKt$PulseOxAcclimationNavHost$2$1", f = "PulseOxAcclimationNavHost.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<b0, d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Activity f171950a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x3<v> f171951b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Activity activity, x3<v> x3Var, d<? super b> dVar) {
            super(2, dVar);
            this.f171950a = activity;
            this.f171951b = x3Var;
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new b(this.f171950a, this.f171951b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0030 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:11:0x0032  */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            h0 h0Var;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            v f182175a = this.f171951b.getF182175a();
            Activity activity = this.f171950a;
            if (f182175a != null && (h0Var = f182175a.f111882b) != null) {
                h0.a aVar2 = h0.f111771f;
                k23.d dVarB = s0.f105811a.b(vl.a.b.class);
                aVar2.getClass();
                if (h0.a.c(h0Var, dVarB)) {
                    if (activity != null) {
                        activity.setRequestedOrientation(-1);
                    }
                } else if (activity != null) {
                    activity.setRequestedOrientation(1);
                }
            } else if (activity != null) {
                activity.setRequestedOrientation(1);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0040  */
    /* JADX WARN: Code duplicated, block: B:19:0x009c  */
    /* JADX WARN: Code duplicated, block: B:24:0x00d8  */
    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"SourceLockedOrientationActivity"})
    public static final void a(m mVar, int i14) {
        o0 o0VarE = mVar.E(-1801399103);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            x1 x1Var = n.f135158a;
            m0 m0VarI = y.I(new v0[0], o0VarE);
            p1 p1VarL = y.l(m0VarI, o0VarE);
            Activity activity = (Activity) o0VarE.A(c.n.f22332a);
            boolean zR = o0VarE.r(activity);
            Object objQ = o0VarE.q();
            m.a aVar = m.f135153a;
            if (zR) {
                objQ = new by1.l(activity, 5);
                o0VarE.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new by1.l(activity, 5);
                    o0VarE.K(objQ);
                }
            }
            e23.a aVar2 = (e23.a) objQ;
            o0VarE.L(-1614864554);
            v9.a.f176280a.getClass();
            ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(o0VarE);
            if (viewModelStoreOwnerA == null) {
                h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(s0.f105811a.b(zl.b.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(o0VarE, 0), aVar2);
            o0VarE.g0(false);
            zl.b bVar = (zl.b) u1VarResolveViewModel;
            vl.a.c cVar = vl.a.c.INSTANCE;
            boolean zR2 = o0VarE.r(bVar) | o0VarE.r(activity) | o0VarE.r(m0VarI);
            Object objQ2 = o0VarE.q();
            if (zR2) {
                objQ2 = new tn2.s0(bVar, 8, activity, m0VarI);
                o0VarE.K(objQ2);
            } else {
                aVar.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new tn2.s0(bVar, 8, activity, m0VarI);
                    o0VarE.K(objQ2);
                }
            }
            nc.y.a(m0VarI, cVar, null, null, null, null, null, null, null, (l) objQ2, o0VarE, 48, 2044);
            v vVar = (v) p1VarL.getF182175a();
            boolean zB = o0VarE.B(p1VarL) | o0VarE.r(activity);
            Object objQ3 = o0VarE.q();
            if (zB) {
                objQ3 = new b(activity, p1VarL, null);
                o0VarE.K(objQ3);
            } else {
                aVar.getClass();
                if (objQ3 == m.a.f135155b) {
                    objQ3 = new b(activity, p1VarL, null);
                    o0VarE.K(objQ3);
                }
            }
            l0.e((p) objQ3, vVar, o0VarE);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new uj1.a(i14, 10);
        }
    }
}

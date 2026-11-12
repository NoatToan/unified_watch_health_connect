package l51;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.u1;
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
import p005kotlin.jvm.internal.s0;
import p3.l0;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;
import p3.x3;

/* JADX INFO: loaded from: classes9.dex */
public final class k {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.pacepro.presentation.navigation.PaceProNavHostKt$PaceProNavHost$2$1", f = "PaceProNavHost.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f110199a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x3<v> f110200b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b.g gVar, x3<v> x3Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f110199a = gVar;
            this.f110200b = x3Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f110199a, this.f110200b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0052  */
        /* JADX WARN: Code duplicated, block: B:9:0x002e  */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            v f182175a;
            h0 h0Var;
            h0 h0Var2;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            x3<v> x3Var = this.f110200b;
            v f182175a2 = x3Var.getF182175a();
            b.g gVar = this.f110199a;
            if (f182175a2 == null || (h0Var2 = f182175a2.f111882b) == null) {
                f182175a = x3Var.getF182175a();
                if (f182175a != null || (h0Var = f182175a.f111882b) == null) {
                    gVar.setRequestedOrientation(1);
                } else {
                    h0.a aVar2 = h0.f111771f;
                    k23.d dVarB = s0.f105811a.b(n51.b.d.class);
                    aVar2.getClass();
                    if (h0.a.c(h0Var, dVarB)) {
                        gVar.setRequestedOrientation(0);
                    } else {
                        gVar.setRequestedOrientation(1);
                    }
                }
            } else {
                h0.a aVar3 = h0.f111771f;
                k23.d dVarB2 = s0.f105811a.b(n51.b.C2324b.class);
                aVar3.getClass();
                if (h0.a.c(h0Var2, dVarB2)) {
                    gVar.setRequestedOrientation(-1);
                } else {
                    f182175a = x3Var.getF182175a();
                    if (f182175a != null) {
                        gVar.setRequestedOrientation(1);
                    } else {
                        gVar.setRequestedOrientation(1);
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"l51/k$b", "Lp3/h0;", "runtime"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements p3.h0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f110201a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ k7.b f110202b;

        public b(b.g gVar, k7.b bVar) {
            this.f110201a = gVar;
            this.f110202b = bVar;
        }

        @Override // p3.h0
        public final void dispose() {
            this.f110201a.removeOnNewIntentListener(this.f110202b);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0099  */
    /* JADX WARN: Code duplicated, block: B:26:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:31:0x0114  */
    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"SourceLockedOrientationActivity"})
    public static final void a(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-237763244);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objA = o0VarE.A(c.n.f22332a);
            b.g gVar = objA instanceof b.g ? (b.g) objA : null;
            if (gVar == null) {
                p2 p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new ky0.c(i14, 20);
                    return;
                }
                return;
            }
            m0 m0VarI = y.I(new v0[0], o0VarE);
            p1 p1VarL = y.l(m0VarI, o0VarE);
            o0VarE.L(-1614864554);
            u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(s0.f105811a.b(p51.c.class), gVar.getF189591b(), null, CreationExtrasExtKt.defaultExtras(gVar), null, KoinApplicationKt.currentKoinScope(o0VarE, 0), null);
            o0VarE.g0(false);
            p51.c cVar = (p51.c) u1VarResolveViewModel;
            n51.b.f fVar = n51.b.f.INSTANCE;
            boolean zR = o0VarE.r(m0VarI) | o0VarE.r(cVar) | o0VarE.r(context);
            Object objQ = o0VarE.q();
            p3.m.a aVar = p3.m.f135153a;
            if (zR) {
                objQ = new k62.k(22, context, m0VarI, cVar);
                o0VarE.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new k62.k(22, context, m0VarI, cVar);
                    o0VarE.K(objQ);
                }
            }
            e23.l lVar = (e23.l) objQ;
            b.g gVar2 = gVar;
            nc.y.a(m0VarI, fVar, null, null, null, null, null, null, null, lVar, o0VarE, 48, 2044);
            v vVar = (v) p1VarL.getF182175a();
            boolean zB = o0VarE.B(p1VarL) | o0VarE.r(gVar2);
            Object objQ2 = o0VarE.q();
            if (zB) {
                objQ2 = new a(gVar2, p1VarL, null);
                o0VarE.K(objQ2);
            } else {
                aVar.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new a(gVar2, p1VarL, null);
                    o0VarE.K(objQ2);
                }
            }
            l0.e((e23.p) objQ2, vVar, o0VarE);
            Unit unit = Unit.INSTANCE;
            boolean zR2 = o0VarE.r(m0VarI) | o0VarE.r(cVar) | o0VarE.r(context) | o0VarE.r(gVar2);
            Object objQ3 = o0VarE.q();
            if (zR2) {
                ev2.f fVar2 = new ev2.f(gVar2, m0VarI, cVar, context, 23);
                o0VarE.K(fVar2);
                objQ3 = fVar2;
            } else {
                aVar.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    ev2.f fVar3 = new ev2.f(gVar2, m0VarI, cVar, context, 23);
                    o0VarE.K(fVar3);
                    objQ3 = fVar3;
                }
            }
            l0.a(unit, (e23.l) objQ3, o0VarE);
        } else {
            o0VarE.e();
        }
        p2 p2VarI1 = o0VarE.i0();
        if (p2VarI1 != null) {
            p2VarI1.f135219d = new ky0.c(i14, 21);
        }
    }
}

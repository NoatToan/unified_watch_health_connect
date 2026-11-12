package z10;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.consent.LivetrackConsentEnforceViewModel$checkConsentApprovalRequest$1", f = "LivetrackConsentEnforceViewModel.kt", l = {94}, m = "invokeSuspend", v = 2)
public final class e2 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f200971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d2 f200972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q92.x f200973c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(d2 d2Var, q92.x xVar, t13.d<? super e2> dVar) {
        super(2, dVar);
        this.f200972b = d2Var;
        this.f200973c = xVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e2(this.f200972b, this.f200973c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e2) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        a1 fVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f200971a;
        q92.x xVar = this.f200973c;
        d2 d2Var = this.f200972b;
        if (i14 == 0) {
            o13.r.b(obj);
            androidx.lifecycle.y0<a1> y0Var = d2Var.f200958c;
            a1 a1VarD = y0Var.d();
            y0Var.m(new a1.b(xVar, a1VarD != null ? a1VarD.f200882b : null));
            e20.a aVar2 = d2Var.f200957b;
            String str = xVar.f143819a;
            this.f200971a = 1;
            obj = aVar2.a(str, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        com.garmin.android.apps.connectmobile.v2 v2Var = (com.garmin.android.apps.connectmobile.v2) obj;
        if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.b) {
            androidx.lifecycle.y0<a1> y0Var2 = d2Var.f200958c;
            d1 d1Var = d1.f200951a;
            d20.a aVar3 = (d20.a) ((com.garmin.android.apps.connectmobile.v2.b) v2Var).f47386a;
            d1Var.getClass();
            boolean zG = d1.g(aVar3);
            androidx.lifecycle.y0<a1> y0Var3 = d2Var.f200958c;
            if (zG) {
                a1 a1VarD2 = y0Var3.d();
                fVar = new a1.e(xVar, a1VarD2 != null ? a1VarD2.f200882b : null);
            } else {
                a1 a1VarD3 = y0Var3.d();
                fVar = new a1.f(xVar, a1VarD3 != null ? a1VarD3.f200882b : null);
            }
            y0Var2.m(fVar);
        } else {
            if (!(v2Var instanceof com.garmin.android.apps.connectmobile.v2.a)) {
                lc.u0.r();
                return null;
            }
            androidx.lifecycle.y0<a1> y0Var4 = d2Var.f200958c;
            a1 a1VarD4 = y0Var4.d();
            y0Var4.m(new a1.c(xVar, a1VarD4 != null ? a1VarD4.f200882b : null));
        }
        return Unit.INSTANCE;
    }
}

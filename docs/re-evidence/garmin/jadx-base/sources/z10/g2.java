package z10;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.consent.LivetrackConsentEnforceViewModel$sendConsentApprovalRequest$1", f = "LivetrackConsentEnforceViewModel.kt", l = {107}, m = "invokeSuspend", v = 2)
public final class g2 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f201011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d2 f201012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q92.x f201013c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(d2 d2Var, q92.x xVar, t13.d<? super g2> dVar) {
        super(2, dVar);
        this.f201012b = d2Var;
        this.f201013c = xVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new g2(this.f201012b, this.f201013c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((g2) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f201011a;
        q92.x xVar = this.f201013c;
        d2 d2Var = this.f201012b;
        if (i14 == 0) {
            o13.r.b(obj);
            androidx.lifecycle.y0<a1> y0Var = d2Var.f200958c;
            a1 a1VarD = y0Var.d();
            y0Var.m(new a1.b(xVar, a1VarD != null ? a1VarD.f200882b : null));
            e20.a aVar2 = d2Var.f200957b;
            d20.e eVar = new d20.e(xVar.f143819a);
            this.f201011a = 1;
            obj = aVar2.c(eVar, this);
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
            a1 a1VarD2 = y0Var2.d();
            y0Var2.m(new a1.d(xVar, a1VarD2 != null ? a1VarD2.f200882b : null));
        } else {
            if (!(v2Var instanceof com.garmin.android.apps.connectmobile.v2.a)) {
                lc.u0.r();
                return null;
            }
            androidx.lifecycle.y0<a1> y0Var3 = d2Var.f200958c;
            a1 a1VarD3 = y0Var3.d();
            y0Var3.m(new a1.c(xVar, a1VarD3 != null ? a1VarD3.f200882b : null));
        }
        return Unit.INSTANCE;
    }
}

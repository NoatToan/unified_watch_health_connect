package z10;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.consent.ConsentViewModel$grantConsent$1", f = "ConsentViewModel.kt", l = {50}, m = "invokeSuspend", v = 2)
public final class j1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public androidx.lifecycle.y0 f201064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f201065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.y0<q92.v> f201066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q92.x f201067d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s92.g f201068e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(androidx.lifecycle.y0<q92.v> y0Var, q92.x xVar, s92.g gVar, t13.d<? super j1> dVar) {
        super(2, dVar);
        this.f201066c = y0Var;
        this.f201067d = xVar;
        this.f201068e = gVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new j1(this.f201066c, this.f201067d, this.f201068e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((j1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        androidx.lifecycle.y0 y0Var;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f201065b;
        if (i14 == 0) {
            o13.r.b(obj);
            p92.o oVar = p92.o.f136619a;
            androidx.lifecycle.y0<q92.v> y0Var2 = this.f201066c;
            this.f201064a = y0Var2;
            this.f201065b = 1;
            obj = oVar.p(this.f201067d, this.f201068e, this);
            if (obj == aVar) {
                return aVar;
            }
            y0Var = y0Var2;
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y0Var = this.f201064a;
            o13.r.b(obj);
        }
        y0Var.m(obj);
        return Unit.INSTANCE;
    }
}

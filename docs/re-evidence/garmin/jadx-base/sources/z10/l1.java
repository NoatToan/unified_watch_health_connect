package z10;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.consent.ConsentViewModel$optOutFeature$1", f = "ConsentViewModel.kt", l = {66}, m = "invokeSuspend", v = 2)
public final class l1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public androidx.lifecycle.y0 f201120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f201121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.y0<q92.v> f201122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q92.d f201123d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(androidx.lifecycle.y0<q92.v> y0Var, q92.d dVar, t13.d<? super l1> dVar2) {
        super(2, dVar2);
        this.f201122c = y0Var;
        this.f201123d = dVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new l1(this.f201122c, this.f201123d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((l1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        androidx.lifecycle.y0 y0Var;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f201121b;
        if (i14 == 0) {
            o13.r.b(obj);
            p92.o oVar = p92.o.f136619a;
            androidx.lifecycle.y0<q92.v> y0Var2 = this.f201122c;
            this.f201120a = y0Var2;
            this.f201121b = 1;
            obj = oVar.t(this.f201123d, this);
            if (obj == aVar) {
                return aVar;
            }
            y0Var = y0Var2;
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y0Var = this.f201120a;
            o13.r.b(obj);
        }
        y0Var.m(obj);
        return Unit.INSTANCE;
    }
}

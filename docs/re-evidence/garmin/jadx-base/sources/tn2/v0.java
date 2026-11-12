package tn2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lmn2/a;", "<anonymous>", "(Lo53/b0;)Lmn2/a;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.felica.FelicaService$getImageSize$1$1", f = "FelicaService.kt", l = {1150}, m = "invokeSuspend", v = 2)
public final class v0 extends v13.i implements e23.p<o53.b0, t13.d<? super mn2.a>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f165677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r0 f165678b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(r0 r0Var, t13.d<? super v0> dVar) {
        super(2, dVar);
        this.f165678b = r0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new v0(this.f165678b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super mn2.a> dVar) {
        return ((v0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f165677a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        r0 r0Var = this.f165678b;
        mn2.k kVar = r0Var.f165635d;
        long j8 = r0Var.f165632a.f165682c;
        this.f165677a = 1;
        Object objA = mn2.m.a(kVar, j8, this);
        return objA == aVar ? aVar : objA;
    }
}

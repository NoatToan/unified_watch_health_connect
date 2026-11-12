package kr;

import am.x0;
import e23.p;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Ljr/c;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.data.repository.ActivityConfigurationRepo$getActivityShareConfiguration$1", f = "ActivityConfigurationRepo.kt", l = {30}, m = "invokeSuspend", v = 2)
public final class c extends v13.i implements p<r53.j<? super jr.c>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f106206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f106207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f106208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x0 f106209d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, x0 x0Var, t13.d<? super c> dVar) {
        super(2, dVar);
        this.f106208c = eVar;
        this.f106209d = x0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        c cVar = new c(this.f106208c, this.f106209d, dVar);
        cVar.f106207b = obj;
        return cVar;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super jr.c> jVar, t13.d<? super Unit> dVar) {
        return ((c) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        r53.j jVar = (r53.j) this.f106207b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f106206a;
        if (i14 == 0) {
            r.b(obj);
            jr.c cVarB = a.b(this.f106208c.f106213a, this.f106209d);
            this.f106207b = null;
            this.f106206a = 1;
            if (jVar.emit(cVarB, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}

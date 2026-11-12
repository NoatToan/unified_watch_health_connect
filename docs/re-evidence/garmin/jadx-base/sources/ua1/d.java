package ua1;

import com.garmin.android.apps.connectmobile.g3;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.powerguide.create.CreatePowerGuideStrategyViewModel$showError$2", f = "CreatePowerGuideStrategyViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class d extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f169628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f169629b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, String str, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f169628a = cVar;
        this.f169629b = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d(this.f169628a, this.f169629b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        c cVar = this.f169628a;
        cVar.f169617m.m(g3.a.a(g3.f35298f, this.f169629b, null, null, null, 14));
        cVar.f169617m.m(null);
        return Unit.INSTANCE;
    }
}

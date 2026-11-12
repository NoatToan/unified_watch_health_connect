package qr;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljr/a;", "chartsConfiguration", "", "<anonymous>", "(Ljr/a;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$getChartsConfiguration$2", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class i2 extends v13.i implements e23.p<jr.a, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f146248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f146249b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(t tVar, t13.d<? super i2> dVar) {
        super(2, dVar);
        this.f146249b = tVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        i2 i2Var = new i2(this.f146249b, dVar);
        i2Var.f146248a = obj;
        return i2Var;
    }

    @Override // e23.p
    public final Object invoke(jr.a aVar, t13.d<? super Unit> dVar) {
        return ((i2) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        jr.a aVar = (jr.a) this.f146248a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        r53.p2 p2Var = this.f146249b.P;
        if (aVar == null) {
            aVar = new jr.a(null, null, null, 7, null);
        }
        p2Var.k(null, aVar);
        return Unit.INSTANCE;
    }
}

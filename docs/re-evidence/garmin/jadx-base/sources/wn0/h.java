package wn0;

import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.healthstatus.presentation.reports.HealthStatusReportsScreenKt$HealthStatusReportsScreen$1$1", f = "HealthStatusReportsScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vn0.a f186122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l<vn0.a, Unit> f186123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f186124c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h(vn0.a aVar, e23.l<? super vn0.a, Unit> lVar, l lVar2, t13.d<? super h> dVar) {
        super(2, dVar);
        this.f186122a = aVar;
        this.f186123b = lVar;
        this.f186124c = lVar2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h(this.f186122a, this.f186123b, this.f186124c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        vn0.a aVar2 = this.f186122a;
        if (aVar2 != null) {
            this.f186123b.invoke(aVar2);
            l lVar = this.f186124c;
            p2 p2Var = lVar.f186138i;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, p.a((p) value, false, null, false, false, 13)));
            lVar.f186144o = true;
        }
        return Unit.INSTANCE;
    }
}

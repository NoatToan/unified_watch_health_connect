package wn0;

import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.healthstatus.presentation.reports.HealthStatusDetailsScreenKt$HealthStatusDetailsScreen$1$1", f = "HealthStatusDetailsScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class d extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u82.f<in0.c> f186113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1<u82.f<in0.c>> f186114b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(u82.f<in0.c> fVar, p1<u82.f<in0.c>> p1Var, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f186113a = fVar;
        this.f186114b = p1Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d(this.f186113a, this.f186114b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        u82.f<in0.c> fVar = this.f186113a;
        if (!(fVar instanceof u82.f.b)) {
            float f14 = g.f186119a;
            this.f186114b.setValue(fVar);
        }
        return Unit.INSTANCE;
    }
}

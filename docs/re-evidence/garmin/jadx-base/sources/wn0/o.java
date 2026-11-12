package wn0;

import o13.r;
import o53.b0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.healthstatus.presentation.reports.HealthStatusReportsViewModel$shouldShowHealthStatusTrackingBanner$1", f = "HealthStatusReportsViewModel.kt", l = {215}, m = "invokeSuspend", v = 2)
public final class o extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f186163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f186164b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(l lVar, t13.d<? super o> dVar) {
        super(2, dVar);
        this.f186164b = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new o(this.f186164b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((o) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f186163a;
        l lVar = this.f186164b;
        if (i14 == 0) {
            r.b(obj);
            mn0.p pVar = (mn0.p) KoinJavaComponent.get$default(mn0.p.class, null, null, 6, null);
            if (lVar.f186136g.e()) {
                this.f186163a = 1;
                obj = pVar.c(this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return Unit.INSTANCE;
        }
        if (i14 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        if (!((Boolean) obj).booleanValue()) {
            lVar.y4(true);
        }
        return Unit.INSTANCE;
    }
}

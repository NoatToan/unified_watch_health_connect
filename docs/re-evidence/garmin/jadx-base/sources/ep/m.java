package ep;

import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.powercurve.PowerCurveScreenKt$PowerCurveScreen$2$2$1$1", f = "PowerCurveScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class m extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Long f64835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Long f64836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f64837c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Long l14, Long l15, o oVar, t13.d<? super m> dVar) {
        super(2, dVar);
        this.f64835a = l14;
        this.f64836b = l15;
        this.f64837c = oVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new m(this.f64835a, this.f64836b, this.f64837c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((m) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Long l14;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        Long l15 = this.f64835a;
        if (l15 != null && (l14 = this.f64836b) != null && l15.longValue() <= l14.longValue()) {
            this.f64837c.x4(l15, l14);
        }
        return Unit.INSTANCE;
    }
}

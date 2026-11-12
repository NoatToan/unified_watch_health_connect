package gn1;

import e23.l;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.sleep.presentation.detail.coach.alignment.SleepAlignmentChartKt$SleepAlignmentChart$3$1", f = "SleepAlignmentChart.kt", l = {}, m = "invokeSuspend", v = 2)
public final class c extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l<Float, Unit> f78079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f78080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f78081c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(l<? super Float, Unit> lVar, float f14, float f15, t13.d<? super c> dVar) {
        super(2, dVar);
        this.f78079a = lVar;
        this.f78080b = f14;
        this.f78081c = f15;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c(this.f78079a, this.f78080b, this.f78081c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        l<Float, Unit> lVar = this.f78079a;
        if (lVar != null) {
            lVar.invoke(new Float(this.f78080b - (this.f78081c * 1.5f)));
        }
        return Unit.INSTANCE;
    }
}

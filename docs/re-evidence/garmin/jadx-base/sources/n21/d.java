package n21;

import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.p1;
import v13.i;
import x5.l0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.settings.composable.StepperSliderWithInputKt$StepperSliderWithInput$1$1", f = "StepperSliderWithInput.kt", l = {}, m = "invokeSuspend", v = 2)
public final class d extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f122365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1<l0> f122366b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(float f14, p1<l0> p1Var, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f122365a = f14;
        this.f122366b = p1Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d(this.f122365a, this.f122366b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        String strValueOf = String.valueOf((int) this.f122365a);
        p1<l0> p1Var = this.f122366b;
        if (!s.g(p1Var.getF182175a().f188878a.f157138b, strValueOf)) {
            l0 f182175a = p1Var.getF182175a();
            int length = strValueOf.length();
            p1Var.setValue(l0.a(f182175a, strValueOf, og.a.l(length, length), 4));
        }
        return Unit.INSTANCE;
    }
}

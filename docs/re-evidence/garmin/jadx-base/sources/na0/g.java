package na0;

import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p1;
import s5.w0;
import x5.l0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.customization.cycling.wheel.BikeWheelCircumferenceEstimationScreenKt$DigitInputCell$1$1", f = "BikeWheelCircumferenceEstimationScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class g extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f125121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1<l0> f125122b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(String str, p1<l0> p1Var, t13.d<? super g> dVar) {
        super(2, dVar);
        this.f125121a = str;
        this.f125122b = p1Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new g(this.f125121a, this.f125122b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        float f14 = h.f125123a;
        p1<l0> p1Var = this.f125122b;
        String str = p1Var.getF182175a().f188878a.f157138b;
        String str2 = this.f125121a;
        if (!p005kotlin.jvm.internal.s.g(str, str2)) {
            int length = str2.length();
            p1Var.setValue(new l0(str2, og.a.l(length, length), (w0) null, 4, (p005kotlin.jvm.internal.j) null));
        }
        return Unit.INSTANCE;
    }
}

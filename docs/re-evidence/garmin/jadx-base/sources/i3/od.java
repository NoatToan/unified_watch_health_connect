package i3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "", "it", "", "<anonymous>", "(Lo53/b0;F)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "androidx.compose.material3.SliderKt$SliderImpl$drag$1$1", f = "Slider.kt", l = {}, m = "invokeSuspend")
public final class od extends v13.i implements e23.q<o53.b0, Float, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ud f89207a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public od(ud udVar, t13.d<? super od> dVar) {
        super(3, dVar);
        this.f89207a = udVar;
    }

    @Override // e23.q
    public final Object invoke(o53.b0 b0Var, Float f14, t13.d<? super Unit> dVar) {
        f14.floatValue();
        return new od(this.f89207a, dVar).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        this.f89207a.f89924o.invoke();
        return Unit.INSTANCE;
    }
}

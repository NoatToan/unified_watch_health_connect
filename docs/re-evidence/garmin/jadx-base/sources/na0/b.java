package na0;

import java.util.ArrayList;
import java.util.List;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.customization.cycling.wheel.BikeWheelCircumferenceEstimationScreenKt$BikeWheelCircumferenceEstimationScreenRoute$2$1", f = "BikeWheelCircumferenceEstimationScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class b extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f125110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f125111b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(j jVar, q qVar, t13.d<? super b> dVar) {
        super(2, dVar);
        this.f125110a = jVar;
        this.f125111b = qVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new b(this.f125110a, this.f125111b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        List<String> list = this.f125111b.f125172d;
        j jVar = this.f125110a;
        jVar.getClass();
        list.getClass();
        if (list.size() == 5) {
            p2 p2Var = jVar.f125131a;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, new ArrayList(list)));
        }
        return Unit.INSTANCE;
    }
}

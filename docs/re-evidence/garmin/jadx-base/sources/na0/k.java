package na0;

import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.e2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.customization.cycling.wheel.BikeWheelCircumferenceEstimationViewModel$onDigitEntered$2", f = "BikeWheelCircumferenceEstimationViewModel.kt", l = {46}, m = "invokeSuspend", v = 2)
public final class k extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f125142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f125143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f125144c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(j jVar, int i14, t13.d<? super k> dVar) {
        super(2, dVar);
        this.f125143b = jVar;
        this.f125144c = i14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new k(this.f125143b, this.f125144c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((k) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f125142a;
        if (i14 == 0) {
            o13.r.b(obj);
            e2 e2Var = this.f125143b.f125133c;
            Integer num = new Integer(this.f125144c + 1);
            this.f125142a = 1;
            if (e2Var.emit(num, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}

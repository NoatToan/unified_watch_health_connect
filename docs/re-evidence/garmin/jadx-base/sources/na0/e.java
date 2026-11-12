package na0;

import android.content.Context;
import android.widget.Toast;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.customization.cycling.wheel.BikeWheelCircumferenceEstimationScreenKt$BikeWheelCircumferenceEstimationScreenRoute$5$1", f = "BikeWheelCircumferenceEstimationScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class e extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f125118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f125119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f125120c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(q qVar, Context context, e23.a<Unit> aVar, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f125118a = qVar;
        this.f125119b = context;
        this.f125120c = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e(this.f125118a, this.f125119b, this.f125120c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        Integer num = this.f125118a.f125171c;
        if (num != null) {
            Toast.makeText(this.f125119b, num.intValue(), 0).show();
            this.f125120c.invoke();
        }
        return Unit.INSTANCE;
    }
}

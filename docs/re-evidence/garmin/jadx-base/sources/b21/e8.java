package b21;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionSettingsNavKt$nutritionSettingsGraph$1$9$1$3$1", f = "NutritionSettingsNav.kt", l = {}, m = "invokeSuspend", v = 2)
public final class e8 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q21.r f14644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u21.p f14645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f14646c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3.x3<u21.o> f14647d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e8(q21.r rVar, u21.p pVar, e23.a<Unit> aVar, p3.x3<u21.o> x3Var, t13.d<? super e8> dVar) {
        super(2, dVar);
        this.f14644a = rVar;
        this.f14645b = pVar;
        this.f14646c = aVar;
        this.f14647d = x3Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e8(this.f14644a, this.f14645b, this.f14646c, this.f14647d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e8) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        if (this.f14647d.getF182175a().f168051e) {
            this.f14644a.y4(R.string.generic_error_message);
            this.f14645b.x4();
            this.f14646c.invoke();
        }
        return Unit.INSTANCE;
    }
}

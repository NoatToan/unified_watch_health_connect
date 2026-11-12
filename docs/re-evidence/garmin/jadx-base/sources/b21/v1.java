package b21;

import android.content.Context;
import android.widget.Toast;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionReportsNavKt$nutritionReportsGraph$1$6$1$2$1", f = "NutritionReportsNav.kt", l = {}, m = "invokeSuspend", v = 2)
public final class v1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f15300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s11.e f15301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f15302c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3.x3<s11.d> f15303d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(Context context, s11.e eVar, e23.a<Unit> aVar, p3.x3<s11.d> x3Var, t13.d<? super v1> dVar) {
        super(2, dVar);
        this.f15300a = context;
        this.f15301b = eVar;
        this.f15302c = aVar;
        this.f15303d = x3Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new v1(this.f15300a, this.f15301b, this.f15302c, this.f15303d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((v1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        if (this.f15303d.getF182175a().f155891m) {
            Toast.makeText(this.f15300a, R.string.generic_error_message, 0).show();
            this.f15301b.y4();
            this.f15302c.invoke();
        }
        return Unit.INSTANCE;
    }
}

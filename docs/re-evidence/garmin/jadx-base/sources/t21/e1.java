package t21;

import android.content.Intent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.setup.screen.NutritionSetupStorageAndProcessingConsentScreenKt$NutritionSetupStorageAndProcessingConsentScreen$3$1", f = "NutritionSetupStorageAndProcessingConsentScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class e1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c.q<Intent, f.a> f161859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f161860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1<Boolean> f161861c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(c.q<Intent, f.a> qVar, Intent intent, p1<Boolean> p1Var, t13.d<? super e1> dVar) {
        super(2, dVar);
        this.f161859a = qVar;
        this.f161860b = intent;
        this.f161861c = p1Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e1(this.f161859a, this.f161860b, this.f161861c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        p1<Boolean> p1Var = this.f161861c;
        if (!p1Var.getF182175a().booleanValue()) {
            p1Var.setValue(Boolean.TRUE);
            this.f161859a.a(this.f161860b, null);
        }
        return Unit.INSTANCE;
    }
}

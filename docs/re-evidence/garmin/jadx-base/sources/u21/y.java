package u21;

import androidx.lifecycle.v1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.setup.viewmodel.MealSettingsViewModel$saveSettings$1", f = "MealSettingsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class y extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f168187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f168188b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(t tVar, boolean z14, t13.d<? super y> dVar) {
        super(2, dVar);
        this.f168187a = tVar;
        this.f168188b = z14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new y(this.f168187a, this.f168188b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((y) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        t tVar = this.f168187a;
        p2 p2Var = tVar.f168140j;
        do {
            value = p2Var.getValue();
        } while (!p2Var.b(value, s.a((s) value, false, null, false, null, null, null, null, false, false, false, false, false, null, 63487)));
        if (this.f168188b) {
            ge1.b.T(v1.a(tVar), null, null, new x(tVar, true, null), 3);
        }
        return Unit.INSTANCE;
    }
}

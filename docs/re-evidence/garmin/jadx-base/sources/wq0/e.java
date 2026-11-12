package wq0;

import androidx.lifecycle.v1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.insights.presentation.edit.EditInsightsScreenKt$EditInsightsScreen$2$1", f = "EditInsightsScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class e extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f186593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f186594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1<Boolean> f186595c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(l lVar, e23.a<Unit> aVar, p1<Boolean> p1Var, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f186593a = lVar;
        this.f186594b = aVar;
        this.f186595c = p1Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e(this.f186593a, this.f186594b, this.f186595c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        if (this.f186595c.getF182175a().booleanValue()) {
            l lVar = this.f186593a;
            if (lVar.x4()) {
                ge1.b.T(v1.a(lVar), null, null, new y(lVar, null), 3);
            } else {
                this.f186594b.invoke();
            }
        }
        return Unit.INSTANCE;
    }
}

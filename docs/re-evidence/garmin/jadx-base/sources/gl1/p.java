package gl1;

import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.x3;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.setup.presentation.RecordActivityNavigationKt$selectActivity$1$1$1", f = "RecordActivityNavigation.kt", l = {}, m = "invokeSuspend", v = 2)
public final class p extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hl1.n f77859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lc.v f77860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x3<Boolean> f77861c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(hl1.n nVar, lc.v vVar, x3<Boolean> x3Var, t13.d<? super p> dVar) {
        super(2, dVar);
        this.f77859a = nVar;
        this.f77860b = vVar;
        this.f77861c = x3Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new p(this.f77859a, this.f77860b, this.f77861c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((p) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        if (this.f77861c.getF182175a().booleanValue()) {
            this.f77859a.y4();
            this.f77860b.a().e("REFRESH_DATA");
        }
        return Unit.INSTANCE;
    }
}

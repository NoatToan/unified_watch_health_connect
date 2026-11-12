package wq0;

import com.google.firebase.messaging.Constants;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo53/b0;", "Le2/n;", Constants.MessagePayloadKeys.FROM, "to", "", "<anonymous>", "(Lo53/b0;Le2/n;Le2/n;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.insights.presentation.edit.EditInsightsScreenKt$EditInsightsScreen$6$reorderableLazyListState$1$1", f = "EditInsightsScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class f extends v13.i implements e23.r<o53.b0, e2.n, e2.n, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ e2.n f186596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ e2.n f186597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f186598c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(l lVar, t13.d<? super f> dVar) {
        super(4, dVar);
        this.f186598c = lVar;
    }

    @Override // e23.r
    public final Object invoke(o53.b0 b0Var, e2.n nVar, e2.n nVar2, t13.d<? super Unit> dVar) {
        f fVar = new f(this.f186598c, dVar);
        fVar.f186596a = nVar;
        fVar.f186597b = nVar2;
        return fVar.invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        e2.n nVar = this.f186596a;
        e2.n nVar2 = this.f186597b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        this.f186598c.y4(nVar.getF68148a() - 1, nVar2.getF68148a() - 1);
        return Unit.INSTANCE;
    }
}

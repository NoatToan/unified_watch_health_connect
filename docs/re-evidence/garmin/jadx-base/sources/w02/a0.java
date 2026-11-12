package w02;

import com.google.firebase.messaging.Constants;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo53/b0;", "Le2/n;", Constants.MessagePayloadKeys.FROM, "to", "", "<anonymous>", "(Lo53/b0;Le2/n;Le2/n;)Z"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.ui.reorderable.ReorderableLazyListStateKt$rememberReorderableLazyListState$1$1", f = "ReorderableLazyListState.kt", l = {}, m = "invokeSuspend", v = 2)
public final class a0 extends v13.i implements e23.r<o53.b0, e2.n, e2.n, t13.d<? super Boolean>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ e2.n f181055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ e2.n f181056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.q<Object, Object, Boolean, Unit> f181057c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a0(e23.q<Object, Object, ? super Boolean, Unit> qVar, t13.d<? super a0> dVar) {
        super(4, dVar);
        this.f181057c = qVar;
    }

    @Override // e23.r
    public final Object invoke(o53.b0 b0Var, e2.n nVar, e2.n nVar2, t13.d<? super Boolean> dVar) {
        a0 a0Var = new a0(this.f181057c, dVar);
        a0Var.f181055a = nVar;
        a0Var.f181056b = nVar2;
        a0Var.invokeSuspend(Unit.INSTANCE);
        return Boolean.FALSE;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        e2.n nVar = this.f181055a;
        e2.n nVar2 = this.f181056b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        this.f181057c.invoke(nVar.getKey(), nVar2.getKey(), Boolean.valueOf(nVar.getIndex() > nVar2.getIndex()));
        return Boolean.FALSE;
    }
}

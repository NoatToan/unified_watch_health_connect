package w02;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.ui.reorderable.ReorderableLazyListState$moveDraggingItemToEnd$job$1", f = "ReorderableLazyListState.kt", l = {396}, m = "invokeSuspend", v = 2)
public final class t extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f181142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f181143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e2.n f181144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e2.n f181145d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(r rVar, e2.n nVar, e2.n nVar2, t13.d<? super t> dVar) {
        super(2, dVar);
        this.f181143b = rVar;
        this.f181144c = nVar;
        this.f181145d = nVar2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new t(this.f181143b, this.f181144c, this.f181145d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((t) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f181142a;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f181142a = 1;
            if (r.b(this.f181143b, this.f181144c, this.f181145d, this) == aVar) {
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

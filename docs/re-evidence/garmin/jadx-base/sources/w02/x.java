package w02;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.ui.reorderable.ReorderableLazyListState$onDrag$isScrollingStarted$2", f = "ReorderableLazyListState.kt", l = {294}, m = "invokeSuspend", v = 2)
public final class x extends v13.i implements e23.l<t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f181160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f181161b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(r rVar, t13.d<? super x> dVar) {
        super(1, dVar);
        this.f181161b = rVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new x(this.f181161b, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super Unit> dVar) {
        return ((x) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f181160a;
        if (i14 == 0) {
            o13.r.b(obj);
            c0.b bVar = c0.b.BACKWARD;
            this.f181160a = 1;
            if (r.a(this.f181161b, bVar, this) == aVar) {
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

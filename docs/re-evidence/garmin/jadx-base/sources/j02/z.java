package j02;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.ui.composable.draggable.list.ReorderableLazyCollectionState$onDrag$isScrollingStarted$4", f = "ReorderableLazyCollection.kt", l = {414}, m = "invokeSuspend", v = 2)
public final class z extends v13.i implements e23.l<t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f96174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s<Object> f96175b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(s<Object> sVar, t13.d<? super z> dVar) {
        super(1, dVar);
        this.f96175b = sVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new z(this.f96175b, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super Unit> dVar) {
        return ((z) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f96174a;
        if (i14 == 0) {
            o13.r.b(obj);
            j0.b bVar = j0.b.FORWARD;
            this.f96174a = 1;
            if (s.a(this.f96175b, bVar, this) == aVar) {
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

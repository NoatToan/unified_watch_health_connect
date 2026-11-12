package w02;

import okhttp3.internal.http.StatusLine;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.ui.reorderable.ReorderableLazyListState$onDrag$isScrollingStarted$4", f = "ReorderableLazyListState.kt", l = {StatusLine.HTTP_TEMP_REDIRECT}, m = "invokeSuspend", v = 2)
public final class y extends v13.i implements e23.l<t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f181162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f181163b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(r rVar, t13.d<? super y> dVar) {
        super(1, dVar);
        this.f181163b = rVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new y(this.f181163b, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super Unit> dVar) {
        return ((y) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f181162a;
        if (i14 == 0) {
            o13.r.b(obj);
            c0.b bVar = c0.b.FORWARD;
            this.f181162a = 1;
            if (r.a(this.f181163b, bVar, this) == aVar) {
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

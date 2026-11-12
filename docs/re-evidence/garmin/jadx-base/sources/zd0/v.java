package zd0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00028\u0000H\n"}, d2 = {"T", "Lzd0/c;", "connectionState", "value", "Lo13/q;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.domain.InterruptOnDeviceDisconnectedUseCase$invoke$1", f = "InterruptOnDeviceDisconnectedUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class v extends v13.i implements e23.q<c, Object, t13.d<? super o13.q<Object>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ c f204180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f204181b;

    public v(t13.d<? super v> dVar) {
        super(3, dVar);
    }

    @Override // e23.q
    public final Object invoke(c cVar, Object obj, t13.d<? super o13.q<Object>> dVar) {
        v vVar = new v(dVar);
        vVar.f204180a = cVar;
        vVar.f204181b = obj;
        return vVar.invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        c cVar = this.f204180a;
        Object bVar = this.f204181b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        if (cVar instanceof c.b) {
            int i14 = o13.q.f128596b;
            bVar = new o13.q.b(new IllegalStateException("Device disconnected"));
        } else {
            int i15 = o13.q.f128596b;
        }
        return o13.q.a(bVar);
    }
}

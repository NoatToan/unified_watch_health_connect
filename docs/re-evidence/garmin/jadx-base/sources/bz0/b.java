package bz0;

import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.network.di.NetworkDI$createGCHttpClient$1", f = "NetworkDI.kt", l = {}, m = "invokeSuspend", v = 2)
public final class b extends v13.i implements e23.l<t13.d<? super String>, Object> {
    public b(t13.d<? super b> dVar) {
        super(1, dVar);
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new b(dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super String> dVar) {
        return new b(dVar).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        o.f22274a.getClass();
        return o.h().g();
    }
}

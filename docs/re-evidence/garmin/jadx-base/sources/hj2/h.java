package hj2;

import e23.p;
import o13.r;
import o53.b0;
import okhttp3.OkHttpClient;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lc83/b0;", "<anonymous>", "(Lo53/b0;)Lc83/b0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.customermanagementlib.data.source.network.NetworkServiceFactory$createLoqateService$2", f = "NetworkServiceFactory.kt", l = {}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements p<b0, t13.d<? super c83.b0>, Object> {
    public h(t13.d<? super h> dVar) {
        super(2, dVar);
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h(dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super c83.b0> dVar) {
        return new h(dVar).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        i iVar = i.f84029a;
        iVar.getClass();
        OkHttpClient okHttpClientB = i.b(iVar, new c(null, c.a.NO_HEADER));
        if (okHttpClientB != null) {
            return i.a(iVar, okHttpClientB, "https://api.addressy.com");
        }
        vb.h.z("Can not make loqate calls without configuring it");
        return null;
    }
}

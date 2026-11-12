package hj2;

import d53.w;
import e23.p;
import o13.r;
import o53.b0;
import okhttp3.OkHttpClient;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lc83/b0;", "<anonymous>", "(Lo53/b0;)Lc83/b0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.customermanagementlib.data.source.network.NetworkServiceFactory$createCustomerManagementGarminService$2", f = "NetworkServiceFactory.kt", l = {}, m = "invokeSuspend", v = 2)
public final class f extends v13.i implements p<b0, t13.d<? super c83.b0>, Object> {
    public f(t13.d<? super f> dVar) {
        super(2, dVar);
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new f(dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super c83.b0> dVar) {
        return new f(dVar).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        i iVar = i.f84029a;
        iVar.getClass();
        i.f84032d = i.b(iVar, new c(null, c.a.NO_HEADER));
        ij2.a aVar2 = i.f84033e;
        String strH = aVar2.h();
        if (w.z(strH, zi2.a.CHINA.f204881b, false) || w.z(strH, zi2.a.CHINA_TEST.f204881b, false)) {
            i.f84030b.warn("IT endpoints can have different behavior on CDC, including but not limited to additional phone number validations that are currently unhandled by CustomerManagement.");
        }
        OkHttpClient okHttpClient = i.f84032d;
        if (okHttpClient == null) {
            vb.h.z("Can not make customer business calls to Garmin service without configuring it");
            return null;
        }
        return i.a(iVar, okHttpClient, "https://" + aVar2.h());
    }
}

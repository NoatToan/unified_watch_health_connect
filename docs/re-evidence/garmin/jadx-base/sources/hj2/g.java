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
@v13.e(c = "com.garmin.customermanagementlib.data.source.network.NetworkServiceFactory$createCustomerManagementITService$2", f = "NetworkServiceFactory.kt", l = {33}, m = "invokeSuspend", v = 2)
public final class g extends v13.i implements p<b0, t13.d<? super c83.b0>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i f84027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f84028b;

    public g(t13.d<? super g> dVar) {
        super(2, dVar);
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new g(dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super c83.b0> dVar) {
        return new g(dVar).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        i iVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f84028b;
        if (i14 == 0) {
            r.b(obj);
            i iVar2 = i.f84029a;
            ij2.a aVar2 = i.f84033e;
            this.f84027a = iVar2;
            this.f84028b = 1;
            Object objE = aVar2.e(this);
            if (objE == aVar) {
                return aVar;
            }
            iVar = iVar2;
            obj = objE;
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            iVar = this.f84027a;
            r.b(obj);
        }
        String str = (String) obj;
        if (str == null) {
            vb.h.z("Can not make customer business calls to IT service without IT Access Token");
            return null;
        }
        i iVar3 = i.f84029a;
        iVar.getClass();
        i.f84032d = i.b(iVar, new c(str, c.a.HEADER));
        ij2.a aVar3 = i.f84033e;
        String strI = aVar3.i();
        if (w.z(strI, d.CHINA.f84026a, false) || w.z(strI, d.CHINA_TEST.f84026a, false)) {
            i.f84029a.getClass();
            i.f84030b.warn("IT endpoints can have different behavior on CDC, including but not limited to additional phone number validations that are currently unhandled by CustomerManagement.");
        }
        i iVar4 = i.f84029a;
        OkHttpClient okHttpClient = i.f84032d;
        if (okHttpClient != null) {
            return i.a(iVar4, okHttpClient, aVar3.i());
        }
        vb.h.z("Can not make customer business calls to IT service without configuring it");
        return null;
    }
}

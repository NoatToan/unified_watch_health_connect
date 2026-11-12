package u10;

import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.device.ciq.http.requests.oauth.ConnectIQOAuthRequest;
import com.garmin.proto.generated.GDIConnectIQHTTPProto;
import e23.p;
import java.util.HashMap;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.connectiq.requests.oauth.ConnectIQOAuthViewModel$processResultUrl$1", f = "ConnectIQOAuthViewModel.kt", l = {36, 40}, m = "invokeSuspend", v = 2)
public final class j extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h f167753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f167754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f167755c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f167756d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ConnectIQOAuthRequest f167757e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(i iVar, String str, ConnectIQOAuthRequest connectIQOAuthRequest, t13.d<? super j> dVar) {
        super(2, dVar);
        this.f167755c = iVar;
        this.f167756d = str;
        this.f167757e = connectIQOAuthRequest;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new j(this.f167755c, this.f167756d, this.f167757e, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((j) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object objB;
        h hVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f167754b;
        ConnectIQOAuthRequest connectIQOAuthRequest = this.f167757e;
        i iVar = this.f167755c;
        if (i14 == 0) {
            r.b(obj);
            iVar.f167752b.j(g3.a.c(g3.f35298f));
            b bVar = iVar.f167751a;
            this.f167754b = 1;
            bVar.getClass();
            int resultType = connectIQOAuthRequest.getResultType();
            String str = this.f167756d;
            objB = resultType == 1 ? bVar.b(str, connectIQOAuthRequest, this) : bVar.a(str, connectIQOAuthRequest, this);
            if (objB != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            r.b(obj);
            objB = obj;
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hVar = this.f167753a;
            r.b(obj);
        }
        y0<g3<h>> y0Var = iVar.f167752b;
        g3.f35298f.getClass();
        y0Var.j(g3.a.d(hVar));
        return Unit.INSTANCE;
        h hVar2 = (h) objB;
        if (hVar2.f167748a == GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequest.ResponseStatus.OK) {
            b bVar2 = iVar.f167751a;
            long deviceId = connectIQOAuthRequest.getDeviceId();
            byte[] appId = connectIQOAuthRequest.getAppId();
            GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequest.ResponseStatus responseStatus = hVar2.f167748a;
            int i15 = hVar2.f167749b;
            HashMap<String, String> map = hVar2.f167750c;
            this.f167753a = hVar2;
            this.f167754b = 2;
            if (bVar2.c(deviceId, appId, responseStatus, i15, map, this) != aVar) {
                hVar = hVar2;
                y0<g3<h>> y0Var2 = iVar.f167752b;
                g3.f35298f.getClass();
                y0Var2.j(g3.a.d(hVar));
            }
            return aVar;
        }
        iVar.f167752b.j(g3.a.a(g3.f35298f, null, null, hVar2, null, 11));
        return Unit.INSTANCE;
    }
}

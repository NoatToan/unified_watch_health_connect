package u10;

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
@v13.e(c = "com.garmin.android.apps.connectmobile.connectiq.requests.oauth.ConnectIQOAuthViewModel$respondErrorToDevice$1", f = "ConnectIQOAuthViewModel.kt", l = {63}, m = "invokeSuspend", v = 2)
public final class k extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f167758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f167759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ConnectIQOAuthRequest f167760c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f167761d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(i iVar, ConnectIQOAuthRequest connectIQOAuthRequest, h hVar, t13.d<? super k> dVar) {
        super(2, dVar);
        this.f167759b = iVar;
        this.f167760c = connectIQOAuthRequest;
        this.f167761d = hVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new k(this.f167759b, this.f167760c, this.f167761d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((k) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f167758a;
        if (i14 == 0) {
            r.b(obj);
            b bVar = this.f167759b.f167751a;
            ConnectIQOAuthRequest connectIQOAuthRequest = this.f167760c;
            long deviceId = connectIQOAuthRequest.getDeviceId();
            byte[] appId = connectIQOAuthRequest.getAppId();
            h hVar = this.f167761d;
            GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequest.ResponseStatus responseStatus = hVar.f167748a;
            int i15 = hVar.f167749b;
            HashMap<String, String> map = hVar.f167750c;
            this.f167758a = 1;
            if (bVar.c(deviceId, appId, responseStatus, i15, map, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}

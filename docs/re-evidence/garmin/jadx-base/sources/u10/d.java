package u10;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.proto.generated.GDIConnectIQHTTPProto;
import e23.p;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.p0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.connectiq.requests.oauth.ConnectIQOAuthRepo$getEncodedResult$2", f = "ConnectIQOAuthRepo.kt", l = {}, m = "invokeSuspend", v = 2)
public final class d extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f167733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f167734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p0 f167735c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String str, p0 p0Var, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f167734b = str;
        this.f167735c = p0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        d dVar2 = new d(this.f167734b, this.f167735c, dVar);
        dVar2.f167733a = obj;
        return dVar2;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        HttpURLConnection httpURLConnection;
        p0 p0Var = this.f167735c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        URLConnection uRLConnectionOpenConnection = null;
        try {
            try {
                try {
                    uRLConnectionOpenConnection = new URL(this.f167734b).openConnection();
                    uRLConnectionOpenConnection.connect();
                    if (uRLConnectionOpenConnection instanceof HttpURLConnection) {
                        p0Var.f105807a = ((HttpURLConnection) uRLConnectionOpenConnection).getResponseCode();
                    }
                    if (uRLConnectionOpenConnection instanceof HttpURLConnection) {
                        httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                        httpURLConnection.disconnect();
                    }
                } catch (Exception e4) {
                    String string = e4.toString();
                    i2.a aVar2 = i2.f36769a;
                    a2 a2Var = a2.GENERAL;
                    aVar2.getClass();
                    i2.a.f(a2Var, "ConnectIQOAuthRepo", string);
                    p0Var.f105807a = GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequest.ResponseStatus.WEB_REQUEST_ERROR.getNumber();
                    if (uRLConnectionOpenConnection instanceof HttpURLConnection) {
                        httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                    }
                }
            } catch (Exception e14) {
                String string2 = e14.toString();
                i2.a aVar3 = i2.f36769a;
                a2 a2Var2 = a2.GENERAL;
                aVar3.getClass();
                i2.a.f(a2Var2, "ConnectIQOAuthRepo", string2);
            }
            return Unit.INSTANCE;
        } catch (Throwable th3) {
            try {
                if (uRLConnectionOpenConnection instanceof HttpURLConnection) {
                    ((HttpURLConnection) uRLConnectionOpenConnection).disconnect();
                }
            } catch (Exception e15) {
                String string3 = e15.toString();
                i2.a aVar4 = i2.f36769a;
                a2 a2Var3 = a2.GENERAL;
                aVar4.getClass();
                i2.a.f(a2Var3, "ConnectIQOAuthRepo", string3);
            }
            throw th3;
        }
    }
}

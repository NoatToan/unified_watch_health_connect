package ui2;

import com.google.common.net.HttpHeaders;
import com.google.firebase.perf.FirebasePerformance;
import e23.p;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lui2/f;", "Lri2/a;", "<anonymous>", "(Lo53/b0;)Lui2/f;"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.auth.cmc.data.network.GCChildRegistrationRequest$perform$1", f = "GCChildRegistrationRequest.kt", l = {}, m = "invokeSuspend")
public final class b extends i implements p<b0, t13.d<? super f<? extends ri2.a>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f171430a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, t13.d<? super b> dVar) {
        super(2, dVar);
        this.f171430a = cVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new b(this.f171430a, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super f<? extends ri2.a>> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        c cVar = this.f171430a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        try {
            URL url = new URL(cVar.f171432b.f177720b + "/userprofile-service/userprofile/child-registration/" + cVar.f171431a);
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            uRLConnectionOpenConnection.getClass();
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            cVar.f171435e = httpURLConnection;
            re2.b.f152215a.getClass();
            httpURLConnection.setRequestProperty(HttpHeaders.USER_AGENT, (String) re2.b.f152225k.getValue());
            httpURLConnection.setRequestProperty("X-Garmin-User-Agent", re2.b.k());
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setRequestMethod(FirebasePerformance.HttpMethod.POST);
            httpURLConnection.setRequestProperty(HttpHeaders.AUTHORIZATION, "Bearer ".concat(cVar.f171433c));
            httpURLConnection.connect();
            return c.a(cVar, url, oc.b.g(httpURLConnection));
        } catch (Exception e4) {
            return new f.a(e4);
        } finally {
            HttpURLConnection httpURLConnection2 = cVar.f171435e;
            if (httpURLConnection2 != null) {
                httpURLConnection2.disconnect();
            }
        }
    }
}

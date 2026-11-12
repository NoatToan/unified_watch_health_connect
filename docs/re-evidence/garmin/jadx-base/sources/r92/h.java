package r92;

import com.google.common.net.HttpHeaders;
import d53.u;
import e23.p;
import o13.r;
import o53.b0;
import okhttp3.Authenticator;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p92.o;
import p92.y;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lr92/h;", "Lokhttp3/Authenticator;", "<init>", "()V", "a", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h implements Authenticator {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Ljava/lang/String;"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "com.garmin.android.consent.data.api.ITTokenAuthenticator$authenticate$refreshedToken$1", f = "ITTokenAuthenticator.kt", l = {27}, m = "invokeSuspend")
    public static final class b extends v13.i implements p<b0, t13.d<? super String>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f151446a;

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super String> dVar) {
            return new b(dVar).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f151446a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            o.f136619a.getClass();
            o.l();
            this.f151446a = 1;
            Object objS = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).s(this);
            return objS == aVar ? aVar : objS;
        }
    }

    static {
        new a(null);
    }

    @Override // okhttp3.Authenticator
    public final Request authenticate(Route route, Response response) {
        response.getClass();
        HttpUrl httpUrlUrl = response.request().url();
        String str = httpUrlUrl + " call failed with " + response.code() + " error; token = " + response.request().header(HttpHeaders.AUTHORIZATION);
        y.f136664a.getClass();
        y.a.c("ITTokenAuthenticator", str);
        String str2 = (String) ge1.b.W(t13.h.f161748a, new b(null));
        String strN = fb1.c.n("Bearer ", str2);
        if (str2.length() == 0) {
            y.a.c("ITTokenAuthenticator", "Give up, we couldn't get a valid token for " + httpUrlUrl);
            return null;
        }
        if (u.q(response.request().header(HttpHeaders.AUTHORIZATION), strN, false)) {
            y.a.c("ITTokenAuthenticator", "Give up, we already tried with this token for " + httpUrlUrl);
            return null;
        }
        Response responsePriorResponse = response.priorResponse();
        int i14 = 1;
        while (responsePriorResponse != null) {
            responsePriorResponse = responsePriorResponse.priorResponse();
            i14++;
        }
        if (i14 < 3) {
            return response.request().newBuilder().removeHeader(HttpHeaders.AUTHORIZATION).addHeader(HttpHeaders.AUTHORIZATION, strN).build();
        }
        y.f136664a.getClass();
        y.a.c("ITTokenAuthenticator", "Give up, token refresh failed 3 times for " + httpUrlUrl);
        return null;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lr92/h$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "AUTHORIZATION_HEADER", "", "MAX_FAIL_COUNT", "I", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

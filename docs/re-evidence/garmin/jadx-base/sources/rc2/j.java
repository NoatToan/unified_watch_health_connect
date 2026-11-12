package rc2;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.google.common.net.HttpHeaders;
import com.google.firebase.perf.FirebasePerformance;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import o53.s0;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u000eB/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lrc2/j;", "T", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lorg/slf4j/Logger;", "logger", "", "theRequestMethod", "Ljava/net/URL;", "url", "thisAppITClientIdLoggingOnly", "<init>", "(Landroid/content/Context;Lorg/slf4j/Logger;Ljava/lang/String;Ljava/net/URL;Ljava/lang/String;)V", "a", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class j<T> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static String f151914f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Logger f151915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f151916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final URL f151917c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f151918d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public HttpURLConnection f151919e;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lo53/b0;", "Lwc2/a;", "<anonymous>", "(Lo53/b0;)Lwc2/a;"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.android.lib.networking.authentication.itapi.ITAbstractHttpRequest$doRun$2", f = "ITAbstractHttpRequest.kt", l = {88}, m = "invokeSuspend")
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super wc2.a<? extends T>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f151920a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j<T> f151921b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(j<T> jVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f151921b = jVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f151921b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, Object obj) {
            return ((b) create(b0Var, (t13.d) obj)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f151920a;
            j<T> jVar = this.f151921b;
            try {
                if (i14 == 0) {
                    o13.r.b(obj);
                    URLConnection uRLConnectionOpenConnection = jVar.f151917c.openConnection();
                    uRLConnectionOpenConnection.getClass();
                    HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                    jVar.f151919e = httpURLConnection;
                    Logger logger = jVar.f151915a;
                    String str = jVar.f151916b;
                    logger.debug(str + StringUtils.SPACE + httpURLConnection.getURL());
                    httpURLConnection.setUseCaches(false);
                    httpURLConnection.setRequestMethod(str);
                    httpURLConnection.setConnectTimeout(10000);
                    httpURLConnection.setReadTimeout(10000);
                    httpURLConnection.setDoInput(true);
                    if (str.equals(FirebasePerformance.HttpMethod.POST)) {
                        httpURLConnection.setDoOutput(true);
                    }
                    String str2 = j.f151914f;
                    if (str2 == null) {
                        str2 = "UnknownUserAgent";
                    }
                    httpURLConnection.setRequestProperty(HttpHeaders.USER_AGENT, str2);
                    httpURLConnection.setRequestProperty(HttpHeaders.CONNECTION, HttpHeaders.KEEP_ALIVE);
                    httpURLConnection.setRequestProperty(HttpHeaders.CACHE_CONTROL, "no-cache");
                    httpURLConnection.setRequestProperty("x-garmin-client-id", jVar.f151918d);
                    this.f151920a = 1;
                    obj = jVar.c(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                wc2.a aVar2 = (wc2.a) obj;
                HttpURLConnection httpURLConnection2 = jVar.f151919e;
                if (httpURLConnection2 != null) {
                    try {
                        httpURLConnection2.disconnect();
                    } catch (Exception unused) {
                    }
                }
                return aVar2;
            } catch (Throwable th3) {
                HttpURLConnection httpURLConnection3 = jVar.f151919e;
                if (httpURLConnection3 != null) {
                    try {
                        httpURLConnection3.disconnect();
                    } catch (Exception unused2) {
                    }
                }
                throw th3;
            }
        }
    }

    static {
        new a(null);
    }

    public j(Context context, Logger logger, String str, URL url, String str2) {
        context.getClass();
        logger.getClass();
        str.getClass();
        url.getClass();
        str2.getClass();
        this.f151915a = logger;
        this.f151916b = str;
        this.f151917c = url;
        this.f151918d = str2;
        if (f151914f == null) {
            f151914f = wc2.c.b(context, "networking-core", "5.1.1");
        }
    }

    public final Integer a() {
        HttpURLConnection httpURLConnection = this.f151919e;
        if (httpURLConnection != null) {
            return Integer.valueOf(oc.b.g(httpURLConnection));
        }
        return null;
    }

    public final Object b(t13.d<? super wc2.a<? extends T>> dVar) {
        x53.c cVar = s0.f129406a;
        return ge1.b.e0(x53.b.f189152a, new b(this, null), dVar);
    }

    public abstract Object c(t13.d<? super wc2.a<? extends T>> dVar);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lrc2/j$a;", "", "<init>", "()V", "", "userAgent", "Ljava/lang/String;", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

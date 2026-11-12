package qc2;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.google.common.net.HttpHeaders;
import com.google.firebase.perf.FirebasePerformance;
import d53.u;
import d53.w;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import o53.b0;
import o53.s0;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0012BS\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lqc2/k;", "T", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lorg/slf4j/Logger;", "logger", "Lve2/e;", "environment", "", "theRequestMethod", "urlPath", "di2AccessToken", "Ldd2/c;", "gc1Credential", "wwwFormUrlEncodedPostBody", "<init>", "(Landroid/content/Context;Lorg/slf4j/Logger;Lve2/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ldd2/c;Ljava/lang/String;)V", "a", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class k<T> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static String f144413h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static String f144414i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Logger f144415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f144416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f144417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final dd2.c f144418d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f144419e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final URL f144420f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public HttpURLConnection f144421g;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lo53/b0;", "Lwc2/a;", "<anonymous>", "(Lo53/b0;)Lwc2/a;"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.android.lib.networking.authentication.gcapi.GCAbstractHttpRequest$doRun$2", f = "GCAbstractHttpRequest.kt", l = {114}, m = "invokeSuspend")
    public static final class b extends v13.i implements e23.p<b0, t13.d<? super wc2.a<? extends T>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public k f144422a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public HttpURLConnection f144423b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f144424c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ k<T> f144425d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(k<T> kVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f144425d = kVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f144425d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, Object obj) {
            return ((b) create(b0Var, (t13.d) obj)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            HttpURLConnection httpURLConnection;
            k<T> kVar;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f144424c;
            k<T> kVar2 = this.f144425d;
            try {
                if (i14 == 0) {
                    o13.r.b(obj);
                    URLConnection uRLConnectionOpenConnection = kVar2.f144420f.openConnection();
                    uRLConnectionOpenConnection.getClass();
                    HttpURLConnection httpURLConnection2 = (HttpURLConnection) uRLConnectionOpenConnection;
                    kVar2.f144421g = httpURLConnection2;
                    Logger logger = kVar2.f144415a;
                    String str = kVar2.f144416b;
                    logger.debug(str + StringUtils.SPACE + httpURLConnection2.getURL());
                    httpURLConnection2.setUseCaches(false);
                    httpURLConnection2.setConnectTimeout(10000);
                    httpURLConnection2.setReadTimeout(10000);
                    httpURLConnection2.setDoInput(true);
                    httpURLConnection2.setRequestMethod(str);
                    if (p005kotlin.jvm.internal.s.g(str, FirebasePerformance.HttpMethod.POST)) {
                        httpURLConnection2.setDoOutput(true);
                        httpURLConnection2.setRequestProperty(HttpHeaders.CONTENT_TYPE, "application/x-www-form-urlencoded");
                    }
                    httpURLConnection2.setRequestProperty(HttpHeaders.USER_AGENT, k.f144413h);
                    httpURLConnection2.setRequestProperty("X-Garmin-User-Agent", k.f144414i);
                    httpURLConnection2.setRequestProperty(HttpHeaders.CONNECTION, HttpHeaders.KEEP_ALIVE);
                    httpURLConnection2.setRequestProperty(HttpHeaders.CACHE_CONTROL, "no-cache");
                    this.f144422a = kVar2;
                    this.f144423b = httpURLConnection2;
                    this.f144424c = 1;
                    Object objB = kVar2.b(this);
                    if (objB == aVar) {
                        return aVar;
                    }
                    httpURLConnection = httpURLConnection2;
                    obj = objB;
                    kVar = kVar2;
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    HttpURLConnection httpURLConnection3 = this.f144423b;
                    kVar = this.f144422a;
                    o13.r.b(obj);
                    httpURLConnection = httpURLConnection3;
                }
                nc2.e eVar = (nc2.e) obj;
                String str2 = eVar.f125378a;
                if (str2 != null) {
                    httpURLConnection.setRequestProperty("app-validation", str2);
                } else {
                    String str3 = eVar.f125379b;
                    if (str3 != null) {
                        httpURLConnection.setRequestProperty("app-validation-error", str3);
                    }
                }
                String str4 = kVar.f144417c;
                String str5 = kVar.f144419e;
                if (str4 != null) {
                    httpURLConnection.setRequestProperty(HttpHeaders.AUTHORIZATION, "Bearer ".concat(str4));
                } else {
                    dd2.c cVar = kVar.f144418d;
                    cVar.getClass();
                    httpURLConnection.getClass();
                    xy2.b.J(httpURLConnection, cVar.f59212a, cVar.f59213b, cVar.f59214c, cVar.f59215d, str5);
                }
                if (str5 == null || w.J(str5)) {
                    httpURLConnection.connect();
                } else {
                    byte[] bArrO = u.o(str5);
                    httpURLConnection.setFixedLengthStreamingMode(bArrO.length);
                    httpURLConnection.getOutputStream().write(bArrO);
                }
                wc2.a<T> aVarC = kVar.c();
                HttpURLConnection httpURLConnection4 = kVar2.f144421g;
                if (httpURLConnection4 != null) {
                    try {
                        httpURLConnection4.disconnect();
                    } catch (Exception unused) {
                    }
                }
                return aVarC;
            } catch (Throwable th3) {
                HttpURLConnection httpURLConnection5 = kVar2.f144421g;
                if (httpURLConnection5 == null) {
                    throw th3;
                }
                try {
                    httpURLConnection5.disconnect();
                    throw th3;
                } catch (Exception unused2) {
                    throw th3;
                }
            }
        }
    }

    static {
        new a(null);
    }

    public k(Context context, Logger logger, ve2.e eVar, String str, String str2, String str3, dd2.c cVar, String str4) {
        context.getClass();
        logger.getClass();
        eVar.getClass();
        str.getClass();
        str2.getClass();
        this.f144415a = logger;
        this.f144416b = str;
        this.f144417c = str3;
        this.f144418d = cVar;
        this.f144419e = str4;
        this.f144420f = new URL(tn.k.g(eVar.f177720b, str2));
        if (str3 == null && cVar == null) {
            vb.h.s("'oAuth2DIAccessToken' and 'oAuth1GCCredential' are null, at least one must be provided.");
            throw null;
        }
        if (f144413h == null) {
            f144413h = wc2.c.b(context, "networking-core", "5.1.1");
        }
        if (f144414i == null) {
            f144414i = wc2.c.a(context);
        }
    }

    public final Object a(t13.d<? super wc2.a<? extends T>> dVar) {
        x53.c cVar = s0.f129406a;
        return ge1.b.e0(x53.b.f189152a, new b(this, null), dVar);
    }

    public abstract Object b(b bVar);

    public abstract wc2.a<T> c();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lqc2/k$a;", "", "<init>", "()V", "", "userAgent", "Ljava/lang/String;", "xGarminUserAgent", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ k(Context context, Logger logger, ve2.e eVar, String str, String str2, String str3, dd2.c cVar, String str4, int i14, p005kotlin.jvm.internal.j jVar) {
        this(context, logger, eVar, str, str2, (i14 & 32) != 0 ? null : str3, (i14 & 64) != 0 ? null : cVar, (i14 & 128) != 0 ? null : str4);
    }
}

package id2;

import com.google.android.exoplayer2.util.MimeTypes;
import com.mapbox.common.HttpHeaders;
import com.mapbox.maps.extension.compose.style.standard.BaseStyleConfigurationState;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import o13.p;
import okhttp3.Connection;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.apache.commons.text.lookup.StringLookupFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.u;
import p13.w;
import p13.x;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\fB)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\nB\u001d\b\u0016\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\u000b¨\u0006\r"}, d2 = {"Lid2/f;", "Lokhttp3/Interceptor;", "", "Ljd2/a;", "logFields", "Lkotlin/Function1;", "", "", "logger", "<init>", "(Ljava/util/Set;Le23/l;)V", "(Le23/l;)V", "a", "networking-okhttp_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f implements Interceptor {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f93041c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Set<jd2.a> f93042d = u.m0(new jd2.a[]{jd2.a.REQUEST, jd2.a.REQUEST_BODY, jd2.a.RESPONSE, jd2.a.RESPONSE_BODY});

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Charset f93043e = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Set<String> f93044f = u.m0(new String[]{"appsLibraryExternalServices", "appsLibraryProcessServices", "appsLibraryBusinessServices"});

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.l<String, Unit> f93045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArraySet<jd2.a> f93046b;

    /* JADX WARN: Multi-variable type inference failed */
    public f(Set<? extends jd2.a> set, e23.l<? super String, Unit> lVar) {
        set.getClass();
        lVar.getClass();
        this.f93045a = lVar;
        this.f93046b = new CopyOnWriteArraySet<>(set);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static Boolean a(MediaType mediaType) {
        if (mediaType == null) {
            return null;
        }
        String strType = mediaType.type();
        switch (strType.hashCode()) {
            case -1206127444:
                if (strType.equals("multipart")) {
                    return Boolean.FALSE;
                }
                return null;
            case 3148879:
                if (!strType.equals(BaseStyleConfigurationState.CONFIG_FONT)) {
                    return null;
                }
                break;
            case 3556653:
                if (strType.equals("text") && x.k("css", "html", "javascript", "plain", StringLookupFactory.KEY_XML).contains(mediaType.subtype())) {
                    return Boolean.TRUE;
                }
                return null;
            case 93166550:
                if (!strType.equals(MimeTypes.BASE_TYPE_AUDIO)) {
                    return null;
                }
                break;
            case 100313435:
                if (!strType.equals("image")) {
                    return null;
                }
                break;
            case 112202875:
                if (!strType.equals(MimeTypes.BASE_TYPE_VIDEO)) {
                    return null;
                }
                break;
            case 1554253136:
                if (!strType.equals(MimeTypes.BASE_TYPE_APPLICATION)) {
                    return null;
                }
                if (x.k("json", StringLookupFactory.KEY_XML).contains(mediaType.subtype())) {
                    return Boolean.TRUE;
                }
                if (w.c("octet-stream").contains(mediaType.subtype())) {
                    return Boolean.FALSE;
                }
                return null;
            default:
                return null;
        }
        return Boolean.FALSE;
    }

    public static boolean b(w63.e eVar) {
        try {
            w63.e eVar2 = new w63.e();
            eVar.f(0L, eVar2, Math.min(64L, eVar.f183349b));
            for (int i14 = 0; i14 < 16 && !eVar2.F1(); i14++) {
                int iZ = eVar2.z();
                if (Character.isISOControl(iZ) && !Character.isWhitespace(iZ)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) throws Exception {
        Protocol protocol;
        Charset charset;
        String strF;
        Charset charsetCharset$default;
        w63.e f183329b;
        String strF2;
        Charset charsetCharset$default2;
        w63.g gVar;
        e23.l<String, Unit> lVar = this.f93045a;
        chain.getClass();
        StringBuilder sb3 = new StringBuilder();
        Request request = chain.request();
        jd2.a aVar = jd2.a.REQUEST;
        CopyOnWriteArraySet<jd2.a> copyOnWriteArraySet = this.f93046b;
        boolean zContains = copyOnWriteArraySet.contains(aVar);
        Charset charset2 = f93043e;
        if (zContains || copyOnWriteArraySet.contains(jd2.a.REQUEST_WITH_AUTHORIZATION)) {
            sb3.append("--> ");
            sb3.append(request.method());
            sb3.append(' ');
            String url = request.url().getUrl();
            f93041c.getClass();
            sb3.append(a.a(url));
            sb3.append(' ');
            Connection connection = chain.connection();
            if (connection == null || (protocol = connection.protocol()) == null) {
                protocol = Protocol.HTTP_1_1;
            }
            sb3.append(protocol);
            sb3.append('\n');
            RequestBody requestBodyBody = request.body();
            if (requestBodyBody != null) {
                MediaType mediaType = requestBodyBody.get$contentType();
                if (mediaType != null) {
                    sb3.append("Content-Type: ");
                    sb3.append(mediaType);
                    sb3.append('\n');
                }
                if (requestBodyBody.contentLength() != -1) {
                    sb3.append("Content-Length: ");
                    sb3.append(requestBodyBody.contentLength());
                    sb3.append('\n');
                }
            }
            for (p<? extends String, ? extends String> pVar : request.headers()) {
                String str = (String) pVar.f128594a;
                String str2 = (String) pVar.f128595b;
                Locale locale = Locale.US;
                String strF3 = j20.x.f(locale, str, locale);
                Charset charset3 = charset2;
                if (!strF3.equals(HttpHeaders.CONTENT_TYPE) && !strF3.equals(HttpHeaders.CONTENT_LENGTH) && (!strF3.equals("authorization") || copyOnWriteArraySet.contains(jd2.a.REQUEST_WITH_AUTHORIZATION))) {
                    sb3.append(str);
                    sb3.append(": ");
                    sb3.append(str2);
                    sb3.append('\n');
                }
                charset2 = charset3;
            }
            charset = charset2;
            if (requestBodyBody == null || !copyOnWriteArraySet.contains(jd2.a.REQUEST_BODY)) {
                sb3.append("--> END ");
                sb3.append(request.method());
                sb3.append('\n');
            } else {
                String str3 = request.headers().get(com.google.common.net.HttpHeaders.CONTENT_ENCODING);
                if (str3 != null) {
                    Locale locale2 = Locale.US;
                    strF = j20.x.f(locale2, str3, locale2);
                } else {
                    strF = null;
                }
                if (s.g(strF, "identity")) {
                    sb3.append("--> END ");
                    sb3.append(request.method());
                    sb3.append(" (encoded body omitted)\n");
                } else if (requestBodyBody.isOneShot()) {
                    sb3.append("--> END ");
                    sb3.append(request.method());
                    sb3.append(" (one shot body omitted)\n");
                } else {
                    w63.e eVar = new w63.e();
                    Boolean boolA = a(requestBodyBody.get$contentType());
                    if (!s.g(boolA, Boolean.FALSE)) {
                        requestBodyBody.writeTo(eVar);
                        boolA = Boolean.valueOf(b(eVar));
                    }
                    if (!boolA.booleanValue()) {
                        sb3.append("--> END ");
                        sb3.append(request.method());
                        sb3.append(" (binary ");
                        sb3.append(requestBodyBody.contentLength());
                        sb3.append("-byte body omitted)\n");
                    } else if (eVar.f183349b > 102400) {
                        sb3.append("<-- END ");
                        sb3.append(eVar.f183349b);
                        sb3.append("-byte body omitted)\n");
                    } else {
                        MediaType mediaType2 = requestBodyBody.get$contentType();
                        if (mediaType2 == null || (charsetCharset$default = MediaType.charset$default(mediaType2, null, 1, null)) == null) {
                            charsetCharset$default = charset;
                        }
                        charsetCharset$default.getClass();
                        sb3.append(eVar.w(eVar.f183349b, charsetCharset$default));
                        sb3.append("\n--> END ");
                        sb3.append(request.method());
                        sb3.append(" (");
                        sb3.append(requestBodyBody.contentLength());
                        sb3.append("-byte body)\n");
                    }
                }
            }
        } else {
            charset = charset2;
        }
        long jNanoTime = System.nanoTime();
        try {
            Response responseProceed = chain.proceed(request);
            if (copyOnWriteArraySet.contains(jd2.a.RESPONSE)) {
                long jNanoTime2 = (System.nanoTime() - jNanoTime) / 1000000;
                sb3.append("<-- ");
                sb3.append(responseProceed.code());
                sb3.append(' ');
                sb3.append(responseProceed.message());
                sb3.append(' ');
                sb3.append(responseProceed.request().url());
                j20.x.j(jNanoTime2, " (", "ms, ", sb3);
                ResponseBody responseBodyBody = responseProceed.body();
                if (responseBodyBody == null || (gVar = responseBodyBody.get$this_asResponseBody()) == null) {
                    f183329b = null;
                } else {
                    gVar.b(Long.MAX_VALUE);
                    f183329b = gVar.getF183329b();
                }
                if (f183329b == null) {
                    sb3.append("empty body)\n");
                } else {
                    sb3.append(f183329b.f183349b);
                    sb3.append("-byte body)\n");
                }
                for (p<? extends String, ? extends String> pVar2 : responseProceed.headers()) {
                    String str4 = (String) pVar2.f128594a;
                    String str5 = (String) pVar2.f128595b;
                    sb3.append(str4);
                    sb3.append(": ");
                    sb3.append(str5);
                    sb3.append('\n');
                }
                if (responseBodyBody == null || f183329b == null || !copyOnWriteArraySet.contains(jd2.a.RESPONSE_BODY)) {
                    sb3.append("<-- END HTTP\n");
                } else {
                    String str6 = responseProceed.headers().get(com.google.common.net.HttpHeaders.CONTENT_ENCODING);
                    if (str6 != null) {
                        Locale locale3 = Locale.US;
                        strF2 = j20.x.f(locale3, str6, locale3);
                    } else {
                        strF2 = null;
                    }
                    if (s.g(strF2, "identity")) {
                        sb3.append("<-- END HTTP (encoded body omitted)\n");
                    } else {
                        Boolean boolA2 = a(responseBodyBody.get$contentType());
                        if (!(boolA2 != null ? boolA2.booleanValue() : b(f183329b))) {
                            sb3.append("<-- END HTTP (binary ");
                            sb3.append(f183329b.f183349b);
                            sb3.append("-byte body omitted)\n");
                        } else if (f183329b.f183349b > 10240) {
                            sb3.append("<-- END HTTP (");
                            sb3.append(f183329b.f183349b);
                            sb3.append("-byte body omitted)\n");
                        } else {
                            w63.e eVarE = f183329b.e();
                            MediaType mediaType3 = responseBodyBody.get$contentType();
                            Charset charset4 = (mediaType3 == null || (charsetCharset$default2 = MediaType.charset$default(mediaType3, null, 1, null)) == null) ? charset : charsetCharset$default2;
                            charset4.getClass();
                            sb3.append(eVarE.w(eVarE.f183349b, charset4));
                            sb3.append("\n<-- END HTTP (");
                            sb3.append(f183329b.f183349b);
                            sb3.append("-byte body)\n");
                        }
                    }
                }
            }
            lVar.invoke(sb3.toString());
            return responseProceed;
        } catch (Exception e4) {
            sb3.append("<-- HTTP FAILED: ");
            sb3.append(e4);
            sb3.append("\n");
            lVar.invoke(sb3.toString());
            throw e4;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lid2/f$a;", "", "<init>", "()V", "Ljava/nio/charset/Charset;", "kotlin.jvm.PlatformType", "UTF8", "Ljava/nio/charset/Charset;", "", "MAX_REQUEST_BODY_LOG_SIZE", "I", "MAX_RESPONSE_BODY_LOG_SIZE", "networking-okhttp_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static String a(String str) {
            Object next;
            str.getClass();
            Iterator<T> it = f.f93044f.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!d53.w.z(str, (String) next, false));
            String str2 = (String) next;
            return (str2 == null || str2.length() == 0) ? str : str.substring(0, Integer.max(d53.w.H(str, str2, 0, false, 6), 0)).concat("****");
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(e23.l<? super String, Unit> lVar) {
        this(f93042d, lVar);
        lVar.getClass();
    }
}

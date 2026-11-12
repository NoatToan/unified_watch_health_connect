package r92;

import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.gms.gcm.Task;
import com.mapbox.common.HttpHeaders;
import com.mapbox.maps.extension.compose.style.standard.BaseStyleConfigurationState;
import e23.l;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.util.Locale;
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
import p13.w;
import p13.x;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lr92/i;", "Lokhttp3/Interceptor;", "Lkotlin/Function1;", "", "", "logger", "<init>", "(Le23/l;)V", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l<String, Unit> f151447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Charset f151448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f151449c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f151450d;

    /* JADX WARN: Multi-variable type inference failed */
    public i(l<? super String, Unit> lVar) {
        lVar.getClass();
        this.f151447a = lVar;
        this.f151448b = Charset.forName("UTF-8");
        this.f151449c = 102400;
        this.f151450d = Task.EXTRAS_LIMIT_BYTES;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static boolean a(MediaType mediaType, w63.e eVar) {
        w63.e eVar2;
        int i14;
        int iZ;
        if (mediaType == null) {
            eVar2 = new w63.e();
            eVar.f(0L, eVar2, Math.min(64L, eVar.f183349b));
            for (i14 = 0; i14 < 16; i14++) {
                iZ = eVar2.z();
                if (Character.isISOControl(iZ)) {
                }
            }
            return true;
        }
        String strType = mediaType.type();
        switch (strType.hashCode()) {
            case 3148879:
                if (!strType.equals(BaseStyleConfigurationState.CONFIG_FONT)) {
                }
                break;
            case 3556653:
                if (strType.equals("text") && x.k("css", "html", "javascript", "plain", StringLookupFactory.KEY_XML).contains(mediaType.subtype())) {
                    return true;
                }
                break;
            case 93166550:
                if (!strType.equals(MimeTypes.BASE_TYPE_AUDIO)) {
                }
                break;
            case 100313435:
                if (!strType.equals("image")) {
                }
                break;
            case 112202875:
                if (!strType.equals(MimeTypes.BASE_TYPE_VIDEO)) {
                }
                break;
            case 1554253136:
                if (strType.equals(MimeTypes.BASE_TYPE_APPLICATION)) {
                    if (x.k("json", StringLookupFactory.KEY_XML).contains(mediaType.subtype())) {
                        return true;
                    }
                    if (!w.c("octet-stream").contains(mediaType.subtype())) {
                    }
                }
                break;
        }
        try {
            eVar2 = new w63.e();
            eVar.f(0L, eVar2, Math.min(64L, eVar.f183349b));
            while (i14 < 16 && !eVar2.F1()) {
                iZ = eVar2.z();
                if (Character.isISOControl(iZ) || Character.isWhitespace(iZ)) {
                }
            }
            return true;
        } catch (EOFException unused) {
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:57:0x01db  */
    /* JADX WARN: Code duplicated, block: B:58:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:62:0x01f7 A[LOOP:1: B:60:0x01f1->B:62:0x01f7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:86:0x0295  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) throws Exception {
        Protocol protocol;
        String strF;
        String str;
        Charset charsetCharset$default;
        ResponseBody responseBodyBody;
        w63.e f183329b;
        String strF2;
        Charset charsetCharset$default2;
        w63.g bodySource;
        l<String, Unit> lVar = this.f151447a;
        chain.getClass();
        StringBuilder sb3 = new StringBuilder("--> ");
        Request request = chain.request();
        sb3.append(request.method());
        sb3.append(' ');
        sb3.append(request.url());
        sb3.append(' ');
        Connection connection = chain.connection();
        if (connection == null || (protocol = connection.protocol()) == null) {
            protocol = Protocol.HTTP_1_1;
        }
        sb3.append(protocol);
        sb3.append('\n');
        RequestBody requestBodyBody = request.body();
        if (requestBodyBody != null) {
            MediaType contentType = requestBodyBody.getContentType();
            if (contentType != null) {
                sb3.append("Content-Type: ");
                sb3.append(contentType);
                sb3.append('\n');
            }
            if (requestBodyBody.contentLength() != -1) {
                sb3.append("Content-Length: ");
                sb3.append(requestBodyBody.contentLength());
                sb3.append('\n');
            }
        }
        for (p<? extends String, ? extends String> pVar : request.headers()) {
            String str2 = (String) pVar.f128594a;
            String str3 = (String) pVar.f128595b;
            Locale locale = Locale.US;
            String strF3 = j20.x.f(locale, str2, locale);
            if (!strF3.equals(HttpHeaders.CONTENT_TYPE) && !strF3.equals(HttpHeaders.CONTENT_LENGTH) && !strF3.equalsIgnoreCase(com.google.common.net.HttpHeaders.AUTHORIZATION)) {
                sb3.append(str2);
                sb3.append(": ");
                sb3.append(str3);
                sb3.append('\n');
            }
        }
        Charset charset = this.f151448b;
        try {
            if (requestBodyBody != null) {
                String str4 = request.headers().get(com.google.common.net.HttpHeaders.CONTENT_ENCODING);
                if (str4 != null) {
                    Locale locale2 = Locale.US;
                    strF = j20.x.f(locale2, str4, locale2);
                } else {
                    strF = null;
                }
                if (s.g(strF, "identity")) {
                    sb3.append("--> END ");
                    sb3.append(request.method());
                    sb3.append(" (encoded body omitted)\n");
                } else {
                    w63.e eVar = new w63.e();
                    requestBodyBody.writeTo(eVar);
                    if (!a(requestBodyBody.getContentType(), eVar)) {
                        str = "-byte body)\n";
                        sb3.append("--> END ");
                        sb3.append(request.method());
                        sb3.append(" (binary ");
                        sb3.append(requestBodyBody.contentLength());
                        sb3.append("-byte body omitted)\n");
                    } else if (eVar.f183349b > this.f151449c) {
                        sb3.append("<-- END ");
                        sb3.append(eVar.f183349b);
                        sb3.append("-byte body omitted)\n");
                        str = "-byte body)\n";
                    } else {
                        MediaType contentType2 = requestBodyBody.getContentType();
                        if (contentType2 == null || (charsetCharset$default = MediaType.charset$default(contentType2, null, 1, null)) == null) {
                            charsetCharset$default = charset;
                        }
                        charsetCharset$default.getClass();
                        sb3.append(eVar.w(eVar.f183349b, charsetCharset$default));
                        sb3.append("\n--> END ");
                        sb3.append(request.method());
                        sb3.append(" (");
                        sb3.append(requestBodyBody.contentLength());
                        str = "-byte body)\n";
                        sb3.append(str);
                    }
                }
                long jNanoTime = System.nanoTime();
                Response responseProceed = chain.proceed(request);
                long jNanoTime2 = (System.nanoTime() - jNanoTime) / 1000000;
                sb3.append("<-- ");
                sb3.append(responseProceed.code());
                sb3.append(' ');
                sb3.append(responseProceed.message());
                sb3.append(' ');
                sb3.append(responseProceed.request().url());
                j20.x.j(jNanoTime2, " (", "ms, ", sb3);
                responseBodyBody = responseProceed.body();
                if (responseBodyBody != null || (bodySource = responseBodyBody.getBodySource()) == null) {
                    f183329b = null;
                } else {
                    bodySource.b(Long.MAX_VALUE);
                    f183329b = bodySource.getF183329b();
                }
                if (f183329b == null) {
                    sb3.append("empty body)\n");
                } else {
                    sb3.append(f183329b.f183349b);
                    sb3.append(str);
                }
                for (p<? extends String, ? extends String> pVar2 : responseProceed.headers()) {
                    String str5 = (String) pVar2.f128594a;
                    String str6 = (String) pVar2.f128595b;
                    sb3.append(str5);
                    sb3.append(": ");
                    sb3.append(str6);
                    sb3.append('\n');
                }
                if (responseBodyBody != null || f183329b == null) {
                    sb3.append("<-- END HTTP\n");
                } else {
                    String str7 = responseProceed.headers().get(com.google.common.net.HttpHeaders.CONTENT_ENCODING);
                    if (str7 != null) {
                        Locale locale3 = Locale.US;
                        strF2 = j20.x.f(locale3, str7, locale3);
                    } else {
                        strF2 = null;
                    }
                    if (s.g(strF2, "identity")) {
                        sb3.append("<-- END HTTP (encoded body omitted)\n");
                    } else if (!a(responseBodyBody.get$contentType(), f183329b)) {
                        sb3.append("<-- END HTTP (binary ");
                        sb3.append(f183329b.f183349b);
                        sb3.append("-byte body omitted)\n");
                    } else if (f183329b.f183349b > this.f151450d) {
                        sb3.append("<-- END HTTP (");
                        sb3.append(f183329b.f183349b);
                        sb3.append("-byte body omitted)\n");
                    } else {
                        w63.e eVarE = f183329b.e();
                        MediaType mediaType = responseBodyBody.get$contentType();
                        if (mediaType != null && (charsetCharset$default2 = MediaType.charset$default(mediaType, null, 1, null)) != null) {
                            charset = charsetCharset$default2;
                        }
                        charset.getClass();
                        sb3.append(eVarE.w(eVarE.f183349b, charset));
                        sb3.append("\n<-- END HTTP (");
                        sb3.append(f183329b.f183349b);
                        sb3.append(str);
                    }
                }
                lVar.invoke(sb3.toString());
                return responseProceed;
            }
            sb3.append("--> END ");
            sb3.append(request.method());
            sb3.append('\n');
            Response responseProceed2 = chain.proceed(request);
            long jNanoTime3 = (System.nanoTime() - jNanoTime) / 1000000;
            sb3.append("<-- ");
            sb3.append(responseProceed2.code());
            sb3.append(' ');
            sb3.append(responseProceed2.message());
            sb3.append(' ');
            sb3.append(responseProceed2.request().url());
            j20.x.j(jNanoTime3, " (", "ms, ", sb3);
            responseBodyBody = responseProceed2.body();
            if (responseBodyBody != null) {
                f183329b = null;
            } else {
                f183329b = null;
            }
            if (f183329b == null) {
                sb3.append("empty body)\n");
            } else {
                sb3.append(f183329b.f183349b);
                sb3.append(str);
            }
            while (r6.hasNext()) {
                String str8 = (String) pVar2.f128594a;
                String str9 = (String) pVar2.f128595b;
                sb3.append(str8);
                sb3.append(": ");
                sb3.append(str9);
                sb3.append('\n');
            }
            if (responseBodyBody != null) {
                sb3.append("<-- END HTTP\n");
            } else {
                sb3.append("<-- END HTTP\n");
            }
            lVar.invoke(sb3.toString());
            return responseProceed2;
        } catch (Exception e4) {
            sb3.append("<-- HTTP FAILED: ");
            sb3.append(e4);
            sb3.append("\n");
            lVar.invoke(sb3.toString());
            throw e4;
        }
        str = "-byte body)\n";
        long jNanoTime4 = System.nanoTime();
    }
}

package zy0;

import com.google.common.net.HttpHeaders;
import j20.x;
import java.io.EOFException;
import java.nio.charset.Charset;
import okhttp3.Connection;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes9.dex */
@Deprecated
public class j implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f207456a = Charset.forName("UTF-8");

    public static boolean a(w63.e eVar) {
        try {
            w63.e eVar2 = new w63.e();
            long j8 = eVar.f183349b;
            eVar.f(0L, eVar2, j8 < 64 ? j8 : 64L);
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

    /* JADX WARN: Code duplicated, block: B:51:0x0186  */
    /* JADX WARN: Code duplicated, block: B:52:0x0198  */
    /* JADX WARN: Code duplicated, block: B:55:0x01d8 A[LOOP:1: B:54:0x01d6->B:55:0x01d8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:58:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:59:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:64:0x0212  */
    /* JADX WARN: Code duplicated, block: B:66:0x0228  */
    /* JADX WARN: Code duplicated, block: B:69:0x0232  */
    /* JADX WARN: Code duplicated, block: B:70:0x0240  */
    /* JADX WARN: Code duplicated, block: B:72:0x0248  */
    /* JADX WARN: Code duplicated, block: B:73:0x0256  */
    /* JADX WARN: Instruction removed from duplicated block: B:51:0x0186, please report this as an issue */
    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) throws Exception {
        String str;
        Response responseProceed;
        ResponseBody responseBodyBody;
        long contentLength;
        String str2;
        Headers headers;
        int size;
        int i14;
        String str3;
        w63.e eVarJ3;
        MediaType mediaType;
        Request request = chain.request();
        RequestBody requestBodyBody = request.body();
        boolean z14 = requestBodyBody != null;
        StringBuilder sb3 = new StringBuilder();
        Connection connection = chain.connection();
        sb3.append("--> " + request.method() + ' ' + request.url() + ' ' + (connection != null ? connection.protocol() : Protocol.HTTP_1_1));
        sb3.append("\n");
        if (z14) {
            if (requestBodyBody.getContentType() != null) {
                sb3.append("Content-Type: ");
                sb3.append(requestBodyBody.getContentType());
                sb3.append("\n");
            }
            if (requestBodyBody.contentLength() != -1) {
                sb3.append("Content-Length: ");
                sb3.append(requestBodyBody.contentLength());
                sb3.append("\n");
            }
        }
        Headers headers2 = request.headers();
        int size2 = headers2.size();
        for (int i15 = 0; i15 < size2; i15++) {
            String strName = headers2.name(i15);
            if (!HttpHeaders.CONTENT_TYPE.equalsIgnoreCase(strName) && !HttpHeaders.CONTENT_LENGTH.equalsIgnoreCase(strName)) {
                sb3.append(strName);
                sb3.append(": ");
                sb3.append(headers2.value(i15));
                sb3.append("\n");
            }
        }
        Charset charset = f207456a;
        try {
            if (z14) {
                String str4 = request.headers().get(HttpHeaders.CONTENT_ENCODING);
                if (str4 == null || str4.equalsIgnoreCase("identity")) {
                    w63.e eVar = new w63.e();
                    requestBodyBody.writeTo(eVar);
                    MediaType f121556a = requestBodyBody.getContentType();
                    Charset charset2 = f121556a != null ? f121556a.charset(charset) : charset;
                    if (!a(eVar)) {
                        str = "-byte body omitted)\n";
                        sb3.append("--> END ");
                        sb3.append(request.method());
                        sb3.append(" (binary ");
                        sb3.append(requestBodyBody.contentLength());
                        sb3.append(str);
                    } else if (eVar.f183349b > 102400) {
                        sb3.append("<-- END ");
                        sb3.append(eVar.f183349b);
                        str = "-byte body omitted)\n";
                        sb3.append(str);
                    } else {
                        str = "-byte body omitted)\n";
                        sb3.append(eVar.P2(charset2));
                        sb3.append("\n--> END ");
                        sb3.append(request.method());
                        sb3.append(" (");
                        sb3.append(requestBodyBody.contentLength());
                        sb3.append("-byte body)\n");
                    }
                } else {
                    sb3.append("--> END ");
                    sb3.append(request.method());
                    sb3.append(" (encoded body omitted)\n");
                }
                long jNanoTime = System.nanoTime();
                responseProceed = chain.proceed(request);
                long jNanoTime2 = (System.nanoTime() - jNanoTime) / 1000000;
                responseBodyBody = responseProceed.body();
                contentLength = responseBodyBody.getContentLength();
                if (contentLength != -1) {
                    str2 = contentLength + "-byte";
                } else {
                    str2 = "unknown-length";
                }
                sb3.append("<-- ");
                sb3.append(responseProceed.code());
                sb3.append(' ');
                sb3.append(responseProceed.message());
                sb3.append(' ');
                sb3.append(responseProceed.request().url());
                x.j(jNanoTime2, " (", "ms, ", sb3);
                sb3.append(str2);
                sb3.append(" body)\n");
                headers = responseProceed.headers();
                size = headers.size();
                for (i14 = 0; i14 < size; i14++) {
                    sb3.append(headers.name(i14));
                    sb3.append(": ");
                    sb3.append(headers.value(i14));
                    sb3.append("\n");
                }
                if (okhttp3.internal.http.HttpHeaders.hasBody(responseProceed)) {
                    str3 = responseProceed.headers().get(HttpHeaders.CONTENT_ENCODING);
                    if (str3 != null || str3.equalsIgnoreCase("identity")) {
                        w63.g bodySource = responseBodyBody.getBodySource();
                        bodySource.b(Long.MAX_VALUE);
                        eVarJ3 = bodySource.j3();
                        mediaType = responseBodyBody.get$contentType();
                        if (mediaType != null) {
                            charset = mediaType.charset(charset);
                        }
                        if (!a(eVarJ3)) {
                            sb3.append("<-- END HTTP (binary ");
                            sb3.append(eVarJ3.f183349b);
                            sb3.append(str);
                        } else if (eVarJ3.f183349b > 10240) {
                            sb3.append("<-- END HTTP (");
                            sb3.append(eVarJ3.f183349b);
                            sb3.append(str);
                        } else {
                            sb3.append(eVarJ3.e().P2(charset));
                            sb3.append("\n<-- END HTTP (");
                            sb3.append(eVarJ3.f183349b);
                            sb3.append("-byte body)\n");
                        }
                    } else {
                        sb3.append("<-- END HTTP (encoded body omitted)\n");
                    }
                } else {
                    sb3.append("<-- END HTTP\n");
                }
                int i16 = gt2.c.f79010a;
                gt2.b.f79005a.h("GarminHttpLogsInterceptor").debug(sb3.toString());
                return responseProceed;
            }
            sb3.append("--> END ");
            sb3.append(request.method());
            sb3.append("\n");
            responseProceed = chain.proceed(request);
            long jNanoTime3 = (System.nanoTime() - jNanoTime) / 1000000;
            responseBodyBody = responseProceed.body();
            contentLength = responseBodyBody.getContentLength();
            if (contentLength != -1) {
                str2 = contentLength + "-byte";
            } else {
                str2 = "unknown-length";
            }
            sb3.append("<-- ");
            sb3.append(responseProceed.code());
            sb3.append(' ');
            sb3.append(responseProceed.message());
            sb3.append(' ');
            sb3.append(responseProceed.request().url());
            x.j(jNanoTime3, " (", "ms, ", sb3);
            sb3.append(str2);
            sb3.append(" body)\n");
            headers = responseProceed.headers();
            size = headers.size();
            while (i14 < size) {
                sb3.append(headers.name(i14));
                sb3.append(": ");
                sb3.append(headers.value(i14));
                sb3.append("\n");
            }
            if (okhttp3.internal.http.HttpHeaders.hasBody(responseProceed)) {
                sb3.append("<-- END HTTP\n");
            } else {
                str3 = responseProceed.headers().get(HttpHeaders.CONTENT_ENCODING);
                if (str3 != null) {
                    w63.g bodySource2 = responseBodyBody.getBodySource();
                    bodySource2.b(Long.MAX_VALUE);
                    eVarJ3 = bodySource2.j3();
                    mediaType = responseBodyBody.get$contentType();
                    if (mediaType != null) {
                        charset = mediaType.charset(charset);
                    }
                    if (!a(eVarJ3)) {
                        sb3.append("<-- END HTTP (binary ");
                        sb3.append(eVarJ3.f183349b);
                        sb3.append(str);
                    } else if (eVarJ3.f183349b > 10240) {
                        sb3.append("<-- END HTTP (");
                        sb3.append(eVarJ3.f183349b);
                        sb3.append(str);
                    } else {
                        sb3.append(eVarJ3.e().P2(charset));
                        sb3.append("\n<-- END HTTP (");
                        sb3.append(eVarJ3.f183349b);
                        sb3.append("-byte body)\n");
                    }
                } else {
                    w63.g bodySource3 = responseBodyBody.getBodySource();
                    bodySource3.b(Long.MAX_VALUE);
                    eVarJ3 = bodySource3.j3();
                    mediaType = responseBodyBody.get$contentType();
                    if (mediaType != null) {
                        charset = mediaType.charset(charset);
                    }
                    if (!a(eVarJ3)) {
                        sb3.append("<-- END HTTP (binary ");
                        sb3.append(eVarJ3.f183349b);
                        sb3.append(str);
                    } else if (eVarJ3.f183349b > 10240) {
                        sb3.append("<-- END HTTP (");
                        sb3.append(eVarJ3.f183349b);
                        sb3.append(str);
                    } else {
                        sb3.append(eVarJ3.e().P2(charset));
                        sb3.append("\n<-- END HTTP (");
                        sb3.append(eVarJ3.f183349b);
                        sb3.append("-byte body)\n");
                    }
                }
            }
            int i17 = gt2.c.f79010a;
            gt2.b.f79005a.h("GarminHttpLogsInterceptor").debug(sb3.toString());
            return responseProceed;
        } catch (Exception e4) {
            sb3.append("<-- HTTP FAILED: ");
            sb3.append(e4);
            sb3.append("\n");
            int i18 = gt2.c.f79010a;
            gt2.b.f79005a.h("GarminHttpLogsInterceptor").debug(sb3.toString());
            throw e4;
        }
        str = "-byte body omitted)\n";
        long jNanoTime4 = System.nanoTime();
    }
}

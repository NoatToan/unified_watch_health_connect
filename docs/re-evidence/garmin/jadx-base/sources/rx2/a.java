package rx2;

import com.garmin.samd.exception.NetworkException;
import com.google.common.net.HttpHeaders;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import o13.m;
import o13.t;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.w;
import qx2.c;

/* JADX INFO: loaded from: classes13.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f155054a = m.b(C2936a.f155055a);

    /* JADX INFO: renamed from: rx2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lorg/slf4j/Logger;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C2936a extends w implements e23.a<Logger> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C2936a f155055a = new C2936a();

        public C2936a() {
            super(0);
        }

        @Override // e23.a
        public final Logger invoke() {
            return ge1.b.L("GCHttpClient");
        }
    }

    public static final c a(HttpURLConnection httpURLConnection, String str, String str2, String str3, byte[] bArr) throws IOException {
        httpURLConnection.setConnectTimeout(10000);
        httpURLConnection.setReadTimeout(10000);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setRequestMethod(str);
        String str4 = o72.t.f130588b;
        if (str4 == null) {
            s.m("shortUserAgent");
            throw null;
        }
        httpURLConnection.setRequestProperty(HttpHeaders.USER_AGENT, str4);
        String str5 = o72.t.f130587a;
        if (str5 == null) {
            s.m("userAgent");
            throw null;
        }
        httpURLConnection.setRequestProperty("X-Garmin-User-Agent", str5);
        String string = httpURLConnection.getURL().toString();
        string.getClass();
        if (!d53.w.z(string, "/status/sync", false)) {
            httpURLConnection.setRequestProperty(HttpHeaders.AUTHORIZATION, "Bearer ".concat(str2));
        }
        if (bArr != null && bArr.length != 0) {
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_LENGTH, String.valueOf(bArr.length));
            httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_TYPE, str3);
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                outputStream.write(bArr);
                Unit unit = Unit.INSTANCE;
                outputStream.close();
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    jg.b.l(outputStream, th3);
                    throw th4;
                }
            }
        }
        httpURLConnection.connect();
        byte[] bArrM = null;
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode < 400) {
            InputStream inputStream = httpURLConnection.getInputStream();
            try {
                inputStream.getClass();
                byte[] bArrM2 = dh.b.M(inputStream);
                inputStream.close();
                bArrM = bArrM2;
            } catch (Throwable th5) {
                try {
                    throw th5;
                } catch (Throwable th6) {
                    jg.b.l(inputStream, th5);
                    throw th6;
                }
            }
        } else {
            InputStream errorStream = httpURLConnection.getErrorStream();
            if (errorStream != null) {
                try {
                    bArrM = dh.b.M(errorStream);
                    errorStream.close();
                } catch (Throwable th7) {
                    try {
                        throw th7;
                    } catch (Throwable th8) {
                        jg.b.l(errorStream, th7);
                        throw th8;
                    }
                }
            }
        }
        String str6 = bArrM != null ? new String(bArrM, d53.c.f57666b) : "";
        URL url = httpURLConnection.getURL();
        url.getClass();
        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
        headerFields.getClass();
        return new c(str, url, responseCode, headerFields, str6);
    }

    public static final c b(boolean z14, String str, URL url, String str2, String str3, byte[] bArr) {
        String str4 = str + StringUtils.SPACE + url;
        if (z14) {
            "SAMD#".concat("GCHttpClient");
        } else {
            c().debug(str4);
        }
        HttpURLConnection httpURLConnection = null;
        try {
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            uRLConnectionOpenConnection.getClass();
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) uRLConnectionOpenConnection;
            try {
                c cVarA = a(httpURLConnection2, str, str2, str3, bArr);
                try {
                    httpURLConnection2.disconnect();
                } catch (Throwable unused) {
                }
                return cVarA;
            } catch (Throwable th3) {
                th = th3;
                httpURLConnection = httpURLConnection2;
                try {
                    String str5 = "execute: " + str + StringUtils.SPACE + url;
                    if (z14) {
                        "SAMD#".concat("GCHttpClient");
                    } else {
                        c().error(str5);
                    }
                    String message = th.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    throw new NetworkException(message);
                } catch (Throwable th4) {
                    if (httpURLConnection != null) {
                        try {
                            httpURLConnection.disconnect();
                        } catch (Throwable unused2) {
                        }
                    }
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    public static final Logger c() {
        return (Logger) f155054a.getValue();
    }
}

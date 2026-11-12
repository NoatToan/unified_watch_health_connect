package sx2;

import com.garmin.samd.exception.GHSEnvironmentNotSupportedException;
import com.garmin.samd.exception.InvalidOAuth2DIBearerTokenException;
import com.garmin.samd.exception.NetworkException;
import com.google.common.net.HttpHeaders;
import com.google.firebase.perf.FirebasePerformance;
import d53.u;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;
import o13.m;
import o13.r;
import o13.t;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.w;
import vb.h;

/* JADX INFO: loaded from: classes13.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f161144a = m.b(a.f161145a);

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lorg/slf4j/Logger;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends w implements e23.a<Logger> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f161145a = new a();

        public a() {
            super(0);
        }

        @Override // e23.a
        public final Logger invoke() {
            return ge1.b.L("GHSHttpClient");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object a(String str, String str2, gx2.a aVar, String str3, String str4, byte[] bArr, List list, Map map, v13.c cVar) {
        sx2.a aVar2;
        URL url;
        List list2;
        Map map2;
        Object objG;
        String str5;
        URL url2;
        byte[] bArr2;
        String str6;
        String str7;
        String str8;
        if (cVar instanceof sx2.a) {
            aVar2 = (sx2.a) cVar;
            int i14 = aVar2.f161143i;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar2.f161143i = i14 - Integer.MIN_VALUE;
            } else {
                aVar2 = new sx2.a(cVar);
            }
        } else {
            aVar2 = new sx2.a(cVar);
        }
        Object obj = aVar2.f161142h;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar2.f161143i;
        if (i15 == 0) {
            r.b(obj);
            zi2.a aVarJ = aVar.j();
            str2.getClass();
            aVarJ.getClass();
            if (u.y(str2, "https://", false)) {
                url = new URL(str2);
            } else {
                try {
                    url = new URL("https://" + c.valueOf(aVarJ.name()).f161147a + "/ghs" + str2);
                    c().debug(url.toString());
                } catch (IllegalArgumentException unused) {
                    throw new GHSEnvironmentNotSupportedException(aVarJ);
                }
            }
            if (str3 == null || d53.w.J(str3)) {
                aVar2.f161135a = str;
                aVar2.f161136b = str2;
                aVar2.f161137c = str4;
                aVar2.f161138d = bArr;
                list2 = list;
                aVar2.f161139e = list2;
                map2 = map;
                aVar2.f161140f = map2;
                aVar2.f161141g = url;
                aVar2.f161143i = 1;
                objG = aVar.g();
                if (objG == aVar3) {
                    return aVar3;
                }
                str5 = str;
                url2 = url;
                bArr2 = bArr;
                str6 = str2;
                str7 = str4;
            } else {
                str5 = str;
                str6 = str2;
                str8 = str3;
                bArr2 = bArr;
                list2 = list;
                map2 = map;
                url2 = url;
                str7 = str4;
            }
            if (str8 != null || d53.w.J(str8)) {
                throw new InvalidOAuth2DIBearerTokenException();
            }
            HttpURLConnection httpURLConnection = null;
            try {
                URLConnection uRLConnectionOpenConnection = url2.openConnection();
                uRLConnectionOpenConnection.getClass();
                HttpURLConnection httpURLConnection2 = (HttpURLConnection) uRLConnectionOpenConnection;
                String str9 = str5;
                try {
                    qx2.c cVarB = b(httpURLConnection2, str9, str8, str7, bArr2, list2, map2);
                    try {
                        httpURLConnection2.disconnect();
                    } catch (Throwable unused2) {
                    }
                    return cVarB;
                } catch (Throwable th3) {
                    th = th3;
                    httpURLConnection = httpURLConnection2;
                    str5 = str9;
                    try {
                        c().error("execute: " + str5 + StringUtils.SPACE + str6, th);
                        String message = th.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        throw new NetworkException(message);
                    } catch (Throwable th4) {
                        if (httpURLConnection != null) {
                            try {
                                httpURLConnection.disconnect();
                            } catch (Throwable unused3) {
                            }
                        }
                        throw th4;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            url2 = aVar2.f161141g;
            Map map3 = aVar2.f161140f;
            List list3 = aVar2.f161139e;
            bArr2 = aVar2.f161138d;
            str7 = aVar2.f161137c;
            str6 = aVar2.f161136b;
            String str10 = aVar2.f161135a;
            r.b(obj);
            objG = obj;
            str5 = str10;
            map2 = map3;
            list2 = list3;
        }
        str8 = (String) objG;
        if (str8 != null) {
        }
        throw new InvalidOAuth2DIBearerTokenException();
    }

    public static final qx2.c b(HttpURLConnection httpURLConnection, String str, String str2, String str3, byte[] bArr, List<d> list, Map<String, String> map) throws IOException {
        str.getClass();
        str2.getClass();
        httpURLConnection.setConnectTimeout(10000);
        httpURLConnection.setReadTimeout(10000);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setRequestMethod(str);
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
            }
        }
        httpURLConnection.setRequestProperty(HttpHeaders.AUTHORIZATION, "Bearer ".concat(str2));
        String str4 = o72.t.f130588b;
        byte[] bArrM = null;
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
        if (list != null) {
            httpURLConnection.setDoOutput(true);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                for (d dVar : list) {
                    String str6 = dVar.f161148a;
                    byte[] bArr2 = dVar.f161150c;
                    String str7 = "--gIgMT7WMfzOL4x7FWiGh3b2YyU7d_g7l-My4B\r\nContent-Disposition: form-data; name=\"data\"; filename=\"" + str6 + "\"\r\nContent-Type: " + dVar.f161149b + "\r\nContent-Length: " + bArr2.length + "\r\n\r\n";
                    Charset charset = d53.c.f57666b;
                    byte[] bytes = str7.getBytes(charset);
                    bytes.getClass();
                    byteArrayOutputStream.write(bytes);
                    byteArrayOutputStream.write(bArr2);
                    byte[] bytes2 = IOUtils.LINE_SEPARATOR_WINDOWS.getBytes(charset);
                    bytes2.getClass();
                    byteArrayOutputStream.write(bytes2);
                }
                byte[] bytes3 = ("--gIgMT7WMfzOL4x7FWiGh3b2YyU7d_g7l-My4B--").getBytes(d53.c.f57666b);
                bytes3.getClass();
                byteArrayOutputStream.write(bytes3);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                byteArray.getClass();
                httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_LENGTH, String.valueOf(byteArray.length));
                httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_TYPE, str3 + "; boundary=gIgMT7WMfzOL4x7FWiGh3b2YyU7d_g7l-My4B");
                OutputStream outputStream = httpURLConnection.getOutputStream();
                try {
                    outputStream.write(byteArray);
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
            } catch (Throwable th5) {
                try {
                    throw th5;
                } catch (Throwable th6) {
                    jg.b.l(byteArrayOutputStream, th5);
                    throw th6;
                }
            }
        } else if (bArr != null && bArr.length != 0) {
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_LENGTH, String.valueOf(bArr.length));
            httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_TYPE, str3);
            OutputStream outputStream2 = httpURLConnection.getOutputStream();
            try {
                outputStream2.write(bArr);
                Unit unit2 = Unit.INSTANCE;
                outputStream2.close();
            } catch (Throwable th7) {
                try {
                    throw th7;
                } catch (Throwable th8) {
                    jg.b.l(outputStream2, th7);
                    throw th8;
                }
            }
        }
        httpURLConnection.connect();
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode < 400) {
            InputStream inputStream = httpURLConnection.getInputStream();
            try {
                inputStream.getClass();
                bArrM = dh.b.M(inputStream);
                inputStream.close();
            } catch (Throwable th9) {
                try {
                    throw th9;
                } catch (Throwable th10) {
                    jg.b.l(inputStream, th9);
                    throw th10;
                }
            }
        } else {
            InputStream errorStream = httpURLConnection.getErrorStream();
            if (errorStream != null) {
                try {
                    bArrM = dh.b.M(errorStream);
                    errorStream.close();
                } catch (Throwable th11) {
                    try {
                        throw th11;
                    } catch (Throwable th12) {
                        jg.b.l(errorStream, th11);
                        throw th12;
                    }
                }
            }
        }
        String str8 = bArrM != null ? new String(bArrM, d53.c.f57666b) : "";
        URL url = httpURLConnection.getURL();
        url.getClass();
        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
        headerFields.getClass();
        return new qx2.c(str, url, responseCode, headerFields, str8);
    }

    public static final Logger c() {
        return (Logger) f161144a.getValue();
    }

    public static Object d(String str, gx2.a aVar, String str2, byte[] bArr, List list, Map map, v13.c cVar, int i14) {
        return a(FirebasePerformance.HttpMethod.POST, str, aVar, (i14 & 4) != 0 ? null : str2, (i14 & 8) != 0 ? "application/json" : "multipart/form-data", (i14 & 16) != 0 ? null : bArr, (i14 & 32) != 0 ? null : list, (i14 & 64) != 0 ? null : map, cVar);
    }
}

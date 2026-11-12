package nd2;

import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.google.firebase.perf.FirebasePerformance;
import d53.u;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o13.q;
import o53.k;
import org.joda.time.DateTimeConstants;
import p005kotlin.jvm.internal.r0;
import p13.k0;
import u13.f;

/* JADX INFO: loaded from: classes11.dex */
public final class e {
    /* JADX WARN: Type inference failed for: r1v5, types: [T, java.net.HttpURLConnection] */
    public static final Object a(URL url, Map map, ud2.e eVar) {
        Object bVar;
        URLConnection uRLConnectionOpenConnection;
        k kVar = new k(f.b(eVar), 1);
        kVar.q();
        r0 r0Var = new r0();
        kVar.r(new d(r0Var));
        try {
            int i14 = q.f128596b;
            try {
                uRLConnectionOpenConnection = url.openConnection();
                try {
                    if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                        throw new IllegalStateException("Expecting an HttpURLConnection");
                    }
                    ?? r14 = (HttpURLConnection) uRLConnectionOpenConnection;
                    r0Var.f105810a = r14;
                    bVar = b(r14, AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS, AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS, map);
                    try {
                        ((HttpURLConnection) uRLConnectionOpenConnection).disconnect();
                    } catch (Throwable unused) {
                    }
                    kVar.resumeWith(bVar);
                    Object objP = kVar.p();
                    u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                    return objP;
                } catch (Throwable th3) {
                    th = th3;
                    if (uRLConnectionOpenConnection instanceof HttpURLConnection) {
                        try {
                            ((HttpURLConnection) uRLConnectionOpenConnection).disconnect();
                        } catch (Throwable unused2) {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                uRLConnectionOpenConnection = null;
            }
        } catch (Throwable th5) {
            int i15 = q.f128596b;
            bVar = new q.b(th5);
        }
    }

    public static final b b(HttpURLConnection httpURLConnection, int i14, int i15, Map map) throws IOException {
        byte[] bArrM;
        httpURLConnection.setConnectTimeout(i14);
        httpURLConnection.setReadTimeout(i15);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setRequestMethod(FirebasePerformance.HttpMethod.GET);
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Iterator it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                httpURLConnection.addRequestProperty(str, (String) it.next());
            }
        }
        int responseCode = httpURLConnection.getResponseCode();
        if (200 > responseCode || responseCode >= 400) {
            InputStream errorStream = httpURLConnection.getErrorStream();
            if (errorStream != null) {
                try {
                    bArrM = dh.b.M(errorStream);
                    errorStream.close();
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        jg.b.l(errorStream, th3);
                        throw th4;
                    }
                }
            } else {
                bArrM = null;
            }
        } else {
            InputStream inputStream = httpURLConnection.getInputStream();
            try {
                inputStream.getClass();
                bArrM = dh.b.M(inputStream);
                inputStream.close();
            } catch (Throwable th5) {
                try {
                    throw th5;
                } catch (Throwable th6) {
                    jg.b.l(inputStream, th5);
                    throw th6;
                }
            }
        }
        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
        headerFields.getClass();
        return new b(responseCode, headerFields, bArrM);
    }

    public static final b c(URL url, Map<String, ? extends List<String>> map, int i14, int i15) throws Throwable {
        URLConnection uRLConnectionOpenConnection;
        map.getClass();
        try {
            uRLConnectionOpenConnection = url.openConnection();
            try {
                if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                    throw new IllegalStateException("Expecting an HttpURLConnection");
                }
                b bVarB = b((HttpURLConnection) uRLConnectionOpenConnection, i14, i15, map);
                try {
                    ((HttpURLConnection) uRLConnectionOpenConnection).disconnect();
                } catch (Throwable unused) {
                }
                return bVarB;
            } catch (Throwable th3) {
                th = th3;
                if (uRLConnectionOpenConnection instanceof HttpURLConnection) {
                    try {
                        ((HttpURLConnection) uRLConnectionOpenConnection).disconnect();
                    } catch (Throwable unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            uRLConnectionOpenConnection = null;
        }
    }

    public static b d(URL url) {
        k0 k0Var = k0.f134949a;
        k0Var.getClass();
        return c(url, k0Var, 30000, DateTimeConstants.MILLIS_PER_MINUTE);
    }

    public static final boolean e(URL url) {
        url.getClass();
        w13.c cVar = ad2.a.f2773f;
        if (cVar != null && cVar.isEmpty()) {
            return false;
        }
        p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
        while (bVarN.hasNext()) {
            ad2.a aVar = (ad2.a) bVarN.next();
            String host = url.getHost();
            host.getClass();
            if (u.y(host, aVar.f2774a, true)) {
                return true;
            }
        }
        return false;
    }
}

package ha;

import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource$HttpDataSourceException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import com.google.common.base.Predicate;
import com.google.common.collect.ForwardingMap;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import com.google.common.io.ByteStreams;
import com.google.common.net.HttpHeaders;
import com.google.firebase.perf.FirebasePerformance;
import ds.e0;
import fa.z;
import fb1.c;
import j20.x;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes.dex */
public class i extends ha.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f82588e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f82589f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f82590g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f82591h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f82592i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final k f82593j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final k f82594k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Predicate<String> f82595l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f82596m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public g f82597n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public HttpURLConnection f82598o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public InputStream f82599p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f82600q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f82601r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f82602s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f82603t;

    public static final class b implements d.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public xa.h f82605b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f82606c;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f82609f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k f82604a = new k();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f82607d = 8000;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f82608e = 8000;

        @Override // ha.d.a
        public final d createDataSource() {
            i iVar = new i(this.f82606c, this.f82607d, this.f82608e, this.f82609f, false, this.f82604a, null, false);
            xa.h hVar = this.f82605b;
            if (hVar != null) {
                iVar.a(hVar);
            }
            return iVar;
        }
    }

    private i(String str, int i14, int i15, boolean z14, boolean z15, k kVar, Predicate<String> predicate, boolean z16) {
        super(true);
        this.f82592i = str;
        this.f82590g = i14;
        this.f82591h = i15;
        this.f82588e = z14;
        this.f82589f = z15;
        if (z14 && z15) {
            vb.h.s("crossProtocolRedirectsForceOriginal should not be set if allowCrossProtocolRedirects is true");
            throw null;
        }
        this.f82593j = kVar;
        this.f82595l = predicate;
        this.f82594k = new k();
        this.f82596m = z16;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0111  */
    /* JADX WARN: Code duplicated, block: B:78:0x0175  */
    @Override // ha.d
    public final long b(final g gVar) throws HttpDataSource$HttpDataSourceException {
        byte[] byteArray;
        long j8;
        long jMax;
        long j14;
        this.f82597n = gVar;
        this.f82603t = 0L;
        this.f82602s = 0L;
        e(gVar);
        try {
            HttpURLConnection httpURLConnectionI = i(gVar);
            long j15 = gVar.f82561g;
            long j16 = gVar.f82560f;
            this.f82598o = httpURLConnectionI;
            this.f82601r = httpURLConnectionI.getResponseCode();
            String responseMessage = httpURLConnectionI.getResponseMessage();
            int i14 = this.f82601r;
            if (i14 < 200 || i14 > 299) {
                Map<String, List<String>> headerFields = httpURLConnectionI.getHeaderFields();
                if (this.f82601r == 416) {
                    String headerField = httpURLConnectionI.getHeaderField(HttpHeaders.CONTENT_RANGE);
                    Pattern pattern = l.f82614a;
                    if (TextUtils.isEmpty(headerField)) {
                        j8 = -1;
                    } else {
                        Matcher matcher = l.f82615b.matcher(headerField);
                        if (matcher.matches()) {
                            String strGroup = matcher.group(1);
                            strGroup.getClass();
                            j8 = Long.parseLong(strGroup);
                        } else {
                            j8 = -1;
                        }
                    }
                    if (j16 == j8) {
                        this.f82600q = true;
                        f(gVar);
                        if (j15 != r14) {
                            return j15;
                        }
                        return 0L;
                    }
                }
                InputStream errorStream = httpURLConnectionI.getErrorStream();
                try {
                    byteArray = errorStream != null ? ByteStreams.toByteArray(errorStream) : z.f70076f;
                } catch (IOException unused) {
                    byteArray = z.f70076f;
                }
                byte[] bArr = byteArray;
                g();
                throw new HttpDataSource$InvalidResponseCodeException(this.f82601r, responseMessage, this.f82601r == 416 ? new DataSourceException(2008) : null, headerFields, gVar, bArr);
            }
            final String contentType = httpURLConnectionI.getContentType();
            Predicate<String> predicate = this.f82595l;
            if (predicate != null && !predicate.apply(contentType)) {
                g();
                throw new HttpDataSource$HttpDataSourceException(contentType, gVar) { // from class: androidx.media3.datasource.HttpDataSource$InvalidContentTypeException
                    public final String contentType;

                    {
                        super(c.n("Invalid content type: ", contentType), gVar, 2003, 1);
                        this.contentType = contentType;
                    }
                };
            }
            if (this.f82601r != 200 || j16 == 0) {
                j16 = 0;
            }
            boolean zEqualsIgnoreCase = "gzip".equalsIgnoreCase(httpURLConnectionI.getHeaderField(HttpHeaders.CONTENT_ENCODING));
            if (zEqualsIgnoreCase || j15 != -1) {
                this.f82602s = j15;
            } else {
                String headerField2 = httpURLConnectionI.getHeaderField(HttpHeaders.CONTENT_LENGTH);
                String headerField3 = httpURLConnectionI.getHeaderField(HttpHeaders.CONTENT_RANGE);
                Pattern pattern2 = l.f82614a;
                if (TextUtils.isEmpty(headerField2)) {
                    jMax = -1;
                } else {
                    try {
                        jMax = Long.parseLong(headerField2);
                    } catch (NumberFormatException unused2) {
                        fa.k.c("Unexpected Content-Length [" + headerField2 + "]");
                        jMax = -1;
                    }
                }
                if (TextUtils.isEmpty(headerField3)) {
                    j14 = -1;
                } else {
                    Matcher matcher2 = l.f82614a.matcher(headerField3);
                    if (matcher2.matches()) {
                        j14 = -1;
                        try {
                            String strGroup2 = matcher2.group(2);
                            strGroup2.getClass();
                            long j17 = Long.parseLong(strGroup2);
                            String strGroup3 = matcher2.group(1);
                            strGroup3.getClass();
                            long j18 = (j17 - Long.parseLong(strGroup3)) + 1;
                            if (jMax < 0) {
                                jMax = j18;
                            } else if (jMax != j18) {
                                fa.k.g("Inconsistent headers [" + headerField2 + "] [" + headerField3 + "]");
                                jMax = Math.max(jMax, j18);
                            }
                        } catch (NumberFormatException unused3) {
                            fa.k.c("Unexpected Content-Range [" + headerField3 + "]");
                        }
                    } else {
                        j14 = -1;
                    }
                }
                this.f82602s = jMax != j14 ? jMax - j16 : j14;
            }
            try {
                this.f82599p = httpURLConnectionI.getInputStream();
                if (zEqualsIgnoreCase) {
                    this.f82599p = new GZIPInputStream(this.f82599p);
                }
                this.f82600q = true;
                f(gVar);
                try {
                    k(j16, gVar);
                    return this.f82602s;
                } catch (IOException e4) {
                    g();
                    if (e4 instanceof HttpDataSource$HttpDataSourceException) {
                        throw ((HttpDataSource$HttpDataSourceException) e4);
                    }
                    throw new HttpDataSource$HttpDataSourceException(e4, gVar, 2000, 1);
                }
            } catch (IOException e14) {
                g();
                throw new HttpDataSource$HttpDataSourceException(e14, gVar, 2000, 1);
            }
        } catch (IOException e15) {
            g();
            throw HttpDataSource$HttpDataSourceException.createForIOException(e15, gVar, 1);
        }
    }

    @Override // ha.d
    public final void close() {
        try {
            InputStream inputStream = this.f82599p;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e4) {
                    g gVar = this.f82597n;
                    int i14 = z.f70071a;
                    throw new HttpDataSource$HttpDataSourceException(e4, gVar, 2000, 3);
                }
            }
            this.f82599p = null;
            g();
            if (this.f82600q) {
                this.f82600q = false;
                d();
            }
            this.f82598o = null;
            this.f82597n = null;
        } catch (Throwable th3) {
            this.f82599p = null;
            g();
            if (this.f82600q) {
                this.f82600q = false;
                d();
            }
            this.f82598o = null;
            this.f82597n = null;
            throw th3;
        }
    }

    public final void g() {
        HttpURLConnection httpURLConnection = this.f82598o;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e4) {
                fa.k.d("Unexpected error while disconnecting", e4);
            }
        }
    }

    @Override // ha.d
    public final Map<String, List<String>> getResponseHeaders() {
        HttpURLConnection httpURLConnection = this.f82598o;
        return httpURLConnection == null ? ImmutableMap.of() : new c(httpURLConnection.getHeaderFields());
    }

    @Override // ha.d
    public final Uri getUri() {
        HttpURLConnection httpURLConnection = this.f82598o;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        g gVar = this.f82597n;
        if (gVar != null) {
            return gVar.f82555a;
        }
        return null;
    }

    public final URL h(URL url, String str, g gVar) throws HttpDataSource$HttpDataSourceException {
        if (str == null) {
            throw new HttpDataSource$HttpDataSourceException("Null location redirect", gVar, 2001, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new HttpDataSource$HttpDataSourceException(fb1.c.n("Unsupported protocol redirect: ", protocol), gVar, 2001, 1);
            }
            if (this.f82588e || protocol.equals(url.getProtocol())) {
                return url2;
            }
            if (this.f82589f) {
                try {
                    return new URL(url2.toString().replaceFirst(protocol, url.getProtocol()));
                } catch (MalformedURLException e4) {
                    throw new HttpDataSource$HttpDataSourceException(e4, gVar, 2001, 1);
                }
            }
            throw new HttpDataSource$HttpDataSourceException("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", gVar, 2001, 1);
        } catch (MalformedURLException e14) {
            throw new HttpDataSource$HttpDataSourceException(e14, gVar, 2001, 1);
        }
    }

    public final HttpURLConnection i(g gVar) throws IOException {
        URL url = new URL(gVar.f82555a.toString());
        int i14 = gVar.f82557c;
        byte[] bArr = gVar.f82558d;
        long j8 = gVar.f82560f;
        long j14 = gVar.f82561g;
        int i15 = 0;
        boolean z14 = (gVar.f82563i & 1) == 1;
        boolean z15 = this.f82588e;
        boolean z16 = this.f82596m;
        if (!z15 && !this.f82589f && !z16) {
            return j(url, i14, bArr, j8, j14, z14, true, gVar.f82559e);
        }
        while (true) {
            int i16 = i15 + 1;
            if (i15 > 20) {
                throw new HttpDataSource$HttpDataSourceException(new NoRouteToHostException(am.j.h(i16, "Too many redirects: ")), gVar, 2001, 1);
            }
            HttpURLConnection httpURLConnectionJ = j(url, i14, bArr, j8, j14, z14, false, gVar.f82559e);
            int responseCode = httpURLConnectionJ.getResponseCode();
            String headerField = httpURLConnectionJ.getHeaderField(HttpHeaders.LOCATION);
            if ((i14 == 1 || i14 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                httpURLConnectionJ.disconnect();
                url = h(url, headerField, gVar);
            } else {
                if (i14 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    return httpURLConnectionJ;
                }
                httpURLConnectionJ.disconnect();
                if (!z16 || responseCode != 302) {
                    bArr = null;
                    i14 = 1;
                }
                url = h(url, headerField, gVar);
            }
            i15 = i16;
        }
    }

    public final HttpURLConnection j(URL url, int i14, byte[] bArr, long j8, long j14, boolean z14, boolean z15, Map<String, String> map) throws IOException {
        String string;
        String str;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f82590g);
        httpURLConnection.setReadTimeout(this.f82591h);
        HashMap map2 = new HashMap();
        k kVar = this.f82593j;
        if (kVar != null) {
            map2.putAll(kVar.a());
        }
        map2.putAll(this.f82594k.a());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Pattern pattern = l.f82614a;
        if (j8 == 0 && j14 == -1) {
            string = null;
        } else {
            StringBuilder sbK = e0.k(j8, "bytes=", "-");
            if (j14 != -1) {
                sbK.append((j8 + j14) - 1);
            }
            string = sbK.toString();
        }
        if (string != null) {
            httpURLConnection.setRequestProperty(HttpHeaders.RANGE, string);
        }
        String str2 = this.f82592i;
        if (str2 != null) {
            httpURLConnection.setRequestProperty(HttpHeaders.USER_AGENT, str2);
        }
        httpURLConnection.setRequestProperty(HttpHeaders.ACCEPT_ENCODING, z14 ? "gzip" : "identity");
        httpURLConnection.setInstanceFollowRedirects(z15);
        httpURLConnection.setDoOutput(bArr != null);
        int i15 = g.f82554k;
        if (i14 == 1) {
            str = FirebasePerformance.HttpMethod.GET;
        } else if (i14 == 2) {
            str = FirebasePerformance.HttpMethod.POST;
        } else {
            if (i14 != 3) {
                x.h();
                return null;
            }
            str = FirebasePerformance.HttpMethod.HEAD;
        }
        httpURLConnection.setRequestMethod(str);
        if (bArr == null) {
            httpURLConnection.connect();
            return httpURLConnection;
        }
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        httpURLConnection.connect();
        OutputStream outputStream = httpURLConnection.getOutputStream();
        outputStream.write(bArr);
        outputStream.close();
        return httpURLConnection;
    }

    public final void k(long j8, g gVar) throws IOException {
        if (j8 == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j8 > 0) {
            int iMin = (int) Math.min(j8, 4096);
            InputStream inputStream = this.f82599p;
            int i14 = z.f70071a;
            int i15 = inputStream.read(bArr, 0, iMin);
            if (Thread.currentThread().isInterrupted()) {
                throw new HttpDataSource$HttpDataSourceException(new InterruptedIOException(), gVar, 2000, 1);
            }
            if (i15 == -1) {
                throw new HttpDataSource$HttpDataSourceException(gVar, 2008, 1);
            }
            j8 -= (long) i15;
            c(i15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0028 A[Catch: IOException -> 0x0032, TRY_LEAVE, TryCatch #0 {IOException -> 0x0032, blocks: (B:5:0x0004, B:7:0x000d, B:10:0x0017, B:11:0x001d, B:14:0x0028), top: B:19:0x0004 }] */
    @Override // androidx.media3.common.j
    public final int read(byte[] bArr, int i14, int i15) throws HttpDataSource$HttpDataSourceException {
        int i16;
        if (i15 == 0) {
            return 0;
        }
        try {
            long j8 = this.f82602s;
            if (j8 != -1) {
                long j14 = j8 - this.f82603t;
                if (j14 != 0) {
                    i15 = (int) Math.min(i15, j14);
                    InputStream inputStream = this.f82599p;
                    int i17 = z.f70071a;
                    i16 = inputStream.read(bArr, i14, i15);
                    if (i16 != -1) {
                        this.f82603t += (long) i16;
                        c(i16);
                        return i16;
                    }
                }
            } else {
                InputStream inputStream2 = this.f82599p;
                int i18 = z.f70071a;
                i16 = inputStream2.read(bArr, i14, i15);
                if (i16 != -1) {
                    this.f82603t += (long) i16;
                    c(i16);
                    return i16;
                }
            }
            return -1;
        } catch (IOException e4) {
            g gVar = this.f82597n;
            int i19 = z.f70071a;
            throw HttpDataSource$HttpDataSourceException.createForIOException(e4, gVar, 2);
        }
    }

    public static class c extends ForwardingMap<String, List<String>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<String, List<String>> f82610a;

        public c(Map<String, List<String>> map) {
            this.f82610a = map;
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public final boolean containsKey(Object obj) {
            return obj != null && super.containsKey(obj);
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public final boolean containsValue(Object obj) {
            return super.standardContainsValue(obj);
        }

        @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        public final Object delegate() {
            return this.f82610a;
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public final Set<Map.Entry<String, List<String>>> entrySet() {
            return Sets.filter(super.entrySet(), new j(0));
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public final boolean equals(Object obj) {
            return obj != null && super.standardEquals(obj);
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public final Object get(Object obj) {
            if (obj == null) {
                return null;
            }
            return (List) super.get(obj);
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public final int hashCode() {
            return super.standardHashCode();
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public final boolean isEmpty() {
            return super.isEmpty() || (super.size() == 1 && super.containsKey(null));
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public final Set<String> keySet() {
            return Sets.filter(super.keySet(), new j(1));
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public final int size() {
            return super.size() - (super.containsKey(null) ? 1 : 0);
        }

        @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        public final Map<String, List<String>> delegate() {
            return this.f82610a;
        }
    }
}

package com.amap.api.col.p0003sl;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.amap.api.services.core.AMapException;
import com.miui.tsmclient.service.DKFRequestService;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.smarthome.library.apache.http.protocol.HTTP;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import defpackage.gv5;
import defpackage.j0t;
import defpackage.j2t;
import defpackage.k0t;
import defpackage.m2t;
import defpackage.p0t;
import defpackage.p4t;
import defpackage.s5;
import defpackage.v4t;
import defpackage.v5t;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.io.PushbackInputStream;
import java.lang.ref.SoftReference;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.net.UnknownHostException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.GZIPInputStream;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLKeyException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import javax.net.ssl.SSLSession;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.http.conn.ConnectTimeoutException;

/* JADX INFO: loaded from: classes4.dex */
public final class d1 {
    public static SoftReference<SSLContext> s;
    public static SoftReference<e1> t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f5989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SSLContext f5990b;
    public Proxy c;
    public String g;
    public d h;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f5991k;
    public String l;
    public volatile boolean d = false;
    public long e = -1;
    public long f = 0;
    public String i = "";
    public boolean m = false;
    public boolean n = false;
    public String o = "";
    public String p = "";
    public String q = "";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public f f5992r = new f();

    public static class a implements Cloneable, Comparable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f5993a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f5994b;
        public String c;
        public String d;
        public String e;
        public int f;
        public int g;
        public int h;
        public long i;
        public volatile AtomicInteger j = new AtomicInteger(1);

        public a(c cVar) {
            this.f5994b = cVar.c;
            this.c = cVar.e;
            this.e = cVar.d;
            this.f = cVar.m;
            this.g = cVar.n;
            this.h = cVar.f5998b.a();
            this.d = cVar.f5997a;
            this.i = cVar.f;
            if (this.f == 10) {
                this.f5993a = 0;
            }
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a clone() {
            try {
                return (a) super.clone();
            } catch (CloneNotSupportedException unused) {
                return null;
            }
        }

        public final String b() {
            String str;
            String str2;
            String str3;
            String str4;
            try {
                String str5 = this.f + PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX;
                if (TextUtils.isEmpty(this.e)) {
                    str = str5 + "-#";
                } else {
                    str = str5 + this.e + PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX;
                }
                String str6 = (str + this.h + PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX) + this.j + PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX;
                if (TextUtils.isEmpty(this.f5994b)) {
                    str2 = str6 + "-#";
                } else {
                    str2 = str6 + this.f5994b + PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX;
                }
                if (this.f == 1) {
                    str3 = str2 + this.d + PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX;
                } else {
                    str3 = str2 + "-#";
                }
                if (this.f == 1) {
                    str4 = str3 + this.i + PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX;
                } else {
                    str4 = str3 + "-#";
                }
                String strF = j0t.f(p4t.a(((str4 + this.c + PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX) + this.g).getBytes(), "YXBtX25ldHdvcmtf".getBytes()));
                d1.s();
                return strF;
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return this.f5993a - ((a) obj).f5993a;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public HttpURLConnection f5995a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f5996b = this.f5996b;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f5996b = this.f5996b;

        public b(HttpURLConnection httpURLConnection) {
            this.f5995a = httpURLConnection;
        }
    }

    public static class c implements Cloneable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f5997a = "";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public la.b f5998b = la.b.FIRST_NONDEGRADE;
        public String c = "";
        public String d = "";
        public String e = "";
        public long f = 0;
        public long g = 0;
        public long h = 0;
        public long i = 0;
        public long j = 0;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public String f5999k = "-";
        public String l = "-";
        public int m = 0;
        public int n = 0;

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c clone() {
            try {
                return (c) super.clone();
            } catch (CloneNotSupportedException unused) {
                return null;
            }
        }

        public final String b() {
            String str;
            String str2;
            if (TextUtils.isEmpty(this.c)) {
                str = "-#";
            } else {
                str = this.c + PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX;
            }
            if (TextUtils.isEmpty(this.d)) {
                str2 = str + "-#";
            } else {
                str2 = str + this.d + PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX;
            }
            String strF = j0t.f(p4t.a(((((str2 + this.f5998b.a() + PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX) + this.h + PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX) + this.j + PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX) + this.f).getBytes(), "YXBtX25ldHdvcmtf".getBytes()));
            d1.s();
            return strF;
        }

        public final String toString() {
            return "RequestInfo{csid='" + this.f5997a + "', degradeType=" + this.f5998b + ", serverIp='" + this.c + "', path='" + this.d + "', hostname='" + this.e + "', totalTime=" + this.f + ", DNSTime=" + this.g + ", connectionTime=" + this.h + ", writeTime=" + this.i + ", readTime=" + this.j + ", serverTime='" + this.f5999k + "', datasize='" + this.l + "', errorcode=" + this.m + ", errorcodeSub=" + this.n + AbstractJsonLexerKt.END_OBJ;
        }
    }

    public static class e implements HostnameVerifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f6002a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f6003b;

        public e() {
        }

        public /* synthetic */ e(byte b2) {
            this();
        }

        public final String a() {
            return this.f6003b;
        }

        public final void b(String str) {
            String[] strArrSplit;
            if (TextUtils.isEmpty(this.f6002a) || !str.contains(":") || (strArrSplit = str.split(":")) == null || strArrSplit.length <= 0) {
                this.f6002a = str;
            } else {
                this.f6002a = strArrSplit[0];
            }
        }

        public final void c(String str) {
            this.f6003b = str;
        }

        @Override // javax.net.ssl.HostnameVerifier
        public final boolean verify(String str, SSLSession sSLSession) {
            HostnameVerifier defaultHostnameVerifier = HttpsURLConnection.getDefaultHostnameVerifier();
            if (TextUtils.isEmpty(this.f6002a)) {
                return !TextUtils.isEmpty(this.f6003b) ? defaultHostnameVerifier.verify(this.f6003b, sSLSession) : defaultHostnameVerifier.verify(str, sSLSession);
            }
            return this.f6002a.equals(str);
        }
    }

    public class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f6004a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f6005b = 0;
        public c c = new c();
        public a d;
        public c e;
        public String f;
        public URL g;

        public f() {
        }

        public final void a() {
            this.c.h = SystemClock.elapsedRealtime() - this.f6005b;
        }

        public final void b(int i) {
            "----errorcode-----".concat(String.valueOf(i));
            d1.s();
            try {
                this.c.f = SystemClock.elapsedRealtime() - this.f6004a;
                c cVar = this.c;
                cVar.m = i;
                if (cVar.f5998b.e()) {
                    x0.u(false, this.c.e);
                }
                boolean zV = d1.this.v(this.c.e);
                if (zV) {
                    if (d1.this.n && !TextUtils.isEmpty(d1.this.l) && this.c.f5998b.b()) {
                        x0.L();
                    }
                    if (this.c.f5998b.c()) {
                        x0.u(this.c.f5998b.c(), this.c.e);
                    }
                    x0.J(this.e);
                    x0.t(false, this.d);
                    x0.E(this.c);
                }
                x0.s(this.g.toString(), this.c.f5998b.c(), true, zV);
                this.c.toString();
                d1.s();
            } catch (Throwable unused) {
            }
        }

        public final void c(long j) {
            this.c.l = new DecimalFormat("0.00").format(j / 1024.0f);
        }

        public final void d(la laVar, URL url) {
            this.g = url;
            this.c.d = url.getPath();
            this.c.e = url.getHost();
            if (!TextUtils.isEmpty(d1.this.l) && laVar.getDegradeType().b()) {
                c cVar = this.c;
                cVar.c = cVar.e.replace("[", "").replace("]", "");
                this.c.e = d1.this.l;
            }
            if (laVar.getDegradeType().b()) {
                laVar.setNon_degrade_final_Host(this.c.e);
            }
            if (laVar.getDegradeType().d()) {
                this.f = laVar.getNon_degrade_final_Host();
            }
        }

        public final void e(v5t v5tVar) {
            c cVarClone;
            try {
                this.c.f = SystemClock.elapsedRealtime() - this.f6004a;
                if (v5tVar != null) {
                    v5tVar.f = this.c.f5998b.c();
                }
                if (this.c.f5998b.b()) {
                    c cVar = this.c;
                    if (cVar.f > 10000) {
                        x0.u(false, cVar.e);
                    }
                }
                if (this.c.f5998b.d()) {
                    x0.u(false, this.f);
                }
                boolean zV = d1.this.v(this.c.e);
                if (zV) {
                    x0.J(this.c);
                    x0.t(true, this.d);
                    c cVar2 = this.c;
                    if (cVar2.f > x0.s && (cVarClone = cVar2.clone()) != null) {
                        cVarClone.m = 1;
                        x0.E(cVarClone);
                        cVarClone.toString();
                        d1.s();
                    }
                }
                x0.s(this.g.toString(), this.c.f5998b.c(), false, zV);
                this.c.toString();
                d1.s();
            } catch (Throwable unused) {
            }
        }

        public final void f() {
            this.c.i = SystemClock.elapsedRealtime() - this.f6005b;
        }

        public final void g(int i) {
            this.c.n = i;
        }

        public final void h() {
            this.c.j = SystemClock.elapsedRealtime() - this.f6005b;
        }

        public final void i() {
            c cVarClone = this.c.clone();
            if (this.c.f > x0.s) {
                cVarClone.m = 1;
            }
            x0.n(cVarClone);
        }
    }

    public d1() {
        x0.O();
        try {
            this.g = UUID.randomUUID().toString().replaceAll("-", "").toLowerCase();
        } catch (Throwable th) {
            j2t.e(th, "ht", "ic");
        }
    }

    public static int a(Exception exc) {
        if (exc instanceof SSLHandshakeException) {
            return DKFRequestService.v0;
        }
        if (exc instanceof SSLKeyException) {
            return DKFRequestService.w0;
        }
        if (exc instanceof SSLProtocolException) {
            return DKFRequestService.x0;
        }
        if (exc instanceof SSLPeerUnverifiedException) {
            return 4104;
        }
        if (exc instanceof ConnectException) {
            return 6101;
        }
        if (exc instanceof SocketException) {
            return 6102;
        }
        if (exc instanceof ConnectTimeoutException) {
            return AMapException.CODE_AMAP_NEARBY_KEY_NOT_BIND;
        }
        return exc instanceof SocketTimeoutException ? 2102 : 0;
    }

    public static String d(String str) {
        s5.b();
        return str;
    }

    public static String e(String str, String str2) {
        String str3 = Build.MANUFACTURER;
        Context context = x0.g;
        return String.format("platform=Android&sdkversion=%s&product=%s&manufacture=%s&abitype=%s", str, str2, str3, context != null ? p0t.d(context) : "");
    }

    public static String f(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        HashMap<String, String> map2 = b1.e;
        if (map2 != null) {
            if (map != null) {
                map.putAll(map2);
            } else {
                map = map2;
            }
        }
        if (map == null || map.size() <= 0) {
            return str;
        }
        int iIndexOf = str.indexOf("?");
        if (iIndexOf >= 0) {
            HashMap map3 = new HashMap();
            String strSubstring = str.substring(iIndexOf);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (value == null) {
                    value = "";
                }
                if (!strSubstring.matches(".*[\\?\\&]" + URLEncoder.encode(key) + "=.*")) {
                    map3.put(key, value);
                }
            }
            map = map3;
        }
        if (map.size() == 0) {
            return str;
        }
        String strH = h(map);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        if (iIndexOf < 0) {
            stringBuffer.append("?");
        } else if (!str.endsWith("?") && !str.endsWith(gv5.CONNECT_STR)) {
            stringBuffer.append(gv5.CONNECT_STR);
        }
        if (strH != null) {
            stringBuffer.append(strH);
        }
        return stringBuffer.toString();
    }

    public static String g(HttpURLConnection httpURLConnection) {
        List<String> list;
        if (httpURLConnection == null) {
            return "";
        }
        try {
            Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
            if (headerFields != null && (list = headerFields.get("gsid")) != null && list.size() > 0) {
                return list.get(0);
            }
        } catch (Throwable unused) {
        }
        return "";
    }

    public static String h(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (value == null) {
                value = "";
            }
            if (sb.length() > 0) {
                sb.append(gv5.CONNECT_STR);
            }
            sb.append(URLEncoder.encode(key));
            sb.append("=");
            sb.append(URLEncoder.encode(value));
        }
        return sb.toString();
    }

    public static String q(Map<String, List<String>> map) {
        try {
            List<String> list = map.get("sc");
            if (list == null || list.size() <= 0) {
                return "";
            }
            String str = list.get(0);
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            if (!str.contains(PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX)) {
                return str;
            }
            String[] strArrSplit = str.split(PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX);
            return strArrSplit.length > 1 ? strArrSplit[0] : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public static void s() {
    }

    public static boolean y(String str) {
        return str.contains("rest") || str.contains("apilocate");
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01ef A[Catch: all -> 0x01f6, TRY_LEAVE, TryCatch #0 {all -> 0x01f6, blocks: (B:93:0x01d6, B:95:0x01da, B:98:0x01eb, B:100:0x01ef, B:97:0x01e0), top: B:130:0x01d6 }] */
    /* JADX WARN: Code duplicated, block: B:102:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:118:0x0237  */
    /* JADX WARN: Code duplicated, block: B:121:0x023d  */
    /* JADX WARN: Code duplicated, block: B:124:0x0261  */
    /* JADX WARN: Code duplicated, block: B:125:0x0270  */
    /* JADX WARN: Code duplicated, block: B:134:0x01f9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x005e  */
    /* JADX WARN: Code duplicated, block: B:21:0x0073  */
    /* JADX WARN: Code duplicated, block: B:76:0x0157  */
    /* JADX WARN: Code duplicated, block: B:79:0x0180 A[Catch: all -> 0x01aa, TryCatch #1 {all -> 0x01aa, blocks: (B:41:0x00c8, B:44:0x00e0, B:46:0x00e3, B:48:0x00e7, B:50:0x00ed, B:54:0x00f6, B:57:0x0102, B:59:0x0105, B:61:0x010b, B:71:0x0137, B:73:0x013d, B:75:0x0147, B:77:0x0158, B:79:0x0180, B:81:0x01a1, B:82:0x01a4, B:62:0x0121, B:64:0x0125, B:66:0x0128, B:68:0x012e, B:69:0x0133), top: B:132:0x00c8 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x01a1 A[Catch: all -> 0x01aa, TryCatch #1 {all -> 0x01aa, blocks: (B:41:0x00c8, B:44:0x00e0, B:46:0x00e3, B:48:0x00e7, B:50:0x00ed, B:54:0x00f6, B:57:0x0102, B:59:0x0105, B:61:0x010b, B:71:0x0137, B:73:0x013d, B:75:0x0147, B:77:0x0158, B:79:0x0180, B:81:0x01a1, B:82:0x01a4, B:62:0x0121, B:64:0x0125, B:66:0x0128, B:68:0x012e, B:69:0x0133), top: B:132:0x00c8 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:88:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:89:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:92:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:97:0x01e0 A[Catch: all -> 0x01f6, TryCatch #0 {all -> 0x01f6, blocks: (B:93:0x01d6, B:95:0x01da, B:98:0x01eb, B:100:0x01ef, B:97:0x01e0), top: B:130:0x01d6 }] */
    public final b b(la laVar, boolean z, boolean z2) throws IOException, ik {
        String str;
        boolean z3;
        URL url;
        URL url2;
        Proxy proxy;
        URLConnection uRLConnectionOpenConnection;
        HttpURLConnection httpURLConnection;
        SSLContext sSLContext;
        HttpsURLConnection httpsURLConnection;
        e1 e1VarW;
        SoftReference<SSLContext> softReference;
        SoftReference<SSLContext> softReference2;
        String str2;
        InetAddress[] allByName;
        String hostAddress;
        String host;
        f fVar = this.f5992r;
        la.b degradeType = laVar.getDegradeType();
        c cVar = fVar.c;
        cVar.f5997a = d1.this.g;
        cVar.f5998b = degradeType;
        fVar.f6004a = SystemClock.elapsedRealtime();
        Map<String, String> requestHead = laVar.getRequestHead();
        if (requestHead == null) {
            requestHead = new HashMap<>();
        }
        e eVarA = this.h.a(this.l);
        int i = b1.f5970a;
        String string = this.f5991k;
        Uri uri = Uri.parse(string);
        String host2 = uri.getHost();
        if (i != 1) {
            if (i != 2) {
                str = "";
            } else {
                HashMap<String, String> map = b1.c;
                str = map != null ? map.get(host2) : "";
                z3 = false;
            }
            if (!TextUtils.isEmpty(str)) {
                laVar.setHostToIP(false);
                string = uri.buildUpon().encodedAuthority(str).build().toString();
                if (z3) {
                    requestHead.put("targetHost", host2);
                    this.q = host2;
                }
                if (z3 && this.f5989a) {
                    eVarA.b(str);
                }
            }
            this.f5991k = string;
            url = new URL(this.f5991k);
            this.f5992r.d(laVar, url);
            if (y(url.getHost()) && laVar.isHostToIP()) {
                la.b degradeType2 = laVar.getDegradeType();
                str2 = this.f5992r.c.e;
                if (v(str2) && ((degradeType2.b() && x0.u) || (degradeType2.c() && x0.W(str2)))) {
                    try {
                        this.f5992r.f6005b = SystemClock.elapsedRealtime();
                        allByName = InetAddress.getAllByName(this.f5992r.c.e);
                        if (allByName != null || allByName.length <= 0 || allByName[0] == null) {
                            hostAddress = "";
                        } else {
                            boolean z4 = x0.v() && x0.K();
                            "---canUseIpv6---".concat(String.valueOf(z4));
                            if (!z4) {
                                int i2 = 0;
                                while (true) {
                                    if (i2 >= allByName.length) {
                                        hostAddress = "";
                                        break;
                                    }
                                    InetAddress inetAddress = allByName[i2];
                                    if (inetAddress instanceof Inet4Address) {
                                        hostAddress = inetAddress.getHostAddress();
                                        break;
                                    }
                                    i2++;
                                }
                            } else {
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= allByName.length) {
                                        hostAddress = "";
                                        break;
                                    }
                                    if (allByName[i3] instanceof Inet6Address) {
                                        hostAddress = "[" + allByName[i3].getHostAddress() + "]";
                                        break;
                                    }
                                    i3++;
                                }
                            }
                            if (TextUtils.isEmpty(hostAddress)) {
                                InetAddress inetAddress2 = allByName[0];
                                hostAddress = inetAddress2.getHostAddress();
                                if (inetAddress2 instanceof Inet6Address) {
                                    hostAddress = "[" + hostAddress + "]";
                                }
                            }
                        }
                        f fVar2 = this.f5992r;
                        "---onDNSEnd---ip=".concat(String.valueOf(hostAddress));
                        fVar2.c.c = hostAddress.replace("[", "").replace("]", "");
                        fVar2.c.g = SystemClock.elapsedRealtime() - fVar2.f6005b;
                        if (!TextUtils.isEmpty(hostAddress)) {
                            Uri uri2 = Uri.parse(this.f5991k);
                            host = uri2.getHost();
                            Uri uriBuild = uri2.buildUpon().encodedAuthority(hostAddress).build();
                            this.l = host;
                            requestHead.put(com.xiaomi.onetrack.api.b.E, host);
                            if (this.f5989a) {
                                eVarA.c(host);
                            }
                            this.f5991k = uriBuild.toString();
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
            if (this.f5989a) {
                this.f5991k = k0t.b(this.f5991k);
            }
            Objects.toString(laVar.getDegradeType());
            url2 = new URL(this.f5991k);
            proxy = this.c;
            if (proxy != null) {
                uRLConnectionOpenConnection = url2.openConnection(proxy);
            } else {
                uRLConnectionOpenConnection = url2.openConnection();
            }
            if (this.f5989a) {
                try {
                    softReference = s;
                    if (softReference != null || softReference.get() == null) {
                        s = new SoftReference<>(SSLContext.getInstance("TLS"));
                    }
                    softReference2 = s;
                    if (softReference2 != null) {
                        sSLContext = softReference2.get();
                    } else {
                        sSLContext = null;
                    }
                } catch (Throwable unused2) {
                }
                if (sSLContext == null) {
                    try {
                        sSLContext = SSLContext.getInstance("TLS");
                    } catch (Throwable th) {
                        j2t.e(th, "ht", "ne");
                    }
                }
                sSLContext.init(null, null, null);
                this.f5990b = sSLContext;
                httpsURLConnection = (HttpsURLConnection) uRLConnectionOpenConnection;
                if (x0.g.f6317a || (e1VarW = w()) == null) {
                    httpsURLConnection.setSSLSocketFactory(this.f5990b.getSocketFactory());
                } else {
                    httpsURLConnection.setSSLSocketFactory(e1VarW);
                    e1VarW.b();
                }
                httpsURLConnection.setHostnameVerifier(eVarA);
                httpURLConnection = httpsURLConnection;
            } else {
                httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            }
            if (Build.VERSION.SDK != null) {
                httpURLConnection.setRequestProperty(HTTP.CONN_DIRECTIVE, Constants.EXTRA_CLOSE_TAI);
            }
            int real_max_timeout = (int) (((long) laVar.getReal_max_timeout()) - (this.f5992r.c.g / 1000));
            n(requestHead, httpURLConnection, z2);
            httpURLConnection.setConnectTimeout(real_max_timeout);
            httpURLConnection.setReadTimeout(real_max_timeout);
            if (z) {
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setDoOutput(true);
            } else {
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setDoInput(true);
            }
            return new b(httpURLConnection);
        }
        str = b1.f5971b;
        z3 = true;
        if (!TextUtils.isEmpty(str)) {
            laVar.setHostToIP(false);
            string = uri.buildUpon().encodedAuthority(str).build().toString();
            if (z3) {
                requestHead.put("targetHost", host2);
                this.q = host2;
            }
            if (z3) {
                eVarA.b(str);
            }
        }
        this.f5991k = string;
        url = new URL(this.f5991k);
        this.f5992r.d(laVar, url);
        if (y(url.getHost())) {
            la.b degradeType3 = laVar.getDegradeType();
            str2 = this.f5992r.c.e;
            if (v(str2)) {
                this.f5992r.f6005b = SystemClock.elapsedRealtime();
                allByName = InetAddress.getAllByName(this.f5992r.c.e);
                if (allByName != null) {
                    hostAddress = "";
                } else {
                    hostAddress = "";
                }
                f fVar3 = this.f5992r;
                "---onDNSEnd---ip=".concat(String.valueOf(hostAddress));
                fVar3.c.c = hostAddress.replace("[", "").replace("]", "");
                fVar3.c.g = SystemClock.elapsedRealtime() - fVar3.f6005b;
                if (!TextUtils.isEmpty(hostAddress)) {
                    Uri uri3 = Uri.parse(this.f5991k);
                    host = uri3.getHost();
                    Uri uriBuild2 = uri3.buildUpon().encodedAuthority(hostAddress).build();
                    this.l = host;
                    requestHead.put(com.xiaomi.onetrack.api.b.E, host);
                    if (this.f5989a) {
                        eVarA.c(host);
                    }
                    this.f5991k = uriBuild2.toString();
                }
            }
        }
        if (this.f5989a) {
            this.f5991k = k0t.b(this.f5991k);
        }
        Objects.toString(laVar.getDegradeType());
        url2 = new URL(this.f5991k);
        proxy = this.c;
        if (proxy != null) {
            uRLConnectionOpenConnection = url2.openConnection(proxy);
        } else {
            uRLConnectionOpenConnection = url2.openConnection();
        }
        if (this.f5989a) {
            softReference = s;
            if (softReference != null) {
                s = new SoftReference<>(SSLContext.getInstance("TLS"));
            } else {
                s = new SoftReference<>(SSLContext.getInstance("TLS"));
            }
            softReference2 = s;
            if (softReference2 != null) {
                sSLContext = softReference2.get();
            } else {
                sSLContext = null;
            }
            if (sSLContext == null) {
                sSLContext = SSLContext.getInstance("TLS");
            }
            sSLContext.init(null, null, null);
            this.f5990b = sSLContext;
            httpsURLConnection = (HttpsURLConnection) uRLConnectionOpenConnection;
            if (x0.g.f6317a) {
                httpsURLConnection.setSSLSocketFactory(this.f5990b.getSocketFactory());
            } else {
                httpsURLConnection.setSSLSocketFactory(this.f5990b.getSocketFactory());
            }
            httpsURLConnection.setHostnameVerifier(eVarA);
            httpURLConnection = httpsURLConnection;
        } else {
            httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        }
        if (Build.VERSION.SDK != null) {
            httpURLConnection.setRequestProperty(HTTP.CONN_DIRECTIVE, Constants.EXTRA_CLOSE_TAI);
        }
        int real_max_timeout2 = (int) (((long) laVar.getReal_max_timeout()) - (this.f5992r.c.g / 1000));
        n(requestHead, httpURLConnection, z2);
        httpURLConnection.setConnectTimeout(real_max_timeout2);
        httpURLConnection.setReadTimeout(real_max_timeout2);
        if (z) {
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(true);
        } else {
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setDoInput(true);
        }
        return new b(httpURLConnection);
    }

    public final Map<String, String> i(la laVar) throws ik {
        String headerFieldKey;
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                z(laVar);
                this.f5991k = f(this.f5991k, laVar.getParams());
                HttpURLConnection httpURLConnection2 = b(laVar, false, false).f5995a;
                try {
                    this.f5992r.f6005b = SystemClock.elapsedRealtime();
                    httpURLConnection2.connect();
                    this.f5992r.a();
                    int responseCode = httpURLConnection2.getResponseCode();
                    if (responseCode >= 400) {
                        this.f5992r.g(responseCode);
                        this.f5992r.b(10);
                        ik ikVar = new ik("http读取header失败");
                        ikVar.a(responseCode);
                        throw ikVar;
                    }
                    HashMap map = new HashMap();
                    for (int i = 0; i < 50 && (headerFieldKey = httpURLConnection2.getHeaderFieldKey(i)) != null; i++) {
                        map.put(headerFieldKey.toLowerCase(), httpURLConnection2.getHeaderField(headerFieldKey));
                    }
                    this.f5992r.e(null);
                    try {
                        httpURLConnection2.disconnect();
                    } catch (Throwable th) {
                        j2t.e(th, "hth", "mgr");
                    }
                    this.f5992r.i();
                    return map;
                } catch (ik e2) {
                    e = e2;
                    this.f5992r.b(e.g());
                    throw e;
                } catch (MalformedURLException unused) {
                    this.f5992r.b(8);
                    throw new ik("url异常 - MalformedURLException");
                } catch (SocketException e3) {
                    e = e3;
                    this.f5992r.g(a(e));
                    this.f5992r.b(6);
                    throw new ik(com.amap.api.maps.AMapException.ERROR_SOCKET);
                } catch (SocketTimeoutException e4) {
                    e = e4;
                    this.f5992r.g(a(e));
                    this.f5992r.b(2);
                    throw new ik("socket 连接超时 - SocketTimeoutException");
                } catch (InterruptedIOException unused2) {
                    this.f5992r.g(7101);
                    this.f5992r.b(7);
                    throw new ik(com.amap.api.maps.AMapException.ERROR_UNKNOWN);
                } catch (ConnectException e5) {
                    e = e5;
                    this.f5992r.g(a(e));
                    this.f5992r.b(6);
                    throw new ik(com.amap.api.maps.AMapException.ERROR_CONNECTION);
                } catch (UnknownHostException unused3) {
                    this.f5992r.b(9);
                    throw new ik("未知主机 - UnKnowHostException");
                } catch (SSLException e6) {
                    e = e6;
                    e.printStackTrace();
                    this.f5992r.g(a(e));
                    this.f5992r.b(4);
                    throw new ik("IO 操作异常 - IOException");
                } catch (ConnectTimeoutException e7) {
                    e = e7;
                    e.printStackTrace();
                    this.f5992r.g(a(e));
                    this.f5992r.b(2);
                    throw new ik("IO 操作异常 - IOException");
                } catch (IOException unused4) {
                    this.f5992r.b(7);
                    throw new ik("IO 操作异常 - IOException");
                } catch (Throwable th2) {
                    th = th2;
                    this.f5992r.b(9);
                    th.printStackTrace();
                    throw new ik(com.amap.api.maps.AMapException.ERROR_UNKNOWN);
                }
            } catch (Throwable th3) {
                if (0 != 0) {
                    try {
                        httpURLConnection.disconnect();
                    } catch (Throwable th4) {
                        j2t.e(th4, "hth", "mgr");
                    }
                }
                this.f5992r.i();
                throw th3;
            }
        } catch (ik e8) {
            e = e8;
        } catch (ConnectException e9) {
            e = e9;
        } catch (SocketTimeoutException e10) {
            e = e10;
        } catch (ConnectTimeoutException e11) {
            e = e11;
        } catch (InterruptedIOException unused5) {
        } catch (MalformedURLException unused6) {
        } catch (SocketException e12) {
            e = e12;
        } catch (UnknownHostException unused7) {
        } catch (SSLException e13) {
            e = e13;
        } catch (IOException unused8) {
        } catch (Throwable th5) {
            th = th5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:152:0x0221 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:156:0x022c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:158:0x0237 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x0216 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x00bb A[PHI: r4
      0x00bb: PHI (r4v10 java.lang.String) = (r4v0 java.lang.String), (r4v26 java.lang.String), (r4v26 java.lang.String) binds: [B:4:0x001b, B:151:0x00bb, B:20:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.io.InputStream] */
    public final v5t j(b bVar, boolean z) throws Throwable {
        Throwable th;
        ?? r6;
        InputStream inputStream;
        PushbackInputStream pushbackInputStream;
        Object obj;
        boolean zP;
        InputStream inputStream2;
        InputStream inputStream3;
        char c2;
        String str = "";
        ByteArrayOutputStream byteArrayOutputStream = null;
        gZIPInputStream = null;
        gZIPInputStream = null;
        gZIPInputStream = null;
        InputStream gZIPInputStream = null;
        byteArrayOutputStream = null;
        byteArrayOutputStream = null;
        try {
            try {
                v4t.b();
                HttpURLConnection httpURLConnection = bVar.f5995a;
                Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                int responseCode = httpURLConnection.getResponseCode();
                if (headerFields == null) {
                    zP = false;
                } else {
                    List<String> list = headerFields.get("gsid");
                    if (list != null && list.size() > 0) {
                        str = list.get(0);
                    }
                    this.f5992r.c.f5999k = q(headerFields);
                    try {
                        if (TextUtils.isEmpty(this.i)) {
                            zP = false;
                        } else {
                            if (!this.m) {
                                zP = p(headerFields, true);
                                c2 = 2;
                            } else if (headerFields.containsKey("sc")) {
                                zP = p(headerFields, false);
                                c2 = 1;
                            } else {
                                x0.Q(this.i);
                                zP = false;
                                c2 = 0;
                            }
                            try {
                                if (zP) {
                                    if (this.i.equals("loc")) {
                                        String host = this.q;
                                        if (TextUtils.isEmpty(host)) {
                                            host = httpURLConnection.getURL().getHost();
                                        }
                                        x0.r(this.i, c2 == 2, host, host, this.l);
                                    } else {
                                        x0.F(this.i, c2 == 2);
                                    }
                                } else if (c2 == 1) {
                                    v4t.j(false, this.i);
                                }
                            } catch (Throwable unused) {
                            }
                        }
                    } catch (Throwable unused2) {
                    }
                }
                if (responseCode != 200) {
                    ik ikVar = new ik("网络异常原因：" + httpURLConnection.getResponseMessage() + " 网络异常状态码：" + responseCode + "  " + str + " " + this.g, str, this.g);
                    ikVar.a(httpURLConnection.getResponseMessage());
                    ikVar.a(headerFields);
                    this.f5992r.g(responseCode);
                    this.f5992r.b(10);
                    ikVar.h();
                    throw ikVar;
                }
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    this.f5992r.f6005b = SystemClock.elapsedRealtime();
                    inputStream = httpURLConnection.getInputStream();
                    try {
                        pushbackInputStream = new PushbackInputStream(inputStream, 2);
                        try {
                            byte[] bArr = new byte[2];
                            pushbackInputStream.read(bArr);
                            pushbackInputStream.unread(bArr);
                            gZIPInputStream = (bArr[0] == 31 && bArr[1] == -117 && !z) ? new GZIPInputStream(pushbackInputStream) : pushbackInputStream;
                            byte[] bArr2 = new byte[1024];
                            while (true) {
                                int i = gZIPInputStream.read(bArr2);
                                if (i == -1) {
                                    break;
                                }
                                byteArrayOutputStream2.write(bArr2, 0, i);
                            }
                            this.f5992r.h();
                            m2t.q();
                            v5t v5tVar = new v5t();
                            v5tVar.f36513a = byteArrayOutputStream2.toByteArray();
                            v5tVar.f36514b = headerFields;
                            v5tVar.c = this.g;
                            v5tVar.d = str;
                            v5tVar.e = zP;
                            v4t.h(httpURLConnection.getURL(), v5tVar);
                            this.f5992r.c(v5tVar.f36513a.length);
                            try {
                                byteArrayOutputStream2.close();
                            } catch (Throwable th2) {
                                j2t.e(th2, "ht", "par");
                            }
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (Throwable th3) {
                                    j2t.e(th3, "ht", "par");
                                }
                            }
                            try {
                                pushbackInputStream.close();
                            } catch (Throwable th4) {
                                j2t.e(th4, "ht", "par");
                            }
                            try {
                                gZIPInputStream.close();
                            } catch (Throwable th5) {
                                j2t.e(th5, "ht", "par");
                            }
                            return v5tVar;
                        } catch (SocketTimeoutException e2) {
                            e = e2;
                            throw e;
                        } catch (ConnectTimeoutException e3) {
                            e = e3;
                            throw e;
                        } catch (IOException e4) {
                            e = e4;
                            inputStream3 = gZIPInputStream;
                            byteArrayOutputStream = byteArrayOutputStream2;
                            obj = inputStream3;
                            try {
                                if (!(e instanceof InterruptedIOException)) {
                                    throw e;
                                }
                                ik ikVar2 = new ik("IO 操作异常 - IOException", str, this.g);
                                if (TextUtils.isEmpty(e.getMessage()) || !e.getMessage().equals("thread interrupted")) {
                                    throw ikVar2;
                                }
                                ikVar2.j();
                                throw ikVar2;
                            } catch (Throwable th6) {
                                th = th6;
                                th = th;
                                r6 = obj;
                                if (byteArrayOutputStream != null) {
                                    try {
                                        byteArrayOutputStream.close();
                                    } catch (Throwable th7) {
                                        j2t.e(th7, "ht", "par");
                                    }
                                }
                                if (inputStream != null) {
                                    try {
                                        inputStream.close();
                                    } catch (Throwable th8) {
                                        j2t.e(th8, "ht", "par");
                                    }
                                }
                                if (pushbackInputStream != null) {
                                    try {
                                        pushbackInputStream.close();
                                    } catch (Throwable th9) {
                                        j2t.e(th9, "ht", "par");
                                    }
                                }
                                if (r6 == 0) {
                                    throw th;
                                }
                                try {
                                    r6.close();
                                    throw th;
                                } catch (Throwable th10) {
                                    j2t.e(th10, "ht", "par");
                                    throw th;
                                }
                            }
                        } catch (Throwable th11) {
                            th = th11;
                            inputStream2 = gZIPInputStream;
                            byteArrayOutputStream = byteArrayOutputStream2;
                            r6 = inputStream2;
                            if (byteArrayOutputStream != null) {
                                byteArrayOutputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            if (pushbackInputStream != null) {
                                pushbackInputStream.close();
                            }
                            if (r6 == 0) {
                                throw th;
                            }
                            r6.close();
                            throw th;
                        }
                    } catch (SocketTimeoutException e5) {
                        e = e5;
                    } catch (ConnectTimeoutException e6) {
                        e = e6;
                    } catch (IOException e7) {
                        e = e7;
                        inputStream3 = null;
                        pushbackInputStream = null;
                    } catch (Throwable th12) {
                        th = th12;
                        inputStream2 = null;
                        pushbackInputStream = null;
                    }
                } catch (SocketTimeoutException e8) {
                    e = e8;
                } catch (ConnectTimeoutException e9) {
                    e = e9;
                } catch (IOException e10) {
                    e = e10;
                    inputStream3 = null;
                    inputStream = null;
                    pushbackInputStream = null;
                } catch (Throwable th13) {
                    th = th13;
                    inputStream2 = null;
                    inputStream = null;
                    pushbackInputStream = null;
                }
            } catch (Throwable th14) {
                th = th14;
                obj = "";
                th = th;
                r6 = obj;
                if (byteArrayOutputStream != null) {
                    byteArrayOutputStream.close();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
                if (pushbackInputStream != null) {
                    pushbackInputStream.close();
                }
                if (r6 == 0) {
                    throw th;
                }
                r6.close();
                throw th;
            }
        } catch (SocketTimeoutException e11) {
            throw e11;
        } catch (ConnectTimeoutException e12) {
            throw e12;
        } catch (IOException e13) {
            e = e13;
            obj = null;
            inputStream = null;
            pushbackInputStream = null;
        } catch (Throwable th15) {
            th = th15;
            r6 = 0;
            inputStream = null;
            pushbackInputStream = null;
        }
    }

    public final void k() {
        this.d = true;
    }

    public final void l(long j) {
        this.f = j;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x013e  */
    /* JADX WARN: Code duplicated, block: B:104:0x0144  */
    /* JADX WARN: Code duplicated, block: B:107:0x0148 A[Catch: all -> 0x00cc, ik -> 0x00d1, IOException -> 0x00d6, InterruptedIOException -> 0x00db, SocketTimeoutException -> 0x00e0, SocketException -> 0x00e5, UnknownHostException -> 0x00ea, MalformedURLException -> 0x00ef, ConnectTimeoutException -> 0x00f4, SSLException -> 0x00f9, ConnectException -> 0x00fe, TRY_ENTER, TRY_LEAVE, TryCatch #54 {ik -> 0x00d1, SocketTimeoutException -> 0x00e0, InterruptedIOException -> 0x00db, ConnectException -> 0x00fe, MalformedURLException -> 0x00ef, SocketException -> 0x00e5, UnknownHostException -> 0x00ea, SSLException -> 0x00f9, ConnectTimeoutException -> 0x00f4, IOException -> 0x00d6, all -> 0x00cc, blocks: (B:38:0x00bc, B:107:0x0148), top: B:596:0x00bc }] */
    /* JADX WARN: Code duplicated, block: B:120:0x0192 A[Catch: all -> 0x02ab, ik -> 0x02b5, IOException -> 0x02bf, InterruptedIOException -> 0x02c9, SocketTimeoutException -> 0x02d3, SocketException -> 0x02dd, UnknownHostException -> 0x02e7, MalformedURLException -> 0x02f1, ConnectTimeoutException -> 0x02fb, SSLException -> 0x0305, ConnectException -> 0x030f, TRY_ENTER, TRY_LEAVE, TryCatch #58 {ik -> 0x02b5, SocketTimeoutException -> 0x02d3, InterruptedIOException -> 0x02c9, ConnectException -> 0x030f, MalformedURLException -> 0x02f1, SocketException -> 0x02dd, UnknownHostException -> 0x02e7, SSLException -> 0x0305, ConnectTimeoutException -> 0x02fb, IOException -> 0x02bf, all -> 0x02ab, blocks: (B:96:0x0130, B:120:0x0192), top: B:588:0x0130 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0076  */
    /* JADX WARN: Code duplicated, block: B:521:0x0183 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:598:0x00ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x012f  */
    /* JADX WARN: Code duplicated, block: B:99:0x013c  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:124:0x01a7
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final void m(com.amap.api.col.p0003sl.la r19, com.amap.api.col.3sl.c1.a r20) {
        /*
            Method dump skipped, instruction units count: 1576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.col.p0003sl.d1.m(com.amap.api.col.3sl.la, com.amap.api.col.3sl.c1$a):void");
    }

    public final void n(Map<String, String> map, HttpURLConnection httpURLConnection, boolean z) {
        c cVarT;
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    httpURLConnection.addRequestProperty(str, map.get(str));
                }
            } catch (Throwable th) {
                j2t.e(th, "ht", "adh");
                return;
            }
        }
        HashMap<String, String> map2 = b1.d;
        if (map2 != null) {
            for (String str2 : map2.keySet()) {
                httpURLConnection.addRequestProperty(str2, b1.d.get(str2));
            }
        }
        String strF = "";
        if (z && !this.f5991k.contains("/v3/iasdkauth") && !TextUtils.isEmpty(this.i) && x0.N(this.i)) {
            this.m = true;
            x0.h hVarR = x0.R(this.i);
            httpURLConnection.addRequestProperty("lct", String.valueOf(hVarR.f6319a));
            httpURLConnection.addRequestProperty("lct-info", hVarR.f6320b);
            httpURLConnection.addRequestProperty("aks", x0.H(x0.f(this.i)));
            httpURLConnection.addRequestProperty("lct-args", e(x0.A(this.i) != null ? x0.A(this.i).e() : "", this.i));
        }
        httpURLConnection.addRequestProperty("csid", this.g);
        if (v(this.f5992r.c.e)) {
            f fVar = this.f5992r;
            if (!TextUtils.isEmpty(fVar.c.c)) {
                strF = j0t.f(p4t.a(fVar.c.c.getBytes(), "YXBtX25ldHdvcmtf".getBytes()));
                String str3 = fVar.c.c;
            }
            if (!TextUtils.isEmpty(strF)) {
                httpURLConnection.addRequestProperty("sip", strF);
            }
            if (x0.z && (cVarT = x0.T()) != null) {
                httpURLConnection.addRequestProperty("nls", cVarT.b());
                this.f5992r.e = cVarT;
            }
            a aVarS = x0.S();
            if (aVarS != null) {
                httpURLConnection.addRequestProperty("nlf", aVarS.b());
                this.f5992r.d = aVarS;
            }
        }
    }

    public final boolean p(Map<String, List<String>> map, boolean z) {
        List<String> list;
        try {
            List<String> list2 = map.get("sc");
            if (list2 == null || list2.size() <= 0) {
                return false;
            }
            String str = list2.get(0);
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            if (str.contains(PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX)) {
                String[] strArrSplit = str.split(PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX);
                if (strArrSplit.length <= 1 || !"1".equals(strArrSplit[1])) {
                    return false;
                }
            }
            if (!z) {
                return true;
            }
            if (!map.containsKey("lct") || (list = map.get("lct")) == null || list.size() <= 0) {
                return false;
            }
            return x0.w(this.i, x0.a(list));
        } catch (Throwable unused) {
            return false;
        }
    }

    public final v5t r(la laVar) throws ik {
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                try {
                    try {
                        try {
                            try {
                                try {
                                    z(laVar);
                                    String strF = f(this.f5991k, laVar.getParams());
                                    this.f5991k = strF;
                                    v5t v5tVarQ = v4t.q(strF, this.i);
                                    if (v5tVarQ != null) {
                                        this.f5992r.i();
                                        return v5tVarQ;
                                    }
                                    b bVarB = b(laVar, false, true);
                                    httpURLConnection = bVarB.f5995a;
                                    this.f5992r.f6005b = SystemClock.elapsedRealtime();
                                    httpURLConnection.connect();
                                    this.f5992r.a();
                                    v5t v5tVarJ = j(bVarB, laVar.isIgnoreGZip());
                                    this.f5992r.e(v5tVarJ);
                                    try {
                                        httpURLConnection.disconnect();
                                    } catch (Throwable th) {
                                        j2t.e(th, "ht", "mgr");
                                    }
                                    this.f5992r.i();
                                    return v5tVarJ;
                                } catch (Throwable th2) {
                                    th2.printStackTrace();
                                    this.f5992r.b(9);
                                    throw new ik(com.amap.api.maps.AMapException.ERROR_UNKNOWN);
                                }
                            } catch (SSLException e2) {
                                e2.printStackTrace();
                                this.f5992r.g(a(e2));
                                this.f5992r.b(4);
                                throw new ik("IO 操作异常 - IOException");
                            } catch (IOException unused) {
                                this.f5992r.b(7);
                                throw new ik("IO 操作异常 - IOException");
                            }
                        } catch (SocketTimeoutException e3) {
                            this.f5992r.g(a(e3));
                            this.f5992r.b(2);
                            throw new ik("socket 连接超时 - SocketTimeoutException");
                        } catch (ConnectTimeoutException e4) {
                            e4.printStackTrace();
                            this.f5992r.g(a(e4));
                            this.f5992r.b(2);
                            throw new ik("IO 操作异常 - IOException");
                        }
                    } catch (InterruptedIOException unused2) {
                        this.f5992r.g(7101);
                        this.f5992r.b(7);
                        throw new ik(com.amap.api.maps.AMapException.ERROR_UNKNOWN);
                    } catch (SocketException e5) {
                        this.f5992r.g(a(e5));
                        this.f5992r.b(6);
                        throw new ik(com.amap.api.maps.AMapException.ERROR_SOCKET);
                    }
                } catch (ConnectException e6) {
                    this.f5992r.g(a(e6));
                    this.f5992r.b(6);
                    throw new ik(com.amap.api.maps.AMapException.ERROR_CONNECTION);
                } catch (UnknownHostException unused3) {
                    this.f5992r.b(9);
                    throw new ik("未知主机 - UnKnowHostException");
                }
            } catch (ik e7) {
                if (!e7.i() && e7.g() != 10) {
                    this.f5992r.b(e7.f());
                }
                throw e7;
            } catch (MalformedURLException unused4) {
                this.f5992r.b(8);
                throw new ik("url异常 - MalformedURLException");
            }
        } catch (Throwable th3) {
            if (httpURLConnection != null) {
                try {
                    httpURLConnection.disconnect();
                } catch (Throwable th4) {
                    j2t.e(th4, "ht", "mgr");
                }
            }
            this.f5992r.i();
            throw th3;
        }
    }

    public final void t(long j) {
        this.e = j;
    }

    public final boolean v(String str) {
        if (this.j) {
            return true;
        }
        return (!TextUtils.isEmpty(this.l) && (this.l.contains("rest") || this.l.contains("apilocate"))) || y(str);
    }

    public final e1 w() {
        try {
            SoftReference<e1> softReference = t;
            if (softReference == null || softReference.get() == null) {
                t = new SoftReference<>(new e1(x0.g, this.f5990b));
            }
            e1 e1Var = s != null ? t.get() : null;
            return e1Var == null ? new e1(x0.g, this.f5990b) : e1Var;
        } catch (Throwable th) {
            m2t.r(th, "ht", "gsf");
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v17 */
    public final v5t x(la laVar) throws ik {
        OutputStream outputStream;
        ?? r7 = 0;
        r7 = 0;
        try {
            try {
                z(laVar);
                v5t v5tVarQ = v4t.q(this.f5991k, this.i);
                if (v5tVarQ != null) {
                    this.f5992r.i();
                    return v5tVarQ;
                }
                b bVarB = b(laVar, true, true);
                HttpURLConnection httpURLConnection = bVarB.f5995a;
                try {
                    this.f5992r.f6005b = SystemClock.elapsedRealtime();
                    httpURLConnection.connect();
                    this.f5992r.a();
                    byte[] entityBytes = laVar.getEntityBytes();
                    if (entityBytes == null || entityBytes.length == 0) {
                        Map<String, String> params = laVar.getParams();
                        HashMap<String, String> map = b1.e;
                        if (map != null) {
                            if (params != null) {
                                params.putAll(map);
                            } else {
                                params = map;
                            }
                        }
                        String strH = h(params);
                        if (!TextUtils.isEmpty(strH)) {
                            entityBytes = p0t.n(strH);
                        }
                    }
                    if (entityBytes != null && entityBytes.length > 0) {
                        try {
                            this.f5992r.f6005b = SystemClock.elapsedRealtime();
                            outputStream = httpURLConnection.getOutputStream();
                            try {
                                DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
                                try {
                                    dataOutputStream.write(entityBytes);
                                    dataOutputStream.close();
                                    if (outputStream != null) {
                                        outputStream.close();
                                    }
                                    this.f5992r.f();
                                } catch (Throwable th) {
                                    th = th;
                                    r7 = dataOutputStream;
                                    if (r7 != 0) {
                                        r7.close();
                                    }
                                    if (outputStream != null) {
                                        outputStream.close();
                                    }
                                    this.f5992r.f();
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            outputStream = null;
                        }
                    }
                    v5t v5tVarJ = j(bVarB, laVar.isIgnoreGZip());
                    this.f5992r.e(v5tVarJ);
                    try {
                        httpURLConnection.disconnect();
                    } catch (Throwable th4) {
                        j2t.e(th4, "ht", "mPt");
                    }
                    this.f5992r.i();
                    return v5tVarJ;
                } catch (ik e2) {
                    e = e2;
                } catch (InterruptedIOException unused) {
                    this.f5992r.g(7101);
                    this.f5992r.b(7);
                    throw new ik(com.amap.api.maps.AMapException.ERROR_UNKNOWN);
                } catch (ConnectException e3) {
                    e = e3;
                    e.printStackTrace();
                    this.f5992r.g(a(e));
                    this.f5992r.b(6);
                    throw new ik(com.amap.api.maps.AMapException.ERROR_CONNECTION);
                } catch (MalformedURLException e4) {
                    e = e4;
                    e.printStackTrace();
                    this.f5992r.b(8);
                    throw new ik("url异常 - MalformedURLException");
                } catch (SocketException e5) {
                    e = e5;
                    e.printStackTrace();
                    this.f5992r.g(a(e));
                    this.f5992r.b(6);
                    throw new ik(com.amap.api.maps.AMapException.ERROR_SOCKET);
                } catch (SocketTimeoutException e6) {
                    e = e6;
                    e.printStackTrace();
                    this.f5992r.g(a(e));
                    this.f5992r.b(2);
                    throw new ik("socket 连接超时 - SocketTimeoutException");
                } catch (UnknownHostException e7) {
                    e = e7;
                    e.printStackTrace();
                    this.f5992r.b(5);
                    throw new ik("未知主机 - UnKnowHostException");
                } catch (SSLException e8) {
                    e = e8;
                    e.printStackTrace();
                    this.f5992r.g(a(e));
                    this.f5992r.b(4);
                    throw new ik("IO 操作异常 - IOException");
                } catch (ConnectTimeoutException e9) {
                    e = e9;
                    e.printStackTrace();
                    this.f5992r.g(a(e));
                    this.f5992r.b(2);
                    throw new ik("IO 操作异常 - IOException");
                } catch (IOException e10) {
                    e = e10;
                    e.printStackTrace();
                    this.f5992r.b(7);
                    throw new ik("IO 操作异常 - IOException");
                } catch (Throwable th5) {
                    th = th5;
                    j2t.e(th, "ht", "mPt");
                    this.f5992r.b(9);
                    throw new ik(com.amap.api.maps.AMapException.ERROR_UNKNOWN);
                }
            } catch (Throwable th6) {
                if (0 != 0) {
                    try {
                        r7.disconnect();
                    } catch (Throwable th7) {
                        j2t.e(th7, "ht", "mPt");
                    }
                }
                this.f5992r.i();
                throw th6;
            }
        } catch (ik e11) {
            e = e11;
        } catch (InterruptedIOException unused2) {
        } catch (ConnectException e12) {
            e = e12;
        } catch (MalformedURLException e13) {
            e = e13;
        } catch (SocketException e14) {
            e = e14;
        } catch (SocketTimeoutException e15) {
            e = e15;
        } catch (UnknownHostException e16) {
            e = e16;
        } catch (SSLException e17) {
            e = e17;
        } catch (ConnectTimeoutException e18) {
            e = e18;
        } catch (IOException e19) {
            e = e19;
        } catch (Throwable th8) {
            th = th8;
        }
        if (!e.i() && e.g() != 10) {
            this.f5992r.b(e.g());
        }
        j2t.e(e, "ht", "mPt");
        throw e;
    }

    public final void z(la laVar) throws ik {
        this.h = new d((byte) 0);
        this.n = laVar.isIPV6Request();
        this.c = laVar.getProxy();
        laVar.getUrlConnectionImpl();
        this.j = laVar.isBinary();
        this.i = laVar.parseSdkNameFromRequest();
        this.f5989a = k0t.a().i(laVar.isHttps());
        String strB = laVar.getDegradeType().b() ? laVar.b() : laVar.a();
        this.f5991k = strB;
        String strD = d(strB);
        this.f5991k = strD;
        this.f5991k = v4t.a(strD, this.i);
        this.l = laVar.getIPDNSName();
        if ("loc".equals(this.i)) {
            String strA = laVar.a();
            String strB2 = laVar.b();
            if (!TextUtils.isEmpty(strA)) {
                try {
                    this.p = new URL(strA).getHost();
                } catch (Exception unused) {
                }
            }
            if (TextUtils.isEmpty(strB2)) {
                return;
            }
            try {
                if (TextUtils.isEmpty(this.l)) {
                    this.o = new URL(strB2).getHost();
                } else {
                    this.o = this.l;
                }
            } catch (Exception unused2) {
            }
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Vector<e> f6000a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile e f6001b;

        public d() {
            this.f6000a = new Vector<>();
            this.f6001b = new e((byte) 0);
        }

        public final e a(String str) {
            if (TextUtils.isEmpty(str)) {
                return this.f6001b;
            }
            byte b2 = 0;
            for (int i = 0; i < this.f6000a.size(); i++) {
                e eVar = this.f6000a.get(i);
                if (eVar != null && eVar.a().equals(str)) {
                    return eVar;
                }
            }
            e eVar2 = new e(b2);
            eVar2.c(str);
            this.f6000a.add(eVar2);
            return eVar2;
        }

        public /* synthetic */ d(byte b2) {
            this();
        }
    }
}

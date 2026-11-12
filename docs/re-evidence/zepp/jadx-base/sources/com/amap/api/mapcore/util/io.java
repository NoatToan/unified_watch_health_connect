package com.amap.api.mapcore.util;

import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.amap.api.maps.AMapException;
import com.huami.watch.companion.watchface.CostumeWatchFaceActivity;
import com.huami.watch.ota.UpdateUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
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
import org.apache.http.conn.ConnectTimeoutException;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes2.dex */
public final class io {
    private static SoftReference<SSLContext> k;
    private static SoftReference<ip> t;
    private boolean a;
    private SSLContext b;
    private Proxy c;
    private String g;
    private ik.a h;
    private d i;
    private boolean l;
    private String m;
    private String n;
    private volatile boolean d = false;
    private long e = -1;
    private long f = 0;
    private String j = "";
    private boolean o = false;
    private boolean p = false;
    private String q = "";
    private String r = "";
    private String s = "";
    private f u = new f();

    public static class a implements Cloneable, Comparable {
        public int a;
        public String b;
        public String c;
        public String d;
        public String e;
        public int f;
        public int g;
        public int h;
        public long i;
        public volatile AtomicInteger j = new AtomicInteger(1);

        public a(c cVar) {
            this.b = cVar.c;
            this.c = cVar.e;
            this.e = cVar.d;
            this.f = cVar.m;
            this.g = cVar.n;
            this.h = cVar.b.a();
            this.d = cVar.a;
            this.i = cVar.f;
            if (this.f == 10) {
                this.a = 0;
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
                String str5 = this.f + UpdateUtils.CMD_FILTER;
                if (TextUtils.isEmpty(this.e)) {
                    str = str5 + "-#";
                } else {
                    str = str5 + this.e + UpdateUtils.CMD_FILTER;
                }
                String str6 = (str + this.h + UpdateUtils.CMD_FILTER) + this.j + UpdateUtils.CMD_FILTER;
                if (TextUtils.isEmpty(this.b)) {
                    str2 = str6 + "-#";
                } else {
                    str2 = str6 + this.b + UpdateUtils.CMD_FILTER;
                }
                if (this.f == 1) {
                    str3 = str2 + this.d + UpdateUtils.CMD_FILTER;
                } else {
                    str3 = str2 + "-#";
                }
                if (this.f == 1) {
                    str4 = str3 + this.i + UpdateUtils.CMD_FILTER;
                } else {
                    str4 = str3 + "-#";
                }
                String strB = go.b(ia.a(((str4 + this.c + UpdateUtils.CMD_FILTER) + this.g).getBytes(), "YXBtX25ldHdvcmtf".getBytes()));
                io.b();
                return strB;
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return this.a - ((a) obj).a;
        }
    }

    public static class b {
        public HttpURLConnection a;
        public int b = this.b;
        public int b = this.b;

        public b(HttpURLConnection httpURLConnection) {
            this.a = httpURLConnection;
        }
    }

    public static class c implements Cloneable {
        public String a = "";
        public ir.b b = ir.b.FIRST_NONDEGRADE;
        public String c = "";
        public String d = "";
        public String e = "";
        public long f = 0;
        public long g = 0;
        public long h = 0;
        public long i = 0;
        public long j = 0;
        public String k = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
        public String l = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
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

        public final String toString() {
            return "RequestInfo{csid='" + this.a + "', degradeType=" + this.b + ", serverIp='" + this.c + "', path='" + this.d + "', hostname='" + this.e + "', totalTime=" + this.f + ", DNSTime=" + this.g + ", connectionTime=" + this.h + ", writeTime=" + this.i + ", readTime=" + this.j + ", serverTime='" + this.k + "', datasize='" + this.l + "', errorcode=" + this.m + ", errorcodeSub=" + this.n + '}';
        }
    }

    public static class e implements HostnameVerifier {
        private String a;
        private String b;

        private e() {
        }

        public final void a(String str) {
            this.a = str;
        }

        public final void b(String str) {
            this.b = str;
        }

        @Override // javax.net.ssl.HostnameVerifier
        public final boolean verify(String str, SSLSession sSLSession) {
            HostnameVerifier defaultHostnameVerifier = HttpsURLConnection.getDefaultHostnameVerifier();
            if (TextUtils.isEmpty(this.a)) {
                return !TextUtils.isEmpty(this.b) ? defaultHostnameVerifier.verify(this.b, sSLSession) : defaultHostnameVerifier.verify(str, sSLSession);
            }
            return this.a.equals(str);
        }

        public /* synthetic */ e(byte b) {
            this();
        }

        public final String a() {
            return this.b;
        }
    }

    public class f {
        public long a = 0;
        public long b = 0;
        public c c = new c();
        public a d;
        public c e;
        public String f;
        public URL g;

        public f() {
        }

        public final void a(ir irVar, URL url) {
            this.g = url;
            this.c.d = url.getPath();
            this.c.e = url.getHost();
            if (!TextUtils.isEmpty(io.this.n) && irVar.getDegradeType().b()) {
                c cVar = this.c;
                cVar.c = cVar.e.replace("[", "").replace("]", "");
                this.c.e = io.this.n;
            }
            if (irVar.getDegradeType().b()) {
                irVar.setNon_degrade_final_Host(this.c.e);
            }
            if (irVar.getDegradeType().d()) {
                this.f = irVar.getNon_degrade_final_Host();
            }
        }

        public final void b() {
            this.c.i = SystemClock.elapsedRealtime() - this.b;
        }

        public final void c() {
            this.c.j = SystemClock.elapsedRealtime() - this.b;
        }

        public final void d() {
            c cVarClone = this.c.clone();
            if (this.c.f > gk.e) {
                cVarClone.m = 1;
            }
            gk.a(cVarClone);
        }

        public final void b(int i) {
            this.c.n = i;
        }

        public final void a() {
            this.c.h = SystemClock.elapsedRealtime() - this.b;
        }

        public final void a(is isVar) {
            c cVarClone;
            try {
                this.c.f = SystemClock.elapsedRealtime() - this.a;
                if (isVar != null) {
                    isVar.f = this.c.b.c();
                }
                if (this.c.b.b()) {
                    c cVar = this.c;
                    if (cVar.f > 10000) {
                        gk.a(false, cVar.e);
                    }
                }
                if (this.c.b.d()) {
                    gk.a(false, this.f);
                }
                boolean zA = io.this.a(this.c.e);
                if (zA) {
                    gk.c(this.c);
                    gk.a(true, this.d);
                    c cVar2 = this.c;
                    if (cVar2.f > gk.e && (cVarClone = cVar2.clone()) != null) {
                        cVarClone.m = 1;
                        gk.b(cVarClone);
                        cVarClone.toString();
                        io.b();
                    }
                }
                gk.a(this.g.toString(), this.c.b.c(), false, zA);
                this.c.toString();
                io.b();
            } catch (Throwable unused) {
            }
        }

        public final void a(int i) {
            "----errorcode-----".concat(String.valueOf(i));
            io.b();
            try {
                this.c.f = SystemClock.elapsedRealtime() - this.a;
                c cVar = this.c;
                cVar.m = i;
                if (cVar.b.e()) {
                    gk.a(false, this.c.e);
                }
                boolean zA = io.this.a(this.c.e);
                if (zA) {
                    if (io.this.p && !TextUtils.isEmpty(io.this.n) && this.c.b.b()) {
                        gk.c();
                    }
                    if (this.c.b.c()) {
                        gk.a(this.c.b.c(), this.c.e);
                    }
                    gk.c(this.e);
                    gk.a(false, this.d);
                    gk.b(this.c);
                }
                gk.a(this.g.toString(), this.c.b.c(), true, zA);
                this.c.toString();
                io.b();
            } catch (Throwable unused) {
            }
        }

        public final void a(long j) {
            this.c.l = new DecimalFormat("0.00").format(j / 1024.0f);
        }
    }

    public io() {
        gk.d();
        try {
            this.g = UUID.randomUUID().toString().replaceAll(Constants.ACCEPT_TIME_SEPARATOR_SERVER, "").toLowerCase();
        } catch (Throwable th) {
            hk.a(th, "ht", "ic");
        }
    }

    public static void b() {
    }

    private void d(ir irVar) throws gi {
        this.i = new d((byte) 0);
        this.p = irVar.isIPV6Request();
        this.c = irVar.getProxy();
        this.h = irVar.getUrlConnectionImpl();
        this.l = irVar.isBinary();
        this.j = irVar.parseSdkNameFromRequest();
        this.a = gp.a().a(irVar.isHttps());
        String strB = irVar.getDegradeType().b() ? irVar.b() : irVar.a();
        this.m = strB;
        this.m = in.a(strB, this.j);
        this.n = irVar.getIPDNSName();
        if ("loc".equals(this.j)) {
            String strA = irVar.a();
            String strB2 = irVar.b();
            if (!TextUtils.isEmpty(strA)) {
                try {
                    this.r = new URL(strA).getHost();
                } catch (Exception unused) {
                }
            }
            if (TextUtils.isEmpty(strB2)) {
                return;
            }
            try {
                if (TextUtils.isEmpty(this.n)) {
                    this.q = new URL(strB2).getHost();
                } else {
                    this.q = this.n;
                }
            } catch (Exception unused2) {
            }
        }
    }

    public final is c(ir irVar) throws gi {
        HttpURLConnection httpURLConnection = null;
        DataOutputStream dataOutputStream = null;
        try {
            try {
                d(irVar);
                is isVarB = in.b(this.m, this.j);
                if (isVarB != null) {
                    this.u.d();
                    return isVarB;
                }
                b bVarA = a(irVar, true, true);
                HttpURLConnection httpURLConnection2 = bVarA.a;
                try {
                    this.u.b = SystemClock.elapsedRealtime();
                    httpURLConnection2.connect();
                    this.u.a();
                    byte[] bArrC = irVar.c();
                    if (bArrC != null && bArrC.length > 0) {
                        try {
                            this.u.b = SystemClock.elapsedRealtime();
                            DataOutputStream dataOutputStream2 = new DataOutputStream(httpURLConnection2.getOutputStream());
                            try {
                                dataOutputStream2.write(bArrC);
                                dataOutputStream2.close();
                                this.u.b();
                            } catch (Throwable th) {
                                th = th;
                                dataOutputStream = dataOutputStream2;
                                if (dataOutputStream != null) {
                                    dataOutputStream.close();
                                }
                                this.u.b();
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                    is isVarA = a(bVarA, irVar.isIgnoreGZip());
                    this.u.a(isVarA);
                    try {
                        httpURLConnection2.disconnect();
                    } catch (Throwable th3) {
                        hk.a(th3, "ht", "mPt");
                    }
                    this.u.d();
                    return isVarA;
                } catch (gi e2) {
                    e = e2;
                } catch (ConnectException e3) {
                    e = e3;
                    e.printStackTrace();
                    this.u.b(a(e));
                    this.u.a(6);
                    throw new gi(AMapException.ERROR_CONNECTION);
                } catch (MalformedURLException e4) {
                    e = e4;
                    e.printStackTrace();
                    this.u.a(8);
                    throw new gi(AMapException.ERROR_URL);
                } catch (SocketException e5) {
                    e = e5;
                    e.printStackTrace();
                    this.u.b(a(e));
                    this.u.a(6);
                    throw new gi(AMapException.ERROR_SOCKET);
                } catch (SocketTimeoutException e6) {
                    e = e6;
                    e.printStackTrace();
                    this.u.b(a(e));
                    this.u.a(2);
                    throw new gi(AMapException.ERROR_SOCKE_TIME_OUT);
                } catch (UnknownHostException e7) {
                    e = e7;
                    e.printStackTrace();
                    this.u.a(5);
                    throw new gi(AMapException.ERROR_UNKNOW_HOST);
                } catch (SSLException e8) {
                    e = e8;
                    e.printStackTrace();
                    this.u.b(a(e));
                    this.u.a(4);
                    throw new gi(AMapException.ERROR_IO);
                } catch (ConnectTimeoutException e9) {
                    e = e9;
                    e.printStackTrace();
                    this.u.b(a(e));
                    this.u.a(2);
                    throw new gi(AMapException.ERROR_IO);
                } catch (InterruptedIOException unused) {
                    this.u.b(7101);
                    this.u.a(7);
                    throw new gi(AMapException.ERROR_UNKNOWN);
                } catch (IOException e10) {
                    e = e10;
                    e.printStackTrace();
                    this.u.a(7);
                    throw new gi(AMapException.ERROR_IO);
                } catch (Throwable th4) {
                    th = th4;
                    hk.a(th, "ht", "mPt");
                    this.u.a(9);
                    throw new gi(AMapException.ERROR_UNKNOWN);
                }
            } catch (Throwable th5) {
                if (0 != 0) {
                    try {
                        httpURLConnection.disconnect();
                    } catch (Throwable th6) {
                        hk.a(th6, "ht", "mPt");
                    }
                }
                this.u.d();
                throw th5;
            }
        } catch (gi e11) {
            e = e11;
        } catch (MalformedURLException e12) {
            e = e12;
        } catch (SocketException e13) {
            e = e13;
        } catch (SocketTimeoutException e14) {
            e = e14;
        } catch (InterruptedIOException unused2) {
        } catch (ConnectException e15) {
            e = e15;
        } catch (UnknownHostException e16) {
            e = e16;
        } catch (SSLException e17) {
            e = e17;
        } catch (ConnectTimeoutException e18) {
            e = e18;
        } catch (IOException e19) {
            e = e19;
        } catch (Throwable th7) {
            th = th7;
        }
        if (!e.i() && e.g() != 10) {
            this.u.a(e.g());
        }
        hk.a(e, "ht", "mPt");
        throw e;
    }

    public final void b(long j) {
        this.e = j;
    }

    public static class d {
        private Vector<e> a;
        private volatile e b;

        private d() {
            this.a = new Vector<>();
            this.b = new e((byte) 0);
        }

        public final e a(String str) {
            if (TextUtils.isEmpty(str)) {
                return this.b;
            }
            byte b = 0;
            for (int i = 0; i < this.a.size(); i++) {
                e eVar = this.a.get(i);
                if (eVar != null && eVar.a().equals(str)) {
                    return eVar;
                }
            }
            e eVar2 = new e(b);
            eVar2.b(str);
            this.a.add(eVar2);
            return eVar2;
        }

        public /* synthetic */ d(byte b) {
            this();
        }
    }

    public final void a() {
        this.d = true;
    }

    public final is b(ir irVar) throws gi {
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                try {
                    try {
                        try {
                            try {
                                try {
                                    d(irVar);
                                    String strA = a(this.m, irVar.getParams());
                                    this.m = strA;
                                    is isVarB = in.b(strA, this.j);
                                    if (isVarB != null) {
                                        this.u.d();
                                        return isVarB;
                                    }
                                    b bVarA = a(irVar, false, true);
                                    httpURLConnection = bVarA.a;
                                    this.u.b = SystemClock.elapsedRealtime();
                                    httpURLConnection.connect();
                                    this.u.a();
                                    is isVarA = a(bVarA, irVar.isIgnoreGZip());
                                    this.u.a(isVarA);
                                    try {
                                        httpURLConnection.disconnect();
                                    } catch (Throwable th) {
                                        hk.a(th, "ht", "mgr");
                                    }
                                    this.u.d();
                                    return isVarA;
                                } catch (Throwable th2) {
                                    if (httpURLConnection != null) {
                                        try {
                                            httpURLConnection.disconnect();
                                        } catch (Throwable th3) {
                                            hk.a(th3, "ht", "mgr");
                                        }
                                    }
                                    this.u.d();
                                    throw th2;
                                }
                            } catch (Throwable th4) {
                                th4.printStackTrace();
                                this.u.a(9);
                                throw new gi(AMapException.ERROR_UNKNOWN);
                            }
                        } catch (MalformedURLException unused) {
                            this.u.a(8);
                            throw new gi(AMapException.ERROR_URL);
                        } catch (SSLException e2) {
                            e2.printStackTrace();
                            this.u.b(a(e2));
                            this.u.a(4);
                            throw new gi(AMapException.ERROR_IO);
                        }
                    } catch (SocketTimeoutException e3) {
                        this.u.b(a(e3));
                        this.u.a(2);
                        throw new gi(AMapException.ERROR_SOCKE_TIME_OUT);
                    } catch (UnknownHostException unused2) {
                        this.u.a(9);
                        throw new gi(AMapException.ERROR_UNKNOW_HOST);
                    }
                } catch (ConnectTimeoutException e4) {
                    e4.printStackTrace();
                    this.u.b(a(e4));
                    this.u.a(2);
                    throw new gi(AMapException.ERROR_IO);
                } catch (IOException unused3) {
                    this.u.a(7);
                    throw new gi(AMapException.ERROR_IO);
                }
            } catch (InterruptedIOException unused4) {
                this.u.b(7101);
                this.u.a(7);
                throw new gi(AMapException.ERROR_UNKNOWN);
            } catch (SocketException e5) {
                this.u.b(a(e5));
                this.u.a(6);
                throw new gi(AMapException.ERROR_SOCKET);
            }
        } catch (gi e6) {
            if (!e6.i() && e6.g() != 10) {
                this.u.a(e6.f());
            }
            throw e6;
        } catch (ConnectException e7) {
            this.u.b(a(e7));
            this.u.a(6);
            throw new gi(AMapException.ERROR_CONNECTION);
        }
    }

    public final void a(long j) {
        this.f = j;
    }

    private static String a(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String strA = a(map);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        if (strA != null) {
            stringBuffer.append("?");
            stringBuffer.append(strA);
        }
        return stringBuffer.toString();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x013b  */
    /* JADX WARN: Code duplicated, block: B:104:0x0141  */
    /* JADX WARN: Code duplicated, block: B:107:0x0145 A[Catch: all -> 0x00c9, gi -> 0x00cc, IOException -> 0x00cf, InterruptedIOException -> 0x00d2, SocketTimeoutException -> 0x00d5, SocketException -> 0x00d8, UnknownHostException -> 0x00db, MalformedURLException -> 0x00de, ConnectTimeoutException -> 0x00e1, SSLException -> 0x00e4, ConnectException -> 0x00e7, TRY_ENTER, TRY_LEAVE, TryCatch #55 {gi -> 0x00cc, SocketTimeoutException -> 0x00d5, InterruptedIOException -> 0x00d2, ConnectException -> 0x00e7, MalformedURLException -> 0x00de, SocketException -> 0x00d8, UnknownHostException -> 0x00db, SSLException -> 0x00e4, ConnectTimeoutException -> 0x00e1, IOException -> 0x00cf, all -> 0x00c9, blocks: (B:38:0x00bc, B:107:0x0145), top: B:616:0x00bc }] */
    /* JADX WARN: Code duplicated, block: B:119:0x0190 A[Catch: all -> 0x0299, gi -> 0x029f, IOException -> 0x02a5, InterruptedIOException -> 0x02ab, SocketTimeoutException -> 0x02b0, SocketException -> 0x02b6, UnknownHostException -> 0x02bc, MalformedURLException -> 0x02c2, ConnectTimeoutException -> 0x02c8, SSLException -> 0x02ce, ConnectException -> 0x02d4, TRY_ENTER, TRY_LEAVE, TryCatch #54 {gi -> 0x029f, InterruptedIOException -> 0x02ab, ConnectException -> 0x02d4, MalformedURLException -> 0x02c2, SocketException -> 0x02b6, SocketTimeoutException -> 0x02b0, UnknownHostException -> 0x02bc, SSLException -> 0x02ce, ConnectTimeoutException -> 0x02c8, IOException -> 0x02a5, all -> 0x0299, blocks: (B:96:0x012d, B:119:0x0190), top: B:618:0x012d }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0076  */
    /* JADX WARN: Code duplicated, block: B:541:0x0181 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:624:0x00ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x012c  */
    /* JADX WARN: Code duplicated, block: B:99:0x0139  */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x060c: IF  (r12 I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:520:0x0617, block:B:515:0x060c */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0617: IF  (r5 I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:525:0x0622, block:B:520:0x0617 */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x05fb: IF  (r8 I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:515:0x060c, block:B:508:0x05fb */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:123:0x01a5
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
    public final void a(com.amap.api.mapcore.util.ir r20, com.amap.api.mapcore.util.im.a r21) {
        /*
            Method dump skipped, instruction units count: 1576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore.util.io.a(com.amap.api.mapcore.util.ir, com.amap.api.mapcore.util.im$a):void");
    }

    private static String b(Map<String, List<String>> map) {
        try {
            List<String> list = map.get("sc");
            if (list == null || list.size() <= 0) {
                return "";
            }
            String str = list.get(0);
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            if (str.contains(UpdateUtils.CMD_FILTER)) {
                String[] strArrSplit = str.split(UpdateUtils.CMD_FILTER);
                if (strArrSplit.length <= 1) {
                    return "";
                }
                str = strArrSplit[0];
            }
            return str;
        } catch (Throwable unused) {
            return "";
        }
    }

    private static boolean b(String str) {
        return str.contains("rest") || str.contains("apilocate");
    }

    private ip c() {
        try {
            SoftReference<ip> softReference = t;
            if (softReference == null || softReference.get() == null) {
                t = new SoftReference<>(new ip(gk.c, this.b));
            }
            ip ipVar = k != null ? t.get() : null;
            return ipVar == null ? new ip(gk.c, this.b) : ipVar;
        } catch (Throwable th) {
            hn.c(th, "ht", "gsf");
            return null;
        }
    }

    public final Map<String, String> a(ir irVar) throws gi {
        String headerFieldKey;
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                d(irVar);
                this.m = a(this.m, irVar.getParams());
                HttpURLConnection httpURLConnection2 = a(irVar, false, false).a;
                try {
                    this.u.b = SystemClock.elapsedRealtime();
                    httpURLConnection2.connect();
                    this.u.a();
                    int responseCode = httpURLConnection2.getResponseCode();
                    if (responseCode < 400) {
                        HashMap map = new HashMap();
                        for (int i = 0; i < 50 && (headerFieldKey = httpURLConnection2.getHeaderFieldKey(i)) != null; i++) {
                            map.put(headerFieldKey.toLowerCase(), httpURLConnection2.getHeaderField(headerFieldKey));
                        }
                        this.u.a((is) null);
                        try {
                            httpURLConnection2.disconnect();
                        } catch (Throwable th) {
                            hk.a(th, "hth", "mgr");
                        }
                        this.u.d();
                        return map;
                    }
                    this.u.b(responseCode);
                    this.u.a(10);
                    gi giVar = new gi("http读取header失败");
                    giVar.a(responseCode);
                    throw giVar;
                } catch (gi e2) {
                    e = e2;
                    this.u.a(e.g());
                    throw e;
                } catch (ConnectTimeoutException e3) {
                    e = e3;
                    e.printStackTrace();
                    this.u.b(a(e));
                    this.u.a(2);
                    throw new gi(AMapException.ERROR_IO);
                } catch (InterruptedIOException unused) {
                    this.u.b(7101);
                    this.u.a(7);
                    throw new gi(AMapException.ERROR_UNKNOWN);
                } catch (ConnectException e4) {
                    e = e4;
                    this.u.b(a(e));
                    this.u.a(6);
                    throw new gi(AMapException.ERROR_CONNECTION);
                } catch (MalformedURLException unused2) {
                    this.u.a(8);
                    throw new gi(AMapException.ERROR_URL);
                } catch (SocketException e5) {
                    e = e5;
                    this.u.b(a(e));
                    this.u.a(6);
                    throw new gi(AMapException.ERROR_SOCKET);
                } catch (SocketTimeoutException e6) {
                    e = e6;
                    this.u.b(a(e));
                    this.u.a(2);
                    throw new gi(AMapException.ERROR_SOCKE_TIME_OUT);
                } catch (UnknownHostException unused3) {
                    this.u.a(9);
                    throw new gi(AMapException.ERROR_UNKNOW_HOST);
                } catch (SSLException e7) {
                    e = e7;
                    e.printStackTrace();
                    this.u.b(a(e));
                    this.u.a(4);
                    throw new gi(AMapException.ERROR_IO);
                } catch (IOException unused4) {
                    this.u.a(7);
                    throw new gi(AMapException.ERROR_IO);
                } catch (Throwable th2) {
                    th = th2;
                    this.u.a(9);
                    th.printStackTrace();
                    throw new gi(AMapException.ERROR_UNKNOWN);
                }
            } catch (Throwable th3) {
                if (0 != 0) {
                    try {
                        httpURLConnection.disconnect();
                    } catch (Throwable th4) {
                        hk.a(th4, "hth", "mgr");
                    }
                }
                this.u.d();
                throw th3;
            }
        } catch (gi e8) {
            e = e8;
        } catch (ConnectException e9) {
            e = e9;
        } catch (MalformedURLException unused5) {
        } catch (SocketException e10) {
            e = e10;
        } catch (SocketTimeoutException e11) {
            e = e11;
        } catch (ConnectTimeoutException e12) {
            e = e12;
        } catch (InterruptedIOException unused6) {
        } catch (UnknownHostException unused7) {
        } catch (SSLException e13) {
            e = e13;
        } catch (IOException unused8) {
        } catch (Throwable th5) {
            th = th5;
        }
    }

    private b a(ir irVar, boolean z, boolean z2) throws IOException, gi {
        SSLContext sSLContext;
        ip ipVarC;
        HttpURLConnection httpURLConnection;
        String hostAddress;
        f fVar = this.u;
        ir.b degradeType = irVar.getDegradeType();
        c cVar = fVar.c;
        cVar.a = io.this.g;
        cVar.b = degradeType;
        fVar.a = SystemClock.elapsedRealtime();
        Map<String, String> requestHead = irVar.getRequestHead();
        if (requestHead == null) {
            requestHead = new HashMap<>();
        }
        e eVarA = this.i.a(this.n);
        int i = ik.a;
        String string = this.m;
        String str = i != 1 ? "" : ik.b;
        if (!TextUtils.isEmpty(str)) {
            irVar.setHostToIP(false);
            Uri uri = Uri.parse(string);
            String host = uri.getHost();
            string = uri.buildUpon().encodedAuthority(str).build().toString();
            requestHead.put("targetHost", host);
            this.s = host;
            if (this.a) {
                eVarA.a(str);
            }
        }
        this.m = string;
        URL url = new URL(this.m);
        this.u.a(irVar, url);
        if (b(url.getHost()) && irVar.isHostToIP()) {
            ir.b degradeType2 = irVar.getDegradeType();
            String str2 = this.u.c.e;
            if (a(str2) && ((degradeType2.b() && gk.g) || (degradeType2.c() && gk.e(str2)))) {
                try {
                    this.u.b = SystemClock.elapsedRealtime();
                    InetAddress[] allByName = InetAddress.getAllByName(this.u.c.e);
                    if (allByName == null || allByName.length <= 0 || allByName[0] == null) {
                        hostAddress = "";
                    } else {
                        boolean z3 = gk.a() && gk.b();
                        "---canUseIpv6---".concat(String.valueOf(z3));
                        if (!z3) {
                            int i2 = 0;
                            while (true) {
                                if (i2 >= allByName.length) {
                                    hostAddress = "";
                                    break;
                                }
                                if (allByName[i2] instanceof Inet4Address) {
                                    hostAddress = allByName[i2].getHostAddress();
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
                            InetAddress inetAddress = allByName[0];
                            hostAddress = inetAddress.getHostAddress();
                            if (inetAddress instanceof Inet6Address) {
                                hostAddress = "[" + hostAddress + "]";
                            }
                        }
                    }
                    f fVar2 = this.u;
                    "---onDNSEnd---ip=".concat(String.valueOf(hostAddress));
                    fVar2.c.c = hostAddress.replace("[", "").replace("]", "");
                    fVar2.c.g = SystemClock.elapsedRealtime() - fVar2.b;
                    if (!TextUtils.isEmpty(hostAddress)) {
                        Uri uri2 = Uri.parse(this.m);
                        String host2 = uri2.getHost();
                        Uri uriBuild = uri2.buildUpon().encodedAuthority(hostAddress).build();
                        this.n = host2;
                        requestHead.put("host", host2);
                        if (this.a) {
                            eVarA.b(host2);
                        }
                        this.m = uriBuild.toString();
                    }
                } catch (Throwable unused) {
                }
            }
        }
        if (this.a) {
            this.m = gp.a(this.m);
        }
        Objects.toString(irVar.getDegradeType());
        URL url2 = new URL(this.m);
        ik.a aVar = this.h;
        URLConnection uRLConnectionA = aVar != null ? aVar.a() : null;
        if (uRLConnectionA == null) {
            Proxy proxy = this.c;
            if (proxy != null) {
                uRLConnectionA = url2.openConnection(proxy);
            } else {
                uRLConnectionA = url2.openConnection();
            }
        }
        if (this.a) {
            try {
                SoftReference<SSLContext> softReference = k;
                if (softReference == null || softReference.get() == null) {
                    k = new SoftReference<>(SSLContext.getInstance("TLS"));
                }
                SoftReference<SSLContext> softReference2 = k;
                sSLContext = softReference2 != null ? softReference2.get() : null;
            } catch (Throwable unused2) {
            }
            if (sSLContext == null) {
                try {
                    sSLContext = SSLContext.getInstance("TLS");
                } catch (Throwable th) {
                    hk.a(th, "ht", "ne");
                }
            }
            sSLContext.init(null, null, null);
            this.b = sSLContext;
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnectionA;
            if (gk.e.a && (ipVarC = c()) != null) {
                httpsURLConnection.setSSLSocketFactory(ipVarC);
                ipVarC.a();
            } else {
                httpsURLConnection.setSSLSocketFactory(this.b.getSocketFactory());
            }
            httpsURLConnection.setHostnameVerifier(eVarA);
            httpURLConnection = httpsURLConnection;
        } else {
            httpURLConnection = (HttpURLConnection) uRLConnectionA;
        }
        if (Build.VERSION.SDK != null && Build.VERSION.SDK_INT > 13) {
            httpURLConnection.setRequestProperty("Connection", "close");
        }
        int real_max_timeout = (int) (((long) irVar.getReal_max_timeout()) - (this.u.c.g / 1000));
        a(requestHead, httpURLConnection, z2);
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

    private static String a(HttpURLConnection httpURLConnection) {
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

    /* JADX WARN: Code duplicated, block: B:154:0x0221 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:158:0x022c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x020b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:0x0216 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x00a3 A[PHI: r4
      0x00a3: PHI (r4v10 java.lang.String) = (r4v0 java.lang.String), (r4v26 java.lang.String), (r4v26 java.lang.String) binds: [B:4:0x001b, B:152:0x00a3, B:12:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.io.InputStream] */
    private is a(b bVar, boolean z) throws Throwable {
        Throwable th;
        ?? r6;
        InputStream inputStream;
        PushbackInputStream pushbackInputStream;
        Object obj;
        boolean zA;
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
                in.a();
                HttpURLConnection httpURLConnection = bVar.a;
                Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                int responseCode = httpURLConnection.getResponseCode();
                if (headerFields == null) {
                    zA = false;
                } else {
                    List<String> list = headerFields.get("gsid");
                    if (list != null && list.size() > 0) {
                        str = list.get(0);
                    }
                    this.u.c.k = b(headerFields);
                    try {
                        if (TextUtils.isEmpty(this.j)) {
                            zA = false;
                        } else {
                            if (this.o) {
                                if (headerFields.containsKey("sc")) {
                                    zA = a(headerFields, false);
                                    c2 = 1;
                                } else {
                                    gk.b(this.j);
                                    zA = false;
                                    c2 = 0;
                                }
                            } else {
                                zA = a(headerFields, true);
                                c2 = 2;
                            }
                            try {
                                if (zA) {
                                    if (this.j.equals("loc")) {
                                        String host = this.s;
                                        if (TextUtils.isEmpty(host)) {
                                            host = httpURLConnection.getURL().getHost();
                                        }
                                        gk.a(this.j, c2 == 2, host, host, this.n);
                                    } else {
                                        gk.b(this.j, c2 == 2);
                                    }
                                } else if (c2 == 1) {
                                    in.a(false, this.j);
                                }
                            } catch (Throwable unused) {
                            }
                        }
                    } catch (Throwable unused2) {
                    }
                }
                if (responseCode == 200) {
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    try {
                        this.u.b = SystemClock.elapsedRealtime();
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
                                this.u.c();
                                hn.c();
                                is isVar = new is();
                                isVar.a = byteArrayOutputStream2.toByteArray();
                                isVar.b = headerFields;
                                isVar.c = this.g;
                                isVar.d = str;
                                isVar.e = zA;
                                in.a(httpURLConnection.getURL(), isVar);
                                this.u.a(isVar.a.length);
                                try {
                                    byteArrayOutputStream2.close();
                                } catch (Throwable th2) {
                                    hk.a(th2, "ht", "par");
                                }
                                if (inputStream != null) {
                                    try {
                                        inputStream.close();
                                    } catch (Throwable th3) {
                                        hk.a(th3, "ht", "par");
                                    }
                                }
                                try {
                                    pushbackInputStream.close();
                                } catch (Throwable th4) {
                                    hk.a(th4, "ht", "par");
                                }
                                try {
                                    gZIPInputStream.close();
                                } catch (Throwable th5) {
                                    hk.a(th5, "ht", "par");
                                }
                                return isVar;
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
                                    if (e instanceof InterruptedIOException) {
                                        gi giVar = new gi(AMapException.ERROR_IO, str, this.g);
                                        if (!TextUtils.isEmpty(e.getMessage()) && e.getMessage().equals("thread interrupted")) {
                                            giVar.j();
                                            throw giVar;
                                        }
                                        throw giVar;
                                    }
                                    throw e;
                                } catch (Throwable th6) {
                                    th = th6;
                                    th = th;
                                    r6 = obj;
                                    if (byteArrayOutputStream != null) {
                                        try {
                                            byteArrayOutputStream.close();
                                        } catch (Throwable th7) {
                                            hk.a(th7, "ht", "par");
                                        }
                                    }
                                    if (inputStream != null) {
                                        try {
                                            inputStream.close();
                                        } catch (Throwable th8) {
                                            hk.a(th8, "ht", "par");
                                        }
                                    }
                                    if (pushbackInputStream != null) {
                                        try {
                                            pushbackInputStream.close();
                                        } catch (Throwable th9) {
                                            hk.a(th9, "ht", "par");
                                        }
                                    }
                                    if (r6 != 0) {
                                        try {
                                            r6.close();
                                            throw th;
                                        } catch (Throwable th10) {
                                            hk.a(th10, "ht", "par");
                                            throw th;
                                        }
                                    }
                                    throw th;
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
                                if (r6 != 0) {
                                    r6.close();
                                    throw th;
                                }
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
                } else {
                    gi giVar2 = new gi("网络异常原因：" + httpURLConnection.getResponseMessage() + " 网络异常状态码：" + responseCode + "  " + str + " " + this.g, str, this.g);
                    giVar2.a(httpURLConnection.getResponseMessage());
                    giVar2.a(headerFields);
                    this.u.b(responseCode);
                    this.u.a(10);
                    giVar2.h();
                    throw giVar2;
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
                if (r6 != 0) {
                    r6.close();
                    throw th;
                }
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

    /* JADX WARN: Code duplicated, block: B:17:0x003c  */
    private boolean a(Map<String, List<String>> map, boolean z) {
        boolean z2;
        List<String> list;
        try {
            List<String> list2 = map.get("sc");
            if (list2 == null || list2.size() <= 0) {
                z2 = false;
            } else {
                String str = list2.get(0);
                if (TextUtils.isEmpty(str)) {
                    z2 = false;
                } else {
                    if (str.contains(UpdateUtils.CMD_FILTER)) {
                        String[] strArrSplit = str.split(UpdateUtils.CMD_FILTER);
                        if (strArrSplit.length <= 1 || !"1".equals(strArrSplit[1])) {
                            z2 = false;
                        }
                    }
                    z2 = true;
                }
            }
            if (!z2) {
                return false;
            }
            if (!z) {
                return true;
            }
            if (map.containsKey("lct") && (list = map.get("lct")) != null && list.size() > 0) {
                String str2 = list.get(0);
                if (!TextUtils.isEmpty(str2)) {
                    return gk.a(this.j, Long.valueOf(str2).longValue());
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private void a(Map<String, String> map, HttpURLConnection httpURLConnection, boolean z) {
        String str;
        c cVarF;
        if (map != null) {
            try {
                for (String str2 : map.keySet()) {
                    httpURLConnection.addRequestProperty(str2, map.get(str2));
                }
            } catch (Throwable th) {
                hk.a(th, "ht", "adh");
                return;
            }
        }
        if (z && !this.m.contains("/v3/iasdkauth") && !TextUtils.isEmpty(this.j) && gk.a(this.j)) {
            this.o = true;
            httpURLConnection.addRequestProperty("lct", String.valueOf(gk.c(this.j)));
        }
        httpURLConnection.addRequestProperty("csid", this.g);
        if (a(this.u.c.e)) {
            f fVar = this.u;
            if (TextUtils.isEmpty(fVar.c.c)) {
                str = "";
            } else {
                String strB = go.b(ia.a(fVar.c.c.getBytes(), "YXBtX25ldHdvcmtf".getBytes()));
                String str3 = fVar.c.c;
                str = strB;
            }
            if (!TextUtils.isEmpty(str)) {
                httpURLConnection.addRequestProperty("sip", str);
            }
            if (gk.j && (cVarF = gk.f()) != null) {
                String str4 = TextUtils.isEmpty(cVarF.c) ? "-#" : cVarF.c + UpdateUtils.CMD_FILTER;
                httpURLConnection.addRequestProperty("nls", go.b(ia.a((((((!TextUtils.isEmpty(cVarF.d) ? str4 + cVarF.d + UpdateUtils.CMD_FILTER : str4 + "-#") + cVarF.b.a() + UpdateUtils.CMD_FILTER) + cVarF.h + UpdateUtils.CMD_FILTER) + cVarF.j + UpdateUtils.CMD_FILTER) + cVarF.f).getBytes(), "YXBtX25ldHdvcmtf".getBytes())));
                this.u.e = cVarF;
            }
            a aVarE = gk.e();
            if (aVarE != null) {
                httpURLConnection.addRequestProperty("nlf", aVarE.b());
                this.u.d = aVarE;
            }
        }
    }

    public static String a(Map<String, String> map) {
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
                sb.append(com.alipay.sdk.m.s.a.l);
            }
            sb.append(URLEncoder.encode(key));
            sb.append(SearchCriteria.EQ);
            sb.append(URLEncoder.encode(value));
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(String str) {
        if (this.l) {
            return true;
        }
        return (!TextUtils.isEmpty(this.n) && (this.n.contains("rest") || this.n.contains("apilocate"))) || b(str);
    }

    private static int a(Exception exc) {
        if (exc instanceof SSLHandshakeException) {
            return 4101;
        }
        if (exc instanceof SSLKeyException) {
            return 4102;
        }
        if (exc instanceof SSLProtocolException) {
            return CostumeWatchFaceActivity.MSG_SYNC;
        }
        if (exc instanceof SSLPeerUnverifiedException) {
            return CostumeWatchFaceActivity.MSG_FILE_TRANSFER_FAILURE;
        }
        if (exc instanceof ConnectException) {
            return 6101;
        }
        if (exc instanceof SocketException) {
            return 6102;
        }
        if (exc instanceof ConnectTimeoutException) {
            return 2101;
        }
        return exc instanceof SocketTimeoutException ? 2102 : 0;
    }
}

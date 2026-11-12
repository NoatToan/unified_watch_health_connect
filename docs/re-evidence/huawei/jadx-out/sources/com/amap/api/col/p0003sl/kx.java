package com.amap.api.col.p0003sl;

import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.amap.api.maps.AMapException;
import com.amap.apis.utils.core.api.AMapUtilCoreApi;
import com.amap.apis.utils.core.api.NetProxy;
import com.huawei.openalliance.ad.constant.Constants;
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
import org.apache.http.conn.ConnectTimeoutException;

/* JADX INFO: loaded from: classes4.dex */
public final class kx {
    private static SoftReference<SSLContext> k;
    private static SoftReference<ky> t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f3001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SSLContext f3002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Proxy f3003c;
    private String g;
    private kt.a h;
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

    public static void b() {
    }

    private void d(la laVar) throws ik {
        this.i = new d((byte) 0);
        this.p = laVar.isIPV6Request();
        this.f3003c = laVar.getProxy();
        this.h = laVar.getUrlConnectionImpl();
        this.l = laVar.isBinary();
        this.j = laVar.parseSdkNameFromRequest();
        this.f3001a = ir.a().b(laVar.isHttps());
        String strB = laVar.getDegradeType().b() ? laVar.b() : laVar.a();
        this.m = strB;
        String strA = a(strB);
        this.m = strA;
        this.m = kw.a(strA, this.j);
        this.n = laVar.getIPDNSName();
        if ("loc".equals(this.j)) {
            String strA2 = laVar.a();
            String strB2 = laVar.b();
            if (!TextUtils.isEmpty(strA2)) {
                try {
                    this.r = new URL(strA2).getHost();
                } catch (Exception unused) {
                }
            }
            if (TextUtils.isEmpty(strB2)) {
                return;
            }
            try {
                if (!TextUtils.isEmpty(this.n)) {
                    this.q = this.n;
                } else {
                    this.q = new URL(strB2).getHost();
                }
            } catch (Exception unused2) {
            }
        }
    }

    private static String a(String str) {
        URL url;
        int i;
        NetProxy netProxy = AMapUtilCoreApi.getNetProxy();
        if (netProxy != null) {
            URL url2 = null;
            try {
                url = new URL(str);
            } catch (Exception e2) {
                e2.printStackTrace();
                url = null;
            }
            if (url != null) {
                String strOnHostProxy = netProxy.onHostProxy(url.getHost(), url.getPath());
                if (!TextUtils.isEmpty(strOnHostProxy)) {
                    String[] strArrSplit = strOnHostProxy.split(":");
                    int port = 0;
                    if (strArrSplit.length == 2) {
                        try {
                            i = Integer.parseInt(strArrSplit[1]);
                        } catch (Exception e3) {
                            e3.printStackTrace();
                            i = 0;
                        }
                        port = i;
                        strOnHostProxy = strArrSplit[0];
                    }
                    try {
                        String protocol = url.getProtocol();
                        if (port == 0) {
                            port = url.getPort();
                        }
                        url2 = new URL(protocol, strOnHostProxy, port, url.getFile().toString());
                    } catch (Exception e4) {
                        e4.printStackTrace();
                    }
                    if (url2 != null) {
                        return url2.toString();
                    }
                }
            }
        }
        return str;
    }

    kx() {
        im.e();
        try {
            this.g = UUID.randomUUID().toString().replaceAll(Constants.LINK, "").toLowerCase();
        } catch (Throwable th) {
            js.a(th, "ht", "ic");
        }
    }

    final void a() {
        this.d = true;
    }

    final void a(long j) {
        this.f = j;
    }

    final void b(long j) {
        this.e = j;
    }

    private static String a(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (kt.e != null) {
            if (map != null) {
                map.putAll(kt.e);
            } else {
                map = kt.e;
            }
        }
        if (map == null || map.size() <= 0) {
            return str;
        }
        int iIndexOf = str.indexOf("?");
        if (iIndexOf >= 0) {
            HashMap map2 = new HashMap();
            String strSubstring = str.substring(iIndexOf);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (value == null) {
                    value = "";
                }
                if (!strSubstring.matches(".*[\\?\\&]" + URLEncoder.encode(key) + "=.*")) {
                    map2.put(key, value);
                }
            }
            map = map2;
        }
        if (map.size() == 0) {
            return str;
        }
        String strA = a(map);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        if (iIndexOf >= 0) {
            if (!str.endsWith("?") && !str.endsWith("&")) {
                stringBuffer.append("&");
            }
        } else {
            stringBuffer.append("?");
        }
        if (strA != null) {
            stringBuffer.append(strA);
        }
        return stringBuffer.toString();
    }

    /* JADX WARN: Code duplicated, block: B:295:0x0355 A[Catch: all -> 0x04ce, TRY_ENTER, TRY_LEAVE, TryCatch #89 {all -> 0x04ce, blocks: (B:125:0x0171, B:167:0x0202, B:295:0x0355, B:313:0x0389, B:331:0x03ba, B:349:0x03f2, B:367:0x042c, B:385:0x0466, B:403:0x0497, B:421:0x04c9, B:441:0x050a, B:459:0x0547, B:477:0x0580), top: B:518:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:313:0x0389 A[Catch: all -> 0x04ce, TRY_ENTER, TRY_LEAVE, TryCatch #89 {all -> 0x04ce, blocks: (B:125:0x0171, B:167:0x0202, B:295:0x0355, B:313:0x0389, B:331:0x03ba, B:349:0x03f2, B:367:0x042c, B:385:0x0466, B:403:0x0497, B:421:0x04c9, B:441:0x050a, B:459:0x0547, B:477:0x0580), top: B:518:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:331:0x03ba A[Catch: all -> 0x04ce, TRY_ENTER, TRY_LEAVE, TryCatch #89 {all -> 0x04ce, blocks: (B:125:0x0171, B:167:0x0202, B:295:0x0355, B:313:0x0389, B:331:0x03ba, B:349:0x03f2, B:367:0x042c, B:385:0x0466, B:403:0x0497, B:421:0x04c9, B:441:0x050a, B:459:0x0547, B:477:0x0580), top: B:518:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0061  */
    /* JADX WARN: Code duplicated, block: B:349:0x03f2 A[Catch: all -> 0x04ce, TRY_ENTER, TRY_LEAVE, TryCatch #89 {all -> 0x04ce, blocks: (B:125:0x0171, B:167:0x0202, B:295:0x0355, B:313:0x0389, B:331:0x03ba, B:349:0x03f2, B:367:0x042c, B:385:0x0466, B:403:0x0497, B:421:0x04c9, B:441:0x050a, B:459:0x0547, B:477:0x0580), top: B:518:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:367:0x042c A[Catch: all -> 0x04ce, TRY_ENTER, TRY_LEAVE, TryCatch #89 {all -> 0x04ce, blocks: (B:125:0x0171, B:167:0x0202, B:295:0x0355, B:313:0x0389, B:331:0x03ba, B:349:0x03f2, B:367:0x042c, B:385:0x0466, B:403:0x0497, B:421:0x04c9, B:441:0x050a, B:459:0x0547, B:477:0x0580), top: B:518:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:385:0x0466 A[Catch: all -> 0x04ce, TRY_ENTER, TRY_LEAVE, TryCatch #89 {all -> 0x04ce, blocks: (B:125:0x0171, B:167:0x0202, B:295:0x0355, B:313:0x0389, B:331:0x03ba, B:349:0x03f2, B:367:0x042c, B:385:0x0466, B:403:0x0497, B:421:0x04c9, B:441:0x050a, B:459:0x0547, B:477:0x0580), top: B:518:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:403:0x0497 A[Catch: all -> 0x04ce, TRY_ENTER, TRY_LEAVE, TryCatch #89 {all -> 0x04ce, blocks: (B:125:0x0171, B:167:0x0202, B:295:0x0355, B:313:0x0389, B:331:0x03ba, B:349:0x03f2, B:367:0x042c, B:385:0x0466, B:403:0x0497, B:421:0x04c9, B:441:0x050a, B:459:0x0547, B:477:0x0580), top: B:518:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:421:0x04c9 A[Catch: all -> 0x04ce, TRY_ENTER, TRY_LEAVE, TryCatch #89 {all -> 0x04ce, blocks: (B:125:0x0171, B:167:0x0202, B:295:0x0355, B:313:0x0389, B:331:0x03ba, B:349:0x03f2, B:367:0x042c, B:385:0x0466, B:403:0x0497, B:421:0x04c9, B:441:0x050a, B:459:0x0547, B:477:0x0580), top: B:518:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:441:0x050a A[Catch: all -> 0x04ce, TRY_ENTER, TRY_LEAVE, TryCatch #89 {all -> 0x04ce, blocks: (B:125:0x0171, B:167:0x0202, B:295:0x0355, B:313:0x0389, B:331:0x03ba, B:349:0x03f2, B:367:0x042c, B:385:0x0466, B:403:0x0497, B:421:0x04c9, B:441:0x050a, B:459:0x0547, B:477:0x0580), top: B:518:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:459:0x0547 A[Catch: all -> 0x04ce, TRY_ENTER, TRY_LEAVE, TryCatch #89 {all -> 0x04ce, blocks: (B:125:0x0171, B:167:0x0202, B:295:0x0355, B:313:0x0389, B:331:0x03ba, B:349:0x03f2, B:367:0x042c, B:385:0x0466, B:403:0x0497, B:421:0x04c9, B:441:0x050a, B:459:0x0547, B:477:0x0580), top: B:518:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:477:0x0580 A[Catch: all -> 0x04ce, TRY_ENTER, TRY_LEAVE, TryCatch #89 {all -> 0x04ce, blocks: (B:125:0x0171, B:167:0x0202, B:295:0x0355, B:313:0x0389, B:331:0x03ba, B:349:0x03f2, B:367:0x042c, B:385:0x0466, B:403:0x0497, B:421:0x04c9, B:441:0x050a, B:459:0x0547, B:477:0x0580), top: B:518:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:503:0x0421 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:505:0x053c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:507:0x034a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:509:0x045b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:513:0x0575 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:515:0x037e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:520:0x048c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:526:0x03af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:528:0x04be A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:532:0x03e7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:536:0x04ff A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:538:0x04ee A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:542:0x052b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:544:0x0339 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:546:0x0410 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:548:0x044a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:550:0x04ad A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:552:0x0564 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:554:0x036d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:556:0x047b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:560:0x03d6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:562:0x039e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    final void a(la laVar, kv.a aVar) {
        DataOutputStream dataOutputStream;
        Throwable th;
        InputStream inputStream;
        HttpURLConnection httpURLConnection;
        Throwable th2;
        ConnectTimeoutException connectTimeoutException;
        SSLException sSLException;
        Throwable th3;
        SocketTimeoutException socketTimeoutException;
        SocketException socketException;
        Throwable th4;
        ConnectException connectException;
        Throwable th5;
        ik ikVar;
        boolean z;
        DataOutputStream dataOutputStream2;
        int i;
        try {
            try {
                if (aVar == null) {
                    return;
                }
                try {
                    d(laVar);
                    this.m = a(this.m, laVar.getParams());
                    byte[] entityBytes = laVar.getEntityBytes();
                    if (entityBytes != null) {
                        try {
                            if (entityBytes.length > 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                        } catch (ik e2) {
                            ikVar = e2;
                            httpURLConnection = null;
                            dataOutputStream = null;
                            inputStream = null;
                            this.u.a(ikVar.g());
                            aVar.onException(ikVar);
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (IOException e3) {
                                    js.a(e3, "ht", "mdr");
                                } catch (Throwable th6) {
                                    js.a(th6, "ht", "mdr");
                                }
                            }
                            if (httpURLConnection != null) {
                                try {
                                    httpURLConnection.disconnect();
                                } catch (Throwable th7) {
                                    js.a(th7, "ht", "mdr");
                                }
                            }
                            if (dataOutputStream != null) {
                                dataOutputStream.close();
                            }
                            this.u.d();
                        } catch (InterruptedIOException e4) {
                            th5 = e4;
                            httpURLConnection = null;
                            dataOutputStream = null;
                            inputStream = null;
                            this.u.b(7101);
                            this.u.a(7);
                            aVar.onException(th5);
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (IOException e5) {
                                    js.a(e5, "ht", "mdr");
                                } catch (Throwable th8) {
                                    js.a(th8, "ht", "mdr");
                                }
                            }
                            if (httpURLConnection != null) {
                                try {
                                    httpURLConnection.disconnect();
                                } catch (Throwable th9) {
                                    js.a(th9, "ht", "mdr");
                                }
                            }
                            if (dataOutputStream != null) {
                                dataOutputStream.close();
                            }
                            this.u.d();
                        } catch (ConnectException e6) {
                            connectException = e6;
                            httpURLConnection = null;
                            dataOutputStream = null;
                            inputStream = null;
                            this.u.b(a(connectException));
                            this.u.a(6);
                            aVar.onException(connectException);
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (IOException e7) {
                                    js.a(e7, "ht", "mdr");
                                } catch (Throwable th10) {
                                    js.a(th10, "ht", "mdr");
                                }
                            }
                            if (httpURLConnection != null) {
                                try {
                                    httpURLConnection.disconnect();
                                } catch (Throwable th11) {
                                    js.a(th11, "ht", "mdr");
                                }
                            }
                            if (dataOutputStream != null) {
                                dataOutputStream.close();
                            }
                            this.u.d();
                        } catch (MalformedURLException e8) {
                            th4 = e8;
                            httpURLConnection = null;
                            dataOutputStream = null;
                            inputStream = null;
                            this.u.a(8);
                            aVar.onException(th4);
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (IOException e9) {
                                    js.a(e9, "ht", "mdr");
                                } catch (Throwable th12) {
                                    js.a(th12, "ht", "mdr");
                                }
                            }
                            if (httpURLConnection != null) {
                                try {
                                    httpURLConnection.disconnect();
                                } catch (Throwable th13) {
                                    js.a(th13, "ht", "mdr");
                                }
                            }
                            if (dataOutputStream != null) {
                                dataOutputStream.close();
                            }
                            this.u.d();
                        } catch (SocketException e10) {
                            socketException = e10;
                            httpURLConnection = null;
                            dataOutputStream = null;
                            inputStream = null;
                            this.u.b(a(socketException));
                            this.u.a(6);
                            aVar.onException(socketException);
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (IOException e11) {
                                    js.a(e11, "ht", "mdr");
                                } catch (Throwable th14) {
                                    js.a(th14, "ht", "mdr");
                                }
                            }
                            if (httpURLConnection != null) {
                                try {
                                    httpURLConnection.disconnect();
                                } catch (Throwable th15) {
                                    js.a(th15, "ht", "mdr");
                                }
                            }
                            if (dataOutputStream != null) {
                                dataOutputStream.close();
                            }
                            this.u.d();
                        } catch (SocketTimeoutException e12) {
                            socketTimeoutException = e12;
                            httpURLConnection = null;
                            dataOutputStream = null;
                            inputStream = null;
                            this.u.b(a(socketTimeoutException));
                            this.u.a(2);
                            aVar.onException(socketTimeoutException);
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (IOException e13) {
                                    js.a(e13, "ht", "mdr");
                                } catch (Throwable th16) {
                                    js.a(th16, "ht", "mdr");
                                }
                            }
                            if (httpURLConnection != null) {
                                try {
                                    httpURLConnection.disconnect();
                                } catch (Throwable th17) {
                                    js.a(th17, "ht", "mdr");
                                }
                            }
                            if (dataOutputStream != null) {
                                dataOutputStream.close();
                            }
                            this.u.d();
                        } catch (UnknownHostException e14) {
                            th3 = e14;
                            httpURLConnection = null;
                            dataOutputStream = null;
                            inputStream = null;
                            this.u.a(5);
                            aVar.onException(th3);
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (IOException e15) {
                                    js.a(e15, "ht", "mdr");
                                } catch (Throwable th18) {
                                    js.a(th18, "ht", "mdr");
                                }
                            }
                            if (httpURLConnection != null) {
                                try {
                                    httpURLConnection.disconnect();
                                } catch (Throwable th19) {
                                    js.a(th19, "ht", "mdr");
                                }
                            }
                            if (dataOutputStream != null) {
                                dataOutputStream.close();
                            }
                            this.u.d();
                        } catch (SSLException e16) {
                            sSLException = e16;
                            httpURLConnection = null;
                            dataOutputStream = null;
                            inputStream = null;
                            sSLException.printStackTrace();
                            this.u.b(a(sSLException));
                            this.u.a(4);
                            aVar.onException(sSLException);
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (IOException e17) {
                                    js.a(e17, "ht", "mdr");
                                } catch (Throwable th20) {
                                    js.a(th20, "ht", "mdr");
                                }
                            }
                            if (httpURLConnection != null) {
                                try {
                                    httpURLConnection.disconnect();
                                } catch (Throwable th21) {
                                    js.a(th21, "ht", "mdr");
                                }
                            }
                            if (dataOutputStream != null) {
                                dataOutputStream.close();
                            }
                            this.u.d();
                        } catch (ConnectTimeoutException e18) {
                            connectTimeoutException = e18;
                            httpURLConnection = null;
                            dataOutputStream = null;
                            inputStream = null;
                            connectTimeoutException.printStackTrace();
                            this.u.b(a(connectTimeoutException));
                            this.u.a(2);
                            aVar.onException(connectTimeoutException);
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (IOException e19) {
                                    js.a(e19, "ht", "mdr");
                                } catch (Throwable th22) {
                                    js.a(th22, "ht", "mdr");
                                }
                            }
                            if (httpURLConnection != null) {
                                try {
                                    httpURLConnection.disconnect();
                                } catch (Throwable th23) {
                                    js.a(th23, "ht", "mdr");
                                }
                            }
                            if (dataOutputStream != null) {
                                dataOutputStream.close();
                            }
                            this.u.d();
                        } catch (IOException e20) {
                            th2 = e20;
                            httpURLConnection = null;
                            dataOutputStream = null;
                            inputStream = null;
                            this.u.a(7);
                            aVar.onException(th2);
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (IOException e21) {
                                    js.a(e21, "ht", "mdr");
                                } catch (Throwable th24) {
                                    js.a(th24, "ht", "mdr");
                                }
                            }
                            if (httpURLConnection != null) {
                                try {
                                    httpURLConnection.disconnect();
                                } catch (Throwable th25) {
                                    js.a(th25, "ht", "mdr");
                                }
                            }
                            if (dataOutputStream != null) {
                                dataOutputStream.close();
                            }
                            this.u.d();
                        } catch (Throwable th26) {
                            th = th26;
                            httpURLConnection = null;
                            dataOutputStream = null;
                            inputStream = null;
                            this.u.a(9);
                            aVar.onException(th);
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (IOException e22) {
                                    js.a(e22, "ht", "mdr");
                                } catch (Throwable th27) {
                                    js.a(th27, "ht", "mdr");
                                }
                            }
                            if (httpURLConnection != null) {
                                try {
                                    httpURLConnection.disconnect();
                                } catch (Throwable th28) {
                                    js.a(th28, "ht", "mdr");
                                }
                            }
                            if (dataOutputStream != null) {
                                dataOutputStream.close();
                            }
                            this.u.d();
                        }
                    } else {
                        z = false;
                    }
                    httpURLConnection = a(laVar, z, false).f3007a;
                    try {
                        httpURLConnection.setRequestProperty("RANGE", "bytes=" + this.f + Constants.LINK);
                        this.u.f3017b = SystemClock.elapsedRealtime();
                        httpURLConnection.connect();
                        this.u.a();
                        if (z) {
                            try {
                                this.u.f3017b = SystemClock.elapsedRealtime();
                                OutputStream outputStream = httpURLConnection.getOutputStream();
                                dataOutputStream = new DataOutputStream(outputStream);
                                try {
                                    dataOutputStream.write(entityBytes);
                                    dataOutputStream.close();
                                    outputStream.close();
                                    this.u.b();
                                } catch (ik e23) {
                                    ikVar = e23;
                                    inputStream = null;
                                } catch (InterruptedIOException e24) {
                                    th5 = e24;
                                    inputStream = null;
                                    this.u.b(7101);
                                    this.u.a(7);
                                    aVar.onException(th5);
                                    if (inputStream != null) {
                                        inputStream.close();
                                    }
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                    }
                                    if (dataOutputStream != null) {
                                        dataOutputStream.close();
                                    }
                                    this.u.d();
                                } catch (ConnectException e25) {
                                    connectException = e25;
                                    inputStream = null;
                                    this.u.b(a(connectException));
                                    this.u.a(6);
                                    aVar.onException(connectException);
                                    if (inputStream != null) {
                                        inputStream.close();
                                    }
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                    }
                                    if (dataOutputStream != null) {
                                        dataOutputStream.close();
                                    }
                                    this.u.d();
                                } catch (MalformedURLException e26) {
                                    th4 = e26;
                                    inputStream = null;
                                    this.u.a(8);
                                    aVar.onException(th4);
                                    if (inputStream != null) {
                                        inputStream.close();
                                    }
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                    }
                                    if (dataOutputStream != null) {
                                        dataOutputStream.close();
                                    }
                                    this.u.d();
                                } catch (SocketException e27) {
                                    socketException = e27;
                                    inputStream = null;
                                    this.u.b(a(socketException));
                                    this.u.a(6);
                                    aVar.onException(socketException);
                                    if (inputStream != null) {
                                        inputStream.close();
                                    }
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                    }
                                    if (dataOutputStream != null) {
                                        dataOutputStream.close();
                                    }
                                    this.u.d();
                                } catch (SocketTimeoutException e28) {
                                    socketTimeoutException = e28;
                                    inputStream = null;
                                    this.u.b(a(socketTimeoutException));
                                    this.u.a(2);
                                    aVar.onException(socketTimeoutException);
                                    if (inputStream != null) {
                                        inputStream.close();
                                    }
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                    }
                                    if (dataOutputStream != null) {
                                        dataOutputStream.close();
                                    }
                                    this.u.d();
                                } catch (UnknownHostException e29) {
                                    th3 = e29;
                                    inputStream = null;
                                    this.u.a(5);
                                    aVar.onException(th3);
                                    if (inputStream != null) {
                                        inputStream.close();
                                    }
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                    }
                                    if (dataOutputStream != null) {
                                        dataOutputStream.close();
                                    }
                                    this.u.d();
                                } catch (SSLException e30) {
                                    sSLException = e30;
                                    inputStream = null;
                                    sSLException.printStackTrace();
                                    this.u.b(a(sSLException));
                                    this.u.a(4);
                                    aVar.onException(sSLException);
                                    if (inputStream != null) {
                                        inputStream.close();
                                    }
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                    }
                                    if (dataOutputStream != null) {
                                        dataOutputStream.close();
                                    }
                                    this.u.d();
                                } catch (ConnectTimeoutException e31) {
                                    connectTimeoutException = e31;
                                    inputStream = null;
                                    connectTimeoutException.printStackTrace();
                                    this.u.b(a(connectTimeoutException));
                                    this.u.a(2);
                                    aVar.onException(connectTimeoutException);
                                    if (inputStream != null) {
                                        inputStream.close();
                                    }
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                    }
                                    if (dataOutputStream != null) {
                                        dataOutputStream.close();
                                    }
                                    this.u.d();
                                } catch (IOException e32) {
                                    th2 = e32;
                                    inputStream = null;
                                    this.u.a(7);
                                    aVar.onException(th2);
                                    if (inputStream != null) {
                                        inputStream.close();
                                    }
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                    }
                                    if (dataOutputStream != null) {
                                        dataOutputStream.close();
                                    }
                                    this.u.d();
                                } catch (Throwable th29) {
                                    th = th29;
                                    inputStream = null;
                                    this.u.a(9);
                                    aVar.onException(th);
                                    if (inputStream != null) {
                                        inputStream.close();
                                    }
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                    }
                                    if (dataOutputStream != null) {
                                        dataOutputStream.close();
                                    }
                                    this.u.d();
                                }
                            } catch (ik e33) {
                                ikVar = e33;
                                dataOutputStream = null;
                                inputStream = null;
                            } catch (ConnectException e34) {
                                connectException = e34;
                                dataOutputStream = null;
                                inputStream = null;
                                this.u.b(a(connectException));
                                this.u.a(6);
                                aVar.onException(connectException);
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                if (dataOutputStream != null) {
                                    dataOutputStream.close();
                                }
                                this.u.d();
                            } catch (SocketTimeoutException e35) {
                                socketTimeoutException = e35;
                                dataOutputStream = null;
                                inputStream = null;
                                this.u.b(a(socketTimeoutException));
                                this.u.a(2);
                                aVar.onException(socketTimeoutException);
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                if (dataOutputStream != null) {
                                    dataOutputStream.close();
                                }
                                this.u.d();
                            } catch (InterruptedIOException e36) {
                                th5 = e36;
                                dataOutputStream = null;
                                inputStream = null;
                                this.u.b(7101);
                                this.u.a(7);
                                aVar.onException(th5);
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                if (dataOutputStream != null) {
                                    dataOutputStream.close();
                                }
                                this.u.d();
                            } catch (MalformedURLException e37) {
                                th4 = e37;
                                dataOutputStream = null;
                                inputStream = null;
                                this.u.a(8);
                                aVar.onException(th4);
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                if (dataOutputStream != null) {
                                    dataOutputStream.close();
                                }
                                this.u.d();
                            } catch (SocketException e38) {
                                socketException = e38;
                                dataOutputStream = null;
                                inputStream = null;
                                this.u.b(a(socketException));
                                this.u.a(6);
                                aVar.onException(socketException);
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                if (dataOutputStream != null) {
                                    dataOutputStream.close();
                                }
                                this.u.d();
                            } catch (UnknownHostException e39) {
                                th3 = e39;
                                dataOutputStream = null;
                                inputStream = null;
                                this.u.a(5);
                                aVar.onException(th3);
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                if (dataOutputStream != null) {
                                    dataOutputStream.close();
                                }
                                this.u.d();
                            } catch (SSLException e40) {
                                sSLException = e40;
                                dataOutputStream = null;
                                inputStream = null;
                                sSLException.printStackTrace();
                                this.u.b(a(sSLException));
                                this.u.a(4);
                                aVar.onException(sSLException);
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                if (dataOutputStream != null) {
                                    dataOutputStream.close();
                                }
                                this.u.d();
                            } catch (ConnectTimeoutException e41) {
                                connectTimeoutException = e41;
                                dataOutputStream = null;
                                inputStream = null;
                                connectTimeoutException.printStackTrace();
                                this.u.b(a(connectTimeoutException));
                                this.u.a(2);
                                aVar.onException(connectTimeoutException);
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                if (dataOutputStream != null) {
                                    dataOutputStream.close();
                                }
                                this.u.d();
                            } catch (IOException e42) {
                                th2 = e42;
                                dataOutputStream = null;
                                inputStream = null;
                                this.u.a(7);
                                aVar.onException(th2);
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                if (dataOutputStream != null) {
                                    dataOutputStream.close();
                                }
                                this.u.d();
                            } catch (Throwable th30) {
                                th = th30;
                                dataOutputStream = null;
                                inputStream = null;
                                this.u.a(9);
                                aVar.onException(th);
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                if (dataOutputStream != null) {
                                    dataOutputStream.close();
                                }
                                this.u.d();
                            }
                        } else {
                            dataOutputStream = null;
                        }
                        try {
                            String strA = a(httpURLConnection);
                            int responseCode = httpURLConnection.getResponseCode();
                            if ((responseCode != 200) && (responseCode != 206)) {
                                this.u.b(responseCode);
                                this.u.a(10);
                                aVar.onException(new ik("网络异常原因：" + httpURLConnection.getResponseMessage() + " 网络异常状态码：" + responseCode, strA, this.g));
                                if (httpURLConnection != null) {
                                    try {
                                        httpURLConnection.disconnect();
                                    } catch (Throwable th31) {
                                        js.a(th31, "ht", "mdr");
                                    }
                                }
                                if (dataOutputStream != null) {
                                    dataOutputStream.close();
                                }
                            } else {
                                this.u.f3017b = SystemClock.elapsedRealtime();
                                InputStream inputStream2 = httpURLConnection.getInputStream();
                                try {
                                    byte[] bArr = new byte[1024];
                                    int i2 = 0;
                                    while (true) {
                                        if (Thread.interrupted() || this.d || (i = inputStream2.read(bArr, 0, 1024)) <= 0) {
                                            dataOutputStream2 = dataOutputStream;
                                            break;
                                        }
                                        long j = this.e;
                                        if (j != -1) {
                                            dataOutputStream2 = dataOutputStream;
                                            try {
                                                if (this.f >= j) {
                                                    break;
                                                }
                                            } catch (ik e43) {
                                                e = e43;
                                                inputStream = inputStream2;
                                                ikVar = e;
                                                dataOutputStream = dataOutputStream2;
                                                this.u.a(ikVar.g());
                                                aVar.onException(ikVar);
                                                if (inputStream != null) {
                                                    inputStream.close();
                                                }
                                                if (httpURLConnection != null) {
                                                    httpURLConnection.disconnect();
                                                }
                                                if (dataOutputStream != null) {
                                                    dataOutputStream.close();
                                                }
                                            } catch (ConnectException e44) {
                                                e = e44;
                                                inputStream = inputStream2;
                                                connectException = e;
                                                dataOutputStream = dataOutputStream2;
                                                this.u.b(a(connectException));
                                                this.u.a(6);
                                                aVar.onException(connectException);
                                                if (inputStream != null) {
                                                    inputStream.close();
                                                }
                                                if (httpURLConnection != null) {
                                                    httpURLConnection.disconnect();
                                                }
                                                if (dataOutputStream != null) {
                                                    dataOutputStream.close();
                                                }
                                            } catch (MalformedURLException e45) {
                                                e = e45;
                                                inputStream = inputStream2;
                                                th4 = e;
                                                dataOutputStream = dataOutputStream2;
                                                this.u.a(8);
                                                aVar.onException(th4);
                                                if (inputStream != null) {
                                                    inputStream.close();
                                                }
                                                if (httpURLConnection != null) {
                                                    httpURLConnection.disconnect();
                                                }
                                                if (dataOutputStream != null) {
                                                    dataOutputStream.close();
                                                }
                                            } catch (SocketException e46) {
                                                e = e46;
                                                inputStream = inputStream2;
                                                socketException = e;
                                                dataOutputStream = dataOutputStream2;
                                                this.u.b(a(socketException));
                                                this.u.a(6);
                                                aVar.onException(socketException);
                                                if (inputStream != null) {
                                                    inputStream.close();
                                                }
                                                if (httpURLConnection != null) {
                                                    httpURLConnection.disconnect();
                                                }
                                                if (dataOutputStream != null) {
                                                    dataOutputStream.close();
                                                }
                                            } catch (SocketTimeoutException e47) {
                                                e = e47;
                                                inputStream = inputStream2;
                                                socketTimeoutException = e;
                                                dataOutputStream = dataOutputStream2;
                                                this.u.b(a(socketTimeoutException));
                                                this.u.a(2);
                                                aVar.onException(socketTimeoutException);
                                                if (inputStream != null) {
                                                    inputStream.close();
                                                }
                                                if (httpURLConnection != null) {
                                                    httpURLConnection.disconnect();
                                                }
                                                if (dataOutputStream != null) {
                                                    dataOutputStream.close();
                                                }
                                            } catch (ConnectTimeoutException e48) {
                                                e = e48;
                                                inputStream = inputStream2;
                                                connectTimeoutException = e;
                                                dataOutputStream = dataOutputStream2;
                                                connectTimeoutException.printStackTrace();
                                                this.u.b(a(connectTimeoutException));
                                                this.u.a(2);
                                                aVar.onException(connectTimeoutException);
                                                if (inputStream != null) {
                                                    inputStream.close();
                                                }
                                                if (httpURLConnection != null) {
                                                    httpURLConnection.disconnect();
                                                }
                                                if (dataOutputStream != null) {
                                                    dataOutputStream.close();
                                                }
                                            } catch (InterruptedIOException e49) {
                                                e = e49;
                                                inputStream = inputStream2;
                                                th5 = e;
                                                dataOutputStream = dataOutputStream2;
                                                this.u.b(7101);
                                                this.u.a(7);
                                                aVar.onException(th5);
                                                if (inputStream != null) {
                                                    inputStream.close();
                                                }
                                                if (httpURLConnection != null) {
                                                    httpURLConnection.disconnect();
                                                }
                                                if (dataOutputStream != null) {
                                                    dataOutputStream.close();
                                                }
                                            } catch (UnknownHostException e50) {
                                                e = e50;
                                                inputStream = inputStream2;
                                                th3 = e;
                                                dataOutputStream = dataOutputStream2;
                                                this.u.a(5);
                                                aVar.onException(th3);
                                                if (inputStream != null) {
                                                    inputStream.close();
                                                }
                                                if (httpURLConnection != null) {
                                                    httpURLConnection.disconnect();
                                                }
                                                if (dataOutputStream != null) {
                                                    dataOutputStream.close();
                                                }
                                            } catch (SSLException e51) {
                                                e = e51;
                                                inputStream = inputStream2;
                                                sSLException = e;
                                                dataOutputStream = dataOutputStream2;
                                                sSLException.printStackTrace();
                                                this.u.b(a(sSLException));
                                                this.u.a(4);
                                                aVar.onException(sSLException);
                                                if (inputStream != null) {
                                                    inputStream.close();
                                                }
                                                if (httpURLConnection != null) {
                                                    httpURLConnection.disconnect();
                                                }
                                                if (dataOutputStream != null) {
                                                    dataOutputStream.close();
                                                }
                                            } catch (IOException e52) {
                                                e = e52;
                                                inputStream = inputStream2;
                                                th2 = e;
                                                dataOutputStream = dataOutputStream2;
                                                this.u.a(7);
                                                aVar.onException(th2);
                                                if (inputStream != null) {
                                                    inputStream.close();
                                                }
                                                if (httpURLConnection != null) {
                                                    httpURLConnection.disconnect();
                                                }
                                                if (dataOutputStream != null) {
                                                    dataOutputStream.close();
                                                }
                                            } catch (Throwable th32) {
                                                th = th32;
                                                inputStream = inputStream2;
                                                th = th;
                                                dataOutputStream = dataOutputStream2;
                                                this.u.a(9);
                                                aVar.onException(th);
                                                if (inputStream != null) {
                                                    inputStream.close();
                                                }
                                                if (httpURLConnection != null) {
                                                    httpURLConnection.disconnect();
                                                }
                                                if (dataOutputStream != null) {
                                                    dataOutputStream.close();
                                                }
                                            }
                                        } else {
                                            dataOutputStream2 = dataOutputStream;
                                        }
                                        if (i == 1024) {
                                            aVar.onDownload(bArr, this.f);
                                        } else {
                                            byte[] bArr2 = new byte[i];
                                            System.arraycopy(bArr, 0, bArr2, 0, i);
                                            aVar.onDownload(bArr2, this.f);
                                        }
                                        this.f += (long) i;
                                        i2 += i;
                                        dataOutputStream = dataOutputStream2;
                                        inputStream = inputStream2;
                                        ikVar = e;
                                        dataOutputStream = dataOutputStream2;
                                        this.u.a(ikVar.g());
                                        aVar.onException(ikVar);
                                        if (inputStream != null) {
                                            inputStream.close();
                                        }
                                        if (httpURLConnection != null) {
                                            httpURLConnection.disconnect();
                                        }
                                        if (dataOutputStream != null) {
                                            dataOutputStream.close();
                                        }
                                    }
                                    this.u.a(i2);
                                    this.u.c();
                                    if (this.d) {
                                        aVar.onStop();
                                    } else {
                                        aVar.onFinish();
                                    }
                                    this.u.a((lb) null);
                                    if (inputStream2 != null) {
                                        try {
                                            inputStream2.close();
                                        } catch (IOException e53) {
                                            js.a(e53, "ht", "mdr");
                                        } catch (Throwable th33) {
                                            js.a(th33, "ht", "mdr");
                                        }
                                    }
                                    if (httpURLConnection != null) {
                                        try {
                                            httpURLConnection.disconnect();
                                        } catch (Throwable th34) {
                                            js.a(th34, "ht", "mdr");
                                        }
                                    }
                                    if (dataOutputStream2 != null) {
                                        dataOutputStream2.close();
                                    }
                                } catch (ik e54) {
                                    e = e54;
                                    dataOutputStream2 = dataOutputStream;
                                } catch (InterruptedIOException e55) {
                                    e = e55;
                                    dataOutputStream2 = dataOutputStream;
                                } catch (ConnectException e56) {
                                    e = e56;
                                    dataOutputStream2 = dataOutputStream;
                                } catch (MalformedURLException e57) {
                                    e = e57;
                                    dataOutputStream2 = dataOutputStream;
                                } catch (SocketException e58) {
                                    e = e58;
                                    dataOutputStream2 = dataOutputStream;
                                } catch (SocketTimeoutException e59) {
                                    e = e59;
                                    dataOutputStream2 = dataOutputStream;
                                } catch (UnknownHostException e60) {
                                    e = e60;
                                    dataOutputStream2 = dataOutputStream;
                                } catch (SSLException e61) {
                                    e = e61;
                                    dataOutputStream2 = dataOutputStream;
                                } catch (ConnectTimeoutException e62) {
                                    e = e62;
                                    dataOutputStream2 = dataOutputStream;
                                } catch (IOException e63) {
                                    e = e63;
                                    dataOutputStream2 = dataOutputStream;
                                } catch (Throwable th35) {
                                    th = th35;
                                    dataOutputStream2 = dataOutputStream;
                                }
                            }
                        } catch (ik e64) {
                            dataOutputStream2 = dataOutputStream;
                            ikVar = e64;
                            inputStream = null;
                        } catch (SocketTimeoutException e65) {
                            dataOutputStream2 = dataOutputStream;
                            socketTimeoutException = e65;
                            inputStream = null;
                        } catch (InterruptedIOException e66) {
                            dataOutputStream2 = dataOutputStream;
                            th5 = e66;
                            inputStream = null;
                        } catch (ConnectException e67) {
                            dataOutputStream2 = dataOutputStream;
                            connectException = e67;
                            inputStream = null;
                        } catch (MalformedURLException e68) {
                            dataOutputStream2 = dataOutputStream;
                            th4 = e68;
                            inputStream = null;
                        } catch (SocketException e69) {
                            dataOutputStream2 = dataOutputStream;
                            socketException = e69;
                            inputStream = null;
                        } catch (UnknownHostException e70) {
                            dataOutputStream2 = dataOutputStream;
                            th3 = e70;
                            inputStream = null;
                        } catch (SSLException e71) {
                            dataOutputStream2 = dataOutputStream;
                            sSLException = e71;
                            inputStream = null;
                        } catch (ConnectTimeoutException e72) {
                            dataOutputStream2 = dataOutputStream;
                            connectTimeoutException = e72;
                            inputStream = null;
                        } catch (IOException e73) {
                            dataOutputStream2 = dataOutputStream;
                            th2 = e73;
                            inputStream = null;
                        } catch (Throwable th36) {
                            dataOutputStream2 = dataOutputStream;
                            th = th36;
                            inputStream = null;
                        }
                    } catch (ik e74) {
                        dataOutputStream = null;
                        ikVar = e74;
                        inputStream = null;
                    } catch (MalformedURLException e75) {
                        dataOutputStream = null;
                        th4 = e75;
                        inputStream = null;
                    } catch (SocketException e76) {
                        dataOutputStream = null;
                        socketException = e76;
                        inputStream = null;
                    } catch (SocketTimeoutException e77) {
                        dataOutputStream = null;
                        socketTimeoutException = e77;
                        inputStream = null;
                    } catch (ConnectTimeoutException e78) {
                        dataOutputStream = null;
                        connectTimeoutException = e78;
                        inputStream = null;
                    } catch (InterruptedIOException e79) {
                        dataOutputStream = null;
                        th5 = e79;
                        inputStream = null;
                    } catch (ConnectException e80) {
                        dataOutputStream = null;
                        connectException = e80;
                        inputStream = null;
                    } catch (UnknownHostException e81) {
                        dataOutputStream = null;
                        th3 = e81;
                        inputStream = null;
                    } catch (SSLException e82) {
                        dataOutputStream = null;
                        sSLException = e82;
                        inputStream = null;
                    } catch (IOException e83) {
                        dataOutputStream = null;
                        th2 = e83;
                        inputStream = null;
                    } catch (Throwable th37) {
                        dataOutputStream = null;
                        th = th37;
                        inputStream = null;
                    }
                } catch (ik e84) {
                    dataOutputStream = null;
                    ikVar = e84;
                    inputStream = null;
                    httpURLConnection = null;
                } catch (InterruptedIOException e85) {
                    dataOutputStream = null;
                    th5 = e85;
                    inputStream = null;
                    httpURLConnection = null;
                } catch (ConnectException e86) {
                    dataOutputStream = null;
                    connectException = e86;
                    inputStream = null;
                    httpURLConnection = null;
                } catch (MalformedURLException e87) {
                    dataOutputStream = null;
                    th4 = e87;
                    inputStream = null;
                    httpURLConnection = null;
                } catch (SocketException e88) {
                    dataOutputStream = null;
                    socketException = e88;
                    inputStream = null;
                    httpURLConnection = null;
                } catch (SocketTimeoutException e89) {
                    dataOutputStream = null;
                    socketTimeoutException = e89;
                    inputStream = null;
                    httpURLConnection = null;
                } catch (UnknownHostException e90) {
                    dataOutputStream = null;
                    th3 = e90;
                    inputStream = null;
                    httpURLConnection = null;
                } catch (SSLException e91) {
                    dataOutputStream = null;
                    sSLException = e91;
                    inputStream = null;
                    httpURLConnection = null;
                } catch (ConnectTimeoutException e92) {
                    dataOutputStream = null;
                    connectTimeoutException = e92;
                    inputStream = null;
                    httpURLConnection = null;
                } catch (IOException e93) {
                    dataOutputStream = null;
                    th2 = e93;
                    inputStream = null;
                    httpURLConnection = null;
                } catch (Throwable th38) {
                    dataOutputStream = null;
                    th = th38;
                    inputStream = null;
                    httpURLConnection = null;
                }
                this.u.d();
            } catch (Throwable th39) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e94) {
                        js.a(e94, "ht", "mdr");
                    } catch (Throwable th40) {
                        js.a(th40, "ht", "mdr");
                    }
                }
                if (httpURLConnection != null) {
                    try {
                        httpURLConnection.disconnect();
                    } catch (Throwable th41) {
                        js.a(th41, "ht", "mdr");
                    }
                }
                if (dataOutputStream != null) {
                    try {
                        dataOutputStream.close();
                    } catch (Throwable th42) {
                        js.a(th42, "ht", "mdr");
                    }
                }
                this.u.d();
                throw th39;
            }
        } catch (Throwable th43) {
            js.a(th43, "ht", "mdr");
        }
    }

    final Map<String, String> a(la laVar) throws ik {
        Throwable th;
        ConnectTimeoutException e2;
        SSLException e3;
        SocketTimeoutException e4;
        SocketException e5;
        ConnectException e6;
        ik e7;
        String headerFieldKey;
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                d(laVar);
                this.m = a(this.m, laVar.getParams());
                HttpURLConnection httpURLConnection2 = a(laVar, false, false).f3007a;
                try {
                    this.u.f3017b = SystemClock.elapsedRealtime();
                    httpURLConnection2.connect();
                    this.u.a();
                    int responseCode = httpURLConnection2.getResponseCode();
                    if (responseCode >= 400) {
                        this.u.b(responseCode);
                        this.u.a(10);
                        ik ikVar = new ik("http读取header失败");
                        ikVar.a(responseCode);
                        throw ikVar;
                    }
                    HashMap map = new HashMap();
                    for (int i = 0; i < 50 && (headerFieldKey = httpURLConnection2.getHeaderFieldKey(i)) != null; i++) {
                        map.put(headerFieldKey.toLowerCase(), httpURLConnection2.getHeaderField(headerFieldKey));
                    }
                    this.u.a((lb) null);
                    if (httpURLConnection2 != null) {
                        try {
                            httpURLConnection2.disconnect();
                        } catch (Throwable th2) {
                            js.a(th2, "hth", "mgr");
                        }
                    }
                    this.u.d();
                    return map;
                } catch (ik e8) {
                    e7 = e8;
                    this.u.a(e7.g());
                    throw e7;
                } catch (ConnectTimeoutException e9) {
                    e2 = e9;
                    e2.printStackTrace();
                    this.u.b(a(e2));
                    this.u.a(2);
                    throw new ik("IO 操作异常 - IOException");
                } catch (InterruptedIOException unused) {
                    this.u.b(7101);
                    this.u.a(7);
                    throw new ik(AMapException.ERROR_UNKNOWN);
                } catch (ConnectException e10) {
                    e6 = e10;
                    this.u.b(a(e6));
                    this.u.a(6);
                    throw new ik(AMapException.ERROR_CONNECTION);
                } catch (MalformedURLException unused2) {
                    this.u.a(8);
                    throw new ik("url异常 - MalformedURLException");
                } catch (SocketException e11) {
                    e5 = e11;
                    this.u.b(a(e5));
                    this.u.a(6);
                    throw new ik(AMapException.ERROR_SOCKET);
                } catch (SocketTimeoutException e12) {
                    e4 = e12;
                    this.u.b(a(e4));
                    this.u.a(2);
                    throw new ik("socket 连接超时 - SocketTimeoutException");
                } catch (UnknownHostException unused3) {
                    this.u.a(9);
                    throw new ik("未知主机 - UnKnowHostException");
                } catch (SSLException e13) {
                    e3 = e13;
                    e3.printStackTrace();
                    this.u.b(a(e3));
                    this.u.a(4);
                    throw new ik("IO 操作异常 - IOException");
                } catch (IOException unused4) {
                    this.u.a(7);
                    throw new ik("IO 操作异常 - IOException");
                } catch (Throwable th3) {
                    th = th3;
                    this.u.a(9);
                    th.printStackTrace();
                    throw new ik(AMapException.ERROR_UNKNOWN);
                }
            } catch (Throwable th4) {
                if (0 != 0) {
                    try {
                        httpURLConnection.disconnect();
                    } catch (Throwable th5) {
                        js.a(th5, "hth", "mgr");
                    }
                }
                this.u.d();
                throw th4;
            }
        } catch (ik e14) {
            e7 = e14;
        } catch (ConnectException e15) {
            e6 = e15;
        } catch (MalformedURLException unused5) {
        } catch (SocketException e16) {
            e5 = e16;
        } catch (SocketTimeoutException e17) {
            e4 = e17;
        } catch (InterruptedIOException unused6) {
        } catch (UnknownHostException unused7) {
        } catch (SSLException e18) {
            e3 = e18;
        } catch (ConnectTimeoutException e19) {
            e2 = e19;
        } catch (IOException unused8) {
        } catch (Throwable th6) {
            th = th6;
        }
    }

    final lb b(la laVar) throws ik {
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                try {
                    try {
                        try {
                            try {
                                try {
                                    d(laVar);
                                    String strA = a(this.m, laVar.getParams());
                                    this.m = strA;
                                    lb lbVarB = kw.b(strA, this.j);
                                    if (lbVarB == null) {
                                        b bVarA = a(laVar, false, true);
                                        httpURLConnection = bVarA.f3007a;
                                        this.u.f3017b = SystemClock.elapsedRealtime();
                                        httpURLConnection.connect();
                                        this.u.a();
                                        lb lbVarA = a(bVarA, laVar.isIgnoreGZip());
                                        this.u.a(lbVarA);
                                        if (httpURLConnection != null) {
                                            try {
                                                httpURLConnection.disconnect();
                                            } catch (Throwable th) {
                                                js.a(th, "ht", "mgr");
                                            }
                                        }
                                        this.u.d();
                                        return lbVarA;
                                    }
                                    this.u.d();
                                    return lbVarB;
                                } catch (SSLException e2) {
                                    e2.printStackTrace();
                                    this.u.b(a(e2));
                                    this.u.a(4);
                                    throw new ik("IO 操作异常 - IOException");
                                }
                            } catch (MalformedURLException unused) {
                                this.u.a(8);
                                throw new ik("url异常 - MalformedURLException");
                            } catch (Throwable th2) {
                                th2.printStackTrace();
                                this.u.a(9);
                                throw new ik(AMapException.ERROR_UNKNOWN);
                            }
                        } catch (SocketException e3) {
                            this.u.b(a(e3));
                            this.u.a(6);
                            throw new ik(AMapException.ERROR_SOCKET);
                        } catch (SocketTimeoutException e4) {
                            this.u.b(a(e4));
                            this.u.a(2);
                            throw new ik("socket 连接超时 - SocketTimeoutException");
                        }
                    } catch (ik e5) {
                        if (!e5.i() && e5.g() != 10) {
                            this.u.a(e5.f());
                        }
                        throw e5;
                    } catch (UnknownHostException unused2) {
                        this.u.a(9);
                        throw new ik("未知主机 - UnKnowHostException");
                    }
                } catch (InterruptedIOException unused3) {
                    this.u.b(7101);
                    this.u.a(7);
                    throw new ik(AMapException.ERROR_UNKNOWN);
                } catch (IOException unused4) {
                    this.u.a(7);
                    throw new ik("IO 操作异常 - IOException");
                }
            } catch (ConnectException e6) {
                this.u.b(a(e6));
                this.u.a(6);
                throw new ik(AMapException.ERROR_CONNECTION);
            } catch (ConnectTimeoutException e7) {
                e7.printStackTrace();
                this.u.b(a(e7));
                this.u.a(2);
                throw new ik("IO 操作异常 - IOException");
            }
        } catch (Throwable th3) {
            if (httpURLConnection != null) {
                try {
                    httpURLConnection.disconnect();
                } catch (Throwable th4) {
                    js.a(th4, "ht", "mgr");
                }
            }
            this.u.d();
            throw th3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.io.DataOutputStream] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v17 */
    final lb c(la laVar) throws ik {
        OutputStream outputStream;
        ?? r7 = 0;
        r7 = 0;
        try {
            try {
                d(laVar);
                lb lbVarB = kw.b(this.m, this.j);
                if (lbVarB == null) {
                    b bVarA = a(laVar, true, true);
                    HttpURLConnection httpURLConnection = bVarA.f3007a;
                    try {
                        this.u.f3017b = SystemClock.elapsedRealtime();
                        httpURLConnection.connect();
                        this.u.a();
                        byte[] entityBytes = laVar.getEntityBytes();
                        if (entityBytes == null || entityBytes.length == 0) {
                            Map<String, String> params = laVar.getParams();
                            if (kt.e != null) {
                                if (params != null) {
                                    params.putAll(kt.e);
                                } else {
                                    params = kt.e;
                                }
                            }
                            String strA = a(params);
                            if (!TextUtils.isEmpty(strA)) {
                                entityBytes = iy.a(strA);
                            }
                        }
                        if (entityBytes != null && entityBytes.length > 0) {
                            try {
                                this.u.f3017b = SystemClock.elapsedRealtime();
                                outputStream = httpURLConnection.getOutputStream();
                                try {
                                    DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
                                    try {
                                        dataOutputStream.write(entityBytes);
                                        dataOutputStream.close();
                                        if (outputStream != null) {
                                            outputStream.close();
                                        }
                                        this.u.b();
                                    } catch (Throwable th) {
                                        th = th;
                                        r7 = dataOutputStream;
                                        if (r7 != 0) {
                                            r7.close();
                                        }
                                        if (outputStream != null) {
                                            outputStream.close();
                                        }
                                        this.u.b();
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
                        lb lbVarA = a(bVarA, laVar.isIgnoreGZip());
                        this.u.a(lbVarA);
                        if (httpURLConnection != null) {
                            try {
                                httpURLConnection.disconnect();
                            } catch (Throwable th4) {
                                js.a(th4, "ht", "mPt");
                            }
                        }
                        this.u.d();
                        return lbVarA;
                    } catch (ik e2) {
                        e = e2;
                    } catch (InterruptedIOException unused) {
                        this.u.b(7101);
                        this.u.a(7);
                        throw new ik(AMapException.ERROR_UNKNOWN);
                    } catch (ConnectException e3) {
                        e = e3;
                        e.printStackTrace();
                        this.u.b(a(e));
                        this.u.a(6);
                        throw new ik(AMapException.ERROR_CONNECTION);
                    } catch (MalformedURLException e4) {
                        e = e4;
                        e.printStackTrace();
                        this.u.a(8);
                        throw new ik("url异常 - MalformedURLException");
                    } catch (SocketException e5) {
                        e = e5;
                        e.printStackTrace();
                        this.u.b(a(e));
                        this.u.a(6);
                        throw new ik(AMapException.ERROR_SOCKET);
                    } catch (SocketTimeoutException e6) {
                        e = e6;
                        e.printStackTrace();
                        this.u.b(a(e));
                        this.u.a(2);
                        throw new ik("socket 连接超时 - SocketTimeoutException");
                    } catch (UnknownHostException e7) {
                        e = e7;
                        e.printStackTrace();
                        this.u.a(5);
                        throw new ik("未知主机 - UnKnowHostException");
                    } catch (SSLException e8) {
                        e = e8;
                        e.printStackTrace();
                        this.u.b(a(e));
                        this.u.a(4);
                        throw new ik("IO 操作异常 - IOException");
                    } catch (ConnectTimeoutException e9) {
                        e = e9;
                        e.printStackTrace();
                        this.u.b(a(e));
                        this.u.a(2);
                        throw new ik("IO 操作异常 - IOException");
                    } catch (IOException e10) {
                        e = e10;
                        e.printStackTrace();
                        this.u.a(7);
                        throw new ik("IO 操作异常 - IOException");
                    } catch (Throwable th5) {
                        th = th5;
                        js.a(th, "ht", "mPt");
                        this.u.a(9);
                        throw new ik(AMapException.ERROR_UNKNOWN);
                    }
                } else {
                    this.u.d();
                    return lbVarB;
                }
            } catch (Throwable th6) {
                if (0 != 0) {
                    try {
                        r7.disconnect();
                    } catch (Throwable th7) {
                        js.a(th7, "ht", "mPt");
                    }
                }
                this.u.d();
                throw th6;
            }
        } catch (ik e11) {
            e = e11;
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
        } catch (ConnectTimeoutException e17) {
            e = e17;
        } catch (InterruptedIOException unused2) {
        } catch (SSLException e18) {
            e = e18;
        } catch (IOException e19) {
            e = e19;
        } catch (Throwable th8) {
            th = th8;
        }
        if (!e.i() && e.g() != 10) {
            this.u.a(e.g());
        }
        js.a(e, "ht", "mPt");
        throw e;
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public HttpURLConnection f3007a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f3008b = this.f3008b;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f3008b = this.f3008b;

        public b(HttpURLConnection httpURLConnection) {
            this.f3007a = httpURLConnection;
        }
    }

    private ky c() {
        try {
            SoftReference<ky> softReference = t;
            if (softReference == null || softReference.get() == null) {
                t = new SoftReference<>(new ky(im.f2770c, this.f3002b));
            }
            ky kyVar = k != null ? t.get() : null;
            return kyVar == null ? new ky(im.f2770c, this.f3002b) : kyVar;
        } catch (Throwable th) {
            jv.c(th, "ht", "gsf");
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01f2 A[Catch: all -> 0x0208, TryCatch #2 {all -> 0x0208, blocks: (B:98:0x01e8, B:100:0x01ec, B:103:0x01fd, B:105:0x0201, B:102:0x01f2), top: B:138:0x01e8 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x0201 A[Catch: all -> 0x0208, TRY_LEAVE, TryCatch #2 {all -> 0x0208, blocks: (B:98:0x01e8, B:100:0x01ec, B:103:0x01fd, B:105:0x0201, B:102:0x01f2), top: B:138:0x01e8 }] */
    /* JADX WARN: Code duplicated, block: B:107:0x0208  */
    /* JADX WARN: Code duplicated, block: B:122:0x0254  */
    /* JADX WARN: Code duplicated, block: B:125:0x025a  */
    /* JADX WARN: Code duplicated, block: B:128:0x027e  */
    /* JADX WARN: Code duplicated, block: B:129:0x028d  */
    /* JADX WARN: Code duplicated, block: B:136:0x020b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:0x01e8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x0061  */
    /* JADX WARN: Code duplicated, block: B:77:0x015d  */
    /* JADX WARN: Code duplicated, block: B:80:0x0186 A[Catch: all -> 0x01b0, TryCatch #0 {all -> 0x01b0, blocks: (B:42:0x00ce, B:45:0x00e6, B:47:0x00e9, B:49:0x00ed, B:51:0x00f3, B:55:0x00fc, B:58:0x0108, B:60:0x010b, B:62:0x0111, B:72:0x013d, B:74:0x0143, B:76:0x014d, B:78:0x015e, B:80:0x0186, B:82:0x01a7, B:83:0x01aa, B:63:0x0127, B:65:0x012b, B:67:0x012e, B:69:0x0134, B:70:0x0139), top: B:134:0x00ce }] */
    /* JADX WARN: Code duplicated, block: B:82:0x01a7 A[Catch: all -> 0x01b0, TryCatch #0 {all -> 0x01b0, blocks: (B:42:0x00ce, B:45:0x00e6, B:47:0x00e9, B:49:0x00ed, B:51:0x00f3, B:55:0x00fc, B:58:0x0108, B:60:0x010b, B:62:0x0111, B:72:0x013d, B:74:0x0143, B:76:0x014d, B:78:0x015e, B:80:0x0186, B:82:0x01a7, B:83:0x01aa, B:63:0x0127, B:65:0x012b, B:67:0x012e, B:69:0x0134, B:70:0x0139), top: B:134:0x00ce }] */
    /* JADX WARN: Code duplicated, block: B:86:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:89:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:90:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:92:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:94:0x01db  */
    /* JADX WARN: Code duplicated, block: B:95:0x01e0  */
    private b a(la laVar, boolean z, boolean z2) throws IOException, ik {
        String str;
        boolean z3;
        URL url;
        URL url2;
        kt.a aVar;
        URLConnection uRLConnectionOpenConnection;
        SSLContext sSLContext;
        HttpsURLConnection httpsURLConnection;
        ky kyVarC;
        SoftReference<SSLContext> softReference;
        SoftReference<SSLContext> softReference2;
        HttpURLConnection httpURLConnection;
        Proxy proxy;
        String str2;
        InetAddress[] allByName;
        String hostAddress;
        String host;
        f fVar = this.u;
        la.b degradeType = laVar.getDegradeType();
        fVar.f3018c.f3009a = kx.this.g;
        fVar.f3018c.f3010b = degradeType;
        fVar.f3016a = SystemClock.elapsedRealtime();
        Map<String, String> requestHead = laVar.getRequestHead();
        if (requestHead == null) {
            requestHead = new HashMap<>();
        }
        e eVarA = this.i.a(this.n);
        int i = kt.f2983a;
        String string = this.m;
        Uri uri = Uri.parse(string);
        String host2 = uri.getHost();
        if (i == 1) {
            str = kt.f2984b;
        } else {
            if (i != 2) {
                str = "";
            } else {
                if (kt.f2985c == null) {
                    str = "";
                } else {
                    str = kt.f2985c.get(host2);
                }
                z3 = false;
            }
            if (!TextUtils.isEmpty(str)) {
                laVar.setHostToIP(false);
                string = uri.buildUpon().encodedAuthority(str).build().toString();
                if (z3 && requestHead != null) {
                    requestHead.put("targetHost", host2);
                    this.s = host2;
                }
                if (z3 && this.f3001a) {
                    eVarA.a(str);
                }
            }
            this.m = string;
            url = new URL(this.m);
            this.u.a(laVar, url);
            if (c(url.getHost()) && laVar.isHostToIP()) {
                la.b degradeType2 = laVar.getDegradeType();
                str2 = this.u.f3018c.e;
                if (b(str2) && ((degradeType2.b() && im.g) || (degradeType2.c() && im.h(str2)))) {
                    try {
                        this.u.f3017b = SystemClock.elapsedRealtime();
                        allByName = InetAddress.getAllByName(this.u.f3018c.e);
                        if (allByName == null && allByName.length > 0 && allByName[0] != null) {
                            boolean z4 = im.a() && im.c();
                            "---canUseIpv6---".concat(String.valueOf(z4));
                            if (!z4) {
                                int i2 = 0;
                                while (true) {
                                    if (i2 < allByName.length) {
                                        InetAddress inetAddress = allByName[i2];
                                        if (inetAddress instanceof Inet4Address) {
                                            hostAddress = inetAddress.getHostAddress();
                                            break;
                                        }
                                        i2++;
                                    } else {
                                        hostAddress = "";
                                        break;
                                    }
                                }
                            } else {
                                int i3 = 0;
                                while (true) {
                                    if (i3 < allByName.length) {
                                        if (allByName[i3] instanceof Inet6Address) {
                                            hostAddress = "[" + allByName[i3].getHostAddress() + "]";
                                            break;
                                        }
                                        i3++;
                                    } else {
                                        hostAddress = "";
                                        break;
                                    }
                                }
                            }
                            if (TextUtils.isEmpty(hostAddress)) {
                                InetAddress inetAddress2 = allByName[0];
                                hostAddress = inetAddress2.getHostAddress();
                                if (inetAddress2 instanceof Inet6Address) {
                                    hostAddress = "[" + hostAddress + "]";
                                }
                            }
                        } else {
                            hostAddress = "";
                        }
                        f fVar2 = this.u;
                        "---onDNSEnd---ip=".concat(String.valueOf(hostAddress));
                        fVar2.f3018c.f3011c = hostAddress.replace("[", "").replace("]", "");
                        fVar2.f3018c.g = SystemClock.elapsedRealtime() - fVar2.f3017b;
                        if (!TextUtils.isEmpty(hostAddress)) {
                            Uri uri2 = Uri.parse(this.m);
                            host = uri2.getHost();
                            Uri uriBuild = uri2.buildUpon().encodedAuthority(hostAddress).build();
                            this.n = host;
                            requestHead.put("host", host);
                            if (this.f3001a) {
                                eVarA.b(host);
                            }
                            this.m = uriBuild.toString();
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
            if (this.f3001a) {
                this.m = ir.a(this.m);
            }
            Objects.toString(laVar.getDegradeType());
            url2 = new URL(this.m);
            aVar = this.h;
            if (aVar != null) {
                uRLConnectionOpenConnection = aVar.a();
            } else {
                uRLConnectionOpenConnection = null;
            }
            if (uRLConnectionOpenConnection == null) {
                proxy = this.f3003c;
                if (proxy != null) {
                    uRLConnectionOpenConnection = url2.openConnection(proxy);
                } else {
                    uRLConnectionOpenConnection = url2.openConnection();
                }
            }
            if (this.f3001a) {
                httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            } else {
                try {
                    softReference = k;
                    if (softReference != null || softReference.get() == null) {
                        k = new SoftReference<>(SSLContext.getInstance("TLS"));
                    }
                    softReference2 = k;
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
                        js.a(th, "ht", "ne");
                    }
                }
                sSLContext.init(null, null, null);
                this.f3002b = sSLContext;
                httpsURLConnection = (HttpsURLConnection) uRLConnectionOpenConnection;
                if (im.f.f2787a || (kyVarC = c()) == null) {
                    httpsURLConnection.setSSLSocketFactory(this.f3002b.getSocketFactory());
                } else {
                    httpsURLConnection.setSSLSocketFactory(kyVarC);
                    kyVarC.a();
                }
                httpsURLConnection.setHostnameVerifier(eVarA);
                httpURLConnection = httpsURLConnection;
            }
            if (Build.VERSION.SDK != null) {
                httpURLConnection.setRequestProperty("Connection", "close");
            }
            int real_max_timeout = (int) (((long) laVar.getReal_max_timeout()) - (this.u.f3018c.g / 1000));
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
        z3 = true;
        if (!TextUtils.isEmpty(str)) {
            laVar.setHostToIP(false);
            string = uri.buildUpon().encodedAuthority(str).build().toString();
            if (z3) {
                requestHead.put("targetHost", host2);
                this.s = host2;
            }
            if (z3) {
                eVarA.a(str);
            }
        }
        this.m = string;
        url = new URL(this.m);
        this.u.a(laVar, url);
        if (c(url.getHost())) {
            la.b degradeType3 = laVar.getDegradeType();
            str2 = this.u.f3018c.e;
            if (b(str2)) {
                this.u.f3017b = SystemClock.elapsedRealtime();
                allByName = InetAddress.getAllByName(this.u.f3018c.e);
                if (allByName == null) {
                    hostAddress = "";
                } else {
                    hostAddress = "";
                }
                f fVar3 = this.u;
                "---onDNSEnd---ip=".concat(String.valueOf(hostAddress));
                fVar3.f3018c.f3011c = hostAddress.replace("[", "").replace("]", "");
                fVar3.f3018c.g = SystemClock.elapsedRealtime() - fVar3.f3017b;
                if (!TextUtils.isEmpty(hostAddress)) {
                    Uri uri3 = Uri.parse(this.m);
                    host = uri3.getHost();
                    Uri uriBuild2 = uri3.buildUpon().encodedAuthority(hostAddress).build();
                    this.n = host;
                    requestHead.put("host", host);
                    if (this.f3001a) {
                        eVarA.b(host);
                    }
                    this.m = uriBuild2.toString();
                }
            }
        }
        if (this.f3001a) {
            this.m = ir.a(this.m);
        }
        Objects.toString(laVar.getDegradeType());
        url2 = new URL(this.m);
        aVar = this.h;
        if (aVar != null) {
            uRLConnectionOpenConnection = aVar.a();
        } else {
            uRLConnectionOpenConnection = null;
        }
        if (uRLConnectionOpenConnection == null) {
            proxy = this.f3003c;
            if (proxy != null) {
                uRLConnectionOpenConnection = url2.openConnection(proxy);
            } else {
                uRLConnectionOpenConnection = url2.openConnection();
            }
        }
        if (this.f3001a) {
            httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        } else {
            softReference = k;
            if (softReference != null) {
                k = new SoftReference<>(SSLContext.getInstance("TLS"));
            } else {
                k = new SoftReference<>(SSLContext.getInstance("TLS"));
            }
            softReference2 = k;
            if (softReference2 != null) {
                sSLContext = softReference2.get();
            } else {
                sSLContext = null;
            }
            if (sSLContext == null) {
                sSLContext = SSLContext.getInstance("TLS");
            }
            sSLContext.init(null, null, null);
            this.f3002b = sSLContext;
            httpsURLConnection = (HttpsURLConnection) uRLConnectionOpenConnection;
            if (im.f.f2787a) {
                httpsURLConnection.setSSLSocketFactory(this.f3002b.getSocketFactory());
            } else {
                httpsURLConnection.setSSLSocketFactory(this.f3002b.getSocketFactory());
            }
            httpsURLConnection.setHostnameVerifier(eVarA);
            httpURLConnection = httpsURLConnection;
        }
        if (Build.VERSION.SDK != null) {
            httpURLConnection.setRequestProperty("Connection", "close");
        }
        int real_max_timeout2 = (int) (((long) laVar.getReal_max_timeout()) - (this.u.f3018c.g / 1000));
        a(requestHead, httpURLConnection, z2);
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

    /* JADX WARN: Code duplicated, block: B:156:0x021c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:162:0x0227 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x0232 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:170:0x023d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x00a4 A[PHI: r4
      0x00a4: PHI (r4v10 java.lang.String) = (r4v0 java.lang.String), (r4v34 java.lang.String), (r4v34 java.lang.String) binds: [B:4:0x001c, B:155:0x00a4, B:12:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v9 */
    private lb a(b bVar, boolean z) throws Throwable {
        Throwable th;
        ?? r6;
        InputStream inputStream;
        PushbackInputStream pushbackInputStream;
        InputStream inputStream2;
        ByteArrayOutputStream byteArrayOutputStream;
        InputStream inputStream3;
        ?? r5;
        boolean zA;
        InputStream inputStream4;
        InputStream inputStream5;
        InputStream inputStream6;
        ?? r12;
        String str = "";
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        gZIPInputStream = null;
        gZIPInputStream = null;
        gZIPInputStream = null;
        gZIPInputStream = null;
        gZIPInputStream = null;
        InputStream inputStream7 = null;
        InputStream inputStream8 = null;
        InputStream gZIPInputStream = null;
        InputStream inputStream9 = null;
        PushbackInputStream pushbackInputStream2 = null;
        try {
            try {
                kw.a();
                HttpURLConnection httpURLConnection = bVar.f3007a;
                Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                int responseCode = httpURLConnection.getResponseCode();
                if (headerFields == null) {
                    zA = false;
                } else {
                    List<String> list = headerFields.get("gsid");
                    if (list != null && list.size() > 0) {
                        str = list.get(0);
                    }
                    this.u.f3018c.k = b(headerFields);
                    try {
                        if (TextUtils.isEmpty(this.j)) {
                            zA = false;
                        } else {
                            if (this.o) {
                                if (headerFields.containsKey("sc")) {
                                    zA = a(headerFields, false);
                                    r12 = 1;
                                } else {
                                    im.e(this.j);
                                    zA = false;
                                    r12 = 0;
                                }
                            } else {
                                zA = a(headerFields, true);
                                r12 = 2;
                            }
                            try {
                                if (zA) {
                                    if (this.j.equals("loc")) {
                                        String host = this.s;
                                        if (TextUtils.isEmpty(host)) {
                                            host = httpURLConnection.getURL().getHost();
                                        }
                                        im.a(this.j, r12 == 2, host, host, this.n);
                                    } else {
                                        im.b(this.j, r12 == 2);
                                    }
                                } else if (r12 == 1) {
                                    kw.a(false, this.j);
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
                    this.u.b(responseCode);
                    this.u.a(10);
                    ikVar.h();
                    throw ikVar;
                }
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    this.u.f3017b = SystemClock.elapsedRealtime();
                    inputStream3 = httpURLConnection.getInputStream();
                    try {
                        pushbackInputStream = new PushbackInputStream(inputStream3, 2);
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
                                byteArrayOutputStream.write(bArr2, 0, i);
                            }
                            this.u.c();
                            jv.c();
                            lb lbVar = new lb();
                            lbVar.f3037a = byteArrayOutputStream.toByteArray();
                            lbVar.f3038b = headerFields;
                            lbVar.f3039c = this.g;
                            lbVar.d = str;
                            lbVar.e = zA;
                            kw.a(httpURLConnection.getURL(), lbVar);
                            this.u.a(lbVar.f3037a.length);
                            try {
                                byteArrayOutputStream.close();
                            } catch (Throwable th2) {
                                js.a(th2, "ht", "par");
                            }
                            if (inputStream3 != null) {
                                try {
                                    inputStream3.close();
                                } catch (Throwable th3) {
                                    js.a(th3, "ht", "par");
                                }
                            }
                            try {
                                pushbackInputStream.close();
                            } catch (Throwable th4) {
                                js.a(th4, "ht", "par");
                            }
                            try {
                                gZIPInputStream.close();
                            } catch (Throwable th5) {
                                js.a(th5, "ht", "par");
                            }
                            return lbVar;
                        } catch (SocketTimeoutException e2) {
                            e = e2;
                            inputStream6 = gZIPInputStream;
                            inputStream7 = inputStream3;
                            throw e;
                        } catch (ConnectTimeoutException e3) {
                            e = e3;
                            inputStream5 = gZIPInputStream;
                            inputStream8 = inputStream3;
                            throw e;
                        } catch (IOException e4) {
                            e = e4;
                            inputStream2 = gZIPInputStream;
                            pushbackInputStream2 = pushbackInputStream;
                            try {
                                if (e instanceof InterruptedIOException) {
                                    ik ikVar2 = new ik("IO 操作异常 - IOException", str, this.g);
                                    if (!TextUtils.isEmpty(e.getMessage()) && e.getMessage().equals("thread interrupted")) {
                                        ikVar2.j();
                                        throw ikVar2;
                                    }
                                    throw ikVar2;
                                }
                                throw e;
                            } catch (Throwable th6) {
                                th = th6;
                                pushbackInputStream = pushbackInputStream2;
                                r5 = inputStream3;
                                th = th;
                                InputStream inputStream10 = inputStream2;
                                r6 = r5;
                                byteArrayOutputStream2 = byteArrayOutputStream;
                                inputStream = inputStream10;
                                if (byteArrayOutputStream2 != null) {
                                    try {
                                        byteArrayOutputStream2.close();
                                    } catch (Throwable th7) {
                                        js.a(th7, "ht", "par");
                                    }
                                }
                                if (r6 != 0) {
                                    try {
                                        r6.close();
                                    } catch (Throwable th8) {
                                        js.a(th8, "ht", "par");
                                    }
                                }
                                if (pushbackInputStream != null) {
                                    try {
                                        pushbackInputStream.close();
                                    } catch (Throwable th9) {
                                        js.a(th9, "ht", "par");
                                    }
                                }
                                if (inputStream != null) {
                                    try {
                                        inputStream.close();
                                        throw th;
                                    } catch (Throwable th10) {
                                        js.a(th10, "ht", "par");
                                        throw th;
                                    }
                                }
                                throw th;
                            }
                        } catch (Throwable th11) {
                            th = th11;
                            inputStream4 = gZIPInputStream;
                            inputStream9 = inputStream3;
                            r6 = inputStream9;
                            byteArrayOutputStream2 = byteArrayOutputStream;
                            inputStream = inputStream4;
                            th = th;
                            if (byteArrayOutputStream2 != null) {
                                byteArrayOutputStream2.close();
                            }
                            if (r6 != 0) {
                                r6.close();
                            }
                            if (pushbackInputStream != null) {
                                pushbackInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                                throw th;
                            }
                            throw th;
                        }
                    } catch (SocketTimeoutException e5) {
                        e = e5;
                        inputStream6 = null;
                    } catch (ConnectTimeoutException e6) {
                        e = e6;
                        inputStream5 = null;
                    } catch (IOException e7) {
                        e = e7;
                        pushbackInputStream = null;
                    } catch (Throwable th12) {
                        th = th12;
                        inputStream4 = null;
                        pushbackInputStream = null;
                    }
                } catch (SocketTimeoutException e8) {
                    e = e8;
                    inputStream6 = null;
                } catch (ConnectTimeoutException e9) {
                    e = e9;
                    inputStream5 = null;
                } catch (IOException e10) {
                    e = e10;
                    inputStream3 = null;
                    pushbackInputStream = null;
                } catch (Throwable th13) {
                    th = th13;
                    inputStream4 = null;
                    pushbackInputStream = null;
                }
            } catch (Throwable th14) {
                th = th14;
                inputStream2 = null;
                r5 = "";
                th = th;
                InputStream inputStream11 = inputStream2;
                r6 = r5;
                byteArrayOutputStream2 = byteArrayOutputStream;
                inputStream = inputStream11;
                if (byteArrayOutputStream2 != null) {
                    byteArrayOutputStream2.close();
                }
                if (r6 != 0) {
                    r6.close();
                }
                if (pushbackInputStream != null) {
                    pushbackInputStream.close();
                }
                if (inputStream != null) {
                    inputStream.close();
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
            inputStream2 = null;
            byteArrayOutputStream = null;
            inputStream3 = null;
        } catch (Throwable th15) {
            th = th15;
            r6 = 0;
            inputStream = null;
            pushbackInputStream = null;
        }
    }

    private static String b(Map<String, List<String>> map) {
        try {
            List<String> list = map.get("sc");
            if (list != null && list.size() > 0) {
                String str = list.get(0);
                if (!TextUtils.isEmpty(str)) {
                    if (!str.contains("#")) {
                        return str;
                    }
                    String[] strArrSplit = str.split("#");
                    if (strArrSplit.length > 1) {
                        return strArrSplit[0];
                    }
                    return "";
                }
                return "";
            }
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if ("1".equals(r1[1]) != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean a(Map<String, List<String>> map, boolean z) {
        List<String> list;
        try {
            List<String> list2 = map.get("sc");
            if (list2 != null && list2.size() > 0) {
                String str = list2.get(0);
                if (!TextUtils.isEmpty(str)) {
                    if (str.contains("#")) {
                        String[] strArrSplit = str.split("#");
                        if (strArrSplit.length > 1) {
                        }
                    }
                    if (!z) {
                        return true;
                    }
                    if (!map.containsKey("lct") || (list = map.get("lct")) == null || list.size() <= 0) {
                        return false;
                    }
                    return im.a(this.j, im.a(list));
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private void a(Map<String, String> map, HttpURLConnection httpURLConnection, boolean z) {
        c cVarG;
        String strB;
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    httpURLConnection.addRequestProperty(str, map.get(str));
                }
            } catch (Throwable th) {
                js.a(th, "ht", "adh");
                return;
            }
        }
        if (kt.d != null) {
            for (String str2 : kt.d.keySet()) {
                httpURLConnection.addRequestProperty(str2, kt.d.get(str2));
            }
        }
        String strB2 = "";
        if (z && !this.m.contains("/v3/iasdkauth") && !TextUtils.isEmpty(this.j) && im.d(this.j)) {
            this.o = true;
            im.g gVarF = im.f(this.j);
            httpURLConnection.addRequestProperty("lct", String.valueOf(gVarF.f2790a));
            httpURLConnection.addRequestProperty("lct-info", gVarF.f2791b);
            httpURLConnection.addRequestProperty("aks", im.c(im.a(this.j)));
            if (im.b(this.j) == null) {
                strB = "";
            } else {
                strB = im.b(this.j).b();
            }
            httpURLConnection.addRequestProperty("lct-args", a(strB, this.j));
        }
        httpURLConnection.addRequestProperty("csid", this.g);
        if (b(this.u.f3018c.e)) {
            f fVar = this.u;
            if (!TextUtils.isEmpty(fVar.f3018c.f3011c)) {
                strB2 = iq.b(kp.a(fVar.f3018c.f3011c.getBytes(), "YXBtX25ldHdvcmtf".getBytes()));
                String str3 = fVar.f3018c.f3011c;
            }
            if (!TextUtils.isEmpty(strB2)) {
                httpURLConnection.addRequestProperty("sip", strB2);
            }
            if (im.j && (cVarG = im.g()) != null) {
                httpURLConnection.addRequestProperty("nls", cVarG.b());
                this.u.e = cVarG;
            }
            a aVarF = im.f();
            if (aVarF != null) {
                httpURLConnection.addRequestProperty("nlf", aVarF.b());
                this.u.d = aVarF;
            }
        }
    }

    static final class e implements HostnameVerifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f3014a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f3015b;

        private e() {
        }

        /* synthetic */ e(byte b2) {
            this();
        }

        public final void a(String str) {
            String[] strArrSplit;
            if (!TextUtils.isEmpty(this.f3014a) && str.contains(":") && (strArrSplit = str.split(":")) != null && strArrSplit.length > 0) {
                this.f3014a = strArrSplit[0];
            } else {
                this.f3014a = str;
            }
        }

        public final void b(String str) {
            this.f3015b = str;
        }

        public final String a() {
            return this.f3015b;
        }

        @Override // javax.net.ssl.HostnameVerifier
        public final boolean verify(String str, SSLSession sSLSession) {
            HostnameVerifier defaultHostnameVerifier = HttpsURLConnection.getDefaultHostnameVerifier();
            if (!TextUtils.isEmpty(this.f3014a)) {
                return this.f3014a.equals(str);
            }
            if (!TextUtils.isEmpty(this.f3015b)) {
                return defaultHostnameVerifier.verify(this.f3015b, sSLSession);
            }
            return defaultHostnameVerifier.verify(str, sSLSession);
        }
    }

    static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Vector<e> f3012a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile e f3013b;

        private d() {
            this.f3012a = new Vector<>();
            this.f3013b = new e((byte) 0);
        }

        /* synthetic */ d(byte b2) {
            this();
        }

        public final e a(String str) {
            if (TextUtils.isEmpty(str)) {
                return this.f3013b;
            }
            byte b2 = 0;
            for (int i = 0; i < this.f3012a.size(); i++) {
                e eVar = this.f3012a.get(i);
                if (eVar != null && eVar.a().equals(str)) {
                    return eVar;
                }
            }
            e eVar2 = new e(b2);
            eVar2.b(str);
            this.f3012a.add(eVar2);
            return eVar2;
        }
    }

    static String a(Map<String, String> map) {
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
                sb.append("&");
            }
            sb.append(URLEncoder.encode(key));
            sb.append("=");
            sb.append(URLEncoder.encode(value));
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(String str) {
        if (this.l) {
            return true;
        }
        return (!TextUtils.isEmpty(this.n) && (this.n.contains("rest") || this.n.contains("apilocate"))) || c(str);
    }

    private static boolean c(String str) {
        return str.contains("rest") || str.contains("apilocate");
    }

    private static int a(Exception exc) {
        if (exc instanceof SSLHandshakeException) {
            return 4101;
        }
        if (exc instanceof SSLKeyException) {
            return 4102;
        }
        if (exc instanceof SSLProtocolException) {
            return 4103;
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
            return 2101;
        }
        return exc instanceof SocketTimeoutException ? 2102 : 0;
    }

    final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f3016a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f3017b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        c f3018c = new c();
        a d;
        c e;
        String f;
        URL g;

        f() {
        }

        public final void a(la laVar, URL url) {
            this.g = url;
            this.f3018c.d = url.getPath();
            this.f3018c.e = url.getHost();
            if (!TextUtils.isEmpty(kx.this.n) && laVar.getDegradeType().b()) {
                c cVar = this.f3018c;
                cVar.f3011c = cVar.e.replace("[", "").replace("]", "");
                this.f3018c.e = kx.this.n;
            }
            if (laVar.getDegradeType().b()) {
                laVar.setNon_degrade_final_Host(this.f3018c.e);
            }
            if (laVar.getDegradeType().d()) {
                this.f = laVar.getNon_degrade_final_Host();
            }
        }

        public final void a() {
            this.f3018c.h = SystemClock.elapsedRealtime() - this.f3017b;
        }

        public final void b() {
            this.f3018c.i = SystemClock.elapsedRealtime() - this.f3017b;
        }

        public final void c() {
            this.f3018c.j = SystemClock.elapsedRealtime() - this.f3017b;
        }

        public final void a(lb lbVar) {
            c cVarClone;
            try {
                this.f3018c.f = SystemClock.elapsedRealtime() - this.f3016a;
                if (lbVar != null) {
                    lbVar.f = this.f3018c.f3010b.c();
                }
                if (this.f3018c.f3010b.b() && this.f3018c.f > 10000) {
                    im.a(false, this.f3018c.e);
                }
                if (this.f3018c.f3010b.d()) {
                    im.a(false, this.f);
                }
                boolean zB = kx.this.b(this.f3018c.e);
                if (zB) {
                    im.c(this.f3018c);
                    im.a(true, this.d);
                    if (this.f3018c.f > im.e && (cVarClone = this.f3018c.clone()) != null) {
                        cVarClone.m = 1;
                        im.b(cVarClone);
                        cVarClone.toString();
                        kx.b();
                    }
                }
                im.a(this.g.toString(), this.f3018c.f3010b.c(), false, zB);
                this.f3018c.toString();
                kx.b();
            } catch (Throwable unused) {
            }
        }

        public final void a(int i) {
            "----errorcode-----".concat(String.valueOf(i));
            kx.b();
            try {
                this.f3018c.f = SystemClock.elapsedRealtime() - this.f3016a;
                this.f3018c.m = i;
                if (this.f3018c.f3010b.e()) {
                    im.a(false, this.f3018c.e);
                }
                boolean zB = kx.this.b(this.f3018c.e);
                if (zB) {
                    if (kx.this.p && !TextUtils.isEmpty(kx.this.n) && this.f3018c.f3010b.b()) {
                        im.d();
                    }
                    if (this.f3018c.f3010b.c()) {
                        im.a(this.f3018c.f3010b.c(), this.f3018c.e);
                    }
                    im.c(this.e);
                    im.a(false, this.d);
                    im.b(this.f3018c);
                }
                im.a(this.g.toString(), this.f3018c.f3010b.c(), true, zB);
                this.f3018c.toString();
                kx.b();
            } catch (Throwable unused) {
            }
        }

        public final void b(int i) {
            this.f3018c.n = i;
        }

        public final void a(long j) {
            this.f3018c.l = new DecimalFormat("0.00").format(j / 1024.0f);
        }

        public final void d() {
            c cVarClone = this.f3018c.clone();
            if (this.f3018c.f > im.e) {
                cVarClone.m = 1;
            }
            im.a(cVarClone);
        }
    }

    public static final class c implements Cloneable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f3009a = "";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public la.b f3010b = la.b.FIRST_NONDEGRADE;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f3011c = "";
        public String d = "";
        public String e = "";
        public long f = 0;
        public long g = 0;
        public long h = 0;
        public long i = 0;
        public long j = 0;
        public String k = Constants.LINK;
        public String l = Constants.LINK;
        public int m = 0;
        public int n = 0;

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c clone() {
            try {
                return (c) super.clone();
            } catch (CloneNotSupportedException unused) {
                return null;
            }
        }

        protected final String b() {
            String str;
            String str2;
            if (TextUtils.isEmpty(this.f3011c)) {
                str = "-#";
            } else {
                str = this.f3011c + "#";
            }
            if (!TextUtils.isEmpty(this.d)) {
                str2 = str + this.d + "#";
            } else {
                str2 = str + "-#";
            }
            String strB = iq.b(kp.a(((((str2 + this.f3010b.a() + "#") + this.h + "#") + this.j + "#") + this.f).getBytes(), "YXBtX25ldHdvcmtf".getBytes()));
            kx.b();
            return strB;
        }

        public final String toString() {
            return "RequestInfo{csid='" + this.f3009a + "', degradeType=" + this.f3010b + ", serverIp='" + this.f3011c + "', path='" + this.d + "', hostname='" + this.e + "', totalTime=" + this.f + ", DNSTime=" + this.g + ", connectionTime=" + this.h + ", writeTime=" + this.i + ", readTime=" + this.j + ", serverTime='" + this.k + "', datasize='" + this.l + "', errorcode=" + this.m + ", errorcodeSub=" + this.n + '}';
        }
    }

    public static final class a implements Cloneable, Comparable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f3004a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f3005b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f3006c;
        public String d;
        public String e;
        public int f;
        public int g;
        public int h;
        public long i;
        public volatile AtomicInteger j = new AtomicInteger(1);

        public a(c cVar) {
            this.f3005b = cVar.f3011c;
            this.f3006c = cVar.e;
            this.e = cVar.d;
            this.f = cVar.m;
            this.g = cVar.n;
            this.h = cVar.f3010b.a();
            this.d = cVar.f3009a;
            this.i = cVar.f;
            if (this.f == 10) {
                this.f3004a = 0;
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

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return this.f3004a - ((a) obj).f3004a;
        }

        public final String b() {
            String str;
            String str2;
            String str3;
            String str4;
            try {
                String str5 = this.f + "#";
                if (!TextUtils.isEmpty(this.e)) {
                    str = str5 + this.e + "#";
                } else {
                    str = str5 + "-#";
                }
                String str6 = (str + this.h + "#") + this.j + "#";
                if (!TextUtils.isEmpty(this.f3005b)) {
                    str2 = str6 + this.f3005b + "#";
                } else {
                    str2 = str6 + "-#";
                }
                if (this.f == 1) {
                    str3 = str2 + this.d + "#";
                } else {
                    str3 = str2 + "-#";
                }
                if (this.f == 1) {
                    str4 = str3 + this.i + "#";
                } else {
                    str4 = str3 + "-#";
                }
                String strB = iq.b(kp.a(((str4 + this.f3006c + "#") + this.g).getBytes(), "YXBtX25ldHdvcmtf".getBytes()));
                kx.b();
                return strB;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    private static String a(String str, String str2) {
        String strA;
        String str3 = Build.MANUFACTURER;
        if (im.f2770c == null) {
            strA = "";
        } else {
            strA = iy.a(im.f2770c);
        }
        return String.format("platform=Android&sdkversion=%s&product=%s&manufacture=%s&abitype=%s", str, str2, str3, strA);
    }
}

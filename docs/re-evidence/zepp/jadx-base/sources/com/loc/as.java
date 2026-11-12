package com.loc;

import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.amap.api.maps.AMapException;
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
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.Vector;
import java.util.zip.GZIPInputStream;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes18.dex */
public final class as {
    private static SoftReference<SSLContext> k;
    private static SoftReference<at> m;
    private int a;
    private int b;
    private boolean c;
    private SSLContext d;
    private Proxy e;
    private volatile boolean f;
    private long g;
    private long h;
    private String i;
    private b j;
    private aq.a l;

    public static class a {
        public HttpURLConnection a;
        public int b;

        public a(HttpURLConnection httpURLConnection, int i) {
            this.a = httpURLConnection;
            this.b = i;
        }
    }

    public static class b {
        private Vector<c> a;
        private volatile c b;

        private b() {
            this.a = new Vector<>();
            this.b = new c((byte) 0);
        }

        public /* synthetic */ b(byte b) {
            this();
        }

        public final c a() {
            return this.b;
        }

        public final c a(String str) {
            if (TextUtils.isEmpty(str)) {
                return this.b;
            }
            byte b = 0;
            for (int i = 0; i < this.a.size(); i++) {
                c cVar = this.a.get(i);
                if (cVar != null && cVar.a().equals(str)) {
                    return cVar;
                }
            }
            c cVar2 = new c(b);
            cVar2.b(str);
            this.a.add(cVar2);
            return cVar2;
        }

        public final void b(String str) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.b.a(str);
        }
    }

    public static class c implements HostnameVerifier {
        private String a;
        private String b;

        private c() {
        }

        public /* synthetic */ c(byte b) {
            this();
        }

        public final String a() {
            return this.b;
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
    }

    public as(int i, int i2, Proxy proxy, boolean z) {
        this(i, i2, proxy, z, (byte) 0);
    }

    private as(int i, int i2, Proxy proxy, boolean z, byte b2) {
        SSLContext sSLContext;
        byte b3 = 0;
        this.f = false;
        this.g = -1L;
        this.h = 0L;
        this.a = i;
        this.b = i2;
        this.e = proxy;
        this.c = p.a().b(z);
        l.d();
        if (p.b()) {
            this.c = false;
        }
        this.l = null;
        try {
            this.i = UUID.randomUUID().toString().replaceAll(Constants.ACCEPT_TIME_SEPARATOR_SERVER, "").toLowerCase();
        } catch (Throwable th) {
            y.a(th, "ht", "ic");
        }
        if (this.c) {
            try {
                SoftReference<SSLContext> softReference = k;
                if (softReference == null || softReference.get() == null) {
                    k = new SoftReference<>(SSLContext.getInstance("TLS"));
                }
                SoftReference<SSLContext> softReference2 = k;
                sSLContext = softReference2 != null ? softReference2.get() : null;
            } catch (Throwable unused) {
            }
            if (sSLContext == null) {
                try {
                    sSLContext = SSLContext.getInstance("TLS");
                } catch (Throwable th2) {
                    y.a(th2, "ht", "ne");
                }
            }
            sSLContext.init(null, null, null);
            this.d = sSLContext;
        }
        this.j = new b(b3);
    }

    public static int a(au auVar) {
        try {
            if (l.b()) {
                return 4;
            }
            if (auVar != null && !auVar.i()) {
                return 1;
            }
            if (2 == (!l.a() ? (char) 1 : (char) 2)) {
                return 2;
            }
        } catch (Throwable th) {
            ab.b(th, "htu", "gt");
        }
        return 1;
    }

    private at a() {
        try {
            SoftReference<at> softReference = m;
            if (softReference == null || softReference.get() == null) {
                m = new SoftReference<>(new at(l.c, this.d));
            }
            at atVar = k != null ? m.get() : null;
            return atVar == null ? new at(l.c, this.d) : atVar;
        } catch (Throwable th) {
            ab.b(th, "ht", "gsf");
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:111:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x013d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x011f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x0129 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x0133 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private av a(a aVar) throws Throwable {
        InputStream inputStream;
        InputStream inputStream2;
        PushbackInputStream pushbackInputStream;
        InputStream inputStream3;
        List<String> list;
        String str = "";
        ByteArrayOutputStream byteArrayOutputStream = null;
        gZIPInputStream = null;
        InputStream gZIPInputStream = null;
        byteArrayOutputStream = null;
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            HttpURLConnection httpURLConnection = aVar.a;
            httpURLConnection.connect();
            Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
            int responseCode = httpURLConnection.getResponseCode();
            if (headerFields != null && (list = headerFields.get("gsid")) != null && list.size() > 0) {
                str = list.get(0);
            }
            if (responseCode != 200) {
                j jVar = new j("网络异常原因：" + httpURLConnection.getResponseMessage() + " 网络异常状态码：" + responseCode + "  " + str + " " + this.i, str, this.i);
                jVar.a(responseCode);
                throw jVar;
            }
            a(aVar, false, jCurrentTimeMillis, System.currentTimeMillis());
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                inputStream2 = httpURLConnection.getInputStream();
                try {
                    pushbackInputStream = new PushbackInputStream(inputStream2, 2);
                    try {
                        byte[] bArr = new byte[2];
                        pushbackInputStream.read(bArr);
                        pushbackInputStream.unread(bArr);
                        gZIPInputStream = (bArr[0] == 31 && bArr[1] == -117) ? new GZIPInputStream(pushbackInputStream) : pushbackInputStream;
                        byte[] bArr2 = new byte[1024];
                        while (true) {
                            int i = gZIPInputStream.read(bArr2);
                            if (i == -1) {
                                break;
                            }
                            byteArrayOutputStream2.write(bArr2, 0, i);
                        }
                        ab.c();
                        av avVar = new av();
                        avVar.a = byteArrayOutputStream2.toByteArray();
                        avVar.b = headerFields;
                        avVar.c = this.i;
                        avVar.d = str;
                        try {
                            byteArrayOutputStream2.close();
                        } catch (Throwable th) {
                            y.a(th, "ht", "par");
                        }
                        if (inputStream2 != null) {
                            try {
                                inputStream2.close();
                            } catch (Throwable th2) {
                                y.a(th2, "ht", "par");
                            }
                        }
                        try {
                            pushbackInputStream.close();
                        } catch (Throwable th3) {
                            y.a(th3, "ht", "par");
                        }
                        try {
                            gZIPInputStream.close();
                        } catch (Throwable th4) {
                            y.a(th4, "ht", "par");
                        }
                        return avVar;
                    } catch (IOException unused) {
                        InputStream inputStream4 = gZIPInputStream;
                        byteArrayOutputStream = byteArrayOutputStream2;
                        inputStream3 = inputStream4;
                        try {
                            throw new j(AMapException.ERROR_IO, str, this.i);
                        } catch (Throwable th5) {
                            inputStream = inputStream3;
                            th = th5;
                            if (byteArrayOutputStream != null) {
                                try {
                                    byteArrayOutputStream.close();
                                } catch (Throwable th6) {
                                    y.a(th6, "ht", "par");
                                }
                            }
                            if (inputStream2 != null) {
                                try {
                                    inputStream2.close();
                                } catch (Throwable th7) {
                                    y.a(th7, "ht", "par");
                                }
                            }
                            if (pushbackInputStream != null) {
                                try {
                                    pushbackInputStream.close();
                                } catch (Throwable th8) {
                                    y.a(th8, "ht", "par");
                                }
                            }
                            if (inputStream == null) {
                                throw th;
                            }
                            try {
                                inputStream.close();
                                throw th;
                            } catch (Throwable th9) {
                                y.a(th9, "ht", "par");
                                throw th;
                            }
                        }
                    } catch (Throwable th10) {
                        InputStream inputStream5 = gZIPInputStream;
                        byteArrayOutputStream = byteArrayOutputStream2;
                        th = th10;
                        inputStream = inputStream5;
                        if (byteArrayOutputStream != null) {
                            byteArrayOutputStream.close();
                        }
                        if (inputStream2 != null) {
                            inputStream2.close();
                        }
                        if (pushbackInputStream != null) {
                            pushbackInputStream.close();
                        }
                        if (inputStream == null) {
                            throw th;
                        }
                        inputStream.close();
                        throw th;
                    }
                } catch (IOException unused2) {
                    pushbackInputStream = null;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    inputStream3 = pushbackInputStream;
                    throw new j(AMapException.ERROR_IO, str, this.i);
                } catch (Throwable th11) {
                    th = th11;
                    pushbackInputStream = null;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    th = th;
                    inputStream = pushbackInputStream;
                    if (byteArrayOutputStream != null) {
                        byteArrayOutputStream.close();
                    }
                    if (inputStream2 != null) {
                        inputStream2.close();
                    }
                    if (pushbackInputStream != null) {
                        pushbackInputStream.close();
                    }
                    if (inputStream == null) {
                        throw th;
                    }
                    inputStream.close();
                    throw th;
                }
            } catch (IOException unused3) {
                inputStream2 = null;
                pushbackInputStream = null;
            } catch (Throwable th12) {
                th = th12;
                inputStream2 = null;
                pushbackInputStream = null;
            }
        } catch (IOException unused4) {
            inputStream3 = null;
            inputStream2 = null;
            pushbackInputStream = null;
        } catch (Throwable th13) {
            th = th13;
            inputStream = null;
            inputStream2 = null;
            pushbackInputStream = null;
        }
    }

    private static String a(String str, String str2, int i) {
        if (i == 2 || i == 4) {
            try {
                if (!TextUtils.isEmpty(str2)) {
                    return str2;
                }
            } catch (Throwable unused) {
            }
        }
        return str;
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

    private static void a(a aVar, boolean z, long j, long j2) {
        String string;
        String str;
        boolean z2;
        boolean z3;
        try {
            string = aVar.a.getURL().toString();
            try {
                int i = aVar.b;
                boolean z4 = i == 3;
                z2 = i == 2 || i == 4;
                z3 = z4;
                str = string;
            } catch (Throwable unused) {
                str = string;
                z2 = false;
                z3 = false;
            }
        } catch (Throwable unused2) {
            string = null;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        l.a(str, z2, z3, z, Math.max(0L, j2 - j));
    }

    private void a(Map<String, String> map, HttpURLConnection httpURLConnection) {
        if (map != null) {
            for (String str : map.keySet()) {
                httpURLConnection.addRequestProperty(str, map.get(str));
            }
        }
        try {
            httpURLConnection.addRequestProperty("csid", this.i);
        } catch (Throwable th) {
            y.a(th, "ht", "adh");
        }
        httpURLConnection.setConnectTimeout(this.a);
        httpURLConnection.setReadTimeout(this.b);
    }

    public static boolean a(int i) {
        return i == 2;
    }

    /* JADX WARN: Code duplicated, block: B:141:0x011a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x0033 A[Catch: all -> 0x0133, j -> 0x013e, IOException -> 0x0144, InterruptedIOException -> 0x0151, SocketTimeoutException -> 0x0158, SocketException -> 0x0165, UnknownHostException -> 0x0172, MalformedURLException -> 0x0180, ConnectException -> 0x018e, TRY_ENTER, TryCatch #8 {j -> 0x013e, SocketTimeoutException -> 0x0158, InterruptedIOException -> 0x0151, ConnectException -> 0x018e, MalformedURLException -> 0x0180, SocketException -> 0x0165, UnknownHostException -> 0x0172, IOException -> 0x0144, all -> 0x0133, blocks: (B:3:0x0008, B:14:0x0033, B:15:0x0038, B:17:0x0040, B:19:0x0046, B:20:0x004c, B:24:0x0056, B:26:0x005c, B:28:0x007d, B:29:0x0082, B:31:0x0086, B:32:0x008a, B:34:0x0093, B:37:0x009b, B:39:0x009f, B:40:0x00a4, B:41:0x00a8, B:43:0x00ac, B:45:0x00b2, B:47:0x00b8, B:51:0x00d0, B:53:0x00d6, B:55:0x00da, B:57:0x00e0, B:58:0x00e7, B:48:0x00bf, B:49:0x00c5, B:50:0x00c9, B:52:0x00d4, B:23:0x0054), top: B:140:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0053  */
    /* JADX WARN: Code duplicated, block: B:23:0x0054 A[Catch: all -> 0x0133, j -> 0x013e, IOException -> 0x0144, InterruptedIOException -> 0x0151, SocketTimeoutException -> 0x0158, SocketException -> 0x0165, UnknownHostException -> 0x0172, MalformedURLException -> 0x0180, ConnectException -> 0x018e, TryCatch #8 {j -> 0x013e, SocketTimeoutException -> 0x0158, InterruptedIOException -> 0x0151, ConnectException -> 0x018e, MalformedURLException -> 0x0180, SocketException -> 0x0165, UnknownHostException -> 0x0172, IOException -> 0x0144, all -> 0x0133, blocks: (B:3:0x0008, B:14:0x0033, B:15:0x0038, B:17:0x0040, B:19:0x0046, B:20:0x004c, B:24:0x0056, B:26:0x005c, B:28:0x007d, B:29:0x0082, B:31:0x0086, B:32:0x008a, B:34:0x0093, B:37:0x009b, B:39:0x009f, B:40:0x00a4, B:41:0x00a8, B:43:0x00ac, B:45:0x00b2, B:47:0x00b8, B:51:0x00d0, B:53:0x00d6, B:55:0x00da, B:57:0x00e0, B:58:0x00e7, B:48:0x00bf, B:49:0x00c5, B:50:0x00c9, B:52:0x00d4, B:23:0x0054), top: B:140:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x005c A[Catch: all -> 0x0133, j -> 0x013e, IOException -> 0x0144, InterruptedIOException -> 0x0151, SocketTimeoutException -> 0x0158, SocketException -> 0x0165, UnknownHostException -> 0x0172, MalformedURLException -> 0x0180, ConnectException -> 0x018e, TryCatch #8 {j -> 0x013e, SocketTimeoutException -> 0x0158, InterruptedIOException -> 0x0151, ConnectException -> 0x018e, MalformedURLException -> 0x0180, SocketException -> 0x0165, UnknownHostException -> 0x0172, IOException -> 0x0144, all -> 0x0133, blocks: (B:3:0x0008, B:14:0x0033, B:15:0x0038, B:17:0x0040, B:19:0x0046, B:20:0x004c, B:24:0x0056, B:26:0x005c, B:28:0x007d, B:29:0x0082, B:31:0x0086, B:32:0x008a, B:34:0x0093, B:37:0x009b, B:39:0x009f, B:40:0x00a4, B:41:0x00a8, B:43:0x00ac, B:45:0x00b2, B:47:0x00b8, B:51:0x00d0, B:53:0x00d6, B:55:0x00da, B:57:0x00e0, B:58:0x00e7, B:48:0x00bf, B:49:0x00c5, B:50:0x00c9, B:52:0x00d4, B:23:0x0054), top: B:140:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x007d A[Catch: all -> 0x0133, j -> 0x013e, IOException -> 0x0144, InterruptedIOException -> 0x0151, SocketTimeoutException -> 0x0158, SocketException -> 0x0165, UnknownHostException -> 0x0172, MalformedURLException -> 0x0180, ConnectException -> 0x018e, TryCatch #8 {j -> 0x013e, SocketTimeoutException -> 0x0158, InterruptedIOException -> 0x0151, ConnectException -> 0x018e, MalformedURLException -> 0x0180, SocketException -> 0x0165, UnknownHostException -> 0x0172, IOException -> 0x0144, all -> 0x0133, blocks: (B:3:0x0008, B:14:0x0033, B:15:0x0038, B:17:0x0040, B:19:0x0046, B:20:0x004c, B:24:0x0056, B:26:0x005c, B:28:0x007d, B:29:0x0082, B:31:0x0086, B:32:0x008a, B:34:0x0093, B:37:0x009b, B:39:0x009f, B:40:0x00a4, B:41:0x00a8, B:43:0x00ac, B:45:0x00b2, B:47:0x00b8, B:51:0x00d0, B:53:0x00d6, B:55:0x00da, B:57:0x00e0, B:58:0x00e7, B:48:0x00bf, B:49:0x00c5, B:50:0x00c9, B:52:0x00d4, B:23:0x0054), top: B:140:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0086 A[Catch: all -> 0x0133, j -> 0x013e, IOException -> 0x0144, InterruptedIOException -> 0x0151, SocketTimeoutException -> 0x0158, SocketException -> 0x0165, UnknownHostException -> 0x0172, MalformedURLException -> 0x0180, ConnectException -> 0x018e, TryCatch #8 {j -> 0x013e, SocketTimeoutException -> 0x0158, InterruptedIOException -> 0x0151, ConnectException -> 0x018e, MalformedURLException -> 0x0180, SocketException -> 0x0165, UnknownHostException -> 0x0172, IOException -> 0x0144, all -> 0x0133, blocks: (B:3:0x0008, B:14:0x0033, B:15:0x0038, B:17:0x0040, B:19:0x0046, B:20:0x004c, B:24:0x0056, B:26:0x005c, B:28:0x007d, B:29:0x0082, B:31:0x0086, B:32:0x008a, B:34:0x0093, B:37:0x009b, B:39:0x009f, B:40:0x00a4, B:41:0x00a8, B:43:0x00ac, B:45:0x00b2, B:47:0x00b8, B:51:0x00d0, B:53:0x00d6, B:55:0x00da, B:57:0x00e0, B:58:0x00e7, B:48:0x00bf, B:49:0x00c5, B:50:0x00c9, B:52:0x00d4, B:23:0x0054), top: B:140:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0093 A[Catch: all -> 0x0133, j -> 0x013e, IOException -> 0x0144, InterruptedIOException -> 0x0151, SocketTimeoutException -> 0x0158, SocketException -> 0x0165, UnknownHostException -> 0x0172, MalformedURLException -> 0x0180, ConnectException -> 0x018e, TryCatch #8 {j -> 0x013e, SocketTimeoutException -> 0x0158, InterruptedIOException -> 0x0151, ConnectException -> 0x018e, MalformedURLException -> 0x0180, SocketException -> 0x0165, UnknownHostException -> 0x0172, IOException -> 0x0144, all -> 0x0133, blocks: (B:3:0x0008, B:14:0x0033, B:15:0x0038, B:17:0x0040, B:19:0x0046, B:20:0x004c, B:24:0x0056, B:26:0x005c, B:28:0x007d, B:29:0x0082, B:31:0x0086, B:32:0x008a, B:34:0x0093, B:37:0x009b, B:39:0x009f, B:40:0x00a4, B:41:0x00a8, B:43:0x00ac, B:45:0x00b2, B:47:0x00b8, B:51:0x00d0, B:53:0x00d6, B:55:0x00da, B:57:0x00e0, B:58:0x00e7, B:48:0x00bf, B:49:0x00c5, B:50:0x00c9, B:52:0x00d4, B:23:0x0054), top: B:140:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0098  */
    /* JADX WARN: Code duplicated, block: B:37:0x009b A[Catch: all -> 0x0133, j -> 0x013e, IOException -> 0x0144, InterruptedIOException -> 0x0151, SocketTimeoutException -> 0x0158, SocketException -> 0x0165, UnknownHostException -> 0x0172, MalformedURLException -> 0x0180, ConnectException -> 0x018e, TryCatch #8 {j -> 0x013e, SocketTimeoutException -> 0x0158, InterruptedIOException -> 0x0151, ConnectException -> 0x018e, MalformedURLException -> 0x0180, SocketException -> 0x0165, UnknownHostException -> 0x0172, IOException -> 0x0144, all -> 0x0133, blocks: (B:3:0x0008, B:14:0x0033, B:15:0x0038, B:17:0x0040, B:19:0x0046, B:20:0x004c, B:24:0x0056, B:26:0x005c, B:28:0x007d, B:29:0x0082, B:31:0x0086, B:32:0x008a, B:34:0x0093, B:37:0x009b, B:39:0x009f, B:40:0x00a4, B:41:0x00a8, B:43:0x00ac, B:45:0x00b2, B:47:0x00b8, B:51:0x00d0, B:53:0x00d6, B:55:0x00da, B:57:0x00e0, B:58:0x00e7, B:48:0x00bf, B:49:0x00c5, B:50:0x00c9, B:52:0x00d4, B:23:0x0054), top: B:140:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x009f A[Catch: all -> 0x0133, j -> 0x013e, IOException -> 0x0144, InterruptedIOException -> 0x0151, SocketTimeoutException -> 0x0158, SocketException -> 0x0165, UnknownHostException -> 0x0172, MalformedURLException -> 0x0180, ConnectException -> 0x018e, TryCatch #8 {j -> 0x013e, SocketTimeoutException -> 0x0158, InterruptedIOException -> 0x0151, ConnectException -> 0x018e, MalformedURLException -> 0x0180, SocketException -> 0x0165, UnknownHostException -> 0x0172, IOException -> 0x0144, all -> 0x0133, blocks: (B:3:0x0008, B:14:0x0033, B:15:0x0038, B:17:0x0040, B:19:0x0046, B:20:0x004c, B:24:0x0056, B:26:0x005c, B:28:0x007d, B:29:0x0082, B:31:0x0086, B:32:0x008a, B:34:0x0093, B:37:0x009b, B:39:0x009f, B:40:0x00a4, B:41:0x00a8, B:43:0x00ac, B:45:0x00b2, B:47:0x00b8, B:51:0x00d0, B:53:0x00d6, B:55:0x00da, B:57:0x00e0, B:58:0x00e7, B:48:0x00bf, B:49:0x00c5, B:50:0x00c9, B:52:0x00d4, B:23:0x0054), top: B:140:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00a4 A[Catch: all -> 0x0133, j -> 0x013e, IOException -> 0x0144, InterruptedIOException -> 0x0151, SocketTimeoutException -> 0x0158, SocketException -> 0x0165, UnknownHostException -> 0x0172, MalformedURLException -> 0x0180, ConnectException -> 0x018e, TryCatch #8 {j -> 0x013e, SocketTimeoutException -> 0x0158, InterruptedIOException -> 0x0151, ConnectException -> 0x018e, MalformedURLException -> 0x0180, SocketException -> 0x0165, UnknownHostException -> 0x0172, IOException -> 0x0144, all -> 0x0133, blocks: (B:3:0x0008, B:14:0x0033, B:15:0x0038, B:17:0x0040, B:19:0x0046, B:20:0x004c, B:24:0x0056, B:26:0x005c, B:28:0x007d, B:29:0x0082, B:31:0x0086, B:32:0x008a, B:34:0x0093, B:37:0x009b, B:39:0x009f, B:40:0x00a4, B:41:0x00a8, B:43:0x00ac, B:45:0x00b2, B:47:0x00b8, B:51:0x00d0, B:53:0x00d6, B:55:0x00da, B:57:0x00e0, B:58:0x00e7, B:48:0x00bf, B:49:0x00c5, B:50:0x00c9, B:52:0x00d4, B:23:0x0054), top: B:140:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00ac A[Catch: all -> 0x0133, j -> 0x013e, IOException -> 0x0144, InterruptedIOException -> 0x0151, SocketTimeoutException -> 0x0158, SocketException -> 0x0165, UnknownHostException -> 0x0172, MalformedURLException -> 0x0180, ConnectException -> 0x018e, TryCatch #8 {j -> 0x013e, SocketTimeoutException -> 0x0158, InterruptedIOException -> 0x0151, ConnectException -> 0x018e, MalformedURLException -> 0x0180, SocketException -> 0x0165, UnknownHostException -> 0x0172, IOException -> 0x0144, all -> 0x0133, blocks: (B:3:0x0008, B:14:0x0033, B:15:0x0038, B:17:0x0040, B:19:0x0046, B:20:0x004c, B:24:0x0056, B:26:0x005c, B:28:0x007d, B:29:0x0082, B:31:0x0086, B:32:0x008a, B:34:0x0093, B:37:0x009b, B:39:0x009f, B:40:0x00a4, B:41:0x00a8, B:43:0x00ac, B:45:0x00b2, B:47:0x00b8, B:51:0x00d0, B:53:0x00d6, B:55:0x00da, B:57:0x00e0, B:58:0x00e7, B:48:0x00bf, B:49:0x00c5, B:50:0x00c9, B:52:0x00d4, B:23:0x0054), top: B:140:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00d4 A[Catch: all -> 0x0133, j -> 0x013e, IOException -> 0x0144, InterruptedIOException -> 0x0151, SocketTimeoutException -> 0x0158, SocketException -> 0x0165, UnknownHostException -> 0x0172, MalformedURLException -> 0x0180, ConnectException -> 0x018e, TryCatch #8 {j -> 0x013e, SocketTimeoutException -> 0x0158, InterruptedIOException -> 0x0151, ConnectException -> 0x018e, MalformedURLException -> 0x0180, SocketException -> 0x0165, UnknownHostException -> 0x0172, IOException -> 0x0144, all -> 0x0133, blocks: (B:3:0x0008, B:14:0x0033, B:15:0x0038, B:17:0x0040, B:19:0x0046, B:20:0x004c, B:24:0x0056, B:26:0x005c, B:28:0x007d, B:29:0x0082, B:31:0x0086, B:32:0x008a, B:34:0x0093, B:37:0x009b, B:39:0x009f, B:40:0x00a4, B:41:0x00a8, B:43:0x00ac, B:45:0x00b2, B:47:0x00b8, B:51:0x00d0, B:53:0x00d6, B:55:0x00da, B:57:0x00e0, B:58:0x00e7, B:48:0x00bf, B:49:0x00c5, B:50:0x00c9, B:52:0x00d4, B:23:0x0054), top: B:140:0x0008 }] */
    /* JADX WARN: Multi-variable type inference failed */
    public final av a(String str, String str2, boolean z, String str3, Map<String, String> map, byte[] bArr, int i) throws j {
        c cVarA;
        String str4;
        URL url;
        aq.a aVar;
        URLConnection uRLConnectionOpenConnection;
        HttpURLConnection httpURLConnection;
        HttpURLConnection httpURLConnection2;
        HttpsURLConnection httpsURLConnection;
        at atVarA;
        Proxy proxy;
        HttpURLConnection httpURLConnection3 = null;
        try {
            try {
                n.c();
                String strA = a(str, str2, i);
                try {
                    try {
                        if (i != 2) {
                            if (i == 3) {
                                this.a = 5000;
                                this.b = 5000;
                            }
                            if (map == null) {
                                map = new HashMap<>();
                            }
                            cVarA = this.j.a();
                            if (z && !TextUtils.isEmpty(str3)) {
                                cVarA = this.j.a(str3);
                            }
                            str4 = "";
                            if (aq.a != 1) {
                                str4 = aq.b;
                            }
                            if (!TextUtils.isEmpty(str4)) {
                                Uri uri = Uri.parse(strA);
                                String host = uri.getHost();
                                strA = uri.buildUpon().encodedAuthority(str4).build().toString();
                                map.put("targetHost", host);
                                if (this.c) {
                                    this.j.b(str4);
                                }
                            }
                            if (this.c) {
                                strA = p.a(strA);
                            }
                            url = new URL(strA);
                            aVar = this.l;
                            if (aVar != null) {
                                uRLConnectionOpenConnection = aVar.a();
                            } else {
                                uRLConnectionOpenConnection = null;
                            }
                            if (uRLConnectionOpenConnection == null) {
                                proxy = this.e;
                                if (proxy != null) {
                                    uRLConnectionOpenConnection = url.openConnection(proxy);
                                } else {
                                    uRLConnectionOpenConnection = url.openConnection();
                                }
                            }
                            if (this.c) {
                                httpsURLConnection = (HttpsURLConnection) uRLConnectionOpenConnection;
                                if (l.d.a || (atVarA = a()) == null) {
                                    httpsURLConnection.setSSLSocketFactory(socketFactory);
                                } else {
                                    httpsURLConnection.setSSLSocketFactory(atVarA);
                                    atVarA.a();
                                }
                                httpsURLConnection.setHostnameVerifier(cVarA);
                                httpURLConnection = httpsURLConnection;
                            } else {
                                httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                            }
                            if (Build.VERSION.SDK != null && Build.VERSION.SDK_INT > 13) {
                                httpURLConnection.setRequestProperty("Connection", "close");
                            }
                            a(map, httpURLConnection);
                            httpURLConnection.setRequestMethod("POST");
                            httpURLConnection.setUseCaches(false);
                            httpURLConnection.setDoInput(true);
                            httpURLConnection.setDoOutput(true);
                            a aVar2 = new a(httpURLConnection, i);
                            httpURLConnection2 = aVar2.a;
                            if (bArr != null && bArr.length > 0) {
                                DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection2.getOutputStream());
                                dataOutputStream.write(bArr);
                                dataOutputStream.close();
                            }
                            av avVarA = a(aVar2);
                            if (httpURLConnection2 != null) {
                                try {
                                    httpURLConnection2.disconnect();
                                } catch (Throwable th) {
                                    y.a(th, "ht", "mPt");
                                }
                            }
                            return avVarA;
                        }
                        this.a = Math.max(this.a - 5000, 5000);
                        this.b = Math.max(this.b - 5000, 5000);
                        httpURLConnection2 = aVar2.a;
                        if (bArr != null) {
                            DataOutputStream dataOutputStream2 = new DataOutputStream(httpURLConnection2.getOutputStream());
                            dataOutputStream2.write(bArr);
                            dataOutputStream2.close();
                        }
                        av avVarA2 = a(aVar2);
                        if (httpURLConnection2 != null) {
                            httpURLConnection2.disconnect();
                        }
                        return avVarA2;
                    } catch (j e) {
                        e = e;
                        y.a(e, "ht", "mPt");
                        throw e;
                    } catch (ConnectException e2) {
                        e = e2;
                        e.printStackTrace();
                        throw new j(AMapException.ERROR_CONNECTION);
                    } catch (MalformedURLException e3) {
                        e = e3;
                        e.printStackTrace();
                        throw new j(AMapException.ERROR_URL);
                    } catch (SocketException e4) {
                        e = e4;
                        e.printStackTrace();
                        throw new j(AMapException.ERROR_SOCKET);
                    } catch (SocketTimeoutException e5) {
                        e = e5;
                        e.printStackTrace();
                        throw new j(AMapException.ERROR_SOCKE_TIME_OUT);
                    } catch (InterruptedIOException unused) {
                        throw new j(AMapException.ERROR_UNKNOWN);
                    } catch (UnknownHostException e6) {
                        e = e6;
                        e.printStackTrace();
                        throw new j(AMapException.ERROR_UNKNOW_HOST);
                    } catch (IOException e7) {
                        e = e7;
                        e.printStackTrace();
                        throw new j(AMapException.ERROR_IO);
                    } catch (Throwable th2) {
                        th = th2;
                        y.a(th, "ht", "mPt");
                        throw new j(AMapException.ERROR_UNKNOWN);
                    }
                } catch (Throwable unused2) {
                }
                if (map == null) {
                    map = new HashMap<>();
                }
                cVarA = this.j.a();
                if (z) {
                    cVarA = this.j.a(str3);
                }
                str4 = "";
                if (aq.a != 1) {
                    str4 = aq.b;
                }
                if (!TextUtils.isEmpty(str4)) {
                    Uri uri2 = Uri.parse(strA);
                    String host2 = uri2.getHost();
                    strA = uri2.buildUpon().encodedAuthority(str4).build().toString();
                    map.put("targetHost", host2);
                    if (this.c) {
                        this.j.b(str4);
                    }
                }
                if (this.c) {
                    strA = p.a(strA);
                }
                url = new URL(strA);
                aVar = this.l;
                if (aVar != null) {
                    uRLConnectionOpenConnection = aVar.a();
                } else {
                    uRLConnectionOpenConnection = null;
                }
                if (uRLConnectionOpenConnection == null) {
                    proxy = this.e;
                    if (proxy != null) {
                        uRLConnectionOpenConnection = url.openConnection(proxy);
                    } else {
                        uRLConnectionOpenConnection = url.openConnection();
                    }
                }
                if (this.c) {
                    httpsURLConnection = (HttpsURLConnection) uRLConnectionOpenConnection;
                    SSLSocketFactory socketFactory = l.d.a ? this.d.getSocketFactory() : this.d.getSocketFactory();
                    httpsURLConnection.setSSLSocketFactory(socketFactory);
                    httpsURLConnection.setHostnameVerifier(cVarA);
                    httpURLConnection = httpsURLConnection;
                } else {
                    httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                }
                if (Build.VERSION.SDK != null) {
                    httpURLConnection.setRequestProperty("Connection", "close");
                }
                a(map, httpURLConnection);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setDoOutput(true);
                a aVar3 = new a(httpURLConnection, i);
            } catch (Throwable th3) {
                try {
                    l.a(i);
                    a(str2, true, 0L, 0L);
                } catch (Throwable unused3) {
                }
                if (0 == 0) {
                    throw th3;
                }
                try {
                    httpURLConnection3.disconnect();
                    throw th3;
                } catch (Throwable th4) {
                    y.a(th4, "ht", "mPt");
                    throw th3;
                }
            }
        } catch (j e8) {
            e = e8;
        } catch (SocketTimeoutException e9) {
            e = e9;
        } catch (InterruptedIOException unused4) {
        } catch (ConnectException e10) {
            e = e10;
        } catch (MalformedURLException e11) {
            e = e11;
        } catch (SocketException e12) {
            e = e12;
        } catch (UnknownHostException e13) {
            e = e13;
        } catch (IOException e14) {
            e = e14;
        } catch (Throwable th5) {
            th = th5;
        }
    }
}

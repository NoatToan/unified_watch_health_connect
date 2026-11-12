package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.example.statistics.export.OneTrackConstant;
import com.miui.tsmclient.common.net.NetConstants;
import com.xiaomi.fitness.sync.SyncEngine;
import com.xiaomi.smarthome.frame.server_compact.ServerConstants;
import com.xiaomi.smarthome.library.apache.http.protocol.HTTP;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes11.dex */
public class obs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicReference<a<xbs>> f28980a = new AtomicReference<>(d());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f28981b = Pattern.compile("([^\\s;]+)(.*)");
    public static final Pattern c = Pattern.compile("(.*?charset\\s*=[^a-zA-Z0-9]*)([-a-zA-Z0-9]+)(.*)", 2);
    public static final Pattern d = Pattern.compile("(\\<\\?xml\\s+.*?encoding\\s*=[^a-zA-Z0-9]*)([-a-zA-Z0-9]+)(.*)", 2);

    public static class a<T> extends FutureTask<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f28982a;

        public a(Callable<T> callable) {
            super(callable);
        }

        public boolean a() {
            return y0t.j(odt.b()) || (isDone() && Math.abs(SystemClock.elapsedRealtime() - this.f28982a) > SyncEngine.SYNC_WEATHER_DURATION);
        }

        @Override // java.util.concurrent.FutureTask, java.util.concurrent.RunnableFuture, java.lang.Runnable
        public void run() {
            this.f28982a = SystemClock.elapsedRealtime();
            super.run();
        }
    }

    public static final class b extends FilterInputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f28983a;

        public b(InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            int i3;
            if (!this.f28983a && (i3 = super.read(bArr, i, i2)) != -1) {
                return i3;
            }
            this.f28983a = true;
            return -1;
        }
    }

    public static class c {
    }

    public static boolean A(Context context) {
        xbs xbsVarF = f(context);
        return xbsVarF != null && xbsVarF.a() == 0 && 13 == xbsVarF.g();
    }

    public static boolean B(Context context) {
        xbs xbsVarF = f(context);
        if (xbsVarF == null || xbsVarF.a() != 0) {
            return false;
        }
        String strH = xbsVarF.h();
        if (!"TD-SCDMA".equalsIgnoreCase(strH) && !"CDMA2000".equalsIgnoreCase(strH) && !"WCDMA".equalsIgnoreCase(strH)) {
            switch (xbsVarF.g()) {
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                    break;
                case 4:
                case 7:
                case 11:
                case 13:
                default:
                    return false;
            }
        }
        return true;
    }

    public static boolean C(Context context) {
        xbs xbsVarF = f(context);
        if (xbsVarF == null || xbsVarF.a() != 0) {
            return false;
        }
        int iG = xbsVarF.g();
        return iG == 1 || iG == 2 || iG == 4 || iG == 7 || iG == 11;
    }

    public static int a(Context context) {
        xbs xbsVarE = e();
        if (xbsVarE == null) {
            return -1;
        }
        return xbsVarE.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static fbs b(Context context, String str, String str2, Map<String, String> map, String str3) {
        boolean zEqualsIgnoreCase;
        BufferedReader bufferedReader;
        fbs fbsVar = new fbs();
        try {
            try {
                try {
                    HttpURLConnection httpURLConnectionP = p(context, q(str));
                    httpURLConnectionP.setConnectTimeout(10000);
                    httpURLConnectionP.setReadTimeout(15000);
                    String str4 = str2;
                    if (str2 == 0) {
                        str4 = "GET";
                    }
                    httpURLConnectionP.setRequestMethod(str4);
                    int i = 0;
                    if (map != null) {
                        zEqualsIgnoreCase = "gzip".equalsIgnoreCase(map.get(HTTP.CONTENT_ENCODING));
                        for (String str5 : map.keySet()) {
                            httpURLConnectionP.setRequestProperty(str5, map.get(str5));
                        }
                    } else {
                        zEqualsIgnoreCase = false;
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        httpURLConnectionP.setDoOutput(true);
                        byte[] bytes = str3.getBytes();
                        OutputStream gZIPOutputStream = zEqualsIgnoreCase ? new GZIPOutputStream(httpURLConnectionP.getOutputStream()) : httpURLConnectionP.getOutputStream();
                        try {
                            gZIPOutputStream.write(bytes, 0, bytes.length);
                            gZIPOutputStream.flush();
                            gZIPOutputStream.close();
                        } catch (IOException e) {
                            e = e;
                        } catch (Throwable th) {
                            th = th;
                            throw new IOException(th.getMessage());
                        }
                    }
                    fbsVar.f17637a = httpURLConnectionP.getResponseCode();
                    x9s.o("Http POST Response Code: " + fbsVar.f17637a);
                    while (true) {
                        String headerFieldKey = httpURLConnectionP.getHeaderFieldKey(i);
                        String headerField = httpURLConnectionP.getHeaderField(i);
                        if (headerFieldKey == null && headerField == null) {
                            try {
                                break;
                            } catch (IOException unused) {
                                bufferedReader = new BufferedReader(new InputStreamReader(new b(httpURLConnectionP.getErrorStream())));
                            }
                        } else {
                            fbsVar.f17638b.put(headerFieldKey, headerField);
                            i += 2;
                        }
                        throw new IOException("err while request " + str + ":" + e.getClass().getSimpleName());
                    }
                    bufferedReader = new BufferedReader(new InputStreamReader(new b(httpURLConnectionP.getInputStream())));
                    try {
                        StringBuffer stringBuffer = new StringBuffer();
                        String property = System.getProperty("line.separator");
                        for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                            stringBuffer.append(line);
                            stringBuffer.append(property);
                        }
                        fbsVar.c = stringBuffer.toString();
                        bufferedReader.close();
                        mgt.b(null);
                        mgt.b(null);
                        return fbsVar;
                    } catch (IOException e2) {
                        e = e2;
                    } catch (Throwable th2) {
                        th = th2;
                        throw new IOException(th.getMessage());
                    }
                } catch (IOException e3) {
                    e = e3;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            mgt.b(null);
            mgt.b(str2);
            throw th4;
        }
    }

    public static fbs c(Context context, String str, Map<String, String> map) {
        return b(context, str, "POST", null, o(map));
    }

    public static a<xbs> d() {
        return new a<>(new ubs());
    }

    public static xbs e() {
        AtomicReference<a<xbs>> atomicReference = f28980a;
        a<xbs> aVarD = atomicReference.get();
        if (aVarD != null) {
            try {
                if (aVarD.a()) {
                    aVarD = d();
                    atomicReference.set(aVarD);
                }
                if (!aVarD.isDone()) {
                    aVarD.run();
                }
                return aVarD.get();
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static xbs f(Context context) {
        return e();
    }

    public static InputStream g(Context context, URL url, boolean z, String str, String str2) {
        return h(context, url, z, str, str2, null, null);
    }

    public static InputStream h(Context context, URL url, boolean z, String str, String str2, Map<String, String> map, c cVar) throws IOException {
        if (context == null) {
            throw new IllegalArgumentException("context");
        }
        if (url == null) {
            throw new IllegalArgumentException("url");
        }
        if (!z) {
            url = new URL(m(url.toString()));
        }
        try {
            HttpURLConnection.setFollowRedirects(true);
            HttpURLConnection httpURLConnectionP = p(context, url);
            httpURLConnectionP.setConnectTimeout(10000);
            httpURLConnectionP.setReadTimeout(15000);
            if (!TextUtils.isEmpty(str)) {
                httpURLConnectionP.setRequestProperty("User-Agent", str);
            }
            if (str2 != null) {
                httpURLConnectionP.setRequestProperty(NetConstants.COOKIE, str2);
            }
            if (map != null) {
                for (String str3 : map.keySet()) {
                    httpURLConnectionP.setRequestProperty(str3, map.get(str3));
                }
            }
            return new b(httpURLConnectionP.getInputStream());
        } catch (IOException e) {
            throw new IOException("IOException:" + e.getClass().getSimpleName());
        } catch (Throwable th) {
            throw new IOException(th.getMessage());
        }
    }

    public static Object i(Context context) {
        if (context == null) {
            context = odt.b();
        }
        sbs sbsVar = null;
        if (context == null || y0t.j(context)) {
            return null;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(OneTrackConstant.EVENT_NAME_CONNECTIVITY);
            NetworkRequest networkRequestBuild = new NetworkRequest.Builder().build();
            sbs sbsVar2 = new sbs();
            try {
                connectivityManager.registerNetworkCallback(networkRequestBuild, sbsVar2);
                return sbsVar2;
            } catch (Throwable th) {
                th = th;
                sbsVar = sbsVar2;
                x9s.o("exception occurred in adding network callback :" + th);
                return sbsVar;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static String j(Context context) {
        if (y(context)) {
            return "wifi";
        }
        xbs xbsVarE = e();
        if (xbsVarE == null) {
            return "";
        }
        return (xbsVarE.e() + "-" + xbsVarE.h() + "-" + xbsVarE.i()).toLowerCase();
    }

    public static String k(Context context, URL url) {
        return l(context, url, false, null, "UTF-8", null);
    }

    public static String l(Context context, URL url, boolean z, String str, String str2, String str3) throws Throwable {
        InputStream inputStreamG;
        try {
            inputStreamG = g(context, url, z, str, str3);
            try {
                StringBuilder sb = new StringBuilder(1024);
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamG, str2));
                char[] cArr = new char[4096];
                while (true) {
                    int i = bufferedReader.read(cArr);
                    if (-1 == i) {
                        mgt.b(inputStreamG);
                        return sb.toString();
                    }
                    sb.append(cArr, 0, i);
                }
            } catch (Throwable th) {
                th = th;
                mgt.b(inputStreamG);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStreamG = null;
        }
    }

    public static String m(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        new String();
        return String.format("%s&key=%s", str, mcs.b(String.format("%sbe988a6134bc8254465424e5a70ef037", str)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String n(String str, Map<String, String> map, File file, String str2) {
        if (!file.exists()) {
            return null;
        }
        String name = file.getName();
        try {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                httpURLConnection.setReadTimeout(15000);
                httpURLConnection.setConnectTimeout(10000);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setRequestProperty(HTTP.CONN_DIRECTIVE, HTTP.CONN_KEEP_ALIVE);
                httpURLConnection.setRequestProperty("Content-Type", "multipart/form-data;boundary=*****");
                if (map != null) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                    }
                }
                httpURLConnection.setFixedLengthStreamingMode(name.length() + 77 + ((int) file.length()) + str2.length());
                DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                dataOutputStream.writeBytes("--*****\r\n");
                dataOutputStream.writeBytes("Content-Disposition: form-data; name=\"" + str2 + "\";filename=\"" + file.getName() + "\"\r\n");
                dataOutputStream.writeBytes("\r\n");
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = fileInputStream.read(bArr);
                        if (i == -1) {
                            break;
                        }
                        dataOutputStream.write(bArr, 0, i);
                        dataOutputStream.flush();
                        throw new IOException("IOException:" + e.getClass().getSimpleName());
                    }
                    dataOutputStream.writeBytes("\r\n");
                    dataOutputStream.writeBytes("--");
                    dataOutputStream.writeBytes("*****");
                    dataOutputStream.writeBytes("--");
                    dataOutputStream.writeBytes("\r\n");
                    dataOutputStream.flush();
                    StringBuffer stringBuffer = new StringBuffer();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new b(httpURLConnection.getInputStream())));
                    while (true) {
                        try {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                String string = stringBuffer.toString();
                                mgt.b(fileInputStream);
                                mgt.b(bufferedReader);
                                return string;
                            }
                            stringBuffer.append(line);
                        } catch (IOException e) {
                            e = e;
                        } catch (Throwable th) {
                            th = th;
                            throw new IOException(th.getMessage());
                        }
                    }
                } catch (IOException e2) {
                    e = e2;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                mgt.b(null);
                mgt.b(file);
                throw th3;
            }
        } catch (IOException e3) {
            e = e3;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public static String o(Map<String, String> map) {
        if (map == null || map.size() <= 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                try {
                    stringBuffer.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
                    stringBuffer.append("=");
                    stringBuffer.append(URLEncoder.encode(entry.getValue(), "UTF-8"));
                    stringBuffer.append(gv5.CONNECT_STR);
                } catch (UnsupportedEncodingException e) {
                    x9s.o("Failed to convert from params map to string: " + e);
                    x9s.o("map: " + map.toString());
                    return null;
                }
            }
        }
        if (stringBuffer.length() > 0) {
            stringBuffer = stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        }
        return stringBuffer.toString();
    }

    public static HttpURLConnection p(Context context, URL url) {
        if ("http".equals(url.getProtocol()) && t(context)) {
            return (HttpURLConnection) url.openConnection(new Proxy(Proxy.Type.HTTP, new InetSocketAddress("10.0.0.200", 80)));
        }
        return (HttpURLConnection) url.openConnection();
    }

    public static URL q(String str) {
        return new URL(str);
    }

    public static void r() {
        u();
    }

    public static void s(Context context, Object obj) {
        if (context == null || obj == null) {
            return;
        }
        try {
            if (obj instanceof ConnectivityManager.NetworkCallback) {
                ((ConnectivityManager) context.getSystemService(OneTrackConstant.EVENT_NAME_CONNECTIVITY)).unregisterNetworkCallback((ConnectivityManager.NetworkCallback) obj);
            }
        } catch (Throwable th) {
            x9s.o("exception occurred in removing network callback :" + th);
        }
    }

    public static boolean t(Context context) {
        xbs xbsVarE;
        if (!ServerConstants.NEW_CN_COUNTRY_CODE.equalsIgnoreCase(((TelephonyManager) context.getSystemService("phone")).getSimCountryIso()) || (xbsVarE = e()) == null) {
            return false;
        }
        String strI = xbsVarE.i();
        return !TextUtils.isEmpty(strI) && strI.length() >= 3 && strI.contains("ctwap");
    }

    public static void u() {
        f28980a.set(d());
    }

    public static boolean v(Context context) {
        return a(context) >= 0;
    }

    public static boolean w(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(OneTrackConstant.EVENT_NAME_CONNECTIVITY);
        if (connectivityManager != null) {
            try {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                if (networkCapabilities != null && networkCapabilities.hasCapability(16) && x(context)) {
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static boolean x(Context context) {
        xbs xbsVarE = e();
        return xbsVarE != null && xbsVarE.f();
    }

    public static boolean y(Context context) {
        xbs xbsVarE = e();
        return xbsVarE != null && 1 == xbsVarE.a();
    }

    public static boolean z(Context context) {
        xbs xbsVarF = f(context);
        return xbsVarF != null && xbsVarF.a() == 0 && 20 == xbsVarF.g();
    }
}

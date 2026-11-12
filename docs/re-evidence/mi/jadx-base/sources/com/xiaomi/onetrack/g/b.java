package com.xiaomi.onetrack.g;

import android.text.TextUtils;
import com.xiaomi.accountsdk.request.SimpleRequest;
import com.xiaomi.onetrack.d.d;
import com.xiaomi.onetrack.d.f;
import com.xiaomi.onetrack.util.m;
import com.xiaomi.onetrack.util.p;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes11.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f13895a = 10000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f13896b = 15000;
    public static final String c = "OT_SID";
    public static final String d = "OT_ts";
    public static final String e = "OT_net";
    public static final String f = "OT_sender";
    public static final String g = "OT_protocol";
    private static String h = "HttpUtil";
    private static final String i = "GET";
    private static final String j = "POST";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f13897k = "&";
    private static final String l = "=";
    private static final String m = "UTF-8";
    private static final String n = "miui_sdkconfig_jafej!@#)(*e@!#";
    private static final int o = 3;

    private b() {
    }

    public static String a(String str, byte[] bArr) throws IOException {
        HttpURLConnection httpURLConnection;
        OutputStream outputStream;
        InputStream inputStream;
        p.a(h, "doPost url=" + str + ", len=" + bArr.length);
        InputStream inputStream2 = null;
        try {
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                httpURLConnection.setConnectTimeout(10000);
                httpURLConnection.setReadTimeout(15000);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setRequestProperty("Content-Type", "application/octet-stream");
                String str2 = f.a().b()[1];
                httpURLConnection.setRequestProperty(c, str2);
                httpURLConnection.setRequestProperty(d, Long.toString(System.currentTimeMillis()));
                httpURLConnection.setRequestProperty(e, c.a(com.xiaomi.onetrack.f.a.b()).toString());
                httpURLConnection.setRequestProperty(f, com.xiaomi.onetrack.f.a.e());
                httpURLConnection.setRequestProperty(g, "3.0");
                p.a(h, "sid:" + str2);
                outputStream = httpURLConnection.getOutputStream();
                try {
                    outputStream.write(bArr, 0, bArr.length);
                    outputStream.flush();
                    int responseCode = httpURLConnection.getResponseCode();
                    inputStream = httpURLConnection.getInputStream();
                    try {
                        try {
                            byte[] bArrB = m.b(inputStream);
                            p.a(h, String.format("HttpUtils POST 上传成功 url: %s, code: %s", str, Integer.valueOf(responseCode)));
                            String str3 = new String(bArrB, "UTF-8");
                            m.a(inputStream);
                            m.a(outputStream);
                            m.a(httpURLConnection);
                            return str3;
                        } catch (IOException e2) {
                            e = e2;
                            p.b(h, String.format("HttpUtils POST 上传失败, url: %s, error: %s", str, e.getMessage()));
                            m.a(inputStream);
                            m.a(outputStream);
                            m.a(httpURLConnection);
                            return null;
                        }
                    } catch (Throwable th) {
                        th = th;
                        inputStream2 = inputStream;
                        m.a(inputStream2);
                        m.a(outputStream);
                        m.a(httpURLConnection);
                        throw th;
                    }
                } catch (IOException e3) {
                    e = e3;
                    inputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    m.a(inputStream2);
                    m.a(outputStream);
                    m.a(httpURLConnection);
                    throw th;
                }
            } catch (IOException e4) {
                e = e4;
                outputStream = null;
                inputStream = outputStream;
                p.b(h, String.format("HttpUtils POST 上传失败, url: %s, error: %s", str, e.getMessage()));
                m.a(inputStream);
                m.a(outputStream);
                m.a(httpURLConnection);
                return null;
            } catch (Throwable th3) {
                th = th3;
                outputStream = null;
            }
        } catch (IOException e5) {
            e = e5;
            httpURLConnection = null;
            outputStream = null;
        } catch (Throwable th4) {
            th = th4;
            httpURLConnection = null;
            outputStream = null;
        }
    }

    public static String b(String str, Map<String, String> map) throws IOException {
        return b(str, map, true);
    }

    public static String b(String str, Map<String, String> map, boolean z) throws IOException {
        return a("POST", str, map, z);
    }

    public static boolean b(String str) throws Throwable {
        if (TextUtils.isEmpty(str)) {
            p.a(h, "doGetAdMonitor dbUrl is null");
            return true;
        }
        HttpURLConnection httpURLConnection = null;
        int i2 = 0;
        int i3 = 0;
        while (i2 < 3) {
            try {
                try {
                    try {
                        if (i3 / 100 == 3) {
                            i2++;
                            str = httpURLConnection.getHeaderField(SimpleRequest.LOCATION);
                            p.a(h, "redirect url is:" + str);
                        }
                        HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(str).openConnection();
                        try {
                            httpURLConnection2.setInstanceFollowRedirects(false);
                            httpURLConnection2.setRequestMethod("GET");
                            httpURLConnection2.setConnectTimeout(10000);
                            httpURLConnection2.setReadTimeout(15000);
                            int responseCode = httpURLConnection2.getResponseCode();
                            p.a(h, "AdMonitor get 请求 ResponseCode：" + responseCode);
                            if (responseCode / 100 != 5 && responseCode / 100 != 3) {
                                try {
                                    m.a(httpURLConnection2);
                                } catch (Exception unused) {
                                }
                                return true;
                            }
                            if (responseCode / 100 != 3) {
                                m.a(httpURLConnection2);
                                return false;
                            }
                            i3 = responseCode;
                            httpURLConnection = httpURLConnection2;
                        } catch (ProtocolException e2) {
                            e = e2;
                            httpURLConnection = httpURLConnection2;
                            if (TextUtils.isEmpty(e.getMessage()) && e.getMessage().contains("200 OK")) {
                                p.a(h, "response code is 200, bug status line is invalid.");
                                try {
                                    m.a(httpURLConnection);
                                } catch (Exception unused2) {
                                }
                                return true;
                            }
                            m.a(httpURLConnection);
                        } catch (Exception e3) {
                            e = e3;
                            httpURLConnection = httpURLConnection2;
                            p.b(h, "HttpUtils doGetAdMonitor 上传异常:" + e.getMessage());
                            m.a(httpURLConnection);
                        } catch (Throwable th) {
                            th = th;
                            httpURLConnection = httpURLConnection2;
                            try {
                                m.a(httpURLConnection);
                            } catch (Exception unused3) {
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (ProtocolException e4) {
                    e = e4;
                } catch (Exception e5) {
                    e = e5;
                }
            } catch (Exception unused4) {
            }
        }
        p.a(h, "redirectCount >= 3, return true");
        try {
            m.a(httpURLConnection);
        } catch (Exception unused5) {
        }
        return true;
    }

    public static String a(String str) throws IOException {
        return a(str, null, false);
    }

    public static String a(String str, Map<String, String> map) throws IOException {
        return a(str, map, true);
    }

    public static String a(String str, Map<String, String> map, boolean z) throws IOException {
        return a("GET", str, map, z);
    }

    private static String a(String str, String str2, Map<String, String> map, boolean z) throws Throwable {
        String strA;
        OutputStream outputStream;
        HttpURLConnection httpURLConnection;
        InputStream inputStream;
        String str3;
        InputStream inputStream2 = null;
        if (map == null) {
            strA = null;
        } else {
            try {
                strA = a(map, z);
            } catch (Exception e2) {
                e = e2;
                outputStream = null;
                httpURLConnection = null;
                inputStream = null;
                p.b(h, "HttpUtils POST 上传异常", e);
                m.a(inputStream);
                m.a(outputStream);
                m.a(httpURLConnection);
                return null;
            } catch (Throwable th) {
                th = th;
                outputStream = null;
                httpURLConnection = null;
                m.a(inputStream2);
                m.a(outputStream);
                m.a(httpURLConnection);
                throw th;
            }
        }
        if (!"GET".equals(str) || strA == null) {
            str3 = str2;
        } else {
            str3 = str2 + "? " + strA;
        }
        httpURLConnection = (HttpURLConnection) new URL(str3).openConnection();
        try {
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(15000);
            try {
                try {
                    if ("GET".equals(str)) {
                        httpURLConnection.setRequestMethod("GET");
                    } else {
                        if ("POST".equals(str) && strA != null) {
                            httpURLConnection.setRequestMethod("POST");
                            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                            httpURLConnection.setDoOutput(true);
                            byte[] bytes = strA.getBytes("UTF-8");
                            outputStream = httpURLConnection.getOutputStream();
                            try {
                                outputStream.write(bytes, 0, bytes.length);
                                outputStream.flush();
                            } catch (Exception e3) {
                                e = e3;
                                inputStream = null;
                                p.b(h, "HttpUtils POST 上传异常", e);
                                m.a(inputStream);
                                m.a(outputStream);
                                m.a(httpURLConnection);
                                return null;
                            } catch (Throwable th2) {
                                th = th2;
                                m.a(inputStream2);
                                m.a(outputStream);
                                m.a(httpURLConnection);
                                throw th;
                            }
                        }
                        int responseCode = httpURLConnection.getResponseCode();
                        inputStream = httpURLConnection.getInputStream();
                        byte[] bArrB = m.b(inputStream);
                        p.a(h, String.format("HttpUtils POST 上传成功 url: %s, code: %s", str2, Integer.valueOf(responseCode)));
                        String str4 = new String(bArrB, "UTF-8");
                        m.a(inputStream);
                        m.a(outputStream);
                        m.a(httpURLConnection);
                        return str4;
                    }
                    byte[] bArrB2 = m.b(inputStream);
                    p.a(h, String.format("HttpUtils POST 上传成功 url: %s, code: %s", str2, Integer.valueOf(responseCode)));
                    String str5 = new String(bArrB2, "UTF-8");
                    m.a(inputStream);
                    m.a(outputStream);
                    m.a(httpURLConnection);
                    return str5;
                } catch (Exception e4) {
                    e = e4;
                    p.b(h, "HttpUtils POST 上传异常", e);
                    m.a(inputStream);
                    m.a(outputStream);
                    m.a(httpURLConnection);
                    return null;
                }
            } catch (Throwable th3) {
                th = th3;
                inputStream2 = inputStream;
                m.a(inputStream2);
                m.a(outputStream);
                m.a(httpURLConnection);
                throw th;
            }
            outputStream = null;
            int responseCode2 = httpURLConnection.getResponseCode();
            inputStream = httpURLConnection.getInputStream();
        } catch (Exception e5) {
            e = e5;
            outputStream = null;
            inputStream = null;
        } catch (Throwable th4) {
            th = th4;
            outputStream = null;
        }
    }

    private static String a(Map<String, String> map, boolean z) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            try {
                if (!TextUtils.isEmpty(entry.getKey())) {
                    if (sb.length() > 0) {
                        sb.append("&");
                    }
                    sb.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
                    sb.append(l);
                    sb.append(URLEncoder.encode(entry.getValue() == null ? AbstractJsonLexerKt.NULL : entry.getValue(), "UTF-8"));
                }
            } catch (UnsupportedEncodingException unused) {
                p.b(h, "format params failed");
            }
        }
        if (z) {
            String strA = a(map);
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append(URLEncoder.encode("sign", "UTF-8"));
            sb.append(l);
            sb.append(URLEncoder.encode(strA, "UTF-8"));
        }
        return sb.toString();
    }

    public static String a(Map<String, String> map) {
        StringBuilder sb = new StringBuilder();
        if (map != null) {
            ArrayList<String> arrayList = new ArrayList(map.keySet());
            Collections.sort(arrayList);
            for (String str : arrayList) {
                if (!TextUtils.isEmpty(str)) {
                    sb.append(str);
                    sb.append(map.get(str));
                }
            }
        }
        sb.append(n);
        return d.c(sb.toString());
    }
}

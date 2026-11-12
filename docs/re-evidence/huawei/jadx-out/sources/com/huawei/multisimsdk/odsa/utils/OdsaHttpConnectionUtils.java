package com.huawei.multisimsdk.odsa.utils;

import android.text.TextUtils;
import com.huawei.hms.framework.network.download.internal.constants.ExceptionCode;
import com.huawei.multisimsdk.multidevicemanager.common.AbsPairedDevice;
import com.huawei.multisimsdk.multidevicemanager.common.AbsPrimaryDevice;
import com.huawei.openalliance.ad.constant.Constants;
import defpackage.oco;
import defpackage.ocq;
import defpackage.odd;
import defpackage.odo;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: classes12.dex */
public class OdsaHttpConnectionUtils {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static OdsaHttpConnectionUtils f18045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f18046c = new Object();

    enum RequestType {
        AKA_FIRST,
        AKA_SECOND,
        ODSA
    }

    public static OdsaHttpConnectionUtils b() {
        OdsaHttpConnectionUtils odsaHttpConnectionUtils;
        synchronized (f18046c) {
            if (f18045b == null) {
                f18045b = new OdsaHttpConnectionUtils();
            }
            odsaHttpConnectionUtils = f18045b;
        }
        return odsaHttpConnectionUtils;
    }

    public String d(int i, AbsPrimaryDevice absPrimaryDevice, AbsPairedDevice absPairedDevice, Map<String, String> map) throws Exception {
        HttpsURLConnection httpsURLConnection = null;
        CookieHandler.setDefault(new CookieManager(null, CookiePolicy.ACCEPT_ALL));
        if (!oco.d(odd.d().e())) {
            ocq.e("OdsaHttpConnectionUtils", "no Network!");
            return String.valueOf(98);
        }
        try {
            URL urlA = odo.a(oco.c("ODSA_ESURL", ""), absPrimaryDevice, absPairedDevice, i, map);
            if (urlA == null) {
                ocq.c("OdsaHttpConnectionUtils", "doGetRequest url is null");
                ocq.e("OdsaHttpConnectionUtils", "doGetRequest->close connection safely.");
                return String.valueOf(-1004);
            }
            HttpsURLConnection httpsURLConnectionD = d(urlA);
            if (b("GET", httpsURLConnectionD, false, "")) {
                String strB = b(httpsURLConnectionD, RequestType.ODSA, "");
                ocq.e("OdsaHttpConnectionUtils", "doGetRequest->close connection safely.");
                if (httpsURLConnectionD != null) {
                    httpsURLConnectionD.disconnect();
                }
                return strB;
            }
            ocq.h("OdsaHttpConnectionUtils", "setUrlConnectionParams is false");
            ocq.e("OdsaHttpConnectionUtils", "doGetRequest->close connection safely.");
            if (httpsURLConnectionD != null) {
                httpsURLConnectionD.disconnect();
            }
            return String.valueOf(-1008);
        } catch (Throwable th) {
            ocq.e("OdsaHttpConnectionUtils", "doGetRequest->close connection safely.");
            if (0 != 0) {
                httpsURLConnection.disconnect();
            }
            throw th;
        }
    }

    public String e(int i, AbsPrimaryDevice absPrimaryDevice, AbsPairedDevice absPairedDevice, Map<String, String> map) throws Exception {
        CookieHandler.setDefault(new CookieManager(null, CookiePolicy.ACCEPT_ALL));
        if (!oco.d(odd.d().e())) {
            ocq.e("OdsaHttpConnectionUtils", "no Network!");
            return String.valueOf(98);
        }
        try {
            URL url = new URL(oco.c("ODSA_ESURL", ""));
            String strE = odo.e(absPrimaryDevice, absPairedDevice, i, map);
            HttpsURLConnection httpsURLConnectionD = d(url);
            if (!b("POST", httpsURLConnectionD, false, "")) {
                ocq.h("OdsaHttpConnectionUtils", "setUrlConnectionParams is false");
                return String.valueOf(-1008);
            }
            if (c(httpsURLConnectionD, strE)) {
                return b(httpsURLConnectionD, RequestType.ODSA, "");
            }
            return String.valueOf(-1009);
        } catch (MalformedURLException unused) {
            ocq.c("OdsaHttpConnectionUtils", "doPostRequest error");
            return String.valueOf(99);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0035 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private static String d(HttpsURLConnection httpsURLConnection) {
        try {
            InputStream inputStream = httpsURLConnection.getInputStream();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = inputStream.read(bArr);
                        if (i == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, i);
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th) {
                                th.addSuppressed(th);
                            }
                        }
                        throw th;
                    }
                    String string = byteArrayOutputStream.toString("utf-8");
                    byteArrayOutputStream.close();
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    return string;
                } catch (Throwable th2) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                if (inputStream != null) {
                    inputStream.close();
                }
                throw th4;
            }
        } catch (IOException unused) {
            ocq.c("OdsaHttpConnectionUtils", "IOException");
            return "";
        }
    }

    private static String b(HttpsURLConnection httpsURLConnection, RequestType requestType, String str) {
        String strD;
        if (httpsURLConnection == null) {
            ocq.c("OdsaHttpConnectionUtils", "getResponse connection == null");
            return "";
        }
        try {
            int responseCode = httpsURLConnection.getResponseCode();
            int i = AnonymousClass1.f18047a[requestType.ordinal()];
            if (i == 1 || i == 2) {
                if (responseCode != 200) {
                    ocq.e("OdsaHttpConnectionUtils", "getResponse->error responseCode= " + responseCode);
                    return String.valueOf(responseCode);
                }
            } else {
                if (i != 3) {
                    return "";
                }
                if (responseCode != 200 && responseCode != 302) {
                    ocq.c("OdsaHttpConnectionUtils", "getResponse->error responseCode= " + responseCode);
                    return String.valueOf(responseCode);
                }
                String headerField = httpsURLConnection.getHeaderField("Location");
                ocq.a("OdsaHttpConnectionUtils", "getResponse->success.responseCode=" + responseCode);
                if (!TextUtils.isEmpty(headerField)) {
                    return headerField;
                }
            }
            if (TextUtils.equals(httpsURLConnection.getHeaderField("Content-Encoding"), Constants.GZIP)) {
                strD = oco.b(httpsURLConnection);
            } else {
                strD = d(httpsURLConnection);
            }
            if (requestType.equals(RequestType.AKA_FIRST)) {
                String headerField2 = httpsURLConnection.getHeaderField("set-cookie");
                if (!TextUtils.isEmpty(headerField2)) {
                    oco.b(odd.d().e(), str, "cookie", headerField2);
                }
                return strD;
            }
            return strD + "&" + httpsURLConnection.getContentType();
        } catch (IOException unused) {
            ocq.c("OdsaHttpConnectionUtils", "getResponse error");
            return "";
        }
    }

    /* JADX INFO: renamed from: com.huawei.multisimsdk.odsa.utils.OdsaHttpConnectionUtils$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f18047a;

        static {
            int[] iArr = new int[RequestType.values().length];
            f18047a = iArr;
            try {
                iArr[RequestType.AKA_FIRST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18047a[RequestType.AKA_SECOND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18047a[RequestType.ODSA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
                ocq.h("OdsaHttpConnectionUtils", "closeStream->close error");
            }
        }
    }

    public static Map<String, String> b(String str) {
        String strDecode;
        if (TextUtils.isEmpty(str)) {
            return Collections.EMPTY_MAP;
        }
        int iIndexOf = str.indexOf(63);
        ocq.e("OdsaHttpConnectionUtils", "resolveFromUrl, index = " + iIndexOf);
        if (iIndexOf == -1 || iIndexOf == str.length()) {
            return Collections.EMPTY_MAP;
        }
        String strSubstring = str.substring(0, iIndexOf);
        String strSubstring2 = str.substring(iIndexOf + 1);
        ocq.c("OdsaHttpConnectionUtils", "resolveFromUrl, remaining = ", strSubstring2);
        String[] strArrSplit = strSubstring2.split("&");
        HashMap map = new HashMap();
        map.put("oidc_url", strSubstring);
        for (String str2 : strArrSplit) {
            ocq.c("OdsaHttpConnectionUtils", "resolveFromUrl, item = ", str2);
            String[] strArrSplit2 = str2.split("=", 2);
            if (strArrSplit2 == null || strArrSplit2.length < 2) {
                ocq.c("OdsaHttpConnectionUtils", "resolveFromUrl, string length error");
            } else {
                String str3 = strArrSplit2[0];
                try {
                    strDecode = URLDecoder.decode(strArrSplit2[1], "UTF-8");
                } catch (UnsupportedEncodingException unused) {
                    ocq.c("OdsaHttpConnectionUtils", "resolveFromUrl, UnsupportedEncodingException");
                    strDecode = strArrSplit2[1];
                }
                if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(strDecode)) {
                    ocq.c("OdsaHttpConnectionUtils", "resolveFromUrl, string content error");
                } else {
                    map.put(str3, strDecode);
                }
            }
        }
        return map;
    }

    public String e(String str, String str2, String str3, String str4) {
        int i;
        HttpsURLConnection httpsURLConnection = null;
        try {
            try {
                HttpsURLConnection httpsURLConnectionD = d(new URL(str + str2));
                if (!b("GET", httpsURLConnectionD, true, str3)) {
                    ocq.h("OdsaHttpConnectionUtils", "setUrlConnectionParams is false");
                    if (httpsURLConnectionD != null) {
                        httpsURLConnectionD.disconnect();
                    }
                    i = -1008;
                    return String.valueOf(i);
                }
                String strB = b(httpsURLConnectionD, RequestType.AKA_FIRST, str4);
                if (httpsURLConnectionD != null) {
                    httpsURLConnectionD.disconnect();
                }
                return strB;
            } catch (MalformedURLException unused) {
                ocq.c("OdsaHttpConnectionUtils", "doGetRequestForAkaFirstAuth->IOException");
                if (0 != 0) {
                    httpsURLConnection.disconnect();
                }
                i = ExceptionCode.FILE_NO_EXIST;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                httpsURLConnection.disconnect();
            }
            throw th;
        }
    }

    public String d(String str, String str2, String str3, String str4) {
        try {
            HttpsURLConnection httpsURLConnectionD = d(new URL(str));
            if (!b("POST", httpsURLConnectionD, true, str3)) {
                ocq.h("OdsaHttpConnectionUtils", "setUrlConnectionParams is false");
                return String.valueOf(-1008);
            }
            if (!c(httpsURLConnectionD, str2)) {
                return String.valueOf(-1009);
            }
            return b(httpsURLConnectionD, RequestType.AKA_FIRST, str4);
        } catch (MalformedURLException unused) {
            ocq.c("OdsaHttpConnectionUtils", "doPostRequestForAkaFirstAuth error");
            return String.valueOf(99);
        }
    }

    public String a(String str, String str2, String str3) {
        try {
            HttpsURLConnection httpsURLConnectionD = d(new URL(str));
            if (!b("POST", httpsURLConnectionD, true, str3)) {
                ocq.h("OdsaHttpConnectionUtils", "setUrlConnectionParams is false");
                return String.valueOf(-1008);
            }
            if (!c(httpsURLConnectionD, str2)) {
                return String.valueOf(-1009);
            }
            return b(httpsURLConnectionD, RequestType.AKA_SECOND, "");
        } catch (MalformedURLException unused) {
            ocq.c("OdsaHttpConnectionUtils", "doPostRequestForAkaAuth MalformedURLException");
            return String.valueOf(99);
        }
    }

    private static HttpsURLConnection d(URL url) {
        try {
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            if (uRLConnectionOpenConnection instanceof HttpsURLConnection) {
                return (HttpsURLConnection) uRLConnectionOpenConnection;
            }
            return null;
        } catch (IOException unused) {
            ocq.c("OdsaHttpConnectionUtils", "getHttpsUrlConnection IOException");
            return null;
        }
    }

    private static boolean b(String str, HttpsURLConnection httpsURLConnection, boolean z, String str2) {
        if (httpsURLConnection == null) {
            ocq.c("OdsaHttpConnectionUtils", "setUrlConnectionParams connection == null");
            return false;
        }
        try {
            httpsURLConnection.setRequestMethod(str);
            httpsURLConnection.setConnectTimeout(30000);
            httpsURLConnection.setReadTimeout(30000);
            httpsURLConnection.setRequestProperty("Accept-encoding", Constants.GZIP);
            if (str.equals("POST")) {
                httpsURLConnection.setDoOutput(true);
                httpsURLConnection.setRequestProperty("Connection", "Keep-Alive");
                httpsURLConnection.setRequestProperty("Content-Type", oco.c("ODSA_HTTP_CONTENT_TYPE", "application/json; charset=utf-8"));
                if (oco.b("ODSA_SUPPORT_GZIP_PARAMETER", (Boolean) false).booleanValue()) {
                    httpsURLConnection.setRequestProperty("Content-Encoding", Constants.GZIP);
                }
            } else {
                httpsURLConnection.setRequestProperty("Connection", "close");
            }
            if (z) {
                httpsURLConnection.setRequestProperty("Accept", "application/vnd.gsma.eap-relay.v1.0+json, text/vnd.wap.connectivity-xml");
            } else {
                httpsURLConnection.setDoInput(true);
                httpsURLConnection.setInstanceFollowRedirects(false);
                httpsURLConnection.setRequestProperty("Accept", "application/json, application/xml");
            }
            if (!TextUtils.isEmpty(str2)) {
                httpsURLConnection.setRequestProperty("Cookie", str2);
            }
            httpsURLConnection.connect();
            return true;
        } catch (IOException unused) {
            ocq.c("OdsaHttpConnectionUtils", "setRequestMethod failed protocol exception");
            return false;
        }
    }

    private static boolean c(HttpsURLConnection httpsURLConnection, String str) throws Throwable {
        OutputStream outputStream;
        OutputStream outputStream2;
        if (httpsURLConnection == null) {
            ocq.c("OdsaHttpConnectionUtils", "writeData connection == null");
            return false;
        }
        OutputStreamWriter outputStreamWriter = null;
        try {
            if (oco.b("ODSA_SUPPORT_GZIP_PARAMETER", (Boolean) false).booleanValue()) {
                outputStream2 = httpsURLConnection.getOutputStream();
                try {
                    try {
                        outputStream2.write(oco.e(str));
                        outputStream2.flush();
                        a(outputStreamWriter);
                        a(outputStream2);
                        return true;
                    } catch (IOException unused) {
                        ocq.c("OdsaHttpConnectionUtils", "writeData error");
                        a(outputStreamWriter);
                        a(outputStream2);
                        return false;
                    }
                } catch (Throwable th) {
                    outputStream = outputStream2;
                    th = th;
                    a(outputStreamWriter);
                    a(outputStream);
                    throw th;
                }
            }
            OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(httpsURLConnection.getOutputStream(), "utf-8");
            try {
                outputStreamWriter2.write(str);
                outputStreamWriter2.flush();
                outputStream2 = null;
                outputStreamWriter = outputStreamWriter2;
                a(outputStreamWriter);
                a(outputStream2);
                return true;
            } catch (IOException unused2) {
                outputStream2 = null;
                outputStreamWriter = outputStreamWriter2;
                ocq.c("OdsaHttpConnectionUtils", "writeData error");
                a(outputStreamWriter);
                a(outputStream2);
                return false;
            } catch (Throwable th2) {
                th = th2;
                outputStream = null;
                outputStreamWriter = outputStreamWriter2;
                a(outputStreamWriter);
                a(outputStream);
                throw th;
            }
        } catch (IOException unused3) {
            outputStream2 = null;
        } catch (Throwable th3) {
            th = th3;
            outputStream = null;
        }
    }
}

package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.kit.awareness.status.CapabilityStatus;
import com.huawei.ui.main.stories.nps.https.HttpUtils;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.util.LogUtil;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;

/* JADX INFO: loaded from: classes43.dex */
public class vou {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.HashMap, java.util.HashMap<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.io.OutputStream] */
    public static String b(Context context, String str, String str2, HashMap<String, String> map) throws Throwable {
        InputStream inputStream;
        String str3;
        HttpURLConnection httpURLConnectionD = d(str);
        ?? r1 = 0;
        InputStream inputStream2 = null;
        r1 = 0;
        String str4 = null;
        if (httpURLConnectionD == null) {
            return null;
        }
        httpURLConnectionD.setDoOutput(true);
        httpURLConnectionD.setDoInput(true);
        httpURLConnectionD.setUseCaches(false);
        try {
            httpURLConnectionD.setRequestMethod("POST");
            HttpUtils.setHeader(context, httpURLConnectionD, map);
            try {
                try {
                    if (TextUtils.isEmpty(str2)) {
                        map = 0;
                    } else {
                        map = httpURLConnectionD.getOutputStream();
                        if (map != 0) {
                            try {
                                map = map;
                                map.write(str2.getBytes(StandardCharsets.UTF_8));
                                map.flush();
                                map = map;
                            } catch (IOException unused) {
                                inputStream = null;
                                LogUtil.c("HttpPostUtil", "postRequest IOException");
                                HttpUtils.closeStream(inputStream, map);
                                LogUtil.e("HttpPostUtil", "exit AchieveHttps.postRequest ", str4);
                                return str4;
                            } catch (Throwable th) {
                                th = th;
                                HttpUtils.closeStream(r1, map);
                                throw th;
                            }
                        }
                    }
                    map = map;
                    httpURLConnectionD.connect();
                    int responseCode = httpURLConnectionD.getResponseCode();
                    c(context, httpURLConnectionD.getHeaderField("Set-Cookie"));
                    LogUtil.a("HttpPostUtil", "postRequest-->responseCode:", Integer.valueOf(responseCode));
                    if (responseCode == 200) {
                        inputStream = httpURLConnectionD.getInputStream();
                        try {
                            str3 = new String(HttpUtils.readInputStream(inputStream), StandardCharsets.UTF_8);
                            inputStream2 = inputStream;
                        } catch (IOException unused2) {
                            LogUtil.c("HttpPostUtil", "postRequest IOException");
                            HttpUtils.closeStream(inputStream, map);
                        }
                    } else {
                        str3 = null;
                    }
                    HttpUtils.closeStream(inputStream2, map);
                    str4 = str3;
                } catch (Throwable th2) {
                    r1 = context;
                    th = th2;
                }
            } catch (IOException unused3) {
                inputStream = null;
                map = 0;
            } catch (Throwable th3) {
                th = th3;
                map = 0;
            }
            LogUtil.e("HttpPostUtil", "exit AchieveHttps.postRequest ", str4);
            return str4;
        } catch (ProtocolException unused4) {
            LogUtil.c("HttpPostUtil", "postRequest ProtocolException!");
            return null;
        }
    }

    private static void c(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        LogUtil.e("HttpPostUtil", "cookie ", str);
        String[] strArrSplit = str.replace("[", "").replace("]", "").split(";");
        if (strArrSplit == null || strArrSplit.length <= 0) {
            return;
        }
        SharedPreferenceManager.e(context, String.valueOf(CapabilityStatus.AWA_CAP_CODE_WIFI), "cookie", strArrSplit[0], null);
    }

    public static HttpURLConnection d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            URL url = new URL(str);
            try {
                HttpURLConnection httpURLConnection = url.openConnection() instanceof HttpURLConnection ? (HttpURLConnection) url.openConnection() : null;
                if (httpURLConnection != null) {
                    httpURLConnection.setConnectTimeout(5000);
                    httpURLConnection.setReadTimeout(5000);
                    try {
                        httpURLConnection.setRequestMethod("GET");
                        return httpURLConnection;
                    } catch (ProtocolException unused) {
                        LogUtil.c("HttpPostUtil", "initConnection ProtocolException!");
                    }
                }
                return httpURLConnection;
            } catch (IOException unused2) {
                LogUtil.c("HttpPostUtil", "initConnection IOException!");
                return null;
            }
        } catch (MalformedURLException unused3) {
            LogUtil.c("HttpPostUtil", "initConnection MalformedURLException!");
            return null;
        }
    }
}

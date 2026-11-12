package defpackage;

import android.text.TextUtils;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.connectivity.https.HttpResCallBack;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class osi {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ExecutorService f44646b = Executors.newCachedThreadPool();

    public static int e(String str, JSONObject jSONObject, HashMap<String, String> map, final HttpResCallBack httpResCallBack) {
        LogUtil.a("PLGACHIEVE_Http", "postReq enter");
        if (map != null && jSONObject != null) {
            try {
                try {
                    URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
                    if (uRLConnectionOpenConnection instanceof HttpURLConnection) {
                        final HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                        httpURLConnection.setDoOutput(true);
                        httpURLConnection.setDoInput(true);
                        httpURLConnection.setUseCaches(false);
                        httpURLConnection.setConnectTimeout(10000);
                        httpURLConnection.setReadTimeout(10000);
                        httpURLConnection.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
                        try {
                            httpURLConnection.setRequestMethod("POST");
                            osk.d(httpURLConnection, map);
                            final String string = jSONObject.toString();
                            LogUtil.d("PLGACHIEVE_Http", "postReq-->strBody:", string);
                            new Thread(new Runnable() { // from class: osi.4
                                @Override // java.lang.Runnable
                                public void run() throws Throwable {
                                    osi.b(string, httpURLConnection, httpResCallBack);
                                }
                            }).start();
                            LogUtil.a("PLGACHIEVE_Http", "postReq exit!!");
                            return 0;
                        } catch (ProtocolException e) {
                            LogUtil.e("PLGACHIEVE_Http", "postReq e=", e.getMessage());
                        }
                    }
                    return -1;
                } catch (IOException unused) {
                    LogUtil.e("PLGACHIEVE_Http", "postReq e2=IOException");
                    return -1;
                }
            } catch (MalformedURLException e2) {
                LogUtil.e("PLGACHIEVE_Http", "postReq e=", e2.getMessage());
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:25:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
    public static void b(String str, HttpURLConnection httpURLConnection, HttpResCallBack httpResCallBack) throws Throwable {
        InputStream inputStream;
        OutputStream outputStream;
        String str2;
        int i = -1;
        OutputStream outputStream2 = null;
        InputStream inputStream2 = null;
        String str3 = null;
        try {
            if (TextUtils.isEmpty(str)) {
                outputStream = null;
            } else {
                outputStream = httpURLConnection.getOutputStream();
                try {
                    outputStream.write(str.getBytes("UTF-8"));
                    outputStream.flush();
                } catch (IOException unused) {
                    inputStream = null;
                    LogUtil.e("PLGACHIEVE_Http", "postReq IOException");
                    b(outputStream, inputStream);
                    if (httpResCallBack != null) {
                        httpResCallBack.onFinished(i, str3);
                    }
                } catch (Throwable th) {
                    th = th;
                    inputStream = null;
                    outputStream2 = outputStream;
                    b(outputStream2, inputStream);
                    throw th;
                }
            }
            httpURLConnection.connect();
            int responseCode = httpURLConnection.getResponseCode();
            LogUtil.a("PLGACHIEVE_Http", "postReq-->responseCode:", Integer.valueOf(responseCode));
            if (responseCode == 200) {
                inputStream = httpURLConnection.getInputStream();
                try {
                    try {
                        str2 = new String(osk.e(inputStream), "UTF-8");
                        i = responseCode;
                        inputStream2 = inputStream;
                    } catch (IOException unused2) {
                        LogUtil.e("PLGACHIEVE_Http", "postReq IOException");
                        b(outputStream, inputStream);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    outputStream2 = outputStream;
                    b(outputStream2, inputStream);
                    throw th;
                }
            } else {
                str2 = null;
            }
            b(outputStream, inputStream2);
            str3 = str2;
        } catch (IOException unused3) {
            inputStream = null;
            outputStream = null;
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
            b(outputStream2, inputStream);
            throw th;
        }
        if (httpResCallBack != null) {
            httpResCallBack.onFinished(i, str3);
        }
    }

    private static void b(OutputStream outputStream, InputStream inputStream) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException unused) {
                LogUtil.e("PLGACHIEVE_Http", "postReq e6=IOException");
            }
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused2) {
                LogUtil.e("PLGACHIEVE_Http", "postReq e7=IOException");
            }
        }
    }

    public static int e(String str, final String str2, final HttpResCallBack httpResCallBack) {
        LogUtil.a("PLGACHIEVE_Http", "download enter");
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                try {
                    URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
                    if (uRLConnectionOpenConnection instanceof HttpURLConnection) {
                        final HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                        httpURLConnection.setConnectTimeout(10000);
                        httpURLConnection.setReadTimeout(10000);
                        try {
                            httpURLConnection.setRequestMethod("GET");
                            f44646b.execute(new Runnable() { // from class: osi.5
                                @Override // java.lang.Runnable
                                public void run() throws Throwable {
                                    osi.c(httpURLConnection, str2, httpResCallBack);
                                }
                            });
                            LogUtil.a("PLGACHIEVE_Http", "download exit");
                            return 0;
                        } catch (ProtocolException e) {
                            LogUtil.e("PLGACHIEVE_Http", "download e=", e.getMessage());
                        }
                    }
                    return -1;
                } catch (IOException unused) {
                    LogUtil.e("PLGACHIEVE_Http", "download e2=IOException");
                    return -1;
                }
            } catch (MalformedURLException e2) {
                LogUtil.e("PLGACHIEVE_Http", "download e=", e2.getMessage());
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:33:0x005f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v2 */
    public static void c(HttpURLConnection httpURLConnection, String str, HttpResCallBack httpResCallBack) throws Throwable {
        InputStream inputStream;
        int i = -1;
        ?? r5 = 0;
        try {
            try {
                int responseCode = httpURLConnection.getResponseCode();
                LogUtil.a("PLGACHIEVE_Http", "download-->responseCode:", Integer.valueOf(responseCode));
                if (responseCode == 200) {
                    inputStream = httpURLConnection.getInputStream();
                    try {
                        if (osk.b(inputStream, str)) {
                            i = 200;
                        }
                    } catch (IOException unused) {
                        LogUtil.e("PLGACHIEVE_Http", "download e4=IOException");
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException unused2) {
                                LogUtil.e("PLGACHIEVE_Http", "download e6=IOException");
                            }
                        }
                    }
                } else {
                    inputStream = null;
                }
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused3) {
                        LogUtil.e("PLGACHIEVE_Http", "download e6=IOException");
                    }
                }
            } catch (Throwable th) {
                r5 = httpURLConnection;
                th = th;
                if (r5 != 0) {
                    try {
                        r5.close();
                    } catch (IOException unused4) {
                        LogUtil.e("PLGACHIEVE_Http", "download e6=IOException");
                    }
                }
                throw th;
            }
        } catch (IOException unused5) {
            inputStream = null;
        } catch (Throwable th2) {
            th = th2;
            if (r5 != 0) {
                r5.close();
            }
            throw th;
        }
        if (httpResCallBack != null) {
            httpResCallBack.onFinished(i, null);
        }
    }
}

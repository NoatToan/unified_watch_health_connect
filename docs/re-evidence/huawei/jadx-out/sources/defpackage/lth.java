package defpackage;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hwcommonmodel.utils.httputils.pluginoperation.HttpResCallback;
import com.huawei.hwlogsmodel.LogUtil;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;

/* JADX INFO: loaded from: classes10.dex */
public class lth {
    public static int c(String str, HashMap<String, String> map, HashMap<String, String> map2, final HttpResCallback httpResCallback) {
        LogUtil.a("HwCommonModelHttp", "entry Http.postReq");
        if (!TextUtils.isEmpty(str) && map != null && map2 != null) {
            final HttpURLConnection httpURLConnectionB = b(str);
            if (httpURLConnectionB == null) {
                if (httpResCallback != null) {
                    httpResCallback.onFinished(-1, null);
                }
                return -1;
            }
            httpURLConnectionB.setDoOutput(true);
            httpURLConnectionB.setDoInput(true);
            httpURLConnectionB.setUseCaches(false);
            try {
                httpURLConnectionB.setRequestMethod("POST");
                ltg.d(httpURLConnectionB, map2);
                final String strA = ltg.a(map);
                LogUtil.d("HwCommonModelHttp", "postReq-->strBody:", strA);
                ThreadPoolManager.c().execute(new Runnable() { // from class: lth.5
                    @Override // java.lang.Runnable
                    public void run() throws Throwable {
                        lth.c(strA, httpURLConnectionB, httpResCallback);
                    }
                });
                LogUtil.a("HwCommonModelHttp", "exit AchieveHttps.postReq");
                return 0;
            } catch (ProtocolException e) {
                LogUtil.e("HwCommonModelHttp", e.getMessage());
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:30:0x0083  */
    /* JADX WARN: Code duplicated, block: B:47:? A[RETURN, SYNTHETIC] */
    public static void c(String str, HttpURLConnection httpURLConnection, HttpResCallback httpResCallback) throws Throwable {
        InputStream inputStream;
        OutputStream outputStream;
        String str2;
        OutputStream outputStream2;
        InputStream inputStream2;
        int i = -1;
        OutputStream outputStream3 = null;
        inputStream = null;
        InputStream inputStream3 = null;
        InputStream inputStream4 = null;
        try {
            if (TextUtils.isEmpty(str)) {
                outputStream2 = null;
            } else {
                outputStream2 = httpURLConnection.getOutputStream();
                try {
                    outputStream2.write(str.getBytes("UTF-8"));
                    outputStream2.flush();
                } catch (IOException unused) {
                    inputStream2 = null;
                    str2 = null;
                    outputStream = outputStream2;
                    inputStream4 = inputStream2;
                    try {
                        LogUtil.e("HwCommonModelHttp", "postReq postReqRun IOException,request failed");
                        ltg.b(outputStream);
                        ltg.e(inputStream4);
                        if (httpResCallback != null) {
                            httpResCallback.onFinished(i, str2);
                        }
                    } catch (Throwable th) {
                        InputStream inputStream5 = inputStream4;
                        outputStream3 = outputStream;
                        th = th;
                        inputStream = inputStream5;
                        ltg.b(outputStream3);
                        ltg.e(inputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    inputStream = inputStream3;
                    outputStream3 = outputStream2;
                    ltg.b(outputStream3);
                    ltg.e(inputStream);
                    throw th;
                }
            }
            httpURLConnection.connect();
            int responseCode = httpURLConnection.getResponseCode();
            LogUtil.a("HwCommonModelHttp", "postReq-->responseCode:", Integer.valueOf(responseCode));
            if (responseCode == 200) {
                inputStream2 = httpURLConnection.getInputStream();
                try {
                    try {
                        str2 = new String(ltg.c(inputStream2), StandardCharsets.UTF_8);
                        try {
                            LogUtil.d("HwCommonModelHttp", "postReq-->jsonResult:", str2);
                            i = responseCode;
                            inputStream4 = inputStream2;
                        } catch (IOException unused2) {
                            outputStream = outputStream2;
                            inputStream4 = inputStream2;
                            LogUtil.e("HwCommonModelHttp", "postReq postReqRun IOException,request failed");
                            ltg.b(outputStream);
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        inputStream3 = inputStream2;
                        inputStream = inputStream3;
                        outputStream3 = outputStream2;
                        ltg.b(outputStream3);
                        ltg.e(inputStream);
                        throw th;
                    }
                } catch (IOException unused3) {
                    str2 = null;
                }
            } else {
                str2 = null;
            }
            ltg.b(outputStream2);
        } catch (IOException unused4) {
            outputStream = null;
            str2 = null;
        } catch (Throwable th4) {
            th = th4;
            inputStream = null;
        }
        ltg.e(inputStream4);
        if (httpResCallback != null) {
            httpResCallback.onFinished(i, str2);
        }
    }

    public static String a(String str, HashMap<String, String> map, HashMap<String, String> map2) throws Throwable {
        HttpURLConnection httpURLConnectionB;
        Throwable th;
        InputStream inputStream;
        String str2;
        OutputStream outputStream;
        LogUtil.a("HwCommonModelHttp", "entry Http.postReq");
        if (TextUtils.isEmpty(str) || map == null || map2 == null || (httpURLConnectionB = b(str)) == null) {
            return "";
        }
        httpURLConnectionB.setDoOutput(true);
        httpURLConnectionB.setDoInput(true);
        httpURLConnectionB.setUseCaches(false);
        try {
            httpURLConnectionB.setRequestMethod("POST");
            ltg.d(httpURLConnectionB, map2);
            String strA = ltg.a(map);
            LogUtil.d("HwCommonModelHttp", "postReq-->strBody:", strA);
            OutputStream outputStream2 = null;
            InputStream inputStream2 = null;
            outputStream2 = null;
            try {
                if (TextUtils.isEmpty(strA)) {
                    outputStream = null;
                } else {
                    outputStream = httpURLConnectionB.getOutputStream();
                    try {
                        outputStream.write(strA.getBytes("UTF-8"));
                        outputStream.flush();
                    } catch (IOException unused) {
                        inputStream = null;
                        str2 = null;
                        outputStream2 = outputStream;
                        try {
                            LogUtil.e("HwCommonModelHttp", "postReq IOException,request failed");
                            ltg.b(outputStream2);
                            ltg.e(inputStream);
                            LogUtil.a("HwCommonModelHttp", "exit AchieveHttps.postReq");
                            return str2;
                        } catch (Throwable th2) {
                            th = th2;
                            ltg.b(outputStream2);
                            ltg.e(inputStream);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        inputStream = null;
                        outputStream2 = outputStream;
                        ltg.b(outputStream2);
                        ltg.e(inputStream);
                        throw th;
                    }
                }
                httpURLConnectionB.connect();
                int responseCode = httpURLConnectionB.getResponseCode();
                LogUtil.a("HwCommonModelHttp", "postReq-->responseCode:", Integer.valueOf(responseCode));
                if (responseCode == 200) {
                    inputStream = httpURLConnectionB.getInputStream();
                    try {
                        try {
                            str2 = new String(ltg.c(inputStream), "UTF-8");
                            try {
                                LogUtil.d("HwCommonModelHttp", "postReq-->jsonResult:", str2);
                                inputStream2 = inputStream;
                            } catch (IOException unused2) {
                                outputStream2 = outputStream;
                                LogUtil.e("HwCommonModelHttp", "postReq IOException,request failed");
                                ltg.b(outputStream2);
                                ltg.e(inputStream);
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            outputStream2 = outputStream;
                            ltg.b(outputStream2);
                            ltg.e(inputStream);
                            throw th;
                        }
                    } catch (IOException unused3) {
                        str2 = null;
                    }
                } else {
                    str2 = null;
                }
                ltg.b(outputStream);
                ltg.e(inputStream2);
            } catch (IOException unused4) {
                inputStream = null;
                str2 = null;
            } catch (Throwable th5) {
                th = th5;
                inputStream = null;
            }
            LogUtil.a("HwCommonModelHttp", "exit AchieveHttps.postReq");
            return str2;
        } catch (ProtocolException e) {
            LogUtil.e("HwCommonModelHttp", e.getMessage());
            return "";
        }
    }

    public static Bitmap e(String str) {
        InputStream inputStreamE;
        LogUtil.a("HwCommonModelHttp", "entry download");
        HttpURLConnection httpURLConnectionB = b(str);
        if (httpURLConnectionB == null || (inputStreamE = e(httpURLConnectionB)) == null) {
            return null;
        }
        Bitmap bitmapD = ltg.d(inputStreamE);
        ltg.e(inputStreamE);
        LogUtil.a("HwCommonModelHttp", "exit download");
        if (bitmapD != null) {
            return bitmapD;
        }
        return null;
    }

    public static HttpURLConnection b(String str) {
        try {
            try {
                URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
                if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                    return null;
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                httpURLConnection.setConnectTimeout(5000);
                httpURLConnection.setReadTimeout(5000);
                try {
                    httpURLConnection.setRequestMethod("GET");
                    return httpURLConnection;
                } catch (ProtocolException e) {
                    LogUtil.e("HwCommonModelHttp", e.getMessage());
                    return httpURLConnection;
                }
            } catch (IOException unused) {
                LogUtil.e("HwCommonModelHttp", "initConnection IOException,initConnection failed");
                return null;
            }
        } catch (MalformedURLException e2) {
            LogUtil.e("HwCommonModelHttp", e2.getMessage());
            return null;
        }
    }

    public static InputStream e(HttpURLConnection httpURLConnection) {
        InputStream inputStream = null;
        if (httpURLConnection == null) {
            return null;
        }
        try {
            try {
                int responseCode = httpURLConnection.getResponseCode();
                LogUtil.a("HwCommonModelHttp", "download-->responseCode:", Integer.valueOf(responseCode));
                if (responseCode == 200) {
                    inputStream = httpURLConnection.getInputStream();
                }
            } catch (IOException unused) {
                LogUtil.e("HwCommonModelHttp", "download IOException,download failed");
            }
            ltg.e(inputStream);
            LogUtil.a("HwCommonModelHttp", "exit download");
            return inputStream;
        } catch (Throwable th) {
            ltg.e((InputStream) null);
            throw th;
        }
    }
}

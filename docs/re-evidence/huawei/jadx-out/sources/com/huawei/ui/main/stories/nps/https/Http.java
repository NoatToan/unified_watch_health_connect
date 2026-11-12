package com.huawei.ui.main.stories.nps.https;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import health.compact.a.util.LogUtil;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;

/* JADX INFO: loaded from: classes43.dex */
public class Http {
    private static final String DEFAULT_ENCODE = "UTF-8";
    private static final String TAG = "PLGOPER_Http";

    private Http() {
    }

    public static int postReq(Context context, String str, HashMap<String, String> map, HashMap<String, String> map2, HttpResCallback httpResCallback) {
        HttpURLConnection httpURLConnectionInitConnection = initConnection(str);
        if (httpURLConnectionInitConnection == null) {
            if (httpResCallback != null) {
                httpResCallback.onFinished(-1, null);
            }
            return -1;
        }
        httpURLConnectionInitConnection.setDoOutput(true);
        httpURLConnectionInitConnection.setDoInput(true);
        httpURLConnectionInitConnection.setUseCaches(false);
        try {
            httpURLConnectionInitConnection.setRequestMethod("POST");
            HttpUtils.setHeader(context, httpURLConnectionInitConnection, map2);
            ThreadPoolManager.c().execute(getRunnable(httpURLConnectionInitConnection, HttpUtils.getBody(map), httpResCallback));
            return 0;
        } catch (ProtocolException unused) {
            LogUtil.c(TAG, "postReq ProtocolException!");
            return -1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public static String postReq(Context context, String str, HashMap<String, String> map, HashMap<String, String> map2) throws Throwable {
        ?? outputStream;
        InputStream inputStream;
        String str2;
        HttpURLConnection httpURLConnectionInitConnection = initConnection(str);
        ?? r1 = 0;
        InputStream inputStream2 = null;
        r1 = 0;
        String str3 = null;
        if (httpURLConnectionInitConnection == null) {
            return null;
        }
        httpURLConnectionInitConnection.setDoOutput(true);
        httpURLConnectionInitConnection.setDoInput(true);
        httpURLConnectionInitConnection.setUseCaches(false);
        try {
            httpURLConnectionInitConnection.setRequestMethod("POST");
            HttpUtils.setHeader(context, httpURLConnectionInitConnection, map2);
            String body = HttpUtils.getBody(map);
            try {
                try {
                    if (TextUtils.isEmpty(body)) {
                        outputStream = 0;
                    } else {
                        outputStream = httpURLConnectionInitConnection.getOutputStream();
                        try {
                            outputStream.write(body.getBytes("UTF-8"));
                            outputStream.flush();
                            outputStream = outputStream;
                        } catch (IOException unused) {
                            inputStream = null;
                            LogUtil.c(TAG, "postReq IOException");
                            HttpUtils.closeStream(inputStream, outputStream);
                            LogUtil.a(TAG, "exit AchieveHttps.postReq");
                            return str3;
                        } catch (Throwable th) {
                            th = th;
                            HttpUtils.closeStream(r1, outputStream);
                            throw th;
                        }
                    }
                    httpURLConnectionInitConnection.connect();
                    int responseCode = httpURLConnectionInitConnection.getResponseCode();
                    LogUtil.a(TAG, "postReq-->responseCode:", Integer.valueOf(responseCode));
                    if (responseCode == 200) {
                        inputStream = httpURLConnectionInitConnection.getInputStream();
                        try {
                            str2 = new String(HttpUtils.readInputStream(inputStream), "UTF-8");
                            inputStream2 = inputStream;
                        } catch (IOException unused2) {
                            LogUtil.c(TAG, "postReq IOException");
                            HttpUtils.closeStream(inputStream, outputStream);
                        }
                    } else {
                        str2 = null;
                    }
                    HttpUtils.closeStream(inputStream2, outputStream);
                    str3 = str2;
                } catch (Throwable th2) {
                    outputStream = map;
                    r1 = body;
                    th = th2;
                }
            } catch (IOException unused3) {
                inputStream = null;
                outputStream = 0;
            } catch (Throwable th3) {
                th = th3;
                outputStream = 0;
            }
            LogUtil.a(TAG, "exit AchieveHttps.postReq");
            return str3;
        } catch (ProtocolException unused4) {
            LogUtil.c(TAG, "postReq ProtocolException!");
            return null;
        }
    }

    public static int download(Context context, String str, final String str2, final HttpResCallback httpResCallback) {
        final HttpURLConnection httpURLConnectionInitConnection = initConnection(str);
        if (httpURLConnectionInitConnection == null && httpResCallback != null) {
            httpResCallback.onFinished(-1, null);
            return -1;
        }
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.ui.main.stories.nps.https.Http.1
            @Override // java.lang.Runnable
            public void run() throws Throwable {
                InputStream inputStream;
                String str3;
                int i = -1;
                try {
                    int responseCode = httpURLConnectionInitConnection.getResponseCode();
                    LogUtil.a(Http.TAG, "download-->responseCode:", Integer.valueOf(responseCode));
                    if (responseCode == 200) {
                        inputStream = httpURLConnectionInitConnection.getInputStream();
                        try {
                            try {
                                str3 = new String(HttpUtils.readInputStream(inputStream), "UTF-8");
                                try {
                                    if (HttpUtils.saveFile(inputStream, str2)) {
                                        i = 200;
                                    }
                                } catch (IOException unused) {
                                    LogUtil.c(Http.TAG, "download IOException");
                                }
                            } catch (Throwable th) {
                                th = th;
                                HttpUtils.closeStream(inputStream, null);
                                throw th;
                            }
                        } catch (IOException unused2) {
                            str3 = null;
                        }
                    } else {
                        inputStream = null;
                        str3 = null;
                    }
                } catch (IOException unused3) {
                    inputStream = null;
                    str3 = null;
                } catch (Throwable th2) {
                    th = th2;
                    inputStream = null;
                    HttpUtils.closeStream(inputStream, null);
                    throw th;
                }
                HttpUtils.closeStream(inputStream, null);
                HttpResCallback httpResCallback2 = httpResCallback;
                if (httpResCallback2 != null) {
                    httpResCallback2.onFinished(i, str3);
                }
            }
        });
        return 0;
    }

    public static int download(Context context, String str, String str2) {
        InputStream inputStreamDownload = download(context, initConnection(str));
        if (inputStreamDownload == null) {
            return -1;
        }
        int i = HttpUtils.saveFile(inputStreamDownload, str2) ? 0 : -1;
        try {
            inputStreamDownload.close();
            return i;
        } catch (IOException unused) {
            LogUtil.c(TAG, "download IOException!");
            return i;
        }
    }

    public static Bitmap download(Context context, String str) {
        InputStream inputStreamDownload = download(context, initConnection(str));
        Bitmap inputStream = inputStreamDownload != null ? HttpUtils.readInputStream(context, inputStreamDownload) : null;
        if (inputStream == null) {
            LogUtil.d(TAG, "bitmap is null");
        }
        return inputStream;
    }

    public static InputStream download(Context context, HttpURLConnection httpURLConnection) {
        InputStream inputStream = null;
        if (httpURLConnection == null) {
            return null;
        }
        try {
            try {
                int responseCode = httpURLConnection.getResponseCode();
                LogUtil.a(TAG, "download-->responseCode:", Integer.valueOf(responseCode));
                InputStream inputStream2 = responseCode == 200 ? httpURLConnection.getInputStream() : null;
                HttpUtils.closeStream(inputStream2, null);
                inputStream = inputStream2;
            } catch (IOException unused) {
                LogUtil.c(TAG, "download IOException");
                HttpUtils.closeStream(null, null);
            }
            LogUtil.a(TAG, "exit download");
            return inputStream;
        } catch (Throwable th) {
            HttpUtils.closeStream(null, null);
            throw th;
        }
    }

    public static HttpURLConnection initConnection(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                try {
                    URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
                    if (uRLConnectionOpenConnection instanceof HttpURLConnection) {
                        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                        httpURLConnection.setConnectTimeout(5000);
                        httpURLConnection.setReadTimeout(5000);
                        try {
                            httpURLConnection.setRequestMethod("GET");
                            return httpURLConnection;
                        } catch (ProtocolException unused) {
                            LogUtil.c(TAG, "initConnection ProtocolException!");
                            return httpURLConnection;
                        }
                    }
                } catch (IOException unused2) {
                    LogUtil.c(TAG, "initConnection IOException!");
                    return null;
                }
            } catch (MalformedURLException unused3) {
                LogUtil.c(TAG, "initConnection MalformedURLException!");
                return null;
            }
        }
        return null;
    }

    private static Runnable getRunnable(final HttpURLConnection httpURLConnection, final String str, final HttpResCallback httpResCallback) {
        return new Runnable() { // from class: com.huawei.ui.main.stories.nps.https.Http.2
            /* JADX WARN: Code duplicated, block: B:26:0x0074  */
            /* JADX WARN: Code duplicated, block: B:40:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // java.lang.Runnable
            public void run() throws Throwable {
                OutputStream outputStream;
                InputStream inputStream;
                HttpResCallback httpResCallback2;
                String str2;
                int i = -1;
                InputStream inputStream2 = null;
                InputStream inputStream3 = null;
                inputStream2 = null;
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
                            LogUtil.c(Http.TAG, "http IOException");
                            HttpUtils.closeStream(inputStream, outputStream);
                            httpResCallback2 = httpResCallback;
                            if (httpResCallback2 != null) {
                                httpResCallback2.onFinished(i, str3);
                            }
                        } catch (Throwable th) {
                            th = th;
                            HttpUtils.closeStream(inputStream2, outputStream);
                            throw th;
                        }
                    }
                    httpURLConnection.connect();
                    int responseCode = httpURLConnection.getResponseCode();
                    LogUtil.a(Http.TAG, "postReq-->responseCode:", Integer.valueOf(responseCode));
                    if (responseCode == 200) {
                        inputStream = httpURLConnection.getInputStream();
                        try {
                            try {
                                str2 = new String(HttpUtils.readInputStream(inputStream), "UTF-8");
                                i = responseCode;
                                inputStream3 = inputStream;
                            } catch (IOException unused2) {
                                LogUtil.c(Http.TAG, "http IOException");
                                HttpUtils.closeStream(inputStream, outputStream);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            outputStream = outputStream;
                            inputStream2 = inputStream;
                            HttpUtils.closeStream(inputStream2, outputStream);
                            throw th;
                        }
                    } else {
                        str2 = null;
                    }
                    HttpUtils.closeStream(inputStream3, outputStream);
                    str3 = str2;
                } catch (IOException unused3) {
                    outputStream = null;
                    inputStream = null;
                } catch (Throwable th3) {
                    th = th3;
                    outputStream = null;
                }
                httpResCallback2 = httpResCallback;
                if (httpResCallback2 != null) {
                    httpResCallback2.onFinished(i, str3);
                }
            }
        };
    }
}

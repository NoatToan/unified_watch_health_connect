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
import java.net.ProtocolException;
import java.util.HashMap;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: classes43.dex */
public class Https {
    private static final String DEFAULT_ENCODE = "UTF-8";
    private static final String TAG = "PLGOPER_Https";

    private Https() {
    }

    public static int postReq(Context context, String str, HashMap<String, String> map, HashMap<String, String> map2, HttpResCallback httpResCallback) {
        HttpURLConnection httpURLConnectionInitConnection = Http.initConnection(str);
        if (!(httpURLConnectionInitConnection instanceof HttpsURLConnection)) {
            if (httpResCallback != null) {
                httpResCallback.onFinished(-1, null);
            }
            return -1;
        }
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) httpURLConnectionInitConnection;
        httpsURLConnection.setDoOutput(true);
        httpsURLConnection.setDoInput(true);
        httpsURLConnection.setUseCaches(false);
        try {
            httpsURLConnection.setRequestMethod("POST");
            HttpUtils.setHeader(context, httpsURLConnection, map2);
            ThreadPoolManager.c().execute(getRunnable(httpsURLConnection, HttpUtils.getBody(map), httpResCallback));
            LogUtil.a(TAG, "exit AchieveHttps.postReq");
            return 0;
        } catch (ProtocolException unused) {
            LogUtil.c(TAG, "exit ProtocolException");
            return -1;
        }
    }

    public static String postReq(Context context, String str, HashMap<String, String> map, HashMap<String, String> map2) throws Throwable {
        OutputStream outputStream;
        InputStream inputStream;
        String str2;
        LogUtil.a(TAG, "entry Https.postReq");
        HttpURLConnection httpURLConnectionInitConnection = Http.initConnection(str);
        InputStream inputStream2 = null;
        InputStream inputStream3 = null;
        inputStream2 = null;
        String str3 = null;
        if (!(httpURLConnectionInitConnection instanceof HttpsURLConnection)) {
            return null;
        }
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) httpURLConnectionInitConnection;
        httpsURLConnection.setDoOutput(true);
        httpsURLConnection.setDoInput(true);
        httpsURLConnection.setUseCaches(false);
        try {
            httpsURLConnection.setRequestMethod("POST");
            HttpUtils.setHeader(context, httpsURLConnection, map2);
            String body = HttpUtils.getBody(map);
            try {
                if (TextUtils.isEmpty(body)) {
                    outputStream = null;
                } else {
                    outputStream = httpsURLConnection.getOutputStream();
                    if (outputStream != null) {
                        try {
                            outputStream.write(body.getBytes("UTF-8"));
                            outputStream.flush();
                        } catch (IOException unused) {
                            inputStream = null;
                            LogUtil.c(TAG, "postReq IOException");
                            HttpUtils.closeStream(inputStream, outputStream);
                            httpsURLConnection.disconnect();
                            httpURLConnectionInitConnection.disconnect();
                            LogUtil.a(TAG, "exit AchieveHttps.postReq");
                            return str3;
                        } catch (Throwable th) {
                            th = th;
                            HttpUtils.closeStream(inputStream2, outputStream);
                            httpsURLConnection.disconnect();
                            httpURLConnectionInitConnection.disconnect();
                            throw th;
                        }
                    }
                }
                httpsURLConnection.connect();
                int responseCode = httpsURLConnection.getResponseCode();
                LogUtil.a(TAG, "postReq-->responseCode:", Integer.valueOf(responseCode));
                if (responseCode == 200) {
                    inputStream = httpsURLConnection.getInputStream();
                    try {
                        try {
                            str2 = new String(HttpUtils.readInputStream(inputStream), "UTF-8");
                            inputStream3 = inputStream;
                        } catch (IOException unused2) {
                            LogUtil.c(TAG, "postReq IOException");
                            HttpUtils.closeStream(inputStream, outputStream);
                            httpsURLConnection.disconnect();
                            httpURLConnectionInitConnection.disconnect();
                        }
                    } catch (Throwable th2) {
                        outputStream = outputStream;
                        inputStream2 = inputStream;
                        th = th2;
                        HttpUtils.closeStream(inputStream2, outputStream);
                        httpsURLConnection.disconnect();
                        httpURLConnectionInitConnection.disconnect();
                        throw th;
                    }
                } else {
                    str2 = null;
                }
                HttpUtils.closeStream(inputStream3, outputStream);
                httpsURLConnection.disconnect();
                httpURLConnectionInitConnection.disconnect();
                str3 = str2;
            } catch (IOException unused3) {
                inputStream = null;
                outputStream = null;
            } catch (Throwable th3) {
                th = th3;
                outputStream = null;
            }
            LogUtil.a(TAG, "exit AchieveHttps.postReq");
            return str3;
        } catch (ProtocolException unused4) {
            LogUtil.c(TAG, "postReq ProtocolException!");
            return null;
        }
    }

    public static int download(Context context, String str, final String str2, final HttpResCallback httpResCallback) {
        LogUtil.a(TAG, "entry download");
        final HttpsURLConnection httpsURLConnection = (HttpsURLConnection) Http.initConnection(str);
        if (httpsURLConnection == null) {
            if (httpResCallback != null) {
                httpResCallback.onFinished(-1, null);
            }
            return -1;
        }
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.ui.main.stories.nps.https.Https.1
            @Override // java.lang.Runnable
            public void run() throws Throwable {
                InputStream inputStream;
                String str3;
                int i = -1;
                try {
                    int responseCode = httpsURLConnection.getResponseCode();
                    LogUtil.a(Https.TAG, "download-->responseCode:", Integer.valueOf(responseCode));
                    if (responseCode == 200) {
                        inputStream = httpsURLConnection.getInputStream();
                        try {
                            try {
                                str3 = new String(HttpUtils.readInputStream(inputStream), "UTF-8");
                                try {
                                    if (HttpUtils.saveFile(inputStream, str2)) {
                                        i = 200;
                                    }
                                } catch (IOException unused) {
                                    LogUtil.c(Https.TAG, "download IOException");
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

    public static int download(Context context, String str, String str2) throws Throwable {
        Throwable th;
        InputStream inputStreamDownload;
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) Http.initConnection(str);
        int i = -1;
        if (httpsURLConnection == null) {
            return -1;
        }
        try {
            inputStreamDownload = Http.download(context, httpsURLConnection);
            if (inputStreamDownload != null) {
                try {
                    try {
                        if (HttpUtils.saveFile(inputStreamDownload, str2)) {
                            i = 0;
                        }
                    } catch (Exception unused) {
                        LogUtil.c(TAG, "download Exception");
                        HttpUtils.closeStream(inputStreamDownload, null);
                        return -1;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    HttpUtils.closeStream(inputStreamDownload, null);
                    throw th;
                }
            }
            HttpUtils.closeStream(inputStreamDownload, null);
            return i;
        } catch (Exception unused2) {
            inputStreamDownload = null;
        } catch (Throwable th3) {
            th = th3;
            inputStreamDownload = null;
            HttpUtils.closeStream(inputStreamDownload, null);
            throw th;
        }
    }

    public static Bitmap download(Context context, String str) {
        HttpURLConnection httpURLConnectionInitConnection = Http.initConnection(str);
        if (!(httpURLConnectionInitConnection instanceof HttpsURLConnection)) {
            return null;
        }
        InputStream inputStreamDownload = Http.download(context, (HttpsURLConnection) httpURLConnectionInitConnection);
        if (inputStreamDownload == null) {
            LogUtil.a(TAG, "download inputStream = null");
            return null;
        }
        Bitmap inputStream = HttpUtils.readInputStream(context, inputStreamDownload);
        LogUtil.a(TAG, "exit download");
        return inputStream;
    }

    private static Runnable getRunnable(final HttpsURLConnection httpsURLConnection, final String str, final HttpResCallback httpResCallback) {
        return new Runnable() { // from class: com.huawei.ui.main.stories.nps.https.Https.2
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
                        outputStream = httpsURLConnection.getOutputStream();
                        try {
                            outputStream.write(str.getBytes("UTF-8"));
                            outputStream.flush();
                        } catch (IOException unused) {
                            inputStream = null;
                            LogUtil.c(Https.TAG, "postReq IOException");
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
                    httpsURLConnection.connect();
                    int responseCode = httpsURLConnection.getResponseCode();
                    LogUtil.a(Https.TAG, "postReq-->responseCode:", Integer.valueOf(responseCode));
                    if (responseCode == 200) {
                        inputStream = httpsURLConnection.getInputStream();
                        try {
                            try {
                                str2 = new String(HttpUtils.readInputStream(inputStream), "UTF-8");
                                i = responseCode;
                                inputStream3 = inputStream;
                            } catch (IOException unused2) {
                                LogUtil.c(Https.TAG, "postReq IOException");
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

package defpackage;

import android.text.TextUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.connectivity.https.HttpResCallBack;
import com.huawei.secure.android.common.ssl.SecureSSLSocketFactoryNew;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class osh {
    private static ExecutorService d = Executors.newCachedThreadPool();

    public static int a(String str, JSONObject jSONObject, HashMap<String, String> map, HttpResCallBack httpResCallBack) {
        LogUtil.a("PLGACHIEVE_Https", "postReq enter");
        if (map != null && jSONObject != null) {
            try {
                try {
                    URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
                    if (!(uRLConnectionOpenConnection instanceof HttpsURLConnection)) {
                        return -1;
                    }
                    HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnectionOpenConnection;
                    a(httpsURLConnection);
                    httpsURLConnection.setDoOutput(true);
                    httpsURLConnection.setDoInput(true);
                    httpsURLConnection.setUseCaches(false);
                    httpsURLConnection.setConnectTimeout(10000);
                    httpsURLConnection.setReadTimeout(10000);
                    httpsURLConnection.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
                    try {
                        httpsURLConnection.setRequestMethod("POST");
                        osk.d(httpsURLConnection, map);
                        d.execute(new d(jSONObject.toString(), httpsURLConnection, httpResCallBack));
                        LogUtil.a("PLGACHIEVE_Https", "postReq exit");
                        return 0;
                    } catch (ProtocolException unused) {
                        LogUtil.e("PLGACHIEVE_Https", "download e3=ProtocolException");
                        return -1;
                    }
                } catch (IOException unused2) {
                    LogUtil.e("PLGACHIEVE_Https", "download IOException");
                    return -1;
                }
            } catch (MalformedURLException unused3) {
                LogUtil.e("PLGACHIEVE_Https", "download MalformedURLException");
            }
        }
        return -1;
    }

    public static int e(String str, String str2, HttpResCallBack httpResCallBack) {
        LogUtil.a("PLGACHIEVE_Https", "download enter");
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                try {
                    URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
                    if (!(uRLConnectionOpenConnection instanceof HttpsURLConnection)) {
                        return -1;
                    }
                    HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnectionOpenConnection;
                    a(httpsURLConnection);
                    httpsURLConnection.setConnectTimeout(10000);
                    httpsURLConnection.setReadTimeout(10000);
                    try {
                        httpsURLConnection.setRequestMethod("GET");
                        d.execute(new e(httpsURLConnection, str2, httpResCallBack));
                        LogUtil.a("PLGACHIEVE_Https", "download exit");
                        return 0;
                    } catch (ProtocolException unused) {
                        LogUtil.e("PLGACHIEVE_Https", "download e3=ProtocolException");
                        return -1;
                    }
                } catch (IOException unused2) {
                    LogUtil.e("PLGACHIEVE_Https", "download e2=IOException");
                    return -1;
                }
            } catch (MalformedURLException unused3) {
                LogUtil.e("PLGACHIEVE_Https", "download e1=MalformedURLException");
            }
        }
        return -1;
    }

    public static void a(HttpsURLConnection httpsURLConnection) {
        try {
            SecureSSLSocketFactoryNew secureSSLSocketFactoryNew = SecureSSLSocketFactoryNew.getInstance(BaseApplication.getContext());
            httpsURLConnection.setHostnameVerifier(HttpsURLConnection.getDefaultHostnameVerifier());
            if (secureSSLSocketFactoryNew != null) {
                httpsURLConnection.setSSLSocketFactory(secureSSLSocketFactoryNew);
            }
        } catch (IOException unused) {
            LogUtil.e("PLGACHIEVE_Https", "initHttpsUrlConnection IOException");
        } catch (IllegalAccessException e2) {
            LogUtil.e("PLGACHIEVE_Https", " IllegalAccessException = ", e2.getMessage());
        } catch (KeyManagementException e3) {
            LogUtil.e("PLGACHIEVE_Https", " KeyManagementException = ", e3.getMessage());
        } catch (KeyStoreException e4) {
            LogUtil.e("PLGACHIEVE_Https", " KeyStoreException = ", e4.getMessage());
        } catch (NoSuchAlgorithmException e5) {
            LogUtil.e("PLGACHIEVE_Https", " NoSuchAlgorithmException = ", e5.getMessage());
        } catch (CertificateException e6) {
            LogUtil.e("PLGACHIEVE_Https", " CertificateException = ", e6.getMessage());
        }
    }

    static class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private HttpsURLConnection f44642a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f44643b;
        private HttpResCallBack e;

        d(String str, HttpsURLConnection httpsURLConnection, HttpResCallBack httpResCallBack) {
            this.f44643b = str;
            this.f44642a = httpsURLConnection;
            this.e = httpResCallBack;
        }

        /* JADX WARN: Code duplicated, block: B:57:0x00c6  */
        /* JADX WARN: Code duplicated, block: B:72:0x00ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:75:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:79:0x00db A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:81:0x00b7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:88:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:89:? A[SYNTHETIC] */
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
            Exception e;
            OutputStream outputStream;
            InputStream inputStream;
            HttpResCallBack httpResCallBack;
            String str;
            int i = -1;
            OutputStream outputStream2 = null;
            InputStream inputStream2 = null;
            str = null;
            str = null;
            String str2 = null;
            try {
                try {
                    if (TextUtils.isEmpty(this.f44643b)) {
                        outputStream = null;
                    } else {
                        outputStream = this.f44642a.getOutputStream();
                        try {
                            outputStream.write(this.f44643b.getBytes("UTF-8"));
                            outputStream.flush();
                        } catch (IOException e2) {
                            e = e2;
                            inputStream = null;
                            LogUtil.e("PLGACHIEVE_Https", "PostReqRunnable#run: exception -> " + e.getMessage());
                            if (outputStream != null) {
                                try {
                                    outputStream.close();
                                } catch (IOException unused) {
                                    LogUtil.e("PLGACHIEVE_Https", "download e6=IOException");
                                }
                            }
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (IOException unused2) {
                                    LogUtil.e("PLGACHIEVE_Https", "download e6=IOException");
                                }
                            }
                            httpResCallBack = this.e;
                            if (httpResCallBack != null) {
                                httpResCallBack.onFinished(i, str2);
                            }
                        } catch (ArrayIndexOutOfBoundsException e3) {
                            e = e3;
                            inputStream = null;
                            LogUtil.e("PLGACHIEVE_Https", "PostReqRunnable#run: exception -> " + e.getMessage());
                            if (outputStream != null) {
                                outputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            httpResCallBack = this.e;
                            if (httpResCallBack != null) {
                                httpResCallBack.onFinished(i, str2);
                            }
                        } catch (NullPointerException e4) {
                            e = e4;
                            inputStream = null;
                            LogUtil.e("PLGACHIEVE_Https", "PostReqRunnable#run: exception -> " + e.getMessage());
                            if (outputStream != null) {
                                outputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            httpResCallBack = this.e;
                            if (httpResCallBack != null) {
                                httpResCallBack.onFinished(i, str2);
                            }
                        } catch (Throwable th) {
                            th = th;
                            outputStream2 = outputStream;
                            if (outputStream2 != null) {
                                try {
                                    outputStream2.close();
                                } catch (IOException unused3) {
                                    LogUtil.e("PLGACHIEVE_Https", "download e6=IOException");
                                }
                            }
                            if (outputStream2 != 0) {
                                try {
                                    outputStream2.close();
                                    throw th;
                                } catch (IOException unused4) {
                                    LogUtil.e("PLGACHIEVE_Https", "download e6=IOException");
                                    throw th;
                                }
                            }
                            throw th;
                        }
                    }
                    this.f44642a.connect();
                    int responseCode = this.f44642a.getResponseCode();
                    LogUtil.a("PLGACHIEVE_Https", "postReq-->responseCode:", Integer.valueOf(responseCode));
                    if (responseCode == 200) {
                        inputStream = this.f44642a.getInputStream();
                        try {
                            str = new String(osk.e(inputStream), "UTF-8");
                            i = responseCode;
                            inputStream2 = inputStream;
                        } catch (IOException e5) {
                            e = e5;
                            LogUtil.e("PLGACHIEVE_Https", "PostReqRunnable#run: exception -> " + e.getMessage());
                            if (outputStream != null) {
                                outputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                        } catch (ArrayIndexOutOfBoundsException e6) {
                            e = e6;
                            LogUtil.e("PLGACHIEVE_Https", "PostReqRunnable#run: exception -> " + e.getMessage());
                            if (outputStream != null) {
                                outputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                        } catch (NullPointerException e7) {
                            e = e7;
                            LogUtil.e("PLGACHIEVE_Https", "PostReqRunnable#run: exception -> " + e.getMessage());
                            if (outputStream != null) {
                                outputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                        }
                    } else {
                        str = null;
                    }
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (IOException unused5) {
                            LogUtil.e("PLGACHIEVE_Https", "download e6=IOException");
                        }
                    }
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (IOException unused6) {
                            LogUtil.e("PLGACHIEVE_Https", "download e6=IOException");
                        }
                    }
                    str2 = str;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException e8) {
                e = e8;
                e = e;
                outputStream = null;
                inputStream = null;
                LogUtil.e("PLGACHIEVE_Https", "PostReqRunnable#run: exception -> " + e.getMessage());
                if (outputStream != null) {
                    outputStream.close();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
                httpResCallBack = this.e;
                if (httpResCallBack != null) {
                    httpResCallBack.onFinished(i, str2);
                }
            } catch (ArrayIndexOutOfBoundsException e9) {
                e = e9;
                e = e;
                outputStream = null;
                inputStream = null;
                LogUtil.e("PLGACHIEVE_Https", "PostReqRunnable#run: exception -> " + e.getMessage());
                if (outputStream != null) {
                    outputStream.close();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
                httpResCallBack = this.e;
                if (httpResCallBack != null) {
                    httpResCallBack.onFinished(i, str2);
                }
            } catch (NullPointerException e10) {
                e = e10;
                e = e;
                outputStream = null;
                inputStream = null;
                LogUtil.e("PLGACHIEVE_Https", "PostReqRunnable#run: exception -> " + e.getMessage());
                if (outputStream != null) {
                    outputStream.close();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
                httpResCallBack = this.e;
                if (httpResCallBack != null) {
                    httpResCallBack.onFinished(i, str2);
                }
            } catch (Throwable th3) {
                th = th3;
                if (outputStream2 != null) {
                    outputStream2.close();
                }
                if (outputStream2 != 0) {
                    outputStream2.close();
                    throw th;
                }
                throw th;
            }
            httpResCallBack = this.e;
            if (httpResCallBack != null) {
                httpResCallBack.onFinished(i, str2);
            }
        }
    }

    static class e extends Thread {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private HttpsURLConnection f44644b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private HttpResCallBack f44645c;
        private String e;

        e(HttpsURLConnection httpsURLConnection, String str, HttpResCallBack httpResCallBack) {
            this.f44644b = httpsURLConnection;
            this.e = str;
            this.f44645c = httpResCallBack;
        }

        /* JADX WARN: Code duplicated, block: B:32:0x0068 A[PHI: r0 r4
          0x0068: PHI (r0v5 javax.net.ssl.HttpsURLConnection) = (r0v4 javax.net.ssl.HttpsURLConnection), (r0v8 javax.net.ssl.HttpsURLConnection) binds: [B:31:0x0066, B:20:0x004a] A[DONT_GENERATE, DONT_INLINE]
          0x0068: PHI (r4v1 int) = (r4v0 int), (r4v3 int) binds: [B:31:0x0066, B:20:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:35:0x006f  */
        /* JADX WARN: Code duplicated, block: B:45:0x0086  */
        /* JADX WARN: Code duplicated, block: B:53:0x0059 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:55:0x0077 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:60:? A[SYNTHETIC] */
        /* JADX WARN: Not initialized variable reg: 6, insn: 0x0074: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]), block:B:38:0x0074 */
        @Override // java.lang.Thread, java.lang.Runnable
        public void run() throws Throwable {
            InputStream inputStream;
            HttpsURLConnection httpsURLConnection;
            InputStream inputStream2;
            HttpsURLConnection httpsURLConnection2;
            HttpResCallBack httpResCallBack;
            int i = -1;
            InputStream inputStream3 = null;
            try {
                try {
                    HttpsURLConnection httpsURLConnection3 = this.f44644b;
                    if (httpsURLConnection3 == null) {
                        if (httpsURLConnection3 != null) {
                            httpsURLConnection3.disconnect();
                            return;
                        }
                        return;
                    }
                    int responseCode = httpsURLConnection3.getResponseCode();
                    LogUtil.a("PLGACHIEVE_Https", "download-->responseCode:", Integer.valueOf(responseCode));
                    if (responseCode == 200) {
                        inputStream = this.f44644b.getInputStream();
                        try {
                            if (osk.b(inputStream, this.e)) {
                                i = 200;
                            }
                        } catch (IOException unused) {
                            LogUtil.e("PLGACHIEVE_Https", "download IOException");
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (IOException unused2) {
                                    LogUtil.e("PLGACHIEVE_Https", "download IOException");
                                }
                            }
                            httpsURLConnection2 = this.f44644b;
                            if (httpsURLConnection2 != null) {
                                httpsURLConnection2.disconnect();
                            }
                        }
                    } else {
                        inputStream = null;
                    }
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused3) {
                            LogUtil.e("PLGACHIEVE_Https", "download IOException");
                        }
                    }
                    httpsURLConnection2 = this.f44644b;
                    if (httpsURLConnection2 != null) {
                        httpsURLConnection2.disconnect();
                    }
                    httpResCallBack = this.f44645c;
                    if (httpResCallBack != null) {
                        httpResCallBack.onFinished(i, null);
                    }
                } catch (Throwable th) {
                    th = th;
                    inputStream3 = inputStream2;
                    if (inputStream3 != null) {
                        try {
                            inputStream3.close();
                        } catch (IOException unused4) {
                            LogUtil.e("PLGACHIEVE_Https", "download IOException");
                        }
                    }
                    httpsURLConnection = this.f44644b;
                    if (httpsURLConnection != null) {
                        httpsURLConnection.disconnect();
                        throw th;
                    }
                    throw th;
                }
            } catch (IOException unused5) {
                inputStream = null;
            } catch (Throwable th2) {
                th = th2;
                if (inputStream3 != null) {
                    inputStream3.close();
                }
                httpsURLConnection = this.f44644b;
                if (httpsURLConnection != null) {
                    httpsURLConnection.disconnect();
                    throw th;
                }
                throw th;
            }
            LogUtil.e("PLGACHIEVE_Https", "download IOException");
            if (inputStream != null) {
                inputStream.close();
            }
            httpsURLConnection2 = this.f44644b;
            if (httpsURLConnection2 != null) {
                httpsURLConnection2.disconnect();
            }
            httpResCallBack = this.f44645c;
            if (httpResCallBack != null) {
                httpResCallBack.onFinished(i, null);
            }
        }
    }
}

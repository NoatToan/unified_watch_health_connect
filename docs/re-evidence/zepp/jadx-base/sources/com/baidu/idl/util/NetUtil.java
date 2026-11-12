package com.baidu.idl.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public class NetUtil {
    private static final String a = "NetUtil";

    public static abstract class RequestAdapter<T> {
        public static final int RESPONSE_STATUS_ERROR_IO = 2;
        public static final int RESPONSE_STATUS_ERROR_PARSE_JSON = 3;
        public static final int RESPONSE_STATUS_ERROR_RESPONSE_CODE = 4;
        public static final int RESPONSE_STATUS_ERROR_TIMEOUT = 1;
        public static final int RESPONSE_STATUS_ERROR_UNKNOWN = 5;
        public static final int RESPONSE_STATUS_NORMAL = 0;
        private static final int a = 2;
        private static final int b = 5000;
        private static final int c = 5000;
        private static final String d = "POST";

        public int getConnectTimeout() {
            return 5000;
        }

        public int getReadTimeout() {
            return 5000;
        }

        public String getRequestMethod() {
            return "POST";
        }

        public abstract String getRequestString();

        public int getRetryCount() {
            return 2;
        }

        public abstract String getURL();

        public abstract void onResponse(int i, T t, Exception exc);

        public abstract T parseResponse(InputStream inputStream) throws JSONException, IOException;
    }

    private NetUtil() {
        throw new RuntimeException("This class instance can not be created.");
    }

    public static boolean isConnected(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return false;
        }
        return activeNetworkInfo.isConnected();
    }

    /* JADX WARN: Code duplicated, block: B:67:0x00e3 A[PHI: r2 r3 r6 r7
      0x00e3: PHI (r2v9 'e' ??) = (r2v6 'e' ??), (r2v7 'e' ??), (r2v10 'e' ??) binds: [B:38:0x00b1, B:52:0x00c9, B:66:0x00e1] A[DONT_GENERATE, DONT_INLINE]
      0x00e3: PHI (r3v5 java.io.OutputStream) = (r3v2 java.io.OutputStream), (r3v3 java.io.OutputStream), (r3v6 java.io.OutputStream) binds: [B:38:0x00b1, B:52:0x00c9, B:66:0x00e1] A[DONT_GENERATE, DONT_INLINE]
      0x00e3: PHI (r6v7 int) = (r6v4 int), (r6v5 int), (r6v8 int) binds: [B:38:0x00b1, B:52:0x00c9, B:66:0x00e1] A[DONT_GENERATE, DONT_INLINE]
      0x00e3: PHI (r7v7 java.net.HttpURLConnection) = (r7v4 java.net.HttpURLConnection), (r7v5 java.net.HttpURLConnection), (r7v8 java.net.HttpURLConnection) binds: [B:38:0x00b1, B:52:0x00c9, B:66:0x00e1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.baidu.idl.util.NetUtil$RequestAdapter, com.baidu.idl.util.NetUtil$RequestAdapter<T>] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.io.IOException] */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r2v17, types: [org.json.JSONException] */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.io.IOException] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r2v7, types: [org.json.JSONException] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Exception] */
    public static <T> void uploadData(RequestAdapter<T> requestAdapter) throws Throwable {
        int i;
        HttpURLConnection httpURLConnection;
        ?? e;
        SocketTimeoutException e2;
        ?? r8;
        Object response;
        ?? r9;
        IllegalStateException illegalStateException;
        int retryCount = requestAdapter.getRetryCount();
        HttpURLConnection httpURLConnection2 = null;
        OutputStream outputStream = null;
        InputStream inputStream = null;
        while (true) {
            boolean z = false;
            i = 1;
            try {
                httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(requestAdapter.getURL()).openConnection()));
                try {
                    try {
                        httpURLConnection.setConnectTimeout(requestAdapter.getConnectTimeout());
                        httpURLConnection.setDoInput(true);
                        httpURLConnection.setDoOutput(true);
                        httpURLConnection.setReadTimeout(requestAdapter.getReadTimeout());
                        httpURLConnection.setRequestMethod(requestAdapter.getRequestMethod());
                        httpURLConnection.setUseCaches(false);
                        outputStream = httpURLConnection.getOutputStream();
                        outputStream.write(requestAdapter.getRequestString().getBytes("UTF-8"));
                        outputStream.flush();
                        if (httpURLConnection.getResponseCode() != 200) {
                            response = null;
                            i = 4;
                            illegalStateException = new IllegalStateException("ResponseCode: " + httpURLConnection.getResponseCode());
                        } else {
                            inputStream = httpURLConnection.getInputStream();
                            response = requestAdapter.parseResponse(inputStream);
                            illegalStateException = null;
                            i = 0;
                        }
                        try {
                            outputStream.close();
                        } catch (IOException unused) {
                        }
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        httpURLConnection.disconnect();
                        r9 = illegalStateException;
                    } catch (Throwable th) {
                        th = th;
                        httpURLConnection2 = httpURLConnection;
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (IOException unused3) {
                            }
                        }
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException unused4) {
                            }
                        }
                        if (httpURLConnection2 == null) {
                            throw th;
                        }
                        httpURLConnection2.disconnect();
                        throw th;
                    }
                } catch (SocketTimeoutException e3) {
                    e2 = e3;
                    e2.printStackTrace();
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (IOException unused5) {
                        }
                    }
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused6) {
                        }
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    r8 = e2;
                    z = true;
                    response = null;
                    r9 = r8;
                } catch (IOException e4) {
                    e = e4;
                    e.printStackTrace();
                    i = 2;
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (IOException unused7) {
                        }
                    }
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused8) {
                        }
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    r8 = e;
                    response = null;
                    r9 = r8;
                } catch (JSONException e5) {
                    e = e5;
                    e.printStackTrace();
                    i = 3;
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (IOException unused9) {
                        }
                    }
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused10) {
                        }
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    r8 = e;
                    response = null;
                    r9 = r8;
                } catch (Exception e6) {
                    e = e6;
                    e.printStackTrace();
                    i = 5;
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (IOException unused11) {
                        }
                    }
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused12) {
                        }
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    r8 = e;
                    response = null;
                    r9 = r8;
                }
            } catch (SocketTimeoutException e7) {
                httpURLConnection = httpURLConnection2;
                e2 = e7;
            } catch (IOException e8) {
                httpURLConnection = httpURLConnection2;
                e = e8;
            } catch (JSONException e9) {
                httpURLConnection = httpURLConnection2;
                e = e9;
            } catch (Exception e10) {
                httpURLConnection = httpURLConnection2;
                e = e10;
            } catch (Throwable th2) {
                th = th2;
            }
            if (!z) {
                break;
            }
            int i2 = retryCount - 1;
            if (retryCount <= 0) {
                break;
            }
            retryCount = i2;
            httpURLConnection2 = httpURLConnection;
        }
        requestAdapter.onResponse(i, response, r9);
    }
}

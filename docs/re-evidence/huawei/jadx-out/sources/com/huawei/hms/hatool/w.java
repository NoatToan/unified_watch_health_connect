package com.huawei.hms.hatool;

import android.text.TextUtils;
import com.huawei.secure.android.common.ssl.SecureSSLSocketFactory;
import com.huawei.secure.android.common.ssl.hostname.StrictHostnameVerifier;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.net.UnknownHostException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class w {
    private static String b(HttpURLConnection httpURLConnection) {
        InputStream inputStream = null;
        try {
            inputStream = httpURLConnection.getInputStream();
            return k1.a(inputStream);
        } catch (IOException unused) {
            v.f("hmsSdk", "When Response Content From Connection inputStream operation exception! " + httpURLConnection.getResponseCode());
            return "";
        } finally {
            k1.a((Closeable) inputStream);
        }
    }

    private static void a(HttpURLConnection httpURLConnection) throws a {
        String str;
        SecureSSLSocketFactory secureSSLSocketFactory;
        if (httpURLConnection instanceof HttpsURLConnection) {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) httpURLConnection;
            try {
                secureSSLSocketFactory = SecureSSLSocketFactory.getInstance(q0.i());
            } catch (IOException unused) {
                str = "getSocketFactory(): IO Exception!";
                v.f("hmsSdk", str);
                secureSSLSocketFactory = null;
            } catch (IllegalAccessException unused2) {
                str = "getSocketFactory(): Illegal Access Exception ";
                v.f("hmsSdk", str);
                secureSSLSocketFactory = null;
            } catch (KeyStoreException unused3) {
                str = "getSocketFactory(): Key Store exception";
                v.f("hmsSdk", str);
                secureSSLSocketFactory = null;
            } catch (NoSuchAlgorithmException unused4) {
                str = "getSocketFactory(): Algorithm Exception!";
                v.f("hmsSdk", str);
                secureSSLSocketFactory = null;
            } catch (GeneralSecurityException unused5) {
                str = "getSocketFactory(): General Security Exception";
                v.f("hmsSdk", str);
                secureSSLSocketFactory = null;
            }
            if (secureSSLSocketFactory == null) {
                throw new a("No ssl socket factory set");
            }
            httpsURLConnection.setSSLSocketFactory(secureSSLSocketFactory);
            httpsURLConnection.setHostnameVerifier(new StrictHostnameVerifier());
        }
    }

    private static HttpURLConnection a(String str, int i, Map<String, String> map, String str2) throws ProtocolException, a {
        if (TextUtils.isEmpty(str)) {
            v.b("hmsSdk", "CreateConnection: invalid urlPath.");
            return null;
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        a(httpURLConnection);
        httpURLConnection.setRequestMethod(str2);
        httpURLConnection.setConnectTimeout(com.huawei.hms.network.embedded.y.f15619c);
        httpURLConnection.setReadTimeout(com.huawei.hms.network.embedded.y.f15619c);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
        httpURLConnection.setRequestProperty("Content-Length", String.valueOf(i));
        httpURLConnection.setRequestProperty("Connection", "close");
        if (map != null && map.size() >= 1) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key != null && !TextUtils.isEmpty(key)) {
                    httpURLConnection.setRequestProperty(key, entry.getValue());
                }
            }
        }
        return httpURLConnection;
    }

    static class a extends Exception {
        a(String str) {
            super(str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:87:0x0143  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r7v15, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r7v18, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r7v19, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r7v20, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r7v21, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v12, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v13, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v14, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v15, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v16, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v17, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26, types: [java.io.Closeable, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public static n0 a(String str, byte[] bArr, Map<String, String> map, String str2) throws Throwable {
        Throwable th;
        BufferedOutputStream bufferedOutputStream;
        ?? outputStream;
        ?? A;
        BufferedOutputStream bufferedOutputStream2;
        if (TextUtils.isEmpty(str)) {
            return new n0(-100, "");
        }
        ?? r3 = 0;
        bufferedOutputStream = null;
        bufferedOutputStream = null;
        bufferedOutputStream = null;
        bufferedOutputStream = null;
        bufferedOutputStream = null;
        bufferedOutputStream = null;
        bufferedOutputStream = null;
        bufferedOutputStream = null;
        bufferedOutputStream = null;
        bufferedOutputStream = null;
        bufferedOutputStream = null;
        bufferedOutputStream = null;
        bufferedOutputStream = null;
        bufferedOutputStream = null;
        BufferedOutputStream bufferedOutputStream3 = null;
        BufferedOutputStream bufferedOutputStream4 = null;
        BufferedOutputStream bufferedOutputStream5 = null;
        BufferedOutputStream bufferedOutputStream6 = null;
        BufferedOutputStream bufferedOutputStream7 = null;
        BufferedOutputStream bufferedOutputStream8 = null;
        BufferedOutputStream bufferedOutputStream9 = null;
        int responseCode = -102;
        try {
            try {
                A = a(str, bArr.length, map, str2);
                try {
                    if (A == 0) {
                        n0 n0Var = new n0(-101, "");
                        k1.a((Closeable) null);
                        k1.a((Closeable) null);
                        if (A != 0) {
                            k1.a((HttpURLConnection) A);
                        }
                        return n0Var;
                    }
                    outputStream = A.getOutputStream();
                    try {
                        bufferedOutputStream2 = new BufferedOutputStream(outputStream);
                        try {
                            bufferedOutputStream2.write(bArr);
                            bufferedOutputStream2.flush();
                            responseCode = A.getResponseCode();
                            n0 n0Var2 = new n0(responseCode, b(A));
                            k1.a((Closeable) bufferedOutputStream2);
                            k1.a((Closeable) outputStream);
                            k1.a((HttpURLConnection) A);
                            return n0Var2;
                        } catch (a unused) {
                            bufferedOutputStream3 = bufferedOutputStream2;
                            v.f("hmsSdk", "PostRequest(byte[]): No ssl socket factory set!");
                            n0 n0Var3 = new n0(-101, "");
                            k1.a((Closeable) bufferedOutputStream3);
                            k1.a((Closeable) outputStream);
                            if (A != 0) {
                                k1.a((HttpURLConnection) A);
                            }
                            return n0Var3;
                        } catch (SecurityException unused2) {
                            bufferedOutputStream4 = bufferedOutputStream2;
                            v.f("hmsSdk", "SecurityException with HttpClient. Please check INTERNET permission.");
                            n0 n0Var4 = new n0(responseCode, "");
                            k1.a((Closeable) bufferedOutputStream4);
                            k1.a((Closeable) outputStream);
                            if (A != 0) {
                                k1.a((HttpURLConnection) A);
                            }
                            return n0Var4;
                        } catch (ConnectException unused3) {
                            bufferedOutputStream5 = bufferedOutputStream2;
                            v.f("hmsSdk", "Network is unreachable or Connection refused");
                            n0 n0Var5 = new n0(responseCode, "");
                            k1.a((Closeable) bufferedOutputStream5);
                            k1.a((Closeable) outputStream);
                            if (A != 0) {
                                k1.a((HttpURLConnection) A);
                            }
                            return n0Var5;
                        } catch (UnknownHostException unused4) {
                            bufferedOutputStream6 = bufferedOutputStream2;
                            v.f("hmsSdk", "No address associated with hostname or No network");
                            n0 n0Var6 = new n0(responseCode, "");
                            k1.a((Closeable) bufferedOutputStream6);
                            k1.a((Closeable) outputStream);
                            if (A != 0) {
                                k1.a((HttpURLConnection) A);
                            }
                            return n0Var6;
                        } catch (SSLHandshakeException unused5) {
                            bufferedOutputStream7 = bufferedOutputStream2;
                            v.f("hmsSdk", "Chain validation failed,Certificate expired");
                            n0 n0Var7 = new n0(responseCode, "");
                            k1.a((Closeable) bufferedOutputStream7);
                            k1.a((Closeable) outputStream);
                            if (A != 0) {
                                k1.a((HttpURLConnection) A);
                            }
                            return n0Var7;
                        } catch (SSLPeerUnverifiedException unused6) {
                            bufferedOutputStream8 = bufferedOutputStream2;
                            v.f("hmsSdk", "Certificate has not been verified,Request is restricted!");
                            n0 n0Var8 = new n0(responseCode, "");
                            k1.a((Closeable) bufferedOutputStream8);
                            k1.a((Closeable) outputStream);
                            if (A != 0) {
                                k1.a((HttpURLConnection) A);
                            }
                            return n0Var8;
                        } catch (IOException unused7) {
                            bufferedOutputStream9 = bufferedOutputStream2;
                            v.f("hmsSdk", "events PostRequest(byte[]): IOException occurred.");
                            n0 n0Var9 = new n0(responseCode, "");
                            k1.a((Closeable) bufferedOutputStream9);
                            k1.a((Closeable) outputStream);
                            if (A != 0) {
                                k1.a((HttpURLConnection) A);
                            }
                            return n0Var9;
                        } catch (Throwable th2) {
                            th = th2;
                            k1.a((Closeable) bufferedOutputStream2);
                            k1.a((Closeable) outputStream);
                            if (A != 0) {
                                k1.a((HttpURLConnection) A);
                            }
                            throw th;
                        }
                    } catch (a unused8) {
                    } catch (SecurityException unused9) {
                    } catch (ConnectException unused10) {
                    } catch (UnknownHostException unused11) {
                    } catch (SSLHandshakeException unused12) {
                    } catch (SSLPeerUnverifiedException unused13) {
                    } catch (IOException unused14) {
                    }
                } catch (a unused15) {
                    outputStream = 0;
                } catch (SecurityException unused16) {
                    outputStream = 0;
                } catch (ConnectException unused17) {
                    outputStream = 0;
                } catch (UnknownHostException unused18) {
                    outputStream = 0;
                } catch (SSLHandshakeException unused19) {
                    outputStream = 0;
                } catch (SSLPeerUnverifiedException unused20) {
                    outputStream = 0;
                } catch (IOException unused21) {
                    outputStream = 0;
                } catch (Throwable th3) {
                    th = th3;
                    outputStream = 0;
                    r3 = A;
                    bufferedOutputStream = null;
                    bufferedOutputStream2 = bufferedOutputStream;
                    A = r3;
                    k1.a((Closeable) bufferedOutputStream2);
                    k1.a((Closeable) outputStream);
                    if (A != 0) {
                        k1.a((HttpURLConnection) A);
                    }
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                r3 = str;
                bufferedOutputStream = null;
                outputStream = map;
            }
        } catch (a unused22) {
            A = 0;
            outputStream = 0;
        } catch (SecurityException unused23) {
            A = 0;
            outputStream = 0;
        } catch (ConnectException unused24) {
            A = 0;
            outputStream = 0;
        } catch (UnknownHostException unused25) {
            A = 0;
            outputStream = 0;
        } catch (SSLHandshakeException unused26) {
            A = 0;
            outputStream = 0;
        } catch (SSLPeerUnverifiedException unused27) {
            A = 0;
            outputStream = 0;
        } catch (IOException unused28) {
            A = 0;
            outputStream = 0;
        } catch (Throwable th5) {
            th = th5;
            bufferedOutputStream = null;
            outputStream = 0;
        }
    }

    public static n0 a(String str, byte[] bArr, Map<String, String> map) {
        return a(str, bArr, map, "POST");
    }
}

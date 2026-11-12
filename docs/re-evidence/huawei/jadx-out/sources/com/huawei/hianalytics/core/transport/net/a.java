package com.huawei.hianalytics.core.transport.net;

import com.huawei.hianalytics.core.common.EnvUtils;
import com.huawei.hianalytics.core.f;
import com.huawei.hianalytics.core.log.HiLog;
import com.huawei.hianalytics.core.transport.Utils;
import com.huawei.hms.network.embedded.y;
import com.huawei.secure.android.common.encrypt.utils.EncryptUtil;
import com.huawei.secure.android.common.ssl.SSFCompatiableSystemCA;
import com.huawei.secure.android.common.ssl.SecureSSLSocketFactory;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLEncoder;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends TransportHandler {
    public a(String str, Map map, byte[] bArr) {
        super(str, map, bArr);
    }

    @Override // com.huawei.hianalytics.core.transport.net.TransportHandler
    public final Response a() {
        return a("GET");
    }

    @Override // com.huawei.hianalytics.core.transport.net.TransportHandler
    public final Response b() {
        return a("POST");
    }

    /* JADX WARN: Code duplicated, block: B:35:0x005e  */
    /* JADX WARN: Code duplicated, block: B:43:0x007a  */
    public final Response a(String str) throws Throwable {
        Throwable th;
        HttpURLConnection httpURLConnectionA;
        OutputStream outputStream;
        Exception e;
        Throwable th2;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            httpURLConnectionA = a(this.f11477a, str);
            try {
                if ("GET".equals(str)) {
                    outputStream = null;
                } else {
                    outputStream = httpURLConnectionA.getOutputStream();
                    try {
                        BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(outputStream);
                        try {
                            bufferedOutputStream2.write(this.f11479c);
                            bufferedOutputStream2.flush();
                            bufferedOutputStream = bufferedOutputStream2;
                        } catch (Exception e2) {
                            e = e2;
                            bufferedOutputStream = bufferedOutputStream2;
                            try {
                                Utils.handlerException(e);
                                a(bufferedOutputStream);
                                a(outputStream);
                                if (httpURLConnectionA != null) {
                                    httpURLConnectionA.disconnect();
                                }
                                return new Response(-108, "");
                            } catch (Throwable th3) {
                                bufferedOutputStream2 = bufferedOutputStream;
                                th2 = th3;
                                BufferedOutputStream bufferedOutputStream3 = bufferedOutputStream2;
                                th = th2;
                                bufferedOutputStream = bufferedOutputStream3;
                                a(bufferedOutputStream);
                                a(outputStream);
                                if (httpURLConnectionA != null) {
                                    httpURLConnectionA.disconnect();
                                }
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th2 = th4;
                            BufferedOutputStream bufferedOutputStream4 = bufferedOutputStream2;
                            th = th2;
                            bufferedOutputStream = bufferedOutputStream4;
                            a(bufferedOutputStream);
                            a(outputStream);
                            if (httpURLConnectionA != null) {
                                httpURLConnectionA.disconnect();
                            }
                            throw th;
                        }
                    } catch (Exception e3) {
                        e = e3;
                    } catch (Throwable th5) {
                        th = th5;
                        a(bufferedOutputStream);
                        a(outputStream);
                        if (httpURLConnectionA != null) {
                            httpURLConnectionA.disconnect();
                        }
                        throw th;
                    }
                }
                Response response = new Response(httpURLConnectionA.getResponseCode(), a(httpURLConnectionA));
                a(bufferedOutputStream);
                a(outputStream);
                httpURLConnectionA.disconnect();
                return response;
            } catch (Exception e4) {
                e = e4;
                e = e;
                outputStream = null;
                Utils.handlerException(e);
                a(bufferedOutputStream);
                a(outputStream);
                if (httpURLConnectionA != null) {
                    httpURLConnectionA.disconnect();
                }
                return new Response(-108, "");
            } catch (Throwable th6) {
                th = th6;
                outputStream = null;
                a(bufferedOutputStream);
                a(outputStream);
                if (httpURLConnectionA != null) {
                    httpURLConnectionA.disconnect();
                }
                throw th;
            }
        } catch (Exception e5) {
            e = e5;
            httpURLConnectionA = null;
        } catch (Throwable th7) {
            th = th7;
            httpURLConnectionA = null;
        }
    }

    public static String a(HttpURLConnection httpURLConnection) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        InputStream inputStream;
        Throwable th;
        InputStream inputStream2 = null;
        try {
            inputStream = httpURLConnection.getInputStream();
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = inputStream.read(bArr);
                        if (i != -1) {
                            byteArrayOutputStream.write(bArr, 0, i);
                        } else {
                            String string = byteArrayOutputStream.toString("UTF-8");
                            a(byteArrayOutputStream);
                            a(inputStream);
                            return string;
                        }
                    }
                } catch (IOException unused) {
                    inputStream2 = inputStream;
                    try {
                        HiLog.e("HttpTransportHandler", HiLog.ErrorCode.NE004);
                        a(byteArrayOutputStream);
                        a(inputStream2);
                        return "";
                    } catch (Throwable th2) {
                        th = th2;
                        InputStream inputStream3 = inputStream2;
                        th = th;
                        inputStream = inputStream3;
                        a(byteArrayOutputStream);
                        a(inputStream);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    a(byteArrayOutputStream);
                    a(inputStream);
                    throw th;
                }
            } catch (IOException unused2) {
                byteArrayOutputStream = null;
                inputStream2 = inputStream;
                HiLog.e("HttpTransportHandler", HiLog.ErrorCode.NE004);
                a(byteArrayOutputStream);
                a(inputStream2);
                return "";
            } catch (Throwable th4) {
                inputStream2 = inputStream;
                th = th4;
                byteArrayOutputStream = null;
                InputStream inputStream4 = inputStream2;
                th = th;
                inputStream = inputStream4;
                a(byteArrayOutputStream);
                a(inputStream);
                throw th;
            }
        } catch (IOException unused3) {
            inputStream = null;
        } catch (Throwable th5) {
            th = th5;
            byteArrayOutputStream = null;
        }
    }

    public final HttpURLConnection a(String str, String str2) throws ProtocolException, f {
        SSFCompatiableSystemCA sSFCompatiableSystemCA;
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        if (httpURLConnection instanceof HttpsURLConnection) {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) httpURLConnection;
            try {
                sSFCompatiableSystemCA = SSFCompatiableSystemCA.getInstance(EnvUtils.getAppContext(), EncryptUtil.genSecureRandom());
            } catch (IOException unused) {
                HiLog.e("HttpTransportHandler", "getSocketFactory(): IO Exception!");
                sSFCompatiableSystemCA = null;
            } catch (KeyStoreException unused2) {
                HiLog.e("HttpTransportHandler", "getSocketFactory(): Key Store exception");
                sSFCompatiableSystemCA = null;
            } catch (NoSuchAlgorithmException unused3) {
                HiLog.e("HttpTransportHandler", "getSocketFactory(): Algorithm Exception!");
                sSFCompatiableSystemCA = null;
            } catch (GeneralSecurityException unused4) {
                HiLog.e("HttpTransportHandler", "getSocketFactory(): General Security Exception");
                sSFCompatiableSystemCA = null;
            }
            if (sSFCompatiableSystemCA != null) {
                httpsURLConnection.setSSLSocketFactory(sSFCompatiableSystemCA);
                httpsURLConnection.setHostnameVerifier(SecureSSLSocketFactory.STRICT_HOSTNAME_VERIFIER);
            } else {
                throw new f();
            }
        }
        httpURLConnection.setRequestMethod(str2);
        httpURLConnection.setConnectTimeout(y.f15619c);
        httpURLConnection.setReadTimeout(y.f15619c);
        if (!"GET".equals(str2)) {
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestProperty("Conntent-Length", String.valueOf(this.f11479c.length));
        }
        httpURLConnection.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
        httpURLConnection.setRequestProperty("Connection", "close");
        Map map = this.f11478b;
        if (map != null && map.size() > 0) {
            for (Map.Entry entry : this.f11478b.entrySet()) {
                String str3 = (String) entry.getKey();
                if (str3 != null && !str3.isEmpty()) {
                    httpURLConnection.setRequestProperty(str3, URLEncoder.encode(entry.getValue() == null ? "" : (String) entry.getValue(), "UTF-8"));
                }
            }
        }
        return httpURLConnection;
    }

    public static void a(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
            HiLog.w("HttpTransportHandler", "closeQuietly(): Exception when closing the closeable!");
        }
    }
}

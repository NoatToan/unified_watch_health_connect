package com.unionpay.a;

import com.miui.tsmclient.util.Constants;
import com.unionpay.utils.j;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLHandshakeException;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f10741a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InputStream f10742b = null;
    private d c;
    private String d;

    public c(d dVar, String str) {
        this.c = dVar;
        this.d = str;
    }

    public final int a() {
        InputStream inputStream;
        HttpURLConnection httpURLConnection;
        j.a("uppay", "HttpConn.connect() +++");
        d dVar = this.c;
        int i = 1;
        try {
            try {
                if (dVar == null) {
                    j.c("uppay", "params==null!!!");
                    return 1;
                }
                try {
                    try {
                        URL urlA = dVar.a();
                        if (Constants.URI_SCHEME.equals(urlA.getProtocol().toLowerCase())) {
                            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) urlA.openConnection();
                            httpsURLConnection.setSSLSocketFactory(new a(this.d).a().getSocketFactory());
                            httpURLConnection = httpsURLConnection;
                        } else {
                            httpURLConnection = (HttpURLConnection) urlA.openConnection();
                        }
                        httpURLConnection.setRequestMethod(this.c.b());
                        httpURLConnection.setReadTimeout(60000);
                        httpURLConnection.setConnectTimeout(30000);
                        httpURLConnection.setInstanceFollowRedirects(true);
                        httpURLConnection.setUseCaches(false);
                        HashMap mapD = this.c.d();
                        if (mapD != null) {
                            for (String str : mapD.keySet()) {
                                httpURLConnection.setRequestProperty(str, (String) mapD.get(str));
                            }
                        }
                        String strB = this.c.b();
                        int iHashCode = strB.hashCode();
                        if (iHashCode == 70454) {
                            strB.equals("GET");
                        } else if (iHashCode == 2461856 && strB.equals("POST")) {
                            httpURLConnection.setDoOutput(true);
                            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpURLConnection.getOutputStream(), "UTF-8");
                            outputStreamWriter.write(this.c.c());
                            outputStreamWriter.flush();
                            outputStreamWriter.close();
                        }
                        httpURLConnection.connect();
                        if (httpURLConnection.getResponseCode() == 200) {
                            InputStream inputStream2 = httpURLConnection.getInputStream();
                            this.f10742b = inputStream2;
                            if (inputStream2 != null) {
                                this.f10741a = com.unionpay.utils.b.a(inputStream2, "UTF-8");
                                i = 0;
                            }
                        } else if (httpURLConnection.getResponseCode() == 401) {
                            i = 8;
                        } else if (httpURLConnection.getResponseCode() == 404) {
                            i = 22;
                        } else {
                            j.c("uppay", "http status code:" + httpURLConnection.getResponseCode());
                        }
                        inputStream = this.f10742b;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                    } catch (SSLHandshakeException e) {
                        e.printStackTrace();
                        try {
                            InputStream inputStream3 = this.f10742b;
                            if (inputStream3 != null) {
                                inputStream3.close();
                            }
                        } catch (Exception unused) {
                        }
                        i = 4;
                    } catch (IOException e2) {
                        e2.printStackTrace();
                        inputStream = this.f10742b;
                        if (inputStream != null) {
                        }
                    }
                } catch (IllegalStateException e3) {
                    e3.printStackTrace();
                    inputStream = this.f10742b;
                    if (inputStream != null) {
                    }
                } catch (Exception e4) {
                    e4.printStackTrace();
                    inputStream = this.f10742b;
                    if (inputStream != null) {
                    }
                }
            } catch (Exception unused2) {
            }
            j.a("uppay", "HttpConn.connect() ---");
            return i;
        } catch (Throwable th) {
            try {
                InputStream inputStream4 = this.f10742b;
                if (inputStream4 != null) {
                    inputStream4.close();
                }
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    public final String b() {
        return this.f10741a;
    }
}

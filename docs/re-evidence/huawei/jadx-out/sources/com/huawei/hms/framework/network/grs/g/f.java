package com.huawei.hms.framework.network.grs.g;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.huawei.hms.framework.common.IoUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.network.embedded.r1;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.Callable;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: classes3.dex */
public class f extends a implements Callable<d> {
    private static final String i = "f";

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Code duplicated, block: B:80:0x017f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.util.concurrent.Callable
    public d call() throws Throwable {
        HttpsURLConnection httpsURLConnection;
        long j;
        HttpsURLConnection httpsURLConnectionA;
        long jCurrentTimeMillis;
        String str = i;
        Logger.i(str, "Post call execute");
        long jCurrentTimeMillis2 = 0;
        HttpsURLConnection httpsURLConnection2 = null;
        InputStream inputStream = null;
        byte[] bArr = null;
        HttpsURLConnection httpsURLConnection3 = null;
        try {
            try {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                try {
                    jCurrentTimeMillis2 = System.currentTimeMillis();
                    Logger.i(str, "Post url :" + StringUtils.anonymizeMessage(c()));
                    httpsURLConnectionA = com.huawei.hms.framework.network.grs.h.f.b.a(c(), a(), e());
                    try {
                        if (httpsURLConnectionA == null) {
                            Logger.w(str, "create HttpsURLConnection instance by url return null.");
                            if (httpsURLConnectionA != null) {
                                try {
                                    httpsURLConnectionA.disconnect();
                                    return null;
                                } catch (RuntimeException unused) {
                                    Logger.w(i, "RequestCallableV2 disconnect HttpsURLConnection catch RuntimeException");
                                } catch (Throwable unused2) {
                                    Logger.w(i, "RequestCallableV2 disconnect HttpsURLConnection catch Throwable");
                                }
                            }
                            return null;
                        }
                        httpsURLConnectionA.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
                        httpsURLConnectionA.setRequestProperty("Connection", "close");
                        httpsURLConnectionA.setRequestMethod("POST");
                        httpsURLConnectionA.setDoOutput(true);
                        httpsURLConnectionA.setDoInput(true);
                        String strA = b() != null ? b().a() : "";
                        if (TextUtils.isEmpty(strA)) {
                            strA = "&";
                        }
                        httpsURLConnectionA.setRequestProperty(r1.b.n, strA);
                        httpsURLConnectionA.connect();
                        String strA2 = f().a("services", "");
                        Logger.i(str, "httpsURLConnection services:" + StringUtils.anonymizeMessage(strA2));
                        com.huawei.hms.framework.network.grs.h.f.b.a(httpsURLConnectionA, strA2);
                        int responseCode = httpsURLConnectionA.getResponseCode();
                        Logger.i(str, "httpsURLConnection result code:" + responseCode);
                        if (responseCode == 200) {
                            try {
                                inputStream = httpsURLConnectionA.getInputStream();
                                byte[] byteArray = IoUtils.toByteArray(inputStream);
                                IoUtils.closeSecure(inputStream);
                                bArr = byteArray;
                            } catch (Throwable th) {
                                IoUtils.closeSecure(inputStream);
                                throw th;
                            }
                        }
                        Map headerFields = httpsURLConnectionA.getHeaderFields();
                        httpsURLConnectionA.disconnect();
                        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                        jCurrentTimeMillis = System.currentTimeMillis();
                        this.f13300a = new d(responseCode, headerFields, bArr == null ? new byte[0] : bArr, jElapsedRealtime2 - jElapsedRealtime);
                        if (httpsURLConnectionA != null) {
                            try {
                                httpsURLConnectionA.disconnect();
                            } catch (RuntimeException unused3) {
                                Logger.w(i, "RequestCallableV2 disconnect HttpsURLConnection catch RuntimeException");
                            } catch (Throwable unused4) {
                                Logger.w(i, "RequestCallableV2 disconnect HttpsURLConnection catch Throwable");
                            }
                        }
                    } catch (IOException e) {
                        e = e;
                        httpsURLConnection3 = httpsURLConnectionA;
                        httpsURLConnection = httpsURLConnection3;
                        j = jCurrentTimeMillis2;
                        jCurrentTimeMillis2 = jElapsedRealtime;
                        try {
                            long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                            jCurrentTimeMillis = System.currentTimeMillis();
                            Logger.w(i, "RequestCallableV2 run task catch IOException", e);
                            this.f13300a = new d(e, jElapsedRealtime3 - jCurrentTimeMillis2);
                            if (httpsURLConnection != null) {
                                try {
                                    httpsURLConnection.disconnect();
                                } catch (RuntimeException unused5) {
                                    jCurrentTimeMillis2 = j;
                                    Logger.w(i, "RequestCallableV2 disconnect HttpsURLConnection catch RuntimeException");
                                } catch (Throwable unused6) {
                                    jCurrentTimeMillis2 = j;
                                    Logger.w(i, "RequestCallableV2 disconnect HttpsURLConnection catch Throwable");
                                }
                            }
                            jCurrentTimeMillis2 = j;
                        } catch (Throwable th2) {
                            th = th2;
                            httpsURLConnection2 = httpsURLConnection;
                            httpsURLConnectionA = httpsURLConnection2;
                            if (httpsURLConnectionA != null) {
                                try {
                                    httpsURLConnectionA.disconnect();
                                } catch (RuntimeException unused7) {
                                    Logger.w(i, "RequestCallableV2 disconnect HttpsURLConnection catch RuntimeException");
                                } catch (Throwable unused8) {
                                    Logger.w(i, "RequestCallableV2 disconnect HttpsURLConnection catch Throwable");
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        if (httpsURLConnectionA != null) {
                            httpsURLConnectionA.disconnect();
                        }
                        throw th;
                    }
                } catch (IOException e2) {
                    e = e2;
                }
            } catch (Throwable th4) {
                th = th4;
                httpsURLConnectionA = httpsURLConnection2;
                if (httpsURLConnectionA != null) {
                    httpsURLConnectionA.disconnect();
                }
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            httpsURLConnection = null;
            j = 0;
        }
        this.f13300a.b(c());
        this.f13300a.a(d());
        this.f13300a.b(jCurrentTimeMillis2);
        this.f13300a.a(jCurrentTimeMillis);
        if (b() != null) {
            b().a(this.f13300a);
        }
        return this.f13300a;
    }

    public f(String str, int i2, c cVar, Context context, String str2, GrsBaseInfo grsBaseInfo, com.huawei.hms.framework.network.grs.e.c cVar2) {
        super(str, i2, cVar, context, str2, grsBaseInfo, cVar2);
    }
}

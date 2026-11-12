package com.rnfs;

import android.os.AsyncTask;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.xiaomi.accountsdk.request.SimpleRequest;
import defpackage.r37;
import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public class b extends AsyncTask<com.rnfs.a, long[], r37> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.rnfs.a f10584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AtomicBoolean f10585b = new AtomicBoolean(false);
    public r37 c;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                b bVar = b.this;
                bVar.d(bVar.f10584a, b.this.c);
                b.this.f10584a.h.a(b.this.c);
            } catch (Exception e) {
                b bVar2 = b.this;
                bVar2.c.c = e;
                bVar2.f10584a.h.a(b.this.c);
            }
        }
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public r37 doInBackground(com.rnfs.a... aVarArr) {
        this.f10584a = aVarArr[0];
        this.c = new r37();
        new Thread(new a()).start();
        return this.c;
    }

    /* JADX WARN: Code duplicated, block: B:93:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:96:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:98:0x01fa  */
    public final void d(com.rnfs.a aVar, r37 r37Var) throws Exception {
        BufferedInputStream bufferedInputStream;
        HttpURLConnection httpURLConnection;
        int i;
        int i2;
        com.rnfs.a aVar2 = aVar;
        FileOutputStream fileOutputStream = null;
        try {
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) aVar2.f10582a.openConnection();
            try {
                ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = aVar2.c.keySetIterator();
                while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                    String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
                    httpURLConnection2.setRequestProperty(strNextKey, aVar2.c.getString(strNextKey));
                }
                httpURLConnection2.setConnectTimeout(aVar2.g);
                httpURLConnection2.setReadTimeout(aVar2.f);
                httpURLConnection2.connect();
                int responseCode = httpURLConnection2.getResponseCode();
                long jE = e(httpURLConnection2);
                if (responseCode == 200 || !(responseCode == 301 || responseCode == 302 || responseCode == 307 || responseCode == 308)) {
                    if (responseCode >= 200 || responseCode >= 300) {
                        httpURLConnection = httpURLConnection2;
                        i = responseCode;
                        bufferedInputStream = null;
                    } else {
                        try {
                            Map<String, List<String>> headerFields = httpURLConnection2.getHeaderFields();
                            HashMap map = new HashMap();
                            for (Map.Entry<String, List<String>> entry : headerFields.entrySet()) {
                                String key = entry.getKey();
                                String str = entry.getValue().get(0);
                                if (key != null && str != null) {
                                    map.put(key, str);
                                }
                            }
                            com.rnfs.a.InterfaceC0333a interfaceC0333a = this.f10584a.i;
                            if (interfaceC0333a != null) {
                                interfaceC0333a.a(responseCode, jE, map);
                            }
                            bufferedInputStream = new BufferedInputStream(httpURLConnection2.getInputStream(), 8192);
                            try {
                                FileOutputStream fileOutputStream2 = new FileOutputStream(aVar2.f10583b);
                                try {
                                    byte[] bArr = new byte[8192];
                                    boolean z = this.f10584a.j != null;
                                    long j = 0;
                                    long j2 = 0;
                                    double d = 0.0d;
                                    while (true) {
                                        int i3 = bufferedInputStream.read(bArr);
                                        if (i3 == -1) {
                                            httpURLConnection = httpURLConnection2;
                                            i = responseCode;
                                            fileOutputStream2.flush();
                                            r37Var.f32134b = j2;
                                            fileOutputStream = fileOutputStream2;
                                            break;
                                        }
                                        if (this.f10585b.get()) {
                                            throw new Exception("Download has been aborted");
                                        }
                                        HttpURLConnection httpURLConnection3 = httpURLConnection2;
                                        int i4 = responseCode;
                                        j2 += (long) i3;
                                        if (z) {
                                            try {
                                                if (aVar2.d > 0) {
                                                    long jCurrentTimeMillis = System.currentTimeMillis();
                                                    if (jCurrentTimeMillis - j > aVar2.d) {
                                                        publishProgress(new long[]{jE, j2});
                                                        j = jCurrentTimeMillis;
                                                    }
                                                    httpURLConnection = httpURLConnection3;
                                                    i2 = 0;
                                                } else {
                                                    if (aVar2.e <= 0.0f) {
                                                        publishProgress(new long[]{jE, j2});
                                                        httpURLConnection = httpURLConnection3;
                                                    } else {
                                                        httpURLConnection = httpURLConnection3;
                                                        double dRound = Math.round((j2 * 100.0d) / jE);
                                                        if (dRound % ((double) aVar2.e) == 0.0d && (dRound != d || j2 == jE)) {
                                                            StringBuilder sb = new StringBuilder();
                                                            sb.append("EMIT: ");
                                                            sb.append(String.valueOf(dRound));
                                                            sb.append(", TOTAL:");
                                                            sb.append(String.valueOf(j2));
                                                            publishProgress(new long[]{jE, j2});
                                                            d = dRound;
                                                        }
                                                    }
                                                    i2 = 0;
                                                }
                                            } catch (Throwable th) {
                                                th = th;
                                                httpURLConnection = httpURLConnection3;
                                            }
                                        } else {
                                            httpURLConnection = httpURLConnection3;
                                            i2 = 0;
                                        }
                                        try {
                                            fileOutputStream2.write(bArr, i2, i3);
                                            aVar2 = aVar;
                                            responseCode = i4;
                                            httpURLConnection2 = httpURLConnection;
                                        } catch (Throwable th2) {
                                            th = th2;
                                        }
                                        fileOutputStream = fileOutputStream2;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    httpURLConnection = httpURLConnection2;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                httpURLConnection = httpURLConnection2;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            httpURLConnection = httpURLConnection2;
                            bufferedInputStream = null;
                        }
                    }
                    try {
                        r37Var.f32133a = i;
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        if (bufferedInputStream != null) {
                            bufferedInputStream.close();
                        }
                        httpURLConnection.disconnect();
                        return;
                    } catch (Throwable th6) {
                        th = th6;
                    }
                } else {
                    String headerField = httpURLConnection2.getHeaderField(SimpleRequest.LOCATION);
                    httpURLConnection2.disconnect();
                    HttpURLConnection httpURLConnection4 = (HttpURLConnection) new URL(headerField).openConnection();
                    try {
                        httpURLConnection4.setConnectTimeout(5000);
                        httpURLConnection4.connect();
                        int responseCode2 = httpURLConnection4.getResponseCode();
                        jE = e(httpURLConnection4);
                        responseCode = responseCode2;
                        httpURLConnection2 = httpURLConnection4;
                        if (responseCode >= 200) {
                            httpURLConnection = httpURLConnection2;
                            i = responseCode;
                            bufferedInputStream = null;
                            r37Var.f32133a = i;
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            if (bufferedInputStream != null) {
                                bufferedInputStream.close();
                            }
                            httpURLConnection.disconnect();
                            return;
                        }
                        httpURLConnection = httpURLConnection2;
                        i = responseCode;
                        bufferedInputStream = null;
                        r37Var.f32133a = i;
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        if (bufferedInputStream != null) {
                            bufferedInputStream.close();
                        }
                        httpURLConnection.disconnect();
                        return;
                    } catch (Throwable th7) {
                        th = th7;
                        bufferedInputStream = null;
                        httpURLConnection = httpURLConnection4;
                    }
                }
            } catch (Throwable th8) {
                th = th8;
                bufferedInputStream = null;
            }
        } catch (Throwable th9) {
            th = th9;
            bufferedInputStream = null;
            httpURLConnection = null;
        }
        if (fileOutputStream != null) {
            fileOutputStream.close();
        }
        if (bufferedInputStream != null) {
            bufferedInputStream.close();
        }
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        throw th;
    }

    public final long e(HttpURLConnection httpURLConnection) {
        return httpURLConnection.getContentLengthLong();
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void onProgressUpdate(long[]... jArr) {
        super.onProgressUpdate(jArr);
        com.rnfs.a.b bVar = this.f10584a.j;
        if (bVar != null) {
            long[] jArr2 = jArr[0];
            bVar.a(jArr2[0], jArr2[1]);
        }
    }

    public void g() {
        this.f10585b.set(true);
    }
}

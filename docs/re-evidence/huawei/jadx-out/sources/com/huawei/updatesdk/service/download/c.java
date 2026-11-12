package com.huawei.updatesdk.service.download;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;

/* JADX INFO: loaded from: classes20.dex */
public class c extends AsyncTask<Void, Void, Void> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f29952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HttpURLConnection f29953b;
    private final com.huawei.updatesdk.service.download.b d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f29954c = false;
    private Handler e = new b(null);

    @Override // android.os.AsyncTask
    protected void onCancelled() {
        super.onCancelled();
        a();
    }

    public void c() {
        this.e = null;
    }

    public void a() {
        com.huawei.updatesdk.service.store.c.f30005a.execute(new a());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Void doInBackground(Void... voidArr) throws Throwable {
        com.huawei.updatesdk.service.store.b.a(this);
        a(this.d, d.b());
        return null;
    }

    private void b() {
        HttpURLConnection httpURLConnection = this.f29953b;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0084  */
    private boolean a(com.huawei.updatesdk.service.download.b bVar, OutputStream outputStream, String str) {
        long j;
        BufferedInputStream bufferedInputStream;
        boolean z;
        int i;
        int iA;
        BufferedOutputStream bufferedOutputStream;
        boolean z2;
        OutputStream outputStream2 = null;
        long j2 = -1;
        try {
            HttpURLConnection httpURLConnectionA = d.a().a(bVar.b());
            this.f29953b = httpURLConnectionA;
            httpURLConnectionA.connect();
            int responseCode = this.f29953b.getResponseCode();
            if (200 != responseCode && 206 != responseCode) {
                a(false, bVar, 0, -1L);
                a((InputStream) null, (OutputStream) null);
                return false;
            }
            try {
                long jE = bVar.e();
                try {
                    bufferedInputStream = new BufferedInputStream(this.f29953b.getInputStream(), 8192);
                    try {
                        bufferedOutputStream = new BufferedOutputStream(outputStream, 8192);
                        try {
                            iA = a(bVar, bufferedInputStream, bufferedOutputStream, jE);
                            try {
                                a(bufferedInputStream, bufferedOutputStream);
                                if (iA != jE || jE <= 0) {
                                    z2 = false;
                                } else {
                                    try {
                                        if (TextUtils.isEmpty(bVar.d()) || !bVar.d().equalsIgnoreCase(com.huawei.updatesdk.sdk.foundation.utils.d.a(str, "SHA-256"))) {
                                            z2 = false;
                                        } else {
                                            z2 = true;
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        j2 = jE;
                                        jE = j2;
                                        bufferedInputStream = null;
                                        z = false;
                                        j = jE;
                                        i = iA;
                                        try {
                                            com.huawei.updatesdk.sdk.foundation.log.ecs.mtk.a.b("DownloadMarketTask", "downloadUrlToStream(String urlString,OutputStream outputStream) " + th.getMessage());
                                            a(z, bVar, i, j);
                                            a(bufferedInputStream, outputStream2);
                                            return false;
                                        } finally {
                                            a(z, bVar, i, j);
                                            a(bufferedInputStream, outputStream2);
                                            com.huawei.updatesdk.service.store.b.a().remove(this);
                                            b();
                                        }
                                    }
                                }
                                if (z2) {
                                    try {
                                        a(bVar.d(), iA, jE, this.f29952a, 4);
                                    } catch (Throwable th2) {
                                        th = th2;
                                        bufferedInputStream = null;
                                        j = jE;
                                        z = z2;
                                        i = iA;
                                        com.huawei.updatesdk.sdk.foundation.log.ecs.mtk.a.b("DownloadMarketTask", "downloadUrlToStream(String urlString,OutputStream outputStream) " + th.getMessage());
                                        a(z, bVar, i, j);
                                        a(bufferedInputStream, outputStream2);
                                        return false;
                                    }
                                }
                                a(z2, bVar, iA, jE);
                                a((InputStream) null, (OutputStream) null);
                                com.huawei.updatesdk.service.store.b.a().remove(this);
                                b();
                                return z2;
                            } catch (Throwable th3) {
                                th = th3;
                                z = false;
                                j = jE;
                                outputStream2 = bufferedOutputStream;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            try {
                                a(bufferedInputStream, bufferedOutputStream);
                                try {
                                    throw th;
                                } catch (Throwable th5) {
                                    th = th5;
                                    iA = 0;
                                    j2 = jE;
                                    jE = j2;
                                    bufferedInputStream = null;
                                    z = false;
                                    j = jE;
                                    i = iA;
                                    com.huawei.updatesdk.sdk.foundation.log.ecs.mtk.a.b("DownloadMarketTask", "downloadUrlToStream(String urlString,OutputStream outputStream) " + th.getMessage());
                                    a(z, bVar, i, j);
                                    a(bufferedInputStream, outputStream2);
                                    return false;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                iA = 0;
                                outputStream2 = bufferedOutputStream;
                                z = false;
                                j = jE;
                                i = iA;
                                com.huawei.updatesdk.sdk.foundation.log.ecs.mtk.a.b("DownloadMarketTask", "downloadUrlToStream(String urlString,OutputStream outputStream) " + th.getMessage());
                                a(z, bVar, i, j);
                                a(bufferedInputStream, outputStream2);
                                return false;
                            }
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        bufferedOutputStream = null;
                    }
                } catch (Throwable th8) {
                    th = th8;
                    bufferedInputStream = null;
                    bufferedOutputStream = null;
                }
            } catch (Throwable th9) {
                th = th9;
                iA = 0;
            }
        } catch (Throwable th10) {
            th = th10;
            j = -1;
            bufferedInputStream = null;
            z = false;
            i = 0;
        }
    }

    private void a(boolean z, com.huawei.updatesdk.service.download.b bVar, int i, long j) {
        String strD;
        String str;
        int i2;
        if (z) {
            return;
        }
        if (this.f29954c) {
            strD = bVar.d();
            str = this.f29952a;
            i2 = 3;
        } else {
            strD = bVar.d();
            str = this.f29952a;
            i2 = 5;
        }
        a(strD, i, j, str, i2);
    }

    private void a(String str, int i, long j, String str2, int i2) {
        com.huawei.updatesdk.service.download.b bVar = new com.huawei.updatesdk.service.download.b();
        bVar.a(i);
        bVar.a(j);
        bVar.a(str2);
        bVar.b(str);
        Handler handler = this.e;
        if (handler == null) {
            return;
        }
        handler.sendMessage(handler.obtainMessage(i2, bVar));
    }

    static class b extends Handler {
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            Object obj = message.obj;
            if (obj instanceof com.huawei.updatesdk.service.download.b) {
                com.huawei.updatesdk.service.download.b bVar = (com.huawei.updatesdk.service.download.b) obj;
                Intent intent = new Intent();
                com.huawei.updatesdk.sdk.service.secure.b bVarA = com.huawei.updatesdk.sdk.service.secure.b.a(intent);
                int i = message.what;
                if (i == 2) {
                    intent.putExtra("download_apk_size", bVar.e());
                    intent.putExtra("download_apk_already", bVar.a());
                    com.huawei.updatesdk.service.observer.c.b().a(bVarA);
                    return;
                }
                if (i != 3) {
                    if (i == 4) {
                        e.a(com.huawei.updatesdk.sdk.service.app.a.c().a(), d.b() + "/appmarket.apk", bVar.c(), bVar.d());
                        a(message, intent, bVarA);
                        return;
                    }
                    if (i != 5) {
                        return;
                    }
                }
                a(message, intent, bVarA);
            }
        }

        private void a(Message message, Intent intent, com.huawei.updatesdk.sdk.service.secure.b bVar) {
            Bundle bundle = new Bundle();
            bundle.putInt("download_status_param", message.what);
            intent.putExtras(bundle);
            com.huawei.updatesdk.service.observer.c.b().b(bVar);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        private b() {
        }
    }

    private void a(InputStream inputStream, OutputStream outputStream) {
        com.huawei.updatesdk.sdk.foundation.utils.d.a(inputStream);
        com.huawei.updatesdk.sdk.foundation.utils.d.a(outputStream);
    }

    private void a(com.huawei.updatesdk.service.download.b bVar, String str) throws Throwable {
        FileOutputStream fileOutputStream;
        String str2;
        if (bVar == null || TextUtils.isEmpty(bVar.b())) {
            return;
        }
        String str3 = str + "/appmarket.apk";
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(new File(str3));
                try {
                    if (!a(bVar, fileOutputStream, str3)) {
                        com.huawei.updatesdk.sdk.foundation.utils.d.a(new File(d.b()));
                    }
                    com.huawei.updatesdk.sdk.foundation.utils.d.a(fileOutputStream);
                } catch (FileNotFoundException unused) {
                    fileOutputStream2 = fileOutputStream;
                    str2 = "DOWNLOAD market package FileNotFoundException error";
                    com.huawei.updatesdk.sdk.foundation.log.ecs.mtk.a.b("DownloadMarketTask", str2);
                    com.huawei.updatesdk.sdk.foundation.utils.d.a(fileOutputStream2);
                } catch (Exception e) {
                    e = e;
                    fileOutputStream2 = fileOutputStream;
                    str2 = "DOWNLOAD market package Exception error:" + e.getMessage();
                    com.huawei.updatesdk.sdk.foundation.log.ecs.mtk.a.b("DownloadMarketTask", str2);
                    com.huawei.updatesdk.sdk.foundation.utils.d.a(fileOutputStream2);
                } catch (Throwable th) {
                    th = th;
                    com.huawei.updatesdk.sdk.foundation.utils.d.a(fileOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
        } catch (FileNotFoundException unused2) {
        } catch (Exception e2) {
            e = e2;
        }
    }

    class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            if (c.this.f29953b != null) {
                c.this.f29954c = true;
                c.this.f29953b.disconnect();
            }
            com.huawei.updatesdk.sdk.foundation.utils.d.a(new File(d.b()));
        }

        a() {
        }
    }

    private int a(com.huawei.updatesdk.service.download.b bVar, BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream, long j) throws IOException {
        byte[] bArr = new byte[8192];
        long jCurrentTimeMillis = 0;
        int i = 0;
        while (true) {
            int i2 = bufferedInputStream.read(bArr);
            if (i2 == -1) {
                return i;
            }
            bufferedOutputStream.write(bArr, 0, i2);
            i += i2;
            if (Math.abs(System.currentTimeMillis() - jCurrentTimeMillis) > 1000) {
                jCurrentTimeMillis = System.currentTimeMillis();
                if (i != j) {
                    a(bVar.d(), i, j, this.f29952a, 2);
                }
            }
        }
    }

    public c(com.huawei.updatesdk.service.download.b bVar) {
        this.d = bVar;
        if (TextUtils.isEmpty(bVar.c())) {
            return;
        }
        this.f29952a = bVar.c();
    }
}

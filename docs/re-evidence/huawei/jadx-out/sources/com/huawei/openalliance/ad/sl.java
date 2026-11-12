package com.huawei.openalliance.ad;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.net.http.Response;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes12.dex */
public class sl {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final LinkedHashMap<String, String> f20257c = new LinkedHashMap<>(0, 0.75f, true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private sk f20258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f20259b;
    private sn d;
    private cw e;
    private Context f;
    private dn g;
    private String h;

    public so a() {
        if (!com.huawei.openalliance.ad.utils.dg.b(this.f20259b)) {
            return a(this.d);
        }
        a((Integer) 1, "root is blank");
        return null;
    }

    private boolean e(String str) {
        if (this.d == null) {
            hw.c("SourceFetcher", "checkSourceDataAndFileState, source error");
            return false;
        }
        if (b(str) == null) {
            return true;
        }
        hw.b("SourceFetcher", "file is in progress");
        a((Integer) 3, "file is in progress");
        return false;
    }

    private void d(String str) {
        synchronized (this) {
            hw.a("SourceFetcher", "removeLoadingImages, key:%s", com.huawei.openalliance.ad.utils.ds.a(str));
            f20257c.remove(str);
        }
    }

    private void c(String str) {
        synchronized (this) {
            hw.a("SourceFetcher", "addLoadingImages, key:%s", com.huawei.openalliance.ad.utils.ds.a(str));
            f20257c.put(str, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(long j) {
        File file = new File(this.f20259b);
        if (!file.isDirectory() || file.getFreeSpace() > j) {
            return;
        }
        a("73");
    }

    private String b(String str) {
        String str2;
        synchronized (this) {
            str2 = f20257c.get(str);
        }
        return str2;
    }

    private boolean a(String str, String str2, long j) throws Throwable {
        String str3;
        int i;
        if (!e(str)) {
            hw.c("SourceFetcher", "downloadUrlToStream, checkSourceDataAndFileState failed");
            return false;
        }
        c(str);
        try {
            try {
                try {
                    Response<Boolean> responseA = this.f20258a.a(str, new a(str2, j));
                    hw.b("SourceFetcher", "httpCode: %s", Integer.valueOf(responseA.a()));
                    if (responseA.a() != 200) {
                        a("2", responseA.a(), responseA.d(), j);
                    }
                    this.d.a(responseA.m());
                    Boolean boolB = responseA.b();
                    boolean zBooleanValue = boolB != null ? boolB.booleanValue() : false;
                    hw.b("SourceFetcher", "file download result: %s", Boolean.valueOf(zBooleanValue));
                    if (!zBooleanValue) {
                        a((Integer) 0, "file download failed");
                    }
                    d(str);
                    a("72", j);
                    return zBooleanValue;
                } catch (IllegalArgumentException e) {
                    e = e;
                    str3 = "Error in download file - IllegalArgumentException:" + e.getClass().getSimpleName();
                    hw.c("SourceFetcher", str3);
                    i = 2;
                    a(i, str3);
                    hw.a(5, e);
                    d(str);
                    a("72", j);
                    return false;
                } catch (Exception e2) {
                    e = e2;
                    str3 = "Error in download file:" + e.getClass().getSimpleName();
                    hw.c("SourceFetcher", str3);
                    i = 2;
                    a(i, str3);
                    hw.a(5, e);
                    d(str);
                    a("72", j);
                    return false;
                }
            } catch (Throwable th) {
                th = th;
                d(str);
                a("72", j);
                throw th;
            }
        } catch (IllegalArgumentException e3) {
            e = e3;
        } catch (Exception e4) {
            e = e4;
        } catch (Throwable th2) {
            th = th2;
            d(str);
            a("72", j);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, long j) {
        a(str, 0, "", j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final String str, final int i, final String str2, final long j) {
        if (this.e != null) {
            final long jCurrentTimeMillis = System.currentTimeMillis();
            final sn snVar = this.d;
            com.huawei.openalliance.ad.utils.o.f(new Runnable() { // from class: com.huawei.openalliance.ad.sl.1
                @Override // java.lang.Runnable
                public void run() {
                    sl.this.e.a(snVar, str, j, jCurrentTimeMillis, i, str2);
                }
            });
        }
    }

    private void a(String str) {
        a(str, 0, "", 0L);
    }

    private void a(Integer num, String str) {
        sn snVar = this.d;
        if (snVar != null) {
            snVar.a(num);
            this.d.a(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream, File file) {
        com.huawei.openalliance.ad.utils.df.a(bufferedOutputStream);
        com.huawei.openalliance.ad.utils.df.a((Closeable) bufferedInputStream);
        com.huawei.openalliance.ad.utils.ai.a(file);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j) {
        File file = new File(this.f20259b);
        if (!file.isDirectory() || file.getFreeSpace() > j) {
            return;
        }
        if (hw.a()) {
            hw.a("SourceFetcher", "free disk space is: %d", Long.valueOf(file.getFreeSpace()));
        }
        com.huawei.openalliance.ad.utils.ai.a(file, j * 3);
    }

    class a implements lf<Boolean> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f20264b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f20265c;
        private long d;

        @Override // com.huawei.openalliance.ad.lj
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean a(int i, InputStream inputStream, long j, kw kwVar) throws Throwable {
            BufferedOutputStream bufferedOutputStream;
            IOException iOException;
            if (200 != i && 206 != i) {
                hw.c("SourceFetcher", "downloadfailed, http.response.code:" + i);
                sl.this.a("2", i, "error_http_code", this.f20265c);
                return false;
            }
            sl.this.b(j);
            if (sl.this.d.a()) {
                sl.this.a(j);
            }
            long jH = sl.this.d.h();
            if (j > jH) {
                hw.c("SourceFetcher", "fileSize is not under limit %s", String.valueOf(jH));
                sl.this.a("2", i, "fileSize_exceed_limit", this.f20265c);
                return false;
            }
            File file = new File(b());
            BufferedInputStream bufferedInputStream = null;
            try {
                BufferedInputStream bufferedInputStream2 = new BufferedInputStream(inputStream, 8192);
                try {
                    bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file), 8192);
                    try {
                        byte[] bArr = new byte[8192];
                        int i2 = 0;
                        while (true) {
                            int i3 = bufferedInputStream2.read(bArr);
                            if (i3 <= 0) {
                                this.d = System.currentTimeMillis();
                                bufferedOutputStream.flush();
                                sl.this.d.b(i2);
                                sl.this.d.b(Long.valueOf(System.currentTimeMillis()));
                                String strE = sl.this.d.e();
                                if (!sl.this.d.j() || com.huawei.openalliance.ad.utils.ai.a(strE, file)) {
                                    if (!com.huawei.openalliance.ad.utils.ai.a(sl.this.f, file, this.f20264b, sm.a(sl.this.d), sl.this.h)) {
                                        sl.this.a("2", i, "rename_file_fail", this.f20265c);
                                        sl.this.a(bufferedInputStream2, bufferedOutputStream, file);
                                        return false;
                                    }
                                    sl.this.a(bufferedInputStream2, bufferedOutputStream, file);
                                    return true;
                                }
                                sl.this.a("3", this.f20265c);
                                hw.c("SourceFetcher", "downloadUrlToStream error, downloaded file hashcode is not right");
                                com.huawei.openalliance.ad.utils.ai.a(file);
                                sl.this.a(bufferedInputStream2, bufferedOutputStream, file);
                                return false;
                            }
                            i2 += i3;
                            if (i2 > jH) {
                                sl.this.a("3", this.f20265c);
                                hw.c("SourceFetcher", "downloadUrlToStream error, downloaded size " + i2 + ", over the limit");
                                com.huawei.openalliance.ad.utils.ai.a(file);
                                sl.this.a(bufferedInputStream2, bufferedOutputStream, file);
                                return false;
                            }
                            bufferedOutputStream.write(bArr, 0, i3);
                        }
                    } catch (IOException e) {
                        iOException = e;
                        bufferedInputStream = bufferedInputStream2;
                        try {
                            hw.c("SourceFetcher", "download file encounters IOException, ex:" + iOException.getClass().getSimpleName());
                            sl.this.a("2", i, iOException.getClass().getSimpleName(), this.f20265c);
                            sl.this.a(bufferedInputStream, bufferedOutputStream, file);
                            return false;
                        } catch (Throwable th) {
                            th = th;
                            bufferedInputStream2 = bufferedInputStream;
                            bufferedInputStream = bufferedInputStream2;
                            sl.this.a(bufferedInputStream, bufferedOutputStream, file);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedInputStream = bufferedInputStream2;
                        sl.this.a(bufferedInputStream, bufferedOutputStream, file);
                        throw th;
                    }
                } catch (IOException e2) {
                    iOException = e2;
                    bufferedOutputStream = null;
                } catch (Throwable th3) {
                    th = th3;
                    bufferedOutputStream = null;
                }
            } catch (IOException e3) {
                iOException = e3;
                bufferedOutputStream = null;
            } catch (Throwable th4) {
                th = th4;
                bufferedOutputStream = null;
                sl.this.a(bufferedInputStream, bufferedOutputStream, file);
                throw th;
            }
        }

        @Override // com.huawei.openalliance.ad.lj
        public long a() {
            return this.d;
        }

        private String b() {
            StringBuilder sb;
            String strK;
            if (dn.i(this.f20264b)) {
                sb = new StringBuilder();
                sb.append(sl.this.f20259b);
                strK = dn.k(this.f20264b);
            } else {
                sb = new StringBuilder();
                strK = this.f20264b;
            }
            sb.append(strK);
            sb.append(".bak");
            return sb.toString();
        }

        a(String str, long j) {
            this.f20264b = str;
            this.f20265c = j;
        }
    }

    private so a(String str, boolean z) {
        so soVar = new so();
        String strC = dn.i(str) ? this.g.c(str) : str;
        if (com.huawei.openalliance.ad.utils.ai.c(this.f, strC, this.h)) {
            soVar.a(str);
            soVar.b(strC);
        }
        if (hw.a()) {
            hw.a("SourceFetcher", "filePath: %s, localFilePath: %s", com.huawei.openalliance.ad.utils.ds.a(str), com.huawei.openalliance.ad.utils.ds.a(strC));
        }
        soVar.a(z);
        return soVar;
    }

    private so a(String str, String str2) throws Throwable {
        hw.b("SourceFetcher", "download file from %s local", str2);
        if (dn.i(str)) {
            dn dnVarA = dk.a(this.f, str2);
            this.g = dnVarA;
            this.h = str2;
            sm.a(this.f, str, dnVarA, this.d, str2);
        } else {
            com.huawei.openalliance.ad.utils.ai.c(new File(str));
        }
        return a(str, false);
    }

    private so a(sn snVar) {
        String strH;
        StringBuilder sb;
        if (snVar == null) {
            hw.c("SourceFetcher", "downloadFile - data is null");
            return null;
        }
        String strI = snVar.i();
        if (TextUtils.isEmpty(strI)) {
            hw.b("SourceFetcher", "downloadFile - file url is null");
            a((Integer) 1, "downloadFile - file url is null");
            return null;
        }
        if (hw.a()) {
            hw.a("SourceFetcher", "download file: %s cacheType: %s", com.huawei.openalliance.ad.utils.ds.a(strI), this.h);
        }
        if (!snVar.m()) {
            strH = com.huawei.openalliance.ad.utils.ai.h(new File(this.f20259b + sm.a(strI)));
        } else if (this.d.s()) {
            strH = dn.d(strI) + com.huawei.openalliance.ad.utils.ai.e(strI);
        } else {
            strH = dn.d(strI);
        }
        if (!this.d.t() && com.huawei.openalliance.ad.utils.ai.c(this.f, strH, "normal")) {
            return a(strH, "normal");
        }
        if (!this.d.t() && com.huawei.openalliance.ad.utils.ai.c(this.f, strH, Constants.TPLATE_CACHE)) {
            return a(strH, Constants.TPLATE_CACHE);
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (a(strI, strH, jCurrentTimeMillis)) {
                hw.b("SourceFetcher", "download file from network");
                a("5", jCurrentTimeMillis);
                return a(strH, true);
            }
        } catch (RuntimeException e) {
            e = e;
            com.huawei.openalliance.ad.utils.ai.a(this.f, strH, this.h);
            sb = new StringBuilder("downloadFile RuntimeException:");
            sb.append(e.getClass().getSimpleName());
            String string = sb.toString();
            hw.c("SourceFetcher", string);
            a((Integer) 2, string);
        } catch (Exception e2) {
            e = e2;
            com.huawei.openalliance.ad.utils.ai.a(this.f, strH, this.h);
            sb = new StringBuilder("downloadFile Exception:");
            sb.append(e.getClass().getSimpleName());
            String string2 = sb.toString();
            hw.c("SourceFetcher", string2);
            a((Integer) 2, string2);
        }
        return null;
    }

    public sl(Context context, sn snVar) {
        this.h = "normal";
        if (!TextUtils.isEmpty(snVar.i())) {
            snVar.d(com.huawei.openalliance.ad.utils.bd.b(context, snVar.i()));
        }
        this.f20259b = (snVar.m() ? com.huawei.openalliance.ad.utils.dd.f(context) : com.huawei.openalliance.ad.utils.dd.c(context)) + File.separator + Constants.PPS_ROOT_PATH + File.separator;
        if (!com.huawei.openalliance.ad.utils.dg.b(snVar.d())) {
            this.f20259b += snVar.d() + File.separator;
        }
        File file = new File(this.f20259b);
        if (!file.exists() && !com.huawei.openalliance.ad.utils.ai.g(file)) {
            hw.c("SourceFetcher", "SourceFetcher mkdirs failed");
        }
        this.f20258a = (sk) new com.huawei.openalliance.ad.net.http.e.a(context).a(true).b(false).a(snVar.f()).b(snVar.g()).a().a(sk.class);
        this.d = snVar;
        if (snVar.r() != null) {
            this.g = dk.a(context, snVar.r());
            this.h = snVar.r();
        } else {
            snVar.e("normal");
            this.g = dk.a(context, "normal");
        }
        this.e = new com.huawei.openalliance.ad.analysis.h(context);
        this.f = context.getApplicationContext();
    }
}

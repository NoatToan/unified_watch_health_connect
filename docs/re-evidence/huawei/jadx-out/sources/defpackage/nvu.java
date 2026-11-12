package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.IoUtils;
import health.compact.a.KeyValDbManager;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;

/* JADX INFO: loaded from: classes11.dex */
public class nvu implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f43840a = false;
    private static String d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f43841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f43842c;
    private Context e;
    private boolean f;
    private boolean g;
    private long h;
    private Handler i;
    private boolean j;
    private String k;
    private String l;
    private String m;
    private String n;
    private String o;

    public nvu(Context context, Handler handler, boolean z, boolean z2, boolean z3) {
        this.e = context;
        this.i = handler;
        this.j = z;
        this.f = z2;
        this.g = z3;
    }

    public static void a(boolean z) {
        f43840a = z;
    }

    private void c(Context context, boolean z) {
        nun nunVar = new nun();
        nunVar.e(2);
        if (CommonUtil.bt()) {
            nunVar.d(CommonUtil.q());
        } else {
            nunVar.d(CommonUtil.k(context));
        }
        nunVar.e(d);
        if (this.f) {
            nunVar.b(nuw.c(nuw.d(), context));
        } else if (this.g) {
            nunVar.b(nuw.c(nuw.n(), context));
        } else {
            nunVar.b(nuw.c(nuw.h(), context));
        }
        nunVar.c("");
        new nvt(nunVar, z, this.g).d();
    }

    private long b() {
        if (this.m == null) {
            return 0L;
        }
        File file = new File(this.m);
        if (file.exists()) {
            return file.length();
        }
        return 0L;
    }

    private boolean d() {
        this.k = a().t();
        this.m = this.e.getFilesDir() + File.separator + this.k;
        this.f43842c = a().b();
        this.n = a().v();
        this.o = a().h();
        this.l = a().r();
        d = a().w();
        this.h = b();
        KeyValDbManager keyValDbManagerD = KeyValDbManager.d(this.e);
        String strC = keyValDbManagerD.c("health_ota_file_md5");
        String strC2 = keyValDbManagerD.c("health_ota_file_sha256");
        String strC3 = keyValDbManagerD.c("health_ota_file_path");
        if (!TextUtils.isEmpty(this.l) && !TextUtils.equals(strC2, this.l)) {
            LogUtil.a("DownloadThread", "initDownload check sha256.");
            c(keyValDbManagerD, "health_ota_file_md5", "health_ota_file_sha256", "health_ota_file_path");
        } else if (!TextUtils.equals(strC, this.o) || !TextUtils.equals(strC3, this.m) || this.h > this.f43842c) {
            LogUtil.a("DownloadThread", "initDownload check md5.");
            c(keyValDbManagerD, "health_ota_file_md5", "health_ota_file_sha256", "health_ota_file_path");
        } else {
            LogUtil.j("DownloadThread", "initDownload do nothing.");
        }
        String strJ = a().j();
        this.f43841b = strJ;
        LogUtil.a("DownloadThread", "initDownload mDownloadedSize=", Long.valueOf(this.h), ",mDownloadUrl=", strJ, ",mIsApp:", Boolean.valueOf(this.j), ",mIsAw70:", Boolean.valueOf(this.f));
        if (this.f43841b != null) {
            return true;
        }
        LogUtil.j("R_OTA_DownloadThread", "initDownload mDownloadUrl is null");
        d(2);
        LogUtil.d("DownloadThread", "initDownload the download uri is null, set the state to DOWNLOADING_STATE_END");
        return false;
    }

    private void c(KeyValDbManager keyValDbManager, String str, String str2, String str3) {
        nuw.c(this.m);
        this.h = 0L;
        keyValDbManager.b(str, this.o);
        keyValDbManager.b(str2, this.l);
        keyValDbManager.b(str3, this.m);
    }

    private num a() {
        if (this.j) {
            return nuw.b();
        }
        if (this.f) {
            return nuw.c();
        }
        if (this.g) {
            return nuw.o();
        }
        return nuw.a();
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 2311. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // java.lang.Runnable
    public void run() {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nvu.run():void");
    }

    private void e(Exception exc) {
        if (exc instanceof RuntimeException) {
            LogUtil.e("R_OTA_DownloadThread", "run(), RuntimeException");
            LogUtil.e("DownloadThread", "RuntimeException Exception, set the state to DOWNLOADING_STATE_END");
        } else {
            LogUtil.e("R_OTA_DownloadThread", "run(), Exception");
            LogUtil.e("DownloadThread", "Unknown Exception, set the state to DOWNLOADING_STATE_END");
        }
        d(6);
    }

    private void at_(InputStream inputStream, HttpGet httpGet, OutputStream outputStream, nui nuiVar) {
        long j;
        boolean z;
        long j2 = this.f43842c;
        long j3 = this.h;
        LogUtil.a("DownloadThread", "fileTotalSize = ", Long.valueOf(j2), ", currentDownloadSize = ", Long.valueOf(j3));
        byte[] bArr = new byte[8192];
        int i = 0;
        while (true) {
            int iL = nuw.l();
            int iC = c(inputStream, bArr);
            if (iC == -1) {
                LogUtil.a("R_OTA_DownloadThread", "download cancel");
                c(iL, nuw.a(this.e));
                httpGet.abort();
            } else {
                if (f43840a) {
                    LogUtil.a("R_OTA_DownloadThread", "download cancel");
                    httpGet.abort();
                } else {
                    nuw.a(0);
                    int iE = e(outputStream, iC, bArr);
                    if (iE == -1) {
                        httpGet.abort();
                        d(5);
                    } else {
                        j3 += (long) iE;
                        if (j3 < j2) {
                            if (i % 20 == 0) {
                                nuiVar.a(j3);
                                a(nuiVar, 7);
                            }
                            i++;
                        } else {
                            h();
                            httpGet.abort();
                            nuiVar.a(j3);
                            a(nuiVar, 7);
                        }
                    }
                }
                j = j3;
                z = false;
                e(z, nuiVar, j2, j);
                return;
            }
            j = j3;
            z = true;
            e(z, nuiVar, j2, j);
            return;
        }
    }

    private void h() {
        LogUtil.a("R_OTA_DownloadThread", "download complete");
        nuw.d(1);
        nuw.d(false);
        LogUtil.a("DownloadThread", "download complete, set the state to DOWNLOADING_STATE_END");
    }

    private int c(InputStream inputStream, byte[] bArr) {
        try {
            return inputStream.read(bArr);
        } catch (IOException unused) {
            LogUtil.e("R_OTA_DownloadThread", "download failed InputStream error:IOException");
            return -1;
        }
    }

    private int e(OutputStream outputStream, int i, byte[] bArr) {
        if (bArr == null || i < 0 || i > bArr.length) {
            LogUtil.e("R_OTA_DownloadThread", "download failed OutputStream error: IndexOutOfBounds");
            return -1;
        }
        if (outputStream != null) {
            try {
                outputStream.write(bArr, 0, i);
                outputStream.flush();
                return i;
            } catch (IOException unused) {
                LogUtil.e("R_OTA_DownloadThread", "download failed OutputStream error: IOException");
            }
        }
        return -1;
    }

    private void e(boolean z, nui nuiVar, long j, long j2) {
        if (f43840a) {
            d(9);
            LogUtil.a("DownloadThread", "cancel download, set the state to DOWNLOADING_STATE_END");
        } else if (!z) {
            e(nuiVar, j, j2);
        }
        LogUtil.a("DownloadThread", "download end");
    }

    private void e(nui nuiVar, long j, long j2) {
        if (j2 >= j) {
            c(nuiVar);
        } else {
            LogUtil.a("DownloadThread", "currentDownloadSize < fileTotalSize");
            nuw.c(this.m);
            nuw.c(6, this.j, this.f, this.g);
            a(null, 6);
        }
        nuw.d(false);
        nuw.d(1);
    }

    private void c(nui nuiVar) {
        String str;
        if (this.j) {
            nuiVar.b(this.n);
            nuiVar.c(this.m);
            a(nuiVar, 8);
            c(this.e, this.j);
            return;
        }
        if (this.f) {
            str = this.e.getFilesDir() + File.separator + nuw.d() + "(new).apk";
        } else if (this.g) {
            str = this.e.getFilesDir() + File.separator + nuw.n() + "(new).zip";
        } else {
            str = this.e.getFilesDir() + File.separator + nuw.h() + "(new).apk";
        }
        LogUtil.a("DownloadThread", "newAppDir : ", str, ";HwSelfUpdateUtility.applicationInfo.STORAGEPATH :", this.m);
        if (g()) {
            String str2 = this.m;
            if (str2 != null) {
                nuiVar.c(str2);
                nuiVar.e(this.o);
                nuiVar.a(this.l);
                nuiVar.b(this.n);
                LogUtil.a("R_OTA_DownloadThread", "download complete and verify success");
                a(nuiVar, 8);
                c(this.e, this.j);
                return;
            }
            e(nuiVar);
            return;
        }
        e(nuiVar);
    }

    private void as_(InputStream inputStream, OutputStream outputStream, HttpClient httpClient) {
        LogUtil.d("DownloadThread", "enter closeHttp");
        if (httpClient != null) {
            LogUtil.d("DownloadThread", "httpClient close");
            httpClient.getConnectionManager().shutdown();
        }
        IoUtils.c(outputStream);
        IoUtils.c(inputStream);
    }

    private void e(nui nuiVar) {
        LogUtil.a("R_OTA_DownloadThread", "verify sha256 or md5 failed");
        nuw.c(this.m);
        nuw.c(1, this.j, this.f, this.g);
        a(nuiVar, 1);
    }

    private void d(int i) {
        nuw.c(i, this.j, this.f, this.g);
        LogUtil.a("DownloadThread", "downloadEnd what = ", Integer.valueOf(i));
        if (i != 3 && i != 9) {
            nuw.c(this.m);
        }
        nuw.d(1);
        nuw.d(false);
        a(null, i);
    }

    private void c(int i, boolean z) {
        LogUtil.a("R_OTA_DownloadThread", z ? "download cancel, network is connect but not avaiable," : "download cancel, network is not available,");
        if (i < 3) {
            LogUtil.a("R_OTA_DownloadThread", z ? "download cancel, network is connect but not avaiable," : "download cancel, network is not available,", " set the state to DOWNLOADING_STATE_RETRY");
            nuw.d(3);
            nuw.d(false);
        } else {
            LogUtil.a("R_OTA_DownloadThread", z ? "download cancel, network is connect but not avaiable," : "download cancel, network is not available,", " set the state to DOWNLOADING_STATE_END");
            nuw.d(1);
            nuw.d(false);
            nuw.c(3, this.j, this.f, this.g);
            a(null, 3);
        }
    }

    private HttpGet av_(HttpClient httpClient) {
        try {
            HttpGet httpGet = new HttpGet(this.f43841b);
            nuw.aq_(httpGet, httpClient, this.e);
            httpGet.getParams().setIntParameter("http.socket.timeout", 10000);
            httpGet.getParams().setIntParameter("http.connection.timeout", 20000);
            httpGet.getParams().setIntParameter("http.socket.buffer-size", 8192);
            return httpGet;
        } catch (IllegalArgumentException unused) {
            LogUtil.e("R_OTA_DownloadThread", "download failed, IllegalArgumentException");
            nuw.c(this.m);
            nuw.d(1);
            nuw.d(false);
            nuw.c(2, this.j, this.f, this.g);
            a(null, 2);
            return null;
        }
    }

    private void au_(HttpGet httpGet, HttpClient httpClient, int i) {
        if (i < 3) {
            LogUtil.a("R_OTA_DownloadThread", "connect failed, set the state to DOWNLOADING_STATE_RETRY");
            nuw.d(3);
            nuw.d(false);
        } else {
            LogUtil.a("R_OTA_DownloadThread", "connect failed, set the state to DOWNLOADING_STATE_END and sendMessage DOWNLOAD_FAILED_CONNECT_ERROR");
            d(3);
        }
        httpGet.abort();
        httpClient.getConnectionManager().shutdown();
    }

    private void a(Object obj, int i) {
        if (this.i != null) {
            Message messageObtain = Message.obtain();
            messageObtain.obj = obj;
            messageObtain.what = i;
            this.i.sendMessage(messageObtain);
        }
    }

    private boolean g() {
        if (!TextUtils.isEmpty(this.l)) {
            return j();
        }
        return e();
    }

    private boolean j() throws Throwable {
        String strK = CommonUtil.k(this.m);
        if (!TextUtils.isEmpty(this.l) && this.l.equalsIgnoreCase(strK)) {
            LogUtil.a("R_OTA_DownloadThread", "isSha256Valid verify sha256 success.");
            return true;
        }
        LogUtil.j("R_OTA_DownloadThread", "isSha256Valid verify sha256 failed.");
        return false;
    }

    private boolean e() throws Throwable {
        String strE = nuv.e(this.m);
        if (!TextUtils.isEmpty(this.o) && this.o.equalsIgnoreCase(strE)) {
            LogUtil.a("R_OTA_DownloadThread", "isMd5Valid verify md5 success.");
            return true;
        }
        LogUtil.j("R_OTA_DownloadThread", "isMd5Valid verify md5 failed.");
        return false;
    }

    public void c() {
        Thread thread = new Thread(this);
        thread.setName("Ver-Download");
        thread.start();
    }
}

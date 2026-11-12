package defpackage;

import android.os.Message;
import android.text.TextUtils;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hms.framework.network.restclient.Response;
import com.huawei.hms.framework.network.restclient.RestClientGlobalInstance;
import com.huawei.hms.framework.network.restclient.hwhttp.HttpClient;
import com.huawei.hms.framework.network.restclient.hwhttp.ResponseBody;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwversionmgr.utils.handler.AppDownloadHandler;
import com.huawei.networkclient.CommonApi;
import com.huawei.openalliance.ad.constant.Constants;
import health.compact.a.CommonUtil;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.IllegalBlockingModeException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class lsf implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Map<String, Boolean> f40754c = new HashMap(16);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f40755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AppDownloadHandler f40756b;
    private int d;
    private String e;
    private int f;
    private String g;
    private final String h;
    private String i;
    private boolean j;
    private String l;
    private int m;
    private String n;

    public lsf(b bVar) {
        this.h = bVar.i;
        this.i = bVar.f40758b;
        this.e = bVar.f40759c;
        this.g = bVar.f40757a;
        this.f40756b = bVar.d;
        this.l = bVar.f;
        this.n = bVar.g;
        this.j = bVar.e;
        this.m = bVar.j;
    }

    public static void c(String str, boolean z) {
        f40754c.put(str, Boolean.valueOf(z));
        int size = f40754c.size();
        LogUtil.a("HwOtaDownloadRunnable", "setCancel value:", Integer.valueOf(size), " mac ", CommonUtil.n(str), " isCancel ", Boolean.valueOf(z));
    }

    @Override // java.lang.Runnable
    public void run() {
        LogUtil.a("HwOtaDownloadRunnable", "run enter");
        if (d()) {
            return;
        }
        b();
    }

    private boolean d() {
        if (this.e == null || this.g == null || this.f40756b == null) {
            LogUtil.j("HwOtaDownloadRunnable", "mDownLoadUrl or mFilePath or mDownloadListener is null");
            return true;
        }
        if (CommonUtil.ap() && TextUtils.equals(nvd.m(BaseApplication.getContext()), "true")) {
            try {
                String canonicalPath = new File(this.g).getCanonicalPath();
                List<String> listN = nvd.n(BaseApplication.getContext());
                if (listN.size() >= 2 && !listN.contains(canonicalPath)) {
                    String str = listN.get(0);
                    File file = new File(str);
                    if (file.exists()) {
                        file.delete();
                    }
                    listN.remove(0);
                    nvd.e(listN, BaseApplication.getContext());
                    LogUtil.a("HwOtaDownloadRunnable", "initDownload delete LoopUpgradePackagePaths path = ", str, "startToDownload, path = ", canonicalPath);
                }
            } catch (IOException unused) {
                LogUtil.j("HwOtaDownloadRunnable", "initDownload IOException");
            }
        }
        File file2 = new File(this.g);
        if (file2.exists()) {
            if (this.j) {
                long length = file2.length();
                this.f40755a = length;
                LogUtil.a("HwOtaDownloadRunnable", "resume mDownloadedSize :", Long.valueOf(length));
            } else {
                LogUtil.a("HwOtaDownloadRunnable", "not resume isDelete :", Boolean.valueOf(file2.delete()));
                this.f40755a = 0L;
            }
        }
        return false;
    }

    private void c(Object obj, int i) {
        if (this.f40756b != null) {
            Message messageObtain = Message.obtain();
            messageObtain.obj = obj;
            messageObtain.what = i;
            this.f40756b.sendMessage(messageObtain);
        }
    }

    private void b() {
        try {
            try {
                try {
                    nui nuiVar = new nui();
                    num numVarE = nuw.e(this.i);
                    if (numVarE != null) {
                        nuiVar.b(numVarE.b());
                    }
                    HashMap map = new HashMap(16);
                    if (this.j && this.f40755a > 0) {
                        map.put("Range", "bytes=" + this.f40755a + Constants.LINK);
                    }
                    Response<ResponseBody> responseExecute = ((CommonApi) oet.c(a()).e(CommonApi.class)).commonDownload(this.e, map).execute();
                    int code = responseExecute.getCode();
                    LogUtil.a("HwOtaDownloadRunnable", "download getResponseCode:", Integer.valueOf(code));
                    if (d(code, nuiVar)) {
                        e(null);
                        return;
                    }
                    ResponseBody body = responseExecute.getBody();
                    if (body != null && body.getInputStream() != null) {
                        long contentLength = body.getContentLength();
                        InputStream inputStream = body.getInputStream();
                        if (b(code, contentLength)) {
                            e(inputStream);
                            return;
                        } else {
                            d(contentLength, inputStream, nuiVar);
                            e(inputStream);
                            return;
                        }
                    }
                    LogUtil.d("HwOtaDownloadRunnable", "downloadFile responseBody or responseBody.getInputStream() is null");
                    e(null);
                } catch (IllegalStateException e) {
                    LogUtil.e("HwOtaDownloadRunnable", "downloadFile IllegalStateException", ExceptionUtils.c(e));
                    a(1003);
                    e(null);
                }
            } catch (IOException e2) {
                LogUtil.e("HwOtaDownloadRunnable", "downloadFile IOException ", ExceptionUtils.c(e2));
                a(1003);
                e(null);
            }
        } catch (Throwable th) {
            e(null);
            throw th;
        }
    }

    private static HttpClient a() {
        RestClientGlobalInstance.getInstance().init(BaseApplication.getContext());
        return new HttpClient.Builder().connectTimeout(5000).readTimeout(5000).build();
    }

    private boolean b(int i, long j) {
        LogUtil.a("HwOtaDownloadRunnable", "checkResult responseCode", Integer.valueOf(i));
        if (i != 200 && i != 206) {
            LogUtil.j("HwOtaDownloadRunnable", "responseCode is :", Integer.valueOf(i));
            c((Object) null, 2);
            return true;
        }
        if (j != 0) {
            return false;
        }
        LogUtil.j("HwOtaDownloadRunnable", "run file length is 0");
        c((Object) null, 2);
        return true;
    }

    private boolean d(int i, nui nuiVar) {
        if (i != 416) {
            return false;
        }
        if (h()) {
            d(nuiVar);
            LogUtil.a("HwOtaDownloadRunnable", "checkResponseCode onComplete");
            return true;
        }
        c();
        c((Object) null, 2);
        LogUtil.j("HwOtaDownloadRunnable", "checkResponseCode onFailure");
        return true;
    }

    private boolean h() {
        if (!TextUtils.isEmpty(this.l)) {
            return i();
        }
        return f();
    }

    private boolean i() throws Throwable {
        String strK = CommonUtil.k(this.g);
        if (!TextUtils.isEmpty(this.l) && this.l.equalsIgnoreCase(strK)) {
            LogUtil.a("HwOtaDownloadRunnable", "isSha256Valid verify sha256 success.");
            return true;
        }
        LogUtil.j("HwOtaDownloadRunnable", "isSha256Valid verify sha256 failed.");
        return false;
    }

    private boolean f() throws Throwable {
        String strE = nuv.e(this.g);
        if (!TextUtils.isEmpty(this.n) && this.n.equalsIgnoreCase(strE)) {
            LogUtil.a("HwOtaDownloadRunnable", "isMd5Valid verify md5 success.");
            return true;
        }
        LogUtil.j("HwOtaDownloadRunnable", "isMd5Valid verify md5 failed.");
        return false;
    }

    private boolean g() {
        if (f40754c.containsKey(this.h)) {
            return f40754c.get(this.h).booleanValue();
        }
        return false;
    }

    private void d(nui nuiVar) {
        nuiVar.c(this.g);
        nuiVar.e(this.n);
        nuiVar.a(this.l);
        num numVarE = nuw.e(this.i);
        if (numVarE != null) {
            nuiVar.b(numVarE.v());
        }
        c(nuiVar, 8);
    }

    private void d(long j, InputStream inputStream, nui nuiVar) throws Throwable {
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2;
        char c2 = 0;
        Object obj = null;
        try {
            randomAccessFile2 = new RandomAccessFile(new File(this.g), "rw");
            try {
                long length = randomAccessFile2.length();
                LogUtil.a("HwOtaDownloadRunnable", "initial size ", Long.valueOf(length), " length ", Long.valueOf(j), "sManageMac ", CommonUtil.n(this.h), " sCancelList.size() ", Integer.valueOf(f40754c.size()));
                byte[] bArr = new byte[8192];
                while (!g()) {
                    int i = inputStream.read(bArr);
                    if (i <= 0) {
                        b(nuiVar);
                    } else {
                        length += (long) i;
                        int i2 = (int) ((length / (j + this.f40755a)) * 100.0f);
                        if (i2 - this.d >= 1 || i2 > 99) {
                            if (i2 > 99) {
                                i2 = 100;
                            }
                            this.d = i2;
                            nuiVar.a(i2);
                            c(nuiVar, 7);
                        }
                        randomAccessFile2.seek(randomAccessFile2.length());
                        if (d(randomAccessFile2, bArr, i)) {
                            if (this.f != 0) {
                                this.f = 0;
                            }
                            c2 = 0;
                            obj = null;
                        }
                    }
                    a(randomAccessFile2);
                }
                String strN = CommonUtil.n(this.h);
                Object[] objArr = new Object[2];
                objArr[c2] = "need cancel sManageMac ";
                objArr[1] = strN;
                LogUtil.a("HwOtaDownloadRunnable", objArr);
                c(obj, 9);
                a(randomAccessFile2);
            } catch (IOException e) {
                e = e;
                randomAccessFile = randomAccessFile2;
                try {
                    LogUtil.e("HwOtaDownloadRunnable", "determineTheDownloadUrlType IOException", ExceptionUtils.c(e));
                    a(1003);
                    a(randomAccessFile);
                } catch (Throwable th) {
                    th = th;
                    randomAccessFile2 = randomAccessFile;
                    a(randomAccessFile2);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                a(randomAccessFile2);
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            randomAccessFile = null;
        } catch (Throwable th3) {
            th = th3;
            randomAccessFile = null;
            randomAccessFile2 = randomAccessFile;
            a(randomAccessFile2);
            throw th;
        }
    }

    private boolean d(RandomAccessFile randomAccessFile, byte[] bArr, int i) {
        try {
            randomAccessFile.write(bArr, 0, i);
            return true;
        } catch (IOException e) {
            LogUtil.e("HwOtaDownloadRunnable", "writeDownloadFile IOException", ExceptionUtils.c(e));
            a(1004);
            return false;
        }
    }

    private void a(RandomAccessFile randomAccessFile) {
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (IOException e) {
                LogUtil.e("HwOtaDownloadRunnable", "closeFile IOException", ExceptionUtils.c(e));
            }
        }
    }

    private void b(nui nuiVar) {
        if (h()) {
            d(nuiVar);
            LogUtil.a("HwOtaDownloadRunnable", "checkResponseCode onComplete");
        } else {
            a(1006);
            LogUtil.j("HwOtaDownloadRunnable", "checkResponseCode onFailure");
        }
    }

    private void e(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
                LogUtil.e("HwOtaDownloadRunnable", "closeStream: IOException");
                return;
            } catch (IllegalBlockingModeException unused2) {
                LogUtil.e("HwOtaDownloadRunnable", "closeStream IllegalBlockingModeException");
                return;
            }
        }
        LogUtil.a("HwOtaDownloadRunnable", "closeStream");
    }

    private void a(int i) {
        LogUtil.a("HwOtaDownloadRunnable", "handleFailed :", Integer.valueOf(i));
        if (i == 1006) {
            c();
            c((Object) null, 1);
            return;
        }
        if (i == 1004) {
            c((Object) null, 5);
            return;
        }
        int i2 = this.f;
        if (i2 < this.m) {
            LogUtil.a("HwOtaDownloadRunnable", "handleFailed,retryNum:", Integer.valueOf(i2));
            e();
            return;
        }
        if (this.f40756b != null) {
            if (i == 1003) {
                c((Object) null, 3);
            } else {
                c((Object) null, 6);
            }
        }
        this.f = 0;
    }

    private void e() {
        this.f++;
        this.d = 0;
        File file = new File(this.g);
        if (file.exists()) {
            if (this.j) {
                long length = file.length();
                this.f40755a = length;
                LogUtil.a("HwOtaDownloadRunnable", "downloadRetry, resume mDownloadedSize :", Long.valueOf(length));
            } else {
                LogUtil.a("HwOtaDownloadRunnable", "downloadRetry, not resume isDelete :", Boolean.valueOf(file.delete()));
                this.f40755a = 0L;
            }
        }
        j();
        b();
    }

    private void c() {
        File file = new File(this.g);
        if (file.exists()) {
            LogUtil.a("HwOtaDownloadRunnable", "handleVerifyFailed file.delete() ", Boolean.valueOf(file.delete()));
        }
    }

    private void j() {
        try {
            LogUtil.a("HwOtaDownloadRunnable", "startWait");
            Thread.sleep(500L);
        } catch (InterruptedException unused) {
            LogUtil.e("HwOtaDownloadRunnable", "startWait InterruptedException");
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f40757a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f40758b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f40759c;
        private AppDownloadHandler d;
        private boolean e;
        private String f;
        private String g;
        private String i;
        private int j;

        public b(String str, String str2, String str3, String str4, AppDownloadHandler appDownloadHandler) {
            this.i = str;
            this.f40758b = str2;
            this.f40759c = str3;
            this.f40757a = str4;
            this.d = appDownloadHandler;
        }

        public b e(String str) {
            this.f = str;
            return this;
        }

        public b c(String str) {
            this.g = str;
            return this;
        }

        public b a(boolean z) {
            this.e = z;
            return this;
        }

        public b d(int i) {
            this.j = i;
            return this;
        }
    }
}

package com.huawei.android.hicloud.sync.update;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Environment;
import android.os.Handler;
import android.os.StatFs;
import android.text.TextUtils;
import com.huawei.android.hicloud.sync.util.FileUtil;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.updatesdk.UpdateSdkAPI;
import com.huawei.updatesdk.fileprovider.UpdateSdkFileProvider;
import com.huawei.updatesdk.service.appmgr.bean.ApkUpgradeInfo;
import defpackage.bbw;
import defpackage.bcw;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: classes23.dex */
public final class UpdateManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static UpdateManager f5109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private UpdateCheckCallback f5110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f5111c;
    private ApkUpgradeInfo d;
    private boolean e;
    private String[] f = {"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"};
    private List<Handler> g;
    private Context i;

    public interface UpdateCheckCallback {
        void onCheckHiCloudResult(int i);
    }

    class a extends Thread {
        public a() {
            super.setName("download_thread");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            UpdateManager updateManager = UpdateManager.this;
            updateManager.e(updateManager.d, false);
        }
    }

    class c implements Thread.UncaughtExceptionHandler {
        c() {
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            bcw.d("UpdateManager", "Exception =" + th.getMessage());
        }
    }

    class d extends TimerTask {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f5113c;

        d(String str) {
            this.f5113c = str;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            bcw.c("UpdateManager", "Timer.downloadApkData deleteFile = " + UpdateManager.d(this.f5113c));
        }
    }

    private UpdateManager() {
    }

    private boolean a(String str) {
        if (TextUtils.isEmpty(str) || this.i == null) {
            return false;
        }
        File file = new File(str);
        if (!file.exists()) {
            bcw.d("UpdateManager", "hicloud apk file not exist");
            return false;
        }
        try {
            Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL);
            intent.addFlags(3);
            intent.setDataAndType(UpdateSdkFileProvider.getUriForFile(this.i, this.i.getPackageName() + ".fileprovider", file), "application/vnd.android.package-archive");
            intent.addFlags(268435456);
            this.i.startActivity(intent);
            return true;
        } catch (Exception unused) {
            bcw.d("UpdateManager", "installApk: Exception");
            return true;
        }
    }

    private boolean a(String str, String str2) throws Throwable {
        String fileHashData = FileUtil.getFileHashData(str2, "SHA-256");
        return fileHashData != null && fileHashData.equalsIgnoreCase(str);
    }

    private static long b(String str) {
        StatFs statFs = new StatFs(str);
        return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
    }

    public static UpdateManager b() {
        if (f5109a == null) {
            f5109a = new UpdateManager();
        }
        return f5109a;
    }

    private void b(ApkUpgradeInfo apkUpgradeInfo, BufferedOutputStream bufferedOutputStream, BufferedInputStream bufferedInputStream, String str, boolean z) throws IOException {
        synchronized (this) {
            byte[] bArr = new byte[32768];
            long jCurrentTimeMillis = System.currentTimeMillis();
            int i = 0;
            while (!this.e) {
                int i2 = bufferedInputStream.read(bArr);
                i += i2;
                int i3 = this.f5111c;
                int i4 = (int) ((i / i3) * 100.0f);
                if (i2 < 0) {
                    if (i3 != i + 1) {
                        bcw.a("UpdateManager", "fileLength = " + this.f5111c);
                        d(6);
                        b(10);
                        break;
                    }
                    bufferedOutputStream.flush();
                    if (!c(apkUpgradeInfo.getName_(), apkUpgradeInfo.getSha256_(), z)) {
                        bcw.c("UpdateManager", "isUpdateFileExist false");
                        d(6);
                        b(10);
                        break;
                    } else {
                        c(5, 0, 0, str);
                        b(6);
                        a(str);
                        new Timer().schedule(new d(str), 300000L);
                        break;
                    }
                }
                HashMap map = new HashMap();
                map.put("DOWNLOADED_SIZE", String.valueOf(i));
                map.put("TOTAL_SIZE", String.valueOf(this.f5111c));
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                if (jCurrentTimeMillis2 - jCurrentTimeMillis > 500) {
                    c(4, i4, 0, map);
                    jCurrentTimeMillis = jCurrentTimeMillis2;
                }
                bufferedOutputStream.write(bArr, 0, i2);
                if (this.e) {
                    c(apkUpgradeInfo.getName_());
                }
            }
        }
    }

    private String c(String str, boolean z) {
        if (!z) {
            if (this.i == null) {
                return null;
            }
            return this.i.getFilesDir() + File.separator + str;
        }
        File file = new File(Environment.getExternalStorageDirectory().getPath() + "/SyncSDK/");
        if (!file.exists() && !file.mkdirs()) {
            return null;
        }
        return Environment.getExternalStorageDirectory().getPath() + "/SyncSDK/" + str;
    }

    private void c(String str) {
        if (str == null || this.i == null) {
            return;
        }
        File file = new File(this.i.getFilesDir() + File.separator + str);
        if (file.exists()) {
            bcw.c("UpdateManager", "removeErrorFile fileMem delete:" + file.delete());
        }
        File file2 = new File(Environment.getExternalStorageDirectory().getPath() + "/SyncSDK/" + str);
        if (file2.exists()) {
            bcw.c("UpdateManager", "removeErrorFile fileSD delete:" + file2.delete());
        }
    }

    private boolean c(String str, String str2, boolean z) {
        bcw.a("UpdateManager", "check update apk whether exist.");
        if (z) {
            String str3 = Environment.getExternalStorageDirectory().getPath() + "/SyncSDK/" + str;
            if (new File(str3).exists() && a(str2, str3)) {
                return true;
            }
            c(str);
            return false;
        }
        if (this.i == null) {
            return false;
        }
        String str4 = this.i.getFilesDir() + File.separator + str;
        if (new File(str4).exists() && a(str2, str4)) {
            return true;
        }
        c(str);
        return false;
    }

    private boolean c(boolean z, boolean z2, boolean z3) {
        if (this.f5111c == 0) {
            bcw.c("UpdateManager", "0 == fileLength");
            d(6);
            b(10);
            return false;
        }
        if (z && !z2) {
            if (this.i == null) {
                return false;
            }
            if (b(this.i.getFilesDir() + File.separator) < this.f5111c) {
                e(this.d, true);
                return false;
            }
        }
        if (!z3 || b(Environment.getExternalStorageDirectory().getPath()) >= this.f5111c) {
            return true;
        }
        d(6);
        b(8);
        return false;
    }

    private void d(int i) {
        List<Handler> list = this.g;
        if (list != null) {
            for (Handler handler : list) {
                handler.sendMessage(handler.obtainMessage(i));
            }
        }
    }

    private void d(BufferedOutputStream bufferedOutputStream, BufferedInputStream bufferedInputStream) {
        if (bufferedInputStream != null) {
            try {
                bufferedInputStream.close();
            } catch (IOException e) {
                bcw.d("UpdateManager", "IOException e = " + e.getMessage());
            }
        }
        if (bufferedOutputStream != null) {
            try {
                bufferedOutputStream.close();
            } catch (IOException e2) {
                bcw.d("UpdateManager", "IOException e = " + e2.getMessage());
            }
        }
    }

    private boolean d(Context context, String str) {
        if (context == null) {
            bcw.e("UpdateManager", "hasPermission: mContexts is null");
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            return packageManager.checkPermission(str, context.getPackageName()) == 0;
        }
        bcw.e("UpdateManager", "hasPermission: pm is null");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean d(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        File file = new File(str);
        if (file.exists()) {
            return file.delete();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [com.huawei.android.hicloud.sync.update.UpdateManager] */
    /* JADX WARN: Type inference failed for: r14v24, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.io.BufferedOutputStream] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.io.BufferedOutputStream] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.io.BufferedOutputStream] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.StringBuilder] */
    public void e(ApkUpgradeInfo apkUpgradeInfo, boolean z) {
        BufferedInputStream bufferedInputStream;
        ?? r2;
        ?? r3;
        ?? r4;
        synchronized (this) {
            if (z) {
                if (!d(this.i, this.f[0]) || !d(this.i, this.f[1])) {
                    bcw.c("UpdateManager", "download not has permission");
                    d(6);
                    b(9);
                    return;
                }
            }
            boolean zEquals = Environment.getExternalStorageState().equals("mounted");
            boolean z2 = zEquals && z;
            ?? downurl_ = apkUpgradeInfo.getDownurl_();
            bcw.c("UpdateManager", "download hasSDCard = " + zEquals + ", isUseSD = " + z);
            ?? sb = new StringBuilder("download downloadApkURL = ");
            sb.append(downurl_);
            bcw.a("UpdateManager", sb.toString());
            String name_ = apkUpgradeInfo.getName_();
            if (!name_.endsWith(".apk")) {
                apkUpgradeInfo.setName_(name_ + ".apk");
            }
            BufferedInputStream bufferedInputStream2 = null;
             = 0;
            bufferedInputStream2 = null;
            bufferedInputStream2 = null;
            ?? r5 = 0;
            try {
                try {
                    String strC = c(apkUpgradeInfo.getName_(), z2);
                    if (strC == null) {
                        bcw.c("UpdateManager", "download localfile = null");
                        d(6);
                        b(10);
                        d(null, null);
                        e();
                        return;
                    }
                    d(strC);
                    File file = new File(strC);
                    HttpsURLConnection httpsURLConnection = (HttpsURLConnection) new URL(downurl_).openConnection();
                    bbw.d(this.i, httpsURLConnection);
                    httpsURLConnection.setDoInput(true);
                    httpsURLConnection.setRequestProperty("Range", "bytes=0-");
                    int responseCode = httpsURLConnection.getResponseCode();
                    if (200 != responseCode && 206 != responseCode) {
                        if (!downurl_.startsWith("http:")) {
                            bcw.a("UpdateManager", "downloadApkURL = " + downurl_);
                            d(6);
                            b(10);
                            d(null, null);
                            e();
                            return;
                        }
                        httpsURLConnection = (HttpsURLConnection) new URL(downurl_.replaceFirst("http:", "https:")).openConnection();
                        bbw.d(this.i, httpsURLConnection);
                        httpsURLConnection.setDoInput(true);
                        httpsURLConnection.setRequestProperty("Range", "bytes=0-");
                        int responseCode2 = httpsURLConnection.getResponseCode();
                        if (200 != responseCode2 && 206 != responseCode2) {
                            bcw.a("UpdateManager", "responseCode = " + responseCode2);
                            d(6);
                            b(10);
                            d(null, null);
                            e();
                            return;
                        }
                    }
                    this.f5111c = Integer.parseInt(httpsURLConnection.getHeaderField("Content-Length"));
                    if (!c(zEquals, z, z2)) {
                        d(null, null);
                        e();
                        return;
                    }
                    bufferedInputStream = new BufferedInputStream(httpsURLConnection.getInputStream());
                    try {
                        downurl_ = new BufferedOutputStream(new FileOutputStream(file, true), 131072);
                        try {
                            b(apkUpgradeInfo, downurl_, bufferedInputStream, strC, z2);
                            r4 = downurl_;
                        } catch (IOException e) {
                            e = e;
                            bufferedInputStream2 = bufferedInputStream;
                            r3 = downurl_;
                            bcw.d("UpdateManager", "IOException e = " + e.getMessage());
                            d(6);
                            b(10);
                            downurl_ = r3;
                            bufferedInputStream = bufferedInputStream2;
                            r4 = downurl_;
                        } catch (NumberFormatException e2) {
                            e = e2;
                            bufferedInputStream2 = bufferedInputStream;
                            r2 = downurl_;
                            bcw.d("UpdateManager", "NumberFormatException ex = " + e.getMessage());
                            d(6);
                            b(10);
                            downurl_ = r2;
                            bufferedInputStream = bufferedInputStream2;
                            r4 = downurl_;
                        } catch (Throwable th) {
                            th = th;
                            r5 = downurl_;
                            d(r5, bufferedInputStream);
                            e();
                            throw th;
                        }
                    } catch (IOException e3) {
                        e = e3;
                        downurl_ = 0;
                    } catch (NumberFormatException e4) {
                        e = e4;
                        downurl_ = 0;
                    } catch (Throwable th2) {
                        th = th2;
                        d(r5, bufferedInputStream);
                        e();
                        throw th;
                    }
                    d(r4, bufferedInputStream);
                    e();
                } catch (Throwable th3) {
                    th = th3;
                    bufferedInputStream = bufferedInputStream2;
                }
            } catch (IOException e5) {
                e = e5;
                r3 = 0;
            } catch (NumberFormatException e6) {
                e = e6;
                r2 = 0;
            } catch (Throwable th4) {
                th = th4;
                bufferedInputStream = null;
            }
        }
    }

    public void b(int i) {
        UpdateCheckCallback updateCheckCallback = this.f5110b;
        if (updateCheckCallback != null) {
            updateCheckCallback.onCheckHiCloudResult(i);
        }
    }

    public void b(Handler handler) {
        List<Handler> list = this.g;
        if (list != null) {
            list.add(handler);
        }
    }

    public void c() {
        if (this.d == null) {
            bcw.c("UpdateManager", "update info is null.");
            return;
        }
        bcw.c("UpdateManager", "startDownload");
        c(this.d.getName_());
        this.e = false;
        a aVar = new a();
        aVar.setUncaughtExceptionHandler(new c());
        aVar.start();
    }

    public void d() {
        this.e = true;
    }

    public void e() {
        if (this.d != null) {
            this.d = null;
        }
        if (this.i != null) {
            this.i = null;
        }
        List<Handler> list = this.g;
        if (list != null) {
            list.clear();
            this.g = null;
        }
        UpdateSdkAPI.releaseCallBack();
    }

    private void c(int i, int i2, int i3, Object obj) {
        List<Handler> list = this.g;
        if (list != null) {
            for (Handler handler : list) {
                handler.sendMessage(handler.obtainMessage(i, i2, i3, obj));
            }
        }
    }
}

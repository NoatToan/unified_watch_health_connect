package com.huawei.indoorequip.util;

import android.app.Activity;
import android.text.TextUtils;
import androidx.media3.datasource.cache.CacheDataSink;
import com.huawei.haf.common.os.FileUtils;
import com.huawei.health.healthcloudconfig.listener.DownloadCallback;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.egk;
import defpackage.fda;
import defpackage.fdy;
import defpackage.fek;
import defpackage.njy;
import defpackage.phw;
import defpackage.phz;
import defpackage.piu;
import health.compact.a.IoUtils;
import io.jsonwebtoken.Header;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class DownloadUtil {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile DownloadUtil f17829c;
    private static final Object e = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private DownloadListener f17830b;

    public interface DownloadListener {
        void onDownloadFinish(boolean z);
    }

    private DownloadUtil() {
        this(null);
    }

    private DownloadUtil(DownloadListener downloadListener) {
        this.f17830b = downloadListener;
    }

    public static DownloadUtil a(DownloadListener downloadListener) {
        if (f17829c == null) {
            synchronized (e) {
                if (f17829c == null) {
                    f17829c = new DownloadUtil(downloadListener);
                }
            }
        } else {
            f17829c.c(downloadListener);
        }
        return f17829c;
    }

    private boolean d(File file) {
        if (file == null || !file.exists()) {
            LogUtil.a("DownloadUtil", "deleteFiles, root == null or not exist");
            return false;
        }
        if (file.isFile()) {
            return file.delete();
        }
        if (!file.isDirectory()) {
            LogUtil.j("DownloadUtil", "root not file or directory");
        } else {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null && fileArrListFiles.length > 0) {
                for (File file2 : fileArrListFiles) {
                    d(file2);
                }
            }
        }
        LogUtil.a("DownloadUtil", "delete result= ", Boolean.valueOf(file.delete()));
        return false;
    }

    private fda b() {
        HashMap map = new HashMap();
        map.put("resources", "north_device_img");
        return new fda("com.huawei.health_ecologydevice_config", map);
    }

    private void e() {
        fdy.d(b(), "north_device_img_index", new DownloadCallback<File>() { // from class: com.huawei.indoorequip.util.DownloadUtil.2
            @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
            public void onProgress(long j, long j2, boolean z, String str) {
            }

            @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public void onFinish(File file) {
                LogUtil.a("DownloadUtil", "updatePpgConfig onFinish, data is: ", file.toString());
                String strD = fdy.d("com.huawei.health_ecologydevice_config", "north_device_img_index", "json");
                if (TextUtils.isEmpty(strD)) {
                    return;
                }
                File file2 = new File(strD);
                if (file2.exists()) {
                    DownloadUtil.this.c(phw.c(DownloadUtil.b(file2)).c());
                }
            }

            @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
            public void onFail(int i, Throwable th) {
                LogUtil.j("DownloadUtil", "updatePpgConfig on Fail: ", th.getMessage());
                if (DownloadUtil.this.f17830b != null) {
                    DownloadUtil.this.f17830b.onDownloadFinish(false);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(List<phz> list) {
        phz phzVar;
        if (njy.e(list) || (phzVar = list.get(0)) == null) {
            return;
        }
        int iB = phzVar.b();
        String strA = phzVar.a();
        final String strE = phzVar.e();
        if (egk.c() > iB) {
            fdy.d(b(), strA, new DownloadCallback<File>() { // from class: com.huawei.indoorequip.util.DownloadUtil.5
                @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
                public void onProgress(long j, long j2, boolean z, String str) {
                }

                @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public void onFinish(File file) throws Throwable {
                    LogUtil.a("DownloadUtil", "updatePpgConfig onFinish, data is: ", file.toString());
                    String strD = fdy.d("com.huawei.health_ecologydevice_config", "north_device_img_resource", Header.COMPRESSION_ALGORITHM);
                    if (!piu.b(strE, strD)) {
                        if (DownloadUtil.this.f17830b != null) {
                            DownloadUtil.this.f17830b.onDownloadFinish(false);
                            return;
                        }
                        return;
                    }
                    DownloadUtil.this.b(strD);
                }

                @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
                public void onFail(int i, Throwable th) {
                    LogUtil.j("DownloadUtil", "updatePpgConfig on Fail: ", th.getMessage());
                    if (DownloadUtil.this.f17830b != null) {
                        DownloadUtil.this.f17830b.onDownloadFinish(false);
                    }
                    DownloadUtil.this.e(fdy.d("com.huawei.health_ecologydevice_config", "north_device_img_resource", Header.COMPRESSION_ALGORITHM));
                }
            });
        } else {
            LogUtil.j("DownloadUtil", "this torage is not enough");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(String str) {
        File file = new File(str);
        if (!file.exists() && !file.isDirectory()) {
            LogUtil.j("DownloadUtil", "this file is not exists");
            return false;
        }
        return d(file);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(File file) {
        if (file == null) {
            LogUtil.j("DownloadUtil", "readFileToData, file == null");
            return "";
        }
        LogUtil.a("DownloadUtil", "enter readFileToData: fileName = ", file.getName());
        if (!file.exists()) {
            LogUtil.j("DownloadUtil", "readFileToData, file not exist");
            return "";
        }
        try {
            return FileUtils.a(file, CacheDataSink.DEFAULT_FRAGMENT_SIZE);
        } catch (IOException e2) {
            LogUtil.j("DownloadUtil", "readFileToData, ex=", health.compact.a.LogUtil.c(e2));
            return "";
        }
    }

    public void d(Activity activity, boolean z) {
        if (activity == null) {
            LogUtil.e("DownloadUtil", "startDownload activity is null.");
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - fdy.c("north_device_img_resources");
        if (jCurrentTimeMillis < 604800000 && jCurrentTimeMillis > 0) {
            LogUtil.a("DownloadUtil", "downloadFiles, no need to update.");
            DownloadListener downloadListener = this.f17830b;
            if (downloadListener != null) {
                downloadListener.onDownloadFinish(true);
                return;
            }
            return;
        }
        e();
    }

    public void c(DownloadListener downloadListener) {
        this.f17830b = downloadListener;
    }

    private void a() throws Throwable {
        FileOutputStream fileOutputStream;
        LogUtil.a("DownloadUtil", "createDoneMarkFile enter create done file");
        StringBuilder sb = new StringBuilder();
        FileOutputStream fileOutputStream2 = null;
        sb.append(fdy.d("com.huawei.health_ecologydevice_config", "north_device_img_resource", (String) null));
        sb.append(File.separator);
        sb.append("done");
        String string = sb.toString();
        LogUtil.a("DownloadUtil", "donePath is ", string);
        try {
            try {
                File file = new File(string);
                if (!file.getParentFile().exists()) {
                    LogUtil.a("DownloadUtil", "createDoneMarkFile isDirMade is ", Boolean.valueOf(file.mkdir()));
                }
                if (!file.exists()) {
                    LogUtil.a("DownloadUtil", "createDoneMarkFile isNewFileCreated is ", Boolean.valueOf(file.createNewFile()));
                }
                String strValueOf = String.valueOf(new Date().getTime() / 1000);
                LogUtil.a("DownloadUtil", "createDoneMarkFile timeStamp is =", strValueOf);
                fileOutputStream = new FileOutputStream(file);
                try {
                    byte[] bytes = strValueOf.getBytes("UTF-8");
                    fileOutputStream.write(bytes, 0, bytes.length);
                    IoUtils.c(fileOutputStream);
                } catch (IOException unused) {
                    fileOutputStream2 = fileOutputStream;
                    LogUtil.e("DownloadUtil", "createDoneMarkFile createDoneFile IOException");
                    IoUtils.c(fileOutputStream2);
                } catch (Throwable th) {
                    th = th;
                    IoUtils.c(fileOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
        } catch (IOException unused2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(String str) throws Throwable {
        if (fek.a(str, fdy.d("com.huawei.health_ecologydevice_config", "north_device_img_resource", (String) null) + File.separator) != -1) {
            LogUtil.a("DownloadUtil", "filePostProcess unzipFile is suc");
            a();
            e(str);
            fdy.c(System.currentTimeMillis(), "north_device_img_resources");
            DownloadListener downloadListener = this.f17830b;
            if (downloadListener != null) {
                downloadListener.onDownloadFinish(true);
            }
            return true;
        }
        LogUtil.j("DownloadUtil", "filePostProcess unzipFile is fail");
        return false;
    }
}

package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.dfx.DfxBaseHandler;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.utils.NetworkUtil;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwcrowdtestapi.HealthFeedbackParams;
import com.huawei.hwcrowdtestapi.HealthSendLogCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwlogsmodel.common.LogConfig;
import com.huawei.operation.OperationKey;
import com.huawei.utils.FoundationCommonUtil;
import com.huawei.wisecloud.drmclient.license.HwDrmConstant;
import health.compact.a.CommonUtil;
import health.compact.a.IoUtils;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.utils.StringUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.apache.commons.io.FileUtils;

/* JADX INFO: loaded from: classes10.dex */
public class lfm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile AtomicBoolean f40034a = new AtomicBoolean(false);
    private static final List<String> e = Arrays.asList("HiH_3CircAftProc", "Debug_SportDataSwitch", "HiH_HiHealthSaveData", "SqliteDatabaseLockedExceptionTag", "HAF_ThreadPoolManager", "Debug_HiHealthDBHelper");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List<String> f40035b = Arrays.asList("SCUI_ThreeCirclePointAfterProcess", "Track_PluginHealthTrackAdapterImpl");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final List<String> f40036c = Arrays.asList("com.huawei.health", "com.huawei.health.h5pro", "com.huawei.health_DaemonService", "com.huawei.health_PhoneService");

    private lfm() {
    }

    static class e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final lfm f40040c = new lfm();
    }

    public static lfm b() {
        return e.f40040c;
    }

    public void e(final String str) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: lfo
            @Override // java.lang.Runnable
            public final void run() {
                this.f40042a.b(str);
            }
        });
    }

    /* synthetic */ void b(String str) {
        String strC = c(str);
        if (StringUtils.g(strC)) {
            return;
        }
        String[] strArrSplit = strC.split(";");
        if (strArrSplit.length != 4) {
            return;
        }
        try {
            long j = Long.parseLong(strArrSplit[0]);
            String str2 = strArrSplit[1];
            String str3 = strArrSplit[2];
            String str4 = strArrSplit[3];
            int iE = kud.a().e();
            long jD = SharedPreferenceManager.d("healthLogMonitor", "LAST_TIME_UPLOAD_LOG_KEY" + iE, 0L);
            LogUtil.a("UploadLogAndOpEventManager", "uploadLogAndOpEvent startTime=" + j, ", logTag=" + str2, ", uId=", Integer.valueOf(iE), ", lastUploadTime=", Long.valueOf(jD));
            if (b(str2, j, jD, str4, str3)) {
                if (!f40034a.compareAndSet(false, true)) {
                    LogUtil.a("UploadLogAndOpEventManager", "Failed to uploadZip cause: uploading...");
                } else {
                    c(jD, iE, str2, str3);
                }
            }
        } catch (NumberFormatException unused) {
            LogUtil.e("UploadLogAndOpEventManager", "Invalid StartTime:", strArrSplit[0]);
        }
    }

    private String c(String str) {
        if (!StringUtils.g(str)) {
            return str;
        }
        SharedPreferences sharedPreferences = BaseApplication.b().getSharedPreferences("error_monitor_upload_log_name", 0);
        return sharedPreferences == null ? "" : sharedPreferences.getString("error_monitor_upload_log_key", "");
    }

    private String d(String str) {
        if (e.contains(str)) {
            return OperationKey.HEALTH_APP_DAEMON_EXCEPTION_2129026.value();
        }
        if (f40035b.contains(str)) {
            return OperationKey.HEALTH_APP_HEALTH_EXCEPTION_2129027.value();
        }
        LogUtil.j("UploadLogAndOpEventManager", "Invalid tag :" + str);
        return "";
    }

    private void c(long j, int i, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        try {
            try {
                HealthFeedbackParams healthFeedbackParamsD = d();
                if (!d(j, arrayList)) {
                    LogUtil.e("UploadLogAndOpEventManager", "Failed to copyLogTempDir");
                } else {
                    String strC = c(arrayList, healthFeedbackParamsD);
                    if (StringUtils.g(strC)) {
                        LogUtil.e("UploadLogAndOpEventManager", "Failed to compressLogToZip");
                    } else if (!NetworkUtil.k()) {
                        LogUtil.j("UploadLogAndOpEventManager", "IsWifiConnected is false");
                    } else {
                        b(healthFeedbackParamsD, strC, i, str, str2);
                    }
                }
            } catch (Exception e2) {
                LogUtil.e("UploadLogAndOpEventManager", "Failed to uploadZip", ExceptionUtils.c(e2));
            }
        } finally {
            f40034a.compareAndSet(true, false);
            b(arrayList);
        }
    }

    private boolean d(long j, List<String> list) {
        String strK = LogConfig.k();
        File file = new File(strK + "log_temp");
        if (file.exists()) {
            b(file);
        }
        if (!file.mkdir()) {
            return false;
        }
        for (String str : f40036c) {
            String str2 = "log_temp" + File.separator + str;
            list.add(str2);
            a(j, str, new File(strK + str2));
        }
        return true;
    }

    private void b(List<String> list) {
        String strK = LogConfig.k();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            b(new File(strK + it.next()));
        }
        b(new File(strK + "log_temp"));
    }

    private void b(File file) {
        try {
            if (file.exists()) {
                if (file.isDirectory()) {
                    FileUtils.deleteDirectory(file);
                } else {
                    FileUtils.delete(file);
                }
            }
        } catch (IOException e2) {
            LogUtil.e("UploadLogAndOpEventManager", "Failed to deleteTempFile:", ExceptionUtils.c(e2));
        }
    }

    private boolean b(String str, long j, long j2, String str2, String str3) {
        if (j - j2 < 86400000) {
            return false;
        }
        if (!a(str)) {
            LogUtil.j("UploadLogAndOpEventManager", "Invalid Tag=" + str);
            return false;
        }
        if (!a()) {
            LogUtil.j("UploadLogAndOpEventManager", "Is not agree BetaPrivacy");
            return false;
        }
        if (NetworkUtil.k()) {
            return true;
        }
        LogUtil.j("UploadLogAndOpEventManager", "IsWifiConnected is false");
        return false;
    }

    public static boolean a() {
        return "1".equals(SharedPreferenceManager.e(BaseApplication.b(), Integer.toString(10000), "health_beta_user_agree"));
    }

    private boolean a(final long j, String str, File file) {
        try {
            File file2 = new File(LogConfig.k() + str);
            if (!file.exists() && !file.mkdirs()) {
                throw new IOException("Failed to create temp directory");
            }
            File[] fileArrListFiles = file2.listFiles(new FileFilter() { // from class: lfn
                @Override // java.io.FileFilter
                public final boolean accept(File file3) {
                    return lfm.d(j, file3);
                }
            });
            if (fileArrListFiles != null && fileArrListFiles.length != 0) {
                for (File file3 : fileArrListFiles) {
                    d(file3, new File(file, file3.getName()));
                }
                return true;
            }
            LogUtil.j("UploadLogAndOpEventManager", "logFiles null");
            return false;
        } catch (Exception e2) {
            LogUtil.e("UploadLogAndOpEventManager", "Failed to copyLogFilesAfterTime, cause :" + ExceptionUtils.c(e2));
            return false;
        }
    }

    static /* synthetic */ boolean d(long j, File file) {
        return file.lastModified() >= j;
    }

    private boolean d(File file, File file2) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = fileInputStream.read(bArr);
                        if (i > 0) {
                            fileOutputStream.write(bArr, 0, i);
                        } else {
                            fileOutputStream.close();
                            fileInputStream.close();
                            return true;
                        }
                        try {
                            fileInputStream.close();
                        } catch (Throwable th) {
                            th.addSuppressed(th);
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                fileInputStream.close();
                throw th4;
            }
        } catch (IOException e2) {
            LogUtil.e("UploadLogAndOpEventManager", "Failed to copyFile: ", ExceptionUtils.c(e2));
            return false;
        }
    }

    private boolean a(String str) {
        if (StringUtils.g(str)) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(e);
        arrayList.addAll(f40035b);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (str.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    private String c(List<String> list, HealthFeedbackParams healthFeedbackParams) throws Throwable {
        ArrayList arrayList = new ArrayList(16);
        String strK = LogConfig.k();
        LogUtil.a("UploadLogAndOpEventManager", "root path ", strK);
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(strK + it.next());
        }
        DfxBaseHandler.getAllDfxLogFileToPathList(new File(strK), arrayList);
        String strC = c(healthFeedbackParams);
        String str = LogConfig.k() + strC;
        LogUtil.a("UploadLogAndOpEventManager", "buildLogZipPath targetPath=" + str);
        if (StringUtils.g(str)) {
            return strC;
        }
        try {
            LogUtil.a("UploadLogAndOpEventManager", " pathList=" + HiJsonUtil.d(arrayList));
            b(a(arrayList), new File(str));
            return strC;
        } catch (IOException e2) {
            LogUtil.e("UploadLogAndOpEventManager", "compressLogToZip zip device log exception", ExceptionUtils.c(e2));
            return "";
        }
    }

    private HealthFeedbackParams d() {
        HealthFeedbackParams healthFeedbackParams = new HealthFeedbackParams();
        healthFeedbackParams.setDeviceModel("WEAR");
        healthFeedbackParams.setDeviceSn(FoundationCommonUtil.getAndroidId(BaseApplication.b()));
        healthFeedbackParams.setProductVersion(CommonUtil.a((Context) null));
        healthFeedbackParams.setProductType(1);
        return healthFeedbackParams;
    }

    private ArrayList<File> a(List<String> list) {
        ArrayList<File> arrayList = new ArrayList<>(10);
        if (njy.e(list)) {
            LogUtil.j("UploadLogAndOpEventManager", "getFileList pathList is empty");
            return arrayList;
        }
        for (String str : list) {
            if (TextUtils.isEmpty(str)) {
                LogUtil.j("UploadLogAndOpEventManager", "getFileList pathList item is empty");
            } else {
                File file = new File(str);
                if (file.exists()) {
                    arrayList.add(file);
                }
            }
        }
        return arrayList;
    }

    private String c(HealthFeedbackParams healthFeedbackParams) {
        if (StringUtils.g(healthFeedbackParams.getDeviceSn()) || StringUtils.g(healthFeedbackParams.getDeviceModel()) || StringUtils.g(healthFeedbackParams.getProductVersion())) {
            LogUtil.e("UploadLogAndOpEventManager", "Failed to buildLogZipPath, cause: param is empty");
            return "";
        }
        String upperCase = nio.c(healthFeedbackParams.getDeviceSn() + "000000000000").toUpperCase(Locale.ENGLISH);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(healthFeedbackParams.getDeviceModel());
        stringBuffer.append("_");
        stringBuffer.append(healthFeedbackParams.getProductVersion());
        stringBuffer.append("_");
        stringBuffer.append(upperCase);
        stringBuffer.append("_");
        stringBuffer.append(new SimpleDateFormat(HwDrmConstant.TIME_FORMAT, Locale.ENGLISH).format(new Date()));
        stringBuffer.append("_00000000_app_WearableBeta.zip");
        return stringBuffer.toString();
    }

    private void b(final HealthFeedbackParams healthFeedbackParams, final String str, final int i, final String str2, final String str3) {
        LogUtil.a("UploadLogAndOpEventManager", "Start to sendZipToCloud");
        String str4 = LogConfig.k() + str;
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        ltr.b().sendLog(BaseApplication.b(), healthFeedbackParams, str4, true, false, new HealthSendLogCallback() { // from class: lfm.4
            @Override // com.huawei.hwcrowdtestapi.HealthSendLogCallback
            public void onSuccess(String str5) {
                LogUtil.a("UploadLogAndOpEventManager", "compressAndSendLog send log success! uploadFileName=" + str5);
                SharedPreferenceManager.c("healthLogMonitor", "LAST_TIME_UPLOAD_LOG_KEY" + i, System.currentTimeMillis());
                lfm.this.e(healthFeedbackParams.getDeviceSn(), str, str2, str3);
                countDownLatch.countDown();
            }

            @Override // com.huawei.hwcrowdtestapi.HealthSendLogCallback
            public void onFailed(String str5) {
                LogUtil.j("UploadLogAndOpEventManager", "compressAndSendLog send log fail!");
                countDownLatch.countDown();
            }
        });
        try {
            countDownLatch.await(5000L, TimeUnit.MILLISECONDS);
            try {
                b(new File(str4));
            } catch (Exception e2) {
                e = e2;
                LogUtil.e("UploadLogAndOpEventManager", "Error to sendZipToCloud", ExceptionUtils.c(e));
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str, String str2, String str3, String str4) {
        String strD = d(str3);
        if (StringUtils.g(strD)) {
            return;
        }
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("androidId", str);
        linkedHashMap.put("logName", str2);
        linkedHashMap.put("logTag", str3);
        linkedHashMap.put("msg", str4);
        ljv.d(BaseApplication.b()).c(strD, linkedHashMap, true);
    }

    public static void b(Collection<File> collection, File file) throws Throwable {
        ZipOutputStream zipOutputStream;
        if (collection == null || file == null) {
            LogUtil.j("UploadLogAndOpEventManager", "zipFileList or zipFileParam is null");
            return;
        }
        LogUtil.a("UploadLogAndOpEventManager", "zipFiles size: ", Integer.valueOf(collection.size()));
        ZipOutputStream zipOutputStream2 = null;
        try {
            try {
                zipOutputStream = new ZipOutputStream(new BufferedOutputStream(FileUtils.openOutputStream(file), 1048576));
                try {
                    e(collection, zipOutputStream);
                    d(zipOutputStream);
                } catch (IOException unused) {
                    zipOutputStream2 = zipOutputStream;
                    LogUtil.e("UploadLogAndOpEventManager", "zipFiles IOException exception");
                    d(zipOutputStream2);
                } catch (Throwable th) {
                    th = th;
                    d(zipOutputStream);
                    throw th;
                }
            } catch (IOException unused2) {
            }
        } catch (Throwable th2) {
            th = th2;
            zipOutputStream = zipOutputStream2;
        }
    }

    private static void e(Collection<File> collection, ZipOutputStream zipOutputStream) throws Throwable {
        for (File file : collection) {
            String str = new String(file.getName().getBytes("8859_1"), "GB2312");
            if (file.isDirectory()) {
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                    LogUtil.d("UploadLogAndOpEventManager", "fileLists is null");
                } else {
                    for (File file2 : fileArrListFiles) {
                        c(file2, zipOutputStream, str);
                    }
                }
            } else {
                b(zipOutputStream, file);
            }
        }
    }

    private static void d(ZipOutputStream zipOutputStream) {
        if (zipOutputStream != null) {
            try {
                zipOutputStream.setComment("com.huawei.health");
                zipOutputStream.close();
            } catch (IOException unused) {
                LogUtil.e("UploadLogAndOpEventManager", "IOException exception");
                if (zipOutputStream != null) {
                    try {
                        return;
                    } catch (IOException unused2) {
                        return;
                    }
                }
                return;
            } finally {
                if (zipOutputStream != null) {
                    try {
                        zipOutputStream.close();
                    } catch (IOException unused3) {
                        LogUtil.e("UploadLogAndOpEventManager", "IOException exception");
                    }
                }
            }
        }
    }

    private static void b(ZipOutputStream zipOutputStream, File file) throws Throwable {
        BufferedInputStream bufferedInputStream;
        BufferedInputStream bufferedInputStream2 = null;
        try {
            try {
                byte[] bArr = new byte[1048576];
                String strC = CommonUtil.c(file.getCanonicalPath());
                if (TextUtils.isEmpty(strC)) {
                    LogUtil.j("UploadLogAndOpEventManager", "zipFiles safePath is empty");
                    IoUtils.c(null);
                    return;
                }
                bufferedInputStream = new BufferedInputStream(Files.newInputStream(Paths.get(strC, new String[0]), new OpenOption[0]), 1048576);
                try {
                    zipOutputStream.putNextEntry(new ZipEntry(file.getName()));
                    while (true) {
                        int i = bufferedInputStream.read(bArr);
                        if (i == -1) {
                            LogUtil.a("UploadLogAndOpEventManager", "zip ok");
                            IoUtils.c(bufferedInputStream);
                            return;
                        }
                        zipOutputStream.write(bArr, 0, i);
                    }
                } catch (IOException e2) {
                    e = e2;
                    bufferedInputStream2 = bufferedInputStream;
                    LogUtil.e("UploadLogAndOpEventManager", "processFile IOException", e.getMessage());
                    IoUtils.c(bufferedInputStream2);
                } catch (Throwable th) {
                    th = th;
                    IoUtils.c(bufferedInputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedInputStream = null;
            }
        } catch (IOException e3) {
            e = e3;
        }
    }

    private static void c(File file, ZipOutputStream zipOutputStream, String str) throws Throwable {
        BufferedInputStream bufferedInputStream;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str.trim().length() == 0 ? "" : File.separator);
        sb.append(file.getName());
        try {
            String str2 = new String(sb.toString().getBytes("8859_1"), "GB2312");
            if (file.isDirectory()) {
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles == null || fileArrListFiles.length <= 0) {
                    return;
                }
                e(zipOutputStream, str2, fileArrListFiles);
                return;
            }
            BufferedInputStream bufferedInputStream2 = null;
            try {
                try {
                    byte[] bArr = new byte[1048576];
                    bufferedInputStream = new BufferedInputStream(FileUtils.openInputStream(file), 1048576);
                    try {
                        zipOutputStream.putNextEntry(new ZipEntry(str2));
                        while (true) {
                            int i = bufferedInputStream.read(bArr);
                            if (i != -1) {
                                zipOutputStream.write(bArr, 0, i);
                            } else {
                                IoUtils.c(bufferedInputStream);
                                return;
                            }
                        }
                    } catch (IOException unused) {
                        bufferedInputStream2 = bufferedInputStream;
                        LogUtil.e("UploadLogAndOpEventManager", "zipFile IOException");
                        IoUtils.c(bufferedInputStream2);
                    } catch (Throwable th) {
                        th = th;
                        IoUtils.c(bufferedInputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bufferedInputStream = null;
                }
            } catch (IOException unused2) {
            }
        } catch (UnsupportedEncodingException e2) {
            LogUtil.e("UploadLogAndOpEventManager", "UnsupportedEncodingException e: ", e2.getMessage());
        }
    }

    private static void e(ZipOutputStream zipOutputStream, String str, File[] fileArr) {
        for (File file : fileArr) {
            c(file, zipOutputStream, str);
        }
    }
}

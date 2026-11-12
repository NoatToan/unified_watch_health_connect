package defpackage;

import android.text.TextUtils;
import com.huawei.common.util.Utils;
import com.huawei.haf.common.os.FileUtils;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.healthcloudconfig.listener.DownloadCallback;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.networkclient.ProgressListener;
import com.huawei.operation.ble.BleConstants;
import com.huawei.pluginmgr.DownloadGreyDomainApi;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import java.io.File;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class fdy {
    private static String b() {
        LogUtil.a("HealthCloudConfigUtils", "enter getUrl");
        String noCheckUrl = GRSManager.c(BaseApplication.getContext()).getNoCheckUrl("domainHealthCloudCommon", GRSManager.c(BaseApplication.getContext()).getCommonCountryCode());
        if (TextUtils.isEmpty(noCheckUrl) || noCheckUrl == null) {
            LogUtil.e("HealthCloudConfigUtils", "getUrl is empty or null.");
            return "";
        }
        return noCheckUrl + "/commonAbility/configCenter/getConfigInfo";
    }

    private static String d() {
        LogUtil.a("HealthCloudConfigUtils", "enter getUrl");
        String noCheckUrl = GRSManager.c(BaseApplication.getContext()).getNoCheckUrl("domainHealthCloudCommon", GRSManager.c(BaseApplication.getContext()).getCommonCountryCode());
        if (TextUtils.isEmpty(noCheckUrl) || noCheckUrl == null) {
            LogUtil.e("HealthCloudConfigUtils", "getUrl is empty or null.");
            return "";
        }
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), "developeroptions", "developerswitch");
        if (CommonUtil.cl() && "1".equals(strE)) {
            String strE2 = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10008), "key_test_to_beta_switch_ui");
            if (!TextUtils.isEmpty(strE2) && Boolean.valueOf(strE2).booleanValue()) {
                noCheckUrl = ((DownloadGreyDomainApi) Services.b("ConfigResourceServiceModule", DownloadGreyDomainApi.class)).getHealthCloudGreyDownloadDomain("HealthCloudConfigUtils");
            }
            LogUtil.a("HealthCloudConfigUtils", "getUrl url：", CommonUtil.n(noCheckUrl));
        }
        return noCheckUrl + "/commonAbility/configCenter/getConfigInfo";
    }

    private static Map<String, String> a(String str) {
        LogUtil.a("HealthCloudConfigUtils", "enter getHeader");
        HashMap map = new HashMap();
        map.put("x-version", CommonUtil.c(BaseApplication.getContext()));
        map.put("Content-Type", "application/json; charset=utf-8");
        map.put("traceId", str);
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        if (!TextUtils.isEmpty(accountInfo)) {
            map.put("x-huid", accountInfo);
        }
        return map;
    }

    private static String e(String str) {
        if (str == null) {
            return "";
        }
        LogUtil.a("HealthCloudConfigUtils", "enter getFileSuffix");
        String[] strArrSplit = str.split("\\.");
        return "." + strArrSplit[strArrSplit.length - 1].split("\"")[0];
    }

    public static void c(long j, String str) {
        LogUtil.a("HealthCloudConfigUtils", "enter setLatestDownloadTime");
        lua.g(String.valueOf(20006), str + "_latestDownloadTime", j);
    }

    public static long c(String str) {
        LogUtil.a("HealthCloudConfigUtils", "enter getLatestDownloadTime.");
        long jB = lua.b(String.valueOf(20006), str + "_latestDownloadTime", 0L);
        if (jB != 0) {
            return jB;
        }
        LogUtil.j("HealthCloudConfigUtils", "latestDownloadTime is null or 0.");
        return 0L;
    }

    private static fcz b(String str, fda fdaVar, DownloadCallback downloadCallback) {
        LogUtil.a("HealthCloudConfigUtils", "enter getResponse");
        String strB = b();
        if (TextUtils.isEmpty(strB)) {
            LogUtil.j("HealthCloudConfigUtils", "getResponse getUrl is null");
            downloadCallback.onFail(1003, new UnknownHostException("HealthCloudConfigUtils getResponse, getUrl is null"));
            return null;
        }
        Map<String, String> mapA = a(fdaVar.b() + str);
        LogUtil.a("HealthCloudConfigUtils", "Request Information, fileId is: ", str, ", url is: ", strB, ", header is: ", mapA, ", body is: ", HiJsonUtil.d(fdaVar));
        fcz fczVar = (fcz) oet.d().e(strB, mapA, HiJsonUtil.d(fdaVar), fcz.class);
        if (fczVar == null) {
            LogUtil.j("HealthCloudConfigUtils", "failed to get response");
            downloadCallback.onFail(1004, new IOException("HealthCloudConfigUtils getResponse, response is null"));
            return null;
        }
        if (fczVar.c() == 0) {
            return fczVar;
        }
        LogUtil.e("HealthCloudConfigUtils", "response not success, code is: ", Integer.valueOf(fczVar.c()));
        downloadCallback.onFail(1005, new IOException("response not success, code is: " + fczVar.c()));
        return null;
    }

    private static fcz c(String str, fda fdaVar, DownloadCallback downloadCallback) {
        LogUtil.a("HealthCloudConfigUtils", "enter getResponse");
        String strD = d();
        if (TextUtils.isEmpty(strD)) {
            LogUtil.j("HealthCloudConfigUtils", "getResponse getUrl is null");
            downloadCallback.onFail(1003, new UnknownHostException("HealthCloudConfigUtils getResponse, getUrl is null"));
            return null;
        }
        Map<String, String> mapA = a(fdaVar.b() + str);
        LogUtil.a("HealthCloudConfigUtils", "Request Information, fileId is: ", str, ", url is: ", strD, ", header is: ", mapA, ", body is: ", HiJsonUtil.d(fdaVar));
        fcz fczVar = (fcz) oet.d().e(strD, mapA, HiJsonUtil.d(fdaVar), fcz.class);
        if (fczVar == null) {
            LogUtil.j("HealthCloudConfigUtils", "failed to get response");
            downloadCallback.onFail(1004, new IOException("HealthCloudConfigUtils getResponse, response is null"));
            return null;
        }
        if (fczVar.c() == 0) {
            return fczVar;
        }
        LogUtil.e("HealthCloudConfigUtils", "response not success, code is: ", Integer.valueOf(fczVar.c()));
        downloadCallback.onFail(1005, new IOException("response not success, code is: " + fczVar.c()));
        return null;
    }

    public static fcz d(String str, fda fdaVar) {
        LogUtil.a("HealthCloudConfigUtils", "enter public getResponse.");
        if (TextUtils.isEmpty(str) || fdaVar == null) {
            LogUtil.j("HealthCloudConfigUtils", "public getResponse, fileId or body is null or empty");
            return null;
        }
        String strB = b();
        Map<String, String> mapA = a(fdaVar.b() + str);
        LogUtil.a("HealthCloudConfigUtils", "Request Information, fileId is: ", str, ", url is: ", strB, ", header is: ", mapA, ", body is: ", HiJsonUtil.d(fdaVar));
        fcz fczVar = (fcz) oet.d().e(strB, mapA, HiJsonUtil.d(fdaVar), fcz.class);
        if (fczVar == null) {
            LogUtil.j("HealthCloudConfigUtils", "failed to get response");
            return null;
        }
        if (fczVar.c() == 0) {
            return fczVar;
        }
        LogUtil.e("HealthCloudConfigUtils", "response not success, resultCode is: ", Integer.valueOf(fczVar.c()));
        return null;
    }

    public static fcz a(String str, fda fdaVar, int i, String str2) {
        LogUtil.a("HealthCloudConfigUtils", "enter public getResponse by updateDays: ", Integer.valueOf(i));
        long jB = b(str2);
        long jCurrentTimeMillis = System.currentTimeMillis();
        LogUtil.a("HealthCloudConfigUtils", "get from sp: lastCheckVersionTime = ", Long.valueOf(jB), ", currentCheckVersionTime = ", Long.valueOf(jCurrentTimeMillis));
        long j = jCurrentTimeMillis - jB;
        if (j < ((long) i) * 86400000 && j > 0) {
            LogUtil.a("HealthCloudConfigUtils", "no need to check version");
            return null;
        }
        if (TextUtils.isEmpty(str) || fdaVar == null) {
            LogUtil.j("HealthCloudConfigUtils", "public getResponse, fileId or body is null or empty");
            return null;
        }
        String strB = b();
        Map<String, String> mapA = a(fdaVar.b() + str);
        LogUtil.a("HealthCloudConfigUtils", "Request Information, fileId is: ", str, ", url is: ", strB, ", header is: ", mapA, ", body is: ", HiJsonUtil.d(fdaVar));
        fcz fczVar = (fcz) oet.d().e(strB, mapA, HiJsonUtil.d(fdaVar), fcz.class);
        if (fczVar == null) {
            LogUtil.j("HealthCloudConfigUtils", "failed to get response");
            return null;
        }
        if (fczVar.c() != 0) {
            LogUtil.e("HealthCloudConfigUtils", "response not success, resultCode is: ", Integer.valueOf(fczVar.c()));
            return null;
        }
        a(str2, System.currentTimeMillis());
        return fczVar;
    }

    private static String c(fcz fczVar, String str) {
        String strD;
        LogUtil.a("HealthCloudConfigUtils", "enter getDownloadUrl");
        List<fcw> listA = fczVar.a();
        int i = 0;
        while (true) {
            if (i >= listA.size()) {
                strD = null;
                break;
            }
            if (str.equals(listA.get(i).c())) {
                strD = listA.get(i).d();
                break;
            }
            i++;
        }
        if (strD != null && !TextUtils.isEmpty(strD)) {
            return strD;
        }
        LogUtil.j("HealthCloudConfigUtils", "downloadUrl is null or empty.");
        return null;
    }

    private static void a(File file) {
        if (file.getParentFile() == null || file.getParentFile().exists()) {
            return;
        }
        LogUtil.a("HealthCloudConfigUtils", "initFolder isMkdirFile = ", Boolean.valueOf(file.getParentFile().mkdirs()));
    }

    private static void e(File file) {
        if (file == null) {
            LogUtil.j("HealthCloudConfigUtils", "initTempFile, tempFile is null");
        } else {
            if (file.getParentFile() == null || file.getParentFile().exists()) {
                return;
            }
            LogUtil.a("HealthCloudConfigUtils", "initTempFile isMkdirFile = ", Boolean.valueOf(file.getParentFile().mkdirs()));
        }
    }

    private static void a(String str, Map<String, String> map, DownloadCallback downloadCallback) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String value = entry.getValue();
            if (TextUtils.isEmpty(value)) {
                LogUtil.j("HealthCloudConfigUtils", "downloadBatch, downloadUrl is null or empty.");
                downloadCallback.onFail(1007, new NullPointerException("HealthCloudConfigUtils downloadBatch, downloadUrl is null"));
                return;
            }
            String key = entry.getKey();
            String strD = d(str, key, value);
            if (strD == null) {
                LogUtil.j("HealthCloudConfigUtils", "downloadBatch, filePath is null");
                downloadCallback.onFail(1006, new IOException("HealthCloudConfigUtils downloadBatch, filePath is null"));
                return;
            }
            File file = new File(strD);
            File fileA = a(key, value);
            fdv fdvVar = new fdv(str, key, value, file, downloadCallback);
            a(file);
            e(fileA);
            oet.d().a(new oer(value, null, file, fileA, fdvVar));
        }
    }

    public static String c(String str, String str2) {
        File[] fileArrListFiles;
        try {
            String str3 = BaseApplication.getContext().getFilesDir().getCanonicalPath() + File.separator + Utils.SERVICE_HEALTH_CLOUD + File.separator + str;
            if (TextUtils.isEmpty(str3)) {
                LogUtil.j("HealthCloudConfigUtils", "getLocalFile filePath is empty.");
                return null;
            }
            File file = new File(str3);
            if ((file.exists() || file.isDirectory()) && (fileArrListFiles = file.listFiles()) != null) {
                for (int i = 0; i < fileArrListFiles.length && fileArrListFiles[i].isFile(); i++) {
                    String name = fileArrListFiles[i].getName();
                    if (TextUtils.isEmpty(name)) {
                        LogUtil.j("HealthCloudConfigUtils", "checkLocalFile, fileName is empty");
                        return null;
                    }
                    int iLastIndexOf = name.lastIndexOf(46);
                    if (iLastIndexOf == -1) {
                        LogUtil.j("HealthCloudConfigUtils", "checkLocalFile, index is -1.");
                        return null;
                    }
                    if (name.substring(0, iLastIndexOf).equals(str2)) {
                        try {
                            return fileArrListFiles[i].getCanonicalPath();
                        } catch (IOException e) {
                            LogUtil.j("HealthCloudConfigUtils", "getLocalFile, exception is: ", e.getMessage());
                            return null;
                        }
                    }
                }
            }
            return null;
        } catch (IOException e2) {
            LogUtil.e("HealthCloudConfigUtils", "IOException e", e2.getMessage());
            return null;
        }
    }

    private static List<File> d(String str) {
        try {
            String str2 = BaseApplication.getContext().getFilesDir().getCanonicalPath() + File.separator + Utils.SERVICE_HEALTH_CLOUD + File.separator + str;
            if (TextUtils.isEmpty(str2)) {
                LogUtil.j("HealthCloudConfigUtils", "getLocalFile filePath is empty.");
                return null;
            }
            File file = new File(str2);
            if (file.exists() || file.isDirectory()) {
                if (!xjl.d(file)) {
                    LogUtil.j("HealthCloudConfigUtils", "path_crossing checkLocalFile file is invalid,filePath=", str2);
                    return null;
                }
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles != null && fileArrListFiles.length != 0) {
                    ArrayList arrayList = new ArrayList(10);
                    for (File file2 : fileArrListFiles) {
                        arrayList.add(file2);
                    }
                    return arrayList;
                }
            }
            return null;
        } catch (IOException e) {
            LogUtil.e("HealthCloudConfigUtils", "IOException e", e.getMessage());
            return null;
        }
    }

    private static File a(String str, String str2) {
        try {
            String str3 = BaseApplication.getContext().getFilesDir().getCanonicalPath() + File.separator + Utils.SERVICE_HEALTH_CLOUD + File.separator + BleConstants.TEMPERATURE + File.separator + str + e(str2);
            if (TextUtils.isEmpty(str3)) {
                LogUtil.j("HealthCloudConfigUtils", "getTempFile filePath is empty.");
                return null;
            }
            File file = new File(str3);
            if (xjl.d(file)) {
                return file;
            }
            LogUtil.j("HealthCloudConfigUtils", "path_crossing getTempFile file is invalid,filePath=", str3);
            return null;
        } catch (IOException e) {
            LogUtil.e("HealthCloudConfigUtils", "IOException e", e.getMessage());
            return null;
        }
    }

    public static String d(String str, String str2, String str3) {
        LogUtil.a("HealthCloudConfigUtils", "enter getFilePath");
        Objects.requireNonNull(str);
        if (str2 == null) {
            str2 = "";
        }
        try {
            String str4 = BaseApplication.getContext().getFilesDir().getCanonicalPath() + File.separator + Utils.SERVICE_HEALTH_CLOUD + File.separator + str + File.separator + str2 + e(str3);
            if (!TextUtils.isEmpty(str4)) {
                return str4;
            }
            LogUtil.j("HealthCloudConfigUtils", "getFilePath filePath is empty.");
            return null;
        } catch (IOException e) {
            LogUtil.e("HealthCloudConfigUtils", "IOException e", e.getMessage());
            return null;
        }
    }

    public static void d(final fda fdaVar, final String str, final DownloadCallback<File> downloadCallback) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: feg
            @Override // java.lang.Runnable
            public final void run() {
                fdy.e(str, fdaVar, downloadCallback);
            }
        });
    }

    static /* synthetic */ void e(String str, fda fdaVar, DownloadCallback downloadCallback) {
        LogUtil.a("HealthCloudConfigUtils", "enter downloadFile");
        Objects.requireNonNull(str);
        Objects.requireNonNull(fdaVar);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(fdaVar.b())) {
            LogUtil.j("HealthCloudConfigUtils", "downloadFile, fileId or configId is empty");
            downloadCallback.onFail(1002, new IllegalArgumentException("fileId or configId is null or empty"));
            return;
        }
        fcz fczVarB = b(str, fdaVar, downloadCallback);
        if (fczVarB == null) {
            LogUtil.j("HealthCloudConfigUtils", "downloadFile, response is null");
            return;
        }
        String strB = fdaVar.b();
        String strD = d(strB, str, c(fczVarB, str));
        if (strD == null) {
            LogUtil.j("HealthCloudConfigUtils", "downloadFile, filePath is null");
            downloadCallback.onFail(1006, new IOException("HealthCloudConfigUtils downloadFile, filePath is null"));
            return;
        }
        String strC = c(fczVarB, str);
        if (strC == null) {
            LogUtil.j("HealthCloudConfigUtils", "downloadFile, downloadUrl is null");
            downloadCallback.onFail(1007, new NullPointerException("HealthCloudConfigUtils downloadFile, downloadUrl is null"));
        } else {
            e(strD, strC, str, new fdv(strB, str, strC, new File(strD), downloadCallback), downloadCallback);
        }
    }

    public static void d(final fda fdaVar, final String str, final int i, final DownloadCallback<File> downloadCallback) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: fef
            @Override // java.lang.Runnable
            public final void run() {
                fdy.e(str, fdaVar, downloadCallback, i);
            }
        });
    }

    static /* synthetic */ void e(String str, fda fdaVar, DownloadCallback downloadCallback, int i) {
        LogUtil.a("HealthCloudConfigUtils", "enter downloadFiles");
        Objects.requireNonNull(str);
        Objects.requireNonNull(fdaVar);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(fdaVar.b())) {
            LogUtil.j("HealthCloudConfigUtils", "getResponse, fileId or configId is empty");
            downloadCallback.onFail(1002, new IllegalArgumentException("fileId or configId is null or empty"));
            return;
        }
        String strB = fdaVar.b();
        long jC = c(strB + "_" + str);
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strC = c(strB, str);
        long j = jCurrentTimeMillis - jC;
        if (j < ((long) i) * 86400000 && j > 0 && strC != null) {
            LogUtil.a("HealthCloudConfigUtils", "downloadFiles, no need to update.");
            downloadCallback.onFinish(new File(strC));
            return;
        }
        LogUtil.a("HealthCloudConfigUtils", "downloadFiles, needs to update.");
        fcz fczVarB = b(str, fdaVar, downloadCallback);
        if (fczVarB == null) {
            LogUtil.j("HealthCloudConfigUtils", "downloadFiles, response is null");
            return;
        }
        String strD = d(strB, str, c(fczVarB, str));
        if (strD == null) {
            LogUtil.j("HealthCloudConfigUtils", "downloadFiles, filePath is null");
            downloadCallback.onFail(1006, new IOException("HealthCloudConfigUtils downloadFiles, filePath is null"));
            return;
        }
        String strC2 = c(fczVarB, str);
        if (strC2 == null) {
            LogUtil.j("HealthCloudConfigUtils", "downloadFiles, downloadUrl is null");
            downloadCallback.onFail(1007, new NullPointerException("HealthCloudConfigUtils downloadFiles, downloadUrl is null"));
        } else {
            e(strD, strC2, str, new fdt(strB, str, strC2, new File(strD), downloadCallback), downloadCallback);
        }
    }

    private static void e(String str, String str2, String str3, ProgressListener progressListener, DownloadCallback downloadCallback) {
        File file = new File(str);
        File fileA = a(str3, str2);
        a(file);
        e(fileA);
        oet.d().a(new oer(str2, null, file, fileA, progressListener));
    }

    public static void a(final fda fdaVar, final String str, final List<String> list, final DownloadCallback<List<File>> downloadCallback) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: fee
            @Override // java.lang.Runnable
            public final void run() {
                fdy.b(fdaVar, str, downloadCallback, list);
            }
        });
    }

    static /* synthetic */ void b(fda fdaVar, String str, DownloadCallback downloadCallback, List list) {
        LogUtil.a("HealthCloudConfigUtils", "enter downloadBatchList");
        Objects.requireNonNull(fdaVar);
        Objects.requireNonNull(str);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(fdaVar.b())) {
            LogUtil.j("HealthCloudConfigUtils", "getResponse, tag or configId is empty");
            downloadCallback.onFail(1002, new IllegalArgumentException("tag or configId is null or empty"));
            return;
        }
        if (list == null || list.isEmpty()) {
            LogUtil.j("HealthCloudConfigUtils", "downloadBatchList, list is null or empty.");
            downloadCallback.onFail(1009, new NullPointerException("HealthCloudConfigUtils downloadBatchList, list is null or empty"));
            return;
        }
        fcz fczVarB = b(str, fdaVar, downloadCallback);
        if (fczVarB == null) {
            LogUtil.j("HealthCloudConfigUtils", "downloadBatchList, response is null");
            return;
        }
        String strB = fdaVar.b();
        Map<String, String> mapD = d(fczVarB, (List<String>) list);
        if (mapD.isEmpty()) {
            LogUtil.j("HealthCloudConfigUtils", "downloadBatchList, map is null or empty.");
            downloadCallback.onFail(1008, new NullPointerException("downloadBatchList, map is null or empty."));
        } else {
            a(strB, mapD, new fdq(strB, str, mapD.size(), downloadCallback));
        }
    }

    public static void d(final fda fdaVar, final String str, final List<String> list, final DownloadCallback<fcz> downloadCallback) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: fea
            @Override // java.lang.Runnable
            public final void run() {
                fdy.d(fdaVar, str, downloadCallback, list);
            }
        });
    }

    static /* synthetic */ void d(fda fdaVar, String str, DownloadCallback downloadCallback, List list) {
        LogUtil.a("HealthCloudConfigUtils", "enter downloadBatchListResponse");
        Objects.requireNonNull(fdaVar);
        Objects.requireNonNull(str);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(fdaVar.b())) {
            LogUtil.j("HealthCloudConfigUtils", "getResponse, tag or configId is empty");
            downloadCallback.onFail(1002, new IllegalArgumentException("tag or configId is null or empty"));
            return;
        }
        if (list == null || list.isEmpty()) {
            LogUtil.j("HealthCloudConfigUtils", "downloadBatchList, list is null or empty.");
            downloadCallback.onFail(1009, new NullPointerException("HealthCloudConfigUtils downloadBatchList, list is null or empty"));
            return;
        }
        fcz fczVarB = b(str, fdaVar, downloadCallback);
        if (fczVarB == null) {
            LogUtil.j("HealthCloudConfigUtils", "downloadBatchList, response is null");
            return;
        }
        String strB = fdaVar.b();
        Map<String, String> mapD = d(fczVarB, (List<String>) list);
        if (mapD.isEmpty()) {
            LogUtil.j("HealthCloudConfigUtils", "downloadBatchList, map is null or empty.");
            downloadCallback.onFail(1008, new NullPointerException("downloadBatchList, map is null or empty."));
        } else {
            a(strB, mapD, new fdx(strB, str, mapD.size(), fczVarB, downloadCallback));
        }
    }

    public static void b(final fda fdaVar, final String str, final List<String> list, final int i, final DownloadCallback<fcz> downloadCallback) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: fem
            @Override // java.lang.Runnable
            public final void run() {
                fdy.d(fdaVar, str, downloadCallback, list, i);
            }
        });
    }

    static /* synthetic */ void d(fda fdaVar, String str, DownloadCallback downloadCallback, List list, int i) {
        LogUtil.a("HealthCloudConfigUtils", "enter downloadBatchListResponse with updateDays");
        Objects.requireNonNull(fdaVar);
        Objects.requireNonNull(str);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(fdaVar.b())) {
            LogUtil.j("HealthCloudConfigUtils", "getResponse, tag or configId is empty");
            downloadCallback.onFail(1002, new IllegalArgumentException("tag or configId is null or empty"));
            return;
        }
        if (list == null || list.isEmpty()) {
            LogUtil.j("HealthCloudConfigUtils", "downloadBatchList, list is null or empty.");
            downloadCallback.onFail(1009, new NullPointerException("HealthCloudConfigUtils downloadBatchList, list is null or empty"));
            return;
        }
        String strB = fdaVar.b();
        long jC = c(d(strB, str, true));
        long jCurrentTimeMillis = System.currentTimeMillis();
        LogUtil.a("HealthCloudConfigUtils", "get from sp: lastUpdateTime = ", Long.valueOf(jC), ", currentTime = ", Long.valueOf(jCurrentTimeMillis));
        List<File> listD = d(strB);
        long j = jCurrentTimeMillis - jC;
        if (j < ((long) i) * 86400000 && j > 0 && listD != null) {
            LogUtil.a("HealthCloudConfigUtils", "downloadFiles, no need to update.");
            fcz fczVar = new fcz();
            fczVar.a(false);
            downloadCallback.onFinish(fczVar);
            return;
        }
        LogUtil.a("HealthCloudConfigUtils", "downloadBatchLists, needs to update.");
        fcz fczVarB = b(str, fdaVar, downloadCallback);
        if (fczVarB == null) {
            LogUtil.j("HealthCloudConfigUtils", "downloadBatchList, response is null");
            return;
        }
        Map<String, String> mapD = d(fczVarB, (List<String>) list);
        if (mapD.isEmpty()) {
            LogUtil.j("HealthCloudConfigUtils", "downloadBatchList, map is null or empty.");
            downloadCallback.onFail(1008, new NullPointerException("downloadBatchList, map is null or empty."));
        } else {
            a(strB, mapD, new fdx(strB, str, mapD.size(), fczVarB, str, downloadCallback));
        }
    }

    public static String d(String str, String str2, boolean z) {
        StringBuilder sb;
        if (z) {
            sb = new StringBuilder();
            sb.append(str);
            sb.append("_");
            sb.append(str2);
            sb.append("_batch");
        } else {
            sb = new StringBuilder();
            sb.append(str);
            sb.append("_");
            sb.append(str2);
        }
        return sb.toString();
    }

    private static Map<String, String> d(fcz fczVar, List<String> list) {
        int size = fczVar.a().size();
        List<fcw> listA = fczVar.a();
        HashMap map = new HashMap();
        for (int i = 0; i < size; i++) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                if (listA.get(i).c().equals(list.get(i2))) {
                    map.put(list.get(i2), listA.get(i).d());
                }
            }
        }
        return map;
    }

    @Deprecated
    public static void b(final fda fdaVar, final String str, final int i, final List<String> list, final DownloadCallback<List<File>> downloadCallback) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: fed
            @Override // java.lang.Runnable
            public final void run() {
                fdy.a(fdaVar, str, downloadCallback, list, i);
            }
        });
    }

    static /* synthetic */ void a(fda fdaVar, String str, DownloadCallback downloadCallback, List list, int i) {
        LogUtil.a("HealthCloudConfigUtils", "enter downloadBatchLists");
        Objects.requireNonNull(fdaVar);
        Objects.requireNonNull(str);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(fdaVar.b())) {
            LogUtil.j("HealthCloudConfigUtils", "getResponse, tag or configId is empty");
            downloadCallback.onFail(1002, new IllegalArgumentException("tag or configId is null or empty"));
            return;
        }
        if (list == null || list.isEmpty()) {
            LogUtil.j("HealthCloudConfigUtils", "downloadBatchLists，list is null or empty.");
            downloadCallback.onFail(1009, new NullPointerException("HealthCloudConfigUtils downloadBatchLists, list is null"));
            return;
        }
        String strB = fdaVar.b();
        long jC = c(d(strB, str, false));
        long jCurrentTimeMillis = System.currentTimeMillis();
        List<File> listD = d(strB);
        long j = jCurrentTimeMillis - jC;
        if (j < ((long) i) * 86400000 && j > 0 && listD != null) {
            LogUtil.a("HealthCloudConfigUtils", "downloadBatchList no need to update lastUpdateTime ", Long.valueOf(jC), " tag ", str);
            downloadCallback.onFinish(listD);
            return;
        }
        LogUtil.a("HealthCloudConfigUtils", "downloadBatchLists, needs to update.");
        fcz fczVarB = b(str, fdaVar, downloadCallback);
        if (fczVarB == null) {
            LogUtil.j("HealthCloudConfigUtils", "downloadBatchLists, response is null");
            return;
        }
        Map<String, String> mapD = d(fczVarB, (List<String>) list);
        if (mapD.isEmpty()) {
            LogUtil.j("HealthCloudConfigUtils", "map is null or empty.");
            downloadCallback.onFail(1008, new NullPointerException("map is null or empty."));
        } else {
            a(strB, mapD, new fdw(strB, str, mapD.size(), downloadCallback));
        }
    }

    public static void c(fdc fdcVar) {
        c(fdcVar, false);
    }

    public static void c(final fdc fdcVar, final boolean z) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: fdz
            @Override // java.lang.Runnable
            public final void run() {
                fdy.d(fdcVar, z);
            }
        });
    }

    static /* synthetic */ void d(fdc fdcVar, boolean z) {
        LogUtil.a("HealthCloudConfigUtils", "enter downloadFileResponse");
        if (fdcVar.d() == null) {
            LogUtil.j("HealthCloudConfigUtils", "listener is null");
            return;
        }
        DownloadCallback downloadCallbackD = fdcVar.d();
        if (fdcVar.a() == null || TextUtils.isEmpty(fdcVar.a().b()) || TextUtils.isEmpty(fdcVar.b()) || TextUtils.isEmpty(fdcVar.c())) {
            LogUtil.j("HealthCloudConfigUtils", "fileId or configId or body is empty");
            downloadCallbackD.onFail(1002, new IllegalArgumentException("fileId or configId is null or empty"));
            return;
        }
        String strB = fdcVar.b();
        fda fdaVarA = fdcVar.a();
        boolean zE = fdcVar.e();
        String strC = fdcVar.c();
        fcz fczVarC = c(strB, fdaVarA, downloadCallbackD);
        if (fczVarC == null) {
            LogUtil.j("HealthCloudConfigUtils", "downloadFile, response is null");
            return;
        }
        String strB2 = fdaVarA.b();
        String strD = d(fczVarC, strB);
        if (TextUtils.isEmpty(strD)) {
            LogUtil.j("HealthCloudConfigUtils", "cloudVer is null or empty, no download");
            return;
        }
        if (zE) {
            if (strD.compareTo(g(strB2 + strB)) <= 0 && FileUtils.i(new File(fdcVar.c())) != 0) {
                LogUtil.a("HealthCloudConfigUtils", "localVer equals with cloudVer, no need to update.");
                fczVarC.a(false);
                downloadCallbackD.onFinish(fczVarC);
                return;
            }
        } else {
            strD = "-1";
        }
        fczVarC.a(true);
        if (TextUtils.isEmpty(strC)) {
            LogUtil.j("HealthCloudConfigUtils", "downloadFile, filePath is null");
            downloadCallbackD.onFail(1006, new IOException("HealthCloudConfigUtils downloadFile, filePath is null"));
            return;
        }
        String strC2 = CommonUtil.c(strC);
        String strC3 = c(fczVarC, strB);
        if (strC3 == null) {
            LogUtil.j("HealthCloudConfigUtils", "downloadFile, downloadUrl is null");
            downloadCallbackD.onFail(1007, new NullPointerException("HealthCloudConfigUtils downloadFile, downloadUrl is null"));
        } else {
            if (z) {
                oet.d().b(strC3);
            }
            e(strC2, strC3, strB, new fdu.a().d(strB2).c(strB).a(strC3).b(new File(strC2)).b(downloadCallbackD).b(strD).b(fczVarC).e(), downloadCallbackD);
        }
    }

    public static void b(String str, String str2, ProgressListener<File> progressListener) {
        LogUtil.a("HealthCloudConfigUtils", "enter downloadFileUrl.");
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("HealthCloudConfigUtils", "url is empty");
            return;
        }
        File file = new File(str2);
        String[] strArrSplit = file.getName().split("\\.");
        File fileA = a(strArrSplit[0], strArrSplit[1]);
        a(file);
        e(fileA);
        oet.d().a(new oer(str, null, file, fileA, progressListener));
    }

    public static void e(String str, String str2) {
        LogUtil.a("HealthCloudConfigUtils", "enter setLocalFileVer.");
        lua.j(String.valueOf(20006), str + "_localVer", str2);
    }

    private static String g(String str) {
        String strC = lua.c(String.valueOf(20006), str + "_localVer", String.valueOf(0L));
        LogUtil.a("HealthCloudConfigUtils", "getLocalFileVer localVer ", strC);
        return strC;
    }

    private static String d(fcz fczVar, String str) {
        String strE;
        LogUtil.a("HealthCloudConfigUtils", "enter getDownloadUrl");
        List<fcw> listA = fczVar.a();
        int i = 0;
        while (true) {
            if (i >= listA.size()) {
                strE = null;
                break;
            }
            if (str.equals(listA.get(i).c())) {
                strE = listA.get(i).e();
                break;
            }
            i++;
        }
        if (!TextUtils.isEmpty(strE)) {
            return strE;
        }
        LogUtil.j("HealthCloudConfigUtils", "ver is null or empty.");
        return null;
    }

    private static long b(String str) {
        LogUtil.a("HealthCloudConfigUtils", "enter getLatestCheckVersionTime");
        long jB = lua.b(String.valueOf(20006), str + "_latestCheckVersionTime", 0L);
        if (jB != 0) {
            return jB;
        }
        LogUtil.j("HealthCloudConfigUtils", "latestCheckVersion is null or 0");
        return 0L;
    }

    private static void a(String str, long j) {
        LogUtil.a("HealthCloudConfigUtils", "enter setLatestCheckVersionTime");
        lua.g(String.valueOf(20006), str + "_latestCheckVersionTime", j);
    }

    public static void a() throws Throwable {
        boolean zC = HandlerExecutor.c();
        ReleaseLogUtil.c("R_HealthCloudConfigUtils", "setCommonFeatureConfig isMainThread ", Boolean.valueOf(zC));
        if (zC) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: feh
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    fdy.a();
                }
            });
            return;
        }
        lua.h(String.valueOf(20006), "commonFeatureConfig", CommonUtil.q(xjl.a() + File.separator + Utils.SERVICE_HEALTH_CLOUD + File.separator + "com.huawei.health_common_config" + File.separator + "commonFeatureConfig.json"));
    }

    public static fdf e() {
        return (fdf) HiJsonUtil.d(lua.d(String.valueOf(20006), "commonFeatureConfig", ""), fdf.class);
    }

    public static Map<?, ?> c(fdf fdfVar) {
        if (fdfVar == null) {
            ReleaseLogUtil.d("R_HealthCloudConfigUtils", "getCountryFeatureMap commonFeatureConfig is null");
            return null;
        }
        List<fdh> listC = fdfVar.c();
        if (CollectionUtils.a(listC)) {
            ReleaseLogUtil.d("R_HealthCloudConfigUtils", "getCountryFeatureMap list ", listC);
            return null;
        }
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1010);
        for (fdh fdhVar : listC) {
            if (fdhVar != null) {
                List<String> listB = fdhVar.b();
                if (!CollectionUtils.a(listB) && listB.contains(accountInfo)) {
                    return fdhVar.e();
                }
            }
        }
        return null;
    }

    public static Map<?, ?> e(fdf fdfVar) {
        if (fdfVar == null) {
            ReleaseLogUtil.d("R_HealthCloudConfigUtils", "getDefaultFeatureMap commonFeatureConfig is null");
            return null;
        }
        List<fdh> listC = fdfVar.c();
        if (CollectionUtils.a(listC)) {
            ReleaseLogUtil.d("R_HealthCloudConfigUtils", "getDefaultFeatureMap list ", listC);
            return null;
        }
        for (fdh fdhVar : listC) {
            if (fdhVar != null) {
                List<String> listB = fdhVar.b();
                if (!CollectionUtils.a(listB) && listB.contains("default")) {
                    return fdhVar.e();
                }
            }
        }
        return null;
    }
}

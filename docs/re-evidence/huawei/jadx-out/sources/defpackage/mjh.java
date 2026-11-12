package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.NetworkType;
import androidx.work.OneTimeWorkRequest;
import androidx.work.multiprocess.RemoteWorkManager;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.manager.powerkit.PowerKitManager;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.datatypes.TransferFileInfo;
import com.huawei.hwcrowdtestapi.HealthFeedbackParams;
import com.huawei.hwcrowdtestapi.HealthSendLogCallback;
import com.huawei.hwdevice.mainprocess.mgr.hwdfxmgr.callback.DeviceDfxUploadCallback;
import com.huawei.hwdevice.phoneprocess.util.LogUploadWorker;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwlogsmodel.common.LogConfig;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.openalliance.ad.constant.VastAttribute;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import com.huawei.phoneservice.faq.base.constants.FaqConstants;
import com.huawei.thirdloginbasemodule.ThirdLoginDataStorageUtil;
import com.huawei.wisecloud.drmclient.license.HwDrmConstant;
import health.compact.a.CommonUtil;
import health.compact.a.CompileParameterUtil;
import health.compact.a.EnvironmentUtils;
import health.compact.a.HwEncryptUtil;
import health.compact.a.KeyValDbManager;
import health.compact.a.ProcessUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.utils.StringUtils;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.apache.commons.io.FileUtils;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes10.dex */
public final class mjh {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f41743c = n();
    public static final String e = l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f41741a = LogConfig.k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f41742b = BaseApplication.getAppPackage() + ".h5pro";
    private static final String g = LogConfig.h();
    private static volatile DeviceDfxUploadCallback q = null;
    private static final Object d = new Object();
    private static final Object j = new Object();
    private static List<File> p = new ArrayList(16);
    private static List<String> o = new ArrayList(16);
    private static List<String> t = new ArrayList(16);
    private static String s = null;
    private static String r = "";
    private static final String f = ProcessUtil.e("_PhoneService");
    private static final String i = ProcessUtil.e("_DaemonService");
    private static final int h = 14;
    private static boolean l = false;
    private static boolean m = false;
    private static long k = 0;
    private static ExecutorService n = Executors.newSingleThreadExecutor();

    private static boolean c(int i2) {
        return i2 == 5 || i2 == 1 || i2 == 7 || i2 == 14 || i2 == 2 || i2 == 3 || i2 == 8 || i2 == 13 || i2 == 15 || i2 == 16;
    }

    private mjh() {
    }

    public static boolean e(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isAvailable() && activeNetworkInfo.isConnected() && !PowerKitManager.a().b() && activeNetworkInfo.getType() == 1;
    }

    public static boolean b(Context context) {
        return CommonUtil.ab(context);
    }

    public static void d(boolean z) {
        l = z;
    }

    public static void a(boolean z) {
        LogUtil.a("UploadLogUtil", "setSendFeedbackUseFlow, isUseFlow:", Boolean.valueOf(z));
        m = z;
    }

    public static boolean d() {
        return l;
    }

    public static boolean o(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("UploadLogUtil", "isHasZip path is empty");
            return false;
        }
        File file = new File(str);
        if (!file.exists()) {
            LogUtil.d("UploadLogUtil", "isHasZip isExits:", Boolean.valueOf(file.mkdirs()));
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length <= 0) {
            return false;
        }
        boolean z = false;
        for (File file2 : fileArrListFiles) {
            if (file2.getName().contains("WearAPPBeta") || file2.getName().contains("WearableBeta")) {
                z = true;
            }
        }
        return z;
    }

    private static long k() {
        File file = new File(f41743c);
        if (!file.exists()) {
            LogUtil.d("UploadLogUtil", "getZipLength isExits: ", Boolean.valueOf(file.mkdirs()));
        }
        File[] fileArrListFiles = file.listFiles();
        long length = 0;
        if (fileArrListFiles != null && fileArrListFiles.length > 0) {
            for (File file2 : fileArrListFiles) {
                if (file2.getName().contains("WearAPPBeta") || file2.getName().contains("WearableBeta")) {
                    length += file2.length();
                }
            }
        }
        LogUtil.a("UploadLogUtil", "log total size: ", Long.valueOf(length));
        return length;
    }

    private static void a(File file, String str) {
        LinkedList<File> linkedListC;
        String path = file.getPath();
        LogUtil.a("UploadLogUtil", "encryFilePath: ", path);
        if (TextUtils.isEmpty(path)) {
            LogUtil.a("UploadLogUtil", "encryFilePath is null.");
            return;
        }
        File file2 = new File(path);
        try {
            LogUtil.a("UploadLogUtil", "encryFilePath: ", file2.getCanonicalPath());
        } catch (IOException e2) {
            LogUtil.a("UploadLogUtil", "deleteEncryFile:", e2.getMessage());
        }
        if (file2.exists()) {
            if (!file2.isDirectory()) {
                if (file2.getName().contains(a(j(str))) || file2.getName().contains("bigdata.log")) {
                    LogUtil.a("UploadLogUtil", "encryFile delete :", Boolean.valueOf(file2.delete()));
                    return;
                } else {
                    LogUtil.d("UploadLogUtil", "encryFile delete fail!");
                    return;
                }
            }
            try {
                linkedListC = mjm.c(file2.getCanonicalPath());
            } catch (IOException e3) {
                LogUtil.a("UploadLogUtil", "deleteEncryFile()", e3.getMessage());
                linkedListC = null;
            }
            c(linkedListC, str);
            return;
        }
        LogUtil.d("UploadLogUtil", "encryFile not exists!");
    }

    private static void c(List<File> list, String str) {
        if (list != null) {
            for (File file : list) {
                LogUtil.d("UploadLogUtil", "deleteFiles file.path = " + file.getAbsolutePath());
                a(file, str);
                LogUtil.d("UploadLogUtil", "deleteFiles file.exist = " + new File(file.getAbsolutePath()).exists());
            }
        }
    }

    private static void a(Context context, String str, String str2) {
        synchronized (j) {
            o.add(str);
        }
        LogUtil.a("UploadLogUtil", "add file: ", str);
        a(context, str, 0, str2);
    }

    private static void a(final Context context, final String str, final int i2, String str2) {
        LogUtil.a("UploadLogUtil", "startUploadLog deviceDataId: ", CommonUtil.n(str2) + ", targetPath = " + str);
        final String strD = d(str, str2);
        if (i2 == 0) {
            d(context, strD);
            k = System.currentTimeMillis();
            SharedPreferenceManager.d(context, System.currentTimeMillis(), "EXCE_DFT_APP_UPLOADSTART");
            DeviceInfo deviceInfoJ = j(strD);
            if (deviceInfoJ != null) {
                String strA = a(deviceInfoJ);
                r = u(str);
                e("910402", "EXCE_DFT_APP_UPLOADSTART", e(k) + "", strA);
            }
        }
        LogUtil.a("UploadLogUtil", "setIntentData Assemble uploaded fields targetPath is ", str);
        HealthFeedbackParams healthFeedbackParams = new HealthFeedbackParams();
        b(healthFeedbackParams, str, strD);
        LogUtil.a("UploadLogUtil", "setIntentData Assemble uploaded fields targetPath isExist = " + new File(str).exists() + ", HealthCrowdTestProxy.sendLog");
        ltr.b().sendLog(context, healthFeedbackParams, str, false, true, new HealthSendLogCallback() { // from class: mjh.3
            @Override // com.huawei.hwcrowdtestapi.HealthSendLogCallback
            public void onSuccess(String str3) {
                synchronized (mjh.j) {
                    mjh.o.remove(str);
                }
                mjh.a(str3, str, i2, mjh.k, strD);
            }

            @Override // com.huawei.hwcrowdtestapi.HealthSendLogCallback
            public void onFailed(String str3) {
                DeviceInfo deviceInfoJ2;
                synchronized (mjh.j) {
                    mjh.o.remove(str);
                }
                LogUtil.a("UploadLogUtil", "startUploadLog: file ", str, " upload failed: ", str3);
                if (i2 != 0 || (deviceInfoJ2 = mjh.j(strD)) == null) {
                    return;
                }
                SharedPreferenceManager.a(context, ParamConstants.CallbackMethod.ON_FAIL, "EXCE_DFT_APP_UPLOADRESULT");
                mjh.d(context, strD);
                String unused = mjh.r = mjh.u(str);
                mjh.e("910403", "EXCE_DFT_APP_UPLOADSTOP", ((System.currentTimeMillis() - mjh.k) / 1000) + "", mjh.a(deviceInfoJ2));
            }
        });
    }

    private static String d(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            if (TextUtils.isEmpty(str)) {
                ReleaseLogUtil.a("Dfx_UploadLogUtil", "targetPath is null or empty");
                return "";
            }
            List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "UploadLogUtil");
            if (deviceList == null || deviceList.size() == 0) {
                return "";
            }
            for (DeviceInfo deviceInfo : deviceList) {
                String strA = a(deviceInfo);
                if (TextUtils.isEmpty(strA)) {
                    ReleaseLogUtil.a("Dfx_UploadLogUtil", "shaDeviceId is null or empty");
                } else if (str.contains(strA)) {
                    return deviceInfo.getDeviceIdentify();
                }
            }
        }
        return str2;
    }

    public static void a(Context context, String str, String str2, String str3, String str4) {
        DeviceInfo deviceInfoB;
        if (EnvironmentUtils.d()) {
            deviceInfoB = mgg.d("UploadLogUtil");
            if (deviceInfoB == null) {
                deviceInfoB = mgi.c("UploadLogUtil");
            }
        } else if (EnvironmentUtils.e()) {
            deviceInfoB = myk.b("UploadLogUtil");
            if (deviceInfoB == null) {
                deviceInfoB = myk.d("UploadLogUtil");
            }
        } else {
            LogUtil.j("UploadLogUtil", "addOtaCoreSleepLog other Process");
            deviceInfoB = null;
        }
        if (deviceInfoB != null) {
            String strA = a(deviceInfoB);
            d(context, deviceInfoB.getDeviceIdentify());
            d(str, str2, str3, str4, strA);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String u(String str) {
        int iLastIndexOf = str.lastIndexOf("/");
        if (iLastIndexOf == -1) {
            return str;
        }
        String strSubstring = str.substring(iLastIndexOf + 1, str.length());
        return strSubstring.length() > 4 ? strSubstring.substring(0, strSubstring.length() - 4) : strSubstring;
    }

    private static void b(HealthFeedbackParams healthFeedbackParams, String str, String str2) {
        String strD;
        String strReplace;
        int iLastIndexOf = str.lastIndexOf("/");
        if (iLastIndexOf != -1) {
            String strSubstring = str.substring(iLastIndexOf + 1, str.length());
            LogUtil.a("UploadLogUtil", "fileNamePath: ", strSubstring);
            String[] strArrSplit = strSubstring.split("_");
            if (strArrSplit != null && strArrSplit.length > 0) {
                strD = d(strArrSplit[0]);
            } else {
                strD = "WEAR";
            }
            DeviceInfo deviceInfoJ = j(str2);
            if (deviceInfoJ == null) {
                strReplace = "0000000000000000";
            } else {
                strReplace = deviceInfoJ.getSecurityDeviceId();
                LogUtil.a("UploadLogUtil", "addUploadParams deviceInfo is not null");
            }
            LogUtil.a("UploadLogUtil", "addUploadParams deviceDataId: ", CommonUtil.n(str2), ";deviceData: ", CommonUtil.n(strReplace));
            if (!TextUtils.isEmpty(strReplace) && strReplace.contains(":")) {
                strReplace = strReplace.replace(":", "");
            }
            CommonUtil.z(strReplace);
            healthFeedbackParams.setDeviceModel(strD);
            if (!TextUtils.isEmpty(strReplace)) {
                healthFeedbackParams.setDeviceSn(strReplace);
            }
            if (Utils.o()) {
                healthFeedbackParams.setProductType(20);
            } else {
                healthFeedbackParams.setProductType(1);
            }
        }
    }

    public static String d(String str) {
        if (str == null) {
            return "WEAR";
        }
        for (String str2 : mgs.f41663a) {
            if (str.toUpperCase(Locale.ENGLISH).contains(str2.toUpperCase(Locale.ENGLISH))) {
                return str2;
            }
        }
        return "WEAR";
    }

    public static boolean h(String str) {
        String strA = a(j(str));
        if (StringUtils.g(strA)) {
            LogUtil.a("UploadLogUtil", "shaDeviceId is null or empty");
            return false;
        }
        LinkedList<File> linkedListB = mjm.b(CommonUtil.c(g));
        if (linkedListB == null) {
            LogUtil.a("UploadLogUtil", "equalUpgLog otaFiles is null.");
            return false;
        }
        Iterator<File> it = linkedListB.iterator();
        while (it.hasNext()) {
            if (it.next().getName().contains(strA)) {
                LogUtil.a("UploadLogUtil", "this device's upg log is exists.");
                return true;
            }
        }
        return false;
    }

    public static void s(final String str) {
        n.execute(new Runnable() { // from class: mjh.1
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.a("UploadLogUtil", "Mobile. Upload all zip files");
                if (mjh.o(mjh.f41743c)) {
                    mjh.h(mjh.f41743c, str);
                }
                if (mjh.o(mjh.e)) {
                    mjh.h(mjh.e, str);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h(String str, String str2) {
        File[] fileArrListFiles = new File(str).listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            LogUtil.a("UploadLogUtil", "startUploadLogWithNetwork files is null");
            return;
        }
        for (File file : fileArrListFiles) {
            if (m) {
                LogUtil.d("UploadLogUtil", "startUploadLogWithNetwork, isSendFeedbackUseFlow");
                String str3 = str + file.getName();
                if (v(str3)) {
                    LogUtil.a("UploadLogUtil", "targetPath: ", str3);
                    t.remove(str3);
                    e(BaseApplication.getContext(), file, str3, str2);
                }
            } else if (file.getName().contains("WearAPPBeta") || file.getName().contains("WearableBeta")) {
                String str4 = str + file.getName();
                if (j(file.getName(), "uploadLogWithNetwork")) {
                    return;
                } else {
                    a(BaseApplication.getContext(), str4, str2);
                }
            }
        }
        m = false;
    }

    private static boolean v(String str) {
        for (int i2 = 0; i2 < t.size(); i2++) {
            if (str.equals(t.get(i2))) {
                return true;
            }
        }
        return false;
    }

    private static void e(Context context, File file, String str, String str2) {
        if (j(file.getName(), "filterUploadLog")) {
            return;
        }
        if ((file.getName().contains("WearAPPBeta") || file.getName().contains("WearableBeta")) && file.getName().contains("device")) {
            a(context, str, str2);
        }
    }

    public static void c(DeviceDfxUploadCallback deviceDfxUploadCallback) {
        q = deviceDfxUploadCallback;
    }

    public static void e(Context context, boolean z, String str) throws Throwable {
        LogUtil.a("UploadLogUtil", "uploadLog isAuto is: ", Boolean.valueOf(z));
        LogUtil.a("UploadLogUtil", "isHasZip: ", Boolean.valueOf(o(f41743c)), " isHasHonorZip: ", Boolean.valueOf(o(e)));
        if (z(str)) {
            if (!l) {
                d(context, z, str);
            }
            String str2 = f41741a + "com.huawei.version.json";
            File file = new File(str2);
            if (file.exists()) {
                LogUtil.d("UploadLogUtil", "version delete is ", Boolean.valueOf(file.delete()));
            }
            try {
                if (file.createNewFile()) {
                    a(context, str2);
                } else {
                    LogUtil.d("UploadLogUtil", "createNewFile failed!");
                }
            } catch (IOException e2) {
                LogUtil.e("UploadLogUtil", "PackageManager.IOException is:" + e2.getMessage());
            } catch (OutOfMemoryError unused) {
                LogUtil.d("UploadLogUtil", "uploadLog OutOfMemoryError");
            }
            s = null;
            if (CompileParameterUtil.d("SUPPORT_LOG_FEEDBACK")) {
                c(str, z);
            }
            c(context, z, str);
            if (m) {
                LogUtil.a("UploadLogUtil", "isSendFeedbackUseFlow");
                s(str);
            }
            if (!l || q == null) {
                return;
            }
            q.startUpload(k());
            q = null;
        }
    }

    private static void c(String str, boolean z) {
        LogUtil.a("UploadLogUtil", "createTempFile enter");
        DeviceInfo deviceInfoJ = j(str);
        if (deviceInfoJ != null) {
            if (!(q(deviceInfoJ.getDeviceIdentify()) && z) && k(str)) {
                int productType = deviceInfoJ.getProductType();
                String deviceModel = deviceInfoJ.getDeviceModel();
                String strA = a(productType, e(productType, deviceModel), deviceModel);
                String udidFromDevice = deviceInfoJ.getUdidFromDevice();
                if (TextUtils.isEmpty(udidFromDevice)) {
                    String deviceIdentify = deviceInfoJ.getDeviceIdentify();
                    if (deviceIdentify == null) {
                        return;
                    }
                    String securityDeviceId = deviceInfoJ.getSecurityDeviceId();
                    String str2 = securityDeviceId + deviceIdentify;
                    if (!deviceIdentify.equals(securityDeviceId)) {
                        deviceIdentify = str2;
                    }
                    if (deviceInfoJ.getProductType() >= 34 && !Utils.o()) {
                        udidFromDevice = nio.c(deviceIdentify);
                    } else {
                        udidFromDevice = l(securityDeviceId);
                    }
                }
                String str3 = new SimpleDateFormat(HwDrmConstant.TIME_FORMAT, Locale.ENGLISH).format(new Date());
                String str4 = f41741a + "MaintenanceLog/";
                ab(str4);
                s = str4 + strA + "_" + deviceInfoJ.getSoftVersion() + "_" + udidFromDevice + "_" + str3 + "_WearableBeta.log";
                try {
                    if (new File(s).createNewFile()) {
                        return;
                    }
                    LogUtil.a("UploadLogUtil", "dir file fail");
                } catch (IOException e2) {
                    LogUtil.e("UploadLogUtil", "create dir file IOException:" + e2.getMessage());
                }
            }
        }
    }

    private static void ab(String str) {
        if (str == null) {
            return;
        }
        File file = new File(str);
        if (!file.exists()) {
            LogUtil.a("UploadLogUtil", "mkdirs is ", Boolean.valueOf(file.mkdirs()));
            return;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            LogUtil.a("UploadLogUtil", "file delete is", Boolean.valueOf(file2.delete()));
        }
    }

    public static void d(Context context, boolean z, String str) {
        if (z && mjq.e(context)) {
            LogUtil.j("UploadLogUtil", "uploadZip:isAuto isBatteryControl not upload");
            return;
        }
        String str2 = f41743c;
        p(str2);
        String str3 = e;
        p(str3);
        LogUtil.a("UploadLogUtil", "uploadZip ENCYPTION_PATH: " + str2 + ", isHasZip = " + o(str2));
        boolean zE = e(context);
        LogUtil.a("UploadLogUtil", "uploadZip isWifi: ", Boolean.valueOf(zE));
        if (zE) {
            LogUtil.a("UploadLogUtil", "uploadLog External conditions met");
            if (o(str2)) {
                f(str2, str);
            }
            if (o(str3)) {
                f(str3, str);
            }
        }
    }

    private static void f(String str, String str2) {
        LogUtil.a("UploadLogUtil", "startUploadZipFile path:", str);
        File[] fileArrListFiles = new File(str).listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            LogUtil.a("UploadLogUtil", "uploadZip files is null.");
            return;
        }
        for (File file : fileArrListFiles) {
            LogUtil.a("UploadLogUtil", "startUploadZipFile file path: " + file.getAbsolutePath());
            e(file.getName(), str, BaseApplication.getContext(), str2);
        }
    }

    private static boolean z(String str) {
        boolean zC = niz.c();
        boolean zO = Utils.o();
        LogUtil.a("UploadLogUtil", "isTiyan = ", Boolean.valueOf(zC), " BuildConfig.SUPPORT_LOG_FEEDBACK = ", Boolean.valueOf(CompileParameterUtil.d("SUPPORT_LOG_FEEDBACK")), "isOversea = ", Boolean.valueOf(zO));
        boolean z = CompileParameterUtil.d("SUPPORT_LOG_FEEDBACK") && zC;
        return (z && !zO) || (zO && (z && w(str) && "true".equals(KeyValDbManager.d(BaseApplication.getContext()).c("is_support_dfx_status"))));
    }

    private static boolean w(String str) {
        return eey.d(j(str), 34);
    }

    public static boolean g() {
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10), "upload_big_data_last_time");
        if (TextUtils.isEmpty(strE)) {
            ReleaseLogUtil.e("Dfx_UploadLogUtil", "logCanUploadBigData lastTime is isEmpty, isCanUploadBigData is true");
            return true;
        }
        String strJ = j();
        if (TextUtils.isEmpty(strJ)) {
            LogUtil.a("UploadLogUtil", "isMoreThanOneDay currentTime is isEmpty, isCanUploadBigData is false");
            return false;
        }
        ReleaseLogUtil.d("Dfx_UploadLogUtil", "isMoreThanOneDay, lastTime: ", strE, ", currentTime: ", strJ);
        try {
            if (Long.parseLong(strJ) - Long.parseLong(strE) >= 86400000) {
                SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10), "upload_big_data_last_time", "", null);
                ReleaseLogUtil.d("Dfx_UploadLogUtil", "isMoreThanOneDay moreThan 24 hour, isCanUploadBigData is true");
                return true;
            }
        } catch (NumberFormatException unused) {
            ReleaseLogUtil.a("Dfx_UploadLogUtil", "isMoreThanOneDay NumberFormatException");
        }
        return false;
    }

    public static boolean f() {
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(9), "upload_ota_data_last_time");
        if (TextUtils.isEmpty(strE)) {
            ReleaseLogUtil.e("Dfx_UploadLogUtil", "logCanUploadOTAData lastTime is isEmpty, isCanUploadOTAData is true");
            return true;
        }
        String strJ = j();
        if (TextUtils.isEmpty(strJ)) {
            ReleaseLogUtil.e("Dfx_UploadLogUtil", "isMoreThanOneDay currentTime is isEmpty, isCanUploadOTAData is false");
            return false;
        }
        ReleaseLogUtil.d("Dfx_UploadLogUtil", "isMoreThanOneDay, lastTime: ", strE, ", currentTime: ", strJ);
        try {
            if (Long.parseLong(strJ) - Long.parseLong(strE) >= 86400000) {
                SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(9), "upload_ota_data_last_time", "", null);
                ReleaseLogUtil.d("Dfx_UploadLogUtil", "isMoreThanOneDay moreThan 24 hour, isCanUploadOTAData is true");
                return true;
            }
        } catch (NumberFormatException unused) {
            ReleaseLogUtil.a("Dfx_UploadLogUtil", "isMoreThanOneDay NumberFormatException");
        }
        return false;
    }

    private static String j() {
        long time = Calendar.getInstance().getTime().getTime();
        LogUtil.e("UploadLogUtil", "getDayDateTime: strCurTime: ", String.valueOf(time));
        return String.valueOf(time);
    }

    public static void e(Context context, String str) throws Throwable {
        p(f41743c);
        p(e);
        boolean zE = e(context);
        boolean zO = o();
        boolean zC = niz.c();
        boolean zY = y(str);
        boolean zO2 = Utils.o();
        ReleaseLogUtil.d("Dfx_UploadLogUtil", "isOversea: ", Boolean.valueOf(zO2), " isWifi: ", Boolean.valueOf(zE), " isHasEventLog: ", Boolean.valueOf(zO), " isHasCrash: ", false, " isTiyan: ", Boolean.valueOf(zC), " isHasDeviceEventLog: ", Boolean.valueOf(zY));
        if ((loj.c(48) || zO2) && zC) {
            if (zY) {
                c(context, str);
            }
            if (zE) {
                ReleaseLogUtil.d("Dfx_UploadLogUtil", "uploadReleaseEventLog upload device log file");
                f(context, str);
            }
        }
    }

    private static boolean o() {
        File file = new File(f41743c);
        if (!file.exists()) {
            LogUtil.d("UploadLogUtil", "isExits: ", Boolean.valueOf(file.mkdirs()));
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length <= 0) {
            return false;
        }
        boolean z = false;
        for (File file2 : fileArrListFiles) {
            if (file2.getName().toLowerCase(Locale.ENGLISH).contains("event") || file2.getName().toLowerCase(Locale.ENGLISH).contains(VastAttribute.ERROR) || file2.getName().toLowerCase(Locale.ENGLISH).contains("wearablebeta_dump.log")) {
                z = true;
            }
        }
        return z;
    }

    private static boolean y(String str) {
        File file = new File(f41741a + "MaintenanceLog");
        if (!file.exists()) {
            LogUtil.d("UploadLogUtil", "isExits: ", Boolean.valueOf(file.mkdirs()));
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null && fileArrListFiles.length > 0) {
            for (File file2 : fileArrListFiles) {
                LogUtil.a("UploadLogUtil", "isHasDeviceEventLog file is: ", file2.getName());
                String strC = CommonUtil.c(file2.getName());
                if (strC != null && b(strC, str)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static void f(Context context, String str) {
        ReleaseLogUtil.d("Dfx_UploadLogUtil", "uploadReleaseLog()");
        if (mjq.e(context)) {
            LogUtil.j("UploadLogUtil", "uploadReleaseEventLog:isAuto isBatteryControl not upload");
        } else {
            e(context, f41743c, str);
            e(context, e, str);
        }
    }

    private static void e(Context context, String str, String str2) {
        List<File> listA = a(str, str2);
        if (njy.e(listA)) {
            ReleaseLogUtil.e("Dfx_UploadLogUtil", "uploadReleaseLog deviceFileList.isEmpty");
            return;
        }
        Gson gson = new Gson();
        for (File file : listA) {
            String name = file.getName();
            String str3 = str + file.getName();
            ReleaseLogUtil.d("Dfx_UploadLogUtil", "targetPath: ", str3);
            if (e(context) && a(name)) {
                if (TextUtils.isEmpty(str2)) {
                    if (str3.contains("bigdata.log")) {
                        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10), "upload_big_data_last_time", j(), null);
                    }
                    if (str3.contains("gpu_update.log")) {
                        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(9), "upload_ota_data_last_time", j(), null);
                    }
                }
                a(name, gson);
                b(context, str3, name, str2);
            }
        }
    }

    public static boolean a(String str) {
        ReleaseLogUtil.d("Dfx_UploadLogUtil", "checkIsSupportReUpload fileName = ", str);
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10), "upload_block_file_record");
        if (TextUtils.isEmpty(strE)) {
            return true;
        }
        for (String str2 : strE.split("#")) {
            if (!TextUtils.isEmpty(str2) && str2.equals(str)) {
                ReleaseLogUtil.e("Dfx_UploadLogUtil", "checkIsErrorCodeSupportUpload not support");
                return false;
            }
        }
        return true;
    }

    public static void c(String str) {
        ReleaseLogUtil.d("Dfx_UploadLogUtil", "addNotRetryFile");
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10), "upload_block_file_record");
        if (strE == null) {
            strE = "";
        }
        if (strE.contains(str)) {
            ReleaseLogUtil.e("Dfx_UploadLogUtil", "addNotRetryFile added already");
            return;
        }
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10), "upload_block_file_record", strE + str + "#", null);
    }

    public static void m(String str) {
        ReleaseLogUtil.d("Dfx_UploadLogUtil", "removeDeletedFile fileName = ", str);
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10), "upload_block_file_record");
        if (strE == null) {
            strE = "";
        }
        if (!strE.contains(str)) {
            ReleaseLogUtil.e("Dfx_UploadLogUtil", "removeDeletedFile removed already");
            return;
        }
        String[] strArrSplit = strE.split("#");
        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
            if (strArrSplit[i2].equals(str)) {
                strArrSplit[i2] = "";
                break;
            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (String str2 : strArrSplit) {
            if (!TextUtils.isEmpty(str2)) {
                stringBuffer.append(str2).append("#");
            }
        }
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10), "upload_block_file_record", stringBuffer.toString(), null);
    }

    public static List<String> b(Gson gson) {
        if (gson == null) {
            LogUtil.j("UploadLogUtil", "gson is null.");
            gson = new Gson();
        }
        ReleaseLogUtil.d("Dfx_UploadLogUtil", "getUploadTriggerList");
        try {
            List<String> listC = c(SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10), "upload_file_record"), gson);
            if (listC == null || listC.size() < 1) {
                ReleaseLogUtil.e("Dfx_UploadLogUtil", "getUploadTriggerList is Empty");
                return new ArrayList();
            }
            ReleaseLogUtil.d("Dfx_UploadLogUtil", "getUploadTriggerList size = ", Integer.valueOf(listC.size()));
            return listC;
        } catch (JsonSyntaxException unused) {
            ReleaseLogUtil.a("Dfx_UploadLogUtil", "getUploadTriggerList jsonSyntaxException");
            return new ArrayList();
        } catch (NumberFormatException unused2) {
            ReleaseLogUtil.a("Dfx_UploadLogUtil", "getUploadTriggerList NumberFormatException");
            return new ArrayList();
        } catch (OutOfMemoryError unused3) {
            ReleaseLogUtil.a("Dfx_UploadLogUtil", "getUploadTriggerList OutOfMemoryError");
            n(", setFeedBackReleaseEvent getUploadTriggerList OutOfMemoryError");
            return new ArrayList();
        }
    }

    public static void c(List<String> list) {
        ReleaseLogUtil.d("Dfx_UploadLogUtil", "updateUploadTriggerList enter");
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10), "upload_file_record", b(list), null);
    }

    public static void a(String str, Gson gson) {
        ReleaseLogUtil.d("Dfx_UploadLogUtil", "checkUploadTriggerFile");
        List<String> listB = b(gson);
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.e("Dfx_UploadLogUtil", "checkUploadTriggerFile file error");
            return;
        }
        if (listB.isEmpty()) {
            ReleaseLogUtil.e("Dfx_UploadLogUtil", "checkUploadTriggerFile uploadStringList.isEmpty");
            listB.add(str);
        } else {
            if (listB.contains(str)) {
                ReleaseLogUtil.e("Dfx_UploadLogUtil", "checkUploadTriggerFile recorded trigger");
                n("UploadLogUtil, setFeedBackReleaseEvent repeat file name = " + str);
                return;
            }
            ReleaseLogUtil.d("Dfx_UploadLogUtil", "checkUploadTriggerFile new trigger");
            listB.add(str);
        }
        c(listB);
    }

    public static void c(String str, String str2, Gson gson) {
        ReleaseLogUtil.d("Dfx_UploadLogUtil", "updateUploadTriggerFileSuccess, tag = ", str2);
        File file = new File(str);
        if (!file.exists() || TextUtils.isEmpty(file.getName())) {
            ReleaseLogUtil.e("Dfx_UploadLogUtil", "updateUploadTriggerFileSuccess file error");
            return;
        }
        String name = file.getName();
        List<String> listB = b(gson);
        if (listB.isEmpty()) {
            ReleaseLogUtil.e("Dfx_UploadLogUtil", "updateUploadTriggerFileSuccess uploadStringList.isEmpty");
        } else {
            if (listB.contains(name)) {
                ReleaseLogUtil.d("Dfx_UploadLogUtil", "updateUploadTriggerFileSuccess recorded trigger");
                listB.remove(name);
                c(listB);
                return;
            }
            ReleaseLogUtil.e("Dfx_UploadLogUtil", "updateUploadTriggerFileSuccess not found file");
        }
    }

    private static List<String> c(String str, Gson gson) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.d("Dfx_UploadLogUtil", "getCacheUploadTriggerList cachedPreferenceValue = isEmpty");
            return arrayList;
        }
        if (str.contains("#")) {
            String[] strArrSplit = str.split("#");
            ReleaseLogUtil.d("Dfx_UploadLogUtil", "getCacheUploadTriggerList tempFileList = ", Integer.valueOf(strArrSplit.length));
            for (String str2 : strArrSplit) {
                if (!TextUtils.isEmpty(str2)) {
                    arrayList.add(str2);
                }
            }
            return arrayList;
        }
        List<String> list = (List) gson.fromJson(str, new TypeToken<List<String>>() { // from class: com.huawei.hwdevice.outofprocess.util.hwdfx.UploadLogUtil$3
        }.getType());
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10), "upload_file_record", b(list), null);
        return list;
    }

    private static String b(List<String> list) {
        ReleaseLogUtil.d("Dfx_UploadLogUtil", "transformTriggerList enter size = ", Integer.valueOf(list.size()));
        StringBuffer stringBuffer = new StringBuffer();
        if (njy.b(list)) {
            for (String str : list) {
                if (!TextUtils.isEmpty(str)) {
                    stringBuffer.append(str).append("#");
                }
            }
        }
        return stringBuffer.toString();
    }

    public static void n(String str) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(4);
        linkedHashMap.put("keyWords", "FeedBackKey");
        linkedHashMap.put("messages", str);
        OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_FEEDBACK_RELEASE_REPEAT_2129038.value(), linkedHashMap);
    }

    private static List<File> a(String str, String str2) {
        LinkedList linkedList = new LinkedList();
        File[] fileArrListFiles = new File(str).listFiles();
        if (fileArrListFiles != null && fileArrListFiles.length != 0) {
            for (File file : fileArrListFiles) {
                String strC = CommonUtil.c(file.getName());
                LogUtil.a("UploadLogUtil", "getEventLogList fileName: ", strC);
                if (strC != null) {
                    if (b(strC, str2)) {
                        linkedList.add(file);
                    } else {
                        a(file, str2);
                    }
                }
            }
        }
        return linkedList;
    }

    private static void b(Context context, String str, String str2, String str3) {
        Data.Builder builderPutString = new Data.Builder().putString("x-huid", m()).putString("x-version", CommonUtil.a(context)).putLong("ts", new Date().getTime()).putInt("tokenType", ThirdLoginDataStorageUtil.getTokenTypeValue()).putString("appId", context.getPackageName()).putInt("siteId", Integer.valueOf(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1009)).intValue()).putInt("iversion", 1).putInt("source", 2).putString("filePath", str).putString("countryCode", LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1010)).putString("osVersion", Build.VERSION.RELEASE).putString("romVersion", c(BaseApplication.getContext()));
        String strE = mjj.e(str2);
        String lowerCase = "";
        if ("".equals(strE)) {
            builderPutString.putString("model", Build.MODEL).putString(FaqConstants.FAQ_EMUIVERSION, x("unknown"));
        } else {
            builderPutString.putString("model", strE).putString(FaqConstants.FAQ_EMUIVERSION, "5.0");
        }
        DeviceInfo deviceInfoJ = j(d(str, str3));
        if (deviceInfoJ == null) {
            lowerCase = "0000000000000000";
        } else {
            String strC = nio.c(deviceInfoJ.getSecurityDeviceId());
            if (!TextUtils.isEmpty(strC)) {
                lowerCase = strC.toLowerCase(Locale.ENGLISH);
            }
        }
        builderPutString.putString(FaqConstants.FAQ_SHASN, TextUtils.isEmpty(lowerCase) ? "0000000000000000" : lowerCase);
        try {
            RemoteWorkManager.getInstance(context).enqueue(new OneTimeWorkRequest.Builder(LogUploadWorker.class).setInputData(builderPutString.build()).setConstraints(new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build()).build());
        } catch (RuntimeException e2) {
            ReleaseLogUtil.a("Dfx_UploadLogUtil", "work enqueue failed:", ExceptionUtils.c(e2));
        }
    }

    private static String c(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            if (packageInfo != null) {
                return packageInfo.versionName;
            }
            return "2.0";
        } catch (PackageManager.NameNotFoundException unused) {
            LogUtil.e("UploadLogUtil", "getAppVersionName() NameNotFoundException");
            return "2.0";
        }
    }

    private static String m() {
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        return accountInfo == null ? "" : accountInfo;
    }

    private static void c(Context context, String str) throws Throwable {
        FileInputStream fileInputStream;
        int i2;
        ReleaseLogUtil.d("Dfx_UploadLogUtil", "encrypt event log, deviceId = ", CommonUtil.n(str));
        String str2 = f41741a + "MaintenanceLog";
        List<File> listA = a(str2, str);
        if (listA == null) {
            LogUtil.j("UploadLogUtil", "encryptEventLog linkedList is null");
            return;
        }
        boolean zF = f();
        FileInputStream fileInputStream2 = null;
        int i3 = 0;
        FileOutputStream fileOutputStream = null;
        int i4 = 0;
        while (i4 < listA.size()) {
            File file = listA.get(i4);
            String name = file.getName();
            if (!(name.contains("bigdata.log") && TextUtils.isEmpty(str) && !g()) && (!name.contains("gpu_update.log") || ((name.contains(a(j(str))) && !TextUtils.isEmpty(str)) || zF))) {
                try {
                    try {
                        fileInputStream = new FileInputStream(new File(CommonUtil.c(str2 + "/" + name)));
                        try {
                            int iAvailable = fileInputStream.available();
                            byte[] bArr = new byte[iAvailable + 4];
                            System.arraycopy(b(iAvailable), i3, bArr, i3, 4);
                            byte[] bArr2 = new byte[iAvailable];
                            if (fileInputStream.read(bArr2) != -1) {
                                System.arraycopy(bArr2, 0, bArr, 4, iAvailable);
                                FileOutputStream fileOutputStream2 = new FileOutputStream(new File(CommonUtil.c(mjj.b(name))));
                                try {
                                    byte[] bArrE = HwEncryptUtil.b(context).e(2, bArr);
                                    fileOutputStream2.write(bArrE, 0, bArrE.length);
                                    fileOutputStream2.flush();
                                    a(file, str);
                                    mjq.e(fileInputStream, fileOutputStream2);
                                    fileOutputStream = fileOutputStream2;
                                } catch (FileNotFoundException unused) {
                                    fileOutputStream = fileOutputStream2;
                                    fileInputStream2 = fileInputStream;
                                    LogUtil.e("UploadLogUtil", "encrypt file error FileNotFoundException");
                                    i2 = 0;
                                    mjq.e(fileInputStream2, fileOutputStream);
                                } catch (IOException unused2) {
                                    fileOutputStream = fileOutputStream2;
                                    fileInputStream2 = fileInputStream;
                                    LogUtil.e("UploadLogUtil", "encrypt file error IOException");
                                    i2 = 0;
                                    mjq.e(fileInputStream2, fileOutputStream);
                                } catch (Exception unused3) {
                                    fileOutputStream = fileOutputStream2;
                                    fileInputStream2 = fileInputStream;
                                    LogUtil.e("UploadLogUtil", "encrypt file error exception");
                                    i2 = 0;
                                    mjq.e(fileInputStream2, fileOutputStream);
                                } catch (OutOfMemoryError unused4) {
                                    fileOutputStream = fileOutputStream2;
                                    fileInputStream2 = fileInputStream;
                                    i2 = 0;
                                    LogUtil.e("UploadLogUtil", "encryptEventLog OutOfMemoryError");
                                    mjq.e(fileInputStream2, fileOutputStream);
                                } catch (Throwable th) {
                                    th = th;
                                    fileOutputStream = fileOutputStream2;
                                    mjq.e(fileInputStream, fileOutputStream);
                                    throw th;
                                }
                            } else {
                                mjq.e(fileInputStream, fileOutputStream);
                            }
                            fileInputStream2 = fileInputStream;
                            i2 = 0;
                        } catch (FileNotFoundException unused5) {
                        } catch (IOException unused6) {
                        } catch (Exception unused7) {
                        } catch (OutOfMemoryError unused8) {
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        fileInputStream = fileInputStream2;
                    }
                } catch (FileNotFoundException unused9) {
                } catch (IOException unused10) {
                } catch (Exception unused11) {
                } catch (OutOfMemoryError unused12) {
                }
            } else {
                i2 = i3;
            }
            i4++;
            i3 = i2;
        }
    }

    private static byte[] b(int i2) {
        byte[] bArr = new byte[4];
        for (int i3 = 0; i3 < 4; i3++) {
            bArr[i3] = (byte) ((i2 >> (24 - (i3 * 8))) & 255);
        }
        return bArr;
    }

    public static boolean k(String str) {
        boolean z = eej.a(str) != null && eej.a(str).isSupportSelfUploadDeviceLog();
        ReleaseLogUtil.d("Dfx_UploadLogUtil", "isSelfUploadDeviceLog: ", Boolean.valueOf(z));
        return z;
    }

    public static boolean b(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            return false;
        }
        boolean zC = cou.a().c(deviceInfo.getDeviceIdentify(), 10);
        ReleaseLogUtil.d("Dfx_UploadLogUtil", "isSupportSmartMcuDeviceLog isSupportDual: ", Boolean.valueOf(zC));
        a(deviceInfo.getDeviceIdentify(), zC);
        return zC;
    }

    private static void a(String str, boolean z) {
        LogUtil.a("UploadLogUtil", "enter setSmartMcuDeviceLogResult");
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10), str + "_mcu_device_result", String.valueOf(z), null);
    }

    private static boolean q(String str) {
        LogUtil.a("UploadLogUtil", "enter getSmartMcuDeviceLogResult");
        Context context = BaseApplication.getContext();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_mcu_device_result");
        return "true".equals(SharedPreferenceManager.e(context, String.valueOf(10), sb.toString()));
    }

    private static void i(String str, String str2) {
        LogUtil.a("UploadLogUtil", "enter setLastDeviceLogFileName");
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10), str + "_last_device_log_name", String.valueOf(str2), null);
    }

    private static String t(String str) {
        LogUtil.a("UploadLogUtil", "enter getLastDeviceLogFileName");
        return SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10), str + "_last_device_log_name");
    }

    private static void e(Context context, boolean z, boolean z2, String str) {
        LogUtil.a("UploadLogUtil", "enter UploadDevicelog");
        synchronized (d) {
            String strK = LogConfig.k();
            String str2 = f41741a + "MaintenanceLog";
            c(z2, str2, str);
            LinkedList<File> linkedListC = mjm.c(str2);
            String strReplace = "";
            if (z2 && njy.e(linkedListC)) {
                LogUtil.a("UploadLogUtil", "UploadDevicelog() deviceFileList is null.");
                i(str, "");
                return;
            }
            try {
                if (njy.b(linkedListC)) {
                    strReplace = d(linkedListC, str);
                }
                LogUtil.a("UploadLogUtil", "UploadDevicelog fullFileName: ", strReplace);
                if (!z2 && TextUtils.isEmpty(strReplace)) {
                    strReplace = t(str);
                } else {
                    i(str, strReplace);
                }
                if (!TextUtils.isEmpty(strReplace) && strReplace.contains("_")) {
                    if (strReplace.endsWith("_Beta_mcu_upg.log")) {
                        strReplace = strReplace.replace("_Beta_mcu_upg", "_WearableBeta");
                    }
                    int iIndexOf = strReplace.indexOf("_WearableBeta") + 13;
                    LogUtil.a("UploadLogUtil", "uploadDevicelog index=", Integer.valueOf(iIndexOf));
                    if (iIndexOf != -1) {
                        StringBuilder sb = new StringBuilder();
                        String str3 = f41743c;
                        sb.append(str3);
                        sb.append(strReplace.substring(0, iIndexOf));
                        sb.append(".zip");
                        String strA = mjj.a(CommonUtil.c(b(sb.toString(), z2)));
                        LogUtil.a("UploadLogUtil", "UploadDevicelog targetPath: ", strA);
                        LinkedList<File> linkedListC2 = mjm.c(strK);
                        if (linkedListC2 != null && linkedListC2.size() != 0) {
                            LogUtil.a("UploadLogUtil", "list: ", linkedListC2.toString());
                            p.clear();
                            if (z2) {
                                strA = ad(strA);
                            }
                            c(z2, linkedListC2, str);
                            c(z2, z, linkedListC, strA, str);
                            boolean zD = eey.d(j(str), 217);
                            LogUtil.a("UploadLogUtil", "UploadDeviceLog isSupportSmartWifiLog = " + zD + ", isSendFeedbackUseFlow = " + m);
                            if (!cop.h() && zD && m) {
                                LinkedList<File> linkedListD = mjm.d(str3);
                                LogUtil.a("UploadLogUtil", "UploadDeviceLog deviceListFiles: ", linkedListD.toString());
                                Iterator<File> it = linkedListD.iterator();
                                while (it.hasNext()) {
                                    t.add(f41743c + it.next().getName());
                                }
                            }
                        }
                        LogUtil.d("UploadLogUtil", "list is null");
                        return;
                    }
                    return;
                }
                LogUtil.a("UploadLogUtil", "uploadDevicelog fullFileName is null.");
            } catch (OutOfMemoryError unused) {
                LogUtil.e("UploadLogUtil", "UploadDevicelog OutOfMemoryError");
            }
        }
    }

    private static String b(String str, boolean z) {
        int iLastIndexOf = str.lastIndexOf("_");
        if (iLastIndexOf == -1) {
            return str;
        }
        if (z) {
            return str.substring(0, iLastIndexOf) + "_00000000_device" + str.substring(iLastIndexOf, str.length());
        }
        return (str.substring(0, iLastIndexOf) + "_00000000_app" + str.substring(iLastIndexOf, str.length())).replace("-HONOR", "");
    }

    private static String d(List<File> list, String str) {
        String name;
        String strA = a(j(str));
        Iterator<File> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                name = "";
                break;
            }
            File next = it.next();
            if (next.getName().contains(strA)) {
                name = next.getName();
                break;
            }
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (list.get(i2).getName().contains(strA)) {
                String name2 = list.get(i2).getName();
                boolean z = true;
                boolean z2 = name2.contains("_&_&") || name2.contains("bigdata.log");
                if (!name2.contains("_&_&") && !name2.contains("gpu_update.log")) {
                    z = false;
                }
                if (!name2.endsWith("_WearableBeta_mcu_upg.log") && !name2.endsWith("_Beta_mcu_upg.log") && !name2.endsWith("appdft_Beta.zip") && !z2 && !z) {
                    return CommonUtil.c(name2);
                }
            }
        }
        return CommonUtil.c(name);
    }

    private static void c(boolean z, String str, String str2) throws Throwable {
        if (z) {
            String str3 = g;
            File file = new File(str3);
            LogUtil.a("UploadLogUtil", "ota log path: ", str3, " devicePath: ", str, " oldFile.exists() is ", Boolean.valueOf(file.exists()));
            if (!file.exists()) {
                LogUtil.a("UploadLogUtil", "otaLogPath exists false");
                return;
            }
            File file2 = new File(str);
            if (!file2.exists()) {
                LogUtil.a("UploadLogUtil", "isSuccess = ", Boolean.valueOf(file2.mkdirs()));
            }
            String[] list = file.list();
            if (list == null) {
                LogUtil.a("UploadLogUtil", "ota log path file list = null");
                return;
            }
            for (int i2 = 0; i2 < list.length; i2++) {
                if (list[i2].endsWith("appdft_Beta.zip")) {
                    LogUtil.a("UploadLogUtil", "appdft is not cut");
                } else {
                    File file3 = new File(CommonUtil.c(g + list[i2]));
                    if (!file3.isFile() || !file3.exists()) {
                        LogUtil.d("UploadLogUtil", "enter else");
                    } else {
                        String strA = a(j(str2));
                        if (file3.getName().contains("_Beta_mcu_upg.log") && file3.getName().contains(strA)) {
                            e(a(str2, file3), str);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0147 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x00f5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x016d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private static void e(File file, String str) throws Throwable {
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream = null;
        fileOutputStreamOpenOutputStream = null;
        FileOutputStream fileOutputStreamOpenOutputStream = null;
        fileInputStream = null;
        try {
            FileInputStream fileInputStreamOpenInputStream = FileUtils.openInputStream(file);
            try {
                fileOutputStreamOpenOutputStream = FileUtils.openOutputStream(new File(CommonUtil.c(str) + File.separator + file.getName()));
                byte[] bArr = new byte[5120];
                while (true) {
                    try {
                        try {
                            int i2 = fileInputStreamOpenInputStream.read(bArr);
                            if (i2 == -1) {
                                break;
                            } else {
                                fileOutputStreamOpenOutputStream.write(bArr, 0, i2);
                            }
                        } catch (IOException unused) {
                            LogUtil.e("UploadLogUtil", "saveFile copy crashLog failed.");
                        }
                    } catch (Throwable th) {
                        fileOutputStreamOpenOutputStream.close();
                        fileInputStreamOpenInputStream.close();
                        throw th;
                    }
                }
                fileOutputStreamOpenOutputStream.flush();
                fileOutputStreamOpenOutputStream.close();
                fileInputStreamOpenInputStream.close();
                try {
                    if (fileInputStreamOpenInputStream != null) {
                        fileInputStreamOpenInputStream.close();
                    }
                } catch (IOException unused2) {
                    LogUtil.e("UploadLogUtil", "saveFile input close occur IOException.");
                } finally {
                    LogUtil.e("UploadLogUtil", "saveFile input close finally");
                }
                try {
                    if (fileOutputStreamOpenOutputStream != null) {
                        fileOutputStreamOpenOutputStream.close();
                    }
                } catch (IOException unused3) {
                    LogUtil.e("UploadLogUtil", "saveFile output close IOException.");
                } finally {
                    LogUtil.e("UploadLogUtil", "saveFile output close finally");
                }
            } catch (IOException unused4) {
                fileOutputStream = fileOutputStreamOpenOutputStream;
                fileInputStream = fileInputStreamOpenInputStream;
                try {
                    LogUtil.e("UploadLogUtil", "saveFile IOException.");
                    if (fileInputStream != null) {
                        try {
                            try {
                                fileInputStream.close();
                            } catch (IOException unused5) {
                                LogUtil.e("UploadLogUtil", "saveFile input close occur IOException.");
                                LogUtil.e("UploadLogUtil", "saveFile input close finally");
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                                LogUtil.a("UploadLogUtil", "deleteFolder file name is ", file.getCanonicalPath(), " isDelete is ", Boolean.valueOf(file.delete()));
                            }
                        } catch (Throwable th2) {
                            LogUtil.e("UploadLogUtil", "saveFile input close finally");
                            throw th2;
                        }
                    }
                    LogUtil.e("UploadLogUtil", "saveFile input close finally");
                    try {
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                    } catch (IOException unused6) {
                        LogUtil.e("UploadLogUtil", "saveFile output close IOException.");
                    } finally {
                        LogUtil.e("UploadLogUtil", "saveFile output close finally");
                    }
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                    } catch (IOException unused7) {
                        LogUtil.e("UploadLogUtil", "saveFile input close occur IOException.");
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused8) {
                                LogUtil.e("UploadLogUtil", "saveFile output close IOException.");
                                throw th;
                            } finally {
                                LogUtil.e("UploadLogUtil", "saveFile output close finally");
                            }
                        }
                        throw th;
                    } finally {
                        LogUtil.e("UploadLogUtil", "saveFile input close finally");
                    }
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                fileOutputStream = fileOutputStreamOpenOutputStream;
                fileInputStream = fileInputStreamOpenInputStream;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                throw th;
            }
        } catch (IOException unused9) {
            fileOutputStream = null;
        } catch (Throwable th5) {
            th = th5;
            fileOutputStream = null;
        }
        try {
            LogUtil.a("UploadLogUtil", "deleteFolder file name is ", file.getCanonicalPath(), " isDelete is ", Boolean.valueOf(file.delete()));
        } catch (IOException unused10) {
            LogUtil.a("UploadLogUtil", "deleteFolder meet exception.");
        }
    }

    private static void h() {
        String str = s;
        if (str == null || str.length() <= 0) {
            return;
        }
        File file = new File(s);
        if (file.exists()) {
            if (file.delete()) {
                s = null;
                LogUtil.d("UploadLogUtil", "dir delete success!");
            } else {
                LogUtil.a("UploadLogUtil", "dir delete failed!");
            }
        }
    }

    private static void p(String str) {
        ArrayList<File> arrayListA = mjq.a(str);
        if (arrayListA == null) {
            LogUtil.a("UploadLogUtil", "deleteTenDayFile(), not have ten days log");
            return;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(HwDrmConstant.TIME_FORMAT, Locale.ENGLISH);
        String str2 = simpleDateFormat.format(new Date());
        LogUtil.d("UploadLogUtil", "deleteTenDayFile, newDate = ", str2);
        Gson gson = new Gson();
        String str3 = "";
        for (int i2 = 0; i2 < arrayListA.size(); i2++) {
            File file = arrayListA.get(i2);
            String name = file.getName();
            String[] strArrSplit = name.split("_");
            if (strArrSplit.length <= 4) {
                LogUtil.d("UploadLogUtil", "deleteTenDayFile(), file name contains no date.");
            } else {
                str3 = strArrSplit[3];
            }
            try {
                long time = (simpleDateFormat.parse(str2).getTime() - simpleDateFormat.parse(str3).getTime()) / 86400000;
                if (time > 10 && !file.getName().contains("_WearableBeta_app_bigdata.log") && !file.getName().contains("_WearableBeta_gpu_update.log")) {
                    LogUtil.a("UploadLogUtil", "deleteTenDayFile, delete days = ", Long.valueOf(time), " file = ", file.getName());
                    c(file.getPath(), "deleteTenDayFile", gson);
                    m(name);
                    LogUtil.d("UploadLogUtil", "deleteTenDayFile isDelete: ", Boolean.valueOf(file.delete()));
                }
            } catch (OutOfMemoryError e2) {
                ReleaseLogUtil.a("Dfx_UploadLogUtil", "OutOfMemoryError is:" + ExceptionUtils.c(e2));
            } catch (ParseException e3) {
                LogUtil.e("UploadLogUtil", "PackageManager.ParseException is:" + e3.getMessage());
            }
        }
    }

    private static String b(Context context, String str) {
        if (context != null && str != null) {
            try {
                PackageManager packageManager = context.getPackageManager();
                PackageInfo packageInfo = packageManager != null ? packageManager.getPackageInfo(str, 16384) : null;
                if (packageInfo != null) {
                    return packageInfo.versionName;
                }
            } catch (PackageManager.NameNotFoundException e2) {
                LogUtil.e("UploadLogUtil", "PackageManager.NameNotFoundException is:" + e2.getMessage());
            }
        }
        return null;
    }

    private static void g(String str, String str2) throws Throwable {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(CommonUtil.c(str));
                try {
                    fileOutputStream.write(str2.getBytes("UTF-8"));
                    try {
                        fileOutputStream.close();
                    } catch (IOException e2) {
                        LogUtil.e("UploadLogUtil", "writeFileSdcard ioException ", e2.getMessage());
                    }
                } catch (FileNotFoundException e3) {
                    e = e3;
                    fileOutputStream2 = fileOutputStream;
                    LogUtil.e("UploadLogUtil", "PackageManager.FileNotFoundException is:" + e.getMessage());
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.close();
                        } catch (IOException e4) {
                            LogUtil.e("UploadLogUtil", "writeFileSdcard ioException ", e4.getMessage());
                        }
                    }
                } catch (UnsupportedEncodingException e5) {
                    e = e5;
                    fileOutputStream2 = fileOutputStream;
                    LogUtil.e("UploadLogUtil", "PackageManager.UnsupportedEncodingException is:" + e.getMessage());
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.close();
                        } catch (IOException e6) {
                            LogUtil.e("UploadLogUtil", "writeFileSdcard ioException ", e6.getMessage());
                        }
                    }
                } catch (IOException e7) {
                    e = e7;
                    fileOutputStream2 = fileOutputStream;
                    LogUtil.e("UploadLogUtil", "PackageManager.IOException is:" + e.getMessage());
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.close();
                        } catch (IOException e8) {
                            LogUtil.e("UploadLogUtil", "writeFileSdcard ioException ", e8.getMessage());
                        }
                    }
                } catch (OutOfMemoryError unused) {
                    fileOutputStream2 = fileOutputStream;
                    LogUtil.d("UploadLogUtil", "writeFileSdcard OutOfMemoryError");
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.close();
                        } catch (IOException e9) {
                            LogUtil.e("UploadLogUtil", "writeFileSdcard ioException ", e9.getMessage());
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e10) {
                            LogUtil.e("UploadLogUtil", "writeFileSdcard ioException ", e10.getMessage());
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream2;
            }
        } catch (FileNotFoundException e11) {
            e = e11;
        } catch (UnsupportedEncodingException e12) {
            e = e12;
        } catch (IOException e13) {
            e = e13;
        } catch (OutOfMemoryError unused2) {
        }
    }

    private static String x(String str) {
        String strAg = CommonUtil.ag();
        return (TextUtils.isEmpty(strAg) || "default".equals(strAg)) ? str : strAg;
    }

    public static boolean i() {
        File[] fileArrListFiles = new File(f41743c).listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length <= 0) {
            return true;
        }
        LogUtil.d("UploadLogUtil", "file size: " + fileArrListFiles.length);
        int length = fileArrListFiles.length;
        for (int i2 = 0; i2 < length; i2++) {
            File file = fileArrListFiles[i2];
            LogUtil.d("UploadLogUtil", "file name: ", file.getName());
            if (file.getName().endsWith("WearAPPBeta.zip") || file.getName().endsWith("WearableBeta.zip")) {
                return false;
            }
        }
        return true;
    }

    private static String n() {
        String str = LogConfig.o() + "bbb/";
        if (!new File(str).exists()) {
            str = LogConfig.o() + "SmartWearableDFX/";
        }
        LogUtil.d("UploadLogUtil", "obtainSavePath path is: ", str);
        return str;
    }

    private static String l() {
        String str = LogConfig.o() + "SmartWearableDFXHonor/";
        File file = new File(str);
        if (!file.exists()) {
            ReleaseLogUtil.d("Dfx_UploadLogUtil", "obtainHonorSaveFolder mkdirs ", Boolean.valueOf(file.mkdirs()));
        }
        return str;
    }

    public static boolean g(String str) {
        String strC = CommonUtil.c(g);
        if (TextUtils.isEmpty(strC)) {
            LogUtil.j("UploadLogUtil", "pathName is empty");
            return false;
        }
        File file = new File(CommonUtil.c(strC));
        if (!file.exists()) {
            LogUtil.a("UploadLogUtil", "mkdirs result: ", Boolean.valueOf(file.mkdirs()));
        }
        File[] fileArrListFiles = file.listFiles();
        String strA = a(j(str));
        if (fileArrListFiles != null && fileArrListFiles.length > 0) {
            for (File file2 : fileArrListFiles) {
                if (file2.getName().contains("_mcu_upg") && file2.getName().contains(strA)) {
                    LogUtil.a("UploadLogUtil", "has this device id upg log");
                    return true;
                }
            }
        }
        return false;
    }

    public static void e(String str, String str2, String str3, String str4) {
        synchronized (mjh.class) {
            d(str, str2, str3, "", str4);
        }
    }

    public static void d(String str, String str2, String str3, String str4, String str5) {
        synchronized (mjh.class) {
            LinkedList<File> linkedListB = mjm.b(CommonUtil.c(g));
            if (linkedListB == null || linkedListB.size() == 0) {
                return;
            }
            try {
                for (File file : linkedListB) {
                    if (!file.getName().contains(str5)) {
                        LogUtil.a("UploadLogUtil", "addOtaLog file not contains shaDeviceId.");
                    } else {
                        LogUtil.a("UploadLogUtil", "addOtaLog otalog otaFiles size:", Integer.valueOf(linkedListB.size()), "; otaFiles=", linkedListB.toString(), "; file=", file.getName());
                        b(str, str2, str3, str4, file);
                    }
                }
            } catch (OutOfMemoryError unused) {
                LogUtil.a("UploadLogUtil", "addOtaLog UploadOtaLog OutOfMemoryError");
            }
        }
    }

    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0091: MOVE (r3 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:30:0x0090 */
    private static void b(String str, String str2, String str3, String str4, File file) throws Throwable {
        FileOutputStream fileOutputStream;
        OutputStreamWriter outputStreamWriter;
        OutputStreamWriter outputStreamWriter2;
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String strC = CommonUtil.c(g + file.getName());
                fileOutputStream = new FileOutputStream(strC, true);
                try {
                    outputStreamWriter = new OutputStreamWriter(fileOutputStream, "UTF-8");
                    try {
                        BufferedWriter bufferedWriter2 = new BufferedWriter(outputStreamWriter);
                        try {
                            File file2 = new File(strC);
                            if (file2.exists() && file2.length() > 0) {
                                bufferedWriter2.write(System.lineSeparator() + a(str2, str3, str, str4));
                            }
                            d(bufferedWriter2, outputStreamWriter, fileOutputStream);
                        } catch (IOException unused) {
                            bufferedWriter = bufferedWriter2;
                            LogUtil.e("UploadLogUtil", "Exception ioException");
                            d(bufferedWriter, outputStreamWriter, fileOutputStream);
                        } catch (OutOfMemoryError unused2) {
                            bufferedWriter = bufferedWriter2;
                            LogUtil.a("UploadLogUtil", "addOtaLog UploadOtaLog OutOfMemoryError");
                            d(bufferedWriter, outputStreamWriter, fileOutputStream);
                        } catch (Throwable th) {
                            th = th;
                            bufferedWriter = bufferedWriter2;
                            d(bufferedWriter, outputStreamWriter, fileOutputStream);
                            throw th;
                        }
                    } catch (IOException unused3) {
                    } catch (OutOfMemoryError unused4) {
                    }
                } catch (IOException unused5) {
                    outputStreamWriter = null;
                } catch (OutOfMemoryError unused6) {
                    outputStreamWriter = null;
                } catch (Throwable th2) {
                    th = th2;
                    outputStreamWriter = null;
                }
            } catch (Throwable th3) {
                th = th3;
                outputStreamWriter = outputStreamWriter2;
                bufferedWriter = null;
            }
        } catch (IOException unused7) {
            fileOutputStream = null;
            outputStreamWriter = null;
        } catch (OutOfMemoryError unused8) {
            fileOutputStream = null;
            outputStreamWriter = null;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
            outputStreamWriter = null;
        }
    }

    private static void r(String str) {
        LinkedList<File> linkedListB = mjm.b(CommonUtil.c(g));
        if (linkedListB != null) {
            try {
                if (linkedListB.size() > 0) {
                    LogUtil.a("UploadLogUtil", "deleteUpgLog otalog otaFiles ", Integer.valueOf(linkedListB.size()));
                    c(linkedListB, str);
                }
            } catch (OutOfMemoryError unused) {
                LogUtil.a("UploadLogUtil", "deleteUpgLog UploadOtaLog OutOfMemoryError");
            }
        }
    }

    public static void c(Context context, int i2, String str) {
        if (context == null) {
            return;
        }
        if (mjq.e(context)) {
            LogUtil.j("UploadLogUtil", "uploadUpglog:isAuto isBatteryControl not upload");
            return;
        }
        synchronized (d) {
            LinkedList<File> linkedListB = mjm.b(CommonUtil.c(g));
            if (linkedListB != null && linkedListB.size() != 0) {
                String strA = a(j(str));
                try {
                    try {
                        for (File file : linkedListB) {
                            LogUtil.a("UploadLogUtil", "uploadUpglog otalog otaFiles ", Integer.valueOf(linkedListB.size()), " uploadUpglog otaFiles ", linkedListB.toString(), " uploadUpglog otalog otaFiles file ", file.getName());
                            if (!file.getName().contains(strA)) {
                                LogUtil.a("UploadLogUtil", "file name not contains shaDeviceId");
                            } else {
                                File fileA = a(str, file);
                                String strAc = ac(fileA.getName());
                                LogUtil.a("UploadLogUtil", "uploadUpglog otalog otaFiles targetPath ", strAc);
                                String strC = CommonUtil.c(strAc);
                                if (strAc != null && strC != null) {
                                    LinkedList linkedList = new LinkedList();
                                    linkedList.add(fileA);
                                    mjm.d(linkedList, new File(strC), "", strA);
                                    linkedList.clear();
                                    LogUtil.a("UploadLogUtil", " uploadUpglog log");
                                    if (i2 == 2) {
                                        e(context, strC, strAc, i2, str);
                                    } else {
                                        a(context, strAc, i2, str);
                                    }
                                }
                                return;
                            }
                        }
                    } catch (OutOfMemoryError unused) {
                        LogUtil.a("UploadLogUtil", "uploadUpglog UploadOtaLog OutOfMemoryError");
                    }
                } catch (IOException e2) {
                    LogUtil.e("UploadLogUtil", "Exception ioException ", e2.getMessage());
                }
            }
        }
    }

    private static void e(Context context, String str, String str2, int i2, String str3) {
        File file = new File(str);
        if (!file.isFile()) {
            LogUtil.a("UploadLogUtil", "uploadUpglog() fileZip is not a file.");
            return;
        }
        long length = file.length();
        LogUtil.a("UploadLogUtil", "LogCanUpload length is", Long.valueOf(length));
        if (c(context, length)) {
            LogUtil.a("UploadLogUtil", "LogCanUpload is true");
            a(context, str2, i2, str3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x006d  */
    private static String ac(String str) {
        String str2;
        if (!TextUtils.isEmpty(str) && str.contains("_WearableBeta_mcu_upg.log")) {
            int iIndexOf = str.indexOf("_WearableBeta") + 13;
            LogUtil.a("UploadLogUtil", "uploadUpglog otalog otaFiles index ", Integer.valueOf(iIndexOf));
            if (iIndexOf != -1) {
                str2 = g + str.substring(0, iIndexOf) + ".zip";
                int iLastIndexOf = str2.lastIndexOf("_");
                if (iLastIndexOf != -1) {
                    str2 = str2.substring(0, iLastIndexOf) + "_00000000_device" + str2.substring(iLastIndexOf, str2.length());
                }
            } else {
                str2 = "";
            }
        } else {
            str2 = "";
        }
        if (!TextUtils.isEmpty(str) && str.contains("_Beta_mcu_upg.log")) {
            int iIndexOf2 = str.indexOf("_Beta") + 5;
            LogUtil.a("UploadLogUtil", "uploadUpglog otalog otaFiles index ", Integer.valueOf(iIndexOf2));
            if (iIndexOf2 != -1) {
                String str3 = g + str.substring(0, iIndexOf2) + ".zip";
                int iLastIndexOf2 = str3.lastIndexOf("_");
                if (iLastIndexOf2 == -1) {
                    return str3;
                }
                return str3.substring(0, iLastIndexOf2) + "_00000000_appdft" + str3.substring(iLastIndexOf2, str3.length());
            }
        }
        return str2;
    }

    public static void i(String str) {
        DeviceInfo deviceInfoJ = j(str);
        if (deviceInfoJ == null) {
            LogUtil.a("UploadLogUtil", "currentDeviceInfo is null or device is Aw70");
        } else {
            e(deviceInfoJ);
        }
    }

    private static String a(String str, String str2, String str3, String str4) {
        JSONException e2;
        Context context = BaseApplication.getContext();
        if (context == null) {
            LogUtil.a("UploadLogUtil", "getOtaLog context is null");
            return "";
        }
        String strE = e(System.currentTimeMillis());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("eventid", str3);
            if (str3.equals("0D0B01")) {
                String strC = mjj.c(jSONObject, context, str, str2);
                mjl.j(context);
                return strC;
            }
            try {
                if (str3.equals("910401")) {
                    String strA = a(jSONObject, context, str, str2);
                    SharedPreferenceManager.d(context, 0L, "EXCE_DFT_APP_SYNSTART_TIME");
                    SharedPreferenceManager.a(context, "", "EXCE_DFT_APP_UPLOADRESULT");
                    return strA;
                }
                if (str3.equals("910402")) {
                    jSONObject.put("datatime", str2);
                    jSONObject.put(str, r);
                    return jSONObject.toString();
                }
                if (str3.startsWith("03")) {
                    LogUtil.a("UploadLogUtil", "getOtaLog SLEEP RECORD START");
                    jSONObject.put("datatime", str4);
                    jSONObject.put(str, str2);
                    return jSONObject.toString();
                }
                jSONObject.put("datatime", strE);
                jSONObject.put(str, str2);
                String strD = SharedPreferenceManager.d(context, "EXCE_DFT_APP_UPLOADRESULT");
                if (str3.equals("910403")) {
                    strD = strD + "," + r;
                }
                jSONObject.put("EXCE_DFT_APP_UPLOADRESULT", strD);
                String string = jSONObject.toString();
                SharedPreferenceManager.d(context, 0L, "EXCE_DFT_APP_UPLOADSTART");
                SharedPreferenceManager.a(context, "", "EXCE_DFT_APP_UPLOADRESULT");
                return string;
            } catch (JSONException e3) {
                e2 = e3;
                LogUtil.a("UploadLogUtil", "getOtaLog jsonException ", e2.getMessage());
                return str;
            }
        } catch (JSONException e4) {
            e2 = e4;
            str = "";
        }
    }

    private static String a(JSONObject jSONObject, Context context, String str, String str2) {
        long jB = SharedPreferenceManager.b(context, "EXCE_DFT_APP_SYNSTART_TIME");
        String strD = SharedPreferenceManager.d(context, "EXCE_DFT_APP_SYNSTART");
        String strE = e(jB);
        try {
            jSONObject.put("datatime", strE);
            jSONObject.put("EXCE_DFT_APP_SYNSTART", strE);
            jSONObject.put(str, str2);
            jSONObject.put("EXCE_DFT_APP_SYNRESULT", strD);
        } catch (JSONException unused) {
            LogUtil.e("UploadLogUtil", "JSONException jsonException");
        }
        return jSONObject.toString();
    }

    public static String c(Context context, String str, String str2, String str3) {
        String strX = x("unknown");
        String strB = b(context, "com.huawei.crowdtest");
        if (TextUtils.isEmpty(strB)) {
            strB = "";
        }
        String strB2 = b(context, "com.huawei.bone");
        if (TextUtils.isEmpty(strB2)) {
            strB2 = "";
        }
        String strB3 = b(context, "com.huawei.health");
        if (TextUtils.isEmpty(strB3)) {
            strB3 = "";
        }
        String strE = e(System.currentTimeMillis());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("log_version", "1.0.0.1");
            jSONObject.put("file_time", strE);
            jSONObject.put("wear_device_type", str);
            jSONObject.put("wear_device_id", str2);
            jSONObject.put("wear_device_version", str3);
            jSONObject.put("phone_os_version", Build.VERSION.RELEASE);
            jSONObject.put("betaclub_version", strB);
            jSONObject.put("phone_bone_version", strB2);
            jSONObject.put("phone_brand", Build.BRAND);
            jSONObject.put("phone_device", Build.DISPLAY);
            jSONObject.put("health_version", strB3);
            jSONObject.put("phone_model", Build.MODEL);
            jSONObject.put("phone_ui_version", strX);
            return jSONObject.toString();
        } catch (JSONException e2) {
            LogUtil.a("UploadLogUtil", "JSONException jsonException ", e2.getMessage());
            return "";
        }
    }

    public static String e(long j2) {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH).format(new Date(j2));
    }

    public static void d(Context context, final String str) {
        if (context == null) {
            LogUtil.a("UploadLogUtil", "setCreateLogFile context is null.");
        } else {
            if (CommonUtil.af(context)) {
                return;
            }
            ThreadPoolManager.c().execute(new Runnable() { // from class: mjh.2
                @Override // java.lang.Runnable
                public void run() {
                    if (mjh.g(str) && mjh.h(str)) {
                        return;
                    }
                    mjh.i(str);
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003d  */
    /* JADX WARN: Code duplicated, block: B:17:0x0052 A[RETURN] */
    private static boolean c(Context context, long j2) {
        boolean z;
        long jD = SharedPreferenceManager.d("goal_steps_perference", "update_log_time", 0L);
        long jM = ltb.m(ltb.b());
        int iA = SharedPreferenceManager.a(context);
        if (jD != jM) {
            SharedPreferenceManager.c(context, 0);
        } else {
            if (iA > 100) {
                z = false;
            }
            LogUtil.a("UploadLogUtil", "LogCanUpload isNoSameDay is ", Boolean.valueOf(z));
            if (!e(context)) {
                return true;
            }
            if (j2 / 1048576 <= 1 || !z) {
                return false;
            }
            SharedPreferenceManager.c("goal_steps_perference", "update_log_time", jM);
            SharedPreferenceManager.c(context, iA + 1);
            return true;
        }
        z = true;
        LogUtil.a("UploadLogUtil", "LogCanUpload isNoSameDay is ", Boolean.valueOf(z));
        if (!e(context)) {
            return true;
        }
        if (j2 / 1048576 <= 1) {
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x0127: MOVE (r5 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]), block:B:56:0x0126 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.io.FileOutputStream] */
    private static void e(DeviceInfo deviceInfo) {
        ?? r8;
        OutputStreamWriter outputStreamWriter;
        FileOutputStream fileOutputStreamOpenOutputStream;
        OutputStreamWriter outputStreamWriter2;
        FileOutputStream fileOutputStream;
        synchronized (mjh.class) {
            String strA = a(deviceInfo);
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            mjl.c(BaseApplication.getContext(), strA);
            String strE = nvd.e();
            int productType = deviceInfo.getProductType();
            String strA2 = a(productType, e(productType, deviceInfo.getDeviceModel()), deviceInfo.getDeviceModel());
            String softVersion = deviceInfo.getSoftVersion();
            String str = g + strA2 + "_" + softVersion + "_" + strA + "_" + strE + "_Beta_mcu_upg.log";
            String str2 = "UploadLogUtil";
            LogUtil.a("UploadLogUtil", "otaPath is :", str);
            String strC = CommonUtil.c(str);
            BufferedWriter bufferedWriter = null;
            try {
                try {
                    if (TextUtils.isEmpty(strC)) {
                        LogUtil.j("UploadLogUtil", "onCreateFile filePath is empty");
                        d((BufferedWriter) null, (OutputStreamWriter) null, (FileOutputStream) null);
                        return;
                    }
                    File file = FileUtils.getFile(strC);
                    if (file == null) {
                        LogUtil.j("UploadLogUtil", "onCreateFile pathFile is null");
                        d((BufferedWriter) null, (OutputStreamWriter) null, (FileOutputStream) null);
                        return;
                    }
                    fileOutputStreamOpenOutputStream = FileUtils.openOutputStream(file, true);
                    try {
                        outputStreamWriter = new OutputStreamWriter(fileOutputStreamOpenOutputStream, "UTF-8");
                        try {
                            BufferedWriter bufferedWriter2 = new BufferedWriter(outputStreamWriter);
                            try {
                                File file2 = new File(strC);
                                if (!file2.exists() && file2.createNewFile()) {
                                    LogUtil.e("UploadLogUtil", "create uploadLogUtil success");
                                }
                                bufferedWriter2.write("");
                                bufferedWriter2.write(c(BaseApplication.getContext(), strA2, strA, softVersion));
                                d(bufferedWriter2, outputStreamWriter, fileOutputStreamOpenOutputStream);
                            } catch (IOException e2) {
                                e = e2;
                                bufferedWriter = bufferedWriter2;
                                LogUtil.e("UploadLogUtil", "IOException ioException ", e.getMessage());
                                fileOutputStream = fileOutputStreamOpenOutputStream;
                                d(bufferedWriter, outputStreamWriter, fileOutputStream);
                            } catch (OutOfMemoryError unused) {
                                bufferedWriter = bufferedWriter2;
                                LogUtil.a("UploadLogUtil", "createOtaLog uploadLog OutOfMemoryError");
                                fileOutputStream = fileOutputStreamOpenOutputStream;
                                d(bufferedWriter, outputStreamWriter, fileOutputStream);
                            } catch (Throwable th) {
                                th = th;
                                bufferedWriter = bufferedWriter2;
                                r8 = fileOutputStreamOpenOutputStream;
                                d(bufferedWriter, outputStreamWriter, (FileOutputStream) r8);
                                throw th;
                            }
                        } catch (IOException e3) {
                            e = e3;
                        } catch (OutOfMemoryError unused2) {
                        }
                    } catch (IOException e4) {
                        e = e4;
                        outputStreamWriter = null;
                    } catch (OutOfMemoryError unused3) {
                        outputStreamWriter = null;
                    } catch (Throwable th2) {
                        th = th2;
                        outputStreamWriter = null;
                        r8 = fileOutputStreamOpenOutputStream;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    outputStreamWriter = outputStreamWriter2;
                    bufferedWriter = null;
                    r8 = str2;
                }
            } catch (IOException e5) {
                e = e5;
                fileOutputStreamOpenOutputStream = null;
                outputStreamWriter = null;
            } catch (OutOfMemoryError unused4) {
                fileOutputStreamOpenOutputStream = null;
                outputStreamWriter = null;
            } catch (Throwable th4) {
                th = th4;
                r8 = 0;
                outputStreamWriter = null;
            }
        }
    }

    private static void d(BufferedWriter bufferedWriter, OutputStreamWriter outputStreamWriter, FileOutputStream fileOutputStream) {
        if (bufferedWriter != null) {
            try {
                bufferedWriter.flush();
                bufferedWriter.close();
            } catch (IOException unused) {
                LogUtil.e("UploadLogUtil", "writeFileSdcard ioException");
                return;
            }
        }
        if (outputStreamWriter != null) {
            outputStreamWriter.close();
        }
        if (fileOutputStream != null) {
            fileOutputStream.close();
        }
    }

    public static String a(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.e("UploadLogUtil", "getShaDeviceId currentDeviceInfo is null");
            return "";
        }
        String deviceIdentify = deviceInfo.getDeviceIdentify();
        if (deviceIdentify == null) {
            return "";
        }
        String udidFromDevice = deviceInfo.getUdidFromDevice();
        if (!TextUtils.isEmpty(udidFromDevice)) {
            return udidFromDevice;
        }
        String securityDeviceId = deviceInfo.getSecurityDeviceId();
        String str = securityDeviceId + deviceIdentify;
        if (!deviceIdentify.equals(securityDeviceId)) {
            deviceIdentify = str;
        }
        if (deviceInfo.getProductType() >= 34 && !Utils.o()) {
            return nio.c(deviceIdentify);
        }
        return l(securityDeviceId);
    }

    public static String l(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.a("UploadLogUtil", "setDeviceMac deviceMac is null");
            return null;
        }
        if (Utils.o()) {
            String strE = nio.e(str);
            return strE.length() >= 24 ? strE.replace(Marker.ANY_NON_NULL_MARKER, "A").replace("/", "A").replace("=", "A").substring(0, 24) : strE;
        }
        if (str.contains(":") || str.length() <= 12) {
            return str.replace(":", "");
        }
        String strE2 = nio.e(str);
        return strE2.length() >= 24 ? strE2.replace(Marker.ANY_NON_NULL_MARKER, "A").replace("/", "A").replace("=", "A").substring(0, 24) : strE2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(String str, String str2, int i2, long j2, String str3) {
        LogUtil.a("UploadLogUtil", "handleOnSuccess uploadFileName = " + str + ", targetPath = " + str2 + ", uploadType = " + i2 + ", startUploadTime = " + j2 + ", deviceId = " + CommonUtil.n(str3) + ", targetPath isExist:" + new File(str2).exists());
        if (i2 == 2) {
            LogUtil.a("UploadLogUtil", "upload log success.");
            r(str3);
            mjl.e(BaseApplication.getContext());
        } else if (i2 != 0) {
            LogUtil.a("UploadLogUtil", "handleOnSuccess targetPath:", str2);
        } else {
            DeviceInfo deviceInfoJ = j(str3);
            if (deviceInfoJ != null) {
                SharedPreferenceManager.a(BaseApplication.getContext(), "success", "EXCE_DFT_APP_UPLOADRESULT");
                LogUtil.a("UploadLogUtil", "start create log file.");
                d(BaseApplication.getContext(), str3);
                r = u(str2);
                e("910403", "EXCE_DFT_APP_UPLOADSTOP", ((System.currentTimeMillis() - j2) / 1000) + "", a(deviceInfoJ));
            }
        }
        LogUtil.a("UploadLogUtil", "startUploadLog: file: ", str2, "; upload success: " + str + ", handleOnSuccess targetPath isExist = " + new File(str2).exists());
    }

    private static void a(Context context, String str) throws Throwable {
        String strB = b(context, "com.huawei.crowdtest");
        if (TextUtils.isEmpty(strB)) {
            strB = "";
        }
        String strB2 = b(context, "com.huawei.bone");
        if (TextUtils.isEmpty(strB2)) {
            strB2 = "";
        }
        String strB3 = b(context, "com.huawei.health");
        String str2 = TextUtils.isEmpty(strB3) ? "" : strB3;
        g(str, "{\"os_version\":\"" + Build.VERSION.RELEASE + "\",\"betaclubVersion\":\"" + strB + "\",\"boneVersion\":\"" + strB2 + "\",\"brand\":\"" + Build.BRAND + "\",\"device\":\"" + Build.DISPLAY + "\",\"health_version\":\"" + str2 + "\",\"model\":\"" + Build.MODEL + "\",\"ui_version\":\"" + x("unknown") + "\"}");
    }

    private static void c(Context context, boolean z, String str) {
        DeviceInfo deviceInfoJ = j(str);
        boolean zD = eey.d(deviceInfoJ, 217);
        boolean zC = mjq.c();
        if (cop.h()) {
            if (!zC) {
                return;
            }
        } else if (!zC && (!zD || !mjq.d())) {
            return;
        }
        if (deviceInfoJ == null) {
            LogUtil.j("UploadLogUtil", "zipLogFile() deviceInfo is null");
            return;
        }
        if (q(deviceInfoJ.getDeviceIdentify()) && z) {
            LogUtil.a("UploadLogUtil", "zipLogFile() isSupportSmartMcuDeviceLog");
            e(context, z, true, str);
        } else if (!k(str)) {
            LogUtil.a("UploadLogUtil", "zipLogFile() not isSelfUploadDeviceLog");
            e(context, z, true, str);
        }
        if (mjq.d(context, deviceInfoJ)) {
            e(context, z, false, str);
        } else {
            c(mjm.c(f41741a + "MaintenanceLog"), str);
        }
        mfz.d(1, true);
    }

    private static void c(boolean z, List<File> list, String str) {
        if (z) {
            for (File file : list) {
                if (file.getName().equals("com.huawei.version.json")) {
                    p.add(file);
                }
                if (file.getName().equals("MaintenanceLog")) {
                    p.add(file);
                }
            }
            return;
        }
        if (CompileParameterUtil.d("SUPPORT_LOG_FEEDBACK") && k(str)) {
            h();
        }
        String strA = a(j(str));
        for (File file2 : list) {
            if (f.equals(file2.getName())) {
                File[] fileArrListFiles = file2.listFiles();
                if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                    LogUtil.j("UploadLogUtil", "originFiles is null");
                    return;
                }
                for (File file3 : fileArrListFiles) {
                    if (file3.getName().startsWith("log")) {
                        b(file3, strA);
                    }
                }
                p.add(file2);
            } else if (BaseApplication.getAppPackage().equals(file2.getName())) {
                p.add(file2);
            } else if (i.equals(file2.getName())) {
                p.add(file2);
            } else if (f41742b.equals(file2.getName())) {
                p.add(file2);
            } else {
                LogUtil.d("UploadLogUtil", "no files to be added");
            }
        }
    }

    private static void b(File file, String str) {
        try {
            ArrayList arrayList = new ArrayList(16);
            String str2 = file.getCanonicalPath().substring(0, file.getCanonicalPath().length() - 5) + new SimpleDateFormat(HwDrmConstant.TIME_FORMAT, Locale.ENGLISH).format(new Date(file.lastModified()));
            File file2 = new File(str2);
            CommonUtil.d(file.getCanonicalPath(), file2.getCanonicalPath(), true);
            arrayList.add(file2);
            mjm.d(arrayList, new File(str2 + ".zip"), "", str);
            if (!"log.0".equals(file.getName())) {
                LogUtil.a("UploadLogUtil", "delte file: ", Boolean.valueOf(file.delete()));
            }
            if (file2.delete()) {
                return;
            }
            LogUtil.j("UploadLogUtil", "updateFileList tempFile.delete() false");
        } catch (IOException unused) {
            LogUtil.e("UploadLogUtil", "updateFileList IOException");
        }
    }

    private static void c(boolean z, boolean z2, List<File> list, String str, String str2) {
        try {
            mjm.d(p, new File(str), "", a(j(str2)));
            if (!z) {
                mjm.b();
            }
            if (m) {
                t.add(str);
            }
        } catch (IOException e2) {
            LogUtil.e("UploadLogUtil", "deleteZipFiles ioException is:", e2.getMessage());
        }
        if (njy.b(list) && z) {
            c(list, str2);
        }
        LogUtil.a("UploadLogUtil", " uploadLog Prepare to upload device log files.");
        if (z2 && mjq.e(BaseApplication.getContext())) {
            LogUtil.j("UploadLogUtil", "deleteZipFiles:isAuto isBatteryControl not upload");
            return;
        }
        if (l || !e(BaseApplication.getContext())) {
            return;
        }
        LogUtil.a("UploadLogUtil", " uploadLog upload device log files");
        if (j(new File(str).getName(), "isWifiUpload")) {
            return;
        }
        a(BaseApplication.getContext(), str, str2);
    }

    private static void e(String str, String str2, Context context, String str3) {
        if (j(str, "uploadZipFile")) {
            return;
        }
        if (str.contains("WearAPPBeta") || str.contains("WearableBeta")) {
            a(context, str2 + str, str3);
        }
    }

    private static boolean j(String str, String str2) {
        LogUtil.a("UploadLogUtil", "isUploadListContain tag = ", str2, ", fileName = ", str);
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("UploadLogUtil", "isUploadListContain fileName isEmpty");
            return true;
        }
        synchronized (j) {
            LogUtil.a("UploadLogUtil", "isUploadListContain size = ", Integer.valueOf(o.size()));
            Iterator<String> it = o.iterator();
            while (it.hasNext()) {
                if (it.next().contains(str)) {
                    LogUtil.a("UploadLogUtil", "isUploadListContain current file is already upload");
                    return true;
                }
            }
            LogUtil.a("UploadLogUtil", "isUploadListContain File not contained");
            return false;
        }
    }

    public static String e(int i2, String str) {
        if (c(i2)) {
            return d(i2);
        }
        if (i2 == 10) {
            return "Leo";
        }
        if (i2 == 23 || i2 == 24) {
            return "AW70";
        }
        if (i2 == 36 || i2 == 37) {
            return "AW70-B39";
        }
        if (i2 == 44) {
            return "Andes_B19";
        }
        if (i2 != 45) {
            switch (i2) {
                case 18:
                    return "Crius";
                case 19:
                    return "Terra";
                case 20:
                    return "Talos";
                case 21:
                    return "Fortuna";
                default:
                    return b(i2, str);
            }
        }
        return "Andes_B29";
    }

    private static String d(int i2) {
        if (i2 == 1) {
            return "B2";
        }
        if (i2 == 2) {
            return "K1";
        }
        if (i2 == 3) {
            return "W1";
        }
        if (i2 == 5) {
            return "B0";
        }
        if (i2 == 7) {
            return "Gemini";
        }
        if (i2 == 8) {
            return "Metis";
        }
        switch (i2) {
            case 13:
                return "NYX";
            case 14:
                return "GRUS";
            case 15:
                return "Eris";
            case 16:
                return "Janus";
            default:
                return "HUAWEI WEAR";
        }
    }

    private static String b(int i2, String str) {
        String strI;
        if (ProcessUtil.c().endsWith(":PhoneService")) {
            strI = mmx.d(i2).b();
        } else {
            strI = lvi.a(i2).i();
        }
        return e(strI, str);
    }

    private static String e(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        if (TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
            return "HUAWEI WEAR";
        }
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (!"ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890-=[];\\',./ ~!@#$%^&*()_+\"{}|:<>?".contains(str.charAt(i2) + "") || str.contains("_")) {
                return "HUAWEI WEAR";
            }
        }
        return str;
    }

    public static String a(int i2, String str, String str2) {
        return (i2 < 19 || i2 == 20 || TextUtils.isEmpty(str2)) ? str : str2;
    }

    private static boolean b(String str, String str2) {
        if (!eey.d(j(str2), 129)) {
            return str.toLowerCase(Locale.ENGLISH).contains("event") || str.toLowerCase(Locale.ENGLISH).contains(VastAttribute.ERROR) || str.toLowerCase(Locale.ENGLISH).contains("wearablebeta_dump.log") || str.toLowerCase(Locale.ENGLISH).contains("power.log") || str.toLowerCase(Locale.ENGLISH).contains("fs.log") || str.toLowerCase(Locale.ENGLISH).contains("dump.log") || str.toLowerCase(Locale.ENGLISH).contains("bigdata.log") || str.toLowerCase(Locale.ENGLISH).contains("gpu_update.log");
        }
        ReleaseLogUtil.d("Dfx_UploadLogUtil", "device support log trust list is true");
        return true;
    }

    public static String f(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String[] strArrSplit = str.split("&:&");
        return strArrSplit.length > 1 ? strArrSplit[1] : "";
    }

    private static String b(Object obj, String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("UploadLogUtil", "devcieId is empty");
            return "";
        }
        if (obj == null) {
            obj = new Object();
        }
        StringBuilder sb = new StringBuilder(16);
        sb.append(obj.toString());
        sb.append("&:&");
        sb.append(str);
        return sb.toString();
    }

    public static DeviceInfo j(String str) {
        LogUtil.a("UploadLogUtil", "enter getConnectedDevice");
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("UploadLogUtil", "deviceId is empty");
            return null;
        }
        if (EnvironmentUtils.d()) {
            DeviceInfo deviceInfoB = mgg.b(str, "UploadLogUtil");
            if (deviceInfoB == null) {
                deviceInfoB = mgg.c("UploadLogUtil");
            }
            if (deviceInfoB == null) {
                deviceInfoB = mgi.c("UploadLogUtil");
            }
            LogUtil.a("UploadLogUtil", "isHealthMainProcess currentDeviceInfo is null : ", Boolean.valueOf(deviceInfoB == null));
            return deviceInfoB;
        }
        if (EnvironmentUtils.e()) {
            DeviceInfo deviceInfoB2 = myk.b(str, "UploadLogUtil");
            if (deviceInfoB2 == null) {
                deviceInfoB2 = myk.a("UploadLogUtil");
            }
            if (deviceInfoB2 == null) {
                deviceInfoB2 = myk.d("UploadLogUtil");
            }
            LogUtil.a("UploadLogUtil", "isPhoneServiceProcess currentDeviceInfo is null : ", Boolean.valueOf(deviceInfoB2 == null));
            return deviceInfoB2;
        }
        LogUtil.j("UploadLogUtil", "getConnectedDevice is other Process");
        return null;
    }

    public static void e(TransferFileInfo transferFileInfo, int i2, Object obj, IBaseResponseCallback iBaseResponseCallback) {
        if (transferFileInfo == null || obj == null || iBaseResponseCallback == null) {
            LogUtil.j("UploadLogUtil", "transferFileInfo =", transferFileInfo, ", object = ", obj, ", callback = ", iBaseResponseCallback);
        } else if (transferFileInfo.getType() == 0) {
            iBaseResponseCallback.a(i2, b(obj, transferFileInfo.getDeviceSn()));
        } else {
            iBaseResponseCallback.a(i2, obj);
        }
    }

    public static boolean e() {
        LogUtil.a("UploadLogUtil", "enter getIsManualCollectLog");
        return "true".equals(SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10), "_IS_MANUAL_COLLECT_LOG"));
    }

    public static void e(boolean z) {
        LogUtil.a("UploadLogUtil", "enter setIsManualCollectLog");
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10), "_IS_MANUAL_COLLECT_LOG", String.valueOf(z), null);
    }

    private static File a(String str, File file) {
        String name = file.getName();
        LogUtil.a("UploadLogUtil", "enter updateMcuUpgTimestampSoftVersion fileName = ", name);
        if (TextUtils.isEmpty(name)) {
            LogUtil.j("UploadLogUtil", "updateMcuUpgTimestampSoftVersion empty name");
            return file;
        }
        int iIndexOf = name.endsWith("_Beta_mcu_upg.log") ? name.indexOf("_Beta_mcu_upg.log") : 0;
        if (name.endsWith("_WearableBeta_mcu_upg.log")) {
            iIndexOf = name.indexOf("_WearableBeta_mcu_upg.log");
        }
        String[] strArrSplit = name.substring(0, iIndexOf + 1).split("_");
        if (strArrSplit.length != 4) {
            LogUtil.j("UploadLogUtil", "updateMcuUpgTimestampSoftVersion split failed");
            return file;
        }
        DeviceInfo deviceInfoJ = j(str);
        if (deviceInfoJ == null) {
            LogUtil.j("UploadLogUtil", "updateMcuUpgTimestampSoftVersion deviceInfo = null");
            return file;
        }
        String softVersion = deviceInfoJ.getSoftVersion();
        String strE = nvd.e();
        StringBuffer stringBuffer = new StringBuffer(16);
        stringBuffer.append(strArrSplit[0]);
        stringBuffer.append("_");
        stringBuffer.append(softVersion);
        stringBuffer.append("_");
        stringBuffer.append(strArrSplit[2]);
        stringBuffer.append("_");
        stringBuffer.append(strE);
        stringBuffer.append(name.substring(iIndexOf));
        LogUtil.a("UploadLogUtil", "updateMcuUpgTimestampSoftVersion newFileName = ", stringBuffer);
        File file2 = new File(g + ((Object) stringBuffer));
        if (file.renameTo(file2)) {
            LogUtil.a("UploadLogUtil", "updateMcuUpgTimestampSoftVersion reName success, ", file2.getName());
            return file2;
        }
        LogUtil.j("UploadLogUtil", "updateMcuUpgTimestampSoftVersion rename fail, ", file2.getName());
        return file2;
    }

    private static String ad(String str) {
        LogUtil.a("UploadLogUtil", "updateDeviceZipTimestamp: ");
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("UploadLogUtil", "updateDeviceZipTimestamp: TextUtils.isEmpty(filename)");
            return str;
        }
        String[] strArrSplit = str.split("_");
        if (strArrSplit.length < 6) {
            LogUtil.j("UploadLogUtil", "updateDeviceZipTimestamp: split length < 6");
            return str;
        }
        try {
            if (!aa(strArrSplit[3])) {
                LogUtil.j("UploadLogUtil", "updateDeviceZipTimestamp: invalid timestamp format = ", strArrSplit[3]);
                return str;
            }
            String strReplace = str.replace(strArrSplit[3], new SimpleDateFormat(HwDrmConstant.TIME_FORMAT, Locale.ENGLISH).format(new Date()));
            LogUtil.a("UploadLogUtil", "updateDeviceZipTimestamp newFilename = ", strReplace);
            return strReplace;
        } catch (Exception e2) {
            ReleaseLogUtil.a("Dfx_UploadLogUtil", "updateDeviceZipTimestamp error processing file: ", str, ", exception: ", ExceptionUtils.c(e2));
            return str;
        }
    }

    private static boolean aa(String str) {
        if (!TextUtils.isEmpty(str) && str.length() == h) {
            try {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(HwDrmConstant.TIME_FORMAT, Locale.ENGLISH);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.parse(str);
                return true;
            } catch (ParseException unused) {
            }
        }
        return false;
    }
}

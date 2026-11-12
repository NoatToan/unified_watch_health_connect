package defpackage;

import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import com.huawei.haf.common.utils.PowerUtil;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwlogsmodel.common.LogConfig;
import health.compact.a.CommonUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public final class mjq {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f41768c = {"SAGA", "ARNOLD", "BESSEL", "COLOMBO"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f41767b = LogConfig.k();

    public static boolean a() {
        return Utils.o();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    public static boolean e(Context context) {
        boolean z;
        int iA = PowerUtil.a(context);
        if (iA < 0 || iA >= 10) {
            z = false;
        } else {
            boolean zC = PowerUtil.c(context);
            LogUtil.a(com.huawei.hianalytics.core.transport.Utils.TAG, "phone power is less than 10 isCharging:", Boolean.valueOf(zC));
            if (zC) {
                z = false;
            } else {
                z = true;
            }
        }
        LogUtil.a(com.huawei.hianalytics.core.transport.Utils.TAG, "isBatteryControl:", Boolean.valueOf(z));
        return z;
    }

    private static boolean c(File[] fileArr) {
        if (fileArr == null) {
            return false;
        }
        for (File file : fileArr) {
            String name = file.getName();
            if (!name.endsWith("_WearableBeta_mcu_upg.log") && !name.endsWith("_Beta_mcu_upg.log") && !name.endsWith("appdft_Beta.zip")) {
                return true;
            }
        }
        return false;
    }

    public static ArrayList<File> a(String str) {
        ArrayList<File> arrayList = new ArrayList<>(16);
        if (!TextUtils.isEmpty(str)) {
            File[] fileArrListFiles = new File(str).listFiles();
            if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                return null;
            }
            LogUtil.a(com.huawei.hianalytics.core.transport.Utils.TAG, "getStorageFileList(), size:", Integer.valueOf(fileArrListFiles.length));
            for (File file : fileArrListFiles) {
                if (!file.isDirectory()) {
                    arrayList.add(file);
                }
            }
        }
        return arrayList;
    }

    public static boolean d(Context context, DeviceInfo deviceInfo) {
        boolean z;
        if (context != null && deviceInfo != null) {
            boolean zB = SharedPreferenceManager.b(String.valueOf(10), "contain_app_log", true);
            LogUtil.a(com.huawei.hianalytics.core.transport.Utils.TAG, "isCollectAppLog, isContainAppLog:", Boolean.valueOf(zB), ", deviceName:", deviceInfo.getDeviceName(), ", deviceModel:", deviceInfo.getDeviceModel());
            if (zB) {
                return true;
            }
            int i = 0;
            while (true) {
                String[] strArr = f41768c;
                if (i >= strArr.length) {
                    z = false;
                    break;
                }
                if (deviceInfo.getDeviceName().toUpperCase(Locale.ENGLISH).contains(strArr[i]) || deviceInfo.getDeviceModel().toUpperCase(Locale.ENGLISH).contains(strArr[i])) {
                    z = true;
                    break;
                }
                i++;
            }
            if (!zB && z) {
                return true;
            }
        }
        return false;
    }

    public static void e() {
        List<DeviceInfo> listB = b();
        if (listB == null || listB.isEmpty()) {
            ReleaseLogUtil.e("Dfx_Utils", "connectedDeviceList is empty");
            return;
        }
        for (int i = 0; i < listB.size(); i++) {
            DeviceInfo deviceInfo = listB.get(i);
            if (deviceInfo != null) {
                boolean zE = e(nio.e(deviceInfo.getDeviceIdentify()));
                ReleaseLogUtil.d("Dfx_Utils", "getMaintenanceFile(), isCanMaintenance: ", Boolean.valueOf(zE));
                if (!zE) {
                    ReleaseLogUtil.d("Dfx_Utils", "isCanCollectLog isNotMoreThanOneDay");
                } else {
                    ReleaseLogUtil.d("Dfx_Utils", "dfxLogCollectSendBroadcast enter");
                    neu.e();
                    return;
                }
            }
        }
    }

    private static boolean e(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String dayDateTime = new mjj().getDayDateTime();
        ReleaseLogUtil.d("Dfx_Utils", "strCurrentTime: ", dayDateTime);
        if (b(str, dayDateTime)) {
            ReleaseLogUtil.d("Dfx_Utils", "isCanCollectLog isMoreThanOneDay");
            return true;
        }
        int iB = b(str);
        boolean zC = c(str);
        ReleaseLogUtil.d("Dfx_Utils", "needMaintenance(), retryNumber: ", Integer.valueOf(iB), ", isSuccess: ", Boolean.valueOf(zC));
        if (iB < 3 && !zC) {
            return true;
        }
        ReleaseLogUtil.d("Dfx_Utils", "needMaintenance(), today has success maintenance or retry > 3.");
        return false;
    }

    private static boolean b(String str, String str2) {
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10), str + "_time");
        ReleaseLogUtil.d("Dfx_Utils", "isMoreThanOneDay, strLastTime: ", strE);
        if (TextUtils.isEmpty(strE)) {
            LogUtil.j(com.huawei.hianalytics.core.transport.Utils.TAG, "strLastTime is isEmpty");
            return true;
        }
        if (TextUtils.isEmpty(str2)) {
            LogUtil.j(com.huawei.hianalytics.core.transport.Utils.TAG, "strCurrentTime is isEmpty");
            return false;
        }
        LogUtil.a(com.huawei.hianalytics.core.transport.Utils.TAG, "delayedOneDay(), strLastTime: ", strE, ", strCurTime: ", str2);
        try {
            return Long.parseLong(str2) - Long.parseLong(strE) >= 86400000;
        } catch (NumberFormatException unused) {
            ReleaseLogUtil.a("Dfx_Utils", "delayedOneDay(), delayedEightHour exception");
        }
    }

    private static int b(String str) {
        ReleaseLogUtil.d("Dfx_Utils", "enter getRetryNumber");
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10), str + "_RETRY_NUMBER");
        if (qrs.b(strE)) {
            try {
                int i = Integer.parseInt(strE);
                ReleaseLogUtil.d("Dfx_Utils", "getRetryNumber, retryNumber: ", Integer.valueOf(i));
                return i;
            } catch (NumberFormatException unused) {
                ReleaseLogUtil.a("Dfx_Utils", "getRetryNumber has exception");
            }
        }
        return 0;
    }

    private static boolean c(String str) {
        LogUtil.a(com.huawei.hianalytics.core.transport.Utils.TAG, "enter getMaintenanceResult");
        Context context = BaseApplication.getContext();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_result");
        return "true".equals(SharedPreferenceManager.e(context, String.valueOf(10), sb.toString()));
    }

    private static List<DeviceInfo> b() {
        ReleaseLogUtil.d("Dfx_Utils", "processName: ", CommonUtil.b(Process.myPid()));
        return ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_DEVICES, null, com.huawei.hianalytics.core.transport.Utils.TAG);
    }

    public static boolean c() {
        File file = new File(f41767b + "MaintenanceLog");
        if (!file.exists()) {
            LogUtil.d(com.huawei.hianalytics.core.transport.Utils.TAG, "isHasDeviceLog isExist: ", Boolean.valueOf(file.mkdirs()));
        }
        File[] fileArrListFiles = file.listFiles();
        return fileArrListFiles != null && fileArrListFiles.length > 0 && c(fileArrListFiles);
    }

    public static boolean d() {
        File file = new File(mjh.f41743c);
        if (!file.exists()) {
            LogUtil.d(com.huawei.hianalytics.core.transport.Utils.TAG, "isHasDeviceZip isExist: ", Boolean.valueOf(file.mkdirs()));
        }
        File[] fileArrListFiles = file.listFiles();
        boolean z = fileArrListFiles != null && fileArrListFiles.length > 0 && c(fileArrListFiles);
        LogUtil.d(com.huawei.hianalytics.core.transport.Utils.TAG, "isHasDeviceZip isHasSmartWearableDFXLog = " + z);
        return z;
    }

    public static void e(InputStream inputStream, FileOutputStream fileOutputStream) {
        if (fileOutputStream != null) {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                LogUtil.e(com.huawei.hianalytics.core.transport.Utils.TAG, "closeFile() ioException is:", e.getMessage());
                return;
            }
        }
        if (inputStream != null) {
            inputStream.close();
        }
    }
}

package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.health.IBaseCommonCallback;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwlogsmodel.common.LogConfig;
import com.huawei.wisecloud.drmclient.license.HwDrmConstant;
import health.compact.a.CommonUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes11.dex */
public class muy {
    public static final String e = LogConfig.o() + "RemoteDetect";

    public static boolean c(String str) {
        Map<String, DeviceCapability> mapQueryDeviceCapability = mkf.e(BaseApplication.getContext()).queryDeviceCapability(1, str, "GetFileCommonUtil");
        boolean z = false;
        if (mapQueryDeviceCapability == null || mapQueryDeviceCapability.isEmpty()) {
            LogUtil.j("GetFileCommonUtil", "isSelfUploadDeviceLog queryDeviceCapability is null");
        } else {
            DeviceCapability deviceCapability = mapQueryDeviceCapability.get(str);
            z = deviceCapability != null && deviceCapability.isSupportSelfUploadDeviceLog();
        }
        ReleaseLogUtil.d("Dfx_GetFileCommonUtil", "isSelfUploadDeviceLog: ", Boolean.valueOf(z));
        return z;
    }

    public static String a(DeviceInfo deviceInfo) {
        ReleaseLogUtil.d("Dfx_GetFileCommonUtil", "enter startAppLogZipFile");
        if (deviceInfo == null) {
            return "";
        }
        try {
            String strC = CommonUtil.c(e + "/" + mjj.c().a(deviceInfo) + ".zip");
            LogUtil.a("GetFileCommonUtil", "startAppLogZipFile targetPath: ", strC);
            LinkedList<File> linkedListC = mjm.c(LogConfig.k());
            if (linkedListC != null && linkedListC.size() != 0) {
                String strD = d(deviceInfo);
                List<File> listD = d(linkedListC, strD, true);
                LogUtil.a("GetFileCommonUtil", "rootFiles: ", listD.toString());
                mjm.d(listD, new File(strC), "", strD);
                return strC;
            }
            LogUtil.d("GetFileCommonUtil", "list is null");
            return null;
        } catch (IOException unused) {
            ReleaseLogUtil.a("Dfx_GetFileCommonUtil", "startAppLogZipFile IOException");
            return null;
        } catch (OutOfMemoryError unused2) {
            ReleaseLogUtil.a("Dfx_GetFileCommonUtil", "startAppLogZipFile OutOfMemoryError");
            return null;
        }
    }

    public static String c(DeviceInfo deviceInfo) {
        ReleaseLogUtil.d("Dfx_GetFileCommonUtil", "enter ziplog method");
        LinkedList<File> linkedListC = mjm.c(muw.d + "MaintenanceLog");
        if (linkedListC == null || linkedListC.size() == 0) {
            ReleaseLogUtil.e("Dfx_GetFileCommonUtil", "deviceFileList is empty.");
            return null;
        }
        try {
            String strC = c(linkedListC, deviceInfo);
            LogUtil.a("GetFileCommonUtil", "UploadDevicelog fullFileName: ", strC);
            if (!TextUtils.isEmpty(strC) && strC.contains("_")) {
                if (strC.endsWith("_Beta_mcu_upg.log")) {
                    strC = strC.replace("_Beta_mcu_upg", "_WearableBeta");
                }
                int iIndexOf = strC.indexOf("_WearableBeta") + 13;
                LogUtil.a("GetFileCommonUtil", "uploadDevicelog index=", Integer.valueOf(iIndexOf));
                if (iIndexOf != -1) {
                    String strC2 = CommonUtil.c(i(e + strC.substring(0, iIndexOf) + ".zip"));
                    LogUtil.a("GetFileCommonUtil", "UploadDevicelog targetPath: ", strC2);
                    LinkedList<File> linkedListC2 = mjm.c(LogConfig.k());
                    if (linkedListC2 != null && linkedListC2.size() != 0) {
                        String strD = d(deviceInfo);
                        List<File> listD = d(linkedListC2, strD, false);
                        LogUtil.a("GetFileCommonUtil", "rootFiles: ", listD.toString());
                        mjm.d(listD, new File(strC2), "", strD);
                        a(linkedListC);
                        return strC2;
                    }
                    LogUtil.d("GetFileCommonUtil", "list is null");
                    return null;
                }
                return null;
            }
            ReleaseLogUtil.e("Dfx_GetFileCommonUtil", "uploadDevicelog fullFileName is null.");
            return null;
        } catch (IOException unused) {
            LogUtil.e("GetFileCommonUtil", "startZipFile IOException");
        } catch (OutOfMemoryError unused2) {
            LogUtil.e("GetFileCommonUtil", "startZipFile OutOfMemoryError");
        }
    }

    private static void a(List<File> list) {
        if (list == null || list.size() == 0) {
            LogUtil.j("GetFileCommonUtil", "list is empty");
            return;
        }
        for (File file : list) {
            if (file.exists()) {
                LogUtil.a("GetFileCommonUtil", "file name is:", file.getName(), ", deleteFiles isSuccess:", Boolean.valueOf(file.delete()));
            }
        }
    }

    private static List<File> d(List<File> list, String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (File file : list) {
            if (!z && file.getName().equals("com.huawei.version.json")) {
                arrayList.add(file);
            } else if (!z && file.getName().equals("MaintenanceLog")) {
                arrayList.add(file);
            } else if (file.getName().equals(muw.e)) {
                arrayList.add(file);
            } else if (file.getName().equals(muw.f42466c)) {
                arrayList.add(file);
            } else if (file.getName().equals(muw.f42464a)) {
                arrayList.add(file);
            } else if (file.getName().equals(muw.j)) {
                a(file, str);
                arrayList.add(file);
            } else {
                LogUtil.j("GetFileCommonUtil", "processFiles else");
            }
        }
        return arrayList;
    }

    private static void a(File file, String str) {
        if (file == null || TextUtils.isEmpty(str)) {
            LogUtil.j("GetFileCommonUtil", "params is null");
            return;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            LogUtil.j("GetFileCommonUtil", "originFiles is null");
            return;
        }
        for (File file2 : fileArrListFiles) {
            if (file2.getName().startsWith("log")) {
                b(file2, str);
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
                LogUtil.a("GetFileCommonUtil", "delte file: ", Boolean.valueOf(file.delete()));
            }
            if (file2.delete()) {
                return;
            }
            LogUtil.j("GetFileCommonUtil", "updateFileList tempFile.delete() false");
        } catch (IOException unused) {
            LogUtil.e("GetFileCommonUtil", "updateFileList IOException");
        }
    }

    private static String i(String str) {
        return CommonUtil.bu() ? str.replace("_WearableBeta", "_WearableCommercial") : str;
    }

    private static String c(List<File> list, DeviceInfo deviceInfo) {
        String name;
        String strD = d(deviceInfo);
        Iterator<File> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                name = "";
                break;
            }
            File next = it.next();
            if (next.getName().contains(strD)) {
                name = next.getName();
                break;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().contains(strD)) {
                String name2 = list.get(i).getName();
                boolean z = name2.contains("_&_&") || name2.contains("bigdata.log");
                boolean zContains = name2.contains("gpu_update.log");
                if (!name2.endsWith("_WearableBeta_mcu_upg.log") && !name2.endsWith("_Beta_mcu_upg.log") && !name2.endsWith("appdft_Beta.zip") && !z && !zContains) {
                    return CommonUtil.c(name2);
                }
            }
        }
        return CommonUtil.c(name);
    }

    public static DeviceInfo b(String str) {
        DeviceInfo deviceInfo = null;
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_DEVICES, null, "GetFileCommonUtil");
        if (deviceList == null || deviceList.size() == 0) {
            LogUtil.a("GetFileCommonUtil", "no device connected");
            return null;
        }
        for (DeviceInfo deviceInfo2 : deviceList) {
            if (str.equals(deviceInfo2.getUuid()) || str.equals(deviceInfo2.getDeviceUdid())) {
                deviceInfo = deviceInfo2;
                break;
            }
        }
        return deviceInfo == null ? deviceList.get(0) : deviceInfo;
    }

    public static DeviceInfo d(String str) {
        List<DeviceInfo> deviceList;
        if (TextUtils.isEmpty(str) && (deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "GetFileCommonUtil")) != null && deviceList.size() != 0) {
            for (DeviceInfo deviceInfo : deviceList) {
                if (str.contains(d(deviceInfo))) {
                    return deviceInfo;
                }
            }
        }
        return null;
    }

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.a("GetFileCommonUtil", "isUpload targetPath is empty");
            return false;
        }
        String strB = SharedPreferenceManager.b("detect_wifi_mmkv_model_id", "detect_wifi_upload_log", "");
        LogUtil.a("GetFileCommonUtil", "uploadStringList: ", strB);
        if (!TextUtils.isEmpty(strB)) {
            for (String str2 : strB.split("#")) {
                if (str2.equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean b() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            long jD = SharedPreferenceManager.d("detect_wifi_mmkv_model_id", "detect_upload_log_last_time", 0L);
            ReleaseLogUtil.d("Dfx_GetFileCommonUtil", "isCanUpload currentTime is: ", Long.valueOf(jCurrentTimeMillis), ", lastTime is: ", Long.valueOf(jD));
            if (jCurrentTimeMillis - jD < 600000) {
                ReleaseLogUtil.e("Dfx_GetFileCommonUtil", "isCanUpload Less than ten minutes");
                return false;
            }
        } catch (NumberFormatException unused) {
            ReleaseLogUtil.a("Dfx_GetFileCommonUtil", "isCanUpload NumberFormatException");
        }
        SharedPreferenceManager.c("detect_wifi_mmkv_model_id", "detect_upload_log_last_time", jCurrentTimeMillis);
        return true;
    }

    public static void e(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.a("GetFileCommonUtil", "targetPath is empty");
            return;
        }
        String strB = SharedPreferenceManager.b("detect_wifi_mmkv_model_id", "detect_wifi_upload_log", "");
        if (TextUtils.isEmpty(strB)) {
            return;
        }
        String[] strArrSplit = strB.split("#");
        for (int i = 0; i < strArrSplit.length; i++) {
            if (strArrSplit[i].equals(str)) {
                strArrSplit[i] = "";
                d(strArrSplit);
            }
        }
    }

    private static void d(String[] strArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < strArr.length; i++) {
            if (!TextUtils.isEmpty(strArr[i])) {
                stringBuffer.append(strArr[i] + "#");
            }
        }
        SharedPreferenceManager.c("detect_wifi_mmkv_model_id", "detect_wifi_upload_log", stringBuffer.toString());
    }

    public static String a(String str, Context context) {
        if (TextUtils.isEmpty(str) || context == null) {
            LogUtil.a("GetFileCommonUtil", "getCurrentDeviceUnitId targetPath is null or context is null");
            return "";
        }
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "GetFileCommonUtil");
        if (deviceList != null && deviceList.size() != 0) {
            for (DeviceInfo deviceInfo : deviceList) {
                if (str.contains(d(deviceInfo))) {
                    return deviceInfo.getDeviceIdentify();
                }
            }
        }
        return "";
    }

    public static String d(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.e("GetFileCommonUtil", "getShaDeviceId currentDeviceInfo is null");
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
        return g(securityDeviceId);
    }

    public static String g(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.a("GetFileCommonUtil", "setDeviceMac deviceMac is null");
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

    public static void c(IBaseCommonCallback iBaseCommonCallback, int i, String str) {
        if (iBaseCommonCallback == null) {
            LogUtil.j("GetFileCommonUtil", "callback is null");
            return;
        }
        LogUtil.a("GetFileCommonUtil", "resultCode:", Integer.valueOf(i), ", response:", str);
        try {
            iBaseCommonCallback.onResponse(i, str);
        } catch (RemoteException unused) {
            LogUtil.e("GetFileCommonUtil", "setResponse RemoteException");
        }
    }

    public static void a() {
        ltr.b().uninit(BaseApplication.getContext());
        ltr.b().logout();
    }
}

package defpackage;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.Base64;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.model.SampleEvent;
import com.huawei.hwlogsmodel.common.LogConfig;
import com.huawei.unitedevice.entity.UniteDevice;
import com.huawei.wisecloud.drmclient.license.HwDrmConstant;
import health.compact.a.CommonUtil;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.ToLongFunction;
import java.util.regex.Pattern;
import org.apache.commons.io.FileUtils;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes4.dex */
public class cpj {
    private static final String d = LogConfig.k() + "MaintenanceLog/";

    private static boolean a(int i) {
        return i == 5 || i == 1 || i == 7 || i == 14 || i == 2 || i == 3 || i == 8 || i == 13 || i == 15 || i == 16;
    }

    private cpj() {
    }

    public static void d(String str, String str2, int i, DeviceInfo deviceInfo) {
        synchronized (cpj.class) {
            try {
                if (i == 1) {
                    LogUtil.b("LogAppEventUtil", "addAppEventLog enter otaEventLog");
                    a(str, str2, d, "_WearableBeta_gpu_update.log", deviceInfo);
                } else {
                    a(str, str2, d, "_WearableBeta_app_bigdata.log", deviceInfo);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void a(final String str, final String str2, final String str3, final String str4, final DeviceInfo deviceInfo) {
        synchronized (cpj.class) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: cpj.4
                @Override // java.lang.Runnable
                public void run() {
                    DeviceInfo deviceInfoC;
                    String deviceName;
                    String strB = str2;
                    LogUtil.b("LogAppEventUtil", "addAppEventLog enter eventData: ", str, ",deviceName: ", strB, ", fileNameEnd = ", str4);
                    if (TextUtils.isEmpty(str)) {
                        ReleaseLogUtil.d("Dfx_LogAppEventUtil", "addAppEventLog eventData is empty");
                        return;
                    }
                    if (TextUtils.equals(str4, "_WearableBeta_gpu_update.log")) {
                        DeviceInfo deviceInfo2 = deviceInfo;
                        if (deviceInfo2 == null) {
                            ReleaseLogUtil.d("Dfx_LogAppEventUtil", "addAppEventLog ota deviceInfo is null");
                            return;
                        } else {
                            deviceName = deviceInfo2.getDeviceName();
                            deviceInfoC = deviceInfo;
                        }
                    } else {
                        if (TextUtils.isEmpty(strB)) {
                            strB = SharedPreferenceManager.b(String.valueOf(10), "app_big_data_device_name", "");
                        }
                        deviceInfoC = cox.c(cpj.a());
                        deviceName = strB;
                    }
                    if (TextUtils.isEmpty(deviceName)) {
                        ReleaseLogUtil.d("Dfx_LogAppEventUtil", "createAppEventLogFile deviceName is empty");
                        return;
                    }
                    if (deviceInfoC != null) {
                        LogUtil.e("LogAppEventUtil", "addAppEventLog final deviceInfo: DeviceName: ", deviceName, ",SN: ", cpl.a(deviceInfoC.getDeviceIdentify()));
                    } else {
                        ReleaseLogUtil.d("Dfx_LogAppEventUtil", "addAppEventLog is not connected device");
                    }
                    cpj.a(BaseApplication.b(), deviceInfoC, deviceName, str3, str4, System.lineSeparator() + str);
                    LinkedList<File> linkedListF = cpj.f(cop.b(str3));
                    if (linkedListF == null || linkedListF.size() == 0) {
                        ReleaseLogUtil.d("Dfx_LogAppEventUtil", "appEventFiles size is 0");
                        return;
                    }
                    try {
                        if (TextUtils.equals(str4, "_WearableBeta_gpu_update.log")) {
                            File fileE = cpj.e((List<Map.Entry<String, Long>>) cpj.n(deviceName));
                            if (fileE != null) {
                                cpj.c(str, fileE);
                                return;
                            } else {
                                ReleaseLogUtil.d("Dfx_LogAppEventUtil", "ota files size is 0 or file is null");
                                return;
                            }
                        }
                        for (File file : linkedListF) {
                            String strB2 = cpj.b(deviceInfoC);
                            if (TextUtils.isEmpty(strB2)) {
                                ReleaseLogUtil.b("Dfx_LogAppEventUtil", "addAppEventLog shaDeviceId is null or empty");
                            } else if (file.getName().contains(strB2) && file.getName().contains("_WearableBeta_app_bigdata.log")) {
                                LogUtil.b("LogAppEventUtil", "appEventFiles: ", file.getName());
                                cpj.c(str, file);
                            } else {
                                ReleaseLogUtil.d("Dfx_LogAppEventUtil", "addAppEventLog not contains WEARABLE_BETA_APP_EVENT_LOG");
                            }
                        }
                    } catch (OutOfMemoryError unused) {
                        ReleaseLogUtil.d("Dfx_LogAppEventUtil", "addAppEventLog OutOfMemoryError");
                    }
                }
            });
        }
    }

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.compile("[0-9]*").matcher(str).matches();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static UniteDevice a() {
        ArrayList<UniteDevice> arrayList = new ArrayList(cju.d().getDeviceList().values());
        if (arrayList.isEmpty()) {
            return null;
        }
        for (UniteDevice uniteDevice : arrayList) {
            com.huawei.devicesdk.entity.DeviceInfo deviceInfo = uniteDevice.getDeviceInfo();
            if (deviceInfo.isUsing() && deviceInfo.getDeviceConnectState() == 2 && deviceInfo.getDeviceType() > 0) {
                return uniteDevice;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:20:0x0043  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:53:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:58:0x0109 A[Catch: all -> 0x0139, TryCatch #0 {, blocks: (B:5:0x0004, B:7:0x0012, B:10:0x001f, B:23:0x0048, B:51:0x00f7, B:64:0x0118, B:65:0x0130, B:66:0x0134, B:55:0x0100, B:58:0x0109, B:24:0x0061, B:27:0x006c, B:29:0x0081, B:32:0x008e, B:34:0x009d, B:35:0x00b3, B:48:0x00d8, B:49:0x00f0, B:50:0x00f4, B:39:0x00bf, B:42:0x00c9, B:25:0x0066, B:14:0x002f, B:17:0x0039), top: B:72:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0111  */
    /* JADX WARN: Code duplicated, block: B:61:0x0113  */
    /* JADX WARN: Code duplicated, block: B:63:0x0116 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x0118 A[Catch: all -> 0x0139, TryCatch #0 {, blocks: (B:5:0x0004, B:7:0x0012, B:10:0x001f, B:23:0x0048, B:51:0x00f7, B:64:0x0118, B:65:0x0130, B:66:0x0134, B:55:0x0100, B:58:0x0109, B:24:0x0061, B:27:0x006c, B:29:0x0081, B:32:0x008e, B:34:0x009d, B:35:0x00b3, B:48:0x00d8, B:49:0x00f0, B:50:0x00f4, B:39:0x00bf, B:42:0x00c9, B:25:0x0066, B:14:0x002f, B:17:0x0039), top: B:72:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0130 A[Catch: all -> 0x0139, TryCatch #0 {, blocks: (B:5:0x0004, B:7:0x0012, B:10:0x001f, B:23:0x0048, B:51:0x00f7, B:64:0x0118, B:65:0x0130, B:66:0x0134, B:55:0x0100, B:58:0x0109, B:24:0x0061, B:27:0x006c, B:29:0x0081, B:32:0x008e, B:34:0x009d, B:35:0x00b3, B:48:0x00d8, B:49:0x00f0, B:50:0x00f4, B:39:0x00bf, B:42:0x00c9, B:25:0x0066, B:14:0x002f, B:17:0x0039), top: B:72:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0134 A[Catch: all -> 0x0139, TRY_LEAVE, TryCatch #0 {, blocks: (B:5:0x0004, B:7:0x0012, B:10:0x001f, B:23:0x0048, B:51:0x00f7, B:64:0x0118, B:65:0x0130, B:66:0x0134, B:55:0x0100, B:58:0x0109, B:24:0x0061, B:27:0x006c, B:29:0x0081, B:32:0x008e, B:34:0x009d, B:35:0x00b3, B:48:0x00d8, B:49:0x00f0, B:50:0x00f4, B:39:0x00bf, B:42:0x00c9, B:25:0x0066, B:14:0x002f, B:17:0x0039), top: B:72:0x0004 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:64:0x0118, please report this as an issue */
    public static void a(Context context, DeviceInfo deviceInfo, String str, String str2, String str3, String str4) {
        byte b2;
        boolean zJ;
        byte b3;
        int iHashCode;
        synchronized (cpj.class) {
            byte b4 = 0;
            ReleaseLogUtil.c("Dfx_LogAppEventUtil", "createAppEventLogFile enter");
            if (context == null) {
                ReleaseLogUtil.d("Dfx_LogAppEventUtil", "createAppEventLogFile context is null.");
                return;
            }
            int iHashCode2 = str3.hashCode();
            if (iHashCode2 != 256330313) {
                if (iHashCode2 == 2123929995 && str3.equals("_WearableBeta_app_bigdata.log")) {
                    b2 = 0;
                } else {
                    b2 = -1;
                }
            } else if (str3.equals("_WearableBeta_gpu_update.log")) {
                b2 = 1;
            } else {
                b2 = -1;
            }
            if (b2 == 0) {
                zJ = j(str);
            } else {
                if (b2 == 1) {
                    zJ = a(str, str4);
                } else {
                    LogUtil.b("LogAppEventUtil", "createAppEventLogFile other type fileNameEnd = " + str3);
                }
                iHashCode = str3.hashCode();
                if (iHashCode != 256330313) {
                    if (iHashCode == 2123929995 || !str3.equals("_WearableBeta_app_bigdata.log")) {
                        b4 = -1;
                    }
                } else if (str3.equals("_WearableBeta_gpu_update.log")) {
                    b4 = 1;
                } else {
                    b4 = -1;
                }
                if (b4 != 0) {
                    a(deviceInfo);
                } else if (b4 != 1) {
                    b(deviceInfo, str2, str3);
                } else {
                    LogUtil.b("LogAppEventUtil", "createAppEventLogFile other type fileNameEnd = " + str3);
                }
            }
            if (zJ) {
                ReleaseLogUtil.c("Dfx_LogAppEventUtil", "createAppEventLogFile isCreateAppEventLog is true");
                String strB = cop.b(str2);
                if (TextUtils.isEmpty(strB)) {
                    ReleaseLogUtil.d("Dfx_LogAppEventUtil", "isCreateAppEventLog pathName is empty");
                    return;
                }
                File file = new File(cop.b(strB));
                if (!file.exists()) {
                    LogUtil.b("LogAppEventUtil", "createAppEventLogFile mkdirs result: ", Boolean.valueOf(file.mkdirs()));
                }
                b(deviceInfo, str, str2, str3);
                int iHashCode3 = str3.hashCode();
                if (iHashCode3 != 256330313) {
                    if (iHashCode3 == 2123929995 && str3.equals("_WearableBeta_app_bigdata.log")) {
                        b3 = 0;
                    } else {
                        b3 = -1;
                    }
                } else if (str3.equals("_WearableBeta_gpu_update.log")) {
                    b3 = 1;
                } else {
                    b3 = -1;
                }
                if (b3 == 0) {
                    e(str2, str3);
                } else if (b3 == 1) {
                    e(str, str2, str3);
                } else {
                    LogUtil.b("LogAppEventUtil", "createAppEventLogFile other type fileNameEnd = " + str3);
                }
            }
            iHashCode = str3.hashCode();
            if (iHashCode != 256330313) {
                if (iHashCode == 2123929995) {
                }
                b4 = -1;
            } else if (str3.equals("_WearableBeta_gpu_update.log")) {
                b4 = 1;
            } else {
                b4 = -1;
            }
            if (b4 != 0) {
                a(deviceInfo);
            } else if (b4 != 1) {
                b(deviceInfo, str2, str3);
            } else {
                LogUtil.b("LogAppEventUtil", "createAppEventLogFile other type fileNameEnd = " + str3);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x009c A[Catch: IOException -> 0x00a5, TryCatch #12 {IOException -> 0x00a5, blocks: (B:33:0x0097, B:35:0x009c, B:37:0x00a1), top: B:75:0x0097 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00a1 A[Catch: IOException -> 0x00a5, TRY_LEAVE, TryCatch #12 {IOException -> 0x00a5, blocks: (B:33:0x0097, B:35:0x009c, B:37:0x00a1), top: B:75:0x0097 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00bf A[Catch: IOException -> 0x00c8, TryCatch #10 {IOException -> 0x00c8, blocks: (B:43:0x00ba, B:45:0x00bf, B:47:0x00c4), top: B:73:0x00ba }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00c4 A[Catch: IOException -> 0x00c8, TRY_LEAVE, TryCatch #10 {IOException -> 0x00c8, blocks: (B:43:0x00ba, B:45:0x00bf, B:47:0x00c4), top: B:73:0x00ba }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00de A[Catch: IOException -> 0x00e7, TryCatch #9 {IOException -> 0x00e7, blocks: (B:54:0x00d9, B:56:0x00de, B:58:0x00e3), top: B:71:0x00d9 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00e3 A[Catch: IOException -> 0x00e7, TRY_LEAVE, TryCatch #9 {IOException -> 0x00e7, blocks: (B:54:0x00d9, B:56:0x00de, B:58:0x00e3), top: B:71:0x00d9 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.io.InputStreamReader] */
    /* JADX WARN: Type inference failed for: r11v11, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v12, types: [java.io.InputStreamReader] */
    /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19, types: [java.io.InputStreamReader, java.io.Reader] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v20, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.io.InputStreamReader] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    private static String b(File file) throws Throwable {
        Throwable th;
        ?? r11;
        FileInputStream fileInputStream;
        LogUtil.b("LogAppEventUtil", "enter getFileReadLineName");
        if (file == 0) {
            LogUtil.e("LogAppEventUtil", "getFileReadLineName is null");
            return "";
        }
        ?? line = 0;
        line = 0;
        line = 0;
        line = 0;
        line = 0;
         = 0;
        line = 0;
        line = 0;
        ?? r5 = 0;
        try {
            try {
                fileInputStream = new FileInputStream((File) file);
                try {
                    file = new InputStreamReader(fileInputStream, "UTF-8");
                    try {
                        BufferedReader bufferedReader = new BufferedReader(file);
                        try {
                            line = bufferedReader.readLine();
                            if (line != 0) {
                                String string = new JSONObject((String) line).getString("wear_device_name");
                                LogUtil.b("LogAppEventUtil", "getFileReadLineName deviceName: ", string);
                                try {
                                    bufferedReader.close();
                                    file.close();
                                    fileInputStream.close();
                                    return string;
                                } catch (IOException unused) {
                                    LogUtil.e("LogAppEventUtil", "finally IOException");
                                    return string;
                                }
                            }
                            try {
                                bufferedReader.close();
                                file.close();
                                fileInputStream.close();
                            } catch (IOException unused2) {
                                file = new Object[]{"finally IOException"};
                                LogUtil.e("LogAppEventUtil", file);
                            }
                        } catch (IOException unused3) {
                            line = bufferedReader;
                            LogUtil.e("LogAppEventUtil", "readLine IOException");
                            if (line != 0) {
                                try {
                                    line.close();
                                    if (file != 0) {
                                        file.close();
                                    }
                                    if (fileInputStream != null) {
                                        fileInputStream.close();
                                    }
                                } catch (IOException unused4) {
                                    file = new Object[]{"finally IOException"};
                                    LogUtil.e("LogAppEventUtil", file);
                                }
                            } else {
                                if (file != 0) {
                                    file.close();
                                }
                                if (fileInputStream != null) {
                                    fileInputStream.close();
                                }
                            }
                        } catch (JSONException unused5) {
                            line = bufferedReader;
                            LogUtil.b("LogAppEventUtil", "getFileReadLineName JSONException");
                            if (line != 0) {
                                try {
                                    line.close();
                                    if (file != 0) {
                                        file.close();
                                    }
                                    if (fileInputStream != null) {
                                        fileInputStream.close();
                                    }
                                } catch (IOException unused6) {
                                    file = new Object[]{"finally IOException"};
                                    LogUtil.e("LogAppEventUtil", file);
                                }
                            } else {
                                if (file != 0) {
                                    file.close();
                                }
                                if (fileInputStream != null) {
                                    fileInputStream.close();
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            r5 = bufferedReader;
                            r11 = file;
                            if (r5 != 0) {
                                try {
                                    r5.close();
                                    if (r11 != 0) {
                                        r11.close();
                                    }
                                    if (fileInputStream != null) {
                                        fileInputStream.close();
                                    }
                                } catch (IOException unused7) {
                                    LogUtil.e("LogAppEventUtil", "finally IOException");
                                    throw th;
                                }
                            } else {
                                if (r11 != 0) {
                                    r11.close();
                                }
                                if (fileInputStream != null) {
                                    fileInputStream.close();
                                }
                            }
                            throw th;
                        }
                    } catch (IOException unused8) {
                    } catch (JSONException unused9) {
                    }
                } catch (IOException unused10) {
                    file = 0;
                } catch (JSONException unused11) {
                    file = 0;
                } catch (Throwable th3) {
                    th = th3;
                    r11 = 0;
                }
            } catch (Throwable th4) {
                th = th4;
                r5 = line;
                r11 = file;
            }
        } catch (IOException unused12) {
            file = 0;
            fileInputStream = null;
        } catch (JSONException unused13) {
            file = 0;
            fileInputStream = null;
        } catch (Throwable th5) {
            th = th5;
            r11 = 0;
            fileInputStream = null;
        }
        return "";
    }

    private static void b(String str, DeviceInfo deviceInfo) throws Throwable {
        String strSubstring;
        LogUtil.b("LogAppEventUtil", "enter writeFileHeadAndRename");
        if (deviceInfo == null) {
            LogUtil.e("LogAppEventUtil", "writeFileHeadAndRename currentDeviceInfo is null");
            return;
        }
        int iLastIndexOf = str.lastIndexOf("/");
        if (iLastIndexOf == -1) {
            strSubstring = "";
        } else {
            strSubstring = str.substring(iLastIndexOf + 1, str.length());
            LogUtil.b("LogAppEventUtil", "writeFileHeadAndRename fileNamePath: ", strSubstring);
            if (!strSubstring.contains("_&_&")) {
                LogUtil.b("LogAppEventUtil", "writeFileHeadAndRename isWriteFileHead is false");
                return;
            }
        }
        int productType = deviceInfo.getProductType();
        String strD = d(productType, b(productType, deviceInfo.getDeviceModel(), deviceInfo.getDeviceName()), deviceInfo.getDeviceModel());
        String softVersion = deviceInfo.getSoftVersion();
        String strB = b(deviceInfo);
        d(str, strD, softVersion, strB);
        String[] strArrSplit = strSubstring.split("_");
        if (strArrSplit.length > 3) {
            strArrSplit[0] = strD;
            strArrSplit[1] = softVersion;
            strArrSplit[2] = strB;
        }
        StringBuffer stringBuffer = new StringBuffer(16);
        for (int i = 0; i < strArrSplit.length; i++) {
            if (i != strArrSplit.length - 1) {
                stringBuffer.append(strArrSplit[i] + "_");
            } else {
                stringBuffer.append(strArrSplit[i]);
            }
        }
        LogUtil.b("LogAppEventUtil", "oldFileName: ", strSubstring, ", newFileName: ", stringBuffer.toString());
        d(strSubstring, stringBuffer.toString());
    }

    private static void d(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.e("LogAppEventUtil", "fileReName oldPath or newPath is empty");
            return;
        }
        StringBuilder sb = new StringBuilder();
        String str3 = d;
        sb.append(str3);
        sb.append(str);
        File file = new File(sb.toString());
        if (!file.exists()) {
            LogUtil.e("LogAppEventUtil", "fileReName file is not exists");
            return;
        }
        if (file.renameTo(new File(str3 + str2))) {
            LogUtil.b("LogAppEventUtil", "fileReName is success");
        } else {
            LogUtil.b("LogAppEventUtil", "fileReName is failed");
        }
    }

    private static void d(String str, String str2, String str3, String str4) throws Throwable {
        BufferedWriter bufferedWriter;
        BufferedReader bufferedReader;
        FileReader fileReader;
        BufferedWriter bufferedWriter2;
        BufferedWriter bufferedWriter3;
        FileReader fileReader2;
        BufferedReader bufferedReader2;
        try {
            try {
                fileReader = new FileReader(new File(str));
                try {
                    bufferedReader = new BufferedReader(fileReader);
                    try {
                        StringBuilder sb = new StringBuilder(16);
                        int i = 1;
                        while (true) {
                            String line = bufferedReader.readLine();
                            if (line != null) {
                                if (i == 1) {
                                    JSONObject jSONObject = new JSONObject(line);
                                    LogUtil.b("LogAppEventUtil", "writeFileHeadInfo jsonObjectOld: ", jSONObject.toString());
                                    jSONObject.put("wear_device_type", str2);
                                    jSONObject.put("wear_device_version", str3);
                                    jSONObject.put("wear_device_id", str4);
                                    LogUtil.b("LogAppEventUtil", "writeFileHeadInfo jsonObjectNew: ", jSONObject.toString());
                                    sb.append(jSONObject.toString());
                                } else {
                                    sb.append(System.lineSeparator());
                                    sb.append(line);
                                }
                                i++;
                            } else {
                                BufferedWriter bufferedWriter4 = new BufferedWriter(new FileWriter(str));
                                try {
                                    bufferedWriter4.write(sb.toString());
                                    d(bufferedWriter4, bufferedReader, fileReader);
                                    return;
                                } catch (IOException unused) {
                                    bufferedReader2 = bufferedReader;
                                    bufferedWriter2 = bufferedWriter4;
                                } catch (IllegalArgumentException e) {
                                    e = e;
                                    bufferedReader2 = bufferedReader;
                                    bufferedWriter2 = bufferedWriter4;
                                    ReleaseLogUtil.b("Dfx_LogAppEventUtil", "writeFileHeadPart readFileException: ", ExceptionUtils.c(e));
                                    d(bufferedWriter2, bufferedReader2, fileReader);
                                } catch (OutOfMemoryError unused2) {
                                    bufferedReader2 = bufferedReader;
                                    bufferedWriter2 = bufferedWriter4;
                                    ReleaseLogUtil.b("Dfx_LogAppEventUtil", "writeFileHeadPart OutOfMemoryError");
                                    d(bufferedWriter2, bufferedReader2, fileReader);
                                } catch (JSONException unused3) {
                                    bufferedReader2 = bufferedReader;
                                    bufferedWriter2 = bufferedWriter4;
                                    LogUtil.b("LogAppEventUtil", "writeFileHeadPart JSONException");
                                    d(bufferedWriter2, bufferedReader2, fileReader);
                                } catch (Throwable th) {
                                    th = th;
                                    bufferedWriter = bufferedWriter4;
                                    d(bufferedWriter, bufferedReader, fileReader);
                                    throw th;
                                }
                            }
                            LogUtil.b("LogAppEventUtil", "writeFileHeadPart IOException");
                            d(bufferedWriter2, bufferedReader2, fileReader);
                        }
                    } catch (IOException unused4) {
                        bufferedReader2 = bufferedReader;
                        bufferedWriter2 = null;
                    } catch (IllegalArgumentException e2) {
                        e = e2;
                        bufferedReader2 = bufferedReader;
                        bufferedWriter2 = null;
                    } catch (OutOfMemoryError unused5) {
                        bufferedReader2 = bufferedReader;
                        bufferedWriter2 = null;
                    } catch (JSONException unused6) {
                        bufferedReader2 = bufferedReader;
                        bufferedWriter2 = null;
                    } catch (Throwable th2) {
                        th = th2;
                        fileReader2 = fileReader;
                        bufferedWriter3 = null;
                        fileReader = fileReader2;
                        bufferedWriter = bufferedWriter3;
                        d(bufferedWriter, bufferedReader, fileReader);
                        throw th;
                    }
                } catch (IOException unused7) {
                    bufferedWriter2 = null;
                    bufferedReader2 = null;
                } catch (IllegalArgumentException e3) {
                    e = e3;
                    bufferedWriter2 = null;
                    bufferedReader2 = null;
                    ReleaseLogUtil.b("Dfx_LogAppEventUtil", "writeFileHeadPart readFileException: ", ExceptionUtils.c(e));
                    d(bufferedWriter2, bufferedReader2, fileReader);
                } catch (OutOfMemoryError unused8) {
                    bufferedWriter2 = null;
                    bufferedReader2 = null;
                    ReleaseLogUtil.b("Dfx_LogAppEventUtil", "writeFileHeadPart OutOfMemoryError");
                    d(bufferedWriter2, bufferedReader2, fileReader);
                } catch (JSONException unused9) {
                    bufferedWriter2 = null;
                    bufferedReader2 = null;
                    LogUtil.b("LogAppEventUtil", "writeFileHeadPart JSONException");
                    d(bufferedWriter2, bufferedReader2, fileReader);
                } catch (Throwable th3) {
                    th = th3;
                    bufferedWriter = null;
                    bufferedReader = null;
                }
            } catch (Throwable th4) {
                th = th4;
                bufferedReader = bufferedReader2;
                bufferedWriter3 = bufferedWriter2;
                fileReader2 = fileReader;
            }
        } catch (IOException unused10) {
            bufferedWriter2 = null;
            fileReader = null;
        } catch (IllegalArgumentException e4) {
            e = e4;
            bufferedWriter2 = null;
            fileReader = null;
        } catch (OutOfMemoryError unused11) {
            bufferedWriter2 = null;
            fileReader = null;
        } catch (JSONException unused12) {
            bufferedWriter2 = null;
            fileReader = null;
        } catch (Throwable th5) {
            th = th5;
            bufferedWriter = null;
            bufferedReader = null;
            fileReader = null;
        }
    }

    private static boolean c(DeviceInfo deviceInfo, String str) {
        return (deviceInfo == null || deviceInfo.getDeviceName() == null || !deviceInfo.getDeviceName().equals(str)) ? false : true;
    }

    private static void b(DeviceInfo deviceInfo, String str, String str2, String str3) {
        String softVersion;
        String strD;
        FileOutputStream fileOutputStreamOpenOutputStream;
        OutputStreamWriter outputStreamWriter;
        BufferedWriter bufferedWriter;
        synchronized (cpj.class) {
            if (c(deviceInfo, str)) {
                int productType = deviceInfo.getProductType();
                strD = d(productType, b(productType, deviceInfo.getDeviceModel(), deviceInfo.getDeviceName()), deviceInfo.getDeviceModel());
                softVersion = deviceInfo.getSoftVersion();
            } else {
                softVersion = "&";
                strD = str;
            }
            String strB = b(deviceInfo);
            if (!c(deviceInfo, str) || TextUtils.isEmpty(strB)) {
                strB = "&";
            }
            String str4 = str2 + strD + "_" + softVersion + "_" + strB + "_" + c() + str3;
            LogUtil.b("LogAppEventUtil", "appEventPath is: ", str4);
            String strB2 = cop.b(str4);
            FileOutputStream fileOutputStream = null;
            bufferedWriter = null;
            fileOutputStream = null;
            fileOutputStream = null;
            fileOutputStream = null;
            BufferedWriter bufferedWriter2 = null;
            try {
                try {
                    if (TextUtils.isEmpty(strB2)) {
                        LogUtil.e("LogAppEventUtil", "onCreateFile filePath is empty");
                        a((BufferedWriter) null, (OutputStreamWriter) null, (FileOutputStream) null);
                        return;
                    }
                    File file = FileUtils.getFile(strB2);
                    if (file == null) {
                        LogUtil.e("LogAppEventUtil", "onCreateFile pathFile is null");
                        a((BufferedWriter) null, (OutputStreamWriter) null, (FileOutputStream) null);
                        return;
                    }
                    fileOutputStreamOpenOutputStream = FileUtils.openOutputStream(file, true);
                    try {
                        outputStreamWriter = new OutputStreamWriter(fileOutputStreamOpenOutputStream, "UTF-8");
                        try {
                            bufferedWriter = new BufferedWriter(outputStreamWriter);
                            try {
                                File file2 = new File(strB2);
                                if (!file2.exists() && file2.createNewFile()) {
                                    ReleaseLogUtil.d("Dfx_LogAppEventUtil", "onCreateFile success");
                                }
                                bufferedWriter.write("");
                                String deviceName = c(deviceInfo, str) ? deviceInfo.getDeviceName() : str;
                                if (!c(deviceInfo, str)) {
                                    strD = "";
                                    strB = "";
                                    softVersion = "";
                                }
                                String strD2 = d(BaseApplication.b(), strD, deviceName, strB, softVersion);
                                ReleaseLogUtil.d("Dfx_LogAppEventUtil", "onCreateFile write");
                                bufferedWriter.write(strD2);
                                a(bufferedWriter, outputStreamWriter, fileOutputStreamOpenOutputStream);
                            } catch (IOException unused) {
                                fileOutputStream = fileOutputStreamOpenOutputStream;
                                ReleaseLogUtil.b("Dfx_LogAppEventUtil", "onCreateFile ioException");
                                a(bufferedWriter, outputStreamWriter, fileOutputStream);
                            } catch (IllegalArgumentException e) {
                                e = e;
                                fileOutputStream = fileOutputStreamOpenOutputStream;
                                ReleaseLogUtil.b("Dfx_LogAppEventUtil", "onCreateFile readFileException: ", ExceptionUtils.c(e));
                                a(bufferedWriter, outputStreamWriter, fileOutputStream);
                            } catch (OutOfMemoryError unused2) {
                                fileOutputStream = fileOutputStreamOpenOutputStream;
                                ReleaseLogUtil.b("Dfx_LogAppEventUtil", "onCreateFile OutOfMemoryError");
                                a(bufferedWriter, outputStreamWriter, fileOutputStream);
                            } catch (Throwable th) {
                                th = th;
                                bufferedWriter2 = bufferedWriter;
                                a(bufferedWriter2, outputStreamWriter, fileOutputStreamOpenOutputStream);
                                throw th;
                            }
                        } catch (IOException unused3) {
                            bufferedWriter = null;
                        } catch (IllegalArgumentException e2) {
                            e = e2;
                            bufferedWriter = null;
                        } catch (OutOfMemoryError unused4) {
                            bufferedWriter = null;
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedWriter = null;
                            outputStreamWriter = outputStreamWriter;
                            bufferedWriter2 = bufferedWriter;
                            a(bufferedWriter2, outputStreamWriter, fileOutputStreamOpenOutputStream);
                            throw th;
                        }
                    } catch (IOException unused5) {
                        outputStreamWriter = null;
                        bufferedWriter = null;
                    } catch (IllegalArgumentException e3) {
                        e = e3;
                        outputStreamWriter = null;
                        bufferedWriter = null;
                    } catch (OutOfMemoryError unused6) {
                        outputStreamWriter = null;
                        bufferedWriter = null;
                    } catch (Throwable th3) {
                        th = th3;
                        outputStreamWriter = null;
                        a(bufferedWriter2, outputStreamWriter, fileOutputStreamOpenOutputStream);
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    fileOutputStreamOpenOutputStream = fileOutputStream;
                }
            } catch (IOException unused7) {
                outputStreamWriter = null;
                bufferedWriter = null;
            } catch (IllegalArgumentException e4) {
                e = e4;
                outputStreamWriter = null;
                bufferedWriter = null;
            } catch (OutOfMemoryError unused8) {
                outputStreamWriter = null;
                bufferedWriter = null;
            } catch (Throwable th5) {
                th = th5;
                fileOutputStreamOpenOutputStream = null;
                outputStreamWriter = null;
            }
        }
    }

    private static String c() {
        try {
            String strI = i(HwDrmConstant.TIME_FORMAT);
            LogUtil.b("LogAppEventUtil", "getCurrentTimeMinutes: currentTime is ", strI);
            return strI;
        } catch (Exception unused) {
            LogUtil.d("LogAppEventUtil", "getCurrentTimeMinutes exception");
            return "";
        }
    }

    private static String i(String str) {
        return new SimpleDateFormat(str, Locale.ENGLISH).format(Calendar.getInstance().getTime());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static LinkedList<File> f(String str) {
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.d("Dfx_LogAppEventUtil", "listLinkedAppEventFiles path is null");
            return null;
        }
        File[] fileArrListFiles = new File(str).listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            ReleaseLogUtil.d("Dfx_LogAppEventUtil", "listLinkedAppEventFiles directory.listFiles is null");
            return null;
        }
        LinkedList<File> linkedList = new LinkedList<>();
        LogUtil.b("LogAppEventUtil", "listLinkedAppEventFiles files: ", Integer.valueOf(fileArrListFiles.length));
        for (File file : fileArrListFiles) {
            String name = file.getName();
            if ((!file.isDirectory() && name.contains("_WearableBeta_app_bigdata.log")) || ((!file.isDirectory() && name.contains("_WearableBeta_gpu_update.log")) || file.isDirectory())) {
                linkedList.add(file);
            } else {
                ReleaseLogUtil.d("Dfx_LogAppEventUtil", "listLinkedAppEventFiles else");
            }
        }
        return linkedList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.io.OutputStreamWriter] */
    public static void c(String str, File file) {
        ?? r2;
        ?? r5;
        FileOutputStream fileOutputStream;
        OutputStreamWriter outputStreamWriter;
        OutputStreamWriter outputStreamWriter2;
        FileOutputStream fileOutputStream2;
        synchronized (cpj.class) {
            Object[] objArr = {"writeAppEventDate enter eventData: ", str, ", fileName = " + file.getName()};
            LogUtil.b("LogAppEventUtil", objArr);
            BufferedWriter bufferedWriter = null;
            try {
                try {
                    String strB = cop.b(d + file.getName());
                    if (TextUtils.isEmpty(strB)) {
                        ReleaseLogUtil.b("Dfx_LogAppEventUtil", "writeAppEventDate filePath is not exists");
                        a((BufferedWriter) null, (OutputStreamWriter) null, (FileOutputStream) null);
                        return;
                    }
                    fileOutputStream = new FileOutputStream(strB, true);
                    try {
                        outputStreamWriter = new OutputStreamWriter(fileOutputStream, "UTF-8");
                        try {
                            BufferedWriter bufferedWriter2 = new BufferedWriter(outputStreamWriter);
                            try {
                                File file2 = new File(strB);
                                if (!file2.exists() || file2.length() <= 0) {
                                    ReleaseLogUtil.b("Dfx_LogAppEventUtil", "writeAppEventDate newFile is not exists");
                                } else {
                                    bufferedWriter2.write(System.lineSeparator() + str);
                                }
                                a(bufferedWriter2, outputStreamWriter, fileOutputStream);
                            } catch (IOException unused) {
                                bufferedWriter = bufferedWriter2;
                                ReleaseLogUtil.b("Dfx_LogAppEventUtil", "writeAppEventDate ioException");
                                fileOutputStream2 = fileOutputStream;
                                outputStreamWriter2 = outputStreamWriter;
                                a(bufferedWriter, outputStreamWriter2, fileOutputStream2);
                            } catch (OutOfMemoryError unused2) {
                                bufferedWriter = bufferedWriter2;
                                ReleaseLogUtil.b("Dfx_LogAppEventUtil", "writeAppEventDate OutOfMemoryError");
                                fileOutputStream2 = fileOutputStream;
                                outputStreamWriter2 = outputStreamWriter;
                                a(bufferedWriter, outputStreamWriter2, fileOutputStream2);
                            } catch (Throwable th) {
                                th = th;
                                bufferedWriter = bufferedWriter2;
                                r2 = fileOutputStream;
                                r5 = outputStreamWriter;
                                a(bufferedWriter, (OutputStreamWriter) r5, (FileOutputStream) r2);
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
                        r5 = 0;
                        r2 = fileOutputStream;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    r5 = 2;
                    bufferedWriter = null;
                    r2 = objArr;
                }
            } catch (IOException unused7) {
                fileOutputStream = null;
                outputStreamWriter = null;
            } catch (OutOfMemoryError unused8) {
                fileOutputStream = null;
                outputStreamWriter = null;
            } catch (Throwable th4) {
                th = th4;
                r2 = 0;
                r5 = 0;
            }
        }
    }

    public static void b() {
        LinkedList<File> linkedListF = f(cop.b(d));
        if (linkedListF != null) {
            try {
                if (linkedListF.size() > 0) {
                    ReleaseLogUtil.c("Dfx_LogAppEventUtil", "deleteAppEventLog appEventFiles: ", Integer.valueOf(linkedListF.size()));
                    Iterator<File> it = linkedListF.iterator();
                    while (it.hasNext()) {
                        a(it.next());
                    }
                }
            } catch (OutOfMemoryError unused) {
                ReleaseLogUtil.b("Dfx_LogAppEventUtil", "deleteAppEventLog OutOfMemoryError");
            }
        }
    }

    private static void a(File file) {
        String path = file.getPath();
        LogUtil.b("LogAppEventUtil", "filePath: ", path);
        if (TextUtils.isEmpty(path)) {
            ReleaseLogUtil.d("Dfx_LogAppEventUtil", "filePath is null.");
            return;
        }
        File file2 = new File(path);
        try {
            LogUtil.b("LogAppEventUtil", "file: ", file2.getCanonicalPath());
        } catch (IOException unused) {
            LogUtil.b("LogAppEventUtil", "deleteFileDeal IOException");
        }
        if (file2.exists() && !file2.isDirectory() && file2.getName().contains("_WearableBeta_app_bigdata.log")) {
            ReleaseLogUtil.c("Dfx_LogAppEventUtil", "file delete: ", Boolean.valueOf(file2.delete()));
        } else {
            ReleaseLogUtil.d("Dfx_LogAppEventUtil", "file not exists or not app event");
        }
    }

    private static String d(Context context, String str, String str2, String str3, String str4) {
        String strH = h("unknown");
        String strB = b(context, "com.huawei.health");
        if (TextUtils.isEmpty(strB)) {
            strB = "";
        }
        String strA = a(System.currentTimeMillis());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("file_time", strA);
            jSONObject.put("wear_device_type", str);
            jSONObject.put("wear_device_name", str2);
            jSONObject.put("wear_device_version", str4);
            jSONObject.put("wear_device_id", str3);
            jSONObject.put("health_version", strB);
            jSONObject.put("phone_os_version", Build.VERSION.RELEASE);
            jSONObject.put("phone_brand", Build.BRAND);
            jSONObject.put("phone_device", Build.DISPLAY);
            jSONObject.put("phone_model", Build.MODEL);
            jSONObject.put("phone_ui_version", strH);
            jSONObject.put("phone_sn", cpg.b(e()));
            return jSONObject.toString();
        } catch (JSONException unused) {
            ReleaseLogUtil.b("Dfx_LogAppEventUtil", "getAppVersion jsonException");
            return "";
        }
    }

    private static String a(long j) {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH).format(new Date(j));
    }

    private static String e() {
        ReleaseLogUtil.c("Dfx_LogAppEventUtil", "getSnInfo enter");
        String strE = cot.e();
        if (!TextUtils.isEmpty(strE)) {
            strE = strE.toUpperCase(Locale.ENGLISH);
        } else {
            ReleaseLogUtil.b("Dfx_LogAppEventUtil", "androidId is isEmpty");
        }
        LogUtil.b("LogAppEventUtil", "androidId: ", cpl.a(strE));
        return strE;
    }

    private static String h(String str) {
        String strAg = CommonUtil.ag();
        return (TextUtils.isEmpty(strAg) || "default".equals(strAg)) ? str : strAg;
    }

    private static String b(Context context, String str) {
        if (context != null && str != null) {
            try {
                PackageManager packageManager = context.getPackageManager();
                PackageInfo packageInfo = packageManager != null ? packageManager.getPackageInfo(str, 16384) : null;
                if (packageInfo != null) {
                    return packageInfo.versionName;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                LogUtil.d("LogAppEventUtil", "PackageManager.NameNotFoundException");
            }
        }
        return null;
    }

    private static boolean j(String str) {
        ReleaseLogUtil.c("Dfx_LogAppEventUtil", "isCreateAppEventLog enter");
        String strB = cop.b(d);
        if (TextUtils.isEmpty(strB)) {
            ReleaseLogUtil.d("Dfx_LogAppEventUtil", "isCreateAppEventLog pathName is empty");
            return false;
        }
        File file = new File(cop.b(strB));
        if (!file.exists()) {
            LogUtil.b("LogAppEventUtil", "isCreateAppEventLog mkdirs result: ", Boolean.valueOf(file.mkdirs()));
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            LogUtil.e("LogAppEventUtil", "isCreateAppEventLog files size is 0");
            return true;
        }
        TreeMap treeMap = new TreeMap();
        treeMap.clear();
        LogUtil.b("LogAppEventUtil", "isCreateAppEventLog files.length is: ", Integer.valueOf(fileArrListFiles.length));
        for (File file2 : fileArrListFiles) {
            if (file2.getName().contains("_WearableBeta_app_bigdata.log")) {
                LogUtil.b("LogAppEventUtil", "isCreateAppEventLog file.getName(): ", file2.getName());
                treeMap.put(file2.getName(), Long.valueOf(g(file2.getName())));
            }
        }
        ArrayList arrayList = new ArrayList(treeMap.entrySet());
        treeMap.clear();
        Collections.sort(arrayList, new Comparator<Map.Entry<String, Long>>() { // from class: cpj.3
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compare(Map.Entry<String, Long> entry, Map.Entry<String, Long> entry2) {
                return entry.getValue().compareTo(entry2.getValue());
            }
        });
        if (arrayList.size() == 0) {
            LogUtil.e("LogAppEventUtil", "isCreateAppEventLog bigDataFileTempMap size is 0");
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext() && arrayList.size() > 2) {
            String str2 = (String) ((Map.Entry) it.next()).getKey();
            LogUtil.b("LogAppEventUtil", "isCreateAppEventLog isDeleteSuccess: ", Boolean.valueOf(new File(d + str2).delete()), ",fileName:", str2);
            it.remove();
        }
        boolean zE = arrayList.size() <= 2 ? e(arrayList, str) : true;
        arrayList.clear();
        return zE;
    }

    private static boolean a(String str, String str2) {
        ReleaseLogUtil.c("Dfx_LogAppEventUtil", "isCreateOtaEventLog enter");
        List<Map.Entry<String, Long>> listN = n(str);
        boolean zB = true;
        if (listN == null || listN.size() == 0) {
            LogUtil.e("LogAppEventUtil", "isCreateOtaEventLog bigDataFileTempMap size is 0");
            return true;
        }
        Iterator<Map.Entry<String, Long>> it = listN.iterator();
        while (it.hasNext() && listN.size() > 2) {
            String key = it.next().getKey();
            LogUtil.b("LogAppEventUtil", "isCreateOtaEventLog isDeleteSuccess: ", Boolean.valueOf(new File(d + key).delete()), ",fileName:", key);
            it.remove();
        }
        if (listN.size() == 1) {
            if (new File(d + it.next().getKey()).length() + ((long) str2.length()) <= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) {
                zB = false;
            }
        } else {
            zB = b(listN, str2);
        }
        listN.clear();
        return zB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<Map.Entry<String, Long>> n(String str) {
        String strB = cop.b(d);
        if (TextUtils.isEmpty(strB)) {
            ReleaseLogUtil.d("Dfx_LogAppEventUtil", "sortOTAFilesByTimestamp pathName is empty");
            return null;
        }
        File file = new File(cop.b(strB));
        if (!file.exists()) {
            LogUtil.b("LogAppEventUtil", "sortOTAFilesByTimestamp mkdirs result: ", Boolean.valueOf(file.mkdirs()));
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            LogUtil.e("LogAppEventUtil", "sortOTAFilesByTimestamp files size is 0");
            return null;
        }
        TreeMap treeMap = new TreeMap();
        treeMap.clear();
        for (File file2 : fileArrListFiles) {
            if (file2.getName().contains("_WearableBeta_gpu_update.log") && b(file2).contains(str)) {
                LogUtil.b("LogAppEventUtil", "sortOTAFilesByTimestamp file.getName(): ", file2.getName());
                treeMap.put(file2.getName(), Long.valueOf(g(file2.getName())));
            }
        }
        ArrayList arrayList = new ArrayList(treeMap.entrySet());
        LogUtil.b("LogAppEventUtil", "sortOTAFilesByTimestamp files.length is: ", Integer.valueOf(arrayList.size()));
        treeMap.clear();
        Collections.sort(arrayList, new Comparator<Map.Entry<String, Long>>() { // from class: cpj.1
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compare(Map.Entry<String, Long> entry, Map.Entry<String, Long> entry2) {
                return entry.getValue().compareTo(entry2.getValue());
            }
        });
        return arrayList;
    }

    private static void e(String str, String str2) {
        String strB = cop.b(str);
        if (TextUtils.isEmpty(strB)) {
            ReleaseLogUtil.d("Dfx_LogAppEventUtil", "deleteFileDeal pathName is empty");
            return;
        }
        File file = new File(cop.b(strB));
        if (!file.exists()) {
            LogUtil.b("LogAppEventUtil", "deleteFileDeal mkdirs result: ", Boolean.valueOf(file.mkdirs()));
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            LogUtil.e("LogAppEventUtil", "deleteFileDeal files size is 0");
            return;
        }
        TreeMap treeMap = new TreeMap();
        treeMap.clear();
        LogUtil.b("LogAppEventUtil", "deleteFileDeal files.length is: ", Integer.valueOf(fileArrListFiles.length));
        for (File file2 : fileArrListFiles) {
            if (file2.getName().contains(str2)) {
                LogUtil.b("LogAppEventUtil", "deleteFileDeal file.getName(): ", file2.getName());
                treeMap.put(file2.getName(), Long.valueOf(g(file2.getName())));
            }
        }
        ArrayList arrayList = new ArrayList(treeMap.entrySet());
        treeMap.clear();
        Collections.sort(arrayList, new Comparator<Map.Entry<String, Long>>() { // from class: cpj.5
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public int compare(Map.Entry<String, Long> entry, Map.Entry<String, Long> entry2) {
                return entry.getValue().compareTo(entry2.getValue());
            }
        });
        if (arrayList.size() <= 2) {
            LogUtil.e("LogAppEventUtil", "deleteFileDeal bigDataFileTempMap size is then or 2");
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext() && arrayList.size() > 2) {
            String str3 = (String) ((Map.Entry) it.next()).getKey();
            LogUtil.b("LogAppEventUtil", "deleteFileDeal isDeleteSuccess: ", Boolean.valueOf(new File(str + str3).delete()), ",fileName:", str3);
            it.remove();
        }
        LogUtil.b("LogAppEventUtil", "deleteFileDeal listSize: ", Integer.valueOf(arrayList.size()));
        arrayList.clear();
    }

    private static void e(String str, String str2, String str3) {
        a(str, str2, str3, 2, 4);
    }

    private static void a(String str, String str2, String str3, int i, int i2) {
        String strB = cop.b(str2);
        if (TextUtils.isEmpty(strB)) {
            ReleaseLogUtil.d("Dfx_LogAppEventUtil", "deleteFileFilterDevices pathName is empty");
            return;
        }
        File file = new File(cop.b(strB));
        if (!file.exists()) {
            LogUtil.b("LogAppEventUtil", "deleteFileFilterDevices mkdirs result: ", Boolean.valueOf(file.mkdirs()));
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            LogUtil.e("LogAppEventUtil", "deleteFileFilterDevices files size is 0");
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (File file2 : fileArrListFiles) {
            if (file2.getName().contains(str3)) {
                LogUtil.b("LogAppEventUtil", "deleteFileFilterDevices file.getName(): ", file2.getName());
                if (b(file2).contains(str)) {
                    arrayList.add(file2.getName());
                } else {
                    arrayList2.add(file2.getName());
                }
            }
        }
        c(arrayList);
        c(arrayList2);
        if (arrayList.size() > i) {
            a(arrayList, str2, i);
        }
        e(str2, i2 - arrayList.size(), arrayList2);
    }

    private static void a(List<String> list, String str, int i) {
        LogUtil.b("LogAppEventUtil", "filterOtherDevicesFiles size: ", Integer.valueOf(list.size()));
        if (list.size() - i > 0) {
            b(list, str, i);
        }
    }

    private static void c(List<String> list) {
        list.sort(Comparator.comparingLong(new ToLongFunction() { // from class: cpn
            @Override // java.util.function.ToLongFunction
            public final long applyAsLong(Object obj) {
                return cpj.g((String) obj);
            }
        }));
    }

    private static void e(String str, int i, List<String> list) {
        if (list.size() <= i) {
            LogUtil.e("LogAppEventUtil", "filterOtherDevicesFiles size is less then or ", Integer.valueOf(i));
            return;
        }
        LogUtil.b("LogAppEventUtil", "filterOtherDevicesFiles size: ", Integer.valueOf(list.size()));
        if (list.size() - i > 0) {
            b(list, str, i);
        }
    }

    private static void b(List<String> list, String str, int i) {
        for (int i2 = 0; i2 < list.size() - i; i2++) {
            String str2 = str + list.get(i2);
            LogUtil.b("LogAppEventUtil", "deleteElementLimited isDeleteSuccess: ", Boolean.valueOf(new File(str2).delete()), ", fileName: ", str2);
        }
        list.subList(0, list.size() - i).clear();
        LogUtil.b("LogAppEventUtil", "deleteElementLimited final size: ", Integer.valueOf(list.size()));
    }

    private static boolean e(List<Map.Entry<String, Long>> list, String str) {
        LogUtil.b("LogAppEventUtil", "isCreateAppEventLog list size: ", Integer.valueOf(list.size()));
        Iterator<Map.Entry<String, Long>> it = list.iterator();
        boolean z = true;
        while (it.hasNext()) {
            String key = it.next().getKey();
            File file = new File(d + key);
            if (key.contains("_WearableBeta_app_bigdata.log") && b(file).contains(str)) {
                LogUtil.b("LogAppEventUtil", "isCreateAppEventLog contains current deviceName");
                z = false;
            } else {
                LogUtil.b("LogAppEventUtil", "has not this device appbigdata");
            }
        }
        return z;
    }

    private static boolean b(List<Map.Entry<String, Long>> list, String str) {
        LogUtil.b("LogAppEventUtil", "isCreateOTAEventLogPart list size: ", Integer.valueOf(list.size()));
        File fileE = e(list);
        return fileE == null || fileE.length() + ((long) str.length()) > PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static File e(List<Map.Entry<String, Long>> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        File file = new File(d + list.get(list.size() - 1).getKey());
        LogUtil.b("LogAppEventUtil", "getLatestOTAFile list size: ", Integer.valueOf(list.size()), ", fileName = " + file.getName());
        return file;
    }

    private static void a(DeviceInfo deviceInfo) throws Throwable {
        String strB = cop.b(d);
        if (TextUtils.isEmpty(strB)) {
            ReleaseLogUtil.d("Dfx_LogAppEventUtil", "dealEventLogFile pathName is empty");
            return;
        }
        File file = new File(cop.b(strB));
        if (!file.exists()) {
            LogUtil.b("LogAppEventUtil", "dealEventLogFile mkdirs result: ", Boolean.valueOf(file.mkdirs()));
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            ReleaseLogUtil.d("Dfx_LogAppEventUtil", "dealEventLogFile files is empty");
            return;
        }
        for (File file2 : fileArrListFiles) {
            if (file2.getName().contains("_WearableBeta_app_bigdata.log")) {
                if (deviceInfo != null && deviceInfo.getDeviceName() != null && b(file2).contains(deviceInfo.getDeviceName()) && file2.length() <= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) {
                    ReleaseLogUtil.c("Dfx_LogAppEventUtil", "dealEventLogFile has this device id appEvent log");
                    b(d + file2.getName(), deviceInfo);
                }
                if (file2.length() > PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) {
                    ReleaseLogUtil.c("Dfx_LogAppEventUtil", "dealEventLogFile isDeleteSuccess: ", Boolean.valueOf(file2.delete()));
                } else {
                    ReleaseLogUtil.c("Dfx_LogAppEventUtil", "dealEventLogFile file size less 2M");
                }
            }
        }
    }

    private static void b(DeviceInfo deviceInfo, String str, String str2) throws Throwable {
        ArrayList<File> arrayListA = a(deviceInfo, str, str2);
        if (arrayListA == null || arrayListA.size() == 0) {
            ReleaseLogUtil.d("Dfx_LogAppEventUtil", "dealEventLogFile files is empty");
            return;
        }
        for (File file : arrayListA) {
            ReleaseLogUtil.c("Dfx_LogAppEventUtil", "dealEventLogFile has this device id appEvent log");
            b(str + file.getName(), deviceInfo);
        }
        e(deviceInfo.getDeviceName(), str, str2);
    }

    private static ArrayList<File> a(DeviceInfo deviceInfo, String str, String str2) {
        String strB = cop.b(str);
        if (TextUtils.isEmpty(strB)) {
            ReleaseLogUtil.d("Dfx_LogAppEventUtil", "dealEventLogFile pathName is empty");
            return null;
        }
        File file = new File(cop.b(strB));
        if (!file.exists()) {
            LogUtil.b("LogAppEventUtil", "dealEventLogFile mkdirs result: ", Boolean.valueOf(file.mkdirs()));
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            ReleaseLogUtil.d("Dfx_LogAppEventUtil", "dealEventLogFile files is empty");
            return null;
        }
        ArrayList<File> arrayList = new ArrayList<>();
        for (File file2 : fileArrListFiles) {
            if (deviceInfo != null && deviceInfo.getDeviceName() != null && b(file2).contains(deviceInfo.getDeviceName()) && file2.getName().contains(str2)) {
                arrayList.add(file2);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.d("LogAppEventUtil", "getShaDeviceId currentDeviceInfo is null");
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
            return cqm.c(deviceIdentify);
        }
        return k(securityDeviceId);
    }

    private static String k(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.b("LogAppEventUtil", "setDeviceMac deviceMac is null");
            return null;
        }
        if (Utils.o()) {
            String strE = e(str);
            return strE.length() >= 24 ? strE.replace(Marker.ANY_NON_NULL_MARKER, SampleEvent.SEPARATOR).replace("/", SampleEvent.SEPARATOR).replace("=", SampleEvent.SEPARATOR).substring(0, 24) : strE;
        }
        if (str.contains(":") || str.length() <= 12) {
            return str.replace(":", "");
        }
        String strE2 = e(str);
        return strE2.length() >= 24 ? strE2.replace(Marker.ANY_NON_NULL_MARKER, SampleEvent.SEPARATOR).replace("/", SampleEvent.SEPARATOR).replace("=", SampleEvent.SEPARATOR).substring(0, 24) : strE2;
    }

    private static String e(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("LogAppEventUtil", "encryptMacSha256 param is empty");
            return "";
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes(StandardCharsets.UTF_8));
            return Base64.encodeToString(messageDigest.digest(), 2);
        } catch (NoSuchAlgorithmException e) {
            LogUtil.d("LogAppEventUtil", "encryptMacSha256 e=", e.getMessage());
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long g(String str) {
        LogUtil.b("LogAppEventUtil", "getAppBigDataTime fileName: ", str);
        String[] strArrSplit = str.split("_");
        if (strArrSplit == null || strArrSplit.length <= 3) {
            return 0L;
        }
        return m(strArrSplit[3]);
    }

    private static long m(String str) {
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            LogUtil.d("LogAppEventUtil", "parse fail:", str);
            return 0L;
        }
    }

    private static String b(int i, String str, String str2) {
        if (a(i)) {
            return d(i);
        }
        if (i == 10) {
            return "Leo";
        }
        if (i == 23 || i == 24) {
            return "AW70";
        }
        if (i == 36 || i == 37) {
            return "AW70-B39";
        }
        if (i == 44) {
            return "Andes_B19";
        }
        if (i != 45) {
            switch (i) {
                case 18:
                    return "Crius";
                case 19:
                    return "Terra";
                case 20:
                    return "Talos";
                case 21:
                    return "Fortuna";
                default:
                    return e(i, str, str2);
            }
        }
        return "Andes_B29";
    }

    private static String e(int i, String str, String str2) {
        return c(str2, str);
    }

    private static String c(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        if (TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
            return "HUAWEI WEAR";
        }
        for (int i = 0; i < str.length(); i++) {
            if (!"ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890-=[];\\',./ ~!@#$%^&*()_+\"{}|:<>?".contains(str.charAt(i) + "") || str.contains("_")) {
                return "HUAWEI WEAR";
            }
        }
        return str;
    }

    private static String d(int i) {
        if (i == 1) {
            return "B2";
        }
        if (i == 2) {
            return "K1";
        }
        if (i == 3) {
            return "W1";
        }
        if (i == 5) {
            return "B0";
        }
        if (i == 7) {
            return "Gemini";
        }
        if (i == 8) {
            return "Metis";
        }
        switch (i) {
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

    private static String d(int i, String str, String str2) {
        return (i < 19 || i == 20 || TextUtils.isEmpty(str2)) ? str : str2;
    }

    public static boolean c(Context context, String str) {
        ActivityManager activityManager;
        if (context == null || str == null || !(context.getSystemService("activity") instanceof ActivityManager) || (activityManager = (ActivityManager) context.getSystemService("activity")) == null) {
            return false;
        }
        List<ActivityManager.RunningTaskInfo> runningTasks = activityManager.getRunningTasks(1);
        ComponentName componentName = !coq.d(runningTasks) ? runningTasks.get(0).topActivity : null;
        if (componentName == null) {
            return false;
        }
        return componentName.getClassName().contains(str);
    }

    private static void d(BufferedWriter bufferedWriter, BufferedReader bufferedReader, FileReader fileReader) {
        if (bufferedWriter != null) {
            try {
                bufferedWriter.flush();
                bufferedWriter.close();
            } catch (IOException unused) {
                LogUtil.d("LogAppEventUtil", "closeStream ioException");
                return;
            }
        }
        if (bufferedReader != null) {
            bufferedReader.close();
        }
        if (fileReader != null) {
            fileReader.close();
        }
    }

    private static void a(BufferedWriter bufferedWriter, OutputStreamWriter outputStreamWriter, FileOutputStream fileOutputStream) {
        if (bufferedWriter != null) {
            try {
                bufferedWriter.flush();
                bufferedWriter.close();
            } catch (IOException unused) {
                LogUtil.d("LogAppEventUtil", "writeFileSdcard ioException");
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
}

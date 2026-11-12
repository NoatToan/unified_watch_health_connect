package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.android.hicloud.sync.util.FileUtil;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.devicemgr.business.entity.HwGetDevicesParameter;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwlogsmodel.common.LogConfig;
import health.compact.a.CommonUtil;
import health.compact.a.Utils;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class moc {
    private static ThreadPoolManager e = ThreadPoolManager.b(3, 3, FileUtil.TAG);
    private static final String d = LogConfig.h();

    public static boolean e(String str) {
        LogUtil.d(FileUtil.TAG, "isFileExists filePath: ", str);
        if (str == null) {
            LogUtil.j(FileUtil.TAG, "isFileExists filePath is null");
            return false;
        }
        if (new File(str).exists()) {
            LogUtil.d(FileUtil.TAG, "isFileExists return true");
            return true;
        }
        LogUtil.d(FileUtil.TAG, "isFileExists return false");
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00db A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.io.FileInputStream] */
    public static long d(File file, mod modVar) {
        ?? fileInputStream;
        long jD = 0;
        if (file == null || modVar == null || modVar.k() <= 0) {
            LogUtil.j(FileUtil.TAG, "getFileSize parameter error");
            return 0L;
        }
        modVar.c().clear();
        ?? r4 = 0;
        ?? r5 = 0;
        ?? r6 = 0;
        try {
            try {
                if (!file.exists()) {
                    return 0L;
                }
                fileInputStream = new FileInputStream(file);
                try {
                    modVar.b(fileInputStream.available());
                    jD = modVar.d();
                    byte[] bArr = new byte[modVar.k()];
                    while (true) {
                        int i = fileInputStream.read(bArr);
                        if (i == -1) {
                            break;
                        }
                        if (i != modVar.k()) {
                            byte[] bArr2 = new byte[i];
                            System.arraycopy(bArr, 0, bArr2, 0, i);
                            cpl.b(FileUtil.TAG, bArr2, " num: ", Integer.valueOf(i), "getFileSize data: ");
                            modVar.c().add((byte[]) bArr2.clone());
                        } else {
                            cpl.b(FileUtil.TAG, bArr, " num: ", Integer.valueOf(i), " getFileSize info: ");
                            modVar.c().add((byte[]) bArr.clone());
                        }
                    }
                    String str = "getFileSize fileInfoList.size() : ";
                    LogUtil.a(FileUtil.TAG, "getFileSize fileInfoList.size() : ", Integer.valueOf(modVar.c().size()));
                    try {
                        fileInputStream.close();
                        r4 = str;
                    } catch (IOException unused) {
                        LogUtil.e(FileUtil.TAG, "loadCertificates Exception.");
                        r4 = str;
                    }
                } catch (FileNotFoundException unused2) {
                    r5 = fileInputStream;
                    LogUtil.e(FileUtil.TAG, "getFileSize FileNotFoundException.");
                    r4 = r5;
                    if (r5 != 0) {
                        try {
                            r5.close();
                            r4 = r5;
                        } catch (IOException unused3) {
                            LogUtil.e(FileUtil.TAG, "loadCertificates Exception.");
                            r4 = r5;
                        }
                    }
                } catch (IOException unused4) {
                    r6 = fileInputStream;
                    LogUtil.e(FileUtil.TAG, "getFileSize IOException.");
                    r4 = r6;
                    if (r6 != 0) {
                        try {
                            r6.close();
                            r4 = r6;
                        } catch (IOException unused5) {
                            LogUtil.e(FileUtil.TAG, "loadCertificates Exception.");
                            r4 = r6;
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    if (fileInputStream != 0) {
                        try {
                            fileInputStream.close();
                        } catch (IOException unused6) {
                            LogUtil.e(FileUtil.TAG, "loadCertificates Exception.");
                        }
                    }
                    throw th;
                }
                return jD;
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = r4;
            }
        } catch (FileNotFoundException unused7) {
        } catch (IOException unused8) {
        }
        LogUtil.e(FileUtil.TAG, "getFileSize FileNotFoundException.");
        r4 = r5;
        if (r5 != 0) {
            r5.close();
            r4 = r5;
        }
        return jD;
    }

    public static void e(Context context, final String str) {
        LogUtil.a(FileUtil.TAG, "setCreateLogFile context == null is ", Boolean.valueOf(context == null));
        if (context == null || CommonUtil.af(context)) {
            return;
        }
        e.execute(new Runnable() { // from class: moc.5
            @Override // java.lang.Runnable
            public void run() throws Throwable {
                if (moc.h(str) && moc.j(str)) {
                    return;
                }
                LogUtil.a(FileUtil.TAG, "setCreateLogFile trigger the upgrade and check whether the upg.log file exists");
                moc.c(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean h(String str) {
        File file = new File(CommonUtil.c(d));
        if (!file.exists()) {
            LogUtil.a(FileUtil.TAG, "isHasUpgLog isResult: ", Boolean.valueOf(file.mkdirs()));
        }
        File[] fileArrListFiles = file.listFiles();
        String strA = mjh.a(i(str));
        if (fileArrListFiles != null && fileArrListFiles.length > 0) {
            for (File file2 : fileArrListFiles) {
                if (file2.getName().contains("_mcu_upg") && file2.getName().contains(strA)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean j(String str) {
        DeviceInfo deviceInfoI = i(str);
        if (deviceInfoI == null) {
            LogUtil.j(FileUtil.TAG, "currentDeviceInfo is null");
            return false;
        }
        String strA = mjh.a(deviceInfoI);
        if (TextUtils.isEmpty(strA)) {
            LogUtil.j(FileUtil.TAG, "shaDeviceId is null or empty");
            return false;
        }
        LinkedList<File> linkedListB = mjm.b(CommonUtil.c(d));
        if (linkedListB == null) {
            LogUtil.j(FileUtil.TAG, "equalUpgLog otaFiles is null.");
            return false;
        }
        Iterator<File> it = linkedListB.iterator();
        while (it.hasNext()) {
            if (it.next().getName().contains(strA)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(String str) throws Throwable {
        d(i(str));
    }

    private static void d(DeviceInfo deviceInfo) throws Throwable {
        if (deviceInfo == null) {
            LogUtil.j(FileUtil.TAG, "onCreateFile currentDeviceInfo is null");
            return;
        }
        String udidFromDevice = deviceInfo.getUdidFromDevice();
        if (TextUtils.isEmpty(udidFromDevice)) {
            if (deviceInfo.getDeviceIdentify() == null) {
                return;
            } else {
                udidFromDevice = e(deviceInfo);
            }
        }
        mjl.c(BaseApplication.getContext(), udidFromDevice);
        String strE = nvd.e();
        int productType = deviceInfo.getProductType();
        String strC = mjj.c().c(productType, mjj.c().a(productType, deviceInfo.getDeviceModel()), deviceInfo.getDeviceModel());
        StringBuffer stringBuffer = new StringBuffer(16);
        stringBuffer.append(d);
        stringBuffer.append(strC);
        stringBuffer.append("_");
        String softVersion = deviceInfo.getSoftVersion();
        stringBuffer.append(softVersion);
        stringBuffer.append("_");
        stringBuffer.append(udidFromDevice);
        stringBuffer.append("_");
        stringBuffer.append(strE);
        stringBuffer.append("_Beta_mcu_upg.log");
        d(stringBuffer, strC, udidFromDevice, softVersion);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0089 A[Catch: IOException -> 0x0092, TryCatch #9 {IOException -> 0x0092, blocks: (B:28:0x0081, B:30:0x0089, B:32:0x008e), top: B:68:0x0081 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x008e A[Catch: IOException -> 0x0092, TRY_LEAVE, TryCatch #9 {IOException -> 0x0092, blocks: (B:28:0x0081, B:30:0x0089, B:32:0x008e), top: B:68:0x0081 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00af A[Catch: IOException -> 0x00b8, TryCatch #5 {IOException -> 0x00b8, blocks: (B:38:0x00a7, B:40:0x00af, B:42:0x00b4), top: B:64:0x00a7 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00b4 A[Catch: IOException -> 0x00b8, TRY_LEAVE, TryCatch #5 {IOException -> 0x00b8, blocks: (B:38:0x00a7, B:40:0x00af, B:42:0x00b4), top: B:64:0x00a7 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00cf A[Catch: IOException -> 0x00d8, TryCatch #6 {IOException -> 0x00d8, blocks: (B:49:0x00c7, B:51:0x00cf, B:53:0x00d4), top: B:66:0x00c7 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00d4 A[Catch: IOException -> 0x00d8, TRY_LEAVE, TryCatch #6 {IOException -> 0x00d8, blocks: (B:49:0x00c7, B:51:0x00cf, B:53:0x00d4), top: B:66:0x00c7 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.io.BufferedWriter] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.io.BufferedWriter] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.io.BufferedWriter] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v1 */
    private static void d(StringBuffer stringBuffer, String str, String str2, String str3) throws Throwable {
        FileOutputStream fileOutputStream;
        OutputStreamWriter outputStreamWriter;
        String strC = CommonUtil.c(stringBuffer.toString());
        ?? r4 = 0;
        r4 = 0;
        r4 = 0;
        r4 = 0;
        r4 = 0;
         = 0;
        r4 = 0;
        r4 = 0;
        ?? r5 = 0;
        try {
            try {
                fileOutputStream = new FileOutputStream(strC, true);
                try {
                    outputStreamWriter = new OutputStreamWriter(fileOutputStream, "utf-8");
                    try {
                        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
                        try {
                            File file = new File(strC);
                            boolean zExists = file.exists();
                            r4 = file;
                            if (!zExists && file.createNewFile()) {
                                r4 = file;
                                LogUtil.e(FileUtil.TAG, "create uploadlog success");
                                r4 = "create uploadlog success";
                            }
                            r4 = file;
                            bufferedWriter.write("");
                            bufferedWriter.write(mjh.c(BaseApplication.getContext(), str, str2, str3));
                            try {
                                bufferedWriter.flush();
                                bufferedWriter.close();
                                outputStreamWriter.close();
                                fileOutputStream.close();
                            } catch (IOException unused) {
                                LogUtil.e(FileUtil.TAG, "writeFileSdcard ioException");
                            }
                        } catch (IOException unused2) {
                            r4 = bufferedWriter;
                            LogUtil.e(FileUtil.TAG, "IOException ioException");
                            if (r4 != 0) {
                                try {
                                    r4.flush();
                                    r4.close();
                                    if (outputStreamWriter != null) {
                                        outputStreamWriter.close();
                                    }
                                    if (fileOutputStream != null) {
                                        fileOutputStream.close();
                                    }
                                } catch (IOException unused3) {
                                    LogUtil.e(FileUtil.TAG, "writeFileSdcard ioException");
                                }
                            } else {
                                if (outputStreamWriter != null) {
                                    outputStreamWriter.close();
                                }
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                            }
                        } catch (OutOfMemoryError unused4) {
                            r4 = bufferedWriter;
                            LogUtil.e(FileUtil.TAG, "createOtaLog uploadLog OutOfMemoryError");
                            if (r4 != 0) {
                                try {
                                    r4.flush();
                                    r4.close();
                                    if (outputStreamWriter != null) {
                                        outputStreamWriter.close();
                                    }
                                    if (fileOutputStream != null) {
                                        fileOutputStream.close();
                                    }
                                } catch (IOException unused5) {
                                    LogUtil.e(FileUtil.TAG, "writeFileSdcard ioException");
                                }
                            } else {
                                if (outputStreamWriter != null) {
                                    outputStreamWriter.close();
                                }
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            r5 = bufferedWriter;
                            if (r5 != 0) {
                                try {
                                    r5.flush();
                                    r5.close();
                                    if (outputStreamWriter != null) {
                                        outputStreamWriter.close();
                                    }
                                    if (fileOutputStream != null) {
                                        fileOutputStream.close();
                                    }
                                } catch (IOException unused6) {
                                    LogUtil.e(FileUtil.TAG, "writeFileSdcard ioException");
                                    throw th;
                                }
                            } else {
                                if (outputStreamWriter != null) {
                                    outputStreamWriter.close();
                                }
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                            }
                            throw th;
                        }
                    } catch (IOException unused7) {
                    } catch (OutOfMemoryError unused8) {
                    }
                } catch (IOException unused9) {
                    outputStreamWriter = null;
                } catch (OutOfMemoryError unused10) {
                    outputStreamWriter = null;
                } catch (Throwable th2) {
                    th = th2;
                    outputStreamWriter = null;
                }
            } catch (Throwable th3) {
                th = th3;
                outputStreamWriter = outputStreamWriter;
                r5 = r4;
            }
        } catch (IOException unused11) {
            fileOutputStream = null;
            outputStreamWriter = null;
        } catch (OutOfMemoryError unused12) {
            fileOutputStream = null;
            outputStreamWriter = null;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
            outputStreamWriter = null;
        }
    }

    private static DeviceInfo i(String str) {
        HwGetDevicesParameter hwGetDevicesParameter = new HwGetDevicesParameter();
        hwGetDevicesParameter.setDeviceIdentify(str);
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.IDENTIFY_DEVICES, hwGetDevicesParameter, FileUtil.TAG);
        DeviceInfo deviceInfo = deviceList.size() > 0 ? deviceList.get(0) : null;
        if (deviceInfo == null) {
            List<DeviceInfo> deviceList2 = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, FileUtil.TAG);
            if (deviceList2.size() > 0) {
                deviceInfo = deviceList2.get(0);
            }
        }
        if (deviceInfo != null) {
            return deviceInfo;
        }
        List<DeviceInfo> deviceList3 = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_AW70_DEVICES, null, FileUtil.TAG);
        return deviceList3.size() > 0 ? deviceList3.get(0) : deviceInfo;
    }

    private static String e(DeviceInfo deviceInfo) {
        String deviceIdentify = deviceInfo.getDeviceIdentify();
        String securityDeviceId = deviceInfo.getSecurityDeviceId();
        String str = securityDeviceId + deviceIdentify;
        if (!deviceIdentify.equals(securityDeviceId)) {
            deviceIdentify = str;
        }
        if (deviceInfo.getProductType() >= 34 && !Utils.o()) {
            return nio.c(deviceIdentify);
        }
        return mjh.l(securityDeviceId);
    }
}

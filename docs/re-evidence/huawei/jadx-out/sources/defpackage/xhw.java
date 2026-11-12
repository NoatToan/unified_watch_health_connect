package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.devicesdk.entity.DeviceInfo;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.unitedevice.entity.UniteDevice;
import com.huawei.unitedevice.hwcommonfilemgr.entity.CommonFileInfoParcel;
import com.huawei.unitedevice.hwcommonfilemgr.entity.FileInfo;
import health.compact.a.LogUtil;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.io.FileUtils;

/* JADX INFO: loaded from: classes20.dex */
public class xhw {
    private static final byte[] d = {123, 2, 0, 5};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f53020c = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f53019a = 6;

    public static boolean a(Context context, xhr xhrVar, BufferedOutputStream bufferedOutputStream) {
        if (context == null || xhrVar == null || bufferedOutputStream == null) {
            LogUtil.e("Unite_FileUtils", "(context == null) || (commonFileInfo == null) || (outputStream == null)");
            return false;
        }
        try {
            bufferedOutputStream.write(xhrVar.a().array());
            bufferedOutputStream.flush();
            LogUtil.b("Unite_FileUtils", "createPackFileByte end");
            return true;
        } catch (IOException e) {
            LogUtil.d("Unite_FileUtils", "createPackFileByte IOException e ", ExceptionUtils.c(e));
            return false;
        }
    }

    public static void e(Context context, xhr xhrVar) {
        if (context == null || xhrVar == null) {
            LogUtil.e("Unite_FileUtils", "setCommonFileInfoFlag (context == null) || (fileInfo == null)");
            return;
        }
        File file = new File(b(context, xhrVar.n(), xhrVar.m(), b(xhrVar)));
        d(file, file.getParentFile());
        xhy.d(file, xhrVar.m());
    }

    private static void d(File file, File file2) {
        try {
            if (file2.exists() && !file2.isDirectory()) {
                LogUtil.b("Unite_FileUtils", "isWrongDirDeleteSuccess", Boolean.valueOf(file2.delete()), "5.44.1 get file name is empty, please check.");
            }
            if (!file2.exists()) {
                LogUtil.b("Unite_FileUtils", "checkFile file mkdir:", Boolean.valueOf(file2.mkdirs()));
            }
            if (file.exists()) {
                return;
            }
            LogUtil.b("Unite_FileUtils", "checkFile file create is:", Boolean.valueOf(file.createNewFile()));
        } catch (IOException e) {
            LogUtil.d("Unite_FileUtils", "checkFile IOException e ", ExceptionUtils.c(e));
        }
    }

    public static String d(xhr xhrVar, long j, int i, FileInputStream fileInputStream) {
        FileChannel channel = null;
        if (xhrVar == null || fileInputStream == null) {
            LogUtil.e("Unite_FileUtils", "sha256FileFromOffset (info == null) || (fileInputStream == null)");
            return null;
        }
        try {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i);
                channel = fileInputStream.getChannel();
                channel.position(j);
                int i2 = 0;
                while (true) {
                    int i3 = channel.read(byteBufferAllocate);
                    if (i3 != -1) {
                        messageDigest.update(byteBufferAllocate.array(), 0, i3);
                        byteBufferAllocate.clear();
                        i2++;
                    } else {
                        byte[] bArrDigest = messageDigest.digest();
                        LogUtil.b("Unite_FileUtils", "sha256FileFromOffset offset : ", Long.valueOf(j), "sha256FileFromOffset count : ", Integer.valueOf(i2));
                        return cph.d(bArrDigest);
                    }
                }
            } finally {
                cpm.d(null);
                cpm.d(fileInputStream);
            }
        } catch (IOException | NoSuchAlgorithmException e) {
            LogUtil.d("Unite_FileUtils", "sha256FileFromOffset exception : ", ExceptionUtils.c(e));
            cpm.d(channel);
            cpm.d(fileInputStream);
            return "";
        }
    }

    public static FileInputStream b(Context context, xhr xhrVar) {
        if (context == null || xhrVar == null) {
            LogUtil.e("Unite_FileUtils", "getInputStream (context == null) || (commonFileInfo == null)");
            return null;
        }
        try {
            return new FileInputStream(b(context, xhrVar.n(), xhrVar.m(), b(xhrVar)));
        } catch (IOException e) {
            LogUtil.d("Unite_FileUtils", "getInputStream IOException e : ", ExceptionUtils.c(e));
            return null;
        }
    }

    public static boolean c(Context context, xhr xhrVar) {
        if (context == null || xhrVar == null) {
            LogUtil.e("Unite_FileUtils", "deleteCommonFile (context == null) || (commonFileInfo == null)");
            return false;
        }
        String strB = b(context, xhrVar.n(), xhrVar.m(), b(xhrVar));
        if (strB == null) {
            LogUtil.e("Unite_FileUtils", "deleteCommonFile path is null");
            return false;
        }
        File file = new File(strB);
        if (file.exists()) {
            return file.delete();
        }
        return false;
    }

    public static String b(Context context, String str, int i, String str2) {
        if (context == null) {
            return "";
        }
        try {
            if (xhy.e(str, i)) {
                return context.getFilesDir().getPath() + File.separator + "common_file_request" + File.separator + c(str2) + File.separator + str;
            }
            return cop.b(context.getFilesDir().getCanonicalPath() + File.separator + "common_file_request" + File.separator + c(str2) + File.separator + str);
        } catch (IOException e) {
            LogUtil.d("Unite_FileUtils", "getFilePath IOException e", ExceptionUtils.c(e));
            return "";
        }
    }

    public static BufferedOutputStream d(Context context, xhr xhrVar) {
        File file;
        FileOutputStream fileOutputStream;
        if (context == null || xhrVar == null) {
            LogUtil.e("Unite_FileUtils", "getBufferedOutputStream (context == null) || (commonFileInfo == null)");
            return null;
        }
        String strB = b(context, xhrVar.n(), xhrVar.m(), b(xhrVar));
        if (strB == null) {
            LogUtil.e("Unite_FileUtils", "getBufferedOutputStream path is null");
            return null;
        }
        try {
            try {
                file = new File(strB);
                try {
                    d(file, file.getParentFile());
                    fileOutputStream = FileUtils.openOutputStream(file);
                } catch (IllegalArgumentException e) {
                    e = e;
                    try {
                        fileOutputStream = new FileOutputStream(file);
                    } catch (FileNotFoundException unused) {
                        LogUtil.d("Unite_FileUtils", "getBufferedOutputStream IllegalArgumentException e", ExceptionUtils.c(e));
                        fileOutputStream = null;
                    }
                }
            } catch (IOException e2) {
                LogUtil.d("Unite_FileUtils", "getBufferedOutputStream IOException e", ExceptionUtils.c(e2));
                fileOutputStream = null;
            }
        } catch (IllegalArgumentException e3) {
            e = e3;
            file = null;
        }
        if (fileOutputStream == null) {
            return null;
        }
        return new BufferedOutputStream(fileOutputStream);
    }

    public static String e(File file) {
        FileInputStream fileInputStream;
        if (file == null || !file.exists()) {
            LogUtil.d("Unite_FileUtils", "getFileShaHex file not exit");
            return null;
        }
        try {
            fileInputStream = new FileInputStream(file);
        } catch (FileNotFoundException unused) {
            LogUtil.d("Unite_FileUtils", "getFileShaHex FileNotFoundException");
            fileInputStream = null;
        }
        if (fileInputStream == null) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] bArr = new byte[1024];
            int i = fileInputStream.read(bArr);
            if (i == -1) {
                messageDigest.update(bArr, 0, 0);
            } else {
                while (i != -1) {
                    messageDigest.update(bArr, 0, i);
                    i = fileInputStream.read(bArr);
                }
            }
            return cph.d(messageDigest.digest());
        } catch (IOException unused2) {
            LogUtil.d("Unite_FileUtils", "getFileShaHex IOException");
            try {
                return "";
            } catch (IOException unused3) {
                return "";
            }
        } catch (NoSuchAlgorithmException unused4) {
            LogUtil.d("Unite_FileUtils", "getFileShaHex NoSuchAlgorithmException");
            try {
                return "";
            } catch (IOException unused5) {
                return "";
            }
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException unused6) {
                LogUtil.d("Unite_FileUtils", "getFileShaHex IOException");
            }
        }
    }

    public static void b(String str, String str2, int i) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.e("Unite_FileUtils", "setFileSecurityLevel filePath or riskLevel is empty.");
            return;
        }
        try {
            try {
                try {
                    try {
                        Class<?> cls = Class.forName("com.huawei.fileprotect.HwSfpPolicyManager");
                        Object objInvoke = cls.getMethod("setLabel", Context.class, String.class, String.class, String.class, Integer.TYPE).invoke(cls.getMethod("getDefault", new Class[0]).invoke(cls, new Object[0]), BaseApplication.b(), str, "SecurityLevel", str2, Integer.valueOf(i));
                        int iIntValue = objInvoke instanceof Integer ? ((Integer) objInvoke).intValue() : -1;
                        if (iIntValue == 0) {
                            LogUtil.b("Unite_FileUtils", "setFileSecurityLevel success!");
                        } else {
                            LogUtil.b("Unite_FileUtils", "setFileSecurityLevel failed! result = ", Integer.valueOf(iIntValue));
                        }
                    } catch (NoSuchMethodException unused) {
                        LogUtil.d("Unite_FileUtils", "setFileSecurityLevel NoSuchMethodException");
                        LogUtil.b("Unite_FileUtils", "setFileSecurityLevel failed! result = ", -1);
                    }
                } catch (SecurityException unused2) {
                    LogUtil.d("Unite_FileUtils", "setFileSecurityLevel SecurityException");
                    LogUtil.b("Unite_FileUtils", "setFileSecurityLevel failed! result = ", -1);
                }
            } catch (ClassNotFoundException unused3) {
                LogUtil.d("Unite_FileUtils", "setFileSecurityLevel ClassNotFoundException");
                LogUtil.b("Unite_FileUtils", "setFileSecurityLevel failed! result = ", -1);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused4) {
                LogUtil.d("Unite_FileUtils", "setFileSecurityLevel other Exception");
                LogUtil.b("Unite_FileUtils", "setFileSecurityLevel failed! result = ", -1);
            }
        } catch (Throwable th) {
            LogUtil.b("Unite_FileUtils", "setFileSecurityLevel failed! result = ", -1);
            throw th;
        }
    }

    public static CommonFileInfoParcel d(FileInfo fileInfo) {
        CommonFileInfoParcel commonFileInfoParcel = new CommonFileInfoParcel();
        if (fileInfo != null) {
            commonFileInfoParcel.setFileName(fileInfo.getFileName());
            commonFileInfoParcel.setFileType(fileInfo.getFileType());
            commonFileInfoParcel.setFilePath(fileInfo.getFilePath());
            commonFileInfoParcel.setSourcePackageName(fileInfo.getPackageName());
            commonFileInfoParcel.setInTheQueue(false);
            commonFileInfoParcel.setIdentify(fileInfo.getIdentify());
        }
        return commonFileInfoParcel;
    }

    public static boolean b(byte[] bArr) {
        if (bArr == null || bArr.length < f53019a) {
            return false;
        }
        for (int i = 0; i < f53020c; i++) {
            if (d[i] != bArr[i + 2]) {
                return false;
            }
        }
        return true;
    }

    public static int d(String str) {
        int i;
        if (str == null || !str.contains("_")) {
            LogUtil.d("Unite_FileUtils", "mapKey error");
            return -1;
        }
        LogUtil.b("Unite_FileUtils", "getDevicefiled entry");
        if (TextUtils.isEmpty(str)) {
            i = 0;
        } else {
            try {
                i = Integer.parseInt(str.split("_")[1]);
            } catch (NumberFormatException unused) {
                LogUtil.d("Unite_FileUtils", "getDevicefiled numberFormatException");
                i = 0;
            }
        }
        LogUtil.b("Unite_FileUtils", "getDevicefiled entry， deviceFileid:", Integer.valueOf(i));
        return i;
    }

    public static String d(String str, int i) {
        String str2;
        LogUtil.b("Unite_FileUtils", "getAppfiled entry");
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = str + "_" + i;
        }
        LogUtil.b("Unite_FileUtils", "getMapKey entry， mapKey:", cpl.a(str2));
        return str2;
    }

    public static int e(String str) {
        int iNextInt;
        LogUtil.b("Unite_FileUtils", "getSecureRandom entry, uniqueSign is :", cpl.a(str));
        if (!TextUtils.isEmpty(str)) {
            byte[] bytes = new byte[0];
            try {
                bytes = str.getBytes("UTF-8");
            } catch (UnsupportedEncodingException unused) {
                LogUtil.b("Unite_FileUtils", "seed get error :", cpl.a(str));
            }
            iNextInt = new SecureRandom(bytes).nextInt(100000000);
        } else {
            SecureRandom secureRandom = new SecureRandom();
            secureRandom.nextBytes(new byte[20]);
            iNextInt = secureRandom.nextInt(100000000);
        }
        LogUtil.b("Unite_FileUtils", "seRandom is :", Integer.valueOf(iNextInt));
        return iNextInt;
    }

    public static String c(String str) {
        String strReplaceAll = "";
        if (!TextUtils.isEmpty(str)) {
            strReplaceAll = str.replaceAll(":", "");
        } else {
            LogUtil.b("Unite_FileUtils", "deviceMac is error ");
        }
        String strD = cph.d(lnh.b(cph.e(strReplaceAll)));
        return TextUtils.isEmpty(strD) ? strReplaceAll : strD;
    }

    public static void c(File file) {
        if (file != null && file.exists() && file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null) {
                for (File file2 : fileArrListFiles) {
                    if (file2.isDirectory()) {
                        c(file2);
                    } else if (!file2.delete()) {
                        LogUtil.e("Unite_FileUtils", "delete fail.");
                    }
                }
            }
            if (file.delete()) {
                return;
            }
            LogUtil.e("Unite_FileUtils", "delete fail.");
        }
    }

    private static Map<String, UniteDevice> d() {
        HashMap map = new HashMap();
        for (UniteDevice uniteDevice : cju.d().getDeviceList().values()) {
            DeviceInfo deviceInfo = uniteDevice.getDeviceInfo();
            if (deviceInfo.isUsing() && deviceInfo.getDeviceConnectState() == 2) {
                map.put(uniteDevice.getIdentify(), uniteDevice);
            }
        }
        LogUtil.b("Unite_FileUtils", "getDeviceList deviceMap size is :", Integer.valueOf(map.size()));
        return map;
    }

    public static UniteDevice b(String str) {
        LogUtil.b("Unite_FileUtils", "deviceMac is :", cpl.a(str));
        if (str == null) {
            return null;
        }
        for (UniteDevice uniteDevice : d().values()) {
            if (uniteDevice.getDeviceInfo().getDeviceMac().equals(str)) {
                LogUtil.b("Unite_FileUtils", "uniteDevice get success");
                return uniteDevice;
            }
        }
        return null;
    }

    public static String b(xhr xhrVar) {
        if (xhrVar == null) {
            return null;
        }
        if (xhrVar.h() == null) {
            LogUtil.b("Unite_FileUtils", "fileInfo.getDevice is null");
        }
        String strA = a(xhrVar.h());
        LogUtil.b("Unite_FileUtils", "getDeviceMac is :", cpl.a(strA));
        return strA;
    }

    public static String a(UniteDevice uniteDevice) {
        if (uniteDevice == null) {
            return null;
        }
        DeviceInfo deviceInfo = uniteDevice.getDeviceInfo();
        LogUtil.b("Unite_FileUtils", "uniteDevice.getIdentify() is :", cpl.a(uniteDevice.getIdentify()));
        if (deviceInfo != null) {
            return deviceInfo.getDeviceMac();
        }
        return null;
    }

    public static DeviceInfo a(xhr xhrVar) {
        if (xhrVar == null) {
            return null;
        }
        if (xhrVar.h() == null) {
            LogUtil.b("Unite_FileUtils", "fileInfo.getDevice is null");
        }
        UniteDevice uniteDeviceH = xhrVar.h();
        DeviceInfo deviceInfo = uniteDeviceH != null ? uniteDeviceH.getDeviceInfo() : null;
        LogUtil.b("Unite_FileUtils", "getDeviceInfo is null :", Boolean.valueOf(deviceInfo == null));
        return deviceInfo;
    }
}

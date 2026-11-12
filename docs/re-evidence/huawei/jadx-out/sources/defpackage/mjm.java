package defpackage;

import android.text.TextUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.wisecloud.drmclient.license.HwDrmConstant;
import health.compact.a.CommonUtil;
import health.compact.a.IoUtils;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.apache.commons.io.FileUtils;

/* JADX INFO: loaded from: classes10.dex */
public class mjm {
    public static void d(Collection<File> collection, File file, String str, String str2) throws IOException {
        ZipOutputStream zipOutputStream;
        if (collection == null || file == null) {
            LogUtil.j("ZipUtil", "zipFileList or zipFileParam is null");
            return;
        }
        LogUtil.d("ZipUtil", "zipFiles() size: ", Integer.valueOf(collection.size()));
        ZipOutputStream zipOutputStream2 = null;
        try {
            try {
                zipOutputStream = new ZipOutputStream(new BufferedOutputStream(FileUtils.openOutputStream(file), 1048576));
                try {
                    for (File file2 : collection) {
                        String name = file2.getName();
                        LogUtil.d("ZipUtil", "zipFileName: ", name);
                        try {
                            name = new String(name.getBytes("8859_1"), "GB2312");
                        } catch (UnsupportedEncodingException e) {
                            LogUtil.e("ZipUtil", "UnsupportedEncodingException e: ", e.getMessage());
                        }
                        LogUtil.d("ZipUtil", "zipFile.isDirectory(): ", Boolean.valueOf(file2.isDirectory()), " zipFileName:", name);
                        if (file2.isDirectory()) {
                            File[] fileArrListFiles = file2.listFiles();
                            if (fileArrListFiles != null && fileArrListFiles.length != 0) {
                                Iterator<File> it = b(file2, fileArrListFiles, str2).iterator();
                                while (it.hasNext()) {
                                    e(it.next(), zipOutputStream, name, str);
                                }
                            }
                            LogUtil.d("ZipUtil", "fileLists is null");
                            break;
                        }
                        c(zipOutputStream, file2);
                    }
                    try {
                        zipOutputStream.setComment("com.huawei.health");
                        zipOutputStream.close();
                    } catch (IOException unused) {
                        LogUtil.e("ZipUtil", "IOException exception");
                    }
                } catch (IOException e2) {
                    e = e2;
                    zipOutputStream2 = zipOutputStream;
                    LogUtil.e("ZipUtil", "zipFiles IOException exception");
                    throw new IOException(e);
                } catch (Throwable th) {
                    th = th;
                    if (zipOutputStream != null) {
                        try {
                            zipOutputStream.setComment("com.huawei.health");
                            zipOutputStream.close();
                        } catch (IOException unused2) {
                            LogUtil.e("ZipUtil", "IOException exception");
                        }
                    }
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
            }
        } catch (Throwable th2) {
            th = th2;
            zipOutputStream = zipOutputStream2;
        }
    }

    public static void b() {
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10), "last_zip_time", new SimpleDateFormat(HwDrmConstant.TIME_FORMAT, Locale.ENGLISH).format(new Date()), new StorageParams());
    }

    private static boolean j(String str) {
        try {
            LogUtil.a("ZipUtil", "isAddZip fileName: ", str);
            int length = str.length();
            if (length < 18) {
                return true;
            }
            String strSubstring = str.substring(length - 18, length - 4);
            long j = Long.parseLong(SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10), "last_zip_time"));
            long j2 = Long.parseLong(strSubstring);
            LogUtil.a("ZipUtil", "isAddZip lastTime: ", Long.valueOf(j), "currentTime: ", Long.valueOf(j2));
            if (j2 >= j) {
                return true;
            }
            LogUtil.a("ZipUtil", "isAddZip is false");
            return false;
        } catch (NumberFormatException unused) {
            LogUtil.e("ZipUtil", "isAddZip NumberFormatException");
            return true;
        }
    }

    private static List<File> b(File file, File[] fileArr, String str) {
        List<File> listAsList = Arrays.asList(fileArr);
        ArrayList arrayList = new ArrayList(16);
        if ("com.huawei.health_PhoneService".equals(file.getName())) {
            for (File file2 : listAsList) {
                if (!"log.0".equals(file2.getName()) && j(file2.getName())) {
                    arrayList.add(file2);
                }
            }
        } else if ("MaintenanceLog".equals(file.getName())) {
            for (File file3 : listAsList) {
                if (file3.getName().contains(str) || file3.getName().contains("bigdata.log")) {
                    arrayList.add(file3);
                }
            }
        } else if (BaseApplication.getAppPackage().equals(file.getName())) {
            for (File file4 : listAsList) {
                if (j(file4.getName())) {
                    arrayList.add(file4);
                }
            }
        } else {
            arrayList.addAll(listAsList);
            return arrayList;
        }
        return arrayList;
    }

    private static void c(ZipOutputStream zipOutputStream, File file) throws Throwable {
        BufferedInputStream bufferedInputStream;
        BufferedInputStream bufferedInputStream2 = null;
        try {
            try {
                byte[] bArr = new byte[1048576];
                String strC = CommonUtil.c(file.getCanonicalPath());
                if (TextUtils.isEmpty(strC)) {
                    LogUtil.j("ZipUtil", "zipFiles safePath is empty");
                    IoUtils.c(null);
                    return;
                }
                bufferedInputStream = new BufferedInputStream(new FileInputStream(strC), 1048576);
                try {
                    zipOutputStream.putNextEntry(new ZipEntry(file.getName()));
                    while (true) {
                        int i = bufferedInputStream.read(bArr);
                        if (i == -1) {
                            LogUtil.a("ZipUtil", "zip ok");
                            IoUtils.c(bufferedInputStream);
                            return;
                        }
                        zipOutputStream.write(bArr, 0, i);
                    }
                } catch (IOException unused) {
                    bufferedInputStream2 = bufferedInputStream;
                    LogUtil.e("ZipUtil", "processFile IOException");
                    IoUtils.c(bufferedInputStream2);
                } catch (Throwable th) {
                    th = th;
                    IoUtils.c(bufferedInputStream);
                    throw th;
                }
            } catch (IOException unused2) {
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedInputStream = null;
        }
    }

    private static void e(File file, ZipOutputStream zipOutputStream, String str, String str2) throws Throwable {
        BufferedInputStream bufferedInputStream;
        LogUtil.d("ZipUtil", "zipFile()");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str.trim().length() == 0 ? "" : File.separator);
        sb.append(file.getName());
        String string = sb.toString();
        try {
            string = new String(string.getBytes("8859_1"), "GB2312");
        } catch (UnsupportedEncodingException e) {
            LogUtil.e("ZipUtil", "UnsupportedEncodingException e: ", e.getMessage());
        }
        LogUtil.d("ZipUtil", "rootPathResult: ", string);
        if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null || fileArrListFiles.length <= 0) {
                return;
            }
            a(file, zipOutputStream, str2, string, fileArrListFiles);
            return;
        }
        BufferedInputStream bufferedInputStream2 = null;
        try {
            try {
                byte[] bArr = new byte[1048576];
                bufferedInputStream = new BufferedInputStream(FileUtils.openInputStream(file), 1048576);
                try {
                    zipOutputStream.putNextEntry(new ZipEntry(string));
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
                    LogUtil.e("ZipUtil", "zipFile IOException");
                    IoUtils.c(bufferedInputStream2);
                } catch (Throwable th) {
                    th = th;
                    IoUtils.c(bufferedInputStream);
                    throw th;
                }
            } catch (IOException unused2) {
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedInputStream = bufferedInputStream2;
        }
    }

    private static void a(File file, ZipOutputStream zipOutputStream, String str, String str2, File[] fileArr) throws Throwable {
        if ("com.huawei.health_PhoneService".equals(file.getName()) && "HWFEEDBACKAPI_ZIP_COMMENT_KEY".equals(str)) {
            File file2 = fileArr[0];
            if (file2 != null) {
                e(file2, zipOutputStream, str2, str);
                return;
            }
            return;
        }
        for (File file3 : fileArr) {
            e(file3, zipOutputStream, str2, str);
        }
    }

    public static LinkedList<File> c(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("ZipUtil", "listLinkedFiles path is null");
            return null;
        }
        File[] fileArrListFiles = new File(str).listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            LogUtil.j("ZipUtil", "files is null");
            return null;
        }
        LinkedList<File> linkedList = new LinkedList<>();
        LogUtil.a("ZipUtil", "listLinkedFiles files: ", Integer.valueOf(fileArrListFiles.length));
        for (File file : fileArrListFiles) {
            String name = file.getName();
            if (a(file, name) || a(name) || file.isDirectory()) {
                linkedList.add(file);
            } else {
                LogUtil.j("ZipUtil", "listLinkedFiles else");
            }
        }
        return linkedList;
    }

    public static LinkedList<File> d(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("ZipUtil", "listLinkedDeviceFiles path is null");
            return null;
        }
        File[] fileArrListFiles = new File(str).listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            LogUtil.j("ZipUtil", "files is null");
            return null;
        }
        LinkedList<File> linkedList = new LinkedList<>();
        LogUtil.a("ZipUtil", "listLinkedDeviceFiles files: ", Integer.valueOf(fileArrListFiles.length));
        for (File file : fileArrListFiles) {
            if (g(file.getName())) {
                linkedList.add(file);
            } else {
                LogUtil.j("ZipUtil", "listLinkedDeviceFiles else");
            }
        }
        return linkedList;
    }

    private static boolean a(String str) {
        return h(str) || i(str) || e(str);
    }

    private static boolean a(File file, String str) {
        if (file.isDirectory()) {
            return false;
        }
        return str.contains("app_crashLog") || str.contains("log");
    }

    private static boolean h(String str) {
        return str.contains("MCU") || str.contains("Event") || str.contains("BT");
    }

    private static boolean i(String str) {
        return str.contains("Dump") || str.contains("Power") || str.contains("com.huawei");
    }

    private static boolean e(String str) {
        return str.contains("_appdft_Beta");
    }

    private static boolean g(String str) {
        return str.contains("_device_WearableBeta.zip");
    }

    public static LinkedList<File> b(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("ZipUtil", "listLinkedOtaFiles path is null");
            return null;
        }
        File[] fileArrListFiles = new File(str).listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            LogUtil.j("ZipUtil", "listLinkedOtaFiles directory.listFiles is null");
            return null;
        }
        LinkedList<File> linkedList = new LinkedList<>();
        LogUtil.a("ZipUtil", "listLinkedOtaFiles files: ", Integer.valueOf(fileArrListFiles.length));
        for (File file : fileArrListFiles) {
            String name = file.getName();
            if ((!file.isDirectory() && name.contains("_mcu_upg")) || file.isDirectory()) {
                linkedList.add(file);
            } else {
                LogUtil.j("ZipUtil", "listLinkedOtaFiles else");
            }
        }
        return linkedList;
    }
}

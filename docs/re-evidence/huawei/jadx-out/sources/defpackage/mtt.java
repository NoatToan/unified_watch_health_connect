package defpackage;

import android.os.StatFs;
import android.text.TextUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hwlogsmodel.LogUtil;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import org.apache.commons.io.FileUtils;

/* JADX INFO: loaded from: classes11.dex */
public class mtt {
    public static boolean d(List<String> list, String str, String str2) {
        boolean z = list == null || list.isEmpty();
        boolean z2 = TextUtils.isEmpty(str) || TextUtils.isEmpty(str2);
        if (z || z2) {
            LogUtil.a(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "FileUtils", "invalid parameters: vcards = " + list + ", vcard dir = " + str + ", vcardFileSuffixName = " + str2);
            return false;
        }
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            boolean zC = c(list.get(i2), str + (i2 + str2), false);
            StringBuilder sb = new StringBuilder("write file result: ");
            sb.append(zC);
            LogUtil.a(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "FileUtils", sb.toString());
            if (zC) {
                i++;
            }
        }
        return i == size;
    }

    public static boolean d(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            LogUtil.a(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "FileUtils", "invalid parameters: originDirectory = " + str + ", destDirectory = " + str2 + ", fileName = " + str3);
            return false;
        }
        pil.d(str, str2, str3);
        return true;
    }

    public static boolean c(List<String> list, String str, String str2) {
        if (list == null || list.isEmpty() || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.a(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "FileUtils", "invalid parameters: uuidList = " + list + ", csvFileDir = " + str + ", fileName = " + str2);
            return false;
        }
        String str3 = str + str2;
        int i = 0;
        for (String str4 : list) {
            if (!TextUtils.isEmpty(str4)) {
                boolean zC = c(str4 + ",", str3, true);
                StringBuilder sb = new StringBuilder("write file result: ");
                sb.append(zC);
                LogUtil.a(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "FileUtils", sb.toString());
                if (zC) {
                    i++;
                }
            }
        }
        return i == list.size();
    }

    public static void c(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.a("03", 1, "FileUtils", "dir path is null or empty. ");
        } else {
            c(new File(str));
        }
    }

    private static void c(File file) {
        File[] fileArrListFiles;
        if (file == null || !file.exists() || !file.isDirectory() || (fileArrListFiles = file.listFiles()) == null) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            if (file2 != null) {
                if (file2.isFile()) {
                    LogUtil.a("03", 1, "FileUtils", "deleteDirWithFile isDeleted=", Boolean.valueOf(file2.delete()));
                } else if (file2.isDirectory()) {
                    c(file2);
                } else {
                    LogUtil.a("03", 1, "FileUtils", "file type error");
                }
            }
        }
        LogUtil.d("FileUtils", "deleteDirWithFile result=", Boolean.valueOf(file.delete()));
    }

    private static boolean c(String str, String str2, boolean z) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        File file = new File(str2);
        if (file.exists() && !z && !file.delete()) {
            LogUtil.a("03", 1, "FileUtils", "writeToFile: file delete failed.");
        }
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            if (!parentFile.exists() && !parentFile.mkdirs()) {
                LogUtil.a("03", 1, "FileUtils", "writeToFile: failed to create file's parent.");
                return false;
            }
            if (b(parentFile.getPath()) < str.length()) {
                LogUtil.a("03", 1, "FileUtils", "writeToFile: have no space to write the file.");
                return false;
            }
        }
        return b(file, str.getBytes(StandardCharsets.UTF_8), z);
    }

    private static boolean b(File file, byte[] bArr, boolean z) {
        try {
            FileOutputStream fileOutputStreamA = a(file, z);
            try {
                fileOutputStreamA.write(bArr);
                fileOutputStreamA.flush();
                if (fileOutputStreamA != null) {
                    fileOutputStreamA.close();
                }
                return true;
            } catch (Throwable th) {
                if (fileOutputStreamA != null) {
                    try {
                        fileOutputStreamA.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IOException unused) {
            LogUtil.e("03", 1, "FileUtils", "writeToFile: failed to write the file.");
            return false;
        } catch (IllegalArgumentException unused2) {
            LogUtil.e("03", 1, "FileUtils", "IllegalArgumentException: failed to write the file .");
            return false;
        }
    }

    private static long b(String str) {
        try {
            StatFs statFs = new StatFs(str);
            return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
        } catch (IllegalArgumentException e) {
            LogUtil.e("03", 1, "FileUtils", "getFreeSpaceOfPath IllegalArgumentException." + e.getMessage());
            return 0L;
        }
    }

    private static FileOutputStream a(File file, boolean z) throws IOException, IllegalArgumentException {
        return FileUtils.openOutputStream(file, z);
    }
}

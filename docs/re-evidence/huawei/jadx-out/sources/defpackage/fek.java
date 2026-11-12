package defpackage;

import android.text.TextUtils;
import com.huawei.haf.common.os.FileUtils;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.IoUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes7.dex */
public class fek {
    public static int a(String str, String str2) {
        ZipInputStream zipInputStream;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.j("UnzipUtils", "unzip filePath or destFolder is empty.");
            return -1;
        }
        LogUtil.a("UnzipUtils", "unzip filePath :", str, ", destFolder :", str2);
        String strC = CommonUtil.c(str);
        if (TextUtils.isEmpty(strC)) {
            LogUtil.j("UnzipUtils", "unzip safeFilePath is empty.");
            return -1;
        }
        ZipInputStream zipInputStream2 = null;
        try {
            try {
                zipInputStream = new ZipInputStream(new FileInputStream(strC));
                try {
                    int iE = e(zipInputStream, str2, (String) null, true);
                    IoUtils.c(zipInputStream);
                    return iE;
                } catch (IOException e) {
                    e = e;
                    zipInputStream2 = zipInputStream;
                    LogUtil.e("UnzipUtils", "unzip IOException is； ", e.getMessage());
                    b(strC);
                    IoUtils.c(zipInputStream2);
                    return -1;
                } catch (Throwable th) {
                    th = th;
                    IoUtils.c(zipInputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                zipInputStream = zipInputStream2;
            }
        } catch (IOException e2) {
            e = e2;
        }
    }

    private static int e(ZipInputStream zipInputStream, String str, String str2, boolean z) throws IOException {
        if (zipInputStream == null || TextUtils.isEmpty(str)) {
            LogUtil.j("UnzipUtils", "unzip zipInputStream or destFolder is empty.");
            return -1;
        }
        File fileD = d(str);
        boolean zIsEmpty = TextUtils.isEmpty(str2);
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            int i = 0;
            while (nextEntry != null) {
                if (!zIsEmpty && !str2.equals(nextEntry.getName())) {
                    nextEntry = zipInputStream.getNextEntry();
                } else {
                    File fileC = c(nextEntry, fileD);
                    if (nextEntry.isDirectory()) {
                        LogUtil.d("UnzipUtils", "unzip zipEntry isDirectoryMade :", Boolean.valueOf(fileC.mkdirs()));
                        nextEntry = zipInputStream.getNextEntry();
                    } else {
                        a(fileC, false, true);
                        if (e(fileC, zipInputStream, 0, new byte[4096]) > 419430400) {
                            LogUtil.e("UnzipUtils", "unzip this zip file too big, unzip failure.");
                            throw new IOException("unzip this zip file too big.");
                        }
                        i++;
                        if (!zIsEmpty) {
                            zipInputStream.closeEntry();
                            break;
                        }
                        nextEntry = zipInputStream.getNextEntry();
                    }
                }
            }
            LogUtil.a("UnzipUtils", "unzip accomplished amount:", Integer.valueOf(i));
            return i;
        } catch (IOException e) {
            if (z) {
                b(!zIsEmpty, null, fileD);
            }
            throw e;
        }
    }

    private static void b(String str) {
        File file = new File(str);
        if (file.exists()) {
            LogUtil.a("UnzipUtils", "deleteSourceFile sourceFile:", Boolean.valueOf(FileUtils.b(file)));
        }
    }

    private static File d(String str) throws IOException {
        String strC = CommonUtil.c(str);
        if (TextUtils.isEmpty(strC)) {
            LogUtil.j("UnzipUtils", "unzip dest folder path is empty.");
            throw new IOException("unzip this dest folder path is illegal.");
        }
        return new File(strC);
    }

    private static File c(ZipEntry zipEntry, File file) throws IOException {
        String strC = c(zipEntry.getName(), file);
        LogUtil.a("UnzipUtils", "getExtractFile:", strC);
        String strC2 = CommonUtil.c(strC);
        if (TextUtils.isEmpty(strC2)) {
            LogUtil.j("UnzipUtils", "unzip this zip file dest path is illegal, unzip failure.");
            throw new IOException("unzip this zip file dest path is illegal.");
        }
        return new File(strC2);
    }

    private static String c(String str, File file) throws IOException {
        String canonicalPath = new File(file, str).getCanonicalPath();
        if (canonicalPath.startsWith(file.getCanonicalPath())) {
            return canonicalPath;
        }
        throw new IOException("File is outside extraction target directory.");
    }

    private static void a(File file, boolean z, boolean z2) throws IOException, SecurityException {
        if (z && file.isDirectory()) {
            LogUtil.a("UnzipUtils", "initializeDestFile deleteDestFile as isDeleteFile :", Boolean.valueOf(FileUtils.b(file)));
        }
        if (z2 && file.exists()) {
            LogUtil.a("UnzipUtils", "initializeDestFile deleteDestFile isDeleteFile :", Boolean.valueOf(FileUtils.b(file)));
        }
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists()) {
            LogUtil.a("UnzipUtils", "initializeDestFile isMkdirFile :", Boolean.valueOf(parentFile.mkdirs()));
        }
        if (file.isFile()) {
            return;
        }
        LogUtil.d("UnzipUtils", "initializeDestFile isCreateNewFile :", Boolean.valueOf(file.createNewFile()));
    }

    private static int e(File file, ZipInputStream zipInputStream, int i, byte[] bArr) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        while (true) {
            try {
                try {
                    int i2 = zipInputStream.read(bArr);
                    if (i2 <= -1 || (i = i + i2) > 419430400) {
                        break;
                        break;
                    }
                    fileOutputStream.write(bArr, 0, i2);
                } catch (IOException e) {
                    LogUtil.e("UnzipUtils", "unzipSingleFile IOException.");
                    throw e;
                }
            } catch (Throwable th) {
                IoUtils.c(fileOutputStream);
                throw th;
            }
        }
        IoUtils.c(fileOutputStream);
        return i;
    }

    private static void b(boolean z, File file, File file2) {
        if (z) {
            if (file != null && file.exists() && file.isFile()) {
                FileUtils.e(file);
                return;
            }
            return;
        }
        if (file2.exists() && file2.isDirectory()) {
            FileUtils.e(file2);
        }
    }
}

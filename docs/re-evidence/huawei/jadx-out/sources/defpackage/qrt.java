package defpackage;

import android.text.TextUtils;
import com.huawei.haf.common.os.FileUtils;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.IoUtils;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.util.Locale;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes16.dex */
public class qrt {
    public static int b(String str, String str2) throws Throwable {
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
                    int iC = c(zipInputStream, str2, null, true);
                    IoUtils.c(zipInputStream);
                    return iC;
                } catch (IOException e) {
                    e = e;
                    zipInputStream2 = zipInputStream;
                    LogUtil.e("UnzipUtils", "unzip IOException is； ", e.getMessage());
                    e(strC);
                    IoUtils.c(zipInputStream2);
                    return -1;
                } catch (Throwable th) {
                    th = th;
                    IoUtils.c(zipInputStream);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
            zipInputStream = zipInputStream2;
        }
    }

    private static int c(ZipInputStream zipInputStream, String str, String str2, boolean z) throws IOException {
        if (zipInputStream == null || TextUtils.isEmpty(str)) {
            LogUtil.j("UnzipUtils", "unzip zipInputStream or destFolder is empty.");
            return -1;
        }
        File fileC = c(str);
        boolean zIsEmpty = TextUtils.isEmpty(str2);
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            int i = 0;
            while (nextEntry != null) {
                if (!zIsEmpty && !str2.equals(nextEntry.getName())) {
                    nextEntry = zipInputStream.getNextEntry();
                } else {
                    File fileB = b(nextEntry, fileC);
                    if (nextEntry.isDirectory()) {
                        LogUtil.d("UnzipUtils", "unzip zipEntry isDirectoryMade :", Boolean.valueOf(fileB.mkdirs()));
                        nextEntry = zipInputStream.getNextEntry();
                    } else {
                        a(fileB, false, true);
                        if (d(fileB, zipInputStream, 0, new byte[4096]) > 104857600) {
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
                c(!zIsEmpty, null, fileC);
            }
            throw e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    public static String a(String str, String str2) throws Throwable {
        FileInputStream fileInputStream;
        ZipInputStream zipInputStream;
        BufferedOutputStream bufferedOutputStream;
        String name;
        ?? r1 = 0;
        r1 = 0;
        r1 = 0;
        if (str == null) {
            return null;
        }
        File file = new File(str);
        String str3 = file.getName() + "." + str2;
        try {
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    zipInputStream = new ZipInputStream(fileInputStream);
                    while (true) {
                        try {
                            ZipEntry nextEntry = zipInputStream.getNextEntry();
                            if (nextEntry == null) {
                                LogUtil.j("UnzipUtils", "File with format " + str2 + " not found in the zip.");
                                FileUtils.a((Closeable) null);
                                FileUtils.a(zipInputStream);
                                FileUtils.a(fileInputStream);
                                return null;
                            }
                            name = nextEntry.getName();
                            if (!nextEntry.isDirectory()) {
                                break;
                            }
                            if (name.toLowerCase(Locale.ENGLISH).endsWith("." + str2)) {
                                break;
                            }
                            zipInputStream.closeEntry();
                        } catch (IOException e) {
                            e = e;
                            bufferedOutputStream = null;
                        } catch (Throwable th) {
                            th = th;
                            FileUtils.a((Closeable) r1);
                            FileUtils.a(zipInputStream);
                            FileUtils.a(fileInputStream);
                            throw th;
                        }
                    }
                    LogUtil.a("UnzipUtils", "Found target file: " + name);
                    File file2 = new File(file.getParentFile(), str3);
                    byte[] bArr = new byte[4096];
                    bufferedOutputStream = new BufferedOutputStream(Files.newOutputStream(file2.toPath(), new OpenOption[0]));
                    while (true) {
                        try {
                            int i = zipInputStream.read(bArr);
                            if (i == -1) {
                                bufferedOutputStream.flush();
                                zipInputStream.closeEntry();
                                String string = file2.toPath().toString();
                                FileUtils.a(bufferedOutputStream);
                                FileUtils.a(zipInputStream);
                                FileUtils.a(fileInputStream);
                                return string;
                            }
                            bufferedOutputStream.write(bArr, 0, i);
                        } catch (IOException e2) {
                            e = e2;
                            LogUtil.e("UnzipUtils", "An error occurred during unzipping", e);
                            FileUtils.a(bufferedOutputStream);
                            FileUtils.a(zipInputStream);
                            FileUtils.a(fileInputStream);
                            return null;
                        }
                    }
                } catch (IOException e3) {
                    e = e3;
                    bufferedOutputStream = null;
                    zipInputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    zipInputStream = null;
                }
            } catch (Throwable th3) {
                th = th3;
                r1 = file;
            }
        } catch (IOException e4) {
            e = e4;
            bufferedOutputStream = null;
            fileInputStream = null;
            zipInputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileInputStream = null;
            zipInputStream = null;
        }
    }

    private static void e(String str) {
        File file = new File(str);
        if (file.exists()) {
            LogUtil.a("UnzipUtils", "deleteSourceFile sourceFile:", Boolean.valueOf(FileUtils.b(file)));
        }
    }

    private static File c(String str) throws IOException {
        String strC = CommonUtil.c(str);
        if (TextUtils.isEmpty(strC)) {
            LogUtil.j("UnzipUtils", "unzip dest folder path is empty.");
            throw new IOException("unzip this dest folder path is illegal.");
        }
        return new File(strC);
    }

    private static File b(ZipEntry zipEntry, File file) throws IOException {
        String strA = a(zipEntry.getName(), file);
        LogUtil.a("UnzipUtils", "getExtractFile:", strA);
        String strC = CommonUtil.c(strA);
        if (TextUtils.isEmpty(strC)) {
            LogUtil.j("UnzipUtils", "unzip this zip file dest path is illegal, unzip failure.");
            throw new IOException("unzip this zip file dest path is illegal.");
        }
        return new File(strC);
    }

    private static String a(String str, File file) throws IOException {
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

    private static int d(File file, ZipInputStream zipInputStream, int i, byte[] bArr) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        while (true) {
            try {
                try {
                    int i2 = zipInputStream.read(bArr);
                    if (i2 <= -1 || (i = i + i2) > 104857600) {
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

    private static void c(boolean z, File file, File file2) {
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

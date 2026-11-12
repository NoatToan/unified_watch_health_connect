package health.compact.a;

import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.os.FileUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* JADX INFO: loaded from: classes2.dex */
public class LogZipUtil {
    private LogZipUtil() {
    }

    public static void e(File file, File file2) {
        ZipOutputStream zipOutputStream;
        com.huawei.hwlogsmodel.LogUtil.a("LogZipUtil", "enter zipSingleFile");
        if (file.isDirectory()) {
            com.huawei.hwlogsmodel.LogUtil.j("LogZipUtil", "zipFile.isDirectory()");
            return;
        }
        BufferedInputStream bufferedInputStream = null;
        try {
            String strC = c(file.getCanonicalPath());
            if (TextUtils.isEmpty(strC)) {
                com.huawei.hwlogsmodel.LogUtil.j("LogZipUtil", "zipFiles safePath is empty");
                FileUtils.a((Closeable) null);
                return;
            }
            byte[] bArr = new byte[16384];
            if (file2.getParentFile() != null && !file2.getParentFile().exists()) {
                file2.getParentFile().mkdirs();
            }
            zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(file2), 16384));
            try {
                try {
                    BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(strC), 16384);
                    try {
                        zipOutputStream.putNextEntry(new ZipEntry(file.getName()));
                        while (true) {
                            int i = bufferedInputStream2.read(bArr);
                            if (i == -1) {
                                FileUtils.a(bufferedInputStream2);
                                try {
                                    zipOutputStream.setComment(BaseApplication.d());
                                    zipOutputStream.close();
                                    return;
                                } catch (IOException unused) {
                                    com.huawei.hwlogsmodel.LogUtil.e("LogZipUtil", "IOException exception");
                                    return;
                                }
                            }
                            zipOutputStream.write(bArr, 0, i);
                        }
                    } catch (IOException unused2) {
                        bufferedInputStream = bufferedInputStream2;
                        com.huawei.hwlogsmodel.LogUtil.e("LogZipUtil", "zipFile IOException");
                        FileUtils.a(bufferedInputStream);
                        if (zipOutputStream != null) {
                            try {
                                zipOutputStream.setComment(BaseApplication.d());
                                zipOutputStream.close();
                            } catch (IOException unused3) {
                                com.huawei.hwlogsmodel.LogUtil.e("LogZipUtil", "IOException exception");
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        bufferedInputStream = bufferedInputStream2;
                        FileUtils.a(bufferedInputStream);
                        if (zipOutputStream != null) {
                            try {
                                zipOutputStream.setComment(BaseApplication.d());
                                zipOutputStream.close();
                            } catch (IOException unused4) {
                                com.huawei.hwlogsmodel.LogUtil.e("LogZipUtil", "IOException exception");
                            }
                        }
                        throw th;
                    }
                } catch (IOException unused5) {
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedInputStream = bufferedInputStream;
                zipOutputStream = zipOutputStream;
            }
        } catch (IOException unused6) {
            zipOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            zipOutputStream = null;
        }
    }

    public static void d(String str) {
        File file = new File(str);
        File[] fileArrListFiles = file.listFiles(new FilenameFilter() { // from class: health.compact.a.LogZipUtil.1
            @Override // java.io.FilenameFilter
            public boolean accept(File file2, String str2) {
                return str2.startsWith("uploaded_local_") && str2.endsWith(".zip");
            }
        });
        File[] fileArrListFiles2 = file.listFiles(new FilenameFilter() { // from class: health.compact.a.LogZipUtil.2
            @Override // java.io.FilenameFilter
            public boolean accept(File file2, String str2) {
                return str2.startsWith("local_") && str2.endsWith(".zip");
            }
        });
        int length = fileArrListFiles == null ? 0 : fileArrListFiles.length;
        if ((fileArrListFiles2 == null ? 0 : fileArrListFiles2.length) + length >= e()) {
            if (length > 0) {
                com.huawei.hwlogsmodel.LogUtil.a("LogZipUtil", "deleteOldestFile, isDelete :", Boolean.valueOf(fileArrListFiles[0].delete()));
            } else {
                Arrays.sort(fileArrListFiles2, new Comparator<File>() { // from class: health.compact.a.LogZipUtil.3
                    @Override // java.util.Comparator
                    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                    public int compare(File file2, File file3) {
                        return LogZipUtil.a(file2, file3);
                    }
                });
                com.huawei.hwlogsmodel.LogUtil.a("LogZipUtil", "deleteOldestFile, isDelete :", Boolean.valueOf(fileArrListFiles2[0].delete()));
            }
        }
    }

    private static int e() {
        return com.huawei.hwlogsmodel.common.LogConfig.f() ? 5 : 20;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int a(File file, File file2) {
        boolean z = file == null || !file.exists();
        boolean z2 = file2 == null || !file2.exists();
        if (z && z2) {
            return 0;
        }
        if (z) {
            return -1;
        }
        if (z2) {
            return 1;
        }
        return Long.compare(file.lastModified(), file2.lastModified());
    }

    private static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            if ("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890-=[];\\',./ ~!@#$%^&*()_+\"{}|:<>?".contains(String.valueOf(str.charAt(i)))) {
                stringBuffer.append(str.charAt(i));
            }
        }
        return stringBuffer.toString();
    }

    private static String c(String str) {
        String strB = b(str);
        if (TextUtils.isEmpty(strB)) {
            return null;
        }
        try {
            return new File(strB).getCanonicalPath();
        } catch (IOException e) {
            com.huawei.hwlogsmodel.LogUtil.j("LogZipUtil", "filterFilePath IOException :", e.getMessage());
            return null;
        }
    }

    public static boolean e(String str, String str2, boolean z) {
        String strC = c(str);
        String strC2 = c(str2);
        if (TextUtils.isEmpty(strC) || TextUtils.isEmpty(strC2)) {
            com.huawei.hwlogsmodel.LogUtil.a("LogZipUtil", "copyFile source file is empty or destFileName is empty");
            return false;
        }
        File file = new File(strC);
        if (a(file)) {
            return false;
        }
        File file2 = new File(strC2);
        if (e(strC2, file2, z)) {
            return false;
        }
        return c(file, file2);
    }

    private static boolean e(String str, File file, boolean z) {
        if (file.exists() && z) {
            try {
                return !new File(str).delete();
            } catch (SecurityException unused) {
                com.huawei.hwlogsmodel.LogUtil.a("LogZipUtil", "delete SecurityException");
                return false;
            } catch (Exception unused2) {
                com.huawei.hwlogsmodel.LogUtil.a("LogZipUtil", "delete exception");
                return false;
            }
        }
        if (file.getParentFile() == null || file.getParentFile().exists()) {
            return false;
        }
        return !file.getParentFile().mkdirs();
    }

    private static boolean a(File file) {
        if (!file.exists()) {
            com.huawei.hwlogsmodel.LogUtil.a("LogZipUtil", "source file is not exit");
            return true;
        }
        if (!file.isFile()) {
            com.huawei.hwlogsmodel.LogUtil.a("LogZipUtil", "srcFile is not a file");
            return true;
        }
        com.huawei.hwlogsmodel.LogUtil.a("LogZipUtil", "srcFile is exists");
        return false;
    }

    private static boolean c(File file, File file2) throws Throwable {
        Throwable th;
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = fileInputStream.read(bArr);
                        if (i != -1) {
                            fileOutputStream2.write(bArr, 0, i);
                        } else {
                            FileUtils.a(fileOutputStream2);
                            FileUtils.a(fileInputStream);
                            return true;
                        }
                    }
                } catch (IOException unused) {
                    fileOutputStream = fileOutputStream2;
                    FileUtils.a(fileOutputStream);
                    FileUtils.a(fileInputStream);
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = fileOutputStream2;
                    FileUtils.a(fileOutputStream);
                    FileUtils.a(fileInputStream);
                    throw th;
                }
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException unused3) {
            fileInputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileInputStream = null;
        }
    }
}

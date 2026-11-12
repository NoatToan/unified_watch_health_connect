package defpackage;

import android.text.TextUtils;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.IoUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Collection;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.apache.commons.io.FileUtils;

/* JADX INFO: loaded from: classes7.dex */
public class dxu {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.zip.ZipOutputStream] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.zip.ZipOutputStream] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.zip.ZipOutputStream] */
    public static void d(Collection<File> collection, File file, String str) throws Throwable {
        ?? zipOutputStream;
        if (collection == null || file == null) {
            LogUtil.j("ZipUtil", "zipFileList or zipFileParam is null");
            return;
        }
        LogUtil.a("ZipUtil", "zipFiles size: ", Integer.valueOf(collection.size()));
        ?? r1 = 0;
        String str2 = null;
        ?? r2 = 0;
        try {
            try {
                zipOutputStream = new ZipOutputStream(new BufferedOutputStream(FileUtils.openOutputStream(file), 1048576));
                try {
                    for (File file2 : collection) {
                        String name = file2.getName();
                        try {
                            str2 = new String(name.getBytes("8859_1"), "GB2312");
                        } catch (UnsupportedEncodingException e) {
                            LogUtil.e("ZipUtil", "UnsupportedEncodingException e: ", e.getMessage());
                            str2 = name;
                        }
                        if (file2.isDirectory()) {
                            File[] fileArrListFiles = file2.listFiles();
                            if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                                str2 = "fileLists is null";
                                LogUtil.d("ZipUtil", "fileLists is null");
                            } else {
                                for (File file3 : fileArrListFiles) {
                                    e(file3, zipOutputStream, str2, str);
                                }
                            }
                        } else {
                            c(zipOutputStream, file2);
                        }
                    }
                    b(zipOutputStream);
                    r1 = str2;
                } catch (IOException unused) {
                    r2 = zipOutputStream;
                    LogUtil.e("ZipUtil", "zipFiles IOException exception");
                    b(r2);
                    r1 = r2;
                } catch (Throwable th) {
                    th = th;
                    b(zipOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                zipOutputStream = r1;
            }
        } catch (IOException unused2) {
        }
    }

    private static void b(ZipOutputStream zipOutputStream) {
        if (zipOutputStream != null) {
            try {
                zipOutputStream.setComment("com.huawei.health");
                zipOutputStream.close();
            } catch (IOException unused) {
                LogUtil.e("ZipUtil", "IOException exception");
                if (zipOutputStream != null) {
                    try {
                        return;
                    } catch (IOException unused2) {
                        return;
                    }
                }
                return;
            } finally {
                if (zipOutputStream != null) {
                    try {
                        zipOutputStream.close();
                    } catch (IOException unused3) {
                        LogUtil.e("ZipUtil", "IOException exception");
                    }
                }
            }
        }
    }

    private static void c(ZipOutputStream zipOutputStream, File file) throws Throwable {
        BufferedInputStream bufferedInputStream;
        LogUtil.a("ZipUtil", "processFile start");
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
                        if (i != -1) {
                            zipOutputStream.write(bArr, 0, i);
                        } else {
                            LogUtil.a("ZipUtil", "zip ok");
                            IoUtils.c(bufferedInputStream);
                            return;
                        }
                    }
                } catch (IOException e) {
                    e = e;
                    bufferedInputStream2 = bufferedInputStream;
                    LogUtil.e("ZipUtil", "processFile IOException", e.getMessage());
                    IoUtils.c(bufferedInputStream2);
                } catch (Throwable th) {
                    th = th;
                    IoUtils.c(bufferedInputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedInputStream = null;
            }
        } catch (IOException e2) {
            e = e2;
        }
    }

    private static void e(File file, ZipOutputStream zipOutputStream, String str, String str2) throws Throwable {
        BufferedInputStream bufferedInputStream;
        LogUtil.a("ZipUtil", "zipFile");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str.trim().length() == 0 ? "" : File.separator);
        sb.append(file.getName());
        try {
            String str3 = new String(sb.toString().getBytes("8859_1"), "GB2312");
            LogUtil.a("ZipUtil", "rootPathResult: ", str3);
            if (file.isDirectory()) {
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles == null || fileArrListFiles.length <= 0) {
                    return;
                }
                d(file, zipOutputStream, str2, str3, fileArrListFiles);
                return;
            }
            BufferedInputStream bufferedInputStream2 = null;
            try {
                try {
                    byte[] bArr = new byte[1048576];
                    bufferedInputStream = new BufferedInputStream(FileUtils.openInputStream(file), 1048576);
                    try {
                        zipOutputStream.putNextEntry(new ZipEntry(str3));
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
                } catch (Throwable th2) {
                    th = th2;
                    bufferedInputStream = null;
                }
            } catch (IOException unused2) {
            }
        } catch (UnsupportedEncodingException e) {
            LogUtil.e("ZipUtil", "UnsupportedEncodingException e: ", e.getMessage());
        }
    }

    private static void d(File file, ZipOutputStream zipOutputStream, String str, String str2, File[] fileArr) throws Throwable {
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
}

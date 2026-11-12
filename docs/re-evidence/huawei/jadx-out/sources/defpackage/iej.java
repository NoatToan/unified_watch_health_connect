package defpackage;

import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.LogAnonymous;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes31.dex */
public class iej {
    public static boolean d(File file, File file2) throws IOException {
        if (c(file2)) {
            return c(file, file2);
        }
        return false;
    }

    private static boolean b(File file) {
        if (file == null) {
            return false;
        }
        try {
            String canonicalPath = file.getCanonicalPath();
            if (canonicalPath == null) {
                return false;
            }
            return canonicalPath.equals(CommonUtil.e(canonicalPath));
        } catch (IOException e) {
            LogUtil.e("Suggestion_FileMoveUtil", LogAnonymous.b(e));
            return false;
        }
    }

    public static boolean c(File file, File file2) throws Throwable {
        Throwable th;
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream2 = null;
        try {
            if (b(file) && b(file2)) {
                FileInputStream fileInputStream2 = new FileInputStream(file);
                try {
                    FileOutputStream fileOutputStream3 = new FileOutputStream(file2);
                    try {
                        byte[] bArr = new byte[2097152];
                        for (int i = fileInputStream2.read(bArr); i != -1; i = fileInputStream2.read(bArr)) {
                            fileOutputStream3.write(bArr, 0, i);
                        }
                        try {
                            fileInputStream2.close();
                        } catch (IOException e) {
                            LogUtil.e("Suggestion_FileMoveUtil", "in.close() = ", LogAnonymous.b(e));
                        }
                        try {
                            fileOutputStream3.flush();
                        } catch (IOException e2) {
                            LogUtil.e("Suggestion_FileMoveUtil", "out.flush() = ", LogAnonymous.b(e2));
                        }
                        try {
                            fileOutputStream3.close();
                            return true;
                        } catch (IOException e3) {
                            LogUtil.e("Suggestion_FileMoveUtil", "out.close() = ", LogAnonymous.b(e3));
                            return true;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream2 = fileOutputStream3;
                        fileOutputStream = fileOutputStream2;
                        fileInputStream = fileInputStream2;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException e4) {
                                LogUtil.e("Suggestion_FileMoveUtil", "in.close() = ", LogAnonymous.b(e4));
                            }
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.flush();
                            } catch (IOException e5) {
                                LogUtil.e("Suggestion_FileMoveUtil", "out.flush() = ", LogAnonymous.b(e5));
                            }
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                                throw th;
                            } catch (IOException e6) {
                                LogUtil.e("Suggestion_FileMoveUtil", "out.close() = ", LogAnonymous.b(e6));
                                throw th;
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            return false;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
        }
    }

    private static boolean c(File file) {
        boolean zExists = false;
        if (file != null) {
            return (file.getParentFile() == null || (zExists = file.getParentFile().exists())) ? zExists : file.getParentFile().mkdirs();
        }
        LogUtil.e("Suggestion_FileMoveUtil", "isFileExist, file is null");
        return false;
    }
}

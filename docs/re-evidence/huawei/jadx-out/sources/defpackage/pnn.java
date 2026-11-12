package defpackage;

import com.huawei.android.hicloud.sync.util.FileUtil;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.LogAnonymous;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import org.apache.commons.io.FileUtils;

/* JADX INFO: loaded from: classes15.dex */
public class pnn {
    public static String a(String str) throws Throwable {
        String strC = CommonUtil.c(str);
        if (strC == null) {
            LogUtil.e(FileUtil.TAG, "read file fail: path is empty");
            return "";
        }
        FileInputStream fileInputStream = null;
        try {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(new File(strC));
                try {
                    byte[] bArr = new byte[fileInputStream2.available()];
                    String str2 = fileInputStream2.read(bArr) > 0 ? new String(bArr, "UTF-8") : "";
                    d(fileInputStream2);
                    return str2;
                } catch (FileNotFoundException e) {
                    e = e;
                    fileInputStream = fileInputStream2;
                    LogUtil.e(FileUtil.TAG, "file path is not exist.", LogAnonymous.b(e));
                    d(fileInputStream);
                    return "";
                } catch (IOException e2) {
                    e = e2;
                    fileInputStream = fileInputStream2;
                    LogUtil.e(FileUtil.TAG, "io error.", LogAnonymous.b(e));
                    d(fileInputStream);
                    return "";
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    d(fileInputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (FileNotFoundException e3) {
            e = e3;
        } catch (IOException e4) {
            e = e4;
        }
    }

    public static boolean d(String str, String str2) {
        String strC = CommonUtil.c(str);
        if (strC == null) {
            LogUtil.e(FileUtil.TAG, "write file fail: path is empty");
            return false;
        }
        File file = new File(strC);
        if (file.getParentFile() != null && !file.getParentFile().exists()) {
            boolean zMkdirs = file.getParentFile().mkdirs();
            LogUtil.d(FileUtil.TAG, "create directory result:", Boolean.valueOf(zMkdirs));
            if (!zMkdirs) {
                return false;
            }
        }
        FileOutputStream fileOutputStreamOpenOutputStream = null;
        try {
            fileOutputStreamOpenOutputStream = FileUtils.openOutputStream(file);
            fileOutputStreamOpenOutputStream.write(str2.getBytes(StandardCharsets.UTF_8));
            return true;
        } catch (IOException e) {
            LogUtil.e(FileUtil.TAG, "io error.", LogAnonymous.b(e));
            return false;
        } finally {
            d(fileOutputStreamOpenOutputStream);
        }
    }

    private static void d(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                LogUtil.e(FileUtil.TAG, "close stream error.", LogAnonymous.b(e));
            }
        }
    }

    public static boolean b(String str) {
        if (CommonUtil.c(str) == null) {
            LogUtil.e(FileUtil.TAG, "delete file fail: path is empty");
            return false;
        }
        File file = new File(str);
        if (!file.isFile() || !file.exists() || file.delete()) {
            return true;
        }
        LogUtil.e(FileUtil.TAG, "delete file fail");
        return false;
    }

    public static boolean c(String str) {
        if (CommonUtil.c(str) == null) {
            LogUtil.e(FileUtil.TAG, "delete file fail: path is empty");
            return false;
        }
        File file = new File(str);
        return file.isFile() && file.exists();
    }
}

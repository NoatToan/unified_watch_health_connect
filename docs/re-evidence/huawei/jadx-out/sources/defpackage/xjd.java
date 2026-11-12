package defpackage;

import com.huawei.health.h5pro.utils.GeneralUtil;
import com.huawei.hwlogsmodel.LogUtil;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.CheckedOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* JADX INFO: loaded from: classes20.dex */
public class xjd {
    private File d;

    public xjd(String str) {
        if (!GeneralUtil.isSafePath(str)) {
            LogUtil.j("ZipCompressor", "ZipCompressor: untrusted -> " + str);
            return;
        }
        this.d = new File(str);
    }

    private void b(ZipOutputStream zipOutputStream) {
        if (zipOutputStream != null) {
            try {
                zipOutputStream.close();
            } catch (IOException unused) {
                LogUtil.e("ZipCompressor", "close streamClose error");
            }
        }
    }

    public boolean b(String... strArr) throws Throwable {
        ZipOutputStream zipOutputStream;
        if (this.d == null) {
            LogUtil.j("ZipCompressor", "compress: mZipFile is null");
            return false;
        }
        ZipOutputStream zipOutputStream2 = null;
        try {
            try {
                zipOutputStream = new ZipOutputStream(new CheckedOutputStream(new FileOutputStream(this.d), new CRC32()));
                try {
                    for (String str : strArr) {
                        if (GeneralUtil.isSafePath(str)) {
                            a(new File(str), zipOutputStream, "");
                        } else {
                            LogUtil.j("ZipCompressor", "compress: untrusted -> " + str);
                        }
                    }
                    b(zipOutputStream);
                    return true;
                } catch (IOException unused) {
                    zipOutputStream2 = zipOutputStream;
                    LogUtil.e("ZipCompressor", "close ZipOutputStream error IOException！");
                    b(zipOutputStream2);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    b(zipOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                zipOutputStream = zipOutputStream2;
            }
        } catch (IOException unused2) {
        }
    }

    private boolean a(File file, ZipOutputStream zipOutputStream, String str) {
        if (file.isDirectory()) {
            LogUtil.a("ZipCompressor", "zip directory：" + str + file.getName());
            return c(file, zipOutputStream, str);
        }
        LogUtil.a("ZipCompressor", "zip file：" + str + file.getName());
        return d(file, zipOutputStream, str);
    }

    private boolean c(File file, ZipOutputStream zipOutputStream, String str) {
        File[] fileArrListFiles;
        if (!file.exists() || (fileArrListFiles = file.listFiles()) == null) {
            return false;
        }
        for (File file2 : fileArrListFiles) {
            if (!a(file2, zipOutputStream, str + file.getName() + File.separator)) {
                return false;
            }
        }
        return true;
    }

    private boolean d(File file, ZipOutputStream zipOutputStream, String str) throws Throwable {
        BufferedInputStream bufferedInputStream;
        if (!file.exists()) {
            return false;
        }
        BufferedInputStream bufferedInputStream2 = null;
        try {
            try {
                bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                try {
                    zipOutputStream.putNextEntry(new ZipEntry(str + file.getName()));
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int i = bufferedInputStream.read(bArr, 0, 4096);
                        if (i != -1) {
                            zipOutputStream.write(bArr, 0, i);
                        } else {
                            d(bufferedInputStream);
                            return true;
                        }
                    }
                } catch (IOException unused) {
                    bufferedInputStream2 = bufferedInputStream;
                    LogUtil.e("ZipCompressor", "compressFile error IOException！");
                    d(bufferedInputStream2);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    d(bufferedInputStream);
                    throw th;
                }
            } catch (IOException unused2) {
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedInputStream = bufferedInputStream2;
        }
    }

    private void d(BufferedInputStream bufferedInputStream) {
        if (bufferedInputStream != null) {
            try {
                bufferedInputStream.close();
            } catch (IOException unused) {
                LogUtil.e("ZipCompressor", "fileInputStreamClose close error ");
            }
        }
    }
}

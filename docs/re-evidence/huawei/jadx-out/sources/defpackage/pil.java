package defpackage;

import android.text.TextUtils;
import android.util.Base64;
import com.huawei.haf.common.os.FileUtils;
import com.huawei.haf.common.security.SecurityUtils;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.IoUtils;
import health.compact.a.WhiteBoxManager;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public class pil {
    private static byte[] a(int i) {
        byte[] bArr = new byte[i];
        b().nextBytes(bArr);
        return bArr;
    }

    public static SecureRandom b() {
        try {
            return SecureRandom.getInstanceStrong();
        } catch (NoSuchAlgorithmException e) {
            LogUtil.e("EzPlugin_EzFileHelper", "getSecureRandom exception ", e);
            return new SecureRandom();
        }
    }

    private static String d() {
        WhiteBoxManager whiteBoxManagerB = WhiteBoxManager.b();
        return new String(whiteBoxManagerB.a(Base64.decode(whiteBoxManagerB.a(1, 6) + whiteBoxManagerB.a(1, 1006) + whiteBoxManagerB.a(1, 2006), 0)), StandardCharsets.UTF_8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.io.Closeable, java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v9 */
    public static boolean c(String str, String str2) throws Throwable {
        Closeable closeable;
        ?? r0;
        FileInputStream fileInputStream;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.j("EzPlugin_EzFileHelper", "decryptFile param is empty.");
            return false;
        }
        ?? file = new File(str);
        File file2 = new File(str2);
        if (file.exists() && file.isFile()) {
            Closeable closeable2 = null;
            try {
                try {
                    e(file2, true, false);
                    fileInputStream = new FileInputStream((File) file);
                    try {
                        file = new FileOutputStream(file2);
                        try {
                            CipherInputStream cipherInputStream = new CipherInputStream(fileInputStream, c());
                            try {
                                byte[] bArr = new byte[4096];
                                int i = 0;
                                for (int i2 = cipherInputStream.read(bArr); i2 != -1; i2 = cipherInputStream.read(bArr)) {
                                    i += i2;
                                    if (i > 524288000) {
                                        LogUtil.e("EzPlugin_EzFileHelper", "decryptFile sourceFile too big, so decrypt failure.");
                                        IoUtils.c(fileInputStream);
                                        IoUtils.c(file);
                                        IoUtils.c(cipherInputStream);
                                        return false;
                                    }
                                    file.write(bArr, 0, i2);
                                    file.flush();
                                }
                                LogUtil.a("EzPlugin_EzFileHelper", "decryptFile decrypt is accomplished.");
                                IoUtils.c(fileInputStream);
                                IoUtils.c(file);
                                IoUtils.c(cipherInputStream);
                                return true;
                            } catch (IOException e) {
                                e = e;
                                closeable2 = cipherInputStream;
                                LogUtil.e("EzPlugin_EzFileHelper", "decryptFile Exception ", e.getClass().getName());
                                IoUtils.c(fileInputStream);
                                IoUtils.c(file);
                                IoUtils.c(closeable2);
                                return false;
                            } catch (SecurityException e2) {
                                e = e2;
                                closeable2 = cipherInputStream;
                                LogUtil.e("EzPlugin_EzFileHelper", "decryptFile Exception ", e.getClass().getName());
                                IoUtils.c(fileInputStream);
                                IoUtils.c(file);
                                IoUtils.c(closeable2);
                                return false;
                            } catch (GeneralSecurityException e3) {
                                e = e3;
                                closeable2 = cipherInputStream;
                                LogUtil.e("EzPlugin_EzFileHelper", "decryptFile Exception ", e.getClass().getName());
                                IoUtils.c(fileInputStream);
                                IoUtils.c(file);
                                IoUtils.c(closeable2);
                                return false;
                            } catch (Throwable th) {
                                th = th;
                                closeable2 = cipherInputStream;
                                closeable = closeable2;
                                closeable2 = fileInputStream;
                                r0 = file;
                                IoUtils.c(closeable2);
                                IoUtils.c(r0);
                                IoUtils.c(closeable);
                                throw th;
                            }
                        } catch (IOException e4) {
                            e = e4;
                        } catch (SecurityException e5) {
                            e = e5;
                        } catch (GeneralSecurityException e6) {
                            e = e6;
                        }
                    } catch (IOException e7) {
                        e = e7;
                        file = 0;
                        LogUtil.e("EzPlugin_EzFileHelper", "decryptFile Exception ", e.getClass().getName());
                        IoUtils.c(fileInputStream);
                        IoUtils.c(file);
                        IoUtils.c(closeable2);
                        return false;
                    } catch (SecurityException e8) {
                        e = e8;
                        file = 0;
                        LogUtil.e("EzPlugin_EzFileHelper", "decryptFile Exception ", e.getClass().getName());
                        IoUtils.c(fileInputStream);
                        IoUtils.c(file);
                        IoUtils.c(closeable2);
                        return false;
                    } catch (GeneralSecurityException e9) {
                        e = e9;
                        file = 0;
                        LogUtil.e("EzPlugin_EzFileHelper", "decryptFile Exception ", e.getClass().getName());
                        IoUtils.c(fileInputStream);
                        IoUtils.c(file);
                        IoUtils.c(closeable2);
                        return false;
                    } catch (Throwable th2) {
                        th = th2;
                        file = 0;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (IOException e10) {
                e = e10;
                file = 0;
                fileInputStream = null;
                LogUtil.e("EzPlugin_EzFileHelper", "decryptFile Exception ", e.getClass().getName());
                IoUtils.c(fileInputStream);
                IoUtils.c(file);
                IoUtils.c(closeable2);
                return false;
            } catch (SecurityException e11) {
                e = e11;
                file = 0;
                fileInputStream = null;
                LogUtil.e("EzPlugin_EzFileHelper", "decryptFile Exception ", e.getClass().getName());
                IoUtils.c(fileInputStream);
                IoUtils.c(file);
                IoUtils.c(closeable2);
                return false;
            } catch (GeneralSecurityException e12) {
                e = e12;
                file = 0;
                fileInputStream = null;
                LogUtil.e("EzPlugin_EzFileHelper", "decryptFile Exception ", e.getClass().getName());
                IoUtils.c(fileInputStream);
                IoUtils.c(file);
                IoUtils.c(closeable2);
                return false;
            } catch (Throwable th4) {
                th = th4;
                closeable = null;
                r0 = 0;
                IoUtils.c(closeable2);
                IoUtils.c(r0);
                IoUtils.c(closeable);
                throw th;
            }
        }
        return false;
    }

    private static void e(File file, boolean z, boolean z2) throws IOException, SecurityException {
        if (z && file.isDirectory()) {
            LogUtil.a("EzPlugin_EzFileHelper", "initializeDestFile deleteDestFile as isDeleteFile :", Boolean.valueOf(file.delete()));
        }
        if (z2 && file.exists()) {
            LogUtil.a("EzPlugin_EzFileHelper", "initializeDestFile deleteDestFile isDeleteFile :", Boolean.valueOf(file.delete()));
        }
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists()) {
            LogUtil.a("EzPlugin_EzFileHelper", "initializeDestFile isMkdirFile :", Boolean.valueOf(parentFile.mkdirs()));
        }
        if (file.isFile()) {
            return;
        }
        LogUtil.d("EzPlugin_EzFileHelper", "initializeDestFile isCreateNewFile :", Boolean.valueOf(file.createNewFile()));
    }

    private static Cipher c() throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, UnsupportedEncodingException, InvalidAlgorithmParameterException {
        SecureRandom instanceStrong = SecureRandom.getInstanceStrong();
        instanceStrong.setSeed(SecurityUtils.a(d()));
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(256, instanceStrong);
        SecretKeySpec secretKeySpec = new SecretKeySpec(keyGenerator.generateKey().getEncoded(), "AES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(a(16));
        Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
        cipher.init(2, secretKeySpec, ivParameterSpec);
        return cipher;
    }

    public static int e(String str, String str2) throws Throwable {
        ZipInputStream zipInputStream;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.j("EzPlugin_EzFileHelper", "unzip filename or destDirectory is empty.");
            return -1;
        }
        LogUtil.a("EzPlugin_EzFileHelper", "unzip filename :", str, ", destDir :", str2);
        String strC = CommonUtil.c(str);
        if (TextUtils.isEmpty(strC)) {
            LogUtil.j("EzPlugin_EzFileHelper", "unzip safeFilePath is empty.");
            return -1;
        }
        ZipInputStream zipInputStream2 = null;
        try {
            try {
                zipInputStream = new ZipInputStream(new FileInputStream(strC));
                try {
                    int iB = b(zipInputStream, str2, null, true);
                    IoUtils.c(zipInputStream);
                    return iB;
                } catch (IOException unused) {
                    zipInputStream2 = zipInputStream;
                    LogUtil.e("EzPlugin_EzFileHelper", "unzip IOException.");
                    a(strC);
                    IoUtils.c(zipInputStream2);
                    return -1;
                } catch (Throwable th) {
                    th = th;
                    IoUtils.c(zipInputStream);
                    throw th;
                }
            } catch (IOException unused2) {
            }
        } catch (Throwable th2) {
            th = th2;
            zipInputStream = zipInputStream2;
        }
    }

    private static int b(ZipInputStream zipInputStream, String str, String str2, boolean z) throws IOException {
        if (zipInputStream == null || TextUtils.isEmpty(str)) {
            LogUtil.j("EzPlugin_EzFileHelper", "unzip zipInputStream or destDirectory is empty.");
            return -1;
        }
        File fileD = d(str);
        boolean zIsEmpty = TextUtils.isEmpty(str2);
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            byte[] bArr = new byte[4096];
            int i = 0;
            int iD = 0;
            while (nextEntry != null) {
                if (!zIsEmpty && !str2.equals(nextEntry.getName())) {
                    nextEntry = zipInputStream.getNextEntry();
                } else {
                    File fileD2 = d(nextEntry, fileD);
                    if (nextEntry.isDirectory()) {
                        LogUtil.d("EzPlugin_EzFileHelper", "unzip zipEntry isDirectoryMade :", Boolean.valueOf(fileD2.mkdirs()));
                        nextEntry = zipInputStream.getNextEntry();
                    } else {
                        e(fileD2, false, true);
                        iD = d(fileD2, zipInputStream, iD, bArr);
                        if (iD > 104857600) {
                            LogUtil.e("EzPlugin_EzFileHelper", "unzip this zip file too big, unzip failure.");
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
            LogUtil.a("EzPlugin_EzFileHelper", "unzip accomplished amount:", Integer.valueOf(i));
            return i;
        } catch (IOException e) {
            if (z) {
                a(!zIsEmpty, null, fileD);
            }
            throw e;
        }
    }

    private static void a(String str) {
        File file = new File(str);
        if (file.exists()) {
            LogUtil.a("EzPlugin_EzFileHelper", "deleteUnzipSourceFile zipFile:", Boolean.valueOf(file.delete()));
        }
    }

    private static void a(boolean z, File file, File file2) {
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

    private static File d(String str) throws IOException {
        String strC = CommonUtil.c(str);
        if (TextUtils.isEmpty(strC)) {
            LogUtil.j("EzPlugin_EzFileHelper", "unzip dest dir path is empty.");
            throw new IOException("unzip this dest dir path is illegal.");
        }
        return new File(strC);
    }

    private static File d(ZipEntry zipEntry, File file) throws IOException {
        String strB = b(zipEntry.getName(), file);
        LogUtil.d("EzPlugin_EzFileHelper", "getExtractFile:", strB);
        String strC = CommonUtil.c(strB);
        if (TextUtils.isEmpty(strC)) {
            LogUtil.j("EzPlugin_EzFileHelper", "unzip this zip file dest path is illegal, unzip failure.");
            throw new IOException("unzip this zip file dest path is illegal.");
        }
        return new File(strC);
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
                    LogUtil.e("EzPlugin_EzFileHelper", "unzipSingleFile IOException.");
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

    private static String b(String str, File file) throws IOException {
        String canonicalPath = new File(file, str).getCanonicalPath();
        if (canonicalPath.startsWith(file.getCanonicalPath())) {
            return canonicalPath;
        }
        throw new IOException("File is outside extraction target directory.");
    }

    public static void d(String str, String str2, String str3) {
        File file = new File(str2);
        if (!file.exists()) {
            boolean zMkdirs = file.mkdirs();
            LogUtil.d("EzPlugin_EzFileHelper", "zip mkdirs isResult :", Boolean.valueOf(zMkdirs));
            if (!zMkdirs && !file.exists()) {
                LogUtil.j("EzPlugin_EzFileHelper", "file mkdirs error");
                return;
            }
        }
        String strC = CommonUtil.c(str);
        if (TextUtils.isEmpty(strC)) {
            LogUtil.j("EzPlugin_EzFileHelper", "zip safePath is empty.");
            return;
        }
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(file + File.separator + str3));
            try {
                File file2 = new File(strC);
                if (file2.isFile()) {
                    b(zipOutputStream, file2, "");
                } else {
                    File[] fileArrListFiles = file2.listFiles();
                    if (fileArrListFiles != null) {
                        for (File file3 : fileArrListFiles) {
                            b(zipOutputStream, file3, "");
                        }
                    }
                }
                zipOutputStream.close();
            } catch (Throwable th) {
                try {
                    zipOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
            LogUtil.e("EzPlugin_EzFileHelper", "zip occur IOException.");
        }
    }

    private static void b(ZipOutputStream zipOutputStream, File file, String str) throws Throwable {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        try {
            try {
                if (!file.isDirectory()) {
                    String strC = CommonUtil.c(file.getCanonicalPath());
                    if (TextUtils.isEmpty(strC)) {
                        LogUtil.j("EzPlugin_EzFileHelper", "zipFileOrDirectory safePath is empty.");
                        IoUtils.c(null);
                        return;
                    }
                    fileInputStream = new FileInputStream(strC);
                    try {
                        try {
                            zipOutputStream.putNextEntry(new ZipEntry(str + file.getName()));
                        } catch (NullPointerException unused) {
                            LogUtil.e("EzPlugin_EzFileHelper", "putNextEntry occur NullPointerException.");
                        }
                        byte[] bArr = new byte[4096];
                        for (int i = fileInputStream.read(bArr); i != -1; i = fileInputStream.read(bArr)) {
                            zipOutputStream.write(bArr, 0, i);
                        }
                        zipOutputStream.closeEntry();
                        fileInputStream2 = fileInputStream;
                    } catch (IOException unused2) {
                        fileInputStream2 = fileInputStream;
                        LogUtil.e("EzPlugin_EzFileHelper", "zipFileOrDirectory occur IOException.");
                    } catch (Throwable th) {
                        th = th;
                        IoUtils.c(fileInputStream);
                        throw th;
                    }
                } else {
                    File[] fileArrListFiles = file.listFiles();
                    if (fileArrListFiles != null) {
                        for (File file2 : fileArrListFiles) {
                            b(zipOutputStream, file2, str + file.getName() + File.separator);
                        }
                    }
                }
            } catch (IOException unused3) {
            }
            IoUtils.c(fileInputStream2);
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
        }
    }
}

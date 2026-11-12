package defpackage;

import android.text.TextUtils;
import com.xiaomi.smarthome.library.crypto.rc4coder.Coder;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes2.dex */
public class wwr {
    public static String a(byte b2) {
        int i = (b2 & 127) + (b2 < 0 ? 128 : 0);
        StringBuilder sb = new StringBuilder();
        sb.append(i < 16 ? "0" : "");
        sb.append(Integer.toHexString(i).toLowerCase());
        return sb.toString();
    }

    public static File b(String str) throws IOException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file = new File(str);
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists()) {
            parentFile.mkdirs();
        }
        try {
            if (file.exists()) {
                file.delete();
            }
            file.createNewFile();
            return file;
        } catch (IOException e) {
            zxr.b("YRN_YRNV3_SDK", "YRNFileUtils.createFile: failed:" + str + "," + e.toString());
            throw e;
        }
    }

    public static boolean c(File file) {
        return file != null && (!file.exists() ? !file.mkdirs() : !file.isDirectory());
    }

    public static boolean d(String str) {
        return c(g(str));
    }

    public static void e(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        File file = new File(str);
        if (file.exists()) {
            if (file.isDirectory()) {
                for (File file2 : file.listFiles()) {
                    if (file2 != null && file2.exists()) {
                        e(file2.getAbsolutePath());
                    }
                }
            }
            file.delete();
        }
    }

    public static String f(File file) throws Throwable {
        FileInputStream fileInputStream;
        long jNanoTime = System.nanoTime();
        DigestInputStream digestInputStream = null;
        try {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(Coder.KEY_MD5);
                fileInputStream = new FileInputStream(file);
                try {
                    DigestInputStream digestInputStream2 = new DigestInputStream(fileInputStream, messageDigest);
                    try {
                        while (digestInputStream2.read(new byte[262144]) > 0) {
                        }
                        byte[] bArrDigest = digestInputStream2.getMessageDigest().digest();
                        StringBuilder sb = new StringBuilder();
                        for (byte b2 : bArrDigest) {
                            sb.append(a(b2));
                        }
                        zxr.a("YRN_YRNV3_SDK", "YRNFileUtils.fileMD5:spend " + (System.nanoTime() - jNanoTime) + "ns");
                        String string = sb.toString();
                        bxr.a(digestInputStream2);
                        bxr.a(fileInputStream);
                        return string;
                    } catch (IOException e) {
                        e = e;
                        digestInputStream = digestInputStream2;
                        e.printStackTrace();
                        bxr.a(digestInputStream);
                        bxr.a(fileInputStream);
                        return "";
                    } catch (NoSuchAlgorithmException e2) {
                        e = e2;
                        digestInputStream = digestInputStream2;
                        e.printStackTrace();
                        bxr.a(digestInputStream);
                        bxr.a(fileInputStream);
                        return "";
                    } catch (Throwable th) {
                        th = th;
                        digestInputStream = digestInputStream2;
                        bxr.a(digestInputStream);
                        bxr.a(fileInputStream);
                        throw th;
                    }
                } catch (IOException e3) {
                    e = e3;
                } catch (NoSuchAlgorithmException e4) {
                    e = e4;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e5) {
            e = e5;
            fileInputStream = null;
            e.printStackTrace();
            bxr.a(digestInputStream);
            bxr.a(fileInputStream);
            return "";
        } catch (NoSuchAlgorithmException e6) {
            e = e6;
            fileInputStream = null;
            e.printStackTrace();
            bxr.a(digestInputStream);
            bxr.a(fileInputStream);
            return "";
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = null;
        }
    }

    public static File g(String str) {
        if (i(str)) {
            return null;
        }
        return new File(str);
    }

    public static boolean h(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            return new File(str).exists();
        } catch (Exception e) {
            e.printStackTrace();
            zxr.b("YRN_YRNV3_SDK", "YRNFileUtils.isFileExist:filePath: " + str + ",Error:" + e.toString());
            return false;
        }
    }

    public static boolean i(String str) {
        if (str == null) {
            return true;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isWhitespace(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static void j(String str) {
        try {
            File file = new File(str);
            if (file.exists()) {
                return;
            }
            file.mkdir();
        } catch (Exception e) {
            zxr.b("YRN_YRNV3_SDK", "YRNFileUtils.makeDirectory:生成文件夹错误: " + e.toString());
        }
    }

    public static File k(String str, String str2) {
        j(str);
        File file = null;
        try {
            File file2 = new File(str + str2);
            try {
                if (file2.exists()) {
                    return file2;
                }
                file2.createNewFile();
                return file2;
            } catch (IOException e) {
                e = e;
                file = file2;
                zxr.b("YRN_YRNV3_SDK", "YRNFileUtils.makeFile:生成文件错误: " + e.toString());
                return file;
            }
        } catch (IOException e2) {
            e = e2;
        }
    }

    public static boolean l(File file, File file2) throws Throwable {
        b0p b0pVar = null;
        try {
            try {
                b0p b0pVar2 = new b0p(new FileInputStream(file));
                while (true) {
                    try {
                        a0p a0pVarP = b0pVar2.p();
                        if (a0pVarP == null) {
                            bxr.a(b0pVar2);
                            file.delete();
                            return true;
                        }
                        File file3 = new File(file2, a0pVarP.f());
                        if (a0pVarP.h()) {
                            file3.mkdirs();
                        } else {
                            file3.createNewFile();
                            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file3));
                            bxr.b(b0pVar2, bufferedOutputStream);
                            bufferedOutputStream.flush();
                            bxr.a(bufferedOutputStream);
                        }
                    } catch (Exception e) {
                        e = e;
                        b0pVar = b0pVar2;
                        zxr.b("YRN_YRNV3_SDK", "YRNFileUtils.unTarFile: error" + e.getMessage());
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        b0pVar = b0pVar2;
                        bxr.a(b0pVar);
                        file.delete();
                        throw th;
                    }
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static boolean m(File file, File file2) throws Throwable {
        ZipFile zipFile = null;
        try {
            try {
                ZipFile zipFile2 = new ZipFile(file);
                try {
                    Enumeration<? extends ZipEntry> enumerationEntries = zipFile2.entries();
                    while (enumerationEntries.hasMoreElements()) {
                        ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                        File file3 = new File(file2, zipEntryNextElement.getName());
                        if (zipEntryNextElement.isDirectory()) {
                            file3.mkdirs();
                        } else {
                            file3.getParentFile().mkdirs();
                            InputStream inputStream = zipFile2.getInputStream(zipEntryNextElement);
                            FileOutputStream fileOutputStream = new FileOutputStream(file3);
                            bxr.b(inputStream, fileOutputStream);
                            bxr.a(inputStream);
                            bxr.a(fileOutputStream);
                        }
                    }
                    bxr.a(zipFile2);
                    return true;
                } catch (IOException e) {
                    e = e;
                    zipFile = zipFile2;
                    zxr.b("YRN_YRNV3_SDK", "YRNFileUtils.unZipFile: failed:" + e.getMessage());
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    zipFile = zipFile2;
                    bxr.a(zipFile);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static boolean n(File file, File file2) throws Throwable {
        File file3;
        zxr.a("YRN_YRNV3_SDK", "YRNFileUtils.unpack: " + file.getAbsolutePath());
        boolean zM = m(file, file2);
        if (zM) {
            file.delete();
        }
        File[] fileArrListFiles = file2.listFiles();
        if (fileArrListFiles != null && fileArrListFiles.length > 0) {
            int length = fileArrListFiles.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    file3 = null;
                    break;
                }
                file3 = fileArrListFiles[i];
                if (file3.getAbsolutePath().endsWith(".tar")) {
                    break;
                }
                i++;
            }
        } else {
            file3 = null;
            break;
        }
        if (zM && file3 != null) {
            zM = l(file3, file2);
        }
        zxr.a("YRN_YRNV3_SDK", "YRNFileUtils.unpack:success? " + zM + "\n" + file.getAbsolutePath());
        return zM;
    }

    public static void o(String str, String str2, String str3) {
        k(str2, str3);
        String str4 = str2 + str3;
        String str5 = str + "\r\n";
        try {
            File file = new File(str4);
            if (!file.exists()) {
                zxr.a("YRN_YRNV3_SDK", "YRNFileUtils.writeTxtToFile: " + str4);
                file.getParentFile().mkdirs();
                file.createNewFile();
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rwd");
            randomAccessFile.seek(file.length());
            randomAccessFile.write(str5.getBytes());
            randomAccessFile.close();
        } catch (IOException e) {
            zxr.b("YRN_YRNV3_SDK", "YRNFileUtils.writeTxtToFile:写入错误: " + e.toString());
        }
    }
}

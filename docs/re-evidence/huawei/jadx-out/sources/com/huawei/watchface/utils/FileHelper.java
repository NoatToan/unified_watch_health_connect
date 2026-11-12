package com.huawei.watchface.utils;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import androidx.core.content.FileProvider;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.constant.WatchFaceConstant;
import com.huawei.operation.utils.Constants;
import com.huawei.secure.android.common.encrypt.hash.FileSHA256;
import com.huawei.secure.android.common.util.FileUtil;
import com.huawei.watchface.c0;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.flavor.FlavorConfig;
import com.huawei.watchface.g0;
import com.huawei.watchface.mvp.model.crypt.PversionSdUtils;
import com.huawei.watchface.mvp.model.datatype.ShareModel;
import com.huawei.watchface.s;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes20.dex */
public class FileHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f30602a;

    public static void a(File file, boolean z, boolean z2) throws IOException {
        if (z && file.isDirectory()) {
            HwLog.i("FileHelper", "initializeDestFile deleteDestFile as isDeleteFile :" + file.delete());
        }
        if (z2 && file.exists()) {
            HwLog.i("FileHelper", "initializeDestFile deleteDestFile isDeleteFile :" + file.delete());
        }
        if (file.getParentFile() != null && !file.getParentFile().exists()) {
            HwLog.i("FileHelper", "initializeDestFile isMkdirFile :" + file.getParentFile().mkdirs());
        }
        if (file.isFile()) {
            return;
        }
        boolean zCreateNewFile = file.createNewFile();
        HwSfpPolicyManagerHelper.setDefaultCeLabel(file);
        HwLog.i("FileHelper", "initializeDestFile isCreateNewFile :" + zCreateNewFile);
    }

    public static int b(String str, String str2) throws Throwable {
        ZipInputStream zipInputStream;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            HwLog.w("FileHelper", "unzip filename or destDirectory is empty.");
            return -1;
        }
        String strFilterFilePath = CommonUtils.filterFilePath(str);
        if (TextUtils.isEmpty(strFilterFilePath)) {
            HwLog.w("FileHelper", "unzip safeFilePath is empty.");
            return -1;
        }
        ZipInputStream zipInputStream2 = null;
        try {
            try {
                zipInputStream = new ZipInputStream(new FileInputStream(strFilterFilePath));
                try {
                    int iA = a(zipInputStream, str2, (String) null, true);
                    a(zipInputStream);
                    return iA;
                } catch (IOException unused) {
                    zipInputStream2 = zipInputStream;
                    HwLog.e("FileHelper", "unzip IOException.");
                    c(strFilterFilePath);
                    a(zipInputStream2);
                    return -1;
                } catch (Throwable th) {
                    th = th;
                    a(zipInputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                zipInputStream = zipInputStream2;
            }
        } catch (IOException unused2) {
        }
    }

    public static void c(String str) {
        File file = new File(str);
        if (file.exists()) {
            HwLog.i("FileHelper", "deleteUnzipSourceFile zipFile:" + file.delete());
        }
    }

    public static void copyFileToParsingDir(String str, String str2) throws Throwable {
        Throwable th;
        FileOutputStream fileOutputStream;
        IOException e;
        FileNotFoundException e2;
        FileInputStream fileInputStream;
        IOException e3;
        FileNotFoundException e4;
        String strFilterFilePath = CommonUtils.filterFilePath(str);
        String strFilterFilePath2 = CommonUtils.filterFilePath(str2);
        if (TextUtils.isEmpty(strFilterFilePath)) {
            HwLog.w("FileHelper", "copyFileToParsingDirectory oldWatchFacePackagePath is empty.");
            return;
        }
        if (TextUtils.isEmpty(strFilterFilePath2)) {
            HwLog.w("FileHelper", "copyFileToParsingDirectory newWatchFacePackagePath is empty.");
            return;
        }
        FileOutputStream fileOutputStream2 = null;
        fileOutputStream2 = null;
        fileOutputStream2 = null;
        FileOutputStream fileOutputStream3 = null;
        fileOutputStream2 = null;
        FileInputStream fileInputStream2 = null;
        FileInputStream fileInputStream3 = null;
        FileInputStream fileInputStream4 = null;
        try {
            try {
                if (new File(strFilterFilePath).exists()) {
                    fileInputStream = new FileInputStream(strFilterFilePath);
                    try {
                        fileOutputStream = new FileOutputStream(strFilterFilePath2);
                        try {
                            byte[] bArr = new byte[2048];
                            for (int i = fileInputStream.read(bArr); i != -1; i = fileInputStream.read(bArr)) {
                                fileOutputStream.write(bArr, 0, i);
                            }
                            fileOutputStream2 = fileOutputStream;
                        } catch (FileNotFoundException e5) {
                            e2 = e5;
                            fileOutputStream2 = fileOutputStream;
                            e4 = e2;
                            HwLog.e("FileHelper", "copyFileToParsingDir FileNotFoundException." + HwLog.printException((Exception) e4));
                        } catch (IOException e6) {
                            e = e6;
                            fileOutputStream2 = fileOutputStream;
                            e3 = e;
                            HwLog.e("FileHelper", "copyFileToParsingDir IOException." + HwLog.printException((Exception) e3));
                        } catch (Throwable th2) {
                            th = th2;
                            fileOutputStream3 = fileOutputStream;
                            a(fileInputStream);
                            a(fileOutputStream3);
                            throw th;
                        }
                    } catch (FileNotFoundException e7) {
                        e4 = e7;
                        HwLog.e("FileHelper", "copyFileToParsingDir FileNotFoundException." + HwLog.printException((Exception) e4));
                    } catch (IOException e8) {
                        e3 = e8;
                        HwLog.e("FileHelper", "copyFileToParsingDir IOException." + HwLog.printException((Exception) e3));
                    } catch (Throwable th3) {
                        th = th3;
                        a(fileInputStream);
                        a(fileOutputStream3);
                        throw th;
                    }
                } else {
                    fileInputStream = null;
                }
                try {
                    HwSfpPolicyManagerHelper.setDefaultCeLabel(strFilterFilePath2);
                } catch (FileNotFoundException e9) {
                    e2 = e9;
                    fileOutputStream = fileOutputStream2;
                    fileInputStream2 = fileInputStream;
                    fileInputStream = fileInputStream2;
                    fileOutputStream2 = fileOutputStream;
                    e4 = e2;
                    HwLog.e("FileHelper", "copyFileToParsingDir FileNotFoundException." + HwLog.printException((Exception) e4));
                } catch (IOException e10) {
                    e = e10;
                    fileOutputStream = fileOutputStream2;
                    fileInputStream3 = fileInputStream;
                    fileInputStream = fileInputStream3;
                    fileOutputStream2 = fileOutputStream;
                    e3 = e;
                    HwLog.e("FileHelper", "copyFileToParsingDir IOException." + HwLog.printException((Exception) e3));
                }
            } catch (Throwable th4) {
                th = th4;
                fileOutputStream = fileOutputStream2;
                fileInputStream4 = fileInputStream;
                fileInputStream = fileInputStream4;
                fileOutputStream3 = fileOutputStream;
                a(fileInputStream);
                a(fileOutputStream3);
                throw th;
            }
        } catch (FileNotFoundException e11) {
            e2 = e11;
            fileOutputStream = null;
        } catch (IOException e12) {
            e = e12;
            fileOutputStream = null;
        } catch (Throwable th5) {
            th = th5;
            fileOutputStream = null;
            fileInputStream = fileInputStream4;
            fileOutputStream3 = fileOutputStream;
            a(fileInputStream);
            a(fileOutputStream3);
            throw th;
        }
        a(fileInputStream);
        a(fileOutputStream2);
    }

    public static String d(String str) {
        String canonicalPath;
        if (TextUtils.isEmpty(str) || !str.startsWith(Constants.PREFIX_FILE)) {
            return str;
        }
        try {
            canonicalPath = new File(new URL(str).getPath()).getCanonicalPath();
        } catch (MalformedURLException e) {
            HwLog.e("FileHelper", "getCheckFileUrlPath MalformedURLException:" + HwLog.printException((Exception) e));
            canonicalPath = null;
        } catch (IOException e2) {
            HwLog.e("FileHelper", "getCheckFileUrlPath IOException:" + HwLog.printException((Exception) e2));
            canonicalPath = null;
        } catch (Exception e3) {
            HwLog.e("FileHelper", "getCheckFileUrlPath Exception:" + HwLog.printException(e3));
            canonicalPath = null;
        }
        return Constants.PREFIX_FILE + canonicalPath;
    }

    public static File e(String str) throws IOException {
        String strFilterFilePath = CommonUtils.filterFilePath(str);
        if (!TextUtils.isEmpty(strFilterFilePath)) {
            return new File(strFilterFilePath);
        }
        HwLog.w("FileHelper", "unzip dest dir path is empty.");
        throw new IOException("unzip this dest dir path is illegal.");
    }

    public static boolean f(File file) {
        return file != null && file.exists();
    }

    public static void g(File file) throws IOException {
        if (file.exists()) {
            HwLog.i("FileHelper", "deleteFile is = " + file.delete());
        }
        if (!file.getParentFile().exists()) {
            HwLog.i("FileHelper", "mkdirFile is = " + file.getParentFile().mkdirs());
        }
        if (file.isFile()) {
            return;
        }
        boolean zCreateNewFile = file.createNewFile();
        HwSfpPolicyManagerHelper.setDefaultCeLabel(file);
        HwLog.i("FileHelper", "createNewFile is = " + zCreateNewFile);
    }

    public static FileInputStream h(File file) throws IOException {
        if (file == null || !file.exists()) {
            throw new FileNotFoundException("File '" + file + "' does not exist");
        }
        if (file.isDirectory()) {
            throw new IOException("File '" + file + "' exists but is a directory");
        }
        if (file.canRead()) {
            return new FileInputStream(file);
        }
        throw new IOException("File '" + file + "' cannot be read");
    }

    public static boolean i(String str) {
        boolean z;
        if (TextUtils.isEmpty(str)) {
            HwLog.e("FileHelper", "isIllegalPath path is empty");
            return true;
        }
        String canonicalPath = null;
        try {
            canonicalPath = new File(str).getCanonicalPath();
            z = !FileUtil.filePathIsValidNew(canonicalPath);
        } catch (IOException e) {
            HwLog.e("FileHelper", "isIllegalPath IOException " + HwLog.printException((Exception) e));
            z = true;
        } catch (Exception e2) {
            HwLog.e("FileHelper", "isIllegalPath Exception " + HwLog.printException(e2));
            z = true;
        }
        if (!TextUtils.isEmpty(canonicalPath)) {
            return z;
        }
        HwLog.e("FileHelper", "isIllegalPath canonicalPath is empty");
        return true;
    }

    public static FileOutputStream openOutputStream(File file, boolean z) throws IOException {
        if (!file.exists()) {
            File parentFile = file.getParentFile();
            if (parentFile != null && !parentFile.mkdirs() && !parentFile.isDirectory()) {
                throw new IOException("Directory '" + parentFile + "' could not be created");
            }
        } else {
            if (file.isDirectory()) {
                throw new IOException("File '" + file + "' exists but is a directory");
            }
            if (!file.canWrite()) {
                throw new IOException("File '" + file + "' cannot be written to");
            }
        }
        return new FileOutputStream(file, z);
    }

    public static String sha256File(String str) {
        try {
            String strFileSHA256Encrypt = FileSHA256.fileSHA256Encrypt(new File(str));
            return TextUtils.isEmpty(strFileSHA256Encrypt) ? "" : strFileSHA256Encrypt.toUpperCase(Locale.US).trim();
        } catch (Exception unused) {
            HwLog.e("FileHelper", "sha256File Exception.");
            return "";
        }
    }

    public static File f(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return PversionSdUtils.getFile(str);
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x00cf: MOVE (r2 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:33:0x00ce */
    public static int c(String str, String str2) throws Throwable {
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream;
        ZipInputStream zipInputStream;
        ZipInputStream zipInputStream2;
        ZipInputStream zipInputStream3 = null;
        FileOutputStream fileOutputStreamOpenOutputStream = null;
        zipInputStream3 = null;
        try {
            try {
                fileInputStream = new FileInputStream(str);
                try {
                    byte[] bArr = new byte[2048];
                    zipInputStream = new ZipInputStream(fileInputStream);
                    try {
                        ZipEntry nextEntry = zipInputStream.getNextEntry();
                        int i = 0;
                        int iA = 0;
                        while (nextEntry != null) {
                            String strA = a(nextEntry.getName(), new File(str2));
                            HwLog.iBetaLog("FileHelper", "sanitzeFilename is : " + strA);
                            File file = new File(strA);
                            if (nextEntry.isDirectory()) {
                                HwLog.i("FileHelper", "mkdirFileSuc is = " + file.mkdirs());
                                nextEntry = zipInputStream.getNextEntry();
                            } else {
                                g(file);
                                fileOutputStreamOpenOutputStream = openOutputStream(file, false);
                                iA = a(iA, zipInputStream, fileOutputStreamOpenOutputStream, bArr);
                                zipInputStream.closeEntry();
                                nextEntry = zipInputStream.getNextEntry();
                                i++;
                                if (iA > 52428800) {
                                    HwLog.i("FileHelper", "this zip file too big ,unzip failure");
                                    a(zipInputStream, fileInputStream, fileOutputStreamOpenOutputStream);
                                    return -1;
                                }
                            }
                        }
                        HwLog.i("FileHelper", "unzip is complish" + i);
                        a(zipInputStream, fileInputStream, fileOutputStreamOpenOutputStream);
                        return i;
                    } catch (IOException e) {
                        e = e;
                        HwLog.i("FileHelper", "unzipForLocal IOException: " + HwLog.printException((Exception) e));
                        a(zipInputStream, fileInputStream, (FileOutputStream) null);
                        return -1;
                    }
                } catch (IOException e2) {
                    e = e2;
                    zipInputStream = null;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = null;
                    a(zipInputStream3, fileInputStream, fileOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
                zipInputStream3 = zipInputStream2;
            }
        } catch (IOException e3) {
            e = e3;
            fileInputStream = null;
            zipInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
            fileInputStream = null;
        }
    }

    public static boolean e(File file) {
        return f(file) && file.isDirectory();
    }

    public static Uri g(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file = new File(str);
        if (!file.exists()) {
            HwLog.w("FileHelper", "context is null or file is not exists");
            return null;
        }
        return d(file);
    }

    public static boolean h(String str) {
        return e(f(str));
    }

    public static int a(ZipInputStream zipInputStream, String str, String str2, boolean z) throws IOException {
        if (zipInputStream != null && !TextUtils.isEmpty(str)) {
            File fileE = e(str);
            boolean zIsEmpty = TextUtils.isEmpty(str2);
            try {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                byte[] bArr = new byte[2048];
                int i = 0;
                int iA = 0;
                while (nextEntry != null) {
                    if (!zIsEmpty && !str2.equals(nextEntry.getName())) {
                        nextEntry = zipInputStream.getNextEntry();
                    } else {
                        File fileA = a(nextEntry, fileE);
                        if (nextEntry.isDirectory()) {
                            HwLog.d("FileHelper", "unzip zipEntry isDirectoryMade :" + fileA.mkdirs());
                            nextEntry = zipInputStream.getNextEntry();
                        } else {
                            a(fileA, false, true);
                            iA = a(fileA, zipInputStream, iA, bArr);
                            if (iA > 52428800) {
                                HwLog.e("FileHelper", "unzip this zip file too big, unzip failure.");
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
                HwLog.i("FileHelper", "unzip accomplished amount:" + i);
                return i;
            } catch (IOException e) {
                if (z) {
                    a(!zIsEmpty, (File) null, fileE);
                }
                throw e;
            }
        }
        HwLog.w("FileHelper", "unzip zipInputStream or destDirectory is empty.");
        return -1;
    }

    public static Uri d(File file) {
        if (CommonUtils.o()) {
            try {
                Application applicationContext = Environment.getApplicationContext();
                return FileProvider.getUriForFile(applicationContext, applicationContext.getPackageName() + ".fileprovider", file);
            } catch (IllegalArgumentException e) {
                HwLog.e("FileHelper", "getFileUri IllegalArgumentException:" + HwLog.printException((Exception) e));
                return null;
            } catch (Exception e2) {
                HwLog.e("FileHelper", "getFileUri Exception:" + HwLog.printException(e2));
                return null;
            }
        }
        return Uri.fromFile(file);
    }

    public static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            HwLog.w("FileHelper", "deleteFile path is empty");
            return false;
        }
        return a(PversionSdUtils.getFile(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.io.Closeable[]] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.io.Closeable[]] */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.io.Closeable[]] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.io.Closeable[]] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    public static byte[] b(File file) throws Throwable {
        IOException e;
        FileNotFoundException e2;
        ByteArrayOutputStream byteArrayOutputStream;
        ?? r5 = 0;
        try {
            try {
                file = PversionSdUtils.a((File) file);
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int i = file.read(bArr);
                            if (i != -1) {
                                byteArrayOutputStream.write(bArr, 0, i);
                            } else {
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                PversionSdUtils.a((Closeable[]) new Closeable[]{file, byteArrayOutputStream});
                                return byteArray;
                            }
                        }
                    } catch (FileNotFoundException e3) {
                        e2 = e3;
                        HwLog.e("FileHelper", "fileToByte error " + HwLog.printException((Exception) e2));
                        PversionSdUtils.a((Closeable[]) new Closeable[]{file, byteArrayOutputStream});
                        return null;
                    } catch (IOException e4) {
                        e = e4;
                        HwLog.e("FileHelper", "fileToByte error " + HwLog.printException((Exception) e));
                        PversionSdUtils.a((Closeable[]) new Closeable[]{file, byteArrayOutputStream});
                        return null;
                    }
                } catch (FileNotFoundException e5) {
                    e2 = e5;
                    file = file;
                    byteArrayOutputStream = null;
                    HwLog.e("FileHelper", "fileToByte error " + HwLog.printException((Exception) e2));
                    PversionSdUtils.a((Closeable[]) new Closeable[]{file, byteArrayOutputStream});
                    return null;
                } catch (IOException e6) {
                    e = e6;
                    file = file;
                    byteArrayOutputStream = null;
                    HwLog.e("FileHelper", "fileToByte error " + HwLog.printException((Exception) e));
                    PversionSdUtils.a((Closeable[]) new Closeable[]{file, byteArrayOutputStream});
                    return null;
                } catch (Throwable th) {
                    th = th;
                    r5 = file;
                    PversionSdUtils.a((Closeable[]) new Closeable[]{r5, 0});
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (FileNotFoundException e7) {
            e2 = e7;
            file = 0;
        } catch (IOException e8) {
            e = e8;
            file = 0;
        } catch (Throwable th3) {
            th = th3;
            PversionSdUtils.a((Closeable[]) new Closeable[]{r5, 0});
            throw th;
        }
    }

    public static String c(File file) {
        if (file == null) {
            return "";
        }
        try {
            return file.getCanonicalPath();
        } catch (IOException e) {
            HwLog.e("FileHelper", "getCanonicalPath error!" + HwLog.printException((Exception) e));
            return "";
        } catch (Exception e2) {
            HwLog.e("FileHelper", "getCanonicalPath Exception!" + HwLog.printException(e2));
            return "";
        }
    }

    public static String b() {
        File filesDir;
        Context contextA = g0.a(Environment.getApplicationContext());
        if (contextA == null || (filesDir = contextA.getFilesDir()) == null) {
            return null;
        }
        return filesDir.getParent();
    }

    public static String c() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd-HHmmss", Locale.US);
        Date date = new Date(System.currentTimeMillis());
        Locale locale = Locale.ENGLISH;
        int i = f30602a;
        f30602a = i + 1;
        return String.format(locale, "WatchFace-%d-%s.jpg", Integer.valueOf(i), simpleDateFormat.format(date));
    }

    public static void a(boolean z, File file, File file2) {
        if (z) {
            if (file != null && file.exists() && file.isFile()) {
                HwLog.i("FileHelper", "deleteUnzipFailFile isDelete:" + a(file));
                return;
            }
            return;
        }
        if (file2.exists() && file2.isDirectory()) {
            HwLog.i("FileHelper", "deleteUnzipFailFile dir isDelete:" + a(file2));
        }
    }

    public static File a(ZipEntry zipEntry, File file) throws IOException {
        String strA = a(zipEntry.getName(), file);
        HwLog.iBetaLog("FileHelper", "getExtractFile:" + strA);
        String strFilterFilePath = CommonUtils.filterFilePath(strA);
        if (!TextUtils.isEmpty(strFilterFilePath)) {
            return new File(strFilterFilePath);
        }
        HwLog.w("FileHelper", "unzip this zip file dest path is illegal, unzip failure.");
        throw new IOException("unzip this zip file dest path is illegal.");
    }

    public static int a(File file, ZipInputStream zipInputStream, int i, byte[] bArr) {
        int i2;
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        while (true) {
            try {
                try {
                    int i3 = zipInputStream.read(bArr);
                    if (i3 <= -1 || (i2 = i + i3) > 52428800) {
                        break;
                        break;
                    }
                    fileOutputStream.write(bArr, 0, i3);
                    i = i2;
                } catch (IOException e) {
                    HwLog.e("FileHelper", "unzipSingleFile IOException.");
                    throw e;
                }
            } catch (Throwable th) {
                a(fileOutputStream);
                throw th;
            }
        }
        a(fileOutputStream);
        return i;
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
                HwLog.e("FileHelper", "closeStream IOException.");
            }
        }
    }

    public static boolean a(File file) {
        File[] fileArrListFiles;
        if (file == null) {
            HwLog.w("FileHelper", "file is null");
            return false;
        }
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                a(file2);
            }
        }
        try {
            boolean zDelete = file.delete();
            if (!zDelete) {
                StringBuilder sb = new StringBuilder();
                sb.append("delete fail, ");
                sb.append(file.isDirectory() ? "dir is " : "file is ");
                sb.append(file.getName());
                HwLog.w("FileHelper", sb.toString());
                return zDelete;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("delete success, ");
            sb2.append(file.isDirectory() ? "dir is " : "file is ");
            sb2.append(file.getName());
            FlavorConfig.safeHwLog("FileHelper", sb2.toString());
            return zDelete;
        } catch (SecurityException unused) {
            HwLog.e("FileHelper", "delete file SecurityException, " + file.getName());
            return false;
        }
    }

    public static String a(String str, File file) throws IOException {
        String canonicalPath = new File(file, str).getCanonicalPath();
        if (canonicalPath.startsWith(file.getCanonicalPath())) {
            return canonicalPath;
        }
        throw new IOException("File is outside extraction target directory.");
    }

    public static int a(int i, ZipInputStream zipInputStream, FileOutputStream fileOutputStream, byte[] bArr) throws IOException {
        int i2;
        int i3 = i;
        while (i + 2048 <= 52428800 && (i2 = zipInputStream.read(bArr, 0, 2048)) > -1) {
            fileOutputStream.write(bArr, 0, i2);
            i3 += i2;
        }
        return i3;
    }

    public static void a(ZipInputStream zipInputStream, InputStream inputStream, FileOutputStream fileOutputStream) {
        a(zipInputStream);
        a(inputStream);
        a(fileOutputStream);
    }

    public static int a(Context context, String str, Uri uri, String str2) throws Throwable {
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        ZipInputStream zipInputStream;
        if (i(str) || i(str2)) {
            return -1;
        }
        ZipInputStream zipInputStream2 = null;
        fileOutputStreamOpenOutputStream = null;
        fileOutputStreamOpenOutputStream = null;
        fileOutputStreamOpenOutputStream = null;
        zipInputStream2 = null;
        FileOutputStream fileOutputStreamOpenOutputStream = null;
        try {
            if (Build.VERSION.SDK_INT > 28) {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r");
                fileInputStream2 = parcelFileDescriptorOpenFileDescriptor != null ? new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()) : null;
            } else {
                fileInputStream2 = new FileInputStream(str);
            }
            try {
                if (fileInputStream2 == null) {
                    HwLog.e("FileHelper", "unzipForAndroidQ() zipFileStream is null.");
                    a((ZipInputStream) null, fileInputStream2, (FileOutputStream) null);
                    return -1;
                }
                byte[] bArr = new byte[2048];
                zipInputStream = new ZipInputStream(fileInputStream2);
                try {
                    ZipEntry nextEntry = zipInputStream.getNextEntry();
                    int i = 0;
                    int iA = 0;
                    while (nextEntry != null) {
                        String strA = a(nextEntry.getName(), str2);
                        HwLog.iBetaLog("FileHelper", "unzipForAndroidQ() sanitzeFilename is: " + strA);
                        File file = new File(strA);
                        if (nextEntry.isDirectory()) {
                            HwLog.i("FileHelper", "unzipForAndroidQ() mkdirFileSuc: " + file.mkdirs());
                            nextEntry = zipInputStream.getNextEntry();
                        } else {
                            g(file);
                            fileOutputStreamOpenOutputStream = openOutputStream(file, false);
                            iA = a(iA, zipInputStream, fileOutputStreamOpenOutputStream, bArr);
                            zipInputStream.closeEntry();
                            nextEntry = zipInputStream.getNextEntry();
                            i++;
                            if (iA > 52428800) {
                                HwLog.i("FileHelper", "unzipForAndroidQ() this zip file too big ,unzip failure");
                                a(zipInputStream, fileInputStream2, fileOutputStreamOpenOutputStream);
                                return -1;
                            }
                        }
                    }
                    a(zipInputStream, fileInputStream2, fileOutputStreamOpenOutputStream);
                    return i;
                } catch (IOException unused) {
                    try {
                        HwLog.e("FileHelper", "unzipForAndroidQ() IOException occured.");
                        a(zipInputStream, fileInputStream2, fileOutputStreamOpenOutputStream);
                        return -1;
                    } catch (Throwable th) {
                        th = th;
                        ZipInputStream zipInputStream3 = zipInputStream;
                        fileInputStream = fileInputStream2;
                        fileOutputStream = fileOutputStreamOpenOutputStream;
                        zipInputStream2 = zipInputStream3;
                        ZipInputStream zipInputStream4 = zipInputStream2;
                        fileOutputStreamOpenOutputStream = fileOutputStream;
                        fileInputStream2 = fileInputStream;
                        zipInputStream = zipInputStream4;
                        a(zipInputStream, fileInputStream2, fileOutputStreamOpenOutputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    a(zipInputStream, fileInputStream2, fileOutputStreamOpenOutputStream);
                    throw th;
                }
            } catch (IOException unused2) {
                zipInputStream = null;
                HwLog.e("FileHelper", "unzipForAndroidQ() IOException occured.");
                a(zipInputStream, fileInputStream2, fileOutputStreamOpenOutputStream);
                return -1;
            } catch (Throwable th3) {
                th = th3;
                fileInputStream = fileInputStream2;
                fileOutputStream = null;
                ZipInputStream zipInputStream5 = zipInputStream2;
                fileOutputStreamOpenOutputStream = fileOutputStream;
                fileInputStream2 = fileInputStream;
                zipInputStream = zipInputStream5;
                a(zipInputStream, fileInputStream2, fileOutputStreamOpenOutputStream);
                throw th;
            }
        } catch (IOException unused3) {
            fileInputStream2 = null;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
            fileInputStream = null;
        }
    }

    public static String a(String str, String str2) throws IOException {
        String canonicalPath = new File(str2, str).getCanonicalPath();
        if (canonicalPath.startsWith(new File(str2).getCanonicalPath())) {
            return canonicalPath;
        }
        throw new IllegalStateException("File is outside extraction target directory.");
    }

    public static File a(String... strArr) {
        if (strArr != null) {
            File file = null;
            for (String str : strArr) {
                if (file == null) {
                    file = new File(str);
                } else {
                    file = new File(file, str);
                }
            }
            return file;
        }
        throw new NullPointerException("names must not be null.");
    }

    public static void a(byte[] bArr, File file) {
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.close();
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            HwLog.e("FileHelper", "fileToByte error " + HwLog.printException((Exception) e));
        }
    }

    public static String a(String str, String str2, String str3, boolean z) throws Throwable {
        String str4;
        FileOutputStream fileOutputStreamB;
        HwLog.d("FileHelper", "getBase64FilePath fileName:" + str2);
        if (new File(str3 + File.separator + str2).exists() && z) {
            HwLog.d("FileHelper", "getBase64FilePath Exists.");
            return str3 + str2;
        }
        FileOutputStream fileOutputStream = null;
        str = null;
        String str5 = null;
        fileOutputStream = null;
        try {
            try {
                File file = PversionSdUtils.getFile(str3);
                if (!file.exists()) {
                    CommonUtils.d(file);
                }
                File file2 = PversionSdUtils.getFile(str3 + str2);
                byte[] bArrA = s.a(str);
                fileOutputStreamB = PversionSdUtils.b(file2);
                try {
                    fileOutputStreamB.write(bArrA);
                    str5 = str3 + str2;
                    HwSfpPolicyManagerHelper.setDefaultCeLabel(file2);
                } catch (IOException e) {
                    e = e;
                    str4 = str5;
                    fileOutputStream = fileOutputStreamB;
                    HwLog.d("FileHelper", "getBase64FilePath IOException:" + HwLog.printException((Exception) e));
                    fileOutputStreamB = fileOutputStream;
                    str5 = str4;
                } catch (Exception e2) {
                    e = e2;
                    str4 = str5;
                    fileOutputStream = fileOutputStreamB;
                    HwLog.d("FileHelper", "getBase64FilePath Exception:" + HwLog.printException(e));
                    fileOutputStreamB = fileOutputStream;
                    str5 = str4;
                } catch (Throwable th) {
                    th = th;
                    c0.a(fileOutputStreamB);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStreamB = null;
            }
        } catch (IOException e3) {
            e = e3;
            str4 = null;
        } catch (Exception e4) {
            e = e4;
            str4 = null;
        }
        c0.a(fileOutputStreamB);
        return str5;
    }

    public static void a(String str) {
        String strB = b();
        if (TextUtils.isEmpty(strB)) {
            HwLog.i("FileHelper", "deleteDeSpFile dataUserPath is empty");
            return;
        }
        StringBuilder sb = new StringBuilder(strB);
        String str2 = File.separator;
        sb.append(str2);
        sb.append("shared_prefs");
        sb.append(str2);
        sb.append(str);
        sb.append(WatchFaceConstant.XML_SUFFIX);
        FlavorConfig.safeHwLog("FileHelper", "deleteDeSpFile :" + ((Object) sb));
        File file = PversionSdUtils.getFile(sb.toString());
        if (!file.exists()) {
            HwLog.e("FileHelper", "deleteDeSpFile file is not exist :" + str);
        } else if (file.delete()) {
            HwLog.i("FileHelper", "deleteDeSpFile success:" + str);
        } else {
            HwLog.i("FileHelper", "deleteDeSpFile failed:" + str);
        }
    }

    public static void a() {
        Application applicationContext = Environment.getApplicationContext();
        if (applicationContext == null) {
            HwLog.e("FileHelper", "deleteAllFile context is null");
            return;
        }
        HwLog.i("FileHelper", "deleteAllFile enter");
        String strC = c(applicationContext.getFilesDir());
        StringBuilder sb = new StringBuilder();
        sb.append(strC);
        String str = File.separator;
        sb.append(str);
        sb.append("/watchfaceVideo/");
        b(sb.toString());
        b(strC + str + "/watchfacePhoto/");
        b(strC + str + WatchFaceConstant.WEAR_PREVIEW_ROOT_PATH);
        b(strC + str + WatchFaceConstant.ROOT_PATH_KALEIDOSCOPE);
        b(strC + str + "watchface");
        b(strC + str + "watchfaceSearchCache");
    }

    public static String a(Context context, ShareModel shareModel, String str) {
        File file = new File(android.os.Environment.getExternalStoragePublicDirectory(android.os.Environment.DIRECTORY_PICTURES), context.getPackageName());
        try {
            if (!file.exists()) {
                CommonUtils.d(file);
            }
            return a(shareModel.getShareImageStr(), str, file.getCanonicalPath(), false);
        } catch (IOException e) {
            HwLog.i("FileHelper", "saveToGallery IOException:" + HwLog.printException((Exception) e));
            return "";
        } catch (Exception e2) {
            HwLog.i("FileHelper", "saveToGallery exception:" + HwLog.printException(e2));
            return "";
        }
    }

    public static Uri a(Context context, ShareModel shareModel) throws Throwable {
        HwLog.i("FileHelper", "insertBitmapToGallery enter");
        Uri uri = Uri.EMPTY;
        String strC = c();
        String strA = a(shareModel.getShareImageStr(), strC, ChoosePicUtil.a(context), false);
        FlavorConfig.safeHwLog("FileHelper", "insertBitmapToGallery imagePath:" + strA);
        if (TextUtils.isEmpty(strA)) {
            HwLog.i("FileHelper", "insertBitmapToGallery imagePath or context is null");
            return uri;
        }
        try {
            String strInsertImage = MediaStore.Images.Media.insertImage(context.getContentResolver(), strA, strC, (String) null);
            FlavorConfig.safeHwLog("FileHelper", "insertBitmapToGallery insertImageString:" + strInsertImage);
            if (!TextUtils.isEmpty(strInsertImage)) {
                return Uri.parse(strInsertImage);
            }
        } catch (FileNotFoundException | IllegalArgumentException e) {
            HwLog.e("FileHelper", "insertBitmapToGallery:exception" + HwLog.printException(e));
        }
        return uri;
    }
}

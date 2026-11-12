package com.huawei.openalliance.ad.utils;

import android.content.Context;
import android.net.Uri;
import android.os.StatFs;
import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import com.huawei.android.hicloud.sync.util.FileUtil;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.db.bean.ContentResource;
import com.huawei.openalliance.ad.hw;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes12.dex */
public abstract class ai {
    private static void j(File file) {
        if (file == null) {
            return;
        }
        int i = 0;
        while (i < 10 && file != null && !de.a(h(file))) {
            i++;
            if (file.exists()) {
                hw.a(FileUtil.TAG, "current file exists");
                if (file.isFile()) {
                    a(file);
                    return;
                }
                return;
            }
            File parentFile = file.getParentFile();
            if (parentFile != null && TextUtils.equals(h(parentFile), h(file))) {
                hw.c(FileUtil.TAG, "parent file is the same as current");
                return;
            }
            file = parentFile;
        }
    }

    public static String i(File file) {
        FileInputStream fileInputStream;
        Object th;
        BufferedReader bufferedReader;
        if (!file.exists()) {
            hw.b(FileUtil.TAG, "local file not exist");
            return "";
        }
        StringBuilder sb = new StringBuilder("");
        try {
            fileInputStream = new FileInputStream(file);
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream, StandardCharsets.UTF_8));
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        sb.append(line);
                        sb.append(Constants.LINE_SEPARATOR);
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            hw.c(FileUtil.TAG, "read file error: %s", th.getClass().getSimpleName());
                        } finally {
                            df.a(bufferedReader);
                            df.a((Closeable) fileInputStream);
                        }
                    }
                }
                bufferedReader.close();
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = null;
            }
        } catch (Throwable th4) {
            fileInputStream = null;
            th = th4;
            bufferedReader = null;
        }
        return sb.toString().trim();
    }

    public static String h(File file) {
        if (file == null) {
            return null;
        }
        try {
            return file.getCanonicalPath();
        } catch (IOException e) {
            hw.d(FileUtil.TAG, "get path error, " + e.getClass().getSimpleName());
            return null;
        }
    }

    public static boolean g(File file) {
        if (file == null || file.mkdirs()) {
            return true;
        }
        j(file);
        return file.mkdirs();
    }

    public static boolean f(File file) {
        String str;
        if (file == null) {
            return false;
        }
        try {
            if (!file.exists() && file.createNewFile()) {
                return true;
            }
            if (file.delete() && file.createNewFile()) {
                return true;
            }
        } catch (IOException unused) {
            str = "reCreateFile IOException";
            hw.c(FileUtil.TAG, str);
        } catch (Exception unused2) {
            str = "reCreateFile Exception";
            hw.c(FileUtil.TAG, str);
        }
        return false;
    }

    public static void e(File file) {
        if (file == null || !file.exists()) {
            hw.a(FileUtil.TAG, "file is null or file in not exists");
            return;
        }
        if (!file.isFile()) {
            if (file.delete()) {
                return;
            }
            hw.c(FileUtil.TAG, "cannot delete file");
            return;
        }
        File file2 = new File(h(file) + "_delete");
        if (file.renameTo(file2)) {
            if (file2.delete()) {
                return;
            }
            hw.c(FileUtil.TAG, "fail to delete file");
        } else {
            if (file.delete()) {
                return;
            }
            hw.c(FileUtil.TAG, "fail to delete file");
        }
    }

    public static String e(String str) {
        return str.substring(str.lastIndexOf(".")).trim();
    }

    public static boolean d(File file) {
        return file.exists() && file.length() > 0;
    }

    public static boolean d(Context context, String str, String str2) {
        Object th;
        BufferedOutputStream bufferedOutputStream;
        Uri uri = Uri.parse(str);
        InputStream inputStream = null;
        try {
            if (as.b(context, uri)) {
                InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                try {
                    if (inputStreamOpenInputStream == null) {
                        hw.c(FileUtil.TAG, "get input stream failed: null.");
                        df.a((Closeable) inputStreamOpenInputStream);
                    } else {
                        File file = new File(str2);
                        if (file.exists()) {
                            file.delete();
                        }
                        file.getParentFile().mkdirs();
                        file.createNewFile();
                        bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(str2));
                        try {
                            byte[] bArr = new byte[2048];
                            while (true) {
                                int i = inputStreamOpenInputStream.read(bArr);
                                if (i == -1) {
                                    df.a((Closeable) inputStreamOpenInputStream);
                                    df.a(bufferedOutputStream);
                                    return true;
                                }
                                bufferedOutputStream.write(bArr, 0, i);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            inputStream = inputStreamOpenInputStream;
                            try {
                                hw.d(FileUtil.TAG, "copy style file exception:" + th.getClass().getSimpleName());
                                return false;
                            } finally {
                                df.a((Closeable) inputStream);
                                df.a(bufferedOutputStream);
                            }
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    bufferedOutputStream = null;
                }
            } else {
                hw.c(FileUtil.TAG, "invalid uri");
                df.a((Closeable) null);
            }
            df.a((Closeable) null);
            return false;
        } catch (Throwable th4) {
            th = th4;
            bufferedOutputStream = null;
        }
    }

    public static Long d(String str) {
        StringBuilder sb;
        try {
            return Long.valueOf(new StatFs(str).getTotalBytes());
        } catch (IllegalArgumentException e) {
            e = e;
            sb = new StringBuilder("getDiskTotalSpace ");
            sb.append(e.getClass().getSimpleName());
            hw.c(FileUtil.TAG, sb.toString());
            return null;
        } catch (Throwable th) {
            e = th;
            sb = new StringBuilder("getDiskTotalSpace ");
            sb.append(e.getClass().getSimpleName());
            hw.c(FileUtil.TAG, sb.toString());
            return null;
        }
    }

    public static boolean c(Context context, String str, String str2) {
        if (!com.huawei.openalliance.ad.dn.i(str)) {
            return d(new File(str));
        }
        if (dg.b(str2)) {
            str2 = "normal";
        }
        return com.huawei.openalliance.ad.dk.a(context, str2).g(str);
    }

    public static void c(File file) throws Throwable {
        RandomAccessFile randomAccessFile;
        String str;
        RandomAccessFile randomAccessFile2 = null;
        try {
            try {
                randomAccessFile = new RandomAccessFile(file, "rw");
                try {
                    long length = randomAccessFile.length();
                    randomAccessFile.setLength(1 + length);
                    randomAccessFile.setLength(length);
                    df.a(randomAccessFile);
                } catch (FileNotFoundException unused) {
                    randomAccessFile2 = randomAccessFile;
                    str = "fail to update modify time, file not exist";
                    hw.d(FileUtil.TAG, str);
                    df.a(randomAccessFile2);
                } catch (IOException unused2) {
                    randomAccessFile2 = randomAccessFile;
                    str = "fail to update modify time, read file exception";
                    hw.d(FileUtil.TAG, str);
                    df.a(randomAccessFile2);
                } catch (Throwable th) {
                    th = th;
                    df.a(randomAccessFile);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                randomAccessFile = null;
            }
        } catch (FileNotFoundException unused3) {
        } catch (IOException unused4) {
        }
    }

    public static String c(long j) {
        String strB = b(j);
        if (strB.endsWith(ExifInterface.GPS_DIRECTION_TRUE)) {
            return strB;
        }
        if (dg.b(strB) || !strB.endsWith("G")) {
            return "";
        }
        try {
            long j2 = Long.parseLong(strB.substring(0, strB.length() - 1));
            int iLog = (int) (Math.log(j2) / Math.log(2.0d));
            long jPow = (long) Math.pow(2.0d, iLog);
            if (j2 > jPow) {
                jPow = (long) Math.pow(2.0d, iLog + 1);
            }
            return jPow + "G";
        } catch (Throwable th) {
            hw.c(FileUtil.TAG, "getStorageSize " + th.getClass().getSimpleName());
            return "";
        }
    }

    public static Long c(String str) {
        StringBuilder sb;
        try {
            StatFs statFs = new StatFs(str);
            return Long.valueOf(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong());
        } catch (IllegalArgumentException e) {
            e = e;
            sb = new StringBuilder("getDiskFreeSpace ");
            sb.append(e.getClass().getSimpleName());
            hw.c(FileUtil.TAG, sb.toString());
            return null;
        } catch (Throwable th) {
            e = th;
            sb = new StringBuilder("getDiskFreeSpace ");
            sb.append(e.getClass().getSimpleName());
            hw.c(FileUtil.TAG, sb.toString());
            return null;
        }
    }

    public static boolean b(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return new File(str).exists();
        } catch (Exception unused) {
            hw.d(FileUtil.TAG, "check file exists error");
            return false;
        }
    }

    public static boolean b(File file, long j) {
        return file.exists() && file.length() > 0 && file.length() <= j;
    }

    public static boolean b(Context context, String str) {
        return com.huawei.openalliance.ad.dn.i(str) ? com.huawei.openalliance.ad.dk.a(context, "normal").f(str) : b(str);
    }

    public static void b(File file) {
        if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null && fileArrListFiles.length > 0) {
                for (File file2 : fileArrListFiles) {
                    if (file2.isDirectory()) {
                        b(file2);
                    } else {
                        a(file2);
                    }
                }
            }
            a(file);
        }
    }

    public static String b(long j) {
        StringBuilder sb;
        String str;
        try {
            if (j < 1024) {
                sb = new StringBuilder();
                sb.append(j);
                str = "B";
            } else {
                long jCeil = (long) Math.ceil((j * 1.0d) / 1024.0d);
                if (jCeil < 1024) {
                    sb = new StringBuilder();
                    sb.append(jCeil);
                    str = "K";
                } else {
                    long jCeil2 = (long) Math.ceil((jCeil * 1.0d) / 1024.0d);
                    if (jCeil2 < 1024) {
                        sb = new StringBuilder();
                        sb.append(jCeil2);
                        str = "M";
                    } else {
                        long jCeil3 = (long) Math.ceil((jCeil2 * 1.0d) / 1024.0d);
                        if (jCeil3 < 1024) {
                            sb = new StringBuilder();
                            sb.append(jCeil3);
                            str = "G";
                        } else {
                            long jCeil4 = (long) Math.ceil((jCeil3 * 1.0d) / 1024.0d);
                            sb = new StringBuilder();
                            sb.append(jCeil4);
                            str = ExifInterface.GPS_DIRECTION_TRUE;
                        }
                    }
                }
            }
            sb.append(str);
            return sb.toString();
        } catch (Throwable th) {
            hw.c(FileUtil.TAG, "getFileSize " + th.getClass().getSimpleName());
            return "";
        }
    }

    public static File b(Context context, String str, String str2) {
        if (com.huawei.openalliance.ad.dn.i(str)) {
            if (dg.b(str2)) {
                str2 = "normal";
            }
            str = com.huawei.openalliance.ad.dk.a(context, str2).c(str);
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return new File(str);
    }

    public static boolean a(String str, File file) {
        if (dg.b(str)) {
            return false;
        }
        return str.equalsIgnoreCase(db.a(file));
    }

    public static boolean a(File file, String str) {
        return a(file, new File(str));
    }

    public static boolean a(File file, File file2) {
        e(file2);
        return file.renameTo(file2);
    }

    public static boolean a(File file) {
        try {
            File file2 = new File(file.getCanonicalPath() + System.currentTimeMillis());
            if (file.renameTo(file2)) {
                return file2.delete();
            }
            return false;
        } catch (IOException unused) {
            hw.c(FileUtil.TAG, "deleteSingleFile IOException");
            return false;
        }
    }

    public static boolean a(Context context, File file, String str, String str2) {
        return a(context, file, str, null, str2);
    }

    public static boolean a(Context context, File file, String str, ContentResource contentResource, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (!com.huawei.openalliance.ad.dn.i(str)) {
            return a(file, str);
        }
        if (dg.b(str2)) {
            str2 = "normal";
        }
        return com.huawei.openalliance.ad.dk.a(context, str2).a(file, str, contentResource);
    }

    public static boolean a(long j, String str) {
        Long lC = c(str);
        return lC == null || j <= lC.longValue();
    }

    public static void a(String str, long j) {
        File[] fileArrListFiles;
        if (dg.b(str)) {
            return;
        }
        File file = new File(str);
        if (!file.isDirectory() || (fileArrListFiles = file.listFiles()) == null) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            if (file2.lastModified() + j < as.c()) {
                a(file2);
            }
        }
    }

    public static void a(String str) {
        if (dg.b(str)) {
            return;
        }
        b(new File(str));
    }

    public static void a(RandomAccessFile randomAccessFile) {
        if (randomAccessFile == null) {
            return;
        }
        try {
            randomAccessFile.close();
        } catch (Throwable th) {
            hw.c(FileUtil.TAG, "close file error: %s", th.getClass().getSimpleName());
        }
    }

    public static void a(File file, long j, List<File> list) {
        new ad().a(file, j, list);
    }

    public static void a(File file, long j) {
        a(file, j, (List<File>) null);
    }

    public static void a(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!com.huawei.openalliance.ad.dn.i(str)) {
            e(new File(str));
            return;
        }
        if (dg.b(str2)) {
            str2 = "normal";
        }
        com.huawei.openalliance.ad.dk.a(context, str2).j(str);
    }

    public static void a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        a(context, str, "normal");
    }

    public static String a(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        try {
            byte[] bArr = new byte[4];
            if (inputStream.read(bArr, 0, 4) > 0) {
                return ar.a(bArr);
            }
        } catch (IOException unused) {
            hw.d(FileUtil.TAG, "fail to read file header");
        }
        return null;
    }

    public static String a(Context context, long j) {
        if (context == null) {
            return "";
        }
        return context.getString(R.string.hiad_data_size_prompt, a(j));
    }

    static String a(long j) {
        float f = (j * 1.0f) / 1048576.0f;
        if (f < 0.1f) {
            f = 0.1f;
        }
        return String.format(Locale.getDefault(), "%.1f", Float.valueOf(f));
    }
}

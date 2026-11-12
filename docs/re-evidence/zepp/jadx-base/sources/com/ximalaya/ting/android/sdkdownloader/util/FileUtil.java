package com.ximalaya.ting.android.sdkdownloader.util;

import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import androidx.annotation.NonNull;
import com.ximalaya.ting.android.sdkdownloader.XmDownloadManager;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/* JADX INFO: loaded from: classes22.dex */
public class FileUtil {
    public static final int a = -1;

    private FileUtil() {
    }

    @NonNull
    private static File a(File file) {
        if (!file.exists()) {
            try {
                File parentFile = file.getParentFile();
                if (parentFile != null && !parentFile.exists()) {
                    parentFile.mkdirs();
                }
                file.createNewFile();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return file;
    }

    public static boolean checkDownloadPathSize(long j, String str) {
        long availableMemorySize = getAvailableMemorySize(new File(str));
        return availableMemorySize > 0 && j < availableMemorySize;
    }

    public static boolean copy(String str, String str2) throws Throwable {
        FileOutputStream fileOutputStream;
        File file = new File(str);
        if (!file.exists()) {
            return false;
        }
        File file2 = new File(str2);
        IOUtil.deleteFileOrDir(file2);
        File parentFile = file2.getParentFile();
        if (!parentFile.exists() && !parentFile.mkdirs()) {
            return false;
        }
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                fileOutputStream = new FileOutputStream(file2);
                try {
                    IOUtil.copy(fileInputStream2, fileOutputStream);
                    IOUtil.closeQuietly(fileInputStream2);
                    IOUtil.closeQuietly(fileOutputStream);
                    return true;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        IOUtil.closeQuietly(fileInputStream);
                        IOUtil.closeQuietly(fileOutputStream);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
            }
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
        }
    }

    public static Boolean existsSdcard() {
        return Boolean.valueOf(Environment.getExternalStorageState().equals("mounted"));
    }

    public static File fileIsExistCreate(String str) {
        return a(new File(str));
    }

    public static long getAvailableMemorySize(File file) {
        if (file == null) {
            return -1L;
        }
        try {
            if (!file.exists()) {
                return -1L;
            }
            StatFs statFs = new StatFs(file.getPath());
            int i = Build.VERSION.SDK_INT;
            return (i >= 18 ? statFs.getAvailableBlocksLong() : statFs.getAvailableBlocks()) * (i >= 18 ? statFs.getBlockSizeLong() : statFs.getBlockSize());
        } catch (Exception unused) {
            return -1L;
        }
    }

    public static File getCacheDir(String str) {
        File file;
        if (existsSdcard().booleanValue()) {
            File externalCacheDir = XmDownloadManager.getInstance().app().getExternalCacheDir();
            if (externalCacheDir == null) {
                file = new File(Environment.getExternalStorageDirectory(), "Android/data/" + XmDownloadManager.getInstance().app().getPackageName() + "/cache/" + str);
            } else {
                file = new File(externalCacheDir, str);
            }
        } else {
            file = new File(XmDownloadManager.getInstance().app().getCacheDir(), str);
        }
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    public static long getDiskAvailableSize() {
        if (!existsSdcard().booleanValue()) {
            return 0L;
        }
        StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getAbsolutePath());
        return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
    }

    public static long getFileOrDirSize(File file) {
        long fileOrDirSize = 0;
        if (!file.exists()) {
            return 0L;
        }
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                fileOrDirSize += getFileOrDirSize(file2);
            }
        }
        return fileOrDirSize;
    }

    public static boolean isDiskAvailable() {
        return getDiskAvailableSize() > 10485760;
    }
}
